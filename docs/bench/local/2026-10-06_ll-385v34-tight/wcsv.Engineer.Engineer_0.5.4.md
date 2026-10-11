# wcsv.Engineer.Engineer 0.5.4 (mid) vs hadur2.Hadur 3.8.5

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 10.0% | 2.9% | 17.0% | 1 / 35 | 5.2% | 108.1% | 150 | 0 | 0.39 / 12.0 | 8.9% | +1.1 |
| 2 | 11.2% | 5.7% | 16.9% | 2 / 35 | 6.0% | 95.5% | 145 | 0 | 0.44 / 9.2 | 6.2% | +5.0 |
| 3 | 9.5% | 0.0% | 17.9% | 0 / 35 | 6.6% | 121.2% | 130 | 0 | 0.37 / 8.2 | 5.5% | +4.0 |
| 4 | 11.1% | 2.9% | 19.0% | 1 / 35 | 6.0% | 120.9% | 142 | 0 | 0.41 / 8.7 | 6.7% | +4.4 |
| 5 | 6.9% | 0.0% | 13.8% | 0 / 35 | 4.5% | 122.0% | 140 | 0 | 0.38 / 8.5 | 5.9% | +1.0 |
| 6 | 10.4% | 2.9% | 17.7% | 1 / 35 | 5.8% | 119.5% | 149 | 0 | 0.39 / 12.9 | 7.4% | +3.0 |
| 7 | 5.9% | 0.0% | 12.0% | 0 / 35 | 4.3% | 155.9% | 138 | 0 | 0.39 / 9.5 | 6.9% | -1.0 |
| 8 | 9.5% | 0.0% | 18.2% | 0 / 35 | 7.0% | 104.9% | 134 | 0 | 0.40 / 11.9 | 9.6% | -0.1 |

Mean score share 9.3% ± 1.6, baseline 7.1% ± 1.2, paired diff +2.2 ± 1.9.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1128 over 8 battles (141.0 per battle, most in one battle 150). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | mid | 9.3% ± 1.6 | 1.8% ± 1.8 | 16.6% ± 2.0 | 5 / 280 | 5.7% ± 0.8 | 118.5% ± 15.0 | 1128 | 0 | 0.44 / 12.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 8 | 0 | 111266 | 0 | 4.03 | 9 | 8 | 0 |

0 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 10018 | 30 | 2059 | 2058 (20.5%) | 7960 (79.5%) | 1 (0.0%) | 83 | 24 | 1126 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 10595 | 571 (5.4%) | 1022 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 650 | 400 | 619 | 545 | 12.8 / 64.1 | 302 | 35 | 20 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 118.5% | 1128 | 14 | 3 | 7.0 | 145 / 571 (25%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| wcsv.Engineer.Engineer 0.5.4 | wcsv.Engineer.Engineer | 1 | 35 | 324 | 7.8% | 7.5% ± 4.8 | 10.8% | 24.4% / 23.5% | 10.5% | 0 / 0 | T?/M? | 10% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
