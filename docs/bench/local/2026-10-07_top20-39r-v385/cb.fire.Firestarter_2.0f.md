# cb.fire.Firestarter 2.0f (rumble-7) vs hadur2.Hadur 3.9

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 49.1% | 48.6% | 49.7% | 17 / 35 | 8.2% | 8.8% | 27 | 0 | 1.68 / 28.2 | 33.7% | +15.4 |
| 2 | 52.6% | 51.4% | 53.8% | 18 / 35 | 8.5% | 7.7% | 35 | 0 | 1.70 / 83.3 | 47.6% | +5.0 |
| 3 | 51.0% | 51.4% | 50.4% | 18 / 35 | 7.5% | 8.2% | 30 | 0 | 1.75 / 26.5 | 55.3% | -4.2 |
| 4 | 43.1% | 40.0% | 47.0% | 14 / 35 | 8.9% | 9.6% | 24 | 0 | 1.80 / 29.6 | 52.2% | -9.0 |
| 5 | 46.3% | 42.9% | 51.7% | 15 / 35 | 8.1% | 7.9% | 38 | 0 | 1.63 / 27.2 | 52.3% | -6.0 |
| 6 | 44.5% | 40.0% | 49.0% | 14 / 35 | 8.5% | 8.9% | 36 | 0 | 1.70 / 26.5 | 46.1% | -1.6 |
| 7 | 44.7% | 41.2% | 49.2% | 15 / 35 | 7.6% | 8.6% | 25 | 0 | 1.68 / 26.9 | 51.5% | -6.8 |
| 8 | 52.9% | 52.9% | 53.1% | 19 / 35 | 8.0% | 7.8% | 28 | 0 | 1.67 / 27.3 | 56.5% | -3.6 |
| 9 | 49.4% | 48.6% | 50.6% | 17 / 35 | 8.4% | 8.8% | 33 | 0 | 1.76 / 29.5 | 55.2% | -5.9 |
| 10 | 56.4% | 60.0% | 52.6% | 21 / 35 | 8.5% | 8.4% | 31 | 0 | 1.69 / 26.7 | 52.6% | +3.8 |
| 11 | 53.1% | 54.3% | 51.1% | 19 / 35 | 7.6% | 8.7% | 28 | 0 | 1.74 / 27.9 | 48.0% | +5.1 |
| 12 | 59.5% | 62.9% | 55.5% | 22 / 35 | 8.0% | 8.3% | 33 | 0 | 1.75 / 27.3 | 47.1% | +12.4 |
| 13 | 50.1% | 45.7% | 54.7% | 16 / 35 | 8.3% | 8.0% | 36 | 0 | 1.76 / 25.5 | 51.7% | -1.6 |
| 14 | 53.2% | 51.4% | 55.6% | 18 / 35 | 9.3% | 8.5% | 33 | 0 | 1.73 / 26.2 | 51.4% | +1.8 |
| 15 | 59.1% | 61.8% | 56.0% | 22 / 35 | 8.4% | 7.7% | 29 | 0 | 1.77 / 35.2 | 57.7% | +1.4 |
| 16 | 59.5% | 60.0% | 57.8% | 21 / 35 | 9.0% | 8.3% | 32 | 0 | 1.73 / 27.1 | 53.6% | +5.9 |
| 17 | 61.3% | 62.9% | 59.1% | 22 / 35 | 8.9% | 9.1% | 38 | 0 | 1.77 / 25.8 | 44.5% | +16.8 |
| 18 | 47.6% | 45.7% | 50.5% | 16 / 35 | 8.2% | 8.3% | 34 | 0 | 1.70 / 27.5 | 47.8% | -0.2 |
| 19 | 51.6% | 48.6% | 54.7% | 17 / 35 | 8.4% | 8.2% | 32 | 0 | 1.72 / 26.9 | 41.9% | +9.7 |
| 20 | 51.4% | 48.6% | 53.8% | 17 / 35 | 9.0% | 8.7% | 33 | 0 | 1.69 / 222.8 | 53.3% | -1.9 |

Mean score share 51.8% ± 2.5, baseline 50.0% ± 2.6, paired diff +1.8 ± 3.5.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (roborumble.RoboRumbleAtHome x6), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 635 over 20 battles (31.8 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | rumble-7 | 51.8% ± 2.5 | 50.9% ± 3.5 | 52.8% ± 1.5 | 358 / 700 | 8.4% ± 0.2 | 8.4% ± 0.2 | 635 | 0 | 1.80 / 222.8 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 20 | 17 | 894 | 0 | 0.91 | 0 | 0 | 0 |

17 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 167165 | 3646 | 194157 | 166979 (99.9%) | 186 (0.1%) | 27178 (14.0%) | 14767 | 1307 | 591 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 192457 | 17619 (9.2%) | 187351 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 650 | 546 | 645 | 3162 | 29.7 / 26.4 | 415 | 23739 | 920 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 8.4% | 635 | 28523 | 3 | 276.6 | 17521 / 17619 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 1 | 35 | 310 | 8.8% | 7.0% ± 0.8 | 9.2% | 20.5% / 21.7% | 3.2% | 0 / 0 | T3/M1 | 51% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
