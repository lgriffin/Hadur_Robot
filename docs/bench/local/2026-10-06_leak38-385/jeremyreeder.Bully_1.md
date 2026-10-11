# jeremyreeder.Bully 1 (weak) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 97.2% | 100.0% | 95.3% | 35 / 35 | 81.1% | 3.9% | 12 | 0 | 0.63 / 9.9 | 91.0% | +6.2 |
| 2 | 97.2% | 100.0% | 96.3% | 35 / 35 | 82.4% | 3.5% | 13 | 0 | 0.62 / 9.7 | 89.1% | +8.2 |
| 3 | 96.9% | 100.0% | 94.2% | 35 / 35 | 82.5% | 5.3% | 16 | 0 | 0.67 / 10.5 | 97.8% | -1.0 |
| 4 | 92.0% | 97.1% | 89.4% | 34 / 35 | 82.6% | 21.2% | 15 | 0 | 0.64 / 10.4 | 91.8% | +0.3 |
| 5 | 94.9% | 100.0% | 92.5% | 35 / 35 | 82.6% | 7.2% | 14 | 0 | 0.68 / 10.7 | 94.9% | +0.0 |
| 6 | 94.8% | 100.0% | 92.4% | 35 / 35 | 81.8% | 18.9% | 15 | 0 | 0.61 / 10.0 | 94.4% | +0.4 |
| 7 | 94.1% | 97.1% | 93.4% | 34 / 35 | 81.3% | 3.5% | 17 | 0 | 0.62 / 9.4 | 96.9% | -2.8 |
| 8 | 96.6% | 100.0% | 95.3% | 35 / 35 | 82.7% | 4.0% | 11 | 0 | 0.57 / 9.3 | 95.6% | +1.0 |
| 9 | 96.9% | 100.0% | 96.3% | 35 / 35 | 81.5% | 4.4% | 13 | 0 | 0.63 / 9.7 | 96.9% | +0.0 |
| 10 | 94.2% | 100.0% | 91.5% | 35 / 35 | 79.0% | 5.3% | 14 | 0 | 0.62 / 10.1 | 96.3% | -2.1 |
| 11 | 95.2% | 100.0% | 93.8% | 35 / 35 | 80.7% | 6.8% | 15 | 0 | 0.61 / 11.1 | 96.6% | -1.4 |
| 12 | 90.7% | 97.1% | 88.1% | 34 / 35 | 81.8% | 8.6% | 16 | 0 | 0.60 / 10.7 | 90.7% | +0.0 |
| 13 | 96.6% | 100.0% | 94.4% | 35 / 35 | 78.8% | 5.3% | 14 | 0 | 0.65 / 9.4 | 96.6% | +0.0 |
| 14 | 95.9% | 100.0% | 93.9% | 35 / 35 | 82.9% | 6.0% | 14 | 0 | 0.62 / 10.7 | 95.9% | +0.0 |
| 15 | 94.4% | 100.0% | 92.3% | 35 / 35 | 79.5% | 4.7% | 17 | 0 | 0.61 / 9.9 | 92.5% | +1.9 |
| 16 | 94.6% | 100.0% | 91.7% | 35 / 35 | 79.6% | 7.2% | 12 | 0 | 0.65 / 10.3 | 95.1% | -0.5 |

Mean score share 95.1% ± 1.0, baseline 94.5% ± 1.4, paired diff +0.6 ± 1.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 228 over 16 battles (14.3 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jeremyreeder.Bully 1 | weak | 95.1% ± 1.0 | 99.5% ± 0.6 | 93.2% ± 1.2 | 557 / 560 | 81.3% ± 0.7 | 7.2% ± 2.8 | 228 | 0 | 0.68 / 11.1 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jeremyreeder.Bully 1 | 3380 | 14 | 3324 | 3324 (98.3%) | 56 (1.7%) | 0 (0.0%) | 507 | 140 | 49 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jeremyreeder.Bully 1 | 3561 | 18 (0.5%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jeremyreeder.Bully 1 | 650 | 213 | 400 | 120 | 83.7 / 6.2 | 2922 | 6257 | 161 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jeremyreeder.Bully 1 | 7.2% | 228 | 38 | 3 | 5.9 | 18 / 18 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jeremyreeder.Bully 1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| jeremyreeder.Bully 1 | jeremyreeder.Bully | 1 | 35 | 300 | 13.0% | 2.8% ± 2.5 | 41.5% | 18.3% / 17.5% | 12.4% | 0 / 0 | T1/M? | 93% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
