# simonton.mini.WeeksOnEnd 1.10.4 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 86.0% | 94.3% | 52.0% | 33 / 35 | 15.5% | 2.4% | 10 | 0 | 0.63 / 54.5 | 65.0% | +21.0 |
| 2 | 93.5% | 100.0% | 52.4% | 35 / 35 | 12.0% | 2.0% | 9 | 0 | 0.50 / 65.6 | 59.4% | +34.1 |
| 3 | 88.7% | 97.1% | 57.6% | 34 / 35 | 13.7% | 2.5% | 9 | 0 | 0.62 / 64.0 | 68.1% | +20.5 |
| 4 | 93.1% | 100.0% | 65.0% | 35 / 35 | 14.5% | 2.7% | 9 | 0 | 0.69 / 49.0 | 62.2% | +30.9 |
| 5 | 93.5% | 100.0% | 69.0% | 35 / 35 | 11.2% | 2.7% | 10 | 0 | 0.77 / 63.1 | 63.7% | +29.8 |
| 6 | 86.9% | 94.3% | 50.6% | 33 / 35 | 12.1% | 2.3% | 10 | 0 | 0.55 / 59.4 | 60.2% | +26.6 |
| 7 | 91.8% | 100.0% | 58.4% | 35 / 35 | 11.1% | 2.4% | 10 | 0 | 0.74 / 57.7 | 61.9% | +29.9 |
| 8 | 89.2% | 100.0% | 53.1% | 35 / 35 | 12.2% | 2.7% | 10 | 0 | 0.66 / 53.5 | 64.7% | +24.5 |
| 9 | 89.2% | 97.1% | 55.9% | 34 / 35 | 12.8% | 2.1% | 11 | 0 | 0.59 / 59.2 | 61.7% | +27.5 |
| 10 | 87.9% | 97.1% | 49.9% | 34 / 35 | 9.7% | 2.8% | 12 | 0 | 0.73 / 69.1 | 55.8% | +32.1 |
| 11 | 87.0% | 100.0% | 43.8% | 35 / 35 | 10.9% | 2.9% | 8 | 0 | 0.71 / 65.2 | 61.7% | +25.3 |
| 12 | 88.5% | 97.1% | 47.2% | 34 / 35 | 10.4% | 2.2% | 11 | 0 | 0.62 / 59.4 | 59.7% | +28.8 |
| 13 | 87.4% | 97.1% | 49.0% | 34 / 35 | 10.3% | 2.1% | 11 | 0 | 0.76 / 63.3 | 65.6% | +21.8 |
| 14 | 85.8% | 97.1% | 46.4% | 34 / 35 | 9.5% | 2.9% | 11 | 0 | 0.67 / 56.3 | 57.1% | +28.7 |
| 15 | 78.3% | 88.6% | 39.3% | 31 / 35 | 7.9% | 2.9% | 10 | 0 | 0.74 / 68.3 | 68.1% | +10.2 |
| 16 | 90.4% | 97.1% | 53.2% | 34 / 35 | 10.8% | 2.1% | 12 | 0 | 0.64 / 55.9 | 60.8% | +29.6 |

Mean score share 88.6% ± 2.0, baseline 62.2% ± 1.9, paired diff +26.3 ± 3.1.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 163 over 16 battles (10.2 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| simonton.mini.WeeksOnEnd 1.10.4 | shield-confirm | 88.6% ± 2.0 | 97.3% ± 1.6 | 52.7% ± 4.0 | 545 / 560 | 11.5% ± 1.0 | 2.5% ± 0.2 | 163 | 0 | 0.77 / 69.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| simonton.mini.WeeksOnEnd 1.10.4 | 16 | 305 | 15.4% | 78.6% | 0.0% | 6.0% | 1411 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| simonton.mini.WeeksOnEnd 1.10.4 | 16 | 15 | 1 | 0 | 0.29 | 0 | 0 | 0 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| simonton.mini.WeeksOnEnd 1.10.4 | 53066 | 922 | 53066 | 53062 (100.0%) | 4 (0.0%) | 4 (0.0%) | 349 | 75 | 69 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| simonton.mini.WeeksOnEnd 1.10.4 | 6786 | 48933 (721.1%) | 3395 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| simonton.mini.WeeksOnEnd 1.10.4 | 650 | 472 | 650 | 1261 | 7.7 / 6.9 | 7 | 1338 | 3797 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| simonton.mini.WeeksOnEnd 1.10.4 | 2.5% | 163 | 65 | 3 | 7.2 | 418 / 48933 (1%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| simonton.mini.WeeksOnEnd 1.10.4 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| simonton.mini.WeeksOnEnd 1.10.4 | simonton.mini.WeeksOnEnd | 1 | 35 | 334 | 2.4% | 13.7% ± 5.1 | 9.4% | 25.9% / 26.1% | 5.2% | 0 / 0 | T?/M? | 90% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
