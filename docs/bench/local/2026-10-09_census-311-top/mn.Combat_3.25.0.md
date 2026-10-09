# mn.Combat 3.25.0 (rank38-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 63.5% | 68.6% | 57.8% | 24 / 35 | - | - | 32 | - | 1.64 / 637.4 | 47.5% | +15.9 |
| 2 | 62.6% | 68.6% | 57.1% | 24 / 35 | - | - | 29 | - | 1.64 / 847.0 | 50.9% | +11.7 |
| 3 | 59.7% | 64.7% | 55.2% | 23 / 35 | - | - | 29 | - | 1.60 / 678.5 | 64.1% | -4.4 |
| 4 | 53.7% | 54.3% | 52.7% | 19 / 35 | - | - | 27 | - | 1.55 / 1086.3 | 56.2% | -2.5 |

Mean score share 59.9% ± 7.0, baseline 54.7% ± 11.5, paired diff +5.2 ± 16.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 117 over 4 battles (29.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| mn.Combat 3.25.0 | rank38-band2 | 59.9% ± 7.0 | 64.0% ± 10.7 | 55.7% ± 3.6 | 90 / 140 | - | - | 117 | - | 1.64 / 1086.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| mn.Combat 3.25.0 | 4 | 2002 | 31.2% | 56.2% | 0.0% | 12.6% | 1231 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| mn.Combat 3.25.0 | 4 | 4 | n/a | 0 | 0.84 | 0 | 0 | 0 |

4 of 4 battles trusted.
