# bvh.fnr.Fenrir 0.36l (lower) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 72.2% | 82.9% | 61.6% | 29 / 35 | 13.8% | 6.4% | 19 | 0 | 1.13 / 17.2 | 76.3% | -4.2 |
| 2 | 73.1% | 88.6% | 58.8% | 31 / 35 | 14.0% | 8.0% | 27 | 0 | 1.17 / 17.0 | 75.3% | -2.2 |
| 3 | 70.1% | 80.0% | 61.5% | 28 / 35 | 15.5% | 8.9% | 19 | 0 | 1.09 / 14.9 | 75.0% | -4.9 |
| 4 | 81.0% | 97.1% | 65.0% | 34 / 35 | 14.0% | 7.0% | 25 | 0 | 1.09 / 12.8 | 77.6% | +3.5 |
| 5 | 77.7% | 88.6% | 67.3% | 31 / 35 | 15.8% | 7.0% | 17 | 0 | 1.08 / 16.8 | 75.1% | +2.6 |
| 6 | 65.8% | 77.1% | 55.8% | 27 / 35 | 14.6% | 8.2% | 17 | 0 | 1.13 / 116.2 | 73.5% | -7.7 |
| 7 | 78.1% | 91.4% | 65.3% | 32 / 35 | 15.0% | 7.1% | 19 | 0 | 1.03 / 13.2 | 79.2% | -1.1 |
| 8 | 72.7% | 88.6% | 56.9% | 31 / 35 | 12.3% | 6.9% | 20 | 0 | 1.13 / 92.7 | 78.3% | -5.6 |
| 9 | 81.2% | 94.3% | 68.8% | 33 / 35 | 16.0% | 7.2% | 19 | 0 | 1.09 / 16.9 | 72.4% | +8.8 |
| 10 | 73.2% | 85.7% | 60.7% | 30 / 35 | 13.0% | 6.7% | 18 | 0 | 1.13 / 12.2 | 72.5% | +0.7 |
| 11 | 76.8% | 94.3% | 61.2% | 33 / 35 | 15.1% | 8.5% | 20 | 0 | 1.10 / 11.2 | 71.7% | +5.1 |
| 12 | 72.9% | 88.6% | 57.6% | 31 / 35 | 13.2% | 7.4% | 24 | 0 | 1.07 / 12.4 | 82.8% | -10.0 |
| 13 | 72.2% | 85.7% | 60.4% | 30 / 35 | 15.4% | 8.6% | 25 | 0 | 1.08 / 16.5 | 72.7% | -0.6 |
| 14 | 73.9% | 85.7% | 63.4% | 30 / 35 | 15.9% | 7.8% | 20 | 0 | 1.10 / 11.6 | 60.9% | +13.0 |
| 15 | 75.9% | 91.4% | 61.7% | 32 / 35 | 14.2% | 17.2% | 13 | 0 | 1.10 / 16.2 | 65.0% | +10.9 |
| 16 | 74.1% | 85.7% | 63.0% | 30 / 35 | 14.6% | 7.3% | 24 | 0 | 1.09 / 12.3 | 77.6% | -3.6 |

Mean score share 74.4% ± 2.1, baseline 74.1% ± 2.8, paired diff +0.3 ± 3.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 326 over 16 battles (20.4 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | lower | 74.4% ± 2.1 | 87.9% ± 2.8 | 61.8% ± 1.9 | 492 / 560 | 14.5% ± 0.6 | 8.1% ± 1.3 | 326 | 0 | 1.17 / 116.2 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | 19207 | 155 | 19064 | 19062 (99.2%) | 145 (0.8%) | 2 (0.0%) | 820 | 292 | 181 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | 23031 | 1489 (6.5%) | 12200 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | 650 | 482 | 606 | 574 | 44.9 / 27.7 | 2774 | 8124 | 60 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | 8.1% | 326 | 213 | 3 | 34.0 | 1479 / 1489 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| bvh.fnr.Fenrir 0.36l | bvh.fnr.Fenrir | 1 | 35 | 292 | 8.3% | 7.5% ± 1.6 | 12.9% | 26.4% / 22.7% | 2.9% | 0 / 0 | T3/M0 | 73% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
