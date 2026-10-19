# AES: assessment and a first PC plan

**Closed 2026-10-19: Kill 1 failed on the PC (pc-aes-class).** See "PC result" below.

2026-10-19. Leigh asked whether the proposal "AES: Adversarial Evolutionary Surfing" (v0.1,
19 October 2026) has merit, and for a PC plan to test it. This note judges it against what the
project has already measured and keeps only the part the evidence leaves open.

## Verdict in one paragraph

Most of AES repeats work that is closed. Its new question, RQ1 (are high-risk paths taken
because safer ones are *unreachable*, or because they are *ranked* wrongly?), is already
answered: ranking. Its main build, an evolved trajectory generator scored by the same danger
model (AES-001, P4), aims at reachability and so at the smaller half of the problem; go-to
surfing, the richer candidate set we already have, lost 0.36 APS. What is new and worth a run
is AES's evaluation idea pointed at the right target: fit the surf's danger **ranking**
offline, against real bullets from the 432 flat-mover x learning-gun bots, with a paired
held-out check before any engine time. That is cheap (about 2 PC hours to record, minutes to
fit, 3 PC hours to screen) and it has a clean kill test. If no static re-weighting of the
danger Hadur already computes ranks the three options better on held-out bots, the scorer's
information is the limit and the whole AES line (trajectories, MAP-Elites, adversarial guns,
selectors) should close with it.

## What AES repeats

| AES part | Already measured | Where |
|---|---|---|
| RQ1 reachability vs ranking | Of 12.8 damage a round on the 302 unlisted screen bots, **6.1** had a passed-over option that would have missed; only **0.6** had no escape among the three. On the 149 midrange movers, 57% avoidable, 1% trapped. Ranking, not reach. | `docs/bench/local/2026-10-15_top3-s1-heat-read.md`; midrange thread forensics `2026-10-19_mid-hf.md` |
| P1 physics simulator | The surf's own prediction is precise: 8% of damage lands off the plan. A separate simulator adds parity risk, not information. | `2026-10-15_top3-s0-hf2-read.md` |
| P4 richer trajectories | Go-to surfing (stop points every 2 ticks on both orbits) from duel start: **-0.36 APS**. | `2026-10-15_top3-s1-goto-read.md` |
| P5 MAP-Elites on behaviour descriptors | Style lab, MAP-Elites generator over reversal/dwell/distance: no region outside where real bots sit is harder to learn. | `docs/bench/style-lab.md` (PR #208) |
| P6 synthetic gun ensemble as fitness | Lab guns do not transfer: the regime switch gained 2.8 pp in the lab and lost **0.23 pp** on the PC (400 bots, 8 seeds). The move lab's guns are starved by erratic movement. | `2026-10-18_pc-regime-hjrg.md`, `docs/bench/move-lab.md` |
| P7 runtime selector by gun class | MOVE-15 split by enemy gun +0.08 (below hj), MOVE-17 gun gate level, census: per-class tailoring +0.15 vs global +0.20. | `docs/plan-top3.md`, opposition census |
| Unpredictability as a goal | MOVE-14 protean pick: cuts k-NN in the lab, costs against simple guns. | `docs/top3-movement-study.md` |
| Workstation use | The PC already runs one bench queue at a time; GPU has no use here. | |

AES's sound general rules (split by opponent identity, a frozen holdout, paired seeds, one
global policy before any selector, report simulator vs engine separately) match how the
project already gates work, and are kept below.

## What is new, and why it is the right target

The surf picks among orbit clockwise, orbit counter-clockwise and stop by a danger that is a
fixed blend of terms (`SurfMover.waveDanger`): the eleven k-NN views' densities at the
option's intersection (each view with its own weight and on/off thresholds), the enemy's
normalised hit rate, the shadow share, bullet damage, half weight on uncertain waves, one over
time to impact, the distancing multiplier, and the cheapest next-wave danger. Every one of
those weights was hand-set or tuned one switch at a time. AES's RQ2 (do the parameters
interact?) has never been asked of this blend as a whole, and the bullet makes it cheap to ask
offline: once fired, its heading is fixed, so for the wave it belongs to, whether each of the
three options would have been hit is a fact, not a simulation. The truth logs carry that
heading.

So the experiment is a one-step counterfactual on real battles: log, at each wave's first
rating, every term of the danger for each of the three options; label each option hit or
missed from the truth log; then search the blend's weights for the one that picks the missed
option most often, on bots it was not fitted on. The online replicator (MOVE-16) tried to learn
view weights in battle and came out level; this asks a different question, whether any static
weighting is better at all.

Its known bias: the learning guns aimed from data that Hadur's current choices produced, and a
new ranking changes what they learn next. One-step gains therefore overstate engine gains
(the style lab's lesson). The engine screen is mandatory, and the offline bar is set high
enough to survive shrinkage.

## Plan

All of it is duel-only and off by default; team and melee are untouched. It waits for
pc-midrange-3 (draft PR #212): the base for every step is 3.14hjsw plus whatever pc-midrange-3
keeps, because weights fitted on one base belong to that base.

### Step 1: build (cloud, done)

- **AES-1, the decision record** (`hadur-core/.../move/AesRecord.java`, `MoveDesign.AES_RECORD`,
  ablation `aesrec`, suffix ar; docs/requirements.md AES-1). At each wave's first three-option
  rating (the MOVE-10 point) the duel prints one `AES` line: the wave's fire tick, power, whether
  a real bullet rides it and its source, the option taken, and per option its total, plan
  interval, first-wave danger and every term `waveDanger` blends (hit-rate term, shadow share,
  views' score, damage, uncertain flag, time to impact, distancing quotient, escape term, and each
  of the eleven views' weighted density and weighted scan weight). The recording tick is rated
  without the cutoff so every total is whole; the option taken is unchanged (`AesRecordTest`).
  Behaviour is otherwise untouched and the switch is off in every shipped jar.
- **Truth join** (`data/tools/aes_rank.py join`). Each record on a real wave is matched to the
  enemy bullet that appears in the truth log one tick after the wave's fire time at the same
  power, and each option is marked hit when the bullet's heading lies inside its plan interval.
  On six smoke battles 8,827 of 8,980 real-wave records matched (98%), covering 74% of all enemy
  bullets; most of the rest are one opponent's 1,855, which Hadur met without surfing (no
  record at all), the others waves that were never the first one surfed.
- **Parity check.** The re-blend at today's weights picks the option the surf took on **100%**
  of the smoke waves (gate 99%).
- **Fitter** (`aes_rank.py fit`). A plain CMA-ES (no extra package; numpy only) over ten
  parameters: four view-group multipliers relative to the simple view (normal, the six recent
  views, the light flattener, the two flatteners), or ten single-view multipliers with
  `--groups view`; the hit-rate term's weight; the damage and time-to-impact exponents; the
  distancing base; the next-wave weight; the uncertain-wave factor. Each is kept in a box. The
  objective is bullet damage taken per recorded wave, each opponent weighted equally. Tests:
  `data/tools/test_aes_rank.py`, in CI.
- **Switch MOVE-22 (`aesw`)**, built only if Kill 1 passes: the fitted weights as a duel-only
  `MoveDesign` switch, off by default.

### Step 2: record (PC, about 7-8 hours, queue `hadur-bench/plans/pc-aes.queue`)

Leigh asked for as much data as the run can give, so the record covers the whole census rather
than the class alone: the base with AES-1 on, `census-312.txt` (1,212 bots), 4 fresh seeds
(1071-1074), 35 rounds, no baseline: 4,848 battles, about 7-8 hours at the census rate. That is
four times the data on the 432 flat x learning bots the plan first sized (2 seeds), gives the
fit the other classes for a no-harm read, and doubles as a 4-seed census of the base. It needs
the base fixed first (`ABL` in the queue: today `heatjit,swall`, plus whatever pc-midrange-3
keeps). Disk: about 3-5 MB of hadur.log a battle on top of the truth logs.

### Step 3: fit and the offline kill test (PC, the same queue, about 5 hours)

`fit-class` fits on the 432 (`hadur-bench/aes-flat-learning.txt`), split by identity into two
halves alternating by rank so both span every band: fit on half A, score on half B, then the
reverse, by view group and by single view. `fit-field` repeats it on all 1,212. Each report
gives, per half, the held-out damage per wave and the avoidable part (the picked option was hit
and another would have missed) at today's weights and fitted, with a bootstrap interval over
opponents, the two halves' fitted parameters side by side, and a fit on everything for MOVE-22.

**Kill 1.** Stop here, and close AES, if the fitted weights cut held-out avoidable damage by
less than 15%, or the interval crosses zero, or the two halves' fitted weights disagree in
sign on the terms that carry the gain. That would mean the views Hadur already has cannot rank
better under any blend, and the remaining movement lever is new information (a better model
of the enemy gun), not search. 15% of the class's avoidable damage is the smallest cut that,
after the usual lab-to-engine shrinkage, could still reach +2 points on the class.

### Early cloud read (2026-10-19): Kill 1 looks out of reach

48 class bots at one seed on the cloud (`docs/bench/local/2026-10-19_aes-cloud-read.md`): parity
100%, the taken option is hit on 9.5% of waves against about 13% for each option, almost every hit
was avoidable, but the best refit cuts damage by only 7-12% on the bots it was fitted to and by
1-5% on the held-out half, with no interval clear of zero and the halves' parameters disagreeing in
direction. The in-sample cut bounds the held-out one from above, so more data is unlikely to reach
15%. The PC queue would make that a verdict on 432 bots at 4 seeds; a class-only record at 2 seeds
(about 2.5 hours) would do the same more cheaply.

### PC result (2026-10-19, pc-aes-class): Kill 1 fails, AES closed

Leigh ran `pc-aes-class` on the PC: base 3.14hjsw with the recorder, the 432 flat x learning bots
at 2 seeds (864 battles), 915,214 recorded waves over 372 opponents (the other 60 left no matched
record, as Hadur met them without a surfed real wave; even at the in-sample cut they could not move
the verdict). Reports: `docs/bench/local/2026-10-19_aes-fit-class-family.md`, `-view.md` and
`2026-10-19_pc-aes-class-record.md`.

| Groups | Parity | Held-out avoidable cut, fit on A | Fit on B | Train-side cut |
|---|---|---|---|---|
| family (5) | 100.00% | 6.1% | 4.7% | 5.7% / 6.5% |
| view (11) | 100.00% | 6.6% | 5.9% | 6.9% / 7.4% |

The intervals clear zero, so the gain is real but small: a static re-weighting of the terms the
surf already computes removes about 5% of the class's avoidable damage, a third of the 15% bar,
and the in-sample cut is no larger, so more data cannot reach it. Several fitted parameters sit
on their bounds (hit-rate weight to zero, damage exponent up, time-to-impact exponent to zero),
the sign of a weakly identified blend rather than a better ranking. With the usual one-step to
engine shrinkage, 5% is worth well under the +1.0 point Kill 2 asks of the class, so no engine
screen runs and MOVE-22 is not built.

What it settles: the surf's danger terms are not mis-weighted; they lack the information to tell
the three options apart against learning guns. The remaining movement lever is a better model
of the enemy gun (new information), not search over how today's information is blended. AES's
trajectory, MAP-Elites, adversarial-gun and selector parts stay closed with it. The AES-1
recorder stays in the code, off by default, for any later ranking study.

### Step 4: engine screen (PC, about 3 hours, not run)

If Kill 1 passes: build MOVE-22 with the weights fitted on all 432, and run the 400-bot screen
(`screen-311`, 8 seeds 1081-1088, paired against the base in the same run), as pc-regime ran.

**Kill 2.** Drop it if the screen is below +0.3 points of share on the field or its interval
crosses zero, or the flat x learning bots in the screen gain less than +1.0 point. A pass goes
to the 1,212-bot census (about 15 hours, 4 seeds), gate +0.3 APS whole field with no band below
-0.05, as every top-3 switch.

### Only if MOVE-22 passes the census

Then, and only then, the trajectory side of AES becomes worth a look: re-run the dodge record
on MOVE-22 and see whether "no option would have dodged" has grown from its 5% share. A larger
trapped share is the one result that would justify a richer candidate set (AES's P4). MAP-Elites,
adversarial gun training and runtime selectors stay closed on the evidence above.

## Cost

| Step | Where | Time |
|---|---|---|
| Build AES-1, join, parity, fitter | cloud | done |
| Record, 1,212 bots x 4 seeds (`pc-aes` record) | PC, after pc-midrange-3 | about 7-8 h |
| Join, fit and Kill 1 (`pc-aes` join, fit-class, fit-field) | PC, same queue | about 5 h |
| Screen, 400 bots x 8 seeds x 2 builds | PC | about 3 h |
| Census, only on a pass | PC | about 15 h |

About 13 PC hours, one overnight queue, decide Kill 1; three more decide Kill 2.
