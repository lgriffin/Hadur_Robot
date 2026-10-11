# kc.micro.Thorn 1.252 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 89.0% | 97.1% | 46.8% | 34 / 35 | 5.5% | 1.6% | 14 | 0 | 0.40 / 13.2 | 75.2% | +13.7 |
| 2 | 89.4% | 94.3% | 57.4% | 33 / 35 | 7.4% | 0.7% | 11 | 0 | 0.42 / 13.7 | 75.5% | +13.8 |
| 3 | 95.9% | 100.0% | 65.3% | 35 / 35 | 4.8% | 0.6% | 9 | 0 | 0.39 / 17.5 | 73.2% | +22.7 |
| 4 | 84.6% | 94.3% | 53.0% | 33 / 35 | 6.7% | 2.1% | 10 | 0 | 0.49 / 15.7 | 73.8% | +10.8 |
| 5 | 97.9% | 100.0% | 76.2% | 35 / 35 | 8.8% | 0.3% | 11 | 0 | 0.41 / 14.0 | 62.3% | +35.6 |
| 6 | 88.8% | 97.1% | 55.3% | 34 / 35 | 7.9% | 1.5% | 12 | 0 | 0.42 / 21.7 | 78.4% | +10.4 |
| 7 | 84.8% | 94.3% | 43.8% | 33 / 35 | 6.4% | 1.5% | 6 | 0 | 0.39 / 17.7 | 73.2% | +11.6 |
| 8 | 84.2% | 94.3% | 46.0% | 33 / 35 | 8.0% | 1.9% | 10 | 0 | 0.41 / 15.0 | 77.9% | +6.4 |
| 9 | 86.4% | 97.1% | 50.5% | 34 / 35 | 7.4% | 1.6% | 5 | 0 | 0.57 / 16.4 | 71.6% | +14.9 |
| 10 | 77.8% | 88.6% | 42.3% | 31 / 35 | 8.7% | 2.2% | 12 | 0 | 0.44 / 16.7 | 76.2% | +1.6 |
| 11 | 81.5% | 91.4% | 52.1% | 32 / 35 | 6.6% | 2.2% | 10 | 0 | 0.54 / 12.9 | 79.5% | +1.9 |
| 12 | 95.6% | 100.0% | 67.0% | 35 / 35 | 7.9% | 0.7% | 12 | 0 | 0.42 / 14.2 | 74.1% | +21.4 |
| 13 | 90.1% | 97.1% | 57.5% | 34 / 35 | 10.2% | 1.2% | 13 | 0 | 0.43 / 13.7 | 79.9% | +10.2 |
| 14 | 75.3% | 88.6% | 47.0% | 31 / 35 | 10.0% | 3.4% | 13 | 0 | 0.61 / 15.0 | 71.6% | +3.7 |
| 15 | 88.1% | 97.1% | 56.3% | 34 / 35 | 5.9% | 1.7% | 22 | 0 | 0.58 / 16.7 | 71.4% | +16.7 |
| 16 | 91.1% | 97.1% | 57.1% | 34 / 35 | 5.9% | 0.9% | 9 | 0 | 0.39 / 15.4 | 70.8% | +20.3 |

Mean score share 87.5% ± 3.3, baseline 74.0% ± 2.3, paired diff +13.5 ± 4.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 179 over 16 battles (11.2 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.micro.Thorn 1.252 | shield-confirm | 87.5% ± 3.3 | 95.5% ± 1.9 | 54.6% ± 4.9 | 535 / 560 | 7.4% ± 0.8 | 1.5% ± 0.4 | 179 | 0 | 0.61 / 21.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kc.micro.Thorn 1.252 | 16 | 342 | 22.8% | 69.2% | 0.0% | 8.0% | 970 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.micro.Thorn 1.252 | 16 | 14 | 0 | 0 | 0.32 | 2 | 2 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.micro.Thorn 1.252 | 26812 | 0 | 26913 | 26812 (100.0%) | 0 (0.0%) | 101 (0.4%) | 347 | 29 | 70 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.micro.Thorn 1.252 | 7593 | 24970 (328.9%) | 964 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.micro.Thorn 1.252 | 650 | 426 | 636 | 819 | 7.5 / 6.8 | 39 | 562 | 13 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.micro.Thorn 1.252 | 1.5% | 179 | 81 | 3 | 2.9 | 125 / 24970 (1%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.micro.Thorn 1.252 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kc.micro.Thorn 1.252 | kc.micro.Thorn | 1 | 35 | 292 | 0.9% | 15.0% ± 8.0 | 8.6% | 20.5% / 22.4% | 4.7% | 0 / 0 | T?/M? | 91% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
