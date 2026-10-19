# davidalves.PhoenixOS 1.1 (rank59-band3) vs hadur2.Hadur 3.13hjswpwf8

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 64.7% | 77.1% | 53.7% | 27 / 35 | 13.3% | 8.7% | 30 | 0 | 0.97 / 267.2 | 56.4% | +8.2 |
| 2 | 66.8% | 80.0% | 52.7% | 28 / 35 | 13.1% | 7.0% | 20 | 0 | 0.90 / 19.3 | 77.8% | -11.0 |
| 3 | 68.5% | 82.9% | 55.9% | 29 / 35 | 14.0% | 8.4% | 19 | 0 | 0.87 / 217.5 | 64.4% | +4.2 |
| 4 | 61.9% | 71.4% | 52.5% | 25 / 35 | 12.6% | 7.4% | 10 | 0 | 0.90 / 18.9 | 61.7% | +0.2 |
| 5 | 64.3% | 77.1% | 52.0% | 27 / 35 | 12.9% | 7.3% | 8 | 0 | 0.92 / 515.6 | 64.5% | -0.2 |
| 6 | 70.2% | 82.9% | 58.0% | 29 / 35 | 13.9% | 7.9% | 15 | 0 | 0.87 / 19.7 | 72.0% | -1.8 |
| 7 | 69.7% | 82.9% | 56.9% | 29 / 35 | 14.0% | 7.2% | 19 | 0 | 0.88 / 298.8 | 68.2% | +1.5 |
| 8 | 59.1% | 68.6% | 49.8% | 24 / 35 | 12.4% | 8.0% | 17 | 0 | 0.89 / 20.0 | 63.8% | -4.7 |

Mean score share 65.7% ± 3.3, baseline 66.1% ± 5.5, paired diff -0.4 ± 4.8.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 138 over 8 battles (17.3 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| davidalves.PhoenixOS 1.1 | rank59-band3 | 65.7% ± 3.3 | 77.9% ± 4.6 | 53.9% ± 2.3 | 218 / 280 | 13.3% ± 0.5 | 7.7% ± 0.5 | 138 | 0 | 0.97 / 515.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| davidalves.PhoenixOS 1.1 | 8 | 1624 | 23.9% | 66.7% | 0.0% | 9.5% | 1018 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| davidalves.PhoenixOS 1.1 | 8 | 5 | 0 | 0 | 0.49 | 3 | 3 | 0 |

5 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| davidalves.PhoenixOS 1.1 | 12633 | 6 | 12694 | 12633 (100.0%) | 0 (0.0%) | 61 (0.5%) | 2267 | 148 | 70 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| davidalves.PhoenixOS 1.1 | 18299 | 1087 (5.9%) | 16707 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| davidalves.PhoenixOS 1.1 | 650 | 466 | 425 | 870 | 36.3 / 30.9 | 2286 | 1572 | 24 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| davidalves.PhoenixOS 1.1 | 7.7% | 138 | 222 | 3 | 44.5 | 1087 / 1087 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| davidalves.PhoenixOS 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| davidalves.PhoenixOS 1.1 | davidalves.PhoenixOS | 1 | 35 | 312 | 9.0% | 8.3% ± 1.4 | 12.6% | 23.6% / 25.0% | 4.4% | 0 / 0 | T3/M1 | 59% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
