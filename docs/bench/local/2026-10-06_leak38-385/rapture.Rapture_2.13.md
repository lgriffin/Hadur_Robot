# rapture.Rapture 2.13 (weak) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 97.7% | 100.0% | 95.6% | 35 / 35 | 20.1% | 2.6% | 14 | 0 | 0.78 / 14.7 | 98.7% | -1.0 |
| 2 | 92.9% | 97.1% | 89.0% | 34 / 35 | 20.5% | 5.8% | 15 | 0 | 0.77 / 16.9 | 97.6% | -4.7 |
| 3 | 94.4% | 94.3% | 93.7% | 33 / 35 | 21.0% | 5.3% | 14 | 0 | 0.89 / 18.2 | 95.4% | -1.0 |
| 4 | 92.3% | 94.3% | 89.9% | 33 / 35 | 22.2% | 8.3% | 16 | 0 | 0.98 / 17.8 | 97.6% | -5.3 |
| 5 | 97.0% | 100.0% | 94.2% | 35 / 35 | 20.8% | 3.9% | 16 | 0 | 0.81 / 17.3 | 95.4% | +1.6 |
| 6 | 96.8% | 100.0% | 93.8% | 35 / 35 | 21.2% | 3.6% | 16 | 0 | 0.77 / 15.8 | 95.6% | +1.2 |
| 7 | 95.9% | 100.0% | 92.0% | 35 / 35 | 21.6% | 4.5% | 16 | 0 | 0.76 / 15.7 | 92.1% | +3.9 |
| 8 | 97.5% | 100.0% | 95.2% | 35 / 35 | 20.0% | 2.9% | 14 | 0 | 0.79 / 15.6 | 92.9% | +4.7 |
| 9 | 98.7% | 100.0% | 97.3% | 35 / 35 | 23.4% | 2.0% | 11 | 0 | 0.83 / 18.0 | 96.7% | +2.0 |
| 10 | 93.5% | 94.3% | 92.1% | 33 / 35 | 23.2% | 5.7% | 15 | 0 | 0.84 / 17.7 | 95.2% | -1.7 |
| 11 | 90.2% | 91.4% | 88.0% | 32 / 35 | 19.8% | 8.8% | 18 | 0 | 1.07 / 15.9 | 95.6% | -5.5 |
| 12 | 98.1% | 100.0% | 96.2% | 35 / 35 | 20.6% | 2.5% | 16 | 0 | 0.77 / 14.6 | 97.5% | +0.6 |
| 13 | 97.2% | 100.0% | 94.4% | 35 / 35 | 19.8% | 3.2% | 13 | 0 | 0.76 / 19.9 | 94.7% | +2.4 |
| 14 | 97.6% | 100.0% | 95.3% | 35 / 35 | 19.8% | 2.8% | 15 | 0 | 0.77 / 17.4 | 97.6% | +0.0 |
| 15 | 96.9% | 100.0% | 93.8% | 35 / 35 | 22.0% | 3.7% | 15 | 0 | 0.79 / 16.0 | 98.1% | -1.2 |
| 16 | 98.3% | 100.0% | 96.6% | 35 / 35 | 21.5% | 2.2% | 16 | 0 | 0.76 / 10.6 | 97.8% | +0.5 |

Mean score share 95.9% ± 1.3, baseline 96.2% ± 1.0, paired diff -0.2 ± 1.6.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 240 over 16 battles (15.0 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | weak | 95.9% ± 1.3 | 98.2% ± 1.6 | 93.6% ± 1.4 | 550 / 560 | 21.1% ± 0.6 | 4.2% ± 1.1 | 240 | 0 | 1.07 / 19.9 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | 17849 | 42 | 17609 | 17606 (98.6%) | 243 (1.4%) | 3 (0.0%) | 500 | 293 | 128 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| rapture.Rapture 2.13 | 16054 | 1096 (6.8%) | 6956 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | 650 | 416 | 406 | 449 | 72.9 / 5.1 | 9106 | 8145 | 2304 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | 4.2% | 240 | 93 | 3 | 31.3 | 1081 / 1096 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | rapture.Rapture | 1 | 35 | 294 | 2.7% | 1.8% ± 0.9 | 18.0% | 36.2% / 33.4% | 10.9% | 0 / 0 | T0/M? | 98% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
