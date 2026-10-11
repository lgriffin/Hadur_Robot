# eat.HumblePieLite 1.0 (lower) vs hadur2.Hadur 3.8.1

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 92.4% | 100.0% | 85.9% | 35 / 35 | 36.9% | 6.6% | 13 | 0 | 0.83 / 25.3 | 93.1% | -0.7 |
| 2 | 93.9% | 100.0% | 88.5% | 35 / 35 | 36.8% | 5.4% | 11 | 0 | 0.79 / 9.3 | 91.2% | +2.8 |
| 3 | 91.7% | 100.0% | 84.9% | 35 / 35 | 39.8% | 7.9% | 110 | 0 | 0.75 / 10.8 | 91.9% | -0.2 |
| 4 | 93.4% | 100.0% | 87.6% | 35 / 35 | 37.8% | 5.3% | 10 | 0 | 0.70 / 372.3 | 85.6% | +7.8 |
| 5 | 91.8% | 100.0% | 84.9% | 35 / 35 | 36.2% | 7.3% | 13 | 0 | 0.75 / 245.4 | 92.5% | -0.7 |
| 6 | 90.0% | 100.0% | 81.8% | 35 / 35 | 35.2% | 8.1% | 16 | 0 | 0.80 / 247.6 | 94.7% | -4.7 |
| 7 | 93.6% | 100.0% | 88.0% | 35 / 35 | 36.2% | 5.3% | 12 | 0 | 0.81 / 19.8 | 92.7% | +0.9 |
| 8 | 91.8% | 100.0% | 84.9% | 35 / 35 | 36.0% | 6.9% | 11 | 0 | 0.84 / 129.1 | 90.8% | +1.0 |
| 9 | 65.5% | 88.6% | 45.1% | 31 / 35 | 20.1% | 9.9% | 6 | 0 | 0.75 / 239.0 | 93.1% | -27.6 |
| 10 | 92.9% | 100.0% | 86.6% | 35 / 35 | 35.7% | 6.2% | 11 | 0 | 0.79 / 203.5 | 91.6% | +1.3 |
| 11 | 93.3% | 100.0% | 87.4% | 35 / 35 | 34.1% | 5.6% | 15 | 0 | 0.79 / 211.2 | 92.6% | +0.7 |
| 12 | 92.9% | 100.0% | 86.7% | 35 / 35 | 35.6% | 5.9% | 13 | 0 | 0.76 / 9.0 | 92.6% | +0.3 |
| 13 | 89.7% | 100.0% | 81.4% | 35 / 35 | 37.9% | 8.7% | 13 | 0 | 0.79 / 10.9 | 61.8% | +27.9 |
| 14 | 91.6% | 100.0% | 84.6% | 35 / 35 | 35.9% | 7.3% | 15 | 0 | 0.74 / 14.7 | 91.9% | -0.3 |
| 15 | 93.1% | 100.0% | 86.9% | 35 / 35 | 36.0% | 5.7% | 12 | 0 | 0.80 / 10.4 | 91.9% | +1.2 |
| 16 | 92.3% | 100.0% | 85.7% | 35 / 35 | 37.7% | 6.6% | 14 | 0 | 0.80 / 9.6 | 89.7% | +2.5 |

Mean score share 90.6% ± 3.6, baseline 89.9% ± 4.1, paired diff +0.8 ± 5.6.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 295 over 16 battles (18.4 per battle, most in one battle 110). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | lower | 90.6% ± 3.6 | 99.3% ± 1.5 | 83.2% ± 5.5 | 556 / 560 | 35.5% ± 2.3 | 6.8% ± 0.7 | 295 | 0 | 0.84 / 372.3 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 7178 | 42 | 7144 | 7143 (99.5%) | 35 (0.5%) | 1 (0.0%) | 27 | 176 | 60 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| eat.HumblePieLite 1.0 | 7059 | 320 (4.5%) | 148 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 650 | 493 | 416 | 250 | 71.9 / 14.2 | 5216 | 7399 | 438 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 6.8% | 295 | 85 | 3 | 10.9 | 318 / 320 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | eat.HumblePieLite | 1 | 35 | 300 | 9.8% | 11.6% ± 3.4 | 26.5% | 30.4% / 25.6% | 0.2% | 0 / 0 | T?/M? | 90% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
