# dggp.haiku.gpBot_0 1.1 (weak) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 92.1% | 97.1% | 87.3% | 34 / 35 | 29.5% | 2.9% | 14 | 0 | 0.75 / 16.3 | 93.1% | -0.9 |
| 2 | 88.6% | 97.1% | 80.3% | 34 / 35 | 22.9% | 5.4% | 14 | 0 | 0.81 / 14.8 | 93.4% | -4.7 |
| 3 | 94.7% | 100.0% | 88.8% | 35 / 35 | 25.7% | 2.8% | 13 | 0 | 0.82 / 10.2 | 94.7% | -0.1 |
| 4 | 95.3% | 100.0% | 90.2% | 35 / 35 | 26.8% | 2.9% | 15 | 0 | 0.79 / 14.7 | 89.3% | +6.0 |
| 5 | 95.5% | 100.0% | 90.5% | 35 / 35 | 24.6% | 2.5% | 16 | 0 | 0.75 / 14.8 | 91.8% | +3.8 |
| 6 | 96.2% | 100.0% | 91.9% | 35 / 35 | 25.9% | 1.9% | 12 | 0 | 0.77 / 15.1 | 92.9% | +3.3 |
| 7 | 92.3% | 100.0% | 84.2% | 35 / 35 | 24.4% | 12.6% | 15 | 0 | 0.78 / 15.2 | 90.2% | +2.2 |
| 8 | 95.5% | 100.0% | 90.9% | 35 / 35 | 27.9% | 2.6% | 14 | 0 | 0.81 / 15.2 | 89.5% | +6.0 |
| 9 | 94.7% | 100.0% | 88.7% | 35 / 35 | 23.3% | 3.0% | 12 | 0 | 0.84 / 10.1 | 94.3% | +0.4 |
| 10 | 85.6% | 94.3% | 77.3% | 33 / 35 | 22.9% | 19.7% | 15 | 0 | 0.81 / 9.8 | 83.5% | +2.1 |
| 11 | 94.9% | 100.0% | 89.5% | 35 / 35 | 27.6% | 3.2% | 13 | 0 | 0.78 / 14.2 | 95.7% | -0.8 |
| 12 | 88.2% | 94.3% | 82.1% | 33 / 35 | 27.2% | 11.0% | 16 | 0 | 0.77 / 17.0 | 90.1% | -1.9 |
| 13 | 89.6% | 100.0% | 79.7% | 35 / 35 | 23.0% | 7.9% | 13 | 0 | 0.81 / 16.7 | 87.0% | +2.5 |
| 14 | 93.6% | 97.1% | 89.7% | 34 / 35 | 25.8% | 16.0% | 17 | 0 | 0.74 / 9.8 | 93.1% | +0.5 |
| 15 | 86.6% | 97.1% | 76.2% | 34 / 35 | 23.7% | 8.6% | 18 | 0 | 0.85 / 14.4 | 92.0% | -5.3 |
| 16 | 86.1% | 94.3% | 78.6% | 33 / 35 | 26.7% | 7.3% | 15 | 0 | 0.84 / 16.4 | 90.3% | -4.2 |

Mean score share 91.8% ± 2.0, baseline 91.3% ± 1.6, paired diff +0.5 ± 1.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 232 over 16 battles (14.5 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | weak | 91.8% ± 2.0 | 98.2% ± 1.2 | 85.4% ± 2.9 | 550 / 560 | 25.5% ± 1.1 | 6.9% ± 2.9 | 232 | 0 | 0.85 / 17.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 7911 | 28 | 7695 | 7694 (97.3%) | 217 (2.7%) | 1 (0.0%) | 904 | 156 | 52 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 8982 | 495 (5.5%) | 1654 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 650 | 433 | 400 | 268 | 58.0 / 10.2 | 6150 | 7627 | 3643 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 6.9% | 232 | 68 | 3 | 13.7 | 481 / 495 (97%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | dggp.haiku.gpBot_0 | 1 | 35 | 304 | 8.4% | 8.0% ± 2.6 | 20.7% | 42.6% / 36.7% | 11.2% | 0 / 0 | T3/M? | 85% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
