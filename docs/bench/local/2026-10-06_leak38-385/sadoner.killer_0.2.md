# sadoner.killer 0.2 (weak) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.5% | 94.3% | 70.9% | 33 / 35 | 20.4% | 10.7% | 16 | 0 | 0.92 / 16.0 | 76.8% | +4.6 |
| 2 | 80.3% | 91.4% | 70.5% | 32 / 35 | 19.4% | 10.3% | 18 | 0 | 0.86 / 16.0 | 86.2% | -5.9 |
| 3 | 86.0% | 94.3% | 78.5% | 33 / 35 | 23.6% | 7.9% | 15 | 0 | 0.91 / 14.9 | 85.1% | +0.9 |
| 4 | 70.2% | 77.1% | 64.8% | 27 / 35 | 21.6% | 17.1% | 16 | 0 | 0.91 / 14.3 | 84.5% | -14.4 |
| 5 | 84.2% | 94.3% | 75.6% | 33 / 35 | 24.5% | 8.6% | 14 | 0 | 0.86 / 15.5 | 84.2% | +0.0 |
| 6 | 80.5% | 91.4% | 70.8% | 32 / 35 | 18.6% | 13.1% | 16 | 0 | 0.85 / 15.0 | 87.6% | -7.1 |
| 7 | 84.4% | 94.3% | 75.4% | 33 / 35 | 20.5% | 8.2% | 15 | 0 | 0.91 / 14.9 | 86.2% | -1.9 |
| 8 | 86.7% | 97.1% | 77.1% | 34 / 35 | 20.2% | 7.2% | 12 | 0 | 0.89 / 14.3 | 88.4% | -1.7 |
| 9 | 89.0% | 97.1% | 80.4% | 34 / 35 | 20.2% | 6.5% | 13 | 0 | 0.82 / 15.6 | 83.6% | +5.4 |
| 10 | 88.6% | 100.0% | 77.6% | 35 / 35 | 19.7% | 7.2% | 14 | 0 | 0.87 / 15.0 | 84.5% | +4.1 |
| 11 | 84.4% | 94.3% | 75.7% | 33 / 35 | 22.6% | 7.6% | 15 | 0 | 0.81 / 12.9 | 89.5% | -5.2 |
| 12 | 84.0% | 100.0% | 70.9% | 35 / 35 | 20.7% | 11.6% | 17 | 0 | 0.89 / 17.2 | 83.1% | +0.9 |
| 13 | 81.1% | 91.4% | 71.9% | 32 / 35 | 18.5% | 7.4% | 15 | 0 | 0.86 / 15.1 | 84.9% | -3.8 |
| 14 | 91.4% | 100.0% | 82.7% | 35 / 35 | 21.4% | 5.7% | 15 | 0 | 0.81 / 16.2 | 90.3% | +1.1 |
| 15 | 85.7% | 94.3% | 78.0% | 33 / 35 | 20.9% | 8.9% | 16 | 0 | 0.86 / 15.0 | 84.0% | +1.7 |
| 16 | 84.7% | 94.3% | 76.2% | 33 / 35 | 21.9% | 7.6% | 13 | 0 | 0.86 / 14.5 | 78.6% | +6.1 |

Mean score share 83.9% ± 2.6, baseline 84.9% ± 1.9, paired diff -0.9 ± 2.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 240 over 16 battles (15.0 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | weak | 83.9% ± 2.6 | 94.1% ± 2.9 | 74.8% ± 2.4 | 527 / 560 | 20.9% ± 0.9 | 9.1% ± 1.5 | 240 | 0 | 0.92 / 17.2 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 11847 | 43 | 11761 | 11757 (99.2%) | 90 (0.8%) | 4 (0.0%) | 162 | 180 | 68 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sadoner.killer 0.2 | 11751 | 921 (7.8%) | 4873 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 650 | 295 | 491 | 343 | 60.1 / 20.5 | 6813 | 9098 | 25 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 9.1% | 240 | 82 | 3 | 20.9 | 918 / 921 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | sadoner.killer | 1 | 35 | 288 | 8.7% | 5.4% ± 1.8 | 17.3% | 23.5% / 22.3% | 4.9% | 0 / 0 | T2/M? | 85% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
