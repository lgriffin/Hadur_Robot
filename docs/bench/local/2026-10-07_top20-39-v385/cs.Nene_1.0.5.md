# cs.Nene 1.0.5 (rumble-18) vs hadur2.Hadur 3.9

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 50.7% | 62.9% | 39.4% | 22 / 35 | 9.0% | 9.0% | 10 | 0 | 1.30 / 90.7 | 54.8% | -4.1 |
| 2 | 52.4% | 65.7% | 40.1% | 23 / 35 | 9.7% | 8.4% | 15 | 0 | 1.27 / 15.7 | 64.9% | -12.6 |
| 3 | 65.9% | 85.7% | 44.0% | 30 / 35 | 9.5% | 7.0% | 12 | 0 | 1.22 / 17.4 | 65.3% | +0.6 |
| 4 | 64.7% | 80.0% | 46.1% | 28 / 35 | 9.8% | 6.6% | 6 | 0 | 1.13 / 16.2 | 66.2% | -1.5 |
| 5 | 54.1% | 71.4% | 36.2% | 25 / 35 | 9.0% | 8.1% | 13 | 0 | 1.26 / 13.8 | 67.7% | -13.5 |
| 6 | 60.5% | 77.1% | 43.2% | 27 / 35 | 9.9% | 8.0% | 8 | 0 | 1.28 / 16.4 | 62.1% | -1.6 |
| 7 | 50.0% | 62.9% | 36.5% | 22 / 35 | 9.1% | 7.6% | 12 | 0 | 1.27 / 15.0 | 57.9% | -7.9 |
| 8 | 56.8% | 74.3% | 39.5% | 26 / 35 | 9.5% | 7.6% | 13 | 0 | 1.26 / 20.1 | 66.0% | -9.2 |
| 9 | 58.6% | 74.3% | 42.3% | 26 / 35 | 10.6% | 7.5% | 12 | 0 | 1.22 / 14.7 | 65.5% | -6.9 |
| 10 | 60.4% | 77.1% | 42.4% | 27 / 35 | 9.5% | 7.8% | 11 | 0 | 1.17 / 15.9 | 61.3% | -0.9 |

Mean score share 57.4% ± 4.0, baseline 63.2% ± 2.9, paired diff -5.8 ± 3.6.

## Full report

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 112 over 10 battles (11.2 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | rumble-18 | 57.4% ± 4.0 | 73.1% ± 5.4 | 41.0% ± 2.3 | 256 / 350 | 9.6% ± 0.3 | 7.8% ± 0.5 | 112 | 0 | 1.30 / 90.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 10 | 10 | 0 | 0 | 0.32 | 0 | 0 | 0 |

10 of 10 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 18687 | 142 | 18686 | 18685 (100.0%) | 2 (0.0%) | 1 (0.0%) | 1099 | 143 | 60 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| cs.Nene 1.0.5 | 20805 | 1969 (9.5%) | 17197 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 650 | 474 | 650 | 763 | 23.8 / 34.4 | 182 | 12817 | 3050 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 7.8% | 112 | 2045 | 3 | 53.3 | 1960 / 1969 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | cs.Nene | 1 | 35 | 264 | 8.4% | 7.6% ± 1.3 | 9.6% | 24.5% / 23.6% | 8.8% | 0 / 0 | T3/M1 | 60% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
