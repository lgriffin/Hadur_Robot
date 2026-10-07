# gh.GresSuffurd 0.4.13 (rumble-14) vs hadur2.Hadur 3.9

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 61.7% | 77.1% | 44.7% | 27 / 35 | 11.1% | 8.3% | 15 | 0 | 1.07 / 20.9 | 69.0% | -7.3 |
| 2 | 54.5% | 65.7% | 44.3% | 23 / 35 | 10.9% | 9.1% | 22 | 0 | 1.07 / 48.7 | 59.0% | -4.5 |
| 3 | 53.6% | 62.9% | 44.4% | 22 / 35 | 10.7% | 8.7% | 20 | 0 | 1.05 / 20.3 | 62.0% | -8.4 |
| 4 | 60.4% | 71.4% | 49.8% | 25 / 35 | 11.9% | 8.8% | 12 | 0 | 1.06 / 20.2 | 66.3% | -5.9 |
| 5 | 54.2% | 64.7% | 43.9% | 23 / 35 | 10.7% | 9.4% | 22 | 0 | 1.05 / 19.7 | 57.7% | -3.5 |
| 6 | 56.3% | 65.7% | 46.7% | 23 / 35 | 11.3% | 8.4% | 12 | 0 | 1.04 / 19.7 | 68.5% | -12.2 |
| 7 | 61.5% | 76.5% | 47.1% | 27 / 35 | 10.5% | 9.0% | 19 | 0 | 1.05 / 20.2 | 63.6% | -2.1 |
| 8 | 55.5% | 65.7% | 45.4% | 23 / 35 | 10.9% | 8.7% | 9 | 0 | 1.09 / 19.6 | 68.9% | -13.4 |
| 9 | 61.8% | 71.4% | 52.0% | 25 / 35 | 11.6% | 9.1% | 17 | 0 | 1.09 / 19.2 | 55.2% | +6.6 |
| 10 | 66.4% | 77.1% | 55.9% | 27 / 35 | 12.2% | 8.1% | 18 | 0 | 1.05 / 20.4 | 53.4% | +13.0 |
| 11 | 65.9% | 80.0% | 51.6% | 28 / 35 | 11.0% | 8.3% | 15 | 0 | 1.08 / 19.7 | 61.0% | +4.9 |
| 12 | 67.4% | 80.0% | 54.5% | 28 / 35 | 11.2% | 8.1% | 13 | 0 | 1.05 / 18.2 | 65.0% | +2.4 |
| 13 | 58.5% | 71.4% | 45.6% | 25 / 35 | 10.9% | 8.4% | 15 | 0 | 1.11 / 19.8 | 60.7% | -2.2 |
| 14 | 63.2% | 80.0% | 46.0% | 28 / 35 | 11.1% | 8.9% | 13 | 0 | 1.07 / 20.0 | 58.5% | +4.7 |
| 15 | 63.3% | 77.1% | 48.6% | 27 / 35 | 11.1% | 9.7% | 26 | 0 | 1.08 / 20.4 | 67.1% | -3.8 |
| 16 | 53.1% | 60.0% | 46.7% | 21 / 35 | 11.3% | 8.8% | 20 | 0 | 1.07 / 20.4 | 62.2% | -9.1 |
| 17 | 69.6% | 85.3% | 53.8% | 30 / 35 | 11.9% | 7.7% | 23 | 0 | 1.06 / 20.3 | 57.5% | +12.1 |
| 18 | 60.6% | 71.4% | 50.3% | 25 / 35 | 11.7% | 9.2% | 21 | 0 | 1.09 / 20.0 | 64.8% | -4.3 |
| 19 | 62.8% | 79.4% | 46.3% | 28 / 35 | 11.3% | 8.1% | 22 | 0 | 1.09 / 20.4 | 60.6% | +2.2 |
| 20 | 61.8% | 74.3% | 48.7% | 26 / 35 | 11.1% | 8.3% | 9 | 0 | 1.05 / 20.0 | 58.7% | +3.1 |

Mean score share 60.6% ± 2.3, baseline 62.0% ± 2.1, paired diff -1.4 ± 3.5.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 343 over 20 battles (17.2 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | rumble-14 | 60.6% ± 2.3 | 72.9% ± 3.2 | 48.3% ± 1.7 | 511 / 700 | 11.2% ± 0.2 | 8.7% ± 0.2 | 343 | 0 | 1.11 / 48.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 20 | 14 | 298 | 0 | 0.49 | 5 | 5 | 0 |

14 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 50860 | 36 | 50840 | 50834 (99.9%) | 26 (0.1%) | 6 (0.0%) | 3639 | 499 | 249 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 53769 | 5407 (10.1%) | 46965 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 650 | 458 | 644 | 984 | 30.5 / 32.5 | 1513 | 22719 | 497 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 8.7% | 343 | 3946 | 3 | 71.7 | 5399 / 5407 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | gh.GresSuffurd | 1 | 35 | 294 | 8.7% | 6.9% ± 1.1 | 11.0% | 23.0% / 22.5% | 11.0% | 0 / 0 | T2/M1 | 62% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
