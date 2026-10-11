# davidalves.Phoenix 1.02 (rumble-21) vs hadur2.Hadur 3.9

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 57.3% | 74.3% | 41.0% | 26 / 35 | 10.1% | 7.9% | 15 | 0 | 1.10 / 649.9 | 54.6% | +2.8 |
| 2 | 47.2% | 57.1% | 37.1% | 20 / 35 | 8.4% | 8.4% | 15 | 0 | 1.11 / 277.6 | 50.3% | -3.1 |
| 3 | 63.5% | 82.9% | 42.9% | 29 / 35 | 9.7% | 7.8% | 46 | 0 | 1.10 / 333.6 | 55.5% | +8.0 |
| 4 | 59.1% | 77.1% | 41.0% | 27 / 35 | 10.1% | 7.7% | 11 | 0 | 1.15 / 98.9 | 64.7% | -5.6 |
| 5 | 59.8% | 77.1% | 42.0% | 27 / 35 | 10.1% | 7.5% | 15 | 0 | 1.09 / 12.7 | 54.3% | +5.5 |
| 6 | 54.7% | 71.4% | 38.2% | 25 / 35 | 9.1% | 8.6% | 12 | 0 | 1.11 / 12.7 | 50.9% | +3.9 |
| 7 | 54.1% | 68.6% | 40.1% | 24 / 35 | 10.5% | 8.6% | 15 | 0 | 1.12 / 12.1 | 58.2% | -4.2 |
| 8 | 71.2% | 91.4% | 49.7% | 32 / 35 | 10.6% | 7.3% | 12 | 0 | 1.06 / 15.9 | 59.5% | +11.7 |
| 9 | 45.9% | 57.1% | 36.6% | 20 / 35 | 9.7% | 9.9% | 7 | 0 | 1.12 / 275.2 | 58.1% | -12.2 |
| 10 | 67.3% | 85.7% | 49.1% | 30 / 35 | 11.0% | 8.2% | 12 | 0 | 1.06 / 12.5 | 52.0% | +15.3 |

Mean score share 58.0% ± 5.8, baseline 55.8% ± 3.2, paired diff +2.2 ± 6.1.

## Full report

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 160 over 10 battles (16.0 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | rumble-21 | 58.0% ± 5.8 | 74.3% ± 8.1 | 41.8% ± 3.2 | 260 / 350 | 9.9% ± 0.5 | 8.2% ± 0.5 | 160 | 0 | 1.15 / 649.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 10 | 8 | 298 | 1 | 0.46 | 1 | 1 | 0 |

8 of 10 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 18518 | 10 | 18501 | 18496 (99.9%) | 22 (0.1%) | 5 (0.0%) | 1292 | 196 | 44 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| davidalves.Phoenix 1.02 | 22817 | 1728 (7.6%) | 16445 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 650 | 463 | 650 | 833 | 25.7 / 35.9 | 157 | 12238 | 163 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 8.2% | 160 | 2150 | 3 | 52.6 | 1727 / 1728 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | davidalves.Phoenix | 1 | 35 | 306 | 8.7% | 7.9% ± 1.4 | 10.4% | 21.1% / 22.7% | 5.8% | 0 / 0 | T3/M1 | 66% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
