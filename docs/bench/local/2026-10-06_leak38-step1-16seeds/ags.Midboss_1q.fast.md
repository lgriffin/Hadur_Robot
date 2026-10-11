# ags.Midboss 1q.fast (mid) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 80.3% | 94.3% | 66.9% | 33 / 35 | 14.4% | 8.7% | 22 | 0 | 1.38 / 52.6 | 77.5% | +2.9 |
| 2 | 69.9% | 82.9% | 57.8% | 29 / 35 | 13.2% | 9.8% | 34 | 0 | 1.48 / 136.7 | 76.1% | -6.2 |
| 3 | 77.9% | 94.3% | 62.3% | 33 / 35 | 12.8% | 8.0% | 23 | 0 | 1.46 / 35.5 | 69.3% | +8.7 |
| 4 | 72.1% | 85.7% | 59.1% | 30 / 35 | 13.8% | 10.0% | 38 | 0 | 1.42 / 115.9 | 70.7% | +1.5 |
| 5 | 65.5% | 74.3% | 57.5% | 26 / 35 | 13.2% | 8.8% | 89 | 0 | 1.45 / 145.5 | 69.2% | -3.7 |
| 6 | 74.7% | 88.6% | 61.6% | 31 / 35 | 13.5% | 54.7% | 27 | 0 | 1.44 / 35.9 | 71.7% | +3.0 |
| 7 | 68.6% | 80.0% | 58.4% | 28 / 35 | 14.0% | 10.3% | 30 | 0 | 1.43 / 36.2 | 79.5% | -10.9 |
| 8 | 74.5% | 85.7% | 63.8% | 30 / 35 | 13.9% | 8.5% | 31 | 0 | 1.45 / 31.5 | 71.9% | +2.6 |
| 9 | 67.9% | 77.1% | 59.3% | 27 / 35 | 14.2% | 8.5% | 19 | 0 | 1.35 / 37.7 | 76.3% | -8.4 |
| 10 | 73.4% | 85.7% | 61.3% | 30 / 35 | 13.2% | 21.8% | 28 | 0 | 1.40 / 117.3 | 70.4% | +3.0 |
| 11 | 69.8% | 82.9% | 57.6% | 29 / 35 | 13.2% | 8.9% | 37 | 0 | 1.49 / 114.9 | 72.2% | -2.5 |
| 12 | 73.1% | 85.7% | 61.4% | 30 / 35 | 13.4% | 9.3% | 30 | 0 | 1.45 / 127.5 | 69.8% | +3.3 |
| 13 | 68.3% | 82.9% | 54.9% | 29 / 35 | 12.3% | 45.6% | 36 | 0 | 1.39 / 38.9 | 78.5% | -10.2 |
| 14 | 66.1% | 77.1% | 56.4% | 27 / 35 | 14.5% | 9.4% | 23 | 0 | 1.43 / 80.5 | 77.5% | -11.4 |
| 15 | 65.8% | 77.1% | 56.1% | 27 / 35 | 14.3% | 10.2% | 49 | 0 | 1.40 / 31.2 | 78.2% | -12.4 |
| 16 | 70.6% | 82.9% | 59.0% | 29 / 35 | 14.0% | 9.5% | 35 | 0 | 1.40 / 139.8 | 65.6% | +5.0 |

Mean score share 71.2% ± 2.3, baseline 73.4% ± 2.2, paired diff -2.2 ± 3.6.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 551 over 16 battles (34.4 per battle, most in one battle 89). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | mid | 71.2% ± 2.3 | 83.6% ± 3.1 | 59.6% ± 1.7 | 468 / 560 | 13.6% ± 0.3 | 15.1% ± 7.5 | 551 | 0 | 1.49 / 145.5 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 30281 | 78 | 29614 | 29611 (97.8%) | 670 (2.2%) | 3 (0.0%) | 1564 | 451 | 390 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.Midboss 1q.fast | 30900 | 2929 (9.5%) | 27634 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 650 | 408 | 633 | 743 | 43.3 / 29.4 | 1960 | 9540 | 1390 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 15.1% | 551 | 10467 | 3 | 52.6 | 2881 / 2929 (98%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | ags.Midboss | 1 | 35 | 284 | 10.8% | 7.4% ± 1.2 | 12.8% | 25.6% / 24.4% | 8.2% | 0 / 0 | T3/M0 | 70% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
