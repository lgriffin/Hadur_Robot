# pa3k.Viper 5.03 (lower) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 84.4% | 94.3% | 74.9% | 33 / 35 | 15.5% | 5.9% | 12 | 0 | 0.94 / 14.0 | 81.3% | +3.1 |
| 2 | 78.4% | 88.6% | 69.0% | 31 / 35 | 17.3% | 8.9% | 10 | 0 | 0.97 / 14.7 | 75.1% | +3.3 |
| 3 | 81.5% | 94.3% | 69.5% | 33 / 35 | 15.6% | 7.2% | 13 | 0 | 1.03 / 13.7 | 84.9% | -3.4 |
| 4 | 80.0% | 88.6% | 72.1% | 31 / 35 | 17.5% | 7.3% | 10 | 0 | 1.02 / 13.6 | 77.5% | +2.5 |
| 5 | 78.8% | 88.6% | 69.7% | 31 / 35 | 16.3% | 8.0% | 12 | 0 | 1.01 / 19.0 | 82.5% | -3.7 |
| 6 | 84.5% | 97.1% | 72.3% | 34 / 35 | 16.2% | 6.4% | 12 | 0 | 1.06 / 18.9 | 77.5% | +7.0 |
| 7 | 76.7% | 88.6% | 65.7% | 31 / 35 | 17.8% | 7.6% | 12 | 0 | 0.99 / 14.3 | 83.1% | -6.4 |
| 8 | 77.7% | 88.6% | 67.7% | 31 / 35 | 15.7% | 7.6% | 10 | 0 | 1.10 / 13.7 | 81.5% | -3.8 |
| 9 | 83.2% | 94.3% | 72.9% | 33 / 35 | 16.4% | 7.7% | 11 | 0 | 1.03 / 13.1 | 82.7% | +0.5 |
| 10 | 86.8% | 97.1% | 76.3% | 34 / 35 | 15.6% | 6.3% | 11 | 0 | 0.89 / 13.4 | 79.1% | +7.7 |
| 11 | 83.6% | 94.3% | 73.8% | 33 / 35 | 16.6% | 6.8% | 12 | 0 | 1.00 / 13.8 | 76.5% | +7.1 |
| 12 | 82.1% | 91.4% | 73.3% | 32 / 35 | 17.4% | 7.7% | 10 | 0 | 1.05 / 16.9 | 82.3% | -0.2 |
| 13 | 80.4% | 85.7% | 74.9% | 30 / 35 | 16.1% | 4.9% | 9 | 0 | 0.87 / 18.0 | 83.2% | -2.7 |
| 14 | 78.3% | 88.6% | 69.5% | 31 / 35 | 15.9% | 7.8% | 10 | 0 | 0.94 / 13.9 | 82.6% | -4.3 |
| 15 | 88.3% | 100.0% | 75.9% | 35 / 35 | 15.7% | 5.6% | 9 | 0 | 0.91 / 14.0 | 77.6% | +10.7 |
| 16 | 84.2% | 97.1% | 71.9% | 34 / 35 | 21.4% | 11.8% | 6 | 0 | 0.94 / 13.1 | 80.3% | +3.9 |

Mean score share 81.8% ± 1.8, baseline 80.5% ± 1.5, paired diff +1.3 ± 2.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 169 over 16 battles (10.6 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | lower | 81.8% ± 1.8 | 92.3% ± 2.3 | 71.8% ± 1.6 | 517 / 560 | 16.7% ± 0.8 | 7.3% ± 0.8 | 169 | 0 | 1.10 / 19.0 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 16 | 14 | 298 | 0 | 0.30 | 1 | 1 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 17966 | 43 | 17952 | 17947 (99.9%) | 19 (0.1%) | 5 (0.0%) | 1120 | 271 | 62 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| pa3k.Viper 5.03 | 22016 | 1503 (6.8%) | 9284 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 650 | 431 | 522 | 566 | 53.3 / 21.0 | 5285 | 8799 | 70 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 7.3% | 169 | 161 | 3 | 32.0 | 1502 / 1503 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| pa3k.Viper 5.03 | pa3k.Viper | 1 | 35 | 274 | 8.3% | 6.6% ± 1.7 | 15.0% | 33.7% / 29.7% | 23.8% | 0 / 0 | T2/M0 | 83% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
