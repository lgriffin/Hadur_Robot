# cb.fire.Firestarter 2.0f (rumble-7) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 53.7% | 54.3% | 53.4% | 19 / 35 | 8.1% | 8.5% | 31 | 0 | 1.71 / 27.7 | 31.6% | +22.1 |
| 2 | 57.3% | 60.0% | 54.3% | 21 / 35 | 9.1% | 8.9% | 34 | 0 | 1.77 / 28.1 | 30.8% | +26.5 |
| 3 | 45.8% | 42.9% | 50.4% | 15 / 35 | 7.8% | 8.5% | 22 | 0 | 1.77 / 27.2 | 43.6% | +2.2 |
| 4 | 54.4% | 54.3% | 54.1% | 19 / 35 | 8.3% | 8.3% | 26 | 0 | 1.78 / 27.2 | 42.0% | +12.4 |
| 5 | 56.5% | 58.8% | 53.9% | 21 / 35 | 8.4% | 9.0% | 28 | 0 | 1.67 / 25.6 | 29.2% | +27.3 |
| 6 | 54.3% | 54.3% | 53.9% | 19 / 35 | 8.0% | 8.1% | 33 | 0 | 1.74 / 28.3 | 36.7% | +17.6 |
| 7 | 54.5% | 54.3% | 54.3% | 19 / 35 | 8.5% | 8.1% | 32 | 0 | 1.71 / 26.8 | 49.6% | +4.9 |
| 8 | 36.2% | 28.6% | 46.4% | 10 / 35 | 7.3% | 7.4% | 23 | 0 | 1.73 / 27.0 | 38.6% | -2.3 |
| 9 | 50.9% | 48.6% | 53.1% | 17 / 35 | 8.2% | 8.1% | 32 | 0 | 1.78 / 28.6 | 37.1% | +13.8 |
| 10 | 42.2% | 40.0% | 45.1% | 14 / 35 | 7.9% | 9.2% | 28 | 0 | 1.75 / 26.0 | 35.7% | +6.5 |
| 11 | 44.2% | 41.2% | 48.5% | 15 / 35 | 7.5% | 8.1% | 29 | 0 | 1.68 / 26.2 | 28.4% | +15.9 |
| 12 | 45.8% | 42.9% | 49.7% | 15 / 35 | 7.7% | 8.4% | 26 | 0 | 1.65 / 27.6 | 36.4% | +9.4 |
| 13 | 57.8% | 60.0% | 54.8% | 21 / 35 | 8.7% | 8.3% | 38 | 0 | 1.63 / 28.8 | 39.9% | +17.9 |
| 14 | 50.4% | 48.6% | 52.6% | 17 / 35 | 7.9% | 8.0% | 31 | 0 | 1.72 / 30.4 | 43.2% | +7.2 |
| 15 | 45.0% | 40.0% | 50.8% | 14 / 35 | 8.4% | 8.8% | 36 | 0 | 1.73 / 26.4 | 31.1% | +13.9 |
| 16 | 48.8% | 45.7% | 51.9% | 16 / 35 | 9.1% | 8.9% | 32 | 0 | 1.78 / 29.7 | 41.7% | +7.1 |
| 17 | 55.4% | 51.4% | 58.9% | 18 / 35 | 8.5% | 8.2% | 30 | 0 | 1.72 / 27.0 | 43.9% | +11.5 |
| 18 | 45.9% | 42.9% | 49.6% | 15 / 35 | 7.8% | 8.5% | 23 | 0 | 1.92 / 454.1 | 37.8% | +8.0 |
| 19 | 43.0% | 37.1% | 50.4% | 13 / 35 | 7.7% | 8.3% | 26 | 0 | 1.71 / 30.1 | 31.4% | +11.6 |
| 20 | 55.7% | 57.1% | 54.3% | 20 / 35 | 8.8% | 8.5% | 35 | 0 | 1.76 / 27.3 | 43.1% | +12.6 |

Mean score share 49.9% ± 2.8, baseline 37.6% ± 2.7, paired diff +12.3 ± 3.5.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 595 over 20 battles (29.8 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | rumble-7 | 49.9% ± 2.8 | 48.1% ± 4.0 | 52.0% ± 1.5 | 338 / 700 | 8.2% ± 0.2 | 8.4% ± 0.2 | 595 | 0 | 1.92 / 454.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 20 | 18 | 894 | 0 | 0.85 | 0 | 0 | 0 |

18 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 164856 | 3892 | 190817 | 164694 (99.9%) | 162 (0.1%) | 26123 (13.7%) | 14382 | 1245 | 608 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 189839 | 17494 (9.2%) | 184388 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 650 | 548 | 650 | 3125 | 29.0 / 26.7 | 293 | 15705 | 609 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 8.4% | 595 | 3496 | 3 | 271.6 | 17401 / 17494 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 1 | 35 | 310 | 8.3% | 6.7% ± 1.1 | 8.9% | 20.0% / 20.9% | 3.1% | 0 / 0 | T2/M1 | 56% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
