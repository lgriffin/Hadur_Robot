# sheldor.micro.EpeeistDC 3.0 (rank105-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 73.6% | 88.6% | 58.7% | 31 / 35 | - | - | 43 | - | 1.21 / 983.4 | 68.7% | +4.9 |
| 2 | 76.8% | 91.4% | 62.3% | 32 / 35 | - | - | 15 | - | 1.07 / 3484.3 | 69.5% | +7.3 |
| 3 | 65.0% | 80.0% | 51.2% | 28 / 35 | - | - | 21 | - | 1.15 / 1195.0 | 69.4% | -4.4 |
| 4 | 67.8% | 80.0% | 56.4% | 28 / 35 | - | - | 26 | - | 1.13 / 3529.4 | 73.0% | -5.2 |

Mean score share 70.8% ± 8.5, baseline 70.1% ± 3.1, paired diff +0.6 ± 10.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 105 over 4 battles (26.3 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sheldor.micro.EpeeistDC 3.0 | rank105-band3 | 70.8% ± 8.5 | 85.0% ± 9.4 | 57.2% ± 7.4 | 119 / 140 | - | - | 105 | - | 1.21 / 3529.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sheldor.micro.EpeeistDC 3.0 | 4 | 1413 | 18.6% | 73.5% | 0.0% | 8.0% | 896 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sheldor.micro.EpeeistDC 3.0 | 4 | 4 | n/a | 0 | 0.75 | 0 | 0 | 0 |

4 of 4 battles trusted.
