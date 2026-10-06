# robar.nano.MosquitoPM 1.0 (lower) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 83.5% | 97.1% | 70.0% | 34 / 35 | 20.3% | 8.7% | 16 | 0 | 0.94 / 15.4 | 86.0% | -2.5 |
| 2 | 75.9% | 88.6% | 64.7% | 31 / 35 | 21.3% | 8.1% | 21 | 0 | 0.99 / 14.7 | 85.1% | -9.2 |
| 3 | 83.9% | 97.1% | 69.3% | 34 / 35 | 17.6% | 5.5% | 13 | 0 | 0.99 / 15.3 | 84.7% | -0.8 |
| 4 | 83.6% | 97.1% | 69.6% | 34 / 35 | 18.4% | 7.0% | 19 | 0 | 0.91 / 14.8 | 81.0% | +2.6 |
| 5 | 83.9% | 100.0% | 68.2% | 35 / 35 | 18.1% | 7.6% | 15 | 0 | 0.99 / 15.4 | 84.7% | -0.7 |
| 6 | 82.9% | 94.3% | 70.0% | 33 / 35 | 18.2% | 5.9% | 21 | 0 | 0.98 / 14.4 | 77.7% | +5.2 |
| 7 | 85.3% | 97.1% | 73.0% | 34 / 35 | 18.7% | 6.1% | 17 | 0 | 0.93 / 18.0 | 84.7% | +0.6 |
| 8 | 86.0% | 97.1% | 73.7% | 34 / 35 | 18.6% | 5.1% | 18 | 0 | 1.03 / 19.0 | 82.0% | +4.0 |
| 9 | 86.3% | 100.0% | 71.6% | 35 / 35 | 17.9% | 5.8% | 18 | 0 | 1.16 / 16.3 | 79.0% | +7.4 |
| 10 | 80.1% | 94.3% | 65.3% | 33 / 35 | 17.3% | 6.8% | 24 | 0 | 1.11 / 17.3 | 78.8% | +1.3 |
| 11 | 85.1% | 100.0% | 71.0% | 35 / 35 | 20.3% | 6.8% | 17 | 0 | 1.07 / 14.4 | 79.3% | +5.8 |
| 12 | 87.4% | 100.0% | 74.5% | 35 / 35 | 20.0% | 25.5% | 22 | 0 | 1.05 / 15.7 | 81.1% | +6.3 |
| 13 | 86.0% | 100.0% | 72.0% | 35 / 35 | 18.8% | 6.5% | 24 | 0 | 1.01 / 14.7 | 83.9% | +2.1 |
| 14 | 80.1% | 91.4% | 69.4% | 32 / 35 | 21.1% | 31.1% | 27 | 0 | 1.02 / 15.6 | 80.0% | +0.1 |
| 15 | 76.7% | 94.3% | 60.5% | 33 / 35 | 18.1% | 19.5% | 18 | 0 | 1.15 / 15.3 | 79.9% | -3.3 |
| 16 | 83.1% | 97.1% | 68.5% | 34 / 35 | 17.7% | 6.3% | 17 | 0 | 1.09 / 15.3 | 80.9% | +2.2 |

Mean score share 83.1% ± 1.8, baseline 81.8% ± 1.4, paired diff +1.3 ± 2.2.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 307 over 16 battles (19.2 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | lower | 83.1% ± 1.8 | 96.6% ± 1.8 | 69.4% ± 1.9 | 541 / 560 | 18.9% ± 0.7 | 10.1% ± 4.2 | 307 | 0 | 1.16 / 19.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 12872 | 32 | 12701 | 12639 (98.2%) | 233 (1.8%) | 62 (0.5%) | 1651 | 289 | 103 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 13865 | 914 (6.6%) | 2173 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 650 | 462 | 441 | 379 | 47.2 / 20.9 | 5085 | 8951 | 5428 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 10.1% | 307 | 2671 | 3 | 22.6 | 900 / 914 (98%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | robar.nano.MosquitoPM | 1 | 35 | 316 | 7.5% | 7.9% ± 1.9 | 15.6% | 36.2% / 35.2% | 16.4% | 0 / 0 | T3/M? | 81% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
