# synnalagma.NeuralPremier 0.51 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 91.6% | 100.0% | 83.5% | 35 / 35 | - | - | 10 | - | 0.90 / 29.7 | 82.0% | +9.7 |
| 2 | 89.9% | 100.0% | 80.6% | 35 / 35 | - | - | 8 | - | 0.95 / 25.7 | 85.0% | +4.8 |
| 3 | 93.9% | 100.0% | 87.7% | 35 / 35 | - | - | 6 | - | 0.92 / 26.2 | 81.4% | +12.5 |
| 4 | 92.3% | 100.0% | 84.4% | 35 / 35 | - | - | 4 | - | 0.88 / 30.5 | 87.3% | +5.0 |
| 5 | 89.5% | 100.0% | 79.9% | 35 / 35 | - | - | 4 | - | 1.00 / 23.8 | 85.5% | +4.0 |
| 6 | 91.5% | 100.0% | 83.6% | 35 / 35 | - | - | 15 | - | 0.99 / 28.8 | 85.0% | +6.5 |
| 7 | 90.7% | 100.0% | 82.0% | 35 / 35 | - | - | 8 | - | 0.91 / 22.5 | 84.1% | +6.6 |
| 8 | 94.1% | 100.0% | 88.4% | 35 / 35 | - | - | 9 | - | 0.89 / 25.5 | 83.6% | +10.6 |

Mean score share 91.7% ± 1.4, baseline 84.2% ± 1.6, paired diff +7.5 ± 2.6.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 64 over 8 battles (8.0 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| synnalagma.NeuralPremier 0.51 | mid | 91.7% ± 1.4 | 100.0% ± 0.0 | 83.8% ± 2.6 | 280 / 280 | - | - | 64 | - | 1.00 / 30.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| synnalagma.NeuralPremier 0.51 | 8 | 434 | 0.0% | 100.0% | 0.0% | 0.0% | 575 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| synnalagma.NeuralPremier 0.51 | 8 | 8 | n/a | 0 | 0.23 | 0 | 0 | 0 |

8 of 8 battles trusted.
