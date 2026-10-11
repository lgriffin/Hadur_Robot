# dggp.haiku.gpBot_0 1.1 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 96.6% | 100.0% | 92.7% | 35 / 35 | 25.0% | 1.8% | 13 | 0 | 0.84 / 206.3 | 93.4% | +3.2 |
| 2 | 90.0% | 97.1% | 82.7% | 34 / 35 | 24.7% | 4.2% | 13 | 0 | 0.86 / 145.2 | 92.6% | -2.6 |
| 3 | 94.3% | 100.0% | 87.8% | 35 / 35 | 26.5% | 2.5% | 11 | 0 | 0.83 / 78.5 | 95.9% | -1.7 |
| 4 | 93.3% | 97.1% | 89.4% | 34 / 35 | 29.4% | 3.0% | 21 | 0 | 0.79 / 18.9 | 90.8% | +2.6 |
| 5 | 89.2% | 97.1% | 81.2% | 34 / 35 | 24.6% | 6.0% | 12 | 0 | 0.89 / 36.1 | 94.0% | -4.8 |
| 6 | 94.6% | 100.0% | 89.2% | 35 / 35 | 25.0% | 8.2% | 14 | 0 | 0.83 / 14.8 | 90.9% | +3.7 |
| 7 | 86.0% | 94.3% | 77.5% | 33 / 35 | 22.2% | 5.8% | 17 | 0 | 0.94 / 14.4 | 94.5% | -8.5 |
| 8 | 96.5% | 100.0% | 92.8% | 35 / 35 | 28.9% | 2.1% | 11 | 0 | 0.84 / 15.8 | 91.1% | +5.4 |
| 9 | 92.0% | 100.0% | 83.9% | 35 / 35 | 23.9% | 4.1% | 15 | 0 | 0.86 / 15.1 | 93.7% | -1.8 |
| 10 | 86.7% | 94.3% | 79.3% | 33 / 35 | 24.9% | 18.7% | 15 | 0 | 0.88 / 15.3 | 92.2% | -5.5 |
| 11 | 96.6% | 100.0% | 92.8% | 35 / 35 | 26.2% | 2.0% | 12 | 0 | 0.85 / 23.4 | 96.1% | +0.5 |
| 12 | 85.4% | 97.1% | 75.0% | 34 / 35 | 25.8% | 8.1% | 15 | 0 | 0.91 / 14.2 | 93.9% | -8.6 |
| 13 | 90.2% | 97.1% | 82.7% | 34 / 35 | 22.3% | 17.9% | 14 | 0 | 0.82 / 17.0 | 96.0% | -5.8 |
| 14 | 97.1% | 100.0% | 93.8% | 35 / 35 | 27.9% | 1.7% | 17 | 0 | 0.81 / 14.9 | 95.5% | +1.6 |
| 15 | 89.1% | 94.3% | 83.7% | 33 / 35 | 24.7% | 7.6% | 14 | 0 | 0.83 / 39.4 | 92.4% | -3.3 |
| 16 | 92.3% | 97.1% | 86.6% | 34 / 35 | 22.5% | 3.3% | 10 | 0 | 0.83 / 46.6 | 96.6% | -4.4 |

Mean score share 91.9% ± 2.1, baseline 93.7% ± 1.0, paired diff -1.9 ± 2.3.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 224 over 16 battles (14.0 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | weak | 91.9% ± 2.1 | 97.9% ± 1.2 | 85.7% ± 3.1 | 548 / 560 | 25.3% ± 1.1 | 6.1% ± 2.8 | 224 | 0 | 0.94 / 206.3 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 7935 | 42 | 7848 | 7844 (98.9%) | 91 (1.1%) | 4 (0.1%) | 967 | 207 | 61 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 9067 | 456 (5.0%) | 379 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 650 | 428 | 400 | 270 | 57.3 / 9.8 | 6183 | 8177 | 4151 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 6.1% | 224 | 212 | 3 | 14.0 | 452 / 456 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | dggp.haiku.gpBot_0 | 1 | 35 | 304 | 4.3% | 4.2% ± 1.9 | 18.5% | 37.3% / 33.1% | 13.6% | 0 / 0 | T1/M? | 91% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
