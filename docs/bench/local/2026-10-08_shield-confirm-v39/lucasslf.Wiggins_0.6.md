# lucasslf.Wiggins 0.6 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 96.2% | 100.0% | 74.8% | 35 / 35 | 12.0% | 1.7% | 9 | 0 | 0.41 / 17.0 | 75.0% | +21.3 |
| 2 | 95.3% | 100.0% | 53.6% | 35 / 35 | 10.4% | 1.6% | 8 | 0 | 0.40 / 17.6 | 75.0% | +20.4 |
| 3 | 95.9% | 100.0% | 67.1% | 35 / 35 | 11.2% | 1.5% | 7 | 0 | 0.41 / 19.9 | 79.7% | +16.2 |
| 4 | 71.8% | 88.6% | 55.8% | 31 / 35 | 12.7% | 7.1% | 15 | 0 | 1.05 / 11.7 | 78.1% | -6.3 |
| 5 | 97.1% | 100.0% | 75.3% | 35 / 35 | 12.9% | 1.4% | 11 | 0 | 0.39 / 20.0 | 78.3% | +18.8 |
| 6 | 95.9% | 100.0% | 66.9% | 35 / 35 | 4.5% | 1.5% | 9 | 0 | 0.46 / 18.4 | 79.2% | +16.8 |
| 7 | 94.8% | 100.0% | 63.4% | 35 / 35 | 7.8% | 1.9% | 10 | 0 | 0.44 / 20.5 | 73.3% | +21.6 |
| 8 | 78.4% | 100.0% | 56.6% | 35 / 35 | 11.8% | 7.6% | 12 | 0 | 1.04 / 20.9 | 75.0% | +3.3 |
| 9 | 94.4% | 100.0% | 68.9% | 35 / 35 | 11.0% | 1.9% | 9 | 0 | 0.44 / 20.3 | 71.2% | +23.2 |
| 10 | 93.9% | 100.0% | 37.7% | 35 / 35 | 6.5% | 1.6% | 8 | 0 | 0.42 / 20.4 | 81.6% | +12.2 |
| 11 | 92.2% | 100.0% | 46.2% | 35 / 35 | 3.8% | 1.9% | 11 | 0 | 0.46 / 19.5 | 81.8% | +10.4 |
| 12 | 95.8% | 100.0% | 77.6% | 35 / 35 | 10.2% | 1.8% | 11 | 0 | 0.42 / 18.4 | 76.0% | +19.8 |
| 13 | 91.9% | 100.0% | 39.3% | 35 / 35 | 7.4% | 1.9% | 9 | 0 | 0.39 / 18.3 | 72.7% | +19.2 |
| 14 | 95.1% | 100.0% | 60.9% | 35 / 35 | 7.3% | 1.9% | 10 | 0 | 0.45 / 19.0 | 79.1% | +16.0 |
| 15 | 92.9% | 100.0% | 66.1% | 35 / 35 | 11.4% | 1.9% | 10 | 0 | 0.48 / 18.2 | 85.9% | +7.0 |
| 16 | 93.9% | 100.0% | 64.8% | 35 / 35 | 6.5% | 1.8% | 9 | 0 | 0.43 / 20.2 | 75.3% | +18.6 |

Mean score share 92.2% ± 3.7, baseline 77.3% ± 2.1, paired diff +14.9 ± 4.2.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 158 over 16 battles (9.9 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| lucasslf.Wiggins 0.6 | shield-confirm | 92.2% ± 3.7 | 99.3% ± 1.5 | 60.9% ± 6.4 | 556 / 560 | 9.2% ± 1.6 | 2.4% ± 1.0 | 158 | 0 | 1.05 / 20.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| lucasslf.Wiggins 0.6 | 16 | 266 | 4.7% | 93.2% | 0.0% | 2.1% | 1335 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| lucasslf.Wiggins 0.6 | 16 | 16 | 0 | 0 | 0.28 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| lucasslf.Wiggins 0.6 | 50258 | 878 | 50260 | 50256 (100.0%) | 2 (0.0%) | 4 (0.0%) | 378 | 88 | 54 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| lucasslf.Wiggins 0.6 | 8171 | 44296 (542.1%) | 4988 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| lucasslf.Wiggins 0.6 | 650 | 467 | 650 | 1185 | 10.5 / 7.1 | 179 | 1913 | 1021 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| lucasslf.Wiggins 0.6 | 2.4% | 158 | 775 | 3 | 11.2 | 612 / 44296 (1%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| lucasslf.Wiggins 0.6 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| lucasslf.Wiggins 0.6 | lucasslf.Wiggins | 1 | 35 | 296 | 2.4% | 6.4% ± 3.2 | 11.1% | 29.5% / 27.5% | 6.4% | 0 / 0 | T?/M? | 94% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
