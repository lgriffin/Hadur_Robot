#!/usr/bin/env python3
"""Join a shield target list with Hadur's saved BotDetails page and the rankings.

DrussGT 3.1.16 carries a list of 357 robots, `jk/mega/ShieldTargets.java` in its jar, headed
"Bots where jk.precise.EnergyDome 1.8 outscores jk.mega.DrussGT 3.1.12 on APS". Against those
robots it keeps its opening bullet shield up until the projected score share falls under 85%
(99% for everyone else). This script writes one row per listed robot with Hadur's live score
against it, and prints what the list is worth in APS at a few assumed shield scores.

  shield_targets.py --targets ShieldTargets.java \
      --details data/rumble/parsed/<page>_botdetails_hadur2.Hadur_<v>.csv \
      --rankings data/rumble/parsed/<page>_roborumble_rankings.tsv \
      [--shielder data/rumble/parsed/<page>_botdetails_jk.precise.EnergyDome_1.8.csv] \
      [--out data/rumble/parsed/<date>_drussgt-3.1.16_shield-targets_vs_hadur-<v>.tsv]

--targets takes the Java source, or any earlier output of this script (its `name` column).
--shielder is optional: a pure shielder's own BotDetails page. With it the table gains that
robot's score against every opponent, and the summary gives the list Hadur itself would want:
every opponent the shielder scores higher against than Hadur does.

      [--jars data/rumble/parsed/<page>_robowiki_participants_jars.txt \
       --bench-set hadur-bench/shield-list.txt --bench-panel hadur-bench/shield-panel.txt]

writes two hadur-bench opponent sets from the listed robots that have an archive jar on
record: all of them, for the still-target probe, and a panel stratified by Hadur's score for
the paired shield-on, shield-off bench. The panel's weights make the bench's stratified
estimate (BENCH-1) the list's mean score.

Standard library only. The list is Skilgannon's (DrussGT's author); credit it wherever used.
"""

import argparse
import csv
import os
import re
import sys

# Opponent-APS bands, as docs/rumble-climb-top15-plan.md cuts them.
BANDS = [(0.0, 40.0, "under 40"), (40.0, 60.0, "40 to 60"), (60.0, 70.0, "60 to 70"),
         (70.0, 85.9, "70 to 85.9"), (85.9, 101.0, "above 85.9")]

COLUMNS = ["name", "on_list", "hadur_aps", "hadur_survival", "hadur_knnpbi", "battles",
           "opponent_aps", "opponent_rank"]
SHIELDER = ["shielder_aps", "shielder_minus_hadur"]


def read_targets(path):
    """The names in a ShieldTargets.java source, or the `name` column of a TSV made here."""
    text = open(path, encoding="utf-8").read()
    if "\t" in text.splitlines()[0]:
        rows = csv.DictReader(text.splitlines(), delimiter="\t")
        return [r["name"] for r in rows if r.get("on_list", "1") == "1"]
    names = []
    for literal in re.findall(r'"([^"]*)"', text):
        names += [n for n in literal.split(",") if n]
    return names


def read_details(path):
    """A parsed BotDetails page: opponent name -> its row."""
    with open(path, encoding="utf-8", newline="") as f:
        return {r["name"]: r for r in csv.DictReader(f)}


def read_rankings(path):
    """A parsed Rankings page: name -> (rank, APS)."""
    out = {}
    with open(path, encoding="utf-8", newline="") as f:
        for r in csv.DictReader(f, delimiter="\t"):
            out[r["name"]] = (int(r["rank"]), float(r["aps"]))
    return out


def band(aps):
    for lo, hi, label in BANDS:
        if lo <= aps < hi:
            return label
    return BANDS[-1][2]


def build(targets, details, rankings, shielder):
    listed = set(targets)
    rows = []
    for name, d in details.items():
        row = dict.fromkeys(COLUMNS + SHIELDER, "")
        row.update(name=name, on_list="1" if name in listed else "0", hadur_aps=d["aps"],
                   hadur_survival=d["survival"], hadur_knnpbi=d["knnpbi"], battles=d["battles"],
                   opponent_aps=d["opponent_aps"])
        if name in rankings:
            row["opponent_rank"] = str(rankings[name][0])
        if shielder is not None and name in shielder:
            row["shielder_aps"] = shielder[name]["aps"]
            row["shielder_minus_hadur"] = "%.2f" % (float(shielder[name]["aps"]) - float(d["aps"]))
        rows.append(row)
    rows.sort(key=lambda r: (r["on_list"] != "1", r["name"].lower()))
    return rows


# Hadur's score against a listed robot: label, low, high, robots drawn for the panel.
SCORE_BANDS = [("under-70", 0.0, 70.0, 10), ("70-80", 70.0, 80.0, 12), ("80-90", 80.0, 90.0, 12),
               ("90-95", 90.0, 95.0, 6), ("95-up", 95.0, 100.01, 6)]
SILENT = ("sample.SittingDuck 1.0", "sample.Target 1.0")      # they never fire


def score_band(row):
    for label, lo, hi, _ in SCORE_BANDS:
        if lo <= float(row["hadur_aps"]) < hi:
            return label


def bench_entry(row, jars):
    """(name as the bench lists it, jar file or '-' for a bundled sample bot), or None."""
    name = row["name"]
    if name.startswith("sample."):
        return (name.rsplit(" ", 1)[0], "-") if name not in SILENT else None
    jar = name.replace(" ", "_") + ".jar"
    return (name, jar) if jar in jars else None


def write_bench_sets(rows, jars_path, set_path, panel_path, source):
    with open(jars_path, encoding="utf-8") as f:
        jars = {line.strip().rsplit("/", 1)[1] for line in f if line.strip()}
    listed = [r for r in rows if r["on_list"] == "1"]
    by_band = {label: [] for label, _, _, _ in SCORE_BANDS}
    missing = []
    for r in listed:
        entry = bench_entry(r, jars)
        if entry is None:
            missing.append(r["name"])
        else:
            by_band[score_band(r)].append((r, entry))
    words = {"under-70": "under 70", "70-80": "70 to 80", "80-90": "80 to 90", "90-95": "90 to 95",
             "95-up": "95 and up"}
    origin = [
        "# From DrussGT 3.1.16's shield target list (jk/mega/ShieldTargets.java in its jar, by Skilgannon:",
        '# "Bots where jk.precise.EnergyDome 1.8 outscores jk.mega.DrussGT 3.1.12 on APS"), joined with',
        "# %s." % source,
        "# Written by data/tools/drussgt/shield_targets.py; see docs/druss-route-plan.md, stage D0.",
        "# The role is Hadur's live score band against the robot.",
    ]
    jar_note = "# Jars from https://robocode-archive.strangeautomata.com/robots/<jar>, into opponents/ (not committed)."
    columns = "#   <robot name as Robocode lists it> | <role> | <jar file in opponents/, or - for bundled samples>"
    if set_path:
        lines = ["# The %d robots of DrussGT's shield list that this bench can run, for the still-target probe"
                 % sum(len(v) for v in by_band.values()),
                 "# (hadur-bench/probe)."] + origin + [jar_note, columns]
        for label, _, _, _ in SCORE_BANDS:
            lines += ["", "# Hadur scores %s against these %d" % (words[label], len(by_band[label]))]
            lines += ["%s | shield-%s | %s" % (name, label, jar) for _, (name, jar) in by_band[label]]
        lines += ["", "# Listed but not in this set (%d): no archive jar on record, or a bundled robot that never fires."
                  % len(missing)]
        lines += ["#   " + n for n in missing]
        with open(set_path, "w", encoding="utf-8") as f:
            f.write("\n".join(lines) + "\n")
    if panel_path:
        lines = ["# A panel of DrussGT's shield list, stratified by Hadur's score, for the paired bench of a shield",
                 "# build against the released robot (--baseline, BENCH-2)."] + origin + [
            "# A weight is the band's share of the %d listed pairings, split evenly over its robots here, so the"
            % len(listed),
            "# bench's stratified estimate (BENCH-1) is the list's mean score. Robots are drawn evenly spaced by",
            "# name from those with a jar on record.", jar_note, columns + " | <weight>"]
        for label, _, _, k in SCORE_BANDS:
            have = by_band[label]
            in_band = sum(score_band(r) == label for r in listed)
            picked = [have[int((i + 0.5) * len(have) / k)] for i in range(min(k, len(have)))]
            lines += ["", "# Hadur scores %s: %d of the list, %d here" % (words[label], in_band, len(picked))]
            for _, (name, jar) in picked:
                lines.append("%s | shield-%s | %s | %.5f" % (name, label, jar, in_band / len(listed) / len(picked)))
        with open(panel_path, "w", encoding="utf-8") as f:
            f.write("\n".join(lines) + "\n")


def mean(values):
    values = list(values)
    return sum(values) / len(values) if values else float("nan")


def summary(targets, details, rankings, rows, out=sys.stdout):
    def p(text=""):
        print(text, file=out)

    pairings = len(details)
    listed = [r for r in rows if r["on_list"] == "1"]
    others = [r for r in rows if r["on_list"] == "0"]
    missing = [n for n in targets if n not in details]
    unranked = [n for n in targets if n not in rankings]
    p("targets on the list: %d; met on the details page: %d of %d pairings; not met: %d; "
      "not in the rankings: %d" % (len(targets), len(listed), pairings, len(missing), len(unranked)))
    for label, group in (("on the list", listed), ("not on the list", others)):
        aps = [float(r["hadur_aps"]) for r in group]
        p("%-16s %4d pairings | Hadur score %.2f | survival %.2f | KNN PBI %+.2f | opponent APS %.2f | "
          "APS points dropped %.2f" % (
              label, len(group), mean(aps), mean(float(r["hadur_survival"]) for r in group),
              mean(float(r["hadur_knnpbi"]) for r in group), mean(float(r["opponent_aps"]) for r in group),
              sum(100.0 - a for a in aps) / pairings))
    p()
    p("listed robots by Hadur's score against them:")
    for lo, hi in ((0, 70), (70, 80), (80, 90), (90, 95), (95, 100.01)):
        group = [r for r in listed if lo <= float(r["hadur_aps"]) < hi]
        p("  %3d to %-3d  %3d robots, mean score %.1f, mean opponent APS %.1f" % (
            lo, min(hi, 100), len(group), mean(float(r["hadur_aps"]) for r in group),
            mean(float(r["opponent_aps"]) for r in group)))
    p()
    p("listed robots by their own APS (the top-15 plan's bands):")
    for lo, hi, label in BANDS:
        group = [r for r in listed if lo <= float(r["opponent_aps"]) < hi]
        every = [r for r in rows if lo <= float(r["opponent_aps"]) < hi]
        if not every:
            continue
        lost = sum((100.0 - float(r["hadur_survival"])) * 0.35 for r in group)
        lost_all = sum((100.0 - float(r["hadur_survival"])) * 0.35 for r in every)
        p("  %-11s %3d of %3d pairings | Hadur score %5.1f | PBI %+5.2f | rounds lost per 35, summed "
          "%4.0f of %4.0f (%2.0f%%)" % (
              label, len(group), len(every), mean(float(r["hadur_aps"]) for r in group),
              mean(float(r["hadur_knnpbi"]) for r in group), lost, lost_all,
              100.0 * lost / lost_all if lost_all else 0.0))
    p()
    p("APS the list is worth to Hadur, by arithmetic (%d pairings in the table):" % pairings)
    aps = [float(r["hadur_aps"]) for r in listed]
    for level in (85, 88, 90, 92, 95):
        p("  every listed pairing below %d rises to %d: %+.2f APS | the list's mean rises to %d: %+.2f APS" % (
            level, level, sum(max(0.0, level - a) for a in aps) / pairings, level,
            (level - mean(aps)) * len(aps) / pairings))
    have = [r for r in rows if r["shielder_aps"]]
    if have:
        p()
        better = [r for r in have if float(r["shielder_minus_hadur"]) > 0]
        p("the shielder's own page covers %d of these pairings; it outscores Hadur on %d of them "
          "(%d on the list)" % (len(have), len(better), sum(r["on_list"] == "1" for r in better)))
        p("  ceiling if Hadur took the better of the two scores everywhere: %+.2f APS" % (
            sum(float(r["shielder_minus_hadur"]) for r in better) / pairings))
        on = [r for r in have if r["on_list"] == "1"]
        p("  on the list alone: shielder %.2f against Hadur %.2f, %+.2f APS" % (
            mean(float(r["shielder_aps"]) for r in on), mean(float(r["hadur_aps"]) for r in on),
            sum(float(r["shielder_minus_hadur"]) for r in on) / pairings))


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument("--targets", required=True)
    ap.add_argument("--details", required=True)
    ap.add_argument("--rankings", required=True)
    ap.add_argument("--shielder")
    ap.add_argument("--out")
    ap.add_argument("--jars")
    ap.add_argument("--bench-set")
    ap.add_argument("--bench-panel")
    args = ap.parse_args(argv)
    targets = read_targets(args.targets)
    details = read_details(args.details)
    rankings = read_rankings(args.rankings)
    shielder = read_details(args.shielder) if args.shielder else None
    rows = build(targets, details, rankings, shielder)
    if args.out:
        with open(args.out, "w", encoding="utf-8", newline="") as f:
            w = csv.DictWriter(f, COLUMNS + (SHIELDER if shielder is not None else []), delimiter="\t",
                               lineterminator="\n", extrasaction="ignore")
            w.writeheader()
            w.writerows(rows)
    summary(targets, details, rankings, rows)
    if args.jars and (args.bench_set or args.bench_panel):
        write_bench_sets(rows, args.jars, args.bench_set, args.bench_panel,
                         "Hadur's scores on " + os.path.basename(args.details))
    return 0


if __name__ == "__main__":
    sys.exit(main())
