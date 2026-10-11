# bvh.fnr.Fenrir 0.36l (lower) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 76.6% | 91.4% | 62.4% | 32 / 35 | 14.4% | 7.4% | 9 | 0 | 0.98 / 12.0 | 79.9% | -3.2 |
| 2 | 72.8% | 85.7% | 61.4% | 30 / 35 | 16.0% | 8.5% | 9 | 0 | 0.98 / 12.4 | 75.4% | -2.6 |
| 3 | 74.5% | 88.6% | 60.5% | 31 / 35 | 13.5% | 7.0% | 16 | 0 | 1.02 / 12.9 | 83.1% | -8.6 |
| 4 | 66.7% | 80.0% | 54.7% | 28 / 35 | 13.1% | 8.0% | 11 | 0 | 0.98 / 12.5 | 76.0% | -9.3 |
| 5 | 76.9% | 91.4% | 62.9% | 32 / 35 | 13.6% | 7.3% | 15 | 0 | 1.01 / 13.4 | 76.5% | +0.4 |
| 6 | 74.0% | 82.9% | 65.9% | 29 / 35 | 17.2% | 8.5% | 16 | 0 | 0.93 / 13.6 | 75.0% | -0.9 |
| 7 | 81.1% | 97.1% | 64.4% | 34 / 35 | 13.6% | 6.2% | 14 | 0 | 0.98 / 12.3 | 78.7% | +2.4 |
| 8 | 73.0% | 85.7% | 60.5% | 30 / 35 | 14.0% | 7.1% | 18 | 0 | 1.00 / 13.5 | 79.0% | -6.1 |
| 9 | 76.5% | 88.6% | 64.9% | 31 / 35 | 15.6% | 7.4% | 7 | 0 | 0.93 / 19.5 | 75.5% | +1.0 |
| 10 | 83.8% | 100.0% | 66.8% | 35 / 35 | 13.8% | 6.0% | 21 | 0 | 0.96 / 13.1 | 72.8% | +10.9 |
| 11 | 66.0% | 77.1% | 55.3% | 27 / 35 | 13.0% | 6.7% | 16 | 0 | 1.06 / 13.6 | 82.9% | -16.9 |
| 12 | 78.2% | 91.4% | 66.1% | 32 / 35 | 16.8% | 8.5% | 16 | 0 | 0.98 / 13.0 | 78.1% | +0.1 |
| 13 | 75.8% | 94.3% | 57.7% | 33 / 35 | 14.4% | 7.5% | 17 | 0 | 1.00 / 13.2 | 73.3% | +2.5 |
| 14 | 76.3% | 94.3% | 60.4% | 33 / 35 | 15.8% | 8.4% | 19 | 0 | 0.98 / 12.8 | 79.7% | -3.4 |
| 15 | 74.2% | 91.4% | 58.3% | 32 / 35 | 14.4% | 8.5% | 19 | 0 | 1.04 / 12.4 | 71.7% | +2.5 |
| 16 | 70.8% | 82.9% | 59.8% | 29 / 35 | 13.6% | 7.5% | 11 | 0 | 1.01 / 13.5 | 73.5% | -2.7 |

Mean score share 74.8% ± 2.4, baseline 76.9% ± 1.8, paired diff -2.1 ± 3.3.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 234 over 16 battles (14.6 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | lower | 74.8% ± 2.4 | 88.9% ± 3.3 | 61.4% ± 2.0 | 498 / 560 | 14.6% ± 0.7 | 7.5% ± 0.4 | 234 | 0 | 1.06 / 19.5 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | 16 | 12 | 1192 | 0 | 0.42 | 0 | 0 | 0 |

12 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | 19449 | 200 | 19361 | 19353 (99.5%) | 96 (0.5%) | 8 (0.0%) | 821 | 284 | 127 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | 22962 | 1540 (6.7%) | 11336 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | 650 | 484 | 631 | 572 | 44.0 / 27.7 | 2212 | 8090 | 83 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | 7.5% | 234 | 732 | 3 | 34.6 | 1530 / 1540 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | bvh.fnr.Fenrir | 1 | 35 | 292 | 8.4% | 8.3% ± 1.6 | 12.7% | 27.7% / 23.7% | 2.8% | 0 / 0 | T3/M0 | 70% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
