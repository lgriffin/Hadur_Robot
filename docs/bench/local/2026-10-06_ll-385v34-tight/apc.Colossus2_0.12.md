# apc.Colossus2 0.12 (weak) vs hadur2.Hadur 3.8.5

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 38.2% | 25.7% | 43.0% | 9 / 35 | 64.6% | 350.8% | 118 | 0 | 0.34 / 9.9 | 46.3% | -8.1 |
| 2 | 35.9% | 20.6% | 41.6% | 8 / 35 | 66.0% | 298.0% | 126 | 0 | 0.35 / 8.6 | 48.6% | -12.8 |
| 3 | 39.6% | 28.6% | 43.9% | 10 / 35 | 66.5% | 515.6% | 129 | 0 | 0.34 / 8.8 | 51.4% | -11.9 |
| 4 | 34.4% | 17.1% | 41.4% | 6 / 35 | 64.7% | 450.0% | 131 | 0 | 0.33 / 8.2 | 44.1% | -9.7 |
| 5 | 31.2% | 8.6% | 40.4% | 3 / 35 | 64.3% | 328.9% | 128 | 0 | 0.36 / 9.7 | 42.3% | -11.0 |
| 6 | 35.0% | 17.1% | 42.1% | 6 / 35 | 65.2% | 415.8% | 129 | 0 | 0.35 / 9.5 | 40.0% | -5.0 |
| 7 | 34.9% | 17.1% | 42.0% | 6 / 35 | 66.4% | 396.6% | 133 | 0 | 0.34 / 8.1 | 43.6% | -8.7 |
| 8 | 35.3% | 17.1% | 42.6% | 6 / 35 | 62.9% | 441.0% | 151 | 0 | 0.36 / 9.8 | 45.1% | -9.7 |

Mean score share 35.6% ± 2.1, baseline 45.2% ± 3.0, paired diff -9.6 ± 2.0.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1045 over 8 battles (130.6 per battle, most in one battle 151). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| apc.Colossus2 0.12 | weak | 35.6% ± 2.1 | 19.0% ± 5.1 | 42.1% ± 0.9 | 54 / 280 | 65.1% ± 1.0 | 399.6% ± 59.7 | 1045 | 0 | 0.36 / 9.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| apc.Colossus2 0.12 | 8 | 0 | 78123 | 0 | 3.73 | 8 | 6 | 0 |

0 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| apc.Colossus2 0.12 | 5352 | 11 | 492 | 491 (9.2%) | 4861 (90.8%) | 1 (0.2%) | 28 | 39 | 948 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| apc.Colossus2 0.12 | 6935 | 110 (1.6%) | 53 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| apc.Colossus2 0.12 | 650 | 307 | 591 | 367 | 88.6 / 121.6 | 668 | 25 | 2 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| apc.Colossus2 0.12 | 399.6% | 1045 | 13 | 3 | 1.7 | 23 / 110 (21%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| apc.Colossus2 0.12 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| apc.Colossus2 0.12 | apc.Colossus2 | 1 | 35 | 286 | 33.3% | 11.5% ± 13.6 | 33.3% | 26.0% / 26.6% | 8.2% | 0 / 0 | T?/M? | 34% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
