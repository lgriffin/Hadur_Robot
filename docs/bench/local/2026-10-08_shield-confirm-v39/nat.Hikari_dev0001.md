# nat.Hikari dev0001 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 88.7% | 97.1% | 55.7% | 34 / 35 | 12.9% | 1.8% | 11 | 0 | 0.41 / 17.7 | 75.9% | +12.8 |
| 2 | 91.4% | 100.0% | 51.6% | 35 / 35 | 10.8% | 1.9% | 10 | 0 | 0.45 / 17.8 | 81.8% | +9.5 |
| 3 | 89.2% | 100.0% | 51.4% | 35 / 35 | 12.3% | 2.1% | 9 | 0 | 0.44 / 129.7 | 82.1% | +7.1 |
| 4 | 92.4% | 100.0% | 47.4% | 35 / 35 | 15.0% | 1.7% | 14 | 0 | 0.42 / 11.8 | 75.8% | +16.6 |
| 5 | 86.7% | 100.0% | 37.4% | 35 / 35 | 18.8% | 2.7% | 14 | 0 | 0.41 / 56.7 | 82.8% | +3.9 |
| 6 | 89.0% | 100.0% | 37.4% | 35 / 35 | 17.1% | 2.1% | 11 | 0 | 0.37 / 17.7 | 81.8% | +7.3 |
| 7 | 87.7% | 97.1% | 44.8% | 34 / 35 | 15.4% | 1.9% | 13 | 0 | 0.46 / 61.9 | 84.7% | +2.9 |
| 8 | 85.9% | 100.0% | 50.2% | 35 / 35 | 15.1% | 3.4% | 8 | 0 | 0.47 / 15.6 | 83.8% | +2.0 |
| 9 | 81.2% | 94.3% | 39.0% | 33 / 35 | 12.2% | 3.0% | 11 | 0 | 0.43 / 18.2 | 75.8% | +5.5 |
| 10 | 88.6% | 100.0% | 47.6% | 35 / 35 | 16.4% | 2.4% | 13 | 0 | 0.46 / 16.3 | 86.4% | +2.2 |
| 11 | 90.1% | 100.0% | 55.6% | 35 / 35 | 16.7% | 2.3% | 10 | 0 | 0.45 / 13.9 | 85.1% | +5.0 |
| 12 | 80.0% | 94.3% | 49.7% | 33 / 35 | 14.5% | 3.9% | 4 | 0 | 0.59 / 20.5 | 80.9% | -0.9 |
| 13 | 89.8% | 100.0% | 54.5% | 35 / 35 | 15.0% | 2.3% | 11 | 0 | 0.49 / 17.8 | 81.1% | +8.7 |
| 14 | 88.1% | 100.0% | 43.2% | 35 / 35 | 16.9% | 2.2% | 12 | 0 | 0.39 / 15.0 | 84.3% | +3.8 |
| 15 | 87.5% | 100.0% | 45.2% | 35 / 35 | 16.3% | 2.8% | 12 | 0 | 0.40 / 16.9 | 82.0% | +5.5 |
| 16 | 85.8% | 97.1% | 47.5% | 34 / 35 | 16.3% | 2.5% | 6 | 0 | 0.45 / 16.7 | 81.5% | +4.3 |

Mean score share 87.6% ± 1.7, baseline 81.6% ± 1.7, paired diff +6.0 ± 2.3.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 169 over 16 battles (10.6 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | shield-confirm | 87.6% ± 1.7 | 98.8% ± 1.1 | 47.4% ± 3.2 | 553 / 560 | 15.1% ± 1.1 | 2.4% ± 0.3 | 169 | 0 | 0.59 / 129.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 16 | 346 | 6.3% | 91.3% | 0.0% | 2.4% | 854 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 16 | 14 | 0 | 0 | 0.30 | 2 | 2 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 26074 | 24 | 26276 | 26034 (99.8%) | 40 (0.2%) | 242 (0.9%) | 2057 | 195 | 93 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| nat.Hikari dev0001 | 3664 | 23871 (651.5%) | 879 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 650 | 324 | 650 | 704 | 8.2 / 9.0 | 137 | 730 | 768 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 2.4% | 169 | 67 | 3 | 3.2 | 212 / 23871 (1%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | nat.Hikari | 1 | 35 | 280 | 2.7% | 14.6% ± 6.0 | 13.0% | 28.3% / 26.5% | 28.3% | 0 / 0 | T?/M? | 86% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
