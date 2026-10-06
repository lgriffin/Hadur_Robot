# Bench strategy: the top 20, one robot at a time

Issue #102 asks for the bench to run locally on a fast Windows PC instead of a shared
container. Once it can run there, it can run bigger: more seeds, more parallel battles, and
a report per opponent instead of one pooled table. This note is what to do with that: a
bench plan for each of the 20 robots in `hadur-bench/top20.txt`, not just the top 20 as a
pool.

**Why per robot.** The top-10 pooled mean has moved in both the D1 gate and the release
check, and both times it hid a wide spread underneath it. D1's paired gate against 3.7 read
+6.7 on average over the top 10, but Diamond alone moved +14.1 ± 1.3 while Tomcat moved
-11.2 ± 25.1 in the other direction (`docs/bench/d1-gate.md`). The shipped release check
read +7.2 ± 6.3 over the same ten, with individual pairs from +24.3 (DrussGT) to -8.6
(Tomcat) (`docs/bench/release-check-3.8.md`). Each of the 20 loses points to Hadur for a
different reason: BeepBoop by being out of reach, DrussGT by out-managing bullet energy,
Saguaro by bullet-shielding, Tomcat by nothing anyone has pinned down yet. A pooled number
cannot tell those apart, and a robot moving the wrong way inside a pool that reads "pass"
is exactly how a real regression would hide.

**The local host.** The first local run used a Threadripper PRO 9965WX PC (24 cores, 48
logical, 128 GB, Windows 11, Java 21.0.10, Robocode 1.9.5.6). `hadur.bench.Host` writes that
into every report header, with the parallel width and the count of other Robocode JVMs
running (six RoboRumbleAtHome clients throughout, as they normally do on this PC). The
bench's `--parallel N` option (issue #102) runs N duel battles at once, each on its own
Robocode home, so their data directories never collide. Issue #102 guessed one battle per two
logical cores, which would be 24 here. The width ladder
(`docs/bench/local/2026-10-06_parallel-ladder.md`) found otherwise: 12 is what this host
sustains with the clients running, provided each battle JVM is told it has 2 processors
(`--child-cpus 2`, the bench's default for any parallel run). Twenty wide with no flag put
most ticks of every battle in duress. Twenty-four wide with the flag was also workable, but
12 leaves room for the clients. A pass over all 20 opponents at 5 seeds is 100 battles, and a
paired pass adds 100 baseline battles; both halves ran 12 at a time.

**What "resolving" means.** A battle's score share is noisy, and a paired difference against
a baseline jar is noisy in the same way. The interval printed beside each paired difference
is a 95% t interval over the per-seed differences. From the published intervals in
`docs/bench/d1-gate.md` and `docs/bench/stack-gate.md`, the per-battle standard deviation
behind them works out to roughly 5 points at the tightest (DrussGT at 20 seeds, d1-gate.md)
and roughly 9 at the widest (the top-10 pooled paired difference at 3 seeds, stack-gate.md):
call it 5 to 10 points at 35 rounds. `docs/druss-route-plan.md` gives one fixed point on
that curve directly: 20 paired battles resolve a difference to about ±2.7 points. The other
sizes below are not separately measured; they are that figure scaled by t/√N, where t is the
95% multiplier for N-1 degrees of freedom (2.78 at 5 seeds, 2.26 at 10, 2.09 at 20, 2.02 at
40). The first version of this table scaled by 1/√N alone, which left out t and made 5 seeds
look tighter (±5.4) than the local run found.

| Seeds (N) | Resolves a paired difference to about |
|---|---|
| 5 | ±7.2 (local top-20 run: median ±7.6, range ±3.1 to ±13.1) |
| 10 | ±4.1 |
| 20 | ±2.7 (measured, `docs/druss-route-plan.md`) |
| 40 | ±1.8 (local DrussGT run: ±2.5) |

The spread is not the same for every robot. The per-seed paired differences in the local
run have a standard deviation from 2.5 points (Nene) to 10.6 (Raven) at 5 seeds, and DrussGT
read 6.1 over its first 5 seeds and 7.9 over all 40. Seeds needed for a target interval are
(t x SD / target)^2, so a robot's own spread, not this table, should set its seed count;
`docs/bench/local/2026-10-06_findings.md` works that out for all 20.

A robot whose bands below rest on a 2 or 3-seed figure (most of the top 10's D1 and
stack-gate rows) is not resolved by this table's standard; the per-robot sections say which
figures are 2-3 seeds and need more before they mean anything on their own.

## How a per-robot run is made

A full pass over the set uses the wrapper script, `hadur-bench/bench-top20.ps1` (or
`bench-top20.sh`, which takes the same options as `--flags`). It builds the robot jar at the
repo root, fetches the set's opponent jars, then runs `hadur.bench.Bench` with these
defaults:

- **Set:** `top20.txt`, the RoboRumble 1v1 top 20 of 2026-10-05 less Hadur itself and
  jd.Nullstride 2.3.1 (no archive copy): ranks 1, 3 to 15 and 17 to 22.
- **Seeds and rounds:** 5 seeds, 35 rounds (`-Seeds`, `-Rounds`).
- **Parallel:** a quarter of the logical cores, floored, at least 1 (`-Parallel`). That is 12
  on this host. The ladder's reason is above.
- **Child CPUs:** `--child-cpus 2` is the bench's own default whenever parallel is above 1.
  The scripts have no parameter for it, so it needs no flag; pass `--child-cpus 0` to the
  bench directly only to repeat the ladder's control row.
- **CPU constant:** the PowerShell script reads `robocode.cpu.constant` from
  `C:\robocode\config\robocode.properties` when that file exists (1488498 on this host),
  prints `using robocode.cpu.constant=...` and passes it as `--cpu-constant`. `-CpuConstant`
  sets it by hand, `-NoCpuPin` skips the lookup. The sh script has no lookup, so it needs
  `--cpu-constant NANOS`. With no constant at all, a parallel bench calibrates once, idle, in
  the main home and copies the result to every worker.
- **Outputs:** the main report goes to `docs/bench/local/<date>_<label>.md`, one report per
  opponent under `docs/bench/local/<date>_<label>/`, and the working directory is
  `hadur-bench/work/<label>-<timestamp>`. `-Label` (default `top20`) names all three.
  `-SkipBuild` and `-SkipFetch` skip the first two steps.
- **Exit code:** the bench's own, which is 1 if any battle failed.

Paired against the previous release, add the baseline jar and its robot name. The 3.7 jar is
kept at `hadur-bench/baselines/hadur2.Hadur_3.7.jar`, and `-Baseline` needs `-BaselineRobot`:

```powershell
.\hadur-bench\bench-top20.ps1 -Baseline baselines\hadur2.Hadur_3.7.jar -BaselineRobot "hadur2.Hadur 3.7" -Label top20-3.8-vs-3.7
```

```sh
./hadur-bench/bench-top20.sh --baseline baselines/hadur2.Hadur_3.7.jar --baseline-robot "hadur2.Hadur 3.7" --label top20-3.8-vs-3.7
```

Those write `2026-10-06_top20-3.8-vs-3.7.md` and the folder beside it, the names the first
local run's reports carry. That run called `mvn exec:java` directly with the same options
(`--set top20.txt --seeds 5 --rounds 35 --parallel 12 --cpu-constant 1488498`) rather than
the script.

One robot on its own, at however many seeds a section below calls for, is the underlying
bench command directly, from `hadur-bench/` (`hadur-bench/README.md`'s option table). The
first local run did DrussGT this way at 40 seeds with `--set drussgt.txt`; `--only DrussGT`
on `top20.txt` picks the same opponent:

```sh
mvn -q compile exec:java -Dexec.args="--set top20.txt --only DrussGT --seeds 40 --rounds 35 --parallel 12 --cpu-constant 1488498 --baseline baselines/hadur2.Hadur_3.7.jar --baseline-robot \"hadur2.Hadur 3.7\" --per-opponent ../docs/bench/local/2026-10-06_drussgt"
```

Leave `--baseline` and `--baseline-robot` off for a plain run, as the sections below ask for
Wavelet, Neuromancer, Phoenix and Roborio. Pairing is the way the D-stage gates were run (BENCH-2).

**Reading the report.** The main report starts with the candidate's table (one row per
opponent: score, survival and bullet-damage share, rounds won, both hit rates, skipped
turns, faults, turn p95 and max) and the diagnostic sections, then a `Paired A/B` table
(candidate share, baseline share, paired difference with its interval), then the same
tables again for the baseline. `--per-opponent DIR` writes one file per opponent. Each opens
with a `Battles` table, one row per seed with the baseline share and paired difference
beside it and a "Mean score share ... paired diff" line under it, then a `Full report` with
the same diagnostics the stage gates read: wave fidelity (how well Hadur's inferred enemy
waves match the bullets the enemy really fired), bullet shielding (what share of Hadur's own
bullets the opponent destroyed), aggression (opening and fighting distance, full-power
shots, finish and ram ticks), unhittable (their hit rate, skipped turns, shadowed waves,
flavour changes), opponent memory (started warm, seeds replayed, seed decays) and the stored
profiles. `hadur-bench/README.md` has the full field list for each section.

**Three checks before trusting a run**, in the order to check them:

1. **Every battle ok.** No opponent row reads "battle(s) failed", the Faults column is 0 for
   all of them and the bench exited 0. A failed battle silently drops that opponent's seeds
   from the mean.
2. **Skipped turns per round are near the sequential run's.** The header of each half
   carries a line "Skipped turns: N over M battles (X per battle, most in one battle Y)".
   Compare per round, not per battle, because the ladder was 10 rounds and the real runs 35:
   the ladder's sequential run was 8.4 per battle (0.84 a round), its 12-wide rung 15.5 (1.55
   a round). A loaded host inflates skips (seen directly in `docs/bench/d1-gate.md`'s own
   note: "a worker was building code during the first battles"), and in duress Hadur stops
   detecting enemy shots, so their hit rate can read over 100% in the affected battle (154% in the ladder's first try).
   Read the candidate and baseline halves separately: they ran under the same load, but skips cost the two builds differently depending on what else shares the core
   that tick, and the first local run shows it (equal on the top 20, 53.5 against 44.2 per
   battle on DrussGT alone).
3. **The CPU constant is the same across the candidate and baseline halves, and known.** The
   header names it as `robocode.cpu.constant=...` only when the main home holds the file. A
   run that pins the constant with `--cpu-constant` writes it to the worker homes only, so
   the first local run's headers read "unknown" where the constant would go. Take the value
   from the script's `using robocode.cpu.constant=...` line or from a worker home's
   `config/robocode.properties`, and record it with the findings. The first local run pinned
   1488498; the ladder calibrated its own (1876154), so the two skipped-turn figures were not
   taken under one constant.

## The bands

Twenty opponents, grouped by what the evidence actually shows, not by rank:

- **Out of reach: BeepBoop.** Survival has been at or near 0 in every bench run that
  measured it before the local 3.8 run (2 of 175 rounds won at Hadur 3.0,
  `docs/bench/roborumble-top50.md`; 0% survival live at 3.4, `docs/top20-analysis.md`; 4 of
  175 for 3.7 locally), and its live PBI is negative (-3.8),
  meaning Hadur does worse against it than robots of its own strength typically do. Nothing
  in the D-route or the shield counter targets what BeepBoop does. The local 3.8 run broke
  the pattern: 23 of 175 rounds won, survival share 13.1% (3.7: 2.3%).

- **The DrussGT route targets: DrussGT, ScalarR, Diamond, Firestarter, Knight, Gilgalad.**
  These are exactly the top20 robots Hadur loses to live, apart from BeepBoop (out of reach)
  and Wavelet (placed in anomalies below for how far below expectation it reads). Five of
  the six were in the D1/stack-gate top-10 bench set and showed D1 gains from +8.3 to +21.3
  points (`docs/bench/d1-gate.md`), the mechanism druss-route-plan.md documents as the
  lead-aware power rule paying off against surfers whose bullet power follows ours down.
  **Gilgalad is the weak member of this band**: it was never in the top-10 D-gate set, so
  there is no D-stage paired figure for it at all, only a declining duel-history trend (3.0
  bench 49.0%, two 3.5.1 probes at 39.8% and 33.4%, `data/bench/duel-history.tsv`). It sits
  here on the loss pattern alone, not on measured evidence of the same mechanism.

- **The shield counter: Saguaro.** Hadur 2.0 scored 1.7% against it before the counter
  shipped; every version since has scored 68% to 80% (`data/bench/duel-history.tsv`,
  `docs/bullet-shielding.md`). The D1-D4 paired figures for it are flat to slightly negative
  within wide intervals (stack-gate.md +1.2 ± 7.7, release-check -5.0 at 2 seeds), which is
  expected: the DrussGT route's lead-aware power rule has nothing to do with the shield
  detector, and this pairing is already resolved by a different mechanism.

- **Won on the bench but worth defending: Raven, XanderCat, Tomcat, Knight (is above),
  GresSuffurd, WaveSerpent, WhiteFang, Nene, Dookious, Phoenix, Roborio.** All of these score
  above 50% in at least one measured run. Most have a positive live PBI at 3.4
  (`docs/top20-analysis.md`). Two deserve a flag inside this band: **Tomcat** had the
  largest live win (PBI +14.0) and also the largest D1 regression of the whole top-10 set
  (-11.2 ± 25.1, `docs/bench/d1-gate.md`), though the interval is wide enough that this
  could be noise; and **XanderCat** read -7.2 in the release check and +9.5 in the stack
  gate, two small-seed readings that disagree in direction. **Phoenix and Roborio have no
  3.4 live figure at all** (they ranked just below Hadur on the page the live analysis was
  read from, so the top-19 table does not cover them); their "win" rests on the 3.0 bench
  share only (61.1% and 58.9%, `docs/bench/roborumble-top50.md`).

- **The anomalies: Wavelet, Neuromancer.** Wavelet's live PBI is -16.0, the single worst
  figure on the whole top-19 page, worse than Firestarter's -9.0 and far worse than its
  rank (13) would suggest (`docs/top20-analysis.md` calls both of these out explicitly as
  falling "furthest below expectation"). Its duel-history is also inconsistent with that:
  two 3.5.1 cold probes read 51.3% and 48.5%, well above the 39.5% at 3.0 and the live
  loss. Neuromancer's live score (51.6%, PBI +0.1) is the closest thing to an exact
  coin-flip among the wins, and its bench history swings widely around that line (49.7% at
  3.0, then 47.7% and 36.1% in two 3.5.1 probes, `data/bench/duel-history.tsv`): the least
  stable "win" in the set, one bad local run away from reading as a loss.

## Robot by robot

### 1. kc.mega.BeepBoop 2.0

Rank 1. A wave surfer that also bullet-shields against weaker opponents, built on a
guess-factor gun (RoboWiki general knowledge).

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 17.2% ± 2.9, survival 1.1% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | 16.5% / -3.8, survival 0.0% | `docs/top20-analysis.md` |
| 3.8 vs 3.7 paired (2 seeds) | 25.9% vs 18.5%, +7.5 pp | `docs/bench/release-check-3.8.md` |
| D1 (3.8) vs 3.7 paired (3 seeds) | 24.7% vs 16.4%, +8.3 ± 22.5 | `docs/bench/d1-gate.md` |
| D4 vs D1 paired (3 seeds) | 24.3% vs 17.4%, +6.9 ± 8.1 | `docs/bench/stack-gate.md` |
| Duel-history score share, cold | 14.6% (2.0) to 19.0% (3.1) | `data/bench/duel-history.tsv` |

**What decides the pairing.** Survival was at or near zero in every run that measured it, at
every release up to 3.7; the local 3.8 run read 13.1%. Hadur's hit rate on it (5.9% at 3.0) is below BeepBoop's on Hadur (9.7%), and
no stage of the D-route or shield work targets what BeepBoop does.

**Bench plan.** Low priority for seeds, but the local result changes why: 10 paired against
3.7 confirms no regression, and more seeds are what would show whether the survival gain is
real. Watch survival share specifically; the 13.1% is the first sign anything has changed. Gate: no decline from the
+7.5 to +8.3 pp the 3.8 figures already show.

Local 3.8 result (5 seeds x 35 rounds,
`docs/bench/local/2026-10-06_top20-3.8-vs-3.7/kc.mega.BeepBoop_2.0.md`): candidate 25.0% ±
5.4, baseline (3.7) 18.2% ± 1.8, paired +6.8 ± 6.7 pp. Rounds won 23 / 175 (3.7: 4 / 175).
Hit rate ours 5.0% ± 0.5, theirs 14.3% ± 15.8. The difference is outside its own interval
(+0.1 to +13.5), so a real gain, but only by 0.1 point and one seed is negative (-2.5).
Rounds won rose from 4 to 23 of 175 and survival share from
2.3% to 13.1%, so 'survival at or near zero' no longer holds for 3.8. The gate (no decline
from the +7.5 to +8.3 pp of the cloud figures) is met. Cloud: release check +7.5 (2 seeds),
D1 +8.3 ± 22.5 (3 seeds); local is within a point of the release check.

### 3. jk.mega.DrussGT 3.1.16

Rank 3. A go-to wave surfer with a KNN gun (DC and anti-surfer variants) and a
bullet-shielding opener (`docs/druss-route-plan.md`), the opponent the whole D1-D5 route was
built against.

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 33.7% ± 3.5, survival 20.7% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | 38.3% / +5.0, survival 25.7% | `docs/top20-analysis.md` |
| 3.8 vs 3.7 paired (10 seeds) | 45.5% vs 35.1%, +10.5 ± 3.1 | `docs/bench/release-check-3.8.md` |
| D1 (3.8) vs 3.7 paired (20 seeds) | 48.2% vs 36.2%, +12.0 ± 4.3 | `docs/bench/d1-gate.md` |
| D4 vs D1 paired (3 seeds) | 46.9% vs 40.3%, +6.6 ± 36.3 | `docs/bench/stack-gate.md` |
| Duel-history score share, cold | 25.5% (2.0) to 39.1% (2.2) | `data/bench/duel-history.tsv` |

**What decides the pairing.** Both guns hit below break-even; Hadur's bullet spending costs
it 11.8 more energy lead per round than DrussGT's (`docs/druss-route-plan.md`). D1's
lead-aware power rule directly targets that and is confirmed at 20 seeds (+12.0 ± 4.3).
DrussGT also destroys about 12.5% of Hadur's bullets in its opening shield and keeps the
most enemy waves in the air of any top-10 opponent, which is where D4's shadow-aim term
costs the most in skipped turns (447 against the baseline's 314 over 350 rounds,
`docs/bench/release-check-3.8.md`).

**Bench plan.** 40 seeds paired against 3.7 (done locally: the interval came out at ±2.5,
against the ±1.9 the 1/√N scaling predicted, because DrussGT's per-seed spread is 7.9
points). Watch skipped turns against the sequential baseline specifically; this is the
opponent most likely to show a real skip regression from the shadow-aim work, and the local
run shows 3.8 skipping more than 3.7 here. Gate: hold the +10 to +12 point gain the 3.8
figures already show.

Local 3.8 result (40 seeds x 35 rounds,
`docs/bench/local/2026-10-06_drussgt-40-3.8-vs-3.7.md`): candidate 45.9% ± 1.5, baseline
(3.7) 32.7% ± 1.5, paired +13.2 ± 2.5 pp (38 of 40 seeds up). Rounds won 638 / 1400 (3.7:
274 / 1400). Hit rate ours 7.6% ± 0.1, theirs 10.6% ± 0.2. The difference is outside its own
interval (+10.7 to +15.7), so a real gain. The 5-seed top-20 run read 46.6% vs 33.2%, +13.4
± 7.5, also outside its interval. Skipped turns per battle: 3.8 53.5, 3.7 44.2, so the
shadow-aim cost the plan expected shows again. Cloud: release check 45.5% vs 35.1%, +10.5 ±
3.1 (10 seeds), D1 +12.0 ± 4.3 (20 seeds); local 3.8 matches the release check's 3.8 share
(45.9% against 45.5%), local 3.7 reads 2.4 lower, so the paired gap is 2.7 wider and the
intervals overlap. Cloud skips were 447 against 314 over 10 battles (44.7 against 31.4 per
battle), 3.8 higher there too. The gate (hold +10 to +12) is met.

### 4. oog.mega.saguaro.Saguaro 1.0

Rank 4. Starts every battle in shield mode: sits still, predicts the opponent's bullet
heading from head-on variants, and fires a weak bullet to meet it mid-air
(`docs/bullet-shielding.md`).

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 74.1% ± 8.5, survival 84.6% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | 70.6% / +23.3, survival 82.9% | `docs/top20-analysis.md` |
| 3.8 vs 3.7 paired (2 seeds) | 68.6% vs 73.6%, -5.0 | `docs/bench/release-check-3.8.md` |
| D1 (3.8) vs 3.7 paired (3 seeds) | 73.0% vs 70.8%, +2.2 ± 14.3 | `docs/bench/d1-gate.md` |
| D4 vs D1 paired (3 seeds) | 73.5% vs 72.3%, +1.2 ± 7.7 | `docs/bench/stack-gate.md` |
| Duel-history score share, cold | 1.7% (2.0, pre-counter) to 77.0% (2.1) | `data/bench/duel-history.tsv` |

**What decides the pairing.** The shield-detector/jitter counter (SHIELD-1, SHIELD-2) and
its D2 extensions (SHIELD-3 latches on the first destroyed bullet against a still enemy;
SHIELD-4 fires 3.0 at a latched shielder). The pairing flipped from 1.7% to roughly 70-80%
the moment the counter shipped, and nothing since has moved it materially; the -5.0 release
check figure is 2 seeds and inside the noise of every other reading.

**Bench plan.** 10-20 seeds paired, low priority for the D-route's own gates since this
pairing is resolved by a different mechanism. Watch the bullet-shielding section
specifically (shots destroyed share should stay near the 7% the counter already achieves,
not the double-digit shares that mark an un-countered shielder). Gate: no drop below 65%.

Local 3.8 result (5 seeds x 35 rounds,
`docs/bench/local/2026-10-06_top20-3.8-vs-3.7/oog.mega.saguaro.Saguaro_1.0.md`): candidate
76.0% ± 7.7, baseline (3.7) 69.2% ± 6.4, paired +6.8 ± 12.6 pp. Rounds won 156 / 175 (3.7:
138 / 175). Hit rate ours 17.9% ± 1.3, theirs 6.1% ± 0.8. The difference is inside its own
interval (-5.8 to +19.4), so not resolved at 5 seeds. The share held well above the 65% gate
(76.0%). Shots destroyed share is 8.9% for both builds, a little above the 7% the doc
expects of the counter. Cloud: release check -5.0 (2 seeds), D1 +2.2 ± 14.3 (3 seeds); the
local sign differs from the release check, and both sit inside their intervals.

### 5. aaa.r.ScalarR 0.005h.053-noshield

Rank 5. A wave surfer; this is its shield-disabled rumble entry. ScalarR's normal build also
bullet-shields (druss-route-plan.md records that ScalarR's APS rose from 91.41 to 93.1 the
day its own shield shipped, and fell when it was removed).

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 22.6% ± 4.8, survival 7.4% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | 30.9% / +0.4, survival 20.0% | `docs/top20-analysis.md` |
| 3.8 vs 3.7 paired (2 seeds) | 42.9% vs 20.7%, +22.3 | `docs/bench/release-check-3.8.md` |
| D1 (3.8) vs 3.7 paired (3 seeds) | 35.7% vs 27.4%, +8.3 ± 29.7 | `docs/bench/d1-gate.md` |
| D4 vs D1 paired (3 seeds) | 35.0% vs 28.2%, +6.8 ± 5.9 | `docs/bench/stack-gate.md` |
| Duel-history score share, cold | 21.0% (2.0) to 27.3% (3.1) | `data/bench/duel-history.tsv` |

**What decides the pairing.** Its PBI at 3.4 is near zero (+0.4): Hadur already scores about
what a robot of its strength typically does against ScalarR, so the loss is mostly a matter
of ScalarR's own strength, not a specific weakness. It is one of the surfers whose power
follows ours down, the exact mechanism D1's lead-aware rule targets, and the top-10 gates
show a consistent 7-8 point gain there.

**Bench plan.** 20-40 seeds paired against 3.7. Watch whether POW-7's lead-aware condition
is actually engaging against it (the per-opponent report's aggression section shows full-
power shot counts). Gate: hold the +8 point gain.

Local 3.8 result (5 seeds x 35 rounds,
`docs/bench/local/2026-10-06_top20-3.8-vs-3.7/aaa.r.ScalarR_0.005h.053_noshield.md`):
candidate 31.9% ± 4.1, baseline (3.7) 22.4% ± 2.6, paired +9.5 ± 6.1 pp. Rounds won 45 / 175
(3.7: 14 / 175). Hit rate ours 6.6% ± 0.7, theirs 10.4% ± 0.4. The difference is outside its
own interval (+3.4 to +15.6), so a real gain. Cloud: release check +22.3 (2 seeds), D1 +8.3
± 29.7 and D4 vs D1 +6.8 ± 5.9 (3 seeds); local is 12.8 below the two-seed release figure
and 1.2 above D1's.

### 6. voidious.Diamond 1.8.22

Rank 6. A wave surfer by Voidious with a dynamic-clustering guess-factor gun (RoboWiki
general knowledge).

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 34.5% ± 3.6, survival 26.5% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | 33.3% / -3.2, survival 28.6% | `docs/top20-analysis.md` |
| 3.8 vs 3.7 paired (2 seeds) | 49.8% vs 25.6%, +24.2 | `docs/bench/release-check-3.8.md` |
| D1 (3.8) vs 3.7 paired (3 seeds) | 44.6% vs 30.5%, +14.1 ± 1.3 | `docs/bench/d1-gate.md` |
| D4 vs D1 paired (3 seeds) | 49.9% vs 49.4%, +0.5 ± 2.7 | `docs/bench/stack-gate.md` |
| Duel-history score share, cold | 22.2% (2.0) to 34.8% (3.5.1 probe) | `data/bench/duel-history.tsv` |

**What decides the pairing.** D1's gain here is the tightest-resolved figure of the whole
top-10 gate (+14.1 ± 1.3 at only 3 seeds), which is unusual enough to be worth reproducing
locally before relying on it. Its live PBI (-3.2) says Hadur underperforms its tier against
Diamond specifically, which is exactly what the D1 gain is supposed to close.

**Bench plan.** 20 seeds paired against 3.7, specifically to confirm the ±1.3 interval holds
up outside the original 3-seed sample. Gate: at least +10 points sustained.

Local 3.8 result (5 seeds x 35 rounds,
`docs/bench/local/2026-10-06_top20-3.8-vs-3.7/voidious.Diamond_1.8.22.md`): candidate 51.6%
± 2.9, baseline (3.7) 26.6% ± 4.8, paired +25.0 ± 4.5 pp. Rounds won 107 / 175 (3.7: 30 /
175). Hit rate ours 6.8% ± 0.6, theirs 12.0% ± 9.7. The difference is outside its own
interval (+20.5 to +29.5), so a real gain. All five seeds are positive (+20.5 to +30.6). The
wide hit-rate interval for them (±9.7) comes from one battle at 26.0%. Cloud: release check
+24.2 (2 seeds), D1 +14.1 ± 1.3 (3 seeds); local is within a point of the release check and
above D1's interval (12.8 to 15.4), so the ±1.3 did not reproduce.

### 7. cb.fire.Firestarter 2.0f

Rank 7. A wave surfer with a multi-mode targeting gun (RoboWiki general knowledge).

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 45.4% ± 6.2, survival 31.5% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | 34.8% / -9.0, survival 14.3% | `docs/top20-analysis.md` |
| 3.8 vs 3.7 paired (2 seeds) | 51.1% vs 40.8%, +10.4 | `docs/bench/release-check-3.8.md` |
| D1 (3.8) vs 3.7 paired (3 seeds) | 54.0% vs 32.8%, +21.3 ± 10.7 | `docs/bench/d1-gate.md` |
| D4 vs D1 paired (3 seeds) | 47.5% vs 44.4%, +3.2 ± 36.6 | `docs/bench/stack-gate.md` |
| Duel-history score share, cold | 34.8% (2.1) to 46.4% (2.2) | `data/bench/duel-history.tsv` |

**What decides the pairing.** Firestarter's live PBI (-9.0) is the second-worst of the top
19, after Wavelet's. D1 gave it the largest single gain of the whole top-10 gate (+21.3),
the largest evidence anywhere that the lead-aware rule fixes a real, specific weakness
rather than a general one. The release check's +10.4 is smaller and only 2 seeds; whether
D1's full +21.3 survived D2 to D4 and the review fixes, or regressed partway, is not yet
resolved.

**Bench plan.** 40 seeds paired against 3.7, since D1's own interval is ±10.7 and the
release check disagrees with it in size. Gate: paired gain of +10 or more, with the PBI gap
materially closed.

Local 3.8 result (5 seeds x 35 rounds,
`docs/bench/local/2026-10-06_top20-3.8-vs-3.7/cb.fire.Firestarter_2.0f.md`): candidate 45.4%
± 5.6, baseline (3.7) 37.7% ± 4.7, paired +7.7 ± 9.2 pp. Rounds won 72 / 175 (3.7: 37 /
175). Hit rate ours 8.0% ± 0.3, theirs 8.8% ± 0.5. The difference is inside its own interval
(-1.5 to +16.9), so not resolved at 5 seeds. Four of five seeds are positive. Cloud: release
check +10.4 (2 seeds), D1 +21.3 ± 10.7 (3 seeds); local is 2.7 below the release check and
13.6 below D1, and D1's figure lies outside the local interval.

### 8. dsekercioglu.mega.Raven 3.56j8

Rank 8. A wave surfer with a k-NN guess-factor gun (RoboWiki general knowledge). Already a
Hadur win.

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 57.0% ± 7.2, survival 71.2% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | 59.6% / +11.4, survival 74.3% | `docs/top20-analysis.md` |
| 3.8 vs 3.7 paired (2 seeds) | 56.8% vs 57.6%, -0.9 | `docs/bench/release-check-3.8.md` |
| D1 (3.8) vs 3.7 paired (3 seeds) | 58.1% vs 63.1%, -5.1 ± 24.5 | `docs/bench/d1-gate.md` |
| D4 vs D1 paired (3 seeds) | 54.4% vs 55.6%, -1.2 ± 18.0 | `docs/bench/stack-gate.md` |
| Duel-history score share, cold | 49.8% (2.1) to 66.9% (3.5.1 probe) | `data/bench/duel-history.tsv` |

**What decides the pairing.** Already a solid live win (PBI +11.4). Every D-route figure
reads flat to slightly negative, but every one of those intervals is wide enough to contain
zero; nothing says the lead-aware regime actually costs points here, only that it has not
clearly gained any.

**Bench plan.** 10-20 seeds paired, to confirm the live margin is intact rather than to look
for a gain. Gate: no paired loss beyond -3 points; if one appears, check whether the gun's
hit-rate trade-off under the D1-D4 power rules is the cause.

Local 3.8 result (5 seeds x 35 rounds,
`docs/bench/local/2026-10-06_top20-3.8-vs-3.7/dsekercioglu.mega.Raven_3.56j8.md`): candidate
50.5% ± 9.1, baseline (3.7) 61.2% ± 5.0, paired -10.7 ± 13.1 pp. Rounds won 109 / 175 (3.7:
132 / 175). Hit rate ours 9.3% ± 1.1, theirs 9.3% ± 0.6. The difference is inside its own
interval (-23.8 to +2.4), so not resolved at 5 seeds. The point estimate is beyond the -3
gate, but the gate is not resolved either way at 5 seeds; one seed reads -26.5. Cloud:
release check -0.9 (2 seeds), D1 -5.1 ± 24.5 (3 seeds); local is the most negative of the
three, and its interval holds both.

### 9. xander.cat.XanderCat 12.9

Rank 9. A wave surfer with a guess-factor gun (RoboWiki general knowledge).

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 57.3% ± 9.1, survival 62.6% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | 59.2% / +11.0, survival 65.7% | `docs/top20-analysis.md` |
| 3.8 vs 3.7 paired (2 seeds) | 46.6% vs 53.8%, -7.2 | `docs/bench/release-check-3.8.md` |
| D1 (3.8) vs 3.7 paired (3 seeds) | 53.3% vs 50.5%, +2.8 ± 15.1 | `docs/bench/d1-gate.md` |
| D4 vs D1 paired (3 seeds) | 67.2% vs 57.8%, +9.5 ± 45.4 | `docs/bench/stack-gate.md` |
| Duel-history score share, cold | 44.3% (2.0) to 58.0% (3.2) | `data/bench/duel-history.tsv` |

**What decides the pairing.** The live win is solid (+11.0 PBI) but the three D-route
readings disagree in direction and none is tight: -7.2, +2.8, +9.5. This is the clearest
case in the whole set of "not enough seeds to know which way it moved."

**Bench plan.** 40 seeds paired against 3.7, to resolve the direction to within about ±2
points. Watch our hit rate (12.2% at 3.0) against theirs.

Local 3.8 result (5 seeds x 35 rounds,
`docs/bench/local/2026-10-06_top20-3.8-vs-3.7/xander.cat.XanderCat_12.9.md`): candidate
56.7% ± 13.6, baseline (3.7) 54.3% ± 5.1, paired +2.3 ± 12.0 pp. Rounds won 107 / 175 (3.7:
101 / 175). Hit rate ours 13.4% ± 5.0, theirs 9.1% ± 1.0. The difference is inside its own
interval (-9.7 to +14.3), so not resolved at 5 seeds. This is a fourth reading and it
settles nothing. At its observed spread, 40 seeds would give about ±3.1, not the ±2 the plan
hoped for. Cloud: release check -7.2 (2 seeds), D1 +2.8 ± 15.1 and D4 vs D1 +9.5 ± 45.4 (3
seeds); local agrees in sign with D1 and the stack gate, not the release check, and its
interval holds all three.

### 10. lxx.Tomcat 3.68

Rank 10. A wave surfer with a pattern-matching gun (RoboWiki general knowledge).

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 54.6% ± 1.4, survival 63.0% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | 59.3% / +14.0, survival 71.4% | `docs/top20-analysis.md` |
| 3.8 vs 3.7 paired (2 seeds) | 45.6% vs 54.2%, -8.6 | `docs/bench/release-check-3.8.md` |
| D1 (3.8) vs 3.7 paired (3 seeds) | 46.4% vs 57.6%, -11.2 ± 25.1 | `docs/bench/d1-gate.md` |
| D4 vs D1 paired (3 seeds) | 53.5% vs 53.2%, +0.3 ± 7.8 | `docs/bench/stack-gate.md` |
| Duel-history score share, cold | 43.8% (2.1) to 56.6% (2.2) | `data/bench/duel-history.tsv` |

**What decides the pairing.** Tomcat has the largest live win in the set by PBI (+14.0) and
also the largest regression reading against 3.7 of any top-10 opponent (-11.2 and -8.6 in
two separate comparisons), though both intervals are wide enough to include zero. This is
the single robot most worth settling: a real loss here would be the biggest live margin at
risk from the DrussGT route.

**Bench plan.** 40 seeds paired directly against 3.7 (not D1 vs D4, the full stack against
the released baseline), since two independent small-seed readings point the same way. Gate:
the paired result should not sit below -3 points; if it does, the +14.0 live margin is
genuinely eroding and needs tracing to a specific D-stage.

Local 3.8 result (5 seeds x 35 rounds,
`docs/bench/local/2026-10-06_top20-3.8-vs-3.7/lxx.Tomcat_3.68.md`): candidate 56.7% ± 7.8,
baseline (3.7) 56.1% ± 6.0, paired +0.6 ± 10.9 pp. Rounds won 117 / 175 (3.7: 115 / 175).
Hit rate ours 9.6% ± 0.8, theirs 9.9% ± 0.4. The difference is inside its own interval
(-10.3 to +11.5), so not resolved at 5 seeds. The loss that D1 and the release check pointed
to is not reproduced as a point estimate, but 5 seeds cannot rule it out. The -3 gate is not
resolved. Cloud: release check -8.6 (2 seeds), D1 -11.2 ± 25.1 (3 seeds); the local interval
holds -8.6 but not D1's -11.2.

### 11. rsalesc.mega.Knight 0.6.28

Rank 11. A wave surfer with a k-NN gun, by the same author (rsalesc) as Roborio, rank 22
below (RoboWiki general knowledge).

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 52.0% ± 4.5, survival 47.4% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | 46.4% / +4.6, survival 37.1% | `docs/top20-analysis.md` |
| 3.8 vs 3.7 paired (2 seeds) | 55.3% vs 50.3%, +5.0 | `docs/bench/release-check-3.8.md` |
| D1 (3.8) vs 3.7 paired (3 seeds) | 57.3% vs 45.7%, +11.6 ± 4.8 | `docs/bench/d1-gate.md` |
| D4 vs D1 paired (3 seeds) | 53.3% vs 51.8%, +1.5 ± 11.3 | `docs/bench/stack-gate.md` |
| Duel-history score share, cold | 37.6% (2.0) to 52.0% (3.0) | `data/bench/duel-history.tsv` |

**What decides the pairing.** A live loss (score 46.4%) despite a positive PBI (+4.6):
Hadur already does slightly better against Knight than its tier typically would, but still
loses the pairing on raw score. D1's gain is one of the best-resolved in the top 10
(+11.6 ± 4.8 at only 3 seeds).

**Bench plan.** 20 seeds paired against 3.7. Gate: a sustained +8 to +12 point gain,
matching D1's own interval.

Local 3.8 result (5 seeds x 35 rounds,
`docs/bench/local/2026-10-06_top20-3.8-vs-3.7/rsalesc.mega.Knight_0.6.28.md`): candidate
51.3% ± 5.0, baseline (3.7) 47.1% ± 9.5, paired +4.1 ± 9.0 pp. Rounds won 90 / 175 (3.7: 68
/ 175). Hit rate ours 9.2% ± 0.3, theirs 9.8% ± 0.3. The difference is inside its own
interval (-4.9 to +13.1), so not resolved at 5 seeds. Cloud: release check +5.0 (2 seeds),
D1 +11.6 ± 4.8 (3 seeds); local is 0.9 below the release check and 7.5 below D1, and D1's
figure sits inside the local interval.

### 12. aw.Gilgalad 1.99.5c

Rank 12. A wave-surfing duelist (not detailed further in project docs; no confident RoboWiki
note to add here).

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 49.0% ± 7.3, survival 52.6% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | 42.2% / -3.7, survival 48.6% | `docs/top20-analysis.md` |
| D-route paired figure | none; not in the top-10 bench set | — |
| Duel-history score share, cold | 49.0% (3.0), 39.8% and 33.4% (two 3.5.1 probes) | `data/bench/duel-history.tsv` |

**What decides the pairing.** Unknown with any precision. This is a live loss with a
negative PBI, grouped with the DrussGT route targets on that pattern alone, but it has never
been run through a D-stage gate: there is no paired evidence either way for the lead-aware
power rule against it. What duel-history does show is a decline across three cold readings,
49.0% to 39.8% to 33.4%, which predates the D-route entirely (the 3.5.1 probes are from
`docs/bench/d0-drussgt-probes.md`'s baseline reading, before D1 built on it) and is worth
bisecting on its own.

**Bench plan.** This is a data-gap robot, not a confirmed D-route target: run it through the
same paired structure as the top-10 gates (3 seeds first, to see whether the shape matches
DrussGT's or looks like something else), then 20 if the direction looks real. Gate: first,
establish whether the decline from 49.0% to 33.4% is a real trend or seed noise; second,
whether D1's power rule moves it at all.

Local 3.8 result (5 seeds x 35 rounds,
`docs/bench/local/2026-10-06_top20-3.8-vs-3.7/aw.Gilgalad_1.99.5c.md`): candidate 48.9% ±
6.4, baseline (3.7) 40.8% ± 3.1, paired +8.0 ± 8.9 pp. Rounds won 99 / 175 (3.7: 72 / 175).
Hit rate ours 10.0% ± 1.5, theirs 10.7% ± 0.4. The difference is inside its own interval
(-0.9 to +16.9), so not resolved at 5 seeds. Four of five seeds are positive. No cloud
paired figure. Cloud cold shares: 49.0% at 3.0, 39.8% and 33.4% in the two 3.5.1 probes;
local 3.8 reads 48.9% and local 3.7 reads 40.8%.

### 13. pc.Wavelet 1.5

Rank 13. A lightweight wave-surfing duelist (RoboWiki general knowledge: Wavelet is one of
the simpler competitive surfers in its tier, not a heavyweight like DrussGT or Diamond).

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 39.5% ± 5.8, survival 20.0% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | 30.7% / -16.0, survival 11.4% | `docs/top20-analysis.md` |
| D-route paired figure | none; not in the top-10 bench set | — |
| Duel-history score share, cold | 39.5% (3.0), 51.3% and 48.5% (two 3.5.1 probes) | `data/bench/duel-history.tsv` |

**What decides the pairing.** Wavelet's live PBI, -16.0, is the worst figure on the entire
top-19 page (`docs/top20-analysis.md` calls it out directly as falling furthest below
expectation, worse even than Firestarter's -9.0). But that is hard to square with the
duel-history trend: two later 3.5.1 cold probes read 51.3% and 48.5%, both well above the
3.0 figure (39.5%) and nowhere near a -16 PBI read. The live figure and the bench figures
are not the same release and not directly comparable, but the gap is large enough to be the
first thing to check locally.

**Bench plan.** Priority: resolve the live-vs-bench disagreement before anything else. 20
seeds against the current build with no baseline first, to see where 3.8 actually sits;
then pair against 3.7 if the plain figure still looks like a -16 PBI robot rather than
something closer to even.

Local 3.8 result (5 seeds x 35 rounds,
`docs/bench/local/2026-10-06_top20-3.8-vs-3.7/pc.Wavelet_1.5.md`): candidate 46.0% ± 5.1,
baseline (3.7) 56.4% ± 7.2, paired -10.4 ± 8.6 pp. Rounds won 75 / 175 (3.7: 72 / 175). Hit
rate ours 10.4% ± 0.8, theirs 9.2% ± 0.5. The difference is outside its own interval (-19.0
to -1.8), so a real loss. Rounds won are level (75 against 72 of 175) while the share fell:
3.7's bullet-damage share was 69.7% against 3.8's 50.1%. This is the first paired figure for
Wavelet. No cloud paired figure. Local 3.8 reads 46.0% and 3.7 reads 56.4%, against 30.7%
live at 3.4 and 51.3% and 48.5% in the two 3.5.1 cold probes (39.5% at 3.0): nearer the cold
probes than the live figure.

### 14. gh.GresSuffurd 0.4.13

Rank 14. A wave-surfing duelist (not detailed further in project docs).

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 61.2% ± 9.2, survival 71.7% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | 65.4% / +16.2, survival 77.1% | `docs/top20-analysis.md` |
| D-route paired figure | none; not in the top-10 bench set | — |
| Duel-history score share, cold | 61.2% (3.0), 58.1% and 57.9% (two 3.5.1 probes) | `data/bench/duel-history.tsv` |

**What decides the pairing.** A clean, stable win: PBI +16.2 live, and three cold readings
across versions all sit within 3.3 points of each other (57.9% to 61.2%). Nothing here
points to a specific mechanism beyond "Hadur generally out-surfs and out-hits it".

**Bench plan.** 10 seeds paired against 3.7, as a defend-the-margin check rather than a
search for a gain. Gate: no paired loss beyond -3 points.

Local 3.8 result (5 seeds x 35 rounds,
`docs/bench/local/2026-10-06_top20-3.8-vs-3.7/gh.GresSuffurd_0.4.13.md`): candidate 61.1% ±
3.5, baseline (3.7) 64.2% ± 6.2, paired -3.1 ± 3.9 pp. Rounds won 129 / 175 (3.7: 138 /
175). Hit rate ours 11.2% ± 0.4, theirs 8.8% ± 0.6. The difference is inside its own
interval (-7.0 to +0.8), so not resolved at 5 seeds. The point estimate sits on the -3 gate
(-3.1) and the interval reaches +0.8, so the gate is not resolved either way. Seven seeds
would narrow it to about ±3. No cloud paired figure. Cloud cold shares: 61.2% at 3.0, 58.1%
and 57.9% in the 3.5.1 probes; local 3.8 reads 61.1% and 3.7 reads 64.2%.

### 15. kc.serpent.WaveSerpent 2.11

Rank 15. A wave-surfing duelist, by the same package author (`kc`) as BeepBoop, rank 1
(RoboWiki general knowledge, package name only).

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 55.1% ± 8.3, survival 69.7% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | 55.5% / +7.6, survival 71.4% | `docs/top20-analysis.md` |
| D-route paired figure | none; not in the top-10 bench set | — |
| Duel-history score share, cold | 55.1% (3.0), 65.7% and 51.5% (two 3.5.1 probes) | `data/bench/duel-history.tsv` |

**What decides the pairing.** A moderate, positive win (PBI +7.6), with more spread across
the two 3.5.1 probes (65.7% and 51.5%) than most of the clean wins show, which is worth
noting even though both are still comfortably above 50%.

**Bench plan.** 10-20 seeds paired against 3.7. Gate: no paired loss beyond -3 points; if
the 14-point spread between the two 3.5.1 probes repeats, treat the win as less settled than
GresSuffurd's or WhiteFang's and add seeds.

Local 3.8 result (5 seeds x 35 rounds,
`docs/bench/local/2026-10-06_top20-3.8-vs-3.7/kc.serpent.WaveSerpent_2.11.md`): candidate
60.5% ± 1.4, baseline (3.7) 59.6% ± 5.7, paired +1.0 ± 6.6 pp. Rounds won 135 / 175 (3.7:
129 / 175). Hit rate ours 9.5% ± 0.3, theirs 7.9% ± 0.7. The difference is inside its own
interval (-5.6 to +7.6), so not resolved at 5 seeds. No cloud paired figure. Cloud cold
shares: 55.1% at 3.0, 65.7% and 51.5% in the 3.5.1 probes; local 3.8 reads 60.5% ± 1.4 and
3.7 reads 59.6%.

### 17. dsekercioglu.mega.WhiteFang 2.8.1

Rank 17. A wave-surfing duelist by the same author (dsekercioglu) as Raven, rank 8 (RoboWiki
general knowledge, package name only).

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 67.9% ± 2.5, survival 83.3% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | 73.5% / +22.1, survival 88.6% | `docs/top20-analysis.md` |
| D-route paired figure | none; not in the top-10 bench set | — |
| Duel-history score share, cold | 67.9% (3.0), 65.9% and 68.7% (two 3.5.1 probes) | `data/bench/duel-history.tsv` |

**What decides the pairing.** The single biggest live PBI win in the set (+22.1), and the
most stable: every cold reading sits within 2.6 points of 67.9%. The cleanest "defend, don't
touch" case in the band.

**Bench plan.** 10 seeds paired against 3.7, purely as a regression check. Gate: no paired
loss beyond -3 points.

Local 3.8 result (5 seeds x 35 rounds,
`docs/bench/local/2026-10-06_top20-3.8-vs-3.7/dsekercioglu.mega.WhiteFang_2.8.1.md`):
candidate 70.6% ± 5.0, baseline (3.7) 73.2% ± 5.0, paired -2.7 ± 6.8 pp. Rounds won 151 /
175 (3.7: 153 / 175). Hit rate ours 11.2% ± 0.4, theirs 7.6% ± 0.7. The difference is inside
its own interval (-9.5 to +4.1), so not resolved at 5 seeds. No cloud paired figure. Cloud
cold shares: 67.9% at 3.0, 65.9% and 68.7% in the 3.5.1 probes; local 3.8 reads 70.6% and
3.7 reads 73.2%.

### 18. cs.Nene 1.0.5

Rank 18. A wave-surfing duelist (not detailed further in project docs).

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 57.4% ± 3.3, survival 73.7% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | 55.8% / +4.1, survival 72.4% | `docs/top20-analysis.md` |
| D-route paired figure | none; not in the top-10 bench set | — |
| Duel-history score share, cold | 57.4% (3.0), 63.1% and 60.7% (two 3.5.1 probes) | `data/bench/duel-history.tsv` |

**What decides the pairing.** A stable, moderate win, consistent across every reading
(55.8% to 63.1%). PBI +4.1 is the smallest margin of the "won, worth defending" band's
stable members, so it is worth a slightly closer watch than GresSuffurd or WhiteFang even
though nothing in the data looks fragile yet.

**Bench plan.** 10-20 seeds paired against 3.7. Gate: no paired loss beyond -3 points.

Local 3.8 result (5 seeds x 35 rounds,
`docs/bench/local/2026-10-06_top20-3.8-vs-3.7/cs.Nene_1.0.5.md`): candidate 57.1% ± 5.2,
baseline (3.7) 63.9% ± 5.3, paired -6.9 ± 3.1 pp. Rounds won 127 / 175 (3.7: 143 / 175). Hit
rate ours 10.0% ± 0.6, theirs 7.8% ± 0.7. The difference is outside its own interval (-10.0
to -3.8), so a real loss. All five seeds are negative (-8.8 to -3.3) and the whole interval
lies beyond the -3 gate, so the gate is missed. No cloud paired figure. Cloud cold shares:
57.4% at 3.0, 63.1% and 60.7% in the 3.5.1 probes; local 3.8 reads 57.1% and 3.7 reads
63.9%.

### 19. jk.melee.Neuromancer 7.12

Rank 19. Its package name (`jk.melee`) suggests a robot built with the MeleeRumble in mind
that also fights 1v1; the same `jk` package prefix as DrussGT, rank 3, though nothing in
project docs or a confirmed RoboWiki source ties the two together as one author's work, so
that connection is noted, not asserted.

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 49.7% ± 5.7, survival 44.0% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | 51.6% / +0.1, survival 42.9% | `docs/top20-analysis.md` |
| D-route paired figure | none; not in the top-10 bench set | — |
| Duel-history score share, cold | 49.7% (3.0), 47.7% and 36.1% (two 3.5.1 probes) | `data/bench/duel-history.tsv` |

**What decides the pairing.** This is the closest thing to a true coin-flip in the set: PBI
+0.1 live means Hadur scores almost exactly what its tier would predict, and the score
itself (51.6%) is barely above half. The duel-history spread (49.7%, 47.7%, 36.1%) is wide
enough that at least one of those three readings was likely a loss on the day, even though
the figures used for the bands above read it as a win.

**Bench plan.** 20 seeds, plain (no baseline needed yet, since there is nothing to pair
against), to get a real estimate of where 3.8 sits before deciding whether it needs a
baseline comparison at all. Gate: establish whether the true mean is above or below 50%
with the seeds the table above calls for (±2.7 at 20).

Local 3.8 result (5 seeds x 35 rounds,
`docs/bench/local/2026-10-06_top20-3.8-vs-3.7/jk.melee.Neuromancer_7.12.md`): candidate
48.9% ± 4.0, baseline (3.7) 45.0% ± 9.4, paired +3.9 ± 6.9 pp. Rounds won 88 / 175 (3.7: 66
/ 175). Hit rate ours 10.0% ± 0.5, theirs 10.1% ± 0.4. The difference is inside its own
interval (-3.0 to +10.8), so not resolved at 5 seeds. Candidate share 48.9% ± 4.0 spans 50%,
so whether it is above or below even is not settled. It had the most skipped turns of the
set in both builds (56.4 and 69.6 per battle). No cloud paired figure. Cloud cold shares:
49.7% at 3.0, 47.7% and 36.1% in the 3.5.1 probes; local 3.8 reads 48.9% and 3.7 reads
45.0%.

### 20. voidious.Dookious 1.573c

Rank 20. A wave surfer by Voidious, the same author as Diamond (rank 6), long one of the
RoboRumble's strongest robots on a dynamic-clustering guess-factor gun (RoboWiki general
knowledge).

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 59.8% ± 3.1, survival 74.9% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | 65.1% / +16.6, survival 82.9% | `docs/top20-analysis.md` |
| D-route paired figure | none; not in the top-10 bench set | — |
| Duel-history score share, cold | 59.8% (3.0), 74.2% and 55.4% (two 3.5.1 probes) | `data/bench/duel-history.tsv` |

**What decides the pairing.** A strong, positive win (PBI +16.6), though the two 3.5.1
probes bracket a wide range (74.2% and 55.4%), the largest spread of any stable win in the
set. Worth watching for the same reason as WaveSerpent: still comfortably a win on every
reading, but the variance is higher than GresSuffurd's or WhiteFang's.

**Bench plan.** 10-20 seeds paired against 3.7. Gate: no paired loss beyond -3 points; if
the spread from the 3.5.1 probes repeats, add seeds before trusting a single run's number.

Local 3.8 result (5 seeds x 35 rounds,
`docs/bench/local/2026-10-06_top20-3.8-vs-3.7/voidious.Dookious_1.573c.md`): candidate 62.1%
± 6.5, baseline (3.7) 61.3% ± 5.9, paired +0.8 ± 7.7 pp. Rounds won 138 / 175 (3.7: 135 /
175). Hit rate ours 9.5% ± 0.7, theirs 7.3% ± 0.3. The difference is inside its own interval
(-6.9 to +8.5), so not resolved at 5 seeds. No cloud paired figure. Cloud cold shares: 59.8%
at 3.0, 74.2% and 55.4% in the 3.5.1 probes; local 3.8 reads 62.1% and 3.7 reads 61.3%.

### 21. davidalves.Phoenix 1.02

Rank 21. A wave surfer with a pattern-matching gun (RoboWiki general knowledge).

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 61.1% ± 4.7, survival 76.6% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | not available: Phoenix ranked just below Hadur on the page the live analysis read (APS 85.77 against Hadur's 85.90), so it falls outside the top-19 head-to-head table | `docs/top20-analysis.md` |
| D-route paired figure | none; not in the top-10 bench set | — |
| Duel-history score share, cold | one reading only: 61.1% (3.0) | `data/bench/duel-history.tsv` |

**What decides the pairing.** Not established beyond a single bench reading. This is one of
the two robots in the set (with Roborio) that has never had a live head-to-head figure
recorded, since it sits just below Hadur's own rank rather than above it.

**Bench plan.** A fresh baseline reading matters more here than a paired comparison: 10
seeds plain first, to see where 3.8 actually sits, since the only figure on record is from
Hadur 3.0. Gate: establish a current score share before setting any paired gate.

Local 3.8 result (5 seeds x 35 rounds,
`docs/bench/local/2026-10-06_top20-3.8-vs-3.7/davidalves.Phoenix_1.02.md`): candidate 57.4%
± 2.7, baseline (3.7) 59.2% ± 10.8, paired -1.7 ± 12.5 pp. Rounds won 130 / 175 (3.7: 130 /
175). Hit rate ours 9.7% ± 0.6, theirs 8.1% ± 0.4. The difference is inside its own interval
(-14.2 to +10.8), so not resolved at 5 seeds. No cloud paired figure. The only cloud cold
share is 61.1% at 3.0; local 3.8 reads 57.4% ± 2.7 and 3.7 reads 59.2% ± 10.8.

### 22. rsalesc.roborio.Roborio 1.2.4

Rank 22. A wave-surfing duelist by the same author (rsalesc) as Knight, rank 11 (RoboWiki
general knowledge, package name only).

| Measure | Value | Source |
|---|---|---|
| Hadur 3.0 bench share (top-50, cold) | 58.9% ± 4.7, survival 53.7% | `docs/bench/roborumble-top50.md` |
| Hadur 3.4 live score / PBI | not available, for the same reason as Phoenix above | `docs/top20-analysis.md` |
| D-route paired figure | none; not in the top-10 bench set | — |
| Duel-history score share, cold | one reading only: 58.9% (3.0) | `data/bench/duel-history.tsv` |

**What decides the pairing.** Not established beyond a single bench reading, the same gap
as Phoenix.

**Bench plan.** 10 seeds plain first, to get a current baseline reading before any paired
work. Gate: establish a current score share before setting any paired gate.

Local 3.8 result (5 seeds x 35 rounds,
`docs/bench/local/2026-10-06_top20-3.8-vs-3.7/rsalesc.roborio.Roborio_1.2.4.md`): candidate
64.4% ± 4.5, baseline (3.7) 62.1% ± 4.7, paired +2.3 ± 6.7 pp. Rounds won 113 / 175 (3.7:
104 / 175). Hit rate ours 11.8% ± 0.4, theirs 9.1% ± 0.2. The difference is inside its own
interval (-4.4 to +9.0), so not resolved at 5 seeds. No cloud paired figure. The only cloud
cold share is 58.9% at 3.0; local 3.8 reads 64.4% and 3.7 reads 62.1%.

## Order of work

**Status after the first local run (2026-10-06).** All 20 robots now have a local 3.8 against
3.7 paired result above, at 5 seeds each and 40 for DrussGT; `docs/bench/local/2026-10-06_findings.md`
has the ranking, the conditions and the seed counts to run next. The rest of this section is
the order the plan was written in, before that run.

In the rumble table, one pairing moves Hadur's APS by less than 0.1
(`docs/druss-route-plan.md`), so no single robot in this set is individually worth much APS
on its own; the reason to bench them one at a time locally is to catch a regression or
confirm a gain before it is buried in a pooled mean, not to chase APS robot by robot. With
that said, some are better uses of the first wave of seeds than others.

1. **First: the near-50% losses where the D-route evidence is already strong.** DrussGT,
   ScalarR, Diamond, Firestarter and Knight are where the lead-aware power rule has
   documented gains from +8 to +21 points, and where `docs/top20-analysis.md`'s own reading
   of "where the points are" puts the value: these are close fights where a few points of
   hit rate or energy management flip whole rounds, not robots so far ahead that nothing
   short of a new gun would move them. Run these first, at the higher seed counts their
   sections call for (20 to 40), because they carry the most load-bearing claims in this
   document.

2. **Second: the wins worth defending that showed conflicting signals.** Tomcat first (the
   largest live margin with the largest regression signal), then XanderCat (three readings
   that disagree in direction). A real loss on either would be the most consequential finding
   this bench plan could produce, since both currently read as solid wins.

3. **Third: the data gaps.** Gilgalad (a loss with zero D-stage evidence), Wavelet (a live
   PBI of -16 that the bench history does not support), Neuromancer (a coin-flip win with
   high variance), and Phoenix and Roborio (no live figure at all). None of these can be
   placed with confidence until they are run.

4. **Last: BeepBoop and Saguaro.** BeepBoop because nothing currently proposed moves it;
   Saguaro because its pairing is already resolved by the shield counter and only needs a
   periodic check that it still holds. Bench these last, at low seed counts, as confirmation
   rather than investigation.

## Sources

- `hadur-bench/top20.txt` - the 20-robot set and how it was built.
- `hadur-bench/bench-top20.ps1` and `bench-top20.sh` - the wrapper scripts and their
  defaults.
- `docs/bench/local/2026-10-06_parallel-ladder.md` - the width ladder that set `--parallel`
  and `--child-cpus 2`.
- `docs/bench/local/2026-10-06_top20-3.8-vs-3.7.md`, its per-opponent folder and
  `docs/bench/local/2026-10-06_drussgt-40-3.8-vs-3.7.md` - the local results quoted in each
  section. Raw rows are in `data/bench/2026-10-06_hadur-3.8_top20-local_cold.tsv` and
  `data/bench/2026-10-06_hadur-3.8_drussgt40-local_cold.tsv`.
- `docs/bench/local/2026-10-06_findings.md` - what the first local run says as a whole.
- `docs/top20-analysis.md` - Hadur 3.4's live head-to-head and PBI against the top 19, and
  where the points are by rank tier.
- `docs/bench/roborumble-top50.md` and `data/bench/2026-09-28_hadur-3.0_roborumble-top50_cold.tsv` -
  Hadur 3.0's bench share against the top 50, cold.
- `docs/bench/release-check-3.8.md` and `docs/bench/release-check-3.8-report.md` - the
  shipped 3.8 against 3.7, paired, on DrussGT and the top 10.
- `docs/bench/stack-gate.md` and `docs/bench/stack-gate-report.md` - D2-D4 against D1 on the
  top 10 and the weak set.
- `docs/bench/d1-gate.md` - D1 against 3.7 on DrussGT, the top 10 and the weak set, with the
  full per-opponent diagnostics.
- `docs/druss-route-plan.md` - the DrussGT anatomy, the lead-aware power rule, the energy
  model, and the ±2.7-point-at-20-seeds noise figure this plan's interval table scales from.
- `docs/bullet-shielding.md` - how Saguaro shields and how the counter (SHIELD-1 to
  SHIELD-4) beats it, with the probe of which other opponents are exactly head-on.
- `docs/strategy-evolution.md` - what each stage (S0-S7, R0-R2, D1-D5, T1) changed and the
  bench gain at each step.
- `data/learnings.md` - L-39 and L-40, the lead-aware power finding and the energy-lead
  decision rule behind it.
- `data/bench/duel-history.tsv` - every bench share recorded for each opponent across every
  Hadur version, grepped per robot for this plan.
- `hadur-bench/README.md` - the bench's option names (`--set`, `--only`, `--seeds`,
  `--rounds`, `--baseline`, `--baseline-robot`, `--per-opponent`, `--parallel`,
  `--child-cpus`, `--cpu-constant`) and what each report section means.
- `hadur-bench/src/main/java/hadur/bench/Bench.java` and `Host.java` - the current option
  list (including `--parallel` and `--cpu-constant`, issue #102) and the host-description
  format (the local run's header reads "48 logical cores").
