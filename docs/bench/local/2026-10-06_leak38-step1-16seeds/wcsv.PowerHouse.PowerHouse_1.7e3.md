# wcsv.PowerHouse.PowerHouse 1.7e3 (mid) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 68.3% | 88.6% | 47.4% | 31 / 35 | 10.6% | 8.5% | 11 | 0 | 1.09 / 13.2 | 71.5% | -3.2 |
| 2 | 66.0% | 82.9% | 49.2% | 29 / 35 | 11.8% | 7.8% | 8 | 0 | 1.07 / 12.4 | 63.8% | +2.2 |
| 3 | 67.1% | 85.7% | 46.5% | 30 / 35 | 10.8% | 7.1% | 13 | 0 | 1.05 / 49.2 | 60.6% | +6.6 |
| 4 | 61.4% | 80.0% | 42.2% | 28 / 35 | 11.1% | 7.7% | 14 | 0 | 1.07 / 12.8 | 60.9% | +0.5 |
| 5 | 66.2% | 82.9% | 48.6% | 29 / 35 | 11.0% | 6.8% | 14 | 0 | 1.06 / 12.6 | 61.6% | +4.5 |
| 6 | 62.6% | 77.1% | 48.0% | 27 / 35 | 10.6% | 7.2% | 7 | 0 | 1.07 / 12.5 | 58.9% | +3.7 |
| 7 | 68.6% | 85.7% | 51.1% | 30 / 35 | 10.8% | 7.2% | 16 | 0 | 1.06 / 13.6 | 70.9% | -2.3 |
| 8 | 60.2% | 77.1% | 44.7% | 27 / 35 | 10.6% | 8.3% | 14 | 0 | 1.07 / 41.5 | 58.2% | +2.0 |
| 9 | 73.0% | 88.6% | 57.6% | 31 / 35 | 10.9% | 7.2% | 11 | 0 | 1.06 / 64.0 | 69.2% | +3.8 |
| 10 | 66.6% | 88.6% | 43.6% | 31 / 35 | 10.9% | 7.1% | 21 | 0 | 1.09 / 14.3 | 59.2% | +7.3 |
| 11 | 59.3% | 68.6% | 50.1% | 24 / 35 | 10.6% | 7.7% | 15 | 0 | 1.03 / 128.2 | 54.9% | +4.3 |
| 12 | 65.8% | 82.9% | 49.3% | 29 / 35 | 10.8% | 7.4% | 18 | 0 | 1.05 / 274.3 | 62.5% | +3.3 |
| 13 | 67.8% | 85.7% | 49.0% | 30 / 35 | 11.1% | 6.9% | 9 | 0 | 1.04 / 74.3 | 65.6% | +2.2 |
| 14 | 70.7% | 85.7% | 56.2% | 30 / 35 | 11.4% | 7.4% | 30 | 0 | 1.07 / 53.8 | 64.0% | +6.7 |
| 15 | 69.8% | 88.6% | 49.7% | 31 / 35 | 10.5% | 7.2% | 13 | 0 | 1.04 / 69.5 | 64.4% | +5.4 |
| 16 | 55.4% | 68.6% | 44.0% | 24 / 35 | 10.9% | 8.5% | 11 | 0 | 1.03 / 12.8 | 57.8% | -2.4 |

Mean score share 65.5% ± 2.5, baseline 62.8% ± 2.5, paired diff +2.8 ± 1.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 225 over 16 battles (14.1 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | mid | 65.5% ± 2.5 | 82.3% ± 3.5 | 48.6% ± 2.2 | 461 / 560 | 10.9% ± 0.2 | 7.5% ± 0.3 | 225 | 0 | 1.09 / 274.3 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 27966 | 181 | 27944 | 27943 (99.9%) | 23 (0.1%) | 1 (0.0%) | 1419 | 264 | 107 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 30461 | 2679 (8.8%) | 25923 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 650 | 470 | 638 | 724 | 30.8 / 32.5 | 595 | 12659 | 3172 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 7.5% | 225 | 1605 | 3 | 49.5 | 2664 / 2679 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | wcsv.PowerHouse.PowerHouse | 1 | 35 | 340 | 9.5% | 8.3% ± 1.4 | 10.6% | 22.5% / 22.1% | 11.5% | 0 / 0 | T3/M1 | 55% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
