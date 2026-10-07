# dsekercioglu.mega.WhiteFang 2.8.1 (rumble-17) vs hadur2.Hadur 3.9

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 68.9% | 82.9% | 53.7% | 29 / 35 | 10.9% | 7.1% | 17 | 0 | 1.11 / 14.8 | 66.7% | +2.2 |
| 2 | 74.0% | 91.4% | 54.4% | 32 / 35 | 10.6% | 7.6% | 13 | 0 | 1.13 / 15.4 | 64.0% | +9.9 |
| 3 | 64.5% | 80.0% | 47.7% | 28 / 35 | 11.1% | 7.8% | 11 | 0 | 1.17 / 19.6 | 66.8% | -2.4 |
| 4 | 64.1% | 71.4% | 56.5% | 25 / 35 | 11.1% | 7.2% | 16 | 0 | 1.12 / 14.7 | 63.3% | +0.8 |
| 5 | 68.2% | 80.0% | 54.4% | 28 / 35 | 10.9% | 7.3% | 18 | 0 | 1.15 / 15.1 | 69.4% | -1.3 |
| 6 | 69.3% | 82.9% | 54.5% | 29 / 35 | 11.6% | 7.8% | 17 | 0 | 1.16 / 92.3 | 61.4% | +7.9 |
| 7 | 66.1% | 80.0% | 52.1% | 28 / 35 | 11.7% | 8.2% | 19 | 0 | 1.22 / 16.4 | 63.8% | +2.2 |
| 8 | 73.1% | 91.4% | 53.4% | 32 / 35 | 10.8% | 7.0% | 15 | 0 | 1.14 / 15.4 | 70.3% | +2.8 |
| 9 | 61.8% | 74.3% | 47.2% | 26 / 35 | 10.1% | 8.0% | 18 | 0 | 1.22 / 15.8 | 75.3% | -13.4 |
| 10 | 68.3% | 85.7% | 50.3% | 30 / 35 | 11.1% | 8.0% | 10 | 0 | 1.15 / 16.3 | 61.5% | +6.8 |
| 11 | 73.0% | 88.2% | 57.5% | 31 / 35 | 11.5% | 7.5% | 17 | 0 | 1.15 / 14.1 | 68.8% | +4.2 |
| 12 | 65.9% | 82.4% | 49.9% | 29 / 35 | 11.2% | 8.0% | 20 | 0 | 1.11 / 16.3 | 66.4% | -0.5 |
| 13 | 65.7% | 82.9% | 47.4% | 29 / 35 | 10.5% | 8.2% | 16 | 0 | 1.21 / 17.6 | 69.7% | -3.9 |
| 14 | 63.5% | 77.1% | 48.4% | 27 / 35 | 10.9% | 8.0% | 15 | 0 | 1.17 / 16.4 | 68.0% | -4.5 |
| 15 | 64.1% | 77.1% | 50.5% | 27 / 35 | 10.6% | 8.3% | 12 | 0 | 1.15 / 14.9 | 72.1% | -8.0 |
| 16 | 64.0% | 77.1% | 50.0% | 27 / 35 | 11.4% | 7.1% | 9 | 0 | 1.12 / 16.9 | 71.3% | -7.3 |
| 17 | 68.2% | 85.7% | 48.9% | 30 / 35 | 11.3% | 8.4% | 16 | 0 | 1.19 / 113.5 | 63.3% | +4.9 |
| 18 | 63.0% | 74.3% | 51.9% | 26 / 35 | 10.9% | 7.4% | 17 | 0 | 1.10 / 14.9 | 69.8% | -6.8 |
| 19 | 68.1% | 85.7% | 47.5% | 30 / 35 | 10.7% | 7.9% | 19 | 0 | 1.18 / 15.3 | 70.3% | -2.2 |
| 20 | 63.9% | 77.1% | 48.7% | 27 / 35 | 11.0% | 7.8% | 17 | 0 | 1.12 / 14.4 | 62.4% | +1.4 |

Mean score share 66.9% ± 1.7, baseline 67.2% ± 1.8, paired diff -0.4 ± 2.8.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 312 over 20 battles (15.6 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | rumble-17 | 66.9% ± 1.7 | 81.4% ± 2.6 | 51.2% ± 1.5 | 570 / 700 | 11.0% ± 0.2 | 7.7% ± 0.2 | 312 | 0 | 1.22 / 113.5 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | 20 | 15 | 596 | 0 | 0.45 | 3 | 3 | 0 |

15 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | 55488 | 46 | 55444 | 55440 (99.9%) | 48 (0.1%) | 4 (0.0%) | 4570 | 474 | 196 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | 63340 | 5903 (9.3%) | 60549 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 464 | 636 | 1128 | 30.6 / 29.0 | 1195 | 47416 | 738 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | 7.7% | 312 | 364 | 3 | 78.7 | 5869 / 5903 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | dsekercioglu.mega.WhiteFang | 1 | 35 | 344 | 8.1% | 6.1% ± 0.9 | 10.9% | 21.4% / 20.8% | 13.5% | 0 / 0 | T2/M1 | 64% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
