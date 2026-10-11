# DM.mega.Regicide 2.0rrr (mid) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 74.4% | 91.4% | 56.1% | 32 / 35 | 11.4% | 7.3% | 15 | 0 | 1.33 / 16.3 | 69.3% | +5.1 |
| 2 | 65.1% | 77.1% | 50.6% | 27 / 35 | 11.0% | 7.5% | 21 | 0 | 1.34 / 16.7 | 70.5% | -5.4 |
| 3 | 73.8% | 91.4% | 54.5% | 32 / 35 | 11.2% | 6.9% | 13 | 0 | 1.33 / 17.2 | 66.8% | +7.0 |
| 4 | 64.1% | 77.1% | 50.5% | 27 / 35 | 11.4% | 7.0% | 17 | 0 | 1.33 / 16.8 | 77.2% | -13.1 |
| 5 | 80.2% | 97.1% | 60.9% | 34 / 35 | 11.6% | 6.0% | 13 | 0 | 1.28 / 17.5 | 65.9% | +14.3 |
| 6 | 62.2% | 74.3% | 50.2% | 26 / 35 | 13.3% | 8.4% | 15 | 0 | 1.25 / 16.9 | 65.4% | -3.2 |
| 7 | 69.3% | 85.7% | 50.5% | 30 / 35 | 11.2% | 6.9% | 8 | 0 | 1.29 / 15.9 | 67.1% | +2.2 |
| 8 | 76.5% | 91.4% | 58.7% | 32 / 35 | 11.2% | 6.7% | 15 | 0 | 1.29 / 17.7 | 74.8% | +1.7 |
| 9 | 77.1% | 88.6% | 63.0% | 31 / 35 | 12.9% | 6.8% | 12 | 0 | 1.27 / 17.5 | 70.6% | +6.5 |
| 10 | 66.1% | 80.0% | 50.7% | 28 / 35 | 11.4% | 7.2% | 19 | 0 | 1.29 / 16.9 | 74.2% | -8.1 |
| 11 | 77.2% | 94.3% | 59.3% | 33 / 35 | 11.6% | 7.4% | 15 | 0 | 1.31 / 17.0 | 77.3% | -0.1 |
| 12 | 73.8% | 88.6% | 56.2% | 31 / 35 | 11.3% | 6.5% | 18 | 0 | 1.32 / 17.7 | 72.2% | +1.6 |
| 13 | 68.4% | 80.0% | 54.7% | 28 / 35 | 11.3% | 6.4% | 14 | 0 | 1.27 / 16.6 | 73.8% | -5.4 |
| 14 | 63.9% | 71.4% | 55.2% | 25 / 35 | 10.4% | 6.4% | 11 | 0 | 1.28 / 15.6 | 64.2% | -0.2 |
| 15 | 66.1% | 77.1% | 53.2% | 27 / 35 | 11.2% | 6.5% | 17 | 0 | 1.27 / 17.6 | 74.0% | -7.9 |
| 16 | 68.2% | 80.0% | 54.9% | 28 / 35 | 11.1% | 7.7% | 17 | 0 | 1.30 / 17.1 | 67.7% | +0.5 |
| 17 | 58.2% | 68.6% | 47.0% | 24 / 35 | 10.7% | 7.7% | 10 | 0 | 1.38 / 19.6 | 70.8% | -12.7 |
| 18 | 77.8% | 94.3% | 57.7% | 33 / 35 | 10.9% | 6.2% | 13 | 0 | 1.35 / 17.3 | 75.0% | +2.8 |
| 19 | 63.2% | 80.0% | 46.7% | 28 / 35 | 12.2% | 7.4% | 17 | 0 | 1.29 / 16.3 | 75.7% | -12.5 |
| 20 | 69.1% | 82.9% | 53.8% | 29 / 35 | 10.9% | 7.5% | 16 | 0 | 1.34 / 17.0 | 66.4% | +2.7 |

Mean score share 69.7% ± 2.9, baseline 70.9% ± 2.0, paired diff -1.2 ± 3.4.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 296 over 20 battles (14.8 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| DM.mega.Regicide 2.0rrr | mid | 69.7% ± 2.9 | 83.6% ± 3.9 | 54.2% ± 2.1 | 585 / 700 | 11.4% ± 0.3 | 7.0% ± 0.3 | 296 | 0 | 1.38 / 19.6 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| DM.mega.Regicide 2.0rrr | 20 | 16 | 0 | 0 | 0.42 | 4 | 4 | 0 |

16 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| DM.mega.Regicide 2.0rrr | 50949 | 44 | 50948 | 50947 (100.0%) | 2 (0.0%) | 1 (0.0%) | 3744 | 401 | 198 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| DM.mega.Regicide 2.0rrr | 54640 | 5186 (9.5%) | 50593 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| DM.mega.Regicide 2.0rrr | 650 | 544 | 575 | 997 | 31.5 / 26.7 | 1986 | 17869 | 496 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| DM.mega.Regicide 2.0rrr | 7.0% | 296 | 2034 | 3 | 72.5 | 5175 / 5186 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| DM.mega.Regicide 2.0rrr | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| DM.mega.Regicide 2.0rrr | DM.mega.Regicide | 1 | 35 | 302 | 7.9% | 7.2% ± 1.0 | 10.8% | 25.9% / 23.3% | 6.0% | 0 / 0 | T3/M0 | 68% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
