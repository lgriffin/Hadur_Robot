# dmh.robocode.robot.PinkPanther 1.1 (weak) vs hadur2.Hadur 3.9

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 86.2% | 100.0% | 72.1% | 35 / 35 | 19.9% | 6.1% | 9 | 0 | 0.89 / 14.3 | 62.9% | +23.3 |
| 2 | 67.2% | 85.7% | 45.8% | 30 / 35 | 10.3% | 6.0% | 19 | 0 | 1.06 / 14.6 | 67.5% | -0.3 |
| 3 | 65.1% | 80.0% | 49.6% | 28 / 35 | 10.8% | 6.1% | 14 | 0 | 1.07 / 13.0 | 69.0% | -3.9 |
| 4 | 63.4% | 88.6% | 37.7% | 31 / 35 | 9.6% | 6.9% | 18 | 0 | 1.10 / 15.0 | 70.3% | -6.9 |
| 5 | 74.9% | 94.3% | 51.0% | 33 / 35 | 10.8% | 4.9% | 15 | 0 | 0.99 / 14.3 | 66.2% | +8.7 |
| 6 | 66.8% | 88.6% | 38.7% | 31 / 35 | 10.8% | 6.5% | 14 | 0 | 1.10 / 14.5 | 65.4% | +1.4 |
| 7 | 50.8% | 68.6% | 35.2% | 24 / 35 | 9.6% | 7.8% | 11 | 0 | 1.03 / 15.6 | 69.7% | -18.9 |
| 8 | 52.1% | 74.3% | 30.7% | 26 / 35 | 10.8% | 7.8% | 9 | 0 | 1.05 / 15.9 | 57.7% | -5.6 |

Mean score share 65.8% ± 9.6, baseline 66.1% ± 3.5, paired diff -0.3 ± 10.3.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 109 over 8 battles (13.6 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | weak | 65.8% ± 9.6 | 85.0% ± 8.6 | 45.1% ± 10.9 | 238 / 280 | 11.6% ± 2.8 | 6.5% ± 0.8 | 109 | 0 | 1.10 / 15.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 8 | 5 | 0 | 0 | 0.39 | 3 | 3 | 0 |

5 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 10749 | 369 | 10763 | 10738 (99.9%) | 11 (0.1%) | 25 (0.2%) | 530 | 105 | 74 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 11435 | 822 (7.2%) | 6494 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 650 | 593 | 619 | 606 | 26.5 / 31.6 | 415 | 12611 | 2109 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 6.5% | 109 | 66 | 2 | 33.9 | 819 / 822 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | dmh.robocode.robot.PinkPanther | 1 | 35 | 352 | 9.2% | 9.4% ± 1.5 | 10.2% | 26.6% / 23.9% | 4.3% | 0 / 0 | T3/M0 | 52% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
