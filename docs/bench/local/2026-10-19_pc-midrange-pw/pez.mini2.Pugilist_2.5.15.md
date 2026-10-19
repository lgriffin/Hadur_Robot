# pez.mini2.Pugilist 2.5.15 (rank73-band3) vs hadur2.Hadur 3.13hjswpw

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 73.5% | 80.0% | 65.9% | 28 / 35 | 11.8% | 6.8% | 47 | 0 | 1.09 / 337.1 | 61.8% | +11.7 |
| 2 | 68.9% | 74.3% | 62.4% | 26 / 35 | 11.1% | 6.8% | 53 | 0 | 1.06 / 16.6 | 64.2% | +4.7 |
| 3 | 66.7% | 68.6% | 63.6% | 24 / 35 | 11.8% | 6.6% | 56 | 0 | 1.01 / 195.2 | 63.5% | +3.2 |
| 4 | 63.2% | 62.9% | 62.6% | 22 / 35 | 12.1% | 7.3% | 59 | 0 | 1.03 / 230.6 | 68.3% | -5.0 |
| 5 | 72.7% | 80.0% | 64.7% | 28 / 35 | 11.9% | 7.2% | 43 | 0 | 1.08 / 156.1 | 69.1% | +3.6 |
| 6 | 66.9% | 71.4% | 61.5% | 25 / 35 | 11.7% | 7.3% | 64 | 0 | 1.05 / 15.8 | 64.7% | +2.2 |
| 7 | 58.0% | 57.1% | 58.1% | 20 / 35 | 12.4% | 7.9% | 72 | 0 | 1.06 / 23.6 | 65.0% | -7.0 |
| 8 | 66.2% | 71.4% | 59.9% | 25 / 35 | 11.5% | 8.2% | 67 | 0 | 1.03 / 21.0 | 62.1% | +4.2 |

Mean score share 67.0% ± 4.2, baseline 64.8% ± 2.2, paired diff +2.2 ± 4.9.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 461 over 8 battles (57.6 per battle, most in one battle 72). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | rank73-band3 | 67.0% ± 4.2 | 70.7% ± 6.6 | 62.3% ± 2.1 | 198 / 280 | 11.8% ± 0.3 | 7.3% ± 0.5 | 461 | 0 | 1.09 / 337.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | 8 | 1519 | 33.7% | 55.0% | 0.0% | 11.3% | 1945 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | 8 | 5 | 0 | 0 | 1.65 | 2 | 2 | 0 |

5 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | 42531 | 67 | 42562 | 42526 (100.0%) | 5 (0.0%) | 36 (0.1%) | 3853 | 318 | 423 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | 41385 | 4812 (11.6%) | 40455 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | 650 | 547 | 650 | 1786 | 39.4 / 23.9 | 618 | 4814 | 1467 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | 7.3% | 461 | 1210 | 3 | 149.1 | 4799 / 4812 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| pez.mini2.Pugilist 2.5.15 | pez.mini2.Pugilist | 1 | 35 | 310 | 8.9% | 7.9% ± 0.9 | 11.9% | 24.7% / 22.4% | 3.2% | 0 / 0 | T3/M1 | 65% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
