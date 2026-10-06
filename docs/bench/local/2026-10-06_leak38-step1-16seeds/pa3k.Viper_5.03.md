# pa3k.Viper 5.03 (lower) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.1% | 91.4% | 71.2% | 32 / 35 | 15.5% | 6.7% | 14 | 0 | 1.15 / 150.7 | 84.1% | -3.0 |
| 2 | 85.5% | 97.1% | 73.9% | 34 / 35 | 16.1% | 5.8% | 46 | 0 | 0.94 / 111.7 | 78.1% | +7.4 |
| 3 | 81.6% | 94.3% | 69.4% | 33 / 35 | 15.5% | 6.5% | 15 | 0 | 1.12 / 122.1 | 82.9% | -1.3 |
| 4 | 80.3% | 88.6% | 72.1% | 31 / 35 | 16.4% | 6.8% | 16 | 0 | 1.09 / 17.1 | 74.3% | +6.1 |
| 5 | 79.6% | 91.4% | 68.6% | 32 / 35 | 16.9% | 9.4% | 12 | 0 | 1.14 / 17.4 | 82.2% | -2.6 |
| 6 | 83.6% | 94.3% | 74.4% | 33 / 35 | 16.1% | 7.5% | 13 | 0 | 1.14 / 16.5 | 82.5% | +1.1 |
| 7 | 82.0% | 91.4% | 72.3% | 32 / 35 | 15.7% | 6.5% | 10 | 0 | 1.06 / 17.2 | 76.8% | +5.2 |
| 8 | 81.4% | 91.4% | 71.6% | 32 / 35 | 15.5% | 6.7% | 12 | 0 | 1.14 / 108.0 | 83.1% | -1.6 |
| 9 | 73.9% | 80.0% | 68.1% | 28 / 35 | 16.7% | 7.2% | 10 | 0 | 1.16 / 16.4 | 85.6% | -11.7 |
| 10 | 83.2% | 94.3% | 72.6% | 33 / 35 | 16.3% | 7.4% | 13 | 0 | 1.12 / 34.7 | 79.8% | +3.4 |
| 11 | 80.5% | 94.3% | 67.4% | 33 / 35 | 16.0% | 6.5% | 12 | 0 | 1.10 / 17.1 | 79.1% | +1.4 |
| 12 | 82.8% | 97.1% | 69.9% | 34 / 35 | 16.7% | 7.8% | 14 | 0 | 1.08 / 17.2 | 87.7% | -4.9 |
| 13 | 70.9% | 80.0% | 62.5% | 28 / 35 | 15.8% | 8.0% | 15 | 0 | 1.14 / 112.4 | 78.5% | -7.6 |
| 14 | 83.6% | 94.3% | 73.2% | 33 / 35 | 17.1% | 6.3% | 11 | 0 | 1.09 / 60.0 | 80.1% | +3.5 |
| 15 | 79.1% | 88.6% | 70.6% | 31 / 35 | 18.1% | 9.1% | 13 | 0 | 0.95 / 130.2 | 83.5% | -4.5 |
| 16 | 84.8% | 94.3% | 75.3% | 33 / 35 | 18.3% | 6.6% | 11 | 0 | 1.06 / 139.3 | 75.9% | +8.9 |

Mean score share 80.9% ± 2.0, baseline 80.9% ± 2.0, paired diff -0.0 ± 3.0.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 237 over 16 battles (14.8 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | lower | 80.9% ± 2.0 | 91.4% ± 2.7 | 70.8% ± 1.7 | 512 / 560 | 16.4% ± 0.5 | 7.2% ± 0.5 | 237 | 0 | 1.16 / 150.7 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 18652 | 33 | 18620 | 18616 (99.8%) | 36 (0.2%) | 4 (0.0%) | 1233 | 288 | 100 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| pa3k.Viper 5.03 | 22896 | 1675 (7.3%) | 11382 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 650 | 441 | 505 | 584 | 51.9 / 21.4 | 5236 | 7951 | 64 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 7.2% | 237 | 1420 | 3 | 33.2 | 1673 / 1675 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | pa3k.Viper | 1 | 35 | 274 | 7.4% | 6.6% ± 1.6 | 15.2% | 35.3% / 30.3% | 24.7% | 0 / 0 | T2/M0 | 83% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
