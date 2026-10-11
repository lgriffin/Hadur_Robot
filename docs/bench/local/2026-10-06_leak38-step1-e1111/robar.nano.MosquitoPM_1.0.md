# robar.nano.MosquitoPM 1.0 (lower) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 80.8% | 94.3% | 67.8% | 33 / 35 | 19.4% | 6.8% | 12 | 0 | 0.92 / 14.4 | 81.5% | -0.7 |
| 2 | 82.6% | 94.3% | 70.7% | 33 / 35 | 20.0% | 6.2% | 10 | 0 | 0.94 / 15.0 | 88.4% | -5.8 |
| 3 | 86.7% | 97.1% | 75.2% | 34 / 35 | 19.1% | 5.3% | 11 | 0 | 0.79 / 14.9 | 82.2% | +4.4 |
| 4 | 83.9% | 100.0% | 68.0% | 35 / 35 | 19.4% | 7.4% | 11 | 0 | 0.91 / 13.7 | 80.1% | +3.8 |
| 5 | 76.8% | 91.4% | 63.1% | 32 / 35 | 17.7% | 7.5% | 11 | 0 | 0.97 / 14.8 | 80.2% | -3.4 |
| 6 | 86.3% | 100.0% | 72.0% | 35 / 35 | 18.2% | 5.9% | 14 | 0 | 0.92 / 16.6 | 79.8% | +6.4 |
| 7 | 86.0% | 97.1% | 74.9% | 34 / 35 | 20.1% | 6.6% | 15 | 0 | 0.89 / 15.1 | 80.2% | +5.8 |
| 8 | 82.2% | 94.3% | 70.3% | 33 / 35 | 19.9% | 6.8% | 10 | 0 | 0.84 / 16.3 | 84.0% | -1.8 |
| 9 | 84.0% | 97.1% | 69.4% | 34 / 35 | 17.0% | 5.6% | 9 | 0 | 0.90 / 14.3 | 83.8% | +0.3 |
| 10 | 86.1% | 100.0% | 70.6% | 35 / 35 | 17.9% | 5.2% | 11 | 0 | 0.90 / 12.5 | 80.0% | +6.1 |
| 11 | 81.7% | 94.3% | 68.8% | 33 / 35 | 18.8% | 5.9% | 7 | 0 | 0.91 / 15.7 | 85.8% | -4.1 |
| 12 | 83.3% | 97.1% | 68.8% | 34 / 35 | 16.8% | 6.3% | 11 | 0 | 0.91 / 15.5 | 81.3% | +2.0 |
| 13 | 84.1% | 100.0% | 67.8% | 35 / 35 | 17.5% | 6.4% | 12 | 0 | 0.89 / 15.3 | 82.6% | +1.6 |
| 14 | 75.1% | 88.6% | 62.8% | 31 / 35 | 19.0% | 8.8% | 9 | 0 | 0.94 / 15.6 | 83.3% | -8.2 |
| 15 | 85.5% | 97.1% | 73.2% | 34 / 35 | 18.2% | 5.9% | 15 | 0 | 0.86 / 14.8 | 85.4% | +0.0 |
| 16 | 84.5% | 97.1% | 71.4% | 34 / 35 | 19.0% | 6.0% | 10 | 0 | 0.86 / 13.1 | 80.0% | +4.4 |

Mean score share 83.1% ± 1.7, baseline 82.4% ± 1.4, paired diff +0.7 ± 2.4.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 178 over 16 battles (11.1 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | lower | 83.1% ± 1.7 | 96.3% ± 1.7 | 69.7% ± 1.9 | 539 / 560 | 18.6% ± 0.6 | 6.4% ± 0.5 | 178 | 0 | 0.97 / 16.6 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 12913 | 27 | 12951 | 12893 (99.8%) | 20 (0.2%) | 58 (0.4%) | 1647 | 262 | 64 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 13945 | 915 (6.6%) | 3891 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 650 | 463 | 434 | 380 | 47.2 / 20.7 | 5342 | 9381 | 5181 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 6.4% | 178 | 414 | 3 | 23.1 | 914 / 915 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| robar.nano.MosquitoPM 1.0 | robar.nano.MosquitoPM | 1 | 35 | 316 | 7.2% | 7.6% ± 2.0 | 16.1% | 35.0% / 36.3% | 16.0% | 0 / 0 | T3/M? | 83% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
