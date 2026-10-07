# oog.mega.saguaro.Saguaro 1.0 (rumble-4) vs hadur2.Hadur 3.9

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 77.4% | 88.6% | 67.4% | 31 / 35 | 18.9% | 8.2% | 18 | 0 | 2.11 / 9.6 | 81.4% | -4.0 |
| 2 | 68.2% | 77.1% | 59.9% | 27 / 35 | 18.1% | 6.7% | 10 | 0 | 2.04 / 233.8 | 63.7% | +4.5 |
| 3 | 78.5% | 88.6% | 69.7% | 31 / 35 | 21.8% | 7.5% | 4 | 0 | 1.55 / 83.3 | 68.7% | +9.8 |
| 4 | 70.2% | 82.9% | 58.1% | 29 / 35 | 17.4% | 7.4% | 17 | 0 | 1.88 / 25.0 | 61.6% | +8.5 |
| 5 | 71.8% | 82.9% | 61.2% | 29 / 35 | 17.6% | 6.6% | 11 | 0 | 1.98 / 472.0 | 69.3% | +2.5 |
| 6 | 69.1% | 80.0% | 58.1% | 28 / 35 | 18.0% | 7.0% | 11 | 0 | 2.07 / 1114.1 | 76.1% | -7.0 |
| 7 | 68.6% | 77.1% | 60.4% | 27 / 35 | 17.6% | 6.2% | 5 | 0 | 2.07 / 692.6 | 72.6% | -3.9 |
| 8 | 74.6% | 85.7% | 63.9% | 30 / 35 | 19.4% | 6.8% | 9 | 0 | 2.03 / 102.1 | 66.6% | +8.0 |
| 9 | 71.2% | 80.0% | 62.6% | 28 / 35 | 18.0% | 6.0% | 5 | 0 | 1.96 / 11.5 | 67.6% | +3.6 |
| 10 | 74.6% | 91.4% | 58.5% | 32 / 35 | 18.4% | 6.9% | 11 | 0 | 2.01 / 9.7 | 78.4% | -3.8 |

Mean score share 72.4% ± 2.6, baseline 70.6% ± 4.6, paired diff +1.8 ± 4.3.

## Full report

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 101 over 10 battles (10.1 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | rumble-4 | 72.4% ± 2.6 | 83.4% ± 3.6 | 62.0% ± 2.9 | 292 / 350 | 18.5% ± 0.9 | 6.9% ± 0.5 | 101 | 0 | 2.11 / 1114.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 10 | 9 | 298 | 0 | 0.29 | 0 | 0 | 0 |

9 of 10 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 12062 | 31 | 12042 | 12032 (99.8%) | 30 (0.2%) | 10 (0.1%) | 770 | 201 | 37 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 13483 | 1094 (8.1%) | 13382 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 650 | 451 | 515 | 540 | 44.1 / 26.8 | 1735 | 4323 | 897 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 6.9% | 101 | 3704 | 3 | 34.3 | 1071 / 1094 (98%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | oog.mega.saguaro.Saguaro | 1 | 35 | 328 | 8.5% | 8.0% ± 1.5 | 12.4% | 25.4% / 26.0% | 10.1% | 0 / 0 | T3/M0 | 74% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
