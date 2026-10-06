# eat.HumblePieLite 1.0 (lower) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 91.9% | 100.0% | 84.8% | 35 / 35 | 35.0% | 20.4% | 15 | 0 | 0.80 / 17.1 | 94.9% | -3.1 |
| 2 | 74.4% | 91.4% | 59.2% | 32 / 35 | 24.7% | 8.9% | 21 | 0 | 0.84 / 21.1 | 91.2% | -16.8 |
| 3 | 93.4% | 100.0% | 87.6% | 35 / 35 | 38.3% | 6.1% | 14 | 0 | 0.86 / 11.0 | 91.2% | +2.2 |
| 4 | 89.0% | 100.0% | 80.2% | 35 / 35 | 36.9% | 9.8% | 16 | 0 | 0.84 / 12.3 | 93.7% | -4.7 |
| 5 | 92.7% | 100.0% | 86.5% | 35 / 35 | 38.4% | 7.1% | 18 | 0 | 0.85 / 11.2 | 91.7% | +1.0 |
| 6 | 88.7% | 100.0% | 79.7% | 35 / 35 | 35.9% | 9.4% | 18 | 0 | 0.87 / 10.0 | 91.1% | -2.4 |
| 7 | 91.7% | 100.0% | 84.5% | 35 / 35 | 35.1% | 6.7% | 17 | 0 | 0.86 / 11.3 | 88.3% | +3.4 |
| 8 | 94.2% | 100.0% | 88.9% | 35 / 35 | 36.3% | 4.7% | 14 | 0 | 0.83 / 11.1 | 91.4% | +2.8 |
| 9 | 91.8% | 100.0% | 84.9% | 35 / 35 | 36.1% | 7.5% | 14 | 0 | 0.89 / 12.6 | 92.8% | -1.0 |
| 10 | 91.8% | 100.0% | 84.8% | 35 / 35 | 35.8% | 7.1% | 17 | 0 | 0.88 / 12.9 | 90.3% | +1.5 |
| 11 | 93.1% | 100.0% | 87.2% | 35 / 35 | 38.9% | 6.1% | 20 | 0 | 0.93 / 11.0 | 94.3% | -1.1 |
| 12 | 94.0% | 100.0% | 88.4% | 35 / 35 | 34.9% | 4.8% | 20 | 0 | 0.99 / 15.7 | 93.5% | +0.4 |
| 13 | 91.1% | 100.0% | 83.6% | 35 / 35 | 36.1% | 8.2% | 18 | 0 | 0.97 / 10.7 | 93.4% | -2.3 |
| 14 | 94.1% | 100.0% | 88.7% | 35 / 35 | 36.0% | 4.7% | 21 | 0 | 0.94 / 13.5 | 91.9% | +2.2 |
| 15 | 88.9% | 97.1% | 82.2% | 34 / 35 | 37.8% | 21.3% | 24 | 0 | 0.88 / 11.2 | 87.8% | +1.1 |
| 16 | 91.5% | 100.0% | 84.4% | 35 / 35 | 38.6% | 8.5% | 22 | 0 | 0.88 / 12.6 | 93.0% | -1.5 |

Mean score share 90.8% ± 2.5, baseline 91.9% ± 1.1, paired diff -1.1 ± 2.6.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 289 over 16 battles (18.1 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | lower | 90.8% ± 2.5 | 99.3% ± 1.2 | 83.5% ± 3.8 | 556 / 560 | 35.9% ± 1.7 | 8.8% ± 2.6 | 289 | 0 | 0.99 / 21.1 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 6930 | 41 | 6743 | 6743 (97.3%) | 187 (2.7%) | 0 (0.0%) | 38 | 159 | 83 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| eat.HumblePieLite 1.0 | 7186 | 342 (4.8%) | 109 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 650 | 492 | 416 | 242 | 72.3 / 14.2 | 5195 | 7255 | 360 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 8.8% | 289 | 65 | 3 | 10.8 | 331 / 342 (97%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| eat.HumblePieLite 1.0 | eat.HumblePieLite | 1 | 35 | 300 | 9.6% | 12.0% ± 3.5 | 26.8% | 30.9% / 30.2% | 0.4% | 0 / 0 | T?/M? | 90% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
