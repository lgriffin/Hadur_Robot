# exauge.Leopard 1.1.019 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 82.7% | 100.0% | 73.1% | 35 / 35 | 82.1% | 41.7% | 11 | 0 | 0.52 / 8.7 | 70.9% | +11.8 |
| 2 | 78.7% | 97.1% | 70.2% | 34 / 35 | 80.7% | 42.1% | 14 | 0 | 0.53 / 10.0 | 71.4% | +7.3 |
| 3 | 84.7% | 100.0% | 76.1% | 35 / 35 | 77.7% | 37.0% | 9 | 0 | 0.58 / 9.5 | 72.5% | +12.3 |
| 4 | 81.9% | 97.1% | 73.5% | 34 / 35 | 77.4% | 34.4% | 8 | 0 | 0.51 / 7.8 | 66.7% | +15.2 |
| 5 | 80.1% | 97.1% | 71.4% | 34 / 35 | 80.8% | 45.8% | 10 | 0 | 0.57 / 9.5 | 66.6% | +13.5 |
| 6 | 85.3% | 100.0% | 76.5% | 35 / 35 | 80.0% | 34.2% | 11 | 0 | 0.55 / 8.4 | 74.0% | +11.3 |
| 7 | 83.0% | 100.0% | 73.5% | 35 / 35 | 81.2% | 40.0% | 10 | 0 | 0.56 / 12.8 | 72.1% | +10.9 |
| 8 | 84.6% | 100.0% | 76.0% | 35 / 35 | 80.5% | 34.8% | 9 | 0 | 0.54 / 8.3 | 73.2% | +11.4 |
| 9 | 81.5% | 100.0% | 71.8% | 35 / 35 | 79.6% | 43.4% | 10 | 0 | 0.53 / 10.6 | 71.3% | +10.3 |
| 10 | 84.0% | 100.0% | 74.8% | 35 / 35 | 80.2% | 34.0% | 13 | 0 | 0.57 / 9.1 | 73.6% | +10.4 |
| 11 | 81.4% | 97.1% | 73.2% | 34 / 35 | 80.3% | 38.6% | 11 | 0 | 0.54 / 8.5 | 71.2% | +10.2 |
| 12 | 83.1% | 100.0% | 73.7% | 35 / 35 | 82.5% | 42.1% | 11 | 0 | 0.55 / 8.6 | 71.3% | +11.8 |
| 13 | 83.7% | 100.0% | 75.6% | 35 / 35 | 80.9% | 36.7% | 11 | 0 | 0.56 / 8.6 | 71.9% | +11.8 |
| 14 | 85.5% | 100.0% | 77.1% | 35 / 35 | 80.8% | 34.3% | 11 | 0 | 0.56 / 9.2 | 71.8% | +13.7 |
| 15 | 83.4% | 100.0% | 73.8% | 35 / 35 | 77.3% | 38.1% | 11 | 0 | 0.57 / 8.8 | 70.1% | +13.3 |
| 16 | 84.3% | 100.0% | 75.2% | 35 / 35 | 77.5% | 35.1% | 10 | 0 | 0.58 / 9.1 | 70.2% | +14.1 |

Mean score share 83.0% ± 1.0, baseline 71.2% ± 1.1, paired diff +11.8 ± 1.0.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 170 over 16 battles (10.6 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | weak | 83.0% ± 1.0 | 99.3% ± 0.7 | 74.1% ± 1.0 | 556 / 560 | 80.0% ± 0.9 | 38.3% ± 2.0 | 170 | 0 | 0.58 / 12.8 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 16 | 14 | 109 | 0 | 0.30 | 1 | 0 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 4379 | 25 | 4368 | 4361 (99.6%) | 18 (0.4%) | 7 (0.2%) | 627 | 449 | 37 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| exauge.Leopard 1.1.019 | 4259 | 92 (2.2%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 650 | 204 | 478 | 140 | 101.4 / 35.6 | 3602 | 5599 | 34 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 38.3% | 170 | 41 | 3 | 7.8 | 92 / 92 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| exauge.Leopard 1.1.019 | exauge.Leopard | 1 | 35 | 296 | 44.6% | 11.6% ± 3.9 | 44.9% | 19.4% / 19.7% | 3.9% | 0 / 0 | T?/M? | 80% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
