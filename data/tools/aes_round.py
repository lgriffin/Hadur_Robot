#!/usr/bin/env python3
"""AES by round: did the surf's first rating of each wave dodge the bullet the engine fired, per arm and
round bucket, and did its danger rank the hit option highest?  The battle-level instrument for a danger
member (docs/bench/gun-oracle.md, 2026-11-09): oracle bits pick candidates, this gates them.

    python3 data/tools/aes_round.py WORKDIR --out REPORT.md [--ref ARM]

WORKDIR is a multi-arm bench run of `aesrec` builds with truth logs on (no --no-truth-log), whose battle
directories are WORKDIR/battles/<slug>-<seed>-<arm>/.  Each record is matched to its bullet by
aes_rank.join_battle.  Per arm and round bucket: waves, the share whose chosen option the bullet hit, the
share where another present option would have missed (avoidable), the share where every option was hit,
how often the blend's danger (VIEW_SCORE, the views mixed with the members) ranked the hit option
strictly top when exactly one option was hit (a tie for top is not top), the same for the views alone
(rebuilt from the logged parts) and for the option's whole first-wave danger, and the bullet damage taken
per wave.  Then the same over all rounds, and per opponent the hit share of each arm against the
reference arm (--ref, `c` when the run has one) over the seeds both arms fought, with a paired mean and
interval over opponents.
"""
import argparse
import math
import os
import re
import sys
from collections import defaultdict

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import aes_rank as A  # noqa: E402

# <slug>-<seed>-<arm>: the arm label as the bench accepts it (hadur.bench.Arms: letters, digits, '.' and '_').
DIR = re.compile(r"^(?P<slug>.+)-(?P<seed>\d+)-(?P<arm>[A-Za-z0-9._]+)$")
BUCKETS = [(0, 0), (1, 2), (3, 6), (7, 14), (15, 34)]
LATE = "35+"
LABELS = ["%2d-%2d" % x for x in BUCKETS] + [LATE]


def bucket(rnd):
    """The round bucket's label, LATE past the last."""
    for lo, hi in BUCKETS:
        if lo <= rnd <= hi:
            return "%2d-%2d" % (lo, hi)
    return LATE


def strictly_top(scores, idx):
    """Whether scores[idx] is above every other entry (a tie for top is not top)."""
    return all(scores[idx] > scores[o] for o in range(len(scores)) if o != idx)


def views_only(terms, views):
    """The views' danger from a record's parts: sum of weight x density over sum of weight x scan weight,
    or the fallback slot when no view had data (NaN parts are skipped)."""
    num = sum(x for x in terms[A.FIXED:A.FIXED + views] if x == x)
    den = sum(x for x in terms[A.FIXED + views:A.FIXED + 2 * views] if x == x)
    if den > 0:
        return num / den
    fb = terms[A.FIXED + 2 * views]
    return fb if fb == fb else -math.inf


def tally(key, rec, hit, present, dmg):
    """Adds one matched wave to a counter dict."""
    ch = rec["chosen"]
    key["waves"] += 1
    key["hit"] += hit[ch]
    key["dmg"] += dmg * hit[ch]
    key["avoidable"] += hit[ch] and any(present[o] and not hit[o] for o in range(3))
    key["allhit"] += all(hit[o] for o in range(3) if present[o])
    hits = [o for o in range(3) if present[o] and hit[o]]
    if len(hits) == 1 and sum(present) >= 2:
        opts = rec["options"]
        key["ranked"] += 1
        vs = [opts[o][1][A.VIEW_SCORE] if present[o] else -math.inf for o in range(3)]
        key["top"] += strictly_top(vs, hits[0])
        fs = [opts[o][1][A.FIRST] if present[o] else -math.inf for o in range(3)]
        key["topfirst"] += strictly_top(fs, hits[0])
        vo = [views_only(opts[o][1], rec["views"]) if present[o] else -math.inf for o in range(3)]
        key["topviews"] += strictly_top(vo, hits[0])


def read(workdir):
    """(stats[arm][bucket], perbot[arm][slug][seed], totals[arm]) over every battle directory."""
    base = os.path.join(workdir, "battles")
    stats = defaultdict(lambda: defaultdict(lambda: defaultdict(float)))
    perbot = defaultdict(lambda: defaultdict(lambda: defaultdict(lambda: defaultdict(float))))
    totals = defaultdict(lambda: defaultdict(int))
    for name in sorted(os.listdir(base)):
        m = DIR.match(name)
        if not m:
            continue
        arm, slug, seed = m.group("arm"), m.group("slug"), int(m.group("seed"))
        rows, st = A.join_battle(os.path.join(base, name))
        for k, v in st.items():
            totals[arm][k] += v
        for rec, heading, power in rows:
            opts = rec["options"]
            present = [o is not None for o in opts]
            if not present[rec["chosen"]]:
                continue
            hit = [o is not None and A.inside(heading, o[1][A.LOW], o[1][A.HIGH]) for o in opts]
            dmg = A.bullet_damage(power)
            tally(stats[arm][bucket(rec["round"])], rec, hit, present, dmg)
            tally(perbot[arm][slug][seed], rec, hit, present, dmg)
    return stats, perbot, totals


def pooled(counters):
    """One counter dict summing the given ones."""
    s = defaultdict(float)
    for c in counters:
        for k, v in c.items():
            s[k] += v
    return s


def rate(s, k, n="waves"):
    return s[k] / s[n] if s[n] else float("nan")


def report(stats, perbot, totals, ref=None):
    """The Markdown report; ref is the reference arm (`c` when present, else the first by name)."""
    arms = sorted(perbot)
    if ref is None:
        ref = "c" if "c" in perbot else (arms[0] if arms else None)
    elif ref not in perbot:
        raise SystemExit("no battles of the reference arm %r; arms here: %s" % (ref, ", ".join(arms)))
    lines = ["# AES by round: first ratings against the real bullet", ""]
    for arm in sorted(totals):
        t = totals[arm]
        lines.append("arm %s: records %d, real %d, matched %d of %d bullets" % (arm, t["records"], t["real"], t["matched"], t["bullets"]))
    lines += ["", "| arm | rounds | waves | hit chosen | avoidable | all hit | blend ranks hit top | views-only top | first ranks hit top | dmg/wave |",
              "|---|---|---|---|---|---|---|---|---|---|"]
    for b in LABELS:
        for arm in sorted(stats):
            s = stats[arm].get(b)
            if not s or not s["waves"]:
                continue
            lines.append("| %s | %s | %d | %.3f | %.3f | %.3f | %.3f | %.3f | %.3f | %.3f |" % (
                arm, b, s["waves"], rate(s, "hit"), rate(s, "avoidable"), rate(s, "allhit"),
                rate(s, "top", "ranked"), rate(s, "topviews", "ranked"), rate(s, "topfirst", "ranked"), rate(s, "dmg")))
    lines += ["", "| arm | waves | hit chosen | avoidable | blend ranks hit top | views-only top | dmg/wave |", "|---|---|---|---|---|---|---|"]
    for arm in sorted(stats):
        s = pooled(stats[arm].values())
        lines.append("| %s | %d | %.3f | %.3f | %.3f | %.3f | %.3f |" % (
            arm, s["waves"], rate(s, "hit"), rate(s, "avoidable"), rate(s, "top", "ranked"), rate(s, "topviews", "ranked"), rate(s, "dmg")))
    if ref is not None and len(arms) >= 2:
        for arm in arms:
            if arm == ref:
                continue
            lines += ["", "## Per opponent: hit share of the chosen option, %s minus %s (seeds both fought)" % (arm, ref), "",
                      "| opponent | seeds | waves | %s | %s | diff |" % (ref, arm), "|---|---|---|---|---|---|"]
            diffs = []
            for slug in sorted(perbot[ref]):
                seeds = sorted(set(perbot[ref][slug]) & set(perbot[arm].get(slug, {})))
                if not seeds:
                    continue
                sc = pooled(perbot[ref][slug][x] for x in seeds)
                sp = pooled(perbot[arm][slug][x] for x in seeds)
                if not sc["waves"] or not sp["waves"]:
                    continue
                hc, hp = rate(sc, "hit"), rate(sp, "hit")
                diffs.append(hp - hc)
                lines.append("| %s | %d | %d | %.3f | %.3f | %+.3f |" % (slug, len(seeds), sc["waves"], hc, hp, hp - hc))
            if diffs:
                n = len(diffs)
                mean = sum(diffs) / n
                sd = (sum((d - mean) ** 2 for d in diffs) / max(1, n - 1)) ** 0.5
                lines += ["", "mean diff %+.4f +- %.4f (95%%), fewer hits on %d of %d opponents" % (mean, 1.96 * sd / n ** 0.5, sum(d < 0 for d in diffs), n)]
    return "\n".join(lines) + "\n"


def main():
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument("workdir")
    ap.add_argument("--out", required=True)
    ap.add_argument("--ref", help="the reference arm (default c when the run has one, else the first by name)")
    a = ap.parse_args()
    text = report(*read(a.workdir), ref=a.ref)
    with open(a.out, "w") as f:
        f.write(text)
    print(text, end="")


if __name__ == "__main__":
    main()
