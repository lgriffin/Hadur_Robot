# stelo.Randomness 1.1 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 83.8% | 94.3% | 61.5% | 33 / 35 | 17.7% | 3.1% | 32 | 0 | 0.53 / 12.1 | 86.1% | -2.3 |
| 2 | 75.4% | 85.7% | 50.4% | 30 / 35 | 19.4% | 2.6% | 12 | 0 | 0.44 / 14.5 | 83.4% | -8.0 |
| 3 | 85.3% | 94.3% | 58.9% | 33 / 35 | 12.4% | 2.8% | 9 | 0 | 0.51 / 69.5 | 82.6% | +2.6 |
| 4 | 91.7% | 100.0% | 68.8% | 35 / 35 | 12.6% | 2.0% | 11 | 0 | 0.48 / 14.3 | 82.1% | +9.7 |
| 5 | 88.3% | 97.1% | 63.8% | 34 / 35 | 17.4% | 2.9% | 14 | 0 | 0.44 / 16.5 | 87.2% | +1.1 |
| 6 | 83.7% | 94.3% | 47.4% | 33 / 35 | 12.5% | 2.7% | 13 | 0 | 0.47 / 18.9 | 86.1% | -2.5 |
| 7 | 82.4% | 91.4% | 63.5% | 32 / 35 | 16.4% | 3.2% | 14 | 0 | 0.60 / 16.0 | 81.3% | +1.1 |
| 8 | 89.4% | 100.0% | 64.4% | 35 / 35 | 13.8% | 3.0% | 10 | 0 | 0.54 / 23.9 | 81.6% | +7.8 |
| 9 | 90.7% | 100.0% | 71.0% | 35 / 35 | 17.6% | 3.6% | 8 | 0 | 0.40 / 9.4 | 86.4% | +4.3 |
| 10 | 79.3% | 91.4% | 53.3% | 32 / 35 | 18.4% | 3.3% | 11 | 0 | 0.56 / 15.2 | 78.1% | +1.2 |
| 11 | 81.0% | 91.4% | 51.5% | 32 / 35 | 17.8% | 3.0% | 10 | 0 | 0.50 / 17.1 | 83.9% | -3.0 |
| 12 | 81.3% | 91.4% | 60.3% | 32 / 35 | 17.2% | 3.3% | 11 | 0 | 0.49 / 14.9 | 82.2% | -0.9 |
| 13 | 90.2% | 97.1% | 69.1% | 34 / 35 | 11.9% | 2.2% | 12 | 0 | 0.59 / 16.1 | 84.5% | +5.8 |
| 14 | 90.6% | 97.1% | 62.3% | 34 / 35 | 15.3% | 1.3% | 11 | 0 | 0.40 / 25.1 | 80.5% | +10.0 |
| 15 | 81.5% | 91.4% | 56.4% | 32 / 35 | 15.4% | 2.7% | 12 | 0 | 0.55 / 15.7 | 77.9% | +3.6 |
| 16 | 88.5% | 97.1% | 64.4% | 34 / 35 | 17.6% | 2.7% | 12 | 0 | 0.42 / 84.4 | 81.1% | +7.4 |

Mean score share 85.2% ± 2.6, baseline 82.8% ± 1.5, paired diff +2.4 ± 2.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 202 over 16 battles (12.6 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| stelo.Randomness 1.1 | shield-confirm | 85.2% ± 2.6 | 94.6% ± 2.1 | 60.4% ± 3.7 | 530 / 560 | 15.8% ± 1.3 | 2.8% ± 0.3 | 202 | 0 | 0.60 / 84.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| stelo.Randomness 1.1 | 16 | 452 | 20.8% | 70.9% | 0.7% | 7.6% | 852 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| stelo.Randomness 1.1 | 16 | 15 | 212 | 0 | 0.36 | 0 | 0 | 0 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| stelo.Randomness 1.1 | 25749 | 23 | 25735 | 25735 (99.9%) | 14 (0.1%) | 0 (0.0%) | 213 | 87 | 81 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| stelo.Randomness 1.1 | 5366 | 22631 (421.7%) | 1200 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| stelo.Randomness 1.1 | 650 | 417 | 644 | 702 | 14.1 / 9.1 | 490 | 2995 | 240 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| stelo.Randomness 1.1 | 2.8% | 202 | 74 | 3 | 5.1 | 263 / 22631 (1%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| stelo.Randomness 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| stelo.Randomness 1.1 | stelo.Randomness | 1 | 35 | 296 | 2.8% | 13.0% ± 5.6 | 13.2% | 24.7% / 20.5% | 8.0% | 0 / 0 | T?/M? | 88% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
