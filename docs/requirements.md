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
| RES-1 | Unwanted | If the core throws on any tick, then the adapter shall issue the safe order set for that tick and record the fault. | S1 |
| RES-2 | Ubiquitous | The core shall bound every data structure that grows during a battle. | S1 |
| RES-3 | Ubiquitous | The store shall write a profile to a temporary file and rename it, so that an interrupted write leaves the previous profile intact. | S3 |
| RES-4 | Unwanted | If the live hit-rate estimate diverges from the profile's by more than the margin of error, then the core shall decay the seed weight to zero within 20 waves. | S4 |
| RES-5 | Ubiquitous | Every degradation and fault counter shall be included in the round statistics and the bench report. | S1 |
| RES-6 | Ubiquitous | The core shall contain no use of unseeded randomness, threads, reflection, or file I/O. | S1 |

Stage is where the requirement is first implemented; see the stage plan S0–S7.
