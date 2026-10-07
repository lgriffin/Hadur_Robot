# chase.pm.Pytko 1.0 (mid-shield) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 97.8% | 100.0% | 26.6% | 35 / 35 | - | - | 0 | - | 0.72 / 8.3 | 70.3% | +27.5 |
| 2 | 98.2% | 100.0% | 17.4% | 35 / 35 | - | - | 0 | - | 0.81 / 10.1 | 65.8% | +32.4 |
| 3 | 99.6% | 100.0% | 47.1% | 35 / 35 | - | - | 0 | - | 0.78 / 9.7 | 76.2% | +23.3 |
| 4 | 99.1% | 100.0% | 34.5% | 35 / 35 | - | - | 0 | - | 0.78 / 9.1 | 71.7% | +27.4 |
| 5 | 96.1% | 100.0% | 0.0% | 35 / 35 | - | - | 0 | - | 0.97 / 10.3 | 68.1% | +28.0 |
| 6 | 98.7% | 100.0% | 22.2% | 35 / 35 | - | - | 0 | - | 0.93 / 10.0 | 73.9% | +24.8 |
| 7 | 99.2% | 100.0% | 44.8% | 35 / 35 | - | - | 0 | - | 0.78 / 9.6 | 73.3% | +25.9 |
| 8 | 97.8% | 100.0% | 30.9% | 35 / 35 | - | - | 0 | - | 0.77 / 9.7 | 71.3% | +26.5 |

Mean score share 98.3% ± 0.9, baseline 71.3% ± 2.8, paired diff +27.0 ± 2.2.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 0 over 8 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| chase.pm.Pytko 1.0 | mid-shield | 98.3% ± 0.9 | 100.0% ± 0.0 | 27.9% ± 12.8 | 280 / 280 | - | - | 0 | - | 0.97 / 10.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| chase.pm.Pytko 1.0 | 8 | 36 | 0.0% | 100.0% | 0.0% | 0.0% | 949 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| chase.pm.Pytko 1.0 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |

8 of 8 battles trusted.
