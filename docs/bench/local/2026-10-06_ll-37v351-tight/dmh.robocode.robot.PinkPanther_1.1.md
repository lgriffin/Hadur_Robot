# dmh.robocode.robot.PinkPanther 1.1 (weak) vs hadur2.Hadur 3.7

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 36.9% | 48.6% | 29.1% | 17 / 35 | 11.3% | 149.9% | 127 | 0 | 0.37 / 9.4 | 34.7% | +2.2 |
| 2 | 38.4% | 51.4% | 29.2% | 18 / 35 | 10.5% | 116.6% | 118 | 0 | 0.39 / 13.9 | 45.2% | -6.8 |
| 3 | 33.5% | 45.7% | 25.4% | 16 / 35 | 10.0% | 126.8% | 118 | 0 | 0.40 / 9.9 | 36.8% | -3.3 |
| 4 | 41.6% | 54.3% | 32.4% | 19 / 35 | 11.2% | 101.5% | 123 | 0 | 0.39 / 12.0 | 34.5% | +7.1 |
| 5 | 28.1% | 37.1% | 22.8% | 13 / 35 | 8.9% | 120.2% | 129 | 0 | 0.41 / 12.2 | 34.9% | -6.9 |
| 6 | 36.9% | 48.6% | 29.4% | 17 / 35 | 11.1% | 109.3% | 114 | 0 | 0.37 / 8.0 | 33.5% | +3.4 |
| 7 | 38.7% | 51.4% | 29.1% | 18 / 35 | 9.9% | 111.5% | 117 | 0 | 0.37 / 14.0 | 29.5% | +9.1 |
| 8 | 44.9% | 65.7% | 27.5% | 23 / 35 | 8.7% | 109.8% | 118 | 0 | 0.37 / 8.7 | 38.8% | +6.1 |

Mean score share 37.4% ± 4.2, baseline 36.0% ± 3.8, paired diff +1.4 ± 5.3.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 964 over 8 battles (120.5 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | weak | 37.4% ± 4.2 | 50.4% ± 6.7 | 28.1% ± 2.4 | 141 / 280 | 10.2% ± 0.8 | 118.2% ± 12.5 | 964 | 0 | 0.41 / 14.0 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 8 | 0 | 134206 | 0 | 3.44 | 5 | 5 | 0 |

0 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 9821 | 1178 | 1202 | 1199 (12.2%) | 8622 (87.8%) | 3 (0.2%) | 18 | 5 | 989 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 11237 | 542 (4.8%) | 18 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 650 | 487 | 622 | 583 | 20.8 / 53.1 | 73 | 8 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 118.2% | 964 | 11 | 3 | 4.2 | 44 / 542 (8%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
