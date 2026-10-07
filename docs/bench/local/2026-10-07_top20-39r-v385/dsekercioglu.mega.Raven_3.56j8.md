# dsekercioglu.mega.Raven 3.56j8 (rumble-8) vs hadur2.Hadur 3.9

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 55.6% | 71.4% | 40.2% | 25 / 35 | 10.1% | 9.7% | 13 | 0 | 1.20 / 14.5 | 52.2% | +3.4 |
| 2 | 52.7% | 65.7% | 38.9% | 23 / 35 | 9.1% | 8.7% | 15 | 0 | 1.17 / 18.0 | 58.8% | -6.0 |
| 3 | 61.7% | 80.0% | 42.2% | 28 / 35 | 10.2% | 9.0% | 11 | 0 | 1.19 / 14.4 | 58.1% | +3.6 |
| 4 | 57.5% | 71.4% | 42.2% | 25 / 35 | 9.9% | 8.2% | 15 | 0 | 1.19 / 14.0 | 49.0% | +8.5 |
| 5 | 49.6% | 60.0% | 39.5% | 21 / 35 | 10.2% | 9.2% | 7 | 0 | 1.19 / 21.1 | 54.5% | -4.9 |
| 6 | 53.7% | 65.7% | 41.4% | 23 / 35 | 9.8% | 8.9% | 15 | 0 | 1.18 / 15.6 | 56.8% | -3.1 |
| 7 | 56.1% | 71.4% | 39.3% | 25 / 35 | 9.1% | 9.4% | 20 | 0 | 1.19 / 54.8 | 59.6% | -3.5 |
| 8 | 50.9% | 62.9% | 38.6% | 22 / 35 | 9.8% | 9.3% | 8 | 0 | 1.21 / 14.2 | 54.3% | -3.4 |
| 9 | 61.6% | 80.0% | 43.3% | 28 / 35 | 10.5% | 9.7% | 15 | 0 | 1.24 / 15.3 | 59.7% | +1.9 |
| 10 | 46.4% | 57.1% | 36.8% | 20 / 35 | 9.7% | 9.1% | 9 | 0 | 1.22 / 13.6 | 53.3% | -6.9 |
| 11 | 58.2% | 73.5% | 43.6% | 26 / 35 | 10.2% | 9.1% | 18 | 0 | 1.20 / 24.9 | 61.9% | -3.7 |
| 12 | 56.9% | 68.6% | 45.2% | 24 / 35 | 9.8% | 8.6% | 12 | 0 | 1.19 / 15.2 | 56.6% | +0.3 |
| 13 | 52.1% | 60.0% | 44.0% | 21 / 35 | 10.0% | 8.5% | 10 | 0 | 1.19 / 161.9 | 54.5% | -2.4 |
| 14 | 47.8% | 60.0% | 35.4% | 21 / 35 | 8.4% | 9.6% | 16 | 0 | 1.17 / 121.0 | 48.6% | -0.8 |
| 15 | 59.4% | 74.3% | 42.9% | 26 / 35 | 9.5% | 8.8% | 18 | 0 | 1.20 / 96.2 | 59.4% | +0.0 |
| 16 | 49.3% | 57.1% | 41.9% | 20 / 35 | 9.9% | 8.6% | 17 | 0 | 1.22 / 14.2 | 52.3% | -3.0 |
| 17 | 62.6% | 82.9% | 42.1% | 29 / 35 | 9.8% | 9.5% | 15 | 0 | 1.22 / 14.3 | 47.7% | +14.9 |
| 18 | 53.4% | 68.6% | 38.5% | 24 / 35 | 9.1% | 9.7% | 9 | 0 | 1.22 / 14.8 | 52.2% | +1.1 |
| 19 | 57.5% | 71.4% | 43.5% | 25 / 35 | 10.5% | 9.7% | 15 | 0 | 1.20 / 16.0 | 55.6% | +1.9 |
| 20 | 61.0% | 77.1% | 45.3% | 27 / 35 | 10.7% | 8.5% | 18 | 0 | 1.18 / 30.3 | 44.9% | +16.1 |

Mean score share 55.2% ± 2.3, baseline 54.5% ± 2.1, paired diff +0.7 ± 2.9.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 276 over 20 battles (13.8 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | rumble-8 | 55.2% ± 2.3 | 69.0% ± 3.7 | 41.2% ± 1.3 | 483 / 700 | 9.8% ± 0.3 | 9.1% ± 0.2 | 276 | 0 | 1.24 / 161.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 20 | 13 | 0 | 0 | 0.39 | 7 | 7 | 0 |

13 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 60181 | 321 | 60178 | 60174 (100.0%) | 7 (0.0%) | 4 (0.0%) | 4485 | 685 | 191 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 64287 | 6459 (10.0%) | 60648 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 650 | 453 | 650 | 1138 | 24.8 / 35.3 | 600 | 56046 | 5963 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 9.1% | 276 | 2219 | 3 | 85.1 | 6437 / 6459 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | dsekercioglu.mega.Raven | 1 | 35 | 330 | 9.0% | 7.2% ± 1.0 | 10.4% | 22.0% / 21.0% | 11.6% | 0 / 0 | T3/M1 | 61% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
