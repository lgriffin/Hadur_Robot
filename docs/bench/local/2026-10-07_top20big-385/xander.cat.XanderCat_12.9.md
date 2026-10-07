# xander.cat.XanderCat 12.9 (rumble-9) vs hadur2.Hadur 3.8.5

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 61.9% | 77.1% | 47.5% | 27 / 35 | 10.7% | 7.2% | 14 | 0 | 1.08 / 13.1 | 48.9% | +13.1 |
| 2 | 60.1% | 65.7% | 54.6% | 23 / 35 | 12.3% | 8.9% | 24 | 0 | 1.24 / 395.4 | 60.4% | -0.2 |
| 3 | 55.1% | 60.0% | 50.1% | 21 / 35 | 11.6% | 8.0% | 17 | 0 | 1.17 / 51.0 | 66.9% | -11.8 |
| 4 | 54.3% | 60.0% | 48.8% | 21 / 35 | 11.3% | 9.5% | 26 | 0 | 1.23 / 15.4 | 61.0% | -6.7 |
| 5 | 50.2% | 57.1% | 44.6% | 20 / 35 | 11.0% | 8.5% | 23 | 0 | 1.31 / 17.4 | 49.4% | +0.9 |
| 6 | 59.0% | 65.7% | 52.4% | 23 / 35 | 11.7% | 8.7% | 22 | 0 | 1.25 / 13.6 | 61.7% | -2.7 |
| 7 | 70.5% | 82.9% | 59.0% | 29 / 35 | 11.9% | 8.2% | 22 | 0 | 1.29 / 119.0 | 62.1% | +8.4 |
| 8 | 60.7% | 65.7% | 54.7% | 23 / 35 | 12.2% | 7.7% | 24 | 0 | 1.21 / 14.9 | 53.6% | +7.1 |
| 9 | 51.2% | 60.0% | 44.0% | 21 / 35 | 11.3% | 9.2% | 33 | 0 | 1.32 / 261.4 | 57.3% | -6.1 |
| 10 | 60.4% | 68.6% | 52.0% | 24 / 35 | 11.0% | 7.6% | 19 | 0 | 1.23 / 15.6 | 50.9% | +9.5 |
| 11 | 48.3% | 48.6% | 48.2% | 17 / 35 | 12.2% | 8.5% | 20 | 0 | 1.24 / 120.5 | 57.7% | -9.4 |
| 12 | 54.9% | 60.0% | 50.4% | 21 / 35 | 13.0% | 8.4% | 19 | 0 | 1.28 / 14.7 | 58.4% | -3.6 |
| 13 | 56.3% | 65.7% | 45.6% | 23 / 35 | 11.2% | 8.5% | 28 | 0 | 1.19 / 15.0 | 50.9% | +5.3 |
| 14 | 52.6% | 60.0% | 45.8% | 21 / 35 | 11.4% | 8.6% | 26 | 0 | 1.29 / 16.4 | 53.2% | -0.6 |
| 15 | 60.5% | 65.7% | 55.2% | 23 / 35 | 12.8% | 8.8% | 17 | 0 | 1.25 / 15.7 | 45.7% | +14.7 |
| 16 | 58.8% | 62.9% | 54.2% | 22 / 35 | 12.0% | 7.8% | 16 | 0 | 1.23 / 142.2 | 46.9% | +11.9 |
| 17 | 46.3% | 48.6% | 44.6% | 17 / 35 | 10.3% | 9.0% | 23 | 0 | 1.30 / 13.7 | 53.0% | -6.7 |
| 18 | 53.6% | 57.1% | 49.2% | 20 / 35 | 11.7% | 9.3% | 25 | 0 | 1.24 / 203.3 | 46.2% | +7.4 |
| 19 | 55.3% | 62.9% | 47.9% | 22 / 35 | 11.5% | 7.9% | 15 | 0 | 1.24 / 14.4 | 47.5% | +7.8 |
| 20 | 54.7% | 60.0% | 49.6% | 21 / 35 | 11.7% | 9.3% | 20 | 0 | 1.23 / 201.9 | 62.4% | -7.6 |
| 21 | 53.7% | 60.0% | 47.0% | 21 / 35 | 11.6% | 9.0% | 25 | 0 | 1.24 / 14.5 | 54.6% | -0.9 |
| 22 | 58.5% | 65.7% | 51.5% | 23 / 35 | 11.2% | 8.7% | 17 | 0 | 1.20 / 14.5 | 58.3% | +0.2 |
| 23 | 54.3% | 62.9% | 47.4% | 22 / 35 | 11.9% | 8.6% | 21 | 0 | 1.25 / 153.3 | 60.4% | -6.1 |
| 24 | 56.3% | 65.7% | 47.8% | 23 / 35 | 11.8% | 8.9% | 11 | 0 | 1.15 / 13.7 | 53.0% | +3.3 |
| 25 | 52.5% | 58.8% | 47.2% | 21 / 35 | 13.0% | 7.9% | 11 | 0 | 1.23 / 202.4 | 59.6% | -7.1 |
| 26 | 50.8% | 51.4% | 50.1% | 18 / 35 | 10.6% | 8.1% | 18 | 0 | 1.22 / 14.3 | 51.5% | -0.7 |
| 27 | 58.4% | 65.7% | 50.5% | 23 / 35 | 11.4% | 8.4% | 16 | 0 | 1.23 / 13.1 | 60.3% | -1.9 |
| 28 | 49.2% | 51.4% | 47.8% | 18 / 35 | 11.6% | 9.7% | 31 | 0 | 1.25 / 16.6 | 54.7% | -5.4 |
| 29 | 59.8% | 71.4% | 49.0% | 25 / 35 | 11.0% | 8.6% | 22 | 0 | 1.27 / 12.4 | 57.4% | +2.4 |
| 30 | 50.0% | 54.3% | 46.6% | 19 / 35 | 12.0% | 9.8% | 30 | 0 | 1.25 / 14.4 | 50.1% | -0.1 |
| 31 | 59.4% | 68.6% | 51.1% | 24 / 35 | 11.9% | 8.8% | 22 | 0 | 1.29 / 194.2 | 58.0% | +1.4 |
| 32 | 52.1% | 57.1% | 47.5% | 20 / 35 | 11.2% | 8.4% | 18 | 0 | 1.14 / 14.8 | 57.2% | -5.0 |
| 33 | 54.7% | 60.0% | 49.0% | 21 / 35 | 11.6% | 8.5% | 24 | 0 | 1.24 / 14.8 | 51.2% | +3.4 |
| 34 | 60.0% | 71.4% | 49.2% | 25 / 35 | 11.7% | 8.4% | 26 | 0 | 1.29 / 64.7 | 53.9% | +6.1 |
| 35 | 52.1% | 54.3% | 50.0% | 19 / 35 | 12.2% | 9.3% | 17 | 0 | 1.23 / 18.9 | 65.1% | -13.0 |
| 36 | 60.9% | 71.4% | 50.5% | 25 / 35 | 11.8% | 8.0% | 26 | 0 | 1.24 / 14.8 | 58.4% | +2.5 |
| 37 | 61.6% | 71.4% | 51.9% | 25 / 35 | 10.9% | 8.1% | 15 | 0 | 1.25 / 13.8 | 64.6% | -3.1 |
| 38 | 60.7% | 71.4% | 50.3% | 25 / 35 | 10.8% | 8.0% | 25 | 0 | 1.18 / 13.6 | 59.2% | +1.5 |
| 39 | 68.7% | 80.0% | 56.6% | 28 / 35 | 11.3% | 7.1% | 17 | 0 | 1.21 / 13.3 | 57.5% | +11.3 |
| 40 | 46.0% | 48.6% | 43.8% | 17 / 35 | 11.7% | 9.1% | 29 | 0 | 1.24 / 544.0 | 57.9% | -11.8 |
| 41 | 72.4% | 85.7% | 58.4% | 30 / 35 | 12.2% | 7.0% | 10 | 0 | 1.17 / 16.0 | 54.9% | +17.5 |
| 42 | 60.3% | 68.6% | 51.1% | 24 / 35 | 11.7% | 7.9% | 21 | 0 | 1.25 / 14.3 | 51.1% | +9.1 |
| 43 | 58.3% | 60.0% | 54.8% | 21 / 35 | 13.0% | 8.7% | 30 | 0 | 1.20 / 22.0 | 51.5% | +6.8 |
| 44 | 58.6% | 68.6% | 48.8% | 24 / 35 | 11.5% | 8.0% | 21 | 0 | 1.25 / 14.0 | 57.1% | +1.5 |
| 45 | 63.4% | 70.6% | 56.5% | 25 / 35 | 11.4% | 7.4% | 27 | 0 | 1.24 / 500.1 | 56.6% | +6.9 |
| 46 | 46.1% | 51.4% | 42.1% | 18 / 35 | 10.4% | 8.7% | 18 | 0 | 1.32 / 617.0 | 68.8% | -22.8 |
| 47 | 62.2% | 71.4% | 52.9% | 25 / 35 | 11.8% | 7.5% | 18 | 0 | 1.19 / 465.7 | 63.0% | -0.8 |
| 48 | 66.6% | 77.1% | 55.2% | 27 / 35 | 12.2% | 7.4% | 20 | 0 | 1.18 / 670.6 | 54.8% | +11.9 |
| 49 | 59.4% | 65.7% | 52.7% | 23 / 35 | 11.9% | 8.2% | 29 | 0 | 1.25 / 525.9 | 64.2% | -4.8 |
| 50 | 60.4% | 71.4% | 50.2% | 25 / 35 | 11.5% | 8.7% | 21 | 0 | 1.28 / 621.3 | 63.9% | -3.5 |
| 51 | 59.2% | 64.7% | 53.4% | 23 / 35 | 11.3% | 8.2% | 29 | 0 | 1.22 / 747.5 | 59.6% | -0.4 |
| 52 | 61.8% | 68.6% | 53.7% | 24 / 35 | 11.4% | 7.8% | 16 | 0 | 1.19 / 228.7 | 52.9% | +9.0 |
| 53 | 64.8% | 74.3% | 55.2% | 26 / 35 | 11.3% | 7.8% | 25 | 0 | 1.28 / 657.5 | 64.1% | +0.7 |
| 54 | 56.8% | 62.9% | 51.1% | 22 / 35 | 11.8% | 8.4% | 28 | 0 | 1.30 / 318.7 | 57.0% | -0.2 |
| 55 | 53.8% | 54.3% | 52.7% | 19 / 35 | 11.2% | 7.8% | 27 | 0 | 1.25 / 16.2 | 46.7% | +7.2 |
| 56 | 53.0% | 60.0% | 47.1% | 21 / 35 | 10.5% | 8.0% | 20 | 0 | 1.23 / 125.8 | 55.4% | -2.4 |
| 57 | 56.5% | 65.7% | 48.1% | 23 / 35 | 11.7% | 9.1% | 33 | 0 | 1.33 / 17.0 | 62.8% | -6.3 |
| 58 | 55.3% | 57.1% | 52.8% | 20 / 35 | 12.1% | 9.0% | 27 | 0 | 1.23 / 14.7 | 59.8% | -4.5 |
| 59 | 49.8% | 54.3% | 45.0% | 19 / 35 | 11.2% | 9.3% | 23 | 0 | 1.24 / 15.7 | 55.4% | -5.6 |
| 60 | 59.7% | 68.6% | 50.9% | 24 / 35 | 10.7% | 8.6% | 18 | 0 | 1.20 / 13.7 | 59.5% | +0.2 |
| 61 | 67.1% | 77.1% | 56.3% | 27 / 35 | 11.7% | 7.5% | 15 | 0 | 1.27 / 171.3 | 58.7% | +8.4 |
| 62 | 52.2% | 54.3% | 50.9% | 19 / 35 | 12.3% | 9.4% | 22 | 0 | 1.25 / 366.6 | 61.8% | -9.6 |
| 63 | 56.3% | 62.9% | 50.0% | 22 / 35 | 11.2% | 7.6% | 49 | 0 | 1.19 / 67.1 | 56.2% | +0.1 |
| 64 | 57.5% | 62.9% | 51.0% | 22 / 35 | 10.6% | 8.2% | 19 | 0 | 1.17 / 14.7 | 55.9% | +1.6 |
| 65 | 54.9% | 60.0% | 49.3% | 21 / 35 | 12.1% | 9.3% | 18 | 0 | 1.21 / 275.1 | 51.1% | +3.8 |
| 66 | 40.4% | 40.0% | 42.2% | 14 / 35 | 10.9% | 9.1% | 21 | 0 | 1.18 / 14.2 | 48.8% | -8.4 |
| 67 | 61.6% | 73.5% | 50.2% | 26 / 35 | 11.1% | 6.9% | 19 | 0 | 1.21 / 506.8 | 56.2% | +5.4 |
| 68 | 54.0% | 60.0% | 47.6% | 21 / 35 | 10.3% | 8.4% | 26 | 0 | 1.21 / 13.4 | 53.6% | +0.4 |
| 69 | 60.3% | 65.7% | 54.8% | 23 / 35 | 12.2% | 8.2% | 8 | 0 | 1.23 / 546.9 | 50.2% | +10.2 |
| 70 | 65.1% | 77.1% | 52.2% | 27 / 35 | 11.5% | 7.5% | 15 | 0 | 1.23 / 12.6 | 53.0% | +12.1 |
| 71 | 58.0% | 61.8% | 53.7% | 22 / 35 | 10.6% | 7.9% | 23 | 0 | 1.18 / 601.6 | 48.7% | +9.4 |
| 72 | 49.2% | 54.3% | 44.9% | 19 / 35 | 11.7% | 9.4% | 25 | 0 | 1.22 / 14.4 | 69.2% | -20.0 |
| 73 | 49.1% | 51.4% | 47.1% | 18 / 35 | 11.4% | 8.9% | 13 | 0 | 1.26 / 16.0 | 55.8% | -6.6 |
| 74 | 60.4% | 68.6% | 52.8% | 24 / 35 | 12.1% | 9.3% | 21 | 0 | 1.22 / 16.0 | 52.9% | +7.5 |
| 75 | 53.6% | 57.1% | 49.9% | 20 / 35 | 11.2% | 8.9% | 21 | 0 | 1.23 / 35.6 | 61.4% | -7.8 |
| 76 | 57.3% | 62.9% | 52.3% | 22 / 35 | 11.0% | 8.4% | 15 | 0 | 1.30 / 343.0 | 59.3% | -2.0 |
| 77 | 64.5% | 74.3% | 54.6% | 26 / 35 | 11.5% | 7.6% | 17 | 0 | 1.25 / 123.3 | 57.2% | +7.3 |
| 78 | 60.3% | 68.6% | 52.1% | 24 / 35 | 10.7% | 6.9% | 20 | 0 | 1.23 / 14.5 | 52.3% | +8.0 |
| 79 | 56.6% | 65.7% | 48.6% | 23 / 35 | 11.6% | 8.7% | 23 | 0 | 1.26 / 14.8 | 58.7% | -2.1 |
| 80 | 48.8% | 51.4% | 46.8% | 18 / 35 | 10.9% | 8.1% | 13 | 0 | 1.23 / 12.5 | 59.2% | -10.4 |
| 81 | 56.1% | 57.1% | 54.7% | 20 / 35 | 11.8% | 8.0% | 19 | 0 | 1.22 / 13.2 | 62.2% | -6.0 |
| 82 | 50.2% | 48.6% | 51.3% | 17 / 35 | 12.7% | 9.6% | 22 | 0 | 1.20 / 244.4 | 46.8% | +3.4 |
| 83 | 65.0% | 71.4% | 58.4% | 25 / 35 | 12.6% | 7.7% | 21 | 0 | 1.19 / 378.9 | 60.7% | +4.3 |
| 84 | 46.7% | 48.6% | 45.0% | 17 / 35 | 11.1% | 9.6% | 16 | 0 | 1.21 / 603.8 | 50.1% | -3.4 |
| 85 | 61.1% | 68.6% | 53.0% | 24 / 35 | 12.1% | 8.7% | 21 | 0 | 1.24 / 471.7 | 51.7% | +9.3 |
| 86 | 56.7% | 68.6% | 46.6% | 24 / 35 | 11.0% | 8.4% | 16 | 0 | 1.22 / 92.9 | 57.1% | -0.4 |
| 87 | 59.6% | 65.7% | 53.6% | 23 / 35 | 11.5% | 8.2% | 16 | 0 | 1.22 / 15.6 | 57.5% | +2.1 |
| 88 | 55.1% | 60.0% | 49.7% | 21 / 35 | 11.0% | 7.7% | 12 | 0 | 1.17 / 13.8 | 57.1% | -2.0 |
| 89 | 60.0% | 71.4% | 48.2% | 25 / 35 | 11.9% | 8.2% | 25 | 0 | 1.25 / 374.4 | 64.0% | -3.9 |
| 90 | 55.7% | 62.9% | 49.0% | 22 / 35 | 11.1% | 8.1% | 20 | 0 | 1.29 / 655.4 | 55.8% | -0.1 |
| 91 | 48.9% | 57.1% | 42.5% | 20 / 35 | 11.2% | 9.7% | 27 | 0 | 1.22 / 514.6 | 51.5% | -2.7 |
| 92 | 60.6% | 62.9% | 57.4% | 22 / 35 | 11.6% | 7.8% | 15 | 0 | 1.25 / 851.6 | 54.2% | +6.4 |
| 93 | 60.2% | 68.6% | 51.9% | 24 / 35 | 12.0% | 8.1% | 16 | 0 | 1.22 / 369.0 | 58.5% | +1.6 |
| 94 | 59.6% | 65.7% | 53.5% | 23 / 35 | 11.7% | 8.5% | 16 | 0 | 1.21 / 758.5 | 60.7% | -1.1 |
| 95 | 42.3% | 45.7% | 40.1% | 16 / 35 | 11.0% | 9.6% | 20 | 0 | 1.25 / 620.2 | 60.4% | -18.1 |
| 96 | 54.1% | 57.1% | 50.7% | 20 / 35 | 11.3% | 8.5% | 20 | 0 | 1.25 / 15.3 | 60.0% | -5.9 |
| 97 | 60.9% | 68.6% | 52.7% | 24 / 35 | 11.7% | 8.0% | 13 | 0 | 1.20 / 516.5 | 62.9% | -2.0 |
| 98 | 55.5% | 65.7% | 45.9% | 23 / 35 | 10.6% | 7.5% | 19 | 0 | 1.23 / 13.4 | 58.4% | -2.9 |
| 99 | 62.9% | 71.4% | 53.6% | 25 / 35 | 11.0% | 7.8% | 23 | 0 | 1.17 / 373.4 | 57.0% | +5.9 |
| 100 | 58.7% | 65.7% | 51.7% | 23 / 35 | 11.9% | 8.5% | 12 | 0 | 1.18 / 15.8 | 62.2% | -3.5 |

Mean score share 56.8% ± 1.1, baseline 56.6% ± 1.0, paired diff +0.2 ± 1.5.

## Full report

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 2087 over 100 battles (20.9 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | rumble-9 | 56.8% ± 1.1 | 63.4% ± 1.7 | 50.3% ± 0.8 | 2220 / 3500 | 11.5% ± 0.1 | 8.4% ± 0.1 | 2087 | 0 | 1.33 / 851.6 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 100 | 77 | 3364 | 1 | 0.60 | 14 | 14 | 100 |

77 of 100 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 292880 | 125 | 305293 | 292596 (99.9%) | 284 (0.1%) | 12697 (4.2%) | 31575 | 3878 | 1718 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| xander.cat.XanderCat 12.9 | 375475 | 30859 (8.2%) | 351139 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 650 | 452 | 650 | 1341 | 32.9 / 32.4 | 6037 | 39069 | 1530 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 8.4% | 2087 | 8500 | 3 | 86.5 | 30631 / 30859 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 1 | 35 | 314 | 9.9% | 7.7% ± 1.0 | 11.5% | 23.6% / 22.4% | 7.8% | 0 / 0 | T3/M1 | 58% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
