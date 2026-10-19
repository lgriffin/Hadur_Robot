# pez.mini2.Pugilist 2.5.15 (rank73-band3) vs hadur2.Hadur 3.13hjf8

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 69.6% | 74.3% | 63.8% | 26 / 35 | 11.9% | 7.0% | 37 | 0 | 1.06 / 15.4 | 68.3% | +1.4 |
| 2 | 69.4% | 74.3% | 63.4% | 26 / 35 | 11.6% | 6.6% | 32 | 0 | 1.01 / 293.4 | 73.7% | -4.3 |
| 3 | 72.6% | 80.0% | 64.0% | 28 / 35 | 12.1% | 7.8% | 42 | 0 | 1.03 / 16.8 | 61.2% | +11.4 |
| 4 | 65.0% | 68.6% | 60.5% | 24 / 35 | 11.7% | 7.3% | 44 | 0 | 1.02 / 367.4 | 68.8% | -3.7 |
| 5 | 71.0% | 77.1% | 63.5% | 27 / 35 | 11.4% | 6.5% | 41 | 0 | 1.04 / 188.0 | 65.7% | +5.2 |
| 6 | 67.4% | 71.4% | 62.0% | 25 / 35 | 12.3% | 7.1% | 41 | 0 | 1.01 / 171.5 | 59.5% | +7.9 |
| 7 | 66.4% | 68.6% | 63.1% | 24 / 35 | 12.8% | 7.3% | 47 | 0 | 1.04 / 249.5 | 73.5% | -7.1 |
| 8 | 73.5% | 82.9% | 63.2% | 29 / 35 | 12.4% | 7.1% | 37 | 0 | 0.99 / 16.4 | 65.7% | +7.7 |

Mean score share 69.3% ± 2.5, baseline 67.1% ± 4.3, paired diff +2.3 ± 5.7.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 321 over 8 battles (40.1 per battle, most in one battle 47). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | rank73-band3 | 69.3% ± 2.5 | 74.6% ± 4.3 | 63.0% ± 1.0 | 209 / 280 | 12.0% ± 0.4 | 7.1% ± 0.3 | 321 | 0 | 1.06 / 367.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | 8 | 1401 | 31.7% | 58.0% | 0.0% | 10.4% | 1905 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | 8 | 7 | 0 | 0 | 1.15 | 1 | 1 | 0 |

7 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | 41463 | 78 | 41492 | 41458 (100.0%) | 5 (0.0%) | 34 (0.1%) | 3873 | 269 | 257 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | 40607 | 4623 (11.4%) | 39004 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | 650 | 550 | 588 | 1753 | 39.5 / 23.2 | 824 | 3356 | 1481 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | 7.1% | 321 | 366 | 3 | 146.6 | 4615 / 4623 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | pez.mini2.Pugilist | 1 | 35 | 310 | 8.5% | 7.3% ± 1.0 | 13.3% | 25.7% / 22.0% | 3.2% | 0 / 0 | T3/M0 | 72% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
