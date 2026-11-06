#!/usr/bin/env python3
"""BENCH-188: the duel mirror's per-name read (pc-mirror, strategy doc, 1v1 tab).

    python3 tools/mirror_read.py ARMS.tsv --rivals bb ns sg [--control c] --out REPORT.md --out-tsv READ.tsv

Each rival arm is a rival's own jar fought against the same names on the same seeds as Hadur (c, and aa its
A/A copy). For every name: each arm's score share, survival share, and bullet damage dealt and taken a
round; the rival that scores best on the bench; and where its lead over c comes from: more damage dealt
(the gun), less damage taken (the movement), or survival. That split is the name's specification: what a
per-name entry has to do. Standard library only.
"""
import argparse
import collections
import csv
import math
import statistics

FIELDS = ("share", "surv", "dealt", "taken")


def read(path):
    """{(opponent, arm): [per-battle dict]}."""
    out = collections.defaultdict(list)
    with open(path, newline="", encoding="utf-8") as f:
        for r in csv.DictReader(f, delimiter="\t"):
            if r.get("ok", "true") != "true":
                continue
            try:
                n = float(r["rounds"]) or 1.0
                out[(r["opponent"], r["arm"])].append(dict(
                    share=100 * float(r["score_share"]), surv=100 * float(r["survival_share"]),
                    dealt=float(r["bulletDamage"]) / n, taken=float(r["theirBulletDamage"]) / n))
            except (KeyError, ValueError):
                continue
    return out


def summary(battles):
    if not battles:
        return None
    s = {k: statistics.mean(b[k] for b in battles) for k in FIELDS}
    v = [b["share"] for b in battles]
    s["n"] = len(v)
    s["se"] = statistics.stdev(v) / math.sqrt(len(v)) if len(v) > 1 else float("nan")
    return s


def edge(rival, control):
    """Where a rival's lead comes from: the larger of its gun (dealt more) and movement (taken less) margins."""
    gun, move = rival["dealt"] - control["dealt"], control["taken"] - rival["taken"]
    if max(gun, move) <= 0:
        return "survival" if rival["surv"] > control["surv"] else "none"
    return "gun" if gun >= move else "movement"


def rows(data, rivals, control="c"):
    names = sorted({o for o, _ in data})
    out = []
    for o in names:
        c = summary(data.get((o, control), []))
        if c is None:
            continue
        got = {a: summary(data.get((o, a), [])) for a in rivals}
        got = {a: s for a, s in got.items() if s}
        if not got:
            continue
        best = max(got, key=lambda a: got[a]["share"])
        b = got[best]
        out.append(dict(name=o, c=c, aa=summary(data.get((o, "aa"), [])), arms=got, best=best,
                        gap=b["share"] - c["share"], gun=b["dealt"] - c["dealt"], move=c["taken"] - b["taken"],
                        edge=edge(b, c)))
    out.sort(key=lambda r: -r["gap"])
    return out


def main(argv=None):
    p = argparse.ArgumentParser()
    p.add_argument("arms_tsv")
    p.add_argument("--rivals", nargs="+", required=True)
    p.add_argument("--control", default="c")
    p.add_argument("--out", required=True)
    p.add_argument("--out-tsv", required=True)
    a = p.parse_args(argv)
    rs = rows(read(a.arms_tsv), a.rivals, a.control)
    with open(a.out_tsv, "w", encoding="utf-8") as f:
        f.write("\t".join(["name", "seeds", "c", "aa"] + a.rivals + ["best", "gap", "gun", "move", "edge"]) + "\n")
        for r in rs:
            f.write("\t".join([r["name"], str(r["c"]["n"]), f"{r['c']['share']:.1f}",
                               f"{r['aa']['share']:.1f}" if r["aa"] else ""]
                              + [f"{r['arms'][x]['share']:.1f}" if x in r["arms"] else "" for x in a.rivals]
                              + [r["best"], f"{r['gap']:.1f}", f"{r['gun']:.1f}", f"{r['move']:.1f}", r["edge"]]) + "\n")
    big = [r for r in rs if r["gap"] >= 8]
    by = collections.Counter((r["best"], r["edge"]) for r in big)
    lines = ["# Duel mirror: what each rival takes from a name, and how (BENCH-188)", "",
             f"{len(rs)} names. Rival arms: {', '.join(a.rivals)}; control {a.control}. Shares are score share %, "
             "dealt and taken are bullet damage a round. Gun = the best rival's extra damage dealt, move = the damage "
             "it avoids; edge is the larger.", "",
             f"Names where the best rival is 8+ points above Hadur on the bench: {len(big)}.", ""]
    for (best, e), n in by.most_common():
        lines.append(f"- {best}, {e}: {n}")
    lines += ["", "| Name | Seeds | Hadur | A/A | " + " | ".join(a.rivals) + " | Best | Gap | Gun | Move | Edge |",
              "|---|---:|---:|---:|" + "---:|" * len(a.rivals) + "---|---:|---:|---:|---|"]
    for r in rs:
        lines.append(f"| {r['name']} | {r['c']['n']} | {r['c']['share']:.1f} ± {1.96 * r['c']['se']:.1f} | "
                     + (f"{r['aa']['share']:.1f}" if r["aa"] else "") + " | "
                     + " | ".join(f"{r['arms'][x]['share']:.1f}" if x in r["arms"] else "" for x in a.rivals)
                     + f" | {r['best']} | {r['gap']:+.1f} | {r['gun']:+.1f} | {r['move']:+.1f} | {r['edge']} |")
    open(a.out, "w", encoding="utf-8").write("\n".join(lines) + "\n")
    print("\n".join(lines[:8 + len(by)]))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
