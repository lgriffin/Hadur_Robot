# ar.QuantumChromodynamics 1.2.1 (rank776-band6) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 95.6% | 100.0% | 89.1% | 35 / 35 | - | - | 4 | - | 0.94 / 709.2 | 93.1% | +2.5 |
| 2 | 97.5% | 100.0% | 93.5% | 35 / 35 | - | - | 7 | - | 0.88 / 1305.2 | 94.5% | +3.0 |
| 3 | 98.4% | 100.0% | 96.0% | 35 / 35 | - | - | 8 | - | 0.94 / 604.7 | 82.7% | +15.6 |
| 4 | 96.1% | 100.0% | 91.0% | 35 / 35 | - | - | 9 | - | 0.84 / 1430.6 | 92.4% | +3.7 |

Mean score share 96.9% ± 2.0, baseline 90.7% ± 8.5, paired diff +6.2 ± 10.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 28 over 4 battles (7.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ar.QuantumChromodynamics 1.2.1 | rank776-band6 | 96.9% ± 2.0 | 100.0% ± 0.0 | 92.4% ± 4.8 | 140 / 140 | - | - | 28 | - | 0.94 / 1430.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ar.QuantumChromodynamics 1.2.1 | 4 | 124 | 0.0% | 98.4% | 1.6% | 0.0% | 504 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ar.QuantumChromodynamics 1.2.1 | 4 | 4 | n/a | 0 | 0.20 | 0 | 0 | 0 |

4 of 4 battles trusted.
