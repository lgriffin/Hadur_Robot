# rsalesc.mega.Knight 0.6.28 (rumble-11) vs hadur2.Hadur 3.9

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 53.2% | 54.3% | 51.4% | 19 / 35 | 10.0% | 9.7% | 36 | 0 | 2.11 / 88.0 | 50.3% | +2.9 |
| 2 | 46.7% | 45.7% | 47.8% | 16 / 35 | 8.7% | 10.1% | 34 | 0 | 2.06 / 84.3 | 64.6% | -17.9 |
| 3 | 55.7% | 60.0% | 50.7% | 21 / 35 | 8.9% | 10.0% | 36 | 0 | 2.13 / 24.6 | 56.2% | -0.5 |
| 4 | 50.0% | 48.6% | 51.2% | 17 / 35 | 9.0% | 9.7% | 30 | 0 | 2.10 / 53.6 | 54.6% | -4.7 |
| 5 | 64.4% | 71.4% | 56.1% | 25 / 35 | 9.9% | 9.7% | 40 | 0 | 2.11 / 26.8 | 58.9% | +5.6 |
| 6 | 50.6% | 51.4% | 50.1% | 18 / 35 | 9.3% | 9.1% | 30 | 0 | 2.12 / 26.1 | 46.4% | +4.2 |
| 7 | 41.9% | 37.1% | 47.1% | 13 / 35 | 8.6% | 10.0% | 34 | 0 | 2.03 / 73.3 | 55.8% | -13.9 |
| 8 | 46.8% | 45.7% | 47.8% | 16 / 35 | 9.5% | 9.7% | 33 | 0 | 2.01 / 23.0 | 62.0% | -15.2 |
| 9 | 66.8% | 80.0% | 52.6% | 28 / 35 | 9.0% | 10.2% | 34 | 0 | 2.17 / 25.7 | 52.5% | +14.4 |
| 10 | 58.4% | 65.7% | 50.1% | 23 / 35 | 9.7% | 9.5% | 37 | 0 | 2.12 / 47.2 | 62.0% | -3.6 |

Mean score share 53.4% ± 5.7, baseline 56.3% ± 4.1, paired diff -2.9 ± 7.4.

## Full report

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 344 over 10 battles (34.4 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | rumble-11 | 53.4% ± 5.7 | 56.0% ± 9.5 | 50.5% ± 1.9 | 196 / 350 | 9.3% ± 0.4 | 9.8% ± 0.2 | 344 | 0 | 2.17 / 88.0 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 10 | 7 | 298 | 0 | 0.98 | 3 | 3 | 0 |

7 of 10 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 90388 | 775 | 90362 | 90349 (100.0%) | 39 (0.0%) | 13 (0.0%) | 7279 | 725 | 290 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 90956 | 10988 (12.1%) | 90146 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 650 | 509 | 645 | 3029 | 30.3 / 29.6 | 609 | 16163 | 81 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 9.8% | 344 | 9356 | 3 | 256.1 | 10982 / 10988 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| rsalesc.mega.Knight 0.6.28 | rsalesc.mega.Knight | 1 | 35 | 314 | 10.2% | 8.0% ± 1.2 | 10.0% | 23.7% / 20.6% | 12.2% | 0 / 0 | T3/M1 | 58% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
