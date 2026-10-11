# marcinek.TopGun 1.3 (weak) vs hadur2.Hadur 3.8.5

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 68.8% | 71.4% | 66.5% | 25 / 35 | 19.1% | 17.6% | 12 | 0 | 0.82 / 12.8 | 96.4% | -27.7 |
| 2 | 84.6% | 91.4% | 78.4% | 32 / 35 | 24.0% | 8.5% | 4 | 0 | 0.69 / 9.6 | 93.3% | -8.8 |
| 3 | 62.7% | 62.9% | 62.5% | 22 / 35 | 19.7% | 14.6% | 5 | 0 | 0.83 / 11.6 | 96.1% | -33.4 |
| 4 | 75.8% | 82.9% | 69.7% | 29 / 35 | 21.2% | 12.0% | 13 | 0 | 0.79 / 12.7 | 94.3% | -18.5 |
| 5 | 69.9% | 74.3% | 66.3% | 26 / 35 | 19.7% | 12.6% | 10 | 0 | 0.81 / 12.0 | 95.8% | -25.9 |
| 6 | 73.7% | 80.0% | 67.9% | 28 / 35 | 18.9% | 11.2% | 14 | 0 | 0.77 / 11.2 | 95.4% | -21.8 |
| 7 | 63.6% | 68.6% | 59.4% | 24 / 35 | 20.2% | 21.0% | 22 | 0 | 0.88 / 12.1 | 97.4% | -33.8 |
| 8 | 62.1% | 62.9% | 61.0% | 22 / 35 | 19.5% | 14.9% | 6 | 0 | 0.90 / 12.6 | 94.4% | -32.3 |

Mean score share 70.1% ± 6.4, baseline 95.4% ± 1.1, paired diff -25.2 ± 7.2.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 86 over 8 battles (10.8 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | weak | 70.1% ± 6.4 | 74.3% ± 8.4 | 66.5% ± 5.0 | 208 / 280 | 20.3% ± 1.4 | 14.0% ± 3.3 | 86 | 0 | 0.90 / 12.8 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | 8 | 1 | 1085 | 0 | 0.31 | 5 | 5 | 0 |

1 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | 7030 | 19 | 6973 | 6926 (98.5%) | 104 (1.5%) | 47 (0.7%) | 916 | 183 | 43 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| marcinek.TopGun 1.3 | 6549 | 413 (6.3%) | 2562 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | 650 | 440 | 619 | 381 | 59.3 / 30.5 | 4262 | 2847 | 880 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | 14.0% | 86 | 126 | 3 | 24.3 | 407 / 413 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | marcinek.TopGun | 1 | 35 | 292 | 17.4% | 14.1% ± 2.3 | 16.7% | 34.9% / 31.0% | 6.2% | 0 / 0 | T3/M? | 61% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
