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
(rebuilt from the logged parts) and for the option's whole first-wave danger, the bullet damage taken
per wave as the first rating foresaw it, and the share of waves whose bullet really hit us (the truth log's
enemy bullet vanishes within HIT_PX of us as our energy falls by its damage).  Then the same over all rounds, and per opponent the hit share of each arm against the
reference arm (--ref, `c` when the run has one) over the seeds both arms fought, with a paired mean and
interval over opponents, for the first rating's hits and for the real ones.
"""
import argparse
import gzip
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
# A vanished enemy bullet this close to us (at its last position, to us then or a tick before) hit us.
HIT_PX = 45.0
FIELD_W, FIELD_H = 800.0, 600.0


def read_outcomes(path):
    """{(round, first turn, heading rounded to 3): hit} for every enemy bullet that vanished on the field in the
    truth log: a hit when its last position lies within HIT_PX of us at that tick or the one before and our energy
    fell by at least its damage. A bullet appears one turn after the wave's fire time."""
    out, alive, prev = {}, {}, None
    try:
        f = gzip.open(path, "rt", encoding="utf-8")
    except OSError:
        return out
    with f:
        try:
            for line in f:
                if not line.startswith("T,"):
                    continue
                p = line.rstrip("\n").split(",")
                if len(p) < 13:
                    continue
                r, t = int(p[1]), int(p[2])
                hx, hy, energy = float(p[3]), float(p[4]), float(p[7])
                if prev is None or prev[0] != r:
                    alive = {}
                cur = {}
                if len(p) > 13 and p[13]:
                    for b in p[13].split(" "):
                        q = b.split(":")
                        if q[0] == "E" and len(q) >= 5:
                            cur[(round(float(q[3]), 3), round(float(q[4]), 2))] = (float(q[1]), float(q[2]))
                for k in [k for k in alive if k not in cur]:
                    first, bx, by = alive.pop(k)
                    onfield = 0 < bx < FIELD_W and 0 < by < FIELD_H
                    near = math.hypot(bx - hx, by - hy) < HIT_PX or (
                        prev is not None and math.hypot(bx - prev[2], by - prev[3]) < HIT_PX)
                    fell = prev is not None and prev[4] - energy >= A.bullet_damage(k[1]) - 0.05
                    out[(r, first, k[0])] = bool(onfield and near and fell)
                for k, (bx, by) in cur.items():
                    alive[k] = (alive[k][0], bx, by) if k in alive else (t, bx, by)
                prev = (r, t, hx, hy, energy)
        except (EOFError, OSError, ValueError):
            pass  # a truncated log keeps what was read
    return out


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


def tally(key, rec, hit, present, dmg, real=None):
    """Adds one matched wave to a counter dict; real is whether the bullet hit us (None unknown)."""
    ch = rec["chosen"]
    key["waves"] += 1
    key["hit"] += hit[ch]
    key["dmg"] += dmg * hit[ch]
    if real is not None:
        key["known"] += 1
        key["real"] += real
        key["realdmg"] += dmg * real
    n = len(present)
    key["avoidable"] += hit[ch] and any(present[o] and not hit[o] for o in range(n))
    key["allhit"] += all(hit[o] for o in range(n) if present[o])
    hits = [o for o in range(n) if present[o] and hit[o]]
    if len(hits) == 1 and sum(present) >= 2:
        opts = rec["options"]
        key["ranked"] += 1
        vs = [opts[o][1][A.VIEW_SCORE] if present[o] else -math.inf for o in range(n)]
        key["top"] += strictly_top(vs, hits[0])
        fs = [opts[o][1][A.FIRST] if present[o] else -math.inf for o in range(n)]
        key["topfirst"] += strictly_top(fs, hits[0])
        vo = [views_only(opts[o][1], rec["views"]) if present[o] else -math.inf for o in range(n)]
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
        outcomes = read_outcomes(os.path.join(base, name, "truth.log.gz"))
        for k, v in st.items():
            totals[arm][k] += v
        for rec, heading, power in rows:
            opts = rec["options"]
            present = [o is not None for o in opts]
            if not present[rec["chosen"]]:
                continue
            hit = [o is not None and A.inside(heading, o[1][A.LOW], o[1][A.HIGH]) for o in opts]
            dmg = A.bullet_damage(power)
            real = outcomes.get((rec["round"], rec["fire"] + 1, round(heading, 3)))
            tally(stats[arm][bucket(rec["round"])], rec, hit, present, dmg, real)
            tally(perbot[arm][slug][seed], rec, hit, present, dmg, real)
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
    lines += ["", "| arm | rounds | waves | hit chosen | real hit | avoidable | all hit | blend ranks hit top | views-only top | first ranks hit top | dmg/wave | real dmg/wave |",
              "|---|---|---|---|---|---|---|---|---|---|---|---|"]
    for b in LABELS:
        for arm in sorted(stats):
            s = stats[arm].get(b)
            if not s or not s["waves"]:
                continue
            lines.append("| %s | %s | %d | %.3f | %.3f | %.3f | %.3f | %.3f | %.3f | %.3f | %.3f | %.3f |" % (
                arm, b, s["waves"], rate(s, "hit"), rate(s, "real", "known"), rate(s, "avoidable"), rate(s, "allhit"),
                rate(s, "top", "ranked"), rate(s, "topviews", "ranked"), rate(s, "topfirst", "ranked"), rate(s, "dmg"),
                rate(s, "realdmg", "known")))
    lines += ["", "| arm | waves | hit chosen | real hit | avoidable | blend ranks hit top | views-only top | dmg/wave | real dmg/wave |",
              "|---|---|---|---|---|---|---|---|---|"]
    for arm in sorted(stats):
        s = pooled(stats[arm].values())
        lines.append("| %s | %d | %.3f | %.3f | %.3f | %.3f | %.3f | %.3f | %.3f |" % (
            arm, s["waves"], rate(s, "hit"), rate(s, "real", "known"), rate(s, "avoidable"), rate(s, "top", "ranked"),
            rate(s, "topviews", "ranked"), rate(s, "dmg"), rate(s, "realdmg", "known")))
    if ref is not None and len(arms) >= 2:
        for arm in arms:
            if arm == ref:
                continue
            for what, num, den in (("hit share of the chosen option at the first rating", "hit", "waves"),
                                   ("real hit share", "real", "known")):
                lines += ["", "## Per opponent: %s, %s minus %s (seeds both fought)" % (what, arm, ref), "",
                          "| opponent | seeds | waves | %s | %s | diff |" % (ref, arm), "|---|---|---|---|---|---|"]
                diffs = []
                for slug in sorted(perbot[ref]):
                    seeds = sorted(set(perbot[ref][slug]) & set(perbot[arm].get(slug, {})))
                    if not seeds:
                        continue
                    sc = pooled(perbot[ref][slug][x] for x in seeds)
                    sp = pooled(perbot[arm][slug][x] for x in seeds)
                    if not sc[den] or not sp[den]:
                        continue
                    hc, hp = rate(sc, num, den), rate(sp, num, den)
                    diffs.append(hp - hc)
                    lines.append("| %s | %d | %d | %.3f | %.3f | %+.3f |" % (slug, len(seeds), sc[den], hc, hp, hp - hc))
                if diffs:
                    n = len(diffs)
                    mean = sum(diffs) / n
                    sd = (sum((d - mean) ** 2 for d in diffs) / max(1, n - 1)) ** 0.5
                    lines += ["", "mean diff %+.4f +- %.4f (95%%), fewer hits on %d of %d opponents" % (
                        mean, 1.96 * sd / n ** 0.5, sum(d < 0 for d in diffs), n)]
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
