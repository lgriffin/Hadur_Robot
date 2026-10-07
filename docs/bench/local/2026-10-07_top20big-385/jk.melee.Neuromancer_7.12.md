# jk.melee.Neuromancer 7.12 (rumble-19) vs hadur2.Hadur 3.8.5

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 48.9% | 54.3% | 44.6% | 19 / 35 | 9.4% | 10.0% | 38 | 0 | 1.74 / 23.7 | 58.3% | -9.4 |
| 2 | 47.8% | 52.9% | 44.4% | 19 / 35 | 10.3% | 10.9% | 54 | 0 | 1.70 / 26.7 | 59.8% | -12.0 |
| 3 | 46.9% | 48.6% | 45.8% | 17 / 35 | 9.4% | 11.2% | 42 | 0 | 1.77 / 25.9 | 55.5% | -8.6 |
| 4 | 62.3% | 74.3% | 50.3% | 26 / 35 | 11.0% | 9.7% | 38 | 0 | 1.76 / 28.1 | 50.6% | +11.7 |
| 5 | 46.7% | 45.7% | 48.0% | 16 / 35 | 10.4% | 10.8% | 45 | 0 | 1.76 / 26.6 | 49.3% | -2.5 |
| 6 | 46.4% | 42.9% | 49.8% | 15 / 35 | 10.1% | 9.5% | 37 | 0 | 1.80 / 25.1 | 50.3% | -4.0 |
| 7 | 58.5% | 68.6% | 48.9% | 24 / 35 | 11.2% | 9.3% | 48 | 0 | 1.74 / 26.7 | 43.4% | +15.2 |
| 8 | 47.0% | 45.7% | 48.9% | 16 / 35 | 10.4% | 10.8% | 36 | 0 | 1.78 / 25.4 | 55.5% | -8.4 |
| 9 | 49.9% | 54.3% | 47.2% | 19 / 35 | 10.2% | 10.8% | 45 | 0 | 1.83 / 25.0 | 54.3% | -4.4 |
| 10 | 36.5% | 31.4% | 42.8% | 11 / 35 | 9.1% | 10.1% | 36 | 0 | 1.78 / 23.7 | 57.9% | -21.4 |
| 11 | 46.7% | 48.6% | 45.6% | 17 / 35 | 9.5% | 10.4% | 35 | 0 | 1.81 / 25.9 | 50.9% | -4.2 |
| 12 | 49.2% | 54.3% | 44.9% | 19 / 35 | 9.4% | 10.1% | 50 | 0 | 1.75 / 28.8 | 55.0% | -5.7 |
| 13 | 47.0% | 50.0% | 44.7% | 18 / 35 | 9.2% | 9.7% | 45 | 0 | 1.76 / 27.2 | 44.8% | +2.2 |
| 14 | 53.9% | 60.0% | 48.3% | 21 / 35 | 11.0% | 9.4% | 35 | 0 | 1.77 / 26.5 | 57.5% | -3.6 |
| 15 | 60.4% | 71.4% | 49.2% | 25 / 35 | 9.6% | 9.6% | 47 | 0 | 1.73 / 28.4 | 56.3% | +4.2 |
| 16 | 54.8% | 60.0% | 49.6% | 21 / 35 | 10.0% | 9.8% | 34 | 0 | 1.72 / 26.0 | 51.3% | +3.5 |
| 17 | 54.9% | 60.0% | 50.1% | 21 / 35 | 10.3% | 9.9% | 41 | 0 | 1.80 / 29.5 | 47.3% | +7.6 |
| 18 | 46.0% | 45.7% | 46.3% | 16 / 35 | 9.7% | 9.6% | 30 | 0 | 1.76 / 26.0 | 57.5% | -11.6 |
| 19 | 54.8% | 60.0% | 49.1% | 21 / 35 | 10.4% | 10.6% | 39 | 0 | 1.76 / 27.3 | 56.4% | -1.6 |
| 20 | 52.7% | 60.0% | 45.2% | 21 / 35 | 9.4% | 9.7% | 40 | 0 | 1.77 / 25.1 | 53.3% | -0.6 |
| 21 | 63.1% | 77.1% | 50.0% | 27 / 35 | 10.7% | 10.6% | 41 | 0 | 1.81 / 26.5 | 50.6% | +12.4 |
| 22 | 54.3% | 60.0% | 48.7% | 21 / 35 | 9.3% | 9.9% | 33 | 0 | 1.79 / 91.4 | 56.6% | -2.3 |
| 23 | 51.4% | 57.6% | 46.4% | 21 / 35 | 9.8% | 10.9% | 45 | 0 | 1.75 / 28.4 | 56.2% | -4.8 |
| 24 | 54.6% | 57.1% | 52.5% | 20 / 35 | 10.7% | 11.1% | 38 | 0 | 1.72 / 28.4 | 59.4% | -4.7 |
| 25 | 45.6% | 45.7% | 46.3% | 16 / 35 | 9.3% | 10.1% | 30 | 0 | 1.75 / 183.3 | 50.5% | -4.9 |
| 26 | 46.0% | 40.0% | 51.2% | 14 / 35 | 10.9% | 11.4% | 35 | 0 | 1.81 / 138.9 | 45.4% | +0.6 |
| 27 | 45.2% | 42.9% | 48.0% | 15 / 35 | 9.5% | 9.8% | 41 | 0 | 1.72 / 100.7 | 57.6% | -12.4 |
| 28 | 50.5% | 51.4% | 49.9% | 18 / 35 | 10.2% | 9.5% | 37 | 0 | 1.77 / 23.9 | 43.6% | +6.9 |
| 29 | 52.1% | 60.0% | 45.3% | 21 / 35 | 10.0% | 10.3% | 34 | 0 | 1.80 / 24.3 | 42.7% | +9.3 |
| 30 | 45.7% | 45.7% | 46.3% | 16 / 35 | 9.0% | 9.6% | 42 | 0 | 1.75 / 26.2 | 51.8% | -6.1 |
| 31 | 40.7% | 32.4% | 48.6% | 12 / 35 | 10.8% | 11.0% | 45 | 0 | 1.76 / 26.6 | 48.7% | -8.0 |
| 32 | 46.3% | 50.0% | 43.3% | 18 / 35 | 9.0% | 10.1% | 37 | 0 | 1.79 / 25.9 | 50.9% | -4.6 |
| 33 | 49.1% | 54.3% | 44.3% | 19 / 35 | 8.9% | 10.2% | 40 | 0 | 1.77 / 27.0 | 44.6% | +4.5 |
| 34 | 51.9% | 57.1% | 47.7% | 20 / 35 | 9.8% | 10.1% | 29 | 0 | 1.77 / 28.5 | 42.9% | +9.0 |
| 35 | 41.8% | 37.1% | 46.6% | 13 / 35 | 10.7% | 10.6% | 40 | 0 | 1.73 / 27.1 | 51.3% | -9.6 |
| 36 | 54.9% | 62.9% | 47.4% | 22 / 35 | 9.3% | 10.1% | 40 | 0 | 1.69 / 26.0 | 50.0% | +4.9 |
| 37 | 55.6% | 62.9% | 48.7% | 22 / 35 | 9.6% | 10.1% | 31 | 0 | 1.80 / 25.2 | 47.0% | +8.6 |
| 38 | 48.2% | 48.6% | 47.8% | 17 / 35 | 10.3% | 9.8% | 43 | 0 | 1.73 / 26.5 | 42.2% | +6.0 |
| 39 | 52.6% | 57.1% | 48.4% | 20 / 35 | 9.6% | 9.9% | 33 | 0 | 1.76 / 26.5 | 46.5% | +6.1 |
| 40 | 48.6% | 51.4% | 45.6% | 18 / 35 | 9.3% | 10.1% | 38 | 0 | 1.74 / 27.2 | 47.4% | +1.3 |
| 41 | 50.3% | 54.3% | 47.1% | 19 / 35 | 10.2% | 10.0% | 34 | 0 | 1.80 / 24.3 | 50.7% | -0.5 |
| 42 | 45.5% | 44.1% | 47.4% | 16 / 35 | 9.1% | 10.2% | 37 | 0 | 1.82 / 27.0 | 56.4% | -10.9 |
| 43 | 54.1% | 57.1% | 50.9% | 20 / 35 | 10.5% | 9.7% | 48 | 0 | 1.75 / 27.2 | 45.6% | +8.5 |
| 44 | 57.2% | 62.9% | 51.6% | 22 / 35 | 11.0% | 9.5% | 43 | 0 | 1.75 / 30.8 | 54.8% | +2.4 |
| 45 | 48.7% | 48.6% | 48.9% | 17 / 35 | 9.8% | 9.2% | 29 | 0 | 1.77 / 24.8 | 42.1% | +6.6 |
| 46 | 47.5% | 51.4% | 44.5% | 18 / 35 | 9.4% | 9.8% | 30 | 0 | 1.80 / 317.3 | 58.0% | -10.5 |
| 47 | 53.7% | 60.0% | 47.4% | 21 / 35 | 8.7% | 8.8% | 34 | 0 | 1.74 / 67.1 | 42.2% | +11.5 |
| 48 | 48.4% | 48.6% | 48.4% | 17 / 35 | 10.5% | 10.3% | 37 | 0 | 1.73 / 27.1 | 53.7% | -5.2 |
| 49 | 52.3% | 57.1% | 47.7% | 20 / 35 | 9.0% | 9.3% | 41 | 0 | 1.72 / 26.4 | 65.9% | -13.6 |
| 50 | 43.6% | 42.9% | 45.2% | 15 / 35 | 9.1% | 10.4% | 36 | 0 | 1.82 / 27.4 | 44.7% | -1.1 |
| 51 | 52.7% | 54.3% | 50.4% | 19 / 35 | 8.8% | 8.8% | 37 | 0 | 1.73 / 96.9 | 58.0% | -5.3 |
| 52 | 48.5% | 54.3% | 43.7% | 19 / 35 | 9.4% | 10.3% | 39 | 0 | 1.76 / 26.4 | 48.3% | +0.2 |
| 53 | 46.0% | 45.7% | 47.3% | 16 / 35 | 9.3% | 9.8% | 50 | 0 | 1.74 / 378.6 | 44.8% | +1.2 |
| 54 | 39.1% | 34.3% | 44.3% | 12 / 35 | 9.5% | 10.3% | 36 | 0 | 1.78 / 27.3 | 50.0% | -10.9 |
| 55 | 52.5% | 57.1% | 48.0% | 20 / 35 | 10.4% | 10.3% | 42 | 0 | 1.76 / 101.6 | 44.8% | +7.7 |
| 56 | 56.3% | 62.9% | 50.5% | 22 / 35 | 11.1% | 10.2% | 46 | 0 | 1.76 / 25.7 | 51.3% | +5.0 |
| 57 | 46.2% | 45.7% | 47.4% | 16 / 35 | 9.6% | 10.9% | 42 | 0 | 1.75 / 23.5 | 47.0% | -0.7 |
| 58 | 49.9% | 52.9% | 47.0% | 19 / 35 | 9.4% | 10.1% | 42 | 0 | 1.78 / 25.2 | 45.5% | +4.4 |
| 59 | 49.5% | 51.4% | 47.4% | 18 / 35 | 9.9% | 9.5% | 40 | 0 | 1.78 / 28.8 | 54.4% | -4.9 |
| 60 | 58.6% | 65.7% | 52.2% | 23 / 35 | 11.0% | 9.4% | 38 | 0 | 1.75 / 127.5 | 53.6% | +5.0 |
| 61 | 51.6% | 57.1% | 46.1% | 20 / 35 | 10.1% | 10.0% | 36 | 0 | 1.73 / 24.5 | 53.5% | -1.9 |
| 62 | 53.4% | 57.1% | 50.7% | 20 / 35 | 11.5% | 10.9% | 47 | 0 | 1.75 / 27.1 | 63.1% | -9.7 |
| 63 | 56.6% | 62.9% | 50.2% | 22 / 35 | 10.0% | 9.1% | 32 | 0 | 1.73 / 26.0 | 55.0% | +1.6 |
| 64 | 62.4% | 74.3% | 51.2% | 26 / 35 | 11.2% | 9.6% | 42 | 0 | 1.78 / 25.0 | 58.4% | +3.9 |
| 65 | 52.5% | 57.1% | 48.9% | 20 / 35 | 10.0% | 10.5% | 52 | 0 | 1.74 / 27.0 | 59.8% | -7.4 |
| 66 | 44.1% | 42.9% | 46.1% | 15 / 35 | 9.3% | 9.2% | 39 | 0 | 1.78 / 27.2 | 52.0% | -7.9 |
| 67 | 37.7% | 32.4% | 43.8% | 12 / 35 | 9.5% | 10.0% | 43 | 0 | 1.76 / 27.6 | 56.7% | -19.0 |
| 68 | 47.0% | 42.9% | 50.7% | 15 / 35 | 10.1% | 10.4% | 42 | 0 | 1.78 / 28.6 | 46.2% | +0.9 |
| 69 | 54.0% | 58.8% | 49.7% | 21 / 35 | 9.9% | 10.6% | 44 | 0 | 1.74 / 28.6 | 62.0% | -8.0 |
| 70 | 57.6% | 60.0% | 55.3% | 21 / 35 | 10.9% | 9.3% | 44 | 0 | 1.71 / 29.9 | 47.6% | +10.0 |
| 71 | 52.1% | 55.9% | 49.1% | 20 / 35 | 10.9% | 10.6% | 42 | 0 | 1.81 / 26.5 | 54.7% | -2.6 |
| 72 | 45.5% | 42.9% | 48.4% | 15 / 35 | 9.6% | 10.0% | 38 | 0 | 1.74 / 25.1 | 47.9% | -2.4 |
| 73 | 53.2% | 54.3% | 52.4% | 19 / 35 | 10.7% | 9.5% | 39 | 0 | 1.72 / 28.2 | 51.3% | +1.9 |
| 74 | 45.7% | 47.1% | 45.6% | 17 / 35 | 9.1% | 10.5% | 42 | 0 | 1.75 / 25.9 | 47.0% | -1.3 |
| 75 | 45.7% | 48.6% | 43.7% | 17 / 35 | 9.4% | 10.2% | 33 | 0 | 1.76 / 28.0 | 53.0% | -7.2 |
| 76 | 46.7% | 48.6% | 45.3% | 17 / 35 | 9.6% | 10.8% | 35 | 0 | 1.78 / 25.9 | 41.4% | +5.2 |
| 77 | 52.8% | 60.0% | 47.3% | 21 / 35 | 9.6% | 10.4% | 33 | 0 | 1.76 / 26.9 | 44.5% | +8.3 |
| 78 | 49.1% | 51.4% | 47.0% | 18 / 35 | 10.1% | 9.7% | 40 | 0 | 1.80 / 26.7 | 46.1% | +3.1 |
| 79 | 46.0% | 42.9% | 49.3% | 15 / 35 | 10.0% | 10.4% | 46 | 0 | 1.74 / 26.5 | 50.2% | -4.2 |
| 80 | 40.0% | 40.0% | 41.1% | 14 / 35 | 9.3% | 11.0% | 27 | 0 | 1.80 / 26.6 | 46.7% | -6.7 |
| 81 | 50.2% | 51.4% | 49.1% | 18 / 35 | 9.4% | 9.5% | 33 | 0 | 1.77 / 26.3 | 59.8% | -9.6 |
| 82 | 52.6% | 57.1% | 49.0% | 20 / 35 | 10.7% | 10.6% | 38 | 0 | 1.73 / 25.7 | 40.0% | +12.5 |
| 83 | 53.1% | 57.1% | 49.6% | 20 / 35 | 9.0% | 9.5% | 41 | 0 | 1.72 / 28.7 | 47.0% | +6.2 |
| 84 | 49.4% | 51.4% | 48.0% | 18 / 35 | 9.9% | 10.1% | 53 | 0 | 1.79 / 29.3 | 52.6% | -3.1 |
| 85 | 46.4% | 42.9% | 50.3% | 15 / 35 | 10.6% | 9.5% | 38 | 0 | 1.77 / 30.2 | 48.9% | -2.5 |
| 86 | 43.4% | 42.9% | 45.1% | 15 / 35 | 9.6% | 10.1% | 49 | 0 | 1.73 / 25.5 | 51.4% | -8.0 |
| 87 | 48.2% | 48.6% | 47.9% | 17 / 35 | 9.6% | 10.4% | 45 | 0 | 1.76 / 28.4 | 49.9% | -1.7 |
| 88 | 63.7% | 74.3% | 53.2% | 26 / 35 | 10.7% | 9.1% | 43 | 0 | 1.73 / 27.4 | 44.8% | +18.8 |
| 89 | 43.3% | 40.0% | 47.4% | 14 / 35 | 9.8% | 10.0% | 41 | 0 | 1.76 / 25.5 | 57.4% | -14.1 |
| 90 | 47.4% | 42.9% | 52.4% | 15 / 35 | 9.8% | 9.9% | 45 | 0 | 1.76 / 25.3 | 57.2% | -9.7 |
| 91 | 57.8% | 65.7% | 49.6% | 23 / 35 | 10.2% | 9.5% | 46 | 0 | 1.78 / 26.8 | 53.3% | +4.5 |
| 92 | 51.0% | 57.1% | 45.8% | 20 / 35 | 8.9% | 9.8% | 34 | 0 | 1.80 / 23.8 | 48.3% | +2.6 |
| 93 | 53.4% | 57.1% | 50.2% | 20 / 35 | 9.9% | 10.3% | 47 | 0 | 1.80 / 26.0 | 51.5% | +1.9 |
| 94 | 38.0% | 28.6% | 48.0% | 10 / 35 | 8.9% | 9.3% | 30 | 0 | 1.72 / 83.5 | 57.2% | -19.2 |
| 95 | 53.8% | 60.0% | 49.1% | 21 / 35 | 10.7% | 9.8% | 40 | 0 | 1.76 / 27.9 | 47.1% | +6.8 |
| 96 | 56.3% | 65.7% | 47.9% | 23 / 35 | 11.3% | 10.2% | 29 | 0 | 1.78 / 26.5 | 53.9% | +2.3 |
| 97 | 59.0% | 65.7% | 52.3% | 23 / 35 | 10.6% | 10.4% | 40 | 0 | 1.77 / 26.0 | 56.9% | +2.1 |
| 98 | 46.2% | 48.6% | 44.5% | 17 / 35 | 8.7% | 10.0% | 35 | 0 | 1.75 / 533.5 | 48.1% | -1.9 |
| 99 | 56.0% | 62.9% | 49.7% | 22 / 35 | 10.3% | 9.9% | 46 | 0 | 1.76 / 400.4 | 48.4% | +7.6 |
| 100 | 59.5% | 68.6% | 51.1% | 24 / 35 | 10.6% | 10.9% | 45 | 0 | 1.76 / 25.8 | 50.7% | +8.7 |

Mean score share 50.3% ± 1.1, baseline 51.2% ± 1.1, paired diff -0.9 ± 1.6.

## Full report

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 3962 over 100 battles (39.6 per battle, most in one battle 54). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jk.melee.Neuromancer 7.12 | rumble-19 | 50.3% ± 1.1 | 53.2% ± 2.0 | 48.0% ± 0.5 | 1867 / 3500 | 9.9% ± 0.1 | 10.1% ± 0.1 | 3962 | 0 | 1.83 / 533.5 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 100 | 74 | 4647 | 0 | 1.13 | 4 | 3 | 0 |

74 of 100 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 525600 | 128 | 531588 | 525163 (99.9%) | 437 (0.1%) | 6425 (1.2%) | 44659 | 4719 | 3970 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 561455 | 57537 (10.2%) | 542768 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 650 | 529 | 650 | 1900 | 31.3 / 33.9 | 3622 | 208073 | 426 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 10.1% | 3962 | 51059 | 3 | 151.0 | 57379 / 57537 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| jk.melee.Neuromancer 7.12 | jk.melee.Neuromancer | 1 | 35 | 314 | 11.4% | 9.6% ± 1.0 | 10.8% | 23.6% / 22.1% | 0.0% | 0 / 0 | T3/M1 | 59% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
