# Polkwane.Piyane 0.7b (rank429-band5) vs oog.mega.saguaro.Saguaro 1.0

35 rounds x 2 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.12.1, 4 cores. robocode.cpu.constant=3096904. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|
| 1 | 92.8% | 97.1% | 86.6% | 34 / 35 | - | - | 123 | - | 3.13 / 23.6 |
| 2 | 95.2% | 100.0% | 88.0% | 35 / 35 | - | - | 89 | - | 2.84 / 26.8 |

Mean score share 94.0% ± 14.9.

## Full report

35 rounds x 2 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.12.1, 4 cores. robocode.cpu.constant=3096904. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 212 over 2 battles (106.0 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| Polkwane.Piyane 0.7b | rank429-band5 | 94.0% ± 14.9 | 98.6% ± 18.2 | 87.3% ± 9.1 | 69 / 70 | - | - | 212 | - | 3.13 / 26.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| Polkwane.Piyane 0.7b | 2 | 238 | 10.5% | 81.3% | 2.9% | 5.3% | 546 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| Polkwane.Piyane 0.7b | 2 | 0 | n/a | 0 | 3.03 | 0 | 0 | 0 |

0 of 2 battles trusted.
