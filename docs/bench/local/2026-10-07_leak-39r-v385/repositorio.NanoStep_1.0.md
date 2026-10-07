# repositorio.NanoStep 1.0 (weak) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 96.3% | 100.0% | 94.7% | 35 / 35 | 30.3% | 4.1% | 12 | 0 | 0.63 / 11.2 | 98.8% | -2.5 |
| 2 | 98.3% | 100.0% | 96.6% | 35 / 35 | 26.0% | 1.0% | 11 | 0 | 0.62 / 10.9 | 95.3% | +3.0 |
| 3 | 98.8% | 100.0% | 97.6% | 35 / 35 | 26.7% | 1.4% | 9 | 0 | 0.64 / 9.3 | 99.6% | -0.8 |
| 4 | 96.2% | 100.0% | 92.5% | 35 / 35 | 27.0% | 3.3% | 11 | 0 | 0.67 / 11.0 | 99.9% | -3.7 |
| 5 | 98.8% | 100.0% | 97.7% | 35 / 35 | 26.0% | 1.2% | 13 | 0 | 0.63 / 8.2 | 93.9% | +5.0 |
| 6 | 97.8% | 100.0% | 95.7% | 35 / 35 | 25.9% | 1.8% | 12 | 0 | 0.65 / 8.4 | 94.2% | +3.7 |
| 7 | 92.6% | 97.1% | 89.9% | 34 / 35 | 26.8% | 5.4% | 11 | 0 | 0.66 / 9.8 | 95.0% | -2.3 |
| 8 | 98.1% | 100.0% | 96.1% | 35 / 35 | 25.5% | 1.7% | 11 | 0 | 0.66 / 9.0 | 95.5% | +2.5 |
| 9 | 98.4% | 100.0% | 96.8% | 35 / 35 | 26.4% | 1.9% | 10 | 0 | 0.63 / 10.8 | 96.5% | +1.9 |
| 10 | 99.8% | 100.0% | 99.7% | 35 / 35 | 28.2% | 0.1% | 10 | 0 | 0.63 / 10.0 | 93.8% | +6.1 |
| 11 | 98.6% | 100.0% | 97.0% | 35 / 35 | 24.5% | 1.0% | 10 | 0 | 0.68 / 8.9 | 93.4% | +5.1 |
| 12 | 98.0% | 100.0% | 96.1% | 35 / 35 | 30.2% | 2.0% | 11 | 0 | 0.61 / 10.5 | 94.8% | +3.2 |
| 13 | 97.8% | 100.0% | 95.6% | 35 / 35 | 28.9% | 1.6% | 10 | 0 | 0.63 / 9.4 | 95.9% | +1.9 |
| 14 | 98.7% | 100.0% | 97.4% | 35 / 35 | 28.4% | 1.1% | 11 | 0 | 0.64 / 10.6 | 96.9% | +1.8 |
| 15 | 99.2% | 100.0% | 98.5% | 35 / 35 | 25.8% | 0.5% | 13 | 0 | 0.64 / 8.7 | 99.3% | -0.1 |
| 16 | 97.2% | 97.1% | 97.0% | 34 / 35 | 27.4% | 0.5% | 13 | 0 | 0.58 / 14.7 | 93.8% | +3.4 |

Mean score share 97.8% ± 0.9, baseline 96.0% ± 1.2, paired diff +1.8 ± 1.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 178 over 16 battles (11.1 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| repositorio.NanoStep 1.0 | weak | 97.8% ± 0.9 | 99.6% ± 0.5 | 96.2% ± 1.2 | 558 / 560 | 27.1% ± 0.9 | 1.8% ± 0.7 | 178 | 0 | 0.68 / 14.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| repositorio.NanoStep 1.0 | 16 | 16 | 0 | 0 | 0.32 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| repositorio.NanoStep 1.0 | 10657 | 57 | 10638 | 10632 (99.8%) | 25 (0.2%) | 6 (0.1%) | 364 | 206 | 468 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| repositorio.NanoStep 1.0 | 9448 | 607 (6.4%) | 1653 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| repositorio.NanoStep 1.0 | 650 | 432 | 400 | 285 | 70.3 / 2.8 | 6924 | 7012 | 647 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| repositorio.NanoStep 1.0 | 1.8% | 178 | 1062 | 3 | 19.0 | 604 / 607 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| repositorio.NanoStep 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| repositorio.NanoStep 1.0 | repositorio.NanoStep | 1 | 35 | 312 | 1.1% | 0.4% ± 0.7 | 20.2% | 45.1% / 42.8% | 1.1% | 0 / 0 | T0/M? | 97% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
