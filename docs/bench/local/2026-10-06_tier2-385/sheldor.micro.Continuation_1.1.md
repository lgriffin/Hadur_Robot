# sheldor.micro.Continuation 1.1 (mid) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 69.0% | 88.6% | 50.9% | 31 / 35 | 13.0% | 8.5% | 24 | 0 | 1.21 / 16.1 | 71.7% | -2.7 |
| 2 | 74.2% | 88.6% | 61.1% | 31 / 35 | 14.3% | 8.0% | 13 | 0 | 1.06 / 13.9 | 69.0% | +5.3 |
| 3 | 63.5% | 80.0% | 49.0% | 28 / 35 | 12.7% | 8.0% | 18 | 0 | 1.15 / 15.1 | 57.8% | +5.7 |
| 4 | 65.6% | 77.1% | 55.3% | 27 / 35 | 14.7% | 8.4% | 9 | 0 | 1.10 / 15.5 | 66.0% | -0.4 |
| 5 | 65.5% | 80.0% | 51.5% | 28 / 35 | 11.9% | 7.5% | 15 | 0 | 1.13 / 14.4 | 68.8% | -3.3 |
| 6 | 70.1% | 85.7% | 56.3% | 30 / 35 | 12.9% | 8.4% | 18 | 0 | 1.13 / 15.3 | 70.2% | -0.1 |
| 7 | 67.1% | 82.9% | 52.4% | 29 / 35 | 12.9% | 7.6% | 14 | 0 | 1.11 / 14.5 | 73.0% | -5.9 |
| 8 | 72.6% | 88.6% | 56.8% | 31 / 35 | 13.8% | 6.9% | 16 | 0 | 1.17 / 15.3 | 62.5% | +10.0 |
| 9 | 68.0% | 82.9% | 53.8% | 29 / 35 | 11.8% | 7.8% | 12 | 0 | 1.15 / 14.8 | 60.4% | +7.7 |
| 10 | 62.5% | 77.1% | 47.0% | 27 / 35 | 12.5% | 7.2% | 13 | 0 | 1.17 / 17.4 | 61.8% | +0.6 |
| 11 | 69.5% | 82.9% | 56.6% | 29 / 35 | 12.5% | 8.1% | 12 | 0 | 1.10 / 16.4 | 68.0% | +1.5 |
| 12 | 72.0% | 85.7% | 59.1% | 30 / 35 | 12.3% | 7.1% | 15 | 0 | 1.12 / 15.2 | 72.8% | -0.7 |
| 13 | 72.0% | 88.6% | 55.6% | 31 / 35 | 12.7% | 6.9% | 16 | 0 | 1.16 / 15.7 | 80.3% | -8.3 |
| 14 | 64.5% | 71.4% | 57.9% | 25 / 35 | 15.5% | 8.4% | 20 | 0 | 1.01 / 15.4 | 66.6% | -2.2 |
| 15 | 70.3% | 85.7% | 54.7% | 30 / 35 | 12.6% | 7.7% | 16 | 0 | 1.15 / 14.4 | 60.7% | +9.6 |
| 16 | 68.3% | 85.7% | 50.8% | 30 / 35 | 12.0% | 7.7% | 15 | 0 | 1.06 / 16.1 | 66.1% | +2.2 |
| 17 | 70.9% | 85.7% | 55.4% | 30 / 35 | 11.9% | 6.7% | 8 | 0 | 1.11 / 16.1 | 74.3% | -3.4 |
| 18 | 69.3% | 85.7% | 53.3% | 30 / 35 | 13.2% | 8.2% | 12 | 0 | 1.00 / 15.8 | 60.7% | +8.7 |
| 19 | 68.5% | 80.0% | 56.9% | 28 / 35 | 12.6% | 7.3% | 16 | 0 | 1.04 / 15.4 | 69.2% | -0.6 |
| 20 | 65.4% | 82.9% | 48.9% | 29 / 35 | 12.2% | 7.9% | 11 | 0 | 1.00 / 16.0 | 74.8% | -9.4 |

Mean score share 68.4% ± 1.5, baseline 67.7% ± 2.7, paired diff +0.7 ± 2.7.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 293 over 20 battles (14.7 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.micro.Continuation 1.1 | mid | 68.4% ± 1.5 | 83.3% ± 2.1 | 54.2% ± 1.7 | 583 / 700 | 12.9% ± 0.5 | 7.7% ± 0.3 | 293 | 0 | 1.21 / 17.4 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sheldor.micro.Continuation 1.1 | 20 | 13 | 298 | 0 | 0.42 | 6 | 6 | 0 |

13 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sheldor.micro.Continuation 1.1 | 50334 | 196 | 50313 | 50295 (99.9%) | 39 (0.1%) | 18 (0.0%) | 3309 | 492 | 190 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sheldor.micro.Continuation 1.1 | 51235 | 5172 (10.1%) | 46561 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sheldor.micro.Continuation 1.1 | 650 | 525 | 628 | 939 | 36.9 / 31.1 | 1406 | 7220 | 7135 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sheldor.micro.Continuation 1.1 | 7.7% | 293 | 1420 | 3 | 70.7 | 5155 / 5172 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| sheldor.micro.Continuation 1.1 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.micro.Continuation 1.1 | sheldor.micro.Continuation | 1 | 35 | 336 | 9.4% | 9.0% ± 1.1 | 11.7% | 25.6% / 21.8% | 4.8% | 0 / 0 | T3/M0 | 65% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
