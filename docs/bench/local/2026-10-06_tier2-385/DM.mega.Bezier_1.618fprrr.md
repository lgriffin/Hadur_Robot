# DM.mega.Bezier 1.618fprrr (mid) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 83.7% | 100.0% | 66.8% | 35 / 35 | 12.1% | 7.2% | 31 | 0 | 2.19 / 13.7 | 68.5% | +15.2 |
| 2 | 73.1% | 88.6% | 56.4% | 31 / 35 | 11.0% | 7.6% | 24 | 0 | 2.16 / 13.6 | 93.8% | -20.7 |
| 3 | 64.9% | 80.0% | 48.7% | 28 / 35 | 10.5% | 8.0% | 27 | 0 | 2.13 / 12.6 | 75.7% | -10.8 |
| 4 | 77.5% | 91.4% | 61.6% | 32 / 35 | 11.4% | 6.2% | 23 | 0 | 2.15 / 14.1 | 66.6% | +10.9 |
| 5 | 70.8% | 82.9% | 57.3% | 29 / 35 | 10.9% | 7.4% | 30 | 0 | 2.16 / 13.0 | 70.3% | +0.5 |
| 6 | 83.0% | 94.3% | 70.7% | 33 / 35 | 18.2% | 5.6% | 20 | 0 | 2.33 / 173.5 | 71.3% | +11.7 |
| 7 | 78.2% | 97.1% | 56.7% | 34 / 35 | 11.4% | 7.1% | 26 | 0 | 2.20 / 13.1 | 73.0% | +5.3 |
| 8 | 74.6% | 94.3% | 53.0% | 33 / 35 | 11.4% | 7.9% | 18 | 0 | 2.13 / 13.9 | 80.0% | -5.4 |
| 9 | 71.8% | 88.6% | 52.3% | 31 / 35 | 10.9% | 7.4% | 28 | 0 | 2.10 / 12.6 | 75.2% | -3.4 |
| 10 | 79.6% | 97.1% | 60.4% | 34 / 35 | 11.0% | 7.0% | 27 | 0 | 2.06 / 13.3 | 79.0% | +0.6 |
| 11 | 75.3% | 88.6% | 60.4% | 31 / 35 | 11.6% | 6.7% | 10 | 0 | 2.16 / 12.2 | 86.0% | -10.6 |
| 12 | 67.9% | 80.0% | 54.7% | 28 / 35 | 10.8% | 7.6% | 20 | 0 | 2.12 / 16.0 | 73.0% | -5.2 |
| 13 | 68.4% | 82.9% | 51.2% | 29 / 35 | 10.5% | 7.3% | 28 | 0 | 2.08 / 16.4 | 69.8% | -1.4 |
| 14 | 69.8% | 88.6% | 49.8% | 31 / 35 | 11.1% | 7.6% | 27 | 0 | 2.08 / 17.0 | 68.3% | +1.5 |
| 15 | 84.2% | 88.6% | 79.7% | 31 / 35 | 32.2% | 4.2% | 12 | 0 | 3.01 / 774.4 | 78.9% | +5.2 |
| 16 | 80.2% | 97.1% | 61.0% | 34 / 35 | 11.4% | 6.8% | 24 | 0 | 2.16 / 16.1 | 72.5% | +7.7 |
| 17 | 73.8% | 88.6% | 58.8% | 31 / 35 | 11.9% | 7.6% | 23 | 0 | 2.15 / 17.0 | 76.3% | -2.4 |
| 18 | 69.0% | 80.0% | 56.9% | 28 / 35 | 11.2% | 7.3% | 24 | 0 | 2.15 / 17.8 | 75.9% | -6.9 |
| 19 | 65.0% | 77.1% | 52.1% | 27 / 35 | 11.0% | 7.4% | 21 | 0 | 2.16 / 13.6 | 68.4% | -3.3 |
| 20 | 72.6% | 85.7% | 57.5% | 30 / 35 | 11.2% | 6.9% | 28 | 0 | 2.17 / 15.0 | 67.5% | +5.2 |

Mean score share 74.2% ± 2.8, baseline 74.5% ± 3.2, paired diff -0.3 ± 4.0.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 471 over 20 battles (23.6 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| DM.mega.Bezier 1.618fprrr | mid | 74.2% ± 2.8 | 88.6% ± 3.1 | 58.3% ± 3.5 | 620 / 700 | 12.6% ± 2.3 | 7.0% ± 0.4 | 471 | 0 | 3.01 / 774.4 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| DM.mega.Bezier 1.618fprrr | 20 | 15 | 90 | 0 | 0.67 | 4 | 4 | 0 |

15 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| DM.mega.Bezier 1.618fprrr | 52469 | 36 | 52477 | 52458 (100.0%) | 11 (0.0%) | 19 (0.0%) | 3604 | 437 | 367 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| DM.mega.Bezier 1.618fprrr | 57014 | 5388 (9.5%) | 51224 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| DM.mega.Bezier 1.618fprrr | 650 | 567 | 650 | 1019 | 36.1 / 25.4 | 882 | 44891 | 820 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| DM.mega.Bezier 1.618fprrr | 7.0% | 471 | 8395 | 3 | 74.6 | 5376 / 5388 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| DM.mega.Bezier 1.618fprrr | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| DM.mega.Bezier 1.618fprrr | DM.mega.Bezier | 1 | 35 | 302 | 7.3% | 7.3% ± 1.0 | 10.9% | 29.7% / 29.1% | 1.7% | 0 / 0 | T3/M0 | 72% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
