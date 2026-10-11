# mahrgell.mahrram 1.3 (rammer) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 77.1% | 100.0% | 67.7% | 35 / 35 | 72.6% | 42.5% | 12 | 0 | 0.50 / 8.8 | 79.0% | -1.8 |
| 2 | 82.6% | 100.0% | 74.7% | 35 / 35 | 72.2% | 33.0% | 9 | 0 | 0.50 / 9.2 | 81.7% | +0.9 |
| 3 | 79.8% | 97.1% | 72.3% | 34 / 35 | 70.8% | 35.4% | 11 | 0 | 0.51 / 10.9 | 79.7% | +0.1 |
| 4 | 77.4% | 100.0% | 67.9% | 35 / 35 | 71.7% | 41.0% | 11 | 0 | 0.54 / 8.7 | 81.1% | -3.6 |
| 5 | 79.9% | 100.0% | 70.7% | 35 / 35 | 68.6% | 35.5% | 13 | 0 | 0.54 / 8.8 | 79.4% | +0.4 |
| 6 | 80.3% | 100.0% | 72.0% | 35 / 35 | 72.9% | 35.9% | 13 | 0 | 0.55 / 8.6 | 75.1% | +5.2 |
| 7 | 79.9% | 100.0% | 70.8% | 35 / 35 | 71.1% | 35.3% | 13 | 0 | 0.57 / 9.0 | 79.9% | -0.0 |
| 8 | 79.7% | 100.0% | 70.5% | 35 / 35 | 71.5% | 35.3% | 8 | 0 | 0.53 / 8.9 | 77.6% | +2.1 |
| 9 | 81.8% | 100.0% | 73.2% | 35 / 35 | 66.9% | 31.2% | 10 | 0 | 0.55 / 8.4 | 80.9% | +0.9 |
| 10 | 79.7% | 94.3% | 74.0% | 33 / 35 | 69.9% | 30.4% | 12 | 0 | 0.52 / 8.9 | 81.1% | -1.4 |
| 11 | 76.4% | 100.0% | 66.6% | 35 / 35 | 75.4% | 44.9% | 11 | 0 | 0.52 / 8.4 | 78.8% | -2.4 |
| 12 | 79.9% | 97.1% | 72.1% | 34 / 35 | 74.1% | 30.6% | 13 | 0 | 0.53 / 8.3 | 82.7% | -2.8 |
| 13 | 77.5% | 100.0% | 68.8% | 35 / 35 | 72.6% | 40.6% | 8 | 0 | 0.58 / 9.6 | 81.2% | -3.7 |
| 14 | 81.2% | 100.0% | 72.0% | 35 / 35 | 72.0% | 37.4% | 8 | 0 | 0.52 / 8.6 | 79.6% | +1.6 |
| 15 | 81.1% | 100.0% | 72.6% | 35 / 35 | 69.4% | 32.4% | 9 | 0 | 0.57 / 9.4 | 81.2% | -0.2 |
| 16 | 82.0% | 97.1% | 75.3% | 34 / 35 | 73.0% | 31.4% | 10 | 0 | 0.53 / 8.9 | 82.0% | +0.1 |

Mean score share 79.8% ± 1.0, baseline 80.1% ± 1.0, paired diff -0.3 ± 1.2.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 171 over 16 battles (10.7 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| mahrgell.mahrram 1.3 | rammer | 79.8% ± 1.0 | 99.1% ± 0.9 | 71.3% ± 1.3 | 555 / 560 | 71.5% ± 1.1 | 35.8% ± 2.4 | 171 | 0 | 0.58 / 10.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| mahrgell.mahrram 1.3 | 16 | 14 | 253 | 0 | 0.31 | 0 | 0 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| mahrgell.mahrram 1.3 | 5065 | 48 | 5049 | 5048 (99.7%) | 17 (0.3%) | 1 (0.0%) | 2029 | 441 | 41 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| mahrgell.mahrram 1.3 | 4772 | 350 (7.3%) | 468 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| mahrgell.mahrram 1.3 | 650 | 183 | 603 | 154 | 100.5 / 40.7 | 4111 | 4605 | 97 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| mahrgell.mahrram 1.3 | 35.8% | 171 | 42 | 3 | 8.8 | 347 / 350 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| mahrgell.mahrram 1.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| mahrgell.mahrram 1.3 | mahrgell.mahrram | 1 | 35 | 296 | 36.8% | 9.0% ± 3.4 | 43.3% | 15.8% / 15.8% | 4.8% | 0 / 0 | T?/M? | 80% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
