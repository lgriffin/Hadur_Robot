# xander.cat.XanderCat 12.9 (rumble-9) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 58.5% | 65.7% | 50.8% | 23 / 35 | 11.7% | 8.6% | 24 | 0 | 1.18 / 14.9 | 57.2% | +1.3 |
| 2 | 54.3% | 60.0% | 48.8% | 21 / 35 | 12.0% | 8.6% | 18 | 0 | 1.25 / 15.4 | 49.5% | +4.8 |
| 3 | 62.6% | 74.3% | 51.4% | 26 / 35 | 11.8% | 8.5% | 22 | 0 | 1.26 / 14.7 | 50.1% | +12.5 |
| 4 | 60.0% | 71.4% | 48.7% | 25 / 35 | 11.8% | 7.3% | 13 | 0 | 1.28 / 14.3 | 58.9% | +1.1 |
| 5 | 60.7% | 67.6% | 53.5% | 24 / 35 | 11.6% | 7.3% | 20 | 0 | 1.28 / 14.7 | 47.2% | +13.5 |
| 6 | 49.4% | 54.3% | 44.5% | 19 / 35 | 10.5% | 9.1% | 22 | 0 | 1.22 / 15.0 | 57.0% | -7.6 |
| 7 | 56.5% | 62.9% | 50.7% | 22 / 35 | 12.0% | 8.5% | 23 | 0 | 1.20 / 14.3 | 63.8% | -7.3 |
| 8 | 52.2% | 57.1% | 47.7% | 20 / 35 | 12.7% | 9.3% | 18 | 0 | 1.21 / 15.3 | 55.5% | -3.3 |
| 9 | 50.9% | 55.9% | 46.7% | 20 / 35 | 11.7% | 9.1% | 22 | 0 | 1.28 / 14.8 | 58.5% | -7.6 |
| 10 | 64.2% | 74.3% | 53.4% | 26 / 35 | 12.2% | 8.1% | 13 | 0 | 1.23 / 14.9 | 55.8% | +8.4 |
| 11 | 55.5% | 62.9% | 48.8% | 22 / 35 | 11.6% | 8.2% | 16 | 0 | 1.26 / 14.6 | 49.6% | +5.9 |
| 12 | 50.8% | 54.3% | 47.7% | 19 / 35 | 12.8% | 9.3% | 20 | 0 | 1.23 / 115.4 | 60.8% | -10.0 |
| 13 | 59.7% | 68.6% | 50.3% | 24 / 35 | 10.9% | 7.4% | 15 | 0 | 1.26 / 14.3 | 60.8% | -1.1 |
| 14 | 45.3% | 48.6% | 43.2% | 17 / 35 | 11.5% | 9.7% | 15 | 0 | 1.28 / 14.1 | 56.2% | -10.9 |
| 15 | 60.5% | 68.6% | 52.3% | 24 / 35 | 11.5% | 7.5% | 20 | 0 | 1.20 / 15.3 | 62.4% | -1.9 |
| 16 | 53.7% | 57.1% | 50.4% | 20 / 35 | 12.1% | 7.6% | 21 | 0 | 1.20 / 15.1 | 57.1% | -3.4 |
| 17 | 51.8% | 57.1% | 47.0% | 20 / 35 | 12.0% | 9.5% | 27 | 0 | 1.25 / 15.3 | 48.5% | +3.3 |
| 18 | 59.6% | 68.6% | 50.8% | 24 / 35 | 10.9% | 7.5% | 9 | 0 | 1.14 / 14.3 | 59.1% | +0.5 |
| 19 | 53.7% | 62.9% | 45.2% | 22 / 35 | 10.6% | 8.5% | 20 | 0 | 1.23 / 13.2 | 61.9% | -8.2 |
| 20 | 52.4% | 57.1% | 47.5% | 20 / 35 | 11.5% | 9.2% | 24 | 0 | 1.21 / 14.9 | 54.9% | -2.5 |

Mean score share 55.6% ± 2.3, baseline 56.2% ± 2.3, paired diff -0.6 ± 3.3.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 382 over 20 battles (19.1 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | rumble-9 | 55.6% ± 2.3 | 62.5% ± 3.4 | 49.0% ± 1.3 | 438 / 700 | 11.7% ± 0.3 | 8.4% ± 0.4 | 382 | 0 | 1.28 / 115.4 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 20 | 12 | 894 | 0 | 0.55 | 5 | 5 | 20 |

12 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 58345 | 22 | 60651 | 58270 (99.9%) | 75 (0.1%) | 2381 (3.9%) | 6334 | 742 | 324 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| xander.cat.XanderCat 12.9 | 74940 | 6253 (8.3%) | 70044 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 650 | 451 | 648 | 1340 | 31.9 / 33.2 | 1076 | 7804 | 328 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 8.4% | 382 | 2255 | 3 | 85.8 | 6178 / 6253 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 1 | 35 | 314 | 10.8% | 7.9% ± 0.9 | 10.9% | 22.8% / 22.5% | 8.4% | 0 / 0 | T3/M1 | 52% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
