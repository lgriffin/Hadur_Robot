# kinsen.nano.Quarrelet 1.0 (weak) vs hadur2.Hadur 3.8.5

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 39.4% | 51.4% | 31.8% | 18 / 35 | 14.1% | 79.5% | 157 | 0 | 0.37 / 8.9 | 37.4% | +1.9 |
| 2 | 48.4% | 68.6% | 32.5% | 24 / 35 | 14.7% | 98.4% | 144 | 0 | 0.37 / 9.0 | 38.6% | +9.8 |
| 3 | 46.4% | 65.7% | 31.7% | 23 / 35 | 15.0% | 94.4% | 155 | 0 | 0.37 / 8.3 | 35.5% | +10.9 |
| 4 | 39.2% | 48.6% | 32.8% | 17 / 35 | 16.7% | 88.2% | 139 | 0 | 0.37 / 8.5 | 38.0% | +1.3 |
| 5 | 35.4% | 42.9% | 31.6% | 15 / 35 | 15.6% | 95.7% | 140 | 0 | 0.36 / 9.1 | 43.5% | -8.1 |
| 6 | 38.5% | 51.4% | 30.7% | 18 / 35 | 15.3% | 116.5% | 141 | 0 | 0.38 / 7.7 | 33.7% | +4.7 |
| 7 | 40.9% | 51.4% | 34.2% | 18 / 35 | 16.2% | 71.2% | 139 | 0 | 0.37 / 8.1 | 36.8% | +4.2 |
| 8 | 37.7% | 45.7% | 33.5% | 16 / 35 | 14.3% | 90.8% | 147 | 0 | 0.37 / 11.6 | 28.5% | +9.2 |

Mean score share 40.7% ± 3.7, baseline 36.5% ± 3.6, paired diff +4.2 ± 5.2.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1162 over 8 battles (145.3 per battle, most in one battle 157). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | weak | 40.7% ± 3.7 | 53.2% ± 7.7 | 32.3% ± 1.0 | 149 / 280 | 15.2% ± 0.8 | 91.8% ± 11.2 | 1162 | 0 | 0.38 / 11.6 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 8 | 0 | 100574 | 0 | 4.15 | 5 | 5 | 0 |

0 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 7706 | 122 | 1444 | 1423 (18.5%) | 6283 (81.5%) | 21 (1.5%) | 161 | 27 | 1423 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 9257 | 449 (4.9%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 650 | 403 | 619 | 476 | 26.1 / 54.5 | 315 | 661 | 373 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 91.8% | 1162 | 11 | 3 | 5.0 | 48 / 449 (11%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kinsen.nano.Quarrelet 1.0 | kinsen.nano.Quarrelet | 1 | 35 | 316 | 5.5% | 5.1% ± 5.3 | 10.8% | 32.1% / 21.1% | 6.7% | 0 / 0 | T?/M? | 49% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
