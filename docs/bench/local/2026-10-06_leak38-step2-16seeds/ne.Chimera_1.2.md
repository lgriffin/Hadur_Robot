# ne.Chimera 1.2 (lower) vs hadur2.Hadur 3.8.1

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 98.1% | 100.0% | 62.3% | 35 / 35 | 0.8% | 0.4% | 8 | 0 | 0.81 / 15.4 | 96.5% | +1.6 |
| 2 | 100.0% | 100.0% | 100.0% | 35 / 35 | 0.8% | 0.0% | 6 | 0 | 0.65 / 13.9 | 98.8% | +1.2 |
| 3 | 99.5% | 100.0% | 79.6% | 35 / 35 | 0.4% | 0.1% | 6 | 0 | 0.76 / 13.4 | 99.5% | +0.0 |
| 4 | 93.7% | 97.1% | 28.6% | 34 / 35 | 0.5% | 0.4% | 3 | 0 | 0.70 / 17.7 | 99.7% | -5.9 |
| 5 | 96.5% | 100.0% | 42.3% | 35 / 35 | 0.7% | 0.5% | 10 | 0 | 0.87 / 25.1 | 98.5% | -2.1 |
| 6 | 93.7% | 97.1% | 35.6% | 34 / 35 | 0.5% | 0.4% | 3 | 0 | 0.74 / 16.3 | 98.9% | -5.2 |
| 7 | 99.0% | 100.0% | 71.3% | 35 / 35 | 0.5% | 0.2% | 8 | 0 | 0.75 / 16.2 | 97.4% | +1.6 |
| 8 | 97.3% | 100.0% | 45.9% | 35 / 35 | 0.6% | 0.4% | 7 | 0 | 0.83 / 14.2 | 93.4% | +4.0 |
| 9 | 99.5% | 100.0% | 80.0% | 35 / 35 | 0.4% | 0.1% | 7 | 0 | 0.79 / 14.6 | 99.5% | -0.1 |
| 10 | 100.0% | 100.0% | 100.0% | 35 / 35 | 0.3% | 0.0% | 6 | 0 | 0.71 / 17.8 | 100.0% | +0.0 |
| 11 | 99.0% | 100.0% | 72.0% | 35 / 35 | 0.6% | 0.2% | 40 | 0 | 0.88 / 17.0 | 98.9% | +0.1 |
| 12 | 95.6% | 100.0% | 65.4% | 35 / 35 | 2.6% | 1.1% | 9 | 0 | 0.85 / 129.0 | 97.3% | -1.7 |
| 13 | 99.5% | 100.0% | 92.5% | 35 / 35 | 2.4% | 0.2% | 7 | 0 | 0.73 / 15.8 | 100.0% | -0.5 |
| 14 | 98.1% | 100.0% | 65.0% | 35 / 35 | 1.1% | 0.5% | 9 | 0 | 0.60 / 12.2 | 97.7% | +0.3 |
| 15 | 98.8% | 100.0% | 69.3% | 35 / 35 | 0.7% | 0.2% | 6 | 0 | 0.64 / 16.3 | 97.5% | +1.3 |
| 16 | 92.1% | 97.1% | 48.3% | 34 / 35 | 1.4% | 1.5% | 10 | 0 | 0.71 / 16.2 | 98.2% | -6.2 |

Mean score share 97.5% ± 1.3, baseline 98.2% ± 0.9, paired diff -0.7 ± 1.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 145 over 16 battles (9.1 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ne.Chimera 1.2 | lower | 97.5% ± 1.3 | 99.5% ± 0.6 | 66.1% ± 11.6 | 557 / 560 | 0.9% ± 0.4 | 0.4% ± 0.2 | 145 | 0 | 0.88 / 129.0 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ne.Chimera 1.2 | 512 | 1 | 494 | 494 (96.5%) | 18 (3.5%) | 0 (0.0%) | 24 | 14 | 31 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ne.Chimera 1.2 | 581 | 41 (7.1%) | 28 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ne.Chimera 1.2 | 650 | 351 | 634 | 16 | 2.0 / 1.2 | 15 | 236 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ne.Chimera 1.2 | 0.4% | 145 | 29 | 3 | 0.9 | 39 / 41 (95%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ne.Chimera 1.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ne.Chimera 1.2 | ne.Chimera | 1 | 35 | 272 | 18.8% | 15.0% ± 14.8 | 25.6% | 25.7% / 18.7% | 0.0% | 0 / 0 | T?/M? | 94% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
