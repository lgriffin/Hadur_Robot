# pl.Patton.GeneralPatton 1.54 (weak) vs hadur2.Hadur 3.9

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 88.0% | 94.3% | 83.4% | 33 / 35 | 22.5% | 5.9% | 11 | 0 | 0.65 / 14.9 | 69.2% | +18.8 |
| 2 | 84.1% | 97.1% | 73.1% | 34 / 35 | 19.8% | 10.1% | 10 | 0 | 1.00 / 16.5 | 77.7% | +6.4 |
| 3 | 75.5% | 80.0% | 71.2% | 28 / 35 | 21.6% | 10.3% | 4 | 0 | 0.96 / 15.6 | 74.3% | +1.2 |
| 4 | 78.6% | 88.6% | 69.4% | 31 / 35 | 18.7% | 8.6% | 6 | 0 | 0.88 / 13.5 | 69.1% | +9.5 |
| 5 | 84.3% | 94.3% | 74.8% | 33 / 35 | 18.8% | 8.3% | 11 | 0 | 0.98 / 15.2 | 78.3% | +5.9 |
| 6 | 72.1% | 77.1% | 67.2% | 27 / 35 | 18.7% | 11.2% | 13 | 0 | 0.98 / 15.9 | 78.2% | -6.0 |
| 7 | 81.3% | 91.4% | 72.3% | 32 / 35 | 18.8% | 9.0% | 11 | 0 | 0.97 / 14.1 | 67.9% | +13.3 |
| 8 | 80.8% | 91.2% | 72.8% | 32 / 35 | 20.8% | 9.6% | 10 | 0 | 0.93 / 10.6 | 66.1% | +14.7 |

Mean score share 80.6% ± 4.3, baseline 72.6% ± 4.3, paired diff +8.0 ± 6.7.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 76 over 8 battles (9.5 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pl.Patton.GeneralPatton 1.54 | weak | 80.6% ± 4.3 | 89.3% ± 5.9 | 73.0% ± 4.0 | 250 / 280 | 20.0% ± 1.3 | 9.1% ± 1.3 | 76 | 0 | 1.00 / 16.5 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pl.Patton.GeneralPatton 1.54 | 8 | 6 | 0 | 0 | 0.27 | 2 | 2 | 0 |

6 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| pl.Patton.GeneralPatton 1.54 | 7906 | 24 | 7907 | 7902 (99.9%) | 4 (0.1%) | 5 (0.1%) | 375 | 124 | 21 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| pl.Patton.GeneralPatton 1.54 | 7794 | 575 (7.4%) | 3050 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| pl.Patton.GeneralPatton 1.54 | 650 | 364 | 447 | 436 | 61.4 / 22.8 | 3938 | 3247 | 1157 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| pl.Patton.GeneralPatton 1.54 | 9.1% | 76 | 98 | 3 | 27.9 | 575 / 575 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| pl.Patton.GeneralPatton 1.54 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| pl.Patton.GeneralPatton 1.54 | pl.Patton.GeneralPatton | 1 | 35 | 326 | 11.0% | 6.8% ± 1.7 | 17.4% | 26.7% / 24.7% | 7.4% | 0 / 0 | T2/M0 | 78% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
