# dsekercioglu.mega.Raven 3.56j8 (rumble-8) vs hadur2.Hadur 3.9

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 58.4% | 71.4% | 45.2% | 25 / 35 | 10.1% | 9.0% | 15 | 0 | 1.19 / 13.5 | 50.2% | +8.2 |
| 2 | 47.4% | 57.1% | 38.1% | 20 / 35 | 9.8% | 9.1% | 15 | 0 | 1.18 / 50.0 | 48.2% | -0.8 |
| 3 | 63.4% | 82.9% | 42.5% | 29 / 35 | 9.8% | 8.7% | 10 | 0 | 1.15 / 14.7 | 49.2% | +14.1 |
| 4 | 59.1% | 74.3% | 41.6% | 26 / 35 | 9.4% | 8.5% | 10 | 0 | 1.22 / 586.6 | 51.7% | +7.3 |
| 5 | 55.5% | 71.4% | 37.5% | 25 / 35 | 9.4% | 8.8% | 17 | 0 | 1.17 / 14.3 | 64.4% | -8.9 |
| 6 | 54.3% | 68.6% | 39.8% | 24 / 35 | 9.4% | 8.7% | 16 | 0 | 1.23 / 570.0 | 56.4% | -2.1 |
| 7 | 50.8% | 62.9% | 38.7% | 22 / 35 | 9.7% | 9.1% | 12 | 0 | 1.19 / 14.2 | 52.9% | -2.1 |
| 8 | 48.6% | 60.0% | 37.0% | 21 / 35 | 9.3% | 8.8% | 8 | 0 | 1.19 / 13.5 | 59.7% | -11.0 |
| 9 | 54.5% | 65.7% | 42.2% | 23 / 35 | 9.1% | 8.4% | 14 | 0 | 1.21 / 164.8 | 51.0% | +3.5 |
| 10 | 58.4% | 74.3% | 41.9% | 26 / 35 | 9.9% | 8.9% | 7 | 0 | 1.22 / 13.5 | 57.1% | +1.3 |

Mean score share 55.1% ± 3.6, baseline 54.1% ± 3.7, paired diff +1.0 ± 5.5.

## Full report

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 124 over 10 battles (12.4 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | rumble-8 | 55.1% ± 3.6 | 68.9% ± 5.5 | 40.5% ± 1.9 | 241 / 350 | 9.6% ± 0.2 | 8.8% ± 0.2 | 124 | 0 | 1.23 / 586.6 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 10 | 6 | 0 | 0 | 0.35 | 4 | 4 | 0 |

6 of 10 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 30537 | 167 | 30534 | 30534 (100.0%) | 3 (0.0%) | 0 (0.0%) | 2271 | 360 | 80 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 32630 | 3231 (9.9%) | 29566 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 650 | 454 | 650 | 1156 | 23.5 / 34.6 | 301 | 24624 | 3265 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 8.8% | 124 | 3733 | 3 | 86.4 | 3218 / 3231 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| dsekercioglu.mega.Raven 3.56j8 | dsekercioglu.mega.Raven | 1 | 35 | 330 | 9.2% | 7.3% ± 1.0 | 10.2% | 21.6% / 21.2% | 11.4% | 0 / 0 | T3/M1 | 58% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
