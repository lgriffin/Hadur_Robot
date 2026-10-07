# sadoner.killer 0.2 (weak) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1000000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 86.4% | 94.3% | 78.3% | 33 / 35 | 20.0% | 5.7% | 14 | 0 | 0.70 / 11.6 | 87.8% | -1.4 |
| 2 | 88.3% | 97.1% | 79.8% | 34 / 35 | 21.1% | 7.5% | 10 | 0 | 0.66 / 11.5 | 82.1% | +6.2 |
| 3 | 81.0% | 91.4% | 71.3% | 32 / 35 | 19.8% | 7.8% | 10 | 0 | 0.76 / 12.8 | 84.1% | -3.2 |
| 4 | 89.7% | 97.1% | 82.5% | 34 / 35 | 22.2% | 6.4% | 11 | 0 | 0.66 / 10.5 | 87.8% | +1.9 |
| 5 | 86.8% | 97.1% | 77.1% | 34 / 35 | 22.6% | 7.3% | 10 | 0 | 0.61 / 14.1 | 88.1% | -1.3 |
| 6 | 87.8% | 100.0% | 77.0% | 35 / 35 | 22.7% | 7.8% | 11 | 0 | 0.68 / 11.0 | 89.4% | -1.6 |
| 7 | 87.1% | 97.1% | 78.0% | 34 / 35 | 22.9% | 8.7% | 10 | 0 | 0.70 / 12.9 | 86.0% | +1.1 |
| 8 | 76.4% | 85.7% | 68.5% | 30 / 35 | 20.3% | 10.1% | 10 | 0 | 0.78 / 17.0 | 84.0% | -7.6 |
| 9 | 82.6% | 91.4% | 74.3% | 32 / 35 | 20.6% | 7.6% | 10 | 0 | 0.71 / 16.4 | 75.7% | +6.9 |
| 10 | 85.2% | 94.3% | 76.8% | 33 / 35 | 21.4% | 6.9% | 12 | 0 | 0.68 / 10.4 | 87.8% | -2.6 |
| 11 | 91.7% | 100.0% | 83.2% | 35 / 35 | 22.7% | 6.0% | 10 | 0 | 0.62 / 11.2 | 84.8% | +6.9 |
| 12 | 86.5% | 100.0% | 74.8% | 35 / 35 | 21.2% | 9.2% | 9 | 0 | 0.68 / 11.0 | 81.9% | +4.6 |
| 13 | 82.5% | 91.4% | 74.8% | 32 / 35 | 20.9% | 8.5% | 9 | 0 | 0.75 / 9.4 | 89.6% | -7.0 |
| 14 | 90.5% | 97.1% | 83.4% | 34 / 35 | 21.2% | 4.6% | 13 | 0 | 0.62 / 17.4 | 87.5% | +3.0 |
| 15 | 92.4% | 100.0% | 84.0% | 35 / 35 | 18.9% | 5.1% | 12 | 0 | 0.65 / 10.3 | 87.4% | +5.0 |
| 16 | 81.9% | 91.4% | 72.7% | 32 / 35 | 18.6% | 7.2% | 8 | 0 | 0.68 / 10.7 | 85.8% | -3.9 |

Mean score share 86.1% ± 2.3, baseline 85.6% ± 1.9, paired diff +0.4 ± 2.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1000000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 169 over 16 battles (10.6 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | weak | 86.1% ± 2.3 | 95.4% ± 2.2 | 77.3% ± 2.4 | 534 / 560 | 21.1% ± 0.7 | 7.3% ± 0.8 | 169 | 0 | 0.78 / 17.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 16 | 732 | 11.1% | 84.2% | 0.1% | 4.6% | 488 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 16 | 15 | 0 | 0 | 0.30 | 1 | 1 | 0 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 11637 | 39 | 11637 | 11635 (100.0%) | 2 (0.0%) | 2 (0.0%) | 158 | 189 | 41 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sadoner.killer 0.2 | 11580 | 878 (7.6%) | 3348 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 650 | 290 | 431 | 337 | 59.1 / 17.6 | 6401 | 10116 | 89 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 7.3% | 169 | 151 | 3 | 20.7 | 878 / 878 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | sadoner.killer | 1 | 35 | 288 | 8.6% | 5.8% ± 1.7 | 16.4% | 22.5% / 22.6% | 5.0% | 0 / 0 | T2/M1 | 80% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
