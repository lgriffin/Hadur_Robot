# lazarecki.mega.PinkerStinker 0.7 (rank186-band3) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 79.6% | 88.6% | 70.2% | 31 / 35 | - | - | 22 | - | 1.12 / 1656.1 | 77.7% | +1.9 |
| 2 | 73.0% | 82.9% | 63.3% | 29 / 35 | - | - | 33 | - | 1.11 / 237.6 | 73.6% | -0.6 |
| 3 | 80.3% | 91.4% | 69.4% | 32 / 35 | - | - | 33 | - | 1.10 / 129.4 | 82.9% | -2.6 |
| 4 | 81.8% | 94.3% | 69.6% | 33 / 35 | - | - | 20 | - | 1.08 / 43.2 | 72.8% | +9.0 |

Mean score share 78.7% ± 6.2, baseline 76.7% ± 7.3, paired diff +1.9 ± 8.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 108 over 4 battles (27.0 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| lazarecki.mega.PinkerStinker 0.7 | rank186-band3 | 78.7% ± 6.2 | 89.3% ± 7.8 | 68.1% ± 5.1 | 125 / 140 | - | - | 108 | - | 1.12 / 1656.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| lazarecki.mega.PinkerStinker 0.7 | 4 | 1048 | 17.9% | 74.6% | 0.0% | 7.5% | 762 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| lazarecki.mega.PinkerStinker 0.7 | 4 | 4 | n/a | 0 | 0.77 | 0 | 0 | 0 |

4 of 4 battles trusted.
