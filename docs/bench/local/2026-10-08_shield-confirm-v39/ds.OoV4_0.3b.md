# ds.OoV4 0.3b (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 95.2% | 100.0% | 51.3% | 35 / 35 | 7.5% | 0.6% | 12 | 0 | 0.52 / 66.0 | 91.1% | +4.0 |
| 2 | 95.1% | 100.0% | 56.3% | 35 / 35 | 8.3% | 0.7% | 11 | 0 | 0.49 / 22.9 | 90.6% | +4.5 |
| 3 | 88.1% | 97.1% | 43.8% | 34 / 35 | 5.8% | 1.4% | 8 | 0 | 0.56 / 22.4 | 89.2% | -1.1 |
| 4 | 90.6% | 97.1% | 63.5% | 34 / 35 | 7.1% | 1.5% | 10 | 0 | 0.55 / 20.9 | 91.1% | -0.5 |
| 5 | 94.0% | 100.0% | 59.3% | 35 / 35 | 5.0% | 1.0% | 12 | 0 | 0.56 / 211.0 | 91.9% | +2.1 |
| 6 | 92.5% | 100.0% | 47.9% | 35 / 35 | 6.8% | 1.0% | 9 | 0 | 0.47 / 22.6 | 91.0% | +1.4 |
| 7 | 95.7% | 100.0% | 48.2% | 35 / 35 | 7.8% | 0.4% | 10 | 0 | 0.51 / 25.3 | 92.3% | +3.4 |
| 8 | 95.1% | 100.0% | 66.4% | 35 / 35 | 7.2% | 0.8% | 8 | 0 | 0.51 / 21.8 | 91.3% | +3.9 |
| 9 | 90.8% | 97.1% | 55.0% | 34 / 35 | 4.8% | 1.1% | 11 | 0 | 0.53 / 19.8 | 92.0% | -1.2 |
| 10 | 92.1% | 100.0% | 58.7% | 35 / 35 | 8.2% | 1.8% | 17 | 0 | 0.54 / 20.3 | 83.9% | +8.1 |
| 11 | 90.8% | 97.1% | 65.4% | 34 / 35 | 11.5% | 1.4% | 11 | 0 | 0.50 / 18.6 | 89.8% | +1.0 |
| 12 | 96.2% | 100.0% | 62.9% | 35 / 35 | 4.4% | 0.7% | 17 | 0 | 0.51 / 20.0 | 92.3% | +3.9 |
| 13 | 92.7% | 100.0% | 60.2% | 35 / 35 | 6.9% | 1.5% | 14 | 0 | 0.54 / 22.3 | 89.2% | +3.5 |
| 14 | 94.3% | 100.0% | 66.3% | 35 / 35 | 7.0% | 1.0% | 13 | 0 | 0.53 / 21.4 | 92.7% | +1.6 |
| 15 | 92.3% | 97.1% | 63.0% | 34 / 35 | 9.2% | 0.8% | 11 | 0 | 0.50 / 27.5 | 89.4% | +3.0 |
| 16 | 95.2% | 100.0% | 71.4% | 35 / 35 | 6.0% | 1.1% | 12 | 0 | 0.53 / 19.7 | 92.0% | +3.2 |

Mean score share 93.2% ± 1.2, baseline 90.6% ± 1.1, paired diff +2.6 ± 1.3.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 186 over 16 battles (11.6 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ds.OoV4 0.3b | shield-confirm | 93.2% ± 1.2 | 99.1% ± 0.7 | 58.7% ± 4.2 | 555 / 560 | 7.1% ± 0.9 | 1.1% ± 0.2 | 186 | 0 | 0.56 / 211.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ds.OoV4 0.3b | 16 | 174 | 9.0% | 87.6% | 0.0% | 3.4% | 1566 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ds.OoV4 0.3b | 16 | 16 | 0 | 0 | 0.33 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ds.OoV4 0.3b | 60336 | 129 | 60337 | 60334 (100.0%) | 2 (0.0%) | 3 (0.0%) | 242 | 79 | 79 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ds.OoV4 0.3b | 5703 | 58181 (1020.2%) | 2273 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ds.OoV4 0.3b | 650 | 483 | 650 | 1416 | 6.4 / 4.3 | 48 | 582 | 48 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ds.OoV4 0.3b | 1.1% | 186 | 82 | 3 | 3.8 | 208 / 58181 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ds.OoV4 0.3b | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ds.OoV4 0.3b | ds.OoV4 | 1 | 35 | 262 | 0.7% | 7.2% ± 3.7 | 9.3% | 27.1% / 25.8% | 4.4% | 0 / 0 | T?/M? | 95% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
