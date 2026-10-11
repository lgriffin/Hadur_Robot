# dsekercioglu.mega.Raven 3.56j8 (rumble-8) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 56.4% | 68.6% | 43.5% | 24 / 35 | 10.3% | 9.3% | 16 | 0 | 1.16 / 14.0 | 65.6% | -9.2 |
| 2 | 47.2% | 60.0% | 34.0% | 21 / 35 | 8.5% | 9.1% | 13 | 0 | 1.14 / 14.5 | 63.6% | -16.4 |
| 3 | 59.4% | 74.3% | 42.7% | 26 / 35 | 9.6% | 8.2% | 11 | 0 | 1.18 / 36.2 | 63.9% | -4.5 |
| 4 | 63.5% | 82.9% | 42.9% | 29 / 35 | 10.5% | 8.6% | 16 | 0 | 1.14 / 15.6 | 64.3% | -0.8 |
| 5 | 51.7% | 65.7% | 36.9% | 23 / 35 | 9.6% | 9.5% | 16 | 0 | 1.16 / 14.1 | 71.0% | -19.3 |
| 6 | 58.1% | 71.4% | 43.3% | 25 / 35 | 9.8% | 8.7% | 7 | 0 | 1.16 / 120.6 | 52.0% | +6.1 |
| 7 | 45.6% | 57.1% | 33.5% | 20 / 35 | 8.3% | 9.2% | 12 | 0 | 1.18 / 13.5 | 61.1% | -15.5 |
| 8 | 52.9% | 65.7% | 39.0% | 23 / 35 | 9.6% | 8.6% | 16 | 0 | 1.17 / 83.0 | 62.5% | -9.5 |
| 9 | 47.0% | 57.1% | 36.5% | 20 / 35 | 8.3% | 8.4% | 8 | 0 | 1.14 / 192.4 | 57.4% | -10.4 |
| 10 | 58.5% | 74.3% | 42.2% | 26 / 35 | 10.5% | 9.6% | 14 | 0 | 1.19 / 221.5 | 56.3% | +2.2 |
| 11 | 55.5% | 68.6% | 41.3% | 24 / 35 | 9.3% | 8.5% | 7 | 0 | 1.21 / 684.1 | 63.2% | -7.7 |
| 12 | 57.3% | 68.6% | 46.5% | 24 / 35 | 10.0% | 9.1% | 16 | 0 | 1.18 / 14.6 | 69.0% | -11.7 |
| 13 | 52.1% | 65.7% | 38.6% | 23 / 35 | 10.3% | 9.4% | 13 | 0 | 1.23 / 460.0 | 69.7% | -17.6 |
| 14 | 54.2% | 68.6% | 39.9% | 24 / 35 | 9.4% | 9.6% | 13 | 0 | 1.25 / 14.4 | 66.9% | -12.8 |
| 15 | 53.2% | 65.7% | 39.9% | 23 / 35 | 9.5% | 8.7% | 14 | 0 | 1.21 / 14.6 | 55.9% | -2.7 |
| 16 | 58.2% | 71.4% | 45.0% | 25 / 35 | 10.2% | 9.6% | 19 | 0 | 1.21 / 15.2 | 48.1% | +10.0 |
| 17 | 56.9% | 71.4% | 42.4% | 25 / 35 | 10.2% | 8.6% | 16 | 0 | 1.19 / 137.9 | 52.6% | +4.3 |
| 18 | 51.9% | 65.7% | 38.6% | 23 / 35 | 9.6% | 9.5% | 7 | 0 | 1.24 / 15.0 | 60.5% | -8.6 |
| 19 | 55.3% | 68.6% | 41.8% | 24 / 35 | 9.9% | 9.0% | 12 | 0 | 1.20 / 28.2 | 65.6% | -10.3 |
| 20 | 59.8% | 77.1% | 41.4% | 27 / 35 | 9.6% | 9.1% | 9 | 0 | 1.22 / 14.2 | 52.9% | +6.9 |

Mean score share 54.7% ± 2.2, baseline 61.1% ± 3.0, paired diff -6.4 ± 4.1.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 255 over 20 battles (12.8 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | rumble-8 | 54.7% ± 2.2 | 68.4% ± 2.9 | 40.5% ± 1.6 | 479 / 700 | 9.7% ± 0.3 | 9.0% ± 0.2 | 255 | 0 | 1.25 / 684.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 20 | 11 | 93 | 0 | 0.36 | 9 | 8 | 0 |

11 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 59471 | 313 | 59460 | 59456 (100.0%) | 15 (0.0%) | 4 (0.0%) | 4371 | 687 | 152 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 63448 | 6422 (10.1%) | 60200 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 650 | 452 | 650 | 1127 | 23.7 / 34.7 | 641 | 55939 | 5859 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 9.0% | 255 | 2472 | 3 | 83.9 | 6403 / 6422 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | dsekercioglu.mega.Raven | 1 | 35 | 330 | 9.4% | 7.1% ± 1.0 | 9.9% | 21.8% / 20.8% | 11.9% | 0 / 0 | T3/M1 | 60% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
