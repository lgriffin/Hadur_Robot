# nz.jdc.nano.AralR 1.1 (lower) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 89.8% | 97.1% | 83.2% | 34 / 35 | 20.9% | 7.8% | 15 | 0 | 0.86 / 15.8 | 87.6% | +2.1 |
| 2 | 86.9% | 97.1% | 78.7% | 34 / 35 | 23.0% | 37.1% | 15 | 0 | 0.82 / 16.5 | 88.5% | -1.7 |
| 3 | 89.4% | 97.1% | 82.5% | 34 / 35 | 23.0% | 11.0% | 18 | 0 | 0.82 / 15.3 | 91.2% | -1.9 |
| 4 | 87.8% | 94.3% | 81.7% | 33 / 35 | 20.8% | 9.0% | 21 | 0 | 0.84 / 16.4 | 86.0% | +1.7 |
| 5 | 90.1% | 100.0% | 81.4% | 35 / 35 | 20.2% | 10.4% | 20 | 0 | 0.90 / 54.5 | 91.0% | -1.0 |
| 6 | 88.2% | 100.0% | 78.3% | 35 / 35 | 19.7% | 11.9% | 23 | 0 | 0.97 / 16.7 | 91.5% | -3.3 |
| 7 | 89.5% | 100.0% | 80.5% | 35 / 35 | 22.6% | 30.5% | 20 | 0 | 0.95 / 17.0 | 87.9% | +1.7 |
| 8 | 91.9% | 100.0% | 84.6% | 35 / 35 | 23.5% | 8.0% | 15 | 0 | 0.87 / 17.6 | 84.1% | +7.8 |
| 9 | 90.1% | 100.0% | 81.8% | 35 / 35 | 23.0% | 9.8% | 11 | 0 | 0.87 / 15.9 | 87.4% | +2.8 |
| 10 | 88.2% | 100.0% | 78.6% | 35 / 35 | 22.3% | 11.3% | 16 | 0 | 0.93 / 24.7 | 91.9% | -3.7 |
| 11 | 88.8% | 100.0% | 79.3% | 35 / 35 | 20.3% | 9.6% | 15 | 0 | 0.91 / 36.1 | 90.0% | -1.2 |
| 12 | 91.6% | 100.0% | 84.1% | 35 / 35 | 19.9% | 8.9% | 20 | 0 | 0.90 / 16.2 | 89.2% | +2.4 |
| 13 | 88.4% | 97.1% | 80.5% | 34 / 35 | 21.1% | 8.2% | 9 | 0 | 0.86 / 11.2 | 93.1% | -4.7 |
| 14 | 86.0% | 94.3% | 78.4% | 33 / 35 | 20.5% | 10.0% | 16 | 0 | 0.97 / 69.3 | 89.8% | -3.8 |
| 15 | 90.3% | 100.0% | 81.9% | 35 / 35 | 20.9% | 9.9% | 15 | 0 | 0.82 / 15.4 | 91.1% | -0.8 |
| 16 | 87.3% | 94.3% | 80.8% | 33 / 35 | 20.6% | 9.3% | 15 | 0 | 0.94 / 14.8 | 88.1% | -0.8 |

Mean score share 89.0% ± 0.9, baseline 89.3% ± 1.3, paired diff -0.3 ± 1.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 264 over 16 battles (16.5 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | lower | 89.0% ± 0.9 | 98.2% ± 1.2 | 81.0% ± 1.1 | 550 / 560 | 21.4% ± 0.7 | 12.7% ± 4.5 | 264 | 0 | 0.97 / 69.3 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | 15000 | 44 | 14838 | 14707 (98.0%) | 293 (2.0%) | 131 (0.9%) | 978 | 299 | 222 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | 13309 | 1067 (8.0%) | 7293 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | 650 | 335 | 469 | 389 | 68.9 / 16.2 | 8501 | 8293 | 2233 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | 12.7% | 264 | 78 | 3 | 26.4 | 1055 / 1067 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | nz.jdc.nano.AralR | 1 | 35 | 300 | 9.8% | 6.1% ± 1.6 | 17.4% | 24.7% / 30.2% | 4.5% | 0 / 0 | T2/M? | 86% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
