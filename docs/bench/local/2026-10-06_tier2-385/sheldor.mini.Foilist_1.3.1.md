# sheldor.mini.Foilist 1.3.1 (mid) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 55.0% | 62.9% | 46.3% | 22 / 35 | 10.9% | 8.2% | 19 | 0 | 1.24 / 21.2 | 69.3% | -14.3 |
| 2 | 68.2% | 79.4% | 57.0% | 28 / 35 | 11.6% | 9.1% | 25 | 0 | 1.23 / 20.6 | 49.1% | +19.1 |
| 3 | 59.9% | 71.4% | 49.4% | 25 / 35 | 12.1% | 8.9% | 19 | 0 | 1.21 / 21.2 | 66.3% | -6.4 |
| 4 | 69.4% | 82.9% | 54.9% | 29 / 35 | 12.4% | 6.9% | 17 | 0 | 1.24 / 19.8 | 62.8% | +6.6 |
| 5 | 53.6% | 65.7% | 41.0% | 23 / 35 | 9.4% | 9.9% | 25 | 0 | 1.28 / 22.2 | 69.8% | -16.3 |
| 6 | 62.8% | 74.3% | 50.5% | 26 / 35 | 10.4% | 8.1% | 27 | 0 | 1.22 / 20.5 | 78.3% | -15.5 |
| 7 | 69.6% | 85.7% | 52.1% | 30 / 35 | 10.4% | 8.0% | 20 | 0 | 1.22 / 20.8 | 64.1% | +5.5 |
| 8 | 58.4% | 71.4% | 45.6% | 25 / 35 | 10.4% | 8.8% | 25 | 0 | 1.22 / 23.0 | 68.7% | -10.4 |
| 9 | 72.9% | 85.7% | 59.2% | 30 / 35 | 12.0% | 7.7% | 14 | 0 | 1.19 / 19.9 | 71.3% | +1.6 |
| 10 | 66.2% | 80.0% | 53.1% | 28 / 35 | 11.3% | 9.2% | 31 | 0 | 1.29 / 22.1 | 70.4% | -4.2 |
| 11 | 59.8% | 77.1% | 43.4% | 27 / 35 | 10.7% | 9.4% | 20 | 0 | 1.26 / 20.9 | 65.6% | -5.8 |
| 12 | 75.3% | 91.2% | 59.4% | 32 / 35 | 11.7% | 8.1% | 25 | 0 | 1.20 / 20.8 | 59.7% | +15.6 |
| 13 | 74.3% | 91.2% | 58.1% | 32 / 35 | 12.2% | 7.9% | 24 | 0 | 1.21 / 19.9 | 70.8% | +3.5 |
| 14 | 58.0% | 68.6% | 47.1% | 24 / 35 | 10.8% | 8.2% | 26 | 0 | 1.22 / 20.6 | 70.6% | -12.6 |
| 15 | 51.1% | 60.0% | 43.7% | 21 / 35 | 11.3% | 9.4% | 22 | 0 | 1.24 / 20.4 | 54.3% | -3.2 |
| 16 | 71.7% | 85.7% | 56.7% | 30 / 35 | 11.6% | 7.6% | 24 | 0 | 1.25 / 22.3 | 54.2% | +17.5 |
| 17 | 64.1% | 74.3% | 54.9% | 26 / 35 | 11.9% | 8.6% | 18 | 0 | 1.25 / 21.5 | 69.5% | -5.3 |
| 18 | 63.6% | 82.9% | 45.5% | 29 / 35 | 10.9% | 9.5% | 20 | 0 | 1.22 / 21.6 | 71.4% | -7.9 |
| 19 | 66.6% | 82.9% | 48.5% | 29 / 35 | 10.8% | 7.7% | 16 | 0 | 1.22 / 21.1 | 63.9% | +2.7 |
| 20 | 59.4% | 71.4% | 47.4% | 25 / 35 | 11.1% | 8.5% | 19 | 0 | 1.23 / 22.8 | 60.1% | -0.7 |

Mean score share 64.0% ± 3.3, baseline 65.5% ± 3.3, paired diff -1.5 ± 5.0.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 436 over 20 battles (21.8 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.mini.Foilist 1.3.1 | mid | 64.0% ± 3.3 | 77.2% ± 4.2 | 50.7% ± 2.7 | 541 / 700 | 11.2% ± 0.4 | 8.5% ± 0.4 | 436 | 0 | 1.29 / 23.0 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sheldor.mini.Foilist 1.3.1 | 20 | 18 | 0 | 0 | 0.62 | 2 | 2 | 0 |

18 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| sheldor.mini.Foilist 1.3.1 | 68538 | 37 | 68595 | 68535 (100.0%) | 3 (0.0%) | 60 (0.1%) | 5216 | 476 | 332 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| sheldor.mini.Foilist 1.3.1 | 70727 | 6234 (8.8%) | 63524 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| sheldor.mini.Foilist 1.3.1 | 650 | 568 | 638 | 1237 | 32.1 / 31.1 | 1210 | 38903 | 108 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| sheldor.mini.Foilist 1.3.1 | 8.5% | 436 | 7356 | 3 | 97.3 | 6223 / 6234 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| sheldor.mini.Foilist 1.3.1 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.mini.Foilist 1.3.1 | sheldor.mini.Foilist | 1 | 35 | 316 | 8.8% | 8.6% ± 1.0 | 10.9% | 24.4% / 25.4% | 6.2% | 0 / 0 | T3/M1 | 59% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
