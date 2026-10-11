# dcs.Eater_of_Worlds_Mini 1.0 (weak) vs hadur2.Hadur 3.7

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 67.0% | 88.2% | 52.1% | 31 / 35 | 22.6% | 204.6% | 126 | 0 | 0.26 / 10.7 | 62.0% | +5.0 |
| 2 | 66.6% | 80.0% | 57.1% | 28 / 35 | 25.6% | 130.5% | 128 | 0 | 0.29 / 8.6 | 68.7% | -2.0 |
| 3 | 70.7% | 91.4% | 55.0% | 32 / 35 | 24.2% | 159.3% | 123 | 0 | 0.28 / 9.6 | 72.1% | -1.4 |
| 4 | 69.0% | 88.6% | 55.2% | 31 / 35 | 26.6% | 133.9% | 132 | 0 | 0.27 / 8.1 | 67.2% | +1.8 |
| 5 | 61.6% | 82.9% | 48.3% | 29 / 35 | 24.2% | 262.1% | 129 | 0 | 0.26 / 8.6 | 66.7% | -5.1 |
| 6 | 72.0% | 97.1% | 53.2% | 34 / 35 | 22.6% | 150.6% | 122 | 0 | 0.28 / 9.7 | 64.9% | +7.1 |
| 7 | 71.0% | 91.4% | 55.1% | 32 / 35 | 23.0% | 155.6% | 126 | 0 | 0.27 / 9.4 | 66.6% | +4.4 |
| 8 | 67.5% | 88.6% | 52.8% | 31 / 35 | 24.9% | 193.8% | 126 | 0 | 0.29 / 8.4 | 65.5% | +2.0 |

Mean score share 68.2% ± 2.8, baseline 66.7% ± 2.5, paired diff +1.5 ± 3.4.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1012 over 8 battles (126.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dcs.Eater_of_Worlds_Mini 1.0 | weak | 68.2% ± 2.8 | 88.5% ± 4.4 | 53.6% ± 2.3 | 248 / 280 | 24.2% ± 1.2 | 173.8% ± 37.0 | 1012 | 0 | 0.29 / 10.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dcs.Eater_of_Worlds_Mini 1.0 | 8 | 0 | 148759 | 0 | 3.61 | 0 | 0 | 0 |

0 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dcs.Eater_of_Worlds_Mini 1.0 | 9937 | 163 | 996 | 994 (10.0%) | 8943 (90.0%) | 2 (0.2%) | 0 | 23 | 966 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dcs.Eater_of_Worlds_Mini 1.0 | 12360 | 363 (2.9%) | 19 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dcs.Eater_of_Worlds_Mini 1.0 | 650 | 362 | 400 | 614 | 50.9 / 44.3 | 293 | 0 | 17 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dcs.Eater_of_Worlds_Mini 1.0 | 173.8% | 1012 | 12 | 3 | 3.6 | 27 / 363 (7%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dcs.Eater_of_Worlds_Mini 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
