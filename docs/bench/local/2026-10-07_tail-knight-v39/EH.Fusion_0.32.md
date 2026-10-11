# EH.Fusion 0.32 (weak) vs rsalesc.mega.Knight 0.6.28

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 86.1% | 100.0% | 77.9% | 35 / 35 | - | - | 0 | - | 0.81 / 10.5 | 79.6% | +6.5 |
| 2 | 85.8% | 100.0% | 77.9% | 35 / 35 | - | - | 1 | - | 0.96 / 86.0 | 85.0% | +0.8 |
| 3 | 86.3% | 100.0% | 78.1% | 35 / 35 | - | - | 0 | - | 0.82 / 10.3 | 81.7% | +4.6 |
| 4 | 87.3% | 100.0% | 79.8% | 35 / 35 | - | - | 1 | - | 0.89 / 10.2 | 78.5% | +8.8 |
| 5 | 88.2% | 100.0% | 80.8% | 35 / 35 | - | - | 0 | - | 0.82 / 13.3 | 80.6% | +7.6 |
| 6 | 88.1% | 100.0% | 80.7% | 35 / 35 | - | - | 2 | - | 0.88 / 12.9 | 83.8% | +4.4 |
| 7 | 86.3% | 100.0% | 78.4% | 35 / 35 | - | - | 1 | - | 0.95 / 58.3 | 81.6% | +4.7 |
| 8 | 85.3% | 100.0% | 76.7% | 35 / 35 | - | - | 2 | - | 0.85 / 10.0 | 79.7% | +5.7 |

Mean score share 86.7% ± 0.9, baseline 81.3% ± 1.8, paired diff +5.4 ± 2.0.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 7 over 8 battles (0.9 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| EH.Fusion 0.32 | weak | 86.7% ± 0.9 | 100.0% ± 0.0 | 78.8% ± 1.2 | 280 / 280 | - | - | 7 | - | 0.96 / 86.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| EH.Fusion 0.32 | 8 | 874 | 0.0% | 91.9% | 8.1% | 0.0% | 299 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| EH.Fusion 0.32 | 8 | 8 | n/a | 0 | 0.03 | 0 | 0 | 0 |

8 of 8 battles trusted.
