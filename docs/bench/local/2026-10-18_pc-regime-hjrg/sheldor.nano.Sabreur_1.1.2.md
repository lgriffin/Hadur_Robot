# sheldor.nano.Sabreur 1.1.2 (rank246-band4) vs hadur2.Hadur 3.13hjrg

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 66.7% | 91.4% | 60.8% | 32 / 35 | 72.8% | 50.2% | 23 | 0 | 0.81 / 7.3 | 70.4% | -3.6 |
| 2 | 71.8% | 100.0% | 60.6% | 35 / 35 | 67.0% | 50.0% | 27 | 0 | 0.68 / 54.3 | 70.8% | +1.0 |
| 3 | 69.9% | 94.3% | 60.8% | 33 / 35 | 68.7% | 51.5% | 29 | 0 | 0.73 / 131.4 | 69.2% | +0.7 |
| 4 | 70.6% | 97.1% | 60.6% | 34 / 35 | 73.0% | 52.6% | 33 | 0 | 0.77 / 1344.8 | 71.9% | -1.4 |
| 5 | 69.0% | 91.4% | 60.5% | 32 / 35 | 68.7% | 50.2% | 64 | 0 | 0.70 / 1300.3 | 68.0% | +1.0 |
| 6 | 70.6% | 97.1% | 60.2% | 34 / 35 | 67.9% | 51.6% | 44 | 0 | 0.64 / 1105.3 | 74.0% | -3.4 |
| 7 | 66.6% | 94.3% | 61.2% | 33 / 35 | 78.0% | 53.8% | 13 | 0 | 0.78 / 1402.5 | 73.3% | -6.7 |
| 8 | 70.5% | 97.1% | 60.2% | 34 / 35 | 70.7% | 54.9% | 71 | 0 | 0.82 / 12.2 | 71.9% | -1.4 |

Mean score share 69.5% ± 1.6, baseline 71.2% ± 1.7, paired diff -1.7 ± 2.3.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 304 over 8 battles (38.0 per battle, most in one battle 71). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.nano.Sabreur 1.1.2 | rank246-band4 | 69.5% ± 1.6 | 95.4% ± 2.5 | 60.6% ± 0.3 | 267 / 280 | 70.9% ± 3.0 | 51.9% ± 1.5 | 304 | 0 | 0.82 / 1402.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sheldor.nano.Sabreur 1.1.2 | 8 | 2913 | 2.8% | 81.4% | 13.8% | 2.0% | 318 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sheldor.nano.Sabreur 1.1.2 | 8 | 7 | 0 | 2 | 1.09 | 0 | 0 | 0 |

7 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sheldor.nano.Sabreur 1.1.2 | 2688 | 16 | 2695 | 2687 (100.0%) | 1 (0.0%) | 8 (0.3%) | 2282 | 271 | 104 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sheldor.nano.Sabreur 1.1.2 | 2682 | 164 (6.1%) | 891 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sheldor.nano.Sabreur 1.1.2 | 650 | 158 | 650 | 168 | 104.2 / 67.8 | 2024 | 1952 | 207 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sheldor.nano.Sabreur 1.1.2 | 51.9% | 304 | 86 | 3 | 9.3 | 164 / 164 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| sheldor.nano.Sabreur 1.1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.nano.Sabreur 1.1.2 | sheldor.nano.Sabreur | 1 | 35 | 316 | 56.7% | 11.3% ± 3.4 | 43.1% | 13.3% / 12.7% | 5.0% | 0 / 0 | T?/M? | 68% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
