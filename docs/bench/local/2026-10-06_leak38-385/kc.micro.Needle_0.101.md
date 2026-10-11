# kc.micro.Needle 0.101 (mid) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 78.9% | 94.3% | 63.8% | 33 / 35 | 14.7% | 6.8% | 14 | 0 | 1.27 / 17.3 | 67.6% | +11.2 |
| 2 | 81.4% | 97.1% | 65.5% | 34 / 35 | 15.3% | 6.5% | 11 | 0 | 1.24 / 15.8 | 82.7% | -1.3 |
| 3 | 78.3% | 97.1% | 58.0% | 34 / 35 | 12.2% | 6.6% | 13 | 0 | 1.32 / 16.5 | 74.1% | +4.2 |
| 4 | 76.2% | 88.6% | 63.1% | 31 / 35 | 14.3% | 6.4% | 14 | 0 | 1.16 / 16.9 | 81.4% | -5.3 |
| 5 | 72.1% | 85.7% | 58.7% | 30 / 35 | 14.4% | 6.8% | 7 | 0 | 1.25 / 15.7 | 79.0% | -6.9 |
| 6 | 76.1% | 91.4% | 61.3% | 32 / 35 | 13.3% | 23.6% | 22 | 0 | 1.24 / 16.5 | 76.7% | -0.6 |
| 7 | 79.9% | 97.1% | 61.5% | 34 / 35 | 13.2% | 6.9% | 10 | 0 | 1.30 / 16.9 | 82.9% | -3.0 |
| 8 | 74.2% | 91.4% | 58.5% | 32 / 35 | 14.5% | 8.6% | 16 | 0 | 1.27 / 16.2 | 80.4% | -6.2 |
| 9 | 73.2% | 85.7% | 61.3% | 30 / 35 | 13.6% | 7.2% | 12 | 0 | 1.23 / 16.3 | 80.7% | -7.5 |
| 10 | 83.9% | 97.1% | 70.1% | 34 / 35 | 14.8% | 5.9% | 17 | 0 | 1.16 / 16.2 | 80.7% | +3.2 |
| 11 | 78.4% | 94.3% | 61.6% | 33 / 35 | 14.3% | 6.2% | 15 | 0 | 1.29 / 15.7 | 67.9% | +10.5 |
| 12 | 76.3% | 91.4% | 61.5% | 32 / 35 | 14.1% | 7.4% | 14 | 0 | 1.16 / 16.6 | 70.8% | +5.5 |
| 13 | 74.8% | 91.4% | 59.2% | 32 / 35 | 13.7% | 7.6% | 11 | 0 | 1.27 / 16.7 | 79.3% | -4.5 |
| 14 | 81.6% | 97.1% | 64.3% | 34 / 35 | 13.3% | 5.5% | 11 | 0 | 1.09 / 15.6 | 74.8% | +6.8 |
| 15 | 76.1% | 88.6% | 63.6% | 31 / 35 | 13.2% | 6.7% | 17 | 0 | 1.22 / 15.5 | 81.0% | -4.9 |
| 16 | 74.7% | 91.4% | 56.3% | 32 / 35 | 12.4% | 6.0% | 15 | 0 | 1.24 / 16.8 | 74.9% | -0.2 |

Mean score share 77.3% ± 1.8, baseline 77.2% ± 2.7, paired diff +0.1 ± 3.3.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 219 over 16 battles (13.7 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.micro.Needle 0.101 | mid | 77.3% ± 1.8 | 92.5% ± 2.1 | 61.8% ± 1.8 | 518 / 560 | 13.8% ± 0.5 | 7.8% ± 2.3 | 219 | 0 | 1.32 / 17.3 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.micro.Needle 0.101 | 22699 | 12 | 22635 | 22607 (99.6%) | 92 (0.4%) | 28 (0.1%) | 1161 | 335 | 70 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.micro.Needle 0.101 | 26606 | 2031 (7.6%) | 22806 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.micro.Needle 0.101 | 650 | 429 | 530 | 653 | 41.2 / 25.5 | 1287 | 6120 | 6 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.micro.Needle 0.101 | 7.8% | 219 | 2777 | 3 | 40.2 | 2021 / 2031 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.micro.Needle 0.101 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kc.micro.Needle 0.101 | kc.micro.Needle | 1 | 35 | 296 | 7.0% | 6.1% ± 1.3 | 11.5% | 25.1% / 21.2% | 4.5% | 0 / 0 | T2/M0 | 74% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
