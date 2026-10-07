# omens.CannonfodderNano 1.4 (weak) vs rsalesc.mega.Knight 0.6.28

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 98.9% | 100.0% | 98.0% | 35 / 35 | - | - | 2 | - | 0.97 / 14.8 | 97.0% | +1.9 |
| 2 | 98.5% | 100.0% | 97.2% | 35 / 35 | - | - | 1 | - | 1.01 / 14.3 | 96.6% | +1.9 |
| 3 | 98.6% | 100.0% | 97.4% | 35 / 35 | - | - | 0 | - | 0.95 / 16.0 | 97.8% | +0.8 |
| 4 | 98.8% | 100.0% | 97.8% | 35 / 35 | - | - | 2 | - | 0.98 / 13.7 | 96.6% | +2.3 |
| 5 | 98.6% | 100.0% | 97.3% | 35 / 35 | - | - | 1 | - | 0.94 / 15.4 | 97.3% | +1.3 |
| 6 | 97.7% | 100.0% | 95.7% | 35 / 35 | - | - | 4 | - | 1.01 / 14.2 | 98.2% | -0.5 |
| 7 | 98.3% | 100.0% | 96.7% | 35 / 35 | - | - | 5 | - | 0.97 / 15.1 | 96.2% | +2.1 |
| 8 | 97.9% | 100.0% | 96.0% | 35 / 35 | - | - | 2 | - | 1.00 / 14.8 | 97.0% | +0.9 |

Mean score share 98.4% ± 0.4, baseline 97.1% ± 0.6, paired diff +1.3 ± 0.8.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 17 over 8 battles (2.1 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| omens.CannonfodderNano 1.4 | weak | 98.4% ± 0.4 | 100.0% ± 0.0 | 97.0% ± 0.7 | 280 / 280 | - | - | 17 | - | 1.01 / 16.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| omens.CannonfodderNano 1.4 | 8 | 88 | 0.0% | 99.1% | 0.9% | 0.0% | 479 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| omens.CannonfodderNano 1.4 | 8 | 8 | n/a | 0 | 0.06 | 0 | 0 | 0 |

8 of 8 battles trusted.
