# SHAM.WOW 1.4 (rank257-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 84.6% | 91.4% | 77.8% | 32 / 35 | - | - | 22 | - | 1.03 / 1320.5 | 79.3% | +5.3 |
| 2 | 74.0% | 82.9% | 65.8% | 29 / 35 | - | - | 16 | - | 1.09 / 1598.8 | 77.0% | -3.0 |
| 3 | 82.2% | 91.4% | 73.8% | 32 / 35 | - | - | 17 | - | 1.06 / 1245.0 | 71.6% | +10.6 |
| 4 | 73.5% | 80.0% | 66.7% | 28 / 35 | - | - | 28 | - | 1.07 / 686.0 | 78.7% | -5.2 |

Mean score share 78.5% ± 9.0, baseline 76.6% ± 5.6, paired diff +1.9 ± 11.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 83 over 4 battles (20.8 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| SHAM.WOW 1.4 | rank257-band4 | 78.5% ± 9.0 | 86.4% ± 9.4 | 71.0% ± 9.2 | 121 / 140 | - | - | 83 | - | 1.09 / 1598.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| SHAM.WOW 1.4 | 4 | 1144 | 20.8% | 71.7% | 0.0% | 7.5% | 805 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| SHAM.WOW 1.4 | 4 | 4 | n/a | 0 | 0.59 | 0 | 0 | 0 |

4 of 4 battles trusted.
