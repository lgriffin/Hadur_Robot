# mz.NanoDeath 2.56 (nano) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 73.3% | 100.0% | 62.0% | 35 / 35 | 71.4% | 45.4% | 12 | 0 | 0.51 / 10.3 | 66.7% | +6.6 |
| 2 | 66.7% | 91.4% | 58.2% | 32 / 35 | 74.9% | 54.6% | 5 | 0 | 0.52 / 9.1 | 68.3% | -1.6 |
| 3 | 67.5% | 91.4% | 58.3% | 32 / 35 | 68.8% | 51.4% | 10 | 0 | 0.51 / 8.9 | 68.3% | -0.8 |
| 4 | 65.2% | 94.3% | 59.8% | 33 / 35 | 78.9% | 54.0% | 9 | 0 | 0.50 / 8.8 | 63.5% | +1.7 |
| 5 | 63.7% | 85.7% | 61.2% | 30 / 35 | 79.0% | 52.4% | 10 | 0 | 0.54 / 6.1 | 68.3% | -4.5 |
| 6 | 66.7% | 94.3% | 58.0% | 33 / 35 | 75.1% | 55.5% | 11 | 0 | 0.55 / 9.2 | 68.4% | -1.6 |
| 7 | 64.0% | 91.4% | 59.6% | 32 / 35 | 79.8% | 50.8% | 11 | 0 | 0.55 / 8.8 | 72.4% | -8.3 |
| 8 | 69.5% | 94.3% | 60.0% | 33 / 35 | 71.5% | 49.1% | 11 | 0 | 0.49 / 8.1 | 67.5% | +2.0 |
| 9 | 66.6% | 88.6% | 58.9% | 31 / 35 | 76.1% | 53.3% | 9 | 0 | 0.51 / 10.4 | 69.6% | -3.0 |
| 10 | 71.6% | 100.0% | 60.3% | 35 / 35 | 72.1% | 50.3% | 9 | 0 | 0.44 / 8.2 | 70.5% | +1.1 |
| 11 | 61.7% | 91.4% | 57.0% | 32 / 35 | 79.5% | 56.1% | 10 | 0 | 0.54 / 24.2 | 67.3% | -5.6 |
| 12 | 66.5% | 94.3% | 61.3% | 33 / 35 | 81.6% | 49.8% | 9 | 0 | 0.47 / 9.0 | 61.8% | +4.8 |
| 13 | 69.8% | 97.1% | 61.5% | 34 / 35 | 75.4% | 47.9% | 11 | 0 | 0.52 / 8.7 | 70.9% | -1.1 |
| 14 | 64.4% | 85.7% | 57.4% | 30 / 35 | 74.1% | 56.7% | 8 | 0 | 0.42 / 8.2 | 68.7% | -4.3 |
| 15 | 69.4% | 91.4% | 60.7% | 32 / 35 | 69.9% | 46.8% | 9 | 0 | 0.50 / 7.8 | 67.9% | +1.5 |
| 16 | 67.9% | 91.2% | 59.3% | 32 / 35 | 70.9% | 50.3% | 4 | 0 | 0.40 / 8.2 | 66.2% | +1.7 |

Mean score share 67.2% ± 1.6, baseline 67.9% ± 1.4, paired diff -0.7 ± 2.1.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 148 over 16 battles (9.3 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| mz.NanoDeath 2.56 | nano | 67.2% ± 1.6 | 92.7% ± 2.2 | 59.6% ± 0.8 | 519 / 560 | 74.9% ± 2.1 | 51.5% ± 1.8 | 148 | 0 | 0.55 / 24.2 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| mz.NanoDeath 2.56 | 16 | 14 | 0 | 0 | 0.26 | 2 | 1 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| mz.NanoDeath 2.56 | 4490 | 29 | 4493 | 4490 (100.0%) | 0 (0.0%) | 3 (0.1%) | 6547 | 620 | 37 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| mz.NanoDeath 2.56 | 4547 | 107 (2.4%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| mz.NanoDeath 2.56 | 650 | 152 | 650 | 148 | 100.4 / 68.4 | 4037 | 4920 | 171 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| mz.NanoDeath 2.56 | 51.5% | 148 | 55 | 3 | 7.8 | 107 / 107 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| mz.NanoDeath 2.56 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| mz.NanoDeath 2.56 | mz.NanoDeath | 1 | 35 | 282 | 62.3% | 13.8% ± 4.0 | 48.7% | 11.7% / 10.5% | 6.2% | 0 / 0 | T?/M? | 64% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
