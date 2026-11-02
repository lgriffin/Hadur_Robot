"""Group a size bot's live gap to a reference by the reference's survival.

Reads LiteRumble BotDetails?api=true JSON files (saved under data/rumble/parsed/)
and prints, for the opponents all of them share, each group's mean APS
difference and its share of the overall gap. Used for docs/bench/live-kitlab-0.2.md:

    python3 data/tools/kitlab_live_gap.py BOT.json REF.json [OTHER.json ...]

With --rank RANKINGS.json (a saved Rankings?api=true list) the opponents are grouped by their
rumble rank instead, with the standard error of each mean (docs/bench/live-kitlab-0.3.md):

    python3 data/tools/kitlab_live_gap.py --rank RANKINGS.json BOT.json REF.json [OTHER.json ...]
"""
import json
import statistics as st
import sys

RANKS = [(1, 15), (16, 30), (31, 60), (61, 120), (121, 250), (251, 450), (451, 10000)]
GROUPS = [("Crushed (97% and up)", 97, 101), ("Easy (90 to 97%)", 90, 97),
          ("Even (75 to 90%)", 75, 90), ("Strong (under 75%)", 0, 75)]


def load(path):
    d = json.load(open(path))
    return d["name"], {p["name"]: p for p in d["pairingsList"]}


def by_rank(rank_path, bots, common):
    order = sorted(json.load(open(rank_path)), key=lambda r: -float(r["APS"]))
    rank = {r["name"]: i + 1 for i, r in enumerate(order)}
    bot, n = bots[0][1], len(common)
    for lo, hi in RANKS:
        g = [o for o in common if lo <= rank.get(o, 10**6) <= hi]
        if len(g) < 2:
            continue
        cols = []
        for other, rows in bots[1:]:
            d = [bot[o]["APS"] - rows[o]["APS"] for o in g]
            cols.append("vs %s %+.2f +-%.2f (share %+.2f)" % (other.split()[0].split(".")[-1], st.mean(d),
                                                            st.stdev(d) / len(g) ** .5, sum(d) / n))
        print("rank %3d to %5d n %3d  %s" % (lo, hi, len(g), "  ".join(cols)))


def main(paths):
    rank_path = None
    if paths[0] == "--rank":
        rank_path, paths = paths[1], paths[2:]
    bots = [load(p) for p in paths]
    names = {n for n, _ in bots}
    common = [o for o in bots[0][1] if o not in names and all(o in rows for _, rows in bots)]
    n = len(common)
    print("shared opponents", n)
    for name, rows in bots:
        print("%-36s APS %.2f survival %.2f" % (name, st.mean(rows[o]["APS"] for o in common),
                                               st.mean(rows[o]["survival"] for o in common)))
    if rank_path:
        by_rank(rank_path, bots, common)
        return
    bot, ref = bots[0][1], bots[1][1]
    for label, lo, hi in GROUPS:
        g = [o for o in common if lo <= ref[o]["survival"] < hi]
        if not g:
            continue
        cols = []
        for other, rows in bots[1:]:
            d = st.mean(bot[o]["APS"] - rows[o]["APS"] for o in g)
            cols.append("vs %s %+.2f (share %+.2f)" % (other.split()[0].split(".")[-1], d, d * len(g) / n))
        ds = st.mean(bot[o]["survival"] - ref[o]["survival"] for o in g)
        print("%-22s n %3d  %s  survival %+.1f" % (label, len(g), "  ".join(cols), ds))


if __name__ == "__main__":
    main(sys.argv[1:])
