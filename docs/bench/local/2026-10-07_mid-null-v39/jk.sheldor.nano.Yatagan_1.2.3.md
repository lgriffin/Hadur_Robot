# jk.sheldor.nano.Yatagan 1.2.3 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 96.3% | 100.0% | 7.0% | 35 / 35 | - | - | 0 | - | 0.15 / 6.5 | 79.1% | +17.2 |
| 2 | 97.3% | 100.0% | 24.1% | 35 / 35 | - | - | 0 | - | 0.16 / 7.7 | 77.5% | +19.7 |
| 3 | 96.8% | 100.0% | 17.6% | 35 / 35 | - | - | 0 | - | 0.16 / 9.1 | 80.3% | +16.5 |
| 4 | 96.4% | 100.0% | 16.7% | 35 / 35 | - | - | 0 | - | 0.15 / 7.1 | 75.4% | +21.0 |
| 5 | 96.8% | 100.0% | 28.6% | 35 / 35 | - | - | 0 | - | 0.16 / 9.7 | 75.7% | +21.1 |
| 6 | 82.2% | 97.1% | 60.5% | 34 / 35 | - | - | 1 | - | 0.76 / 235.1 | 77.9% | +4.3 |
| 7 | 96.3% | 100.0% | 24.7% | 35 / 35 | - | - | 0 | - | 0.15 / 7.4 | 85.4% | +11.0 |
| 8 | 89.9% | 97.1% | 8.2% | 34 / 35 | - | - | 0 | - | 0.15 / 7.3 | 77.1% | +12.8 |

Mean score share 94.0% ± 4.5, baseline 78.6% ± 2.7, paired diff +15.4 ± 4.9.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 1 over 8 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jk.sheldor.nano.Yatagan 1.2.3 | mid | 94.0% ± 4.5 | 99.3% ± 1.1 | 23.4% ± 14.1 | 278 / 280 | - | - | 1 | - | 0.76 / 235.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jk.sheldor.nano.Yatagan 1.2.3 | 8 | 163 | 7.7% | 73.8% | 13.9% | 4.6% | 815 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jk.sheldor.nano.Yatagan 1.2.3 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |

8 of 8 battles trusted.
