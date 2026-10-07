# vort.Chaser 0.0.3 (rammer) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 92.2% | 97.1% | 88.7% | 34 / 35 | 80.6% | 11.9% | 16 | 0 | 0.51 / 9.0 | 93.4% | -1.3 |
| 2 | 96.1% | 100.0% | 93.1% | 35 / 35 | 77.7% | 9.4% | 14 | 0 | 0.52 / 8.6 | 92.2% | +3.9 |
| 3 | 90.5% | 100.0% | 84.1% | 35 / 35 | 78.3% | 24.2% | 10 | 0 | 0.53 / 12.7 | 95.5% | -5.0 |
| 4 | 92.8% | 100.0% | 87.7% | 35 / 35 | 79.4% | 17.7% | 11 | 0 | 0.51 / 9.4 | 96.7% | -3.9 |
| 5 | 91.3% | 97.1% | 87.3% | 34 / 35 | 79.8% | 17.8% | 11 | 0 | 0.49 / 9.6 | 93.6% | -2.2 |
| 6 | 93.3% | 100.0% | 88.4% | 35 / 35 | 76.3% | 20.2% | 12 | 0 | 0.53 / 7.8 | 93.3% | +0.0 |
| 7 | 93.0% | 100.0% | 88.0% | 35 / 35 | 77.6% | 16.2% | 10 | 0 | 0.53 / 11.7 | 95.1% | -2.1 |
| 8 | 93.5% | 100.0% | 88.8% | 35 / 35 | 79.3% | 21.0% | 8 | 0 | 0.49 / 9.8 | 95.2% | -1.7 |
| 9 | 94.3% | 100.0% | 90.1% | 35 / 35 | 77.2% | 12.9% | 11 | 0 | 0.52 / 9.0 | 94.8% | -0.5 |
| 10 | 92.5% | 100.0% | 87.2% | 35 / 35 | 78.7% | 21.0% | 14 | 0 | 0.52 / 8.3 | 91.8% | +0.7 |
| 11 | 96.6% | 100.0% | 94.0% | 35 / 35 | 77.3% | 11.0% | 14 | 0 | 0.52 / 10.8 | 96.5% | +0.2 |
| 12 | 93.8% | 97.1% | 91.5% | 34 / 35 | 79.7% | 35.5% | 13 | 0 | 0.51 / 9.3 | 96.5% | -2.7 |
| 13 | 93.8% | 100.0% | 89.1% | 35 / 35 | 80.1% | 29.2% | 13 | 0 | 0.51 / 9.5 | 95.5% | -1.7 |
| 14 | 94.4% | 100.0% | 90.2% | 35 / 35 | 79.8% | 16.7% | 10 | 0 | 0.52 / 8.8 | 90.3% | +4.1 |
| 15 | 91.5% | 97.1% | 87.5% | 34 / 35 | 77.7% | 19.5% | 14 | 0 | 0.49 / 8.7 | 92.4% | -0.9 |
| 16 | 95.1% | 100.0% | 91.5% | 35 / 35 | 74.4% | 17.0% | 12 | 0 | 0.56 / 10.1 | 95.0% | +0.2 |

Mean score share 93.4% ± 0.9, baseline 94.2% ± 1.0, paired diff -0.8 ± 1.3.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 193 over 16 battles (12.1 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | rammer | 93.4% ± 0.9 | 99.3% ± 0.7 | 89.2% ± 1.3 | 556 / 560 | 78.4% ± 0.9 | 18.8% ± 3.6 | 193 | 0 | 0.56 / 12.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 16 | 11 | 994 | 0 | 0.34 | 0 | 0 | 0 |

11 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 1605 | 44 | 1563 | 1563 (97.4%) | 42 (2.6%) | 0 (0.0%) | 63 | 79 | 45 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| vort.Chaser 0.0.3 | 4218 | 7 (0.2%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 650 | 196 | 469 | 137 | 97.3 / 11.9 | 3496 | 3457 | 405 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 18.8% | 193 | 44 | 3 | 2.6 | 6 / 7 (86%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| vort.Chaser 0.0.3 | vort.Chaser | 1 | 35 | 280 | 29.9% | 3.3% ± 4.3 | 44.7% | 18.2% / 18.1% | 1.6% | 0 / 0 | T?/M? | 94% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
