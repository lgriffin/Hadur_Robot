# wcsv.PowerHouse.PowerHouse 1.7e3 (mid) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 58.9% | 74.3% | 43.8% | 26 / 35 | 10.5% | 8.1% | 18 | 0 | 1.11 / 347.3 | 59.7% | -0.8 |
| 2 | 58.2% | 74.3% | 43.6% | 26 / 35 | 10.9% | 7.9% | 11 | 0 | 1.10 / 76.5 | 71.0% | -12.7 |
| 3 | 67.5% | 82.9% | 52.5% | 29 / 35 | 11.7% | 7.6% | 14 | 0 | 1.05 / 271.9 | 62.0% | +5.4 |
| 4 | 60.1% | 77.1% | 43.7% | 27 / 35 | 10.3% | 8.8% | 94 | 0 | 1.12 / 129.5 | 58.6% | +1.5 |
| 5 | 53.8% | 65.7% | 42.1% | 23 / 35 | 10.5% | 8.1% | 19 | 0 | 1.10 / 63.2 | 67.6% | -13.8 |
| 6 | 61.0% | 77.1% | 44.9% | 27 / 35 | 10.7% | 7.6% | 16 | 0 | 1.10 / 314.8 | 57.7% | +3.3 |
| 7 | 68.1% | 82.9% | 52.7% | 29 / 35 | 10.8% | 6.8% | 14 | 0 | 1.03 / 391.2 | 65.2% | +2.9 |
| 8 | 71.0% | 91.4% | 50.2% | 32 / 35 | 10.8% | 8.0% | 18 | 0 | 1.06 / 13.0 | 58.1% | +12.9 |
| 9 | 68.6% | 85.7% | 50.8% | 30 / 35 | 11.5% | 6.6% | 12 | 0 | 1.01 / 12.5 | 60.3% | +8.3 |
| 10 | 68.3% | 82.9% | 53.0% | 29 / 35 | 11.4% | 7.0% | 19 | 0 | 1.05 / 12.2 | 62.5% | +5.8 |
| 11 | 65.4% | 82.9% | 47.7% | 29 / 35 | 10.9% | 7.7% | 18 | 0 | 1.08 / 13.6 | 61.3% | +4.1 |
| 12 | 63.5% | 82.9% | 43.7% | 29 / 35 | 10.5% | 7.7% | 23 | 0 | 1.09 / 13.2 | 66.3% | -2.8 |
| 13 | 61.7% | 80.0% | 44.7% | 28 / 35 | 10.6% | 8.1% | 21 | 0 | 1.10 / 13.0 | 52.7% | +9.0 |
| 14 | 55.7% | 71.4% | 42.6% | 25 / 35 | 11.0% | 9.3% | 24 | 0 | 1.11 / 13.7 | 64.4% | -8.7 |
| 15 | 51.4% | 65.7% | 37.5% | 23 / 35 | 10.4% | 8.5% | 20 | 0 | 1.12 / 13.4 | 67.2% | -15.8 |
| 16 | 54.3% | 68.6% | 40.2% | 24 / 35 | 10.0% | 8.3% | 17 | 0 | 1.12 / 15.4 | 62.3% | -7.9 |

Mean score share 61.7% ± 3.2, baseline 62.3% ± 2.4, paired diff -0.6 ± 4.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 358 over 16 battles (22.4 per battle, most in one battle 94). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | mid | 61.7% ± 3.2 | 77.9% ± 3.9 | 45.9% ± 2.5 | 436 / 560 | 10.8% ± 0.2 | 7.9% ± 0.4 | 358 | 0 | 1.12 / 391.2 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 28561 | 191 | 28539 | 28538 (99.9%) | 23 (0.1%) | 1 (0.0%) | 1537 | 309 | 144 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 31360 | 2782 (8.9%) | 23102 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 650 | 465 | 650 | 739 | 29.2 / 34.5 | 620 | 13122 | 3636 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 7.9% | 358 | 5200 | 3 | 50.7 | 2759 / 2782 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | wcsv.PowerHouse.PowerHouse | 1 | 35 | 340 | 9.4% | 7.7% ± 1.3 | 9.8% | 21.6% / 22.2% | 12.9% | 0 / 0 | T3/M1 | 54% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
