# ers.nano.gokdeniz.Gokdeniz 1.5b (rank346-band4) vs jd.Nullstride 2.3.3

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 90.0% | 100.0% | 79.3% | 35 / 35 | - | - | 6 | - | 0.88 / 4417.3 |
| 2 | 82.3% | 94.3% | 70.8% | 33 / 35 | - | - | 4 | - | 0.90 / 4542.2 |
| 3 | 83.9% | 97.1% | 71.6% | 34 / 35 | - | - | 2 | - | 0.95 / 4653.0 |
| 4 | 85.7% | 100.0% | 71.8% | 35 / 35 | - | - | 12 | - | 0.88 / 4525.6 |

Mean score share 85.5% ± 5.3.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 24 over 4 battles (6.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ers.nano.gokdeniz.Gokdeniz 1.5b | rank346-band4 | 85.5% ± 5.3 | 97.9% ± 4.4 | 73.4% ± 6.3 | 137 / 140 | - | - | 24 | - | 0.95 / 4653.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ers.nano.gokdeniz.Gokdeniz 1.5b | 4 | 739 | 5.1% | 93.0% | 0.0% | 2.0% | 579 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ers.nano.gokdeniz.Gokdeniz 1.5b | 4 | 4 | n/a | 0 | 0.17 | 0 | 0 | 0 |

4 of 4 battles trusted.
