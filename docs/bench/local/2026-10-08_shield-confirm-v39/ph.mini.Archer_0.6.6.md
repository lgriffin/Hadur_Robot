# ph.mini.Archer 0.6.6 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 93.3% | 100.0% | 20.2% | 35 / 35 | 3.2% | 3.2% | 8 | 0 | 0.36 / 16.8 | 64.1% | +29.2 |
| 2 | 77.6% | 91.4% | 22.5% | 32 / 35 | 3.9% | 4.1% | 9 | 0 | 0.44 / 15.9 | 63.0% | +14.6 |
| 3 | 92.0% | 100.0% | 27.6% | 35 / 35 | 6.5% | 2.8% | 9 | 0 | 0.34 / 14.9 | 69.0% | +23.0 |
| 4 | 89.9% | 97.1% | 39.2% | 34 / 35 | 4.1% | 3.3% | 10 | 0 | 0.36 / 20.4 | 63.9% | +26.0 |
| 5 | 89.7% | 97.1% | 44.1% | 34 / 35 | 9.0% | 3.1% | 10 | 0 | 0.36 / 14.5 | 71.5% | +18.1 |
| 6 | 89.1% | 97.1% | 26.6% | 34 / 35 | 5.5% | 3.5% | 11 | 0 | 0.35 / 15.7 | 67.3% | +21.8 |
| 7 | 83.3% | 94.3% | 19.7% | 33 / 35 | 3.6% | 3.5% | 10 | 0 | 0.40 / 18.6 | 69.4% | +13.9 |
| 8 | 78.1% | 91.4% | 35.8% | 32 / 35 | 8.5% | 4.1% | 8 | 0 | 0.42 / 20.8 | 70.7% | +7.4 |
| 9 | 92.2% | 97.1% | 33.3% | 34 / 35 | 4.5% | 2.7% | 9 | 0 | 0.33 / 18.8 | 59.3% | +32.9 |
| 10 | 94.4% | 100.0% | 51.6% | 35 / 35 | 6.1% | 2.8% | 11 | 0 | 0.38 / 14.3 | 69.6% | +24.8 |
| 11 | 77.7% | 88.6% | 34.2% | 31 / 35 | 8.4% | 3.6% | 9 | 0 | 0.40 / 15.9 | 68.0% | +9.7 |
| 12 | 81.0% | 91.4% | 26.8% | 32 / 35 | 7.8% | 3.9% | 10 | 0 | 0.40 / 15.9 | 68.0% | +12.9 |
| 13 | 76.4% | 88.6% | 24.4% | 31 / 35 | 7.0% | 4.0% | 9 | 0 | 0.37 / 13.8 | 76.7% | -0.3 |
| 14 | 83.7% | 94.3% | 34.0% | 33 / 35 | 7.1% | 3.8% | 8 | 0 | 0.41 / 17.5 | 67.6% | +16.1 |
| 15 | 74.1% | 85.7% | 21.4% | 30 / 35 | 9.3% | 3.7% | 10 | 0 | 0.38 / 18.9 | 74.2% | -0.1 |
| 16 | 81.7% | 94.3% | 35.5% | 33 / 35 | 6.0% | 3.8% | 9 | 0 | 0.50 / 14.8 | 75.5% | +6.2 |

Mean score share 84.6% ± 3.6, baseline 68.6% ± 2.5, paired diff +16.0 ± 5.3.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 150 over 16 battles (9.4 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ph.mini.Archer 0.6.6 | shield-confirm | 84.6% ± 3.6 | 94.3% ± 2.4 | 31.1% ± 4.8 | 528 / 560 | 6.3% ± 1.1 | 3.5% ± 0.2 | 150 | 0 | 0.50 / 20.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ph.mini.Archer 0.6.6 | 16 | 393 | 25.5% | 64.3% | 0.0% | 10.2% | 1104 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ph.mini.Archer 0.6.6 | 16 | 16 | 0 | 0 | 0.27 | 0 | 0 | 0 |

16 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ph.mini.Archer 0.6.6 | 37249 | 1080 | 37250 | 37249 (100.0%) | 0 (0.0%) | 1 (0.0%) | 80 | 23 | 63 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ph.mini.Archer 0.6.6 | 4013 | 35346 (880.8%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ph.mini.Archer 0.6.6 | 650 | 463 | 650 | 954 | 3.3 / 7.2 | 1 | 628 | 3006 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ph.mini.Archer 0.6.6 | 3.5% | 150 | 75 | 3 | 2.5 | 98 / 35346 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ph.mini.Archer 0.6.6 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ph.mini.Archer 0.6.6 | ph.mini.Archer | 1 | 35 | 292 | 4.0% | 12.0% ± 4.3 | 9.9% | 24.6% / 23.5% | 7.8% | 0 / 0 | T?/M? | 82% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
