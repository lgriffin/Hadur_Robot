# ola.Puffin 1.0 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 97.0% | 100.0% | 94.5% | 35 / 35 | 52.9% | 7.3% | 11 | 0 | 0.72 / 8.8 | 96.7% | +0.3 |
| 2 | 97.7% | 100.0% | 95.7% | 35 / 35 | 47.7% | 7.0% | 13 | 0 | 0.70 / 26.9 | 98.9% | -1.3 |
| 3 | 95.4% | 100.0% | 91.9% | 35 / 35 | 48.8% | 13.5% | 11 | 0 | 0.75 / 13.1 | 99.0% | -3.6 |
| 4 | 96.0% | 97.1% | 94.8% | 34 / 35 | 48.7% | 7.9% | 10 | 0 | 0.70 / 65.3 | 96.0% | -0.0 |
| 5 | 97.7% | 100.0% | 95.7% | 35 / 35 | 48.4% | 7.1% | 15 | 0 | 0.71 / 103.6 | 97.1% | +0.5 |
| 6 | 95.1% | 100.0% | 91.4% | 35 / 35 | 44.7% | 13.3% | 33 | 0 | 0.86 / 47.6 | 94.8% | +0.4 |
| 7 | 95.7% | 100.0% | 93.0% | 35 / 35 | 51.8% | 11.1% | 13 | 0 | 0.76 / 12.9 | 94.8% | +1.0 |
| 8 | 96.9% | 100.0% | 94.4% | 35 / 35 | 50.8% | 11.1% | 14 | 0 | 0.81 / 9.2 | 97.5% | -0.6 |
| 9 | 97.0% | 100.0% | 94.8% | 35 / 35 | 54.5% | 7.9% | 11 | 0 | 0.77 / 11.3 | 95.9% | +1.1 |
| 10 | 96.4% | 100.0% | 93.5% | 35 / 35 | 54.5% | 11.1% | 10 | 0 | 0.80 / 21.5 | 96.4% | +0.0 |
| 11 | 95.0% | 100.0% | 91.3% | 35 / 35 | 49.1% | 15.5% | 12 | 0 | 0.89 / 12.2 | 98.3% | -3.3 |
| 12 | 95.0% | 100.0% | 91.2% | 35 / 35 | 44.3% | 14.2% | 14 | 0 | 0.85 / 10.4 | 95.0% | -0.0 |
| 13 | 97.7% | 100.0% | 95.7% | 35 / 35 | 50.7% | 7.1% | 14 | 0 | 0.77 / 13.4 | 94.9% | +2.7 |
| 14 | 98.5% | 100.0% | 97.3% | 35 / 35 | 51.4% | 4.3% | 14 | 0 | 0.77 / 11.7 | 97.4% | +1.2 |
| 15 | 96.7% | 100.0% | 94.6% | 35 / 35 | 49.1% | 11.9% | 15 | 0 | 0.78 / 13.8 | 94.1% | +2.7 |
| 16 | 96.7% | 100.0% | 95.2% | 35 / 35 | 47.7% | 7.6% | 13 | 0 | 0.74 / 11.6 | 95.2% | +1.6 |

Mean score share 96.5% ± 0.6, baseline 96.4% ± 0.8, paired diff +0.2 ± 0.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 223 over 16 battles (13.9 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ola.Puffin 1.0 | weak | 96.5% ± 0.6 | 99.8% ± 0.4 | 94.1% ± 1.0 | 559 / 560 | 49.7% ± 1.6 | 9.9% ± 1.7 | 223 | 0 | 0.89 / 103.6 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ola.Puffin 1.0 | 7204 | 36 | 7131 | 7123 (98.9%) | 81 (1.1%) | 8 (0.1%) | 87 | 258 | 228 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ola.Puffin 1.0 | 6930 | 537 (7.7%) | 1525 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ola.Puffin 1.0 | 650 | 347 | 400 | 215 | 91.1 / 5.8 | 5177 | 3948 | 566 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ola.Puffin 1.0 | 9.9% | 223 | 64 | 3 | 12.7 | 534 / 537 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ola.Puffin 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ola.Puffin 1.0 | ola.Puffin | 1 | 35 | 272 | 11.2% | 6.1% ± 2.5 | 31.6% | 45.3% / 46.5% | 0.5% | 0 / 0 | T2/M? | 97% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
