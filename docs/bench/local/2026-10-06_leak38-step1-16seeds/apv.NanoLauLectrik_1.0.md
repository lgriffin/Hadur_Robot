# apv.NanoLauLectrik 1.0 (lower) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 83.1% | 97.1% | 67.8% | 34 / 35 | 17.7% | 5.4% | 9 | 0 | 1.02 / 14.9 | 83.2% | -0.1 |
| 2 | 78.9% | 97.1% | 60.1% | 34 / 35 | 15.3% | 6.4% | 13 | 0 | 1.12 / 15.0 | 79.1% | -0.2 |
| 3 | 78.9% | 94.3% | 63.1% | 33 / 35 | 16.9% | 6.2% | 6 | 0 | 1.04 / 15.2 | 80.1% | -1.2 |
| 4 | 78.5% | 94.3% | 61.4% | 33 / 35 | 14.6% | 5.9% | 11 | 0 | 1.10 / 48.4 | 84.5% | -6.0 |
| 5 | 80.2% | 94.3% | 64.3% | 33 / 35 | 14.3% | 5.1% | 15 | 0 | 1.09 / 15.5 | 76.8% | +3.4 |
| 6 | 79.6% | 94.3% | 62.5% | 33 / 35 | 13.7% | 5.1% | 11 | 0 | 1.12 / 17.0 | 82.4% | -2.8 |
| 7 | 83.5% | 97.1% | 68.3% | 34 / 35 | 16.3% | 5.3% | 15 | 0 | 1.12 / 15.6 | 72.8% | +10.7 |
| 8 | 83.2% | 94.3% | 70.6% | 33 / 35 | 16.1% | 4.2% | 10 | 0 | 1.05 / 14.8 | 76.5% | +6.7 |
| 9 | 86.9% | 100.0% | 72.2% | 35 / 35 | 17.5% | 5.2% | 12 | 0 | 0.98 / 17.0 | 82.8% | +4.0 |
| 10 | 80.9% | 97.1% | 62.3% | 34 / 35 | 14.5% | 5.7% | 14 | 0 | 1.11 / 15.4 | 79.4% | +1.5 |
| 11 | 82.0% | 97.1% | 65.7% | 34 / 35 | 15.8% | 5.9% | 14 | 0 | 1.14 / 15.8 | 83.0% | -0.9 |
| 12 | 80.1% | 91.4% | 67.9% | 32 / 35 | 17.9% | 4.8% | 13 | 0 | 1.07 / 53.2 | 84.9% | -4.9 |
| 13 | 83.4% | 100.0% | 65.1% | 35 / 35 | 15.9% | 5.9% | 12 | 0 | 1.13 / 15.7 | 81.5% | +1.9 |
| 14 | 77.9% | 94.3% | 61.1% | 33 / 35 | 15.6% | 6.9% | 15 | 0 | 1.09 / 15.7 | 76.6% | +1.2 |
| 15 | 79.8% | 94.3% | 63.8% | 33 / 35 | 15.7% | 5.5% | 43 | 0 | 1.07 / 15.4 | 74.7% | +5.1 |
| 16 | 77.1% | 91.4% | 61.1% | 32 / 35 | 14.1% | 5.2% | 10 | 0 | 1.13 / 15.8 | 82.8% | -5.7 |

Mean score share 80.9% ± 1.4, baseline 80.1% ± 2.0, paired diff +0.8 ± 2.4.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 223 over 16 battles (13.9 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | lower | 80.9% ± 1.4 | 95.5% ± 1.4 | 64.8% ± 1.9 | 535 / 560 | 15.7% ± 0.7 | 5.5% ± 0.4 | 223 | 0 | 1.14 / 53.2 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 12621 | 32 | 12627 | 12599 (99.8%) | 22 (0.2%) | 28 (0.2%) | 1290 | 246 | 68 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 14859 | 1071 (7.2%) | 7132 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 650 | 465 | 500 | 396 | 39.6 / 21.5 | 3083 | 11325 | 7453 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 5.5% | 223 | 333 | 3 | 22.5 | 1069 / 1071 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | apv.NanoLauLectrik | 1 | 35 | 304 | 7.1% | 8.2% ± 2.0 | 12.9% | 32.1% / 32.2% | 9.1% | 0 / 0 | T3/M0 | 75% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
