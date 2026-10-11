# apv.NanoLauLectrikTheCannibal 1.1 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 89.3% | 97.1% | 79.9% | 34 / 35 | 94.9% | 4.4% | 13 | 0 | 0.39 / 10.2 | 85.4% | +3.9 |
| 2 | 89.9% | 100.0% | 77.6% | 35 / 35 | 96.5% | 6.3% | 12 | 0 | 0.50 / 14.0 | 90.2% | -0.2 |
| 3 | 86.0% | 94.3% | 77.3% | 33 / 35 | 91.8% | 5.8% | 9 | 0 | 0.59 / 13.8 | 81.1% | +5.0 |
| 4 | 90.1% | 97.1% | 81.8% | 34 / 35 | 95.7% | 4.5% | 14 | 0 | 0.55 / 12.1 | 87.3% | +2.8 |
| 5 | 89.6% | 97.1% | 80.5% | 34 / 35 | 89.9% | 5.4% | 12 | 0 | 0.50 / 41.8 | 89.6% | +0.0 |
| 6 | 79.4% | 91.4% | 68.3% | 32 / 35 | 54.4% | 7.6% | 12 | 0 | 0.81 / 11.0 | 81.2% | -1.8 |
| 7 | 91.7% | 97.1% | 84.1% | 34 / 35 | 83.8% | 4.5% | 16 | 0 | 0.71 / 16.2 | 86.9% | +4.8 |
| 8 | 81.8% | 91.4% | 72.2% | 32 / 35 | 107.0% | 6.2% | 10 | 0 | 0.64 / 11.9 | 87.1% | -5.3 |
| 9 | 92.8% | 100.0% | 83.4% | 35 / 35 | 92.9% | 4.4% | 12 | 0 | 0.56 / 10.3 | 87.4% | +5.4 |
| 10 | 89.4% | 97.1% | 78.5% | 34 / 35 | 80.5% | 4.7% | 11 | 0 | 0.57 / 10.6 | 87.1% | +2.3 |
| 11 | 89.4% | 97.1% | 79.9% | 34 / 35 | 88.9% | 4.6% | 5 | 0 | 0.57 / 46.0 | 83.2% | +6.3 |
| 12 | 90.6% | 100.0% | 79.3% | 35 / 35 | 108.4% | 5.1% | 14 | 0 | 0.52 / 13.5 | 80.8% | +9.7 |
| 13 | 93.2% | 100.0% | 84.3% | 35 / 35 | 115.5% | 4.3% | 13 | 0 | 0.50 / 10.3 | 86.1% | +7.1 |
| 14 | 88.0% | 97.1% | 76.8% | 34 / 35 | 96.4% | 4.2% | 8 | 0 | 0.57 / 22.4 | 90.6% | -2.6 |
| 15 | 88.4% | 97.1% | 77.5% | 34 / 35 | 83.9% | 6.1% | 12 | 0 | 0.53 / 15.0 | 89.5% | -1.1 |
| 16 | 83.4% | 94.3% | 72.0% | 33 / 35 | 120.2% | 7.8% | 12 | 0 | 0.57 / 12.7 | 85.3% | -1.9 |

Mean score share 88.3% ± 2.1, baseline 86.2% ± 1.7, paired diff +2.1 ± 2.2.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 185 over 16 battles (11.6 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrikTheCannibal 1.1 | shield-confirm | 88.3% ± 2.1 | 96.8% ± 1.5 | 78.3% ± 2.4 | 542 / 560 | 93.8% ± 8.2 | 5.4% ± 0.6 | 185 | 0 | 0.81 / 46.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrikTheCannibal 1.1 | 16 | 520 | 10.8% | 83.5% | 0.0% | 5.7% | 603 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrikTheCannibal 1.1 | 16 | 14 | 0 | 0 | 0.33 | 2 | 2 | 0 |

14 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrikTheCannibal 1.1 | 15987 | 416 | 15989 | 15986 (100.0%) | 1 (0.0%) | 3 (0.0%) | 1277 | 166 | 105 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| apv.NanoLauLectrikTheCannibal 1.1 | 4533 | 11366 (250.7%) | 1863 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrikTheCannibal 1.1 | 650 | 338 | 403 | 443 | 43.9 / 12.4 | 1926 | 2927 | 597 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrikTheCannibal 1.1 | 5.4% | 185 | 67 | 3 | 4.5 | 252 / 11366 (2%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrikTheCannibal 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| apv.NanoLauLectrikTheCannibal 1.1 | apv.NanoLauLectrikTheCannibal | 1 | 35 | 348 | 8.0% | 13.0% ± 4.4 | 43.2% | 49.1% / 40.8% | 86.0% | 0 / 0 | T?/M? | 82% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
