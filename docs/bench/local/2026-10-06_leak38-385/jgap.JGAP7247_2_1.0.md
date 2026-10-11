# jgap.JGAP7247_2 1.0 (weak) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 96.2% | 100.0% | 92.2% | 35 / 35 | 36.7% | 5.8% | 15 | 0 | 0.78 / 9.2 | 94.6% | +1.5 |
| 2 | 94.6% | 100.0% | 89.3% | 35 / 35 | 37.4% | 3.2% | 17 | 0 | 0.81 / 9.7 | 94.8% | -0.2 |
| 3 | 94.9% | 100.0% | 89.8% | 35 / 35 | 36.6% | 3.5% | 16 | 0 | 0.86 / 11.6 | 95.6% | -0.7 |
| 4 | 97.1% | 100.0% | 94.0% | 35 / 35 | 35.5% | 1.7% | 18 | 0 | 0.85 / 10.2 | 96.8% | +0.3 |
| 5 | 96.3% | 100.0% | 92.6% | 35 / 35 | 41.9% | 3.2% | 17 | 0 | 0.89 / 10.5 | 95.9% | +0.3 |
| 6 | 94.4% | 100.0% | 89.0% | 35 / 35 | 38.3% | 4.2% | 18 | 0 | 0.91 / 10.7 | 94.7% | -0.3 |
| 7 | 96.3% | 100.0% | 92.5% | 35 / 35 | 39.5% | 8.0% | 20 | 0 | 0.79 / 10.6 | 94.8% | +1.4 |
| 8 | 94.4% | 100.0% | 88.7% | 35 / 35 | 36.3% | 3.7% | 16 | 0 | 0.89 / 12.8 | 95.3% | -1.0 |
| 9 | 96.5% | 100.0% | 92.8% | 35 / 35 | 36.1% | 2.4% | 13 | 0 | 0.88 / 10.8 | 95.2% | +1.3 |
| 10 | 96.3% | 100.0% | 92.5% | 35 / 35 | 37.8% | 5.2% | 18 | 0 | 0.82 / 10.0 | 95.2% | +1.1 |
| 11 | 97.4% | 100.0% | 94.6% | 35 / 35 | 35.4% | 1.7% | 15 | 0 | 0.91 / 15.5 | 98.7% | -1.3 |
| 12 | 93.8% | 100.0% | 87.8% | 35 / 35 | 37.7% | 4.3% | 20 | 0 | 0.93 / 10.0 | 94.5% | -0.6 |
| 13 | 94.7% | 100.0% | 89.4% | 35 / 35 | 37.9% | 4.9% | 18 | 0 | 0.93 / 10.8 | 94.5% | +0.2 |
| 14 | 96.9% | 100.0% | 93.8% | 35 / 35 | 38.9% | 7.4% | 18 | 0 | 0.92 / 10.4 | 95.1% | +1.9 |
| 15 | 94.8% | 100.0% | 89.6% | 35 / 35 | 38.9% | 4.1% | 21 | 0 | 0.86 / 12.4 | 96.5% | -1.8 |
| 16 | 96.5% | 100.0% | 92.9% | 35 / 35 | 39.8% | 3.0% | 22 | 0 | 0.90 / 11.1 | 95.6% | +0.9 |

Mean score share 95.7% ± 0.6, baseline 95.5% ± 0.6, paired diff +0.2 ± 0.6.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 282 over 16 battles (17.6 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jgap.JGAP7247_2 1.0 | weak | 95.7% ± 0.6 | 100.0% ± 0.0 | 91.3% ± 1.2 | 560 / 560 | 37.8% ± 0.9 | 4.1% ± 1.0 | 282 | 0 | 0.93 / 15.5 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jgap.JGAP7247_2 1.0 | 5115 | 24 | 5230 | 4947 (96.7%) | 168 (3.3%) | 283 (5.4%) | 2596 | 243 | 50 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jgap.JGAP7247_2 1.0 | 6904 | 294 (4.3%) | 394 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jgap.JGAP7247_2 1.0 | 650 | 440 | 400 | 211 | 65.8 / 6.3 | 4721 | 5507 | 3300 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jgap.JGAP7247_2 1.0 | 4.1% | 282 | 65 | 3 | 9.3 | 289 / 294 (98%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jgap.JGAP7247_2 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| jgap.JGAP7247_2 1.0 | jgap.JGAP7247_2 | 1 | 35 | 292 | 5.3% | 6.1% ± 2.8 | 25.1% | 64.7% / 67.5% | 22.7% | 0 / 0 | T2/M? | 95% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
