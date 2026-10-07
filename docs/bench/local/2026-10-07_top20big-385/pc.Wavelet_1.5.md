# pc.Wavelet 1.5 (rumble-13) vs hadur2.Hadur 3.8.5

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 46.8% | 48.6% | 46.5% | 17 / 35 | 10.7% | 9.0% | 17 | 0 | 1.81 / 24.4 | 38.9% | +7.9 |
| 2 | 51.6% | 48.6% | 54.8% | 17 / 35 | 10.8% | 9.4% | 29 | 0 | 1.83 / 21.4 | 46.8% | +4.7 |
| 3 | 31.9% | 17.1% | 47.9% | 6 / 35 | 8.2% | 10.2% | 11 | 0 | 1.78 / 20.9 | 46.7% | -14.9 |
| 4 | 36.4% | 25.7% | 50.1% | 9 / 35 | 9.1% | 8.9% | 20 | 0 | 1.82 / 496.9 | 41.4% | -4.9 |
| 5 | 40.9% | 34.3% | 48.9% | 12 / 35 | 10.6% | 9.0% | 10 | 0 | 1.77 / 16.2 | 39.3% | +1.7 |
| 6 | 47.6% | 45.7% | 50.4% | 16 / 35 | 10.3% | 9.8% | 17 | 0 | 1.82 / 243.5 | 32.2% | +15.4 |
| 7 | 48.3% | 48.6% | 48.1% | 17 / 35 | 8.8% | 8.4% | 14 | 0 | 1.71 / 17.4 | 47.1% | +1.2 |
| 8 | 45.9% | 40.0% | 52.9% | 14 / 35 | 10.0% | 8.6% | 6 | 0 | 1.69 / 588.3 | 46.9% | -1.0 |
| 9 | 44.4% | 40.0% | 50.4% | 14 / 35 | 9.9% | 8.7% | 15 | 0 | 1.79 / 17.3 | 39.9% | +4.5 |
| 10 | 59.6% | 48.6% | 68.5% | 17 / 35 | 12.0% | 11.6% | 29 | 0 | 1.99 / 323.8 | 47.0% | +12.7 |
| 11 | 55.2% | 60.0% | 49.9% | 21 / 35 | 9.4% | 7.1% | 8 | 0 | 1.62 / 17.9 | 44.0% | +11.2 |
| 12 | 45.3% | 42.9% | 49.2% | 15 / 35 | 10.5% | 8.3% | 9 | 0 | 1.75 / 16.7 | 47.4% | -2.2 |
| 13 | 52.2% | 51.4% | 53.7% | 18 / 35 | 10.2% | 8.1% | 14 | 0 | 1.75 / 427.7 | 51.5% | +0.7 |
| 14 | 45.9% | 42.9% | 49.9% | 15 / 35 | 9.9% | 9.3% | 20 | 0 | 1.79 / 21.3 | 42.4% | +3.6 |
| 15 | 42.5% | 40.0% | 46.1% | 14 / 35 | 9.4% | 9.1% | 14 | 0 | 1.78 / 18.3 | 56.9% | -14.4 |
| 16 | 45.8% | 42.9% | 49.8% | 15 / 35 | 10.9% | 8.7% | 13 | 0 | 1.80 / 18.4 | 48.3% | -2.5 |
| 17 | 44.7% | 40.0% | 50.9% | 14 / 35 | 9.6% | 8.9% | 18 | 0 | 1.82 / 17.7 | 48.7% | -4.0 |
| 18 | 54.9% | 54.3% | 56.5% | 19 / 35 | 9.8% | 8.7% | 19 | 0 | 1.81 / 18.3 | 53.0% | +1.9 |
| 19 | 43.6% | 37.1% | 50.7% | 13 / 35 | 9.4% | 9.4% | 13 | 0 | 1.76 / 19.3 | 49.9% | -6.2 |
| 20 | 49.7% | 51.4% | 48.3% | 18 / 35 | 9.7% | 8.8% | 18 | 0 | 1.76 / 17.9 | 43.7% | +6.0 |
| 21 | 53.6% | 54.3% | 54.1% | 19 / 35 | 10.6% | 7.9% | 18 | 0 | 1.79 / 18.4 | 55.6% | -2.1 |
| 22 | 54.8% | 57.1% | 52.5% | 20 / 35 | 9.8% | 7.7% | 15 | 0 | 1.78 / 26.4 | 41.6% | +13.2 |
| 23 | 50.3% | 54.3% | 47.7% | 19 / 35 | 10.1% | 9.1% | 17 | 0 | 1.69 / 17.1 | 47.4% | +2.9 |
| 24 | 51.3% | 54.3% | 49.0% | 19 / 35 | 10.5% | 8.8% | 12 | 0 | 1.72 / 20.1 | 43.5% | +7.9 |
| 25 | 51.6% | 54.3% | 49.1% | 19 / 35 | 10.1% | 8.3% | 14 | 0 | 1.70 / 16.5 | 39.4% | +12.3 |
| 26 | 54.1% | 54.3% | 54.5% | 19 / 35 | 11.1% | 9.5% | 10 | 0 | 1.75 / 20.8 | 42.8% | +11.3 |
| 27 | 46.8% | 45.7% | 48.6% | 16 / 35 | 10.1% | 9.6% | 11 | 0 | 1.71 / 22.1 | 46.2% | +0.6 |
| 28 | 42.9% | 40.0% | 47.0% | 14 / 35 | 10.4% | 8.5% | 12 | 0 | 1.66 / 20.1 | 36.7% | +6.2 |
| 29 | 46.6% | 45.7% | 48.1% | 16 / 35 | 9.4% | 9.8% | 15 | 0 | 1.78 / 24.8 | 46.7% | -0.1 |
| 30 | 49.6% | 48.6% | 51.2% | 17 / 35 | 10.3% | 8.9% | 22 | 0 | 1.83 / 18.1 | 49.8% | -0.1 |
| 31 | 51.3% | 51.4% | 51.6% | 18 / 35 | 9.8% | 8.5% | 12 | 0 | 1.83 / 21.5 | 56.5% | -5.2 |
| 32 | 42.8% | 37.1% | 49.2% | 13 / 35 | 9.1% | 9.4% | 14 | 0 | 1.74 / 17.8 | 41.9% | +0.9 |
| 33 | 42.9% | 34.3% | 53.2% | 12 / 35 | 9.4% | 9.0% | 22 | 0 | 1.77 / 18.9 | 53.8% | -10.9 |
| 34 | 45.0% | 40.0% | 51.6% | 14 / 35 | 9.4% | 8.7% | 15 | 0 | 1.85 / 18.1 | 38.1% | +7.0 |
| 35 | 54.1% | 57.1% | 52.5% | 20 / 35 | 10.8% | 7.9% | 23 | 0 | 1.82 / 18.0 | 47.8% | +6.3 |
| 36 | 48.0% | 45.7% | 51.1% | 16 / 35 | 10.4% | 9.4% | 10 | 0 | 1.71 / 18.6 | 48.8% | -0.7 |
| 37 | 44.7% | 42.9% | 48.0% | 15 / 35 | 9.7% | 7.5% | 20 | 0 | 1.70 / 17.6 | 44.4% | +0.3 |
| 38 | 43.0% | 37.1% | 50.3% | 13 / 35 | 9.0% | 9.5% | 17 | 0 | 1.88 / 21.1 | 36.1% | +6.8 |
| 39 | 44.9% | 40.0% | 50.6% | 14 / 35 | 9.8% | 9.9% | 13 | 0 | 1.77 / 19.3 | 46.5% | -1.5 |
| 40 | 58.9% | 60.0% | 58.4% | 21 / 35 | 11.9% | 8.6% | 16 | 0 | 1.78 / 15.9 | 48.8% | +10.1 |
| 41 | 56.4% | 57.1% | 56.1% | 20 / 35 | 11.2% | 7.5% | 17 | 0 | 1.79 / 21.6 | 43.5% | +12.9 |
| 42 | 60.6% | 65.7% | 55.4% | 23 / 35 | 11.1% | 8.1% | 20 | 0 | 1.77 / 18.1 | 36.9% | +23.8 |
| 43 | 49.8% | 48.6% | 51.6% | 17 / 35 | 10.4% | 9.3% | 13 | 0 | 1.84 / 50.6 | 41.4% | +8.4 |
| 44 | 41.9% | 37.1% | 48.3% | 13 / 35 | 9.6% | 9.7% | 8 | 0 | 1.74 / 17.1 | 51.1% | -9.2 |
| 45 | 53.6% | 57.1% | 50.2% | 20 / 35 | 10.7% | 8.1% | 16 | 0 | 1.72 / 16.2 | 43.0% | +10.6 |
| 46 | 54.2% | 54.3% | 54.5% | 19 / 35 | 11.1% | 9.1% | 8 | 0 | 1.72 / 18.1 | 45.3% | +8.8 |
| 47 | 53.7% | 51.4% | 56.4% | 18 / 35 | 10.8% | 8.5% | 18 | 0 | 1.84 / 16.9 | 49.9% | +3.8 |
| 48 | 57.1% | 60.0% | 54.8% | 21 / 35 | 10.0% | 9.0% | 12 | 0 | 1.89 / 18.6 | 46.3% | +10.9 |
| 49 | 48.8% | 48.6% | 50.6% | 17 / 35 | 9.6% | 8.1% | 14 | 0 | 1.80 / 18.9 | 39.4% | +9.4 |
| 50 | 43.3% | 37.1% | 50.4% | 13 / 35 | 8.9% | 9.6% | 18 | 0 | 1.73 / 17.2 | 51.2% | -7.9 |
| 51 | 38.4% | 28.6% | 49.0% | 10 / 35 | 10.0% | 9.4% | 10 | 0 | 1.83 / 21.9 | 45.9% | -7.4 |
| 52 | 46.5% | 45.7% | 48.4% | 16 / 35 | 9.7% | 8.8% | 12 | 0 | 1.81 / 17.7 | 48.7% | -2.2 |
| 53 | 47.1% | 42.9% | 51.8% | 15 / 35 | 9.3% | 9.5% | 24 | 0 | 1.76 / 17.1 | 50.1% | -3.0 |
| 54 | 51.2% | 54.3% | 49.1% | 19 / 35 | 10.9% | 8.3% | 13 | 0 | 1.75 / 126.1 | 47.4% | +3.9 |
| 55 | 51.8% | 54.3% | 49.9% | 19 / 35 | 8.8% | 7.9% | 7 | 0 | 1.66 / 23.0 | 47.1% | +4.7 |
| 56 | 39.0% | 31.4% | 47.3% | 11 / 35 | 10.4% | 10.3% | 27 | 0 | 1.68 / 18.5 | 45.6% | -6.6 |
| 57 | 43.3% | 37.1% | 50.6% | 13 / 35 | 10.0% | 9.1% | 16 | 0 | 1.83 / 22.2 | 57.6% | -14.3 |
| 58 | 49.6% | 51.4% | 48.0% | 18 / 35 | 10.1% | 9.4% | 16 | 0 | 1.78 / 19.4 | 46.7% | +2.9 |
| 59 | 49.5% | 48.6% | 51.1% | 17 / 35 | 10.3% | 8.4% | 9 | 0 | 1.63 / 16.3 | 39.9% | +9.7 |
| 60 | 36.8% | 31.4% | 44.1% | 11 / 35 | 9.1% | 9.3% | 8 | 0 | 1.76 / 23.6 | 48.6% | -11.8 |
| 61 | 44.4% | 37.1% | 52.4% | 13 / 35 | 9.5% | 9.4% | 8 | 0 | 1.69 / 18.0 | 51.4% | -7.0 |
| 62 | 52.0% | 51.4% | 52.8% | 18 / 35 | 10.1% | 8.3% | 16 | 0 | 1.70 / 19.8 | 46.3% | +5.7 |
| 63 | 52.2% | 54.3% | 50.6% | 19 / 35 | 10.7% | 7.7% | 17 | 0 | 1.75 / 17.8 | 47.0% | +5.2 |
| 64 | 56.3% | 62.9% | 49.5% | 22 / 35 | 10.5% | 8.4% | 16 | 0 | 1.77 / 16.6 | 47.6% | +8.7 |
| 65 | 48.7% | 48.6% | 50.2% | 17 / 35 | 10.9% | 9.0% | 23 | 0 | 1.72 / 17.6 | 46.5% | +2.3 |
| 66 | 40.0% | 37.1% | 44.6% | 13 / 35 | 9.5% | 9.3% | 10 | 0 | 1.79 / 21.6 | 42.0% | -1.9 |
| 67 | 55.1% | 57.1% | 53.7% | 20 / 35 | 11.1% | 7.3% | 13 | 0 | 1.74 / 20.6 | 51.6% | +3.5 |
| 68 | 47.8% | 45.7% | 50.0% | 16 / 35 | 10.7% | 10.1% | 22 | 0 | 1.87 / 18.1 | 47.4% | +0.4 |
| 69 | 48.1% | 45.7% | 51.1% | 16 / 35 | 10.6% | 9.3% | 9 | 0 | 1.68 / 18.5 | 55.0% | -6.9 |
| 70 | 49.8% | 54.3% | 46.8% | 19 / 35 | 10.0% | 8.9% | 17 | 0 | 1.74 / 17.6 | 51.8% | -2.0 |
| 71 | 43.0% | 40.0% | 47.7% | 14 / 35 | 9.4% | 8.8% | 19 | 0 | 1.78 / 17.4 | 44.8% | -1.8 |
| 72 | 55.2% | 57.1% | 53.4% | 20 / 35 | 10.5% | 7.8% | 20 | 0 | 1.72 / 20.0 | 44.3% | +10.8 |
| 73 | 40.2% | 34.3% | 47.0% | 12 / 35 | 9.4% | 9.4% | 19 | 0 | 1.71 / 19.1 | 41.0% | -0.8 |
| 74 | 47.4% | 45.7% | 50.5% | 16 / 35 | 9.2% | 8.0% | 19 | 0 | 1.77 / 16.2 | 54.9% | -7.5 |
| 75 | 52.0% | 57.1% | 48.0% | 20 / 35 | 10.5% | 9.6% | 7 | 0 | 1.69 / 17.6 | 53.0% | -1.0 |
| 76 | 49.3% | 51.4% | 48.0% | 18 / 35 | 9.5% | 8.4% | 12 | 0 | 1.75 / 16.2 | 41.2% | +8.0 |
| 77 | 51.3% | 51.4% | 51.8% | 18 / 35 | 9.8% | 8.5% | 16 | 0 | 1.78 / 19.1 | 51.6% | -0.3 |
| 78 | 47.0% | 42.9% | 52.3% | 15 / 35 | 10.4% | 8.9% | 11 | 0 | 1.78 / 20.2 | 43.8% | +3.2 |
| 79 | 49.8% | 51.4% | 48.6% | 18 / 35 | 9.7% | 8.4% | 13 | 0 | 1.58 / 16.9 | 43.1% | +6.7 |
| 80 | 46.2% | 40.0% | 52.8% | 14 / 35 | 10.8% | 9.5% | 19 | 0 | 1.76 / 21.9 | 48.6% | -2.4 |
| 81 | 49.1% | 42.9% | 55.2% | 15 / 35 | 10.4% | 8.3% | 8 | 0 | 1.76 / 20.7 | 47.9% | +1.2 |
| 82 | 43.0% | 40.0% | 47.4% | 14 / 35 | 10.1% | 8.4% | 18 | 0 | 1.74 / 18.2 | 48.7% | -5.7 |
| 83 | 37.5% | 28.6% | 47.4% | 10 / 35 | 10.5% | 9.4% | 14 | 0 | 1.78 / 18.7 | 53.1% | -15.6 |
| 84 | 56.1% | 60.0% | 52.3% | 21 / 35 | 10.1% | 9.0% | 16 | 0 | 1.74 / 22.3 | 43.5% | +12.7 |
| 85 | 52.6% | 54.3% | 51.8% | 19 / 35 | 9.5% | 7.7% | 7 | 0 | 1.71 / 20.4 | 47.0% | +5.6 |
| 86 | 48.8% | 48.6% | 49.7% | 17 / 35 | 11.4% | 8.9% | 21 | 0 | 1.79 / 22.2 | 49.1% | -0.3 |
| 87 | 44.2% | 40.0% | 49.3% | 14 / 35 | 10.1% | 9.4% | 14 | 0 | 1.85 / 131.2 | 57.5% | -13.2 |
| 88 | 59.8% | 65.7% | 53.8% | 23 / 35 | 10.0% | 8.4% | 9 | 0 | 1.63 / 15.5 | 46.2% | +13.6 |
| 89 | 50.2% | 54.3% | 47.1% | 19 / 35 | 10.2% | 8.8% | 18 | 0 | 1.69 / 17.0 | 46.3% | +3.9 |
| 90 | 46.2% | 45.7% | 47.7% | 16 / 35 | 10.7% | 8.5% | 14 | 0 | 1.67 / 18.9 | 56.4% | -10.2 |
| 91 | 41.4% | 37.1% | 46.5% | 13 / 35 | 9.8% | 8.9% | 9 | 0 | 1.74 / 17.3 | 55.4% | -14.0 |
| 92 | 49.7% | 48.6% | 51.1% | 17 / 35 | 9.1% | 9.1% | 17 | 0 | 1.76 / 20.8 | 43.7% | +6.1 |
| 93 | 50.9% | 48.6% | 53.3% | 17 / 35 | 11.7% | 9.1% | 14 | 0 | 1.82 / 22.0 | 46.6% | +4.3 |
| 94 | 47.4% | 48.6% | 47.3% | 17 / 35 | 10.3% | 8.9% | 16 | 0 | 1.77 / 16.3 | 46.4% | +1.0 |
| 95 | 53.8% | 60.0% | 48.5% | 21 / 35 | 11.6% | 7.9% | 14 | 0 | 1.76 / 22.3 | 44.2% | +9.7 |
| 96 | 52.4% | 51.4% | 53.0% | 18 / 35 | 10.0% | 9.8% | 26 | 0 | 1.79 / 18.7 | 47.9% | +4.5 |
| 97 | 48.7% | 45.7% | 52.7% | 16 / 35 | 10.8% | 8.7% | 11 | 0 | 1.75 / 18.2 | 43.6% | +5.1 |
| 98 | 45.5% | 42.9% | 49.1% | 15 / 35 | 9.2% | 8.3% | 19 | 0 | 1.77 / 16.7 | 51.8% | -6.2 |
| 99 | 46.4% | 45.7% | 48.4% | 16 / 35 | 9.1% | 8.4% | 19 | 0 | 1.73 / 21.9 | 45.4% | +1.0 |
| 100 | 41.6% | 34.3% | 50.3% | 12 / 35 | 10.2% | 9.0% | 17 | 0 | 1.79 / 19.2 | 43.6% | -2.0 |

Mean score share 48.2% ± 1.1, baseline 46.7% ± 1.0, paired diff +1.6 ± 1.5.

## Full report

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1515 over 100 battles (15.2 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | rumble-13 | 48.2% ± 1.1 | 46.7% ± 1.8 | 50.6% ± 0.6 | 1633 / 3500 | 10.1% ± 0.1 | 8.8% ± 0.1 | 1515 | 0 | 1.99 / 588.3 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | 100 | 56 | 577 | 0 | 0.43 | 43 | 40 | 0 |

56 of 100 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | 328549 | 113 | 331840 | 328483 (100.0%) | 66 (0.0%) | 3357 (1.0%) | 27944 | 3240 | 1041 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| pc.Wavelet 1.5 | 385491 | 35955 (9.3%) | 367011 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | 650 | 442 | 648 | 1373 | 30.8 / 30.0 | 4489 | 65239 | 202 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | 8.8% | 1515 | 14688 | 3 | 93.6 | 35925 / 35955 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| pc.Wavelet 1.5 | pc.Wavelet | 1 | 35 | 272 | 9.8% | 7.2% ± 0.9 | 10.4% | 21.9% / 22.4% | 9.8% | 0 / 0 | T3/M1 | 42% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
