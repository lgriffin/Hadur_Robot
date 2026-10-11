# jwst.DAD.DarkAndDarker 1.1 (weak) vs hadur2.Hadur 3.7

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 16.9% | 2.9% | 25.0% | 1 / 35 | 18.5% | 303.8% | 115 | 0 | 0.43 / 10.3 | 12.9% | +4.0 |
| 2 | 16.5% | 2.9% | 23.9% | 1 / 35 | 15.6% | 272.1% | 115 | 0 | 0.39 / 10.4 | 18.3% | -1.8 |
| 3 | 22.4% | 8.6% | 31.0% | 3 / 35 | 20.6% | 267.3% | 112 | 0 | 0.43 / 9.6 | 14.8% | +7.6 |
| 4 | 18.7% | 5.7% | 26.1% | 2 / 35 | 16.3% | 299.5% | 111 | 0 | 0.40 / 9.5 | 13.9% | +4.8 |
| 5 | 25.9% | 14.3% | 33.8% | 5 / 35 | 21.7% | 182.7% | 113 | 0 | 0.40 / 8.8 | 23.9% | +2.0 |
| 6 | 18.8% | 5.7% | 27.5% | 2 / 35 | 16.3% | 282.7% | 112 | 0 | 0.41 / 9.1 | 19.9% | -1.0 |
| 7 | 21.3% | 5.7% | 29.4% | 2 / 35 | 17.1% | 226.5% | 116 | 0 | 0.39 / 9.0 | 15.9% | +5.3 |
| 8 | 19.8% | 5.7% | 27.6% | 2 / 35 | 17.3% | 240.3% | 106 | 0 | 0.38 / 9.7 | 19.7% | +0.1 |

Mean score share 20.0% ± 2.6, baseline 17.4% ± 3.1, paired diff +2.6 ± 2.8.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 900 over 8 battles (112.5 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jwst.DAD.DarkAndDarker 1.1 | weak | 20.0% ± 2.6 | 6.4% ± 3.1 | 28.0% ± 2.7 | 18 / 280 | 17.9% ± 1.8 | 259.4% ± 34.1 | 900 | 0 | 0.43 / 10.4 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jwst.DAD.DarkAndDarker 1.1 | 8 | 0 | 85265 | 0 | 3.21 | 9 | 8 | 0 |

0 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jwst.DAD.DarkAndDarker 1.1 | 7234 | 25 | 1190 | 1188 (16.4%) | 6046 (83.6%) | 2 (0.2%) | 63 | 31 | 864 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jwst.DAD.DarkAndDarker 1.1 | 7709 | 363 (4.7%) | 61 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jwst.DAD.DarkAndDarker 1.1 | 650 | 365 | 400 | 406 | 30.3 / 77.4 | 231 | 33 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jwst.DAD.DarkAndDarker 1.1 | 259.4% | 900 | 17 | 3 | 4.1 | 73 / 363 (20%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jwst.DAD.DarkAndDarker 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
