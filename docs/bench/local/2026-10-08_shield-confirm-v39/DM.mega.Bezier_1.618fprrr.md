# DM.mega.Bezier 1.618fprrr (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 96.1% | 100.0% | 70.8% | 35 / 35 | 4.8% | 0.6% | 12 | 0 | 0.83 / 23.1 | 74.5% | +21.6 |
| 2 | 92.7% | 97.1% | 46.9% | 34 / 35 | 2.7% | 0.7% | 11 | 0 | 0.78 / 22.6 | 73.7% | +19.0 |
| 3 | 92.9% | 100.0% | 59.0% | 35 / 35 | 2.9% | 1.5% | 12 | 0 | 1.09 / 17.9 | 68.7% | +24.2 |
| 4 | 95.5% | 100.0% | 84.0% | 35 / 35 | 12.3% | 1.1% | 8 | 0 | 1.12 / 58.3 | 68.9% | +26.6 |
| 5 | 94.7% | 100.0% | 76.4% | 35 / 35 | 13.2% | 0.7% | 12 | 0 | 0.90 / 79.5 | 58.1% | +36.6 |
| 6 | 93.0% | 97.1% | 60.5% | 34 / 35 | 1.7% | 0.9% | 10 | 0 | 0.80 / 19.2 | 73.8% | +19.2 |
| 7 | 99.5% | 100.0% | 99.0% | 35 / 35 | 59.7% | 0.1% | 12 | 0 | 3.38 / 67.9 | 86.4% | +13.1 |
| 8 | 97.6% | 100.0% | 63.8% | 35 / 35 | 2.6% | 0.3% | 8 | 0 | 0.69 / 19.0 | 93.6% | +4.0 |
| 9 | 94.2% | 100.0% | 48.1% | 35 / 35 | 2.4% | 0.7% | 11 | 0 | 0.85 / 23.0 | 82.9% | +11.3 |
| 10 | 94.5% | 100.0% | 42.6% | 35 / 35 | 2.6% | 0.6% | 13 | 0 | 0.74 / 21.6 | 67.3% | +27.2 |
| 11 | 96.3% | 100.0% | 28.4% | 35 / 35 | 1.7% | 0.4% | 9 | 0 | 0.73 / 20.6 | 93.6% | +2.7 |
| 12 | 93.2% | 97.1% | 32.3% | 34 / 35 | 2.4% | 0.4% | 7 | 0 | 0.65 / 19.9 | 74.4% | +18.8 |
| 13 | 91.1% | 97.1% | 63.3% | 34 / 35 | 3.4% | 1.0% | 9 | 0 | 0.95 / 19.5 | 87.2% | +4.0 |
| 14 | 96.6% | 100.0% | 55.7% | 35 / 35 | 3.8% | 0.6% | 11 | 0 | 0.74 / 16.8 | 74.1% | +22.5 |
| 15 | 100.0% | 100.0% | 100.0% | 35 / 35 | 63.6% | 0.0% | 9 | 0 | 3.52 / 89.1 | 91.4% | +8.6 |
| 16 | 98.3% | 100.0% | 96.4% | 35 / 35 | 45.6% | 0.4% | 13 | 0 | 3.03 / 68.5 | 73.3% | +25.0 |

Mean score share 95.4% ± 1.4, baseline 77.6% ± 5.5, paired diff +17.8 ± 5.2.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 167 over 16 battles (10.4 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| DM.mega.Bezier 1.618fprrr | shield-confirm | 95.4% ± 1.4 | 99.3% ± 0.7 | 64.2% ± 12.0 | 556 / 560 | 14.1% ± 11.5 | 0.6% ± 0.2 | 167 | 0 | 3.52 / 89.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| DM.mega.Bezier 1.618fprrr | 16 | 117 | 10.6% | 85.6% | 0.0% | 3.7% | 1461 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| DM.mega.Bezier 1.618fprrr | 16 | 16 | 0 | 0 | 0.30 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| DM.mega.Bezier 1.618fprrr | 54340 | 4 | 54355 | 54340 (100.0%) | 0 (0.0%) | 15 (0.0%) | 255 | 39 | 66 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| DM.mega.Bezier 1.618fprrr | 6803 | 51759 (760.8%) | 1642 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| DM.mega.Bezier 1.618fprrr | 650 | 480 | 650 | 1311 | 18.5 / 2.9 | 228 | 2518 | 60 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| DM.mega.Bezier 1.618fprrr | 0.6% | 167 | 300 | 3 | 4.7 | 254 / 51759 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| DM.mega.Bezier 1.618fprrr | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| DM.mega.Bezier 1.618fprrr | DM.mega.Bezier | 1 | 35 | 302 | 0.7% | 5.6% ± 4.1 | 25.0% | 53.1% / 52.5% | 16.7% | 0 / 0 | T?/M? | 98% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
