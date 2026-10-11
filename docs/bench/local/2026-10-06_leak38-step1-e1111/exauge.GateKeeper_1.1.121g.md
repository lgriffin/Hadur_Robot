# exauge.GateKeeper 1.1.121g (lower) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 84.4% | 97.1% | 69.8% | 34 / 35 | 14.5% | 5.1% | 9 | 0 | 0.90 / 15.7 | 78.1% | +6.3 |
| 2 | 76.6% | 94.3% | 59.9% | 33 / 35 | 15.0% | 8.3% | 12 | 0 | 0.95 / 15.9 | 79.8% | -3.2 |
| 3 | 78.6% | 94.3% | 62.4% | 33 / 35 | 14.8% | 7.0% | 9 | 0 | 0.90 / 15.1 | 78.0% | +0.6 |
| 4 | 78.4% | 94.3% | 63.4% | 33 / 35 | 16.6% | 7.6% | 13 | 0 | 0.89 / 16.2 | 75.8% | +2.6 |
| 5 | 76.8% | 94.3% | 59.5% | 33 / 35 | 15.0% | 7.4% | 11 | 0 | 0.91 / 16.0 | 79.2% | -2.3 |
| 6 | 84.6% | 97.1% | 70.4% | 34 / 35 | 13.8% | 5.0% | 13 | 0 | 0.87 / 15.8 | 80.9% | +3.7 |
| 7 | 75.3% | 91.4% | 58.9% | 32 / 35 | 12.4% | 6.9% | 11 | 0 | 0.98 / 14.5 | 84.1% | -8.8 |
| 8 | 78.5% | 94.3% | 61.8% | 33 / 35 | 13.7% | 6.4% | 11 | 0 | 0.91 / 15.7 | 81.0% | -2.5 |
| 9 | 79.7% | 97.1% | 61.0% | 34 / 35 | 14.2% | 6.6% | 11 | 0 | 0.92 / 15.8 | 78.1% | +1.6 |
| 10 | 74.9% | 91.4% | 59.0% | 32 / 35 | 14.2% | 7.4% | 14 | 0 | 0.95 / 15.5 | 79.1% | -4.2 |
| 11 | 75.0% | 91.4% | 58.5% | 32 / 35 | 14.7% | 7.5% | 12 | 0 | 0.88 / 14.8 | 76.8% | -1.8 |
| 12 | 76.3% | 91.4% | 61.2% | 32 / 35 | 14.8% | 7.0% | 10 | 0 | 0.92 / 15.1 | 77.3% | -1.0 |
| 13 | 80.7% | 100.0% | 62.3% | 35 / 35 | 15.1% | 7.8% | 13 | 0 | 0.95 / 15.3 | 76.2% | +4.5 |
| 14 | 76.5% | 91.4% | 61.5% | 32 / 35 | 14.5% | 7.0% | 12 | 0 | 0.94 / 16.2 | 72.7% | +3.9 |
| 15 | 77.9% | 94.3% | 61.1% | 33 / 35 | 15.3% | 6.7% | 10 | 0 | 0.92 / 14.2 | 77.1% | +0.8 |
| 16 | 76.2% | 94.3% | 57.7% | 33 / 35 | 14.2% | 7.3% | 9 | 0 | 0.95 / 15.4 | 77.2% | -1.0 |

Mean score share 78.2% ± 1.6, baseline 78.2% ± 1.4, paired diff -0.1 ± 2.0.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 180 over 16 battles (11.3 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | lower | 78.2% ± 1.6 | 94.3% ± 1.4 | 61.8% ± 1.9 | 528 / 560 | 14.5% ± 0.5 | 6.9% ± 0.5 | 180 | 0 | 0.98 / 16.2 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 15143 | 11 | 15217 | 15106 (99.8%) | 37 (0.2%) | 111 (0.7%) | 2078 | 338 | 51 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 19288 | 1000 (5.2%) | 6344 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 650 | 507 | 606 | 489 | 40.8 / 25.3 | 2377 | 7417 | 2882 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 6.9% | 180 | 2779 | 3 | 27.2 | 996 / 1000 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | exauge.GateKeeper | 1 | 35 | 310 | 8.3% | 9.6% ± 1.9 | 12.8% | 31.5% / 28.8% | 28.0% | 0 / 0 | T3/M0 | 75% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
