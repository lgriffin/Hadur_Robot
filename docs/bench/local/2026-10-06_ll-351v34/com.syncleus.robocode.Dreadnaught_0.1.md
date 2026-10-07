# com.syncleus.robocode.Dreadnaught 0.1 (weak) vs hadur2.Hadur 3.5.1

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 73.5% | 91.4% | 64.3% | 32 / 35 | 49.4% | 58.7% | 13 | 0 | 0.65 / 13.9 | 88.3% | -14.8 |
| 2 | 77.2% | 100.0% | 65.5% | 35 / 35 | 50.0% | 40.3% | 10 | 0 | 0.61 / 9.2 | 86.3% | -9.1 |
| 3 | 76.2% | 97.1% | 65.4% | 34 / 35 | 52.4% | 39.4% | 10 | 0 | 0.67 / 10.4 | 88.8% | -12.7 |
| 4 | 77.0% | 94.3% | 67.4% | 33 / 35 | 53.0% | 35.2% | 11 | 0 | 0.63 / 11.7 | 89.6% | -12.6 |
| 5 | 78.7% | 100.0% | 67.2% | 35 / 35 | 49.9% | 35.1% | 12 | 0 | 0.64 / 10.8 | 90.9% | -12.2 |
| 6 | 73.7% | 91.4% | 64.9% | 32 / 35 | 52.0% | 39.0% | 12 | 0 | 0.63 / 10.2 | 88.3% | -14.6 |
| 7 | 75.7% | 94.3% | 65.8% | 33 / 35 | 50.5% | 36.8% | 15 | 0 | 0.61 / 10.0 | 89.3% | -13.6 |
| 8 | 76.8% | 97.1% | 65.9% | 34 / 35 | 53.3% | 39.3% | 8 | 0 | 0.61 / 11.2 | 89.2% | -12.4 |

Mean score share 76.1% ± 1.5, baseline 88.8% ± 1.1, paired diff -12.8 ± 1.5.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 91 over 8 battles (11.4 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | weak | 76.1% ± 1.5 | 95.7% ± 2.9 | 65.8% ± 0.9 | 268 / 280 | 51.3% ± 1.3 | 40.5% ± 6.4 | 91 | 0 | 0.67 / 13.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 7 | 398 | 0 | 0.33 | 0 | 0 | 0 |

7 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 3537 | 22 | 3516 | 3515 (99.4%) | 22 (0.6%) | 1 (0.0%) | 394 | 200 | 52 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 3591 | 175 (4.9%) | 395 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 650 | 280 | 650 | 225 | 100.5 / 52.4 | 2978 | 2685 | 171 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 40.5% | 91 | 94 | 3 | 12.5 | 172 / 175 (98%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
