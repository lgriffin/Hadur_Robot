# pa3k.Viper 5.03 (lower) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.7% | 91.4% | 72.4% | 32 / 35 | 17.6% | 7.1% | 11 | 0 | 0.83 / 14.8 | 84.8% | -3.0 |
| 2 | 76.9% | 82.9% | 71.1% | 29 / 35 | 15.9% | 6.2% | 10 | 0 | 0.91 / 14.6 | 75.5% | +1.5 |
| 3 | 75.4% | 85.7% | 66.5% | 30 / 35 | 16.9% | 8.8% | 14 | 0 | 0.93 / 20.0 | 76.1% | -0.7 |
| 4 | 78.3% | 85.7% | 71.2% | 30 / 35 | 18.2% | 7.1% | 11 | 0 | 0.90 / 20.7 | 76.7% | +1.6 |
| 5 | 73.9% | 82.9% | 65.5% | 29 / 35 | 15.3% | 8.2% | 12 | 0 | 1.01 / 18.7 | 81.6% | -7.7 |
| 6 | 76.5% | 85.7% | 66.7% | 30 / 35 | 16.7% | 9.9% | 9 | 0 | 1.01 / 13.4 | 76.4% | +0.1 |
| 7 | 72.9% | 77.1% | 68.5% | 27 / 35 | 16.6% | 6.9% | 10 | 0 | 0.94 / 14.3 | 73.4% | -0.5 |
| 8 | 77.8% | 85.7% | 70.0% | 30 / 35 | 17.0% | 7.6% | 12 | 0 | 1.03 / 13.4 | 82.8% | -5.0 |
| 9 | 72.6% | 80.0% | 65.5% | 28 / 35 | 16.1% | 7.5% | 12 | 0 | 1.00 / 13.8 | 85.2% | -12.6 |
| 10 | 77.4% | 85.7% | 69.7% | 30 / 35 | 17.2% | 7.6% | 7 | 0 | 0.97 / 14.4 | 86.5% | -9.2 |
| 11 | 79.4% | 88.6% | 70.7% | 31 / 35 | 17.4% | 6.9% | 9 | 0 | 0.90 / 20.3 | 83.0% | -3.6 |
| 12 | 82.9% | 94.3% | 72.2% | 33 / 35 | 16.3% | 7.7% | 13 | 0 | 0.99 / 13.9 | 82.5% | +0.4 |
| 13 | 83.5% | 94.3% | 73.5% | 33 / 35 | 16.6% | 7.1% | 11 | 0 | 0.96 / 12.9 | 77.7% | +5.8 |
| 14 | 86.5% | 100.0% | 73.7% | 35 / 35 | 17.7% | 6.5% | 12 | 0 | 0.80 / 15.3 | 79.4% | +7.1 |
| 15 | 77.3% | 85.7% | 69.4% | 30 / 35 | 17.8% | 9.4% | 12 | 0 | 0.95 / 14.0 | 76.2% | +1.1 |
| 16 | 79.6% | 88.6% | 70.8% | 31 / 35 | 16.2% | 6.7% | 6 | 0 | 0.94 / 17.9 | 80.0% | -0.4 |

Mean score share 78.3% ± 2.1, baseline 79.9% ± 2.1, paired diff -1.6 ± 2.8.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 171 over 16 battles (10.7 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | lower | 78.3% ± 2.1 | 87.1% ± 3.0 | 69.8% ± 1.4 | 488 / 560 | 16.8% ± 0.4 | 7.6% ± 0.6 | 171 | 0 | 1.03 / 20.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 16 | 12 | 298 | 0 | 0.31 | 3 | 3 | 0 |

12 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 18336 | 43 | 18321 | 18318 (99.9%) | 18 (0.1%) | 3 (0.0%) | 1291 | 255 | 63 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| pa3k.Viper 5.03 | 22349 | 1416 (6.3%) | 7039 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 650 | 435 | 494 | 576 | 52.2 / 22.5 | 5837 | 8425 | 153 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 7.6% | 171 | 1039 | 3 | 32.5 | 1415 / 1416 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | pa3k.Viper | 1 | 35 | 274 | 7.6% | 6.6% ± 1.5 | 14.9% | 34.4% / 31.9% | 24.2% | 0 / 0 | T2/M0 | 79% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
