# jcs.Decepticon 2.5.3 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 73.4% | 88.6% | 47.2% | 31 / 35 | 14.6% | 5.2% | 11 | 0 | 1.29 / 21.0 | 76.0% | -2.6 |
| 2 | 78.1% | 94.3% | 49.5% | 33 / 35 | 10.3% | 5.0% | 9 | 0 | 1.25 / 17.5 | 77.1% | +1.0 |
| 3 | 87.5% | 100.0% | 58.2% | 35 / 35 | 14.6% | 4.2% | 9 | 0 | 0.99 / 17.0 | 68.8% | +18.7 |
| 4 | 81.6% | 97.1% | 48.5% | 34 / 35 | 13.6% | 4.6% | 5 | 0 | 0.99 / 14.9 | 82.1% | -0.5 |
| 5 | 78.2% | 94.3% | 38.8% | 33 / 35 | 8.4% | 4.6% | 11 | 0 | 1.04 / 34.8 | 77.2% | +1.1 |
| 6 | 74.6% | 88.6% | 46.1% | 31 / 35 | 13.6% | 4.6% | 10 | 0 | 1.11 / 17.4 | 72.5% | +2.1 |
| 7 | 82.4% | 97.1% | 48.7% | 34 / 35 | 11.3% | 4.6% | 10 | 0 | 0.98 / 19.4 | 71.4% | +11.0 |
| 8 | 82.4% | 97.1% | 52.1% | 34 / 35 | 14.8% | 4.4% | 9 | 0 | 0.97 / 18.6 | 73.8% | +8.7 |
| 9 | 81.9% | 97.1% | 47.2% | 34 / 35 | 14.5% | 4.6% | 8 | 0 | 1.20 / 18.9 | 74.8% | +7.1 |
| 10 | 82.1% | 97.1% | 47.3% | 34 / 35 | 13.3% | 4.8% | 9 | 0 | 1.01 / 16.8 | 68.7% | +13.4 |
| 11 | 84.6% | 97.1% | 39.2% | 34 / 35 | 7.6% | 4.2% | 9 | 0 | 0.92 / 16.4 | 77.0% | +7.7 |
| 12 | 79.3% | 97.1% | 38.4% | 34 / 35 | 9.0% | 4.6% | 11 | 0 | 1.23 / 18.4 | 71.0% | +8.3 |
| 13 | 75.0% | 91.4% | 47.1% | 32 / 35 | 8.2% | 5.5% | 12 | 0 | 1.15 / 75.7 | 67.8% | +7.2 |
| 14 | 76.8% | 94.3% | 52.5% | 33 / 35 | 12.3% | 5.9% | 15 | 0 | 1.32 / 15.8 | 74.7% | +2.1 |
| 15 | 83.8% | 97.1% | 53.3% | 34 / 35 | 20.9% | 4.3% | 12 | 0 | 0.97 / 15.8 | 74.5% | +9.3 |
| 16 | 84.3% | 100.0% | 53.1% | 35 / 35 | 12.7% | 4.7% | 13 | 0 | 1.08 / 18.1 | 73.8% | +10.6 |

Mean score share 80.4% ± 2.2, baseline 73.8% ± 2.0, paired diff +6.6 ± 3.0.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 163 over 16 battles (10.2 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jcs.Decepticon 2.5.3 | shield-confirm | 80.4% ± 2.2 | 95.5% ± 1.8 | 47.9% ± 2.9 | 535 / 560 | 12.5% ± 1.8 | 4.7% ± 0.2 | 163 | 0 | 1.32 / 75.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jcs.Decepticon 2.5.3 | 16 | 640 | 12.2% | 82.7% | 0.0% | 5.1% | 1024 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jcs.Decepticon 2.5.3 | 16 | 15 | 0 | 0 | 0.29 | 1 | 1 | 0 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jcs.Decepticon 2.5.3 | 32797 | 786 | 32799 | 32792 (100.0%) | 5 (0.0%) | 7 (0.0%) | 701 | 157 | 52 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jcs.Decepticon 2.5.3 | 13390 | 22070 (164.8%) | 7581 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jcs.Decepticon 2.5.3 | 650 | 526 | 647 | 874 | 14.2 / 15.1 | 190 | 3930 | 5938 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jcs.Decepticon 2.5.3 | 4.7% | 163 | 132 | 3 | 17.6 | 952 / 22070 (4%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jcs.Decepticon 2.5.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| jcs.Decepticon 2.5.3 | jcs.Decepticon | 1 | 35 | 292 | 5.1% | 7.9% ± 2.0 | 11.2% | 24.8% / 22.3% | 5.9% | 0 / 0 | T3/M? | 84% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
