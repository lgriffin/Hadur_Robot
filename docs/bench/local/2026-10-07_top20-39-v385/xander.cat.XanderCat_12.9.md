# xander.cat.XanderCat 12.9 (rumble-9) vs hadur2.Hadur 3.9

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 50.1% | 51.4% | 48.2% | 18 / 35 | 11.5% | 9.2% | 23 | 0 | 1.21 / 14.8 | 60.7% | -10.7 |
| 2 | 53.8% | 62.9% | 45.7% | 22 / 35 | 11.7% | 8.5% | 21 | 0 | 1.27 / 61.9 | 62.6% | -8.8 |
| 3 | 61.4% | 74.3% | 49.8% | 26 / 35 | 11.2% | 8.0% | 19 | 0 | 1.21 / 14.2 | 51.8% | +9.6 |
| 4 | 62.2% | 68.6% | 55.4% | 24 / 35 | 12.3% | 8.7% | 28 | 0 | 1.16 / 47.3 | 58.3% | +3.9 |
| 5 | 61.9% | 68.6% | 54.8% | 24 / 35 | 11.7% | 7.4% | 20 | 0 | 1.17 / 14.1 | 60.5% | +1.3 |
| 6 | 49.9% | 51.4% | 47.9% | 18 / 35 | 11.5% | 9.4% | 21 | 0 | 1.15 / 859.0 | 58.9% | -9.0 |
| 7 | 64.6% | 74.3% | 54.9% | 26 / 35 | 10.8% | 7.5% | 14 | 0 | 1.14 / 18.9 | 61.8% | +2.7 |
| 8 | 59.4% | 65.7% | 53.0% | 23 / 35 | 11.6% | 7.7% | 14 | 0 | 1.14 / 14.0 | 50.1% | +9.4 |
| 9 | 43.8% | 45.7% | 43.4% | 16 / 35 | 11.6% | 9.4% | 19 | 0 | 1.22 / 618.1 | 43.0% | +0.8 |
| 10 | 56.4% | 62.9% | 50.3% | 22 / 35 | 11.6% | 8.4% | 21 | 0 | 1.22 / 13.5 | 52.9% | +3.5 |

Mean score share 56.3% ± 4.8, baseline 56.1% ± 4.5, paired diff +0.3 ± 5.3.

## Full report

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 200 over 10 battles (20.0 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | rumble-9 | 56.3% ± 4.8 | 62.6% ± 7.1 | 50.3% ± 2.9 | 219 / 350 | 11.6% ± 0.3 | 8.4% ± 0.5 | 200 | 0 | 1.27 / 859.0 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 10 | 9 | 298 | 0 | 0.57 | 0 | 0 | 10 |

9 of 10 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 30503 | 10 | 31593 | 30477 (99.9%) | 26 (0.1%) | 1116 (3.5%) | 3354 | 398 | 148 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| xander.cat.XanderCat 12.9 | 39274 | 3222 (8.2%) | 37400 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 650 | 451 | 650 | 1393 | 33.2 / 32.8 | 478 | 3496 | 148 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 8.4% | 200 | 19169 | 3 | 90.0 | 3196 / 3222 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 1 | 35 | 314 | 9.6% | 7.4% ± 1.0 | 11.2% | 23.0% / 22.5% | 8.3% | 0 / 0 | T3/M1 | 56% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
