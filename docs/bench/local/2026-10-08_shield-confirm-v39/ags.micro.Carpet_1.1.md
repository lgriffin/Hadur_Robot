# ags.micro.Carpet 1.1 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 84.2% | 94.3% | 43.1% | 33 / 35 | 8.7% | 3.1% | 11 | 0 | 1.33 / 22.0 | 81.5% | +2.7 |
| 2 | 91.7% | 100.0% | 54.7% | 35 / 35 | 9.8% | 2.7% | 9 | 0 | 1.20 / 18.8 | 83.8% | +7.9 |
| 3 | 79.4% | 88.6% | 42.5% | 31 / 35 | 9.8% | 2.6% | 4 | 0 | 1.31 / 18.9 | 84.7% | -5.4 |
| 4 | 88.7% | 97.1% | 46.0% | 34 / 35 | 6.8% | 2.8% | 10 | 0 | 1.16 / 18.5 | 77.4% | +11.3 |
| 5 | 80.4% | 91.4% | 41.5% | 32 / 35 | 9.9% | 3.3% | 9 | 0 | 1.22 / 19.4 | 76.4% | +4.0 |
| 6 | 83.7% | 94.3% | 43.6% | 33 / 35 | 7.1% | 3.3% | 14 | 0 | 1.25 / 18.9 | 85.6% | -1.9 |
| 7 | 85.3% | 97.1% | 46.8% | 34 / 35 | 10.8% | 3.2% | 10 | 0 | 1.23 / 19.6 | 84.9% | +0.4 |
| 8 | 89.5% | 97.1% | 58.2% | 34 / 35 | 8.9% | 2.9% | 8 | 0 | 1.24 / 17.6 | 89.1% | +0.5 |
| 9 | 81.6% | 94.3% | 41.9% | 33 / 35 | 10.6% | 3.9% | 3 | 0 | 1.25 / 17.9 | 86.6% | -4.9 |
| 10 | 85.0% | 97.1% | 40.2% | 34 / 35 | 10.2% | 3.2% | 10 | 0 | 1.23 / 18.8 | 80.4% | +4.6 |
| 11 | 88.3% | 97.1% | 50.5% | 34 / 35 | 9.9% | 2.8% | 9 | 0 | 1.23 / 18.7 | 83.4% | +4.9 |
| 12 | 93.6% | 100.0% | 67.9% | 35 / 35 | 9.8% | 2.8% | 12 | 0 | 1.17 / 17.8 | 80.9% | +12.7 |
| 13 | 93.7% | 100.0% | 56.4% | 35 / 35 | 10.2% | 2.2% | 10 | 0 | 1.22 / 18.7 | 82.0% | +11.7 |
| 14 | 88.9% | 100.0% | 42.6% | 35 / 35 | 9.5% | 2.8% | 11 | 0 | 1.21 / 115.4 | 82.2% | +6.8 |
| 15 | 91.7% | 100.0% | 55.9% | 35 / 35 | 6.7% | 3.1% | 9 | 0 | 1.16 / 17.9 | 83.5% | +8.2 |
| 16 | 89.8% | 97.1% | 48.1% | 34 / 35 | 10.3% | 2.1% | 14 | 0 | 1.23 / 29.3 | 73.6% | +16.2 |

Mean score share 87.2% ± 2.4, baseline 82.3% ± 2.1, paired diff +5.0 ± 3.3.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 153 over 16 battles (9.6 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.micro.Carpet 1.1 | shield-confirm | 87.2% ± 2.4 | 96.6% ± 1.8 | 48.7% ± 4.2 | 541 / 560 | 9.3% ± 0.7 | 2.9% ± 0.2 | 153 | 0 | 1.33 / 115.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ags.micro.Carpet 1.1 | 16 | 343 | 17.3% | 76.4% | 0.1% | 6.2% | 1229 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ags.micro.Carpet 1.1 | 16 | 14 | 0 | 0 | 0.27 | 2 | 2 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.micro.Carpet 1.1 | 43290 | 789 | 43291 | 43290 (100.0%) | 0 (0.0%) | 1 (0.0%) | 340 | 66 | 58 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.micro.Carpet 1.1 | 7422 | 38562 (519.6%) | 2183 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.micro.Carpet 1.1 | 650 | 496 | 650 | 1080 | 7.0 / 7.5 | 8 | 979 | 3028 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.micro.Carpet 1.1 | 2.9% | 153 | 62 | 3 | 8.0 | 417 / 38562 (1%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ags.micro.Carpet 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ags.micro.Carpet 1.1 | ags.micro.Carpet | 1 | 35 | 296 | 2.4% | 11.8% ± 4.4 | 9.8% | 25.3% / 22.6% | 6.9% | 0 / 0 | T?/M? | 90% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
