#!/usr/bin/env python3
"""Watch a live RoboRumble client and the live rankings page for Hadur (3.12 plan).

    python3 data/tools/live_client.py watch --client DIR [--client DIR ...] --out DIR
        [--page "roborumble:hadur2.Hadur 3.11" ...] [--every 5] [--page-every 900]
        [--profiles-every 3600] [--hours 0] [--data DIR ...]
    python3 data/tools/live_client.py profiles DIR [--out TSV]
    python3 data/tools/live_client.py page-diff OLD NEW
    python3 data/tools/live_client.py report OUT [--md FILE]

DIR is a RoboRumble client's Robocode folder (the one holding roborumble.bat). OUT is the
folder a watch writes into; it can be stopped and started again on the same OUT.

profiles (BENCH-85): decodes every Hadur profile (*-vN.hp) in a data folder, with the same
checks as ProfileCodec.decode: opponent key, battles, rounds, the last outcomes, ADAPT-5's
lead-aware verdict and SHIELD-3's stored shield verdict, seed sizes. A shield verdict stored
against a bot that does not shoot bullets down starts every later battle on that client with
the verdict already latched, which is the silent-gun shape of P4 (docs/plan-3.12.md).

watch (BENCH-86, BENCH-87): every --every seconds it reads
  - each client's results files (OUTPUT= in roborumble/*.txt), which the client appends one
    battle at a time and deletes after each upload, and keeps every battle with a hadur2 bot
    (battles.tsv: score share, rounds won, bullet damage);
  - Hadur's health.hc (RES-8), which Hadur rewrites at each battle end: rounds, rounds survived,
    faults, skipped turns, memory failures, the learned tick allowance; the profile written in
    the same second names the opponent and gives its stored shield verdict (health.tsv);
and every --page-every seconds it saves the LiteRumble BotDetails page of each --page and
infers each newly uploaded battle's score from the pairing's mean and battle count before and
after (page.tsv, page_events.tsv; every client's uploads, not only this one's). Every
--profiles-every seconds it writes a full profile decode (profiles/).

report (BENCH-88): reads a watch folder and prints the battle, skipped-turn, shield-verdict
and live-page summaries, joining each 1v1 battle to its health record.

page-diff: the page step on two saved pages (.mht, .html or a parsed .csv).
Standard library only; runs on Windows and Linux.
"""
import argparse
import csv
import datetime as dt
import glob
import html
import math
import os
import re
import struct
import sys
import time
import urllib.parse
import urllib.request
import zlib

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
import parse_rumble_page as prp  # noqa: E402

PAGE_URL = "https://rumble.robowiki.net/BotDetails?game={game}&name={name}"
# A battle whose inferred score falls this far under the pairing's earlier mean, or under 50,
# is flagged on the page events: one bad battle like this is what moved MirrorMicro 40 points.
DROP_POINTS = 25.0
# The profile Hadur saves at battle end lands within this many seconds of health.hc.
HEALTH_PROFILE_WINDOW = 5.0
# A results-file battle and a health record belong together within this many seconds.
JOIN_WINDOW = 120.0


def utc_now():
    return dt.datetime.now(dt.timezone.utc).strftime("%Y-%m-%dT%H:%M:%SZ")


def utc_of(seconds):
    return dt.datetime.fromtimestamp(seconds, dt.timezone.utc).strftime("%Y-%m-%dT%H:%M:%SZ")


def seconds_of(utc):
    return dt.datetime.strptime(utc, "%Y-%m-%dT%H:%M:%SZ").replace(tzinfo=dt.timezone.utc).timestamp()


# ---------------------------------------------------------------- profiles (BENCH-85)

class FormatError(ValueError):
    pass


class _Reader:
    """Big-endian reads in Bytes.Reader's layout."""

    def __init__(self, data, pos, end):
        self.data, self.pos, self.end = data, pos, end

    def need(self, n):
        if self.pos + n > self.end:
            raise FormatError("truncated")

    def u8(self):
        self.need(1)
        v = self.data[self.pos]
        self.pos += 1
        return v

    def u16(self):
        self.need(2)
        v = struct.unpack_from(">H", self.data, self.pos)[0]
        self.pos += 2
        return v

    def i32(self):
        self.need(4)
        v = struct.unpack_from(">i", self.data, self.pos)[0]
        self.pos += 4
        return v

    def i64(self):
        self.need(8)
        v = struct.unpack_from(">q", self.data, self.pos)[0]
        self.pos += 8
        return v

    def f32(self):
        self.need(4)
        v = struct.unpack_from(">f", self.data, self.pos)[0]
        self.pos += 4
        return v

    def count(self, what):
        v = self.f32()
        if not math.isfinite(v) or v < 0:
            raise FormatError(f"{what} {v}")
        return v

    def floats(self, what, size):
        n = self.u8()
        if n != size:
            raise FormatError(f"{what} has {n} values, expected {size}")
        return [self.count(what) for _ in range(n)]

    def str(self):
        n = self.u8()
        self.need(2 * n)
        return "".join(chr(self.u16()) for _ in range(n))


SAMPLE_WIDTH = 13
MAX_PAYLOAD = 64 * 1024
MAX_OUTCOMES = 10
MAX_SEED = {"gun_seed": 600, "surf_seed": 300}
# OpponentProfile's fixed group sizes (BANDS 5, POWER_BINS 6); Bytes.Reader.floats rejects any other.
GROUPS = (("shots_at_us", 5), ("hits_on_us", 5), ("shots_by_motion", 2), ("hits_by_motion", 2),
          ("power_histogram", 6), ("virtual_fired", 2), ("virtual_hits", 2), ("our_shots", 5),
          ("our_hits", 5), ("motion", 5))


def decode_profile(data):
    """A profile file's fields, as ProfileCodec.decode reads them; FormatError on any damage."""
    if len(data) < 11:
        raise FormatError(f"too short: {len(data)} bytes")
    if data[0] != ord("H") or data[1] != ord("P"):
        raise FormatError("not a profile")
    version = data[2]
    if version < 1 or version > 3:
        raise FormatError(f"unknown version {version}")
    length = struct.unpack_from(">i", data, 3)[0]
    if length < 0 or length > MAX_PAYLOAD or 7 + length + 4 != len(data):
        raise FormatError(f"length {length} does not fit {len(data)} bytes")
    stored = struct.unpack_from(">i", data, 7 + length)[0]
    crc = zlib.crc32(data[:7 + length]) & 0xFFFFFFFF
    if stored & 0xFFFFFFFF != crc:
        raise FormatError("checksum mismatch")
    r = _Reader(data, 7, 7 + length)
    p = {"version": version, "key": r.str(), "last_name": r.str()}
    if not p["key"]:
        raise FormatError("empty key")
    p["battles"], p["rounds"], p["last_fought"] = r.i32(), r.i32(), r.i64()
    if p["battles"] < 0 or p["rounds"] < 0 or p["last_fought"] < 0:
        raise FormatError("negative count")
    outcomes = []
    count = r.u8()
    if count > MAX_OUTCOMES:
        raise FormatError(f"{count} outcomes")
    for _ in range(count):
        rounds, wins = r.u16(), r.u16()
        if wins > rounds:
            raise FormatError("more wins than rounds")
        outcomes.append((rounds, wins, r.count("our damage"), r.count("their damage")))
    p["outcomes"] = outcomes
    for g, size in GROUPS:
        p[g] = r.floats(g, size)
    p["normalised"] = r.floats("normalised", 2) if version >= 2 else []
    p["lead_aware"] = p["shielder"] = False
    if version >= 3:
        p["verdict_at"] = r.pos
        verdict = r.u8()
        if verdict > 3:
            raise FormatError(f"verdict flags {verdict}")
        p["lead_aware"], p["shielder"] = bool(verdict & 1), bool(verdict & 2)
    for seed in ("gun_seed", "surf_seed"):
        n, width = r.u16(), r.u8()
        if n > MAX_SEED[seed] or width != SAMPLE_WIDTH:
            raise FormatError(f"{seed}: {n} samples of {width}")
        r.need(2 * width * n)
        r.pos += 2 * width * n
        p[seed] = 0 if version == 1 else n
    if r.pos != r.end:
        raise FormatError(f"{r.end - r.pos} stray bytes")
    return p


PROFILE_FILE = re.compile(r"-v(\d+)\.hp$")
PROFILE_COLUMNS = ["file", "version", "key", "last_name", "battles", "rounds", "last_fought",
                   "shielder", "lead_aware", "gun_seed", "surf_seed", "outcomes", "last_wins",
                   "last_rounds", "last_damage_share", "bytes", "modified_utc", "error"]


def profile_row(path):
    st = os.stat(path)
    row = {"file": os.path.basename(path), "bytes": st.st_size, "modified_utc": utc_of(st.st_mtime)}
    try:
        with open(path, "rb") as f:
            p = decode_profile(f.read())
    except (OSError, FormatError) as e:
        row["error"] = str(e)
        return row
    row.update({k: p[k] for k in ("version", "key", "last_name", "battles", "rounds",
                                  "last_fought", "gun_seed", "surf_seed")})
    row["shielder"] = int(p["shielder"])
    row["lead_aware"] = int(p["lead_aware"])
    row["outcomes"] = len(p["outcomes"])
    if p["outcomes"]:
        rounds, wins, ours, theirs = p["outcomes"][-1]
        row["last_wins"], row["last_rounds"] = wins, rounds
        row["last_damage_share"] = round(ours / (ours + theirs), 3) if ours + theirs > 0 else ""
    row["error"] = ""
    return row


def profile_files(folder):
    """The newest format's file per opponent stem (MEM-9 keeps one file per format version)."""
    best = {}
    for name in os.listdir(folder):
        m = PROFILE_FILE.search(name)
        if not m:
            continue
        stem, version = name[:m.start()], int(m.group(1))
        if stem not in best or version > best[stem][0]:
            best[stem] = (version, os.path.join(folder, name))
    return sorted(v[1] for v in best.values())


def read_profiles(folder):
    return [profile_row(p) for p in profile_files(folder)]


def write_tsv(path, columns, rows):
    with open(path, "w", newline="", encoding="utf-8") as f:
        w = csv.DictWriter(f, columns, delimiter="\t", extrasaction="ignore", restval="")
        w.writeheader()
        w.writerows(rows)


def profiles_summary(rows):
    good = [r for r in rows if not r.get("error")]
    return {"files": len(rows), "damaged": len(rows) - len(good),
            "shielders": sum(r["shielder"] for r in good),
            "lead_aware": sum(r["lead_aware"] for r in good),
            "seeded": sum(1 for r in good if r["gun_seed"] or r["surf_seed"])}


def cmd_profiles(args):
    rows = read_profiles(args.dir)
    if args.out:
        write_tsv(args.out, PROFILE_COLUMNS, rows)
    s = profiles_summary(rows)
    print(f"{s['files']} profiles ({s['damaged']} damaged): {s['shielders']} with a stored shield "
          f"verdict, {s['lead_aware']} lead-aware, {s['seeded']} with seeds")
    for r in rows:
        if r.get("shielder"):
            print(f"  shielder: {r['key']} ({r['battles']} battles, last {r.get('last_wins', '')}"
                  f"/{r.get('last_rounds', '')} rounds won)")
    return 0


# ---------------------------------------------------------------- client files (BENCH-86)

def client_results_files(client):
    """Each results file the client's rumble configs name (OUTPUT=), else the usual ones."""
    out = []
    for cfg in sorted(glob.glob(os.path.join(client, "roborumble", "*.txt"))):
        try:
            with open(cfg, encoding="utf-8", errors="replace") as f:
                for line in f:
                    m = re.match(r"\s*OUTPUT\s*=\s*(\S.*?)\s*$", line)
                    if m:
                        out.append(os.path.normpath(os.path.join(client, m.group(1))))
        except OSError:
            pass
    if not out:
        out = [os.path.join(client, "roborumble", "temp", n)
               for n in ("battleresults.txt", "meleeresults.txt", "teamresults.txt")]
    return sorted(set(out))


DATA_OVERRIDE = []


def hadur_data_dirs(client):
    """Hadur's data folders under the client's robots/.data: any folder holding health.hc or
    a Hadur profile, on a path that names hadur2. --data replaces the search."""
    if DATA_OVERRIDE:
        return [d for d in DATA_OVERRIDE if os.path.isdir(d)]
    root = os.path.join(client, "robots", ".data")
    found = set()
    for pattern in ("**/health.hc", "**/*-v[0-9].hp"):
        for p in glob.glob(os.path.join(root, pattern), recursive=True):
            if "hadur2" in p.replace("\\", "/").lower():
                found.add(os.path.dirname(p))
    return sorted(found)


def parse_results(text):
    """The client's results file: a header line game,rounds,field,user,millis[,runonly], then
    two robots as name,score,bulletDamage,firsts (BattlesRunner.dumpResults). A melee or team
    battle is written the same way, one such record for each pair of entrants, which is how the
    rumble scores it; so every record holds exactly two robots."""
    lines = [l.strip() for l in text.splitlines() if l.strip()]
    battles = []
    i = 0
    while i + 2 < len(lines):
        head = lines[i].split(",")
        a, b = lines[i + 1].rsplit(",", 3), lines[i + 2].rsplit(",", 3)
        if len(head) >= 5 and head[4].strip().isdigit() and len(a) == 4 and len(b) == 4:
            try:
                battles.append({
                    "game": head[0], "rounds": int(head[1]), "field": head[2], "user": head[3],
                    "millis": int(head[4]),
                    "a": a[0], "a_score": int(a[1]), "a_bullet": int(a[2]), "a_firsts": int(a[3]),
                    "b": b[0], "b_score": int(b[1]), "b_bullet": int(b[2]), "b_firsts": int(b[3])})
                i += 3
                continue
            except ValueError:
                pass
        i += 1
    return battles


def is_hadur(name):
    return name.startswith("hadur2.")


BATTLE_COLUMNS = ["utc", "game", "client", "hadur", "opponent", "share", "rounds", "won",
                  "lost", "hadur_score", "opponent_score", "hadur_bullet", "opponent_bullet", "key"]


def battle_row(b, client):
    """Hadur's side of a results battle, or None if no hadur2 bot fought in it."""
    if is_hadur(b["a"]) and not is_hadur(b["b"]):
        h, o = "a", "b"
    elif is_hadur(b["b"]) and not is_hadur(b["a"]):
        h, o = "b", "a"
    else:
        return None
    total = b[h + "_score"] + b[o + "_score"]
    return {"utc": utc_of(b["millis"] / 1000.0), "game": b["game"], "client": client,
            "hadur": b[h], "opponent": b[o],
            "share": round(100.0 * b[h + "_score"] / total, 2) if total else "",
            "rounds": b["rounds"], "won": b[h + "_firsts"], "lost": b[o + "_firsts"],
            "hadur_score": b[h + "_score"], "opponent_score": b[o + "_score"],
            "hadur_bullet": b[h + "_bullet"], "opponent_bullet": b[o + "_bullet"],
            "key": f"{b['millis']}|{b['a']}|{b['b']}"}


HEALTH_COLUMNS = ["utc", "folder", "rounds", "survived", "faults", "skipped", "memory_failures",
                  "allowance_us", "opponent_key", "shielder", "lead_aware", "profile_battles"]


# RES-15 (docs/plan-top5.md, Stage F): from 3.15 the record carries the start-up fields too.
# They go to startup.tsv, so a health.tsv written by an older watch keeps its columns.
STARTUP_COLUMNS = ["utc", "folder", "opponent_key", "skipped", "setup_ms", "first_turn", "max_skip_run"]


def parse_health(text):
    """RES-8's record: HEALTH,rounds,survived,faults,skipped,memoryFailures,allowanceNanos,
    then RES-15's optional setupMs,firstTurn,maxRun (None when absent)."""
    f = text.strip().split(",")
    if len(f) < 7 or f[0] != "HEALTH":
        return None
    try:
        n = [int(x) for x in f[1:7]]
        extra = [int(x) for x in f[7:10]] if len(f) >= 10 else [None, None, None]
    except ValueError:
        return None
    return {"rounds": n[0], "survived": n[1], "faults": n[2], "skipped": n[3],
            "memory_failures": n[4], "allowance_us": round(n[5] / 1000.0, 1),
            "setup_ms": extra[0], "first_turn": extra[1], "max_skip_run": extra[2]}


def health_row(folder, label):
    """The health record and the profile Hadur saved with it (same battle end), or None."""
    path = os.path.join(folder, "health.hc")
    try:
        mtime = os.stat(path).st_mtime
        with open(path, encoding="ascii", errors="replace") as f:
            rec = parse_health(f.read())
    except OSError:
        return None, None
    if rec is None:
        return None, mtime
    rec.update({"utc": utc_of(mtime), "folder": label, "opponent_key": "", "shielder": "",
                "lead_aware": "", "profile_battles": ""})
    newest, newest_t = None, None
    for p in profile_files(folder):
        t = os.stat(p).st_mtime
        if abs(t - mtime) <= HEALTH_PROFILE_WINDOW and (newest_t is None or t > newest_t):
            newest, newest_t = p, t
    if newest:
        row = profile_row(newest)
        if not row.get("error"):
            rec.update({"opponent_key": row["key"], "shielder": row["shielder"],
                        "lead_aware": row["lead_aware"], "profile_battles": row["battles"]})
    return rec, mtime


# ---------------------------------------------------------------- live page (BENCH-87)

HEADER = re.compile(r"APS\s+([\d.]+)\s+APS CI\s+±?([\d.]+)\s+PWIN\s+([\d.]+)\s+ANPP\s+([\d.]+)"
                    r".*?Survival\s+([\d.]+)\s+Pairings\s+(\d+)\s+Battles\s+(\d+)", re.S)


def page_header(doc):
    text = re.sub(r"\s+", " ", html.unescape(re.sub(r"<[^>]*>", " ", doc)))
    m = HEADER.search(text)
    if not m:
        return None
    return {"aps": float(m.group(1)), "ci": float(m.group(2)), "pwin": float(m.group(3)),
            "anpp": float(m.group(4)), "survival": float(m.group(5)),
            "pairings": int(m.group(6)), "battles": int(m.group(7))}


def page_rows(doc):
    """name -> (aps, battles, latest battle) from a BotDetails page's HTML."""
    out = {}
    for c in prp.parse_botdetails(doc):
        try:
            out[c[2]] = (float(c[4]), int(c[9]), c[10])
        except ValueError:
            pass
    return out


def load_page(path):
    """A saved page as (header or None, rows): .mht, .html or a parse_rumble_page .csv."""
    if path.endswith(".csv"):
        with open(path, newline="", encoding="utf-8") as f:
            rows = {r["name"]: (float(r["aps"]), int(r["battles"]), r["latest_battle_utc"])
                    for r in csv.DictReader(f)}
        return None, rows
    if path.endswith(".mht"):
        doc = prp.page_html(path)
    else:
        with open(path, encoding="utf-8", errors="replace") as f:
            doc = f.read()
    return page_header(doc), page_rows(doc)


EVENT_COLUMNS = ["utc", "game", "opponent", "new_battles", "inferred_score", "pairing_before",
                 "pairing_after", "battles_after", "latest_battle", "flag"]


def page_events(old, new):
    """Battles uploaded between two pages. A pairing's APS is the mean over its battles, so the
    new battles' mean is (after * n_after - before * n_before) / (n_after - n_before); a pairing
    new to the page has its whole mean. Rounding the page's two decimals errs by at most
    0.01 * n_after / new_battles."""
    events = []
    for name, (aps, n, latest) in new.items():
        before = old.get(name)
        if before is None:
            k, score, prior = n, aps, ""
        elif n > before[1]:
            k = n - before[1]
            score, prior = (aps * n - before[0] * before[1]) / k, before[0]
        else:
            continue
        flag = ""
        if score < 50 or (prior != "" and score < prior - DROP_POINTS):
            flag = "DROP"
        events.append({"opponent": name, "new_battles": k, "inferred_score": round(score, 2),
                       "pairing_before": prior, "pairing_after": aps, "battles_after": n,
                       "latest_battle": latest, "flag": flag})
    events.sort(key=lambda e: e["latest_battle"])
    return events


def cmd_page_diff(args):
    h_old, old = load_page(args.old)
    h_new, new = load_page(args.new)
    ev = page_events(old, new)
    if h_old and h_new:
        print(f"APS {h_old['aps']:.2f} -> {h_new['aps']:.2f}, battles {h_old['battles']} -> "
              f"{h_new['battles']}, pairings {h_old['pairings']} -> {h_new['pairings']}")
    print(f"{sum(e['new_battles'] for e in ev)} new battles over {len(ev)} pairings, "
          f"{sum(1 for e in ev if e['flag'])} flagged")
    for e in ev:
        if e["flag"]:
            print(f"  {e['latest_battle']}  {e['opponent']}: {e['inferred_score']:.1f} "
                  f"(pairing {e['pairing_before']} -> {e['pairing_after']})")
    return 0


def page_tag(game, name):
    """A file-name part naming one page: the game and the robot, unsafe characters as _."""
    return re.sub(r"[^A-Za-z0-9.-]", "_", f"{game}_{name}")


def fetch(url, timeout=60):
    req = urllib.request.Request(url, headers={"User-Agent": "hadur-live-client/1"})
    with urllib.request.urlopen(req, timeout=timeout) as r:
        return r.read().decode("utf-8", "replace")


# ---------------------------------------------------------------- watch

def append_tsv(path, columns, rows):
    new = not os.path.exists(path)
    with open(path, "a", newline="", encoding="utf-8") as f:
        w = csv.DictWriter(f, columns, delimiter="\t", extrasaction="ignore", restval="")
        if new:
            w.writeheader()
        w.writerows(rows)


def read_tsv(path):
    if not os.path.exists(path):
        return []
    with open(path, newline="", encoding="utf-8") as f:
        return list(csv.DictReader(f, delimiter="\t"))


class Watch:
    """One watch over the clients and pages; each poll_* step is separately testable."""

    def __init__(self, clients, out, pages=(), log=print, robots=()):
        self.clients, self.out, self.pages, self.log = clients, out, list(pages), log
        # BENCH-113: a release watch keeps only the released versions' battles, so results a
        # client still holds from an older version stay out of the release report.
        self.robots = set(robots)
        os.makedirs(out, exist_ok=True)
        self.seen = {r["key"] for r in read_tsv(os.path.join(out, "battles.tsv"))}
        self.health_mtime = {}
        self.last_page = {}
        # The records already on disk are from battles before the watch; a folder or record
        # that appears later is a battle fought during it.
        for client in clients:
            for folder in hadur_data_dirs(client):
                try:
                    self.health_mtime[folder] = os.stat(os.path.join(folder, "health.hc")).st_mtime
                except OSError:
                    self.health_mtime[folder] = None

    def label(self, client):
        return os.path.basename(os.path.normpath(client)) or client

    def poll_results(self):
        rows = []
        for client in self.clients:
            for path in client_results_files(client):
                try:
                    with open(path, encoding="utf-8", errors="replace") as f:
                        text = f.read()
                except OSError:
                    continue
                for b in parse_results(text):
                    row = battle_row(b, self.label(client))
                    if row and self.robots and row["hadur"] not in self.robots:
                        continue
                    if row and row["key"] not in self.seen:
                        self.seen.add(row["key"])
                        rows.append(row)
        if rows:
            append_tsv(os.path.join(self.out, "battles.tsv"), BATTLE_COLUMNS, rows)
            for r in rows:
                low = r["share"] != "" and r["share"] < 70 and r["game"] == "roborumble"
                self.log(f"{r['utc']} battle {r['hadur']} vs {r['opponent']} ({r['game']}): "
                         f"{r['share']}% share, {r['won']}-{r['lost']} rounds" + ("  << LOW" if low else ""))
        return rows

    def poll_health(self):
        rows = []
        for client in self.clients:
            for folder in hadur_data_dirs(client):
                try:
                    mtime = os.stat(os.path.join(folder, "health.hc")).st_mtime
                except OSError:
                    continue
                if self.health_mtime.get(folder) == mtime:
                    continue
                self.health_mtime[folder] = mtime
                # Let the battle-end profile save land beside the record.
                time.sleep(1.0)
                rec, _ = health_row(folder, os.path.relpath(folder, client))
                if rec:
                    rows.append(rec)
                    self.log(f"{rec['utc']} health {rec['opponent_key'] or '?'}: "
                             f"{rec['survived']}/{rec['rounds']} survived, {rec['skipped']} skipped, "
                             f"{rec['faults']} faults, shield verdict {rec['shielder']}")
        if rows:
            append_tsv(os.path.join(self.out, "health.tsv"), HEALTH_COLUMNS, rows)
            startup = [r for r in rows if r.get("setup_ms") is not None]
            if startup:
                append_tsv(os.path.join(self.out, "startup.tsv"), STARTUP_COLUMNS, startup)
                for r in startup:
                    if r["max_skip_run"] > 30:
                        self.log(f"{r['utc']} START-UP DISABLE? {r['opponent_key'] or '?'}: "
                                 f"{r['max_skip_run']} skipped turns in a row, setup {r['setup_ms']} ms, "
                                 f"first turn {r['first_turn']}")
        return rows

    def poll_pages(self, fetcher=fetch):
        for spec in self.pages:
            game, _, name = spec.partition(":")
            url = PAGE_URL.format(game=game, name=urllib.parse.quote(name))
            try:
                doc = fetcher(url)
            except Exception as e:  # network trouble must never stop the watch
                self.log(f"{utc_now()} page {spec}: {e}")
                continue
            now = utc_now()
            folder = os.path.join(self.out, "pages")
            os.makedirs(folder, exist_ok=True)
            tag = page_tag(game, name)
            current = f"{now.replace(':', '')}_{tag}.html"
            with open(os.path.join(folder, current), "w", encoding="utf-8") as f:
                f.write(doc)
            head, rows = page_header(doc), page_rows(doc)
            if head is None or not rows:
                self.log(f"{now} page {spec}: no BotDetails table (wrong name or version?)")
                continue
            append_tsv(os.path.join(self.out, "page.tsv"),
                       ["utc", "game", "bot", "aps", "ci", "pwin", "anpp", "survival", "pairings", "battles"],
                       [dict(head, utc=now, game=game, bot=name)])
            prev = self.last_page.get(spec)
            if prev is None:
                prev = self._previous_saved(folder, tag, current)
            if prev is not None:
                ev = page_events(prev, rows)
                for e in ev:
                    e.update(utc=now, game=game)
                append_tsv(os.path.join(self.out, "page_events.tsv"), EVENT_COLUMNS, ev)
                flagged = [e for e in ev if e["flag"]]
                self.log(f"{now} page {game}: APS {head['aps']:.2f}, {head['battles']} battles, "
                         f"{sum(e['new_battles'] for e in ev)} new, {len(flagged)} flagged")
                for e in flagged:
                    self.log(f"    DROP {e['opponent']}: {e['inferred_score']:.1f} (pairing "
                             f"{e['pairing_before']} -> {e['pairing_after']})")
            else:
                self.log(f"{now} page {game}: APS {head['aps']:.2f}, {head['battles']} battles (first read)")
            self.last_page[spec] = rows

    def _previous_saved(self, folder, tag, current):
        saved = sorted(n for n in os.listdir(folder) if n.endswith(f"_{tag}.html") and n != current)
        if not saved:
            return None
        with open(os.path.join(folder, saved[-1]), encoding="utf-8", errors="replace") as f:
            return page_rows(f.read()) or None

    def snapshot_profiles(self):
        now = utc_now()
        folder = os.path.join(self.out, "profiles")
        os.makedirs(folder, exist_ok=True)
        for client in self.clients:
            for d in hadur_data_dirs(client):
                rows = read_profiles(d)
                tag = re.sub(r"[^A-Za-z0-9._-]", "_", f"{self.label(client)}_{os.path.relpath(d, client)}")
                write_tsv(os.path.join(folder, f"{now.replace(':', '')}_{tag}.tsv"), PROFILE_COLUMNS, rows)
                s = profiles_summary(rows)
                append_tsv(os.path.join(self.out, "profiles.tsv"),
                           ["utc", "folder", "files", "damaged", "shielders", "lead_aware", "seeded"],
                           [dict(s, utc=now, folder=tag)])
                self.log(f"{now} profiles {tag}: {s['files']} files, {s['shielders']} shield verdicts stored")


def cmd_watch(args):
    DATA_OVERRIDE[:] = args.data
    for c in args.client:
        if not os.path.isdir(c):
            print(f"no such client folder: {c}", file=sys.stderr)
            return 2
    log_path = os.path.join(args.out, "watch.log")
    os.makedirs(args.out, exist_ok=True)

    def log(line):
        print(line, flush=True)
        with open(log_path, "a", encoding="utf-8") as f:
            f.write(line + "\n")

    w = Watch(args.client, args.out, args.page, log, args.robot)
    for c in args.client:
        log(f"{utc_now()} client {c}: results {client_results_files(c)}, data {hadur_data_dirs(c) or 'none yet'}")
    end = time.time() + args.hours * 3600 if args.hours > 0 else None
    next_page = next_prof = 0.0
    try:
        while end is None or time.time() < end:
            now = time.time()
            w.poll_results()
            w.poll_health()
            if args.page and now >= next_page:
                w.poll_pages()
                next_page = now + args.page_every
            if now >= next_prof:
                w.snapshot_profiles()
                next_prof = now + args.profiles_every
            time.sleep(args.every)
    except KeyboardInterrupt:
        log(f"{utc_now()} stopped")
    return 0


# ---------------------------------------------------------------- report (BENCH-88)

def join_health(battles, health):
    """Each 1v1 battle with the health record nearest in time whose opponent key begins its
    opponent's name, within JOIN_WINDOW seconds; each record is used once."""
    used = set()
    joined = []
    for b in battles:
        if b["game"] != "roborumble":
            continue
        t = seconds_of(b["utc"])
        best, best_d = None, None
        for i, h in enumerate(health):
            if i in used or not h.get("opponent_key"):
                continue
            if not b["opponent"].startswith(h["opponent_key"]):
                continue
            d = abs(seconds_of(h["utc"]) - t)
            if d <= JOIN_WINDOW and (best_d is None or d < best_d):
                best, best_d = i, d
        if best is not None:
            used.add(best)
        joined.append((b, health[best] if best is not None else None))
    return joined


def report(out):
    battles = read_tsv(os.path.join(out, "battles.tsv"))
    health = read_tsv(os.path.join(out, "health.tsv"))
    page = read_tsv(os.path.join(out, "page.tsv"))
    events = read_tsv(os.path.join(out, "page_events.tsv"))
    profiles = read_tsv(os.path.join(out, "profiles.tsv"))
    for b in battles:
        b["share"] = float(b["share"]) if b["share"] else None
    lines = [f"# Live client watch: {out}", ""]
    by_game = {}
    for b in battles:
        by_game.setdefault(b["game"], []).append(b)
    lines.append("## This client's battles")
    lines.append("")
    lines.append("| Game | Battles (pairs in melee and team) | Mean share | Under 70% | Rounds won |")
    lines.append("|---|---:|---:|---:|---:|")
    for game, bs in sorted(by_game.items()):
        shares = [b["share"] for b in bs if b["share"] is not None]
        won = sum(int(b["won"]) for b in bs)
        rounds = sum(int(b["rounds"]) for b in bs)
        mean = sum(shares) / len(shares) if shares else float("nan")
        lines.append(f"| {game} | {len(bs)} | {mean:.2f} | {sum(1 for s in shares if s < 70)} | "
                     f"{won} of {rounds} |")
    lines.append("")
    joined = join_health(battles, health)
    if health:
        sk = [int(h["skipped"]) for h in health]
        sh = [h for h in health if h.get("shielder") == "1"]
        lines.append("## Health records (RES-8)")
        lines.append("")
        lines.append(f"{len(health)} battle ends; skipped turns mean {sum(sk) / len(sk):.1f}, max {max(sk)}, "
                     f"{sum(1 for s in sk if s > 0)} battles with any; faults in "
                     f"{sum(1 for h in health if int(h['faults']) > 0)}; shield verdict stored at the end of "
                     f"{len(sh)} ({100.0 * len(sh) / len(health):.0f}%).")
        lines.append("")
    low = [(b, h) for b, h in joined if b["share"] is not None and b["share"] < 70]
    if joined:
        lines.append("## 1v1 battles under 70% share")
        lines.append("")
        lines.append("Silent-gun shape: rounds mostly won, share low, shield verdict 1.")
        lines.append("")
        lines.append("| Time (UTC) | Opponent | Share | Rounds won | Skipped | Shield verdict |")
        lines.append("|---|---|---:|---|---:|---|")
        for b, h in low:
            lines.append(f"| {b['utc']} | {b['opponent']} | {b['share']:.1f} | {b['won']}-{b['lost']} | "
                         f"{h['skipped'] if h else '?'} | {h['shielder'] if h else '?'} |")
        if not low:
            lines.append("| none | | | | | |")
        matched = [(b, h) for b, h in joined if h]
        lat = [b["share"] for b, h in matched if h["shielder"] == "1" and b["share"] is not None]
        clean = [b["share"] for b, h in matched if h["shielder"] == "0" and b["share"] is not None]
        lines.append("")
        lines.append(f"{len(matched)} of {len(joined)} 1v1 battles joined to a health record. Mean share with the "
                     f"verdict stored: {sum(lat) / len(lat):.2f} over {len(lat)}" if lat else
                     f"{len(matched)} of {len(joined)} 1v1 battles joined to a health record; none ended with the verdict stored.")
        if clean:
            lines.append(f"Without it: {sum(clean) / len(clean):.2f} over {len(clean)}.")
        lines.append("")
    if profiles:
        latest = {}
        for p in profiles:
            latest[p["folder"]] = p  # rows are appended in time order
        lines.append("## Stored profiles")
        lines.append("")
        lines.append("Latest snapshot of each data folder:")
        lines.append("")
        for folder, p in sorted(latest.items()):
            lines.append(f"- {folder} at {p['utc']}: {p['files']} profiles, {p['shielders']} with a stored "
                         f"shield verdict, {p['seeded']} seeded, {p['damaged']} damaged.")
        lines.append("")
    if page:
        lines.append("## Live page")
        lines.append("")
        for game in sorted({r["game"] for r in page}):
            rs = [r for r in page if r["game"] == game]
            a, z = rs[0], rs[-1]
            lines.append(f"- {game} {z['bot']}: APS {a['aps']} at {a['utc']} -> {z['aps']} at {z['utc']}, "
                         f"battles {a['battles']} -> {z['battles']}, pairings {z['pairings']}.")
        drops = [e for e in events if e.get("flag")]
        lines.append(f"- {sum(int(e['new_battles']) for e in events)} uploaded battles seen across all clients, "
                     f"{len(drops)} flagged as drops:")
        for e in drops[-30:]:
            lines.append(f"  - {e['latest_battle']} {e['opponent']}: {e['inferred_score']} "
                         f"(pairing {e['pairing_before']} -> {e['pairing_after']})")
        lines.append("")
    return "\n".join(lines)


def cmd_report(args):
    text = report(args.out)
    print(text)
    if args.md:
        with open(args.md, "w", encoding="utf-8") as f:
            f.write(text + "\n")
    return 0


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n\n")[0])
    sub = ap.add_subparsers(dest="cmd", required=True)
    w = sub.add_parser("watch")
    w.add_argument("--client", action="append", required=True)
    w.add_argument("--out", required=True)
    w.add_argument("--page", action="append", default=[], help='"game:robot version", e.g. "roborumble:hadur2.Hadur 3.11"')
    w.add_argument("--robot", action="append", default=[],
                   help='keep only battles of this Hadur, e.g. "hadur2.Hadur 3.17"; repeatable, default all')
    w.add_argument("--every", type=float, default=5.0)
    w.add_argument("--page-every", type=float, default=900.0)
    w.add_argument("--profiles-every", type=float, default=3600.0)
    w.add_argument("--hours", type=float, default=0.0, help="stop after this long; 0 runs until Ctrl-C")
    w.add_argument("--data", action="append", default=[], help="Hadur's data folder, if the search under robots/.data misses it")
    p = sub.add_parser("profiles")
    p.add_argument("dir")
    p.add_argument("--out")
    d = sub.add_parser("page-diff")
    d.add_argument("old")
    d.add_argument("new")
    r = sub.add_parser("report")
    r.add_argument("out")
    r.add_argument("--md")
    args = ap.parse_args(argv)
    return {"watch": cmd_watch, "profiles": cmd_profiles, "page-diff": cmd_page_diff,
            "report": cmd_report}[args.cmd](args)


if __name__ == "__main__":
    sys.exit(main())
