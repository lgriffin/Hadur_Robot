# rz.Aleph 0.34 (mid) vs hadur2.Hadur 3.7

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 5.5% | 0.0% | 11.1% | 0 / 35 | 3.2% | 130.9% | 105 | 0 | 0.46 / 9.5 | 5.4% | +0.1 |
| 2 | 6.4% | 0.0% | 12.8% | 0 / 35 | 3.8% | 118.2% | 105 | 0 | 0.45 / 8.7 | 5.5% | +0.9 |
| 3 | 4.5% | 0.0% | 9.3% | 0 / 35 | 2.6% | 189.6% | 105 | 0 | 0.47 / 9.5 | 7.2% | -2.7 |
| 4 | 5.6% | 0.0% | 11.5% | 0 / 35 | 3.0% | 110.8% | 106 | 0 | 0.42 / 9.1 | 6.2% | -0.6 |
| 5 | 6.6% | 0.0% | 13.6% | 0 / 35 | 3.0% | 123.7% | 107 | 0 | 0.45 / 8.8 | 4.4% | +2.3 |
| 6 | 5.5% | 2.9% | 8.8% | 1 / 35 | 2.6% | 130.3% | 115 | 0 | 0.48 / 9.7 | 5.0% | +0.5 |
| 7 | 6.5% | 0.0% | 13.0% | 0 / 35 | 3.4% | 155.7% | 108 | 0 | 0.47 / 9.0 | 3.6% | +2.9 |
| 8 | 3.7% | 0.0% | 7.9% | 0 / 35 | 1.6% | 150.4% | 106 | 0 | 0.49 / 9.4 | 5.8% | -2.0 |

Mean score share 5.5% ± 0.8, baseline 5.4% ± 0.9, paired diff +0.2 ± 1.6.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 857 over 8 battles (107.1 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rz.Aleph 0.34 | mid | 5.5% ± 0.8 | 0.4% ± 0.8 | 11.0% ± 1.8 | 1 / 280 | 2.9% ± 0.6 | 138.7% ± 21.4 | 857 | 0 | 0.49 / 9.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rz.Aleph 0.34 | 8 | 0 | 120374 | 0 | 3.06 | 8 | 8 | 0 |

0 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| rz.Aleph 0.34 | 9001 | 44 | 1180 | 1175 (13.1%) | 7826 (86.9%) | 5 (0.4%) | 0 | 3 | 1105 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| rz.Aleph 0.34 | 10461 | 497 (4.8%) | 68 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| rz.Aleph 0.34 | 650 | 446 | 650 | 534 | 7.7 / 61.7 | 37 | 0 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| rz.Aleph 0.34 | 138.7% | 857 | 14 | 3 | 4.1 | 50 / 497 (10%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| rz.Aleph 0.34 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
