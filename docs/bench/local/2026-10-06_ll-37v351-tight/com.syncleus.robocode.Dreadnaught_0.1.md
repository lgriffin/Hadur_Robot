# com.syncleus.robocode.Dreadnaught 0.1 (weak) vs hadur2.Hadur 3.7

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 40.9% | 34.3% | 42.9% | 12 / 35 | 65.7% | 324.4% | 127 | 0 | 0.35 / 9.5 | 39.7% | +1.3 |
| 2 | 38.7% | 28.6% | 41.8% | 10 / 35 | 64.8% | 310.9% | 126 | 0 | 0.32 / 9.3 | 40.0% | -1.3 |
| 3 | 41.5% | 34.3% | 42.0% | 12 / 35 | 66.1% | 278.8% | 116 | 0 | 0.34 / 9.4 | 42.0% | -0.5 |
| 4 | 40.6% | 31.4% | 43.3% | 11 / 35 | 64.7% | 272.3% | 115 | 0 | 0.34 / 9.3 | 42.4% | -1.8 |
| 5 | 41.4% | 34.3% | 43.7% | 12 / 35 | 65.2% | 226.2% | 124 | 0 | 0.31 / 9.0 | 42.6% | -1.1 |
| 6 | 48.1% | 45.7% | 46.1% | 16 / 35 | 66.5% | 282.9% | 124 | 0 | 0.34 / 9.6 | 41.4% | +6.7 |
| 7 | 41.2% | 31.4% | 43.4% | 11 / 35 | 66.1% | 308.9% | 128 | 0 | 0.32 / 9.3 | 49.6% | -8.3 |
| 8 | 41.8% | 31.4% | 45.4% | 11 / 35 | 68.8% | 194.2% | 111 | 0 | 0.37 / 8.9 | 39.6% | +2.2 |

Mean score share 41.8% ± 2.3, baseline 42.2% ± 2.7, paired diff -0.4 ± 3.5.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 971 over 8 battles (121.4 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | weak | 41.8% ± 2.3 | 33.9% ± 4.3 | 43.6% ± 1.3 | 95 / 280 | 66.0% ± 1.1 | 274.8% ± 37.2 | 971 | 0 | 0.37 / 9.6 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 0 | 72765 | 0 | 3.47 | 3 | 3 | 0 |

0 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 4513 | 44 | 904 | 901 (20.0%) | 3612 (80.0%) | 3 (0.3%) | 65 | 33 | 1015 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 5950 | 112 (1.9%) | 13 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 650 | 298 | 413 | 340 | 77.6 / 100.5 | 730 | 81 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 274.8% | 971 | 16 | 3 | 3.2 | 30 / 112 (27%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
