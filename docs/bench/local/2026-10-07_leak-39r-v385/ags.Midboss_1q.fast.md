# ags.Midboss 1q.fast (mid) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 68.6% | 82.9% | 55.4% | 29 / 35 | 13.4% | 9.4% | 32 | 0 | 1.32 / 32.6 | 69.5% | -0.9 |
| 2 | 72.0% | 82.9% | 62.2% | 29 / 35 | 13.3% | 9.3% | 18 | 0 | 1.34 / 37.4 | 65.0% | +7.1 |
| 3 | 68.9% | 80.0% | 58.8% | 28 / 35 | 14.3% | 8.8% | 24 | 0 | 1.34 / 28.0 | 66.5% | +2.4 |
| 4 | 77.9% | 88.6% | 67.5% | 31 / 35 | 14.1% | 7.8% | 21 | 0 | 1.30 / 33.8 | 73.4% | +4.5 |
| 5 | 68.1% | 80.0% | 56.9% | 28 / 35 | 13.3% | 8.2% | 20 | 0 | 1.32 / 29.5 | 76.2% | -8.2 |
| 6 | 71.2% | 82.9% | 60.0% | 29 / 35 | 13.6% | 8.4% | 25 | 0 | 1.31 / 38.6 | 78.0% | -6.8 |
| 7 | 75.9% | 88.6% | 64.0% | 31 / 35 | 15.1% | 7.8% | 24 | 0 | 1.32 / 26.9 | 71.7% | +4.2 |
| 8 | 73.1% | 85.7% | 60.7% | 30 / 35 | 13.5% | 8.1% | 24 | 0 | 1.27 / 28.3 | 64.0% | +9.1 |
| 9 | 75.1% | 88.6% | 62.2% | 31 / 35 | 13.6% | 9.4% | 26 | 0 | 1.30 / 36.1 | 82.4% | -7.3 |
| 10 | 60.7% | 71.4% | 52.0% | 25 / 35 | 14.3% | 10.1% | 20 | 0 | 1.34 / 36.3 | 74.9% | -14.2 |
| 11 | 64.0% | 74.3% | 54.3% | 26 / 35 | 13.2% | 9.2% | 30 | 0 | 1.35 / 36.2 | 69.9% | -5.9 |
| 12 | 68.5% | 82.9% | 55.5% | 29 / 35 | 13.2% | 8.8% | 31 | 0 | 1.30 / 62.3 | 72.3% | -3.8 |
| 13 | 76.4% | 91.4% | 62.8% | 32 / 35 | 16.0% | 9.2% | 21 | 0 | 1.29 / 33.9 | 72.4% | +4.1 |
| 14 | 69.1% | 82.9% | 56.2% | 29 / 35 | 12.7% | 9.4% | 26 | 0 | 1.31 / 41.8 | 75.1% | -6.0 |
| 15 | 65.0% | 80.0% | 52.4% | 28 / 35 | 13.9% | 9.6% | 19 | 0 | 1.33 / 42.8 | 73.4% | -8.4 |
| 16 | 60.4% | 68.6% | 53.5% | 24 / 35 | 15.2% | 9.5% | 18 | 0 | 1.29 / 32.7 | 69.8% | -9.3 |

Mean score share 69.7% ± 2.8, baseline 72.2% ± 2.6, paired diff -2.5 ± 3.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 379 over 16 battles (23.7 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | mid | 69.7% ± 2.8 | 82.0% ± 3.4 | 58.4% ± 2.4 | 459 / 560 | 13.9% ± 0.5 | 8.9% ± 0.4 | 379 | 0 | 1.35 / 62.3 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 16 | 13 | 298 | 0 | 0.68 | 2 | 2 | 0 |

13 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 31734 | 93 | 31709 | 31707 (99.9%) | 27 (0.1%) | 2 (0.0%) | 1892 | 482 | 292 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.Midboss 1q.fast | 32533 | 3040 (9.3%) | 29336 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 650 | 409 | 633 | 774 | 42.6 / 30.4 | 2366 | 9113 | 1972 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 8.9% | 379 | 604 | 3 | 56.3 | 3032 / 3040 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | ags.Midboss | 1 | 35 | 284 | 10.5% | 7.9% ± 1.3 | 13.3% | 25.0% / 24.5% | 8.2% | 0 / 0 | T3/M0 | 60% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
