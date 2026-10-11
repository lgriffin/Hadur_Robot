# tm.Yuugao 1.0 (rank325-band4) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 77.5% | 88.6% | 67.0% | 31 / 35 | - | - | 12 | - | 1.02 / 2781.4 | 75.0% | +2.5 |
| 2 | 79.6% | 91.4% | 67.3% | 32 / 35 | - | - | 18 | - | 1.07 / 35.2 | 70.8% | +8.8 |
| 3 | 79.7% | 94.3% | 66.0% | 33 / 35 | - | - | 17 | - | 1.05 / 2884.0 | 71.3% | +8.4 |
| 4 | 80.3% | 97.1% | 64.2% | 34 / 35 | - | - | 13 | - | 1.05 / 51.4 | 76.0% | +4.3 |

Mean score share 79.3% ± 1.9, baseline 73.3% ± 4.2, paired diff +6.0 ± 4.9.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 60 over 4 battles (15.0 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| tm.Yuugao 1.0 | rank325-band4 | 79.3% ± 1.9 | 92.9% ± 5.9 | 66.1% ± 2.2 | 130 / 140 | - | - | 60 | - | 1.07 / 2884.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| tm.Yuugao 1.0 | 4 | 1023 | 12.2% | 82.4% | 0.0% | 5.4% | 683 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| tm.Yuugao 1.0 | 4 | 4 | n/a | 0 | 0.43 | 0 | 0 | 0 |

4 of 4 battles trusted.
