# rsim.mini.BulletCatcher 0.4 (rank243-band4) vs hadur2.Hadur 3.13hjf5

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 94.3% | 100.0% | 0.8% | 35 / 35 | 0.0% | 3.1% | 16 | 0 | 0.47 / 79.2 | 92.6% | +1.6 |
| 2 | 85.1% | 97.1% | 70.7% | 34 / 35 | 7.0% | 6.3% | 15 | 0 | 0.55 / 1965.9 | 94.3% | -9.2 |
| 3 | 84.8% | 97.1% | 63.9% | 34 / 35 | 5.6% | 5.8% | 18 | 0 | 0.58 / 16.7 | 81.8% | +3.0 |
| 4 | 96.3% | 100.0% | 0.0% | 35 / 35 | 0.0% | 2.9% | 13 | 0 | 0.48 / 382.7 | 93.4% | +2.9 |
| 5 | 78.6% | 94.3% | 65.3% | 33 / 35 | 13.1% | 8.7% | 41 | 0 | 0.79 / 13.3 | 82.9% | -4.2 |
| 6 | 88.6% | 97.1% | 1.0% | 34 / 35 | 0.0% | 2.6% | 9 | 0 | 0.47 / 470.5 | 97.2% | -8.6 |
| 7 | 96.8% | 100.0% | 0.0% | 35 / 35 | 0.0% | 2.9% | 16 | 0 | 0.46 / 17.7 | 96.2% | +0.6 |
| 8 | 94.9% | 100.0% | 0.9% | 35 / 35 | 0.0% | 2.2% | 16 | 0 | 0.49 / 433.0 | 96.6% | -1.7 |

Mean score share 89.9% ± 5.6, baseline 91.9% ± 5.1, paired diff -2.0 ± 4.1.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 144 over 8 battles (18.0 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rsim.mini.BulletCatcher 0.4 | rank243-band4 | 89.9% ± 5.6 | 98.2% ± 1.8 | 25.3% ± 28.7 | 275 / 280 | 3.2% ± 4.1 | 4.3% ± 2.0 | 144 | 0 | 0.79 / 1965.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| rsim.mini.BulletCatcher 0.4 | 8 | 323 | 9.7% | 68.5% | 16.0% | 5.9% | 1099 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rsim.mini.BulletCatcher 0.4 | 8 | 7 | 0 | 0 | 0.51 | 1 | 1 | 0 |

7 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| rsim.mini.BulletCatcher 0.4 | 19201 | 467 | 19264 | 19182 (99.9%) | 19 (0.1%) | 82 (0.4%) | 1338 | 121 | 68 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| rsim.mini.BulletCatcher 0.4 | 1895 | 17649 (931.3%) | 67 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| rsim.mini.BulletCatcher 0.4 | 650 | 332 | 616 | 952 | 9.1 / 6.3 | 343 | 925 | 89 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| rsim.mini.BulletCatcher 0.4 | 4.3% | 144 | 27 | 3 | 5.3 | 103 / 17649 (1%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| rsim.mini.BulletCatcher 0.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| rsim.mini.BulletCatcher 0.4 | rsim.mini.BulletCatcher | 1 | 35 | 324 | 2.7% | 29.4% ± 15.2 | 7.8% | 17.8% / 14.9% | 19.9% | 0 / 0 | T?/M? | 95% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
