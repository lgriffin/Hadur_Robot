# dft.Immortal 1.40 (rank76-band3) vs hadur2.Hadur 3.13hjswpw

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 72.8% | 91.4% | 53.4% | 32 / 35 | 11.0% | 7.1% | 24 | 0 | 0.92 / 12.7 | 65.7% | +7.1 |
| 2 | 75.0% | 91.4% | 57.3% | 32 / 35 | 11.4% | 6.1% | 15 | 0 | 0.97 / 12.2 | 68.5% | +6.5 |
| 3 | 75.3% | 94.3% | 55.1% | 33 / 35 | 11.6% | 6.8% | 23 | 0 | 0.99 / 12.8 | 76.2% | -0.9 |
| 4 | 74.5% | 88.6% | 59.6% | 31 / 35 | 12.5% | 6.0% | 19 | 0 | 0.95 / 13.9 | 63.4% | +11.1 |
| 5 | 73.7% | 91.4% | 55.0% | 32 / 35 | 11.8% | 6.4% | 13 | 0 | 0.93 / 26.7 | 67.0% | +6.8 |
| 6 | 72.4% | 85.7% | 58.8% | 30 / 35 | 12.7% | 6.4% | 16 | 0 | 0.94 / 12.1 | 67.5% | +4.9 |
| 7 | 67.9% | 85.3% | 51.1% | 30 / 35 | 11.4% | 7.1% | 29 | 0 | 1.00 / 12.7 | 68.0% | -0.1 |
| 8 | 76.4% | 91.4% | 60.8% | 32 / 35 | 12.3% | 6.2% | 21 | 0 | 0.94 / 11.9 | 74.4% | +2.1 |

Mean score share 73.5% ± 2.2, baseline 68.8% ± 3.6, paired diff +4.7 ± 3.4.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 160 over 8 battles (20.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dft.Immortal 1.40 | rank76-band3 | 73.5% ± 2.2 | 89.9% ± 2.6 | 56.4% ± 2.8 | 252 / 280 | 11.8% ± 0.5 | 6.5% ± 0.4 | 160 | 0 | 1.00 / 26.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| dft.Immortal 1.40 | 8 | 1209 | 14.5% | 79.3% | 0.0% | 6.2% | 831 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dft.Immortal 1.40 | 8 | 7 | 0 | 0 | 0.57 | 1 | 1 | 0 |

7 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dft.Immortal 1.40 | 11556 | 7 | 11558 | 11555 (100.0%) | 1 (0.0%) | 3 (0.0%) | 573 | 127 | 100 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dft.Immortal 1.40 | 14132 | 1230 (8.7%) | 11809 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dft.Immortal 1.40 | 650 | 494 | 606 | 682 | 35.4 / 27.4 | 402 | 4539 | 542 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dft.Immortal 1.40 | 6.5% | 160 | 5849 | 3 | 41.1 | 1229 / 1230 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dft.Immortal 1.40 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| dft.Immortal 1.40 | dft.Immortal | 1 | 35 | 282 | 7.0% | 6.9% ± 1.4 | 10.5% | 22.7% / 24.8% | 5.5% | 0 / 0 | T2/M1 | 74% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
