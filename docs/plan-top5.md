# Plan: top 5 in 1v1, from all the censuses read together

Date: 2026-10-21. Asked by Leigh after the midrange plan was paused ("40 hours of census and
the plan to make the top 5 has not materialised; deep analysis on the census runs and an
informed approach to bridge it; we have a high-end PC to check multiple scenarios in parallel
yet we single-run things").

This document has two halves. Sections 1 to 5 read every census we have as one data set: what
the bench measures well, what it does not, where the gap to the robots above Hadur sits and
what kind of loss it is. Sections 6 to 8 are the plan: how to use the PC's parallelism safely,
the stages, the effect each stage is expected to buy and why, and the evidence that ends each
line of work. Nothing here queues a PC run; every PC step waits for Leigh's go.

Numbers come from `data/tools/census_joint.py` (standard library, tests in CI); its output is
`docs/bench/local/2026-10-21_census-joint/census-joint.json`. Run it again with
`python3 data/tools/census_joint.py --out FILE`.

## Summary

- **Top 5 needs +1.74 APS** (ScalarR 91.23 against 3.13's 89.50); 4th needs +2.24 (Saguaro),
  3rd +3.03 (DrussGT).
- **The bench measures levels very well and differences poorly.** 3.13's per-opponent level
  repeats with r = 0.988 between halves of its 16 census battles and matches the live page
  with r = 0.967; the reference bots' bench APS sit within 0.3 of their live APS. But four
  4-seed censuses of the *same* 3.13 jar differ by up to 0.24 APS (permutation p = 0.002),
  twice what seed noise allows. A single census pair cannot resolve +0.3: a true +0.2 passes
  the +0.3 gate 18% of the time, a true +0.3 half the time.
- **Read against all 16 battles of 3.13, the three candidates were +0.05, +0.31 and +0.12**,
  not +0.20, +0.22 and +0.09. The surf stack (3.14hjswhcpkw2) was probably the best thing we
  built; the census verdicts were coin flips at that size.
- **The top-5 gap is in the weak field, not the midrange.** Against ScalarR (the robot to pass
  for 5th), ranks 51-400 favour *Hadur* by 0.74. The 1.70 sits in three segments: the 719
  ordinary bots ranked 401+ (+0.92), 88 single bots Hadur loses by 10 to 30 points (+1.12)
  and the 87 rammers (+0.48). The same three segments hold 2.14 of DrussGT's 3.03. The
  midrange plan aimed at the one segment where ScalarR and Diamond are *behind* Hadur.
- **The loss there is defence.** Against those bots Hadur takes 1.2 to 3.3 times the damage
  per round that ScalarR takes late in the battle, starts each battle worse (round 0 in band 6:
  13.9 against 7.9), and improves about half as fast over the battle. Against the 88 it does
  not improve at all (25 a round from round 1 to 34; ScalarR 22 falling to 16). Against
  rammers it takes 28 a round; ScalarR takes 8.
- **The plan:** one interleaved multi-arm queue per experiment (every build on every opponent
  and seed, in random order, on CPU-pinned workers) with an A/A arm in every run; a
  calibration run that prices parallelism before anything else; a factorial census that
  measures eight already-built parts at once to ±0.09 APS each; mechanism reads and builds
  for the three segments, screened on detector-gated panels where the per-bot effect is
  large; one release-candidate census with leave-one-out arms. About 27 to 51 PC hours with
  four decision points. Central expectation +1.2 APS (range +0.6 to +2.0); top 5 needs the
  upper half, and the plan says at each point whether that is still possible.

## 1. The data

| Run | Date | Arms | Opponents x seeds | What it adds |
|---|---|---|---|---|
| plan90 gate census | 10-13 | 3.13 vs 3.12 | 1,212 x 4 | 3.13 run 1 |
| pc-1018-stack | 10-18 | 3.13hjsw vs 3.13 | 1,212 x 4 | 3.13 run 2, truth logs (kept on the PC), classes |
| pc-midrange-census | 10-20 | 3.14hjswhcpkw2 vs 3.13 | 1,212 x 4 | 3.13 run 3 |
| pc-midrange-census-2 | 10-21 | 3.14hjswthfgnkxl vs 3.13 | 1,212 x 4 | 3.13 run 4 |
| plan90 Diamond / ScalarR | 10-12 | reference bot alone | 1,212 x 4 | the robots above us on our bench |
| census-311 Nullstride | 10-09 | reference bot alone | ~1,210 x 4 | ditto |
| live BotDetails | 10-15 | 3.13 and the six above it | ~1,215 pairings | the target |

Every PC census used the same host (Threadripper PRO 9965WX, 24 cores / 48 threads), engine
1.11.1, CPU constant 1,488,498, 35 rounds, 12 battle JVMs at once with
`-XX:ActiveProcessorCount=2`, and the same release jar as baseline. 3.13 therefore has 16
battles against each of the 1,212 opponents, in four independent runs.

## 2. What the runs tell us about the bench

### 2.1 Levels: measured well

- 3.13's per-opponent share, first 8 battles against last 8: r = 0.988.
- The 16-battle bench share against the live page, per opponent: r = 0.967, live 0.10 below
  bench on average.
- Reference bots on the bench against live: Diamond 90.46 (live 90.15), ScalarR 91.35
  (91.23), Nullstride 94.88 (94.80). Per class, the bench gap to ScalarR matches the live gap
  to within 0.02 APS (rammers: live +0.50, bench +0.51).

So the bench is a faithful model of the rumble for "how well does Hadur do against X". The
gap analysis in section 3 can be trusted per opponent.

### 2.2 Differences: measured poorly

The four 3.13 runs (same jar, different seeds):

| Run | APS |
|---|---|
| gate (candidate arm) | 89.68 |
| pc-1018-stack (baseline arm) | **89.51** |
| pc-midrange-census (baseline arm) | 89.74 |
| pc-midrange-census-2 (baseline arm) | 89.68 |

Pairwise differences reach -0.24 ± 0.13. Shuffling the 16 battles within each opponent
gives runs that differ by more than the observed spread 0.25% of the time (p = 0.002; null
95th-percentile range 0.17, observed 0.24). Seed noise alone predicts a run-to-run sd of
0.046 APS; the observed sd is 0.10, so each census carries an extra run-level component of
about **0.09 APS** (four runs, so a rough figure). The shortfall of the pc-1018-stack
baseline is spread over hundreds of opponents and all four of its seeds, so it is not one
bad seed or a few crashed battles. Within a run, candidate and baseline at the same seed are
uncorrelated (r = 0.02), so pairing by seed buys no precision.

What this means for every census verdict so far: if the run component hits both arms of a
run alike (load, host state), the paired difference cancels it and the reports' ± 0.13 is
right. If it hits each arm on its own (luck in the seed set), the honest interval is about
± 0.22. No run so far contains the same build twice, so we cannot tell which. Either way,
the gate design had poor power:

| True effect | P(observed ≥ +0.3), seed noise only | with the run component |
|---|---|---|
| +0.1 | 0.00 | 0.03 |
| +0.2 | 0.06 | 0.18 |
| +0.3 | 0.50 | 0.50 |
| +0.5 | 1.00 | 0.97 |

### 2.3 The three candidates read again

| Build | Against its own baseline | Against all 16 battles of 3.13 |
|---|---|---|
| 3.13hjsw | +0.20 ± 0.14 | +0.05 ± 0.11 |
| 3.14hjswhcpkw2 | +0.22 ± 0.13 | **+0.31 ± 0.11** |
| 3.14hjswthfgnkxl | +0.09 ± 0.15 | +0.12 ± 0.13 |

Per segment (section 3), against pooled 3.13, in APS:

| Build | A rammers | B ranks 401+ | C large losses | D ranks 51-400 | E ranks 1-50 |
|---|---|---|---|---|---|
| 3.13hjsw | +0.02 | +0.13 ± 0.07 | -0.02 | -0.06 | -0.03 |
| 3.14hjswhcpkw2 | +0.03 | +0.18 ± 0.07 | +0.05 | +0.06 | -0.01 |
| 3.14hjswthfgnkxl | -0.03 | +0.10 ± 0.07 | +0.07 | -0.01 | -0.01 |

Every build gains in B. The surf and gun stacks also gain a little in C (+0.05 ± 0.05 and
+0.07 ± 0.06), the surf stack a little in A (+0.03 ± 0.02); nothing else moves beyond noise.
The parts we built recovered at most a fifth of B and a fifteenth of C. The "top 10 down 2.9" that stopped
census-2 sits in a band of 10 opponents whose four 3.13 runs themselves span 46.2 to 48.5;
it is not evidence either way.

### 2.4 Per-opponent effects do not repeat

The three candidates share hj + sw. Their per-opponent effects correlate at r = 0.08, 0.14
and 0.11. A switch's effect on one bot, measured at 4 seeds, is almost all noise; that is why
per-bot lists (+0.18 out of sample), class screens on the 149 (+0.6 pp that became +0.03 on
the field) and 48-bot guards did not predict the census. Two kinds of measurement stay valid:
whole-field means (all 1,212, or a random half), and screens of a change that an in-battle
detector switches on *only* for a class, where the class panel is the whole of its effect.

## 3. Where the gap sits

Live gap of each robot above Hadur, in APS over Hadur's 1,215 pairings, split into five
segments that do not overlap:

| Segment | Bots | Hadur live | DrussGT | Saguaro | ScalarR | Diamond |
|---|---|---|---|---|---|---|
| A rammers (census_classify) | 87 | 87.7 | +0.30 | +0.25 | +0.48 | +0.30 |
| B ranks 401+, the rest | 719 | 94.4 | +0.97 | +1.00 | +0.92 | +0.52 |
| C large losses: ≥10 pts behind ScalarR live (chosen from live data only) | 88 | 69.5 | +0.87 | +0.57 | +1.12 | +0.71 |
| D ranks 51-400, the rest | 294 | 85.5 | +0.86 | +0.73 | **-0.74** | **-0.80** |
| E ranks 1-50, the rest | 24 | 73.6 | +0.03 | -0.20 | -0.08 | -0.10 |
| **Total** | 1,212 | 89.5 | **+3.03** | **+2.34** | **+1.70** | **+0.62** |

By rank band (live, APS): DrussGT 0.02 / 0.19 / 0.62 / 0.83 / 0.84 / 0.52 for bands 1-6;
ScalarR 0.10 / 0.14 / -0.14 / 0.08 / 0.67 / 0.85.

Reading:

- **A + B + C hold 2.52 of ScalarR's 1.70** (D gives 0.74 back), **1.82 of Saguaro's 2.34**
  and **2.14 of DrussGT's 3.03**. Every robot in the top 5 beats Hadur by about a point and a
  half a bot across the 719 ordinary weak bots. That is the shape of a top-5 robot, and it is
  where Hadur is not one yet.
- **D is DrussGT's and Saguaro's edge, not the top 5's.** ScalarR and Diamond are behind
  Hadur there. The midrange plan (ranks 51-400, the 149 flat x learning bots) worked on the
  segment that decides 3rd place, while 5th place is decided in A, B and C.
- **C is concentrated.** 88 bots, each worth 10 to 30 points: deo.virtual.RainbowBot (live
  63 vs ScalarR 97), tw.Exterminator (70 vs 96), kenran.mega.Pantheist (69 vs 95),
  Polkwane.Piyane (74 vs 99), deo.CloudBot (72 vs 96), jab.avk.ManuelGallegus (74 vs 96), and
  among the strong bots cb.fire.Firestarter (40 vs 68), pc.Wavelet (39 vs 64),
  rsalesc.roborio.Roborio (57 vs 80). Mostly flat movers with learning guns, at ordinary
  distance (457 px). List: `hadur-bench/panel-large-losses.txt`.
- **A is concentrated too.** 87 rammers, Hadur 87.6 on the bench against ScalarR 94.4,
  Diamond 92.0, DrussGT 91.8 live. List: `hadur-bench/panel-rammers.txt`.

## 4. What kind of loss it is

Damage Hadur takes per round, by round bucket, on the bench (3.13 from pc-1018-stack, the
references from their censuses; rammers taken out of the bands):

| Group | Robot | r0 | r1-2 | r3-5 | r6-9 | r10-14 | r15-24 | r25-34 |
|---|---|---|---|---|---|---|---|---|
| band 6 (701+) | Hadur 3.13 | 13.9 | 7.5 | 5.9 | 5.4 | 5.2 | 4.9 | **4.5** |
| | Diamond | 8.9 | 5.7 | 4.1 | 3.8 | 3.4 | 3.1 | 3.0 |
| | ScalarR | 7.9 | 4.4 | 3.2 | 2.8 | 2.5 | 2.3 | **2.1** |
| | Nullstride | 8.4 | 3.9 | 2.8 | 2.4 | 2.2 | 2.0 | 1.9 |
| band 5 (401-700) | Hadur 3.13 | 23.9 | 14.8 | 12.6 | 12.1 | 11.6 | 11.5 | 11.4 |
| | Diamond | 18.7 | 14.9 | 13.1 | 12.2 | 11.6 | 11.0 | 10.4 |
| | ScalarR | 19.8 | 14.0 | 11.9 | 11.2 | 10.3 | 9.8 | 9.6 |
| C large losses | Hadur 3.13 | 29.3 | 25.4 | 24.6 | 25.1 | 25.1 | 25.2 | **24.8** |
| | Diamond | 21.0 | 21.5 | 20.0 | 19.2 | 19.8 | 19.1 | 19.1 |
| | ScalarR | 22.0 | 18.4 | 16.7 | 16.8 | 16.4 | 15.9 | **15.6** |
| rammers | Hadur 3.13 | 33.4 | 27.5 | 29.5 | 28.2 | 28.9 | 28.4 | **27.6** |
| | Diamond | 22.2 | 18.7 | 18.0 | 16.4 | 16.1 | 15.6 | 15.0 |
| | ScalarR | 17.2 | 11.1 | 11.3 | 10.2 | 9.4 | 8.9 | **8.4** |
| band 3 (51-200) | Hadur 3.13 | 22.0 | 19.4 | 17.9 | 18.3 | 17.9 | 18.0 | 18.6 |
| | ScalarR | 25.8 | 26.0 | 23.8 | 23.6 | 22.7 | 22.2 | 22.2 |

- **B:** Hadur's first round costs 1.2 to 1.8 times the references', and from round 3 on its
  damage falls about half as fast (band 5, rounds 3-5 to 25-34: -10% for Hadur, -19% ScalarR,
  -21% Diamond). Of the damage Hadur takes from the non-rammers of bands 5 and 6, 27% and 36%
  comes from bullets aimed head-on or linear (census_classify's per-hit class, 2026-10-18);
  with the rammers it is 43%. Mean distance there is 390 px. Rounds in which Hadur skipped a turn take 4 to 5 more damage (a
  correlation; long rounds have more chances to skip). The stop-and-start stack already
  works here (+0.10 to +0.18 APS, section 2.3), which says the segment responds to movement.
- **C:** a constant 25 a round from round 1 to round 34, where ScalarR falls from 22 to 16.
  These bots do not out-learn Hadur over the battle; they hit it from the start (7.2% of their
  shots, against 5.3% for the other 384 flat movers with learning guns; 77% of the damage from
  learned aims, at bullet power 1.62) and Hadur never learns to avoid them. Hadur hits them as
  often as the rest of that class (14%), so they are not hard targets; they are hard to dodge.
- **A:** 28 a round against 8 for ScalarR, flat over the battle. Since 3.9, RAM-2's escape
  runs only where RAM-3's per-battle trial says it pays (it had cost the weak tail in 3.5 to
  3.8.5); what is left does not avoid the ram.
- **D, for contrast:** Hadur takes *less* than ScalarR and Diamond in ranks 51-400 (18.6 vs
  22.2 in band 3) and loses only because they deal more. That is why firepower, surf
  fidelity and the TripHammer gun, all aimed at D, could not move the top-5 numbers.

### Why it happens: what we know and what we don't

The rows say what happened each round, not why the surf chose the move that was hit. The
evidence we have points one way, but it was measured on other opponents:

- On the top 50 and the 149 random movers, the hit forensics (MOVE-9/10) found 78 to 90% of the
  damage landed on the surf's own plan, prediction off only 8% of the time, and another
  first-tick option would have dodged 57 to 61% of it: an option-ranking failure, not a
  prediction failure. Nobody has run that read on A, B or C.
- B: 27-36% of the damage is head-on or linear aims, which a wave surfer should all but never
  take. That points at how the surf weighs simple danger against its learned views, above all
  in round 0, before it has data.
- C: flat 25 a round all battle, so the adaptation Hadur has (flattener, view weights) changes
  nothing against them. Their 7.2% hit rate is above the flattener's 4.5% threshold, so it is
  probably on and not helping; its state is not in the rows, so this is unverified.
- A: RAM-2's escape runs only where RAM-3's trial says it pays, so most rammer battles
  probably have no escape; not checked per battle.

Stage 1 (section 7) answers the why from the pc-1018-stack truth logs already on the PC, with
no new battles.

## 5. What the runs do not tell us

- **Where the run component comes from.** No census has run one build twice, so a shift that
  hits a whole run cannot be told apart from a build effect. Every run in this plan carries
  an A/A arm for that reason.
- **The mechanism in B and C, hit by hit.** The per-hit forensics (was another first-tick
  option safe, which view rated it, was the flattener on) exist only for the top 50 and the
  149. The truth logs of pc-1018-stack, kept on the PC, hold what is needed for B, C and A.
- **How the references do it.** We see their scores and damage, not their decisions. Their
  levels are proof that a robot can take half Hadur's damage from these bots, not a recipe.
- **Interactions.** Switches were only ever measured alone or as one stack.
- **What parallelism costs.** The PC already runs 12 battles at once; the "parallel queues
  skew skipped turns" lesson came from running two queues side by side and was never priced.

## 6. How to use the PC: many scenarios in one run, safely

### 6.1 What "parallel" should mean

Today one queue runs one comparison (candidate and baseline) across 12 workers. Running a
second queue beside it doubles the JVMs on unpinned cores, and whichever queue loses the
scheduler fight gets more skipped turns. The fix is not fewer runs but one runner that owns
the whole machine:

1. **Multi-arm bench.** `Bench` takes `--arms FILE` (name | jar per line, any number). Each
   job is one (opponent, seed); it fights every arm in a shuffled order seeded from the job,
   with the data wiped between battles, exactly as BENCH-52 alternates two arms today. Every
   arm sees the same load, the same worker and the same moment; a load effect hits all arms
   alike and cancels in every comparison.
2. **Pinned workers.** Each worker JVM is bound to one physical core's two hardware threads
   (`start /affinity` on Windows, `taskset` on Linux; worker i gets threads 2i and 2i+1), with
   `-XX:ActiveProcessorCount=2` as now. No two battles share a core, and the OS cannot migrate
   a battle onto a busy one. Two cores stay free for the runner and Windows.
3. **An A/A arm in every run.** The 3.13 release jar twice under two names
   (`hadur2.Hadur 3.13` and `hadur2.Hadur 3.13aa`). Its difference is the run's own null: if
   it is outside its 1% band, 2.58 x 3.2 x sqrt(1/s1 + 1/s2) / sqrt(n) points (s1, s2 its seeds per
   opponent, n opponents: ± 0.34 APS at 1 seed each on the full census, ± 0.47 on a half), the
   run has an arm-specific defect. That band only catches gross faults: a shift of the 0.09 size
   seen in section 2.2 is below it. What protects the comparisons from such a shift is that all
   arms share the run, so a run-level shift cancels in every main effect and every RC contrast.
4. **Factorial arms, not one switch per run.** With 16 arms in one run, a 2^(8-4) design
   (resolution IV) measures eight two-level factors at once; each main effect is the
   difference between 8 arms and 8 arms over every opponent, so its precision is that of a
   census of 8 seeds a side. With 1 seed per arm per opponent on the full census (19,392
   battles plus the A/A arm), each main effect is known to **± 0.09 APS**, against ± 0.13 for
   one switch from a whole census pair today, and no main effect is confused with a two-way
   interaction.
5. **Sequential halves.** The census splits into two interleaved halves (odd and even rank).
   Half 1 alone gives ± 0.13 per factor. Half 2 runs only if a factor sits in the undecided
   zone (section 7.4).

### 6.2 Calibration run (Stage 0): price parallelism before trusting it

Facts we have: 12 workers run about 650 battles an hour (pc-1018-stack: 9,696 battles in 14.8
h); Hadur skips 32 to 42 turns a battle at 12 workers (about one a round); 46 to 55% of
battles meet the bench's "trusted" bar (at most 2 skips a round).

Calibration, one queue, about 5 hours:

- Panel: 240 opponents, a stratified random draw from the census (40 per band).
- Arms: 3.13, 3.13aa, and 3.14hjswhcpkw2 (the heaviest build per turn we have).
- Blocks: 12 workers unpinned (today's setting), 12 pinned, 18 pinned, 22 pinned, then 12
  pinned again (to catch drift), 1 seed per arm per opponent each block.

Read per block: skipped turns per battle and per round, the share of trusted battles, 3.13's
APS on the panel, the A/A difference, the candidate's paired difference, battles per hour.

Decision: take the largest worker count whose skipped turns per round stay within 15% of the
12-pinned block (skips are counted per turn, so this is measured tightly) and whose 3.13
panel score and candidate difference agree with the 12-pinned block within their noise
(about ± 0.6 points per block at this size, so this only catches a gross effect; the fine
check is the A/A arm that every later run carries). If 22 pinned passes, the PC delivers
about 1.7 times today's throughput for every later stage; if nothing above 12 passes, the
plan still gains its 4 to 8 times from the factorial design and runs at 12.

### 6.3 Tooling (cloud, before any PC time)

- `Bench`: `--arms`, shuffled per-job arm order, `--pin` (affinity masks), the build column in
  every rows file, the A/A arm checked in the report. Unit tests as for BENCH-52.
- `data/tools/factorial.py`: main effects and two-way alias sets from a multi-arm rows file,
  per segment A-E and per band, with intervals from the opponent-level differences; tests.
- `build-ablation.sh` combinations for the 16 factorial arms, built and smoke-run in CI from
  one commit of the 3.14 line (`ed968c98`), each ablation checked to apply once.
- `hit_forensics`-style read of the pc-1018-stack truth logs for segments A, B and C (runs on
  the PC from the kept logs; no battles).

## 7. The plan

### 7.1 Stages

| Stage | Where | PC hours | What it decides |
|---|---|---|---|
| 0 Calibration | PC, one queue | ~5 | worker count; whether the run component is a bench defect |
| 1 Mechanism reads for A, B, C | cloud + PC log read (minutes) | <1 | what to build for each segment, with numbers |
| 2 Factorial census of eight built parts | PC, one queue | 8-16 per half | which parts ship; the base for stage 4 |
| 3 Segment builds, panel screens | PC, one queue | ~3 | whether the A and C builds work where they act |
| 4 Release-candidate census | PC, one queue | 10-17 | ship or stop |

Stages 1 and the tooling run in the cloud while Stage 0 runs on the PC.

### 7.2 Stage 2 factors

Each factor has two levels, the low level being 3.13's behaviour. All are built today.

| Factor | Change | Why it is in | Expected main effect (APS) |
|---|---|---|---|
| hj | MOVE-13 stop-and-start | the only movement change that has gained in B | +0.05 to +0.2 |
| sw | SHIELD-14 wall-hit shield | part of the hj census builds; never measured alone on the field | 0 to +0.1 |
| S | surf stack hitclr + pkern + keep2 | best candidate read against pooled 3.13 (+0.31 with hj sw) | 0 to +0.15 |
| G | gun stack thgun + freegun + nodecay | +1.16 pp in C, -1.3 pp in band 1 | -0.1 to +0.1 |
| R | `ram2`: RAM-2's escape never runs (RAM-3's trial arm off) | A is 0.48; this is the layer that faces it | -0.1 to +0.2 |
| F | `flat`: flattener never switches on | B and C are hit by simple and constant guns; the flattener randomises the surf | -0.2 to +0.2 |
| N | `fin`: END-1 finishes without closing to 150 px | B's hits come at 390 px; finishing closes in on a bot that is still firing (3.12's `away` kept the whole battle far and lost; this is only the finish) | 0 to +0.15 |
| T | `nolearn`: TIME-3 learns no allowance from a round-0 skip | skip rounds take +4 to +5 damage in B | -0.1 to +0.1 |

Why own layers: Hadur's large steps have mostly come from finding one of its own layers that
cost (RAM-2 in 3.9, duress RES-9 in 3.11, the shield latch in 3.12), not from porting a part.
The four own-layer factors are the ones that act on A, B and C. If a factor's ablation does
not apply cleanly on the 3.14 line, `mir1` (MIR-1) or `nodur` takes its place.

Design: 2^(8-4), generators N = hj·sw·S, F = sw·S·G, R = hj·S·G, T = hj·sw·G. The all-low arm
is plain 3.13, which with 3.13aa forms the A/A pair (17 arms). Two-way interactions are
aliased in 7 sets of 4 (28 interactions over 7 contrasts), so Stage 2 cannot name an
interaction, only flag a set. If a set's contrast is large (≥ 0.2), a fold-over of the 8 arms
that split it is added to Stage 4. Stage 4's leave-one-out arms measure each part's
contribution given the rest of the release candidate, which is what the ship decision needs;
they do not identify interactions.

### 7.3 Stage 1 and 3: the three segments

| Segment | Available against ScalarR | Mechanism read (Stage 1) | Build | Screen (Stage 3) | Expected |
|---|---|---|---|---|---|
| A rammers | 0.48 | ram damage vs bullet damage, distance and heading at contact, what RAM-1/RAM-2 do on each rammer | rammer policy gated by the rammer detector | 87 rammers x 4 seeds x 3 arms (3.13, 3.13aa, build); per-bot seed sd 2.3 pts gives ± 0.3 pts | +0.2 to +0.25 |
| C large losses | 1.12 | for each hit: was it on the surf's plan, was another first-tick option safe, which view rated it, flattener state, distance; is the gun head-on/linear/constant GF | a per-battle "this gun keeps hitting us" response gated on the enemy's hit rate after N waves (on only where it is high, so the panel is its whole effect) | 88 bots x 4 seeds x 3 arms; seed sd 4.8 pts gives ± 0.65 pts | +0.25 to +0.4 |
| B ranks 401+ | 0.92 | the same hit read on a random 100 of B; round 0 apart from later rounds | whatever Stage 2 and the read point to; B is 60% of the field, so its candidates are field arms in Stage 4, not panel screens | | +0.15 to +0.3 beyond Stage 2 |

Hit-rate and rammer detectors make A and C safe to screen on their panels: the build does
nothing until the detector fires, so its effect outside the panel is the detector's false
positives, which the Stage 4 rows count directly.

### 7.4 What ends a line of work (fixed now)

- **Stage 0.** If the A/A difference falls outside its own 95% interval in more than one of
  the five blocks, or the two 12-pinned blocks (first and last) disagree beyond their noise,
  the bench has a defect: stop the plan and find it before measuring anything else. In every
  later run, an A/A difference outside its 1% band (section 6.1, item 3: ± 0.34 APS at 1 seed
  each on the full census, ± 0.47 on a half) voids the run.
- **Stage 1.** A segment's build starts only when the read names a mechanism that accounts
  for at least half of the excess damage against ScalarR there, with the numbers. No read, no
  build; that segment closes.
- **Stage 2, after half 1.** A factor with |effect| < 0.10 and an interval of ± 0.13 or
  better is settled at "no effect" and drops out. Half 2 runs only if some factor lies
  between 0.10 and 0.25. A factor is kept at ≥ +0.10 with its interval above 0 on the census
  and no segment A-E below -0.05 APS.
- **Stage 3.** The rammer build needs ≥ +2.5 points mean on the 87 (interval above +1); the C
  build ≥ +4 points on the 88 (interval above +1.5). Two design iterations per segment at
  most; then that segment closes.
- **Stage 4.** The release candidate (Stage 2 keepers + Stage 3 keepers + any B change) runs
  against 3.13 and 3.13aa (2 seeds each) and one leave-one-out arm per new part (1 seed), on
  the full census: about 11,000 battles. The RC's 2 battles a bot are compared with the 4 of
  3.13 and 3.13aa pooled, 3.2 x sqrt(1/2 + 1/4) / sqrt(1212) = 0.080 APS, so ± 0.16 at 95%
  (± 0.18 if the controls were not pooled).
  It ships at ≥ +0.5 APS with the interval above +0.3, no segment below -0.05, and every
  leave-one-out showing its part ≥ 0. Below +0.6, top 5 is out of reach on this route: report
  that and stop adding switches.
- **Live.** A release counts when its first full live pass is at least +0.4 over 3.13
  (first live passes drift by about 0.2; PR #155).

### 7.5 The arithmetic

| Source | Central | Range |
|---|---|---|
| Stage 2 keepers (hj sw S G, built) | +0.2 | +0.05 to +0.35 |
| Stage 2 own layers (R F N T) | +0.15 | 0 to +0.4 |
| A rammers | +0.2 | 0 to +0.3 |
| C large losses | +0.35 | 0 to +0.6 |
| B beyond Stage 2 | +0.2 | 0 to +0.35 |
| **Total** | **+1.1** | **+0.05 to +2.0** |

Top 5 needs +1.74 live. The central case reaches 7th to 6th with a clear margin over
Diamond and closes most of the gap to ScalarR; top 5 needs about two thirds of the segments'
available gap to land, which is what ScalarR itself does against these bots. Each decision
point says whether that is still possible: after Stage 2 the built parts are priced; after
Stage 3 the two concentrated segments are priced; Stage 4 is the only census verdict.

PC time: Stage 0 ~5 h, Stage 2 9-16 h per half (9 at 22 pinned workers, 16 at 12), Stage 3
~3 h, Stage 4 10-17 h. Between 27 and 51 hours, plus 9 to 16 if Stage 2's second half is
needed, against 40 hours already spent on single comparisons; every hour of it measures
several things at once, and each stage can stop the plan.

## 8. Not in the plan, and why

- **More midrange (D) work.** D is DrussGT's and Saguaro's edge (0.95 and 0.78) and decides 3rd
  place. It comes back after top 5, with a fresh read: the loss there is offence (they deal
  more; Hadur takes less), and firepower, surf fidelity and the Diamond gun have all been
  tried.
- **Per-bot lists for switches.** Per-bot effects repeat at r ≈ 0.1 (section 2.4). Name lists
  stay for what they are good at: identities with large, stable effects (the shield list).
- **Class screens of global switches.** The 149 screen and the 48-bot guards did not predict
  the census (section 2.4). A panel is valid only for a change gated by an in-battle detector.
- **Two queues at once.** Replaced by one multi-arm queue on pinned workers.
