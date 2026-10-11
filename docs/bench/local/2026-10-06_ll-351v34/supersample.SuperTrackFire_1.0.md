# supersample.SuperTrackFire 1.0 (weak) vs hadur2.Hadur 3.5.1

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 93.8% | 100.0% | 85.9% | 35 / 35 | 17.9% | 2.7% | 11 | 0 | 0.77 / 13.0 | 96.8% | -2.9 |
| 2 | 95.7% | 100.0% | 90.4% | 35 / 35 | 20.5% | 2.2% | 12 | 0 | 0.66 / 9.3 | 95.0% | +0.7 |
| 3 | 96.5% | 100.0% | 91.7% | 35 / 35 | 18.3% | 1.9% | 10 | 0 | 0.67 / 11.8 | 93.8% | +2.7 |
| 4 | 96.0% | 100.0% | 90.5% | 35 / 35 | 17.9% | 1.7% | 12 | 0 | 0.75 / 12.7 | 97.5% | -1.5 |
| 5 | 95.4% | 100.0% | 89.7% | 35 / 35 | 20.3% | 2.3% | 10 | 0 | 0.69 / 9.3 | 95.0% | +0.4 |
| 6 | 95.8% | 100.0% | 90.1% | 35 / 35 | 18.2% | 1.8% | 13 | 0 | 0.74 / 9.0 | 95.9% | -0.2 |
| 7 | 94.4% | 100.0% | 87.2% | 35 / 35 | 19.9% | 19.0% | 15 | 0 | 0.64 / 10.7 | 93.5% | +0.9 |
| 8 | 96.1% | 100.0% | 91.0% | 35 / 35 | 18.2% | 2.0% | 11 | 0 | 0.75 / 12.8 | 94.2% | +1.9 |

Mean score share 95.5% ± 0.8, baseline 95.2% ± 1.2, paired diff +0.2 ± 1.5.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 94 over 8 battles (11.8 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| supersample.SuperTrackFire 1.0 | weak | 95.5% ± 0.8 | 100.0% ± 0.0 | 89.6% ± 1.7 | 280 / 280 | 18.9% ± 0.9 | 4.2% ± 5.0 | 94 | 0 | 0.77 / 13.0 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| supersample.SuperTrackFire 1.0 | 8 | 7 | 468 | 0 | 0.34 | 0 | 0 | 0 |

7 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| supersample.SuperTrackFire 1.0 | 5690 | 25 | 5721 | 5633 (99.0%) | 57 (1.0%) | 88 (1.5%) | 867 | 119 | 29 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| supersample.SuperTrackFire 1.0 | 5942 | 332 (5.6%) | 1445 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| supersample.SuperTrackFire 1.0 | 650 | 426 | 400 | 331 | 47.9 / 5.6 | 1863 | 6165 | 598 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| supersample.SuperTrackFire 1.0 | 4.2% | 94 | 108 | 3 | 20.4 | 329 / 332 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| supersample.SuperTrackFire 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
