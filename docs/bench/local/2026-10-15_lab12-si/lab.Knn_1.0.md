# lab.Knn 1.0 (lab-knn) vs hadur2.Hadur 3.13si

35 rounds x 12 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.12.1, 4 cores. robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 16.4% | 40.0% | 0.0% | 14 / 35 | 0.0% | 12.4% | 22 | 0 | 2.99 / 30.1 |
| 2 | 16.5% | 42.9% | 0.0% | 15 / 35 | 0.0% | 11.2% | 29 | 0 | 3.19 / 41.3 |
| 3 | 18.9% | 48.6% | 0.0% | 17 / 35 | 0.0% | 12.0% | 34 | 0 | 3.07 / 35.0 |
| 4 | 24.8% | 60.0% | 0.0% | 21 / 35 | 0.0% | 10.6% | 31 | 0 | 3.12 / 36.1 |
| 5 | 16.4% | 42.9% | 0.0% | 15 / 35 | 0.0% | 11.4% | 29 | 0 | 3.23 / 34.3 |
| 6 | 19.1% | 48.6% | 0.0% | 17 / 35 | 0.0% | 11.2% | 29 | 0 | 2.96 / 45.4 |
| 7 | 24.7% | 60.0% | 0.0% | 21 / 35 | 0.0% | 10.2% | 25 | 0 | 3.16 / 38.7 |
| 8 | 11.4% | 31.4% | 0.0% | 11 / 35 | 0.0% | 13.3% | 12 | 0 | 2.61 / 28.8 |
| 9 | 11.7% | 31.4% | 0.0% | 11 / 35 | 0.0% | 12.5% | 31 | 0 in 1 round(s) | 3.14 / 37.8 |
| 10 | 21.0% | 54.3% | 0.0% | 19 / 35 | 0.0% | 10.8% | 27 | 0 | 3.23 / 29.6 |
| 11 | 16.4% | 42.9% | 0.0% | 15 / 35 | 0.0% | 12.1% | 27 | 0 | 3.27 / 29.6 |
| 12 | 15.4% | 40.0% | 0.0% | 14 / 35 | 0.0% | 11.9% | 38 | 0 | 3.19 / 35.7 |

Mean score share 17.7% ± 2.7.

## Full report

35 rounds x 12 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.12.1, 4 cores. robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 334 over 12 battles (27.8 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| lab.Knn 1.0 | lab-knn | 17.7% ± 2.7 | 45.2% ± 6.0 | 0.0% ± 0.0 | 190 / 420 | 0.0% ± 0.0 | 11.6% ± 0.6 | 334 | 0 in 1 round(s) | 3.27 / 45.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| lab.Knn 1.0 | 12 | 4471 | 21.4% | 65.6% | 0.1% | 12.8% | 1401 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| lab.Knn 1.0 | 12 | 2 | 0 | 17 | 0.80 | 27 | 4 | 0 |

2 of 12 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| lab.Knn 1.0 | 26752 | 17 | 30259 | 26747 (100.0%) | 5 (0.0%) | 3512 (11.6%) | 19 | 173 | 333 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| lab.Knn 1.0 | 0 | - | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| lab.Knn 1.0 | 650 | 439 | 650 | 1274 | 0.0 / 83.8 | 0 | 10429 | 190 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| lab.Knn 1.0 | 11.6% | 334 | 25126 | 3 | 0.0 | - | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| lab.Knn 1.0 | 0 / 12 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| lab.Knn 1.0 | lab.Knn | 1 | 35 | 260 | 11.8% | 9.5% ± 1.2 | - | - / - | 2.4% | 0 / 0 | T3/M? | 17% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
