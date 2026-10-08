# theo.Tungsten 1.0a (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 88.8% | 97.1% | 61.2% | 34 / 35 | 14.8% | 1.8% | 10 | 0 | 0.47 / 15.0 | 74.2% | +14.7 |
| 2 | 92.6% | 100.0% | 67.9% | 35 / 35 | 23.7% | 1.6% | 12 | 0 | 0.46 / 14.4 | 80.1% | +12.4 |
| 3 | 83.5% | 94.3% | 57.2% | 33 / 35 | 12.1% | 2.8% | 11 | 0 | 0.56 / 15.7 | 72.2% | +11.3 |
| 4 | 84.1% | 94.3% | 59.7% | 33 / 35 | 18.4% | 2.4% | 12 | 0 | 0.49 / 13.9 | 74.0% | +10.2 |
| 5 | 86.9% | 100.0% | 54.9% | 35 / 35 | 22.3% | 2.4% | 13 | 0 | 0.49 / 17.8 | 75.0% | +11.9 |
| 6 | 93.4% | 100.0% | 68.4% | 35 / 35 | 17.6% | 1.3% | 10 | 0 | 0.44 / 13.6 | 69.4% | +23.9 |
| 7 | 85.3% | 94.3% | 61.1% | 33 / 35 | 12.1% | 2.1% | 10 | 0 | 0.46 / 14.5 | 68.9% | +16.5 |
| 8 | 70.1% | 88.6% | 49.8% | 31 / 35 | 12.5% | 6.3% | 15 | 0 | 0.96 / 14.8 | 73.6% | -3.5 |
| 9 | 80.6% | 91.4% | 54.0% | 32 / 35 | 14.9% | 2.4% | 9 | 0 | 0.52 / 14.8 | 79.0% | +1.6 |
| 10 | 89.8% | 97.1% | 67.0% | 34 / 35 | 11.7% | 1.6% | 11 | 0 | 0.56 / 13.7 | 74.1% | +15.8 |
| 11 | 90.0% | 100.0% | 54.6% | 35 / 35 | 17.6% | 1.6% | 10 | 0 | 0.47 / 15.3 | 77.0% | +13.0 |
| 12 | 91.8% | 100.0% | 69.4% | 35 / 35 | 13.5% | 2.0% | 11 | 0 | 0.53 / 15.5 | 76.4% | +15.4 |
| 13 | 91.3% | 100.0% | 62.5% | 35 / 35 | 18.4% | 1.7% | 12 | 0 | 0.48 / 14.9 | 70.8% | +20.5 |
| 14 | 89.2% | 97.1% | 67.1% | 34 / 35 | 15.1% | 1.8% | 4 | 0 | 0.52 / 14.8 | 79.0% | +10.2 |
| 15 | 89.7% | 97.1% | 63.0% | 34 / 35 | 12.2% | 1.4% | 11 | 0 | 0.50 / 17.7 | 71.1% | +18.5 |
| 16 | 86.6% | 97.1% | 59.0% | 34 / 35 | 17.5% | 2.5% | 10 | 0 | 0.52 / 16.1 | 77.5% | +9.1 |

Mean score share 87.1% ± 3.1, baseline 74.5% ± 1.8, paired diff +12.6 ± 3.6.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 171 over 16 battles (10.7 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| theo.Tungsten 1.0a | shield-confirm | 87.1% ± 3.1 | 96.8% ± 1.8 | 61.1% ± 3.2 | 542 / 560 | 15.9% ± 2.0 | 2.2% ± 0.6 | 171 | 0 | 0.96 / 17.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| theo.Tungsten 1.0a | 16 | 409 | 13.8% | 81.2% | 0.0% | 5.0% | 908 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| theo.Tungsten 1.0a | 16 | 14 | 0 | 0 | 0.31 | 2 | 1 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| theo.Tungsten 1.0a | 25619 | 3 | 25629 | 25619 (100.0%) | 0 (0.0%) | 10 (0.0%) | 194 | 108 | 74 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| theo.Tungsten 1.0a | 6822 | 22603 (331.3%) | 2909 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| theo.Tungsten 1.0a | 650 | 418 | 650 | 757 | 14.0 / 9.5 | 159 | 1611 | 61 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| theo.Tungsten 1.0a | 2.2% | 171 | 80 | 3 | 4.9 | 322 / 22603 (1%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| theo.Tungsten 1.0a | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| theo.Tungsten 1.0a | theo.Tungsten | 1 | 35 | 286 | 2.5% | 16.3% ± 6.7 | 12.4% | 24.4% / 27.4% | 2.3% | 0 / 0 | T?/M? | 86% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
