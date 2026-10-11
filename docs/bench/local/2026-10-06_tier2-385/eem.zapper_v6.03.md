# eem.zapper v6.03 (mid) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 67.8% | 85.7% | 49.5% | 30 / 35 | 11.4% | 7.6% | 24 | 0 | 1.64 / 27.1 | 74.3% | -6.5 |
| 2 | 66.7% | 82.9% | 51.2% | 29 / 35 | 11.6% | 7.8% | 9 | 0 | 1.83 / 26.5 | 70.2% | -3.5 |
| 3 | 68.4% | 82.4% | 54.4% | 29 / 35 | 11.7% | 8.3% | 24 | 0 | 2.05 / 27.2 | 65.5% | +2.9 |
| 4 | 66.2% | 82.9% | 50.5% | 29 / 35 | 11.4% | 8.0% | 14 | 0 | 1.60 / 26.5 | 65.9% | +0.3 |
| 5 | 74.7% | 88.6% | 60.9% | 31 / 35 | 12.5% | 7.0% | 16 | 0 | 1.70 / 24.9 | 76.5% | -1.8 |
| 6 | 60.8% | 74.3% | 47.4% | 26 / 35 | 10.8% | 8.3% | 19 | 0 | 1.84 / 25.4 | 73.0% | -12.1 |
| 7 | 67.7% | 82.9% | 53.1% | 29 / 35 | 12.0% | 7.9% | 11 | 0 | 1.72 / 25.3 | 62.3% | +5.4 |
| 8 | 68.7% | 85.7% | 51.6% | 30 / 35 | 10.8% | 7.5% | 11 | 0 | 1.62 / 25.1 | 59.7% | +9.0 |
| 9 | 69.0% | 85.7% | 51.2% | 30 / 35 | 10.6% | 7.7% | 15 | 0 | 1.64 / 23.9 | 65.9% | +3.1 |
| 10 | 69.9% | 85.7% | 53.9% | 30 / 35 | 11.8% | 7.9% | 12 | 0 | 1.67 / 24.3 | 58.4% | +11.5 |
| 11 | 66.3% | 80.0% | 52.4% | 28 / 35 | 10.8% | 7.0% | 18 | 0 | 1.90 / 25.9 | 73.3% | -7.0 |
| 12 | 57.7% | 71.4% | 43.7% | 25 / 35 | 10.6% | 10.2% | 24 | 0 | 1.70 / 27.1 | 74.2% | -16.5 |
| 13 | 71.8% | 85.7% | 57.7% | 30 / 35 | 12.4% | 7.5% | 11 | 0 | 1.58 / 26.0 | 71.5% | +0.3 |
| 14 | 74.7% | 91.4% | 58.0% | 32 / 35 | 12.4% | 6.8% | 14 | 0 | 1.55 / 23.2 | 62.6% | +12.2 |
| 15 | 61.3% | 74.3% | 48.3% | 26 / 35 | 11.2% | 8.2% | 17 | 0 | 1.60 / 26.2 | 66.7% | -5.4 |
| 16 | 67.2% | 85.7% | 48.8% | 30 / 35 | 11.4% | 8.3% | 23 | 0 | 1.68 / 27.7 | 72.4% | -5.2 |
| 17 | 63.0% | 77.1% | 48.8% | 27 / 35 | 10.4% | 8.0% | 23 | 0 | 1.63 / 26.3 | 72.9% | -9.9 |
| 18 | 74.3% | 91.4% | 56.3% | 32 / 35 | 11.3% | 7.2% | 10 | 0 | 2.12 / 27.1 | 66.4% | +7.9 |
| 19 | 71.9% | 88.6% | 54.6% | 31 / 35 | 11.5% | 7.8% | 19 | 0 | 1.70 / 25.5 | 73.3% | -1.4 |
| 20 | 76.8% | 91.4% | 60.4% | 32 / 35 | 11.2% | 6.9% | 13 | 0 | 1.67 / 26.9 | 71.0% | +5.8 |

Mean score share 68.3% ± 2.4, baseline 68.8% ± 2.5, paired diff -0.5 ± 3.7.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 327 over 20 battles (16.4 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| eem.zapper v6.03 | mid | 68.3% ± 2.4 | 83.7% ± 2.7 | 52.6% ± 2.1 | 586 / 700 | 11.4% ± 0.3 | 7.8% ± 0.3 | 327 | 0 | 2.12 / 27.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| eem.zapper v6.03 | 20 | 14 | 0 | 0 | 0.47 | 6 | 6 | 0 |

14 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| eem.zapper v6.03 | 51199 | 34 | 51360 | 51197 (100.0%) | 2 (0.0%) | 163 (0.3%) | 3483 | 491 | 213 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| eem.zapper v6.03 | 54152 | 5529 (10.2%) | 48945 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| eem.zapper v6.03 | 650 | 498 | 650 | 983 | 33.6 / 30.2 | 938 | 32896 | 46 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| eem.zapper v6.03 | 7.8% | 327 | 9782 | 3 | 72.9 | 5524 / 5529 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| eem.zapper v6.03 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| eem.zapper v6.03 | eem.zapper | 1 | 35 | 276 | 8.5% | 7.3% ± 1.1 | 10.6% | 25.4% / 24.2% | 0.9% | 0 / 0 | T3/M0 | 76% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
