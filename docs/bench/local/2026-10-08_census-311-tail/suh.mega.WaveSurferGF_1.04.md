# suh.mega.WaveSurferGF 1.04 (rank214-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 86.8% | 97.1% | 77.0% | 34 / 35 | - | - | 19 | - | 0.98 / 1007.3 | 80.5% | +6.4 |
| 2 | 84.5% | 91.4% | 78.1% | 32 / 35 | - | - | 3 | - | 0.88 / 1098.9 | 74.0% | +10.6 |
| 3 | 83.8% | 91.4% | 76.7% | 32 / 35 | - | - | 30 | - | 0.98 / 928.4 | 81.1% | +2.7 |
| 4 | 84.5% | 94.3% | 75.3% | 33 / 35 | - | - | 11 | - | 0.82 / 454.3 | 82.2% | +2.3 |

Mean score share 84.9% ± 2.1, baseline 79.4% ± 5.9, paired diff +5.5 ± 6.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 63 over 4 battles (15.8 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| suh.mega.WaveSurferGF 1.04 | rank214-band4 | 84.9% ± 2.1 | 93.6% ± 4.4 | 76.8% ± 1.8 | 131 / 140 | - | - | 63 | - | 0.98 / 1098.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| suh.mega.WaveSurferGF 1.04 | 4 | 795 | 14.2% | 79.8% | 0.0% | 6.0% | 863 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| suh.mega.WaveSurferGF 1.04 | 4 | 4 | n/a | 0 | 0.45 | 0 | 0 | 0 |

4 of 4 battles trusted.
