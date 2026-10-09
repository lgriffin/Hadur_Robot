#!/usr/bin/env python3
"""Paired reading of a 3.11 M4 screen step: candidate minus baseline score share, by band.

    python3 data/tools/screen_paired.py ROWS.tsv ROUNDS.tsv --candidate "hadur2.Hadur 3.10nd" \
        --baseline "hadur2.Hadur 3.10" [--set hadur-bench/screen-311.txt] [--keep-all]

ROWS.tsv and ROUNDS.tsv come from export_battles.py (--rounds-out). Applies the census row rules
(docs/bench/local/2026-10-09_census-311-findings.md): a battle with a security denial, another
Robocode JVM, or duress after round 0 is dropped, and so is its partner on the same opponent and
seed, so every difference is between two kept battles. Each opponent's difference is the mean over
its kept seeds of candidate share minus baseline share (share = score / (score + theirScore) x 100,
the APS scale). The screen is drawn in proportion to band size, so the plain mean over opponents
estimates the APS change over the whole field. Band rows: mean over opponents, 95% normal
interval; APS = band mean x the band share of the set, summed (bands added in quadrature).
Also prints the share of battles with any duress, per build.
Standard library only.
"""
import argparse, collections, csv, math, re, statistics as st

ap = argparse.ArgumentParser(description=__doc__.splitlines()[0])
ap.add_argument("rows")
ap.add_argument("rounds")
ap.add_argument("--candidate", required=True)
ap.add_argument("--baseline", default=None)
ap.add_argument("--set", default="hadur-bench/screen-311.txt")
ap.add_argument("--keep-all", action="store_true", help="skip the census row rules")
a = ap.parse_args()

roles = {}
for line in open(a.set, encoding="utf8"):
    p = [x.strip() for x in line.split("|")]
    if len(p) >= 2 and not line.startswith("#"):
        roles[p[0]] = p[1]

late, duress = set(), collections.defaultdict(bool)
for r in csv.DictReader(open(a.rounds, newline="", encoding="utf8"), delimiter="\t"):
    t = float(r["duressTicks"] or 0)
    key = (r["build"], r["opponent"], r["seed"])
    if t > 0:
        duress[key] = True
        if int(r["round"]) > 0:
            late.add(key)

rows = {}
for r in csv.DictReader(open(a.rows, newline="", encoding="utf8"), delimiter="\t"):
    rows[(r["build"], r["opponent"], r["seed"])] = r

def bad(key):
    r = rows[key]
    if r["ok"] != "true" or r["rounds"] != "35":
        return "failed"
    if (r.get("securityErrors") or "0") not in ("", "0"):
        return "security"
    if (r.get("otherJvms") or "0") not in ("", "0", "-1"):
        return "otherJvms"
    if key in late:
        return "late duress"
    return None

share = lambda r: 100.0 * float(r["score"]) / (float(r["score"]) + float(r["theirScore"]))
band = lambda o: int(m.group(1)) if (m := re.search(r"band(\d+)", roles.get(o, ""))) else 0

dropped = collections.Counter()
diffs = collections.defaultdict(list)
if a.baseline:
    for (b, o, s) in [k for k in rows if k[0] == a.candidate]:
        kc, kb = (b, o, s), (a.baseline, o, s)
        if kb not in rows:
            continue
        why = bad(kc) or bad(kb)
        if why and (why == "failed" or not a.keep_all):
            dropped[why] += 1
            continue
        diffs[o].append(share(rows[kc]) - share(rows[kb]))
    print("pairs dropped:", dict(dropped), "| opponents with a kept pair:", len(diffs))
    per = {o: st.mean(v) for o, v in diffs.items()}
    out = collections.defaultdict(list)
    for o, d in per.items():
        out[band(o)].append(d)
    size = collections.Counter(band(o) for o in roles if band(o))
    total = sum(size.values())
    print("\n| Band | Opponents kept / in set | Mean difference (95%) | APS it adds (95%) |\n|---|---|---|---|")
    aps = hw2 = 0.0
    for k in sorted(out):
        v = out[k]
        m = st.mean(v)
        h = 1.96 * st.stdev(v) / math.sqrt(len(v)) if len(v) > 1 else float("nan")
        w = size[k] / total
        aps += m * w
        hw2 += (w * h) ** 2 if h == h else 0.0
        print(f"| {k} | {len(v)} / {size[k]} | {m:+.2f} ({m - h:+.2f} to {m + h:+.2f}) | {m * w:+.3f} ({(m - h) * w:+.3f} to {(m + h) * w:+.3f}) |")
    hw = math.sqrt(hw2)
    print(f"| All, weighted by the set's band sizes | {sum(len(v) for v in out.values())} / {total} | | {aps:+.3f} ({aps - hw:+.3f} to {aps + hw:+.3f}) |")
    missing = sorted(set(size) - set(out))
    if missing:
        print("\nBands with no kept pair (they add 0):", missing)


print("\n| Build | Battles | With any duress | Duress after round 0 |\n|---|---|---|---|")
for b in sorted({k[0] for k in rows}):
    ks = [k for k in rows if k[0] == b and rows[k]["ok"] == "true"]
    print(f"| {b} | {len(ks)} | {100 * sum(duress[k] for k in ks) / len(ks):.0f}% | {sum(k in late for k in ks)} |")
