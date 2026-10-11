# bbo.RamboT 0.3 (rammer) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 97.8% | 100.0% | 96.3% | 35 / 35 | 70.4% | 8.8% | 14 | 0 | 0.52 / 8.4 | 96.6% | +1.3 |
| 2 | 97.0% | 100.0% | 95.4% | 35 / 35 | 79.9% | 10.8% | 11 | 0 | 0.52 / 8.7 | 98.0% | -1.1 |
| 3 | 98.1% | 100.0% | 96.5% | 35 / 35 | 74.9% | 7.6% | 9 | 0 | 0.54 / 9.6 | 98.3% | -0.3 |
| 4 | 96.7% | 100.0% | 95.1% | 35 / 35 | 71.0% | 9.8% | 13 | 0 | 0.54 / 7.9 | 97.3% | -0.5 |
| 5 | 95.0% | 100.0% | 92.8% | 35 / 35 | 79.6% | 12.9% | 12 | 0 | 0.52 / 8.3 | 96.3% | -1.2 |
| 6 | 97.7% | 100.0% | 96.2% | 35 / 35 | 77.0% | 12.1% | 12 | 0 | 0.51 / 9.2 | 97.2% | +0.5 |
| 7 | 94.6% | 97.1% | 93.3% | 34 / 35 | 73.8% | 10.6% | 14 | 0 | 0.53 / 9.7 | 95.1% | -0.5 |
| 8 | 94.5% | 100.0% | 92.5% | 35 / 35 | 75.1% | 15.1% | 10 | 0 | 0.52 / 11.9 | 97.4% | -2.8 |
| 9 | 94.4% | 100.0% | 92.5% | 35 / 35 | 76.1% | 10.6% | 5 | 0 | 0.51 / 8.9 | 95.8% | -1.4 |
| 10 | 96.3% | 100.0% | 94.6% | 35 / 35 | 76.5% | 11.1% | 9 | 0 | 0.53 / 8.9 | 97.5% | -1.1 |
| 11 | 94.5% | 100.0% | 91.9% | 35 / 35 | 69.1% | 11.6% | 9 | 0 | 0.55 / 8.8 | 96.8% | -2.3 |
| 12 | 94.3% | 100.0% | 91.9% | 35 / 35 | 76.2% | 15.8% | 15 | 0 | 0.49 / 8.0 | 96.4% | -2.1 |
| 13 | 97.2% | 100.0% | 95.8% | 35 / 35 | 74.3% | 8.9% | 11 | 0 | 0.53 / 8.4 | 96.7% | +0.4 |
| 14 | 96.5% | 100.0% | 94.7% | 35 / 35 | 74.8% | 11.9% | 13 | 0 | 0.55 / 8.0 | 96.1% | +0.3 |
| 15 | 97.7% | 100.0% | 96.4% | 35 / 35 | 74.5% | 9.0% | 13 | 0 | 0.54 / 8.7 | 98.5% | -0.8 |
| 16 | 94.9% | 100.0% | 92.7% | 35 / 35 | 74.4% | 19.9% | 13 | 0 | 0.51 / 8.5 | 96.6% | -1.6 |

Mean score share 96.1% ± 0.8, baseline 96.9% ± 0.5, paired diff -0.8 ± 0.6.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 183 over 16 battles (11.4 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| bbo.RamboT 0.3 | rammer | 96.1% ± 0.8 | 99.8% ± 0.4 | 94.3% ± 0.9 | 559 / 560 | 74.9% ± 1.6 | 11.7% ± 1.7 | 183 | 0 | 0.55 / 11.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| bbo.RamboT 0.3 | 16 | 10 | 1319 | 0 | 0.33 | 1 | 0 | 0 |

10 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| bbo.RamboT 0.3 | 4553 | 29 | 4466 | 4464 (98.0%) | 89 (2.0%) | 2 (0.0%) | 940 | 377 | 104 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| bbo.RamboT 0.3 | 4068 | 134 (3.3%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| bbo.RamboT 0.3 | 650 | 239 | 400 | 137 | 91.3 / 5.6 | 3539 | 4487 | 96 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| bbo.RamboT 0.3 | 11.7% | 183 | 40 | 3 | 7.9 | 133 / 134 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| bbo.RamboT 0.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| bbo.RamboT 0.3 | bbo.RamboT | 1 | 35 | 272 | 17.0% | 3.1% ± 2.3 | 41.4% | 21.7% / 23.6% | 8.9% | 0 / 0 | T1/M? | 95% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
