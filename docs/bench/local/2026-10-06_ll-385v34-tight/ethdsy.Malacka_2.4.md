# ethdsy.Malacka 2.4 (weak) vs hadur2.Hadur 3.8.5

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 32.7% | 25.7% | 34.9% | 9 / 35 | 31.6% | 216.6% | 126 | 0 | 0.32 / 10.4 | 23.8% | +8.9 |
| 2 | 29.9% | 20.0% | 35.6% | 7 / 35 | 31.3% | 175.9% | 122 | 0 | 0.35 / 10.2 | 30.7% | -0.8 |
| 3 | 20.5% | 0.0% | 30.1% | 0 / 35 | 31.6% | 199.4% | 113 | 0 | 0.32 / 8.1 | 23.8% | -3.3 |
| 4 | 43.6% | 48.6% | 40.7% | 17 / 35 | 30.1% | 112.4% | 146 | 0 | 0.33 / 8.3 | 38.2% | +5.4 |
| 5 | 25.6% | 8.6% | 33.7% | 3 / 35 | 31.3% | 218.8% | 143 | 0 | 0.33 / 10.0 | 28.6% | -3.1 |
| 6 | 23.6% | 8.6% | 31.2% | 3 / 35 | 31.6% | 190.4% | 127 | 0 | 0.34 / 8.3 | 19.7% | +3.9 |
| 7 | 30.1% | 17.1% | 35.9% | 6 / 35 | 35.7% | 193.0% | 128 | 0 | 0.34 / 9.3 | 23.1% | +7.0 |
| 8 | 22.3% | 5.7% | 29.4% | 2 / 35 | 29.9% | 229.3% | 122 | 0 | 0.34 / 8.5 | 25.3% | -3.0 |

Mean score share 28.5% ± 6.2, baseline 26.7% ± 4.8, paired diff +1.9 ± 4.2.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1027 over 8 battles (128.4 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ethdsy.Malacka 2.4 | weak | 28.5% ± 6.2 | 16.8% ± 12.8 | 34.0% ± 3.1 | 47 / 280 | 31.6% ± 1.5 | 192.0% ± 30.6 | 1027 | 0 | 0.35 / 10.4 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ethdsy.Malacka 2.4 | 8 | 0 | 76832 | 0 | 3.67 | 7 | 6 | 0 |

0 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ethdsy.Malacka 2.4 | 6143 | 13 | 1217 | 1213 (19.7%) | 4930 (80.3%) | 4 (0.3%) | 60 | 27 | 997 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ethdsy.Malacka 2.4 | 6858 | 242 (3.5%) | 246 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ethdsy.Malacka 2.4 | 650 | 332 | 400 | 377 | 45.1 / 87.7 | 242 | 84 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ethdsy.Malacka 2.4 | 192.0% | 1027 | 19 | 3 | 4.2 | 47 / 242 (19%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ethdsy.Malacka 2.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ethdsy.Malacka 2.4 | ethdsy.Malacka | 1 | 35 | 288 | 5.6% | 5.0% ± 6.4 | 18.1% | 25.5% / 26.9% | 19.4% | 0 / 0 | T?/M? | 17% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
