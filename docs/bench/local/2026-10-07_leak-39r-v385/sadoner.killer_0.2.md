# sadoner.killer 0.2 (weak) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 87.5% | 97.1% | 78.3% | 34 / 35 | 19.9% | 7.1% | 15 | 0 | 0.70 / 10.2 | 81.8% | +5.7 |
| 2 | 78.2% | 85.7% | 72.1% | 30 / 35 | 22.1% | 7.8% | 11 | 0 | 0.71 / 15.2 | 86.6% | -8.4 |
| 3 | 86.3% | 94.3% | 78.5% | 33 / 35 | 20.9% | 6.5% | 9 | 0 | 0.75 / 11.5 | 78.2% | +8.0 |
| 4 | 87.9% | 97.1% | 79.2% | 34 / 35 | 22.7% | 7.1% | 13 | 0 | 0.63 / 12.6 | 91.0% | -3.1 |
| 5 | 85.0% | 94.3% | 76.6% | 33 / 35 | 20.9% | 7.9% | 12 | 0 | 0.64 / 10.0 | 85.6% | -0.6 |
| 6 | 87.9% | 100.0% | 76.8% | 35 / 35 | 20.5% | 7.0% | 9 | 0 | 0.67 / 11.1 | 86.2% | +1.7 |
| 7 | 87.1% | 97.1% | 77.8% | 34 / 35 | 20.9% | 6.9% | 11 | 0 | 0.75 / 12.9 | 86.2% | +1.0 |
| 8 | 81.0% | 91.4% | 71.9% | 32 / 35 | 21.6% | 9.3% | 12 | 0 | 0.88 / 12.4 | 86.6% | -5.6 |
| 9 | 90.0% | 97.1% | 82.9% | 34 / 35 | 22.2% | 6.3% | 9 | 0 | 0.70 / 12.1 | 86.4% | +3.6 |
| 10 | 87.9% | 100.0% | 77.0% | 35 / 35 | 21.7% | 7.6% | 13 | 0 | 0.65 / 10.8 | 92.0% | -4.1 |
| 11 | 81.7% | 94.3% | 71.0% | 33 / 35 | 19.9% | 9.0% | 4 | 0 | 0.77 / 11.5 | 84.1% | -2.4 |
| 12 | 88.9% | 97.1% | 81.2% | 34 / 35 | 24.4% | 6.4% | 12 | 0 | 0.67 / 13.8 | 83.3% | +5.6 |
| 13 | 85.4% | 100.0% | 72.7% | 35 / 35 | 20.2% | 7.6% | 11 | 0 | 0.71 / 12.0 | 89.2% | -3.7 |
| 14 | 83.9% | 91.4% | 76.6% | 32 / 35 | 20.9% | 7.4% | 12 | 0 | 0.72 / 12.6 | 92.2% | -8.3 |
| 15 | 87.3% | 97.1% | 78.5% | 34 / 35 | 23.4% | 8.8% | 12 | 0 | 0.76 / 10.4 | 81.2% | +6.1 |
| 16 | 85.9% | 97.1% | 76.1% | 34 / 35 | 21.1% | 8.0% | 13 | 0 | 0.74 / 13.2 | 83.2% | +2.8 |

Mean score share 85.7% ± 1.7, baseline 85.9% ± 2.1, paired diff -0.1 ± 2.8.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 178 over 16 battles (11.1 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | weak | 85.7% ± 1.7 | 95.7% ± 2.0 | 76.7% ± 1.8 | 536 / 560 | 21.5% ± 0.7 | 7.5% ± 0.5 | 178 | 0 | 0.88 / 15.2 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 16 | 14 | 298 | 0 | 0.32 | 1 | 1 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 11517 | 37 | 11498 | 11496 (99.8%) | 21 (0.2%) | 2 (0.0%) | 109 | 179 | 55 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sadoner.killer 0.2 | 11352 | 806 (7.1%) | 2822 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 650 | 291 | 433 | 334 | 61.1 / 18.7 | 6790 | 10470 | 50 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 7.5% | 178 | 81 | 3 | 20.4 | 805 / 806 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | sadoner.killer | 1 | 35 | 288 | 10.1% | 6.8% ± 1.9 | 17.7% | 24.4% / 23.9% | 4.8% | 0 / 0 | T2/M? | 85% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
