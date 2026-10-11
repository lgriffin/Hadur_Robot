# wcsv.Engineer.Engineer 0.5.4 (mid) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 51.6% | 65.7% | 39.4% | 23 / 35 | 11.2% | 8.8% | 10 | 0 | 1.05 / 16.2 | 66.4% | -14.8 |
| 2 | 62.6% | 77.1% | 48.6% | 27 / 35 | 11.3% | 8.3% | 10 | 0 | 1.03 / 16.4 | 65.6% | -3.0 |
| 3 | 68.3% | 88.6% | 47.0% | 31 / 35 | 10.5% | 7.4% | 12 | 0 | 0.98 / 16.7 | 66.1% | +2.2 |
| 4 | 53.6% | 68.6% | 39.9% | 24 / 35 | 10.2% | 8.6% | 12 | 0 | 1.05 / 15.8 | 66.1% | -12.5 |
| 5 | 66.6% | 85.7% | 47.1% | 30 / 35 | 10.3% | 7.7% | 11 | 0 | 1.02 / 16.9 | 53.1% | +13.6 |
| 6 | 60.7% | 77.1% | 42.5% | 27 / 35 | 9.8% | 7.7% | 16 | 0 | 1.05 / 16.1 | 62.4% | -1.8 |
| 7 | 60.6% | 77.1% | 44.0% | 27 / 35 | 11.0% | 7.6% | 13 | 0 | 1.05 / 17.3 | 58.7% | +1.9 |
| 8 | 51.7% | 62.9% | 41.2% | 22 / 35 | 9.6% | 8.0% | 14 | 0 | 1.06 / 16.3 | 54.7% | -3.1 |
| 9 | 60.3% | 77.1% | 43.7% | 27 / 35 | 9.9% | 8.3% | 14 | 0 | 1.00 / 18.7 | 60.3% | +0.0 |
| 10 | 61.2% | 77.1% | 44.2% | 27 / 35 | 10.4% | 7.1% | 11 | 0 | 1.04 / 15.9 | 67.5% | -6.4 |
| 11 | 54.9% | 65.7% | 44.1% | 23 / 35 | 10.3% | 8.1% | 13 | 0 | 1.04 / 16.4 | 58.4% | -3.5 |
| 12 | 68.8% | 88.6% | 49.3% | 31 / 35 | 12.1% | 7.5% | 14 | 0 | 1.07 / 16.9 | 52.4% | +16.5 |
| 13 | 56.6% | 71.4% | 42.8% | 25 / 35 | 10.8% | 8.2% | 19 | 0 | 1.03 / 16.2 | 64.8% | -8.2 |
| 14 | 60.5% | 77.1% | 44.2% | 27 / 35 | 10.6% | 8.0% | 13 | 0 | 1.03 / 15.9 | 58.8% | +1.7 |
| 15 | 67.6% | 85.7% | 49.4% | 30 / 35 | 10.8% | 7.7% | 6 | 0 | 1.07 / 15.8 | 61.5% | +6.1 |
| 16 | 62.3% | 82.9% | 41.7% | 29 / 35 | 9.7% | 8.0% | 13 | 0 | 1.05 / 16.2 | 62.0% | +0.4 |
| 17 | 61.8% | 77.1% | 45.4% | 27 / 35 | 9.9% | 7.3% | 13 | 0 | 1.04 / 16.3 | 53.9% | +7.9 |
| 18 | 63.0% | 80.0% | 45.2% | 28 / 35 | 10.5% | 7.8% | 16 | 0 | 1.06 / 16.4 | 50.4% | +12.6 |
| 19 | 53.8% | 68.6% | 38.4% | 24 / 35 | 9.2% | 7.8% | 8 | 0 | 1.02 / 16.5 | 65.2% | -11.3 |
| 20 | 61.2% | 77.1% | 45.3% | 27 / 35 | 10.8% | 7.6% | 18 | 0 | 1.08 / 15.3 | 65.4% | -4.2 |

Mean score share 60.4% ± 2.5, baseline 60.7% ± 2.5, paired diff -0.3 ± 4.0.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 256 over 20 battles (12.8 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | mid | 60.4% ± 2.5 | 76.6% ± 3.5 | 44.2% ± 1.5 | 536 / 700 | 10.4% ± 0.3 | 7.9% ± 0.2 | 256 | 0 | 1.08 / 18.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 20 | 17 | 0 | 0 | 0.37 | 3 | 3 | 0 |

17 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 36521 | 246 | 36518 | 36516 (100.0%) | 5 (0.0%) | 2 (0.0%) | 2056 | 373 | 182 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 40355 | 3453 (8.6%) | 33300 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 650 | 464 | 650 | 755 | 27.6 / 34.8 | 819 | 17614 | 4724 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 7.9% | 256 | 1497 | 3 | 51.9 | 3433 / 3453 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | wcsv.Engineer.Engineer | 1 | 35 | 324 | 8.8% | 7.5% ± 1.3 | 10.5% | 21.2% / 22.4% | 12.0% | 0 / 0 | T3/M1 | 60% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
