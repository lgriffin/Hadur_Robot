# rapture.Rapture 2.13 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 95.3% | 100.0% | 91.1% | 35 / 35 | 21.2% | 5.8% | 13 | 0 | 0.75 / 17.4 | 97.6% | -2.3 |
| 2 | 94.3% | 100.0% | 89.4% | 35 / 35 | 22.5% | 5.5% | 12 | 0 | 0.80 / 15.5 | 94.9% | -0.6 |
| 3 | 94.2% | 97.1% | 91.2% | 34 / 35 | 19.7% | 7.2% | 16 | 0 | 0.86 / 17.6 | 98.2% | -4.0 |
| 4 | 97.8% | 100.0% | 95.6% | 35 / 35 | 21.1% | 2.4% | 12 | 0 | 0.69 / 17.4 | 98.3% | -0.4 |
| 5 | 98.8% | 100.0% | 97.7% | 35 / 35 | 20.6% | 1.8% | 13 | 0 | 0.66 / 14.7 | 92.9% | +6.0 |
| 6 | 97.6% | 100.0% | 95.2% | 35 / 35 | 19.4% | 3.1% | 13 | 0 | 0.70 / 17.4 | 97.3% | +0.3 |
| 7 | 97.3% | 100.0% | 94.6% | 35 / 35 | 19.9% | 3.1% | 12 | 0 | 0.70 / 15.4 | 96.9% | +0.4 |
| 8 | 97.7% | 100.0% | 95.4% | 35 / 35 | 19.8% | 2.2% | 9 | 0 | 0.70 / 16.1 | 92.9% | +4.8 |
| 9 | 97.9% | 100.0% | 95.9% | 35 / 35 | 24.2% | 2.3% | 7 | 0 | 0.68 / 15.6 | 97.9% | -0.0 |
| 10 | 97.6% | 100.0% | 95.4% | 35 / 35 | 20.8% | 2.9% | 13 | 0 | 0.75 / 17.1 | 95.6% | +2.0 |
| 11 | 98.3% | 100.0% | 96.6% | 35 / 35 | 21.1% | 1.8% | 10 | 0 | 0.69 / 14.1 | 93.5% | +4.8 |
| 12 | 97.5% | 100.0% | 95.1% | 35 / 35 | 22.7% | 3.4% | 13 | 0 | 0.70 / 16.7 | 93.6% | +3.8 |
| 13 | 97.6% | 100.0% | 95.3% | 35 / 35 | 20.0% | 2.7% | 11 | 0 | 0.74 / 17.2 | 97.6% | +0.0 |
| 14 | 98.3% | 100.0% | 96.7% | 35 / 35 | 21.5% | 2.5% | 12 | 0 | 0.78 / 17.2 | 97.3% | +1.0 |
| 15 | 97.8% | 100.0% | 95.6% | 35 / 35 | 21.3% | 2.7% | 9 | 0 | 0.65 / 16.6 | 96.7% | +1.1 |
| 16 | 98.2% | 100.0% | 96.5% | 35 / 35 | 20.0% | 2.2% | 10 | 0 | 0.69 / 17.4 | 94.6% | +3.6 |

Mean score share 97.3% ± 0.7, baseline 96.0% ± 1.1, paired diff +1.3 ± 1.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 185 over 16 battles (11.6 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | weak | 97.3% ± 0.7 | 99.8% ± 0.4 | 94.8% ± 1.2 | 559 / 560 | 21.0% ± 0.7 | 3.2% ± 0.8 | 185 | 0 | 0.86 / 17.6 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | 16446 | 38 | 16404 | 16401 (99.7%) | 45 (0.3%) | 3 (0.0%) | 220 | 232 | 51 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| rapture.Rapture 2.13 | 14843 | 988 (6.7%) | 6761 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | 650 | 407 | 405 | 420 | 73.2 / 4.1 | 8829 | 8933 | 2549 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | 3.2% | 185 | 1019 | 3 | 29.3 | 986 / 988 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| rapture.Rapture 2.13 | rapture.Rapture | 1 | 35 | 294 | 3.0% | 2.3% ± 1.0 | 17.1% | 35.2% / 30.6% | 10.6% | 0 / 0 | T1/M? | 98% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
