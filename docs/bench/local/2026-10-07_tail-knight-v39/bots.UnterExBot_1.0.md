# bots.UnterExBot 1.0 (weak) vs rsalesc.mega.Knight 0.6.28

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 98.2% | 100.0% | 96.3% | 35 / 35 | - | - | 1 | - | 0.92 / 15.7 | 98.2% | -0.1 |
| 2 | 98.2% | 100.0% | 96.4% | 35 / 35 | - | - | 1 | - | 1.00 / 15.0 | 97.5% | +0.7 |
| 3 | 97.9% | 100.0% | 95.7% | 35 / 35 | - | - | 1 | - | 0.98 / 15.0 | 98.2% | -0.3 |
| 4 | 97.0% | 100.0% | 93.8% | 35 / 35 | - | - | 2 | - | 0.97 / 15.8 | 98.1% | -1.2 |
| 5 | 97.9% | 100.0% | 95.7% | 35 / 35 | - | - | 1 | - | 0.92 / 15.7 | 99.4% | -1.5 |
| 6 | 97.8% | 100.0% | 95.5% | 35 / 35 | - | - | 2 | - | 0.95 / 15.8 | 99.7% | -1.9 |
| 7 | 97.7% | 100.0% | 95.3% | 35 / 35 | - | - | 3 | - | 0.96 / 16.6 | 98.4% | -0.7 |
| 8 | 98.0% | 100.0% | 95.9% | 35 / 35 | - | - | 0 | - | 0.95 / 14.6 | 98.9% | -0.9 |

Mean score share 97.8% ± 0.3, baseline 98.6% ± 0.6, paired diff -0.7 ± 0.7.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 11 over 8 battles (1.4 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| bots.UnterExBot 1.0 | weak | 97.8% ± 0.3 | 100.0% ± 0.0 | 95.6% ± 0.7 | 280 / 280 | - | - | 11 | - | 1.00 / 16.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| bots.UnterExBot 1.0 | 8 | 108 | 0.0% | 99.8% | 0.2% | 0.0% | 519 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| bots.UnterExBot 1.0 | 8 | 8 | n/a | 0 | 0.04 | 0 | 0 | 0 |

8 of 8 battles trusted.
