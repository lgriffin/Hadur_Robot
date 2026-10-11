# oog.mega.saguaro.Saguaro 1.0 (rumble-4) vs hadur2.Hadur 3.8.5

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 74.1% | 91.4% | 58.8% | 32 / 35 | 20.8% | 8.2% | 12 | 0 | 1.88 / 73.2 | 63.2% | +10.9 |
| 2 | 70.9% | 82.9% | 59.9% | 29 / 35 | 18.9% | 6.5% | 13 | 0 | 1.88 / 9.3 | 77.8% | -6.8 |
| 3 | 72.6% | 88.6% | 57.8% | 31 / 35 | 17.3% | 7.5% | 12 | 0 | 1.82 / 9.9 | 73.7% | -1.1 |
| 4 | 78.7% | 94.3% | 63.5% | 33 / 35 | 18.0% | 6.5% | 13 | 0 | 2.05 / 10.1 | 78.0% | +0.7 |
| 5 | 72.0% | 82.9% | 61.7% | 29 / 35 | 17.3% | 6.9% | 13 | 0 | 1.95 / 9.5 | 73.8% | -1.8 |
| 6 | 75.0% | 85.7% | 64.1% | 30 / 35 | 18.5% | 5.9% | 12 | 0 | 2.13 / 169.0 | 68.6% | +6.4 |
| 7 | 72.5% | 82.9% | 62.2% | 29 / 35 | 17.6% | 6.0% | 12 | 0 | 2.05 / 10.4 | 76.3% | -3.8 |
| 8 | 75.3% | 88.6% | 62.1% | 31 / 35 | 18.3% | 6.4% | 9 | 0 | 1.91 / 11.0 | 79.9% | -4.6 |
| 9 | 71.7% | 82.9% | 60.3% | 29 / 35 | 16.7% | 6.7% | 10 | 0 | 2.09 / 12.3 | 73.8% | -2.1 |
| 10 | 69.3% | 80.0% | 59.5% | 28 / 35 | 18.2% | 7.4% | 10 | 0 | 1.84 / 10.3 | 76.3% | -7.0 |
| 11 | 73.5% | 85.7% | 61.6% | 30 / 35 | 18.5% | 6.5% | 10 | 0 | 1.84 / 34.4 | 71.4% | +2.1 |
| 12 | 76.4% | 88.6% | 64.3% | 31 / 35 | 17.7% | 7.1% | 12 | 0 | 2.08 / 10.7 | 77.0% | -0.6 |
| 13 | 61.5% | 68.6% | 55.1% | 24 / 35 | 18.4% | 7.3% | 13 | 0 | 2.05 / 40.3 | 73.7% | -12.2 |
| 14 | 64.7% | 74.3% | 56.0% | 26 / 35 | 16.9% | 6.7% | 15 | 0 | 1.97 / 112.5 | 70.4% | -5.7 |
| 15 | 64.5% | 77.1% | 53.4% | 27 / 35 | 18.3% | 7.4% | 13 | 0 | 1.89 / 9.7 | 64.9% | -0.4 |
| 16 | 65.3% | 74.3% | 56.6% | 26 / 35 | 17.9% | 6.5% | 13 | 0 | 2.11 / 185.9 | 77.2% | -11.9 |
| 17 | 75.4% | 91.4% | 59.2% | 32 / 35 | 16.5% | 7.2% | 14 | 0 | 1.92 / 9.7 | 65.4% | +9.9 |
| 18 | 71.3% | 82.9% | 61.0% | 29 / 35 | 18.6% | 7.1% | 8 | 0 | 2.22 / 9.6 | 66.5% | +4.8 |
| 19 | 62.2% | 68.6% | 56.3% | 24 / 35 | 18.3% | 7.8% | 12 | 0 | 2.12 / 133.3 | 78.9% | -16.6 |
| 20 | 70.5% | 80.0% | 62.1% | 28 / 35 | 19.3% | 6.6% | 15 | 0 | 2.21 / 15.9 | 71.8% | -1.2 |
| 21 | 71.0% | 80.0% | 63.0% | 28 / 35 | 20.0% | 7.2% | 13 | 0 | 1.81 / 73.4 | 68.2% | +2.8 |
| 22 | 76.3% | 88.6% | 63.8% | 31 / 35 | 18.7% | 6.1% | 18 | 0 | 2.11 / 462.2 | 70.9% | +5.5 |
| 23 | 71.5% | 82.9% | 60.4% | 29 / 35 | 16.6% | 6.0% | 14 | 0 | 2.05 / 18.8 | 78.4% | -6.9 |
| 24 | 79.0% | 91.4% | 66.9% | 32 / 35 | 19.8% | 6.4% | 23 | 0 | 1.95 / 10.9 | 74.0% | +5.0 |
| 25 | 75.4% | 91.4% | 59.8% | 32 / 35 | 18.4% | 6.6% | 10 | 0 | 1.98 / 63.0 | 66.1% | +9.3 |
| 26 | 69.6% | 80.0% | 59.6% | 28 / 35 | 19.2% | 6.6% | 15 | 0 | 1.88 / 9.5 | 72.4% | -2.9 |
| 27 | 77.5% | 91.4% | 63.3% | 32 / 35 | 18.9% | 5.7% | 12 | 0 | 2.08 / 10.5 | 70.2% | +7.3 |
| 28 | 70.3% | 80.0% | 61.4% | 28 / 35 | 20.1% | 7.7% | 9 | 0 | 2.00 / 102.4 | 72.3% | -2.0 |
| 29 | 73.1% | 82.9% | 63.2% | 29 / 35 | 18.2% | 6.6% | 14 | 0 | 2.03 / 10.1 | 72.5% | +0.6 |
| 30 | 77.0% | 88.6% | 64.9% | 31 / 35 | 18.5% | 6.2% | 11 | 0 | 2.13 / 9.4 | 64.3% | +12.6 |
| 31 | 72.8% | 82.9% | 63.0% | 29 / 35 | 19.3% | 6.3% | 19 | 0 | 1.94 / 10.1 | 75.7% | -2.9 |
| 32 | 65.0% | 74.3% | 56.4% | 26 / 35 | 18.3% | 7.3% | 12 | 0 | 1.97 / 9.7 | 71.2% | -6.2 |
| 33 | 76.3% | 85.7% | 68.0% | 30 / 35 | 22.1% | 8.4% | 6 | 0 | 1.81 / 8.8 | 81.8% | -5.5 |
| 34 | 68.6% | 80.0% | 57.9% | 28 / 35 | 18.4% | 7.3% | 15 | 0 | 1.95 / 9.4 | 78.0% | -9.4 |
| 35 | 75.5% | 88.6% | 62.8% | 31 / 35 | 18.3% | 6.6% | 14 | 0 | 2.10 / 176.6 | 72.3% | +3.3 |
| 36 | 77.0% | 91.4% | 62.0% | 32 / 35 | 16.9% | 6.7% | 19 | 0 | 2.08 / 208.5 | 76.7% | +0.3 |
| 37 | 66.6% | 77.1% | 55.5% | 27 / 35 | 16.4% | 6.3% | 16 | 0 | 2.12 / 10.4 | 78.9% | -12.3 |
| 38 | 76.3% | 88.6% | 64.5% | 31 / 35 | 18.8% | 6.5% | 12 | 0 | 1.96 / 409.6 | 75.7% | +0.6 |
| 39 | 69.9% | 82.9% | 57.6% | 29 / 35 | 18.0% | 7.5% | 13 | 0 | 2.14 / 9.7 | 66.1% | +3.8 |
| 40 | 65.2% | 74.3% | 57.4% | 26 / 35 | 19.8% | 8.7% | 8 | 0 | 2.16 / 9.5 | 79.8% | -14.6 |
| 41 | 84.8% | 100.0% | 70.3% | 35 / 35 | 19.5% | 6.6% | 11 | 0 | 1.87 / 10.7 | 76.9% | +7.9 |
| 42 | 76.7% | 85.7% | 68.7% | 30 / 35 | 21.5% | 8.0% | 13 | 0 | 1.81 / 9.7 | 70.2% | +6.5 |
| 43 | 76.0% | 85.7% | 65.8% | 30 / 35 | 17.4% | 5.4% | 12 | 0 | 1.97 / 10.2 | 73.5% | +2.5 |
| 44 | 67.7% | 77.1% | 58.3% | 27 / 35 | 17.4% | 6.7% | 8 | 0 | 2.04 / 484.3 | 73.0% | -5.3 |
| 45 | 72.2% | 85.7% | 58.8% | 30 / 35 | 18.2% | 6.6% | 11 | 0 | 2.02 / 84.7 | 67.1% | +5.1 |
| 46 | 82.3% | 94.3% | 71.0% | 33 / 35 | 20.6% | 6.6% | 9 | 0 | 1.75 / 438.8 | 73.8% | +8.4 |
| 47 | 80.4% | 94.3% | 66.4% | 33 / 35 | 19.4% | 6.2% | 12 | 0 | 2.06 / 9.1 | 79.9% | +0.5 |
| 48 | 73.7% | 82.9% | 64.6% | 29 / 35 | 19.3% | 6.5% | 11 | 0 | 2.15 / 9.2 | 73.3% | +0.3 |
| 49 | 74.3% | 88.6% | 59.6% | 31 / 35 | 18.4% | 6.2% | 13 | 0 | 2.08 / 73.1 | 71.3% | +2.9 |
| 50 | 68.7% | 77.1% | 60.0% | 27 / 35 | 18.9% | 6.5% | 12 | 0 | 1.89 / 9.4 | 75.5% | -6.8 |
| 51 | 73.2% | 85.7% | 60.5% | 30 / 35 | 18.0% | 6.3% | 17 | 0 | 2.13 / 620.4 | 77.8% | -4.6 |
| 52 | 81.2% | 94.3% | 67.6% | 33 / 35 | 18.3% | 6.0% | 14 | 0 | 1.96 / 59.7 | 72.3% | +8.9 |
| 53 | 80.6% | 94.3% | 68.4% | 33 / 35 | 21.2% | 8.1% | 13 | 0 | 1.75 / 773.5 | 62.2% | +18.4 |
| 54 | 75.4% | 85.7% | 65.1% | 30 / 35 | 18.7% | 6.4% | 15 | 0 | 1.88 / 81.0 | 79.3% | -3.9 |
| 55 | 72.1% | 85.7% | 59.2% | 30 / 35 | 17.9% | 7.0% | 20 | 0 | 2.05 / 9.8 | 70.7% | +1.4 |
| 56 | 75.3% | 88.6% | 62.0% | 31 / 35 | 19.3% | 6.8% | 17 | 0 | 2.07 / 59.7 | 76.2% | -1.0 |
| 57 | 70.6% | 80.0% | 60.8% | 28 / 35 | 16.5% | 5.9% | 11 | 0 | 2.12 / 204.1 | 80.6% | -10.0 |
| 58 | 71.7% | 85.7% | 58.2% | 30 / 35 | 16.0% | 7.6% | 19 | 0 | 2.04 / 9.6 | 77.8% | -6.1 |
| 59 | 68.3% | 80.0% | 56.7% | 28 / 35 | 17.9% | 6.7% | 8 | 0 | 2.00 / 9.9 | 76.5% | -8.2 |
| 60 | 69.3% | 82.9% | 55.9% | 29 / 35 | 17.8% | 6.9% | 12 | 0 | 2.15 / 199.4 | 65.6% | +3.7 |
| 61 | 82.1% | 94.3% | 69.7% | 33 / 35 | 19.4% | 6.4% | 12 | 0 | 1.80 / 386.0 | 73.6% | +8.5 |
| 62 | 72.5% | 85.7% | 60.0% | 30 / 35 | 19.5% | 6.3% | 17 | 0 | 2.13 / 370.9 | 79.0% | -6.6 |
| 63 | 74.3% | 88.6% | 61.1% | 31 / 35 | 20.0% | 7.1% | 10 | 0 | 1.97 / 9.5 | 72.7% | +1.7 |
| 64 | 84.3% | 97.1% | 70.4% | 34 / 35 | 17.6% | 5.2% | 21 | 0 | 1.92 / 21.3 | 79.9% | +4.3 |
| 65 | 66.1% | 74.3% | 57.8% | 26 / 35 | 16.7% | 5.9% | 7 | 0 | 2.03 / 10.4 | 71.7% | -5.6 |
| 66 | 73.8% | 82.9% | 64.9% | 29 / 35 | 18.6% | 5.7% | 14 | 0 | 1.86 / 286.4 | 74.4% | -0.6 |
| 67 | 73.2% | 85.7% | 60.7% | 30 / 35 | 19.2% | 5.9% | 12 | 0 | 1.97 / 10.5 | 66.6% | +6.6 |
| 68 | 74.1% | 85.7% | 62.9% | 30 / 35 | 18.8% | 7.8% | 85 | 0 | 2.07 / 10.3 | 67.0% | +7.1 |
| 69 | 66.0% | 77.1% | 54.9% | 27 / 35 | 18.1% | 7.9% | 4 | 0 | 2.04 / 10.7 | 80.8% | -14.9 |
| 70 | 69.1% | 77.1% | 60.9% | 27 / 35 | 17.2% | 5.7% | 10 | 0 | 2.12 / 11.6 | 76.3% | -7.2 |
| 71 | 79.2% | 88.6% | 70.1% | 31 / 35 | 19.4% | 6.5% | 12 | 0 | 1.89 / 273.6 | 76.7% | +2.4 |
| 72 | 69.2% | 82.9% | 57.3% | 29 / 35 | 18.4% | 7.9% | 14 | 0 | 1.88 / 315.0 | 72.1% | -2.9 |
| 73 | 65.3% | 74.3% | 56.6% | 26 / 35 | 17.9% | 6.9% | 13 | 0 | 2.11 / 10.5 | 69.8% | -4.4 |
| 74 | 79.8% | 91.4% | 68.5% | 32 / 35 | 19.0% | 6.4% | 127 | 0 | 2.04 / 24.2 | 75.6% | +4.2 |
| 75 | 74.7% | 91.4% | 58.4% | 32 / 35 | 17.4% | 6.9% | 17 | 0 | 2.01 / 9.4 | 72.1% | +2.6 |
| 76 | 69.3% | 80.0% | 58.2% | 28 / 35 | 14.7% | 6.1% | 18 | 0 | 2.22 / 157.3 | 72.4% | -3.1 |
| 77 | 74.0% | 88.6% | 60.6% | 31 / 35 | 18.0% | 6.4% | 17 | 0 | 2.00 / 71.5 | 72.0% | +2.0 |
| 78 | 74.8% | 85.7% | 64.0% | 30 / 35 | 17.9% | 6.4% | 12 | 0 | 1.97 / 755.3 | 74.9% | -0.1 |
| 79 | 67.7% | 80.0% | 57.2% | 28 / 35 | 18.7% | 7.4% | 15 | 0 | 2.10 / 10.3 | 68.0% | -0.3 |
| 80 | 83.8% | 100.0% | 69.5% | 35 / 35 | 19.5% | 7.5% | 13 | 0 | 2.02 / 9.7 | 77.1% | +6.7 |
| 81 | 61.1% | 68.6% | 54.2% | 24 / 35 | 16.5% | 7.6% | 18 | 0 | 2.06 / 761.7 | 74.7% | -13.5 |
| 82 | 69.3% | 77.1% | 61.8% | 27 / 35 | 18.8% | 6.3% | 13 | 0 | 2.19 / 10.2 | 74.2% | -4.9 |
| 83 | 68.6% | 77.1% | 60.8% | 27 / 35 | 20.1% | 8.0% | 12 | 0 | 2.12 / 114.6 | 71.4% | -2.8 |
| 84 | 72.0% | 85.7% | 58.1% | 30 / 35 | 15.9% | 6.1% | 15 | 0 | 2.01 / 9.9 | 75.8% | -3.8 |
| 85 | 79.1% | 94.3% | 63.2% | 33 / 35 | 16.4% | 5.7% | 16 | 0 | 2.08 / 96.8 | 66.7% | +12.5 |
| 86 | 76.1% | 88.6% | 64.2% | 31 / 35 | 19.2% | 6.3% | 12 | 0 | 1.89 / 9.8 | 74.7% | +1.4 |
| 87 | 73.1% | 82.9% | 64.3% | 29 / 35 | 18.7% | 6.6% | 18 | 0 | 2.01 / 9.6 | 78.4% | -5.3 |
| 88 | 69.6% | 80.0% | 60.0% | 28 / 35 | 19.5% | 7.6% | 12 | 0 | 2.07 / 13.5 | 63.1% | +6.5 |
| 89 | 69.7% | 77.1% | 63.0% | 27 / 35 | 19.1% | 6.9% | 18 | 0 | 2.11 / 10.1 | 64.8% | +4.9 |
| 90 | 70.2% | 82.9% | 58.1% | 29 / 35 | 17.6% | 6.8% | 14 | 0 | 1.94 / 10.7 | 79.9% | -9.7 |
| 91 | 74.2% | 85.7% | 62.7% | 30 / 35 | 17.9% | 6.2% | 11 | 0 | 2.04 / 10.3 | 75.3% | -1.1 |
| 92 | 76.0% | 88.6% | 62.4% | 31 / 35 | 18.0% | 5.7% | 13 | 0 | 2.08 / 9.4 | 79.1% | -3.2 |
| 93 | 77.8% | 91.4% | 64.0% | 32 / 35 | 16.9% | 6.0% | 13 | 0 | 1.94 / 47.5 | 69.8% | +8.0 |
| 94 | 66.1% | 74.3% | 58.1% | 26 / 35 | 17.6% | 7.0% | 13 | 0 | 2.21 / 9.6 | 79.6% | -13.5 |
| 95 | 61.5% | 68.6% | 54.9% | 24 / 35 | 18.7% | 7.0% | 13 | 0 | 2.15 / 10.3 | 81.8% | -20.3 |
| 96 | 70.6% | 80.0% | 62.3% | 28 / 35 | 19.3% | 8.4% | 14 | 0 | 1.79 / 9.9 | 68.5% | +2.0 |
| 97 | 73.9% | 85.7% | 62.4% | 30 / 35 | 18.7% | 6.3% | 16 | 0 | 1.90 / 9.7 | 69.5% | +4.3 |
| 98 | 67.9% | 77.1% | 58.7% | 27 / 35 | 18.5% | 7.1% | 15 | 0 | 1.95 / 9.8 | 77.3% | -9.4 |
| 99 | 80.1% | 97.1% | 63.7% | 34 / 35 | 19.6% | 6.8% | 17 | 0 | 1.93 / 9.3 | 81.5% | -1.4 |
| 100 | 72.9% | 82.9% | 63.7% | 29 / 35 | 20.4% | 7.0% | 7 | 0 | 1.89 / 46.8 | 80.2% | -7.3 |

Mean score share 72.7% ± 1.0, baseline 73.6% ± 1.0, paired diff -0.9 ± 1.4.

## Full report

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1502 over 100 battles (15.0 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | rumble-4 | 72.7% ± 1.0 | 84.3% ± 1.4 | 61.5% ± 0.8 | 2949 / 3500 | 18.4% ± 0.2 | 6.8% ± 0.1 | 1502 | 0 | 2.22 / 773.5 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 100 | 81 | 5066 | 2 | 0.43 | 1 | 1 | 0 |

81 of 100 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 117672 | 222 | 117358 | 117224 (99.6%) | 448 (0.4%) | 134 (0.1%) | 7629 | 1743 | 443 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 134643 | 10266 (7.6%) | 133426 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 650 | 445 | 464 | 537 | 43.1 / 26.9 | 15967 | 45645 | 9745 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 6.8% | 1502 | 2436 | 3 | 33.5 | 9892 / 10266 (96%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| oog.mega.saguaro.Saguaro 1.0 | oog.mega.saguaro.Saguaro | 1 | 35 | 328 | 9.2% | 7.9% ± 1.7 | 14.6% | 25.3% / 25.5% | 9.2% | 0 / 0 | T3/M0 | 72% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
