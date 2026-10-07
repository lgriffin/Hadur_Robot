# ntw.Sighup 1.5 (weak) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1000000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 88.8% | 97.1% | 81.6% | 34 / 35 | 33.6% | 8.6% | 14 | 0 | 0.57 / 9.7 | 87.1% | +1.7 |
| 2 | 91.7% | 100.0% | 83.7% | 35 / 35 | 30.0% | 7.5% | 14 | 0 | 0.69 / 9.4 | 88.2% | +3.5 |
| 3 | 88.6% | 97.1% | 80.5% | 34 / 35 | 25.1% | 6.9% | 10 | 0 | 0.72 / 11.7 | 91.9% | -3.3 |
| 4 | 91.7% | 100.0% | 82.7% | 35 / 35 | 28.3% | 12.3% | 14 | 0 | 0.67 / 9.2 | 89.9% | +1.8 |
| 5 | 91.9% | 100.0% | 83.8% | 35 / 35 | 27.1% | 7.0% | 13 | 0 | 0.71 / 9.0 | 90.2% | +1.6 |
| 6 | 95.6% | 100.0% | 90.8% | 35 / 35 | 26.6% | 3.3% | 13 | 0 | 0.66 / 10.9 | 91.4% | +4.3 |
| 7 | 91.9% | 100.0% | 85.1% | 35 / 35 | 28.2% | 9.0% | 13 | 0 | 0.67 / 9.8 | 91.9% | -0.0 |
| 8 | 91.5% | 100.0% | 84.2% | 35 / 35 | 34.4% | 8.0% | 9 | 0 | 0.61 / 8.7 | 86.9% | +4.6 |
| 9 | 92.3% | 100.0% | 85.0% | 35 / 35 | 34.4% | 7.6% | 11 | 0 | 0.64 / 14.2 | 91.7% | +0.6 |
| 10 | 91.9% | 100.0% | 84.7% | 35 / 35 | 32.8% | 8.8% | 15 | 0 | 0.70 / 9.0 | 91.5% | +0.4 |
| 11 | 94.1% | 100.0% | 88.1% | 35 / 35 | 32.7% | 5.2% | 9 | 0 | 0.66 / 9.1 | 91.0% | +3.1 |
| 12 | 91.1% | 100.0% | 82.8% | 35 / 35 | 30.1% | 7.7% | 11 | 0 | 0.64 / 9.1 | 89.3% | +1.8 |
| 13 | 90.7% | 97.1% | 84.0% | 34 / 35 | 31.2% | 6.1% | 12 | 0 | 0.60 / 9.8 | 88.2% | +2.5 |
| 14 | 94.3% | 100.0% | 88.5% | 35 / 35 | 31.7% | 5.3% | 11 | 0 | 0.59 / 9.4 | 90.9% | +3.5 |
| 15 | 92.2% | 100.0% | 84.3% | 35 / 35 | 26.5% | 5.1% | 14 | 0 | 0.69 / 11.9 | 94.0% | -1.8 |
| 16 | 89.8% | 97.1% | 82.3% | 34 / 35 | 25.4% | 7.3% | 10 | 0 | 0.70 / 14.4 | 88.8% | +1.0 |

Mean score share 91.8% ± 1.0, baseline 90.2% ± 1.0, paired diff +1.6 ± 1.1.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1000000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 193 over 16 battles (12.1 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | weak | 91.8% ± 1.0 | 99.3% ± 0.7 | 84.5% ± 1.4 | 556 / 560 | 29.9% ± 1.7 | 7.2% ± 1.1 | 193 | 0 | 0.72 / 14.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 16 | 421 | 3.0% | 93.1% | 2.8% | 1.1% | 414 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 16 | 12 | 1192 | 0 | 0.34 | 0 | 0 | 0 |

12 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 8213 | 55 | 8153 | 8112 (98.8%) | 101 (1.2%) | 41 (0.5%) | 2560 | 268 | 50 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ntw.Sighup 1.5 | 8873 | 418 (4.7%) | 550 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 650 | 351 | 400 | 264 | 60.8 / 11.2 | 5967 | 7544 | 1871 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 7.2% | 193 | 104 | 3 | 14.5 | 411 / 418 (98%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | ntw.Sighup | 1 | 35 | 272 | 7.1% | 4.3% ± 1.8 | 16.9% | 30.9% / 27.1% | 17.4% | 0 / 0 | T1/M? | 89% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
