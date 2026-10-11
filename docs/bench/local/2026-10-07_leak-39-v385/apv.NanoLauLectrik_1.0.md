# apv.NanoLauLectrik 1.0 (lower) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 80.7% | 94.3% | 65.7% | 33 / 35 | 15.6% | 5.2% | 12 | 0 | 0.98 / 16.3 | 87.1% | -6.3 |
| 2 | 80.9% | 97.1% | 64.5% | 34 / 35 | 17.0% | 6.6% | 12 | 0 | 0.96 / 12.1 | 81.0% | -0.1 |
| 3 | 79.3% | 97.1% | 61.3% | 34 / 35 | 16.0% | 6.6% | 11 | 0 | 0.98 / 11.2 | 78.9% | +0.4 |
| 4 | 77.5% | 97.1% | 58.8% | 34 / 35 | 14.8% | 7.9% | 8 | 0 | 0.99 / 17.3 | 85.7% | -8.2 |
| 5 | 76.0% | 91.4% | 61.0% | 32 / 35 | 16.1% | 6.6% | 10 | 0 | 0.94 / 12.0 | 83.0% | -7.0 |
| 6 | 79.0% | 94.3% | 62.9% | 33 / 35 | 16.4% | 6.0% | 12 | 0 | 0.91 / 12.0 | 83.8% | -4.8 |
| 7 | 82.0% | 94.3% | 69.1% | 33 / 35 | 17.4% | 5.3% | 9 | 0 | 0.93 / 16.2 | 83.0% | -0.9 |
| 8 | 77.5% | 94.3% | 61.0% | 33 / 35 | 16.1% | 7.1% | 10 | 0 | 0.95 / 12.3 | 81.7% | -4.2 |
| 9 | 76.6% | 88.6% | 64.9% | 31 / 35 | 18.5% | 6.3% | 10 | 0 | 0.97 / 181.0 | 79.2% | -2.6 |
| 10 | 76.8% | 94.3% | 57.1% | 33 / 35 | 14.1% | 5.9% | 16 | 0 | 1.01 / 12.8 | 83.0% | -6.3 |
| 11 | 83.7% | 100.0% | 65.1% | 35 / 35 | 14.8% | 5.4% | 10 | 0 | 0.99 / 12.1 | 78.1% | +5.6 |
| 12 | 86.9% | 100.0% | 71.4% | 35 / 35 | 15.7% | 4.7% | 9 | 0 | 0.92 / 12.9 | 83.3% | +3.6 |
| 13 | 80.6% | 94.3% | 65.4% | 33 / 35 | 16.0% | 5.7% | 12 | 0 | 0.97 / 11.9 | 80.4% | +0.2 |
| 14 | 78.0% | 94.1% | 62.1% | 33 / 35 | 15.5% | 5.8% | 14 | 0 | 0.95 / 17.2 | 76.7% | +1.3 |
| 15 | 77.1% | 94.1% | 60.4% | 33 / 35 | 15.3% | 6.9% | 11 | 0 | 1.01 / 15.9 | 77.3% | -0.2 |
| 16 | 81.6% | 97.1% | 65.7% | 34 / 35 | 16.8% | 5.8% | 11 | 0 | 0.93 / 17.1 | 79.8% | +1.8 |

Mean score share 79.6% ± 1.6, baseline 81.4% ± 1.6, paired diff -1.7 ± 2.2.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 177 over 16 battles (11.1 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | lower | 79.6% ± 1.6 | 95.2% ± 1.5 | 63.5% ± 2.0 | 533 / 560 | 16.0% ± 0.6 | 6.1% ± 0.4 | 177 | 0 | 1.01 / 181.0 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 16 | 16 | 0 | 0 | 0.32 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 12617 | 33 | 12650 | 12612 (100.0%) | 5 (0.0%) | 38 (0.3%) | 1123 | 230 | 57 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 14785 | 1032 (7.0%) | 4991 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 650 | 459 | 514 | 395 | 40.9 / 23.6 | 3199 | 10813 | 6710 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 6.1% | 177 | 289 | 3 | 22.6 | 1031 / 1032 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | apv.NanoLauLectrik | 1 | 35 | 304 | 7.1% | 8.8% ± 2.1 | 15.1% | 33.7% / 31.7% | 10.9% | 0 / 0 | T3/M? | 80% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
