# fm.claire 1.7 (weak) vs rsalesc.mega.Knight 0.6.28

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 94.4% | 100.0% | 85.5% | 35 / 35 | - | - | 0 | - | 0.88 / 14.1 | 90.2% | +4.3 |
| 2 | 94.8% | 100.0% | 86.2% | 35 / 35 | - | - | 2 | - | 0.89 / 14.5 | 94.6% | +0.2 |
| 3 | 95.7% | 100.0% | 87.5% | 35 / 35 | - | - | 2 | - | 0.87 / 14.1 | 92.4% | +3.3 |
| 4 | 94.7% | 100.0% | 85.3% | 35 / 35 | - | - | 0 | - | 0.89 / 14.3 | 93.8% | +0.9 |
| 5 | 94.6% | 100.0% | 85.2% | 35 / 35 | - | - | 0 | - | 0.92 / 14.9 | 90.8% | +3.7 |
| 6 | 95.2% | 100.0% | 86.7% | 35 / 35 | - | - | 1 | - | 0.88 / 13.5 | 92.0% | +3.1 |
| 7 | 96.0% | 100.0% | 88.6% | 35 / 35 | - | - | 1 | - | 0.93 / 15.9 | 92.7% | +3.3 |
| 8 | 93.6% | 100.0% | 82.7% | 35 / 35 | - | - | 5 | - | 0.92 / 13.9 | 89.2% | +4.3 |

Mean score share 94.9% ± 0.6, baseline 92.0% ± 1.5, paired diff +2.9 ± 1.3.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 11 over 8 battles (1.4 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| fm.claire 1.7 | weak | 94.9% ± 0.6 | 100.0% ± 0.0 | 86.0% ± 1.5 | 280 / 280 | - | - | 11 | - | 0.93 / 15.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| fm.claire 1.7 | 8 | 189 | 0.0% | 100.0% | 0.0% | 0.0% | 510 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| fm.claire 1.7 | 8 | 8 | n/a | 0 | 0.04 | 0 | 0 | 0 |

8 of 8 battles trusted.
