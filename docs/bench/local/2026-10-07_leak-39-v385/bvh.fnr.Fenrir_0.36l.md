# bvh.fnr.Fenrir 0.36l (lower) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 75.3% | 91.4% | 60.1% | 32 / 35 | 14.9% | 7.8% | 16 | 0 | 1.02 / 13.8 | 75.8% | -0.5 |
| 2 | 77.2% | 88.6% | 66.8% | 31 / 35 | 16.1% | 8.0% | 11 | 0 | 0.94 / 12.5 | 72.1% | +5.1 |
| 3 | 74.7% | 88.6% | 61.9% | 31 / 35 | 15.9% | 7.7% | 14 | 0 | 1.03 / 15.2 | 72.0% | +2.7 |
| 4 | 75.9% | 88.6% | 63.8% | 31 / 35 | 15.1% | 7.3% | 19 | 0 | 0.97 / 12.9 | 83.9% | -7.9 |
| 5 | 73.8% | 88.6% | 60.5% | 31 / 35 | 15.5% | 8.3% | 17 | 0 | 1.01 / 13.1 | 80.4% | -6.6 |
| 6 | 82.4% | 94.3% | 70.1% | 33 / 35 | 16.2% | 5.8% | 18 | 0 | 0.96 / 13.0 | 72.7% | +9.6 |
| 7 | 73.8% | 85.7% | 62.4% | 30 / 35 | 13.7% | 7.0% | 14 | 0 | 1.02 / 13.5 | 68.4% | +5.4 |
| 8 | 77.9% | 91.4% | 65.5% | 32 / 35 | 15.7% | 7.9% | 19 | 0 | 1.00 / 12.3 | 79.1% | -1.2 |
| 9 | 72.2% | 85.7% | 61.1% | 30 / 35 | 17.2% | 10.4% | 14 | 0 | 0.92 / 13.9 | 71.7% | +0.5 |
| 10 | 78.4% | 94.3% | 64.1% | 33 / 35 | 15.6% | 8.7% | 18 | 0 | 0.96 / 13.0 | 81.5% | -3.1 |
| 11 | 80.2% | 94.3% | 66.2% | 33 / 35 | 14.5% | 7.0% | 17 | 0 | 0.94 / 16.9 | 81.3% | -1.1 |
| 12 | 75.3% | 88.6% | 62.7% | 31 / 35 | 14.1% | 7.1% | 17 | 0 | 1.00 / 13.5 | 77.1% | -1.8 |
| 13 | 75.3% | 91.4% | 59.1% | 32 / 35 | 13.2% | 6.6% | 19 | 0 | 1.01 / 14.4 | 82.6% | -7.3 |
| 14 | 76.5% | 91.4% | 62.9% | 32 / 35 | 14.9% | 8.1% | 17 | 0 | 0.99 / 12.8 | 79.5% | -3.1 |
| 15 | 74.2% | 88.6% | 59.2% | 31 / 35 | 14.3% | 7.0% | 17 | 0 | 1.01 / 13.2 | 79.7% | -5.5 |
| 16 | 76.8% | 85.7% | 68.2% | 30 / 35 | 16.6% | 6.4% | 12 | 0 | 0.94 / 12.4 | 76.0% | +0.9 |

Mean score share 76.3% ± 1.4, baseline 77.1% ± 2.5, paired diff -0.9 ± 2.6.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 259 over 16 battles (16.2 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | lower | 76.3% ± 1.4 | 89.8% ± 1.6 | 63.4% ± 1.7 | 503 / 560 | 15.2% ± 0.6 | 7.6% ± 0.6 | 259 | 0 | 1.03 / 16.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | 16 | 14 | 596 | 0 | 0.46 | 0 | 0 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | 18824 | 155 | 18785 | 18783 (99.8%) | 41 (0.2%) | 2 (0.0%) | 787 | 282 | 120 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | 21926 | 1496 (6.8%) | 11029 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | 650 | 469 | 591 | 553 | 45.9 / 26.5 | 3072 | 8198 | 163 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | 7.6% | 259 | 3594 | 3 | 33.5 | 1492 / 1496 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | bvh.fnr.Fenrir | 1 | 35 | 292 | 7.8% | 7.2% ± 1.6 | 14.4% | 27.1% / 23.7% | 2.9% | 0 / 0 | T3/M0 | 76% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
