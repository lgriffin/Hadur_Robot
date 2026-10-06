# Hadur bench harness: gap analysis

Scope: read-only review of `hadur-bench/`, `data/tools/`, `data/bench/`, `docs/bench/`. Nothing was run. Every proposal is harness-side (bench Java, scripts, data tools, docs); none touches hadur-core or hadur-robot.

Citation format: `File.java:line`. Line numbers are from the working tree on master at the start of this session.

## Summary: top 5 recommendations

1. **Measure run-to-run repeatability and stop relying on seed pairing for noise cancellation.** From existing TSVs (no new battles): the same jar, opponent and seed under different host load differ by an SD of about 4-5 pp of score share per battle; only 5-10 of 256 repeated pairs are identical. Within-opponent correlation of candidate and baseline per-seed shares is about 0 (top-20: -0.001, paired/unpaired variance ratio 1.00; DrussGT x40: -0.35; leak38 16 seeds: +0.17). The README and charter say seeds make noise cancel; the data says they do not. The paired interval stays valid but buys nothing, so plan seeds as an unpaired design. (G1, High, S)
2. **Carry trust signals into the result row and the reports.** Duress ticks, engine disables and the missing final R record are parsed by `LogHarvester` but dropped before `BattleResult`, the TSV and the 1v1 report. Add a per-battle trust flag plus a with/without-flagged sensitivity line. (G2, High, M)
3. **Export per-round series to a committed TSV.** First-round vs late-round, learning curve, per-round outcome, ticks, hit rates, skip positions. The data is already in the local `work/` logs and is lost when the directory is cleaned. (G3, High, M)
4. **Add a stats analyser.** Pooled paired difference across opponents, Holm/BH multiplicity across 20 opponents, TOST non-inferiority with a declared margin, a correct t table beyond df 30 (or bootstrap), and a seeds-needed planner. (G4, High, M)
5. **Record host load and conditions per run, and add melee kill/death-time/last-hit data.** Sample CPU utilisation during the run, write a sidecar conditions record, counterbalance candidate/baseline order. For melee, record the killer and death tick from the engine snapshots, and add a pooled paired analysis across fields. (G5 and G8, High/Med, M)

## Gap table

| ID | Area | Gap | Priority | Effort |
|----|------|-----|----------|--------|
| G1 | Validity | Seed determinism claim false at battle level; pairing yields ~0 variance reduction; no repeatability study | High | S |
| G2 | Validity | Duress, engineDisables, R-record shortfall, security errors not surfaced per battle | High | M |
| G3 | Metrics | No per-round series export; no first vs late round; learning curve only by battle | High | M |
| G4 | Statistics | t table to df 30 only; no multiplicity, equivalence, power, bootstrap, pooled paired diff | High | M |
| G5 | Validity | Host load and conditions not recorded per battle; duel path has no child-flag line; no order counterbalance | High | M |
| G6 | Metrics | Warm/persisted-data mode compared only by battle index; no cold-vs-warm paired delta | Med | M |
| G7 | Metrics | Score-only paired A/B in 1v1 report; survival, win, bullet damage have no paired intervals | Med | S |
| G8 | Melee | No killer, death tick, last-hit; no pooled paired diff across fields | Med | M |
| G9 | Team | Coordination metrics exist (in-lane, friendly fire, count truth) but no paired intervals or per-round series; not fully reviewed | Med | M |
| G10 | Design | Opponent set limited to top 20; single battlefield per mode; engine 1.9.5.6 only | Med | M |
| G11 | Design | CPU-constant sensitivity not swept; no calibration against live rumble | Med | M |
| G12 | Design | No CI or release-over-release tracking of bench results | Med | M |
| G13 | Diagnostics | Hit rate is a mean of per-round rates; no per-wave/per-gun stats in the bench logs | Low | M |
| G14 | Validity | 54/200 battles lack the last R record; cause undetermined | Med | S |

## Detail

### G1. Repeatability and the pairing claim (High, S)

What exists: the bench runs candidate then baseline on the same seed (`Bench.java` seed loop, `duel()` around lines 350-380) and passes `-DRANDOMSEED` to the child (`Bench.java:528`). `Stats.pairedDiff` (`Stats.java:97-102`) forms per-seed differences. The charter's principles say pairing makes noise cancel and runs are deterministic.

What the data shows (computed from existing TSVs, no new battles):
- Same jar, opponent, seed in different sessions: per-battle score-share SD about 4-5 pp, 5-10 of 256 pairs identical. Battle-level determinism does not hold: RANDOMSEED fixes the engine RNG, but timing-dependent behaviour (skipped turns, duress shedding, thread scheduling) diverges.
- Within-opponent correlation between candidate and baseline shares across seeds is about zero, so pairing gives no variance reduction.

Why it matters: seed counts and "is this inside noise" calls rest on an assumed variance reduction. Intervals stay valid, but power is lower than believed.

Sketch:
- Add `data/tools/repeatability.py`: reads two or more TSVs of the same jar/opponent/seed set, reports per-battle SD, ICC, and cand-vs-baseline correlation per opponent.
- Add a `--repeat K` mode to `Bench.java` that runs the same (jar, opponent, seed) K times, writes a `repeat.tsv`, and prints the SD. Run once, off the timed bench, on a quiet host.
- Edit `docs/bench/charter.md` and the bench README to say pairing is a design convenience, not a noise canceller, and cite the measured ratio.

### G2. Trust signals dropped between harvester and report (High, M)

What exists:
- `LogHarvester` parses duress ticks (`LogHarvester.java:49-50, 213, 454-457`) and engine disables (`:48, 121-122, 459-461`) and counts skips (`:119`).
- `BattleResult.HEADER` (`BattleResult.java:111-118`) has 51 columns, none for duress or engine disables, so `data/tools/export_battles.py` and the committed TSVs cannot carry them.
- Melee and team reports do tally duress (`MeleeReport.java:40-44, 78-89, 355-362`; `TeamReport.java:37-40, 124-128, 211-220`). The 1v1 `Report.java` reports skipped turns via `tallyLine` only.
- `errors` is shown only for failed battles. 10 of 200 battles (all XanderCat) carry a security-manager FilePermission denial in `errors` and it is not surfaced. Whether it handicaps the opponent is undetermined.

Why it matters: Hadur sheds work under duress, so a loaded battle measures a different robot. Skip levels in the top-20 run are about 33/battle (0.95/round), roughly 3x the leak-set runs, and the current melee B run shows 85.9 skips and 130 duress ticks per battle with several bench JVMs on the host. Without a per-battle flag nobody can say how much of any difference is load.

Sketch:
- Append `duressTicks`, `engineDisables`, `rRecords`, `securityErrors` columns to `BattleResult` (header, `parse`, row writer); keep `parse` tolerant of old 51-column rows.
- Add a `trusted` boolean: duress == 0, skips/round below a configurable threshold, rRecords == rounds.
- In `Report.java`, add a per-opponent trust section and an A/B line recomputed excluding untrusted battles. Mirror the new columns in `FALLBACK_HEADER` in `data/tools/export_battles.py`.

### G3. Per-round series and learning curve (High, M)

What exists: `LogHarvester` reads the R record per round but only aggregates into the battle row. `Report.java` has a warm learning curve by battle index. The 3.5.1 DrussGT probe TSVs (`data/bench/*_rounds`, `_energy`, `_bullets`) show a per-round/tick format exists for probes, not for the standard A/B.

Why it matters: Hadur learns within a 35-round battle and, with persisted data, across battles. Aggregates hide whether a change helps early rounds (cold start) or late (mature model), which is the key per-opponent question.

Sketch:
- Emit `rounds.tsv` per run: build, opponent, seed, round, won, survived, ticks, damage dealt/taken, hit rate, duress ticks, skip count. Source: R records already parsed in `LogHarvester`.
- Add to `Report.java` a first-5 vs last-10 round comparison per opponent with paired difference, and a smoothed curve.
- Commit the TSV beside the existing data in `data/bench/`, since `work/` is gitignored.

### G4. Statistics module (High, M)

What exists (`Stats.java`): t critical values only to df 30 (lines 8-12) with a 1.96 fallback (line 34) that is too narrow for df 31-60; `of`, `weighted` (lines 54-91), `pairedDiff`. No bootstrap, multiplicity, equivalence, power or sequential stopping. Intervals are per opponent and per metric.

Why it matters: 20 opponents x several metrics at 95% each yields about one false "significant" per family by chance. A release gate is usually non-inferiority ("no worse than 3.7 by more than X"), and the code only tests difference.

Sketch:
- `Stats.java`: replace the table with a proper inverse t, add `bootstrapDiff(a, b, B, seed)`.
- Add `data/tools/analyse.py`: pooled paired difference across opponents using `Opponent.weight` (`Opponent.java:18-39`), Holm and Benjamini-Hochberg across the 20, TOST with a margin on the command line (suggest 1.0 aps point), and a `--plan` mode printing seeds needed per opponent for a target half-width using the unpaired SD (see G1).
- Add a sequential stop rule only after G1: stop an opponent once the interval excludes zero or the half-width is under target, never before 10 seeds.

### G5. Host load and run conditions (High, M)

What exists: `Host.java` records CPU model, cores, OS and a `jps` count of other Robocode JVMs, computed after the run. No utilisation sampling. `pinCpuConstant` (~`Bench.java:440-470`) pins the CPU constant. The duel host line (`Bench.java:298`) lacks the child-flag text that `hostLine` carries (`:615, :761`). The charter says conditions are recorded; the record is per run and post hoc.

Why it matters: the largest observed noise source is host load, and the `jps` count captures other bench JVMs only at one instant.

Sketch:
- `Host.java`: a sampler thread (`OperatingSystemMXBean` CPU load plus a per-battle `jps` count) writing min/mean/max utilisation and other-JVM count per battle into new `BattleResult` columns (ties into the G2 trust flag).
- Emit a `conditions.json` sidecar: git sha of each jar, parallelism, child CPUs, cpu constant, JVM flags, host sample summary.
- Counterbalance candidate/baseline order by seed parity in `duel()` so a host trend cannot bias one build.

### G6. Warm / persisted-data comparison (Med, M)

What exists: a warm mode, a "learning curve by battle" section in `Report.java`, and a memory section (MEM records). No cold-vs-warm paired delta per opponent, and no check that the warm shelf was identical at start for both builds.

Sketch: run each seed cold and warm, join in `analyse.py` (G4) to give a "value of learning" delta per opponent per build; record shelf size and checksum at start in the conditions sidecar.

### G7. Paired intervals only on score share (Med, S)

What exists: the paired A/B (`Report.java` ~300-340) is on score share. Survival share, win rate and bullet damage share exist in `BattleResult` but without paired intervals.

Sketch: loop the existing paired code over the other three metrics and print a four-column table. No new data needed.

### G8. Melee depth (Med, M)

What exists: `MeleeHarvester` writes `rounds.csv` with round, place, fielded, duelOpponent, duelWon, sentry hits, skips. `MeleeReport` has APS (pairwise 100H/(H+X)), survival ((N-place)/(N-1)), rounds won, mean place, hand-off duels, M-record posture and sensing, duress tally. `renderPaired` (~440-460) gives per-field paired diffs. `data/tools/melee_pairwise.py` pools the candidate across fields (skips `-baseline` dirs, lines 65-67) and reports SD but no intervals or pooled paired diff. No killer, death tick or last-hit data (also noted in `docs/bench/top20-melee-strategy.md`).

Sketch:
- `MeleeHarvester.onTurnEnded`: when our robot dies, record the tick and the nearest robot (or the owner of the bullet that was in range the previous tick) from the engine snapshot; add `deathTick`, `killer`, `lastHit` to `rounds.csv`.
- Extend `melee_pairwise.py` with a pooled paired candidate-minus-baseline difference over all five fields with a t interval over (field, seed) cells; five fields is where power is best.

### G9. Team (Med, M)

What exists: `TeamHarvester` writes per-round membersAlive, enemiesAlive, won, shots, shotsWithMateInLane, countBelowTruth, countReports, bulletsOnMates plus a friendly-fire log (`TeamHarvester.java` HEADER). `TeamReport` has per-opponent shares, rounds won/survived, in-lane, faults, skips, duress, and per-member T sums (T1), plus an "All" row. Missing: paired intervals against the team baseline (3.7 HadurTeam), a per-round time series, and coordination metrics such as focus-fire concentration or dispersion. I did not read the team strategy doc, so completeness here is undetermined.

Sketch: add paired diff and `Stats` intervals to `TeamReport`; add `focusFireRatio` (share of the team's damage on the most-hit enemy per round) from engine snapshots in `TeamHarvester.onTurnEnded`.

### G10. Opponent and battlefield coverage (Med, M)

What exists: top-20 sets per mode; the charter puts below-top-20 and engine changes out of scope; one battlefield per mode (melee 1000x1000, team 1200x1200); engine 1.9.5.6 only.

Why it matters: a top-20 bias hides gains or regressions on weaker or odd bots that matter for live rank.

Sketch: add a second-tier set file (e.g. every fifth bot ranked 21-100) under the existing set format, a field-size argument, and a once-per-release run on engine 1.11.1 to bracket engine sensitivity. All via set files and arguments.

### G11. CPU-constant sensitivity and calibration (Med, M)

What exists: pinned constant 1488498 and a record of it in reports. Nothing compares bench against live rumble APS. `docs/bench/live-3.7.md` and `live-3.8.md` hold live numbers.

Sketch: a 3-point sweep of the constant (0.5x, 1x, 2x) on 5 opponents once; a `calibration` note regressing bench APS on live APS per opponent from the live docs, stating the bench-to-rumble offset and residual SD. Whether the top-20 set files carry weights (needed for a rank estimate) was not determined.

### G12. CI and release tracking (Med, M)

What exists: `.github/workflows/build.yml`, `pages.yml`, `release.yml`; grep for "bench" finds nothing in them, so no CI gating on bench results. History TSVs derive from old reports.

Sketch: a `data/tools/trend.py` appending each committed run's headline (weighted APS, paired diff, trust flag) to `data/bench/history.tsv` and rendering a chart for the pages workflow. Keep gating manual: the bench is too heavy and noisy for CI.

### G13. Hit-rate and wave diagnostics (Low, M)

What exists: hit rate is a mean of per-round rates (`LogHarvester.java:436-443`), which over-weights short rounds. Report has wave fidelity (WaveMatcher), shielding, aggression and unhittable sections; EW inferred waves are in hadur.log.

Sketch: store shot and hit totals and report the ratio; export per-gun/per-wave stats from the EW/B/P records into the G3 rounds TSV if Hadur logs them (which records carry per-gun data was not determined).

### G14. Missing final R record (Med, S)

54 of 200 top-20 battles have roundRecords < rounds, so R-derived metrics cover 34 of 35 rounds. Cause undetermined; plausibly the final round's record is not flushed when the engine ends the battle, which would be harness-side. Sketch: log the shortfall (G2 column), have `BattleRunner` wait for the child log to drain before reading, and check whether the lost record is always the last round.

## Things that could not be determined

- Team coordination coverage beyond `TeamHarvester`/`TeamReport` (strategy doc not read).
- Cause of the missing final R record.
- Whether the XanderCat security errors handicap the opponent.
- Whether the top-20 set files carry weights (weighted APS is only computed when they do).
- Which per-gun stats Hadur's logs emit.
- ShieldProbe, ClientConditions and InactivityCheck internals were not reviewed in depth.

## Already present (do not duplicate)

Stratified APS (BENCH-1), paired t interval (BENCH-2), client conditions (BENCH-4), engine disables (BENCH-6), skipped-turn tally (BENCH-12), melee hand-off duels, team friendly-fire and in-lane stats, memory (MEM) section, warm learning curve by battle, parallel mode with per-battle worker homes and `--child-cpus`.
