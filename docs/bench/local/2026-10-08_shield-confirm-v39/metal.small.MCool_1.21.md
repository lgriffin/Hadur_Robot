# metal.small.MCool 1.21 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 97.4% | 100.0% | 71.1% | 35 / 35 | 10.0% | 0.4% | 10 | 0 | 0.43 / 12.3 | 92.5% | +4.8 |
| 2 | 97.3% | 100.0% | 75.6% | 35 / 35 | 14.9% | 0.3% | 13 | 0 | 0.46 / 14.1 | 90.1% | +7.3 |
| 3 | 91.4% | 97.1% | 62.8% | 34 / 35 | 12.5% | 1.0% | 11 | 0 | 0.49 / 69.9 | 91.6% | -0.2 |
| 4 | 95.4% | 100.0% | 72.7% | 35 / 35 | 10.4% | 1.0% | 12 | 0 | 0.53 / 67.9 | 89.2% | +6.2 |
| 5 | 95.8% | 100.0% | 68.4% | 35 / 35 | 11.4% | 1.3% | 12 | 0 | 0.46 / 52.0 | 93.5% | +2.4 |
| 6 | 96.3% | 100.0% | 67.3% | 35 / 35 | 10.5% | 0.5% | 13 | 0 | 0.47 / 178.5 | 90.8% | +5.5 |
| 7 | 95.1% | 100.0% | 70.4% | 35 / 35 | 10.7% | 0.8% | 13 | 0 | 0.54 / 29.5 | 90.5% | +4.6 |
| 8 | 93.2% | 97.1% | 73.3% | 34 / 35 | 12.2% | 0.5% | 14 | 0 | 0.56 / 14.3 | 91.3% | +1.9 |
| 9 | 94.9% | 100.0% | 63.3% | 35 / 35 | 9.8% | 0.7% | 10 | 0 | 0.51 / 16.6 | 90.3% | +4.6 |
| 10 | 96.2% | 100.0% | 70.8% | 35 / 35 | 8.0% | 0.8% | 13 | 0 | 0.48 / 15.0 | 89.5% | +6.8 |
| 11 | 96.5% | 100.0% | 71.0% | 35 / 35 | 9.1% | 0.7% | 12 | 0 | 0.47 / 14.5 | 89.7% | +6.8 |
| 12 | 97.3% | 100.0% | 79.3% | 35 / 35 | 14.1% | 0.5% | 12 | 0 | 0.43 / 14.0 | 88.7% | +8.6 |
| 13 | 92.7% | 97.1% | 60.8% | 34 / 35 | 5.9% | 0.7% | 11 | 0 | 0.48 / 14.8 | 92.7% | +0.1 |
| 14 | 96.6% | 100.0% | 65.1% | 35 / 35 | 8.7% | 0.5% | 11 | 0 | 0.43 / 13.8 | 91.5% | +5.1 |
| 15 | 96.9% | 100.0% | 72.7% | 35 / 35 | 11.3% | 0.5% | 9 | 0 | 0.51 / 10.5 | 89.8% | +7.1 |
| 16 | 97.8% | 100.0% | 79.6% | 35 / 35 | 10.2% | 0.4% | 14 | 0 | 0.47 / 71.3 | 87.5% | +10.3 |

Mean score share 95.7% ± 1.0, baseline 90.6% ± 0.8, paired diff +5.1 ± 1.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 190 over 16 battles (11.9 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| metal.small.MCool 1.21 | shield-confirm | 95.7% ± 1.0 | 99.5% ± 0.6 | 70.3% ± 2.9 | 557 / 560 | 10.6% ± 1.2 | 0.7% ± 0.1 | 190 | 0 | 0.56 / 178.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| metal.small.MCool 1.21 | 16 | 107 | 8.8% | 88.0% | 0.0% | 3.2% | 764 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| metal.small.MCool 1.21 | 16 | 16 | 0 | 0 | 0.34 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| metal.small.MCool 1.21 | 19990 | 15 | 19991 | 19990 (100.0%) | 0 (0.0%) | 1 (0.0%) | 79 | 31 | 73 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| metal.small.MCool 1.21 | 4140 | 18932 (457.3%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| metal.small.MCool 1.21 | 650 | 446 | 650 | 614 | 6.4 / 2.7 | 5 | 917 | 424 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| metal.small.MCool 1.21 | 0.7% | 190 | 62 | 3 | 1.7 | 60 / 18932 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| metal.small.MCool 1.21 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| metal.small.MCool 1.21 | metal.small.MCool | 1 | 35 | 302 | 0.4% | 12.4% ± 14.5 | 10.1% | 23.7% / 23.8% | 12.0% | 0 / 0 | T?/M? | 98% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
