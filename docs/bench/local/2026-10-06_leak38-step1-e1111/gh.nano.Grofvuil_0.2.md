# gh.nano.Grofvuil 0.2 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 97.7% | 100.0% | 95.6% | 35 / 35 | 38.3% | 2.0% | 9 | 0 | 0.71 / 9.0 | 99.6% | -1.8 |
| 2 | 98.8% | 100.0% | 97.6% | 35 / 35 | 41.7% | 1.4% | 13 | 0 | 0.69 / 8.9 | 98.6% | +0.2 |
| 3 | 98.4% | 100.0% | 96.8% | 35 / 35 | 42.5% | 1.4% | 11 | 0 | 0.68 / 15.0 | 97.2% | +1.2 |
| 4 | 98.1% | 100.0% | 96.3% | 35 / 35 | 40.8% | 2.3% | 13 | 0 | 0.64 / 13.6 | 98.4% | -0.3 |
| 5 | 98.2% | 100.0% | 96.5% | 35 / 35 | 44.9% | 1.9% | 12 | 0 | 0.67 / 9.3 | 98.6% | -0.4 |
| 6 | 98.9% | 100.0% | 97.8% | 35 / 35 | 40.5% | 1.4% | 13 | 0 | 0.64 / 9.2 | 98.6% | +0.2 |
| 7 | 98.1% | 100.0% | 96.4% | 35 / 35 | 39.4% | 1.5% | 11 | 0 | 0.61 / 9.0 | 97.7% | +0.4 |
| 8 | 98.4% | 100.0% | 96.8% | 35 / 35 | 38.9% | 1.9% | 12 | 0 | 0.69 / 10.4 | 99.0% | -0.6 |
| 9 | 98.3% | 100.0% | 96.6% | 35 / 35 | 41.2% | 1.5% | 9 | 0 | 0.65 / 8.6 | 98.2% | +0.1 |
| 10 | 98.4% | 100.0% | 96.9% | 35 / 35 | 39.8% | 1.5% | 12 | 0 | 0.62 / 13.2 | 98.3% | +0.1 |
| 11 | 98.1% | 100.0% | 96.1% | 35 / 35 | 39.8% | 2.2% | 10 | 0 | 0.67 / 10.0 | 97.8% | +0.3 |
| 12 | 98.2% | 100.0% | 96.5% | 35 / 35 | 38.0% | 1.3% | 12 | 0 | 0.65 / 14.6 | 98.8% | -0.5 |
| 13 | 97.4% | 100.0% | 95.1% | 35 / 35 | 42.9% | 2.8% | 12 | 0 | 0.70 / 11.7 | 97.4% | +0.1 |
| 14 | 99.0% | 100.0% | 98.0% | 35 / 35 | 40.3% | 0.9% | 13 | 0 | 0.70 / 9.5 | 98.1% | +0.9 |
| 15 | 98.7% | 100.0% | 97.5% | 35 / 35 | 33.9% | 1.4% | 12 | 0 | 0.66 / 13.8 | 98.2% | +0.6 |
| 16 | 96.5% | 100.0% | 93.3% | 35 / 35 | 42.0% | 2.9% | 11 | 0 | 0.69 / 13.7 | 99.2% | -2.8 |

Mean score share 98.2% ± 0.3, baseline 98.4% ± 0.3, paired diff -0.1 ± 0.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 185 over 16 battles (11.6 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | weak | 98.2% ± 0.3 | 100.0% ± 0.0 | 96.5% ± 0.6 | 560 / 560 | 40.3% ± 1.3 | 1.8% ± 0.3 | 185 | 0 | 0.71 / 15.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 7572 | 55 | 7510 | 7497 (99.0%) | 75 (1.0%) | 13 (0.2%) | 207 | 228 | 43 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 7118 | 607 (8.5%) | 2430 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 650 | 356 | 400 | 219 | 75.1 / 2.8 | 4794 | 5957 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 1.8% | 185 | 514 | 3 | 13.4 | 601 / 607 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | gh.nano.Grofvuil | 1 | 35 | 296 | 3.1% | 2.4% ± 1.6 | 28.0% | 50.3% / 54.7% | 7.0% | 0 / 0 | T1/M? | 97% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
