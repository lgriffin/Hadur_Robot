# kc.serpent.WaveSerpent 2.11 (rumble-15) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 61.3% | 77.1% | 42.2% | 27 / 35 | 7.9% | 6.7% | 11 | 0 | 2.12 / 624.1 | 67.3% | -6.0 |
| 2 | 54.1% | 68.6% | 39.5% | 24 / 35 | 8.2% | 8.5% | 9 | 0 | 2.14 / 49.0 | 71.7% | -17.6 |
| 3 | 56.6% | 71.4% | 40.6% | 25 / 35 | 8.9% | 8.2% | 13 | 0 | 2.12 / 48.8 | 55.5% | +1.1 |
| 4 | 51.0% | 62.9% | 38.8% | 22 / 35 | 8.5% | 8.1% | 15 | 0 | 2.08 / 52.5 | 67.0% | -16.0 |
| 5 | 50.6% | 60.0% | 40.9% | 21 / 35 | 8.6% | 8.3% | 11 | 0 | 2.07 / 45.4 | 57.5% | -6.9 |
| 6 | 58.7% | 71.4% | 44.6% | 25 / 35 | 9.0% | 7.0% | 9 | 0 | 2.14 / 64.3 | 55.5% | +3.2 |
| 7 | 59.3% | 77.1% | 39.6% | 27 / 35 | 8.9% | 7.6% | 12 | 0 | 2.19 / 48.4 | 60.9% | -1.7 |
| 8 | 57.7% | 74.3% | 40.1% | 26 / 35 | 8.4% | 7.7% | 10 | 0 | 2.13 / 58.8 | 61.1% | -3.4 |
| 9 | 56.6% | 74.3% | 39.1% | 26 / 35 | 8.7% | 8.7% | 10 | 0 | 2.13 / 55.7 | 59.1% | -2.5 |
| 10 | 53.9% | 68.6% | 38.8% | 24 / 35 | 9.0% | 8.0% | 13 | 0 | 2.14 / 51.0 | 55.7% | -1.7 |
| 11 | 48.4% | 60.0% | 37.7% | 21 / 35 | 8.3% | 9.0% | 7 | 0 | 2.09 / 57.6 | 58.2% | -9.8 |
| 12 | 49.9% | 60.0% | 38.8% | 21 / 35 | 8.2% | 7.6% | 12 | 0 | 2.07 / 54.2 | 60.8% | -10.9 |
| 13 | 62.7% | 82.9% | 39.4% | 29 / 35 | 9.3% | 7.8% | 13 | 0 | 2.13 / 59.1 | 57.2% | +5.5 |
| 14 | 56.8% | 68.6% | 45.2% | 24 / 35 | 9.7% | 8.0% | 16 | 0 | 2.14 / 45.0 | 53.2% | +3.6 |
| 15 | 58.3% | 74.3% | 39.9% | 26 / 35 | 8.6% | 7.3% | 4 | 0 | 2.16 / 58.7 | 66.4% | -8.1 |
| 16 | 51.6% | 62.9% | 37.5% | 22 / 35 | 7.9% | 6.6% | 4 | 0 | 2.11 / 49.9 | 54.5% | -2.9 |
| 17 | 54.5% | 68.6% | 39.9% | 24 / 35 | 8.6% | 8.5% | 12 | 0 | 2.12 / 54.1 | 60.6% | -6.1 |
| 18 | 58.7% | 77.1% | 38.3% | 27 / 35 | 8.9% | 7.8% | 15 | 0 | 2.17 / 57.6 | 53.8% | +4.9 |
| 19 | 55.6% | 71.4% | 38.4% | 25 / 35 | 9.0% | 27.4% | 13 | 0 | 2.11 / 52.6 | 55.4% | +0.2 |
| 20 | 59.9% | 74.3% | 43.4% | 26 / 35 | 8.9% | 6.9% | 11 | 0 | 2.10 / 48.1 | 61.3% | -1.4 |

Mean score share 55.8% ± 1.9, baseline 59.6% ± 2.4, paired diff -3.8 ± 3.0.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 220 over 20 battles (11.0 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.serpent.WaveSerpent 2.11 | rumble-15 | 55.8% ± 1.9 | 70.3% ± 3.0 | 40.1% ± 1.0 | 492 / 700 | 8.7% ± 0.2 | 8.8% ± 2.1 | 220 | 0 | 2.19 / 624.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.serpent.WaveSerpent 2.11 | 20 | 15 | 530 | 0 | 0.31 | 3 | 3 | 0 |

15 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.serpent.WaveSerpent 2.11 | 38372 | 24 | 38337 | 38334 (99.9%) | 38 (0.1%) | 3 (0.0%) | 2736 | 279 | 90 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.serpent.WaveSerpent 2.11 | 49816 | 3672 (7.4%) | 40966 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.serpent.WaveSerpent 2.11 | 650 | 478 | 650 | 901 | 22.6 / 33.6 | 381 | 28223 | 4 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.serpent.WaveSerpent 2.11 | 8.8% | 220 | 2332 | 3 | 54.4 | 3669 / 3672 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.serpent.WaveSerpent 2.11 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kc.serpent.WaveSerpent 2.11 | kc.serpent.WaveSerpent | 1 | 35 | 322 | 7.6% | 6.6% ± 1.2 | 9.1% | 21.3% / 21.6% | 11.2% | 0 / 0 | T2/M1 | 60% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
