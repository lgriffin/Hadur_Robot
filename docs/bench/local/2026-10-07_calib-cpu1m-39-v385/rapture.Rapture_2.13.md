# rapture.Rapture 2.13 (weak) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1000000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 98.0% | 100.0% | 96.0% | 35 / 35 | 23.4% | 1.9% | 14 | 0 | 0.68 / 12.0 | 98.1% | -0.1 |
| 2 | 97.4% | 100.0% | 95.0% | 35 / 35 | 22.0% | 3.4% | 10 | 0 | 0.68 / 14.3 | 92.2% | +5.2 |
| 3 | 93.9% | 100.0% | 88.4% | 35 / 35 | 22.6% | 6.1% | 10 | 0 | 0.74 / 16.9 | 98.0% | -4.1 |
| 4 | 95.4% | 97.1% | 93.4% | 34 / 35 | 22.4% | 3.4% | 11 | 0 | 0.69 / 12.1 | 97.6% | -2.2 |
| 5 | 96.7% | 100.0% | 93.6% | 35 / 35 | 20.0% | 3.1% | 16 | 0 | 0.64 / 10.9 | 94.9% | +1.9 |
| 6 | 98.7% | 100.0% | 97.5% | 35 / 35 | 22.8% | 2.3% | 11 | 0 | 0.64 / 12.0 | 97.4% | +1.3 |
| 7 | 98.1% | 100.0% | 96.2% | 35 / 35 | 20.7% | 2.1% | 11 | 0 | 0.63 / 13.1 | 97.0% | +1.0 |
| 8 | 96.4% | 100.0% | 93.0% | 35 / 35 | 25.2% | 5.2% | 7 | 0 | 0.70 / 14.5 | 92.3% | +4.1 |
| 9 | 98.2% | 100.0% | 96.5% | 35 / 35 | 21.6% | 1.8% | 7 | 0 | 0.69 / 13.2 | 95.4% | +2.9 |
| 10 | 92.9% | 94.3% | 91.0% | 33 / 35 | 22.2% | 4.8% | 13 | 0 | 0.73 / 10.5 | 96.7% | -3.7 |
| 11 | 97.4% | 100.0% | 94.8% | 35 / 35 | 19.5% | 2.7% | 11 | 0 | 0.69 / 13.1 | 92.0% | +5.4 |
| 12 | 97.6% | 100.0% | 95.3% | 35 / 35 | 20.3% | 3.0% | 12 | 0 | 0.66 / 18.6 | 97.5% | +0.2 |
| 13 | 98.0% | 100.0% | 96.2% | 35 / 35 | 22.5% | 2.6% | 9 | 0 | 0.64 / 12.0 | 93.0% | +5.0 |
| 14 | 97.6% | 100.0% | 95.3% | 35 / 35 | 22.1% | 2.7% | 13 | 0 | 0.63 / 13.1 | 98.6% | -1.0 |
| 15 | 97.6% | 100.0% | 95.3% | 35 / 35 | 20.3% | 3.3% | 12 | 0 | 0.68 / 11.8 | 97.7% | -0.1 |
| 16 | 98.0% | 100.0% | 96.0% | 35 / 35 | 19.3% | 2.4% | 12 | 0 | 0.65 / 10.5 | 97.2% | +0.8 |

Mean score share 97.0% ± 0.9, baseline 96.0% ± 1.3, paired diff +1.0 ± 1.6.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1000000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 179 over 16 battles (11.2 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | weak | 97.0% ± 0.9 | 99.5% ± 0.8 | 94.6% ± 1.2 | 557 / 560 | 21.7% ± 0.8 | 3.2% ± 0.6 | 179 | 0 | 0.74 / 18.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | 16 | 161 | 5.8% | 92.1% | 0.4% | 1.6% | 557 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | 16 | 15 | 298 | 0 | 0.32 | 0 | 0 | 0 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | 15924 | 42 | 15904 | 15900 (99.8%) | 24 (0.2%) | 4 (0.0%) | 199 | 252 | 42 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| rapture.Rapture 2.13 | 14234 | 864 (6.1%) | 4892 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | 650 | 392 | 400 | 407 | 73.0 / 4.2 | 8717 | 9193 | 1841 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | 3.2% | 179 | 79 | 3 | 28.3 | 863 / 864 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | rapture.Rapture | 1 | 35 | 294 | 2.9% | 2.0% ± 0.9 | 16.7% | 33.9% / 30.7% | 10.4% | 0 / 0 | T1/M? | 98% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
