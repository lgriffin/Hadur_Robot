# exauge.GateKeeper 1.1.121g (lower) vs hadur2.Hadur 3.8.1

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 73.1% | 91.4% | 55.3% | 32 / 35 | 13.7% | 10.3% | 13 | 0 | 0.97 / 76.8 | 75.4% | -2.2 |
| 2 | 75.7% | 88.6% | 62.0% | 31 / 35 | 14.1% | 6.1% | 10 | 0 | 0.98 / 15.5 | 75.1% | +0.6 |
| 3 | 79.1% | 94.3% | 63.5% | 33 / 35 | 14.7% | 6.7% | 12 | 0 | 0.97 / 14.9 | 81.3% | -2.2 |
| 4 | 77.3% | 94.3% | 60.2% | 33 / 35 | 14.3% | 7.2% | 13 | 0 | 0.97 / 15.5 | 81.5% | -4.2 |
| 5 | 77.0% | 88.6% | 65.4% | 31 / 35 | 15.6% | 6.3% | 14 | 0 | 0.93 / 15.4 | 78.4% | -1.4 |
| 6 | 79.1% | 97.1% | 60.4% | 34 / 35 | 13.7% | 6.9% | 14 | 0 | 0.99 / 16.0 | 78.5% | +0.6 |
| 7 | 75.2% | 88.6% | 61.9% | 31 / 35 | 17.3% | 7.7% | 14 | 0 | 0.95 / 48.0 | 72.5% | +2.7 |
| 8 | 70.2% | 85.7% | 55.1% | 30 / 35 | 14.8% | 7.6% | 13 | 0 | 1.01 / 129.0 | 80.1% | -9.8 |
| 9 | 75.9% | 91.4% | 60.4% | 32 / 35 | 15.3% | 6.8% | 11 | 0 | 0.91 / 16.2 | 73.3% | +2.6 |
| 10 | 85.6% | 100.0% | 70.2% | 35 / 35 | 15.7% | 5.8% | 12 | 0 | 0.89 / 16.2 | 85.9% | -0.3 |
| 11 | 85.0% | 100.0% | 68.8% | 35 / 35 | 14.7% | 6.2% | 10 | 0 | 0.94 / 15.4 | 72.3% | +12.7 |
| 12 | 73.8% | 91.4% | 57.1% | 32 / 35 | 14.1% | 7.9% | 11 | 0 | 0.96 / 15.6 | 79.4% | -5.6 |
| 13 | 67.9% | 82.9% | 53.1% | 29 / 35 | 12.9% | 7.0% | 6 | 0 | 0.97 / 41.2 | 80.3% | -12.4 |
| 14 | 78.0% | 91.4% | 63.5% | 32 / 35 | 13.5% | 5.6% | 13 | 0 | 0.91 / 107.0 | 70.5% | +7.4 |
| 15 | 78.5% | 94.3% | 62.5% | 33 / 35 | 14.0% | 6.9% | 12 | 0 | 0.95 / 70.3 | 72.1% | +6.4 |
| 16 | 76.2% | 94.3% | 57.6% | 33 / 35 | 12.7% | 7.1% | 13 | 0 | 0.95 / 29.2 | 78.5% | -2.4 |

Mean score share 76.7% ± 2.4, baseline 77.2% ± 2.3, paired diff -0.5 ± 3.3.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 191 over 16 battles (11.9 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | lower | 76.7% ± 2.4 | 92.1% ± 2.5 | 61.1% ± 2.5 | 516 / 560 | 14.4% ± 0.6 | 7.0% ± 0.6 | 191 | 0 | 1.01 / 129.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 15240 | 14 | 15267 | 15176 (99.6%) | 64 (0.4%) | 91 (0.6%) | 2069 | 304 | 64 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 19601 | 978 (5.0%) | 2953 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 650 | 517 | 630 | 495 | 40.0 / 25.6 | 2169 | 7457 | 2710 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 7.0% | 191 | 5010 | 3 | 27.2 | 973 / 978 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | exauge.GateKeeper | 1 | 35 | 310 | 7.8% | 8.6% ± 1.8 | 12.0% | 29.7% / 25.2% | 23.2% | 0 / 0 | T3/M0 | 75% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
