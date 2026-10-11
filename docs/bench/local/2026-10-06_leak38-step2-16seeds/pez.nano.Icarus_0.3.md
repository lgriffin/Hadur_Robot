# pez.nano.Icarus 0.3 (weak) vs hadur2.Hadur 3.8.1

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 97.5% | 100.0% | 94.0% | 35 / 35 | 16.7% | 1.4% | 14 | 0 | 0.64 / 15.1 | 98.2% | -0.7 |
| 2 | 96.9% | 100.0% | 92.9% | 35 / 35 | 17.8% | 1.5% | 11 | 0 | 0.67 / 18.1 | 97.7% | -0.8 |
| 3 | 97.7% | 100.0% | 94.5% | 35 / 35 | 16.4% | 1.2% | 9 | 0 | 0.64 / 14.5 | 97.7% | +0.0 |
| 4 | 96.2% | 100.0% | 91.0% | 35 / 35 | 16.3% | 2.0% | 10 | 0 | 0.65 / 8.4 | 96.6% | -0.4 |
| 5 | 98.7% | 100.0% | 97.1% | 35 / 35 | 18.9% | 0.6% | 12 | 0 | 0.64 / 32.0 | 98.1% | +0.6 |
| 6 | 97.5% | 100.0% | 94.1% | 35 / 35 | 16.6% | 1.6% | 12 | 0 | 0.65 / 15.3 | 96.3% | +1.2 |
| 7 | 96.2% | 100.0% | 91.3% | 35 / 35 | 17.6% | 2.2% | 12 | 0 | 0.66 / 269.3 | 95.4% | +0.8 |
| 8 | 97.5% | 100.0% | 93.8% | 35 / 35 | 15.3% | 1.1% | 9 | 0 | 0.66 / 243.1 | 97.1% | +0.4 |
| 9 | 98.5% | 100.0% | 96.5% | 35 / 35 | 18.2% | 0.7% | 8 | 0 | 0.68 / 171.5 | 97.6% | +1.0 |
| 10 | 97.6% | 100.0% | 94.2% | 35 / 35 | 17.6% | 1.3% | 13 | 0 | 0.64 / 78.1 | 97.4% | +0.2 |
| 11 | 97.8% | 100.0% | 95.0% | 35 / 35 | 18.5% | 1.3% | 9 | 0 | 0.63 / 232.4 | 97.0% | +0.8 |
| 12 | 97.1% | 100.0% | 92.8% | 35 / 35 | 15.8% | 1.2% | 11 | 0 | 0.69 / 229.6 | 97.6% | -0.5 |
| 13 | 97.7% | 100.0% | 94.5% | 35 / 35 | 15.9% | 1.0% | 12 | 0 | 0.68 / 11.0 | 98.1% | -0.3 |
| 14 | 96.7% | 100.0% | 92.3% | 35 / 35 | 17.7% | 1.5% | 13 | 0 | 0.66 / 16.1 | 98.4% | -1.7 |
| 15 | 96.8% | 100.0% | 92.3% | 35 / 35 | 15.4% | 1.7% | 12 | 0 | 0.67 / 15.2 | 96.1% | +0.7 |
| 16 | 98.3% | 100.0% | 96.1% | 35 / 35 | 17.3% | 1.0% | 11 | 0 | 0.63 / 16.6 | 98.6% | -0.3 |

Mean score share 97.4% ± 0.4, baseline 97.4% ± 0.5, paired diff +0.1 ± 0.4.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 178 over 16 battles (11.1 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pez.nano.Icarus 0.3 | weak | 97.4% ± 0.4 | 100.0% ± 0.0 | 93.9% ± 0.9 | 560 / 560 | 17.0% ± 0.6 | 1.3% ± 0.2 | 178 | 0 | 0.69 / 269.3 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| pez.nano.Icarus 0.3 | 14334 | 32 | 14320 | 14278 (99.6%) | 56 (0.4%) | 42 (0.3%) | 1260 | 231 | 49 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| pez.nano.Icarus 0.3 | 14162 | 1080 (7.6%) | 8364 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| pez.nano.Icarus 0.3 | 650 | 356 | 400 | 392 | 47.5 / 3.1 | 4001 | 10823 | 3371 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| pez.nano.Icarus 0.3 | 1.3% | 178 | 73 | 3 | 25.6 | 1080 / 1080 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| pez.nano.Icarus 0.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| pez.nano.Icarus 0.3 | pez.nano.Icarus | 1 | 35 | 292 | 1.2% | 0.8% ± 0.7 | 15.3% | 26.1% / 23.3% | 6.7% | 0 / 0 | T0/M? | 98% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
