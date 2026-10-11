# lazarecki.mega.PinkerStinker 0.7 (mid) vs jd.Nullstride 2.3.3

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 86.4% | 97.1% | 74.9% | 34 / 35 | - | - | 32 | - | 1.14 / 27.8 | 76.5% | +9.9 |
| 2 | 83.4% | 97.1% | 69.1% | 34 / 35 | - | - | 58 | - | 1.18 / 29.4 | 68.6% | +14.8 |
| 3 | 85.0% | 97.1% | 72.5% | 34 / 35 | - | - | 37 | - | 1.11 / 26.2 | 79.3% | +5.8 |
| 4 | 82.8% | 94.3% | 70.4% | 33 / 35 | - | - | 63 | - | 1.15 / 30.8 | 72.9% | +9.9 |
| 5 | 82.7% | 94.3% | 70.5% | 33 / 35 | - | - | 66 | - | 1.18 / 31.1 | 78.4% | +4.3 |
| 6 | 89.2% | 100.0% | 76.7% | 35 / 35 | - | - | 28 | - | 1.06 / 30.9 | 64.1% | +25.1 |
| 7 | 85.6% | 97.1% | 72.6% | 34 / 35 | - | - | 52 | - | 1.18 / 27.0 | 77.2% | +8.4 |
| 8 | 84.6% | 97.1% | 71.0% | 34 / 35 | - | - | 29 | - | 1.12 / 30.0 | 78.7% | +5.9 |

Mean score share 85.0% ± 1.8, baseline 74.4% ± 4.6, paired diff +10.5 ± 5.6.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 365 over 8 battles (45.6 per battle, most in one battle 66). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| lazarecki.mega.PinkerStinker 0.7 | mid | 85.0% ± 1.8 | 96.8% ± 1.5 | 72.2% ± 2.1 | 271 / 280 | - | - | 365 | - | 1.18 / 31.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| lazarecki.mega.PinkerStinker 0.7 | 8 | 724 | 7.8% | 89.3% | 0.0% | 2.9% | 860 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| lazarecki.mega.PinkerStinker 0.7 | 8 | 8 | n/a | 0 | 1.30 | 0 | 0 | 0 |

8 of 8 battles trusted.
