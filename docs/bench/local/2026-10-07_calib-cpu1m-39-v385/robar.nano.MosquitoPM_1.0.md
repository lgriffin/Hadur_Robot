# robar.nano.MosquitoPM 1.0 (lower) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1000000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 79.8% | 91.4% | 68.7% | 32 / 35 | 19.7% | 7.6% | 12 | 0 | 0.87 / 12.1 | 82.5% | -2.7 |
| 2 | 81.6% | 97.1% | 65.2% | 34 / 35 | 16.6% | 7.5% | 18 | 0 | 0.90 / 17.4 | 81.2% | +0.4 |
| 3 | 80.6% | 94.3% | 67.8% | 33 / 35 | 18.8% | 7.3% | 9 | 0 | 0.89 / 16.2 | 86.9% | -6.3 |
| 4 | 78.9% | 91.4% | 66.5% | 32 / 35 | 18.8% | 7.8% | 13 | 0 | 0.87 / 12.0 | 83.0% | -4.1 |
| 5 | 78.5% | 85.7% | 71.3% | 30 / 35 | 19.3% | 5.2% | 11 | 0 | 0.82 / 11.9 | 85.7% | -7.2 |
| 6 | 78.9% | 91.4% | 67.2% | 32 / 35 | 20.2% | 7.8% | 12 | 0 | 0.81 / 15.0 | 87.2% | -8.3 |
| 7 | 84.3% | 97.1% | 70.8% | 34 / 35 | 17.7% | 6.2% | 12 | 0 | 0.85 / 11.5 | 77.9% | +6.4 |
| 8 | 86.1% | 97.1% | 74.9% | 34 / 35 | 21.0% | 6.1% | 11 | 0 | 0.84 / 15.1 | 85.4% | +0.7 |
| 9 | 78.9% | 91.4% | 66.1% | 32 / 35 | 16.6% | 6.1% | 12 | 0 | 0.94 / 16.6 | 81.8% | -2.9 |
| 10 | 86.9% | 100.0% | 73.7% | 35 / 35 | 19.5% | 6.4% | 13 | 0 | 0.84 / 11.1 | 81.8% | +5.1 |
| 11 | 81.5% | 94.3% | 68.1% | 33 / 35 | 17.9% | 6.0% | 12 | 0 | 0.92 / 12.4 | 83.5% | -2.0 |
| 12 | 88.6% | 97.1% | 79.6% | 34 / 35 | 21.5% | 5.6% | 14 | 0 | 0.75 / 16.2 | 77.2% | +11.4 |
| 13 | 86.3% | 97.1% | 74.9% | 34 / 35 | 18.4% | 5.2% | 10 | 0 | 0.89 / 11.8 | 79.0% | +7.3 |
| 14 | 83.5% | 97.1% | 69.3% | 34 / 35 | 17.1% | 6.1% | 13 | 0 | 0.87 / 12.6 | 81.2% | +2.3 |
| 15 | 83.5% | 97.1% | 69.3% | 34 / 35 | 17.2% | 6.8% | 14 | 0 | 0.86 / 13.3 | 81.4% | +2.1 |
| 16 | 79.0% | 91.4% | 67.1% | 32 / 35 | 17.3% | 7.2% | 10 | 0 | 0.88 / 11.6 | 83.6% | -4.6 |

Mean score share 82.3% ± 1.8, baseline 82.5% ± 1.6, paired diff -0.2 ± 3.0.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1000000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 196 over 16 battles (12.3 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | lower | 82.3% ± 1.8 | 94.5% ± 2.0 | 70.0% ± 2.1 | 529 / 560 | 18.6% ± 0.8 | 6.6% ± 0.5 | 196 | 0 | 0.94 / 17.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 16 | 858 | 11.3% | 83.8% | 0.0% | 4.9% | 524 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 16 | 13 | 894 | 0 | 0.35 | 0 | 0 | 0 |

13 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 12707 | 40 | 12691 | 12633 (99.4%) | 74 (0.6%) | 58 (0.5%) | 1589 | 280 | 60 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 13620 | 884 (6.5%) | 2888 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 650 | 462 | 484 | 374 | 48.0 / 20.5 | 5483 | 8473 | 4296 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 6.6% | 196 | 100 | 3 | 22.7 | 878 / 884 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | robar.nano.MosquitoPM | 1 | 35 | 316 | 8.7% | 8.5% ± 2.0 | 15.3% | 32.4% / 34.1% | 15.6% | 0 / 0 | T3/M? | 78% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
