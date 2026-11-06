#!/usr/bin/env python3
"""BENCH-188: the per-name ledger (strategy doc, 1v1 tab): for every name Hadur and the eight rivals have all
met, Hadur's live score, each rival's, the best, and the gap in points and APS; the head is the mirror card's panel.

    python3 tools/name_ledger.py --hadur PAGE --rival LABEL=PAGE ... --pairings 1202 --out LEDGER.tsv
            [--panel-out PANEL.txt --panel-from panel-a.txt ... --min-gap 12 --exclude broken-1.11.2.txt]

Pages are RoboRumble BotDetails HTML pages (data/rumble/pages). Names are matched without the version, as
peer_gap.py does. The panel keeps the bench panel line of every name at or above --min-gap whose line one of
--panel-from holds and that is no rival (a rival cannot fight its own copy as an arm). Standard library only.
"""
import argparse
import html
import re


def base(name):
    return name.rsplit(" ", 1)[0] if " " in name else name


def load(path):
    """{name without version: (full name, score share, battles)} of a BotDetails page."""
    t = open(path, encoding="utf-8", errors="replace").read()
    out = {}
    for r in re.findall(r"<tr.*?</tr>", t, re.S):
        c = [html.unescape(re.sub("<[^>]+>", "", x)).strip() for x in re.findall(r"<td.*?</td>", r, re.S)]
        if len(c) > 9 and c[3] == "compare":
            try:
                out[base(c[2])] = (c[2], float(c[4]), int(c[9]))
            except ValueError:
                pass
    return out


def ledger(hadur, rivals, pairings):
    rows = []
    for k, (full, h, nb) in hadur.items():
        got = {lab: p[k][1] for lab, p in rivals.items() if k in p}
        if len(got) < len(rivals):
            continue
        order = sorted(got.items(), key=lambda x: -x[1])
        best_lab, best = order[0]
        rows.append(dict(name=full, key=k, hadur=h, battles=nb, best=best, best_rival=best_lab,
                         gap=best - h, second_gap=order[1][1] - h, aps=(best - h) / pairings, **got))
    rows.sort(key=lambda r: -r["gap"])
    return rows


def main(argv=None):
    ap = argparse.ArgumentParser()
    ap.add_argument("--hadur", required=True)
    ap.add_argument("--rival", nargs="+", required=True, help="LABEL=PAGE")
    ap.add_argument("--pairings", type=float, default=1202)
    ap.add_argument("--out", required=True)
    ap.add_argument("--panel-out")
    ap.add_argument("--panel-from", nargs="*", default=[])
    ap.add_argument("--min-gap", type=float, default=12)
    ap.add_argument("--exclude", nargs="*", default=[], help="panel files whose names are left out (broken jars)")
    ap.add_argument("--drop", nargs="*", default=[], help="names left out of the panel (the rivals fought as arms)")
    a = ap.parse_args(argv)
    rivals = {}
    for spec in a.rival:
        lab, path = spec.split("=", 1)
        rivals[lab] = load(path)
    rows = ledger(load(a.hadur), rivals, a.pairings)
    labs = list(rivals)
    with open(a.out, "w", encoding="utf-8") as f:
        f.write("\t".join(["name", "battles", "hadur"] + labs + ["best", "best_rival", "gap", "second_gap", "aps"]) + "\n")
        for r in rows:
            f.write("\t".join([r["name"], str(r["battles"]), f"{r['hadur']:.1f}"] + [f"{r[l]:.1f}" for l in labs]
                              + [f"{r['best']:.1f}", r["best_rival"], f"{r['gap']:.1f}", f"{r['second_gap']:.1f}",
                                 f"{r['aps']:.4f}"]) + "\n")
    head = [r for r in rows if r["gap"] >= a.min_gap]
    print(f"{len(rows)} names; {len(head)} at {a.min_gap:g}+ points, {sum(r['aps'] for r in head):.2f} APS")
    if a.panel_out:
        skip = set()
        for p in a.exclude:
            skip |= {base(l.split("|")[0].strip()) for l in open(p, encoding="utf-8") if "|" in l and not l.startswith("#")}
        lines = {}
        for p in a.panel_from:
            for l in open(p, encoding="utf-8"):
                if "|" in l and not l.startswith("#"):
                    lines.setdefault(base(l.split("|")[0].strip()), l if l.endswith("\n") else l + "\n")
        own = {base(n) for n in a.drop}
        keep = [lines[r["key"]] for r in head if r["key"] in lines and r["key"] not in skip and r["key"] not in own]
        missing = [r["name"] for r in head if r["key"] not in lines]
        open(a.panel_out, "w", encoding="utf-8").write("".join(keep))
        print(f"panel: {len(keep)} names; no panel line for {len(missing)}: {', '.join(missing[:20])}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
