# kc.mega.BeepBoop 2.0 (rumble-1) vs hadur2.Hadur 3.8.5

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 24.0% | 11.4% | 41.2% | 4 / 35 | 4.5% | 8.9% | 23 | 0 | 1.89 / 60.0 | 21.5% | +2.5 |
| 2 | 28.6% | 17.1% | 44.5% | 6 / 35 | 5.2% | 8.8% | 19 | 0 | 2.00 / 44.2 | 23.9% | +4.7 |
| 3 | 26.7% | 17.1% | 40.2% | 6 / 35 | 4.8% | 9.0% | 26 | 0 | 1.94 / 58.6 | 20.0% | +6.7 |
| 4 | 26.4% | 17.1% | 39.9% | 6 / 35 | 4.2% | 9.0% | 25 | 0 | 1.92 / 459.5 | 30.0% | -3.6 |
| 5 | 22.3% | 11.4% | 38.7% | 4 / 35 | 4.5% | 8.3% | 25 | 0 | 1.88 / 59.3 | 26.8% | -4.5 |
| 6 | 25.0% | 14.3% | 40.2% | 5 / 35 | 4.9% | 8.2% | 22 | 0 | 1.88 / 44.1 | 25.1% | -0.1 |
| 7 | 21.7% | 11.4% | 37.0% | 4 / 35 | 4.4% | 9.4% | 29 | 0 | 1.93 / 71.1 | 16.0% | +5.7 |
| 8 | 30.5% | 20.0% | 44.8% | 7 / 35 | 5.7% | 8.6% | 16 | 0 | 1.98 / 218.4 | 21.9% | +8.6 |
| 9 | 24.2% | 11.4% | 42.6% | 4 / 35 | 4.7% | 8.3% | 18 | 0 | 1.96 / 60.9 | 26.1% | -1.9 |
| 10 | 25.2% | 11.4% | 44.1% | 4 / 35 | 4.8% | 8.3% | 25 | 0 | 1.92 / 74.8 | 28.1% | -2.9 |
| 11 | 30.1% | 17.1% | 46.4% | 6 / 35 | 5.4% | 8.8% | 27 | 0 | 2.02 / 61.3 | 23.5% | +6.6 |
| 12 | 27.8% | 17.6% | 41.0% | 7 / 35 | 5.0% | 9.0% | 23 | 0 | 2.01 / 44.1 | 25.2% | +2.6 |
| 13 | 20.6% | 5.7% | 40.6% | 2 / 35 | 5.0% | 10.0% | 27 | 0 | 1.93 / 44.4 | 20.0% | +0.7 |
| 14 | 32.8% | 22.9% | 46.5% | 8 / 35 | 4.7% | 7.8% | 25 | 0 | 1.92 / 43.2 | 16.3% | +16.5 |
| 15 | 29.6% | 17.1% | 46.6% | 6 / 35 | 5.1% | 8.4% | 23 | 0 | 2.01 / 43.2 | 16.7% | +12.9 |
| 16 | 30.8% | 20.0% | 44.9% | 7 / 35 | 5.4% | 8.7% | 24 | 0 | 1.89 / 44.4 | 27.8% | +3.0 |
| 17 | 26.4% | 17.1% | 39.0% | 6 / 35 | 5.0% | 8.7% | 21 | 0 | 1.98 / 312.5 | 22.7% | +3.6 |
| 18 | 22.1% | 5.9% | 41.8% | 3 / 35 | 4.7% | 9.2% | 23 | 0 | 1.96 / 45.3 | 32.1% | -10.0 |
| 19 | 23.6% | 11.4% | 41.4% | 4 / 35 | 4.4% | 8.1% | 15 | 0 | 1.92 / 44.1 | 26.3% | -2.8 |
| 20 | 26.5% | 14.3% | 42.8% | 5 / 35 | 5.2% | 9.0% | 20 | 0 | 1.94 / 42.9 | 24.2% | +2.3 |
| 21 | 30.7% | 22.9% | 42.4% | 8 / 35 | 4.8% | 8.1% | 16 | 0 | 1.83 / 45.8 | 22.8% | +7.9 |
| 22 | 24.4% | 11.4% | 43.2% | 4 / 35 | 5.2% | 8.2% | 16 | 0 | 1.89 / 43.1 | 27.1% | -2.7 |
| 23 | 22.3% | 8.6% | 41.1% | 3 / 35 | 5.0% | 10.1% | 30 | 0 | 1.97 / 44.6 | 29.6% | -7.3 |
| 24 | 25.7% | 14.3% | 41.0% | 5 / 35 | 5.1% | 8.9% | 25 | 0 | 1.95 / 42.7 | 25.6% | +0.1 |
| 25 | 29.2% | 17.6% | 45.3% | 7 / 35 | 5.2% | 7.2% | 20 | 0 | 1.96 / 45.1 | 20.1% | +9.2 |
| 26 | 22.7% | 11.4% | 37.6% | 4 / 35 | 4.5% | 10.2% | 16 | 0 | 1.81 / 48.2 | 20.3% | +2.3 |
| 27 | 27.3% | 14.3% | 44.5% | 5 / 35 | 5.3% | 9.1% | 17 | 0 | 1.94 / 46.1 | 30.4% | -3.1 |
| 28 | 17.5% | 5.7% | 34.8% | 2 / 35 | 4.7% | 8.7% | 15 | 0 | 1.90 / 43.2 | 24.4% | -6.9 |
| 29 | 22.5% | 8.6% | 43.1% | 3 / 35 | 4.8% | 8.1% | 24 | 0 | 1.93 / 44.5 | 36.2% | -13.7 |
| 30 | 31.1% | 20.0% | 46.2% | 7 / 35 | 5.1% | 8.7% | 22 | 0 | 1.93 / 413.3 | 21.5% | +9.5 |
| 31 | 32.4% | 22.9% | 44.6% | 8 / 35 | 5.7% | 9.3% | 26 | 0 | 1.96 / 44.7 | 24.4% | +8.0 |
| 32 | 31.3% | 22.9% | 43.7% | 8 / 35 | 5.2% | 8.6% | 25 | 0 | 1.96 / 269.2 | 32.0% | -0.6 |
| 33 | 25.3% | 14.3% | 42.5% | 5 / 35 | 4.8% | 7.8% | 14 | 0 | 1.86 / 43.2 | 24.5% | +0.8 |
| 34 | 18.2% | 2.9% | 40.3% | 1 / 35 | 4.7% | 8.2% | 25 | 0 | 1.92 / 626.5 | 17.6% | +0.6 |
| 35 | 20.0% | 5.7% | 38.7% | 2 / 35 | 5.0% | 9.9% | 22 | 0 | 1.99 / 43.5 | 25.2% | -5.1 |
| 36 | 24.3% | 8.6% | 44.3% | 3 / 35 | 5.1% | 9.1% | 20 | 0 | 1.97 / 44.5 | 38.0% | -13.7 |
| 37 | 20.9% | 5.7% | 42.9% | 2 / 35 | 5.2% | 8.3% | 28 | 0 | 1.99 / 732.5 | 33.6% | -12.6 |
| 38 | 27.6% | 11.4% | 49.4% | 4 / 35 | 5.4% | 8.1% | 22 | 0 | 1.97 / 47.2 | 30.9% | -3.3 |
| 39 | 22.2% | 8.8% | 39.4% | 4 / 35 | 5.5% | 9.5% | 26 | 0 | 1.94 / 45.4 | 28.1% | -5.9 |
| 40 | 24.7% | 11.4% | 43.2% | 4 / 35 | 4.6% | 9.3% | 26 | 0 | 2.00 / 43.6 | 23.8% | +0.9 |
| 41 | 26.6% | 11.4% | 47.3% | 4 / 35 | 5.5% | 8.0% | 22 | 0 | 1.93 / 46.3 | 24.1% | +2.5 |
| 42 | 35.1% | 25.7% | 47.4% | 9 / 35 | 5.9% | 8.9% | 24 | 0 | 1.85 / 44.3 | 26.7% | +8.3 |
| 43 | 21.5% | 8.6% | 40.5% | 3 / 35 | 4.7% | 8.2% | 22 | 0 | 1.92 / 46.1 | 21.2% | +0.3 |
| 44 | 30.7% | 17.1% | 48.3% | 6 / 35 | 5.6% | 8.3% | 28 | 0 | 2.05 / 45.0 | 24.0% | +6.7 |
| 45 | 21.2% | 5.7% | 42.9% | 2 / 35 | 5.0% | 8.2% | 18 | 0 | 1.91 / 43.4 | 21.9% | -0.7 |
| 46 | 26.4% | 14.3% | 43.4% | 5 / 35 | 4.8% | 8.1% | 22 | 0 | 1.99 / 44.9 | 18.2% | +8.1 |
| 47 | 23.5% | 8.6% | 45.5% | 3 / 35 | 5.0% | 7.7% | 20 | 0 | 1.86 / 43.9 | 22.3% | +1.2 |
| 48 | 24.6% | 11.4% | 42.3% | 4 / 35 | 4.8% | 9.1% | 15 | 0 | 1.97 / 44.2 | 26.5% | -1.9 |
| 49 | 27.9% | 17.1% | 43.8% | 6 / 35 | 4.7% | 8.2% | 29 | 0 | 1.91 / 43.8 | 29.1% | -1.2 |
| 50 | 27.5% | 11.4% | 48.5% | 4 / 35 | 5.5% | 8.2% | 16 | 0 | 2.01 / 44.8 | 28.9% | -1.4 |
| 51 | 20.1% | 5.7% | 40.7% | 2 / 35 | 4.4% | 8.7% | 25 | 0 | 1.93 / 43.6 | 27.9% | -7.8 |
| 52 | 25.9% | 11.4% | 45.7% | 4 / 35 | 4.9% | 9.3% | 22 | 0 | 1.93 / 48.5 | 23.7% | +2.2 |
| 53 | 23.9% | 8.6% | 45.0% | 3 / 35 | 5.4% | 8.6% | 23 | 0 | 2.06 / 45.5 | 21.1% | +2.8 |
| 54 | 35.2% | 22.9% | 51.4% | 8 / 35 | 6.0% | 8.4% | 25 | 0 | 2.03 / 45.0 | 34.1% | +1.1 |
| 55 | 16.6% | 2.9% | 37.7% | 1 / 35 | 4.3% | 8.6% | 17 | 0 | 1.86 / 42.9 | 22.2% | -5.6 |
| 56 | 23.1% | 11.4% | 39.9% | 4 / 35 | 5.0% | 9.0% | 20 | 0 | 1.93 / 44.6 | 28.4% | -5.2 |
| 57 | 19.4% | 5.7% | 38.5% | 2 / 35 | 5.0% | 9.2% | 22 | 0 | 1.92 / 44.5 | 32.3% | -12.9 |
| 58 | 26.7% | 14.3% | 44.0% | 5 / 35 | 4.8% | 8.4% | 13 | 0 | 1.82 / 44.8 | 26.2% | +0.5 |
| 59 | 22.9% | 8.6% | 42.8% | 3 / 35 | 5.4% | 8.9% | 10 | 0 | 1.87 / 46.6 | 26.6% | -3.7 |
| 60 | 25.0% | 14.3% | 40.5% | 5 / 35 | 5.0% | 8.5% | 14 | 0 | 1.88 / 550.7 | 33.0% | -8.0 |
| 61 | 19.8% | 5.7% | 40.7% | 2 / 35 | 4.7% | 9.0% | 24 | 0 | 1.96 / 43.2 | 25.5% | -5.6 |
| 62 | 24.1% | 11.4% | 41.6% | 4 / 35 | 5.3% | 8.7% | 25 | 0 | 1.98 / 631.3 | 23.4% | +0.7 |
| 63 | 27.8% | 14.3% | 45.9% | 5 / 35 | 5.3% | 8.4% | 20 | 0 | 1.93 / 44.0 | 27.4% | +0.4 |
| 64 | 21.7% | 11.4% | 37.1% | 4 / 35 | 4.2% | 8.6% | 25 | 0 | 1.88 / 48.0 | 24.6% | -2.9 |
| 65 | 31.6% | 20.6% | 46.2% | 8 / 35 | 5.6% | 8.4% | 30 | 0 | 1.96 / 226.3 | 28.5% | +3.1 |
| 66 | 23.7% | 11.4% | 40.7% | 4 / 35 | 4.9% | 8.3% | 23 | 0 | 1.89 / 42.9 | 28.5% | -4.8 |
| 67 | 25.5% | 14.3% | 40.7% | 5 / 35 | 5.7% | 9.5% | 24 | 0 | 1.91 / 43.6 | 27.5% | -2.0 |
| 68 | 30.0% | 20.0% | 43.9% | 7 / 35 | 5.3% | 7.5% | 20 | 0 | 1.94 / 45.1 | 29.7% | +0.3 |
| 69 | 24.6% | 11.4% | 42.8% | 4 / 35 | 5.0% | 8.9% | 29 | 0 | 1.96 / 148.7 | 29.5% | -4.9 |
| 70 | 22.6% | 8.6% | 41.8% | 3 / 35 | 4.7% | 8.4% | 23 | 0 | 1.88 / 44.0 | 34.2% | -11.6 |
| 71 | 23.0% | 8.6% | 43.7% | 3 / 35 | 4.8% | 8.1% | 18 | 0 | 1.88 / 430.6 | 21.9% | +1.1 |
| 72 | 27.2% | 14.3% | 43.4% | 5 / 35 | 5.2% | 9.7% | 33 | 0 | 1.95 / 43.6 | 22.2% | +5.0 |
| 73 | 29.9% | 17.1% | 47.0% | 6 / 35 | 5.7% | 9.2% | 28 | 0 | 1.97 / 45.9 | 30.2% | -0.3 |
| 74 | 25.1% | 11.4% | 42.2% | 4 / 35 | 5.9% | 8.9% | 22 | 0 | 1.94 / 44.7 | 35.5% | -10.4 |
| 75 | 21.3% | 8.6% | 40.6% | 3 / 35 | 4.7% | 7.9% | 12 | 0 | 1.85 / 42.5 | 31.5% | -10.2 |
| 76 | 19.5% | 2.9% | 43.3% | 1 / 35 | 5.3% | 8.6% | 19 | 0 | 1.91 / 42.6 | 19.5% | -0.1 |
| 77 | 22.1% | 11.4% | 37.4% | 4 / 35 | 4.6% | 9.2% | 30 | 0 | 1.96 / 47.0 | 20.5% | +1.6 |
| 78 | 22.1% | 11.4% | 37.9% | 4 / 35 | 4.8% | 8.5% | 26 | 0 | 1.93 / 448.9 | 19.8% | +2.3 |
| 79 | 26.4% | 17.1% | 39.3% | 6 / 35 | 5.3% | 9.1% | 23 | 0 | 1.93 / 117.4 | 26.6% | -0.3 |
| 80 | 19.6% | 5.7% | 38.7% | 2 / 35 | 5.0% | 8.8% | 19 | 0 | 1.91 / 45.8 | 17.3% | +2.3 |
| 81 | 25.9% | 11.4% | 46.4% | 4 / 35 | 5.1% | 8.2% | 24 | 0 | 2.03 / 45.3 | 27.2% | -1.3 |
| 82 | 32.7% | 22.9% | 45.0% | 8 / 35 | 5.6% | 8.7% | 20 | 0 | 1.94 / 640.3 | 22.7% | +9.9 |
| 83 | 23.7% | 8.6% | 43.7% | 3 / 35 | 5.3% | 8.5% | 20 | 0 | 2.00 / 44.0 | 34.0% | -10.3 |
| 84 | 23.1% | 11.4% | 38.6% | 4 / 35 | 4.7% | 9.0% | 24 | 0 | 1.98 / 43.2 | 30.2% | -7.1 |
| 85 | 21.8% | 8.6% | 40.5% | 3 / 35 | 5.1% | 8.9% | 19 | 0 | 1.90 / 418.3 | 26.0% | -4.1 |
| 86 | 27.5% | 14.3% | 45.8% | 5 / 35 | 5.3% | 8.9% | 32 | 0 | 2.06 / 44.1 | 30.8% | -3.3 |
| 87 | 27.6% | 17.1% | 41.5% | 6 / 35 | 5.3% | 9.2% | 23 | 0 | 1.95 / 345.1 | 25.3% | +2.4 |
| 88 | 20.5% | 8.6% | 36.8% | 3 / 35 | 4.6% | 9.0% | 25 | 0 | 1.87 / 44.7 | 24.6% | -4.1 |
| 89 | 24.5% | 11.4% | 41.7% | 4 / 35 | 4.6% | 9.2% | 25 | 0 | 1.95 / 47.7 | 27.7% | -3.2 |
| 90 | 31.6% | 20.0% | 47.2% | 7 / 35 | 5.5% | 7.5% | 22 | 0 | 1.93 / 43.6 | 20.8% | +10.9 |
| 91 | 27.4% | 17.1% | 40.4% | 6 / 35 | 5.8% | 10.0% | 38 | 0 | 1.94 / 44.5 | 32.2% | -4.9 |
| 92 | 25.3% | 14.3% | 40.5% | 5 / 35 | 4.8% | 8.3% | 16 | 0 | 1.90 / 45.0 | 29.0% | -3.7 |
| 93 | 25.2% | 11.4% | 44.7% | 4 / 35 | 4.6% | 7.9% | 26 | 0 | 1.94 / 44.3 | 20.0% | +5.2 |
| 94 | 26.9% | 14.3% | 43.5% | 5 / 35 | 4.6% | 9.9% | 19 | 0 | 1.91 / 43.9 | 26.6% | +0.3 |
| 95 | 28.3% | 17.1% | 44.2% | 6 / 35 | 5.0% | 7.6% | 22 | 0 | 1.93 / 47.0 | 19.3% | +9.0 |
| 96 | 21.8% | 11.4% | 37.2% | 4 / 35 | 5.0% | 8.6% | 16 | 0 | 1.86 / 46.3 | 26.6% | -4.8 |
| 97 | 26.7% | 17.1% | 40.0% | 6 / 35 | 4.7% | 8.5% | 30 | 0 | 1.95 / 44.6 | 21.2% | +5.5 |
| 98 | 25.2% | 14.3% | 40.1% | 5 / 35 | 5.2% | 9.4% | 21 | 0 | 1.97 / 46.5 | 21.9% | +3.3 |
| 99 | 21.6% | 8.6% | 40.7% | 3 / 35 | 4.5% | 8.0% | 15 | 0 | 1.90 / 45.7 | 23.4% | -1.7 |
| 100 | 27.7% | 14.3% | 45.7% | 5 / 35 | 4.7% | 8.6% | 25 | 0 | 1.93 / 43.0 | 24.3% | +3.4 |

Mean score share 25.3% ± 0.8, baseline 25.7% ± 0.9, paired diff -0.3 ± 1.2.

## Full report

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 2233 over 100 battles (22.3 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rumble-1 | 25.3% ± 0.8 | 12.9% ± 1.0 | 42.5% ± 0.6 | 456 / 3500 | 5.0% ± 0.1 | 8.7% ± 0.1 | 2233 | 0 | 2.06 / 732.5 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 100 | 93 | 595 | 0 | 0.64 | 5 | 3 | 0 |

93 of 100 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 476143 | 6027 | 497299 | 475872 (99.9%) | 271 (0.1%) | 21427 (4.3%) | 20038 | 3108 | 2211 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 473718 | 51706 (10.9%) | 459030 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 536 | 650 | 1651 | 19.8 / 26.8 | 0 | 11876 | 2306 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 8.7% | 2233 | 21345 | 3 | 140.8 | 51584 / 51706 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | kc.mega.BeepBoop | 1 | 35 | 296 | 9.5% | 7.6% ± 0.9 | 5.8% | 20.1% / 20.7% | 0.3% | 0 / 0 | T3/M1 | 28% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
