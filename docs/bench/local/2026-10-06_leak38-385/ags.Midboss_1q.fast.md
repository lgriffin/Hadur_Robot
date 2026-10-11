# ags.Midboss 1q.fast (mid) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 65.2% | 74.3% | 57.5% | 26 / 35 | 13.8% | 10.2% | 27 | 0 | 1.36 / 37.1 | 73.8% | -8.6 |
| 2 | 70.1% | 88.6% | 53.7% | 31 / 35 | 13.2% | 10.3% | 38 | 0 | 1.35 / 39.2 | 76.2% | -6.1 |
| 3 | 72.0% | 85.7% | 58.9% | 30 / 35 | 12.9% | 8.9% | 21 | 0 | 1.36 / 38.6 | 75.1% | -3.1 |
| 4 | 73.1% | 85.7% | 61.1% | 30 / 35 | 14.0% | 9.1% | 27 | 0 | 1.34 / 40.1 | 66.4% | +6.7 |
| 5 | 71.6% | 85.7% | 57.7% | 30 / 35 | 12.3% | 8.7% | 33 | 0 | 1.32 / 44.8 | 68.0% | +3.5 |
| 6 | 72.8% | 82.9% | 62.9% | 29 / 35 | 12.4% | 47.4% | 26 | 0 | 1.36 / 41.7 | 74.5% | -1.7 |
| 7 | 58.2% | 65.7% | 52.1% | 23 / 35 | 13.5% | 10.3% | 26 | 0 | 1.33 / 32.7 | 76.3% | -18.1 |
| 8 | 79.5% | 97.1% | 62.5% | 34 / 35 | 14.1% | 7.9% | 23 | 0 | 1.35 / 35.8 | 72.4% | +7.1 |
| 9 | 74.7% | 88.6% | 61.7% | 31 / 35 | 13.2% | 9.6% | 21 | 0 | 1.26 / 34.5 | 69.8% | +4.9 |
| 10 | 76.5% | 88.6% | 64.9% | 31 / 35 | 14.8% | 8.7% | 23 | 0 | 1.32 / 41.7 | 68.2% | +8.2 |
| 11 | 65.5% | 77.1% | 55.4% | 27 / 35 | 14.8% | 10.0% | 28 | 0 | 1.33 / 48.4 | 73.4% | -7.8 |
| 12 | 70.2% | 85.7% | 56.7% | 30 / 35 | 14.9% | 9.7% | 32 | 0 | 1.30 / 35.9 | 76.8% | -6.6 |
| 13 | 80.5% | 94.3% | 66.7% | 33 / 35 | 14.3% | 7.8% | 21 | 0 | 1.36 / 131.0 | 76.1% | +4.4 |
| 14 | 69.1% | 82.9% | 56.8% | 29 / 35 | 13.5% | 9.3% | 26 | 0 | 1.42 / 153.4 | 74.0% | -4.9 |
| 15 | 69.7% | 80.0% | 59.7% | 28 / 35 | 13.0% | 9.6% | 33 | 0 | 1.36 / 104.1 | 72.2% | -2.5 |
| 16 | 72.2% | 85.7% | 59.6% | 30 / 35 | 13.4% | 10.2% | 38 | 0 | 1.31 / 424.4 | 66.4% | +5.7 |

Mean score share 71.3% ± 2.9, baseline 72.5% ± 1.9, paired diff -1.2 ± 3.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 443 over 16 battles (27.7 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | mid | 71.3% ± 2.9 | 84.3% ± 4.0 | 59.2% ± 2.1 | 472 / 560 | 13.6% ± 0.4 | 11.7% ± 5.1 | 443 | 0 | 1.42 / 424.4 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 32300 | 83 | 31873 | 31871 (98.7%) | 429 (1.3%) | 2 (0.0%) | 1807 | 471 | 246 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.Midboss 1q.fast | 33015 | 3016 (9.1%) | 27772 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 650 | 408 | 639 | 782 | 42.9 / 29.6 | 2138 | 8850 | 1650 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 11.7% | 443 | 18514 | 3 | 56.9 | 2988 / 3016 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | ags.Midboss | 1 | 35 | 284 | 9.3% | 6.4% ± 1.1 | 12.5% | 23.0% / 23.2% | 8.3% | 0 / 0 | T2/M1 | 72% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
