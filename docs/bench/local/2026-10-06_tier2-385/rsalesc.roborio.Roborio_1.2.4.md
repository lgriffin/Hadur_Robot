# rsalesc.roborio.Roborio 1.2.4 (mid) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 62.8% | 60.0% | 64.1% | 21 / 35 | 11.7% | 8.6% | 24 | 0 | 1.55 / 26.0 | 62.8% | -0.1 |
| 2 | 66.1% | 65.7% | 65.1% | 23 / 35 | 11.9% | 9.9% | 23 | 0 | 1.56 / 26.0 | 60.3% | +5.8 |
| 3 | 57.9% | 54.3% | 60.4% | 19 / 35 | 12.0% | 9.5% | 22 | 0 | 1.53 / 22.9 | 54.1% | +3.8 |
| 4 | 63.5% | 62.9% | 62.8% | 22 / 35 | 12.2% | 8.8% | 20 | 0 | 1.62 / 25.9 | 69.9% | -6.4 |
| 5 | 73.4% | 77.1% | 68.5% | 27 / 35 | 12.1% | 8.3% | 27 | 0 | 1.56 / 25.3 | 63.6% | +9.8 |
| 6 | 57.0% | 54.3% | 58.7% | 19 / 35 | 11.6% | 9.6% | 30 | 0 | 1.60 / 24.9 | 64.9% | -7.9 |
| 7 | 57.5% | 51.4% | 62.1% | 18 / 35 | 11.8% | 8.8% | 24 | 0 | 1.61 / 23.3 | 54.4% | +3.1 |
| 8 | 64.5% | 62.9% | 64.3% | 22 / 35 | 11.9% | 9.7% | 9 | 0 | 1.52 / 28.7 | 50.7% | +13.8 |
| 9 | 57.4% | 51.4% | 62.5% | 18 / 35 | 11.3% | 8.2% | 21 | 0 | 1.57 / 23.9 | 55.5% | +1.9 |
| 10 | 63.1% | 62.9% | 62.1% | 22 / 35 | 11.9% | 8.6% | 19 | 0 | 1.61 / 25.5 | 69.2% | -6.1 |
| 11 | 63.8% | 62.9% | 63.5% | 22 / 35 | 11.9% | 9.2% | 24 | 0 | 1.53 / 26.7 | 62.3% | +1.5 |
| 12 | 60.7% | 60.0% | 60.0% | 21 / 35 | 11.0% | 8.9% | 24 | 0 | 1.57 / 25.4 | 74.8% | -14.1 |
| 13 | 67.2% | 65.7% | 67.4% | 23 / 35 | 12.4% | 9.1% | 23 | 0 | 1.62 / 27.7 | 59.2% | +8.0 |
| 14 | 55.0% | 51.4% | 57.9% | 18 / 35 | 11.8% | 9.3% | 31 | 0 | 1.66 / 26.9 | 64.8% | -9.8 |
| 15 | 68.6% | 68.6% | 67.3% | 24 / 35 | 11.7% | 8.2% | 22 | 0 | 1.56 / 23.5 | 61.9% | +6.7 |
| 16 | 46.8% | 40.0% | 52.7% | 14 / 35 | 10.5% | 10.0% | 22 | 0 | 1.61 / 27.9 | 61.2% | -14.4 |
| 17 | 54.5% | 48.6% | 59.8% | 17 / 35 | 11.3% | 8.7% | 28 | 0 | 1.57 / 26.2 | 63.3% | -8.7 |
| 18 | 64.9% | 62.9% | 64.8% | 22 / 35 | 12.0% | 9.3% | 27 | 0 | 1.60 / 26.1 | 62.4% | +2.5 |
| 19 | 65.1% | 65.7% | 63.2% | 23 / 35 | 12.0% | 8.7% | 31 | 0 | 1.59 / 25.8 | 62.7% | +2.5 |
| 20 | 66.1% | 62.9% | 67.6% | 22 / 35 | 12.7% | 8.7% | 32 | 0 | 1.56 / 26.0 | 67.9% | -1.8 |

Mean score share 61.8% ± 2.8, baseline 62.3% ± 2.7, paired diff -0.5 ± 3.7.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 483 over 20 battles (24.2 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | mid | 61.8% ± 2.8 | 59.6% ± 3.9 | 62.7% ± 1.8 | 417 / 700 | 11.8% ± 0.2 | 9.0% ± 0.3 | 483 | 0 | 1.66 / 28.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | 20 | 8 | 596 | 0 | 0.69 | 11 | 11 | 0 |

8 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | 138753 | 42 | 138876 | 138701 (100.0%) | 52 (0.0%) | 175 (0.1%) | 13961 | 1107 | 415 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | 154170 | 14748 (9.6%) | 153475 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | 650 | 504 | 650 | 2619 | 41.3 / 24.5 | 3178 | 31837 | 465 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | 9.0% | 483 | 41971 | 3 | 194.5 | 14687 / 14748 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | rsalesc.roborio.Roborio | 1 | 35 | 328 | 9.4% | 7.3% ± 1.0 | 11.4% | 23.0% / 20.4% | 12.7% | 0 / 0 | T3/M1 | 65% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
