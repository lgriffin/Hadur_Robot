#!/usr/bin/env python3
"""Export a team bench work directory's per-battle results to one flat TSV.

A team battle leaves no result.csv (export_battles.py reads that). What it leaves, under
`<workdir>/battles/<opponent slug>-<seed>[-baseline]/`, is what hadur-bench's TeamRunner and
TeamHarvester write: `team.csv` (final standings of the teams), `rounds.csv` (one row per
round: members alive, won, shots, shots with a mate in the lane, bullets on mates and the
focus-fire ratio) and `member-N.log` (each of our members' log, with the SYSTEM skipped-turn
lines and the R records that carry the round's duress ticks). This script reads those the way
TeamReport does and writes one row per battle, with the team's score, its share of the two
teams' scores, rounds won and survived, skipped turns, duress ticks and the in-lane and
friendly-fire tallies.

  python3 data/tools/export_team.py --work hadur-bench/work/team-top20-3.8-vs-3.7-... \\
      --set hadur-bench/team-top20.txt --build 3.8 --baseline-build 3.7 \\
      --out data/bench/<date>_hadur-team-top20_local_cold.tsv

A battle with no readable standings, or no rounds, is written with ok=false and empty numbers.
Standard library only.
"""

import argparse
import csv
import os
import re
import sys

import export_battles as eb

ROLE_RANK = re.compile(r"^[a-z]+-(\d+)$")

COLUMNS = ["build", "opponent", "role", "rank", "seed", "ok", "rounds", "score", "theirScore", "score_share",
           "firsts", "theirFirsts", "survival", "theirSurvival", "bulletDamage", "theirBulletDamage",
           "roundsWon", "roundsSurvived", "shots", "shotsWithMateInLane", "countBelowTruth",
           "countReports", "bulletsOnMates", "focusFireRatio", "skippedTurns", "duressTicks",
           "faults", "linkRejects"]


def load_set(path):
    """{slug: (name, role, rank)} for every opponent line in a set file."""
    opponents = {}
    with open(path, encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if not line or line.startswith("#"):
                continue
            fields = [c.strip() for c in line.split("|")]
            role = fields[1] if len(fields) > 1 else ""
            m = ROLE_RANK.match(role)
            opponents[eb.slug(fields[0])] = (fields[0], role, m.group(1) if m else "")
    return opponents


def read_lines(path):
    try:
        with open(path, encoding="utf-8") as f:
            return f.read().splitlines()
    except OSError:
        return []


def read_battle(directory, team):
    """{column: value} for one battle directory; empty with ok=false when it did not finish."""
    row = {c: "" for c in COLUMNS}
    row["ok"] = "false"
    standings = read_lines(os.path.join(directory, "team.csv"))
    if len(standings) < 3:
        return row
    ours = None
    theirs = {"score": 0.0, "firsts": 0, "survival": 0, "bulletDamage": 0}
    for line in standings[1:]:
        f = line.split(",")
        if len(f) < 6:
            continue
        if f[1].startswith(team) and ours is None:
            ours = f
        else:
            theirs["score"] += float(f[2])
            theirs["firsts"] += int(f[3])
            theirs["survival"] += int(f[4])
            theirs["bulletDamage"] += int(f[5])
    if ours is None:
        return row

    rounds = won = survived = shots = lane = below = reports = mates = 0
    focus = []
    for line in read_lines(os.path.join(directory, "rounds.csv")):
        if line.startswith("round") or not line:
            continue
        f = line.split(",")
        rounds += 1
        survived += 1 if int(f[1]) > 0 else 0
        won += int(f[3])
        shots += int(f[4])
        lane += int(f[5])
        below += int(f[6])
        reports += int(f[7])
        if len(f) > 8:
            mates += int(f[8])
        if len(f) > 9 and f[9] != "-":
            focus.append(float(f[9]))
    if rounds == 0:
        return row

    skipped = faults = links = duress = 0
    for name in sorted(os.listdir(directory)):
        if not name.startswith("member-"):
            continue
        for line in read_lines(os.path.join(directory, name)):
            second = line.find(",", line.find(",") + 1)
            text = line if second < 0 else line[second + 1:]
            if text.startswith("FAULT,"):
                faults += 1
            elif text.startswith("LINK,"):
                links += 1
            elif text.startswith("SYSTEM:") and "skipped turn" in text:
                skipped += 1
            elif text.startswith("R,"):
                f = text.split(",")
                if len(f) >= 34:
                    try:
                        duress += int(f[33])
                    except ValueError:
                        pass

    score, their = float(ours[2]), theirs["score"]
    values = {
        "ok": "true", "rounds": rounds, "score": ours[2], "theirScore": "%g" % their,
        "score_share": "%.4f" % (score / (score + their)) if score + their else "",
        "firsts": ours[3], "theirFirsts": theirs["firsts"], "survival": ours[4],
        "theirSurvival": theirs["survival"], "bulletDamage": ours[5],
        "theirBulletDamage": theirs["bulletDamage"], "roundsWon": won, "roundsSurvived": survived,
        "shots": shots, "shotsWithMateInLane": lane, "countBelowTruth": below, "countReports": reports,
        "bulletsOnMates": mates, "focusFireRatio": "%.4f" % (sum(focus) / len(focus)) if focus else "",
        "skippedTurns": skipped, "duressTicks": duress, "faults": faults, "linkRejects": links,
    }
    row.update({k: str(v) for k, v in values.items()})
    return row


def collect(work, set_file, build, baseline_build, team):
    battles_dir = os.path.join(work, "battles")
    try:
        dirnames = sorted(n for n in os.listdir(battles_dir) if os.path.isdir(os.path.join(battles_dir, n)))
    except OSError:
        dirnames = []
    opponents = load_set(set_file)
    rows, unmatched = [], []
    for dirname in dirnames:
        m = eb.DIR_RE.match(dirname)
        opp = opponents.get(m.group("slug")) if m else None
        if opp is None:
            unmatched.append(dirname)
            continue
        baseline = m.group("baseline") is not None
        if baseline and not baseline_build:
            print("warning: skipping baseline row for %s (no --baseline-build given)" % dirname, file=sys.stderr)
            continue
        row = read_battle(os.path.join(battles_dir, dirname), team)
        row.update({"build": baseline_build if baseline else build, "opponent": opp[0], "role": opp[1],
                    "rank": opp[2], "seed": m.group("seed")})
        rows.append(row)
    rows.sort(key=lambda r: (0 if r["build"] == build else 1, int(r["rank"]) if r["rank"] else float("inf"),
                             r["opponent"], int(r["seed"])))
    return rows, unmatched


def main():
    p = argparse.ArgumentParser(description=__doc__.splitlines()[0])
    p.add_argument("--work", required=True, help="team bench work directory (holds battles/)")
    p.add_argument("--set", required=True, help="opponent set file (name | role | jar)")
    p.add_argument("--build", required=True, help="label for the candidate team's rows")
    p.add_argument("--baseline-build", default="", help="label for baseline rows; omit to skip them")
    p.add_argument("--team", default="hadur2.HadurTeam", help="our team's class name, as team.csv lists it")
    p.add_argument("--out", required=True, help="TSV file to write")
    a = p.parse_args()
    rows, unmatched = collect(a.work, a.set, a.build, a.baseline_build, a.team)
    with open(a.out, "w", encoding="utf-8", newline="") as f:
        w = csv.DictWriter(f, COLUMNS, delimiter="\t", lineterminator="\n")
        w.writeheader()
        w.writerows(rows)
    ok = sum(1 for r in rows if r["ok"] == "true")
    print("wrote %d rows (%d ok) to %s" % (len(rows), ok, a.out))
    if unmatched:
        print("warning: %d directories matched no opponent in the set: %s" % (len(unmatched), ", ".join(unmatched[:5])),
              file=sys.stderr)
    return 0 if ok else 1


if __name__ == "__main__":
    sys.exit(main())
