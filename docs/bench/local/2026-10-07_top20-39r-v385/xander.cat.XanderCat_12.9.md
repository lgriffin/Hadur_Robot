# xander.cat.XanderCat 12.9 (rumble-9) vs hadur2.Hadur 3.9

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 62.1% | 74.3% | 51.0% | 26 / 35 | 11.7% | 8.6% | 22 | 0 | 1.21 / 14.5 | 55.8% | +6.3 |
| 2 | 48.3% | 54.3% | 44.5% | 19 / 35 | 11.8% | 8.9% | 25 | 0 | 1.24 / 14.9 | 63.3% | -15.0 |
| 3 | 58.1% | 71.4% | 46.0% | 25 / 35 | 11.3% | 8.0% | 25 | 0 | 1.21 / 13.0 | 49.0% | +9.1 |
| 4 | 50.9% | 60.0% | 44.2% | 21 / 35 | 11.4% | 9.1% | 23 | 0 | 1.21 / 87.2 | 64.5% | -13.5 |
| 5 | 59.9% | 65.7% | 53.8% | 23 / 35 | 11.6% | 8.0% | 23 | 0 | 1.25 / 15.0 | 54.2% | +5.8 |
| 6 | 55.9% | 57.1% | 54.1% | 20 / 35 | 10.9% | 7.6% | 19 | 0 | 1.24 / 27.4 | 62.9% | -7.1 |
| 7 | 57.4% | 65.7% | 49.1% | 23 / 35 | 11.2% | 7.6% | 12 | 0 | 1.15 / 55.7 | 59.5% | -2.1 |
| 8 | 58.2% | 62.9% | 53.4% | 22 / 35 | 12.6% | 9.3% | 13 | 0 | 1.24 / 43.6 | 60.7% | -2.5 |
| 9 | 58.9% | 68.6% | 50.2% | 24 / 35 | 11.6% | 8.6% | 18 | 0 | 1.23 / 14.5 | 52.0% | +6.9 |
| 10 | 55.0% | 54.3% | 55.0% | 19 / 35 | 11.1% | 8.4% | 20 | 0 | 1.23 / 13.8 | 66.0% | -11.0 |
| 11 | 58.9% | 71.4% | 46.8% | 25 / 35 | 11.2% | 7.5% | 15 | 0 | 1.18 / 14.7 | 61.3% | -2.4 |
| 12 | 49.3% | 54.3% | 45.7% | 19 / 35 | 12.4% | 8.5% | 16 | 0 | 1.28 / 13.0 | 59.1% | -9.8 |
| 13 | 54.9% | 62.9% | 47.7% | 22 / 35 | 10.8% | 8.7% | 12 | 0 | 1.22 / 14.9 | 59.8% | -4.8 |
| 14 | 68.4% | 80.0% | 56.1% | 28 / 35 | 11.7% | 7.4% | 19 | 0 | 1.18 / 15.9 | 52.8% | +15.6 |
| 15 | 65.3% | 74.3% | 56.2% | 26 / 35 | 12.5% | 7.6% | 23 | 0 | 1.17 / 15.7 | 44.0% | +21.3 |
| 16 | 57.3% | 68.6% | 47.3% | 24 / 35 | 11.4% | 8.7% | 17 | 0 | 1.23 / 19.4 | 54.4% | +2.9 |
| 17 | 54.7% | 60.0% | 50.4% | 21 / 35 | 11.1% | 7.9% | 24 | 0 | 1.24 / 13.9 | 48.8% | +5.9 |
| 18 | 59.7% | 65.7% | 53.1% | 23 / 35 | 11.7% | 8.1% | 23 | 0 | 1.24 / 14.7 | 59.4% | +0.3 |
| 19 | 57.3% | 65.7% | 49.9% | 23 / 35 | 11.7% | 8.3% | 16 | 0 | 1.27 / 15.7 | 52.3% | +5.0 |
| 20 | 55.5% | 60.0% | 51.3% | 21 / 35 | 11.9% | 8.7% | 19 | 0 | 1.26 / 15.8 | 56.1% | -0.6 |

Mean score share 57.3% ± 2.2, baseline 56.8% ± 2.7, paired diff +0.5 ± 4.4.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 384 over 20 battles (19.2 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | rumble-9 | 57.3% ± 2.2 | 64.9% ± 3.4 | 50.3% ± 1.8 | 454 / 700 | 11.6% ± 0.2 | 8.3% ± 0.3 | 384 | 0 | 1.28 / 87.2 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 20 | 16 | 298 | 0 | 0.55 | 4 | 4 | 20 |

16 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 57493 | 25 | 60159 | 57470 (100.0%) | 23 (0.0%) | 2689 (4.5%) | 5992 | 769 | 280 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| xander.cat.XanderCat 12.9 | 73288 | 6025 (8.2%) | 67121 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 650 | 454 | 650 | 1304 | 33.1 / 32.8 | 1182 | 9373 | 251 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 8.3% | 384 | 3024 | 3 | 85.1 | 6017 / 6025 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 1 | 35 | 314 | 10.6% | 7.6% ± 0.9 | 11.3% | 23.2% / 22.2% | 8.4% | 0 / 0 | T3/M1 | 56% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
