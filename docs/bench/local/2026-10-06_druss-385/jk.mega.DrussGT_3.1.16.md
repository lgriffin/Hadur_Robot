# jk.mega.DrussGT 3.1.16 (rumble-3) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 39.9% | 34.3% | 46.1% | 12 / 35 | 7.6% | 10.0% | 43 | 0 | 1.60 / 38.8 | 43.3% | -3.4 |
| 2 | 50.6% | 54.3% | 45.8% | 19 / 35 | 7.6% | 10.1% | 42 | 0 | 1.59 / 42.1 | 55.9% | -5.2 |
| 3 | 39.1% | 34.3% | 45.5% | 12 / 35 | 7.0% | 10.0% | 41 | 0 | 1.60 / 37.3 | 51.3% | -12.2 |
| 4 | 49.4% | 51.4% | 46.7% | 18 / 35 | 7.5% | 9.6% | 40 | 0 | 1.60 / 42.1 | 50.4% | -0.9 |
| 5 | 54.6% | 60.0% | 48.6% | 21 / 35 | 7.3% | 10.6% | 52 | 0 | 1.63 / 41.6 | 47.4% | +7.2 |
| 6 | 44.4% | 42.9% | 45.8% | 15 / 35 | 6.9% | 10.6% | 48 | 0 | 1.62 / 41.4 | 49.5% | -5.1 |
| 7 | 45.0% | 42.9% | 47.5% | 15 / 35 | 7.0% | 10.6% | 46 | 0 | 1.57 / 42.8 | 42.6% | +2.5 |
| 8 | 51.2% | 54.3% | 47.5% | 19 / 35 | 7.2% | 10.2% | 43 | 0 | 1.63 / 43.3 | 32.2% | +19.0 |
| 9 | 49.8% | 52.9% | 46.3% | 19 / 35 | 7.1% | 10.3% | 47 | 0 | 1.52 / 38.9 | 59.4% | -9.5 |
| 10 | 51.9% | 54.3% | 48.9% | 19 / 35 | 7.7% | 9.6% | 45 | 0 | 1.64 / 46.7 | 45.6% | +6.3 |
| 11 | 53.1% | 57.1% | 47.8% | 20 / 35 | 8.1% | 10.4% | 41 | 0 | 1.59 / 45.2 | 40.1% | +13.0 |
| 12 | 40.4% | 37.1% | 44.1% | 13 / 35 | 6.4% | 9.7% | 42 | 0 | 1.53 / 37.3 | 45.7% | -5.3 |
| 13 | 49.1% | 50.0% | 47.9% | 18 / 35 | 7.4% | 10.4% | 38 | 0 | 1.54 / 41.6 | 51.0% | -1.8 |
| 14 | 50.0% | 51.4% | 48.2% | 18 / 35 | 8.0% | 9.6% | 44 | 0 | 1.57 / 40.5 | 50.4% | -0.3 |
| 15 | 51.2% | 54.3% | 47.3% | 19 / 35 | 6.9% | 9.8% | 47 | 0 | 1.44 / 39.5 | 54.6% | -3.4 |
| 16 | 52.4% | 57.1% | 46.8% | 20 / 35 | 7.4% | 10.0% | 35 | 0 | 1.57 / 41.4 | 54.6% | -2.2 |
| 17 | 39.3% | 34.3% | 44.7% | 12 / 35 | 7.1% | 10.1% | 30 | 0 | 1.55 / 36.2 | 50.1% | -10.8 |
| 18 | 51.7% | 54.3% | 48.6% | 19 / 35 | 7.9% | 10.2% | 40 | 0 | 1.54 / 39.4 | 48.0% | +3.7 |
| 19 | 48.3% | 52.9% | 42.6% | 19 / 35 | 6.6% | 10.1% | 40 | 0 | 1.51 / 39.5 | 53.3% | -5.0 |
| 20 | 58.1% | 68.6% | 47.0% | 24 / 35 | 7.7% | 10.0% | 40 | 0 | 1.58 / 41.3 | 52.5% | +5.6 |

Mean score share 48.5% ± 2.5, baseline 48.9% ± 2.9, paired diff -0.4 ± 3.7.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 844 over 20 battles (42.2 per battle, most in one battle 52). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | rumble-3 | 48.5% ± 2.5 | 49.9% ± 4.4 | 46.7% ± 0.8 | 351 / 700 | 7.3% ± 0.2 | 10.1% ± 0.2 | 844 | 0 | 1.64 / 46.7 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 187796 | 34 | 187418 | 187401 (99.8%) | 395 (0.2%) | 17 (0.0%) | 11438 | 1296 | 803 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 185776 | 23717 (12.8%) | 183368 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 650 | 516 | 650 | 3122 | 26.9 / 30.7 | 52 | 18786 | 1915 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 10.1% | 844 | 2046 | 3 | 263.2 | 23327 / 23717 (98%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | jk.mega.DrussGT | 1 | 35 | 298 | 10.6% | 8.8% ± 1.0 | 8.1% | 23.7% / 20.8% | 1.7% | 0 / 0 | T3/M1 | 58% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
