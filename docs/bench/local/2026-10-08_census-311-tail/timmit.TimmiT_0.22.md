# timmit.TimmiT 0.22 (rank545-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 91.2% | 97.1% | 83.1% | 34 / 35 | - | - | 15 | - | 0.93 / 614.0 | 87.4% | +3.8 |
| 2 | 93.5% | 100.0% | 84.5% | 35 / 35 | - | - | 11 | - | 0.91 / 659.2 | 89.8% | +3.7 |
| 3 | 94.3% | 100.0% | 86.7% | 35 / 35 | - | - | 4 | - | 0.91 / 242.4 | 88.3% | +6.0 |
| 4 | 94.5% | 100.0% | 86.5% | 35 / 35 | - | - | 6 | - | 0.91 / 737.1 | 85.8% | +8.7 |

Mean score share 93.4% ± 2.4, baseline 87.8% ± 2.7, paired diff +5.6 ± 3.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 36 over 4 battles (9.0 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| timmit.TimmiT 0.22 | rank545-band5 | 93.4% ± 2.4 | 99.3% ± 2.3 | 85.2% ± 2.7 | 139 / 140 | - | - | 36 | - | 0.93 / 737.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| timmit.TimmiT 0.22 | 4 | 275 | 4.5% | 93.4% | 0.0% | 2.1% | 540 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| timmit.TimmiT 0.22 | 4 | 4 | n/a | 0 | 0.26 | 0 | 0 | 0 |

4 of 4 battles trusted.
