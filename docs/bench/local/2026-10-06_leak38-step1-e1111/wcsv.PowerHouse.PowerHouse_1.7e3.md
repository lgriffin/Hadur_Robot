# wcsv.PowerHouse.PowerHouse 1.7e3 (mid) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 70.5% | 91.4% | 49.2% | 32 / 35 | 11.3% | 8.1% | 16 | 0 | 1.05 / 12.7 | 62.9% | +7.6 |
| 2 | 67.1% | 82.9% | 50.8% | 29 / 35 | 11.0% | 6.8% | 14 | 0 | 0.99 / 13.1 | 69.1% | -2.0 |
| 3 | 60.0% | 71.4% | 49.2% | 25 / 35 | 11.0% | 7.3% | 12 | 0 | 1.02 / 12.4 | 60.7% | -0.7 |
| 4 | 71.0% | 88.6% | 53.5% | 31 / 35 | 11.8% | 7.8% | 15 | 0 | 1.00 / 12.4 | 66.2% | +4.8 |
| 5 | 67.4% | 88.6% | 44.7% | 31 / 35 | 10.2% | 7.5% | 15 | 0 | 0.98 / 12.7 | 62.7% | +4.7 |
| 6 | 67.5% | 82.9% | 50.9% | 29 / 35 | 10.5% | 7.0% | 15 | 0 | 1.01 / 12.4 | 65.9% | +1.6 |
| 7 | 64.2% | 77.1% | 50.7% | 27 / 35 | 10.5% | 7.4% | 15 | 0 | 1.00 / 12.1 | 59.6% | +4.7 |
| 8 | 62.0% | 77.1% | 47.4% | 27 / 35 | 11.3% | 7.8% | 11 | 0 | 0.99 / 11.9 | 64.5% | -2.5 |
| 9 | 68.6% | 85.7% | 52.2% | 30 / 35 | 11.5% | 7.9% | 11 | 0 | 0.98 / 12.6 | 68.6% | +0.0 |
| 10 | 64.5% | 80.0% | 48.4% | 28 / 35 | 10.5% | 6.3% | 14 | 0 | 0.98 / 12.3 | 58.6% | +5.9 |
| 11 | 55.3% | 71.4% | 40.2% | 25 / 35 | 10.6% | 7.9% | 11 | 0 | 0.98 / 12.5 | 61.4% | -6.1 |
| 12 | 59.4% | 71.4% | 48.9% | 25 / 35 | 11.6% | 8.2% | 18 | 0 | 0.98 / 12.3 | 68.5% | -9.1 |
| 13 | 67.8% | 85.7% | 48.7% | 30 / 35 | 10.7% | 7.5% | 13 | 0 | 0.98 / 12.5 | 67.9% | -0.1 |
| 14 | 65.9% | 82.9% | 48.1% | 29 / 35 | 10.3% | 8.2% | 14 | 0 | 0.98 / 12.6 | 60.9% | +5.0 |
| 15 | 70.6% | 88.6% | 50.0% | 31 / 35 | 10.2% | 7.4% | 11 | 0 | 1.00 / 13.2 | 67.6% | +3.0 |
| 16 | 59.1% | 77.1% | 42.2% | 27 / 35 | 10.3% | 8.7% | 14 | 0 | 1.00 / 12.3 | 64.4% | -5.4 |

Mean score share 65.1% ± 2.5, baseline 64.3% ± 1.8, paired diff +0.7 ± 2.6.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 219 over 16 battles (13.7 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | mid | 65.1% ± 2.5 | 81.4% ± 3.5 | 48.4% ± 1.9 | 456 / 560 | 10.8% ± 0.3 | 7.6% ± 0.3 | 219 | 0 | 1.05 / 13.2 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 28027 | 189 | 27945 | 27944 (99.7%) | 83 (0.3%) | 1 (0.0%) | 1480 | 270 | 86 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 30673 | 2727 (8.9%) | 25307 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 650 | 466 | 650 | 725 | 30.4 / 32.3 | 691 | 14000 | 3165 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 7.6% | 219 | 1265 | 3 | 49.8 | 2709 / 2727 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | wcsv.PowerHouse.PowerHouse | 1 | 35 | 340 | 9.4% | 7.9% ± 1.3 | 10.4% | 20.5% / 21.7% | 12.1% | 0 / 0 | T3/M1 | 59% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
