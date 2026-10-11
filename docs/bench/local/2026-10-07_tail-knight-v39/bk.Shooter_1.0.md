# bk.Shooter 1.0 (weak) vs rsalesc.mega.Knight 0.6.28

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 97.9% | 100.0% | 96.0% | 35 / 35 | - | - | 3 | - | 0.99 / 14.0 | 98.4% | -0.5 |
| 2 | 98.5% | 100.0% | 97.1% | 35 / 35 | - | - | 4 | - | 0.99 / 13.6 | 98.4% | +0.1 |
| 3 | 99.3% | 100.0% | 98.6% | 35 / 35 | - | - | 2 | - | 0.98 / 14.3 | 98.2% | +1.1 |
| 4 | 99.8% | 100.0% | 99.7% | 35 / 35 | - | - | 2 | - | 0.91 / 14.2 | 98.4% | +1.4 |
| 5 | 99.5% | 100.0% | 99.0% | 35 / 35 | - | - | 0 | - | 1.02 / 12.7 | 98.6% | +0.9 |
| 6 | 99.6% | 100.0% | 99.3% | 35 / 35 | - | - | 1 | - | 0.94 / 14.7 | 98.4% | +1.3 |
| 7 | 98.6% | 100.0% | 97.2% | 35 / 35 | - | - | 5 | - | 1.00 / 13.9 | 98.6% | -0.0 |
| 8 | 99.5% | 100.0% | 99.0% | 35 / 35 | - | - | 6 | - | 1.01 / 12.9 | 97.5% | +1.9 |

Mean score share 99.1% ± 0.6, baseline 98.3% ± 0.3, paired diff +0.8 ± 0.7.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 23 over 8 battles (2.9 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| bk.Shooter 1.0 | weak | 99.1% ± 0.6 | 100.0% ± 0.0 | 98.2% ± 1.1 | 280 / 280 | - | - | 23 | - | 1.02 / 14.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| bk.Shooter 1.0 | 8 | 51 | 0.0% | 100.0% | 0.0% | 0.0% | 455 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| bk.Shooter 1.0 | 8 | 8 | n/a | 0 | 0.08 | 0 | 0 | 0 |

8 of 8 battles trusted.
