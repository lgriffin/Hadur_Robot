# apv.NanoLauLectrik 1.0 (lower) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1000000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.5% | 97.1% | 63.7% | 34 / 35 | 16.7% | 5.0% | 15 | 0 | 0.96 / 12.2 | 79.8% | +1.7 |
| 2 | 84.3% | 100.0% | 68.2% | 35 / 35 | 17.7% | 6.1% | 15 | 0 | 0.97 / 16.0 | 81.4% | +2.9 |
| 3 | 75.0% | 88.6% | 61.9% | 31 / 35 | 18.3% | 7.0% | 12 | 0 | 0.94 / 15.9 | 75.4% | -0.5 |
| 4 | 84.5% | 100.0% | 67.4% | 35 / 35 | 15.4% | 5.2% | 8 | 0 | 0.93 / 15.8 | 82.9% | +1.6 |
| 5 | 78.3% | 94.3% | 60.5% | 33 / 35 | 14.7% | 6.2% | 13 | 0 | 0.99 / 16.4 | 82.1% | -3.7 |
| 6 | 73.9% | 88.6% | 59.6% | 31 / 35 | 15.3% | 6.9% | 16 | 0 | 1.03 / 12.2 | 83.3% | -9.4 |
| 7 | 77.2% | 91.4% | 61.9% | 32 / 35 | 14.8% | 5.3% | 10 | 0 | 1.02 / 12.2 | 80.4% | -3.2 |
| 8 | 74.4% | 91.4% | 55.9% | 32 / 35 | 13.4% | 6.3% | 10 | 0 | 1.00 / 17.0 | 77.1% | -2.7 |
| 9 | 84.2% | 100.0% | 65.7% | 35 / 35 | 14.8% | 5.0% | 10 | 0 | 0.99 / 10.8 | 83.5% | +0.7 |
| 10 | 75.6% | 88.6% | 62.5% | 31 / 35 | 16.4% | 5.7% | 10 | 0 | 0.95 / 17.1 | 86.0% | -10.3 |
| 11 | 76.5% | 91.4% | 60.9% | 32 / 35 | 15.8% | 6.3% | 8 | 0 | 0.95 / 12.9 | 77.6% | -1.1 |
| 12 | 83.6% | 97.1% | 67.9% | 34 / 35 | 17.4% | 4.7% | 12 | 0 | 0.88 / 16.9 | 81.6% | +2.0 |
| 13 | 82.2% | 97.1% | 65.5% | 34 / 35 | 15.6% | 5.0% | 13 | 0 | 0.97 / 11.1 | 80.9% | +1.3 |
| 14 | 74.5% | 91.4% | 57.9% | 32 / 35 | 15.6% | 6.7% | 14 | 0 | 1.00 / 16.7 | 86.9% | -12.4 |
| 15 | 76.1% | 91.4% | 61.1% | 32 / 35 | 16.6% | 6.8% | 13 | 0 | 0.99 / 17.7 | 74.8% | +1.3 |
| 16 | 80.5% | 97.1% | 61.9% | 34 / 35 | 14.2% | 5.4% | 10 | 0 | 1.02 / 17.5 | 80.5% | -0.1 |

Mean score share 78.9% ± 2.1, baseline 80.9% ± 1.8, paired diff -2.0 ± 2.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1000000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 189 over 16 battles (11.8 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | lower | 78.9% ± 2.1 | 94.1% ± 2.3 | 62.6% ± 1.9 | 527 / 560 | 15.8% ± 0.7 | 5.9% ± 0.4 | 189 | 0 | 1.03 / 17.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 16 | 967 | 10.7% | 84.2% | 0.0% | 5.1% | 555 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 16 | 12 | 1422 | 0 | 0.34 | 0 | 0 | 0 |

12 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 12962 | 33 | 12894 | 12866 (99.3%) | 96 (0.7%) | 28 (0.2%) | 1221 | 240 | 66 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 15393 | 1094 (7.1%) | 6171 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 650 | 461 | 550 | 405 | 39.0 / 23.3 | 2934 | 10033 | 7172 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 5.9% | 189 | 117 | 3 | 23.0 | 1085 / 1094 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | apv.NanoLauLectrik | 1 | 35 | 304 | 6.8% | 8.0% ± 1.9 | 13.7% | 33.2% / 30.8% | 12.1% | 0 / 0 | T3/M? | 78% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
