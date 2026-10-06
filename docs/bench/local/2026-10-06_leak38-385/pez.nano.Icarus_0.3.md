# pez.nano.Icarus 0.3 (weak) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 98.0% | 100.0% | 95.1% | 35 / 35 | 16.3% | 1.2% | 14 | 0 | 0.69 / 15.7 | 97.8% | +0.1 |
| 2 | 97.8% | 100.0% | 94.9% | 35 / 35 | 17.0% | 2.0% | 16 | 0 | 0.71 / 15.9 | 97.3% | +0.6 |
| 3 | 97.4% | 100.0% | 93.6% | 35 / 35 | 15.6% | 1.3% | 9 | 0 | 0.70 / 15.3 | 96.5% | +0.9 |
| 4 | 98.3% | 100.0% | 95.9% | 35 / 35 | 16.1% | 1.1% | 13 | 0 | 0.72 / 16.3 | 97.4% | +1.0 |
| 5 | 99.2% | 100.0% | 98.1% | 35 / 35 | 16.4% | 0.4% | 14 | 0 | 0.70 / 15.8 | 95.3% | +3.9 |
| 6 | 98.5% | 100.0% | 96.4% | 35 / 35 | 15.8% | 1.2% | 14 | 0 | 0.72 / 15.1 | 96.8% | +1.7 |
| 7 | 98.3% | 100.0% | 96.0% | 35 / 35 | 18.6% | 1.0% | 14 | 0 | 0.71 / 15.4 | 97.0% | +1.3 |
| 8 | 96.1% | 100.0% | 90.5% | 35 / 35 | 15.5% | 1.5% | 13 | 0 | 0.78 / 15.7 | 95.9% | +0.2 |
| 9 | 97.8% | 100.0% | 94.8% | 35 / 35 | 17.6% | 1.4% | 12 | 0 | 0.70 / 16.5 | 94.9% | +2.9 |
| 10 | 96.8% | 100.0% | 92.4% | 35 / 35 | 16.3% | 1.6% | 17 | 0 | 0.68 / 14.8 | 94.0% | +2.8 |
| 11 | 97.3% | 100.0% | 93.6% | 35 / 35 | 18.1% | 1.6% | 12 | 0 | 0.70 / 15.8 | 96.6% | +0.6 |
| 12 | 97.1% | 100.0% | 93.1% | 35 / 35 | 16.7% | 2.4% | 13 | 0 | 0.73 / 21.0 | 96.8% | +0.3 |
| 13 | 94.6% | 97.1% | 91.1% | 34 / 35 | 16.2% | 2.0% | 15 | 0 | 0.77 / 16.9 | 93.1% | +1.4 |
| 14 | 97.0% | 100.0% | 93.4% | 35 / 35 | 20.4% | 2.1% | 19 | 0 | 0.71 / 17.4 | 96.3% | +0.8 |
| 15 | 98.0% | 100.0% | 95.1% | 35 / 35 | 16.7% | 1.1% | 16 | 0 | 0.70 / 16.8 | 97.3% | +0.7 |
| 16 | 97.7% | 100.0% | 94.6% | 35 / 35 | 17.5% | 1.7% | 18 | 0 | 0.69 / 15.1 | 96.8% | +0.9 |

Mean score share 97.5% ± 0.6, baseline 96.2% ± 0.7, paired diff +1.3 ± 0.6.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 229 over 16 battles (14.3 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pez.nano.Icarus 0.3 | weak | 97.5% ± 0.6 | 99.8% ± 0.4 | 94.3% ± 1.0 | 559 / 560 | 16.9% ± 0.7 | 1.5% ± 0.3 | 229 | 0 | 0.78 / 21.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| pez.nano.Icarus 0.3 | 14355 | 32 | 14239 | 14190 (98.9%) | 165 (1.1%) | 49 (0.3%) | 1168 | 259 | 248 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| pez.nano.Icarus 0.3 | 14237 | 1008 (7.1%) | 5096 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| pez.nano.Icarus 0.3 | 650 | 355 | 400 | 393 | 47.3 / 2.9 | 3881 | 10946 | 3764 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| pez.nano.Icarus 0.3 | 1.5% | 229 | 73 | 3 | 25.4 | 997 / 1008 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| pez.nano.Icarus 0.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| pez.nano.Icarus 0.3 | pez.nano.Icarus | 1 | 35 | 292 | 1.6% | 1.2% ± 0.8 | 15.8% | 25.3% / 22.9% | 6.6% | 0 / 0 | T0/M? | 98% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
