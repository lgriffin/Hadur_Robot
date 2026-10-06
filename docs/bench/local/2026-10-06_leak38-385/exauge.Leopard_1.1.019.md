# exauge.Leopard 1.1.019 (weak) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 82.8% | 100.0% | 73.7% | 35 / 35 | 81.6% | 38.6% | 12 | 0 | 0.69 / 10.8 | 81.1% | +1.6 |
| 2 | 81.7% | 100.0% | 72.1% | 35 / 35 | 79.1% | 43.1% | 15 | 0 | 0.67 / 10.0 | 85.4% | -3.7 |
| 3 | 82.5% | 100.0% | 73.1% | 35 / 35 | 80.0% | 41.1% | 13 | 0 | 0.72 / 11.7 | 82.9% | -0.4 |
| 4 | 80.5% | 97.1% | 72.8% | 34 / 35 | 80.3% | 57.7% | 13 | 0 | 0.64 / 10.2 | 84.4% | -4.0 |
| 5 | 80.6% | 97.1% | 71.8% | 34 / 35 | 78.3% | 41.3% | 14 | 0 | 0.71 / 10.3 | 82.9% | -2.3 |
| 6 | 83.2% | 100.0% | 73.8% | 35 / 35 | 79.2% | 38.7% | 16 | 0 | 0.70 / 10.0 | 81.1% | +2.1 |
| 7 | 81.7% | 97.1% | 73.6% | 34 / 35 | 79.7% | 36.6% | 13 | 0 | 0.65 / 9.3 | 85.8% | -4.1 |
| 8 | 86.0% | 100.0% | 78.0% | 35 / 35 | 79.1% | 31.7% | 12 | 0 | 0.73 / 9.2 | 84.2% | +1.8 |
| 9 | 84.6% | 100.0% | 75.8% | 35 / 35 | 79.8% | 32.5% | 12 | 0 | 0.67 / 9.9 | 83.1% | +1.5 |
| 10 | 85.3% | 100.0% | 76.5% | 35 / 35 | 81.6% | 33.2% | 16 | 0 | 0.77 / 9.8 | 85.1% | +0.2 |
| 11 | 86.5% | 100.0% | 78.3% | 35 / 35 | 79.0% | 29.8% | 11 | 0 | 0.71 / 11.8 | 82.4% | +4.1 |
| 12 | 80.1% | 97.1% | 71.2% | 34 / 35 | 78.2% | 56.7% | 17 | 0 | 0.69 / 10.0 | 84.0% | -3.9 |
| 13 | 83.5% | 100.0% | 74.5% | 35 / 35 | 79.2% | 38.4% | 14 | 0 | 0.68 / 10.0 | 82.4% | +1.1 |
| 14 | 82.2% | 97.1% | 74.1% | 34 / 35 | 77.3% | 51.8% | 16 | 0 | 0.66 / 9.7 | 81.9% | +0.3 |
| 15 | 82.3% | 97.1% | 74.7% | 34 / 35 | 81.7% | 34.0% | 17 | 0 | 0.69 / 10.9 | 80.5% | +1.8 |
| 16 | 82.4% | 97.1% | 74.9% | 34 / 35 | 82.2% | 35.2% | 16 | 0 | 0.66 / 9.5 | 83.4% | -1.0 |

Mean score share 82.9% ± 1.0, baseline 83.2% ± 0.8, paired diff -0.3 ± 1.4.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 227 over 16 battles (14.2 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | weak | 82.9% ± 1.0 | 98.8% ± 0.8 | 74.3% ± 1.1 | 553 / 560 | 79.8% ± 0.7 | 40.0% ± 4.6 | 227 | 0 | 0.77 / 11.8 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 4360 | 30 | 4293 | 4289 (98.4%) | 71 (1.6%) | 4 (0.1%) | 683 | 446 | 56 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| exauge.Leopard 1.1.019 | 4269 | 82 (1.9%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 650 | 208 | 483 | 140 | 100.3 / 34.8 | 3579 | 5037 | 30 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 40.0% | 227 | 40 | 3 | 7.6 | 82 / 82 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | exauge.Leopard | 1 | 35 | 296 | 42.0% | 10.4% ± 3.9 | 45.5% | 17.6% / 17.7% | 4.2% | 0 / 0 | T?/M? | 81% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
