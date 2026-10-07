# ne.Chimera 1.2 (lower) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 98.9% | 100.0% | 68.4% | 35 / 35 | 1.0% | 0.8% | 7 | 0 | 0.39 / 13.1 | 99.5% | -0.6 |
| 2 | 93.5% | 97.1% | 34.9% | 34 / 35 | 0.6% | 0.4% | 1 | 0 | 0.65 / 16.1 | 100.0% | -6.5 |
| 3 | 98.9% | 100.0% | 68.5% | 35 / 35 | 0.4% | 0.2% | 6 | 0 | 0.68 / 15.6 | 98.9% | -0.0 |
| 4 | 93.3% | 97.1% | 38.5% | 34 / 35 | 0.6% | 1.0% | 5 | 0 | 0.47 / 13.9 | 98.1% | -4.8 |
| 5 | 98.2% | 100.0% | 76.9% | 35 / 35 | 1.8% | 0.4% | 5 | 0 | 0.66 / 14.3 | 98.3% | -0.1 |
| 6 | 98.7% | 100.0% | 65.4% | 35 / 35 | 0.5% | 0.2% | 8 | 0 | 0.58 / 16.0 | 96.5% | +2.2 |
| 7 | 98.4% | 100.0% | 67.0% | 35 / 35 | 0.8% | 0.4% | 7 | 0 | 0.58 / 14.1 | 98.0% | +0.4 |
| 8 | 99.4% | 100.0% | 75.0% | 35 / 35 | 0.3% | 0.1% | 4 | 0 | 0.69 / 13.8 | 98.0% | +1.4 |
| 9 | 99.2% | 100.0% | 70.0% | 35 / 35 | 0.4% | 0.2% | 5 | 0 | 0.79 / 11.9 | 96.7% | +2.5 |
| 10 | 98.5% | 100.0% | 56.8% | 35 / 35 | 0.4% | 0.2% | 9 | 0 | 0.61 / 17.6 | 99.0% | -0.4 |
| 11 | 97.4% | 100.0% | 69.8% | 35 / 35 | 2.0% | 0.7% | 4 | 0 | 0.66 / 15.1 | 97.5% | -0.2 |
| 12 | 100.0% | 100.0% | 100.0% | 35 / 35 | 1.1% | 0.0% | 5 | 0 | 0.40 / 13.4 | 99.3% | +0.7 |
| 13 | 100.0% | 100.0% | 100.0% | 35 / 35 | 0.7% | 0.0% | 7 | 0 | 0.49 / 11.6 | 97.9% | +2.1 |
| 14 | 98.8% | 100.0% | 66.7% | 35 / 35 | 0.5% | 0.2% | 5 | 0 | 0.64 / 13.9 | 98.8% | +0.0 |
| 15 | 92.5% | 97.1% | 16.2% | 34 / 35 | 0.7% | 1.4% | 3 | 0 | 0.46 / 16.5 | 98.2% | -5.7 |
| 16 | 98.2% | 100.0% | 65.5% | 35 / 35 | 1.0% | 0.5% | 4 | 0 | 0.51 / 12.6 | 99.3% | -1.1 |

Mean score share 97.7% ± 1.3, baseline 98.4% ± 0.5, paired diff -0.6 ± 1.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 85 over 16 battles (5.3 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ne.Chimera 1.2 | lower | 97.7% ± 1.3 | 99.5% ± 0.6 | 65.0% ± 11.4 | 557 / 560 | 0.8% ± 0.3 | 0.4% ± 0.2 | 85 | 0 | 0.79 / 17.6 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ne.Chimera 1.2 | 16 | 13 | 894 | 0 | 0.15 | 0 | 0 | 16 |

13 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ne.Chimera 1.2 | 453 | 0 | 398 | 398 (87.9%) | 55 (12.1%) | 0 (0.0%) | 11 | 7 | 34 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ne.Chimera 1.2 | 511 | 27 (5.3%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ne.Chimera 1.2 | 650 | 385 | 630 | 14 | 1.7 / 1.0 | 5 | 301 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ne.Chimera 1.2 | 0.4% | 85 | 25 | 3 | 0.7 | 26 / 27 (96%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ne.Chimera 1.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ne.Chimera 1.2 | ne.Chimera | 1 | 35 | 272 | 16.7% | 20.9% ± 19.4 | 40.0% | 35.6% / 38.9% | 0.0% | 0 / 0 | T?/M? | 98% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
