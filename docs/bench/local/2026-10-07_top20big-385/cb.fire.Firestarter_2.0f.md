# cb.fire.Firestarter 2.0f (rumble-7) vs hadur2.Hadur 3.8.5

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 47.2% | 42.9% | 52.1% | 15 / 35 | 8.2% | 8.8% | 35 | 0 | 1.68 / 27.4 | 50.9% | -3.7 |
| 2 | 52.4% | 54.3% | 50.5% | 19 / 35 | 8.0% | 8.4% | 28 | 0 | 1.69 / 60.4 | 37.4% | +15.0 |
| 3 | 47.6% | 45.7% | 50.1% | 16 / 35 | 9.2% | 9.2% | 17 | 0 | 1.59 / 28.6 | 50.3% | -2.7 |
| 4 | 52.4% | 51.4% | 53.4% | 18 / 35 | 8.5% | 9.1% | 23 | 0 | 1.75 / 88.9 | 51.9% | +0.5 |
| 5 | 44.8% | 40.0% | 50.8% | 14 / 35 | 8.0% | 8.7% | 29 | 0 | 1.69 / 26.2 | 50.7% | -5.9 |
| 6 | 53.6% | 54.3% | 52.9% | 19 / 35 | 8.2% | 8.6% | 36 | 0 | 1.73 / 30.8 | 58.4% | -4.7 |
| 7 | 51.2% | 52.9% | 49.4% | 19 / 35 | 8.0% | 8.4% | 30 | 0 | 1.72 / 95.5 | 56.3% | -5.1 |
| 8 | 54.0% | 54.3% | 53.5% | 19 / 35 | 8.2% | 8.6% | 31 | 0 | 1.71 / 25.3 | 50.2% | +3.7 |
| 9 | 54.2% | 54.3% | 54.1% | 19 / 35 | 8.2% | 8.4% | 31 | 0 | 1.69 / 26.8 | 43.1% | +11.1 |
| 10 | 44.8% | 40.0% | 49.7% | 14 / 35 | 8.0% | 8.3% | 22 | 0 | 1.75 / 26.3 | 52.8% | -8.0 |
| 11 | 65.3% | 71.4% | 57.7% | 25 / 35 | 8.7% | 8.2% | 36 | 0 | 1.74 / 46.8 | 47.2% | +18.1 |
| 12 | 49.8% | 48.6% | 50.8% | 17 / 35 | 8.1% | 8.1% | 36 | 0 | 1.67 / 26.8 | 41.8% | +8.0 |
| 13 | 41.1% | 34.3% | 49.0% | 12 / 35 | 8.1% | 8.3% | 26 | 0 | 1.80 / 28.6 | 34.6% | +6.5 |
| 14 | 53.2% | 51.4% | 55.3% | 18 / 35 | 8.9% | 8.6% | 31 | 0 | 1.77 / 27.3 | 51.1% | +2.1 |
| 15 | 54.6% | 55.9% | 53.2% | 20 / 35 | 8.3% | 8.5% | 36 | 0 | 1.71 / 26.9 | 46.7% | +7.9 |
| 16 | 48.4% | 45.7% | 50.8% | 16 / 35 | 8.4% | 8.2% | 28 | 0 | 1.74 / 31.0 | 40.5% | +7.9 |
| 17 | 40.4% | 37.1% | 45.3% | 13 / 35 | 7.2% | 8.1% | 23 | 0 | 1.75 / 27.1 | 47.0% | -6.7 |
| 18 | 55.5% | 57.1% | 53.7% | 20 / 35 | 7.9% | 8.3% | 28 | 0 | 1.76 / 24.5 | 54.9% | +0.6 |
| 19 | 43.1% | 40.0% | 47.2% | 14 / 35 | 8.6% | 9.3% | 39 | 0 | 1.73 / 23.2 | 46.8% | -3.7 |
| 20 | 50.5% | 51.4% | 49.5% | 18 / 35 | 8.3% | 8.7% | 34 | 0 | 1.75 / 26.2 | 51.3% | -0.8 |
| 21 | 52.5% | 54.3% | 50.7% | 19 / 35 | 7.8% | 8.2% | 35 | 0 | 1.74 / 28.0 | 50.3% | +2.2 |
| 22 | 51.2% | 51.4% | 50.6% | 18 / 35 | 8.1% | 8.6% | 37 | 0 | 1.67 / 28.1 | 45.3% | +5.9 |
| 23 | 45.4% | 42.9% | 48.4% | 15 / 35 | 7.6% | 8.0% | 33 | 0 | 1.77 / 27.0 | 55.1% | -9.7 |
| 24 | 46.6% | 42.9% | 50.9% | 15 / 35 | 7.8% | 7.9% | 29 | 0 | 1.65 / 68.0 | 51.9% | -5.3 |
| 25 | 47.3% | 42.9% | 52.3% | 15 / 35 | 7.4% | 7.8% | 24 | 0 | 1.77 / 29.1 | 51.6% | -4.3 |
| 26 | 41.8% | 37.1% | 47.2% | 13 / 35 | 7.7% | 8.7% | 25 | 0 | 1.69 / 28.6 | 48.2% | -6.4 |
| 27 | 49.9% | 48.6% | 51.3% | 17 / 35 | 8.3% | 8.4% | 29 | 0 | 1.75 / 25.4 | 49.1% | +0.7 |
| 28 | 45.0% | 42.9% | 47.6% | 15 / 35 | 7.3% | 8.1% | 26 | 0 | 1.69 / 26.0 | 50.5% | -5.5 |
| 29 | 50.8% | 51.4% | 50.7% | 18 / 35 | 8.3% | 8.3% | 26 | 0 | 1.71 / 25.8 | 46.8% | +4.0 |
| 30 | 50.1% | 48.6% | 52.2% | 17 / 35 | 7.6% | 8.7% | 30 | 0 | 1.75 / 26.5 | 55.3% | -5.3 |
| 31 | 47.0% | 42.9% | 51.2% | 15 / 35 | 8.4% | 8.9% | 33 | 0 | 1.71 / 26.2 | 54.8% | -7.8 |
| 32 | 44.1% | 40.0% | 48.4% | 14 / 35 | 8.0% | 8.8% | 34 | 0 | 1.73 / 43.9 | 48.4% | -4.3 |
| 33 | 50.9% | 48.6% | 53.4% | 17 / 35 | 8.3% | 8.4% | 34 | 0 | 1.72 / 25.8 | 47.5% | +3.4 |
| 34 | 47.4% | 42.9% | 53.4% | 15 / 35 | 7.9% | 8.2% | 20 | 0 | 1.76 / 32.9 | 44.8% | +2.6 |
| 35 | 47.7% | 45.7% | 49.8% | 16 / 35 | 7.7% | 8.0% | 33 | 0 | 1.74 / 55.1 | 49.5% | -1.9 |
| 36 | 44.2% | 40.0% | 49.4% | 14 / 35 | 8.0% | 8.8% | 29 | 0 | 1.70 / 27.0 | 47.3% | -3.2 |
| 37 | 54.3% | 54.3% | 54.2% | 19 / 35 | 8.2% | 8.1% | 33 | 0 | 1.70 / 26.1 | 52.3% | +2.0 |
| 38 | 44.4% | 40.0% | 50.1% | 14 / 35 | 7.6% | 7.9% | 29 | 0 | 1.78 / 27.1 | 54.9% | -10.5 |
| 39 | 56.3% | 61.8% | 50.2% | 22 / 35 | 8.2% | 8.7% | 34 | 0 | 1.73 / 27.1 | 52.6% | +3.7 |
| 40 | 51.3% | 51.4% | 51.9% | 18 / 35 | 8.9% | 8.6% | 28 | 0 | 1.76 / 27.6 | 51.1% | +0.2 |
| 41 | 60.7% | 62.9% | 58.3% | 22 / 35 | 8.4% | 7.6% | 35 | 0 | 1.68 / 29.9 | 56.1% | +4.6 |
| 42 | 53.4% | 50.0% | 56.5% | 18 / 35 | 8.6% | 8.4% | 37 | 0 | 1.71 / 28.0 | 49.4% | +4.1 |
| 43 | 57.9% | 60.0% | 55.2% | 21 / 35 | 8.9% | 8.7% | 37 | 0 | 1.75 / 33.0 | 53.2% | +4.7 |
| 44 | 53.8% | 54.3% | 53.3% | 19 / 35 | 8.1% | 7.8% | 31 | 0 | 1.72 / 25.7 | 47.1% | +6.7 |
| 45 | 49.7% | 45.7% | 53.7% | 16 / 35 | 8.0% | 8.1% | 31 | 0 | 1.78 / 26.3 | 45.0% | +4.7 |
| 46 | 44.7% | 42.9% | 47.2% | 15 / 35 | 7.8% | 7.9% | 20 | 0 | 1.80 / 24.7 | 47.0% | -2.3 |
| 47 | 46.1% | 40.0% | 52.4% | 14 / 35 | 8.6% | 9.1% | 38 | 0 | 1.73 / 43.6 | 58.8% | -12.7 |
| 48 | 44.2% | 40.0% | 48.7% | 14 / 35 | 7.7% | 9.0% | 36 | 0 | 1.75 / 25.6 | 51.8% | -7.7 |
| 49 | 47.0% | 40.0% | 54.3% | 14 / 35 | 8.5% | 8.9% | 30 | 0 | 1.70 / 28.9 | 55.5% | -8.5 |
| 50 | 58.2% | 60.0% | 56.3% | 21 / 35 | 9.1% | 8.4% | 36 | 0 | 1.68 / 29.1 | 51.2% | +6.9 |
| 51 | 49.8% | 48.6% | 51.6% | 17 / 35 | 8.0% | 8.2% | 31 | 0 | 1.74 / 26.5 | 43.9% | +5.9 |
| 52 | 50.4% | 48.6% | 52.4% | 17 / 35 | 8.1% | 8.1% | 37 | 0 | 1.75 / 173.8 | 45.9% | +4.5 |
| 53 | 39.9% | 31.4% | 49.5% | 11 / 35 | 9.0% | 8.8% | 33 | 0 | 1.74 / 28.5 | 49.5% | -9.6 |
| 54 | 56.1% | 57.1% | 54.7% | 20 / 35 | 8.6% | 8.3% | 35 | 0 | 1.81 / 26.1 | 49.6% | +6.5 |
| 55 | 46.5% | 42.9% | 50.6% | 15 / 35 | 7.3% | 8.2% | 37 | 0 | 1.71 / 33.8 | 56.3% | -9.8 |
| 56 | 51.5% | 51.4% | 52.2% | 18 / 35 | 8.2% | 8.9% | 32 | 0 | 1.72 / 25.8 | 50.7% | +0.7 |
| 57 | 52.9% | 51.4% | 54.2% | 18 / 35 | 8.5% | 8.4% | 34 | 0 | 1.80 / 25.8 | 39.5% | +13.4 |
| 58 | 52.9% | 51.4% | 53.9% | 18 / 35 | 8.1% | 8.6% | 40 | 0 | 1.70 / 27.5 | 53.9% | -1.0 |
| 59 | 48.7% | 42.9% | 55.5% | 15 / 35 | 9.0% | 8.9% | 23 | 0 | 1.71 / 31.0 | 54.5% | -5.7 |
| 60 | 40.9% | 37.1% | 46.3% | 13 / 35 | 7.7% | 9.0% | 21 | 0 | 1.69 / 27.7 | 54.7% | -13.8 |
| 61 | 65.0% | 71.4% | 58.3% | 25 / 35 | 9.1% | 8.5% | 32 | 0 | 1.74 / 26.5 | 53.8% | +11.2 |
| 62 | 54.4% | 54.3% | 54.6% | 19 / 35 | 8.6% | 7.9% | 36 | 0 | 1.76 / 27.0 | 53.5% | +1.0 |
| 63 | 49.4% | 45.7% | 53.2% | 16 / 35 | 8.5% | 8.3% | 29 | 0 | 1.70 / 68.2 | 50.3% | -0.9 |
| 64 | 49.0% | 48.6% | 50.3% | 17 / 35 | 8.5% | 8.6% | 31 | 0 | 1.74 / 27.2 | 54.1% | -5.1 |
| 65 | 56.3% | 60.0% | 52.8% | 21 / 35 | 8.8% | 8.8% | 35 | 0 | 1.74 / 24.9 | 55.6% | +0.7 |
| 66 | 47.0% | 42.9% | 51.3% | 15 / 35 | 7.6% | 8.2% | 27 | 0 | 1.77 / 30.5 | 53.3% | -6.3 |
| 67 | 58.5% | 62.9% | 53.2% | 22 / 35 | 8.6% | 8.0% | 57 | 0 | 1.79 / 30.1 | 49.0% | +9.6 |
| 68 | 53.8% | 54.3% | 53.4% | 19 / 35 | 7.9% | 8.6% | 34 | 0 | 1.75 / 29.7 | 48.6% | +5.2 |
| 69 | 55.9% | 60.0% | 52.0% | 21 / 35 | 8.4% | 9.3% | 40 | 0 | 1.74 / 54.8 | 49.2% | +6.7 |
| 70 | 48.9% | 42.9% | 54.4% | 15 / 35 | 9.0% | 8.4% | 28 | 0 | 1.73 / 27.8 | 51.6% | -2.7 |
| 71 | 49.1% | 45.7% | 52.2% | 16 / 35 | 8.2% | 8.5% | 29 | 0 | 1.79 / 27.0 | 52.3% | -3.2 |
| 72 | 71.0% | 82.9% | 57.8% | 29 / 35 | 8.8% | 7.8% | 36 | 0 | 1.76 / 28.4 | 49.2% | +21.9 |
| 73 | 35.6% | 28.6% | 43.8% | 10 / 35 | 7.5% | 9.5% | 21 | 0 | 1.76 / 31.9 | 53.0% | -17.4 |
| 74 | 50.9% | 48.6% | 53.2% | 17 / 35 | 8.6% | 8.6% | 28 | 0 | 1.73 / 53.3 | 52.0% | -1.1 |
| 75 | 38.2% | 31.4% | 47.2% | 11 / 35 | 7.6% | 8.3% | 26 | 0 | 1.75 / 24.6 | 49.5% | -11.3 |
| 76 | 50.3% | 48.6% | 52.2% | 17 / 35 | 8.5% | 8.8% | 31 | 0 | 1.84 / 24.8 | 47.3% | +2.9 |
| 77 | 52.2% | 48.6% | 55.7% | 17 / 35 | 8.5% | 8.5% | 31 | 0 | 1.64 / 26.5 | 45.7% | +6.5 |
| 78 | 51.4% | 48.6% | 54.3% | 17 / 35 | 8.6% | 8.3% | 39 | 0 | 1.74 / 28.3 | 57.8% | -6.4 |
| 79 | 52.3% | 51.4% | 53.4% | 18 / 35 | 7.9% | 7.8% | 25 | 0 | 1.70 / 25.1 | 48.2% | +4.2 |
| 80 | 44.5% | 40.0% | 49.8% | 14 / 35 | 7.6% | 8.7% | 28 | 0 | 1.71 / 25.2 | 42.5% | +2.0 |
| 81 | 57.8% | 62.9% | 52.7% | 22 / 35 | 8.3% | 8.3% | 38 | 0 | 1.74 / 30.3 | 51.7% | +6.1 |
| 82 | 48.7% | 45.7% | 51.9% | 16 / 35 | 8.1% | 7.6% | 32 | 0 | 1.80 / 28.5 | 41.3% | +7.4 |
| 83 | 48.0% | 45.7% | 51.1% | 16 / 35 | 7.3% | 8.1% | 39 | 0 | 1.76 / 29.7 | 42.3% | +5.6 |
| 84 | 48.6% | 48.6% | 49.8% | 17 / 35 | 8.3% | 8.6% | 31 | 0 | 1.72 / 66.3 | 53.5% | -4.9 |
| 85 | 53.3% | 54.3% | 52.3% | 19 / 35 | 8.6% | 8.1% | 31 | 0 | 1.67 / 27.5 | 43.5% | +9.7 |
| 86 | 50.0% | 48.6% | 52.0% | 17 / 35 | 8.2% | 8.2% | 26 | 0 | 1.71 / 26.0 | 34.3% | +15.7 |
| 87 | 45.5% | 45.7% | 45.8% | 16 / 35 | 7.5% | 9.0% | 17 | 0 | 1.80 / 25.4 | 46.5% | -1.0 |
| 88 | 50.4% | 51.4% | 50.0% | 18 / 35 | 7.9% | 8.5% | 27 | 0 | 1.68 / 27.9 | 48.1% | +2.3 |
| 89 | 44.7% | 42.9% | 46.3% | 15 / 35 | 8.3% | 9.4% | 27 | 0 | 1.65 / 25.0 | 51.7% | -7.1 |
| 90 | 53.4% | 54.3% | 52.8% | 19 / 35 | 8.3% | 7.9% | 26 | 0 | 1.72 / 26.7 | 48.8% | +4.6 |
| 91 | 55.7% | 57.1% | 53.2% | 20 / 35 | 8.2% | 8.2% | 34 | 0 | 1.74 / 25.7 | 53.6% | +2.0 |
| 92 | 47.2% | 45.7% | 49.5% | 16 / 35 | 8.1% | 7.4% | 26 | 0 | 1.74 / 30.7 | 53.8% | -6.6 |
| 93 | 54.9% | 57.1% | 52.9% | 20 / 35 | 8.5% | 9.1% | 33 | 0 | 1.75 / 27.0 | 50.5% | +4.4 |
| 94 | 52.1% | 51.4% | 52.0% | 18 / 35 | 7.9% | 7.9% | 34 | 0 | 1.81 / 27.8 | 45.8% | +6.3 |
| 95 | 53.7% | 54.3% | 52.9% | 19 / 35 | 8.2% | 8.2% | 33 | 0 | 1.71 / 25.0 | 48.5% | +5.1 |
| 96 | 58.0% | 60.0% | 55.5% | 21 / 35 | 8.4% | 8.7% | 39 | 0 | 1.79 / 28.7 | 46.4% | +11.5 |
| 97 | 50.6% | 48.6% | 52.9% | 17 / 35 | 8.3% | 8.3% | 26 | 0 | 1.70 / 33.6 | 51.5% | -1.0 |
| 98 | 45.8% | 42.9% | 48.8% | 15 / 35 | 8.0% | 8.6% | 24 | 0 | 1.74 / 28.9 | 42.6% | +3.2 |
| 99 | 54.4% | 54.3% | 53.8% | 19 / 35 | 8.5% | 8.4% | 31 | 0 | 1.68 / 26.2 | 52.0% | +2.4 |
| 100 | 49.1% | 45.7% | 52.3% | 16 / 35 | 9.0% | 7.8% | 25 | 0 | 1.72 / 50.6 | 47.9% | +1.2 |

Mean score share 50.3% ± 1.1, baseline 49.6% ± 1.0, paired diff +0.8 ± 1.4.

## Full report

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 3096 over 100 battles (31.0 per battle, most in one battle 57). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | rumble-7 | 50.3% ± 1.1 | 49.1% ± 1.7 | 51.8% ± 0.6 | 1719 / 3500 | 8.2% ± 0.1 | 8.4% ± 0.1 | 3096 | 0 | 1.84 / 173.8 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 100 | 89 | 2786 | 0 | 0.88 | 2 | 1 | 0 |

89 of 100 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 824898 | 19015 | 960219 | 824222 (99.9%) | 676 (0.1%) | 135997 (14.2%) | 72149 | 6292 | 3009 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 950162 | 87607 (9.2%) | 924715 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 650 | 547 | 650 | 3127 | 29.1 / 27.1 | 1401 | 92940 | 3413 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 8.4% | 3096 | 111165 | 3 | 273.3 | 87174 / 87607 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 1 | 34 | 310 | 8.3% | 6.7% ± 1.1 | 9.9% | 20.3% / 21.3% | 3.1% | 0 / 0 | T2/M1 | 50% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
