# kc.mega.BeepBoop 2.0 (rumble-1) vs hadur2.Hadur 3.9

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 15.4% | 0.0% | 37.3% | 0 / 35 | 4.5% | 9.0% | 14 | 0 | 1.90 / 60.1 | 34.7% | -19.4 |
| 2 | 31.0% | 22.9% | 42.5% | 8 / 35 | 4.7% | 8.7% | 19 | 0 | 1.96 / 43.4 | 31.0% | -0.0 |
| 3 | 20.1% | 8.6% | 36.9% | 3 / 35 | 4.3% | 8.7% | 14 | 0 | 1.88 / 61.9 | 28.6% | -8.5 |
| 4 | 27.4% | 14.7% | 42.9% | 6 / 35 | 5.1% | 8.9% | 26 | 0 | 2.04 / 43.7 | 23.3% | +4.1 |
| 5 | 27.7% | 14.3% | 46.3% | 5 / 35 | 5.0% | 8.1% | 23 | 0 | 1.96 / 63.3 | 20.9% | +6.8 |
| 6 | 26.1% | 14.3% | 42.5% | 5 / 35 | 5.2% | 9.4% | 25 | 0 | 1.92 / 46.0 | 23.1% | +3.0 |
| 7 | 21.5% | 8.6% | 39.8% | 3 / 35 | 4.7% | 9.5% | 21 | 0 | 1.82 / 62.1 | 26.6% | -5.1 |
| 8 | 18.6% | 5.7% | 37.6% | 2 / 35 | 4.8% | 8.5% | 17 | 0 | 1.90 / 44.1 | 26.3% | -7.6 |
| 9 | 19.6% | 5.7% | 39.8% | 2 / 35 | 4.3% | 8.0% | 17 | 0 | 1.89 / 60.6 | 18.4% | +1.2 |
| 10 | 24.4% | 14.3% | 38.6% | 5 / 35 | 4.6% | 9.1% | 22 | 0 | 2.03 / 43.5 | 17.8% | +6.6 |
| 11 | 21.2% | 8.6% | 38.5% | 3 / 35 | 4.2% | 9.4% | 23 | 0 | 1.85 / 58.1 | 19.5% | +1.7 |
| 12 | 33.7% | 22.9% | 48.1% | 8 / 35 | 5.7% | 8.9% | 15 | 0 | 1.97 / 44.8 | 28.1% | +5.6 |
| 13 | 17.4% | 2.9% | 38.7% | 1 / 35 | 4.3% | 7.8% | 21 | 0 | 1.82 / 247.7 | 23.7% | -6.3 |
| 14 | 27.9% | 17.1% | 42.4% | 6 / 35 | 4.6% | 8.7% | 32 | 0 | 1.94 / 43.9 | 25.1% | +2.8 |
| 15 | 23.1% | 11.4% | 41.0% | 4 / 35 | 4.6% | 7.9% | 17 | 0 | 1.89 / 339.8 | 24.7% | -1.5 |
| 16 | 22.9% | 8.6% | 42.5% | 3 / 35 | 5.9% | 9.1% | 25 | 0 | 2.00 / 55.7 | 24.8% | -1.9 |
| 17 | 27.6% | 14.3% | 43.9% | 5 / 35 | 6.1% | 10.3% | 28 | 0 | 1.98 / 220.1 | 27.1% | +0.5 |
| 18 | 19.8% | 5.7% | 40.4% | 2 / 35 | 4.8% | 8.6% | 19 | 0 | 1.85 / 43.8 | 21.9% | -2.1 |
| 19 | 18.0% | 5.7% | 36.0% | 2 / 35 | 4.6% | 9.6% | 20 | 0 | 1.87 / 46.4 | 22.8% | -4.7 |
| 20 | 28.3% | 20.0% | 39.5% | 7 / 35 | 4.6% | 9.5% | 27 | 0 | 1.92 / 45.0 | 22.0% | +6.3 |

Mean score share 23.6% ± 2.3, baseline 24.5% ± 2.0, paired diff -0.9 ± 3.0.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 425 over 20 battles (21.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 23.6% ± 2.3 | 11.3% ± 3.0 | 40.8% ± 1.5 | 80 / 700 | 4.8% ± 0.2 | 8.9% ± 0.3 | 425 | 0 | 2.04 / 339.8 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 20 | 20 | 0 | 0 | 0.61 | 0 | 0 | 0 |

20 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 96295 | 1294 | 100639 | 96262 (100.0%) | 33 (0.0%) | 4377 (4.3%) | 4012 | 630 | 381 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 95793 | 10373 (10.8%) | 91324 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 536 | 650 | 1662 | 19.0 / 27.6 | 1 | 2027 | 286 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 8.9% | 425 | 629 | 3 | 142.7 | 10349 / 10373 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | kc.mega.BeepBoop | 1 | 35 | 296 | 9.7% | 7.8% ± 1.0 | 5.7% | 20.8% / 20.4% | 0.2% | 0 / 0 | T3/M1 | 28% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
