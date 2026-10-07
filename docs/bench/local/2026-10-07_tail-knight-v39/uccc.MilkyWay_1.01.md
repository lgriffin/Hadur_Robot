# uccc.MilkyWay 1.01 (weak) vs rsalesc.mega.Knight 0.6.28

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 98.9% | 100.0% | 97.9% | 35 / 35 | - | - | 1 | - | 0.97 / 14.7 | 97.4% | +1.6 |
| 2 | 99.0% | 100.0% | 98.1% | 35 / 35 | - | - | 2 | - | 1.00 / 13.8 | 98.0% | +1.0 |
| 3 | 99.2% | 100.0% | 98.5% | 35 / 35 | - | - | 1 | - | 0.99 / 14.4 | 95.8% | +3.3 |
| 4 | 99.5% | 100.0% | 99.0% | 35 / 35 | - | - | 2 | - | 0.96 / 13.3 | 97.8% | +1.7 |
| 5 | 98.7% | 100.0% | 97.6% | 35 / 35 | - | - | 0 | - | 1.02 / 14.4 | 97.1% | +1.6 |
| 6 | 99.1% | 100.0% | 98.3% | 35 / 35 | - | - | 0 | - | 0.97 / 16.1 | 96.3% | +2.8 |
| 7 | 99.2% | 100.0% | 98.5% | 35 / 35 | - | - | 2 | - | 0.98 / 14.5 | 97.8% | +1.4 |
| 8 | 98.3% | 100.0% | 96.9% | 35 / 35 | - | - | 4 | - | 0.99 / 14.2 | 98.5% | -0.3 |

Mean score share 99.0% ± 0.3, baseline 97.3% ± 0.8, paired diff +1.6 ± 0.9.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 12 over 8 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| uccc.MilkyWay 1.01 | weak | 99.0% ± 0.3 | 100.0% ± 0.0 | 98.1% ± 0.5 | 280 / 280 | - | - | 12 | - | 1.02 / 16.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| uccc.MilkyWay 1.01 | 8 | 57 | 0.0% | 97.8% | 2.2% | 0.0% | 443 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| uccc.MilkyWay 1.01 | 8 | 8 | n/a | 0 | 0.04 | 0 | 0 | 0 |

8 of 8 battles trusted.
