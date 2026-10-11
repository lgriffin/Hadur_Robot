# robar.nano.MosquitoPM 1.0 (lower) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 83.6% | 94.3% | 73.0% | 33 / 35 | 20.4% | 6.4% | 13 | 0 | 0.84 / 14.6 | 85.1% | -1.5 |
| 2 | 75.6% | 85.7% | 65.8% | 30 / 35 | 17.6% | 6.5% | 10 | 0 | 0.90 / 12.0 | 80.5% | -4.9 |
| 3 | 85.8% | 100.0% | 72.0% | 35 / 35 | 20.7% | 6.0% | 13 | 0 | 0.85 / 14.8 | 79.3% | +6.5 |
| 4 | 82.1% | 91.4% | 73.3% | 32 / 35 | 20.5% | 7.1% | 10 | 0 | 0.83 / 11.6 | 84.3% | -2.2 |
| 5 | 80.4% | 91.4% | 69.7% | 32 / 35 | 19.9% | 7.1% | 10 | 0 | 0.87 / 11.6 | 85.7% | -5.2 |
| 6 | 85.9% | 97.1% | 73.7% | 34 / 35 | 17.8% | 5.7% | 11 | 0 | 0.85 / 16.6 | 85.7% | +0.2 |
| 7 | 81.6% | 94.3% | 70.1% | 33 / 35 | 20.0% | 7.5% | 11 | 0 | 0.83 / 11.5 | 77.9% | +3.7 |
| 8 | 86.0% | 97.1% | 73.6% | 34 / 35 | 17.5% | 5.5% | 14 | 0 | 0.86 / 11.4 | 81.2% | +4.8 |
| 9 | 85.5% | 97.1% | 73.6% | 34 / 35 | 21.4% | 6.1% | 8 | 0 | 0.78 / 15.6 | 84.7% | +0.8 |
| 10 | 86.9% | 100.0% | 72.6% | 35 / 35 | 17.7% | 5.5% | 14 | 0 | 0.88 / 11.1 | 88.0% | -1.2 |
| 11 | 83.9% | 97.1% | 69.6% | 34 / 35 | 18.1% | 6.1% | 11 | 0 | 0.88 / 16.2 | 86.2% | -2.3 |
| 12 | 84.3% | 97.1% | 71.2% | 34 / 35 | 18.6% | 6.3% | 4 | 0 | 0.78 / 16.3 | 87.4% | -3.1 |
| 13 | 83.9% | 100.0% | 68.6% | 35 / 35 | 19.6% | 7.1% | 11 | 0 | 0.88 / 12.0 | 83.7% | +0.2 |
| 14 | 85.8% | 100.0% | 71.3% | 35 / 35 | 18.4% | 6.5% | 11 | 0 | 0.84 / 10.8 | 87.9% | -2.2 |
| 15 | 84.1% | 97.1% | 70.2% | 34 / 35 | 16.8% | 5.6% | 12 | 0 | 0.92 / 16.6 | 86.4% | -2.3 |
| 16 | 87.1% | 100.0% | 73.5% | 35 / 35 | 18.1% | 5.8% | 10 | 0 | 0.84 / 11.6 | 83.9% | +3.2 |

Mean score share 83.9% ± 1.5, baseline 84.2% ± 1.6, paired diff -0.3 ± 1.8.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 173 over 16 battles (10.8 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | lower | 83.9% ± 1.5 | 96.3% ± 2.1 | 71.4% ± 1.2 | 539 / 560 | 18.9% ± 0.7 | 6.3% ± 0.3 | 173 | 0 | 0.92 / 16.6 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 16 | 15 | 0 | 0 | 0.31 | 1 | 1 | 0 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 12573 | 43 | 12602 | 12538 (99.7%) | 35 (0.3%) | 64 (0.5%) | 1470 | 297 | 400 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 13417 | 855 (6.4%) | 3075 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 650 | 467 | 489 | 372 | 48.7 / 19.6 | 5240 | 9293 | 5714 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 6.3% | 173 | 151 | 3 | 22.4 | 855 / 855 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | robar.nano.MosquitoPM | 1 | 35 | 316 | 6.7% | 6.9% ± 1.9 | 15.4% | 38.1% / 39.8% | 16.4% | 0 / 0 | T2/M? | 86% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
