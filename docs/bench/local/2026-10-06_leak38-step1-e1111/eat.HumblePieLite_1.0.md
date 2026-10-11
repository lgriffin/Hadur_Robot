# eat.HumblePieLite 1.0 (lower) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 90.9% | 100.0% | 83.5% | 35 / 35 | 36.6% | 8.3% | 11 | 0 | 0.67 / 9.1 | 91.3% | -0.4 |
| 2 | 92.9% | 100.0% | 86.6% | 35 / 35 | 36.9% | 6.3% | 12 | 0 | 0.69 / 12.3 | 96.0% | -3.2 |
| 3 | 93.2% | 100.0% | 87.3% | 35 / 35 | 35.5% | 6.0% | 10 | 0 | 0.72 / 12.5 | 90.2% | +3.0 |
| 4 | 95.0% | 100.0% | 90.5% | 35 / 35 | 39.4% | 4.2% | 12 | 0 | 0.68 / 8.9 | 93.4% | +1.7 |
| 5 | 60.1% | 80.0% | 43.6% | 28 / 35 | 20.4% | 9.4% | 15 | 0 | 0.67 / 17.2 | 92.0% | -32.0 |
| 6 | 93.4% | 100.0% | 87.7% | 35 / 35 | 37.5% | 5.9% | 11 | 0 | 0.65 / 10.0 | 93.9% | -0.4 |
| 7 | 92.5% | 100.0% | 86.1% | 35 / 35 | 35.7% | 6.2% | 11 | 0 | 0.66 / 8.5 | 94.2% | -1.6 |
| 8 | 95.3% | 100.0% | 91.0% | 35 / 35 | 38.7% | 4.1% | 8 | 0 | 0.66 / 13.8 | 89.0% | +6.3 |
| 9 | 92.3% | 100.0% | 85.7% | 35 / 35 | 35.7% | 6.3% | 11 | 0 | 0.71 / 9.1 | 92.1% | +0.2 |
| 10 | 92.0% | 100.0% | 85.0% | 35 / 35 | 35.4% | 6.8% | 12 | 0 | 0.69 / 8.6 | 91.4% | +0.6 |
| 11 | 94.7% | 100.0% | 90.0% | 35 / 35 | 37.9% | 4.7% | 9 | 0 | 0.70 / 11.5 | 93.3% | +1.4 |
| 12 | 93.7% | 100.0% | 88.0% | 35 / 35 | 35.2% | 5.5% | 11 | 0 | 0.72 / 8.6 | 91.4% | +2.3 |
| 13 | 92.5% | 100.0% | 86.0% | 35 / 35 | 35.2% | 6.3% | 13 | 0 | 0.71 / 9.4 | 93.3% | -0.7 |
| 14 | 93.4% | 100.0% | 87.6% | 35 / 35 | 36.1% | 6.2% | 15 | 0 | 0.65 / 13.2 | 94.4% | -1.0 |
| 15 | 92.2% | 100.0% | 85.5% | 35 / 35 | 36.3% | 7.2% | 13 | 0 | 0.70 / 9.8 | 72.4% | +19.8 |
| 16 | 92.3% | 100.0% | 85.7% | 35 / 35 | 36.3% | 7.0% | 12 | 0 | 0.64 / 9.6 | 94.4% | -2.1 |

Mean score share 91.0% ± 4.4, baseline 91.4% ± 2.9, paired diff -0.4 ± 5.3.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 186 over 16 battles (11.6 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | lower | 91.0% ± 4.4 | 98.8% ± 2.7 | 84.4% ± 5.9 | 553 / 560 | 35.5% ± 2.3 | 6.3% ± 0.7 | 186 | 0 | 0.72 / 17.2 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 6963 | 44 | 6914 | 6914 (99.3%) | 49 (0.7%) | 0 (0.0%) | 21 | 175 | 59 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| eat.HumblePieLite 1.0 | 6992 | 335 (4.8%) | 187 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 650 | 493 | 416 | 245 | 71.5 / 13.0 | 5149 | 7075 | 365 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 6.3% | 186 | 65 | 3 | 10.7 | 332 / 335 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | eat.HumblePieLite | 1 | 35 | 300 | 9.6% | 11.1% ± 3.3 | 25.4% | 28.6% / 26.3% | 0.4% | 0 / 0 | T?/M? | 90% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
