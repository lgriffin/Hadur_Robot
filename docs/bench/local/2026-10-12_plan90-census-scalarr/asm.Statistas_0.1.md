# asm.Statistas 0.1 (rank508-band5) vs aaa.r.ScalarR 0.005h.053-noshield

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 82.3% | 97.1% | 64.8% | 34 / 35 | - | - | 16 | - | 0.77 / 2026.0 |
| 2 | 74.9% | 91.4% | 56.8% | 32 / 35 | - | - | 7 | - | 0.78 / 1968.9 |
| 3 | 83.3% | 97.1% | 65.8% | 34 / 35 | - | - | 10 | - | 0.78 / 1817.6 |
| 4 | 79.2% | 94.3% | 63.0% | 33 / 35 | - | - | 31 | - | 0.75 / 1777.2 |

Mean score share 79.9% ± 6.0.

## Full report

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 64 over 4 battles (16.0 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| asm.Statistas 0.1 | rank508-band5 | 79.9% ± 6.0 | 95.0% ± 4.4 | 62.6% ± 6.4 | 133 / 140 | - | - | 64 | - | 0.78 / 2026.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| asm.Statistas 0.1 | 4 | 883 | 9.9% | 85.6% | 0.0% | 4.5% | 629 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| asm.Statistas 0.1 | 4 | 4 | n/a | 0 | 0.46 | 0 | 0 | 0 |

4 of 4 battles trusted.
