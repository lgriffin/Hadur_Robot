# jwst.DAD.DarkAndDarker 1.1 (weak) vs hadur2.Hadur 3.8.5

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 56.5% | 60.0% | 53.8% | 21 / 35 | 14.9% | 20.3% | 21 | 0 | 0.96 / 16.3 | 66.1% | -9.5 |
| 2 | 65.0% | 68.6% | 62.1% | 24 / 35 | 18.5% | 10.1% | 14 | 0 | 0.88 / 15.2 | 68.6% | -3.6 |
| 3 | 58.3% | 60.0% | 56.6% | 21 / 35 | 15.7% | 14.4% | 9 | 0 | 0.93 / 15.2 | 82.7% | -24.4 |
| 4 | 84.6% | 94.3% | 75.6% | 33 / 35 | 18.0% | 7.5% | 10 | 0 | 0.79 / 15.5 | 61.9% | +22.8 |
| 5 | 68.7% | 74.3% | 63.3% | 26 / 35 | 17.3% | 10.6% | 8 | 0 | 0.90 / 15.5 | 52.3% | +16.4 |
| 6 | 60.6% | 60.0% | 60.6% | 21 / 35 | 18.4% | 12.5% | 9 | 0 | 0.89 / 14.2 | 91.4% | -30.7 |
| 7 | 63.4% | 65.7% | 61.1% | 23 / 35 | 18.4% | 11.6% | 13 | 0 | 0.91 / 16.9 | 73.3% | -9.9 |
| 8 | 55.6% | 57.1% | 54.1% | 20 / 35 | 16.3% | 15.0% | 11 | 0 | 0.95 / 13.0 | 87.0% | -31.4 |

Mean score share 64.1% ± 7.9, baseline 72.9% ± 11.1, paired diff -8.8 ± 17.0.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 95 over 8 battles (11.9 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jwst.DAD.DarkAndDarker 1.1 | weak | 64.1% ± 7.9 | 67.5% ± 10.2 | 60.9% ± 5.8 | 189 / 280 | 17.2% ± 1.2 | 12.8% ± 3.2 | 95 | 0 | 0.96 / 16.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jwst.DAD.DarkAndDarker 1.1 | 8 | 4 | 238 | 0 | 0.34 | 3 | 3 | 0 |

4 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jwst.DAD.DarkAndDarker 1.1 | 8161 | 20 | 8147 | 8139 (99.7%) | 22 (0.3%) | 8 (0.1%) | 423 | 115 | 51 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jwst.DAD.DarkAndDarker 1.1 | 8219 | 510 (6.2%) | 3640 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jwst.DAD.DarkAndDarker 1.1 | 650 | 435 | 575 | 457 | 51.6 / 33.4 | 4231 | 2122 | 1455 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jwst.DAD.DarkAndDarker 1.1 | 12.8% | 95 | 55 | 3 | 28.7 | 508 / 510 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jwst.DAD.DarkAndDarker 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| jwst.DAD.DarkAndDarker 1.1 | jwst.DAD.DarkAndDarker | 1 | 35 | 320 | 16.5% | 13.3% ± 2.2 | 15.7% | 31.0% / 29.2% | 9.8% | 0 / 0 | T3/M0 | 55% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
