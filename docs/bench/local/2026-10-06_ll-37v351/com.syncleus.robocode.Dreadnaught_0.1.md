# com.syncleus.robocode.Dreadnaught 0.1 (weak) vs hadur2.Hadur 3.7

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 78.1% | 97.1% | 67.8% | 34 / 35 | 52.5% | 33.5% | 10 | 0 | 0.60 / 9.9 | 76.3% | +1.9 |
| 2 | 77.6% | 100.0% | 66.0% | 35 / 35 | 53.4% | 38.7% | 13 | 0 | 0.65 / 10.0 | 78.6% | -1.0 |
| 3 | 77.9% | 100.0% | 66.3% | 35 / 35 | 53.2% | 38.6% | 11 | 0 | 0.60 / 9.7 | 74.8% | +3.1 |
| 4 | 76.5% | 97.1% | 65.7% | 34 / 35 | 55.5% | 41.6% | 11 | 0 | 0.64 / 9.1 | 75.5% | +1.0 |
| 5 | 77.5% | 97.1% | 67.1% | 34 / 35 | 54.8% | 37.8% | 9 | 0 | 0.58 / 45.4 | 76.4% | +1.1 |
| 6 | 74.7% | 94.3% | 64.6% | 33 / 35 | 47.5% | 37.8% | 12 | 0 | 0.61 / 9.5 | 77.2% | -2.5 |
| 7 | 74.0% | 94.3% | 63.8% | 33 / 35 | 51.9% | 41.9% | 9 | 0 | 0.56 / 9.1 | 74.9% | -0.9 |
| 8 | 75.8% | 97.1% | 64.8% | 34 / 35 | 51.4% | 40.0% | 7 | 0 | 0.58 / 9.3 | 74.7% | +1.1 |

Mean score share 76.5% ± 1.3, baseline 76.0% ± 1.1, paired diff +0.5 ± 1.5.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 82 over 8 battles (10.3 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | weak | 76.5% ± 1.3 | 97.1% ± 1.8 | 65.8% ± 1.1 | 272 / 280 | 52.5% ± 2.1 | 38.7% ± 2.2 | 82 | 0 | 0.65 / 45.4 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |

8 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 3484 | 27 | 3487 | 3484 (100.0%) | 0 (0.0%) | 3 (0.1%) | 353 | 193 | 20 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 3492 | 142 (4.1%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 650 | 273 | 650 | 221 | 101.7 / 53.0 | 3001 | 2276 | 82 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 38.7% | 82 | 29 | 3 | 12.4 | 142 / 142 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
