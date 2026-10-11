# aw.Gilgalad 1.99.5c (rumble-12) vs hadur2.Hadur 3.9

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 51.1% | 54.3% | 47.9% | 19 / 35 | 11.8% | 10.6% | 16 | 0 | 1.48 / 16.2 | 30.9% | +20.2 |
| 2 | 46.7% | 57.1% | 37.1% | 20 / 35 | 7.4% | 10.2% | 26 | 0 | 1.50 / 20.8 | 41.6% | +5.1 |
| 3 | 53.1% | 61.8% | 45.6% | 22 / 35 | 11.6% | 10.1% | 27 | 0 | 1.49 / 16.7 | 44.2% | +8.9 |
| 4 | 47.7% | 57.1% | 39.2% | 20 / 35 | 9.7% | 10.5% | 22 | 0 | 1.48 / 17.9 | 44.1% | +3.6 |
| 5 | 42.6% | 48.6% | 37.9% | 17 / 35 | 10.2% | 10.7% | 21 | 0 | 1.49 / 18.1 | 54.8% | -12.2 |
| 6 | 56.4% | 70.6% | 41.4% | 25 / 35 | 8.4% | 10.5% | 34 | 0 | 1.45 / 20.5 | 48.6% | +7.8 |
| 7 | 50.7% | 57.1% | 44.9% | 20 / 35 | 11.1% | 11.1% | 25 | 0 | 1.47 / 18.5 | 52.3% | -1.6 |
| 8 | 31.5% | 34.3% | 30.1% | 12 / 35 | 7.0% | 10.2% | 20 | 0 | 1.47 / 20.6 | 47.8% | -16.3 |
| 9 | 53.4% | 62.9% | 43.4% | 22 / 35 | 9.6% | 9.7% | 33 | 0 | 1.48 / 18.9 | 45.1% | +8.4 |
| 10 | 46.4% | 55.9% | 38.2% | 20 / 35 | 7.6% | 10.0% | 27 | 0 | 1.49 / 19.6 | 51.5% | -5.1 |
| 11 | 52.7% | 65.7% | 39.6% | 23 / 35 | 9.2% | 10.7% | 22 | 0 | 1.46 / 20.2 | 52.1% | +0.7 |
| 12 | 50.0% | 62.9% | 37.7% | 22 / 35 | 9.5% | 10.2% | 28 | 0 | 1.52 / 20.7 | 51.6% | -1.6 |
| 13 | 51.8% | 60.0% | 44.6% | 21 / 35 | 10.5% | 10.9% | 26 | 0 | 1.46 / 17.6 | 43.9% | +7.9 |
| 14 | 39.3% | 45.7% | 34.1% | 16 / 35 | 7.3% | 10.4% | 33 | 0 | 1.50 / 46.1 | 45.3% | -6.0 |
| 15 | 48.8% | 54.3% | 43.9% | 19 / 35 | 11.1% | 9.8% | 25 | 0 | 1.46 / 17.4 | 51.5% | -2.7 |
| 16 | 40.4% | 48.6% | 33.9% | 17 / 35 | 7.4% | 10.5% | 28 | 0 | 1.47 / 70.7 | 53.9% | -13.5 |
| 17 | 46.2% | 54.3% | 39.2% | 19 / 35 | 9.9% | 11.0% | 33 | 0 | 1.50 / 19.2 | 52.8% | -6.7 |
| 18 | 48.5% | 60.0% | 37.0% | 21 / 35 | 7.9% | 9.8% | 34 | 0 | 1.47 / 19.4 | 43.0% | +5.4 |
| 19 | 48.1% | 57.1% | 39.3% | 20 / 35 | 9.0% | 10.1% | 34 | 0 | 1.49 / 19.3 | 39.5% | +8.6 |
| 20 | 49.0% | 57.1% | 41.1% | 20 / 35 | 7.8% | 9.2% | 30 | 0 | 1.50 / 19.6 | 50.0% | -1.0 |

Mean score share 47.7% ± 2.7, baseline 47.2% ± 2.8, paired diff +0.5 ± 4.2.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 544 over 20 battles (27.2 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | rumble-12 | 47.7% ± 2.7 | 56.3% ± 3.7 | 39.8% ± 2.1 | 395 / 700 | 9.2% ± 0.7 | 10.3% ± 0.2 | 544 | 0 | 1.52 / 70.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 20 | 14 | 0 | 0 | 0.78 | 6 | 6 | 0 |

14 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 93901 | 39 | 94659 | 93886 (100.0%) | 15 (0.0%) | 773 (0.8%) | 7227 | 919 | 525 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| aw.Gilgalad 1.99.5c | 96388 | 10008 (10.4%) | 92810 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 650 | 478 | 650 | 1652 | 24.8 / 37.2 | 1045 | 70252 | 146 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 10.3% | 544 | 19327 | 3 | 134.3 | 9990 / 10008 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | aw.Gilgalad | 1 | 35 | 284 | 9.9% | 7.8% ± 1.0 | 8.9% | 21.1% / 21.8% | 3.6% | 0 / 0 | T3/M1 | 49% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
