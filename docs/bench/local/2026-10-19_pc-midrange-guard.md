# Bench: hadur2.Hadur 3.13hjswpwf8 (cold)

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 5486 over 192 battles (28.6 per battle, most in one battle 78). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rank1-band1 | 23.4% ± 3.0 | 10.7% ± 4.4 | 41.3% ± 3.6 | 15 / 140 | 4.9% ± 0.9 | 8.6% ± 0.5 | 137 | 0 | 1.91 / 846.0 |
| jd.Nullstride 2.3.3 | rank2-band1 | 24.9% ± 5.9 | 12.9% ± 8.7 | 42.1% ± 4.2 | 18 / 140 | 4.9% ± 0.5 | 8.6% ± 1.1 | 131 | 0 | 1.65 / 892.0 |
| jk.mega.DrussGT 3.1.16 | rank3-band1 | 46.7% ± 10.8 | 46.4% ± 16.3 | 47.0% ± 4.2 | 65 / 140 | 7.6% ± 0.5 | 10.6% ± 0.7 | 268 | 0 | 1.46 / 789.2 |
| oog.mega.saguaro.Saguaro 1.0 | rank4-band1 | 73.4% ± 6.0 | 85.0% ± 6.8 | 62.1% ± 7.5 | 119 / 140 | 19.3% ± 3.4 | 7.1% ± 0.8 | 54 | 0 | 1.96 / 709.9 |
| aaa.r.ScalarR 0.005h.053-noshield | rank5-band1 | 27.8% ± 13.1 | 18.0% ± 21.3 | 39.1% ± 4.6 | 26 / 140 | 6.8% ± 0.3 | 11.1% ± 1.1 | 240 | 0 | 1.73 / 381.1 |
| voidious.Diamond 1.8.22 | rank6-band1 | 47.2% ± 9.5 | 54.3% ± 14.4 | 40.0% ± 4.2 | 76 / 140 | 7.1% ± 0.8 | 9.5% ± 0.7 | 184 | 0 | 1.75 / 42.6 |
| cb.fire.Firestarter 2.0f | rank7-band1 | 48.1% ± 3.1 | 45.0% ± 5.7 | 51.5% ± 2.0 | 63 / 140 | 8.4% ± 0.9 | 9.6% ± 0.8 | 164 | 0 | 1.77 / 567.3 |
| dsekercioglu.mega.Raven 3.56j8 | rank8-band1 | 51.8% ± 4.9 | 66.4% ± 9.4 | 37.1% ± 1.9 | 93 / 140 | 9.1% ± 0.5 | 9.3% ± 0.7 | 108 | 0 | 1.12 / 587.9 |
| xander.cat.XanderCat 12.9 | rank9-band1 | 55.6% ± 9.2 | 62.1% ± 12.5 | 49.7% ± 5.3 | 87 / 140 | 12.4% ± 1.3 | 9.2% ± 1.0 | 128 | 0 | 1.20 / 434.8 |
| lxx.Tomcat 3.68 | rank10-band1 | 53.6% ± 8.6 | 64.3% ± 10.8 | 43.0% ± 5.8 | 90 / 140 | 9.4% ± 0.7 | 10.3% ± 0.9 | 206 | 0 | 1.95 / 54.1 |
| rsalesc.mega.Knight 0.6.28 | rank11-band2 | 50.5% ± 7.1 | 49.3% ± 13.1 | 51.1% ± 0.8 | 69 / 140 | 9.3% ± 0.7 | 10.1% ± 0.6 | 217 | 0 | 2.03 / 1000.9 |
| aw.Gilgalad 1.99.5c | rank12-band2 | 51.3% ± 14.4 | 60.6% ± 22.3 | 42.3% ± 7.9 | 85 / 140 | 9.9% ± 2.1 | 10.4% ± 0.4 | 164 | 0 | 1.49 / 23.3 |
| pc.Wavelet 1.5 | rank13-band2 | 51.6% ± 9.1 | 54.3% ± 16.2 | 49.5% ± 2.3 | 76 / 140 | 10.1% ± 1.1 | 8.5% ± 1.0 | 67 | 0 | 1.77 / 17.7 |
| gh.GresSuffurd 0.4.13 | rank14-band2 | 57.4% ± 11.3 | 67.9% ± 15.0 | 47.8% ± 7.6 | 95 / 140 | 11.1% ± 0.4 | 9.3% ± 1.4 | 122 | 0 | 1.03 / 142.7 |
| kc.serpent.WaveSerpent 2.11 | rank15-band2 | 57.7% ± 4.5 | 73.6% ± 10.1 | 40.7% ± 1.2 | 103 / 140 | 9.1% ± 0.8 | 7.9% ± 1.0 | 60 | 0 | 2.03 / 602.8 |
| dsekercioglu.mega.WhiteFang 2.8.1 | rank16-band2 | 67.6% ± 5.8 | 82.1% ± 7.8 | 52.3% ± 7.7 | 115 / 140 | 11.1% ± 0.6 | 7.9% ± 0.6 | 92 | 0 | 1.09 / 636.7 |
| cs.Nene 1.0.5 | rank17-band2 | 60.9% ± 7.0 | 79.3% ± 10.7 | 41.1% ± 3.9 | 111 / 140 | 9.5% ± 0.9 | 7.7% ± 0.5 | 66 | 0 | 1.20 / 14.0 |
| jk.melee.Neuromancer 7.12 | rank18-band2 | 48.9% ± 15.3 | 49.3% ± 24.7 | 48.5% ± 5.6 | 69 / 140 | 10.0% ± 0.8 | 10.0% ± 2.0 | 236 | 0 | 1.71 / 750.5 |
| voidious.Dookious 1.573c | rank19-band2 | 57.2% ± 13.2 | 70.0% ± 19.1 | 43.4% ± 8.3 | 98 / 140 | 9.6% ± 1.4 | 7.7% ± 1.3 | 64 | 0 | 1.15 / 649.6 |
| davidalves.Phoenix 1.02 | rank21-band2 | 98.5% ± 1.2 | 100.0% ± 0.0 | 0.0% ± 0.0 | 140 / 140 | 0.0% ± 0.0 | 0.2% ± 0.1 | 53 | 0 | 0.57 / 18.8 |
| rsalesc.roborio.Roborio 1.2.4 | rank22-band2 | 60.0% ± 4.8 | 53.6% ± 9.4 | 64.6% ± 5.5 | 75 / 140 | 12.5% ± 0.7 | 9.9% ± 0.6 | 198 | 0 | 1.65 / 613.6 |
| cb.Domogled 1.2 | rank23-band2 | 58.4% ± 2.6 | 51.4% ± 8.3 | 64.9% ± 4.0 | 72 / 140 | 10.8% ± 0.6 | 8.0% ± 0.6 | 200 | 0 | 0.96 / 22.1 |
| mue.Ascendant 1.2.27 | rank24-band2 | 53.0% ± 7.6 | 63.6% ± 11.4 | 43.7% ± 5.2 | 89 / 140 | 11.6% ± 0.6 | 8.5% ± 0.6 | 70 | 0 | 0.96 / 13.1 |
| abc.Shadow 3.83c | rank25-band2 | 52.8% ± 6.2 | 67.1% ± 10.8 | 38.6% ± 3.7 | 94 / 140 | 9.7% ± 1.2 | 8.6% ± 0.5 | 78 | 0 | 1.08 / 18.4 |
| darkcanuck.Pris 0.92 | rank26-band2 | 51.4% ± 9.6 | 59.3% ± 12.0 | 45.1% ± 8.4 | 83 / 140 | 11.9% ± 1.5 | 9.4% ± 1.0 | 42 | 0 | 1.81 / 12.8 |
| fromHell.BlackBox 0.0.2 | rank27-band2 | 60.5% ± 10.7 | 70.0% ± 13.6 | 51.6% ± 7.3 | 98 / 140 | 15.5% ± 1.7 | 9.5% ± 0.8 | 78 | 0 | 0.96 / 14.6 |
| jk.precise.Wintermute 0.8 | rank28-band2 | 66.6% ± 4.9 | 85.6% ± 8.2 | 47.9% ± 3.0 | 120 / 140 | 11.2% ± 0.3 | 8.3% ± 0.4 | 93 | 0 | 1.19 / 41.7 |
| kc.serpent.Hydra 0.21 | rank29-band2 | 99.8% ± 0.4 | 100.0% ± 0.0 | 25.0% ± 45.9 | 140 / 140 | 0.0% ± 0.0 | 0.0% ± 0.0 | 56 | 0 | 0.77 / 158.6 |
| davidalves.Firebird 0.25 | rank30-band2 | 97.5% ± 3.8 | 99.3% ± 2.3 | 0.0% ± 0.0 | 139 / 140 | 0.0% ± 0.0 | 0.2% ± 0.2 | 56 | 0 | 0.67 / 24.7 |
| pulsar.PulsarMax 0.8.9 | rank31-band2 | 63.4% ± 8.8 | 80.0% ± 13.4 | 45.1% ± 3.8 | 112 / 140 | 10.0% ± 0.8 | 7.1% ± 0.8 | 57 | 0 | 1.05 / 520.3 |
| zyx.mega.YersiniaPestis 3.0 | rank32-band2 | 56.7% ± 8.9 | 72.1% ± 9.4 | 42.2% ± 7.8 | 101 / 140 | 10.5% ± 0.6 | 8.6% ± 0.8 | 151 | 0 | 1.40 / 42.9 |
| ags.Midboss 1q.fast | rank33-band2 | 74.3% ± 7.0 | 87.9% ± 9.4 | 61.6% ± 5.4 | 123 / 140 | 14.1% ± 1.6 | 8.6% ± 1.1 | 121 | 0 | 1.32 / 39.8 |
| pez.rumble.CassiusClay 2rho.02no | rank35-band2 | 66.0% ± 4.6 | 70.7% ± 5.7 | 61.0% ± 4.3 | 99 / 140 | 12.5% ± 0.7 | 7.9% ± 0.9 | 121 | 0 | 1.09 / 27.3 |
| Krabb.sliNk.Garm 0.9u | rank36-band2 | 64.8% ± 9.4 | 79.3% ± 11.4 | 49.2% ± 7.7 | 111 / 140 | 10.5% ± 1.0 | 7.1% ± 0.8 | 67 | 0 | 1.09 / 165.5 |
| axeBots.SilverSurfer 2.53.33fix | rank37-band2 | 68.1% ± 6.7 | 82.1% ± 4.4 | 54.7% ± 8.3 | 115 / 140 | 11.6% ± 0.6 | 7.1% ± 1.3 | 116 | 0 | 1.37 / 17.4 |
| mn.Combat 3.25.0 | rank38-band2 | 52.1% ± 2.3 | 61.4% ± 4.5 | 42.4% ± 2.6 | 86 / 140 | 9.9% ± 0.6 | 9.6% ± 0.8 | 151 | 0 | 1.70 / 29.1 |
| cs.s2.Seraphim 2.3.1 | rank39-band2 | 64.1% ± 7.9 | 80.0% ± 11.1 | 49.1% ± 6.3 | 112 / 140 | 11.4% ± 0.6 | 8.0% ± 0.5 | 150 | 0 | 1.05 / 387.2 |
| fromHell.CHCl3 1.4.2 | rank40-band2 | 70.4% ± 13.4 | 83.6% ± 15.5 | 56.8% ± 10.2 | 117 / 140 | 13.1% ± 0.5 | 6.9% ± 1.6 | 85 | 0 | 0.92 / 349.1 |
| jk.mini.CunobelinDC 1.2 | rank41-band2 | 98.2% ± 0.7 | 100.0% ± 0.0 | 9.5% ± 15.8 | 140 / 140 | 0.5% ± 0.9 | 1.1% ± 0.1 | 71 | 0 | 0.61 / 90.1 |
| sheldor.mini.Foilist 1.3.1 | rank42-band2 | 67.1% ± 3.3 | 79.3% ± 4.4 | 54.4% ± 9.9 | 111 / 140 | 11.5% ± 0.2 | 8.3% ± 1.0 | 150 | 0 | 1.12 / 197.6 |
| florent.test.Toad 0.14t | rank43-band2 | 62.3% ± 10.8 | 75.7% ± 11.4 | 48.8% ± 9.3 | 106 / 140 | 10.8% ± 0.2 | 7.6% ± 1.2 | 74 | 0 | 1.03 / 18.0 |
| ar.horizon.Horizon 1.2.2 | rank44-band2 | 59.1% ± 3.7 | 70.7% ± 5.7 | 47.4% ± 3.5 | 99 / 140 | 10.9% ± 0.5 | 8.5% ± 0.9 | 92 | 0 | 1.33 / 326.7 |
| cjm.chalk.Chalk 2.6.Be | rank45-band2 | 99.9% ± 0.3 | 100.0% ± 0.0 | 37.5% ± 39.8 | 140 / 140 | 0.0% ± 0.0 | 0.0% ± 0.0 | 54 | 0 | 0.58 / 103.1 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | rank46-band2 | 98.0% ± 1.7 | 100.0% ± 0.0 | 7.7% ± 10.7 | 140 / 140 | 0.5% ± 1.1 | 1.6% ± 0.5 | 52 | 0 | 0.49 / 17.7 |
| sheldor.mini.FoilistMC 1.0 | rank47-band2 | 73.4% ± 6.3 | 85.7% ± 7.4 | 60.3% ± 5.1 | 120 / 140 | 11.7% ± 0.7 | 6.9% ± 0.5 | 89 | 0 | 1.18 / 19.1 |
| pez.rumble.Ali 0.4.9 | rank48-band2 | 84.4% ± 11.4 | 95.0% ± 4.4 | 20.8% ± 25.6 | 133 / 140 | 2.3% ± 2.7 | 2.0% ± 1.5 | 56 | 0 | 1.72 / 17.9 |
| catcat20.Lambda 0.017 | rank49-band2 | 66.8% ± 11.4 | 80.7% ± 15.0 | 53.0% ± 7.0 | 113 / 140 | 11.9% ± 0.4 | 7.9% ± 1.5 | 110 | 0 | 1.58 / 239.2 |
| florent.XSeries.X2 0.17 | rank50-band2 | 59.0% ± 11.5 | 71.4% ± 13.4 | 46.7% ± 10.6 | 100 / 140 | 11.2% ± 1.2 | 7.3% ± 0.8 | 87 | 0 | 2.05 / 24.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 3000 | 52.1% | 31.8% | 0.0% | 16.2% | 1837 |
| jd.Nullstride 2.3.3 | 4 | 2924 | 52.2% | 31.6% | 0.0% | 16.3% | 1703 |
| jk.mega.DrussGT 3.1.16 | 4 | 2370 | 39.6% | 47.4% | 0.0% | 13.1% | 3117 |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 1309 | 20.1% | 71.8% | 0.0% | 8.1% | 689 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 3142 | 45.4% | 39.0% | 0.0% | 15.6% | 2647 |
| voidious.Diamond 1.8.22 | 4 | 2208 | 36.2% | 51.2% | 0.0% | 12.5% | 2718 |
| cb.fire.Firestarter 2.0f | 4 | 2287 | 42.1% | 44.3% | 0.0% | 13.6% | 3287 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 2134 | 27.5% | 62.0% | 0.0% | 10.5% | 1331 |
| xander.cat.XanderCat 12.9 | 4 | 2117 | 31.3% | 57.1% | 0.0% | 11.6% | 1549 |
| lxx.Tomcat 3.68 | 4 | 2097 | 29.8% | 58.6% | 0.1% | 11.5% | 2025 |
| rsalesc.mega.Knight 0.6.28 | 4 | 2205 | 40.3% | 46.8% | 0.0% | 13.0% | 2873 |
| aw.Gilgalad 1.99.5c | 4 | 2193 | 31.4% | 56.9% | 0.0% | 11.7% | 1861 |
| pc.Wavelet 1.5 | 4 | 2168 | 36.9% | 49.7% | 0.2% | 13.2% | 1376 |
| gh.GresSuffurd 0.4.13 | 4 | 2036 | 27.6% | 60.9% | 0.0% | 11.4% | 1067 |
| kc.serpent.WaveSerpent 2.11 | 4 | 1815 | 25.5% | 64.9% | 0.0% | 9.6% | 1065 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 1483 | 21.1% | 70.9% | 0.0% | 8.0% | 1283 |
| cs.Nene 1.0.5 | 4 | 1693 | 21.4% | 70.4% | 0.0% | 8.2% | 938 |
| jk.melee.Neuromancer 7.12 | 4 | 2375 | 37.4% | 49.2% | 0.0% | 13.4% | 2056 |
| voidious.Dookious 1.573c | 4 | 1893 | 27.7% | 61.4% | 0.0% | 10.8% | 973 |
| davidalves.Phoenix 1.02 | 4 | 32 | 0.0% | 100.0% | 0.0% | 0.0% | 1240 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 1950 | 41.7% | 44.9% | 0.0% | 13.4% | 2715 |
| cb.Domogled 1.2 | 4 | 1829 | 46.5% | 40.4% | 0.0% | 13.1% | 2742 |
| mue.Ascendant 1.2.27 | 4 | 2279 | 28.0% | 60.1% | 0.0% | 11.9% | 834 |
| abc.Shadow 3.83c | 4 | 2123 | 27.1% | 62.3% | 0.0% | 10.6% | 983 |
| darkcanuck.Pris 0.92 | 4 | 2423 | 29.4% | 57.9% | 0.0% | 12.7% | 831 |
| fromHell.BlackBox 0.0.2 | 4 | 1919 | 27.4% | 62.0% | 0.0% | 10.6% | 925 |
| jk.precise.Wintermute 0.8 | 4 | 1548 | 16.2% | 77.0% | 0.0% | 6.8% | 1048 |
| kc.serpent.Hydra 0.21 | 4 | 5 | 0.0% | 100.0% | 0.0% | 0.0% | 1388 |
| davidalves.Firebird 0.25 | 4 | 54 | 23.3% | 69.8% | 0.0% | 7.0% | 1279 |
| pulsar.PulsarMax 0.8.9 | 4 | 1586 | 22.1% | 69.4% | 0.0% | 8.6% | 961 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 1992 | 24.5% | 65.3% | 0.0% | 10.2% | 972 |
| ags.Midboss 1q.fast | 4 | 1283 | 16.6% | 76.1% | 0.0% | 7.3% | 864 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 1629 | 31.5% | 57.2% | 0.0% | 11.3% | 1442 |
| Krabb.sliNk.Garm 0.9u | 4 | 1542 | 23.5% | 67.5% | 0.0% | 9.0% | 938 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 1476 | 21.2% | 70.5% | 0.0% | 8.3% | 1076 |
| mn.Combat 3.25.0 | 4 | 2127 | 31.7% | 56.8% | 0.0% | 11.4% | 1585 |
| cs.s2.Seraphim 2.3.1 | 4 | 1718 | 20.4% | 70.8% | 0.0% | 8.8% | 854 |
| fromHell.CHCl3 1.4.2 | 4 | 1376 | 20.9% | 70.5% | 0.0% | 8.6% | 886 |
| jk.mini.CunobelinDC 1.2 | 4 | 39 | 0.0% | 100.0% | 0.0% | 0.0% | 1407 |
| sheldor.mini.Foilist 1.3.1 | 4 | 1507 | 24.1% | 66.6% | 0.0% | 9.4% | 1296 |
| florent.test.Toad 0.14t | 4 | 1722 | 24.7% | 65.6% | 0.0% | 9.7% | 948 |
| ar.horizon.Horizon 1.2.2 | 4 | 1858 | 27.6% | 61.5% | 0.0% | 10.9% | 1097 |
| cjm.chalk.Chalk 2.6.Be | 4 | 2 | 0.0% | 100.0% | 0.0% | 0.0% | 1368 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 43 | 0.0% | 100.0% | 0.0% | 0.0% | 1059 |
| sheldor.mini.FoilistMC 1.0 | 4 | 1204 | 20.8% | 70.9% | 0.0% | 8.3% | 1283 |
| pez.rumble.Ali 0.4.9 | 4 | 412 | 21.3% | 70.6% | 0.0% | 8.1% | 1371 |
| catcat20.Lambda 0.017 | 4 | 1570 | 21.5% | 69.3% | 0.0% | 9.2% | 1036 |
| florent.XSeries.X2 0.17 | 4 | 1838 | 27.2% | 61.5% | 0.1% | 11.2% | 916 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 4 | 0 | 0 | 0.98 | 0 | 0 | 0 |
| jd.Nullstride 2.3.3 | 4 | 1 | 0 | 0 | 0.94 | 3 | 3 | 0 |
| jk.mega.DrussGT 3.1.16 | 4 | 2 | 0 | 0 | 1.91 | 1 | 1 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 4 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 2 | 0 | 0 | 1.71 | 1 | 1 | 0 |
| voidious.Diamond 1.8.22 | 4 | 2 | 0 | 0 | 1.31 | 2 | 2 | 0 |
| cb.fire.Firestarter 2.0f | 4 | 4 | 0 | 0 | 1.17 | 0 | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 3 | 0 | 0 | 0.77 | 1 | 1 | 0 |
| xander.cat.XanderCat 12.9 | 4 | 3 | 0 | 0 | 0.91 | 1 | 1 | 0 |
| lxx.Tomcat 3.68 | 4 | 2 | 0 | 0 | 1.47 | 2 | 2 | 0 |
| rsalesc.mega.Knight 0.6.28 | 4 | 2 | 0 | 0 | 1.55 | 2 | 2 | 0 |
| aw.Gilgalad 1.99.5c | 4 | 3 | 0 | 0 | 1.17 | 1 | 1 | 0 |
| pc.Wavelet 1.5 | 4 | 3 | 0 | 0 | 0.48 | 1 | 1 | 0 |
| gh.GresSuffurd 0.4.13 | 4 | 4 | 0 | 0 | 0.87 | 0 | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 4 | 4 | 0 | 0 | 0.43 | 0 | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 4 | 0 | 0 | 0.66 | 0 | 0 | 0 |
| cs.Nene 1.0.5 | 4 | 4 | 0 | 0 | 0.47 | 0 | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 4 | 3 | 0 | 0 | 1.69 | 0 | 0 | 0 |
| voidious.Dookious 1.573c | 4 | 3 | 0 | 0 | 0.46 | 1 | 1 | 0 |
| davidalves.Phoenix 1.02 | 4 | 4 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 2 | 0 | 0 | 1.41 | 2 | 2 | 0 |
| cb.Domogled 1.2 | 4 | 4 | 0 | 0 | 1.43 | 0 | 0 | 0 |
| mue.Ascendant 1.2.27 | 4 | 2 | 0 | 0 | 0.50 | 2 | 2 | 0 |
| abc.Shadow 3.83c | 4 | 3 | 0 | 0 | 0.56 | 1 | 1 | 0 |
| darkcanuck.Pris 0.92 | 4 | 1 | 0 | 0 | 0.30 | 3 | 3 | 0 |
| fromHell.BlackBox 0.0.2 | 4 | 4 | 0 | 0 | 0.56 | 0 | 0 | 0 |
| jk.precise.Wintermute 0.8 | 4 | 3 | 0 | 0 | 0.66 | 1 | 1 | 0 |
| kc.serpent.Hydra 0.21 | 4 | 4 | 0 | 0 | 0.40 | 0 | 0 | 0 |
| davidalves.Firebird 0.25 | 4 | 4 | 0 | 0 | 0.40 | 0 | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 4 | 3 | 0 | 0 | 0.41 | 1 | 1 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 4 | 0 | 1 | 1.08 | 0 | 0 | 0 |
| ags.Midboss 1q.fast | 4 | 3 | 0 | 0 | 0.86 | 1 | 1 | 0 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 2 | 0 | 0 | 0.86 | 2 | 2 | 0 |
| Krabb.sliNk.Garm 0.9u | 4 | 4 | 0 | 0 | 0.48 | 0 | 0 | 0 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 4 | 0 | 0 | 0.83 | 0 | 0 | 0 |
| mn.Combat 3.25.0 | 4 | 4 | 0 | 0 | 1.08 | 0 | 0 | 0 |
| cs.s2.Seraphim 2.3.1 | 4 | 3 | 0 | 1 | 1.07 | 0 | 0 | 0 |
| fromHell.CHCl3 1.4.2 | 4 | 3 | 0 | 0 | 0.61 | 1 | 1 | 0 |
| jk.mini.CunobelinDC 1.2 | 4 | 4 | 0 | 0 | 0.51 | 0 | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 4 | 4 | 0 | 0 | 1.07 | 0 | 0 | 0 |
| florent.test.Toad 0.14t | 4 | 2 | 0 | 0 | 0.53 | 2 | 2 | 0 |
| ar.horizon.Horizon 1.2.2 | 4 | 3 | 0 | 0 | 0.66 | 1 | 1 | 0 |
| cjm.chalk.Chalk 2.6.Be | 4 | 4 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 4 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 4 | 3 | 0 | 0 | 0.64 | 1 | 1 | 0 |
| pez.rumble.Ali 0.4.9 | 4 | 2 | 0 | 0 | 0.40 | 2 | 2 | 0 |
| catcat20.Lambda 0.017 | 4 | 3 | 0 | 0 | 0.79 | 1 | 1 | 0 |
| florent.XSeries.X2 0.17 | 4 | 3 | 0 | 0 | 0.62 | 1 | 1 | 0 |

150 of 192 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 19519 | 238 | 19568 | 19508 (99.9%) | 11 (0.1%) | 60 (0.3%) | 1403 | 135 | 118 |
| jd.Nullstride 2.3.3 | 17481 | 234 | 17545 | 17470 (99.9%) | 11 (0.1%) | 75 (0.4%) | 1273 | 94 | 104 |
| jk.mega.DrussGT 3.1.16 | 35885 | 5 | 35884 | 35881 (100.0%) | 4 (0.0%) | 3 (0.0%) | 2306 | 283 | 253 |
| oog.mega.saguaro.Saguaro 1.0 | 4786 | 8 | 4787 | 4784 (100.0%) | 2 (0.0%) | 3 (0.1%) | 331 | 78 | 13 |
| aaa.r.ScalarR 0.005h.053-noshield | 29252 | 16 | 29300 | 29251 (100.0%) | 1 (0.0%) | 49 (0.2%) | 2020 | 310 | 220 |
| voidious.Diamond 1.8.22 | 30662 | 642 | 30751 | 30641 (99.9%) | 21 (0.1%) | 110 (0.4%) | 2947 | 190 | 162 |
| cb.fire.Firestarter 2.0f | 32828 | 803 | 33409 | 32815 (100.0%) | 13 (0.0%) | 594 (1.8%) | 8731 | 273 | 146 |
| dsekercioglu.mega.Raven 3.56j8 | 12559 | 54 | 12561 | 12558 (100.0%) | 1 (0.0%) | 3 (0.0%) | 938 | 127 | 78 |
| xander.cat.XanderCat 12.9 | 13406 | 9 | 13436 | 13405 (100.0%) | 1 (0.0%) | 31 (0.2%) | 1672 | 204 | 91 |
| lxx.Tomcat 3.68 | 21820 | 393 | 21733 | 21728 (99.6%) | 92 (0.4%) | 5 (0.0%) | 1821 | 171 | 189 |
| rsalesc.mega.Knight 0.6.28 | 32603 | 303 | 32595 | 32589 (100.0%) | 14 (0.0%) | 6 (0.0%) | 2644 | 237 | 194 |
| aw.Gilgalad 1.99.5c | 19696 | 7 | 19718 | 19693 (100.0%) | 3 (0.0%) | 25 (0.1%) | 1786 | 220 | 142 |
| pc.Wavelet 1.5 | 10991 | 8 | 11011 | 10991 (100.0%) | 0 (0.0%) | 20 (0.2%) | 1113 | 107 | 39 |
| gh.GresSuffurd 0.4.13 | 9489 | 6 | 9490 | 9489 (100.0%) | 0 (0.0%) | 1 (0.0%) | 634 | 78 | 88 |
| kc.serpent.WaveSerpent 2.11 | 7831 | 4 | 7831 | 7831 (100.0%) | 0 (0.0%) | 0 (0.0%) | 595 | 64 | 20 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 10719 | 6 | 10726 | 10717 (100.0%) | 2 (0.0%) | 9 (0.1%) | 981 | 91 | 58 |
| cs.Nene 1.0.5 | 7746 | 57 | 7746 | 7743 (100.0%) | 3 (0.0%) | 3 (0.0%) | 448 | 74 | 46 |
| jk.melee.Neuromancer 7.12 | 21488 | 7 | 21507 | 21488 (100.0%) | 0 (0.0%) | 19 (0.1%) | 1949 | 169 | 197 |
| voidious.Dookious 1.573c | 7202 | 6 | 7202 | 7201 (100.0%) | 1 (0.0%) | 1 (0.0%) | 486 | 51 | 27 |
| davidalves.Phoenix 1.02 | 5798 | 0 | 5802 | 5798 (100.0%) | 0 (0.0%) | 4 (0.1%) | 2492 | 2 | 13 |
| rsalesc.roborio.Roborio 1.2.4 | 25224 | 4 | 25237 | 25222 (100.0%) | 2 (0.0%) | 15 (0.1%) | 2917 | 215 | 188 |
| cb.Domogled 1.2 | 23164 | 6 | 24037 | 23161 (100.0%) | 3 (0.0%) | 876 (3.6%) | 10428 | 170 | 162 |
| mue.Ascendant 1.2.27 | 6498 | 9 | 6498 | 6497 (100.0%) | 1 (0.0%) | 1 (0.0%) | 329 | 87 | 32 |
| abc.Shadow 3.83c | 8186 | 435 | 8114 | 8112 (99.1%) | 74 (0.9%) | 2 (0.0%) | 540 | 73 | 50 |
| darkcanuck.Pris 0.92 | 6184 | 29 | 6184 | 6184 (100.0%) | 0 (0.0%) | 0 (0.0%) | 319 | 82 | 21 |
| fromHell.BlackBox 0.0.2 | 7827 | 13 | 7827 | 7827 (100.0%) | 0 (0.0%) | 0 (0.0%) | 840 | 108 | 54 |
| jk.precise.Wintermute 0.8 | 9144 | 8 | 9145 | 9144 (100.0%) | 0 (0.0%) | 1 (0.0%) | 581 | 111 | 56 |
| kc.serpent.Hydra 0.21 | 9058 | 0 | 9058 | 9055 (100.0%) | 3 (0.0%) | 3 (0.0%) | 24 | 2 | 16 |
| davidalves.Firebird 0.25 | 6475 | 0 | 6476 | 6475 (100.0%) | 0 (0.0%) | 1 (0.0%) | 1911 | 2 | 18 |
| pulsar.PulsarMax 0.8.9 | 7517 | 2 | 7516 | 7516 (100.0%) | 1 (0.0%) | 0 (0.0%) | 490 | 44 | 27 |
| zyx.mega.YersiniaPestis 3.0 | 7093 | 351 | 7086 | 7083 (99.9%) | 10 (0.1%) | 3 (0.0%) | 545 | 84 | 73 |
| ags.Midboss 1q.fast | 7273 | 23 | 7273 | 7272 (100.0%) | 1 (0.0%) | 1 (0.0%) | 384 | 110 | 85 |
| pez.rumble.CassiusClay 2rho.02no | 12819 | 10 | 12854 | 12819 (100.0%) | 0 (0.0%) | 35 (0.3%) | 1343 | 140 | 86 |
| Krabb.sliNk.Garm 0.9u | 7666 | 5 | 7666 | 7664 (100.0%) | 2 (0.0%) | 2 (0.0%) | 467 | 68 | 31 |
| axeBots.SilverSurfer 2.53.33fix | 5948 | 8 | 6094 | 5948 (100.0%) | 0 (0.0%) | 146 (2.4%) | 1796 | 61 | 65 |
| mn.Combat 3.25.0 | 15898 | 11 | 15897 | 15895 (100.0%) | 3 (0.0%) | 2 (0.0%) | 1343 | 160 | 136 |
| cs.s2.Seraphim 2.3.1 | 6617 | 29 | 6617 | 6616 (100.0%) | 1 (0.0%) | 1 (0.0%) | 314 | 77 | 48 |
| fromHell.CHCl3 1.4.2 | 6380 | 5 | 6377 | 6377 (100.0%) | 3 (0.0%) | 0 (0.0%) | 473 | 63 | 73 |
| jk.mini.CunobelinDC 1.2 | 13586 | 144 | 13586 | 13586 (100.0%) | 0 (0.0%) | 0 (0.0%) | 10 | 1 | 36 |
| sheldor.mini.Foilist 1.3.1 | 12732 | 9 | 12732 | 12731 (100.0%) | 1 (0.0%) | 1 (0.0%) | 949 | 83 | 93 |
| florent.test.Toad 0.14t | 6870 | 8 | 6871 | 6869 (100.0%) | 1 (0.0%) | 2 (0.0%) | 494 | 50 | 25 |
| ar.horizon.Horizon 1.2.2 | 9405 | 9 | 9406 | 9404 (100.0%) | 1 (0.0%) | 2 (0.0%) | 674 | 90 | 66 |
| cjm.chalk.Chalk 2.6.Be | 7978 | 0 | 7978 | 7978 (100.0%) | 0 (0.0%) | 0 (0.0%) | 143 | 1 | 14 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 8837 | 207 | 8837 | 8837 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 1 | 14 |
| sheldor.mini.FoilistMC 1.0 | 12846 | 33 | 12847 | 12845 (100.0%) | 1 (0.0%) | 2 (0.0%) | 907 | 109 | 75 |
| pez.rumble.Ali 0.4.9 | 8212 | 38 | 8211 | 8204 (99.9%) | 8 (0.1%) | 7 (0.1%) | 2361 | 14 | 132 |
| catcat20.Lambda 0.017 | 8750 | 148 | 8730 | 8728 (99.7%) | 22 (0.3%) | 2 (0.0%) | 589 | 89 | 72 |
| florent.XSeries.X2 0.17 | 6715 | 5 | 6713 | 6713 (100.0%) | 2 (0.0%) | 0 (0.0%) | 515 | 60 | 89 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 19465 | 2068 (10.6%) | 18762 |
| jd.Nullstride 2.3.3 | 16949 | 1779 (10.5%) | 16550 |
| jk.mega.DrussGT 3.1.16 | 35690 | 4508 (12.6%) | 35660 |
| oog.mega.saguaro.Saguaro 1.0 | 5359 | 402 (7.5%) | 5342 |
| aaa.r.ScalarR 0.005h.053-noshield | 29458 | 3306 (11.2%) | 29024 |
| voidious.Diamond 1.8.22 | 30956 | 3392 (11.0%) | 30350 |
| cb.fire.Firestarter 2.0f | 38132 | 3489 (9.1%) | 37129 |
| dsekercioglu.mega.Raven 3.56j8 | 13494 | 1303 (9.7%) | 11309 |
| xander.cat.XanderCat 12.9 | 15875 | 1399 (8.8%) | 15004 |
| lxx.Tomcat 3.68 | 22113 | 2577 (11.7%) | 21714 |
| rsalesc.mega.Knight 0.6.28 | 32483 | 3862 (11.9%) | 32179 |
| aw.Gilgalad 1.99.5c | 20213 | 2077 (10.3%) | 19391 |
| pc.Wavelet 1.5 | 13676 | 1225 (9.0%) | 13063 |
| gh.GresSuffurd 0.4.13 | 9956 | 1020 (10.2%) | 9099 |
| kc.serpent.WaveSerpent 2.11 | 10174 | 753 (7.4%) | 7575 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 12812 | 1091 (8.5%) | 11923 |
| cs.Nene 1.0.5 | 8648 | 804 (9.3%) | 6918 |
| jk.melee.Neuromancer 7.12 | 22534 | 2286 (10.1%) | 21977 |
| voidious.Dookious 1.573c | 8959 | 720 (8.0%) | 6895 |
| davidalves.Phoenix 1.02 | 124 | 5782 (4662.9%) | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 30337 | 2696 (8.9%) | 30313 |
| cb.Domogled 1.2 | 30992 | 2501 (8.1%) | 29642 |
| mue.Ascendant 1.2.27 | 6979 | 587 (8.4%) | 5910 |
| abc.Shadow 3.83c | 9130 | 770 (8.4%) | 8223 |
| darkcanuck.Pris 0.92 | 6934 | 508 (7.3%) | 4448 |
| fromHell.BlackBox 0.0.2 | 7950 | 793 (10.0%) | 6948 |
| jk.precise.Wintermute 0.8 | 9749 | 1026 (10.5%) | 9269 |
| kc.serpent.Hydra 0.21 | 146 | 9056 (6202.7%) | 0 |
| davidalves.Firebird 0.25 | 133 | 6459 (4856.4%) | 0 |
| pulsar.PulsarMax 0.8.9 | 8914 | 755 (8.5%) | 8189 |
| zyx.mega.YersiniaPestis 3.0 | 8938 | 619 (6.9%) | 6045 |
| ags.Midboss 1q.fast | 7342 | 598 (8.1%) | 5827 |
| pez.rumble.CassiusClay 2rho.02no | 14143 | 1226 (8.7%) | 13554 |
| Krabb.sliNk.Garm 0.9u | 8505 | 732 (8.6%) | 7129 |
| axeBots.SilverSurfer 2.53.33fix | 10195 | 529 (5.2%) | 7759 |
| mn.Combat 3.25.0 | 16762 | 1757 (10.5%) | 15704 |
| cs.s2.Seraphim 2.3.1 | 7403 | 575 (7.8%) | 5077 |
| fromHell.CHCl3 1.4.2 | 7481 | 623 (8.3%) | 4159 |
| jk.mini.CunobelinDC 1.2 | 356 | 13443 (3776.1%) | 0 |
| sheldor.mini.Foilist 1.3.1 | 13008 | 1148 (8.8%) | 11044 |
| florent.test.Toad 0.14t | 8469 | 632 (7.5%) | 5259 |
| ar.horizon.Horizon 1.2.2 | 10361 | 956 (9.2%) | 9441 |
| cjm.chalk.Chalk 2.6.Be | 152 | 7977 (5248.0%) | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 340 | 8837 (2599.1%) | 0 |
| sheldor.mini.FoilistMC 1.0 | 12678 | 1234 (9.7%) | 11912 |
| pez.rumble.Ali 0.4.9 | 2143 | 6926 (323.2%) | 0 |
| catcat20.Lambda 0.017 | 9547 | 758 (7.9%) | 7798 |
| florent.XSeries.X2 0.17 | 8153 | 573 (7.0%) | 6488 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 537 | 650 | 1687 | 19.2 / 27.2 | 0 | 281 | 120 |
| jd.Nullstride 2.3.3 | 650 | 540 | 650 | 1519 | 19.2 / 26.4 | 2 | 805 | 36 |
| jk.mega.DrussGT 3.1.16 | 650 | 516 | 650 | 2979 | 28.5 / 32.1 | 15 | 4631 | 389 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 460 | 513 | 539 | 44.6 / 26.9 | 836 | 1563 | 228 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 485 | 650 | 2492 | 22.4 / 35.0 | 2 | 733 | 3 |
| voidious.Diamond 1.8.22 | 650 | 536 | 650 | 2594 | 21.6 / 32.3 | 66 | 9014 | 258 |
| cb.fire.Firestarter 2.0f | 650 | 549 | 650 | 3137 | 30.8 / 28.9 | 75 | 3432 | 86 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 456 | 650 | 1186 | 22.3 / 37.8 | 162 | 12117 | 1051 |
| xander.cat.XanderCat 12.9 | 650 | 447 | 650 | 1401 | 34.0 / 34.5 | 364 | 966 | 111 |
| lxx.Tomcat 3.68 | 650 | 513 | 650 | 1890 | 26.6 / 35.1 | 146 | 13917 | 0 |
| rsalesc.mega.Knight 0.6.28 | 650 | 512 | 650 | 2742 | 30.8 / 29.5 | 383 | 5443 | 0 |
| aw.Gilgalad 1.99.5c | 650 | 469 | 650 | 1718 | 26.4 / 35.7 | 248 | 22891 | 5 |
| pc.Wavelet 1.5 | 650 | 439 | 650 | 1225 | 30.2 / 30.8 | 106 | 2994 | 30 |
| gh.GresSuffurd 0.4.13 | 650 | 459 | 650 | 917 | 32.6 / 35.5 | 312 | 3074 | 42 |
| kc.serpent.WaveSerpent 2.11 | 650 | 474 | 650 | 915 | 23.2 / 33.7 | 87 | 5719 | 1 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 468 | 650 | 1133 | 33.2 / 30.0 | 226 | 8393 | 112 |
| cs.Nene 1.0.5 | 650 | 477 | 650 | 788 | 23.8 / 34.0 | 37 | 6247 | 1269 |
| jk.melee.Neuromancer 7.12 | 650 | 532 | 650 | 1906 | 31.4 / 33.4 | 137 | 6922 | 6 |
| voidious.Dookious 1.573c | 650 | 485 | 650 | 826 | 25.7 / 33.2 | 81 | 4002 | 2454 |
| davidalves.Phoenix 1.02 | 650 | 400 | 650 | 1090 | 0.0 / 0.9 | 0 | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 650 | 503 | 650 | 2586 | 45.7 / 25.0 | 717 | 1959 | 56 |
| cb.Domogled 1.2 | 650 | 562 | 650 | 2592 | 39.1 / 21.1 | 417 | 3345 | 65 |
| mue.Ascendant 1.2.27 | 650 | 413 | 650 | 683 | 30.4 / 39.1 | 178 | 1594 | 0 |
| abc.Shadow 3.83c | 650 | 458 | 650 | 836 | 23.8 / 37.8 | 118 | 4978 | 180 |
| darkcanuck.Pris 0.92 | 650 | 410 | 650 | 680 | 33.3 / 40.1 | 324 | 1736 | 714 |
| fromHell.BlackBox 0.0.2 | 650 | 413 | 463 | 775 | 36.3 / 34.0 | 1489 | 1577 | 89 |
| jk.precise.Wintermute 0.8 | 650 | 456 | 650 | 898 | 31.3 / 34.1 | 86 | 5037 | 144 |
| kc.serpent.Hydra 0.21 | 650 | 344 | 650 | 1238 | 0.0 / 0.1 | 0 | 0 | 0 |
| davidalves.Firebird 0.25 | 650 | 395 | 650 | 1129 | 0.0 / 1.1 | 0 | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 650 | 488 | 650 | 813 | 25.8 / 31.4 | 39 | 6026 | 17 |
| zyx.mega.YersiniaPestis 3.0 | 650 | 445 | 650 | 822 | 27.1 / 37.2 | 106 | 3246 | 71 |
| ags.Midboss 1q.fast | 650 | 410 | 588 | 714 | 44.9 / 27.9 | 590 | 2222 | 406 |
| pez.rumble.CassiusClay 2rho.02no | 650 | 474 | 625 | 1282 | 41.6 / 26.6 | 407 | 1312 | 65 |
| Krabb.sliNk.Garm 0.9u | 650 | 531 | 650 | 788 | 28.9 / 29.7 | 150 | 2815 | 2201 |
| axeBots.SilverSurfer 2.53.33fix | 650 | 494 | 650 | 926 | 35.9 / 29.7 | 124 | 1328 | 36 |
| mn.Combat 3.25.0 | 650 | 487 | 650 | 1435 | 25.4 / 34.5 | 215 | 12175 | 58 |
| cs.s2.Seraphim 2.3.1 | 650 | 484 | 650 | 704 | 33.5 / 34.8 | 120 | 1209 | 610 |
| fromHell.CHCl3 1.4.2 | 650 | 438 | 463 | 735 | 36.4 / 27.7 | 758 | 1195 | 0 |
| jk.mini.CunobelinDC 1.2 | 650 | 518 | 650 | 1257 | 0.1 / 1.1 | 0 | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 650 | 566 | 650 | 1146 | 34.4 / 28.7 | 403 | 9236 | 33 |
| florent.test.Toad 0.14t | 650 | 498 | 650 | 801 | 30.7 / 32.3 | 256 | 3232 | 64 |
| ar.horizon.Horizon 1.2.2 | 650 | 484 | 650 | 947 | 29.6 / 32.7 | 203 | 5396 | 21 |
| cjm.chalk.Chalk 2.6.Be | 650 | 422 | 650 | 1218 | 0.0 / 0.1 | 0 | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 650 | 359 | 650 | 909 | 0.1 / 1.2 | 0 | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 650 | 578 | 556 | 1134 | 37.1 / 24.4 | 225 | 6019 | 939 |
| pez.rumble.Ali 0.4.9 | 650 | 386 | 650 | 1226 | 3.4 / 8.3 | 0 | 1918 | 9 |
| catcat20.Lambda 0.017 | 650 | 543 | 650 | 885 | 34.9 / 31.1 | 261 | 2555 | 1 |
| florent.XSeries.X2 0.17 | 650 | 491 | 625 | 765 | 28.5 / 32.3 | 214 | 2940 | 1 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 8.6% | 137 | 82 | 3 | 138.7 | 2064 / 2068 (100%) | 0 | 0 |
| jd.Nullstride 2.3.3 | 8.6% | 131 | 83 | 3 | 118.6 | 1778 / 1779 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.6% | 268 | 106 | 3 | 253.9 | 4504 / 4508 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 7.1% | 54 | 15 | 3 | 34.0 | 402 / 402 (100%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 11.1% | 240 | 176 | 3 | 207.0 | 3302 / 3306 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 9.5% | 184 | 106 | 3 | 218.2 | 3388 / 3392 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 9.6% | 164 | 767 | 3 | 238.0 | 3472 / 3489 (100%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 9.3% | 108 | 73 | 3 | 88.8 | 1298 / 1303 (100%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 9.2% | 128 | 66 | 3 | 95.1 | 1398 / 1399 (100%) | 0 | 0 |
| lxx.Tomcat 3.68 | 10.3% | 206 | 89 | 3 | 154.2 | 2574 / 2577 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 10.1% | 217 | 106 | 3 | 229.9 | 3861 / 3862 (100%) | 0 | 0 |
| aw.Gilgalad 1.99.5c | 10.4% | 164 | 89 | 3 | 140.1 | 2074 / 2077 (100%) | 0 | 0 |
| pc.Wavelet 1.5 | 8.5% | 67 | 68 | 3 | 78.0 | 1224 / 1225 (100%) | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 9.3% | 122 | 45 | 3 | 67.2 | 1018 / 1020 (100%) | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 7.9% | 60 | 5987 | 3 | 55.7 | 753 / 753 (100%) | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 7.9% | 92 | 57 | 3 | 76.4 | 1089 / 1091 (100%) | 0 | 0 |
| cs.Nene 1.0.5 | 7.7% | 66 | 53 | 3 | 55.2 | 798 / 804 (99%) | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 10.0% | 236 | 74 | 3 | 152.7 | 2280 / 2286 (100%) | 0 | 0 |
| voidious.Dookious 1.573c | 7.7% | 64 | 53 | 3 | 51.2 | 719 / 720 (100%) | 0 | 0 |
| davidalves.Phoenix 1.02 | 0.2% | 53 | 10 | 3 | 0.0 | 0 / 5782 (0%) | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 9.9% | 198 | 108 | 3 | 178.1 | 2694 / 2696 (100%) | 0 | 0 |
| cb.Domogled 1.2 | 8.0% | 200 | 104 | 3 | 170.9 | 2489 / 2501 (100%) | 0 | 0 |
| mue.Ascendant 1.2.27 | 8.5% | 70 | 39 | 3 | 45.3 | 585 / 587 (100%) | 0 | 0 |
| abc.Shadow 3.83c | 8.6% | 78 | 49 | 3 | 57.5 | 768 / 770 (100%) | 0 | 0 |
| darkcanuck.Pris 0.92 | 9.4% | 42 | 38 | 3 | 43.0 | 504 / 508 (99%) | 0 | 0 |
| fromHell.BlackBox 0.0.2 | 9.5% | 78 | 36 | 3 | 55.2 | 793 / 793 (100%) | 0 | 0 |
| jk.precise.Wintermute 0.8 | 8.3% | 93 | 48 | 3 | 64.8 | 1025 / 1026 (100%) | 0 | 0 |
| kc.serpent.Hydra 0.21 | 0.0% | 56 | 7 | 3 | 0.0 | 0 / 9056 (0%) | 0 | 0 |
| davidalves.Firebird 0.25 | 0.2% | 56 | 13 | 3 | 0.0 | 0 / 6459 (0%) | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 7.1% | 57 | 50 | 3 | 53.2 | 755 / 755 (100%) | 0 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 8.6% | 151 | 69 | 3 | 50.4 | 619 / 619 (100%) | 0 | 0 |
| ags.Midboss 1q.fast | 8.6% | 121 | 32 | 3 | 51.5 | 598 / 598 (100%) | 0 | 0 |
| pez.rumble.CassiusClay 2rho.02no | 7.9% | 121 | 59 | 3 | 88.8 | 1224 / 1226 (100%) | 0 | 0 |
| Krabb.sliNk.Garm 0.9u | 7.1% | 67 | 49 | 2 | 54.7 | 732 / 732 (100%) | 0 | 0 |
| axeBots.SilverSurfer 2.53.33fix | 7.1% | 116 | 63 | 3 | 43.5 | 529 / 529 (100%) | 0 | 0 |
| mn.Combat 3.25.0 | 9.6% | 151 | 78 | 3 | 113.2 | 1751 / 1757 (100%) | 0 | 0 |
| cs.s2.Seraphim 2.3.1 | 8.0% | 150 | 37 | 3 | 47.1 | 575 / 575 (100%) | 0 | 0 |
| fromHell.CHCl3 1.4.2 | 6.9% | 85 | 38 | 3 | 45.0 | 622 / 623 (100%) | 0 | 0 |
| jk.mini.CunobelinDC 1.2 | 1.1% | 71 | 11 | 3 | 0.0 | 0 / 13443 (0%) | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 8.3% | 150 | 52 | 3 | 90.6 | 1146 / 1148 (100%) | 0 | 0 |
| florent.test.Toad 0.14t | 7.6% | 74 | 42 | 3 | 48.3 | 629 / 632 (100%) | 0 | 0 |
| ar.horizon.Horizon 1.2.2 | 8.5% | 92 | 52 | 3 | 66.3 | 954 / 956 (100%) | 0 | 0 |
| cjm.chalk.Chalk 2.6.Be | 0.0% | 54 | 8 | 3 | 0.0 | 0 / 7977 (0%) | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 1.6% | 52 | 5 | 3 | 0.0 | 0 / 8837 (0%) | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 6.9% | 89 | 64 | 3 | 91.0 | 1230 / 1234 (100%) | 0 | 0 |
| pez.rumble.Ali 0.4.9 | 2.0% | 56 | 15 | 3 | 8.2 | 99 / 6926 (1%) | 0 | 0 |
| catcat20.Lambda 0.017 | 7.9% | 110 | 73 | 3 | 61.8 | 756 / 758 (100%) | 0 | 0 |
| florent.XSeries.X2 0.17 | 7.3% | 87 | 62 | 3 | 47.5 | 573 / 573 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| jd.Nullstride 2.3.3 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| voidious.Diamond 1.8.22 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| cb.fire.Firestarter 2.0f | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| xander.cat.XanderCat 12.9 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| lxx.Tomcat 3.68 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| aw.Gilgalad 1.99.5c | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| pc.Wavelet 1.5 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| gh.GresSuffurd 0.4.13 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| cs.Nene 1.0.5 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| jk.melee.Neuromancer 7.12 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| voidious.Dookious 1.573c | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| davidalves.Phoenix 1.02 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| cb.Domogled 1.2 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| mue.Ascendant 1.2.27 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| abc.Shadow 3.83c | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| darkcanuck.Pris 0.92 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| fromHell.BlackBox 0.0.2 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| jk.precise.Wintermute 0.8 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| kc.serpent.Hydra 0.21 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| davidalves.Firebird 0.25 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| ags.Midboss 1q.fast | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| pez.rumble.CassiusClay 2rho.02no | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| Krabb.sliNk.Garm 0.9u | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| axeBots.SilverSurfer 2.53.33fix | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| mn.Combat 3.25.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| cs.s2.Seraphim 2.3.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| fromHell.CHCl3 1.4.2 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| jk.mini.CunobelinDC 1.2 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| florent.test.Toad 0.14t | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| ar.horizon.Horizon 1.2.2 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| cjm.chalk.Chalk 2.6.Be | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| pez.rumble.Ali 0.4.9 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| catcat20.Lambda 0.017 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| florent.XSeries.X2 0.17 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | kc.mega.BeepBoop | 1 | 35 | 296 | 9.9% | 8.2% ± 1.2 | 6.2% | 21.3% / 20.2% | 0.3% | 0 / 0 | T3/M1 | 26% |
| jd.Nullstride 2.3.3 | jd.Nullstride | 1 | 35 | 288 | 9.4% | 8.0% ± 0.9 | 6.1% | 20.1% / 21.1% | 0.1% | 0 / 0 | T3/M1 | 29% |
| jk.mega.DrussGT 3.1.16 | jk.mega.DrussGT | 1 | 35 | 298 | 11.0% | 9.0% ± 0.9 | 8.4% | 23.7% / 20.9% | 1.7% | 0 / 0 | T3/M1 | 48% |
| oog.mega.saguaro.Saguaro 1.0 | oog.mega.saguaro.Saguaro | 1 | 35 | 328 | 8.5% | 7.2% ± 1.5 | 15.8% | 27.4% / 26.8% | 7.6% | 0 / 0 | T3/M0 | 77% |
| aaa.r.ScalarR 0.005h.053-noshield | aaa.r.ScalarR | 1 | 35 | 316 | 11.0% | 8.5% ± 1.2 | 7.3% | 23.8% / 21.6% | 0.0% | 0 / 0 | T3/M1 | 37% |
| voidious.Diamond 1.8.22 | voidious.Diamond | 1 | 35 | 302 | 8.8% | 7.8% ± 0.8 | 7.4% | 22.7% / 21.7% | 9.4% | 0 / 0 | T3/M1 | 43% |
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 1 | 35 | 310 | 9.2% | 7.8% ± 0.9 | 8.8% | 20.7% / 21.5% | 3.2% | 0 / 0 | T3/M1 | 48% |
| dsekercioglu.mega.Raven 3.56j8 | dsekercioglu.mega.Raven | 1 | 35 | 330 | 9.6% | 7.4% ± 0.9 | 9.8% | 20.8% / 20.8% | 11.1% | 0 / 0 | T3/M1 | 55% |
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 1 | 35 | 314 | 10.6% | 8.1% ± 1.1 | 11.5% | 23.4% / 22.2% | 8.7% | 0 / 0 | T3/M1 | 63% |
| lxx.Tomcat 3.68 | lxx.Tomcat | 1 | 35 | 274 | 10.3% | 8.7% ± 1.1 | 10.3% | 22.6% / 21.2% | 8.7% | 0 / 0 | T3/M1 | 55% |
| rsalesc.mega.Knight 0.6.28 | rsalesc.mega.Knight | 1 | 35 | 314 | 11.0% | 8.8% ± 1.2 | 10.3% | 23.5% / 20.6% | 11.9% | 0 / 0 | T3/M1 | 56% |
| aw.Gilgalad 1.99.5c | aw.Gilgalad | 1 | 35 | 284 | 11.1% | 8.8% ± 1.0 | 8.8% | 21.4% / 21.0% | 3.6% | 0 / 0 | T3/M1 | 51% |
| pc.Wavelet 1.5 | pc.Wavelet | 1 | 35 | 272 | 9.0% | 7.2% ± 1.1 | 10.5% | 21.1% / 21.6% | 10.2% | 0 / 0 | T3/M1 | 56% |
| gh.GresSuffurd 0.4.13 | gh.GresSuffurd | 1 | 35 | 294 | 10.2% | 8.4% ± 1.2 | 10.9% | 24.3% / 22.9% | 13.6% | 0 / 0 | T3/M1 | 65% |
| kc.serpent.WaveSerpent 2.11 | kc.serpent.WaveSerpent | 1 | 35 | 322 | 8.5% | 7.8% ± 1.2 | 9.6% | 21.8% / 23.1% | 11.8% | 0 / 0 | T3/M1 | 60% |
| dsekercioglu.mega.WhiteFang 2.8.1 | dsekercioglu.mega.WhiteFang | 1 | 35 | 344 | 8.7% | 7.2% ± 1.0 | 10.8% | 22.7% / 21.9% | 13.6% | 0 / 0 | T3/M1 | 63% |
| cs.Nene 1.0.5 | cs.Nene | 1 | 35 | 264 | 8.1% | 7.3% ± 1.2 | 9.3% | 24.5% / 24.1% | 9.1% | 0 / 0 | T3/M1 | 59% |
| jk.melee.Neuromancer 7.12 | jk.melee.Neuromancer | 1 | 35 | 314 | 9.5% | 8.1% ± 1.1 | 10.1% | 23.4% / 22.4% | 0.0% | 0 / 0 | T3/M1 | 59% |
| voidious.Dookious 1.573c | voidious.Dookious | 1 | 35 | 306 | 9.2% | 8.5% ± 1.4 | 10.9% | 22.4% / 21.4% | 11.7% | 0 / 0 | T3/M1 | 57% |
| davidalves.Phoenix 1.02 | davidalves.Phoenix | 1 | 35 | 306 | 0.1% | 14.5% ± 38.9 | 0.0% | - / - | 3.3% | 0 / 0 | T?/M? | 100% |
| rsalesc.roborio.Roborio 1.2.4 | rsalesc.roborio.Roborio | 1 | 35 | 328 | 10.9% | 8.6% ± 1.0 | 11.7% | 23.7% / 20.6% | 14.0% | 0 / 0 | T3/M1 | 62% |
| cb.Domogled 1.2 | cb.Domogled | 1 | 35 | 276 | 8.3% | 7.2% ± 0.8 | 10.6% | 23.7% / 23.4% | 2.7% | 0 / 0 | T3/M1 | 56% |
| mue.Ascendant 1.2.27 | mue.Ascendant | 1 | 35 | 290 | 9.1% | 7.6% ± 1.3 | 10.6% | 21.4% / 22.0% | 4.4% | 0 / 0 | T3/M1 | 52% |
| abc.Shadow 3.83c | abc.Shadow | 1 | 35 | 276 | 9.4% | 8.1% ± 1.3 | 9.4% | 20.1% / 19.7% | 8.4% | 0 / 0 | T3/M1 | 49% |
| darkcanuck.Pris 0.92 | darkcanuck.Pris | 1 | 35 | 294 | 10.3% | 8.1% ± 1.4 | 11.0% | 27.5% / 21.4% | 9.5% | 0 / 0 | T3/M0 | 54% |
| fromHell.BlackBox 0.0.2 | fromHell.BlackBox | 1 | 35 | 304 | 10.3% | 7.7% ± 1.2 | 15.0% | 26.5% / 27.0% | 3.4% | 0 / 0 | T3/M0 | 55% |
| jk.precise.Wintermute 0.8 | jk.precise.Wintermute | 1 | 35 | 316 | 8.5% | 7.0% ± 1.1 | 10.8% | 22.5% / 22.2% | 8.7% | 0 / 0 | T3/M1 | 66% |
| kc.serpent.Hydra 0.21 | kc.serpent.Hydra | 1 | 35 | 298 | 0.0% | 0.0% ± 42.9 | 0.2% | - / - | 1.0% | 0 / 0 | T?/M? | 100% |
| davidalves.Firebird 0.25 | davidalves.Firebird | 1 | 35 | 310 | 0.4% | 66.3% ± 28.9 | 0.0% | - / - | 3.4% | 0 / 0 | T?/M? | 94% |
| pulsar.PulsarMax 0.8.9 | pulsar.PulsarMax | 1 | 35 | 300 | 8.2% | 8.0% ± 1.3 | 9.5% | 22.2% / 23.1% | 3.5% | 0 / 0 | T3/M1 | 56% |
| zyx.mega.YersiniaPestis 3.0 | zyx.mega.YersiniaPestis | 1 | 35 | 324 | 9.0% | 7.7% ± 1.3 | 10.3% | 22.9% / 22.1% | 8.8% | 0 / 0 | T3/M1 | 59% |
| ags.Midboss 1q.fast | ags.Midboss | 1 | 35 | 284 | 9.1% | 7.0% ± 1.3 | 13.8% | 25.5% / 24.5% | 9.8% | 0 / 0 | T2/M0 | 77% |
| pez.rumble.CassiusClay 2rho.02no | pez.rumble.CassiusClay | 1 | 35 | 332 | 10.1% | 8.0% ± 1.0 | 13.0% | 20.9% / 21.3% | 9.1% | 0 / 0 | T3/M1 | 66% |
| Krabb.sliNk.Garm 0.9u | Krabb.sliNk.Garm | 1 | 35 | 298 | 7.3% | 7.4% ± 1.3 | 10.3% | 25.6% / 24.2% | 6.5% | 0 / 0 | T3/M0 | 69% |
| axeBots.SilverSurfer 2.53.33fix | axeBots.SilverSurfer | 1 | 35 | 326 | 7.6% | 7.0% ± 1.4 | 11.2% | 25.0% / 25.4% | 12.2% | 0 / 0 | T3/M0 | 69% |
| mn.Combat 3.25.0 | mn.Combat | 1 | 35 | 274 | 9.5% | 7.8% ± 0.9 | 10.6% | 22.7% / 21.6% | 11.6% | 0 / 0 | T3/M1 | 51% |
| cs.s2.Seraphim 2.3.1 | cs.s2.Seraphim | 1 | 35 | 292 | 8.5% | 8.1% ± 1.4 | 10.9% | 26.5% / 22.7% | 16.1% | 0 / 0 | T3/M0 | 67% |
| fromHell.CHCl3 1.4.2 | fromHell.CHCl3 | 1 | 35 | 292 | 6.7% | 5.7% ± 1.2 | 12.7% | 26.2% / 25.8% | 3.3% | 0 / 0 | T2/M0 | 81% |
| jk.mini.CunobelinDC 1.2 | jk.mini.CunobelinDC | 1 | 35 | 308 | 1.1% | 34.0% ± 39.8 | 33.0% | - / - | 2.8% | 0 / 0 | T?/M? | 99% |
| sheldor.mini.Foilist 1.3.1 | sheldor.mini.Foilist | 1 | 35 | 316 | 9.0% | 8.7% ± 1.0 | 11.2% | 23.7% / 24.0% | 7.2% | 0 / 0 | T3/M1 | 66% |
| florent.test.Toad 0.14t | florent.test.Toad | 1 | 35 | 304 | 7.6% | 7.2% ± 1.3 | 10.4% | 19.4% / 22.6% | 3.3% | 0 / 0 | T3/M2 | 68% |
| ar.horizon.Horizon 1.2.2 | ar.horizon.Horizon | 1 | 35 | 308 | 8.9% | 8.1% ± 1.2 | 10.0% | 23.1% / 21.7% | 9.9% | 0 / 0 | T3/M1 | 61% |
| cjm.chalk.Chalk 2.6.Be | cjm.chalk.Chalk | 1 | 35 | 298 | 0.0% | - | 0.2% | 1.7% / 15.1% | 2.5% | 0 / 0 | T?/M? | 100% |
| wcsv.PowerHouse.PowerHouse 1.7e3 | wcsv.PowerHouse.PowerHouse | 1 | 35 | 340 | 2.0% | 42.4% ± 22.9 | 8.8% | 34.6% / 18.0% | 6.4% | 0 / 0 | T?/M? | 96% |
| sheldor.mini.FoilistMC 1.0 | sheldor.mini.FoilistMC | 1 | 35 | 320 | 7.1% | 6.9% ± 0.9 | 11.2% | 24.8% / 25.5% | 3.6% | 0 / 0 | T2/M1 | 77% |
| pez.rumble.Ali 0.4.9 | pez.rumble.Ali | 1 | 35 | 292 | 2.2% | 7.2% ± 2.5 | 5.9% | 15.7% / 28.9% | 4.6% | 0 / 0 | T3/M? | 80% |
| catcat20.Lambda 0.017 | catcat20.Lambda | 1 | 35 | 296 | 9.0% | 8.7% ± 1.2 | 11.3% | 26.8% / 25.1% | 1.1% | 0 / 0 | T3/M0 | 68% |
| florent.XSeries.X2 0.17 | florent.XSeries.X2 | 1 | 35 | 306 | 9.0% | 8.2% ± 1.3 | 11.3% | 20.9% / 21.0% | 5.3% | 0 / 0 | T3/M1 | 54% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.13hjswpwf8 vs hadur2.Hadur 3.13hjsw

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 23.4% ± 3.0 | 21.7% ± 5.0 | +1.7 ± 4.9 |
| jd.Nullstride 2.3.3 | 24.9% ± 5.9 | 23.1% ± 4.4 | +1.8 ± 6.5 |
| jk.mega.DrussGT 3.1.16 | 46.7% ± 10.8 | 48.5% ± 12.0 | -1.8 ± 21.4 |
| oog.mega.saguaro.Saguaro 1.0 | 73.4% ± 6.0 | 74.4% ± 8.4 | -0.9 ± 10.4 |
| aaa.r.ScalarR 0.005h.053-noshield | 27.8% ± 13.1 | 28.7% ± 11.4 | -0.8 ± 17.3 |
| voidious.Diamond 1.8.22 | 47.2% ± 9.5 | 48.4% ± 14.6 | -1.1 ± 14.6 |
| cb.fire.Firestarter 2.0f | 48.1% ± 3.1 | 50.7% ± 5.6 | -2.5 ± 8.3 |
| dsekercioglu.mega.Raven 3.56j8 | 51.8% ± 4.9 | 51.4% ± 12.7 | +0.4 ± 8.1 |
| xander.cat.XanderCat 12.9 | 55.6% ± 9.2 | 58.5% ± 3.9 | -2.9 ± 11.5 |
| lxx.Tomcat 3.68 | 53.6% ± 8.6 | 56.7% ± 7.9 | -3.1 ± 5.2 |
| rsalesc.mega.Knight 0.6.28 | 50.5% ± 7.1 | 53.8% ± 7.3 | -3.3 ± 9.2 |
| aw.Gilgalad 1.99.5c | 51.3% ± 14.4 | 43.5% ± 6.8 | +7.8 ± 16.0 |
| pc.Wavelet 1.5 | 51.6% ± 9.1 | 48.3% ± 12.2 | +3.3 ± 5.7 |
| gh.GresSuffurd 0.4.13 | 57.4% ± 11.3 | 60.0% ± 4.7 | -2.6 ± 9.9 |
| kc.serpent.WaveSerpent 2.11 | 57.7% ± 4.5 | 59.3% ± 9.6 | -1.5 ± 5.6 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 67.6% ± 5.8 | 70.5% ± 8.7 | -2.9 ± 6.2 |
| cs.Nene 1.0.5 | 60.9% ± 7.0 | 59.3% ± 5.4 | +1.6 ± 10.6 |
| jk.melee.Neuromancer 7.12 | 48.9% ± 15.3 | 42.3% ± 9.8 | +6.5 ± 24.8 |
| voidious.Dookious 1.573c | 57.2% ± 13.2 | 57.2% ± 12.5 | +0.0 ± 25.7 |
| davidalves.Phoenix 1.02 | 98.5% ± 1.2 | 98.6% ± 1.1 | -0.1 ± 0.4 |
| rsalesc.roborio.Roborio 1.2.4 | 60.0% ± 4.8 | 57.5% ± 6.5 | +2.6 ± 8.8 |
| cb.Domogled 1.2 | 58.4% ± 2.6 | 57.9% ± 14.5 | +0.5 ± 16.8 |
| mue.Ascendant 1.2.27 | 53.0% ± 7.6 | 62.7% ± 7.9 | -9.8 ± 13.4 |
| abc.Shadow 3.83c | 52.8% ± 6.2 | 51.2% ± 10.2 | +1.6 ± 12.9 |
| darkcanuck.Pris 0.92 | 51.4% ± 9.6 | 63.9% ± 6.5 | -12.5 ± 14.4 |
| fromHell.BlackBox 0.0.2 | 60.5% ± 10.7 | 64.4% ± 8.6 | -3.9 ± 19.3 |
| jk.precise.Wintermute 0.8 | 66.6% ± 4.9 | 56.5% ± 11.3 | +10.1 ± 12.6 |
| kc.serpent.Hydra 0.21 | 99.8% ± 0.4 | 99.9% ± 0.3 | -0.1 ± 0.7 |
| davidalves.Firebird 0.25 | 97.5% ± 3.8 | 95.0% ± 6.8 | +2.5 ± 9.2 |
| pulsar.PulsarMax 0.8.9 | 63.4% ± 8.8 | 61.4% ± 7.2 | +2.0 ± 13.3 |
| zyx.mega.YersiniaPestis 3.0 | 56.7% ± 8.9 | 55.4% ± 11.3 | +1.3 ± 19.8 |
| ags.Midboss 1q.fast | 74.3% ± 7.0 | 71.6% ± 7.4 | +2.6 ± 12.1 |
| pez.rumble.CassiusClay 2rho.02no | 66.0% ± 4.6 | 57.0% ± 6.3 | +9.0 ± 8.5 |
| Krabb.sliNk.Garm 0.9u | 64.8% ± 9.4 | 66.7% ± 7.0 | -1.8 ± 10.0 |
| axeBots.SilverSurfer 2.53.33fix | 68.1% ± 6.7 | 67.7% ± 13.8 | +0.4 ± 15.2 |
| mn.Combat 3.25.0 | 52.1% ± 2.3 | 52.2% ± 9.9 | -0.1 ± 8.2 |
| cs.s2.Seraphim 2.3.1 | 64.1% ± 7.9 | 72.5% ± 8.4 | -8.4 ± 12.2 |
| fromHell.CHCl3 1.4.2 | 70.4% ± 13.4 | 71.8% ± 8.5 | -1.5 ± 11.1 |
| jk.mini.CunobelinDC 1.2 | 98.2% ± 0.7 | 95.7% ± 8.2 | +2.5 ± 8.4 |
| sheldor.mini.Foilist 1.3.1 | 67.1% ± 3.3 | 62.3% ± 4.1 | +4.9 ± 3.7 |
| florent.test.Toad 0.14t | 62.3% ± 10.8 | 59.8% ± 13.7 | +2.5 ± 19.3 |
| ar.horizon.Horizon 1.2.2 | 59.1% ± 3.7 | 56.5% ± 7.6 | +2.6 ± 8.5 |
| cjm.chalk.Chalk 2.6.Be | 99.9% ± 0.3 | 99.7% ± 0.7 | +0.2 ± 0.7 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 98.0% ± 1.7 | 98.3% ± 0.5 | -0.3 ± 1.5 |
| sheldor.mini.FoilistMC 1.0 | 73.4% ± 6.3 | 72.8% ± 3.7 | +0.7 ± 5.7 |
| pez.rumble.Ali 0.4.9 | 84.4% ± 11.4 | 85.1% ± 17.9 | -0.7 ± 21.0 |
| catcat20.Lambda 0.017 | 66.8% ± 11.4 | 66.2% ± 6.0 | +0.5 ± 15.2 |
| florent.XSeries.X2 0.17 | 59.0% ± 11.5 | 64.1% ± 6.7 | -5.1 ± 15.6 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | +1.7 ± 4.9 | +2.1 ± 8.6 | +2.1 ± 8.6 | +1.2 ± 4.0 |
| jd.Nullstride 2.3.3 | +1.8 ± 6.5 | +2.8 ± 13.5 | +2.1 ± 14.1 | +1.2 ± 5.2 |
| jk.mega.DrussGT 3.1.16 | -1.8 ± 21.4 | -2.9 ± 30.6 | -2.9 ± 30.6 | -0.6 ± 9.7 |
| oog.mega.saguaro.Saguaro 1.0 | -0.9 ± 10.4 | -2.1 ± 10.7 | -2.1 ± 10.7 | +0.4 ± 12.1 |
| aaa.r.ScalarR 0.005h.053-noshield | -0.8 ± 17.3 | -1.3 ± 27.1 | -0.7 ± 26.9 | -1.0 ± 6.3 |
| voidious.Diamond 1.8.22 | -1.1 ± 14.6 | -1.2 ± 17.7 | -1.4 ± 17.6 | -1.0 ± 9.2 |
| cb.fire.Firestarter 2.0f | -2.5 ± 8.3 | -3.6 ± 13.6 | -3.6 ± 13.6 | -0.8 ± 4.1 |
| dsekercioglu.mega.Raven 3.56j8 | +0.4 ± 8.1 | +2.9 ± 10.5 | +2.9 ± 10.5 | -2.3 ± 5.6 |
| xander.cat.XanderCat 12.9 | -2.9 ± 11.5 | -2.1 ± 12.0 | -2.1 ± 12.0 | -3.0 ± 8.8 |
| lxx.Tomcat 3.68 | -3.1 ± 5.2 | -6.8 ± 6.1 | -7.1 ± 5.9 | -0.6 ± 4.6 |
| rsalesc.mega.Knight 0.6.28 | -3.3 ± 9.2 | -6.4 ± 17.6 | -6.4 ± 17.6 | -0.1 ± 4.9 |
| aw.Gilgalad 1.99.5c | +7.8 ± 16.0 | +9.9 ± 26.0 | +10.0 ± 26.4 | +5.5 ± 6.3 |
| pc.Wavelet 1.5 | +3.3 ± 5.7 | +10.7 ± 8.6 | +10.7 ± 8.6 | -4.0 ± 9.3 |
| gh.GresSuffurd 0.4.13 | -2.6 ± 9.9 | -2.9 ± 12.3 | -2.9 ± 12.3 | -2.1 ± 7.7 |
| kc.serpent.WaveSerpent 2.11 | -1.5 ± 5.6 | -1.4 ± 5.9 | -1.4 ± 5.9 | -1.3 ± 6.6 |
| dsekercioglu.mega.WhiteFang 2.8.1 | -2.9 ± 6.2 | -4.3 ± 11.4 | -4.3 ± 11.4 | -1.8 ± 1.8 |
| cs.Nene 1.0.5 | +1.6 ± 10.6 | +2.1 ± 17.2 | +2.1 ± 17.2 | +1.2 ± 3.7 |
| jk.melee.Neuromancer 7.12 | +6.5 ± 24.8 | +10.7 ± 42.9 | +10.7 ± 42.9 | +2.0 ± 6.9 |
| voidious.Dookious 1.573c | +0.0 ± 25.7 | -2.1 ± 41.4 | -2.1 ± 41.4 | +2.3 ± 9.6 |
| davidalves.Phoenix 1.02 | -0.1 ± 0.4 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| rsalesc.roborio.Roborio 1.2.4 | +2.6 ± 8.8 | +0.0 ± 18.6 | +0.0 ± 18.6 | +4.3 ± 7.5 |
| cb.Domogled 1.2 | +0.5 ± 16.8 | -1.4 ± 32.0 | -1.4 ± 32.0 | +2.8 ± 4.6 |
| mue.Ascendant 1.2.27 | -9.8 ± 13.4 | -14.3 ± 18.6 | -14.3 ± 18.6 | -4.0 ± 8.3 |
| abc.Shadow 3.83c | +1.6 ± 12.9 | +0.0 ± 25.4 | +0.0 ± 25.4 | +2.2 ± 2.6 |
| darkcanuck.Pris 0.92 | -12.5 ± 14.4 | -20.0 ± 17.8 | -20.0 ± 17.8 | -4.0 ± 12.3 |
| fromHell.BlackBox 0.0.2 | -3.9 ± 19.3 | -4.3 ± 24.8 | -4.3 ± 24.8 | -3.1 ± 13.3 |
| jk.precise.Wintermute 0.8 | +10.1 ± 12.6 | +14.9 ± 22.4 | +15.0 ± 22.4 | +4.5 ± 3.7 |
| kc.serpent.Hydra 0.21 | -0.1 ± 0.7 | +0.0 ± 0.0 | +0.0 ± 0.0 | -12.5 ± 76.2 |
| davidalves.Firebird 0.25 | +2.5 ± 9.2 | +0.7 ± 4.4 | +0.7 ± 4.4 | +0.0 ± 0.0 |
| pulsar.PulsarMax 0.8.9 | +2.0 ± 13.3 | +0.7 ± 19.1 | +0.7 ± 19.1 | +3.7 ± 7.9 |
| zyx.mega.YersiniaPestis 3.0 | +1.3 ± 19.8 | +1.6 ± 26.6 | +1.4 ± 26.9 | +1.2 ± 13.0 |
| ags.Midboss 1q.fast | +2.6 ± 12.1 | +2.9 ± 16.2 | +2.9 ± 16.2 | +2.5 ± 8.9 |
| pez.rumble.CassiusClay 2rho.02no | +9.0 ± 8.5 | +13.6 ± 13.6 | +13.6 ± 13.6 | +4.5 ± 4.8 |
| Krabb.sliNk.Garm 0.9u | -1.8 ± 10.0 | -0.6 ± 11.8 | -0.7 ± 12.0 | -1.8 ± 6.5 |
| axeBots.SilverSurfer 2.53.33fix | +0.4 ± 15.2 | +2.1 ± 18.7 | +2.1 ± 18.7 | -1.0 ± 11.7 |
| mn.Combat 3.25.0 | -0.1 ± 8.2 | -2.2 ± 10.7 | -2.9 ± 9.8 | +1.4 ± 5.6 |
| cs.s2.Seraphim 2.3.1 | -8.4 ± 12.2 | -8.6 ± 12.3 | -8.6 ± 12.3 | -7.1 ± 10.8 |
| fromHell.CHCl3 1.4.2 | -1.5 ± 11.1 | -2.1 ± 15.5 | -2.1 ± 15.5 | -0.8 ± 6.3 |
| jk.mini.CunobelinDC 1.2 | +2.5 ± 8.4 | +0.7 ± 2.3 | +0.7 ± 2.3 | -11.5 ± 35.9 |
| sheldor.mini.Foilist 1.3.1 | +4.9 ± 3.7 | +3.8 ± 4.7 | +3.6 ± 4.4 | +5.2 ± 11.2 |
| florent.test.Toad 0.14t | +2.5 ± 19.3 | +2.1 ± 26.6 | +2.1 ± 26.6 | +2.1 ± 11.0 |
| ar.horizon.Horizon 1.2.2 | +2.6 ± 8.5 | +1.4 ± 12.0 | +1.4 ± 12.0 | +3.7 ± 5.3 |
| cjm.chalk.Chalk 2.6.Be | +0.2 ± 0.7 | +0.0 ± 0.0 | +0.0 ± 0.0 | +12.5 ± 39.8 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | -0.3 ± 1.5 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.3 ± 2.1 |
| sheldor.mini.FoilistMC 1.0 | +0.7 ± 5.7 | +0.7 ± 7.8 | +0.7 ± 7.8 | -0.1 ± 5.6 |
| pez.rumble.Ali 0.4.9 | -0.7 ± 21.0 | +0.0 ± 11.1 | +0.0 ± 11.1 | -4.4 ± 49.3 |
| catcat20.Lambda 0.017 | +0.5 ± 15.2 | -1.2 ± 15.6 | -1.4 ± 15.5 | +2.3 ± 12.5 |
| florent.XSeries.X2 0.17 | -5.1 ± 15.6 | -7.1 ± 21.5 | -7.1 ± 21.5 | -2.1 ± 9.2 |
| All pairs | +0.0 ± 1.2 | -0.3 ± 1.7 | -0.3 ± 1.7 | -0.1 ± 1.4 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or, for a Hadur build, a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 2 | +1.7 ± 4.9 | -0.5 ± 24.0 |
| jd.Nullstride 2.3.3 | 4 | 0 | +1.8 ± 6.5 | n/a |
| jk.mega.DrussGT 3.1.16 | 4 | 0 | -1.8 ± 21.4 | n/a |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 4 | -0.9 ± 10.4 | -0.9 ± 10.4 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 0 | -0.8 ± 17.3 | n/a |
| voidious.Diamond 1.8.22 | 4 | 0 | -1.1 ± 14.6 | n/a |
| cb.fire.Firestarter 2.0f | 4 | 3 | -2.5 ± 8.3 | -3.8 ± 13.8 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 2 | +0.4 ± 8.1 | -3.8 ± 21.1 |
| xander.cat.XanderCat 12.9 | 4 | 2 | -2.9 ± 11.5 | +1.5 ± 79.3 |
| lxx.Tomcat 3.68 | 4 | 0 | -3.1 ± 5.2 | n/a |
| rsalesc.mega.Knight 0.6.28 | 4 | 0 | -3.3 ± 9.2 | n/a |
| aw.Gilgalad 1.99.5c | 4 | 1 | +7.8 ± 16.0 | +21.3 |
| pc.Wavelet 1.5 | 4 | 3 | +3.3 ± 5.7 | +2.0 ± 7.8 |
| gh.GresSuffurd 0.4.13 | 4 | 3 | -2.6 ± 9.9 | +0.4 ± 3.9 |
| kc.serpent.WaveSerpent 2.11 | 4 | 3 | -1.5 ± 5.6 | -3.0 ± 6.3 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 4 | -2.9 ± 6.2 | -2.9 ± 6.2 |
| cs.Nene 1.0.5 | 4 | 3 | +1.6 ± 10.6 | -1.0 ± 12.9 |
| jk.melee.Neuromancer 7.12 | 4 | 0 | +6.5 ± 24.8 | n/a |
| voidious.Dookious 1.573c | 4 | 2 | +0.0 ± 25.7 | +0.4 ± 251.0 |
| davidalves.Phoenix 1.02 | 4 | 3 | -0.1 ± 0.4 | -0.2 ± 0.7 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 0 | +2.6 ± 8.8 | n/a |
| cb.Domogled 1.2 | 4 | 4 | +0.5 ± 16.8 | +0.5 ± 16.8 |
| mue.Ascendant 1.2.27 | 4 | 1 | -9.8 ± 13.4 | -22.3 |
| abc.Shadow 3.83c | 4 | 3 | +1.6 ± 12.9 | +2.4 ± 24.2 |
| darkcanuck.Pris 0.92 | 4 | 0 | -12.5 ± 14.4 | n/a |
| fromHell.BlackBox 0.0.2 | 4 | 2 | -3.9 ± 19.3 | -1.0 ± 156.7 |
| jk.precise.Wintermute 0.8 | 4 | 2 | +10.1 ± 12.6 | +14.8 ± 60.2 |
| kc.serpent.Hydra 0.21 | 4 | 4 | -0.1 ± 0.7 | -0.1 ± 0.7 |
| davidalves.Firebird 0.25 | 4 | 3 | +2.5 ± 9.2 | +1.3 ± 15.9 |
| pulsar.PulsarMax 0.8.9 | 4 | 2 | +2.0 ± 13.3 | -0.1 ± 22.0 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 3 | +1.3 ± 19.8 | -0.8 ± 35.5 |
| ags.Midboss 1q.fast | 4 | 3 | +2.6 ± 12.1 | +1.2 ± 21.3 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 1 | +9.0 ± 8.5 | +7.8 |
| Krabb.sliNk.Garm 0.9u | 4 | 3 | -1.8 ± 10.0 | -3.2 ± 16.9 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 4 | +0.4 ± 15.2 | +0.4 ± 15.2 |
| mn.Combat 3.25.0 | 4 | 4 | -0.1 ± 8.2 | -0.1 ± 8.2 |
| cs.s2.Seraphim 2.3.1 | 4 | 3 | -8.4 ± 12.2 | -10.4 ± 19.8 |
| fromHell.CHCl3 1.4.2 | 4 | 2 | -1.5 ± 11.1 | +4.2 ± 15.9 |
| jk.mini.CunobelinDC 1.2 | 4 | 4 | +2.5 ± 8.4 | +2.5 ± 8.4 |
| sheldor.mini.Foilist 1.3.1 | 4 | 1 | +4.9 ± 3.7 | +5.5 |
| florent.test.Toad 0.14t | 4 | 1 | +2.5 ± 19.3 | +4.9 |
| ar.horizon.Horizon 1.2.2 | 4 | 3 | +2.6 ± 8.5 | +5.1 ± 6.5 |
| cjm.chalk.Chalk 2.6.Be | 4 | 4 | +0.2 ± 0.7 | +0.2 ± 0.7 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 4 | -0.3 ± 1.5 | -0.3 ± 1.5 |
| sheldor.mini.FoilistMC 1.0 | 4 | 2 | +0.7 ± 5.7 | +1.9 ± 48.4 |
| pez.rumble.Ali 0.4.9 | 4 | 2 | -0.7 ± 21.0 | +6.9 ± 76.7 |
| catcat20.Lambda 0.017 | 4 | 1 | +0.5 ± 15.2 | -9.4 |
| florent.XSeries.X2 0.17 | 4 | 3 | -5.1 ± 15.6 | -2.6 ± 25.8 |
| All pairs | 192 | 104 | +0.0 ± 1.2 | +0.1 ± 1.5 |

# Bench: hadur2.Hadur 3.13hjswpwf8 baseline (hadur2.Hadur 3.13hjsw) (cold)

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 8196 over 192 battles (42.7 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rank1-band1 | 21.7% ± 5.0 | 8.6% ± 7.4 | 40.1% ± 6.1 | 12 / 140 | 5.0% ± 0.8 | 9.5% ± 0.4 | 233 | 0 | 1.89 / 1000.8 |
| jd.Nullstride 2.3.3 | rank2-band1 | 23.1% ± 4.4 | 10.1% ± 8.1 | 40.8% ± 2.6 | 15 / 140 | 5.0% ± 1.1 | 9.5% ± 0.9 | 219 | 0 | 1.66 / 735.4 |
| jk.mega.DrussGT 3.1.16 | rank3-band1 | 48.5% ± 12.0 | 49.3% ± 16.3 | 47.6% ± 6.3 | 69 / 140 | 7.9% ± 0.9 | 10.3% ± 0.4 | 323 | 0 | 1.42 / 985.4 |
| oog.mega.saguaro.Saguaro 1.0 | rank4-band1 | 74.4% ± 8.4 | 87.1% ± 12.0 | 61.7% ± 5.1 | 122 / 140 | 17.7% ± 2.3 | 6.5% ± 1.2 | 76 | 0 | 2.00 / 815.1 |
| aaa.r.ScalarR 0.005h.053-noshield | rank5-band1 | 28.7% ± 11.4 | 19.3% ± 19.4 | 40.1% ± 4.4 | 27 / 140 | 6.9% ± 0.9 | 10.8% ± 0.6 | 297 | 0 | 1.71 / 418.5 |
| voidious.Diamond 1.8.22 | rank6-band1 | 48.4% ± 14.6 | 55.5% ± 21.1 | 41.0% ± 7.7 | 78 / 140 | 6.7% ± 0.8 | 9.0% ± 1.1 | 290 | 0 | 1.69 / 42.5 |
| cb.fire.Firestarter 2.0f | rank7-band1 | 50.7% ± 5.6 | 48.6% ± 8.3 | 52.3% ± 5.1 | 68 / 140 | 8.3% ± 0.5 | 9.8% ± 1.0 | 273 | 0 | 1.77 / 703.6 |
| dsekercioglu.mega.Raven 3.56j8 | rank8-band1 | 51.4% ± 12.7 | 63.6% ± 19.8 | 39.4% ± 5.8 | 89 / 140 | 9.6% ± 1.2 | 9.4% ± 0.8 | 206 | 0 | 1.19 / 243.5 |
| xander.cat.XanderCat 12.9 | rank9-band1 | 58.5% ± 3.9 | 64.3% ± 7.9 | 52.7% ± 3.9 | 90 / 140 | 12.0% ± 0.4 | 8.6% ± 0.3 | 186 | 0 | 1.24 / 163.3 |
| lxx.Tomcat 3.68 | rank10-band1 | 56.7% ± 7.9 | 71.1% ± 11.6 | 43.7% ± 4.2 | 100 / 140 | 10.1% ± 0.3 | 11.0% ± 0.3 | 279 | 0 | 1.93 / 55.4 |
| rsalesc.mega.Knight 0.6.28 | rank11-band2 | 53.8% ± 7.3 | 55.7% ± 10.8 | 51.2% ± 5.0 | 78 / 140 | 9.6% ± 0.6 | 10.3% ± 0.5 | 299 | 0 | 1.99 / 30.1 |
| aw.Gilgalad 1.99.5c | rank12-band2 | 43.5% ± 6.8 | 50.7% ± 11.4 | 36.8% ± 2.0 | 71 / 140 | 9.0% ± 2.3 | 10.8% ± 0.7 | 305 | 0 | 1.44 / 147.9 |
| pc.Wavelet 1.5 | rank13-band2 | 48.3% ± 12.2 | 43.6% ± 16.3 | 53.6% ± 11.6 | 61 / 140 | 10.5% ± 2.1 | 9.7% ± 2.5 | 190 | 0 | 1.90 / 21.8 |
| gh.GresSuffurd 0.4.13 | rank14-band2 | 60.0% ± 4.7 | 70.7% ± 7.8 | 49.9% ± 1.5 | 99 / 140 | 11.5% ± 1.0 | 9.5% ± 1.1 | 191 | 0 | 1.08 / 14.1 |
| kc.serpent.WaveSerpent 2.11 | rank15-band2 | 59.3% ± 9.6 | 75.0% ± 11.4 | 42.1% ± 5.9 | 105 / 140 | 9.1% ± 0.3 | 7.7% ± 1.0 | 102 | 0 | 2.09 / 58.5 |
| dsekercioglu.mega.WhiteFang 2.8.1 | rank16-band2 | 70.5% ± 8.7 | 86.4% ± 9.4 | 54.0% ± 7.7 | 121 / 140 | 11.4% ± 0.2 | 7.8% ± 0.5 | 159 | 0 | 1.17 / 949.8 |
| cs.Nene 1.0.5 | rank17-band2 | 59.3% ± 5.4 | 77.1% ± 9.1 | 39.9% ± 1.0 | 108 / 140 | 9.2% ± 1.2 | 7.9% ± 1.2 | 110 | 0 | 1.30 / 756.1 |
| jk.melee.Neuromancer 7.12 | rank18-band2 | 42.3% ± 9.8 | 38.6% ± 18.4 | 46.6% ± 1.4 | 54 / 140 | 10.0% ± 0.4 | 10.3% ± 0.5 | 265 | 0 | 1.70 / 823.7 |
| voidious.Dookious 1.573c | rank19-band2 | 57.2% ± 12.5 | 72.1% ± 22.4 | 41.1% ± 1.4 | 101 / 140 | 9.0% ± 0.8 | 7.4% ± 0.5 | 118 | 0 | 1.19 / 740.2 |
| davidalves.Phoenix 1.02 | rank21-band2 | 98.6% ± 1.1 | 100.0% ± 0.0 | 0.0% ± 0.0 | 140 / 140 | 0.0% ± 0.0 | 0.2% ± 0.1 | 43 | 0 | 0.57 / 19.3 |
| rsalesc.roborio.Roborio 1.2.4 | rank22-band2 | 57.5% ± 6.5 | 53.6% ± 12.0 | 60.2% ± 4.8 | 75 / 140 | 12.0% ± 0.8 | 9.5% ± 0.9 | 265 | 0 | 1.61 / 785.7 |
| cb.Domogled 1.2 | rank23-band2 | 57.9% ± 14.5 | 52.9% ± 23.9 | 62.2% ± 7.3 | 74 / 140 | 11.2% ± 0.8 | 8.2% ± 0.6 | 249 | 0 | 1.01 / 23.2 |
| mue.Ascendant 1.2.27 | rank24-band2 | 62.7% ± 7.9 | 77.9% ± 10.1 | 47.7% ± 4.7 | 109 / 140 | 11.4% ± 1.0 | 7.6% ± 0.9 | 109 | 0 | 1.01 / 13.5 |
| abc.Shadow 3.83c | rank25-band2 | 51.2% ± 10.2 | 67.1% ± 18.4 | 36.5% ± 1.9 | 94 / 140 | 9.8% ± 1.0 | 9.5% ± 0.6 | 172 | 0 | 1.16 / 18.8 |
| darkcanuck.Pris 0.92 | rank26-band2 | 63.9% ± 6.5 | 79.3% ± 6.8 | 49.1% ± 6.6 | 111 / 140 | 11.6% ± 1.3 | 8.2% ± 0.7 | 94 | 0 | 1.86 / 12.8 |
| fromHell.BlackBox 0.0.2 | rank27-band2 | 64.4% ± 8.6 | 74.3% ± 11.1 | 54.7% ± 6.0 | 104 / 140 | 15.0% ± 1.0 | 8.4% ± 1.0 | 134 | 0 | 1.01 / 126.0 |
| jk.precise.Wintermute 0.8 | rank28-band2 | 56.5% ± 11.3 | 70.7% ± 17.6 | 43.4% ± 5.9 | 99 / 140 | 10.9% ± 1.3 | 8.8% ± 0.2 | 176 | 0 | 1.30 / 33.8 |
| kc.serpent.Hydra 0.21 | rank29-band2 | 99.9% ± 0.3 | 100.0% ± 0.0 | 37.5% ± 39.8 | 140 / 140 | 0.0% ± 0.0 | 0.0% ± 0.0 | 52 | 0 | 0.75 / 139.7 |
| davidalves.Firebird 0.25 | rank30-band2 | 95.0% ± 6.8 | 98.6% ± 2.6 | 0.0% ± 0.0 | 138 / 140 | 0.0% ± 0.0 | 0.4% ± 0.3 | 50 | 0 | 0.66 / 24.8 |
| pulsar.PulsarMax 0.8.9 | rank31-band2 | 61.4% ± 7.2 | 79.3% ± 9.4 | 41.4% ± 5.7 | 111 / 140 | 9.8% ± 0.3 | 7.2% ± 0.7 | 113 | 0 | 1.11 / 357.9 |
| zyx.mega.YersiniaPestis 3.0 | rank32-band2 | 55.4% ± 11.3 | 70.6% ± 17.3 | 41.0% ± 6.7 | 99 / 140 | 10.3% ± 1.1 | 8.5% ± 0.7 | 186 | 0 | 1.44 / 336.7 |
| ags.Midboss 1q.fast | rank33-band2 | 71.6% ± 7.4 | 85.0% ± 10.1 | 59.1% ± 4.7 | 119 / 140 | 12.9% ± 0.8 | 9.1% ± 1.1 | 195 | 0 | 1.36 / 434.1 |
| pez.rumble.CassiusClay 2rho.02no | rank35-band2 | 57.0% ± 6.3 | 57.1% ± 9.8 | 56.4% ± 2.8 | 80 / 140 | 12.5% ± 0.8 | 8.9% ± 1.2 | 221 | 0 | 1.11 / 107.7 |
| Krabb.sliNk.Garm 0.9u | rank36-band2 | 66.7% ± 7.0 | 79.9% ± 8.8 | 51.0% ± 3.3 | 112 / 140 | 10.4% ± 0.6 | 6.3% ± 1.0 | 109 | 0 | 1.17 / 158.1 |
| axeBots.SilverSurfer 2.53.33fix | rank37-band2 | 67.7% ± 13.8 | 80.0% ± 19.6 | 55.7% ± 7.0 | 112 / 140 | 12.1% ± 0.5 | 7.0% ± 0.9 | 152 | 0 | 1.48 / 68.0 |
| mn.Combat 3.25.0 | rank38-band2 | 52.2% ± 9.9 | 63.7% ± 13.0 | 41.0% ± 5.2 | 90 / 140 | 10.7% ± 0.4 | 10.2% ± 0.6 | 227 | 0 | 1.71 / 300.7 |
| cs.s2.Seraphim 2.3.1 | rank39-band2 | 72.5% ± 8.4 | 88.6% ± 11.1 | 56.2% ± 4.9 | 124 / 140 | 11.6% ± 0.3 | 6.9% ± 1.2 | 137 | 0 | 1.10 / 46.3 |
| fromHell.CHCl3 1.4.2 | rank40-band2 | 71.8% ± 8.5 | 85.7% ± 9.8 | 57.7% ± 7.4 | 120 / 140 | 12.9% ± 1.7 | 7.1% ± 1.4 | 124 | 0 | 0.97 / 212.2 |
| jk.mini.CunobelinDC 1.2 | rank41-band2 | 95.7% ± 8.2 | 99.3% ± 2.3 | 21.0% ± 30.4 | 139 / 140 | 1.3% ± 2.2 | 1.3% ± 0.8 | 78 | 0 | 0.65 / 17.1 |
| sheldor.mini.Foilist 1.3.1 | rank42-band2 | 62.3% ± 4.1 | 75.5% ± 3.0 | 49.3% ± 6.6 | 106 / 140 | 11.3% ± 1.0 | 8.8% ± 1.0 | 216 | 0 | 1.15 / 16.8 |
| florent.test.Toad 0.14t | rank43-band2 | 59.8% ± 13.7 | 73.6% ± 19.4 | 46.7% ± 8.1 | 103 / 140 | 10.9% ± 0.5 | 8.3% ± 1.1 | 151 | 0 | 1.12 / 19.1 |
| ar.horizon.Horizon 1.2.2 | rank44-band2 | 56.5% ± 7.6 | 69.3% ± 12.0 | 43.6% ± 2.2 | 97 / 140 | 10.9% ± 0.4 | 8.8% ± 0.7 | 188 | 0 | 1.42 / 16.1 |
| cjm.chalk.Chalk 2.6.Be | rank45-band2 | 99.7% ± 0.7 | 100.0% ± 0.0 | 25.0% ± 45.9 | 140 / 140 | 0.0% ± 0.0 | 0.0% ± 0.1 | 48 | 0 | 0.57 / 50.8 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | rank46-band2 | 98.3% ± 0.5 | 100.0% ± 0.0 | 7.4% ± 9.8 | 140 / 140 | 0.5% ± 1.1 | 1.7% ± 0.9 | 56 | 0 | 0.47 / 275.4 |
| sheldor.mini.FoilistMC 1.0 | rank47-band2 | 72.8% ± 3.7 | 85.0% ± 7.8 | 60.3% ± 2.7 | 119 / 140 | 12.1% ± 1.2 | 7.9% ± 1.0 | 201 | 0 | 1.24 / 18.5 |
| pez.rumble.Ali 0.4.9 | rank48-band2 | 85.1% ± 17.9 | 95.0% ± 9.4 | 25.2% ± 27.9 | 133 / 140 | 1.7% ± 2.4 | 2.0% ± 2.1 | 68 | 0 | 1.86 / 18.2 |
| catcat20.Lambda 0.017 | rank49-band2 | 66.2% ± 6.0 | 81.9% ± 6.5 | 50.7% ± 7.3 | 115 / 140 | 11.4% ± 0.4 | 7.4% ± 0.6 | 146 | 0 | 1.76 / 22.1 |
| florent.XSeries.X2 0.17 | rank50-band2 | 64.1% ± 6.7 | 78.6% ± 14.1 | 48.8% ± 2.9 | 110 / 140 | 11.1% ± 0.5 | 7.3% ± 0.6 | 115 | 0 | 2.05 / 12.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 3089 | 51.8% | 32.0% | 0.0% | 16.2% | 1830 |
| jd.Nullstride 2.3.3 | 4 | 3050 | 51.2% | 32.4% | 0.0% | 16.3% | 1726 |
| jk.mega.DrussGT 3.1.16 | 4 | 2241 | 39.6% | 47.4% | 0.0% | 13.0% | 3131 |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 1242 | 18.1% | 74.1% | 0.0% | 7.8% | 682 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 3070 | 46.0% | 38.2% | 0.0% | 15.8% | 2688 |
| voidious.Diamond 1.8.22 | 4 | 2133 | 36.3% | 51.3% | 0.0% | 12.4% | 2741 |
| cb.fire.Firestarter 2.0f | 4 | 2120 | 42.5% | 44.7% | 0.0% | 12.9% | 3297 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 2185 | 29.2% | 59.3% | 0.0% | 11.6% | 1295 |
| xander.cat.XanderCat 12.9 | 4 | 1953 | 32.0% | 57.1% | 0.0% | 10.9% | 1530 |
| lxx.Tomcat 3.68 | 4 | 2027 | 24.7% | 65.6% | 0.0% | 9.7% | 2172 |
| rsalesc.mega.Knight 0.6.28 | 4 | 2097 | 37.0% | 50.9% | 0.0% | 12.1% | 3066 |
| aw.Gilgalad 1.99.5c | 4 | 2531 | 34.1% | 53.0% | 0.0% | 12.9% | 1813 |
| pc.Wavelet 1.5 | 4 | 2361 | 41.8% | 43.0% | 0.3% | 14.9% | 1632 |
| gh.GresSuffurd 0.4.13 | 4 | 1925 | 26.6% | 62.5% | 0.0% | 10.8% | 1085 |
| kc.serpent.WaveSerpent 2.11 | 4 | 1762 | 24.8% | 65.7% | 0.0% | 9.5% | 1076 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 1356 | 17.5% | 75.5% | 0.0% | 7.0% | 1234 |
| cs.Nene 1.0.5 | 4 | 1749 | 22.9% | 68.1% | 0.0% | 9.1% | 923 |
| jk.melee.Neuromancer 7.12 | 4 | 2746 | 39.1% | 46.7% | 0.0% | 14.2% | 2035 |
| voidious.Dookious 1.573c | 4 | 1849 | 26.4% | 63.8% | 0.0% | 9.9% | 998 |
| davidalves.Phoenix 1.02 | 4 | 29 | 0.0% | 100.0% | 0.0% | 0.0% | 1238 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 2017 | 40.3% | 46.6% | 0.0% | 13.2% | 2515 |
| cb.Domogled 1.2 | 4 | 1861 | 44.3% | 42.7% | 0.0% | 13.0% | 2539 |
| mue.Ascendant 1.2.27 | 4 | 1709 | 22.7% | 67.7% | 0.0% | 9.6% | 856 |
| abc.Shadow 3.83c | 4 | 2261 | 25.4% | 64.1% | 0.0% | 10.5% | 1011 |
| darkcanuck.Pris 0.92 | 4 | 1691 | 21.4% | 69.5% | 0.0% | 9.0% | 857 |
| fromHell.BlackBox 0.0.2 | 4 | 1704 | 26.4% | 63.1% | 0.0% | 10.4% | 874 |
| jk.precise.Wintermute 0.8 | 4 | 2017 | 25.4% | 63.8% | 0.0% | 10.7% | 1017 |
| kc.serpent.Hydra 0.21 | 4 | 2 | 0.0% | 100.0% | 0.0% | 0.0% | 1386 |
| davidalves.Firebird 0.25 | 4 | 112 | 22.3% | 68.3% | 0.0% | 9.4% | 1295 |
| pulsar.PulsarMax 0.8.9 | 4 | 1638 | 22.1% | 69.3% | 0.0% | 8.5% | 976 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 2032 | 25.2% | 64.4% | 0.0% | 10.4% | 950 |
| ags.Midboss 1q.fast | 4 | 1407 | 18.7% | 73.3% | 0.0% | 8.0% | 915 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 2097 | 35.8% | 51.5% | 0.0% | 12.8% | 1658 |
| Krabb.sliNk.Garm 0.9u | 4 | 1404 | 24.9% | 66.1% | 0.0% | 9.0% | 962 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 1518 | 23.1% | 67.1% | 0.0% | 9.9% | 991 |
| mn.Combat 3.25.0 | 4 | 2162 | 28.9% | 60.3% | 0.0% | 10.8% | 1579 |
| cs.s2.Seraphim 2.3.1 | 4 | 1279 | 15.6% | 77.5% | 0.0% | 6.9% | 811 |
| fromHell.CHCl3 1.4.2 | 4 | 1329 | 18.8% | 73.9% | 0.0% | 7.2% | 871 |
| jk.mini.CunobelinDC 1.2 | 4 | 106 | 11.8% | 81.0% | 0.0% | 7.1% | 1380 |
| sheldor.mini.Foilist 1.3.1 | 4 | 1744 | 24.4% | 65.9% | 0.0% | 9.7% | 1317 |
| florent.test.Toad 0.14t | 4 | 1866 | 24.8% | 65.1% | 0.0% | 10.1% | 936 |
| ar.horizon.Horizon 1.2.2 | 4 | 1963 | 27.4% | 61.9% | 0.0% | 10.7% | 1164 |
| cjm.chalk.Chalk 2.6.Be | 4 | 7 | 0.0% | 100.0% | 0.0% | 0.0% | 1368 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 36 | 0.0% | 100.0% | 0.0% | 0.0% | 1058 |
| sheldor.mini.FoilistMC 1.0 | 4 | 1272 | 20.6% | 70.7% | 0.0% | 8.7% | 1182 |
| pez.rumble.Ali 0.4.9 | 4 | 407 | 21.5% | 70.7% | 0.0% | 7.7% | 1364 |
| catcat20.Lambda 0.017 | 4 | 1546 | 20.2% | 71.3% | 0.0% | 8.5% | 1061 |
| florent.XSeries.X2 0.17 | 4 | 1619 | 23.2% | 67.5% | 0.0% | 9.4% | 921 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 2 | 0 | 0 | 1.66 | 2 | 2 | 0 |
| jd.Nullstride 2.3.3 | 4 | 0 | 0 | 0 | 1.56 | 4 | 4 | 0 |
| jk.mega.DrussGT 3.1.16 | 4 | 0 | 0 | 0 | 2.31 | 2 | 2 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 4 | 0 | 0 | 0.54 | 0 | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 0 | 0 | 0 | 2.12 | 0 | 0 | 0 |
| voidious.Diamond 1.8.22 | 4 | 0 | 0 | 0 | 2.07 | 1 | 1 | 0 |
| cb.fire.Firestarter 2.0f | 4 | 3 | 0 | 0 | 1.95 | 0 | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 3 | 0 | 0 | 1.47 | 1 | 1 | 0 |
| xander.cat.XanderCat 12.9 | 4 | 2 | 0 | 0 | 1.33 | 2 | 2 | 0 |
| lxx.Tomcat 3.68 | 4 | 1 | 0 | 0 | 1.99 | 1 | 1 | 0 |
| rsalesc.mega.Knight 0.6.28 | 4 | 0 | 0 | 0 | 2.14 | 1 | 1 | 0 |
| aw.Gilgalad 1.99.5c | 4 | 1 | 0 | 1 | 2.18 | 4 | 3 | 0 |
| pc.Wavelet 1.5 | 4 | 4 | 0 | 0 | 1.36 | 0 | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 4 | 3 | 0 | 0 | 1.36 | 1 | 1 | 0 |
| kc.serpent.WaveSerpent 2.11 | 4 | 3 | 0 | 0 | 0.73 | 1 | 1 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 4 | 0 | 0 | 1.14 | 0 | 0 | 0 |
| cs.Nene 1.0.5 | 4 | 3 | 0 | 0 | 0.79 | 1 | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 4 | 1 | 0 | 0 | 1.89 | 3 | 3 | 0 |
| voidious.Dookious 1.573c | 4 | 3 | 0 | 0 | 0.84 | 1 | 1 | 0 |
| davidalves.Phoenix 1.02 | 4 | 3 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 1 | 0 | 0 | 1.89 | 3 | 3 | 0 |
| cb.Domogled 1.2 | 4 | 4 | 0 | 0 | 1.78 | 0 | 0 | 0 |
| mue.Ascendant 1.2.27 | 4 | 3 | 0 | 0 | 0.78 | 1 | 1 | 0 |
| abc.Shadow 3.83c | 4 | 4 | 0 | 0 | 1.23 | 0 | 0 | 0 |
| darkcanuck.Pris 0.92 | 4 | 3 | 0 | 0 | 0.67 | 1 | 1 | 0 |
| fromHell.BlackBox 0.0.2 | 4 | 2 | 0 | 0 | 0.96 | 2 | 2 | 0 |
| jk.precise.Wintermute 0.8 | 4 | 3 | 0 | 0 | 1.26 | 1 | 1 | 0 |
| kc.serpent.Hydra 0.21 | 4 | 4 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| davidalves.Firebird 0.25 | 4 | 3 | 0 | 0 | 0.36 | 1 | 1 | 0 |
| pulsar.PulsarMax 0.8.9 | 4 | 3 | 0 | 0 | 0.81 | 1 | 1 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 3 | 0 | 1 | 1.33 | 1 | 1 | 0 |
| ags.Midboss 1q.fast | 4 | 4 | 0 | 0 | 1.39 | 0 | 0 | 0 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 2 | 0 | 0 | 1.58 | 2 | 2 | 0 |
| Krabb.sliNk.Garm 0.9u | 4 | 3 | 0 | 0 | 0.78 | 1 | 1 | 0 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 4 | 0 | 0 | 1.09 | 0 | 0 | 0 |
| mn.Combat 3.25.0 | 4 | 4 | 0 | 0 | 1.62 | 0 | 0 | 0 |
| cs.s2.Seraphim 2.3.1 | 4 | 4 | 0 | 0 | 0.98 | 0 | 0 | 0 |
| fromHell.CHCl3 1.4.2 | 4 | 3 | 0 | 0 | 0.89 | 1 | 0 | 0 |
| jk.mini.CunobelinDC 1.2 | 4 | 4 | 0 | 0 | 0.56 | 0 | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 4 | 1 | 0 | 0 | 1.54 | 3 | 3 | 0 |
| florent.test.Toad 0.14t | 4 | 3 | 0 | 0 | 1.08 | 1 | 1 | 0 |
| ar.horizon.Horizon 1.2.2 | 4 | 4 | 0 | 0 | 1.34 | 0 | 0 | 0 |
| cjm.chalk.Chalk 2.6.Be | 4 | 4 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 4 | 0 | 0 | 0.40 | 0 | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 4 | 3 | 0 | 0 | 1.44 | 1 | 1 | 0 |
| pez.rumble.Ali 0.4.9 | 4 | 4 | 0 | 0 | 0.49 | 0 | 0 | 0 |
| catcat20.Lambda 0.017 | 4 | 2 | 0 | 0 | 1.04 | 2 | 2 | 0 |
| florent.XSeries.X2 0.17 | 4 | 3 | 0 | 0 | 0.82 | 1 | 1 | 0 |

129 of 192 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 19481 | 245 | 19535 | 19464 (99.9%) | 17 (0.1%) | 71 (0.4%) | 1507 | 130 | 215 |
| jd.Nullstride 2.3.3 | 17830 | 215 | 17871 | 17813 (99.9%) | 17 (0.1%) | 58 (0.3%) | 1197 | 123 | 198 |
| jk.mega.DrussGT 3.1.16 | 35974 | 5 | 35974 | 35971 (100.0%) | 3 (0.0%) | 3 (0.0%) | 2368 | 274 | 302 |
| oog.mega.saguaro.Saguaro 1.0 | 4720 | 4 | 4723 | 4717 (99.9%) | 3 (0.1%) | 6 (0.1%) | 293 | 67 | 34 |
| aaa.r.ScalarR 0.005h.053-noshield | 29962 | 12 | 30032 | 29957 (100.0%) | 5 (0.0%) | 75 (0.2%) | 2418 | 369 | 289 |
| voidious.Diamond 1.8.22 | 30783 | 648 | 30852 | 30772 (100.0%) | 11 (0.0%) | 80 (0.3%) | 2588 | 196 | 261 |
| cb.fire.Firestarter 2.0f | 32922 | 780 | 33364 | 32909 (100.0%) | 13 (0.0%) | 455 (1.4%) | 7316 | 267 | 259 |
| dsekercioglu.mega.Raven 3.56j8 | 12125 | 74 | 12123 | 12121 (100.0%) | 4 (0.0%) | 2 (0.0%) | 891 | 146 | 229 |
| xander.cat.XanderCat 12.9 | 12491 | 7 | 12537 | 12489 (100.0%) | 2 (0.0%) | 48 (0.4%) | 1549 | 165 | 184 |
| lxx.Tomcat 3.68 | 23489 | 349 | 23463 | 23443 (99.8%) | 46 (0.2%) | 20 (0.1%) | 2172 | 211 | 350 |
| rsalesc.mega.Knight 0.6.28 | 34906 | 330 | 34913 | 34904 (100.0%) | 2 (0.0%) | 9 (0.0%) | 2916 | 312 | 290 |
| aw.Gilgalad 1.99.5c | 19052 | 7 | 19062 | 19044 (100.0%) | 8 (0.0%) | 18 (0.1%) | 1597 | 208 | 304 |
| pc.Wavelet 1.5 | 14127 | 4 | 14147 | 14124 (100.0%) | 3 (0.0%) | 23 (0.2%) | 1415 | 144 | 157 |
| gh.GresSuffurd 0.4.13 | 9694 | 7 | 9693 | 9692 (100.0%) | 2 (0.0%) | 1 (0.0%) | 650 | 88 | 169 |
| kc.serpent.WaveSerpent 2.11 | 7778 | 2 | 7778 | 7778 (100.0%) | 0 (0.0%) | 0 (0.0%) | 609 | 55 | 73 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 10350 | 7 | 10351 | 10349 (100.0%) | 1 (0.0%) | 2 (0.0%) | 815 | 88 | 130 |
| cs.Nene 1.0.5 | 7604 | 49 | 7604 | 7603 (100.0%) | 1 (0.0%) | 1 (0.0%) | 439 | 54 | 72 |
| jk.melee.Neuromancer 7.12 | 21297 | 6 | 21313 | 21294 (100.0%) | 3 (0.0%) | 19 (0.1%) | 1822 | 207 | 248 |
| voidious.Dookious 1.573c | 7437 | 8 | 7438 | 7435 (100.0%) | 2 (0.0%) | 3 (0.0%) | 499 | 64 | 92 |
| davidalves.Phoenix 1.02 | 5804 | 0 | 5808 | 5804 (100.0%) | 0 (0.0%) | 4 (0.1%) | 2398 | 2 | 13 |
| rsalesc.roborio.Roborio 1.2.4 | 24884 | 8 | 24906 | 24875 (100.0%) | 9 (0.0%) | 31 (0.1%) | 2651 | 183 | 300 |
| cb.Domogled 1.2 | 21330 | 10 | 22031 | 21328 (100.0%) | 2 (0.0%) | 703 (3.2%) | 8963 | 152 | 249 |
| mue.Ascendant 1.2.27 | 6505 | 4 | 6505 | 6504 (100.0%) | 1 (0.0%) | 1 (0.0%) | 361 | 81 | 76 |
| abc.Shadow 3.83c | 8497 | 414 | 8413 | 8411 (99.0%) | 86 (1.0%) | 2 (0.0%) | 604 | 83 | 147 |
| darkcanuck.Pris 0.92 | 6459 | 28 | 6459 | 6458 (100.0%) | 1 (0.0%) | 1 (0.0%) | 364 | 79 | 58 |
| fromHell.BlackBox 0.0.2 | 7279 | 10 | 7279 | 7279 (100.0%) | 0 (0.0%) | 0 (0.0%) | 673 | 95 | 95 |
| jk.precise.Wintermute 0.8 | 8796 | 12 | 8796 | 8796 (100.0%) | 0 (0.0%) | 0 (0.0%) | 626 | 116 | 142 |
| kc.serpent.Hydra 0.21 | 9050 | 0 | 9050 | 9045 (99.9%) | 5 (0.1%) | 5 (0.1%) | 28 | 3 | 17 |
| davidalves.Firebird 0.25 | 6828 | 0 | 6828 | 6828 (100.0%) | 0 (0.0%) | 0 (0.0%) | 1639 | 3 | 17 |
| pulsar.PulsarMax 0.8.9 | 7658 | 7 | 7660 | 7658 (100.0%) | 0 (0.0%) | 2 (0.0%) | 549 | 42 | 86 |
| zyx.mega.YersiniaPestis 3.0 | 6970 | 340 | 6934 | 6931 (99.4%) | 39 (0.6%) | 3 (0.0%) | 508 | 69 | 113 |
| ags.Midboss 1q.fast | 7834 | 25 | 7837 | 7833 (100.0%) | 1 (0.0%) | 4 (0.1%) | 396 | 110 | 153 |
| pez.rumble.CassiusClay 2rho.02no | 15455 | 10 | 15478 | 15454 (100.0%) | 1 (0.0%) | 24 (0.2%) | 1715 | 136 | 190 |
| Krabb.sliNk.Garm 0.9u | 7887 | 3 | 7887 | 7885 (100.0%) | 2 (0.0%) | 2 (0.0%) | 505 | 70 | 71 |
| axeBots.SilverSurfer 2.53.33fix | 5732 | 8 | 5795 | 5732 (100.0%) | 0 (0.0%) | 63 (1.1%) | 1041 | 50 | 109 |
| mn.Combat 3.25.0 | 15830 | 6 | 15834 | 15828 (100.0%) | 2 (0.0%) | 6 (0.0%) | 1431 | 171 | 191 |
| cs.s2.Seraphim 2.3.1 | 6185 | 18 | 6186 | 6185 (100.0%) | 0 (0.0%) | 1 (0.0%) | 225 | 80 | 71 |
| fromHell.CHCl3 1.4.2 | 6231 | 6 | 6229 | 6227 (99.9%) | 4 (0.1%) | 2 (0.0%) | 436 | 72 | 128 |
| jk.mini.CunobelinDC 1.2 | 13275 | 143 | 13264 | 13264 (99.9%) | 11 (0.1%) | 0 (0.0%) | 14 | 2 | 185 |
| sheldor.mini.Foilist 1.3.1 | 12768 | 6 | 12771 | 12766 (100.0%) | 2 (0.0%) | 5 (0.0%) | 977 | 106 | 200 |
| florent.test.Toad 0.14t | 6869 | 10 | 6873 | 6869 (100.0%) | 0 (0.0%) | 4 (0.1%) | 476 | 69 | 100 |
| ar.horizon.Horizon 1.2.2 | 10042 | 4 | 10043 | 10042 (100.0%) | 0 (0.0%) | 1 (0.0%) | 794 | 112 | 143 |
| cjm.chalk.Chalk 2.6.Be | 7985 | 0 | 7985 | 7985 (100.0%) | 0 (0.0%) | 0 (0.0%) | 143 | 1 | 12 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 8803 | 215 | 8803 | 8803 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 4 | 15 |
| sheldor.mini.FoilistMC 1.0 | 11531 | 36 | 11530 | 11527 (100.0%) | 4 (0.0%) | 3 (0.0%) | 742 | 111 | 165 |
| pez.rumble.Ali 0.4.9 | 8176 | 42 | 8182 | 8175 (100.0%) | 1 (0.0%) | 7 (0.1%) | 2348 | 14 | 35 |
| catcat20.Lambda 0.017 | 8981 | 132 | 8977 | 8970 (99.9%) | 11 (0.1%) | 7 (0.1%) | 600 | 70 | 145 |
| florent.XSeries.X2 0.17 | 6671 | 7 | 6668 | 6667 (99.9%) | 4 (0.1%) | 1 (0.0%) | 491 | 57 | 123 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 19206 | 2113 (11.0%) | 18630 |
| jd.Nullstride 2.3.3 | 17422 | 1832 (10.5%) | 16330 |
| jk.mega.DrussGT 3.1.16 | 35935 | 4561 (12.7%) | 35486 |
| oog.mega.saguaro.Saguaro 1.0 | 5281 | 399 (7.6%) | 5257 |
| aaa.r.ScalarR 0.005h.053-noshield | 30304 | 3505 (11.6%) | 29735 |
| voidious.Diamond 1.8.22 | 31136 | 3373 (10.8%) | 29980 |
| cb.fire.Firestarter 2.0f | 38289 | 3535 (9.2%) | 36620 |
| dsekercioglu.mega.Raven 3.56j8 | 12999 | 1309 (10.1%) | 11739 |
| xander.cat.XanderCat 12.9 | 15344 | 1334 (8.7%) | 14612 |
| lxx.Tomcat 3.68 | 24021 | 2686 (11.2%) | 23411 |
| rsalesc.mega.Knight 0.6.28 | 35135 | 4036 (11.5%) | 34522 |
| aw.Gilgalad 1.99.5c | 19437 | 1945 (10.0%) | 18313 |
| pc.Wavelet 1.5 | 16813 | 1547 (9.2%) | 16229 |
| gh.GresSuffurd 0.4.13 | 10117 | 1006 (9.9%) | 9287 |
| kc.serpent.WaveSerpent 2.11 | 10228 | 774 (7.6%) | 8455 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 12082 | 1118 (9.3%) | 10546 |
| cs.Nene 1.0.5 | 8385 | 777 (9.3%) | 7596 |
| jk.melee.Neuromancer 7.12 | 21888 | 2282 (10.4%) | 21445 |
| voidious.Dookious 1.573c | 9269 | 710 (7.7%) | 6599 |
| davidalves.Phoenix 1.02 | 121 | 5747 (4749.6%) | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 27661 | 2579 (9.3%) | 27636 |
| cb.Domogled 1.2 | 28410 | 2264 (8.0%) | 26817 |
| mue.Ascendant 1.2.27 | 7401 | 659 (8.9%) | 6877 |
| abc.Shadow 3.83c | 9615 | 817 (8.5%) | 9088 |
| darkcanuck.Pris 0.92 | 7424 | 609 (8.2%) | 5999 |
| fromHell.BlackBox 0.0.2 | 7372 | 759 (10.3%) | 6139 |
| jk.precise.Wintermute 0.8 | 9353 | 963 (10.3%) | 8508 |
| kc.serpent.Hydra 0.21 | 146 | 9049 (6197.9%) | 0 |
| davidalves.Firebird 0.25 | 136 | 6739 (4955.1%) | 0 |
| pulsar.PulsarMax 0.8.9 | 9221 | 752 (8.2%) | 6394 |
| zyx.mega.YersiniaPestis 3.0 | 8613 | 610 (7.1%) | 7224 |
| ags.Midboss 1q.fast | 8015 | 761 (9.5%) | 7475 |
| pez.rumble.CassiusClay 2rho.02no | 16707 | 1586 (9.5%) | 15565 |
| Krabb.sliNk.Garm 0.9u | 8662 | 825 (9.5%) | 6795 |
| axeBots.SilverSurfer 2.53.33fix | 9023 | 541 (6.0%) | 7348 |
| mn.Combat 3.25.0 | 16675 | 1642 (9.8%) | 16059 |
| cs.s2.Seraphim 2.3.1 | 6842 | 523 (7.6%) | 6307 |
| fromHell.CHCl3 1.4.2 | 7371 | 648 (8.8%) | 7055 |
| jk.mini.CunobelinDC 1.2 | 407 | 13079 (3213.5%) | 0 |
| sheldor.mini.Foilist 1.3.1 | 13033 | 1220 (9.4%) | 12154 |
| florent.test.Toad 0.14t | 8349 | 652 (7.8%) | 6544 |
| ar.horizon.Horizon 1.2.2 | 11308 | 1103 (9.8%) | 10497 |
| cjm.chalk.Chalk 2.6.Be | 145 | 7982 (5504.8%) | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 342 | 8808 (2575.4%) | 0 |
| sheldor.mini.FoilistMC 1.0 | 11362 | 1067 (9.4%) | 9812 |
| pez.rumble.Ali 0.4.9 | 2476 | 6775 (273.6%) | 1684 |
| catcat20.Lambda 0.017 | 9782 | 796 (8.1%) | 8446 |
| florent.XSeries.X2 0.17 | 8226 | 520 (6.3%) | 5395 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 532 | 650 | 1689 | 18.9 / 28.2 | 0 | 350 | 22 |
| jd.Nullstride 2.3.3 | 650 | 533 | 650 | 1568 | 19.5 / 28.3 | 0 | 306 | 34 |
| jk.mega.DrussGT 3.1.16 | 650 | 514 | 650 | 3009 | 27.7 / 30.4 | 7 | 4987 | 335 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 447 | 506 | 532 | 42.3 / 26.3 | 594 | 2110 | 392 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 481 | 650 | 2538 | 22.4 / 33.5 | 0 | 755 | 1 |
| voidious.Diamond 1.8.22 | 650 | 536 | 650 | 2602 | 21.8 / 31.2 | 113 | 7122 | 162 |
| cb.fire.Firestarter 2.0f | 650 | 543 | 650 | 3147 | 29.7 / 27.1 | 160 | 3964 | 158 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 453 | 650 | 1145 | 23.9 / 37.0 | 106 | 10708 | 1226 |
| xander.cat.XanderCat 12.9 | 650 | 444 | 650 | 1381 | 35.5 / 31.9 | 204 | 1391 | 39 |
| lxx.Tomcat 3.68 | 650 | 509 | 650 | 2028 | 29.5 / 38.0 | 175 | 11029 | 9 |
| rsalesc.mega.Knight 0.6.28 | 650 | 505 | 650 | 2932 | 32.1 / 30.5 | 270 | 6276 | 31 |
| aw.Gilgalad 1.99.5c | 650 | 485 | 650 | 1695 | 22.4 / 38.4 | 204 | 14795 | 62 |
| pc.Wavelet 1.5 | 650 | 434 | 650 | 1482 | 34.0 / 29.0 | 266 | 2162 | 9 |
| gh.GresSuffurd 0.4.13 | 650 | 462 | 650 | 934 | 34.2 / 34.4 | 400 | 3264 | 102 |
| kc.serpent.WaveSerpent 2.11 | 650 | 474 | 650 | 925 | 23.9 / 33.1 | 81 | 6002 | 4 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 465 | 650 | 1084 | 34.4 / 29.2 | 170 | 5797 | 62 |
| cs.Nene 1.0.5 | 650 | 469 | 650 | 771 | 22.6 / 34.0 | 65 | 5789 | 1033 |
| jk.melee.Neuromancer 7.12 | 650 | 527 | 650 | 1902 | 31.9 / 36.6 | 56 | 4218 | 22 |
| voidious.Dookious 1.573c | 650 | 484 | 650 | 850 | 23.5 / 33.7 | 84 | 4696 | 2037 |
| davidalves.Phoenix 1.02 | 650 | 400 | 650 | 1088 | 0.0 / 0.8 | 0 | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 650 | 498 | 650 | 2393 | 40.5 / 26.8 | 507 | 3993 | 23 |
| cb.Domogled 1.2 | 650 | 549 | 638 | 2389 | 37.4 / 22.7 | 336 | 2230 | 191 |
| mue.Ascendant 1.2.27 | 650 | 406 | 588 | 707 | 30.0 / 33.0 | 112 | 3048 | 13 |
| abc.Shadow 3.83c | 650 | 453 | 650 | 861 | 23.8 / 41.4 | 41 | 5771 | 177 |
| darkcanuck.Pris 0.92 | 650 | 415 | 650 | 708 | 32.6 / 33.6 | 309 | 3000 | 983 |
| fromHell.BlackBox 0.0.2 | 650 | 412 | 400 | 728 | 37.1 / 30.7 | 1306 | 1543 | 0 |
| jk.precise.Wintermute 0.8 | 650 | 454 | 650 | 865 | 28.3 / 36.8 | 222 | 3835 | 155 |
| kc.serpent.Hydra 0.21 | 650 | 348 | 650 | 1236 | 0.0 / 0.1 | 0 | 0 | 0 |
| davidalves.Firebird 0.25 | 650 | 399 | 650 | 1146 | 0.0 / 2.2 | 0 | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 650 | 487 | 650 | 829 | 23.0 / 32.4 | 45 | 6627 | 1 |
| zyx.mega.YersiniaPestis 3.0 | 650 | 446 | 650 | 801 | 26.0 / 37.4 | 69 | 2332 | 80 |
| ags.Midboss 1q.fast | 650 | 410 | 650 | 765 | 42.5 / 29.5 | 351 | 2457 | 414 |
| pez.rumble.CassiusClay 2rho.02no | 650 | 473 | 650 | 1492 | 39.9 / 30.8 | 676 | 1112 | 88 |
| Krabb.sliNk.Garm 0.9u | 650 | 535 | 650 | 811 | 27.5 / 26.5 | 182 | 4380 | 2661 |
| axeBots.SilverSurfer 2.53.33fix | 650 | 485 | 650 | 841 | 36.5 / 29.1 | 186 | 1123 | 19 |
| mn.Combat 3.25.0 | 650 | 490 | 650 | 1429 | 25.8 / 37.2 | 263 | 9849 | 74 |
| cs.s2.Seraphim 2.3.1 | 650 | 485 | 650 | 661 | 36.2 / 28.3 | 206 | 1810 | 596 |
| fromHell.CHCl3 1.4.2 | 650 | 423 | 400 | 720 | 37.9 / 28.1 | 595 | 1595 | 0 |
| jk.mini.CunobelinDC 1.2 | 650 | 527 | 650 | 1230 | 1.6 / 2.4 | 0 | 29 | 0 |
| sheldor.mini.Foilist 1.3.1 | 650 | 564 | 650 | 1174 | 32.0 / 32.8 | 273 | 4747 | 3 |
| florent.test.Toad 0.14t | 650 | 489 | 650 | 787 | 30.4 / 34.7 | 198 | 1805 | 80 |
| ar.horizon.Horizon 1.2.2 | 650 | 478 | 650 | 1014 | 26.9 / 34.7 | 102 | 7208 | 0 |
| cjm.chalk.Chalk 2.6.Be | 650 | 420 | 650 | 1218 | 0.0 / 0.2 | 0 | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 650 | 356 | 650 | 908 | 0.1 / 1.0 | 0 | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 650 | 571 | 588 | 1031 | 39.0 / 25.7 | 339 | 4948 | 1057 |
| pez.rumble.Ali 0.4.9 | 650 | 391 | 650 | 1214 | 4.1 / 8.2 | 35 | 1688 | 40 |
| catcat20.Lambda 0.017 | 650 | 542 | 650 | 909 | 32.4 / 31.5 | 223 | 1395 | 1 |
| florent.XSeries.X2 0.17 | 650 | 495 | 650 | 773 | 29.9 / 31.2 | 122 | 2580 | 58 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 9.5% | 233 | 69 | 3 | 137.2 | 2108 / 2113 (100%) | 0 | 0 |
| jd.Nullstride 2.3.3 | 9.5% | 219 | 70 | 3 | 122.5 | 1831 / 1832 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.3% | 323 | 81 | 3 | 254.9 | 4554 / 4561 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.5% | 76 | 25 | 3 | 33.6 | 399 / 399 (100%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.8% | 297 | 131 | 3 | 214.1 | 3501 / 3505 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 9.0% | 290 | 76 | 3 | 218.6 | 3369 / 3373 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 9.8% | 273 | 117 | 3 | 237.7 | 3525 / 3535 (100%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 9.4% | 206 | 58 | 3 | 85.6 | 1304 / 1309 (100%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 8.6% | 186 | 55 | 3 | 87.9 | 1332 / 1334 (100%) | 0 | 0 |
| lxx.Tomcat 3.68 | 11.0% | 279 | 74 | 3 | 166.9 | 2682 / 2686 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 10.3% | 299 | 101 | 3 | 247.7 | 4028 / 4036 (100%) | 0 | 0 |
| aw.Gilgalad 1.99.5c | 10.8% | 305 | 52 | 3 | 134.1 | 1942 / 1945 (100%) | 0 | 0 |
| pc.Wavelet 1.5 | 9.7% | 190 | 78 | 3 | 101.1 | 1544 / 1547 (100%) | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 9.5% | 191 | 50 | 3 | 68.4 | 1005 / 1006 (100%) | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 7.7% | 102 | 55 | 3 | 55.0 | 772 / 774 (100%) | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 7.8% | 159 | 52 | 3 | 73.7 | 1117 / 1118 (100%) | 0 | 0 |
| cs.Nene 1.0.5 | 7.9% | 110 | 44 | 2 | 53.7 | 773 / 777 (99%) | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 10.3% | 265 | 64 | 3 | 149.4 | 2278 / 2282 (100%) | 0 | 0 |
| voidious.Dookious 1.573c | 7.4% | 118 | 52 | 3 | 52.8 | 708 / 710 (100%) | 0 | 0 |
| davidalves.Phoenix 1.02 | 0.2% | 43 | 8 | 3 | 0.0 | 0 / 5747 (0%) | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 9.5% | 265 | 81 | 3 | 174.2 | 2576 / 2579 (100%) | 0 | 0 |
| cb.Domogled 1.2 | 8.2% | 249 | 88 | 3 | 156.6 | 2258 / 2264 (100%) | 0 | 0 |
| mue.Ascendant 1.2.27 | 7.6% | 109 | 39 | 3 | 46.0 | 657 / 659 (100%) | 0 | 0 |
| abc.Shadow 3.83c | 9.5% | 172 | 44 | 3 | 60.0 | 814 / 817 (100%) | 0 | 0 |
| darkcanuck.Pris 0.92 | 8.2% | 94 | 39 | 3 | 45.8 | 606 / 609 (100%) | 0 | 0 |
| fromHell.BlackBox 0.0.2 | 8.4% | 134 | 38 | 3 | 51.5 | 758 / 759 (100%) | 0 | 0 |
| jk.precise.Wintermute 0.8 | 8.8% | 176 | 45 | 3 | 62.1 | 958 / 963 (99%) | 0 | 0 |
| kc.serpent.Hydra 0.21 | 0.0% | 52 | 8 | 3 | 0.0 | 0 / 9049 (0%) | 0 | 0 |
| davidalves.Firebird 0.25 | 0.4% | 50 | 9 | 3 | 0.0 | 0 / 6739 (0%) | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 7.2% | 113 | 49 | 3 | 54.5 | 751 / 752 (100%) | 0 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 8.5% | 186 | 60 | 3 | 49.1 | 609 / 610 (100%) | 0 | 0 |
| ags.Midboss 1q.fast | 9.1% | 195 | 37 | 3 | 55.9 | 758 / 761 (100%) | 0 | 0 |
| pez.rumble.CassiusClay 2rho.02no | 8.9% | 221 | 1167 | 3 | 106.7 | 1583 / 1586 (100%) | 0 | 0 |
| Krabb.sliNk.Garm 0.9u | 6.3% | 109 | 43 | 3 | 55.6 | 824 / 825 (100%) | 0 | 0 |
| axeBots.SilverSurfer 2.53.33fix | 7.0% | 152 | 60 | 3 | 41.1 | 540 / 541 (100%) | 0 | 0 |
| mn.Combat 3.25.0 | 10.2% | 227 | 66 | 3 | 112.8 | 1638 / 1642 (100%) | 0 | 0 |
| cs.s2.Seraphim 2.3.1 | 6.9% | 137 | 38 | 3 | 44.2 | 522 / 523 (100%) | 0 | 0 |
| fromHell.CHCl3 1.4.2 | 7.1% | 124 | 37 | 3 | 44.1 | 648 / 648 (100%) | 0 | 0 |
| jk.mini.CunobelinDC 1.2 | 1.3% | 78 | 12 | 3 | 0.4 | 10 / 13079 (0%) | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 8.8% | 216 | 51 | 3 | 89.6 | 1219 / 1220 (100%) | 0 | 0 |
| florent.test.Toad 0.14t | 8.3% | 151 | 39 | 3 | 48.7 | 651 / 652 (100%) | 0 | 0 |
| ar.horizon.Horizon 1.2.2 | 8.8% | 188 | 53 | 3 | 70.9 | 1102 / 1103 (100%) | 0 | 0 |
| cjm.chalk.Chalk 2.6.Be | 0.0% | 48 | 7 | 3 | 0.0 | 0 / 7982 (0%) | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 1.7% | 56 | 7 | 3 | 0.0 | 0 / 8808 (0%) | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 7.9% | 201 | 52 | 3 | 81.6 | 1064 / 1067 (100%) | 0 | 0 |
| pez.rumble.Ali 0.4.9 | 2.0% | 68 | 19 | 3 | 10.4 | 157 / 6775 (2%) | 0 | 0 |
| catcat20.Lambda 0.017 | 7.4% | 146 | 76 | 3 | 62.9 | 794 / 796 (100%) | 0 | 0 |
| florent.XSeries.X2 0.17 | 7.3% | 115 | 51 | 3 | 47.3 | 520 / 520 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| jd.Nullstride 2.3.3 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| voidious.Diamond 1.8.22 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| cb.fire.Firestarter 2.0f | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| xander.cat.XanderCat 12.9 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| lxx.Tomcat 3.68 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| aw.Gilgalad 1.99.5c | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| pc.Wavelet 1.5 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| gh.GresSuffurd 0.4.13 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| cs.Nene 1.0.5 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| jk.melee.Neuromancer 7.12 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| voidious.Dookious 1.573c | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| davidalves.Phoenix 1.02 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| cb.Domogled 1.2 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| mue.Ascendant 1.2.27 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| abc.Shadow 3.83c | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| darkcanuck.Pris 0.92 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| fromHell.BlackBox 0.0.2 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| jk.precise.Wintermute 0.8 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| kc.serpent.Hydra 0.21 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| davidalves.Firebird 0.25 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| ags.Midboss 1q.fast | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| pez.rumble.CassiusClay 2rho.02no | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| Krabb.sliNk.Garm 0.9u | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| axeBots.SilverSurfer 2.53.33fix | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| mn.Combat 3.25.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| cs.s2.Seraphim 2.3.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| fromHell.CHCl3 1.4.2 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| jk.mini.CunobelinDC 1.2 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| florent.test.Toad 0.14t | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| ar.horizon.Horizon 1.2.2 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| cjm.chalk.Chalk 2.6.Be | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| pez.rumble.Ali 0.4.9 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| catcat20.Lambda 0.017 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| florent.XSeries.X2 0.17 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| Krabb.sliNk.Garm 0.9u | hadur2.Hadur 3.13hjswpwf8 | 4 | 85.0% ± 30.5 | 80.0% ± 13.0 | -5.0 ± 33.1 | 48.8% ± 12.3 | 46.2% ± 6.5 | -2.6 ± 14.0 |
| Krabb.sliNk.Garm 0.9u | hadur2.Hadur 3.13hjsw | 4 | 85.0% ± 15.9 | 71.9% ± 14.4 | -13.1 ± 29.4 | 54.9% ± 13.9 | 48.1% ± 8.7 | -6.8 ± 8.2 |
| aaa.r.ScalarR 0.005h.053-noshield | hadur2.Hadur 3.13hjswpwf8 | 4 | 10.0% ± 31.8 | 17.8% ± 23.6 | +7.8 ± 27.3 | 35.6% ± 14.0 | 39.7% ± 3.8 | +4.1 ± 13.7 |
| aaa.r.ScalarR 0.005h.053-noshield | hadur2.Hadur 3.13hjsw | 4 | 15.0% ± 30.5 | 5.0% ± 9.2 | -10.0 ± 34.4 | 40.2% ± 6.3 | 36.3% ± 9.2 | -3.9 ± 14.8 |
| abc.Shadow 3.83c | hadur2.Hadur 3.13hjswpwf8 | 4 | 75.0% ± 40.0 | 51.1% ± 38.2 | -23.9 ± 60.5 | 37.1% ± 13.4 | 32.8% ± 6.4 | -4.3 ± 15.7 |
| abc.Shadow 3.83c | hadur2.Hadur 3.13hjsw | 4 | 85.0% ± 15.9 | 57.5% ± 45.7 | -27.5 ± 50.9 | 45.8% ± 11.9 | 35.9% ± 5.8 | -9.9 ± 17.5 |
| ags.Midboss 1q.fast | hadur2.Hadur 3.13hjswpwf8 | 4 | 95.0% ± 15.9 | 92.5% ± 15.2 | -2.5 ± 20.0 | 62.8% ± 1.9 | 64.3% ± 8.9 | +1.5 ± 10.0 |
| ags.Midboss 1q.fast | hadur2.Hadur 3.13hjsw | 4 | 75.0% ± 47.7 | 87.5% ± 8.0 | +12.5 ± 52.6 | 52.3% ± 14.8 | 60.3% ± 9.6 | +8.0 ± 16.1 |
| ar.horizon.Horizon 1.2.2 | hadur2.Hadur 3.13hjswpwf8 | 4 | 95.0% ± 15.9 | 71.9% ± 23.3 | -23.1 ± 37.5 | 64.0% ± 13.9 | 44.0% ± 10.4 | -20.0 ± 23.4 |
| ar.horizon.Horizon 1.2.2 | hadur2.Hadur 3.13hjsw | 4 | 65.0% ± 40.0 | 75.0% ± 20.5 | +10.0 ± 53.6 | 46.9% ± 12.8 | 41.2% ± 7.5 | -5.7 ± 19.7 |
| aw.Gilgalad 1.99.5c | hadur2.Hadur 3.13hjswpwf8 | 4 | 55.0% ± 15.9 | 50.8% ± 20.0 | -4.2 ± 25.0 | 41.1% ± 6.5 | 43.1% ± 9.3 | +2.0 ± 5.2 |
| aw.Gilgalad 1.99.5c | hadur2.Hadur 3.13hjsw | 4 | 42.5% ± 27.2 | 54.4% ± 26.9 | +11.9 ± 26.3 | 38.0% ± 11.9 | 38.8% ± 5.4 | +0.8 ± 13.9 |
| axeBots.SilverSurfer 2.53.33fix | hadur2.Hadur 3.13hjswpwf8 | 4 | 75.0% ± 47.7 | 87.5% ± 8.0 | +12.5 ± 52.6 | 55.2% ± 22.1 | 56.1% ± 14.1 | +0.8 ± 31.4 |
| axeBots.SilverSurfer 2.53.33fix | hadur2.Hadur 3.13hjsw | 4 | 75.0% ± 40.0 | 92.5% ± 15.2 | +17.5 ± 27.2 | 51.6% ± 14.2 | 63.9% ± 9.7 | +12.4 ± 14.9 |
| catcat20.Lambda 0.017 | hadur2.Hadur 3.13hjswpwf8 | 4 | 85.0% ± 30.5 | 84.4% ± 16.6 | -0.6 ± 35.8 | 54.1% ± 12.9 | 53.1% ± 8.3 | -1.0 ± 10.9 |
| catcat20.Lambda 0.017 | hadur2.Hadur 3.13hjsw | 4 | 80.0% ± 26.0 | 84.2% ± 22.7 | +4.2 ± 27.2 | 49.2% ± 24.7 | 49.9% ± 10.3 | +0.7 ± 19.0 |
| cb.Domogled 1.2 | hadur2.Hadur 3.13hjswpwf8 | 4 | 20.0% ± 26.0 | 60.0% ± 13.0 | +40.0 ± 34.4 | 60.8% ± 10.3 | 65.6% ± 6.5 | +4.8 ± 15.9 |
| cb.Domogled 1.2 | hadur2.Hadur 3.13hjsw | 4 | 40.0% ± 0.0 | 57.5% ± 32.8 | +17.5 ± 32.8 | 67.1% ± 14.2 | 59.5% ± 9.6 | -7.5 ± 16.5 |
| cb.fire.Firestarter 2.0f | hadur2.Hadur 3.13hjswpwf8 | 4 | 25.0% ± 30.5 | 57.5% ± 15.2 | +32.5 ± 45.7 | 49.4% ± 10.6 | 51.8% ± 6.7 | +2.4 ± 14.2 |
| cb.fire.Firestarter 2.0f | hadur2.Hadur 3.13hjsw | 4 | 40.0% ± 26.0 | 40.0% ± 22.5 | -0.0 ± 39.0 | 57.1% ± 9.4 | 48.5% ± 10.8 | -8.6 ± 2.9 |
| cjm.chalk.Chalk 2.6.Be | hadur2.Hadur 3.13hjswpwf8 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% | - | n/a |
| cjm.chalk.Chalk 2.6.Be | hadur2.Hadur 3.13hjsw | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% ± 0.0 | - | n/a |
| cs.Nene 1.0.5 | hadur2.Hadur 3.13hjswpwf8 | 4 | 85.0% ± 15.9 | 70.0% ± 13.0 | -15.0 ± 27.6 | 44.4% ± 19.1 | 37.2% ± 1.8 | -7.2 ± 20.7 |
| cs.Nene 1.0.5 | hadur2.Hadur 3.13hjsw | 4 | 73.8% ± 30.0 | 77.5% ± 20.0 | +3.8 ± 39.7 | 45.7% ± 12.0 | 37.6% ± 4.8 | -8.0 ± 12.5 |
| cs.s2.Seraphim 2.3.1 | hadur2.Hadur 3.13hjswpwf8 | 4 | 70.0% ± 31.8 | 85.0% ± 20.5 | +15.0 ± 33.1 | 46.3% ± 9.4 | 49.1% ± 5.3 | +2.9 ± 13.4 |
| cs.s2.Seraphim 2.3.1 | hadur2.Hadur 3.13hjsw | 4 | 90.0% ± 18.4 | 85.0% ± 20.5 | -5.0 ± 9.2 | 49.7% ± 16.7 | 58.9% ± 10.9 | +9.2 ± 22.6 |
| darkcanuck.Pris 0.92 | hadur2.Hadur 3.13hjswpwf8 | 4 | 50.0% ± 31.8 | 67.8% ± 34.3 | +17.8 ± 66.1 | 41.8% ± 11.2 | 49.1% ± 10.9 | +7.3 ± 17.7 |
| darkcanuck.Pris 0.92 | hadur2.Hadur 3.13hjsw | 4 | 55.0% ± 30.5 | 84.7% ± 20.3 | +29.7 ± 46.5 | 39.1% ± 10.0 | 53.4% ± 15.5 | +14.4 ± 17.4 |
| davidalves.Firebird 0.25 | hadur2.Hadur 3.13hjswpwf8 | 4 | 100.0% ± 0.0 | 97.5% ± 8.0 | -2.5 ± 8.0 | 0.0% | 0.0% ± 0.0 | +0.0 |
| davidalves.Firebird 0.25 | hadur2.Hadur 3.13hjsw | 4 | 100.0% ± 0.0 | 97.5% ± 8.0 | -2.5 ± 8.0 | 0.0% ± 0.0 | 0.0% ± 0.0 | +0.0 ± 0.0 |
| davidalves.Phoenix 1.02 | hadur2.Hadur 3.13hjswpwf8 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% ± 0.0 | - | n/a |
| davidalves.Phoenix 1.02 | hadur2.Hadur 3.13hjsw | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% ± 0.0 | - | n/a |
| dsekercioglu.mega.Raven 3.56j8 | hadur2.Hadur 3.13hjswpwf8 | 4 | 80.0% ± 26.0 | 69.2% ± 13.3 | -10.8 ± 34.5 | 38.8% ± 12.3 | 38.0% ± 5.1 | -0.7 ± 12.1 |
| dsekercioglu.mega.Raven 3.56j8 | hadur2.Hadur 3.13hjsw | 4 | 55.0% ± 54.4 | 61.7% ± 14.0 | +6.7 ± 51.4 | 40.6% ± 11.6 | 35.2% ± 6.1 | -5.4 ± 11.1 |
| dsekercioglu.mega.WhiteFang 2.8.1 | hadur2.Hadur 3.13hjswpwf8 | 4 | 85.0% ± 15.9 | 85.0% ± 20.5 | -0.0 ± 29.1 | 55.1% ± 8.5 | 53.8% ± 15.3 | -1.3 ± 12.1 |
| dsekercioglu.mega.WhiteFang 2.8.1 | hadur2.Hadur 3.13hjsw | 4 | 80.0% ± 26.0 | 90.0% ± 13.0 | +10.0 ± 34.4 | 48.8% ± 14.1 | 51.7% ± 9.6 | +2.9 ± 10.9 |
| florent.XSeries.X2 0.17 | hadur2.Hadur 3.13hjswpwf8 | 4 | 70.0% ± 31.8 | 79.4% ± 13.1 | +9.4 ± 35.0 | 42.2% ± 6.7 | 52.5% ± 12.8 | +10.3 ± 18.7 |
| florent.XSeries.X2 0.17 | hadur2.Hadur 3.13hjsw | 4 | 80.0% ± 26.0 | 84.7% ± 8.7 | +4.7 ± 28.1 | 55.5% ± 8.5 | 47.2% ± 14.0 | -8.4 ± 22.0 |
| florent.test.Toad 0.14t | hadur2.Hadur 3.13hjswpwf8 | 4 | 70.0% ± 31.8 | 73.1% ± 31.5 | +3.1 ± 8.6 | 47.2% ± 21.3 | 44.7% ± 11.8 | -2.5 ± 18.0 |
| florent.test.Toad 0.14t | hadur2.Hadur 3.13hjsw | 4 | 80.0% ± 26.0 | 77.2% ± 23.4 | -2.8 ± 43.1 | 49.8% ± 10.4 | 46.1% ± 11.4 | -3.7 ± 10.0 |
| fromHell.BlackBox 0.0.2 | hadur2.Hadur 3.13hjswpwf8 | 4 | 75.0% ± 47.7 | 67.5% ± 23.9 | -7.5 ± 43.8 | 49.3% ± 9.4 | 50.7% ± 8.4 | +1.3 ± 9.6 |
| fromHell.BlackBox 0.0.2 | hadur2.Hadur 3.13hjsw | 4 | 65.0% ± 30.5 | 82.2% ± 26.9 | +17.2 ± 52.7 | 48.2% ± 8.6 | 56.4% ± 8.7 | +8.2 ± 14.7 |
| fromHell.CHCl3 1.4.2 | hadur2.Hadur 3.13hjswpwf8 | 4 | 80.0% ± 26.0 | 83.9% ± 33.6 | +3.9 ± 42.5 | 51.8% ± 14.5 | 60.1% ± 11.6 | +8.3 ± 5.9 |
| fromHell.CHCl3 1.4.2 | hadur2.Hadur 3.13hjsw | 4 | 80.0% ± 36.7 | 95.0% ± 15.9 | +15.0 ± 30.5 | 53.2% ± 15.2 | 63.5% ± 14.6 | +10.3 ± 24.7 |
| gh.GresSuffurd 0.4.13 | hadur2.Hadur 3.13hjswpwf8 | 4 | 55.0% ± 30.5 | 75.0% ± 20.5 | +20.0 ± 39.0 | 46.3% ± 5.3 | 49.6% ± 9.3 | +3.2 ± 9.0 |
| gh.GresSuffurd 0.4.13 | hadur2.Hadur 3.13hjsw | 4 | 75.0% ± 40.0 | 56.1% ± 40.9 | -18.9 ± 62.7 | 50.1% ± 15.9 | 44.6% ± 11.4 | -5.5 ± 19.1 |
| jd.Nullstride 2.3.3 | hadur2.Hadur 3.13hjswpwf8 | 4 | 15.0% ± 30.5 | 16.1% ± 9.3 | +1.1 ± 30.3 | 44.3% ± 6.6 | 43.3% ± 8.4 | -1.0 ± 3.9 |
| jd.Nullstride 2.3.3 | hadur2.Hadur 3.13hjsw | 4 | 5.0% ± 15.9 | 11.1% ± 14.4 | +6.1 ± 28.9 | 39.6% ± 10.5 | 42.9% ± 8.9 | +3.3 ± 15.6 |
| jk.mega.DrussGT 3.1.16 | hadur2.Hadur 3.13hjswpwf8 | 4 | 55.0% ± 30.5 | 50.8% ± 35.3 | -4.2 ± 38.3 | 60.8% ± 7.7 | 45.0% ± 8.6 | -15.8 ± 9.3 |
| jk.mega.DrussGT 3.1.16 | hadur2.Hadur 3.13hjsw | 4 | 55.0% ± 40.0 | 41.1% ± 43.4 | -13.9 ± 53.3 | 61.3% ± 16.7 | 44.9% ± 9.4 | -16.4 ± 11.5 |
| jk.melee.Neuromancer 7.12 | hadur2.Hadur 3.13hjswpwf8 | 4 | 55.0% ± 47.7 | 55.0% ± 30.5 | -0.0 ± 60.9 | 54.3% ± 20.7 | 50.6% ± 10.6 | -3.8 ± 21.5 |
| jk.melee.Neuromancer 7.12 | hadur2.Hadur 3.13hjsw | 4 | 40.0% ± 0.0 | 45.8% ± 15.1 | +5.8 ± 15.1 | 51.5% ± 5.9 | 43.0% ± 8.1 | -8.5 ± 9.9 |
| jk.mini.CunobelinDC 1.2 | hadur2.Hadur 3.13hjswpwf8 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 8.4% ± 17.7 | 3.9% ± 7.2 | -4.5 ± 21.6 |
| jk.mini.CunobelinDC 1.2 | hadur2.Hadur 3.13hjsw | 4 | 95.0% ± 15.9 | 100.0% ± 0.0 | +5.0 ± 15.9 | 8.2% ± 18.0 | 21.0% ± 48.3 | +12.7 ± 60.5 |
| jk.precise.Wintermute 0.8 | hadur2.Hadur 3.13hjswpwf8 | 4 | 80.0% ± 26.0 | 92.5% ± 8.0 | +12.5 ± 27.2 | 50.0% ± 15.5 | 44.5% ± 10.1 | -5.6 ± 22.0 |
| jk.precise.Wintermute 0.8 | hadur2.Hadur 3.13hjsw | 4 | 75.0% ± 30.5 | 69.2% ± 13.3 | -5.8 ± 30.1 | 46.9% ± 10.3 | 40.0% ± 5.6 | -6.9 ± 9.2 |
| kc.mega.BeepBoop 2.0 | hadur2.Hadur 3.13hjswpwf8 | 4 | 0.0% ± 0.0 | 20.0% ± 13.0 | +20.0 ± 13.0 | 39.3% ± 8.6 | 42.6% ± 3.5 | +3.2 ± 10.5 |
| kc.mega.BeepBoop 2.0 | hadur2.Hadur 3.13hjsw | 4 | 10.0% ± 31.8 | 12.8% ± 19.9 | +2.8 ± 40.0 | 43.2% ± 24.6 | 36.4% ± 4.5 | -6.8 ± 23.7 |
| kc.serpent.Hydra 0.21 | hadur2.Hadur 3.13hjswpwf8 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | - | 0.0% | n/a |
| kc.serpent.Hydra 0.21 | hadur2.Hadur 3.13hjsw | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | - | - | n/a |
| kc.serpent.WaveSerpent 2.11 | hadur2.Hadur 3.13hjswpwf8 | 4 | 75.0% ± 15.9 | 80.0% ± 29.1 | +5.0 ± 37.9 | 41.2% ± 5.4 | 41.0% ± 4.2 | -0.3 ± 9.2 |
| kc.serpent.WaveSerpent 2.11 | hadur2.Hadur 3.13hjsw | 4 | 90.0% ± 18.4 | 89.7% ± 13.0 | -0.3 ± 28.7 | 54.4% ± 15.8 | 42.4% ± 7.3 | -12.0 ± 20.4 |
| lxx.Tomcat 3.68 | hadur2.Hadur 3.13hjswpwf8 | 4 | 75.0% ± 15.9 | 68.9% ± 20.9 | -6.1 ± 31.4 | 41.5% ± 4.8 | 47.4% ± 9.5 | +5.9 ± 8.3 |
| lxx.Tomcat 3.68 | hadur2.Hadur 3.13hjsw | 4 | 80.0% ± 36.7 | 71.4% ± 18.4 | -8.6 ± 34.7 | 50.5% ± 17.3 | 45.9% ± 8.0 | -4.6 ± 13.8 |
| mn.Combat 3.25.0 | hadur2.Hadur 3.13hjswpwf8 | 4 | 70.0% ± 18.4 | 62.5% ± 20.0 | -7.5 ± 23.9 | 50.3% ± 15.1 | 43.0% ± 5.0 | -7.3 ± 11.9 |
| mn.Combat 3.25.0 | hadur2.Hadur 3.13hjsw | 4 | 70.0% ± 41.1 | 60.0% ± 13.0 | -10.0 ± 34.4 | 41.8% ± 18.8 | 42.8% ± 8.6 | +1.0 ± 17.2 |
| mue.Ascendant 1.2.27 | hadur2.Hadur 3.13hjswpwf8 | 4 | 70.0% ± 18.4 | 61.1% ± 25.3 | -8.9 ± 15.0 | 42.5% ± 17.0 | 44.5% ± 8.2 | +2.0 ± 12.5 |
| mue.Ascendant 1.2.27 | hadur2.Hadur 3.13hjsw | 4 | 75.0% ± 30.5 | 81.9% ± 8.7 | +6.9 ± 29.4 | 45.7% ± 18.2 | 51.6% ± 9.1 | +5.9 ± 26.1 |
| oog.mega.saguaro.Saguaro 1.0 | hadur2.Hadur 3.13hjswpwf8 | 4 | 85.0% ± 15.9 | 85.0% ± 9.2 | +0.0 ± 22.5 | 90.6% ± 4.9 | 48.5% ± 14.4 | -42.1 ± 16.6 |
| oog.mega.saguaro.Saguaro 1.0 | hadur2.Hadur 3.13hjsw | 4 | 85.0% ± 15.9 | 85.0% ± 9.2 | +0.0 ± 13.0 | 91.3% ± 3.6 | 46.0% ± 12.7 | -45.3 ± 12.4 |
| pc.Wavelet 1.5 | hadur2.Hadur 3.13hjswpwf8 | 4 | 65.0% ± 30.5 | 54.4% ± 25.9 | -10.6 ± 28.5 | 60.7% ± 8.9 | 48.3% ± 2.6 | -12.4 ± 8.1 |
| pc.Wavelet 1.5 | hadur2.Hadur 3.13hjsw | 4 | 30.0% ± 18.4 | 55.0% ± 15.9 | +25.0 ± 15.9 | 57.2% ± 4.6 | 54.8% ± 23.6 | -2.3 ± 21.9 |
| pez.rumble.Ali 0.4.9 | hadur2.Hadur 3.13hjswpwf8 | 4 | 95.0% ± 15.9 | 97.2% ± 8.8 | +2.2 ± 20.6 | 0.0% ± 0.0 | 30.3% ± 33.1 | +30.3 ± 33.1 |
| pez.rumble.Ali 0.4.9 | hadur2.Hadur 3.13hjsw | 4 | 100.0% ± 0.0 | 87.5% ± 30.1 | -12.5 ± 30.1 | 0.0% ± 0.0 | 30.5% ± 34.4 | +30.5 ± 34.4 |
| pez.rumble.CassiusClay 2rho.02no | hadur2.Hadur 3.13hjswpwf8 | 4 | 80.0% ± 26.0 | 68.1% ± 16.0 | -11.9 ± 37.2 | 62.8% ± 4.3 | 58.0% ± 6.8 | -4.8 ± 7.1 |
| pez.rumble.CassiusClay 2rho.02no | hadur2.Hadur 3.13hjsw | 4 | 60.0% ± 63.6 | 60.8% ± 37.1 | +0.8 ± 89.5 | 57.7% ± 13.4 | 56.9% ± 6.4 | -0.8 ± 18.5 |
| pulsar.PulsarMax 0.8.9 | hadur2.Hadur 3.13hjswpwf8 | 4 | 85.0% ± 15.9 | 84.2% ± 22.7 | -0.8 ± 15.2 | 50.1% ± 9.2 | 43.7% ± 9.4 | -6.5 ± 13.5 |
| pulsar.PulsarMax 0.8.9 | hadur2.Hadur 3.13hjsw | 4 | 90.0% ± 18.4 | 81.7% ± 17.6 | -8.3 ± 20.5 | 45.2% ± 13.9 | 39.7% ± 6.2 | -5.5 ± 12.9 |
| rsalesc.mega.Knight 0.6.28 | hadur2.Hadur 3.13hjswpwf8 | 4 | 55.0% ± 40.0 | 47.5% ± 29.5 | -7.5 ± 45.9 | 59.1% ± 4.8 | 50.7% ± 6.2 | -8.4 ± 9.1 |
| rsalesc.mega.Knight 0.6.28 | hadur2.Hadur 3.13hjsw | 4 | 65.0% ± 30.5 | 50.8% ± 20.0 | -14.2 ± 43.8 | 58.0% ± 14.8 | 48.8% ± 5.7 | -9.2 ± 11.0 |
| rsalesc.roborio.Roborio 1.2.4 | hadur2.Hadur 3.13hjswpwf8 | 4 | 50.0% ± 31.8 | 55.3% ± 34.8 | +5.3 ± 56.7 | 72.0% ± 13.8 | 58.6% ± 10.0 | -13.5 ± 18.4 |
| rsalesc.roborio.Roborio 1.2.4 | hadur2.Hadur 3.13hjsw | 4 | 50.0% ± 31.8 | 50.8% ± 24.9 | +0.8 ± 53.1 | 71.9% ± 8.3 | 54.7% ± 11.1 | -17.1 ± 18.7 |
| sheldor.mini.FoilistMC 1.0 | hadur2.Hadur 3.13hjswpwf8 | 4 | 90.0% ± 18.4 | 87.2% ± 7.7 | -2.8 ± 24.2 | 61.0% ± 11.4 | 55.6% ± 10.5 | -5.4 ± 17.3 |
| sheldor.mini.FoilistMC 1.0 | hadur2.Hadur 3.13hjsw | 4 | 85.0% ± 30.5 | 79.4% ± 1.8 | -5.6 ± 28.9 | 59.4% ± 20.4 | 60.0% ± 7.0 | +0.6 ± 22.0 |
| sheldor.mini.Foilist 1.3.1 | hadur2.Hadur 3.13hjswpwf8 | 4 | 75.0% ± 30.5 | 77.5% ± 20.0 | +2.5 ± 49.3 | 53.0% ± 25.7 | 56.2% ± 9.3 | +3.1 ± 33.5 |
| sheldor.mini.Foilist 1.3.1 | hadur2.Hadur 3.13hjsw | 4 | 80.0% ± 26.0 | 73.1% ± 22.3 | -6.9 ± 23.1 | 55.7% ± 12.3 | 44.5% ± 13.9 | -11.2 ± 3.8 |
| voidious.Diamond 1.8.22 | hadur2.Hadur 3.13hjswpwf8 | 4 | 50.0% ± 41.1 | 68.6% ± 11.8 | +18.6 ± 50.6 | 43.5% ± 18.1 | 42.6% ± 5.9 | -0.9 ± 20.3 |
| voidious.Diamond 1.8.22 | hadur2.Hadur 3.13hjsw | 4 | 70.0% ± 18.4 | 54.2% ± 26.1 | -15.8 ± 25.0 | 47.5% ± 19.5 | 42.0% ± 6.2 | -5.6 ± 14.8 |
| voidious.Dookious 1.573c | hadur2.Hadur 3.13hjswpwf8 | 4 | 65.0% ± 40.0 | 66.9% ± 29.4 | +1.9 ± 52.0 | 42.7% ± 13.9 | 42.2% ± 15.4 | -0.5 ± 14.0 |
| voidious.Dookious 1.573c | hadur2.Hadur 3.13hjsw | 4 | 75.0% ± 30.5 | 66.7% ± 27.0 | -8.3 ± 9.2 | 37.8% ± 6.0 | 39.3% ± 3.2 | +1.5 ± 4.8 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | hadur2.Hadur 3.13hjswpwf8 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 10.3% ± 17.3 | 6.0% ± 6.5 | -4.3 ± 13.1 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | hadur2.Hadur 3.13hjsw | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 10.6% ± 17.5 | 4.4% ± 10.2 | -6.2 ± 23.6 |
| xander.cat.XanderCat 12.9 | hadur2.Hadur 3.13hjswpwf8 | 4 | 75.0% ± 30.5 | 66.7% ± 30.0 | -8.3 ± 30.5 | 51.7% ± 15.2 | 49.4% ± 5.9 | -2.3 ± 10.4 |
| xander.cat.XanderCat 12.9 | hadur2.Hadur 3.13hjsw | 4 | 80.0% ± 26.0 | 68.1% ± 50.2 | -11.9 ± 38.8 | 58.5% ± 1.6 | 48.7% ± 14.9 | -9.8 ± 14.1 |
| zyx.mega.YersiniaPestis 3.0 | hadur2.Hadur 3.13hjswpwf8 | 4 | 70.0% ± 31.8 | 70.0% ± 22.5 | -0.0 ± 13.0 | 46.9% ± 8.3 | 35.9% ± 2.5 | -11.0 ± 6.6 |
| zyx.mega.YersiniaPestis 3.0 | hadur2.Hadur 3.13hjsw | 4 | 85.0% ± 30.5 | 58.9% ± 13.5 | -26.1 ± 19.9 | 47.9% ± 15.6 | 36.8% ± 8.4 | -11.1 ± 12.7 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| Krabb.sliNk.Garm 0.9u | -0.0 ± 26.0 | +8.1 ± 23.3 | -6.0 ± 25.9 | -1.9 ± 11.4 |
| aaa.r.ScalarR 0.005h.053-noshield | -5.0 ± 54.4 | +12.8 ± 15.1 | -4.6 ± 19.3 | +3.4 ± 9.1 |
| abc.Shadow 3.83c | -10.0 ± 55.1 | -6.4 ± 71.6 | -8.7 ± 24.2 | -3.1 ± 10.5 |
| ags.Midboss 1q.fast | +20.0 ± 45.0 | +5.0 ± 20.5 | +10.5 ± 13.2 | +4.0 ± 16.3 |
| ar.horizon.Horizon 1.2.2 | +30.0 ± 41.1 | -3.1 ± 29.4 | +17.1 ± 11.7 | +2.7 ± 10.8 |
| aw.Gilgalad 1.99.5c | +12.5 ± 15.2 | -3.6 ± 44.8 | +3.1 ± 15.0 | +4.3 ± 8.1 |
| axeBots.SilverSurfer 2.53.33fix | -0.0 ± 82.2 | -5.0 ± 9.2 | +3.7 ± 35.6 | -7.9 ± 17.4 |
| catcat20.Lambda 0.017 | +5.0 ± 40.0 | +0.3 ± 16.6 | +4.9 ± 23.0 | +3.2 ± 14.4 |
| cb.Domogled 1.2 | -20.0 ± 26.0 | +2.5 ± 43.8 | -6.2 ± 14.1 | +6.1 ± 12.1 |
| cb.fire.Firestarter 2.0f | -15.0 ± 54.4 | +17.5 ± 35.3 | -7.7 ± 12.7 | +3.3 ± 15.6 |
| cjm.chalk.Chalk 2.6.Be | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 | n/a |
| cs.Nene 1.0.5 | +11.3 ± 40.2 | -7.5 ± 27.2 | -1.3 ± 31.0 | -0.4 ± 4.3 |
| cs.s2.Seraphim 2.3.1 | -20.0 ± 26.0 | +0.0 ± 13.0 | -3.4 ± 22.2 | -9.8 ± 14.4 |
| darkcanuck.Pris 0.92 | -5.0 ± 60.2 | -16.9 ± 43.8 | +2.7 ± 6.6 | -4.3 ± 25.4 |
| davidalves.Firebird 0.25 | +0.0 ± 0.0 | +0.0 ± 13.0 | n/a | +0.0 ± 0.0 |
| davidalves.Phoenix 1.02 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | n/a |
| dsekercioglu.mega.Raven 3.56j8 | +25.0 ± 65.6 | +7.5 ± 11.8 | -1.8 ± 22.0 | +2.8 ± 5.1 |
| dsekercioglu.mega.WhiteFang 2.8.1 | +5.0 ± 40.0 | -5.0 ± 9.2 | +6.3 ± 11.0 | +2.1 ± 19.0 |
| florent.XSeries.X2 0.17 | -10.0 ± 18.4 | -5.3 ± 16.2 | -13.4 ± 6.5 | +5.3 ± 11.1 |
| florent.test.Toad 0.14t | -10.0 ± 55.1 | -4.2 ± 30.9 | -2.6 ± 14.8 | -1.4 ± 17.6 |
| fromHell.BlackBox 0.0.2 | +10.0 ± 60.9 | -14.7 ± 37.5 | +1.1 ± 9.1 | -5.7 ± 10.3 |
| fromHell.CHCl3 1.4.2 | +0.0 ± 26.0 | -11.1 ± 43.9 | -1.4 ± 27.6 | -3.4 ± 5.6 |
| gh.GresSuffurd 0.4.13 | -20.0 ± 45.0 | +18.9 ± 34.6 | -3.8 ± 16.6 | +5.0 ± 10.5 |
| jd.Nullstride 2.3.3 | +10.0 ± 41.1 | +5.0 ± 22.4 | +4.7 ± 11.0 | +0.3 ± 16.0 |
| jk.mega.DrussGT 3.1.16 | +0.0 ± 58.1 | +9.7 ± 67.7 | -0.5 ± 21.6 | +0.1 ± 13.9 |
| jk.melee.Neuromancer 7.12 | +15.0 ± 47.7 | +9.2 ± 31.9 | +2.8 ± 24.5 | +7.5 ± 7.4 |
| jk.mini.CunobelinDC 1.2 | +5.0 ± 15.9 | +0.0 ± 0.0 | +0.2 ± 0.5 | -17.1 ± 43.3 |
| jk.precise.Wintermute 0.8 | +5.0 ± 54.4 | +23.3 ± 7.5 | +3.1 ± 21.0 | +4.4 ± 9.4 |
| kc.mega.BeepBoop 2.0 | -10.0 ± 31.8 | +7.2 ± 23.4 | -3.9 ± 24.1 | +6.2 ± 6.9 |
| kc.serpent.Hydra 0.21 | +0.0 ± 0.0 | +0.0 ± 0.0 | n/a | n/a |
| kc.serpent.WaveSerpent 2.11 | -15.0 ± 15.9 | -9.7 ± 25.3 | -13.2 ± 19.4 | -1.4 ± 7.0 |
| lxx.Tomcat 3.68 | -5.0 ± 47.7 | -2.5 ± 12.0 | -9.0 ± 12.8 | +1.5 ± 4.2 |
| mn.Combat 3.25.0 | +0.0 ± 45.0 | +2.5 ± 27.2 | +8.6 ± 23.9 | +0.2 ± 13.3 |
| mue.Ascendant 1.2.27 | -5.0 ± 15.9 | -20.8 ± 20.7 | -3.2 ± 9.8 | -7.1 ± 13.0 |
| oog.mega.saguaro.Saguaro 1.0 | +0.0 ± 26.0 | +0.0 ± 13.0 | -0.7 ± 4.6 | +2.5 ± 26.5 |
| pc.Wavelet 1.5 | +35.0 ± 40.0 | -0.6 ± 32.7 | +3.6 ± 7.4 | -6.5 ± 23.8 |
| pez.rumble.Ali 0.4.9 | -5.0 ± 15.9 | +9.7 ± 34.9 | +0.0 ± 0.0 | -0.2 ± 62.2 |
| pez.rumble.CassiusClay 2rho.02no | +20.0 ± 86.2 | +7.2 ± 47.4 | +5.1 ± 16.7 | +1.1 ± 13.0 |
| pulsar.PulsarMax 0.8.9 | -5.0 ± 15.9 | +2.5 ± 27.5 | +4.9 ± 14.8 | +3.9 ± 12.7 |
| rsalesc.mega.Knight 0.6.28 | -10.0 ± 18.4 | -3.3 ± 26.3 | +1.1 ± 13.7 | +1.9 ± 2.5 |
| rsalesc.roborio.Roborio 1.2.4 | -0.0 ± 36.7 | +4.4 ± 13.3 | +0.2 ± 18.7 | +3.9 ± 3.1 |
| sheldor.mini.FoilistMC 1.0 | +5.0 ± 30.5 | +7.8 ± 8.5 | +1.6 ± 26.4 | -4.4 ± 12.6 |
| sheldor.mini.Foilist 1.3.1 | -5.0 ± 30.5 | +4.4 ± 15.1 | -2.7 ± 29.4 | +11.7 ± 21.3 |
| voidious.Diamond 1.8.22 | -20.0 ± 52.0 | +14.4 ± 26.6 | -4.1 ± 25.4 | +0.6 ± 11.8 |
| voidious.Dookious 1.573c | -10.0 ± 60.9 | +0.3 ± 54.7 | +4.9 ± 18.0 | +2.9 ± 15.0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.3 ± 0.6 | +1.6 ± 15.4 |
| xander.cat.XanderCat 12.9 | -5.0 ± 54.4 | -1.4 ± 63.6 | -6.9 ± 16.1 | +0.7 ± 20.4 |
| zyx.mega.YersiniaPestis 3.0 | -15.0 ± 54.4 | +11.1 ± 24.4 | -1.0 ± 15.8 | -0.9 ± 10.9 |
