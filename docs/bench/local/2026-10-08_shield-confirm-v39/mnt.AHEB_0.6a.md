# mnt.AHEB 0.6a (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 84.2% | 94.3% | 49.5% | 33 / 35 | 6.1% | 2.4% | 11 | 0 | 0.51 / 18.1 | 70.5% | +13.7 |
| 2 | 85.4% | 94.3% | 42.3% | 33 / 35 | 4.6% | 1.8% | 11 | 0 | 0.41 / 9.0 | 79.5% | +5.9 |
| 3 | 79.4% | 88.6% | 44.0% | 31 / 35 | 6.7% | 1.8% | 8 | 0 | 0.39 / 12.6 | 81.4% | -2.0 |
| 4 | 85.0% | 94.3% | 49.0% | 33 / 35 | 7.4% | 1.8% | 11 | 0 | 0.49 / 14.5 | 81.5% | +3.5 |
| 5 | 95.3% | 100.0% | 48.4% | 35 / 35 | 7.3% | 1.2% | 11 | 0 | 0.35 / 16.5 | 79.2% | +16.1 |
| 6 | 86.9% | 97.1% | 49.9% | 34 / 35 | 6.5% | 2.3% | 12 | 0 | 0.47 / 15.8 | 81.0% | +5.8 |
| 7 | 89.6% | 97.1% | 54.8% | 34 / 35 | 6.6% | 2.1% | 15 | 0 | 0.46 / 12.5 | 71.3% | +18.3 |
| 8 | 90.1% | 97.1% | 57.9% | 34 / 35 | 6.6% | 2.0% | 9 | 0 | 0.46 / 16.3 | 78.9% | +11.1 |
| 9 | 82.1% | 91.4% | 37.9% | 32 / 35 | 6.8% | 1.8% | 9 | 0 | 0.50 / 356.3 | 80.9% | +1.1 |
| 10 | 91.9% | 97.1% | 51.0% | 34 / 35 | 5.4% | 0.9% | 10 | 0 | 0.38 / 14.1 | 83.4% | +8.5 |
| 11 | 86.1% | 94.3% | 53.9% | 33 / 35 | 7.5% | 1.8% | 11 | 0 | 0.50 / 13.6 | 80.2% | +5.9 |
| 12 | 84.1% | 94.3% | 40.2% | 33 / 35 | 8.2% | 2.4% | 11 | 0 | 0.43 / 15.4 | 77.2% | +6.9 |
| 13 | 94.0% | 97.1% | 44.8% | 34 / 35 | 6.6% | 0.7% | 12 | 0 | 0.38 / 15.5 | 80.2% | +13.8 |
| 14 | 84.4% | 94.3% | 44.9% | 33 / 35 | 6.2% | 2.2% | 12 | 0 | 0.46 / 13.6 | 74.3% | +10.1 |
| 15 | 80.0% | 88.6% | 50.1% | 31 / 35 | 9.6% | 1.8% | 11 | 0 | 0.45 / 12.4 | 81.9% | -2.0 |
| 16 | 86.6% | 94.3% | 52.2% | 33 / 35 | 5.4% | 1.8% | 12 | 0 | 0.45 / 11.2 | 71.2% | +15.4 |

Mean score share 86.6% ± 2.5, baseline 78.3% ± 2.2, paired diff +8.3 ± 3.3.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 176 over 16 battles (11.0 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| mnt.AHEB 0.6a | shield-confirm | 86.6% ± 2.5 | 94.6% ± 1.7 | 48.2% ± 2.9 | 530 / 560 | 6.7% ± 0.6 | 1.8% ± 0.3 | 176 | 0 | 0.51 / 356.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| mnt.AHEB 0.6a | 16 | 353 | 26.6% | 63.0% | 0.0% | 10.4% | 947 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| mnt.AHEB 0.6a | 16 | 16 | 0 | 0 | 0.31 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| mnt.AHEB 0.6a | 28687 | 72 | 28697 | 28672 (99.9%) | 15 (0.1%) | 25 (0.1%) | 573 | 79 | 103 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| mnt.AHEB 0.6a | 4916 | 26785 (544.9%) | 176 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| mnt.AHEB 0.6a | 650 | 372 | 650 | 797 | 6.0 / 6.4 | 66 | 543 | 30 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| mnt.AHEB 0.6a | 1.8% | 176 | 73 | 3 | 3.0 | 114 / 26785 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| mnt.AHEB 0.6a | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| mnt.AHEB 0.6a | mnt.AHEB | 1 | 35 | 266 | 1.9% | 12.9% ± 6.3 | 9.7% | 23.2% / 22.8% | 63.2% | 0 / 0 | T?/M? | 87% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
