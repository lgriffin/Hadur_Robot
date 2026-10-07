# robar.nano.MosquitoPM 1.0 (lower) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 86.5% | 100.0% | 72.9% | 35 / 35 | 20.8% | 5.5% | 12 | 0 | 0.82 / 16.6 | 80.6% | +5.9 |
| 2 | 83.0% | 94.3% | 71.5% | 33 / 35 | 19.2% | 5.6% | 13 | 0 | 0.86 / 15.5 | 83.1% | -0.1 |
| 3 | 86.9% | 100.0% | 73.5% | 35 / 35 | 18.1% | 6.2% | 9 | 0 | 0.80 / 11.8 | 83.5% | +3.4 |
| 4 | 78.8% | 91.4% | 67.3% | 32 / 35 | 19.3% | 8.0% | 12 | 0 | 0.83 / 11.7 | 80.7% | -1.9 |
| 5 | 84.3% | 97.1% | 71.7% | 34 / 35 | 18.9% | 6.6% | 13 | 0 | 0.84 / 12.5 | 82.2% | +2.1 |
| 6 | 88.1% | 100.0% | 74.7% | 35 / 35 | 18.3% | 5.3% | 13 | 0 | 0.70 / 16.6 | 83.0% | +5.1 |
| 7 | 85.2% | 100.0% | 70.2% | 35 / 35 | 18.9% | 6.2% | 11 | 0 | 0.84 / 12.6 | 82.7% | +2.5 |
| 8 | 86.7% | 97.1% | 75.8% | 34 / 35 | 18.8% | 5.2% | 9 | 0 | 0.79 / 13.9 | 81.2% | +5.5 |
| 9 | 83.7% | 94.3% | 72.2% | 33 / 35 | 18.5% | 6.0% | 9 | 0 | 0.79 / 12.6 | 83.4% | +0.3 |
| 10 | 85.0% | 94.3% | 75.2% | 33 / 35 | 20.4% | 5.1% | 12 | 0 | 0.79 / 11.6 | 83.6% | +1.4 |
| 11 | 85.2% | 100.0% | 70.5% | 35 / 35 | 18.6% | 6.7% | 12 | 0 | 0.87 / 12.8 | 81.2% | +4.0 |
| 12 | 79.6% | 94.3% | 65.9% | 33 / 35 | 19.8% | 14.0% | 18 | 0 | 0.93 / 15.6 | 81.0% | -1.4 |
| 13 | 84.9% | 97.1% | 72.6% | 34 / 35 | 19.3% | 6.1% | 11 | 0 | 0.82 / 17.7 | 80.6% | +4.3 |
| 14 | 86.9% | 100.0% | 73.2% | 35 / 35 | 19.6% | 5.8% | 12 | 0 | 0.92 / 16.7 | 87.3% | -0.4 |
| 15 | 81.9% | 94.3% | 69.6% | 33 / 35 | 18.0% | 7.0% | 12 | 0 | 0.76 / 11.5 | 86.5% | -4.6 |
| 16 | 81.7% | 94.3% | 69.1% | 33 / 35 | 18.4% | 6.8% | 10 | 0 | 0.85 / 16.2 | 85.7% | -4.0 |

Mean score share 84.3% ± 1.4, baseline 82.9% ± 1.1, paired diff +1.4 ± 1.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 188 over 16 battles (11.8 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | lower | 84.3% ± 1.4 | 96.8% ± 1.6 | 71.6% ± 1.5 | 542 / 560 | 19.1% ± 0.4 | 6.6% ± 1.1 | 188 | 0 | 0.93 / 17.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 16 | 14 | 574 | 0 | 0.34 | 0 | 0 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 12403 | 41 | 12408 | 12351 (99.6%) | 52 (0.4%) | 57 (0.5%) | 1527 | 283 | 59 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 13285 | 855 (6.4%) | 4647 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 650 | 446 | 423 | 367 | 49.0 / 19.5 | 5454 | 9320 | 5006 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 6.6% | 188 | 2189 | 3 | 22.2 | 852 / 855 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | robar.nano.MosquitoPM | 1 | 35 | 316 | 8.1% | 7.9% ± 2.0 | 16.4% | 37.3% / 37.4% | 15.2% | 0 / 0 | T3/M? | 80% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
