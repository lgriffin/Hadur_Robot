# infovk.s_schwarzm16.silverbird 1.0 (rank226-band4) vs hadur2.Hadur 3.14hjswhcpkw2

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 83.3% | 97.1% | 69.3% | 34 / 35 | 14.3% | 6.6% | 27 | 0 | 1.13 / 1059.9 | 81.4% | +1.9 |
| 2 | 84.5% | 97.1% | 69.7% | 34 / 35 | 13.1% | 5.9% | 23 | 0 | 1.13 / 929.0 | 82.9% | +1.6 |
| 3 | 86.2% | 100.0% | 70.9% | 35 / 35 | 12.2% | 6.0% | 24 | 0 | 1.10 / 1022.8 | 82.1% | +4.1 |
| 4 | 84.9% | 97.1% | 71.3% | 34 / 35 | 12.2% | 5.8% | 22 | 0 | 1.13 / 919.0 | 83.5% | +1.4 |
| 5 | 81.0% | 94.3% | 66.3% | 33 / 35 | 11.8% | 6.2% | 23 | 0 | 1.13 / 1053.3 | 77.4% | +3.6 |
| 6 | 85.6% | 100.0% | 69.3% | 35 / 35 | 12.2% | 5.7% | 22 | 0 | 1.13 / 69.0 | 86.3% | -0.7 |
| 7 | 82.1% | 97.1% | 66.5% | 34 / 35 | 13.8% | 5.8% | 19 | 0 | 1.10 / 913.7 | 86.5% | -4.5 |
| 8 | 78.7% | 94.3% | 62.3% | 33 / 35 | 12.7% | 6.6% | 30 | 0 | 1.12 / 982.1 | 82.3% | -3.6 |

Mean score share 83.3% ± 2.1, baseline 82.8% ± 2.4, paired diff +0.5 ± 2.6.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 190 over 8 battles (23.8 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| infovk.s_schwarzm16.silverbird 1.0 | rank226-band4 | 83.3% ± 2.1 | 97.1% ± 1.8 | 68.2% ± 2.5 | 272 / 280 | 12.8% ± 0.7 | 6.1% ± 0.3 | 190 | 0 | 1.13 / 1059.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| infovk.s_schwarzm16.silverbird 1.0 | 8 | 770 | 6.5% | 90.7% | 0.3% | 2.5% | 939 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| infovk.s_schwarzm16.silverbird 1.0 | 8 | 8 | 0 | 0 | 0.68 | 0 | 0 | 0 |

8 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| infovk.s_schwarzm16.silverbird 1.0 | 16117 | 68 | 16117 | 16116 (100.0%) | 1 (0.0%) | 1 (0.0%) | 752 | 159 | 108 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| infovk.s_schwarzm16.silverbird 1.0 | 16530 | 1408 (8.5%) | 14472 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| infovk.s_schwarzm16.silverbird 1.0 | 650 | 515 | 613 | 789 | 42.7 / 20.0 | 789 | 3709 | 1332 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| infovk.s_schwarzm16.silverbird 1.0 | 6.1% | 190 | 500 | 3 | 57.6 | 1406 / 1408 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| infovk.s_schwarzm16.silverbird 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| infovk.s_schwarzm16.silverbird 1.0 | infovk.s_schwarzm16.silverbird | 1 | 35 | 352 | 7.3% | 7.0% ± 1.1 | 12.2% | 26.2% / 26.5% | 6.5% | 0 / 0 | T3/M0 | 77% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
