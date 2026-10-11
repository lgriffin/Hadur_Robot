# suh.nano.RandomPM 1.02 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.9% | 94.3% | 19.8% | 33 / 35 | 7.2% | 1.9% | 14 | 0 | 0.37 / 13.4 | 73.7% | +8.2 |
| 2 | 86.9% | 100.0% | 34.3% | 35 / 35 | 9.5% | 2.9% | 12 | 0 | 0.44 / 15.2 | 80.7% | +6.2 |
| 3 | 89.0% | 100.0% | 47.4% | 35 / 35 | 9.7% | 2.4% | 10 | 0 | 0.43 / 17.3 | 80.0% | +9.1 |
| 4 | 81.1% | 97.1% | 38.1% | 34 / 35 | 9.2% | 3.6% | 6 | 0 | 0.74 / 14.8 | 75.6% | +5.5 |
| 5 | 75.3% | 88.6% | 44.2% | 31 / 35 | 14.4% | 3.4% | 11 | 0 | 0.74 / 14.8 | 74.3% | +1.0 |
| 6 | 79.9% | 91.4% | 36.5% | 32 / 35 | 12.7% | 2.1% | 11 | 0 | 0.42 / 71.2 | 76.9% | +3.0 |
| 7 | 84.4% | 97.1% | 27.1% | 34 / 35 | 9.9% | 2.4% | 10 | 0 | 0.42 / 13.8 | 74.5% | +9.9 |
| 8 | 85.8% | 94.3% | 23.5% | 33 / 35 | 4.6% | 1.2% | 9 | 0 | 0.37 / 13.1 | 83.1% | +2.7 |
| 9 | 89.7% | 100.0% | 32.1% | 35 / 35 | 9.0% | 1.6% | 9 | 0 | 0.40 / 34.4 | 77.6% | +12.1 |
| 10 | 84.4% | 94.3% | 41.1% | 33 / 35 | 8.4% | 1.8% | 10 | 0 | 0.42 / 14.6 | 70.9% | +13.5 |
| 11 | 84.5% | 97.1% | 47.0% | 34 / 35 | 15.6% | 3.0% | 10 | 0 | 0.61 / 17.8 | 80.1% | +4.4 |
| 12 | 87.6% | 100.0% | 43.7% | 35 / 35 | 11.3% | 2.7% | 10 | 0 | 0.41 / 14.4 | 75.1% | +12.5 |
| 13 | 77.5% | 91.4% | 37.4% | 32 / 35 | 11.5% | 3.0% | 13 | 0 | 0.66 / 13.1 | 76.0% | +1.5 |
| 14 | 82.4% | 94.3% | 41.6% | 33 / 35 | 12.9% | 2.7% | 14 | 0 | 0.52 / 27.8 | 78.6% | +3.8 |
| 15 | 80.4% | 97.1% | 41.9% | 34 / 35 | 12.5% | 3.9% | 12 | 0 | 0.80 / 15.6 | 78.0% | +2.5 |
| 16 | 87.7% | 97.1% | 17.0% | 34 / 35 | 4.8% | 1.3% | 10 | 0 | 0.38 / 20.6 | 83.0% | +4.7 |

Mean score share 83.7% ± 2.2, baseline 77.4% ± 1.8, paired diff +6.3 ± 2.2.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 171 over 16 battles (10.7 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| suh.nano.RandomPM 1.02 | shield-confirm | 83.7% ± 2.2 | 95.9% ± 1.8 | 35.8% ± 5.1 | 537 / 560 | 10.2% ± 1.7 | 2.5% ± 0.4 | 171 | 0 | 0.80 / 71.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| suh.nano.RandomPM 1.02 | 16 | 449 | 16.0% | 77.6% | 0.0% | 6.4% | 826 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| suh.nano.RandomPM 1.02 | 16 | 15 | 0 | 0 | 0.31 | 1 | 1 | 0 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| suh.nano.RandomPM 1.02 | 24683 | 17 | 24738 | 24658 (99.9%) | 25 (0.1%) | 80 (0.3%) | 2436 | 192 | 83 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| suh.nano.RandomPM 1.02 | 3649 | 22392 (613.6%) | 145 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| suh.nano.RandomPM 1.02 | 650 | 379 | 650 | 676 | 6.1 / 10.0 | 84 | 1300 | 1109 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| suh.nano.RandomPM 1.02 | 2.5% | 171 | 72 | 3 | 3.1 | 101 / 22392 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| suh.nano.RandomPM 1.02 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| suh.nano.RandomPM 1.02 | suh.nano.RandomPM | 1 | 35 | 302 | 1.7% | 44.5% ± 16.7 | 8.6% | 17.5% / 20.6% | 16.9% | 0 / 0 | T?/M? | 88% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
