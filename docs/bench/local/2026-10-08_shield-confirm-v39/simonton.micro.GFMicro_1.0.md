# simonton.micro.GFMicro 1.0 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 95.7% | 100.0% | 67.3% | 35 / 35 | 9.0% | 2.4% | 12 | 0 | 0.51 / 14.4 | 83.9% | +11.8 |
| 2 | 92.5% | 100.0% | 71.7% | 35 / 35 | 32.7% | 2.8% | 14 | 0 | 0.50 / 18.5 | 84.9% | +7.6 |
| 3 | 95.1% | 100.0% | 83.3% | 35 / 35 | 28.2% | 2.6% | 10 | 0 | 0.51 / 17.9 | 87.0% | +8.1 |
| 4 | 93.1% | 100.0% | 76.6% | 35 / 35 | 34.7% | 3.7% | 9 | 0 | 0.49 / 19.2 | 77.5% | +15.6 |
| 5 | 94.4% | 100.0% | 80.3% | 35 / 35 | 30.4% | 2.7% | 12 | 0 | 0.48 / 18.0 | 82.6% | +11.8 |
| 6 | 91.7% | 100.0% | 73.0% | 35 / 35 | 25.6% | 3.2% | 10 | 0 | 0.45 / 19.9 | 82.7% | +9.0 |
| 7 | 91.9% | 100.0% | 71.9% | 35 / 35 | 34.5% | 3.5% | 12 | 0 | 0.50 / 21.4 | 86.2% | +5.8 |
| 8 | 95.1% | 100.0% | 81.2% | 35 / 35 | 29.7% | 2.4% | 11 | 0 | 0.45 / 16.5 | 78.1% | +17.0 |
| 9 | 90.9% | 97.1% | 75.7% | 34 / 35 | 39.1% | 3.8% | 10 | 0 | 0.49 / 18.1 | 84.9% | +6.0 |
| 10 | 93.3% | 100.0% | 74.2% | 35 / 35 | 31.4% | 3.0% | 9 | 0 | 0.48 / 21.0 | 85.3% | +7.9 |
| 11 | 96.0% | 100.0% | 83.5% | 35 / 35 | 34.7% | 2.6% | 10 | 0 | 0.49 / 17.3 | 82.6% | +13.4 |
| 12 | 93.5% | 100.0% | 77.8% | 35 / 35 | 34.3% | 3.1% | 11 | 0 | 0.47 / 18.5 | 83.4% | +10.1 |
| 13 | 96.3% | 100.0% | 77.9% | 35 / 35 | 13.2% | 2.2% | 9 | 0 | 0.46 / 17.4 | 78.2% | +18.1 |
| 14 | 92.2% | 97.1% | 66.5% | 34 / 35 | 9.4% | 2.7% | 12 | 0 | 0.48 / 19.2 | 83.1% | +9.1 |
| 15 | 93.1% | 100.0% | 75.3% | 35 / 35 | 36.7% | 2.8% | 11 | 0 | 0.48 / 17.5 | 84.5% | +8.6 |
| 16 | 96.2% | 100.0% | 71.5% | 35 / 35 | 10.8% | 1.8% | 12 | 0 | 0.49 / 19.4 | 76.4% | +19.8 |

Mean score share 93.8% ± 0.9, baseline 82.6% ± 1.7, paired diff +11.2 ± 2.3.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 174 over 16 battles (10.9 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| simonton.micro.GFMicro 1.0 | shield-confirm | 93.8% ± 0.9 | 99.6% ± 0.5 | 75.5% ± 2.7 | 558 / 560 | 27.2% ± 5.6 | 2.8% ± 0.3 | 174 | 0 | 0.51 / 21.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| simonton.micro.GFMicro 1.0 | 16 | 185 | 3.4% | 95.4% | 0.0% | 1.2% | 1298 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| simonton.micro.GFMicro 1.0 | 16 | 14 | 363 | 0 | 0.31 | 0 | 0 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| simonton.micro.GFMicro 1.0 | 48440 | 931 | 48416 | 48416 (100.0%) | 24 (0.0%) | 0 (0.0%) | 86 | 84 | 89 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| simonton.micro.GFMicro 1.0 | 3462 | 46750 (1350.4%) | 120 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| simonton.micro.GFMicro 1.0 | 650 | 422 | 569 | 1148 | 16.2 / 5.1 | 141 | 1103 | 1720 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| simonton.micro.GFMicro 1.0 | 2.8% | 174 | 361 | 3 | 1.6 | 62 / 46750 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| simonton.micro.GFMicro 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| simonton.micro.GFMicro 1.0 | simonton.micro.GFMicro | 1 | 35 | 320 | 2.0% | 12.2% ± 9.2 | 11.5% | 34.2% / 30.2% | 8.0% | 0 / 0 | T?/M? | 96% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
