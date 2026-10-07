# gwah.GBotMarkIV 1.0 (weak) vs hadur2.Hadur 3.9

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 99.5% | 100.0% | 99.1% | 35 / 35 | 75.3% | 3.6% | 15 | 0 | 0.70 / 10.5 | 99.3% | +0.2 |
| 2 | 99.1% | 100.0% | 98.2% | 35 / 35 | 75.8% | 6.4% | 14 | 0 | 0.66 / 11.5 | 98.2% | +0.9 |
| 3 | 99.9% | 100.0% | 99.9% | 35 / 35 | 73.8% | 0.4% | 11 | 0 | 0.68 / 12.8 | 99.6% | +0.3 |
| 4 | 98.4% | 100.0% | 97.0% | 35 / 35 | 74.0% | 1.5% | 16 | 0 | 0.68 / 23.1 | 98.9% | -0.5 |
| 5 | 99.8% | 100.0% | 99.5% | 35 / 35 | 72.5% | 0.8% | 12 | 0 | 0.70 / 10.7 | 99.7% | +0.1 |
| 6 | 98.5% | 100.0% | 97.2% | 35 / 35 | 77.6% | 10.0% | 17 | 0 | 0.67 / 11.4 | 98.7% | -0.2 |
| 7 | 98.7% | 100.0% | 97.5% | 35 / 35 | 74.4% | 11.7% | 15 | 0 | 0.64 / 12.8 | 98.7% | +0.0 |
| 8 | 99.8% | 100.0% | 99.7% | 35 / 35 | 74.0% | 0.8% | 12 | 0 | 0.70 / 11.6 | 99.7% | +0.1 |
| 9 | 99.6% | 100.0% | 99.2% | 35 / 35 | 75.1% | 0.7% | 11 | 0 | 0.68 / 11.6 | 99.8% | -0.2 |
| 10 | 99.0% | 100.0% | 98.1% | 35 / 35 | 77.4% | 4.9% | 16 | 0 | 0.70 / 12.4 | 99.6% | -0.6 |
| 11 | 99.6% | 100.0% | 99.3% | 35 / 35 | 77.8% | 0.3% | 13 | 0 | 0.69 / 10.8 | 99.8% | -0.2 |
| 12 | 99.3% | 100.0% | 98.7% | 35 / 35 | 77.3% | 1.7% | 17 | 0 | 0.70 / 11.4 | 99.6% | -0.2 |
| 13 | 99.4% | 100.0% | 98.8% | 35 / 35 | 73.3% | 1.7% | 15 | 0 | 0.74 / 11.7 | 99.6% | -0.2 |
| 14 | 99.7% | 100.0% | 99.5% | 35 / 35 | 75.0% | 0.4% | 13 | 0 | 0.73 / 11.8 | 99.8% | -0.1 |
| 15 | 98.6% | 100.0% | 97.3% | 35 / 35 | 74.2% | 9.9% | 19 | 0 | 0.70 / 40.3 | 98.3% | +0.3 |
| 16 | 99.2% | 100.0% | 98.5% | 35 / 35 | 70.6% | 0.6% | 17 | 0 | 0.70 / 11.6 | 96.8% | +2.5 |

Mean score share 99.3% ± 0.3, baseline 99.1% ± 0.4, paired diff +0.1 ± 0.4.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.BattleRunner x12), parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 233 over 16 battles (14.6 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| gwah.GBotMarkIV 1.0 | weak | 99.3% ± 0.3 | 100.0% ± 0.0 | 98.6% ± 0.5 | 560 / 560 | 74.9% ± 1.1 | 3.5% ± 2.1 | 233 | 0 | 0.74 / 40.3 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| gwah.GBotMarkIV 1.0 | 16 | 8 | 2145 | 0 | 0.42 | 0 | 0 | 0 |

8 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| gwah.GBotMarkIV 1.0 | 3889 | 16 | 3766 | 3762 (96.7%) | 127 (3.3%) | 4 (0.1%) | 120 | 99 | 49 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| gwah.GBotMarkIV 1.0 | 3988 | 143 (3.6%) | 64 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| gwah.GBotMarkIV 1.0 | 650 | 214 | 400 | 133 | 82.0 / 1.2 | 3028 | 4731 | 446 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| gwah.GBotMarkIV 1.0 | 3.5% | 233 | 232 | 3 | 6.7 | 132 / 143 (92%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| gwah.GBotMarkIV 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| gwah.GBotMarkIV 1.0 | gwah.GBotMarkIV | 1 | 35 | 292 | 2.1% | 0.4% ± 1.5 | 37.3% | 22.6% / 23.9% | 3.8% | 0 / 0 | T0/M? | 99% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
