# theo.QuarkSoup 1.5fga (weak) vs hadur2.Hadur 3.9

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 70.7% | 85.7% | 56.0% | 30 / 35 | 11.8% | 7.0% | 14 | 0 | 1.00 / 16.2 | 74.1% | -3.3 |
| 2 | 76.3% | 91.4% | 61.1% | 32 / 35 | 12.4% | 6.5% | 13 | 0 | 0.97 / 14.2 | 73.3% | +3.1 |
| 3 | 76.7% | 94.3% | 58.7% | 33 / 35 | 11.9% | 6.2% | 6 | 0 | 1.00 / 17.0 | 76.7% | +0.0 |
| 4 | 63.8% | 80.0% | 49.1% | 28 / 35 | 12.5% | 8.0% | 12 | 0 | 1.04 / 15.0 | 77.6% | -13.8 |
| 5 | 74.1% | 91.4% | 56.3% | 32 / 35 | 11.9% | 6.3% | 12 | 0 | 0.99 / 14.8 | 73.9% | +0.2 |
| 6 | 64.3% | 77.1% | 51.1% | 27 / 35 | 11.7% | 7.4% | 17 | 0 | 1.01 / 15.1 | 76.3% | -12.0 |
| 7 | 68.8% | 85.7% | 53.0% | 30 / 35 | 13.2% | 7.3% | 10 | 0 | 1.02 / 14.1 | 78.7% | -9.9 |
| 8 | 72.0% | 88.6% | 55.9% | 31 / 35 | 12.9% | 7.0% | 12 | 0 | 0.98 / 15.0 | 81.0% | -9.0 |

Mean score share 70.9% ± 4.2, baseline 76.5% ± 2.2, paired diff -5.6 ± 5.3.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 96 over 8 battles (12.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| theo.QuarkSoup 1.5fga | weak | 70.9% ± 4.2 | 86.8% ± 4.9 | 55.1% ± 3.3 | 243 / 280 | 12.3% ± 0.5 | 7.0% ± 0.5 | 96 | 0 | 1.04 / 17.0 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| theo.QuarkSoup 1.5fga | 8 | 5 | 298 | 0 | 0.34 | 2 | 2 | 0 |

5 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| theo.QuarkSoup 1.5fga | 11029 | 8 | 11027 | 11007 (99.8%) | 22 (0.2%) | 20 (0.2%) | 510 | 124 | 48 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| theo.QuarkSoup 1.5fga | 13223 | 996 (7.5%) | 11111 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| theo.QuarkSoup 1.5fga | 650 | 486 | 650 | 647 | 36.2 / 29.4 | 414 | 4839 | 73 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| theo.QuarkSoup 1.5fga | 7.0% | 96 | 91 | 3 | 38.8 | 995 / 996 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| theo.QuarkSoup 1.5fga | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| theo.QuarkSoup 1.5fga | theo.QuarkSoup | 1 | 35 | 294 | 8.0% | 7.9% ± 1.5 | 11.8% | 23.6% / 23.2% | 5.5% | 0 / 0 | T3/M1 | 71% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
