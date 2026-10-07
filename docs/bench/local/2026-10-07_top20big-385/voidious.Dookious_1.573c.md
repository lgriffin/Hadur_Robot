# voidious.Dookious 1.573c (rumble-20) vs hadur2.Hadur 3.8.5

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 61.6% | 74.3% | 46.0% | 26 / 35 | 9.4% | 6.6% | 12 | 0 | 1.12 / 12.4 | 63.4% | -1.9 |
| 2 | 55.0% | 68.6% | 40.8% | 24 / 35 | 9.4% | 7.5% | 14 | 0 | 1.15 / 78.2 | 72.0% | -17.0 |
| 3 | 62.8% | 77.1% | 47.5% | 27 / 35 | 10.1% | 7.2% | 8 | 0 | 1.16 / 14.7 | 62.9% | -0.2 |
| 4 | 62.6% | 80.0% | 43.4% | 28 / 35 | 9.2% | 6.7% | 13 | 0 | 1.16 / 122.1 | 60.0% | +2.5 |
| 5 | 55.9% | 71.4% | 38.2% | 25 / 35 | 8.4% | 6.9% | 12 | 0 | 1.18 / 12.6 | 55.7% | +0.1 |
| 6 | 64.9% | 85.7% | 40.7% | 30 / 35 | 8.8% | 7.3% | 11 | 0 | 1.14 / 13.1 | 63.5% | +1.4 |
| 7 | 61.2% | 80.0% | 41.3% | 28 / 35 | 9.6% | 7.5% | 13 | 0 | 1.21 / 12.4 | 54.8% | +6.4 |
| 8 | 55.5% | 68.6% | 41.5% | 24 / 35 | 9.8% | 7.3% | 10 | 0 | 1.18 / 12.0 | 67.9% | -12.3 |
| 9 | 65.6% | 82.9% | 47.1% | 29 / 35 | 10.0% | 7.3% | 9 | 0 | 1.18 / 12.6 | 62.4% | +3.2 |
| 10 | 52.0% | 60.0% | 43.8% | 21 / 35 | 9.9% | 7.3% | 6 | 0 | 1.16 / 13.9 | 54.8% | -2.8 |
| 11 | 58.8% | 77.1% | 40.0% | 27 / 35 | 9.6% | 7.6% | 12 | 0 | 1.19 / 12.6 | 68.2% | -9.4 |
| 12 | 57.0% | 68.6% | 43.2% | 24 / 35 | 9.5% | 6.3% | 10 | 0 | 1.15 / 13.4 | 57.8% | -0.8 |
| 13 | 64.7% | 85.7% | 40.4% | 30 / 35 | 9.5% | 7.5% | 14 | 0 | 1.19 / 12.7 | 56.2% | +8.5 |
| 14 | 52.4% | 62.9% | 40.4% | 22 / 35 | 8.8% | 7.0% | 10 | 0 | 1.15 / 12.8 | 59.4% | -7.0 |
| 15 | 64.2% | 80.0% | 46.6% | 28 / 35 | 9.6% | 7.3% | 17 | 0 | 1.11 / 12.5 | 68.3% | -4.1 |
| 16 | 65.1% | 80.0% | 46.9% | 28 / 35 | 9.9% | 6.1% | 15 | 0 | 1.16 / 12.4 | 58.1% | +7.0 |
| 17 | 60.9% | 77.1% | 43.5% | 27 / 35 | 9.8% | 7.4% | 12 | 0 | 1.17 / 13.2 | 62.9% | -2.0 |
| 18 | 65.1% | 80.0% | 47.0% | 28 / 35 | 9.3% | 6.2% | 11 | 0 | 1.14 / 12.6 | 63.9% | +1.2 |
| 19 | 55.2% | 62.9% | 47.1% | 22 / 35 | 9.7% | 7.2% | 10 | 0 | 1.15 / 12.8 | 62.9% | -7.7 |
| 20 | 62.2% | 80.0% | 41.5% | 28 / 35 | 9.2% | 6.5% | 19 | 0 | 1.17 / 454.5 | 61.0% | +1.2 |
| 21 | 53.7% | 65.7% | 40.2% | 23 / 35 | 9.3% | 6.9% | 13 | 0 | 1.16 / 12.7 | 60.6% | -7.0 |
| 22 | 65.3% | 82.9% | 46.6% | 29 / 35 | 10.2% | 7.1% | 19 | 0 | 1.19 / 934.5 | 65.7% | -0.4 |
| 23 | 65.9% | 82.9% | 46.7% | 29 / 35 | 10.1% | 7.4% | 11 | 0 | 1.16 / 14.8 | 66.1% | -0.2 |
| 24 | 55.4% | 68.6% | 40.8% | 24 / 35 | 9.1% | 7.0% | 8 | 0 | 1.19 / 233.0 | 57.5% | -2.1 |
| 25 | 65.5% | 82.9% | 46.4% | 29 / 35 | 9.9% | 6.7% | 7 | 0 | 1.12 / 452.7 | 68.6% | -3.0 |
| 26 | 56.6% | 68.6% | 42.5% | 24 / 35 | 8.7% | 6.5% | 5 | 0 | 1.17 / 156.3 | 57.3% | -0.7 |
| 27 | 56.3% | 68.6% | 42.4% | 24 / 35 | 8.5% | 7.6% | 6 | 0 | 1.16 / 674.5 | 48.8% | +7.6 |
| 28 | 57.9% | 71.4% | 43.1% | 25 / 35 | 9.4% | 7.3% | 11 | 0 | 1.21 / 787.0 | 59.5% | -1.6 |
| 29 | 55.6% | 68.6% | 42.2% | 24 / 35 | 9.1% | 8.0% | 8 | 0 | 1.19 / 570.3 | 62.5% | -6.9 |
| 30 | 58.0% | 71.4% | 43.0% | 25 / 35 | 9.2% | 7.3% | 8 | 0 | 1.21 / 416.5 | 58.2% | -0.2 |
| 31 | 64.0% | 82.9% | 41.6% | 29 / 35 | 9.2% | 7.1% | 8 | 0 | 1.19 / 415.5 | 60.3% | +3.7 |
| 32 | 55.1% | 68.6% | 39.0% | 24 / 35 | 9.1% | 7.0% | 10 | 0 | 1.14 / 633.6 | 52.4% | +2.7 |
| 33 | 56.4% | 68.6% | 42.9% | 24 / 35 | 8.8% | 7.0% | 15 | 0 | 1.21 / 13.8 | 66.4% | -9.9 |
| 34 | 55.8% | 68.6% | 42.8% | 24 / 35 | 9.6% | 7.3% | 15 | 0 | 1.20 / 88.5 | 56.2% | -0.4 |
| 35 | 59.7% | 77.1% | 40.3% | 27 / 35 | 9.5% | 7.0% | 13 | 0 | 1.17 / 239.8 | 56.2% | +3.5 |
| 36 | 67.4% | 82.9% | 48.5% | 29 / 35 | 10.3% | 6.4% | 14 | 0 | 1.16 / 12.7 | 68.9% | -1.5 |
| 37 | 53.9% | 65.7% | 41.8% | 23 / 35 | 10.0% | 7.5% | 10 | 0 | 1.18 / 917.9 | 65.5% | -11.6 |
| 38 | 59.3% | 74.3% | 42.2% | 26 / 35 | 9.9% | 6.9% | 6 | 0 | 1.16 / 12.7 | 62.8% | -3.4 |
| 39 | 55.0% | 68.6% | 40.8% | 24 / 35 | 8.6% | 7.4% | 12 | 0 | 1.19 / 96.5 | 64.3% | -9.3 |
| 40 | 56.5% | 71.4% | 41.5% | 25 / 35 | 10.0% | 7.9% | 12 | 0 | 1.19 / 88.7 | 69.3% | -12.9 |
| 41 | 62.1% | 77.1% | 45.6% | 27 / 35 | 9.8% | 7.0% | 14 | 0 | 1.14 / 258.5 | 59.5% | +2.6 |
| 42 | 60.9% | 77.1% | 42.4% | 27 / 35 | 9.2% | 6.8% | 16 | 0 | 1.18 / 308.7 | 65.3% | -4.4 |
| 43 | 59.3% | 71.4% | 44.5% | 25 / 35 | 9.4% | 6.4% | 10 | 0 | 1.16 / 125.3 | 63.7% | -4.3 |
| 44 | 42.3% | 45.7% | 38.8% | 16 / 35 | 8.5% | 8.5% | 11 | 0 | 1.20 / 293.8 | 53.1% | -10.8 |
| 45 | 64.4% | 82.9% | 42.4% | 29 / 35 | 9.3% | 6.5% | 10 | 0 | 1.14 / 13.3 | 61.9% | +2.5 |
| 46 | 61.7% | 80.0% | 41.1% | 28 / 35 | 9.4% | 7.4% | 11 | 0 | 1.21 / 13.0 | 60.1% | +1.6 |
| 47 | 59.4% | 74.3% | 43.2% | 26 / 35 | 9.3% | 6.9% | 14 | 0 | 1.18 / 69.5 | 60.5% | -1.1 |
| 48 | 58.3% | 71.4% | 44.7% | 25 / 35 | 9.8% | 7.7% | 16 | 0 | 1.20 / 1191.9 | 70.0% | -11.7 |
| 49 | 57.9% | 71.4% | 42.7% | 25 / 35 | 8.9% | 7.5% | 6 | 0 | 1.19 / 49.8 | 57.3% | +0.6 |
| 50 | 57.8% | 74.3% | 40.1% | 26 / 35 | 9.2% | 7.6% | 14 | 0 | 1.19 / 1340.7 | 67.8% | -10.1 |
| 51 | 62.4% | 82.9% | 39.9% | 29 / 35 | 9.3% | 7.1% | 15 | 0 | 1.20 / 12.3 | 59.1% | +3.4 |
| 52 | 50.4% | 62.9% | 37.2% | 22 / 35 | 8.8% | 7.5% | 14 | 0 | 1.15 / 248.2 | 63.7% | -13.3 |
| 53 | 60.4% | 74.3% | 44.9% | 26 / 35 | 9.8% | 6.5% | 11 | 0 | 1.17 / 1398.2 | 60.4% | +0.1 |
| 54 | 62.1% | 77.1% | 44.3% | 27 / 35 | 9.8% | 6.5% | 11 | 0 | 1.16 / 143.5 | 59.1% | +3.0 |
| 55 | 61.4% | 80.0% | 40.4% | 28 / 35 | 10.0% | 7.5% | 12 | 0 | 1.21 / 1255.9 | 62.3% | -0.9 |
| 56 | 62.9% | 82.9% | 42.3% | 29 / 35 | 9.6% | 8.2% | 16 | 0 | 1.24 / 11.7 | 53.7% | +9.2 |
| 57 | 64.6% | 82.9% | 42.2% | 29 / 35 | 9.1% | 6.6% | 13 | 0 | 1.14 / 1451.7 | 67.5% | -2.9 |
| 58 | 53.3% | 65.7% | 40.4% | 23 / 35 | 9.0% | 7.3% | 12 | 0 | 1.19 / 12.3 | 66.6% | -13.3 |
| 59 | 62.4% | 80.0% | 41.8% | 28 / 35 | 9.2% | 6.6% | 10 | 0 | 1.17 / 154.0 | 57.1% | +5.3 |
| 60 | 55.1% | 71.4% | 38.3% | 25 / 35 | 9.4% | 7.8% | 12 | 0 | 1.20 / 796.4 | 49.7% | +5.5 |
| 61 | 49.9% | 60.0% | 38.9% | 21 / 35 | 8.7% | 7.1% | 11 | 0 | 1.16 / 232.9 | 62.3% | -12.4 |
| 62 | 56.0% | 71.4% | 38.5% | 25 / 35 | 8.8% | 6.9% | 10 | 0 | 1.17 / 242.3 | 64.9% | -9.0 |
| 63 | 62.1% | 82.9% | 38.2% | 29 / 35 | 9.3% | 7.2% | 15 | 0 | 1.17 / 14.2 | 62.6% | -0.5 |
| 64 | 63.5% | 80.0% | 45.5% | 28 / 35 | 10.4% | 7.5% | 15 | 0 | 1.15 / 158.3 | 61.6% | +1.9 |
| 65 | 59.2% | 74.3% | 43.0% | 26 / 35 | 9.3% | 7.4% | 10 | 0 | 1.18 / 13.5 | 58.5% | +0.7 |
| 66 | 60.9% | 74.3% | 45.0% | 26 / 35 | 9.4% | 7.1% | 13 | 0 | 1.16 / 14.3 | 61.6% | -0.7 |
| 67 | 47.3% | 57.1% | 37.7% | 20 / 35 | 9.4% | 8.5% | 13 | 0 | 1.17 / 148.5 | 62.4% | -15.1 |
| 68 | 58.6% | 74.3% | 40.7% | 26 / 35 | 9.5% | 7.0% | 15 | 0 | 1.23 / 13.6 | 54.1% | +4.5 |
| 69 | 56.1% | 71.4% | 39.4% | 25 / 35 | 9.5% | 7.7% | 10 | 0 | 1.20 / 127.3 | 58.3% | -2.1 |
| 70 | 53.6% | 68.6% | 38.0% | 24 / 35 | 9.3% | 7.8% | 11 | 0 | 1.18 / 12.8 | 60.8% | -7.2 |
| 71 | 60.2% | 74.3% | 43.5% | 26 / 35 | 9.7% | 6.6% | 12 | 0 | 1.14 / 13.2 | 56.0% | +4.2 |
| 72 | 62.2% | 74.3% | 49.2% | 26 / 35 | 10.2% | 7.1% | 9 | 0 | 1.14 / 12.6 | 60.8% | +1.4 |
| 73 | 60.5% | 77.1% | 42.2% | 27 / 35 | 9.3% | 7.4% | 14 | 0 | 1.17 / 13.1 | 64.7% | -4.2 |
| 74 | 57.0% | 71.4% | 41.0% | 25 / 35 | 10.0% | 6.6% | 16 | 0 | 1.14 / 13.8 | 61.7% | -4.7 |
| 75 | 65.6% | 82.9% | 46.7% | 29 / 35 | 9.4% | 7.2% | 11 | 0 | 1.20 / 12.6 | 63.1% | +2.5 |
| 76 | 66.1% | 85.7% | 44.1% | 30 / 35 | 9.5% | 7.2% | 7 | 0 | 1.17 / 12.9 | 54.4% | +11.6 |
| 77 | 61.8% | 80.0% | 41.6% | 28 / 35 | 9.9% | 6.9% | 12 | 0 | 1.20 / 13.7 | 62.1% | -0.2 |
| 78 | 69.3% | 88.6% | 45.8% | 31 / 35 | 9.4% | 6.3% | 4 | 0 | 1.17 / 12.7 | 61.0% | +8.3 |
| 79 | 62.1% | 80.0% | 42.1% | 28 / 35 | 9.4% | 6.9% | 15 | 0 | 1.17 / 12.1 | 64.4% | -2.3 |
| 80 | 60.2% | 77.1% | 42.0% | 27 / 35 | 9.1% | 7.6% | 13 | 0 | 1.20 / 12.6 | 59.0% | +1.2 |
| 81 | 57.1% | 71.4% | 41.0% | 25 / 35 | 8.5% | 7.4% | 7 | 0 | 1.23 / 12.4 | 63.2% | -6.1 |
| 82 | 62.8% | 77.1% | 46.3% | 27 / 35 | 8.9% | 6.7% | 4 | 0 | 1.14 / 13.1 | 63.0% | -0.2 |
| 83 | 54.5% | 68.6% | 39.8% | 24 / 35 | 9.3% | 7.9% | 14 | 0 | 1.19 / 12.8 | 59.2% | -4.7 |
| 84 | 54.1% | 68.6% | 38.9% | 24 / 35 | 9.3% | 8.0% | 14 | 0 | 1.21 / 688.3 | 55.0% | -1.0 |
| 85 | 59.7% | 74.3% | 44.2% | 26 / 35 | 9.0% | 6.8% | 13 | 0 | 1.24 / 13.8 | 63.9% | -4.2 |
| 86 | 62.5% | 74.3% | 48.3% | 26 / 35 | 9.4% | 6.1% | 8 | 0 | 1.13 / 76.3 | 61.8% | +0.6 |
| 87 | 57.2% | 71.4% | 41.8% | 25 / 35 | 9.4% | 7.2% | 11 | 0 | 1.17 / 661.8 | 57.2% | -0.0 |
| 88 | 55.4% | 71.4% | 37.6% | 25 / 35 | 8.9% | 7.6% | 9 | 0 | 1.22 / 564.5 | 57.5% | -2.1 |
| 89 | 64.4% | 82.9% | 43.4% | 29 / 35 | 8.5% | 7.0% | 15 | 0 | 1.19 / 277.0 | 63.0% | +1.4 |
| 90 | 65.1% | 80.0% | 48.2% | 28 / 35 | 10.5% | 6.5% | 6 | 0 | 1.15 / 369.0 | 60.8% | +4.3 |
| 91 | 66.0% | 85.7% | 43.5% | 30 / 35 | 9.9% | 7.0% | 10 | 0 | 1.20 / 626.2 | 64.1% | +1.9 |
| 92 | 53.9% | 68.6% | 38.5% | 24 / 35 | 9.6% | 7.4% | 12 | 0 | 1.19 / 12.8 | 65.5% | -11.6 |
| 93 | 60.1% | 77.1% | 40.1% | 27 / 35 | 9.3% | 7.0% | 15 | 0 | 1.17 / 608.3 | 63.0% | -2.9 |
| 94 | 67.0% | 82.9% | 48.9% | 29 / 35 | 9.6% | 6.5% | 13 | 0 | 1.16 / 13.0 | 52.9% | +14.1 |
| 95 | 66.1% | 82.9% | 46.2% | 29 / 35 | 8.8% | 6.7% | 11 | 0 | 1.17 / 601.7 | 63.1% | +3.0 |
| 96 | 53.6% | 68.6% | 37.7% | 24 / 35 | 8.7% | 7.6% | 6 | 0 | 1.27 / 438.3 | 64.1% | -10.5 |
| 97 | 57.8% | 74.3% | 40.6% | 26 / 35 | 9.1% | 7.4% | 10 | 0 | 1.22 / 273.1 | 61.1% | -3.3 |
| 98 | 67.1% | 85.7% | 45.1% | 30 / 35 | 9.7% | 6.7% | 12 | 0 | 1.20 / 13.7 | 59.4% | +7.6 |
| 99 | 61.8% | 77.1% | 43.7% | 27 / 35 | 9.1% | 6.8% | 6 | 0 | 1.16 / 38.8 | 53.1% | +8.7 |
| 100 | 62.7% | 80.0% | 43.5% | 28 / 35 | 9.0% | 9.0% | 15 | 0 | 1.21 / 13.1 | 58.7% | +4.0 |

Mean score share 59.6% ± 1.0, baseline 61.1% ± 0.9, paired diff -1.5 ± 1.2.

## Full report

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1144 over 100 battles (11.4 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | rumble-20 | 59.6% ± 1.0 | 74.8% ± 1.4 | 42.6% ± 0.6 | 2617 / 3500 | 9.4% ± 0.1 | 7.2% ± 0.1 | 1144 | 0 | 1.27 / 1451.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | 100 | 86 | 894 | 0 | 0.33 | 11 | 10 | 0 |

86 of 100 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | 185899 | 266 | 185829 | 185820 (100.0%) | 79 (0.0%) | 9 (0.0%) | 12670 | 1338 | 693 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| voidious.Dookious 1.573c | 226571 | 17336 (7.7%) | 172162 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | 650 | 485 | 642 | 832 | 23.6 / 31.8 | 2397 | 102461 | 57383 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | 7.2% | 1144 | 5550 | 3 | 52.7 | 17313 / 17336 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| voidious.Dookious 1.573c | voidious.Dookious | 1 | 35 | 306 | 7.7% | 7.3% ± 1.3 | 10.0% | 23.0% / 22.0% | 11.7% | 0 / 0 | T3/M1 | 63% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
