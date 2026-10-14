# SHAM.WOW 1.4 (rank257-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 73.2% | 80.0% | 66.9% | 28 / 35 | - | - | 10 | - | 0.85 / 4634.9 | 79.6% | -6.4 |
| 2 | 86.1% | 97.1% | 76.3% | 34 / 35 | - | - | 5 | - | 0.95 / 1581.5 | 77.0% | +9.1 |
| 3 | 81.1% | 91.4% | 70.6% | 32 / 35 | - | - | 15 | - | 1.03 / 2994.5 | 76.6% | +4.5 |
| 4 | 75.7% | 85.7% | 66.0% | 30 / 35 | - | - | 12 | - | 1.00 / 1611.8 | 75.0% | +0.7 |

Mean score share 79.0% ± 9.2, baseline 77.0% ± 3.0, paired diff +2.0 ± 10.4.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 42 over 4 battles (10.5 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| SHAM.WOW 1.4 | rank257-band4 | 79.0% ± 9.2 | 88.6% ± 11.7 | 69.9% ± 7.4 | 124 / 140 | - | - | 42 | - | 1.03 / 4634.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| SHAM.WOW 1.4 | 4 | 1110 | 18.0% | 75.2% | 0.0% | 6.8% | 807 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| SHAM.WOW 1.4 | 4 | 4 | n/a | 0 | 0.30 | 0 | 0 | 0 |

4 of 4 battles trusted.
