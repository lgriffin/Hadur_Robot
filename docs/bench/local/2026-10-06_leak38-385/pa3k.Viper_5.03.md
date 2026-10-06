# pa3k.Viper 5.03 (lower) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 82.0% | 94.3% | 70.5% | 33 / 35 | 16.5% | 6.4% | 20 | 0 | 1.12 / 18.2 | 80.4% | +1.7 |
| 2 | 78.2% | 82.9% | 73.3% | 29 / 35 | 18.2% | 7.5% | 16 | 0 | 1.04 / 17.5 | 75.7% | +2.5 |
| 3 | 82.2% | 94.3% | 71.2% | 33 / 35 | 19.3% | 10.3% | 10 | 0 | 1.03 / 17.1 | 83.9% | -1.7 |
| 4 | 73.7% | 82.9% | 65.7% | 29 / 35 | 15.9% | 8.0% | 22 | 0 | 1.13 / 16.2 | 82.0% | -8.3 |
| 5 | 82.7% | 97.1% | 69.2% | 34 / 35 | 15.3% | 7.0% | 22 | 0 | 1.23 / 17.0 | 80.1% | +2.6 |
| 6 | 81.9% | 94.3% | 70.2% | 33 / 35 | 16.6% | 9.3% | 21 | 0 | 1.15 / 18.6 | 85.7% | -3.8 |
| 7 | 87.6% | 100.0% | 75.2% | 35 / 35 | 15.6% | 5.8% | 18 | 0 | 1.12 / 16.2 | 75.6% | +11.9 |
| 8 | 79.2% | 85.7% | 73.4% | 30 / 35 | 17.0% | 7.6% | 14 | 0 | 1.16 / 17.2 | 82.8% | -3.6 |
| 9 | 82.6% | 91.4% | 73.7% | 32 / 35 | 17.8% | 6.1% | 15 | 0 | 1.09 / 18.4 | 82.1% | +0.5 |
| 10 | 79.8% | 91.4% | 68.5% | 32 / 35 | 16.5% | 7.4% | 15 | 0 | 1.11 / 18.8 | 78.7% | +1.1 |
| 11 | 73.7% | 82.9% | 65.8% | 29 / 35 | 17.0% | 9.8% | 14 | 0 | 1.06 / 11.9 | 83.3% | -9.6 |
| 12 | 75.3% | 82.9% | 68.3% | 29 / 35 | 16.6% | 7.3% | 21 | 0 | 1.09 / 19.0 | 85.6% | -10.3 |
| 13 | 83.3% | 94.3% | 72.5% | 33 / 35 | 16.7% | 6.2% | 18 | 0 | 1.04 / 17.3 | 85.7% | -2.4 |
| 14 | 83.0% | 97.1% | 69.6% | 34 / 35 | 14.7% | 6.8% | 16 | 0 | 1.14 / 17.3 | 85.1% | -2.1 |
| 15 | 89.9% | 100.0% | 79.6% | 35 / 35 | 17.2% | 5.3% | 12 | 0 | 1.00 / 17.8 | 78.7% | +11.2 |
| 16 | 82.0% | 94.3% | 70.6% | 33 / 35 | 20.0% | 9.9% | 15 | 0 | 1.03 / 17.9 | 84.8% | -2.8 |

Mean score share 81.1% ± 2.4, baseline 81.9% ± 1.8, paired diff -0.8 ± 3.3.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 269 over 16 battles (16.8 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | lower | 81.1% ± 2.4 | 91.6% ± 3.3 | 71.1% ± 1.9 | 513 / 560 | 16.9% ± 0.7 | 7.5% ± 0.8 | 269 | 0 | 1.23 / 19.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 18034 | 40 | 17961 | 17954 (99.6%) | 80 (0.4%) | 7 (0.0%) | 1273 | 261 | 256 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| pa3k.Viper 5.03 | 22039 | 1580 (7.2%) | 12555 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 650 | 431 | 495 | 566 | 53.1 / 21.7 | 5439 | 8096 | 102 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 7.5% | 269 | 397 | 3 | 32.0 | 1574 / 1580 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | pa3k.Viper | 1 | 35 | 274 | 8.6% | 6.8% ± 1.7 | 15.5% | 33.3% / 30.5% | 24.4% | 0 / 0 | T2/M0 | 80% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
