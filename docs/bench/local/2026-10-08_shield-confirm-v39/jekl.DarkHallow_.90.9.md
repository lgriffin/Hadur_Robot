# jekl.DarkHallow .90.9 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 95.2% | 100.0% | 70.1% | 35 / 35 | 7.2% | 0.9% | 10 | 0 | 0.48 / 17.3 | 70.4% | +24.8 |
| 2 | 80.9% | 91.4% | 37.1% | 32 / 35 | 7.1% | 1.8% | 12 | 0 | 0.57 / 16.8 | 69.1% | +11.8 |
| 3 | 63.3% | 82.9% | 44.0% | 29 / 35 | 11.4% | 7.3% | 14 | 0 | 1.02 / 15.3 | 73.0% | -9.7 |
| 4 | 87.0% | 97.1% | 49.6% | 34 / 35 | 7.8% | 1.8% | 14 | 0 | 0.59 / 17.2 | 73.3% | +13.7 |
| 5 | 70.9% | 85.7% | 49.3% | 30 / 35 | 12.0% | 3.9% | 6 | 0 | 0.83 / 15.1 | 63.4% | +7.6 |
| 6 | 88.7% | 97.1% | 44.7% | 34 / 35 | 5.8% | 1.6% | 12 | 0 | 0.54 / 19.9 | 66.4% | +22.3 |
| 7 | 82.9% | 91.4% | 47.6% | 32 / 35 | 8.3% | 1.4% | 11 | 0 | 0.53 / 16.2 | 69.8% | +13.1 |
| 8 | 90.6% | 97.1% | 62.8% | 34 / 35 | 5.7% | 1.2% | 7 | 0 | 0.47 / 13.1 | 71.3% | +19.3 |
| 9 | 92.0% | 97.1% | 64.9% | 34 / 35 | 6.4% | 1.0% | 8 | 0 | 0.48 / 16.2 | 76.1% | +15.9 |
| 10 | 91.7% | 100.0% | 50.5% | 35 / 35 | 6.6% | 1.6% | 9 | 0 | 0.57 / 170.6 | 58.5% | +33.2 |
| 11 | 97.7% | 100.0% | 72.9% | 35 / 35 | 8.0% | 1.0% | 9 | 0 | 0.46 / 18.6 | 65.9% | +31.8 |
| 12 | 94.4% | 100.0% | 55.1% | 35 / 35 | 8.6% | 1.0% | 9 | 0 | 0.48 / 18.6 | 64.0% | +30.4 |
| 13 | 95.4% | 100.0% | 66.0% | 35 / 35 | 9.7% | 1.1% | 9 | 0 | 0.48 / 19.1 | 76.1% | +19.3 |
| 14 | 91.6% | 97.1% | 64.5% | 34 / 35 | 7.6% | 1.1% | 10 | 0 | 0.47 / 17.6 | 76.8% | +14.7 |
| 15 | 90.1% | 94.3% | 62.8% | 33 / 35 | 8.3% | 0.7% | 10 | 0 | 0.47 / 14.4 | 60.4% | +29.7 |
| 16 | 81.1% | 91.4% | 40.5% | 32 / 35 | 8.0% | 1.9% | 10 | 0 | 0.56 / 15.3 | 64.9% | +16.2 |

Mean score share 87.1% ± 5.0, baseline 68.7% ± 3.0, paired diff +18.4 ± 5.8.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 160 over 16 battles (10.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jekl.DarkHallow .90.9 | shield-confirm | 87.1% ± 5.0 | 95.2% ± 2.8 | 55.2% ± 6.0 | 533 / 560 | 8.0% ± 0.9 | 1.8% ± 0.9 | 160 | 0 | 1.02 / 170.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jekl.DarkHallow .90.9 | 16 | 397 | 21.2% | 70.7% | 0.0% | 8.1% | 1079 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jekl.DarkHallow .90.9 | 16 | 15 | 0 | 0 | 0.29 | 1 | 1 | 0 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jekl.DarkHallow .90.9 | 28422 | 93 | 29079 | 28421 (100.0%) | 1 (0.0%) | 658 (2.3%) | 977 | 68 | 73 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jekl.DarkHallow .90.9 | 13974 | 24778 (177.3%) | 2001 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jekl.DarkHallow .90.9 | 650 | 455 | 650 | 929 | 8.5 / 8.0 | 102 | 1413 | 379 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jekl.DarkHallow .90.9 | 1.8% | 160 | 85 | 3 | 7.6 | 321 / 24778 (1%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jekl.DarkHallow .90.9 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| jekl.DarkHallow .90.9 | jekl.DarkHallow | 1 | 35 | 296 | 2.2% | 8.8% ± 3.1 | 8.9% | 21.5% / 26.9% | 8.9% | 0 / 0 | T?/M2 | 81% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
