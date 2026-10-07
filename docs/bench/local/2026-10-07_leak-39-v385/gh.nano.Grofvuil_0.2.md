# gh.nano.Grofvuil 0.2 (weak) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 98.0% | 100.0% | 96.0% | 35 / 35 | 40.2% | 2.2% | 13 | 0 | 0.62 / 9.3 | 98.8% | -0.8 |
| 2 | 98.6% | 100.0% | 97.2% | 35 / 35 | 39.5% | 1.2% | 13 | 0 | 0.59 / 9.0 | 98.2% | +0.4 |
| 3 | 98.8% | 100.0% | 97.6% | 35 / 35 | 42.2% | 0.9% | 9 | 0 | 0.66 / 9.6 | 97.8% | +1.0 |
| 4 | 97.7% | 100.0% | 95.5% | 35 / 35 | 41.7% | 3.0% | 14 | 0 | 0.64 / 8.7 | 98.0% | -0.3 |
| 5 | 98.4% | 100.0% | 96.9% | 35 / 35 | 40.1% | 1.4% | 11 | 0 | 0.65 / 9.6 | 98.4% | -0.0 |
| 6 | 98.2% | 100.0% | 96.5% | 35 / 35 | 44.1% | 2.5% | 14 | 0 | 0.61 / 14.1 | 97.4% | +0.8 |
| 7 | 97.5% | 100.0% | 95.0% | 35 / 35 | 43.5% | 1.9% | 13 | 0 | 0.59 / 9.6 | 98.5% | -1.1 |
| 8 | 98.0% | 100.0% | 96.1% | 35 / 35 | 45.0% | 2.1% | 11 | 0 | 0.66 / 9.7 | 98.3% | -0.4 |
| 9 | 98.9% | 100.0% | 97.9% | 35 / 35 | 39.8% | 1.3% | 11 | 0 | 0.65 / 8.9 | 98.2% | +0.8 |
| 10 | 98.4% | 100.0% | 96.8% | 35 / 35 | 40.8% | 1.6% | 10 | 0 | 0.62 / 8.6 | 99.2% | -0.8 |
| 11 | 98.7% | 100.0% | 97.4% | 35 / 35 | 39.4% | 2.0% | 11 | 0 | 0.60 / 9.6 | 98.4% | +0.3 |
| 12 | 98.1% | 100.0% | 96.3% | 35 / 35 | 43.2% | 1.5% | 12 | 0 | 0.58 / 8.9 | 97.4% | +0.7 |
| 13 | 97.7% | 100.0% | 95.6% | 35 / 35 | 38.7% | 2.1% | 10 | 0 | 0.63 / 8.6 | 98.2% | -0.5 |
| 14 | 98.7% | 100.0% | 97.4% | 35 / 35 | 40.9% | 1.5% | 11 | 0 | 0.59 / 8.1 | 98.8% | -0.1 |
| 15 | 97.5% | 100.0% | 95.1% | 35 / 35 | 39.5% | 2.8% | 10 | 0 | 0.65 / 10.1 | 99.0% | -1.5 |
| 16 | 97.3% | 100.0% | 94.8% | 35 / 35 | 44.8% | 2.7% | 12 | 0 | 0.59 / 8.7 | 97.5% | -0.2 |

Mean score share 98.2% ± 0.3, baseline 98.3% ± 0.3, paired diff -0.1 ± 0.4.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 185 over 16 battles (11.6 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | weak | 98.2% ± 0.3 | 100.0% ± 0.0 | 96.4% ± 0.5 | 560 / 560 | 41.5% ± 1.1 | 1.9% ± 0.3 | 185 | 0 | 0.66 / 14.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 16 | 14 | 596 | 0 | 0.33 | 0 | 0 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 7273 | 50 | 7252 | 7237 (99.5%) | 36 (0.5%) | 15 (0.2%) | 261 | 191 | 43 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 6843 | 530 (7.7%) | 298 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 650 | 353 | 400 | 212 | 75.5 / 2.8 | 4684 | 5419 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 1.9% | 185 | 439 | 3 | 12.9 | 528 / 530 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| gh.nano.Grofvuil 0.2 | gh.nano.Grofvuil | 1 | 35 | 296 | 3.4% | 2.6% ± 1.7 | 29.1% | 48.6% / 49.3% | 7.9% | 0 / 0 | T1/M? | 97% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
