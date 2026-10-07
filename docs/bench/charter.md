# Local bench charter: goals and intentions

Status: active. Opened 2026-10-06 by Leigh Griffin (owner) with Claude Code. Amend by adding a
dated line to "Decisions and changes" at the foot of this file, never by rewriting history.

This document is the record of why the local bench exists, what it is for, and the rules it
works under. The other bench documents say how to run things. This one says what we are trying
to learn and what we agreed not to do.

## Goal

Give the owner per-robot, data-driven insight into how Hadur performs against the best robots
in every arena, so that the owner can decide where Hadur should evolve next.

Concretely: for each of the RoboRumble 1v1 top 20, the MeleeRumble top 20 and the TeamRumble
top 20, the bench produces repeatable, paired, seed-controlled measurements of the current
release against the previous one, with the raw rows kept so any later question can be asked of
the same data. Depth in all three arenas matters more than depth in one. The 1v1 arena came
first because its tooling was furthest along, not because it matters more.

This realises GitHub issue #102, "Run the bench and tuning locally on Windows, with a shared
Claude session", and widens it from the 1v1 top 20 to melee and team.

## What this work is not

- **No changes to the core robot.** Nothing in `hadur-core` or `hadur-robot` is changed for the
  bench. The bench observes the robot built from `master`. It does not alter it, add hooks to
  it, or tune it. The owner said so in terms: this is purely benchmark capability, with the
  outputs committed so they can be analysed.
- **No evolution decisions are made here.** The bench reports what is measured and how sure we
  are. Choosing what to change in Hadur is the owner's call, informed by this data.
- **No rank claims from small samples.** A difference whose interval spans zero is reported as
  not resolved, not as a gain or a loss.
- **No effect on the live rumble.** The owner's RoboRumble clients on the same PC are
  temporary and are left running. The bench works around their load and says so in every
  report. It does not stop, throttle or reconfigure them.

## Scope

| Arena | Opponents | Format | Baseline | Set file | Run script | Strategy doc |
|---|---|---|---|---|---|---|
| 1v1 | RoboRumble top 20, less Hadur and Nullstride (no archive jar) | one opponent, 35 rounds, 800x600 | Hadur 3.7, paired by seed | `top20.txt` | `bench-top20.ps1` / `.sh` | `top20-strategy.md` |
| Melee | MeleeRumble top 20, less Hadur and Nullstride, ranks 21 and 22 standing in | five overlapping fields of ten, 1000x1000 | Hadur 3.7, paired by seed | `melee-top20.txt` and fields a to e | `bench-melee-top20.ps1` / `.sh` | `top20-melee-strategy.md` |
| Team | TeamRumble top 20 | one opposing team at a time, 1200x1200 | HadurTeam 3.7, paired by seed | `team-top20.txt` | `bench-team-top20.ps1` / `.sh` | `top20-team-strategy.md` |

Set files and scripts live in `hadur-bench/`. Strategy documents live in `docs/bench/`. Rankings
come from the pages saved under `data/rumble/`, dated 2026-10-05.

Out of scope for now: robots below the top 20, the 1v1 top 50 (already covered by earlier
reports), and any change of Robocode engine version. The bench uses Robocode 1.9.5.6, as the
cloud bench does.

## Outputs the owner can analyse

1. **Reports** in `docs/bench/local/`: one per run, named `<date>_<label>.md`, with a host and
   conditions line, a skipped-turns line, per-opponent tables and the paired A/B table.
2. **Per-opponent reports** beside each run: one file per opponent with a per-seed table and
   that opponent's diagnostics.
3. **Raw rows** in `data/bench/`, named `<date>_hadur-<version>_<set>_<cold|warm>.tsv`, one row
   per battle, exported by `data/tools/export_battles.py`. Melee pairwise pooling is done by
   `data/tools/melee_pairwise.py`. Every file gets a row in `data/catalog.tsv`, and
   `data/tools/harvest_bench.py` refreshes the history tables.
4. **Per-robot strategy documents**: for each of the 60 opponents, who it is, what the data
   says about the matchup, what to run next, and a dated local result.
5. **Findings** after each run, in `docs/bench/local/<date>_findings.md`.

## Principles

1. **Paired by seed.** Candidate and baseline fight the same opponent on the same seeds, and
   every comparison in a report is a paired difference with a 95% interval. Pairing is a
   design convenience (a fixed, repeatable list of fights, and a valid interval), not a noise
   canceller: measured on repeated runs it removes about no variance. The same jar, opponent
   and seed gives a score share that differs between sessions by an SD of 3 to 5 points per
   battle with only 29 of 512 pairs identical, the seed explains none of the within-opponent
   variance (intraclass correlation -0.05), and candidate and baseline shares on the same seed
   are uncorrelated (mean r about 0, paired/unpaired variance ratio 0.94 to 1.02). Plan seed
   counts as an unpaired design (`data/tools/analyse.py --plan`); numbers from
   `data/tools/repeatability.py`.
2. **Trust before numbers.** Hadur reads its own turn times and sheds work when the engine
   skips its turns, so an overloaded bench measures a different robot. Each report must show
   skipped turns and duress ticks, and a run whose load differs between candidate and baseline
   is not used. The parallel ladder (`local/2026-10-06_parallel-ladder.md`) set the width.
3. **Conditions are recorded, not assumed.** Every report names the host, the CPU constant,
   the parallel width, the child JVM flags and the other Robocode JVMs running. Runs on
   another machine are read against their own conditions, not merged blindly.
4. **Sample size is stated.** Five seeds find large effects only. Robots whose interval is too
   wide to resolve get a larger follow-up run, with the seed count worked out from the
   observed spread.
5. **Keep the raw rows.** Reports summarise. The rows in `data/bench/` are the record, and any
   new question should be answered from them before running new battles.
6. **Honest about unknowns.** Where the repo does not say what an opponent does, the strategy
   document says "unknown". Nothing is inferred from a robot's name.
7. **Reproducible from a clean checkout.** Opponent jars are fetched, not committed. The
   scripts print the exact command they run. A reader can repeat any run.

## Working agreements

- Work is on branch `feature/local-bench-top20`, merged by pull request. Commits carry the
  session attribution lines. Nothing is pushed or opened as a pull request without the owner
  saying so, and issue #102 is updated only with the owner's agreement.
- Well-defined pieces (set files, scripts, documents, test-backed tooling) are delegated to
  Sonnet sub-agents. Measurement, merging and judging results stay with the main session.
- Bench Java changes are covered by unit tests that start no Robocode battle. Real battles are
  run only when the CPU is free of other benches.
- Large result files stay out of git where they are only scratch (`hadur-bench/work/`).
  Committed outputs are the reports, per-opponent files and exported rows.

## Definition of done for this effort

- [x] The default robot jar follows the project version (issue #102).
- [x] The bench runs in parallel on this PC with a measured, safe width.
- [x] 1v1 top 20 run, 3.8 against 3.7, with DrussGT at 40 seeds.
- [x] Melee and team gain parallel, pinned CPU constant, paired baseline and reports.
- [x] Melee top 20 run, 3.8 against 3.7, every robot in at least two fields (2026-10-06, 10 seeds a field).
- [x] Team top 20 run, 3.8 against 3.7 (2026-10-06, 10 seeds).
- [x] The three strategy documents carry a dated local result for every robot.
- [ ] A larger-sample follow-up for the 1v1 robots whose paired difference is not resolved.
- [ ] A findings write-up per arena, with the cloud figures alongside. (Melee and team: `local/2026-10-06_melee-team-findings.md`; the cloud figures are not yet alongside.)
- [ ] Issue #102's checklist updated and the branch merged, with the owner's go-ahead.

## Review

After each arena has been run, review together: which robots Hadur loses to or cannot be
separated from, which matchups are worth more seeds, and whether the sets, rounds or widths
should change. Record changes below.

## Decisions and changes

- 2026-10-06: Scope set to the top 20 in 1v1, melee and team, each with a per-robot strategy.
- 2026-10-06: No code changes to the core robot. Bench tooling, documents and data only.
- 2026-10-06: Parallel width default is a quarter of the logical cores (12 on this PC), with
  `--child-cpus 2`, after the ladder showed 20 wide with unconstrained child JVMs puts almost
  every tick into duress.
- 2026-10-06: The CPU constant is pinned to the owner's rumble client value, 1488498 from
  `C:\robocode\config\robocode.properties`, so runs match that client's timing.
- 2026-10-06: The temporary RoboRumble clients stay running. Their load is recorded, not removed.
- 2026-10-06: Nullstride (no archive jar) is skipped in 1v1 and melee, with the next-ranked
  robots standing in where a field needs filling.
- 2026-10-06: Melee and team top 20 run, 3.8 against 3.7. Melee pooled APS is about 1.3 points lower for 3.8, with 1.8 times
  the duress of 3.7; team is +25.5 points for 3.8. Findings in `local/2026-10-06_melee-team-findings.md`.
- 2026-10-06: Harness gap analysis written (`local/2026-10-06_harness-review.md`). Its main finding is that seed pairing
  buys little variance reduction, so the charter's "noise cancels" principle is a design intent, not a measured effect.
- 2026-10-06: Principle 1 reworded after `data/tools/repeatability.py` on the leak38 step 1 and
  step 2 runs (3.7, 16 seeds, 32 opponents, same jar and seeds in two sessions): per-battle SD
  3.21 points, 29 of 512 pairs identical, ICC 0.90 overall but -0.05 within opponent, paired/
  unpaired variance ratio 1.01 and 0.94. Seed pairing is kept for repeatability and a valid
  interval, and seeds are planned unpaired. `data/tools/analyse.py` adds the pooled paired
  difference, Holm and Benjamini-Hochberg adjustment, TOST non-inferiority and the seeds planner.
- 2026-10-07: Run conditions (rounds, engine, child heap, CPU constant, parallel width, CPUs per child) are carried
  into `data/catalog.tsv`, `history.tsv` and the trend chart, which marks runs that differ from the usual; reports
  list opponents that failed at least half their battles under "Excluded or failing opponents". `data/tools/compare_conditions.py`
  says whether two runs are comparable. Tooling and data only; no change to the robot.
