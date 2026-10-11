# ahr.ice.Ice 1.0 (weak) vs hadur2.Hadur 3.7

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 70.0% | 77.1% | 63.9% | 27 / 35 | 18.0% | 9.9% | 8 | 0 | 1.25 / 31.4 | 69.1% | +0.9 |
| 2 | 77.9% | 91.4% | 66.8% | 32 / 35 | 18.7% | 9.4% | 5 | 0 | 1.20 / 28.4 | 57.6% | +20.4 |
| 3 | 64.8% | 71.4% | 60.0% | 25 / 35 | 18.0% | 12.0% | 10 | 0 | 1.13 / 34.0 | 66.5% | -1.6 |
| 4 | 79.4% | 88.6% | 70.8% | 31 / 35 | 18.7% | 6.9% | 6 | 0 | 1.13 / 23.7 | 79.6% | -0.2 |
| 5 | 64.9% | 71.4% | 60.3% | 25 / 35 | 18.8% | 12.3% | 4 | 0 | 1.04 / 23.5 | 68.5% | -3.6 |
| 6 | 62.4% | 65.7% | 59.8% | 23 / 35 | 17.5% | 10.5% | 9 | 0 | 1.07 / 26.4 | 82.8% | -20.4 |
| 7 | 65.4% | 74.3% | 58.4% | 26 / 35 | 17.8% | 20.3% | 14 | 0 | 0.99 / 28.8 | 77.3% | -11.9 |
| 8 | 62.6% | 65.7% | 60.4% | 23 / 35 | 21.4% | 12.8% | 4 | 0 | 1.20 / 29.9 | 64.1% | -1.5 |

Mean score share 68.4% ± 5.6, baseline 70.7% ± 7.1, paired diff -2.2 ± 9.7.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 60 over 8 battles (7.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ahr.ice.Ice 1.0 | weak | 68.4% ± 5.6 | 75.7% ± 8.1 | 62.5% ± 3.6 | 212 / 280 | 18.6% ± 1.0 | 11.8% ± 3.3 | 60 | 0 | 1.25 / 34.0 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ahr.ice.Ice 1.0 | 8 | 3 | 563 | 0 | 0.21 | 4 | 4 | 0 |

3 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ahr.ice.Ice 1.0 | 6396 | 16 | 6362 | 6362 (99.5%) | 34 (0.5%) | 0 (0.0%) | 101 | 111 | 21 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ahr.ice.Ice 1.0 | 6468 | 442 (6.8%) | 1757 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ahr.ice.Ice 1.0 | 650 | 378 | 581 | 376 | 55.1 / 33.3 | 4079 | 3221 | 564 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ahr.ice.Ice 1.0 | 11.8% | 60 | 40 | 3 | 22.4 | 439 / 442 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ahr.ice.Ice 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
