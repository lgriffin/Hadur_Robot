# ntw.Sighup 1.5 (weak) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 88.5% | 100.0% | 78.1% | 35 / 35 | 32.2% | 9.7% | 15 | 0 | 0.90 / 15.2 | 89.1% | -0.6 |
| 2 | 95.9% | 100.0% | 91.1% | 35 / 35 | 27.0% | 2.6% | 14 | 0 | 0.78 / 9.8 | 90.4% | +5.5 |
| 3 | 89.4% | 100.0% | 81.4% | 35 / 35 | 30.5% | 9.8% | 12 | 0 | 0.84 / 11.3 | 94.9% | -5.5 |
| 4 | 90.6% | 100.0% | 81.9% | 35 / 35 | 35.7% | 8.3% | 13 | 0 | 0.76 / 12.0 | 93.2% | -2.6 |
| 5 | 91.0% | 100.0% | 82.8% | 35 / 35 | 28.5% | 7.9% | 14 | 0 | 0.81 / 14.9 | 90.4% | +0.6 |
| 6 | 89.4% | 100.0% | 79.1% | 35 / 35 | 27.8% | 16.9% | 17 | 0 | 0.92 / 13.3 | 90.2% | -0.8 |
| 7 | 91.3% | 100.0% | 84.2% | 35 / 35 | 28.9% | 7.8% | 15 | 0 | 0.82 / 10.9 | 94.4% | -3.1 |
| 8 | 90.1% | 100.0% | 82.0% | 35 / 35 | 33.8% | 8.7% | 11 | 0 | 0.80 / 10.9 | 90.1% | +0.1 |
| 9 | 91.5% | 100.0% | 83.1% | 35 / 35 | 26.5% | 7.5% | 13 | 0 | 0.89 / 11.4 | 91.3% | +0.3 |
| 10 | 88.2% | 100.0% | 77.5% | 35 / 35 | 28.9% | 10.7% | 15 | 0 | 0.93 / 64.2 | 92.4% | -4.2 |
| 11 | 89.9% | 100.0% | 81.1% | 35 / 35 | 32.3% | 10.4% | 16 | 0 | 0.84 / 12.0 | 92.2% | -2.2 |
| 12 | 88.4% | 100.0% | 78.7% | 35 / 35 | 25.7% | 12.7% | 16 | 0 | 0.85 / 14.6 | 91.8% | -3.4 |
| 13 | 90.2% | 97.1% | 83.3% | 34 / 35 | 29.8% | 6.7% | 17 | 0 | 0.88 / 12.7 | 92.7% | -2.5 |
| 14 | 89.8% | 100.0% | 80.6% | 35 / 35 | 32.4% | 9.5% | 15 | 0 | 0.79 / 9.8 | 89.8% | +0.0 |
| 15 | 86.0% | 94.3% | 78.1% | 33 / 35 | 27.9% | 10.3% | 9 | 0 | 0.77 / 12.8 | 89.2% | -3.2 |
| 16 | 86.2% | 97.1% | 76.0% | 34 / 35 | 28.7% | 24.3% | 17 | 0 | 0.87 / 14.8 | 92.1% | -5.9 |

Mean score share 89.8% ± 1.2, baseline 91.5% ± 0.9, paired diff -1.7 ± 1.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 229 over 16 battles (14.3 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | weak | 89.8% ± 1.2 | 99.3% ± 0.9 | 81.2% ± 1.9 | 556 / 560 | 29.8% ± 1.5 | 10.2% ± 2.6 | 229 | 0 | 0.93 / 64.2 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 16 | 8 | 2502 | 0 | 0.41 | 1 | 1 | 0 |

8 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 8687 | 61 | 8544 | 8508 (97.9%) | 179 (2.1%) | 36 (0.4%) | 2747 | 327 | 58 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ntw.Sighup 1.5 | 9400 | 436 (4.6%) | 841 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 650 | 354 | 400 | 277 | 60.5 / 14.2 | 5974 | 7513 | 1813 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 10.2% | 229 | 75 | 3 | 15.1 | 432 / 436 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | ntw.Sighup | 1 | 35 | 272 | 9.3% | 6.5% ± 2.1 | 17.8% | 32.3% / 28.4% | 16.7% | 0 / 0 | T2/M? | 86% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
