# tw.Exterminator 1.0 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 95.3% | 97.1% | 81.1% | 34 / 35 | 3.4% | 1.3% | 11 | 0 | 0.50 / 25.8 | 75.2% | +20.1 |
| 2 | 96.9% | 100.0% | 52.3% | 35 / 35 | 1.3% | 0.6% | 9 | 0 | 0.45 / 34.4 | 80.4% | +16.5 |
| 3 | 86.9% | 91.4% | 70.2% | 32 / 35 | 4.9% | 2.4% | 8 | 0 | 0.77 / 28.2 | 72.4% | +14.5 |
| 4 | 95.3% | 97.1% | 81.7% | 34 / 35 | 2.4% | 1.0% | 11 | 0 | 0.44 / 28.9 | 78.1% | +17.1 |
| 5 | 90.5% | 94.3% | 77.9% | 33 / 35 | 3.9% | 2.3% | 12 | 0 | 0.71 / 28.4 | 84.6% | +5.9 |
| 6 | 97.5% | 100.0% | 83.1% | 35 / 35 | 4.3% | 1.4% | 10 | 0 | 0.44 / 25.3 | 82.1% | +15.4 |
| 7 | 88.9% | 94.3% | 71.4% | 33 / 35 | 6.6% | 2.3% | 11 | 0 | 0.50 / 26.4 | 77.8% | +11.1 |
| 8 | 91.1% | 94.3% | 81.7% | 33 / 35 | 6.7% | 2.3% | 9 | 0 | 0.69 / 25.8 | 80.8% | +10.3 |
| 9 | 78.7% | 82.9% | 67.5% | 29 / 35 | 5.1% | 2.4% | 7 | 0 | 0.66 / 27.4 | 74.5% | +4.3 |
| 10 | 93.8% | 97.1% | 80.8% | 34 / 35 | 5.3% | 1.9% | 11 | 0 | 0.55 / 25.9 | 75.9% | +17.9 |
| 11 | 97.2% | 100.0% | 66.8% | 35 / 35 | 3.4% | 1.3% | 8 | 0 | 0.43 / 26.3 | 83.5% | +13.6 |
| 12 | 82.0% | 85.7% | 75.1% | 30 / 35 | 11.0% | 3.2% | 14 | 0 | 0.94 / 31.7 | 73.8% | +8.2 |
| 13 | 88.5% | 91.4% | 78.0% | 32 / 35 | 4.1% | 2.4% | 7 | 0 | 0.75 / 26.1 | 76.3% | +12.2 |
| 14 | 77.2% | 82.9% | 63.5% | 29 / 35 | 8.5% | 2.4% | 13 | 0 | 0.85 / 27.6 | 85.1% | -8.0 |
| 15 | 84.9% | 88.6% | 69.0% | 31 / 35 | 5.7% | 1.9% | 14 | 0 | 0.74 / 25.9 | 79.3% | +5.6 |
| 16 | 87.8% | 91.4% | 72.8% | 32 / 35 | 6.0% | 2.1% | 19 | 0 | 0.76 / 31.0 | 88.6% | -0.8 |

Mean score share 89.5% ± 3.4, baseline 79.3% ± 2.5, paired diff +10.3 ± 4.0.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 174 over 16 battles (10.9 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| tw.Exterminator 1.0 | shield-confirm | 89.5% ± 3.4 | 93.0% ± 3.0 | 73.3% ± 4.4 | 521 / 560 | 5.2% ± 1.3 | 2.0% ± 0.4 | 174 | 0 | 0.94 / 34.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| tw.Exterminator 1.0 | 16 | 294 | 41.5% | 46.0% | 0.2% | 12.3% | 3961 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| tw.Exterminator 1.0 | 16 | 13 | 298 | 0 | 0.31 | 2 | 2 | 0 |

13 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| tw.Exterminator 1.0 | 188356 | 22 | 189274 | 188327 (100.0%) | 29 (0.0%) | 947 (0.5%) | 979 | 160 | 91 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| tw.Exterminator 1.0 | 13503 | 176280 (1305.5%) | 8123 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| tw.Exterminator 1.0 | 650 | 510 | 639 | 3816 | 10.9 / 3.9 | 567 | 1058 | 716 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| tw.Exterminator 1.0 | 2.0% | 174 | 3434 | 3 | 22.2 | 1017 / 176280 (1%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| tw.Exterminator 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| tw.Exterminator 1.0 | tw.Exterminator | 1 | 35 | 292 | 1.0% | 6.6% ± 1.5 | 10.9% | 24.8% / 27.9% | 3.6% | 0 / 0 | T2/M2 | 88% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
