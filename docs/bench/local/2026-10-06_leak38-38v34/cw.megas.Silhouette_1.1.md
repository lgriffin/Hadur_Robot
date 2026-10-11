# cw.megas.Silhouette 1.1 (mid) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 77.1% | 94.3% | 60.7% | 33 / 35 | 15.2% | 8.0% | 12 | 0 | 0.99 / 13.5 | 76.4% | +0.7 |
| 2 | 74.1% | 85.7% | 63.0% | 30 / 35 | 16.3% | 7.6% | 8 | 0 | 0.94 / 15.4 | 70.0% | +4.2 |
| 3 | 74.4% | 88.6% | 61.5% | 31 / 35 | 15.3% | 7.7% | 11 | 0 | 1.01 / 18.5 | 70.9% | +3.5 |
| 4 | 74.9% | 88.6% | 61.5% | 31 / 35 | 14.8% | 6.5% | 10 | 0 | 0.98 / 13.5 | 78.2% | -3.4 |
| 5 | 77.7% | 94.3% | 62.7% | 33 / 35 | 16.1% | 8.2% | 12 | 0 | 0.98 / 17.4 | 74.5% | +3.2 |
| 6 | 71.0% | 85.7% | 57.7% | 30 / 35 | 14.2% | 8.3% | 13 | 0 | 1.00 / 15.3 | 79.3% | -8.2 |
| 7 | 64.5% | 74.3% | 55.8% | 26 / 35 | 13.2% | 7.4% | 11 | 0 | 1.02 / 12.7 | 75.9% | -11.4 |
| 8 | 66.5% | 77.1% | 57.0% | 27 / 35 | 14.9% | 8.0% | 10 | 0 | 1.04 / 13.2 | 70.0% | -3.5 |
| 9 | 74.9% | 88.6% | 62.2% | 31 / 35 | 16.2% | 7.3% | 5 | 0 | 0.97 / 13.6 | 68.9% | +5.9 |
| 10 | 69.1% | 82.9% | 56.3% | 29 / 35 | 14.9% | 7.8% | 9 | 0 | 1.03 / 13.1 | 71.9% | -2.8 |
| 11 | 77.6% | 91.4% | 64.7% | 32 / 35 | 15.7% | 7.5% | 13 | 0 | 0.99 / 11.5 | 73.8% | +3.8 |
| 12 | 65.4% | 80.0% | 52.2% | 28 / 35 | 13.9% | 7.8% | 11 | 0 | 1.05 / 12.8 | 74.6% | -9.2 |
| 13 | 61.1% | 71.4% | 52.5% | 25 / 35 | 15.0% | 9.9% | 10 | 0 | 1.04 / 12.1 | 68.3% | -7.2 |
| 14 | 78.7% | 94.3% | 64.5% | 33 / 35 | 16.0% | 8.2% | 7 | 0 | 1.00 / 12.5 | 66.3% | +12.5 |
| 15 | 72.3% | 88.6% | 57.3% | 31 / 35 | 14.3% | 7.8% | 10 | 0 | 1.02 / 12.3 | 72.5% | -0.1 |
| 16 | 71.5% | 85.7% | 58.9% | 30 / 35 | 14.7% | 8.3% | 13 | 0 | 0.99 / 13.2 | 66.2% | +5.3 |

Mean score share 71.9% ± 2.8, baseline 72.3% ± 2.1, paired diff -0.4 ± 3.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 165 over 16 battles (10.3 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | mid | 71.9% ± 2.8 | 85.7% ± 3.7 | 59.3% ± 2.1 | 480 / 560 | 15.0% ± 0.5 | 7.9% ± 0.4 | 165 | 0 | 1.05 / 18.5 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | 16 | 12 | 298 | 0 | 0.29 | 4 | 4 | 0 |

12 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | 18137 | 32 | 18117 | 18117 (99.9%) | 20 (0.1%) | 0 (0.0%) | 625 | 281 | 67 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| cw.megas.Silhouette 1.1 | 19555 | 1649 (8.4%) | 13677 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | 650 | 409 | 630 | 514 | 43.8 / 30.1 | 3761 | 8169 | 5558 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | 7.9% | 165 | 1403 | 3 | 31.9 | 1646 / 1649 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| cw.megas.Silhouette 1.1 | cw.megas.Silhouette | 1 | 35 | 308 | 9.3% | 7.4% ± 1.6 | 13.9% | 23.4% / 23.0% | 10.2% | 0 / 0 | T3/M1 | 70% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
