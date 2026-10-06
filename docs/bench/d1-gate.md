# D1 gate: lead-aware duel power against 3.7

The D1 build (`hadur2.Hadur 3.8`, commit c4b3843) against the released 3.7, paired by seed
(BENCH-2) with `hadur-bench/d1-gates.txt`: 20 battles against DrussGT 3.1.16, the RoboRumble
top 10 at 3 seeds and the weak set at 2 seeds, 35 rounds each, cold. Run on 5-6 October
2026 in the Claude Code container (4 cores, Java 21), one bench at a time.

**Verdict: the gate passes.**

| Gate (docs/druss-route-plan.md, "Stages and gates") | Result |
|---|---|
| DrussGT: 8 points or more over the released robot, cold | **+12.0 ± 4.3** (48.2% against 36.2%, 20 pairs). Rounds won 347 of 700 |
| Top 10 not below 3.7 by more than the interval | Mean paired difference **+6.7** over the ten (30 pairs). Eight of ten are higher; Raven −5.1 ± 24.5 and Tomcat −11.2 ± 25.1 are inside their intervals. Diamond +14.1 ± 1.3, Knight +11.6 ± 4.8 and DrussGT +14.2 clear zero |
| Weak set level | Level on ten of eleven (−0.5 to +2.0). MirrorNano −10.8 ± 110 comes from one battle that lost 4 rounds; that battle wrote no lead-regime records (`P,...,lead`), so POW-7 never engaged in it. MirrorNano has read this way before (a2-ab.md: one battle, 92% over four reruns) |
| Faults | 0 |

The top-10 gain was not expected: the plan benched only DrussGT and warned that a power rule
favouring survival can lose against the field. Against the top 10 it gains on the surfers
whose power follows ours down (Firestarter +21.3, Diamond +14.1, DrussGT +14.2). The plan's
fallback ("narrow POW-7 to opponents whose bullet power follows ours down") is not needed.

Skipped turns run higher than on a quiet host (224 over 40 DrussGT battles of the
candidate); a worker was building code during the first battles. The pairing cancels what
both sides share.

The full report follows.

## Bench suite: d1-gates.txt

## Bench: hadur2.Hadur 3.8 (cold)

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=4184996.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | rumble-2 | 48.2% ± 2.1 | 49.0% ± 3.6 | 47.2% ± 0.9 | 347 / 700 | 7.4% ± 0.2 | 9.8% ± 0.2 | 224 | 0 | 2.80 / 119.7 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 178297 | 35 | 177906 | 177888 (99.8%) | 409 (0.2%) | 18 (0.0%) | 11012 | 1184 | 205 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 178622 | 21929 (12.3%) | 176475 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 650 | 518 | 650 | 2957 | 26.8 / 29.9 | 11 | 29170 | 1542 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 9.8% | 224 | 2755 | 3 | 252.7 | 21903 / 21929 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.8 vs hadur2.Hadur 3.7

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 48.2% ± 2.1 | 36.2% ± 3.4 | +12.0 ± 4.3 |

# Bench: hadur2.Hadur 3.8 baseline (hadur2.Hadur 3.7) (cold)

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=4184996.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | rumble-2 | 36.2% ± 3.4 | 23.1% ± 4.5 | 50.3% ± 2.1 | 173 / 700 | 7.8% ± 0.2 | 9.4% ± 0.2 | 163 | 0 | 2.77 / 100.2 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 165656 | 34 | 165547 | 165534 (99.9%) | 122 (0.1%) | 13 (0.0%) | 9578 | 1030 | 157 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 163521 | 20194 (12.3%) | 162505 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 650 | 521 | 650 | 2739 | 28.9 / 28.5 | 39 | 1787 | 207 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 9.4% | 163 | 3956 | 3 | 234.5 | 20186 / 20194 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Bench: hadur2.Hadur 3.8 (cold)

35 rounds x 3 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=3642914.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 24.7% ± 13.4 | 10.6% ± 15.5 | 43.9% ± 14.5 | 12 / 105 | 4.8% ± 1.4 | 8.2% ± 0.6 | 31 | 0 | 2.83 / 60.8 |
| jk.mega.DrussGT 3.1.16 | rumble-2 | 47.7% ± 7.9 | 49.5% ± 10.8 | 45.4% ± 7.4 | 52 / 105 | 6.9% ± 1.3 | 9.4% ± 1.5 | 55 | 0 | 2.56 / 51.9 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-3 | 73.0% ± 3.0 | 84.8% ± 4.1 | 61.4% ± 4.7 | 89 / 105 | 19.1% ± 1.0 | 6.6% ± 1.1 | 8 | 0 | 2.54 / 21.6 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-4 | 35.7% ± 19.1 | 31.4% ± 28.4 | 41.3% ± 8.4 | 33 / 105 | 6.5% ± 1.2 | 10.0% ± 1.3 | 29 | 0 | 2.77 / 61.0 |
| voidious.Diamond 1.8.22 | rumble-5 | 44.6% ± 10.7 | 51.0% ± 21.4 | 38.1% ± 7.0 | 54 / 105 | 6.1% ± 1.7 | 8.2% ± 1.0 | 20 | 0 | 2.78 / 36.0 |
| cb.fire.Firestarter 2.0f | rumble-6 | 54.0% ± 6.0 | 53.3% ± 10.8 | 54.8% ± 0.8 | 56 / 105 | 8.5% ± 0.4 | 8.5% ± 1.3 | 51 | 0 | 2.38 / 141.1 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-7 | 58.1% ± 13.6 | 74.3% ± 18.8 | 41.1% ± 8.8 | 78 / 105 | 9.8% ± 0.5 | 9.2% ± 0.2 | 12 | 0 | 1.72 / 61.7 |
| xander.cat.XanderCat 12.9 | rumble-8 | 53.3% ± 11.7 | 61.0% ± 17.9 | 46.2% ± 9.1 | 64 / 105 | 11.9% ± 1.4 | 8.4% ± 1.4 | 24 | 0 | 1.86 / 35.4 |
| lxx.Tomcat 3.68 | rumble-9 | 46.4% ± 7.9 | 55.2% ± 10.8 | 38.2% ± 4.4 | 58 / 105 | 8.5% ± 0.6 | 10.6% ± 0.8 | 66 | 0 | 2.76 / 116.1 |
| rsalesc.mega.Knight 0.6.28 | rumble-10 | 57.3% ± 5.5 | 63.8% ± 8.2 | 50.2% ± 3.6 | 67 / 105 | 8.7% ± 1.1 | 9.6% ± 0.4 | 43 | 0 | 3.11 / 80.5 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 15543 | 183 | 16342 | 15535 (99.9%) | 8 (0.1%) | 807 (4.9%) | 608 | 110 | 26 |
| jk.mega.DrussGT 3.1.16 | 26792 | 12 | 26793 | 26792 (100.0%) | 0 (0.0%) | 1 (0.0%) | 1600 | 171 | 58 |
| oog.mega.saguaro.Saguaro 1.0 | 3576 | 6 | 3579 | 3576 (100.0%) | 0 (0.0%) | 3 (0.1%) | 256 | 60 | 9 |
| aaa.r.ScalarR 0.005h.053-noshield | 21233 | 7 | 22087 | 21233 (100.0%) | 0 (0.0%) | 854 (3.9%) | 1245 | 224 | 33 |
| voidious.Diamond 1.8.22 | 21926 | 516 | 22717 | 21914 (99.9%) | 12 (0.1%) | 803 (3.5%) | 1284 | 120 | 20 |
| cb.fire.Firestarter 2.0f | 26694 | 549 | 30896 | 26596 (99.6%) | 98 (0.4%) | 4300 (13.9%) | 2366 | 202 | 44 |
| dsekercioglu.mega.Raven 3.56j8 | 9141 | 48 | 9131 | 9129 (99.9%) | 12 (0.1%) | 2 (0.0%) | 689 | 97 | 11 |
| xander.cat.XanderCat 12.9 | 8843 | 7 | 9272 | 8843 (100.0%) | 0 (0.0%) | 429 (4.6%) | 1025 | 135 | 29 |
| lxx.Tomcat 3.68 | 16093 | 452 | 16082 | 15977 (99.3%) | 116 (0.7%) | 105 (0.7%) | 1272 | 130 | 53 |
| rsalesc.mega.Knight 0.6.28 | 29341 | 208 | 29344 | 29338 (100.0%) | 3 (0.0%) | 6 (0.0%) | 2322 | 231 | 45 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 15396 | 1622 (10.5%) | 14913 |
| jk.mega.DrussGT 3.1.16 | 26910 | 3290 (12.2%) | 26861 |
| oog.mega.saguaro.Saguaro 1.0 | 4054 | 313 (7.7%) | 4033 |
| aaa.r.ScalarR 0.005h.053-noshield | 21691 | 2306 (10.6%) | 21236 |
| voidious.Diamond 1.8.22 | 22312 | 2415 (10.8%) | 22173 |
| cb.fire.Firestarter 2.0f | 30706 | 2807 (9.1%) | 29892 |
| dsekercioglu.mega.Raven 3.56j8 | 9924 | 993 (10.0%) | 9093 |
| xander.cat.XanderCat 12.9 | 11579 | 907 (7.8%) | 11044 |
| lxx.Tomcat 3.68 | 16544 | 1882 (11.4%) | 15643 |
| rsalesc.mega.Knight 0.6.28 | 29731 | 3540 (11.9%) | 29559 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 537 | 650 | 1778 | 20.5 / 26.2 | 0 | 278 | 2 |
| jk.mega.DrussGT 3.1.16 | 650 | 517 | 650 | 2960 | 26.1 / 31.2 | 19 | 3008 | 283 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 456 | 508 | 541 | 41.9 / 26.3 | 415 | 1445 | 353 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 485 | 650 | 2428 | 22.4 / 31.8 | 2 | 1190 | 1 |
| voidious.Diamond 1.8.22 | 650 | 540 | 650 | 2462 | 19.6 / 31.7 | 0 | 5127 | 115 |
| cb.fire.Firestarter 2.0f | 650 | 551 | 650 | 3357 | 31.7 / 26.1 | 9 | 3143 | 165 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 450 | 650 | 1150 | 24.2 / 34.6 | 72 | 9549 | 1129 |
| xander.cat.XanderCat 12.9 | 650 | 454 | 650 | 1357 | 30.1 / 35.0 | 177 | 954 | 86 |
| lxx.Tomcat 3.68 | 650 | 511 | 650 | 1861 | 23.0 / 37.1 | 9 | 10561 | 42 |
| rsalesc.mega.Knight 0.6.28 | 650 | 511 | 650 | 3248 | 30.6 / 30.4 | 13 | 9217 | 32 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 8.2% | 31 | 116 | 3 | 154.3 | 1620 / 1622 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 9.4% | 55 | 388 | 3 | 253.9 | 3289 / 3290 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.6% | 8 | 45 | 3 | 34.1 | 313 / 313 (100%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.0% | 29 | 129 | 3 | 210.0 | 2300 / 2306 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 8.2% | 20 | 370 | 3 | 215.7 | 2413 / 2415 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 8.5% | 51 | 242 | 3 | 293.4 | 2788 / 2807 (99%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 9.2% | 12 | 222 | 3 | 86.9 | 988 / 993 (99%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 8.4% | 24 | 194 | 3 | 88.0 | 907 / 907 (100%) | 0 | 0 |
| lxx.Tomcat 3.68 | 10.6% | 66 | 294 | 3 | 153.0 | 1872 / 1882 (99%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 9.6% | 43 | 494 | 3 | 278.3 | 3540 / 3540 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| voidious.Diamond 1.8.22 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| cb.fire.Firestarter 2.0f | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| xander.cat.XanderCat 12.9 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| lxx.Tomcat 3.68 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.8 vs hadur2.Hadur 3.7

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 24.7% ± 13.4 | 16.4% ± 12.1 | +8.3 ± 22.5 |
| jk.mega.DrussGT 3.1.16 | 47.7% ± 7.9 | 33.5% ± 8.3 | +14.2 ± 14.7 |
| oog.mega.saguaro.Saguaro 1.0 | 73.0% ± 3.0 | 70.8% ± 12.8 | +2.2 ± 14.3 |
| aaa.r.ScalarR 0.005h.053-noshield | 35.7% ± 19.1 | 27.4% ± 18.0 | +8.3 ± 29.7 |
| voidious.Diamond 1.8.22 | 44.6% ± 10.7 | 30.5% ± 12.0 | +14.1 ± 1.3 |
| cb.fire.Firestarter 2.0f | 54.0% ± 6.0 | 32.8% ± 10.6 | +21.3 ± 10.7 |
| dsekercioglu.mega.Raven 3.56j8 | 58.1% ± 13.6 | 63.1% ± 11.0 | -5.1 ± 24.5 |
| xander.cat.XanderCat 12.9 | 53.3% ± 11.7 | 50.5% ± 3.8 | +2.8 ± 15.1 |
| lxx.Tomcat 3.68 | 46.4% ± 7.9 | 57.6% ± 19.2 | -11.2 ± 25.1 |
| rsalesc.mega.Knight 0.6.28 | 57.3% ± 5.5 | 45.7% ± 10.2 | +11.6 ± 4.8 |

# Bench: hadur2.Hadur 3.8 baseline (hadur2.Hadur 3.7) (cold)

35 rounds x 3 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=3642914.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 16.4% ± 12.1 | 2.9% ± 12.3 | 35.5% ± 11.4 | 3 / 105 | 5.5% ± 0.7 | 9.6% ± 0.9 | 29 | 0 | 3.05 / 119.4 |
| jk.mega.DrussGT 3.1.16 | rumble-2 | 33.5% ± 8.3 | 21.6% ± 11.2 | 47.0% ± 5.7 | 25 / 105 | 7.4% ± 1.4 | 9.9% ± 0.8 | 41 | 0 | 2.47 / 64.1 |
| oog.mega.saguaro.Saguaro 1.0 | rumble-3 | 70.8% ± 12.8 | 81.9% ± 14.8 | 59.8% ± 11.2 | 86 / 105 | 19.4% ± 2.7 | 6.6% ± 1.0 | 3 | 0 | 2.94 / 33.9 |
| aaa.r.ScalarR 0.005h.053-noshield | rumble-4 | 27.4% ± 18.0 | 13.3% ± 21.7 | 43.1% ± 12.7 | 14 / 105 | 7.4% ± 1.0 | 10.2% ± 1.3 | 36 | 0 | 2.76 / 55.4 |
| voidious.Diamond 1.8.22 | rumble-5 | 30.5% ± 12.0 | 18.5% ± 22.1 | 43.7% ± 3.4 | 22 / 105 | 6.8% ± 0.3 | 8.5% ± 0.8 | 35 | 0 | 2.65 / 128.4 |
| cb.fire.Firestarter 2.0f | rumble-6 | 32.8% ± 10.6 | 14.6% ± 14.9 | 52.0% ± 6.0 | 17 / 105 | 8.9% ± 0.9 | 8.4% ± 2.1 | 55 | 0 | 2.45 / 79.5 |
| dsekercioglu.mega.Raven 3.56j8 | rumble-7 | 63.1% ± 11.0 | 80.0% ± 14.2 | 46.1% ± 6.2 | 84 / 105 | 9.2% ± 1.4 | 8.8% ± 1.4 | 18 | 0 | 1.77 / 31.9 |
| xander.cat.XanderCat 12.9 | rumble-8 | 50.5% ± 3.8 | 55.2% ± 10.8 | 46.6% ± 5.1 | 58 / 105 | 11.1% ± 0.9 | 8.6% ± 0.7 | 15 | 0 | 1.82 / 33.5 |
| lxx.Tomcat 3.68 | rumble-9 | 57.6% ± 19.2 | 67.2% ± 23.0 | 48.5% ± 14.3 | 71 / 105 | 9.0% ± 0.6 | 9.2% ± 1.4 | 30 | 0 | 2.62 / 105.2 |
| rsalesc.mega.Knight 0.6.28 | rumble-10 | 45.7% ± 10.2 | 38.1% ± 14.8 | 53.0% ± 6.1 | 40 / 105 | 9.8% ± 0.5 | 9.4% ± 0.9 | 47 | 0 | 2.96 / 72.4 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 22171 | 187 | 22231 | 22171 (100.0%) | 0 (0.0%) | 60 (0.3%) | 986 | 147 | 31 |
| jk.mega.DrussGT 3.1.16 | 25236 | 7 | 25159 | 25157 (99.7%) | 79 (0.3%) | 2 (0.0%) | 1473 | 142 | 37 |
| oog.mega.saguaro.Saguaro 1.0 | 3575 | 9 | 3577 | 3573 (99.9%) | 2 (0.1%) | 4 (0.1%) | 276 | 46 | 4 |
| aaa.r.ScalarR 0.005h.053-noshield | 21437 | 9 | 21950 | 21411 (99.9%) | 26 (0.1%) | 539 (2.5%) | 1234 | 245 | 52 |
| voidious.Diamond 1.8.22 | 22381 | 851 | 23275 | 22346 (99.8%) | 35 (0.2%) | 929 (4.0%) | 1191 | 134 | 41 |
| cb.fire.Firestarter 2.0f | 23169 | 976 | 25504 | 23161 (100.0%) | 8 (0.0%) | 2343 (9.2%) | 1933 | 154 | 53 |
| dsekercioglu.mega.Raven 3.56j8 | 8504 | 49 | 8504 | 8503 (100.0%) | 1 (0.0%) | 1 (0.0%) | 437 | 110 | 21 |
| xander.cat.XanderCat 12.9 | 10780 | 4 | 10971 | 10779 (100.0%) | 1 (0.0%) | 192 (1.8%) | 1018 | 176 | 19 |
| lxx.Tomcat 3.68 | 13788 | 321 | 13856 | 13780 (99.9%) | 8 (0.1%) | 76 (0.5%) | 846 | 117 | 32 |
| rsalesc.mega.Knight 0.6.28 | 23583 | 337 | 23529 | 23524 (99.7%) | 59 (0.3%) | 5 (0.0%) | 1773 | 190 | 45 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 21867 | 2505 (11.5%) | 21518 |
| jk.mega.DrussGT 3.1.16 | 25004 | 3114 (12.5%) | 24769 |
| oog.mega.saguaro.Saguaro 1.0 | 4231 | 286 (6.8%) | 4210 |
| aaa.r.ScalarR 0.005h.053-noshield | 21635 | 2479 (11.5%) | 20922 |
| voidious.Diamond 1.8.22 | 22352 | 2465 (11.0%) | 21678 |
| cb.fire.Firestarter 2.0f | 26166 | 2370 (9.1%) | 25831 |
| dsekercioglu.mega.Raven 3.56j8 | 8963 | 862 (9.6%) | 8289 |
| xander.cat.XanderCat 12.9 | 12258 | 1146 (9.3%) | 10844 |
| lxx.Tomcat 3.68 | 14096 | 1598 (11.3%) | 13564 |
| rsalesc.mega.Knight 0.6.28 | 23444 | 2739 (11.7%) | 23222 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 540 | 650 | 2439 | 16.7 / 30.4 | 0 | 0 | 1 |
| jk.mega.DrussGT 3.1.16 | 650 | 521 | 650 | 2782 | 26.3 / 29.6 | 0 | 90 | 44 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 430 | 400 | 555 | 40.3 / 27.1 | 451 | 1410 | 188 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 485 | 650 | 2433 | 25.7 / 33.7 | 0 | 544 | 0 |
| voidious.Diamond 1.8.22 | 650 | 537 | 650 | 2503 | 24.8 / 32.0 | 0 | 123 | 169 |
| cb.fire.Firestarter 2.0f | 650 | 552 | 650 | 2910 | 30.1 / 27.8 | 15 | 170 | 36 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 454 | 650 | 1076 | 28.6 / 33.6 | 34 | 550 | 1060 |
| xander.cat.XanderCat 12.9 | 650 | 451 | 650 | 1427 | 30.0 / 34.5 | 215 | 508 | 47 |
| lxx.Tomcat 3.68 | 650 | 518 | 650 | 1628 | 30.6 / 32.8 | 8 | 592 | 9 |
| rsalesc.mega.Knight 0.6.28 | 650 | 510 | 650 | 2625 | 33.1 / 29.3 | 57 | 287 | 22 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 9.6% | 29 | 307 | 3 | 210.4 | 2504 / 2505 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 9.9% | 41 | 44735 | 3 | 238.1 | 3109 / 3114 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.6% | 3 | 101 | 2 | 34.0 | 285 / 286 (100%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.2% | 36 | 128 | 3 | 208.5 | 2478 / 2479 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 8.5% | 35 | 36023 | 3 | 219.9 | 2462 / 2465 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 8.4% | 55 | 507 | 3 | 240.7 | 2363 / 2370 (100%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 8.8% | 18 | 130 | 2 | 80.8 | 858 / 862 (100%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 8.6% | 15 | 144 | 2 | 103.9 | 1146 / 1146 (100%) | 0 | 0 |
| lxx.Tomcat 3.68 | 9.2% | 30 | 290 | 3 | 131.6 | 1598 / 1598 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 9.4% | 47 | 278 | 3 | 222.6 | 2730 / 2739 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| voidious.Diamond 1.8.22 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| cb.fire.Firestarter 2.0f | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| xander.cat.XanderCat 12.9 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| lxx.Tomcat 3.68 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 0 / 3 | 0 | 0 | T?/M?, T?/M?, T?/M? | live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Bench: hadur2.Hadur 3.8 (cold)

35 rounds x 2 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=3648996.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | rammer | 96.3% ± 1.9 | 100.0% ± 0.0 | 93.4% ± 3.3 | 70 / 70 | 77.3% ± 0.6 | 11.5% ± 15.9 | 4 | 0 | 0.82 / 10.9 |
| bbo.RamboT 0.3 | rammer | 97.9% ± 5.0 | 100.0% ± 0.0 | 96.4% ± 6.4 | 70 / 70 | 77.2% ± 2.5 | 9.0% ± 29.9 | 2 | 0 | 0.79 / 8.9 |
| PSW.Relentless 0.1 | rammer | 98.2% ± 7.8 | 100.0% ± 0.0 | 97.1% ± 12.6 | 70 / 70 | 72.7% ± 31.8 | 7.6% ± 1.9 | 1 | 0 | 0.74 / 6.7 |
| mahrgell.mahrram 1.3 | rammer | 78.9% ± 11.3 | 100.0% ± 0.0 | 69.3% ± 14.7 | 70 / 70 | 69.3% ± 21.6 | 38.3% ± 15.2 | 2 | 0 | 0.77 / 10.9 |
| sample.RamFire | rammer | 99.8% ± 2.1 | 100.0% ± 0.0 | 99.8% ± 2.9 | 70 / 70 | 67.5% ± 14.6 | 1.5% ± 18.4 | 0 | 0 | 0.70 / 9.7 |
| stelo.MirrorNano 1.4 | mirror | 83.7% ± 115.0 | 94.3% ± 72.6 | 73.8% ± 157.9 | 66 / 70 | 30.9% ± 75.0 | 5.6% ± 4.4 | 2 | 0 | 0.81 / 14.0 |
| stelo.MirrorMicro 1.1 | mirror | 91.9% ± 33.0 | 100.0% ± 0.0 | 85.0% ± 54.9 | 70 / 70 | 35.9% ± 13.3 | 6.4% ± 30.5 | 3 | 0 | 0.87 / 11.5 |
| zyx.nano.RedBull 1.0 | nano | 94.2% ± 1.5 | 100.0% ± 0.0 | 91.0% ± 1.5 | 70 / 70 | 81.7% ± 1.9 | 9.1% ± 1.3 | 1 | 0 | 0.68 / 9.2 |
| bwbaugh.nano.Tirunculus 0.0.0a | nano | 85.5% ± 8.5 | 100.0% ± 0.0 | 77.8% ± 14.6 | 70 / 70 | 83.7% ± 5.7 | 76.5% ± 29.2 | 0 | 0 | 0.76 / 7.4 |
| demetrix.nano.SledgeHammer 0.22 | nano | 69.1% ± 25.3 | 97.1% ± 36.3 | 58.5% ± 15.8 | 68 / 70 | 73.6% ± 7.0 | 54.7% ± 41.9 | 3 | 0 | 0.82 / 54.1 |
| mz.NanoDeath 2.56 | nano | 68.5% ± 18.8 | 92.9% ± 18.2 | 59.2% ± 12.6 | 65 / 70 | 70.0% ± 26.7 | 50.5% ± 54.6 | 1 | 0 | 0.81 / 12.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 178 | 4 | 178 | 178 (100.0%) | 0 (0.0%) | 0 (0.0%) | 7 | 9 | 5 |
| bbo.RamboT 0.3 | 540 | 1 | 540 | 540 (100.0%) | 0 (0.0%) | 0 (0.0%) | 49 | 36 | 5 |
| PSW.Relentless 0.1 | 120 | 2 | 120 | 120 (100.0%) | 0 (0.0%) | 0 (0.0%) | 36 | 9 | 2 |
| mahrgell.mahrram 1.3 | 685 | 3 | 685 | 685 (100.0%) | 0 (0.0%) | 0 (0.0%) | 163 | 36 | 3 |
| sample.RamFire | 1 | 0 | 1 | 1 (100.0%) | 0 (0.0%) | 0 (0.0%) | 22 | 1 | 2 |
| stelo.MirrorNano 1.4 | 1263 | 4 | 1263 | 1263 (100.0%) | 0 (0.0%) | 0 (0.0%) | 4 | 20 | 2 |
| stelo.MirrorMicro 1.1 | 871 | 3 | 872 | 871 (100.0%) | 0 (0.0%) | 1 (0.1%) | 6 | 24 | 5 |
| zyx.nano.RedBull 1.0 | 456 | 3 | 456 | 456 (100.0%) | 0 (0.0%) | 0 (0.0%) | 79 | 23 | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 353 | 4 | 354 | 353 (100.0%) | 0 (0.0%) | 1 (0.3%) | 65 | 24 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 684 | 1 | 684 | 684 (100.0%) | 0 (0.0%) | 0 (0.0%) | 135 | 41 | 1 |
| mz.NanoDeath 2.56 | 656 | 3 | 657 | 656 (100.0%) | 0 (0.0%) | 1 (0.2%) | 172 | 40 | 5 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| vort.Chaser 0.0.3 | 520 | 1 (0.2%) | 0 |
| bbo.RamboT 0.3 | 479 | 8 (1.7%) | 0 |
| PSW.Relentless 0.1 | 572 | 0 (0.0%) | 0 |
| mahrgell.mahrram 1.3 | 632 | 42 (6.6%) | 0 |
| sample.RamFire | 696 | 0 (0.0%) | 0 |
| stelo.MirrorNano 1.4 | 761 | 55 (7.2%) | 109 |
| stelo.MirrorMicro 1.1 | 872 | 50 (5.7%) | 0 |
| zyx.nano.RedBull 1.0 | 446 | 10 (2.2%) | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 565 | 6 (1.1%) | 0 |
| demetrix.nano.SledgeHammer 0.22 | 688 | 31 (4.5%) | 145 |
| mz.NanoDeath 2.56 | 662 | 23 (3.5%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 650 | 207 | 400 | 136 | 95.9 / 6.8 | 435 | 438 | 44 |
| bbo.RamboT 0.3 | 650 | 237 | 400 | 131 | 92.3 / 3.5 | 431 | 557 | 33 |
| PSW.Relentless 0.1 | 650 | 259 | 400 | 149 | 95.6 / 2.9 | 466 | 257 | 74 |
| mahrgell.mahrram 1.3 | 650 | 192 | 650 | 162 | 104.7 / 46.4 | 567 | 592 | 3 |
| sample.RamFire | 650 | 378 | 650 | 176 | 99.8 / 0.2 | 470 | 14 | 0 |
| stelo.MirrorNano 1.4 | 650 | 496 | 400 | 315 | 56.3 / 18.7 | 536 | 1586 | 607 |
| stelo.MirrorMicro 1.1 | 650 | 499 | 400 | 217 | 73.0 / 13.2 | 683 | 610 | 0 |
| zyx.nano.RedBull 1.0 | 650 | 183 | 400 | 120 | 88.3 / 8.8 | 383 | 641 | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 650 | 187 | 650 | 145 | 110.5 / 31.7 | 471 | 528 | 59 |
| demetrix.nano.SledgeHammer 0.22 | 650 | 146 | 650 | 174 | 118.1 / 84.0 | 607 | 603 | 18 |
| mz.NanoDeath 2.56 | 650 | 159 | 650 | 169 | 112.8 / 78.0 | 607 | 677 | 11 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 11.5% | 4 | 7 | 2 | 2.4 | 1 / 1 (100%) | 0 | 0 |
| bbo.RamboT 0.3 | 9.0% | 2 | 9 | 2 | 7.6 | 8 / 8 (100%) | 0 | 0 |
| PSW.Relentless 0.1 | 7.6% | 1 | 6 | 1 | 1.6 | - | 0 | 0 |
| mahrgell.mahrram 1.3 | 38.3% | 2 | 11 | 1 | 9.6 | 42 / 42 (100%) | 0 | 0 |
| sample.RamFire | 1.5% | 0 | 6 | 1 | 0.0 | - | 0 | 0 |
| stelo.MirrorNano 1.4 | 5.6% | 2 | 9 | 2 | 11.1 | 55 / 55 (100%) | 0 | 0 |
| stelo.MirrorMicro 1.1 | 6.4% | 3 | 14 | 2 | 12.5 | 50 / 50 (100%) | 0 | 0 |
| zyx.nano.RedBull 1.0 | 9.1% | 1 | 9 | 2 | 6.5 | 10 / 10 (100%) | 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 76.5% | 0 | 9 | 1 | 4.8 | 5 / 6 (83%) | 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 54.7% | 3 | 12 | 1 | 9.7 | 31 / 31 (100%) | 0 | 0 |
| mz.NanoDeath 2.56 | 50.5% | 1 | 12 | 2 | 9.3 | 23 / 23 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| bbo.RamboT 0.3 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| PSW.Relentless 0.1 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| mahrgell.mahrram 1.3 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| sample.RamFire | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| stelo.MirrorNano 1.4 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| stelo.MirrorMicro 1.1 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| zyx.nano.RedBull 1.0 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| mz.NanoDeath 2.56 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.8 vs hadur2.Hadur 3.7

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| vort.Chaser 0.0.3 | 96.3% ± 1.9 | 94.3% ± 11.7 | +2.0 ± 13.6 |
| bbo.RamboT 0.3 | 97.9% ± 5.0 | 97.8% ± 4.7 | +0.0 ± 0.2 |
| PSW.Relentless 0.1 | 98.2% ± 7.8 | 98.2% ± 7.8 | +0.0 ± 0.0 |
| mahrgell.mahrram 1.3 | 78.9% ± 11.3 | 79.4% ± 5.5 | -0.5 ± 5.7 |
| sample.RamFire | 99.8% ± 2.1 | 99.8% ± 2.1 | +0.0 ± 0.0 |
| stelo.MirrorNano 1.4 | 83.7% ± 115.0 | 94.5% ± 5.3 | -10.8 ± 109.7 |
| stelo.MirrorMicro 1.1 | 91.9% ± 33.0 | 91.9% ± 27.2 | +0.0 ± 60.3 |
| zyx.nano.RedBull 1.0 | 94.2% ± 1.5 | 93.1% ± 0.2 | +1.1 ± 1.3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 85.5% ± 8.5 | 85.1% ± 4.1 | +0.3 ± 4.4 |
| demetrix.nano.SledgeHammer 0.22 | 69.1% ± 25.3 | 68.4% ± 9.2 | +0.7 ± 34.5 |
| mz.NanoDeath 2.56 | 68.5% ± 18.8 | 67.4% ± 8.4 | +1.1 ± 10.4 |

# Bench: hadur2.Hadur 3.8 baseline (hadur2.Hadur 3.7) (cold)

35 rounds x 2 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.11, 4 cores. robocode.cpu.constant=3648996.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | rammer | 94.3% ± 11.7 | 100.0% ± 0.0 | 90.0% ± 19.0 | 70 / 70 | 79.2% ± 14.0 | 15.0% ± 14.6 | 0 | 0 | 0.79 / 14.4 |
| bbo.RamboT 0.3 | rammer | 97.8% ± 4.7 | 100.0% ± 0.0 | 96.5% ± 7.7 | 70 / 70 | 75.3% ± 22.2 | 9.5% ± 24.8 | 2 | 0 | 0.73 / 11.6 |
| PSW.Relentless 0.1 | rammer | 98.2% ± 7.8 | 100.0% ± 0.0 | 97.1% ± 12.6 | 70 / 70 | 72.7% ± 31.8 | 7.6% ± 1.9 | 0 | 0 | 0.73 / 12.3 |
| mahrgell.mahrram 1.3 | rammer | 79.4% ± 5.5 | 100.0% ± 0.0 | 69.8% ± 8.1 | 70 / 70 | 69.3% ± 21.0 | 37.4% ± 3.2 | 0 | 0 | 0.78 / 14.1 |
| sample.RamFire | rammer | 99.8% ± 2.1 | 100.0% ± 0.0 | 99.8% ± 2.9 | 70 / 70 | 67.9% ± 20.3 | 1.5% ± 18.4 | 3 | 0 | 0.71 / 23.5 |
| stelo.MirrorNano 1.4 | mirror | 94.5% ± 5.3 | 100.0% ± 0.0 | 89.3% ± 9.6 | 70 / 70 | 36.6% ± 7.0 | 4.4% ± 5.7 | 1 | 0 | 0.88 / 12.4 |
| stelo.MirrorMicro 1.1 | mirror | 91.9% ± 27.2 | 100.0% ± 0.0 | 84.9% ± 46.1 | 70 / 70 | 35.4% ± 9.5 | 6.8% ± 19.7 | 2 | 0 | 0.87 / 14.3 |
| zyx.nano.RedBull 1.0 | nano | 93.1% ± 0.2 | 100.0% ± 0.0 | 90.0% ± 10.3 | 70 / 70 | 82.6% ± 15.2 | 10.4% ± 0.0 | 0 | 0 | 0.72 / 16.5 |
| bwbaugh.nano.Tirunculus 0.0.0a | nano | 85.1% ± 4.1 | 100.0% ± 0.0 | 77.3% ± 9.1 | 70 / 70 | 82.8% ± 5.1 | 76.1% ± 34.9 | 4 | 0 | 0.78 / 10.1 |
| demetrix.nano.SledgeHammer 0.22 | nano | 68.4% ± 9.2 | 95.7% ± 18.2 | 58.2% ± 5.4 | 67 / 70 | 73.3% ± 6.4 | 56.2% ± 0.0 | 3 | 0 | 0.78 / 9.8 |
| mz.NanoDeath 2.56 | nano | 67.4% ± 8.4 | 92.9% ± 18.2 | 58.0% ± 5.2 | 65 / 70 | 73.7% ± 25.4 | 54.9% ± 5.1 | 1 | 0 | 0.82 / 12.9 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 196 | 6 | 196 | 196 (100.0%) | 0 (0.0%) | 0 (0.0%) | 10 | 15 | 1 |
| bbo.RamboT 0.3 | 555 | 2 | 555 | 555 (100.0%) | 0 (0.0%) | 0 (0.0%) | 63 | 46 | 2 |
| PSW.Relentless 0.1 | 120 | 2 | 120 | 120 (100.0%) | 0 (0.0%) | 0 (0.0%) | 36 | 9 | 2 |
| mahrgell.mahrram 1.3 | 678 | 3 | 678 | 678 (100.0%) | 0 (0.0%) | 0 (0.0%) | 160 | 36 | 2 |
| sample.RamFire | 1 | 0 | 1 | 1 (100.0%) | 0 (0.0%) | 0 (0.0%) | 22 | 1 | 2 |
| stelo.MirrorNano 1.4 | 798 | 6 | 798 | 798 (100.0%) | 0 (0.0%) | 0 (0.0%) | 6 | 15 | 2 |
| stelo.MirrorMicro 1.1 | 892 | 5 | 892 | 892 (100.0%) | 0 (0.0%) | 0 (0.0%) | 7 | 17 | 2 |
| zyx.nano.RedBull 1.0 | 440 | 2 | 440 | 440 (100.0%) | 0 (0.0%) | 0 (0.0%) | 116 | 30 | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 353 | 4 | 353 | 353 (100.0%) | 0 (0.0%) | 0 (0.0%) | 72 | 19 | 2 |
| demetrix.nano.SledgeHammer 0.22 | 671 | 3 | 671 | 671 (100.0%) | 0 (0.0%) | 0 (0.0%) | 183 | 34 | 2 |
| mz.NanoDeath 2.56 | 641 | 2 | 641 | 641 (100.0%) | 0 (0.0%) | 0 (0.0%) | 201 | 45 | 1 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| vort.Chaser 0.0.3 | 519 | 1 (0.2%) | 0 |
| bbo.RamboT 0.3 | 491 | 15 (3.1%) | 0 |
| PSW.Relentless 0.1 | 572 | 0 (0.0%) | 0 |
| mahrgell.mahrram 1.3 | 627 | 43 (6.9%) | 0 |
| sample.RamFire | 694 | 0 (0.0%) | 0 |
| stelo.MirrorNano 1.4 | 847 | 48 (5.7%) | 0 |
| stelo.MirrorMicro 1.1 | 898 | 57 (6.3%) | 0 |
| zyx.nano.RedBull 1.0 | 442 | 8 (1.8%) | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 581 | 12 (2.1%) | 0 |
| demetrix.nano.SledgeHammer 0.22 | 670 | 20 (3.0%) | 0 |
| mz.NanoDeath 2.56 | 645 | 15 (2.3%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 650 | 187 | 400 | 135 | 97.3 / 10.8 | 432 | 445 | 43 |
| bbo.RamboT 0.3 | 650 | 240 | 400 | 134 | 92.0 / 3.4 | 456 | 488 | 9 |
| PSW.Relentless 0.1 | 650 | 259 | 400 | 149 | 95.6 / 2.9 | 466 | 257 | 74 |
| mahrgell.mahrram 1.3 | 650 | 189 | 650 | 161 | 104.1 / 45.0 | 562 | 633 | 3 |
| sample.RamFire | 650 | 378 | 650 | 175 | 99.8 / 0.2 | 468 | 14 | 0 |
| stelo.MirrorNano 1.4 | 650 | 486 | 400 | 210 | 70.2 / 8.5 | 635 | 843 | 388 |
| stelo.MirrorMicro 1.1 | 650 | 500 | 400 | 223 | 72.4 / 13.1 | 690 | 634 | 0 |
| zyx.nano.RedBull 1.0 | 650 | 166 | 400 | 119 | 87.7 / 9.8 | 370 | 587 | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 650 | 198 | 650 | 149 | 110.8 / 32.5 | 474 | 556 | 80 |
| demetrix.nano.SledgeHammer 0.22 | 650 | 148 | 650 | 171 | 117.4 / 84.2 | 610 | 495 | 40 |
| mz.NanoDeath 2.56 | 650 | 163 | 650 | 166 | 114.3 / 82.6 | 581 | 623 | 45 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 15.0% | 0 | 13 | 1 | 2.7 | 1 / 1 (100%) | 0 | 0 |
| bbo.RamboT 0.3 | 9.5% | 2 | 9 | 1 | 7.9 | 15 / 15 (100%) | 0 | 0 |
| PSW.Relentless 0.1 | 7.6% | 0 | 13 | 1 | 1.6 | - | 0 | 0 |
| mahrgell.mahrram 1.3 | 37.4% | 0 | 15 | 1 | 9.5 | 43 / 43 (100%) | 0 | 0 |
| sample.RamFire | 1.5% | 3 | 7 | 2 | 0.0 | - | 0 | 0 |
| stelo.MirrorNano 1.4 | 4.4% | 1 | 12 | 2 | 11.4 | 48 / 48 (100%) | 0 | 0 |
| stelo.MirrorMicro 1.1 | 6.8% | 2 | 15 | 2 | 12.7 | 57 / 57 (100%) | 0 | 0 |
| zyx.nano.RedBull 1.0 | 10.4% | 0 | 4 | 1 | 6.3 | 8 / 8 (100%) | 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 76.1% | 4 | 13 | 2 | 4.7 | 12 / 12 (100%) | 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 56.2% | 3 | 6 | 2 | 9.4 | 20 / 20 (100%) | 0 | 0 |
| mz.NanoDeath 2.56 | 54.9% | 1 | 13 | 2 | 9.0 | 15 / 15 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| bbo.RamboT 0.3 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| PSW.Relentless 0.1 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| mahrgell.mahrram 1.3 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| sample.RamFire | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| stelo.MirrorNano 1.4 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| stelo.MirrorMicro 1.1 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| zyx.nano.RedBull 1.0 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| demetrix.nano.SledgeHammer 0.22 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |
| mz.NanoDeath 2.56 | 0 / 2 | 0 | 0 | T?/M?, T?/M? | live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

