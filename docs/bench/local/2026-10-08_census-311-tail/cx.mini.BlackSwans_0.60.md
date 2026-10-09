# cx.mini.BlackSwans 0.60 (rank276-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 74.0% | 88.6% | 60.0% | 31 / 35 | - | - | 7 | - | 1.75 / 939.4 | 76.2% | -2.1 |
| 2 | 82.8% | 97.1% | 67.9% | 34 / 35 | - | - | 15 | - | 1.88 / 513.4 | 78.3% | +4.5 |
| 3 | 79.7% | 97.1% | 62.9% | 34 / 35 | - | - | 10 | - | 1.77 / 372.9 | 74.2% | +5.4 |
| 4 | 73.5% | 88.6% | 59.4% | 31 / 35 | - | - | 16 | - | 1.94 / 318.7 | 79.1% | -5.6 |

Mean score share 77.5% ± 7.2, baseline 76.9% ± 3.5, paired diff +0.5 ± 8.4.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 48 over 4 battles (12.0 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.mini.BlackSwans 0.60 | rank276-band4 | 77.5% ± 7.2 | 92.9% ± 7.9 | 62.5% ± 6.2 | 130 / 140 | - | - | 48 | - | 1.94 / 939.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cx.mini.BlackSwans 0.60 | 4 | 1098 | 11.4% | 83.1% | 0.1% | 5.4% | 600 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cx.mini.BlackSwans 0.60 | 4 | 4 | n/a | 0 | 0.34 | 0 | 0 | 0 |

4 of 4 battles trusted.
