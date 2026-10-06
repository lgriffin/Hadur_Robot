# ags.Midboss 1q.fast (mid) vs hadur2.Hadur 3.8.1

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 76.8% | 91.4% | 63.2% | 32 / 35 | 12.8% | 8.7% | 29 | 0 | 1.37 / 39.3 | 76.7% | +0.1 |
| 2 | 72.0% | 85.7% | 59.0% | 30 / 35 | 13.0% | 9.6% | 32 | 0 | 1.34 / 51.3 | 73.2% | -1.2 |
| 3 | 71.8% | 82.9% | 61.3% | 29 / 35 | 13.7% | 8.4% | 24 | 0 | 1.39 / 40.2 | 68.0% | +3.8 |
| 4 | 66.6% | 74.3% | 59.5% | 26 / 35 | 14.0% | 8.8% | 22 | 0 | 1.38 / 49.7 | 76.6% | -10.0 |
| 5 | 78.1% | 91.4% | 65.0% | 32 / 35 | 13.5% | 7.4% | 28 | 0 | 1.31 / 90.2 | 76.9% | +1.3 |
| 6 | 61.3% | 65.7% | 57.2% | 23 / 35 | 13.3% | 9.8% | 30 | 0 | 1.37 / 37.8 | 65.5% | -4.2 |
| 7 | 71.3% | 82.9% | 60.4% | 29 / 35 | 14.6% | 8.1% | 22 | 0 | 1.34 / 39.6 | 68.3% | +3.1 |
| 8 | 72.0% | 82.9% | 61.7% | 29 / 35 | 13.5% | 8.6% | 28 | 0 | 1.37 / 112.8 | 76.7% | -4.7 |
| 9 | 67.8% | 82.9% | 54.8% | 29 / 35 | 13.9% | 10.3% | 30 | 0 | 1.36 / 48.3 | 75.8% | -8.0 |
| 10 | 67.3% | 77.1% | 58.4% | 27 / 35 | 12.5% | 9.4% | 25 | 0 | 1.39 / 37.6 | 79.0% | -11.7 |
| 11 | 80.0% | 94.3% | 66.5% | 33 / 35 | 14.9% | 9.2% | 27 | 0 | 1.36 / 34.6 | 65.0% | +15.0 |
| 12 | 59.8% | 71.4% | 49.8% | 25 / 35 | 12.9% | 52.1% | 32 | 0 | 1.35 / 35.4 | 74.5% | -14.7 |
| 13 | 73.8% | 91.4% | 57.8% | 32 / 35 | 13.1% | 9.2% | 24 | 0 | 1.35 / 36.1 | 65.8% | +8.0 |
| 14 | 67.6% | 80.0% | 56.2% | 28 / 35 | 12.9% | 9.8% | 30 | 0 | 1.35 / 39.1 | 70.4% | -2.8 |
| 15 | 71.3% | 85.7% | 58.0% | 30 / 35 | 13.2% | 9.3% | 27 | 0 | 1.35 / 34.8 | 57.2% | +14.1 |
| 16 | 68.0% | 80.0% | 56.8% | 28 / 35 | 12.5% | 9.2% | 30 | 0 | 1.33 / 60.8 | 80.3% | -12.3 |

Mean score share 70.4% ± 2.9, baseline 71.9% ± 3.4, paired diff -1.5 ± 4.8.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 440 over 16 battles (27.5 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | mid | 70.4% ± 2.9 | 82.5% ± 4.2 | 59.1% ± 2.2 | 462 / 560 | 13.4% ± 0.4 | 11.7% ± 5.7 | 440 | 0 | 1.39 / 112.8 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 32161 | 100 | 31721 | 31717 (98.6%) | 444 (1.4%) | 4 (0.0%) | 1823 | 494 | 250 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.Midboss 1q.fast | 32766 | 3078 (9.4%) | 28571 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 650 | 408 | 630 | 780 | 42.8 / 29.7 | 2146 | 9374 | 1709 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 11.7% | 440 | 194 | 3 | 56.5 | 3042 / 3078 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | ags.Midboss | 1 | 35 | 284 | 10.1% | 7.0% ± 1.2 | 12.4% | 24.6% / 23.8% | 8.4% | 0 / 0 | T3/M1 | 68% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
