# yk.JahMicro 1.0 (weak) vs hadur2.Hadur 3.8.1

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 90.4% | 94.3% | 86.6% | 33 / 35 | 18.3% | 7.5% | 20 | 0 | 0.83 / 599.8 | 91.5% | -1.0 |
| 2 | 94.4% | 97.1% | 91.6% | 34 / 35 | 20.1% | 6.7% | 13 | 0 | 0.80 / 740.9 | 85.3% | +9.1 |
| 3 | 92.3% | 97.1% | 87.9% | 34 / 35 | 22.1% | 9.2% | 16 | 0 | 0.84 / 526.2 | 94.1% | -1.9 |
| 4 | 92.1% | 94.3% | 89.5% | 33 / 35 | 19.2% | 8.8% | 15 | 0 | 0.81 / 738.7 | 94.1% | -1.9 |
| 5 | 93.5% | 100.0% | 88.1% | 35 / 35 | 20.0% | 9.2% | 18 | 0 | 0.85 / 580.4 | 93.1% | +0.4 |
| 6 | 91.5% | 94.3% | 88.5% | 33 / 35 | 19.0% | 13.2% | 18 | 0 | 0.81 / 18.1 | 90.0% | +1.5 |
| 7 | 91.0% | 94.3% | 87.3% | 33 / 35 | 17.5% | 7.5% | 16 | 0 | 0.78 / 94.8 | 93.5% | -2.6 |
| 8 | 90.3% | 91.4% | 88.4% | 32 / 35 | 18.1% | 8.2% | 14 | 0 | 0.84 / 17.7 | 91.7% | -1.4 |
| 9 | 91.2% | 91.4% | 90.0% | 32 / 35 | 19.4% | 7.4% | 13 | 0 | 0.79 / 32.0 | 94.0% | -2.7 |
| 10 | 89.5% | 91.4% | 86.7% | 32 / 35 | 18.7% | 9.0% | 15 | 0 | 0.82 / 66.9 | 95.1% | -5.6 |
| 11 | 93.6% | 97.1% | 90.2% | 34 / 35 | 20.7% | 7.8% | 11 | 0 | 0.76 / 40.2 | 91.0% | +2.6 |
| 12 | 88.7% | 88.6% | 87.1% | 31 / 35 | 19.5% | 7.9% | 12 | 0 | 0.75 / 80.6 | 96.5% | -7.8 |
| 13 | 94.6% | 100.0% | 89.9% | 35 / 35 | 19.4% | 7.3% | 26 | 0 | 0.77 / 17.3 | 89.9% | +4.8 |
| 14 | 94.4% | 97.1% | 91.5% | 34 / 35 | 21.1% | 5.8% | 28 | 0 | 0.70 / 17.1 | 92.4% | +2.0 |
| 15 | 93.7% | 97.1% | 90.2% | 34 / 35 | 19.1% | 6.3% | 11 | 0 | 0.74 / 19.2 | 92.5% | +1.2 |
| 16 | 93.5% | 94.3% | 91.8% | 33 / 35 | 22.1% | 5.7% | 11 | 0 | 0.74 / 43.5 | 94.3% | -0.8 |

Mean score share 92.2% ± 1.0, baseline 92.4% ± 1.4, paired diff -0.3 ± 2.1.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 257 over 16 battles (16.1 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | weak | 92.2% ± 1.0 | 95.0% ± 1.7 | 89.1% ± 0.9 | 532 / 560 | 19.6% ± 0.7 | 8.0% ± 0.9 | 257 | 0 | 0.85 / 740.9 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | 13870 | 10 | 13777 | 13727 (99.0%) | 143 (1.0%) | 50 (0.4%) | 902 | 229 | 78 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| yk.JahMicro 1.0 | 19789 | 1141 (5.8%) | 5232 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | 650 | 463 | 425 | 548 | 76.8 / 9.4 | 11469 | 2762 | 127 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | 8.0% | 257 | 90 | 3 | 24.5 | 1134 / 1141 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | yk.JahMicro | 1 | 35 | 276 | 5.7% | 4.6% ± 1.6 | 17.9% | 36.1% / 32.2% | 3.7% | 0 / 0 | T2/M0 | 93% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
