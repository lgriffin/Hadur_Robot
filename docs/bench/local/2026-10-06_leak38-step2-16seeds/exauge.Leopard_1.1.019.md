# exauge.Leopard 1.1.019 (weak) vs hadur2.Hadur 3.8.1

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 83.6% | 100.0% | 74.8% | 35 / 35 | 78.9% | 36.8% | 11 | 0 | 0.62 / 7.9 | 83.7% | -0.0 |
| 2 | 83.7% | 100.0% | 74.6% | 35 / 35 | 78.7% | 37.1% | 12 | 0 | 0.57 / 9.2 | 83.9% | -0.2 |
| 3 | 84.1% | 100.0% | 75.2% | 35 / 35 | 79.4% | 37.4% | 8 | 0 | 0.59 / 7.4 | 82.5% | +1.7 |
| 4 | 83.2% | 100.0% | 73.9% | 35 / 35 | 80.7% | 39.4% | 11 | 0 | 0.61 / 9.9 | 83.7% | -0.5 |
| 5 | 82.2% | 97.1% | 74.1% | 34 / 35 | 79.2% | 51.7% | 14 | 0 | 0.60 / 51.4 | 79.4% | +2.8 |
| 6 | 84.2% | 100.0% | 74.9% | 35 / 35 | 81.4% | 36.2% | 15 | 0 | 0.64 / 9.2 | 83.1% | +1.0 |
| 7 | 81.9% | 97.1% | 74.0% | 34 / 35 | 77.5% | 35.4% | 17 | 0 | 0.63 / 10.2 | 85.2% | -3.3 |
| 8 | 83.1% | 100.0% | 74.3% | 35 / 35 | 80.7% | 35.9% | 12 | 0 | 0.65 / 9.4 | 81.6% | +1.5 |
| 9 | 80.6% | 100.0% | 70.7% | 35 / 35 | 80.7% | 45.1% | 11 | 0 | 0.65 / 11.1 | 82.8% | -2.2 |
| 10 | 83.3% | 100.0% | 73.9% | 35 / 35 | 79.3% | 37.1% | 13 | 0 | 0.68 / 10.2 | 83.7% | -0.3 |
| 11 | 83.1% | 100.0% | 73.4% | 35 / 35 | 79.2% | 39.1% | 12 | 0 | 0.65 / 10.2 | 84.1% | -1.0 |
| 12 | 82.0% | 97.1% | 74.4% | 34 / 35 | 81.6% | 53.7% | 15 | 0 | 0.66 / 9.6 | 85.5% | -3.4 |
| 13 | 82.4% | 100.0% | 73.3% | 35 / 35 | 82.6% | 39.3% | 13 | 0 | 0.64 / 17.0 | 83.3% | -0.9 |
| 14 | 82.6% | 100.0% | 73.1% | 35 / 35 | 80.4% | 41.0% | 13 | 0 | 0.63 / 9.9 | 79.3% | +3.3 |
| 15 | 82.2% | 97.1% | 74.9% | 34 / 35 | 79.5% | 35.3% | 15 | 0 | 0.61 / 9.6 | 85.1% | -2.9 |
| 16 | 82.3% | 100.0% | 72.5% | 35 / 35 | 80.4% | 41.6% | 15 | 0 | 0.66 / 9.9 | 81.9% | +0.4 |

Mean score share 82.8% ± 0.5, baseline 83.0% ± 1.0, paired diff -0.3 ± 1.1.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 207 over 16 battles (12.9 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | weak | 82.8% ± 0.5 | 99.3% ± 0.7 | 73.9% ± 0.6 | 556 / 560 | 80.0% ± 0.7 | 40.1% ± 3.0 | 207 | 0 | 0.68 / 51.4 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 4345 | 25 | 4301 | 4297 (98.9%) | 48 (1.1%) | 4 (0.1%) | 670 | 431 | 51 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| exauge.Leopard 1.1.019 | 4255 | 80 (1.9%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 650 | 201 | 455 | 140 | 101.0 / 35.8 | 3615 | 5143 | 12 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 40.1% | 207 | 40 | 3 | 7.6 | 80 / 80 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | exauge.Leopard | 1 | 35 | 296 | 49.1% | 11.0% ± 3.8 | 46.2% | 14.8% / 16.1% | 2.7% | 0 / 0 | T?/M? | 79% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
