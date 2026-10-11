# apv.NanoLauLectrik 1.0 (lower) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 80.7% | 100.0% | 59.9% | 35 / 35 | 14.2% | 6.5% | 17 | 0 | 1.11 / 16.2 | 79.5% | +1.2 |
| 2 | 75.1% | 88.6% | 60.7% | 31 / 35 | 16.2% | 6.9% | 13 | 0 | 1.07 / 17.1 | 83.9% | -8.8 |
| 3 | 79.2% | 97.1% | 59.5% | 34 / 35 | 15.3% | 6.3% | 19 | 0 | 1.12 / 18.0 | 74.8% | +4.4 |
| 4 | 82.2% | 100.0% | 62.8% | 35 / 35 | 15.6% | 11.3% | 20 | 0 | 1.04 / 16.7 | 83.3% | -1.1 |
| 5 | 77.4% | 94.3% | 58.7% | 33 / 35 | 14.5% | 6.1% | 23 | 0 | 1.07 / 17.1 | 79.6% | -2.2 |
| 6 | 81.1% | 94.3% | 66.5% | 33 / 35 | 17.4% | 6.3% | 22 | 0 | 1.06 / 16.0 | 83.1% | -2.0 |
| 7 | 80.2% | 100.0% | 59.8% | 35 / 35 | 16.2% | 14.9% | 19 | 0 | 1.07 / 16.3 | 81.7% | -1.5 |
| 8 | 76.6% | 94.3% | 59.8% | 33 / 35 | 16.0% | 7.5% | 17 | 0 | 1.13 / 15.6 | 71.8% | +4.8 |
| 9 | 81.0% | 97.1% | 63.4% | 34 / 35 | 15.3% | 5.9% | 12 | 0 | 1.11 / 16.6 | 83.2% | -2.2 |
| 10 | 84.3% | 100.0% | 66.6% | 35 / 35 | 15.2% | 5.3% | 15 | 0 | 1.09 / 15.8 | 84.2% | +0.1 |
| 11 | 80.7% | 94.3% | 64.9% | 33 / 35 | 15.5% | 5.0% | 12 | 0 | 1.06 / 14.9 | 87.3% | -6.6 |
| 12 | 72.0% | 85.7% | 57.5% | 30 / 35 | 15.4% | 9.1% | 18 | 0 | 1.10 / 15.1 | 78.5% | -6.4 |
| 13 | 83.0% | 97.1% | 66.6% | 34 / 35 | 15.3% | 5.1% | 18 | 0 | 1.06 / 15.9 | 83.2% | -0.3 |
| 14 | 76.5% | 91.4% | 61.5% | 32 / 35 | 14.8% | 6.3% | 19 | 0 | 1.11 / 15.6 | 84.7% | -8.2 |
| 15 | 77.4% | 94.3% | 59.7% | 33 / 35 | 14.6% | 6.1% | 14 | 0 | 1.11 / 15.4 | 80.4% | -3.0 |
| 16 | 78.0% | 91.4% | 64.5% | 32 / 35 | 16.0% | 6.1% | 18 | 0 | 1.09 / 14.9 | 81.6% | -3.6 |

Mean score share 79.1% ± 1.7, baseline 81.3% ± 2.1, paired diff -2.2 ± 2.1.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 276 over 16 battles (17.3 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | lower | 79.1% ± 1.7 | 95.0% ± 2.3 | 62.0% ± 1.6 | 532 / 560 | 15.5% ± 0.4 | 7.2% ± 1.4 | 276 | 0 | 1.13 / 18.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 13068 | 29 | 12959 | 12925 (98.9%) | 143 (1.1%) | 34 (0.3%) | 1226 | 245 | 105 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 15426 | 1092 (7.1%) | 6642 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 650 | 472 | 548 | 408 | 38.6 / 23.7 | 2894 | 11825 | 7104 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 7.2% | 276 | 442 | 3 | 23.1 | 1085 / 1092 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | apv.NanoLauLectrik | 1 | 35 | 304 | 7.3% | 8.1% ± 2.1 | 14.6% | 31.8% / 29.9% | 9.5% | 0 / 0 | T3/M? | 77% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
