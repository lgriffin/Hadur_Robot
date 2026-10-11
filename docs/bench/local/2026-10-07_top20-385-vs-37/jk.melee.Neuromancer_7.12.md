# jk.melee.Neuromancer 7.12 (rumble-19) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 43.1% | 40.0% | 46.2% | 14 / 35 | 9.5% | 10.9% | 33 | 0 | 1.78 / 26.7 | 44.2% | -1.1 |
| 2 | 49.7% | 51.4% | 48.5% | 18 / 35 | 10.5% | 9.5% | 45 | 0 | 1.78 / 28.2 | 46.4% | +3.3 |
| 3 | 49.5% | 54.3% | 45.4% | 19 / 35 | 8.9% | 9.8% | 38 | 0 | 1.72 / 26.5 | 39.9% | +9.6 |
| 4 | 65.0% | 77.1% | 52.5% | 27 / 35 | 10.5% | 9.1% | 30 | 0 | 1.79 / 26.5 | 43.9% | +21.2 |
| 5 | 52.5% | 57.1% | 48.7% | 20 / 35 | 9.7% | 10.0% | 50 | 0 | 1.78 / 26.9 | 36.2% | +16.3 |
| 6 | 40.6% | 42.9% | 39.9% | 15 / 35 | 9.6% | 10.0% | 32 | 0 | 1.73 / 25.7 | 47.3% | -6.8 |
| 7 | 45.9% | 42.9% | 49.2% | 15 / 35 | 10.5% | 11.0% | 47 | 0 | 1.79 / 148.1 | 45.1% | +0.8 |
| 8 | 55.2% | 62.9% | 48.2% | 22 / 35 | 9.7% | 11.5% | 43 | 0 | 1.75 / 29.5 | 53.5% | +1.7 |
| 9 | 49.4% | 51.4% | 48.5% | 18 / 35 | 10.2% | 10.3% | 34 | 0 | 1.77 / 25.2 | 53.7% | -4.3 |
| 10 | 57.3% | 62.9% | 51.6% | 22 / 35 | 10.6% | 9.6% | 34 | 0 | 1.75 / 28.5 | 42.1% | +15.2 |
| 11 | 45.5% | 45.7% | 45.3% | 16 / 35 | 9.2% | 9.2% | 34 | 0 | 1.72 / 28.5 | 37.7% | +7.8 |
| 12 | 46.2% | 51.4% | 42.0% | 18 / 35 | 9.3% | 10.2% | 36 | 0 | 1.76 / 30.2 | 37.7% | +8.5 |
| 13 | 50.9% | 57.1% | 45.7% | 20 / 35 | 10.2% | 10.4% | 37 | 0 | 1.77 / 24.3 | 39.3% | +11.6 |
| 14 | 46.2% | 48.6% | 44.5% | 17 / 35 | 9.2% | 10.1% | 48 | 0 | 1.75 / 27.1 | 47.6% | -1.4 |
| 15 | 56.3% | 65.7% | 47.7% | 23 / 35 | 10.0% | 10.4% | 35 | 0 | 1.70 / 28.2 | 45.5% | +10.8 |
| 16 | 48.6% | 47.1% | 50.2% | 17 / 35 | 10.6% | 10.2% | 33 | 0 | 1.78 / 24.1 | 38.1% | +10.5 |
| 17 | 56.8% | 68.6% | 46.3% | 24 / 35 | 9.8% | 10.4% | 36 | 0 | 1.80 / 26.7 | 48.6% | +8.2 |
| 18 | 44.5% | 48.6% | 42.1% | 17 / 35 | 9.2% | 10.4% | 38 | 0 | 1.73 / 26.3 | 55.3% | -10.8 |
| 19 | 57.0% | 65.7% | 49.0% | 23 / 35 | 10.3% | 10.5% | 43 | 0 | 1.77 / 26.5 | 46.3% | +10.8 |
| 20 | 48.8% | 57.1% | 41.8% | 20 / 35 | 9.4% | 10.5% | 34 | 0 | 1.81 / 29.6 | 34.5% | +14.2 |

Mean score share 50.4% ± 2.8, baseline 44.1% ± 2.8, paired diff +6.3 ± 3.9.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 760 over 20 battles (38.0 per battle, most in one battle 50). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jk.melee.Neuromancer 7.12 | rumble-19 | 50.4% ± 2.8 | 54.9% ± 4.6 | 46.7% ± 1.6 | 385 / 700 | 9.8% ± 0.3 | 10.2% ± 0.3 | 760 | 0 | 1.81 / 148.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 20 | 14 | 595 | 0 | 1.09 | 1 | 1 | 0 |

14 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 100709 | 33 | 101967 | 100633 (99.9%) | 76 (0.1%) | 1334 (1.3%) | 8613 | 879 | 954 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 108497 | 10996 (10.1%) | 104245 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 650 | 530 | 650 | 1836 | 30.2 / 34.5 | 703 | 46305 | 89 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 10.2% | 760 | 2791 | 3 | 144.9 | 10963 / 10996 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| jk.melee.Neuromancer 7.12 | jk.melee.Neuromancer | 1 | 35 | 314 | 10.3% | 8.4% ± 1.0 | 9.8% | 23.5% / 23.0% | 0.0% | 0 / 0 | T3/M1 | 49% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
