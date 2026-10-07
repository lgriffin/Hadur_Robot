# dft.Cardigan 1.09 (mid) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 72.6% | 85.7% | 57.8% | 30 / 35 | 11.3% | 7.4% | 13 | 0 | 1.04 / 19.4 | 67.5% | +5.1 |
| 2 | 73.3% | 88.6% | 57.9% | 31 / 35 | 11.6% | 7.4% | 12 | 0 | 1.06 / 18.6 | 74.7% | -1.4 |
| 3 | 67.6% | 85.7% | 48.5% | 30 / 35 | 10.7% | 7.7% | 13 | 0 | 1.13 / 18.5 | 67.2% | +0.4 |
| 4 | 75.3% | 91.4% | 57.7% | 32 / 35 | 11.7% | 7.0% | 9 | 0 | 1.10 / 19.5 | 66.3% | +9.0 |
| 5 | 74.5% | 94.3% | 54.3% | 33 / 35 | 11.8% | 8.7% | 11 | 0 | 1.09 / 19.6 | 74.6% | -0.0 |
| 6 | 75.4% | 91.4% | 57.9% | 32 / 35 | 11.1% | 7.8% | 16 | 0 | 1.14 / 20.2 | 69.7% | +5.7 |
| 7 | 72.7% | 88.6% | 54.9% | 31 / 35 | 10.7% | 6.9% | 16 | 0 | 1.08 / 20.1 | 72.3% | +0.4 |
| 8 | 81.6% | 100.0% | 61.9% | 35 / 35 | 12.5% | 7.0% | 12 | 0 | 1.10 / 21.2 | 68.1% | +13.5 |
| 9 | 67.7% | 80.0% | 55.6% | 28 / 35 | 11.6% | 8.2% | 14 | 0 | 1.13 / 18.6 | 79.5% | -11.7 |
| 10 | 68.7% | 85.7% | 50.5% | 30 / 35 | 10.6% | 8.4% | 17 | 0 | 1.12 / 18.9 | 67.7% | +1.0 |
| 11 | 74.7% | 91.4% | 58.0% | 32 / 35 | 11.7% | 8.0% | 9 | 0 | 1.08 / 18.1 | 75.6% | -0.9 |
| 12 | 68.2% | 85.3% | 50.4% | 30 / 35 | 10.7% | 8.2% | 14 | 0 | 1.15 / 19.8 | 75.1% | -6.9 |
| 13 | 75.2% | 94.3% | 55.1% | 33 / 35 | 11.0% | 11.2% | 15 | 0 | 1.08 / 18.9 | 71.3% | +3.9 |
| 14 | 73.1% | 91.4% | 54.6% | 32 / 35 | 11.6% | 8.3% | 14 | 0 | 1.11 / 19.0 | 69.4% | +3.6 |
| 15 | 69.0% | 85.7% | 51.6% | 30 / 35 | 11.2% | 7.8% | 17 | 0 | 1.11 / 19.1 | 69.3% | -0.3 |
| 16 | 69.3% | 82.9% | 55.3% | 29 / 35 | 12.0% | 7.4% | 13 | 0 | 1.05 / 18.8 | 63.6% | +5.7 |
| 17 | 70.6% | 88.6% | 50.8% | 31 / 35 | 10.6% | 7.8% | 14 | 0 | 1.06 / 19.6 | 77.7% | -7.1 |
| 18 | 74.9% | 91.4% | 58.4% | 32 / 35 | 12.2% | 7.4% | 13 | 0 | 1.10 / 19.5 | 70.2% | +4.7 |
| 19 | 72.7% | 88.6% | 54.7% | 31 / 35 | 10.6% | 7.1% | 13 | 0 | 1.10 / 19.5 | 67.6% | +5.2 |
| 20 | 73.8% | 94.3% | 52.2% | 33 / 35 | 10.6% | 7.5% | 14 | 0 | 1.12 / 18.2 | 77.1% | -3.3 |

Mean score share 72.6% ± 1.6, baseline 71.2% ± 2.0, paired diff +1.3 ± 2.7.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 269 over 20 battles (13.5 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dft.Cardigan 1.09 | mid | 72.6% ± 1.6 | 89.3% ± 2.2 | 54.9% ± 1.6 | 625 / 700 | 11.3% ± 0.3 | 7.9% ± 0.4 | 269 | 0 | 1.15 / 21.2 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dft.Cardigan 1.09 | 20 | 16 | 298 | 0 | 0.38 | 3 | 2 | 0 |

16 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dft.Cardigan 1.09 | 35037 | 27 | 35150 | 34906 (99.6%) | 131 (0.4%) | 244 (0.7%) | 3537 | 404 | 181 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dft.Cardigan 1.09 | 43452 | 3498 (8.1%) | 35496 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dft.Cardigan 1.09 | 650 | 495 | 625 | 815 | 34.4 / 28.2 | 696 | 14162 | 4826 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dft.Cardigan 1.09 | 7.9% | 269 | 987 | 3 | 49.9 | 3484 / 3498 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dft.Cardigan 1.09 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| dft.Cardigan 1.09 | dft.Cardigan | 1 | 35 | 282 | 7.9% | 7.8% ± 1.3 | 10.3% | 23.2% / 23.7% | 4.4% | 0 / 0 | T3/M1 | 73% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
