"""Tests for live_client.py (3.12 plan): python test_live_client.py

BENCH-85 (profiles), BENCH-86 (client files), BENCH-87 (live page), BENCH-88 (report).
LiveToolsTest.java runs each class from the Maven build, which is where the IDs are traced.
"""

import os
import shutil
import struct
import tempfile
import time
import unittest
import urllib.parse
import zlib

import live_client as lc

HERE = os.path.dirname(os.path.abspath(__file__))
GOLDEN = os.path.join(HERE, "..", "..", "hadur-core", "src", "test", "resources", "profiles")
PAGE_311 = os.path.join(HERE, "..", "rumble", "pages", "2026-10-11T0223Z_roborumble_botdetails_hadur2.Hadur_3.11.mht")


def golden(v):
    with open(os.path.join(GOLDEN, f"v{v}.hp"), "rb") as f:
        return f.read()


def with_shield_verdict(data):
    """The golden v3 file with SHIELD-3's bit set and its CRC recomputed."""
    at = lc.decode_profile(data)["verdict_at"]
    b = bytearray(data)
    b[at] |= 2
    body = bytes(b[:-4])
    return body + struct.pack(">I", zlib.crc32(body) & 0xFFFFFFFF)


class ProfilesTest(unittest.TestCase):
    """BENCH-85: Hadur's profiles decoded as ProfileCodec reads them, with the stored verdicts."""

    def setUp(self):
        self.dir = tempfile.mkdtemp()

    def tearDown(self):
        shutil.rmtree(self.dir)

    def test_golden_files_decode(self):
        # ProfileCodecTest: Profiles.leadAware(Profiles.sample("abc.Shadow 3.83c", 42, 4, 2), true).
        p = lc.decode_profile(golden(3))
        self.assertEqual(p["key"], "abc.Shadow")
        self.assertEqual(p["last_name"], "abc.Shadow 3.83c")
        self.assertTrue(p["lead_aware"])
        self.assertFalse(p["shielder"])
        self.assertEqual((p["gun_seed"], p["surf_seed"]), (4, 2))
        self.assertFalse(lc.decode_profile(golden(2))["lead_aware"])
        self.assertEqual(lc.decode_profile(golden(1))["gun_seed"], 0, "version 1 seeds are dropped")

    def test_shield_verdict_is_read(self):
        self.assertTrue(lc.decode_profile(with_shield_verdict(golden(3)))["shielder"])

    def test_damage_is_rejected(self):
        b = bytearray(golden(3))
        b[20] ^= 0xFF
        with self.assertRaises(lc.FormatError):
            lc.decode_profile(bytes(b))
        with self.assertRaises(lc.FormatError):
            lc.decode_profile(golden(3)[:-1])

    def test_codec_limits_hold_on_a_valid_checksum(self):
        # A group of the wrong size, re-checksummed: ProfileCodec rejects it, so must this.
        p = lc.decode_profile(golden(3))
        b = bytearray(golden(3))
        # The first group (shots at us) follows the key, name, battles, rounds, lastFought and outcomes.
        at = 7 + 1 + 2 * len(p["key"]) + 1 + 2 * len(p["last_name"]) + 16 + 1 + 12 * len(p["outcomes"])
        self.assertEqual(b[at], 5)
        b[at] = 4
        body = bytes(b[:-4])
        with self.assertRaises(lc.FormatError):
            lc.decode_profile(body + struct.pack(">I", zlib.crc32(body) & 0xFFFFFFFF))

    def test_folder_keeps_newest_version_and_counts(self):
        def put(name, data):
            with open(os.path.join(self.dir, name), "wb") as f:
                f.write(data)
        put("abc.Shadow-1-v2.hp", golden(2))
        put("abc.Shadow-1-v3.hp", with_shield_verdict(golden(3)))
        put("b.Other-2-v3.hp", golden(3))
        put("c.Broken-3-v3.hp", b"HPnope")
        put("b.Other-2-v3.hp.tmp", golden(3))
        put("health.hc", b"HEALTH,35,35,0,0,0,0")
        rows = lc.read_profiles(self.dir)
        self.assertEqual([r["file"] for r in rows], ["abc.Shadow-1-v3.hp", "b.Other-2-v3.hp", "c.Broken-3-v3.hp"])
        s = lc.profiles_summary(rows)
        self.assertEqual((s["files"], s["damaged"], s["shielders"], s["lead_aware"]), (3, 1, 1, 2))


RESULTS = """roborumble,35,800x600,leigh,1760166000000,SERVER
hadur2.Hadur 3.11,4400,1900,35
stelo.MirrorMicro 1.1,600,520,0
roborumble,35,800x600,leigh,1760166100000,SERVER
a.Other 1.0,3000,1000,20
b.Other 2.0,2000,900,15
roborumble,35,800x600,leigh,1760166200000,SERVER
non.mega.NaN 0.1,3000,1200,4
hadur2.Hadur 3.11,1000,500,31
"""


class ClientFilesTest(unittest.TestCase):
    """BENCH-86: the client's results files and Hadur's health record, harvested once each."""

    def setUp(self):
        self.client = tempfile.mkdtemp()
        os.makedirs(os.path.join(self.client, "roborumble", "temp"))
        with open(os.path.join(self.client, "roborumble", "roborumble.txt"), "w") as f:
            f.write("USER=leigh\nOUTPUT=./roborumble/temp/battleresults.txt\n")
        self.results = os.path.join(self.client, "roborumble", "temp", "battleresults.txt")
        self.data = os.path.join(self.client, "robots", ".data", "hadur2", "Hadur.data")
        os.makedirs(self.data)
        self.out = tempfile.mkdtemp()
        self.lines = []

    def tearDown(self):
        shutil.rmtree(self.client)
        shutil.rmtree(self.out)

    def test_results_parse_hadur_side(self):
        rows = [lc.battle_row(b, "c") for b in lc.parse_results(RESULTS)]
        self.assertIsNone(rows[1], "a battle without Hadur is not kept")
        self.assertEqual(rows[0]["opponent"], "stelo.MirrorMicro 1.1")
        self.assertAlmostEqual(rows[0]["share"], 88.0)
        self.assertEqual((rows[0]["won"], rows[0]["lost"]), (35, 0))
        # Hadur second in the file: still Hadur's side.
        self.assertEqual(rows[2]["hadur"], "hadur2.Hadur 3.11")
        self.assertAlmostEqual(rows[2]["share"], 25.0)
        self.assertEqual((rows[2]["won"], rows[2]["lost"]), (31, 4))

    def test_config_names_the_results_file(self):
        self.assertEqual(lc.client_results_files(self.client), [os.path.normpath(self.results)])

    def test_watch_keeps_each_battle_once_across_uploads_and_restarts(self):
        w = lc.Watch([self.client], self.out, log=self.lines.append)
        with open(self.results, "w") as f:
            f.write(RESULTS)
        self.assertEqual(len(w.poll_results()), 2)
        self.assertEqual(len(w.poll_results()), 0, "the same file read again adds nothing")
        os.remove(self.results)  # the upload deletes it
        self.assertEqual(len(w.poll_results()), 0)
        again = lc.Watch([self.client], self.out, log=self.lines.append)
        with open(self.results, "w") as f:
            f.write(RESULTS)  # unuploaded results copied back
        self.assertEqual(len(again.poll_results()), 0, "a restarted watch remembers battles.tsv")
        self.assertTrue(any("LOW" in l for l in self.lines), "the 25% battle is called out")

    def test_watch_keeps_only_the_named_versions(self):
        w = lc.Watch([self.client], self.out, log=self.lines.append, robots=["hadur2.Hadur 3.17"])
        with open(self.results, "w") as f:
            f.write(RESULTS)
        self.assertEqual(w.poll_results(), [], "3.11 battles stay out of a 3.17 watch")
        w = lc.Watch([self.client], self.out, log=self.lines.append, robots=["hadur2.Hadur 3.11"])
        self.assertEqual(len(w.poll_results()), 2)

    def save_page(self, nan_pairing):
        os.makedirs(os.path.join(self.out, "pages"), exist_ok=True)
        with open(os.path.join(self.out, "pages", "2026-10-26T170000Z_roborumble_hadur2.Hadur_3.11.html"), "w") as f:
            f.write(fake_page([("stelo.MirrorMicro 1.1", "90.00", 3, "t"), ("non.mega.NaN 0.1", nan_pairing, 3, "t")]))

    def test_a_collapse_is_measured_against_its_pairing(self):
        with open(self.results, "w") as f:
            f.write(RESULTS)
        self.save_page("30.00")
        w = lc.Watch([self.client], self.out, log=self.lines.append)
        w.poll_results()
        self.assertEqual((w.duels, w.collapses), (2, 0), "25% against a pairing at 30 is that robot's level")
        self.save_page("60.00")
        again = lc.Watch([self.client], self.out, log=self.lines.append)
        self.assertEqual((again.duels, again.collapses), (2, 1), "35 under its pairing; a restart counts battles.tsv")
        self.assertIn("non.mega.NaN 0.1 | 25.0 | 60.0", lc.report(self.out))

    def test_a_collapse_is_inclusive_and_skips_a_bad_newer_page(self):
        with open(self.results, "w") as f:
            f.write(RESULTS)
        self.save_page("40.00")  # 25 is exactly 15 under
        with open(os.path.join(self.out, "pages", "2026-10-26T180000Z_roborumble_hadur2.Hadur_3.11.html"), "w") as f:
            f.write("<html>rate limited</html>")
        w = lc.Watch([self.client], self.out, log=self.lines.append)
        w.poll_results()
        self.assertEqual(w.collapses, 1)

    def test_a_late_page_rescores_battles_already_kept(self):
        with open(self.results, "w") as f:
            f.write(RESULTS)
        w = lc.Watch([self.client], self.out, pages=["roborumble:hadur2.Hadur 3.11"], log=self.lines.append)
        w.poll_results()
        self.assertEqual((w.duels, w.collapses), (2, 0), "no page yet: nothing to score against")
        w.poll_pages(fetcher=lambda url: fake_page([("non.mega.NaN 0.1", "60.00", 3, "t")]))
        self.assertEqual(w.collapses, 1, "the first good page scores the battle kept before it")

    def test_a_watch_keeps_only_battles_after_its_first_start(self):
        with open(self.results, "w") as f:
            f.write(RESULTS)  # 2025 battles, before the watch
        since = lc.first_start(self.out)
        self.assertEqual(lc.first_start(self.out), since, "a restart keeps the first start")
        w = lc.Watch([self.client], self.out, log=self.lines.append, since=since)
        self.assertEqual(w.poll_results(), [])

    def test_a_reused_folder_counts_and_reports_only_battles_since_its_start(self):
        with open(self.results, "w") as f:
            f.write(RESULTS)
        lc.Watch([self.client], self.out, log=self.lines.append).poll_results()  # an earlier watch
        self.save_page("60.00")
        w = lc.Watch([self.client], self.out, log=self.lines.append, since=lc.first_start(self.out))
        self.assertEqual((w.duels, w.collapses), (0, 0))
        self.assertNotIn("NaN", lc.report(self.out))

    def test_watch_stops_on_its_collapse_count(self):
        with open(self.results, "w") as f:
            f.write(RESULTS)
        self.save_page("60.00")
        self.assertEqual(lc.main(["watch", "--client", self.client, "--out", self.out,
                                  "--stop-collapses", "1", "--every", "0.05", "--grace", "0.2",
                                  "--hours", "0.01"]), 0)
        with open(os.path.join(self.out, "watch.log")) as f:
            log = f.read()
        self.assertIn("done: 2 1v1 battles, 1 collapses", log)
        self.assertIn("<< COLLAPSE", log)
        self.assertEqual(log.count("done:"), 1, "the grace polling does not stop twice")

    def test_watch_ends_cleanly_on_a_stop_file(self):
        open(os.path.join(self.out, "STOP"), "w").close()
        self.assertEqual(lc.main(["watch", "--client", self.client, "--out", self.out,
                                  "--every", "0.05", "--grace", "0", "--hours", "0.01"]), 0)
        with open(os.path.join(self.out, "watch.log")) as f:
            self.assertIn("done (STOP file): 0 1v1 battles", f.read())

    def test_health_record_names_its_opponent_and_verdict(self):
        self.assertEqual(lc.parse_health("HEALTH,35,33,2,7,0,3100000")["skipped"], 7)
        self.assertIsNone(lc.parse_health("garbage"))
        health = os.path.join(self.data, "health.hc")
        with open(health, "w") as f:
            f.write("HEALTH,35,35,0,0,0,0")
        w = lc.Watch([self.client], self.out, log=self.lines.append)
        self.assertEqual(w.poll_health(), [], "the record found at start is from before the watch")
        prof = os.path.join(self.data, "abc.Shadow-1-v3.hp")
        old = os.path.join(self.data, "b.Old-2-v3.hp")
        with open(prof, "wb") as f:
            f.write(with_shield_verdict(golden(3)))
        with open(old, "wb") as f:
            f.write(golden(3))
        with open(health, "w") as f:
            f.write("HEALTH,35,22,0,12,0,2500000")
        t = time.time() + 10
        os.utime(health, (t, t))
        os.utime(prof, (t - 1, t - 1))
        os.utime(old, (t - 3600, t - 3600))
        rows = w.poll_health()
        self.assertEqual(len(rows), 1)
        self.assertEqual((rows[0]["opponent_key"], rows[0]["shielder"], rows[0]["skipped"]), ("abc.Shadow", 1, 12))
        self.assertEqual(w.poll_health(), [], "an unchanged record is not read twice")

    def test_start_up_fields_go_to_their_own_file(self):
        # RES-15: the three optional fields; an older record parses with None for them.
        rec = lc.parse_health("HEALTH,35,34,0,140,0,-1,612,105,104")
        self.assertEqual((rec["skipped"], rec["setup_ms"], rec["first_turn"], rec["max_skip_run"]), (140, 612, 105, 104))
        self.assertIsNone(lc.parse_health("HEALTH,35,35,0,0,0,0")["setup_ms"])
        w = lc.Watch([self.client], self.out, log=self.lines.append)
        with open(os.path.join(self.data, "health.hc"), "w") as f:
            f.write("HEALTH,35,34,0,140,0,-1,612,105,104")
        rows = w.poll_health()
        self.assertEqual(len(rows), 1)
        startup = lc.read_tsv(os.path.join(self.out, "startup.tsv"))
        self.assertEqual([(r["setup_ms"], r["first_turn"], r["max_skip_run"]) for r in startup], [("612", "105", "104")])
        health = lc.read_tsv(os.path.join(self.out, "health.tsv"))
        self.assertEqual(list(health[0].keys()), lc.HEALTH_COLUMNS, "health.tsv keeps its columns")
        self.assertTrue(any("START-UP DISABLE?" in l for l in self.lines))
        with open(os.path.join(self.data, "health.hc"), "w") as f:
            f.write("HEALTH,35,35,0,0,0,0")
        t = time.time() + 10
        os.utime(os.path.join(self.data, "health.hc"), (t, t))
        w.poll_health()
        self.assertEqual(len(lc.read_tsv(os.path.join(self.out, "startup.tsv"))), 1, "an older record adds no start-up row")

    def test_first_record_written_during_the_watch_is_kept(self):
        w = lc.Watch([self.client], self.out, log=self.lines.append)  # no health.hc yet
        self.assertEqual(w.poll_health(), [])
        with open(os.path.join(self.data, "health.hc"), "w") as f:
            f.write("HEALTH,35,34,0,3,0,0")
        rows = w.poll_health()
        self.assertEqual([r["skipped"] for r in rows], [3], "Hadur's first battle on a fresh client counts")

    def test_melee_battles_are_pair_records(self):
        # dumpResults writes one header and two robots for each pair that includes a dumped bot.
        melee = ("meleerumble,35,1000x1000,leigh,1760166300000,SERVER\n"
                 "a.First 1,3000,1000,10\nhadur2.Hadur 3.11,2000,900,8\n"
                 "meleerumble,35,1000x1000,leigh,1760166300000,SERVER\n"
                 "hadur2.Hadur 3.11,2000,900,8\nc.Third 1,1000,400,2\n"
                 "meleerumble,35,1000x1000,leigh,1760166300000,SERVER\n"
                 "a.First 1,3000,1000,10\nc.Third 1,1000,400,2\n")
        rows = [r for r in (lc.battle_row(b, "c") for b in lc.parse_results(melee)) if r]
        self.assertEqual([(r["opponent"], r["share"]) for r in rows], [("a.First 1", 40.0), ("c.Third 1", 66.67)])
        self.assertEqual(len({r["key"] for r in rows}), 2, "each pair is its own battle record")


def fake_page(rows, aps="87.56", battles=4306):
    body = "".join(
        f"<tr><td>{i}</td><td></td><td>{n}</td><td>compare</td><td>{a}</td><td>±1</td><td>{a}</td>"
        f"<td>99</td><td>0</td><td>{b}</td><td>{t}</td><td>50</td><td>50</td></tr>"
        for i, (n, a, b, t) in enumerate(rows, 1))
    return (f"<html>APS {aps} APS CI ±0.13 PWIN 99.42 ANPP 90.82 Vote 1.07 Survival 95.05 "
            f"Pairings {len(rows)} Battles {battles}<table>{body}</table></html>")


class PageTest(unittest.TestCase):
    """BENCH-87: each newly uploaded battle's score inferred from two pages."""

    def test_new_battles_score_from_mean_and_count(self):
        old = {"a 1": (90.0, 2, "t1"), "b 1": (80.0, 3, "t1"), "c 1": (70.0, 1, "t1")}
        new = {"a 1": (60.0, 3, "t2"), "b 1": (82.0, 4, "t2"), "c 1": (70.0, 1, "t1"), "d 1": (95.0, 1, "t3")}
        ev = {e["opponent"]: e for e in lc.page_events(old, new)}
        self.assertEqual(set(ev), {"a 1", "b 1", "d 1"}, "an unchanged pairing has no event")
        self.assertAlmostEqual(ev["a 1"]["inferred_score"], 0.0)  # 60*3 - 90*2
        self.assertEqual(ev["a 1"]["flag"], "DROP")
        self.assertAlmostEqual(ev["b 1"]["inferred_score"], 88.0)
        self.assertEqual(ev["b 1"]["flag"], "")
        self.assertEqual((ev["d 1"]["new_battles"], ev["d 1"]["pairing_before"]), (1, ""))

    def test_header_from_saved_page(self):
        head, rows = lc.load_page(PAGE_311)
        self.assertEqual((head["aps"], head["pairings"], head["battles"]), (87.56, 1216, 4306))
        self.assertGreater(len(rows), 1200)

    def test_watch_saves_pages_and_logs_drops(self):
        out = tempfile.mkdtemp()
        try:
            pages = iter([fake_page([("x.A 1", "90.00", 2, "t1")]),
                          fake_page([("x.A 1", "70.00", 3, "t2")], aps="87.40", battles=4307)])
            lines = []
            w = lc.Watch([], out, pages=["roborumble:hadur2.Hadur 3.11"], log=lines.append)
            w.poll_pages(fetcher=lambda url: next(pages))
            time.sleep(1.1)  # page files are named by the second
            w.poll_pages(fetcher=lambda url: next(pages))
            ev = lc.read_tsv(os.path.join(out, "page_events.tsv"))
            self.assertEqual(len(ev), 1)
            self.assertAlmostEqual(float(ev[0]["inferred_score"]), 30.0)
            self.assertEqual(len(lc.read_tsv(os.path.join(out, "page.tsv"))), 2)
            self.assertTrue(any("DROP x.A 1" in l for l in lines))

            def down(url):
                raise OSError("offline")
            w.poll_pages(fetcher=down)
            self.assertIn("offline", lines[-1], "a network failure is logged, not raised")
        finally:
            shutil.rmtree(out)

    def test_two_robots_on_one_ladder_keep_their_own_history(self):
        out = tempfile.mkdtemp()
        try:
            pages = {"A": [fake_page([("x.A 1", "90.00", 2, "t1")]), fake_page([("x.A 1", "90.00", 3, "t2")])],
                     "B": [fake_page([("x.A 1", "40.00", 2, "t1")]), fake_page([("x.A 1", "40.00", 3, "t2")])]}

            def fetcher(url):
                return pages["A" if "3.11" in urllib.parse.unquote(url) else "B"].pop(0)
            specs = ["roborumble:hadur2.Hadur 3.11", "roborumble:hadur2.Hadur 3.12"]
            lc.Watch([], out, pages=specs, log=lambda l: None).poll_pages(fetcher=fetcher)
            time.sleep(1.1)
            # A restarted watch must compare each robot's page with its own last snapshot.
            lc.Watch([], out, pages=specs, log=lambda l: None).poll_pages(fetcher=fetcher)
            ev = lc.read_tsv(os.path.join(out, "page_events.tsv"))
            self.assertEqual(sorted(float(e["inferred_score"]) for e in ev), [40.0, 90.0])
            self.assertEqual(len(os.listdir(os.path.join(out, "pages"))), 4)
        finally:
            shutil.rmtree(out)


class ReportTest(unittest.TestCase):
    """BENCH-88: battles joined to their health records, and the summary."""

    def test_join_and_report(self):
        out = tempfile.mkdtemp()
        try:
            lc.append_tsv(os.path.join(out, "battles.tsv"), lc.BATTLE_COLUMNS, [
                dict(utc="2026-10-11T08:00:30Z", game="roborumble", client="c", hadur="hadur2.Hadur 3.11",
                     opponent="stelo.MirrorMicro 1.1", share=32.0, rounds=35, won=22, lost=13, key="1"),
                dict(utc="2026-10-11T08:10:00Z", game="roborumble", client="c", hadur="hadur2.Hadur 3.11",
                     opponent="b.Other 2.0", share=95.0, rounds=35, won=35, lost=0, key="2"),
                dict(utc="2026-10-11T08:20:00Z", game="meleerumble", client="c", hadur="hadur2.Hadur 3.11",
                     opponent="m.Melee 1", share=40.0, rounds=35, won=5, lost=3, key="3")])
            lc.append_tsv(os.path.join(out, "health.tsv"), lc.HEALTH_COLUMNS, [
                dict(utc="2026-10-11T08:00:28Z", folder="d", rounds=35, survived=22, faults=0, skipped=3,
                     memory_failures=0, allowance_us=3000, opponent_key="stelo.MirrorMicro", shielder=1),
                dict(utc="2026-10-11T08:09:58Z", folder="d", rounds=35, survived=35, faults=0, skipped=0,
                     memory_failures=0, allowance_us=3000, opponent_key="b.Other", shielder=0)])
            battles = lc.read_tsv(os.path.join(out, "battles.tsv"))
            joined = lc.join_health(battles, lc.read_tsv(os.path.join(out, "health.tsv")))
            self.assertEqual(len(joined), 2, "melee battles are not joined")
            self.assertEqual(joined[0][1]["opponent_key"], "stelo.MirrorMicro")
            text = lc.report(out)
            self.assertIn("| 2026-10-11T08:00:30Z | stelo.MirrorMicro 1.1 | 32.0 | 22-13 | 3 | 1 |", text)
            self.assertIn("2 of 2 1v1 battles joined", text)
            self.assertIn("| meleerumble | 1 |", text)
            summary = ["utc", "folder", "files", "damaged", "shielders", "lead_aware", "seeded"]
            lc.append_tsv(os.path.join(out, "profiles.tsv"), summary, [
                dict(utc="t1", folder="pc1", files=10, damaged=0, shielders=1, lead_aware=0, seeded=0),
                dict(utc="t1", folder="pc2", files=20, damaged=0, shielders=2, lead_aware=0, seeded=0),
                dict(utc="t2", folder="pc1", files=11, damaged=0, shielders=3, lead_aware=0, seeded=0)])
            text = lc.report(out)
            self.assertIn("- pc1 at t2: 11 profiles, 3 with a stored", text)
            self.assertIn("- pc2 at t1: 20 profiles, 2 with a stored", text)
        finally:
            shutil.rmtree(out)




class FakeProc:
    def __init__(self, pid):
        self.pid, self.returncode, self.killed = pid, None, False

    def poll(self):
        return self.returncode


class ClientsTest(unittest.TestCase):
    """BENCH-121: the clients run under the watch, each console in its own file per start, and
    each is restarted on schedule at its first battle end, or counted as cut after the wait."""

    def setUp(self):
        self.root = tempfile.mkdtemp()
        self.out = os.path.join(self.root, "out")
        self.now = 1793080000.0
        self.procs = []
        for name in ("rr01", "robocode"):
            os.makedirs(os.path.join(self.root, name, "roborumble", "files"))
            for game, res in (("roborumble", "results1v1"), ("meleerumble", "resultsmelee")):
                with open(os.path.join(self.root, name, "roborumble", f"{game}.txt"), "w") as f:
                    f.write(f"OUTPUT=./roborumble/files/{res}.txt\n")

    def tearDown(self):
        shutil.rmtree(self.root)

    def spawn(self, launcher, cwd, console):
        p = FakeProc(len(self.procs) + 100)
        self.procs.append((p, launcher, cwd, console))
        return p

    def kill(self, proc):
        proc.killed, proc.returncode = True, -9

    def clients(self, *specs):
        launches = [lc.parse_launch(s, self.root) for s in specs]
        return lc.Clients(launches, self.out, 900, 600, log=lambda line: None, spawn=self.spawn,
                          kill=self.kill, clock=lambda: self.now)

    def events(self):
        return [(e["client"], e["event"]) for e in lc.read_tsv(os.path.join(self.out, "client-events.tsv"))]

    def finish_battle(self, folder, res="results1v1"):
        with open(os.path.join(self.root, folder, "roborumble", "files", f"{res}.txt"), "a") as f:
            f.write("line\n")

    def test_a_launch_names_its_folder_and_launcher(self):
        label, folder, launcher = lc.parse_launch("rr01:roborumble.bat", self.root)
        self.assertEqual(("rr01-roborumble", os.path.join(self.root, "rr01"), "roborumble.bat"),
                         (label, folder, launcher))
        label, _, launcher = lc.parse_launch("C:/robocode:meleerumble.bat", "C:/RoboRumbleWorkers")
        self.assertEqual(("robocode-meleerumble", "meleerumble.bat"), (label, launcher),
                         "a Windows folder keeps its drive colon")
        with self.assertRaises(ValueError):
            lc.parse_launch("rr01", self.root)

    def test_each_start_gets_its_own_console_and_only_hadur_lines_count(self):
        c = self.clients("rr01:roborumble.bat")
        c.start_all()
        self.assertEqual([("rr01-roborumble", "start")], self.events())
        console = self.procs[0][3]
        console.write(b"Fighting battle 3 ... hadur2.Hadur 3.17,sample.Crazy\n")
        console.write(b"SYSTEM: hadur2.Hadur 3.17 has not performed any actions in a reasonable amount of time\n")
        console.write(b"Unable to stop thread: other.Bot 1.0\nUnable to stop thread: hadur2.Hadur 3.17\n")
        console.write(b"SYSTEM: hadur2.Hadur 3.17 skipped turn 51")  # no newline yet
        c.poll()
        self.assertEqual(["start", "idle", "unstoppable"], [e for _, e in self.events()])
        console.write(b"\n")
        c.poll()
        self.assertEqual("skipped", self.events()[-1][1], "a line is counted once it is complete")
        self.assertEqual(1, len(os.listdir(os.path.join(self.out, "consoles"))))
        c.stop_all()

    def test_a_due_restart_waits_for_the_next_battle_end(self):
        c = self.clients("rr01:roborumble.bat", "robocode:meleerumble.bat")
        c.start_all()
        self.now += 900
        c.poll()
        self.now += 60
        self.finish_battle("rr01", "resultsmelee")  # another game's file: not this client's battle
        c.poll()
        self.assertEqual(2, len(self.procs), "nothing restarts before its battle ends")
        self.finish_battle("rr01")
        c.poll()
        self.assertTrue(self.procs[0][0].killed)
        self.assertEqual(3, len(self.procs))
        self.assertIn(("rr01-roborumble", "stop after battle"), self.events())
        self.assertIn(("rr01-roborumble", "restart"), self.events())
        self.assertFalse(self.procs[1][0].killed, "the melee client is still in its battle")
        self.now += 600
        c.poll()
        self.assertIn(("robocode-meleerumble", "stop cut"), self.events())
        self.assertEqual(4, len(os.listdir(os.path.join(self.out, "consoles"))), "a console file per start")
        c.stop_all()

    def test_an_exited_client_is_started_again_and_all_stop_at_the_end(self):
        c = self.clients("rr01:roborumble.bat")
        c.start_all()
        self.procs[0][0].returncode = 1
        c.poll()
        self.assertEqual([("rr01-roborumble", "start"), ("rr01-roborumble", "exited"),
                          ("rr01-roborumble", "start after exit")], self.events())
        c.stop_all()
        self.assertTrue(self.procs[1][0].killed)
        self.assertEqual("stop at end", self.events()[-1][1])

    def test_the_report_counts_events_and_skips_by_uptime(self):
        c = self.clients("rr01:roborumble.bat")
        c.start_all()
        start = self.now
        lc.append_tsv(os.path.join(self.out, "battles.tsv"), lc.BATTLE_COLUMNS, [
            {"utc": lc.utc_of(start + m * 60), "game": "roborumble", "client": "rr01", "hadur": "hadur2.Hadur 3.17",
             "opponent": "a.Bot 1.0", "share": "90.0", "rounds": "35", "won": "30", "lost": "5", "key": f"k{m}"}
            for m in (2, 12)])
        lc.append_tsv(os.path.join(self.out, "health.tsv"), lc.HEALTH_COLUMNS, [
            {"utc": lc.utc_of(start + m * 60), "folder": "x", "rounds": 35, "survived": 35, "faults": 0,
             "skipped": sk, "memory_failures": 0, "allowance_us": 3000, "opponent_key": "a.Bot",
             "shielder": 0, "lead_aware": 0, "profile_battles": 1} for m, sk in ((2, 3), (12, 40))])
        c.event("rr01-roborumble", "unstoppable", "Unable to stop thread: hadur2.Hadur 3.17")
        text = lc.report(self.out)
        self.assertIn("## Clients (BENCH-121)", text)
        self.assertIn("| rr01-roborumble | 1 | 0 | 0 | 0 | 0 | 1 | 0 |", text)
        self.assertIn("| 0-5 | 1 | 3.0 | 90.00 |", text)
        self.assertIn("| 10-15 | 1 | 40.0 | 90.00 |", text)
        self.assertIn("unstoppable: Unable to stop thread", text)
        c.stop_all()


if __name__ == "__main__":
    unittest.main()
