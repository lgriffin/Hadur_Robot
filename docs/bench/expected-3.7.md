# What 3.7 should score live: the baseline to read the rumbles against

3.7 was entered on 5 October 2026 on the RoboRumble, the MeleeRumble and, for the first
time, the TeamRumble. Its predecessor 3.5.1 stood 16th in the 1v1 at 86.65 APS ± 0.23
(1,119 pairings, [data/rumble/](../../data/rumble/)) and 18th in melee. No melee page was
archived for 3.5.1, so its melee APS is not on record. This page sets out what the gate
benches predict for 3.7, so a complete live pass can be read against it.

**In short: 3.7 should play the 1v1 and melee as 3.5.1 does, and the team entry starts
near the bottom.** The architecture evolution (A0 to A5) changed how the code is built, not
how Hadur fights alone. Every one of the eleven fixtures recorded on 3.5.1 replays to the
same orders on 3.7, and no paired bench moved beyond its noise.

## Expected change

| Ladder | 3.5.1 | Expected for 3.7 | Range | What it rests on |
|---|---|---|---|---|
| RoboRumble 1v1 | 86.65 APS, 16th | 86.65 APS, no change | 86.1 to 87.2 APS; about 14th to 19th | Fixtures replay unchanged; paired benches within noise (below) |
| MeleeRumble | 18th, APS not archived | no change | ±1.5 APS around 3.5.1's melee APS | Fixtures replay unchanged; melee gates within noise |
| TeamRumble | not entered | about 28% score share against real teams | 20% to 35% share; low on the ladder | The A5 team baseline over eight teams |

The 1v1 range is the live pass's own noise (± 0.23) plus what the benches cannot resolve.
The finest of them, the reference duels at 5 seeds, cannot see a change below about
0.5 points. The rank band is inferred from the APS gaps round 16th on the saved page: 15th is 0.03 APS
ahead and 17th 0.02 behind, so the rank can move two or three places either way on noise
alone.

A complete pass below 86.1 APS in the 1v1, or more than 1.5 APS down in melee, is outside
what the benches predict. Read it against the fixtures before it is put down to the
ladder (the plan's BENCH-5 rule).

## The 1v1 chain

Each stage was benched in pairs against the one before it, both jars running at the same
time on one machine. A3 and A5 leave solo play unchanged by construction: in a 1v1, A3
builds only the Duel's brain, and A5's team code does nothing while the roster is empty.
Both replay every 1v1 fixture to the same orders.

| Set | A2 vs 3.5.1 | A4 vs A3 | Read |
|---|---|---|---|
| Reference duels (5 seeds x 6) | -0.2 | +0.9 | level |
| Weak leak (1 seed x 11) | -3.9, one MirrorNano battle; 92% over four reruns, as 3.5.1 | +0.4 | level |
| Top 19 (1 seed x 18) | -3.7 (SE 1.7) | +1.5 | level within the set's noise |
| Strong duels | level or higher on all three at 5 seeds | -2.2 at 3 seeds, within noise | level |
| 300-opponent session, score share | not run on 3.5.1 | 86.9% (A3) vs 86.6% (A4) | level, no slide |

The weak and mid-table opponents carry most of the live APS, and the weak set and the
session bench both hold level. Sources: [a2-ab.md](a2-ab.md), [a4-gate.md](a4-gate.md).

## The melee chain

| Set (3 battles each) | A2 vs 3.5.1 | A3 vs A2 | A4 vs A3 |
|---|---|---|---|
| Melee reference (APS) | -2.7 | +0.4 | +0.2 |
| Hand-off (APS) | -1.9 | +1.9 | -0.9 |
| Sentry (APS) | +4.8 | +8.6 | +1.7 |

Three battles a set is noisy: the same jar has read 51.3 and 53.7 APS on the reference
set. No set moved past that noise, and no melee counter moved (faults, ticks aimed at a
dead robot, robots dropped without a death event). The sentry set is 9 rounds a side, so
its gains are noise, not a sign of improvement. Sources: [a2-ab.md](a2-ab.md),
[a3-melee.md](a3-melee.md), [a4-gate.md](a4-gate.md).

## The team baseline

The team bench is five Hadurs against eight five-member teams, 3 seeds of 10 rounds on
1200 x 1200 ([a5-team.md](a5-team.md)):

| Opponent team | Score share |
|---|---|
| sampleteam.MyFirstTeam | 75.5% |
| lxx.ConceptATeam 0.8 | 74.4% |
| davidalves.PhoenixTeam 0.54 | 19.9% |
| apvteam.MambaTeam 0.7.5 | 18.2% |
| cb.mega.FirestarterTeam 1.14 | 11.3% |
| mn.CombatTeam 3.25.0 | 9.4% |
| rz.AlephTeam 0.34 | 8.9% |
| abc.ShadowTeam 3.83 | 7.4% |
| **All** | **28.1%** |

TeamRumble APS is the average score share over the pairings, so a field like these eight
puts 3.7 near 28 APS. A field with more weak teams would read higher, and one with more
strong teams would read lower. The 20% to 35% range covers both. Expect a low rank. The
baseline has no shared target, and teammates collide about 440 times a round. The team
plan starts from these numbers.
