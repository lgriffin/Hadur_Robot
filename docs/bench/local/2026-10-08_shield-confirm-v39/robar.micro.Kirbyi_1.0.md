# robar.micro.Kirbyi 1.0 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.3% | 94.3% | 58.9% | 33 / 35 | 26.0% | 5.4% | 14 | 0 | 0.73 / 21.7 | 78.7% | +2.5 |
| 2 | 80.9% | 91.4% | 60.1% | 32 / 35 | 34.5% | 4.5% | 11 | 0 | 0.63 / 10.3 | 78.4% | +2.5 |
| 3 | 89.1% | 97.1% | 69.8% | 34 / 35 | 31.3% | 4.3% | 11 | 0 | 0.54 / 17.2 | 72.2% | +16.9 |
| 4 | 86.8% | 94.3% | 63.1% | 33 / 35 | 28.9% | 4.2% | 11 | 0 | 0.47 / 11.0 | 82.0% | +4.9 |
| 5 | 89.2% | 97.1% | 60.4% | 34 / 35 | 30.8% | 3.7% | 13 | 0 | 0.40 / 10.5 | 77.9% | +11.3 |
| 6 | 88.6% | 100.0% | 56.2% | 35 / 35 | 30.7% | 4.6% | 11 | 0 | 0.45 / 14.8 | 76.4% | +12.2 |
| 7 | 82.9% | 94.3% | 56.9% | 33 / 35 | 34.3% | 4.7% | 11 | 0 | 0.53 / 13.0 | 77.8% | +5.1 |
| 8 | 89.2% | 97.1% | 61.9% | 34 / 35 | 32.0% | 3.4% | 9 | 0 | 0.43 / 13.0 | 77.5% | +11.7 |
| 9 | 90.3% | 100.0% | 65.8% | 35 / 35 | 32.5% | 4.0% | 9 | 0 | 0.47 / 13.5 | 75.9% | +14.4 |
| 10 | 84.6% | 97.1% | 49.9% | 34 / 35 | 32.5% | 4.3% | 13 | 0 | 0.55 / 14.8 | 76.2% | +8.4 |
| 11 | 84.5% | 97.1% | 51.0% | 34 / 35 | 28.5% | 4.7% | 12 | 0 | 0.59 / 10.4 | 79.0% | +5.5 |
| 12 | 86.1% | 97.1% | 52.1% | 34 / 35 | 29.2% | 4.5% | 10 | 0 | 0.49 / 48.0 | 77.2% | +8.8 |
| 13 | 85.7% | 97.1% | 59.9% | 34 / 35 | 36.2% | 5.5% | 10 | 0 | 0.55 / 12.2 | 75.2% | +10.5 |
| 14 | 87.3% | 97.1% | 63.4% | 34 / 35 | 29.8% | 4.0% | 13 | 0 | 0.59 / 15.8 | 79.3% | +8.0 |
| 15 | 84.0% | 94.3% | 61.5% | 33 / 35 | 34.3% | 4.8% | 13 | 0 | 0.64 / 12.5 | 74.4% | +9.6 |
| 16 | 73.9% | 85.7% | 57.7% | 30 / 35 | 22.4% | 6.7% | 8 | 0 | 0.90 / 14.0 | 73.9% | -0.0 |

Mean score share 85.3% ± 2.2, baseline 77.0% ± 1.3, paired diff +8.3 ± 2.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 179 over 16 battles (11.2 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| robar.micro.Kirbyi 1.0 | shield-confirm | 85.3% ± 2.2 | 95.7% ± 1.8 | 59.3% ± 2.8 | 536 / 560 | 30.9% ± 1.9 | 4.6% ± 0.4 | 179 | 0 | 0.90 / 48.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| robar.micro.Kirbyi 1.0 | 16 | 471 | 15.9% | 78.3% | 0.0% | 5.7% | 811 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| robar.micro.Kirbyi 1.0 | 16 | 15 | 0 | 0 | 0.32 | 1 | 1 | 0 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| robar.micro.Kirbyi 1.0 | 23531 | 242 | 23726 | 23495 (99.8%) | 36 (0.2%) | 231 (1.0%) | 1360 | 150 | 68 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| robar.micro.Kirbyi 1.0 | 5084 | 19919 (391.8%) | 114 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| robar.micro.Kirbyi 1.0 | 650 | 261 | 616 | 660 | 15.4 / 10.5 | 682 | 1603 | 882 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| robar.micro.Kirbyi 1.0 | 4.6% | 179 | 74 | 3 | 4.7 | 167 / 19919 (1%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| robar.micro.Kirbyi 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| robar.micro.Kirbyi 1.0 | robar.micro.Kirbyi | 1 | 35 | 304 | 7.6% | 9.2% ± 2.3 | 15.8% | 26.4% / 26.3% | 6.7% | 0 / 0 | T3/M? | 73% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
