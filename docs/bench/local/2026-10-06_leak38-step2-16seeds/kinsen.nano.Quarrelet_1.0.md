# kinsen.nano.Quarrelet 1.0 (lower) vs hadur2.Hadur 3.8.1

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 77.1% | 91.4% | 61.4% | 32 / 35 | 14.3% | 5.9% | 11 | 0 | 0.93 / 57.7 | 81.0% | -3.9 |
| 2 | 81.7% | 97.1% | 64.8% | 34 / 35 | 14.3% | 5.3% | 11 | 0 | 0.92 / 14.0 | 79.2% | +2.5 |
| 3 | 67.7% | 80.0% | 56.1% | 28 / 35 | 15.3% | 7.0% | 16 | 0 | 0.99 / 14.3 | 80.7% | -13.0 |
| 4 | 73.8% | 88.6% | 57.5% | 31 / 35 | 13.6% | 5.9% | 7 | 0 | 0.95 / 15.0 | 79.8% | -6.1 |
| 5 | 71.3% | 88.6% | 54.4% | 31 / 35 | 14.4% | 8.8% | 15 | 0 | 0.98 / 30.7 | 83.0% | -11.7 |
| 6 | 76.7% | 94.3% | 58.5% | 33 / 35 | 14.5% | 6.8% | 17 | 0 | 0.96 / 14.5 | 78.2% | -1.5 |
| 7 | 84.8% | 100.0% | 68.7% | 35 / 35 | 17.9% | 5.8% | 14 | 0 | 0.96 / 15.1 | 77.2% | +7.6 |
| 8 | 76.0% | 88.6% | 62.8% | 31 / 35 | 14.6% | 5.7% | 14 | 0 | 0.92 / 15.1 | 76.3% | -0.3 |
| 9 | 80.7% | 91.4% | 68.8% | 32 / 35 | 16.2% | 4.7% | 10 | 0 | 0.95 / 18.5 | 81.9% | -1.2 |
| 10 | 78.2% | 91.4% | 63.5% | 32 / 35 | 16.4% | 5.3% | 13 | 0 | 0.95 / 14.8 | 78.8% | -0.6 |
| 11 | 71.7% | 85.7% | 57.4% | 30 / 35 | 14.9% | 5.9% | 4 | 0 | 0.97 / 66.6 | 77.7% | -6.1 |
| 12 | 82.1% | 97.1% | 65.5% | 34 / 35 | 15.9% | 5.2% | 38 | 0 | 0.92 / 14.8 | 74.7% | +7.5 |
| 13 | 72.2% | 91.4% | 53.3% | 32 / 35 | 14.1% | 7.7% | 13 | 0 | 1.01 / 18.2 | 78.8% | -6.6 |
| 14 | 78.1% | 94.3% | 61.3% | 33 / 35 | 15.3% | 6.0% | 13 | 0 | 0.98 / 14.3 | 77.3% | +0.8 |
| 15 | 77.0% | 88.6% | 65.0% | 31 / 35 | 17.4% | 7.0% | 17 | 0 | 0.94 / 14.7 | 79.6% | -2.6 |
| 16 | 77.2% | 91.4% | 61.9% | 32 / 35 | 15.4% | 5.5% | 14 | 0 | 0.99 / 13.5 | 80.7% | -3.5 |

Mean score share 76.6% ± 2.4, baseline 79.1% ± 1.1, paired diff -2.4 ± 3.0.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 227 over 16 battles (14.2 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | lower | 76.6% ± 2.4 | 91.2% ± 2.6 | 61.3% ± 2.5 | 511 / 560 | 15.3% ± 0.6 | 6.2% ± 0.6 | 227 | 0 | 1.01 / 66.6 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 12891 | 38 | 12908 | 12764 (99.0%) | 127 (1.0%) | 144 (1.1%) | 1667 | 265 | 237 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 15204 | 872 (5.7%) | 2641 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 650 | 490 | 534 | 401 | 37.8 / 23.9 | 2597 | 11866 | 7736 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 6.2% | 227 | 840 | 3 | 22.9 | 862 / 872 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | kinsen.nano.Quarrelet | 1 | 35 | 316 | 7.2% | 9.3% ± 2.1 | 14.0% | 35.6% / 29.5% | 7.2% | 0 / 0 | T3/M? | 76% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
