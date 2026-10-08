# vuen.Fractal 0.55 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 94.8% | 97.1% | 89.1% | 34 / 35 | 18.2% | 0.5% | 6 | 0 | 0.49 / 26.9 | 81.1% | +13.8 |
| 2 | 95.2% | 97.1% | 91.1% | 34 / 35 | 19.7% | 0.6% | 14 | 0 | 0.52 / 14.9 | 88.8% | +6.4 |
| 3 | 91.1% | 97.1% | 78.8% | 34 / 35 | 17.5% | 1.6% | 10 | 0 | 0.52 / 65.9 | 79.1% | +11.9 |
| 4 | 97.9% | 100.0% | 92.2% | 35 / 35 | 20.1% | 0.5% | 11 | 0 | 0.44 / 10.7 | 79.8% | +18.1 |
| 5 | 96.9% | 100.0% | 88.5% | 35 / 35 | 16.1% | 0.8% | 12 | 0 | 0.56 / 13.6 | 84.8% | +12.0 |
| 6 | 92.4% | 97.1% | 81.3% | 34 / 35 | 15.5% | 0.9% | 11 | 0 | 0.53 / 12.7 | 80.2% | +12.2 |
| 7 | 96.9% | 100.0% | 88.4% | 35 / 35 | 18.5% | 0.6% | 11 | 0 | 0.53 / 75.9 | 84.3% | +12.5 |
| 8 | 97.3% | 100.0% | 89.5% | 35 / 35 | 16.7% | 0.5% | 9 | 0 | 0.52 / 14.9 | 88.4% | +8.9 |
| 9 | 96.8% | 100.0% | 87.3% | 35 / 35 | 15.6% | 0.7% | 9 | 0 | 0.45 / 80.6 | 85.0% | +11.8 |
| 10 | 96.8% | 100.0% | 86.9% | 35 / 35 | 14.4% | 0.7% | 11 | 0 | 0.48 / 10.2 | 74.2% | +22.5 |
| 11 | 97.4% | 100.0% | 90.3% | 35 / 35 | 17.7% | 0.5% | 12 | 0 | 0.50 / 11.8 | 85.7% | +11.7 |
| 12 | 92.4% | 97.1% | 81.0% | 34 / 35 | 20.4% | 1.2% | 10 | 0 | 0.52 / 260.2 | 85.5% | +6.8 |
| 13 | 98.9% | 100.0% | 94.6% | 35 / 35 | 15.8% | 0.2% | 12 | 0 | 0.49 / 10.9 | 84.1% | +14.7 |
| 14 | 98.3% | 100.0% | 92.2% | 35 / 35 | 12.2% | 0.5% | 16 | 0 | 0.50 / 10.5 | 87.8% | +10.5 |
| 15 | 96.5% | 100.0% | 87.5% | 35 / 35 | 19.7% | 0.7% | 11 | 0 | 0.49 / 14.0 | 81.5% | +15.0 |
| 16 | 96.5% | 100.0% | 87.9% | 35 / 35 | 19.2% | 0.9% | 13 | 0 | 0.47 / 9.4 | 87.4% | +9.1 |

Mean score share 96.0% ± 1.2, baseline 83.6% ± 2.1, paired diff +12.4 ± 2.1.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 178 over 16 battles (11.1 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| vuen.Fractal 0.55 | shield-confirm | 96.0% ± 1.2 | 99.1% ± 0.7 | 87.9% ± 2.3 | 555 / 560 | 17.3% ± 1.2 | 0.7% ± 0.2 | 178 | 0 | 0.56 / 260.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| vuen.Fractal 0.55 | 16 | 125 | 12.5% | 82.3% | 0.0% | 5.2% | 728 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| vuen.Fractal 0.55 | 16 | 15 | 0 | 0 | 0.32 | 1 | 1 | 0 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| vuen.Fractal 0.55 | 14990 | 3 | 15045 | 14971 (99.9%) | 19 (0.1%) | 74 (0.5%) | 399 | 88 | 109 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| vuen.Fractal 0.55 | 7281 | 14144 (194.3%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| vuen.Fractal 0.55 | 650 | 445 | 620 | 578 | 20.7 / 2.9 | 212 | 724 | 186 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| vuen.Fractal 0.55 | 0.7% | 178 | 49 | 3 | 1.3 | 28 / 14144 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| vuen.Fractal 0.55 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| vuen.Fractal 0.55 | vuen.Fractal | 1 | 35 | 282 | 0.8% | 8.3% ± 8.2 | 14.3% | 32.2% / 32.0% | 6.3% | 0 / 0 | T?/M? | 96% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
