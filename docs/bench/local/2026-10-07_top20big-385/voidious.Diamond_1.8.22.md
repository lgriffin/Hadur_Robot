# voidious.Diamond 1.8.22 (rumble-6) vs hadur2.Hadur 3.8.5

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 51.8% | 60.0% | 42.7% | 21 / 35 | 7.5% | 8.2% | 31 | 0 | 1.87 / 247.9 | 42.8% | +9.0 |
| 2 | 44.4% | 48.6% | 40.2% | 17 / 35 | 6.6% | 8.4% | 31 | 0 | 1.68 / 253.6 | 51.0% | -6.6 |
| 3 | 53.5% | 65.7% | 40.1% | 23 / 35 | 7.1% | 8.8% | 31 | 0 | 1.76 / 296.3 | 49.6% | +3.9 |
| 4 | 51.6% | 60.0% | 42.7% | 21 / 35 | 7.0% | 8.7% | 30 | 0 | 1.71 / 308.7 | 44.2% | +7.4 |
| 5 | 41.5% | 45.7% | 37.5% | 16 / 35 | 6.5% | 8.7% | 33 | 0 | 1.69 / 538.7 | 42.9% | -1.4 |
| 6 | 54.0% | 62.9% | 43.5% | 22 / 35 | 7.0% | 9.0% | 29 | 0 | 1.74 / 85.1 | 49.6% | +4.3 |
| 7 | 52.9% | 62.9% | 42.9% | 22 / 35 | 6.4% | 9.6% | 37 | 0 | 1.65 / 231.2 | 55.3% | -2.4 |
| 8 | 55.6% | 65.7% | 44.8% | 23 / 35 | 7.5% | 9.7% | 33 | 0 | 1.82 / 187.3 | 51.8% | +3.8 |
| 9 | 44.1% | 48.6% | 38.8% | 17 / 35 | 6.2% | 7.8% | 29 | 0 | 1.69 / 254.1 | 48.4% | -4.3 |
| 10 | 37.5% | 40.0% | 36.3% | 14 / 35 | 6.8% | 9.2% | 21 | 0 | 1.62 / 110.0 | 47.0% | -9.5 |
| 11 | 50.2% | 57.1% | 41.8% | 20 / 35 | 6.5% | 8.7% | 40 | 0 | 1.65 / 291.9 | 56.3% | -6.1 |
| 12 | 53.3% | 64.7% | 41.5% | 23 / 35 | 6.7% | 9.4% | 31 | 0 | 1.64 / 246.8 | 40.3% | +12.9 |
| 13 | 46.5% | 54.3% | 38.9% | 19 / 35 | 6.9% | 8.8% | 32 | 0 | 1.64 / 36.7 | 48.6% | -2.1 |
| 14 | 47.8% | 54.3% | 41.1% | 19 / 35 | 6.4% | 8.7% | 28 | 0 | 1.66 / 141.5 | 45.9% | +1.9 |
| 15 | 52.6% | 62.9% | 41.2% | 22 / 35 | 7.1% | 9.0% | 30 | 0 | 1.75 / 291.5 | 48.1% | +4.5 |
| 16 | 54.0% | 62.9% | 45.0% | 22 / 35 | 7.5% | 9.7% | 69 | 0 | 1.77 / 36.9 | 49.0% | +5.0 |
| 17 | 55.9% | 68.6% | 41.3% | 24 / 35 | 6.5% | 8.7% | 36 | 0 | 1.61 / 69.0 | 49.5% | +6.4 |
| 18 | 48.4% | 54.3% | 42.7% | 19 / 35 | 6.5% | 8.2% | 22 | 0 | 1.67 / 160.0 | 51.9% | -3.4 |
| 19 | 41.0% | 45.7% | 36.8% | 16 / 35 | 6.3% | 9.6% | 26 | 0 | 1.65 / 364.9 | 49.9% | -8.9 |
| 20 | 34.7% | 37.1% | 32.8% | 13 / 35 | 6.4% | 8.7% | 21 | 0 | 1.62 / 309.6 | 45.4% | -10.7 |
| 21 | 48.9% | 54.3% | 43.5% | 19 / 35 | 7.3% | 8.8% | 33 | 0 | 1.79 / 226.8 | 49.8% | -0.9 |
| 22 | 43.7% | 48.6% | 38.7% | 17 / 35 | 6.3% | 8.4% | 29 | 0 | 1.66 / 197.8 | 45.6% | -1.9 |
| 23 | 40.8% | 42.9% | 39.5% | 15 / 35 | 6.2% | 8.3% | 25 | 0 | 1.65 / 96.8 | 50.3% | -9.5 |
| 24 | 45.3% | 51.4% | 38.9% | 18 / 35 | 6.7% | 8.6% | 32 | 0 | 1.59 / 144.7 | 48.6% | -3.3 |
| 25 | 48.1% | 55.9% | 39.8% | 20 / 35 | 6.0% | 8.2% | 24 | 0 | 1.66 / 269.9 | 43.7% | +4.4 |
| 26 | 48.6% | 57.1% | 38.8% | 20 / 35 | 6.8% | 8.8% | 28 | 0 | 1.59 / 238.9 | 47.1% | +1.5 |
| 27 | 55.6% | 68.6% | 41.8% | 24 / 35 | 7.8% | 8.9% | 23 | 0 | 1.69 / 56.8 | 46.3% | +9.4 |
| 28 | 45.8% | 51.4% | 40.2% | 18 / 35 | 5.8% | 8.8% | 33 | 0 | 1.65 / 218.0 | 59.5% | -13.7 |
| 29 | 50.0% | 60.0% | 39.1% | 21 / 35 | 6.7% | 8.4% | 28 | 0 | 1.60 / 275.1 | 45.3% | +4.8 |
| 30 | 51.1% | 60.0% | 40.9% | 21 / 35 | 6.0% | 8.8% | 32 | 0 | 1.60 / 234.3 | 45.1% | +6.0 |
| 31 | 46.4% | 51.4% | 40.9% | 18 / 35 | 6.7% | 8.6% | 28 | 0 | 1.69 / 317.9 | 44.8% | +1.6 |
| 32 | 53.6% | 61.8% | 44.1% | 22 / 35 | 6.6% | 8.8% | 30 | 0 | 1.63 / 149.8 | 40.2% | +13.4 |
| 33 | 46.2% | 54.3% | 37.7% | 19 / 35 | 6.2% | 8.8% | 27 | 0 | 1.63 / 204.2 | 46.9% | -0.7 |
| 34 | 40.3% | 45.7% | 34.6% | 16 / 35 | 6.0% | 8.2% | 26 | 0 | 1.59 / 255.1 | 47.3% | -7.0 |
| 35 | 41.1% | 45.7% | 37.5% | 16 / 35 | 6.5% | 8.6% | 31 | 0 | 1.68 / 323.2 | 46.0% | -4.9 |
| 36 | 59.7% | 71.4% | 46.3% | 25 / 35 | 7.1% | 8.9% | 29 | 0 | 1.68 / 67.4 | 50.7% | +9.0 |
| 37 | 55.5% | 68.6% | 41.8% | 24 / 35 | 6.8% | 9.1% | 32 | 0 | 1.73 / 241.9 | 34.7% | +20.9 |
| 38 | 42.5% | 45.7% | 40.4% | 16 / 35 | 6.6% | 9.5% | 30 | 0 | 1.64 / 137.8 | 48.6% | -6.2 |
| 39 | 52.7% | 61.8% | 42.4% | 22 / 35 | 7.0% | 8.4% | 38 | 0 | 1.66 / 216.8 | 51.7% | +1.1 |
| 40 | 52.3% | 62.9% | 40.4% | 22 / 35 | 6.9% | 9.0% | 30 | 0 | 1.63 / 38.9 | 49.5% | +2.8 |
| 41 | 49.4% | 57.1% | 41.0% | 20 / 35 | 6.8% | 8.8% | 34 | 0 | 1.66 / 240.9 | 54.1% | -4.7 |
| 42 | 50.3% | 60.0% | 40.2% | 21 / 35 | 6.7% | 9.4% | 37 | 0 | 1.69 / 38.3 | 47.2% | +3.1 |
| 43 | 41.4% | 42.9% | 40.5% | 15 / 35 | 6.7% | 9.2% | 28 | 0 | 1.61 / 507.8 | 46.4% | -5.0 |
| 44 | 40.4% | 45.7% | 34.5% | 16 / 35 | 5.6% | 8.4% | 32 | 0 | 1.68 / 115.0 | 51.6% | -11.1 |
| 45 | 48.3% | 57.1% | 38.2% | 20 / 35 | 6.6% | 8.4% | 26 | 0 | 1.63 / 231.3 | 41.7% | +6.6 |
| 46 | 45.2% | 51.4% | 39.3% | 18 / 35 | 6.5% | 8.7% | 26 | 0 | 1.63 / 39.6 | 40.5% | +4.7 |
| 47 | 46.6% | 54.3% | 38.0% | 19 / 35 | 6.5% | 8.9% | 30 | 0 | 1.61 / 42.0 | 57.4% | -10.9 |
| 48 | 51.1% | 62.9% | 39.5% | 22 / 35 | 7.1% | 8.5% | 32 | 0 | 1.67 / 35.0 | 46.6% | +4.5 |
| 49 | 41.8% | 42.9% | 41.0% | 15 / 35 | 6.7% | 8.6% | 31 | 0 | 1.62 / 36.2 | 45.5% | -3.7 |
| 50 | 43.1% | 45.7% | 41.0% | 16 / 35 | 6.8% | 9.4% | 28 | 0 | 1.72 / 36.0 | 40.2% | +2.9 |
| 51 | 51.5% | 60.0% | 43.4% | 21 / 35 | 6.8% | 9.0% | 41 | 0 | 1.62 / 39.6 | 50.9% | +0.7 |
| 52 | 47.6% | 54.3% | 40.8% | 19 / 35 | 7.1% | 8.8% | 35 | 0 | 1.70 / 38.4 | 45.6% | +2.0 |
| 53 | 43.8% | 50.0% | 38.3% | 18 / 35 | 6.5% | 9.4% | 30 | 0 | 1.64 / 39.2 | 51.4% | -7.5 |
| 54 | 51.2% | 60.0% | 41.0% | 21 / 35 | 6.1% | 8.6% | 32 | 0 | 1.60 / 36.2 | 41.5% | +9.8 |
| 55 | 46.9% | 54.3% | 39.0% | 19 / 35 | 6.6% | 9.0% | 33 | 0 | 1.58 / 36.9 | 50.0% | -3.1 |
| 56 | 42.9% | 48.6% | 36.3% | 17 / 35 | 5.8% | 8.4% | 22 | 0 | 1.59 / 35.1 | 36.3% | +6.6 |
| 57 | 39.8% | 45.7% | 34.7% | 16 / 35 | 6.0% | 8.9% | 32 | 0 | 1.66 / 36.8 | 47.4% | -7.7 |
| 58 | 45.9% | 51.4% | 39.8% | 18 / 35 | 6.9% | 8.3% | 24 | 0 | 1.70 / 36.8 | 50.9% | -5.0 |
| 59 | 43.4% | 48.6% | 38.1% | 17 / 35 | 6.2% | 9.0% | 23 | 0 | 1.66 / 37.5 | 50.4% | -7.0 |
| 60 | 49.6% | 57.1% | 42.4% | 20 / 35 | 6.7% | 8.7% | 20 | 0 | 1.64 / 39.0 | 56.9% | -7.3 |
| 61 | 43.9% | 51.4% | 35.4% | 18 / 35 | 6.1% | 8.9% | 28 | 0 | 1.65 / 165.0 | 33.5% | +10.4 |
| 62 | 39.1% | 42.9% | 36.2% | 15 / 35 | 6.8% | 8.6% | 22 | 0 | 1.65 / 38.7 | 51.2% | -12.2 |
| 63 | 53.4% | 65.7% | 40.0% | 23 / 35 | 7.3% | 8.8% | 34 | 0 | 1.67 / 39.0 | 44.1% | +9.3 |
| 64 | 42.6% | 47.1% | 39.0% | 17 / 35 | 6.6% | 9.0% | 30 | 0 | 1.66 / 36.5 | 47.2% | -4.6 |
| 65 | 55.4% | 65.7% | 44.2% | 23 / 35 | 7.0% | 9.1% | 33 | 0 | 1.61 / 40.8 | 48.0% | +7.4 |
| 66 | 35.0% | 37.1% | 34.4% | 13 / 35 | 6.1% | 8.8% | 23 | 0 | 1.57 / 39.3 | 48.6% | -13.6 |
| 67 | 59.5% | 71.4% | 46.0% | 25 / 35 | 7.1% | 8.9% | 27 | 0 | 1.77 / 49.9 | 63.0% | -3.5 |
| 68 | 54.6% | 62.9% | 44.4% | 22 / 35 | 7.1% | 8.3% | 39 | 0 | 1.61 / 41.5 | 45.5% | +9.2 |
| 69 | 58.0% | 71.4% | 43.4% | 25 / 35 | 7.2% | 8.9% | 31 | 0 | 1.63 / 64.4 | 41.5% | +16.5 |
| 70 | 45.2% | 51.4% | 38.5% | 18 / 35 | 6.5% | 8.5% | 30 | 0 | 1.76 / 77.0 | 43.0% | +2.3 |
| 71 | 47.8% | 54.3% | 40.2% | 19 / 35 | 6.9% | 8.2% | 30 | 0 | 1.71 / 37.9 | 55.8% | -8.0 |
| 72 | 52.8% | 62.9% | 41.8% | 22 / 35 | 6.7% | 8.3% | 32 | 0 | 1.56 / 38.2 | 43.4% | +9.4 |
| 73 | 49.4% | 57.1% | 41.7% | 20 / 35 | 7.1% | 9.7% | 24 | 0 | 1.68 / 38.7 | 45.5% | +3.9 |
| 74 | 52.5% | 61.8% | 42.2% | 22 / 35 | 7.0% | 8.0% | 29 | 0 | 1.62 / 37.0 | 51.2% | +1.2 |
| 75 | 45.0% | 51.4% | 38.5% | 18 / 35 | 6.3% | 8.7% | 23 | 0 | 1.67 / 37.8 | 38.4% | +6.7 |
| 76 | 57.9% | 68.6% | 44.9% | 24 / 35 | 6.8% | 8.3% | 33 | 0 | 1.65 / 37.7 | 48.5% | +9.4 |
| 77 | 47.4% | 51.4% | 43.9% | 18 / 35 | 7.3% | 9.0% | 32 | 0 | 1.69 / 99.7 | 55.1% | -7.7 |
| 78 | 45.3% | 52.9% | 38.5% | 19 / 35 | 7.1% | 9.2% | 26 | 0 | 1.58 / 37.1 | 50.6% | -5.3 |
| 79 | 57.0% | 68.6% | 44.5% | 24 / 35 | 6.9% | 8.4% | 33 | 0 | 1.70 / 41.2 | 54.8% | +2.2 |
| 80 | 40.8% | 45.7% | 36.1% | 16 / 35 | 5.3% | 7.7% | 25 | 0 | 1.62 / 37.0 | 47.6% | -6.8 |
| 81 | 46.8% | 54.3% | 38.6% | 19 / 35 | 6.9% | 9.3% | 30 | 0 | 1.65 / 39.4 | 48.1% | -1.3 |
| 82 | 46.7% | 54.3% | 38.9% | 19 / 35 | 7.0% | 8.8% | 34 | 0 | 1.61 / 42.8 | 45.5% | +1.1 |
| 83 | 59.1% | 71.4% | 44.5% | 25 / 35 | 7.4% | 8.4% | 28 | 0 | 1.75 / 37.2 | 49.8% | +9.3 |
| 84 | 52.6% | 62.9% | 42.3% | 22 / 35 | 7.0% | 9.8% | 34 | 0 | 1.70 / 37.6 | 50.0% | +2.6 |
| 85 | 60.1% | 71.4% | 47.0% | 25 / 35 | 7.5% | 8.4% | 35 | 0 | 1.73 / 35.3 | 51.6% | +8.5 |
| 86 | 41.6% | 45.7% | 38.5% | 16 / 35 | 6.6% | 8.5% | 24 | 0 | 1.60 / 40.4 | 48.9% | -7.2 |
| 87 | 37.5% | 42.9% | 32.5% | 15 / 35 | 5.7% | 8.4% | 23 | 0 | 1.64 / 37.7 | 57.4% | -19.9 |
| 88 | 50.0% | 60.0% | 38.9% | 21 / 35 | 6.7% | 8.6% | 30 | 0 | 1.61 / 38.5 | 57.3% | -7.3 |
| 89 | 46.5% | 54.3% | 38.4% | 19 / 35 | 6.7% | 8.4% | 30 | 0 | 1.65 / 38.2 | 50.9% | -4.4 |
| 90 | 43.0% | 45.7% | 41.2% | 16 / 35 | 6.6% | 8.6% | 26 | 0 | 1.65 / 38.4 | 57.4% | -14.4 |
| 91 | 47.2% | 54.5% | 39.7% | 20 / 35 | 6.7% | 8.4% | 32 | 0 | 1.62 / 37.8 | 53.4% | -6.1 |
| 92 | 50.5% | 60.0% | 40.2% | 21 / 35 | 6.9% | 8.6% | 29 | 0 | 1.62 / 42.4 | 55.6% | -5.1 |
| 93 | 40.0% | 45.7% | 34.5% | 16 / 35 | 6.6% | 8.2% | 24 | 0 | 1.63 / 35.7 | 52.9% | -12.8 |
| 94 | 51.6% | 60.0% | 42.0% | 21 / 35 | 7.1% | 8.5% | 23 | 0 | 1.70 / 36.5 | 45.6% | +6.0 |
| 95 | 43.9% | 48.6% | 39.8% | 17 / 35 | 6.6% | 8.3% | 26 | 0 | 1.61 / 35.7 | 46.8% | -2.9 |
| 96 | 54.3% | 62.9% | 44.4% | 22 / 35 | 7.0% | 8.4% | 33 | 0 | 1.65 / 38.0 | 46.2% | +8.1 |
| 97 | 53.6% | 65.7% | 39.5% | 23 / 35 | 6.9% | 8.3% | 33 | 0 | 1.63 / 36.8 | 41.7% | +11.9 |
| 98 | 36.3% | 37.1% | 36.2% | 13 / 35 | 5.9% | 8.4% | 25 | 0 | 1.62 / 43.0 | 47.0% | -10.7 |
| 99 | 49.3% | 57.1% | 41.3% | 20 / 35 | 6.0% | 8.4% | 23 | 0 | 1.69 / 35.4 | 46.5% | +2.9 |
| 100 | 48.5% | 55.9% | 40.3% | 20 / 35 | 6.9% | 8.5% | 24 | 0 | 1.70 / 37.0 | 51.9% | -3.4 |

Mean score share 48.0% ± 1.2, baseline 48.2% ± 1.0, paired diff -0.2 ± 1.5.

## Full report

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 2974 over 100 battles (29.7 per battle, most in one battle 69). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | rumble-6 | 48.0% ± 1.2 | 55.4% ± 1.7 | 40.2% ± 0.6 | 1945 / 3500 | 6.7% ± 0.1 | 8.7% ± 0.1 | 2974 | 0 | 1.87 / 538.7 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | 100 | 42 | 1349 | 1 | 0.85 | 56 | 54 | 0 |

42 of 100 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | 770102 | 15808 | 797307 | 769666 (99.9%) | 436 (0.1%) | 27641 (3.5%) | 47335 | 4709 | 3340 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| voidious.Diamond 1.8.22 | 777227 | 83114 (10.7%) | 758925 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | 650 | 536 | 650 | 2613 | 21.3 / 31.6 | 1792 | 240562 | 3969 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | 8.7% | 2974 | 28885 | 3 | 225.0 | 82917 / 83114 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| voidious.Diamond 1.8.22 | voidious.Diamond | 1 | 35 | 302 | 8.7% | 7.4% ± 0.9 | 7.2% | 23.0% / 21.5% | 9.3% | 0 / 0 | T3/M1 | 48% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
