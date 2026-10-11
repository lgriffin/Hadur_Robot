# kinsen.nano.Quarrelet 1.0 (lower) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 74.8% | 85.7% | 62.6% | 30 / 35 | 14.4% | 4.9% | 19 | 0 | 1.07 / 16.6 | 79.3% | -4.5 |
| 2 | 76.1% | 91.4% | 60.0% | 32 / 35 | 16.2% | 5.8% | 7 | 0 | 1.05 / 16.0 | 85.1% | -9.1 |
| 3 | 79.1% | 97.1% | 59.4% | 34 / 35 | 14.1% | 6.4% | 13 | 0 | 1.12 / 15.9 | 77.6% | +1.5 |
| 4 | 76.9% | 91.4% | 62.6% | 32 / 35 | 16.5% | 7.5% | 25 | 0 | 1.05 / 14.7 | 74.0% | +2.9 |
| 5 | 75.9% | 91.4% | 59.0% | 32 / 35 | 14.5% | 5.8% | 17 | 0 | 1.09 / 15.7 | 70.6% | +5.3 |
| 6 | 78.0% | 94.3% | 60.3% | 33 / 35 | 15.0% | 6.1% | 16 | 0 | 1.08 / 16.2 | 70.8% | +7.2 |
| 7 | 74.7% | 88.6% | 59.5% | 31 / 35 | 14.0% | 5.2% | 16 | 0 | 1.06 / 15.9 | 77.5% | -2.7 |
| 8 | 81.2% | 94.3% | 66.7% | 33 / 35 | 15.6% | 5.0% | 15 | 0 | 1.07 / 16.0 | 76.7% | +4.5 |
| 9 | 81.4% | 97.1% | 64.1% | 34 / 35 | 15.5% | 5.7% | 15 | 0 | 1.04 / 15.4 | 69.8% | +11.6 |
| 10 | 77.4% | 94.3% | 58.6% | 33 / 35 | 14.1% | 6.6% | 17 | 0 | 1.01 / 14.8 | 77.4% | -0.1 |
| 11 | 74.5% | 91.4% | 57.0% | 32 / 35 | 15.6% | 6.9% | 17 | 0 | 1.08 / 14.6 | 76.0% | -1.5 |
| 12 | 79.3% | 94.3% | 62.5% | 33 / 35 | 15.2% | 5.9% | 17 | 0 | 1.02 / 14.5 | 78.0% | +1.3 |
| 13 | 74.8% | 91.4% | 57.7% | 32 / 35 | 15.8% | 12.9% | 8 | 0 | 0.93 / 17.0 | 84.9% | -10.1 |
| 14 | 74.9% | 88.6% | 59.7% | 31 / 35 | 14.9% | 5.6% | 6 | 0 | 1.01 / 15.8 | 79.0% | -4.1 |
| 15 | 85.4% | 100.0% | 68.0% | 35 / 35 | 16.6% | 5.8% | 15 | 0 | 0.97 / 14.7 | 73.1% | +12.3 |
| 16 | 72.0% | 91.4% | 53.8% | 32 / 35 | 15.8% | 11.1% | 18 | 0 | 1.07 / 17.2 | 74.9% | -3.0 |

Mean score share 77.3% ± 1.8, baseline 76.5% ± 2.4, paired diff +0.7 ± 3.4.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 241 over 16 battles (15.1 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | lower | 77.3% ± 1.8 | 92.7% ± 1.9 | 60.7% ± 1.9 | 519 / 560 | 15.2% ± 0.5 | 6.7% ± 1.2 | 241 | 0 | 1.12 / 17.2 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 12937 | 30 | 12943 | 12796 (98.9%) | 141 (1.1%) | 147 (1.1%) | 1654 | 256 | 133 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 15325 | 878 (5.7%) | 3997 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 650 | 489 | 558 | 404 | 36.9 / 24.0 | 2434 | 10854 | 8271 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 6.7% | 241 | 218 | 3 | 22.9 | 866 / 878 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | kinsen.nano.Quarrelet | 1 | 35 | 316 | 8.8% | 10.5% ± 2.2 | 14.3% | 31.2% / 29.3% | 8.0% | 0 / 0 | T3/M0 | 71% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
