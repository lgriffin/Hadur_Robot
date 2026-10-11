# nz.jdc.nano.AralR 1.1 (lower) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 87.2% | 97.1% | 78.6% | 34 / 35 | 21.7% | 10.4% | 10 | 0 | 0.76 / 14.5 | 89.2% | -2.0 |
| 2 | 91.4% | 100.0% | 83.7% | 35 / 35 | 20.7% | 8.3% | 13 | 0 | 0.70 / 15.3 | 87.0% | +4.4 |
| 3 | 90.7% | 100.0% | 82.5% | 35 / 35 | 23.0% | 8.8% | 8 | 0 | 0.74 / 13.8 | 90.1% | +0.6 |
| 4 | 85.5% | 94.3% | 77.7% | 33 / 35 | 21.5% | 10.2% | 14 | 0 | 0.79 / 15.3 | 91.3% | -5.8 |
| 5 | 88.6% | 100.0% | 79.0% | 35 / 35 | 21.8% | 10.4% | 11 | 0 | 0.75 / 14.8 | 90.1% | -1.5 |
| 6 | 90.6% | 100.0% | 82.3% | 35 / 35 | 21.3% | 8.2% | 13 | 0 | 0.70 / 15.2 | 87.8% | +2.8 |
| 7 | 90.3% | 97.1% | 84.0% | 34 / 35 | 21.9% | 8.5% | 10 | 0 | 0.74 / 15.0 | 90.7% | -0.4 |
| 8 | 91.4% | 100.0% | 83.6% | 35 / 35 | 21.9% | 7.4% | 10 | 0 | 0.70 / 14.8 | 91.5% | -0.0 |
| 9 | 93.0% | 100.0% | 86.7% | 35 / 35 | 23.1% | 7.5% | 11 | 0 | 0.71 / 14.1 | 89.2% | +3.8 |
| 10 | 88.8% | 97.1% | 81.7% | 34 / 35 | 23.2% | 9.3% | 14 | 0 | 0.74 / 14.8 | 91.6% | -2.8 |
| 11 | 87.1% | 97.1% | 78.7% | 34 / 35 | 21.7% | 10.9% | 11 | 0 | 0.82 / 16.2 | 88.8% | -1.6 |
| 12 | 89.0% | 97.1% | 81.6% | 34 / 35 | 21.4% | 8.9% | 11 | 0 | 0.68 / 14.7 | 92.2% | -3.3 |
| 13 | 89.4% | 100.0% | 80.3% | 35 / 35 | 21.9% | 9.0% | 11 | 0 | 0.74 / 16.5 | 89.7% | -0.3 |
| 14 | 86.7% | 94.3% | 79.7% | 33 / 35 | 21.0% | 10.1% | 11 | 0 | 0.88 / 16.3 | 90.6% | -4.0 |
| 15 | 88.5% | 97.1% | 80.7% | 34 / 35 | 21.1% | 9.5% | 11 | 0 | 0.76 / 38.9 | 90.4% | -1.9 |
| 16 | 89.6% | 100.0% | 80.8% | 35 / 35 | 23.5% | 10.4% | 11 | 0 | 0.79 / 15.8 | 90.8% | -1.2 |

Mean score share 89.3% ± 1.1, baseline 90.1% ± 0.8, paired diff -0.8 ± 1.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 180 over 16 battles (11.3 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | lower | 89.3% ± 1.1 | 98.2% ± 1.1 | 81.4% ± 1.3 | 550 / 560 | 21.9% ± 0.4 | 9.2% ± 0.6 | 180 | 0 | 0.88 / 38.9 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | 14574 | 55 | 14610 | 14487 (99.4%) | 87 (0.6%) | 123 (0.8%) | 1005 | 286 | 54 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | 13018 | 1040 (8.0%) | 6864 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | 650 | 328 | 423 | 381 | 69.1 / 15.9 | 8388 | 7866 | 2330 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | 9.2% | 180 | 987 | 3 | 26.1 | 1039 / 1040 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| nz.jdc.nano.AralR 1.1 | nz.jdc.nano.AralR | 1 | 35 | 300 | 11.5% | 6.6% ± 1.8 | 19.1% | 24.7% / 28.9% | 3.8% | 0 / 0 | T2/M? | 88% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
