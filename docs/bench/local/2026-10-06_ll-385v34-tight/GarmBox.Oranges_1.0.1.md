# GarmBox.Oranges 1.0.1 (weak) vs hadur2.Hadur 3.8.5

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 43.4% | 51.4% | 38.9% | 18 / 35 | 27.4% | 150.2% | 142 | 0 | 0.32 / 8.4 | 44.7% | -1.3 |
| 2 | 43.5% | 52.9% | 37.8% | 19 / 35 | 26.0% | 109.2% | 155 | 0 | 0.29 / 8.1 | 38.2% | +5.2 |
| 3 | 50.2% | 62.9% | 41.4% | 22 / 35 | 27.9% | 130.5% | 136 | 0 | 0.34 / 7.8 | 44.3% | +5.9 |
| 4 | 51.5% | 68.6% | 40.7% | 24 / 35 | 23.9% | 131.8% | 156 | 0 | 0.31 / 8.4 | 38.9% | +12.6 |
| 5 | 45.8% | 54.3% | 40.6% | 19 / 35 | 24.6% | 122.9% | 140 | 0 | 0.33 / 8.3 | 46.5% | -0.7 |
| 6 | 52.2% | 68.6% | 42.2% | 24 / 35 | 23.2% | 132.7% | 156 | 0 | 0.33 / 9.0 | 41.7% | +10.5 |
| 7 | 44.3% | 54.3% | 38.3% | 19 / 35 | 22.2% | 98.0% | 153 | 0 | 0.33 / 8.4 | 35.6% | +8.7 |
| 8 | 50.6% | 65.7% | 42.5% | 23 / 35 | 24.1% | 105.5% | 145 | 0 | 0.33 / 8.2 | 55.0% | -4.4 |

Mean score share 47.7% ± 3.2, baseline 43.1% ± 5.1, paired diff +4.6 ± 5.1.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1183 over 8 battles (147.9 per battle, most in one battle 156). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | weak | 47.7% ± 3.2 | 59.8% ± 6.1 | 40.3% ± 1.5 | 168 / 280 | 24.9% ± 1.7 | 122.6% ± 14.4 | 1183 | 0 | 0.34 / 9.0 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | 8 | 0 | 99984 | 0 | 4.23 | 4 | 4 | 0 |

0 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | 8220 | 9 | 1518 | 1501 (18.3%) | 6719 (81.7%) | 17 (1.1%) | 348 | 36 | 1251 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| GarmBox.Oranges 1.0.1 | 8935 | 398 (4.5%) | 315 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | 650 | 399 | 513 | 468 | 40.5 / 60.1 | 567 | 282 | 133 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | 122.6% | 1183 | 17 | 3 | 5.3 | 59 / 398 (15%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | GarmBox.Oranges | 1 | 35 | 296 | 5.0% | 5.9% ± 5.7 | 11.9% | 28.9% / 29.6% | 17.8% | 0 / 0 | T?/M? | 65% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
