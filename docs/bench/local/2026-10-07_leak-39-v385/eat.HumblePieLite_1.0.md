# eat.HumblePieLite 1.0 (lower) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 92.4% | 100.0% | 85.8% | 35 / 35 | 35.7% | 6.9% | 12 | 0 | 0.64 / 9.1 | 94.0% | -1.6 |
| 2 | 90.9% | 100.0% | 83.3% | 35 / 35 | 36.3% | 8.2% | 12 | 0 | 0.68 / 8.7 | 92.3% | -1.4 |
| 3 | 92.6% | 100.0% | 86.3% | 35 / 35 | 36.6% | 5.9% | 9 | 0 | 0.68 / 9.9 | 91.7% | +0.9 |
| 4 | 88.8% | 100.0% | 80.1% | 35 / 35 | 37.2% | 10.1% | 13 | 0 | 0.69 / 8.3 | 92.9% | -4.1 |
| 5 | 92.4% | 100.0% | 85.8% | 35 / 35 | 36.6% | 6.5% | 11 | 0 | 0.71 / 9.9 | 94.2% | -1.8 |
| 6 | 90.5% | 100.0% | 82.5% | 35 / 35 | 34.0% | 7.9% | 13 | 0 | 0.69 / 8.6 | 91.7% | -1.2 |
| 7 | 91.6% | 100.0% | 84.5% | 35 / 35 | 36.4% | 6.9% | 13 | 0 | 0.67 / 8.5 | 91.3% | +0.3 |
| 8 | 92.4% | 100.0% | 85.9% | 35 / 35 | 37.2% | 6.8% | 8 | 0 | 0.73 / 9.9 | 91.7% | +0.7 |
| 9 | 92.6% | 100.0% | 86.2% | 35 / 35 | 37.0% | 7.0% | 10 | 0 | 0.68 / 10.4 | 61.1% | +31.5 |
| 10 | 93.4% | 100.0% | 87.6% | 35 / 35 | 36.8% | 5.7% | 12 | 0 | 0.68 / 9.3 | 92.4% | +1.0 |
| 11 | 94.2% | 100.0% | 89.0% | 35 / 35 | 37.0% | 5.1% | 8 | 0 | 0.68 / 8.6 | 94.5% | -0.3 |
| 12 | 92.4% | 100.0% | 85.8% | 35 / 35 | 37.0% | 6.6% | 11 | 0 | 0.63 / 9.1 | 91.9% | +0.5 |
| 13 | 91.8% | 100.0% | 84.9% | 35 / 35 | 34.8% | 7.4% | 12 | 0 | 0.69 / 9.4 | 91.4% | +0.4 |
| 14 | 81.3% | 91.4% | 72.7% | 32 / 35 | 28.2% | 6.6% | 13 | 0 | 0.61 / 9.6 | 93.5% | -12.1 |
| 15 | 92.0% | 100.0% | 85.2% | 35 / 35 | 38.9% | 7.2% | 12 | 0 | 0.63 / 8.4 | 91.9% | +0.1 |
| 16 | 89.8% | 100.0% | 81.7% | 35 / 35 | 39.1% | 9.7% | 12 | 0 | 0.68 / 8.7 | 90.6% | -0.8 |

Mean score share 91.2% ± 1.6, baseline 90.4% ± 4.2, paired diff +0.8 ± 4.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 181 over 16 battles (11.3 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | lower | 91.2% ± 1.6 | 99.5% ± 1.1 | 84.2% ± 2.0 | 557 / 560 | 36.2% ± 1.3 | 7.2% ± 0.7 | 181 | 0 | 0.73 / 10.4 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 16 | 13 | 894 | 0 | 0.32 | 0 | 0 | 0 |

13 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 6462 | 38 | 6413 | 6412 (99.2%) | 50 (0.8%) | 1 (0.0%) | 29 | 172 | 48 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| eat.HumblePieLite 1.0 | 7194 | 350 (4.9%) | 43 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 650 | 493 | 400 | 231 | 74.0 / 13.9 | 5424 | 4783 | 132 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 7.2% | 181 | 67 | 3 | 10.9 | 347 / 350 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | eat.HumblePieLite | 1 | 35 | 300 | 13.4% | 16.2% ± 3.8 | 27.3% | 35.6% / 31.6% | 0.5% | 0 / 0 | T?/M? | 86% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
