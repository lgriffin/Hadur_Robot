# pez.rumble.CassiusClay 2rho.02no (mid) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 55.7% | 54.3% | 56.8% | 19 / 35 | 13.2% | 8.3% | 24 | 0 | 1.21 / 18.2 | 53.2% | +2.4 |
| 2 | 55.9% | 57.1% | 54.7% | 20 / 35 | 13.4% | 8.4% | 11 | 0 | 1.15 / 17.9 | 67.6% | -11.7 |
| 3 | 66.5% | 71.4% | 60.6% | 25 / 35 | 12.6% | 8.0% | 12 | 0 | 1.18 / 18.5 | 58.3% | +8.2 |
| 4 | 64.7% | 68.6% | 60.6% | 24 / 35 | 11.3% | 7.4% | 15 | 0 | 1.19 / 17.7 | 58.1% | +6.5 |
| 5 | 61.9% | 64.7% | 58.7% | 23 / 35 | 12.7% | 7.7% | 22 | 0 | 1.15 / 19.7 | 59.7% | +2.1 |
| 6 | 62.1% | 65.7% | 58.7% | 23 / 35 | 12.5% | 7.8% | 16 | 0 | 1.18 / 17.6 | 58.8% | +3.3 |
| 7 | 63.2% | 64.7% | 61.5% | 23 / 35 | 13.5% | 7.8% | 20 | 0 | 1.15 / 17.9 | 59.7% | +3.4 |
| 8 | 58.9% | 60.0% | 57.3% | 21 / 35 | 12.4% | 7.3% | 15 | 0 | 1.16 / 18.9 | 72.1% | -13.2 |
| 9 | 62.1% | 67.6% | 56.6% | 24 / 35 | 12.2% | 7.6% | 14 | 0 | 1.17 / 33.5 | 69.0% | -6.9 |
| 10 | 66.1% | 71.4% | 60.5% | 25 / 35 | 12.0% | 7.6% | 13 | 0 | 1.17 / 19.1 | 55.2% | +10.8 |
| 11 | 63.8% | 68.6% | 58.6% | 24 / 35 | 12.9% | 7.4% | 16 | 0 | 1.15 / 17.5 | 70.1% | -6.3 |
| 12 | 65.8% | 71.4% | 60.2% | 25 / 35 | 11.9% | 7.4% | 15 | 0 | 1.11 / 19.2 | 62.3% | +3.6 |
| 13 | 73.3% | 80.0% | 66.2% | 28 / 35 | 13.1% | 7.0% | 17 | 0 | 1.10 / 18.8 | 70.6% | +2.8 |
| 14 | 64.2% | 68.6% | 59.3% | 24 / 35 | 12.1% | 7.6% | 19 | 0 | 1.17 / 17.5 | 63.7% | +0.5 |
| 15 | 57.5% | 60.0% | 55.1% | 21 / 35 | 12.3% | 8.3% | 13 | 0 | 1.16 / 18.5 | 55.7% | +1.8 |
| 16 | 65.7% | 68.6% | 61.9% | 24 / 35 | 11.1% | 6.5% | 13 | 0 | 1.12 / 19.9 | 59.0% | +6.7 |
| 17 | 64.6% | 65.7% | 62.6% | 23 / 35 | 13.1% | 6.9% | 18 | 0 | 1.14 / 18.2 | 61.9% | +2.7 |
| 18 | 74.1% | 82.9% | 64.6% | 29 / 35 | 12.7% | 7.7% | 17 | 0 | 1.16 / 18.7 | 55.6% | +18.5 |
| 19 | 62.8% | 65.7% | 59.7% | 23 / 35 | 13.1% | 8.4% | 15 | 0 | 1.19 / 18.9 | 65.6% | -2.8 |
| 20 | 58.7% | 60.0% | 56.5% | 21 / 35 | 12.3% | 7.8% | 13 | 0 | 1.17 / 19.9 | 60.8% | -2.1 |

Mean score share 63.4% ± 2.3, baseline 61.8% ± 2.6, paired diff +1.5 ± 3.5.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 318 over 20 battles (15.9 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pez.rumble.CassiusClay 2rho.02no | mid | 63.4% ± 2.3 | 66.9% ± 3.2 | 59.5% ± 1.4 | 469 / 700 | 12.5% ± 0.3 | 7.6% ± 0.2 | 318 | 0 | 1.21 / 33.5 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pez.rumble.CassiusClay 2rho.02no | 20 | 13 | 298 | 0 | 0.45 | 7 | 7 | 0 |

13 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| pez.rumble.CassiusClay 2rho.02no | 69443 | 30 | 70374 | 69422 (100.0%) | 21 (0.0%) | 952 (1.4%) | 6225 | 640 | 225 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| pez.rumble.CassiusClay 2rho.02no | 74978 | 7414 (9.9%) | 71062 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| pez.rumble.CassiusClay 2rho.02no | 650 | 476 | 640 | 1342 | 40.3 / 27.4 | 2116 | 7560 | 303 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| pez.rumble.CassiusClay 2rho.02no | 7.6% | 318 | 5917 | 3 | 98.3 | 7402 / 7414 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| pez.rumble.CassiusClay 2rho.02no | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| pez.rumble.CassiusClay 2rho.02no | pez.rumble.CassiusClay | 1 | 35 | 332 | 9.6% | 7.6% ± 0.9 | 11.9% | 20.5% / 21.0% | 9.1% | 0 / 0 | T3/M1 | 58% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
