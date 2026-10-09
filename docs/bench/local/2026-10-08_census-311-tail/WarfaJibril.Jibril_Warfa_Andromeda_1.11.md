# WarfaJibril.Jibril_Warfa_Andromeda 1.11 (rank803-band6) vs lxx.Tomcat 3.68

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 92.5% | 100.0% | 84.3% | 35 / 35 | - | - | 12 | - | 0.94 / 388.0 | 85.8% | +6.8 |
| 2 | 92.9% | 100.0% | 84.6% | 35 / 35 | - | - | 3 | - | 0.92 / 1397.4 | 85.3% | +7.6 |
| 3 | 91.0% | 100.0% | 81.6% | 35 / 35 | - | - | 13 | - | 0.92 / 371.1 | 88.3% | +2.7 |
| 4 | 90.1% | 100.0% | 79.1% | 35 / 35 | - | - | 4 | - | 0.91 / 1148.9 | 82.2% | +7.9 |

Mean score share 91.6% ± 2.1, baseline 85.4% ± 4.0, paired diff +6.2 ± 3.8.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 32 over 4 battles (8.0 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | rank803-band6 | 91.6% ± 2.1 | 100.0% ± 0.0 | 82.4% ± 4.1 | 140 / 140 | - | - | 32 | - | 0.94 / 1397.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 393 | 0.0% | 100.0% | 0.0% | 0.0% | 496 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 4 | n/a | 0 | 0.23 | 0 | 0 | 0 |

4 of 4 battles trusted.
