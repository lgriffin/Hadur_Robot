# japs.Serenity 1.0 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 98.9% | 100.0% | 100.0% | 35 / 35 | 31.4% | 0.0% | 13 | 0 | 0.60 / 15.5 | 99.7% | -0.8 |
| 2 | 99.5% | 100.0% | 100.0% | 35 / 35 | 29.8% | 0.0% | 12 | 0 | 0.65 / 15.4 | 99.8% | -0.4 |
| 3 | 100.0% | 100.0% | 100.0% | 35 / 35 | 31.1% | 0.0% | 9 | 0 | 0.62 / 14.4 | 100.0% | -0.0 |
| 4 | 100.0% | 100.0% | 100.0% | 35 / 35 | 31.7% | 0.0% | 13 | 0 | 0.61 / 14.1 | 100.0% | -0.0 |
| 5 | 99.9% | 100.0% | 100.0% | 35 / 35 | 28.4% | 0.0% | 12 | 0 | 0.59 / 15.1 | 99.3% | +0.6 |
| 6 | 99.0% | 100.0% | 100.0% | 35 / 35 | 32.5% | 0.0% | 13 | 0 | 0.59 / 13.9 | 99.9% | -0.9 |
| 7 | 100.0% | 100.0% | 100.0% | 35 / 35 | 32.5% | 0.0% | 11 | 0 | 0.60 / 9.2 | 99.5% | +0.5 |
| 8 | 99.8% | 100.0% | 100.0% | 35 / 35 | 32.7% | 0.0% | 11 | 0 | 0.63 / 14.5 | 100.0% | -0.2 |
| 9 | 100.0% | 100.0% | 100.0% | 35 / 35 | 31.2% | 0.0% | 12 | 0 | 0.60 / 14.3 | 100.0% | +0.0 |
| 10 | 100.0% | 100.0% | 100.0% | 35 / 35 | 30.9% | 0.0% | 14 | 0 | 0.59 / 13.4 | 98.9% | +1.1 |
| 11 | 98.4% | 100.0% | 100.0% | 35 / 35 | 31.2% | 0.0% | 12 | 0 | 0.56 / 14.5 | 99.9% | -1.5 |
| 12 | 99.8% | 100.0% | 100.0% | 35 / 35 | 29.8% | 0.0% | 9 | 0 | 0.58 / 7.3 | 99.9% | -0.1 |
| 13 | 99.4% | 100.0% | 100.0% | 35 / 35 | 33.9% | 0.0% | 13 | 0 | 0.57 / 12.2 | 99.7% | -0.3 |
| 14 | 100.0% | 100.0% | 100.0% | 35 / 35 | 31.9% | 0.0% | 13 | 0 | 0.57 / 12.4 | 99.9% | +0.1 |
| 15 | 99.5% | 100.0% | 100.0% | 35 / 35 | 28.8% | 0.0% | 14 | 0 | 0.60 / 15.4 | 99.2% | +0.3 |
| 16 | 100.0% | 100.0% | 100.0% | 35 / 35 | 30.1% | 0.0% | 11 | 0 | 0.59 / 15.1 | 100.0% | +0.0 |

Mean score share 99.6% ± 0.3, baseline 99.7% ± 0.2, paired diff -0.1 ± 0.3.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 192 over 16 battles (12.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| japs.Serenity 1.0 | weak | 99.6% ± 0.3 | 100.0% ± 0.0 | 100.0% ± 0.0 | 560 / 560 | 31.1% ± 0.8 | 0.0% ± 0.0 | 192 | 0 | 0.65 / 15.5 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| japs.Serenity 1.0 | 0 | 0 | 45 | - | - | 45 (100.0%) | 740 | 0 | 57 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| japs.Serenity 1.0 | 17038 | 0 (0.0%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| japs.Serenity 1.0 | 650 | 514 | 650 | 459 | 97.3 / 0.0 | 3199 | 19 | 397 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| japs.Serenity 1.0 | 0.0% | 192 | 52 | 3 | 0.1 | - | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| japs.Serenity 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| japs.Serenity 1.0 | japs.Serenity | 1 | 35 | 284 | 0.0% | 0.0% ± 42.9 | 24.0% | 48.3% / 39.8% | 1.2% | 0 / 0 | T?/M? | 100% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
