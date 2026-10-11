# exauge.GateKeeper 1.1.121g (lower) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 80.4% | 94.3% | 66.1% | 33 / 35 | 15.5% | 5.9% | 10 | 0 | 0.85 / 12.0 | 76.7% | +3.7 |
| 2 | 77.2% | 94.3% | 60.7% | 33 / 35 | 15.8% | 7.7% | 12 | 0 | 0.89 / 13.8 | 81.5% | -4.4 |
| 3 | 74.5% | 94.3% | 55.6% | 33 / 35 | 14.4% | 7.9% | 9 | 0 | 0.91 / 16.3 | 74.6% | -0.1 |
| 4 | 72.7% | 88.2% | 57.9% | 31 / 35 | 13.8% | 8.0% | 11 | 0 | 0.95 / 12.6 | 76.8% | -4.1 |
| 5 | 76.7% | 91.4% | 61.8% | 32 / 35 | 14.2% | 7.1% | 10 | 0 | 0.87 / 12.7 | 80.8% | -4.2 |
| 6 | 76.3% | 91.4% | 60.4% | 32 / 35 | 12.9% | 6.2% | 10 | 0 | 0.86 / 13.4 | 79.1% | -2.8 |
| 7 | 81.6% | 100.0% | 63.3% | 35 / 35 | 14.8% | 7.2% | 13 | 0 | 0.89 / 18.1 | 81.3% | +0.4 |
| 8 | 75.2% | 91.4% | 58.6% | 32 / 35 | 13.8% | 7.0% | 10 | 0 | 0.91 / 16.9 | 75.4% | -0.2 |
| 9 | 82.2% | 100.0% | 63.8% | 35 / 35 | 14.4% | 6.6% | 9 | 0 | 0.89 / 12.4 | 76.4% | +5.7 |
| 10 | 73.5% | 88.6% | 58.5% | 31 / 35 | 15.2% | 7.5% | 13 | 0 | 0.94 / 13.3 | 81.9% | -8.4 |
| 11 | 78.6% | 94.3% | 63.4% | 33 / 35 | 15.8% | 7.3% | 9 | 0 | 0.88 / 12.6 | 80.9% | -2.4 |
| 12 | 75.6% | 88.6% | 63.0% | 31 / 35 | 15.6% | 6.6% | 11 | 0 | 0.83 / 18.4 | 76.4% | -0.8 |
| 13 | 78.8% | 91.4% | 65.9% | 32 / 35 | 15.5% | 6.5% | 12 | 0 | 0.84 / 16.4 | 75.9% | +2.9 |
| 14 | 81.6% | 94.3% | 67.7% | 33 / 35 | 14.2% | 5.6% | 12 | 0 | 0.84 / 12.8 | 78.5% | +3.2 |
| 15 | 82.2% | 97.1% | 64.7% | 34 / 35 | 13.4% | 5.5% | 11 | 0 | 0.80 / 11.3 | 82.1% | +0.1 |
| 16 | 82.0% | 97.1% | 66.0% | 34 / 35 | 15.0% | 6.2% | 11 | 0 | 0.85 / 16.7 | 81.0% | +1.0 |

Mean score share 78.1% ± 1.8, baseline 78.7% ± 1.4, paired diff -0.6 ± 1.9.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 173 over 16 battles (10.8 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | lower | 78.1% ± 1.8 | 93.6% ± 2.0 | 62.3% ± 1.8 | 524 / 560 | 14.6% ± 0.5 | 6.8% ± 0.4 | 173 | 0 | 0.95 / 18.4 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 16 | 15 | 298 | 0 | 0.31 | 0 | 0 | 0 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 14981 | 12 | 15085 | 14931 (99.7%) | 50 (0.3%) | 154 (1.0%) | 2063 | 312 | 51 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 19366 | 966 (5.0%) | 2969 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 650 | 506 | 594 | 492 | 40.9 / 24.8 | 2229 | 7414 | 2338 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 6.8% | 173 | 110 | 3 | 26.9 | 962 / 966 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| exauge.GateKeeper 1.1.121g | exauge.GateKeeper | 1 | 35 | 310 | 6.8% | 7.5% ± 1.8 | 13.4% | 30.1% / 26.3% | 25.8% | 0 / 0 | T3/M0 | 81% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
