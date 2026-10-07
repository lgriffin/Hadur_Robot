# dft.Immortal 1.40 (mid) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 73.0% | 91.4% | 55.1% | 32 / 35 | 11.9% | 7.4% | 11 | 0 | 0.95 / 17.0 | 68.2% | +4.7 |
| 2 | 72.6% | 91.4% | 52.1% | 32 / 35 | 11.1% | 6.3% | 4 | 0 | 0.94 / 16.1 | 72.9% | -0.3 |
| 3 | 73.4% | 91.2% | 54.1% | 32 / 35 | 10.8% | 6.4% | 14 | 0 | 0.93 / 20.9 | 67.0% | +6.3 |
| 4 | 75.7% | 94.3% | 56.1% | 33 / 35 | 11.8% | 6.3% | 10 | 0 | 0.96 / 17.7 | 78.0% | -2.3 |
| 5 | 77.9% | 94.3% | 58.7% | 33 / 35 | 11.2% | 5.1% | 9 | 0 | 0.96 / 16.3 | 77.4% | +0.5 |
| 6 | 67.8% | 82.9% | 51.3% | 29 / 35 | 11.0% | 6.2% | 11 | 0 | 0.92 / 16.8 | 72.0% | -4.2 |
| 7 | 66.1% | 82.9% | 47.1% | 29 / 35 | 10.6% | 6.3% | 13 | 0 | 0.93 / 17.0 | 72.8% | -6.7 |
| 8 | 73.2% | 94.3% | 51.5% | 33 / 35 | 11.1% | 6.9% | 11 | 0 | 0.97 / 15.9 | 77.1% | -3.9 |
| 9 | 78.2% | 94.3% | 60.7% | 33 / 35 | 12.1% | 6.0% | 10 | 0 | 0.91 / 16.4 | 66.9% | +11.3 |
| 10 | 70.5% | 85.7% | 52.8% | 30 / 35 | 10.5% | 5.6% | 4 | 0 | 0.90 / 18.4 | 68.0% | +2.5 |
| 11 | 73.5% | 85.7% | 59.2% | 30 / 35 | 11.9% | 5.3% | 9 | 0 | 0.93 / 17.3 | 79.5% | -6.0 |
| 12 | 70.3% | 85.7% | 55.0% | 30 / 35 | 11.7% | 7.1% | 7 | 0 | 0.97 / 16.2 | 66.7% | +3.6 |
| 13 | 75.1% | 91.4% | 56.0% | 32 / 35 | 10.7% | 5.7% | 11 | 0 | 0.92 / 17.1 | 76.3% | -1.3 |
| 14 | 66.7% | 80.0% | 53.8% | 28 / 35 | 11.5% | 7.0% | 12 | 0 | 0.98 / 15.9 | 79.7% | -13.1 |
| 15 | 74.4% | 88.6% | 59.6% | 31 / 35 | 11.5% | 6.0% | 12 | 0 | 0.91 / 17.2 | 73.3% | +1.2 |
| 16 | 73.9% | 88.6% | 58.7% | 31 / 35 | 11.6% | 6.4% | 11 | 0 | 0.95 / 18.2 | 62.2% | +11.7 |
| 17 | 78.8% | 97.1% | 58.6% | 34 / 35 | 11.1% | 5.9% | 8 | 0 | 0.93 / 18.3 | 73.4% | +5.4 |
| 18 | 67.9% | 82.9% | 51.0% | 29 / 35 | 10.7% | 6.3% | 11 | 0 | 0.92 / 16.4 | 65.9% | +1.9 |
| 19 | 71.6% | 88.6% | 54.4% | 31 / 35 | 11.4% | 6.7% | 11 | 0 | 1.00 / 16.0 | 75.1% | -3.5 |
| 20 | 65.7% | 80.0% | 49.5% | 28 / 35 | 10.8% | 6.4% | 9 | 0 | 0.97 / 16.0 | 71.4% | -5.6 |

Mean score share 72.3% ± 1.9, baseline 72.2% ± 2.4, paired diff +0.1 ± 2.9.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 198 over 20 battles (9.9 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dft.Immortal 1.40 | mid | 72.3% ± 1.9 | 88.6% ± 2.4 | 54.8% ± 1.7 | 620 / 700 | 11.3% ± 0.2 | 6.3% ± 0.3 | 198 | 0 | 1.00 / 20.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dft.Immortal 1.40 | 20 | 16 | 0 | 0 | 0.28 | 4 | 3 | 0 |

16 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dft.Immortal 1.40 | 29624 | 14 | 29694 | 29624 (100.0%) | 0 (0.0%) | 70 (0.2%) | 1621 | 299 | 85 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dft.Immortal 1.40 | 37250 | 3351 (9.0%) | 33511 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dft.Immortal 1.40 | 650 | 505 | 643 | 712 | 33.1 / 27.3 | 537 | 12942 | 215 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dft.Immortal 1.40 | 6.3% | 198 | 136 | 2 | 42.1 | 3350 / 3351 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dft.Immortal 1.40 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| dft.Immortal 1.40 | dft.Immortal | 1 | 35 | 282 | 7.0% | 7.1% ± 1.4 | 10.6% | 22.5% / 22.8% | 5.0% | 0 / 0 | T3/M1 | 65% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
