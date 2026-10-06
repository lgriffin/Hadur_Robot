# cw.megas.Silhouette 1.1 (mid) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 76.5% | 94.3% | 60.0% | 33 / 35 | 15.1% | 7.8% | 15 | 0 | 1.02 / 21.4 | 73.4% | +3.1 |
| 2 | 78.4% | 91.4% | 65.1% | 32 / 35 | 14.7% | 6.6% | 15 | 0 | 0.95 / 16.2 | 74.7% | +3.7 |
| 3 | 71.3% | 88.6% | 56.1% | 31 / 35 | 14.3% | 8.8% | 14 | 0 | 1.08 / 16.9 | 72.6% | -1.3 |
| 4 | 77.4% | 94.3% | 60.8% | 33 / 35 | 14.1% | 7.0% | 13 | 0 | 1.00 / 25.1 | 72.2% | +5.1 |
| 5 | 73.4% | 88.6% | 59.9% | 31 / 35 | 15.5% | 11.3% | 16 | 0 | 1.05 / 16.2 | 74.5% | -1.2 |
| 6 | 71.0% | 80.0% | 62.1% | 28 / 35 | 16.8% | 7.6% | 14 | 0 | 1.06 / 16.6 | 71.5% | -0.5 |
| 7 | 67.3% | 82.9% | 53.8% | 29 / 35 | 14.2% | 7.8% | 20 | 0 | 1.03 / 18.9 | 68.0% | -0.7 |
| 8 | 70.4% | 82.9% | 59.1% | 29 / 35 | 14.8% | 7.5% | 13 | 0 | 1.02 / 18.8 | 71.0% | -0.7 |
| 9 | 72.1% | 85.7% | 60.5% | 30 / 35 | 15.5% | 8.3% | 17 | 0 | 1.11 / 16.8 | 77.9% | -5.8 |
| 10 | 62.0% | 74.3% | 51.2% | 26 / 35 | 12.7% | 8.7% | 20 | 0 | 1.15 / 17.0 | 65.9% | -3.9 |
| 11 | 72.7% | 88.6% | 58.2% | 31 / 35 | 14.7% | 7.9% | 13 | 0 | 1.12 / 17.2 | 78.0% | -5.2 |
| 12 | 65.3% | 77.1% | 53.3% | 27 / 35 | 12.0% | 7.3% | 20 | 0 | 1.09 / 17.6 | 74.9% | -9.6 |
| 13 | 73.4% | 91.4% | 55.8% | 32 / 35 | 14.6% | 7.9% | 15 | 0 | 1.14 / 91.0 | 77.6% | -4.2 |
| 14 | 77.3% | 94.3% | 62.0% | 33 / 35 | 15.4% | 8.3% | 18 | 0 | 1.12 / 83.2 | 74.0% | +3.3 |
| 15 | 64.0% | 77.1% | 53.5% | 27 / 35 | 16.0% | 23.7% | 18 | 0 | 1.10 / 16.2 | 73.4% | -9.4 |
| 16 | 70.3% | 85.7% | 56.9% | 30 / 35 | 14.4% | 28.3% | 15 | 0 | 1.01 / 17.0 | 66.9% | +3.5 |

Mean score share 71.4% ± 2.6, baseline 72.9% ± 1.9, paired diff -1.5 ± 2.4.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 256 over 16 battles (16.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | mid | 71.4% ± 2.6 | 86.1% ± 3.5 | 58.0% ± 2.0 | 482 / 560 | 14.7% ± 0.6 | 10.3% ± 3.3 | 256 | 0 | 1.15 / 91.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | 18428 | 27 | 18345 | 18344 (99.5%) | 84 (0.5%) | 1 (0.0%) | 644 | 269 | 107 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| cw.megas.Silhouette 1.1 | 20195 | 1643 (8.1%) | 12647 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | 650 | 405 | 636 | 523 | 42.6 / 30.9 | 3789 | 7048 | 5636 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | 10.3% | 256 | 5272 | 3 | 32.7 | 1632 / 1643 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | cw.megas.Silhouette | 1 | 35 | 308 | 8.9% | 7.1% ± 1.6 | 13.9% | 25.7% / 24.1% | 9.9% | 0 / 0 | T3/M0 | 71% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
