# rz.Aleph 0.34 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 88.0% | 97.1% | 42.4% | 34 / 35 | 4.9% | 1.5% | 13 | 0 | 0.71 / 19.5 | 73.1% | +14.9 |
| 2 | 92.8% | 97.1% | 50.5% | 34 / 35 | 5.7% | 0.6% | 10 | 0 | 0.65 / 16.0 | 62.5% | +30.3 |
| 3 | 83.2% | 97.1% | 34.6% | 34 / 35 | 8.5% | 2.3% | 11 | 0 | 0.78 / 24.2 | 63.2% | +20.0 |
| 4 | 93.3% | 100.0% | 48.9% | 35 / 35 | 7.0% | 1.0% | 12 | 0 | 0.73 / 137.0 | 65.9% | +27.4 |
| 5 | 90.2% | 94.3% | 58.6% | 33 / 35 | 5.8% | 0.7% | 12 | 0 | 0.58 / 24.5 | 73.3% | +16.9 |
| 6 | 87.2% | 97.1% | 39.1% | 34 / 35 | 6.1% | 1.4% | 12 | 0 | 0.75 / 25.4 | 71.0% | +16.2 |
| 7 | 87.1% | 97.1% | 46.5% | 34 / 35 | 7.0% | 1.5% | 12 | 0 | 0.69 / 17.7 | 71.6% | +15.5 |
| 8 | 72.8% | 94.3% | 48.8% | 33 / 35 | 11.5% | 6.8% | 10 | 0 | 0.94 / 15.6 | 70.9% | +1.9 |
| 9 | 90.3% | 100.0% | 47.2% | 35 / 35 | 5.5% | 1.4% | 8 | 0 | 0.71 / 18.2 | 63.9% | +26.4 |
| 10 | 83.8% | 94.3% | 38.1% | 33 / 35 | 5.5% | 1.5% | 5 | 0 | 0.72 / 16.9 | 70.9% | +12.9 |
| 11 | 90.9% | 100.0% | 45.8% | 35 / 35 | 5.7% | 1.4% | 11 | 0 | 0.74 / 19.6 | 77.5% | +13.4 |
| 12 | 75.2% | 88.6% | 39.2% | 31 / 35 | 7.4% | 2.2% | 4 | 0 | 0.76 / 21.3 | 69.8% | +5.4 |
| 13 | 88.7% | 97.1% | 42.6% | 34 / 35 | 7.2% | 1.1% | 14 | 0 | 0.65 / 17.2 | 72.5% | +16.2 |
| 14 | 87.5% | 97.1% | 53.2% | 34 / 35 | 7.3% | 1.7% | 10 | 0 | 0.64 / 20.0 | 77.7% | +9.7 |
| 15 | 68.6% | 88.6% | 38.7% | 31 / 35 | 8.4% | 4.9% | 12 | 0 | 0.90 / 16.1 | 75.9% | -7.3 |
| 16 | 85.5% | 94.3% | 47.4% | 33 / 35 | 8.2% | 1.5% | 12 | 0 | 0.69 / 56.5 | 71.4% | +14.1 |

Mean score share 85.3% ± 3.8, baseline 70.7% ± 2.5, paired diff +14.6 ± 5.0.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 168 over 16 battles (10.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rz.Aleph 0.34 | shield-confirm | 85.3% ± 3.8 | 95.9% ± 1.8 | 45.1% ± 3.4 | 537 / 560 | 7.0% ± 0.9 | 2.0% ± 0.9 | 168 | 0 | 0.94 / 137.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| rz.Aleph 0.34 | 16 | 436 | 16.5% | 76.8% | 0.0% | 6.7% | 985 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rz.Aleph 0.34 | 16 | 14 | 0 | 0 | 0.30 | 2 | 2 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| rz.Aleph 0.34 | 27737 | 10 | 27741 | 27737 (100.0%) | 0 (0.0%) | 4 (0.0%) | 528 | 53 | 64 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| rz.Aleph 0.34 | 10947 | 22998 (210.1%) | 3434 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| rz.Aleph 0.34 | 650 | 494 | 650 | 836 | 7.7 / 9.6 | 70 | 1619 | 134 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| rz.Aleph 0.34 | 2.0% | 168 | 275 | 3 | 8.7 | 445 / 22998 (2%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| rz.Aleph 0.34 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| rz.Aleph 0.34 | rz.Aleph | 1 | 35 | 266 | 1.8% | 14.8% ± 5.2 | 8.3% | 20.8% / 23.6% | 4.5% | 0 / 0 | T?/M? | 86% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
