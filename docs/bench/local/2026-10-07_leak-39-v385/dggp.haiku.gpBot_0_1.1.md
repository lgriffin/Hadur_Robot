# dggp.haiku.gpBot_0 1.1 (weak) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 92.8% | 100.0% | 85.3% | 35 / 35 | 26.3% | 4.7% | 16 | 0 | 0.65 / 8.7 | 86.6% | +6.2 |
| 2 | 91.2% | 97.1% | 85.6% | 34 / 35 | 28.5% | 3.0% | 22 | 0 | 1.11 / 257.7 | 91.0% | +0.1 |
| 3 | 92.7% | 100.0% | 86.3% | 35 / 35 | 30.0% | 5.0% | 21 | 0 | 0.82 / 17.1 | 94.6% | -1.9 |
| 4 | 93.9% | 100.0% | 87.5% | 35 / 35 | 30.2% | 9.1% | 20 | 0 | 1.04 / 195.4 | 92.6% | +1.3 |
| 5 | 93.9% | 100.0% | 88.5% | 35 / 35 | 29.9% | 4.0% | 18 | 0 | 0.81 / 8.7 | 93.1% | +0.8 |
| 6 | 89.5% | 100.0% | 80.0% | 35 / 35 | 28.9% | 7.3% | 22 | 0 | 1.01 / 12.3 | 97.6% | -8.0 |
| 7 | 93.4% | 100.0% | 86.7% | 35 / 35 | 29.4% | 4.3% | 17 | 0 | 0.87 / 308.3 | 90.1% | +3.3 |
| 8 | 94.2% | 100.0% | 88.1% | 35 / 35 | 26.1% | 3.7% | 14 | 0 | 0.94 / 15.2 | 89.9% | +4.3 |
| 9 | 97.4% | 100.0% | 94.5% | 35 / 35 | 28.6% | 1.6% | 20 | 0 | 0.91 / 388.8 | 94.7% | +2.7 |
| 10 | 94.3% | 97.1% | 91.4% | 34 / 35 | 28.1% | 4.7% | 20 | 0 | 0.87 / 15.2 | 88.1% | +6.2 |
| 11 | 93.8% | 100.0% | 87.2% | 35 / 35 | 24.6% | 3.7% | 21 | 0 | 1.00 / 14.9 | 84.9% | +8.9 |
| 12 | 95.0% | 100.0% | 89.5% | 35 / 35 | 26.1% | 4.4% | 22 | 0 | 0.90 / 10.3 | 91.9% | +3.1 |
| 13 | 91.8% | 97.1% | 86.3% | 34 / 35 | 26.8% | 17.7% | 23 | 0 | 0.96 / 10.7 | 91.6% | +0.1 |
| 14 | 93.6% | 97.1% | 90.0% | 34 / 35 | 27.8% | 4.4% | 18 | 0 | 0.81 / 11.1 | 92.5% | +1.1 |
| 15 | 88.6% | 94.3% | 83.0% | 33 / 35 | 26.6% | 8.0% | 18 | 0 | 0.94 / 12.2 | 90.4% | -1.8 |
| 16 | 84.9% | 94.3% | 76.5% | 33 / 35 | 25.6% | 19.4% | 20 | 0 | 0.94 / 17.4 | 96.1% | -11.1 |

Mean score share 92.6% ± 1.6, baseline 91.6% ± 1.8, paired diff +1.0 ± 2.7.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 312 over 16 battles (19.5 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | weak | 92.6% ± 1.6 | 98.6% ± 1.1 | 86.7% ± 2.3 | 552 / 560 | 27.7% ± 0.9 | 6.6% ± 2.7 | 312 | 0 | 1.11 / 388.8 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 16 | 4 | 4253 | 0 | 0.56 | 0 | 0 | 0 |

4 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 7427 | 41 | 7187 | 7180 (96.7%) | 247 (3.3%) | 7 (0.1%) | 928 | 190 | 102 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 8410 | 418 (5.0%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 650 | 400 | 400 | 253 | 60.1 / 9.4 | 5807 | 7309 | 3302 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 6.6% | 312 | 77 | 3 | 12.8 | 404 / 418 (97%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | dggp.haiku.gpBot_0 | 1 | 35 | 304 | 7.8% | 7.9% ± 2.5 | 20.0% | 42.6% / 38.7% | 12.3% | 0 / 0 | T3/M? | 85% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
