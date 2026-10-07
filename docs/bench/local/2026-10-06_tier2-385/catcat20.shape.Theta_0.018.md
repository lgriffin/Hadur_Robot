# catcat20.shape.Theta 0.018 (mid) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 66.7% | 74.3% | 59.8% | 26 / 35 | 13.4% | 8.5% | 28 | 0 | 1.60 / 5.8 | 77.3% | -10.5 |
| 2 | 68.7% | 82.9% | 54.5% | 29 / 35 | 11.9% | 8.2% | 27 | 0 | 1.73 / 6.4 | 64.0% | +4.7 |
| 3 | 72.6% | 85.7% | 60.1% | 30 / 35 | 12.7% | 8.5% | 28 | 0 | 1.69 / 6.6 | 72.0% | +0.6 |
| 4 | 63.8% | 77.1% | 51.3% | 27 / 35 | 11.8% | 8.4% | 24 | 0 | 1.66 / 15.9 | 70.8% | -7.0 |
| 5 | 70.3% | 85.7% | 56.4% | 30 / 35 | 14.2% | 9.8% | 26 | 0 | 1.66 / 5.6 | 67.9% | +2.4 |
| 6 | 70.3% | 82.9% | 58.5% | 29 / 35 | 13.0% | 8.3% | 25 | 0 | 1.71 / 6.3 | 64.4% | +5.9 |
| 7 | 70.5% | 82.9% | 58.9% | 29 / 35 | 14.0% | 7.8% | 22 | 0 | 1.60 / 26.1 | 80.6% | -10.1 |
| 8 | 59.1% | 71.4% | 48.2% | 25 / 35 | 12.4% | 9.2% | 30 | 0 | 1.73 / 7.2 | 68.1% | -9.1 |
| 9 | 71.7% | 85.7% | 58.6% | 30 / 35 | 12.8% | 7.4% | 26 | 0 | 1.66 / 7.9 | 67.3% | +4.4 |
| 10 | 68.5% | 85.7% | 52.6% | 30 / 35 | 12.7% | 9.1% | 28 | 0 | 1.69 / 6.0 | 68.4% | +0.1 |
| 11 | 71.4% | 85.7% | 57.7% | 30 / 35 | 12.9% | 7.6% | 22 | 0 | 1.62 / 6.4 | 61.4% | +10.0 |
| 12 | 61.6% | 74.3% | 50.5% | 26 / 35 | 12.4% | 10.0% | 30 | 0 | 1.72 / 6.0 | 68.8% | -7.2 |
| 13 | 71.0% | 85.7% | 57.3% | 30 / 35 | 13.1% | 8.1% | 19 | 0 | 1.66 / 5.5 | 69.6% | +1.4 |
| 14 | 68.3% | 80.0% | 56.9% | 28 / 35 | 12.8% | 8.3% | 28 | 0 | 1.60 / 13.5 | 70.1% | -1.9 |
| 15 | 63.7% | 77.1% | 51.9% | 27 / 35 | 12.5% | 8.8% | 20 | 0 | 1.67 / 5.8 | 71.0% | -7.3 |
| 16 | 67.8% | 82.9% | 53.3% | 29 / 35 | 12.9% | 8.2% | 24 | 0 | 1.61 / 6.9 | 66.7% | +1.1 |
| 17 | 59.0% | 70.6% | 48.4% | 25 / 35 | 11.8% | 9.0% | 28 | 0 | 1.74 / 7.0 | 60.8% | -1.8 |
| 18 | 70.7% | 85.7% | 56.7% | 30 / 35 | 12.0% | 8.0% | 28 | 0 | 1.59 / 6.2 | 67.7% | +3.0 |
| 19 | 64.9% | 77.1% | 53.4% | 27 / 35 | 12.5% | 9.1% | 25 | 0 | 1.64 / 5.6 | 70.7% | -5.8 |
| 20 | 71.5% | 82.9% | 60.7% | 29 / 35 | 13.1% | 7.9% | 25 | 0 | 1.55 / 5.7 | 67.2% | +4.3 |

Mean score share 67.6% ± 2.0, baseline 68.7% ± 2.2, paired diff -1.1 ± 2.8.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 513 over 20 battles (25.7 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| catcat20.shape.Theta 0.018 | mid | 67.6% ± 2.0 | 80.8% ± 2.4 | 55.3% ± 1.8 | 566 / 700 | 12.7% ± 0.3 | 8.5% ± 0.3 | 513 | 0 | 1.74 / 26.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| catcat20.shape.Theta 0.018 | 20 | 10 | 2514 | 0 | 0.73 | 3 | 3 | 0 |

10 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| catcat20.shape.Theta 0.018 | 38238 | 788 | 38037 | 38031 (99.5%) | 207 (0.5%) | 6 (0.0%) | 2284 | 483 | 426 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 41823 | 3233 (7.7%) | 36051 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| catcat20.shape.Theta 0.018 | 650 | 479 | 650 | 787 | 39.0 / 31.5 | 1341 | 7679 | 43 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| catcat20.shape.Theta 0.018 | 8.5% | 513 | 250 | 3 | 53.9 | 3214 / 3233 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| catcat20.shape.Theta 0.018 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| catcat20.shape.Theta 0.018 | catcat20.shape.Theta | 1 | 35 | 316 | 8.9% | 7.5% ± 1.3 | 11.7% | 27.3% / 24.9% | 1.4% | 0 / 0 | T3/M0 | 71% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
