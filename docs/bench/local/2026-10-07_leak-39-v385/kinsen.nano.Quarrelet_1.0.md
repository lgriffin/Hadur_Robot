# kinsen.nano.Quarrelet 1.0 (lower) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.3% | 94.3% | 64.8% | 33 / 35 | 15.3% | 4.1% | 11 | 0 | 0.87 / 11.5 | 76.1% | +5.2 |
| 2 | 64.0% | 80.0% | 48.9% | 28 / 35 | 13.4% | 8.2% | 12 | 0 | 0.91 / 18.0 | 76.8% | -12.8 |
| 3 | 78.2% | 97.1% | 59.4% | 34 / 35 | 16.3% | 7.2% | 10 | 0 | 0.91 / 16.7 | 85.4% | -7.2 |
| 4 | 73.3% | 88.6% | 57.3% | 31 / 35 | 15.3% | 6.2% | 14 | 0 | 0.89 / 11.4 | 71.9% | +1.4 |
| 5 | 82.2% | 94.3% | 68.7% | 33 / 35 | 15.6% | 4.8% | 12 | 0 | 0.80 / 16.2 | 77.6% | +4.6 |
| 6 | 75.4% | 88.6% | 61.6% | 31 / 35 | 16.1% | 5.1% | 13 | 0 | 0.88 / 17.3 | 79.2% | -3.7 |
| 7 | 82.0% | 94.3% | 68.2% | 33 / 35 | 17.3% | 4.9% | 11 | 0 | 0.77 / 16.2 | 81.8% | +0.2 |
| 8 | 75.0% | 88.6% | 60.1% | 31 / 35 | 15.1% | 5.2% | 12 | 0 | 0.89 / 11.8 | 75.7% | -0.7 |
| 9 | 72.3% | 88.6% | 56.1% | 31 / 35 | 14.9% | 6.8% | 12 | 0 | 0.92 / 16.8 | 79.8% | -7.5 |
| 10 | 84.7% | 100.0% | 66.7% | 35 / 35 | 15.1% | 5.3% | 8 | 0 | 0.85 / 17.5 | 81.9% | +2.8 |
| 11 | 77.1% | 91.4% | 62.8% | 32 / 35 | 16.5% | 6.7% | 13 | 0 | 0.91 / 16.2 | 76.5% | +0.6 |
| 12 | 80.4% | 97.1% | 64.8% | 34 / 35 | 18.5% | 7.5% | 13 | 0 | 0.90 / 12.0 | 79.9% | +0.5 |
| 13 | 77.6% | 91.4% | 63.3% | 32 / 35 | 15.3% | 5.7% | 12 | 0 | 0.89 / 17.4 | 73.5% | +4.1 |
| 14 | 76.7% | 91.4% | 61.1% | 32 / 35 | 17.1% | 7.1% | 15 | 0 | 0.89 / 16.4 | 77.2% | -0.5 |
| 15 | 69.3% | 85.7% | 52.7% | 30 / 35 | 13.9% | 6.8% | 14 | 0 | 0.92 / 12.7 | 75.9% | -6.5 |
| 16 | 72.5% | 88.6% | 56.3% | 31 / 35 | 14.4% | 6.7% | 13 | 0 | 0.90 / 15.7 | 77.2% | -4.8 |

Mean score share 76.4% ± 2.8, baseline 77.9% ± 1.8, paired diff -1.5 ± 2.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 195 over 16 battles (12.2 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | lower | 76.4% ± 2.8 | 91.3% ± 2.6 | 60.8% ± 3.0 | 511 / 560 | 15.6% ± 0.7 | 6.1% ± 0.6 | 195 | 0 | 0.92 / 18.0 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 16 | 13 | 894 | 0 | 0.35 | 0 | 0 | 0 |

13 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 12838 | 35 | 12909 | 12757 (99.4%) | 81 (0.6%) | 152 (1.2%) | 1590 | 269 | 63 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 15306 | 892 (5.8%) | 2231 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 650 | 483 | 561 | 401 | 37.8 / 24.5 | 2645 | 10904 | 7548 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 6.1% | 195 | 172 | 3 | 23.1 | 885 / 892 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | kinsen.nano.Quarrelet | 1 | 35 | 316 | 8.0% | 8.8% ± 2.0 | 13.5% | 30.1% / 28.3% | 6.4% | 0 / 0 | T3/M0 | 71% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
