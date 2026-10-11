# lxx.Tomcat 3.68 (rumble-10) vs hadur2.Hadur 3.8.5

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 57.6% | 71.4% | 42.6% | 25 / 35 | 9.6% | 9.0% | 36 | 0 | 2.09 / 57.3 | 57.9% | -0.4 |
| 2 | 53.7% | 62.9% | 44.3% | 22 / 35 | 9.1% | 10.1% | 30 | 0 | 2.02 / 52.4 | 58.7% | -5.0 |
| 3 | 53.4% | 65.7% | 40.6% | 23 / 35 | 8.9% | 10.2% | 27 | 0 | 2.10 / 54.3 | 58.5% | -5.0 |
| 4 | 44.6% | 51.4% | 38.3% | 18 / 35 | 8.8% | 10.4% | 26 | 0 | 2.01 / 53.8 | 46.6% | -2.0 |
| 5 | 50.7% | 62.9% | 39.4% | 22 / 35 | 9.6% | 10.0% | 32 | 0 | 1.98 / 52.1 | 59.0% | -8.3 |
| 6 | 61.6% | 73.5% | 50.1% | 26 / 35 | 9.8% | 10.1% | 32 | 0 | 2.08 / 57.7 | 51.3% | +10.2 |
| 7 | 54.6% | 65.7% | 43.8% | 23 / 35 | 9.1% | 10.3% | 29 | 0 | 2.02 / 56.0 | 49.2% | +5.4 |
| 8 | 55.5% | 68.6% | 42.0% | 24 / 35 | 8.3% | 10.5% | 33 | 0 | 2.07 / 59.5 | 45.0% | +10.5 |
| 9 | 57.4% | 67.6% | 47.0% | 24 / 35 | 10.0% | 10.4% | 30 | 0 | 2.07 / 33.9 | 57.6% | -0.2 |
| 10 | 60.5% | 74.3% | 47.1% | 26 / 35 | 10.3% | 10.7% | 32 | 0 | 2.10 / 33.0 | 55.2% | +5.3 |
| 11 | 59.0% | 71.4% | 46.9% | 25 / 35 | 10.3% | 10.7% | 31 | 0 | 2.10 / 57.8 | 56.6% | +2.4 |
| 12 | 44.6% | 51.4% | 38.4% | 18 / 35 | 8.0% | 10.2% | 24 | 0 | 1.94 / 53.4 | 52.7% | -8.1 |
| 13 | 60.1% | 74.3% | 46.3% | 26 / 35 | 9.8% | 9.8% | 29 | 0 | 2.06 / 55.6 | 57.3% | +2.8 |
| 14 | 61.7% | 77.1% | 46.5% | 27 / 35 | 9.8% | 10.3% | 31 | 0 | 2.10 / 57.2 | 54.9% | +6.7 |
| 15 | 53.6% | 62.9% | 44.0% | 22 / 35 | 9.0% | 10.1% | 28 | 0 | 2.07 / 52.6 | 46.1% | +7.6 |
| 16 | 48.1% | 57.1% | 39.9% | 20 / 35 | 9.4% | 10.7% | 23 | 0 | 2.07 / 120.9 | 48.5% | -0.4 |
| 17 | 69.1% | 88.6% | 49.5% | 31 / 35 | 10.2% | 9.5% | 35 | 0 | 2.17 / 61.3 | 52.5% | +16.6 |
| 18 | 60.4% | 74.3% | 46.6% | 26 / 35 | 9.7% | 10.5% | 32 | 0 | 2.00 / 53.6 | 52.0% | +8.4 |
| 19 | 55.8% | 68.6% | 43.1% | 24 / 35 | 10.1% | 10.3% | 29 | 0 | 2.14 / 54.7 | 55.8% | -0.0 |
| 20 | 49.1% | 57.1% | 41.5% | 20 / 35 | 9.0% | 10.6% | 23 | 0 | 2.02 / 64.0 | 49.4% | -0.3 |
| 21 | 51.8% | 62.9% | 40.6% | 22 / 35 | 8.5% | 10.5% | 32 | 0 | 2.01 / 55.1 | 52.0% | -0.3 |
| 22 | 51.2% | 65.7% | 38.5% | 23 / 35 | 9.3% | 10.1% | 33 | 0 | 2.04 / 59.4 | 61.1% | -9.8 |
| 23 | 65.5% | 82.9% | 48.9% | 29 / 35 | 10.9% | 10.6% | 30 | 0 | 2.14 / 57.3 | 58.9% | +6.7 |
| 24 | 50.3% | 60.0% | 41.5% | 21 / 35 | 8.5% | 10.2% | 27 | 0 | 2.06 / 54.2 | 58.2% | -7.9 |
| 25 | 51.9% | 62.9% | 41.5% | 22 / 35 | 9.9% | 9.5% | 30 | 0 | 2.03 / 57.2 | 56.3% | -4.4 |
| 26 | 47.9% | 54.3% | 41.5% | 19 / 35 | 8.5% | 10.1% | 19 | 0 | 2.00 / 54.9 | 49.3% | -1.4 |
| 27 | 51.2% | 62.9% | 40.6% | 22 / 35 | 9.3% | 10.9% | 30 | 0 | 2.11 / 54.7 | 57.2% | -6.0 |
| 28 | 50.2% | 57.1% | 43.0% | 20 / 35 | 9.1% | 8.7% | 34 | 0 | 2.00 / 57.2 | 65.9% | -15.7 |
| 29 | 53.3% | 62.9% | 43.9% | 22 / 35 | 9.1% | 9.3% | 32 | 0 | 2.01 / 58.0 | 61.2% | -7.9 |
| 30 | 60.6% | 76.5% | 44.6% | 27 / 35 | 9.5% | 9.9% | 20 | 0 | 2.21 / 54.4 | 48.9% | +11.8 |
| 31 | 58.6% | 71.4% | 45.3% | 25 / 35 | 9.7% | 9.9% | 37 | 0 | 2.09 / 56.3 | 56.5% | +2.0 |
| 32 | 53.9% | 65.7% | 43.4% | 23 / 35 | 9.4% | 10.5% | 30 | 0 | 2.04 / 54.9 | 52.8% | +1.1 |
| 33 | 50.2% | 60.0% | 40.5% | 21 / 35 | 9.1% | 9.8% | 31 | 0 | 2.01 / 53.8 | 50.2% | -0.0 |
| 34 | 58.6% | 71.4% | 44.8% | 25 / 35 | 8.8% | 10.7% | 31 | 0 | 2.06 / 59.9 | 60.8% | -2.2 |
| 35 | 57.3% | 68.6% | 45.6% | 24 / 35 | 9.5% | 9.9% | 33 | 0 | 2.12 / 57.5 | 56.1% | +1.2 |
| 36 | 52.2% | 62.9% | 43.4% | 22 / 35 | 9.4% | 10.5% | 25 | 0 | 1.98 / 53.2 | 61.4% | -9.2 |
| 37 | 54.9% | 68.6% | 42.1% | 24 / 35 | 10.2% | 10.3% | 34 | 0 | 2.06 / 57.5 | 53.1% | +1.8 |
| 38 | 49.6% | 55.9% | 44.1% | 20 / 35 | 9.5% | 9.6% | 34 | 0 | 2.04 / 53.5 | 59.9% | -10.3 |
| 39 | 55.8% | 68.6% | 43.3% | 24 / 35 | 9.8% | 10.6% | 33 | 0 | 2.06 / 57.5 | 51.7% | +4.0 |
| 40 | 48.9% | 57.1% | 41.7% | 20 / 35 | 9.3% | 10.9% | 37 | 0 | 2.05 / 55.4 | 58.5% | -9.6 |
| 41 | 54.8% | 68.6% | 42.7% | 24 / 35 | 10.0% | 10.7% | 35 | 0 | 2.07 / 55.2 | 57.3% | -2.5 |
| 42 | 53.0% | 65.7% | 41.3% | 23 / 35 | 9.4% | 10.8% | 29 | 0 | 2.03 / 56.4 | 44.4% | +8.7 |
| 43 | 51.0% | 60.0% | 42.0% | 21 / 35 | 9.0% | 10.0% | 27 | 0 | 2.06 / 57.4 | 52.0% | -1.0 |
| 44 | 53.8% | 65.7% | 42.5% | 23 / 35 | 8.9% | 10.0% | 25 | 0 | 2.08 / 133.8 | 49.9% | +3.9 |
| 45 | 55.4% | 68.6% | 42.5% | 24 / 35 | 9.5% | 9.6% | 21 | 0 | 2.08 / 56.1 | 49.4% | +6.0 |
| 46 | 47.7% | 57.1% | 39.3% | 20 / 35 | 9.4% | 10.1% | 27 | 0 | 2.03 / 55.5 | 45.4% | +2.3 |
| 47 | 43.4% | 48.6% | 39.4% | 17 / 35 | 9.2% | 9.9% | 28 | 0 | 2.02 / 57.1 | 48.4% | -5.0 |
| 48 | 51.7% | 61.8% | 42.3% | 22 / 35 | 10.1% | 10.5% | 27 | 0 | 1.97 / 56.2 | 58.2% | -6.5 |
| 49 | 49.1% | 57.1% | 42.2% | 20 / 35 | 9.5% | 10.0% | 31 | 0 | 1.98 / 34.2 | 63.2% | -14.1 |
| 50 | 54.8% | 64.7% | 45.7% | 23 / 35 | 9.5% | 10.0% | 37 | 0 | 2.08 / 60.5 | 56.7% | -1.9 |
| 51 | 55.7% | 68.6% | 43.3% | 24 / 35 | 10.0% | 10.8% | 36 | 0 | 1.99 / 56.2 | 56.7% | -1.0 |
| 52 | 55.3% | 68.6% | 41.9% | 24 / 35 | 8.9% | 10.0% | 26 | 0 | 2.13 / 57.1 | 42.9% | +12.4 |
| 53 | 48.9% | 60.0% | 38.6% | 21 / 35 | 8.9% | 11.1% | 27 | 0 | 1.95 / 55.6 | 49.9% | -1.0 |
| 54 | 52.8% | 62.9% | 43.4% | 22 / 35 | 8.8% | 10.2% | 21 | 0 | 2.06 / 54.1 | 48.9% | +3.9 |
| 55 | 51.2% | 62.9% | 40.1% | 22 / 35 | 9.7% | 10.4% | 32 | 0 | 2.05 / 57.1 | 49.5% | +1.6 |
| 56 | 55.7% | 65.7% | 45.9% | 23 / 35 | 9.1% | 10.3% | 34 | 0 | 2.05 / 67.7 | 53.6% | +2.1 |
| 57 | 54.4% | 68.6% | 40.3% | 24 / 35 | 9.2% | 10.5% | 34 | 0 | 2.02 / 54.9 | 56.9% | -2.5 |
| 58 | 48.5% | 54.3% | 42.8% | 19 / 35 | 8.2% | 9.9% | 19 | 0 | 1.92 / 52.4 | 59.9% | -11.3 |
| 59 | 48.9% | 60.0% | 39.1% | 21 / 35 | 8.9% | 10.3% | 30 | 0 | 2.02 / 54.1 | 50.6% | -1.7 |
| 60 | 58.4% | 74.3% | 43.0% | 26 / 35 | 9.6% | 10.5% | 33 | 0 | 2.11 / 57.7 | 58.9% | -0.5 |
| 61 | 62.0% | 77.1% | 46.8% | 27 / 35 | 9.5% | 9.9% | 28 | 0 | 2.14 / 55.6 | 45.0% | +16.9 |
| 62 | 67.1% | 88.6% | 44.5% | 31 / 35 | 9.4% | 10.4% | 36 | 0 | 2.15 / 57.7 | 55.4% | +11.7 |
| 63 | 54.8% | 68.6% | 41.9% | 24 / 35 | 9.3% | 11.2% | 24 | 0 | 1.96 / 57.1 | 52.2% | +2.6 |
| 64 | 52.7% | 65.7% | 39.6% | 23 / 35 | 9.2% | 9.9% | 29 | 0 | 2.05 / 57.2 | 51.0% | +1.7 |
| 65 | 57.2% | 68.6% | 46.2% | 24 / 35 | 9.1% | 9.8% | 32 | 0 | 2.12 / 58.4 | 54.4% | +2.8 |
| 66 | 51.8% | 60.0% | 42.8% | 21 / 35 | 8.5% | 9.5% | 30 | 0 | 1.98 / 57.2 | 46.2% | +5.5 |
| 67 | 56.0% | 67.6% | 44.4% | 24 / 35 | 9.2% | 10.6% | 29 | 0 | 2.10 / 31.9 | 46.7% | +9.3 |
| 68 | 61.8% | 77.1% | 45.8% | 27 / 35 | 9.2% | 10.5% | 31 | 0 | 2.14 / 58.4 | 45.0% | +16.8 |
| 69 | 52.8% | 64.7% | 42.3% | 23 / 35 | 10.0% | 10.4% | 30 | 0 | 2.05 / 55.1 | 55.7% | -3.0 |
| 70 | 56.2% | 65.7% | 46.1% | 23 / 35 | 9.7% | 9.3% | 33 | 0 | 2.11 / 61.5 | 50.2% | +5.9 |
| 71 | 53.4% | 62.9% | 44.9% | 22 / 35 | 9.2% | 10.2% | 25 | 0 | 2.01 / 54.6 | 57.5% | -4.1 |
| 72 | 58.8% | 74.3% | 42.7% | 26 / 35 | 9.4% | 10.1% | 26 | 0 | 2.12 / 54.5 | 50.6% | +8.2 |
| 73 | 51.0% | 62.9% | 39.6% | 22 / 35 | 9.4% | 10.5% | 22 | 0 | 2.02 / 57.4 | 53.5% | -2.5 |
| 74 | 50.6% | 58.8% | 43.5% | 21 / 35 | 9.6% | 10.0% | 25 | 0 | 2.06 / 54.0 | 55.0% | -4.4 |
| 75 | 65.4% | 80.0% | 50.3% | 28 / 35 | 9.9% | 9.4% | 32 | 0 | 2.07 / 56.5 | 46.8% | +18.6 |
| 76 | 58.4% | 71.4% | 46.3% | 25 / 35 | 9.7% | 10.6% | 27 | 0 | 2.01 / 54.4 | 58.2% | +0.2 |
| 77 | 60.2% | 77.1% | 43.2% | 27 / 35 | 9.9% | 10.6% | 37 | 0 | 2.14 / 33.4 | 49.8% | +10.4 |
| 78 | 47.0% | 54.3% | 40.9% | 19 / 35 | 9.8% | 11.1% | 28 | 0 | 2.00 / 32.9 | 52.1% | -5.1 |
| 79 | 54.3% | 64.7% | 44.5% | 23 / 35 | 9.6% | 9.8% | 23 | 0 | 2.06 / 53.0 | 51.9% | +2.4 |
| 80 | 60.0% | 74.3% | 45.6% | 26 / 35 | 9.4% | 10.4% | 26 | 0 | 2.09 / 57.9 | 56.7% | +3.3 |
| 81 | 45.3% | 54.3% | 36.6% | 19 / 35 | 8.9% | 10.0% | 35 | 0 | 1.99 / 32.6 | 58.1% | -12.9 |
| 82 | 63.9% | 77.1% | 48.9% | 27 / 35 | 9.9% | 10.3% | 26 | 0 | 2.08 / 58.2 | 51.6% | +12.3 |
| 83 | 51.8% | 62.9% | 40.4% | 22 / 35 | 9.0% | 10.7% | 24 | 0 | 2.06 / 57.7 | 61.4% | -9.6 |
| 84 | 57.6% | 71.4% | 43.7% | 25 / 35 | 10.0% | 10.7% | 36 | 0 | 2.11 / 59.9 | 56.7% | +0.9 |
| 85 | 59.1% | 74.3% | 44.7% | 26 / 35 | 10.5% | 10.1% | 33 | 0 | 2.11 / 57.7 | 57.8% | +1.2 |
| 86 | 45.7% | 51.4% | 40.9% | 18 / 35 | 9.3% | 10.3% | 27 | 0 | 2.00 / 33.2 | 55.1% | -9.4 |
| 87 | 57.8% | 71.4% | 44.4% | 25 / 35 | 10.4% | 10.4% | 30 | 0 | 2.15 / 58.7 | 59.8% | -2.0 |
| 88 | 56.0% | 70.6% | 43.5% | 25 / 35 | 9.8% | 11.1% | 28 | 0 | 2.04 / 59.9 | 55.0% | +1.1 |
| 89 | 49.9% | 60.0% | 41.1% | 21 / 35 | 9.6% | 11.1% | 30 | 0 | 1.98 / 53.6 | 54.2% | -4.3 |
| 90 | 53.3% | 65.7% | 41.4% | 23 / 35 | 9.9% | 10.1% | 25 | 0 | 2.06 / 50.6 | 55.3% | -2.0 |
| 91 | 54.1% | 68.6% | 40.3% | 24 / 35 | 8.6% | 10.4% | 37 | 0 | 2.13 / 35.4 | 61.2% | -7.1 |
| 92 | 53.8% | 65.7% | 42.4% | 23 / 35 | 8.9% | 10.5% | 32 | 0 | 2.08 / 55.2 | 60.3% | -6.5 |
| 93 | 59.2% | 74.3% | 44.6% | 26 / 35 | 9.5% | 10.3% | 35 | 0 | 2.07 / 59.2 | 58.9% | +0.3 |
| 94 | 55.3% | 68.6% | 43.3% | 24 / 35 | 9.7% | 10.6% | 29 | 0 | 2.06 / 57.9 | 54.5% | +0.8 |
| 95 | 55.6% | 68.6% | 42.9% | 24 / 35 | 9.3% | 10.4% | 30 | 0 | 1.98 / 55.2 | 52.1% | +3.5 |
| 96 | 51.1% | 61.8% | 41.1% | 22 / 35 | 9.3% | 10.3% | 37 | 0 | 2.03 / 56.5 | 55.2% | -4.2 |
| 97 | 57.3% | 71.4% | 44.1% | 25 / 35 | 9.3% | 10.4% | 31 | 0 | 2.10 / 57.8 | 47.1% | +10.2 |
| 98 | 53.1% | 62.9% | 44.1% | 22 / 35 | 9.7% | 11.5% | 27 | 0 | 2.04 / 55.4 | 54.3% | -1.1 |
| 99 | 58.9% | 71.4% | 45.2% | 25 / 35 | 9.8% | 10.0% | 31 | 0 | 2.06 / 138.4 | 53.9% | +5.0 |
| 100 | 56.1% | 68.6% | 44.5% | 24 / 35 | 9.6% | 10.3% | 38 | 0 | 2.05 / 57.9 | 62.0% | -5.9 |

Mean score share 54.6% ± 1.0, baseline 54.1% ± 1.0, paired diff +0.5 ± 1.4.

## Full report

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 2977 over 100 battles (29.8 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | rumble-10 | 54.6% ± 1.0 | 66.3% ± 1.5 | 43.2% ± 0.5 | 2326 / 3500 | 9.4% ± 0.1 | 10.3% ± 0.1 | 2977 | 0 | 2.21 / 138.4 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | 100 | 73 | 65 | 0 | 0.85 | 26 | 25 | 0 |

73 of 100 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | 595570 | 10827 | 597876 | 594951 (99.9%) | 619 (0.1%) | 2925 (0.5%) | 48659 | 4841 | 2739 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| lxx.Tomcat 3.68 | 607115 | 69475 (11.4%) | 592385 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | 650 | 511 | 650 | 2049 | 27.0 / 35.5 | 3231 | 411136 | 212 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | 10.3% | 2977 | 48240 | 3 | 170.1 | 69409 / 69475 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| lxx.Tomcat 3.68 | lxx.Tomcat | 1 | 35 | 274 | 10.6% | 8.7% ± 0.9 | 10.4% | 23.0% / 22.2% | 8.6% | 0 / 0 | T3/M1 | 56% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
