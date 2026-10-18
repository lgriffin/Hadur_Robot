# fullsail.TimbotNoPrediction 1.0 (rank1014-band6) vs hadur2.Hadur 3.13hjrg

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 92.5% | 100.0% | 85.2% | 35 / 35 | 26.6% | 4.8% | 17 | 0 | 0.84 / 9.0 | 87.0% | +5.5 |
| 2 | 87.4% | 97.1% | 78.2% | 34 / 35 | 22.6% | 5.6% | 18 | 0 | 0.93 / 283.2 | 90.2% | -2.8 |
| 3 | 89.1% | 100.0% | 78.3% | 35 / 35 | 21.3% | 5.4% | 19 | 0 | 0.84 / 42.2 | 88.7% | +0.4 |
| 4 | 85.9% | 97.1% | 76.2% | 34 / 35 | 26.8% | 7.7% | 12 | 0 | 0.90 / 447.6 | 88.8% | -3.0 |
| 5 | 86.4% | 97.1% | 76.4% | 34 / 35 | 23.2% | 6.3% | 106 | 0 | 0.92 / 411.7 | 88.9% | -2.5 |
| 6 | 90.4% | 100.0% | 81.3% | 35 / 35 | 25.3% | 5.9% | 17 | 0 | 0.86 / 304.7 | 90.3% | +0.1 |
| 7 | 91.6% | 100.0% | 83.5% | 35 / 35 | 25.9% | 5.6% | 12 | 0 | 0.91 / 30.2 | 82.2% | +9.3 |
| 8 | 87.1% | 100.0% | 75.9% | 35 / 35 | 25.5% | 8.0% | 20 | 0 | 0.93 / 493.4 | 87.3% | -0.1 |

Mean score share 88.8% ± 2.1, baseline 87.9% ± 2.2, paired diff +0.9 ± 3.7.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 221 over 8 battles (27.6 per battle, most in one battle 106). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| fullsail.TimbotNoPrediction 1.0 | rank1014-band6 | 88.8% ± 2.1 | 98.9% ± 1.2 | 79.4% ± 3.0 | 277 / 280 | 24.7% ± 1.7 | 6.2% ± 0.9 | 221 | 0 | 0.93 / 493.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| fullsail.TimbotNoPrediction 1.0 | 8 | 588 | 3.2% | 95.3% | 0.0% | 1.5% | 440 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| fullsail.TimbotNoPrediction 1.0 | 8 | 6 | 0 | 1 | 0.79 | 1 | 1 | 0 |

6 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| fullsail.TimbotNoPrediction 1.0 | 4623 | 30 | 4617 | 4612 (99.8%) | 11 (0.2%) | 5 (0.1%) | 267 | 83 | 48 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| fullsail.TimbotNoPrediction 1.0 | 4896 | 305 (6.2%) | 1017 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| fullsail.TimbotNoPrediction 1.0 | 650 | 391 | 400 | 290 | 61.3 / 16.0 | 3139 | 3616 | 1593 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| fullsail.TimbotNoPrediction 1.0 | 6.2% | 221 | 1058 | 3 | 16.3 | 305 / 305 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| fullsail.TimbotNoPrediction 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| fullsail.TimbotNoPrediction 1.0 | fullsail.TimbotNoPrediction | 1 | 35 | 340 | 9.2% | 8.8% ± 2.4 | 19.9% | 39.4% / 38.0% | 10.0% | 0 / 0 | T3/M? | 86% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
