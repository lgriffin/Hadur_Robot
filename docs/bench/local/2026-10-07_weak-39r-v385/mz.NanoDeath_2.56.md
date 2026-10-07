# mz.NanoDeath 2.56 (nano) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 73.3% | 100.0% | 62.0% | 35 / 35 | 71.4% | 45.4% | 12 | 0 | 0.53 / 8.2 | 68.2% | +5.1 |
| 2 | 66.5% | 94.3% | 57.1% | 33 / 35 | 71.4% | 70.6% | 12 | 0 | 0.53 / 8.9 | 69.5% | -3.0 |
| 3 | 69.1% | 94.3% | 59.6% | 33 / 35 | 71.4% | 52.1% | 10 | 0 | 0.53 / 9.2 | 68.0% | +1.1 |
| 4 | 65.2% | 94.3% | 59.8% | 33 / 35 | 78.9% | 54.0% | 10 | 0 | 0.52 / 9.2 | 68.2% | -3.0 |
| 5 | 65.8% | 91.4% | 57.0% | 32 / 35 | 72.4% | 57.1% | 12 | 0 | 0.51 / 9.7 | 64.2% | +1.6 |
| 6 | 68.4% | 97.1% | 58.0% | 34 / 35 | 73.0% | 56.6% | 13 | 0 | 0.55 / 10.6 | 66.8% | +1.6 |
| 7 | 66.7% | 97.1% | 60.9% | 34 / 35 | 82.4% | 52.4% | 10 | 0 | 0.53 / 8.3 | 72.9% | -6.1 |
| 8 | 69.5% | 94.3% | 60.0% | 33 / 35 | 71.5% | 49.1% | 9 | 0 | 0.47 / 8.3 | 68.7% | +0.8 |
| 9 | 69.3% | 100.0% | 62.0% | 35 / 35 | 77.1% | 47.1% | 7 | 0 | 0.52 / 9.6 | 69.6% | -0.4 |
| 10 | 64.9% | 91.4% | 58.8% | 32 / 35 | 76.8% | 51.9% | 9 | 0 | 0.54 / 8.1 | 69.7% | -4.9 |
| 11 | 63.6% | 91.4% | 58.2% | 32 / 35 | 81.2% | 53.0% | 8 | 0 | 0.55 / 8.8 | 67.3% | -3.8 |
| 12 | 66.1% | 94.3% | 61.3% | 33 / 35 | 78.7% | 47.4% | 9 | 0 | 0.46 / 8.4 | 71.3% | -5.2 |
| 13 | 70.3% | 97.1% | 59.7% | 34 / 35 | 72.6% | 51.3% | 15 | 0 | 0.53 / 8.6 | 70.9% | -0.6 |
| 14 | 60.4% | 82.4% | 58.2% | 29 / 35 | 77.4% | 53.0% | 6 | 0 | 0.44 / 8.2 | 68.7% | -8.3 |
| 15 | 65.0% | 88.6% | 60.0% | 31 / 35 | 81.5% | 52.3% | 7 | 0 | 0.53 / 9.0 | 67.9% | -3.0 |
| 16 | 66.1% | 94.3% | 61.0% | 33 / 35 | 78.8% | 51.5% | 7 | 0 | 0.44 / 7.5 | 71.8% | -5.7 |

Mean score share 66.9% ± 1.6, baseline 69.0% ± 1.1, paired diff -2.1 ± 1.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 156 over 16 battles (9.8 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| mz.NanoDeath 2.56 | nano | 66.9% ± 1.6 | 93.9% ± 2.3 | 59.6% ± 0.8 | 526 / 560 | 76.0% ± 2.1 | 52.8% ± 3.0 | 156 | 0 | 0.55 / 10.6 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| mz.NanoDeath 2.56 | 16 | 14 | 299 | 0 | 0.28 | 1 | 1 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| mz.NanoDeath 2.56 | 4183 | 46 | 4166 | 4164 (99.5%) | 19 (0.5%) | 2 (0.0%) | 8785 | 798 | 46 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| mz.NanoDeath 2.56 | 4300 | 78 (1.8%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| mz.NanoDeath 2.56 | 650 | 152 | 650 | 141 | 95.1 / 64.9 | 3753 | 4530 | 181 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| mz.NanoDeath 2.56 | 52.8% | 156 | 47 | 3 | 7.1 | 78 / 78 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| mz.NanoDeath 2.56 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| mz.NanoDeath 2.56 | mz.NanoDeath | 1 | 35 | 282 | 55.5% | 3.9% ± 2.9 | 38.6% | 8.6% / 8.9% | 28.1% | 0 / 0 | T1/M? | 71% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
