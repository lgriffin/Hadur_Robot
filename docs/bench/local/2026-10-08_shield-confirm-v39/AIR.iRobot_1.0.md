# AIR.iRobot 1.0 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 97.9% | 100.0% | 70.8% | 35 / 35 | 9.6% | 0.2% | 10 | 0 | 0.37 / 14.3 | 81.1% | +16.8 |
| 2 | 96.0% | 100.0% | 66.7% | 35 / 35 | 5.3% | 0.8% | 10 | 0 | 0.41 / 19.0 | 84.0% | +12.0 |
| 3 | 94.6% | 100.0% | 61.1% | 35 / 35 | 6.9% | 0.9% | 7 | 0 | 0.42 / 14.2 | 85.3% | +9.4 |
| 4 | 98.7% | 100.0% | 89.4% | 35 / 35 | 9.7% | 0.2% | 10 | 0 | 0.39 / 15.8 | 71.8% | +26.9 |
| 5 | 97.6% | 100.0% | 82.9% | 35 / 35 | 13.7% | 0.5% | 13 | 0 | 0.41 / 16.0 | 87.5% | +10.1 |
| 6 | 96.1% | 100.0% | 73.0% | 35 / 35 | 9.4% | 0.7% | 9 | 0 | 0.40 / 16.4 | 85.2% | +10.9 |
| 7 | 94.3% | 100.0% | 68.2% | 35 / 35 | 10.3% | 0.9% | 11 | 0 | 0.42 / 13.4 | 81.4% | +12.9 |
| 8 | 98.6% | 100.0% | 84.7% | 35 / 35 | 7.0% | 0.4% | 12 | 0 | 0.39 / 15.2 | 84.2% | +14.3 |
| 9 | 96.0% | 100.0% | 69.8% | 35 / 35 | 11.6% | 0.6% | 11 | 0 | 0.39 / 16.1 | 84.1% | +11.9 |
| 10 | 98.1% | 100.0% | 78.0% | 35 / 35 | 7.7% | 0.3% | 11 | 0 | 0.39 / 11.7 | 84.5% | +13.6 |
| 11 | 94.2% | 97.1% | 44.9% | 34 / 35 | 2.8% | 0.2% | 12 | 0 | 0.40 / 12.5 | 86.0% | +8.2 |
| 12 | 98.2% | 100.0% | 82.4% | 35 / 35 | 8.2% | 0.3% | 10 | 0 | 0.37 / 13.8 | 82.3% | +16.0 |
| 13 | 97.8% | 100.0% | 72.0% | 35 / 35 | 8.1% | 0.3% | 13 | 0 | 0.38 / 14.9 | 86.8% | +11.0 |
| 14 | 95.1% | 100.0% | 71.6% | 35 / 35 | 9.0% | 0.9% | 9 | 0 | 0.39 / 16.2 | 80.9% | +14.2 |
| 15 | 97.4% | 100.0% | 67.2% | 35 / 35 | 3.6% | 0.4% | 11 | 0 | 0.41 / 13.5 | 85.2% | +12.2 |
| 16 | 91.2% | 97.1% | 57.6% | 34 / 35 | 10.9% | 0.7% | 12 | 0 | 0.39 / 226.9 | 74.1% | +17.1 |

Mean score share 96.4% ± 1.1, baseline 82.8% ± 2.3, paired diff +13.6 ± 2.3.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 171 over 16 battles (10.7 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | shield-confirm | 96.4% ± 1.1 | 99.6% ± 0.5 | 71.3% ± 5.9 | 558 / 560 | 8.4% ± 1.5 | 0.5% ± 0.1 | 171 | 0 | 0.42 / 226.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | 16 | 89 | 7.0% | 90.0% | 0.0% | 2.9% | 906 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | 16 | 16 | 0 | 0 | 0.31 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | 27493 | 4 | 27493 | 27493 (100.0%) | 0 (0.0%) | 0 (0.0%) | 76 | 37 | 52 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| AIR.iRobot 1.0 | 3663 | 25977 (709.2%) | 157 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | 650 | 483 | 627 | 756 | 5.8 / 2.3 | 31 | 1229 | 702 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | 0.5% | 171 | 68 | 3 | 2.6 | 91 / 25977 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | AIR.iRobot | 1 | 35 | 272 | 0.6% | 16.0% ± 11.3 | 10.4% | 29.1% / 27.6% | 9.5% | 0 / 0 | T?/M? | 92% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
