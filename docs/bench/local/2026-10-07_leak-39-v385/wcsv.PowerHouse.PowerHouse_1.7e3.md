# wcsv.PowerHouse.PowerHouse 1.7e3 (mid) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 61.0% | 80.0% | 42.1% | 28 / 35 | 10.6% | 7.4% | 10 | 0 | 1.02 / 15.4 | 62.1% | -1.2 |
| 2 | 67.7% | 85.7% | 49.2% | 30 / 35 | 10.9% | 7.8% | 11 | 0 | 1.03 / 13.8 | 64.9% | +2.8 |
| 3 | 64.6% | 77.1% | 52.3% | 27 / 35 | 10.9% | 7.0% | 4 | 0 | 0.91 / 13.7 | 51.7% | +12.9 |
| 4 | 65.5% | 82.9% | 48.7% | 29 / 35 | 11.3% | 8.3% | 14 | 0 | 1.04 / 13.0 | 64.7% | +0.8 |
| 5 | 62.1% | 74.3% | 49.9% | 26 / 35 | 10.8% | 6.7% | 8 | 0 | 0.93 / 14.3 | 60.6% | +1.5 |
| 6 | 61.0% | 77.1% | 44.2% | 27 / 35 | 10.8% | 7.3% | 7 | 0 | 1.00 / 14.7 | 54.1% | +6.9 |
| 7 | 59.7% | 77.1% | 43.7% | 27 / 35 | 10.5% | 8.4% | 17 | 0 | 1.01 / 14.1 | 69.8% | -10.2 |
| 8 | 65.9% | 80.0% | 50.7% | 28 / 35 | 10.8% | 6.4% | 12 | 0 | 0.93 / 13.9 | 67.0% | -1.1 |
| 9 | 61.0% | 74.3% | 45.8% | 26 / 35 | 10.4% | 7.4% | 11 | 0 | 1.00 / 13.2 | 67.5% | -6.5 |
| 10 | 66.2% | 85.7% | 46.6% | 30 / 35 | 11.1% | 7.5% | 11 | 0 | 0.97 / 14.3 | 60.7% | +5.5 |
| 11 | 63.5% | 80.0% | 46.5% | 28 / 35 | 10.7% | 7.8% | 9 | 0 | 0.92 / 13.8 | 62.4% | +1.1 |
| 12 | 64.0% | 80.0% | 47.5% | 28 / 35 | 11.0% | 7.2% | 9 | 0 | 0.99 / 13.1 | 62.0% | +2.0 |
| 13 | 61.2% | 80.0% | 41.3% | 28 / 35 | 10.3% | 7.9% | 9 | 0 | 1.03 / 15.8 | 59.7% | +1.5 |
| 14 | 60.7% | 77.1% | 42.8% | 27 / 35 | 10.1% | 7.6% | 15 | 0 | 0.95 / 14.0 | 61.5% | -0.9 |
| 15 | 59.3% | 74.3% | 45.8% | 26 / 35 | 11.4% | 8.5% | 10 | 0 | 1.04 / 13.8 | 59.8% | -0.5 |
| 16 | 62.4% | 77.1% | 47.8% | 27 / 35 | 11.0% | 7.5% | 11 | 0 | 1.00 / 12.6 | 68.8% | -6.4 |

Mean score share 62.9% ± 1.3, baseline 62.3% ± 2.6, paired diff +0.5 ± 2.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 168 over 16 battles (10.5 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | mid | 62.9% ± 1.3 | 78.9% ± 1.9 | 46.6% ± 1.7 | 442 / 560 | 10.8% ± 0.2 | 7.5% ± 0.3 | 168 | 0 | 1.04 / 15.8 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 16 | 10 | 298 | 0 | 0.30 | 5 | 5 | 0 |

10 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 28946 | 176 | 28924 | 28923 (99.9%) | 23 (0.1%) | 1 (0.0%) | 1594 | 285 | 113 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 31575 | 2844 (9.0%) | 28139 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 650 | 466 | 650 | 747 | 28.9 / 33.1 | 568 | 13678 | 3364 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 7.5% | 168 | 8707 | 3 | 51.1 | 2834 / 2844 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | wcsv.PowerHouse.PowerHouse | 1 | 35 | 340 | 8.6% | 8.0% ± 1.4 | 10.5% | 21.9% / 22.5% | 13.2% | 0 / 0 | T3/M1 | 62% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
