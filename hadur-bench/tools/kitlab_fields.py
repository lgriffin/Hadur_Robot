#!/usr/bin/env python3
"""Stratified bench fields for the MiniRumble and MicroRumble 1v1 entries (docs/kitlab.md, KIT-9).

A division's APS is the flat mean of a bot's score over every pairing, so a sample that stands for
the whole division needs the top bots by name (they decide the rank) and the rest drawn evenly
across the ranking. This writes a bench set file (`name | role | jar | weight`, the weight column the Java bench reads too) with:

  top    the division's first TOP bots, each weight 1;
  band   the rest split into BANDS rank bands, one bot drawn from each (fixed seed), each weight
         (division size - TOP) / BANDS, so the weighted mean estimates the division mean.

The weight is the set file's role column (`top:1`, `band:13.9`), which kitlab_read.py reads back.

  python3 tools/kitlab_fields.py RANKINGS.json PARTICIPANTS.raw --top 12 --bands 36 --seed 1 \
      --skip hadur117. --out kitlab-mini.txt [--urls urls.tsv]

RANKINGS.json is LiteRumble's `Rankings?game=<rumble>&api=true`; PARTICIPANTS.raw is the
RoboRumble participants page (`?action=raw`), for the download URL of each jar (--urls writes
`jar<TAB>url` for fetching).
"""
import argparse
import json
import random


def participants(path):
    urls = {}
    for line in open(path, encoding="utf-8", errors="replace"):
        line = line.strip()
        if "," not in line or line.startswith(("<", "{", "|", "#")):
            continue
        name, url = line.split(",", 1)
        if url.startswith("http"):
            urls[name.strip()] = url.strip()
    return urls


def jar_name(bot):
    return bot.replace(" ", "_") + ".jar"


def draw(names, top, bands, seed, skip=()):
    """The top `top` names, then one name from each of `bands` even rank bands of the rest."""
    names = [n for n in names if not any(n.startswith(s) for s in skip)]
    head, rest = names[:top], names[top:]
    rng = random.Random(seed)
    picked = []
    for b in range(bands):
        lo, hi = b * len(rest) // bands, (b + 1) * len(rest) // bands
        if hi > lo:
            picked.append(rest[rng.randrange(lo, hi)])
    weight = len(rest) / max(1, len(picked))
    return [(n, 1.0) for n in head] + [(n, weight) for n in picked], len(names)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("rankings")
    ap.add_argument("participants")
    ap.add_argument("--top", type=int, default=12)
    ap.add_argument("--bands", type=int, default=36)
    ap.add_argument("--seed", type=int, default=1)
    ap.add_argument("--skip", action="append", default=[])
    ap.add_argument("--out", required=True)
    ap.add_argument("--urls")
    a = ap.parse_args()
    ranking = json.load(open(a.rankings))
    names = [b["name"] for b in ranking]
    aps = {b["name"]: b["APS"] for b in ranking}
    urls = participants(a.participants)
    field, size = draw(names, a.top, a.bands, a.seed, a.skip)
    with open(a.out, "w") as f:
        f.write("# kitlab_fields.py: %d of %d bots (top %d by name, %d rank bands), seed %d\n"
                % (len(field), size, a.top, a.bands, a.seed))
        f.write("# name | role (top:weight or band:weight) | jar | weight; the weighted mean of score share estimates APS\n")
        for n, w in field:
            role = ("top:%g" if w == 1.0 else "band:%.4f") % w
            f.write("%s | %s | %s | %.4f\n" % (n, role, jar_name(n), w))
    if a.urls:
        with open(a.urls, "w") as f:
            for n, _ in field:
                f.write("%s\t%s\n" % (jar_name(n), urls.get(n, "")))
    print("%s: %d bots, live mean APS of the sample %.2f" % (
        a.out, len(field), sum(aps[n] * w for n, w in field) / sum(w for _, w in field)))


if __name__ == "__main__":
    main()
