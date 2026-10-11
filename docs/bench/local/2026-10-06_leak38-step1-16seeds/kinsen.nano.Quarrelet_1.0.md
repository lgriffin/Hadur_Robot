# kinsen.nano.Quarrelet 1.0 (lower) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 77.0% | 88.6% | 64.5% | 31 / 35 | 16.5% | 5.5% | 11 | 0 | 0.99 / 14.9 | 81.8% | -4.8 |
| 2 | 82.4% | 97.1% | 65.9% | 34 / 35 | 15.9% | 5.4% | 45 | 0 | 1.03 / 15.1 | 77.2% | +5.2 |
| 3 | 81.5% | 94.3% | 67.7% | 33 / 35 | 17.3% | 5.6% | 14 | 0 | 0.97 / 14.7 | 84.8% | -3.3 |
| 4 | 74.0% | 91.4% | 55.7% | 32 / 35 | 15.6% | 6.2% | 17 | 0 | 1.05 / 15.8 | 75.8% | -1.8 |
| 5 | 76.6% | 91.4% | 61.0% | 32 / 35 | 15.4% | 5.5% | 12 | 0 | 1.04 / 164.6 | 81.8% | -5.2 |
| 6 | 79.9% | 97.1% | 61.2% | 34 / 35 | 15.6% | 6.1% | 15 | 0 | 1.04 / 67.5 | 72.4% | +7.5 |
| 7 | 82.1% | 97.1% | 63.7% | 34 / 35 | 13.7% | 5.0% | 31 | 0 | 1.02 / 54.1 | 76.4% | +5.8 |
| 8 | 78.1% | 94.3% | 61.9% | 33 / 35 | 17.0% | 6.2% | 13 | 0 | 1.04 / 15.5 | 78.3% | -0.2 |
| 9 | 75.8% | 94.3% | 55.9% | 33 / 35 | 13.5% | 6.3% | 10 | 0 | 1.07 / 111.8 | 78.7% | -2.9 |
| 10 | 75.6% | 91.4% | 59.5% | 32 / 35 | 16.3% | 6.3% | 14 | 0 | 0.99 / 14.6 | 81.1% | -5.5 |
| 11 | 70.3% | 88.6% | 50.9% | 31 / 35 | 13.0% | 6.7% | 11 | 0 | 1.08 / 190.5 | 82.0% | -11.7 |
| 12 | 78.8% | 94.3% | 60.6% | 33 / 35 | 13.4% | 5.2% | 15 | 0 | 1.06 / 15.6 | 70.7% | +8.1 |
| 13 | 78.5% | 97.1% | 58.7% | 34 / 35 | 14.5% | 6.6% | 15 | 0 | 1.05 / 194.1 | 80.9% | -2.5 |
| 14 | 73.8% | 88.6% | 59.0% | 31 / 35 | 15.1% | 6.3% | 14 | 0 | 1.04 / 14.6 | 79.0% | -5.1 |
| 15 | 73.4% | 88.6% | 57.7% | 31 / 35 | 15.6% | 6.3% | 11 | 0 | 1.02 / 111.8 | 78.6% | -5.2 |
| 16 | 73.7% | 85.7% | 61.4% | 30 / 35 | 15.5% | 5.6% | 15 | 0 | 1.01 / 218.9 | 82.2% | -8.5 |

Mean score share 77.0% ± 1.9, baseline 78.9% ± 2.0, paired diff -1.9 ± 3.1.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 263 over 16 battles (16.4 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | lower | 77.0% ± 1.9 | 92.5% ± 2.0 | 60.3% ± 2.2 | 518 / 560 | 15.2% ± 0.7 | 5.9% ± 0.3 | 263 | 0 | 1.08 / 218.9 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 13086 | 44 | 13176 | 13032 (99.6%) | 54 (0.4%) | 144 (1.1%) | 1668 | 251 | 92 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 15579 | 930 (6.0%) | 4560 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 650 | 483 | 552 | 408 | 37.0 / 24.3 | 2386 | 10760 | 7539 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 5.9% | 263 | 258 | 3 | 23.5 | 923 / 930 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | kinsen.nano.Quarrelet | 1 | 35 | 316 | 7.6% | 8.8% ± 2.1 | 14.2% | 30.5% / 29.3% | 5.1% | 0 / 0 | T3/M? | 73% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
