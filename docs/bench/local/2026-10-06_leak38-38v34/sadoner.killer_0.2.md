# sadoner.killer 0.2 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 71.8% | 80.0% | 65.3% | 28 / 35 | 19.7% | 11.9% | 10 | 0 | 0.83 / 11.7 | 89.8% | -18.0 |
| 2 | 86.1% | 94.3% | 78.1% | 33 / 35 | 20.0% | 7.0% | 11 | 0 | 0.74 / 10.8 | 79.7% | +6.3 |
| 3 | 84.7% | 94.3% | 75.5% | 33 / 35 | 21.0% | 6.6% | 11 | 0 | 0.73 / 12.1 | 83.4% | +1.3 |
| 4 | 83.2% | 97.1% | 71.1% | 34 / 35 | 19.6% | 8.5% | 9 | 0 | 0.83 / 11.3 | 84.8% | -1.7 |
| 5 | 93.1% | 100.0% | 85.9% | 35 / 35 | 21.7% | 5.2% | 11 | 0 | 0.64 / 11.0 | 85.2% | +7.9 |
| 6 | 85.6% | 94.3% | 77.3% | 33 / 35 | 20.3% | 5.6% | 11 | 0 | 0.66 / 10.8 | 88.6% | -2.9 |
| 7 | 91.8% | 100.0% | 83.5% | 35 / 35 | 20.1% | 4.9% | 10 | 0 | 0.69 / 15.0 | 82.8% | +9.0 |
| 8 | 85.0% | 97.1% | 74.2% | 34 / 35 | 21.0% | 9.0% | 8 | 0 | 0.83 / 10.5 | 82.0% | +2.9 |
| 9 | 87.5% | 97.1% | 78.5% | 34 / 35 | 23.6% | 7.2% | 10 | 0 | 0.80 / 9.9 | 92.4% | -4.9 |
| 10 | 84.8% | 94.3% | 75.6% | 33 / 35 | 19.0% | 6.0% | 11 | 0 | 0.73 / 12.3 | 88.5% | -3.8 |
| 11 | 85.3% | 91.4% | 79.4% | 32 / 35 | 22.2% | 9.5% | 3 | 0 | 0.80 / 11.5 | 82.7% | +2.6 |
| 12 | 79.6% | 88.6% | 71.9% | 31 / 35 | 21.9% | 11.0% | 13 | 0 | 0.73 / 11.4 | 84.8% | -5.2 |
| 13 | 79.3% | 94.3% | 68.2% | 33 / 35 | 21.1% | 11.9% | 10 | 0 | 0.79 / 11.0 | 85.8% | -6.5 |
| 14 | 89.7% | 100.0% | 79.9% | 35 / 35 | 20.9% | 7.4% | 12 | 0 | 0.70 / 9.6 | 83.0% | +6.8 |
| 15 | 79.8% | 91.4% | 70.4% | 32 / 35 | 20.2% | 11.1% | 15 | 0 | 0.78 / 13.4 | 88.7% | -8.9 |
| 16 | 92.9% | 100.0% | 85.7% | 35 / 35 | 22.6% | 6.3% | 13 | 0 | 0.65 / 10.8 | 86.1% | +6.8 |

Mean score share 85.0% ± 3.0, baseline 85.5% ± 1.8, paired diff -0.5 ± 3.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 168 over 16 battles (10.5 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | weak | 85.0% ± 3.0 | 94.6% ± 2.8 | 76.3% ± 3.2 | 530 / 560 | 20.9% ± 0.7 | 8.1% ± 1.3 | 168 | 0 | 0.83 / 15.0 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 16 | 13 | 596 | 0 | 0.30 | 1 | 1 | 0 |

13 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 11772 | 38 | 11733 | 11732 (99.7%) | 40 (0.3%) | 1 (0.0%) | 126 | 182 | 46 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sadoner.killer 0.2 | 11669 | 979 (8.4%) | 6552 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 650 | 295 | 484 | 340 | 60.2 / 19.3 | 6652 | 10447 | 20 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 8.1% | 168 | 3271 | 3 | 20.9 | 979 / 979 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | sadoner.killer | 1 | 35 | 288 | 7.3% | 4.2% ± 1.7 | 17.6% | 24.9% / 24.0% | 5.4% | 0 / 0 | T1/M? | 92% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
