# jk.mega.DrussGT 3.1.16 (rumble-3) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 45.5% | 44.1% | 46.9% | 16 / 35 | 7.6% | 10.2% | 33 | 0 | 1.52 / 30.2 | 36.2% | +9.2 |
| 2 | 57.9% | 65.7% | 49.4% | 23 / 35 | 7.6% | 10.1% | 36 | 0 | 1.54 / 29.5 | 35.7% | +22.1 |
| 3 | 50.4% | 57.1% | 43.1% | 20 / 35 | 6.7% | 10.8% | 36 | 0 | 1.55 / 29.8 | 41.1% | +9.4 |
| 4 | 48.3% | 51.4% | 44.4% | 18 / 35 | 7.2% | 9.7% | 34 | 0 | 1.58 / 31.1 | 35.6% | +12.8 |
| 5 | 51.3% | 54.3% | 48.4% | 19 / 35 | 7.8% | 10.8% | 35 | 0 | 1.50 / 30.2 | 29.9% | +21.4 |
| 6 | 38.8% | 35.3% | 42.8% | 13 / 35 | 7.0% | 10.5% | 32 | 0 | 1.55 / 28.9 | 36.6% | +2.2 |
| 7 | 42.3% | 44.1% | 40.2% | 16 / 35 | 7.7% | 9.8% | 30 | 0 | 1.54 / 29.4 | 30.7% | +11.6 |
| 8 | 45.3% | 47.1% | 43.4% | 17 / 35 | 7.5% | 10.4% | 42 | 0 | 1.54 / 29.4 | 35.7% | +9.6 |
| 9 | 46.6% | 47.1% | 45.9% | 17 / 35 | 6.7% | 10.3% | 39 | 0 | 1.50 / 30.2 | 33.3% | +13.2 |
| 10 | 49.8% | 48.6% | 50.6% | 17 / 35 | 7.3% | 9.5% | 37 | 0 | 1.53 / 28.8 | 33.7% | +16.1 |
| 11 | 38.2% | 34.3% | 43.1% | 12 / 35 | 7.3% | 9.5% | 33 | 0 | 1.56 / 29.8 | 33.9% | +4.3 |
| 12 | 56.4% | 60.0% | 52.3% | 21 / 35 | 8.1% | 10.4% | 32 | 0 | 1.54 / 38.0 | 35.2% | +21.1 |
| 13 | 55.3% | 60.0% | 49.7% | 21 / 35 | 7.9% | 9.6% | 36 | 0 | 1.53 / 29.5 | 25.6% | +29.7 |
| 14 | 51.5% | 54.3% | 47.9% | 19 / 35 | 7.8% | 9.7% | 38 | 0 | 1.52 / 30.5 | 28.8% | +22.7 |
| 15 | 53.5% | 57.1% | 48.9% | 20 / 35 | 8.0% | 10.3% | 43 | 0 | 1.53 / 29.8 | 31.8% | +21.7 |
| 16 | 45.7% | 47.1% | 44.7% | 17 / 35 | 7.3% | 9.9% | 33 | 0 | 1.58 / 28.8 | 30.8% | +15.0 |
| 17 | 46.4% | 45.7% | 47.1% | 16 / 35 | 7.4% | 10.2% | 36 | 0 | 1.54 / 445.7 | 31.1% | +15.2 |
| 18 | 45.4% | 45.7% | 45.0% | 16 / 35 | 7.4% | 9.8% | 32 | 0 | 1.61 / 31.3 | 32.8% | +12.6 |
| 19 | 50.0% | 51.4% | 48.1% | 18 / 35 | 7.5% | 10.4% | 43 | 0 | 1.57 / 321.3 | 36.2% | +13.8 |
| 20 | 40.8% | 37.1% | 44.6% | 13 / 35 | 6.9% | 10.5% | 45 | 0 | 1.60 / 30.9 | 39.9% | +0.9 |

Mean score share 48.0% ± 2.6, baseline 33.7% ± 1.7, paired diff +14.2 ± 3.5.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 725 over 20 battles (36.3 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | rumble-3 | 48.0% ± 2.6 | 49.4% ± 3.9 | 46.3% ± 1.5 | 349 / 700 | 7.4% ± 0.2 | 10.1% ± 0.2 | 725 | 0 | 1.61 / 445.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 20 | 8 | 596 | 0 | 1.04 | 11 | 10 | 0 |

8 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 181066 | 36 | 181023 | 181004 (100.0%) | 62 (0.0%) | 19 (0.0%) | 11402 | 1293 | 649 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 179591 | 22951 (12.8%) | 178012 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 650 | 516 | 650 | 3017 | 26.7 / 30.8 | 102 | 23181 | 1844 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 10.1% | 725 | 9213 | 3 | 254.5 | 22927 / 22951 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| jk.mega.DrussGT 3.1.16 | jk.mega.DrussGT | 1 | 35 | 298 | 11.0% | 9.1% ± 1.0 | 6.9% | 23.2% / 22.0% | 1.8% | 0 / 0 | T3/M1 | 41% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
