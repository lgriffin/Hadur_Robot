# apv.NanoLauLectrik 1.0 (lower) vs hadur2.Hadur 3.8.1

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 72.1% | 91.4% | 54.6% | 32 / 35 | 16.0% | 7.6% | 13 | 0 | 1.12 / 113.5 | 77.5% | -5.4 |
| 2 | 75.6% | 91.4% | 60.2% | 32 / 35 | 16.3% | 6.9% | 14 | 0 | 1.06 / 15.0 | 81.1% | -5.4 |
| 3 | 80.6% | 97.1% | 63.7% | 34 / 35 | 16.1% | 6.6% | 11 | 0 | 1.02 / 16.1 | 74.0% | +6.6 |
| 4 | 76.9% | 94.3% | 59.6% | 33 / 35 | 16.0% | 8.3% | 12 | 0 | 1.06 / 14.9 | 81.6% | -4.8 |
| 5 | 77.7% | 91.4% | 63.0% | 32 / 35 | 16.3% | 5.8% | 12 | 0 | 0.98 / 20.5 | 72.7% | +4.9 |
| 6 | 74.1% | 88.6% | 57.7% | 31 / 35 | 13.5% | 5.0% | 16 | 0 | 1.08 / 15.0 | 82.3% | -8.2 |
| 7 | 83.3% | 100.0% | 64.5% | 35 / 35 | 14.3% | 5.5% | 11 | 0 | 1.04 / 15.5 | 80.1% | +3.1 |
| 8 | 81.3% | 97.1% | 63.9% | 34 / 35 | 15.6% | 5.5% | 9 | 0 | 0.99 / 15.7 | 82.6% | -1.4 |
| 9 | 81.0% | 94.3% | 65.4% | 33 / 35 | 14.3% | 4.9% | 10 | 0 | 1.02 / 15.5 | 80.7% | +0.3 |
| 10 | 82.7% | 100.0% | 62.9% | 35 / 35 | 14.9% | 5.4% | 12 | 0 | 1.05 / 170.4 | 82.8% | -0.1 |
| 11 | 81.8% | 97.1% | 64.9% | 34 / 35 | 15.4% | 5.5% | 13 | 0 | 1.05 / 66.2 | 81.3% | +0.5 |
| 12 | 82.3% | 94.3% | 68.7% | 33 / 35 | 15.3% | 5.0% | 11 | 0 | 1.00 / 15.7 | 74.8% | +7.6 |
| 13 | 78.5% | 91.4% | 64.6% | 32 / 35 | 16.7% | 5.6% | 17 | 0 | 0.97 / 66.2 | 78.8% | -0.3 |
| 14 | 81.3% | 97.1% | 63.7% | 34 / 35 | 15.0% | 5.4% | 12 | 0 | 1.01 / 102.3 | 75.1% | +6.3 |
| 15 | 70.6% | 85.7% | 56.2% | 30 / 35 | 16.1% | 6.9% | 10 | 0 | 1.06 / 16.3 | 79.0% | -8.4 |
| 16 | 78.6% | 94.3% | 61.9% | 33 / 35 | 15.2% | 5.8% | 14 | 0 | 1.02 / 166.5 | 77.2% | +1.4 |

Mean score share 78.6% ± 2.1, baseline 78.9% ± 1.8, paired diff -0.2 ± 2.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 197 over 16 battles (12.3 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | lower | 78.6% ± 2.1 | 94.1% ± 2.1 | 62.2% ± 2.0 | 527 / 560 | 15.4% ± 0.5 | 6.0% ± 0.5 | 197 | 0 | 1.12 / 170.4 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 12915 | 37 | 12938 | 12906 (99.9%) | 9 (0.1%) | 32 (0.2%) | 1204 | 218 | 116 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 15284 | 1106 (7.2%) | 4675 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 650 | 471 | 570 | 403 | 38.8 / 23.7 | 2672 | 11087 | 6100 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 6.0% | 197 | 87 | 3 | 23.1 | 1105 / 1106 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | apv.NanoLauLectrik | 1 | 35 | 304 | 7.2% | 8.6% ± 2.1 | 14.0% | 33.5% / 29.7% | 10.6% | 0 / 0 | T3/M? | 77% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
