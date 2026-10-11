# RobotMarco.MarcoV 0.1 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 99.7% | 100.0% | 99.5% | 35 / 35 | 37.7% | 1.4% | 12 | 0 | 0.60 / 9.8 | 100.0% | -0.3 |
| 2 | 100.0% | 100.0% | 100.0% | 35 / 35 | 37.8% | 0.0% | 11 | 0 | 0.56 / 11.3 | 99.9% | +0.1 |
| 3 | 100.0% | 100.0% | 100.0% | 35 / 35 | 39.6% | 0.0% | 10 | 0 | 0.60 / 9.5 | 99.7% | +0.3 |
| 4 | 100.0% | 100.0% | 100.0% | 35 / 35 | 41.4% | 0.0% | 12 | 0 | 0.57 / 10.2 | 100.0% | +0.0 |
| 5 | 99.5% | 100.0% | 99.2% | 35 / 35 | 39.3% | 1.3% | 13 | 0 | 0.60 / 9.9 | 99.8% | -0.3 |
| 6 | 100.0% | 100.0% | 100.0% | 35 / 35 | 42.0% | 0.0% | 13 | 0 | 0.60 / 9.2 | 100.0% | +0.0 |
| 7 | 100.0% | 100.0% | 100.0% | 35 / 35 | 36.4% | 0.0% | 15 | 0 | 0.64 / 8.9 | 100.0% | +0.0 |
| 8 | 100.0% | 100.0% | 100.0% | 35 / 35 | 39.9% | 0.0% | 10 | 0 | 0.59 / 9.0 | 100.0% | +0.0 |
| 9 | 100.0% | 100.0% | 100.0% | 35 / 35 | 42.4% | 0.0% | 13 | 0 | 0.60 / 9.5 | 100.0% | +0.0 |
| 10 | 100.0% | 100.0% | 100.0% | 35 / 35 | 42.7% | 0.0% | 12 | 0 | 0.59 / 9.5 | 100.0% | +0.0 |
| 11 | 100.0% | 100.0% | 100.0% | 35 / 35 | 36.4% | 0.0% | 11 | 0 | 0.60 / 9.6 | 100.0% | +0.0 |
| 12 | 100.0% | 100.0% | 100.0% | 35 / 35 | 36.4% | 0.0% | 11 | 0 | 0.62 / 8.4 | 100.0% | +0.0 |
| 13 | 100.0% | 100.0% | 100.0% | 35 / 35 | 37.2% | 0.0% | 9 | 0 | 0.52 / 8.6 | 100.0% | +0.0 |
| 14 | 100.0% | 100.0% | 100.0% | 35 / 35 | 42.4% | 0.0% | 11 | 0 | 0.48 / 9.9 | 100.0% | +0.0 |
| 15 | 96.9% | 97.1% | 96.7% | 34 / 35 | 32.3% | 3.1% | 11 | 0 | 0.66 / 9.8 | 99.7% | -2.8 |
| 16 | 100.0% | 100.0% | 100.0% | 35 / 35 | 39.3% | 0.0% | 10 | 0 | 0.55 / 9.3 | 100.0% | +0.0 |

Mean score share 99.8% ± 0.4, baseline 99.9% ± 0.1, paired diff -0.2 ± 0.4.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 184 over 16 battles (11.5 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | weak | 99.8% ± 0.4 | 99.8% ± 0.4 | 99.7% ± 0.5 | 559 / 560 | 39.0% ± 1.5 | 0.4% ± 0.5 | 184 | 0 | 0.66 / 11.3 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 16 | 11 | 1490 | 0 | 0.33 | 0 | 0 | 0 |

11 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 1844 | 8 | 1832 | 1831 (99.3%) | 13 (0.7%) | 1 (0.1%) | 7 | 44 | 95 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 8980 | 106 (1.2%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 650 | 422 | 400 | 268 | 90.2 / 0.3 | 5717 | 1618 | 207 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 0.4% | 184 | 61 | 3 | 3.3 | 106 / 106 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| RobotMarco.MarcoV 0.1 | RobotMarco.MarcoV | 1 | 35 | 300 | 0.0% | 0.0% ± 2.6 | 28.0% | 66.2% / 61.5% | 65.9% | 0 / 0 | T0/M? | 100% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
