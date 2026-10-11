# aw.Gilgalad 1.99.5c (rumble-12) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 47.5% | 60.0% | 35.5% | 21 / 35 | 8.2% | 10.5% | 35 | 0 | 1.51 / 20.3 | 35.4% | +12.1 |
| 2 | 42.1% | 45.7% | 38.7% | 16 / 35 | 7.8% | 10.4% | 29 | 0 | 1.47 / 19.9 | 48.2% | -6.1 |
| 3 | 36.4% | 40.0% | 33.9% | 14 / 35 | 7.1% | 10.5% | 31 | 0 | 1.51 / 19.9 | 37.5% | -1.1 |
| 4 | 48.8% | 60.0% | 37.8% | 21 / 35 | 8.1% | 9.9% | 33 | 0 | 1.49 / 21.6 | 32.9% | +15.9 |
| 5 | 49.1% | 60.0% | 39.1% | 21 / 35 | 8.8% | 10.2% | 32 | 0 | 1.49 / 19.4 | 42.1% | +7.0 |
| 6 | 51.5% | 65.7% | 37.4% | 23 / 35 | 8.3% | 10.0% | 33 | 0 | 1.53 / 20.5 | 53.2% | -1.7 |
| 7 | 45.8% | 54.3% | 37.5% | 19 / 35 | 8.4% | 10.4% | 30 | 0 | 1.49 / 20.8 | 41.3% | +4.4 |
| 8 | 51.6% | 57.1% | 47.4% | 20 / 35 | 11.5% | 11.4% | 20 | 0 | 1.48 / 17.4 | 38.9% | +12.7 |
| 9 | 57.3% | 67.6% | 47.8% | 24 / 35 | 11.6% | 10.9% | 21 | 0 | 1.50 / 65.3 | 40.2% | +17.1 |
| 10 | 48.9% | 60.0% | 38.4% | 21 / 35 | 7.8% | 9.7% | 29 | 0 | 1.49 / 181.5 | 48.1% | +0.8 |
| 11 | 51.8% | 62.9% | 40.5% | 22 / 35 | 7.7% | 9.7% | 31 | 0 | 1.50 / 19.9 | 44.7% | +7.1 |
| 12 | 46.1% | 54.3% | 38.3% | 19 / 35 | 8.7% | 10.2% | 32 | 0 | 1.45 / 98.0 | 47.9% | -1.8 |
| 13 | 48.6% | 57.1% | 40.8% | 20 / 35 | 9.1% | 10.9% | 27 | 0 | 1.57 / 17.8 | 44.7% | +3.9 |
| 14 | 52.5% | 62.9% | 42.0% | 22 / 35 | 7.5% | 10.0% | 26 | 0 | 1.47 / 20.5 | 40.1% | +12.4 |
| 15 | 47.0% | 51.4% | 43.5% | 18 / 35 | 11.9% | 10.7% | 23 | 0 | 1.49 / 46.1 | 59.6% | -12.6 |
| 16 | 56.5% | 62.9% | 49.9% | 22 / 35 | 11.1% | 9.5% | 17 | 0 | 1.52 / 16.2 | 53.3% | +3.2 |
| 17 | 41.1% | 42.9% | 40.2% | 15 / 35 | 9.7% | 11.4% | 31 | 0 | 1.48 / 20.3 | 49.1% | -8.0 |
| 18 | 50.7% | 57.1% | 45.0% | 20 / 35 | 10.6% | 9.9% | 29 | 0 | 1.48 / 18.0 | 37.4% | +13.2 |
| 19 | 44.6% | 51.4% | 38.4% | 18 / 35 | 9.6% | 10.6% | 31 | 0 | 1.55 / 18.3 | 39.4% | +5.2 |
| 20 | 50.4% | 57.6% | 44.0% | 21 / 35 | 10.5% | 9.9% | 19 | 0 | 1.50 / 19.9 | 45.3% | +5.1 |

Mean score share 48.4% ± 2.3, baseline 44.0% ± 3.2, paired diff +4.4 ± 3.8.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 559 over 20 battles (28.0 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | rumble-12 | 48.4% ± 2.3 | 56.5% ± 3.4 | 40.8% ± 2.0 | 397 / 700 | 9.2% ± 0.7 | 10.3% ± 0.3 | 559 | 0 | 1.57 / 181.5 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 20 | 13 | 0 | 0 | 0.80 | 7 | 7 | 0 |

13 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 94909 | 34 | 95572 | 94893 (100.0%) | 16 (0.0%) | 679 (0.7%) | 7119 | 933 | 559 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| aw.Gilgalad 1.99.5c | 96755 | 9992 (10.3%) | 92122 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 650 | 478 | 650 | 1663 | 25.8 / 37.1 | 812 | 64086 | 238 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 10.3% | 559 | 4868 | 3 | 135.0 | 9976 / 9992 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | aw.Gilgalad | 1 | 35 | 284 | 10.3% | 7.4% ± 0.9 | 11.2% | 22.3% / 22.3% | 5.1% | 0 / 0 | T3/M1 | 49% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
