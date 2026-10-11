# ntw.Sighup 1.5 (weak) vs hadur2.Hadur 3.8.1

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 92.3% | 100.0% | 84.5% | 35 / 35 | 27.8% | 5.3% | 12 | 0 | 0.77 / 14.7 | 86.9% | +5.4 |
| 2 | 91.9% | 100.0% | 84.3% | 35 / 35 | 30.8% | 6.9% | 14 | 0 | 0.78 / 15.8 | 89.7% | +2.1 |
| 3 | 89.5% | 97.1% | 82.5% | 34 / 35 | 27.0% | 7.8% | 12 | 0 | 0.77 / 17.3 | 93.5% | -3.9 |
| 4 | 92.4% | 100.0% | 84.6% | 35 / 35 | 28.4% | 6.0% | 14 | 0 | 0.74 / 16.0 | 85.1% | +7.3 |
| 5 | 91.6% | 100.0% | 83.3% | 35 / 35 | 27.9% | 5.8% | 16 | 0 | 0.81 / 14.8 | 89.2% | +2.5 |
| 6 | 92.9% | 100.0% | 85.4% | 35 / 35 | 25.2% | 5.4% | 12 | 0 | 0.84 / 14.2 | 92.2% | +0.7 |
| 7 | 90.9% | 100.0% | 82.0% | 35 / 35 | 30.1% | 7.5% | 12 | 0 | 0.78 / 17.0 | 92.3% | -1.4 |
| 8 | 91.2% | 97.1% | 86.7% | 34 / 35 | 30.6% | 5.9% | 14 | 0 | 0.79 / 17.3 | 89.6% | +1.6 |
| 9 | 93.9% | 100.0% | 87.3% | 35 / 35 | 24.8% | 3.6% | 12 | 0 | 0.76 / 15.5 | 88.1% | +5.9 |
| 10 | 91.8% | 100.0% | 83.3% | 35 / 35 | 26.1% | 7.0% | 12 | 0 | 0.75 / 16.2 | 90.9% | +0.9 |
| 11 | 93.8% | 100.0% | 87.6% | 35 / 35 | 28.7% | 4.1% | 12 | 0 | 0.72 / 15.0 | 91.7% | +2.1 |
| 12 | 90.3% | 97.1% | 83.0% | 34 / 35 | 22.4% | 4.4% | 13 | 0 | 0.74 / 15.4 | 92.4% | -2.1 |
| 13 | 90.6% | 100.0% | 81.7% | 35 / 35 | 27.1% | 6.7% | 12 | 0 | 0.70 / 27.2 | 93.2% | -2.6 |
| 14 | 92.8% | 100.0% | 85.4% | 35 / 35 | 26.9% | 5.1% | 13 | 0 | 0.80 / 16.1 | 90.8% | +2.0 |
| 15 | 86.4% | 94.3% | 80.0% | 33 / 35 | 27.6% | 9.7% | 16 | 0 | 0.80 / 15.3 | 89.7% | -3.3 |
| 16 | 91.7% | 100.0% | 83.3% | 35 / 35 | 24.6% | 5.9% | 15 | 0 | 0.74 / 15.5 | 90.3% | +1.4 |

Mean score share 91.5% ± 1.0, baseline 90.4% ± 1.2, paired diff +1.2 ± 1.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 211 over 16 battles (13.2 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | weak | 91.5% ± 1.0 | 99.1% ± 0.9 | 84.0% ± 1.1 | 555 / 560 | 27.2% ± 1.2 | 6.1% ± 0.8 | 211 | 0 | 0.84 / 27.2 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 8934 | 40 | 8880 | 8842 (99.0%) | 92 (1.0%) | 38 (0.4%) | 2267 | 256 | 51 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ntw.Sighup 1.5 | 9580 | 442 (4.6%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 650 | 379 | 400 | 283 | 59.7 / 11.4 | 6412 | 7444 | 1711 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 6.1% | 211 | 70 | 3 | 15.8 | 437 / 442 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ntw.Sighup 1.5 | ntw.Sighup | 1 | 35 | 272 | 6.6% | 5.6% ± 2.0 | 18.0% | 32.9% / 29.9% | 15.3% | 0 / 0 | T2/M? | 92% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
