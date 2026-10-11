# demetrix.nano.SledgeHammer 0.22 (rank523-band5) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 71.6% | 100.0% | 62.3% | 35 / 35 | - | - | 1 | - | 0.68 / 185.3 | 64.3% | +7.3 |
| 2 | 67.7% | 94.3% | 59.5% | 33 / 35 | - | - | 4 | - | 0.69 / 121.2 | 64.7% | +3.0 |
| 3 | 70.7% | 97.1% | 62.0% | 34 / 35 | - | - | 1 | - | 0.71 / 55.5 | 67.1% | +3.6 |
| 4 | 69.7% | 94.3% | 61.6% | 33 / 35 | - | - | 1 | - | 0.66 / 171.4 | 64.1% | +5.6 |

Mean score share 69.9% ± 2.6, baseline 65.1% ± 2.2, paired diff +4.9 ± 3.1.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 7 over 4 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| demetrix.nano.SledgeHammer 0.22 | rank523-band5 | 69.9% ± 2.6 | 96.4% ± 4.4 | 61.4% ± 2.0 | 135 / 140 | - | - | 7 | - | 0.71 / 185.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| demetrix.nano.SledgeHammer 0.22 | 4 | 2837 | 2.2% | 84.4% | 11.6% | 1.8% | 301 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| demetrix.nano.SledgeHammer 0.22 | 4 | 4 | n/a | 0 | 0.05 | 0 | 0 | 0 |

4 of 4 battles trusted.
