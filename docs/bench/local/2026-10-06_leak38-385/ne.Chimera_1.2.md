# ne.Chimera 1.2 (lower) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 97.7% | 100.0% | 49.0% | 35 / 35 | 0.7% | 0.7% | 10 | 0 | 0.73 / 16.3 | 97.2% | +0.5 |
| 2 | 98.1% | 100.0% | 62.9% | 35 / 35 | 0.9% | 0.4% | 12 | 0 | 0.84 / 17.1 | 100.0% | -1.9 |
| 3 | 97.7% | 100.0% | 47.9% | 35 / 35 | 0.4% | 0.3% | 11 | 0 | 1.10 / 19.3 | 98.8% | -1.1 |
| 4 | 92.1% | 97.1% | 37.7% | 34 / 35 | 1.0% | 20.0% | 7 | 0 | 0.55 / 17.1 | 99.4% | -7.3 |
| 5 | 98.9% | 100.0% | 63.1% | 35 / 35 | 0.6% | 0.6% | 15 | 0 | 0.59 / 17.3 | 96.6% | +2.2 |
| 6 | 92.3% | 97.1% | 50.0% | 34 / 35 | 1.8% | 17.5% | 17 | 0 | 0.80 / 17.7 | 97.9% | -5.6 |
| 7 | 93.1% | 97.1% | 37.8% | 34 / 35 | 0.7% | 1.1% | 10 | 0 | 0.75 / 16.3 | 92.8% | +0.3 |
| 8 | 97.6% | 100.0% | 61.5% | 35 / 35 | 0.8% | 0.4% | 9 | 0 | 1.10 / 17.4 | 99.5% | -1.9 |
| 9 | 99.3% | 100.0% | 79.5% | 35 / 35 | 0.7% | 0.2% | 7 | 0 | 0.82 / 15.5 | 98.8% | +0.5 |
| 10 | 98.0% | 100.0% | 50.0% | 35 / 35 | 0.5% | 0.6% | 11 | 0 | 0.72 / 15.2 | 98.8% | -0.7 |
| 11 | 99.1% | 100.0% | 72.6% | 35 / 35 | 0.5% | 0.2% | 10 | 0 | 0.77 / 14.6 | 99.5% | -0.4 |
| 12 | 95.4% | 100.0% | 52.0% | 35 / 35 | 1.4% | 1.0% | 12 | 0 | 0.81 / 16.5 | 93.5% | +1.9 |
| 13 | 97.9% | 100.0% | 58.9% | 35 / 35 | 0.7% | 0.5% | 12 | 0 | 0.81 / 14.6 | 98.7% | -0.8 |
| 14 | 93.4% | 97.1% | 16.5% | 34 / 35 | 0.4% | 1.0% | 7 | 0 | 0.67 / 15.9 | 97.3% | -3.9 |
| 15 | 90.6% | 97.1% | 45.5% | 34 / 35 | 1.7% | 20.6% | 11 | 0 | 0.83 / 16.1 | 98.8% | -8.2 |
| 16 | 100.0% | 100.0% | 100.0% | 35 / 35 | 0.6% | 0.0% | 12 | 0 | 0.81 / 15.2 | 97.4% | +2.6 |

Mean score share 96.3% ± 1.6, baseline 97.8% ± 1.1, paired diff -1.5 ± 1.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 173 over 16 battles (10.8 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ne.Chimera 1.2 | lower | 96.3% ± 1.6 | 99.1% ± 0.7 | 55.3% ± 10.1 | 555 / 560 | 0.8% ± 0.2 | 4.1% ± 4.1 | 173 | 0 | 1.10 / 19.3 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ne.Chimera 1.2 | 577 | 2 | 369 | 369 (64.0%) | 208 (36.0%) | 0 (0.0%) | 10 | 5 | 43 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ne.Chimera 1.2 | 663 | 38 (5.7%) | 37 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ne.Chimera 1.2 | 650 | 363 | 648 | 18 | 1.8 / 1.7 | 10 | 229 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ne.Chimera 1.2 | 4.1% | 173 | 25 | 3 | 0.7 | 33 / 38 (87%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ne.Chimera 1.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ne.Chimera 1.2 | ne.Chimera | 1 | 35 | 272 | 0.0% | 0.0% ± 12.0 | 25.0% | 26.3% / 22.7% | 0.0% | 0 / 0 | T?/M? | 100% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
