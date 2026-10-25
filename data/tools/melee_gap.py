#!/usr/bin/env python3
"""Where Hadur's MeleeRumble gap to a robot above it lives (docs/plan-melee-top5.md).

  python3 data/tools/melee_gap.py live RANKINGS.html HADUR.html PEER.html...
  python3 data/tools/melee_gap.py census REPORT.md RANKINGS.html [--build "hadur2.Hadur 3.14"]

live: LiteRumble pages saved as HTML (Rankings?game=meleerumble and BotDetails). For each peer,
the APS it gains over Hadur, split by the opponent's melee rank band: the band's mean
per-opponent difference times its share of the common opponents, so the bands sum to the
gap. The page's per-opponent survival column (rounds won with that opponent in the battle)
is shown beside it.

census: a melee census report written by the bench suite runner (the markdown with one
"Melee bench" section per field). Hadur's rounds won by the strongest opponent in the field,
the rounds that ended as a duel and Hadur's win rate in them by the survivor's rank band, and
the rounds Hadur died before the last two.

Standard library only.
"""

import argparse
import html
import re
import statistics
import sys
from collections import defaultdict

BANDS = ((1, 10), (11, 30), (31, 60), (61, 100), (101, 200), (201, 300), (301, None))


def band_label(band):
    lo, hi = band
    return "%d+" % lo if hi is None else "%d-%d" % (lo, hi)


def band_of(rank):
    for b in BANDS:
        if rank >= b[0] and (b[1] is None or rank <= b[1]):
            return b
    return None


def _rows(text):
    for tr in re.findall(r"<tr.*?</tr>", text, re.S):
        yield [html.unescape(re.sub(r"<.*?>", "", c)).strip()
               for c in re.findall(r"<t[dh].*?</t[dh]>", tr, re.S)]


def read_rankings(text):
    """Robot name to (rank, APS) from a Rankings page."""
    out = {}
    for c in _rows(text):
        if len(c) >= 4 and c[0].isdigit():
            out[c[2]] = (int(c[0]), float(c[3]))
    return out


def read_details(text):
    """(summary, per-opponent) from a BotDetails page: summary maps label to text,
    per-opponent maps name to (APS, survival, battles)."""
    summary, per = {}, {}
    for c in _rows(text):
        if len(c) == 2:
            summary[c[0]] = c[1]
        elif len(c) >= 10 and c[0].isdigit():
            per[c[2]] = (float(c[4]), float(c[7]), int(c[9]))
    return summary, per


def live_gap(hadur, peer, ranks):
    """Rows (band, n, Hadur APS, peer APS, contribution, Hadur survival, peer survival) and the
    total gap over the opponents both have met and the rankings name."""
    common = [o for o in hadur if o in peer and o in ranks]
    by = defaultdict(list)
    for o in common:
        by[band_of(ranks[o][0])].append(o)
    rows, total = [], 0.0
    for b in BANDS:
        os_ = by.get(b)
        if not os_:
            continue
        h = statistics.mean(hadur[o][0] for o in os_)
        p = statistics.mean(peer[o][0] for o in os_)
        contrib = (p - h) * len(os_) / len(common)
        total += contrib
        rows.append((b, len(os_), h, p, contrib,
                     statistics.mean(hadur[o][1] for o in os_),
                     statistics.mean(peer[o][1] for o in os_)))
    return rows, total


SECTION = re.compile(r"\n## ")
HEAD = re.compile(r"\| ([\d.]+) \| ([\d.]+) \| (\d+) / (\d+) \| ([\d.]+) \|")
ROBOT = re.compile(r"\| (\S[^|]*?) \| [\d.]+ \| [\d.]+% \| (\d+) \|")
DUEL = re.compile(r"\| (\S[^|]*?) \| (\d+) \| (\d+)% \|")
DIED = re.compile(r"Hadur died in (\d+) of (\d+) rounds")


def read_census(text, build):
    """One dict per field for the build: aps, rounds, won, robots {name: firsts},
    duels {survivor: (rounds, won)}, died."""
    fields = []
    for s in SECTION.split(text):
        if not s.startswith("Melee bench") or (build + " against") not in s:
            continue
        m = HEAD.search(s)
        robots = {}
        table = s.split("| Robot | Mean place", 1)[1].split("Hadur per battle", 1)[0]
        for name, firsts in ROBOT.findall(table):
            robots[name] = int(firsts)
        duels = {}
        if "Rounds that ended as a duel" in s:
            part = s.split("Rounds that ended as a duel", 1)[1].split("Hadur died", 1)[0]
            for name, n, pct in DUEL.findall(part):
                duels[name] = (int(n), int(n) * int(pct) / 100.0)
        d = DIED.search(s)
        fields.append({"aps": float(m.group(1)), "rounds": int(m.group(4)),
                       "won": int(m.group(3)), "robots": robots, "duels": duels,
                       "died": int(d.group(1)) if d else 0})
    return fields


def census_read(fields, ranks):
    """Rounds won by the field's strongest opponent band, and duel endings by survivor band
    (rounds, won, per battle). Battles are counted as rounds / 35."""
    won_by = defaultdict(lambda: [0, 0])
    duel_by = defaultdict(lambda: [0.0, 0.0])
    rounds = won = died = 0
    for f in fields:
        best = min((ranks.get(n, (9999,))[0] for n in f["robots"] if not n.startswith("hadur2.")),
                   default=9999)
        b = band_of(best) if best < 9999 else None
        won_by[b][0] += f["won"]
        won_by[b][1] += f["rounds"]
        rounds += f["rounds"]
        won += f["won"]
        died += f["died"]
        for name, (n, w) in f["duels"].items():
            sb = band_of(ranks[name][0]) if name in ranks else None
            duel_by[sb][0] += n
            duel_by[sb][1] += w
    battles = rounds / 35.0 if rounds else 1.0
    return {
        "rounds": rounds, "won": won, "died": died, "battles": battles,
        "won_by_strongest": {b: (v[0] / v[1]) for b, v in won_by.items() if v[1]},
        "duels": {b: (v[0] / battles, v[1] / battles) for b, v in duel_by.items()},
    }


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n")[0])
    sub = ap.add_subparsers(dest="cmd", required=True)
    lv = sub.add_parser("live")
    lv.add_argument("rankings")
    lv.add_argument("hadur")
    lv.add_argument("peers", nargs="+")
    ce = sub.add_parser("census")
    ce.add_argument("report")
    ce.add_argument("rankings")
    ce.add_argument("--build", default="hadur2.Hadur 3.14")
    a = ap.parse_args(argv)

    def load(p):
        with open(p, encoding="utf-8", errors="ignore") as f:
            return f.read()

    ranks = read_rankings(load(a.rankings))
    if a.cmd == "live":
        hs, h = read_details(load(a.hadur))
        print("Hadur APS %s, survival %s, %d pairings" % (hs.get("APS"), hs.get("Survival"), len(h)))
        for path in a.peers:
            ps, p = read_details(load(path))
            rows, total = live_gap(h, p, ranks)
            print("\n%s (APS %s, survival %s): gap %+.2f" % (path, ps.get("APS"), ps.get("Survival"), total))
            print("| Opponent ranks | n | Hadur | Peer | APS from band | Hadur survival | Peer survival |")
            print("|---|---|---|---|---|---|---|")
            for b, n, hv, pv, c, hsv, psv in rows:
                print("| %s | %d | %.1f | %.1f | %+.2f | %.1f | %.1f |" % (band_label(b), n, hv, pv, c, hsv, psv))
    else:
        r = census_read(read_census(load(a.report), a.build), ranks)
        print("%d rounds, won %.1f%%, died %.1f%%" % (r["rounds"], 100.0 * r["won"] / r["rounds"],
                                                   100.0 * r["died"] / r["rounds"]))
        print("| Strongest opponent in the field | Hadur rounds won |")
        print("|---|---|")
        for b in BANDS:
            if b in r["won_by_strongest"]:
                print("| %s | %.0f%% |" % (band_label(b), 100 * r["won_by_strongest"][b]))
        print("\n| Survivor ranks | Duel endings a battle | Won | Lost | Win rate |")
        print("|---|---|---|---|---|")
        for b in BANDS:
            if b in r["duels"]:
                n, w = r["duels"][b]
                print("| %s | %.2f | %.2f | %.2f | %.0f%% |" % (band_label(b), n, w, n - w, 100 * w / n if n else 0))
    return 0


if __name__ == "__main__":
    sys.exit(main())
