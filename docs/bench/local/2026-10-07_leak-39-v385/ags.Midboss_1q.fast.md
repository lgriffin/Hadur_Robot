# ags.Midboss 1q.fast (mid) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 68.6% | 80.0% | 57.4% | 28 / 35 | 12.4% | 15.5% | 28 | 0 | 1.25 / 33.0 | 64.7% | +3.9 |
| 2 | 77.0% | 88.6% | 64.8% | 31 / 35 | 12.3% | 8.4% | 26 | 0 | 1.32 / 37.5 | 66.0% | +11.0 |
| 3 | 73.9% | 82.9% | 65.1% | 29 / 35 | 14.7% | 7.9% | 21 | 0 | 1.36 / 24.8 | 73.3% | +0.6 |
| 4 | 81.7% | 97.1% | 67.1% | 34 / 35 | 13.5% | 8.5% | 22 | 0 | 1.23 / 30.0 | 77.4% | +4.3 |
| 5 | 71.9% | 85.7% | 59.1% | 30 / 35 | 13.6% | 8.5% | 26 | 0 | 1.35 / 36.6 | 73.2% | -1.3 |
| 6 | 69.6% | 80.0% | 59.6% | 28 / 35 | 12.9% | 8.8% | 26 | 0 | 1.34 / 34.1 | 71.7% | -2.0 |
| 7 | 76.7% | 88.6% | 64.9% | 31 / 35 | 14.3% | 7.9% | 20 | 0 | 1.28 / 42.8 | 67.0% | +9.7 |
| 8 | 76.5% | 91.4% | 61.9% | 32 / 35 | 13.2% | 8.8% | 22 | 0 | 1.30 / 31.2 | 65.3% | +11.2 |
| 9 | 71.9% | 85.7% | 58.3% | 30 / 35 | 11.6% | 9.3% | 24 | 0 | 1.28 / 46.7 | 77.7% | -5.8 |
| 10 | 74.1% | 91.4% | 58.1% | 32 / 35 | 14.1% | 8.9% | 25 | 0 | 1.29 / 32.8 | 64.7% | +9.4 |
| 11 | 73.5% | 88.6% | 59.2% | 31 / 35 | 13.7% | 8.9% | 18 | 0 | 1.24 / 32.9 | 66.3% | +7.2 |
| 12 | 77.2% | 91.4% | 63.0% | 32 / 35 | 14.7% | 7.5% | 20 | 0 | 1.26 / 31.6 | 75.5% | +1.7 |
| 13 | 66.3% | 80.0% | 54.0% | 28 / 35 | 13.3% | 10.4% | 28 | 0 | 1.30 / 42.3 | 70.9% | -4.6 |
| 14 | 62.4% | 68.6% | 56.9% | 24 / 35 | 13.8% | 9.7% | 22 | 0 | 1.33 / 40.1 | 73.7% | -11.3 |
| 15 | 64.7% | 77.1% | 54.1% | 27 / 35 | 12.7% | 10.2% | 26 | 0 | 1.32 / 33.8 | 75.4% | -10.7 |
| 16 | 71.2% | 85.7% | 57.9% | 30 / 35 | 13.8% | 9.4% | 22 | 0 | 1.34 / 34.2 | 72.1% | -0.9 |

Mean score share 72.3% ± 2.7, baseline 70.9% ± 2.5, paired diff +1.4 ± 3.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 376 over 16 battles (23.5 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | mid | 72.3% ± 2.7 | 85.2% ± 3.7 | 60.1% ± 2.1 | 477 / 560 | 13.4% ± 0.5 | 9.3% ± 1.0 | 376 | 0 | 1.36 / 46.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 16 | 11 | 894 | 0 | 0.67 | 3 | 3 | 0 |

11 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 32614 | 104 | 32538 | 32534 (99.8%) | 80 (0.2%) | 4 (0.0%) | 1757 | 488 | 303 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.Midboss 1q.fast | 33016 | 3093 (9.4%) | 28474 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 650 | 409 | 631 | 789 | 42.7 / 28.5 | 1972 | 9726 | 1839 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 9.3% | 376 | 22378 | 3 | 57.6 | 3086 / 3093 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | ags.Midboss | 1 | 35 | 284 | 10.2% | 7.6% ± 1.3 | 11.9% | 23.9% / 23.3% | 8.2% | 0 / 0 | T3/M1 | 70% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
