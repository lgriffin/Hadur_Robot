# theo.avenge.Pequod 1.0 (mid) vs hadur2.Hadur 3.5.1

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 74.3% | 88.6% | 59.2% | 31 / 35 | 10.4% | 5.9% | 14 | 0 | 1.28 / 17.7 | 62.8% | +11.5 |
| 2 | 72.2% | 85.7% | 57.5% | 30 / 35 | 11.0% | 6.5% | 13 | 0 | 1.28 / 18.2 | 65.7% | +6.5 |
| 3 | 75.6% | 88.6% | 60.9% | 31 / 35 | 11.4% | 5.6% | 8 | 0 | 1.27 / 18.1 | 73.0% | +2.6 |
| 4 | 76.4% | 94.3% | 57.2% | 33 / 35 | 10.1% | 6.0% | 12 | 0 | 1.31 / 19.0 | 74.2% | +2.2 |
| 5 | 70.7% | 82.9% | 57.7% | 29 / 35 | 10.4% | 6.4% | 8 | 0 | 1.30 / 16.4 | 69.2% | +1.5 |
| 6 | 80.5% | 97.1% | 61.0% | 34 / 35 | 10.0% | 5.1% | 12 | 0 | 1.28 / 15.8 | 67.0% | +13.5 |
| 7 | 66.8% | 80.0% | 53.6% | 28 / 35 | 11.6% | 7.1% | 7 | 0 | 1.31 / 17.0 | 68.6% | -1.9 |
| 8 | 69.6% | 85.7% | 52.0% | 30 / 35 | 8.6% | 6.1% | 10 | 0 | 1.29 / 19.6 | 62.6% | +7.0 |

Mean score share 73.3% ± 3.6, baseline 67.9% ± 3.6, paired diff +5.4 ± 4.4.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 84 over 8 battles (10.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| theo.avenge.Pequod 1.0 | mid | 73.3% ± 3.6 | 87.9% ± 4.7 | 57.4% ± 2.7 | 246 / 280 | 10.4% ± 0.8 | 6.1% ± 0.5 | 84 | 0 | 1.31 / 19.6 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| theo.avenge.Pequod 1.0 | 8 | 7 | 0 | 0 | 0.30 | 1 | 1 | 0 |

7 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| theo.avenge.Pequod 1.0 | 10338 | 5 | 10355 | 10333 (100.0%) | 5 (0.0%) | 22 (0.2%) | 571 | 109 | 57 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| theo.avenge.Pequod 1.0 | 15953 | 963 (6.0%) | 8444 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| theo.avenge.Pequod 1.0 | 650 | 528 | 650 | 759 | 34.5 / 25.6 | 102 | 2692 | 161 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| theo.avenge.Pequod 1.0 | 6.1% | 84 | 6977 | 3 | 36.8 | 962 / 963 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| theo.avenge.Pequod 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
