# demetrix.nano.SledgeHammer 0.22 (nano) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 70.1% | 100.0% | 59.1% | 35 / 35 | 71.1% | 53.4% | 12 | 0 | 0.52 / 8.7 | 70.8% | -0.8 |
| 2 | 68.7% | 97.1% | 59.1% | 34 / 35 | 75.8% | 56.6% | 10 | 0 | 0.52 / 11.0 | 70.7% | -2.0 |
| 3 | 70.5% | 97.1% | 60.1% | 34 / 35 | 73.0% | 51.6% | 10 | 0 | 0.51 / 8.4 | 67.2% | +3.3 |
| 4 | 66.2% | 97.1% | 60.1% | 34 / 35 | 80.9% | 54.1% | 9 | 0 | 0.56 / 8.8 | 69.5% | -3.4 |
| 5 | 69.0% | 94.3% | 59.6% | 33 / 35 | 73.6% | 55.0% | 12 | 0 | 0.51 / 7.5 | 68.8% | +0.2 |
| 6 | 69.6% | 97.1% | 58.9% | 34 / 35 | 72.4% | 68.5% | 9 | 0 | 0.50 / 10.4 | 64.9% | +4.7 |
| 7 | 67.0% | 91.4% | 57.7% | 32 / 35 | 71.6% | 66.6% | 10 | 0 | 0.48 / 8.5 | 68.5% | -1.5 |
| 8 | 68.7% | 97.1% | 58.3% | 34 / 35 | 76.3% | 57.0% | 9 | 0 | 0.49 / 9.1 | 67.2% | +1.5 |
| 9 | 67.7% | 94.3% | 58.4% | 33 / 35 | 75.3% | 56.8% | 10 | 0 | 0.51 / 8.0 | 69.3% | -1.6 |
| 10 | 66.4% | 91.4% | 57.3% | 32 / 35 | 71.2% | 70.6% | 12 | 0 | 0.51 / 8.4 | 68.4% | -2.0 |
| 11 | 67.3% | 91.4% | 58.4% | 32 / 35 | 70.1% | 52.0% | 8 | 0 | 0.54 / 10.0 | 67.1% | +0.2 |
| 12 | 70.7% | 100.0% | 59.6% | 35 / 35 | 75.4% | 54.2% | 9 | 0 | 0.49 / 9.1 | 70.1% | +0.6 |
| 13 | 68.4% | 97.1% | 57.8% | 34 / 35 | 73.1% | 57.2% | 12 | 0 | 0.52 / 8.1 | 69.9% | -1.6 |
| 14 | 70.1% | 100.0% | 59.3% | 35 / 35 | 69.6% | 51.4% | 10 | 0 | 0.54 / 9.1 | 68.9% | +1.1 |
| 15 | 67.9% | 97.1% | 57.4% | 34 / 35 | 71.5% | 58.0% | 10 | 0 | 0.53 / 9.8 | 67.8% | +0.2 |
| 16 | 67.4% | 97.1% | 60.9% | 34 / 35 | 76.7% | 47.3% | 8 | 0 | 0.57 / 9.3 | 67.8% | -0.4 |

Mean score share 68.5% ± 0.8, baseline 68.6% ± 0.8, paired diff -0.1 ± 1.1.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 160 over 16 battles (10.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| demetrix.nano.SledgeHammer 0.22 | nano | 68.5% ± 0.8 | 96.2% ± 1.5 | 58.9% ± 0.6 | 539 / 560 | 73.6% ± 1.6 | 56.9% ± 3.4 | 160 | 0 | 0.57 / 11.0 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| demetrix.nano.SledgeHammer 0.22 | 16 | 13 | 378 | 0 | 0.29 | 1 | 0 | 0 |

13 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| demetrix.nano.SledgeHammer 0.22 | 5065 | 22 | 5044 | 5041 (99.5%) | 24 (0.5%) | 3 (0.1%) | 3648 | 460 | 48 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| demetrix.nano.SledgeHammer 0.22 | 5093 | 192 (3.8%) | 236 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| demetrix.nano.SledgeHammer 0.22 | 650 | 151 | 650 | 163 | 110.3 / 77.3 | 4554 | 3656 | 130 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| demetrix.nano.SledgeHammer 0.22 | 56.9% | 160 | 51 | 3 | 8.8 | 192 / 192 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| demetrix.nano.SledgeHammer 0.22 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| demetrix.nano.SledgeHammer 0.22 | demetrix.nano.SledgeHammer | 1 | 35 | 338 | 52.0% | 5.2% ± 3.0 | 39.8% | 10.9% / 11.1% | 23.2% | 0 / 0 | T2/M? | 71% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
