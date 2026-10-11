# RobotMarco.MarcoV 0.1 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 100.0% | 100.0% | 100.0% | 35 / 35 | 42.9% | 0.0% | 12 | 0 | 0.68 / 78.2 | 100.0% | +0.0 |
| 2 | 100.0% | 100.0% | 100.0% | 35 / 35 | 40.3% | 0.0% | 14 | 0 | 0.65 / 113.6 | 100.0% | -0.0 |
| 3 | 100.0% | 100.0% | 100.0% | 35 / 35 | 44.7% | 0.0% | 12 | 0 | 0.70 / 125.8 | 97.2% | +2.8 |
| 4 | 99.5% | 100.0% | 99.0% | 35 / 35 | 37.4% | 2.9% | 14 | 0 | 0.67 / 88.8 | 100.0% | -0.5 |
| 5 | 100.0% | 100.0% | 100.0% | 35 / 35 | 41.9% | 0.0% | 11 | 0 | 0.70 / 11.4 | 100.0% | +0.0 |
| 6 | 100.0% | 100.0% | 100.0% | 35 / 35 | 38.4% | 1.0% | 14 | 0 | 0.67 / 11.4 | 98.4% | +1.6 |
| 7 | 100.0% | 100.0% | 100.0% | 35 / 35 | 41.0% | 0.0% | 12 | 0 | 0.65 / 11.5 | 100.0% | +0.0 |
| 8 | 100.0% | 100.0% | 100.0% | 35 / 35 | 41.5% | 0.0% | 9 | 0 | 0.67 / 10.9 | 100.0% | +0.0 |
| 9 | 100.0% | 100.0% | 100.0% | 35 / 35 | 40.0% | 0.0% | 12 | 0 | 0.67 / 10.6 | 100.0% | +0.0 |
| 10 | 100.0% | 100.0% | 100.0% | 35 / 35 | 40.9% | 0.0% | 16 | 0 | 0.64 / 10.0 | 99.6% | +0.4 |
| 11 | 100.0% | 100.0% | 100.0% | 35 / 35 | 40.2% | 0.0% | 12 | 0 | 0.71 / 11.1 | 99.9% | +0.0 |
| 12 | 100.0% | 100.0% | 100.0% | 35 / 35 | 38.1% | 0.0% | 16 | 0 | 0.74 / 12.0 | 100.0% | +0.0 |
| 13 | 98.9% | 100.0% | 98.0% | 35 / 35 | 40.4% | 5.5% | 14 | 0 | 0.76 / 10.2 | 100.0% | -1.1 |
| 14 | 100.0% | 100.0% | 100.0% | 35 / 35 | 41.0% | 0.0% | 16 | 0 | 0.67 / 11.0 | 100.0% | +0.0 |
| 15 | 100.0% | 100.0% | 100.0% | 35 / 35 | 40.7% | 0.0% | 12 | 0 | 0.72 / 11.0 | 100.0% | +0.0 |
| 16 | 100.0% | 100.0% | 100.0% | 35 / 35 | 39.1% | 0.0% | 13 | 0 | 0.69 / 10.8 | 100.0% | +0.0 |

Mean score share 99.9% ± 0.2, baseline 99.7% ± 0.4, paired diff +0.2 ± 0.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 209 over 16 battles (13.1 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | weak | 99.9% ± 0.2 | 100.0% ± 0.0 | 99.8% ± 0.3 | 560 / 560 | 40.5% ± 1.0 | 0.6% ± 0.8 | 209 | 0 | 0.76 / 125.8 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 1705 | 6 | 1693 | 1692 (99.2%) | 13 (0.8%) | 1 (0.1%) | 1 | 34 | 97 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 8778 | 69 (0.8%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 650 | 421 | 400 | 262 | 91.0 / 0.2 | 5304 | 1418 | 174 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 0.6% | 209 | 54 | 3 | 3.0 | 69 / 69 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | RobotMarco.MarcoV | 1 | 35 | 300 | 0.0% | 0.0% ± 2.5 | 28.3% | 64.4% / 65.3% | 66.7% | 0 / 0 | T0/M? | 100% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
