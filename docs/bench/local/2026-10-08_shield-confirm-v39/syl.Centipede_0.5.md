# syl.Centipede 0.5 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 98.5% | 100.0% | 91.2% | 35 / 35 | 15.0% | 0.7% | 12 | 0 | 0.50 / 15.0 | 85.3% | +13.2 |
| 2 | 94.4% | 97.1% | 81.8% | 34 / 35 | 11.8% | 0.9% | 11 | 0 | 0.46 / 14.5 | 90.2% | +4.2 |
| 3 | 98.4% | 100.0% | 85.4% | 35 / 35 | 10.3% | 0.6% | 10 | 0 | 0.51 / 16.5 | 88.8% | +9.6 |
| 4 | 98.7% | 100.0% | 90.2% | 35 / 35 | 9.9% | 0.4% | 11 | 0 | 0.53 / 43.4 | 87.8% | +10.9 |
| 5 | 96.1% | 100.0% | 69.7% | 35 / 35 | 10.1% | 0.9% | 12 | 0 | 0.54 / 14.5 | 88.6% | +7.5 |
| 6 | 97.2% | 100.0% | 82.3% | 35 / 35 | 11.0% | 0.7% | 12 | 0 | 0.54 / 14.2 | 88.1% | +9.1 |
| 7 | 92.2% | 97.1% | 73.9% | 34 / 35 | 14.4% | 1.2% | 12 | 0 | 0.53 / 18.0 | 85.0% | +7.2 |
| 8 | 95.9% | 100.0% | 72.4% | 35 / 35 | 7.8% | 0.9% | 13 | 0 | 0.53 / 12.6 | 83.2% | +12.7 |
| 9 | 99.0% | 100.0% | 90.7% | 35 / 35 | 9.6% | 0.5% | 12 | 0 | 0.49 / 14.6 | 85.9% | +13.1 |
| 10 | 97.3% | 100.0% | 81.8% | 35 / 35 | 11.4% | 0.8% | 12 | 0 | 0.49 / 14.4 | 88.2% | +9.0 |
| 11 | 97.7% | 100.0% | 82.4% | 35 / 35 | 12.1% | 0.9% | 10 | 0 | 0.53 / 16.4 | 84.6% | +13.1 |
| 12 | 97.6% | 100.0% | 76.3% | 35 / 35 | 8.9% | 0.6% | 12 | 0 | 0.53 / 15.0 | 86.0% | +11.6 |
| 13 | 99.3% | 100.0% | 94.3% | 35 / 35 | 11.5% | 0.4% | 11 | 0 | 0.49 / 126.7 | 82.3% | +17.0 |
| 14 | 97.9% | 100.0% | 83.0% | 35 / 35 | 8.5% | 0.5% | 11 | 0 | 0.56 / 15.2 | 88.7% | +9.2 |
| 15 | 97.1% | 100.0% | 79.1% | 35 / 35 | 7.5% | 0.7% | 10 | 0 | 0.50 / 14.7 | 88.8% | +8.4 |
| 16 | 93.4% | 97.1% | 74.8% | 34 / 35 | 11.2% | 0.7% | 12 | 0 | 0.45 / 12.9 | 87.6% | +5.8 |

Mean score share 96.9% ± 1.1, baseline 86.8% ± 1.2, paired diff +10.1 ± 1.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 183 over 16 battles (11.4 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| syl.Centipede 0.5 | shield-confirm | 96.9% ± 1.1 | 99.5% ± 0.6 | 81.8% ± 3.9 | 557 / 560 | 10.7% ± 1.1 | 0.7% ± 0.1 | 183 | 0 | 0.56 / 126.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| syl.Centipede 0.5 | 16 | 79 | 11.9% | 83.0% | 0.0% | 5.1% | 743 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| syl.Centipede 0.5 | 16 | 16 | 0 | 0 | 0.33 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| syl.Centipede 0.5 | 17870 | 6 | 17871 | 17870 (100.0%) | 0 (0.0%) | 1 (0.0%) | 48 | 33 | 70 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| syl.Centipede 0.5 | 5366 | 16835 (313.7%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| syl.Centipede 0.5 | 650 | 409 | 650 | 593 | 8.2 / 1.9 | 18 | 1160 | 366 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| syl.Centipede 0.5 | 0.7% | 183 | 72 | 3 | 1.7 | 49 / 16835 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| syl.Centipede 0.5 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| syl.Centipede 0.5 | syl.Centipede | 1 | 35 | 284 | 0.9% | 10.3% ± 9.2 | 9.6% | 25.7% / 24.1% | 5.0% | 0 / 0 | T?/M? | 94% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
