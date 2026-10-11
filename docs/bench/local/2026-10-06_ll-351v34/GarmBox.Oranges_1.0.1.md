# GarmBox.Oranges 1.0.1 (weak) vs hadur2.Hadur 3.5.1

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 76.8% | 88.6% | 67.2% | 31 / 35 | 22.0% | 13.4% | 11 | 0 | 0.80 / 12.4 | 92.8% | -15.9 |
| 2 | 77.8% | 94.3% | 64.8% | 33 / 35 | 22.2% | 13.7% | 14 | 0 | 0.87 / 11.5 | 89.4% | -11.6 |
| 3 | 83.7% | 94.3% | 74.4% | 33 / 35 | 23.8% | 9.1% | 6 | 0 | 0.70 / 12.4 | 95.3% | -11.6 |
| 4 | 73.2% | 80.0% | 67.2% | 28 / 35 | 27.4% | 13.7% | 15 | 0 | 0.87 / 10.6 | 88.0% | -14.9 |
| 5 | 87.6% | 97.1% | 78.8% | 34 / 35 | 24.0% | 8.2% | 11 | 0 | 0.68 / 11.7 | 93.5% | -5.9 |
| 6 | 87.2% | 97.1% | 78.4% | 34 / 35 | 26.1% | 7.7% | 12 | 0 | 0.71 / 11.2 | 90.6% | -3.4 |
| 7 | 77.7% | 91.2% | 68.1% | 32 / 35 | 27.5% | 15.0% | 4 | 0 | 0.78 / 13.9 | 95.6% | -17.9 |
| 8 | 71.3% | 80.0% | 63.8% | 28 / 35 | 21.3% | 13.2% | 6 | 0 | 0.76 / 12.9 | 91.8% | -20.4 |

Mean score share 79.4% ± 5.1, baseline 92.1% ± 2.3, paired diff -12.7 ± 4.9.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 79 over 8 battles (9.9 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | weak | 79.4% ± 5.1 | 90.3% ± 5.8 | 70.3% ± 5.0 | 253 / 280 | 24.3% ± 2.1 | 11.8% ± 2.4 | 79 | 0 | 0.87 / 13.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | 8 | 5 | 0 | 0 | 0.28 | 3 | 3 | 0 |

5 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | 6404 | 12 | 6415 | 6382 (99.7%) | 22 (0.3%) | 33 (0.5%) | 1115 | 183 | 28 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| GarmBox.Oranges 1.0.1 | 6044 | 529 (8.8%) | 3233 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | 650 | 445 | 541 | 350 | 61.3 / 26.3 | 3868 | 3293 | 675 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | 11.8% | 79 | 184 | 2 | 22.6 | 528 / 529 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
