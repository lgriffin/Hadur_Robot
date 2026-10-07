# lxx.Tomcat 3.68 (rumble-10) vs hadur2.Hadur 3.9

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 61.2% | 77.1% | 45.0% | 27 / 35 | 10.4% | 10.5% | 29 | 0 | 2.19 / 65.2 | 60.2% | +1.0 |
| 2 | 52.4% | 64.7% | 42.0% | 23 / 35 | 9.6% | 11.5% | 32 | 0 | 2.09 / 55.6 | 47.9% | +4.5 |
| 3 | 54.5% | 65.7% | 43.1% | 23 / 35 | 9.4% | 10.1% | 29 | 0 | 2.13 / 56.6 | 48.6% | +5.9 |
| 4 | 58.4% | 71.4% | 46.3% | 25 / 35 | 9.2% | 10.4% | 28 | 0 | 2.13 / 102.7 | 46.6% | +11.9 |
| 5 | 52.7% | 61.8% | 44.3% | 22 / 35 | 9.5% | 9.8% | 32 | 0 | 2.01 / 58.4 | 58.1% | -5.3 |
| 6 | 50.6% | 62.9% | 38.2% | 22 / 35 | 8.3% | 10.5% | 36 | 0 | 2.04 / 65.0 | 45.1% | +5.5 |
| 7 | 60.1% | 71.4% | 48.9% | 25 / 35 | 9.7% | 10.7% | 35 | 0 | 2.13 / 58.9 | 55.6% | +4.5 |
| 8 | 59.2% | 73.5% | 45.6% | 26 / 35 | 10.3% | 10.1% | 33 | 0 | 2.11 / 38.0 | 43.9% | +15.2 |
| 9 | 55.0% | 65.7% | 44.1% | 23 / 35 | 9.4% | 9.1% | 27 | 0 | 2.08 / 53.5 | 62.9% | -7.9 |
| 10 | 44.5% | 54.3% | 36.4% | 19 / 35 | 9.1% | 10.9% | 27 | 0 | 1.97 / 53.4 | 44.2% | +0.3 |
| 11 | 60.4% | 77.1% | 43.4% | 27 / 35 | 8.8% | 10.1% | 35 | 0 | 2.08 / 57.8 | 53.0% | +7.4 |
| 12 | 50.6% | 62.9% | 39.0% | 22 / 35 | 8.9% | 10.5% | 32 | 0 | 1.98 / 53.3 | 53.4% | -2.8 |
| 13 | 48.6% | 54.3% | 43.9% | 19 / 35 | 9.6% | 9.8% | 20 | 0 | 2.07 / 55.4 | 56.1% | -7.4 |
| 14 | 46.5% | 51.4% | 42.5% | 18 / 35 | 9.6% | 10.8% | 24 | 0 | 1.93 / 48.8 | 57.9% | -11.4 |
| 15 | 59.5% | 71.4% | 47.2% | 25 / 35 | 9.9% | 9.7% | 32 | 0 | 2.12 / 62.0 | 57.9% | +1.6 |
| 16 | 54.8% | 65.7% | 43.5% | 23 / 35 | 9.6% | 10.6% | 31 | 0 | 2.01 / 54.7 | 46.9% | +7.9 |
| 17 | 45.4% | 51.4% | 40.7% | 18 / 35 | 10.1% | 10.3% | 30 | 0 | 1.97 / 40.0 | 54.6% | -9.2 |
| 18 | 53.6% | 62.9% | 43.9% | 22 / 35 | 9.2% | 9.6% | 25 | 0 | 2.07 / 53.8 | 54.5% | -0.9 |
| 19 | 51.9% | 62.9% | 41.9% | 22 / 35 | 9.8% | 10.4% | 30 | 0 | 1.93 / 51.7 | 51.0% | +0.9 |
| 20 | 55.8% | 68.6% | 43.7% | 24 / 35 | 9.9% | 10.1% | 34 | 0 | 2.09 / 55.2 | 58.2% | -2.5 |

Mean score share 53.8% ± 2.4, baseline 52.8% ± 2.7, paired diff +1.0 ± 3.3.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 601 over 20 battles (30.1 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | rumble-10 | 53.8% ± 2.4 | 64.9% ± 3.6 | 43.2% ± 1.4 | 455 / 700 | 9.5% ± 0.2 | 10.3% ± 0.2 | 601 | 0 | 2.19 / 102.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | 20 | 13 | 0 | 0 | 0.86 | 7 | 7 | 0 |

13 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | 119692 | 2274 | 120436 | 119589 (99.9%) | 103 (0.1%) | 847 (0.7%) | 9848 | 988 | 529 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| lxx.Tomcat 3.68 | 121724 | 14027 (11.5%) | 118964 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | 650 | 511 | 650 | 2058 | 27.2 / 35.8 | 538 | 86323 | 53 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | 10.3% | 601 | 3893 | 3 | 171.3 | 14009 / 14027 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | lxx.Tomcat | 1 | 35 | 274 | 10.4% | 8.8% ± 0.9 | 10.5% | 23.6% / 21.6% | 9.1% | 0 / 0 | T3/M1 | 56% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
