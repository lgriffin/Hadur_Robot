# aaa.r.ScalarR 0.005h.053-noshield (rumble-5) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 24.2% | 11.4% | 39.4% | 4 / 35 | 6.8% | 9.9% | 35 | 0 | 1.85 / 44.5 | 25.2% | -1.0 |
| 2 | 34.4% | 25.7% | 44.7% | 9 / 35 | 6.7% | 10.2% | 33 | 0 | 1.85 / 61.5 | 20.5% | +14.0 |
| 3 | 35.5% | 31.4% | 41.2% | 11 / 35 | 6.6% | 10.1% | 27 | 0 | 1.77 / 451.6 | 25.6% | +9.9 |
| 4 | 38.5% | 37.1% | 40.5% | 13 / 35 | 6.6% | 10.7% | 37 | 0 | 1.85 / 52.7 | 27.6% | +10.9 |
| 5 | 31.4% | 22.9% | 42.1% | 8 / 35 | 6.1% | 10.2% | 43 | 0 | 1.74 / 162.0 | 25.5% | +6.0 |
| 6 | 29.1% | 22.9% | 37.0% | 8 / 35 | 6.6% | 12.1% | 45 | 0 | 1.73 / 56.4 | 23.3% | +5.8 |
| 7 | 29.6% | 17.1% | 43.8% | 6 / 35 | 6.8% | 11.2% | 35 | 0 | 1.91 / 56.7 | 27.1% | +2.5 |
| 8 | 27.3% | 20.0% | 36.4% | 7 / 35 | 6.5% | 11.0% | 28 | 0 | 1.86 / 47.1 | 29.3% | -2.0 |
| 9 | 31.7% | 20.0% | 44.3% | 7 / 35 | 7.7% | 11.5% | 25 | 0 | 1.79 / 47.9 | 22.0% | +9.8 |
| 10 | 34.0% | 28.6% | 40.8% | 10 / 35 | 6.6% | 10.1% | 36 | 0 | 1.77 / 43.1 | 20.1% | +13.8 |
| 11 | 27.1% | 17.1% | 39.2% | 6 / 35 | 5.9% | 9.1% | 25 | 0 | 1.73 / 40.8 | 25.5% | +1.6 |
| 12 | 33.7% | 28.6% | 39.8% | 10 / 35 | 7.1% | 9.8% | 34 | 0 | 1.82 / 56.0 | 28.1% | +5.6 |
| 13 | 35.4% | 31.4% | 40.2% | 11 / 35 | 7.3% | 10.3% | 27 | 0 | 1.82 / 51.5 | 34.4% | +1.0 |
| 14 | 32.5% | 28.6% | 37.5% | 10 / 35 | 6.5% | 11.4% | 41 | 0 | 1.70 / 55.0 | 29.0% | +3.5 |
| 15 | 33.8% | 31.4% | 37.3% | 11 / 35 | 6.1% | 10.2% | 25 | 0 | 1.73 / 34.2 | 22.4% | +11.4 |
| 16 | 29.1% | 22.9% | 37.2% | 8 / 35 | 5.7% | 10.5% | 38 | 0 | 1.71 / 42.0 | 21.0% | +8.1 |
| 17 | 38.8% | 34.3% | 43.8% | 12 / 35 | 7.2% | 10.4% | 46 | 0 | 1.91 / 50.4 | 31.1% | +7.7 |
| 18 | 37.0% | 34.3% | 40.6% | 12 / 35 | 6.5% | 10.6% | 32 | 0 | 1.77 / 52.6 | 27.8% | +9.1 |
| 19 | 27.0% | 17.1% | 38.9% | 6 / 35 | 6.8% | 9.5% | 35 | 0 | 1.81 / 58.0 | 24.8% | +2.2 |
| 20 | 37.9% | 37.1% | 39.5% | 13 / 35 | 6.6% | 10.1% | 35 | 0 | 1.78 / 46.1 | 24.2% | +13.6 |

Mean score share 32.4% ± 2.0, baseline 25.7% ± 1.7, paired diff +6.7 ± 2.3.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 682 over 20 battles (34.1 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | rumble-5 | 32.4% ± 2.0 | 26.0% ± 3.5 | 40.2% ± 1.2 | 182 / 700 | 6.6% ± 0.2 | 10.4% ± 0.3 | 682 | 0 | 1.91 / 451.6 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | 20 | 11 | 2081 | 0 | 0.97 | 5 | 4 | 0 |

11 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | 146574 | 57 | 151100 | 146401 (99.9%) | 173 (0.1%) | 4699 (3.1%) | 8703 | 1563 | 737 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | 148570 | 17272 (11.6%) | 146003 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 485 | 650 | 2506 | 23.1 / 34.3 | 7 | 5521 | 12 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | 10.4% | 682 | 8410 | 3 | 215.1 | 17229 / 17272 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| aaa.r.ScalarR 0.005h.053-noshield | aaa.r.ScalarR | 1 | 35 | 316 | 10.8% | 8.4% ± 1.1 | 7.1% | 23.8% / 21.0% | 0.0% | 0 / 0 | T3/M1 | 38% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
