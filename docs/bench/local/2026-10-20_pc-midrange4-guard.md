# Bench: hadur2.Hadur 3.14hjswhcpkw2 (cold)

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 6517 over 192 battles (33.9 per battle, most in one battle 73). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rank1-band1 | 27.2% ± 3.2 | 14.3% ± 3.7 | 44.8% ± 3.9 | 20 / 140 | 4.9% ± 0.7 | 8.4% ± 0.5 | 173 | 0 | 1.95 / 729.0 |
| jd.Nullstride 2.3.3 | rank2-band1 | 22.9% ± 6.4 | 10.0% ± 8.7 | 42.1% ± 4.2 | 14 / 140 | 4.7% ± 0.5 | 8.1% ± 1.0 | 147 | 0 | 1.71 / 689.9 |
| jk.mega.DrussGT 3.1.16 | rank3-band1 | 44.1% ± 6.8 | 41.7% ± 13.3 | 46.6% ± 2.4 | 59 / 140 | 7.7% ± 0.3 | 10.5% ± 0.3 | 285 | 0 | 1.47 / 772.4 |
| oog.mega.saguaro.Saguaro 1.0 | rank4-band1 | 79.0% ± 7.9 | 90.7% ± 7.8 | 67.4% ± 9.8 | 127 / 140 | 19.4% ± 3.9 | 6.3% ± 1.0 | 59 | 0 | 2.00 / 199.6 |
| aaa.r.ScalarR 0.005h.053-noshield | rank5-band1 | 36.6% ± 8.4 | 31.6% ± 14.1 | 42.5% ± 2.2 | 45 / 140 | 6.7% ± 0.2 | 10.2% ± 0.8 | 253 | 0 | 1.79 / 585.7 |
| voidious.Diamond 1.8.22 | rank6-band1 | 50.8% ± 11.3 | 59.3% ± 17.6 | 41.2% ± 3.9 | 83 / 140 | 6.9% ± 0.6 | 8.8% ± 0.4 | 234 | 0 | 1.61 / 452.8 |
| cb.fire.Firestarter 2.0f | rank7-band1 | 48.9% ± 9.0 | 47.1% ± 13.6 | 50.9% ± 5.1 | 66 / 140 | 8.4% ± 0.3 | 9.8% ± 0.4 | 236 | 0 | 1.79 / 83.2 |
| dsekercioglu.mega.Raven 3.56j8 | rank8-band1 | 57.7% ± 8.7 | 74.3% ± 15.3 | 39.7% ± 2.8 | 104 / 140 | 9.3% ± 0.2 | 8.8% ± 0.4 | 154 | 0 | 1.15 / 15.6 |
| xander.cat.XanderCat 12.9 | rank9-band1 | 58.2% ± 10.5 | 64.3% ± 13.6 | 52.1% ± 6.9 | 90 / 140 | 12.0% ± 0.7 | 8.6% ± 0.6 | 183 | 0 | 1.21 / 16.5 |
| lxx.Tomcat 3.68 | rank10-band1 | 60.4% ± 7.8 | 74.3% ± 16.2 | 46.6% ± 2.6 | 104 / 140 | 10.1% ± 0.9 | 10.4% ± 0.8 | 251 | 0 | 2.03 / 553.7 |
| rsalesc.mega.Knight 0.6.28 | rank11-band2 | 50.7% ± 7.2 | 50.0% ± 10.8 | 50.9% ± 5.7 | 70 / 140 | 9.8% ± 0.5 | 9.9% ± 0.8 | 268 | 0 | 2.01 / 502.6 |
| aw.Gilgalad 1.99.5c | rank12-band2 | 48.2% ± 12.4 | 56.4% ± 17.2 | 40.1% ± 8.8 | 79 / 140 | 8.9% ± 2.3 | 10.1% ± 0.8 | 200 | 0 | 1.48 / 513.7 |
| pc.Wavelet 1.5 | rank13-band2 | 44.1% ± 8.9 | 38.6% ± 15.1 | 50.8% ± 3.0 | 54 / 140 | 9.7% ± 2.0 | 9.1% ± 0.4 | 127 | 0 | 1.87 / 449.2 |
| gh.GresSuffurd 0.4.13 | rank14-band2 | 61.2% ± 9.1 | 74.3% ± 9.8 | 47.6% ± 9.8 | 104 / 140 | 10.9% ± 0.7 | 8.6% ± 1.2 | 131 | 0 | 1.01 / 144.3 |
| kc.serpent.WaveSerpent 2.11 | rank15-band2 | 57.9% ± 11.6 | 72.6% ± 17.6 | 41.5% ± 3.2 | 102 / 140 | 8.5% ± 0.5 | 7.8% ± 1.8 | 66 | 0 | 2.06 / 310.9 |
| dsekercioglu.mega.WhiteFang 2.8.1 | rank16-band2 | 66.5% ± 7.7 | 80.7% ± 12.5 | 51.1% ± 3.5 | 113 / 140 | 11.2% ± 1.0 | 7.8% ± 0.5 | 116 | 0 | 1.13 / 16.1 |
| cs.Nene 1.0.5 | rank17-band2 | 58.0% ± 9.8 | 74.3% ± 12.3 | 41.3% ± 7.1 | 104 / 140 | 9.8% ± 0.7 | 7.8% ± 0.9 | 88 | 0 | 1.22 / 458.3 |
| jk.melee.Neuromancer 7.12 | rank18-band2 | 51.1% ± 3.0 | 52.1% ± 2.3 | 50.0% ± 5.8 | 73 / 140 | 10.5% ± 1.3 | 10.1% ± 0.4 | 259 | 0 | 1.74 / 469.6 |
| voidious.Dookious 1.573c | rank19-band2 | 60.7% ± 5.1 | 75.0% ± 7.8 | 45.1% ± 7.6 | 105 / 140 | 9.6% ± 0.5 | 7.1% ± 0.7 | 63 | 0 | 1.16 / 541.5 |
| davidalves.Phoenix 1.02 | rank21-band2 | 98.8% ± 0.4 | 100.0% ± 0.0 | 0.0% ± 0.0 | 140 / 140 | 0.0% ± 0.0 | 0.2% ± 0.1 | 50 | 0 | 0.52 / 18.7 |
| rsalesc.roborio.Roborio 1.2.4 | rank22-band2 | 59.5% ± 3.3 | 53.6% ± 6.8 | 63.7% ± 3.7 | 75 / 140 | 12.0% ± 0.5 | 8.9% ± 1.2 | 211 | 0 | 1.66 / 172.2 |
| cb.Domogled 1.2 | rank23-band2 | 64.4% ± 9.1 | 59.0% ± 12.3 | 68.2% ± 6.2 | 83 / 140 | 11.8% ± 2.2 | 7.7% ± 0.7 | 205 | 0 | 1.01 / 694.5 |
| mue.Ascendant 1.2.27 | rank24-band2 | 58.7% ± 9.9 | 74.3% ± 9.8 | 44.5% ± 10.5 | 104 / 140 | 11.1% ± 0.6 | 8.2% ± 1.0 | 84 | 0 | 0.93 / 12.4 |
| abc.Shadow 3.83c | rank25-band2 | 52.9% ± 4.4 | 66.4% ± 7.8 | 39.7% ± 1.2 | 93 / 140 | 10.0% ± 0.7 | 8.8% ± 0.6 | 115 | 0 | 1.10 / 17.3 |
| darkcanuck.Pris 0.92 | rank26-band2 | 65.0% ± 10.4 | 80.0% ± 14.4 | 50.7% ± 6.7 | 112 / 140 | 11.3% ± 0.8 | 7.9% ± 0.6 | 51 | 0 | 1.79 / 211.0 |
| fromHell.BlackBox 0.0.2 | rank27-band2 | 66.4% ± 7.1 | 78.6% ± 10.8 | 54.6% ± 3.8 | 110 / 140 | 14.2% ± 2.2 | 8.6% ± 1.2 | 94 | 0 | 0.98 / 13.2 |
| jk.precise.Wintermute 0.8 | rank28-band2 | 61.0% ± 3.3 | 77.0% ± 7.1 | 44.9% ± 4.3 | 108 / 140 | 10.6% ± 0.8 | 8.4% ± 1.2 | 112 | 0 | 1.22 / 203.4 |
| kc.serpent.Hydra 0.21 | rank29-band2 | 100.0% ± 0.0 | 100.0% ± 0.0 | 50.0% ± 0.0 | 140 / 140 | 0.0% ± 0.0 | 0.0% ± 0.0 | 44 | 0 | 0.70 / 84.3 |
| davidalves.Firebird 0.25 | rank30-band2 | 93.6% ± 3.0 | 97.9% ± 2.3 | 0.0% ± 0.0 | 137 / 140 | 0.0% ± 0.0 | 0.4% ± 0.2 | 51 | 0 | 0.69 / 422.1 |
| pulsar.PulsarMax 0.8.9 | rank31-band2 | 59.9% ± 1.6 | 79.3% ± 4.4 | 39.1% ± 3.7 | 111 / 140 | 9.3% ± 0.3 | 7.6% ± 0.5 | 99 | 0 | 1.06 / 158.7 |
| zyx.mega.YersiniaPestis 3.0 | rank32-band2 | 58.5% ± 3.4 | 73.6% ± 5.7 | 42.6% ± 2.2 | 103 / 140 | 10.2% ± 0.5 | 7.6% ± 0.5 | 115 | 0 | 1.44 / 239.8 |
| ags.Midboss 1q.fast | rank33-band2 | 71.8% ± 4.5 | 85.0% ± 6.8 | 59.4% ± 2.2 | 119 / 140 | 13.2% ± 1.2 | 8.7% ± 0.7 | 152 | 0 | 1.35 / 170.5 |
| pez.rumble.CassiusClay 2rho.02no | rank35-band2 | 57.1% ± 10.2 | 57.9% ± 18.3 | 56.1% ± 3.2 | 81 / 140 | 12.2% ± 1.6 | 7.9% ± 0.5 | 161 | 0 | 1.11 / 211.6 |
| Krabb.sliNk.Garm 0.9u | rank36-band2 | 67.9% ± 14.4 | 80.7% ± 18.3 | 52.7% ± 10.1 | 113 / 140 | 10.6% ± 0.2 | 6.4% ± 1.2 | 86 | 0 | 1.12 / 269.5 |
| axeBots.SilverSurfer 2.53.33fix | rank37-band2 | 62.8% ± 14.0 | 73.6% ± 15.0 | 52.6% ± 11.7 | 103 / 140 | 12.3% ± 2.4 | 7.1% ± 1.8 | 142 | 0 | 1.47 / 16.1 |
| mn.Combat 3.25.0 | rank38-band2 | 54.5% ± 7.2 | 65.2% ± 13.9 | 43.8% ± 2.5 | 92 / 140 | 10.2% ± 0.4 | 9.1% ± 0.3 | 177 | 0 | 1.71 / 40.8 |
| cs.s2.Seraphim 2.3.1 | rank39-band2 | 68.9% ± 7.7 | 85.0% ± 9.4 | 51.6% ± 5.4 | 119 / 140 | 11.2% ± 0.4 | 6.7% ± 0.9 | 100 | 0 | 1.03 / 116.2 |
| fromHell.CHCl3 1.4.2 | rank40-band2 | 73.1% ± 5.1 | 87.1% ± 5.9 | 58.9% ± 3.3 | 122 / 140 | 13.1% ± 2.3 | 7.3% ± 1.0 | 97 | 0 | 0.93 / 12.6 |
| jk.mini.CunobelinDC 1.2 | rank41-band2 | 97.8% ± 0.6 | 100.0% ± 0.0 | 5.7% ± 7.6 | 140 / 140 | 0.7% ± 1.3 | 1.1% ± 0.2 | 76 | 0 | 0.60 / 16.1 |
| sheldor.mini.Foilist 1.3.1 | rank42-band2 | 63.6% ± 10.8 | 77.9% ± 9.4 | 49.7% ± 14.0 | 109 / 140 | 11.3% ± 1.4 | 8.7% ± 0.9 | 199 | 0 | 1.16 / 13.9 |
| florent.test.Toad 0.14t | rank43-band2 | 60.5% ± 9.7 | 74.0% ± 13.9 | 46.5% ± 4.6 | 104 / 140 | 10.8% ± 0.5 | 7.7% ± 0.8 | 128 | 0 | 1.07 / 17.3 |
| ar.horizon.Horizon 1.2.2 | rank44-band2 | 61.6% ± 10.6 | 76.4% ± 15.0 | 46.6% ± 5.8 | 107 / 140 | 11.0% ± 1.1 | 8.7% ± 1.1 | 121 | 0 | 1.44 / 522.2 |
| cjm.chalk.Chalk 2.6.Be | rank45-band2 | 99.8% ± 0.4 | 100.0% ± 0.0 | 25.0% ± 45.9 | 140 / 140 | 0.0% ± 0.0 | 0.0% ± 0.0 | 52 | 0 | 0.56 / 560.2 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | rank46-band2 | 99.0% ± 1.5 | 100.0% ± 0.0 | 11.5% ± 11.9 | 140 / 140 | 0.2% ± 0.6 | 1.7% ± 0.5 | 45 | 0 | 0.48 / 17.3 |
| sheldor.mini.FoilistMC 1.0 | rank47-band2 | 71.5% ± 2.0 | 85.7% ± 0.0 | 56.5% ± 5.2 | 120 / 140 | 11.8% ± 0.7 | 7.6% ± 1.7 | 155 | 0 | 1.22 / 530.0 |
| pez.rumble.Ali 0.4.9 | rank48-band2 | 89.6% ± 12.0 | 97.9% ± 4.4 | 13.1% ± 24.1 | 137 / 140 | 2.4% ± 1.0 | 1.2% ± 1.4 | 65 | 0 | 1.63 / 204.0 |
| catcat20.Lambda 0.017 | rank49-band2 | 64.9% ± 5.3 | 79.2% ± 9.9 | 51.1% ± 5.0 | 111 / 140 | 11.8% ± 0.8 | 7.8% ± 0.8 | 138 | 0 | 1.73 / 12.2 |
| florent.XSeries.X2 0.17 | rank50-band2 | 68.4% ± 9.2 | 83.6% ± 9.4 | 52.6% ± 8.7 | 117 / 140 | 11.3% ± 0.6 | 6.9% ± 1.1 | 99 | 0 | 2.05 / 21.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 2855 | 52.5% | 31.5% | 0.0% | 16.0% | 1750 |
| jd.Nullstride 2.3.3 | 4 | 2918 | 54.0% | 29.7% | 0.0% | 16.3% | 1622 |
| jk.mega.DrussGT 3.1.16 | 4 | 2427 | 41.7% | 44.6% | 0.0% | 13.7% | 3086 |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 1032 | 15.7% | 77.5% | 0.0% | 6.7% | 651 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 2782 | 42.7% | 42.8% | 0.0% | 14.5% | 2851 |
| voidious.Diamond 1.8.22 | 4 | 2011 | 35.4% | 52.8% | 0.0% | 11.7% | 2912 |
| cb.fire.Firestarter 2.0f | 4 | 2219 | 41.7% | 44.8% | 0.0% | 13.5% | 3297 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 1824 | 24.7% | 66.0% | 0.0% | 9.3% | 1397 |
| xander.cat.XanderCat 12.9 | 4 | 1963 | 31.8% | 57.2% | 0.0% | 10.9% | 1594 |
| lxx.Tomcat 3.68 | 4 | 1800 | 25.0% | 65.5% | 0.0% | 9.4% | 2281 |
| rsalesc.mega.Knight 0.6.28 | 4 | 2198 | 39.8% | 47.2% | 0.0% | 13.0% | 2900 |
| aw.Gilgalad 1.99.5c | 4 | 2290 | 33.3% | 54.1% | 0.0% | 12.6% | 1694 |
| pc.Wavelet 1.5 | 4 | 2474 | 43.5% | 41.5% | 0.2% | 14.8% | 1502 |
| gh.GresSuffurd 0.4.13 | 4 | 1758 | 25.6% | 64.5% | 0.0% | 9.9% | 1147 |
| kc.serpent.WaveSerpent 2.11 | 4 | 1791 | 26.5% | 63.1% | 0.0% | 10.3% | 1062 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 1478 | 22.8% | 68.7% | 0.0% | 8.5% | 1280 |
| cs.Nene 1.0.5 | 4 | 1838 | 24.5% | 65.5% | 0.0% | 10.1% | 916 |
| jk.melee.Neuromancer 7.12 | 4 | 2260 | 37.1% | 50.3% | 0.0% | 12.7% | 2132 |
| voidious.Dookious 1.573c | 4 | 1697 | 25.8% | 64.1% | 0.0% | 10.1% | 1005 |
| davidalves.Phoenix 1.02 | 4 | 25 | 0.0% | 100.0% | 0.0% | 0.0% | 1243 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 1922 | 42.3% | 44.5% | 0.0% | 13.2% | 2697 |
| cb.Domogled 1.2 | 4 | 1602 | 44.5% | 43.7% | 0.0% | 11.8% | 2548 |
| mue.Ascendant 1.2.27 | 4 | 1957 | 23.0% | 66.9% | 0.0% | 10.1% | 861 |
| abc.Shadow 3.83c | 4 | 2131 | 27.6% | 61.4% | 0.0% | 11.1% | 972 |
| darkcanuck.Pris 0.92 | 4 | 1650 | 21.2% | 69.5% | 0.1% | 9.2% | 825 |
| fromHell.BlackBox 0.0.2 | 4 | 1612 | 23.3% | 67.6% | 0.0% | 9.2% | 916 |
| jk.precise.Wintermute 0.8 | 4 | 1777 | 22.5% | 68.3% | 0.0% | 9.2% | 1024 |
| kc.serpent.Hydra 0.21 | 4 | - | - | - | - | - | 1377 |
| davidalves.Firebird 0.25 | 4 | 142 | 26.5% | 64.8% | 0.0% | 8.7% | 1244 |
| pulsar.PulsarMax 0.8.9 | 4 | 1727 | 21.0% | 70.6% | 0.0% | 8.4% | 992 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 1835 | 25.2% | 65.3% | 0.0% | 9.5% | 982 |
| ags.Midboss 1q.fast | 4 | 1401 | 18.7% | 73.1% | 0.0% | 8.1% | 918 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 2043 | 36.1% | 50.8% | 0.0% | 13.1% | 1709 |
| Krabb.sliNk.Garm 0.9u | 4 | 1373 | 24.6% | 67.0% | 0.0% | 8.4% | 929 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 1720 | 26.9% | 62.0% | 0.0% | 11.1% | 1030 |
| mn.Combat 3.25.0 | 4 | 1987 | 30.2% | 58.6% | 0.0% | 11.2% | 1566 |
| cs.s2.Seraphim 2.3.1 | 4 | 1392 | 18.9% | 73.5% | 0.0% | 7.6% | 858 |
| fromHell.CHCl3 1.4.2 | 4 | 1281 | 17.6% | 75.5% | 0.0% | 6.9% | 884 |
| jk.mini.CunobelinDC 1.2 | 4 | 48 | 0.0% | 100.0% | 0.0% | 0.0% | 1409 |
| sheldor.mini.Foilist 1.3.1 | 4 | 1702 | 22.8% | 68.1% | 0.0% | 9.2% | 1379 |
| florent.test.Toad 0.14t | 4 | 1771 | 25.4% | 64.8% | 0.0% | 9.8% | 979 |
| ar.horizon.Horizon 1.2.2 | 4 | 1740 | 23.7% | 66.9% | 0.0% | 9.4% | 1166 |
| cjm.chalk.Chalk 2.6.Be | 4 | 5 | 0.0% | 100.0% | 0.0% | 0.0% | 1374 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 21 | 0.0% | 100.0% | 0.0% | 0.0% | 1053 |
| sheldor.mini.FoilistMC 1.0 | 4 | 1300 | 19.2% | 72.9% | 0.0% | 7.9% | 1303 |
| pez.rumble.Ali 0.4.9 | 4 | 261 | 14.4% | 80.4% | 0.0% | 5.2% | 1381 |
| catcat20.Lambda 0.017 | 4 | 1635 | 22.2% | 68.7% | 0.0% | 9.2% | 1043 |
| florent.XSeries.X2 0.17 | 4 | 1418 | 20.3% | 71.3% | 0.0% | 8.4% | 934 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 3 | 0 | 0 | 1.24 | 1 | 0 | 0 |
| jd.Nullstride 2.3.3 | 4 | 1 | 0 | 0 | 1.05 | 3 | 3 | 0 |
| jk.mega.DrussGT 3.1.16 | 4 | 0 | 0 | 0 | 2.04 | 1 | 1 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 4 | 0 | 0 | 0.42 | 0 | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 4 | 0 | 0 | 1.81 | 0 | 0 | 0 |
| voidious.Diamond 1.8.22 | 4 | 1 | 0 | 0 | 1.67 | 3 | 3 | 0 |
| cb.fire.Firestarter 2.0f | 4 | 4 | 0 | 0 | 1.69 | 0 | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 4 | 0 | 0 | 1.10 | 0 | 0 | 0 |
| xander.cat.XanderCat 12.9 | 4 | 4 | 0 | 0 | 1.31 | 0 | 0 | 0 |
| lxx.Tomcat 3.68 | 4 | 2 | 0 | 0 | 1.79 | 2 | 1 | 0 |
| rsalesc.mega.Knight 0.6.28 | 4 | 1 | 0 | 0 | 1.91 | 2 | 2 | 0 |
| aw.Gilgalad 1.99.5c | 4 | 2 | 0 | 0 | 1.43 | 2 | 2 | 0 |
| pc.Wavelet 1.5 | 4 | 2 | 0 | 0 | 0.91 | 2 | 2 | 0 |
| gh.GresSuffurd 0.4.13 | 4 | 2 | 0 | 0 | 0.94 | 2 | 2 | 0 |
| kc.serpent.WaveSerpent 2.11 | 4 | 3 | 0 | 0 | 0.47 | 1 | 1 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 3 | 0 | 0 | 0.83 | 1 | 1 | 0 |
| cs.Nene 1.0.5 | 4 | 4 | 0 | 0 | 0.63 | 0 | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 4 | 2 | 0 | 0 | 1.85 | 2 | 2 | 0 |
| voidious.Dookious 1.573c | 4 | 2 | 0 | 0 | 0.45 | 2 | 2 | 0 |
| davidalves.Phoenix 1.02 | 4 | 4 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 3 | 0 | 0 | 1.51 | 1 | 1 | 0 |
| cb.Domogled 1.2 | 4 | 4 | 0 | 0 | 1.46 | 0 | 0 | 0 |
| mue.Ascendant 1.2.27 | 4 | 4 | 0 | 0 | 0.60 | 0 | 0 | 0 |
| abc.Shadow 3.83c | 4 | 2 | 0 | 0 | 0.82 | 2 | 2 | 0 |
| darkcanuck.Pris 0.92 | 4 | 4 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| fromHell.BlackBox 0.0.2 | 4 | 3 | 0 | 0 | 0.67 | 1 | 1 | 0 |
| jk.precise.Wintermute 0.8 | 4 | 4 | 0 | 0 | 0.80 | 0 | 0 | 0 |
| kc.serpent.Hydra 0.21 | 4 | 4 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| davidalves.Firebird 0.25 | 4 | 3 | 0 | 0 | 0.36 | 1 | 1 | 0 |
| pulsar.PulsarMax 0.8.9 | 4 | 4 | 0 | 0 | 0.71 | 0 | 0 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 3 | 0 | 0 | 0.82 | 1 | 1 | 0 |
| ags.Midboss 1q.fast | 4 | 2 | 0 | 0 | 1.09 | 2 | 2 | 0 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 1 | 0 | 0 | 1.15 | 3 | 3 | 0 |
| Krabb.sliNk.Garm 0.9u | 4 | 4 | 0 | 0 | 0.61 | 0 | 0 | 0 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 2 | 0 | 0 | 1.01 | 2 | 2 | 0 |
| mn.Combat 3.25.0 | 4 | 4 | 0 | 0 | 1.26 | 0 | 0 | 0 |
| cs.s2.Seraphim 2.3.1 | 4 | 4 | 0 | 0 | 0.71 | 0 | 0 | 0 |
| fromHell.CHCl3 1.4.2 | 4 | 4 | 0 | 0 | 0.69 | 0 | 0 | 0 |
| jk.mini.CunobelinDC 1.2 | 4 | 4 | 0 | 0 | 0.54 | 0 | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 4 | 3 | 0 | 0 | 1.42 | 1 | 1 | 0 |
| florent.test.Toad 0.14t | 4 | 4 | 0 | 0 | 0.91 | 0 | 0 | 0 |
| ar.horizon.Horizon 1.2.2 | 4 | 3 | 0 | 0 | 0.86 | 1 | 1 | 0 |
| cjm.chalk.Chalk 2.6.Be | 4 | 4 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 3 | 0 | 0 | 0.32 | 1 | 1 | 0 |
| sheldor.mini.FoilistMC 1.0 | 4 | 4 | 0 | 0 | 1.11 | 0 | 0 | 0 |
| pez.rumble.Ali 0.4.9 | 4 | 4 | 0 | 0 | 0.46 | 0 | 0 | 0 |
| catcat20.Lambda 0.017 | 4 | 4 | 0 | 0 | 0.99 | 0 | 0 | 0 |
| florent.XSeries.X2 0.17 | 4 | 4 | 0 | 0 | 0.71 | 0 | 0 | 0 |

148 of 192 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 18457 | 254 | 18505 | 18446 (99.9%) | 11 (0.1%) | 59 (0.3%) | 1333 | 105 | 174 |
| jd.Nullstride 2.3.3 | 16499 | 234 | 16557 | 16488 (99.9%) | 11 (0.1%) | 69 (0.4%) | 1276 | 87 | 128 |
| jk.mega.DrussGT 3.1.16 | 35572 | 5 | 35574 | 35568 (100.0%) | 4 (0.0%) | 6 (0.0%) | 2271 | 256 | 269 |
| oog.mega.saguaro.Saguaro 1.0 | 4460 | 28 | 4465 | 4458 (100.0%) | 2 (0.0%) | 7 (0.2%) | 227 | 59 | 14 |
| aaa.r.ScalarR 0.005h.053-noshield | 31880 | 10 | 31988 | 31879 (100.0%) | 1 (0.0%) | 109 (0.3%) | 2797 | 365 | 244 |
| voidious.Diamond 1.8.22 | 32818 | 606 | 32926 | 32816 (100.0%) | 2 (0.0%) | 110 (0.3%) | 3175 | 185 | 214 |
| cb.fire.Firestarter 2.0f | 32789 | 786 | 33325 | 32765 (99.9%) | 24 (0.1%) | 560 (1.7%) | 8291 | 249 | 226 |
| dsekercioglu.mega.Raven 3.56j8 | 13330 | 78 | 13330 | 13327 (100.0%) | 3 (0.0%) | 3 (0.0%) | 993 | 137 | 154 |
| xander.cat.XanderCat 12.9 | 13262 | 9 | 13307 | 13260 (100.0%) | 2 (0.0%) | 47 (0.4%) | 1733 | 175 | 179 |
| lxx.Tomcat 3.68 | 24957 | 342 | 24938 | 24937 (99.9%) | 20 (0.1%) | 1 (0.0%) | 2197 | 223 | 238 |
| rsalesc.mega.Knight 0.6.28 | 32920 | 364 | 32923 | 32912 (100.0%) | 8 (0.0%) | 11 (0.0%) | 2679 | 265 | 304 |
| aw.Gilgalad 1.99.5c | 17556 | 8 | 17572 | 17549 (100.0%) | 7 (0.0%) | 23 (0.1%) | 1462 | 146 | 245 |
| pc.Wavelet 1.5 | 12848 | 4 | 12879 | 12847 (100.0%) | 1 (0.0%) | 32 (0.2%) | 1346 | 122 | 97 |
| gh.GresSuffurd 0.4.13 | 10410 | 10 | 10410 | 10410 (100.0%) | 0 (0.0%) | 0 (0.0%) | 751 | 87 | 111 |
| kc.serpent.WaveSerpent 2.11 | 7728 | 3 | 7730 | 7728 (100.0%) | 0 (0.0%) | 2 (0.0%) | 518 | 61 | 35 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 10895 | 12 | 10898 | 10894 (100.0%) | 1 (0.0%) | 4 (0.0%) | 944 | 115 | 90 |
| cs.Nene 1.0.5 | 7513 | 59 | 7511 | 7510 (100.0%) | 3 (0.0%) | 1 (0.0%) | 445 | 47 | 49 |
| jk.melee.Neuromancer 7.12 | 22230 | 6 | 22260 | 22225 (100.0%) | 5 (0.0%) | 35 (0.2%) | 2159 | 216 | 274 |
| voidious.Dookious 1.573c | 7488 | 14 | 7489 | 7488 (100.0%) | 0 (0.0%) | 1 (0.0%) | 502 | 57 | 40 |
| davidalves.Phoenix 1.02 | 5799 | 0 | 5800 | 5799 (100.0%) | 0 (0.0%) | 1 (0.0%) | 2500 | 0 | 8 |
| rsalesc.roborio.Roborio 1.2.4 | 25727 | 8 | 25753 | 25726 (100.0%) | 1 (0.0%) | 27 (0.1%) | 2965 | 214 | 192 |
| cb.Domogled 1.2 | 20763 | 7 | 21475 | 20760 (100.0%) | 3 (0.0%) | 715 (3.3%) | 8790 | 155 | 204 |
| mue.Ascendant 1.2.27 | 6638 | 8 | 6638 | 6637 (100.0%) | 1 (0.0%) | 1 (0.0%) | 371 | 96 | 50 |
| abc.Shadow 3.83c | 8022 | 487 | 7993 | 7988 (99.6%) | 34 (0.4%) | 5 (0.1%) | 533 | 65 | 91 |
| darkcanuck.Pris 0.92 | 6076 | 16 | 6076 | 6076 (100.0%) | 0 (0.0%) | 0 (0.0%) | 278 | 65 | 17 |
| fromHell.BlackBox 0.0.2 | 7753 | 11 | 7753 | 7753 (100.0%) | 0 (0.0%) | 0 (0.0%) | 600 | 104 | 60 |
| jk.precise.Wintermute 0.8 | 8953 | 11 | 8952 | 8951 (100.0%) | 2 (0.0%) | 1 (0.0%) | 592 | 106 | 76 |
| kc.serpent.Hydra 0.21 | 9034 | 0 | 9035 | 9033 (100.0%) | 1 (0.0%) | 2 (0.0%) | 30 | 0 | 12 |
| davidalves.Firebird 0.25 | 6009 | 0 | 6012 | 6009 (100.0%) | 0 (0.0%) | 3 (0.0%) | 2328 | 5 | 15 |
| pulsar.PulsarMax 0.8.9 | 7828 | 3 | 7828 | 7828 (100.0%) | 0 (0.0%) | 0 (0.0%) | 535 | 44 | 65 |
| zyx.mega.YersiniaPestis 3.0 | 7016 | 313 | 7006 | 7002 (99.8%) | 14 (0.2%) | 4 (0.1%) | 582 | 57 | 81 |
| ags.Midboss 1q.fast | 7907 | 24 | 7907 | 7905 (100.0%) | 2 (0.0%) | 2 (0.0%) | 392 | 98 | 109 |
| pez.rumble.CassiusClay 2rho.02no | 15931 | 8 | 15960 | 15930 (100.0%) | 1 (0.0%) | 30 (0.2%) | 1835 | 147 | 158 |
| Krabb.sliNk.Garm 0.9u | 7569 | 2 | 7569 | 7567 (100.0%) | 2 (0.0%) | 2 (0.0%) | 470 | 60 | 47 |
| axeBots.SilverSurfer 2.53.33fix | 5985 | 5 | 6099 | 5984 (100.0%) | 1 (0.0%) | 115 (1.9%) | 1529 | 71 | 108 |
| mn.Combat 3.25.0 | 15545 | 11 | 15548 | 15542 (100.0%) | 3 (0.0%) | 6 (0.0%) | 1279 | 124 | 151 |
| cs.s2.Seraphim 2.3.1 | 6589 | 15 | 6589 | 6589 (100.0%) | 0 (0.0%) | 0 (0.0%) | 356 | 48 | 42 |
| fromHell.CHCl3 1.4.2 | 6363 | 13 | 6363 | 6363 (100.0%) | 0 (0.0%) | 0 (0.0%) | 439 | 74 | 48 |
| jk.mini.CunobelinDC 1.2 | 13597 | 144 | 13597 | 13597 (100.0%) | 0 (0.0%) | 0 (0.0%) | 11 | 0 | 17 |
| sheldor.mini.Foilist 1.3.1 | 13624 | 7 | 13623 | 13620 (100.0%) | 4 (0.0%) | 3 (0.0%) | 1046 | 112 | 160 |
| florent.test.Toad 0.14t | 7153 | 3 | 7152 | 7150 (100.0%) | 3 (0.0%) | 2 (0.0%) | 560 | 58 | 65 |
| ar.horizon.Horizon 1.2.2 | 9944 | 3 | 9944 | 9944 (100.0%) | 0 (0.0%) | 0 (0.0%) | 783 | 91 | 78 |
| cjm.chalk.Chalk 2.6.Be | 7980 | 0 | 7980 | 7980 (100.0%) | 0 (0.0%) | 0 (0.0%) | 145 | 0 | 10 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 8769 | 212 | 8769 | 8769 (100.0%) | 0 (0.0%) | 0 (0.0%) | 1 | 0 | 13 |
| sheldor.mini.FoilistMC 1.0 | 13013 | 31 | 13014 | 13013 (100.0%) | 0 (0.0%) | 1 (0.0%) | 929 | 101 | 113 |
| pez.rumble.Ali 0.4.9 | 8272 | 18 | 8274 | 8272 (100.0%) | 0 (0.0%) | 2 (0.0%) | 2469 | 5 | 27 |
| catcat20.Lambda 0.017 | 8841 | 172 | 8835 | 8832 (99.9%) | 9 (0.1%) | 3 (0.0%) | 630 | 76 | 99 |
| florent.XSeries.X2 0.17 | 6499 | 3 | 6502 | 6498 (100.0%) | 1 (0.0%) | 4 (0.1%) | 489 | 56 | 65 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 18221 | 1956 (10.7%) | 17820 |
| jd.Nullstride 2.3.3 | 16318 | 1649 (10.1%) | 15942 |
| jk.mega.DrussGT 3.1.16 | 35299 | 4392 (12.4%) | 35262 |
| oog.mega.saguaro.Saguaro 1.0 | 4940 | 388 (7.9%) | 4921 |
| aaa.r.ScalarR 0.005h.053-noshield | 32473 | 3975 (12.2%) | 31838 |
| voidious.Diamond 1.8.22 | 33109 | 3528 (10.7%) | 32572 |
| cb.fire.Firestarter 2.0f | 38274 | 3447 (9.0%) | 36033 |
| dsekercioglu.mega.Raven 3.56j8 | 14400 | 1466 (10.2%) | 13873 |
| xander.cat.XanderCat 12.9 | 16370 | 1401 (8.6%) | 15661 |
| lxx.Tomcat 3.68 | 25404 | 2899 (11.4%) | 24331 |
| rsalesc.mega.Knight 0.6.28 | 32802 | 3796 (11.6%) | 32424 |
| aw.Gilgalad 1.99.5c | 17790 | 1807 (10.2%) | 16738 |
| pc.Wavelet 1.5 | 15070 | 1329 (8.8%) | 14271 |
| gh.GresSuffurd 0.4.13 | 10877 | 1057 (9.7%) | 10208 |
| kc.serpent.WaveSerpent 2.11 | 10004 | 723 (7.2%) | 7109 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 12706 | 1164 (9.2%) | 11288 |
| cs.Nene 1.0.5 | 8273 | 791 (9.6%) | 7301 |
| jk.melee.Neuromancer 7.12 | 23349 | 2356 (10.1%) | 22895 |
| voidious.Dookious 1.573c | 9297 | 738 (7.9%) | 7181 |
| davidalves.Phoenix 1.02 | 124 | 5780 (4661.3%) | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 30136 | 2587 (8.6%) | 30106 |
| cb.Domogled 1.2 | 28458 | 2215 (7.8%) | 27887 |
| mue.Ascendant 1.2.27 | 7485 | 622 (8.3%) | 6309 |
| abc.Shadow 3.83c | 8926 | 748 (8.4%) | 8156 |
| darkcanuck.Pris 0.92 | 7011 | 489 (7.0%) | 3700 |
| fromHell.BlackBox 0.0.2 | 7906 | 771 (9.8%) | 6355 |
| jk.precise.Wintermute 0.8 | 9540 | 1078 (11.3%) | 8262 |
| kc.serpent.Hydra 0.21 | 147 | 9033 (6144.9%) | 0 |
| davidalves.Firebird 0.25 | 129 | 5918 (4587.6%) | 0 |
| pulsar.PulsarMax 0.8.9 | 9437 | 826 (8.8%) | 7398 |
| zyx.mega.YersiniaPestis 3.0 | 9007 | 642 (7.1%) | 6106 |
| ags.Midboss 1q.fast | 7953 | 774 (9.7%) | 7129 |
| pez.rumble.CassiusClay 2rho.02no | 17332 | 1720 (9.9%) | 16802 |
| Krabb.sliNk.Garm 0.9u | 8296 | 725 (8.7%) | 7016 |
| axeBots.SilverSurfer 2.53.33fix | 9496 | 548 (5.8%) | 8201 |
| mn.Combat 3.25.0 | 16363 | 1589 (9.7%) | 14387 |
| cs.s2.Seraphim 2.3.1 | 7478 | 594 (7.9%) | 6334 |
| fromHell.CHCl3 1.4.2 | 7564 | 676 (8.9%) | 6247 |
| jk.mini.CunobelinDC 1.2 | 370 | 13453 (3635.9%) | 0 |
| sheldor.mini.Foilist 1.3.1 | 13985 | 1170 (8.4%) | 12868 |
| florent.test.Toad 0.14t | 8985 | 695 (7.7%) | 8381 |
| ar.horizon.Horizon 1.2.2 | 11244 | 1044 (9.3%) | 8412 |
| cjm.chalk.Chalk 2.6.Be | 139 | 7978 (5739.6%) | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 330 | 8712 (2640.0%) | 0 |
| sheldor.mini.FoilistMC 1.0 | 12955 | 1207 (9.3%) | 12290 |
| pez.rumble.Ali 0.4.9 | 1379 | 7454 (540.5%) | 37 |
| catcat20.Lambda 0.017 | 9752 | 866 (8.9%) | 8079 |
| florent.XSeries.X2 0.17 | 8415 | 523 (6.2%) | 7486 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 534 | 650 | 1608 | 20.9 / 25.7 | 0 | 660 | 35 |
| jd.Nullstride 2.3.3 | 650 | 540 | 650 | 1479 | 17.9 / 24.7 | 0 | 577 | 37 |
| jk.mega.DrussGT 3.1.16 | 650 | 518 | 650 | 2948 | 27.1 / 30.9 | 13 | 3194 | 311 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 438 | 450 | 501 | 48.1 / 22.9 | 770 | 2116 | 305 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 485 | 650 | 2701 | 25.1 / 34.0 | 0 | 1529 | 1 |
| voidious.Diamond 1.8.22 | 650 | 538 | 650 | 2792 | 21.2 / 30.4 | 50 | 8690 | 101 |
| cb.fire.Firestarter 2.0f | 650 | 547 | 650 | 3147 | 29.5 / 28.4 | 71 | 3235 | 91 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 456 | 650 | 1247 | 22.7 / 34.4 | 94 | 11318 | 1622 |
| xander.cat.XanderCat 12.9 | 650 | 444 | 650 | 1444 | 35.0 / 32.1 | 290 | 1184 | 71 |
| lxx.Tomcat 3.68 | 650 | 511 | 650 | 2148 | 29.4 / 33.7 | 159 | 17848 | 6 |
| rsalesc.mega.Knight 0.6.28 | 650 | 508 | 650 | 2770 | 30.6 / 29.6 | 301 | 6227 | 108 |
| aw.Gilgalad 1.99.5c | 650 | 483 | 650 | 1548 | 24.2 / 35.4 | 106 | 14446 | 5 |
| pc.Wavelet 1.5 | 650 | 437 | 650 | 1352 | 30.4 / 29.3 | 203 | 1869 | 6 |
| gh.GresSuffurd 0.4.13 | 650 | 455 | 650 | 1003 | 29.4 / 32.4 | 343 | 6315 | 32 |
| kc.serpent.WaveSerpent 2.11 | 650 | 476 | 588 | 907 | 22.9 / 32.3 | 79 | 6057 | 1 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 470 | 638 | 1134 | 30.4 / 29.0 | 337 | 8528 | 238 |
| cs.Nene 1.0.5 | 650 | 476 | 650 | 766 | 24.2 / 34.4 | 79 | 4202 | 1124 |
| jk.melee.Neuromancer 7.12 | 650 | 528 | 650 | 1999 | 32.5 / 32.4 | 170 | 8453 | 10 |
| voidious.Dookious 1.573c | 650 | 483 | 650 | 858 | 25.6 / 31.1 | 51 | 4904 | 2445 |
| davidalves.Phoenix 1.02 | 650 | 400 | 650 | 1093 | 0.0 / 0.7 | 0 | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 650 | 506 | 650 | 2552 | 42.8 / 24.4 | 598 | 5082 | 77 |
| cb.Domogled 1.2 | 650 | 530 | 619 | 2398 | 43.4 / 20.0 | 485 | 1080 | 190 |
| mue.Ascendant 1.2.27 | 650 | 411 | 650 | 711 | 30.1 / 37.4 | 110 | 1785 | 51 |
| abc.Shadow 3.83c | 650 | 455 | 650 | 826 | 24.6 / 37.4 | 143 | 5767 | 65 |
| darkcanuck.Pris 0.92 | 650 | 403 | 525 | 675 | 33.8 / 32.8 | 140 | 1991 | 682 |
| fromHell.BlackBox 0.0.2 | 650 | 404 | 438 | 766 | 37.4 / 31.1 | 778 | 1534 | 48 |
| jk.precise.Wintermute 0.8 | 650 | 455 | 650 | 874 | 28.3 / 34.6 | 82 | 6370 | 155 |
| kc.serpent.Hydra 0.21 | 650 | 346 | 650 | 1227 | 0.0 / 0.0 | 0 | 0 | 0 |
| davidalves.Firebird 0.25 | 650 | 400 | 650 | 1096 | 0.0 / 2.6 | 0 | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 650 | 488 | 650 | 842 | 22.4 / 34.8 | 11 | 5826 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 650 | 447 | 650 | 833 | 25.5 / 34.2 | 69 | 3982 | 157 |
| ags.Midboss 1q.fast | 650 | 410 | 650 | 768 | 42.8 / 29.3 | 456 | 1992 | 323 |
| pez.rumble.CassiusClay 2rho.02no | 650 | 473 | 650 | 1552 | 37.9 / 29.6 | 506 | 944 | 32 |
| Krabb.sliNk.Garm 0.9u | 650 | 526 | 544 | 779 | 29.3 / 26.3 | 222 | 3408 | 2555 |
| axeBots.SilverSurfer 2.53.33fix | 650 | 486 | 588 | 883 | 34.0 / 30.5 | 294 | 1206 | 62 |
| mn.Combat 3.25.0 | 650 | 491 | 650 | 1416 | 25.9 / 33.2 | 179 | 13059 | 75 |
| cs.s2.Seraphim 2.3.1 | 650 | 478 | 600 | 708 | 31.2 / 29.2 | 225 | 2431 | 488 |
| fromHell.CHCl3 1.4.2 | 650 | 433 | 544 | 734 | 39.4 / 27.6 | 613 | 1639 | 0 |
| jk.mini.CunobelinDC 1.2 | 650 | 536 | 650 | 1259 | 0.1 / 1.4 | 0 | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 650 | 569 | 650 | 1226 | 33.0 / 33.1 | 362 | 6145 | 19 |
| florent.test.Toad 0.14t | 650 | 493 | 650 | 829 | 28.5 / 32.8 | 138 | 3199 | 21 |
| ar.horizon.Horizon 1.2.2 | 650 | 478 | 650 | 1017 | 29.1 / 33.2 | 180 | 6592 | 2 |
| cjm.chalk.Chalk 2.6.Be | 650 | 412 | 650 | 1224 | 0.0 / 0.1 | 0 | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 650 | 351 | 650 | 904 | 0.1 / 0.6 | 0 | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 650 | 571 | 600 | 1153 | 35.5 / 27.1 | 238 | 3939 | 1111 |
| pez.rumble.Ali 0.4.9 | 650 | 390 | 650 | 1231 | 1.7 / 6.0 | 0 | 1053 | 4 |
| catcat20.Lambda 0.017 | 650 | 536 | 650 | 893 | 33.4 / 32.1 | 225 | 2518 | 1 |
| florent.XSeries.X2 0.17 | 650 | 490 | 625 | 784 | 31.9 / 28.9 | 114 | 2766 | 3 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 8.4% | 173 | 3674 | 3 | 130.4 | 1952 / 1956 (100%) | 0 | 0 |
| jd.Nullstride 2.3.3 | 8.1% | 147 | 1595 | 3 | 115.0 | 1647 / 1649 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.5% | 285 | 177 | 3 | 251.7 | 4382 / 4392 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.3% | 59 | 55 | 3 | 31.9 | 388 / 388 (100%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.2% | 253 | 1198 | 3 | 228.1 | 3972 / 3975 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 8.8% | 234 | 1539 | 3 | 231.9 | 3522 / 3528 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 9.8% | 236 | 1392 | 3 | 237.3 | 3432 / 3447 (100%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 8.8% | 154 | 884 | 3 | 94.7 | 1459 / 1466 (100%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 8.6% | 183 | 294 | 3 | 94.9 | 1397 / 1401 (100%) | 0 | 0 |
| lxx.Tomcat 3.68 | 10.4% | 251 | 1250 | 3 | 177.3 | 2895 / 2899 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 9.9% | 268 | 341 | 3 | 232.3 | 3791 / 3796 (100%) | 0 | 0 |
| aw.Gilgalad 1.99.5c | 10.1% | 200 | 848 | 3 | 123.6 | 1805 / 1807 (100%) | 0 | 0 |
| pc.Wavelet 1.5 | 9.1% | 127 | 99 | 3 | 90.7 | 1325 / 1329 (100%) | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 8.6% | 131 | 424 | 3 | 72.8 | 1055 / 1057 (100%) | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 7.8% | 66 | 237 | 3 | 54.5 | 723 / 723 (100%) | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 7.8% | 116 | 150 | 3 | 77.2 | 1163 / 1164 (100%) | 0 | 0 |
| cs.Nene 1.0.5 | 7.8% | 88 | 55 | 3 | 53.3 | 788 / 791 (100%) | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 10.1% | 259 | 1580 | 3 | 157.1 | 2351 / 2356 (100%) | 0 | 0 |
| voidious.Dookious 1.573c | 7.1% | 63 | 56 | 3 | 52.7 | 737 / 738 (100%) | 0 | 0 |
| davidalves.Phoenix 1.02 | 0.2% | 50 | 9 | 3 | 0.0 | 0 / 5780 (0%) | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 8.9% | 211 | 527 | 3 | 181.3 | 2585 / 2587 (100%) | 0 | 0 |
| cb.Domogled 1.2 | 7.7% | 205 | 150 | 3 | 152.9 | 2203 / 2215 (99%) | 0 | 0 |
| mue.Ascendant 1.2.27 | 8.2% | 84 | 162 | 3 | 47.1 | 619 / 622 (100%) | 0 | 0 |
| abc.Shadow 3.83c | 8.8% | 115 | 119 | 3 | 56.3 | 748 / 748 (100%) | 0 | 0 |
| darkcanuck.Pris 0.92 | 7.9% | 51 | 762 | 3 | 43.4 | 488 / 489 (100%) | 0 | 0 |
| fromHell.BlackBox 0.0.2 | 8.6% | 94 | 338 | 3 | 54.8 | 771 / 771 (100%) | 0 | 0 |
| jk.precise.Wintermute 0.8 | 8.4% | 112 | 476 | 3 | 63.5 | 1076 / 1078 (100%) | 0 | 0 |
| kc.serpent.Hydra 0.21 | 0.0% | 44 | 11 | 3 | 0.0 | 0 / 9033 (0%) | 0 | 0 |
| davidalves.Firebird 0.25 | 0.4% | 51 | 8 | 3 | 0.0 | 0 / 5918 (0%) | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 7.6% | 99 | 191 | 3 | 55.9 | 826 / 826 (100%) | 0 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 7.6% | 115 | 112 | 3 | 49.6 | 638 / 642 (99%) | 0 | 0 |
| ags.Midboss 1q.fast | 8.7% | 152 | 3942 | 3 | 55.6 | 771 / 774 (100%) | 0 | 0 |
| pez.rumble.CassiusClay 2rho.02no | 7.9% | 161 | 524 | 3 | 110.0 | 1718 / 1720 (100%) | 0 | 0 |
| Krabb.sliNk.Garm 0.9u | 6.4% | 86 | 54 | 3 | 53.8 | 725 / 725 (100%) | 0 | 0 |
| axeBots.SilverSurfer 2.53.33fix | 7.1% | 142 | 8862 | 3 | 42.9 | 548 / 548 (100%) | 0 | 0 |
| mn.Combat 3.25.0 | 9.1% | 177 | 100 | 3 | 110.7 | 1587 / 1589 (100%) | 0 | 0 |
| cs.s2.Seraphim 2.3.1 | 6.7% | 100 | 410 | 3 | 47.0 | 594 / 594 (100%) | 0 | 0 |
| fromHell.CHCl3 1.4.2 | 7.3% | 97 | 48 | 3 | 45.3 | 676 / 676 (100%) | 0 | 0 |
| jk.mini.CunobelinDC 1.2 | 1.1% | 76 | 9 | 3 | 0.0 | 0 / 13453 (0%) | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 8.7% | 199 | 361 | 3 | 96.2 | 1169 / 1170 (100%) | 0 | 0 |
| florent.test.Toad 0.14t | 7.7% | 128 | 310 | 3 | 51.0 | 693 / 695 (100%) | 0 | 0 |
| ar.horizon.Horizon 1.2.2 | 8.7% | 121 | 1582 | 3 | 69.9 | 1043 / 1044 (100%) | 0 | 0 |
| cjm.chalk.Chalk 2.6.Be | 0.0% | 52 | 11 | 3 | 0.0 | 0 / 7978 (0%) | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 1.7% | 45 | 4 | 3 | 0.0 | 0 / 8712 (0%) | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 7.6% | 155 | 11169 | 3 | 92.7 | 1204 / 1207 (100%) | 0 | 0 |
| pez.rumble.Ali 0.4.9 | 1.2% | 65 | 15 | 3 | 5.6 | 77 / 7454 (1%) | 0 | 0 |
| catcat20.Lambda 0.017 | 7.8% | 138 | 13923 | 3 | 62.9 | 864 / 866 (100%) | 0 | 0 |
| florent.XSeries.X2 0.17 | 6.9% | 99 | 107 | 3 | 46.4 | 523 / 523 (100%) | 0 | 0 |

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
| kc.mega.BeepBoop 2.0 | kc.mega.BeepBoop | 1 | 35 | 296 | 8.9% | 7.5% ± 0.9 | 5.4% | 20.8% / 20.4% | 0.1% | 0 / 0 | T3/M1 | 25% |
| jd.Nullstride 2.3.3 | jd.Nullstride | 1 | 35 | 288 | 7.8% | 6.5% ± 0.8 | 5.3% | 19.2% / 21.3% | 0.2% | 0 / 0 | T2/M2 | 28% |
| jk.mega.DrussGT 3.1.16 | jk.mega.DrussGT | 1 | 35 | 298 | 10.7% | 8.6% ± 1.2 | 7.9% | 23.7% / 22.0% | 1.7% | 0 / 0 | T3/M1 | 44% |
| oog.mega.saguaro.Saguaro 1.0 | oog.mega.saguaro.Saguaro | 1 | 35 | 328 | 8.6% | 7.8% ± 1.7 | 14.1% | 24.8% / 24.3% | 11.3% | 0 / 0 | T3/M1 | 73% |
| aaa.r.ScalarR 0.005h.053-noshield | aaa.r.ScalarR | 1 | 35 | 316 | 10.9% | 8.4% ± 1.0 | 7.2% | 23.9% / 21.2% | 0.1% | 0 / 0 | T3/M1 | 43% |
| voidious.Diamond 1.8.22 | voidious.Diamond | 1 | 35 | 302 | 8.8% | 7.5% ± 0.9 | 8.0% | 22.9% / 21.8% | 9.6% | 0 / 0 | T3/M1 | 51% |
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 1 | 35 | 310 | 9.4% | 8.2% ± 1.0 | 10.1% | 20.9% / 21.6% | 3.3% | 0 / 0 | T3/M1 | 50% |
| dsekercioglu.mega.Raven 3.56j8 | dsekercioglu.mega.Raven | 1 | 35 | 330 | 9.2% | 7.2% ± 1.0 | 10.2% | 21.4% / 21.4% | 11.7% | 0 / 0 | T3/M1 | 50% |
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 1 | 35 | 314 | 10.7% | 7.9% ± 0.9 | 11.5% | 23.5% / 22.9% | 8.3% | 0 / 0 | T3/M1 | 55% |
| lxx.Tomcat 3.68 | lxx.Tomcat | 1 | 35 | 274 | 10.9% | 8.9% ± 0.9 | 10.8% | 22.8% / 21.8% | 9.1% | 0 / 0 | T3/M1 | 60% |
| rsalesc.mega.Knight 0.6.28 | rsalesc.mega.Knight | 1 | 35 | 314 | 10.2% | 8.2% ± 0.9 | 9.7% | 23.8% / 22.5% | 12.8% | 0 / 0 | T3/M1 | 49% |
| aw.Gilgalad 1.99.5c | aw.Gilgalad | 1 | 35 | 284 | 10.4% | 8.0% ± 0.9 | 10.0% | 21.4% / 21.6% | 4.5% | 0 / 0 | T3/M1 | 41% |
| pc.Wavelet 1.5 | pc.Wavelet | 1 | 35 | 272 | 9.7% | 7.0% ± 0.9 | 10.2% | 21.9% / 22.3% | 9.6% | 0 / 0 | T2/M1 | 45% |
| gh.GresSuffurd 0.4.13 | gh.GresSuffurd | 1 | 35 | 294 | 9.9% | 7.9% ± 1.1 | 10.7% | 23.0% / 21.9% | 12.4% | 0 / 0 | T3/M1 | 55% |
| kc.serpent.WaveSerpent 2.11 | kc.serpent.WaveSerpent | 1 | 35 | 322 | 7.7% | 7.1% ± 1.2 | 8.5% | 22.4% / 23.3% | 12.7% | 0 / 0 | T3/M1 | 63% |
| dsekercioglu.mega.WhiteFang 2.8.1 | dsekercioglu.mega.WhiteFang | 1 | 35 | 344 | 8.0% | 6.8% ± 1.0 | 11.3% | 23.3% / 22.2% | 14.2% | 0 / 0 | T2/M1 | 70% |
| cs.Nene 1.0.5 | cs.Nene | 1 | 35 | 264 | 8.7% | 7.5% ± 1.2 | 9.7% | 25.5% / 23.8% | 9.0% | 0 / 0 | T3/M0 | 49% |
| jk.melee.Neuromancer 7.12 | jk.melee.Neuromancer | 1 | 35 | 314 | 10.6% | 9.1% ± 1.0 | 9.9% | 22.9% / 22.7% | 0.0% | 0 / 0 | T3/M1 | 51% |
| voidious.Dookious 1.573c | voidious.Dookious | 1 | 35 | 306 | 7.5% | 6.7% ± 1.2 | 9.8% | 23.1% / 23.5% | 11.7% | 0 / 0 | T2/M1 | 60% |
| davidalves.Phoenix 1.02 | davidalves.Phoenix | 1 | 35 | 306 | 0.1% | 40.8% ± 32.5 | 0.0% | - / - | 3.2% | 0 / 0 | T?/M? | 99% |
| rsalesc.roborio.Roborio 1.2.4 | rsalesc.roborio.Roborio | 1 | 35 | 328 | 9.4% | 7.2% ± 0.9 | 11.3% | 23.6% / 21.0% | 13.2% | 0 / 0 | T3/M1 | 60% |
| cb.Domogled 1.2 | cb.Domogled | 1 | 35 | 276 | 7.5% | 6.3% ± 0.9 | 11.2% | 22.8% / 21.9% | 2.9% | 0 / 0 | T2/M1 | 56% |
| mue.Ascendant 1.2.27 | mue.Ascendant | 1 | 35 | 290 | 9.3% | 7.4% ± 1.3 | 10.9% | 21.2% / 21.6% | 4.9% | 0 / 0 | T3/M1 | 57% |
| abc.Shadow 3.83c | abc.Shadow | 1 | 35 | 276 | 9.0% | 7.5% ± 1.2 | 10.1% | 20.3% / 20.9% | 8.5% | 0 / 0 | T3/M1 | 54% |
| darkcanuck.Pris 0.92 | darkcanuck.Pris | 1 | 35 | 294 | 8.2% | 6.6% ± 1.3 | 11.0% | 25.5% / 21.9% | 9.2% | 0 / 0 | T2/M0 | 71% |
| fromHell.BlackBox 0.0.2 | fromHell.BlackBox | 1 | 35 | 304 | 8.3% | 6.6% ± 1.2 | 14.3% | 26.0% / 26.1% | 3.4% | 0 / 0 | T2/M0 | 69% |
| jk.precise.Wintermute 0.8 | jk.precise.Wintermute | 1 | 35 | 316 | 8.7% | 7.5% ± 1.1 | 10.9% | 23.6% / 23.5% | 8.0% | 0 / 0 | T3/M1 | 61% |
| kc.serpent.Hydra 0.21 | kc.serpent.Hydra | 1 | 35 | 298 | 0.0% | 23.8% ± 39.4 | 0.7% | - / - | 1.1% | 0 / 0 | T?/M? | 100% |
| davidalves.Firebird 0.25 | davidalves.Firebird | 1 | 35 | 310 | 0.8% | 90.1% ± 19.6 | 0.3% | - / - | 3.2% | 0 / 0 | T?/M? | 91% |
| pulsar.PulsarMax 0.8.9 | pulsar.PulsarMax | 1 | 35 | 300 | 7.8% | 8.0% ± 1.3 | 9.1% | 21.6% / 22.4% | 3.3% | 0 / 0 | T3/M1 | 58% |
| zyx.mega.YersiniaPestis 3.0 | zyx.mega.YersiniaPestis | 1 | 35 | 324 | 8.2% | 7.4% ± 1.3 | 9.5% | 23.8% / 22.0% | 9.7% | 0 / 0 | T3/M1 | 55% |
| ags.Midboss 1q.fast | ags.Midboss | 1 | 35 | 284 | 10.1% | 7.1% ± 1.2 | 12.1% | 24.8% / 23.5% | 7.7% | 0 / 0 | T3/M1 | 71% |
| pez.rumble.CassiusClay 2rho.02no | pez.rumble.CassiusClay | 1 | 35 | 332 | 10.0% | 7.8% ± 1.0 | 11.5% | 20.7% / 20.9% | 9.3% | 0 / 0 | T3/M1 | 64% |
| Krabb.sliNk.Garm 0.9u | Krabb.sliNk.Garm | 1 | 35 | 298 | 5.9% | 6.2% ± 1.2 | 11.1% | 26.0% / 26.4% | 6.1% | 0 / 0 | T2/M0 | 80% |
| axeBots.SilverSurfer 2.53.33fix | axeBots.SilverSurfer | 1 | 35 | 326 | 9.5% | 9.0% ± 1.5 | 12.9% | 26.2% / 26.6% | 12.2% | 0 / 0 | T3/M0 | 63% |
| mn.Combat 3.25.0 | mn.Combat | 1 | 35 | 274 | 9.2% | 7.6% ± 0.9 | 10.1% | 22.5% / 21.8% | 11.3% | 0 / 0 | T3/M1 | 51% |
| cs.s2.Seraphim 2.3.1 | cs.s2.Seraphim | 1 | 35 | 292 | 6.7% | 6.5% ± 1.3 | 10.6% | 26.4% / 23.1% | 17.5% | 0 / 0 | T2/M0 | 73% |
| fromHell.CHCl3 1.4.2 | fromHell.CHCl3 | 1 | 35 | 292 | 8.5% | 7.1% ± 1.4 | 12.9% | 23.6% / 23.4% | 3.3% | 0 / 0 | T3/M1 | 71% |
| jk.mini.CunobelinDC 1.2 | jk.mini.CunobelinDC | 1 | 35 | 308 | 1.2% | 58.3% ± 30.8 | 31.8% | 18.1% / 24.2% | 3.3% | 0 / 0 | T?/M? | 98% |
| sheldor.mini.Foilist 1.3.1 | sheldor.mini.Foilist | 1 | 35 | 316 | 8.9% | 8.9% ± 1.1 | 10.9% | 25.7% / 25.3% | 7.2% | 0 / 0 | T3/M0 | 73% |
| florent.test.Toad 0.14t | florent.test.Toad | 1 | 35 | 304 | 8.7% | 8.1% ± 1.3 | 10.4% | 20.4% / 22.4% | 3.3% | 0 / 0 | T3/M2 | 54% |
| ar.horizon.Horizon 1.2.2 | ar.horizon.Horizon | 1 | 35 | 308 | 10.2% | 9.0% ± 1.2 | 10.5% | 22.8% / 21.5% | 8.6% | 0 / 0 | T3/M1 | 53% |
| cjm.chalk.Chalk 2.6.Be | cjm.chalk.Chalk | 1 | 35 | 298 | 0.0% | - | 0.0% | - / - | 2.1% | 0 / 0 | T?/M? | 100% |
| wcsv.PowerHouse.PowerHouse 1.7e3 | wcsv.PowerHouse.PowerHouse | 1 | 35 | 340 | 1.2% | 0.0% ± 24.8 | 10.9% | 46.5% / 9.8% | 6.2% | 0 / 0 | T?/M? | 100% |
| sheldor.mini.FoilistMC 1.0 | sheldor.mini.FoilistMC | 1 | 35 | 320 | 7.2% | 7.1% ± 1.0 | 11.1% | 23.7% / 24.6% | 3.7% | 0 / 0 | T3/M1 | 71% |
| pez.rumble.Ali 0.4.9 | pez.rumble.Ali | 1 | 35 | 292 | 1.7% | 8.5% ± 3.1 | 5.6% | 17.0% / 29.5% | 4.1% | 0 / 0 | T?/M? | 84% |
| catcat20.Lambda 0.017 | catcat20.Lambda | 1 | 35 | 296 | 8.3% | 8.1% ± 1.2 | 11.1% | 26.5% / 24.4% | 1.2% | 0 / 0 | T3/M0 | 67% |
| florent.XSeries.X2 0.17 | florent.XSeries.X2 | 1 | 35 | 306 | 8.4% | 7.8% ± 1.4 | 10.6% | 20.0% / 21.8% | 6.2% | 0 / 0 | T3/M1 | 61% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.14hjswhcpkw2 vs hadur2.Hadur 3.14hjsw

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 27.2% ± 3.2 | 29.2% ± 11.8 | -2.0 ± 11.5 |
| jd.Nullstride 2.3.3 | 22.9% ± 6.4 | 26.0% ± 10.4 | -3.1 ± 13.9 |
| jk.mega.DrussGT 3.1.16 | 44.1% ± 6.8 | 46.4% ± 2.4 | -2.3 ± 6.9 |
| oog.mega.saguaro.Saguaro 1.0 | 79.0% ± 7.9 | 74.5% ± 9.3 | +4.5 ± 15.9 |
| aaa.r.ScalarR 0.005h.053-noshield | 36.6% ± 8.4 | 27.8% ± 8.1 | +8.9 ± 15.9 |
| voidious.Diamond 1.8.22 | 50.8% ± 11.3 | 48.2% ± 8.7 | +2.6 ± 17.1 |
| cb.fire.Firestarter 2.0f | 48.9% ± 9.0 | 58.0% ± 10.6 | -9.1 ± 10.2 |
| dsekercioglu.mega.Raven 3.56j8 | 57.7% ± 8.7 | 54.1% ± 5.3 | +3.6 ± 11.9 |
| xander.cat.XanderCat 12.9 | 58.2% ± 10.5 | 55.2% ± 13.1 | +3.0 ± 14.5 |
| lxx.Tomcat 3.68 | 60.4% ± 7.8 | 53.7% ± 9.3 | +6.7 ± 8.0 |
| rsalesc.mega.Knight 0.6.28 | 50.7% ± 7.2 | 55.1% ± 9.5 | -4.5 ± 12.4 |
| aw.Gilgalad 1.99.5c | 48.2% ± 12.4 | 41.4% ± 7.4 | +6.8 ± 19.6 |
| pc.Wavelet 1.5 | 44.1% ± 8.9 | 45.9% ± 12.0 | -1.8 ± 14.4 |
| gh.GresSuffurd 0.4.13 | 61.2% ± 9.1 | 61.6% ± 6.6 | -0.4 ± 11.3 |
| kc.serpent.WaveSerpent 2.11 | 57.9% ± 11.6 | 60.4% ± 1.5 | -2.5 ± 12.8 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 66.5% ± 7.7 | 64.0% ± 6.6 | +2.6 ± 12.7 |
| cs.Nene 1.0.5 | 58.0% ± 9.8 | 55.1% ± 8.6 | +2.9 ± 11.8 |
| jk.melee.Neuromancer 7.12 | 51.1% ± 3.0 | 53.5% ± 12.0 | -2.5 ± 10.3 |
| voidious.Dookious 1.573c | 60.7% ± 5.1 | 57.9% ± 13.1 | +2.8 ± 16.4 |
| davidalves.Phoenix 1.02 | 98.8% ± 0.4 | 98.8% ± 0.8 | +0.0 ± 0.7 |
| rsalesc.roborio.Roborio 1.2.4 | 59.5% ± 3.3 | 59.5% ± 7.4 | +0.1 ± 9.3 |
| cb.Domogled 1.2 | 64.4% ± 9.1 | 60.6% ± 6.7 | +3.9 ± 14.3 |
| mue.Ascendant 1.2.27 | 58.7% ± 9.9 | 59.6% ± 5.7 | -0.9 ± 6.8 |
| abc.Shadow 3.83c | 52.9% ± 4.4 | 50.3% ± 16.1 | +2.5 ± 13.9 |
| darkcanuck.Pris 0.92 | 65.0% ± 10.4 | 63.6% ± 5.8 | +1.4 ± 15.8 |
| fromHell.BlackBox 0.0.2 | 66.4% ± 7.1 | 66.5% ± 6.3 | -0.1 ± 3.3 |
| jk.precise.Wintermute 0.8 | 61.0% ± 3.3 | 58.3% ± 7.0 | +2.6 ± 8.6 |
| kc.serpent.Hydra 0.21 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 |
| davidalves.Firebird 0.25 | 93.6% ± 3.0 | 94.4% ± 5.0 | -0.8 ± 2.9 |
| pulsar.PulsarMax 0.8.9 | 59.9% ± 1.6 | 56.7% ± 7.1 | +3.2 ± 7.0 |
| zyx.mega.YersiniaPestis 3.0 | 58.5% ± 3.4 | 50.3% ± 9.4 | +8.2 ± 12.2 |
| ags.Midboss 1q.fast | 71.8% ± 4.5 | 69.7% ± 8.6 | +2.1 ± 13.0 |
| pez.rumble.CassiusClay 2rho.02no | 57.1% ± 10.2 | 63.9% ± 4.4 | -6.8 ± 14.0 |
| Krabb.sliNk.Garm 0.9u | 67.9% ± 14.4 | 69.9% ± 0.5 | -2.0 ± 14.1 |
| axeBots.SilverSurfer 2.53.33fix | 62.8% ± 14.0 | 64.4% ± 8.4 | -1.6 ± 14.6 |
| mn.Combat 3.25.0 | 54.5% ± 7.2 | 61.2% ± 4.2 | -6.7 ± 9.1 |
| cs.s2.Seraphim 2.3.1 | 68.9% ± 7.7 | 68.8% ± 4.9 | +0.0 ± 11.5 |
| fromHell.CHCl3 1.4.2 | 73.1% ± 5.1 | 64.7% ± 5.9 | +8.4 ± 5.3 |
| jk.mini.CunobelinDC 1.2 | 97.8% ± 0.6 | 98.0% ± 0.6 | -0.2 ± 0.7 |
| sheldor.mini.Foilist 1.3.1 | 63.6% ± 10.8 | 70.8% ± 7.4 | -7.2 ± 7.2 |
| florent.test.Toad 0.14t | 60.5% ± 9.7 | 61.5% ± 4.8 | -1.0 ± 8.6 |
| ar.horizon.Horizon 1.2.2 | 61.6% ± 10.6 | 57.7% ± 4.1 | +3.9 ± 7.4 |
| cjm.chalk.Chalk 2.6.Be | 99.8% ± 0.4 | 99.8% ± 0.4 | +0.0 ± 0.0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 99.0% ± 1.5 | 98.0% ± 3.6 | +1.1 ± 4.4 |
| sheldor.mini.FoilistMC 1.0 | 71.5% ± 2.0 | 70.0% ± 2.9 | +1.6 ± 2.8 |
| pez.rumble.Ali 0.4.9 | 89.6% ± 12.0 | 76.9% ± 7.5 | +12.7 ± 5.8 |
| catcat20.Lambda 0.017 | 64.9% ± 5.3 | 64.0% ± 12.9 | +1.0 ± 10.3 |
| florent.XSeries.X2 0.17 | 68.4% ± 9.2 | 64.1% ± 8.4 | +4.3 ± 11.7 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | -2.0 ± 11.5 | -2.1 ± 13.6 | -2.1 ± 13.6 | -0.8 ± 8.1 |
| jd.Nullstride 2.3.3 | -3.1 ± 13.9 | -2.1 ± 16.3 | -2.1 ± 16.3 | -2.4 ± 10.4 |
| jk.mega.DrussGT 3.1.16 | -2.3 ± 6.9 | -4.7 ± 10.4 | -4.3 ± 10.8 | +0.3 ± 4.7 |
| oog.mega.saguaro.Saguaro 1.0 | +4.5 ± 15.9 | +3.6 ± 19.4 | +3.6 ± 19.4 | +4.6 ± 14.0 |
| aaa.r.ScalarR 0.005h.053-noshield | +8.9 ± 15.9 | +13.8 ± 26.4 | +14.3 ± 26.0 | +3.3 ± 3.6 |
| voidious.Diamond 1.8.22 | +2.6 ± 17.1 | +3.6 ± 26.6 | +3.6 ± 26.6 | +1.0 ± 6.5 |
| cb.fire.Firestarter 2.0f | -9.1 ± 10.2 | -13.6 ± 20.8 | -13.6 ± 20.8 | -4.1 ± 2.8 |
| dsekercioglu.mega.Raven 3.56j8 | +3.6 ± 11.9 | +4.3 ± 18.7 | +4.3 ± 18.7 | +1.3 ± 5.9 |
| xander.cat.XanderCat 12.9 | +3.0 ± 14.5 | +1.4 ± 20.5 | +1.4 ± 20.5 | +3.8 ± 8.2 |
| lxx.Tomcat 3.68 | +6.7 ± 8.0 | +8.6 ± 16.6 | +8.6 ± 16.6 | +4.0 ± 2.4 |
| rsalesc.mega.Knight 0.6.28 | -4.5 ± 12.4 | -7.1 ± 18.4 | -7.1 ± 18.4 | -1.8 ± 9.1 |
| aw.Gilgalad 1.99.5c | +6.8 ± 19.6 | +10.0 ± 29.8 | +10.0 ± 29.8 | +2.8 ± 10.1 |
| pc.Wavelet 1.5 | -1.8 ± 14.4 | -0.7 ± 26.6 | -0.7 ± 26.6 | -2.3 ± 2.2 |
| gh.GresSuffurd 0.4.13 | -0.4 ± 11.3 | -0.5 ± 13.7 | -0.7 ± 13.6 | -1.0 ± 9.1 |
| kc.serpent.WaveSerpent 2.11 | -2.5 ± 12.8 | -5.3 ± 16.7 | -5.0 ± 15.9 | -0.2 ± 5.5 |
| dsekercioglu.mega.WhiteFang 2.8.1 | +2.6 ± 12.7 | +3.7 ± 20.8 | +3.6 ± 20.8 | +1.4 ± 5.0 |
| cs.Nene 1.0.5 | +2.9 ± 11.8 | +5.7 ± 17.4 | +5.7 ± 17.4 | -0.5 ± 6.2 |
| jk.melee.Neuromancer 7.12 | -2.5 ± 10.3 | -7.9 ± 19.8 | -7.9 ± 19.8 | +2.2 ± 3.5 |
| voidious.Dookious 1.573c | +2.8 ± 16.4 | +3.6 ± 26.6 | +3.6 ± 26.6 | +2.1 ± 9.9 |
| davidalves.Phoenix 1.02 | +0.0 ± 0.7 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| rsalesc.roborio.Roborio 1.2.4 | +0.1 ± 9.3 | +0.7 ± 16.3 | +0.7 ± 16.3 | -0.9 ± 4.9 |
| cb.Domogled 1.2 | +3.9 ± 14.3 | +4.0 ± 24.9 | +4.3 ± 24.8 | +3.5 ± 3.3 |
| mue.Ascendant 1.2.27 | -0.9 ± 6.8 | +0.7 ± 4.4 | +0.7 ± 4.4 | -1.6 ± 12.6 |
| abc.Shadow 3.83c | +2.5 ± 13.9 | +2.1 ± 21.8 | +2.1 ± 21.8 | +2.1 ± 7.3 |
| darkcanuck.Pris 0.92 | +1.4 ± 15.8 | +3.6 ± 21.8 | +3.6 ± 21.8 | -1.1 ± 10.4 |
| fromHell.BlackBox 0.0.2 | -0.1 ± 3.3 | +0.7 ± 8.6 | +0.7 ± 8.6 | -0.3 ± 2.2 |
| jk.precise.Wintermute 0.8 | +2.6 ± 8.6 | +4.5 ± 11.4 | +4.3 ± 11.4 | +0.4 ± 7.2 |
| kc.serpent.Hydra 0.21 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +12.5 ± 39.8 |
| davidalves.Firebird 0.25 | -0.8 ± 2.9 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| pulsar.PulsarMax 0.8.9 | +3.2 ± 7.0 | +7.1 ± 13.1 | +7.1 ± 13.1 | -1.4 ± 3.5 |
| zyx.mega.YersiniaPestis 3.0 | +8.2 ± 12.2 | +9.3 ± 16.3 | +9.3 ± 16.3 | +5.4 ± 9.1 |
| ags.Midboss 1q.fast | +2.1 ± 13.0 | +2.9 ± 19.6 | +2.9 ± 19.6 | +1.1 ± 6.1 |
| pez.rumble.CassiusClay 2rho.02no | -6.8 ± 14.0 | -9.3 ± 23.3 | -9.3 ± 23.3 | -4.0 ± 6.1 |
| Krabb.sliNk.Garm 0.9u | -2.0 ± 14.1 | -2.9 ± 15.7 | -2.9 ± 15.7 | -1.0 ± 11.9 |
| axeBots.SilverSurfer 2.53.33fix | -1.6 ± 14.6 | -3.6 ± 15.9 | -3.6 ± 15.9 | -0.5 ± 11.2 |
| mn.Combat 3.25.0 | -6.7 ± 9.1 | -9.6 ± 16.4 | -9.3 ± 15.9 | -3.5 ± 2.0 |
| cs.s2.Seraphim 2.3.1 | +0.0 ± 11.5 | +0.7 ± 15.0 | +0.7 ± 15.0 | -2.0 ± 8.9 |
| fromHell.CHCl3 1.4.2 | +8.4 ± 5.3 | +11.4 ± 9.1 | +11.4 ± 9.1 | +4.6 ± 4.6 |
| jk.mini.CunobelinDC 1.2 | -0.2 ± 0.7 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.2 ± 0.8 |
| sheldor.mini.Foilist 1.3.1 | -7.2 ± 7.2 | -8.6 ± 6.4 | -8.6 ± 6.4 | -6.2 ± 12.1 |
| florent.test.Toad 0.14t | -1.0 ± 8.6 | +0.6 ± 11.6 | +0.7 ± 11.4 | -3.7 ± 5.3 |
| ar.horizon.Horizon 1.2.2 | +3.9 ± 7.4 | +7.9 ± 10.1 | +7.9 ± 10.1 | -0.5 ± 7.8 |
| cjm.chalk.Chalk 2.6.Be | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | +1.1 ± 4.4 | +0.7 ± 2.3 | +0.7 ± 2.3 | +3.2 ± 12.3 |
| sheldor.mini.FoilistMC 1.0 | +1.6 ± 2.8 | +2.1 ± 4.4 | +2.1 ± 4.4 | +0.7 ± 6.8 |
| pez.rumble.Ali 0.4.9 | +12.7 ± 5.8 | +5.0 ± 7.8 | +5.0 ± 7.8 | -20.9 ± 25.4 |
| catcat20.Lambda 0.017 | +1.0 ± 10.3 | +1.3 ± 14.4 | +1.4 ± 14.1 | +0.7 ± 8.5 |
| florent.XSeries.X2 0.17 | +4.3 ± 11.7 | +3.6 ± 14.6 | +3.6 ± 14.6 | +5.1 ± 8.2 |
| All pairs | +0.9 ± 1.1 | +1.0 ± 1.5 | +1.1 ± 1.5 | +0.1 ± 1.0 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or, for a Hadur build, a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 3 | -2.0 ± 11.5 | -4.8 ± 14.3 |
| jd.Nullstride 2.3.3 | 4 | 0 | -3.1 ± 13.9 | n/a |
| jk.mega.DrussGT 3.1.16 | 4 | 0 | -2.3 ± 6.9 | n/a |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 4 | +4.5 ± 15.9 | +4.5 ± 15.9 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 1 | +8.9 ± 15.9 | +3.8 |
| voidious.Diamond 1.8.22 | 4 | 0 | +2.6 ± 17.1 | n/a |
| cb.fire.Firestarter 2.0f | 4 | 1 | -9.1 ± 10.2 | +0.1 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 3 | +3.6 ± 11.9 | +3.5 ± 22.8 |
| xander.cat.XanderCat 12.9 | 4 | 3 | +3.0 ± 14.5 | +1.4 ± 26.2 |
| lxx.Tomcat 3.68 | 4 | 0 | +6.7 ± 8.0 | n/a |
| rsalesc.mega.Knight 0.6.28 | 4 | 0 | -4.5 ± 12.4 | n/a |
| aw.Gilgalad 1.99.5c | 4 | 0 | +6.8 ± 19.6 | n/a |
| pc.Wavelet 1.5 | 4 | 2 | -1.8 ± 14.4 | +0.5 ± 111.3 |
| gh.GresSuffurd 0.4.13 | 4 | 2 | -0.4 ± 11.3 | +5.5 ± 0.9 |
| kc.serpent.WaveSerpent 2.11 | 4 | 2 | -2.5 ± 12.8 | -1.7 ± 55.0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 2 | +2.6 ± 12.7 | +2.8 ± 13.1 |
| cs.Nene 1.0.5 | 4 | 4 | +2.9 ± 11.8 | +2.9 ± 11.8 |
| jk.melee.Neuromancer 7.12 | 4 | 1 | -2.5 ± 10.3 | +2.5 |
| voidious.Dookious 1.573c | 4 | 2 | +2.8 ± 16.4 | +9.9 ± 2.3 |
| davidalves.Phoenix 1.02 | 4 | 4 | +0.0 ± 0.7 | +0.0 ± 0.7 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 1 | +0.1 ± 9.3 | +1.8 |
| cb.Domogled 1.2 | 4 | 3 | +3.9 ± 14.3 | +4.6 ± 27.0 |
| mue.Ascendant 1.2.27 | 4 | 3 | -0.9 ± 6.8 | -2.1 ± 10.8 |
| abc.Shadow 3.83c | 4 | 2 | +2.5 ± 13.9 | +8.5 ± 31.3 |
| darkcanuck.Pris 0.92 | 4 | 4 | +1.4 ± 15.8 | +1.4 ± 15.8 |
| fromHell.BlackBox 0.0.2 | 4 | 3 | -0.1 ± 3.3 | +0.3 ± 6.0 |
| jk.precise.Wintermute 0.8 | 4 | 1 | +2.6 ± 8.6 | -2.6 |
| kc.serpent.Hydra 0.21 | 4 | 4 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| davidalves.Firebird 0.25 | 4 | 3 | -0.8 ± 2.9 | -1.4 ± 4.4 |
| pulsar.PulsarMax 0.8.9 | 4 | 2 | +3.2 ± 7.0 | +2.6 ± 67.0 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 3 | +8.2 ± 12.2 | +9.9 ± 21.0 |
| ags.Midboss 1q.fast | 4 | 2 | +2.1 ± 13.0 | +3.8 ± 120.6 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 0 | -6.8 ± 14.0 | n/a |
| Krabb.sliNk.Garm 0.9u | 4 | 3 | -2.0 ± 14.1 | +0.1 ± 23.8 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 2 | -1.6 ± 14.6 | +2.2 ± 106.0 |
| mn.Combat 3.25.0 | 4 | 4 | -6.7 ± 9.1 | -6.7 ± 9.1 |
| cs.s2.Seraphim 2.3.1 | 4 | 4 | +0.0 ± 11.5 | +0.0 ± 11.5 |
| fromHell.CHCl3 1.4.2 | 4 | 2 | +8.4 ± 5.3 | +7.7 ± 48.2 |
| jk.mini.CunobelinDC 1.2 | 4 | 4 | -0.2 ± 0.7 | -0.2 ± 0.7 |
| sheldor.mini.Foilist 1.3.1 | 4 | 2 | -7.2 ± 7.2 | -7.6 ± 63.4 |
| florent.test.Toad 0.14t | 4 | 2 | -1.0 ± 8.6 | -3.0 ± 65.5 |
| ar.horizon.Horizon 1.2.2 | 4 | 2 | +3.9 ± 7.4 | +5.0 ± 46.1 |
| cjm.chalk.Chalk 2.6.Be | 4 | 4 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 3 | +1.1 ± 4.4 | -0.3 ± 1.2 |
| sheldor.mini.FoilistMC 1.0 | 4 | 3 | +1.6 ± 2.8 | +1.8 ± 5.1 |
| pez.rumble.Ali 0.4.9 | 4 | 3 | +12.7 ± 5.8 | +13.0 ± 11.0 |
| catcat20.Lambda 0.017 | 4 | 4 | +1.0 ± 10.3 | +1.0 ± 10.3 |
| florent.XSeries.X2 0.17 | 4 | 4 | +4.3 ± 11.7 | +4.3 ± 11.7 |
| All pairs | 192 | 111 | +0.9 ± 1.1 | +1.7 ± 1.3 |

# Bench: hadur2.Hadur 3.14hjswhcpkw2 baseline (hadur2.Hadur 3.14hjsw) (cold)

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 8228 over 192 battles (42.9 per battle, most in one battle 104). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rank1-band1 | 29.2% ± 11.8 | 16.4% ± 16.3 | 45.6% ± 5.2 | 23 / 140 | 5.6% ± 1.1 | 9.5% ± 1.1 | 244 | 0 | 1.94 / 648.4 |
| jd.Nullstride 2.3.3 | rank2-band1 | 26.0% ± 10.4 | 12.1% ± 12.0 | 44.5% ± 7.5 | 17 / 140 | 5.2% ± 0.8 | 8.9% ± 0.8 | 241 | 0 | 1.75 / 601.7 |
| jk.mega.DrussGT 3.1.16 | rank3-band1 | 46.4% ± 2.4 | 46.4% ± 4.4 | 46.4% ± 3.2 | 65 / 140 | 7.7% ± 0.3 | 10.6% ± 0.8 | 349 | 0 | 1.45 / 623.1 |
| oog.mega.saguaro.Saguaro 1.0 | rank4-band1 | 74.5% ± 9.3 | 87.1% ± 11.9 | 62.8% ± 10.3 | 122 / 140 | 18.7% ± 2.3 | 6.5% ± 0.9 | 70 | 0 | 2.15 / 349.8 |
| aaa.r.ScalarR 0.005h.053-noshield | rank5-band1 | 27.8% ± 8.1 | 17.9% ± 13.1 | 39.2% ± 3.0 | 25 / 140 | 6.9% ± 0.2 | 10.7% ± 0.6 | 285 | 0 | 1.68 / 511.5 |
| voidious.Diamond 1.8.22 | rank6-band1 | 48.2% ± 8.7 | 55.7% ± 15.1 | 40.1% ± 2.7 | 78 / 140 | 7.0% ± 0.8 | 9.4% ± 0.7 | 266 | 0 | 1.64 / 318.0 |
| cb.fire.Firestarter 2.0f | rank7-band1 | 58.0% ± 10.6 | 60.7% ± 18.7 | 55.1% ± 2.6 | 85 / 140 | 9.0% ± 0.2 | 10.0% ± 0.2 | 301 | 0 | 1.73 / 202.7 |
| dsekercioglu.mega.Raven 3.56j8 | rank8-band1 | 54.1% ± 5.3 | 70.0% ± 5.9 | 38.5% ± 4.4 | 98 / 140 | 9.8% ± 1.3 | 9.8% ± 0.5 | 190 | 0 | 1.21 / 28.7 |
| xander.cat.XanderCat 12.9 | rank9-band1 | 55.2% ± 13.1 | 62.9% ± 17.8 | 48.3% ± 7.3 | 88 / 140 | 11.2% ± 0.8 | 9.1% ± 1.6 | 175 | 0 | 1.20 / 17.9 |
| lxx.Tomcat 3.68 | rank10-band1 | 53.7% ± 9.3 | 65.7% ± 15.3 | 42.6% ± 2.6 | 92 / 140 | 9.9% ± 0.8 | 11.3% ± 0.4 | 303 | 0 | 1.95 / 56.0 |
| rsalesc.mega.Knight 0.6.28 | rank11-band2 | 55.1% ± 9.5 | 57.1% ± 14.4 | 52.7% ± 5.3 | 80 / 140 | 9.9% ± 0.8 | 10.5% ± 0.6 | 302 | 0 | 2.01 / 280.9 |
| aw.Gilgalad 1.99.5c | rank12-band2 | 41.4% ± 7.4 | 46.4% ± 13.1 | 37.3% ± 2.5 | 65 / 140 | 9.3% ± 2.9 | 10.9% ± 1.4 | 254 | 0 | 1.47 / 22.6 |
| pc.Wavelet 1.5 | rank13-band2 | 45.9% ± 12.0 | 39.3% ± 23.9 | 53.1% ± 1.9 | 55 / 140 | 10.4% ± 1.3 | 9.1% ± 1.3 | 187 | 0 | 2.04 / 464.4 |
| gh.GresSuffurd 0.4.13 | rank14-band2 | 61.6% ± 6.6 | 74.8% ± 10.0 | 48.5% ± 3.4 | 105 / 140 | 11.3% ± 0.1 | 9.1% ± 1.1 | 203 | 0 | 1.05 / 224.7 |
| kc.serpent.WaveSerpent 2.11 | rank15-band2 | 60.4% ± 1.5 | 77.9% ± 2.3 | 41.7% ± 2.6 | 109 / 140 | 9.4% ± 1.3 | 7.9% ± 0.9 | 101 | 0 | 2.11 / 357.5 |
| dsekercioglu.mega.WhiteFang 2.8.1 | rank16-band2 | 64.0% ± 6.6 | 77.0% ± 9.7 | 49.7% ± 4.4 | 108 / 140 | 10.6% ± 0.6 | 7.9% ± 0.6 | 183 | 0 | 1.20 / 544.5 |
| cs.Nene 1.0.5 | rank17-band2 | 55.1% ± 8.6 | 68.6% ± 13.4 | 41.8% ± 4.1 | 96 / 140 | 10.1% ± 0.4 | 8.0% ± 1.0 | 97 | 0 | 1.27 / 278.4 |
| jk.melee.Neuromancer 7.12 | rank18-band2 | 53.5% ± 12.0 | 60.0% ± 19.6 | 47.8% ± 4.6 | 84 / 140 | 9.8% ± 1.1 | 10.0% ± 0.8 | 283 | 0 | 1.69 / 483.6 |
| voidious.Dookious 1.573c | rank19-band2 | 57.9% ± 13.1 | 71.4% ± 19.3 | 42.9% ± 5.5 | 100 / 140 | 9.5% ± 0.6 | 7.1% ± 0.8 | 115 | 0 | 1.24 / 117.9 |
| davidalves.Phoenix 1.02 | rank21-band2 | 98.8% ± 0.8 | 100.0% ± 0.0 | 0.0% ± 0.0 | 140 / 140 | 0.0% ± 0.0 | 0.1% ± 0.1 | 77 | 0 | 0.52 / 20.8 |
| rsalesc.roborio.Roborio 1.2.4 | rank22-band2 | 59.5% ± 7.4 | 52.9% ± 11.4 | 64.6% ± 4.3 | 74 / 140 | 12.2% ± 0.8 | 9.1% ± 0.4 | 248 | 0 | 1.59 / 454.0 |
| cb.Domogled 1.2 | rank23-band2 | 60.6% ± 6.7 | 55.0% ± 17.2 | 64.8% ± 4.0 | 77 / 140 | 11.2% ± 0.9 | 8.1% ± 0.7 | 262 | 0 | 0.99 / 79.0 |
| mue.Ascendant 1.2.27 | rank24-band2 | 59.6% ± 5.7 | 73.6% ± 7.8 | 46.1% ± 5.3 | 103 / 140 | 11.1% ± 0.5 | 7.7% ± 1.1 | 106 | 0 | 1.00 / 13.2 |
| abc.Shadow 3.83c | rank25-band2 | 50.3% ± 16.1 | 64.3% ± 25.9 | 37.6% ± 7.4 | 90 / 140 | 10.0% ± 0.9 | 9.4% ± 0.9 | 166 | 0 | 1.16 / 17.6 |
| darkcanuck.Pris 0.92 | rank26-band2 | 63.6% ± 5.8 | 76.4% ± 7.8 | 51.8% ± 4.1 | 107 / 140 | 12.1% ± 0.4 | 8.5% ± 1.0 | 95 | 0 | 1.87 / 12.8 |
| fromHell.BlackBox 0.0.2 | rank27-band2 | 66.5% ± 6.3 | 77.9% ± 10.1 | 54.8% ± 5.0 | 109 / 140 | 13.7% ± 1.4 | 8.0% ± 0.5 | 136 | 0 | 1.05 / 12.8 |
| jk.precise.Wintermute 0.8 | rank28-band2 | 58.3% ± 7.0 | 72.6% ± 10.8 | 44.5% ± 7.6 | 102 / 140 | 10.6% ± 1.0 | 8.7% ± 0.4 | 149 | 0 | 1.29 / 185.0 |
| kc.serpent.Hydra 0.21 | rank29-band2 | 100.0% ± 0.0 | 100.0% ± 0.0 | 37.5% ± 39.8 | 140 / 140 | 0.0% ± 0.0 | 0.0% ± 0.0 | 48 | 0 | 0.71 / 20.8 |
| davidalves.Firebird 0.25 | rank30-band2 | 94.4% ± 5.0 | 97.9% ± 2.3 | 0.0% ± 0.0 | 137 / 140 | 0.0% ± 0.0 | 0.4% ± 0.3 | 54 | 0 | 0.67 / 283.6 |
| pulsar.PulsarMax 0.8.9 | rank31-band2 | 56.7% ± 7.1 | 72.1% ± 9.4 | 40.5% ± 5.0 | 101 / 140 | 9.9% ± 0.5 | 7.5% ± 0.8 | 115 | 0 | 1.14 / 37.5 |
| zyx.mega.YersiniaPestis 3.0 | rank32-band2 | 50.3% ± 9.4 | 64.3% ± 12.0 | 37.3% ± 7.0 | 90 / 140 | 9.8% ± 1.3 | 8.9% ± 0.5 | 180 | 0 | 1.44 / 24.4 |
| ags.Midboss 1q.fast | rank33-band2 | 69.7% ± 8.6 | 82.1% ± 13.6 | 58.3% ± 4.4 | 115 / 140 | 13.4% ± 1.4 | 9.3% ± 1.4 | 186 | 0 | 1.33 / 146.3 |
| pez.rumble.CassiusClay 2rho.02no | rank35-band2 | 63.9% ± 4.4 | 67.1% ± 5.9 | 60.1% ± 3.0 | 94 / 140 | 12.6% ± 1.0 | 8.3% ± 0.9 | 217 | 0 | 1.10 / 213.8 |
| Krabb.sliNk.Garm 0.9u | rank36-band2 | 69.9% ± 0.5 | 83.6% ± 4.4 | 53.8% ± 4.0 | 117 / 140 | 11.0% ± 1.1 | 6.2% ± 1.2 | 110 | 0 | 1.19 / 285.1 |
| axeBots.SilverSurfer 2.53.33fix | rank37-band2 | 64.4% ± 8.4 | 77.1% ± 8.3 | 53.1% ± 7.8 | 108 / 140 | 12.4% ± 1.1 | 7.8% ± 1.7 | 186 | 0 | 1.45 / 17.8 |
| mn.Combat 3.25.0 | rank38-band2 | 61.2% ± 4.2 | 74.8% ± 7.2 | 47.3% ± 2.1 | 105 / 140 | 10.4% ± 0.5 | 9.4% ± 0.5 | 221 | 0 | 1.69 / 21.7 |
| cs.s2.Seraphim 2.3.1 | rank39-band2 | 68.8% ± 4.9 | 84.3% ± 8.7 | 53.6% ± 4.6 | 118 / 140 | 11.6% ± 0.7 | 7.3% ± 0.5 | 135 | 0 | 1.12 / 112.0 |
| fromHell.CHCl3 1.4.2 | rank40-band2 | 64.7% ± 5.9 | 75.7% ± 12.0 | 54.2% ± 2.7 | 106 / 140 | 13.6% ± 0.9 | 7.7% ± 0.7 | 99 | 0 | 0.96 / 13.1 |
| jk.mini.CunobelinDC 1.2 | rank41-band2 | 98.0% ± 0.6 | 100.0% ± 0.0 | 6.0% ± 7.2 | 140 / 140 | 0.7% ± 1.3 | 1.1% ± 0.1 | 82 | 0 | 0.60 / 86.9 |
| sheldor.mini.Foilist 1.3.1 | rank42-band2 | 70.8% ± 7.4 | 86.4% ± 5.7 | 55.9% ± 9.8 | 121 / 140 | 12.0% ± 1.1 | 8.5% ± 1.1 | 255 | 0 | 1.21 / 16.2 |
| florent.test.Toad 0.14t | rank43-band2 | 61.5% ± 4.8 | 73.4% ± 8.4 | 50.2% ± 2.4 | 103 / 140 | 11.1% ± 0.9 | 7.4% ± 0.6 | 132 | 0 | 1.07 / 17.3 |
| ar.horizon.Horizon 1.2.2 | rank44-band2 | 57.7% ± 4.1 | 68.6% ± 9.1 | 47.1% ± 4.4 | 96 / 140 | 10.9% ± 0.7 | 8.8% ± 0.8 | 163 | 0 | 1.41 / 327.7 |
| cjm.chalk.Chalk 2.6.Be | rank45-band2 | 99.8% ± 0.4 | 100.0% ± 0.0 | 25.0% ± 45.9 | 140 / 140 | 0.0% ± 0.0 | 0.0% ± 0.0 | 51 | 0 | 0.57 / 276.1 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | rank46-band2 | 98.0% ± 3.6 | 99.3% ± 2.3 | 8.3% ± 11.9 | 139 / 140 | 0.2% ± 0.6 | 1.8% ± 0.2 | 56 | 0 | 0.48 / 17.5 |
| sheldor.mini.FoilistMC 1.0 | rank47-band2 | 70.0% ± 2.9 | 83.6% ± 4.4 | 55.8% ± 5.6 | 117 / 140 | 11.8% ± 1.3 | 8.0% ± 0.8 | 190 | 0 | 1.29 / 409.2 |
| pez.rumble.Ali 0.4.9 | rank48-band2 | 76.9% ± 7.5 | 92.9% ± 7.9 | 34.0% ± 3.8 | 130 / 140 | 3.6% ± 1.4 | 3.2% ± 0.8 | 69 | 0 | 1.85 / 17.6 |
| catcat20.Lambda 0.017 | rank49-band2 | 64.0% ± 12.9 | 77.9% ± 12.0 | 50.3% ± 13.2 | 109 / 140 | 11.3% ± 1.1 | 8.1% ± 1.5 | 167 | 0 | 1.77 / 10.0 |
| florent.XSeries.X2 0.17 | rank50-band2 | 64.1% ± 8.4 | 80.0% ± 9.8 | 47.5% ± 7.9 | 112 / 140 | 11.1% ± 0.7 | 7.4% ± 1.5 | 124 | 0 | 2.03 / 15.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 2869 | 51.0% | 33.1% | 0.0% | 15.9% | 1890 |
| jd.Nullstride 2.3.3 | 4 | 2935 | 52.4% | 31.6% | 0.0% | 16.0% | 1929 |
| jk.mega.DrussGT 3.1.16 | 4 | 2392 | 39.2% | 47.7% | 0.0% | 13.1% | 3210 |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 1269 | 17.7% | 74.4% | 0.0% | 7.9% | 696 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 3207 | 44.8% | 39.4% | 0.0% | 15.8% | 2467 |
| voidious.Diamond 1.8.22 | 4 | 2176 | 35.6% | 51.9% | 0.0% | 12.4% | 2826 |
| cb.fire.Firestarter 2.0f | 4 | 1826 | 37.7% | 50.6% | 0.0% | 11.8% | 3648 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 2076 | 25.3% | 64.6% | 0.0% | 10.1% | 1344 |
| xander.cat.XanderCat 12.9 | 4 | 2102 | 30.9% | 57.7% | 0.0% | 11.4% | 1451 |
| lxx.Tomcat 3.68 | 4 | 2143 | 28.0% | 60.7% | 0.1% | 11.3% | 2173 |
| rsalesc.mega.Knight 0.6.28 | 4 | 2063 | 36.4% | 51.4% | 0.0% | 12.2% | 3097 |
| aw.Gilgalad 1.99.5c | 4 | 2656 | 35.3% | 51.2% | 0.0% | 13.5% | 1727 |
| pc.Wavelet 1.5 | 4 | 2447 | 43.4% | 41.3% | 0.2% | 15.1% | 1611 |
| gh.GresSuffurd 0.4.13 | 4 | 1769 | 24.7% | 65.4% | 0.0% | 9.8% | 1120 |
| kc.serpent.WaveSerpent 2.11 | 4 | 1708 | 22.7% | 68.3% | 0.0% | 9.0% | 1103 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 1561 | 25.6% | 65.0% | 0.0% | 9.3% | 1352 |
| cs.Nene 1.0.5 | 4 | 2019 | 27.2% | 61.5% | 0.0% | 11.3% | 896 |
| jk.melee.Neuromancer 7.12 | 4 | 2123 | 33.0% | 55.1% | 0.0% | 11.9% | 2055 |
| voidious.Dookious 1.573c | 4 | 1810 | 27.6% | 62.0% | 0.0% | 10.4% | 998 |
| davidalves.Phoenix 1.02 | 4 | 26 | 0.0% | 100.0% | 0.0% | 0.0% | 1242 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 1924 | 42.9% | 43.5% | 0.0% | 13.6% | 2531 |
| cb.Domogled 1.2 | 4 | 1777 | 44.3% | 43.0% | 0.0% | 12.7% | 2645 |
| mue.Ascendant 1.2.27 | 4 | 1866 | 24.8% | 64.7% | 0.0% | 10.5% | 854 |
| abc.Shadow 3.83c | 4 | 2317 | 27.0% | 61.9% | 0.0% | 11.2% | 970 |
| darkcanuck.Pris 0.92 | 4 | 1773 | 23.3% | 66.6% | 0.0% | 10.1% | 811 |
| fromHell.BlackBox 0.0.2 | 4 | 1559 | 24.9% | 65.5% | 0.0% | 9.7% | 913 |
| jk.precise.Wintermute 0.8 | 4 | 1892 | 25.1% | 64.4% | 0.0% | 10.5% | 999 |
| kc.serpent.Hydra 0.21 | 4 | 0 | 0.0% | 100.0% | 0.0% | 0.0% | 1384 |
| davidalves.Firebird 0.25 | 4 | 124 | 30.3% | 57.6% | 0.0% | 12.1% | 1245 |
| pulsar.PulsarMax 0.8.9 | 4 | 1880 | 25.9% | 63.8% | 0.0% | 10.3% | 950 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 2287 | 27.3% | 61.6% | 0.0% | 11.1% | 974 |
| ags.Midboss 1q.fast | 4 | 1513 | 20.7% | 70.6% | 0.0% | 8.7% | 912 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 1754 | 32.8% | 55.7% | 0.0% | 11.5% | 1496 |
| Krabb.sliNk.Garm 0.9u | 4 | 1283 | 22.4% | 69.3% | 0.0% | 8.3% | 911 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 1717 | 23.3% | 66.5% | 0.0% | 10.2% | 1026 |
| mn.Combat 3.25.0 | 4 | 1752 | 25.0% | 65.8% | 0.0% | 9.2% | 1562 |
| cs.s2.Seraphim 2.3.1 | 4 | 1460 | 18.8% | 73.1% | 0.0% | 8.0% | 841 |
| fromHell.CHCl3 1.4.2 | 4 | 1687 | 25.2% | 64.5% | 0.0% | 10.3% | 871 |
| jk.mini.CunobelinDC 1.2 | 4 | 43 | 0.0% | 100.0% | 0.0% | 0.0% | 1409 |
| sheldor.mini.Foilist 1.3.1 | 4 | 1421 | 16.7% | 76.4% | 0.0% | 6.9% | 1271 |
| florent.test.Toad 0.14t | 4 | 1770 | 26.1% | 62.9% | 0.0% | 10.9% | 907 |
| ar.horizon.Horizon 1.2.2 | 4 | 1957 | 28.1% | 60.9% | 0.0% | 10.9% | 1113 |
| cjm.chalk.Chalk 2.6.Be | 4 | 5 | 0.0% | 100.0% | 0.0% | 0.0% | 1374 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 44 | 28.6% | 62.3% | 0.0% | 9.1% | 1056 |
| sheldor.mini.FoilistMC 1.0 | 4 | 1381 | 20.8% | 70.6% | 0.0% | 8.6% | 1253 |
| pez.rumble.Ali 0.4.9 | 4 | 677 | 18.5% | 74.7% | 0.0% | 6.8% | 1345 |
| catcat20.Lambda 0.017 | 4 | 1660 | 23.3% | 66.5% | 0.0% | 10.2% | 1055 |
| florent.XSeries.X2 0.17 | 4 | 1607 | 21.8% | 69.2% | 0.0% | 8.9% | 958 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 4 | 0 | 0 | 1.74 | 0 | 0 | 0 |
| jd.Nullstride 2.3.3 | 4 | 3 | 0 | 0 | 1.72 | 1 | 1 | 0 |
| jk.mega.DrussGT 3.1.16 | 4 | 0 | 0 | 0 | 2.49 | 2 | 2 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 4 | 0 | 0 | 0.50 | 0 | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 1 | 0 | 0 | 2.04 | 0 | 0 | 0 |
| voidious.Diamond 1.8.22 | 4 | 1 | 0 | 0 | 1.90 | 2 | 2 | 0 |
| cb.fire.Firestarter 2.0f | 4 | 1 | 0 | 0 | 2.15 | 0 | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 3 | 0 | 0 | 1.36 | 1 | 1 | 0 |
| xander.cat.XanderCat 12.9 | 4 | 3 | 0 | 0 | 1.25 | 1 | 1 | 0 |
| lxx.Tomcat 3.68 | 4 | 0 | 0 | 0 | 2.16 | 1 | 1 | 0 |
| rsalesc.mega.Knight 0.6.28 | 4 | 0 | 0 | 0 | 2.16 | 0 | 0 | 0 |
| aw.Gilgalad 1.99.5c | 4 | 1 | 0 | 0 | 1.81 | 3 | 3 | 0 |
| pc.Wavelet 1.5 | 4 | 3 | 0 | 0 | 1.34 | 1 | 1 | 0 |
| gh.GresSuffurd 0.4.13 | 4 | 3 | 0 | 0 | 1.45 | 1 | 1 | 0 |
| kc.serpent.WaveSerpent 2.11 | 4 | 3 | 0 | 0 | 0.72 | 1 | 1 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 3 | 0 | 0 | 1.31 | 1 | 1 | 0 |
| cs.Nene 1.0.5 | 4 | 4 | 0 | 0 | 0.69 | 0 | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 4 | 1 | 0 | 0 | 2.02 | 1 | 1 | 0 |
| voidious.Dookious 1.573c | 4 | 4 | 0 | 0 | 0.82 | 0 | 0 | 0 |
| davidalves.Phoenix 1.02 | 4 | 4 | 0 | 1 | 0.55 | 0 | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 2 | 0 | 0 | 1.77 | 2 | 2 | 0 |
| cb.Domogled 1.2 | 4 | 3 | 0 | 0 | 1.87 | 0 | 0 | 0 |
| mue.Ascendant 1.2.27 | 4 | 3 | 0 | 0 | 0.76 | 1 | 1 | 0 |
| abc.Shadow 3.83c | 4 | 4 | 0 | 0 | 1.19 | 0 | 0 | 0 |
| darkcanuck.Pris 0.92 | 4 | 4 | 0 | 0 | 0.68 | 0 | 0 | 0 |
| fromHell.BlackBox 0.0.2 | 4 | 4 | 0 | 0 | 0.97 | 0 | 0 | 0 |
| jk.precise.Wintermute 0.8 | 4 | 1 | 0 | 0 | 1.06 | 3 | 3 | 0 |
| kc.serpent.Hydra 0.21 | 4 | 4 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| davidalves.Firebird 0.25 | 4 | 4 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 4 | 2 | 0 | 0 | 0.82 | 2 | 2 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 4 | 0 | 0 | 1.29 | 0 | 0 | 0 |
| ags.Midboss 1q.fast | 4 | 4 | 0 | 0 | 1.33 | 0 | 0 | 0 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 3 | 0 | 0 | 1.55 | 1 | 1 | 0 |
| Krabb.sliNk.Garm 0.9u | 4 | 3 | 0 | 0 | 0.79 | 1 | 1 | 0 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 4 | 0 | 0 | 1.33 | 0 | 0 | 0 |
| mn.Combat 3.25.0 | 4 | 4 | 0 | 0 | 1.58 | 0 | 0 | 0 |
| cs.s2.Seraphim 2.3.1 | 4 | 4 | 0 | 0 | 0.96 | 0 | 0 | 0 |
| fromHell.CHCl3 1.4.2 | 4 | 2 | 0 | 0 | 0.71 | 2 | 2 | 0 |
| jk.mini.CunobelinDC 1.2 | 4 | 4 | 0 | 0 | 0.59 | 0 | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 4 | 3 | 0 | 0 | 1.82 | 0 | 0 | 0 |
| florent.test.Toad 0.14t | 4 | 2 | 0 | 0 | 0.94 | 2 | 2 | 0 |
| ar.horizon.Horizon 1.2.2 | 4 | 2 | 0 | 0 | 1.16 | 2 | 2 | 0 |
| cjm.chalk.Chalk 2.6.Be | 4 | 4 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 4 | 0 | 0 | 0.40 | 0 | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 4 | 3 | 0 | 0 | 1.36 | 1 | 1 | 0 |
| pez.rumble.Ali 0.4.9 | 4 | 3 | 0 | 0 | 0.49 | 1 | 1 | 0 |
| catcat20.Lambda 0.017 | 4 | 4 | 0 | 0 | 1.19 | 0 | 0 | 0 |
| florent.XSeries.X2 0.17 | 4 | 4 | 0 | 0 | 0.89 | 0 | 0 | 0 |

138 of 192 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 20114 | 215 | 20203 | 20106 (100.0%) | 8 (0.0%) | 97 (0.5%) | 1907 | 147 | 247 |
| jd.Nullstride 2.3.3 | 20307 | 246 | 20399 | 20298 (100.0%) | 9 (0.0%) | 101 (0.5%) | 1837 | 159 | 226 |
| jk.mega.DrussGT 3.1.16 | 37153 | 13 | 37154 | 37152 (100.0%) | 1 (0.0%) | 2 (0.0%) | 2400 | 256 | 318 |
| oog.mega.saguaro.Saguaro 1.0 | 4825 | 9 | 4822 | 4818 (99.9%) | 7 (0.1%) | 4 (0.1%) | 286 | 68 | 66 |
| aaa.r.ScalarR 0.005h.053-noshield | 27202 | 7 | 27260 | 27195 (100.0%) | 7 (0.0%) | 65 (0.2%) | 2170 | 360 | 320 |
| voidious.Diamond 1.8.22 | 31809 | 641 | 31873 | 31794 (100.0%) | 15 (0.0%) | 79 (0.2%) | 2818 | 209 | 254 |
| cb.fire.Firestarter 2.0f | 36834 | 572 | 37312 | 36794 (99.9%) | 40 (0.1%) | 518 (1.4%) | 8408 | 281 | 344 |
| dsekercioglu.mega.Raven 3.56j8 | 12723 | 68 | 12725 | 12720 (100.0%) | 3 (0.0%) | 5 (0.0%) | 991 | 148 | 168 |
| xander.cat.XanderCat 12.9 | 11286 | 6 | 11342 | 11285 (100.0%) | 1 (0.0%) | 57 (0.5%) | 1690 | 124 | 150 |
| lxx.Tomcat 3.68 | 23731 | 417 | 23710 | 23693 (99.8%) | 38 (0.2%) | 17 (0.1%) | 2111 | 189 | 283 |
| rsalesc.mega.Knight 0.6.28 | 35306 | 354 | 35295 | 35287 (99.9%) | 19 (0.1%) | 8 (0.0%) | 2951 | 306 | 373 |
| aw.Gilgalad 1.99.5c | 17994 | 5 | 18004 | 17993 (100.0%) | 1 (0.0%) | 11 (0.1%) | 1455 | 154 | 233 |
| pc.Wavelet 1.5 | 14247 | 5 | 14262 | 14243 (100.0%) | 4 (0.0%) | 19 (0.1%) | 1315 | 144 | 169 |
| gh.GresSuffurd 0.4.13 | 10002 | 7 | 10005 | 10002 (100.0%) | 0 (0.0%) | 3 (0.0%) | 705 | 107 | 178 |
| kc.serpent.WaveSerpent 2.11 | 7836 | 3 | 7836 | 7836 (100.0%) | 0 (0.0%) | 0 (0.0%) | 657 | 53 | 72 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 11687 | 7 | 11689 | 11685 (100.0%) | 2 (0.0%) | 4 (0.0%) | 1041 | 87 | 153 |
| cs.Nene 1.0.5 | 7311 | 54 | 7311 | 7311 (100.0%) | 0 (0.0%) | 0 (0.0%) | 412 | 57 | 85 |
| jk.melee.Neuromancer 7.12 | 21023 | 7 | 21053 | 21020 (100.0%) | 3 (0.0%) | 33 (0.2%) | 2052 | 234 | 268 |
| voidious.Dookious 1.573c | 7446 | 7 | 7448 | 7445 (100.0%) | 1 (0.0%) | 3 (0.0%) | 522 | 51 | 92 |
| davidalves.Phoenix 1.02 | 5789 | 0 | 5791 | 5789 (100.0%) | 0 (0.0%) | 2 (0.0%) | 2581 | 1 | 12 |
| rsalesc.roborio.Roborio 1.2.4 | 24116 | 12 | 24129 | 24114 (100.0%) | 2 (0.0%) | 15 (0.1%) | 2538 | 220 | 226 |
| cb.Domogled 1.2 | 22621 | 7 | 23295 | 22617 (100.0%) | 4 (0.0%) | 678 (2.9%) | 8820 | 166 | 242 |
| mue.Ascendant 1.2.27 | 6549 | 6 | 6545 | 6545 (99.9%) | 4 (0.1%) | 0 (0.0%) | 358 | 80 | 132 |
| abc.Shadow 3.83c | 8240 | 399 | 8086 | 8081 (98.1%) | 159 (1.9%) | 5 (0.1%) | 539 | 95 | 147 |
| darkcanuck.Pris 0.92 | 5996 | 26 | 5996 | 5995 (100.0%) | 1 (0.0%) | 1 (0.0%) | 264 | 65 | 53 |
| fromHell.BlackBox 0.0.2 | 7718 | 8 | 7718 | 7716 (100.0%) | 2 (0.0%) | 2 (0.0%) | 643 | 92 | 117 |
| jk.precise.Wintermute 0.8 | 8584 | 12 | 8586 | 8583 (100.0%) | 1 (0.0%) | 3 (0.0%) | 566 | 91 | 136 |
| kc.serpent.Hydra 0.21 | 9038 | 1 | 9038 | 9033 (99.9%) | 5 (0.1%) | 5 (0.1%) | 41 | 3 | 9 |
| davidalves.Firebird 0.25 | 6018 | 0 | 6020 | 6018 (100.0%) | 0 (0.0%) | 2 (0.0%) | 2301 | 2 | 16 |
| pulsar.PulsarMax 0.8.9 | 7529 | 6 | 7530 | 7529 (100.0%) | 0 (0.0%) | 1 (0.0%) | 514 | 52 | 88 |
| zyx.mega.YersiniaPestis 3.0 | 7108 | 418 | 7073 | 7068 (99.4%) | 40 (0.6%) | 5 (0.1%) | 574 | 75 | 152 |
| ags.Midboss 1q.fast | 7743 | 22 | 7740 | 7737 (99.9%) | 6 (0.1%) | 3 (0.0%) | 424 | 114 | 189 |
| pez.rumble.CassiusClay 2rho.02no | 13621 | 7 | 13638 | 13618 (100.0%) | 3 (0.0%) | 20 (0.1%) | 1365 | 164 | 205 |
| Krabb.sliNk.Garm 0.9u | 7260 | 7 | 7261 | 7255 (99.9%) | 5 (0.1%) | 6 (0.1%) | 475 | 46 | 76 |
| axeBots.SilverSurfer 2.53.33fix | 5838 | 8 | 5909 | 5834 (99.9%) | 4 (0.1%) | 75 (1.3%) | 1277 | 67 | 167 |
| mn.Combat 3.25.0 | 15666 | 8 | 15666 | 15664 (100.0%) | 2 (0.0%) | 2 (0.0%) | 1310 | 143 | 182 |
| cs.s2.Seraphim 2.3.1 | 6396 | 16 | 6396 | 6394 (100.0%) | 2 (0.0%) | 2 (0.0%) | 288 | 73 | 80 |
| fromHell.CHCl3 1.4.2 | 6210 | 4 | 6211 | 6210 (100.0%) | 0 (0.0%) | 1 (0.0%) | 512 | 60 | 58 |
| jk.mini.CunobelinDC 1.2 | 13590 | 147 | 13590 | 13590 (100.0%) | 0 (0.0%) | 0 (0.0%) | 13 | 0 | 15 |
| sheldor.mini.Foilist 1.3.1 | 12466 | 5 | 12459 | 12455 (99.9%) | 11 (0.1%) | 4 (0.0%) | 847 | 108 | 315 |
| florent.test.Toad 0.14t | 6660 | 11 | 6661 | 6659 (100.0%) | 1 (0.0%) | 2 (0.0%) | 420 | 69 | 90 |
| ar.horizon.Horizon 1.2.2 | 9458 | 6 | 9463 | 9458 (100.0%) | 0 (0.0%) | 5 (0.1%) | 651 | 84 | 130 |
| cjm.chalk.Chalk 2.6.Be | 7980 | 0 | 7980 | 7980 (100.0%) | 0 (0.0%) | 0 (0.0%) | 145 | 0 | 11 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 8812 | 217 | 8812 | 8812 (100.0%) | 0 (0.0%) | 0 (0.0%) | 1 | 3 | 18 |
| sheldor.mini.FoilistMC 1.0 | 12332 | 45 | 12324 | 12320 (99.9%) | 12 (0.1%) | 4 (0.0%) | 857 | 97 | 281 |
| pez.rumble.Ali 0.4.9 | 8199 | 35 | 8190 | 8180 (99.8%) | 19 (0.2%) | 10 (0.1%) | 2080 | 27 | 48 |
| catcat20.Lambda 0.017 | 9025 | 200 | 9013 | 9012 (99.9%) | 13 (0.1%) | 1 (0.0%) | 628 | 76 | 126 |
| florent.XSeries.X2 0.17 | 6832 | 6 | 6833 | 6830 (100.0%) | 2 (0.0%) | 3 (0.0%) | 548 | 47 | 107 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 20184 | 2115 (10.5%) | 19716 |
| jd.Nullstride 2.3.3 | 20534 | 2194 (10.7%) | 20064 |
| jk.mega.DrussGT 3.1.16 | 36857 | 4693 (12.7%) | 36795 |
| oog.mega.saguaro.Saguaro 1.0 | 5460 | 382 (7.0%) | 5436 |
| aaa.r.ScalarR 0.005h.053-noshield | 27517 | 3263 (11.9%) | 26849 |
| voidious.Diamond 1.8.22 | 32233 | 3418 (10.6%) | 30800 |
| cb.fire.Firestarter 2.0f | 42815 | 3892 (9.1%) | 42231 |
| dsekercioglu.mega.Raven 3.56j8 | 13615 | 1393 (10.2%) | 12297 |
| xander.cat.XanderCat 12.9 | 14591 | 1205 (8.3%) | 12355 |
| lxx.Tomcat 3.68 | 24090 | 2790 (11.6%) | 23592 |
| rsalesc.mega.Knight 0.6.28 | 35614 | 4115 (11.6%) | 35312 |
| aw.Gilgalad 1.99.5c | 18056 | 1893 (10.5%) | 17569 |
| pc.Wavelet 1.5 | 16538 | 1583 (9.6%) | 16169 |
| gh.GresSuffurd 0.4.13 | 10514 | 1061 (10.1%) | 9741 |
| kc.serpent.WaveSerpent 2.11 | 10630 | 737 (6.9%) | 8291 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 13643 | 1213 (8.9%) | 12600 |
| cs.Nene 1.0.5 | 8034 | 732 (9.1%) | 7174 |
| jk.melee.Neuromancer 7.12 | 22593 | 2192 (9.7%) | 21778 |
| voidious.Dookious 1.573c | 9246 | 696 (7.5%) | 7957 |
| davidalves.Phoenix 1.02 | 124 | 5772 (4654.8%) | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 27679 | 2417 (8.7%) | 27649 |
| cb.Domogled 1.2 | 29647 | 2543 (8.6%) | 27675 |
| mue.Ascendant 1.2.27 | 7296 | 597 (8.2%) | 6138 |
| abc.Shadow 3.83c | 8956 | 780 (8.7%) | 7119 |
| darkcanuck.Pris 0.92 | 6827 | 508 (7.4%) | 5307 |
| fromHell.BlackBox 0.0.2 | 7921 | 812 (10.3%) | 7243 |
| jk.precise.Wintermute 0.8 | 9020 | 962 (10.7%) | 7876 |
| kc.serpent.Hydra 0.21 | 145 | 9038 (6233.1%) | 0 |
| davidalves.Firebird 0.25 | 128 | 5987 (4677.3%) | 0 |
| pulsar.PulsarMax 0.8.9 | 8682 | 740 (8.5%) | 7288 |
| zyx.mega.YersiniaPestis 3.0 | 9062 | 633 (7.0%) | 7287 |
| ags.Midboss 1q.fast | 8000 | 771 (9.6%) | 7163 |
| pez.rumble.CassiusClay 2rho.02no | 14910 | 1423 (9.5%) | 14174 |
| Krabb.sliNk.Garm 0.9u | 8061 | 693 (8.6%) | 6576 |
| axeBots.SilverSurfer 2.53.33fix | 9494 | 529 (5.6%) | 7024 |
| mn.Combat 3.25.0 | 16388 | 1693 (10.3%) | 15908 |
| cs.s2.Seraphim 2.3.1 | 7241 | 547 (7.6%) | 3821 |
| fromHell.CHCl3 1.4.2 | 7259 | 632 (8.7%) | 4986 |
| jk.mini.CunobelinDC 1.2 | 364 | 13458 (3697.3%) | 0 |
| sheldor.mini.Foilist 1.3.1 | 12604 | 1085 (8.6%) | 11734 |
| florent.test.Toad 0.14t | 7865 | 648 (8.2%) | 7373 |
| ar.horizon.Horizon 1.2.2 | 10280 | 986 (9.6%) | 9049 |
| cjm.chalk.Chalk 2.6.Be | 139 | 7978 (5739.6%) | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 326 | 8794 (2697.5%) | 0 |
| sheldor.mini.FoilistMC 1.0 | 12345 | 1181 (9.6%) | 11721 |
| pez.rumble.Ali 0.4.9 | 4505 | 5577 (123.8%) | 1534 |
| catcat20.Lambda 0.017 | 10006 | 930 (9.3%) | 8553 |
| florent.XSeries.X2 0.17 | 8755 | 548 (6.3%) | 6114 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 530 | 650 | 1740 | 22.9 / 27.2 | 0 | 831 | 156 |
| jd.Nullstride 2.3.3 | 650 | 536 | 650 | 1783 | 21.3 / 26.5 | 0 | 337 | 167 |
| jk.mega.DrussGT 3.1.16 | 650 | 515 | 650 | 3078 | 28.1 / 32.6 | 10 | 2090 | 215 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 443 | 438 | 546 | 45.8 / 27.0 | 771 | 1868 | 131 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 483 | 650 | 2317 | 23.3 / 36.1 | 0 | 439 | 1 |
| voidious.Diamond 1.8.22 | 650 | 534 | 650 | 2696 | 21.6 / 32.3 | 62 | 8981 | 82 |
| cb.fire.Firestarter 2.0f | 650 | 543 | 650 | 3498 | 32.3 / 26.4 | 119 | 4405 | 174 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 452 | 650 | 1195 | 23.9 / 38.3 | 106 | 9807 | 1160 |
| xander.cat.XanderCat 12.9 | 650 | 443 | 650 | 1303 | 32.2 / 34.6 | 295 | 1471 | 218 |
| lxx.Tomcat 3.68 | 650 | 510 | 650 | 2032 | 27.5 / 37.2 | 189 | 17721 | 6 |
| rsalesc.mega.Knight 0.6.28 | 650 | 504 | 650 | 2947 | 33.8 / 30.3 | 323 | 7812 | 3 |
| aw.Gilgalad 1.99.5c | 650 | 468 | 650 | 1576 | 23.2 / 38.8 | 164 | 10146 | 8 |
| pc.Wavelet 1.5 | 650 | 435 | 650 | 1465 | 32.7 / 28.9 | 127 | 2040 | 2 |
| gh.GresSuffurd 0.4.13 | 650 | 460 | 650 | 972 | 31.2 / 33.1 | 308 | 2653 | 208 |
| kc.serpent.WaveSerpent 2.11 | 650 | 476 | 625 | 951 | 23.8 / 33.3 | 107 | 7090 | 3 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 464 | 650 | 1201 | 28.7 / 29.0 | 227 | 12969 | 206 |
| cs.Nene 1.0.5 | 650 | 470 | 650 | 746 | 25.4 / 35.5 | 77 | 4483 | 1219 |
| jk.melee.Neuromancer 7.12 | 650 | 528 | 650 | 1915 | 30.7 / 33.4 | 70 | 9958 | 22 |
| voidious.Dookious 1.573c | 650 | 481 | 588 | 848 | 24.1 / 32.1 | 65 | 3844 | 2452 |
| davidalves.Phoenix 1.02 | 650 | 400 | 650 | 1092 | 0.0 / 0.7 | 0 | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 650 | 501 | 650 | 2382 | 43.6 / 23.9 | 645 | 2660 | 157 |
| cb.Domogled 1.2 | 650 | 551 | 631 | 2495 | 40.3 / 21.8 | 375 | 2284 | 196 |
| mue.Ascendant 1.2.27 | 650 | 418 | 650 | 704 | 29.4 / 34.5 | 161 | 1935 | 0 |
| abc.Shadow 3.83c | 650 | 454 | 650 | 820 | 24.9 / 41.0 | 114 | 5297 | 134 |
| darkcanuck.Pris 0.92 | 650 | 411 | 650 | 661 | 36.3 / 33.8 | 218 | 1615 | 781 |
| fromHell.BlackBox 0.0.2 | 650 | 431 | 463 | 763 | 35.4 / 29.2 | 1098 | 1351 | 30 |
| jk.precise.Wintermute 0.8 | 650 | 451 | 619 | 854 | 28.2 / 34.8 | 162 | 6196 | 146 |
| kc.serpent.Hydra 0.21 | 650 | 346 | 650 | 1234 | 0.0 / 0.0 | 0 | 0 | 0 |
| davidalves.Firebird 0.25 | 650 | 403 | 650 | 1095 | 0.0 / 2.0 | 0 | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 650 | 485 | 650 | 802 | 23.3 / 34.2 | 1 | 4111 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 650 | 447 | 650 | 824 | 24.0 / 40.2 | 106 | 3047 | 42 |
| ags.Midboss 1q.fast | 650 | 412 | 650 | 762 | 42.8 / 30.5 | 562 | 2355 | 378 |
| pez.rumble.CassiusClay 2rho.02no | 650 | 477 | 650 | 1340 | 41.9 / 27.9 | 508 | 1213 | 86 |
| Krabb.sliNk.Garm 0.9u | 650 | 519 | 588 | 761 | 29.5 / 25.4 | 232 | 3236 | 1983 |
| axeBots.SilverSurfer 2.53.33fix | 650 | 484 | 650 | 876 | 36.8 / 32.6 | 171 | 773 | 22 |
| mn.Combat 3.25.0 | 650 | 487 | 650 | 1412 | 29.6 / 33.0 | 232 | 11688 | 68 |
| cs.s2.Seraphim 2.3.1 | 650 | 479 | 650 | 691 | 35.2 / 30.5 | 299 | 1793 | 603 |
| fromHell.CHCl3 1.4.2 | 650 | 426 | 450 | 721 | 36.8 / 31.1 | 1003 | 923 | 0 |
| jk.mini.CunobelinDC 1.2 | 650 | 531 | 650 | 1259 | 0.1 / 1.2 | 0 | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 650 | 572 | 650 | 1121 | 39.6 / 31.0 | 258 | 2339 | 0 |
| florent.test.Toad 0.14t | 650 | 492 | 650 | 755 | 32.1 / 31.8 | 135 | 2148 | 7 |
| ar.horizon.Horizon 1.2.2 | 650 | 482 | 650 | 964 | 30.4 / 34.1 | 151 | 3916 | 24 |
| cjm.chalk.Chalk 2.6.Be | 650 | 412 | 650 | 1224 | 0.0 / 0.1 | 0 | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 650 | 358 | 650 | 906 | 0.1 / 0.8 | 0 | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 650 | 568 | 588 | 1105 | 35.3 / 27.9 | 246 | 3996 | 1369 |
| pez.rumble.Ali 0.4.9 | 650 | 405 | 650 | 1199 | 7.5 / 14.5 | 19 | 2700 | 13 |
| catcat20.Lambda 0.017 | 650 | 540 | 650 | 905 | 32.1 / 31.5 | 125 | 4671 | 0 |
| florent.XSeries.X2 0.17 | 650 | 492 | 650 | 808 | 28.8 / 31.8 | 148 | 2730 | 93 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 9.5% | 244 | 77 | 3 | 143.5 | 2114 / 2115 (100%) | 0 | 0 |
| jd.Nullstride 2.3.3 | 8.9% | 241 | 1318 | 3 | 144.2 | 2188 / 2194 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.6% | 349 | 430 | 3 | 262.2 | 4689 / 4693 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.5% | 70 | 280 | 3 | 34.2 | 382 / 382 (100%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.7% | 285 | 440 | 3 | 194.2 | 3259 / 3263 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 9.4% | 266 | 800 | 3 | 225.4 | 3415 / 3418 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 10.0% | 301 | 1359 | 3 | 266.0 | 3879 / 3892 (100%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 9.8% | 190 | 11131 | 3 | 90.0 | 1386 / 1393 (99%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 9.1% | 175 | 119 | 3 | 80.2 | 1202 / 1205 (100%) | 0 | 0 |
| lxx.Tomcat 3.68 | 11.3% | 303 | 740 | 3 | 168.8 | 2785 / 2790 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 10.5% | 302 | 879 | 3 | 251.1 | 4108 / 4115 (100%) | 0 | 0 |
| aw.Gilgalad 1.99.5c | 10.9% | 254 | 2306 | 3 | 125.3 | 1892 / 1893 (100%) | 0 | 0 |
| pc.Wavelet 1.5 | 9.1% | 187 | 281 | 3 | 101.4 | 1582 / 1583 (100%) | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 9.1% | 203 | 1505 | 3 | 70.7 | 1058 / 1061 (100%) | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 7.9% | 101 | 237 | 3 | 55.4 | 734 / 737 (100%) | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 7.9% | 183 | 1245 | 3 | 82.7 | 1204 / 1213 (99%) | 0 | 0 |
| cs.Nene 1.0.5 | 8.0% | 97 | 5204 | 3 | 51.8 | 725 / 732 (99%) | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 10.0% | 283 | 4759 | 3 | 149.5 | 2185 / 2192 (100%) | 0 | 0 |
| voidious.Dookious 1.573c | 7.1% | 115 | 503 | 3 | 53.0 | 696 / 696 (100%) | 0 | 0 |
| davidalves.Phoenix 1.02 | 0.1% | 77 | 10 | 3 | 0.0 | 0 / 5772 (0%) | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 9.1% | 248 | 566 | 3 | 168.1 | 2414 / 2417 (100%) | 0 | 0 |
| cb.Domogled 1.2 | 8.1% | 262 | 12918 | 3 | 165.2 | 2529 / 2543 (99%) | 0 | 0 |
| mue.Ascendant 1.2.27 | 7.7% | 106 | 2927 | 3 | 46.1 | 595 / 597 (100%) | 0 | 0 |
| abc.Shadow 3.83c | 9.4% | 166 | 677 | 3 | 57.4 | 776 / 780 (99%) | 0 | 0 |
| darkcanuck.Pris 0.92 | 8.5% | 95 | 501 | 3 | 42.7 | 505 / 508 (99%) | 0 | 0 |
| fromHell.BlackBox 0.0.2 | 8.0% | 136 | 1089 | 3 | 55.0 | 811 / 812 (100%) | 0 | 0 |
| jk.precise.Wintermute 0.8 | 8.7% | 149 | 263 | 3 | 60.1 | 962 / 962 (100%) | 0 | 0 |
| kc.serpent.Hydra 0.21 | 0.0% | 48 | 10 | 3 | 0.0 | 0 / 9038 (0%) | 0 | 0 |
| davidalves.Firebird 0.25 | 0.4% | 54 | 10 | 3 | 0.0 | 0 / 5987 (0%) | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 7.5% | 115 | 197 | 3 | 52.9 | 739 / 740 (100%) | 0 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 8.9% | 180 | 316 | 3 | 50.5 | 631 / 633 (100%) | 0 | 0 |
| ags.Midboss 1q.fast | 9.3% | 186 | 5429 | 3 | 55.3 | 767 / 771 (99%) | 0 | 0 |
| pez.rumble.CassiusClay 2rho.02no | 8.3% | 217 | 1683 | 3 | 95.1 | 1420 / 1423 (100%) | 0 | 0 |
| Krabb.sliNk.Garm 0.9u | 6.2% | 110 | 340 | 3 | 51.4 | 693 / 693 (100%) | 0 | 0 |
| axeBots.SilverSurfer 2.53.33fix | 7.8% | 186 | 128 | 3 | 42.1 | 528 / 529 (100%) | 0 | 0 |
| mn.Combat 3.25.0 | 9.4% | 221 | 12386 | 3 | 111.6 | 1688 / 1693 (100%) | 0 | 0 |
| cs.s2.Seraphim 2.3.1 | 7.3% | 135 | 285 | 3 | 45.7 | 547 / 547 (100%) | 0 | 0 |
| fromHell.CHCl3 1.4.2 | 7.7% | 99 | 857 | 3 | 43.5 | 631 / 632 (100%) | 0 | 0 |
| jk.mini.CunobelinDC 1.2 | 1.1% | 82 | 12 | 3 | 0.0 | 0 / 13458 (0%) | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 8.5% | 255 | 868 | 3 | 88.8 | 1081 / 1085 (100%) | 0 | 0 |
| florent.test.Toad 0.14t | 7.4% | 132 | 54 | 3 | 46.7 | 648 / 648 (100%) | 0 | 0 |
| ar.horizon.Horizon 1.2.2 | 8.8% | 163 | 610 | 3 | 65.2 | 984 / 986 (100%) | 0 | 0 |
| cjm.chalk.Chalk 2.6.Be | 0.0% | 51 | 12 | 3 | 0.0 | 0 / 7978 (0%) | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 1.8% | 56 | 7 | 3 | 0.0 | 0 / 8794 (0%) | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 8.0% | 190 | 650 | 3 | 87.4 | 1174 / 1181 (99%) | 0 | 0 |
| pez.rumble.Ali 0.4.9 | 3.2% | 69 | 28 | 3 | 19.5 | 296 / 5577 (5%) | 0 | 0 |
| catcat20.Lambda 0.017 | 8.1% | 167 | 91 | 3 | 64.3 | 928 / 930 (100%) | 0 | 0 |
| florent.XSeries.X2 0.17 | 7.4% | 124 | 120 | 3 | 48.8 | 548 / 548 (100%) | 0 | 0 |

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
| Krabb.sliNk.Garm 0.9u | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 70.0% ± 41.1 | 82.5% ± 20.0 | +12.5 ± 35.3 | 49.5% ± 19.3 | 52.4% ± 7.9 | +2.9 ± 15.6 |
| Krabb.sliNk.Garm 0.9u | hadur2.Hadur 3.14hjsw | 4 | 80.0% ± 0.0 | 84.4% ± 10.3 | +4.4 ± 10.3 | 48.2% ± 12.2 | 52.8% ± 10.2 | +4.6 ± 21.7 |
| aaa.r.ScalarR 0.005h.053-noshield | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 30.0% ± 31.8 | 30.0% ± 0.0 | -0.0 ± 31.8 | 48.6% ± 7.5 | 39.8% ± 4.8 | -8.8 ± 11.6 |
| aaa.r.ScalarR 0.005h.053-noshield | hadur2.Hadur 3.14hjsw | 4 | 25.0% ± 15.9 | 15.0% ± 15.9 | -10.0 ± 26.0 | 48.7% ± 14.8 | 36.4% ± 5.7 | -12.3 ± 14.1 |
| abc.Shadow 3.83c | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 75.0% ± 15.9 | 67.8% ± 25.9 | -7.2 ± 22.7 | 41.9% ± 8.4 | 38.2% ± 6.1 | -3.7 ± 5.1 |
| abc.Shadow 3.83c | hadur2.Hadur 3.14hjsw | 4 | 50.0% ± 31.8 | 70.0% ± 34.4 | +20.0 ± 13.0 | 38.2% ± 11.6 | 40.1% ± 13.5 | +1.9 ± 5.7 |
| ags.Midboss 1q.fast | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 70.0% ± 18.4 | 89.2% ± 14.5 | +19.2 ± 12.4 | 56.0% ± 11.1 | 59.1% ± 7.4 | +3.1 ± 5.6 |
| ags.Midboss 1q.fast | hadur2.Hadur 3.14hjsw | 4 | 90.0% ± 18.4 | 85.0% ± 15.9 | -5.0 ± 30.5 | 57.6% ± 12.0 | 61.0% ± 14.9 | +3.4 ± 23.4 |
| ar.horizon.Horizon 1.2.2 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 75.0% ± 30.5 | 72.5% ± 39.8 | -2.5 ± 49.3 | 50.9% ± 4.2 | 43.0% ± 15.0 | -7.8 ± 19.0 |
| ar.horizon.Horizon 1.2.2 | hadur2.Hadur 3.14hjsw | 4 | 70.0% ± 41.1 | 66.4% ± 26.2 | -3.6 ± 57.7 | 53.5% ± 22.5 | 41.9% ± 13.9 | -11.7 ± 28.4 |
| aw.Gilgalad 1.99.5c | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 65.0% ± 54.4 | 59.7% ± 34.2 | -5.3 ± 45.3 | 50.1% ± 24.3 | 41.6% ± 8.5 | -8.4 ± 28.5 |
| aw.Gilgalad 1.99.5c | hadur2.Hadur 3.14hjsw | 4 | 40.0% ± 26.0 | 54.2% ± 38.4 | +14.2 ± 48.4 | 37.8% ± 13.4 | 41.4% ± 8.8 | +3.6 ± 19.8 |
| axeBots.SilverSurfer 2.53.33fix | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 75.0% ± 15.9 | 81.1% ± 27.1 | +6.1 ± 11.2 | 45.7% ± 12.5 | 56.3% ± 15.7 | +10.6 ± 15.6 |
| axeBots.SilverSurfer 2.53.33fix | hadur2.Hadur 3.14hjsw | 4 | 85.0% ± 15.9 | 80.0% ± 13.0 | -5.0 ± 20.5 | 50.8% ± 17.3 | 55.9% ± 11.9 | +5.1 ± 18.7 |
| catcat20.Lambda 0.017 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 80.0% ± 0.0 | 72.5% ± 27.2 | -7.5 ± 27.2 | 50.1% ± 11.1 | 47.9% ± 16.4 | -2.2 ± 9.4 |
| catcat20.Lambda 0.017 | hadur2.Hadur 3.14hjsw | 4 | 75.0% ± 30.5 | 85.0% ± 15.9 | +10.0 ± 36.7 | 51.2% ± 34.5 | 53.9% ± 14.6 | +2.7 ± 20.6 |
| cb.Domogled 1.2 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 60.0% ± 52.0 | 50.0% ± 29.1 | -10.0 ± 39.0 | 70.6% ± 21.0 | 64.6% ± 6.2 | -5.9 ± 18.1 |
| cb.Domogled 1.2 | hadur2.Hadur 3.14hjsw | 4 | 55.0% ± 30.5 | 62.5% ± 15.2 | +7.5 ± 27.2 | 70.9% ± 5.5 | 66.7% ± 14.0 | -4.1 ± 18.6 |
| cb.fire.Firestarter 2.0f | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 35.0% ± 30.5 | 50.0% ± 22.5 | +15.0 ± 27.6 | 55.1% ± 16.0 | 48.2% ± 3.3 | -6.9 ± 15.7 |
| cb.fire.Firestarter 2.0f | hadur2.Hadur 3.14hjsw | 4 | 50.0% ± 41.1 | 60.0% ± 13.0 | +10.0 ± 34.4 | 58.7% ± 7.2 | 53.5% ± 4.4 | -5.2 ± 9.0 |
| cjm.chalk.Chalk 2.6.Be | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% | - | n/a |
| cjm.chalk.Chalk 2.6.Be | hadur2.Hadur 3.14hjsw | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% | - | n/a |
| cs.Nene 1.0.5 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 70.0% ± 41.1 | 67.5% ± 8.0 | -2.5 ± 39.8 | 42.7% ± 21.4 | 35.2% ± 8.1 | -7.4 ± 24.3 |
| cs.Nene 1.0.5 | hadur2.Hadur 3.14hjsw | 4 | 60.0% ± 0.0 | 72.5% ± 20.0 | +12.5 ± 20.0 | 39.3% ± 11.5 | 38.9% ± 3.8 | -0.4 ± 15.2 |
| cs.s2.Seraphim 2.3.1 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 90.0% ± 18.4 | 85.0% ± 20.5 | -5.0 ± 27.6 | 51.5% ± 6.6 | 51.5% ± 11.7 | -0.0 ± 9.7 |
| cs.s2.Seraphim 2.3.1 | hadur2.Hadur 3.14hjsw | 4 | 80.0% ± 26.0 | 85.0% ± 15.9 | +5.0 ± 30.5 | 43.3% ± 15.5 | 53.5% ± 16.8 | +10.2 ± 31.7 |
| darkcanuck.Pris 0.92 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 60.0% ± 26.0 | 92.5% ± 15.2 | +32.5 ± 23.9 | 40.7% ± 8.5 | 57.6% ± 9.0 | +16.9 ± 14.8 |
| darkcanuck.Pris 0.92 | hadur2.Hadur 3.14hjsw | 4 | 75.0% ± 15.9 | 82.5% ± 8.0 | +7.5 ± 15.2 | 45.1% ± 7.0 | 60.1% ± 9.2 | +14.9 ± 7.5 |
| davidalves.Firebird 0.25 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% ± 0.0 | 0.0% ± 0.0 | +0.0 ± 0.0 |
| davidalves.Firebird 0.25 | hadur2.Hadur 3.14hjsw | 4 | 100.0% ± 0.0 | 97.5% ± 8.0 | -2.5 ± 8.0 | 0.0% ± 0.0 | 0.0% ± 0.0 | +0.0 ± 0.0 |
| davidalves.Phoenix 1.02 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% ± 0.0 | - | n/a |
| davidalves.Phoenix 1.02 | hadur2.Hadur 3.14hjsw | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% ± 0.0 | - | n/a |
| dsekercioglu.mega.Raven 3.56j8 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 65.0% ± 15.9 | 72.5% ± 15.2 | +7.5 ± 15.2 | 41.9% ± 9.4 | 35.4% ± 6.1 | -6.4 ± 4.0 |
| dsekercioglu.mega.Raven 3.56j8 | hadur2.Hadur 3.14hjsw | 4 | 75.0% ± 47.7 | 72.2% ± 26.6 | -2.8 ± 67.3 | 43.0% ± 6.3 | 36.0% ± 6.1 | -7.0 ± 10.0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 80.0% ± 26.0 | 79.2% ± 20.0 | -0.8 ± 34.5 | 50.7% ± 5.9 | 51.0% ± 12.0 | +0.2 ± 15.4 |
| dsekercioglu.mega.WhiteFang 2.8.1 | hadur2.Hadur 3.14hjsw | 4 | 85.0% ± 15.9 | 76.4% ± 23.3 | -8.6 ± 38.7 | 55.1% ± 8.8 | 48.1% ± 2.5 | -7.0 ± 9.7 |
| florent.XSeries.X2 0.17 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 80.0% ± 26.0 | 85.0% ± 20.5 | +5.0 ± 37.9 | 48.9% ± 16.4 | 50.5% ± 18.7 | +1.6 ± 29.5 |
| florent.XSeries.X2 0.17 | hadur2.Hadur 3.14hjsw | 4 | 85.0% ± 30.5 | 70.0% ± 13.0 | -15.0 ± 20.5 | 46.2% ± 13.4 | 45.8% ± 5.8 | -0.5 ± 13.7 |
| florent.test.Toad 0.14t | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 70.0% ± 18.4 | 70.0% ± 13.0 | -0.0 ± 13.0 | 43.1% ± 17.7 | 43.1% ± 4.1 | +0.0 ± 21.7 |
| florent.test.Toad 0.14t | hadur2.Hadur 3.14hjsw | 4 | 80.0% ± 0.0 | 68.6% ± 11.8 | -11.4 ± 11.8 | 48.4% ± 10.2 | 51.0% ± 8.6 | +2.6 ± 16.1 |
| fromHell.BlackBox 0.0.2 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 80.0% ± 26.0 | 77.2% ± 23.4 | -2.8 ± 43.6 | 54.0% ± 9.8 | 52.4% ± 8.0 | -1.6 ± 17.1 |
| fromHell.BlackBox 0.0.2 | hadur2.Hadur 3.14hjsw | 4 | 85.0% ± 30.5 | 77.5% ± 15.2 | -7.5 ± 20.0 | 56.5% ± 10.1 | 57.0% ± 5.2 | +0.6 ± 12.5 |
| fromHell.CHCl3 1.4.2 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 90.0% ± 18.4 | 85.0% ± 15.9 | -5.0 ± 30.5 | 54.3% ± 5.0 | 60.4% ± 9.9 | +6.1 ± 13.9 |
| fromHell.CHCl3 1.4.2 | hadur2.Hadur 3.14hjsw | 4 | 90.0% ± 18.4 | 70.6% ± 30.6 | -19.4 ± 19.4 | 59.6% ± 9.8 | 51.9% ± 3.2 | -7.7 ± 7.7 |
| gh.GresSuffurd 0.4.13 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 75.0% ± 15.9 | 81.7% ± 7.8 | +6.7 ± 13.5 | 48.2% ± 3.5 | 45.0% ± 13.2 | -3.2 ± 10.3 |
| gh.GresSuffurd 0.4.13 | hadur2.Hadur 3.14hjsw | 4 | 85.0% ± 15.9 | 79.4% ± 13.1 | -5.6 ± 20.2 | 49.7% ± 3.6 | 52.4% ± 5.2 | +2.7 ± 4.0 |
| jd.Nullstride 2.3.3 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 5.0% ± 15.9 | 7.8% ± 15.4 | +2.8 ± 27.4 | 32.6% ± 19.7 | 44.7% ± 7.8 | +12.2 ± 27.1 |
| jd.Nullstride 2.3.3 | hadur2.Hadur 3.14hjsw | 4 | 0.0% ± 0.0 | 15.0% ± 15.9 | +15.0 ± 15.9 | 38.0% ± 9.8 | 45.1% ± 9.8 | +7.0 ± 9.2 |
| jk.mega.DrussGT 3.1.16 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 55.0% ± 30.5 | 48.6% ± 22.9 | -6.4 ± 17.3 | 59.3% ± 8.7 | 46.3% ± 4.9 | -13.0 ± 8.8 |
| jk.mega.DrussGT 3.1.16 | hadur2.Hadur 3.14hjsw | 4 | 35.0% ± 30.5 | 51.9% ± 31.7 | +16.9 ± 48.2 | 54.4% ± 6.6 | 47.1% ± 8.4 | -7.3 ± 14.5 |
| jk.melee.Neuromancer 7.12 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 50.0% ± 18.4 | 63.6% ± 27.6 | +13.6 ± 41.0 | 54.5% ± 15.2 | 50.0% ± 8.4 | -4.5 ± 11.6 |
| jk.melee.Neuromancer 7.12 | hadur2.Hadur 3.14hjsw | 4 | 65.0% ± 15.9 | 61.9% ± 18.4 | -3.1 ± 25.6 | 55.3% ± 19.0 | 49.1% ± 6.3 | -6.2 ± 24.0 |
| jk.mini.CunobelinDC 1.2 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 4.2% ± 7.4 | 5.6% ± 9.7 | +1.3 ± 9.7 |
| jk.mini.CunobelinDC 1.2 | hadur2.Hadur 3.14hjsw | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 4.1% ± 7.7 | 7.1% ± 8.7 | +3.0 ± 5.4 |
| jk.precise.Wintermute 0.8 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 75.0% ± 15.9 | 75.0% ± 9.2 | -0.0 ± 13.0 | 50.0% ± 11.7 | 40.7% ± 1.7 | -9.3 ± 12.0 |
| jk.precise.Wintermute 0.8 | hadur2.Hadur 3.14hjsw | 4 | 90.0% ± 18.4 | 75.6% ± 9.6 | -14.4 ± 14.3 | 51.6% ± 10.9 | 40.2% ± 10.4 | -11.4 ± 4.6 |
| kc.mega.BeepBoop 2.0 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 0.0% ± 0.0 | 22.5% ± 20.0 | +22.5 ± 20.0 | 43.8% ± 9.7 | 45.5% ± 5.2 | +1.7 ± 12.3 |
| kc.mega.BeepBoop 2.0 | hadur2.Hadur 3.14hjsw | 4 | 10.0% ± 18.4 | 25.0% ± 15.9 | +15.0 ± 15.9 | 49.9% ± 4.5 | 47.1% ± 10.3 | -2.8 ± 11.2 |
| kc.serpent.Hydra 0.21 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% | - | n/a |
| kc.serpent.Hydra 0.21 | hadur2.Hadur 3.14hjsw | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | - | - | n/a |
| kc.serpent.WaveSerpent 2.11 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 80.0% ± 26.0 | 65.8% ± 39.8 | -14.2 ± 54.2 | 45.4% ± 5.0 | 42.1% ± 9.0 | -3.3 ± 13.4 |
| kc.serpent.WaveSerpent 2.11 | hadur2.Hadur 3.14hjsw | 4 | 70.0% ± 31.8 | 84.7% ± 8.7 | +14.7 ± 37.0 | 40.3% ± 16.1 | 43.4% ± 7.7 | +3.0 ± 13.7 |
| lxx.Tomcat 3.68 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 80.0% ± 26.0 | 76.4% ± 32.6 | -3.6 ± 41.7 | 51.3% ± 13.8 | 45.6% ± 11.6 | -5.6 ± 14.4 |
| lxx.Tomcat 3.68 | hadur2.Hadur 3.14hjsw | 4 | 70.0% ± 41.1 | 58.9% ± 22.8 | -11.1 ± 37.7 | 44.3% ± 8.9 | 43.3% ± 4.7 | -0.9 ± 6.5 |
| mn.Combat 3.25.0 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 70.0% ± 18.4 | 60.0% ± 13.0 | -10.0 ± 22.5 | 45.2% ± 8.3 | 41.2% ± 5.3 | -4.0 ± 13.4 |
| mn.Combat 3.25.0 | hadur2.Hadur 3.14hjsw | 4 | 85.0% ± 30.5 | 85.0% ± 20.5 | +0.0 ± 46.8 | 57.0% ± 9.7 | 45.0% ± 9.4 | -12.1 ± 12.4 |
| mue.Ascendant 1.2.27 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 70.0% ± 41.1 | 72.5% ± 15.2 | +2.5 ± 45.7 | 38.1% ± 14.8 | 41.0% ± 8.0 | +2.9 ± 6.8 |
| mue.Ascendant 1.2.27 | hadur2.Hadur 3.14hjsw | 4 | 80.0% ± 45.0 | 76.7% ± 10.6 | -3.3 ± 35.2 | 48.0% ± 18.3 | 49.2% ± 8.2 | +1.1 ± 15.0 |
| oog.mega.saguaro.Saguaro 1.0 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 90.0% ± 18.4 | 90.0% ± 18.4 | +0.0 ± 26.0 | 92.9% ± 4.6 | 58.6% ± 21.2 | -34.3 ± 20.2 |
| oog.mega.saguaro.Saguaro 1.0 | hadur2.Hadur 3.14hjsw | 4 | 95.0% ± 15.9 | 85.0% ± 15.9 | -10.0 ± 26.0 | 93.3% ± 3.5 | 48.8% ± 9.7 | -44.5 ± 6.4 |
| pc.Wavelet 1.5 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 20.0% ± 0.0 | 25.8% ± 19.4 | +5.8 ± 19.4 | 56.1% ± 6.9 | 47.9% ± 1.7 | -8.2 ± 7.0 |
| pc.Wavelet 1.5 | hadur2.Hadur 3.14hjsw | 4 | 40.0% ± 45.0 | 50.6% ± 37.5 | +10.6 ± 21.7 | 57.8% ± 1.2 | 49.0% ± 1.9 | -8.8 ± 2.3 |
| pez.rumble.Ali 0.4.9 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 100.0% ± 0.0 | 95.0% ± 9.2 | -5.0 ± 9.2 | 0.0% ± 0.0 | 44.0% ± 65.5 | +44.0 ± 65.5 |
| pez.rumble.Ali 0.4.9 | hadur2.Hadur 3.14hjsw | 4 | 100.0% ± 0.0 | 86.7% ± 22.5 | -13.3 ± 22.5 | 0.0% ± 0.0 | 41.2% ± 4.4 | +41.2 ± 4.4 |
| pez.rumble.CassiusClay 2rho.02no | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 60.0% ± 0.0 | 51.4% ± 22.1 | -8.6 ± 22.1 | 55.8% ± 6.1 | 55.4% ± 6.5 | -0.4 ± 5.5 |
| pez.rumble.CassiusClay 2rho.02no | hadur2.Hadur 3.14hjsw | 4 | 45.0% ± 15.9 | 71.4% ± 18.4 | +26.4 ± 17.3 | 55.3% ± 6.1 | 60.4% ± 9.1 | +5.1 ± 14.3 |
| pulsar.PulsarMax 0.8.9 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 85.0% ± 15.9 | 85.0% ± 30.5 | -0.0 ± 36.7 | 45.2% ± 7.2 | 39.8% ± 9.4 | -5.4 ± 12.0 |
| pulsar.PulsarMax 0.8.9 | hadur2.Hadur 3.14hjsw | 4 | 80.0% ± 0.0 | 73.3% ± 18.9 | -6.7 ± 18.9 | 45.6% ± 12.2 | 39.4% ± 4.0 | -6.2 ± 15.6 |
| rsalesc.mega.Knight 0.6.28 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 45.0% ± 54.4 | 44.4% ± 27.2 | -0.6 ± 46.0 | 53.5% ± 17.4 | 46.5% ± 5.5 | -7.0 ± 13.4 |
| rsalesc.mega.Knight 0.6.28 | hadur2.Hadur 3.14hjsw | 4 | 45.0% ± 60.2 | 62.5% ± 41.8 | +17.5 ± 80.5 | 57.1% ± 17.7 | 51.8% ± 9.5 | -5.3 ± 19.2 |
| rsalesc.roborio.Roborio 1.2.4 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 65.0% ± 30.5 | 59.4% ± 24.6 | -5.6 ± 52.8 | 70.5% ± 10.8 | 62.4% ± 6.3 | -8.1 ± 14.0 |
| rsalesc.roborio.Roborio 1.2.4 | hadur2.Hadur 3.14hjsw | 4 | 70.0% ± 18.4 | 55.0% ± 17.5 | -15.0 ± 10.9 | 75.0% ± 9.5 | 59.6% ± 2.4 | -15.4 ± 10.1 |
| sheldor.mini.FoilistMC 1.0 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 75.0% ± 40.0 | 87.5% ± 8.0 | +12.5 ± 41.8 | 50.3% ± 6.3 | 59.1% ± 11.3 | +8.8 ± 9.6 |
| sheldor.mini.FoilistMC 1.0 | hadur2.Hadur 3.14hjsw | 4 | 90.0% ± 18.4 | 79.4% ± 13.1 | -10.6 ± 28.5 | 51.0% ± 15.0 | 55.0% ± 12.8 | +4.0 ± 3.5 |
| sheldor.mini.Foilist 1.3.1 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 95.0% ± 15.9 | 89.7% ± 13.0 | -5.3 ± 9.7 | 53.0% ± 14.2 | 55.1% ± 20.2 | +2.1 ± 16.0 |
| sheldor.mini.Foilist 1.3.1 | hadur2.Hadur 3.14hjsw | 4 | 95.0% ± 15.9 | 85.0% ± 20.5 | -10.0 ± 34.4 | 52.7% ± 14.5 | 58.5% ± 21.6 | +5.8 ± 29.9 |
| voidious.Diamond 1.8.22 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 45.0% ± 30.5 | 59.4% ± 30.1 | +14.4 ± 46.8 | 43.3% ± 8.3 | 40.9% ± 5.0 | -2.4 ± 11.3 |
| voidious.Diamond 1.8.22 | hadur2.Hadur 3.14hjsw | 4 | 45.0% ± 30.5 | 63.3% ± 32.2 | +18.3 ± 30.3 | 42.3% ± 13.6 | 42.4% ± 6.2 | +0.1 ± 19.1 |
| voidious.Dookious 1.573c | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 80.0% ± 26.0 | 70.6% ± 18.8 | -9.4 ± 38.5 | 50.4% ± 11.0 | 37.1% ± 4.9 | -13.2 ± 12.3 |
| voidious.Dookious 1.573c | hadur2.Hadur 3.14hjsw | 4 | 65.0% ± 15.9 | 72.5% ± 27.2 | +7.5 ± 27.2 | 44.2% ± 11.4 | 43.5% ± 2.2 | -0.7 ± 10.7 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 9.2% ± 14.1 | 12.6% ± 8.6 | +3.5 ± 15.6 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | hadur2.Hadur 3.14hjsw | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 6.6% ± 16.1 | 12.8% ± 11.3 | +6.2 ± 20.4 |
| xander.cat.XanderCat 12.9 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 75.0% ± 15.9 | 62.5% ± 23.9 | -12.5 ± 20.0 | 52.3% ± 9.8 | 52.4% ± 7.6 | +0.1 ± 13.3 |
| xander.cat.XanderCat 12.9 | hadur2.Hadur 3.14hjsw | 4 | 65.0% ± 54.4 | 48.3% ± 21.9 | -16.7 ± 43.7 | 48.4% ± 12.7 | 43.1% ± 12.0 | -5.3 ± 17.6 |
| zyx.mega.YersiniaPestis 3.0 | hadur2.Hadur 3.14hjswhcpkw2 | 4 | 95.0% ± 15.9 | 74.7% ± 27.1 | -20.3 ± 38.3 | 57.4% ± 4.0 | 42.9% ± 4.7 | -14.5 ± 5.2 |
| zyx.mega.YersiniaPestis 3.0 | hadur2.Hadur 3.14hjsw | 4 | 70.0% ± 18.4 | 60.0% ± 26.0 | -10.0 ± 31.8 | 43.3% ± 7.9 | 37.6% ± 7.4 | -5.7 ± 11.5 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| Krabb.sliNk.Garm 0.9u | -10.0 ± 41.1 | -1.9 ± 27.4 | +1.3 ± 16.6 | -0.5 ± 16.9 |
| aaa.r.ScalarR 0.005h.053-noshield | +5.0 ± 40.0 | +15.0 ± 15.9 | -0.1 ± 17.5 | +3.4 ± 5.3 |
| abc.Shadow 3.83c | +25.0 ± 47.7 | -2.2 ± 49.4 | +3.7 ± 8.7 | -1.9 ± 9.6 |
| ags.Midboss 1q.fast | -20.0 ± 36.7 | +4.2 ± 21.3 | -1.6 ± 21.6 | -1.9 ± 7.5 |
| ar.horizon.Horizon 1.2.2 | +5.0 ± 54.4 | +6.1 ± 59.2 | -2.7 ± 19.8 | +1.2 ± 26.2 |
| aw.Gilgalad 1.99.5c | +25.0 ± 54.4 | +5.6 ± 62.8 | +12.3 ± 27.3 | +0.2 ± 17.2 |
| axeBots.SilverSurfer 2.53.33fix | -10.0 ± 18.4 | +1.1 ± 18.0 | -5.2 ± 8.7 | +0.4 ± 9.0 |
| catcat20.Lambda 0.017 | +5.0 ± 30.5 | -12.5 ± 30.1 | -1.1 ± 25.3 | -5.9 ± 6.7 |
| cb.Domogled 1.2 | +5.0 ± 70.6 | -12.5 ± 43.8 | -0.3 ± 20.7 | -2.1 ± 13.6 |
| cb.fire.Firestarter 2.0f | -15.0 ± 40.0 | -10.0 ± 22.5 | -3.6 ± 14.5 | -5.3 ± 5.4 |
| cjm.chalk.Chalk 2.6.Be | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 | n/a |
| cs.Nene 1.0.5 | +10.0 ± 41.1 | -5.0 ± 20.5 | +3.3 ± 14.4 | -3.7 ± 8.9 |
| cs.s2.Seraphim 2.3.1 | +10.0 ± 18.4 | +0.0 ± 34.4 | +8.3 ± 13.3 | -2.0 ± 24.1 |
| darkcanuck.Pris 0.92 | -15.0 ± 30.5 | +10.0 ± 13.0 | -4.4 ± 2.1 | -2.5 ± 17.3 |
| davidalves.Firebird 0.25 | +0.0 ± 0.0 | +2.5 ± 8.0 | +0.0 ± 0.0 | +0.0 |
| davidalves.Phoenix 1.02 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | n/a |
| dsekercioglu.mega.Raven 3.56j8 | -10.0 ± 41.1 | +0.3 ± 38.5 | -1.1 ± 13.7 | -0.6 ± 11.3 |
| dsekercioglu.mega.WhiteFang 2.8.1 | -5.0 ± 30.5 | +2.8 ± 39.3 | -4.4 ± 9.5 | +2.8 ± 14.0 |
| florent.XSeries.X2 0.17 | -5.0 ± 54.4 | +15.0 ± 20.5 | +2.6 ± 29.3 | +4.7 ± 17.7 |
| florent.test.Toad 0.14t | -10.0 ± 18.4 | +1.4 ± 10.9 | -5.3 ± 11.5 | -7.8 ± 8.7 |
| fromHell.BlackBox 0.0.2 | -5.0 ± 54.4 | -0.3 ± 33.8 | -2.4 ± 18.0 | -4.6 ± 5.0 |
| fromHell.CHCl3 1.4.2 | +0.0 ± 26.0 | +14.4 ± 43.0 | -5.4 ± 8.1 | +8.5 ± 11.1 |
| gh.GresSuffurd 0.4.13 | -10.0 ± 18.4 | +2.2 ± 14.8 | -1.5 ± 2.8 | -7.4 ± 11.0 |
| jd.Nullstride 2.3.3 | +5.0 ± 15.9 | -7.2 ± 30.1 | -5.5 ± 26.4 | -0.4 ± 12.3 |
| jk.mega.DrussGT 3.1.16 | +20.0 ± 26.0 | -3.3 ± 43.5 | +4.9 ± 10.1 | -0.8 ± 4.4 |
| jk.melee.Neuromancer 7.12 | -15.0 ± 15.9 | +1.7 ± 16.7 | -0.9 ± 26.5 | +0.9 ± 10.4 |
| jk.mini.CunobelinDC 1.2 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.2 ± 0.5 | -1.5 ± 6.6 |
| jk.precise.Wintermute 0.8 | -15.0 ± 15.9 | -0.6 ± 10.1 | -1.6 ± 15.9 | +0.5 ± 9.1 |
| kc.mega.BeepBoop 2.0 | -10.0 ± 18.4 | -2.5 ± 8.0 | -6.1 ± 8.2 | -1.6 ± 11.7 |
| kc.serpent.Hydra 0.21 | +0.0 ± 0.0 | +0.0 ± 0.0 | n/a | n/a |
| kc.serpent.WaveSerpent 2.11 | +10.0 ± 41.1 | -18.9 ± 42.9 | +5.1 ± 11.6 | -1.3 ± 16.7 |
| lxx.Tomcat 3.68 | +10.0 ± 60.9 | +17.5 ± 16.7 | +7.0 ± 18.0 | +2.3 ± 8.9 |
| mn.Combat 3.25.0 | -15.0 ± 40.0 | -25.0 ± 30.5 | -11.9 ± 4.5 | -3.7 ± 11.8 |
| mue.Ascendant 1.2.27 | -10.0 ± 55.1 | -4.2 ± 17.0 | -10.0 ± 24.5 | -8.2 ± 15.2 |
| oog.mega.saguaro.Saguaro 1.0 | -5.0 ± 30.5 | +5.0 ± 15.9 | -0.4 ± 5.2 | +9.8 ± 22.0 |
| pc.Wavelet 1.5 | -20.0 ± 45.0 | -24.7 ± 30.0 | -1.8 ± 6.6 | -1.1 ± 3.4 |
| pez.rumble.Ali 0.4.9 | +0.0 ± 0.0 | +8.3 ± 21.9 | +0.0 ± 0.0 | +2.8 ± 61.5 |
| pez.rumble.CassiusClay 2rho.02no | +15.0 ± 15.9 | -20.0 ± 32.1 | +0.5 ± 11.1 | -5.0 ± 11.4 |
| pulsar.PulsarMax 0.8.9 | +5.0 ± 15.9 | +11.7 ± 42.6 | -0.4 ± 12.0 | +0.4 ± 12.1 |
| rsalesc.mega.Knight 0.6.28 | +0.0 ± 82.2 | -18.1 ± 65.5 | -3.6 ± 22.9 | -5.4 ± 13.7 |
| rsalesc.roborio.Roborio 1.2.4 | -5.0 ± 40.0 | +4.4 ± 17.0 | -4.4 ± 15.5 | +2.8 ± 6.8 |
| sheldor.mini.FoilistMC 1.0 | -15.0 ± 47.7 | +8.1 ± 14.4 | -0.7 ± 20.2 | +4.1 ± 23.6 |
| sheldor.mini.Foilist 1.3.1 | +0.0 ± 26.0 | +4.7 ± 30.3 | +0.2 ± 12.3 | -3.4 ± 34.1 |
| voidious.Diamond 1.8.22 | +0.0 ± 0.0 | -3.9 ± 54.4 | +1.0 ± 19.4 | -1.4 ± 10.1 |
| voidious.Dookious 1.573c | +15.0 ± 30.5 | -1.9 ± 42.4 | +6.2 ± 17.3 | -6.4 ± 5.9 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | +0.0 ± 0.0 | +0.0 ± 0.0 | +2.6 ± 7.9 | -0.2 ± 14.2 |
| xander.cat.XanderCat 12.9 | +10.0 ± 41.1 | +14.2 ± 8.0 | +3.9 ± 12.9 | +9.3 ± 10.4 |
| zyx.mega.YersiniaPestis 3.0 | +25.0 ± 30.5 | +14.7 ± 20.8 | +14.1 ± 9.8 | +5.3 ± 7.2 |
