# exauge.Leopard 1.1.019 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 85.6% | 100.0% | 77.0% | 35 / 35 | 80.4% | 31.8% | 13 | 0 | 0.61 / 8.4 | 85.1% | +0.5 |
| 2 | 82.2% | 100.0% | 72.3% | 35 / 35 | 78.8% | 41.2% | 13 | 0 | 0.62 / 10.4 | 84.0% | -1.8 |
| 3 | 81.5% | 100.0% | 71.7% | 35 / 35 | 82.1% | 43.7% | 10 | 0 | 0.61 / 9.6 | 83.3% | -1.8 |
| 4 | 81.6% | 97.1% | 73.3% | 34 / 35 | 82.0% | 57.2% | 14 | 0 | 0.59 / 9.8 | 86.3% | -4.7 |
| 5 | 81.0% | 97.1% | 72.7% | 34 / 35 | 80.8% | 41.3% | 7 | 0 | 0.63 / 11.2 | 83.8% | -2.8 |
| 6 | 81.4% | 97.1% | 73.0% | 34 / 35 | 80.3% | 53.3% | 14 | 0 | 0.62 / 10.5 | 81.9% | -0.5 |
| 7 | 83.4% | 100.0% | 73.9% | 35 / 35 | 82.6% | 39.4% | 13 | 0 | 0.63 / 43.7 | 87.9% | -4.5 |
| 8 | 83.8% | 100.0% | 75.7% | 35 / 35 | 80.0% | 37.2% | 10 | 0 | 0.66 / 10.1 | 84.9% | -1.1 |
| 9 | 81.4% | 100.0% | 71.6% | 35 / 35 | 79.7% | 40.9% | 13 | 0 | 0.67 / 9.9 | 82.0% | -0.6 |
| 10 | 82.2% | 97.1% | 74.5% | 34 / 35 | 78.3% | 49.6% | 13 | 0 | 0.68 / 10.4 | 84.3% | -2.1 |
| 11 | 84.0% | 100.0% | 74.7% | 35 / 35 | 76.5% | 35.7% | 13 | 0 | 0.70 / 11.7 | 85.6% | -1.6 |
| 12 | 82.0% | 100.0% | 72.2% | 35 / 35 | 80.4% | 41.9% | 13 | 0 | 0.68 / 10.3 | 81.5% | +0.5 |
| 13 | 81.2% | 97.1% | 72.9% | 34 / 35 | 79.9% | 53.7% | 13 | 0 | 0.65 / 8.0 | 84.1% | -2.9 |
| 14 | 83.0% | 100.0% | 73.6% | 35 / 35 | 80.9% | 39.7% | 14 | 0 | 0.65 / 90.8 | 84.5% | -1.6 |
| 15 | 84.6% | 100.0% | 75.8% | 35 / 35 | 80.1% | 37.2% | 14 | 0 | 0.65 / 25.9 | 84.1% | +0.6 |
| 16 | 80.7% | 100.0% | 71.0% | 35 / 35 | 82.2% | 56.4% | 14 | 0 | 0.65 / 11.2 | 85.7% | -4.9 |

Mean score share 82.5% ± 0.8, baseline 84.3% ± 0.9, paired diff -1.8 ± 1.0.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 201 over 16 battles (12.6 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | weak | 82.5% ± 0.8 | 99.1% ± 0.7 | 73.5% ± 0.9 | 555 / 560 | 80.3% ± 0.8 | 43.8% ± 4.2 | 201 | 0 | 0.70 / 90.8 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 4353 | 30 | 4298 | 4295 (98.7%) | 58 (1.3%) | 3 (0.1%) | 581 | 436 | 48 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| exauge.Leopard 1.1.019 | 4288 | 89 (2.1%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 650 | 203 | 516 | 140 | 101.5 / 36.7 | 3588 | 5490 | 16 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 43.8% | 201 | 40 | 3 | 7.6 | 88 / 89 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | exauge.Leopard | 1 | 35 | 296 | 50.6% | 11.6% ± 4.0 | 46.0% | 16.1% / 15.0% | 3.0% | 0 / 0 | T?/M? | 78% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
