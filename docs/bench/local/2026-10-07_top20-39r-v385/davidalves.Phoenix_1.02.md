# davidalves.Phoenix 1.02 (rumble-21) vs hadur2.Hadur 3.9

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 57.9% | 77.1% | 38.3% | 27 / 35 | 10.5% | 8.0% | 13 | 0 | 1.19 / 12.9 | 56.7% | +1.2 |
| 2 | 59.1% | 74.3% | 42.4% | 26 / 35 | 9.0% | 7.4% | 12 | 0 | 1.17 / 14.9 | 52.7% | +6.4 |
| 3 | 54.9% | 71.4% | 39.6% | 25 / 35 | 9.9% | 9.1% | 15 | 0 | 1.23 / 15.2 | 65.5% | -10.6 |
| 4 | 65.5% | 85.7% | 43.6% | 30 / 35 | 9.2% | 7.6% | 14 | 0 | 1.19 / 13.2 | 57.1% | +8.4 |
| 5 | 59.9% | 77.1% | 41.8% | 27 / 35 | 11.0% | 7.6% | 15 | 0 | 1.19 / 15.7 | 54.7% | +5.2 |
| 6 | 62.7% | 80.0% | 44.4% | 28 / 35 | 10.1% | 8.1% | 15 | 0 | 1.17 / 12.9 | 54.9% | +7.7 |
| 7 | 64.2% | 85.7% | 40.6% | 30 / 35 | 9.8% | 7.5% | 14 | 0 | 1.19 / 13.0 | 60.9% | +3.3 |
| 8 | 51.7% | 65.7% | 39.0% | 23 / 35 | 9.2% | 8.8% | 12 | 0 | 1.19 / 20.5 | 59.0% | -7.3 |
| 9 | 57.2% | 77.1% | 36.9% | 27 / 35 | 9.7% | 7.7% | 16 | 0 | 1.16 / 18.7 | 59.7% | -2.5 |
| 10 | 53.7% | 71.4% | 35.4% | 25 / 35 | 8.7% | 8.0% | 16 | 0 | 1.17 / 14.4 | 63.8% | -10.1 |
| 11 | 52.5% | 65.7% | 40.2% | 23 / 35 | 9.7% | 9.1% | 11 | 0 | 1.10 / 12.9 | 51.0% | +1.5 |
| 12 | 64.7% | 85.7% | 41.9% | 30 / 35 | 10.7% | 7.8% | 10 | 0 | 1.23 / 16.8 | 64.3% | +0.4 |
| 13 | 57.3% | 71.4% | 43.9% | 25 / 35 | 10.1% | 8.5% | 14 | 0 | 1.18 / 13.1 | 55.7% | +1.6 |
| 14 | 55.4% | 71.4% | 38.5% | 25 / 35 | 9.7% | 8.3% | 19 | 0 | 1.23 / 48.7 | 55.0% | +0.4 |
| 15 | 59.3% | 77.1% | 39.5% | 27 / 35 | 9.6% | 7.4% | 5 | 0 | 1.17 / 12.3 | 57.7% | +1.5 |
| 16 | 58.3% | 74.3% | 42.1% | 26 / 35 | 10.4% | 7.9% | 15 | 0 | 1.27 / 15.5 | 56.9% | +1.4 |
| 17 | 50.7% | 68.6% | 34.6% | 24 / 35 | 9.4% | 9.0% | 8 | 0 | 1.23 / 14.0 | 58.8% | -8.1 |
| 18 | 49.5% | 62.9% | 37.1% | 22 / 35 | 9.0% | 8.8% | 13 | 0 | 1.28 / 13.9 | 57.3% | -7.8 |
| 19 | 57.4% | 74.3% | 39.9% | 26 / 35 | 9.3% | 24.7% | 11 | 0 | 1.25 / 13.8 | 53.0% | +4.4 |
| 20 | 55.6% | 74.3% | 36.8% | 26 / 35 | 8.4% | 8.7% | 15 | 0 | 1.30 / 13.8 | 56.0% | -0.4 |

Mean score share 57.4% ± 2.1, baseline 57.5% ± 1.8, paired diff -0.2 ± 2.7.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 263 over 20 battles (13.2 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | rumble-21 | 57.4% ± 2.1 | 74.6% ± 3.0 | 39.8% ± 1.3 | 522 / 700 | 9.7% ± 0.3 | 9.0% ± 1.8 | 263 | 0 | 1.30 / 48.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 20 | 17 | 496 | 0 | 0.38 | 2 | 2 | 0 |

17 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 37832 | 22 | 37801 | 37795 (99.9%) | 37 (0.1%) | 6 (0.0%) | 2766 | 395 | 105 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| davidalves.Phoenix 1.02 | 47286 | 3582 (7.6%) | 35383 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 650 | 460 | 650 | 853 | 24.0 / 36.3 | 430 | 28669 | 390 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 9.0% | 263 | 10082 | 3 | 53.7 | 3581 / 3582 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | davidalves.Phoenix | 1 | 35 | 306 | 9.2% | 8.0% ± 1.3 | 8.9% | 20.1% / 21.8% | 5.7% | 0 / 0 | T3/M1 | 55% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
