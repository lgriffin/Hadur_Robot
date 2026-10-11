# rsalesc.mega.Knight 0.6.28 (rumble-11) vs hadur2.Hadur 3.9

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 55.1% | 57.1% | 52.3% | 20 / 35 | 8.8% | 9.5% | 37 | 0 | 2.08 / 25.2 | 44.0% | +11.1 |
| 2 | 59.8% | 62.9% | 55.6% | 22 / 35 | 9.4% | 9.1% | 31 | 0 | 2.03 / 24.0 | 62.5% | -2.7 |
| 3 | 60.3% | 62.9% | 56.9% | 22 / 35 | 9.7% | 9.7% | 30 | 0 | 2.12 / 25.6 | 51.4% | +8.9 |
| 4 | 61.3% | 68.6% | 53.7% | 24 / 35 | 9.6% | 10.6% | 40 | 0 | 2.14 / 30.3 | 53.6% | +7.8 |
| 5 | 46.6% | 45.7% | 47.5% | 16 / 35 | 8.5% | 10.0% | 31 | 0 | 2.06 / 78.7 | 52.6% | -6.0 |
| 6 | 59.4% | 62.9% | 55.0% | 22 / 35 | 9.8% | 9.2% | 27 | 0 | 2.11 / 25.8 | 51.4% | +8.0 |
| 7 | 49.1% | 48.6% | 49.6% | 17 / 35 | 8.9% | 9.8% | 29 | 0 | 2.07 / 25.8 | 56.1% | -7.0 |
| 8 | 58.1% | 62.9% | 53.2% | 22 / 35 | 9.1% | 10.1% | 36 | 0 | 2.07 / 29.9 | 57.7% | +0.4 |
| 9 | 43.3% | 40.0% | 47.1% | 14 / 35 | 9.0% | 9.9% | 32 | 0 | 1.98 / 21.8 | 54.2% | -11.0 |
| 10 | 54.8% | 57.1% | 51.9% | 20 / 35 | 10.1% | 9.3% | 42 | 0 | 2.12 / 26.0 | 59.1% | -4.3 |
| 11 | 59.2% | 62.9% | 54.1% | 22 / 35 | 9.8% | 8.9% | 33 | 0 | 2.03 / 23.5 | 58.8% | +0.4 |
| 12 | 54.2% | 60.0% | 48.4% | 21 / 35 | 9.5% | 9.7% | 37 | 0 | 2.07 / 26.2 | 53.8% | +0.5 |
| 13 | 42.7% | 37.1% | 49.0% | 13 / 35 | 9.3% | 9.8% | 29 | 0 | 1.99 / 23.5 | 51.8% | -9.2 |
| 14 | 52.7% | 57.1% | 48.0% | 20 / 35 | 9.6% | 9.7% | 33 | 0 | 2.07 / 25.6 | 54.5% | -1.8 |
| 15 | 54.1% | 54.3% | 53.3% | 19 / 35 | 9.1% | 10.2% | 34 | 0 | 2.11 / 25.4 | 52.6% | +1.5 |
| 16 | 56.2% | 60.0% | 52.3% | 21 / 35 | 9.4% | 10.1% | 27 | 0 | 2.03 / 25.1 | 54.3% | +2.0 |
| 17 | 54.0% | 57.1% | 50.8% | 20 / 35 | 9.7% | 10.0% | 32 | 0 | 2.07 / 26.5 | 59.5% | -5.5 |
| 18 | 54.1% | 54.3% | 53.2% | 19 / 35 | 9.2% | 9.8% | 30 | 0 | 2.06 / 24.7 | 52.6% | +1.5 |
| 19 | 60.6% | 65.7% | 54.4% | 23 / 35 | 9.9% | 9.2% | 31 | 0 | 2.07 / 42.7 | 63.4% | -2.7 |
| 20 | 55.5% | 60.0% | 50.6% | 21 / 35 | 8.9% | 9.7% | 33 | 0 | 2.15 / 81.0 | 64.8% | -9.2 |

Mean score share 54.6% ± 2.6, baseline 55.4% ± 2.3, paired diff -0.9 ± 3.0.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 654 over 20 battles (32.7 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | rumble-11 | 54.6% ± 2.6 | 56.9% ± 3.9 | 51.9% ± 1.3 | 398 / 700 | 9.4% ± 0.2 | 9.7% ± 0.2 | 654 | 0 | 2.15 / 81.0 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 20 | 11 | 0 | 0 | 0.93 | 9 | 9 | 0 |

11 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 178879 | 1747 | 178844 | 178782 (99.9%) | 97 (0.1%) | 62 (0.0%) | 14390 | 1381 | 611 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 178874 | 21076 (11.8%) | 176128 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 650 | 510 | 650 | 2995 | 31.7 / 29.4 | 1220 | 34807 | 107 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 9.7% | 654 | 51514 | 3 | 251.9 | 21058 / 21076 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | rsalesc.mega.Knight | 1 | 35 | 314 | 10.4% | 8.3% ± 1.2 | 9.4% | 24.3% / 21.3% | 12.1% | 0 / 0 | T3/M1 | 55% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
