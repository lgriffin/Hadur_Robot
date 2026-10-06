# jgap.JGAP7247_2 1.0 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 97.0% | 100.0% | 93.9% | 35 / 35 | 38.5% | 2.6% | 17 | 0 | 0.86 / 335.6 | 97.5% | -0.6 |
| 2 | 96.2% | 100.0% | 92.4% | 35 / 35 | 39.5% | 1.9% | 15 | 0 | 0.81 / 282.8 | 96.2% | +0.0 |
| 3 | 96.5% | 100.0% | 93.0% | 35 / 35 | 40.2% | 2.7% | 16 | 0 | 0.87 / 321.2 | 94.7% | +1.8 |
| 4 | 96.8% | 100.0% | 93.5% | 35 / 35 | 38.7% | 1.8% | 16 | 0 | 0.81 / 449.0 | 97.4% | -0.6 |
| 5 | 95.3% | 100.0% | 90.6% | 35 / 35 | 37.2% | 3.6% | 9 | 0 | 0.95 / 9.9 | 96.9% | -1.6 |
| 6 | 97.2% | 100.0% | 94.2% | 35 / 35 | 38.5% | 2.1% | 15 | 0 | 0.88 / 14.1 | 96.0% | +1.2 |
| 7 | 96.6% | 100.0% | 93.2% | 35 / 35 | 40.6% | 3.0% | 14 | 0 | 0.85 / 10.7 | 95.4% | +1.2 |
| 8 | 96.6% | 100.0% | 93.3% | 35 / 35 | 42.7% | 3.1% | 13 | 0 | 0.83 / 9.5 | 96.9% | -0.3 |
| 9 | 96.0% | 100.0% | 91.7% | 35 / 35 | 32.1% | 2.6% | 11 | 0 | 0.89 / 14.3 | 96.6% | -0.5 |
| 10 | 95.6% | 100.0% | 91.1% | 35 / 35 | 36.8% | 5.7% | 14 | 0 | 0.84 / 9.2 | 95.9% | -0.3 |
| 11 | 97.5% | 100.0% | 94.9% | 35 / 35 | 41.2% | 2.2% | 12 | 0 | 0.91 / 10.0 | 96.8% | +0.7 |
| 12 | 92.9% | 100.0% | 85.9% | 35 / 35 | 37.6% | 5.4% | 16 | 0 | 0.90 / 12.7 | 98.7% | -5.8 |
| 13 | 96.8% | 100.0% | 93.4% | 35 / 35 | 36.8% | 3.1% | 16 | 0 | 0.85 / 9.4 | 93.9% | +2.9 |
| 14 | 96.2% | 100.0% | 92.2% | 35 / 35 | 36.1% | 8.1% | 14 | 0 | 0.82 / 9.0 | 95.6% | +0.6 |
| 15 | 95.7% | 100.0% | 91.6% | 35 / 35 | 44.1% | 3.9% | 16 | 0 | 0.85 / 39.1 | 96.1% | -0.3 |
| 16 | 96.8% | 100.0% | 93.5% | 35 / 35 | 38.4% | 2.4% | 16 | 0 | 0.79 / 10.8 | 95.3% | +1.5 |

Mean score share 96.2% ± 0.6, baseline 96.2% ± 0.6, paired diff -0.0 ± 1.0.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 230 over 16 battles (14.4 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jgap.JGAP7247_2 1.0 | weak | 96.2% ± 0.6 | 100.0% ± 0.0 | 92.4% ± 1.1 | 560 / 560 | 38.7% ± 1.5 | 3.4% ± 0.9 | 230 | 0 | 0.95 / 449.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jgap.JGAP7247_2 1.0 | 4950 | 38 | 5053 | 4807 (97.1%) | 143 (2.9%) | 246 (4.9%) | 2518 | 263 | 49 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jgap.JGAP7247_2 1.0 | 6677 | 265 (4.0%) | 259 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jgap.JGAP7247_2 1.0 | 650 | 439 | 400 | 205 | 66.3 / 5.5 | 4584 | 4941 | 2710 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jgap.JGAP7247_2 1.0 | 3.4% | 230 | 69 | 3 | 9.0 | 253 / 265 (95%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jgap.JGAP7247_2 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| jgap.JGAP7247_2 1.0 | jgap.JGAP7247_2 | 1 | 35 | 292 | 4.7% | 5.1% ± 2.6 | 24.4% | 65.7% / 71.9% | 21.8% | 0 / 0 | T2/M? | 95% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
