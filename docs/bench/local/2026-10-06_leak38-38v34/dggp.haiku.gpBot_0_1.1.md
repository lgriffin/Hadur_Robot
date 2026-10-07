# dggp.haiku.gpBot_0 1.1 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 85.8% | 94.3% | 77.0% | 33 / 35 | 21.3% | 5.6% | 15 | 0 | 0.79 / 11.5 | 92.6% | -6.8 |
| 2 | 91.3% | 100.0% | 83.0% | 35 / 35 | 28.3% | 5.0% | 13 | 0 | 0.67 / 63.0 | 93.7% | -2.4 |
| 3 | 91.8% | 100.0% | 83.4% | 35 / 35 | 24.6% | 4.6% | 10 | 0 | 0.74 / 8.5 | 95.8% | -3.9 |
| 4 | 93.9% | 97.1% | 90.5% | 34 / 35 | 27.7% | 2.6% | 14 | 0 | 0.66 / 86.5 | 96.0% | -2.0 |
| 5 | 95.7% | 100.0% | 90.9% | 35 / 35 | 26.9% | 2.8% | 12 | 0 | 0.70 / 8.3 | 95.9% | -0.3 |
| 6 | 95.7% | 100.0% | 91.0% | 35 / 35 | 28.2% | 2.8% | 13 | 0 | 0.70 / 14.1 | 96.6% | -0.9 |
| 7 | 94.9% | 100.0% | 89.5% | 35 / 35 | 29.6% | 3.6% | 12 | 0 | 0.68 / 16.0 | 96.7% | -1.7 |
| 8 | 94.6% | 100.0% | 88.9% | 35 / 35 | 28.5% | 3.5% | 12 | 0 | 0.71 / 13.4 | 97.3% | -2.7 |
| 9 | 96.1% | 100.0% | 91.6% | 35 / 35 | 25.8% | 2.1% | 10 | 0 | 0.65 / 13.0 | 96.1% | -0.1 |
| 10 | 86.8% | 97.1% | 77.4% | 34 / 35 | 25.7% | 20.4% | 15 | 0 | 0.74 / 12.9 | 95.6% | -8.8 |
| 11 | 96.7% | 100.0% | 93.0% | 35 / 35 | 29.2% | 2.4% | 10 | 0 | 0.70 / 101.5 | 97.0% | -0.3 |
| 12 | 92.3% | 97.1% | 87.4% | 34 / 35 | 30.8% | 10.1% | 15 | 0 | 0.64 / 13.5 | 96.9% | -4.6 |
| 13 | 89.0% | 97.1% | 81.3% | 34 / 35 | 27.9% | 5.7% | 10 | 0 | 0.69 / 13.7 | 89.1% | -0.0 |
| 14 | 89.0% | 97.1% | 80.9% | 34 / 35 | 24.2% | 4.9% | 10 | 0 | 0.73 / 13.7 | 94.8% | -5.8 |
| 15 | 94.1% | 100.0% | 87.7% | 35 / 35 | 24.0% | 2.8% | 9 | 0 | 0.70 / 10.4 | 95.5% | -1.4 |
| 16 | 90.3% | 97.1% | 83.3% | 34 / 35 | 25.3% | 5.7% | 13 | 0 | 0.74 / 15.9 | 97.1% | -6.8 |

Mean score share 92.4% ± 1.8, baseline 95.4% ± 1.1, paired diff -3.0 ± 1.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 193 over 16 battles (12.1 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | weak | 92.4% ± 1.8 | 98.6% ± 1.0 | 86.1% ± 2.8 | 552 / 560 | 26.8% ± 1.3 | 5.3% ± 2.4 | 193 | 0 | 0.79 / 101.5 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 16 | 10 | 1788 | 0 | 0.34 | 0 | 0 | 0 |

10 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 7703 | 35 | 7602 | 7599 (98.6%) | 104 (1.4%) | 3 (0.0%) | 975 | 199 | 54 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 8755 | 470 (5.4%) | 1287 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 650 | 419 | 400 | 262 | 58.7 / 9.7 | 5972 | 7635 | 3649 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 5.3% | 193 | 80 | 3 | 13.6 | 463 / 470 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | dggp.haiku.gpBot_0 | 1 | 35 | 304 | 5.5% | 6.1% ± 2.3 | 20.1% | 39.5% / 36.7% | 13.4% | 0 / 0 | T2/M? | 90% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
