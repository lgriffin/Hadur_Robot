# aw.Gilgalad 1.99.5c (rumble-12) vs hadur2.Hadur 3.8.5

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 44.1% | 51.4% | 37.3% | 18 / 35 | 7.8% | 9.8% | 28 | 0 | 1.49 / 18.8 | 41.8% | +2.3 |
| 2 | 46.0% | 54.3% | 38.5% | 19 / 35 | 8.2% | 10.5% | 35 | 0 | 1.51 / 19.1 | 48.6% | -2.6 |
| 3 | 44.0% | 51.4% | 37.4% | 18 / 35 | 8.1% | 10.4% | 33 | 0 | 1.47 / 20.0 | 52.4% | -8.3 |
| 4 | 52.9% | 62.9% | 43.1% | 22 / 35 | 9.5% | 9.7% | 35 | 0 | 1.51 / 19.4 | 59.9% | -7.0 |
| 5 | 51.0% | 62.9% | 39.2% | 22 / 35 | 8.9% | 10.5% | 34 | 0 | 1.50 / 20.5 | 47.5% | +3.5 |
| 6 | 62.8% | 74.3% | 52.6% | 26 / 35 | 11.8% | 11.3% | 25 | 0 | 1.46 / 15.7 | 53.6% | +9.2 |
| 7 | 45.8% | 55.9% | 37.8% | 20 / 35 | 10.7% | 11.3% | 21 | 0 | 1.48 / 18.6 | 42.6% | +3.2 |
| 8 | 45.6% | 54.3% | 37.8% | 19 / 35 | 9.0% | 10.7% | 28 | 0 | 1.47 / 21.1 | 52.0% | -6.4 |
| 9 | 40.0% | 45.7% | 35.5% | 16 / 35 | 7.7% | 9.9% | 29 | 0 | 1.43 / 20.0 | 39.7% | +0.3 |
| 10 | 56.2% | 65.7% | 47.7% | 23 / 35 | 10.8% | 11.0% | 22 | 0 | 1.53 / 17.1 | 45.4% | +10.8 |
| 11 | 57.8% | 65.7% | 51.0% | 23 / 35 | 11.8% | 10.5% | 10 | 0 | 1.38 / 16.7 | 56.1% | +1.7 |
| 12 | 40.4% | 45.7% | 36.0% | 16 / 35 | 8.3% | 10.3% | 29 | 0 | 1.52 / 91.6 | 56.9% | -16.5 |
| 13 | 56.0% | 65.7% | 47.8% | 23 / 35 | 11.3% | 10.6% | 22 | 0 | 1.49 / 17.1 | 56.1% | -0.1 |
| 14 | 52.4% | 67.6% | 38.1% | 24 / 35 | 9.0% | 10.5% | 35 | 0 | 1.50 / 40.5 | 55.4% | -3.0 |
| 15 | 49.0% | 60.0% | 36.8% | 21 / 35 | 7.6% | 9.4% | 37 | 0 | 1.48 / 19.4 | 48.5% | +0.6 |
| 16 | 48.8% | 57.1% | 39.9% | 20 / 35 | 7.2% | 9.8% | 24 | 0 | 1.50 / 20.0 | 45.6% | +3.3 |
| 17 | 50.3% | 62.9% | 38.2% | 22 / 35 | 8.3% | 10.8% | 35 | 0 | 1.54 / 19.0 | 48.5% | +1.8 |
| 18 | 45.9% | 54.3% | 37.4% | 19 / 35 | 8.1% | 9.8% | 35 | 0 | 1.48 / 19.8 | 42.8% | +3.1 |
| 19 | 65.1% | 74.3% | 56.2% | 26 / 35 | 11.7% | 9.4% | 20 | 0 | 1.48 / 18.5 | 59.0% | +6.2 |
| 20 | 53.0% | 65.7% | 40.7% | 23 / 35 | 8.8% | 9.5% | 31 | 0 | 1.52 / 30.5 | 50.7% | +2.4 |
| 21 | 47.7% | 54.3% | 41.4% | 19 / 35 | 8.0% | 10.3% | 28 | 0 | 1.51 / 19.7 | 56.6% | -8.9 |
| 22 | 43.6% | 54.3% | 33.8% | 19 / 35 | 8.1% | 10.6% | 28 | 0 | 1.48 / 19.3 | 46.0% | -2.4 |
| 23 | 45.5% | 54.3% | 38.0% | 19 / 35 | 10.6% | 11.1% | 29 | 0 | 1.44 / 18.4 | 49.3% | -3.8 |
| 24 | 53.4% | 62.9% | 44.9% | 22 / 35 | 11.3% | 10.6% | 25 | 0 | 1.49 / 17.4 | 42.1% | +11.3 |
| 25 | 49.5% | 54.3% | 45.6% | 19 / 35 | 11.6% | 11.0% | 12 | 0 | 1.41 / 18.2 | 53.3% | -3.8 |
| 26 | 39.1% | 42.9% | 35.7% | 15 / 35 | 7.3% | 9.2% | 25 | 0 | 1.50 / 46.1 | 46.4% | -7.3 |
| 27 | 48.4% | 57.1% | 40.0% | 20 / 35 | 7.6% | 10.2% | 17 | 0 | 1.46 / 18.9 | 46.1% | +2.3 |
| 28 | 51.6% | 62.9% | 38.2% | 22 / 35 | 7.2% | 9.1% | 30 | 0 | 1.47 / 20.5 | 48.6% | +2.9 |
| 29 | 45.4% | 54.3% | 36.7% | 19 / 35 | 7.9% | 9.8% | 36 | 0 | 1.55 / 21.6 | 47.5% | -2.1 |
| 30 | 56.9% | 74.3% | 38.3% | 26 / 35 | 8.2% | 9.6% | 27 | 0 | 1.47 / 22.0 | 45.8% | +11.1 |
| 31 | 49.0% | 60.0% | 37.8% | 21 / 35 | 8.1% | 9.8% | 21 | 0 | 1.51 / 19.8 | 47.9% | +1.0 |
| 32 | 55.1% | 68.6% | 41.4% | 24 / 35 | 10.2% | 11.3% | 32 | 0 | 1.48 / 191.1 | 49.9% | +5.1 |
| 33 | 54.8% | 71.4% | 36.9% | 25 / 35 | 7.8% | 10.2% | 32 | 0 | 1.49 / 21.0 | 46.9% | +7.8 |
| 34 | 56.5% | 68.6% | 44.6% | 24 / 35 | 11.0% | 10.5% | 24 | 0 | 1.50 / 21.0 | 48.2% | +8.3 |
| 35 | 60.8% | 70.6% | 52.4% | 25 / 35 | 11.9% | 10.3% | 22 | 0 | 1.50 / 17.2 | 47.9% | +12.9 |
| 36 | 54.4% | 65.7% | 42.5% | 23 / 35 | 8.7% | 10.0% | 33 | 0 | 1.56 / 21.4 | 40.3% | +14.0 |
| 37 | 52.4% | 57.1% | 48.3% | 20 / 35 | 11.1% | 10.1% | 10 | 0 | 1.36 / 17.4 | 47.6% | +4.8 |
| 38 | 58.5% | 68.6% | 48.7% | 24 / 35 | 11.8% | 10.5% | 31 | 0 | 1.49 / 17.4 | 45.8% | +12.7 |
| 39 | 42.1% | 45.7% | 39.3% | 16 / 35 | 10.0% | 10.7% | 27 | 0 | 1.50 / 19.4 | 44.0% | -1.9 |
| 40 | 43.8% | 48.6% | 40.2% | 17 / 35 | 8.2% | 9.5% | 27 | 0 | 1.51 / 160.6 | 45.1% | -1.3 |
| 41 | 53.3% | 67.6% | 39.6% | 24 / 35 | 9.6% | 10.4% | 26 | 0 | 1.52 / 20.6 | 53.2% | +0.1 |
| 42 | 49.6% | 60.0% | 39.5% | 21 / 35 | 9.1% | 10.7% | 25 | 0 | 1.54 / 20.1 | 56.4% | -6.8 |
| 43 | 47.7% | 57.1% | 38.5% | 20 / 35 | 10.7% | 9.8% | 29 | 0 | 1.51 / 20.6 | 42.7% | +5.0 |
| 44 | 55.2% | 68.6% | 41.2% | 24 / 35 | 9.9% | 10.1% | 35 | 0 | 1.54 / 21.2 | 50.9% | +4.3 |
| 45 | 52.9% | 57.1% | 49.1% | 20 / 35 | 11.8% | 10.7% | 20 | 0 | 1.49 / 16.7 | 47.8% | +5.1 |
| 46 | 54.6% | 60.0% | 49.5% | 21 / 35 | 10.3% | 9.7% | 23 | 0 | 1.41 / 16.7 | 48.5% | +6.1 |
| 47 | 49.9% | 60.0% | 40.3% | 21 / 35 | 9.1% | 10.4% | 33 | 0 | 1.51 / 20.3 | 50.6% | -0.7 |
| 48 | 50.5% | 60.0% | 40.9% | 21 / 35 | 8.3% | 9.6% | 31 | 0 | 1.54 / 20.5 | 51.4% | -1.0 |
| 49 | 50.2% | 60.0% | 41.4% | 21 / 35 | 8.9% | 10.0% | 31 | 0 | 1.50 / 21.0 | 44.8% | +5.4 |
| 50 | 40.2% | 45.7% | 35.0% | 16 / 35 | 7.1% | 10.3% | 22 | 0 | 1.50 / 19.7 | 48.1% | -7.9 |
| 51 | 46.4% | 57.1% | 36.0% | 20 / 35 | 8.4% | 10.1% | 28 | 0 | 1.48 / 22.5 | 44.4% | +2.0 |
| 52 | 45.7% | 54.3% | 37.0% | 19 / 35 | 7.8% | 10.4% | 28 | 0 | 1.49 / 195.3 | 37.6% | +8.1 |
| 53 | 47.0% | 45.7% | 48.5% | 16 / 35 | 12.5% | 10.2% | 26 | 0 | 1.46 / 16.4 | 47.5% | -0.5 |
| 54 | 44.7% | 51.4% | 39.0% | 18 / 35 | 8.7% | 10.9% | 28 | 0 | 1.52 / 81.4 | 51.6% | -6.9 |
| 55 | 43.1% | 50.0% | 37.2% | 18 / 35 | 10.2% | 11.2% | 29 | 0 | 1.51 / 17.6 | 45.5% | -2.4 |
| 56 | 48.6% | 57.1% | 40.5% | 20 / 35 | 10.3% | 10.7% | 24 | 0 | 1.50 / 18.7 | 48.8% | -0.2 |
| 57 | 53.5% | 65.7% | 39.7% | 23 / 35 | 8.2% | 9.4% | 33 | 0 | 1.52 / 20.6 | 46.7% | +6.8 |
| 58 | 48.8% | 62.9% | 34.2% | 22 / 35 | 7.7% | 10.2% | 30 | 0 | 1.47 / 19.7 | 56.9% | -8.1 |
| 59 | 49.8% | 62.9% | 37.4% | 22 / 35 | 8.5% | 10.7% | 23 | 0 | 1.50 / 20.9 | 52.9% | -3.1 |
| 60 | 40.1% | 45.7% | 34.7% | 16 / 35 | 8.0% | 10.1% | 24 | 0 | 1.52 / 19.9 | 54.9% | -14.7 |
| 61 | 52.4% | 65.7% | 39.8% | 23 / 35 | 8.1% | 10.3% | 39 | 0 | 1.53 / 22.0 | 66.0% | -13.5 |
| 62 | 53.9% | 61.8% | 46.5% | 22 / 35 | 11.2% | 10.3% | 35 | 0 | 1.48 / 19.0 | 36.4% | +17.6 |
| 63 | 45.7% | 45.7% | 46.5% | 16 / 35 | 11.1% | 10.3% | 18 | 0 | 1.50 / 16.3 | 47.3% | -1.7 |
| 64 | 49.1% | 60.0% | 38.9% | 21 / 35 | 9.7% | 11.0% | 29 | 0 | 1.53 / 21.0 | 48.8% | +0.3 |
| 65 | 51.2% | 61.8% | 40.2% | 22 / 35 | 7.9% | 9.7% | 26 | 0 | 1.57 / 18.9 | 57.1% | -5.9 |
| 66 | 55.0% | 64.7% | 46.8% | 23 / 35 | 10.5% | 11.2% | 24 | 0 | 1.51 / 19.0 | 55.0% | -0.0 |
| 67 | 54.9% | 60.0% | 50.5% | 21 / 35 | 11.8% | 9.9% | 24 | 0 | 1.53 / 16.3 | 53.2% | +1.7 |
| 68 | 43.0% | 51.4% | 35.0% | 18 / 35 | 7.3% | 9.5% | 23 | 0 | 1.51 / 107.5 | 62.7% | -19.8 |
| 69 | 49.5% | 60.0% | 39.3% | 21 / 35 | 10.0% | 9.8% | 31 | 0 | 1.53 / 19.1 | 51.3% | -1.8 |
| 70 | 52.6% | 62.9% | 42.6% | 22 / 35 | 8.4% | 10.4% | 40 | 0 | 1.52 / 19.7 | 43.8% | +8.7 |
| 71 | 42.9% | 51.4% | 34.5% | 18 / 35 | 8.1% | 10.3% | 32 | 0 | 1.51 / 19.1 | 43.8% | -0.9 |
| 72 | 42.2% | 48.6% | 36.7% | 17 / 35 | 8.2% | 10.2% | 33 | 0 | 1.53 / 19.4 | 37.8% | +4.4 |
| 73 | 35.5% | 42.9% | 29.2% | 15 / 35 | 6.9% | 10.8% | 27 | 0 | 1.48 / 18.9 | 46.7% | -11.2 |
| 74 | 33.1% | 34.3% | 32.9% | 12 / 35 | 7.7% | 9.7% | 32 | 0 | 1.45 / 18.8 | 50.0% | -17.0 |
| 75 | 41.9% | 48.6% | 35.4% | 17 / 35 | 8.3% | 9.8% | 28 | 0 | 1.50 / 19.0 | 49.5% | -7.5 |
| 76 | 47.1% | 57.1% | 37.5% | 20 / 35 | 7.8% | 9.5% | 28 | 0 | 1.50 / 319.9 | 53.4% | -6.3 |
| 77 | 45.6% | 51.4% | 40.7% | 18 / 35 | 9.4% | 10.0% | 28 | 0 | 1.43 / 20.4 | 54.0% | -8.4 |
| 78 | 53.3% | 65.7% | 41.2% | 23 / 35 | 9.6% | 10.0% | 29 | 0 | 1.49 / 20.3 | 53.9% | -0.6 |
| 79 | 54.5% | 60.0% | 49.6% | 21 / 35 | 11.8% | 10.4% | 19 | 0 | 1.47 / 17.2 | 46.5% | +8.1 |
| 80 | 50.7% | 62.9% | 39.3% | 22 / 35 | 9.4% | 11.2% | 30 | 0 | 1.47 / 19.5 | 49.7% | +1.0 |
| 81 | 43.9% | 51.4% | 37.0% | 18 / 35 | 8.0% | 10.0% | 30 | 0 | 1.52 / 165.4 | 49.3% | -5.4 |
| 82 | 46.3% | 51.4% | 42.1% | 18 / 35 | 10.3% | 11.0% | 19 | 0 | 1.50 / 18.4 | 55.3% | -9.0 |
| 83 | 43.0% | 45.7% | 40.7% | 16 / 35 | 10.2% | 10.4% | 37 | 0 | 1.49 / 680.8 | 48.5% | -5.5 |
| 84 | 44.0% | 51.4% | 36.3% | 18 / 35 | 8.0% | 9.8% | 28 | 0 | 1.44 / 123.8 | 52.9% | -8.9 |
| 85 | 47.2% | 54.3% | 41.7% | 19 / 35 | 11.1% | 10.9% | 23 | 0 | 1.52 / 206.3 | 49.5% | -2.3 |
| 86 | 47.9% | 51.4% | 45.0% | 18 / 35 | 12.0% | 10.4% | 22 | 0 | 1.50 / 16.3 | 45.8% | +2.1 |
| 87 | 60.6% | 65.7% | 55.3% | 23 / 35 | 11.7% | 9.6% | 18 | 0 | 1.54 / 16.8 | 45.5% | +15.0 |
| 88 | 46.5% | 57.1% | 36.0% | 20 / 35 | 7.6% | 10.3% | 27 | 0 | 1.51 / 20.7 | 54.8% | -8.3 |
| 89 | 46.8% | 57.1% | 37.2% | 20 / 35 | 8.2% | 10.6% | 36 | 0 | 1.50 / 20.6 | 52.0% | -5.2 |
| 90 | 47.9% | 55.9% | 39.9% | 20 / 35 | 7.7% | 9.9% | 33 | 0 | 1.49 / 18.7 | 40.6% | +7.4 |
| 91 | 57.1% | 68.6% | 45.9% | 24 / 35 | 11.1% | 10.4% | 27 | 0 | 1.54 / 19.2 | 47.5% | +9.6 |
| 92 | 53.9% | 58.8% | 49.4% | 21 / 35 | 11.1% | 11.1% | 10 | 0 | 1.36 / 18.2 | 39.5% | +14.3 |
| 93 | 42.3% | 48.6% | 36.3% | 17 / 35 | 7.7% | 10.3% | 22 | 0 | 1.54 / 18.5 | 52.4% | -10.2 |
| 94 | 54.7% | 68.6% | 40.5% | 24 / 35 | 9.2% | 10.2% | 29 | 0 | 1.46 / 328.3 | 60.0% | -5.4 |
| 95 | 56.6% | 71.4% | 40.3% | 25 / 35 | 10.1% | 10.3% | 32 | 0 | 1.50 / 19.9 | 54.2% | +2.5 |
| 96 | 54.3% | 68.6% | 40.1% | 24 / 35 | 8.2% | 9.9% | 33 | 0 | 1.53 / 19.8 | 53.7% | +0.6 |
| 97 | 48.0% | 60.0% | 36.0% | 21 / 35 | 8.5% | 10.0% | 34 | 0 | 1.47 / 356.5 | 37.3% | +10.7 |
| 98 | 42.0% | 48.6% | 35.3% | 17 / 35 | 7.3% | 9.7% | 21 | 0 | 1.45 / 257.5 | 48.1% | -6.2 |
| 99 | 51.6% | 60.0% | 42.3% | 21 / 35 | 8.6% | 9.2% | 20 | 0 | 1.52 / 73.3 | 50.0% | +1.7 |
| 100 | 44.5% | 51.4% | 39.0% | 18 / 35 | 9.9% | 10.9% | 38 | 0 | 1.46 / 18.9 | 47.7% | -3.2 |

Mean score share 49.2% ± 1.2, baseline 49.2% ± 1.1, paired diff -0.0 ± 1.5.

## Full report

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 2746 over 100 battles (27.5 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | rumble-12 | 49.2% ± 1.2 | 58.1% ± 1.6 | 40.7% ± 1.0 | 2036 / 3500 | 9.3% ± 0.3 | 10.2% ± 0.1 | 2746 | 0 | 1.57 / 680.8 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 100 | 62 | 557 | 0 | 0.78 | 37 | 36 | 0 |

62 of 100 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 480527 | 212 | 484312 | 480431 (100.0%) | 96 (0.0%) | 3881 (0.8%) | 36211 | 4534 | 2560 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| aw.Gilgalad 1.99.5c | 491074 | 51409 (10.5%) | 473679 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 650 | 480 | 650 | 1684 | 25.3 / 36.2 | 3896 | 331417 | 817 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 10.2% | 2746 | 107991 | 3 | 137.1 | 51322 / 51409 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| aw.Gilgalad 1.99.5c | aw.Gilgalad | 1 | 35 | 284 | 11.2% | 8.5% ± 1.1 | 10.1% | 21.9% / 22.1% | 4.5% | 0 / 0 | T3/M1 | 45% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
