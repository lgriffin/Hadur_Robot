# aw.Gilgalad 1.99.5c (rumble-12) vs hadur2.Hadur 3.9

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 53.4% | 65.7% | 41.7% | 23 / 35 | 10.3% | 10.9% | 29 | 0 | 1.47 / 19.0 | 56.8% | -3.4 |
| 2 | 42.9% | 48.6% | 38.0% | 17 / 35 | 8.3% | 9.3% | 30 | 0 | 1.49 / 20.7 | 53.6% | -10.7 |
| 3 | 49.4% | 57.1% | 41.4% | 20 / 35 | 9.7% | 9.6% | 25 | 0 | 1.49 / 19.0 | 40.8% | +8.6 |
| 4 | 48.1% | 57.1% | 39.2% | 20 / 35 | 10.2% | 10.2% | 25 | 0 | 1.50 / 19.2 | 51.1% | -3.0 |
| 5 | 53.8% | 65.7% | 41.8% | 23 / 35 | 9.5% | 10.7% | 37 | 0 | 1.47 / 20.4 | 61.7% | -7.9 |
| 6 | 50.7% | 62.9% | 38.4% | 22 / 35 | 8.3% | 10.4% | 35 | 0 | 1.46 / 20.2 | 43.2% | +7.5 |
| 7 | 38.6% | 45.7% | 32.3% | 16 / 35 | 7.3% | 10.6% | 30 | 0 | 1.48 / 18.6 | 39.7% | -1.1 |
| 8 | 44.6% | 54.3% | 34.6% | 19 / 35 | 7.2% | 9.9% | 26 | 0 | 1.46 / 20.1 | 47.3% | -2.8 |
| 9 | 44.0% | 51.4% | 36.9% | 18 / 35 | 8.1% | 9.8% | 24 | 0 | 1.53 / 18.8 | 53.0% | -9.0 |
| 10 | 54.0% | 62.9% | 44.8% | 22 / 35 | 11.0% | 10.8% | 28 | 0 | 1.52 / 18.1 | 45.3% | +8.6 |

Mean score share 47.9% ± 3.8, baseline 49.3% ± 5.1, paired diff -1.3 ± 5.2.

## Full report

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 289 over 10 battles (28.9 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | rumble-12 | 47.9% ± 3.8 | 57.1% ± 5.1 | 38.9% ± 2.7 | 200 / 350 | 9.0% ± 0.9 | 10.2% ± 0.4 | 289 | 0 | 1.53 / 20.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 10 | 8 | 74 | 0 | 0.83 | 2 | 2 | 0 |

8 of 10 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 48660 | 19 | 49046 | 48651 (100.0%) | 9 (0.0%) | 395 (0.8%) | 3846 | 423 | 227 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| aw.Gilgalad 1.99.5c | 49891 | 5267 (10.6%) | 47432 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 650 | 480 | 650 | 1697 | 23.2 / 36.2 | 558 | 38929 | 24 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 10.2% | 289 | 5877 | 3 | 139.3 | 5261 / 5267 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | aw.Gilgalad | 1 | 35 | 284 | 11.1% | 7.9% ± 0.8 | 11.7% | 22.4% / 21.8% | 4.9% | 0 / 0 | T3/M1 | 53% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
