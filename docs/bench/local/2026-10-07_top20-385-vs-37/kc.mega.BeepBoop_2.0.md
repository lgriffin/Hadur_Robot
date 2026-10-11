# kc.mega.BeepBoop 2.0 (rumble-1) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 20.1% | 5.7% | 39.3% | 2 / 35 | 5.0% | 9.8% | 18 | 0 | 1.99 / 58.5 | 18.4% | +1.7 |
| 2 | 33.7% | 25.7% | 44.1% | 9 / 35 | 5.6% | 8.9% | 25 | 0 | 2.05 / 44.2 | 17.2% | +16.5 |
| 3 | 26.4% | 14.3% | 42.7% | 5 / 35 | 4.5% | 8.7% | 13 | 0 | 1.99 / 58.3 | 16.9% | +9.4 |
| 4 | 32.9% | 25.7% | 42.4% | 9 / 35 | 6.0% | 34.4% | 31 | 0 | 2.06 / 46.5 | 20.5% | +12.5 |
| 5 | 23.2% | 8.6% | 43.7% | 3 / 35 | 4.6% | 8.5% | 18 | 0 | 1.94 / 58.1 | 19.0% | +4.2 |
| 6 | 25.5% | 11.4% | 45.3% | 4 / 35 | 5.1% | 8.7% | 21 | 0 | 1.80 / 45.1 | 16.2% | +9.3 |
| 7 | 28.3% | 14.3% | 46.7% | 5 / 35 | 5.5% | 8.8% | 26 | 0 | 1.87 / 55.6 | 16.4% | +11.9 |
| 8 | 21.9% | 8.6% | 41.0% | 3 / 35 | 5.2% | 9.4% | 26 | 0 | 2.00 / 45.4 | 20.8% | +1.2 |
| 9 | 26.5% | 11.4% | 45.7% | 4 / 35 | 5.2% | 9.2% | 17 | 0 | 1.90 / 61.9 | 17.4% | +9.1 |
| 10 | 27.8% | 14.3% | 46.9% | 5 / 35 | 5.3% | 8.1% | 26 | 0 | 1.96 / 44.3 | 16.1% | +11.8 |
| 11 | 31.7% | 20.0% | 47.2% | 7 / 35 | 5.6% | 8.7% | 20 | 0 | 2.05 / 370.3 | 17.3% | +14.4 |
| 12 | 26.1% | 17.1% | 39.3% | 6 / 35 | 4.3% | 9.2% | 21 | 0 | 1.98 / 43.6 | 16.9% | +9.2 |
| 13 | 31.0% | 20.0% | 45.3% | 7 / 35 | 5.3% | 9.1% | 23 | 0 | 2.00 / 44.8 | 24.6% | +6.5 |
| 14 | 24.0% | 14.3% | 37.5% | 5 / 35 | 4.7% | 10.4% | 29 | 0 | 1.92 / 43.0 | 19.3% | +4.7 |
| 15 | 24.4% | 11.4% | 43.2% | 4 / 35 | 4.9% | 8.4% | 60 | 0 | 1.93 / 43.6 | 23.4% | +1.0 |
| 16 | 27.0% | 14.3% | 43.8% | 5 / 35 | 5.9% | 8.3% | 23 | 0 | 2.00 / 45.5 | 15.3% | +11.7 |
| 17 | 21.4% | 8.6% | 39.8% | 3 / 35 | 4.2% | 9.1% | 20 | 0 | 1.88 / 94.4 | 18.1% | +3.3 |
| 18 | 16.6% | 2.9% | 36.0% | 1 / 35 | 4.1% | 9.4% | 20 | 0 | 1.91 / 54.9 | 17.1% | -0.6 |
| 19 | 24.7% | 14.3% | 39.7% | 5 / 35 | 4.4% | 8.7% | 23 | 0 | 1.92 / 44.6 | 14.8% | +9.9 |
| 20 | 20.6% | 5.7% | 42.0% | 2 / 35 | 4.8% | 8.4% | 19 | 0 | 1.94 / 45.0 | 16.7% | +3.8 |

Mean score share 25.7% ± 2.1, baseline 18.1% ± 1.2, paired diff +7.6 ± 2.3.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 479 over 20 battles (24.0 per battle, most in one battle 60). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 25.7% ± 2.1 | 13.4% ± 2.9 | 42.6% ± 1.5 | 94 / 700 | 5.0% ± 0.3 | 10.2% ± 2.7 | 479 | 0 | 2.06 / 370.3 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 20 | 19 | 590 | 1 | 0.68 | 0 | 0 | 0 |

19 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 100982 | 1214 | 106649 | 100890 (99.9%) | 92 (0.1%) | 5759 (5.4%) | 4337 | 677 | 433 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 100646 | 11034 (11.0%) | 97740 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 536 | 650 | 1737 | 20.1 / 27.1 | 0 | 2482 | 300 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 10.2% | 479 | 3392 | 3 | 151.4 | 11008 / 11034 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | kc.mega.BeepBoop | 1 | 35 | 296 | 9.1% | 7.6% ± 1.1 | 5.7% | 20.4% / 19.6% | 0.1% | 0 / 0 | T3/M1 | 21% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
