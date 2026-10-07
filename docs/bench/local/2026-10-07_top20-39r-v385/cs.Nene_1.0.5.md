# cs.Nene 1.0.5 (rumble-18) vs hadur2.Hadur 3.9

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 53.0% | 68.6% | 37.0% | 24 / 35 | 9.6% | 7.9% | 16 | 0 | 1.25 / 16.6 | 60.0% | -6.9 |
| 2 | 59.4% | 77.1% | 40.9% | 27 / 35 | 9.8% | 7.6% | 17 | 0 | 1.22 / 176.2 | 58.7% | +0.7 |
| 3 | 48.1% | 60.0% | 37.0% | 21 / 35 | 9.7% | 7.8% | 12 | 0 | 1.28 / 17.6 | 57.5% | -9.4 |
| 4 | 64.0% | 82.9% | 43.5% | 29 / 35 | 10.1% | 7.1% | 16 | 0 | 1.22 / 17.0 | 55.6% | +8.3 |
| 5 | 65.8% | 82.9% | 48.7% | 29 / 35 | 10.4% | 7.7% | 8 | 0 | 1.23 / 16.1 | 51.5% | +14.3 |
| 6 | 62.1% | 80.0% | 42.9% | 28 / 35 | 9.7% | 7.8% | 13 | 0 | 1.24 / 48.9 | 56.2% | +5.9 |
| 7 | 53.4% | 71.4% | 34.6% | 25 / 35 | 8.5% | 8.4% | 11 | 0 | 1.26 / 19.5 | 53.7% | -0.3 |
| 8 | 57.7% | 74.3% | 39.8% | 26 / 35 | 9.3% | 8.1% | 6 | 0 | 1.21 / 16.7 | 53.2% | +4.5 |
| 9 | 57.8% | 74.3% | 40.3% | 26 / 35 | 9.7% | 7.4% | 12 | 0 | 1.24 / 18.3 | 62.2% | -4.3 |
| 10 | 55.4% | 68.6% | 41.0% | 24 / 35 | 9.4% | 6.7% | 16 | 0 | 1.25 / 14.2 | 53.0% | +2.4 |
| 11 | 53.5% | 68.6% | 37.1% | 24 / 35 | 9.3% | 7.3% | 7 | 0 | 1.23 / 19.4 | 52.7% | +0.8 |
| 12 | 63.7% | 82.9% | 43.8% | 29 / 35 | 9.4% | 7.6% | 16 | 0 | 1.24 / 180.0 | 54.7% | +9.0 |
| 13 | 58.6% | 74.3% | 42.6% | 26 / 35 | 9.5% | 7.5% | 13 | 0 | 1.23 / 84.9 | 60.8% | -2.1 |
| 14 | 59.0% | 74.3% | 43.2% | 26 / 35 | 9.9% | 7.3% | 14 | 0 | 1.24 / 17.4 | 55.6% | +3.4 |
| 15 | 55.4% | 71.4% | 39.2% | 25 / 35 | 9.0% | 8.0% | 11 | 0 | 1.26 / 14.6 | 55.9% | -0.4 |
| 16 | 63.0% | 82.9% | 40.5% | 29 / 35 | 9.6% | 7.4% | 10 | 0 | 1.21 / 15.5 | 64.1% | -1.1 |
| 17 | 65.7% | 88.6% | 41.1% | 31 / 35 | 9.6% | 7.6% | 15 | 0 | 1.24 / 18.8 | 58.1% | +7.7 |
| 18 | 57.1% | 71.4% | 42.7% | 25 / 35 | 10.5% | 7.5% | 15 | 0 | 1.25 / 36.1 | 51.0% | +6.1 |
| 19 | 53.0% | 65.7% | 39.9% | 23 / 35 | 9.1% | 7.8% | 14 | 0 | 1.25 / 16.8 | 59.9% | -6.8 |
| 20 | 60.7% | 80.0% | 40.5% | 28 / 35 | 9.2% | 7.5% | 14 | 0 | 1.28 / 19.8 | 59.8% | +0.9 |

Mean score share 58.3% ± 2.3, baseline 56.7% ± 1.7, paired diff +1.6 ± 2.8.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 256 over 20 battles (12.8 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | rumble-18 | 58.3% ± 2.3 | 75.0% ± 3.3 | 40.8% ± 1.5 | 525 / 700 | 9.6% ± 0.2 | 7.6% ± 0.2 | 256 | 0 | 1.28 / 180.0 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 20 | 19 | 298 | 0 | 0.37 | 0 | 0 | 0 |

19 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 38307 | 286 | 38282 | 38278 (99.9%) | 29 (0.1%) | 4 (0.0%) | 2309 | 282 | 160 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| cs.Nene 1.0.5 | 42674 | 4053 (9.5%) | 37422 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 650 | 472 | 650 | 780 | 23.9 / 34.5 | 398 | 26871 | 5971 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 7.6% | 256 | 1673 | 3 | 54.6 | 4025 / 4053 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | cs.Nene | 1 | 35 | 264 | 8.3% | 7.4% ± 1.2 | 9.6% | 24.4% / 22.8% | 8.1% | 0 / 0 | T3/M1 | 60% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
