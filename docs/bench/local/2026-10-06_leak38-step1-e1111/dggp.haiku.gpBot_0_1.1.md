# dggp.haiku.gpBot_0 1.1 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 91.3% | 100.0% | 82.5% | 35 / 35 | 23.4% | 4.7% | 13 | 0 | 0.72 / 13.5 | 90.1% | +1.2 |
| 2 | 83.6% | 91.4% | 76.6% | 32 / 35 | 24.4% | 6.3% | 12 | 0 | 0.74 / 8.0 | 96.0% | -12.4 |
| 3 | 95.4% | 100.0% | 90.6% | 35 / 35 | 29.5% | 3.3% | 10 | 0 | 0.68 / 15.1 | 84.9% | +10.6 |
| 4 | 94.8% | 100.0% | 89.1% | 35 / 35 | 25.6% | 3.1% | 11 | 0 | 0.69 / 14.7 | 89.4% | +5.3 |
| 5 | 82.8% | 97.1% | 70.0% | 34 / 35 | 21.9% | 8.1% | 10 | 0 | 0.79 / 7.4 | 84.7% | -1.9 |
| 6 | 88.7% | 100.0% | 77.9% | 35 / 35 | 23.3% | 6.7% | 12 | 0 | 0.80 / 14.7 | 94.1% | -5.4 |
| 7 | 92.2% | 100.0% | 84.0% | 35 / 35 | 23.1% | 4.5% | 12 | 0 | 0.73 / 15.0 | 90.9% | +1.3 |
| 8 | 96.0% | 100.0% | 91.5% | 35 / 35 | 27.0% | 2.4% | 10 | 0 | 0.67 / 15.9 | 96.1% | -0.1 |
| 9 | 95.9% | 100.0% | 91.4% | 35 / 35 | 28.3% | 2.9% | 10 | 0 | 0.69 / 14.6 | 90.1% | +5.8 |
| 10 | 94.3% | 100.0% | 87.9% | 35 / 35 | 24.3% | 3.2% | 13 | 0 | 0.69 / 14.4 | 92.1% | +2.2 |
| 11 | 91.7% | 100.0% | 83.5% | 35 / 35 | 27.3% | 5.3% | 9 | 0 | 0.72 / 15.6 | 93.3% | -1.6 |
| 12 | 96.4% | 100.0% | 92.7% | 35 / 35 | 30.1% | 1.8% | 11 | 0 | 0.68 / 15.8 | 96.1% | +0.4 |
| 13 | 95.4% | 100.0% | 90.3% | 35 / 35 | 25.5% | 2.5% | 13 | 0 | 0.71 / 13.6 | 95.2% | +0.3 |
| 14 | 89.9% | 97.1% | 82.7% | 34 / 35 | 24.1% | 6.6% | 14 | 0 | 0.67 / 8.7 | 95.4% | -5.5 |
| 15 | 91.9% | 97.1% | 86.2% | 34 / 35 | 23.2% | 7.1% | 12 | 0 | 0.64 / 7.6 | 94.1% | -2.3 |
| 16 | 92.4% | 100.0% | 84.4% | 35 / 35 | 24.4% | 3.9% | 10 | 0 | 0.65 / 7.6 | 90.7% | +1.8 |

Mean score share 92.0% ± 2.2, baseline 92.1% ± 2.0, paired diff -0.0 ± 2.8.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 182 over 16 battles (11.4 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | weak | 92.0% ± 2.2 | 98.9% ± 1.2 | 85.1% ± 3.3 | 554 / 560 | 25.3% ± 1.3 | 4.5% ± 1.0 | 182 | 0 | 0.80 / 15.9 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 7953 | 27 | 7922 | 7918 (99.6%) | 35 (0.4%) | 4 (0.1%) | 1005 | 197 | 52 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 9050 | 469 (5.2%) | 1026 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 650 | 431 | 400 | 270 | 58.0 / 10.5 | 6209 | 8290 | 3823 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 4.5% | 182 | 71 | 3 | 14.1 | 467 / 469 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | dggp.haiku.gpBot_0 | 1 | 35 | 304 | 4.7% | 4.6% ± 1.9 | 19.2% | 39.0% / 38.8% | 10.9% | 0 / 0 | T2/M? | 92% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
