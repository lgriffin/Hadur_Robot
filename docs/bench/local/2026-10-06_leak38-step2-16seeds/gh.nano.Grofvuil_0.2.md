# gh.nano.Grofvuil 0.2 (weak) vs hadur2.Hadur 3.8.1

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 99.4% | 100.0% | 98.7% | 35 / 35 | 39.4% | 1.0% | 13 | 0 | 0.76 / 9.9 | 99.3% | +0.0 |
| 2 | 98.2% | 100.0% | 96.6% | 35 / 35 | 39.2% | 1.9% | 12 | 0 | 0.72 / 9.6 | 98.2% | +0.0 |
| 3 | 98.5% | 100.0% | 97.0% | 35 / 35 | 36.8% | 1.8% | 19 | 0 | 0.71 / 33.3 | 98.3% | +0.2 |
| 4 | 99.2% | 100.0% | 98.4% | 35 / 35 | 39.9% | 1.3% | 15 | 0 | 0.67 / 9.4 | 98.0% | +1.2 |
| 5 | 98.3% | 100.0% | 96.6% | 35 / 35 | 40.2% | 1.8% | 13 | 0 | 0.73 / 66.2 | 98.9% | -0.7 |
| 6 | 98.0% | 100.0% | 96.1% | 35 / 35 | 41.6% | 2.2% | 14 | 0 | 0.71 / 73.5 | 95.7% | +2.3 |
| 7 | 98.9% | 100.0% | 97.8% | 35 / 35 | 47.8% | 1.6% | 12 | 0 | 0.74 / 39.7 | 98.8% | +0.1 |
| 8 | 99.1% | 100.0% | 98.2% | 35 / 35 | 45.7% | 1.1% | 12 | 0 | 0.71 / 60.0 | 98.8% | +0.2 |
| 9 | 97.7% | 100.0% | 95.5% | 35 / 35 | 43.0% | 2.4% | 11 | 0 | 0.73 / 22.9 | 98.4% | -0.8 |
| 10 | 98.5% | 100.0% | 97.1% | 35 / 35 | 40.6% | 1.3% | 12 | 0 | 0.71 / 85.0 | 97.9% | +0.7 |
| 11 | 98.2% | 100.0% | 96.5% | 35 / 35 | 39.2% | 2.4% | 13 | 0 | 0.71 / 11.0 | 98.1% | +0.1 |
| 12 | 97.3% | 100.0% | 94.8% | 35 / 35 | 42.1% | 2.5% | 14 | 0 | 0.69 / 336.6 | 98.7% | -1.4 |
| 13 | 98.1% | 100.0% | 96.3% | 35 / 35 | 42.2% | 1.6% | 11 | 0 | 0.71 / 9.0 | 98.9% | -0.8 |
| 14 | 94.4% | 97.1% | 91.9% | 34 / 35 | 41.8% | 2.6% | 12 | 0 | 0.69 / 9.9 | 97.5% | -3.1 |
| 15 | 97.8% | 100.0% | 95.7% | 35 / 35 | 42.9% | 2.3% | 14 | 0 | 0.72 / 9.2 | 97.7% | +0.1 |
| 16 | 98.9% | 100.0% | 97.9% | 35 / 35 | 42.8% | 1.0% | 40 | 0 | 0.71 / 9.4 | 97.8% | +1.1 |

Mean score share 98.2% ± 0.6, baseline 98.2% ± 0.5, paired diff -0.0 ± 0.6.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 237 over 16 battles (14.8 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | weak | 98.2% ± 0.6 | 99.8% ± 0.4 | 96.6% ± 0.9 | 559 / 560 | 41.6% ± 1.4 | 1.8% ± 0.3 | 237 | 0 | 0.76 / 336.6 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 7223 | 49 | 7169 | 7154 (99.0%) | 69 (1.0%) | 15 (0.2%) | 226 | 224 | 40 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 6755 | 581 (8.6%) | 2231 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 650 | 353 | 400 | 210 | 75.6 / 2.7 | 4646 | 5414 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 1.8% | 237 | 59 | 3 | 12.8 | 578 / 581 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | gh.nano.Grofvuil | 1 | 35 | 296 | 1.6% | 1.2% ± 1.2 | 27.7% | 51.5% / 53.8% | 7.7% | 0 / 0 | T0/M? | 99% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
