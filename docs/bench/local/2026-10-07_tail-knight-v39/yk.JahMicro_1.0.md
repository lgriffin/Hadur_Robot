# yk.JahMicro 1.0 (weak) vs rsalesc.mega.Knight 0.6.28

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 95.2% | 100.0% | 90.8% | 35 / 35 | - | - | 4 | - | 0.98 / 16.1 | 94.4% | +0.7 |
| 2 | 94.7% | 100.0% | 90.2% | 35 / 35 | - | - | 3 | - | 0.99 / 15.7 | 91.5% | +3.2 |
| 3 | 96.2% | 100.0% | 92.8% | 35 / 35 | - | - | 0 | - | 1.02 / 16.0 | 91.7% | +4.5 |
| 4 | 96.3% | 100.0% | 93.1% | 35 / 35 | - | - | 1 | - | 1.00 / 15.5 | 91.5% | +4.9 |
| 5 | 94.8% | 100.0% | 90.5% | 35 / 35 | - | - | 2 | - | 1.02 / 16.2 | 94.9% | -0.0 |
| 6 | 97.0% | 100.0% | 94.1% | 35 / 35 | - | - | 2 | - | 0.94 / 15.9 | 94.1% | +2.9 |
| 7 | 95.5% | 100.0% | 91.5% | 35 / 35 | - | - | 1 | - | 0.98 / 16.8 | 95.3% | +0.2 |
| 8 | 95.1% | 100.0% | 90.8% | 35 / 35 | - | - | 5 | - | 1.00 / 17.8 | 93.8% | +1.2 |

Mean score share 95.6% ± 0.7, baseline 93.4% ± 1.3, paired diff +2.2 ± 1.6.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 18 over 8 battles (2.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | weak | 95.6% ± 0.7 | 100.0% ± 0.0 | 91.7% ± 1.2 | 280 / 280 | - | - | 18 | - | 1.02 / 17.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | 8 | 247 | 0.0% | 98.9% | 1.1% | 0.0% | 608 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| yk.JahMicro 1.0 | 8 | 8 | n/a | 0 | 0.06 | 0 | 0 | 0 |

8 of 8 battles trusted.
