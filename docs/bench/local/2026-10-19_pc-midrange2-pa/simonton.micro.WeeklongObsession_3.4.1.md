# simonton.micro.WeeklongObsession 3.4.1 (rank136-band3) vs hadur2.Hadur 3.13hjswpa

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 71.9% | 74.3% | 68.7% | 26 / 35 | 14.1% | 8.2% | 36 | 0 | 1.07 / 673.8 | 66.5% | +5.3 |
| 2 | 71.6% | 71.4% | 70.4% | 25 / 35 | 12.9% | 6.8% | 37 | 0 | 1.05 / 11.5 | 73.4% | -1.8 |
| 3 | 57.6% | 57.1% | 57.1% | 20 / 35 | 12.6% | 8.8% | 41 | 0 | 1.07 / 11.5 | 66.7% | -9.0 |
| 4 | 62.0% | 60.0% | 63.1% | 21 / 35 | 12.5% | 8.1% | 32 | 0 | 1.08 / 11.7 | 77.0% | -15.0 |
| 5 | 61.8% | 60.0% | 62.2% | 21 / 35 | 12.4% | 9.1% | 35 | 0 | 1.07 / 100.3 | 70.9% | -9.0 |
| 6 | 54.7% | 54.3% | 54.3% | 19 / 35 | 12.0% | 8.2% | 43 | 0 | 1.04 / 244.6 | 70.6% | -15.9 |
| 7 | 58.9% | 57.1% | 59.6% | 20 / 35 | 13.0% | 7.3% | 42 | 0 | 1.09 / 11.0 | 67.7% | -8.8 |
| 8 | 64.2% | 62.9% | 64.3% | 22 / 35 | 13.8% | 8.1% | 27 | 0 | 1.09 / 193.3 | 66.8% | -2.6 |

Mean score share 62.8% ± 5.2, baseline 69.9% ± 3.2, paired diff -7.1 ± 5.9.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 293 over 8 battles (36.6 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| simonton.micro.WeeklongObsession 3.4.1 | rank136-band3 | 62.8% ± 5.2 | 62.1% ± 6.0 | 62.5% ± 4.6 | 174 / 280 | 12.9% ± 0.6 | 8.1% ± 0.6 | 293 | 0 | 1.09 / 673.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| simonton.micro.WeeklongObsession 3.4.1 | 8 | 1797 | 36.9% | 50.2% | 0.0% | 12.9% | 826 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| simonton.micro.WeeklongObsession 3.4.1 | 8 | 6 | 0 | 0 | 1.05 | 2 | 1 | 0 |

6 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| simonton.micro.WeeklongObsession 3.4.1 | 13588 | 60 | 13588 | 13583 (100.0%) | 5 (0.0%) | 5 (0.0%) | 539 | 124 | 270 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| simonton.micro.WeeklongObsession 3.4.1 | 13181 | 1164 (8.8%) | 10823 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| simonton.micro.WeeklongObsession 3.4.1 | 650 | 496 | 650 | 675 | 43.3 / 25.8 | 391 | 2912 | 980 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| simonton.micro.WeeklongObsession 3.4.1 | 8.1% | 293 | 76 | 3 | 47.6 | 1159 / 1164 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| simonton.micro.WeeklongObsession 3.4.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| simonton.micro.WeeklongObsession 3.4.1 | simonton.micro.WeeklongObsession | 1 | 35 | 364 | 9.8% | 8.5% ± 1.5 | 11.3% | 25.6% / 22.9% | 5.2% | 0 / 0 | T3/M0 | 63% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
