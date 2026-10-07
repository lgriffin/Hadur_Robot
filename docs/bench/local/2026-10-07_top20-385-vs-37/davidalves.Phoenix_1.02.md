# davidalves.Phoenix 1.02 (rumble-21) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 54.9% | 68.6% | 40.6% | 24 / 35 | 10.7% | 7.3% | 16 | 0 | 1.11 / 13.0 | 64.5% | -9.6 |
| 2 | 54.6% | 68.6% | 40.3% | 24 / 35 | 10.5% | 7.3% | 13 | 0 | 1.13 / 13.6 | 56.7% | -2.1 |
| 3 | 59.4% | 74.3% | 43.5% | 26 / 35 | 9.4% | 7.6% | 9 | 0 | 1.13 / 225.1 | 57.2% | +2.2 |
| 4 | 59.7% | 77.1% | 42.3% | 27 / 35 | 10.2% | 8.1% | 14 | 0 | 1.17 / 29.2 | 62.5% | -2.9 |
| 5 | 55.0% | 68.6% | 41.3% | 24 / 35 | 9.3% | 7.9% | 13 | 0 | 1.13 / 162.9 | 63.2% | -8.2 |
| 6 | 57.5% | 74.3% | 39.2% | 26 / 35 | 10.1% | 8.0% | 7 | 0 | 1.22 / 142.8 | 54.2% | +3.3 |
| 7 | 54.4% | 71.4% | 38.1% | 25 / 35 | 9.4% | 8.6% | 11 | 0 | 1.13 / 583.3 | 64.2% | -9.8 |
| 8 | 54.0% | 68.6% | 38.1% | 24 / 35 | 9.3% | 7.6% | 9 | 0 | 1.25 / 16.4 | 59.4% | -5.4 |
| 9 | 59.8% | 77.1% | 41.1% | 27 / 35 | 9.2% | 7.9% | 6 | 0 | 1.16 / 50.4 | 57.5% | +2.2 |
| 10 | 53.2% | 65.7% | 40.3% | 23 / 35 | 9.0% | 7.8% | 20 | 0 | 1.28 / 203.5 | 65.1% | -12.0 |
| 11 | 54.8% | 68.6% | 40.8% | 24 / 35 | 9.5% | 7.8% | 15 | 0 | 1.14 / 12.9 | 54.0% | +0.8 |
| 12 | 62.7% | 82.9% | 41.0% | 29 / 35 | 9.3% | 7.8% | 12 | 0 | 1.14 / 117.2 | 60.3% | +2.4 |
| 13 | 62.9% | 80.0% | 45.4% | 28 / 35 | 10.3% | 7.9% | 15 | 0 | 1.27 / 14.6 | 54.2% | +8.7 |
| 14 | 55.4% | 71.4% | 39.5% | 25 / 35 | 9.1% | 8.0% | 9 | 0 | 1.11 / 12.3 | 53.4% | +2.0 |
| 15 | 50.9% | 68.6% | 34.9% | 24 / 35 | 9.2% | 9.6% | 20 | 0 | 1.27 / 190.8 | 58.8% | -7.9 |
| 16 | 56.5% | 74.3% | 40.1% | 26 / 35 | 10.1% | 8.8% | 15 | 0 | 1.14 / 105.8 | 62.2% | -5.8 |
| 17 | 61.1% | 77.1% | 44.5% | 27 / 35 | 10.6% | 7.7% | 9 | 0 | 1.19 / 17.8 | 64.4% | -3.3 |
| 18 | 52.6% | 68.6% | 36.5% | 24 / 35 | 9.7% | 8.3% | 11 | 0 | 1.11 / 12.3 | 57.2% | -4.6 |
| 19 | 60.2% | 80.0% | 40.8% | 28 / 35 | 10.0% | 8.5% | 7 | 0 | 1.16 / 13.2 | 53.7% | +6.5 |
| 20 | 64.4% | 82.9% | 45.4% | 29 / 35 | 10.4% | 7.6% | 10 | 0 | 1.11 / 11.9 | 63.3% | +1.2 |

Mean score share 57.2% ± 1.8, baseline 59.3% ± 1.9, paired diff -2.1 ± 2.7.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 241 over 20 battles (12.1 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | rumble-21 | 57.2% ± 1.8 | 73.4% ± 2.5 | 40.7% ± 1.3 | 514 / 700 | 9.8% ± 0.3 | 8.0% ± 0.3 | 241 | 0 | 1.28 / 583.3 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 20 | 17 | 0 | 0 | 0.34 | 3 | 3 | 0 |

17 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 37404 | 21 | 37410 | 37402 (100.0%) | 2 (0.0%) | 8 (0.0%) | 2641 | 385 | 103 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| davidalves.Phoenix 1.02 | 46049 | 3726 (8.1%) | 39984 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 650 | 461 | 650 | 838 | 24.4 / 35.5 | 408 | 25991 | 620 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 8.0% | 241 | 567 | 3 | 53.1 | 3726 / 3726 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | davidalves.Phoenix | 1 | 35 | 306 | 8.2% | 7.4% ± 1.3 | 10.1% | 21.8% / 22.1% | 5.3% | 0 / 0 | T3/M1 | 64% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
