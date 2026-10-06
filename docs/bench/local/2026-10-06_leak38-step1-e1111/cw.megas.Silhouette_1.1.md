# cw.megas.Silhouette 1.1 (mid) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 74.3% | 91.4% | 59.6% | 32 / 35 | 15.9% | 8.9% | 14 | 0 | 0.97 / 18.9 | 74.6% | -0.3 |
| 2 | 76.1% | 94.3% | 58.8% | 33 / 35 | 14.6% | 7.3% | 11 | 0 | 0.98 / 16.2 | 73.9% | +2.2 |
| 3 | 72.7% | 88.6% | 57.6% | 31 / 35 | 16.0% | 7.8% | 12 | 0 | 0.99 / 15.2 | 71.9% | +0.7 |
| 4 | 73.3% | 88.6% | 57.9% | 31 / 35 | 14.1% | 6.9% | 13 | 0 | 0.99 / 17.3 | 74.8% | -1.5 |
| 5 | 75.1% | 91.4% | 61.1% | 32 / 35 | 16.7% | 10.2% | 13 | 0 | 0.98 / 17.9 | 75.4% | -0.3 |
| 6 | 73.6% | 88.6% | 59.5% | 31 / 35 | 15.2% | 7.8% | 9 | 0 | 0.99 / 16.4 | 78.2% | -4.5 |
| 7 | 72.5% | 91.4% | 54.9% | 32 / 35 | 13.3% | 8.1% | 12 | 0 | 1.01 / 16.4 | 69.1% | +3.5 |
| 8 | 74.9% | 88.6% | 61.9% | 31 / 35 | 15.5% | 7.7% | 11 | 0 | 0.97 / 16.3 | 74.2% | +0.7 |
| 9 | 81.6% | 97.1% | 66.2% | 34 / 35 | 14.7% | 6.7% | 8 | 0 | 0.90 / 19.0 | 77.8% | +3.8 |
| 10 | 68.5% | 80.0% | 58.2% | 28 / 35 | 15.5% | 7.6% | 10 | 0 | 0.97 / 16.8 | 59.4% | +9.1 |
| 11 | 69.8% | 82.9% | 59.1% | 29 / 35 | 17.3% | 10.4% | 11 | 0 | 1.00 / 15.6 | 69.6% | +0.2 |
| 12 | 74.7% | 88.6% | 62.0% | 31 / 35 | 16.1% | 7.6% | 13 | 0 | 0.92 / 16.8 | 74.1% | +0.6 |
| 13 | 67.1% | 77.1% | 57.6% | 27 / 35 | 15.4% | 8.0% | 11 | 0 | 1.01 / 16.0 | 71.0% | -3.8 |
| 14 | 80.0% | 94.3% | 66.8% | 33 / 35 | 17.8% | 7.6% | 14 | 0 | 0.96 / 16.0 | 69.2% | +10.8 |
| 15 | 73.9% | 85.7% | 62.9% | 30 / 35 | 16.5% | 8.3% | 12 | 0 | 0.95 / 16.9 | 73.4% | +0.5 |
| 16 | 77.2% | 88.6% | 66.8% | 31 / 35 | 17.8% | 6.7% | 10 | 0 | 0.89 / 17.3 | 71.0% | +6.2 |

Mean score share 74.1% ± 2.0, baseline 72.3% ± 2.4, paired diff +1.7 ± 2.2.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 184 over 16 battles (11.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | mid | 74.1% ± 2.0 | 88.6% ± 2.8 | 60.7% ± 1.9 | 496 / 560 | 15.8% ± 0.7 | 8.0% ± 0.6 | 184 | 0 | 1.01 / 19.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | 17695 | 32 | 17696 | 17695 (100.0%) | 0 (0.0%) | 1 (0.0%) | 647 | 263 | 57 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| cw.megas.Silhouette 1.1 | 19241 | 1618 (8.4%) | 12990 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | 650 | 402 | 614 | 503 | 44.9 / 29.0 | 4107 | 7768 | 5088 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | 8.0% | 184 | 96 | 3 | 31.5 | 1617 / 1618 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | cw.megas.Silhouette | 1 | 35 | 308 | 8.5% | 6.5% ± 1.6 | 15.6% | 25.0% / 24.1% | 10.9% | 0 / 0 | T2/M0 | 76% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
