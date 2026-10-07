# ola.Puffin 1.0 (weak) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 94.6% | 100.0% | 92.5% | 35 / 35 | 47.3% | 14.6% | 16 | 0 | 0.88 / 12.0 | 95.9% | -1.3 |
| 2 | 99.3% | 100.0% | 98.6% | 35 / 35 | 53.9% | 2.9% | 13 | 0 | 0.79 / 10.6 | 97.7% | +1.6 |
| 3 | 99.1% | 100.0% | 98.4% | 35 / 35 | 50.0% | 2.9% | 12 | 0 | 0.87 / 11.5 | 97.4% | +1.7 |
| 4 | 99.5% | 100.0% | 99.0% | 35 / 35 | 58.4% | 2.2% | 11 | 0 | 0.77 / 10.7 | 97.0% | +2.4 |
| 5 | 97.4% | 100.0% | 96.7% | 35 / 35 | 57.1% | 7.8% | 16 | 0 | 0.92 / 12.3 | 96.7% | +0.7 |
| 6 | 98.1% | 100.0% | 97.0% | 35 / 35 | 51.1% | 4.8% | 12 | 0 | 0.83 / 9.9 | 94.1% | +4.0 |
| 7 | 98.2% | 100.0% | 96.7% | 35 / 35 | 50.6% | 5.6% | 15 | 0 | 0.92 / 12.6 | 95.7% | +2.5 |
| 8 | 99.2% | 100.0% | 98.5% | 35 / 35 | 54.6% | 2.7% | 14 | 0 | 0.78 / 11.5 | 96.0% | +3.2 |
| 9 | 96.9% | 100.0% | 94.6% | 35 / 35 | 52.2% | 8.9% | 11 | 0 | 0.92 / 11.1 | 96.2% | +0.7 |
| 10 | 98.0% | 100.0% | 96.4% | 35 / 35 | 53.0% | 6.8% | 16 | 0 | 0.81 / 11.3 | 94.5% | +3.5 |
| 11 | 99.4% | 100.0% | 98.9% | 35 / 35 | 53.3% | 2.4% | 13 | 0 | 0.77 / 10.3 | 97.9% | +1.4 |
| 12 | 96.4% | 100.0% | 93.7% | 35 / 35 | 55.3% | 11.9% | 13 | 0 | 0.88 / 9.4 | 96.1% | +0.3 |
| 13 | 95.2% | 100.0% | 93.5% | 35 / 35 | 53.5% | 11.0% | 10 | 0 | 0.85 / 10.1 | 97.7% | -2.5 |
| 14 | 97.3% | 100.0% | 95.9% | 35 / 35 | 54.8% | 6.6% | 17 | 0 | 0.87 / 12.4 | 97.1% | +0.2 |
| 15 | 98.5% | 100.0% | 97.2% | 35 / 35 | 54.3% | 5.5% | 15 | 0 | 0.78 / 12.0 | 97.4% | +1.1 |
| 16 | 97.1% | 100.0% | 95.3% | 35 / 35 | 58.9% | 7.5% | 15 | 0 | 0.86 / 11.3 | 96.4% | +0.7 |

Mean score share 97.8% ± 0.8, baseline 96.5% ± 0.6, paired diff +1.3 ± 0.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 219 over 16 battles (13.7 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ola.Puffin 1.0 | weak | 97.8% ± 0.8 | 100.0% ± 0.0 | 96.4% ± 1.1 | 560 / 560 | 53.6% ± 1.6 | 6.5% ± 2.0 | 219 | 0 | 0.92 / 12.6 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ola.Puffin 1.0 | 16 | 13 | 894 | 0 | 0.39 | 0 | 0 | 0 |

13 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ola.Puffin 1.0 | 6412 | 35 | 6352 | 6343 (98.9%) | 69 (1.1%) | 9 (0.1%) | 216 | 237 | 212 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ola.Puffin 1.0 | 6273 | 488 (7.8%) | 943 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ola.Puffin 1.0 | 650 | 316 | 400 | 197 | 90.6 / 3.4 | 4620 | 3413 | 220 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ola.Puffin 1.0 | 6.5% | 219 | 53 | 3 | 11.3 | 486 / 488 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ola.Puffin 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ola.Puffin 1.0 | ola.Puffin | 1 | 35 | 272 | 10.5% | 4.6% ± 2.3 | 36.9% | 46.0% / 44.2% | 0.2% | 0 / 0 | T2/M? | 97% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
