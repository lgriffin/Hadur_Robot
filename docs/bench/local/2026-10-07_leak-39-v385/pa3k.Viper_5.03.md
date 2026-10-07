# pa3k.Viper 5.03 (lower) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 78.3% | 91.4% | 66.3% | 32 / 35 | 16.3% | 8.0% | 14 | 0 | 1.01 / 14.2 | 80.0% | -1.7 |
| 2 | 75.9% | 85.7% | 66.5% | 30 / 35 | 17.1% | 7.5% | 10 | 0 | 0.97 / 14.2 | 77.2% | -1.3 |
| 3 | 83.0% | 97.1% | 69.6% | 34 / 35 | 15.7% | 7.5% | 10 | 0 | 1.00 / 15.1 | 80.7% | +2.3 |
| 4 | 81.4% | 91.4% | 71.4% | 32 / 35 | 17.3% | 6.4% | 10 | 0 | 0.98 / 13.6 | 68.0% | +13.4 |
| 5 | 74.2% | 82.9% | 65.9% | 29 / 35 | 16.8% | 8.9% | 9 | 0 | 0.98 / 16.0 | 78.6% | -4.4 |
| 6 | 77.4% | 88.6% | 66.6% | 31 / 35 | 16.5% | 9.7% | 12 | 0 | 1.02 / 14.1 | 84.5% | -7.0 |
| 7 | 76.7% | 85.7% | 68.4% | 30 / 35 | 15.0% | 7.7% | 13 | 0 | 1.01 / 14.1 | 87.1% | -10.4 |
| 8 | 81.6% | 91.4% | 71.3% | 32 / 35 | 14.7% | 6.1% | 8 | 0 | 0.98 / 14.0 | 82.9% | -1.3 |
| 9 | 78.6% | 85.7% | 71.2% | 30 / 35 | 16.2% | 7.0% | 10 | 0 | 1.02 / 14.5 | 87.6% | -9.0 |
| 10 | 84.6% | 97.1% | 73.4% | 34 / 35 | 17.7% | 7.6% | 12 | 0 | 0.96 / 14.8 | 89.1% | -4.5 |
| 11 | 82.5% | 94.3% | 71.3% | 33 / 35 | 15.5% | 6.1% | 4 | 0 | 0.87 / 16.0 | 78.0% | +4.5 |
| 12 | 85.0% | 97.1% | 73.2% | 34 / 35 | 15.6% | 7.1% | 13 | 0 | 1.01 / 12.5 | 79.3% | +5.7 |
| 13 | 85.6% | 94.3% | 76.9% | 33 / 35 | 16.0% | 5.6% | 8 | 0 | 0.96 / 13.7 | 73.2% | +12.4 |
| 14 | 79.7% | 88.6% | 70.8% | 31 / 35 | 15.2% | 7.0% | 13 | 0 | 0.95 / 15.2 | 71.9% | +7.8 |
| 15 | 88.2% | 100.0% | 76.3% | 35 / 35 | 15.6% | 5.7% | 9 | 0 | 0.83 / 13.9 | 81.0% | +7.2 |
| 16 | 78.2% | 88.6% | 69.6% | 31 / 35 | 18.3% | 7.4% | 6 | 0 | 0.88 / 14.6 | 86.3% | -8.1 |

Mean score share 80.7% ± 2.1, baseline 80.3% ± 3.2, paired diff +0.3 ± 4.0.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 161 over 16 battles (10.1 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | lower | 80.7% ± 2.1 | 91.3% ± 2.7 | 70.5% ± 1.8 | 511 / 560 | 16.2% ± 0.5 | 7.2% ± 0.6 | 161 | 0 | 1.02 / 16.0 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 16 | 12 | 596 | 0 | 0.29 | 3 | 3 | 0 |

12 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 18636 | 34 | 18606 | 18598 (99.8%) | 38 (0.2%) | 8 (0.0%) | 1199 | 285 | 59 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| pa3k.Viper 5.03 | 22722 | 1652 (7.3%) | 11231 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 650 | 442 | 520 | 582 | 52.2 / 21.9 | 5137 | 8668 | 139 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 7.2% | 161 | 176 | 3 | 33.1 | 1651 / 1652 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | pa3k.Viper | 1 | 35 | 274 | 8.3% | 6.6% ± 1.6 | 16.8% | 33.3% / 30.3% | 22.7% | 0 / 0 | T2/M0 | 78% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
