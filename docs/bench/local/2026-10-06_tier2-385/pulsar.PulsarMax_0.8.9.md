# pulsar.PulsarMax 0.8.9 (mid) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 63.1% | 82.9% | 41.2% | 29 / 35 | 10.1% | 7.1% | 12 | 0 | 1.08 / 14.1 | 59.8% | +3.3 |
| 2 | 62.4% | 82.9% | 39.0% | 29 / 35 | 8.9% | 7.2% | 14 | 0 | 1.12 / 14.8 | 61.0% | +1.4 |
| 3 | 63.8% | 82.9% | 42.3% | 29 / 35 | 9.6% | 7.1% | 12 | 0 | 1.10 / 14.3 | 64.1% | -0.3 |
| 4 | 63.0% | 85.7% | 38.5% | 30 / 35 | 9.0% | 7.6% | 9 | 0 | 1.13 / 14.1 | 72.4% | -9.4 |
| 5 | 58.7% | 74.3% | 41.6% | 26 / 35 | 9.7% | 7.1% | 6 | 0 | 1.08 / 14.7 | 52.6% | +6.1 |
| 6 | 59.8% | 77.1% | 42.4% | 27 / 35 | 10.7% | 8.0% | 12 | 0 | 1.12 / 15.6 | 62.1% | -2.3 |
| 7 | 61.7% | 82.9% | 38.4% | 29 / 35 | 9.3% | 7.2% | 17 | 0 | 1.11 / 14.4 | 58.4% | +3.3 |
| 8 | 66.9% | 85.7% | 47.1% | 30 / 35 | 10.5% | 7.6% | 12 | 0 | 1.13 / 14.2 | 63.4% | +3.5 |
| 9 | 59.2% | 77.1% | 38.9% | 27 / 35 | 9.9% | 7.3% | 11 | 0 | 1.09 / 14.4 | 59.0% | +0.1 |
| 10 | 56.5% | 74.3% | 36.5% | 26 / 35 | 9.6% | 7.4% | 9 | 0 | 1.11 / 13.5 | 59.0% | -2.5 |
| 11 | 56.2% | 71.4% | 39.2% | 25 / 35 | 8.8% | 8.1% | 7 | 0 | 1.09 / 13.2 | 65.2% | -8.9 |
| 12 | 62.4% | 82.9% | 39.4% | 29 / 35 | 9.3% | 7.0% | 14 | 0 | 1.13 / 13.4 | 69.3% | -6.9 |
| 13 | 56.2% | 71.4% | 39.2% | 25 / 35 | 9.6% | 7.0% | 5 | 0 | 1.10 / 14.1 | 61.8% | -5.6 |
| 14 | 60.4% | 77.1% | 40.8% | 27 / 35 | 9.7% | 6.4% | 6 | 0 | 1.08 / 14.4 | 63.6% | -3.2 |
| 15 | 64.8% | 82.9% | 45.1% | 29 / 35 | 10.3% | 6.9% | 12 | 0 | 1.09 / 13.6 | 63.4% | +1.4 |
| 16 | 58.5% | 77.1% | 40.1% | 27 / 35 | 9.5% | 7.9% | 11 | 0 | 1.11 / 14.1 | 60.1% | -1.5 |
| 17 | 58.8% | 74.3% | 40.4% | 26 / 35 | 9.6% | 6.9% | 5 | 0 | 1.08 / 14.7 | 58.8% | -0.0 |
| 18 | 58.2% | 77.1% | 39.1% | 27 / 35 | 10.4% | 8.0% | 11 | 0 | 1.08 / 13.4 | 56.7% | +1.4 |
| 19 | 59.7% | 77.1% | 41.2% | 27 / 35 | 10.0% | 7.2% | 13 | 0 | 1.12 / 14.2 | 61.1% | -1.4 |
| 20 | 63.7% | 85.7% | 40.3% | 30 / 35 | 9.4% | 7.6% | 11 | 0 | 1.09 / 14.1 | 61.5% | +2.2 |

Mean score share 60.7% ± 1.4, baseline 61.7% ± 2.0, paired diff -1.0 ± 2.0.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 209 over 20 battles (10.5 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | mid | 60.7% ± 1.4 | 79.1% ± 2.2 | 40.5% ± 1.1 | 554 / 700 | 9.7% ± 0.2 | 7.3% ± 0.2 | 209 | 0 | 1.13 / 15.6 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 20 | 14 | 0 | 0 | 0.30 | 6 | 6 | 0 |

14 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 38926 | 25 | 38928 | 38923 (100.0%) | 3 (0.0%) | 5 (0.0%) | 2716 | 245 | 111 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 46211 | 3993 (8.6%) | 37789 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 650 | 488 | 638 | 834 | 22.8 / 33.4 | 282 | 31595 | 31 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 7.3% | 209 | 3117 | 3 | 55.1 | 3992 / 3993 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | pulsar.PulsarMax | 1 | 35 | 300 | 7.9% | 7.7% ± 1.2 | 9.3% | 22.2% / 21.6% | 3.5% | 0 / 0 | T3/M1 | 63% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
