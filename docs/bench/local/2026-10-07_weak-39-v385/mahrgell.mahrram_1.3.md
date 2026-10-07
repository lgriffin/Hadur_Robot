# mahrgell.mahrram 1.3 (rammer) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 80.9% | 100.0% | 72.0% | 35 / 35 | 69.3% | 32.7% | 11 | 0 | 0.52 / 7.6 | 80.5% | +0.4 |
| 2 | 82.6% | 100.0% | 74.7% | 35 / 35 | 72.2% | 33.0% | 10 | 0 | 0.52 / 9.0 | 80.5% | +2.0 |
| 3 | 79.3% | 97.1% | 71.6% | 34 / 35 | 71.8% | 37.9% | 9 | 0 | 0.52 / 8.9 | 79.1% | +0.2 |
| 4 | 79.4% | 100.0% | 70.4% | 35 / 35 | 70.7% | 39.8% | 14 | 0 | 0.55 / 8.9 | 80.7% | -1.4 |
| 5 | 77.0% | 97.1% | 68.2% | 34 / 35 | 69.8% | 37.4% | 16 | 0 | 0.53 / 8.0 | 79.4% | -2.4 |
| 6 | 80.3% | 100.0% | 72.0% | 35 / 35 | 72.9% | 35.9% | 13 | 0 | 0.55 / 8.7 | 77.1% | +3.3 |
| 7 | 79.9% | 100.0% | 70.8% | 35 / 35 | 71.1% | 35.3% | 12 | 0 | 0.57 / 13.2 | 77.6% | +2.3 |
| 8 | 79.7% | 100.0% | 70.5% | 35 / 35 | 71.5% | 35.3% | 11 | 0 | 0.55 / 9.5 | 77.6% | +2.1 |
| 9 | 81.8% | 100.0% | 73.2% | 35 / 35 | 66.9% | 31.2% | 10 | 0 | 0.55 / 8.5 | 80.9% | +0.9 |
| 10 | 78.4% | 100.0% | 68.9% | 35 / 35 | 73.9% | 38.4% | 9 | 0 | 0.57 / 8.3 | 81.1% | -2.6 |
| 11 | 79.6% | 100.0% | 70.3% | 35 / 35 | 71.8% | 38.8% | 10 | 0 | 0.54 / 13.1 | 80.4% | -0.8 |
| 12 | 80.5% | 100.0% | 71.3% | 35 / 35 | 72.3% | 33.6% | 10 | 0 | 0.53 / 9.6 | 75.3% | +5.1 |
| 13 | 79.6% | 100.0% | 70.3% | 35 / 35 | 73.2% | 35.7% | 11 | 0 | 0.52 / 11.4 | 78.1% | +1.5 |
| 14 | 76.2% | 97.1% | 67.9% | 34 / 35 | 70.4% | 58.5% | 12 | 0 | 0.49 / 8.5 | 80.5% | -4.4 |
| 15 | 72.8% | 94.3% | 66.4% | 33 / 35 | 71.1% | 57.5% | 14 | 0 | 0.53 / 9.0 | 82.6% | -9.8 |
| 16 | 77.9% | 100.0% | 68.7% | 35 / 35 | 67.8% | 38.7% | 10 | 0 | 0.54 / 8.8 | 82.0% | -4.1 |

Mean score share 79.1% ± 1.2, baseline 79.6% ± 1.0, paired diff -0.5 ± 1.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 182 over 16 battles (11.4 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| mahrgell.mahrram 1.3 | rammer | 79.1% ± 1.2 | 99.1% ± 0.9 | 70.5% ± 1.1 | 555 / 560 | 71.0% ± 1.0 | 38.7% ± 4.2 | 182 | 0 | 0.57 / 13.2 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| mahrgell.mahrram 1.3 | 16 | 13 | 519 | 0 | 0.33 | 0 | 0 | 0 |

13 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| mahrgell.mahrram 1.3 | 5134 | 38 | 5100 | 5100 (99.3%) | 34 (0.7%) | 0 (0.0%) | 2173 | 427 | 43 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| mahrgell.mahrram 1.3 | 4833 | 348 (7.2%) | 702 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| mahrgell.mahrram 1.3 | 650 | 180 | 594 | 155 | 100.7 / 42.3 | 4143 | 4492 | 69 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| mahrgell.mahrram 1.3 | 38.7% | 182 | 50 | 3 | 8.9 | 345 / 348 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| mahrgell.mahrram 1.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| mahrgell.mahrram 1.3 | mahrgell.mahrram | 1 | 35 | 296 | 44.6% | 9.7% ± 3.3 | 41.3% | 12.6% / 12.0% | 4.7% | 0 / 0 | T?/M? | 76% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
