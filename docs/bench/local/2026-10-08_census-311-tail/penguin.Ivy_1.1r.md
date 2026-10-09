# penguin.Ivy 1.1r (rank277-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 84.9% | 91.4% | 78.0% | 32 / 35 | - | - | 18 | - | 1.04 / 707.2 | 89.4% | -4.6 |
| 2 | 89.9% | 97.1% | 82.3% | 34 / 35 | - | - | 20 | - | 1.06 / 588.7 | 88.8% | +1.1 |
| 3 | 82.9% | 88.6% | 77.1% | 31 / 35 | - | - | 26 | - | 1.02 / 570.8 | 77.2% | +5.7 |
| 4 | 87.2% | 94.3% | 80.1% | 33 / 35 | - | - | 23 | - | 1.06 / 503.8 | 81.8% | +5.3 |

Mean score share 86.2% ± 4.8, baseline 84.3% ± 9.3, paired diff +1.9 ± 7.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 87 over 4 battles (21.8 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| penguin.Ivy 1.1r | rank277-band4 | 86.2% ± 4.8 | 92.9% ± 5.9 | 79.4% ± 3.7 | 130 / 140 | - | - | 87 | - | 1.06 / 707.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| penguin.Ivy 1.1r | 4 | 697 | 17.9% | 74.8% | 0.0% | 7.2% | 824 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| penguin.Ivy 1.1r | 4 | 4 | n/a | 0 | 0.62 | 0 | 0 | 0 |

4 of 4 battles trusted.
