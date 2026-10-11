# nat.Hikari dev0001 (lower) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 79.3% | 91.4% | 67.7% | 32 / 35 | 14.9% | 7.3% | 18 | 0 | 1.02 / 14.5 | 85.7% | -6.4 |
| 2 | 83.7% | 94.3% | 72.8% | 33 / 35 | 15.4% | 5.9% | 15 | 0 | 0.89 / 13.6 | 85.5% | -1.8 |
| 3 | 78.2% | 91.4% | 66.1% | 32 / 35 | 16.3% | 7.9% | 13 | 0 | 1.10 / 14.7 | 82.5% | -4.3 |
| 4 | 77.3% | 88.6% | 66.0% | 31 / 35 | 15.1% | 6.8% | 19 | 0 | 1.04 / 13.0 | 81.0% | -3.6 |
| 5 | 81.1% | 94.3% | 67.2% | 33 / 35 | 14.5% | 5.7% | 12 | 0 | 0.96 / 14.5 | 85.0% | -3.8 |
| 6 | 83.1% | 97.1% | 69.6% | 34 / 35 | 16.3% | 7.0% | 17 | 0 | 0.99 / 17.5 | 80.7% | +2.3 |
| 7 | 83.6% | 94.3% | 72.8% | 33 / 35 | 14.8% | 25.3% | 16 | 0 | 0.96 / 15.6 | 88.3% | -4.7 |
| 8 | 84.0% | 97.1% | 70.3% | 34 / 35 | 14.9% | 6.0% | 12 | 0 | 0.87 / 15.7 | 82.9% | +1.1 |
| 9 | 79.6% | 94.3% | 65.0% | 33 / 35 | 15.4% | 6.7% | 20 | 0 | 1.03 / 16.0 | 86.4% | -6.8 |
| 10 | 83.8% | 97.1% | 70.8% | 34 / 35 | 17.0% | 6.8% | 17 | 0 | 1.05 / 14.0 | 84.6% | -0.8 |
| 11 | 82.7% | 97.1% | 68.5% | 34 / 35 | 15.0% | 6.8% | 19 | 0 | 1.02 / 16.6 | 84.9% | -2.2 |
| 12 | 77.1% | 91.4% | 63.5% | 32 / 35 | 14.9% | 7.4% | 22 | 0 | 1.06 / 15.1 | 68.7% | +8.4 |
| 13 | 78.8% | 91.4% | 67.3% | 32 / 35 | 16.0% | 9.8% | 18 | 0 | 0.99 / 13.8 | 87.3% | -8.5 |
| 14 | 79.8% | 91.4% | 68.0% | 32 / 35 | 15.6% | 6.2% | 21 | 0 | 1.07 / 15.8 | 87.4% | -7.5 |
| 15 | 79.8% | 94.3% | 66.7% | 33 / 35 | 16.1% | 8.1% | 20 | 0 | 1.11 / 14.9 | 82.4% | -2.6 |
| 16 | 83.1% | 97.1% | 67.9% | 34 / 35 | 14.8% | 6.0% | 16 | 0 | 0.94 / 15.8 | 85.3% | -2.2 |

Mean score share 80.9% ± 1.3, baseline 83.7% ± 2.4, paired diff -2.7 ± 2.2.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 275 over 16 battles (17.2 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | lower | 80.9% ± 1.3 | 93.9% ± 1.5 | 68.1% ± 1.4 | 526 / 560 | 15.4% ± 0.4 | 8.1% ± 2.5 | 275 | 0 | 1.11 / 17.5 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 19000 | 35 | 18917 | 18912 (99.5%) | 88 (0.5%) | 5 (0.0%) | 494 | 268 | 97 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| nat.Hikari dev0001 | 19262 | 1916 (9.9%) | 14382 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 650 | 410 | 542 | 504 | 48.2 / 22.6 | 4386 | 7858 | 4762 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 8.1% | 275 | 573 | 3 | 33.7 | 1910 / 1916 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | nat.Hikari | 1 | 35 | 280 | 6.5% | 5.5% ± 1.3 | 14.2% | 31.2% / 31.6% | 26.0% | 0 / 0 | T2/M0 | 81% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
