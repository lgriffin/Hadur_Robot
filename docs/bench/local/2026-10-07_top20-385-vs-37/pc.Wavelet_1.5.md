# pc.Wavelet 1.5 (rumble-13) vs hadur2.Hadur 3.8.5

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 47.4% | 45.7% | 50.5% | 16 / 35 | 10.4% | 8.8% | 26 | 0 | 1.83 / 27.3 | 60.1% | -12.7 |
| 2 | 55.0% | 57.1% | 53.6% | 20 / 35 | 9.7% | 7.8% | 14 | 0 | 1.78 / 22.9 | 53.8% | +1.2 |
| 3 | 48.3% | 48.6% | 48.5% | 17 / 35 | 9.8% | 8.2% | 11 | 0 | 1.67 / 20.5 | 45.0% | +3.2 |
| 4 | 59.3% | 68.6% | 50.3% | 24 / 35 | 10.4% | 7.9% | 18 | 0 | 1.71 / 23.3 | 53.0% | +6.3 |
| 5 | 49.1% | 51.4% | 47.5% | 18 / 35 | 10.4% | 8.4% | 9 | 0 | 1.68 / 20.9 | 57.1% | -8.0 |
| 6 | 43.5% | 42.9% | 45.4% | 15 / 35 | 9.7% | 9.5% | 10 | 0 | 1.82 / 24.6 | 53.1% | -9.6 |
| 7 | 45.8% | 45.7% | 46.5% | 16 / 35 | 10.6% | 8.9% | 15 | 0 | 1.93 / 26.4 | 63.2% | -17.4 |
| 8 | 48.8% | 48.6% | 49.6% | 17 / 35 | 9.7% | 8.3% | 17 | 0 | 1.70 / 21.7 | 60.2% | -11.3 |
| 9 | 46.3% | 45.7% | 48.4% | 16 / 35 | 10.8% | 8.5% | 11 | 0 | 1.79 / 29.4 | 61.1% | -14.8 |
| 10 | 50.2% | 48.6% | 52.3% | 17 / 35 | 9.8% | 8.5% | 16 | 0 | 1.77 / 49.6 | 60.8% | -10.6 |
| 11 | 44.7% | 42.9% | 47.2% | 15 / 35 | 9.9% | 8.6% | 19 | 0 | 1.77 / 21.0 | 53.6% | -8.9 |
| 12 | 40.9% | 34.3% | 48.2% | 12 / 35 | 9.5% | 10.2% | 13 | 0 | 1.77 / 22.8 | 57.2% | -16.3 |
| 13 | 44.3% | 37.1% | 51.6% | 13 / 35 | 8.8% | 9.5% | 25 | 0 | 1.77 / 19.7 | 59.7% | -15.4 |
| 14 | 43.9% | 37.1% | 51.7% | 13 / 35 | 10.1% | 9.0% | 14 | 0 | 1.79 / 20.8 | 61.3% | -17.4 |
| 15 | 55.1% | 57.1% | 53.7% | 20 / 35 | 10.4% | 8.3% | 18 | 0 | 1.71 / 42.3 | 54.2% | +1.0 |
| 16 | 43.8% | 40.0% | 49.2% | 14 / 35 | 9.5% | 9.2% | 15 | 0 | 1.84 / 21.7 | 60.5% | -16.7 |
| 17 | 52.9% | 54.3% | 51.8% | 19 / 35 | 10.1% | 8.4% | 19 | 0 | 1.77 / 24.5 | 59.2% | -6.3 |
| 18 | 54.7% | 57.1% | 52.1% | 20 / 35 | 10.4% | 8.6% | 18 | 0 | 1.76 / 453.8 | 54.9% | -0.3 |
| 19 | 47.3% | 48.6% | 46.1% | 17 / 35 | 9.2% | 9.6% | 17 | 0 | 1.70 / 16.1 | 57.1% | -9.8 |
| 20 | 46.5% | 45.7% | 48.2% | 16 / 35 | 10.0% | 8.5% | 14 | 0 | 1.86 / 380.3 | 60.9% | -14.5 |

Mean score share 48.4% ± 2.3, baseline 57.3% ± 2.0, paired diff -8.9 ± 3.5.

## Full report

35 rounds x 20 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 319 over 20 battles (16.0 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | rumble-13 | 48.4% ± 2.3 | 47.9% ± 3.9 | 49.6% ± 1.2 | 335 / 700 | 10.0% ± 0.2 | 8.7% ± 0.3 | 319 | 0 | 1.93 / 453.8 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | 20 | 11 | 340 | 0 | 0.46 | 8 | 7 | 0 |

11 of 20 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | 62199 | 29 | 62832 | 62165 (99.9%) | 34 (0.1%) | 667 (1.1%) | 5208 | 618 | 232 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| pc.Wavelet 1.5 | 73820 | 6886 (9.3%) | 70437 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | 650 | 442 | 650 | 1317 | 29.9 / 30.4 | 758 | 13401 | 40 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | 8.7% | 319 | 7152 | 3 | 89.0 | 6882 / 6886 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | 0 / 20 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | pc.Wavelet | 1 | 35 | 272 | 9.3% | 6.8% ± 0.9 | 10.0% | 21.7% / 21.5% | 9.8% | 0 / 0 | T2/M1 | 47% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
