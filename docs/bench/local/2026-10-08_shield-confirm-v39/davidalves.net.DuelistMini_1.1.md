# davidalves.net.DuelistMini 1.1 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 86.3% | 100.0% | 53.9% | 35 / 35 | 9.5% | 2.5% | 11 | 0 | 0.63 / 14.5 | 81.6% | +4.7 |
| 2 | 79.5% | 94.3% | 62.4% | 33 / 35 | 21.6% | 10.3% | 14 | 0 | 0.77 / 13.7 | 81.3% | -1.8 |
| 3 | 96.5% | 100.0% | 80.1% | 35 / 35 | 10.2% | 0.6% | 10 | 0 | 0.39 / 11.9 | 83.8% | +12.7 |
| 4 | 77.8% | 94.3% | 53.2% | 33 / 35 | 10.7% | 3.9% | 15 | 0 | 0.79 / 13.6 | 80.9% | -3.1 |
| 5 | 98.7% | 100.0% | 86.3% | 35 / 35 | 7.5% | 0.2% | 11 | 0 | 0.44 / 15.0 | 81.5% | +17.2 |
| 6 | 80.2% | 94.3% | 61.8% | 33 / 35 | 15.2% | 4.6% | 13 | 0 | 0.76 / 13.6 | 83.3% | -3.1 |
| 7 | 81.2% | 97.1% | 60.1% | 34 / 35 | 26.3% | 4.1% | 12 | 0 | 0.81 / 12.6 | 81.8% | -0.7 |
| 8 | 85.6% | 100.0% | 61.0% | 35 / 35 | 29.4% | 2.8% | 12 | 0 | 0.65 / 16.2 | 85.5% | +0.1 |
| 9 | 95.2% | 100.0% | 68.4% | 35 / 35 | 7.2% | 0.7% | 12 | 0 | 0.46 / 16.7 | 87.8% | +7.4 |
| 10 | 93.4% | 100.0% | 73.9% | 35 / 35 | 26.7% | 1.3% | 12 | 0 | 0.49 / 17.3 | 84.1% | +9.3 |
| 11 | 96.1% | 100.0% | 69.7% | 35 / 35 | 6.7% | 0.6% | 11 | 0 | 0.43 / 13.0 | 84.9% | +11.2 |
| 12 | 95.5% | 100.0% | 64.2% | 35 / 35 | 9.2% | 0.8% | 11 | 0 | 0.42 / 74.1 | 79.8% | +15.7 |
| 13 | 96.8% | 100.0% | 77.8% | 35 / 35 | 9.8% | 0.4% | 12 | 0 | 0.45 / 12.0 | 83.0% | +13.8 |
| 14 | 78.5% | 91.4% | 62.0% | 32 / 35 | 13.3% | 4.3% | 18 | 0 | 0.77 / 14.9 | 77.0% | +1.5 |
| 15 | 98.6% | 100.0% | 84.2% | 35 / 35 | 7.8% | 0.1% | 13 | 0 | 0.44 / 14.9 | 85.0% | +13.6 |
| 16 | 98.9% | 100.0% | 90.2% | 35 / 35 | 8.4% | 0.2% | 11 | 0 | 0.43 / 15.4 | 82.6% | +16.2 |

Mean score share 89.9% ± 4.4, baseline 82.8% ± 1.4, paired diff +7.2 ± 4.0.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 198 over 16 battles (12.4 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| davidalves.net.DuelistMini 1.1 | shield-confirm | 89.9% ± 4.4 | 98.2% ± 1.6 | 69.3% ± 6.1 | 550 / 560 | 13.7% ± 4.1 | 2.3% ± 1.4 | 198 | 0 | 0.81 / 74.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| davidalves.net.DuelistMini 1.1 | 16 | 370 | 8.5% | 88.1% | 0.0% | 3.4% | 775 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| davidalves.net.DuelistMini 1.1 | 16 | 15 | 596 | 0 | 0.35 | 0 | 0 | 0 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| davidalves.net.DuelistMini 1.1 | 18694 | 6 | 18662 | 18659 (99.8%) | 35 (0.2%) | 3 (0.0%) | 456 | 81 | 61 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| davidalves.net.DuelistMini 1.1 | 9997 | 12993 (130.0%) | 2004 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| davidalves.net.DuelistMini 1.1 | 650 | 521 | 598 | 625 | 16.2 / 9.3 | 543 | 2882 | 315 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| davidalves.net.DuelistMini 1.1 | 2.3% | 198 | 83 | 3 | 8.8 | 395 / 12993 (3%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| davidalves.net.DuelistMini 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| davidalves.net.DuelistMini 1.1 | davidalves.net.DuelistMini | 1 | 35 | 336 | 0.3% | 6.5% ± 7.8 | 8.6% | 26.5% / 25.5% | 20.0% | 0 / 0 | T?/M? | 98% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
