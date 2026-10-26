#!/usr/bin/env python3
"""BENCH-104: melee Stage 0 (docs/plan-melee-top5.md): the fresh census and its read.

  python3 tools/melee_s0.py fields RANKINGS.html [--seed 317] [--drop NAME]...
      Writes melee-census-317.txt and melee-census-317/fNN.txt in hadur-bench/ from a saved
      LiteRumble MeleeRumble rankings page: every ranked robot but Hadur and the dropped ones
      (no jar in the robot archive), shuffled into fields of nine, the last topped up from the
      first, so each battle is ten robots with Hadur as the rumble's are. Role melee-<rank>.

  python3 tools/melee_s0.py read WORK --census melee-census-317.txt [--width WORK6] --out REPORT.md
      Reads a paired census run (candidate battles melee-N, baseline battles melee-N-baseline,
      as Bench --baseline writes them) and writes the Stage 0 report: the A/A gate on the
      paired APS by field, the census level and its live projection (level - 0.8), skipped
      turns, rounds won by the strongest opponent in the field, the endgame duels by the
      survivor's rank with both energies at its start (BENCH-103 columns of rounds.csv), the
      rounds Hadur died before the last two by how many were left, and damage taken by phase.
      Both arms are the same robot, so the endgame and death tables pool them. With --width, the
      skipped turns of a run at fewer workers beside the census's on the same fields and seeds.
      Exit status 1 when the A/A gate fails.

  python3 tools/melee_s0.py screen BASE --arm NAME=WORK [--arm ...] --census SUITE --out REPORT.md
      BENCH-109, melee Stage 1: each WORK a run of one build alone on the census at the seeds
      of the BASE run (the aa build), paired with BASE battle for battle by field and seed. Per
      arm: the paired census APS (mean over fields of the per-field mean difference, 95%
      interval), endgame duels won against survivors ranked 1-30, deaths with two opponents
      left and Hadur's energy entering the endgame, each beside BASE's, and the verdict. An arm
      named bb is the A/A copy: clean when its paired mean is within +-0.25. Another arm passes
      at +0.3 or more with the interval above 0 and the 1-30 endgame wins no more than 3 points
      below BASE's. Exit status 1 when the A/A copy is not clean.

Standard library only.
"""

import argparse
import csv
import html
import json
import math
import os
import random
import re
import statistics
import sys
from collections import defaultdict

HERE = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
FIELD = 9
BANDS = ((1, 10), (11, 30), (31, 60), (61, 100), (101, 200), (201, None))
# Bench census APS reads this much above live (docs/plan-melee-top5.md section 1).
LIVE_OFFSET = 0.8
# Live APS of fifth place on 2026-10-25 (cz.libors.Ogi v1) and the census bar for top 5.
FIFTH = 70.72
BAR = 71.6
# A/A gate: paired mean within this, 95% half-width under that.
AA_MEAN = 0.2
AA_HALF = 0.3
# Stage 1 screen (BENCH-109): the A/A copy's paired mean within this; an arm passes at GAIN or
# more with its 95% low end above 0 and the 1-30 endgame wins at most BAND_SLACK points lower.
SCREEN_AA = 0.25
GAIN = 0.3
BAND_SLACK = 3.0


def band_of(rank):
    for lo, hi in BANDS:
        if rank >= lo and (hi is None or rank <= hi):
            return (lo, hi)
    return None


def band_label(b):
    lo, hi = b
    return "%d+" % lo if hi is None else "%d-%d" % (lo, hi)


# ---- fields ---------------------------------------------------------------------------

def read_rankings(text):
    out = []
    for tr in re.findall(r"<tr.*?</tr>", text, re.S):
        c = [html.unescape(re.sub(r"<.*?>", "", x)).strip() for x in re.findall(r"<t[dh].*?</t[dh]>", tr, re.S)]
        if len(c) >= 4 and c[0].isdigit():
            out.append({"rank": int(c[0]), "name": c[2]})
    return out


def jar(name):
    return name.replace(" ", "_") + ".jar"


def shuffle_fields(robots, seed):
    order = list(robots)
    random.Random(seed).shuffle(order)
    out = [order[i:i + FIELD] for i in range(0, len(order), FIELD)]
    if len(out[-1]) < FIELD:
        names = {r["name"] for r in out[-1]}
        out[-1] += [r for r in out[0] if r["name"] not in names][:FIELD - len(out[-1])]
    return out


def write(path, text):
    os.makedirs(os.path.dirname(path) or ".", exist_ok=True)
    with open(path, "w", encoding="utf-8", newline="\n") as f:
        f.write(text)


def build_fields(rankings_path, out, seed, drop):
    with open(rankings_path, encoding="utf-8", errors="ignore") as f:
        ranked = read_rankings(f.read())
    robots = [r for r in ranked if not r["name"].startswith("hadur2.") and r["name"] not in drop]
    fs = shuffle_fields(robots, seed)
    src = os.path.basename(rankings_path)
    stem = "melee-census-%d" % seed
    lines = [
        "# Melee census of the live MeleeRumble field (%s, %d ranked): each robot but Hadur once," % (src, len(ranked)),
        "# shuffled (seed %d) into %d fields of nine; the last field is topped up from the first." % (seed, len(fs)),
        "# Dropped (no jar in the robot archive): %s." % (", ".join(sorted(drop)) or "none"),
        "# Role melee-<rank> is the robot's rank on that page. Made by tools/melee_s0.py (BENCH-104).",
    ]
    for i, fl in enumerate(fs, 1):
        name = "f%02d.txt" % i
        write(os.path.join(out, stem, name), "\n".join(
            ["# Melee census field f%02d (see %s.txt)" % (i, stem)]
            + ["%s | melee-%d | %s" % (r["name"], r["rank"], jar(r["name"])) for r in fl]) + "\n")
        lines.append("F%02d | --set %s/%s --melee true --field 1000x1000" % (i, stem, name))
    write(os.path.join(out, stem + ".txt"), "\n".join(lines) + "\n")
    return fs


# ---- read -----------------------------------------------------------------------------

def read_csv(path):
    with open(path, newline="", encoding="utf-8") as f:
        return list(csv.DictReader(f))


def census_ranks(suite_path):
    base = os.path.dirname(os.path.abspath(suite_path))
    ranks = {}
    with open(suite_path, encoding="utf-8") as f:
        for line in f:
            m = re.search(r"--set (\S+)", line)
            if not m or line.lstrip().startswith("#"):
                continue
            with open(os.path.join(base, m.group(1)), encoding="utf-8") as sf:
                for row in sf:
                    parts = [p.strip() for p in row.split("|")]
                    if len(parts) >= 2 and parts[1].startswith("melee-") and not row.startswith("#"):
                        ranks[parts[0]] = int(parts[1][len("melee-"):])
    return ranks


def is_hadur(name):
    return name.startswith("hadur2.")


def battles(work):
    """(field, key, is_baseline, robots {name: score}, rounds rows) for each battle directory."""
    for root, _dirs, files in os.walk(work):
        base = os.path.basename(root)
        if "melee.csv" not in files or not base.startswith("melee-"):
            continue
        rel = os.path.relpath(root, work).split(os.sep)
        baseline = base.endswith("-baseline")
        key = os.sep.join(rel[:-1] + [base[:-len("-baseline")] if baseline else base])
        robots = {r["robot"]: float(r["score"]) for r in read_csv(os.path.join(root, "melee.csv"))}
        rp = os.path.join(root, "rounds.csv")
        rounds = read_csv(rp) if os.path.exists(rp) else []
        yield rel[0], key, baseline, robots, rounds


def aps(robots):
    us = next((n for n in robots if is_hadur(n)), None)
    if us is None:
        return None
    shares = []
    for n, s in robots.items():
        if n == us:
            continue
        t = robots[us] + s
        shares.append(50.0 if t == 0 else 100.0 * robots[us] / t)
    return statistics.mean(shares) if shares else None


def mean_ci(xs):
    if not xs:
        return float("nan"), float("nan")
    m = statistics.mean(xs)
    if len(xs) < 2:
        return m, float("nan")
    return m, 1.96 * statistics.stdev(xs) / math.sqrt(len(xs))


def analyse(work, ranks):
    cand, base = {}, {}
    field_of = {}
    rounds_all = []
    best_band = {}
    for field, key, baseline, robots, rounds in battles(work):
        a = aps(robots)
        if a is None:
            continue
        (base if baseline else cand)[key] = a
        field_of[key] = field
        opp = [ranks.get(n, 9999) for n in robots if not is_hadur(n)]
        best = band_of(min(opp)) if opp and min(opp) < 9999 else None
        best_band[key] = best
        for r in rounds:
            rounds_all.append((best, r))
    per_field = defaultdict(list)
    for k in cand:
        if k in base:
            per_field[field_of[k]].append(cand[k] - base[k])
    diffs = [statistics.mean(v) for v in per_field.values()]
    level = list(cand.values()) + list(base.values())
    res = {"pairs": sum(len(v) for v in per_field.values()), "fields": len(per_field),
           "paired": mean_ci(diffs), "level": mean_ci(level), "cand": statistics.mean(cand.values()) if cand else float("nan"),
           "base": statistics.mean(base.values()) if base else float("nan")}

    won = defaultdict(lambda: [0, 0])
    duel = defaultdict(lambda: {"n": 0, "won": 0, "me": [], "opp": [], "lead_n": 0, "lead_won": 0, "behind_n": 0, "behind_won": 0})
    crowd_deaths = defaultdict(int)
    taken_crowd, taken_duel, skipped = [], [], []
    n_rounds = 0
    for best, r in rounds_all:
        n_rounds += 1
        won[best][1] += 1
        if r.get("place") == "1":
            won[best][0] += 1
        if r.get("skippedTurns", "").isdigit():
            skipped.append(int(r["skippedTurns"]))
        opp = r.get("duelOpponent", "-")
        if opp not in ("-", "", None):
            b = band_of(ranks.get(opp.replace(";", ","), 9999)) or (9999, None)
            d = duel[b]
            d["n"] += 1
            w = r.get("duelWon") == "1"
            d["won"] += w
            me, them = r.get("duelEnergy", "-"), r.get("duelOppEnergy", "-")
            if me not in ("-", "", None) and them not in ("-", "", None):
                me, them = float(me), float(them)
                d["me"].append(me)
                d["opp"].append(them)
                if me >= them:
                    d["lead_n"] += 1
                    d["lead_won"] += w
                else:
                    d["behind_n"] += 1
                    d["behind_won"] += w
        elif r.get("deathTick", "-") not in ("-", ""):
            crowd_deaths[int(r["place"]) - 1] += 1
        for col, sink in (("takenCrowd", taken_crowd), ("takenDuel", taken_duel)):
            if r.get(col) not in (None, "", "-"):
                sink.append(float(r[col]))
    res.update(rounds=n_rounds, won=won, duel=duel, crowd_deaths=crowd_deaths,
               taken_crowd=taken_crowd, taken_duel=taken_duel, skipped=skipped)
    a_mean, a_half = res["paired"]
    res["aa_pass"] = (not math.isnan(a_half)) and abs(a_mean) <= AA_MEAN and a_half <= AA_HALF
    return res


def skipped_turns(work, fields=None, max_number=None):
    """Skipped turns a round over the candidate battles of a run, optionally only some fields
    and battle numbers up to max_number."""
    out = []
    for field, key, baseline, _robots, rounds in battles(work):
        if baseline or (fields is not None and field not in fields):
            continue
        num = re.search(r"melee-(\d+)$", key)
        if max_number is not None and num and int(num.group(1)) > max_number:
            continue
        out += [int(r["skippedTurns"]) for r in rounds if r.get("skippedTurns", "").isdigit()]
    return out


def run_width(work):
    """The worker count a run's conditions.json records (BENCH-51), or None when none says."""
    for root, _dirs, files in sorted(os.walk(work)):
        if "conditions.json" in files:
            try:
                with open(os.path.join(root, "conditions.json")) as fh:
                    return int(json.load(fh)["parallel"])
            except (ValueError, KeyError, TypeError):
                continue
    return None


def width_check(census_work, width_work):
    """(skips a round at the census width, at the width run's, rounds each, the two widths) on the
    width run's fields and seeds. The widths are None when the runs do not record them."""
    narrow = defaultdict(int)
    for field, key, baseline, _r, _rounds in battles(width_work):
        if not baseline:
            num = re.search(r"melee-(\d+)$", key)
            narrow[field] = max(narrow[field], int(num.group(1)) if num else 0)
    wide = skipped_turns(census_work, set(narrow), max(narrow.values()) if narrow else None)
    thin = skipped_turns(width_work)
    return (statistics.mean(wide) if wide else float("nan"), statistics.mean(thin) if thin else float("nan"),
            len(wide), len(thin), run_width(census_work), run_width(width_work))


def pct(a, b):
    return "-" if not b else "%.0f%%" % (100.0 * a / b)


def render(res, title):
    m, h = res["paired"]
    lv, lh = res["level"]
    out = ["# %s" % title, ""]
    out += ["## A/A gate", "",
            "Paired APS difference (candidate minus baseline, mean of %d fields, %d paired battles): **%+.2f ± %.2f** (95%%)."
            % (res["fields"], res["pairs"], m, h),
            "Gate: mean within ±%.1f and half-width under %.1f: **%s**." % (AA_MEAN, AA_HALF, "PASS" if res["aa_pass"] else "FAIL"),
            "",
            "## Census level", "",
            "| Arm | Census APS |", "|---|---|",
            "| candidate | %.2f |" % res["cand"], "| baseline | %.2f |" % res["base"],
            "| both | %.2f ± %.2f |" % (lv, lh), "",
            "Live projection: %.2f (census - %.1f). Fifth on 2026-10-25: %.2f live; the top-5 census bar is %.1f, %+.2f from here."
            % (lv - LIVE_OFFSET, LIVE_OFFSET, FIFTH, BAR, BAR - lv), ""]
    sk = res["skipped"]
    out += ["Skipped turns: %.1f a round (most in one round %d) over %d rounds." % (
        statistics.mean(sk) if sk else 0, max(sk) if sk else 0, len(sk)), ""]
    if res.get("width"):
        wide, thin, nw, nt, cw, tw = res["width"]
        if cw is not None and cw == tw:
            out += ["Width check: not applicable, both runs used %d worker%s." % (cw, "" if cw == 1 else "s"), ""]
        else:
            named = " (%s against %s workers)" % (cw, tw) if cw is not None and tw is not None else ""
            out += ["Width check on the same fields and seeds%s: %.2f skipped turns a round at the census width "
                    "(%d rounds) against %.2f at the narrower width (%d rounds)." % (named, wide, nw, thin, nt), ""]
    out += ["## Rounds won by the strongest opponent in the field", "",
            "| Strongest opponent | Rounds | Hadur won |", "|---|---|---|"]
    for b in BANDS:
        w, n = res["won"].get(b, (0, 0))
        if n:
            out.append("| %s | %d | %s |" % (band_label(b), n, pct(w, n)))
    rounds = res["rounds"] or 1
    out += ["", "## Endgame duels (Hadur and one other left)", "",
            "| Survivor ranks | Duels | Share of rounds | Hadur won | Hadur energy at start | Survivor energy | Won when ahead in energy | Won when behind |",
            "|---|---|---|---|---|---|---|---|"]
    for b in list(BANDS) + [(9999, None)]:
        d = res["duel"].get(b)
        if not d or not d["n"]:
            continue
        label = "unranked" if b[0] == 9999 else band_label(b)
        out.append("| %s | %d | %.1f%% | %s | %s | %s | %s of %d | %s of %d |" % (
            label, d["n"], 100.0 * d["n"] / rounds, pct(d["won"], d["n"]),
            "%.1f" % statistics.mean(d["me"]) if d["me"] else "-",
            "%.1f" % statistics.mean(d["opp"]) if d["opp"] else "-",
            pct(d["lead_won"], d["lead_n"]), d["lead_n"], pct(d["behind_won"], d["behind_n"]), d["behind_n"]))
    deaths = res["crowd_deaths"]
    total = sum(deaths.values())
    out += ["", "## Deaths before the last two", "",
            "%d of %d rounds (%s). By the other fighters still alive when Hadur died:" % (total, rounds, pct(total, rounds)), "",
            "| Others alive | Deaths |", "|---|---|"]
    for k in sorted(deaths):
        out.append("| %d | %d |" % (k, deaths[k]))
    tc, td = res["taken_crowd"], res["taken_duel"]
    out += ["", "## Damage taken a round", "",
            "Three or more alive: %.1f. Two alive (the endgame): %.1f." % (
                statistics.mean(tc) if tc else float("nan"), statistics.mean(td) if td else float("nan")), ""]
    return "\n".join(out)


# ---- screen (BENCH-109) ---------------------------------------------------------------

def run_aps(work):
    """{key: APS} and {key: field} over a run's own battles (a run without --baseline)."""
    out, field_of = {}, {}
    for field, key, baseline, robots, _rounds in battles(work):
        a = aps(robots)
        if baseline or a is None:
            continue
        out[key] = a
        field_of[key] = field
    return out, field_of


def phase_stats(res):
    """(1-30 endgame wins %, duels, deaths with two opponents left as % of rounds, mean energy entering the endgame)."""
    n = won = 0
    energy = []
    for b, d in res["duel"].items():
        energy += d["me"]
        if b in ((1, 10), (11, 30)):
            n += d["n"]
            won += d["won"]
    rounds = res["rounds"] or 1
    return (100.0 * won / n if n else float("nan"), n, 100.0 * res["crowd_deaths"].get(2, 0) / rounds,
            statistics.mean(energy) if energy else float("nan"))


def screen(base_work, arms, ranks):
    """Per arm (name, paired (mean, half), pairs, fields, its phase stats); and the base's phase stats."""
    base, field_of = run_aps(base_work)
    base_phase = phase_stats(analyse(base_work, ranks))
    out = []
    for name, work in arms:
        arm, _ = run_aps(work)
        per_field = defaultdict(list)
        for k, a in arm.items():
            if k in base:
                per_field[field_of[k]].append(a - base[k])
        diffs = [statistics.mean(v) for v in per_field.values()]
        out.append({"name": name, "paired": mean_ci(diffs), "pairs": sum(len(v) for v in per_field.values()),
                    "fields": len(per_field), "phase": phase_stats(analyse(work, ranks))})
    return out, base_phase


def verdict(arm, base_phase):
    m, h = arm["paired"]
    if math.isnan(m) or math.isnan(h):
        return "NO DATA"
    if arm["name"] == "bb":
        return "CLEAN" if abs(m) <= SCREEN_AA else "NOT CLEAN"
    band = arm["phase"][0] - base_phase[0]
    if m >= GAIN and m - h > 0 and not (band < -BAND_SLACK):
        return "PASS"
    return "FAIL"


def render_screen(rows, base_phase, title):
    out = ["# %s" % title, "",
           "Each arm paired with the aa baseline battle for battle (same field, same seed). Paired APS is the mean over",
           "fields of the per-field mean difference, with its 95%% interval. Pass: +%.1f or more, low end above 0, and" % GAIN,
           "1-30 endgame wins no more than %.0f points below the baseline's. The bb copy is clean within ±%.2f." % (BAND_SLACK, SCREEN_AA), "",
           "| Arm | Paired APS | Fields | Battles | 1-30 endgame wins | Deaths with two opponents left | Energy entering the endgame | Verdict |",
           "|---|---|---|---|---|---|---|---|",
           "| aa (baseline) | - | - | - | %.1f%% of %d | %.1f%% | %.1f | - |" % base_phase]
    for r in rows:
        m, h = r["paired"]
        w, n, dead, en = r["phase"]
        out.append("| %s | %+.2f ± %.2f | %d | %d | %.1f%% of %d (%+.1f) | %.1f%% (%+.1f) | %.1f (%+.1f) | **%s** |" % (
            r["name"], m, h, r["fields"], r["pairs"], w, n, w - base_phase[0], dead, dead - base_phase[2],
            en, en - base_phase[3], verdict(r, base_phase)))
    return "\n".join(out) + "\n"


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n")[0])
    sub = ap.add_subparsers(dest="cmd", required=True)
    f = sub.add_parser("fields")
    f.add_argument("rankings")
    f.add_argument("--seed", type=int, default=317)
    f.add_argument("--drop", action="append", default=[])
    f.add_argument("--out", default=HERE)
    r = sub.add_parser("read")
    r.add_argument("work")
    r.add_argument("--census", required=True)
    r.add_argument("--width")
    r.add_argument("--out", required=True)
    r.add_argument("--title", default="Melee Stage 0: census of 3.17.1 against itself")
    sc = sub.add_parser("screen")
    sc.add_argument("base")
    sc.add_argument("--arm", action="append", required=True, help="NAME=WORK")
    sc.add_argument("--census", required=True)
    sc.add_argument("--out", required=True)
    sc.add_argument("--title", default="Melee Stage 1: two opponents left")
    a = ap.parse_args(argv)
    if a.cmd == "screen":
        arms = [tuple(x.split("=", 1)) for x in a.arm]
        rows, base_phase = screen(a.base, arms, census_ranks(a.census))
        write(a.out, render_screen(rows, base_phase, a.title))
        for r in rows:
            print("%s %+.2f ± %.2f: %s" % (r["name"], r["paired"][0], r["paired"][1], verdict(r, base_phase)))
        return 0 if all(verdict(r, base_phase) == "CLEAN" for r in rows if r["name"] == "bb") else 1
    if a.cmd == "fields":
        fs = build_fields(a.rankings, a.out, a.seed, set(a.drop))
        print("wrote %d fields" % len(fs))
        return 0
    res = analyse(a.work, census_ranks(a.census))
    if a.width:
        res["width"] = width_check(a.work, a.width)
    write(a.out, render(res, a.title) + "\n")
    print("A/A %+.2f ± %.2f: %s" % (res["paired"][0], res["paired"][1], "PASS" if res["aa_pass"] else "FAIL"))
    return 0 if res["aa_pass"] else 1


if __name__ == "__main__":
    sys.exit(main())
