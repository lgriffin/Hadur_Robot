# kinsen.nano.Quarrelet 1.0 (lower) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 76.2% | 91.4% | 59.1% | 32 / 35 | 13.8% | 5.7% | 12 | 0 | 0.89 / 16.1 | 75.7% | +0.4 |
| 2 | 80.5% | 94.3% | 66.0% | 33 / 35 | 16.1% | 5.6% | 14 | 0 | 0.91 / 15.7 | 78.0% | +2.5 |
| 3 | 76.6% | 91.4% | 61.3% | 32 / 35 | 15.7% | 6.5% | 10 | 0 | 0.94 / 15.2 | 82.6% | -5.9 |
| 4 | 78.2% | 94.3% | 61.0% | 33 / 35 | 14.8% | 5.6% | 16 | 0 | 0.96 / 14.8 | 71.9% | +6.3 |
| 5 | 73.8% | 88.6% | 58.0% | 31 / 35 | 14.0% | 5.8% | 10 | 0 | 0.93 / 16.1 | 77.7% | -4.0 |
| 6 | 77.8% | 97.1% | 57.2% | 34 / 35 | 14.3% | 6.4% | 11 | 0 | 0.95 / 15.5 | 73.7% | +4.1 |
| 7 | 82.4% | 97.1% | 65.0% | 34 / 35 | 15.1% | 4.7% | 10 | 0 | 0.91 / 15.2 | 74.0% | +8.5 |
| 8 | 77.2% | 94.3% | 58.4% | 33 / 35 | 14.5% | 5.7% | 3 | 0 | 0.88 / 14.7 | 77.3% | -0.1 |
| 9 | 83.2% | 97.1% | 67.1% | 34 / 35 | 16.6% | 5.4% | 12 | 0 | 0.91 / 13.7 | 73.8% | +9.4 |
| 10 | 79.0% | 94.3% | 60.8% | 33 / 35 | 13.7% | 4.8% | 5 | 0 | 0.85 / 16.4 | 65.8% | +13.3 |
| 11 | 66.3% | 85.7% | 46.9% | 30 / 35 | 13.0% | 6.9% | 10 | 0 | 0.98 / 15.9 | 78.4% | -12.1 |
| 12 | 74.8% | 91.4% | 57.4% | 32 / 35 | 14.5% | 6.5% | 11 | 0 | 0.96 / 15.3 | 77.1% | -2.3 |
| 13 | 77.8% | 94.3% | 60.3% | 33 / 35 | 14.7% | 5.9% | 10 | 0 | 0.95 / 15.6 | 70.8% | +7.0 |
| 14 | 75.3% | 88.6% | 60.5% | 31 / 35 | 14.0% | 5.1% | 11 | 0 | 0.96 / 13.8 | 72.8% | +2.6 |
| 15 | 78.4% | 94.3% | 60.0% | 33 / 35 | 13.7% | 5.3% | 10 | 0 | 0.90 / 14.8 | 77.0% | +1.4 |
| 16 | 81.3% | 94.3% | 66.7% | 33 / 35 | 15.6% | 5.6% | 11 | 0 | 0.85 / 16.6 | 74.0% | +7.2 |

Mean score share 77.4% ± 2.1, baseline 75.0% ± 2.1, paired diff +2.4 ± 3.4.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 166 over 16 battles (10.4 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | lower | 77.4% ± 2.1 | 93.0% ± 1.8 | 60.4% ± 2.6 | 521 / 560 | 14.6% ± 0.5 | 5.7% ± 0.3 | 166 | 0 | 0.98 / 16.6 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 13341 | 38 | 13470 | 13317 (99.8%) | 24 (0.2%) | 153 (1.1%) | 1629 | 253 | 77 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 15916 | 964 (6.1%) | 5362 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 650 | 491 | 569 | 416 | 36.0 / 23.7 | 2222 | 11037 | 8026 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 5.7% | 166 | 246 | 3 | 23.9 | 963 / 964 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | kinsen.nano.Quarrelet | 1 | 35 | 316 | 6.3% | 7.1% ± 1.9 | 13.3% | 32.9% / 28.2% | 7.3% | 0 / 0 | T3/M? | 81% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
