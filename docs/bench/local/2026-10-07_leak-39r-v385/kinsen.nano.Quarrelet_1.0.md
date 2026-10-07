# kinsen.nano.Quarrelet 1.0 (lower) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 87.5% | 100.0% | 72.3% | 35 / 35 | 16.9% | 4.4% | 12 | 0 | 0.85 / 12.3 | 75.3% | +12.2 |
| 2 | 82.9% | 97.1% | 66.7% | 34 / 35 | 15.6% | 4.8% | 13 | 0 | 0.84 / 11.3 | 76.0% | +6.9 |
| 3 | 81.1% | 100.0% | 60.3% | 35 / 35 | 14.6% | 6.1% | 10 | 0 | 0.84 / 13.9 | 80.4% | +0.7 |
| 4 | 79.1% | 97.1% | 60.2% | 34 / 35 | 14.5% | 6.0% | 12 | 0 | 0.92 / 12.7 | 81.3% | -2.1 |
| 5 | 72.5% | 88.6% | 55.3% | 31 / 35 | 13.5% | 6.1% | 12 | 0 | 0.94 / 12.4 | 86.3% | -13.8 |
| 6 | 79.0% | 94.3% | 63.6% | 33 / 35 | 16.6% | 6.9% | 11 | 0 | 0.84 / 10.6 | 75.1% | +3.9 |
| 7 | 75.7% | 91.4% | 58.5% | 32 / 35 | 13.6% | 5.8% | 8 | 0 | 0.86 / 16.5 | 76.1% | -0.4 |
| 8 | 71.6% | 85.7% | 57.0% | 30 / 35 | 13.8% | 6.1% | 9 | 0 | 0.90 / 21.7 | 82.0% | -10.4 |
| 9 | 76.8% | 94.3% | 59.0% | 33 / 35 | 15.2% | 7.1% | 10 | 0 | 0.92 / 16.6 | 74.9% | +2.0 |
| 10 | 83.3% | 97.1% | 65.0% | 34 / 35 | 12.5% | 4.4% | 14 | 0 | 0.88 / 12.1 | 68.9% | +14.4 |
| 11 | 75.7% | 94.3% | 55.9% | 33 / 35 | 14.6% | 6.3% | 14 | 0 | 0.91 / 12.0 | 78.7% | -3.0 |
| 12 | 77.2% | 91.4% | 61.1% | 32 / 35 | 14.3% | 5.5% | 12 | 0 | 0.94 / 12.0 | 77.8% | -0.6 |
| 13 | 76.0% | 91.4% | 58.7% | 32 / 35 | 12.8% | 5.6% | 9 | 0 | 0.91 / 12.7 | 72.9% | +3.0 |
| 14 | 76.5% | 91.4% | 60.7% | 32 / 35 | 16.1% | 5.7% | 14 | 0 | 0.90 / 17.1 | 83.2% | -6.7 |
| 15 | 76.2% | 88.6% | 62.5% | 31 / 35 | 14.9% | 5.0% | 12 | 0 | 0.90 / 11.1 | 69.6% | +6.6 |
| 16 | 83.2% | 97.1% | 65.9% | 34 / 35 | 16.5% | 4.7% | 11 | 0 | 0.87 / 16.5 | 78.9% | +4.3 |

Mean score share 78.4% ± 2.3, baseline 77.3% ± 2.5, paired diff +1.1 ± 4.0.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 183 over 16 battles (11.4 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | lower | 78.4% ± 2.3 | 93.8% ± 2.2 | 61.4% ± 2.4 | 525 / 560 | 14.8% ± 0.7 | 5.7% ± 0.4 | 183 | 0 | 0.94 / 21.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 16 | 15 | 0 | 0 | 0.33 | 1 | 1 | 0 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 13019 | 39 | 13153 | 13000 (99.9%) | 19 (0.1%) | 153 (1.2%) | 1522 | 245 | 65 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 15509 | 966 (6.2%) | 5664 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 650 | 496 | 588 | 407 | 36.5 / 23.1 | 2097 | 10980 | 7728 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 5.7% | 183 | 1395 | 3 | 23.4 | 964 / 966 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | kinsen.nano.Quarrelet | 1 | 35 | 316 | 6.0% | 7.2% ± 1.9 | 13.6% | 32.9% / 28.7% | 7.1% | 0 / 0 | T3/M? | 81% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
