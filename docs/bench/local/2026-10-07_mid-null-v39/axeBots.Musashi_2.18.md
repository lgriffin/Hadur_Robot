# axeBots.Musashi 2.18 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 82.8% | 94.3% | 62.5% | 33 / 35 | - | - | 11 | - | 0.98 / 28.9 | 76.7% | +6.1 |
| 2 | 82.3% | 94.3% | 66.7% | 33 / 35 | - | - | 31 | - | 1.05 / 34.6 | 75.7% | +6.6 |
| 3 | 80.8% | 91.4% | 64.6% | 32 / 35 | - | - | 12 | - | 1.08 / 28.6 | 70.6% | +10.2 |
| 4 | 80.9% | 94.3% | 63.4% | 33 / 35 | - | - | 18 | - | 1.05 / 30.2 | 86.0% | -5.1 |
| 5 | 83.4% | 94.3% | 69.1% | 33 / 35 | - | - | 32 | - | 1.17 / 28.6 | 72.4% | +11.1 |
| 6 | 79.0% | 91.4% | 63.0% | 32 / 35 | - | - | 26 | - | 1.18 / 37.3 | 80.1% | -1.2 |
| 7 | 78.1% | 85.7% | 67.7% | 30 / 35 | - | - | 18 | - | 1.11 / 32.9 | 79.5% | -1.4 |
| 8 | 76.1% | 85.7% | 64.3% | 30 / 35 | - | - | 15 | - | 1.11 / 31.6 | 78.0% | -1.9 |

Mean score share 80.4% ± 2.1, baseline 77.4% ± 4.0, paired diff +3.0 ± 5.1.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 163 over 8 battles (20.4 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| axeBots.Musashi 2.18 | mid | 80.4% ± 2.1 | 91.4% ± 3.1 | 65.2% ± 2.0 | 256 / 280 | - | - | 163 | - | 1.18 / 37.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| axeBots.Musashi 2.18 | 8 | 784 | 19.1% | 72.9% | 0.0% | 7.9% | 1119 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| axeBots.Musashi 2.18 | 8 | 8 | n/a | 0 | 0.58 | 0 | 0 | 0 |

8 of 8 battles trusted.
