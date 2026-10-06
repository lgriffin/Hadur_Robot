# yk.JahMicro 1.0 (weak) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 92.5% | 97.1% | 88.5% | 34 / 35 | 21.1% | 9.3% | 16 | 0 | 0.91 / 17.6 | 89.7% | +2.8 |
| 2 | 92.2% | 97.1% | 87.8% | 34 / 35 | 19.0% | 8.5% | 16 | 0 | 0.91 / 14.4 | 86.7% | +5.4 |
| 3 | 87.9% | 88.6% | 85.6% | 31 / 35 | 17.9% | 8.3% | 17 | 0 | 0.90 / 28.2 | 88.1% | -0.3 |
| 4 | 94.5% | 100.0% | 89.8% | 35 / 35 | 20.1% | 7.0% | 13 | 0 | 0.80 / 16.8 | 89.6% | +5.0 |
| 5 | 93.4% | 97.1% | 89.8% | 34 / 35 | 19.9% | 8.1% | 13 | 0 | 0.80 / 15.3 | 91.4% | +2.0 |
| 6 | 96.2% | 100.0% | 92.7% | 35 / 35 | 18.4% | 5.0% | 14 | 0 | 0.80 / 22.5 | 94.0% | +2.2 |
| 7 | 92.2% | 94.3% | 90.0% | 33 / 35 | 21.6% | 5.1% | 10 | 0 | 0.84 / 31.4 | 88.0% | +4.2 |
| 8 | 88.5% | 88.6% | 86.9% | 31 / 35 | 20.2% | 8.3% | 13 | 0 | 0.92 / 16.6 | 91.7% | -3.2 |
| 9 | 90.1% | 88.6% | 90.0% | 31 / 35 | 22.7% | 7.2% | 5 | 0 | 0.84 / 18.0 | 94.5% | -4.3 |
| 10 | 90.4% | 94.3% | 86.5% | 33 / 35 | 20.5% | 9.6% | 15 | 0 | 0.83 / 18.1 | 95.0% | -4.6 |
| 11 | 91.2% | 97.1% | 85.9% | 34 / 35 | 18.3% | 11.2% | 13 | 0 | 0.92 / 44.6 | 88.7% | +2.5 |
| 12 | 91.7% | 94.3% | 89.0% | 33 / 35 | 20.5% | 7.4% | 16 | 0 | 0.80 / 16.8 | 88.9% | +2.8 |
| 13 | 93.2% | 97.1% | 89.4% | 34 / 35 | 20.3% | 7.1% | 13 | 0 | 0.79 / 15.0 | 92.3% | +0.9 |
| 14 | 93.2% | 97.1% | 89.4% | 34 / 35 | 21.5% | 6.8% | 13 | 0 | 0.80 / 72.5 | 92.7% | +0.6 |
| 15 | 92.8% | 94.3% | 90.7% | 33 / 35 | 18.9% | 6.5% | 14 | 0 | 0.85 / 118.3 | 93.4% | -0.6 |
| 16 | 89.7% | 91.4% | 87.3% | 32 / 35 | 17.9% | 8.5% | 15 | 0 | 0.92 / 16.6 | 86.6% | +3.1 |

Mean score share 91.9% ± 1.2, baseline 90.7% ± 1.5, paired diff +1.2 ± 1.6.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 216 over 16 battles (13.5 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | weak | 91.9% ± 1.2 | 94.8% ± 2.0 | 88.7% ± 1.0 | 531 / 560 | 19.9% ± 0.8 | 7.7% ± 0.8 | 216 | 0 | 0.92 / 118.3 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | 13581 | 16 | 13567 | 13511 (99.5%) | 70 (0.5%) | 56 (0.4%) | 825 | 203 | 84 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| yk.JahMicro 1.0 | 18950 | 1094 (5.8%) | 4341 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | 650 | 455 | 427 | 528 | 76.4 / 9.7 | 11384 | 3017 | 80 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | 7.7% | 216 | 262 | 3 | 24.0 | 1093 / 1094 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | yk.JahMicro | 1 | 35 | 276 | 9.1% | 7.8% ± 1.8 | 15.3% | 33.7% / 30.8% | 2.9% | 0 / 0 | T3/M0 | 89% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
