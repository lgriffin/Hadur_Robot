# Bench: hadur2.Hadur 3.13hjswpa (cold)

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 7047 over 192 battles (36.7 per battle, most in one battle 78). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rank1-band1 | 26.1% ± 4.4 | 12.9% ± 7.9 | 43.9% ± 0.4 | 18 / 140 | 5.2% ± 0.3 | 9.0% ± 0.4 | 179 | 0 | 1.85 / 714.9 |
| jd.Nullstride 2.3.3 | rank2-band1 | 25.7% ± 4.8 | 12.9% ± 4.5 | 43.1% ± 4.9 | 18 / 140 | 5.1% ± 0.2 | 8.9% ± 0.7 | 174 | 0 | 1.68 / 516.6 |
| jk.mega.DrussGT 3.1.16 | rank3-band1 | 47.7% ± 8.3 | 47.1% ± 10.8 | 48.2% ± 5.6 | 66 / 140 | 7.6% ± 0.1 | 10.4% ± 0.4 | 294 | 0 | 1.42 / 681.4 |
| oog.mega.saguaro.Saguaro 1.0 | rank4-band1 | 67.9% ± 17.7 | 69.3% ± 26.1 | 65.9% ± 11.2 | 97 / 140 | 16.2% ± 3.9 | 6.4% ± 0.8 | 73 | 0 | 2.08 / 16.6 |
| aaa.r.ScalarR 0.005h.053-noshield | rank5-band1 | 32.3% ± 4.2 | 21.4% ± 5.9 | 44.9% ± 5.5 | 30 / 140 | 6.8% ± 1.0 | 10.5% ± 0.6 | 252 | 0 | 1.64 / 49.3 |
| voidious.Diamond 1.8.22 | rank6-band1 | 47.8% ± 7.4 | 53.6% ± 12.0 | 41.7% ± 2.9 | 75 / 140 | 6.7% ± 0.9 | 8.9% ± 0.3 | 242 | 0 | 1.64 / 40.7 |
| cb.fire.Firestarter 2.0f | rank7-band1 | 50.0% ± 6.7 | 44.3% ± 12.0 | 55.1% ± 7.3 | 62 / 140 | 9.0% ± 1.1 | 9.8% ± 0.8 | 226 | 0 | 1.70 / 29.5 |
| dsekercioglu.mega.Raven 3.56j8 | rank8-band1 | 47.7% ± 10.4 | 52.1% ± 19.8 | 43.4% ± 2.1 | 73 / 140 | 9.8% ± 1.0 | 9.2% ± 0.7 | 168 | 0 | 1.21 / 15.8 |
| xander.cat.XanderCat 12.9 | rank9-band1 | 53.9% ± 3.0 | 52.5% ± 5.1 | 55.1% ± 3.9 | 74 / 140 | 11.0% ± 0.3 | 8.7% ± 0.9 | 147 | 0 | 1.30 / 25.4 |
| lxx.Tomcat 3.68 | rank10-band1 | 42.1% ± 14.2 | 42.9% ± 24.3 | 42.5% ± 4.8 | 60 / 140 | 8.9% ± 1.0 | 10.4% ± 0.8 | 241 | 0 | 1.89 / 52.9 |
| rsalesc.mega.Knight 0.6.28 | rank11-band2 | 50.8% ± 5.0 | 48.6% ± 9.1 | 52.4% ± 1.6 | 68 / 140 | 9.4% ± 0.4 | 10.1% ± 0.6 | 288 | 0 | 2.00 / 205.2 |
| aw.Gilgalad 1.99.5c | rank12-band2 | 42.4% ± 6.1 | 44.3% ± 13.1 | 41.4% ± 5.9 | 62 / 140 | 8.6% ± 1.2 | 10.1% ± 0.6 | 235 | 0 | 1.46 / 22.1 |
| pc.Wavelet 1.5 | rank13-band2 | 44.3% ± 7.4 | 37.9% ± 15.0 | 51.4% ± 3.3 | 53 / 140 | 9.6% ± 0.6 | 9.1% ± 1.5 | 121 | 0 | 1.85 / 18.1 |
| gh.GresSuffurd 0.4.13 | rank14-band2 | 52.7% ± 10.4 | 51.4% ± 11.1 | 53.5% ± 9.9 | 72 / 140 | 10.2% ± 0.9 | 8.4% ± 0.7 | 142 | 0 | 1.06 / 99.3 |
| kc.serpent.WaveSerpent 2.11 | rank15-band2 | 53.8% ± 2.6 | 64.3% ± 7.9 | 42.8% ± 4.2 | 90 / 140 | 8.6% ± 0.5 | 8.1% ± 0.7 | 95 | 0 | 2.06 / 405.8 |
| dsekercioglu.mega.WhiteFang 2.8.1 | rank16-band2 | 61.8% ± 8.2 | 71.4% ± 13.4 | 51.1% ± 5.5 | 100 / 140 | 10.5% ± 1.0 | 8.0% ± 0.5 | 142 | 0 | 1.17 / 430.3 |
| cs.Nene 1.0.5 | rank17-band2 | 55.5% ± 3.9 | 67.9% ± 5.7 | 42.8% ± 3.4 | 95 / 140 | 9.4% ± 0.6 | 8.1% ± 0.9 | 106 | 0 | 1.28 / 483.6 |
| jk.melee.Neuromancer 7.12 | rank18-band2 | 42.3% ± 5.8 | 37.9% ± 13.1 | 47.0% ± 3.2 | 53 / 140 | 8.9% ± 0.7 | 9.9% ± 1.0 | 221 | 0 | 1.74 / 21.5 |
| voidious.Dookious 1.573c | rank19-band2 | 54.5% ± 2.5 | 61.4% ± 4.5 | 47.1% ± 4.3 | 86 / 140 | 8.8% ± 0.7 | 7.6% ± 0.2 | 112 | 0 | 1.24 / 25.2 |
| davidalves.Phoenix 1.02 | rank21-band2 | 99.0% ± 0.7 | 100.0% ± 0.0 | 0.0% ± 0.0 | 140 / 140 | 0.0% ± 0.0 | 0.1% ± 0.1 | 51 | 0 | 0.52 / 17.9 |
| rsalesc.roborio.Roborio 1.2.4 | rank22-band2 | 59.9% ± 6.1 | 52.9% ± 8.7 | 65.2% ± 5.2 | 74 / 140 | 11.4% ± 0.6 | 9.4% ± 0.6 | 230 | 0 | 1.51 / 24.7 |
| cb.Domogled 1.2 | rank23-band2 | 59.7% ± 13.7 | 53.6% ± 18.3 | 64.4% ± 14.2 | 75 / 140 | 10.5% ± 1.6 | 8.2% ± 0.7 | 222 | 0 | 1.00 / 23.6 |
| mue.Ascendant 1.2.27 | rank24-band2 | 53.3% ± 9.7 | 60.0% ± 8.3 | 46.9% ± 10.6 | 84 / 140 | 10.2% ± 0.5 | 7.9% ± 1.0 | 95 | 0 | 1.02 / 12.9 |
| abc.Shadow 3.83c | rank25-band2 | 46.1% ± 8.7 | 51.4% ± 9.8 | 41.2% ± 8.3 | 72 / 140 | 9.4% ± 2.1 | 9.0% ± 0.6 | 122 | 0 | 1.15 / 153.3 |
| darkcanuck.Pris 0.92 | rank26-band2 | 55.5% ± 13.5 | 58.6% ± 21.2 | 51.9% ± 9.3 | 82 / 140 | 10.3% ± 1.1 | 8.8% ± 1.0 | 62 | 0 | 1.82 / 13.1 |
| fromHell.BlackBox 0.0.2 | rank27-band2 | 61.8% ± 13.2 | 62.9% ± 18.6 | 59.9% ± 7.6 | 88 / 140 | 14.4% ± 2.3 | 7.7% ± 0.2 | 102 | 0 | 1.00 / 12.8 |
| jk.precise.Wintermute 0.8 | rank28-band2 | 59.9% ± 3.6 | 67.9% ± 6.8 | 51.5% ± 6.7 | 95 / 140 | 10.2% ± 0.5 | 8.4% ± 1.4 | 126 | 0 | 1.28 / 453.8 |
| kc.serpent.Hydra 0.21 | rank29-band2 | 100.0% ± 0.0 | 100.0% ± 0.0 | 50.0% ± 0.0 | 140 / 140 | 0.0% ± 0.0 | 0.0% ± 0.0 | 55 | 0 | 0.72 / 20.2 |
| davidalves.Firebird 0.25 | rank30-band2 | 98.6% ± 2.3 | 100.0% ± 0.0 | 12.5% ± 39.8 | 140 / 140 | 0.0% ± 0.0 | 0.2% ± 0.3 | 53 | 0 | 0.70 / 95.5 |
| pulsar.PulsarMax 0.8.9 | rank31-band2 | 54.5% ± 6.5 | 67.1% ± 12.0 | 41.0% ± 3.2 | 94 / 140 | 9.0% ± 0.7 | 7.7% ± 1.3 | 131 | 0 | 1.13 / 504.1 |
| zyx.mega.YersiniaPestis 3.0 | rank32-band2 | 52.0% ± 8.9 | 62.1% ± 14.1 | 42.3% ± 4.2 | 87 / 140 | 10.2% ± 1.4 | 8.5% ± 0.5 | 173 | 0 | 1.45 / 24.2 |
| ags.Midboss 1q.fast | rank33-band2 | 65.7% ± 9.7 | 68.6% ± 16.2 | 62.1% ± 4.8 | 96 / 140 | 11.5% ± 1.1 | 8.6% ± 1.2 | 141 | 0 | 1.44 / 477.3 |
| pez.rumble.CassiusClay 2rho.02no | rank35-band2 | 58.4% ± 4.2 | 53.6% ± 5.7 | 61.8% ± 3.1 | 75 / 140 | 11.1% ± 0.9 | 8.8% ± 0.4 | 185 | 0 | 1.18 / 73.1 |
| Krabb.sliNk.Garm 0.9u | rank36-band2 | 66.2% ± 8.2 | 73.6% ± 9.4 | 57.9% ± 7.6 | 103 / 140 | 11.1% ± 1.4 | 7.3% ± 1.5 | 95 | 0 | 1.33 / 14.7 |
| axeBots.SilverSurfer 2.53.33fix | rank37-band2 | 59.8% ± 6.7 | 63.6% ± 9.4 | 56.0% ± 7.3 | 89 / 140 | 10.5% ± 0.9 | 6.8% ± 0.6 | 135 | 0 | 1.40 / 132.1 |
| mn.Combat 3.25.0 | rank38-band2 | 52.9% ± 6.2 | 57.1% ± 9.1 | 48.1% ± 5.2 | 80 / 140 | 10.0% ± 0.5 | 8.6% ± 0.8 | 188 | 0 | 1.73 / 118.7 |
| cs.s2.Seraphim 2.3.1 | rank39-band2 | 56.2% ± 10.8 | 64.3% ± 13.1 | 47.8% ± 9.5 | 90 / 140 | 9.8% ± 1.0 | 7.5% ± 1.6 | 130 | 0 | 1.16 / 11.9 |
| fromHell.CHCl3 1.4.2 | rank40-band2 | 68.3% ± 11.1 | 71.4% ± 15.3 | 64.3% ± 7.1 | 100 / 140 | 13.4% ± 1.6 | 7.0% ± 1.6 | 103 | 0 | 0.94 / 12.5 |
| jk.mini.CunobelinDC 1.2 | rank41-band2 | 98.3% ± 0.6 | 100.0% ± 0.0 | 7.8% ± 6.3 | 140 / 140 | 0.7% ± 1.3 | 1.1% ± 0.1 | 66 | 0 | 0.59 / 15.6 |
| sheldor.mini.Foilist 1.3.1 | rank42-band2 | 63.9% ± 7.1 | 70.0% ± 7.9 | 57.5% ± 10.1 | 98 / 140 | 11.1% ± 1.3 | 8.4% ± 0.7 | 215 | 0 | 1.18 / 148.4 |
| florent.test.Toad 0.14t | rank43-band2 | 62.1% ± 3.7 | 71.4% ± 11.1 | 52.4% ± 4.2 | 100 / 140 | 10.6% ± 0.5 | 7.7% ± 0.6 | 132 | 0 | 1.11 / 142.1 |
| ar.horizon.Horizon 1.2.2 | rank44-band2 | 55.6% ± 6.1 | 58.6% ± 10.8 | 52.1% ± 1.7 | 82 / 140 | 10.8% ± 0.9 | 8.8% ± 0.3 | 166 | 0 | 1.43 / 28.2 |
| cjm.chalk.Chalk 2.6.Be | rank45-band2 | 100.0% ± 0.0 | 100.0% ± 0.0 | 50.0% ± 0.0 | 140 / 140 | 0.0% ± 0.0 | 0.0% ± 0.0 | 51 | 0 | 0.56 / 20.2 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | rank46-band2 | 98.7% ± 1.2 | 100.0% ± 0.0 | 11.6% ± 17.3 | 140 / 140 | 0.3% ± 0.8 | 1.6% ± 0.2 | 50 | 0 | 0.48 / 154.7 |
| sheldor.mini.FoilistMC 1.0 | rank47-band2 | 62.7% ± 9.3 | 70.0% ± 12.0 | 54.5% ± 11.0 | 98 / 140 | 11.0% ± 1.1 | 7.7% ± 0.9 | 170 | 0 | 1.21 / 19.1 |
| pez.rumble.Ali 0.4.9 | rank48-band2 | 77.1% ± 10.4 | 92.1% ± 5.7 | 32.3% ± 9.3 | 129 / 140 | 3.6% ± 2.8 | 3.0% ± 1.5 | 79 | 0 | 1.89 / 18.9 |
| catcat20.Lambda 0.017 | rank49-band2 | 64.8% ± 13.6 | 70.7% ± 17.2 | 58.2% ± 10.0 | 99 / 140 | 10.9% ± 0.8 | 7.7% ± 1.3 | 139 | 0 | 1.70 / 13.7 |
| florent.XSeries.X2 0.17 | rank50-band2 | 59.3% ± 12.3 | 67.9% ± 18.3 | 50.6% ± 9.4 | 95 / 140 | 10.7% ± 0.6 | 7.9% ± 0.8 | 122 | 0 | 2.04 / 29.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 2949 | 51.7% | 32.0% | 0.0% | 16.3% | 1609 |
| jd.Nullstride 2.3.3 | 4 | 2943 | 51.8% | 32.1% | 0.0% | 16.0% | 1574 |
| jk.mega.DrussGT 3.1.16 | 4 | 2276 | 40.6% | 46.1% | 0.0% | 13.3% | 2907 |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 1491 | 36.0% | 51.0% | 0.1% | 12.9% | 645 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 2929 | 47.0% | 37.4% | 0.0% | 15.7% | 1704 |
| voidious.Diamond 1.8.22 | 4 | 2169 | 37.5% | 50.1% | 0.0% | 12.5% | 2616 |
| cb.fire.Firestarter 2.0f | 4 | 2190 | 44.5% | 42.1% | 0.0% | 13.4% | 3026 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 2338 | 35.8% | 51.1% | 0.0% | 13.1% | 1167 |
| xander.cat.XanderCat 12.9 | 4 | 2098 | 39.3% | 47.4% | 0.0% | 13.3% | 1070 |
| lxx.Tomcat 3.68 | 4 | 2621 | 38.1% | 48.1% | 0.1% | 13.7% | 1834 |
| rsalesc.mega.Knight 0.6.28 | 4 | 2206 | 40.8% | 46.0% | 0.0% | 13.1% | 2818 |
| aw.Gilgalad 1.99.5c | 4 | 2551 | 38.2% | 48.0% | 0.0% | 13.8% | 1593 |
| pc.Wavelet 1.5 | 4 | 2481 | 43.8% | 40.7% | 0.3% | 15.2% | 1218 |
| gh.GresSuffurd 0.4.13 | 4 | 2132 | 39.9% | 46.2% | 0.0% | 13.9% | 915 |
| kc.serpent.WaveSerpent 2.11 | 4 | 2023 | 30.9% | 57.6% | 0.0% | 11.5% | 985 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 1670 | 29.9% | 59.3% | 0.0% | 10.7% | 1255 |
| cs.Nene 1.0.5 | 4 | 1974 | 28.5% | 60.7% | 0.0% | 10.8% | 889 |
| jk.melee.Neuromancer 7.12 | 4 | 2625 | 41.4% | 44.1% | 0.0% | 14.4% | 1373 |
| voidious.Dookious 1.573c | 4 | 1960 | 34.4% | 53.1% | 0.0% | 12.4% | 917 |
| davidalves.Phoenix 1.02 | 4 | 21 | 0.0% | 100.0% | 0.0% | 0.0% | 1242 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 1859 | 44.4% | 42.3% | 0.0% | 13.3% | 2299 |
| cb.Domogled 1.2 | 4 | 1795 | 45.3% | 41.8% | 0.0% | 12.9% | 2247 |
| mue.Ascendant 1.2.27 | 4 | 2130 | 32.9% | 54.7% | 0.0% | 12.5% | 805 |
| abc.Shadow 3.83c | 4 | 2464 | 34.5% | 52.5% | 0.0% | 13.0% | 879 |
| darkcanuck.Pris 0.92 | 4 | 2130 | 34.0% | 53.4% | 0.0% | 12.5% | 739 |
| fromHell.BlackBox 0.0.2 | 4 | 1746 | 37.2% | 50.0% | 0.0% | 12.7% | 778 |
| jk.precise.Wintermute 0.8 | 4 | 1831 | 30.7% | 58.0% | 0.0% | 11.2% | 886 |
| kc.serpent.Hydra 0.21 | 4 | - | - | - | - | - | 1384 |
| davidalves.Firebird 0.25 | 4 | 29 | 0.0% | 100.0% | 0.0% | 0.0% | 1314 |
| pulsar.PulsarMax 0.8.9 | 4 | 1967 | 29.2% | 59.9% | 0.0% | 10.9% | 936 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 2168 | 30.6% | 57.7% | 0.0% | 11.7% | 930 |
| ags.Midboss 1q.fast | 4 | 1667 | 33.0% | 55.1% | 0.0% | 11.9% | 741 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 1943 | 41.8% | 44.5% | 0.0% | 13.7% | 1107 |
| Krabb.sliNk.Garm 0.9u | 4 | 1558 | 29.7% | 60.1% | 0.0% | 10.2% | 834 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 1786 | 35.7% | 52.0% | 0.0% | 12.3% | 956 |
| mn.Combat 3.25.0 | 4 | 2059 | 36.4% | 51.3% | 0.1% | 12.2% | 1410 |
| cs.s2.Seraphim 2.3.1 | 4 | 1964 | 31.8% | 56.5% | 0.0% | 11.7% | 844 |
| fromHell.CHCl3 1.4.2 | 4 | 1486 | 33.6% | 54.6% | 0.0% | 11.7% | 763 |
| jk.mini.CunobelinDC 1.2 | 4 | 37 | 0.0% | 100.0% | 0.0% | 0.0% | 1406 |
| sheldor.mini.Foilist 1.3.1 | 4 | 1685 | 31.2% | 57.6% | 0.0% | 11.2% | 1153 |
| florent.test.Toad 0.14t | 4 | 1742 | 28.7% | 60.5% | 0.0% | 10.7% | 900 |
| ar.horizon.Horizon 1.2.2 | 4 | 2006 | 36.1% | 51.3% | 0.1% | 12.5% | 1033 |
| cjm.chalk.Chalk 2.6.Be | 4 | 0 | 0.0% | 0.0% | 100.0% | 0.0% | 1367 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 27 | 0.0% | 100.0% | 0.0% | 0.0% | 1054 |
| sheldor.mini.FoilistMC 1.0 | 4 | 1664 | 31.6% | 57.4% | 0.0% | 11.1% | 1227 |
| pez.rumble.Ali 0.4.9 | 4 | 669 | 20.6% | 71.8% | 0.0% | 7.6% | 1340 |
| catcat20.Lambda 0.017 | 4 | 1637 | 31.3% | 57.7% | 0.0% | 11.0% | 944 |
| florent.XSeries.X2 0.17 | 4 | 1855 | 30.3% | 58.0% | 0.0% | 11.7% | 899 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 4 | 0 | 0 | 1.28 | 0 | 0 | 0 |
| jd.Nullstride 2.3.3 | 4 | 1 | 0 | 0 | 1.24 | 4 | 3 | 0 |
| jk.mega.DrussGT 3.1.16 | 4 | 0 | 0 | 0 | 2.10 | 1 | 1 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 4 | 0 | 0 | 0.52 | 0 | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 3 | 0 | 0 | 1.80 | 0 | 0 | 0 |
| voidious.Diamond 1.8.22 | 4 | 1 | 0 | 0 | 1.73 | 3 | 3 | 0 |
| cb.fire.Firestarter 2.0f | 4 | 4 | 0 | 0 | 1.61 | 0 | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 1 | 0 | 0 | 1.20 | 3 | 3 | 0 |
| xander.cat.XanderCat 12.9 | 4 | 2 | 0 | 0 | 1.05 | 2 | 2 | 0 |
| lxx.Tomcat 3.68 | 4 | 3 | 0 | 0 | 1.72 | 0 | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 4 | 2 | 0 | 0 | 2.06 | 0 | 0 | 0 |
| aw.Gilgalad 1.99.5c | 4 | 3 | 0 | 0 | 1.68 | 1 | 1 | 0 |
| pc.Wavelet 1.5 | 4 | 1 | 0 | 0 | 0.86 | 3 | 3 | 0 |
| gh.GresSuffurd 0.4.13 | 4 | 3 | 0 | 0 | 1.01 | 1 | 1 | 0 |
| kc.serpent.WaveSerpent 2.11 | 4 | 3 | 0 | 0 | 0.68 | 1 | 1 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 3 | 0 | 0 | 1.01 | 1 | 1 | 0 |
| cs.Nene 1.0.5 | 4 | 4 | 0 | 0 | 0.76 | 0 | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 4 | 4 | 0 | 0 | 1.58 | 0 | 0 | 0 |
| voidious.Dookious 1.573c | 4 | 4 | 0 | 0 | 0.80 | 0 | 0 | 0 |
| davidalves.Phoenix 1.02 | 4 | 4 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 3 | 0 | 0 | 1.64 | 1 | 1 | 0 |
| cb.Domogled 1.2 | 4 | 4 | 0 | 0 | 1.59 | 0 | 0 | 0 |
| mue.Ascendant 1.2.27 | 4 | 2 | 0 | 0 | 0.68 | 2 | 2 | 0 |
| abc.Shadow 3.83c | 4 | 1 | 0 | 0 | 0.87 | 3 | 3 | 0 |
| darkcanuck.Pris 0.92 | 4 | 2 | 0 | 0 | 0.44 | 2 | 2 | 0 |
| fromHell.BlackBox 0.0.2 | 4 | 3 | 0 | 0 | 0.73 | 1 | 1 | 0 |
| jk.precise.Wintermute 0.8 | 4 | 3 | 0 | 0 | 0.90 | 1 | 1 | 0 |
| kc.serpent.Hydra 0.21 | 4 | 4 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| davidalves.Firebird 0.25 | 4 | 4 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 4 | 3 | 0 | 0 | 0.94 | 1 | 1 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 1 | 0 | 1 | 1.24 | 4 | 3 | 0 |
| ags.Midboss 1q.fast | 4 | 2 | 0 | 0 | 1.01 | 2 | 2 | 0 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 3 | 0 | 0 | 1.32 | 1 | 1 | 0 |
| Krabb.sliNk.Garm 0.9u | 4 | 1 | 0 | 0 | 0.68 | 3 | 3 | 0 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 2 | 0 | 0 | 0.96 | 2 | 2 | 0 |
| mn.Combat 3.25.0 | 4 | 4 | 0 | 0 | 1.34 | 0 | 0 | 0 |
| cs.s2.Seraphim 2.3.1 | 4 | 4 | 0 | 0 | 0.93 | 0 | 0 | 0 |
| fromHell.CHCl3 1.4.2 | 4 | 2 | 0 | 1 | 0.74 | 2 | 2 | 0 |
| jk.mini.CunobelinDC 1.2 | 4 | 4 | 0 | 0 | 0.47 | 0 | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 4 | 3 | 0 | 0 | 1.54 | 1 | 1 | 0 |
| florent.test.Toad 0.14t | 4 | 3 | 0 | 0 | 0.94 | 1 | 1 | 0 |
| ar.horizon.Horizon 1.2.2 | 4 | 2 | 0 | 0 | 1.19 | 2 | 2 | 0 |
| cjm.chalk.Chalk 2.6.Be | 4 | 4 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 4 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 4 | 2 | 0 | 0 | 1.21 | 2 | 2 | 0 |
| pez.rumble.Ali 0.4.9 | 4 | 4 | 0 | 0 | 0.56 | 0 | 0 | 0 |
| catcat20.Lambda 0.017 | 4 | 3 | 0 | 0 | 0.99 | 1 | 1 | 0 |
| florent.XSeries.X2 0.17 | 4 | 4 | 0 | 0 | 0.87 | 0 | 0 | 0 |

135 of 192 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 16681 | 234 | 16742 | 16669 (99.9%) | 12 (0.1%) | 73 (0.4%) | 1397 | 123 | 202 |
| jd.Nullstride 2.3.3 | 15874 | 220 | 15904 | 15852 (99.9%) | 22 (0.1%) | 52 (0.3%) | 1074 | 132 | 177 |
| jk.mega.DrussGT 3.1.16 | 33125 | 7 | 33126 | 33125 (100.0%) | 0 (0.0%) | 1 (0.0%) | 2105 | 245 | 266 |
| oog.mega.saguaro.Saguaro 1.0 | 4435 | 6 | 4436 | 4432 (99.9%) | 3 (0.1%) | 4 (0.1%) | 183 | 64 | 29 |
| aaa.r.ScalarR 0.005h.053-noshield | 17571 | 13 | 17604 | 17565 (100.0%) | 6 (0.0%) | 39 (0.2%) | 1280 | 189 | 267 |
| voidious.Diamond 1.8.22 | 29265 | 667 | 29321 | 29253 (100.0%) | 12 (0.0%) | 68 (0.2%) | 2466 | 193 | 232 |
| cb.fire.Firestarter 2.0f | 30007 | 843 | 30347 | 29992 (100.0%) | 15 (0.0%) | 355 (1.2%) | 6172 | 245 | 224 |
| dsekercioglu.mega.Raven 3.56j8 | 10694 | 44 | 10695 | 10692 (100.0%) | 2 (0.0%) | 3 (0.0%) | 784 | 136 | 154 |
| xander.cat.XanderCat 12.9 | 7979 | 9 | 8008 | 7977 (100.0%) | 2 (0.0%) | 31 (0.4%) | 962 | 92 | 139 |
| lxx.Tomcat 3.68 | 19420 | 696 | 19349 | 19337 (99.6%) | 83 (0.4%) | 12 (0.1%) | 1580 | 147 | 234 |
| rsalesc.mega.Knight 0.6.28 | 31778 | 362 | 31770 | 31766 (100.0%) | 12 (0.0%) | 4 (0.0%) | 2609 | 301 | 251 |
| aw.Gilgalad 1.99.5c | 16345 | 9 | 16367 | 16344 (100.0%) | 1 (0.0%) | 23 (0.1%) | 1388 | 149 | 205 |
| pc.Wavelet 1.5 | 9748 | 6 | 9753 | 9748 (100.0%) | 0 (0.0%) | 5 (0.1%) | 760 | 97 | 106 |
| gh.GresSuffurd 0.4.13 | 7811 | 9 | 7812 | 7811 (100.0%) | 0 (0.0%) | 1 (0.0%) | 452 | 61 | 112 |
| kc.serpent.WaveSerpent 2.11 | 7064 | 9 | 7064 | 7064 (100.0%) | 0 (0.0%) | 0 (0.0%) | 484 | 41 | 65 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 10621 | 2 | 10618 | 10616 (100.0%) | 5 (0.0%) | 2 (0.0%) | 923 | 82 | 167 |
| cs.Nene 1.0.5 | 7259 | 62 | 7258 | 7257 (100.0%) | 2 (0.0%) | 1 (0.0%) | 417 | 51 | 80 |
| jk.melee.Neuromancer 7.12 | 13024 | 7 | 13022 | 13018 (100.0%) | 6 (0.0%) | 4 (0.0%) | 961 | 139 | 266 |
| voidious.Dookious 1.573c | 6749 | 15 | 6749 | 6748 (100.0%) | 1 (0.0%) | 1 (0.0%) | 391 | 53 | 74 |
| davidalves.Phoenix 1.02 | 5785 | 0 | 5789 | 5785 (100.0%) | 0 (0.0%) | 4 (0.1%) | 2484 | 1 | 24 |
| rsalesc.roborio.Roborio 1.2.4 | 22462 | 4 | 22467 | 22460 (100.0%) | 2 (0.0%) | 7 (0.0%) | 2203 | 198 | 198 |
| cb.Domogled 1.2 | 18766 | 9 | 19426 | 18763 (100.0%) | 3 (0.0%) | 663 (3.4%) | 8091 | 133 | 220 |
| mue.Ascendant 1.2.27 | 6132 | 9 | 6132 | 6130 (100.0%) | 2 (0.0%) | 2 (0.0%) | 323 | 62 | 72 |
| abc.Shadow 3.83c | 7184 | 653 | 7084 | 7083 (98.6%) | 101 (1.4%) | 1 (0.0%) | 418 | 60 | 93 |
| darkcanuck.Pris 0.92 | 5281 | 28 | 5278 | 5278 (99.9%) | 3 (0.1%) | 0 (0.0%) | 192 | 65 | 39 |
| fromHell.BlackBox 0.0.2 | 6241 | 17 | 6241 | 6240 (100.0%) | 1 (0.0%) | 1 (0.0%) | 569 | 63 | 69 |
| jk.precise.Wintermute 0.8 | 7441 | 9 | 7441 | 7441 (100.0%) | 0 (0.0%) | 0 (0.0%) | 406 | 71 | 90 |
| kc.serpent.Hydra 0.21 | 9028 | 1 | 9029 | 9026 (100.0%) | 2 (0.0%) | 3 (0.0%) | 38 | 0 | 22 |
| davidalves.Firebird 0.25 | 7026 | 0 | 7026 | 7026 (100.0%) | 0 (0.0%) | 0 (0.0%) | 1360 | 0 | 16 |
| pulsar.PulsarMax 0.8.9 | 7460 | 10 | 7461 | 7459 (100.0%) | 1 (0.0%) | 2 (0.0%) | 461 | 42 | 103 |
| zyx.mega.YersiniaPestis 3.0 | 6786 | 448 | 6766 | 6766 (99.7%) | 20 (0.3%) | 0 (0.0%) | 544 | 60 | 131 |
| ags.Midboss 1q.fast | 5779 | 25 | 5779 | 5777 (100.0%) | 2 (0.0%) | 2 (0.0%) | 153 | 64 | 111 |
| pez.rumble.CassiusClay 2rho.02no | 9345 | 8 | 9358 | 9343 (100.0%) | 2 (0.0%) | 15 (0.2%) | 769 | 77 | 146 |
| Krabb.sliNk.Garm 0.9u | 6487 | 8 | 6487 | 6484 (100.0%) | 3 (0.0%) | 3 (0.0%) | 392 | 64 | 73 |
| axeBots.SilverSurfer 2.53.33fix | 5554 | 9 | 5713 | 5553 (100.0%) | 1 (0.0%) | 160 (2.8%) | 1677 | 43 | 96 |
| mn.Combat 3.25.0 | 13974 | 14 | 13976 | 13974 (100.0%) | 0 (0.0%) | 2 (0.0%) | 1110 | 112 | 153 |
| cs.s2.Seraphim 2.3.1 | 6551 | 8 | 6551 | 6551 (100.0%) | 0 (0.0%) | 0 (0.0%) | 369 | 49 | 78 |
| fromHell.CHCl3 1.4.2 | 5356 | 7 | 5357 | 5356 (100.0%) | 0 (0.0%) | 1 (0.0%) | 350 | 40 | 37 |
| jk.mini.CunobelinDC 1.2 | 13566 | 147 | 13566 | 13565 (100.0%) | 1 (0.0%) | 1 (0.0%) | 21 | 2 | 24 |
| sheldor.mini.Foilist 1.3.1 | 11000 | 8 | 11003 | 11000 (100.0%) | 0 (0.0%) | 3 (0.0%) | 752 | 93 | 172 |
| florent.test.Toad 0.14t | 6495 | 5 | 6491 | 6491 (99.9%) | 4 (0.1%) | 0 (0.0%) | 440 | 67 | 136 |
| ar.horizon.Horizon 1.2.2 | 8851 | 7 | 8853 | 8851 (100.0%) | 0 (0.0%) | 2 (0.0%) | 591 | 74 | 118 |
| cjm.chalk.Chalk 2.6.Be | 7975 | 0 | 7975 | 7975 (100.0%) | 0 (0.0%) | 0 (0.0%) | 145 | 0 | 19 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 8802 | 204 | 8802 | 8802 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 0 | 22 |
| sheldor.mini.FoilistMC 1.0 | 12105 | 11 | 12105 | 12102 (100.0%) | 3 (0.0%) | 3 (0.0%) | 864 | 89 | 173 |
| pez.rumble.Ali 0.4.9 | 8185 | 57 | 8187 | 8178 (99.9%) | 7 (0.1%) | 9 (0.1%) | 2068 | 25 | 57 |
| catcat20.Lambda 0.017 | 7852 | 237 | 7834 | 7832 (99.7%) | 20 (0.3%) | 2 (0.0%) | 468 | 63 | 108 |
| florent.XSeries.X2 0.17 | 6305 | 5 | 6305 | 6304 (100.0%) | 1 (0.0%) | 1 (0.0%) | 500 | 43 | 92 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 16592 | 1700 (10.2%) | 15870 |
| jd.Nullstride 2.3.3 | 15764 | 1661 (10.5%) | 15021 |
| jk.mega.DrussGT 3.1.16 | 32724 | 4178 (12.8%) | 32003 |
| oog.mega.saguaro.Saguaro 1.0 | 4620 | 331 (7.2%) | 4601 |
| aaa.r.ScalarR 0.005h.053-noshield | 17630 | 1950 (11.1%) | 16951 |
| voidious.Diamond 1.8.22 | 28957 | 3070 (10.6%) | 27979 |
| cb.fire.Firestarter 2.0f | 34615 | 3172 (9.2%) | 33031 |
| dsekercioglu.mega.Raven 3.56j8 | 11130 | 1092 (9.8%) | 10710 |
| xander.cat.XanderCat 12.9 | 9482 | 754 (8.0%) | 8197 |
| lxx.Tomcat 3.68 | 19586 | 2215 (11.3%) | 19048 |
| rsalesc.mega.Knight 0.6.28 | 32037 | 3603 (11.2%) | 30945 |
| aw.Gilgalad 1.99.5c | 16486 | 1692 (10.3%) | 15367 |
| pc.Wavelet 1.5 | 11272 | 1009 (9.0%) | 9901 |
| gh.GresSuffurd 0.4.13 | 7703 | 777 (10.1%) | 6851 |
| kc.serpent.WaveSerpent 2.11 | 9012 | 660 (7.3%) | 4799 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 12242 | 1155 (9.4%) | 10525 |
| cs.Nene 1.0.5 | 7893 | 727 (9.2%) | 6800 |
| jk.melee.Neuromancer 7.12 | 13698 | 1350 (9.9%) | 13331 |
| voidious.Dookious 1.573c | 8072 | 633 (7.8%) | 6891 |
| davidalves.Phoenix 1.02 | 116 | 5772 (4975.9%) | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 24665 | 2303 (9.3%) | 24638 |
| cb.Domogled 1.2 | 24533 | 2023 (8.2%) | 23269 |
| mue.Ascendant 1.2.27 | 6540 | 526 (8.0%) | 5079 |
| abc.Shadow 3.83c | 7553 | 640 (8.5%) | 6304 |
| darkcanuck.Pris 0.92 | 5639 | 424 (7.5%) | 3094 |
| fromHell.BlackBox 0.0.2 | 5881 | 589 (10.0%) | 5404 |
| jk.precise.Wintermute 0.8 | 7601 | 803 (10.6%) | 5965 |
| kc.serpent.Hydra 0.21 | 142 | 9029 (6358.5%) | 0 |
| davidalves.Firebird 0.25 | 141 | 7016 (4975.9%) | 0 |
| pulsar.PulsarMax 0.8.9 | 8512 | 756 (8.9%) | 7705 |
| zyx.mega.YersiniaPestis 3.0 | 8202 | 617 (7.5%) | 7328 |
| ags.Midboss 1q.fast | 5508 | 472 (8.6%) | 4977 |
| pez.rumble.CassiusClay 2rho.02no | 9991 | 921 (9.2%) | 8916 |
| Krabb.sliNk.Garm 0.9u | 6792 | 564 (8.3%) | 5238 |
| axeBots.SilverSurfer 2.53.33fix | 8388 | 508 (6.1%) | 7081 |
| mn.Combat 3.25.0 | 14370 | 1404 (9.8%) | 13999 |
| cs.s2.Seraphim 2.3.1 | 7169 | 565 (7.9%) | 6720 |
| fromHell.CHCl3 1.4.2 | 5666 | 493 (8.7%) | 4304 |
| jk.mini.CunobelinDC 1.2 | 360 | 13431 (3730.8%) | 0 |
| sheldor.mini.Foilist 1.3.1 | 10973 | 942 (8.6%) | 10354 |
| florent.test.Toad 0.14t | 7802 | 602 (7.7%) | 5662 |
| ar.horizon.Horizon 1.2.2 | 9197 | 848 (9.2%) | 8026 |
| cjm.chalk.Chalk 2.6.Be | 141 | 7975 (5656.0%) | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 330 | 8786 (2662.4%) | 0 |
| sheldor.mini.FoilistMC 1.0 | 11925 | 1194 (10.0%) | 11365 |
| pez.rumble.Ali 0.4.9 | 4418 | 5630 (127.4%) | 2957 |
| catcat20.Lambda 0.017 | 8190 | 684 (8.4%) | 5919 |
| florent.XSeries.X2 0.17 | 7852 | 570 (7.3%) | 7505 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 534 | 650 | 1459 | 21.1 / 27.0 | 0 | 314 | 17 |
| jd.Nullstride 2.3.3 | 650 | 533 | 650 | 1434 | 20.5 / 27.0 | 0 | 761 | 1 |
| jk.mega.DrussGT 3.1.16 | 650 | 511 | 650 | 2745 | 27.8 / 29.9 | 2 | 3090 | 292 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 472 | 588 | 495 | 43.2 / 21.7 | 306 | 1404 | 385 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 480 | 650 | 1554 | 25.4 / 31.3 | 0 | 1008 | 2 |
| voidious.Diamond 1.8.22 | 650 | 533 | 650 | 2462 | 22.3 / 31.0 | 56 | 8202 | 152 |
| cb.fire.Firestarter 2.0f | 650 | 541 | 650 | 2876 | 32.5 / 26.3 | 140 | 3108 | 116 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 450 | 650 | 1025 | 26.2 / 34.1 | 105 | 10351 | 780 |
| xander.cat.XanderCat 12.9 | 650 | 456 | 650 | 921 | 34.9 / 28.4 | 177 | 1762 | 50 |
| lxx.Tomcat 3.68 | 650 | 505 | 650 | 1684 | 26.7 / 36.0 | 62 | 11854 | 6 |
| rsalesc.mega.Knight 0.6.28 | 650 | 508 | 650 | 2668 | 31.9 / 29.0 | 298 | 7588 | 60 |
| aw.Gilgalad 1.99.5c | 650 | 484 | 650 | 1444 | 24.7 / 35.0 | 163 | 10217 | 62 |
| pc.Wavelet 1.5 | 650 | 434 | 650 | 1067 | 30.6 / 28.8 | 78 | 1983 | 3 |
| gh.GresSuffurd 0.4.13 | 650 | 461 | 650 | 764 | 32.7 / 28.1 | 258 | 3679 | 0 |
| kc.serpent.WaveSerpent 2.11 | 650 | 481 | 650 | 836 | 25.0 / 33.3 | 60 | 5461 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 464 | 650 | 1100 | 29.5 / 28.3 | 179 | 9947 | 146 |
| cs.Nene 1.0.5 | 650 | 473 | 650 | 739 | 25.6 / 34.2 | 75 | 4951 | 1175 |
| jk.melee.Neuromancer 7.12 | 650 | 529 | 650 | 1223 | 29.3 / 33.1 | 67 | 4680 | 4 |
| voidious.Dookious 1.573c | 650 | 484 | 650 | 767 | 26.4 / 29.7 | 45 | 4307 | 1896 |
| davidalves.Phoenix 1.02 | 650 | 397 | 650 | 1092 | 0.0 / 0.6 | 0 | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 650 | 500 | 650 | 2129 | 42.2 / 22.5 | 485 | 5097 | 38 |
| cb.Domogled 1.2 | 650 | 548 | 644 | 2097 | 39.6 / 21.5 | 273 | 1488 | 45 |
| mue.Ascendant 1.2.27 | 650 | 412 | 650 | 655 | 29.5 / 33.3 | 41 | 2263 | 0 |
| abc.Shadow 3.83c | 650 | 453 | 650 | 733 | 26.1 / 37.0 | 125 | 3296 | 78 |
| darkcanuck.Pris 0.92 | 650 | 399 | 650 | 591 | 35.2 / 32.5 | 187 | 1501 | 595 |
| fromHell.BlackBox 0.0.2 | 650 | 413 | 425 | 628 | 37.5 / 25.0 | 1273 | 904 | 0 |
| jk.precise.Wintermute 0.8 | 650 | 449 | 650 | 735 | 32.3 / 30.4 | 87 | 6075 | 74 |
| kc.serpent.Hydra 0.21 | 650 | 349 | 650 | 1234 | 0.0 / 0.0 | 0 | 0 | 0 |
| davidalves.Firebird 0.25 | 650 | 403 | 650 | 1164 | 0.0 / 0.8 | 0 | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 650 | 484 | 650 | 787 | 23.4 / 33.7 | 13 | 5776 | 1 |
| zyx.mega.YersiniaPestis 3.0 | 650 | 445 | 650 | 790 | 26.3 / 35.8 | 131 | 2482 | 74 |
| ags.Midboss 1q.fast | 650 | 410 | 650 | 592 | 43.0 / 26.3 | 122 | 1875 | 181 |
| pez.rumble.CassiusClay 2rho.02no | 650 | 477 | 650 | 960 | 39.9 / 24.7 | 198 | 1656 | 84 |
| Krabb.sliNk.Garm 0.9u | 650 | 508 | 463 | 685 | 37.2 / 26.8 | 298 | 2648 | 1671 |
| axeBots.SilverSurfer 2.53.33fix | 650 | 476 | 613 | 809 | 34.0 / 26.5 | 107 | 1563 | 31 |
| mn.Combat 3.25.0 | 650 | 488 | 650 | 1260 | 28.0 / 30.2 | 227 | 10102 | 31 |
| cs.s2.Seraphim 2.3.1 | 650 | 477 | 588 | 694 | 29.0 / 31.7 | 251 | 3115 | 468 |
| fromHell.CHCl3 1.4.2 | 650 | 422 | 463 | 616 | 41.9 / 23.2 | 893 | 1162 | 0 |
| jk.mini.CunobelinDC 1.2 | 650 | 519 | 650 | 1256 | 0.1 / 1.0 | 0 | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 650 | 567 | 650 | 1003 | 37.4 / 27.7 | 297 | 6758 | 14 |
| florent.test.Toad 0.14t | 650 | 486 | 650 | 748 | 33.2 / 30.1 | 91 | 3444 | 13 |
| ar.horizon.Horizon 1.2.2 | 650 | 479 | 650 | 886 | 32.0 / 29.4 | 171 | 3706 | 23 |
| cjm.chalk.Chalk 2.6.Be | 650 | 413 | 650 | 1217 | 0.0 / 0.0 | 0 | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 650 | 357 | 650 | 904 | 0.1 / 0.8 | 0 | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 650 | 571 | 525 | 1079 | 32.9 / 27.3 | 155 | 8063 | 987 |
| pez.rumble.Ali 0.4.9 | 650 | 404 | 650 | 1190 | 6.8 / 13.7 | 6 | 3182 | 15 |
| catcat20.Lambda 0.017 | 650 | 535 | 631 | 794 | 37.6 / 27.0 | 178 | 2845 | 0 |
| florent.XSeries.X2 0.17 | 650 | 488 | 650 | 749 | 31.8 / 30.7 | 198 | 3885 | 2 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 9.0% | 179 | 67 | 3 | 119.1 | 1693 / 1700 (100%) | 0 | 0 |
| jd.Nullstride 2.3.3 | 8.9% | 174 | 71 | 3 | 110.3 | 1657 / 1661 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.4% | 294 | 84 | 3 | 232.8 | 4173 / 4178 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.4% | 73 | 24 | 3 | 31.7 | 331 / 331 (100%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.5% | 252 | 95 | 3 | 125.3 | 1948 / 1950 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 8.9% | 242 | 82 | 3 | 203.8 | 3064 / 3070 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 9.8% | 226 | 109 | 3 | 215.7 | 3163 / 3172 (100%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 9.2% | 168 | 53 | 3 | 74.7 | 1090 / 1092 (100%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 8.7% | 147 | 42 | 3 | 56.0 | 752 / 754 (100%) | 0 | 0 |
| lxx.Tomcat 3.68 | 10.4% | 241 | 75 | 3 | 138.0 | 2211 / 2215 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 10.1% | 288 | 76 | 3 | 225.9 | 3597 / 3603 (100%) | 0 | 0 |
| aw.Gilgalad 1.99.5c | 10.1% | 235 | 56 | 3 | 115.3 | 1686 / 1692 (100%) | 0 | 0 |
| pc.Wavelet 1.5 | 9.1% | 121 | 60 | 3 | 68.0 | 1009 / 1009 (100%) | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 8.4% | 142 | 43 | 3 | 54.6 | 775 / 777 (100%) | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 8.1% | 95 | 51 | 3 | 49.9 | 660 / 660 (100%) | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 8.0% | 142 | 57 | 3 | 74.7 | 1151 / 1155 (100%) | 0 | 0 |
| cs.Nene 1.0.5 | 8.1% | 106 | 41 | 3 | 51.5 | 723 / 727 (99%) | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 9.9% | 221 | 50 | 3 | 92.4 | 1347 / 1350 (100%) | 0 | 0 |
| voidious.Dookious 1.573c | 7.6% | 112 | 390 | 3 | 47.8 | 632 / 633 (100%) | 0 | 0 |
| davidalves.Phoenix 1.02 | 0.1% | 51 | 9 | 3 | 0.0 | 0 / 5772 (0%) | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 9.4% | 230 | 81 | 3 | 156.4 | 2297 / 2303 (100%) | 0 | 0 |
| cb.Domogled 1.2 | 8.2% | 222 | 81 | 3 | 137.7 | 2007 / 2023 (99%) | 0 | 0 |
| mue.Ascendant 1.2.27 | 7.9% | 95 | 33 | 3 | 42.8 | 526 / 526 (100%) | 0 | 0 |
| abc.Shadow 3.83c | 9.0% | 122 | 41 | 3 | 49.7 | 640 / 640 (100%) | 0 | 0 |
| darkcanuck.Pris 0.92 | 8.8% | 62 | 353 | 3 | 37.1 | 422 / 424 (100%) | 0 | 0 |
| fromHell.BlackBox 0.0.2 | 7.7% | 102 | 31 | 3 | 43.9 | 588 / 589 (100%) | 0 | 0 |
| jk.precise.Wintermute 0.8 | 8.4% | 126 | 42 | 3 | 52.6 | 802 / 803 (100%) | 0 | 0 |
| kc.serpent.Hydra 0.21 | 0.0% | 55 | 9 | 3 | 0.0 | 0 / 9029 (0%) | 0 | 0 |
| davidalves.Firebird 0.25 | 0.2% | 53 | 9 | 3 | 0.0 | 0 / 7016 (0%) | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 7.7% | 131 | 40 | 3 | 52.9 | 756 / 756 (100%) | 0 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 8.5% | 173 | 27 | 3 | 47.3 | 616 / 617 (100%) | 0 | 0 |
| ags.Midboss 1q.fast | 8.6% | 141 | 155 | 3 | 40.6 | 471 / 472 (100%) | 0 | 0 |
| pez.rumble.CassiusClay 2rho.02no | 8.8% | 185 | 50 | 3 | 65.8 | 919 / 921 (100%) | 0 | 0 |
| Krabb.sliNk.Garm 0.9u | 7.3% | 95 | 37 | 3 | 45.3 | 564 / 564 (100%) | 0 | 0 |
| axeBots.SilverSurfer 2.53.33fix | 6.8% | 135 | 62 | 3 | 40.1 | 508 / 508 (100%) | 0 | 0 |
| mn.Combat 3.25.0 | 8.6% | 188 | 65 | 3 | 99.6 | 1402 / 1404 (100%) | 0 | 0 |
| cs.s2.Seraphim 2.3.1 | 7.5% | 130 | 36 | 3 | 46.4 | 565 / 565 (100%) | 0 | 0 |
| fromHell.CHCl3 1.4.2 | 7.0% | 103 | 30 | 3 | 37.5 | 493 / 493 (100%) | 0 | 0 |
| jk.mini.CunobelinDC 1.2 | 1.1% | 66 | 15 | 3 | 0.0 | 0 / 13431 (0%) | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 8.4% | 215 | 43 | 3 | 77.9 | 936 / 942 (99%) | 0 | 0 |
| florent.test.Toad 0.14t | 7.7% | 132 | 42 | 3 | 45.9 | 601 / 602 (100%) | 0 | 0 |
| ar.horizon.Horizon 1.2.2 | 8.8% | 166 | 49 | 3 | 61.6 | 847 / 848 (100%) | 0 | 0 |
| cjm.chalk.Chalk 2.6.Be | 0.0% | 51 | 8 | 3 | 0.0 | 0 / 7975 (0%) | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 1.6% | 50 | 9 | 3 | 0.0 | 0 / 8786 (0%) | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 7.7% | 170 | 52 | 3 | 85.4 | 1191 / 1194 (100%) | 0 | 0 |
| pez.rumble.Ali 0.4.9 | 3.0% | 79 | 21 | 3 | 19.0 | 238 / 5630 (4%) | 0 | 0 |
| catcat20.Lambda 0.017 | 7.7% | 139 | 63 | 3 | 55.4 | 683 / 684 (100%) | 0 | 0 |
| florent.XSeries.X2 0.17 | 7.9% | 122 | 48 | 3 | 44.8 | 569 / 570 (100%) | 0 | 0 |

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
| kc.mega.BeepBoop 2.0 | kc.mega.BeepBoop | 1 | 35 | 296 | 9.5% | 8.0% ± 0.9 | 5.7% | 20.8% / 20.2% | 0.2% | 0 / 0 | T3/M1 | 29% |
| jd.Nullstride 2.3.3 | jd.Nullstride | 1 | 35 | 288 | 10.3% | 8.5% ± 1.2 | 6.2% | 20.9% / 20.7% | 0.1% | 0 / 0 | T3/M1 | 24% |
| jk.mega.DrussGT 3.1.16 | jk.mega.DrussGT | 1 | 35 | 298 | 11.2% | 9.2% ± 1.0 | 8.2% | 23.7% / 20.9% | 1.7% | 0 / 0 | T3/M1 | 51% |
| oog.mega.saguaro.Saguaro 1.0 | oog.mega.saguaro.Saguaro | 1 | 35 | 328 | 8.2% | 7.0% ± 1.5 | 10.6% | 27.4% / 26.9% | 10.6% | 0 / 0 | T3/M0 | 58% |
| aaa.r.ScalarR 0.005h.053-noshield | aaa.r.ScalarR | 1 | 35 | 316 | 11.7% | 9.1% ± 1.0 | 8.1% | 23.8% / 21.5% | 0.0% | 0 / 0 | T3/M1 | 35% |
| voidious.Diamond 1.8.22 | voidious.Diamond | 1 | 35 | 302 | 9.9% | 8.0% ± 1.1 | 6.5% | 22.1% / 21.6% | 8.8% | 0 / 0 | T3/M1 | 41% |
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 1 | 35 | 310 | 9.4% | 7.9% ± 0.8 | 9.5% | 20.5% / 21.3% | 3.2% | 0 / 0 | T3/M1 | 52% |
| dsekercioglu.mega.Raven 3.56j8 | dsekercioglu.mega.Raven | 1 | 35 | 330 | 10.2% | 7.9% ± 1.2 | 10.6% | 21.8% / 21.3% | 11.2% | 0 / 0 | T3/M1 | 43% |
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 1 | 35 | 314 | 9.3% | 7.4% ± 1.2 | 10.9% | 23.2% / 23.4% | 9.2% | 0 / 0 | T3/M1 | 53% |
| lxx.Tomcat 3.68 | lxx.Tomcat | 1 | 35 | 274 | 11.2% | 9.0% ± 1.1 | 10.4% | 23.2% / 21.3% | 9.1% | 0 / 0 | T3/M1 | 47% |
| rsalesc.mega.Knight 0.6.28 | rsalesc.mega.Knight | 1 | 35 | 314 | 10.5% | 8.3% ± 1.1 | 10.6% | 24.2% / 21.1% | 12.2% | 0 / 0 | T3/M1 | 49% |
| aw.Gilgalad 1.99.5c | aw.Gilgalad | 1 | 35 | 284 | 10.5% | 8.4% ± 1.0 | 9.6% | 21.4% / 22.0% | 4.4% | 0 / 0 | T3/M1 | 42% |
| pc.Wavelet 1.5 | pc.Wavelet | 1 | 35 | 272 | 10.5% | 7.9% ± 1.1 | 9.2% | 21.5% / 21.7% | 10.1% | 0 / 0 | T3/M1 | 43% |
| gh.GresSuffurd 0.4.13 | gh.GresSuffurd | 1 | 35 | 294 | 10.0% | 7.7% ± 1.2 | 10.5% | 23.3% / 21.8% | 13.1% | 0 / 0 | T3/M1 | 44% |
| kc.serpent.WaveSerpent 2.11 | kc.serpent.WaveSerpent | 1 | 35 | 322 | 9.3% | 8.3% ± 1.4 | 9.5% | 22.3% / 22.5% | 12.6% | 0 / 0 | T3/M1 | 53% |
| dsekercioglu.mega.WhiteFang 2.8.1 | dsekercioglu.mega.WhiteFang | 1 | 35 | 344 | 8.6% | 7.1% ± 1.0 | 11.0% | 22.4% / 22.1% | 14.0% | 0 / 0 | T3/M1 | 65% |
| cs.Nene 1.0.5 | cs.Nene | 1 | 35 | 264 | 8.7% | 8.0% ± 1.3 | 9.8% | 24.3% / 22.5% | 8.2% | 0 / 0 | T3/M1 | 56% |
| jk.melee.Neuromancer 7.12 | jk.melee.Neuromancer | 1 | 35 | 314 | 11.4% | 10.0% ± 1.3 | 9.8% | 24.9% / 23.0% | 0.0% | 0 / 0 | T3/M1 | 37% |
| voidious.Dookious 1.573c | voidious.Dookious | 1 | 35 | 306 | 8.5% | 7.6% ± 1.4 | 9.3% | 22.1% / 22.8% | 11.3% | 0 / 0 | T3/M1 | 53% |
| davidalves.Phoenix 1.02 | davidalves.Phoenix | 1 | 35 | 306 | 0.1% | 66.9% ± 36.7 | 0.0% | - / - | 3.1% | 0 / 0 | T?/M? | 99% |
| rsalesc.roborio.Roborio 1.2.4 | rsalesc.roborio.Roborio | 1 | 35 | 328 | 9.9% | 7.7% ± 0.9 | 11.0% | 23.0% / 21.1% | 12.7% | 0 / 0 | T3/M1 | 63% |
| cb.Domogled 1.2 | cb.Domogled | 1 | 35 | 276 | 8.6% | 7.3% ± 1.1 | 11.6% | 22.9% / 22.3% | 2.7% | 0 / 0 | T3/M1 | 63% |
| mue.Ascendant 1.2.27 | mue.Ascendant | 1 | 35 | 290 | 8.7% | 6.5% ± 1.3 | 10.1% | 23.2% / 25.2% | 4.9% | 0 / 0 | T2/M1 | 57% |
| abc.Shadow 3.83c | abc.Shadow | 1 | 35 | 276 | 9.8% | 8.4% ± 1.4 | 8.1% | 20.8% / 21.7% | 7.7% | 0 / 0 | T3/M1 | 41% |
| darkcanuck.Pris 0.92 | darkcanuck.Pris | 1 | 35 | 294 | 9.5% | 7.1% ± 1.5 | 11.1% | 28.0% / 23.7% | 10.5% | 0 / 0 | T3/M0 | 63% |
| fromHell.BlackBox 0.0.2 | fromHell.BlackBox | 1 | 35 | 304 | 9.2% | 6.9% ± 1.3 | 15.4% | 28.2% / 27.1% | 3.0% | 0 / 0 | T2/M0 | 68% |
| jk.precise.Wintermute 0.8 | jk.precise.Wintermute | 1 | 35 | 316 | 8.1% | 6.9% ± 1.4 | 10.1% | 24.9% / 23.5% | 9.3% | 0 / 0 | T2/M1 | 62% |
| kc.serpent.Hydra 0.21 | kc.serpent.Hydra | 1 | 35 | 298 | 0.0% | 0.0% ± 42.9 | 0.2% | - / - | 0.9% | 0 / 0 | T?/M? | 100% |
| davidalves.Firebird 0.25 | davidalves.Firebird | 1 | 35 | 310 | 0.0% | - | 0.0% | - / - | 3.0% | 0 / 0 | T?/M? | 100% |
| pulsar.PulsarMax 0.8.9 | pulsar.PulsarMax | 1 | 35 | 300 | 9.0% | 8.6% ± 1.4 | 9.4% | 20.8% / 22.0% | 3.3% | 0 / 0 | T3/M1 | 50% |
| zyx.mega.YersiniaPestis 3.0 | zyx.mega.YersiniaPestis | 1 | 35 | 324 | 9.2% | 7.6% ± 1.3 | 9.2% | 23.0% / 22.3% | 9.5% | 0 / 0 | T3/M1 | 47% |
| ags.Midboss 1q.fast | ags.Midboss | 1 | 35 | 284 | 8.6% | 6.1% ± 1.3 | 10.5% | 25.9% / 25.2% | 8.1% | 0 / 0 | T2/M0 | 71% |
| pez.rumble.CassiusClay 2rho.02no | pez.rumble.CassiusClay | 1 | 35 | 332 | 9.9% | 7.8% ± 1.2 | 11.4% | 20.9% / 22.3% | 9.3% | 0 / 0 | T3/M1 | 59% |
| Krabb.sliNk.Garm 0.9u | Krabb.sliNk.Garm | 1 | 35 | 298 | 7.1% | 7.4% ± 1.3 | 10.4% | 27.4% / 26.4% | 6.1% | 0 / 0 | T3/M0 | 69% |
| axeBots.SilverSurfer 2.53.33fix | axeBots.SilverSurfer | 1 | 35 | 326 | 7.5% | 6.5% ± 1.4 | 10.7% | 26.3% / 27.0% | 12.6% | 0 / 0 | T2/M0 | 62% |
| mn.Combat 3.25.0 | mn.Combat | 1 | 35 | 274 | 9.9% | 7.7% ± 1.0 | 10.8% | 22.7% / 21.5% | 12.1% | 0 / 0 | T3/M1 | 47% |
| cs.s2.Seraphim 2.3.1 | cs.s2.Seraphim | 1 | 35 | 292 | 9.4% | 8.2% ± 1.4 | 9.4% | 23.9% / 24.0% | 15.4% | 0 / 0 | T3/M1 | 47% |
| fromHell.CHCl3 1.4.2 | fromHell.CHCl3 | 1 | 35 | 292 | 7.6% | 6.6% ± 1.5 | 12.2% | 27.9% / 27.2% | 2.9% | 0 / 0 | T2/M0 | 77% |
| jk.mini.CunobelinDC 1.2 | jk.mini.CunobelinDC | 1 | 35 | 308 | 1.1% | 100.0% ± 33.5 | 27.2% | - / - | 3.0% | 0 / 0 | T?/M? | 98% |
| sheldor.mini.Foilist 1.3.1 | sheldor.mini.Foilist | 1 | 35 | 316 | 9.4% | 9.1% ± 1.1 | 10.7% | 24.1% / 25.0% | 7.7% | 0 / 0 | T3/M1 | 59% |
| florent.test.Toad 0.14t | florent.test.Toad | 1 | 35 | 304 | 8.3% | 7.4% ± 1.3 | 10.2% | 21.3% / 22.8% | 3.2% | 0 / 0 | T3/M1 | 63% |
| ar.horizon.Horizon 1.2.2 | ar.horizon.Horizon | 1 | 35 | 308 | 10.0% | 8.5% ± 1.2 | 10.5% | 23.4% / 22.3% | 9.7% | 0 / 0 | T3/M1 | 56% |
| cjm.chalk.Chalk 2.6.Be | cjm.chalk.Chalk | 1 | 35 | 298 | 0.0% | - | 0.2% | 2.9% / 3.1% | 2.7% | 0 / 0 | T?/M? | 100% |
| wcsv.PowerHouse.PowerHouse 1.7e3 | wcsv.PowerHouse.PowerHouse | 1 | 35 | 340 | 1.6% | 8.3% ± 28.9 | 12.1% | 21.6% / 12.6% | 6.3% | 0 / 0 | T?/M? | 100% |
| sheldor.mini.FoilistMC 1.0 | sheldor.mini.FoilistMC | 1 | 35 | 320 | 7.6% | 7.8% ± 1.2 | 10.4% | 25.8% / 25.0% | 3.2% | 0 / 0 | T3/M0 | 66% |
| pez.rumble.Ali 0.4.9 | pez.rumble.Ali | 1 | 35 | 292 | 3.5% | 7.9% ± 2.0 | 8.1% | 16.8% / 28.5% | 5.7% | 0 / 0 | T3/M2 | 75% |
| catcat20.Lambda 0.017 | catcat20.Lambda | 1 | 35 | 296 | 8.5% | 7.8% ± 1.3 | 11.4% | 27.8% / 26.9% | 1.1% | 0 / 0 | T3/M0 | 60% |
| florent.XSeries.X2 0.17 | florent.XSeries.X2 | 1 | 35 | 306 | 9.1% | 8.1% ± 1.4 | 10.2% | 20.2% / 21.5% | 5.7% | 0 / 0 | T3/M1 | 48% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.13hjswpa vs hadur2.Hadur 3.13hjsw

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 26.1% ± 4.4 | 24.9% ± 6.2 | +1.2 ± 10.4 |
| jd.Nullstride 2.3.3 | 25.7% ± 4.8 | 27.4% ± 6.5 | -1.7 ± 3.1 |
| jk.mega.DrussGT 3.1.16 | 47.7% ± 8.3 | 42.4% ± 4.8 | +5.3 ± 11.0 |
| oog.mega.saguaro.Saguaro 1.0 | 67.9% ± 17.7 | 72.5% ± 7.5 | -4.6 ± 24.5 |
| aaa.r.ScalarR 0.005h.053-noshield | 32.3% ± 4.2 | 31.6% ± 14.4 | +0.7 ± 10.7 |
| voidious.Diamond 1.8.22 | 47.8% ± 7.4 | 47.2% ± 9.3 | +0.6 ± 15.7 |
| cb.fire.Firestarter 2.0f | 50.0% ± 6.7 | 41.5% ± 3.2 | +8.5 ± 9.9 |
| dsekercioglu.mega.Raven 3.56j8 | 47.7% ± 10.4 | 53.9% ± 6.9 | -6.2 ± 11.5 |
| xander.cat.XanderCat 12.9 | 53.9% ± 3.0 | 56.8% ± 6.7 | -2.9 ± 5.3 |
| lxx.Tomcat 3.68 | 42.1% ± 14.2 | 55.6% ± 7.8 | -13.5 ± 8.2 |
| rsalesc.mega.Knight 0.6.28 | 50.8% ± 5.0 | 53.7% ± 5.0 | -2.9 ± 2.9 |
| aw.Gilgalad 1.99.5c | 42.4% ± 6.1 | 52.4% ± 6.6 | -9.9 ± 8.7 |
| pc.Wavelet 1.5 | 44.3% ± 7.4 | 47.0% ± 4.2 | -2.8 ± 4.9 |
| gh.GresSuffurd 0.4.13 | 52.7% ± 10.4 | 58.6% ± 11.5 | -5.9 ± 13.6 |
| kc.serpent.WaveSerpent 2.11 | 53.8% ± 2.6 | 55.6% ± 6.7 | -1.7 ± 8.9 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 61.8% ± 8.2 | 68.2% ± 7.5 | -6.4 ± 12.0 |
| cs.Nene 1.0.5 | 55.5% ± 3.9 | 54.0% ± 8.7 | +1.5 ± 12.1 |
| jk.melee.Neuromancer 7.12 | 42.3% ± 5.8 | 51.5% ± 2.9 | -9.1 ± 5.0 |
| voidious.Dookious 1.573c | 54.5% ± 2.5 | 56.4% ± 5.4 | -2.0 ± 4.4 |
| davidalves.Phoenix 1.02 | 99.0% ± 0.7 | 99.2% ± 0.4 | -0.1 ± 0.4 |
| rsalesc.roborio.Roborio 1.2.4 | 59.9% ± 6.1 | 60.5% ± 2.4 | -0.6 ± 7.9 |
| cb.Domogled 1.2 | 59.7% ± 13.7 | 61.2% ± 7.8 | -1.5 ± 20.4 |
| mue.Ascendant 1.2.27 | 53.3% ± 9.7 | 56.6% ± 6.3 | -3.3 ± 12.5 |
| abc.Shadow 3.83c | 46.1% ± 8.7 | 46.2% ± 3.4 | -0.1 ± 11.9 |
| darkcanuck.Pris 0.92 | 55.5% ± 13.5 | 63.0% ± 3.9 | -7.5 ± 12.7 |
| fromHell.BlackBox 0.0.2 | 61.8% ± 13.2 | 61.5% ± 10.2 | +0.3 ± 3.7 |
| jk.precise.Wintermute 0.8 | 59.9% ± 3.6 | 68.3% ± 6.2 | -8.4 ± 5.2 |
| kc.serpent.Hydra 0.21 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 |
| davidalves.Firebird 0.25 | 98.6% ± 2.3 | 94.4% ± 3.0 | +4.2 ± 3.5 |
| pulsar.PulsarMax 0.8.9 | 54.5% ± 6.5 | 55.9% ± 6.2 | -1.4 ± 10.2 |
| zyx.mega.YersiniaPestis 3.0 | 52.0% ± 8.9 | 55.2% ± 3.0 | -3.3 ± 6.0 |
| ags.Midboss 1q.fast | 65.7% ± 9.7 | 71.6% ± 5.5 | -5.8 ± 6.9 |
| pez.rumble.CassiusClay 2rho.02no | 58.4% ± 4.2 | 59.4% ± 8.2 | -1.1 ± 8.6 |
| Krabb.sliNk.Garm 0.9u | 66.2% ± 8.2 | 67.0% ± 8.9 | -0.8 ± 16.2 |
| axeBots.SilverSurfer 2.53.33fix | 59.8% ± 6.7 | 66.1% ± 6.9 | -6.2 ± 12.3 |
| mn.Combat 3.25.0 | 52.9% ± 6.2 | 56.9% ± 3.4 | -4.0 ± 6.5 |
| cs.s2.Seraphim 2.3.1 | 56.2% ± 10.8 | 68.1% ± 6.9 | -11.9 ± 14.0 |
| fromHell.CHCl3 1.4.2 | 68.3% ± 11.1 | 69.9% ± 4.8 | -1.6 ± 15.1 |
| jk.mini.CunobelinDC 1.2 | 98.3% ± 0.6 | 98.4% ± 0.4 | -0.1 ± 0.4 |
| sheldor.mini.Foilist 1.3.1 | 63.9% ± 7.1 | 59.3% ± 14.0 | +4.6 ± 11.3 |
| florent.test.Toad 0.14t | 62.1% ± 3.7 | 62.8% ± 10.5 | -0.8 ± 9.2 |
| ar.horizon.Horizon 1.2.2 | 55.6% ± 6.1 | 61.4% ± 4.5 | -5.8 ± 9.2 |
| cjm.chalk.Chalk 2.6.Be | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.1 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 98.7% ± 1.2 | 98.7% ± 1.1 | +0.1 ± 0.8 |
| sheldor.mini.FoilistMC 1.0 | 62.7% ± 9.3 | 67.7% ± 7.8 | -5.0 ± 6.6 |
| pez.rumble.Ali 0.4.9 | 77.1% ± 10.4 | 70.7% ± 14.4 | +6.4 ± 22.3 |
| catcat20.Lambda 0.017 | 64.8% ± 13.6 | 67.5% ± 10.5 | -2.7 ± 22.0 |
| florent.XSeries.X2 0.17 | 59.3% ± 12.3 | 63.5% ± 9.6 | -4.2 ± 16.0 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | +1.2 ± 10.4 | +0.0 ± 19.6 | +0.0 ± 19.6 | +3.3 ± 1.8 |
| jd.Nullstride 2.3.3 | -1.7 ± 3.1 | -3.6 ± 7.8 | -3.6 ± 7.8 | +0.5 ± 4.3 |
| jk.mega.DrussGT 3.1.16 | +5.3 ± 11.0 | +8.7 ± 19.8 | +7.9 ± 20.8 | +1.5 ± 4.8 |
| oog.mega.saguaro.Saguaro 1.0 | -4.6 ± 24.5 | -13.6 ± 34.7 | -13.6 ± 34.7 | +3.4 ± 15.1 |
| aaa.r.ScalarR 0.005h.053-noshield | +0.7 ± 10.7 | -3.1 ± 22.3 | -3.6 ± 23.3 | +4.8 ± 3.3 |
| voidious.Diamond 1.8.22 | +0.6 ± 15.7 | -1.5 ± 25.7 | -2.1 ± 25.8 | +2.2 ± 5.2 |
| cb.fire.Firestarter 2.0f | +8.5 ± 9.9 | +8.6 ± 15.3 | +8.6 ± 15.3 | +7.0 ± 6.4 |
| dsekercioglu.mega.Raven 3.56j8 | -6.2 ± 11.5 | -15.7 ± 19.1 | -15.7 ± 19.1 | +3.7 ± 5.7 |
| xander.cat.XanderCat 12.9 | -2.9 ± 5.3 | -9.6 ± 9.8 | -9.3 ± 10.7 | +3.4 ± 2.1 |
| lxx.Tomcat 3.68 | -13.5 ± 8.2 | -24.7 ± 16.3 | -25.0 ± 17.2 | -1.7 ± 2.3 |
| rsalesc.mega.Knight 0.6.28 | -2.9 ± 2.9 | -6.4 ± 5.7 | -6.4 ± 5.7 | +0.8 ± 3.6 |
| aw.Gilgalad 1.99.5c | -9.9 ± 8.7 | -20.0 ± 17.8 | -20.0 ± 17.8 | +0.5 ± 5.5 |
| pc.Wavelet 1.5 | -2.8 ± 4.9 | -4.3 ± 20.5 | -4.3 ± 20.5 | -0.9 ± 15.3 |
| gh.GresSuffurd 0.4.13 | -5.9 ± 13.6 | -19.1 ± 16.6 | -19.3 ± 16.3 | +6.4 ± 11.1 |
| kc.serpent.WaveSerpent 2.11 | -1.7 ± 8.9 | -6.4 ± 14.1 | -6.4 ± 14.1 | +3.4 ± 5.5 |
| dsekercioglu.mega.WhiteFang 2.8.1 | -6.4 ± 12.0 | -11.4 ± 19.3 | -11.4 ± 19.3 | -1.7 ± 9.8 |
| cs.Nene 1.0.5 | +1.5 ± 12.1 | -2.1 ± 17.2 | -2.1 ± 17.2 | +5.1 ± 7.2 |
| jk.melee.Neuromancer 7.12 | -9.1 ± 5.0 | -17.1 ± 9.8 | -17.1 ± 9.8 | -1.2 ± 5.0 |
| voidious.Dookious 1.573c | -2.0 ± 4.4 | -7.9 ± 10.1 | -7.9 ± 10.1 | +4.9 ± 5.0 |
| davidalves.Phoenix 1.02 | -0.1 ± 0.4 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| rsalesc.roborio.Roborio 1.2.4 | -0.6 ± 7.9 | -5.7 ± 14.4 | -5.7 ± 14.4 | +4.1 ± 5.2 |
| cb.Domogled 1.2 | -1.5 ± 20.4 | +0.0 ± 25.7 | +0.0 ± 25.7 | -3.0 ± 15.6 |
| mue.Ascendant 1.2.27 | -3.3 ± 12.5 | -11.4 ± 12.3 | -11.4 ± 12.3 | +4.6 ± 13.5 |
| abc.Shadow 3.83c | -0.1 ± 11.9 | -6.4 ± 14.1 | -6.4 ± 14.1 | +5.5 ± 9.6 |
| darkcanuck.Pris 0.92 | -7.5 ± 12.7 | -18.6 ± 18.7 | -18.6 ± 18.7 | +2.1 ± 12.1 |
| fromHell.BlackBox 0.0.2 | +0.3 ± 3.7 | -7.9 ± 7.8 | -7.9 ± 7.8 | +7.4 ± 0.6 |
| jk.precise.Wintermute 0.8 | -8.4 ± 5.2 | -17.9 ± 15.0 | -17.9 ± 15.0 | +0.6 ± 6.7 |
| kc.serpent.Hydra 0.21 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| davidalves.Firebird 0.25 | +4.2 ± 3.5 | +1.4 ± 2.6 | +1.4 ± 2.6 | +12.5 ± 39.8 |
| pulsar.PulsarMax 0.8.9 | -1.4 ± 10.2 | -4.3 ± 19.1 | -4.3 ± 19.1 | +1.3 ± 3.6 |
| zyx.mega.YersiniaPestis 3.0 | -3.3 ± 6.0 | -7.9 ± 10.1 | -7.9 ± 10.1 | +1.2 ± 4.2 |
| ags.Midboss 1q.fast | -5.8 ± 6.9 | -15.7 ± 13.1 | -15.7 ± 13.1 | +2.5 ± 0.9 |
| pez.rumble.CassiusClay 2rho.02no | -1.1 ± 8.6 | -7.9 ± 12.0 | -7.9 ± 12.0 | +4.8 ± 5.5 |
| Krabb.sliNk.Garm 0.9u | -0.8 ± 16.2 | -8.6 ± 18.2 | -8.6 ± 18.2 | +8.2 ± 13.1 |
| axeBots.SilverSurfer 2.53.33fix | -6.2 ± 12.3 | -14.3 ± 18.6 | -14.3 ± 18.6 | +1.2 ± 6.0 |
| mn.Combat 3.25.0 | -4.0 ± 6.5 | -10.7 ± 12.0 | -10.7 ± 12.0 | +2.5 ± 6.9 |
| cs.s2.Seraphim 2.3.1 | -11.9 ± 14.0 | -20.0 ± 19.6 | -20.0 ± 19.6 | -3.6 ± 10.2 |
| fromHell.CHCl3 1.4.2 | -1.6 ± 15.1 | -10.7 ± 20.8 | -10.7 ± 20.8 | +7.1 ± 9.7 |
| jk.mini.CunobelinDC 1.2 | -0.1 ± 0.4 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.2 ± 3.8 |
| sheldor.mini.Foilist 1.3.1 | +4.6 ± 11.3 | -1.4 ± 11.4 | -1.4 ± 11.4 | +9.8 ± 10.9 |
| florent.test.Toad 0.14t | -0.8 ± 9.2 | -6.4 ± 14.1 | -6.4 ± 14.1 | +5.0 ± 10.1 |
| ar.horizon.Horizon 1.2.2 | -5.8 ± 9.2 | -15.7 ± 14.1 | -15.7 ± 14.1 | +3.5 ± 9.0 |
| cjm.chalk.Chalk 2.6.Be | +0.0 ± 0.1 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | +0.1 ± 0.8 | +0.0 ± 0.0 | +0.0 ± 0.0 | +2.9 ± 10.4 |
| sheldor.mini.FoilistMC 1.0 | -5.0 ± 6.6 | -10.7 ± 8.6 | -10.7 ± 8.6 | +0.9 ± 11.5 |
| pez.rumble.Ali 0.4.9 | +6.4 ± 22.3 | +5.0 ± 13.6 | +5.0 ± 13.6 | +0.5 ± 11.5 |
| catcat20.Lambda 0.017 | -2.7 ± 22.0 | -10.7 ± 27.4 | -10.7 ± 27.4 | +5.2 ± 14.8 |
| florent.XSeries.X2 0.17 | -4.2 ± 16.0 | -12.1 ± 28.8 | -12.1 ± 28.8 | +3.6 ± 6.2 |
| All pairs | -2.3 ± 1.1 | -7.7 ± 1.7 | -7.7 ± 1.7 | +2.8 ± 0.9 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or, for a Hadur build, a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 4 | +1.2 ± 10.4 | +1.2 ± 10.4 |
| jd.Nullstride 2.3.3 | 4 | 0 | -1.7 ± 3.1 | n/a |
| jk.mega.DrussGT 3.1.16 | 4 | 0 | +5.3 ± 11.0 | n/a |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 4 | -4.6 ± 24.5 | -4.6 ± 24.5 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 2 | +0.7 ± 10.7 | -5.1 ± 8.8 |
| voidious.Diamond 1.8.22 | 4 | 0 | +0.6 ± 15.7 | n/a |
| cb.fire.Firestarter 2.0f | 4 | 4 | +8.5 ± 9.9 | +8.5 ± 9.9 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 1 | -6.2 ± 11.5 | -5.6 |
| xander.cat.XanderCat 12.9 | 4 | 1 | -2.9 ± 5.3 | +1.7 |
| lxx.Tomcat 3.68 | 4 | 0 | -13.5 ± 8.2 | n/a |
| rsalesc.mega.Knight 0.6.28 | 4 | 0 | -2.9 ± 2.9 | n/a |
| aw.Gilgalad 1.99.5c | 4 | 0 | -9.9 ± 8.7 | n/a |
| pc.Wavelet 1.5 | 4 | 1 | -2.8 ± 4.9 | -2.4 |
| gh.GresSuffurd 0.4.13 | 4 | 3 | -5.9 ± 13.6 | -5.3 ± 25.7 |
| kc.serpent.WaveSerpent 2.11 | 4 | 2 | -1.7 ± 8.9 | +0.8 ± 74.4 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 2 | -6.4 ± 12.0 | -5.3 ± 115.2 |
| cs.Nene 1.0.5 | 4 | 4 | +1.5 ± 12.1 | +1.5 ± 12.1 |
| jk.melee.Neuromancer 7.12 | 4 | 3 | -9.1 ± 5.0 | -8.0 ± 6.9 |
| voidious.Dookious 1.573c | 4 | 2 | -2.0 ± 4.4 | -2.9 ± 16.2 |
| davidalves.Phoenix 1.02 | 4 | 4 | -0.1 ± 0.4 | -0.1 ± 0.4 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 1 | -0.6 ± 7.9 | -4.5 |
| cb.Domogled 1.2 | 4 | 4 | -1.5 ± 20.4 | -1.5 ± 20.4 |
| mue.Ascendant 1.2.27 | 4 | 2 | -3.3 ± 12.5 | -5.9 ± 38.5 |
| abc.Shadow 3.83c | 4 | 0 | -0.1 ± 11.9 | n/a |
| darkcanuck.Pris 0.92 | 4 | 1 | -7.5 ± 12.7 | +2.4 |
| fromHell.BlackBox 0.0.2 | 4 | 3 | +0.3 ± 3.7 | +1.4 ± 2.7 |
| jk.precise.Wintermute 0.8 | 4 | 3 | -8.4 ± 5.2 | -8.0 ± 9.7 |
| kc.serpent.Hydra 0.21 | 4 | 4 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| davidalves.Firebird 0.25 | 4 | 4 | +4.2 ± 3.5 | +4.2 ± 3.5 |
| pulsar.PulsarMax 0.8.9 | 4 | 2 | -1.4 ± 10.2 | -1.9 ± 97.5 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 1 | -3.3 ± 6.0 | +1.6 |
| ags.Midboss 1q.fast | 4 | 2 | -5.8 ± 6.9 | -5.8 ± 6.0 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 1 | -1.1 ± 8.6 | +5.2 |
| Krabb.sliNk.Garm 0.9u | 4 | 1 | -0.8 ± 16.2 | +3.8 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 1 | -6.2 ± 12.3 | -11.1 |
| mn.Combat 3.25.0 | 4 | 3 | -4.0 ± 6.5 | -3.6 ± 12.2 |
| cs.s2.Seraphim 2.3.1 | 4 | 3 | -11.9 ± 14.0 | -9.8 ± 23.4 |
| fromHell.CHCl3 1.4.2 | 4 | 2 | -1.6 ± 15.1 | +4.4 ± 102.1 |
| jk.mini.CunobelinDC 1.2 | 4 | 4 | -0.1 ± 0.4 | -0.1 ± 0.4 |
| sheldor.mini.Foilist 1.3.1 | 4 | 0 | +4.6 ± 11.3 | n/a |
| florent.test.Toad 0.14t | 4 | 3 | -0.8 ± 9.2 | -0.9 ± 17.6 |
| ar.horizon.Horizon 1.2.2 | 4 | 2 | -5.8 ± 9.2 | -3.2 ± 42.4 |
| cjm.chalk.Chalk 2.6.Be | 4 | 4 | +0.0 ± 0.1 | +0.0 ± 0.1 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 4 | +0.1 ± 0.8 | +0.1 ± 0.8 |
| sheldor.mini.FoilistMC 1.0 | 4 | 1 | -5.0 ± 6.6 | -8.6 |
| pez.rumble.Ali 0.4.9 | 4 | 4 | +6.4 ± 22.3 | +6.4 ± 22.3 |
| catcat20.Lambda 0.017 | 4 | 3 | -2.7 ± 22.0 | -0.3 ± 39.4 |
| florent.XSeries.X2 0.17 | 4 | 3 | -4.2 ± 16.0 | +0.2 ± 14.4 |
| All pairs | 192 | 103 | -2.3 ± 1.1 | -1.1 ± 1.5 |

# Bench: hadur2.Hadur 3.13hjswpa baseline (hadur2.Hadur 3.13hjsw) (cold)

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 8024 over 192 battles (41.8 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rank1-band1 | 24.9% ± 6.2 | 12.9% ± 12.0 | 40.6% ± 1.9 | 18 / 140 | 5.1% ± 0.4 | 9.3% ± 1.3 | 213 | 0 | 1.95 / 136.6 |
| jd.Nullstride 2.3.3 | rank2-band1 | 27.4% ± 6.5 | 16.4% ± 10.1 | 42.6% ± 5.0 | 23 / 140 | 5.1% ± 0.6 | 8.9% ± 0.6 | 220 | 0 | 1.70 / 356.9 |
| jk.mega.DrussGT 3.1.16 | rank3-band1 | 42.4% ± 4.8 | 38.4% ± 13.9 | 46.7% ± 4.8 | 55 / 140 | 7.6% ± 0.3 | 10.7% ± 1.0 | 336 | 0 | 1.45 / 162.9 |
| oog.mega.saguaro.Saguaro 1.0 | rank4-band1 | 72.5% ± 7.5 | 82.9% ± 11.1 | 62.5% ± 5.4 | 116 / 140 | 18.3% ± 2.3 | 6.9% ± 1.9 | 58 | 0 | 2.20 / 16.5 |
| aaa.r.ScalarR 0.005h.053-noshield | rank5-band1 | 31.6% ± 14.4 | 24.6% ± 24.1 | 40.1% ± 4.1 | 35 / 140 | 7.1% ± 0.5 | 11.2% ± 1.2 | 284 | 0 | 1.73 / 58.5 |
| voidious.Diamond 1.8.22 | rank6-band1 | 47.2% ± 9.3 | 55.1% ± 15.8 | 39.5% ± 2.8 | 78 / 140 | 7.0% ± 0.7 | 9.4% ± 0.5 | 264 | 0 | 1.69 / 41.1 |
| cb.fire.Firestarter 2.0f | rank7-band1 | 41.5% ± 3.2 | 35.7% ± 5.9 | 48.1% ± 3.1 | 50 / 140 | 8.2% ± 0.8 | 9.6% ± 0.6 | 241 | 0 | 1.74 / 66.1 |
| dsekercioglu.mega.Raven 3.56j8 | rank8-band1 | 53.9% ± 6.9 | 67.9% ± 10.1 | 39.7% ± 3.8 | 95 / 140 | 9.6% ± 1.0 | 9.6% ± 0.9 | 162 | 0 | 1.18 / 174.5 |
| xander.cat.XanderCat 12.9 | rank9-band1 | 56.8% ± 6.7 | 62.1% ± 9.4 | 51.7% ± 4.5 | 87 / 140 | 11.9% ± 0.3 | 9.1% ± 1.4 | 187 | 0 | 1.22 / 19.4 |
| lxx.Tomcat 3.68 | rank10-band1 | 55.6% ± 7.8 | 67.6% ± 10.2 | 44.1% ± 4.4 | 95 / 140 | 10.0% ± 0.8 | 10.4% ± 0.6 | 300 | 0 | 1.98 / 54.9 |
| rsalesc.mega.Knight 0.6.28 | rank11-band2 | 53.7% ± 5.0 | 55.0% ± 6.8 | 51.6% ± 4.1 | 77 / 140 | 9.5% ± 0.8 | 10.4% ± 0.8 | 304 | 0 | 2.01 / 105.2 |
| aw.Gilgalad 1.99.5c | rank12-band2 | 52.4% ± 6.6 | 64.3% ± 8.7 | 41.0% ± 5.3 | 90 / 140 | 9.8% ± 3.0 | 11.0% ± 1.6 | 295 | 0 | 1.45 / 22.8 |
| pc.Wavelet 1.5 | rank13-band2 | 47.0% ± 4.2 | 42.1% ± 9.4 | 52.3% ± 13.7 | 59 / 140 | 10.2% ± 2.1 | 9.5% ± 1.0 | 194 | 0 | 1.96 / 249.3 |
| gh.GresSuffurd 0.4.13 | rank14-band2 | 58.6% ± 11.5 | 70.5% ± 15.0 | 47.1% ± 7.3 | 99 / 140 | 11.2% ± 0.3 | 8.9% ± 0.6 | 206 | 0 | 1.05 / 15.2 |
| kc.serpent.WaveSerpent 2.11 | rank15-band2 | 55.6% ± 6.7 | 70.7% ± 8.6 | 39.4% ± 2.3 | 99 / 140 | 8.6% ± 0.8 | 8.1% ± 1.7 | 95 | 0 | 2.12 / 181.8 |
| dsekercioglu.mega.WhiteFang 2.8.1 | rank16-band2 | 68.2% ± 7.5 | 82.9% ± 9.8 | 52.8% ± 6.7 | 116 / 140 | 11.0% ± 0.7 | 8.2% ± 1.0 | 164 | 0 | 1.16 / 459.0 |
| cs.Nene 1.0.5 | rank17-band2 | 54.0% ± 8.7 | 70.0% ± 13.1 | 37.7% ± 4.5 | 98 / 140 | 9.3% ± 1.2 | 7.9% ± 0.6 | 105 | 0 | 1.30 / 778.3 |
| jk.melee.Neuromancer 7.12 | rank18-band2 | 51.5% ± 2.9 | 55.0% ± 4.4 | 48.2% ± 2.1 | 77 / 140 | 10.2% ± 0.4 | 10.3% ± 0.5 | 273 | 0 | 1.70 / 22.8 |
| voidious.Dookious 1.573c | rank19-band2 | 56.4% ± 5.4 | 69.3% ± 10.1 | 42.1% ± 0.8 | 97 / 140 | 9.3% ± 0.6 | 7.3% ± 0.4 | 100 | 0 | 1.24 / 122.7 |
| davidalves.Phoenix 1.02 | rank21-band2 | 99.2% ± 0.4 | 100.0% ± 0.0 | 0.0% ± 0.0 | 140 / 140 | 0.0% ± 0.0 | 0.1% ± 0.0 | 48 | 0 | 0.53 / 43.1 |
| rsalesc.roborio.Roborio 1.2.4 | rank22-band2 | 60.5% ± 2.4 | 58.6% ± 5.9 | 61.1% ± 2.1 | 82 / 140 | 12.0% ± 0.2 | 10.2% ± 2.4 | 271 | 0 | 1.56 / 24.8 |
| cb.Domogled 1.2 | rank23-band2 | 61.2% ± 7.8 | 53.6% ± 10.7 | 67.4% ± 6.5 | 75 / 140 | 11.5% ± 0.9 | 7.6% ± 1.3 | 244 | 0 | 1.00 / 22.1 |
| mue.Ascendant 1.2.27 | rank24-band2 | 56.6% ± 6.3 | 71.4% ± 8.3 | 42.3% ± 5.9 | 100 / 140 | 10.4% ± 0.7 | 8.0% ± 1.2 | 97 | 0 | 0.99 / 13.8 |
| abc.Shadow 3.83c | rank25-band2 | 46.2% ± 3.4 | 57.9% ± 6.8 | 35.6% ± 2.8 | 81 / 140 | 9.3% ± 0.5 | 9.1% ± 0.6 | 137 | 0 | 1.17 / 17.6 |
| darkcanuck.Pris 0.92 | rank26-band2 | 63.0% ± 3.9 | 77.1% ± 3.7 | 49.8% ± 4.9 | 108 / 140 | 12.0% ± 1.3 | 8.4% ± 1.0 | 76 | 0 | 1.84 / 13.0 |
| fromHell.BlackBox 0.0.2 | rank27-band2 | 61.5% ± 10.2 | 70.7% ± 13.1 | 52.5% ± 8.1 | 99 / 140 | 16.3% ± 1.5 | 9.6% ± 2.7 | 139 | 0 | 1.01 / 13.9 |
| jk.precise.Wintermute 0.8 | rank28-band2 | 68.3% ± 6.2 | 85.7% ± 11.7 | 50.9% ± 1.0 | 120 / 140 | 11.2% ± 0.6 | 8.2% ± 0.3 | 145 | 0 | 1.29 / 466.5 |
| kc.serpent.Hydra 0.21 | rank29-band2 | 100.0% ± 0.0 | 100.0% ± 0.0 | 50.0% ± 0.0 | 140 / 140 | 0.0% ± 0.0 | 0.0% ± 0.0 | 50 | 0 | 0.74 / 169.1 |
| davidalves.Firebird 0.25 | rank30-band2 | 94.4% ± 3.0 | 98.6% ± 2.6 | 0.0% ± 0.0 | 138 / 140 | 0.0% ± 0.0 | 0.5% ± 0.1 | 56 | 0 | 0.70 / 265.0 |
| pulsar.PulsarMax 0.8.9 | rank31-band2 | 55.9% ± 6.2 | 71.4% ± 10.5 | 39.7% ± 4.6 | 100 / 140 | 9.7% ± 1.0 | 7.8% ± 0.9 | 122 | 0 | 1.12 / 314.0 |
| zyx.mega.YersiniaPestis 3.0 | rank32-band2 | 55.2% ± 3.0 | 70.0% ± 4.5 | 41.0% ± 2.8 | 98 / 140 | 10.5% ± 0.8 | 8.3% ± 0.9 | 159 | 0 | 1.46 / 24.8 |
| ags.Midboss 1q.fast | rank33-band2 | 71.6% ± 5.5 | 84.3% ± 7.9 | 59.7% ± 4.9 | 118 / 140 | 13.8% ± 1.4 | 9.0% ± 1.1 | 180 | 0 | 1.37 / 535.8 |
| pez.rumble.CassiusClay 2rho.02no | rank35-band2 | 59.4% ± 8.2 | 61.4% ± 12.0 | 57.0% ± 4.5 | 86 / 140 | 12.2% ± 1.2 | 8.5% ± 0.5 | 212 | 0 | 1.11 / 26.1 |
| Krabb.sliNk.Garm 0.9u | rank36-band2 | 67.0% ± 8.9 | 82.1% ± 10.7 | 49.8% ± 6.6 | 115 / 140 | 10.9% ± 0.8 | 6.6% ± 1.0 | 108 | 0 | 1.12 / 19.1 |
| axeBots.SilverSurfer 2.53.33fix | rank37-band2 | 66.1% ± 6.9 | 77.9% ± 10.1 | 54.8% ± 4.9 | 109 / 140 | 12.2% ± 0.8 | 7.4% ± 0.7 | 138 | 0 | 1.47 / 122.2 |
| mn.Combat 3.25.0 | rank38-band2 | 56.9% ± 3.4 | 67.9% ± 10.1 | 45.6% ± 3.3 | 95 / 140 | 10.4% ± 1.1 | 9.3% ± 0.7 | 270 | 0 | 1.72 / 22.8 |
| cs.s2.Seraphim 2.3.1 | rank39-band2 | 68.1% ± 6.9 | 84.3% ± 7.9 | 51.5% ± 6.8 | 118 / 140 | 11.0% ± 1.2 | 7.0% ± 1.2 | 128 | 0 | 1.11 / 12.1 |
| fromHell.CHCl3 1.4.2 | rank40-band2 | 69.9% ± 4.8 | 82.1% ± 7.8 | 57.2% ± 2.6 | 115 / 140 | 13.0% ± 1.7 | 7.0% ± 0.6 | 115 | 0 | 0.97 / 13.4 |
| jk.mini.CunobelinDC 1.2 | rank41-band2 | 98.4% ± 0.4 | 100.0% ± 0.0 | 7.6% ± 8.2 | 140 / 140 | 0.7% ± 1.3 | 1.1% ± 0.1 | 68 | 0 | 0.58 / 16.9 |
| sheldor.mini.Foilist 1.3.1 | rank42-band2 | 59.3% ± 14.0 | 71.4% ± 18.6 | 47.6% ± 10.7 | 100 / 140 | 10.6% ± 1.3 | 9.3% ± 0.3 | 263 | 0 | 1.17 / 139.7 |
| florent.test.Toad 0.14t | rank43-band2 | 62.8% ± 10.5 | 77.9% ± 14.6 | 47.4% ± 6.3 | 109 / 140 | 11.2% ± 0.4 | 8.0% ± 0.9 | 145 | 0 | 1.10 / 17.6 |
| ar.horizon.Horizon 1.2.2 | rank44-band2 | 61.4% ± 4.5 | 74.3% ± 6.4 | 48.6% ± 7.9 | 104 / 140 | 11.2% ± 0.4 | 8.1% ± 1.2 | 147 | 0 | 1.41 / 15.8 |
| cjm.chalk.Chalk 2.6.Be | rank45-band2 | 100.0% ± 0.0 | 100.0% ± 0.0 | 50.0% ± 0.0 | 140 / 140 | 0.0% ± 0.0 | 0.0% ± 0.0 | 53 | 0 | 0.57 / 21.1 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | rank46-band2 | 98.7% ± 1.1 | 100.0% ± 0.0 | 8.7% ± 18.1 | 140 / 140 | 0.3% ± 0.8 | 2.2% ± 0.3 | 50 | 0 | 0.48 / 17.8 |
| sheldor.mini.FoilistMC 1.0 | rank47-band2 | 67.7% ± 7.8 | 80.7% ± 10.1 | 53.6% ± 6.7 | 113 / 140 | 11.6% ± 0.4 | 7.6% ± 0.7 | 204 | 0 | 1.29 / 17.3 |
| pez.rumble.Ali 0.4.9 | rank48-band2 | 70.7% ± 14.4 | 87.1% ± 9.5 | 31.8% ± 2.8 | 122 / 140 | 3.9% ± 2.5 | 3.9% ± 2.6 | 100 | 0 | 1.96 / 116.4 |
| catcat20.Lambda 0.017 | rank49-band2 | 67.5% ± 10.5 | 81.4% ± 13.6 | 53.0% ± 6.4 | 114 / 140 | 11.5% ± 0.8 | 7.6% ± 1.3 | 168 | 0 | 1.65 / 15.4 |
| florent.XSeries.X2 0.17 | rank50-band2 | 63.5% ± 9.6 | 80.0% ± 15.3 | 47.0% ± 3.9 | 112 / 140 | 11.2% ± 0.7 | 7.9% ± 1.2 | 130 | 0 | 2.02 / 17.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 3035 | 50.3% | 33.7% | 0.0% | 16.0% | 1877 |
| jd.Nullstride 2.3.3 | 4 | 2858 | 51.2% | 32.8% | 0.0% | 16.0% | 1872 |
| jk.mega.DrussGT 3.1.16 | 4 | 2499 | 42.5% | 43.5% | 0.0% | 14.0% | 3163 |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 1352 | 22.2% | 68.1% | 0.0% | 9.7% | 677 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 2964 | 44.3% | 40.2% | 0.0% | 15.5% | 2562 |
| voidious.Diamond 1.8.22 | 4 | 2192 | 35.4% | 52.0% | 0.0% | 12.6% | 2766 |
| cb.fire.Firestarter 2.0f | 4 | 2535 | 44.4% | 41.2% | 0.0% | 14.4% | 2886 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 2046 | 27.5% | 61.8% | 0.0% | 10.7% | 1272 |
| xander.cat.XanderCat 12.9 | 4 | 2042 | 32.4% | 56.0% | 0.0% | 11.5% | 1507 |
| lxx.Tomcat 3.68 | 4 | 2038 | 27.6% | 61.6% | 0.0% | 10.7% | 2202 |
| rsalesc.mega.Knight 0.6.28 | 4 | 2100 | 37.5% | 50.3% | 0.0% | 12.2% | 3190 |
| aw.Gilgalad 1.99.5c | 4 | 2161 | 28.9% | 60.0% | 0.0% | 11.1% | 1858 |
| pc.Wavelet 1.5 | 4 | 2433 | 41.6% | 42.7% | 0.3% | 15.4% | 1673 |
| gh.GresSuffurd 0.4.13 | 4 | 1922 | 26.7% | 62.5% | 0.0% | 10.8% | 1131 |
| kc.serpent.WaveSerpent 2.11 | 4 | 1945 | 26.3% | 63.5% | 0.0% | 10.2% | 1094 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 1436 | 20.9% | 71.1% | 0.0% | 8.0% | 1301 |
| cs.Nene 1.0.5 | 4 | 2012 | 26.1% | 63.5% | 0.0% | 10.4% | 929 |
| jk.melee.Neuromancer 7.12 | 4 | 2258 | 34.9% | 53.0% | 0.0% | 12.1% | 1895 |
| voidious.Dookious 1.573c | 4 | 1868 | 28.8% | 60.6% | 0.0% | 10.6% | 981 |
| davidalves.Phoenix 1.02 | 4 | 18 | 0.0% | 100.0% | 0.0% | 0.0% | 1240 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 1860 | 39.0% | 48.6% | 0.0% | 12.5% | 2895 |
| cb.Domogled 1.2 | 4 | 1716 | 47.3% | 39.8% | 0.0% | 12.8% | 2630 |
| mue.Ascendant 1.2.27 | 4 | 1985 | 25.2% | 64.5% | 0.0% | 10.3% | 875 |
| abc.Shadow 3.83c | 4 | 2436 | 30.3% | 57.3% | 0.0% | 12.4% | 962 |
| darkcanuck.Pris 0.92 | 4 | 1789 | 22.4% | 68.1% | 0.0% | 9.5% | 835 |
| fromHell.BlackBox 0.0.2 | 4 | 1835 | 27.9% | 61.3% | 0.0% | 10.8% | 902 |
| jk.precise.Wintermute 0.8 | 4 | 1464 | 17.1% | 75.7% | 0.0% | 7.3% | 968 |
| kc.serpent.Hydra 0.21 | 4 | - | - | - | - | - | 1384 |
| davidalves.Firebird 0.25 | 4 | 122 | 20.5% | 72.5% | 0.0% | 7.0% | 1268 |
| pulsar.PulsarMax 0.8.9 | 4 | 1930 | 25.9% | 63.3% | 0.1% | 10.8% | 954 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 2036 | 25.8% | 63.6% | 0.0% | 10.6% | 973 |
| ags.Midboss 1q.fast | 4 | 1415 | 19.4% | 72.1% | 0.0% | 8.5% | 895 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 1937 | 34.9% | 53.1% | 0.0% | 12.1% | 1615 |
| Krabb.sliNk.Garm 0.9u | 4 | 1415 | 22.1% | 69.1% | 0.0% | 8.8% | 946 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 1605 | 24.2% | 65.8% | 0.0% | 10.0% | 966 |
| mn.Combat 3.25.0 | 4 | 1912 | 29.4% | 59.9% | 0.0% | 10.7% | 1589 |
| cs.s2.Seraphim 2.3.1 | 4 | 1446 | 19.0% | 72.9% | 0.0% | 8.1% | 860 |
| fromHell.CHCl3 1.4.2 | 4 | 1400 | 22.3% | 68.9% | 0.0% | 8.8% | 878 |
| jk.mini.CunobelinDC 1.2 | 4 | 34 | 0.0% | 100.0% | 0.0% | 0.0% | 1408 |
| sheldor.mini.Foilist 1.3.1 | 4 | 1862 | 26.9% | 62.5% | 0.0% | 10.6% | 1445 |
| florent.test.Toad 0.14t | 4 | 1692 | 22.9% | 68.1% | 0.0% | 9.0% | 956 |
| ar.horizon.Horizon 1.2.2 | 4 | 1776 | 25.3% | 64.7% | 0.0% | 10.0% | 1076 |
| cjm.chalk.Chalk 2.6.Be | 4 | 0 | 0.0% | 0.0% | 100.0% | 0.0% | 1367 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 28 | 0.0% | 100.0% | 0.0% | 0.0% | 1062 |
| sheldor.mini.FoilistMC 1.0 | 4 | 1430 | 23.6% | 66.9% | 0.0% | 9.5% | 1296 |
| pez.rumble.Ali 0.4.9 | 4 | 931 | 24.2% | 66.4% | 0.0% | 9.4% | 1322 |
| catcat20.Lambda 0.017 | 4 | 1472 | 22.1% | 68.8% | 0.0% | 9.1% | 1020 |
| florent.XSeries.X2 0.17 | 4 | 1680 | 20.8% | 70.7% | 0.0% | 8.4% | 967 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 4 | 0 | 0 | 1.52 | 0 | 0 | 0 |
| jd.Nullstride 2.3.3 | 4 | 0 | 0 | 0 | 1.57 | 4 | 4 | 0 |
| jk.mega.DrussGT 3.1.16 | 4 | 0 | 0 | 0 | 2.40 | 2 | 2 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 4 | 0 | 0 | 0.41 | 0 | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 3 | 0 | 0 | 2.03 | 0 | 0 | 0 |
| voidious.Diamond 1.8.22 | 4 | 0 | 0 | 0 | 1.89 | 4 | 4 | 0 |
| cb.fire.Firestarter 2.0f | 4 | 4 | 0 | 0 | 1.72 | 0 | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 3 | 0 | 0 | 1.16 | 1 | 1 | 0 |
| xander.cat.XanderCat 12.9 | 4 | 2 | 0 | 0 | 1.34 | 2 | 2 | 0 |
| lxx.Tomcat 3.68 | 4 | 0 | 0 | 0 | 2.14 | 1 | 1 | 0 |
| rsalesc.mega.Knight 0.6.28 | 4 | 0 | 0 | 0 | 2.17 | 3 | 3 | 0 |
| aw.Gilgalad 1.99.5c | 4 | 0 | 0 | 0 | 2.11 | 0 | 0 | 0 |
| pc.Wavelet 1.5 | 4 | 4 | 0 | 0 | 1.39 | 0 | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 4 | 4 | 0 | 0 | 1.47 | 0 | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 4 | 3 | 0 | 0 | 0.68 | 1 | 1 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 3 | 0 | 0 | 1.17 | 1 | 0 | 0 |
| cs.Nene 1.0.5 | 4 | 4 | 0 | 0 | 0.75 | 0 | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 4 | 3 | 0 | 0 | 1.95 | 0 | 0 | 0 |
| voidious.Dookious 1.573c | 4 | 2 | 0 | 0 | 0.71 | 2 | 2 | 0 |
| davidalves.Phoenix 1.02 | 4 | 4 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 2 | 0 | 0 | 1.94 | 2 | 2 | 0 |
| cb.Domogled 1.2 | 4 | 4 | 0 | 0 | 1.74 | 0 | 0 | 0 |
| mue.Ascendant 1.2.27 | 4 | 4 | 0 | 0 | 0.69 | 0 | 0 | 0 |
| abc.Shadow 3.83c | 4 | 0 | 0 | 0 | 0.98 | 4 | 4 | 0 |
| darkcanuck.Pris 0.92 | 4 | 3 | 0 | 0 | 0.54 | 1 | 1 | 0 |
| fromHell.BlackBox 0.0.2 | 4 | 4 | 0 | 0 | 0.99 | 0 | 0 | 0 |
| jk.precise.Wintermute 0.8 | 4 | 3 | 0 | 0 | 1.04 | 1 | 1 | 0 |
| kc.serpent.Hydra 0.21 | 4 | 4 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| davidalves.Firebird 0.25 | 4 | 4 | 0 | 0 | 0.40 | 0 | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 4 | 2 | 0 | 0 | 0.87 | 2 | 2 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 3 | 0 | 0 | 1.14 | 1 | 1 | 0 |
| ags.Midboss 1q.fast | 4 | 4 | 0 | 0 | 1.29 | 0 | 0 | 0 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 2 | 0 | 0 | 1.51 | 2 | 2 | 0 |
| Krabb.sliNk.Garm 0.9u | 4 | 4 | 0 | 0 | 0.77 | 0 | 0 | 0 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 3 | 0 | 0 | 0.99 | 1 | 1 | 0 |
| mn.Combat 3.25.0 | 4 | 3 | 0 | 1 | 1.93 | 0 | 0 | 0 |
| cs.s2.Seraphim 2.3.1 | 4 | 3 | 0 | 0 | 0.91 | 1 | 1 | 0 |
| fromHell.CHCl3 1.4.2 | 4 | 3 | 0 | 0 | 0.82 | 1 | 0 | 0 |
| jk.mini.CunobelinDC 1.2 | 4 | 4 | 0 | 0 | 0.49 | 0 | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 4 | 0 | 0 | 0 | 1.88 | 2 | 2 | 0 |
| florent.test.Toad 0.14t | 4 | 4 | 0 | 0 | 1.04 | 0 | 0 | 0 |
| ar.horizon.Horizon 1.2.2 | 4 | 4 | 0 | 0 | 1.05 | 0 | 0 | 0 |
| cjm.chalk.Chalk 2.6.Be | 4 | 4 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 4 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 4 | 3 | 0 | 0 | 1.46 | 1 | 1 | 0 |
| pez.rumble.Ali 0.4.9 | 4 | 4 | 0 | 0 | 0.71 | 0 | 0 | 0 |
| catcat20.Lambda 0.017 | 4 | 4 | 0 | 0 | 1.20 | 0 | 0 | 0 |
| florent.XSeries.X2 0.17 | 4 | 3 | 0 | 0 | 0.93 | 1 | 1 | 0 |

136 of 192 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 20011 | 257 | 20088 | 20005 (100.0%) | 6 (0.0%) | 83 (0.4%) | 1685 | 149 | 210 |
| jd.Nullstride 2.3.3 | 19503 | 217 | 19590 | 19495 (100.0%) | 8 (0.0%) | 95 (0.5%) | 1878 | 133 | 214 |
| jk.mega.DrussGT 3.1.16 | 36534 | 8 | 36534 | 36531 (100.0%) | 3 (0.0%) | 3 (0.0%) | 2293 | 280 | 315 |
| oog.mega.saguaro.Saguaro 1.0 | 4691 | 4 | 4693 | 4688 (99.9%) | 3 (0.1%) | 5 (0.1%) | 234 | 68 | 38 |
| aaa.r.ScalarR 0.005h.053-noshield | 28246 | 10 | 28283 | 28242 (100.0%) | 4 (0.0%) | 41 (0.1%) | 2046 | 356 | 290 |
| voidious.Diamond 1.8.22 | 31119 | 630 | 31165 | 31108 (100.0%) | 11 (0.0%) | 57 (0.2%) | 2566 | 187 | 257 |
| cb.fire.Firestarter 2.0f | 28469 | 967 | 28844 | 28443 (99.9%) | 26 (0.1%) | 401 (1.4%) | 6129 | 217 | 257 |
| dsekercioglu.mega.Raven 3.56j8 | 11870 | 62 | 11871 | 11869 (100.0%) | 1 (0.0%) | 2 (0.0%) | 873 | 139 | 147 |
| xander.cat.XanderCat 12.9 | 12577 | 11 | 12602 | 12573 (100.0%) | 4 (0.0%) | 29 (0.2%) | 1484 | 171 | 183 |
| lxx.Tomcat 3.68 | 23902 | 388 | 23865 | 23860 (99.8%) | 42 (0.2%) | 5 (0.0%) | 2095 | 181 | 287 |
| rsalesc.mega.Knight 0.6.28 | 36521 | 270 | 36486 | 36479 (99.9%) | 42 (0.1%) | 7 (0.0%) | 2906 | 311 | 431 |
| aw.Gilgalad 1.99.5c | 19632 | 7 | 19645 | 19623 (100.0%) | 9 (0.0%) | 22 (0.1%) | 1676 | 180 | 341 |
| pc.Wavelet 1.5 | 14458 | 4 | 14472 | 14458 (100.0%) | 0 (0.0%) | 14 (0.1%) | 1418 | 133 | 154 |
| gh.GresSuffurd 0.4.13 | 10147 | 5 | 10142 | 10139 (99.9%) | 8 (0.1%) | 3 (0.0%) | 715 | 92 | 229 |
| kc.serpent.WaveSerpent 2.11 | 8000 | 6 | 8000 | 7999 (100.0%) | 1 (0.0%) | 1 (0.0%) | 577 | 57 | 63 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 11081 | 9 | 11083 | 11081 (100.0%) | 0 (0.0%) | 2 (0.0%) | 931 | 112 | 129 |
| cs.Nene 1.0.5 | 7621 | 66 | 7622 | 7620 (100.0%) | 1 (0.0%) | 2 (0.0%) | 461 | 47 | 87 |
| jk.melee.Neuromancer 7.12 | 18963 | 4 | 18989 | 18959 (100.0%) | 4 (0.0%) | 30 (0.2%) | 1779 | 175 | 265 |
| voidious.Dookious 1.573c | 7310 | 13 | 7310 | 7308 (100.0%) | 2 (0.0%) | 2 (0.0%) | 499 | 59 | 84 |
| davidalves.Phoenix 1.02 | 5787 | 0 | 5790 | 5787 (100.0%) | 0 (0.0%) | 3 (0.1%) | 2446 | 0 | 20 |
| rsalesc.roborio.Roborio 1.2.4 | 28240 | 3 | 28271 | 28235 (100.0%) | 5 (0.0%) | 36 (0.1%) | 3308 | 214 | 261 |
| cb.Domogled 1.2 | 21778 | 7 | 22492 | 21778 (100.0%) | 0 (0.0%) | 714 (3.2%) | 8943 | 138 | 231 |
| mue.Ascendant 1.2.27 | 6711 | 6 | 6714 | 6711 (100.0%) | 0 (0.0%) | 3 (0.0%) | 411 | 79 | 63 |
| abc.Shadow 3.83c | 8118 | 517 | 7989 | 7988 (98.4%) | 130 (1.6%) | 1 (0.0%) | 486 | 72 | 126 |
| darkcanuck.Pris 0.92 | 6256 | 22 | 6256 | 6255 (100.0%) | 1 (0.0%) | 1 (0.0%) | 327 | 78 | 41 |
| fromHell.BlackBox 0.0.2 | 7650 | 11 | 7629 | 7623 (99.6%) | 27 (0.4%) | 6 (0.1%) | 914 | 83 | 466 |
| jk.precise.Wintermute 0.8 | 8345 | 11 | 8347 | 8342 (100.0%) | 3 (0.0%) | 5 (0.1%) | 472 | 85 | 136 |
| kc.serpent.Hydra 0.21 | 9053 | 1 | 9054 | 9051 (100.0%) | 2 (0.0%) | 3 (0.0%) | 22 | 1 | 25 |
| davidalves.Firebird 0.25 | 6300 | 0 | 6301 | 6300 (100.0%) | 0 (0.0%) | 1 (0.0%) | 2041 | 7 | 21 |
| pulsar.PulsarMax 0.8.9 | 7600 | 4 | 7603 | 7600 (100.0%) | 0 (0.0%) | 3 (0.0%) | 514 | 45 | 98 |
| zyx.mega.YersiniaPestis 3.0 | 7136 | 352 | 7097 | 7093 (99.4%) | 43 (0.6%) | 4 (0.1%) | 603 | 70 | 191 |
| ags.Midboss 1q.fast | 7573 | 28 | 7573 | 7571 (100.0%) | 2 (0.0%) | 2 (0.0%) | 402 | 120 | 150 |
| pez.rumble.CassiusClay 2rho.02no | 14877 | 7 | 14899 | 14869 (99.9%) | 8 (0.1%) | 30 (0.2%) | 1552 | 138 | 265 |
| Krabb.sliNk.Garm 0.9u | 7785 | 5 | 7786 | 7784 (100.0%) | 1 (0.0%) | 2 (0.0%) | 509 | 65 | 70 |
| axeBots.SilverSurfer 2.53.33fix | 5712 | 4 | 5790 | 5711 (100.0%) | 1 (0.0%) | 79 (1.4%) | 1145 | 69 | 114 |
| mn.Combat 3.25.0 | 16002 | 8 | 16003 | 16000 (100.0%) | 2 (0.0%) | 3 (0.0%) | 1323 | 176 | 183 |
| cs.s2.Seraphim 2.3.1 | 6654 | 20 | 6655 | 6654 (100.0%) | 0 (0.0%) | 1 (0.0%) | 316 | 54 | 83 |
| fromHell.CHCl3 1.4.2 | 6327 | 12 | 6329 | 6327 (100.0%) | 0 (0.0%) | 2 (0.0%) | 467 | 72 | 70 |
| jk.mini.CunobelinDC 1.2 | 13581 | 145 | 13581 | 13581 (100.0%) | 0 (0.0%) | 0 (0.0%) | 12 | 0 | 21 |
| sheldor.mini.Foilist 1.3.1 | 14486 | 8 | 14483 | 14479 (100.0%) | 7 (0.0%) | 4 (0.0%) | 1092 | 115 | 253 |
| florent.test.Toad 0.14t | 6990 | 5 | 6989 | 6983 (99.9%) | 7 (0.1%) | 6 (0.1%) | 539 | 54 | 202 |
| ar.horizon.Horizon 1.2.2 | 9106 | 9 | 9107 | 9105 (100.0%) | 1 (0.0%) | 2 (0.0%) | 599 | 98 | 106 |
| cjm.chalk.Chalk 2.6.Be | 7977 | 0 | 7977 | 7977 (100.0%) | 0 (0.0%) | 0 (0.0%) | 142 | 1 | 25 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 8836 | 263 | 8836 | 8836 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 0 | 18 |
| sheldor.mini.FoilistMC 1.0 | 12873 | 36 | 12876 | 12872 (100.0%) | 1 (0.0%) | 4 (0.0%) | 957 | 110 | 174 |
| pez.rumble.Ali 0.4.9 | 8203 | 95 | 8200 | 8192 (99.9%) | 11 (0.1%) | 8 (0.1%) | 1903 | 36 | 77 |
| catcat20.Lambda 0.017 | 8589 | 143 | 8570 | 8569 (99.8%) | 20 (0.2%) | 1 (0.0%) | 579 | 81 | 135 |
| florent.XSeries.X2 0.17 | 6827 | 4 | 6824 | 6824 (100.0%) | 3 (0.0%) | 0 (0.0%) | 570 | 58 | 116 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 20018 | 2125 (10.6%) | 19720 |
| jd.Nullstride 2.3.3 | 19562 | 2112 (10.8%) | 18354 |
| jk.mega.DrussGT 3.1.16 | 35945 | 4526 (12.6%) | 35823 |
| oog.mega.saguaro.Saguaro 1.0 | 5262 | 387 (7.4%) | 5240 |
| aaa.r.ScalarR 0.005h.053-noshield | 28760 | 3290 (11.4%) | 28469 |
| voidious.Diamond 1.8.22 | 30974 | 3317 (10.7%) | 30471 |
| cb.fire.Firestarter 2.0f | 32835 | 3019 (9.2%) | 31797 |
| dsekercioglu.mega.Raven 3.56j8 | 12739 | 1237 (9.7%) | 12222 |
| xander.cat.XanderCat 12.9 | 14958 | 1311 (8.8%) | 14123 |
| lxx.Tomcat 3.68 | 24436 | 2796 (11.4%) | 24114 |
| rsalesc.mega.Knight 0.6.28 | 36212 | 4225 (11.7%) | 35820 |
| aw.Gilgalad 1.99.5c | 20199 | 2077 (10.3%) | 19385 |
| pc.Wavelet 1.5 | 17322 | 1596 (9.2%) | 16424 |
| gh.GresSuffurd 0.4.13 | 10734 | 1042 (9.7%) | 7893 |
| kc.serpent.WaveSerpent 2.11 | 10500 | 748 (7.1%) | 5324 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 12930 | 1199 (9.3%) | 11234 |
| cs.Nene 1.0.5 | 8514 | 783 (9.2%) | 8000 |
| jk.melee.Neuromancer 7.12 | 20546 | 2076 (10.1%) | 20192 |
| voidious.Dookious 1.573c | 9006 | 622 (6.9%) | 6569 |
| davidalves.Phoenix 1.02 | 129 | 5775 (4476.7%) | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 32410 | 2999 (9.3%) | 32385 |
| cb.Domogled 1.2 | 29519 | 2350 (8.0%) | 28445 |
| mue.Ascendant 1.2.27 | 7744 | 683 (8.8%) | 7396 |
| abc.Shadow 3.83c | 8728 | 795 (9.1%) | 7729 |
| darkcanuck.Pris 0.92 | 7081 | 543 (7.7%) | 6165 |
| fromHell.BlackBox 0.0.2 | 7689 | 702 (9.1%) | 7157 |
| jk.precise.Wintermute 0.8 | 8764 | 905 (10.3%) | 7456 |
| kc.serpent.Hydra 0.21 | 143 | 9052 (6330.1%) | 0 |
| davidalves.Firebird 0.25 | 124 | 6265 (5052.4%) | 0 |
| pulsar.PulsarMax 0.8.9 | 8740 | 762 (8.7%) | 7820 |
| zyx.mega.YersiniaPestis 3.0 | 8999 | 619 (6.9%) | 7495 |
| ags.Midboss 1q.fast | 7762 | 764 (9.8%) | 6794 |
| pez.rumble.CassiusClay 2rho.02no | 16266 | 1505 (9.3%) | 13556 |
| Krabb.sliNk.Garm 0.9u | 8643 | 806 (9.3%) | 7865 |
| axeBots.SilverSurfer 2.53.33fix | 8645 | 518 (6.0%) | 5673 |
| mn.Combat 3.25.0 | 16709 | 1649 (9.9%) | 16233 |
| cs.s2.Seraphim 2.3.1 | 7455 | 616 (8.3%) | 6427 |
| fromHell.CHCl3 1.4.2 | 7357 | 602 (8.2%) | 4008 |
| jk.mini.CunobelinDC 1.2 | 372 | 13443 (3613.7%) | 0 |
| sheldor.mini.Foilist 1.3.1 | 14886 | 1292 (8.7%) | 14030 |
| florent.test.Toad 0.14t | 8685 | 692 (8.0%) | 6064 |
| ar.horizon.Horizon 1.2.2 | 10109 | 870 (8.6%) | 8685 |
| cjm.chalk.Chalk 2.6.Be | 142 | 7977 (5617.6%) | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 323 | 8822 (2731.3%) | 0 |
| sheldor.mini.FoilistMC 1.0 | 12918 | 1173 (9.1%) | 12512 |
| pez.rumble.Ali 0.4.9 | 5166 | 5127 (99.2%) | 2224 |
| catcat20.Lambda 0.017 | 9489 | 801 (8.4%) | 8204 |
| florent.XSeries.X2 0.17 | 8818 | 586 (6.6%) | 6892 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 534 | 650 | 1727 | 20.0 / 29.3 | 0 | 364 | 110 |
| jd.Nullstride 2.3.3 | 650 | 535 | 650 | 1750 | 19.8 / 26.8 | 0 | 279 | 23 |
| jk.mega.DrussGT 3.1.16 | 650 | 514 | 650 | 3030 | 27.2 / 31.0 | 8 | 2613 | 217 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 435 | 450 | 527 | 44.1 / 26.3 | 612 | 1848 | 377 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 483 | 650 | 2412 | 22.7 / 34.1 | 0 | 1155 | 2 |
| voidious.Diamond 1.8.22 | 650 | 535 | 650 | 2633 | 21.4 / 32.6 | 71 | 11306 | 276 |
| cb.fire.Firestarter 2.0f | 650 | 541 | 650 | 2736 | 27.7 / 29.9 | 89 | 1727 | 149 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 455 | 650 | 1126 | 23.8 / 36.1 | 94 | 9824 | 1157 |
| xander.cat.XanderCat 12.9 | 650 | 447 | 650 | 1345 | 34.8 / 32.7 | 286 | 897 | 99 |
| lxx.Tomcat 3.68 | 650 | 510 | 650 | 2060 | 28.3 / 35.9 | 138 | 17713 | 5 |
| rsalesc.mega.Knight 0.6.28 | 650 | 507 | 650 | 3063 | 32.1 / 30.2 | 337 | 5797 | 54 |
| aw.Gilgalad 1.99.5c | 650 | 476 | 650 | 1708 | 25.9 / 37.0 | 280 | 12916 | 40 |
| pc.Wavelet 1.5 | 650 | 435 | 650 | 1523 | 33.4 / 29.7 | 285 | 2197 | 4 |
| gh.GresSuffurd 0.4.13 | 650 | 462 | 650 | 981 | 30.5 / 34.3 | 266 | 1778 | 66 |
| kc.serpent.WaveSerpent 2.11 | 650 | 477 | 650 | 946 | 22.9 / 35.3 | 33 | 5981 | 1 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 461 | 650 | 1151 | 32.6 / 29.2 | 173 | 10492 | 112 |
| cs.Nene 1.0.5 | 650 | 470 | 650 | 779 | 22.1 / 36.5 | 52 | 4561 | 1260 |
| jk.melee.Neuromancer 7.12 | 650 | 528 | 650 | 1745 | 31.8 / 34.2 | 149 | 9589 | 14 |
| voidious.Dookious 1.573c | 650 | 485 | 650 | 834 | 23.6 / 32.4 | 92 | 4044 | 2351 |
| davidalves.Phoenix 1.02 | 650 | 398 | 650 | 1090 | 0.0 / 0.5 | 0 | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 650 | 501 | 650 | 2754 | 40.5 / 25.8 | 726 | 4838 | 70 |
| cb.Domogled 1.2 | 650 | 548 | 588 | 2480 | 40.4 / 19.5 | 381 | 1194 | 199 |
| mue.Ascendant 1.2.27 | 650 | 414 | 650 | 725 | 27.1 / 36.6 | 120 | 3208 | 0 |
| abc.Shadow 3.83c | 650 | 459 | 650 | 818 | 22.1 / 39.9 | 59 | 5528 | 87 |
| darkcanuck.Pris 0.92 | 650 | 411 | 650 | 686 | 34.7 / 34.8 | 241 | 1579 | 592 |
| fromHell.BlackBox 0.0.2 | 650 | 418 | 444 | 752 | 35.7 / 32.1 | 1872 | 775 | 58 |
| jk.precise.Wintermute 0.8 | 650 | 454 | 650 | 817 | 32.8 / 31.7 | 57 | 4212 | 223 |
| kc.serpent.Hydra 0.21 | 650 | 354 | 650 | 1234 | 0.0 / 0.0 | 0 | 0 | 0 |
| davidalves.Firebird 0.25 | 650 | 396 | 650 | 1118 | 0.0 / 2.5 | 0 | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 650 | 484 | 650 | 805 | 23.2 / 34.9 | 43 | 5296 | 1 |
| zyx.mega.YersiniaPestis 3.0 | 650 | 444 | 650 | 825 | 25.8 / 37.0 | 109 | 4326 | 45 |
| ags.Midboss 1q.fast | 650 | 409 | 638 | 745 | 43.1 / 29.1 | 612 | 2434 | 372 |
| pez.rumble.CassiusClay 2rho.02no | 650 | 478 | 650 | 1449 | 39.1 / 29.4 | 569 | 1188 | 36 |
| Krabb.sliNk.Garm 0.9u | 650 | 526 | 588 | 796 | 27.7 / 27.9 | 160 | 3665 | 2386 |
| axeBots.SilverSurfer 2.53.33fix | 650 | 484 | 650 | 815 | 36.6 / 30.2 | 247 | 678 | 72 |
| mn.Combat 3.25.0 | 650 | 481 | 650 | 1439 | 27.4 / 32.7 | 232 | 11703 | 19 |
| cs.s2.Seraphim 2.3.1 | 650 | 479 | 650 | 711 | 31.9 / 30.1 | 221 | 1883 | 591 |
| fromHell.CHCl3 1.4.2 | 650 | 421 | 475 | 726 | 36.9 / 27.5 | 767 | 1282 | 0 |
| jk.mini.CunobelinDC 1.2 | 650 | 536 | 650 | 1258 | 0.1 / 1.0 | 0 | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 650 | 567 | 650 | 1302 | 30.5 / 33.3 | 181 | 11503 | 24 |
| florent.test.Toad 0.14t | 650 | 496 | 650 | 806 | 29.8 / 32.9 | 168 | 3061 | 165 |
| ar.horizon.Horizon 1.2.2 | 650 | 480 | 650 | 926 | 31.1 / 32.8 | 98 | 3502 | 0 |
| cjm.chalk.Chalk 2.6.Be | 650 | 407 | 650 | 1217 | 0.0 / 0.0 | 0 | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 650 | 351 | 650 | 912 | 0.1 / 0.8 | 0 | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 650 | 575 | 650 | 1150 | 31.9 / 27.3 | 295 | 7212 | 1309 |
| pez.rumble.Ali 0.4.9 | 650 | 405 | 650 | 1172 | 8.2 / 17.7 | 9 | 2138 | 11 |
| catcat20.Lambda 0.017 | 650 | 534 | 650 | 870 | 32.6 / 28.9 | 222 | 2849 | 0 |
| florent.XSeries.X2 0.17 | 650 | 485 | 588 | 816 | 30.1 / 33.9 | 167 | 3222 | 4 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 9.3% | 213 | 81 | 3 | 142.4 | 2118 / 2125 (100%) | 0 | 0 |
| jd.Nullstride 2.3.3 | 8.9% | 220 | 66 | 3 | 136.7 | 2107 / 2112 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.7% | 336 | 92 | 3 | 256.7 | 4523 / 4526 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.9% | 58 | 28 | 3 | 33.5 | 386 / 387 (100%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 11.2% | 284 | 72 | 3 | 201.7 | 3290 / 3290 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 9.4% | 264 | 99 | 3 | 217.2 | 3311 / 3317 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 9.6% | 241 | 107 | 3 | 204.6 | 3012 / 3019 (100%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 9.6% | 162 | 778 | 3 | 84.3 | 1234 / 1237 (100%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 9.1% | 187 | 57 | 3 | 87.4 | 1308 / 1311 (100%) | 0 | 0 |
| lxx.Tomcat 3.68 | 10.4% | 300 | 70 | 3 | 170.0 | 2794 / 2796 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 10.4% | 304 | 99 | 3 | 255.5 | 4220 / 4225 (100%) | 0 | 0 |
| aw.Gilgalad 1.99.5c | 11.0% | 295 | 74 | 3 | 140.0 | 2074 / 2077 (100%) | 0 | 0 |
| pc.Wavelet 1.5 | 9.5% | 194 | 67 | 3 | 103.4 | 1592 / 1596 (100%) | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 8.9% | 206 | 54 | 3 | 71.9 | 1038 / 1042 (100%) | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 8.1% | 95 | 59 | 3 | 56.6 | 747 / 748 (100%) | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 8.2% | 164 | 55 | 3 | 78.1 | 1196 / 1199 (100%) | 0 | 0 |
| cs.Nene 1.0.5 | 7.9% | 105 | 44 | 3 | 54.3 | 781 / 783 (100%) | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 10.3% | 273 | 62 | 3 | 135.2 | 2071 / 2076 (100%) | 0 | 0 |
| voidious.Dookious 1.573c | 7.3% | 100 | 57 | 3 | 51.6 | 621 / 622 (100%) | 0 | 0 |
| davidalves.Phoenix 1.02 | 0.1% | 48 | 56 | 3 | 0.0 | 0 / 5775 (0%) | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 10.2% | 271 | 106 | 3 | 197.7 | 2997 / 2999 (100%) | 0 | 0 |
| cb.Domogled 1.2 | 7.6% | 244 | 96 | 3 | 160.0 | 2334 / 2350 (99%) | 0 | 0 |
| mue.Ascendant 1.2.27 | 8.0% | 97 | 44 | 3 | 47.8 | 683 / 683 (100%) | 0 | 0 |
| abc.Shadow 3.83c | 9.1% | 137 | 39 | 3 | 55.7 | 793 / 795 (100%) | 0 | 0 |
| darkcanuck.Pris 0.92 | 8.4% | 76 | 208 | 3 | 44.3 | 542 / 543 (100%) | 0 | 0 |
| fromHell.BlackBox 0.0.2 | 9.6% | 139 | 37 | 3 | 54.3 | 697 / 702 (99%) | 0 | 0 |
| jk.precise.Wintermute 0.8 | 8.2% | 145 | 47 | 3 | 59.1 | 901 / 905 (100%) | 0 | 0 |
| kc.serpent.Hydra 0.21 | 0.0% | 50 | 7 | 3 | 0.0 | 0 / 9052 (0%) | 0 | 0 |
| davidalves.Firebird 0.25 | 0.5% | 56 | 10 | 3 | 0.0 | 0 / 6265 (0%) | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 7.8% | 122 | 45 | 3 | 53.4 | 761 / 762 (100%) | 0 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 8.3% | 159 | 39 | 3 | 50.4 | 618 / 619 (100%) | 0 | 0 |
| ags.Midboss 1q.fast | 9.0% | 180 | 57 | 3 | 53.9 | 762 / 764 (100%) | 0 | 0 |
| pez.rumble.CassiusClay 2rho.02no | 8.5% | 212 | 249 | 3 | 103.1 | 1503 / 1505 (100%) | 0 | 0 |
| Krabb.sliNk.Garm 0.9u | 6.6% | 108 | 51 | 3 | 55.5 | 805 / 806 (100%) | 0 | 0 |
| axeBots.SilverSurfer 2.53.33fix | 7.4% | 138 | 55 | 3 | 40.8 | 517 / 518 (100%) | 0 | 0 |
| mn.Combat 3.25.0 | 9.3% | 270 | 68 | 3 | 114.0 | 1648 / 1649 (100%) | 0 | 0 |
| cs.s2.Seraphim 2.3.1 | 7.0% | 128 | 40 | 3 | 47.2 | 614 / 616 (100%) | 0 | 0 |
| fromHell.CHCl3 1.4.2 | 7.0% | 115 | 38 | 3 | 44.5 | 602 / 602 (100%) | 0 | 0 |
| jk.mini.CunobelinDC 1.2 | 1.1% | 68 | 8 | 3 | 0.0 | 0 / 13443 (0%) | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 9.3% | 263 | 51 | 3 | 102.4 | 1287 / 1292 (100%) | 0 | 0 |
| florent.test.Toad 0.14t | 8.0% | 145 | 51 | 3 | 49.8 | 692 / 692 (100%) | 0 | 0 |
| ar.horizon.Horizon 1.2.2 | 8.1% | 147 | 50 | 3 | 64.3 | 870 / 870 (100%) | 0 | 0 |
| cjm.chalk.Chalk 2.6.Be | 0.0% | 53 | 7 | 3 | 0.0 | 0 / 7977 (0%) | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 2.2% | 50 | 9 | 3 | 0.0 | 0 / 8822 (0%) | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 7.6% | 204 | 54 | 3 | 91.2 | 1171 / 1173 (100%) | 0 | 0 |
| pez.rumble.Ali 0.4.9 | 3.9% | 100 | 22 | 3 | 23.0 | 292 / 5127 (6%) | 0 | 0 |
| catcat20.Lambda 0.017 | 7.6% | 168 | 65 | 3 | 61.1 | 799 / 801 (100%) | 0 | 0 |
| florent.XSeries.X2 0.17 | 7.9% | 130 | 64 | 3 | 48.1 | 584 / 586 (100%) | 0 | 0 |

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
| Krabb.sliNk.Garm 0.9u | hadur2.Hadur 3.13hjswpa | 4 | 75.0% ± 30.5 | 83.6% ± 10.7 | +8.6 ± 28.4 | 62.2% ± 7.5 | 57.9% ± 11.4 | -4.2 ± 18.6 |
| Krabb.sliNk.Garm 0.9u | hadur2.Hadur 3.13hjsw | 4 | 90.0% ± 18.4 | 75.0% ± 15.9 | -15.0 ± 15.9 | 54.1% ± 5.1 | 47.8% ± 11.1 | -6.3 ± 9.3 |
| aaa.r.ScalarR 0.005h.053-noshield | hadur2.Hadur 3.13hjswpa | 4 | 15.0% ± 30.5 | 20.0% ± 0.0 | +5.0 ± 30.5 | 53.7% ± 20.2 | 37.9% ± 8.9 | -15.8 ± 22.7 |
| aaa.r.ScalarR 0.005h.053-noshield | hadur2.Hadur 3.13hjsw | 4 | 30.0% ± 31.8 | 15.0% ± 20.5 | -15.0 ± 33.1 | 45.6% ± 7.6 | 40.1% ± 5.6 | -5.5 ± 9.7 |
| abc.Shadow 3.83c | hadur2.Hadur 3.13hjswpa | 4 | 55.0% ± 30.5 | 52.2% ± 35.2 | -2.8 ± 55.0 | 52.7% ± 7.3 | 34.8% ± 10.0 | -17.8 ± 14.2 |
| abc.Shadow 3.83c | hadur2.Hadur 3.13hjsw | 4 | 65.0% ± 30.5 | 58.3% ± 16.9 | -6.7 ± 41.0 | 42.0% ± 8.9 | 32.9% ± 5.6 | -9.1 ± 10.9 |
| ags.Midboss 1q.fast | hadur2.Hadur 3.13hjswpa | 4 | 70.0% ± 41.1 | 76.1% ± 16.5 | +6.1 ± 56.2 | 61.1% ± 11.8 | 63.7% ± 3.8 | +2.6 ± 15.1 |
| ags.Midboss 1q.fast | hadur2.Hadur 3.13hjsw | 4 | 80.0% ± 26.0 | 90.0% ± 13.0 | +10.0 ± 34.4 | 52.7% ± 5.9 | 59.5% ± 15.4 | +6.8 ± 17.0 |
| ar.horizon.Horizon 1.2.2 | hadur2.Hadur 3.13hjswpa | 4 | 45.0% ± 30.5 | 65.8% ± 6.7 | +20.8 ± 32.5 | 55.2% ± 8.8 | 44.0% ± 17.1 | -11.2 ± 20.4 |
| ar.horizon.Horizon 1.2.2 | hadur2.Hadur 3.13hjsw | 4 | 80.0% ± 0.0 | 70.0% ± 13.0 | -10.0 ± 13.0 | 58.2% ± 4.0 | 44.1% ± 12.9 | -14.1 ± 14.7 |
| aw.Gilgalad 1.99.5c | hadur2.Hadur 3.13hjswpa | 4 | 20.0% ± 45.0 | 48.1% ± 28.4 | +28.1 ± 71.0 | 47.5% ± 25.3 | 39.6% ± 14.0 | -8.0 ± 32.8 |
| aw.Gilgalad 1.99.5c | hadur2.Hadur 3.13hjsw | 4 | 60.0% ± 26.0 | 70.0% ± 13.0 | +10.0 ± 39.0 | 38.7% ± 6.7 | 45.5% ± 8.7 | +6.7 ± 11.5 |
| axeBots.SilverSurfer 2.53.33fix | hadur2.Hadur 3.13hjswpa | 4 | 50.0% ± 31.8 | 76.7% ± 24.9 | +26.7 ± 56.6 | 58.7% ± 8.9 | 59.2% ± 4.2 | +0.5 ± 11.8 |
| axeBots.SilverSurfer 2.53.33fix | hadur2.Hadur 3.13hjsw | 4 | 85.0% ± 30.5 | 76.4% ± 29.7 | -8.6 ± 34.7 | 54.7% ± 9.5 | 54.9% ± 7.9 | +0.3 ± 14.8 |
| catcat20.Lambda 0.017 | hadur2.Hadur 3.13hjswpa | 4 | 50.0% ± 41.1 | 73.9% ± 29.7 | +23.9 ± 21.7 | 56.1% ± 22.4 | 60.5% ± 10.2 | +4.3 ± 12.6 |
| catcat20.Lambda 0.017 | hadur2.Hadur 3.13hjsw | 4 | 85.0% ± 15.9 | 87.5% ± 8.0 | +2.5 ± 15.2 | 51.3% ± 27.1 | 52.3% ± 4.8 | +1.0 ± 30.7 |
| cb.Domogled 1.2 | hadur2.Hadur 3.13hjswpa | 4 | 45.0% ± 15.9 | 57.5% ± 23.9 | +12.5 ± 32.8 | 68.9% ± 14.1 | 64.3% ± 16.3 | -4.6 ± 18.2 |
| cb.Domogled 1.2 | hadur2.Hadur 3.13hjsw | 4 | 20.0% ± 45.0 | 60.0% ± 13.0 | +40.0 ± 43.1 | 62.0% ± 14.5 | 61.8% ± 19.1 | -0.2 ± 28.8 |
| cb.fire.Firestarter 2.0f | hadur2.Hadur 3.13hjswpa | 4 | 5.0% ± 15.9 | 65.0% ± 27.6 | +60.0 ± 22.5 | 57.4% ± 21.7 | 56.8% ± 5.5 | -0.7 ± 17.8 |
| cb.fire.Firestarter 2.0f | hadur2.Hadur 3.13hjsw | 4 | 20.0% ± 26.0 | 35.0% ± 30.5 | +15.0 ± 47.7 | 47.8% ± 17.3 | 47.1% ± 4.5 | -0.6 ± 21.7 |
| cjm.chalk.Chalk 2.6.Be | hadur2.Hadur 3.13hjswpa | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | - | - | n/a |
| cjm.chalk.Chalk 2.6.Be | hadur2.Hadur 3.13hjsw | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | - | - | n/a |
| cs.Nene 1.0.5 | hadur2.Hadur 3.13hjswpa | 4 | 50.0% ± 18.4 | 72.5% ± 32.8 | +22.5 ± 47.5 | 52.1% ± 3.1 | 35.8% ± 8.5 | -16.3 ± 10.2 |
| cs.Nene 1.0.5 | hadur2.Hadur 3.13hjsw | 4 | 75.0% ± 30.5 | 75.0% ± 15.9 | +0.0 ± 26.0 | 40.4% ± 8.4 | 38.4% ± 9.1 | -2.0 ± 5.3 |
| cs.s2.Seraphim 2.3.1 | hadur2.Hadur 3.13hjswpa | 4 | 55.0% ± 47.7 | 77.5% ± 27.2 | +22.5 ± 61.5 | 52.7% ± 11.8 | 48.3% ± 18.6 | -4.3 ± 23.8 |
| cs.s2.Seraphim 2.3.1 | hadur2.Hadur 3.13hjsw | 4 | 70.0% ± 31.8 | 77.2% ± 19.4 | +7.2 ± 50.5 | 42.2% ± 9.5 | 47.9% ± 13.3 | +5.7 ± 22.7 |
| darkcanuck.Pris 0.92 | hadur2.Hadur 3.13hjswpa | 4 | 25.0% ± 15.9 | 76.7% ± 29.6 | +51.7 ± 26.8 | 47.4% ± 7.0 | 53.9% ± 12.8 | +6.5 ± 14.7 |
| darkcanuck.Pris 0.92 | hadur2.Hadur 3.13hjsw | 4 | 75.0% ± 30.5 | 74.4% ± 8.3 | -0.6 ± 34.4 | 49.8% ± 12.5 | 49.8% ± 10.7 | +0.0 ± 23.0 |
| davidalves.Firebird 0.25 | hadur2.Hadur 3.13hjswpa | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% | 0.0% ± 0.0 | +0.0 |
| davidalves.Firebird 0.25 | hadur2.Hadur 3.13hjsw | 4 | 100.0% ± 0.0 | 95.0% ± 9.2 | -5.0 ± 9.2 | 0.0% ± 0.0 | 0.0% ± 0.0 | +0.0 ± 0.0 |
| davidalves.Phoenix 1.02 | hadur2.Hadur 3.13hjswpa | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% ± 0.0 | - | n/a |
| davidalves.Phoenix 1.02 | hadur2.Hadur 3.13hjsw | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% ± 0.0 | - | n/a |
| dsekercioglu.mega.Raven 3.56j8 | hadur2.Hadur 3.13hjswpa | 4 | 25.0% ± 30.5 | 62.5% ± 19.6 | +37.5 ± 31.4 | 46.0% ± 8.1 | 42.0% ± 7.1 | -4.0 ± 5.1 |
| dsekercioglu.mega.Raven 3.56j8 | hadur2.Hadur 3.13hjsw | 4 | 85.0% ± 15.9 | 74.4% ± 15.4 | -10.6 ± 19.4 | 57.0% ± 11.1 | 37.3% ± 6.0 | -19.7 ± 15.8 |
| dsekercioglu.mega.WhiteFang 2.8.1 | hadur2.Hadur 3.13hjswpa | 4 | 65.0% ± 15.9 | 81.9% ± 8.7 | +16.9 ± 19.9 | 61.2% ± 5.0 | 49.0% ± 8.4 | -12.3 ± 7.1 |
| dsekercioglu.mega.WhiteFang 2.8.1 | hadur2.Hadur 3.13hjsw | 4 | 90.0% ± 18.4 | 81.9% ± 8.7 | -8.1 ± 24.9 | 58.0% ± 4.8 | 51.5% ± 10.7 | -6.5 ± 9.0 |
| florent.XSeries.X2 0.17 | hadur2.Hadur 3.13hjswpa | 4 | 60.0% ± 36.7 | 77.5% ± 15.2 | +17.5 ± 35.3 | 51.2% ± 6.7 | 54.0% ± 15.9 | +2.8 ± 16.4 |
| florent.XSeries.X2 0.17 | hadur2.Hadur 3.13hjsw | 4 | 75.0% ± 40.0 | 84.7% ± 15.6 | +9.7 ± 45.4 | 45.2% ± 9.4 | 50.7% ± 13.8 | +5.4 ± 20.8 |
| florent.test.Toad 0.14t | hadur2.Hadur 3.13hjswpa | 4 | 55.0% ± 30.5 | 74.2% ± 10.9 | +19.2 ± 30.1 | 51.6% ± 11.5 | 52.3% ± 4.7 | +0.6 ± 15.8 |
| florent.test.Toad 0.14t | hadur2.Hadur 3.13hjsw | 4 | 75.0% ± 40.0 | 80.0% ± 29.1 | +5.0 ± 58.8 | 40.1% ± 4.5 | 47.9% ± 5.7 | +7.8 ± 9.6 |
| fromHell.BlackBox 0.0.2 | hadur2.Hadur 3.13hjswpa | 4 | 60.0% ± 26.0 | 58.6% ± 24.9 | -1.4 ± 48.0 | 53.8% ± 12.7 | 60.4% ± 5.7 | +6.6 ± 17.4 |
| fromHell.BlackBox 0.0.2 | hadur2.Hadur 3.13hjsw | 4 | 70.0% ± 31.8 | 70.0% ± 13.0 | +0.0 ± 43.1 | 48.8% ± 15.2 | 52.7% ± 6.9 | +3.9 ± 15.6 |
| fromHell.CHCl3 1.4.2 | hadur2.Hadur 3.13hjswpa | 4 | 70.0% ± 18.4 | 81.7% ± 15.2 | +11.7 ± 6.5 | 59.9% ± 8.4 | 68.3% ± 11.5 | +8.4 ± 9.2 |
| fromHell.CHCl3 1.4.2 | hadur2.Hadur 3.13hjsw | 4 | 83.7% ± 17.6 | 92.5% ± 15.2 | +8.8 ± 32.1 | 58.4% ± 6.4 | 61.6% ± 11.4 | +3.2 ± 11.0 |
| gh.GresSuffurd 0.4.13 | hadur2.Hadur 3.13hjswpa | 4 | 30.0% ± 31.8 | 53.6% ± 12.3 | +23.6 ± 37.5 | 48.6% ± 14.8 | 52.4% ± 18.7 | +3.8 ± 20.5 |
| gh.GresSuffurd 0.4.13 | hadur2.Hadur 3.13hjsw | 4 | 60.0% ± 26.0 | 65.0% ± 15.9 | +5.0 ± 30.5 | 40.5% ± 10.1 | 45.2% ± 9.3 | +4.7 ± 16.6 |
| jd.Nullstride 2.3.3 | hadur2.Hadur 3.13hjswpa | 4 | 5.0% ± 15.9 | 18.6% ± 25.1 | +13.6 ± 22.4 | 41.7% ± 23.4 | 42.4% ± 7.1 | +0.7 ± 20.3 |
| jd.Nullstride 2.3.3 | hadur2.Hadur 3.13hjsw | 4 | 15.0% ± 30.5 | 16.7% ± 10.2 | +1.7 ± 34.9 | 42.6% ± 16.2 | 41.4% ± 5.3 | -1.2 ± 20.1 |
| jk.mega.DrussGT 3.1.16 | hadur2.Hadur 3.13hjswpa | 4 | 30.0% ± 31.8 | 53.9% ± 19.9 | +23.9 ± 21.7 | 63.7% ± 24.9 | 43.2% ± 4.2 | -20.5 ± 27.2 |
| jk.mega.DrussGT 3.1.16 | hadur2.Hadur 3.13hjsw | 4 | 40.0% ± 26.0 | 39.4% ± 27.0 | -0.6 ± 43.1 | 53.6% ± 14.5 | 43.5% ± 10.8 | -10.1 ± 16.4 |
| jk.melee.Neuromancer 7.12 | hadur2.Hadur 3.13hjswpa | 4 | 40.0% ± 26.0 | 55.0% ± 42.1 | +15.0 ± 20.5 | 56.6% ± 8.1 | 46.4% ± 8.3 | -10.2 ± 14.2 |
| jk.melee.Neuromancer 7.12 | hadur2.Hadur 3.13hjsw | 4 | 50.0% ± 18.4 | 52.5% ± 20.0 | +2.5 ± 35.3 | 57.4% ± 8.7 | 48.4% ± 4.8 | -9.1 ± 12.3 |
| jk.mini.CunobelinDC 1.2 | hadur2.Hadur 3.13hjswpa | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 5.3% ± 8.7 | 9.6% ± 3.3 | +4.3 ± 9.6 |
| jk.mini.CunobelinDC 1.2 | hadur2.Hadur 3.13hjsw | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 5.5% ± 10.1 | 3.1% ± 9.9 | -2.3 ± 10.4 |
| jk.precise.Wintermute 0.8 | hadur2.Hadur 3.13hjswpa | 4 | 60.0% ± 36.7 | 79.2% ± 15.2 | +19.2 ± 48.7 | 58.4% ± 5.8 | 53.6% ± 13.5 | -4.8 ± 15.0 |
| jk.precise.Wintermute 0.8 | hadur2.Hadur 3.13hjsw | 4 | 95.0% ± 15.9 | 84.7% ± 15.6 | -10.3 ± 26.0 | 54.4% ± 10.9 | 47.1% ± 7.6 | -7.3 ± 15.0 |
| kc.mega.BeepBoop 2.0 | hadur2.Hadur 3.13hjswpa | 4 | 10.0% ± 18.4 | 25.0% ± 15.9 | +15.0 ± 15.9 | 46.3% ± 3.5 | 45.4% ± 7.2 | -0.9 ± 8.5 |
| kc.mega.BeepBoop 2.0 | hadur2.Hadur 3.13hjsw | 4 | 0.0% ± 0.0 | 12.5% ± 23.9 | +12.5 ± 23.9 | 36.8% ± 11.1 | 40.1% ± 4.2 | +3.3 ± 11.1 |
| kc.serpent.Hydra 0.21 | hadur2.Hadur 3.13hjswpa | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | - | - | n/a |
| kc.serpent.Hydra 0.21 | hadur2.Hadur 3.13hjsw | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | - | - | n/a |
| kc.serpent.WaveSerpent 2.11 | hadur2.Hadur 3.13hjswpa | 4 | 65.0% ± 30.5 | 66.9% ± 18.9 | +1.9 ± 46.0 | 55.2% ± 9.2 | 38.6% ± 6.0 | -16.6 ± 4.9 |
| kc.serpent.WaveSerpent 2.11 | hadur2.Hadur 3.13hjsw | 4 | 70.0% ± 31.8 | 77.5% ± 41.8 | +7.5 ± 35.3 | 43.6% ± 12.5 | 39.9% ± 8.5 | -3.8 ± 14.6 |
| lxx.Tomcat 3.68 | hadur2.Hadur 3.13hjswpa | 4 | 0.0% ± 0.0 | 60.0% ± 26.0 | +60.0 ± 26.0 | 43.7% ± 13.8 | 41.9% ± 5.5 | -1.8 ± 9.5 |
| lxx.Tomcat 3.68 | hadur2.Hadur 3.13hjsw | 4 | 70.0% ± 18.4 | 69.2% ± 26.1 | -0.8 ± 40.5 | 51.0% ± 11.1 | 42.6% ± 12.2 | -8.4 ± 13.9 |
| mn.Combat 3.25.0 | hadur2.Hadur 3.13hjswpa | 4 | 25.0% ± 15.9 | 67.5% ± 23.9 | +42.5 ± 37.6 | 51.3% ± 7.6 | 43.5% ± 3.4 | -7.8 ± 10.0 |
| mn.Combat 3.25.0 | hadur2.Hadur 3.13hjsw | 4 | 75.0% ± 15.9 | 65.0% ± 20.5 | -10.0 ± 13.0 | 44.0% ± 11.5 | 38.7% ± 2.6 | -5.3 ± 12.2 |
| mue.Ascendant 1.2.27 | hadur2.Hadur 3.13hjswpa | 4 | 45.0% ± 30.5 | 65.8% ± 6.7 | +20.8 ± 34.2 | 51.5% ± 6.7 | 40.6% ± 9.4 | -10.8 ± 13.6 |
| mue.Ascendant 1.2.27 | hadur2.Hadur 3.13hjsw | 4 | 60.0% ± 26.0 | 82.5% ± 8.0 | +22.5 ± 32.8 | 43.5% ± 6.3 | 47.0% ± 10.1 | +3.5 ± 11.4 |
| oog.mega.saguaro.Saguaro 1.0 | hadur2.Hadur 3.13hjswpa | 4 | 85.0% ± 15.9 | 67.5% ± 35.3 | -17.5 ± 27.2 | 93.5% ± 4.3 | 56.8% ± 26.1 | -36.7 ± 24.8 |
| oog.mega.saguaro.Saguaro 1.0 | hadur2.Hadur 3.13hjsw | 4 | 95.0% ± 15.9 | 77.5% ± 23.9 | -17.5 ± 35.3 | 94.7% ± 6.3 | 48.8% ± 7.3 | -45.9 ± 10.5 |
| pc.Wavelet 1.5 | hadur2.Hadur 3.13hjswpa | 4 | 20.0% ± 26.0 | 48.3% ± 27.9 | +28.3 ± 50.8 | 51.0% ± 7.1 | 45.7% ± 5.6 | -5.3 ± 10.2 |
| pc.Wavelet 1.5 | hadur2.Hadur 3.13hjsw | 4 | 55.0% ± 65.6 | 45.0% ± 37.9 | -10.0 ± 89.1 | 53.5% ± 10.1 | 55.0% ± 40.4 | +1.5 ± 49.2 |
| pez.rumble.Ali 0.4.9 | hadur2.Hadur 3.13hjswpa | 4 | 100.0% ± 0.0 | 85.0% ± 15.9 | -15.0 ± 15.9 | 0.0% ± 0.0 | 38.9% ± 7.2 | +38.9 ± 7.2 |
| pez.rumble.Ali 0.4.9 | hadur2.Hadur 3.13hjsw | 4 | 100.0% ± 0.0 | 77.5% ± 8.0 | -22.5 ± 8.0 | 0.0% ± 0.0 | 36.7% ± 6.9 | +36.7 ± 6.9 |
| pez.rumble.CassiusClay 2rho.02no | hadur2.Hadur 3.13hjswpa | 4 | 45.0% ± 15.9 | 61.4% ± 16.2 | +16.4 ± 26.7 | 61.6% ± 8.0 | 63.2% ± 8.5 | +1.6 ± 13.5 |
| pez.rumble.CassiusClay 2rho.02no | hadur2.Hadur 3.13hjsw | 4 | 60.0% ± 0.0 | 58.3% ± 15.3 | -1.7 ± 15.3 | 57.2% ± 1.3 | 58.3% ± 8.6 | +1.1 ± 8.8 |
| pulsar.PulsarMax 0.8.9 | hadur2.Hadur 3.13hjswpa | 4 | 60.0% ± 26.0 | 76.9% ± 15.0 | +16.9 ± 39.7 | 52.5% ± 11.6 | 36.4% ± 7.0 | -16.1 ± 12.7 |
| pulsar.PulsarMax 0.8.9 | hadur2.Hadur 3.13hjsw | 4 | 80.0% ± 0.0 | 66.1% ± 18.6 | -13.9 ± 18.6 | 47.4% ± 12.1 | 36.1% ± 1.7 | -11.3 ± 13.5 |
| rsalesc.mega.Knight 0.6.28 | hadur2.Hadur 3.13hjswpa | 4 | 20.0% ± 26.0 | 62.5% ± 39.8 | +42.5 ± 47.5 | 60.7% ± 10.3 | 54.5% ± 4.7 | -6.2 ± 12.3 |
| rsalesc.mega.Knight 0.6.28 | hadur2.Hadur 3.13hjsw | 4 | 35.0% ± 30.5 | 65.6% ± 34.9 | +30.6 ± 37.9 | 54.0% ± 15.8 | 50.4% ± 2.5 | -3.6 ± 13.3 |
| rsalesc.roborio.Roborio 1.2.4 | hadur2.Hadur 3.13hjswpa | 4 | 45.0% ± 15.9 | 69.7% ± 25.3 | +24.7 ± 15.6 | 73.2% ± 13.5 | 59.7% ± 9.7 | -13.5 ± 10.5 |
| rsalesc.roborio.Roborio 1.2.4 | hadur2.Hadur 3.13hjsw | 4 | 60.0% ± 26.0 | 57.5% ± 16.9 | -2.5 ± 36.0 | 73.6% ± 10.0 | 56.7% ± 3.5 | -16.9 ± 9.2 |
| sheldor.mini.FoilistMC 1.0 | hadur2.Hadur 3.13hjswpa | 4 | 40.0% ± 26.0 | 78.9% ± 31.7 | +38.9 ± 25.9 | 55.0% ± 6.6 | 55.0% ± 15.5 | -0.0 ± 9.3 |
| sheldor.mini.FoilistMC 1.0 | hadur2.Hadur 3.13hjsw | 4 | 70.0% ± 18.4 | 87.2% ± 15.1 | +17.2 ± 19.4 | 46.2% ± 19.7 | 59.8% ± 10.2 | +13.7 ± 22.0 |
| sheldor.mini.Foilist 1.3.1 | hadur2.Hadur 3.13hjswpa | 4 | 65.0% ± 15.9 | 71.1% ± 28.3 | +6.1 ± 27.4 | 62.5% ± 12.5 | 55.4% ± 17.1 | -7.1 ± 15.2 |
| sheldor.mini.Foilist 1.3.1 | hadur2.Hadur 3.13hjsw | 4 | 70.0% ± 18.4 | 65.3% ± 30.1 | -4.7 ± 24.3 | 55.0% ± 11.8 | 45.6% ± 21.2 | -9.4 ± 22.5 |
| voidious.Diamond 1.8.22 | hadur2.Hadur 3.13hjswpa | 4 | 20.0% ± 26.0 | 58.9% ± 23.9 | +38.9 ± 35.3 | 53.0% ± 11.2 | 35.7% ± 9.8 | -17.3 ± 17.7 |
| voidious.Diamond 1.8.22 | hadur2.Hadur 3.13hjsw | 4 | 70.0% ± 41.1 | 61.1% ± 22.8 | -8.9 ± 63.9 | 48.6% ± 12.1 | 41.0% ± 9.1 | -7.6 ± 20.3 |
| voidious.Dookious 1.573c | hadur2.Hadur 3.13hjswpa | 4 | 35.0% ± 30.5 | 72.5% ± 23.9 | +37.5 ± 41.8 | 51.9% ± 5.3 | 41.6% ± 8.5 | -10.3 ± 11.3 |
| voidious.Dookious 1.573c | hadur2.Hadur 3.13hjsw | 4 | 75.0% ± 40.0 | 73.9% ± 16.1 | -1.1 ± 42.9 | 46.2% ± 7.5 | 40.4% ± 2.6 | -5.8 ± 5.6 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | hadur2.Hadur 3.13hjswpa | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 9.6% ± 21.3 | 7.1% ± 6.3 | -2.5 ± 17.0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | hadur2.Hadur 3.13hjsw | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 7.7% ± 21.0 | 6.1% ± 6.5 | -1.6 ± 18.6 |
| xander.cat.XanderCat 12.9 | hadur2.Hadur 3.13hjswpa | 4 | 60.0% ± 36.7 | 57.5% ± 16.9 | -2.5 ± 24.9 | 62.8% ± 12.7 | 54.1% ± 13.1 | -8.7 ± 13.6 |
| xander.cat.XanderCat 12.9 | hadur2.Hadur 3.13hjsw | 4 | 75.0% ± 30.5 | 58.3% ± 33.4 | -16.7 ± 63.7 | 52.7% ± 7.1 | 49.5% ± 8.6 | -3.2 ± 11.7 |
| zyx.mega.YersiniaPestis 3.0 | hadur2.Hadur 3.13hjswpa | 4 | 56.3% ± 44.7 | 64.2% ± 31.0 | +7.9 ± 43.1 | 53.3% ± 8.2 | 36.2% ± 11.8 | -17.1 ± 8.1 |
| zyx.mega.YersiniaPestis 3.0 | hadur2.Hadur 3.13hjsw | 4 | 80.0% ± 36.7 | 74.2% ± 21.4 | -5.8 ± 35.3 | 47.4% ± 15.7 | 39.3% ± 6.2 | -8.1 ± 17.0 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| Krabb.sliNk.Garm 0.9u | -15.0 ± 47.7 | +8.6 ± 13.8 | +8.1 ± 12.4 | +10.1 ± 8.5 |
| aaa.r.ScalarR 0.005h.053-noshield | -15.0 ± 30.5 | +5.0 ± 20.5 | +8.1 ± 26.7 | -2.2 ± 8.7 |
| abc.Shadow 3.83c | -10.0 ± 41.1 | -6.1 ± 43.8 | +10.6 ± 14.1 | +1.9 ± 13.7 |
| ags.Midboss 1q.fast | -10.0 ± 31.8 | -13.9 ± 25.4 | +8.5 ± 17.1 | +4.2 ± 15.2 |
| ar.horizon.Horizon 1.2.2 | -35.0 ± 30.5 | -4.2 ± 16.4 | -3.0 ± 4.8 | -0.1 ± 20.3 |
| aw.Gilgalad 1.99.5c | -40.0 ± 45.0 | -21.9 ± 31.2 | +8.8 ± 21.5 | -5.9 ± 17.6 |
| axeBots.SilverSurfer 2.53.33fix | -35.0 ± 54.4 | +0.3 ± 35.8 | +4.0 ± 15.6 | +4.3 ± 10.5 |
| catcat20.Lambda 0.017 | -35.0 ± 47.7 | -13.6 ± 34.9 | +4.8 ± 24.4 | +8.1 ± 14.8 |
| cb.Domogled 1.2 | +25.0 ± 54.4 | -2.5 ± 27.2 | +6.9 ± 27.2 | +2.5 ± 6.0 |
| cb.fire.Firestarter 2.0f | -15.0 ± 15.9 | +30.0 ± 43.1 | +9.7 ± 12.5 | +9.6 ± 9.7 |
| cjm.chalk.Chalk 2.6.Be | +0.0 ± 0.0 | +0.0 ± 0.0 | n/a | n/a |
| cs.Nene 1.0.5 | -25.0 ± 40.0 | -2.5 ± 23.9 | +11.6 ± 10.6 | -2.6 ± 10.5 |
| cs.s2.Seraphim 2.3.1 | -15.0 ± 15.9 | +0.3 ± 28.7 | +10.5 ± 5.4 | +0.4 ± 13.2 |
| darkcanuck.Pris 0.92 | -50.0 ± 41.1 | +2.2 ± 33.0 | -2.4 ± 12.0 | +4.2 ± 19.9 |
| davidalves.Firebird 0.25 | +0.0 ± 0.0 | +5.0 ± 9.2 | n/a | +0.0 ± 0.0 |
| davidalves.Phoenix 1.02 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | n/a |
| dsekercioglu.mega.Raven 3.56j8 | -60.0 ± 36.7 | -11.9 ± 34.0 | -11.0 ± 10.4 | +4.7 ± 8.9 |
| dsekercioglu.mega.WhiteFang 2.8.1 | -25.0 ± 15.9 | +0.0 ± 2.9 | +3.2 ± 7.6 | -2.5 ± 13.6 |
| florent.XSeries.X2 0.17 | -15.0 ± 70.6 | -7.2 ± 14.5 | +6.0 ± 15.4 | +3.4 ± 15.1 |
| florent.test.Toad 0.14t | -20.0 ± 68.7 | -5.8 ± 18.6 | +11.5 ± 12.4 | +4.4 ± 3.6 |
| fromHell.BlackBox 0.0.2 | -10.0 ± 55.1 | -11.4 ± 33.6 | +5.0 ± 24.1 | +7.7 ± 8.9 |
| fromHell.CHCl3 1.4.2 | -13.8 ± 32.7 | -10.8 ± 14.5 | +1.5 ± 13.9 | +6.6 ± 13.1 |
| gh.GresSuffurd 0.4.13 | -30.0 ± 18.4 | -11.4 ± 9.7 | +8.1 ± 16.7 | +7.2 ± 17.8 |
| jd.Nullstride 2.3.3 | -10.0 ± 18.4 | +1.9 ± 28.4 | -0.9 ± 8.4 | +1.0 ± 11.6 |
| jk.mega.DrussGT 3.1.16 | -10.0 ± 41.1 | +14.4 ± 40.4 | +10.1 ± 27.3 | -0.3 ± 10.5 |
| jk.melee.Neuromancer 7.12 | -10.0 ± 31.8 | +2.5 ± 52.6 | -0.8 ± 15.6 | -2.0 ± 9.7 |
| jk.mini.CunobelinDC 1.2 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.2 ± 2.9 | +6.5 ± 11.0 |
| jk.precise.Wintermute 0.8 | -35.0 ± 30.5 | -5.6 ± 21.9 | +4.0 ± 14.3 | +6.5 ± 13.7 |
| kc.mega.BeepBoop 2.0 | +10.0 ± 18.4 | +12.5 ± 32.8 | +9.4 ± 7.7 | +5.3 ± 9.1 |
| kc.serpent.Hydra 0.21 | +0.0 ± 0.0 | +0.0 ± 0.0 | n/a | n/a |
| kc.serpent.WaveSerpent 2.11 | -5.0 ± 47.7 | -10.6 ± 45.0 | +11.6 ± 16.9 | -1.2 ± 14.5 |
| lxx.Tomcat 3.68 | -70.0 ± 18.4 | -9.2 ± 35.3 | -7.3 ± 21.0 | -0.7 ± 13.5 |
| mn.Combat 3.25.0 | -50.0 ± 18.4 | +2.5 ± 43.8 | +7.3 ± 7.8 | +4.8 ± 2.3 |
| mue.Ascendant 1.2.27 | -15.0 ± 30.5 | -16.7 ± 6.1 | +8.0 ± 7.6 | -6.3 ± 5.3 |
| oog.mega.saguaro.Saguaro 1.0 | -10.0 ± 18.4 | -10.0 ± 45.0 | -1.2 ± 7.2 | +8.0 ± 25.2 |
| pc.Wavelet 1.5 | -35.0 ± 54.4 | +3.3 ± 30.3 | -2.5 ± 8.9 | -9.2 ± 38.5 |
| pez.rumble.Ali 0.4.9 | +0.0 ± 0.0 | +7.5 ± 8.0 | +0.0 ± 0.0 | +2.2 ± 13.1 |
| pez.rumble.CassiusClay 2rho.02no | -15.0 ± 15.9 | +3.1 ± 24.0 | +4.4 ± 8.8 | +4.9 ± 10.2 |
| pulsar.PulsarMax 0.8.9 | -20.0 ± 26.0 | +10.8 ± 33.3 | +5.1 ± 14.3 | +0.3 ± 7.2 |
| rsalesc.mega.Knight 0.6.28 | -15.0 ± 30.5 | -3.1 ± 28.9 | +6.6 ± 20.9 | +4.1 ± 3.6 |
| rsalesc.roborio.Roborio 1.2.4 | -15.0 ± 15.9 | +12.2 ± 20.1 | -0.4 ± 15.8 | +3.0 ± 8.4 |
| sheldor.mini.FoilistMC 1.0 | -30.0 ± 31.8 | -8.3 ± 31.5 | +8.9 ± 16.2 | -4.8 ± 23.2 |
| sheldor.mini.Foilist 1.3.1 | -5.0 ± 15.9 | +5.8 ± 42.3 | +7.5 ± 10.7 | +9.8 ± 9.4 |
| voidious.Diamond 1.8.22 | -50.0 ± 31.8 | -2.2 ± 17.3 | +4.4 ± 5.7 | -5.3 ± 3.7 |
| voidious.Dookious 1.573c | -40.0 ± 63.6 | -1.4 ± 21.5 | +5.8 ± 11.3 | +1.2 ± 10.3 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | +0.0 ± 0.0 | +0.0 ± 0.0 | +1.9 ± 7.5 | +1.0 ± 4.5 |
| xander.cat.XanderCat 12.9 | -15.0 ± 15.9 | -0.8 ± 49.8 | +10.1 ± 8.4 | +4.6 ± 11.2 |
| zyx.mega.YersiniaPestis 3.0 | -23.7 ± 11.9 | -10.0 ± 11.0 | +5.9 ± 9.3 | -3.1 ± 15.0 |
