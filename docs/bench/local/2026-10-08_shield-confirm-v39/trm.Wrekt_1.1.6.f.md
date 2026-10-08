# trm.Wrekt 1.1.6.f (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 68.2% | 82.9% | 43.5% | 29 / 35 | 7.4% | 4.1% | 8 | 0 | 1.31 / 86.7 | 69.8% | -1.6 |
| 2 | 88.8% | 97.1% | 51.7% | 34 / 35 | 7.1% | 1.5% | 13 | 0 | 1.25 / 18.3 | 66.3% | +22.5 |
| 3 | 68.8% | 82.9% | 55.0% | 29 / 35 | 11.6% | 7.1% | 21 | 0 | 1.49 / 14.5 | 69.1% | -0.2 |
| 4 | 94.8% | 100.0% | 63.1% | 35 / 35 | 10.0% | 0.8% | 11 | 0 | 1.17 / 19.1 | 78.7% | +16.1 |
| 5 | 75.1% | 94.3% | 53.3% | 33 / 35 | 13.1% | 6.3% | 12 | 0 | 1.43 / 17.7 | 73.2% | +1.9 |
| 6 | 96.4% | 100.0% | 67.0% | 35 / 35 | 5.4% | 0.5% | 13 | 0 | 1.30 / 22.4 | 70.2% | +26.2 |
| 7 | 90.1% | 100.0% | 62.9% | 35 / 35 | 8.6% | 2.0% | 12 | 0 | 1.11 / 15.6 | 71.8% | +18.4 |
| 8 | 78.0% | 94.3% | 49.0% | 33 / 35 | 6.6% | 4.1% | 7 | 0 | 1.51 / 19.9 | 69.5% | +8.5 |
| 9 | 98.2% | 100.0% | 77.2% | 35 / 35 | 9.7% | 0.2% | 8 | 0 | 1.26 / 18.3 | 73.7% | +24.5 |
| 10 | 91.0% | 97.1% | 55.1% | 34 / 35 | 8.2% | 1.0% | 11 | 0 | 1.03 / 14.5 | 67.8% | +23.2 |
| 11 | 88.5% | 94.3% | 42.5% | 33 / 35 | 4.9% | 0.9% | 14 | 0 | 1.32 / 52.1 | 71.9% | +16.6 |
| 12 | 89.4% | 97.1% | 56.6% | 34 / 35 | 7.5% | 1.3% | 5 | 0 | 1.05 / 15.1 | 65.7% | +23.6 |
| 13 | 82.7% | 91.4% | 45.8% | 32 / 35 | 4.8% | 1.4% | 11 | 0 | 1.33 / 18.4 | 70.8% | +12.0 |
| 14 | 91.6% | 97.1% | 43.8% | 34 / 35 | 3.8% | 0.9% | 11 | 0 | 0.97 / 13.1 | 67.7% | +23.9 |
| 15 | 96.1% | 100.0% | 72.0% | 35 / 35 | 8.2% | 0.6% | 10 | 0 | 1.20 / 17.3 | 68.0% | +28.1 |
| 16 | 98.4% | 100.0% | 66.3% | 35 / 35 | 5.3% | 0.2% | 11 | 0 | 0.90 / 13.5 | 64.2% | +34.2 |

Mean score share 87.3% ± 5.3, baseline 69.9% ± 1.9, paired diff +17.4 ± 5.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 178 over 16 battles (11.1 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| trm.Wrekt 1.1.6.f | shield-confirm | 87.3% ± 5.3 | 95.5% ± 3.0 | 56.6% ± 5.7 | 535 / 560 | 7.6% ± 1.4 | 2.1% ± 1.2 | 178 | 0 | 1.51 / 86.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| trm.Wrekt 1.1.6.f | 16 | 423 | 18.5% | 73.9% | 0.0% | 7.6% | 954 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| trm.Wrekt 1.1.6.f | 16 | 16 | 0 | 0 | 0.32 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| trm.Wrekt 1.1.6.f | 27696 | 3 | 27729 | 27696 (100.0%) | 0 (0.0%) | 33 (0.1%) | 482 | 81 | 104 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 9847 | 22469 (228.2%) | 2587 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| trm.Wrekt 1.1.6.f | 650 | 375 | 650 | 804 | 10.5 / 8.9 | 202 | 1317 | 5 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| trm.Wrekt 1.1.6.f | 2.1% | 178 | 83 | 3 | 9.8 | 475 / 22469 (2%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| trm.Wrekt 1.1.6.f | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| trm.Wrekt 1.1.6.f | trm.Wrekt | 1 | 35 | 276 | 0.2% | 76.0% ± 33.5 | 8.2% | 17.2% / 26.1% | 6.2% | 0 / 0 | T?/M? | 98% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
