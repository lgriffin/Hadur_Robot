# maribo.IotaCT 1.0 (weak) vs hadur2.Hadur 3.7

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 83.4% | 91.4% | 77.0% | 32 / 35 | 29.8% | 9.5% | 4 | 0 | 0.61 / 10.4 | 88.1% | -4.7 |
| 2 | 84.0% | 94.3% | 76.3% | 33 / 35 | 32.7% | 10.9% | 12 | 0 | 0.75 / 9.6 | 86.1% | -2.0 |
| 3 | 95.1% | 100.0% | 90.8% | 35 / 35 | 39.8% | 6.1% | 9 | 0 | 0.51 / 7.6 | 88.6% | +6.5 |
| 4 | 83.6% | 94.3% | 75.2% | 33 / 35 | 29.7% | 10.8% | 9 | 0 | 0.71 / 12.6 | 84.9% | -1.3 |
| 5 | 90.9% | 100.0% | 82.8% | 35 / 35 | 30.7% | 18.7% | 14 | 0 | 0.71 / 10.3 | 84.3% | +6.5 |
| 6 | 85.5% | 94.3% | 78.3% | 33 / 35 | 32.6% | 9.1% | 6 | 0 | 0.70 / 10.1 | 87.4% | -1.8 |
| 7 | 87.3% | 97.1% | 79.6% | 34 / 35 | 33.1% | 8.7% | 12 | 0 | 0.72 / 10.3 | 83.6% | +3.8 |
| 8 | 85.2% | 97.1% | 76.1% | 34 / 35 | 33.5% | 11.8% | 9 | 0 | 0.71 / 9.6 | 86.5% | -1.4 |

Mean score share 86.9% ± 3.5, baseline 86.2% ± 1.5, paired diff +0.7 ± 3.6.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 75 over 8 battles (9.4 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| maribo.IotaCT 1.0 | weak | 86.9% ± 3.5 | 96.1% ± 2.5 | 79.5% ± 4.3 | 269 / 280 | 32.7% ± 2.7 | 10.7% ± 3.1 | 75 | 0 | 0.75 / 12.6 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| maribo.IotaCT 1.0 | 8 | 5 | 698 | 0 | 0.27 | 2 | 2 | 0 |

5 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| maribo.IotaCT 1.0 | 4503 | 36 | 4455 | 4452 (98.9%) | 51 (1.1%) | 3 (0.1%) | 112 | 127 | 24 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| maribo.IotaCT 1.0 | 4350 | 316 (7.3%) | 865 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| maribo.IotaCT 1.0 | 650 | 382 | 400 | 263 | 73.0 / 19.1 | 3147 | 2951 | 133 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| maribo.IotaCT 1.0 | 10.7% | 75 | 37 | 3 | 15.8 | 310 / 316 (98%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| maribo.IotaCT 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
