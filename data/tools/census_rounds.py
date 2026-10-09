#!/usr/bin/env python3
"""Where a Hadur battle with start-up duress loses its points, round by round (3.11 M3/M4).

    python3 data/tools/census_rounds.py ROUNDS.tsv [ROUNDS.tsv ...] [--build "hadur2.Hadur 3.10"]
        [--set hadur-bench/census-311.txt]

ROUNDS.tsv is a bench rounds table (BENCH-23: one row per battle and round, with role, round,
won, damageDealt, damageTaken, duressTicks, skips). The band comes from the row's role when it
names one (rank<N>-band<B>), else from the opponent's role in --set. A battle counts as "duress"
when any of its rounds spent ticks in duress. For each band the table gives round 0, round 1 and
rounds 2-34 separately: mean damage taken and dealt, rounds lost per 100 (rounds with no outcome
record are left out and counted), and mean skipped turns, for battles with and without duress.
If the duress battles lose their extra damage in round 0 only, the start-up skips are the cause;
if every round is worse, the battle (or its host slot) is. Standard library only.
"""
import argparse, collections, csv, re, statistics

def main():
    ap = argparse.ArgumentParser(description=__doc__.splitlines()[0])
    ap.add_argument("rounds", nargs="+")
    ap.add_argument("--build", default="hadur2.Hadur 3.10")
    ap.add_argument("--set", default="hadur-bench/census-311.txt")
    a = ap.parse_args()
    roles = {}
    try:
        for line in open(a.set):
            parts = [x.strip() for x in line.split("|")]
            if len(parts) >= 2 and not line.startswith("#"):
                roles[parts[0]] = parts[1]
    except OSError:
        pass
    battles = collections.defaultdict(list)
    for f in a.rounds:
        for r in csv.DictReader(open(f, newline=""), delimiter="\t"):
            if r["build"] == a.build:
                battles[(f, r["opponent"], r["seed"])].append(r)
    num = lambda x: float(x) if x not in ("", "NaN", None) else 0.0
    cells = collections.defaultdict(lambda: collections.defaultdict(list))
    unknown = 0
    for rs in battles.values():
        m = (re.search(r"band(\d+)", rs[0].get("role") or "")
             or re.search(r"band(\d+)", roles.get(rs[0]["opponent"], "")))
        band = m.group(1) if m else "?"
        kind = "duress" if any(num(r["duressTicks"]) > 0 for r in rs) else "none"
        for r in rs:
            i = int(r["round"])
            phase = "0" if i == 0 else "1" if i == 1 else "2-34"
            c = cells[(band, kind, phase)]
            c["taken"].append(num(r["damageTaken"])); c["dealt"].append(num(r["damageDealt"]))
            won = str(r["won"]).strip().lower()
            if won in ("true", "1"):
                c["lost"].append(0.0)
            elif won in ("false", "0"):
                c["lost"].append(100.0)
            else:
                unknown += 1
            c["skips"].append(num(r["skips"]))
    print("| Band | Battles | Round | Taken (duress / none) | Dealt (duress / none) | Lost per 100 (duress / none) | Skips (duress / none) |")
    print("|---|---|---|---|---|---|---|")
    for band in sorted({k[0] for k in cells}):
        for phase in ("0", "1", "2-34"):
            d, n = cells[(band, "duress", phase)], cells[(band, "none", phase)]
            if not d["taken"] or not n["taken"]:
                continue
            nb = len(cells[(band, "duress", "0")]["taken"]) + len(cells[(band, "none", "0")]["taken"])
            f = lambda c, k: f"{statistics.mean(c[k]):.1f}" if c[k] else "-"
            print(f"| {band} | {nb} | {phase} | {f(d,'taken')} / {f(n,'taken')} | {f(d,'dealt')} / {f(n,'dealt')} | "
                  f"{f(d,'lost')} / {f(n,'lost')} | {f(d,'skips')} / {f(n,'skips')} |")
    if unknown:
        print(f"\n{unknown} rounds had no outcome record (blank won); they are left out of Lost per 100.")

if __name__ == "__main__":
    main()
