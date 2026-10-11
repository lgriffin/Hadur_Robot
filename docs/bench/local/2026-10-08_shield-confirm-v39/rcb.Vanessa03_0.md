# rcb.Vanessa03 0 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 80.9% | 91.4% | 57.5% | 32 / 35 | 12.5% | 2.6% | 10 | 0 | 0.52 / 26.5 | 79.1% | +1.7 |
| 2 | 89.0% | 94.3% | 68.1% | 33 / 35 | 11.1% | 1.2% | 11 | 0 | 0.44 / 256.8 | 83.3% | +5.7 |
| 3 | 88.6% | 97.1% | 62.9% | 34 / 35 | 19.5% | 2.0% | 9 | 0 | 0.52 / 84.2 | 80.6% | +8.0 |
| 4 | 83.3% | 94.3% | 54.9% | 33 / 35 | 11.7% | 2.8% | 13 | 0 | 0.62 / 12.8 | 81.7% | +1.7 |
| 5 | 97.0% | 100.0% | 73.7% | 35 / 35 | 10.1% | 0.8% | 14 | 0 | 0.44 / 14.4 | 78.4% | +18.6 |
| 6 | 96.5% | 100.0% | 76.4% | 35 / 35 | 14.7% | 0.7% | 10 | 0 | 0.44 / 11.7 | 81.2% | +15.3 |
| 7 | 94.1% | 100.0% | 66.4% | 35 / 35 | 12.4% | 1.1% | 11 | 0 | 0.41 / 99.9 | 78.2% | +16.0 |
| 8 | 79.7% | 88.6% | 51.9% | 31 / 35 | 13.5% | 1.8% | 11 | 0 | 0.46 / 11.5 | 77.8% | +1.9 |
| 9 | 77.8% | 88.6% | 50.7% | 31 / 35 | 18.9% | 2.4% | 12 | 0 | 0.49 / 16.3 | 79.2% | -1.4 |
| 10 | 86.1% | 94.3% | 53.4% | 33 / 35 | 10.7% | 1.8% | 11 | 0 | 0.49 / 13.9 | 69.9% | +16.2 |
| 11 | 85.7% | 97.1% | 60.6% | 34 / 35 | 15.7% | 2.4% | 9 | 0 | 0.57 / 12.5 | 80.1% | +5.6 |
| 12 | 79.0% | 88.6% | 46.3% | 31 / 35 | 11.9% | 1.5% | 12 | 0 | 0.47 / 12.9 | 77.6% | +1.4 |
| 13 | 80.1% | 91.4% | 48.2% | 32 / 35 | 13.1% | 2.9% | 13 | 0 | 0.47 / 12.5 | 79.2% | +1.0 |
| 14 | 93.6% | 100.0% | 65.9% | 35 / 35 | 9.4% | 1.6% | 12 | 0 | 0.49 / 24.4 | 78.8% | +14.8 |
| 15 | 89.9% | 94.3% | 69.6% | 33 / 35 | 12.4% | 1.1% | 12 | 0 | 0.42 / 8.9 | 70.1% | +19.8 |
| 16 | 85.2% | 94.3% | 54.1% | 33 / 35 | 14.5% | 1.7% | 11 | 0 | 0.50 / 10.7 | 84.4% | +0.8 |

Mean score share 86.7% ± 3.4, baseline 78.7% ± 2.1, paired diff +7.9 ± 4.0.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 181 over 16 battles (11.3 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rcb.Vanessa03 0 | shield-confirm | 86.7% ± 3.4 | 94.6% ± 2.2 | 60.0% ± 4.9 | 530 / 560 | 13.3% ± 1.5 | 1.8% ± 0.4 | 181 | 0 | 0.62 / 256.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| rcb.Vanessa03 0 | 16 | 379 | 24.7% | 64.8% | 0.0% | 10.4% | 734 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rcb.Vanessa03 0 | 16 | 16 | 0 | 0 | 0.32 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| rcb.Vanessa03 0 | 18204 | 9 | 18204 | 18204 (100.0%) | 0 (0.0%) | 0 (0.0%) | 135 | 49 | 85 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| rcb.Vanessa03 0 | 4912 | 16292 (331.7%) | 211 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| rcb.Vanessa03 0 | 650 | 347 | 634 | 584 | 9.9 / 7.0 | 177 | 1594 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| rcb.Vanessa03 0 | 1.8% | 181 | 69 | 3 | 2.8 | 99 / 16292 (1%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| rcb.Vanessa03 0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| rcb.Vanessa03 0 | rcb.Vanessa03 | 1 | 35 | 280 | 1.9% | 19.3% ± 8.7 | 10.8% | 23.2% / 22.2% | 15.4% | 0 / 0 | T?/M? | 86% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
