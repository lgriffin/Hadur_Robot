# sheldor.mini.Foilist 1.3.1 (rank42-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 61.9% | 68.6% | 55.4% | 24 / 35 | - | - | 37 | - | 1.22 / 492.6 | 55.7% | +6.2 |
| 2 | 64.0% | 72.7% | 55.4% | 26 / 35 | - | - | 53 | - | 1.17 / 792.3 | 68.0% | -4.0 |
| 3 | 72.1% | 80.0% | 64.2% | 28 / 35 | - | - | 34 | - | 1.20 / 101.0 | 74.3% | -2.2 |
| 4 | 70.5% | 80.0% | 61.0% | 28 / 35 | - | - | 48 | - | 1.21 / 899.6 | 71.1% | -0.6 |

Mean score share 67.1% ± 7.8, baseline 67.2% ± 12.9, paired diff -0.1 ± 7.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 172 over 4 battles (43.0 per battle, most in one battle 53). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.mini.Foilist 1.3.1 | rank42-band2 | 67.1% ± 7.8 | 75.3% ± 9.0 | 59.0% ± 6.9 | 106 / 140 | - | - | 172 | - | 1.22 / 899.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sheldor.mini.Foilist 1.3.1 | 4 | 1572 | 27.0% | 62.2% | 0.0% | 10.7% | 1199 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sheldor.mini.Foilist 1.3.1 | 4 | 4 | n/a | 0 | 1.23 | 0 | 0 | 0 |

4 of 4 battles trusted.
