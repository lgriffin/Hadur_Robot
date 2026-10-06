# sadoner.killer 0.2 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 86.8% | 94.3% | 79.5% | 33 / 35 | 21.6% | 7.2% | 13 | 0 | 0.72 / 13.4 | 83.0% | +3.8 |
| 2 | 87.1% | 100.0% | 75.5% | 35 / 35 | 19.6% | 7.3% | 10 | 0 | 0.75 / 14.6 | 82.6% | +4.5 |
| 3 | 83.8% | 94.3% | 75.0% | 33 / 35 | 21.4% | 8.1% | 11 | 0 | 0.75 / 8.7 | 83.6% | +0.2 |
| 4 | 72.0% | 82.9% | 63.5% | 29 / 35 | 20.9% | 13.8% | 13 | 0 | 0.75 / 13.8 | 90.3% | -18.3 |
| 5 | 80.7% | 91.4% | 71.2% | 32 / 35 | 19.4% | 8.1% | 11 | 0 | 0.74 / 15.6 | 81.9% | -1.3 |
| 6 | 86.6% | 97.1% | 76.6% | 34 / 35 | 20.8% | 6.9% | 12 | 0 | 0.76 / 14.7 | 83.3% | +3.3 |
| 7 | 82.9% | 94.3% | 73.3% | 33 / 35 | 22.6% | 9.3% | 14 | 0 | 0.75 / 16.2 | 80.0% | +2.9 |
| 8 | 88.2% | 97.1% | 79.7% | 34 / 35 | 22.4% | 6.8% | 10 | 0 | 0.72 / 13.7 | 91.3% | -3.1 |
| 9 | 80.5% | 91.4% | 71.6% | 32 / 35 | 20.5% | 10.8% | 10 | 0 | 0.77 / 16.0 | 87.6% | -7.1 |
| 10 | 81.5% | 88.6% | 74.7% | 31 / 35 | 19.2% | 7.3% | 12 | 0 | 0.73 / 8.2 | 84.0% | -2.5 |
| 11 | 87.6% | 94.3% | 80.5% | 33 / 35 | 19.5% | 5.7% | 9 | 0 | 0.72 / 15.1 | 82.3% | +5.3 |
| 12 | 83.1% | 91.4% | 75.2% | 32 / 35 | 19.5% | 6.9% | 13 | 0 | 0.68 / 16.4 | 87.8% | -4.7 |
| 13 | 85.0% | 94.3% | 76.1% | 33 / 35 | 20.4% | 7.0% | 12 | 0 | 0.70 / 15.1 | 84.5% | +0.5 |
| 14 | 84.1% | 97.1% | 73.2% | 34 / 35 | 20.5% | 9.5% | 12 | 0 | 0.77 / 13.9 | 85.3% | -1.1 |
| 15 | 84.9% | 94.3% | 76.1% | 33 / 35 | 21.9% | 7.3% | 12 | 0 | 0.79 / 15.0 | 88.2% | -3.3 |
| 16 | 87.3% | 100.0% | 76.6% | 35 / 35 | 22.6% | 8.8% | 12 | 0 | 0.68 / 14.5 | 81.3% | +6.1 |

Mean score share 83.9% ± 2.1, baseline 84.8% ± 1.8, paired diff -0.9 ± 3.2.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 186 over 16 battles (11.6 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | weak | 83.9% ± 2.1 | 93.9% ± 2.3 | 74.9% ± 2.1 | 526 / 560 | 20.8% ± 0.6 | 8.2% ± 1.0 | 186 | 0 | 0.79 / 16.4 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 11883 | 30 | 11806 | 11805 (99.3%) | 78 (0.7%) | 1 (0.0%) | 240 | 163 | 51 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sadoner.killer 0.2 | 11841 | 940 (7.9%) | 4411 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 650 | 292 | 450 | 344 | 59.3 / 20.1 | 6560 | 9571 | 6 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 8.2% | 186 | 78 | 3 | 21.0 | 937 / 940 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | sadoner.killer | 1 | 35 | 288 | 8.3% | 5.0% ± 1.7 | 17.6% | 22.2% / 21.1% | 5.4% | 0 / 0 | T2/M? | 87% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
