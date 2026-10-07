# rsalesc.mega.Knight 0.6.28 (rumble-11) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 55.6% | 60.0% | 50.7% | 21 / 35 | 9.9% | 10.1% | 39 | 0 | 2.02 / 27.9 | 39.5% | +16.2 |
| 2 | 55.2% | 60.0% | 49.3% | 21 / 35 | 9.2% | 9.8% | 29 | 0 | 2.13 / 26.2 | 47.7% | +7.5 |
| 3 | 60.1% | 65.7% | 53.4% | 23 / 35 | 9.6% | 10.2% | 36 | 0 | 2.15 / 26.6 | 43.8% | +16.3 |
| 4 | 57.3% | 60.0% | 53.6% | 21 / 35 | 9.1% | 9.4% | 38 | 0 | 2.16 / 90.6 | 56.8% | +0.5 |
| 5 | 49.1% | 45.7% | 51.9% | 16 / 35 | 9.0% | 9.9% | 30 | 0 | 2.07 / 24.6 | 48.1% | +1.0 |
| 6 | 53.8% | 54.3% | 52.6% | 19 / 35 | 8.9% | 9.1% | 31 | 0 | 2.07 / 102.4 | 50.2% | +3.6 |
| 7 | 47.0% | 40.0% | 54.1% | 14 / 35 | 9.9% | 10.1% | 32 | 0 | 2.01 / 118.9 | 50.2% | -3.2 |
| 8 | 55.0% | 60.0% | 49.3% | 21 / 35 | 9.1% | 10.0% | 33 | 0 | 2.10 / 25.4 | 47.5% | +7.5 |
| 9 | 52.1% | 54.3% | 49.9% | 19 / 35 | 8.9% | 10.4% | 33 | 0 | 2.09 / 27.4 | 48.8% | +3.2 |
| 10 | 56.0% | 60.0% | 51.4% | 21 / 35 | 9.7% | 10.2% | 36 | 0 | 2.06 / 51.4 | 39.7% | +16.3 |
| 11 | 36.0% | 28.6% | 44.3% | 10 / 35 | 8.9% | 10.5% | 25 | 0 | 2.00 / 22.4 | 41.9% | -5.9 |
| 12 | 47.9% | 45.7% | 49.7% | 16 / 35 | 8.8% | 10.0% | 33 | 0 | 2.02 / 24.0 | 43.8% | +4.2 |
| 13 | 57.1% | 60.0% | 53.0% | 21 / 35 | 9.2% | 10.2% | 34 | 0 | 2.02 / 26.3 | 39.2% | +17.8 |
| 14 | 55.2% | 57.1% | 52.1% | 20 / 35 | 9.2% | 9.8% | 33 | 0 | 2.05 / 25.3 | 42.2% | +13.0 |
| 15 | 50.0% | 51.4% | 48.4% | 18 / 35 | 9.4% | 11.5% | 37 | 0 | 2.16 / 24.6 | 43.0% | +6.9 |
| 16 | 51.0% | 51.4% | 49.9% | 18 / 35 | 9.8% | 10.3% | 33 | 0 | 2.05 / 40.1 | 46.1% | +4.9 |
| 17 | 51.2% | 54.3% | 47.5% | 19 / 35 | 8.6% | 10.0% | 35 | 0 | 2.05 / 25.0 | 51.6% | -0.3 |
| 18 | 50.0% | 51.4% | 48.4% | 18 / 35 | 9.2% | 9.5% | 31 | 0 | 2.08 / 26.2 | 53.5% | -3.5 |
| 19 | 55.7% | 60.0% | 50.9% | 21 / 35 | 9.6% | 9.9% | 39 | 0 | 2.10 / 26.5 | 52.4% | +3.3 |
| 20 | 53.0% | 51.4% | 54.1% | 18 / 35 | 10.2% | 9.7% | 35 | 0 | 2.07 / 68.5 | 36.5% | +16.5 |

Mean score share 52.4% ± 2.4, baseline 46.1% ± 2.6, paired diff +6.3 ± 3.5.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 672 over 20 battles (33.6 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | rumble-11 | 52.4% ± 2.4 | 53.6% ± 4.0 | 50.7% ± 1.2 | 375 / 700 | 9.3% ± 0.2 | 10.0% ± 0.2 | 672 | 0 | 2.16 / 118.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 20 | 11 | 0 | 0 | 0.96 | 9 | 9 | 0 |

11 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 175759 | 1632 | 175755 | 175708 (100.0%) | 51 (0.0%) | 47 (0.0%) | 14447 | 1461 | 614 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 175711 | 20656 (11.8%) | 171063 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 650 | 509 | 650 | 2945 | 30.4 / 29.5 | 1498 | 25642 | 140 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 10.0% | 672 | 9828 | 3 | 247.7 | 20635 / 20656 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | rsalesc.mega.Knight | 1 | 35 | 314 | 10.2% | 8.1% ± 1.0 | 10.9% | 24.4% / 21.4% | 12.3% | 0 / 0 | T3/M1 | 53% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
