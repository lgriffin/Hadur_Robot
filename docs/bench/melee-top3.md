# Cracking the melee top 3

Started 2026-11-02. Hadur 3.21 is 7th in the melee rumble with 69.47 APS. It is 1.98 behind 3rd
(Firestarter 71.43) and 3.25 behind 1st (ScalarR 72.72). The live data stops at 416 pairings,
because a new Robocode release breaks a bot.

## Where the gap is

`melee_gap.py`, comparing live 3.21 with Firestarter by opponent rank band:

| Band | APS gap |
|---|---|
| 1-10 | +0.10 |
| 11-30 | +0.17 |
| 31-60 | +0.24 |
| 61-100 | +0.34 |
| 101-200 | +0.70 |
| 201-300 | +0.38 |
| 301+ | +0.06 |

Hadur's survival is 18 to 20 points lower than Firestarter's in every band. The gap is field-wide
crowd survival, and no one pairing holds it: each opponent is 1/416 of the score. So per-opponent
tailoring cannot find +2 in melee the way it has in 1v1.

## The 1.11.2 cloud census of 3.21

36 fields, 1 seed. The 10 broken fields were dropped; the robots are in `hadur-bench/broken-1.11.2.txt`
and the evidence is in `melee-broken-1.11.2.md`.

- Hadur wins 58% of rounds and is in the last two in 79%.
- 21% of rounds end in a crowd death, mostly at places 3 to 5.
- 21% of rounds are lost in the endgame duel. That duel is fought at a median 694 px with power 1.0.
  Hadur hits 14% of its shots there, against 40% in the crowd.
- Against survivors ranked 31 and lower, Hadur wins 95% or more of the duels it enters ahead on
  energy, and 51-64% of those it enters behind.
- Rounds lost in the duel took 61 crowd damage, against 45 in rounds won. Both spent about 58
  energy on bullets. Hadur entered the lost duels on 29 energy and the won ones on 64.
- Against top-10 survivors Hadur wins only 43% of duels, even when ahead on energy. The duel starts
  with a cold gun and cold movement against a bot the melee has watched all battle.

## Levers tried

| Lever | What it does | Cloud smoke | Status |
|---|---|---|---|
| HAND-4 `ENDGAME_CLOSE` (arm `eclose`, suffix ek) | The endgame duel opens at 400 px, not the 650 stranger ceiling | 58 paired battles, seeds 4200-01. Distance 690 to 575 px. Hadur's duel hit rate 14.4 to 14.7%, the survivor's 9.8 to 10.9%. Duel wins +0.5 points, APS +0.12 ± 0.51 | **FAILED** on pc-melee-end (PR #591): +0.04 ± 0.23, 1-30 endgame wins +1.3 points |
| HAND-5 `ENDGAME_MELEE_GUN` (arm `emgun`, suffix eg) | In the endgame duel, the melee field gun (kNN, learned on the survivor all battle) aims and fires whenever it has learned the survivor | 56 paired battles, 28 fields, seeds 4300-01. Rounds won 54.6 to 56.2%. Duel wins 69.0 to 71.7%, against top-10 survivors 21.3 to 26.0%, against 11-30 57.2 to 61.8%. Duel hit rate level (14.0 vs 13.9%). Score share -0.12 ± 0.32, APS -0.13 ± 0.50 | **FAILED** on pc-melee-end (PR #591): -0.17 ± 0.23, 1-30 endgame wins -1.8 points |

The HAND-5 smoke ran on a build in which the duel still booked the shots the field gun held: their
waves, virtual bullets and bullet shadows. The duel also learned from the field gun's bullet outcomes.
The card runs the fixed build (PR #582 review), which decides the gun's owner before the duel drives.

Both switches act only after a melee hand-off (charter MELEE, no team link, one enemy left), so the
1v1 and the team never see them. Both ship off.

## The card

`hadur-bench/plans/pc-melee-end.queue` (BENCH-171) runs four arms (aa, bb, eg, ek) on the 46 census
fields × 6 fresh seeds (3265-3270), 1,104 battles, about 1.8 h. Each arm has fails 20 and stall 30m
stop rules. The read uses `melee_s0.py screen --base2` under the melee gate, and the card opens a
results PR on `claude/pc-melee-end-results`.

## pc-melee-end read (PR #591, 2026-11-02)

46 fields × 6 seeds, 276 battles an arm, none missing. The bb A/A copy was clean at +0.03 ± 0.16.
HAND-5 lost 0.17 ± 0.23 APS and 1.8 points of 1-30 endgame wins once the duel no longer booked its
shots: the melee kNN aims worse in a duel than the duel gun does. HAND-4 was flat at +0.04 ± 0.23.
Energy entering the endgame (54.7) and deaths with two opponents left (9.3%) did not move in any arm.
Both stay off. The endgame duel is not where the melee gap is.

## Crowd survival (Leigh 2026-11-02 23:15: "Lets do both options")

From the pc-melee-end baselines (aa and bb, 19,320 rounds) and the cloud census:

- **Per opponent:** crowd deaths are spread thin. The worst killer, DemonicRage, causes 1.8% of
  4,208 crowd deaths. Hadur dies in the crowd in 24% of rounds 0-4 and 22% of rounds 5-29, so a
  saved per-opponent danger prior would win back about 0.3 points of crowd deaths at most. Not built.
- **Crowd damage:** in rounds Hadur dies in the crowd it is the nearest robot of 0.98 opponents on a
  mean crowd tick, against 0.77 in rounds it survives. The damage it takes from those opponents
  doubles, 44 against 20. Diamond and ScalarR sit at 0.50, and ScalarR takes half Hadur's crowd
  damage a tick.

MMOVE-24 `CLOSEST_FACTOR_SOLO` (arms `mnear3` n3, `mnear4` n4) raises the closest-robot factor off a
team from 2. Cloud smoke of n4 (43 paired battles, 22 fields, seeds 4400-01; the container restarted
mid-run): crowd deaths 22.1 to 19.1% of rounds (-3.0 ± 2.5), damage from opponents Hadur is nearest
to -3.0 ± 1.5 a round, score share +0.29 ± 0.30. Carded as `pc-melee-near` (BENCH-176): aa, bb, n3, n4
on 46 fields × 6 seeds (3271-3276).

Leigh's card rule of 2026-11-03 asks for per-opponent tailoring, a pilot that stops early and a
written case. pc-melee-near is a melee-wide switch; Leigh granted it an exception on 2026-11-03
("Exception with a pilot"). The pilot (BENCH-178) fights n4 against aa on 46 fields × 2 seeds
(3277-3278, 184 battles, about 17% of the card); `tools/melee_pilot.py` stops the card unless the
score share is up and crowd deaths are down, and opens the results PR with its read when it stops.


## pc-melee-near read (PR #608, 2026-11-03)

46 fields × 6 seeds, 276 battles an arm, none missing. The run started before the pilot merged, so
it ran in full. The bb A/A copy was clean at +0.22 ± 0.20. n3 was flat at +0.01 ± 0.15, with 1-30
endgame wins +3.2 points and energy entering the endgame +1.2. n4 was flat at -0.03 ± 0.16, with
skips +19%. Both fail. The cloud smoke's +0.29 share did not repeat. `CLOSEST_FACTOR_SOLO` stays at
2. Crowd distance is not a lever on its own, so the melee top 3 has no switch left in this line.

## Kill the strong scorers first (Leigh 2026-11-03 22:18-22:21)

Leigh lifted the per-opponent card rule for melee ("melee is different and I have capacity") and asked
for an overnight card. Melee APS is pairwise: against each opponent in a battle, Hadur's pairing is its
battle score over its score plus the opponent's. Survival dominates the score (+50 for each robot that
dies while one lives, +10 an opponent for the last alive), so a robot that keeps finishing high banks
the most points against Hadur. Each one Hadur denies it by killing it before the crowd thins lifts
that pairing even if Hadur scores no more. The field gun weighs opponents by distance, energy and
recent hits only.

MGUN-24 `STRONG_BOOST` (arms `mstr1` k1, `mstr2` k2; ships 0) multiplies an opponent's gun weight by
1 + boost × s in the crowd (three or more opponents alive), with s its mean finishing place this battle
scaled from 0 (always first to die) to 1 (always last alive), once two rounds have placed it. The risk
is that strong robots are harder to hit. Card `pc-melee-strong` (BENCH-185): aa, bb, k1, k2 on 46 fields
× 6 seeds (3280-3285); the pilot (BENCH-186) fights k2 against aa on 2 seeds (3286-3287) and stops the
card unless the score share is up (`melee_pilot.py --share-only`).

## pc-melee-strong read (PR #625, 2026-11-04)

The pilot stopped the card after 184 battles: k2 against aa on 92 pairs moved Hadur's score share
-0.11 ± 0.23 points and crowd deaths -1.4 ± 1.9 points of rounds. Leaning the gun toward the robots
that keep finishing high does not pay: what Hadur takes from them is matched by what it loses on the
easier targets it no longer shoots. `STRONG_BOOST` stays 0, and 920 battles were saved.

## Diamond's whole melee mover (cloud, 2026-11-04)

Leigh 2026-11-04: rebuild the crowd movement on a top bot's design. Of the top five only Diamond ships
its source (zlib licence), and it survives 68.6 live against Hadur's 55.8. MMOVE-25 (`MELEE_CLEAN`,
built on branch `claude/project-thread-s5g1cq`, never merged) put Diamond's 270-line melee mover in
place of Hadur's off a team, with Hadur's gun and radar. Cloud smoke, 46 census fields × seed 4600,
paired against 3.21: score share -1.13 ± 0.36 points, crowd deaths +5.7 ± 2.7 points of rounds.
Hadur's surfer mover outsurvives Diamond's on Hadur; the live survival gap to Diamond is not its
movement design. Not carded.

## Far power on spare energy (MGUN-25, pc-melee-far, 2026-11-04)

The diagnosis after the Diamond mover failed. In the cloud 3.21 census fields Hadur shares with the
top bots, Hadur fires about as many crowd shots at about the same hit rate, but they put 15-25% more
power into the crowd (a battle: Diamond 66 to Hadur's 54, ScalarR 90 to 72, Firestarter 67 to 57,
Neuromancer 75 to 61, DemonicRage 66 to 57) and do that much more crowd damage. Hadur's crowd damage
taken is no worse than Diamond's (59 to 64), so movement is not the gap; firepower is.

Where the power goes (Hadur's crowd shots, not finishers, three or more left):

| Range | Own energy | Share of shots | Mean power |
|---|---|---|---|
| beyond 300 px | 60 or more | 64% | 2.03 |
| beyond 300 px | 40-60 | 9% | 1.94 |
| beyond 300 px | under 40 | 9% | 1.47 |
| within 300 px | 60 or more | 16% | 2.83 |

MGUN-13 fires 1.92 beyond 300 px. Every earlier step up paid (MGUN-13 +0.62, MGUN-16 power 3 out to
300 px +0.15). ScalarR's rule (MGUN-22) scored +0.18 but cost 4.8 points of endgame wins by spending
energy, and Diamond's (MGUN-23) was flat in its cloud smoke. MGUN-25 raises far power only while
Hadur has 60 energy or more, so the endgame reserve stays: arms y3 (power 3) and y5 (power 2.5),
pilot y3 against aa with a share-only stop.

### pc-melee-far read (PR #647): MGUN-25 ships on at 2.5

Pilot y3 against aa: share +0.30 ± 0.26, so the card ran in full. Paired over aa and bb (bb clean, +0.11 ± 0.18):
y5 (power 2.5) **+0.30 ± 0.17**, low end +0.13, endgame wins +0.9, energy entering the endgame -0.2, skips +16%: PASS;
y3 (power 3) +0.19 ± 0.19, others outlived -0.8, endgame energy -0.9. FAR_SPARE ships on at power 2.5 for 3.22; the card,
its arms and plan test are removed, the melee-samples and melee-handoff fixtures re-recorded. Duel and team fixtures bit for bit.
