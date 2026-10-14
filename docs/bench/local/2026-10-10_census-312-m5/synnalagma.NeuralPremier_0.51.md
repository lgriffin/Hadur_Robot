# synnalagma.NeuralPremier 0.51 (rank389-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 80.2% | 91.4% | 70.5% | 32 / 35 | - | - | 13 | - | 0.97 / 6298.8 | 85.8% | -5.5 |
| 2 | 86.5% | 97.1% | 76.7% | 34 / 35 | - | - | 7 | - | 0.96 / 77.5 | 81.7% | +4.8 |
| 3 | 85.6% | 91.4% | 79.5% | 32 / 35 | - | - | 1071 | - | 4.20 / 109.7 | 86.2% | -0.5 |
| 4 | 85.7% | 97.1% | 75.0% | 34 / 35 | - | - | 8 | - | 0.99 / 1100.9 | 80.3% | +5.4 |

Mean score share 84.5% ± 4.6, baseline 83.5% ± 4.6, paired diff +1.0 ± 8.2.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 1099 over 4 battles (274.8 per battle, most in one battle 1071). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| synnalagma.NeuralPremier 0.51 | rank389-band4 | 84.5% ± 4.6 | 94.3% ± 5.2 | 75.4% ± 6.0 | 132 / 140 | - | - | 1099 | - | 4.20 / 6298.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| synnalagma.NeuralPremier 0.51 | 4 | 815 | 12.3% | 82.8% | 0.0% | 4.9% | 635 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| synnalagma.NeuralPremier 0.51 | 4 | 3 | n/a | 1 | 7.85 | 0 | 0 | 0 |

3 of 4 battles trusted.
