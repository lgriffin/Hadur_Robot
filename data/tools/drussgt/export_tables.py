#!/usr/bin/env python3
"""Flatten bench runs against one opponent into four tables, so the figures in a report can
be recomputed without the truth logs (which are too large to commit).

    export_tables.py --out STEM <run> [<run> ...]
    export_tables.py --out STEM --session WORK

A run is `label=dir[,dir...]` (runs.py); `--session WORK` names the six runs of the 4 and 5
October 2026 session under WORK. STEM is the path and name the tables share, for example
`data/bench/2026-10-05_hadur-3.5.1_drussgt-probes_cold`:

    STEM.tsv          one row per battle: the build, the seed, Hadur's score share, the
                      round-0 opening shield, then every column of the bench's result.csv
    STEM_rounds.tsv   one row per round: outcome, length, final energies, the energy lead at
                      ticks 200 to 1,000, both robots' shots, hits, destroyed bullets, energy
                      spent and damage, Hadur's skipped turns, DrussGT's flattener and gun
    STEM_bullets.tsv  bullets counted by build, shooter, 200-tick window, power class, distance
                      band and fate, with their summed power and damage
    STEM_energy.tsv   mean energy of both robots every 200 ticks

`summary.py` reads these back. Standard library only.
"""

import argparse
import collections
import csv
import os
import sys

import analyze
import energy_trace
import extras
import outcomes
import runs

WINDOWS = [(0, 200), (200, 400), (400, 600), (600, 800), (800, 1000), (1000, 10 ** 9)]
SHIELD = ["shield_end_tick", "shield_hadur_energy", "shield_drussgt_energy", "shield_bullets",
          "shield_power_min", "shield_power_max"]
ROUNDS = ["build", "seed", "round", "ticks", "outcome", "hadur_end", "drussgt_end",
          "lead_200", "lead_400", "lead_600", "lead_800", "lead_1000",
          "hadur_shots", "hadur_hits", "hadur_destroyed", "hadur_light_shots", "hadur_light_hits",
          "hadur_spent", "hadur_damage",
          "drussgt_shots", "drussgt_hits", "drussgt_destroyed", "drussgt_light_shots",
          "drussgt_light_hits", "drussgt_spent", "drussgt_damage",
          "hadur_skips", "flattener", "drussgt_gun"]
BULLETS = ["build", "shooter", "tick_window", "power_class", "distance_band", "fate", "bullets",
           "power_sum", "damage_sum"]
ENERGY = ["build", "tick", "hadur_mean", "drussgt_mean", "rounds_running", "rounds"]
FATES = {"hit": "hit", "miss": "miss", "bhb": "destroyed", "open": "open"}


def window(tick):
    for lo, hi in WINDOWS:
        if lo <= tick < hi:
            return "%d-%d" % (lo, hi) if hi < 10 ** 9 else "%d+" % lo


def write(path, columns, rows):
    with open(path, "w", encoding="utf-8", newline="") as f:
        w = csv.DictWriter(f, columns, delimiter="\t", lineterminator="\n", extrasaction="ignore")
        w.writeheader()
        w.writerows(rows)
    print("%s: %d rows" % (path, len(rows)))


def export(specs, stem):
    battle_rows, round_rows, bullet_rows, energy_rows = [], [], [], []
    result_columns = []
    for spec in specs:
        build, dirs = runs.parse(spec)
        battle_dirs = runs.battles(dirs)
        print("%s: %d battles" % (build, len(battle_dirs)), file=sys.stderr)

        for d in battle_dirs:
            result = runs.result_row(d)
            for c in result:
                if c not in result_columns:
                    result_columns.append(c)
            row = dict(result)
            row.update(build=build, seed=runs.seed_of(d), share="%.2f" % (
                100 * float(result["score"]) / (float(result["score"]) + float(result["theirScore"]))))
            tick, at, powers = extras.shield_phase_of(d)
            if tick is not None:
                row.update(shield_end_tick=tick, shield_hadur_energy="%.2f" % at[0],
                           shield_drussgt_energy="%.2f" % at[1], shield_bullets=len(powers),
                           shield_power_min="%.2f" % min(powers) if powers else "",
                           shield_power_max="%.2f" % max(powers) if powers else "")
            battle_rows.append(row)

        res, allb, per_round = analyze.analyse(dirs)
        shot = {(r["battle"], r["rnd"]): r for r in per_round}
        split = collections.defaultdict(lambda: collections.Counter())
        counts = collections.Counter()
        power = collections.Counter()
        damage = collections.Counter()
        for battle, b in allb:
            side = "hadur" if b.owner == "H" else "drussgt"
            c = split[(battle, b.rnd)]
            c[side + "_destroyed"] += b.fate == "bhb"
            if b.p < 0.2:
                c[side + "_light_shots"] += 1
                c[side + "_light_hits"] += b.fate == "hit"
            key = (side, window(b.fire_turn), analyze.bucket_power(b.p), analyze.bucket_dist(b.dist) or "600-1000", FATES[b.fate])
            counts[key] += 1
            power[key] += b.p
            damage[key] += analyze.damage(b.p) if b.fate == "hit" else 0.0
        for key in sorted(counts):
            bullet_rows.append(dict(zip(BULLETS, (build,) + key + (
                counts[key], "%.3f" % power[key], "%.3f" % damage[key]))))

        logs = {os.path.basename(d): (extras.skips_of(d)[0], extras.console_rounds(d)) for d in battle_dirs}
        for r in outcomes.load(dirs):
            name = os.path.basename(r["battle"])
            s = shot[(name, r["rnd"])]
            c = split[(name, r["rnd"])]
            skips, console = logs[name]
            con = console.get(r["rnd"], {})
            round_rows.append(dict(
                build=build, seed=runs.seed_of(name), round=r["rnd"], ticks=r["ticks"],
                outcome="win" if r["win"] else "double" if outcomes.double(r) else "loss",
                hadur_end="%.2f" % r["eh"], drussgt_end="%.2f" % r["ed"],
                lead_200="%.2f" % r["l200"], lead_400="%.2f" % r["l400"], lead_600="%.2f" % r["l600"],
                lead_800="%.2f" % r["l800"], lead_1000="%.2f" % r["l1000"],
                hadur_shots=s["h_shots"], hadur_hits=s["h_hits"], hadur_destroyed=c["hadur_destroyed"],
                hadur_light_shots=c["hadur_light_shots"], hadur_light_hits=c["hadur_light_hits"],
                hadur_spent="%.2f" % s["h_spent"], hadur_damage="%.2f" % s["h_dmg"],
                drussgt_shots=s["e_shots"], drussgt_hits=s["e_hits"], drussgt_destroyed=c["drussgt_destroyed"],
                drussgt_light_shots=c["drussgt_light_shots"], drussgt_light_hits=c["drussgt_light_hits"],
                drussgt_spent="%.2f" % s["e_spent"], drussgt_damage="%.2f" % s["e_dmg"],
                hadur_skips=len(skips.get(r["rnd"], [])),
                flattener="" if "flattener" not in con else int(con["flattener"]),
                drussgt_gun=con.get("gun", "")))

        pts, H, D, alive, n = energy_trace.trace(dirs)
        for t in pts:
            energy_rows.append(dict(build=build, tick=t, hadur_mean="%.2f" % (sum(H[t]) / len(H[t])),
                                    drussgt_mean="%.2f" % (sum(D[t]) / len(D[t])),
                                    rounds_running=alive[t], rounds=n))

    round_rows.sort(key=lambda r: ([s.split("=")[0] for s in specs].index(r["build"]), r["seed"], r["round"]))
    write(stem + ".tsv", ["build", "seed", "share"] + SHIELD + result_columns, battle_rows)
    write(stem + "_rounds.tsv", ROUNDS, round_rows)
    write(stem + "_bullets.tsv", BULLETS, bullet_rows)
    write(stem + "_energy.tsv", ENERGY, energy_rows)


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    ap.add_argument("--out", required=True, metavar="STEM")
    ap.add_argument("--session", metavar="WORK")
    ap.add_argument("runs", nargs="*")
    args = ap.parse_args(argv)
    specs = runs.session(args.session) if args.session else args.runs
    if not specs:
        ap.error("give --session WORK or one or more runs")
    export(specs, args.out)
    return 0


if __name__ == "__main__":
    sys.exit(main())
