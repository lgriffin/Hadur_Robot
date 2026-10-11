# nat.nano.Ocnirp 1.73 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 83.3% | 97.1% | 39.8% | 34 / 35 | 11.3% | 2.9% | 13 | 0 | 0.48 / 14.0 | 76.2% | +7.1 |
| 2 | 81.5% | 94.3% | 37.2% | 33 / 35 | 9.7% | 2.5% | 13 | 0 | 0.50 / 14.1 | 74.8% | +6.7 |
| 3 | 78.5% | 94.3% | 47.2% | 33 / 35 | 13.1% | 4.2% | 12 | 0 | 0.71 / 12.9 | 80.9% | -2.4 |
| 4 | 85.5% | 97.1% | 48.4% | 34 / 35 | 16.1% | 2.4% | 11 | 0 | 0.55 / 16.0 | 81.2% | +4.3 |
| 5 | 82.3% | 94.3% | 31.2% | 33 / 35 | 14.1% | 1.9% | 15 | 0 | 0.44 / 13.9 | 75.7% | +6.6 |
| 6 | 90.8% | 97.1% | 51.7% | 34 / 35 | 19.9% | 1.2% | 12 | 0 | 0.41 / 12.7 | 77.0% | +13.8 |
| 7 | 81.4% | 94.3% | 42.9% | 33 / 35 | 14.6% | 2.8% | 14 | 0 | 0.56 / 137.4 | 76.1% | +5.4 |
| 8 | 80.3% | 94.3% | 44.9% | 33 / 35 | 12.9% | 3.2% | 14 | 0 | 0.61 / 168.0 | 74.0% | +6.3 |
| 9 | 81.8% | 94.3% | 44.9% | 33 / 35 | 16.0% | 3.0% | 12 | 0 | 0.45 / 16.0 | 78.7% | +3.1 |
| 10 | 71.4% | 88.6% | 47.0% | 31 / 35 | 17.7% | 5.6% | 11 | 0 | 0.78 / 13.2 | 72.1% | -0.7 |
| 11 | 77.9% | 91.4% | 50.6% | 32 / 35 | 17.2% | 3.9% | 8 | 0 | 0.67 / 14.8 | 77.2% | +0.7 |
| 12 | 85.8% | 97.1% | 44.7% | 34 / 35 | 12.0% | 2.6% | 13 | 0 | 0.44 / 13.5 | 83.2% | +2.7 |
| 13 | 72.9% | 85.7% | 42.3% | 30 / 35 | 15.3% | 3.3% | 12 | 0 | 0.53 / 12.8 | 80.8% | -8.0 |
| 14 | 86.2% | 97.1% | 50.0% | 34 / 35 | 14.8% | 2.5% | 11 | 0 | 0.44 / 10.7 | 80.6% | +5.6 |
| 15 | 89.4% | 100.0% | 50.3% | 35 / 35 | 15.0% | 2.6% | 12 | 0 | 0.52 / 152.6 | 73.5% | +15.8 |
| 16 | 87.4% | 100.0% | 39.4% | 35 / 35 | 15.9% | 2.7% | 12 | 0 | 0.45 / 14.4 | 74.2% | +13.2 |

Mean score share 82.3% ± 2.9, baseline 77.3% ± 1.7, paired diff +5.0 ± 3.2.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 195 over 16 battles (12.2 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| nat.nano.Ocnirp 1.73 | shield-confirm | 82.3% ± 2.9 | 94.8% ± 2.0 | 44.5% ± 3.0 | 531 / 560 | 14.7% ± 1.4 | 3.0% ± 0.5 | 195 | 0 | 0.78 / 168.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| nat.nano.Ocnirp 1.73 | 16 | 530 | 17.1% | 76.0% | 0.0% | 6.9% | 736 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| nat.nano.Ocnirp 1.73 | 16 | 16 | 0 | 0 | 0.35 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| nat.nano.Ocnirp 1.73 | 19789 | 28 | 19813 | 19730 (99.7%) | 59 (0.3%) | 83 (0.4%) | 2448 | 207 | 67 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| nat.nano.Ocnirp 1.73 | 4523 | 16983 (375.5%) | 1176 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| nat.nano.Ocnirp 1.73 | 650 | 386 | 645 | 586 | 9.4 / 11.5 | 170 | 1412 | 1792 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| nat.nano.Ocnirp 1.73 | 3.0% | 195 | 137 | 3 | 4.3 | 194 / 16983 (1%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| nat.nano.Ocnirp 1.73 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| nat.nano.Ocnirp 1.73 | nat.nano.Ocnirp | 1 | 35 | 294 | 2.8% | 26.2% ± 9.5 | 12.8% | 27.3% / 20.4% | 11.9% | 0 / 0 | T?/M? | 86% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
