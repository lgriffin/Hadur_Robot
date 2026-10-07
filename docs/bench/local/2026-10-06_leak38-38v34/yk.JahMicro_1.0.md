# yk.JahMicro 1.0 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 93.6% | 97.1% | 90.1% | 34 / 35 | 22.5% | 7.9% | 15 | 0 | 0.76 / 14.2 | 94.8% | -1.2 |
| 2 | 93.5% | 100.0% | 88.1% | 35 / 35 | 22.3% | 9.7% | 14 | 0 | 0.77 / 12.2 | 95.0% | -1.5 |
| 3 | 92.0% | 94.3% | 89.3% | 33 / 35 | 17.3% | 7.0% | 12 | 0 | 0.76 / 13.1 | 90.6% | +1.4 |
| 4 | 95.0% | 100.0% | 90.9% | 35 / 35 | 20.3% | 7.2% | 9 | 0 | 0.72 / 11.5 | 91.7% | +3.2 |
| 5 | 93.2% | 97.1% | 89.4% | 34 / 35 | 20.8% | 7.4% | 11 | 0 | 0.73 / 12.6 | 94.3% | -1.1 |
| 6 | 95.1% | 100.0% | 90.9% | 35 / 35 | 18.0% | 6.2% | 11 | 0 | 0.70 / 13.1 | 96.3% | -1.2 |
| 7 | 90.0% | 88.6% | 89.6% | 31 / 35 | 19.3% | 6.0% | 11 | 0 | 0.76 / 13.4 | 95.0% | -5.0 |
| 8 | 92.7% | 97.1% | 88.7% | 34 / 35 | 21.5% | 8.7% | 9 | 0 | 0.72 / 12.8 | 93.3% | -0.6 |
| 9 | 91.1% | 94.3% | 87.7% | 33 / 35 | 19.9% | 8.9% | 14 | 0 | 0.77 / 14.1 | 94.3% | -3.2 |
| 10 | 90.5% | 94.3% | 87.1% | 33 / 35 | 23.4% | 10.3% | 11 | 0 | 0.75 / 13.7 | 94.6% | -4.2 |
| 11 | 92.9% | 97.1% | 88.9% | 34 / 35 | 22.8% | 9.1% | 8 | 0 | 0.78 / 12.5 | 95.2% | -2.2 |
| 12 | 93.2% | 94.3% | 91.3% | 33 / 35 | 21.8% | 5.2% | 13 | 0 | 0.72 / 13.5 | 93.6% | -0.4 |
| 13 | 88.5% | 88.6% | 87.0% | 31 / 35 | 19.8% | 7.6% | 13 | 0 | 0.76 / 13.7 | 92.5% | -4.0 |
| 14 | 92.8% | 97.1% | 88.6% | 34 / 35 | 18.5% | 8.0% | 13 | 0 | 0.81 / 12.8 | 94.9% | -2.1 |
| 15 | 93.1% | 97.1% | 89.0% | 34 / 35 | 18.5% | 6.4% | 15 | 0 | 0.74 / 12.7 | 91.6% | +1.4 |
| 16 | 88.3% | 88.6% | 86.6% | 31 / 35 | 18.6% | 8.7% | 15 | 0 | 0.80 / 13.1 | 97.0% | -8.7 |

Mean score share 92.2% ± 1.1, baseline 94.0% ± 0.9, paired diff -1.8 ± 1.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 194 over 16 battles (12.1 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | weak | 92.2% ± 1.1 | 95.4% ± 2.1 | 88.9% ± 0.8 | 534 / 560 | 20.3% ± 1.0 | 7.8% ± 0.8 | 194 | 0 | 0.81 / 14.2 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | 16 | 14 | 596 | 0 | 0.35 | 0 | 0 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | 13425 | 17 | 13500 | 13396 (99.8%) | 29 (0.2%) | 104 (0.8%) | 979 | 231 | 67 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| yk.JahMicro 1.0 | 19076 | 1121 (5.9%) | 6315 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | 650 | 452 | 400 | 530 | 76.9 / 9.6 | 11108 | 3479 | 165 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | 7.8% | 194 | 101 | 3 | 24.0 | 1119 / 1121 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | yk.JahMicro | 1 | 35 | 276 | 9.7% | 8.2% ± 1.8 | 18.0% | 34.5% / 32.3% | 2.9% | 0 / 0 | T3/M0 | 87% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
