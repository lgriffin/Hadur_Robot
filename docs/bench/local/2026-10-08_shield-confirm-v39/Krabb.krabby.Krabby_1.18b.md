# Krabb.krabby.Krabby 1.18b (shield-confirm) vs hadur2.Hadur 3.9sa

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 93.7% | 100.0% | 57.7% | 35 / 35 | 7.7% | 1.0% | 11 | 0 | 0.43 / 17.7 | 82.1% | +11.6 |
| 2 | 91.7% | 97.1% | 65.5% | 34 / 35 | 10.5% | 0.8% | 10 | 0 | 0.39 / 16.1 | 81.9% | +9.8 |
| 3 | 94.1% | 100.0% | 72.7% | 35 / 35 | 22.0% | 0.9% | 11 | 0 | 0.38 / 13.3 | 83.7% | +10.4 |
| 4 | 96.4% | 100.0% | 71.7% | 35 / 35 | 12.4% | 0.5% | 10 | 0 | 0.35 / 13.5 | 86.3% | +10.1 |
| 5 | 97.4% | 100.0% | 87.3% | 35 / 35 | 34.4% | 0.8% | 14 | 0 | 0.37 / 17.2 | 80.1% | +17.3 |
| 6 | 91.6% | 97.1% | 58.5% | 34 / 35 | 9.0% | 0.8% | 12 | 0 | 0.41 / 16.0 | 77.8% | +13.8 |
| 7 | 96.5% | 100.0% | 64.4% | 35 / 35 | 8.5% | 0.5% | 12 | 0 | 0.39 / 14.6 | 89.0% | +7.4 |
| 8 | 95.3% | 100.0% | 68.3% | 35 / 35 | 11.8% | 0.8% | 10 | 0 | 0.40 / 14.5 | 75.6% | +19.6 |
| 9 | 90.9% | 100.0% | 59.1% | 35 / 35 | 16.4% | 1.6% | 11 | 0 | 0.41 / 15.0 | 83.2% | +7.8 |
| 10 | 96.4% | 100.0% | 77.6% | 35 / 35 | 14.7% | 0.7% | 14 | 0 | 0.41 / 13.6 | 84.0% | +12.4 |
| 11 | 94.1% | 100.0% | 69.2% | 35 / 35 | 16.8% | 1.2% | 9 | 0 | 0.39 / 15.6 | 84.2% | +9.8 |
| 12 | 96.5% | 100.0% | 83.5% | 35 / 35 | 29.7% | 0.9% | 12 | 0 | 0.42 / 14.1 | 86.3% | +10.1 |
| 13 | 87.2% | 97.1% | 57.4% | 34 / 35 | 14.4% | 1.9% | 13 | 0 | 0.43 / 10.3 | 88.6% | -1.4 |
| 14 | 97.2% | 100.0% | 62.0% | 35 / 35 | 8.4% | 0.3% | 10 | 0 | 0.36 / 15.9 | 81.3% | +15.9 |
| 15 | 94.3% | 100.0% | 64.7% | 35 / 35 | 10.1% | 1.0% | 12 | 0 | 0.41 / 14.4 | 84.7% | +9.6 |
| 16 | 93.4% | 100.0% | 51.8% | 35 / 35 | 8.5% | 1.0% | 12 | 0 | 0.37 / 15.7 | 78.6% | +14.8 |

Mean score share 94.2% ± 1.5, baseline 83.0% ± 2.0, paired diff +11.2 ± 2.6.

## Full report

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 183 over 16 battles (11.4 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| Krabb.krabby.Krabby 1.18b | shield-confirm | 94.2% ± 1.5 | 99.5% ± 0.6 | 67.0% ± 5.2 | 557 / 560 | 14.7% ± 4.2 | 0.9% ± 0.2 | 183 | 0 | 0.43 / 17.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| Krabb.krabby.Krabby 1.18b | 16 | 153 | 6.1% | 91.4% | 0.0% | 2.5% | 819 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| Krabb.krabby.Krabby 1.18b | 16 | 15 | 298 | 0 | 0.33 | 0 | 0 | 16 |

15 of 16 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| Krabb.krabby.Krabby 1.18b | 22510 | 3 | 22520 | 22437 (99.7%) | 73 (0.3%) | 83 (0.4%) | 589 | 76 | 105 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| Krabb.krabby.Krabby 1.18b | 3505 | 21220 (605.4%) | 316 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| Krabb.krabby.Krabby 1.18b | 650 | 404 | 634 | 669 | 8.5 / 4.0 | 89 | 840 | 414 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| Krabb.krabby.Krabby 1.18b | 0.9% | 183 | 75 | 3 | 2.0 | 85 / 21220 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| Krabb.krabby.Krabby 1.18b | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| Krabb.krabby.Krabby 1.18b | Krabb.krabby.Krabby | 1 | 35 | 312 | 1.1% | 8.3% ± 5.6 | 10.1% | 23.5% / 21.7% | 23.5% | 0 / 0 | T?/M? | 93% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
