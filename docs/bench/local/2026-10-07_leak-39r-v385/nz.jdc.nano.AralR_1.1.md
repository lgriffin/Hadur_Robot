# nz.jdc.nano.AralR 1.1 (lower) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 88.3% | 100.0% | 78.8% | 35 / 35 | 20.1% | 11.4% | 13 | 0 | 0.83 / 13.3 | 90.2% | -1.9 |
| 2 | 91.3% | 100.0% | 83.6% | 35 / 35 | 23.9% | 9.0% | 11 | 0 | 0.64 / 11.8 | 90.2% | +1.1 |
| 3 | 85.8% | 94.3% | 78.1% | 33 / 35 | 20.2% | 10.0% | 13 | 0 | 0.74 / 12.9 | 90.3% | -4.5 |
| 4 | 91.0% | 100.0% | 83.0% | 35 / 35 | 20.3% | 8.4% | 12 | 0 | 0.71 / 14.5 | 90.6% | +0.5 |
| 5 | 92.5% | 100.0% | 85.5% | 35 / 35 | 19.5% | 6.9% | 10 | 0 | 0.66 / 12.5 | 89.6% | +2.9 |
| 6 | 89.2% | 97.1% | 82.4% | 34 / 35 | 22.4% | 9.4% | 11 | 0 | 0.75 / 11.3 | 89.1% | +0.2 |
| 7 | 92.0% | 100.0% | 84.9% | 35 / 35 | 24.8% | 8.4% | 15 | 0 | 0.66 / 10.3 | 92.8% | -0.8 |
| 8 | 91.5% | 100.0% | 84.0% | 35 / 35 | 22.9% | 8.2% | 10 | 0 | 0.71 / 11.5 | 90.5% | +1.0 |
| 9 | 91.2% | 100.0% | 83.5% | 35 / 35 | 22.5% | 8.2% | 10 | 0 | 0.70 / 14.9 | 91.2% | +0.1 |
| 10 | 89.2% | 97.1% | 81.8% | 34 / 35 | 20.3% | 8.8% | 11 | 0 | 0.71 / 12.5 | 89.8% | -0.6 |
| 11 | 89.3% | 100.0% | 80.3% | 35 / 35 | 21.7% | 9.9% | 13 | 0 | 0.81 / 13.9 | 89.1% | +0.2 |
| 12 | 91.2% | 100.0% | 83.2% | 35 / 35 | 19.8% | 7.8% | 10 | 0 | 0.69 / 13.5 | 88.8% | +2.4 |
| 13 | 90.2% | 100.0% | 81.7% | 35 / 35 | 22.5% | 9.3% | 10 | 0 | 0.74 / 12.0 | 90.2% | +0.0 |
| 14 | 90.6% | 100.0% | 82.4% | 35 / 35 | 21.3% | 9.3% | 14 | 0 | 0.72 / 12.2 | 90.6% | +0.0 |
| 15 | 89.8% | 100.0% | 80.9% | 35 / 35 | 20.5% | 9.5% | 13 | 0 | 0.83 / 11.2 | 93.0% | -3.1 |
| 16 | 87.5% | 97.1% | 79.5% | 34 / 35 | 22.5% | 10.7% | 15 | 0 | 0.79 / 12.4 | 91.6% | -4.0 |

Mean score share 90.0% ± 0.9, baseline 90.5% ± 0.6, paired diff -0.4 ± 1.1.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 191 over 16 battles (11.9 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | lower | 90.0% ± 0.9 | 99.1% ± 0.9 | 82.1% ± 1.1 | 555 / 560 | 21.6% ± 0.8 | 9.1% ± 0.6 | 191 | 0 | 0.83 / 14.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | 16 | 14 | 596 | 0 | 0.34 | 0 | 0 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | 14613 | 44 | 14681 | 14519 (99.4%) | 94 (0.6%) | 162 (1.1%) | 934 | 296 | 63 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | 12971 | 1115 (8.6%) | 8179 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | 650 | 332 | 441 | 381 | 69.2 / 15.2 | 8327 | 8805 | 2310 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | 9.1% | 191 | 87 | 3 | 26.2 | 1111 / 1115 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | nz.jdc.nano.AralR | 1 | 35 | 300 | 11.9% | 6.8% ± 1.8 | 19.6% | 26.9% / 31.2% | 5.0% | 0 / 0 | T2/M? | 86% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
