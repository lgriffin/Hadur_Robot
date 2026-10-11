# axeBots.SilverSurfer 2.53.33fix (rank37-band2) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 64.7% | 74.3% | 56.3% | 26 / 35 | - | - | 21 | - | 1.24 / 888.4 | 58.3% | +6.4 |
| 2 | 68.4% | 80.0% | 58.0% | 28 / 35 | - | - | 31 | - | 1.31 / 861.3 | 64.3% | +4.2 |
| 3 | 59.1% | 68.6% | 51.1% | 24 / 35 | - | - | 24 | - | 1.33 / 734.5 | 65.1% | -6.0 |
| 4 | 62.3% | 74.3% | 51.2% | 26 / 35 | - | - | 45 | - | 1.39 / 711.0 | 61.5% | +0.8 |

Mean score share 63.6% ± 6.3, baseline 62.3% ± 4.9, paired diff +1.3 ± 8.6.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 121 over 4 battles (30.3 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| axeBots.SilverSurfer 2.53.33fix | rank37-band2 | 63.6% ± 6.3 | 74.3% ± 7.4 | 54.2% ± 5.6 | 104 / 140 | - | - | 121 | - | 1.39 / 888.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| axeBots.SilverSurfer 2.53.33fix | 4 | 1804 | 25.0% | 64.1% | 0.0% | 10.9% | 888 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| axeBots.SilverSurfer 2.53.33fix | 4 | 4 | n/a | 0 | 0.86 | 0 | 0 | 0 |

4 of 4 battles trusted.
