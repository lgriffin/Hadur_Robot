# gh.nano.Grofvuil 0.2 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 96.9% | 100.0% | 93.9% | 35 / 35 | 40.2% | 2.9% | 15 | 0 | 0.77 / 163.1 | 98.9% | -2.1 |
| 2 | 97.9% | 100.0% | 96.0% | 35 / 35 | 41.7% | 2.1% | 13 | 0 | 0.75 / 192.0 | 98.5% | -0.5 |
| 3 | 97.1% | 100.0% | 94.4% | 35 / 35 | 42.9% | 2.3% | 11 | 0 | 0.84 / 251.0 | 99.1% | -2.0 |
| 4 | 98.2% | 100.0% | 96.5% | 35 / 35 | 38.1% | 1.6% | 17 | 0 | 0.78 / 386.0 | 98.2% | -0.0 |
| 5 | 98.6% | 100.0% | 97.2% | 35 / 35 | 37.9% | 1.6% | 95 | 0 | 0.79 / 10.6 | 98.3% | +0.2 |
| 6 | 96.3% | 97.1% | 95.5% | 34 / 35 | 38.4% | 4.6% | 27 | 0 | 0.77 / 66.9 | 97.4% | -1.1 |
| 7 | 98.2% | 100.0% | 96.4% | 35 / 35 | 39.9% | 2.0% | 13 | 0 | 0.81 / 14.4 | 98.6% | -0.4 |
| 8 | 98.6% | 100.0% | 97.3% | 35 / 35 | 42.4% | 1.6% | 13 | 0 | 0.79 / 9.3 | 97.2% | +1.4 |
| 9 | 98.4% | 100.0% | 96.8% | 35 / 35 | 41.2% | 1.4% | 15 | 0 | 0.84 / 13.8 | 99.1% | -0.7 |
| 10 | 98.2% | 100.0% | 96.5% | 35 / 35 | 42.1% | 1.9% | 12 | 0 | 0.80 / 8.7 | 98.5% | -0.3 |
| 11 | 99.2% | 100.0% | 98.4% | 35 / 35 | 41.3% | 0.9% | 14 | 0 | 0.75 / 10.4 | 99.3% | -0.1 |
| 12 | 96.3% | 97.1% | 95.4% | 34 / 35 | 40.9% | 18.1% | 18 | 0 | 0.73 / 9.9 | 98.4% | -2.1 |
| 13 | 98.5% | 100.0% | 97.1% | 35 / 35 | 42.4% | 1.5% | 13 | 0 | 0.78 / 23.6 | 98.2% | +0.3 |
| 14 | 98.2% | 100.0% | 96.5% | 35 / 35 | 39.2% | 1.4% | 13 | 0 | 0.82 / 14.2 | 98.9% | -0.7 |
| 15 | 98.9% | 100.0% | 97.9% | 35 / 35 | 39.4% | 1.4% | 14 | 0 | 0.77 / 9.8 | 98.2% | +0.7 |
| 16 | 98.1% | 100.0% | 96.3% | 35 / 35 | 40.1% | 1.9% | 11 | 0 | 0.83 / 23.2 | 95.4% | +2.8 |

Mean score share 98.0% ± 0.5, baseline 98.3% ± 0.5, paired diff -0.3 ± 0.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 314 over 16 battles (19.6 per battle, most in one battle 95). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | weak | 98.0% ± 0.5 | 99.6% ± 0.5 | 96.4% ± 0.6 | 558 / 560 | 40.5% ± 0.9 | 3.0% ± 2.2 | 314 | 0 | 0.84 / 386.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 7511 | 39 | 7354 | 7341 (97.7%) | 170 (2.3%) | 13 (0.2%) | 248 | 196 | 45 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 7083 | 585 (8.3%) | 2576 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 650 | 349 | 400 | 217 | 74.9 / 2.8 | 4691 | 5736 | 83 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 3.0% | 314 | 664 | 3 | 13.1 | 572 / 585 (98%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | gh.nano.Grofvuil | 1 | 35 | 296 | 2.9% | 2.1% ± 1.5 | 25.9% | 48.9% / 51.1% | 7.0% | 0 / 0 | T1/M? | 98% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
