# eat.HumblePieLite 1.0 (lower) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 96.6% | 100.0% | 93.3% | 35 / 35 | 35.1% | 3.0% | 14 | 0 | 0.78 / 9.3 | 93.1% | +3.5 |
| 2 | 91.5% | 100.0% | 84.5% | 35 / 35 | 39.2% | 8.1% | 12 | 0 | 0.84 / 14.7 | 91.4% | +0.1 |
| 3 | 89.9% | 100.0% | 81.7% | 35 / 35 | 36.6% | 8.9% | 14 | 0 | 0.84 / 10.0 | 90.9% | -1.0 |
| 4 | 92.5% | 100.0% | 86.1% | 35 / 35 | 38.0% | 7.2% | 11 | 0 | 0.84 / 14.6 | 93.9% | -1.4 |
| 5 | 93.3% | 100.0% | 87.4% | 35 / 35 | 35.4% | 5.7% | 13 | 0 | 0.81 / 15.5 | 56.9% | +36.4 |
| 6 | 91.4% | 100.0% | 84.1% | 35 / 35 | 36.1% | 7.5% | 12 | 0 | 0.86 / 10.5 | 93.4% | -2.0 |
| 7 | 91.3% | 100.0% | 83.8% | 35 / 35 | 35.7% | 7.2% | 16 | 0 | 0.81 / 9.6 | 92.0% | -0.8 |
| 8 | 92.6% | 100.0% | 86.2% | 35 / 35 | 36.8% | 6.0% | 13 | 0 | 0.86 / 41.1 | 88.9% | +3.8 |
| 9 | 94.3% | 100.0% | 89.1% | 35 / 35 | 37.5% | 5.5% | 12 | 0 | 0.83 / 38.5 | 95.6% | -1.3 |
| 10 | 91.4% | 100.0% | 84.2% | 35 / 35 | 37.9% | 7.7% | 12 | 0 | 0.76 / 19.4 | 93.4% | -2.0 |
| 11 | 93.1% | 100.0% | 87.1% | 35 / 35 | 37.2% | 5.9% | 11 | 0 | 0.90 / 10.1 | 92.5% | +0.7 |
| 12 | 93.4% | 100.0% | 87.6% | 35 / 35 | 36.8% | 5.6% | 11 | 0 | 0.88 / 9.2 | 89.5% | +3.9 |
| 13 | 90.9% | 100.0% | 83.2% | 35 / 35 | 37.3% | 8.5% | 13 | 0 | 0.82 / 10.5 | 92.2% | -1.3 |
| 14 | 51.4% | 77.1% | 29.7% | 27 / 35 | 16.6% | 9.6% | 18 | 0 | 0.74 / 115.4 | 63.0% | -11.6 |
| 15 | 92.2% | 100.0% | 85.6% | 35 / 35 | 38.5% | 7.1% | 11 | 0 | 0.87 / 13.0 | 91.2% | +1.0 |
| 16 | 86.9% | 97.1% | 78.5% | 34 / 35 | 35.0% | 9.0% | 8 | 0 | 0.86 / 14.8 | 94.3% | -7.5 |

Mean score share 89.5% ± 5.5, baseline 88.3% ± 6.0, paired diff +1.3 ± 5.4.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 201 over 16 battles (12.6 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | lower | 89.5% ± 5.5 | 98.4% ± 3.0 | 82.0% ± 7.6 | 551 / 560 | 35.6% ± 2.8 | 7.0% ± 0.9 | 201 | 0 | 0.90 / 115.4 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 7316 | 64 | 7231 | 7230 (98.8%) | 86 (1.2%) | 1 (0.0%) | 27 | 167 | 63 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| eat.HumblePieLite 1.0 | 6949 | 311 (4.5%) | 200 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 650 | 491 | 416 | 254 | 71.1 / 15.0 | 5067 | 7858 | 500 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 7.0% | 201 | 80 | 3 | 10.6 | 305 / 311 (98%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | eat.HumblePieLite | 1 | 35 | 300 | 10.5% | 12.5% ± 3.1 | 25.3% | 30.8% / 26.9% | 0.5% | 0 / 0 | T?/M? | 86% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
