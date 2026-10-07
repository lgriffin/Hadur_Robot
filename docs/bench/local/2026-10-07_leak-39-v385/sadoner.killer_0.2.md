# sadoner.killer 0.2 (weak) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 83.4% | 91.4% | 76.0% | 32 / 35 | 21.1% | 7.2% | 10 | 0 | 0.69 / 11.9 | 81.9% | +1.5 |
| 2 | 77.4% | 88.6% | 67.7% | 31 / 35 | 20.5% | 9.9% | 12 | 0 | 0.86 / 11.8 | 77.7% | -0.2 |
| 3 | 85.5% | 97.1% | 74.8% | 34 / 35 | 20.3% | 8.0% | 12 | 0 | 0.71 / 10.3 | 86.4% | -0.8 |
| 4 | 91.0% | 97.1% | 85.0% | 34 / 35 | 26.7% | 6.0% | 13 | 0 | 0.64 / 13.1 | 86.9% | +4.1 |
| 5 | 84.2% | 97.1% | 73.5% | 34 / 35 | 21.1% | 10.3% | 11 | 0 | 0.77 / 11.6 | 85.7% | -1.5 |
| 6 | 89.6% | 100.0% | 79.9% | 35 / 35 | 22.1% | 6.5% | 12 | 0 | 0.61 / 14.2 | 82.9% | +6.7 |
| 7 | 85.7% | 100.0% | 73.2% | 35 / 35 | 21.2% | 10.8% | 16 | 0 | 0.70 / 12.0 | 83.4% | +2.3 |
| 8 | 86.8% | 97.1% | 77.2% | 34 / 35 | 20.6% | 7.5% | 10 | 0 | 0.73 / 17.7 | 84.2% | +2.6 |
| 9 | 87.4% | 97.1% | 78.7% | 34 / 35 | 23.3% | 8.4% | 12 | 0 | 0.75 / 10.3 | 83.5% | +3.9 |
| 10 | 85.4% | 97.1% | 74.7% | 34 / 35 | 20.7% | 7.7% | 12 | 0 | 0.71 / 11.8 | 77.1% | +8.3 |
| 11 | 81.3% | 91.4% | 72.1% | 32 / 35 | 20.0% | 8.0% | 9 | 0 | 0.69 / 10.2 | 84.2% | -2.9 |
| 12 | 82.6% | 94.3% | 72.7% | 33 / 35 | 21.7% | 9.7% | 11 | 0 | 0.81 / 11.2 | 83.4% | -0.8 |
| 13 | 76.5% | 85.7% | 68.6% | 30 / 35 | 19.5% | 9.5% | 14 | 0 | 0.84 / 12.2 | 74.1% | +2.4 |
| 14 | 85.3% | 94.3% | 77.3% | 33 / 35 | 21.0% | 7.1% | 16 | 0 | 0.65 / 12.0 | 83.2% | +2.1 |
| 15 | 82.8% | 91.4% | 74.6% | 32 / 35 | 19.2% | 10.8% | 12 | 0 | 0.67 / 13.3 | 87.4% | -4.6 |
| 16 | 79.4% | 91.4% | 69.6% | 32 / 35 | 21.0% | 10.9% | 11 | 0 | 0.78 / 11.9 | 89.6% | -10.2 |

Mean score share 84.0% ± 2.1, baseline 83.2% ± 2.1, paired diff +0.8 ± 2.4.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 193 over 16 battles (12.1 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | weak | 84.0% ± 2.1 | 94.5% ± 2.2 | 74.7% ± 2.3 | 529 / 560 | 21.3% ± 0.9 | 8.6% ± 0.9 | 193 | 0 | 0.86 / 17.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 16 | 14 | 596 | 0 | 0.34 | 0 | 0 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 11788 | 40 | 11750 | 11748 (99.7%) | 40 (0.3%) | 2 (0.0%) | 167 | 200 | 63 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sadoner.killer 0.2 | 11728 | 887 (7.6%) | 4469 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 650 | 290 | 488 | 340 | 60.0 / 20.5 | 6536 | 10626 | 10 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 8.6% | 193 | 90 | 3 | 20.9 | 887 / 887 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| sadoner.killer 0.2 | sadoner.killer | 1 | 35 | 288 | 12.5% | 8.2% ± 2.0 | 17.7% | 23.0% / 21.4% | 4.8% | 0 / 0 | T3/M? | 77% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
