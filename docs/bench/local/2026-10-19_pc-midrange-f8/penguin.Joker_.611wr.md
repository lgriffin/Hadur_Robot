# penguin.Joker .611wr (rank180-band3) vs hadur2.Hadur 3.13hjswf8

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.4% | 91.4% | 69.6% | 32 / 35 | 12.5% | 5.3% | 23 | 0 | 0.97 / 13.8 | 77.6% | +3.9 |
| 2 | 75.9% | 88.6% | 62.2% | 31 / 35 | 12.6% | 6.5% | 33 | 0 | 0.92 / 1221.3 | 80.5% | -4.6 |
| 3 | 82.3% | 94.1% | 68.6% | 33 / 35 | 12.7% | 4.9% | 31 | 0 | 0.96 / 29.6 | 76.7% | +5.6 |
| 4 | 80.0% | 94.3% | 64.6% | 33 / 35 | 13.0% | 5.7% | 58 | 0 | 0.91 / 246.9 | 74.6% | +5.4 |
| 5 | 77.6% | 88.6% | 65.1% | 31 / 35 | 12.9% | 5.8% | 31 | 0 | 0.94 / 21.4 | 78.1% | -0.5 |
| 6 | 77.7% | 88.6% | 66.3% | 31 / 35 | 14.0% | 6.3% | 33 | 0 | 0.91 / 794.0 | 74.8% | +2.9 |
| 7 | 69.8% | 77.1% | 62.2% | 27 / 35 | 14.5% | 7.0% | 41 | 0 | 0.95 / 1131.1 | 66.4% | +3.4 |
| 8 | 76.9% | 88.6% | 63.3% | 31 / 35 | 12.4% | 6.3% | 32 | 0 | 0.94 / 1148.5 | 70.9% | +6.0 |

Mean score share 77.7% ± 3.3, baseline 74.9% ± 3.7, paired diff +2.8 ± 3.0.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 282 over 8 battles (35.3 per battle, most in one battle 58). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| penguin.Joker .611wr | rank180-band3 | 77.7% ± 3.3 | 88.9% ± 4.5 | 65.2% ± 2.3 | 249 / 280 | 13.1% ± 0.6 | 6.0% ± 0.6 | 282 | 0 | 0.97 / 1221.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| penguin.Joker .611wr | 8 | 1018 | 19.0% | 74.1% | 0.0% | 6.8% | 1245 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| penguin.Joker .611wr | 8 | 8 | 0 | 1 | 1.01 | 0 | 0 | 0 |

8 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| penguin.Joker .611wr | 24154 | 21 | 24177 | 24153 (100.0%) | 1 (0.0%) | 24 (0.1%) | 2159 | 207 | 169 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| penguin.Joker .611wr | 24432 | 2181 (8.9%) | 22118 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| penguin.Joker .611wr | 650 | 500 | 547 | 1095 | 40.3 / 21.6 | 1069 | 3988 | 120 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| penguin.Joker .611wr | 6.0% | 282 | 3882 | 3 | 86.1 | 2177 / 2181 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| penguin.Joker .611wr | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| penguin.Joker .611wr | penguin.Joker | 1 | 35 | 290 | 7.3% | 6.4% ± 0.9 | 12.2% | 24.2% / 24.1% | 3.5% | 0 / 0 | T2/M1 | 76% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
