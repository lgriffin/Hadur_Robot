# pa3k.Viper 5.03 (lower) vs hadur2.Hadur 3.8.1

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 83.3% | 94.3% | 72.7% | 33 / 35 | 16.2% | 6.3% | 14 | 0 | 0.98 / 17.3 | 85.9% | -2.6 |
| 2 | 89.0% | 100.0% | 78.1% | 35 / 35 | 17.3% | 5.6% | 14 | 0 | 1.04 / 144.9 | 81.5% | +7.5 |
| 3 | 77.3% | 85.7% | 69.2% | 30 / 35 | 15.9% | 7.5% | 11 | 0 | 1.10 / 213.0 | 84.1% | -6.8 |
| 4 | 74.7% | 80.0% | 69.3% | 28 / 35 | 18.1% | 9.0% | 13 | 0 | 1.12 / 16.1 | 82.9% | -8.3 |
| 5 | 81.0% | 88.6% | 73.8% | 31 / 35 | 16.7% | 6.4% | 15 | 0 | 0.91 / 71.2 | 82.7% | -1.6 |
| 6 | 77.1% | 82.9% | 71.5% | 29 / 35 | 16.8% | 6.2% | 8 | 0 | 0.97 / 15.7 | 84.2% | -7.1 |
| 7 | 79.3% | 88.6% | 70.3% | 31 / 35 | 18.3% | 9.5% | 8 | 0 | 1.09 / 17.1 | 87.4% | -8.0 |
| 8 | 80.5% | 88.6% | 72.6% | 31 / 35 | 17.6% | 6.9% | 8 | 0 | 0.93 / 96.3 | 81.4% | -0.8 |
| 9 | 82.1% | 91.4% | 73.1% | 32 / 35 | 16.5% | 6.2% | 8 | 0 | 1.07 / 16.8 | 82.0% | +0.1 |
| 10 | 82.7% | 97.1% | 70.0% | 34 / 35 | 17.1% | 8.5% | 13 | 0 | 1.05 / 16.7 | 86.5% | -3.8 |
| 11 | 80.4% | 88.6% | 72.3% | 31 / 35 | 17.7% | 7.4% | 12 | 0 | 1.06 / 70.7 | 75.3% | +5.1 |
| 12 | 77.2% | 85.7% | 68.2% | 30 / 35 | 15.3% | 6.2% | 15 | 0 | 1.05 / 17.7 | 76.0% | +1.3 |
| 13 | 83.5% | 91.4% | 75.7% | 32 / 35 | 16.3% | 6.0% | 15 | 0 | 0.93 / 87.5 | 77.7% | +5.9 |
| 14 | 81.1% | 91.4% | 71.1% | 32 / 35 | 15.7% | 7.0% | 12 | 0 | 1.10 / 73.7 | 73.4% | +7.8 |
| 15 | 88.4% | 100.0% | 77.6% | 35 / 35 | 16.5% | 6.1% | 12 | 0 | 0.86 / 99.5 | 88.2% | +0.2 |
| 16 | 73.2% | 80.0% | 67.3% | 28 / 35 | 18.9% | 9.2% | 10 | 0 | 1.02 / 18.6 | 84.0% | -10.8 |

Mean score share 80.7% ± 2.3, baseline 82.1% ± 2.4, paired diff -1.4 ± 3.1.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 188 over 16 battles (11.8 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | lower | 80.7% ± 2.3 | 89.6% ± 3.3 | 72.1% ± 1.7 | 502 / 560 | 16.9% ± 0.5 | 7.1% ± 0.7 | 188 | 0 | 1.12 / 213.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 17715 | 30 | 17682 | 17677 (99.8%) | 38 (0.2%) | 5 (0.0%) | 1234 | 271 | 75 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| pa3k.Viper 5.03 | 21627 | 1474 (6.8%) | 9176 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 650 | 435 | 472 | 558 | 53.3 / 20.7 | 5622 | 8440 | 80 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 7.1% | 188 | 459 | 3 | 31.4 | 1471 / 1474 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | pa3k.Viper | 1 | 35 | 274 | 9.4% | 7.4% ± 1.6 | 16.3% | 34.0% / 31.0% | 23.8% | 0 / 0 | T3/M0 | 73% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
