# jk.micro.Cotillion 0.8 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 81.2% | 97.1% | 58.0% | 34 / 35 | - | - | 8 | - | 1.02 / 33.7 | 72.1% | +9.1 |
| 2 | 80.6% | 94.3% | 63.2% | 33 / 35 | - | - | 8 | - | 1.00 / 63.1 | 54.0% | +26.6 |
| 3 | 82.9% | 97.1% | 64.4% | 34 / 35 | - | - | 6 | - | 0.99 / 34.5 | 75.6% | +7.3 |
| 4 | 80.5% | 94.3% | 63.3% | 33 / 35 | - | - | 18 | - | 1.14 / 34.9 | 66.4% | +14.1 |
| 5 | 82.8% | 97.1% | 63.9% | 34 / 35 | - | - | 9 | - | 1.05 / 31.2 | 67.4% | +15.4 |
| 6 | 80.2% | 91.4% | 65.6% | 32 / 35 | - | - | 6 | - | 0.97 / 37.6 | 60.2% | +20.1 |
| 7 | 82.6% | 94.3% | 67.6% | 33 / 35 | - | - | 12 | - | 1.02 / 29.3 | 60.7% | +21.9 |
| 8 | 86.4% | 97.1% | 73.2% | 34 / 35 | - | - | 16 | - | 1.12 / 26.2 | 68.9% | +17.5 |

Mean score share 82.1% ± 1.7, baseline 65.7% ± 5.9, paired diff +16.5 ± 5.4.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 83 over 8 battles (10.4 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jk.micro.Cotillion 0.8 | mid | 82.1% ± 1.7 | 95.4% ± 1.8 | 64.9% ± 3.6 | 267 / 280 | - | - | 83 | - | 1.14 / 63.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jk.micro.Cotillion 0.8 | 8 | 743 | 10.9% | 84.7% | 0.0% | 4.3% | 770 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jk.micro.Cotillion 0.8 | 8 | 8 | n/a | 0 | 0.30 | 0 | 0 | 0 |

8 of 8 battles trusted.
