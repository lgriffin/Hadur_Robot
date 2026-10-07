# gh.GresSuffurd 0.4.13 (rumble-14) vs hadur2.Hadur 3.9

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 50.0% | 60.0% | 40.8% | 21 / 35 | 11.1% | 9.3% | 20 | 0 | 1.09 / 19.2 | 74.7% | -24.7 |
| 2 | 60.5% | 71.4% | 49.4% | 25 / 35 | 11.5% | 8.0% | 17 | 0 | 1.04 / 20.6 | 66.6% | -6.1 |
| 3 | 55.8% | 65.7% | 46.2% | 23 / 35 | 10.8% | 9.2% | 16 | 0 | 1.06 / 103.5 | 61.1% | -5.2 |
| 4 | 60.9% | 74.3% | 46.6% | 26 / 35 | 10.6% | 8.4% | 24 | 0 | 1.09 / 20.5 | 56.4% | +4.5 |
| 5 | 62.4% | 76.5% | 47.8% | 27 / 35 | 10.8% | 7.8% | 17 | 0 | 1.02 / 20.0 | 64.2% | -1.8 |
| 6 | 55.9% | 65.7% | 45.4% | 23 / 35 | 10.5% | 9.3% | 20 | 0 | 1.08 / 20.3 | 64.6% | -8.8 |
| 7 | 52.6% | 60.0% | 45.5% | 21 / 35 | 10.7% | 9.0% | 19 | 0 | 1.08 / 91.6 | 62.5% | -9.9 |
| 8 | 61.2% | 71.4% | 51.1% | 25 / 35 | 11.2% | 8.6% | 24 | 0 | 1.05 / 19.4 | 66.4% | -5.2 |
| 9 | 60.9% | 74.3% | 47.7% | 26 / 35 | 11.1% | 8.7% | 19 | 0 | 1.06 / 37.2 | 62.6% | -1.7 |
| 10 | 64.6% | 80.0% | 48.8% | 28 / 35 | 11.2% | 8.2% | 13 | 0 | 1.07 / 18.5 | 68.0% | -3.4 |

Mean score share 58.5% ± 3.3, baseline 64.7% ± 3.4, paired diff -6.2 ± 5.5.

## Full report

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 189 over 10 battles (18.9 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | rumble-14 | 58.5% ± 3.3 | 69.9% ± 4.9 | 46.9% ± 2.0 | 245 / 350 | 11.0% ± 0.2 | 8.6% ± 0.4 | 189 | 0 | 1.09 / 103.5 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 10 | 8 | 0 | 0 | 0.54 | 2 | 2 | 0 |

8 of 10 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 25833 | 21 | 25839 | 25833 (100.0%) | 0 (0.0%) | 6 (0.0%) | 1872 | 245 | 138 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 27209 | 2833 (10.4%) | 24879 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 650 | 457 | 650 | 995 | 29.0 / 32.8 | 863 | 10933 | 247 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 8.6% | 189 | 2253 | 3 | 73.0 | 2831 / 2833 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | gh.GresSuffurd | 1 | 35 | 294 | 9.0% | 7.6% ± 1.1 | 10.9% | 24.1% / 22.4% | 12.9% | 0 / 0 | T3/M1 | 64% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
