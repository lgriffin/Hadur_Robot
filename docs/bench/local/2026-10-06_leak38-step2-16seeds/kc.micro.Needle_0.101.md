# kc.micro.Needle 0.101 (mid) vs hadur2.Hadur 3.8.1

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 80.2% | 97.1% | 63.4% | 34 / 35 | 13.6% | 7.3% | 6 | 0 | 1.18 / 14.3 | 83.8% | -3.6 |
| 2 | 74.9% | 88.6% | 61.9% | 31 / 35 | 16.3% | 8.0% | 11 | 0 | 1.17 / 61.1 | 79.0% | -4.1 |
| 3 | 74.6% | 94.3% | 54.7% | 33 / 35 | 12.5% | 7.2% | 11 | 0 | 1.24 / 30.6 | 72.4% | +2.3 |
| 4 | 79.8% | 94.3% | 65.7% | 33 / 35 | 16.3% | 6.9% | 26 | 0 | 1.12 / 15.9 | 70.8% | +9.0 |
| 5 | 74.9% | 88.6% | 61.9% | 31 / 35 | 14.1% | 7.6% | 11 | 0 | 1.16 / 16.1 | 75.5% | -0.6 |
| 6 | 78.4% | 94.3% | 61.3% | 33 / 35 | 12.2% | 6.5% | 10 | 0 | 1.17 / 16.2 | 76.2% | +2.2 |
| 7 | 71.2% | 82.9% | 59.7% | 29 / 35 | 14.6% | 7.6% | 9 | 0 | 1.17 / 76.5 | 78.6% | -7.4 |
| 8 | 77.6% | 91.4% | 63.7% | 32 / 35 | 14.8% | 6.1% | 9 | 0 | 1.12 / 15.5 | 84.7% | -7.1 |
| 9 | 69.7% | 82.9% | 57.0% | 29 / 35 | 13.7% | 7.3% | 11 | 0 | 1.20 / 99.5 | 83.8% | -14.0 |
| 10 | 78.0% | 91.4% | 64.7% | 32 / 35 | 15.1% | 6.9% | 11 | 0 | 1.15 / 88.1 | 77.3% | +0.8 |
| 11 | 78.4% | 94.3% | 61.8% | 33 / 35 | 13.0% | 6.1% | 9 | 0 | 1.14 / 15.9 | 69.8% | +8.6 |
| 12 | 69.1% | 82.9% | 56.4% | 29 / 35 | 14.7% | 7.8% | 14 | 0 | 1.20 / 16.0 | 72.8% | -3.8 |
| 13 | 85.7% | 100.0% | 70.3% | 35 / 35 | 14.5% | 5.4% | 11 | 0 | 0.98 / 62.8 | 84.9% | +0.8 |
| 14 | 66.5% | 77.1% | 56.6% | 27 / 35 | 13.4% | 7.2% | 11 | 0 | 1.22 / 16.9 | 76.8% | -10.4 |
| 15 | 78.3% | 94.3% | 62.0% | 33 / 35 | 14.2% | 6.4% | 12 | 0 | 1.04 / 16.5 | 74.6% | +3.7 |
| 16 | 75.2% | 88.6% | 60.8% | 31 / 35 | 12.2% | 6.3% | 11 | 0 | 1.18 / 46.3 | 79.3% | -4.1 |

Mean score share 75.8% ± 2.6, baseline 77.5% ± 2.6, paired diff -1.7 ± 3.4.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 183 over 16 battles (11.4 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.micro.Needle 0.101 | mid | 75.8% ± 2.6 | 90.2% ± 3.3 | 61.4% ± 2.1 | 505 / 560 | 14.1% ± 0.7 | 6.9% ± 0.4 | 183 | 0 | 1.24 / 99.5 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.micro.Needle 0.101 | 22674 | 26 | 22681 | 22667 (100.0%) | 7 (0.0%) | 14 (0.1%) | 1164 | 351 | 110 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.micro.Needle 0.101 | 26466 | 2088 (7.9%) | 20044 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.micro.Needle 0.101 | 650 | 424 | 506 | 647 | 41.5 / 26.2 | 1417 | 5402 | 2 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.micro.Needle 0.101 | 6.9% | 183 | 3388 | 3 | 40.4 | 2087 / 2088 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.micro.Needle 0.101 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kc.micro.Needle 0.101 | kc.micro.Needle | 1 | 35 | 296 | 7.1% | 6.0% ± 1.3 | 11.3% | 24.3% / 21.7% | 4.8% | 0 / 0 | T2/M1 | 74% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
