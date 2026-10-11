# dggp.haiku.gpBot_0 1.1 (weak) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 95.7% | 100.0% | 91.0% | 35 / 35 | 27.4% | 2.4% | 15 | 0 | 0.57 / 14.1 | 96.6% | -0.9 |
| 2 | 95.3% | 100.0% | 90.4% | 35 / 35 | 28.4% | 2.6% | 11 | 0 | 0.61 / 13.6 | 93.9% | +1.4 |
| 3 | 97.2% | 100.0% | 94.3% | 35 / 35 | 26.6% | 1.6% | 8 | 0 | 0.67 / 14.8 | 97.2% | +0.0 |
| 4 | 94.7% | 100.0% | 88.7% | 35 / 35 | 24.3% | 3.0% | 10 | 0 | 0.64 / 14.1 | 84.7% | +9.9 |
| 5 | 94.8% | 100.0% | 89.5% | 35 / 35 | 30.1% | 4.0% | 11 | 0 | 0.63 / 8.9 | 94.9% | -0.1 |
| 6 | 93.8% | 100.0% | 87.2% | 35 / 35 | 24.9% | 3.9% | 14 | 0 | 0.65 / 13.0 | 86.2% | +7.6 |
| 7 | 92.7% | 100.0% | 84.1% | 35 / 35 | 20.9% | 3.4% | 13 | 0 | 0.73 / 12.3 | 89.1% | +3.5 |
| 8 | 95.0% | 100.0% | 89.5% | 35 / 35 | 28.0% | 2.9% | 8 | 0 | 0.68 / 14.1 | 91.9% | +3.1 |
| 9 | 95.2% | 100.0% | 89.8% | 35 / 35 | 24.7% | 2.9% | 9 | 0 | 0.69 / 10.2 | 89.4% | +5.8 |
| 10 | 96.5% | 100.0% | 92.7% | 35 / 35 | 29.7% | 2.2% | 11 | 0 | 0.61 / 11.9 | 94.6% | +1.9 |
| 11 | 93.6% | 100.0% | 86.9% | 35 / 35 | 26.0% | 3.6% | 10 | 0 | 0.65 / 12.3 | 93.7% | -0.1 |
| 12 | 93.4% | 100.0% | 86.8% | 35 / 35 | 29.3% | 4.1% | 9 | 0 | 0.65 / 14.2 | 95.7% | -2.2 |
| 13 | 95.3% | 100.0% | 90.2% | 35 / 35 | 28.4% | 2.6% | 11 | 0 | 0.65 / 8.9 | 95.7% | -0.4 |
| 14 | 94.4% | 100.0% | 88.7% | 35 / 35 | 25.2% | 3.3% | 9 | 0 | 0.62 / 10.2 | 88.9% | +5.5 |
| 15 | 96.1% | 100.0% | 91.9% | 35 / 35 | 27.8% | 2.3% | 13 | 0 | 0.62 / 9.2 | 92.9% | +3.2 |
| 16 | 95.2% | 100.0% | 90.4% | 35 / 35 | 28.1% | 3.3% | 13 | 0 | 0.63 / 10.0 | 91.7% | +3.5 |

Mean score share 94.9% ± 0.6, baseline 92.3% ± 2.0, paired diff +2.6 ± 1.8.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 175 over 16 battles (10.9 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | weak | 94.9% ± 0.6 | 100.0% ± 0.0 | 89.5% ± 1.3 | 560 / 560 | 26.9% ± 1.3 | 3.0% ± 0.4 | 175 | 0 | 0.73 / 14.8 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 16 | 14 | 596 | 0 | 0.31 | 0 | 0 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 7535 | 36 | 7502 | 7501 (99.5%) | 34 (0.5%) | 1 (0.0%) | 957 | 194 | 39 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 8516 | 424 (5.0%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 650 | 403 | 400 | 256 | 58.7 / 6.9 | 5848 | 7834 | 3595 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 3.0% | 175 | 80 | 3 | 13.4 | 421 / 424 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| dggp.haiku.gpBot_0 1.1 | dggp.haiku.gpBot_0 | 1 | 35 | 304 | 4.2% | 2.5% ± 1.6 | 21.4% | 35.7% / 31.8% | 11.5% | 0 / 0 | T1/M? | 94% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
