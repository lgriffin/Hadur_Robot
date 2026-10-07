# dsekercioglu.mega.WhiteFang 2.8.1 (rumble-17) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 72.8% | 88.2% | 55.1% | 31 / 35 | 10.1% | 7.0% | 19 | 0 | 1.14 / 16.3 | 69.9% | +2.9 |
| 2 | 63.6% | 77.1% | 50.0% | 27 / 35 | 11.0% | 8.3% | 19 | 0 | 1.18 / 14.3 | 75.4% | -11.8 |
| 3 | 64.7% | 80.0% | 48.7% | 28 / 35 | 10.4% | 8.7% | 17 | 0 | 1.18 / 15.8 | 73.8% | -9.1 |
| 4 | 64.6% | 77.1% | 50.7% | 27 / 35 | 10.9% | 7.9% | 19 | 0 | 1.18 / 16.6 | 67.2% | -2.6 |
| 5 | 69.7% | 88.6% | 48.0% | 31 / 35 | 10.8% | 8.1% | 18 | 0 | 1.24 / 15.3 | 60.7% | +9.0 |
| 6 | 68.1% | 82.9% | 51.3% | 29 / 35 | 10.7% | 7.7% | 14 | 0 | 1.17 / 16.2 | 73.0% | -4.9 |
| 7 | 66.8% | 80.0% | 51.7% | 28 / 35 | 10.8% | 7.1% | 7 | 0 | 1.13 / 14.0 | 64.6% | +2.3 |
| 8 | 75.1% | 94.3% | 53.4% | 33 / 35 | 11.2% | 7.6% | 15 | 0 | 1.13 / 16.6 | 76.6% | -1.5 |
| 9 | 68.0% | 79.4% | 55.9% | 28 / 35 | 11.4% | 6.6% | 13 | 0 | 1.10 / 14.6 | 75.7% | -7.8 |
| 10 | 67.1% | 80.0% | 53.6% | 28 / 35 | 11.0% | 7.3% | 13 | 0 | 1.15 / 16.1 | 78.8% | -11.7 |
| 11 | 69.7% | 85.7% | 51.2% | 30 / 35 | 11.3% | 8.0% | 11 | 0 | 1.16 / 17.1 | 70.8% | -1.2 |
| 12 | 65.0% | 77.1% | 52.6% | 27 / 35 | 11.3% | 7.9% | 10 | 0 | 1.16 / 16.5 | 67.7% | -2.6 |
| 13 | 76.6% | 91.4% | 60.5% | 32 / 35 | 10.9% | 7.1% | 16 | 0 | 1.14 / 18.5 | 76.1% | +0.6 |
| 14 | 76.3% | 94.3% | 55.9% | 33 / 35 | 11.2% | 7.6% | 16 | 0 | 1.18 / 17.5 | 79.2% | -2.9 |
| 15 | 74.9% | 94.3% | 53.9% | 33 / 35 | 10.9% | 7.3% | 16 | 0 | 1.19 / 25.5 | 73.8% | +1.1 |
| 16 | 66.8% | 80.0% | 53.8% | 28 / 35 | 10.8% | 8.0% | 18 | 0 | 1.15 / 18.5 | 73.8% | -7.0 |
| 17 | 73.1% | 88.6% | 55.3% | 31 / 35 | 11.0% | 8.1% | 12 | 0 | 1.20 / 15.8 | 69.5% | +3.5 |
| 18 | 66.1% | 77.1% | 53.5% | 27 / 35 | 10.6% | 7.3% | 12 | 0 | 1.11 / 36.2 | 74.9% | -8.8 |
| 19 | 60.2% | 71.4% | 49.3% | 25 / 35 | 11.2% | 9.1% | 14 | 0 | 1.21 / 17.1 | 78.3% | -18.1 |
| 20 | 59.6% | 71.4% | 46.6% | 25 / 35 | 10.6% | 7.8% | 19 | 0 | 1.22 / 19.1 | 73.8% | -14.1 |

Mean score share 68.4% ± 2.3, baseline 72.7% ± 2.3, paired diff -4.2 ± 3.2.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 298 over 20 battles (14.9 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | rumble-17 | 68.4% ± 2.3 | 83.0% ± 3.4 | 52.6% ± 1.5 | 581 / 700 | 10.9% ± 0.2 | 7.7% ± 0.3 | 298 | 0 | 1.24 / 36.2 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | 20 | 13 | 831 | 0 | 0.43 | 5 | 4 | 0 |

13 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | 55092 | 45 | 55025 | 55025 (99.9%) | 67 (0.1%) | 0 (0.0%) | 4328 | 465 | 179 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | 62377 | 5752 (9.2%) | 57370 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 463 | 636 | 1116 | 31.3 / 28.2 | 1205 | 47241 | 670 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | 7.7% | 298 | 1889 | 3 | 77.9 | 5742 / 5752 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.WhiteFang 2.8.1 | dsekercioglu.mega.WhiteFang | 1 | 35 | 344 | 8.2% | 6.5% ± 0.9 | 10.6% | 22.1% / 22.0% | 13.5% | 0 / 0 | T2/M1 | 60% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
