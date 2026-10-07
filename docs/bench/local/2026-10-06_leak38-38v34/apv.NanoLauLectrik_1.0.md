# apv.NanoLauLectrik 1.0 (lower) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 76.2% | 88.6% | 63.3% | 31 / 35 | 15.7% | 5.8% | 12 | 0 | 1.06 / 16.5 | 83.6% | -7.3 |
| 2 | 85.0% | 97.1% | 70.0% | 34 / 35 | 16.0% | 4.1% | 12 | 0 | 0.89 / 11.5 | 78.1% | +6.9 |
| 3 | 77.3% | 91.4% | 61.8% | 32 / 35 | 15.2% | 5.5% | 10 | 0 | 1.06 / 12.4 | 83.3% | -6.0 |
| 4 | 81.7% | 94.3% | 66.8% | 33 / 35 | 15.2% | 4.9% | 10 | 0 | 0.98 / 11.5 | 75.9% | +5.8 |
| 5 | 82.9% | 97.1% | 67.8% | 34 / 35 | 17.2% | 5.4% | 10 | 0 | 0.97 / 11.8 | 76.4% | +6.5 |
| 6 | 85.1% | 100.0% | 67.9% | 35 / 35 | 16.4% | 4.9% | 11 | 0 | 1.01 / 11.1 | 81.5% | +3.7 |
| 7 | 81.1% | 100.0% | 61.2% | 35 / 35 | 15.0% | 5.9% | 10 | 0 | 1.04 / 15.7 | 88.0% | -6.9 |
| 8 | 81.7% | 94.3% | 67.4% | 33 / 35 | 15.7% | 4.6% | 9 | 0 | 0.88 / 11.4 | 79.0% | +2.7 |
| 9 | 78.9% | 91.4% | 66.0% | 32 / 35 | 18.1% | 6.2% | 8 | 0 | 0.94 / 15.6 | 86.0% | -7.0 |
| 10 | 82.0% | 94.3% | 69.5% | 33 / 35 | 17.5% | 6.0% | 8 | 0 | 0.94 / 15.0 | 77.3% | +4.8 |
| 11 | 82.5% | 97.1% | 65.9% | 34 / 35 | 15.8% | 5.0% | 11 | 0 | 1.02 / 10.8 | 78.6% | +3.9 |
| 12 | 82.2% | 94.3% | 69.5% | 33 / 35 | 17.4% | 5.6% | 8 | 0 | 0.98 / 11.4 | 80.9% | +1.3 |
| 13 | 83.5% | 97.1% | 67.5% | 34 / 35 | 15.2% | 5.2% | 11 | 0 | 0.90 / 16.6 | 74.6% | +8.9 |
| 14 | 80.2% | 94.3% | 65.6% | 33 / 35 | 17.2% | 5.6% | 12 | 0 | 0.96 / 15.0 | 80.6% | -0.4 |
| 15 | 73.4% | 85.7% | 60.7% | 30 / 35 | 15.1% | 5.8% | 13 | 0 | 1.01 / 12.0 | 73.8% | -0.5 |
| 16 | 84.3% | 97.1% | 69.6% | 34 / 35 | 16.5% | 4.6% | 10 | 0 | 1.01 / 11.5 | 81.9% | +2.4 |

Mean score share 81.1% ± 1.7, baseline 80.0% ± 2.1, paired diff +1.2 ± 2.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 165 over 16 battles (10.3 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | lower | 81.1% ± 1.7 | 94.6% ± 2.1 | 66.3% ± 1.6 | 530 / 560 | 16.2% ± 0.5 | 5.3% ± 0.3 | 165 | 0 | 1.06 / 16.6 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 16 | 16 | 0 | 0 | 0.29 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 12330 | 15 | 12354 | 12317 (99.9%) | 13 (0.1%) | 37 (0.3%) | 1220 | 252 | 90 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 14382 | 1068 (7.4%) | 6788 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 650 | 466 | 505 | 385 | 40.2 / 20.5 | 3288 | 10954 | 6090 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 5.3% | 165 | 107 | 3 | 22.1 | 1068 / 1068 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | apv.NanoLauLectrik | 1 | 35 | 304 | 6.0% | 7.3% ± 2.0 | 14.9% | 34.0% / 32.9% | 11.4% | 0 / 0 | T3/M? | 82% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
