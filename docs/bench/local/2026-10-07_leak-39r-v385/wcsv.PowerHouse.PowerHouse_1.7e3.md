# wcsv.PowerHouse.PowerHouse 1.7e3 (mid) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 60.4% | 74.3% | 47.0% | 26 / 35 | 10.6% | 9.6% | 17 | 0 | 0.98 / 14.9 | 63.0% | -2.6 |
| 2 | 67.6% | 82.9% | 51.7% | 29 / 35 | 11.1% | 7.3% | 5 | 0 | 0.95 / 13.6 | 63.3% | +4.4 |
| 3 | 76.8% | 91.4% | 60.0% | 32 / 35 | 11.3% | 5.7% | 8 | 0 | 0.92 / 17.3 | 68.0% | +8.9 |
| 4 | 57.2% | 68.6% | 46.4% | 24 / 35 | 11.2% | 7.2% | 12 | 0 | 1.00 / 13.9 | 59.5% | -2.2 |
| 5 | 55.3% | 65.7% | 45.8% | 23 / 35 | 10.7% | 7.8% | 9 | 0 | 0.99 / 13.2 | 59.6% | -4.3 |
| 6 | 70.8% | 88.6% | 53.1% | 31 / 35 | 11.1% | 7.5% | 11 | 0 | 0.96 / 15.4 | 64.2% | +6.7 |
| 7 | 60.2% | 74.3% | 45.1% | 26 / 35 | 10.3% | 7.3% | 15 | 0 | 0.93 / 14.6 | 69.4% | -9.2 |
| 8 | 50.1% | 60.0% | 41.0% | 21 / 35 | 9.7% | 8.4% | 12 | 0 | 0.92 / 15.1 | 67.1% | -17.1 |
| 9 | 63.8% | 77.1% | 50.7% | 27 / 35 | 11.1% | 7.6% | 4 | 0 | 0.99 / 13.4 | 63.1% | +0.6 |
| 10 | 64.7% | 80.0% | 49.6% | 28 / 35 | 11.4% | 7.5% | 11 | 0 | 1.03 / 13.3 | 57.0% | +7.7 |
| 11 | 59.6% | 74.3% | 44.8% | 26 / 35 | 11.0% | 8.0% | 8 | 0 | 1.00 / 13.2 | 51.3% | +8.3 |
| 12 | 54.9% | 68.6% | 41.9% | 24 / 35 | 10.9% | 7.8% | 16 | 0 | 1.00 / 16.2 | 64.3% | -9.5 |
| 13 | 71.6% | 91.4% | 50.2% | 32 / 35 | 11.1% | 6.5% | 9 | 0 | 0.96 / 14.2 | 72.9% | -1.3 |
| 14 | 63.1% | 80.0% | 47.3% | 28 / 35 | 10.9% | 8.0% | 14 | 0 | 1.01 / 13.4 | 63.4% | -0.3 |
| 15 | 66.0% | 85.7% | 46.0% | 30 / 35 | 10.5% | 7.3% | 16 | 0 | 1.04 / 13.7 | 66.0% | -0.1 |
| 16 | 59.1% | 71.4% | 46.5% | 25 / 35 | 10.4% | 7.4% | 9 | 0 | 0.98 / 13.1 | 64.6% | -5.4 |

Mean score share 62.6% ± 3.7, baseline 63.5% ± 2.7, paired diff -1.0 ± 3.8.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 176 over 16 battles (11.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | mid | 62.6% ± 3.7 | 77.1% ± 4.9 | 48.0% ± 2.5 | 432 / 560 | 10.8% ± 0.2 | 7.6% ± 0.4 | 176 | 0 | 1.04 / 17.3 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 16 | 7 | 894 | 0 | 0.31 | 6 | 6 | 0 |

7 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 27498 | 151 | 27435 | 27434 (99.8%) | 64 (0.2%) | 1 (0.0%) | 1327 | 278 | 82 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 29627 | 2680 (9.0%) | 22535 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 650 | 467 | 650 | 713 | 29.9 / 32.5 | 470 | 10238 | 2654 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 7.6% | 176 | 9497 | 3 | 48.2 | 2672 / 2680 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| wcsv.PowerHouse.PowerHouse 1.7e3 | wcsv.PowerHouse.PowerHouse | 1 | 35 | 340 | 8.3% | 7.2% ± 1.3 | 10.3% | 22.4% / 23.1% | 10.6% | 0 / 0 | T3/M1 | 59% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
