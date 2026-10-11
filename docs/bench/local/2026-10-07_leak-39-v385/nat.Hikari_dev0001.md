# nat.Hikari dev0001 (lower) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 79.3% | 94.3% | 64.6% | 33 / 35 | 15.3% | 7.2% | 10 | 0 | 0.86 / 15.7 | 81.0% | -1.7 |
| 2 | 84.9% | 97.1% | 72.2% | 34 / 35 | 15.4% | 6.2% | 9 | 0 | 0.78 / 15.5 | 83.4% | +1.4 |
| 3 | 85.2% | 97.1% | 73.0% | 34 / 35 | 16.8% | 5.8% | 7 | 0 | 0.75 / 14.5 | 87.8% | -2.7 |
| 4 | 86.9% | 100.0% | 73.1% | 35 / 35 | 15.2% | 5.6% | 11 | 0 | 0.75 / 16.1 | 81.0% | +5.8 |
| 5 | 80.8% | 94.3% | 67.5% | 33 / 35 | 16.1% | 7.0% | 13 | 0 | 0.86 / 13.7 | 78.4% | +2.4 |
| 6 | 81.3% | 91.4% | 71.2% | 32 / 35 | 15.3% | 6.0% | 11 | 0 | 0.83 / 15.4 | 84.5% | -3.2 |
| 7 | 81.4% | 94.3% | 69.0% | 33 / 35 | 16.0% | 7.0% | 14 | 0 | 0.83 / 14.2 | 84.9% | -3.4 |
| 8 | 85.4% | 100.0% | 70.4% | 35 / 35 | 15.3% | 6.1% | 8 | 0 | 0.81 / 14.6 | 86.8% | -1.4 |
| 9 | 85.4% | 100.0% | 69.8% | 35 / 35 | 14.8% | 5.7% | 9 | 0 | 0.79 / 15.5 | 73.7% | +11.6 |
| 10 | 80.8% | 91.4% | 69.6% | 32 / 35 | 14.7% | 5.6% | 11 | 0 | 0.82 / 14.1 | 85.7% | -4.9 |
| 11 | 84.5% | 100.0% | 69.3% | 35 / 35 | 15.5% | 6.7% | 9 | 0 | 0.89 / 16.1 | 79.7% | +4.8 |
| 12 | 80.5% | 94.3% | 66.7% | 33 / 35 | 15.8% | 6.2% | 13 | 0 | 0.92 / 13.9 | 84.3% | -3.7 |
| 13 | 86.7% | 97.1% | 75.3% | 34 / 35 | 15.7% | 5.3% | 9 | 0 | 0.76 / 12.8 | 87.2% | -0.5 |
| 14 | 80.4% | 100.0% | 62.4% | 35 / 35 | 15.0% | 8.1% | 13 | 0 | 0.94 / 13.6 | 82.4% | -1.9 |
| 15 | 85.9% | 100.0% | 70.9% | 35 / 35 | 15.1% | 5.6% | 11 | 0 | 0.86 / 14.9 | 85.0% | +1.0 |
| 16 | 79.2% | 94.3% | 64.7% | 33 / 35 | 15.4% | 7.7% | 19 | 0 | 0.90 / 15.8 | 79.3% | -0.1 |

Mean score share 83.0% ± 1.5, baseline 82.8% ± 2.0, paired diff +0.2 ± 2.3.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 177 over 16 battles (11.1 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | lower | 83.0% ± 1.5 | 96.6% ± 1.7 | 69.4% ± 1.9 | 541 / 560 | 15.5% ± 0.3 | 6.4% ± 0.4 | 177 | 0 | 0.94 / 16.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 16 | 16 | 0 | 0 | 0.32 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 19063 | 44 | 19068 | 19062 (100.0%) | 1 (0.0%) | 6 (0.0%) | 493 | 290 | 68 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| nat.Hikari dev0001 | 19431 | 1960 (10.1%) | 16842 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 650 | 413 | 567 | 507 | 47.7 / 21.2 | 4361 | 8397 | 5366 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 6.4% | 177 | 117 | 3 | 34.0 | 1958 / 1960 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | nat.Hikari | 1 | 35 | 280 | 8.2% | 7.1% ± 1.5 | 14.4% | 32.7% / 31.6% | 26.3% | 0 / 0 | T3/M0 | 78% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
