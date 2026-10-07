# apv.TheBrainPi 0.5fix (weak) vs rsalesc.mega.Knight 0.6.28

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 75.6% | 91.4% | 59.6% | 32 / 35 | - | - | 1 | - | 1.16 / 18.5 | 73.7% | +1.9 |
| 2 | 75.3% | 91.4% | 59.5% | 32 / 35 | - | - | 2 | - | 1.09 / 17.3 | 78.3% | -3.0 |
| 3 | 83.4% | 100.0% | 64.7% | 35 / 35 | - | - | 2 | - | 1.18 / 19.0 | 70.2% | +13.2 |
| 4 | 77.8% | 94.3% | 61.9% | 33 / 35 | - | - | 0 | - | 1.10 / 17.0 | 67.5% | +10.3 |
| 5 | 84.2% | 97.1% | 69.1% | 34 / 35 | - | - | 1 | - | 1.11 / 17.7 | 75.6% | +8.6 |
| 6 | 75.4% | 91.4% | 58.3% | 32 / 35 | - | - | 0 | - | 1.10 / 18.3 | 82.1% | -6.8 |
| 7 | 72.8% | 91.4% | 56.5% | 32 / 35 | - | - | 1 | - | 1.11 / 19.6 | 79.9% | -7.0 |
| 8 | 77.5% | 94.3% | 60.1% | 33 / 35 | - | - | 3 | - | 1.08 / 18.6 | 65.9% | +11.6 |

Mean score share 77.7% ± 3.4, baseline 74.2% ± 4.9, paired diff +3.6 ± 7.0.

## Full report

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 10 over 8 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| apv.TheBrainPi 0.5fix | weak | 77.7% ± 3.4 | 93.9% ± 2.7 | 61.2% ± 3.4 | 263 / 280 | - | - | 10 | - | 1.18 / 19.6 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| apv.TheBrainPi 0.5fix | 8 | 1045 | 10.2% | 84.8% | 0.0% | 5.0% | 625 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| apv.TheBrainPi 0.5fix | 8 | 8 | n/a | 0 | 0.04 | 0 | 0 | 8 |

8 of 8 battles trusted.
