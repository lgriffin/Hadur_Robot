# kc.serpent.WaveSerpent 2.11 (rumble-15) vs hadur2.Hadur 3.8.5

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 64.7% | 85.7% | 42.8% | 30 / 35 | 9.0% | 8.2% | 12 | 0 | 2.23 / 63.8 | 64.1% | +0.5 |
| 2 | 53.2% | 68.6% | 36.1% | 24 / 35 | 8.3% | 8.2% | 8 | 0 | 2.15 / 50.9 | 64.1% | -10.9 |
| 3 | 58.7% | 74.3% | 41.3% | 26 / 35 | 8.1% | 7.6% | 11 | 0 | 2.19 / 48.5 | 63.0% | -4.4 |
| 4 | 64.4% | 85.7% | 40.5% | 30 / 35 | 10.4% | 7.5% | 17 | 0 | 2.22 / 544.6 | 69.3% | -4.9 |
| 5 | 58.9% | 74.3% | 41.3% | 26 / 35 | 9.4% | 7.6% | 13 | 0 | 2.17 / 52.2 | 57.8% | +1.1 |
| 6 | 58.0% | 74.3% | 40.7% | 26 / 35 | 9.0% | 7.7% | 11 | 0 | 2.18 / 61.9 | 59.7% | -1.8 |
| 7 | 59.1% | 74.3% | 42.0% | 26 / 35 | 8.7% | 7.6% | 12 | 0 | 2.17 / 54.1 | 54.8% | +4.4 |
| 8 | 62.1% | 80.0% | 40.6% | 28 / 35 | 9.8% | 7.1% | 6 | 0 | 2.15 / 54.7 | 60.1% | +2.0 |
| 9 | 61.5% | 80.0% | 40.4% | 28 / 35 | 9.6% | 7.7% | 12 | 0 | 2.16 / 53.7 | 55.8% | +5.7 |
| 10 | 61.9% | 80.0% | 42.1% | 28 / 35 | 8.7% | 7.7% | 15 | 0 | 2.19 / 53.2 | 57.0% | +4.9 |
| 11 | 52.0% | 64.7% | 39.1% | 23 / 35 | 8.8% | 8.0% | 10 | 0 | 2.16 / 42.1 | 64.2% | -12.2 |
| 12 | 63.9% | 80.0% | 45.4% | 28 / 35 | 8.8% | 7.5% | 14 | 0 | 2.15 / 46.3 | 51.9% | +12.0 |
| 13 | 62.7% | 80.0% | 43.6% | 28 / 35 | 8.6% | 7.6% | 13 | 0 | 2.19 / 46.0 | 62.9% | -0.2 |
| 14 | 56.9% | 68.6% | 43.1% | 24 / 35 | 9.1% | 6.2% | 16 | 0 | 2.18 / 46.0 | 51.8% | +5.1 |
| 15 | 62.4% | 80.0% | 42.5% | 28 / 35 | 8.9% | 7.5% | 13 | 0 | 2.15 / 48.9 | 64.9% | -2.5 |
| 16 | 53.4% | 68.6% | 37.2% | 24 / 35 | 8.3% | 8.2% | 10 | 0 | 2.15 / 52.5 | 65.8% | -12.5 |
| 17 | 69.9% | 88.6% | 47.9% | 31 / 35 | 8.6% | 6.7% | 12 | 0 | 2.14 / 56.5 | 56.4% | +13.5 |
| 18 | 66.7% | 85.7% | 45.2% | 30 / 35 | 9.8% | 6.8% | 12 | 0 | 2.18 / 59.1 | 64.4% | +2.3 |
| 19 | 54.3% | 68.6% | 39.3% | 24 / 35 | 8.7% | 8.2% | 7 | 0 | 2.17 / 37.8 | 56.0% | -1.7 |
| 20 | 58.4% | 74.3% | 40.1% | 26 / 35 | 9.3% | 7.7% | 8 | 0 | 2.20 / 38.9 | 50.3% | +8.1 |
| 21 | 68.7% | 88.6% | 44.4% | 31 / 35 | 8.4% | 6.9% | 11 | 0 | 2.18 / 49.9 | 61.7% | +7.0 |
| 22 | 57.3% | 71.4% | 41.6% | 25 / 35 | 8.6% | 7.9% | 10 | 0 | 2.16 / 56.0 | 56.2% | +1.1 |
| 23 | 55.3% | 71.4% | 38.6% | 25 / 35 | 8.9% | 9.2% | 14 | 0 | 2.22 / 53.2 | 60.6% | -5.3 |
| 24 | 59.2% | 77.1% | 39.9% | 27 / 35 | 8.9% | 8.1% | 13 | 0 | 2.18 / 50.2 | 58.6% | +0.6 |
| 25 | 60.2% | 80.0% | 39.9% | 28 / 35 | 9.0% | 8.9% | 6 | 0 | 2.21 / 60.4 | 62.4% | -2.2 |
| 26 | 65.2% | 82.9% | 45.1% | 29 / 35 | 8.6% | 7.1% | 10 | 0 | 2.12 / 57.0 | 60.2% | +5.0 |
| 27 | 55.2% | 71.4% | 38.6% | 25 / 35 | 9.1% | 8.6% | 6 | 0 | 2.07 / 56.2 | 52.9% | +2.4 |
| 28 | 55.1% | 68.6% | 40.7% | 24 / 35 | 9.5% | 7.8% | 11 | 0 | 2.19 / 54.5 | 57.8% | -2.8 |
| 29 | 46.9% | 57.1% | 38.0% | 20 / 35 | 9.0% | 9.0% | 11 | 0 | 2.17 / 48.6 | 53.1% | -6.2 |
| 30 | 61.2% | 79.4% | 42.1% | 28 / 35 | 9.0% | 8.0% | 13 | 0 | 2.19 / 50.5 | 56.2% | +5.0 |
| 31 | 49.9% | 60.0% | 39.9% | 21 / 35 | 8.0% | 8.2% | 11 | 0 | 2.11 / 39.9 | 54.2% | -4.4 |
| 32 | 59.4% | 77.1% | 40.3% | 27 / 35 | 9.3% | 8.2% | 11 | 0 | 2.23 / 57.5 | 51.4% | +8.0 |
| 33 | 69.1% | 88.6% | 45.7% | 31 / 35 | 10.1% | 6.7% | 11 | 0 | 2.18 / 42.4 | 52.7% | +16.5 |
| 34 | 56.1% | 71.4% | 41.3% | 25 / 35 | 8.9% | 8.8% | 13 | 0 | 2.19 / 47.5 | 49.9% | +6.2 |
| 35 | 56.9% | 71.4% | 39.4% | 25 / 35 | 8.4% | 6.7% | 12 | 0 | 2.14 / 57.5 | 60.9% | -4.0 |
| 36 | 46.8% | 54.3% | 39.3% | 19 / 35 | 8.3% | 8.2% | 15 | 0 | 2.14 / 34.0 | 63.4% | -16.7 |
| 37 | 57.5% | 71.4% | 42.6% | 25 / 35 | 9.3% | 7.0% | 14 | 0 | 2.17 / 59.3 | 54.3% | +3.2 |
| 38 | 47.3% | 57.1% | 36.8% | 20 / 35 | 8.0% | 7.6% | 7 | 0 | 2.14 / 50.2 | 53.2% | -5.9 |
| 39 | 62.9% | 80.0% | 43.1% | 28 / 35 | 8.9% | 7.7% | 10 | 0 | 2.17 / 51.3 | 56.2% | +6.7 |
| 40 | 50.2% | 62.9% | 37.6% | 22 / 35 | 9.4% | 8.6% | 6 | 0 | 2.13 / 50.3 | 62.8% | -12.6 |
| 41 | 49.0% | 60.0% | 37.9% | 21 / 35 | 8.9% | 8.3% | 10 | 0 | 2.15 / 49.6 | 58.5% | -9.6 |
| 42 | 49.0% | 60.0% | 37.1% | 21 / 35 | 8.6% | 7.0% | 6 | 0 | 2.14 / 53.0 | 49.1% | -0.1 |
| 43 | 65.7% | 85.7% | 43.3% | 30 / 35 | 9.8% | 8.0% | 10 | 0 | 2.14 / 40.4 | 46.4% | +19.2 |
| 44 | 55.2% | 71.4% | 39.1% | 25 / 35 | 9.2% | 8.1% | 12 | 0 | 2.17 / 58.3 | 58.1% | -2.9 |
| 45 | 52.3% | 65.7% | 38.3% | 23 / 35 | 9.3% | 7.9% | 12 | 0 | 2.12 / 57.7 | 62.6% | -10.3 |
| 46 | 60.7% | 77.1% | 42.4% | 27 / 35 | 9.3% | 7.5% | 8 | 0 | 2.17 / 52.9 | 56.6% | +4.1 |
| 47 | 54.0% | 65.7% | 40.8% | 23 / 35 | 8.2% | 7.2% | 12 | 0 | 2.15 / 52.2 | 58.2% | -4.3 |
| 48 | 56.9% | 71.4% | 40.1% | 25 / 35 | 9.2% | 7.7% | 8 | 0 | 2.17 / 49.8 | 65.2% | -8.3 |
| 49 | 54.1% | 68.6% | 38.9% | 24 / 35 | 7.6% | 8.0% | 9 | 0 | 2.14 / 51.4 | 61.8% | -7.7 |
| 50 | 68.4% | 85.7% | 47.6% | 30 / 35 | 9.0% | 6.6% | 13 | 0 | 2.12 / 43.9 | 60.4% | +8.0 |
| 51 | 59.2% | 77.1% | 41.4% | 27 / 35 | 10.0% | 8.7% | 16 | 0 | 2.20 / 49.1 | 60.1% | -0.9 |
| 52 | 66.7% | 91.4% | 40.2% | 32 / 35 | 9.5% | 8.4% | 12 | 0 | 2.21 / 53.5 | 54.1% | +12.6 |
| 53 | 65.0% | 82.9% | 43.3% | 29 / 35 | 9.3% | 7.1% | 18 | 0 | 2.18 / 78.9 | 55.5% | +9.5 |
| 54 | 55.4% | 71.4% | 39.3% | 25 / 35 | 9.2% | 8.0% | 16 | 0 | 2.19 / 49.8 | 54.5% | +0.9 |
| 55 | 62.9% | 77.1% | 46.0% | 27 / 35 | 9.7% | 6.4% | 11 | 0 | 2.13 / 41.8 | 52.7% | +10.2 |
| 56 | 59.8% | 77.1% | 41.1% | 27 / 35 | 9.0% | 8.5% | 13 | 0 | 2.20 / 43.3 | 61.2% | -1.4 |
| 57 | 53.4% | 68.6% | 38.3% | 24 / 35 | 8.2% | 8.3% | 6 | 0 | 2.18 / 53.8 | 56.4% | -3.0 |
| 58 | 61.7% | 80.0% | 42.0% | 28 / 35 | 9.3% | 7.4% | 7 | 0 | 2.18 / 62.9 | 64.1% | -2.4 |
| 59 | 53.5% | 65.7% | 40.9% | 23 / 35 | 9.3% | 7.8% | 6 | 0 | 2.12 / 47.4 | 63.7% | -10.3 |
| 60 | 59.2% | 77.1% | 40.3% | 27 / 35 | 9.5% | 8.0% | 11 | 0 | 2.18 / 46.1 | 52.1% | +7.1 |
| 61 | 61.3% | 80.0% | 41.4% | 28 / 35 | 9.7% | 7.8% | 6 | 0 | 2.16 / 49.6 | 53.0% | +8.3 |
| 62 | 61.5% | 80.0% | 40.8% | 28 / 35 | 9.3% | 7.8% | 12 | 0 | 2.20 / 59.0 | 63.4% | -1.9 |
| 63 | 55.4% | 68.6% | 41.8% | 24 / 35 | 9.3% | 8.2% | 12 | 0 | 2.18 / 61.3 | 60.3% | -4.9 |
| 64 | 61.4% | 77.1% | 44.0% | 27 / 35 | 8.6% | 7.8% | 9 | 0 | 2.17 / 50.6 | 54.4% | +7.0 |
| 65 | 61.2% | 77.1% | 43.3% | 27 / 35 | 9.6% | 7.5% | 11 | 0 | 2.17 / 335.9 | 62.3% | -1.2 |
| 66 | 65.1% | 85.7% | 43.1% | 30 / 35 | 9.6% | 7.9% | 10 | 0 | 2.20 / 46.3 | 59.5% | +5.6 |
| 67 | 64.6% | 82.9% | 43.8% | 29 / 35 | 9.5% | 7.4% | 9 | 0 | 2.18 / 45.6 | 57.1% | +7.5 |
| 68 | 68.7% | 88.6% | 45.7% | 31 / 35 | 9.2% | 7.0% | 6 | 0 | 2.19 / 50.9 | 61.0% | +7.7 |
| 69 | 57.4% | 74.3% | 39.2% | 26 / 35 | 8.4% | 7.7% | 13 | 0 | 2.16 / 246.4 | 63.9% | -6.4 |
| 70 | 54.7% | 71.4% | 37.0% | 25 / 35 | 9.4% | 7.9% | 15 | 0 | 2.21 / 59.9 | 59.2% | -4.5 |
| 71 | 56.8% | 74.3% | 39.0% | 26 / 35 | 9.0% | 8.0% | 6 | 0 | 2.18 / 53.4 | 53.5% | +3.3 |
| 72 | 66.0% | 88.6% | 41.9% | 31 / 35 | 10.2% | 7.4% | 12 | 0 | 2.21 / 59.3 | 55.7% | +10.3 |
| 73 | 57.8% | 74.3% | 39.7% | 26 / 35 | 8.2% | 7.7% | 15 | 0 | 2.14 / 46.3 | 50.4% | +7.4 |
| 74 | 57.6% | 70.6% | 43.9% | 25 / 35 | 8.9% | 7.3% | 11 | 0 | 2.15 / 53.1 | 58.2% | -0.7 |
| 75 | 54.3% | 68.6% | 38.9% | 24 / 35 | 8.4% | 8.1% | 12 | 0 | 2.14 / 44.4 | 52.8% | +1.5 |
| 76 | 60.4% | 77.1% | 41.9% | 27 / 35 | 9.1% | 7.8% | 15 | 0 | 2.18 / 52.6 | 52.3% | +8.1 |
| 77 | 58.1% | 71.4% | 42.6% | 25 / 35 | 8.6% | 6.7% | 7 | 0 | 2.15 / 46.9 | 51.6% | +6.4 |
| 78 | 58.5% | 74.3% | 40.9% | 26 / 35 | 9.0% | 7.3% | 10 | 0 | 2.15 / 46.3 | 61.7% | -3.2 |
| 79 | 53.5% | 65.7% | 41.1% | 23 / 35 | 8.8% | 7.8% | 6 | 0 | 2.18 / 43.8 | 56.9% | -3.4 |
| 80 | 47.1% | 60.0% | 33.2% | 21 / 35 | 7.3% | 7.7% | 12 | 0 | 2.18 / 51.5 | 55.9% | -8.9 |
| 81 | 51.7% | 62.9% | 39.9% | 22 / 35 | 8.8% | 7.9% | 7 | 0 | 2.16 / 50.2 | 63.4% | -11.7 |
| 82 | 53.2% | 65.7% | 41.9% | 23 / 35 | 10.7% | 8.4% | 5 | 0 | 2.16 / 41.0 | 57.5% | -4.3 |
| 83 | 59.1% | 77.1% | 40.1% | 27 / 35 | 8.6% | 7.8% | 13 | 0 | 2.15 / 49.3 | 53.2% | +5.9 |
| 84 | 51.9% | 65.7% | 37.3% | 23 / 35 | 9.2% | 8.4% | 11 | 0 | 2.18 / 54.7 | 65.5% | -13.6 |
| 85 | 55.3% | 68.6% | 41.0% | 24 / 35 | 9.1% | 8.0% | 13 | 0 | 2.18 / 45.3 | 55.2% | +0.1 |
| 86 | 58.0% | 71.4% | 43.6% | 25 / 35 | 8.4% | 7.3% | 5 | 0 | 2.16 / 56.2 | 61.4% | -3.4 |
| 87 | 62.6% | 80.0% | 44.4% | 28 / 35 | 10.3% | 7.4% | 15 | 0 | 2.21 / 43.8 | 59.6% | +3.0 |
| 88 | 52.0% | 65.7% | 37.6% | 23 / 35 | 8.6% | 7.9% | 8 | 0 | 2.16 / 55.8 | 50.5% | +1.5 |
| 89 | 57.1% | 71.4% | 41.7% | 25 / 35 | 9.6% | 7.9% | 8 | 0 | 2.19 / 40.6 | 54.1% | +2.9 |
| 90 | 55.8% | 71.4% | 39.0% | 25 / 35 | 9.0% | 7.3% | 6 | 0 | 2.17 / 62.6 | 58.5% | -2.7 |
| 91 | 58.6% | 74.3% | 40.9% | 26 / 35 | 8.4% | 7.9% | 13 | 0 | 2.21 / 47.1 | 61.9% | -3.4 |
| 92 | 61.9% | 82.9% | 39.6% | 29 / 35 | 9.3% | 8.1% | 11 | 0 | 2.20 / 57.1 | 60.9% | +1.0 |
| 93 | 60.4% | 74.3% | 45.3% | 26 / 35 | 8.9% | 6.6% | 12 | 0 | 2.12 / 46.9 | 53.4% | +7.0 |
| 94 | 61.5% | 80.0% | 41.5% | 28 / 35 | 8.8% | 8.0% | 12 | 0 | 2.19 / 49.6 | 62.6% | -1.1 |
| 95 | 54.9% | 68.6% | 41.3% | 24 / 35 | 9.1% | 8.3% | 12 | 0 | 2.17 / 50.1 | 59.8% | -4.9 |
| 96 | 57.2% | 71.4% | 41.5% | 25 / 35 | 9.4% | 7.2% | 13 | 0 | 2.15 / 61.1 | 55.6% | +1.7 |
| 97 | 57.4% | 71.4% | 42.3% | 25 / 35 | 8.8% | 7.1% | 8 | 0 | 2.23 / 53.9 | 64.7% | -7.3 |
| 98 | 48.1% | 57.1% | 38.8% | 20 / 35 | 7.3% | 8.5% | 8 | 0 | 2.15 / 45.0 | 58.0% | -9.9 |
| 99 | 57.6% | 71.4% | 42.1% | 25 / 35 | 8.5% | 7.3% | 12 | 0 | 2.18 / 53.9 | 59.5% | -1.9 |
| 100 | 60.9% | 74.3% | 45.0% | 26 / 35 | 9.0% | 6.7% | 10 | 0 | 2.15 / 106.0 | 57.3% | +3.6 |

Mean score share 58.2% ± 1.1, baseline 58.0% ± 0.9, paired diff +0.2 ± 1.4.

## Full report

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1074 over 100 battles (10.7 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.serpent.WaveSerpent 2.11 | rumble-15 | 58.2% ± 1.1 | 73.9% ± 1.6 | 41.1% ± 0.5 | 2589 / 3500 | 9.0% ± 0.1 | 7.7% ± 0.1 | 1074 | 0 | 2.23 / 544.6 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.serpent.WaveSerpent 2.11 | 100 | 76 | 596 | 0 | 0.31 | 22 | 22 | 0 |

76 of 100 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.serpent.WaveSerpent 2.11 | 195331 | 115 | 195331 | 195275 (100.0%) | 56 (0.0%) | 56 (0.0%) | 14797 | 1479 | 687 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.serpent.WaveSerpent 2.11 | 257211 | 18705 (7.3%) | 219710 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.serpent.WaveSerpent 2.11 | 650 | 480 | 646 | 926 | 23.2 / 33.3 | 2285 | 161979 | 154 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.serpent.WaveSerpent 2.11 | 7.7% | 1074 | 19395 | 3 | 55.3 | 18703 / 18705 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.serpent.WaveSerpent 2.11 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kc.serpent.WaveSerpent 2.11 | kc.serpent.WaveSerpent | 1 | 35 | 322 | 7.3% | 6.8% ± 1.2 | 9.5% | 22.7% / 22.7% | 11.9% | 0 / 0 | T2/M1 | 61% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
