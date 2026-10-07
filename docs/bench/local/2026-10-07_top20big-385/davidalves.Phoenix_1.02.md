# davidalves.Phoenix 1.02 (rumble-21) vs hadur2.Hadur 3.8.5

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 56.9% | 77.1% | 37.3% | 27 / 35 | 10.4% | 8.6% | 12 | 0 | 1.15 / 363.5 | 61.7% | -4.8 |
| 2 | 65.0% | 82.9% | 46.2% | 29 / 35 | 10.6% | 7.6% | 7 | 0 | 1.11 / 12.2 | 56.6% | +8.5 |
| 3 | 50.2% | 62.9% | 39.3% | 22 / 35 | 10.1% | 9.2% | 5 | 0 | 1.13 / 120.7 | 64.5% | -14.3 |
| 4 | 59.6% | 77.1% | 41.7% | 27 / 35 | 10.0% | 7.7% | 11 | 0 | 1.13 / 758.5 | 55.4% | +4.1 |
| 5 | 53.6% | 68.6% | 37.8% | 24 / 35 | 10.2% | 7.7% | 48 | 0 in 1 round(s) | 1.08 / 72.5 | 56.2% | -2.6 |
| 6 | 59.7% | 80.0% | 36.9% | 28 / 35 | 9.8% | 8.0% | 13 | 0 | 1.09 / 605.3 | 63.1% | -3.4 |
| 7 | 55.9% | 71.4% | 40.1% | 25 / 35 | 9.0% | 7.9% | 9 | 0 | 1.12 / 12.6 | 55.8% | +0.1 |
| 8 | 60.1% | 77.1% | 41.9% | 27 / 35 | 10.0% | 7.8% | 6 | 0 | 1.13 / 16.1 | 60.3% | -0.2 |
| 9 | 61.5% | 77.1% | 45.6% | 27 / 35 | 10.7% | 8.0% | 12 | 0 | 1.11 / 404.9 | 65.0% | -3.4 |
| 10 | 58.8% | 77.1% | 40.0% | 27 / 35 | 10.0% | 7.9% | 6 | 0 | 1.17 / 11.8 | 52.6% | +6.2 |
| 11 | 55.1% | 71.4% | 38.4% | 25 / 35 | 9.0% | 8.1% | 5 | 0 | 1.10 / 623.8 | 72.7% | -17.6 |
| 12 | 60.1% | 74.3% | 46.5% | 26 / 35 | 10.7% | 8.4% | 9 | 0 | 1.13 / 999.0 | 63.8% | -3.7 |
| 13 | 51.9% | 65.7% | 38.3% | 23 / 35 | 9.4% | 8.3% | 14 | 0 | 1.14 / 782.9 | 51.9% | -0.1 |
| 14 | 58.1% | 77.1% | 39.8% | 27 / 35 | 10.1% | 8.5% | 6 | 0 | 1.16 / 725.7 | 57.3% | +0.8 |
| 15 | 51.7% | 68.6% | 34.4% | 24 / 35 | 8.7% | 8.3% | 17 | 0 | 1.15 / 12.4 | 63.9% | -12.2 |
| 16 | 56.1% | 71.4% | 40.3% | 25 / 35 | 10.6% | 7.8% | 10 | 0 | 1.10 / 1105.3 | 53.2% | +2.9 |
| 17 | 65.6% | 85.7% | 41.0% | 30 / 35 | 9.6% | 6.6% | 13 | 0 | 1.09 / 12.4 | 60.8% | +4.9 |
| 18 | 49.7% | 65.7% | 34.8% | 23 / 35 | 9.0% | 9.5% | 18 | 0 | 1.12 / 884.6 | 52.4% | -2.8 |
| 19 | 54.6% | 71.4% | 37.9% | 25 / 35 | 9.6% | 8.0% | 7 | 0 | 1.16 / 718.1 | 56.2% | -1.6 |
| 20 | 54.5% | 68.6% | 41.4% | 24 / 35 | 9.8% | 8.6% | 11 | 0 | 1.10 / 12.5 | 63.5% | -9.0 |
| 21 | 64.2% | 85.7% | 42.5% | 30 / 35 | 9.9% | 8.4% | 9 | 0 | 1.10 / 652.5 | 60.6% | +3.6 |
| 22 | 57.3% | 74.3% | 40.8% | 26 / 35 | 9.6% | 8.3% | 14 | 0 | 1.12 / 12.5 | 49.4% | +7.9 |
| 23 | 60.1% | 80.0% | 40.0% | 28 / 35 | 11.1% | 8.6% | 12 | 0 | 1.10 / 556.4 | 54.8% | +5.2 |
| 24 | 64.2% | 85.7% | 40.9% | 30 / 35 | 9.1% | 7.7% | 22 | 0 | 1.10 / 12.0 | 59.5% | +4.7 |
| 25 | 58.0% | 74.3% | 41.0% | 26 / 35 | 9.9% | 8.2% | 5 | 0 | 1.10 / 736.7 | 51.4% | +6.6 |
| 26 | 52.7% | 65.7% | 41.0% | 23 / 35 | 10.1% | 8.3% | 10 | 0 | 1.15 / 77.9 | 54.7% | -1.9 |
| 27 | 49.5% | 62.9% | 34.9% | 22 / 35 | 7.6% | 7.7% | 6 | 0 | 1.12 / 12.8 | 60.5% | -11.0 |
| 28 | 57.8% | 74.3% | 40.9% | 26 / 35 | 9.5% | 7.9% | 13 | 0 | 1.16 / 506.4 | 63.5% | -5.8 |
| 29 | 53.3% | 65.7% | 41.2% | 23 / 35 | 9.6% | 8.4% | 11 | 0 | 1.11 / 12.6 | 51.7% | +1.5 |
| 30 | 60.4% | 77.1% | 42.1% | 27 / 35 | 9.9% | 7.7% | 13 | 0 | 1.11 / 13.5 | 55.7% | +4.8 |
| 31 | 60.7% | 80.0% | 40.5% | 28 / 35 | 10.7% | 7.8% | 11 | 0 | 1.13 / 406.2 | 56.9% | +3.8 |
| 32 | 59.2% | 77.1% | 41.3% | 27 / 35 | 10.6% | 8.0% | 5 | 0 | 1.15 / 843.1 | 55.7% | +3.5 |
| 33 | 58.8% | 77.1% | 40.7% | 27 / 35 | 9.0% | 8.4% | 13 | 0 | 1.14 / 684.5 | 61.0% | -2.2 |
| 34 | 56.8% | 74.3% | 38.4% | 26 / 35 | 9.9% | 7.8% | 14 | 0 | 1.10 / 272.4 | 61.3% | -4.5 |
| 35 | 61.6% | 80.0% | 42.4% | 28 / 35 | 9.5% | 8.0% | 11 | 0 | 1.12 / 725.1 | 54.4% | +7.2 |
| 36 | 55.9% | 71.4% | 41.7% | 25 / 35 | 9.5% | 8.4% | 5 | 0 | 1.11 / 119.2 | 67.4% | -11.4 |
| 37 | 50.6% | 62.9% | 39.3% | 22 / 35 | 9.4% | 8.0% | 14 | 0 | 1.15 / 817.4 | 58.6% | -8.0 |
| 38 | 55.4% | 74.3% | 37.2% | 26 / 35 | 10.2% | 8.6% | 9 | 0 | 1.15 / 12.2 | 68.8% | -13.4 |
| 39 | 54.3% | 71.4% | 36.8% | 25 / 35 | 9.6% | 7.8% | 19 | 0 | 1.14 / 639.8 | 64.4% | -10.1 |
| 40 | 61.7% | 80.0% | 42.0% | 28 / 35 | 9.5% | 7.0% | 10 | 0 | 1.07 / 264.9 | 57.4% | +4.3 |
| 41 | 62.7% | 82.9% | 42.9% | 29 / 35 | 10.4% | 8.2% | 16 | 0 | 1.13 / 210.4 | 61.4% | +1.3 |
| 42 | 60.9% | 80.0% | 40.4% | 28 / 35 | 9.0% | 7.7% | 11 | 0 | 1.13 / 733.3 | 57.2% | +3.7 |
| 43 | 59.5% | 77.1% | 42.1% | 27 / 35 | 10.4% | 8.9% | 14 | 0 | 1.14 / 496.0 | 57.3% | +2.2 |
| 44 | 51.1% | 65.7% | 36.3% | 23 / 35 | 8.5% | 8.1% | 12 | 0 | 1.14 / 12.4 | 60.5% | -9.4 |
| 45 | 55.1% | 71.4% | 39.1% | 25 / 35 | 10.3% | 8.2% | 18 | 0 | 1.11 / 470.1 | 56.9% | -1.7 |
| 46 | 56.2% | 74.3% | 37.3% | 26 / 35 | 9.6% | 8.1% | 14 | 0 | 1.10 / 12.7 | 54.5% | +1.7 |
| 47 | 54.9% | 68.6% | 40.9% | 24 / 35 | 9.2% | 7.8% | 5 | 0 | 1.09 / 338.6 | 59.6% | -4.7 |
| 48 | 56.0% | 71.4% | 41.5% | 25 / 35 | 11.1% | 8.8% | 15 | 0 | 1.13 / 11.7 | 54.3% | +1.7 |
| 49 | 51.7% | 65.7% | 38.0% | 23 / 35 | 9.4% | 8.1% | 11 | 0 | 1.11 / 526.3 | 52.8% | -1.1 |
| 50 | 56.6% | 77.1% | 36.0% | 27 / 35 | 9.7% | 8.6% | 12 | 0 | 1.15 / 12.2 | 59.3% | -2.7 |
| 51 | 53.9% | 71.4% | 37.2% | 25 / 35 | 9.6% | 8.6% | 10 | 0 | 1.15 / 12.4 | 50.5% | +3.4 |
| 52 | 47.9% | 60.0% | 36.6% | 21 / 35 | 10.2% | 8.5% | 11 | 0 | 1.11 / 12.2 | 59.8% | -11.8 |
| 53 | 57.6% | 74.3% | 42.1% | 26 / 35 | 11.0% | 8.2% | 9 | 0 | 1.10 / 13.3 | 62.3% | -4.7 |
| 54 | 58.9% | 74.3% | 42.1% | 26 / 35 | 9.8% | 6.8% | 10 | 0 | 1.09 / 12.5 | 66.1% | -7.3 |
| 55 | 57.8% | 74.3% | 40.7% | 26 / 35 | 10.1% | 8.1% | 6 | 0 | 1.14 / 12.2 | 66.6% | -8.7 |
| 56 | 58.5% | 74.3% | 43.3% | 26 / 35 | 10.6% | 8.2% | 10 | 0 | 1.14 / 633.5 | 62.0% | -3.4 |
| 57 | 50.9% | 68.6% | 33.5% | 24 / 35 | 9.0% | 9.4% | 10 | 0 | 1.13 / 13.0 | 66.4% | -15.6 |
| 58 | 61.2% | 80.0% | 42.3% | 28 / 35 | 10.1% | 7.7% | 12 | 0 | 1.14 / 290.4 | 49.5% | +11.7 |
| 59 | 58.7% | 77.1% | 39.7% | 27 / 35 | 10.3% | 8.2% | 13 | 0 | 1.13 / 13.3 | 61.1% | -2.5 |
| 60 | 52.5% | 68.6% | 36.0% | 24 / 35 | 9.3% | 8.2% | 3 | 0 | 1.12 / 506.5 | 65.0% | -12.5 |
| 61 | 58.8% | 74.3% | 44.2% | 26 / 35 | 10.6% | 8.1% | 13 | 0 | 1.12 / 192.2 | 62.0% | -3.2 |
| 62 | 67.0% | 82.9% | 49.6% | 29 / 35 | 9.9% | 7.1% | 12 | 0 | 1.10 / 509.7 | 62.9% | +4.1 |
| 63 | 59.0% | 77.1% | 40.6% | 27 / 35 | 10.1% | 7.9% | 12 | 0 | 1.13 / 467.3 | 50.3% | +8.7 |
| 64 | 58.9% | 77.1% | 39.8% | 27 / 35 | 10.0% | 7.9% | 14 | 0 | 1.13 / 492.1 | 52.6% | +6.2 |
| 65 | 51.1% | 65.7% | 37.5% | 23 / 35 | 9.5% | 8.8% | 14 | 0 | 1.15 / 562.8 | 58.5% | -7.3 |
| 66 | 54.8% | 68.6% | 41.3% | 24 / 35 | 9.7% | 8.1% | 12 | 0 | 1.11 / 603.4 | 60.9% | -6.1 |
| 67 | 59.6% | 77.1% | 43.1% | 27 / 35 | 10.8% | 8.5% | 13 | 0 | 1.12 / 12.9 | 59.9% | -0.3 |
| 68 | 55.7% | 71.4% | 40.4% | 25 / 35 | 9.3% | 8.7% | 15 | 0 | 1.12 / 580.1 | 56.8% | -1.1 |
| 69 | 56.2% | 71.4% | 40.3% | 25 / 35 | 8.7% | 7.5% | 7 | 0 | 1.12 / 572.2 | 59.5% | -3.3 |
| 70 | 58.8% | 77.1% | 39.4% | 27 / 35 | 9.6% | 7.8% | 15 | 0 | 1.15 / 11.6 | 52.3% | +6.5 |
| 71 | 61.2% | 80.0% | 41.0% | 28 / 35 | 9.3% | 7.8% | 12 | 0 | 1.12 / 353.5 | 56.5% | +4.7 |
| 72 | 53.0% | 68.6% | 36.7% | 24 / 35 | 9.3% | 9.0% | 5 | 0 | 1.15 / 12.9 | 50.7% | +2.3 |
| 73 | 52.0% | 65.7% | 39.3% | 23 / 35 | 10.5% | 9.0% | 16 | 0 | 1.17 / 627.0 | 54.2% | -2.2 |
| 74 | 67.7% | 91.4% | 45.3% | 32 / 35 | 10.9% | 8.7% | 15 | 0 | 1.14 / 683.4 | 61.3% | +6.4 |
| 75 | 63.6% | 82.9% | 43.6% | 29 / 35 | 10.4% | 8.1% | 14 | 0 | 1.12 / 618.3 | 56.6% | +7.0 |
| 76 | 52.1% | 65.7% | 38.4% | 23 / 35 | 9.7% | 8.2% | 12 | 0 | 1.15 / 494.8 | 53.7% | -1.6 |
| 77 | 61.4% | 74.3% | 47.5% | 26 / 35 | 10.1% | 7.1% | 12 | 0 | 1.13 / 210.4 | 63.8% | -2.4 |
| 78 | 62.1% | 80.0% | 44.7% | 28 / 35 | 10.5% | 8.1% | 15 | 0 | 1.10 / 12.1 | 58.8% | +3.3 |
| 79 | 54.7% | 71.4% | 37.1% | 25 / 35 | 9.8% | 7.7% | 9 | 0 | 1.13 / 163.3 | 60.4% | -5.6 |
| 80 | 58.5% | 74.3% | 42.0% | 26 / 35 | 9.6% | 7.6% | 14 | 0 | 1.12 / 13.2 | 65.9% | -7.4 |
| 81 | 49.6% | 65.7% | 34.7% | 23 / 35 | 9.9% | 9.1% | 10 | 0 | 1.12 / 179.7 | 61.1% | -11.5 |
| 82 | 56.8% | 71.4% | 42.3% | 25 / 35 | 10.2% | 7.9% | 12 | 0 | 1.11 / 12.6 | 57.5% | -0.6 |
| 83 | 60.6% | 80.0% | 40.2% | 28 / 35 | 9.8% | 7.9% | 14 | 0 | 1.12 / 12.5 | 52.7% | +7.8 |
| 84 | 62.5% | 82.9% | 42.9% | 29 / 35 | 11.2% | 8.3% | 11 | 0 | 1.14 / 28.4 | 53.8% | +8.8 |
| 85 | 55.7% | 71.4% | 40.0% | 25 / 35 | 9.1% | 8.8% | 7 | 0 | 1.09 / 14.4 | 49.2% | +6.5 |
| 86 | 57.4% | 74.3% | 39.4% | 26 / 35 | 9.4% | 8.0% | 8 | 0 | 1.14 / 64.6 | 54.5% | +2.9 |
| 87 | 55.8% | 74.3% | 37.2% | 26 / 35 | 9.1% | 8.0% | 12 | 0 | 1.13 / 202.4 | 58.1% | -2.3 |
| 88 | 52.3% | 68.6% | 35.6% | 24 / 35 | 9.5% | 7.9% | 8 | 0 | 1.12 / 549.8 | 66.8% | -14.6 |
| 89 | 54.2% | 71.4% | 38.3% | 25 / 35 | 9.1% | 9.1% | 12 | 0 | 1.16 / 12.1 | 60.3% | -6.2 |
| 90 | 62.0% | 77.1% | 47.5% | 27 / 35 | 10.8% | 8.1% | 11 | 0 | 1.09 / 601.3 | 59.3% | +2.8 |
| 91 | 64.2% | 82.9% | 43.2% | 29 / 35 | 10.6% | 7.6% | 13 | 0 | 1.11 / 19.3 | 64.4% | -0.2 |
| 92 | 56.2% | 71.4% | 39.3% | 25 / 35 | 9.7% | 7.3% | 5 | 0 | 1.13 / 13.3 | 49.0% | +7.2 |
| 93 | 54.2% | 71.4% | 36.5% | 25 / 35 | 9.6% | 7.8% | 15 | 0 | 1.12 / 527.1 | 52.9% | +1.3 |
| 94 | 56.0% | 74.3% | 37.9% | 26 / 35 | 9.9% | 9.3% | 7 | 0 | 1.13 / 731.6 | 49.0% | +7.0 |
| 95 | 65.3% | 77.1% | 52.4% | 27 / 35 | 10.5% | 6.9% | 10 | 0 | 1.08 / 775.4 | 59.1% | +6.1 |
| 96 | 58.8% | 71.4% | 46.2% | 25 / 35 | 11.0% | 7.9% | 12 | 0 | 1.08 / 578.4 | 61.8% | -3.0 |
| 97 | 60.5% | 82.9% | 38.2% | 29 / 35 | 9.8% | 9.2% | 18 | 0 | 1.14 / 12.7 | 57.3% | +3.3 |
| 98 | 54.0% | 74.3% | 32.8% | 26 / 35 | 8.9% | 8.3% | 13 | 0 | 1.10 / 874.3 | 54.1% | -0.1 |
| 99 | 56.9% | 74.3% | 38.1% | 26 / 35 | 10.2% | 7.7% | 8 | 0 | 1.15 / 12.3 | 63.2% | -6.3 |
| 100 | 50.6% | 65.7% | 35.6% | 23 / 35 | 8.9% | 8.5% | 10 | 0 | 1.08 / 1012.1 | 58.5% | -7.9 |

Mean score share 57.2% ± 0.9, baseline 58.4% ± 1.0, paired diff -1.1 ± 1.3.

## Full report

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1154 over 100 battles (11.5 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | rumble-21 | 57.2% ± 0.9 | 74.0% ± 1.2 | 40.2% ± 0.7 | 2591 / 3500 | 9.8% ± 0.1 | 8.1% ± 0.1 | 1154 | 0 in 1 round(s) | 1.17 / 1105.3 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 100 | 72 | 1485 | 1 | 0.33 | 23 | 19 | 0 |

72 of 100 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 187102 | 145 | 187076 | 186988 (99.9%) | 114 (0.1%) | 88 (0.0%) | 13874 | 1830 | 492 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| davidalves.Phoenix 1.02 | 232798 | 17985 (7.7%) | 178782 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 650 | 461 | 649 | 846 | 24.4 / 36.1 | 2390 | 138014 | 2561 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 8.1% | 1154 | 4881 | 3 | 53.1 | 17973 / 17985 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| davidalves.Phoenix 1.02 | davidalves.Phoenix | 1 | 35 | 306 | 9.2% | 7.8% ± 1.3 | 9.1% | 19.4% / 21.0% | 4.5% | 0 / 0 | T3/M1 | 51% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
