# kc.micro.Needle 0.101 (mid) vs hadur2.Hadur 3.8

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 75.6% | 91.4% | 60.6% | 32 / 35 | 14.8% | 7.6% | 10 | 0 | 1.19 / 16.1 | 77.4% | -1.8 |
| 2 | 76.9% | 91.4% | 62.3% | 32 / 35 | 13.4% | 6.9% | 12 | 0 | 1.17 / 16.9 | 75.2% | +1.8 |
| 3 | 72.4% | 85.7% | 59.5% | 30 / 35 | 14.2% | 7.3% | 9 | 0 | 1.11 / 15.2 | 77.0% | -4.6 |
| 4 | 78.4% | 91.4% | 65.2% | 32 / 35 | 15.0% | 6.4% | 7 | 0 | 1.02 / 15.9 | 78.4% | +0.1 |
| 5 | 73.3% | 88.6% | 57.7% | 31 / 35 | 12.8% | 6.5% | 11 | 0 | 1.19 / 15.3 | 83.0% | -9.7 |
| 6 | 73.2% | 91.4% | 55.2% | 32 / 35 | 12.9% | 7.5% | 14 | 0 | 1.17 / 16.9 | 76.2% | -2.9 |
| 7 | 75.7% | 88.6% | 62.9% | 31 / 35 | 14.7% | 7.1% | 11 | 0 | 1.12 / 16.3 | 78.4% | -2.7 |
| 8 | 73.6% | 88.6% | 59.4% | 31 / 35 | 14.6% | 7.2% | 10 | 0 | 1.16 / 16.0 | 74.6% | -1.0 |
| 9 | 79.5% | 94.3% | 64.4% | 33 / 35 | 14.8% | 6.1% | 9 | 0 | 1.03 / 18.4 | 76.2% | +3.3 |
| 10 | 72.0% | 85.7% | 58.8% | 30 / 35 | 14.5% | 7.0% | 11 | 0 | 1.15 / 16.9 | 79.2% | -7.2 |
| 11 | 71.7% | 82.9% | 60.5% | 29 / 35 | 12.8% | 6.8% | 8 | 0 | 1.07 / 15.1 | 80.2% | -8.5 |
| 12 | 72.8% | 85.7% | 59.7% | 30 / 35 | 14.6% | 7.1% | 13 | 0 | 1.12 / 16.2 | 80.9% | -8.1 |
| 13 | 78.0% | 91.4% | 63.8% | 32 / 35 | 13.5% | 6.2% | 9 | 0 | 1.13 / 15.6 | 74.5% | +3.5 |
| 14 | 83.0% | 97.1% | 67.8% | 34 / 35 | 14.6% | 5.6% | 8 | 0 | 1.02 / 15.4 | 74.9% | +8.1 |
| 15 | 75.7% | 88.6% | 63.1% | 31 / 35 | 15.3% | 7.3% | 10 | 0 | 1.14 / 17.2 | 76.2% | -0.5 |
| 16 | 75.3% | 91.4% | 58.8% | 32 / 35 | 13.6% | 6.7% | 13 | 0 | 1.19 / 17.6 | 78.7% | -3.4 |

Mean score share 75.5% ± 1.7, baseline 77.6% ± 1.3, paired diff -2.1 ± 2.6.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 165 over 16 battles (10.3 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.micro.Needle 0.101 | mid | 75.5% ± 1.7 | 89.6% ± 1.9 | 61.2% ± 1.7 | 502 / 560 | 14.1% ± 0.4 | 6.8% ± 0.3 | 165 | 0 | 1.19 / 18.4 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.micro.Needle 0.101 | 22506 | 23 | 22510 | 22483 (99.9%) | 23 (0.1%) | 27 (0.1%) | 1191 | 295 | 74 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.micro.Needle 0.101 | 26073 | 2154 (8.3%) | 19866 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.micro.Needle 0.101 | 650 | 422 | 503 | 638 | 41.1 / 26.1 | 1651 | 5755 | 28 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.micro.Needle 0.101 | 6.8% | 165 | 9669 | 3 | 40.2 | 2151 / 2154 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.micro.Needle 0.101 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kc.micro.Needle 0.101 | kc.micro.Needle | 1 | 35 | 296 | 7.7% | 7.0% ± 1.4 | 12.6% | 23.8% / 22.8% | 4.5% | 0 / 0 | T2/M1 | 74% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
