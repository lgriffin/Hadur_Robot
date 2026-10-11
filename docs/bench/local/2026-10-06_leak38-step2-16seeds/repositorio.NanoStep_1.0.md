# repositorio.NanoStep 1.0 (weak) vs hadur2.Hadur 3.8.1

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 98.2% | 100.0% | 96.5% | 35 / 35 | 28.3% | 1.8% | 10 | 0 | 0.70 / 16.2 | 94.8% | +3.4 |
| 2 | 94.3% | 97.1% | 91.5% | 34 / 35 | 27.4% | 4.0% | 13 | 0 | 0.80 / 15.1 | 95.8% | -1.6 |
| 3 | 96.7% | 100.0% | 93.6% | 35 / 35 | 25.2% | 3.8% | 12 | 0 | 0.80 / 15.9 | 97.4% | -0.6 |
| 4 | 98.6% | 100.0% | 97.2% | 35 / 35 | 27.0% | 0.4% | 12 | 0 | 0.69 / 16.7 | 96.7% | +1.9 |
| 5 | 94.7% | 100.0% | 89.8% | 35 / 35 | 26.0% | 4.2% | 16 | 0 | 0.75 / 13.9 | 98.6% | -3.9 |
| 6 | 97.4% | 100.0% | 94.8% | 35 / 35 | 26.1% | 3.2% | 9 | 0 | 0.74 / 60.6 | 94.5% | +2.9 |
| 7 | 98.9% | 100.0% | 97.8% | 35 / 35 | 28.0% | 0.6% | 12 | 0 | 0.68 / 99.3 | 89.5% | +9.5 |
| 8 | 98.8% | 100.0% | 97.5% | 35 / 35 | 28.7% | 1.3% | 14 | 0 | 0.72 / 14.1 | 97.5% | +1.2 |
| 9 | 95.2% | 100.0% | 90.8% | 35 / 35 | 25.3% | 5.0% | 9 | 0 | 0.79 / 307.2 | 99.3% | -4.1 |
| 10 | 97.8% | 100.0% | 95.7% | 35 / 35 | 28.6% | 2.5% | 13 | 0 | 0.74 / 169.5 | 95.6% | +2.1 |
| 11 | 96.0% | 100.0% | 92.0% | 35 / 35 | 26.6% | 2.6% | 11 | 0 | 0.73 / 314.9 | 96.8% | -0.8 |
| 12 | 92.5% | 100.0% | 86.0% | 35 / 35 | 27.0% | 6.1% | 13 | 0 | 0.80 / 184.7 | 96.6% | -4.1 |
| 13 | 94.0% | 100.0% | 88.7% | 35 / 35 | 30.7% | 5.7% | 11 | 0 | 0.81 / 139.8 | 94.4% | -0.4 |
| 14 | 94.3% | 97.1% | 90.9% | 34 / 35 | 21.7% | 2.4% | 12 | 0 | 0.74 / 314.0 | 98.8% | -4.5 |
| 15 | 99.1% | 100.0% | 98.2% | 35 / 35 | 27.8% | 0.9% | 12 | 0 | 0.74 / 112.3 | 92.8% | +6.3 |
| 16 | 93.9% | 97.1% | 90.8% | 34 / 35 | 30.5% | 3.6% | 15 | 0 | 0.76 / 15.9 | 89.7% | +4.2 |

Mean score share 96.3% ± 1.2, baseline 95.5% ± 1.6, paired diff +0.7 ± 2.1.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 194 over 16 battles (12.1 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| repositorio.NanoStep 1.0 | weak | 96.3% ± 1.2 | 99.5% ± 0.6 | 93.2% ± 2.0 | 557 / 560 | 27.2% ± 1.2 | 3.0% ± 0.9 | 194 | 0 | 0.81 / 314.9 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| repositorio.NanoStep 1.0 | 11177 | 68 | 11061 | 11058 (98.9%) | 119 (1.1%) | 3 (0.0%) | 413 | 239 | 472 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| repositorio.NanoStep 1.0 | 9876 | 671 (6.8%) | 3828 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| repositorio.NanoStep 1.0 | 650 | 456 | 400 | 297 | 71.1 / 5.3 | 7057 | 7016 | 619 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| repositorio.NanoStep 1.0 | 3.0% | 194 | 75 | 3 | 19.6 | 661 / 671 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| repositorio.NanoStep 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| repositorio.NanoStep 1.0 | repositorio.NanoStep | 1 | 35 | 312 | 5.1% | 3.9% ± 1.7 | 21.8% | 60.3% / 53.9% | 0.7% | 0 / 0 | T1/M? | 94% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
