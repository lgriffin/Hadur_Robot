# oog.melee.Mercutio 1.0 (weak) vs rsalesc.mega.Knight 0.6.28

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 97.3% | 100.0% | 94.5% | 35 / 35 | - | - | 4 | - | 1.03 / 14.5 | 97.1% | +0.2 |
| 2 | 96.4% | 100.0% | 92.7% | 35 / 35 | - | - | 12 | - | 1.11 / 12.1 | 95.7% | +0.7 |
| 3 | 96.1% | 100.0% | 92.2% | 35 / 35 | - | - | 12 | - | 1.11 / 13.7 | 97.5% | -1.5 |
| 4 | 97.5% | 100.0% | 94.8% | 35 / 35 | - | - | 3 | - | 1.02 / 11.9 | 95.3% | +2.1 |
| 5 | 97.4% | 100.0% | 94.8% | 35 / 35 | - | - | 8 | - | 1.07 / 12.4 | 96.7% | +0.7 |
| 6 | 96.8% | 100.0% | 93.6% | 35 / 35 | - | - | 6 | - | 1.14 / 12.3 | 92.7% | +4.1 |
| 7 | 97.0% | 100.0% | 94.0% | 35 / 35 | - | - | 7 | - | 1.11 / 10.9 | 96.4% | +0.7 |
| 8 | 97.0% | 100.0% | 93.9% | 35 / 35 | - | - | 4 | - | 1.09 / 12.1 | 97.3% | -0.4 |

Mean score share 96.9% ± 0.4, baseline 96.1% ± 1.3, paired diff +0.8 ± 1.4.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 56 over 8 battles (7.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| oog.melee.Mercutio 1.0 | weak | 96.9% ± 0.4 | 100.0% ± 0.0 | 93.8% ± 0.8 | 280 / 280 | - | - | 56 | - | 1.14 / 14.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| oog.melee.Mercutio 1.0 | 8 | 159 | 0.0% | 99.8% | 0.2% | 0.0% | 638 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| oog.melee.Mercutio 1.0 | 8 | 8 | n/a | 0 | 0.20 | 0 | 0 | 0 |

8 of 8 battles trusted.
