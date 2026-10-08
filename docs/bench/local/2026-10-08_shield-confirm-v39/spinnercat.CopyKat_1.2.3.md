# spinnercat.CopyKat 1.2.3 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 99.5% | 100.0% | 95.6% | 35 / 35 | 25.9% | 0.5% | 12 | 0 | 0.34 / 13.5 | 79.9% | +19.6 |
| 2 | 89.6% | 97.1% | 70.6% | 34 / 35 | 47.5% | 2.5% | 11 | 0 | 0.54 / 15.8 | 84.7% | +4.8 |
| 3 | 90.6% | 94.3% | 73.9% | 33 / 35 | 29.0% | 1.1% | 3 | 0 | 0.33 / 16.1 | 80.3% | +10.3 |
| 4 | 88.3% | 91.4% | 74.4% | 32 / 35 | 39.6% | 1.1% | 11 | 0 | 0.36 / 15.6 | 74.1% | +14.2 |
| 5 | 89.1% | 94.3% | 68.9% | 33 / 35 | 38.5% | 2.3% | 11 | 0 | 0.35 / 14.5 | 75.7% | +13.4 |
| 6 | 81.3% | 88.6% | 61.9% | 31 / 35 | 37.8% | 2.8% | 8 | 0 | 0.38 / 25.4 | 80.2% | +1.0 |
| 7 | 84.0% | 94.3% | 61.3% | 33 / 35 | 28.5% | 4.0% | 14 | 0 | 0.47 / 15.9 | 84.4% | -0.5 |
| 8 | 93.8% | 97.1% | 82.8% | 34 / 35 | 37.6% | 1.4% | 10 | 0 | 0.42 / 89.1 | 78.7% | +15.1 |
| 9 | 92.9% | 100.0% | 70.8% | 35 / 35 | 29.7% | 1.9% | 10 | 0 | 0.46 / 19.8 | 82.4% | +10.5 |
| 10 | 94.3% | 97.1% | 82.5% | 34 / 35 | 38.0% | 0.9% | 11 | 0 | 0.41 / 12.9 | 85.7% | +8.6 |
| 11 | 90.5% | 94.3% | 75.5% | 33 / 35 | 41.3% | 1.5% | 12 | 0 | 0.48 / 16.1 | 80.2% | +10.3 |
| 12 | 91.4% | 97.1% | 64.6% | 34 / 35 | 24.4% | 1.5% | 11 | 0 | 0.37 / 17.8 | 77.4% | +14.0 |
| 13 | 89.8% | 97.1% | 69.4% | 34 / 35 | 36.8% | 3.0% | 13 | 0 | 0.45 / 17.5 | 86.0% | +3.8 |
| 14 | 94.0% | 97.1% | 80.1% | 34 / 35 | 41.2% | 1.2% | 10 | 0 | 0.41 / 16.1 | 78.9% | +15.1 |
| 15 | 92.2% | 97.1% | 75.6% | 34 / 35 | 39.9% | 2.0% | 13 | 0 | 0.45 / 16.5 | 81.1% | +11.1 |
| 16 | 88.7% | 97.1% | 69.3% | 34 / 35 | 43.0% | 2.7% | 12 | 0 | 0.41 / 14.6 | 79.8% | +8.9 |

Mean score share 90.6% ± 2.2, baseline 80.6% ± 1.8, paired diff +10.0 ± 2.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 172 over 16 battles (10.8 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| spinnercat.CopyKat 1.2.3 | shield-confirm | 90.6% ± 2.2 | 95.9% ± 1.6 | 73.6% ± 4.7 | 537 / 560 | 36.2% ± 3.5 | 1.9% ± 0.5 | 172 | 0 | 0.54 / 89.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| spinnercat.CopyKat 1.2.3 | 16 | 269 | 26.8% | 63.7% | 0.0% | 9.6% | 740 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| spinnercat.CopyKat 1.2.3 | 16 | 15 | 0 | 0 | 0.31 | 1 | 1 | 0 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| spinnercat.CopyKat 1.2.3 | 19912 | 9 | 19918 | 19910 (100.0%) | 2 (0.0%) | 8 (0.0%) | 545 | 83 | 127 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| spinnercat.CopyKat 1.2.3 | 2400 | 18796 (783.2%) | 2 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| spinnercat.CopyKat 1.2.3 | 650 | 354 | 645 | 590 | 12.7 / 4.9 | 106 | 671 | 613 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| spinnercat.CopyKat 1.2.3 | 1.9% | 172 | 90 | 3 | 1.3 | 71 / 18796 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| spinnercat.CopyKat 1.2.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| spinnercat.CopyKat 1.2.3 | spinnercat.CopyKat | 1 | 35 | 308 | 2.3% | 20.9% ± 8.4 | 20.6% | 47.9% / 47.1% | 79.8% | 0 / 0 | T?/M? | 86% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
