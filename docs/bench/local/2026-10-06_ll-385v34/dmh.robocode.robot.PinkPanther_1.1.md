# dmh.robocode.robot.PinkPanther 1.1 (weak) vs hadur2.Hadur 3.8.5

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 64.7% | 82.9% | 41.3% | 29 / 35 | 10.1% | 5.7% | 16 | 0 | 1.10 / 16.0 | 75.9% | -11.2 |
| 2 | 68.6% | 88.6% | 47.5% | 31 / 35 | 10.8% | 5.9% | 16 | 0 | 1.04 / 14.1 | 65.8% | +2.7 |
| 3 | 78.0% | 88.6% | 68.5% | 31 / 35 | 22.3% | 6.8% | 10 | 0 | 0.92 / 12.7 | 69.5% | +8.5 |
| 4 | 66.0% | 91.4% | 36.8% | 32 / 35 | 10.2% | 6.8% | 20 | 0 | 1.10 / 14.1 | 73.0% | -7.0 |
| 5 | 63.4% | 82.9% | 42.0% | 29 / 35 | 10.7% | 6.5% | 18 | 0 | 1.07 / 13.0 | 75.6% | -12.2 |
| 6 | 58.9% | 80.0% | 36.0% | 28 / 35 | 9.3% | 6.0% | 18 | 0 | 1.07 / 14.5 | 66.2% | -7.3 |
| 7 | 70.7% | 88.6% | 49.9% | 31 / 35 | 11.9% | 6.0% | 12 | 0 | 1.02 / 13.2 | 71.1% | -0.4 |
| 8 | 55.0% | 80.0% | 28.3% | 28 / 35 | 8.9% | 7.0% | 16 | 0 | 1.05 / 16.2 | 70.1% | -15.1 |

Mean score share 65.6% ± 5.9, baseline 70.9% ± 3.2, paired diff -5.2 ± 6.8.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 126 over 8 battles (15.8 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | weak | 65.6% ± 5.9 | 85.4% ± 3.7 | 43.8% ± 10.1 | 239 / 280 | 11.8% ± 3.6 | 6.3% ± 0.4 | 126 | 0 | 1.10 / 16.2 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 8 | 8 | 0 | 0 | 0.45 | 0 | 0 | 0 |

8 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 10835 | 319 | 10785 | 10784 (99.5%) | 51 (0.5%) | 1 (0.0%) | 712 | 103 | 68 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 12688 | 922 (7.3%) | 6066 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 650 | 596 | 616 | 609 | 25.8 / 31.4 | 525 | 12720 | 2442 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 6.3% | 126 | 309 | 3 | 37.3 | 919 / 922 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| dmh.robocode.robot.PinkPanther 1.1 | dmh.robocode.robot.PinkPanther | 1 | 35 | 352 | 8.0% | 9.5% ± 1.5 | 10.1% | 28.1% / 23.6% | 5.3% | 0 / 0 | T3/M0 | 53% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
