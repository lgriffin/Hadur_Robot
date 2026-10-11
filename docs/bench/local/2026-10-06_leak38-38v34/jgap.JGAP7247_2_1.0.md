# jgap.JGAP7247_2 1.0 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 93.0% | 100.0% | 86.3% | 35 / 35 | 37.8% | 5.7% | 13 | 0 | 0.79 / 14.1 | 98.1% | -5.1 |
| 2 | 95.3% | 100.0% | 90.7% | 35 / 35 | 39.0% | 3.6% | 13 | 0 | 0.70 / 14.1 | 96.2% | -0.9 |
| 3 | 94.8% | 100.0% | 89.7% | 35 / 35 | 37.9% | 3.9% | 10 | 0 | 0.72 / 13.5 | 96.3% | -1.5 |
| 4 | 95.7% | 100.0% | 91.5% | 35 / 35 | 40.1% | 3.8% | 13 | 0 | 0.60 / 7.7 | 95.9% | -0.2 |
| 5 | 95.3% | 100.0% | 90.5% | 35 / 35 | 37.7% | 8.7% | 11 | 0 | 0.70 / 14.3 | 97.2% | -1.9 |
| 6 | 96.0% | 100.0% | 92.0% | 35 / 35 | 40.7% | 5.6% | 11 | 0 | 0.71 / 13.6 | 96.8% | -0.8 |
| 7 | 96.4% | 100.0% | 92.3% | 35 / 35 | 32.6% | 7.7% | 13 | 0 | 0.73 / 9.5 | 93.8% | +2.6 |
| 8 | 94.4% | 100.0% | 89.0% | 35 / 35 | 41.4% | 4.8% | 9 | 0 | 0.76 / 12.9 | 96.0% | -1.6 |
| 9 | 96.6% | 100.0% | 93.1% | 35 / 35 | 35.3% | 2.3% | 12 | 0 | 0.75 / 8.5 | 96.3% | +0.4 |
| 10 | 95.1% | 100.0% | 90.4% | 35 / 35 | 41.4% | 4.3% | 12 | 0 | 0.79 / 14.4 | 96.0% | -0.9 |
| 11 | 96.3% | 100.0% | 92.5% | 35 / 35 | 41.0% | 2.9% | 8 | 0 | 0.76 / 8.6 | 96.5% | -0.2 |
| 12 | 95.4% | 100.0% | 90.9% | 35 / 35 | 40.3% | 3.6% | 15 | 0 | 0.80 / 13.6 | 95.9% | -0.5 |
| 13 | 95.0% | 100.0% | 90.1% | 35 / 35 | 38.2% | 4.1% | 11 | 0 | 0.78 / 13.0 | 96.2% | -1.2 |
| 14 | 96.8% | 100.0% | 93.3% | 35 / 35 | 35.8% | 2.6% | 11 | 0 | 0.74 / 13.7 | 96.5% | +0.3 |
| 15 | 98.7% | 100.0% | 97.4% | 35 / 35 | 42.0% | 1.0% | 10 | 0 | 0.69 / 13.2 | 96.9% | +1.9 |
| 16 | 96.7% | 100.0% | 93.4% | 35 / 35 | 44.6% | 3.1% | 11 | 0 | 0.71 / 8.9 | 97.2% | -0.5 |

Mean score share 95.7% ± 0.7, baseline 96.4% ± 0.5, paired diff -0.6 ± 0.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 183 over 16 battles (11.4 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jgap.JGAP7247_2 1.0 | weak | 95.7% ± 0.7 | 100.0% ± 0.0 | 91.5% ± 1.3 | 560 / 560 | 39.1% ± 1.6 | 4.2% ± 1.0 | 183 | 0 | 0.80 / 14.4 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jgap.JGAP7247_2 1.0 | 16 | 13 | 771 | 0 | 0.33 | 0 | 0 | 0 |

13 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jgap.JGAP7247_2 1.0 | 4921 | 40 | 5152 | 4870 (99.0%) | 51 (1.0%) | 282 (5.5%) | 2601 | 265 | 50 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jgap.JGAP7247_2 1.0 | 6650 | 277 (4.2%) | 54 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jgap.JGAP7247_2 1.0 | 650 | 438 | 400 | 204 | 66.9 / 6.3 | 4645 | 4856 | 3239 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jgap.JGAP7247_2 1.0 | 4.2% | 183 | 926 | 3 | 9.2 | 274 / 277 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jgap.JGAP7247_2 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| jgap.JGAP7247_2 1.0 | jgap.JGAP7247_2 | 1 | 35 | 292 | 5.7% | 5.3% ± 2.8 | 28.6% | 70.3% / 71.3% | 23.8% | 0 / 0 | T2/M? | 95% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
