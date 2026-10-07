# voidious.Diamond 1.8.22 (rumble-6) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 60.4% | 74.3% | 44.5% | 26 / 35 | 7.4% | 8.8% | 31 | 0 | 1.81 / 40.9 | 34.2% | +26.2 |
| 2 | 58.2% | 71.4% | 43.3% | 25 / 35 | 6.9% | 8.9% | 31 | 0 | 1.69 / 41.4 | 29.4% | +28.8 |
| 3 | 38.2% | 40.0% | 37.1% | 14 / 35 | 6.2% | 8.9% | 31 | 0 | 1.72 / 37.2 | 29.2% | +9.0 |
| 4 | 48.4% | 57.1% | 38.8% | 20 / 35 | 6.3% | 8.7% | 30 | 0 | 1.69 / 38.9 | 33.0% | +15.3 |
| 5 | 45.5% | 50.0% | 41.3% | 18 / 35 | 6.1% | 8.3% | 23 | 0 | 1.66 / 43.9 | 30.9% | +14.6 |
| 6 | 48.1% | 54.3% | 41.5% | 19 / 35 | 6.2% | 8.3% | 25 | 0 | 1.68 / 42.1 | 37.2% | +10.9 |
| 7 | 46.2% | 51.4% | 41.1% | 18 / 35 | 6.8% | 8.2% | 31 | 0 | 1.73 / 39.5 | 24.0% | +22.2 |
| 8 | 50.6% | 60.0% | 41.1% | 21 / 35 | 7.2% | 9.0% | 34 | 0 | 1.67 / 39.6 | 27.4% | +23.1 |
| 9 | 46.0% | 51.4% | 40.3% | 18 / 35 | 7.0% | 8.5% | 30 | 0 | 1.68 / 42.1 | 38.6% | +7.4 |
| 10 | 49.7% | 60.0% | 39.8% | 21 / 35 | 6.5% | 9.2% | 30 | 0 | 1.58 / 40.6 | 29.5% | +20.2 |
| 11 | 52.4% | 62.9% | 40.8% | 22 / 35 | 7.1% | 9.0% | 35 | 0 | 1.64 / 41.8 | 19.6% | +32.8 |
| 12 | 49.2% | 58.8% | 39.2% | 21 / 35 | 6.5% | 7.9% | 32 | 0 | 1.66 / 39.1 | 31.6% | +17.6 |
| 13 | 41.5% | 45.7% | 37.6% | 16 / 35 | 6.4% | 9.5% | 31 | 0 | 1.59 / 43.4 | 30.7% | +10.8 |
| 14 | 50.2% | 58.8% | 41.4% | 21 / 35 | 6.5% | 9.0% | 30 | 0 | 1.61 / 39.8 | 26.9% | +23.4 |
| 15 | 42.6% | 45.7% | 40.3% | 16 / 35 | 6.8% | 8.9% | 26 | 0 | 1.67 / 40.2 | 29.1% | +13.4 |
| 16 | 50.4% | 60.0% | 40.0% | 21 / 35 | 6.8% | 9.4% | 30 | 0 | 1.77 / 41.1 | 32.5% | +17.9 |
| 17 | 47.8% | 54.3% | 40.1% | 19 / 35 | 6.6% | 8.5% | 28 | 0 | 1.61 / 41.5 | 20.1% | +27.7 |
| 18 | 50.9% | 57.1% | 43.7% | 20 / 35 | 6.7% | 8.1% | 31 | 0 | 1.73 / 37.8 | 36.8% | +14.1 |
| 19 | 38.5% | 41.2% | 37.2% | 15 / 35 | 6.3% | 9.0% | 22 | 0 | 1.65 / 40.6 | 39.5% | -1.1 |
| 20 | 39.5% | 40.0% | 39.5% | 14 / 35 | 6.1% | 8.2% | 19 | 0 | 1.72 / 69.7 | 29.3% | +10.2 |

Mean score share 47.7% ± 2.7, baseline 30.5% ± 2.5, paired diff +17.2 ± 3.9.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 580 over 20 battles (29.0 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | rumble-6 | 47.7% ± 2.7 | 54.7% ± 4.4 | 40.4% ± 0.9 | 385 / 700 | 6.6% ± 0.2 | 8.7% ± 0.2 | 580 | 0 | 1.81 / 69.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | 20 | 9 | 0 | 0 | 0.83 | 11 | 11 | 0 |

9 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | 154634 | 3167 | 160022 | 154540 (99.9%) | 94 (0.1%) | 5482 (3.4%) | 9448 | 927 | 765 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| voidious.Diamond 1.8.22 | 156214 | 16874 (10.8%) | 152871 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | 650 | 537 | 650 | 2627 | 21.4 / 31.5 | 327 | 42871 | 880 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | 8.7% | 580 | 6519 | 3 | 226.1 | 16840 / 16874 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | voidious.Diamond | 1 | 35 | 302 | 8.7% | 7.4% ± 0.8 | 7.4% | 22.7% / 21.9% | 9.1% | 0 / 0 | T3/M1 | 40% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
