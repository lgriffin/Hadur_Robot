# jam.mini.Raiko 0.43 (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 93.7% | 100.0% | 50.9% | 35 / 35 | 4.2% | 1.3% | 14 | 0 | 0.48 / 14.1 | 67.3% | +26.4 |
| 2 | 91.6% | 97.1% | 56.1% | 34 / 35 | 9.4% | 0.9% | 12 | 0 | 0.45 / 15.0 | 72.4% | +19.2 |
| 3 | 89.8% | 97.1% | 53.3% | 34 / 35 | 8.4% | 1.1% | 10 | 0 | 0.55 / 15.9 | 76.6% | +13.1 |
| 4 | 95.6% | 100.0% | 51.6% | 35 / 35 | 7.0% | 0.9% | 14 | 0 | 0.42 / 187.0 | 67.8% | +27.8 |
| 5 | 84.0% | 94.3% | 38.2% | 33 / 35 | 6.5% | 1.7% | 15 | 0 | 0.48 / 14.7 | 73.4% | +10.6 |
| 6 | 93.0% | 100.0% | 44.4% | 35 / 35 | 7.4% | 1.0% | 11 | 0 | 0.42 / 11.7 | 69.1% | +23.9 |
| 7 | 84.8% | 94.3% | 53.1% | 33 / 35 | 9.5% | 3.8% | 11 | 0 | 0.57 / 18.6 | 62.1% | +22.7 |
| 8 | 89.1% | 97.1% | 42.0% | 34 / 35 | 7.5% | 1.1% | 10 | 0 | 0.43 / 106.1 | 68.4% | +20.7 |
| 9 | 93.3% | 97.1% | 55.2% | 34 / 35 | 7.7% | 0.5% | 10 | 0 | 0.50 / 16.7 | 70.2% | +23.1 |
| 10 | 95.2% | 100.0% | 51.5% | 35 / 35 | 8.7% | 0.7% | 12 | 0 | 0.40 / 15.2 | 71.1% | +24.1 |
| 11 | 93.6% | 100.0% | 48.9% | 35 / 35 | 6.0% | 0.8% | 14 | 0 | 0.51 / 15.8 | 71.4% | +22.2 |
| 12 | 96.1% | 100.0% | 51.0% | 35 / 35 | 6.8% | 0.4% | 10 | 0 | 0.41 / 15.8 | 73.9% | +22.2 |
| 13 | 91.9% | 97.1% | 61.2% | 34 / 35 | 7.3% | 1.0% | 12 | 0 | 0.48 / 16.3 | 75.5% | +16.4 |
| 14 | 90.5% | 100.0% | 58.2% | 35 / 35 | 5.0% | 1.8% | 10 | 0 | 0.39 / 13.7 | 73.9% | +16.6 |
| 15 | 95.2% | 100.0% | 63.1% | 35 / 35 | 5.9% | 0.8% | 12 | 0 | 0.48 / 12.7 | 72.1% | +23.2 |
| 16 | 91.7% | 97.1% | 47.6% | 34 / 35 | 6.9% | 0.8% | 9 | 0 | 0.37 / 12.5 | 70.6% | +21.0 |

Mean score share 91.8% ± 1.9, baseline 71.0% ± 1.9, paired diff +20.8 ± 2.5.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 186 over 16 battles (11.6 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | shield-confirm | 91.8% ± 1.9 | 98.2% ± 1.1 | 51.6% ± 3.5 | 550 / 560 | 7.1% ± 0.8 | 1.2% ± 0.4 | 186 | 0 | 0.57 / 187.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 16 | 206 | 15.2% | 78.6% | 0.4% | 5.9% | 1012 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 16 | 13 | 1347 | 0 | 0.33 | 1 | 1 | 0 |

13 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 29761 | 0 | 29688 | 29669 (99.7%) | 92 (0.3%) | 19 (0.1%) | 346 | 24 | 56 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jam.mini.Raiko 0.43 | 7341 | 27989 (381.3%) | 1252 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 650 | 448 | 650 | 863 | 5.0 / 4.6 | 13 | 781 | 6 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 1.2% | 186 | 81 | 3 | 2.9 | 145 / 27989 (1%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | jam.mini.Raiko | 1 | 35 | 290 | 0.9% | 17.8% ± 10.1 | 8.3% | 21.2% / 20.6% | 3.8% | 0 / 0 | T?/M? | 92% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
