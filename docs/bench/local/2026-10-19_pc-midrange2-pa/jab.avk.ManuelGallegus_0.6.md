# jab.avk.ManuelGallegus 0.6 (rank187-band3) vs hadur2.Hadur 3.13hjswpa

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 78.9% | 94.3% | 63.0% | 33 / 35 | 12.9% | 6.1% | 17 | 0 | 0.87 / 328.3 | 81.5% | -2.6 |
| 2 | 77.9% | 91.4% | 63.5% | 32 / 35 | 12.8% | 6.0% | 17 | 0 | 1.00 / 742.2 | 78.3% | -0.4 |
| 3 | 83.9% | 100.0% | 66.4% | 35 / 35 | 13.0% | 5.8% | 41 | 0 | 0.88 / 22.4 | 74.1% | +9.8 |
| 4 | 74.7% | 91.4% | 58.4% | 32 / 35 | 11.4% | 6.5% | 16 | 0 | 0.94 / 658.0 | 81.1% | -6.3 |
| 5 | 78.2% | 94.3% | 60.5% | 33 / 35 | 11.7% | 6.0% | 19 | 0 | 0.95 / 23.7 | 79.2% | -0.9 |
| 6 | 79.4% | 94.3% | 61.6% | 33 / 35 | 10.4% | 5.1% | 14 | 0 | 0.90 / 911.7 | 72.9% | +6.5 |
| 7 | 72.4% | 82.9% | 61.7% | 29 / 35 | 13.2% | 6.1% | 18 | 0 | 0.95 / 11.4 | 80.9% | -8.5 |
| 8 | 73.7% | 85.7% | 61.2% | 30 / 35 | 12.5% | 6.1% | 20 | 0 | 0.95 / 11.1 | 75.7% | -2.0 |

Mean score share 77.4% ± 3.1, baseline 78.0% ± 2.8, paired diff -0.6 ± 5.1.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 162 over 8 battles (20.3 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jab.avk.ManuelGallegus 0.6 | rank187-band3 | 77.4% ± 3.1 | 91.8% ± 4.5 | 62.0% ± 2.0 | 257 / 280 | 12.2% ± 0.8 | 6.0% ± 0.3 | 162 | 0 | 1.00 / 911.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jab.avk.ManuelGallegus 0.6 | 8 | 1043 | 13.8% | 80.7% | 0.0% | 5.5% | 570 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jab.avk.ManuelGallegus 0.6 | 8 | 7 | 0 | 0 | 0.58 | 1 | 1 | 0 |

7 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jab.avk.ManuelGallegus 0.6 | 6797 | 89 | 6797 | 6796 (100.0%) | 1 (0.0%) | 1 (0.0%) | 74 | 81 | 44 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jab.avk.ManuelGallegus 0.6 | 7495 | 530 (7.1%) | 4821 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jab.avk.ManuelGallegus 0.6 | 650 | 406 | 625 | 421 | 39.2 / 24.0 | 359 | 5026 | 2786 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jab.avk.ManuelGallegus 0.6 | 6.0% | 162 | 37 | 3 | 24.1 | 523 / 530 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jab.avk.ManuelGallegus 0.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| jab.avk.ManuelGallegus 0.6 | jab.avk.ManuelGallegus | 1 | 35 | 320 | 7.0% | 6.4% ± 1.8 | 11.9% | 23.3% / 28.6% | 6.2% | 0 / 0 | T2/M? | 73% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
