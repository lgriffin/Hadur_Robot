# GarmBox.Oranges 1.0.1 (weak) vs hadur2.Hadur 3.9

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 86.7% | 100.0% | 75.8% | 35 / 35 | 27.0% | 10.0% | 13 | 0 | 0.78 / 11.8 | 80.8% | +5.9 |
| 2 | 91.3% | 94.3% | 87.8% | 33 / 35 | 25.1% | 4.1% | 11 | 0 | 0.68 / 11.3 | 78.5% | +12.8 |
| 3 | 92.0% | 100.0% | 85.1% | 35 / 35 | 26.9% | 6.1% | 8 | 0 | 0.66 / 11.7 | 79.6% | +12.3 |
| 4 | 91.7% | 100.0% | 84.1% | 35 / 35 | 32.5% | 7.8% | 12 | 0 | 0.71 / 11.1 | 76.1% | +15.6 |
| 5 | 88.7% | 94.3% | 83.5% | 33 / 35 | 27.2% | 6.0% | 13 | 0 | 0.58 / 10.1 | 75.3% | +13.4 |
| 6 | 93.7% | 100.0% | 89.0% | 35 / 35 | 31.0% | 5.5% | 10 | 0 | 0.58 / 9.2 | 79.4% | +14.4 |
| 7 | 85.8% | 97.1% | 76.1% | 34 / 35 | 29.3% | 10.7% | 13 | 0 | 0.82 / 9.6 | 79.4% | +6.4 |
| 8 | 90.0% | 100.0% | 82.1% | 35 / 35 | 33.1% | 9.6% | 12 | 0 | 0.71 / 12.8 | 73.0% | +17.0 |

Mean score share 90.0% ± 2.3, baseline 77.8% ± 2.2, paired diff +12.2 ± 3.4.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 92 over 8 battles (11.5 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | weak | 90.0% ± 2.3 | 98.2% ± 2.2 | 82.9% ± 4.1 | 275 / 280 | 29.0% ± 2.4 | 7.5% ± 2.0 | 92 | 0 | 0.82 / 12.8 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |

8 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | 4844 | 14 | 4851 | 4830 (99.7%) | 14 (0.3%) | 21 (0.4%) | 937 | 135 | 27 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| GarmBox.Oranges 1.0.1 | 4690 | 451 (9.6%) | 3948 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | 650 | 367 | 416 | 278 | 63.4 / 13.4 | 3181 | 3247 | 381 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | 7.5% | 92 | 36 | 3 | 17.3 | 448 / 451 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | GarmBox.Oranges | 1 | 35 | 296 | 9.5% | 5.5% ± 2.1 | 21.9% | 31.2% / 28.3% | 12.3% | 0 / 0 | T2/M? | 89% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
