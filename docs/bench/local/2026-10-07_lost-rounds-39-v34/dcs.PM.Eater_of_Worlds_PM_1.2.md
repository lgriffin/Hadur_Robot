# dcs.PM.Eater_of_Worlds_PM 1.2 (weak) vs hadur2.Hadur 3.9

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 77.4% | 91.4% | 63.3% | 32 / 35 | 13.5% | 6.8% | 14 | 0 | 0.85 / 12.3 | 85.2% | -7.8 |
| 2 | 75.8% | 88.6% | 63.1% | 31 / 35 | 14.2% | 6.4% | 12 | 0 | 0.87 / 11.9 | 64.5% | +11.3 |
| 3 | 73.4% | 88.6% | 58.0% | 31 / 35 | 13.2% | 6.7% | 9 | 0 | 0.91 / 17.8 | 80.4% | -7.0 |
| 4 | 79.6% | 94.3% | 64.1% | 33 / 35 | 13.7% | 5.8% | 12 | 0 | 0.88 / 11.9 | 77.6% | +2.0 |
| 5 | 72.5% | 88.6% | 57.2% | 31 / 35 | 13.5% | 7.5% | 8 | 0 | 0.86 / 12.8 | 78.5% | -5.9 |
| 6 | 82.3% | 100.0% | 64.2% | 35 / 35 | 13.6% | 6.5% | 11 | 0 | 0.88 / 12.6 | 81.2% | +1.1 |
| 7 | 78.0% | 91.4% | 63.6% | 32 / 35 | 13.1% | 5.8% | 10 | 0 | 0.84 / 11.9 | 79.2% | -1.2 |
| 8 | 73.9% | 91.4% | 55.3% | 32 / 35 | 12.2% | 6.4% | 9 | 0 | 0.94 / 11.6 | 78.0% | -4.1 |

Mean score share 76.6% ± 2.8, baseline 78.1% ± 5.0, paired diff -1.4 ± 5.3.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 85 over 8 battles (10.6 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dcs.PM.Eater_of_Worlds_PM 1.2 | weak | 76.6% ± 2.8 | 91.8% ± 3.2 | 61.1% ± 3.0 | 257 / 280 | 13.4% ± 0.5 | 6.5% ± 0.5 | 85 | 0 | 0.94 / 17.8 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dcs.PM.Eater_of_Worlds_PM 1.2 | 8 | 6 | 298 | 0 | 0.30 | 1 | 1 | 0 |

6 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dcs.PM.Eater_of_Worlds_PM 1.2 | 9863 | 18 | 9849 | 9844 (99.8%) | 19 (0.2%) | 5 (0.1%) | 359 | 137 | 31 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dcs.PM.Eater_of_Worlds_PM 1.2 | 11322 | 622 (5.5%) | 3485 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dcs.PM.Eater_of_Worlds_PM 1.2 | 650 | 506 | 634 | 567 | 39.9 / 25.4 | 913 | 4740 | 4172 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dcs.PM.Eater_of_Worlds_PM 1.2 | 6.5% | 85 | 59 | 3 | 34.9 | 619 / 622 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dcs.PM.Eater_of_Worlds_PM 1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| dcs.PM.Eater_of_Worlds_PM 1.2 | dcs.PM.Eater_of_Worlds_PM | 1 | 35 | 332 | 7.4% | 7.7% ± 1.5 | 11.7% | 24.3% / 21.8% | 16.7% | 0 / 0 | T3/M1 | 73% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
