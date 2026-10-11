# amk.superstrike.SuperStrike 0.3 (weak) vs rsalesc.mega.Knight 0.6.28

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 97.0% | 100.0% | 93.6% | 35 / 35 | - | - | 1 | - | 1.08 / 15.3 | 95.2% | +1.8 |
| 2 | 96.4% | 100.0% | 92.2% | 35 / 35 | - | - | 4 | - | 1.09 / 14.6 | 96.8% | -0.4 |
| 3 | 97.8% | 100.0% | 95.6% | 35 / 35 | - | - | 5 | - | 1.10 / 14.0 | 96.6% | +1.2 |
| 4 | 98.2% | 100.0% | 96.2% | 35 / 35 | - | - | 2 | - | 1.06 / 15.0 | 96.4% | +1.8 |
| 5 | 98.1% | 100.0% | 95.9% | 35 / 35 | - | - | 0 | - | 1.07 / 28.9 | 97.0% | +1.1 |
| 6 | 94.9% | 100.0% | 89.9% | 35 / 35 | - | - | 2 | - | 1.09 / 15.9 | 97.8% | -2.9 |
| 7 | 94.7% | 100.0% | 89.4% | 35 / 35 | - | - | 7 | - | 1.12 / 15.7 | 96.7% | -2.0 |
| 8 | 98.3% | 100.0% | 96.5% | 35 / 35 | - | - | 2 | - | 1.07 / 14.1 | 98.0% | +0.3 |

Mean score share 96.9% ± 1.2, baseline 96.8% ± 0.7, paired diff +0.1 ± 1.5.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 23 over 8 battles (2.9 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| amk.superstrike.SuperStrike 0.3 | weak | 96.9% ± 1.2 | 100.0% ± 0.0 | 93.6% ± 2.4 | 280 / 280 | - | - | 23 | - | 1.12 / 28.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| amk.superstrike.SuperStrike 0.3 | 8 | 151 | 0.0% | 99.9% | 0.1% | 0.0% | 463 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| amk.superstrike.SuperStrike 0.3 | 8 | 8 | n/a | 0 | 0.08 | 0 | 0 | 0 |

8 of 8 battles trusted.
