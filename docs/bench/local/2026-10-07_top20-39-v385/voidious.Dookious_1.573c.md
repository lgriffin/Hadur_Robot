# voidious.Dookious 1.573c (rumble-20) vs hadur2.Hadur 3.9

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 66.0% | 82.9% | 46.3% | 29 / 35 | 10.3% | 7.2% | 12 | 0 | 1.10 / 13.4 | 60.2% | +5.9 |
| 2 | 60.3% | 77.1% | 41.4% | 27 / 35 | 9.4% | 7.3% | 7 | 0 | 1.20 / 13.0 | 58.3% | +2.0 |
| 3 | 65.2% | 82.9% | 43.9% | 29 / 35 | 8.9% | 6.2% | 13 | 0 | 1.13 / 23.7 | 68.0% | -2.8 |
| 4 | 59.9% | 74.3% | 44.1% | 26 / 35 | 10.0% | 6.8% | 7 | 0 | 1.13 / 26.1 | 58.2% | +1.7 |
| 5 | 55.1% | 68.6% | 41.5% | 24 / 35 | 10.0% | 7.2% | 15 | 0 | 1.11 / 12.5 | 57.1% | -2.0 |
| 6 | 63.2% | 77.1% | 47.7% | 27 / 35 | 9.7% | 6.5% | 14 | 0 | 1.10 / 146.7 | 56.9% | +6.3 |
| 7 | 54.6% | 65.7% | 42.7% | 23 / 35 | 9.0% | 7.2% | 13 | 0 | 1.15 / 13.0 | 70.5% | -15.9 |
| 8 | 63.6% | 82.9% | 43.1% | 29 / 35 | 9.8% | 7.4% | 6 | 0 | 1.21 / 13.9 | 58.5% | +5.2 |
| 9 | 62.2% | 77.1% | 45.0% | 27 / 35 | 9.4% | 7.0% | 6 | 0 | 1.17 / 506.2 | 61.8% | +0.4 |
| 10 | 61.4% | 77.1% | 43.4% | 27 / 35 | 9.0% | 6.8% | 12 | 0 | 1.19 / 12.4 | 62.6% | -1.2 |

Mean score share 61.2% ± 2.8, baseline 61.2% ± 3.3, paired diff -0.0 ± 4.6.

## Full report

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 105 over 10 battles (10.5 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | rumble-20 | 61.2% ± 2.8 | 76.6% ± 4.2 | 43.9% ± 1.4 | 268 / 350 | 9.5% ± 0.3 | 7.0% ± 0.3 | 105 | 0 | 1.21 / 506.2 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | 10 | 8 | 0 | 0 | 0.30 | 2 | 2 | 0 |

8 of 10 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | 18551 | 18 | 18552 | 18551 (100.0%) | 0 (0.0%) | 1 (0.0%) | 1265 | 144 | 53 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| voidious.Dookious 1.573c | 22549 | 1776 (7.9%) | 19194 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | 650 | 485 | 650 | 831 | 24.5 / 31.2 | 243 | 10015 | 5832 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | 7.0% | 105 | 1702 | 3 | 52.5 | 1774 / 1776 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | voidious.Dookious | 1 | 35 | 306 | 7.3% | 6.7% ± 1.2 | 9.7% | 23.4% / 22.3% | 12.4% | 0 / 0 | T2/M1 | 61% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
