# stelo.MirrorNano 1.4 (mirror) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 93.5% | 100.0% | 87.4% | 35 / 35 | 34.0% | 5.1% | 16 | 0 | 0.70 / 9.3 | 94.3% | -0.9 |
| 2 | 92.7% | 100.0% | 86.1% | 35 / 35 | 35.9% | 5.8% | 10 | 0 | 0.67 / 13.0 | 92.9% | -0.2 |
| 3 | 90.2% | 100.0% | 82.0% | 35 / 35 | 36.6% | 7.4% | 13 | 0 | 0.69 / 8.4 | 92.9% | -2.7 |
| 4 | 92.5% | 100.0% | 85.7% | 35 / 35 | 33.6% | 5.6% | 11 | 0 | 0.68 / 13.2 | 91.1% | +1.4 |
| 5 | 94.2% | 100.0% | 88.6% | 35 / 35 | 34.6% | 4.2% | 13 | 0 | 0.66 / 12.2 | 93.1% | +1.1 |
| 6 | 84.0% | 94.3% | 74.7% | 33 / 35 | 30.6% | 5.6% | 7 | 0 | 0.64 / 12.4 | 92.7% | -8.7 |
| 7 | 92.2% | 100.0% | 85.3% | 35 / 35 | 36.8% | 6.1% | 11 | 0 | 0.63 / 11.6 | 93.9% | -1.7 |
| 8 | 93.8% | 100.0% | 88.0% | 35 / 35 | 34.5% | 4.7% | 12 | 0 | 0.67 / 8.5 | 93.1% | +0.7 |
| 9 | 95.2% | 100.0% | 90.6% | 35 / 35 | 37.5% | 3.8% | 9 | 0 | 0.62 / 9.1 | 94.9% | +0.3 |
| 10 | 90.5% | 100.0% | 82.4% | 35 / 35 | 35.9% | 7.7% | 12 | 0 | 0.67 / 8.5 | 91.6% | -1.1 |
| 11 | 94.8% | 100.0% | 89.9% | 35 / 35 | 34.2% | 4.0% | 9 | 0 | 0.64 / 10.1 | 93.3% | +1.6 |
| 12 | 93.8% | 100.0% | 88.1% | 35 / 35 | 38.0% | 4.9% | 11 | 0 | 0.60 / 8.1 | 90.4% | +3.4 |
| 13 | 94.6% | 100.0% | 89.4% | 35 / 35 | 36.8% | 3.7% | 10 | 0 | 0.69 / 10.3 | 93.7% | +0.9 |
| 14 | 93.5% | 100.0% | 87.4% | 35 / 35 | 35.4% | 4.9% | 10 | 0 | 0.67 / 10.1 | 78.4% | +15.1 |
| 15 | 69.3% | 85.7% | 54.8% | 30 / 35 | 22.6% | 6.3% | 9 | 0 | 0.65 / 17.1 | 93.2% | -23.9 |
| 16 | 93.5% | 100.0% | 87.5% | 35 / 35 | 35.6% | 5.1% | 11 | 0 | 0.64 / 8.6 | 94.3% | -0.8 |

Mean score share 91.1% ± 3.4, baseline 92.1% ± 2.1, paired diff -1.0 ± 4.1.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 174 over 16 battles (10.9 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| stelo.MirrorNano 1.4 | mirror | 91.1% ± 3.4 | 98.8% ± 2.0 | 84.2% ± 4.7 | 553 / 560 | 34.5% ± 1.9 | 5.3% ± 0.6 | 174 | 0 | 0.70 / 17.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| stelo.MirrorNano 1.4 | 16 | 14 | 298 | 0 | 0.31 | 2 | 2 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| stelo.MirrorNano 1.4 | 7323 | 31 | 7307 | 7303 (99.7%) | 20 (0.3%) | 4 (0.1%) | 43 | 179 | 44 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| stelo.MirrorNano 1.4 | 6838 | 326 (4.8%) | 147 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| stelo.MirrorNano 1.4 | 650 | 500 | 400 | 235 | 67.6 / 12.5 | 5025 | 6835 | 2458 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| stelo.MirrorNano 1.4 | 5.3% | 174 | 57 | 3 | 11.7 | 323 / 326 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| stelo.MirrorNano 1.4 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| stelo.MirrorNano 1.4 | stelo.MirrorNano | 1 | 35 | 296 | 6.7% | 8.6% ± 2.9 | 25.8% | 32.7% / 26.0% | 3.2% | 0 / 0 | T3/M? | 92% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
