# exauge.GateKeeper 1.1.121g (lower) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 75.7% | 91.4% | 59.1% | 32 / 35 | 12.9% | 6.3% | 11 | 0 | 0.95 / 12.0 | 73.4% | +2.3 |
| 2 | 71.5% | 85.7% | 58.3% | 30 / 35 | 16.1% | 7.7% | 10 | 0 | 0.93 / 12.8 | 81.9% | -10.4 |
| 3 | 72.5% | 88.6% | 57.1% | 31 / 35 | 14.5% | 7.8% | 11 | 0 | 0.97 / 16.6 | 77.0% | -4.6 |
| 4 | 73.1% | 88.6% | 58.6% | 31 / 35 | 13.9% | 8.4% | 14 | 0 | 0.96 / 10.7 | 82.6% | -9.5 |
| 5 | 72.1% | 88.6% | 57.2% | 31 / 35 | 15.0% | 8.1% | 12 | 0 | 0.98 / 11.0 | 75.1% | -3.0 |
| 6 | 69.4% | 82.9% | 55.4% | 29 / 35 | 12.3% | 6.5% | 14 | 0 | 0.97 / 11.8 | 75.5% | -6.0 |
| 7 | 73.0% | 88.6% | 58.0% | 31 / 35 | 14.8% | 7.0% | 13 | 0 | 0.98 / 11.6 | 74.4% | -1.4 |
| 8 | 81.5% | 97.1% | 64.9% | 34 / 35 | 14.9% | 6.8% | 9 | 0 | 0.90 / 15.9 | 80.9% | +0.6 |
| 9 | 80.1% | 94.3% | 65.5% | 33 / 35 | 16.2% | 6.2% | 12 | 0 | 0.90 / 17.2 | 85.4% | -5.3 |
| 10 | 78.7% | 97.1% | 59.4% | 34 / 35 | 13.5% | 6.8% | 9 | 0 | 0.97 / 12.1 | 73.5% | +5.2 |
| 11 | 78.3% | 94.3% | 61.6% | 33 / 35 | 14.6% | 6.4% | 10 | 0 | 0.90 / 12.2 | 79.9% | -1.6 |
| 12 | 79.9% | 97.1% | 61.1% | 34 / 35 | 14.0% | 6.3% | 12 | 0 | 0.92 / 11.8 | 76.5% | +3.4 |
| 13 | 76.9% | 94.3% | 59.3% | 33 / 35 | 14.1% | 7.0% | 10 | 0 | 0.98 / 11.1 | 77.1% | -0.2 |
| 14 | 79.7% | 97.1% | 62.4% | 34 / 35 | 13.8% | 7.3% | 9 | 0 | 0.96 / 11.8 | 83.2% | -3.5 |
| 15 | 78.7% | 97.1% | 59.6% | 34 / 35 | 13.7% | 7.1% | 12 | 0 | 0.96 / 11.6 | 76.3% | +2.4 |
| 16 | 74.9% | 88.6% | 61.4% | 31 / 35 | 14.8% | 7.2% | 10 | 0 | 0.95 / 11.3 | 83.0% | -8.1 |

Mean score share 76.0% ± 2.0, baseline 78.5% ± 2.1, paired diff -2.5 ± 2.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 178 over 16 battles (11.1 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | lower | 76.0% ± 2.0 | 92.0% ± 2.5 | 59.9% ± 1.5 | 515 / 560 | 14.3% ± 0.5 | 7.1% ± 0.4 | 178 | 0 | 0.98 / 17.2 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 16 | 16 | 0 | 0 | 0.32 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 15495 | 8 | 15582 | 15473 (99.9%) | 22 (0.1%) | 109 (0.7%) | 2087 | 305 | 51 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 20120 | 1047 (5.2%) | 3260 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 650 | 506 | 589 | 505 | 39.7 / 26.6 | 1979 | 6989 | 2591 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 7.1% | 178 | 145 | 3 | 27.8 | 1045 / 1047 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | exauge.GateKeeper | 1 | 35 | 310 | 8.0% | 8.9% ± 1.9 | 12.7% | 30.2% / 25.9% | 22.2% | 0 / 0 | T3/M0 | 74% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
