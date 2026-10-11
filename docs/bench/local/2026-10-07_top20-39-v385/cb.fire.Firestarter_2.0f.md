# cb.fire.Firestarter 2.0f (rumble-7) vs hadur2.Hadur 3.9

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 48.4% | 42.9% | 54.8% | 15 / 35 | 8.3% | 7.8% | 24 | 0 | 1.71 / 27.0 | 53.3% | -4.9 |
| 2 | 47.6% | 45.7% | 50.6% | 16 / 35 | 7.7% | 8.4% | 38 | 0 | 1.64 / 27.3 | 43.7% | +3.9 |
| 3 | 43.5% | 40.0% | 47.6% | 14 / 35 | 7.7% | 8.7% | 25 | 0 | 1.65 / 29.5 | 55.9% | -12.4 |
| 4 | 47.1% | 48.6% | 45.9% | 17 / 35 | 7.7% | 9.5% | 25 | 0 | 1.70 / 25.7 | 46.5% | +0.6 |
| 5 | 54.1% | 54.3% | 53.3% | 19 / 35 | 8.3% | 8.5% | 39 | 0 | 1.69 / 26.6 | 44.7% | +9.3 |
| 6 | 51.8% | 54.3% | 49.8% | 19 / 35 | 8.4% | 8.3% | 34 | 0 | 1.76 / 226.8 | 45.7% | +6.1 |
| 7 | 55.0% | 54.3% | 55.3% | 19 / 35 | 8.8% | 8.2% | 34 | 0 | 1.71 / 63.2 | 49.9% | +5.1 |
| 8 | 56.6% | 60.0% | 51.9% | 21 / 35 | 7.5% | 7.9% | 30 | 0 | 1.73 / 571.6 | 47.0% | +9.6 |
| 9 | 52.4% | 48.6% | 56.5% | 17 / 35 | 9.3% | 8.4% | 26 | 0 | 1.81 / 32.4 | 42.1% | +10.3 |
| 10 | 53.6% | 54.3% | 53.4% | 19 / 35 | 8.3% | 8.2% | 33 | 0 | 1.84 / 302.1 | 48.1% | +5.4 |

Mean score share 51.0% ± 3.0, baseline 47.7% ± 3.1, paired diff +3.3 ± 5.1.

## Full report

35 rounds x 10 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 308 over 10 battles (30.8 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | rumble-7 | 51.0% ± 3.0 | 50.3% ± 4.4 | 51.9% ± 2.5 | 176 / 350 | 8.2% ± 0.4 | 8.4% ± 0.3 | 308 | 0 | 1.84 / 571.6 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 10 | 9 | 45 | 0 | 0.88 | 0 | 0 | 0 |

9 of 10 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 82165 | 1840 | 95149 | 82119 (99.9%) | 46 (0.1%) | 13030 (13.7%) | 7274 | 639 | 307 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 94635 | 8743 (9.2%) | 93124 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 650 | 548 | 650 | 3115 | 29.0 / 26.8 | 260 | 10722 | 320 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 8.4% | 308 | 6097 | 3 | 270.8 | 8700 / 8743 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 0 / 10 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 1 | 35 | 310 | 7.8% | 6.4% ± 1.0 | 9.4% | 20.3% / 20.4% | 3.3% | 0 / 0 | T2/M1 | 54% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
