# sadoner.killer 0.2 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 90.4% | 97.1% | 83.1% | 34 / 35 | 18.9% | 4.6% | 14 | 0 | 0.81 / 15.5 | 80.5% | +9.9 |
| 2 | 88.6% | 97.1% | 80.2% | 34 / 35 | 20.9% | 7.1% | 15 | 0 | 0.82 / 16.1 | 88.5% | +0.2 |
| 3 | 92.1% | 100.0% | 83.7% | 35 / 35 | 20.0% | 4.1% | 13 | 0 | 0.82 / 15.9 | 89.0% | +3.0 |
| 4 | 87.8% | 94.3% | 81.7% | 33 / 35 | 22.5% | 8.4% | 46 | 0 | 0.85 / 90.0 | 93.3% | -5.6 |
| 5 | 86.4% | 97.1% | 76.7% | 34 / 35 | 22.7% | 8.5% | 14 | 0 | 0.88 / 137.9 | 81.0% | +5.4 |
| 6 | 84.5% | 94.3% | 75.5% | 33 / 35 | 19.3% | 7.6% | 13 | 0 | 0.87 / 431.6 | 88.7% | -4.2 |
| 7 | 83.1% | 97.1% | 71.5% | 34 / 35 | 20.3% | 16.4% | 13 | 0 | 0.88 / 343.7 | 86.0% | -2.9 |
| 8 | 87.8% | 94.3% | 80.6% | 33 / 35 | 20.0% | 5.5% | 10 | 0 | 0.81 / 185.1 | 86.0% | +1.8 |
| 9 | 88.9% | 97.1% | 80.9% | 34 / 35 | 20.9% | 7.4% | 11 | 0 | 0.88 / 72.3 | 82.2% | +6.7 |
| 10 | 85.6% | 100.0% | 73.3% | 35 / 35 | 21.8% | 8.7% | 14 | 0 | 0.92 / 14.5 | 88.1% | -2.5 |
| 11 | 87.9% | 97.1% | 79.6% | 34 / 35 | 24.1% | 8.4% | 11 | 0 | 0.86 / 51.4 | 86.2% | +1.7 |
| 12 | 78.7% | 85.7% | 71.8% | 30 / 35 | 19.8% | 7.6% | 16 | 0 | 0.82 / 14.6 | 90.3% | -11.6 |
| 13 | 89.3% | 97.1% | 81.7% | 34 / 35 | 21.1% | 6.7% | 11 | 0 | 0.82 / 44.1 | 87.9% | +1.4 |
| 14 | 90.1% | 100.0% | 80.1% | 35 / 35 | 19.5% | 6.1% | 15 | 0 | 0.76 / 15.5 | 87.7% | +2.3 |
| 15 | 86.2% | 94.3% | 78.4% | 33 / 35 | 21.4% | 7.0% | 12 | 0 | 0.79 / 30.6 | 88.3% | -2.1 |
| 16 | 83.4% | 94.3% | 74.1% | 33 / 35 | 21.4% | 8.5% | 12 | 0 | 0.97 / 15.3 | 89.7% | -6.3 |

Mean score share 86.9% ± 1.8, baseline 87.1% ± 1.8, paired diff -0.2 ± 2.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 240 over 16 battles (15.0 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | weak | 86.9% ± 1.8 | 96.1% ± 1.8 | 78.3% ± 2.1 | 538 / 560 | 20.9% ± 0.7 | 7.7% ± 1.4 | 240 | 0 | 0.97 / 431.6 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 11461 | 47 | 11402 | 11399 (99.5%) | 62 (0.5%) | 3 (0.0%) | 112 | 187 | 55 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sadoner.killer 0.2 | 11449 | 865 (7.6%) | 5369 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 650 | 289 | 416 | 333 | 59.2 / 16.6 | 6380 | 10848 | 71 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 7.7% | 240 | 1712 | 3 | 20.3 | 862 / 865 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | sadoner.killer | 1 | 35 | 288 | 10.9% | 7.3% ± 2.0 | 17.6% | 23.6% / 23.6% | 5.2% | 0 / 0 | T3/M? | 82% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
