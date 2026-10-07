# lxx.Tomcat 3.68 (rumble-10) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 51.5% | 60.0% | 43.2% | 21 / 35 | 9.1% | 9.8% | 31 | 0 | 2.02 / 53.6 | 55.4% | -3.8 |
| 2 | 56.0% | 68.6% | 43.0% | 24 / 35 | 9.7% | 10.4% | 31 | 0 | 2.05 / 60.8 | 59.2% | -3.2 |
| 3 | 59.8% | 73.5% | 46.3% | 26 / 35 | 9.1% | 9.9% | 34 | 0 | 2.11 / 34.4 | 57.7% | +2.1 |
| 4 | 47.9% | 57.1% | 39.2% | 20 / 35 | 9.5% | 10.5% | 27 | 0 | 1.97 / 56.3 | 50.3% | -2.4 |
| 5 | 47.9% | 54.3% | 41.7% | 19 / 35 | 9.5% | 9.5% | 25 | 0 | 1.97 / 59.4 | 66.6% | -18.7 |
| 6 | 62.4% | 77.1% | 49.6% | 27 / 35 | 10.6% | 10.8% | 30 | 0 | 2.08 / 57.3 | 59.9% | +2.5 |
| 7 | 51.1% | 60.0% | 42.2% | 21 / 35 | 8.8% | 9.9% | 23 | 0 | 2.00 / 56.5 | 55.9% | -4.8 |
| 8 | 54.3% | 65.7% | 44.0% | 23 / 35 | 9.6% | 10.6% | 26 | 0 | 2.01 / 56.9 | 56.6% | -2.2 |
| 9 | 59.2% | 71.4% | 46.8% | 25 / 35 | 10.5% | 10.0% | 29 | 0 | 2.07 / 55.3 | 44.0% | +15.2 |
| 10 | 52.0% | 62.9% | 42.8% | 22 / 35 | 9.1% | 11.0% | 33 | 0 | 2.02 / 350.1 | 49.1% | +2.9 |
| 11 | 58.6% | 71.4% | 45.8% | 25 / 35 | 9.9% | 10.5% | 29 | 0 | 2.14 / 57.3 | 48.1% | +10.4 |
| 12 | 55.3% | 65.7% | 45.3% | 23 / 35 | 9.8% | 10.3% | 28 | 0 | 2.01 / 57.7 | 50.5% | +4.8 |
| 13 | 50.1% | 60.0% | 42.3% | 21 / 35 | 9.8% | 10.9% | 26 | 0 | 2.02 / 57.3 | 54.6% | -4.5 |
| 14 | 57.9% | 68.6% | 47.4% | 24 / 35 | 8.8% | 10.3% | 27 | 0 | 2.11 / 54.9 | 52.3% | +5.6 |
| 15 | 52.7% | 60.0% | 46.9% | 21 / 35 | 9.4% | 11.0% | 38 | 0 | 2.05 / 58.3 | 64.7% | -12.0 |
| 16 | 50.5% | 60.0% | 41.7% | 21 / 35 | 9.7% | 10.0% | 35 | 0 | 1.99 / 57.4 | 49.2% | +1.3 |
| 17 | 52.7% | 62.9% | 42.0% | 22 / 35 | 8.8% | 9.7% | 33 | 0 | 2.07 / 55.1 | 55.4% | -2.7 |
| 18 | 48.2% | 51.4% | 44.8% | 18 / 35 | 9.4% | 9.5% | 24 | 0 | 1.95 / 53.9 | 53.4% | -5.3 |
| 19 | 59.2% | 74.3% | 44.2% | 26 / 35 | 9.4% | 10.1% | 27 | 0 | 2.12 / 55.5 | 63.8% | -4.6 |
| 20 | 52.0% | 62.9% | 40.9% | 22 / 35 | 8.2% | 10.2% | 37 | 0 | 2.09 / 56.4 | 53.8% | -1.8 |

Mean score share 54.0% ± 2.0, baseline 55.0% ± 2.7, paired diff -1.1 ± 3.4.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 593 over 20 battles (29.7 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | rumble-10 | 54.0% ± 2.0 | 64.4% ± 3.2 | 44.0% ± 1.2 | 451 / 700 | 9.4% ± 0.3 | 10.2% ± 0.2 | 593 | 0 | 2.14 / 350.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | 20 | 13 | 0 | 0 | 0.85 | 8 | 7 | 0 |

13 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | 117799 | 2338 | 118315 | 117691 (99.9%) | 108 (0.1%) | 624 (0.5%) | 9553 | 967 | 529 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| lxx.Tomcat 3.68 | 119860 | 13666 (11.4%) | 116638 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | 650 | 511 | 650 | 2033 | 27.8 / 35.3 | 783 | 86213 | 41 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | 10.2% | 593 | 792 | 3 | 168.1 | 13648 / 13666 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | lxx.Tomcat | 1 | 35 | 274 | 10.4% | 8.7% ± 1.0 | 9.5% | 23.2% / 21.9% | 9.2% | 0 / 0 | T3/M1 | 52% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
