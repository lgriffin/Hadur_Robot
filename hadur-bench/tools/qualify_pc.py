#!/usr/bin/env python3
"""Qualify the PC's RoboRumble clients before they upload a release's first pass (BENCH-125).

    python3 tools/qualify_pc.py upload off C:/RoboRumbleWorkers/rr01 C:/RoboRumbleWorkers/rr02
    python3 tools/qualify_pc.py score ../data/live/qualify-3.18.1 --clean CLEAN.csv --robot "hadur2.Hadur 3.18.1"
    python3 tools/qualify_pc.py upload on C:/RoboRumbleWorkers/rr01 C:/RoboRumbleWorkers/rr02

3.18's first pass came 98.6% from the PC's release watch, which scored about 3 points under 3.17's
clean pairings (thread "Investigate the 3.18 live collapse"). `upload off` sets UPLOAD=NOT in each
client's roborumble/roborumble.txt (keeping a .qualify-bak copy), `upload on` puts the copy back and
sets each results file (OUTPUT=) aside as <file>.qualify-<n>, so the test battles are never uploaded;
`score` compares each 1v1 battle the watch kept (battles.tsv) with the same opponent's pairing on a
clean page (a parsed BotDetails CSV) and writes qualify.md: QUALIFIED when the mean lies within
±BAR of it, NOT QUALIFIED otherwise.
"""
import argparse
import csv
import math
import os
import re
import shutil
import statistics
import sys

BAR = 0.5
MIN_BATTLES = 40


def config(folder):
    return os.path.join(folder, "roborumble", "roborumble.txt")


def results_files(folder):
    out = []
    rr = os.path.join(folder, "roborumble")
    for name in sorted(os.listdir(rr)) if os.path.isdir(rr) else []:
        if name.endswith(".txt"):
            with open(os.path.join(rr, name), encoding="utf-8", errors="replace") as f:
                for line in f:
                    m = re.match(r"\s*OUTPUT\s*=\s*(\S.*?)\s*$", line)
                    if m:
                        out.append(os.path.normpath(os.path.join(folder, m.group(1))))
    return sorted(set(out))


def set_aside(path):
    n = 1
    while os.path.exists(f"{path}.qualify-{n}"):
        n += 1
    shutil.move(path, f"{path}.qualify-{n}")
    return f"{path}.qualify-{n}"


def upload(mode, folders):
    for folder in folders:
        path, bak = config(folder), config(folder) + ".qualify-bak"
        if mode == "off":
            if not os.path.exists(bak):
                shutil.copy2(path, bak)
            with open(path, encoding="utf-8", errors="replace") as f:
                text = f.read()
            new, n = re.subn(r"(?m)^\s*UPLOAD\s*=.*$", "UPLOAD=NOT", text)
            if n == 0:
                new = text.rstrip("\n") + "\nUPLOAD=NOT\n"
            with open(path, "w", encoding="utf-8") as f:
                f.write(new)
            print(f"{path}: UPLOAD=NOT (copy in {bak})")
        else:
            for res in results_files(folder):
                if os.path.exists(res):
                    print(f"{res}: test battles set aside as {set_aside(res)}")
            if os.path.exists(bak):
                shutil.move(bak, path)
                print(f"{path}: restored from {bak}")
            else:
                print(f"{path}: no {bak}, left as it is")


def clean_pairings(path):
    with open(path, encoding="utf-8") as f:
        return {r["name"]: float(r["aps"]) for r in csv.DictReader(f)}


def residuals(battles_tsv, clean, robot):
    out = []
    if not os.path.exists(battles_tsv):
        return out
    with open(battles_tsv, encoding="utf-8") as f:
        for b in csv.DictReader(f, delimiter="\t"):
            if b["game"] == "roborumble" and b["hadur"] == robot and b["opponent"] in clean:
                out.append((b["client"], float(b["share"]) - clean[b["opponent"]]))
    return out


def verdict(values, bar=BAR, min_battles=MIN_BATTLES):
    """(mean, half-width of the 95% interval, label) for share minus clean pairing."""
    if len(values) < min_battles:
        return (statistics.mean(values) if values else 0.0), 0.0, f"TOO FEW BATTLES ({len(values)} < {min_battles})"
    mean = statistics.mean(values)
    ci = 1.96 * statistics.stdev(values) / math.sqrt(len(values))
    return mean, ci, ("QUALIFIED" if abs(mean) <= bar else "NOT QUALIFIED")


def score(watch_dir, clean_csv, robot, out=None):
    res = residuals(os.path.join(watch_dir, "battles.tsv"), clean_pairings(clean_csv), robot)
    mean, ci, label = verdict([r for _, r in res])
    lines = [f"# PC qualification: {robot}", "",
             f"**{label}**: share minus the clean pairing {mean:+.2f} ± {ci:.2f} over {len(res)} 1v1 battles "
             f"(bar ±{BAR}, clean page {os.path.basename(clean_csv)}).", "",
             "| Client | Battles | Share minus clean |", "|---|---:|---:|"]
    for c in sorted({c for c, _ in res}):
        v = [r for k, r in res if k == c]
        lines.append(f"| {c} | {len(v)} | {statistics.mean(v):+.2f} |")
    text = "\n".join(lines) + "\n"
    with open(out or os.path.join(watch_dir, "qualify.md"), "w", encoding="utf-8") as f:
        f.write(text)
    print(text)
    return label


def main(argv):
    p = argparse.ArgumentParser(description=__doc__.split("\n\n")[0])
    sub = p.add_subparsers(dest="cmd", required=True)
    u = sub.add_parser("upload")
    u.add_argument("mode", choices=("off", "on"))
    u.add_argument("folders", nargs="+")
    s = sub.add_parser("score")
    s.add_argument("dir")
    s.add_argument("--clean", required=True)
    s.add_argument("--robot", required=True)
    s.add_argument("--out")
    a = p.parse_args(argv)
    if a.cmd == "upload":
        upload(a.mode, a.folders)
    else:
        score(a.dir, a.clean, a.robot, a.out)


if __name__ == "__main__":
    main(sys.argv[1:])
