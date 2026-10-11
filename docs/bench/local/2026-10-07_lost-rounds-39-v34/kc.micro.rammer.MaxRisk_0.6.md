# kc.micro.rammer.MaxRisk 0.6 (weak) vs hadur2.Hadur 3.9

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 65.8% | 85.7% | 59.7% | 30 / 35 | 69.7% | 50.8% | 10 | 0 | 0.52 / 8.8 | 62.2% | +3.6 |
| 2 | 60.8% | 88.6% | 56.6% | 31 / 35 | 77.8% | 57.8% | 12 | 0 | 0.51 / 8.2 | 59.9% | +0.9 |
| 3 | 70.3% | 97.1% | 60.6% | 34 / 35 | 71.4% | 48.7% | 3 | 0 | 0.54 / 9.2 | 56.5% | +13.8 |
| 4 | 70.8% | 97.1% | 61.6% | 34 / 35 | 69.7% | 46.8% | 13 | 0 | 0.55 / 9.2 | 61.9% | +8.9 |
| 5 | 70.1% | 94.3% | 61.7% | 33 / 35 | 76.0% | 48.7% | 13 | 0 | 0.52 / 8.1 | 62.0% | +8.1 |
| 6 | 66.7% | 91.4% | 58.2% | 32 / 35 | 73.4% | 68.3% | 14 | 0 | 0.52 / 9.2 | 63.3% | +3.4 |
| 7 | 68.2% | 88.6% | 60.6% | 31 / 35 | 68.7% | 58.8% | 7 | 0 | 0.53 / 8.0 | 60.5% | +7.8 |
| 8 | 67.1% | 88.6% | 60.4% | 31 / 35 | 72.7% | 50.5% | 9 | 0 | 0.53 / 8.4 | 59.2% | +8.0 |

Mean score share 67.5% ± 2.7, baseline 60.7% ± 1.8, paired diff +6.8 ± 3.4.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 81 over 8 battles (10.1 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.micro.rammer.MaxRisk 0.6 | weak | 67.5% ± 2.7 | 91.4% ± 3.6 | 59.9% ± 1.4 | 256 / 280 | 72.4% ± 2.7 | 53.8% ± 6.1 | 81 | 0 | 0.55 / 9.2 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.micro.rammer.MaxRisk 0.6 | 8 | 4 | 289 | 0 | 0.29 | 2 | 2 | 0 |

4 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.micro.rammer.MaxRisk 0.6 | 2480 | 18 | 2465 | 2463 (99.3%) | 17 (0.7%) | 2 (0.1%) | 2877 | 324 | 22 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.micro.rammer.MaxRisk 0.6 | 2406 | 214 (8.9%) | 920 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.micro.rammer.MaxRisk 0.6 | 650 | 149 | 650 | 157 | 101.8 / 67.9 | 2148 | 1898 | 111 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.micro.rammer.MaxRisk 0.6 | 53.8% | 81 | 23 | 3 | 8.2 | 214 / 214 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.micro.rammer.MaxRisk 0.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kc.micro.rammer.MaxRisk 0.6 | kc.micro.rammer.MaxRisk | 1 | 35 | 324 | 56.5% | 11.2% ± 3.8 | 46.3% | 12.7% / 11.2% | 7.0% | 0 / 0 | T?/M? | 66% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
