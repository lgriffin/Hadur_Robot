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
| HAND-4 `ENDGAME_CLOSE` (arm `eclose`, suffix ek) | The endgame duel opens at 400 px, not the 650 stranger ceiling | 58 paired battles, seeds 4200-01. Distance 690 to 575 px. Hadur's duel hit rate 14.4 to 14.7%, the survivor's 9.8 to 10.9%. Duel wins +0.5 points, APS +0.12 ± 0.51 | Null in the cloud; read beside HAND-5 on pc-melee-end |
| HAND-5 `ENDGAME_MELEE_GUN` (arm `emgun`, suffix eg) | In the endgame duel, the melee field gun (kNN, learned on the survivor all battle) aims and fires whenever it has learned the survivor | 56 paired battles, 28 fields, seeds 4300-01. Rounds won 54.6 to 56.2%. Duel wins 69.0 to 71.7%, against top-10 survivors 21.3 to 26.0%, against 11-30 57.2 to 61.8%. Duel hit rate level (14.0 vs 13.9%). Score share -0.12 ± 0.32, APS -0.13 ± 0.50 | Mixed and too noisy to call; carded as pc-melee-end |

Both switches act only after a melee hand-off (charter MELEE, no team link, one enemy left), so the
1v1 and the team never see them. Both ship off.

## The card

`hadur-bench/plans/pc-melee-end.queue` (BENCH-171) runs four arms (aa, bb, eg, ek) on the 46 census
fields × 6 fresh seeds (3265-3270), 1,104 battles, about 1.8 h. Each arm has fails 20 and stall 30m
stop rules. The read uses `melee_s0.py screen --base2` under the melee gate, and the card opens a
results PR on `claude/pc-melee-end-results`.

## Next if both fail

The census says lost rounds start with the energy deficit from the crowd: 61 damage taken against 45.
The next lever is crowd damage taken in the last three or four, before the duel begins.
