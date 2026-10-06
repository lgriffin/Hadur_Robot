# ntw.Sighup 1.5 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 91.1% | 100.0% | 82.1% | 35 / 35 | 25.4% | 5.7% | 14 | 0 | 0.85 / 13.7 | 93.1% | -1.9 |
| 2 | 91.9% | 100.0% | 84.1% | 35 / 35 | 32.6% | 8.6% | 14 | 0 | 0.82 / 26.1 | 87.8% | +4.0 |
| 3 | 91.7% | 100.0% | 83.7% | 35 / 35 | 31.4% | 5.9% | 11 | 0 | 0.85 / 79.1 | 90.7% | +0.9 |
| 4 | 89.9% | 100.0% | 79.5% | 35 / 35 | 25.2% | 7.2% | 16 | 0 | 0.89 / 30.2 | 91.7% | -1.9 |
| 5 | 92.5% | 100.0% | 85.3% | 35 / 35 | 31.8% | 6.3% | 13 | 0 | 0.80 / 16.6 | 90.2% | +2.3 |
| 6 | 86.0% | 94.3% | 77.9% | 33 / 35 | 27.3% | 8.7% | 12 | 0 | 0.93 / 13.7 | 91.4% | -5.4 |
| 7 | 86.9% | 94.3% | 79.7% | 33 / 35 | 27.8% | 6.9% | 6 | 0 | 0.87 / 15.1 | 89.7% | -2.8 |
| 8 | 93.4% | 100.0% | 88.0% | 35 / 35 | 26.7% | 5.8% | 9 | 0 | 0.81 / 17.8 | 90.4% | +3.0 |
| 9 | 92.4% | 100.0% | 84.9% | 35 / 35 | 27.1% | 6.5% | 10 | 0 | 0.86 / 10.0 | 87.9% | +4.5 |
| 10 | 91.7% | 100.0% | 83.1% | 35 / 35 | 27.5% | 5.9% | 16 | 0 | 0.83 / 36.8 | 91.0% | +0.8 |
| 11 | 90.5% | 97.1% | 84.4% | 34 / 35 | 28.1% | 6.5% | 11 | 0 | 0.82 / 52.3 | 93.8% | -3.3 |
| 12 | 88.4% | 97.1% | 79.9% | 34 / 35 | 24.8% | 8.4% | 16 | 0 | 0.87 / 10.2 | 88.2% | +0.1 |
| 13 | 86.1% | 94.3% | 78.1% | 33 / 35 | 24.3% | 8.1% | 13 | 0 | 0.91 / 13.4 | 90.6% | -4.6 |
| 14 | 91.4% | 100.0% | 83.4% | 35 / 35 | 31.5% | 6.5% | 14 | 0 | 0.88 / 15.8 | 89.6% | +1.8 |
| 15 | 95.4% | 100.0% | 90.6% | 35 / 35 | 28.0% | 4.3% | 13 | 0 | 0.82 / 16.1 | 90.3% | +5.1 |
| 16 | 91.1% | 100.0% | 82.1% | 35 / 35 | 25.5% | 6.7% | 13 | 0 | 0.81 / 79.9 | 92.3% | -1.3 |

Mean score share 90.6% ± 1.4, baseline 90.6% ± 0.9, paired diff +0.1 ± 1.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 201 over 16 battles (12.6 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | weak | 90.6% ± 1.4 | 98.6% ± 1.2 | 82.9% ± 1.8 | 552 / 560 | 27.8% ± 1.4 | 6.7% ± 0.6 | 201 | 0 | 0.93 / 79.9 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 8919 | 68 | 8921 | 8874 (99.5%) | 45 (0.5%) | 47 (0.5%) | 2356 | 298 | 50 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ntw.Sighup 1.5 | 9580 | 437 (4.6%) | 319 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 650 | 387 | 400 | 283 | 60.1 / 12.4 | 6241 | 7961 | 2291 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 6.7% | 201 | 66 | 3 | 15.8 | 434 / 437 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | ntw.Sighup | 1 | 35 | 272 | 5.8% | 4.2% ± 1.8 | 18.2% | 32.3% / 29.7% | 22.2% | 0 / 0 | T1/M? | 90% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
