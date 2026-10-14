# mn.micro.perceptual.Mimic 1.0.0 (rank951-band6) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 75.1% | 82.9% | 65.7% | 29 / 35 | - | - | 95 | - | 1.16 / 8026.4 | 93.8% | -18.6 |
| 2 | 81.3% | 91.2% | 71.1% | 32 / 35 | - | - | 41 | - | 1.11 / 1631.4 | 94.1% | -12.8 |
| 3 | 79.1% | 91.4% | 66.7% | 32 / 35 | - | - | 40 | - | 1.10 / 7894.4 | 92.7% | -13.6 |
| 4 | 83.0% | 91.4% | 72.6% | 32 / 35 | - | - | 62 | - | 1.12 / 1613.5 | 94.7% | -11.7 |

Mean score share 79.6% ± 5.5, baseline 93.8% ± 1.4, paired diff -14.2 ± 4.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 238 over 4 battles (59.5 per battle, most in one battle 95). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| mn.micro.perceptual.Mimic 1.0.0 | rank951-band6 | 79.6% ± 5.5 | 89.2% ± 6.8 | 69.0% ± 5.3 | 125 / 140 | - | - | 238 | - | 1.16 / 8026.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| mn.micro.perceptual.Mimic 1.0.0 | 4 | 941 | 19.9% | 72.5% | 0.2% | 7.4% | 1189 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| mn.micro.perceptual.Mimic 1.0.0 | 4 | 3 | n/a | 0 | 1.70 | 0 | 0 | 0 |

3 of 4 battles trusted.
