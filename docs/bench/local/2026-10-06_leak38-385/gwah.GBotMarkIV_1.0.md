# gwah.GBotMarkIV 1.0 (weak) vs hadur2.Hadur 3.8.5

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 98.7% | 100.0% | 97.6% | 35 / 35 | 78.2% | 0.5% | 14 | 0 | 0.60 / 10.0 | 98.2% | +0.5 |
| 2 | 99.1% | 100.0% | 98.2% | 35 / 35 | 75.8% | 6.4% | 17 | 0 | 0.59 / 9.0 | 99.0% | +0.1 |
| 3 | 99.7% | 100.0% | 99.6% | 35 / 35 | 77.8% | 0.4% | 13 | 0 | 0.66 / 10.4 | 99.1% | +0.6 |
| 4 | 98.4% | 100.0% | 97.0% | 35 / 35 | 74.0% | 1.5% | 18 | 0 | 0.74 / 10.5 | 98.7% | -0.3 |
| 5 | 99.6% | 100.0% | 99.2% | 35 / 35 | 76.2% | 0.6% | 16 | 0 | 0.74 / 11.3 | 99.1% | +0.4 |
| 6 | 98.6% | 100.0% | 97.4% | 35 / 35 | 74.2% | 9.3% | 22 | 0 | 0.68 / 12.0 | 98.6% | +0.0 |
| 7 | 99.6% | 100.0% | 99.2% | 35 / 35 | 76.1% | 0.8% | 17 | 0 | 0.70 / 12.2 | 99.2% | +0.3 |
| 8 | 100.0% | 100.0% | 100.0% | 35 / 35 | 76.6% | 0.0% | 14 | 0 | 0.69 / 11.6 | 99.4% | +0.6 |
| 9 | 99.7% | 100.0% | 99.4% | 35 / 35 | 76.4% | 1.0% | 14 | 0 | 0.69 / 13.4 | 99.5% | +0.2 |
| 10 | 99.1% | 100.0% | 98.3% | 35 / 35 | 75.7% | 3.6% | 17 | 0 | 0.64 / 12.4 | 99.4% | -0.2 |
| 11 | 98.9% | 100.0% | 98.0% | 35 / 35 | 76.4% | 2.6% | 16 | 0 | 0.67 / 12.0 | 99.3% | -0.4 |
| 12 | 99.4% | 100.0% | 98.8% | 35 / 35 | 75.5% | 5.7% | 15 | 0 | 0.63 / 10.5 | 98.6% | +0.8 |
| 13 | 99.6% | 100.0% | 99.3% | 35 / 35 | 76.3% | 1.2% | 14 | 0 | 0.65 / 10.9 | 99.4% | +0.3 |
| 14 | 99.1% | 100.0% | 98.3% | 35 / 35 | 75.0% | 1.0% | 19 | 0 | 0.59 / 10.0 | 98.9% | +0.2 |
| 15 | 98.9% | 100.0% | 97.9% | 35 / 35 | 77.3% | 5.7% | 17 | 0 | 0.62 / 10.3 | 98.9% | +0.0 |
| 16 | 99.1% | 100.0% | 98.3% | 35 / 35 | 76.3% | 1.0% | 15 | 0 | 0.66 / 9.6 | 96.4% | +2.7 |

Mean score share 99.2% ± 0.2, baseline 98.9% ± 0.4, paired diff +0.4 ± 0.4.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (roborumble.RoboRumbleAtHome x4), parallel 12.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 258 over 16 battles (16.1 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| gwah.GBotMarkIV 1.0 | weak | 99.2% ± 0.2 | 100.0% ± 0.0 | 98.5% ± 0.5 | 560 / 560 | 76.1% ± 0.6 | 2.6% ± 1.5 | 258 | 0 | 0.74 / 13.4 |

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| gwah.GBotMarkIV 1.0 | 3850 | 23 | 3706 | 3705 (96.2%) | 145 (3.8%) | 1 (0.0%) | 84 | 102 | 50 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| gwah.GBotMarkIV 1.0 | 3940 | 107 (2.7%) | 64 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| gwah.GBotMarkIV 1.0 | 650 | 214 | 400 | 132 | 82.3 / 1.2 | 2954 | 4815 | 425 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| gwah.GBotMarkIV 1.0 | 2.6% | 258 | 52 | 3 | 6.6 | 94 / 107 (88%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| gwah.GBotMarkIV 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| gwah.GBotMarkIV 1.0 | gwah.GBotMarkIV | 1 | 35 | 292 | 2.6% | 0.6% ± 1.6 | 38.3% | 21.2% / 22.0% | 2.4% | 0 / 0 | T0/M? | 99% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
