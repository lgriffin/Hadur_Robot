# sadoner.killer 0.2 (weak) vs hadur2.Hadur 3.8.1

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 86.8% | 94.3% | 79.0% | 33 / 35 | 20.0% | 6.3% | 14 | 0 | 0.75 / 11.8 | 84.3% | +2.5 |
| 2 | 78.4% | 91.4% | 68.1% | 32 / 35 | 21.2% | 11.1% | 14 | 0 | 0.90 / 15.6 | 85.7% | -7.3 |
| 3 | 84.8% | 94.3% | 75.7% | 33 / 35 | 20.1% | 7.2% | 11 | 0 | 0.81 / 14.0 | 90.4% | -5.6 |
| 4 | 82.0% | 91.4% | 73.7% | 32 / 35 | 19.7% | 9.4% | 16 | 0 | 0.78 / 14.2 | 88.7% | -6.6 |
| 5 | 82.3% | 94.3% | 72.2% | 33 / 35 | 22.4% | 10.3% | 12 | 0 | 0.93 / 14.5 | 81.8% | +0.4 |
| 6 | 83.4% | 94.3% | 73.9% | 33 / 35 | 22.0% | 23.6% | 14 | 0 | 0.77 / 72.2 | 85.9% | -2.5 |
| 7 | 70.6% | 77.1% | 65.4% | 27 / 35 | 21.7% | 13.7% | 13 | 0 | 0.90 / 14.9 | 82.9% | -12.3 |
| 8 | 85.5% | 94.3% | 77.1% | 33 / 35 | 21.6% | 8.2% | 15 | 0 | 0.85 / 21.0 | 82.4% | +3.1 |
| 9 | 84.2% | 94.3% | 75.3% | 33 / 35 | 20.0% | 8.2% | 13 | 0 | 0.91 / 14.3 | 86.9% | -2.6 |
| 10 | 87.3% | 97.1% | 77.6% | 34 / 35 | 20.8% | 6.5% | 13 | 0 | 0.70 / 15.5 | 91.1% | -3.8 |
| 11 | 90.0% | 100.0% | 80.8% | 35 / 35 | 23.2% | 8.0% | 12 | 0 | 0.72 / 78.6 | 92.5% | -2.5 |
| 12 | 84.3% | 94.3% | 75.5% | 33 / 35 | 22.0% | 10.6% | 15 | 0 | 0.79 / 99.6 | 81.7% | +2.6 |
| 13 | 89.0% | 100.0% | 78.9% | 35 / 35 | 21.6% | 7.5% | 12 | 0 | 0.77 / 15.6 | 84.9% | +4.1 |
| 14 | 78.8% | 88.6% | 70.3% | 31 / 35 | 20.6% | 9.8% | 13 | 0 | 0.85 / 140.6 | 87.0% | -8.3 |
| 15 | 85.5% | 94.3% | 76.6% | 33 / 35 | 20.4% | 7.2% | 11 | 0 | 0.73 / 68.2 | 80.3% | +5.1 |
| 16 | 78.3% | 88.6% | 69.9% | 31 / 35 | 20.3% | 11.8% | 11 | 0 | 0.83 / 435.2 | 80.2% | -2.0 |

Mean score share 83.2% ± 2.6, baseline 85.4% ± 2.0, paired diff -2.2 ± 2.6.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 209 over 16 battles (13.1 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | weak | 83.2% ± 2.6 | 93.0% ± 2.8 | 74.4% ± 2.3 | 521 / 560 | 21.1% ± 0.5 | 10.0% ± 2.2 | 209 | 0 | 0.93 / 435.2 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 11883 | 47 | 11777 | 11775 (99.1%) | 108 (0.9%) | 2 (0.0%) | 152 | 194 | 74 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sadoner.killer 0.2 | 11728 | 893 (7.6%) | 4243 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 650 | 295 | 478 | 343 | 60.2 / 21.1 | 6652 | 10006 | 18 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 10.0% | 209 | 1143 | 3 | 20.8 | 883 / 893 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | sadoner.killer | 1 | 35 | 288 | 14.5% | 10.1% ± 2.3 | 17.3% | 24.3% / 23.7% | 4.6% | 0 / 0 | T3/M? | 76% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
