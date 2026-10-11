# aaa.r.ScalarR 0.005h.053-noshield (rumble-5) vs hadur2.Hadur 3.9

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 35.2% | 28.6% | 43.1% | 10 / 35 | 7.3% | 9.7% | 35 | 0 | 1.80 / 54.6 | 39.2% | -4.0 |
| 2 | 33.1% | 28.6% | 39.4% | 10 / 35 | 6.6% | 10.6% | 35 | 0 | 1.87 / 50.4 | 34.6% | -1.5 |
| 3 | 33.0% | 25.7% | 41.6% | 9 / 35 | 7.1% | 11.2% | 40 | 0 | 1.86 / 163.7 | 33.7% | -0.6 |
| 4 | 32.0% | 22.9% | 43.3% | 8 / 35 | 5.9% | 9.3% | 36 | 0 | 1.80 / 49.2 | 35.2% | -3.1 |
| 5 | 31.7% | 25.7% | 39.8% | 9 / 35 | 6.6% | 9.8% | 34 | 0 | 1.88 / 52.6 | 29.8% | +1.9 |
| 6 | 34.6% | 29.4% | 41.4% | 11 / 35 | 7.5% | 10.9% | 40 | 0 | 1.84 / 49.0 | 33.6% | +1.0 |
| 7 | 35.3% | 31.4% | 40.1% | 11 / 35 | 7.3% | 10.3% | 44 | 0 | 1.94 / 127.2 | 30.9% | +4.4 |
| 8 | 34.7% | 31.4% | 39.2% | 11 / 35 | 6.7% | 10.5% | 36 | 0 | 1.82 / 53.4 | 28.9% | +5.8 |
| 9 | 43.8% | 42.9% | 45.8% | 15 / 35 | 6.8% | 9.6% | 38 | 0 | 1.92 / 52.8 | 29.5% | +14.3 |
| 10 | 36.7% | 31.4% | 42.7% | 11 / 35 | 6.9% | 10.4% | 32 | 0 | 1.83 / 45.9 | 27.8% | +8.9 |
| 11 | 37.3% | 37.1% | 38.0% | 13 / 35 | 5.6% | 10.2% | 29 | 0 | 1.77 / 52.4 | 29.2% | +8.1 |
| 12 | 31.7% | 25.7% | 39.4% | 9 / 35 | 6.3% | 10.6% | 35 | 0 | 1.83 / 45.7 | 31.6% | +0.1 |
| 13 | 29.5% | 20.0% | 40.6% | 7 / 35 | 7.1% | 10.5% | 32 | 0 | 1.85 / 54.9 | 26.9% | +2.6 |
| 14 | 29.8% | 20.0% | 40.4% | 7 / 35 | 6.7% | 11.6% | 41 | 0 | 1.70 / 78.4 | 32.8% | -3.0 |
| 15 | 33.9% | 25.7% | 43.1% | 9 / 35 | 6.6% | 11.2% | 42 | 0 | 1.74 / 53.3 | 32.6% | +1.3 |
| 16 | 42.5% | 41.2% | 44.4% | 15 / 35 | 6.4% | 9.2% | 46 | 0 | 1.85 / 53.0 | 33.7% | +8.8 |
| 17 | 30.0% | 20.0% | 41.4% | 7 / 35 | 6.8% | 10.7% | 34 | 0 | 1.81 / 68.2 | 31.4% | -1.4 |
| 18 | 29.5% | 17.1% | 43.2% | 6 / 35 | 7.3% | 11.2% | 36 | 0 | 1.82 / 56.1 | 32.2% | -2.6 |
| 19 | 39.1% | 37.1% | 41.8% | 13 / 35 | 7.0% | 10.6% | 40 | 0 | 1.88 / 51.2 | 27.4% | +11.7 |
| 20 | 35.3% | 28.6% | 43.3% | 10 / 35 | 7.2% | 10.8% | 39 | 0 | 1.85 / 56.1 | 28.4% | +6.8 |

Mean score share 34.4% ± 1.9, baseline 31.5% ± 1.4, paired diff +3.0 ± 2.5.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 744 over 20 battles (37.2 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | rumble-5 | 34.4% ± 1.9 | 28.5% ± 3.3 | 41.6% ± 0.9 | 201 / 700 | 6.8% ± 0.2 | 10.4% ± 0.3 | 744 | 0 | 1.94 / 163.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | 20 | 16 | 1192 | 0 | 1.06 | 0 | 0 | 0 |

16 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | 149813 | 53 | 153791 | 149704 (99.9%) | 109 (0.1%) | 4087 (2.7%) | 9118 | 1584 | 737 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | 152619 | 17993 (11.8%) | 149717 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 485 | 650 | 2548 | 23.8 / 33.5 | 37 | 5910 | 7 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | 10.4% | 744 | 1143 | 3 | 219.4 | 17951 / 17993 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | aaa.r.ScalarR | 1 | 35 | 316 | 10.9% | 8.6% ± 1.1 | 7.8% | 24.2% / 21.7% | 0.0% | 0 / 0 | T3/M1 | 35% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
