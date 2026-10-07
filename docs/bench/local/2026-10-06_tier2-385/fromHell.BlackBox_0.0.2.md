# fromHell.BlackBox 0.0.2 (mid) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 65.2% | 77.1% | 53.2% | 27 / 35 | 16.0% | 8.5% | 11 | 0 | 0.97 / 16.9 | 68.4% | -3.2 |
| 2 | 77.6% | 94.3% | 60.9% | 33 / 35 | 14.9% | 7.7% | 12 | 0 | 0.98 / 17.2 | 78.5% | -0.9 |
| 3 | 68.6% | 82.9% | 54.8% | 29 / 35 | 15.2% | 7.9% | 10 | 0 | 0.98 / 16.5 | 68.2% | +0.4 |
| 4 | 64.3% | 71.4% | 56.3% | 25 / 35 | 13.5% | 7.8% | 11 | 0 | 0.94 / 16.7 | 67.3% | -3.0 |
| 5 | 65.6% | 77.1% | 54.3% | 27 / 35 | 13.3% | 8.7% | 9 | 0 | 0.93 / 16.6 | 65.9% | -0.3 |
| 6 | 82.6% | 100.0% | 64.3% | 35 / 35 | 13.7% | 7.6% | 14 | 0 | 0.97 / 17.0 | 69.1% | +13.5 |
| 7 | 78.0% | 91.4% | 63.3% | 32 / 35 | 14.7% | 6.5% | 12 | 0 | 0.93 / 16.4 | 72.2% | +5.9 |
| 8 | 70.5% | 85.7% | 55.6% | 30 / 35 | 13.8% | 8.4% | 13 | 0 | 1.02 / 16.8 | 74.5% | -4.0 |
| 9 | 63.8% | 74.3% | 53.4% | 26 / 35 | 13.6% | 8.5% | 12 | 0 | 1.03 / 16.9 | 71.4% | -7.6 |
| 10 | 67.4% | 77.1% | 58.0% | 27 / 35 | 14.0% | 8.1% | 11 | 0 | 0.97 / 16.5 | 62.7% | +4.7 |
| 11 | 68.4% | 85.7% | 51.9% | 30 / 35 | 13.9% | 8.7% | 13 | 0 | 0.95 / 17.8 | 67.5% | +0.9 |
| 12 | 71.4% | 85.7% | 56.5% | 30 / 35 | 15.7% | 7.7% | 11 | 0 | 0.98 / 17.2 | 77.7% | -6.3 |
| 13 | 61.7% | 68.6% | 54.6% | 24 / 35 | 14.4% | 8.3% | 15 | 0 | 0.97 / 16.9 | 67.3% | -5.7 |
| 14 | 65.9% | 74.3% | 57.6% | 26 / 35 | 14.2% | 6.8% | 9 | 0 | 1.03 / 16.1 | 69.2% | -3.3 |
| 15 | 73.2% | 85.7% | 61.5% | 30 / 35 | 14.7% | 8.3% | 10 | 0 | 0.98 / 17.2 | 70.9% | +2.3 |
| 16 | 74.2% | 85.7% | 62.0% | 30 / 35 | 13.8% | 7.1% | 9 | 0 | 0.93 / 16.1 | 75.3% | -1.1 |
| 17 | 78.0% | 94.3% | 61.7% | 33 / 35 | 16.2% | 7.4% | 17 | 0 | 0.95 / 15.9 | 78.5% | -0.5 |
| 18 | 69.4% | 82.9% | 56.4% | 29 / 35 | 13.5% | 8.0% | 13 | 0 | 1.00 / 16.1 | 64.1% | +5.2 |
| 19 | 69.7% | 80.0% | 59.5% | 28 / 35 | 15.5% | 7.7% | 10 | 0 | 0.97 / 16.4 | 67.1% | +2.6 |
| 20 | 66.9% | 77.1% | 56.5% | 27 / 35 | 15.8% | 8.2% | 11 | 0 | 0.99 / 16.6 | 74.3% | -7.4 |

Mean score share 70.1% ± 2.6, baseline 70.5% ± 2.2, paired diff -0.4 ± 2.4.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 233 over 20 battles (11.7 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| fromHell.BlackBox 0.0.2 | mid | 70.1% ± 2.6 | 82.6% ± 3.9 | 57.6% ± 1.7 | 578 / 700 | 14.5% ± 0.4 | 7.9% ± 0.3 | 233 | 0 | 1.03 / 17.8 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| fromHell.BlackBox 0.0.2 | 20 | 19 | 0 | 0 | 0.33 | 1 | 1 | 0 |

19 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| fromHell.BlackBox 0.0.2 | 38024 | 40 | 38023 | 38023 (100.0%) | 1 (0.0%) | 0 (0.0%) | 3166 | 419 | 110 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| fromHell.BlackBox 0.0.2 | 38501 | 3804 (9.9%) | 33676 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| fromHell.BlackBox 0.0.2 | 650 | 421 | 439 | 750 | 38.4 / 28.3 | 5389 | 8540 | 247 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| fromHell.BlackBox 0.0.2 | 7.9% | 233 | 129 | 3 | 54.0 | 3802 / 3804 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| fromHell.BlackBox 0.0.2 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| fromHell.BlackBox 0.0.2 | fromHell.BlackBox | 1 | 35 | 304 | 8.8% | 6.9% ± 1.2 | 15.0% | 26.8% / 26.8% | 3.2% | 0 / 0 | T2/M0 | 66% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
