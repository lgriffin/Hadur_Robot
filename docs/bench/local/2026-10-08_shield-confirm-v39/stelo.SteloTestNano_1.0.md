# stelo.SteloTestNano 1.0 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 94.3% | 100.0% | 77.7% | 35 / 35 | 22.7% | 1.4% | 16 | 0 | 0.48 / 13.8 | 82.9% | +11.5 |
| 2 | 92.6% | 97.1% | 76.8% | 34 / 35 | 21.7% | 1.0% | 13 | 0 | 0.39 / 13.4 | 86.4% | +6.2 |
| 3 | 92.2% | 97.1% | 72.6% | 34 / 35 | 28.1% | 1.1% | 10 | 0 | 0.36 / 13.3 | 91.4% | +0.8 |
| 4 | 86.7% | 94.3% | 65.6% | 33 / 35 | 26.2% | 3.0% | 12 | 0 | 0.35 / 11.5 | 84.6% | +2.2 |
| 5 | 94.9% | 100.0% | 75.2% | 35 / 35 | 23.3% | 1.1% | 12 | 0 | 0.39 / 58.4 | 89.5% | +5.4 |
| 6 | 95.7% | 100.0% | 77.3% | 35 / 35 | 23.4% | 0.9% | 15 | 0 | 0.38 / 14.5 | 91.5% | +4.1 |
| 7 | 92.3% | 100.0% | 65.3% | 35 / 35 | 27.7% | 1.5% | 10 | 0 | 0.36 / 11.7 | 84.7% | +7.6 |
| 8 | 92.4% | 97.1% | 74.8% | 34 / 35 | 21.7% | 1.2% | 4 | 0 | 0.42 / 11.3 | 86.3% | +6.0 |
| 9 | 92.9% | 97.1% | 78.0% | 34 / 35 | 25.7% | 1.1% | 12 | 0 | 0.40 / 12.8 | 84.1% | +8.7 |
| 10 | 97.4% | 100.0% | 85.0% | 35 / 35 | 18.9% | 0.8% | 12 | 0 | 0.40 / 15.4 | 83.4% | +14.0 |
| 11 | 94.3% | 100.0% | 74.6% | 35 / 35 | 20.5% | 1.3% | 12 | 0 | 0.47 / 11.8 | 83.7% | +10.6 |
| 12 | 91.4% | 97.1% | 72.6% | 34 / 35 | 19.8% | 1.9% | 14 | 0 | 0.44 / 9.6 | 84.8% | +6.6 |
| 13 | 95.7% | 100.0% | 75.9% | 35 / 35 | 18.2% | 1.0% | 13 | 0 | 0.40 / 11.3 | 86.8% | +8.9 |
| 14 | 86.8% | 94.3% | 62.7% | 33 / 35 | 24.5% | 2.4% | 12 | 0 | 0.36 / 10.2 | 91.1% | -4.3 |
| 15 | 91.2% | 97.1% | 69.0% | 34 / 35 | 16.6% | 1.3% | 13 | 0 | 0.44 / 12.8 | 83.5% | +7.7 |
| 16 | 94.9% | 100.0% | 74.7% | 35 / 35 | 24.3% | 1.4% | 13 | 0 | 0.41 / 10.7 | 83.5% | +11.4 |

Mean score share 92.9% ± 1.6, baseline 86.1% ± 1.6, paired diff +6.7 ± 2.4.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 193 over 16 battles (12.1 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| stelo.SteloTestNano 1.0 | shield-confirm | 92.9% ± 1.6 | 98.2% ± 1.1 | 73.6% ± 3.0 | 550 / 560 | 22.7% ± 1.8 | 1.4% ± 0.3 | 193 | 0 | 0.48 / 58.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| stelo.SteloTestNano 1.0 | 16 | 199 | 15.7% | 77.1% | 1.3% | 6.0% | 693 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| stelo.SteloTestNano 1.0 | 16 | 15 | 0 | 0 | 0.34 | 1 | 1 | 0 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| stelo.SteloTestNano 1.0 | 17190 | 8 | 17190 | 17190 (100.0%) | 0 (0.0%) | 0 (0.0%) | 86 | 42 | 72 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| stelo.SteloTestNano 1.0 | 3066 | 16129 (526.1%) | 195 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| stelo.SteloTestNano 1.0 | 650 | 385 | 645 | 543 | 12.2 / 4.4 | 138 | 1108 | 365 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| stelo.SteloTestNano 1.0 | 1.4% | 193 | 69 | 3 | 1.5 | 87 / 16129 (1%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| stelo.SteloTestNano 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| stelo.SteloTestNano 1.0 | stelo.SteloTestNano | 1 | 35 | 308 | 1.3% | 20.9% ± 11.8 | 14.0% | 33.0% / 27.2% | 9.3% | 0 / 0 | T?/M? | 94% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
