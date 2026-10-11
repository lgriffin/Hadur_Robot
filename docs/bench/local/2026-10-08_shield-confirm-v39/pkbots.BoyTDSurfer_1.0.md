# pkbots.BoyTDSurfer 1.0 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 86.6% | 97.1% | 49.2% | 34 / 35 | 11.4% | 2.5% | 10 | 0 | 0.51 / 18.3 | 66.0% | +20.6 |
| 2 | 87.4% | 97.1% | 21.4% | 34 / 35 | 9.2% | 1.6% | 10 | 0 | 0.37 / 18.8 | 66.2% | +21.2 |
| 3 | 86.0% | 97.1% | 37.1% | 34 / 35 | 11.1% | 2.1% | 9 | 0 | 0.48 / 15.9 | 71.0% | +14.9 |
| 4 | 83.5% | 94.3% | 31.5% | 33 / 35 | 14.1% | 2.2% | 12 | 0 | 0.39 / 28.1 | 73.5% | +10.0 |
| 5 | 92.1% | 100.0% | 47.2% | 35 / 35 | 11.8% | 1.8% | 11 | 0 | 0.45 / 17.0 | 70.4% | +21.7 |
| 6 | 92.5% | 100.0% | 42.8% | 35 / 35 | 14.0% | 1.5% | 11 | 0 | 0.37 / 17.9 | 73.7% | +18.9 |
| 7 | 74.5% | 88.6% | 32.0% | 31 / 35 | 16.7% | 2.7% | 7 | 0 | 0.44 / 16.7 | 70.3% | +4.1 |
| 8 | 89.9% | 100.0% | 49.6% | 35 / 35 | 13.2% | 2.5% | 9 | 0 | 0.47 / 23.0 | 75.0% | +14.9 |
| 9 | 77.9% | 91.4% | 46.6% | 32 / 35 | 13.9% | 3.4% | 13 | 0 | 0.62 / 17.1 | 75.3% | +2.6 |
| 10 | 87.0% | 97.1% | 42.9% | 34 / 35 | 11.0% | 2.1% | 9 | 0 | 0.44 / 18.7 | 75.9% | +11.2 |
| 11 | 86.7% | 97.1% | 41.5% | 34 / 35 | 14.0% | 2.2% | 8 | 0 | 0.46 / 18.6 | 68.9% | +17.8 |
| 12 | 89.6% | 100.0% | 34.7% | 35 / 35 | 10.0% | 2.1% | 14 | 0 | 0.39 / 13.2 | 69.1% | +20.5 |
| 13 | 92.6% | 100.0% | 49.0% | 35 / 35 | 15.1% | 1.8% | 12 | 0 | 0.39 / 19.4 | 71.1% | +21.5 |
| 14 | 92.8% | 100.0% | 49.6% | 35 / 35 | 9.6% | 1.5% | 10 | 0 | 0.40 / 17.6 | 71.5% | +21.4 |
| 15 | 92.9% | 100.0% | 45.5% | 35 / 35 | 15.0% | 1.7% | 14 | 0 | 0.40 / 17.1 | 72.5% | +20.4 |
| 16 | 83.5% | 94.3% | 38.3% | 33 / 35 | 17.7% | 2.3% | 11 | 0 | 0.42 / 24.6 | 72.4% | +11.2 |

Mean score share 87.2% ± 2.9, baseline 71.4% ± 1.6, paired diff +15.8 ± 3.4.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 170 over 16 battles (10.6 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pkbots.BoyTDSurfer 1.0 | shield-confirm | 87.2% ± 2.9 | 97.1% ± 1.8 | 41.2% ± 4.3 | 544 / 560 | 13.0% ± 1.3 | 2.1% ± 0.3 | 170 | 0 | 0.62 / 28.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| pkbots.BoyTDSurfer 1.0 | 16 | 340 | 14.7% | 79.5% | 0.0% | 5.8% | 1198 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pkbots.BoyTDSurfer 1.0 | 16 | 15 | 0 | 0 | 0.30 | 1 | 1 | 0 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| pkbots.BoyTDSurfer 1.0 | 43314 | 289 | 43314 | 43314 (100.0%) | 0 (0.0%) | 0 (0.0%) | 136 | 72 | 56 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| pkbots.BoyTDSurfer 1.0 | 3712 | 40914 (1102.2%) | 370 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| pkbots.BoyTDSurfer 1.0 | 650 | 357 | 650 | 1049 | 5.5 / 7.7 | 19 | 471 | 318 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| pkbots.BoyTDSurfer 1.0 | 2.1% | 170 | 98 | 3 | 3.4 | 155 / 40914 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| pkbots.BoyTDSurfer 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| pkbots.BoyTDSurfer 1.0 | pkbots.BoyTDSurfer | 1 | 35 | 304 | 2.7% | 19.5% ± 6.7 | 12.0% | 21.6% / 36.5% | 11.0% | 0 / 0 | T?/M? | 84% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
