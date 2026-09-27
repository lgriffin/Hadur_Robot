# Hadur 2 requirements

EARS requirements from the Hadur 2 technical direction. This file is the source of truth: every feature file and unit test names the IDs it covers, and IDs never change meaning.

| ID | Pattern | Requirement | Stage |
|---|---|---|---|
| CORE-1 | Ubiquitous | The core shall not import any class from `robocode.*`. | S1 |
| CORE-2 | Ubiquitous | The core shall produce identical `BotOrders` for identical `BotInput` sequences and identical profile state. | S1 |
| MEM-1 | Event | When the first scan of a battle names an opponent, the core shall load the profile for that opponent's lineage key before producing orders for that tick. | S3 |
| MEM-2 | Event | When a round ends, the core shall fold that round's gun, movement and outcome statistics into the opponent profile. | S3 |
| MEM-3 | Event | When a battle ends, the store shall persist the profile atomically within the data quota. | S3 |
| MEM-4 | Unwanted | If a profile fails to load or fails its checksum, then the core shall proceed with an empty profile and record the failure. | S3 |
| MEM-5 | State | While the store is above 90% of quota, the store shall evict gun and surf seeds from the least-recently-fought profiles before writing. | S3 |
| ADAPT-1 | State | While the loaded profile's movement tier is M2 or M3, the gun shall use the anti-surfer aim from the first firing wave. | S4 |
| ADAPT-2 | State | While the loaded profile's gun tier is T3, movement shall enable the flattener views from the first surfable wave. | S4 |
| ADAPT-3 | Ubiquitous | The core shall weight seeded samples lower than samples observed in the current battle. | S4 |
| WAVE-1 | Event | When an enemy energy drop is observed, the core shall subtract damage dealt by our bullets, enemy wall damage and enemy hit refunds before classifying it as a fired bullet. | S2 |
| WAVE-2 | Unwanted | If a corrected energy drop is outside [0.1, 3.0], then the core shall not create a firing wave. | S2 |
| RADAR-1 | Unwanted | If no scan of the enemy arrived on the previous tick, then the core shall turn the radar toward the enemy's last known bearing until it scans the enemy again. | S2 |
| MOVE-1 | Ubiquitous | Movement shall exclude bullet-shadowed guess-factor intervals from a wave's danger score. | S6 |
| DIST-1 | State | While our rolling hit rate exceeds the enemy's by 5 points or more, the distance policy shall reduce the target distance by 25 px per wave, not below 150 px. | S5 |
| POW-1 | Optional | Where the profile's gun tier is T0 and enemy energy exceeds 12, the gun shall fire power 3.0. | S5 |
| MOVE-2 | State | While the enemy's rolling hit rate on us exceeds its profile baseline by more than the margin of error, movement shall change flavour (flattener weight, surf mode, distance band) at the next surfable wave. | S6 |
| DIAL-1 | Ubiquitous | Every policy input shall carry a value and a margin of error, and each policy shall select its conservative setting while the margin exceeds the policy's threshold. | S4 |
| DIAL-2 | Ubiquitous | The core shall not condition any policy on elapsed ticks or round number alone. | S4 |
| END-1 | State | While enemy energy is below 16 and our energy exceeds 40 and the enemy gun heat exceeds ours, the distance policy shall set the target distance to 150 px. | S5 |
| END-2 | State | While enemy energy is 0, movement shall drive directly at the enemy. | S5 |
| TIME-1 | Unwanted | If the previous tick exceeded 70% of the tick allowance, then the core shall reduce its computation level for the next tick. | S6 |
| TIME-2 | Event | When a skipped-turn event is received, the core shall drop one computation level for the remainder of the round and record it. | S6 |
| MELEE-1 | State | While two or more opponents are alive, the core shall drive the robot with the melee subsystems (sweep radar, minimum-risk movement, melee gun) instead of the duel subsystems. | S2 |
| MELEE-2 | Event | When the number of opponents alive falls from two or more to one, the core shall discard its duel tracking and restore full speed before handling that tick's scans. | S2 |
| MELEE-3 | State | While in melee, the radar shall sweep the full circle until every living opponent has been scanned, then keep turning toward the opponent scanned longest ago. | S2 |
| MELEE-4 | State | While in melee, movement shall head for the candidate point of least risk, where risk grows with each opponent's energy over distance squared, near walls and corners, between two opponents, and with fewer escape routes. | S2 |
| MELEE-5 | State | While in melee, the gun shall target the opponent with the lowest score of energy, distance and gun turn, and shall switch from a living current target only when another scores at least 20% lower and the gun can reach it within 4 ticks. | S2 |
| MELEE-6 | Ubiquitous | The melee gun shall aim with circular prediction, fall back to linear prediction while the target's turn rate is unknown, and fire no more power than needed to kill the target. | S2 |
| MELEE-7 | Unwanted | If the melee target's last scan is more than 5 ticks old, then the core shall not fire at it. | S2 |
| MELEE-8 | State | While two opponents within 300 px of each other, and further from us than from each other, are both losing energy to others, the strategy shall keep clear of their fight and halve fire power. | S2 |
| REL-1 | Ubiquitous | The robot jar shall contain only class files that a Java 11 runtime can load, so that every RoboRumble client can run it. | S2 |
| SHIELD-1 | State | While at least 4 of our last 20 resolved duel bullets, and at least a quarter of them, were destroyed by enemy bullets, the core shall treat the enemy as a bullet shielder for the rest of the battle. | S2 |
| SHIELD-2 | State | While the enemy is treated as a bullet shielder, the gun shall offset each shot's aim by between 15% and 50% of the target's angular half-width, varying the offset deterministically from shot to shot and holding it from aiming until the shot is fired. | S2 |
| RES-1 | Unwanted | If the core throws on any tick, then the adapter shall issue the safe order set for that tick and record the fault. | S1 |
| RES-2 | Ubiquitous | The core shall bound every data structure that grows during a battle. | S1 |
| RES-3 | Ubiquitous | The store shall write a profile to a temporary file before replacing it, and remove the temporary file only once the profile is complete, so that an interrupted write leaves the previous profile, or the complete new one, loadable. | S3 |
| RES-4 | Unwanted | If the live hit-rate estimate diverges from the profile's by more than the margin of error, then the core shall decay the seed weight to zero within 20 waves. | S4 |
| RES-5 | Ubiquitous | Every degradation and fault counter shall be included in the round statistics and the bench report. | S1 |
| RES-6 | Ubiquitous | The core shall contain no use of unseeded randomness, threads, reflection, or file I/O. | S1 |

Stage is where the requirement is first implemented; see the stage plan S0–S7.

RES-3 was reworded in S3 without changing its intent. It first said "rename", but Robocode's
sandbox punishes a robot that renames a file (writes must go through
`RobocodeFileOutputStream`). The store therefore copies instead: temporary file, then the
profile, then delete the temporary file; a load takes the profile if its checksum holds,
else the temporary copy.

Opponent memory (MEM-1 to MEM-5) is for duels. A battle that starts with two or more
opponents neither loads nor saves profiles.

The MELEE group is outside the original 1v1 plan. It was added for release 2.1, which enters
the MeleeRumble, alongside S2; the melee code is the 1.x melee work ported into the core.

The SHIELD group answers bullet shielding, found in the RoboRumble top-10 bench
(oog.mega.saguaro.Saguaro 1.0 sits still and shoots Hadur's bullets down). It is outside
the original plan and was added alongside S2 and S3; see docs/bullet-shielding.md.
