# repositorio.NanoStep 1.0 (weak) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 97.1% | 100.0% | 94.2% | 35 / 35 | 28.1% | 2.9% | 18 | 0 | 0.71 / 14.2 | 91.6% | +5.5 |
| 2 | 94.8% | 100.0% | 90.1% | 35 / 35 | 25.6% | 4.5% | 15 | 0 | 0.81 / 16.0 | 97.5% | -2.7 |
| 3 | 94.5% | 100.0% | 89.9% | 35 / 35 | 29.6% | 5.1% | 15 | 0 | 0.82 / 12.8 | 99.7% | -5.1 |
| 4 | 96.2% | 100.0% | 92.5% | 35 / 35 | 25.5% | 3.5% | 15 | 0 | 0.78 / 14.7 | 97.9% | -1.8 |
| 5 | 99.1% | 100.0% | 98.3% | 35 / 35 | 27.7% | 1.1% | 16 | 0 | 0.79 / 13.9 | 98.7% | +0.5 |
| 6 | 99.8% | 100.0% | 99.5% | 35 / 35 | 26.5% | 0.4% | 13 | 0 | 0.75 / 17.7 | 98.1% | +1.7 |
| 7 | 91.6% | 97.1% | 86.7% | 34 / 35 | 28.3% | 6.0% | 16 | 0 | 0.86 / 13.6 | 95.7% | -4.0 |
| 8 | 94.2% | 100.0% | 89.2% | 35 / 35 | 30.0% | 6.3% | 11 | 0 | 0.93 / 13.5 | 97.2% | -3.0 |
| 9 | 96.5% | 100.0% | 93.2% | 35 / 35 | 27.2% | 2.7% | 12 | 0 | 0.82 / 17.1 | 99.7% | -3.2 |
| 10 | 98.8% | 100.0% | 97.6% | 35 / 35 | 26.5% | 0.6% | 16 | 0 | 0.81 / 14.5 | 95.9% | +2.9 |
| 11 | 94.4% | 100.0% | 89.3% | 35 / 35 | 26.8% | 5.7% | 14 | 0 | 0.88 / 16.0 | 94.0% | +0.3 |
| 12 | 98.0% | 100.0% | 96.0% | 35 / 35 | 27.2% | 1.7% | 19 | 0 | 0.75 / 15.3 | 96.4% | +1.6 |
| 13 | 92.4% | 97.1% | 88.0% | 34 / 35 | 25.9% | 11.4% | 18 | 0 | 0.82 / 13.6 | 93.2% | -0.8 |
| 14 | 93.0% | 97.1% | 89.2% | 34 / 35 | 27.8% | 4.2% | 14 | 0 | 0.77 / 10.8 | 92.2% | +0.7 |
| 15 | 96.6% | 100.0% | 93.4% | 35 / 35 | 26.5% | 3.6% | 14 | 0 | 0.78 / 14.3 | 96.8% | -0.1 |
| 16 | 94.0% | 97.1% | 91.0% | 34 / 35 | 29.5% | 4.1% | 15 | 0 | 0.75 / 14.3 | 93.5% | +0.4 |

Mean score share 95.7% ± 1.3, baseline 96.1% ± 1.4, paired diff -0.4 ± 1.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 241 over 16 battles (15.1 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| repositorio.NanoStep 1.0 | weak | 95.7% ± 1.3 | 99.3% ± 0.7 | 92.4% ± 2.1 | 556 / 560 | 27.4% ± 0.7 | 4.0% ± 1.4 | 241 | 0 | 0.93 / 17.7 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| repositorio.NanoStep 1.0 | 10995 | 65 | 10829 | 10825 (98.5%) | 170 (1.5%) | 4 (0.0%) | 369 | 237 | 475 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| repositorio.NanoStep 1.0 | 9750 | 641 (6.6%) | 3274 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| repositorio.NanoStep 1.0 | 650 | 456 | 400 | 293 | 71.8 / 6.1 | 7198 | 6559 | 587 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| repositorio.NanoStep 1.0 | 4.0% | 241 | 884 | 3 | 19.3 | 626 / 641 (98%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| repositorio.NanoStep 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| repositorio.NanoStep 1.0 | repositorio.NanoStep | 1 | 35 | 312 | 5.6% | 4.4% ± 1.7 | 21.7% | 52.9% / 49.3% | 1.4% | 0 / 0 | T1/M? | 94% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
