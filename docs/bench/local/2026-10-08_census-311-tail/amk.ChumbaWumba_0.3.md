# amk.ChumbaWumba 0.3 (rank420-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.3% | 97.1% | 62.2% | 34 / 35 | - | - | 9 | - | 0.98 / 884.0 | 81.8% | -0.5 |
| 2 | 85.4% | 97.1% | 68.6% | 34 / 35 | - | - | 17 | - | 1.00 / 149.3 | 80.9% | +4.5 |
| 3 | 84.7% | 97.1% | 68.3% | 34 / 35 | - | - | 11 | - | 0.95 / 1334.6 | 83.9% | +0.8 |
| 4 | 86.0% | 100.0% | 66.8% | 35 / 35 | - | - | 11 | - | 1.01 / 876.7 | 85.2% | +0.8 |

Mean score share 84.4% ± 3.3, baseline 82.9% ± 3.1, paired diff +1.4 ± 3.4.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 48 over 4 battles (12.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| amk.ChumbaWumba 0.3 | rank420-band5 | 84.4% ± 3.3 | 97.9% ± 2.3 | 66.5% ± 4.8 | 137 / 140 | - | - | 48 | - | 1.01 / 1334.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| amk.ChumbaWumba 0.3 | 4 | 640 | 5.9% | 91.3% | 0.0% | 2.9% | 592 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| amk.ChumbaWumba 0.3 | 4 | 4 | n/a | 0 | 0.34 | 0 | 0 | 0 |

4 of 4 battles trusted.
