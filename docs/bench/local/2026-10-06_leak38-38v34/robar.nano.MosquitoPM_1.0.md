# robar.nano.MosquitoPM 1.0 (lower) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 79.9% | 97.1% | 62.7% | 34 / 35 | 17.3% | 6.8% | 12 | 0 | 0.98 / 11.8 | 83.7% | -3.8 |
| 2 | 88.4% | 100.0% | 76.2% | 35 / 35 | 20.3% | 5.6% | 10 | 0 | 0.90 / 12.2 | 85.5% | +2.9 |
| 3 | 84.2% | 97.1% | 70.4% | 34 / 35 | 17.5% | 5.8% | 9 | 0 | 0.90 / 11.9 | 86.3% | -2.1 |
| 4 | 83.9% | 97.1% | 68.9% | 34 / 35 | 15.7% | 5.2% | 13 | 0 | 0.95 / 11.4 | 85.2% | -1.3 |
| 5 | 82.3% | 97.1% | 67.6% | 34 / 35 | 19.6% | 7.4% | 12 | 0 | 0.92 / 15.6 | 82.2% | +0.0 |
| 6 | 84.5% | 97.1% | 71.0% | 34 / 35 | 17.4% | 5.6% | 9 | 0 | 0.88 / 16.0 | 80.0% | +4.5 |
| 7 | 84.9% | 97.1% | 73.0% | 34 / 35 | 19.9% | 6.4% | 11 | 0 | 0.90 / 11.1 | 83.7% | +1.2 |
| 8 | 80.3% | 94.3% | 66.4% | 33 / 35 | 17.9% | 6.7% | 10 | 0 | 0.96 / 12.0 | 85.1% | -4.8 |
| 9 | 85.7% | 100.0% | 72.2% | 35 / 35 | 20.6% | 7.8% | 9 | 0 | 0.91 / 25.7 | 81.5% | +4.2 |
| 10 | 82.1% | 100.0% | 64.3% | 35 / 35 | 16.3% | 7.7% | 11 | 0 | 0.97 / 11.0 | 84.2% | -2.1 |
| 11 | 86.8% | 100.0% | 72.5% | 35 / 35 | 16.7% | 5.3% | 9 | 0 | 0.93 / 11.6 | 87.1% | -0.3 |
| 12 | 82.6% | 94.3% | 70.7% | 33 / 35 | 18.3% | 6.0% | 12 | 0 | 0.93 / 11.5 | 82.3% | +0.2 |
| 13 | 85.5% | 100.0% | 70.0% | 35 / 35 | 17.3% | 6.1% | 12 | 0 | 0.95 / 16.2 | 85.2% | +0.3 |
| 14 | 87.2% | 100.0% | 74.0% | 35 / 35 | 19.6% | 5.7% | 13 | 0 | 0.92 / 9.8 | 84.1% | +3.1 |
| 15 | 72.1% | 82.9% | 61.9% | 29 / 35 | 19.0% | 7.4% | 12 | 0 | 0.96 / 10.6 | 80.0% | -7.9 |
| 16 | 86.2% | 100.0% | 71.8% | 35 / 35 | 18.2% | 5.9% | 9 | 0 | 0.90 / 16.4 | 82.2% | +3.9 |

Mean score share 83.5% ± 2.1, baseline 83.7% ± 1.1, paired diff -0.1 ± 1.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 173 over 16 battles (10.8 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | lower | 83.5% ± 2.1 | 97.1% ± 2.3 | 69.6% ± 2.2 | 544 / 560 | 18.2% ± 0.8 | 6.3% ± 0.5 | 173 | 0 | 0.98 / 25.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 16 | 16 | 0 | 0 | 0.31 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 12915 | 47 | 12958 | 12896 (99.9%) | 19 (0.1%) | 62 (0.5%) | 1645 | 306 | 57 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 13967 | 881 (6.3%) | 5117 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 650 | 474 | 486 | 381 | 47.0 / 20.6 | 4975 | 9976 | 5347 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 6.3% | 173 | 317 | 3 | 23.1 | 879 / 881 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | robar.nano.MosquitoPM | 1 | 35 | 316 | 7.0% | 7.1% ± 1.9 | 16.0% | 35.0% / 35.7% | 15.6% | 0 / 0 | T3/M? | 84% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
