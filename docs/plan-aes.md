# AES: assessment and a first PC plan

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

### Step 1: build (cloud, no PC time)

- **AES-1, the decision record.** A bench-only recorder flag (like `HadurRecorder`, never in
  the competition jar): at each wave's first three-option rating (the MOVE-10 point), write one
  row per option with the wave's fire tick and power, the option's plan interval, and each term
  of `waveDanger` before blending (eleven view densities with their on flags, hit-rate term,
  shadow share, damage, uncertain flag, time to impact, distancing, escape term, next-wave
  minimum). About 1 MB a battle.
- **Truth join.** `data/tools/aes_rank.py join`: match each row to the enemy bullet fired on
  that tick in the bench truth log and mark each option hit or missed by its plan interval.
  Waves with no real bullet are dropped.
- **Parity check (AES's P2).** Re-blend the logged terms at today's weights and confirm the
  re-blend picks the option Hadur took on at least 99% of waves. Below that, the record is
  wrong and nothing after it counts.
- **Fitter.** `aes_rank.py fit`: CMA-ES (or a plain evolution strategy if `cma` is not
  installed) over about 10 normalised weights: four view families (simple, normal, decaying,
  flattener), hit-rate term, shadow share, damage exponent, time-to-impact exponent, distancing
  base, next-wave weight. Objective: damage of the picked option summed over waves. Unit tests
  on a fixture battle, in CI with the other `data/tools` tests.
- **Switch MOVE-22 (`aesw`)**, built only if step 3 passes: the fitted weights as a duel-only
  `MoveDesign` switch, off by default.

### Step 2: record (PC, about 2 hours)

The 432 flat x learning bots from `docs/bench/local/2026-10-18_census-classes.tsv`, split by
identity into two halves of 216 (alternating by rank, so both halves span every band).
Base build with AES-1 on, 2 seeds (1071-1072), 35 rounds, truth logs kept: 864 battles. Rumble
workers at 0.

### Step 3: fit and the offline kill test (cloud or PC, minutes)

Fit on half A, score on half B, then the reverse. Report, for each half, the avoidable damage
(the picked option was hit and another would have missed) at today's weights and at the fitted
weights, with a bot-level bootstrap interval.

**Kill 1.** Stop here, and close AES, if the fitted weights cut held-out avoidable damage by
less than 15%, or the interval crosses zero, or the two halves' fitted weights disagree in
sign on the terms that carry the gain. That would mean the views Hadur already has cannot rank
better under any blend, and the remaining movement lever is new information (a better model
of the enemy gun), not search. 15% of the class's avoidable damage is the smallest cut that,
after the usual lab-to-engine shrinkage, could still reach +2 points on the class.

### Step 4: engine screen (PC, about 3 hours)

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
| Build AES-1, join, parity, fitter | cloud | one session |
| Record, 432 bots x 2 seeds | PC, after pc-midrange-3 | about 2 h |
| Fit and Kill 1 | cloud or PC | minutes |
| Screen, 400 bots x 8 seeds x 2 builds | PC | about 3 h |
| Census, only on a pass | PC | about 15 h |

Five PC hours decide it either way before the census.
