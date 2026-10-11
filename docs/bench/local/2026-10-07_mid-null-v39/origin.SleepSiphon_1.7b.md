# origin.SleepSiphon 1.7b (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.23 / 14.6 | 92.0% | +8.0 |
| 2 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.24 / 14.7 | 91.2% | +8.8 |
| 3 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.24 / 14.6 | 93.3% | +6.7 |
| 4 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.26 / 33.2 | 87.8% | +12.2 |
| 5 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.25 / 178.5 | 93.9% | +6.1 |
| 6 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.25 / 57.2 | 94.7% | +5.3 |
| 7 | 100.0% | 100.0% | 100.0% | 35 / 35 | - | - | 0 | - | 0.23 / 14.6 | 91.6% | +8.4 |
| 8 | 100.0% | 100.0% | 50.0% | 35 / 35 | - | - | 0 | - | 0.24 / 14.7 | 92.9% | +7.1 |

Mean score share 100.0% ± 0.0, baseline 92.2% ± 1.8, paired diff +7.8 ± 1.8.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| origin.SleepSiphon 1.7b | mid | 100.0% ± 0.0 | 100.0% ± 0.0 | 56.3% ± 14.8 | 280 / 280 | - | - | 0 | - | 0.26 / 178.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| origin.SleepSiphon 1.7b | 8 | - | - | - | - | - | 1915 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| origin.SleepSiphon 1.7b | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |

8 of 8 battles trusted.
