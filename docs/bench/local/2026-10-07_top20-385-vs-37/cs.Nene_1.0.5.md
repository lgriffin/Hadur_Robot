# cs.Nene 1.0.5 (rumble-18) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 61.5% | 80.0% | 40.9% | 28 / 35 | 8.4% | 7.5% | 6 | 0 | 1.26 / 18.7 | 53.3% | +8.2 |
| 2 | 51.1% | 65.7% | 36.6% | 23 / 35 | 9.3% | 8.0% | 14 | 0 | 1.29 / 14.9 | 57.3% | -6.1 |
| 3 | 68.5% | 88.6% | 44.4% | 31 / 35 | 9.4% | 7.3% | 9 | 0 | 1.19 / 19.6 | 53.9% | +14.6 |
| 4 | 59.1% | 80.0% | 36.1% | 28 / 35 | 8.7% | 7.8% | 15 | 0 | 1.25 / 16.0 | 50.1% | +9.1 |
| 5 | 54.8% | 71.4% | 38.3% | 25 / 35 | 9.6% | 8.0% | 16 | 0 | 1.25 / 13.2 | 61.2% | -6.4 |
| 6 | 57.7% | 74.3% | 39.1% | 26 / 35 | 8.5% | 7.0% | 8 | 0 | 1.22 / 19.2 | 58.2% | -0.6 |
| 7 | 65.9% | 85.7% | 43.4% | 30 / 35 | 9.4% | 7.0% | 11 | 0 | 1.24 / 16.0 | 55.4% | +10.5 |
| 8 | 60.5% | 80.0% | 38.8% | 28 / 35 | 9.6% | 7.4% | 12 | 0 | 1.23 / 15.0 | 65.1% | -4.6 |
| 9 | 56.9% | 71.4% | 41.3% | 25 / 35 | 9.6% | 7.4% | 8 | 0 | 1.25 / 17.5 | 58.7% | -1.8 |
| 10 | 64.1% | 82.9% | 45.0% | 29 / 35 | 9.5% | 8.0% | 8 | 0 | 1.24 / 139.8 | 54.1% | +10.0 |
| 11 | 59.1% | 77.1% | 41.4% | 27 / 35 | 9.3% | 8.1% | 4 | 0 | 1.27 / 15.7 | 54.7% | +4.4 |
| 12 | 58.5% | 74.3% | 43.0% | 26 / 35 | 10.2% | 7.9% | 8 | 0 | 1.21 / 15.4 | 60.8% | -2.4 |
| 13 | 69.6% | 91.4% | 44.5% | 32 / 35 | 10.2% | 6.9% | 10 | 0 | 1.20 / 17.2 | 68.7% | +0.9 |
| 14 | 52.7% | 71.4% | 34.6% | 25 / 35 | 9.1% | 8.5% | 7 | 0 | 1.27 / 13.9 | 61.3% | -8.7 |
| 15 | 53.5% | 68.6% | 38.5% | 24 / 35 | 9.3% | 8.1% | 12 | 0 | 1.28 / 16.5 | 52.5% | +1.0 |
| 16 | 56.6% | 74.3% | 36.9% | 26 / 35 | 8.8% | 7.9% | 15 | 0 | 1.30 / 18.1 | 60.9% | -4.3 |
| 17 | 58.3% | 77.1% | 39.3% | 27 / 35 | 9.6% | 7.8% | 14 | 0 | 1.23 / 16.3 | 65.2% | -6.9 |
| 18 | 62.2% | 77.1% | 45.6% | 27 / 35 | 10.8% | 7.1% | 12 | 0 | 1.26 / 16.9 | 55.5% | +6.7 |
| 19 | 61.6% | 80.0% | 41.5% | 28 / 35 | 8.8% | 7.8% | 11 | 0 | 1.22 / 19.1 | 64.1% | -2.4 |
| 20 | 62.3% | 80.0% | 43.8% | 28 / 35 | 9.9% | 7.7% | 8 | 0 | 1.26 / 20.2 | 65.4% | -3.1 |

Mean score share 59.7% ± 2.3, baseline 58.8% ± 2.4, paired diff +0.9 ± 3.2.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 208 over 20 battles (10.4 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | rumble-18 | 59.7% ± 2.3 | 77.6% ± 3.0 | 40.6% ± 1.5 | 543 / 700 | 9.4% ± 0.3 | 7.7% ± 0.2 | 208 | 0 | 1.30 / 139.8 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 20 | 19 | 298 | 0 | 0.30 | 0 | 0 | 0 |

19 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 38487 | 320 | 38468 | 38462 (99.9%) | 25 (0.1%) | 6 (0.0%) | 2263 | 297 | 116 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| cs.Nene 1.0.5 | 42896 | 4066 (9.5%) | 37155 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 650 | 471 | 638 | 783 | 23.5 / 34.3 | 392 | 25941 | 6257 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 7.7% | 208 | 908 | 3 | 54.8 | 4036 / 4066 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | cs.Nene | 1 | 35 | 264 | 8.4% | 7.4% ± 1.3 | 10.0% | 24.1% / 23.7% | 8.6% | 0 / 0 | T3/M1 | 62% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
