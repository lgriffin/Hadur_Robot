# lucasslf.HariSeldon 0.2.1 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 96.6% | 100.0% | 70.1% | 35 / 35 | 10.8% | 1.5% | 9 | 0 | 0.97 / 16.0 | 86.3% | +10.3 |
| 2 | 98.7% | 100.0% | 89.4% | 35 / 35 | 19.4% | 1.3% | 9 | 0 | 1.08 / 15.9 | 78.7% | +20.0 |
| 3 | 90.0% | 97.1% | 61.7% | 34 / 35 | 11.7% | 2.1% | 10 | 0 | 0.98 / 16.5 | 78.5% | +11.4 |
| 4 | 94.5% | 100.0% | 63.7% | 35 / 35 | 9.9% | 1.8% | 10 | 0 | 0.99 / 16.3 | 83.6% | +10.9 |
| 5 | 98.5% | 100.0% | 87.1% | 35 / 35 | 11.7% | 1.3% | 9 | 0 | 1.11 / 15.7 | 77.6% | +21.0 |
| 6 | 94.7% | 100.0% | 64.9% | 35 / 35 | 8.3% | 1.9% | 10 | 0 | 1.00 / 15.7 | 86.2% | +8.5 |
| 7 | 94.2% | 100.0% | 59.8% | 35 / 35 | 9.8% | 1.8% | 10 | 0 | 1.10 / 17.2 | 80.3% | +13.9 |
| 8 | 96.4% | 100.0% | 80.2% | 35 / 35 | 12.8% | 1.7% | 9 | 0 | 0.94 / 20.2 | 81.2% | +15.2 |
| 9 | 94.5% | 100.0% | 64.5% | 35 / 35 | 15.7% | 1.6% | 11 | 0 | 0.99 / 22.7 | 72.9% | +21.6 |
| 10 | 95.9% | 100.0% | 66.2% | 35 / 35 | 15.1% | 1.6% | 10 | 0 | 1.14 / 15.7 | 82.4% | +13.5 |
| 11 | 96.9% | 100.0% | 77.4% | 35 / 35 | 16.7% | 1.3% | 6 | 0 | 0.95 / 18.0 | 77.0% | +19.9 |
| 12 | 95.1% | 100.0% | 74.0% | 35 / 35 | 14.9% | 1.9% | 11 | 0 | 1.00 / 16.4 | 86.0% | +9.1 |
| 13 | 91.8% | 97.1% | 67.4% | 34 / 35 | 10.9% | 1.9% | 9 | 0 | 0.91 / 17.5 | 79.2% | +12.6 |
| 14 | 96.3% | 100.0% | 68.1% | 35 / 35 | 15.2% | 1.5% | 11 | 0 | 1.00 / 17.5 | 75.7% | +20.6 |
| 15 | 98.3% | 100.0% | 88.4% | 35 / 35 | 14.1% | 1.3% | 10 | 0 | 1.12 / 17.8 | 81.7% | +16.6 |
| 16 | 99.2% | 100.0% | 92.7% | 35 / 35 | 11.4% | 1.2% | 10 | 0 | 0.98 / 15.2 | 76.4% | +22.8 |

Mean score share 95.7% ± 1.3, baseline 80.2% ± 2.1, paired diff +15.5 ± 2.6.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 154 over 16 battles (9.6 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| lucasslf.HariSeldon 0.2.1 | shield-confirm | 95.7% ± 1.3 | 99.6% ± 0.5 | 73.5% ± 5.8 | 558 / 560 | 13.0% ± 1.6 | 1.6% ± 0.1 | 154 | 0 | 1.14 / 22.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| lucasslf.HariSeldon 0.2.1 | 16 | 109 | 5.7% | 91.8% | 0.0% | 2.5% | 1369 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| lucasslf.HariSeldon 0.2.1 | 16 | 16 | 0 | 0 | 0.28 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| lucasslf.HariSeldon 0.2.1 | 51836 | 982 | 51836 | 51832 (100.0%) | 4 (0.0%) | 4 (0.0%) | 68 | 31 | 47 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| lucasslf.HariSeldon 0.2.1 | 3545 | 50169 (1415.2%) | 692 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| lucasslf.HariSeldon 0.2.1 | 650 | 476 | 627 | 1219 | 7.6 / 2.9 | 19 | 839 | 391 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| lucasslf.HariSeldon 0.2.1 | 1.6% | 154 | 44 | 2 | 2.8 | 139 / 50169 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| lucasslf.HariSeldon 0.2.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| lucasslf.HariSeldon 0.2.1 | lucasslf.HariSeldon | 1 | 35 | 312 | 2.0% | 4.5% ± 5.2 | 11.9% | 33.7% / 28.6% | 4.0% | 0 / 0 | T?/M? | 99% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
