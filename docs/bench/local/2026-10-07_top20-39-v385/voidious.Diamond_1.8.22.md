# voidious.Diamond 1.8.22 (rumble-6) vs hadur2.Hadur 3.9

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 49.9% | 60.0% | 39.8% | 21 / 35 | 6.9% | 8.9% | 36 | 0 | 1.75 / 41.7 | 38.4% | +11.5 |
| 2 | 50.7% | 60.0% | 40.1% | 21 / 35 | 6.9% | 8.9% | 32 | 0 | 1.72 / 38.0 | 50.8% | -0.1 |
| 3 | 44.5% | 51.4% | 36.8% | 18 / 35 | 6.4% | 8.6% | 29 | 0 | 1.67 / 39.7 | 48.9% | -4.3 |
| 4 | 49.3% | 60.0% | 37.7% | 21 / 35 | 6.7% | 9.4% | 35 | 0 | 1.63 / 37.1 | 56.5% | -7.2 |
| 5 | 49.4% | 57.1% | 41.6% | 20 / 35 | 7.4% | 8.8% | 34 | 0 | 1.71 / 64.9 | 42.5% | +6.9 |
| 6 | 47.8% | 54.3% | 40.9% | 19 / 35 | 6.6% | 8.4% | 36 | 0 | 1.62 / 244.6 | 46.1% | +1.6 |
| 7 | 50.8% | 57.1% | 45.2% | 20 / 35 | 7.2% | 8.7% | 36 | 0 | 1.68 / 36.3 | 47.4% | +3.4 |
| 8 | 31.5% | 28.6% | 36.3% | 10 / 35 | 6.1% | 9.3% | 20 | 0 | 1.70 / 38.9 | 45.8% | -14.3 |
| 9 | 54.0% | 65.7% | 41.7% | 23 / 35 | 7.2% | 9.2% | 36 | 0 | 1.80 / 38.8 | 55.8% | -1.8 |
| 10 | 47.4% | 54.3% | 40.6% | 19 / 35 | 6.7% | 9.3% | 31 | 0 | 1.76 / 38.5 | 50.3% | -2.9 |

Mean score share 47.5% ± 4.4, baseline 48.3% ± 4.0, paired diff -0.7 ± 5.2.

## Full report

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 325 over 10 battles (32.5 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | rumble-6 | 47.5% ± 4.4 | 54.9% ± 7.2 | 40.1% ± 1.9 | 192 / 350 | 6.8% ± 0.3 | 8.9% ± 0.2 | 325 | 0 | 1.80 / 244.6 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | 10 | 6 | 0 | 0 | 0.93 | 4 | 3 | 0 |

6 of 10 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | 79335 | 1617 | 81824 | 79323 (100.0%) | 12 (0.0%) | 2501 (3.1%) | 5002 | 479 | 320 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| voidious.Diamond 1.8.22 | 80640 | 8766 (10.9%) | 78918 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | 650 | 537 | 650 | 2692 | 21.7 / 32.4 | 187 | 27035 | 332 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | 9.0% | 325 | 1807 | 3 | 231.9 | 8752 / 8766 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | voidious.Diamond | 1 | 35 | 302 | 9.6% | 8.2% ± 0.9 | 7.4% | 22.8% / 21.2% | 9.4% | 0 / 0 | T3/M1 | 48% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
