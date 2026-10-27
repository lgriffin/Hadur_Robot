#!/usr/bin/env python3
"""Watch a live RoboRumble client and the live rankings page for Hadur (3.12 plan).

    python3 data/tools/live_client.py watch --client DIR [--client DIR ...] --out DIR
        [--page "roborumble:hadur2.Hadur 3.11" ...] [--every 5] [--page-every 900]
        [--profiles-every 3600] [--hours 0] [--data DIR ...]
    python3 data/tools/live_client.py profiles DIR [--out TSV]
    python3 data/tools/live_client.py page-diff OLD NEW
    python3 data/tools/live_client.py report OUT [--md FILE]
    python3 data/tools/live_client.py clients --launch FOLDER:LAUNCHER [...] --out DIR [--root DIR]
        [--restart-minutes 15] [--wait-minutes 10] [--hours 0]

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

clients (BENCH-121), or watch with --launch: starts each RoboRumble client (FOLDER:LAUNCHER, e.g.
rr01:roborumble.bat or C:/robocode:meleerumble.bat), writes its console to consoles/LABEL-UTC.log per
start, logs Hadur's console lines (disabled for a stall, thread not stoppable, skipped turn) to
client-events.tsv, and restarts each client every --restart-minutes at its first battle end or upload
after that (no battle cut), or after --wait-minutes more if none ends (counted as cut). A long-running
client's skipped turns climbed from 4 to 87 a battle over 75 minutes (3.17 run 2, PR #331). All
clients stop when the watch ends.

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
                  "allowance_us", "opponent_key", "shielder", "lead_aware", "profile_battles", "client"]


LOW_SHARE = 70
# BENCH-113: a collapse is a 1v1 battle this far under the pairing's live score. A flat 70%
# share line called normal battles against strong robots collapses (WaveSerpent pairs at 57).
COLLAPSE_MARGIN = 15.0


def is_low(share):
    """A 1v1 battle under 70% share."""
    try:
        return float(share) < LOW_SHARE
    except (TypeError, ValueError):
        return False


def is_collapse(row, pairings):
    """A 1v1 battle at least COLLAPSE_MARGIN under its pairing's score on its own Hadur's live
    page; `pairings(bot)` gives that page's rows. False when the page has no score for it."""
    if row["game"] != "roborumble":
        return False
    expected = pairings(row["hadur"])
    if row["opponent"] not in expected:
        return False
    try:
        return float(row["share"]) <= expected[row["opponent"]][0] - COLLAPSE_MARGIN
    except (TypeError, ValueError):
        return False


def first_start(out):
    """BENCH-113: when the watch over `out` first started (out/started.txt), written on the
    first call. Battles before it (a client's results file can hold yesterday's) stay out,
    and a restarted watch keeps the first start."""
    path = os.path.join(out, "started.txt")
    if not os.path.exists(path):
        with open(path, "w", encoding="utf-8") as f:
            f.write(utc_now() + "\n")
    with open(path, encoding="utf-8") as f:
        return f.read().strip()


def latest_page_rows(out, game, bot):
    """The rows of the newest saved BotDetails page of `bot` in `game` under out/pages that
    has a table (a failed fetch is saved too), or {}."""
    folder = os.path.join(out, "pages")
    tag = page_tag(game, bot)
    try:
        saved = sorted((n for n in os.listdir(folder) if n.endswith(f"_{tag}.html")), reverse=True)
    except OSError:
        return {}
    for name in saved:
        with open(os.path.join(folder, name), encoding="utf-8", errors="replace") as f:
            rows = page_rows(f.read())
        if rows:
            return rows
    return {}


def watch_battles(out):
    """The battles of the watch over `out`: those since its first start when it has one."""
    battles = read_tsv(os.path.join(out, "battles.tsv"))
    path = os.path.join(out, "started.txt")
    if not os.path.exists(path):
        return battles
    with open(path, encoding="utf-8") as f:
        since = f.read().strip()
    return [b for b in battles if b["utc"] >= since]


class PagePairings:
    """Each Hadur's pairing scores from its newest saved roborumble page, refreshed by the watch."""

    def __init__(self, out):
        self.out, self.rows = out, {}

    def __call__(self, bot):
        if bot not in self.rows:
            self.rows[bot] = latest_page_rows(self.out, "roborumble", bot)
        return self.rows[bot]


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

    def __init__(self, clients, out, pages=(), log=print, robots=(), since=None):
        self.clients, self.out, self.pages, self.log = clients, out, list(pages), log
        # BENCH-113: a release watch keeps only the released versions' battles, so results a
        # client still holds from an older version stay out of the release report.
        self.robots = set(robots)
        os.makedirs(out, exist_ok=True)
        kept = read_tsv(os.path.join(out, "battles.tsv"))
        self.seen = {r["key"] for r in kept}
        self.since = since or ""
        self.pairings = PagePairings(out)
        self.recount()
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

    def recount(self):
        """1v1 battles and collapses so far, from battles.tsv, so a restarted watch keeps counting
        towards its stop, and every battle is scored against the newest page as the report is."""
        kept = [r for r in read_tsv(os.path.join(self.out, "battles.tsv")) if r["utc"] >= self.since]
        self.duels = sum(1 for r in kept if r["game"] == "roborumble")
        self.collapses = sum(1 for r in kept if is_collapse(r, self.pairings))

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
                    if row and row["utc"] < self.since:
                        continue
                    if row and row["key"] not in self.seen:
                        self.seen.add(row["key"])
                        rows.append(row)
        if rows:
            append_tsv(os.path.join(self.out, "battles.tsv"), BATTLE_COLUMNS, rows)
            for r in rows:
                low = r["game"] == "roborumble" and is_low(r["share"])
                fell = is_collapse(r, self.pairings)
                self.log(f"{r['utc']} battle {r['hadur']} vs {r['opponent']} ({r['game']}): "
                         f"{r['share']}% share, {r['won']}-{r['lost']} rounds" + ("  << COLLAPSE" if fell else "  << LOW" if low else ""))
            self.recount()
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
                    rec["client"] = self.label(client)
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
            if game == "roborumble":
                self.pairings.rows[name] = rows
                self.recount()

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
    if args.launch:
        launched = {os.path.normpath(folder) for _, folder, _ in (parse_launch(x, args.root) for x in args.launch)}
        args.client = sorted(launched | {os.path.normpath(c) for c in args.client})
    if not args.client:
        print("watch needs --client or --launch", file=sys.stderr)
        return 2
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

    since = first_start(args.out) if args.new_only else None
    w = Watch(args.client, args.out, args.page, log, args.robot, since)
    clients = None
    if args.launch:
        # BENCH-121: the watch runs the clients itself, restarting each on a schedule.
        clients = Clients([parse_launch(x, args.root) for x in args.launch], args.out,
                          args.restart_minutes * 60, args.wait_minutes * 60, log)
    for c in args.client:
        log(f"{utc_now()} client {c}: results {client_results_files(c)}, data {hadur_data_dirs(c) or 'none yet'}")
    end = time.time() + args.hours * 3600 if args.hours > 0 else None
    next_page = next_prof = 0.0
    start, next_rate = time.time(), time.time() + 3600
    rate_from = (w.duels, w.collapses)
    done_at = None
    try:
        if clients:
            clients.start_all()
        while (end is None or time.time() < end) and (done_at is None or time.time() < done_at):
            now = time.time()
            # The page first: a battle is a collapse against its pairing's live score.
            if args.page and now >= next_page:
                w.poll_pages()
                next_page = now + args.page_every
            w.poll_results()
            if clients:
                clients.poll()
            if now >= next_rate:
                log(f"{utc_now()} rate: {w.duels - rate_from[0]} 1v1 battles, {w.collapses - rate_from[1]} "
                    f"collapses in the last hour; {w.duels} and {w.collapses} in all")
                rate_from, next_rate = (w.duels, w.collapses), now + 3600
            asked = os.path.exists(os.path.join(args.out, "STOP"))
            if done_at is None and (asked or args.stop_collapses and w.collapses >= args.stop_collapses
                                    or args.stop_battles and w.duels >= args.stop_battles):
                # The last battle's health record can land after its result: keep polling a while.
                log(f"{utc_now()} done{' (STOP file)' if asked else ''}: {w.duels} 1v1 battles, "
                    f"{w.collapses} collapses")
                done_at = now + args.grace
            w.poll_health()
            if now >= next_prof:
                w.snapshot_profiles()
                next_prof = now + args.profiles_every
            time.sleep(args.every)
        w.poll_health()
        w.snapshot_profiles()
    except KeyboardInterrupt:
        log(f"{utc_now()} stopped")
    finally:
        if clients:
            clients.stop_all()
    return 0


# ---------------------------------------------------------------- clients (BENCH-121)

# Console lines worth counting, each a client's own line about a Hadur robot. The engine prints
# the first when it disables a robot for a stall, the second when it then fails to stop the
# robot's thread (that join runs on the robot's own thread, so it always fails and the thread
# ends by itself), the third for each turn a robot misses.
CONSOLE_EVENTS = [
    ("idle", re.compile(r"has not performed any actions? in a reasonable amount of time", re.I)),
    ("unstoppable", re.compile(r"Unable to stop thread", re.I)),
    ("skipped", re.compile(r"skipped turn", re.I)),
]
CLIENT_EVENT_COLUMNS = ["utc", "client", "event", "detail"]
# Which results file each launcher fills, by a word in the file name.
RESULTS_WORD = {"roborumble": "1v1", "meleerumble": "melee", "teamrumble": "team", "twinduel": "twinduel"}


def parse_launch(spec, root):
    """ "rr01:roborumble.bat" -> (label, folder, launcher); the folder is under root."""
    folder, _, launcher = spec.rpartition(":")  # a Windows folder has its own colon
    if not folder or not launcher:
        raise ValueError(f"--launch {spec!r}: expected FOLDER:LAUNCHER, e.g. rr01:roborumble.bat")
    name = os.path.splitext(os.path.basename(launcher))[0]
    return f"{os.path.basename(os.path.normpath(folder))}-{name}", os.path.join(root, folder), launcher


def results_signature(paths):
    """What changes when a client finishes a battle or uploads: each results file's size and mtime."""
    sig = []
    for p in paths:
        try:
            st = os.stat(p)
            sig.append((p, st.st_size, st.st_mtime))
        except OSError:
            sig.append((p, None, None))
    return tuple(sig)


def popen_client(launcher, cwd, console):
    import subprocess
    if os.name == "nt":
        return subprocess.Popen(["cmd", "/c", launcher], cwd=cwd, stdout=console, stderr=subprocess.STDOUT,
                                stdin=subprocess.DEVNULL, creationflags=subprocess.CREATE_NEW_PROCESS_GROUP)
    return subprocess.Popen(["sh", launcher] if launcher.endswith(".sh") else launcher, cwd=cwd, stdout=console,
                            stderr=subprocess.STDOUT, stdin=subprocess.DEVNULL, start_new_session=True,
                            shell=not launcher.endswith(".sh"))


def kill_tree(proc):
    """The launcher and the Robocode JVM under it; by pid, never by name."""
    import signal
    import subprocess
    if proc.poll() is not None:
        return
    if os.name == "nt":
        subprocess.run(["taskkill", "/PID", str(proc.pid), "/T", "/F"], capture_output=True)
    else:
        try:
            os.killpg(proc.pid, signal.SIGKILL)
        except OSError:
            pass
    try:
        proc.wait(timeout=30)
    except Exception:
        pass


class Clients:
    """BENCH-121: runs the RoboRumble clients, each console to its own file per start, and restarts
    each one every restart_s seconds, at the first battle end (or upload) after it is due, so no
    battle is cut; a client that finishes none within wait_s is restarted anyway and counted as cut."""

    def __init__(self, launches, out, restart_s, wait_s=600.0, log=print, spawn=popen_client,
                 kill=kill_tree, clock=time.time, robot_words=("hadur2.",)):
        self.launches, self.out, self.restart_s, self.wait_s = launches, out, restart_s, wait_s
        self.log, self.spawn, self.kill, self.clock, self.words = log, spawn, kill, clock, robot_words
        labels = [x[0] for x in launches]
        if len(set(labels)) != len(labels):
            raise ValueError(f"two launches share a label: {sorted(labels)}")
        self.consoles = os.path.join(out, "consoles")
        os.makedirs(self.consoles, exist_ok=True)
        self.state = {}
        # A battle end is a results-file change that then holds for settle_s (an append or upload done).
        self.settle_s = 10.0

    def results_paths(self, folder, launcher):
        paths = client_results_files(folder)
        word = RESULTS_WORD.get(os.path.splitext(os.path.basename(launcher))[0].lower())
        mine = [p for p in paths if word and word in os.path.basename(p).lower()]
        return mine or paths

    def event(self, label, event, detail=""):
        append_tsv(os.path.join(self.out, "client-events.tsv"), CLIENT_EVENT_COLUMNS,
                   [{"utc": utc_of(self.clock()), "client": label, "event": event, "detail": detail}])

    def start(self, label, why="start"):
        _, folder, launcher = next(x for x in self.launches if x[0] == label)
        stamp = utc_of(self.clock()).replace(":", "")
        path = os.path.join(self.consoles, f"{label}-{stamp}.log")
        console = open(path, "ab")
        try:
            proc = self.spawn(launcher, folder, console)
        except Exception:
            console.close()
            raise
        paths = self.results_paths(folder, launcher)
        self.state[label] = {"proc": proc, "console": console, "path": path, "read": 0, "partial": "",
                             "started": self.clock(), "due": None, "sig": None, "paths": paths}
        self.event(label, why, os.path.basename(path))
        self.log(f"{utc_now()} client {label}: {why}, console {path}")

    def start_all(self):
        try:
            for label, _, _ in self.launches:
                self.start(label)
        except Exception:
            self.stop_all()
            raise

    def read_console(self, label, final=False):
        st = self.state[label]
        st["console"].flush()
        try:
            with open(st["path"], "rb") as f:
                f.seek(st["read"])
                data = f.read()
        except OSError:
            return
        st["read"] += len(data)
        text = st["partial"] + data.decode("utf-8", errors="replace")
        lines = text.split("\n")
        st["partial"] = "" if final else lines.pop()
        for line in lines:
            if not any(w in line for w in self.words):
                continue
            for name, rx in CONSOLE_EVENTS:
                if rx.search(line):
                    self.event(label, name, line.strip()[:300])
                    if name != "skipped":
                        self.log(f"{utc_now()} client {label}: {name}: {line.strip()[:200]}")
                    break

    def stop(self, label, why):
        st = self.state[label]
        self.kill(st["proc"])
        self.read_console(label, final=True)
        st["console"].close()
        self.event(label, why, f"up {self.clock() - st['started']:.0f} s")

    def poll(self):
        now = self.clock()
        for label, _, _ in self.launches:
            st = self.state.get(label)
            if st is None:
                continue
            self.read_console(label)
            if st["proc"].poll() is not None:
                self.read_console(label, final=True)
                self.event(label, "exited", f"code {st['proc'].returncode}")
                st["console"].close()
                self.start(label, "start after exit")
                continue
            if st["due"] is None and now - st["started"] >= self.restart_s:
                st["due"], st["sig"], st["changed"] = now, results_signature(st["paths"]), None
            if st["due"] is not None:
                sig = results_signature(st["paths"])
                if sig != st["sig"]:
                    # Changed: wait until it holds still, so an append or upload is not cut.
                    st["sig"], st["changed"] = sig, now
                elif st["changed"] is not None and now - st["changed"] >= self.settle_s:
                    self.stop(label, "stop after battle")
                    self.start(label, "restart")
                elif now - st["due"] >= self.wait_s:
                    self.stop(label, "stop cut")
                    self.start(label, "restart")

    def stop_all(self):
        for label in list(self.state):
            self.stop(label, "stop at end")
        self.state.clear()


def client_starts(out):
    """Each client's start times from client-events.tsv, by its folder name."""
    starts = {}
    for e in read_tsv(os.path.join(out, "client-events.tsv")):
        if e["event"].startswith("start") or e["event"] == "restart":
            starts.setdefault(e["client"], []).append(seconds_of(e["utc"]))
    return starts


def uptime_of(battle, starts):
    """Seconds the client that fought this battle had been running at its end, or None. A client
    label is FOLDER-LAUNCHER; a battle names its folder and game, and a launcher named after the
    game (roborumble.bat for roborumble) is the one that fought it."""
    t = seconds_of(battle["utc"])
    exact = starts.get(f"{battle['client']}-{battle['game']}")
    cands = [exact] if exact else [v for k, v in starts.items() if k.split("-")[0] == battle["client"]]
    before = [s for v in cands for s in v if s <= t]
    return t - max(before) if before else None


def cmd_clients(args):
    """The clients alone, without a watch: until a STOP file in --out or --hours."""
    launches = [parse_launch(s, args.root) for s in args.launch]
    for _, folder, _ in launches:
        if not os.path.isdir(folder):
            print(f"no such client folder: {folder}", file=sys.stderr)
            return 2
    os.makedirs(args.out, exist_ok=True)
    c = Clients(launches, args.out, args.restart_minutes * 60, args.wait_minutes * 60)
    end = time.time() + args.hours * 3600 if args.hours > 0 else None
    try:
        c.start_all()
        while (end is None or time.time() < end) and not os.path.exists(os.path.join(args.out, "STOP")):
            c.poll()
            time.sleep(args.every)
    except KeyboardInterrupt:
        pass
    finally:
        c.stop_all()
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
    battles = watch_battles(out)
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
    pairings = PagePairings(out)
    fell = [(b, h) for b, h in joined if is_collapse(b, pairings)]
    if joined:
        lines.append(f"## Collapses: 1v1 battles {COLLAPSE_MARGIN:.0f}+ under the pairing's live score")
        lines.append("")
        if not any(pairings(b["hadur"]) for b, _ in joined):
            lines.append("No saved roborumble page to score the pairings against.")
        else:
            lines.append("| Time (UTC) | Opponent | Share | Pairing | Rounds won | Skipped | Shield verdict |")
            lines.append("|---|---|---:|---:|---|---:|---|")
            for b, h in fell:
                lines.append(f"| {b['utc']} | {b['opponent']} | {b['share']:.1f} | {pairings(b['hadur'])[b['opponent']][0]:.1f} | "
                             f"{b['won']}-{b['lost']} | {h['skipped'] if h else '?'} | {h['shielder'] if h else '?'} |")
            if not fell:
                lines.append("| none | | | | | | |")
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
    cevents = read_tsv(os.path.join(out, "client-events.tsv"))
    if cevents:
        lines.append("## Clients (BENCH-121)")
        lines.append("")
        lines.append("| Client | Starts | Restarts after a battle | Restarts that cut one | Exits | Idle disables | Unable to stop | Skipped-turn lines |")
        lines.append("|---|---:|---:|---:|---:|---:|---:|---:|")
        for label in sorted({e["client"] for e in cevents}):
            es = [e["event"] for e in cevents if e["client"] == label]
            lines.append(f"| {label} | {sum(1 for x in es if x.startswith('start') or x == 'restart')} | "
                         f"{es.count('stop after battle')} | {es.count('stop cut')} | {es.count('exited')} | "
                         f"{es.count('idle')} | {es.count('unstoppable')} | {es.count('skipped')} |")
        lines.append("")
        starts = client_starts(out)
        buckets = [(0, 5), (5, 10), (10, 15), (15, 30), (30, None)]
        rows = []
        for b, h in joined:
            up = uptime_of(b, starts)
            # The join matches on opponent and time; keep only a record from the battle's own client.
            if up is not None and h and h.get("client", b["client"]) in (b["client"], ""):
                rows.append((up / 60.0, int(h["skipped"]), b["share"]))
        if rows:
            lines.append("1v1 battles by how long their client had been running:")
            lines.append("")
            lines.append("| Minutes since start | Battles | Skipped turns mean | Mean share |")
            lines.append("|---|---:|---:|---:|")
            for lo, hi in buckets:
                rs = [r for r in rows if r[0] >= lo and (hi is None or r[0] < hi)]
                if rs:
                    sh = [r[2] for r in rs if r[2] is not None]
                    lines.append(f"| {lo}-{hi if hi is not None else ''} | {len(rs)} | "
                                 f"{sum(r[1] for r in rs) / len(rs):.1f} | "
                                 f"{(sum(sh) / len(sh)) if sh else float('nan'):.2f} |")
            lines.append("")
        bad = [e for e in cevents if e["event"] in ("idle", "unstoppable")]
        if bad:
            lines.append("Disables and threads the engine could not stop:")
            lines.append("")
            for e in bad[-40:]:
                lines.append(f"- {e['utc']} {e['client']} {e['event']}: {e['detail']}")
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
    w.add_argument("--client", action="append", default=[])
    w.add_argument("--launch", action="append", default=[],
                   help="BENCH-121: FOLDER:LAUNCHER under --root, e.g. rr01:roborumble.bat; the watch starts, logs and restarts it")
    w.add_argument("--root", default=".", help="the folder --launch folders are under")
    w.add_argument("--restart-minutes", type=float, default=15.0)
    w.add_argument("--wait-minutes", type=float, default=10.0,
                   help="after a restart is due, how long to wait for a battle end before restarting anyway")
    w.add_argument("--out", required=True)
    w.add_argument("--page", action="append", default=[], help='"game:robot version", e.g. "roborumble:hadur2.Hadur 3.11"')
    w.add_argument("--robot", action="append", default=[],
                   help='keep only battles of this Hadur, e.g. "hadur2.Hadur 3.17"; repeatable, default all')
    w.add_argument("--stop-collapses", type=int, default=0,
                   help="stop once this many collapses (1v1 battles 15+ under the pairing's live score) are kept; 0 never")
    w.add_argument("--stop-battles", type=int, default=0, help="stop once this many 1v1 battles are kept; 0 never")
    w.add_argument("--new-only", action="store_true",
                   help="keep only battles fought after the watch first started (out/started.txt)")
    w.add_argument("--grace", type=float, default=60.0,
                   help="seconds of health polling after a count stop, for the last battle's record")
    w.add_argument("--every", type=float, default=5.0)
    w.add_argument("--page-every", type=float, default=900.0)
    w.add_argument("--profiles-every", type=float, default=3600.0)
    w.add_argument("--hours", type=float, default=0.0, help="stop after this long at most; 0 runs until Ctrl-C or a count stop")
    w.add_argument("--data", action="append", default=[], help="Hadur's data folder, if the search under robots/.data misses it")
    p = sub.add_parser("profiles")
    p.add_argument("dir")
    p.add_argument("--out")
    d = sub.add_parser("page-diff")
    d.add_argument("old")
    d.add_argument("new")
    c = sub.add_parser("clients")
    c.add_argument("--launch", action="append", required=True)
    c.add_argument("--root", default=".")
    c.add_argument("--out", required=True)
    c.add_argument("--restart-minutes", type=float, default=15.0)
    c.add_argument("--wait-minutes", type=float, default=10.0)
    c.add_argument("--every", type=float, default=5.0)
    c.add_argument("--hours", type=float, default=0.0)
    r = sub.add_parser("report")
    r.add_argument("out")
    r.add_argument("--md")
    args = ap.parse_args(argv)
    return {"watch": cmd_watch, "profiles": cmd_profiles, "page-diff": cmd_page_diff,
            "report": cmd_report, "clients": cmd_clients}[args.cmd](args)


if __name__ == "__main__":
    sys.exit(main())
