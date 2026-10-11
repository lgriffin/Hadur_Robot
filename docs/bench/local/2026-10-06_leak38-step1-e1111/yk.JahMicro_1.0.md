# yk.JahMicro 1.0 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 92.9% | 94.3% | 90.9% | 33 / 35 | 24.3% | 8.4% | 15 | 0 | 0.78 / 19.0 | 92.0% | +0.9 |
| 2 | 91.4% | 94.3% | 88.4% | 33 / 35 | 19.6% | 8.6% | 16 | 0 | 0.77 / 17.5 | 94.1% | -2.7 |
| 3 | 92.9% | 97.1% | 88.8% | 34 / 35 | 20.0% | 7.3% | 12 | 0 | 0.76 / 17.4 | 90.0% | +2.9 |
| 4 | 93.8% | 100.0% | 88.7% | 35 / 35 | 19.6% | 8.9% | 12 | 0 | 0.77 / 15.1 | 92.6% | +1.3 |
| 5 | 94.6% | 100.0% | 90.0% | 35 / 35 | 21.8% | 7.6% | 15 | 0 | 0.71 / 16.9 | 90.4% | +4.2 |
| 6 | 92.2% | 97.1% | 87.7% | 34 / 35 | 19.2% | 9.6% | 12 | 0 | 0.75 / 11.7 | 92.6% | -0.4 |
| 7 | 95.6% | 100.0% | 91.8% | 35 / 35 | 20.9% | 6.2% | 10 | 0 | 0.72 / 16.0 | 90.5% | +5.2 |
| 8 | 91.9% | 94.3% | 89.0% | 33 / 35 | 20.7% | 8.0% | 10 | 0 | 0.75 / 17.1 | 90.0% | +2.0 |
| 9 | 90.2% | 91.4% | 88.1% | 32 / 35 | 18.9% | 8.3% | 11 | 0 | 0.69 / 17.1 | 89.1% | +1.1 |
| 10 | 92.8% | 94.3% | 90.8% | 33 / 35 | 20.2% | 7.2% | 11 | 0 | 0.74 / 18.2 | 91.3% | +1.5 |
| 11 | 89.1% | 91.4% | 86.1% | 32 / 35 | 22.3% | 8.9% | 10 | 0 | 0.72 / 18.5 | 89.6% | -0.5 |
| 12 | 92.1% | 94.3% | 89.5% | 33 / 35 | 21.1% | 9.6% | 12 | 0 | 0.74 / 16.8 | 95.3% | -3.2 |
| 13 | 91.8% | 94.3% | 88.8% | 33 / 35 | 21.1% | 7.6% | 12 | 0 | 0.72 / 17.2 | 89.9% | +1.9 |
| 14 | 92.0% | 94.3% | 89.3% | 33 / 35 | 19.1% | 7.3% | 15 | 0 | 0.74 / 18.5 | 86.7% | +5.3 |
| 15 | 90.6% | 91.4% | 88.8% | 32 / 35 | 19.3% | 7.3% | 13 | 0 | 0.71 / 16.2 | 91.4% | -0.8 |
| 16 | 94.7% | 100.0% | 90.2% | 35 / 35 | 21.4% | 9.0% | 12 | 0 | 0.74 / 15.2 | 92.1% | +2.5 |

Mean score share 92.4% ± 0.9, baseline 91.1% ± 1.1, paired diff +1.3 ± 1.3.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 198 over 16 battles (12.4 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | weak | 92.4% ± 0.9 | 95.5% ± 1.7 | 89.2% ± 0.7 | 535 / 560 | 20.6% ± 0.8 | 8.1% ± 0.5 | 198 | 0 | 0.78 / 19.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | 13019 | 16 | 13198 | 12989 (99.8%) | 30 (0.2%) | 209 (1.6%) | 895 | 208 | 70 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| yk.JahMicro 1.0 | 18733 | 1063 (5.7%) | 7751 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | 650 | 451 | 405 | 520 | 77.8 / 9.4 | 11244 | 2965 | 82 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | 8.1% | 198 | 83 | 3 | 23.5 | 1061 / 1063 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | yk.JahMicro | 1 | 35 | 276 | 9.1% | 7.0% ± 2.0 | 17.8% | 35.3% / 33.0% | 3.5% | 0 / 0 | T3/M? | 94% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
