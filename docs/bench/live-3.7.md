# 3.7 live: the three ladders read against the baseline

Leigh saved the RoboRumble, MeleeRumble and TeamRumble rankings pages at 15:46 UTC on
5 October 2026, about two and a half hours after 3.7 was entered. They are archived under
[data/rumble/pages/](../../data/rumble/pages/) and parsed into
[data/rumble/parsed/](../../data/rumble/parsed/). The baseline they are read against is
[expected-3.7.md](expected-3.7.md).

| Ladder | 3.5.1 | Expected for 3.7 | 3.7 live | Pairings, battles | Read |
|---|---|---|---|---|---|
| RoboRumble 1v1 | 86.65 ± 0.23, 16th | 86.65 (86.1 to 87.2) | **85.67 ± 0.18, 21st of 1,216** | 1,205 of 1,215; 2,349 | 0.43 below the range |
| MeleeRumble | 65.31, 18th | 65.3 (63.8 to 66.8) | **65.25 ± 0.25, 18th of 415** | 414 of 414; 1,251 | inside the range |
| TeamRumble | not entered | about 28% share (20% to 35%) | **39.43 ± 0.62, 32nd of 46** | 44 of 45; 214 | above the range |

## The 1v1: a small regression, outside what the benches predicted

3.7 reads 0.98 APS below 3.5.1's partial pass and 0.43 below the bottom of the predicted
range, on a pass that is 99% complete. Survival fell from 94.36% to 93.06% and PWIN from
99.02 to 99.00. The ranks between 14th and 20th sit within 1.0 APS of each other
(GresSuffurd 86.68 to Phoenix 85.77), so the rank moved five places for one point.

What the record says about it:

- **Fixtures replay unchanged.** All eleven fixtures recorded on 3.5.1 replay to the same
  orders on 3.7 (A0 to A5 gates), so the duel decisions on those battles are the same.
- **3.5.1's 86.65 was itself a partial pass** of 1,119 pairings and 1,261 battles. 3.7's
  pass has nearly twice the battles. Earlier releases have read higher early and then slid
  as battles accumulated (3.1: 16th then 64th, L-21 and R7). Survival is the measure that
  moved, which is the pattern the slide showed before.
- **No paired bench moved.** The A2 and A4 1v1 gates were level within noise
  ([expected-3.7.md](expected-3.7.md)).

So the drop is real on the ladder but not yet attributed: it is either the live slide seen
on earlier releases or a cost the benches cannot resolve below 0.5 points. The ladder plan
that follows (the DrussGT route, [druss-route-plan.md](../druss-route-plan.md)) starts from
3.7 as built and measures every stage in pairs against it, so it does not depend on which.

## Melee: level

65.25 against 65.31 is inside the pass's own interval. Survival 40.70 against 38.90.

## Team: above the bench's forecast

The bench forecast about 28% share from eight reference teams, five of them strong. The
live field has more weak teams, and 3.7's first pass reads 39.43 APS, 32nd of 46. The team
plan's first item, teammates colliding about 440 times a round, is unchanged by this.
