# lab.GFHist 1.0 (lab-gfhist) vs hadur2.Hadur 3.13siwe

35 rounds x 12 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.12.1, 4 cores. robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 35.8% | 80.0% | 0.0% | 28 / 35 | 0.0% | 8.5% | 36 | 0 | 2.40 / 41.6 |
| 2 | 42.9% | 88.6% | 0.0% | 31 / 35 | 0.0% | 7.4% | 27 | 0 | 2.41 / 32.6 |
| 3 | 40.7% | 85.7% | 0.0% | 30 / 35 | 0.0% | 7.5% | 34 | 0 | 2.34 / 52.2 |
| 4 | 49.4% | 97.1% | 0.0% | 34 / 35 | 0.0% | 7.0% | 24 | 0 | 2.66 / 46.7 |
| 5 | 37.8% | 80.0% | 0.0% | 28 / 35 | 0.0% | 7.7% | 28 | 0 | 2.66 / 42.8 |
| 6 | 38.4% | 82.9% | 0.0% | 29 / 35 | 0.0% | 8.1% | 29 | 0 | 2.64 / 44.0 |
| 7 | 36.5% | 80.0% | 0.0% | 28 / 35 | 0.0% | 7.9% | 26 | 0 | 2.56 / 38.6 |
| 8 | 41.8% | 85.7% | 0.0% | 30 / 35 | 0.0% | 7.1% | 30 | 0 | 2.42 / 31.3 |
| 9 | 41.3% | 85.7% | 0.0% | 30 / 35 | 0.0% | 7.5% | 41 | 0 | 2.45 / 41.3 |
| 10 | 33.8% | 74.3% | 0.0% | 26 / 35 | 0.0% | 8.8% | 30 | 0 | 2.61 / 67.2 |
| 11 | 50.1% | 97.1% | 0.0% | 34 / 35 | 0.0% | 6.6% | 37 | 0 | 2.47 / 44.4 |
| 12 | 29.0% | 65.7% | 0.0% | 23 / 35 | 0.0% | 8.5% | 46 | 0 | 2.49 / 44.6 |

Mean score share 39.8% ± 3.8.

## Full report

35 rounds x 12 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.12.1, 4 cores. robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 388 over 12 battles (32.3 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| lab.GFHist 1.0 | lab-gfhist | 39.8% ± 3.8 | 83.6% ± 5.6 | 0.0% ± 0.0 | 351 / 420 | 0.0% ± 0.0 | 7.7% ± 0.4 | 388 | 0 | 2.66 / 67.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| lab.GFHist 1.0 | 12 | 2686 | 10.7% | 82.9% | 0.0% | 6.4% | 1684 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| lab.GFHist 1.0 | 12 | 6 | 0 | 2 | 0.92 | 7 | 2 | 0 |

6 of 12 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| lab.GFHist 1.0 | 27631 | 5 | 34149 | 27629 (100.0%) | 2 (0.0%) | 6520 (19.1%) | 23 | 135 | 414 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| lab.GFHist 1.0 | 0 | - | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| lab.GFHist 1.0 | 650 | 443 | 650 | 1539 | 0.0 / 63.6 | 0 | 29445 | 351 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| lab.GFHist 1.0 | 7.7% | 388 | 1860 | 3 | 0.0 | - | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| lab.GFHist 1.0 | 0 / 12 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| lab.GFHist 1.0 | lab.GFHist | 1 | 35 | 272 | 8.7% | 7.2% ± 1.0 | - | - / - | 2.3% | 0 / 0 | T3/M? | 31% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
