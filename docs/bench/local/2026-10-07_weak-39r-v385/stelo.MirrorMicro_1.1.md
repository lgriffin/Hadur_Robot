# stelo.MirrorMicro 1.1 (mirror) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 90.5% | 100.0% | 82.7% | 35 / 35 | 37.3% | 8.9% | 10 | 0 | 0.65 / 8.4 | 93.1% | -2.5 |
| 2 | 89.9% | 100.0% | 81.6% | 35 / 35 | 37.1% | 9.3% | 14 | 0 | 0.68 / 10.8 | 93.9% | -4.1 |
| 3 | 93.5% | 100.0% | 87.6% | 35 / 35 | 36.1% | 5.7% | 9 | 0 | 0.69 / 9.2 | 42.6% | +50.9 |
| 4 | 92.2% | 100.0% | 85.5% | 35 / 35 | 38.8% | 7.7% | 10 | 0 | 0.65 / 21.3 | 92.8% | -0.6 |
| 5 | 90.2% | 97.1% | 84.2% | 34 / 35 | 35.1% | 6.2% | 12 | 0 | 0.66 / 12.5 | 93.0% | -2.7 |
| 6 | 94.3% | 100.0% | 89.1% | 35 / 35 | 36.8% | 5.4% | 10 | 0 | 0.64 / 8.3 | 69.1% | +25.2 |
| 7 | 92.4% | 100.0% | 85.7% | 35 / 35 | 35.0% | 6.8% | 10 | 0 | 0.67 / 9.3 | 91.6% | +0.8 |
| 8 | 93.9% | 100.0% | 88.3% | 35 / 35 | 36.8% | 5.1% | 10 | 0 | 0.64 / 8.3 | 94.0% | -0.1 |
| 9 | 93.6% | 100.0% | 87.9% | 35 / 35 | 37.9% | 6.4% | 10 | 0 | 0.68 / 9.4 | 92.6% | +1.0 |
| 10 | 93.4% | 100.0% | 87.6% | 35 / 35 | 37.3% | 5.3% | 10 | 0 | 0.63 / 11.5 | 93.8% | -0.4 |
| 11 | 93.1% | 100.0% | 87.1% | 35 / 35 | 38.0% | 6.1% | 10 | 0 | 0.66 / 9.1 | 89.5% | +3.6 |
| 12 | 92.3% | 100.0% | 85.6% | 35 / 35 | 37.2% | 6.8% | 8 | 0 | 0.67 / 37.1 | 92.7% | -0.4 |
| 13 | 89.3% | 100.0% | 80.7% | 35 / 35 | 38.2% | 9.6% | 10 | 0 | 0.63 / 11.7 | 93.3% | -4.1 |
| 14 | 94.2% | 100.0% | 88.8% | 35 / 35 | 34.6% | 5.2% | 8 | 0 | 0.64 / 8.0 | 93.2% | +1.0 |
| 15 | 91.8% | 100.0% | 84.7% | 35 / 35 | 36.2% | 6.9% | 13 | 0 | 0.64 / 11.6 | 93.6% | -1.8 |
| 16 | 92.5% | 100.0% | 86.0% | 35 / 35 | 35.5% | 6.5% | 13 | 0 | 0.64 / 10.0 | 55.5% | +37.0 |

Mean score share 92.3% ± 0.9, baseline 85.9% ± 8.4, paired diff +6.4 ± 8.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 167 over 16 battles (10.4 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| stelo.MirrorMicro 1.1 | mirror | 92.3% ± 0.9 | 99.8% ± 0.4 | 85.8% ± 1.3 | 559 / 560 | 36.7% ± 0.7 | 6.7% ± 0.8 | 167 | 0 | 0.69 / 37.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| stelo.MirrorMicro 1.1 | 16 | 16 | 0 | 0 | 0.30 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| stelo.MirrorMicro 1.1 | 6919 | 39 | 6922 | 6919 (100.0%) | 0 (0.0%) | 3 (0.0%) | 27 | 196 | 37 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| stelo.MirrorMicro 1.1 | 6965 | 392 (5.6%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| stelo.MirrorMicro 1.1 | 650 | 498 | 400 | 216 | 73.0 / 12.2 | 5307 | 4629 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| stelo.MirrorMicro 1.1 | 6.7% | 167 | 69 | 3 | 12.4 | 392 / 392 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| stelo.MirrorMicro 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| stelo.MirrorMicro 1.1 | stelo.MirrorMicro | 1 | 35 | 300 | 8.2% | 9.2% ± 2.8 | 25.6% | 26.7% / 24.2% | 1.5% | 0 / 0 | T3/M? | 91% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
