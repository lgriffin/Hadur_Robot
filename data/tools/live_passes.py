#!/usr/bin/env python3
"""Read Hadur's live passes against each other, and class every opponent (issue #151).

    python3 data/tools/live_passes.py drift NEW.csv OLD.csv [--changed FILE] [--shield-java FILE]
    python3 data/tools/live_passes.py collapses PAGE.csv [PAGE.csv ...] [--below 12]
    python3 data/tools/live_passes.py classify --pages PAGE.csv ... [--peers COMPARE.csv ...]
        [--bench TSV ...] [--sets FILE ...] [--shield-java FILE] [--out TSV] [--report MD]

PAGE.csv is a BotDetails page parsed by parse_rumble_page.py; the version is read from its
file name (..._hadur2.Hadur_3.10.csv -> 3.10). COMPARE.csv is a parsed BotCompare page of a
peer (side A) against Hadur (side B).

drift (BENCH-80): two passes of builds that play identically against most of the field are a
natural experiment. Off the opponents the change touched (--changed names them, one per line,
or --shield-java reads ShieldListData.java's entries), the robot is the same, so the mean
pairing difference between the passes is what the live environment did, not the code. Its
interval comes from the pairing differences, so a drift outside it is a pass-level offset the
page's own +/- (which treats every battle as independent) does not show.

collapses (BENCH-81): per page, the single-battle pairings scoring `--below` points or more
under the median of the OTHER pages against the same opponent, with their battle times. A
pass whose collapse count is far from the others' ran under different conditions.

classify (BENCH-82): one row per opponent of the newest page with every pass, a pooled live
score, peers' scores, the bench's, list and set membership, an outcome tier, problem tags and
the APS each tag is worth. The rules are in TIERS and tag() below and in the report's legend.
Standard library only.
"""
import argparse
import csv
import glob
import math
import os
import re
import statistics as st
import sys

Z95 = 1.96
P_DEFAULT = 1215

# Outcome tier by pooled live APS (lower bound inclusive).
TIERS = [(95.0, "sweep"), (85.0, "farm"), (70.0, "mid"), (50.0, "contest"), (-1.0, "loss")]

# Problem tags.
ROUNDS_SURVIVAL = 90.0      # ROUNDS: pooled survival under this
LEAK_SURVIVAL = 95.0        # LEAK: survival at least this ...
LEAK_APS = 85.0             # ... and APS under this
VOLATILE_SPREAD = 20.0      # VOLATILE: passes span this much, or the bot is in a collapse
PEER_GAP = 5.0              # PEERGAP: peers' median beats Hadur's median over its passes by this much
                            # (one bad pass does not make a gap); BENCHSEES: the bench is this far under too
BENCH_GAP = 10.0            # BENCHGAP: bench and pooled live differ by this much
RAM_DAMAGE = 100.0          # rammer: their ram damage score averages this much a 35-round battle on the bench


def version_of(path):
    m = re.search(r"Hadur_([0-9][0-9A-Za-z.]*)\.csv$", os.path.basename(path))
    return m.group(1) if m else os.path.basename(path)


def _f(x):
    return float(str(x).replace("±", "").replace("+/-", "").strip())


def read_page(path):
    """name -> dict(aps, survival, battles, opponent_aps, time) of a parsed BotDetails CSV."""
    out = {}
    with open(path, encoding="utf-8", newline="") as f:
        for r in csv.DictReader(f):
            out[r["name"].strip()] = dict(aps=_f(r["aps"]), survival=_f(r["survival"]),
                                          battles=int(r["battles"]), opponent_aps=_f(r["opponent_aps"]),
                                          time=r.get("latest_battle_utc", ""))
    return out


def read_compare(path):
    """name -> peer's APS against that opponent (side A of a parsed BotCompare CSV)."""
    out = {}
    with open(path, encoding="utf-8", newline="") as f:
        for r in csv.DictReader(f):
            out[r["name"].strip()] = _f(r["a_aps"])
    return out


def peer_of(path):
    m = re.search(r"botcompare_(.+?)_vs_", os.path.basename(path))
    return m.group(1).split("_")[0] if m else os.path.basename(path)


def shield_entries(java_path):
    """The entries of ShieldListData.lines(): the quoted strings inside its array, not its doc."""
    with open(java_path, encoding="utf-8") as f:
        text = f.read()
    body = text[text.index("new String[]"):]
    body = re.sub(r"//[^\n]*", "", body)
    return [s for s in re.findall(r'"([^"]*)"', body) if s.strip() and not s.startswith("#")]


def read_names(path):
    names = []
    with open(path, encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if line and not line.startswith("#"):
                names.append(line.split("|")[0].strip())
    return names


def mean_ci(xs):
    m = st.mean(xs)
    ci = Z95 * st.stdev(xs) / math.sqrt(len(xs)) if len(xs) > 1 else float("nan")
    return m, ci


def drift(new, old, changed=()):
    """Mean pairing difference new - old, split into the changed opponents and the rest."""
    changed = set(changed)
    same, touched = [], []
    for n, a in new.items():
        b = old.get(n)
        if b is None:
            continue
        (touched if n in changed else same).append((n, a["aps"] - b["aps"], a["survival"] - b["survival"]))
    p = len(new)
    out = {}
    for label, rows in (("unchanged", same), ("changed", touched)):
        if not rows:
            continue
        m, ci = mean_ci([r[1] for r in rows])
        out[label] = dict(pairings=len(rows), mean=m, ci=ci,
                          survival=st.mean(r[2] for r in rows), aps=sum(r[1] for r in rows) / p,
                          down5=sum(1 for r in rows if r[1] < -5), up5=sum(1 for r in rows if r[1] > 5))
    return out


def collapses(pages, below=12.0):
    """version -> list of (time, name, points under the other pages' median), one-battle pairings
    only, over the opponents every page has."""
    common = set.intersection(*[set(p) for p in pages.values()])
    out = {}
    for v, page in pages.items():
        others = [p for w, p in pages.items() if w != v]
        rows = []
        for n in common:
            if page[n]["battles"] != 1:
                continue
            ref = st.median(p[n]["aps"] for p in others)
            d = page[n]["aps"] - ref
            if d <= -below:
                rows.append((page[n]["time"], n, d))
        out[v] = dict(collapses=sorted(rows), singles=sum(1 for n in common if page[n]["battles"] == 1),
                      common=len(common))
    return out


def bench_rows(paths, builds):
    """opponent -> dict of lists (share, survival, their ram damage, skipped) over the given builds."""
    csv.field_size_limit(10 ** 9)
    out = {}
    for path in paths:
        with open(path, encoding="utf-8", newline="") as f:
            for r in csv.DictReader(f, delimiter="\t"):
                if r.get("ok") != "true" or r.get("build") not in builds or not r.get("score_share"):
                    continue
                if "META-INF" in (r.get("errors") or ""):
                    continue  # BENCH-84: the opponent was crippled by the bench's class path
                o = out.setdefault(r["opponent"], dict(share=[], survival=[], ram=[], skipped=[]))
                o["share"].append(100.0 * float(r["score_share"]))
                if r.get("survival_share"):
                    o["survival"].append(100.0 * float(r["survival_share"]))
                o["ram"].append(float(r.get("theirRamDamage") or 0))
                o["skipped"].append(int(r.get("skippedTurns") or 0))
    return out


def tier(aps):
    for floor, name in TIERS:
        if aps >= floor:
            return name
    return TIERS[-1][1]


def pooled(passes):
    """Battle-weighted mean of (aps, survival, battles) tuples."""
    b = sum(p[2] for p in passes)
    return (sum(p[0] * p[2] for p in passes) / b, sum(p[1] * p[2] for p in passes) / b, b)


def kind_of(name, ram):
    base = name.split(" ")[0]
    if re.search(r"mirror|mimic", base, re.I):
        return "mirror"
    if ram is not None and ram >= RAM_DAMAGE:
        return "rammer"
    if ram is None and re.search(r"ram", base.split(".")[-1], re.I):
        return "rammer?"
    for size in ("nano", "micro", "mini", "mega"):
        if "." + size + "." in "." + base.lower() + ".":
            return size
    return ""


def row_typical(per, newest, listed):
    """Hadur's typical score against a bot: the median over its passes, or the newest pass alone
    for a listed bot, which the newest build plays differently."""
    if listed or newest not in per:
        return per.get(newest, st.median(per.values()))
    return st.median(per.values())


def tag(row):
    tags = []
    if row["survival"] < ROUNDS_SURVIVAL:
        tags.append("ROUNDS")
    if row["survival"] >= LEAK_SURVIVAL and row["aps"] < LEAK_APS:
        tags.append("LEAK")
    if row["spread"] >= VOLATILE_SPREAD or row["collapse"]:
        tags.append("VOLATILE")
    if row["peer_median"] is not None and row["peer_median"] - row["typical"] >= PEER_GAP:
        tags.append("PEERGAP")
        if row["bench"] is not None and row["peer_median"] - row["bench"] >= PEER_GAP:
            tags.append("BENCHSEES")
    if row["bench"] is not None and abs(row["bench"] - row["aps"]) >= BENCH_GAP:
        tags.append("BENCHGAP")
    return tags


def classify(pages, peers, bench, sets, shield, below=12.0, pool=None, ranks=None):
    """Rows for every opponent of the newest page (the last in pages). pool: the versions whose
    passes count as the same robot for the pooled score (default: the newest two). ranks: name ->
    ladder rank from a parsed Rankings page; without it opponents are ranked by their own APS."""
    versions = list(pages)
    newest = pages[versions[-1]]
    pool = pool or versions[-2:]
    shield = set(shield)
    col = collapses(pages, below) if len(pages) > 2 else {}
    collapsed = {n for v in pool if v in col for _, n, _ in col[v]["collapses"]}
    rows = []
    for n, live in newest.items():
        # A listed robot plays differently from the unlisted build, so only the newest pass counts.
        use = [versions[-1]] if n in shield else [v for v in pool if n in pages[v]]
        aps, surv, battles = pooled([(pages[v][n]["aps"], pages[v][n]["survival"], pages[v][n]["battles"]) for v in use])
        per = {v: pages[v][n]["aps"] for v in versions if n in pages[v]}
        peer = {k: p[n] for k, p in peers.items() if n in p}
        b = bench.get(n)
        ram = st.mean(b["ram"]) if b and b["ram"] else None
        row = dict(name=n, opponent_aps=live["opponent_aps"], aps=aps, survival=surv, battles=battles,
                   per=per, typical=row_typical(per, versions[-1], n in shield),
                   spread=(max(per.values()) - min(per.values())) if len(per) > 1 else 0.0,
                   collapse=n in collapsed, peers=peer,
                   peer_median=st.median(peer.values()) if peer else None,
                   bench=st.mean(b["share"]) if b else None, bench_n=len(b["share"]) if b else 0,
                   bench_skipped=st.mean(b["skipped"]) if b else None,
                   kind=kind_of(n, ram), shield=n in shield,
                   sets=sorted(k for k, names in sets.items() if n in names))
        row["tier"] = tier(aps)
        row["tags"] = tag(row)
        # Signed, so noise in single pairings cancels over a group instead of only adding.
        row["peer_gap"] = row["peer_median"] - aps if row["peer_median"] is not None else 0.0
        rows.append(row)
    order = sorted(rows, key=lambda r: -r["opponent_aps"])
    for i, r in enumerate(order, 1):
        r["rank"] = (ranks or {}).get(r["name"], i)
    return rows


def _n(x, places=2, signed=False):
    if x is None or (isinstance(x, float) and math.isnan(x)):
        return ""
    return (("{:+.%df}" if signed else "{:.%df}") % places).format(x)


def write_tsv(rows, versions, peer_names, path):
    cols = (["rank", "name", "opponent_aps", "tier", "tags", "kind", "shield", "pooled_aps", "pooled_survival",
             "pooled_battles"] + ["live_" + v for v in versions] + ["typical", "spread", "collapse"]
            + ["peer_" + p for p in peer_names] + ["peer_median", "peer_gap", "bench_aps", "bench_battles",
                                                   "bench_skipped", "sets"])
    with open(path, "w", encoding="utf-8", newline="") as f:
        w = csv.writer(f, delimiter="\t", lineterminator="\n")
        w.writerow(cols)
        for r in sorted(rows, key=lambda r: r["rank"]):
            w.writerow([r["rank"], r["name"], _n(r["opponent_aps"]), r["tier"], ",".join(r["tags"]), r["kind"],
                        "yes" if r["shield"] else "", _n(r["aps"]), _n(r["survival"]), r["battles"]]
                       + [_n(r["per"].get(v)) for v in versions] + [_n(r["typical"]), _n(r["spread"]), "yes" if r["collapse"] else ""]
                       + [_n(r["peers"].get(p)) for p in peer_names]
                       + [_n(r["peer_median"]), _n(r["peer_gap"], signed=True), _n(r["bench"]), r["bench_n"],
                          _n(r["bench_skipped"], 1), ",".join(r["sets"])])


BANDS = [(1, 20), (21, 50), (51, 150), (151, 400), (401, 700), (701, 10 ** 6)]


def summarise(rows, p=None):
    """Counts and APS worth by tier, tag, kind and band. 'room' is the APS the bots would add at
    the peers' median score, net: sum(peer_gap) / P, signed so that single-pairing noise cancels."""
    p = p or len(rows)
    def agg(sel):
        rs = [r for r in rows if sel(r)]
        if not rs:
            return None
        return dict(bots=len(rs), aps=st.mean(r["aps"] for r in rs), survival=st.mean(r["survival"] for r in rs),
                    contribution=sum(r["aps"] for r in rs) / p, room=sum(r["peer_gap"] for r in rs if r["peer_median"] is not None) / p)
    out = dict(tiers={}, tags={}, kinds={}, bands={})
    for _, t in TIERS:
        out["tiers"][t] = agg(lambda r, t=t: r["tier"] == t)
    for t in ("ROUNDS", "LEAK", "VOLATILE", "PEERGAP", "BENCHSEES", "BENCHGAP"):
        out["tags"][t] = agg(lambda r, t=t: t in r["tags"])
    out["tags"]["(none)"] = agg(lambda r: not r["tags"])
    for k in sorted({r["kind"] for r in rows}):
        out["kinds"][k or "(other)"] = agg(lambda r, k=k: r["kind"] == k)
    for lo, hi in BANDS:
        out["bands"]["%d-%s" % (lo, hi if hi < 10 ** 6 else "")] = agg(lambda r, lo=lo, hi=hi: lo <= r["rank"] <= hi)
    out["total_room"] = sum(r["peer_gap"] for r in rows if r["peer_median"] is not None) / p
    return out


def render_summary(s, title):
    lines = ["## " + title, ""]
    for key, head in (("tiers", "Tier"), ("tags", "Tag"), ("kinds", "Kind"), ("bands", "Ranks")):
        lines += ["| %s | Bots | Hadur APS | Survival | APS contribution | Net room at peers' median |" % head,
                  "|---|---:|---:|---:|---:|---:|"]
        for k, a in s[key].items():
            if a:
                lines.append("| %s | %d | %.1f | %.1f | %.2f | %+.2f |"
                             % (k, a["bots"], a["aps"], a["survival"], a["contribution"], a["room"]))
        lines.append("")
    lines.append("Net room over the whole field at the peers' median: **%+.2f APS**." % s["total_room"])
    return "\n".join(lines) + "\n"


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    sub = ap.add_subparsers(dest="cmd", required=True)
    d = sub.add_parser("drift")
    d.add_argument("new")
    d.add_argument("old")
    d.add_argument("--changed")
    d.add_argument("--shield-java")
    c = sub.add_parser("collapses")
    c.add_argument("pages", nargs="+")
    c.add_argument("--below", type=float, default=12.0)
    k = sub.add_parser("classify")
    k.add_argument("--pages", nargs="+", required=True)
    k.add_argument("--peers", nargs="*", default=[])
    k.add_argument("--bench", nargs="*", default=[])
    k.add_argument("--builds", nargs="*", default=["hadur2.Hadur 3.9", "hadur2.Hadur 3.10"])
    k.add_argument("--sets", nargs="*", default=[])
    k.add_argument("--shield-java")
    k.add_argument("--below", type=float, default=12.0)
    k.add_argument("--out")
    k.add_argument("--report")
    k.add_argument("--rankings", help="a parsed Rankings TSV, for ladder ranks")
    a = ap.parse_args(argv)

    if a.cmd == "drift":
        changed = []
        if a.changed:
            changed += read_names(a.changed)
        if a.shield_java:
            changed += shield_entries(a.shield_java)
        res = drift(read_page(a.new), read_page(a.old), changed)
        for label, r in res.items():
            print("%-9s %4d pairings  mean %+.2f +/- %.2f  survival %+.2f  APS %+.3f  down>5 %d  up>5 %d"
                  % (label, r["pairings"], r["mean"], r["ci"], r["survival"], r["aps"], r["down5"], r["up5"]))
        return 0
    if a.cmd == "collapses":
        pages = {version_of(p): read_page(p) for p in a.pages}
        for v, r in collapses(pages, a.below).items():
            print("%-8s %3d collapses in %d single-battle pairings (of %d common opponents)"
                  % (v, len(r["collapses"]), r["singles"], r["common"]))
            for t, n, dd in r["collapses"]:
                print("    %s  %+6.1f  %s" % (t, dd, n))
        return 0
    pages = {version_of(p): read_page(p) for p in a.pages}
    peers = {peer_of(p): read_compare(p) for p in a.peers}
    paths = [x for pat in a.bench for x in sorted(glob.glob(pat))]
    bench = bench_rows(paths, set(a.builds))
    sets = {os.path.splitext(os.path.basename(s))[0]: set(read_names(s)) for s in a.sets}
    shield = shield_entries(a.shield_java) if a.shield_java else []
    ranks = None
    if a.rankings:
        with open(a.rankings, encoding="utf-8", newline="") as f:
            ranks = {r["name"].strip(): int(r["rank"]) for r in csv.DictReader(f, delimiter="\t")}
    rows = classify(pages, peers, bench, sets, shield, a.below, ranks=ranks)
    if a.out:
        write_tsv(rows, list(pages), list(peers), a.out)
    s = summarise(rows)
    text = render_summary(s, "Opponents of %s by class" % list(pages)[-1])
    if a.report:
        with open(a.report, "w", encoding="utf-8") as f:
            f.write(text)
    sys.stdout.write(text)
    return 0


if __name__ == "__main__":
    sys.exit(main())
