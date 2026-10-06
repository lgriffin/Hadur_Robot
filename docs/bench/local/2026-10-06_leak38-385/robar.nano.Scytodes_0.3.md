# robar.nano.Scytodes 0.3 (weak) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 92.0% | 97.1% | 87.3% | 34 / 35 | 48.8% | 14.6% | 20 | 0 | 0.89 / 34.0 | 91.9% | +0.0 |
| 2 | 91.0% | 97.1% | 86.6% | 34 / 35 | 51.6% | 6.2% | 16 | 0 | 0.91 / 10.0 | 92.0% | -1.0 |
| 3 | 95.4% | 100.0% | 91.2% | 35 / 35 | 48.9% | 4.4% | 13 | 0 | 0.89 / 9.9 | 94.7% | +0.7 |
| 4 | 95.2% | 100.0% | 90.9% | 35 / 35 | 52.1% | 5.2% | 16 | 0 | 0.90 / 48.3 | 92.8% | +2.4 |
| 5 | 92.2% | 100.0% | 85.7% | 35 / 35 | 50.4% | 7.8% | 18 | 0 | 0.92 / 9.8 | 94.2% | -2.0 |
| 6 | 95.7% | 100.0% | 91.8% | 35 / 35 | 50.5% | 4.3% | 17 | 0 | 0.84 / 10.0 | 93.4% | +2.3 |
| 7 | 94.9% | 100.0% | 90.5% | 35 / 35 | 52.8% | 5.4% | 16 | 0 | 0.86 / 80.0 | 94.5% | +0.5 |
| 8 | 96.0% | 100.0% | 92.4% | 35 / 35 | 53.2% | 4.5% | 11 | 0 | 0.85 / 10.0 | 94.8% | +1.2 |
| 9 | 94.2% | 100.0% | 89.1% | 35 / 35 | 49.9% | 6.4% | 14 | 0 | 0.93 / 11.0 | 94.3% | -0.1 |
| 10 | 92.4% | 97.1% | 88.3% | 34 / 35 | 49.7% | 11.1% | 17 | 0 | 0.88 / 10.0 | 94.2% | -1.8 |
| 11 | 95.8% | 100.0% | 92.0% | 35 / 35 | 54.7% | 4.9% | 15 | 0 | 0.84 / 11.2 | 93.3% | +2.4 |
| 12 | 93.5% | 97.1% | 90.1% | 34 / 35 | 46.5% | 15.2% | 21 | 0 | 0.86 / 10.4 | 92.1% | +1.4 |
| 13 | 93.2% | 100.0% | 87.5% | 35 / 35 | 53.7% | 7.9% | 15 | 0 | 1.00 / 10.2 | 91.9% | +1.3 |
| 14 | 91.8% | 97.1% | 87.1% | 34 / 35 | 46.6% | 17.1% | 18 | 0 | 0.87 / 11.8 | 94.8% | -3.0 |
| 15 | 93.3% | 97.1% | 89.9% | 34 / 35 | 53.6% | 5.1% | 17 | 0 | 0.82 / 9.9 | 95.0% | -1.7 |
| 16 | 93.8% | 100.0% | 88.3% | 35 / 35 | 49.5% | 9.1% | 19 | 0 | 0.85 / 10.5 | 95.1% | -1.3 |

Mean score share 93.8% ± 0.9, baseline 93.7% ± 0.6, paired diff +0.1 ± 0.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 263 over 16 battles (16.4 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| robar.nano.Scytodes 0.3 | weak | 93.8% ± 0.9 | 98.9% ± 0.8 | 89.3% ± 1.1 | 554 / 560 | 50.8% ± 1.3 | 8.1% ± 2.2 | 263 | 0 | 1.00 / 80.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| robar.nano.Scytodes 0.3 | 5171 | 39 | 5020 | 4988 (96.5%) | 183 (3.5%) | 32 (0.6%) | 140 | 177 | 54 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| robar.nano.Scytodes 0.3 | 5604 | 395 (7.0%) | 1186 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| robar.nano.Scytodes 0.3 | 650 | 395 | 400 | 175 | 76.5 / 9.2 | 3640 | 7714 | 2084 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| robar.nano.Scytodes 0.3 | 8.1% | 263 | 779 | 3 | 9.0 | 385 / 395 (97%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| robar.nano.Scytodes 0.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| robar.nano.Scytodes 0.3 | robar.nano.Scytodes | 1 | 35 | 308 | 6.5% | 8.0% ± 3.3 | 32.7% | 78.7% / 74.7% | 46.4% | 0 / 0 | T?/M? | 94% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
