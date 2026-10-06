# exauge.GateKeeper 1.1.121g (lower) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 77.1% | 94.3% | 59.6% | 33 / 35 | 14.1% | 23.9% | 23 | 0 | 1.06 / 16.0 | 80.9% | -3.9 |
| 2 | 72.6% | 88.6% | 58.1% | 31 / 35 | 15.6% | 8.9% | 19 | 0 | 1.09 / 15.5 | 75.1% | -2.5 |
| 3 | 74.4% | 91.4% | 57.4% | 32 / 35 | 15.4% | 7.4% | 20 | 0 | 1.10 / 16.5 | 78.5% | -4.1 |
| 4 | 77.2% | 88.6% | 66.4% | 31 / 35 | 16.7% | 7.5% | 19 | 0 | 1.03 / 15.4 | 77.9% | -0.7 |
| 5 | 78.7% | 91.4% | 65.7% | 32 / 35 | 16.4% | 7.8% | 17 | 0 | 1.07 / 14.9 | 77.8% | +0.9 |
| 6 | 71.7% | 85.7% | 58.5% | 30 / 35 | 15.8% | 18.9% | 23 | 0 | 1.10 / 15.7 | 78.3% | -6.6 |
| 7 | 75.9% | 88.6% | 63.4% | 31 / 35 | 17.7% | 10.1% | 23 | 0 | 1.02 / 17.2 | 79.7% | -3.8 |
| 8 | 82.3% | 100.0% | 63.4% | 35 / 35 | 14.0% | 6.5% | 22 | 0 | 1.07 / 17.6 | 80.5% | +1.8 |
| 9 | 74.4% | 88.6% | 60.2% | 31 / 35 | 15.3% | 6.6% | 18 | 0 | 1.00 / 16.8 | 83.3% | -8.9 |
| 10 | 78.0% | 94.3% | 61.8% | 33 / 35 | 14.7% | 7.3% | 21 | 0 | 1.10 / 16.0 | 78.8% | -0.8 |
| 11 | 80.7% | 94.3% | 66.1% | 33 / 35 | 15.1% | 6.5% | 19 | 0 | 1.04 / 15.7 | 76.2% | +4.5 |
| 12 | 71.8% | 85.7% | 57.6% | 30 / 35 | 13.7% | 17.7% | 19 | 0 | 1.07 / 16.6 | 74.6% | -2.8 |
| 13 | 76.2% | 91.4% | 59.8% | 32 / 35 | 13.3% | 5.9% | 10 | 0 | 0.98 / 15.5 | 75.0% | +1.2 |
| 14 | 76.9% | 94.3% | 58.5% | 33 / 35 | 13.6% | 23.0% | 17 | 0 | 0.95 / 16.7 | 70.9% | +6.0 |
| 15 | 80.7% | 94.3% | 65.1% | 33 / 35 | 14.5% | 6.7% | 15 | 0 | 1.01 / 14.8 | 76.0% | +4.7 |
| 16 | 84.9% | 97.1% | 70.8% | 34 / 35 | 15.3% | 5.6% | 15 | 0 | 0.91 / 15.5 | 73.8% | +11.1 |

Mean score share 77.1% ± 2.0, baseline 77.3% ± 1.7, paired diff -0.2 ± 2.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 300 over 16 battles (18.8 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | lower | 77.1% ± 2.0 | 91.8% ± 2.1 | 62.0% ± 2.1 | 514 / 560 | 15.1% ± 0.6 | 10.6% ± 3.4 | 300 | 0 | 1.10 / 17.6 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 14982 | 19 | 14817 | 14699 (98.1%) | 283 (1.9%) | 118 (0.8%) | 2013 | 298 | 181 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 19347 | 966 (5.0%) | 5195 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 650 | 504 | 542 | 489 | 40.8 / 25.0 | 2420 | 6790 | 2689 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 10.6% | 300 | 4404 | 3 | 26.4 | 946 / 966 (98%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | exauge.GateKeeper | 1 | 35 | 310 | 5.9% | 6.4% ± 1.7 | 12.8% | 31.6% / 28.7% | 27.0% | 0 / 0 | T2/M0 | 84% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
