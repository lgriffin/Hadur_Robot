# rdt.AgentSmith.AgentSmith 0.5 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 86.6% | 94.3% | 50.8% | 33 / 35 | 7.0% | 1.3% | 12 | 0 | 0.90 / 19.2 | 72.6% | +14.0 |
| 2 | 95.6% | 100.0% | 51.2% | 35 / 35 | 6.0% | 0.6% | 10 | 0 | 0.80 / 15.0 | 76.0% | +19.6 |
| 3 | 87.3% | 97.1% | 48.6% | 34 / 35 | 8.4% | 1.5% | 9 | 0 | 0.92 / 21.2 | 66.5% | +20.9 |
| 4 | 86.7% | 94.3% | 55.2% | 33 / 35 | 7.3% | 1.3% | 5 | 0 | 0.82 / 16.3 | 69.6% | +17.0 |
| 5 | 92.3% | 100.0% | 58.1% | 35 / 35 | 7.9% | 1.6% | 11 | 0 | 0.87 / 15.8 | 68.7% | +23.6 |
| 6 | 84.7% | 91.4% | 47.9% | 32 / 35 | 7.6% | 0.8% | 9 | 0 | 0.80 / 17.0 | 67.7% | +17.0 |
| 7 | 95.0% | 100.0% | 64.8% | 35 / 35 | 5.3% | 0.9% | 10 | 0 | 0.85 / 16.4 | 69.3% | +25.7 |
| 8 | 85.6% | 94.3% | 48.1% | 33 / 35 | 8.8% | 1.3% | 9 | 0 | 0.85 / 16.4 | 59.5% | +26.1 |
| 9 | 91.3% | 97.1% | 50.9% | 34 / 35 | 6.0% | 0.7% | 10 | 0 | 0.88 / 16.3 | 69.7% | +21.6 |
| 10 | 97.9% | 100.0% | 58.0% | 35 / 35 | 3.6% | 0.2% | 9 | 0 | 0.78 / 18.0 | 60.8% | +37.1 |
| 11 | 87.3% | 97.1% | 51.6% | 34 / 35 | 9.5% | 1.7% | 12 | 0 | 0.89 / 19.0 | 73.1% | +14.1 |
| 12 | 87.6% | 94.3% | 45.6% | 33 / 35 | 5.9% | 0.9% | 11 | 0 | 0.87 / 14.8 | 65.4% | +22.2 |
| 13 | 91.1% | 100.0% | 51.2% | 35 / 35 | 5.5% | 1.5% | 11 | 0 | 0.85 / 17.3 | 79.7% | +11.3 |
| 14 | 88.6% | 97.1% | 53.9% | 34 / 35 | 8.9% | 1.3% | 9 | 0 | 0.86 / 168.7 | 63.3% | +25.2 |
| 15 | 93.2% | 100.0% | 57.1% | 35 / 35 | 6.5% | 1.0% | 9 | 0 | 0.85 / 18.3 | 67.4% | +25.8 |
| 16 | 93.5% | 100.0% | 62.7% | 35 / 35 | 6.9% | 1.2% | 11 | 0 | 0.86 / 14.8 | 73.2% | +20.4 |

Mean score share 90.3% ± 2.1, baseline 68.9% ± 2.8, paired diff +21.4 ± 3.3.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 157 over 16 battles (9.8 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rdt.AgentSmith.AgentSmith 0.5 | shield-confirm | 90.3% ± 2.1 | 97.3% ± 1.5 | 53.5% ± 2.9 | 545 / 560 | 6.9% ± 0.8 | 1.1% ± 0.2 | 157 | 0 | 0.92 / 168.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| rdt.AgentSmith.AgentSmith 0.5 | 16 | 251 | 18.7% | 73.7% | 0.0% | 7.6% | 966 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rdt.AgentSmith.AgentSmith 0.5 | 16 | 15 | 0 | 0 | 0.28 | 1 | 1 | 0 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| rdt.AgentSmith.AgentSmith 0.5 | 28917 | 6 | 28916 | 28916 (100.0%) | 1 (0.0%) | 0 (0.0%) | 109 | 56 | 56 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| rdt.AgentSmith.AgentSmith 0.5 | 5461 | 27026 (494.9%) | 797 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| rdt.AgentSmith.AgentSmith 0.5 | 650 | 499 | 650 | 816 | 6.1 / 5.3 | 36 | 656 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| rdt.AgentSmith.AgentSmith 0.5 | 1.1% | 157 | 52 | 3 | 3.0 | 153 / 27026 (1%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| rdt.AgentSmith.AgentSmith 0.5 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| rdt.AgentSmith.AgentSmith 0.5 | rdt.AgentSmith.AgentSmith | 1 | 35 | 332 | 1.0% | 10.9% ± 5.3 | 9.5% | 28.7% / 28.5% | 3.7% | 0 / 0 | T?/M? | 93% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
