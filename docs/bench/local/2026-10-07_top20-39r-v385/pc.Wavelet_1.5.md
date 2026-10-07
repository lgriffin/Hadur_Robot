# pc.Wavelet 1.5 (rumble-13) vs hadur2.Hadur 3.9

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 46.3% | 40.0% | 54.3% | 14 / 35 | 9.8% | 8.6% | 15 | 0 | 1.73 / 81.7 | 46.6% | -0.2 |
| 2 | 38.3% | 31.4% | 47.2% | 11 / 35 | 9.3% | 10.3% | 9 | 0 | 1.82 / 26.2 | 37.0% | +1.4 |
| 3 | 41.8% | 34.3% | 50.9% | 12 / 35 | 9.6% | 10.0% | 20 | 0 | 1.81 / 18.5 | 56.2% | -14.4 |
| 4 | 54.8% | 60.0% | 50.5% | 21 / 35 | 10.5% | 8.2% | 19 | 0 | 1.68 / 17.8 | 48.7% | +6.2 |
| 5 | 51.9% | 57.1% | 47.2% | 20 / 35 | 10.9% | 8.2% | 18 | 0 | 1.73 / 20.9 | 40.6% | +11.2 |
| 6 | 57.5% | 68.6% | 47.2% | 24 / 35 | 10.9% | 9.2% | 17 | 0 | 1.74 / 226.9 | 48.1% | +9.4 |
| 7 | 51.9% | 57.1% | 47.5% | 20 / 35 | 10.0% | 8.3% | 10 | 0 | 1.73 / 18.5 | 46.7% | +5.2 |
| 8 | 49.7% | 51.4% | 48.6% | 18 / 35 | 9.8% | 8.8% | 12 | 0 | 1.58 / 18.1 | 48.7% | +1.0 |
| 9 | 48.5% | 48.6% | 48.7% | 17 / 35 | 10.3% | 8.8% | 11 | 0 | 1.68 / 19.1 | 50.7% | -2.3 |
| 10 | 43.8% | 37.1% | 52.2% | 13 / 35 | 10.9% | 8.5% | 10 | 0 | 1.83 / 25.4 | 60.0% | -16.2 |
| 11 | 63.2% | 68.6% | 57.0% | 24 / 35 | 11.7% | 7.8% | 18 | 0 | 1.74 / 19.5 | 55.9% | +7.4 |
| 12 | 45.0% | 37.1% | 54.8% | 13 / 35 | 9.8% | 8.7% | 21 | 0 | 1.77 / 19.0 | 50.5% | -5.5 |
| 13 | 48.7% | 54.3% | 44.7% | 19 / 35 | 9.6% | 9.0% | 15 | 0 | 1.73 / 110.5 | 46.5% | +2.2 |
| 14 | 44.9% | 42.9% | 48.3% | 15 / 35 | 9.8% | 9.2% | 11 | 0 | 1.73 / 34.5 | 47.9% | -3.0 |
| 15 | 42.6% | 40.0% | 47.0% | 14 / 35 | 10.2% | 8.6% | 41 | 0 | 1.85 / 18.4 | 48.0% | -5.4 |
| 16 | 52.5% | 42.9% | 62.2% | 15 / 35 | 10.8% | 9.2% | 25 | 0 | 1.88 / 51.1 | 46.4% | +6.1 |
| 17 | 49.5% | 48.6% | 51.4% | 17 / 35 | 11.2% | 7.4% | 17 | 0 | 1.69 / 17.4 | 49.3% | +0.2 |
| 18 | 49.4% | 51.4% | 47.9% | 18 / 35 | 10.1% | 8.6% | 16 | 0 | 1.72 / 16.2 | 33.8% | +15.6 |
| 19 | 51.3% | 51.4% | 51.7% | 18 / 35 | 10.9% | 8.3% | 9 | 0 | 1.72 / 58.1 | 38.2% | +13.1 |
| 20 | 45.3% | 40.0% | 51.1% | 14 / 35 | 11.5% | 9.7% | 29 | 0 | 1.83 / 23.2 | 49.9% | -4.6 |

Mean score share 48.8% ± 2.7, baseline 47.5% ± 3.0, paired diff +1.4 ± 3.9.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 343 over 20 battles (17.2 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | rumble-13 | 48.8% ± 2.7 | 48.1% ± 5.0 | 50.5% ± 1.9 | 337 / 700 | 10.4% ± 0.3 | 8.8% ± 0.3 | 343 | 0 | 1.88 / 226.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | 20 | 13 | 0 | 0 | 0.49 | 7 | 6 | 0 |

13 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | 65848 | 15 | 66786 | 65833 (100.0%) | 15 (0.0%) | 953 (1.4%) | 5835 | 619 | 352 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| pc.Wavelet 1.5 | 78036 | 7267 (9.3%) | 74462 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | 650 | 441 | 626 | 1385 | 30.4 / 29.7 | 905 | 14368 | 51 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | 8.8% | 343 | 14479 | 3 | 94.5 | 7257 / 7267 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | pc.Wavelet | 1 | 35 | 272 | 10.2% | 7.1% ± 0.8 | 11.0% | 21.1% / 20.7% | 9.8% | 0 / 0 | T3/M1 | 46% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
