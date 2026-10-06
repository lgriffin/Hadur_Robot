# exauge.Leopard 1.1.019 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 84.1% | 100.0% | 75.0% | 35 / 35 | 79.9% | 34.6% | 13 | 0 | 0.50 / 8.8 | 82.1% | +2.1 |
| 2 | 85.1% | 100.0% | 76.5% | 35 / 35 | 78.1% | 33.4% | 9 | 0 | 0.54 / 9.4 | 84.1% | +1.0 |
| 3 | 81.7% | 100.0% | 72.1% | 35 / 35 | 80.5% | 42.6% | 9 | 0 | 0.52 / 9.5 | 81.6% | +0.0 |
| 4 | 85.2% | 100.0% | 76.4% | 35 / 35 | 80.0% | 32.7% | 12 | 0 | 0.56 / 98.4 | 83.3% | +1.9 |
| 5 | 81.2% | 97.1% | 72.7% | 34 / 35 | 80.1% | 39.3% | 13 | 0 | 0.57 / 8.7 | 81.6% | -0.4 |
| 6 | 85.7% | 100.0% | 77.1% | 35 / 35 | 78.8% | 32.4% | 12 | 0 | 0.57 / 8.2 | 85.5% | +0.2 |
| 7 | 81.5% | 97.1% | 73.7% | 34 / 35 | 78.8% | 36.2% | 12 | 0 | 0.56 / 66.1 | 82.7% | -1.2 |
| 8 | 81.5% | 100.0% | 71.9% | 35 / 35 | 82.1% | 45.5% | 10 | 0 | 0.56 / 8.4 | 82.8% | -1.3 |
| 9 | 84.0% | 100.0% | 75.1% | 35 / 35 | 81.1% | 37.4% | 8 | 0 | 0.55 / 10.0 | 85.2% | -1.2 |
| 10 | 85.1% | 100.0% | 76.6% | 35 / 35 | 77.7% | 33.6% | 12 | 0 | 0.58 / 9.4 | 82.5% | +2.5 |
| 11 | 84.9% | 100.0% | 76.0% | 35 / 35 | 80.4% | 34.5% | 12 | 0 | 0.54 / 8.1 | 83.0% | +1.9 |
| 12 | 83.7% | 100.0% | 74.4% | 35 / 35 | 77.9% | 37.8% | 15 | 0 | 0.57 / 9.2 | 84.8% | -1.1 |
| 13 | 82.6% | 100.0% | 73.3% | 35 / 35 | 77.4% | 36.9% | 9 | 0 | 0.57 / 9.3 | 85.0% | -2.4 |
| 14 | 82.9% | 100.0% | 73.3% | 35 / 35 | 81.2% | 40.9% | 10 | 0 | 0.56 / 7.3 | 83.0% | -0.1 |
| 15 | 80.7% | 97.1% | 72.2% | 34 / 35 | 80.3% | 51.2% | 15 | 0 | 0.53 / 8.8 | 85.5% | -4.9 |
| 16 | 81.2% | 100.0% | 71.5% | 35 / 35 | 84.9% | 44.5% | 11 | 0 | 0.58 / 8.6 | 81.6% | -0.4 |

Mean score share 83.2% ± 0.9, baseline 83.4% ± 0.8, paired diff -0.2 ± 1.0.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 182 over 16 battles (11.4 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | weak | 83.2% ± 0.9 | 99.5% ± 0.6 | 74.2% ± 1.0 | 557 / 560 | 80.0% ± 1.0 | 38.3% ± 2.9 | 182 | 0 | 0.58 / 98.4 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 4340 | 31 | 4325 | 4323 (99.6%) | 17 (0.4%) | 2 (0.0%) | 630 | 460 | 36 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| exauge.Leopard 1.1.019 | 4230 | 75 (1.8%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 650 | 208 | 481 | 139 | 101.1 / 35.2 | 3619 | 5435 | 17 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 38.3% | 182 | 42 | 3 | 7.7 | 75 / 75 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | exauge.Leopard | 1 | 35 | 296 | 51.1% | 11.1% ± 3.8 | 49.2% | 15.7% / 16.1% | 4.1% | 0 / 0 | T?/M? | 77% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
