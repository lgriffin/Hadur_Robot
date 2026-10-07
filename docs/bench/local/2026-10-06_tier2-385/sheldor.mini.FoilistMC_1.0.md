# sheldor.mini.FoilistMC 1.0 (mid) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 72.3% | 85.7% | 58.3% | 30 / 35 | 11.9% | 7.2% | 21 | 0 | 1.36 / 14.5 | 71.2% | +1.1 |
| 2 | 75.3% | 91.4% | 57.3% | 32 / 35 | 11.7% | 6.7% | 14 | 0 | 1.30 / 15.8 | 79.2% | -3.9 |
| 3 | 67.1% | 80.0% | 54.1% | 28 / 35 | 11.8% | 8.9% | 16 | 0 | 1.22 / 15.2 | 73.3% | -6.2 |
| 4 | 71.3% | 82.9% | 59.3% | 29 / 35 | 12.4% | 7.6% | 13 | 0 | 1.38 / 13.4 | 77.3% | -6.1 |
| 5 | 74.7% | 85.7% | 61.9% | 30 / 35 | 11.3% | 7.5% | 27 | 0 | 1.28 / 15.1 | 74.8% | -0.1 |
| 6 | 71.9% | 85.7% | 56.9% | 30 / 35 | 11.8% | 7.4% | 8 | 0 | 1.34 / 14.7 | 69.3% | +2.7 |
| 7 | 76.8% | 91.4% | 61.5% | 32 / 35 | 12.0% | 6.6% | 11 | 0 | 1.24 / 13.9 | 72.7% | +4.1 |
| 8 | 71.6% | 85.7% | 55.4% | 30 / 35 | 10.3% | 7.2% | 20 | 0 | 1.29 / 16.3 | 71.0% | +0.6 |
| 9 | 64.9% | 74.3% | 54.2% | 26 / 35 | 11.5% | 7.2% | 14 | 0 | 1.24 / 14.3 | 73.1% | -8.2 |
| 10 | 69.5% | 80.0% | 58.1% | 28 / 35 | 12.3% | 6.9% | 22 | 0 | 1.27 / 14.3 | 73.4% | -3.9 |
| 11 | 74.4% | 91.4% | 56.9% | 32 / 35 | 12.4% | 7.4% | 25 | 0 | 1.31 / 16.5 | 68.5% | +6.0 |
| 12 | 72.9% | 85.7% | 59.7% | 30 / 35 | 11.8% | 7.5% | 20 | 0 | 1.30 / 16.9 | 67.8% | +5.1 |
| 13 | 79.5% | 94.3% | 63.1% | 33 / 35 | 11.5% | 6.6% | 19 | 0 | 1.34 / 14.1 | 67.1% | +12.4 |
| 14 | 62.9% | 74.3% | 50.9% | 26 / 35 | 11.0% | 7.8% | 15 | 0 | 1.28 / 17.1 | 70.7% | -7.9 |
| 15 | 70.9% | 85.7% | 56.4% | 30 / 35 | 11.9% | 7.7% | 15 | 0 | 1.29 / 14.6 | 71.5% | -0.6 |
| 16 | 72.0% | 85.7% | 58.4% | 30 / 35 | 13.3% | 7.0% | 14 | 0 | 1.21 / 12.8 | 67.6% | +4.4 |
| 17 | 72.4% | 85.7% | 57.7% | 30 / 35 | 11.2% | 7.6% | 12 | 0 | 1.25 / 14.7 | 70.9% | +1.5 |
| 18 | 67.7% | 82.9% | 52.5% | 29 / 35 | 11.2% | 7.8% | 14 | 0 | 1.29 / 17.1 | 76.7% | -9.0 |
| 19 | 74.2% | 85.7% | 61.9% | 30 / 35 | 12.0% | 7.0% | 19 | 0 | 1.25 / 14.5 | 70.0% | +4.3 |
| 20 | 62.7% | 71.4% | 54.5% | 25 / 35 | 11.8% | 7.6% | 17 | 0 | 1.33 / 14.3 | 69.8% | -7.1 |

Mean score share 71.3% ± 2.1, baseline 71.8% ± 1.6, paired diff -0.5 ± 2.7.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 336 over 20 battles (16.8 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.mini.FoilistMC 1.0 | mid | 71.3% ± 2.1 | 84.3% ± 2.8 | 57.4% ± 1.5 | 590 / 700 | 11.8% ± 0.3 | 7.4% ± 0.2 | 336 | 0 | 1.38 / 17.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sheldor.mini.FoilistMC 1.0 | 20 | 15 | 0 | 0 | 0.48 | 5 | 5 | 0 |

15 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sheldor.mini.FoilistMC 1.0 | 62984 | 156 | 62997 | 62977 (100.0%) | 7 (0.0%) | 20 (0.0%) | 4371 | 567 | 251 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sheldor.mini.FoilistMC 1.0 | 62459 | 5986 (9.6%) | 58030 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sheldor.mini.FoilistMC 1.0 | 650 | 574 | 590 | 1119 | 35.7 / 26.4 | 1349 | 25520 | 5519 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sheldor.mini.FoilistMC 1.0 | 7.4% | 336 | 6009 | 3 | 89.0 | 5975 / 5986 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| sheldor.mini.FoilistMC 1.0 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.mini.FoilistMC 1.0 | sheldor.mini.FoilistMC | 1 | 35 | 320 | 8.5% | 8.4% ± 1.0 | 11.8% | 25.3% / 25.1% | 3.9% | 0 / 0 | T3/M0 | 63% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
