# cs.Nene 1.0.5 (rumble-18) vs hadur2.Hadur 3.8.5

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 65.5% | 85.7% | 43.3% | 30 / 35 | 9.8% | 7.2% | 13 | 0 | 1.23 / 238.4 | 62.1% | +3.4 |
| 2 | 54.6% | 71.4% | 37.8% | 25 / 35 | 10.0% | 8.2% | 16 | 0 | 1.27 / 16.1 | 59.3% | -4.7 |
| 3 | 59.6% | 77.1% | 39.9% | 27 / 35 | 9.2% | 7.0% | 10 | 0 | 1.18 / 15.3 | 63.1% | -3.5 |
| 4 | 57.7% | 74.3% | 41.7% | 26 / 35 | 10.3% | 8.0% | 12 | 0 | 1.25 / 15.3 | 52.0% | +5.7 |
| 5 | 60.2% | 77.1% | 42.2% | 27 / 35 | 10.1% | 6.9% | 17 | 0 | 1.20 / 21.5 | 54.1% | +6.1 |
| 6 | 55.9% | 71.4% | 40.5% | 25 / 35 | 10.2% | 8.4% | 18 | 0 | 1.24 / 350.3 | 58.8% | -2.8 |
| 7 | 61.3% | 80.0% | 41.2% | 28 / 35 | 9.5% | 7.9% | 14 | 0 | 1.24 / 16.7 | 64.1% | -2.7 |
| 8 | 55.9% | 74.3% | 36.1% | 26 / 35 | 8.8% | 8.0% | 8 | 0 | 1.26 / 702.9 | 54.7% | +1.3 |
| 9 | 59.9% | 77.1% | 43.0% | 27 / 35 | 10.9% | 8.4% | 11 | 0 | 1.24 / 14.5 | 56.7% | +3.2 |
| 10 | 64.2% | 80.0% | 46.9% | 28 / 35 | 9.8% | 7.4% | 12 | 0 | 1.20 / 588.4 | 60.4% | +3.8 |
| 11 | 64.3% | 85.7% | 40.7% | 30 / 35 | 9.4% | 7.7% | 7 | 0 | 1.24 / 19.9 | 62.0% | +2.2 |
| 12 | 54.4% | 68.6% | 39.6% | 24 / 35 | 8.8% | 8.0% | 10 | 0 | 1.28 / 551.1 | 56.3% | -1.9 |
| 13 | 62.1% | 77.1% | 46.9% | 27 / 35 | 10.6% | 7.4% | 12 | 0 | 1.22 / 784.7 | 58.9% | +3.2 |
| 14 | 58.3% | 77.1% | 39.3% | 27 / 35 | 10.1% | 8.0% | 4 | 0 | 1.26 / 471.0 | 62.5% | -4.3 |
| 15 | 71.0% | 94.3% | 44.5% | 33 / 35 | 9.7% | 7.2% | 9 | 0 | 1.15 / 776.5 | 65.1% | +5.9 |
| 16 | 54.2% | 71.4% | 35.6% | 25 / 35 | 9.5% | 7.6% | 13 | 0 | 1.22 / 19.7 | 55.2% | -0.9 |
| 17 | 63.4% | 82.9% | 42.3% | 29 / 35 | 10.3% | 7.4% | 13 | 0 | 1.23 / 648.2 | 60.1% | +3.3 |
| 18 | 52.5% | 65.7% | 39.6% | 23 / 35 | 9.8% | 7.9% | 7 | 0 | 1.25 / 15.4 | 55.4% | -2.9 |
| 19 | 55.3% | 74.3% | 33.9% | 26 / 35 | 9.1% | 7.3% | 18 | 0 | 1.20 / 16.9 | 57.9% | -2.5 |
| 20 | 59.3% | 74.3% | 43.2% | 26 / 35 | 10.1% | 7.5% | 10 | 0 | 1.25 / 150.8 | 63.8% | -4.4 |
| 21 | 58.4% | 77.1% | 38.7% | 27 / 35 | 9.3% | 7.8% | 14 | 0 | 1.26 / 19.6 | 62.9% | -4.5 |
| 22 | 61.3% | 80.0% | 41.2% | 28 / 35 | 10.0% | 7.8% | 4 | 0 | 1.24 / 17.4 | 57.7% | +3.7 |
| 23 | 60.1% | 77.1% | 41.7% | 27 / 35 | 9.8% | 7.3% | 5 | 0 | 1.23 / 14.0 | 50.8% | +9.3 |
| 24 | 65.4% | 82.9% | 47.0% | 29 / 35 | 9.8% | 7.1% | 10 | 0 | 1.22 / 15.5 | 53.6% | +11.7 |
| 25 | 50.9% | 65.7% | 35.8% | 23 / 35 | 9.1% | 8.1% | 6 | 0 | 1.26 / 14.9 | 52.4% | -1.5 |
| 26 | 61.9% | 80.0% | 44.6% | 28 / 35 | 10.7% | 8.1% | 15 | 0 | 1.23 / 15.8 | 63.1% | -1.2 |
| 27 | 58.7% | 77.1% | 39.6% | 27 / 35 | 10.6% | 7.9% | 14 | 0 | 1.25 / 17.2 | 59.5% | -0.8 |
| 28 | 51.1% | 65.7% | 35.9% | 23 / 35 | 8.6% | 7.7% | 18 | 0 | 1.24 / 340.4 | 56.1% | -5.0 |
| 29 | 51.0% | 65.7% | 36.7% | 23 / 35 | 8.7% | 8.8% | 7 | 0 | 1.26 / 15.0 | 62.7% | -11.7 |
| 30 | 62.1% | 77.1% | 46.1% | 27 / 35 | 11.2% | 7.7% | 15 | 0 | 1.25 / 56.3 | 60.4% | +1.7 |
| 31 | 50.1% | 65.7% | 33.7% | 23 / 35 | 9.3% | 8.6% | 9 | 0 | 1.25 / 657.0 | 64.3% | -14.2 |
| 32 | 57.6% | 74.3% | 39.2% | 26 / 35 | 9.1% | 7.1% | 84 | 0 | 1.21 / 436.4 | 61.1% | -3.5 |
| 33 | 61.2% | 82.9% | 37.5% | 29 / 35 | 9.8% | 7.7% | 17 | 0 | 1.19 / 291.7 | 62.8% | -1.6 |
| 34 | 61.8% | 82.9% | 38.0% | 29 / 35 | 9.4% | 7.8% | 7 | 0 | 1.21 / 451.4 | 62.5% | -0.7 |
| 35 | 52.8% | 65.7% | 39.4% | 23 / 35 | 8.6% | 7.9% | 10 | 0 | 1.27 / 555.5 | 57.1% | -4.3 |
| 36 | 65.6% | 82.9% | 47.8% | 29 / 35 | 10.3% | 7.6% | 14 | 0 | 1.24 / 56.7 | 58.3% | +7.3 |
| 37 | 59.4% | 71.4% | 45.7% | 25 / 35 | 9.3% | 7.1% | 19 | 0 | 1.19 / 208.3 | 54.9% | +4.5 |
| 38 | 55.4% | 71.4% | 40.4% | 25 / 35 | 9.5% | 8.7% | 7 | 0 | 1.28 / 15.3 | 61.5% | -6.1 |
| 39 | 59.3% | 80.0% | 39.1% | 28 / 35 | 9.9% | 8.6% | 17 | 0 | 1.28 / 310.7 | 60.8% | -1.4 |
| 40 | 69.5% | 91.4% | 45.1% | 32 / 35 | 10.2% | 7.1% | 15 | 0 | 1.20 / 485.3 | 58.4% | +11.1 |
| 41 | 54.1% | 68.6% | 38.4% | 24 / 35 | 9.1% | 7.9% | 16 | 0 | 1.27 / 19.5 | 50.8% | +3.2 |
| 42 | 66.6% | 85.7% | 47.5% | 30 / 35 | 10.1% | 7.7% | 13 | 0 | 1.26 / 19.3 | 69.1% | -2.5 |
| 43 | 60.5% | 74.3% | 45.8% | 26 / 35 | 10.4% | 7.0% | 6 | 0 | 1.15 / 162.9 | 61.6% | -1.0 |
| 44 | 55.1% | 68.6% | 41.7% | 24 / 35 | 9.3% | 8.4% | 11 | 0 | 1.20 / 15.9 | 57.2% | -2.1 |
| 45 | 44.2% | 54.3% | 35.2% | 19 / 35 | 8.7% | 9.0% | 11 | 0 | 1.30 / 16.3 | 62.4% | -18.2 |
| 46 | 58.0% | 80.0% | 36.2% | 28 / 35 | 9.2% | 8.4% | 12 | 0 | 1.12 / 15.8 | 60.1% | -2.2 |
| 47 | 48.6% | 60.0% | 37.4% | 21 / 35 | 9.6% | 8.0% | 10 | 0 | 1.29 / 18.3 | 58.2% | -9.6 |
| 48 | 62.6% | 82.9% | 39.9% | 29 / 35 | 8.8% | 6.9% | 8 | 0 | 1.21 / 15.8 | 55.1% | +7.5 |
| 49 | 48.6% | 62.9% | 34.8% | 22 / 35 | 9.0% | 8.8% | 12 | 0 | 1.30 / 19.6 | 58.8% | -10.3 |
| 50 | 63.3% | 80.0% | 45.3% | 28 / 35 | 9.5% | 7.3% | 13 | 0 | 1.23 / 15.9 | 53.6% | +9.7 |
| 51 | 65.1% | 80.0% | 50.1% | 28 / 35 | 11.0% | 7.0% | 12 | 0 | 1.15 / 21.1 | 68.4% | -3.3 |
| 52 | 55.1% | 71.4% | 38.1% | 25 / 35 | 9.5% | 7.3% | 14 | 0 | 1.24 / 15.6 | 61.0% | -5.8 |
| 53 | 64.4% | 85.7% | 41.1% | 30 / 35 | 9.5% | 8.0% | 11 | 0 | 1.24 / 16.3 | 52.1% | +12.3 |
| 54 | 60.7% | 77.1% | 43.4% | 27 / 35 | 9.7% | 8.2% | 6 | 0 | 1.23 / 15.6 | 57.2% | +3.6 |
| 55 | 57.7% | 74.3% | 40.7% | 26 / 35 | 9.7% | 7.7% | 12 | 0 | 1.25 / 18.6 | 57.7% | +0.0 |
| 56 | 55.8% | 68.6% | 40.8% | 24 / 35 | 8.4% | 7.0% | 7 | 0 | 1.14 / 22.3 | 63.5% | -7.7 |
| 57 | 53.9% | 71.4% | 36.8% | 25 / 35 | 8.9% | 8.5% | 15 | 0 | 1.24 / 16.4 | 58.4% | -4.5 |
| 58 | 62.0% | 85.7% | 37.4% | 30 / 35 | 9.0% | 8.2% | 12 | 0 | 1.21 / 15.1 | 55.1% | +7.0 |
| 59 | 59.3% | 74.3% | 42.4% | 26 / 35 | 9.0% | 7.2% | 6 | 0 | 1.17 / 15.7 | 59.4% | -0.2 |
| 60 | 54.9% | 71.4% | 37.0% | 25 / 35 | 8.4% | 7.9% | 12 | 0 | 1.27 / 15.5 | 57.0% | -2.1 |
| 61 | 47.1% | 60.0% | 34.7% | 21 / 35 | 9.5% | 8.5% | 12 | 0 | 1.24 / 15.1 | 50.3% | -3.2 |
| 62 | 58.8% | 77.1% | 40.5% | 27 / 35 | 10.4% | 8.1% | 16 | 0 | 1.23 / 15.6 | 54.3% | +4.5 |
| 63 | 60.8% | 77.1% | 44.2% | 27 / 35 | 10.2% | 7.6% | 15 | 0 | 1.23 / 26.1 | 56.4% | +4.4 |
| 64 | 62.2% | 80.0% | 42.6% | 28 / 35 | 9.9% | 7.1% | 7 | 0 | 1.20 / 258.1 | 49.2% | +13.0 |
| 65 | 58.3% | 77.1% | 37.7% | 27 / 35 | 9.0% | 7.5% | 14 | 0 | 1.20 / 19.5 | 64.1% | -5.8 |
| 66 | 61.2% | 80.0% | 40.7% | 28 / 35 | 9.4% | 7.4% | 16 | 0 | 1.22 / 19.0 | 64.7% | -3.5 |
| 67 | 46.7% | 60.0% | 34.4% | 21 / 35 | 9.3% | 9.2% | 12 | 0 | 1.28 / 95.5 | 62.8% | -16.1 |
| 68 | 53.6% | 71.4% | 35.9% | 25 / 35 | 9.1% | 8.8% | 14 | 0 | 1.27 / 16.2 | 57.9% | -4.3 |
| 69 | 50.0% | 62.9% | 37.8% | 22 / 35 | 8.7% | 8.8% | 7 | 0 | 1.26 / 218.5 | 52.5% | -2.6 |
| 70 | 46.7% | 60.0% | 33.3% | 21 / 35 | 8.0% | 8.2% | 12 | 0 | 1.28 / 16.1 | 60.2% | -13.4 |
| 71 | 61.7% | 80.0% | 42.0% | 28 / 35 | 9.4% | 7.3% | 14 | 0 | 1.23 / 586.0 | 52.3% | +9.4 |
| 72 | 51.9% | 68.6% | 35.5% | 24 / 35 | 8.4% | 8.6% | 9 | 0 | 1.29 / 230.9 | 59.3% | -7.4 |
| 73 | 65.4% | 85.7% | 41.8% | 30 / 35 | 9.6% | 7.0% | 14 | 0 | 1.20 / 474.5 | 60.2% | +5.2 |
| 74 | 56.4% | 71.4% | 41.5% | 25 / 35 | 10.2% | 7.9% | 14 | 0 | 1.24 / 258.7 | 59.8% | -3.4 |
| 75 | 52.2% | 68.6% | 37.1% | 24 / 35 | 9.9% | 8.7% | 19 | 0 | 1.30 / 16.0 | 54.5% | -2.3 |
| 76 | 58.8% | 74.3% | 44.4% | 26 / 35 | 10.5% | 7.7% | 10 | 0 | 1.20 / 21.2 | 58.4% | +0.4 |
| 77 | 56.3% | 74.3% | 36.4% | 26 / 35 | 8.6% | 7.7% | 11 | 0 | 1.24 / 266.3 | 48.5% | +7.8 |
| 78 | 64.2% | 82.9% | 43.6% | 29 / 35 | 9.7% | 7.3% | 8 | 0 | 1.20 / 15.9 | 66.2% | -2.0 |
| 79 | 55.0% | 68.6% | 41.9% | 24 / 35 | 10.3% | 7.7% | 15 | 0 | 1.24 / 15.3 | 59.7% | -4.6 |
| 80 | 57.8% | 71.4% | 43.6% | 25 / 35 | 9.2% | 8.0% | 12 | 0 | 1.21 / 108.8 | 57.9% | -0.2 |
| 81 | 63.2% | 80.0% | 44.5% | 28 / 35 | 9.6% | 7.1% | 13 | 0 | 1.25 / 16.8 | 50.0% | +13.2 |
| 82 | 53.1% | 65.7% | 40.4% | 23 / 35 | 8.8% | 8.0% | 4 | 0 | 1.22 / 17.2 | 63.9% | -10.8 |
| 83 | 63.8% | 82.9% | 41.5% | 29 / 35 | 10.1% | 7.0% | 14 | 0 | 1.18 / 265.0 | 64.2% | -0.4 |
| 84 | 55.1% | 71.4% | 37.4% | 25 / 35 | 9.1% | 7.6% | 10 | 0 | 1.25 / 399.8 | 52.9% | +2.2 |
| 85 | 62.1% | 82.9% | 42.1% | 29 / 35 | 10.5% | 8.6% | 13 | 0 | 1.25 / 146.9 | 65.1% | -3.0 |
| 86 | 58.3% | 80.0% | 35.8% | 28 / 35 | 9.3% | 8.4% | 12 | 0 | 1.26 / 620.6 | 57.2% | +1.1 |
| 87 | 62.1% | 77.1% | 46.8% | 27 / 35 | 11.1% | 7.7% | 6 | 0 | 1.22 / 200.2 | 61.0% | +1.0 |
| 88 | 60.3% | 77.1% | 41.7% | 27 / 35 | 9.2% | 7.6% | 15 | 0 | 1.23 / 16.3 | 62.9% | -2.6 |
| 89 | 65.0% | 85.7% | 45.1% | 30 / 35 | 9.6% | 8.7% | 9 | 0 | 1.23 / 120.1 | 66.1% | -1.1 |
| 90 | 62.2% | 77.1% | 45.8% | 27 / 35 | 8.9% | 7.3% | 7 | 0 | 1.21 / 1019.7 | 61.1% | +1.1 |
| 91 | 55.1% | 71.4% | 37.6% | 25 / 35 | 9.6% | 7.5% | 18 | 0 | 1.24 / 259.5 | 61.6% | -6.5 |
| 92 | 62.2% | 82.9% | 40.8% | 29 / 35 | 9.6% | 7.9% | 13 | 0 | 1.23 / 848.3 | 59.8% | +2.4 |
| 93 | 58.1% | 74.3% | 40.9% | 26 / 35 | 9.6% | 7.9% | 19 | 0 | 1.27 / 14.8 | 57.8% | +0.3 |
| 94 | 57.4% | 74.3% | 40.7% | 26 / 35 | 9.7% | 8.0% | 12 | 0 | 1.27 / 16.8 | 62.2% | -4.8 |
| 95 | 50.5% | 65.7% | 32.2% | 23 / 35 | 9.2% | 7.4% | 14 | 0 | 1.23 / 16.7 | 60.1% | -9.6 |
| 96 | 66.0% | 85.7% | 44.1% | 30 / 35 | 10.2% | 6.8% | 11 | 0 | 1.22 / 15.2 | 60.4% | +5.6 |
| 97 | 55.0% | 71.4% | 39.5% | 25 / 35 | 10.3% | 8.9% | 17 | 0 | 1.27 / 710.7 | 54.9% | +0.1 |
| 98 | 51.5% | 68.6% | 34.3% | 24 / 35 | 8.4% | 8.1% | 14 | 0 | 1.27 / 20.3 | 58.2% | -6.7 |
| 99 | 64.4% | 88.6% | 38.1% | 31 / 35 | 9.7% | 7.9% | 14 | 0 | 1.21 / 634.2 | 57.9% | +6.5 |
| 100 | 59.4% | 77.1% | 41.4% | 27 / 35 | 9.7% | 8.0% | 9 | 0 | 1.29 / 18.8 | 59.1% | +0.3 |

Mean score share 58.2% ± 1.1, baseline 58.9% ± 0.9, paired diff -0.6 ± 1.2.

## Full report

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1255 over 100 battles (12.6 per battle, most in one battle 84). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | rumble-18 | 58.2% ± 1.1 | 75.3% ± 1.5 | 40.4% ± 0.8 | 2634 / 3500 | 9.6% ± 0.1 | 7.8% ± 0.1 | 1255 | 0 | 1.30 / 1019.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 100 | 93 | 1271 | 1 | 0.36 | 1 | 1 | 0 |

93 of 100 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 189806 | 1609 | 189693 | 189688 (99.9%) | 118 (0.1%) | 5 (0.0%) | 11248 | 1398 | 608 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| cs.Nene 1.0.5 | 211337 | 19607 (9.3%) | 186839 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 650 | 472 | 648 | 775 | 23.8 / 35.0 | 2398 | 124022 | 32722 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 7.8% | 1255 | 13579 | 3 | 54.0 | 19502 / 19607 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| cs.Nene 1.0.5 | cs.Nene | 1 | 35 | 264 | 9.2% | 8.3% ± 1.3 | 10.0% | 24.5% / 24.4% | 8.6% | 0 / 0 | T3/M1 | 59% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
