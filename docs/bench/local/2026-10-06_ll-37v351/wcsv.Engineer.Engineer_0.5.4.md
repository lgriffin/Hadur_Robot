# wcsv.Engineer.Engineer 0.5.4 (mid) vs hadur2.Hadur 3.7

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 62.1% | 80.0% | 44.5% | 28 / 35 | 10.3% | 7.7% | 12 | 0 | 1.03 / 13.6 | 72.2% | -10.1 |
| 2 | 50.3% | 62.9% | 39.7% | 22 / 35 | 10.3% | 9.2% | 7 | 0 | 1.03 / 14.2 | 60.4% | -10.1 |
| 3 | 68.9% | 85.7% | 50.3% | 30 / 35 | 9.2% | 6.5% | 8 | 0 | 0.99 / 14.0 | 54.4% | +14.5 |
| 4 | 61.0% | 74.3% | 48.7% | 26 / 35 | 11.5% | 7.7% | 12 | 0 | 0.99 / 13.0 | 61.5% | -0.4 |
| 5 | 62.5% | 77.1% | 48.5% | 27 / 35 | 11.4% | 7.6% | 12 | 0 | 1.02 / 14.0 | 65.0% | -2.5 |
| 6 | 64.7% | 80.0% | 49.6% | 28 / 35 | 9.9% | 7.0% | 6 | 0 | 0.98 / 13.4 | 58.2% | +6.5 |
| 7 | 65.8% | 82.9% | 47.0% | 29 / 35 | 9.2% | 6.7% | 14 | 0 | 0.97 / 291.2 | 61.0% | +4.7 |
| 8 | 58.6% | 74.3% | 43.5% | 26 / 35 | 9.6% | 7.2% | 12 | 0 | 1.01 / 14.1 | 62.7% | -4.1 |

Mean score share 61.7% ± 4.7, baseline 61.9% ± 4.4, paired diff -0.2 ± 7.1.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 83 over 8 battles (10.4 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | mid | 61.7% ± 4.7 | 77.1% ± 5.9 | 46.5% ± 3.0 | 216 / 280 | 10.2% ± 0.7 | 7.4% ± 0.7 | 83 | 0 | 1.03 / 291.2 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 8 | 6 | 0 | 0 | 0.30 | 2 | 2 | 0 |

6 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 14141 | 86 | 14141 | 14141 (100.0%) | 0 (0.0%) | 0 (0.0%) | 618 | 138 | 36 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 15342 | 1253 (8.2%) | 10772 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 650 | 466 | 650 | 731 | 29.4 / 34.0 | 71 | 3127 | 1267 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 7.4% | 83 | 66 | 2 | 50.0 | 1249 / 1253 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
