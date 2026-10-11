# ags.Midboss 1q.fast (mid) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1000000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 75.1% | 88.6% | 63.2% | 31 / 35 | 14.1% | 8.4% | 26 | 0 | 1.30 / 34.4 | 74.2% | +1.0 |
| 2 | 74.7% | 88.6% | 62.2% | 31 / 35 | 14.2% | 8.4% | 24 | 0 | 1.28 / 32.3 | 74.7% | +0.0 |
| 3 | 71.3% | 82.9% | 60.3% | 29 / 35 | 13.0% | 8.0% | 30 | 0 | 1.35 / 30.9 | 66.0% | +5.4 |
| 4 | 74.0% | 85.7% | 62.9% | 30 / 35 | 13.5% | 8.7% | 21 | 0 | 1.28 / 31.9 | 69.6% | +4.4 |
| 5 | 71.0% | 85.7% | 57.3% | 30 / 35 | 13.3% | 8.8% | 27 | 0 | 1.34 / 36.6 | 72.5% | -1.5 |
| 6 | 72.0% | 88.6% | 57.1% | 31 / 35 | 13.6% | 9.4% | 30 | 0 | 1.30 / 41.7 | 76.5% | -4.4 |
| 7 | 81.9% | 97.1% | 66.4% | 34 / 35 | 13.5% | 7.3% | 27 | 0 | 1.25 / 32.9 | 70.9% | +11.0 |
| 8 | 73.9% | 88.6% | 60.1% | 31 / 35 | 12.7% | 8.7% | 25 | 0 | 1.33 / 37.3 | 69.1% | +4.8 |
| 9 | 73.3% | 85.7% | 61.5% | 30 / 35 | 13.6% | 7.9% | 21 | 0 | 1.27 / 39.1 | 72.8% | +0.5 |
| 10 | 70.3% | 82.9% | 58.3% | 29 / 35 | 13.0% | 8.1% | 31 | 0 | 1.27 / 29.7 | 71.9% | -1.6 |
| 11 | 74.3% | 88.6% | 60.8% | 31 / 35 | 12.7% | 9.3% | 23 | 0 | 1.36 / 43.1 | 70.9% | +3.4 |
| 12 | 67.0% | 77.1% | 58.0% | 27 / 35 | 12.9% | 9.0% | 16 | 0 | 1.30 / 37.6 | 64.1% | +2.9 |
| 13 | 68.9% | 80.0% | 59.1% | 28 / 35 | 14.8% | 9.3% | 18 | 0 | 1.31 / 26.3 | 77.6% | -8.7 |
| 14 | 70.1% | 82.9% | 58.6% | 29 / 35 | 13.1% | 8.3% | 22 | 0 | 1.29 / 32.6 | 64.1% | +6.0 |
| 15 | 70.4% | 82.9% | 59.0% | 29 / 35 | 12.8% | 9.6% | 25 | 0 | 1.33 / 32.0 | 72.1% | -1.7 |
| 16 | 70.4% | 82.9% | 59.0% | 29 / 35 | 15.0% | 8.7% | 19 | 0 | 1.29 / 28.6 | 68.6% | +1.8 |

Mean score share 72.4% ± 1.8, baseline 71.0% ± 2.1, paired diff +1.4 ± 2.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1000000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 385 over 16 battles (24.1 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | mid | 72.4% ± 1.8 | 85.5% ± 2.5 | 60.2% ± 1.3 | 479 / 560 | 13.5% ± 0.4 | 8.6% ± 0.3 | 385 | 0 | 1.36 / 43.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 16 | 1382 | 18.3% | 73.7% | 0.0% | 8.0% | 907 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 16 | 14 | 0 | 0 | 0.69 | 2 | 2 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 31024 | 99 | 31024 | 31020 (100.0%) | 4 (0.0%) | 4 (0.0%) | 1595 | 450 | 279 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.Midboss 1q.fast | 31532 | 3007 (9.5%) | 25529 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 650 | 410 | 650 | 757 | 44.0 / 29.1 | 2175 | 9099 | 1649 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 8.6% | 385 | 7939 | 3 | 55.2 | 3001 / 3007 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ags.Midboss 1q.fast | ags.Midboss | 1 | 35 | 284 | 9.8% | 7.2% ± 1.2 | 13.3% | 25.4% / 24.2% | 7.9% | 0 / 0 | T3/M0 | 70% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
