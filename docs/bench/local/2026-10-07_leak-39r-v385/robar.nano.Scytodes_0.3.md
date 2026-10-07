# robar.nano.Scytodes 0.3 (weak) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 95.1% | 100.0% | 90.8% | 35 / 35 | 51.5% | 4.9% | 11 | 0 | 0.61 / 11.5 | 94.8% | +0.3 |
| 2 | 92.5% | 100.0% | 86.1% | 35 / 35 | 47.7% | 7.8% | 16 | 0 | 0.78 / 9.0 | 95.1% | -2.6 |
| 3 | 95.4% | 100.0% | 91.3% | 35 / 35 | 48.8% | 4.5% | 9 | 0 | 0.65 / 13.5 | 93.9% | +1.5 |
| 4 | 94.4% | 100.0% | 89.6% | 35 / 35 | 50.0% | 5.3% | 13 | 0 | 0.73 / 13.9 | 94.9% | -0.4 |
| 5 | 97.0% | 100.0% | 94.2% | 35 / 35 | 53.4% | 3.8% | 13 | 0 | 0.62 / 8.5 | 93.6% | +3.4 |
| 6 | 95.7% | 100.0% | 91.7% | 35 / 35 | 49.5% | 4.4% | 9 | 0 | 0.61 / 7.6 | 93.8% | +1.8 |
| 7 | 94.6% | 100.0% | 89.8% | 35 / 35 | 47.5% | 5.2% | 12 | 0 | 0.74 / 14.5 | 95.9% | -1.3 |
| 8 | 91.9% | 100.0% | 85.3% | 35 / 35 | 53.4% | 8.9% | 10 | 0 | 0.70 / 12.5 | 93.8% | -2.0 |
| 9 | 93.1% | 100.0% | 87.3% | 35 / 35 | 52.6% | 7.0% | 12 | 0 | 0.78 / 14.3 | 93.7% | -0.6 |
| 10 | 94.8% | 100.0% | 90.2% | 35 / 35 | 52.1% | 5.5% | 17 | 0 | 0.74 / 8.8 | 94.6% | +0.1 |
| 11 | 93.4% | 100.0% | 87.9% | 35 / 35 | 50.3% | 7.2% | 9 | 0 | 0.77 / 9.7 | 95.3% | -1.8 |
| 12 | 94.5% | 100.0% | 89.7% | 35 / 35 | 49.6% | 5.6% | 11 | 0 | 0.73 / 14.7 | 92.5% | +2.0 |
| 13 | 95.5% | 100.0% | 91.4% | 35 / 35 | 49.8% | 5.3% | 13 | 0 | 0.70 / 9.4 | 96.5% | -1.0 |
| 14 | 92.4% | 100.0% | 86.0% | 35 / 35 | 46.4% | 7.5% | 14 | 0 | 0.73 / 14.6 | 93.5% | -1.1 |
| 15 | 93.6% | 100.0% | 88.1% | 35 / 35 | 51.2% | 6.1% | 14 | 0 | 0.72 / 12.3 | 92.7% | +0.9 |
| 16 | 93.0% | 100.0% | 87.1% | 35 / 35 | 48.5% | 6.8% | 10 | 0 | 0.75 / 13.4 | 93.6% | -0.5 |

Mean score share 94.2% ± 0.7, baseline 94.3% ± 0.6, paired diff -0.1 ± 0.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 193 over 16 battles (12.1 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| robar.nano.Scytodes 0.3 | weak | 94.2% ± 0.7 | 100.0% ± 0.0 | 89.1% ± 1.3 | 560 / 560 | 50.1% ± 1.1 | 6.0% ± 0.8 | 193 | 0 | 0.78 / 14.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| robar.nano.Scytodes 0.3 | 16 | 15 | 298 | 0 | 0.34 | 0 | 0 | 0 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| robar.nano.Scytodes 0.3 | 5179 | 37 | 5204 | 5158 (99.6%) | 21 (0.4%) | 46 (0.9%) | 139 | 169 | 40 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| robar.nano.Scytodes 0.3 | 5530 | 416 (7.5%) | 1013 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| robar.nano.Scytodes 0.3 | 650 | 398 | 400 | 174 | 77.0 / 9.5 | 3782 | 7626 | 2021 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| robar.nano.Scytodes 0.3 | 6.0% | 193 | 397 | 3 | 9.3 | 413 / 416 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| robar.nano.Scytodes 0.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| robar.nano.Scytodes 0.3 | robar.nano.Scytodes | 1 | 35 | 308 | 9.8% | 11.2% ± 3.6 | 32.5% | 78.6% / 74.5% | 45.9% | 0 / 0 | T?/M? | 91% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
