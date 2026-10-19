# sheldor.micro.Epeeist 3.7 (rank100-band3) vs hadur2.Hadur 3.13hjswpz

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 62.2% | 74.3% | 51.2% | 26 / 35 | 12.9% | 8.2% | 43 | 0 | 1.04 / 13.7 | 72.7% | -10.5 |
| 2 | 56.7% | 65.7% | 46.6% | 23 / 35 | 10.6% | 7.2% | 51 | 0 | 1.08 / 150.9 | 69.4% | -12.6 |
| 3 | 60.9% | 74.3% | 48.0% | 26 / 35 | 11.4% | 7.6% | 43 | 0 | 1.00 / 59.7 | 64.5% | -3.5 |
| 4 | 76.3% | 88.6% | 63.2% | 31 / 35 | 12.5% | 5.8% | 26 | 0 | 0.99 / 14.1 | 74.4% | +2.0 |
| 5 | 67.4% | 85.7% | 47.5% | 30 / 35 | 11.5% | 7.5% | 58 | 0 | 1.06 / 235.7 | 73.4% | -5.9 |
| 6 | 70.4% | 82.9% | 58.2% | 29 / 35 | 13.5% | 7.2% | 34 | 0 | 0.98 / 793.7 | 72.3% | -1.9 |
| 7 | 72.9% | 88.6% | 57.2% | 31 / 35 | 13.5% | 7.3% | 39 | 0 | 1.00 / 262.7 | 68.2% | +4.7 |
| 8 | 70.8% | 85.7% | 55.5% | 30 / 35 | 11.4% | 6.8% | 39 | 0 | 1.03 / 726.3 | 67.7% | +3.1 |

Mean score share 67.2% ± 5.6, baseline 70.3% ± 2.9, paired diff -3.1 ± 5.3.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 333 over 8 battles (41.6 per battle, most in one battle 58). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.micro.Epeeist 3.7 | rank100-band3 | 67.2% ± 5.6 | 80.7% ± 7.0 | 53.4% ± 5.0 | 226 / 280 | 12.2% ± 0.9 | 7.2% ± 0.6 | 333 | 0 | 1.08 / 793.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sheldor.micro.Epeeist 3.7 | 8 | 1506 | 22.4% | 68.6% | 0.0% | 9.0% | 1059 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sheldor.micro.Epeeist 3.7 | 8 | 7 | 0 | 0 | 1.19 | 1 | 1 | 0 |

7 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sheldor.micro.Epeeist 3.7 | 19424 | 71 | 19428 | 19422 (100.0%) | 2 (0.0%) | 6 (0.0%) | 1305 | 165 | 275 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sheldor.micro.Epeeist 3.7 | 19913 | 1953 (9.8%) | 18735 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sheldor.micro.Epeeist 3.7 | 650 | 529 | 641 | 909 | 34.1 / 29.5 | 333 | 6349 | 3094 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sheldor.micro.Epeeist 3.7 | 7.2% | 333 | 84 | 3 | 69.0 | 1943 / 1953 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| sheldor.micro.Epeeist 3.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.micro.Epeeist 3.7 | sheldor.micro.Epeeist | 1 | 35 | 316 | 7.7% | 7.7% ± 1.2 | 10.8% | 25.1% / 21.7% | 5.3% | 0 / 0 | T3/M0 | 70% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
