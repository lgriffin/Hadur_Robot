# serenity.moonlightBat 1.17 (weak) vs rsalesc.mega.Knight 0.6.28

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 95.7% | 100.0% | 91.4% | 35 / 35 | - | - | 2 | - | 1.03 / 17.1 | 93.6% | +2.1 |
| 2 | 97.3% | 100.0% | 94.5% | 35 / 35 | - | - | 3 | - | 1.01 / 16.5 | 97.0% | +0.3 |
| 3 | 96.1% | 100.0% | 92.2% | 35 / 35 | - | - | 0 | - | 1.03 / 16.2 | 97.3% | -1.2 |
| 4 | 95.7% | 100.0% | 91.4% | 35 / 35 | - | - | 2 | - | 1.00 / 16.7 | 97.0% | -1.4 |
| 5 | 95.9% | 100.0% | 91.8% | 35 / 35 | - | - | 1 | - | 1.06 / 16.8 | 96.2% | -0.3 |
| 6 | 97.2% | 100.0% | 94.2% | 35 / 35 | - | - | 4 | - | 1.00 / 15.6 | 97.4% | -0.3 |
| 7 | 96.5% | 100.0% | 92.8% | 35 / 35 | - | - | 3 | - | 1.01 / 17.9 | 97.8% | -1.3 |
| 8 | 96.6% | 100.0% | 93.2% | 35 / 35 | - | - | 0 | - | 0.98 / 16.6 | 94.2% | +2.5 |

Mean score share 96.4% ± 0.5, baseline 96.3% ± 1.3, paired diff +0.1 ± 1.3.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 15 over 8 battles (1.9 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| serenity.moonlightBat 1.17 | weak | 96.4% ± 0.5 | 100.0% ± 0.0 | 92.7% ± 1.0 | 280 / 280 | - | - | 15 | - | 1.06 / 17.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| serenity.moonlightBat 1.17 | 8 | 186 | 0.0% | 100.0% | 0.0% | 0.0% | 809 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| serenity.moonlightBat 1.17 | 8 | 8 | n/a | 0 | 0.05 | 0 | 0 | 0 |

8 of 8 battles trusted.
