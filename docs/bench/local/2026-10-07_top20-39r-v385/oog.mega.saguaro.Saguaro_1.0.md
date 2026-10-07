# oog.mega.saguaro.Saguaro 1.0 (rumble-4) vs hadur2.Hadur 3.9

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.3% | 94.3% | 69.9% | 33 / 35 | 22.1% | 7.3% | 16 | 0 | 1.72 / 8.4 | 72.9% | +8.4 |
| 2 | 73.3% | 85.7% | 61.5% | 30 / 35 | 18.4% | 6.1% | 12 | 0 | 1.97 / 9.8 | 70.9% | +2.4 |
| 3 | 72.8% | 82.9% | 61.9% | 29 / 35 | 16.7% | 5.2% | 11 | 0 | 2.04 / 10.3 | 62.8% | +9.9 |
| 4 | 73.7% | 85.7% | 61.6% | 30 / 35 | 17.2% | 7.8% | 12 | 0 | 1.83 / 10.3 | 72.6% | +1.0 |
| 5 | 81.3% | 94.3% | 68.3% | 33 / 35 | 19.3% | 6.0% | 13 | 0 | 1.82 / 10.1 | 73.8% | +7.5 |
| 6 | 69.7% | 80.0% | 59.3% | 28 / 35 | 18.0% | 6.2% | 9 | 0 | 1.98 / 624.8 | 73.9% | -4.1 |
| 7 | 69.9% | 77.1% | 63.1% | 27 / 35 | 19.7% | 7.0% | 13 | 0 | 1.83 / 9.3 | 80.9% | -10.9 |
| 8 | 75.3% | 85.7% | 65.0% | 30 / 35 | 19.3% | 5.8% | 8 | 0 | 1.85 / 11.4 | 80.4% | -5.1 |
| 9 | 73.0% | 80.0% | 65.8% | 28 / 35 | 19.2% | 5.8% | 5 | 0 | 1.99 / 895.6 | 75.2% | -2.1 |
| 10 | 63.7% | 71.4% | 56.1% | 25 / 35 | 18.5% | 6.5% | 14 | 0 | 2.15 / 10.4 | 78.3% | -14.6 |
| 11 | 70.9% | 85.7% | 58.0% | 30 / 35 | 19.1% | 8.2% | 9 | 0 | 1.83 / 125.9 | 78.8% | -7.9 |
| 12 | 80.5% | 97.1% | 63.8% | 34 / 35 | 17.6% | 6.6% | 11 | 0 | 1.80 / 9.1 | 78.7% | +1.8 |
| 13 | 66.2% | 71.4% | 60.6% | 25 / 35 | 17.2% | 6.6% | 10 | 0 | 2.04 / 9.9 | 62.1% | +4.1 |
| 14 | 82.1% | 94.3% | 70.2% | 33 / 35 | 20.2% | 5.8% | 13 | 0 | 1.70 / 9.1 | 73.6% | +8.5 |
| 15 | 66.1% | 77.1% | 55.1% | 27 / 35 | 16.2% | 6.7% | 14 | 0 | 1.99 / 10.0 | 68.8% | -2.7 |
| 16 | 66.8% | 77.1% | 57.6% | 27 / 35 | 19.2% | 8.1% | 10 | 0 | 1.88 / 9.3 | 72.3% | -5.5 |
| 17 | 81.2% | 97.1% | 65.1% | 34 / 35 | 18.8% | 5.6% | 11 | 0 | 1.98 / 10.9 | 67.5% | +13.7 |
| 18 | 73.2% | 85.7% | 60.7% | 30 / 35 | 18.6% | 6.7% | 4 | 0 | 1.99 / 10.4 | 68.4% | +4.9 |
| 19 | 69.3% | 80.0% | 59.7% | 28 / 35 | 19.6% | 8.4% | 13 | 0 | 1.81 / 10.2 | 85.2% | -15.9 |
| 20 | 66.9% | 74.3% | 60.2% | 26 / 35 | 17.3% | 6.6% | 14 | 0 | 1.78 / 9.4 | 75.6% | -8.7 |

Mean score share 72.9% ± 2.7, baseline 73.6% ± 2.8, paired diff -0.8 ± 3.9.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 222 over 20 battles (11.1 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | rumble-4 | 72.9% ± 2.7 | 83.9% ± 3.8 | 62.2% ± 2.0 | 587 / 700 | 18.6% ± 0.6 | 6.7% ± 0.4 | 222 | 0 | 2.15 / 895.6 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 20 | 18 | 298 | 0 | 0.32 | 1 | 0 | 0 |

18 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 23390 | 35 | 23375 | 23358 (99.9%) | 32 (0.1%) | 17 (0.1%) | 1555 | 344 | 79 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 26538 | 1969 (7.4%) | 26390 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 650 | 448 | 468 | 531 | 43.4 / 26.4 | 3399 | 9135 | 1658 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 6.7% | 222 | 144 | 3 | 33.3 | 1947 / 1969 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | oog.mega.saguaro.Saguaro | 1 | 35 | 328 | 8.5% | 7.5% ± 1.6 | 12.8% | 25.8% / 26.3% | 10.3% | 0 / 0 | T3/M0 | 67% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
