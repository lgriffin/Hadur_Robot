# voidious.Dookious 1.573c (rumble-20) vs hadur2.Hadur 3.9

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 66.5% | 82.9% | 48.3% | 29 / 35 | 9.2% | 6.5% | 12 | 0 | 1.14 / 13.8 | 58.7% | +7.8 |
| 2 | 63.5% | 80.0% | 45.4% | 28 / 35 | 10.8% | 7.1% | 12 | 0 | 1.18 / 13.9 | 62.1% | +1.4 |
| 3 | 59.7% | 74.3% | 43.9% | 26 / 35 | 8.9% | 6.8% | 5 | 0 | 1.23 / 14.6 | 57.7% | +2.0 |
| 4 | 56.1% | 71.4% | 39.9% | 25 / 35 | 10.2% | 7.7% | 16 | 0 | 1.28 / 13.7 | 69.5% | -13.4 |
| 5 | 54.4% | 68.6% | 40.1% | 24 / 35 | 9.7% | 8.0% | 16 | 0 | 1.26 / 13.5 | 55.1% | -0.7 |
| 6 | 59.6% | 74.3% | 43.4% | 26 / 35 | 9.3% | 6.8% | 13 | 0 | 1.25 / 246.9 | 58.7% | +0.9 |
| 7 | 60.4% | 74.3% | 45.1% | 26 / 35 | 9.1% | 7.3% | 12 | 0 | 1.23 / 14.3 | 48.0% | +12.4 |
| 8 | 62.0% | 80.0% | 40.6% | 28 / 35 | 9.2% | 7.1% | 15 | 0 | 1.23 / 14.2 | 59.1% | +2.8 |
| 9 | 53.0% | 65.7% | 39.2% | 23 / 35 | 9.9% | 7.4% | 16 | 0 | 1.24 / 14.3 | 61.4% | -8.4 |
| 10 | 57.9% | 71.4% | 42.7% | 25 / 35 | 9.7% | 7.0% | 11 | 0 | 1.23 / 14.9 | 60.6% | -2.7 |
| 11 | 61.4% | 80.0% | 42.5% | 28 / 35 | 10.2% | 7.7% | 15 | 0 | 1.14 / 14.5 | 53.1% | +8.3 |
| 12 | 62.8% | 80.0% | 40.5% | 28 / 35 | 8.5% | 6.2% | 10 | 0 | 1.20 / 16.3 | 59.2% | +3.6 |
| 13 | 56.7% | 71.4% | 40.4% | 25 / 35 | 9.2% | 7.2% | 9 | 0 | 1.23 / 13.1 | 58.9% | -2.2 |
| 14 | 60.3% | 77.1% | 41.4% | 27 / 35 | 9.0% | 7.4% | 16 | 0 | 1.29 / 14.6 | 69.3% | -9.0 |
| 15 | 61.7% | 80.0% | 41.2% | 28 / 35 | 9.4% | 6.9% | 14 | 0 | 1.27 / 13.1 | 54.0% | +7.7 |
| 16 | 61.4% | 77.1% | 44.7% | 27 / 35 | 9.7% | 7.6% | 13 | 0 | 1.29 / 13.9 | 59.8% | +1.6 |
| 17 | 55.1% | 62.9% | 47.2% | 22 / 35 | 9.9% | 7.2% | 9 | 0 | 1.28 / 23.0 | 58.0% | -2.9 |
| 18 | 64.0% | 80.0% | 46.0% | 28 / 35 | 10.3% | 7.2% | 14 | 0 | 1.27 / 15.1 | 58.1% | +5.9 |
| 19 | 62.9% | 80.0% | 43.8% | 28 / 35 | 9.1% | 7.5% | 12 | 0 | 1.26 / 14.6 | 58.1% | +4.8 |
| 20 | 60.2% | 77.1% | 40.5% | 27 / 35 | 9.5% | 6.9% | 17 | 0 | 1.29 / 13.8 | 61.2% | -1.0 |

Mean score share 60.0% ± 1.6, baseline 59.0% ± 2.3, paired diff +0.9 ± 3.0.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 257 over 20 battles (12.9 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | rumble-20 | 60.0% ± 1.6 | 75.4% ± 2.5 | 42.8% ± 1.2 | 528 / 700 | 9.5% ± 0.3 | 7.2% ± 0.2 | 257 | 0 | 1.29 / 246.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | 20 | 17 | 894 | 0 | 0.37 | 1 | 1 | 0 |

17 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | 37376 | 63 | 37316 | 37315 (99.8%) | 61 (0.2%) | 1 (0.0%) | 2633 | 265 | 129 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| voidious.Dookious 1.573c | 45788 | 3512 (7.7%) | 30646 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | 650 | 483 | 638 | 836 | 24.0 / 32.0 | 602 | 21377 | 11337 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | 7.2% | 257 | 12006 | 3 | 53.2 | 3503 / 3512 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | voidious.Dookious | 1 | 35 | 306 | 7.5% | 6.7% ± 1.2 | 10.3% | 22.0% / 22.3% | 10.9% | 0 / 0 | T2/M1 | 60% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
