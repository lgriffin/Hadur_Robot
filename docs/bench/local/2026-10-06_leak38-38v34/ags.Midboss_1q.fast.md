# ags.Midboss 1q.fast (mid) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 68.1% | 77.1% | 60.0% | 27 / 35 | 13.5% | 9.3% | 25 | 0 | 1.38 / 42.4 | 75.9% | -7.8 |
| 2 | 72.8% | 88.6% | 58.0% | 31 / 35 | 13.6% | 7.9% | 23 | 0 | 1.37 / 34.3 | 73.0% | -0.2 |
| 3 | 71.0% | 85.7% | 57.7% | 30 / 35 | 13.1% | 9.4% | 21 | 0 | 1.23 / 33.8 | 75.0% | -4.0 |
| 4 | 74.5% | 88.6% | 60.1% | 31 / 35 | 12.7% | 7.8% | 27 | 0 | 1.27 / 39.7 | 70.4% | +4.0 |
| 5 | 70.0% | 77.1% | 63.6% | 27 / 35 | 14.6% | 9.5% | 27 | 0 | 1.36 / 25.3 | 62.5% | +7.5 |
| 6 | 72.5% | 85.7% | 60.0% | 30 / 35 | 14.0% | 8.7% | 25 | 0 | 1.36 / 29.3 | 72.7% | -0.2 |
| 7 | 71.0% | 80.0% | 62.5% | 28 / 35 | 14.7% | 8.5% | 24 | 0 | 1.32 / 38.0 | 73.2% | -2.2 |
| 8 | 76.2% | 88.6% | 64.3% | 31 / 35 | 13.8% | 8.8% | 16 | 0 | 1.24 / 36.1 | 68.4% | +7.8 |
| 9 | 66.9% | 77.1% | 57.6% | 27 / 35 | 13.7% | 8.9% | 18 | 0 | 1.25 / 37.6 | 64.5% | +2.4 |
| 10 | 74.6% | 88.6% | 61.1% | 31 / 35 | 13.6% | 8.7% | 25 | 0 | 1.27 / 35.0 | 73.9% | +0.7 |
| 11 | 71.2% | 82.9% | 60.4% | 29 / 35 | 13.6% | 10.0% | 36 | 0 | 1.35 / 33.1 | 76.4% | -5.2 |
| 12 | 71.4% | 85.7% | 57.7% | 30 / 35 | 13.1% | 9.0% | 25 | 0 | 1.36 / 38.5 | 68.5% | +2.9 |
| 13 | 80.3% | 94.3% | 66.7% | 33 / 35 | 13.9% | 8.0% | 20 | 0 | 1.29 / 42.8 | 67.5% | +12.8 |
| 14 | 68.4% | 82.9% | 55.4% | 29 / 35 | 14.6% | 9.2% | 26 | 0 | 1.31 / 45.3 | 74.3% | -5.9 |
| 15 | 69.0% | 82.9% | 55.4% | 29 / 35 | 12.4% | 8.6% | 23 | 0 | 1.34 / 43.7 | 77.2% | -8.2 |
| 16 | 70.5% | 85.7% | 56.6% | 30 / 35 | 12.7% | 9.8% | 23 | 0 | 1.34 / 30.7 | 75.6% | -5.1 |

Mean score share 71.8% ± 1.8, baseline 71.8% ± 2.3, paired diff -0.0 ± 3.2.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 384 over 16 battles (24.0 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | mid | 71.8% ± 1.8 | 84.5% ± 2.6 | 59.8% ± 1.7 | 473 / 560 | 13.6% ± 0.4 | 8.9% ± 0.3 | 384 | 0 | 1.38 / 45.3 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 16 | 12 | 596 | 0 | 0.69 | 2 | 2 | 0 |

12 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 31918 | 89 | 31866 | 31861 (99.8%) | 57 (0.2%) | 5 (0.0%) | 1805 | 500 | 266 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.Midboss 1q.fast | 32561 | 3127 (9.6%) | 29539 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 650 | 409 | 639 | 778 | 43.3 / 29.1 | 2154 | 10386 | 1682 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 8.9% | 384 | 30915 | 3 | 56.6 | 3114 / 3127 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | ags.Midboss | 1 | 35 | 284 | 10.3% | 7.2% ± 1.2 | 12.2% | 22.6% / 22.4% | 9.5% | 0 / 0 | T3/M1 | 70% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
