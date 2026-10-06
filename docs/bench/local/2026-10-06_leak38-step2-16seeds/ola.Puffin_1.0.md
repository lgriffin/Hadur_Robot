# ola.Puffin 1.0 (weak) vs hadur2.Hadur 3.8.1

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 98.4% | 100.0% | 97.2% | 35 / 35 | 55.0% | 5.0% | 11 | 0 | 0.61 / 9.4 | 98.4% | +0.0 |
| 2 | 98.8% | 100.0% | 97.8% | 35 / 35 | 58.8% | 5.3% | 12 | 0 | 0.53 / 9.9 | 98.5% | +0.3 |
| 3 | 97.8% | 100.0% | 96.0% | 35 / 35 | 52.6% | 7.6% | 8 | 0 | 0.71 / 125.5 | 96.5% | +1.3 |
| 4 | 96.8% | 97.1% | 96.3% | 34 / 35 | 51.1% | 4.2% | 11 | 0 | 0.69 / 296.9 | 96.1% | +0.6 |
| 5 | 96.9% | 100.0% | 95.9% | 35 / 35 | 53.2% | 8.1% | 14 | 0 | 0.79 / 221.7 | 95.1% | +1.8 |
| 6 | 95.9% | 100.0% | 93.3% | 35 / 35 | 50.9% | 11.7% | 31 | 0 | 0.85 / 26.6 | 96.0% | -0.2 |
| 7 | 99.0% | 100.0% | 98.1% | 35 / 35 | 49.9% | 4.2% | 16 | 0 | 0.72 / 49.2 | 96.3% | +2.7 |
| 8 | 97.5% | 100.0% | 95.5% | 35 / 35 | 52.2% | 7.2% | 13 | 0 | 0.84 / 223.7 | 99.0% | -1.5 |
| 9 | 96.1% | 100.0% | 93.0% | 35 / 35 | 50.8% | 12.5% | 13 | 0 | 0.87 / 214.2 | 98.4% | -2.4 |
| 10 | 97.7% | 100.0% | 95.8% | 35 / 35 | 50.5% | 7.9% | 13 | 0 | 0.80 / 162.8 | 98.8% | -1.1 |
| 11 | 97.9% | 100.0% | 96.1% | 35 / 35 | 49.1% | 5.5% | 10 | 0 | 0.77 / 48.7 | 95.9% | +1.9 |
| 12 | 96.4% | 100.0% | 93.6% | 35 / 35 | 49.1% | 9.4% | 16 | 0 | 0.84 / 206.3 | 95.4% | +1.0 |
| 13 | 96.0% | 100.0% | 92.8% | 35 / 35 | 50.2% | 11.7% | 15 | 0 | 0.85 / 260.2 | 97.5% | -1.5 |
| 14 | 97.0% | 100.0% | 95.0% | 35 / 35 | 52.0% | 9.1% | 14 | 0 | 0.80 / 153.5 | 96.7% | +0.3 |
| 15 | 98.7% | 100.0% | 98.1% | 35 / 35 | 54.9% | 3.8% | 12 | 0 | 0.67 / 199.5 | 97.2% | +1.5 |
| 16 | 96.8% | 100.0% | 94.9% | 35 / 35 | 51.3% | 7.5% | 17 | 0 | 0.70 / 185.0 | 96.2% | +0.6 |

Mean score share 97.4% ± 0.6, baseline 97.0% ± 0.7, paired diff +0.3 ± 0.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 226 over 16 battles (14.1 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ola.Puffin 1.0 | weak | 97.4% ± 0.6 | 99.8% ± 0.4 | 95.6% ± 0.9 | 559 / 560 | 52.0% ± 1.3 | 7.5% ± 1.5 | 226 | 0 | 0.87 / 296.9 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ola.Puffin 1.0 | 6796 | 59 | 6730 | 6725 (99.0%) | 71 (1.0%) | 5 (0.1%) | 124 | 238 | 208 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ola.Puffin 1.0 | 6601 | 489 (7.4%) | 2035 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ola.Puffin 1.0 | 650 | 334 | 400 | 206 | 90.6 / 4.2 | 4886 | 3847 | 201 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ola.Puffin 1.0 | 7.5% | 226 | 244 | 3 | 12.0 | 485 / 489 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ola.Puffin 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ola.Puffin 1.0 | ola.Puffin | 1 | 35 | 272 | 10.8% | 5.0% ± 2.2 | 33.2% | 44.5% / 46.4% | 0.5% | 0 / 0 | T2/M? | 97% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
