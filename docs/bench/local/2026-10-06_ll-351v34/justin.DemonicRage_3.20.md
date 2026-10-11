# justin.DemonicRage 3.20 (mid) vs hadur2.Hadur 3.5.1

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 70.4% | 82.9% | 58.1% | 29 / 35 | 12.1% | 7.1% | 9 | 0 | 1.05 / 18.3 | 69.5% | +0.9 |
| 2 | 74.9% | 91.4% | 58.3% | 32 / 35 | 11.2% | 6.9% | 16 | 0 | 1.10 / 19.3 | 70.4% | +4.6 |
| 3 | 72.1% | 88.6% | 55.9% | 31 / 35 | 11.9% | 7.2% | 10 | 0 | 1.07 / 19.0 | 76.0% | -3.9 |
| 4 | 64.4% | 80.0% | 49.4% | 28 / 35 | 10.7% | 7.7% | 14 | 0 | 1.10 / 18.7 | 76.8% | -12.3 |
| 5 | 70.1% | 85.7% | 54.8% | 30 / 35 | 11.0% | 7.6% | 15 | 0 | 1.09 / 19.3 | 73.8% | -3.7 |
| 6 | 63.2% | 74.3% | 53.0% | 26 / 35 | 12.4% | 7.2% | 18 | 0 | 1.10 / 20.9 | 67.7% | -4.5 |
| 7 | 68.5% | 80.0% | 57.1% | 28 / 35 | 11.4% | 23.9% | 14 | 0 | 1.08 / 18.4 | 74.3% | -5.7 |
| 8 | 72.9% | 88.6% | 57.5% | 31 / 35 | 12.3% | 7.5% | 10 | 0 | 1.08 / 18.8 | 70.7% | +2.3 |

Mean score share 69.6% ± 3.4, baseline 72.4% ± 2.7, paired diff -2.8 ± 4.4.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 106 over 8 battles (13.3 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| justin.DemonicRage 3.20 | mid | 69.6% ± 3.4 | 83.9% ± 4.8 | 55.5% ± 2.6 | 235 / 280 | 11.6% ± 0.5 | 9.4% ± 4.9 | 106 | 0 | 1.10 / 20.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| justin.DemonicRage 3.20 | 8 | 7 | 478 | 0 | 0.38 | 0 | 0 | 0 |

7 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| justin.DemonicRage 3.20 | 13428 | 12 | 13395 | 13395 (99.8%) | 33 (0.2%) | 0 (0.0%) | 538 | 142 | 43 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| justin.DemonicRage 3.20 | 15004 | 1338 (8.9%) | 13187 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| justin.DemonicRage 3.20 | 650 | 526 | 619 | 712 | 36.8 / 29.5 | 229 | 4680 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| justin.DemonicRage 3.20 | 9.4% | 106 | 4710 | 3 | 47.8 | 1337 / 1338 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| justin.DemonicRage 3.20 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
