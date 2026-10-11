# ntw.Sighup 1.5 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 92.0% | 100.0% | 83.4% | 35 / 35 | 21.8% | 5.4% | 10 | 0 | 0.70 / 15.2 | 89.1% | +2.9 |
| 2 | 92.5% | 100.0% | 85.2% | 35 / 35 | 24.5% | 5.0% | 13 | 0 | 0.67 / 15.5 | 89.9% | +2.6 |
| 3 | 87.1% | 100.0% | 75.3% | 35 / 35 | 24.3% | 8.7% | 10 | 0 | 0.79 / 16.4 | 89.7% | -2.5 |
| 4 | 91.5% | 100.0% | 82.8% | 35 / 35 | 25.0% | 6.9% | 15 | 0 | 0.73 / 15.2 | 92.9% | -1.5 |
| 5 | 91.2% | 100.0% | 82.9% | 35 / 35 | 32.4% | 6.8% | 13 | 0 | 0.74 / 15.9 | 94.7% | -3.5 |
| 6 | 88.8% | 100.0% | 78.7% | 35 / 35 | 29.9% | 9.7% | 14 | 0 | 0.75 / 15.4 | 89.2% | -0.4 |
| 7 | 94.8% | 100.0% | 88.7% | 35 / 35 | 24.1% | 4.8% | 14 | 0 | 0.68 / 14.2 | 91.2% | +3.6 |
| 8 | 91.0% | 100.0% | 82.2% | 35 / 35 | 27.4% | 8.0% | 10 | 0 | 0.74 / 16.4 | 87.6% | +3.4 |
| 9 | 87.1% | 94.3% | 79.7% | 33 / 35 | 28.2% | 7.4% | 12 | 0 | 0.80 / 14.1 | 93.5% | -6.5 |
| 10 | 91.8% | 100.0% | 83.6% | 35 / 35 | 25.6% | 5.8% | 12 | 0 | 0.74 / 16.2 | 92.1% | -0.3 |
| 11 | 90.6% | 97.1% | 83.5% | 34 / 35 | 24.0% | 4.4% | 11 | 0 | 0.73 / 14.6 | 91.7% | -1.1 |
| 12 | 91.4% | 97.1% | 85.4% | 34 / 35 | 28.9% | 5.3% | 11 | 0 | 0.72 / 13.7 | 90.7% | +0.7 |
| 13 | 91.5% | 100.0% | 82.8% | 35 / 35 | 25.7% | 6.5% | 9 | 0 | 0.61 / 8.8 | 86.9% | +4.6 |
| 14 | 88.9% | 97.1% | 81.1% | 34 / 35 | 27.2% | 8.5% | 11 | 0 | 0.77 / 13.9 | 91.1% | -2.2 |
| 15 | 91.1% | 100.0% | 82.9% | 35 / 35 | 30.6% | 7.9% | 12 | 0 | 0.67 / 14.6 | 93.2% | -2.2 |
| 16 | 85.8% | 97.1% | 76.2% | 34 / 35 | 26.6% | 17.9% | 16 | 0 | 0.79 / 14.7 | 88.0% | -2.3 |

Mean score share 90.4% ± 1.2, baseline 90.7% ± 1.2, paired diff -0.3 ± 1.6.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 193 over 16 battles (12.1 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | weak | 90.4% ± 1.2 | 98.9% ± 0.9 | 82.2% ± 1.8 | 554 / 560 | 26.6% ± 1.5 | 7.4% ± 1.7 | 193 | 0 | 0.80 / 16.4 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 9286 | 63 | 9226 | 9170 (98.8%) | 116 (1.2%) | 56 (0.6%) | 2427 | 272 | 56 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ntw.Sighup 1.5 | 10078 | 491 (4.9%) | 367 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 650 | 384 | 409 | 294 | 58.7 / 12.9 | 6192 | 7926 | 2605 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 7.4% | 193 | 72 | 3 | 16.4 | 484 / 491 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | ntw.Sighup | 1 | 35 | 272 | 9.5% | 8.0% ± 2.3 | 17.7% | 38.3% / 35.8% | 20.9% | 0 / 0 | T3/M? | 86% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
