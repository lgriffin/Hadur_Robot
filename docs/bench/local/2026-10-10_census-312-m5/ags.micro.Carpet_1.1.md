# ags.micro.Carpet 1.1 (rank333-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 82.9% | 94.3% | 69.2% | 33 / 35 | - | - | 11 | - | 1.03 / 4162.7 | 93.2% | -10.3 |
| 2 | 86.7% | 97.1% | 74.3% | 34 / 35 | - | - | 3 | - | 0.90 / 116.9 | 87.2% | -0.5 |
| 3 | 85.7% | 94.3% | 75.1% | 33 / 35 | - | - | 15 | - | 1.11 / 5315.1 | 83.2% | +2.5 |
| 4 | 92.0% | 100.0% | 81.6% | 35 / 35 | - | - | 2 | - | 0.96 / 214.0 | 83.1% | +8.9 |

Mean score share 86.8% ± 6.1, baseline 86.7% ± 7.5, paired diff +0.2 ± 12.7.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 31 over 4 battles (7.8 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.micro.Carpet 1.1 | rank333-band4 | 86.8% ± 6.1 | 96.4% ± 4.4 | 75.0% ± 8.1 | 135 / 140 | - | - | 31 | - | 1.11 / 5315.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ags.micro.Carpet 1.1 | 4 | 571 | 11.0% | 84.4% | 0.0% | 4.6% | 817 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ags.micro.Carpet 1.1 | 4 | 4 | n/a | 0 | 0.22 | 0 | 0 | 0 |

4 of 4 battles trusted.
