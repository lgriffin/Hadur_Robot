# theo.QuarkSoup 1.5fga (weak) vs hadur2.Hadur 3.8.5

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 14.6% | 11.4% | 18.4% | 4 / 35 | 6.6% | 121.6% | 164 | 0 | 0.45 / 8.8 | 9.6% | +5.0 |
| 2 | 17.3% | 11.4% | 23.3% | 4 / 35 | 7.0% | 109.4% | 158 | 0 | 0.44 / 15.3 | 16.1% | +1.1 |
| 3 | 18.2% | 14.3% | 22.7% | 5 / 35 | 7.7% | 93.1% | 150 | 0 | 0.45 / 8.8 | 13.5% | +4.8 |
| 4 | 21.3% | 14.3% | 27.6% | 5 / 35 | 8.3% | 114.9% | 151 | 0 | 0.46 / 13.9 | 10.0% | +11.2 |
| 5 | 16.0% | 11.4% | 21.2% | 4 / 35 | 6.1% | 113.1% | 157 | 0 | 0.44 / 162.8 | 9.2% | +6.9 |
| 6 | 15.5% | 8.6% | 22.1% | 3 / 35 | 7.0% | 129.8% | 154 | 0 | 0.46 / 11.1 | 9.7% | +5.8 |
| 7 | 23.3% | 20.0% | 26.8% | 7 / 35 | 10.3% | 98.6% | 150 | 0 | 0.46 / 8.6 | 14.8% | +8.5 |
| 8 | 12.2% | 2.9% | 20.1% | 1 / 35 | 7.2% | 107.1% | 145 | 0 | 0.47 / 9.2 | 18.9% | -6.7 |

Mean score share 17.3% ± 3.0, baseline 12.7% ± 3.1, paired diff +4.6 ± 4.5.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=400000 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1229 over 8 battles (153.6 per battle, most in one battle 164). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| theo.QuarkSoup 1.5fga | weak | 17.3% ± 3.0 | 11.8% ± 4.1 | 22.8% ± 2.6 | 33 / 280 | 7.5% ± 1.1 | 111.0% ± 9.9 | 1229 | 0 | 0.47 / 162.8 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| theo.QuarkSoup 1.5fga | 8 | 0 | 127743 | 0 | 4.39 | 7 | 7 | 0 |

0 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| theo.QuarkSoup 1.5fga | 11240 | 18 | 2194 | 2185 (19.4%) | 9055 (80.6%) | 9 (0.4%) | 73 | 31 | 1177 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| theo.QuarkSoup 1.5fga | 11961 | 589 (4.9%) | 523 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| theo.QuarkSoup 1.5fga | 650 | 401 | 647 | 610 | 17.6 / 59.4 | 226 | 77 | 20 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| theo.QuarkSoup 1.5fga | 111.0% | 1229 | 16 | 3 | 7.5 | 98 / 589 (17%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| theo.QuarkSoup 1.5fga | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| theo.QuarkSoup 1.5fga | theo.QuarkSoup | 1 | 35 | 294 | 9.7% | 7.8% ± 4.4 | 7.7% | 18.3% / 22.6% | 6.5% | 0 / 0 | T?/M? | 9% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
