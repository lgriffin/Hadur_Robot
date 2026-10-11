# exauge.GateKeeper 1.1.121g (lower) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 77.1% | 91.4% | 62.4% | 32 / 35 | 14.5% | 6.7% | 14 | 0 | 0.88 / 13.8 | 81.3% | -4.3 |
| 2 | 80.1% | 97.1% | 62.0% | 34 / 35 | 14.0% | 6.8% | 12 | 0 | 0.89 / 12.7 | 75.3% | +4.9 |
| 3 | 81.5% | 94.3% | 67.0% | 33 / 35 | 14.7% | 5.6% | 4 | 0 | 0.86 / 13.1 | 69.5% | +11.9 |
| 4 | 82.4% | 100.0% | 63.3% | 35 / 35 | 14.1% | 6.6% | 10 | 0 | 0.86 / 12.4 | 71.3% | +11.1 |
| 5 | 78.9% | 94.3% | 62.6% | 33 / 35 | 13.1% | 6.3% | 10 | 0 | 0.89 / 12.0 | 77.2% | +1.7 |
| 6 | 78.8% | 94.3% | 62.8% | 33 / 35 | 15.1% | 6.9% | 11 | 0 | 0.83 / 12.0 | 78.2% | +0.6 |
| 7 | 75.9% | 91.4% | 60.5% | 32 / 35 | 14.8% | 7.3% | 10 | 0 | 0.90 / 12.2 | 75.4% | +0.5 |
| 8 | 73.8% | 85.7% | 62.4% | 30 / 35 | 17.3% | 6.9% | 11 | 0 | 0.86 / 12.2 | 80.7% | -6.9 |
| 9 | 81.4% | 100.0% | 62.8% | 35 / 35 | 14.4% | 7.4% | 9 | 0 | 0.88 / 15.7 | 75.7% | +5.7 |
| 10 | 74.2% | 88.6% | 59.5% | 31 / 35 | 14.8% | 6.5% | 9 | 0 | 0.93 / 11.6 | 71.6% | +2.6 |
| 11 | 73.0% | 88.6% | 58.1% | 31 / 35 | 15.2% | 7.6% | 9 | 0 | 0.91 / 17.1 | 77.4% | -4.5 |
| 12 | 75.9% | 88.6% | 62.7% | 31 / 35 | 15.2% | 6.4% | 12 | 0 | 0.87 / 16.1 | 75.9% | -0.1 |
| 13 | 74.9% | 94.3% | 55.1% | 33 / 35 | 14.5% | 7.1% | 13 | 0 | 0.89 / 13.0 | 79.7% | -4.8 |
| 14 | 87.6% | 100.0% | 75.2% | 35 / 35 | 18.1% | 6.3% | 12 | 0 | 0.75 / 13.1 | 78.5% | +9.1 |
| 15 | 75.5% | 91.4% | 59.2% | 32 / 35 | 14.0% | 7.2% | 12 | 0 | 0.89 / 13.0 | 77.2% | -1.7 |
| 16 | 78.4% | 94.3% | 61.0% | 33 / 35 | 13.5% | 6.8% | 12 | 0 | 0.87 / 13.0 | 82.6% | -4.2 |

Mean score share 78.1% ± 2.1, baseline 76.7% ± 1.9, paired diff +1.4 ± 3.1.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 170 over 16 battles (10.6 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | lower | 78.1% ± 2.1 | 93.4% ± 2.3 | 62.3% ± 2.3 | 523 / 560 | 14.8% ± 0.7 | 6.8% ± 0.3 | 170 | 0 | 0.93 / 17.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 16 | 14 | 298 | 0 | 0.30 | 1 | 1 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 14958 | 11 | 15017 | 14905 (99.6%) | 53 (0.4%) | 112 (0.7%) | 2052 | 321 | 59 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 19213 | 926 (4.8%) | 3296 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 650 | 512 | 603 | 489 | 40.9 / 24.7 | 2115 | 6985 | 3140 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 6.8% | 170 | 222 | 3 | 26.7 | 921 / 926 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | exauge.GateKeeper | 1 | 35 | 310 | 7.2% | 8.1% ± 1.8 | 12.2% | 30.8% / 27.1% | 28.7% | 0 / 0 | T3/M0 | 77% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
