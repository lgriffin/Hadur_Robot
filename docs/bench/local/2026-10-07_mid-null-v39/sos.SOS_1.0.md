# sos.SOS 1.0 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 94.0% | 94.3% | 92.9% | 33 / 35 | - | - | 8 | - | 0.86 / 29.6 | 89.3% | +4.8 |
| 2 | 95.3% | 100.0% | 90.8% | 35 / 35 | - | - | 11 | - | 0.88 / 31.3 | 90.9% | +4.4 |
| 3 | 98.4% | 100.0% | 97.0% | 35 / 35 | - | - | 3 | - | 0.70 / 24.3 | 84.2% | +14.2 |
| 4 | 97.2% | 100.0% | 94.7% | 35 / 35 | - | - | 5 | - | 0.80 / 36.8 | 85.0% | +12.2 |
| 5 | 96.3% | 97.1% | 95.0% | 34 / 35 | - | - | 5 | - | 0.83 / 39.2 | 93.0% | +3.3 |
| 6 | 98.2% | 100.0% | 96.5% | 35 / 35 | - | - | 6 | - | 0.85 / 42.3 | 90.9% | +7.2 |
| 7 | 96.0% | 100.0% | 92.7% | 35 / 35 | - | - | 3 | - | 0.77 / 23.2 | 89.6% | +6.5 |
| 8 | 96.9% | 100.0% | 94.3% | 35 / 35 | - | - | 3 | - | 0.71 / 22.3 | 93.0% | +4.0 |

Mean score share 96.5% ± 1.2, baseline 89.5% ± 2.8, paired diff +7.1 ± 3.4.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 44 over 8 battles (5.5 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| sos.SOS 1.0 | mid | 96.5% ± 1.2 | 98.9% ± 1.8 | 94.2% ± 1.7 | 277 / 280 | - | - | 44 | - | 0.88 / 42.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| sos.SOS 1.0 | 8 | 194 | 9.7% | 87.8% | 0.3% | 2.3% | 352 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| sos.SOS 1.0 | 8 | 8 | n/a | 0 | 0.16 | 0 | 0 | 0 |

8 of 8 battles trusted.
