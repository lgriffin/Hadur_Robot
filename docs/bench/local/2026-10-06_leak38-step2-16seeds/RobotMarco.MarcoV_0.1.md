# RobotMarco.MarcoV 0.1 (weak) vs hadur2.Hadur 3.8.1

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 99.7% | 100.0% | 99.5% | 35 / 35 | 39.2% | 2.9% | 15 | 0 | 0.61 / 12.2 | 100.0% | -0.3 |
| 2 | 99.7% | 100.0% | 99.5% | 35 / 35 | 38.8% | 0.5% | 13 | 0 | 0.68 / 11.0 | 100.0% | -0.3 |
| 3 | 95.5% | 97.1% | 94.0% | 34 / 35 | 37.4% | 8.5% | 11 | 0 | 0.73 / 150.4 | 98.1% | -2.6 |
| 4 | 97.9% | 100.0% | 96.1% | 35 / 35 | 35.3% | 3.8% | 14 | 0 | 0.65 / 12.9 | 100.0% | -2.1 |
| 5 | 100.0% | 100.0% | 100.0% | 35 / 35 | 38.9% | 0.0% | 13 | 0 | 0.63 / 80.2 | 100.0% | -0.0 |
| 6 | 100.0% | 100.0% | 100.0% | 35 / 35 | 38.9% | 0.0% | 15 | 0 | 0.65 / 11.0 | 100.0% | +0.0 |
| 7 | 100.0% | 100.0% | 100.0% | 35 / 35 | 41.1% | 0.0% | 14 | 0 | 0.66 / 168.6 | 100.0% | +0.0 |
| 8 | 100.0% | 100.0% | 100.0% | 35 / 35 | 38.5% | 0.0% | 11 | 0 | 0.66 / 208.2 | 98.7% | +1.3 |
| 9 | 100.0% | 100.0% | 100.0% | 35 / 35 | 38.6% | 0.0% | 12 | 0 | 0.66 / 171.3 | 100.0% | +0.0 |
| 10 | 99.7% | 100.0% | 99.5% | 35 / 35 | 39.7% | 0.6% | 15 | 0 | 0.65 / 13.6 | 100.0% | -0.3 |
| 11 | 100.0% | 100.0% | 100.0% | 35 / 35 | 40.3% | 0.0% | 12 | 0 | 0.66 / 12.2 | 100.0% | -0.0 |
| 12 | 100.0% | 100.0% | 100.0% | 35 / 35 | 36.2% | 0.0% | 13 | 0 | 0.68 / 14.4 | 100.0% | +0.0 |
| 13 | 100.0% | 100.0% | 100.0% | 35 / 35 | 41.0% | 0.0% | 14 | 0 | 0.68 / 13.8 | 96.9% | +3.1 |
| 14 | 100.0% | 100.0% | 100.0% | 35 / 35 | 42.6% | 0.0% | 13 | 0 | 0.69 / 11.5 | 99.4% | +0.5 |
| 15 | 97.5% | 97.1% | 97.7% | 34 / 35 | 41.6% | 1.6% | 15 | 0 | 0.73 / 11.0 | 99.7% | -2.2 |
| 16 | 99.7% | 100.0% | 99.5% | 35 / 35 | 42.5% | 0.6% | 15 | 0 | 0.63 / 21.7 | 100.0% | -0.3 |

Mean score share 99.4% ± 0.7, baseline 99.6% ± 0.5, paired diff -0.2 ± 0.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 215 over 16 battles (13.4 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | weak | 99.4% ± 0.7 | 99.6% ± 0.5 | 99.1% ± 0.9 | 558 / 560 | 39.4% ± 1.1 | 1.2% ± 1.2 | 215 | 0 | 0.73 / 208.2 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 1840 | 6 | 1821 | 1821 (99.0%) | 19 (1.0%) | 0 (0.0%) | 14 | 60 | 47 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 9135 | 90 (1.0%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 650 | 425 | 400 | 271 | 90.5 / 0.8 | 5665 | 1328 | 247 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 1.2% | 215 | 61 | 3 | 3.3 | 89 / 90 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | RobotMarco.MarcoV | 1 | 35 | 300 | 0.9% | 1.1% ± 3.2 | 30.0% | 61.9% / 61.6% | 66.8% | 0 / 0 | T?/M? | 100% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
