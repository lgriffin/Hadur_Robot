# demetrix.nano.Neutrino 0.27 (rank589-band5) vs hadur2.Hadur 3.13hjf8

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.4% | 94.3% | 67.0% | 33 / 35 | 13.2% | 5.5% | 29 | 0 | 0.94 / 1469.4 | 84.4% | -3.0 |
| 2 | 84.4% | 100.0% | 65.1% | 35 / 35 | 12.0% | 4.8% | 42 | 0 | 0.86 / 5197.1 | 81.0% | +3.4 |
| 3 | 78.2% | 91.4% | 64.6% | 32 / 35 | 14.6% | 7.7% | 26 | 0 | 0.96 / 1041.0 | 77.2% | +1.0 |
| 4 | 75.2% | 88.6% | 62.2% | 31 / 35 | 14.8% | 6.8% | 65 | 0 | 1.30 / 1016.5 | 76.4% | -1.2 |
| 5 | 85.8% | 97.1% | 73.7% | 34 / 35 | 18.9% | 5.5% | 92 | 0 | 1.30 / 2438.4 | 75.0% | +10.8 |
| 6 | 78.8% | 91.4% | 65.0% | 32 / 35 | 12.7% | 5.4% | 50 | 0 | 1.04 / 1853.1 | 82.5% | -3.7 |
| 7 | 85.1% | 100.0% | 68.6% | 35 / 35 | 14.5% | 5.4% | 26 | 0 | 0.89 / 2367.5 | 87.3% | -2.2 |
| 8 | 80.3% | 97.1% | 60.4% | 34 / 35 | 11.3% | 5.4% | 133 | 0 | 0.85 / 201.4 | 74.8% | +5.5 |

Mean score share 81.2% ± 3.1, baseline 79.8% ± 3.9, paired diff +1.3 ± 4.2.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 463 over 8 battles (57.9 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| demetrix.nano.Neutrino 0.27 | rank589-band5 | 81.2% ± 3.1 | 95.0% ± 3.6 | 65.8% ± 3.4 | 266 / 280 | 14.0% ± 2.0 | 5.8% ± 0.8 | 463 | 0 | 1.30 / 5197.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| demetrix.nano.Neutrino 0.27 | 8 | 856 | 10.2% | 84.8% | 0.6% | 4.3% | 684 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| demetrix.nano.Neutrino 0.27 | 8 | 6 | 0 | 2 | 1.65 | 0 | 0 | 0 |

6 of 8 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| demetrix.nano.Neutrino 0.27 | 10019 | 11 | 10019 | 10018 (100.0%) | 1 (0.0%) | 1 (0.0%) | 327 | 123 | 188 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| demetrix.nano.Neutrino 0.27 | 10474 | 796 (7.6%) | 5557 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| demetrix.nano.Neutrino 0.27 | 650 | 430 | 556 | 534 | 40.1 / 20.7 | 827 | 4084 | 3731 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| demetrix.nano.Neutrino 0.27 | 5.8% | 463 | 91 | 3 | 35.7 | 794 / 796 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| demetrix.nano.Neutrino 0.27 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| demetrix.nano.Neutrino 0.27 | demetrix.nano.Neutrino | 1 | 35 | 322 | 6.1% | 5.8% ± 1.3 | 11.1% | 23.0% / 21.3% | 6.8% | 0 / 0 | T2/M1 | 79% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
