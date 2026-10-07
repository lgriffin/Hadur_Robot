# gh.GresSuffurd 0.4.13 (rumble-14) vs hadur2.Hadur 3.8.5

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

## Battles

| Seed | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) | Baseline share | Paired diff (pp) |
|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 54.1% | 62.9% | 46.0% | 22 / 35 | 11.5% | 8.5% | 17 | 0 | 1.05 / 19.7 | 63.0% | -9.0 |
| 2 | 57.2% | 71.4% | 42.7% | 25 / 35 | 11.0% | 8.6% | 15 | 0 | 1.09 / 20.1 | 67.1% | -9.9 |
| 3 | 52.0% | 60.0% | 44.0% | 21 / 35 | 10.8% | 7.6% | 10 | 0 | 1.05 / 19.5 | 70.2% | -18.2 |
| 4 | 55.4% | 62.9% | 48.3% | 22 / 35 | 11.5% | 8.3% | 10 | 0 | 1.07 / 18.7 | 65.4% | -10.0 |
| 5 | 64.4% | 80.0% | 48.2% | 28 / 35 | 10.8% | 8.7% | 18 | 0 | 1.08 / 21.9 | 64.8% | -0.4 |
| 6 | 65.4% | 80.0% | 49.5% | 28 / 35 | 10.7% | 9.3% | 20 | 0 | 1.06 / 22.1 | 63.9% | +1.5 |
| 7 | 66.2% | 82.9% | 50.0% | 29 / 35 | 11.4% | 8.5% | 22 | 0 | 1.09 / 19.8 | 60.0% | +6.2 |
| 8 | 54.5% | 64.7% | 44.5% | 23 / 35 | 10.9% | 9.3% | 15 | 0 | 1.08 / 20.1 | 62.1% | -7.6 |
| 9 | 56.2% | 65.7% | 47.5% | 23 / 35 | 11.3% | 8.8% | 13 | 0 | 1.05 / 20.1 | 63.6% | -7.4 |
| 10 | 60.2% | 68.6% | 51.7% | 24 / 35 | 11.4% | 7.9% | 17 | 0 | 1.05 / 21.4 | 65.6% | -5.4 |
| 11 | 63.2% | 77.1% | 48.6% | 27 / 35 | 10.9% | 8.5% | 14 | 0 | 1.06 / 20.1 | 55.3% | +8.0 |
| 12 | 66.7% | 80.0% | 52.0% | 28 / 35 | 11.6% | 8.3% | 18 | 0 | 1.10 / 20.9 | 69.2% | -2.5 |
| 13 | 57.3% | 62.9% | 51.7% | 22 / 35 | 11.2% | 8.0% | 11 | 0 | 1.05 / 20.4 | 60.3% | -3.0 |
| 14 | 62.8% | 77.1% | 47.0% | 27 / 35 | 11.4% | 7.9% | 20 | 0 | 1.07 / 23.1 | 57.9% | +4.9 |
| 15 | 56.9% | 68.6% | 45.3% | 24 / 35 | 11.1% | 8.8% | 22 | 0 | 1.06 / 20.9 | 64.4% | -7.5 |
| 16 | 69.6% | 85.7% | 53.5% | 30 / 35 | 11.1% | 9.1% | 21 | 0 | 1.11 / 32.6 | 70.9% | -1.3 |
| 17 | 59.9% | 70.6% | 48.3% | 25 / 35 | 11.4% | 8.1% | 18 | 0 | 1.06 / 18.6 | 62.2% | -2.2 |
| 18 | 61.1% | 74.3% | 46.6% | 26 / 35 | 10.8% | 8.4% | 24 | 0 | 1.07 / 611.5 | 62.2% | -1.1 |
| 19 | 68.9% | 82.9% | 52.9% | 29 / 35 | 11.1% | 7.9% | 17 | 0 | 1.05 / 21.3 | 66.2% | +2.7 |
| 20 | 59.7% | 71.4% | 47.4% | 25 / 35 | 11.5% | 7.7% | 23 | 0 | 1.07 / 20.8 | 62.0% | -2.2 |
| 21 | 57.8% | 68.6% | 47.2% | 24 / 35 | 10.7% | 8.4% | 20 | 0 | 1.10 / 171.0 | 57.6% | +0.3 |
| 22 | 62.2% | 73.5% | 50.9% | 26 / 35 | 10.8% | 7.9% | 20 | 0 | 1.06 / 19.6 | 59.8% | +2.5 |
| 23 | 71.7% | 85.7% | 56.1% | 30 / 35 | 11.5% | 7.2% | 12 | 0 | 1.04 / 411.6 | 72.3% | -0.5 |
| 24 | 60.7% | 74.3% | 46.1% | 26 / 35 | 11.1% | 8.0% | 21 | 0 | 1.08 / 20.7 | 58.8% | +1.8 |
| 25 | 73.3% | 91.4% | 54.5% | 32 / 35 | 11.9% | 8.8% | 17 | 0 | 1.09 / 243.5 | 59.1% | +14.2 |
| 26 | 62.2% | 74.3% | 50.1% | 26 / 35 | 11.0% | 8.6% | 15 | 0 | 1.07 / 19.5 | 63.0% | -0.7 |
| 27 | 55.7% | 68.6% | 42.1% | 24 / 35 | 10.2% | 8.9% | 11 | 0 | 1.03 / 665.6 | 65.7% | -10.1 |
| 28 | 64.7% | 77.1% | 52.0% | 27 / 35 | 11.3% | 8.2% | 16 | 0 | 1.08 / 755.2 | 69.8% | -5.0 |
| 29 | 67.7% | 82.9% | 51.6% | 29 / 35 | 11.2% | 8.9% | 21 | 0 | 1.04 / 21.4 | 69.1% | -1.3 |
| 30 | 66.5% | 80.0% | 52.5% | 28 / 35 | 11.2% | 8.0% | 15 | 0 | 1.06 / 464.2 | 65.0% | +1.5 |
| 31 | 68.4% | 85.7% | 51.6% | 30 / 35 | 11.6% | 8.8% | 13 | 0 | 1.08 / 654.1 | 56.7% | +11.7 |
| 32 | 65.9% | 80.0% | 51.4% | 28 / 35 | 10.8% | 8.2% | 22 | 0 | 1.06 / 20.4 | 69.4% | -3.5 |
| 33 | 67.3% | 80.0% | 52.5% | 28 / 35 | 11.2% | 7.9% | 18 | 0 | 1.03 / 748.0 | 58.0% | +9.3 |
| 34 | 63.5% | 77.1% | 48.1% | 27 / 35 | 10.7% | 8.3% | 17 | 0 | 1.09 / 19.8 | 50.6% | +12.9 |
| 35 | 66.2% | 77.1% | 55.1% | 27 / 35 | 11.2% | 8.3% | 23 | 0 | 1.09 / 498.8 | 68.6% | -2.4 |
| 36 | 58.8% | 71.4% | 46.1% | 25 / 35 | 11.1% | 8.1% | 19 | 0 | 1.11 / 173.5 | 62.7% | -3.9 |
| 37 | 65.5% | 82.9% | 48.4% | 29 / 35 | 11.0% | 8.7% | 18 | 0 | 1.10 / 670.4 | 56.5% | +9.1 |
| 38 | 65.0% | 80.0% | 48.6% | 28 / 35 | 11.4% | 8.3% | 19 | 0 | 1.07 / 137.6 | 57.2% | +7.8 |
| 39 | 55.8% | 65.7% | 45.7% | 23 / 35 | 10.7% | 8.1% | 19 | 0 | 1.09 / 206.8 | 57.1% | -1.3 |
| 40 | 67.9% | 82.9% | 50.6% | 29 / 35 | 11.1% | 8.7% | 21 | 0 | 1.09 / 287.5 | 71.8% | -3.9 |
| 41 | 58.7% | 71.4% | 46.5% | 25 / 35 | 11.2% | 9.2% | 21 | 0 | 1.10 / 20.1 | 59.9% | -1.2 |
| 42 | 63.2% | 74.3% | 51.5% | 26 / 35 | 11.6% | 7.6% | 17 | 0 | 1.04 / 638.3 | 54.3% | +8.9 |
| 43 | 63.2% | 74.3% | 51.1% | 26 / 35 | 11.3% | 7.3% | 14 | 0 | 1.03 / 129.9 | 61.0% | +2.2 |
| 44 | 66.2% | 77.1% | 54.2% | 27 / 35 | 11.6% | 7.9% | 15 | 0 | 1.04 / 108.8 | 64.1% | +2.1 |
| 45 | 69.7% | 85.7% | 51.7% | 30 / 35 | 11.1% | 7.4% | 19 | 0 | 1.03 / 346.8 | 64.0% | +5.7 |
| 46 | 57.8% | 71.4% | 45.2% | 25 / 35 | 11.0% | 9.8% | 27 | 0 | 1.04 / 21.5 | 47.4% | +10.4 |
| 47 | 64.6% | 80.0% | 48.2% | 28 / 35 | 11.3% | 8.4% | 20 | 0 | 1.03 / 192.9 | 65.9% | -1.3 |
| 48 | 70.6% | 82.9% | 56.8% | 29 / 35 | 11.3% | 7.9% | 18 | 0 | 1.07 / 20.3 | 49.1% | +21.5 |
| 49 | 56.5% | 68.6% | 43.6% | 24 / 35 | 10.9% | 9.2% | 16 | 0 | 1.06 / 567.7 | 70.4% | -13.9 |
| 50 | 62.6% | 77.1% | 48.2% | 27 / 35 | 11.4% | 8.0% | 15 | 0 | 1.07 / 20.3 | 56.3% | +6.4 |
| 51 | 50.6% | 57.1% | 44.5% | 20 / 35 | 11.3% | 8.3% | 21 | 0 | 1.06 / 48.4 | 59.3% | -8.7 |
| 52 | 60.1% | 74.3% | 45.4% | 26 / 35 | 11.1% | 8.9% | 24 | 0 | 1.08 / 22.6 | 61.5% | -1.5 |
| 53 | 68.4% | 80.0% | 55.7% | 28 / 35 | 11.1% | 7.3% | 12 | 0 | 1.02 / 20.3 | 58.7% | +9.8 |
| 54 | 62.4% | 79.4% | 45.5% | 28 / 35 | 11.2% | 8.2% | 19 | 0 | 1.11 / 279.1 | 61.2% | +1.3 |
| 55 | 65.6% | 80.0% | 50.5% | 28 / 35 | 11.2% | 8.7% | 19 | 0 | 1.07 / 19.5 | 64.6% | +1.0 |
| 56 | 69.9% | 80.0% | 58.9% | 28 / 35 | 12.0% | 6.8% | 19 | 0 | 1.05 / 176.2 | 63.7% | +6.1 |
| 57 | 62.8% | 77.1% | 47.2% | 27 / 35 | 11.2% | 8.9% | 21 | 0 | 1.08 / 21.0 | 59.0% | +3.8 |
| 58 | 63.9% | 77.1% | 50.0% | 27 / 35 | 11.1% | 8.3% | 21 | 0 | 1.07 / 556.7 | 61.0% | +2.9 |
| 59 | 64.9% | 77.1% | 53.4% | 27 / 35 | 11.2% | 8.6% | 15 | 0 | 1.05 / 18.2 | 67.8% | -2.9 |
| 60 | 69.1% | 82.9% | 54.2% | 29 / 35 | 10.8% | 8.1% | 17 | 0 | 1.03 / 19.8 | 72.6% | -3.5 |
| 61 | 62.8% | 79.4% | 47.1% | 28 / 35 | 11.2% | 8.9% | 22 | 0 | 1.07 / 313.6 | 61.3% | +1.5 |
| 62 | 63.0% | 74.3% | 50.7% | 26 / 35 | 11.0% | 8.6% | 18 | 0 | 1.10 / 686.9 | 53.4% | +9.5 |
| 63 | 72.2% | 85.7% | 58.2% | 30 / 35 | 11.3% | 8.2% | 19 | 0 | 1.04 / 363.0 | 71.4% | +0.8 |
| 64 | 61.9% | 74.3% | 49.3% | 26 / 35 | 11.6% | 8.8% | 20 | 0 | 1.06 / 402.5 | 59.5% | +2.5 |
| 65 | 63.9% | 77.1% | 50.5% | 27 / 35 | 11.3% | 8.2% | 21 | 0 | 1.07 / 19.5 | 60.0% | +3.9 |
| 66 | 59.4% | 68.6% | 49.9% | 24 / 35 | 11.7% | 8.3% | 18 | 0 | 1.08 / 32.9 | 54.6% | +4.8 |
| 67 | 61.1% | 71.4% | 51.3% | 25 / 35 | 11.4% | 8.3% | 16 | 0 | 1.10 / 255.2 | 64.7% | -3.6 |
| 68 | 66.1% | 80.0% | 51.6% | 28 / 35 | 10.9% | 8.5% | 19 | 0 | 1.11 / 563.9 | 68.8% | -2.7 |
| 69 | 64.4% | 77.1% | 50.6% | 27 / 35 | 11.1% | 7.4% | 15 | 0 | 1.04 / 365.9 | 71.0% | -6.6 |
| 70 | 60.5% | 68.6% | 52.3% | 24 / 35 | 11.3% | 8.0% | 17 | 0 | 1.07 / 406.5 | 64.8% | -4.4 |
| 71 | 61.1% | 71.4% | 50.0% | 25 / 35 | 11.2% | 8.0% | 15 | 0 | 1.10 / 158.7 | 58.5% | +2.6 |
| 72 | 63.0% | 74.3% | 51.6% | 26 / 35 | 11.2% | 7.9% | 23 | 0 | 1.11 / 19.2 | 60.3% | +2.6 |
| 73 | 60.7% | 74.3% | 45.3% | 26 / 35 | 11.0% | 8.0% | 11 | 0 | 1.10 / 682.0 | 66.1% | -5.4 |
| 74 | 61.3% | 74.3% | 47.5% | 26 / 35 | 10.8% | 8.3% | 13 | 0 | 1.08 / 452.1 | 64.2% | -2.9 |
| 75 | 54.6% | 65.7% | 44.6% | 23 / 35 | 11.8% | 9.5% | 19 | 0 | 1.10 / 278.6 | 54.9% | -0.3 |
| 76 | 60.4% | 71.4% | 48.7% | 25 / 35 | 10.9% | 8.4% | 20 | 0 | 1.08 / 725.4 | 64.8% | -4.5 |
| 77 | 59.7% | 74.3% | 43.5% | 26 / 35 | 9.8% | 8.6% | 28 | 0 | 1.09 / 30.7 | 59.5% | +0.2 |
| 78 | 66.6% | 80.0% | 52.1% | 28 / 35 | 11.5% | 7.8% | 15 | 0 | 1.06 / 513.9 | 65.6% | +1.0 |
| 79 | 55.5% | 60.0% | 50.6% | 21 / 35 | 10.5% | 8.2% | 12 | 0 | 1.06 / 535.3 | 63.6% | -8.1 |
| 80 | 61.3% | 71.4% | 51.1% | 25 / 35 | 11.4% | 8.6% | 18 | 0 | 1.08 / 350.0 | 64.8% | -3.4 |
| 81 | 59.2% | 74.3% | 44.1% | 26 / 35 | 10.9% | 8.7% | 14 | 0 | 1.07 / 527.9 | 61.6% | -2.4 |
| 82 | 61.8% | 74.3% | 48.9% | 26 / 35 | 11.5% | 7.4% | 63 | 0 | 1.05 / 433.4 | 71.4% | -9.6 |
| 83 | 59.1% | 71.4% | 46.8% | 25 / 35 | 11.1% | 9.0% | 15 | 0 | 1.08 / 745.2 | 61.0% | -1.9 |
| 84 | 62.2% | 74.3% | 50.7% | 26 / 35 | 11.2% | 8.5% | 19 | 0 | 1.08 / 19.9 | 60.5% | +1.8 |
| 85 | 64.1% | 77.1% | 50.6% | 27 / 35 | 11.5% | 8.7% | 21 | 0 | 1.05 / 386.3 | 66.5% | -2.4 |
| 86 | 62.2% | 74.3% | 49.6% | 26 / 35 | 11.2% | 7.9% | 14 | 0 | 1.06 / 20.5 | 62.4% | -0.2 |
| 87 | 67.5% | 77.1% | 57.1% | 27 / 35 | 11.2% | 8.1% | 17 | 0 | 1.08 / 288.0 | 49.1% | +18.4 |
| 88 | 53.3% | 62.9% | 43.4% | 22 / 35 | 11.2% | 8.4% | 19 | 0 | 1.08 / 20.6 | 59.8% | -6.5 |
| 89 | 56.9% | 68.6% | 46.1% | 24 / 35 | 11.7% | 9.0% | 19 | 0 | 1.08 / 21.1 | 56.6% | +0.3 |
| 90 | 48.8% | 54.3% | 43.8% | 19 / 35 | 10.7% | 9.0% | 12 | 0 | 1.09 / 20.6 | 59.5% | -10.7 |
| 91 | 69.9% | 82.9% | 56.2% | 29 / 35 | 11.4% | 7.9% | 19 | 0 | 1.04 / 19.5 | 64.4% | +5.5 |
| 92 | 67.9% | 82.9% | 51.3% | 29 / 35 | 11.3% | 7.7% | 8 | 0 | 1.04 / 21.5 | 67.8% | +0.1 |
| 93 | 62.1% | 77.1% | 47.2% | 27 / 35 | 11.4% | 8.8% | 16 | 0 | 1.08 / 21.5 | 55.2% | +6.9 |
| 94 | 57.3% | 68.6% | 45.9% | 24 / 35 | 11.0% | 8.9% | 20 | 0 | 1.06 / 20.4 | 63.0% | -5.7 |
| 95 | 65.4% | 77.1% | 53.1% | 27 / 35 | 11.0% | 8.0% | 17 | 0 | 1.08 / 19.2 | 66.6% | -1.2 |
| 96 | 66.2% | 80.0% | 51.7% | 28 / 35 | 11.7% | 7.8% | 17 | 0 | 1.07 / 20.5 | 61.4% | +4.8 |
| 97 | 63.2% | 77.1% | 49.4% | 27 / 35 | 11.1% | 9.2% | 16 | 0 | 1.09 / 20.8 | 63.6% | -0.4 |
| 98 | 63.5% | 74.3% | 52.3% | 26 / 35 | 11.3% | 7.5% | 9 | 0 | 1.03 / 19.1 | 68.1% | -4.6 |
| 99 | 58.6% | 68.6% | 49.1% | 24 / 35 | 11.0% | 9.1% | 16 | 0 | 1.09 / 20.6 | 58.5% | +0.1 |
| 100 | 61.4% | 74.3% | 47.3% | 26 / 35 | 11.1% | 8.4% | 22 | 0 | 1.06 / 20.3 | 68.2% | -6.9 |

Mean score share 62.4% ± 1.0, baseline 62.4% ± 1.1, paired diff -0.0 ± 1.3.

## Full report

35 rounds x 100 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1804 over 100 battles (18.0 per battle, most in one battle 63). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | rumble-14 | 62.4% ± 1.0 | 74.8% ± 1.4 | 49.5% ± 0.7 | 2620 / 3500 | 11.2% ± 0.1 | 8.3% ± 0.1 | 1804 | 0 | 1.11 / 755.2 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 100 | 69 | 2086 | 1 | 0.52 | 28 | 27 | 0 |

69 of 100 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 254848 | 200 | 254711 | 254662 (99.9%) | 186 (0.1%) | 49 (0.0%) | 18308 | 2320 | 1476 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 269322 | 27087 (10.1%) | 245920 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 650 | 459 | 648 | 987 | 30.4 / 30.9 | 8633 | 122429 | 2119 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 8.3% | 1804 | 9456 | 3 | 71.9 | 27056 / 27087 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | 0 / 100 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| gh.GresSuffurd 0.4.13 | gh.GresSuffurd | 1 | 35 | 294 | 8.6% | 6.9% ± 1.1 | 10.7% | 23.4% / 22.3% | 11.6% | 0 / 0 | T2/M1 | 61% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.
