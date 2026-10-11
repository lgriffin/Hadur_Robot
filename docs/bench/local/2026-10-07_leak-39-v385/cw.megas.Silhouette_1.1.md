# cw.megas.Silhouette 1.1 (mid) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 75.5% | 88.6% | 64.6% | 31 / 35 | 18.1% | 9.3% | 10 | 0 | 0.91 / 12.8 | 70.5% | +4.9 |
| 2 | 76.9% | 88.6% | 65.7% | 31 / 35 | 15.3% | 6.7% | 9 | 0 | 0.85 / 17.3 | 78.5% | -1.6 |
| 3 | 72.9% | 85.7% | 60.6% | 30 / 35 | 15.2% | 7.8% | 4 | 0 | 0.97 / 12.3 | 69.0% | +4.0 |
| 4 | 75.0% | 88.6% | 61.3% | 31 / 35 | 14.4% | 6.9% | 11 | 0 | 0.89 / 13.0 | 74.8% | +0.2 |
| 5 | 73.1% | 88.6% | 58.9% | 31 / 35 | 14.8% | 8.9% | 15 | 0 | 0.91 / 13.9 | 77.7% | -4.6 |
| 6 | 70.7% | 82.9% | 59.1% | 29 / 35 | 15.2% | 7.6% | 12 | 0 | 0.96 / 13.6 | 77.3% | -6.6 |
| 7 | 75.7% | 88.6% | 63.8% | 31 / 35 | 15.8% | 7.3% | 5 | 0 | 0.92 / 13.4 | 71.3% | +4.3 |
| 8 | 79.0% | 97.1% | 61.7% | 34 / 35 | 13.9% | 7.6% | 9 | 0 | 0.93 / 15.8 | 78.3% | +0.8 |
| 9 | 79.2% | 97.1% | 62.0% | 34 / 35 | 14.0% | 7.5% | 12 | 0 | 0.90 / 13.7 | 74.9% | +4.3 |
| 10 | 75.0% | 91.4% | 60.9% | 32 / 35 | 15.2% | 8.1% | 5 | 0 | 0.94 / 16.0 | 67.7% | +7.2 |
| 11 | 73.2% | 85.7% | 61.7% | 30 / 35 | 15.7% | 8.5% | 8 | 0 | 0.89 / 14.1 | 72.4% | +0.8 |
| 12 | 62.5% | 74.3% | 52.3% | 26 / 35 | 15.4% | 9.1% | 10 | 0 | 0.98 / 14.9 | 74.4% | -11.9 |
| 13 | 59.1% | 65.7% | 53.9% | 23 / 35 | 15.6% | 8.8% | 10 | 0 | 0.97 / 14.0 | 60.0% | -0.9 |
| 14 | 70.7% | 82.9% | 59.1% | 29 / 35 | 13.9% | 7.2% | 13 | 0 | 0.98 / 13.5 | 78.0% | -7.3 |
| 15 | 62.6% | 73.5% | 52.9% | 26 / 35 | 15.3% | 8.1% | 6 | 0 | 1.04 / 16.7 | 69.5% | -6.9 |
| 16 | 72.8% | 85.7% | 61.0% | 30 / 35 | 16.4% | 7.7% | 9 | 0 | 0.91 / 13.2 | 72.2% | +0.7 |

Mean score share 72.1% ± 3.1, baseline 72.9% ± 2.6, paired diff -0.8 ± 2.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 148 over 16 battles (9.3 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | mid | 72.1% ± 3.1 | 85.3% ± 4.4 | 60.0% ± 2.1 | 478 / 560 | 15.3% ± 0.6 | 7.9% ± 0.4 | 148 | 0 | 1.04 / 17.3 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | 16 | 11 | 0 | 0 | 0.26 | 5 | 5 | 0 |

11 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | 17851 | 37 | 17851 | 17850 (100.0%) | 1 (0.0%) | 1 (0.0%) | 614 | 258 | 76 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| cw.megas.Silhouette 1.1 | 19175 | 1609 (8.4%) | 14283 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | 650 | 402 | 606 | 506 | 44.1 / 29.5 | 3602 | 7846 | 4472 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | 7.9% | 148 | 215 | 3 | 31.4 | 1609 / 1609 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | cw.megas.Silhouette | 1 | 35 | 308 | 9.1% | 7.3% ± 1.7 | 15.1% | 24.7% / 25.5% | 10.0% | 0 / 0 | T3/M1 | 71% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
