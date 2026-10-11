# ags.Midboss 1q.fast (mid) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 73.9% | 88.6% | 60.2% | 31 / 35 | 13.2% | 9.7% | 30 | 0 | 1.33 / 33.2 | 70.1% | +3.8 |
| 2 | 67.3% | 80.0% | 55.8% | 28 / 35 | 13.0% | 8.9% | 29 | 0 | 1.35 / 37.8 | 72.6% | -5.3 |
| 3 | 66.2% | 77.1% | 56.5% | 27 / 35 | 13.2% | 9.0% | 23 | 0 | 1.36 / 39.4 | 71.0% | -4.8 |
| 4 | 75.5% | 88.6% | 62.8% | 31 / 35 | 13.4% | 8.6% | 28 | 0 | 1.36 / 37.9 | 74.9% | +0.6 |
| 5 | 77.0% | 91.4% | 63.4% | 32 / 35 | 13.9% | 7.8% | 20 | 0 | 1.37 / 48.9 | 69.4% | +7.5 |
| 6 | 79.6% | 94.3% | 65.5% | 33 / 35 | 13.5% | 8.3% | 23 | 0 | 1.32 / 34.0 | 72.9% | +6.7 |
| 7 | 68.9% | 82.9% | 56.2% | 29 / 35 | 14.2% | 9.4% | 24 | 0 | 1.34 / 32.2 | 73.4% | -4.4 |
| 8 | 64.6% | 71.4% | 58.2% | 25 / 35 | 13.2% | 9.2% | 21 | 0 | 1.36 / 35.1 | 73.7% | -9.1 |
| 9 | 78.8% | 91.4% | 66.1% | 32 / 35 | 14.6% | 8.1% | 21 | 0 | 1.27 / 52.4 | 65.8% | +13.0 |
| 10 | 68.8% | 80.0% | 57.9% | 28 / 35 | 12.7% | 34.7% | 27 | 0 | 1.29 / 36.0 | 60.6% | +8.2 |
| 11 | 78.5% | 94.3% | 63.4% | 33 / 35 | 14.3% | 8.4% | 21 | 0 | 1.24 / 34.2 | 67.8% | +10.8 |
| 12 | 71.2% | 82.9% | 61.1% | 29 / 35 | 15.2% | 8.4% | 17 | 0 | 1.35 / 49.7 | 72.0% | -0.8 |
| 13 | 69.4% | 80.0% | 59.4% | 28 / 35 | 12.4% | 9.0% | 22 | 0 | 1.30 / 38.9 | 71.9% | -2.4 |
| 14 | 72.7% | 88.6% | 58.2% | 31 / 35 | 14.7% | 8.9% | 23 | 0 | 1.30 / 35.1 | 73.3% | -0.6 |
| 15 | 64.5% | 71.4% | 58.0% | 25 / 35 | 14.0% | 8.7% | 24 | 0 | 1.27 / 45.9 | 77.4% | -12.9 |
| 16 | 79.5% | 94.3% | 64.1% | 33 / 35 | 12.8% | 7.9% | 16 | 0 | 1.31 / 36.0 | 79.2% | +0.3 |

Mean score share 72.3% ± 2.9, baseline 71.6% ± 2.4, paired diff +0.7 ± 3.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 369 over 16 battles (23.1 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | mid | 72.3% ± 2.9 | 84.8% ± 4.1 | 60.4% ± 1.8 | 475 / 560 | 13.6% ± 0.4 | 10.3% ± 3.5 | 369 | 0 | 1.37 / 52.4 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 31296 | 84 | 31103 | 31102 (99.4%) | 194 (0.6%) | 1 (0.0%) | 1708 | 475 | 305 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.Midboss 1q.fast | 31922 | 2992 (9.4%) | 27945 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 650 | 409 | 650 | 762 | 43.4 / 28.5 | 2129 | 8836 | 1872 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 10.3% | 369 | 8207 | 3 | 55.4 | 2977 / 2992 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | ags.Midboss | 1 | 35 | 284 | 9.1% | 6.5% ± 1.2 | 11.7% | 24.3% / 23.4% | 9.0% | 0 / 0 | T2/M1 | 79% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
