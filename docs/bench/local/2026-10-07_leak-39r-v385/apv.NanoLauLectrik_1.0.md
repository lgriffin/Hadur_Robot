# apv.NanoLauLectrik 1.0 (lower) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 75.1% | 91.4% | 57.9% | 32 / 35 | 14.7% | 6.0% | 11 | 0 | 1.00 / 11.5 | 83.5% | -8.4 |
| 2 | 73.5% | 88.6% | 57.7% | 31 / 35 | 14.4% | 6.2% | 9 | 0 | 0.96 / 17.0 | 82.0% | -8.5 |
| 3 | 76.5% | 91.4% | 61.2% | 32 / 35 | 14.9% | 6.0% | 8 | 0 | 0.99 / 15.5 | 87.2% | -10.8 |
| 4 | 78.3% | 91.4% | 64.1% | 32 / 35 | 15.6% | 5.4% | 14 | 0 | 0.91 / 15.5 | 80.8% | -2.5 |
| 5 | 82.2% | 100.0% | 64.1% | 35 / 35 | 16.6% | 6.2% | 11 | 0 | 0.96 / 13.0 | 79.9% | +2.3 |
| 6 | 83.8% | 97.1% | 68.9% | 34 / 35 | 16.0% | 4.8% | 10 | 0 | 0.95 / 11.6 | 77.1% | +6.8 |
| 7 | 76.6% | 91.4% | 61.0% | 32 / 35 | 15.6% | 14.3% | 16 | 0 | 0.94 / 11.8 | 80.9% | -4.3 |
| 8 | 78.4% | 91.4% | 65.1% | 32 / 35 | 16.3% | 5.6% | 9 | 0 | 0.96 / 11.4 | 83.3% | -4.9 |
| 9 | 79.9% | 94.3% | 64.2% | 33 / 35 | 14.9% | 5.1% | 9 | 0 | 0.97 / 11.8 | 82.7% | -2.8 |
| 10 | 80.0% | 91.4% | 66.8% | 32 / 35 | 16.3% | 4.8% | 10 | 0 | 0.92 / 15.6 | 82.5% | -2.5 |
| 11 | 81.0% | 97.1% | 62.5% | 34 / 35 | 13.9% | 5.5% | 10 | 0 | 0.95 / 16.5 | 83.3% | -2.3 |
| 12 | 79.4% | 94.3% | 64.5% | 33 / 35 | 17.3% | 9.1% | 11 | 0 | 0.92 / 15.3 | 90.6% | -11.2 |
| 13 | 87.1% | 100.0% | 72.6% | 35 / 35 | 16.7% | 4.8% | 8 | 0 | 0.90 / 13.1 | 84.1% | +3.1 |
| 14 | 86.2% | 100.0% | 69.8% | 35 / 35 | 14.9% | 4.6% | 10 | 0 | 0.94 / 16.3 | 83.3% | +2.9 |
| 15 | 81.1% | 97.1% | 64.1% | 34 / 35 | 16.1% | 6.3% | 11 | 0 | 0.91 / 14.5 | 79.8% | +1.3 |
| 16 | 85.0% | 97.1% | 70.5% | 34 / 35 | 15.5% | 4.1% | 6 | 0 | 0.76 / 16.3 | 76.1% | +9.0 |

Mean score share 80.3% ± 2.1, baseline 82.3% ± 1.9, paired diff -2.1 ± 3.2.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 163 over 16 battles (10.2 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | lower | 80.3% ± 2.1 | 94.6% ± 2.0 | 64.7% ± 2.3 | 530 / 560 | 15.6% ± 0.5 | 6.2% ± 1.3 | 163 | 0 | 1.00 / 17.0 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 16 | 12 | 1440 | 0 | 0.29 | 1 | 1 | 0 |

12 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 12602 | 32 | 12536 | 12505 (99.2%) | 97 (0.8%) | 31 (0.2%) | 1178 | 236 | 65 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 14844 | 1042 (7.0%) | 3946 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 650 | 469 | 483 | 394 | 39.7 / 21.7 | 2989 | 11244 | 6835 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 6.2% | 163 | 1323 | 3 | 22.3 | 1034 / 1042 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrik 1.0 | apv.NanoLauLectrik | 1 | 35 | 304 | 5.2% | 5.9% ± 1.8 | 14.6% | 33.0% / 31.1% | 10.5% | 0 / 0 | T2/M? | 84% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
