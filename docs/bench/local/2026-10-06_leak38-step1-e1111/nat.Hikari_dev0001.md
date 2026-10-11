# nat.Hikari dev0001 (lower) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 77.5% | 91.4% | 65.2% | 32 / 35 | 16.3% | 8.4% | 16 | 0 | 0.98 / 13.7 | 79.2% | -1.7 |
| 2 | 86.1% | 100.0% | 71.5% | 35 / 35 | 14.7% | 5.9% | 12 | 0 | 0.79 / 13.6 | 77.7% | +8.5 |
| 3 | 85.3% | 97.1% | 73.6% | 34 / 35 | 16.9% | 5.8% | 3 | 0 | 0.82 / 13.8 | 85.7% | -0.4 |
| 4 | 85.9% | 100.0% | 71.5% | 35 / 35 | 15.4% | 6.2% | 12 | 0 | 0.83 / 14.2 | 82.5% | +3.3 |
| 5 | 82.3% | 94.3% | 70.0% | 33 / 35 | 15.6% | 6.3% | 11 | 0 | 0.81 / 14.4 | 84.5% | -2.3 |
| 6 | 81.6% | 94.3% | 69.2% | 33 / 35 | 15.9% | 6.9% | 11 | 0 | 0.94 / 13.8 | 85.4% | -3.8 |
| 7 | 79.4% | 91.4% | 66.8% | 32 / 35 | 14.6% | 6.0% | 12 | 0 | 0.83 / 14.7 | 83.9% | -4.5 |
| 8 | 85.8% | 97.1% | 74.1% | 34 / 35 | 16.4% | 5.9% | 10 | 0 | 0.78 / 12.8 | 84.9% | +0.8 |
| 9 | 87.7% | 100.0% | 74.6% | 35 / 35 | 15.6% | 5.3% | 9 | 0 | 0.80 / 14.6 | 84.4% | +3.3 |
| 10 | 80.9% | 94.3% | 67.2% | 33 / 35 | 14.1% | 6.1% | 12 | 0 | 0.86 / 14.9 | 79.3% | +1.6 |
| 11 | 80.3% | 94.3% | 67.0% | 33 / 35 | 15.1% | 6.8% | 5 | 0 | 0.93 / 14.1 | 83.9% | -3.6 |
| 12 | 84.5% | 97.1% | 71.5% | 34 / 35 | 15.5% | 5.9% | 12 | 0 | 0.80 / 15.0 | 81.8% | +2.7 |
| 13 | 84.5% | 97.1% | 71.7% | 34 / 35 | 15.1% | 5.8% | 12 | 0 | 0.85 / 12.8 | 82.0% | +2.5 |
| 14 | 87.9% | 100.0% | 75.3% | 35 / 35 | 15.4% | 5.4% | 10 | 0 | 0.79 / 13.2 | 88.5% | -0.6 |
| 15 | 81.5% | 94.3% | 67.9% | 33 / 35 | 15.1% | 5.7% | 10 | 0 | 0.82 / 15.2 | 77.9% | +3.6 |
| 16 | 83.3% | 94.3% | 72.7% | 33 / 35 | 18.1% | 6.6% | 10 | 0 | 0.91 / 14.3 | 82.5% | +0.7 |

Mean score share 83.4% ± 1.6, baseline 82.8% ± 1.6, paired diff +0.6 ± 1.8.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 167 over 16 battles (10.4 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | lower | 83.4% ± 1.6 | 96.1% ± 1.6 | 70.6% ± 1.7 | 538 / 560 | 15.6% ± 0.5 | 6.2% ± 0.4 | 167 | 0 | 0.98 / 15.2 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 18594 | 35 | 18579 | 18574 (99.9%) | 20 (0.1%) | 5 (0.0%) | 405 | 301 | 54 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| nat.Hikari dev0001 | 18654 | 1870 (10.0%) | 14820 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 650 | 406 | 502 | 493 | 48.8 / 20.4 | 4375 | 8346 | 4908 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 6.2% | 167 | 93 | 3 | 33.0 | 1866 / 1870 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | nat.Hikari | 1 | 35 | 280 | 7.9% | 6.6% ± 1.6 | 15.9% | 33.3% / 31.2% | 27.2% | 0 / 0 | T2/M0 | 82% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
