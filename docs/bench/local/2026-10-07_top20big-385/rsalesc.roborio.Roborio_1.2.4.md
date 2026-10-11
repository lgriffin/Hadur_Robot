# rsalesc.roborio.Roborio 1.2.4 (rumble-22) vs hadur2.Hadur 3.8.5

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 59.2% | 54.3% | 62.8% | 19 / 35 | 12.1% | 8.3% | 15 | 0 | 1.62 / 589.8 | 71.4% | -12.2 |
| 2 | 62.4% | 62.9% | 60.5% | 22 / 35 | 11.9% | 8.8% | 28 | 0 | 1.61 / 21.6 | 53.2% | +9.3 |
| 3 | 57.7% | 51.4% | 62.5% | 18 / 35 | 12.6% | 8.5% | 20 | 0 | 1.51 / 1180.6 | 70.5% | -12.9 |
| 4 | 56.2% | 48.6% | 62.3% | 17 / 35 | 12.7% | 8.4% | 23 | 0 | 1.55 / 18.4 | 61.1% | -4.9 |
| 5 | 55.8% | 45.7% | 64.5% | 16 / 35 | 11.8% | 8.5% | 28 | 0 | 1.62 / 1207.1 | 57.5% | -1.8 |
| 6 | 57.3% | 54.3% | 59.2% | 19 / 35 | 11.9% | 9.7% | 27 | 0 | 1.64 / 22.1 | 62.9% | -5.6 |
| 7 | 57.8% | 54.3% | 60.0% | 19 / 35 | 11.9% | 10.4% | 34 | 0 | 1.58 / 22.3 | 56.8% | +1.0 |
| 8 | 56.3% | 51.4% | 60.4% | 18 / 35 | 11.4% | 8.4% | 25 | 0 | 1.64 / 18.5 | 65.4% | -9.1 |
| 9 | 61.7% | 60.0% | 62.3% | 21 / 35 | 11.7% | 8.6% | 21 | 0 | 1.61 / 20.0 | 66.8% | -5.1 |
| 10 | 63.5% | 65.7% | 60.0% | 23 / 35 | 12.1% | 9.1% | 30 | 0 | 1.59 / 21.3 | 56.4% | +7.0 |
| 11 | 56.9% | 45.7% | 65.4% | 16 / 35 | 13.1% | 9.1% | 18 | 0 | 1.60 / 18.0 | 69.6% | -12.7 |
| 12 | 61.9% | 62.9% | 59.6% | 22 / 35 | 11.2% | 9.7% | 26 | 0 | 1.62 / 20.8 | 62.3% | -0.3 |
| 13 | 56.0% | 51.4% | 59.7% | 18 / 35 | 12.2% | 8.9% | 27 | 0 | 1.64 / 18.7 | 64.1% | -8.1 |
| 14 | 53.7% | 48.6% | 57.7% | 17 / 35 | 12.0% | 9.5% | 27 | 0 | 1.63 / 18.6 | 53.0% | +0.7 |
| 15 | 59.6% | 54.3% | 63.1% | 19 / 35 | 12.2% | 9.1% | 25 | 0 | 1.65 / 18.9 | 66.2% | -6.6 |
| 16 | 56.6% | 51.4% | 60.8% | 18 / 35 | 11.7% | 9.1% | 30 | 0 | 1.56 / 18.6 | 64.7% | -8.1 |
| 17 | 58.2% | 57.1% | 58.0% | 20 / 35 | 12.1% | 8.9% | 21 | 0 | 1.65 / 22.8 | 63.9% | -5.7 |
| 18 | 51.4% | 42.9% | 59.1% | 15 / 35 | 11.8% | 8.7% | 29 | 0 | 1.63 / 20.3 | 67.7% | -16.4 |
| 19 | 62.2% | 57.1% | 64.9% | 20 / 35 | 12.1% | 9.4% | 24 | 0 | 1.60 / 18.6 | 62.3% | -0.2 |
| 20 | 58.4% | 54.3% | 61.0% | 19 / 35 | 11.9% | 8.6% | 26 | 0 | 1.59 / 20.5 | 59.4% | -1.0 |
| 21 | 61.0% | 60.0% | 60.6% | 21 / 35 | 11.4% | 9.2% | 35 | 0 | 1.62 / 22.7 | 63.2% | -2.2 |
| 22 | 60.5% | 57.1% | 62.1% | 20 / 35 | 10.7% | 8.4% | 24 | 0 | 1.65 / 20.7 | 55.4% | +5.1 |
| 23 | 61.2% | 60.0% | 60.9% | 21 / 35 | 12.2% | 9.3% | 31 | 0 | 1.62 / 22.9 | 61.2% | -0.0 |
| 24 | 65.6% | 68.6% | 61.5% | 24 / 35 | 11.2% | 8.8% | 30 | 0 | 1.64 / 21.5 | 54.7% | +10.9 |
| 25 | 64.3% | 62.9% | 63.9% | 22 / 35 | 12.0% | 9.7% | 35 | 0 | 1.62 / 20.7 | 65.9% | -1.6 |
| 26 | 59.0% | 57.1% | 59.7% | 20 / 35 | 12.1% | 9.3% | 22 | 0 | 1.59 / 20.5 | 62.7% | -3.7 |
| 27 | 62.9% | 60.0% | 64.4% | 21 / 35 | 12.2% | 9.6% | 24 | 0 | 1.64 / 21.2 | 63.2% | -0.3 |
| 28 | 63.1% | 62.9% | 62.2% | 22 / 35 | 12.4% | 8.7% | 27 | 0 | 1.60 / 19.4 | 54.1% | +9.1 |
| 29 | 57.0% | 51.4% | 61.8% | 18 / 35 | 12.5% | 8.7% | 24 | 0 | 1.60 / 21.5 | 55.4% | +1.7 |
| 30 | 60.3% | 54.3% | 64.5% | 19 / 35 | 12.6% | 9.6% | 20 | 0 | 1.55 / 18.2 | 62.9% | -2.6 |
| 31 | 62.1% | 65.7% | 58.0% | 23 / 35 | 11.0% | 9.0% | 25 | 0 | 1.59 / 19.1 | 56.6% | +5.5 |
| 32 | 63.5% | 62.9% | 62.9% | 22 / 35 | 11.3% | 8.6% | 28 | 0 | 1.63 / 20.7 | 54.1% | +9.4 |
| 33 | 59.1% | 57.1% | 60.1% | 20 / 35 | 11.3% | 8.4% | 24 | 0 | 1.59 / 20.0 | 58.6% | +0.6 |
| 34 | 67.8% | 74.3% | 60.1% | 26 / 35 | 11.7% | 9.0% | 26 | 0 | 1.65 / 21.9 | 66.0% | +1.7 |
| 35 | 65.6% | 65.7% | 64.2% | 23 / 35 | 12.1% | 9.7% | 30 | 0 | 1.54 / 17.2 | 53.4% | +12.2 |
| 36 | 50.1% | 40.0% | 59.6% | 14 / 35 | 11.8% | 9.7% | 27 | 0 | 1.62 / 18.0 | 65.4% | -15.3 |
| 37 | 55.6% | 45.7% | 63.3% | 16 / 35 | 12.4% | 9.3% | 18 | 0 | 1.62 / 20.8 | 60.8% | -5.2 |
| 38 | 67.6% | 65.7% | 68.0% | 23 / 35 | 12.7% | 9.0% | 32 | 0 | 1.61 / 21.7 | 57.6% | +10.0 |
| 39 | 67.2% | 68.6% | 64.4% | 24 / 35 | 12.0% | 9.1% | 30 | 0 | 1.48 / 17.3 | 54.1% | +13.1 |
| 40 | 61.3% | 60.0% | 61.5% | 21 / 35 | 12.6% | 8.9% | 18 | 0 | 1.59 / 22.2 | 68.7% | -7.4 |
| 41 | 60.2% | 57.1% | 62.1% | 20 / 35 | 12.4% | 9.4% | 29 | 0 | 1.62 / 21.1 | 52.8% | +7.3 |
| 42 | 53.7% | 45.7% | 60.1% | 16 / 35 | 12.4% | 9.3% | 24 | 0 | 1.70 / 20.8 | 60.2% | -6.5 |
| 43 | 65.1% | 68.6% | 60.2% | 24 / 35 | 12.5% | 9.2% | 24 | 0 | 1.62 / 51.7 | 64.6% | +0.5 |
| 44 | 67.0% | 68.6% | 64.0% | 24 / 35 | 11.8% | 8.9% | 29 | 0 | 1.65 / 20.9 | 60.2% | +6.9 |
| 45 | 67.2% | 68.6% | 63.9% | 24 / 35 | 11.7% | 8.7% | 29 | 0 | 1.67 / 21.3 | 54.8% | +12.3 |
| 46 | 53.7% | 42.9% | 62.3% | 15 / 35 | 11.8% | 9.1% | 13 | 0 | 1.59 / 18.0 | 62.5% | -8.8 |
| 47 | 67.1% | 65.7% | 67.0% | 23 / 35 | 12.3% | 9.8% | 30 | 0 | 1.63 / 21.1 | 58.5% | +8.7 |
| 48 | 63.3% | 60.0% | 64.9% | 21 / 35 | 12.7% | 9.4% | 32 | 0 | 1.71 / 20.9 | 60.7% | +2.7 |
| 49 | 64.0% | 65.7% | 61.2% | 23 / 35 | 11.7% | 9.0% | 28 | 0 | 1.62 / 20.3 | 52.4% | +11.6 |
| 50 | 65.7% | 68.6% | 61.6% | 24 / 35 | 11.2% | 8.8% | 23 | 0 | 1.59 / 21.8 | 65.7% | -0.0 |
| 51 | 61.3% | 57.1% | 63.9% | 20 / 35 | 11.8% | 9.0% | 29 | 0 | 1.60 / 20.8 | 60.6% | +0.7 |
| 52 | 59.9% | 57.1% | 61.3% | 20 / 35 | 11.9% | 9.1% | 28 | 0 | 1.61 / 19.8 | 65.5% | -5.6 |
| 53 | 65.4% | 65.7% | 63.4% | 23 / 35 | 12.8% | 9.5% | 27 | 0 | 1.60 / 20.6 | 52.7% | +12.7 |
| 54 | 64.6% | 65.7% | 62.0% | 23 / 35 | 12.0% | 8.7% | 26 | 0 | 1.55 / 22.0 | 62.3% | +2.3 |
| 55 | 61.1% | 57.1% | 63.2% | 20 / 35 | 12.3% | 8.8% | 25 | 0 | 1.57 / 19.9 | 65.4% | -4.3 |
| 56 | 56.4% | 54.3% | 57.8% | 19 / 35 | 12.0% | 9.3% | 24 | 0 | 1.62 / 21.6 | 62.4% | -6.0 |
| 57 | 58.8% | 52.9% | 62.9% | 19 / 35 | 11.6% | 8.6% | 23 | 0 | 1.65 / 25.0 | 64.2% | -5.4 |
| 58 | 57.5% | 48.6% | 64.6% | 17 / 35 | 11.8% | 9.0% | 23 | 0 | 1.66 / 18.3 | 58.8% | -1.3 |
| 59 | 58.6% | 57.1% | 58.9% | 20 / 35 | 11.2% | 9.5% | 27 | 0 | 1.58 / 20.7 | 62.1% | -3.6 |
| 60 | 57.9% | 54.3% | 60.5% | 19 / 35 | 11.5% | 9.5% | 21 | 0 | 1.62 / 22.0 | 59.4% | -1.5 |
| 61 | 65.0% | 65.7% | 62.8% | 23 / 35 | 11.1% | 9.3% | 32 | 0 | 1.66 / 109.2 | 65.4% | -0.4 |
| 62 | 56.0% | 48.6% | 62.0% | 17 / 35 | 12.0% | 9.2% | 19 | 0 | 1.58 / 264.0 | 63.4% | -7.5 |
| 63 | 59.3% | 54.3% | 63.0% | 19 / 35 | 12.0% | 9.5% | 27 | 0 | 1.70 / 20.9 | 58.8% | +0.5 |
| 64 | 63.3% | 62.9% | 62.2% | 22 / 35 | 11.5% | 8.7% | 28 | 0 | 1.55 / 22.1 | 57.3% | +6.1 |
| 65 | 66.0% | 62.9% | 67.5% | 22 / 35 | 12.1% | 9.6% | 30 | 0 | 1.64 / 20.9 | 56.1% | +10.0 |
| 66 | 68.9% | 71.4% | 65.2% | 25 / 35 | 12.3% | 8.9% | 22 | 0 | 1.65 / 374.2 | 69.3% | -0.4 |
| 67 | 56.5% | 51.4% | 60.2% | 18 / 35 | 11.5% | 9.0% | 21 | 0 | 1.62 / 19.7 | 56.0% | +0.6 |
| 68 | 50.4% | 42.9% | 57.3% | 15 / 35 | 10.7% | 9.3% | 16 | 0 | 1.64 / 18.0 | 57.9% | -7.5 |
| 69 | 65.6% | 57.1% | 71.7% | 20 / 35 | 13.7% | 8.3% | 8 | 0 | 1.49 / 17.9 | 56.4% | +9.2 |
| 70 | 52.7% | 45.7% | 58.7% | 16 / 35 | 11.8% | 9.6% | 28 | 0 | 1.58 / 20.1 | 52.6% | +0.1 |
| 71 | 54.0% | 48.6% | 58.2% | 17 / 35 | 11.5% | 9.2% | 19 | 0 | 1.61 / 19.6 | 64.1% | -10.1 |
| 72 | 69.5% | 68.6% | 68.7% | 24 / 35 | 12.8% | 8.2% | 18 | 0 | 1.60 / 18.4 | 59.1% | +10.4 |
| 73 | 58.6% | 54.3% | 61.7% | 19 / 35 | 11.1% | 10.0% | 23 | 0 | 1.64 / 90.4 | 63.9% | -5.3 |
| 74 | 57.1% | 54.3% | 58.6% | 19 / 35 | 11.3% | 9.8% | 28 | 0 | 1.65 / 20.3 | 69.5% | -12.4 |
| 75 | 64.3% | 60.0% | 66.4% | 21 / 35 | 12.1% | 8.5% | 24 | 0 | 1.62 / 20.1 | 70.6% | -6.3 |
| 76 | 65.9% | 68.6% | 61.9% | 24 / 35 | 11.8% | 9.3% | 25 | 0 | 1.59 / 21.3 | 70.6% | -4.7 |
| 77 | 56.5% | 51.4% | 60.1% | 18 / 35 | 12.2% | 9.0% | 24 | 0 | 1.66 / 19.9 | 66.7% | -10.2 |
| 78 | 60.5% | 54.3% | 65.1% | 19 / 35 | 12.3% | 8.7% | 17 | 0 | 1.56 / 18.4 | 66.6% | -6.0 |
| 79 | 72.1% | 77.1% | 65.9% | 27 / 35 | 11.7% | 8.7% | 30 | 0 | 1.61 / 21.5 | 56.6% | +15.5 |
| 80 | 61.1% | 60.0% | 60.7% | 21 / 35 | 11.2% | 9.3% | 29 | 0 | 1.62 / 21.5 | 55.6% | +5.5 |
| 81 | 67.1% | 68.6% | 64.2% | 24 / 35 | 11.7% | 8.5% | 27 | 0 | 1.54 / 19.7 | 51.7% | +15.4 |
| 82 | 64.9% | 62.9% | 65.6% | 22 / 35 | 12.4% | 9.2% | 27 | 0 | 1.63 / 20.3 | 63.5% | +1.4 |
| 83 | 56.8% | 54.3% | 58.9% | 19 / 35 | 11.5% | 9.1% | 21 | 0 | 1.58 / 20.3 | 60.3% | -3.5 |
| 84 | 61.2% | 57.1% | 64.0% | 20 / 35 | 12.1% | 8.4% | 17 | 0 | 1.64 / 19.2 | 54.4% | +6.8 |
| 85 | 68.6% | 68.6% | 67.0% | 24 / 35 | 12.4% | 8.3% | 26 | 0 | 1.59 / 20.3 | 52.9% | +15.7 |
| 86 | 61.4% | 57.1% | 64.4% | 20 / 35 | 12.2% | 9.3% | 30 | 0 | 1.62 / 22.4 | 55.4% | +6.0 |
| 87 | 51.2% | 42.9% | 58.4% | 15 / 35 | 11.7% | 8.8% | 26 | 0 | 1.55 / 19.1 | 50.1% | +1.1 |
| 88 | 57.4% | 54.3% | 59.4% | 19 / 35 | 12.5% | 9.2% | 26 | 0 | 1.60 / 22.1 | 55.4% | +2.0 |
| 89 | 62.2% | 65.7% | 57.6% | 23 / 35 | 11.4% | 8.9% | 28 | 0 | 1.65 / 21.8 | 61.8% | +0.4 |
| 90 | 68.1% | 71.4% | 63.4% | 25 / 35 | 12.0% | 9.3% | 29 | 0 | 1.58 / 21.0 | 67.1% | +1.1 |
| 91 | 73.3% | 77.1% | 68.3% | 27 / 35 | 12.3% | 9.1% | 28 | 0 | 1.66 / 20.8 | 64.5% | +8.8 |
| 92 | 61.3% | 60.0% | 61.3% | 21 / 35 | 11.5% | 8.6% | 21 | 0 | 1.58 / 19.3 | 59.2% | +2.0 |
| 93 | 65.9% | 60.0% | 70.0% | 21 / 35 | 12.6% | 7.8% | 20 | 0 | 1.59 / 17.8 | 57.2% | +8.7 |
| 94 | 62.6% | 62.9% | 61.2% | 22 / 35 | 11.2% | 9.2% | 28 | 0 | 1.58 / 19.5 | 63.3% | -0.7 |
| 95 | 66.5% | 68.6% | 63.3% | 24 / 35 | 11.8% | 9.5% | 25 | 0 | 1.61 / 20.9 | 45.1% | +21.4 |
| 96 | 59.4% | 54.3% | 63.0% | 19 / 35 | 12.5% | 8.4% | 10 | 0 | 1.49 / 16.1 | 62.7% | -3.3 |
| 97 | 61.4% | 57.1% | 64.1% | 20 / 35 | 12.2% | 8.9% | 28 | 0 | 1.58 / 19.3 | 63.1% | -1.7 |
| 98 | 59.7% | 54.3% | 63.4% | 19 / 35 | 12.5% | 9.2% | 17 | 0 | 1.24 / 15.7 | 59.6% | +0.1 |
| 99 | 61.2% | 60.0% | 61.5% | 21 / 35 | 11.5% | 9.0% | 24 | 0 | 1.43 / 19.0 | 55.7% | +5.6 |
| 100 | 60.5% | 57.1% | 62.4% | 20 / 35 | 11.4% | 8.8% | 17 | 0 | 1.18 / 15.7 | 60.9% | -0.4 |

Mean score share 61.0% ± 0.9, baseline 60.6% ± 1.1, paired diff +0.4 ± 1.5.

## Full report

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 2491 over 100 battles (24.9 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | rumble-22 | 61.0% ± 0.9 | 58.3% ± 1.6 | 62.3% ± 0.6 | 2041 / 3500 | 11.9% ± 0.1 | 9.0% ± 0.1 | 2491 | 0 | 1.71 / 1207.1 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | 100 | 63 | 1192 | 0 | 0.71 | 33 | 33 | 0 |

63 of 100 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | 695351 | 193 | 695890 | 695219 (100.0%) | 132 (0.0%) | 671 (0.1%) | 70644 | 5560 | 2253 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | 776470 | 73784 (9.5%) | 774381 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | 650 | 504 | 647 | 2620 | 41.0 / 24.7 | 15747 | 146095 | 1981 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | 9.0% | 2491 | 74146 | 3 | 196.3 | 73625 / 73784 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| rsalesc.roborio.Roborio 1.2.4 | rsalesc.roborio.Roborio | 1 | 35 | 328 | 9.7% | 7.5% ± 1.1 | 11.0% | 23.1% / 20.8% | 12.6% | 0 / 0 | T3/M1 | 60% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
