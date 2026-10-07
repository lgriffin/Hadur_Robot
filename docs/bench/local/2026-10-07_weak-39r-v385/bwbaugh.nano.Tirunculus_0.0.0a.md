# bwbaugh.nano.Tirunculus 0.0.0a (nano) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 85.6% | 100.0% | 78.4% | 35 / 35 | 84.3% | 75.6% | 9 | 0 | 0.50 / 8.8 | 83.7% | +1.9 |
| 2 | 85.5% | 100.0% | 77.8% | 35 / 35 | 83.2% | 74.3% | 11 | 0 | 0.49 / 9.7 | 85.3% | +0.2 |
| 3 | 83.7% | 100.0% | 75.8% | 35 / 35 | 84.2% | 79.8% | 8 | 0 | 0.50 / 8.5 | 83.9% | -0.2 |
| 4 | 83.0% | 100.0% | 74.9% | 35 / 35 | 84.5% | 81.9% | 9 | 0 | 0.48 / 8.9 | 86.2% | -3.2 |
| 5 | 84.8% | 100.0% | 77.2% | 35 / 35 | 82.8% | 77.6% | 10 | 0 | 0.50 / 9.0 | 84.6% | +0.2 |
| 6 | 85.3% | 100.0% | 78.1% | 35 / 35 | 85.0% | 73.4% | 12 | 0 | 0.50 / 8.8 | 85.6% | -0.3 |
| 7 | 81.5% | 97.1% | 74.1% | 34 / 35 | 84.1% | 76.9% | 15 | 0 | 0.47 / 8.8 | 85.1% | -3.7 |
| 8 | 86.9% | 100.0% | 80.0% | 35 / 35 | 84.2% | 80.8% | 11 | 0 | 0.49 / 9.3 | 85.3% | +1.6 |
| 9 | 82.7% | 100.0% | 75.0% | 35 / 35 | 83.1% | 76.5% | 10 | 0 | 0.48 / 9.1 | 83.6% | -0.9 |
| 10 | 85.2% | 100.0% | 78.1% | 35 / 35 | 83.6% | 79.6% | 12 | 0 | 0.54 / 8.4 | 85.1% | +0.1 |
| 11 | 85.9% | 100.0% | 78.5% | 35 / 35 | 83.1% | 74.7% | 8 | 0 | 0.47 / 9.0 | 85.4% | +0.5 |
| 12 | 84.4% | 100.0% | 76.4% | 35 / 35 | 82.6% | 78.4% | 11 | 0 | 0.49 / 9.1 | 86.9% | -2.5 |
| 13 | 82.6% | 100.0% | 74.4% | 35 / 35 | 83.5% | 80.0% | 9 | 0 | 0.48 / 8.7 | 85.8% | -3.2 |
| 14 | 85.2% | 100.0% | 77.6% | 35 / 35 | 82.7% | 72.1% | 12 | 0 | 0.49 / 8.9 | 84.7% | +0.5 |
| 15 | 84.4% | 100.0% | 76.5% | 35 / 35 | 84.0% | 79.5% | 8 | 0 | 0.47 / 9.1 | 86.6% | -2.1 |
| 16 | 85.0% | 100.0% | 77.3% | 35 / 35 | 81.5% | 74.8% | 9 | 0 | 0.48 / 8.6 | 83.5% | +1.4 |

Mean score share 84.5% ± 0.8, baseline 85.1% ± 0.6, paired diff -0.6 ± 1.0.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 164 over 16 battles (10.3 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| bwbaugh.nano.Tirunculus 0.0.0a | nano | 84.5% ± 0.8 | 99.8% ± 0.4 | 76.9% ± 0.9 | 559 / 560 | 83.5% ± 0.5 | 77.2% ± 1.5 | 164 | 0 | 0.54 / 9.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 15 | 103 | 0 | 0.29 | 0 | 0 | 0 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| bwbaugh.nano.Tirunculus 0.0.0a | 2846 | 49 | 2841 | 2840 (99.8%) | 6 (0.2%) | 1 (0.0%) | 1025 | 200 | 35 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| bwbaugh.nano.Tirunculus 0.0.0a | 4442 | 80 (1.8%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| bwbaugh.nano.Tirunculus 0.0.0a | 650 | 189 | 650 | 143 | 109.1 / 32.9 | 3772 | 4070 | 288 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| bwbaugh.nano.Tirunculus 0.0.0a | 77.2% | 164 | 47 | 3 | 4.7 | 79 / 80 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| bwbaugh.nano.Tirunculus 0.0.0a | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| bwbaugh.nano.Tirunculus 0.0.0a | bwbaugh.nano.Tirunculus | 1 | 35 | 330 | 89.0% | 8.4% ± 4.3 | 47.5% | 14.5% / 14.6% | 8.0% | 0 / 0 | T?/M? | 82% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
