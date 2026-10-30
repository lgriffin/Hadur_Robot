"""Group a size bot's live gap to a reference by the reference's survival.

Reads LiteRumble BotDetails?api=true JSON files (saved under data/rumble/parsed/)
and prints, for the opponents all of them share, each group's mean APS
difference and its share of the overall gap. Used for docs/bench/live-kitlab-0.2.md:

    python3 data/tools/kitlab_live_gap.py BOT.json REF.json [OTHER.json ...]
"""
import json
import statistics as st
import sys

GROUPS = [("Crushed (97% and up)", 97, 101), ("Easy (90 to 97%)", 90, 97),
          ("Even (75 to 90%)", 75, 90), ("Strong (under 75%)", 0, 75)]


def load(path):
    d = json.load(open(path))
    return d["name"], {p["name"]: p for p in d["pairingsList"]}


def main(paths):
    bots = [load(p) for p in paths]
    names = {n for n, _ in bots}
    common = [o for o in bots[0][1] if o not in names and all(o in rows for _, rows in bots)]
    n = len(common)
    print("shared opponents", n)
    for name, rows in bots:
        print("%-36s APS %.2f survival %.2f" % (name, st.mean(rows[o]["APS"] for o in common),
                                               st.mean(rows[o]["survival"] for o in common)))
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
