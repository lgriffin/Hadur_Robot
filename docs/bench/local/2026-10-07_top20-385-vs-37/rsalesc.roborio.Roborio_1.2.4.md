# rsalesc.roborio.Roborio 1.2.4 (rumble-22) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 63.6% | 65.7% | 60.2% | 23 / 35 | 11.0% | 9.2% | 33 | 0 | 1.62 / 21.4 | 58.9% | +4.7 |
| 2 | 65.2% | 62.9% | 65.9% | 22 / 35 | 11.9% | 8.6% | 24 | 0 | 1.57 / 20.8 | 58.4% | +6.9 |
| 3 | 61.3% | 60.0% | 61.3% | 21 / 35 | 11.0% | 9.0% | 24 | 0 | 1.62 / 19.7 | 62.5% | -1.2 |
| 4 | 65.2% | 65.7% | 63.7% | 23 / 35 | 12.3% | 8.8% | 27 | 0 | 1.60 / 20.3 | 58.3% | +6.8 |
| 5 | 61.4% | 57.1% | 63.8% | 20 / 35 | 12.5% | 9.3% | 23 | 0 | 1.57 / 20.5 | 56.8% | +4.6 |
| 6 | 56.7% | 52.9% | 59.5% | 19 / 35 | 10.6% | 9.7% | 27 | 0 | 1.52 / 19.2 | 62.5% | -5.8 |
| 7 | 66.4% | 65.7% | 65.6% | 23 / 35 | 12.3% | 9.2% | 30 | 0 | 1.61 / 19.4 | 54.3% | +12.1 |
| 8 | 64.1% | 68.6% | 59.5% | 24 / 35 | 12.0% | 9.9% | 18 | 0 | 1.61 / 20.5 | 60.8% | +3.3 |
| 9 | 71.6% | 80.0% | 62.1% | 28 / 35 | 11.8% | 9.1% | 27 | 0 | 1.57 / 22.9 | 66.1% | +5.4 |
| 10 | 47.9% | 40.0% | 55.2% | 14 / 35 | 11.6% | 9.4% | 18 | 0 | 1.64 / 21.7 | 52.8% | -4.8 |
| 11 | 63.9% | 62.9% | 63.7% | 22 / 35 | 11.8% | 8.8% | 21 | 0 | 1.53 / 22.4 | 64.9% | -1.0 |
| 12 | 67.2% | 68.6% | 64.4% | 24 / 35 | 11.1% | 8.5% | 25 | 0 | 1.55 / 22.0 | 52.5% | +14.6 |
| 13 | 64.4% | 65.7% | 62.0% | 23 / 35 | 11.5% | 8.8% | 26 | 0 | 1.55 / 21.1 | 52.2% | +12.2 |
| 14 | 65.9% | 62.9% | 67.2% | 22 / 35 | 12.3% | 9.0% | 21 | 0 | 1.48 / 19.6 | 64.2% | +1.8 |
| 15 | 67.2% | 62.9% | 69.3% | 22 / 35 | 12.3% | 8.7% | 23 | 0 | 1.52 / 18.3 | 52.5% | +14.7 |
| 16 | 64.4% | 65.7% | 61.8% | 23 / 35 | 11.6% | 9.3% | 18 | 0 | 1.46 / 20.1 | 60.8% | +3.6 |
| 17 | 51.9% | 45.7% | 56.8% | 16 / 35 | 11.2% | 9.3% | 23 | 0 | 1.49 / 20.4 | 58.7% | -6.8 |
| 18 | 58.5% | 54.3% | 61.1% | 19 / 35 | 12.0% | 8.9% | 20 | 0 | 1.44 / 21.5 | 67.5% | -8.9 |
| 19 | 63.0% | 57.1% | 66.9% | 20 / 35 | 12.8% | 8.7% | 26 | 0 | 1.48 / 18.0 | 56.8% | +6.2 |
| 20 | 60.4% | 60.0% | 59.5% | 21 / 35 | 11.2% | 9.1% | 17 | 0 | 1.44 / 18.1 | 62.2% | -1.8 |

Mean score share 62.5% ± 2.5, baseline 59.2% ± 2.2, paired diff +3.3 ± 3.3.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 471 over 20 battles (23.6 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | rumble-22 | 62.5% ± 2.5 | 61.2% ± 4.0 | 62.5% ± 1.7 | 429 / 700 | 11.7% ± 0.3 | 9.1% ± 0.2 | 471 | 0 | 1.64 / 22.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | 20 | 14 | 0 | 0 | 0.67 | 6 | 6 | 0 |

14 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | 140334 | 32 | 140407 | 140330 (100.0%) | 4 (0.0%) | 77 (0.1%) | 13951 | 1143 | 415 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | 156999 | 15011 (9.6%) | 156849 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | 650 | 503 | 643 | 2649 | 41.6 / 25.0 | 2976 | 33307 | 314 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | 9.1% | 471 | 14970 | 3 | 198.4 | 14999 / 15011 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | rsalesc.roborio.Roborio | 1 | 35 | 328 | 9.4% | 7.6% ± 1.2 | 10.1% | 22.8% / 21.1% | 13.6% | 0 / 0 | T3/M1 | 60% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
