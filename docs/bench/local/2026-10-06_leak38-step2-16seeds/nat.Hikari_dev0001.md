# nat.Hikari dev0001 (lower) vs hadur2.Hadur 3.8.1

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 85.5% | 97.1% | 73.2% | 34 / 35 | 15.6% | 6.0% | 11 | 0 | 0.76 / 25.8 | 87.4% | -1.9 |
| 2 | 80.9% | 97.1% | 65.6% | 34 / 35 | 16.1% | 7.4% | 9 | 0 | 0.94 / 15.5 | 84.7% | -3.8 |
| 3 | 83.1% | 97.1% | 69.2% | 34 / 35 | 15.9% | 6.7% | 11 | 0 | 0.89 / 14.4 | 86.4% | -3.3 |
| 4 | 78.5% | 94.3% | 63.9% | 33 / 35 | 15.8% | 7.6% | 16 | 0 | 0.98 / 41.2 | 85.7% | -7.2 |
| 5 | 82.2% | 94.3% | 69.7% | 33 / 35 | 14.9% | 5.7% | 10 | 0 | 0.81 / 14.0 | 83.8% | -1.5 |
| 6 | 77.4% | 88.6% | 66.3% | 31 / 35 | 15.7% | 7.2% | 15 | 0 | 0.95 / 125.6 | 82.6% | -5.2 |
| 7 | 80.9% | 94.3% | 67.9% | 33 / 35 | 16.6% | 6.8% | 12 | 0 | 0.93 / 14.2 | 82.8% | -1.9 |
| 8 | 86.2% | 97.1% | 74.7% | 34 / 35 | 17.1% | 5.7% | 10 | 0 | 0.83 / 44.0 | 74.1% | +12.0 |
| 9 | 80.1% | 94.3% | 65.9% | 33 / 35 | 15.1% | 6.4% | 11 | 0 | 0.98 / 13.8 | 84.1% | -4.0 |
| 10 | 73.5% | 82.9% | 64.0% | 29 / 35 | 15.0% | 6.8% | 12 | 0 | 0.95 / 78.5 | 87.2% | -13.8 |
| 11 | 79.9% | 91.4% | 69.0% | 32 / 35 | 16.2% | 7.4% | 12 | 0 | 0.97 / 140.3 | 81.5% | -1.6 |
| 12 | 85.7% | 100.0% | 71.7% | 35 / 35 | 16.8% | 6.4% | 11 | 0 | 0.83 / 31.7 | 87.8% | -2.1 |
| 13 | 83.4% | 94.3% | 72.2% | 33 / 35 | 16.2% | 5.6% | 14 | 0 | 0.83 / 12.1 | 77.9% | +5.5 |
| 14 | 78.2% | 94.3% | 63.0% | 33 / 35 | 16.0% | 7.4% | 12 | 0 | 0.95 / 17.1 | 80.5% | -2.3 |
| 15 | 76.9% | 88.6% | 65.4% | 31 / 35 | 16.2% | 6.8% | 13 | 0 | 1.00 / 95.6 | 79.4% | -2.4 |
| 16 | 85.5% | 100.0% | 70.8% | 35 / 35 | 15.0% | 6.3% | 10 | 0 | 0.87 / 51.9 | 80.6% | +5.0 |

Mean score share 81.1% ± 2.0, baseline 82.9% ± 2.0, paired diff -1.8 ± 3.0.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.9.5.6, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 16.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 189 over 16 battles (11.8 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | lower | 81.1% ± 2.0 | 94.1% ± 2.4 | 68.3% ± 1.9 | 527 / 560 | 15.9% ± 0.3 | 6.6% ± 0.4 | 189 | 0 | 1.00 / 140.3 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 19080 | 32 | 19083 | 19079 (100.0%) | 1 (0.0%) | 4 (0.0%) | 587 | 290 | 85 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| nat.Hikari dev0001 | 19416 | 1932 (10.0%) | 15170 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 650 | 413 | 564 | 507 | 48.1 / 22.4 | 4379 | 7607 | 5139 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 6.6% | 189 | 714 | 3 | 34.0 | 1931 / 1932 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| nat.Hikari dev0001 | nat.Hikari | 1 | 35 | 280 | 6.7% | 6.0% ± 1.5 | 14.1% | 32.7% / 33.2% | 26.7% | 0 / 0 | T2/M0 | 84% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
