# 3.11: measure the whole field before changing code

2026-10-08, after 3.10's second pass (87.33, 13th) and the failed 3.11 candidates in
[docs/bench/plan-3.11.md](bench/plan-3.11.md). No robot code changes in this plan. It replaces
"pick a suspect, build it, bench it on 15 to 45 bots" with one broad measurement of every
opponent, a noise budget, and gates set before any candidate is built.

Artifact with the charts: https://claude.ai/artifact/ABHD36QUP4jx69TQDpwSJJ
Numbers below come from the archived pages in `data/rumble/parsed/` and the bench rows in
`data/bench/2026-10-0[6-8]*_cold.tsv`; the script is described under "How the numbers were made".

## Where we are

10th is lxx.Tomcat 3.68 at 87.70. Raven (87.75), XanderCat (87.73), Tomcat and Knight (87.70)
and Gilgalad (87.63) sit within 0.12 of each other, so "10th" means about 87.7.

| Release (page) | APS | Rank | 10th | Gap |
|---|---:|---:|---:|---:|
| 3.4 (2026-10-01) | 85.90 | 20 | 87.71 | -1.81 |
| 3.5.1 (2026-10-05) | 86.65 | 16 | 87.71 | -1.06 |
| 3.7 (2026-10-05) | 85.67 | 21 | 87.71 | -2.04 |
| 3.8 (2026-10-06) | 84.58 | 29 | 87.71 | -3.13 |
| 3.8.5 (2026-10-06) | 84.79 | 24 | 87.71 | -2.92 |
| 3.9 (2026-10-07) | 87.15 | 13 | 87.71 | -0.56 |
| 3.10, first pass (2026-10-08 12:38) | 86.42 | 20 | 87.71 | -1.29 |
| 3.10, second battles (2026-10-08 17:33) | 87.33 | 13 | 87.70 | -0.37 |

The 3.10 rows are the same code. The page moved +0.91 APS as second battles came in.

## Observations

**O1. The gap has the same shape in every release.** Against Tomcat's own scores (its BotCompare
page vs 3.9), split by the opponent's rank, the APS each band contributes:

| Release | 1-10 | 11-50 | 51-200 | 201-400 | 401-700 | 701-1215 |
|---|---:|---:|---:|---:|---:|---:|
| 3.4 | +0.01 | +0.03 | +0.00 | -0.36 | -0.62 | -0.89 |
| 3.8 | +0.06 | -0.04 | -0.17 | -0.46 | -0.90 | -1.59 |
| 3.8.5 | +0.06 | +0.03 | -0.20 | -0.53 | -0.86 | -1.38 |
| 3.9 | +0.05 | +0.03 | +0.12 | -0.05 | -0.27 | -0.44 |
| 3.10 p1 | +0.02 | -0.04 | +0.31 | -0.20 | -0.58 | -0.81 |
| 3.10 p2 | +0.06 | +0.01 | +0.50 | -0.03 | -0.34 | -0.59 |

Hadur is already ahead of the 10th bot in ranks 1-200 (+0.57 on 3.10). The whole gap, and more,
is ranks 401-1215: 816 of the 1,215 pairings, -0.93 APS. Every release lost there; the
releases differ mostly in how much.

**O2. The deficit below rank 400 is diffuse, not a few bad bots.** Against those 816 bots Hadur
scores 95.5 (701+) and 87.3 (401-700) where Tomcat scores 96.9 and 88.6. 524 of them sit 0 to 5
points behind Tomcat and carry +0.76 APS of the gap; the 76 bots more than 5 behind carry +0.46;
216 bots where Hadur leads give back 0.29. A list of 15, 30 or 97 named bots cannot close a
1.4-point shift spread over 800 pairings.

**O3. The ladder's own noise is larger than our changes.** The same 3.10 code moved +0.91 APS
between two reads of its page, and 3.9 to 3.10 off the shield list (identical code) moved -1.25.
The changes themselves were small in APS terms because they were narrow:

| Change | Pairings touched | APS effect |
|---|---:|---:|
| 3.10 shield list | 97 | +0.51 live |
| RAM-4 dodging escape | 15 | +0.002 (bench, level) |
| Flattener off | 30 | +0.008 on the 30 (PC), -1.06 a bot on the top 20 |
| Same code, pass to pass | 1,215 | -1.25 to +0.91 |

So the APS path oscillates mostly because single passes differ, and a release decision read from
one pass cannot see a 0.4 APS change.

**O4. The bench sees least where the gap lives.** Since 2026-10-06 the bench has run 524 distinct
opponents (36,818 trusted 35-round battles). Coverage by band: top 10 9/10, 11-50 20/39, 51-200
92/150, 201-400 132/200, 401-700 160/300, 701-1215 90/516. The top bots got 369 to 489 battles
each; the band holding -0.59 APS is 17% covered.

**O5. Small samples don't replicate.** The flattener read +1.0 ± 0.75 a bot on 3 cloud seeds and
+0.31 [-0.60, +1.22] on 8 fresh PC seeds. Gains of about one point a bot on 3 seeds are inside
the bench's per-battle noise (seed SD median 3.2 points; 2.5 in 701+, 5.0 in the top 50).

**O6. There is headroom in the tail.** Nullstride (1st) beats Hadur 3.9 by +2.4 a pairing in
701-1215 and +7.7 in 401-700; Tomcat only by about +1.0. The weak tail is not saturated at 99,
so efficiency against weak bots (damage taken, how fast they die) is where 10th is won.

## Why the climb thrashes

1. Each stage chased one named suspect on a short bot list, then read the result on one live
   pass whose offset (about ±1 APS) is larger than the change.
2. The gap is a broad shift against ~800 weak and mid bots that the bench mostly doesn't run.
3. Gates were sized for per-bot effects on the list, not for APS over the whole field, so a
   change could pass its gate and still be worth under 0.05 APS.

## Status and what runs where

| Stage | Where | State |
|---|---|---|
| M0 size the instrument | PC | **Done** 2026-10-08 ([m0-sizing](bench/local/2026-10-08_m0-sizing.md), PR #164). G0 met. |
| M1 census, 3.10 and Tomcat | PC | **Done** 2026-10-09 ([findings](bench/local/2026-10-09_census-311-findings.md), PR #165). Bench gap -0.48 vs live -0.35; G1 met overall. |
| M2 noise budget | from M1 rows | **Done.** A/A +0.05 (-0.20 to +0.30); M4 threshold 0.25 APS. |
| M3 deficit ledger | from M1 rows | **Done.** Two clusters pass G3 (ranks 701+ -0.47, 401-700 -0.23). Follow-up: [start-up duress](bench/local/2026-10-09_census-311-duress.md) costs about 0.62 APS on the bench. |
| M4 screen | PC | **Done** 2026-10-09 ([findings](bench/local/2026-10-09_screen-311-findings.md), PR #167). Duress off (`nd`) +0.72 APS (+0.38 to +1.06); TIME-3 off nothing; the duress cost is all in round 0. |
| M4 full census (`g4`) | PC | **Done** 2026-10-10 ([findings](bench/local/2026-10-09_census-312-findings.md), PR #170). G4 met on the bench: `nd` +0.72 APS (+0.56 to +0.87) on 1,212 bots, no band below -0.05, top 50 +0.18 a pairing, all of the screen's gain kept. |
| M4 slow-client check (`slow`) | PC | **Done** 2026-10-10 (PR #170). Met: with half the CPU constant 3.10 is in duress in 100% of battles and `nd` gains +36.8 APS; duress costs score there on the bench. |
| M5 bench gate (`m5`) | PC | **Done** 2026-10-10 (PR #170). **Not met:** `nd` ahead of Tomcat by +0.08 APS (-0.20 to +0.36) against the +0.3 line. Ahead in ranks 1-400 (+0.73), behind from 401 (-0.65); duress off leaves the tail gap. |
| M5 release | Leigh | **Open.** `nd` is a bench gain of about 0.7 APS but short of M5; the release call and any tail work are Leigh's. Nothing released. |

### Running census-312 on the PC (done)

1. Stop the RoboRumble workers; `jps -l` shows no Robocode JVM.
2. Pull master, then from `hadur-bench\`: `.\queue.ps1 run census-312`. Steps `slow`, `g4` and
   `m5` each depend only on `prep` and run in that order; `slow` is about an hour, so its answer
   comes first.
3. Read each step with `python3 data/tools/screen_paired.py <rows.tsv> <rounds.tsv> --candidate ...
   --baseline ... --set ...` (sets: `screen-311.txt` for `slow`, `census-312.txt` for `g4`,
   `census-312-tomcat.txt` for `m5`), commit rows and reports as before, and post the branch here.

Pass rules, fixed before the data:
- `slow` (RES-9's own case: turns skipped all battle long): `nd` at least -0.10 APS against 3.10,
  with 3.10's duress rate well above the 32 to 36% the screen showed. If `nd` loses here, the
  candidate becomes "no duress from round-0 warm-up skips" rather than "no duress".
- `g4` (G4 at 4 seeds, ±0.14 APS): gain at least +0.25 with the 95% lower bound above 0, no band
  below -0.05 APS, and at least half the screen's gain (+0.36), which is G4's fresh-seed rerun.
- `m5`: `nd` ahead of Tomcat by +0.3 APS or more on the bench. The census read 3.10 at -0.48, so
  this needs about +0.8 from `nd`; short of it, the release call is Leigh's, with the expected
  live range stated.

### Running M4 on the PC (done)

1. Stop the RoboRumble workers; `jps -l` shows no Robocode JVM.
2. Pull master, then from `hadur-bench\`: `.\queue.ps1 run m4-311`. Steps `nd`, `nl`, `ndnl`
   and `p4` each depend only on `prep`, so one failing step does not block the rest.
3. Also run, once, on the census rounds files exported last night:
   `python3 data/tools/census_rounds.py <tail rounds.tsv> <top rounds.tsv>` and paste its table
   into the PR. It says whether the duress battles lose in round 0 only.
4. Commit each step's rows TSV and report (not the per-opponent folders or rounds files) and post
   the branch here.

### Running M1 on the PC

1. Stop the RoboRumble workers and close anything else heavy. `jps -l` should show no Robocode JVM.
2. Pull master with this plan merged, then from `hadur-bench\`:
   `.\queue.ps1 run census-311`
   The queue fetches the 3.10 release jar and any missing opponents, then runs three steps that
   resume on their own if interrupted (`.\queue.ps1 status census-311` shows progress):
   - `tail`: Tomcat 3.68 vs 3.10, paired, on the 1,016 bots ranked 201 and below, 4 seeds (201-204). About 1.5 hours.
   - `top`: the same on ranks 1-200 (198 bots). About 1 hour.
   - `ceiling` (optional): Nullstride 2.3.3 alone on the census, same seeds. About 1.2 hours.
     Stop the queue after `top` if the night is short.
3. Commit two files per step: `data/bench/<date>_hadur-census-311-*_cold.tsv` (rows)
   and `docs/bench/local/<date>_census-311-*.md` (report). Leave the per-opponent folders and the
   `_rounds.tsv` files out (about 1,200 files and 30 MB). Open a PR or post the branch here.

Rules fixed before the data comes in:
- Rows with security denials, `otherJvms` above 0, or duress after round 0 are dropped and
  counted. Round-0 start-up duress (the fixed 298-tick count M0 saw in 10 of 48 battles) is kept.
- Tomcat's own pairing is left out (it cannot fight itself), so the census is 1,214 opponents.
- G1 is judged on the census as run; opponents that fail to load are listed and excluded, not rerun.

## The plan

The PC (Threadripper PRO 9965WX, 48 threads, parallel 12, engine 1.11.1, CPU constant 1488498,
JdkWarmup on) runs everything. The PC's RoboRumble client stays off during every stage.

### M0. Size the instrument (no code), done

Result: 48 battles in 133 s at parallel 12; one census pass is 18.4 minutes a seed a subject, so
M1 is 9,720 battles in about 2.5 hours. 0 denials, 0 other JVMs; census set `hadur-bench/census-311.txt`.


- Time 48 battles of 3.10 at parallel 12 against a random 48 from the participant list, to get
  battles an hour and to size M1 and M2 in hours.
- Confirm host conditions are recorded on every row (`otherJvms`, `hostCpuMean`, skipped turns),
  and that rows with security denials or duress are dropped by `analyse.py` (BENCH-84).
- Build the census set: every runnable participant of the 3.10 page (1,215 minus
  `unrunnable.txt`), each tagged with its live rank and band.

**Gate G0:** the timing run has zero security denials and no other Robocode JVM. Otherwise fix
the host first.

### M1. Census of 3.10 and the 10th bot

- 3.10 against every census opponent, 4 seeds (seed base 200), 35 rounds.
- lxx.Tomcat 3.68 as the subject against the same opponents and seeds (the harness already ran
  Knight this way in `tail-knight-v39`). Tomcat is the 10th bot, so Hadur minus Tomcat on the
  census is the bench's gap to 10th, read by band, without any pass offset.
- Optional, if M0 says it fits a night: jd.Nullstride 2.3.3 the same way, for the ceiling per band.

Outputs: per-opponent bench share for both bots, the gap to Tomcat by band, and the score
breakdown per opponent (bullet damage given and taken, ram damage, survival and kill bonuses,
round length).

**Gate G1 (the bench models the ladder):**
- bench vs live correlation 0.9 or better for each subject over the census;
- bench gap to Tomcat within ±0.3 APS of the live gap (-0.37 on the 3.10 p2 page), and each band
  within ±0.15 APS of its live value in the O1 table.

If G1 fails, the next work is the harness, not the robot.

### M2. Noise budget (free from M1)

Split M1's 4 seeds into halves (seeds 1-2 vs 3-4) and treat them as two builds. Their APS-weighted
difference is an A/A test: what a "change" that changes nothing reads on the census.

| Measurement | Noise, 95% | Basis |
|---|---:|---|
| Live page, same code, between reads | ±0.9 to ±1.35 APS | 3.10 p1 vs p2; 3.9 vs 3.10 off the list |
| Bench, one 35-round battle | ±6 to ±10 points | seed SD 2.5 (tail) to 5.0 (top 50) |
| Bench census, 2 seeds a bot, paired | ±0.20 APS | band-weighted seed SD 3.6 over 1,215 |
| Bench census, 4 seeds a bot, paired | ±0.14 APS | same |
| A 45-bot list at 8 seeds | ±0.6 a bot, but ±0.02 APS reach | covers 3.7% of pairings |

**Gate G2:** the A/A difference sits inside its interval, overall and in every band. The decision
threshold for M4 is then twice the measured A/A standard error (expected about 0.2 APS).

### M3. Diagnose from the census

- Join each opponent's deficit to Tomcat with the score breakdown and with what Hadur's wave
  matching says the enemy gun is (head-on, linear, circular, guess factor), and its movement kind
  (rammer, wall-hugger, oscillator, surfer).
- Write a deficit ledger: one row per cluster with the bots in it, the APS it is worth against
  Tomcat, the mechanism (damage taken, slow kills, rounds lost, ram), and whether both seed
  halves agree.
- Read the top 10 and 11-50 bands as a guard only: they are where Hadur leads.

**Gate G3:** a cluster may get code only if it is worth 0.15 APS or more against Tomcat, holds on
both seed halves, and has a mechanism in the breakdown (not just a lower score). Clusters smaller
than that are written down and left.

### M4. Candidates

- Try existing switches and parameters first (build-ablation.sh variants), several builds in one
  queue against 3.10.
- Screen on a stratified sample: 400 opponents drawn from the census in proportion to band size,
  so the sample mean is an APS estimate. 2 fresh seeds, paired against 3.10.
- Survivors go to the full census at 2 fresh seeds.

**Gate G4 (a candidate is real):**
- full-census APS gain at least the G2 threshold (about +0.2), with its 95% lower bound above 0;
- no band loses more than 0.05 APS; the top 50 does not lose more than 1 point a pairing;
- a second run on fresh seeds keeps at least half of the gain.

### M5. Release and the live read

- Release 3.11 only if its census gap to Tomcat is +0.3 APS or better: the margin covers the
  live pass offset. State the expected live range before upload.
- Read the live page only after second battles (fewer than 100 single-battle pairings), and
  compare to the 3.10 p2 page with `live_passes.py drift` to separate the code from the pass.
- Save the BotDetails page at the first full pass and again after second battles.

## What this plan does not do

- No new robot code until G1 to G3 pass.
- No gate on a named bot list alone; a list is allowed only as a screen before the census.
- No release judged on a single live pass.

## How the numbers were made

Pages: `data/rumble/parsed/*_botdetails_hadur2.Hadur_*.csv` (3.4, 3.8, 3.8.5, 3.9, 3.10 twice),
Tomcat's per-opponent scores from `2026-10-07T2046Z_roborumble_botcompare_Tomcat_3.68_vs_hadur2.Hadur_3.9.csv`,
opponent ranks from `docs/bench/opponents-3.10.tsv`. A band's APS is the sum over its opponents of
(Hadur minus Tomcat) divided by 1,215. Bench seed SD is the standard deviation of `score_share`
for the same build and opponent within one run file (3 or more seeds), trusted rows only (35
rounds, no security errors). Tomcat's live scores are from one compare page; its own pass noise
is not removed (inferred to be small: it has thousands of battles).
