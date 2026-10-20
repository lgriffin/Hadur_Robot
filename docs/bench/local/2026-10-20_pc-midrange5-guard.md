# Bench: hadur2.Hadur 3.14hjswthfgnk (cold)

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 7910 over 192 battles (41.2 per battle, most in one battle 91). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rank1-band1 | 27.7% ± 5.8 | 17.9% ± 9.4 | 41.2% ± 7.5 | 25 / 140 | 5.1% ± 1.0 | 8.9% ± 0.6 | 225 | 0 | 1.91 / 62.4 |
| jd.Nullstride 2.3.3 | rank2-band1 | 27.4% ± 9.3 | 15.7% ± 15.1 | 43.3% ± 0.7 | 22 / 140 | 5.3% ± 0.8 | 8.6% ± 0.5 | 213 | 0 | 1.72 / 35.8 |
| jk.mega.DrussGT 3.1.16 | rank3-band1 | 45.6% ± 8.5 | 44.5% ± 16.2 | 46.5% ± 2.9 | 63 / 140 | 7.7% ± 0.5 | 10.5% ± 0.3 | 332 | 0 | 1.44 / 384.0 |
| oog.mega.saguaro.Saguaro 1.0 | rank4-band1 | 75.8% ± 3.4 | 87.1% ± 5.9 | 64.2% ± 2.0 | 122 / 140 | 18.3% ± 0.6 | 6.3% ± 0.1 | 75 | 0 | 2.05 / 418.7 |
| aaa.r.ScalarR 0.005h.053-noshield | rank5-band1 | 32.7% ± 5.3 | 25.0% ± 12.0 | 41.7% ± 5.7 | 35 / 140 | 7.0% ± 0.6 | 10.9% ± 0.5 | 296 | 0 | 1.73 / 69.0 |
| voidious.Diamond 1.8.22 | rank6-band1 | 46.8% ± 3.4 | 54.3% ± 6.4 | 40.2% ± 2.4 | 76 / 140 | 7.5% ± 1.1 | 9.8% ± 0.9 | 293 | 0 | 1.77 / 43.5 |
| cb.fire.Firestarter 2.0f | rank7-band1 | 54.1% ± 9.9 | 52.9% ± 15.1 | 55.0% ± 4.6 | 74 / 140 | 9.2% ± 1.1 | 9.7% ± 0.9 | 265 | 0 | 1.73 / 37.0 |
| dsekercioglu.mega.Raven 3.56j8 | rank8-band1 | 59.7% ± 8.8 | 75.7% ± 16.8 | 43.4% ± 2.8 | 106 / 140 | 9.9% ± 0.5 | 9.3% ± 0.6 | 171 | 0 | 1.23 / 22.1 |
| xander.cat.XanderCat 12.9 | rank9-band1 | 58.0% ± 7.0 | 66.0% ± 10.8 | 50.7% ± 3.3 | 93 / 140 | 12.6% ± 0.9 | 9.0% ± 0.9 | 223 | 0 | 1.29 / 24.6 |
| lxx.Tomcat 3.68 | rank10-band1 | 55.0% ± 4.5 | 67.1% ± 4.5 | 43.1% ± 4.8 | 94 / 140 | 9.8% ± 0.6 | 10.3% ± 1.0 | 304 | 0 | 1.94 / 58.0 |
| rsalesc.mega.Knight 0.6.28 | rank11-band2 | 51.8% ± 7.3 | 52.9% ± 12.0 | 50.4% ± 3.3 | 74 / 140 | 9.7% ± 0.8 | 10.6% ± 1.0 | 313 | 0 | 1.97 / 32.9 |
| aw.Gilgalad 1.99.5c | rank12-band2 | 50.4% ± 7.7 | 53.6% ± 13.1 | 47.7% ± 3.8 | 75 / 140 | 11.8% ± 1.8 | 11.3% ± 1.3 | 208 | 0 | 1.48 / 24.6 |
| pc.Wavelet 1.5 | rank13-band2 | 51.6% ± 6.4 | 45.7% ± 6.4 | 56.9% ± 9.1 | 64 / 140 | 11.8% ± 1.7 | 10.0% ± 1.5 | 199 | 0 | 1.97 / 23.6 |
| gh.GresSuffurd 0.4.13 | rank14-band2 | 67.4% ± 5.6 | 81.4% ± 5.9 | 53.0% ± 4.6 | 114 / 140 | 11.0% ± 0.7 | 8.4% ± 1.5 | 159 | 0 | 1.03 / 18.6 |
| kc.serpent.WaveSerpent 2.11 | rank15-band2 | 59.0% ± 5.7 | 72.1% ± 10.7 | 45.7% ± 2.6 | 101 / 140 | 9.8% ± 1.1 | 8.2% ± 1.0 | 82 | 0 | 2.12 / 55.3 |
| dsekercioglu.mega.WhiteFang 2.8.1 | rank16-band2 | 72.5% ± 6.8 | 87.0% ± 7.9 | 57.5% ± 6.8 | 122 / 140 | 11.7% ± 1.0 | 8.1% ± 0.4 | 164 | 0 | 1.23 / 20.9 |
| cs.Nene 1.0.5 | rank17-band2 | 61.2% ± 3.5 | 79.3% ± 4.4 | 42.3% ± 4.0 | 111 / 140 | 10.0% ± 1.0 | 7.7% ± 0.5 | 107 | 0 | 1.30 / 33.5 |
| jk.melee.Neuromancer 7.12 | rank18-band2 | 52.8% ± 14.9 | 54.3% ± 21.3 | 51.4% ± 9.9 | 76 / 140 | 11.1% ± 1.3 | 10.5% ± 0.4 | 284 | 0 | 1.69 / 30.0 |
| voidious.Dookious 1.573c | rank19-band2 | 64.9% ± 8.4 | 82.1% ± 10.1 | 45.5% ± 7.5 | 115 / 140 | 9.8% ± 1.1 | 7.1% ± 1.0 | 109 | 0 | 1.28 / 25.6 |
| davidalves.Phoenix 1.02 | rank21-band2 | 98.9% ± 0.4 | 100.0% ± 0.0 | 0.0% ± 0.0 | 140 / 140 | 0.0% ± 0.0 | 0.1% ± 0.1 | 48 | 0 | 0.54 / 24.0 |
| rsalesc.roborio.Roborio 1.2.4 | rank22-band2 | 61.4% ± 5.1 | 55.7% ± 9.5 | 65.1% ± 6.6 | 78 / 140 | 12.7% ± 1.0 | 9.3% ± 0.9 | 276 | 0 | 1.57 / 193.2 |
| cb.Domogled 1.2 | rank23-band2 | 68.8% ± 6.5 | 64.3% ± 5.9 | 71.5% ± 5.8 | 90 / 140 | 12.2% ± 0.7 | 7.9% ± 0.9 | 274 | 0 | 1.00 / 232.3 |
| mue.Ascendant 1.2.27 | rank24-band2 | 67.4% ± 11.8 | 80.0% ± 15.3 | 55.6% ± 7.5 | 112 / 140 | 12.9% ± 1.5 | 7.5% ± 1.6 | 90 | 0 | 0.99 / 15.2 |
| abc.Shadow 3.83c | rank25-band2 | 54.1% ± 14.3 | 66.4% ± 23.3 | 42.5% ± 4.3 | 93 / 140 | 10.4% ± 0.6 | 8.5% ± 1.1 | 144 | 0 | 1.14 / 21.5 |
| darkcanuck.Pris 0.92 | rank26-band2 | 63.5% ± 10.0 | 76.4% ± 13.1 | 51.5% ± 7.6 | 107 / 140 | 12.0% ± 1.3 | 8.4% ± 0.8 | 80 | 0 | 1.88 / 96.7 |
| fromHell.BlackBox 0.0.2 | rank27-band2 | 71.8% ± 6.3 | 82.1% ± 11.4 | 61.5% ± 1.7 | 115 / 140 | 15.2% ± 1.7 | 8.1% ± 0.3 | 113 | 0 | 1.02 / 16.4 |
| jk.precise.Wintermute 0.8 | rank28-band2 | 69.6% ± 7.7 | 85.0% ± 8.6 | 55.0% ± 6.7 | 119 / 140 | 12.3% ± 0.7 | 8.3% ± 0.9 | 118 | 0 | 1.22 / 154.7 |
| kc.serpent.Hydra 0.21 | rank29-band2 | 99.8% ± 0.7 | 100.0% ± 0.0 | 37.5% ± 39.8 | 140 / 140 | 0.0% ± 0.0 | 0.0% ± 0.1 | 44 | 0 | 0.71 / 25.3 |
| davidalves.Firebird 0.25 | rank30-band2 | 96.8% ± 5.1 | 98.6% ± 2.6 | 0.0% ± 0.0 | 138 / 140 | 0.0% ± 0.0 | 0.2% ± 0.2 | 46 | 0 | 0.71 / 73.0 |
| pulsar.PulsarMax 0.8.9 | rank31-band2 | 66.3% ± 8.7 | 85.0% ± 12.0 | 47.1% ± 5.1 | 119 / 140 | 11.1% ± 0.5 | 7.5% ± 0.7 | 120 | 0 | 1.13 / 200.8 |
| zyx.mega.YersiniaPestis 3.0 | rank32-band2 | 62.2% ± 10.4 | 76.4% ± 11.4 | 48.6% ± 9.9 | 107 / 140 | 11.2% ± 0.8 | 7.7% ± 1.0 | 152 | 0 | 1.43 / 201.2 |
| ags.Midboss 1q.fast | rank33-band2 | 66.5% ± 3.9 | 76.4% ± 6.8 | 57.1% ± 2.2 | 107 / 140 | 13.2% ± 0.5 | 9.1% ± 1.3 | 192 | 0 | 1.35 / 43.1 |
| pez.rumble.CassiusClay 2rho.02no | rank35-band2 | 58.3% ± 5.6 | 57.9% ± 9.4 | 58.1% ± 4.4 | 81 / 140 | 12.6% ± 0.7 | 8.4% ± 0.5 | 261 | 0 | 1.10 / 240.5 |
| Krabb.sliNk.Garm 0.9u | rank36-band2 | 67.8% ± 12.2 | 81.4% ± 14.1 | 52.4% ± 10.1 | 114 / 140 | 10.6% ± 1.4 | 6.6% ± 0.3 | 115 | 0 | 1.18 / 147.4 |
| axeBots.SilverSurfer 2.53.33fix | rank37-band2 | 70.6% ± 7.6 | 84.3% ± 7.9 | 57.8% ± 6.8 | 118 / 140 | 12.7% ± 1.3 | 7.6% ± 1.2 | 161 | 0 | 1.43 / 11.3 |
| mn.Combat 3.25.0 | rank38-band2 | 57.9% ± 5.6 | 71.2% ± 8.6 | 43.9% ± 3.0 | 100 / 140 | 10.3% ± 0.5 | 9.5% ± 0.6 | 233 | 0 | 1.70 / 266.8 |
| cs.s2.Seraphim 2.3.1 | rank39-band2 | 64.8% ± 10.8 | 80.0% ± 13.4 | 49.4% ± 8.2 | 112 / 140 | 11.2% ± 0.4 | 7.3% ± 1.1 | 129 | 0 | 1.20 / 15.7 |
| fromHell.CHCl3 1.4.2 | rank40-band2 | 72.8% ± 6.1 | 85.6% ± 4.0 | 60.4% ± 7.2 | 120 / 140 | 13.6% ± 1.0 | 7.1% ± 1.6 | 97 | 0 | 0.99 / 15.2 |
| jk.mini.CunobelinDC 1.2 | rank41-band2 | 97.4% ± 2.9 | 99.3% ± 2.3 | 5.6% ± 6.6 | 139 / 140 | 0.4% ± 1.1 | 1.1% ± 0.1 | 70 | 0 | 0.68 / 234.7 |
| sheldor.mini.Foilist 1.3.1 | rank42-band2 | 62.8% ± 3.8 | 74.3% ± 3.7 | 52.1% ± 4.9 | 104 / 140 | 11.7% ± 0.5 | 8.8% ± 1.1 | 233 | 0 | 1.21 / 178.4 |
| florent.test.Toad 0.14t | rank43-band2 | 65.9% ± 16.1 | 80.0% ± 18.9 | 52.2% ± 12.1 | 112 / 140 | 11.7% ± 0.7 | 7.7% ± 1.7 | 123 | 0 | 1.10 / 19.8 |
| ar.horizon.Horizon 1.2.2 | rank44-band2 | 62.3% ± 13.4 | 74.3% ± 18.6 | 50.5% ± 8.3 | 104 / 140 | 11.5% ± 0.3 | 8.1% ± 0.8 | 176 | 0 | 1.43 / 79.1 |
| cjm.chalk.Chalk 2.6.Be | rank45-band2 | 100.0% ± 0.0 | 100.0% ± 0.0 | 50.0% ± 0.0 | 140 / 140 | 0.0% ± 0.0 | 0.0% ± 0.0 | 46 | 0 | 0.58 / 132.4 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | rank46-band2 | 97.2% ± 4.5 | 99.3% ± 2.3 | 2.9% ± 1.9 | 139 / 140 | 0.0% ± 0.0 | 1.8% ± 1.0 | 45 | 0 | 0.47 / 218.7 |
| sheldor.mini.FoilistMC 1.0 | rank47-band2 | 74.6% ± 12.5 | 87.1% ± 16.8 | 61.6% ± 7.5 | 122 / 140 | 12.0% ± 1.0 | 7.1% ± 1.0 | 164 | 0 | 1.31 / 22.1 |
| pez.rumble.Ali 0.4.9 | rank48-band2 | 80.3% ± 9.1 | 92.9% ± 5.9 | 44.9% ± 5.2 | 130 / 140 | 4.6% ± 1.6 | 2.6% ± 1.6 | 62 | 0 | 1.53 / 22.2 |
| catcat20.Lambda 0.017 | rank49-band2 | 72.5% ± 5.8 | 86.4% ± 6.8 | 58.7% ± 4.7 | 121 / 140 | 13.0% ± 1.6 | 7.4% ± 1.2 | 159 | 0 | 1.76 / 17.1 |
| florent.XSeries.X2 0.17 | rank50-band2 | 65.2% ± 13.2 | 79.3% ± 15.5 | 52.0% ± 9.6 | 111 / 140 | 11.9% ± 0.8 | 8.1% ± 1.0 | 117 | 0 | 2.12 / 12.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 2859 | 50.3% | 34.0% | 0.0% | 15.7% | 1708 |
| jd.Nullstride 2.3.3 | 4 | 2862 | 51.5% | 32.5% | 0.0% | 16.0% | 1662 |
| jk.mega.DrussGT 3.1.16 | 4 | 2386 | 40.3% | 46.2% | 0.0% | 13.5% | 2992 |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 1160 | 19.4% | 72.6% | 0.1% | 7.9% | 671 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 2914 | 45.0% | 39.6% | 0.0% | 15.3% | 2590 |
| voidious.Diamond 1.8.22 | 4 | 2369 | 33.8% | 53.8% | 0.0% | 12.4% | 2748 |
| cb.fire.Firestarter 2.0f | 4 | 2030 | 40.7% | 46.5% | 0.0% | 12.9% | 3208 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 1803 | 23.6% | 66.9% | 0.0% | 9.5% | 1293 |
| xander.cat.XanderCat 12.9 | 4 | 1995 | 29.5% | 60.0% | 0.0% | 10.5% | 1575 |
| lxx.Tomcat 3.68 | 4 | 2048 | 28.1% | 61.3% | 0.0% | 10.6% | 2107 |
| rsalesc.mega.Knight 0.6.28 | 4 | 2199 | 37.5% | 49.7% | 0.0% | 12.8% | 2899 |
| aw.Gilgalad 1.99.5c | 4 | 2469 | 32.9% | 53.4% | 0.0% | 13.7% | 1216 |
| pc.Wavelet 1.5 | 4 | 2329 | 40.8% | 44.1% | 0.3% | 14.8% | 1684 |
| gh.GresSuffurd 0.4.13 | 4 | 1504 | 21.6% | 69.7% | 0.0% | 8.7% | 1097 |
| kc.serpent.WaveSerpent 2.11 | 4 | 1828 | 26.7% | 62.8% | 0.0% | 10.5% | 1016 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 1268 | 17.7% | 75.1% | 0.0% | 7.1% | 1187 |
| cs.Nene 1.0.5 | 4 | 1727 | 21.0% | 70.6% | 0.0% | 8.4% | 919 |
| jk.melee.Neuromancer 7.12 | 4 | 2285 | 35.0% | 52.6% | 0.0% | 12.4% | 1863 |
| voidious.Dookious 1.573c | 4 | 1503 | 20.8% | 71.1% | 0.0% | 8.1% | 997 |
| davidalves.Phoenix 1.02 | 4 | 24 | 0.0% | 100.0% | 0.0% | 0.0% | 1245 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 1866 | 41.5% | 45.2% | 0.0% | 13.3% | 2421 |
| cb.Domogled 1.2 | 4 | 1493 | 41.9% | 45.8% | 0.0% | 12.3% | 2520 |
| mue.Ascendant 1.2.27 | 4 | 1580 | 22.1% | 68.2% | 0.0% | 9.7% | 768 |
| abc.Shadow 3.83c | 4 | 2133 | 27.5% | 61.3% | 0.0% | 11.2% | 957 |
| darkcanuck.Pris 0.92 | 4 | 1768 | 23.3% | 66.9% | 0.0% | 9.7% | 825 |
| fromHell.BlackBox 0.0.2 | 4 | 1383 | 22.6% | 68.5% | 0.0% | 8.9% | 837 |
| jk.precise.Wintermute 0.8 | 4 | 1482 | 17.7% | 74.4% | 0.0% | 7.9% | 879 |
| kc.serpent.Hydra 0.21 | 4 | 5 | 0.0% | 100.0% | 0.0% | 0.0% | 1382 |
| davidalves.Firebird 0.25 | 4 | 69 | 36.2% | 51.4% | 0.0% | 12.3% | 1305 |
| pulsar.PulsarMax 0.8.9 | 4 | 1527 | 17.2% | 75.5% | 0.0% | 7.3% | 924 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 1776 | 23.2% | 67.0% | 0.0% | 9.8% | 875 |
| ags.Midboss 1q.fast | 4 | 1664 | 24.8% | 64.9% | 0.0% | 10.3% | 904 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 2001 | 36.9% | 50.2% | 0.0% | 12.9% | 1608 |
| Krabb.sliNk.Garm 0.9u | 4 | 1381 | 23.5% | 67.9% | 0.0% | 8.6% | 930 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 1423 | 19.3% | 72.4% | 0.0% | 8.3% | 924 |
| mn.Combat 3.25.0 | 4 | 1845 | 27.1% | 63.2% | 0.0% | 9.7% | 1629 |
| cs.s2.Seraphim 2.3.1 | 4 | 1622 | 21.6% | 69.5% | 0.0% | 8.9% | 866 |
| fromHell.CHCl3 1.4.2 | 4 | 1310 | 19.1% | 73.0% | 0.0% | 7.9% | 837 |
| jk.mini.CunobelinDC 1.2 | 4 | 56 | 22.2% | 69.8% | 0.0% | 8.0% | 1406 |
| sheldor.mini.Foilist 1.3.1 | 4 | 1785 | 25.2% | 63.8% | 0.0% | 11.0% | 1253 |
| florent.test.Toad 0.14t | 4 | 1594 | 22.0% | 68.7% | 0.0% | 9.3% | 882 |
| ar.horizon.Horizon 1.2.2 | 4 | 1758 | 25.6% | 64.1% | 0.0% | 10.3% | 1063 |
| cjm.chalk.Chalk 2.6.Be | 4 | - | - | - | - | - | 1370 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 61 | 20.7% | 69.8% | 0.0% | 9.5% | 1052 |
| sheldor.mini.FoilistMC 1.0 | 4 | 1182 | 19.0% | 72.9% | 0.0% | 8.1% | 1203 |
| pez.rumble.Ali 0.4.9 | 4 | 596 | 21.0% | 71.4% | 0.0% | 7.6% | 1244 |
| catcat20.Lambda 0.017 | 4 | 1316 | 18.1% | 74.3% | 0.0% | 7.7% | 929 |
| florent.XSeries.X2 0.17 | 4 | 1680 | 21.6% | 69.0% | 0.0% | 9.4% | 871 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 4 | 0 | 0 | 1.61 | 0 | 0 | 0 |
| jd.Nullstride 2.3.3 | 4 | 2 | 0 | 0 | 1.52 | 2 | 2 | 0 |
| jk.mega.DrussGT 3.1.16 | 4 | 0 | 0 | 0 | 2.37 | 3 | 3 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 4 | 0 | 0 | 0.54 | 0 | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 1 | 0 | 0 | 2.11 | 0 | 0 | 0 |
| voidious.Diamond 1.8.22 | 4 | 0 | 0 | 0 | 2.09 | 2 | 2 | 0 |
| cb.fire.Firestarter 2.0f | 4 | 3 | 0 | 0 | 1.89 | 0 | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 2 | 0 | 0 | 1.22 | 2 | 2 | 0 |
| xander.cat.XanderCat 12.9 | 4 | 4 | 0 | 0 | 1.59 | 0 | 0 | 0 |
| lxx.Tomcat 3.68 | 4 | 0 | 0 | 0 | 2.17 | 0 | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 4 | 0 | 0 | 0 | 2.24 | 2 | 2 | 0 |
| aw.Gilgalad 1.99.5c | 4 | 2 | 0 | 0 | 1.49 | 2 | 2 | 0 |
| pc.Wavelet 1.5 | 4 | 3 | 0 | 0 | 1.42 | 1 | 1 | 0 |
| gh.GresSuffurd 0.4.13 | 4 | 1 | 0 | 0 | 1.14 | 3 | 3 | 0 |
| kc.serpent.WaveSerpent 2.11 | 4 | 3 | 0 | 0 | 0.59 | 1 | 1 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 3 | 0 | 0 | 1.17 | 1 | 1 | 0 |
| cs.Nene 1.0.5 | 4 | 4 | 0 | 0 | 0.76 | 0 | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 4 | 2 | 0 | 0 | 2.03 | 1 | 1 | 0 |
| voidious.Dookious 1.573c | 4 | 4 | 0 | 0 | 0.78 | 0 | 0 | 0 |
| davidalves.Phoenix 1.02 | 4 | 4 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 2 | 0 | 0 | 1.97 | 0 | 0 | 0 |
| cb.Domogled 1.2 | 4 | 3 | 0 | 0 | 1.96 | 0 | 0 | 0 |
| mue.Ascendant 1.2.27 | 4 | 2 | 0 | 0 | 0.64 | 2 | 2 | 0 |
| abc.Shadow 3.83c | 4 | 3 | 0 | 0 | 1.03 | 1 | 1 | 0 |
| darkcanuck.Pris 0.92 | 4 | 3 | 0 | 0 | 0.57 | 1 | 1 | 0 |
| fromHell.BlackBox 0.0.2 | 4 | 4 | 0 | 0 | 0.81 | 0 | 0 | 0 |
| jk.precise.Wintermute 0.8 | 4 | 2 | 0 | 0 | 0.84 | 2 | 2 | 0 |
| kc.serpent.Hydra 0.21 | 4 | 4 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| davidalves.Firebird 0.25 | 4 | 4 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 4 | 3 | 0 | 0 | 0.86 | 1 | 1 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 1 | 0 | 0 | 1.09 | 3 | 3 | 0 |
| ags.Midboss 1q.fast | 4 | 2 | 0 | 0 | 1.37 | 2 | 2 | 0 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 3 | 0 | 0 | 1.86 | 0 | 0 | 0 |
| Krabb.sliNk.Garm 0.9u | 4 | 2 | 0 | 0 | 0.82 | 2 | 2 | 0 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 3 | 0 | 0 | 1.15 | 1 | 1 | 0 |
| mn.Combat 3.25.0 | 4 | 4 | 0 | 0 | 1.66 | 0 | 0 | 0 |
| cs.s2.Seraphim 2.3.1 | 4 | 2 | 0 | 0 | 0.92 | 2 | 2 | 0 |
| fromHell.CHCl3 1.4.2 | 4 | 3 | 0 | 0 | 0.69 | 1 | 1 | 0 |
| jk.mini.CunobelinDC 1.2 | 4 | 4 | 0 | 0 | 0.50 | 0 | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 4 | 1 | 0 | 0 | 1.66 | 3 | 3 | 0 |
| florent.test.Toad 0.14t | 4 | 4 | 0 | 0 | 0.88 | 0 | 0 | 0 |
| ar.horizon.Horizon 1.2.2 | 4 | 3 | 0 | 0 | 1.26 | 1 | 1 | 0 |
| cjm.chalk.Chalk 2.6.Be | 4 | 4 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 4 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 4 | 2 | 0 | 0 | 1.17 | 2 | 2 | 0 |
| pez.rumble.Ali 0.4.9 | 4 | 3 | 0 | 0 | 0.44 | 1 | 1 | 0 |
| catcat20.Lambda 0.017 | 4 | 4 | 0 | 0 | 1.14 | 0 | 0 | 0 |
| florent.XSeries.X2 0.17 | 4 | 4 | 0 | 0 | 0.84 | 0 | 0 | 0 |

129 of 192 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 17819 | 241 | 17873 | 17813 (100.0%) | 6 (0.0%) | 60 (0.3%) | 1360 | 129 | 217 |
| jd.Nullstride 2.3.3 | 16958 | 235 | 17006 | 16945 (99.9%) | 13 (0.1%) | 61 (0.4%) | 1368 | 93 | 190 |
| jk.mega.DrussGT 3.1.16 | 34473 | 10 | 34476 | 34471 (100.0%) | 2 (0.0%) | 5 (0.0%) | 2232 | 282 | 316 |
| oog.mega.saguaro.Saguaro 1.0 | 4527 | 11 | 4530 | 4525 (100.0%) | 2 (0.0%) | 5 (0.1%) | 243 | 62 | 42 |
| aaa.r.ScalarR 0.005h.053-noshield | 28815 | 12 | 28884 | 28814 (100.0%) | 1 (0.0%) | 70 (0.2%) | 2421 | 337 | 274 |
| voidious.Diamond 1.8.22 | 30881 | 643 | 30939 | 30858 (99.9%) | 23 (0.1%) | 81 (0.3%) | 2739 | 228 | 307 |
| cb.fire.Firestarter 2.0f | 32065 | 671 | 32451 | 32012 (99.8%) | 53 (0.2%) | 439 (1.4%) | 7262 | 267 | 287 |
| dsekercioglu.mega.Raven 3.56j8 | 12134 | 59 | 12132 | 12129 (100.0%) | 5 (0.0%) | 3 (0.0%) | 874 | 145 | 179 |
| xander.cat.XanderCat 12.9 | 12574 | 6 | 12619 | 12571 (100.0%) | 3 (0.0%) | 48 (0.4%) | 1881 | 190 | 196 |
| lxx.Tomcat 3.68 | 22797 | 406 | 22771 | 22757 (99.8%) | 40 (0.2%) | 14 (0.1%) | 2031 | 157 | 274 |
| rsalesc.mega.Knight 0.6.28 | 32916 | 275 | 32877 | 32869 (99.9%) | 47 (0.1%) | 8 (0.0%) | 2791 | 271 | 302 |
| aw.Gilgalad 1.99.5c | 11682 | 11 | 11685 | 11681 (100.0%) | 1 (0.0%) | 4 (0.0%) | 866 | 147 | 193 |
| pc.Wavelet 1.5 | 14896 | 3 | 14905 | 14895 (100.0%) | 1 (0.0%) | 10 (0.1%) | 1516 | 147 | 182 |
| gh.GresSuffurd 0.4.13 | 9797 | 5 | 9798 | 9796 (100.0%) | 1 (0.0%) | 2 (0.0%) | 580 | 109 | 138 |
| kc.serpent.WaveSerpent 2.11 | 7327 | 4 | 7328 | 7327 (100.0%) | 0 (0.0%) | 1 (0.0%) | 536 | 62 | 64 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 9803 | 10 | 9808 | 9799 (100.0%) | 4 (0.0%) | 9 (0.1%) | 776 | 98 | 175 |
| cs.Nene 1.0.5 | 7528 | 63 | 7528 | 7528 (100.0%) | 0 (0.0%) | 0 (0.0%) | 442 | 67 | 79 |
| jk.melee.Neuromancer 7.12 | 19022 | 11 | 19040 | 19016 (100.0%) | 6 (0.0%) | 24 (0.1%) | 1837 | 174 | 338 |
| voidious.Dookious 1.573c | 7405 | 8 | 7407 | 7405 (100.0%) | 0 (0.0%) | 2 (0.0%) | 524 | 55 | 69 |
| davidalves.Phoenix 1.02 | 5801 | 0 | 5802 | 5801 (100.0%) | 0 (0.0%) | 1 (0.0%) | 2455 | 2 | 14 |
| rsalesc.roborio.Roborio 1.2.4 | 23819 | 6 | 23839 | 23813 (100.0%) | 6 (0.0%) | 26 (0.1%) | 2486 | 222 | 303 |
| cb.Domogled 1.2 | 21605 | 1 | 21947 | 21601 (100.0%) | 4 (0.0%) | 346 (1.6%) | 5663 | 153 | 255 |
| mue.Ascendant 1.2.27 | 5811 | 11 | 5810 | 5806 (99.9%) | 5 (0.1%) | 4 (0.1%) | 222 | 82 | 83 |
| abc.Shadow 3.83c | 7912 | 470 | 7861 | 7860 (99.3%) | 52 (0.7%) | 1 (0.0%) | 495 | 83 | 127 |
| darkcanuck.Pris 0.92 | 6151 | 26 | 6152 | 6151 (100.0%) | 0 (0.0%) | 1 (0.0%) | 285 | 69 | 55 |
| fromHell.BlackBox 0.0.2 | 6934 | 16 | 6935 | 6932 (100.0%) | 2 (0.0%) | 3 (0.0%) | 510 | 107 | 132 |
| jk.precise.Wintermute 0.8 | 7282 | 6 | 7281 | 7281 (100.0%) | 1 (0.0%) | 0 (0.0%) | 344 | 87 | 92 |
| kc.serpent.Hydra 0.21 | 9043 | 1 | 9043 | 9038 (99.9%) | 5 (0.1%) | 5 (0.1%) | 32 | 2 | 12 |
| davidalves.Firebird 0.25 | 6999 | 0 | 7000 | 6999 (100.0%) | 0 (0.0%) | 1 (0.0%) | 1468 | 1 | 14 |
| pulsar.PulsarMax 0.8.9 | 7324 | 6 | 7325 | 7322 (100.0%) | 2 (0.0%) | 3 (0.0%) | 454 | 37 | 95 |
| zyx.mega.YersiniaPestis 3.0 | 6519 | 298 | 6502 | 6498 (99.7%) | 21 (0.3%) | 4 (0.1%) | 370 | 62 | 156 |
| ags.Midboss 1q.fast | 7691 | 24 | 7691 | 7688 (100.0%) | 3 (0.0%) | 3 (0.0%) | 427 | 87 | 180 |
| pez.rumble.CassiusClay 2rho.02no | 14902 | 10 | 14927 | 14901 (100.0%) | 1 (0.0%) | 26 (0.2%) | 1693 | 142 | 218 |
| Krabb.sliNk.Garm 0.9u | 7641 | 8 | 7616 | 7613 (99.6%) | 28 (0.4%) | 3 (0.0%) | 427 | 57 | 355 |
| axeBots.SilverSurfer 2.53.33fix | 5475 | 5 | 5507 | 5473 (100.0%) | 2 (0.0%) | 34 (0.6%) | 720 | 86 | 125 |
| mn.Combat 3.25.0 | 16320 | 10 | 16320 | 16314 (100.0%) | 6 (0.0%) | 6 (0.0%) | 1434 | 142 | 222 |
| cs.s2.Seraphim 2.3.1 | 6771 | 15 | 6770 | 6769 (100.0%) | 2 (0.0%) | 1 (0.0%) | 342 | 56 | 100 |
| fromHell.CHCl3 1.4.2 | 5933 | 7 | 5934 | 5931 (100.0%) | 2 (0.0%) | 3 (0.1%) | 384 | 64 | 51 |
| jk.mini.CunobelinDC 1.2 | 13564 | 144 | 13564 | 13564 (100.0%) | 0 (0.0%) | 0 (0.0%) | 16 | 5 | 12 |
| sheldor.mini.Foilist 1.3.1 | 12094 | 15 | 12093 | 12091 (100.0%) | 3 (0.0%) | 2 (0.0%) | 905 | 102 | 219 |
| florent.test.Toad 0.14t | 6497 | 3 | 6497 | 6495 (100.0%) | 2 (0.0%) | 2 (0.0%) | 418 | 62 | 70 |
| ar.horizon.Horizon 1.2.2 | 9124 | 8 | 9124 | 9124 (100.0%) | 0 (0.0%) | 0 (0.0%) | 584 | 86 | 137 |
| cjm.chalk.Chalk 2.6.Be | 7975 | 0 | 7975 | 7975 (100.0%) | 0 (0.0%) | 0 (0.0%) | 143 | 2 | 9 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 8803 | 211 | 8803 | 8803 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 3 | 11 |
| sheldor.mini.FoilistMC 1.0 | 11775 | 54 | 11778 | 11775 (100.0%) | 0 (0.0%) | 3 (0.0%) | 748 | 96 | 143 |
| pez.rumble.Ali 0.4.9 | 7747 | 54 | 7747 | 7747 (100.0%) | 0 (0.0%) | 0 (0.0%) | 1929 | 30 | 36 |
| catcat20.Lambda 0.017 | 7667 | 118 | 7657 | 7655 (99.8%) | 12 (0.2%) | 2 (0.0%) | 484 | 73 | 139 |
| florent.XSeries.X2 0.17 | 6354 | 2 | 6356 | 6351 (100.0%) | 3 (0.0%) | 5 (0.1%) | 376 | 67 | 104 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 17875 | 1866 (10.4%) | 16942 |
| jd.Nullstride 2.3.3 | 16839 | 1718 (10.2%) | 16140 |
| jk.mega.DrussGT 3.1.16 | 33909 | 4270 (12.6%) | 33851 |
| oog.mega.saguaro.Saguaro 1.0 | 5189 | 381 (7.3%) | 5170 |
| aaa.r.ScalarR 0.005h.053-noshield | 29105 | 3610 (12.4%) | 28366 |
| voidious.Diamond 1.8.22 | 31353 | 3259 (10.4%) | 30378 |
| cb.fire.Firestarter 2.0f | 37021 | 3297 (8.9%) | 36256 |
| dsekercioglu.mega.Raven 3.56j8 | 12897 | 1277 (9.9%) | 11692 |
| xander.cat.XanderCat 12.9 | 16227 | 1401 (8.6%) | 15519 |
| lxx.Tomcat 3.68 | 23243 | 2514 (10.8%) | 22864 |
| rsalesc.mega.Knight 0.6.28 | 32873 | 3715 (11.3%) | 31907 |
| aw.Gilgalad 1.99.5c | 11709 | 1071 (9.1%) | 11285 |
| pc.Wavelet 1.5 | 17200 | 1500 (8.7%) | 16744 |
| gh.GresSuffurd 0.4.13 | 10102 | 973 (9.6%) | 8805 |
| kc.serpent.WaveSerpent 2.11 | 9419 | 637 (6.8%) | 8654 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 11373 | 957 (8.4%) | 9913 |
| cs.Nene 1.0.5 | 8377 | 735 (8.8%) | 5957 |
| jk.melee.Neuromancer 7.12 | 19935 | 1944 (9.8%) | 19237 |
| voidious.Dookious 1.573c | 9234 | 681 (7.4%) | 5637 |
| davidalves.Phoenix 1.02 | 127 | 5789 (4558.3%) | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 26632 | 2450 (9.2%) | 26615 |
| cb.Domogled 1.2 | 27951 | 2221 (7.9%) | 26814 |
| mue.Ascendant 1.2.27 | 6131 | 502 (8.2%) | 4424 |
| abc.Shadow 3.83c | 8745 | 674 (7.7%) | 7572 |
| darkcanuck.Pris 0.92 | 6927 | 546 (7.9%) | 5908 |
| fromHell.BlackBox 0.0.2 | 6945 | 669 (9.6%) | 6722 |
| jk.precise.Wintermute 0.8 | 7481 | 707 (9.5%) | 6948 |
| kc.serpent.Hydra 0.21 | 150 | 9041 (6027.3%) | 0 |
| davidalves.Firebird 0.25 | 123 | 6983 (5677.2%) | 0 |
| pulsar.PulsarMax 0.8.9 | 8346 | 735 (8.8%) | 6600 |
| zyx.mega.YersiniaPestis 3.0 | 7579 | 520 (6.9%) | 5131 |
| ags.Midboss 1q.fast | 7790 | 708 (9.1%) | 6859 |
| pez.rumble.CassiusClay 2rho.02no | 16557 | 1460 (8.8%) | 15405 |
| Krabb.sliNk.Garm 0.9u | 8204 | 678 (8.3%) | 6679 |
| axeBots.SilverSurfer 2.53.33fix | 8135 | 451 (5.5%) | 5812 |
| mn.Combat 3.25.0 | 17273 | 1630 (9.4%) | 16884 |
| cs.s2.Seraphim 2.3.1 | 7477 | 591 (7.9%) | 5339 |
| fromHell.CHCl3 1.4.2 | 6897 | 573 (8.3%) | 5087 |
| jk.mini.CunobelinDC 1.2 | 366 | 13420 (3666.7%) | 0 |
| sheldor.mini.Foilist 1.3.1 | 12083 | 1053 (8.7%) | 11092 |
| florent.test.Toad 0.14t | 7747 | 607 (7.8%) | 7001 |
| ar.horizon.Horizon 1.2.2 | 9830 | 891 (9.1%) | 7731 |
| cjm.chalk.Chalk 2.6.Be | 141 | 7975 (5656.0%) | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 337 | 8781 (2605.6%) | 0 |
| sheldor.mini.FoilistMC 1.0 | 11504 | 1028 (8.9%) | 10798 |
| pez.rumble.Ali 0.4.9 | 2835 | 5632 (198.7%) | 1634 |
| catcat20.Lambda 0.017 | 8282 | 680 (8.2%) | 7304 |
| florent.XSeries.X2 0.17 | 7561 | 486 (6.4%) | 3235 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 548 | 650 | 1558 | 19.4 / 27.8 | 3 | 721 | 72 |
| jd.Nullstride 2.3.3 | 650 | 542 | 650 | 1495 | 20.3 / 26.5 | 0 | 706 | 32 |
| jk.mega.DrussGT 3.1.16 | 650 | 512 | 650 | 2879 | 27.4 / 31.5 | 13 | 5160 | 426 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 447 | 450 | 521 | 43.2 / 24.1 | 385 | 2155 | 448 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 484 | 650 | 2440 | 23.7 / 33.0 | 12 | 1013 | 0 |
| voidious.Diamond 1.8.22 | 650 | 532 | 650 | 2625 | 24.5 / 36.4 | 101 | 5972 | 245 |
| cb.fire.Firestarter 2.0f | 650 | 549 | 650 | 3058 | 33.1 / 26.9 | 225 | 2795 | 49 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 453 | 638 | 1147 | 26.4 / 34.5 | 183 | 8892 | 1292 |
| xander.cat.XanderCat 12.9 | 650 | 443 | 650 | 1425 | 35.2 / 34.2 | 584 | 625 | 49 |
| lxx.Tomcat 3.68 | 650 | 514 | 650 | 1957 | 27.1 / 35.9 | 216 | 13914 | 7 |
| rsalesc.mega.Knight 0.6.28 | 650 | 509 | 650 | 2772 | 31.8 / 31.2 | 339 | 4997 | 1 |
| aw.Gilgalad 1.99.5c | 650 | 432 | 650 | 1070 | 34.5 / 37.7 | 306 | 1050 | 0 |
| pc.Wavelet 1.5 | 650 | 433 | 650 | 1529 | 39.2 / 29.3 | 345 | 1514 | 2 |
| gh.GresSuffurd 0.4.13 | 650 | 461 | 650 | 942 | 33.7 / 29.9 | 296 | 5596 | 83 |
| kc.serpent.WaveSerpent 2.11 | 650 | 478 | 650 | 867 | 27.6 / 32.8 | 145 | 5337 | 3 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 469 | 619 | 1037 | 37.0 / 27.2 | 209 | 5067 | 107 |
| cs.Nene 1.0.5 | 650 | 471 | 650 | 769 | 25.6 / 34.8 | 112 | 4719 | 1128 |
| jk.melee.Neuromancer 7.12 | 650 | 532 | 650 | 1722 | 36.8 / 34.4 | 215 | 6189 | 9 |
| voidious.Dookious 1.573c | 650 | 484 | 588 | 847 | 25.5 / 30.5 | 130 | 4123 | 2459 |
| davidalves.Phoenix 1.02 | 650 | 400 | 650 | 1095 | 0.0 / 0.7 | 0 | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 650 | 501 | 650 | 2271 | 45.1 / 24.1 | 640 | 3188 | 15 |
| cb.Domogled 1.2 | 650 | 550 | 650 | 2370 | 49.1 / 19.5 | 236 | 635 | 128 |
| mue.Ascendant 1.2.27 | 650 | 420 | 650 | 617 | 38.3 / 30.8 | 215 | 1833 | 21 |
| abc.Shadow 3.83c | 650 | 458 | 650 | 809 | 27.6 / 37.4 | 130 | 5565 | 66 |
| darkcanuck.Pris 0.92 | 650 | 409 | 650 | 675 | 35.9 / 33.8 | 262 | 1768 | 688 |
| fromHell.BlackBox 0.0.2 | 650 | 425 | 488 | 687 | 43.3 / 27.1 | 1042 | 1734 | 4 |
| jk.precise.Wintermute 0.8 | 650 | 456 | 650 | 725 | 38.4 / 31.5 | 317 | 1875 | 104 |
| kc.serpent.Hydra 0.21 | 650 | 348 | 650 | 1232 | 0.0 / 0.1 | 0 | 0 | 0 |
| davidalves.Firebird 0.25 | 650 | 397 | 650 | 1155 | 0.0 / 1.0 | 0 | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 650 | 485 | 650 | 774 | 29.3 / 32.9 | 52 | 3927 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 650 | 449 | 650 | 729 | 32.4 / 34.0 | 76 | 2011 | 28 |
| ags.Midboss 1q.fast | 650 | 409 | 650 | 755 | 41.0 / 30.9 | 572 | 2525 | 389 |
| pez.rumble.CassiusClay 2rho.02no | 650 | 478 | 650 | 1458 | 39.9 / 28.7 | 653 | 1376 | 96 |
| Krabb.sliNk.Garm 0.9u | 650 | 527 | 588 | 778 | 29.8 / 26.8 | 160 | 3621 | 2428 |
| axeBots.SilverSurfer 2.53.33fix | 650 | 490 | 650 | 775 | 40.2 / 29.4 | 276 | 865 | 16 |
| mn.Combat 3.25.0 | 650 | 487 | 650 | 1479 | 26.0 / 33.3 | 261 | 14506 | 3 |
| cs.s2.Seraphim 2.3.1 | 650 | 482 | 650 | 717 | 31.4 / 32.2 | 221 | 2314 | 681 |
| fromHell.CHCl3 1.4.2 | 650 | 431 | 488 | 687 | 41.5 / 27.3 | 609 | 2083 | 1 |
| jk.mini.CunobelinDC 1.2 | 650 | 532 | 650 | 1256 | 0.1 / 1.1 | 0 | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 650 | 573 | 650 | 1106 | 35.3 / 32.5 | 508 | 1138 | 4 |
| florent.test.Toad 0.14t | 650 | 496 | 650 | 732 | 34.0 / 31.3 | 180 | 2791 | 34 |
| ar.horizon.Horizon 1.2.2 | 650 | 476 | 650 | 913 | 32.7 / 32.2 | 153 | 3482 | 1 |
| cjm.chalk.Chalk 2.6.Be | 650 | 405 | 650 | 1220 | 0.0 / 0.0 | 0 | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 650 | 361 | 650 | 902 | 0.0 / 1.2 | 0 | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 650 | 589 | 650 | 1055 | 39.5 / 24.6 | 330 | 1779 | 1394 |
| pez.rumble.Ali 0.4.9 | 650 | 399 | 588 | 1099 | 10.1 / 12.2 | 124 | 1191 | 0 |
| catcat20.Lambda 0.017 | 650 | 527 | 588 | 779 | 39.7 / 27.9 | 427 | 2133 | 0 |
| florent.XSeries.X2 0.17 | 650 | 490 | 631 | 721 | 35.8 / 33.1 | 156 | 1281 | 52 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 8.9% | 225 | 722 | 3 | 126.9 | 1860 / 1866 (100%) | 0 | 0 |
| jd.Nullstride 2.3.3 | 8.6% | 213 | 82 | 3 | 117.9 | 1710 / 1718 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.5% | 332 | 1266 | 3 | 242.6 | 4263 / 4270 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.3% | 75 | 48 | 3 | 32.3 | 379 / 381 (99%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.9% | 296 | 95 | 3 | 205.9 | 3604 / 3610 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 9.8% | 293 | 497 | 3 | 219.9 | 3251 / 3259 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 9.7% | 265 | 378 | 3 | 231.1 | 3284 / 3297 (100%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 9.3% | 171 | 1031 | 3 | 85.7 | 1268 / 1277 (99%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 9.0% | 223 | 167 | 3 | 89.9 | 1400 / 1401 (100%) | 0 | 0 |
| lxx.Tomcat 3.68 | 10.3% | 304 | 72 | 3 | 162.6 | 2507 / 2514 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 10.6% | 313 | 500 | 3 | 232.1 | 3710 / 3715 (100%) | 0 | 0 |
| aw.Gilgalad 1.99.5c | 11.3% | 208 | 297 | 3 | 82.2 | 1066 / 1071 (100%) | 0 | 0 |
| pc.Wavelet 1.5 | 10.0% | 199 | 2199 | 3 | 105.1 | 1496 / 1500 (100%) | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 8.4% | 159 | 164 | 3 | 67.9 | 969 / 973 (100%) | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 8.2% | 82 | 111 | 3 | 51.7 | 636 / 637 (100%) | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 8.1% | 164 | 47 | 3 | 69.6 | 955 / 957 (100%) | 0 | 0 |
| cs.Nene 1.0.5 | 7.7% | 107 | 790 | 3 | 53.7 | 729 / 735 (99%) | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 10.5% | 284 | 390 | 3 | 134.8 | 1938 / 1944 (100%) | 0 | 0 |
| voidious.Dookious 1.573c | 7.1% | 109 | 47 | 3 | 52.6 | 681 / 681 (100%) | 0 | 0 |
| davidalves.Phoenix 1.02 | 0.1% | 48 | 10 | 2 | 0.0 | 0 / 5789 (0%) | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 9.3% | 276 | 475 | 3 | 168.7 | 2445 / 2450 (100%) | 0 | 0 |
| cb.Domogled 1.2 | 7.9% | 274 | 466 | 3 | 156.1 | 2216 / 2221 (100%) | 0 | 0 |
| mue.Ascendant 1.2.27 | 7.5% | 90 | 611 | 3 | 40.6 | 502 / 502 (100%) | 0 | 0 |
| abc.Shadow 3.83c | 8.5% | 144 | 244 | 3 | 55.8 | 672 / 674 (100%) | 0 | 0 |
| darkcanuck.Pris 0.92 | 8.4% | 80 | 271 | 3 | 43.6 | 545 / 546 (100%) | 0 | 0 |
| fromHell.BlackBox 0.0.2 | 8.1% | 113 | 122 | 3 | 49.5 | 668 / 669 (100%) | 0 | 0 |
| jk.precise.Wintermute 0.8 | 8.3% | 118 | 657 | 3 | 50.8 | 706 / 707 (100%) | 0 | 0 |
| kc.serpent.Hydra 0.21 | 0.0% | 44 | 8 | 3 | 0.0 | 0 / 9041 (0%) | 0 | 0 |
| davidalves.Firebird 0.25 | 0.2% | 46 | 12 | 2 | 0.0 | 0 / 6983 (0%) | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 7.5% | 120 | 724 | 3 | 51.9 | 733 / 735 (100%) | 0 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 7.7% | 152 | 49 | 3 | 45.5 | 516 / 520 (99%) | 0 | 0 |
| ags.Midboss 1q.fast | 9.1% | 192 | 59 | 3 | 54.1 | 704 / 708 (99%) | 0 | 0 |
| pez.rumble.CassiusClay 2rho.02no | 8.4% | 261 | 1942 | 3 | 105.8 | 1454 / 1460 (100%) | 0 | 0 |
| Krabb.sliNk.Garm 0.9u | 6.6% | 115 | 700 | 3 | 53.3 | 674 / 678 (99%) | 0 | 0 |
| axeBots.SilverSurfer 2.53.33fix | 7.6% | 161 | 104 | 3 | 39.0 | 450 / 451 (100%) | 0 | 0 |
| mn.Combat 3.25.0 | 9.5% | 233 | 511 | 3 | 116.3 | 1626 / 1630 (100%) | 0 | 0 |
| cs.s2.Seraphim 2.3.1 | 7.3% | 129 | 797 | 3 | 47.5 | 590 / 591 (100%) | 0 | 0 |
| fromHell.CHCl3 1.4.2 | 7.1% | 97 | 53 | 3 | 41.9 | 573 / 573 (100%) | 0 | 0 |
| jk.mini.CunobelinDC 1.2 | 1.1% | 70 | 9 | 3 | 0.0 | 0 / 13420 (0%) | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 8.8% | 233 | 245 | 3 | 84.8 | 1050 / 1053 (100%) | 0 | 0 |
| florent.test.Toad 0.14t | 7.7% | 123 | 7869 | 3 | 46.4 | 607 / 607 (100%) | 0 | 0 |
| ar.horizon.Horizon 1.2.2 | 8.1% | 176 | 323 | 3 | 64.2 | 886 / 891 (99%) | 0 | 0 |
| cjm.chalk.Chalk 2.6.Be | 0.0% | 46 | 7 | 3 | 0.0 | 0 / 7975 (0%) | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 1.8% | 45 | 7 | 3 | 0.0 | 0 / 8781 (0%) | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 7.1% | 164 | 735 | 3 | 83.0 | 1023 / 1028 (100%) | 0 | 0 |
| pez.rumble.Ali 0.4.9 | 2.6% | 62 | 27 | 3 | 15.0 | 166 / 5632 (3%) | 0 | 0 |
| catcat20.Lambda 0.017 | 7.4% | 159 | 246 | 3 | 54.7 | 675 / 680 (99%) | 0 | 0 |
| florent.XSeries.X2 0.17 | 8.1% | 117 | 828 | 3 | 45.4 | 485 / 486 (100%) | 0 | 0 |

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
| kc.mega.BeepBoop 2.0 | kc.mega.BeepBoop | 1 | 35 | 296 | 10.2% | 8.8% ± 1.1 | 6.9% | 21.6% / 20.2% | 0.2% | 0 / 0 | T3/M1 | 30% |
| jd.Nullstride 2.3.3 | jd.Nullstride | 1 | 35 | 288 | 9.3% | 8.2% ± 0.9 | 6.4% | 22.0% / 20.9% | 0.1% | 0 / 0 | T3/M1 | 32% |
| jk.mega.DrussGT 3.1.16 | jk.mega.DrussGT | 1 | 35 | 298 | 10.6% | 8.7% ± 1.2 | 8.2% | 22.9% / 20.4% | 1.6% | 0 / 0 | T3/M1 | 48% |
| oog.mega.saguaro.Saguaro 1.0 | oog.mega.saguaro.Saguaro | 1 | 35 | 328 | 8.0% | 7.3% ± 1.5 | 12.2% | 26.2% / 27.9% | 9.3% | 0 / 0 | T3/M0 | 77% |
| aaa.r.ScalarR 0.005h.053-noshield | aaa.r.ScalarR | 1 | 35 | 316 | 11.5% | 8.8% ± 0.9 | 7.6% | 23.3% / 20.5% | 0.0% | 0 / 0 | T3/M1 | 37% |
| voidious.Diamond 1.8.22 | voidious.Diamond | 1 | 35 | 302 | 10.3% | 8.7% ± 1.0 | 8.2% | 21.6% / 20.5% | 9.5% | 0 / 0 | T3/M1 | 49% |
| cb.fire.Firestarter 2.0f | cb.fire.Firestarter | 1 | 35 | 310 | 10.5% | 8.5% ± 0.9 | 9.7% | 21.3% / 21.2% | 3.4% | 0 / 0 | T3/M1 | 55% |
| dsekercioglu.mega.Raven 3.56j8 | dsekercioglu.mega.Raven | 1 | 35 | 330 | 10.2% | 7.6% ± 0.9 | 10.1% | 20.6% / 20.7% | 12.4% | 0 / 0 | T3/M1 | 67% |
| xander.cat.XanderCat 12.9 | xander.cat.XanderCat | 1 | 35 | 314 | 10.9% | 7.9% ± 0.9 | 12.3% | 22.6% / 22.1% | 9.0% | 0 / 0 | T3/M1 | 57% |
| lxx.Tomcat 3.68 | lxx.Tomcat | 1 | 35 | 274 | 11.0% | 9.2% ± 1.2 | 11.0% | 23.5% / 21.7% | 9.5% | 0 / 0 | T3/M1 | 52% |
| rsalesc.mega.Knight 0.6.28 | rsalesc.mega.Knight | 1 | 35 | 314 | 10.2% | 8.2% ± 1.2 | 10.6% | 22.8% / 21.3% | 13.1% | 0 / 0 | T3/M1 | 57% |
| aw.Gilgalad 1.99.5c | aw.Gilgalad | 1 | 35 | 284 | 12.1% | 8.8% ± 1.1 | 12.8% | 24.0% / 23.4% | 6.3% | 0 / 0 | T3/M1 | 55% |
| pc.Wavelet 1.5 | pc.Wavelet | 1 | 35 | 272 | 12.4% | 8.6% ± 0.9 | 12.3% | 20.8% / 20.9% | 10.4% | 0 / 0 | T3/M1 | 49% |
| gh.GresSuffurd 0.4.13 | gh.GresSuffurd | 1 | 35 | 294 | 10.1% | 7.9% ± 1.1 | 10.6% | 22.0% / 22.1% | 13.2% | 0 / 0 | T3/M1 | 63% |
| kc.serpent.WaveSerpent 2.11 | kc.serpent.WaveSerpent | 1 | 35 | 322 | 9.2% | 8.3% ± 1.3 | 10.4% | 22.5% / 22.6% | 13.5% | 0 / 0 | T3/M1 | 60% |
| dsekercioglu.mega.WhiteFang 2.8.1 | dsekercioglu.mega.WhiteFang | 1 | 35 | 344 | 8.5% | 6.8% ± 1.0 | 11.0% | 22.3% / 22.2% | 14.3% | 0 / 0 | T2/M1 | 77% |
| cs.Nene 1.0.5 | cs.Nene | 1 | 35 | 264 | 8.4% | 7.6% ± 1.3 | 10.5% | 25.0% / 22.9% | 9.0% | 0 / 0 | T3/M0 | 63% |
| jk.melee.Neuromancer 7.12 | jk.melee.Neuromancer | 1 | 35 | 314 | 10.6% | 9.4% ± 1.2 | 11.2% | 24.2% / 23.3% | 0.0% | 0 / 0 | T3/M1 | 43% |
| voidious.Dookious 1.573c | voidious.Dookious | 1 | 35 | 306 | 7.2% | 7.3% ± 1.2 | 9.6% | 21.7% / 21.3% | 12.0% | 0 / 0 | T3/M1 | 66% |
| davidalves.Phoenix 1.02 | davidalves.Phoenix | 1 | 35 | 306 | 0.1% | 55.0% ± 34.6 | 0.0% | - / - | 3.3% | 0 / 0 | T?/M? | 99% |
| rsalesc.roborio.Roborio 1.2.4 | rsalesc.roborio.Roborio | 1 | 35 | 328 | 10.0% | 8.2% ± 1.2 | 10.9% | 22.6% / 21.0% | 14.3% | 0 / 0 | T3/M1 | 62% |
| cb.Domogled 1.2 | cb.Domogled | 1 | 35 | 276 | 8.0% | 7.1% ± 1.0 | 11.5% | 23.2% / 22.8% | 2.7% | 0 / 0 | T3/M1 | 73% |
| mue.Ascendant 1.2.27 | mue.Ascendant | 1 | 35 | 290 | 7.5% | 6.3% ± 1.3 | 11.0% | 20.4% / 21.4% | 4.9% | 0 / 0 | T2/M1 | 71% |
| abc.Shadow 3.83c | abc.Shadow | 1 | 35 | 276 | 10.1% | 8.9% ± 1.3 | 10.2% | 19.9% / 19.5% | 9.9% | 0 / 0 | T3/M1 | 55% |
| darkcanuck.Pris 0.92 | darkcanuck.Pris | 1 | 35 | 294 | 9.5% | 7.2% ± 1.4 | 11.2% | 24.6% / 21.2% | 9.1% | 0 / 0 | T3/M1 | 56% |
| fromHell.BlackBox 0.0.2 | fromHell.BlackBox | 1 | 35 | 304 | 8.9% | 7.1% ± 1.3 | 12.9% | 26.8% / 26.0% | 3.2% | 0 / 0 | T3/M0 | 76% |
| jk.precise.Wintermute 0.8 | jk.precise.Wintermute | 1 | 35 | 316 | 9.0% | 7.3% ± 1.3 | 11.8% | 22.4% / 23.4% | 10.2% | 0 / 0 | T3/M1 | 74% |
| kc.serpent.Hydra 0.21 | kc.serpent.Hydra | 1 | 35 | 298 | 0.0% | 0.0% ± 37.7 | 0.7% | - / - | 1.1% | 0 / 0 | T?/M? | 100% |
| davidalves.Firebird 0.25 | davidalves.Firebird | 1 | 35 | 310 | 0.1% | 52.2% ± 43.8 | 0.2% | 19.7% / 18.6% | 3.2% | 0 / 0 | T?/M? | 100% |
| pulsar.PulsarMax 0.8.9 | pulsar.PulsarMax | 1 | 35 | 300 | 8.1% | 7.9% ± 1.3 | 10.3% | 22.3% / 21.9% | 3.5% | 0 / 0 | T3/M1 | 59% |
| zyx.mega.YersiniaPestis 3.0 | zyx.mega.YersiniaPestis | 1 | 35 | 324 | 8.9% | 7.2% ± 1.3 | 10.5% | 23.1% / 22.2% | 9.7% | 0 / 0 | T3/M1 | 54% |
| ags.Midboss 1q.fast | ags.Midboss | 1 | 35 | 284 | 9.1% | 6.7% ± 1.2 | 12.9% | 23.4% / 23.2% | 9.7% | 0 / 0 | T2/M1 | 66% |
| pez.rumble.CassiusClay 2rho.02no | pez.rumble.CassiusClay | 1 | 35 | 332 | 10.8% | 8.1% ± 0.9 | 12.1% | 20.8% / 20.7% | 10.0% | 0 / 0 | T3/M1 | 56% |
| Krabb.sliNk.Garm 0.9u | Krabb.sliNk.Garm | 1 | 35 | 298 | 7.0% | 7.0% ± 1.2 | 10.7% | 26.3% / 25.6% | 5.7% | 0 / 0 | T2/M0 | 71% |
| axeBots.SilverSurfer 2.53.33fix | axeBots.SilverSurfer | 1 | 35 | 326 | 8.3% | 8.4% ± 1.6 | 11.9% | 26.9% / 27.2% | 14.4% | 0 / 0 | T3/M0 | 69% |
| mn.Combat 3.25.0 | mn.Combat | 1 | 35 | 274 | 10.0% | 7.9% ± 0.9 | 10.2% | 22.1% / 21.8% | 12.8% | 0 / 0 | T3/M1 | 61% |
| cs.s2.Seraphim 2.3.1 | cs.s2.Seraphim | 1 | 35 | 292 | 8.2% | 7.9% ± 1.4 | 10.7% | 25.1% / 24.0% | 17.0% | 0 / 0 | T3/M0 | 62% |
| fromHell.CHCl3 1.4.2 | fromHell.CHCl3 | 1 | 35 | 292 | 8.6% | 7.2% ± 1.4 | 12.8% | 24.5% / 24.4% | 3.3% | 0 / 0 | T3/M1 | 71% |
| jk.mini.CunobelinDC 1.2 | jk.mini.CunobelinDC | 1 | 35 | 308 | 1.2% | 87.5% ± 27.7 | 24.3% | 19.4% / 20.9% | 3.3% | 0 / 0 | T?/M? | 95% |
| sheldor.mini.Foilist 1.3.1 | sheldor.mini.Foilist | 1 | 35 | 316 | 9.4% | 9.0% ± 1.1 | 11.2% | 25.2% / 23.9% | 8.4% | 0 / 0 | T3/M0 | 65% |
| florent.test.Toad 0.14t | florent.test.Toad | 1 | 35 | 304 | 8.6% | 8.1% ± 1.4 | 10.7% | 21.4% / 21.8% | 3.3% | 0 / 0 | T3/M1 | 69% |
| ar.horizon.Horizon 1.2.2 | ar.horizon.Horizon | 1 | 35 | 308 | 8.8% | 7.6% ± 1.2 | 10.8% | 23.0% / 22.5% | 8.9% | 0 / 0 | T3/M1 | 68% |
| cjm.chalk.Chalk 2.6.Be | cjm.chalk.Chalk | 1 | 35 | 298 | 0.0% | - | 0.0% | - / - | 1.9% | 0 / 0 | T?/M? | 100% |
| wcsv.PowerHouse.PowerHouse 1.7e3 | wcsv.PowerHouse.PowerHouse | 1 | 35 | 340 | 1.5% | 32.2% ± 30.3 | 10.7% | 36.8% / 23.1% | 6.8% | 0 / 0 | T?/M? | 99% |
| sheldor.mini.FoilistMC 1.0 | sheldor.mini.FoilistMC | 1 | 35 | 320 | 7.5% | 7.4% ± 1.0 | 11.0% | 24.3% / 23.6% | 4.2% | 0 / 0 | T3/M1 | 81% |
| pez.rumble.Ali 0.4.9 | pez.rumble.Ali | 1 | 35 | 292 | 2.6% | 8.3% ± 2.5 | 9.4% | 19.2% / 20.4% | 4.4% | 0 / 0 | T3/M? | 82% |
| catcat20.Lambda 0.017 | catcat20.Lambda | 1 | 35 | 296 | 7.6% | 7.8% ± 1.3 | 12.6% | 25.7% / 25.3% | 1.2% | 0 / 0 | T3/M0 | 76% |
| florent.XSeries.X2 0.17 | florent.XSeries.X2 | 1 | 35 | 306 | 7.8% | 6.8% ± 1.3 | 11.1% | 20.4% / 20.3% | 6.1% | 0 / 0 | T2/M1 | 69% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.14hjswthfgnk vs hadur2.Hadur 3.14hjsw

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 27.7% ± 5.8 | 24.4% ± 7.2 | +3.3 ± 13.0 |
| jd.Nullstride 2.3.3 | 27.4% ± 9.3 | 21.9% ± 5.4 | +5.5 ± 7.0 |
| jk.mega.DrussGT 3.1.16 | 45.6% ± 8.5 | 44.0% ± 3.1 | +1.6 ± 6.0 |
| oog.mega.saguaro.Saguaro 1.0 | 75.8% ± 3.4 | 72.3% ± 7.2 | +3.5 ± 8.5 |
| aaa.r.ScalarR 0.005h.053-noshield | 32.7% ± 5.3 | 30.2% ± 7.9 | +2.5 ± 12.7 |
| voidious.Diamond 1.8.22 | 46.8% ± 3.4 | 49.0% ± 2.6 | -2.2 ± 5.1 |
| cb.fire.Firestarter 2.0f | 54.1% ± 9.9 | 50.3% ± 5.3 | +3.8 ± 13.2 |
| dsekercioglu.mega.Raven 3.56j8 | 59.7% ± 8.8 | 51.5% ± 14.3 | +8.2 ± 19.0 |
| xander.cat.XanderCat 12.9 | 58.0% ± 7.0 | 60.1% ± 8.2 | -2.2 ± 13.2 |
| lxx.Tomcat 3.68 | 55.0% ± 4.5 | 51.4% ± 4.9 | +3.6 ± 7.4 |
| rsalesc.mega.Knight 0.6.28 | 51.8% ± 7.3 | 53.5% ± 3.4 | -1.7 ± 9.4 |
| aw.Gilgalad 1.99.5c | 50.4% ± 7.7 | 48.4% ± 9.9 | +2.0 ± 14.6 |
| pc.Wavelet 1.5 | 51.6% ± 6.4 | 53.1% ± 7.7 | -1.5 ± 10.4 |
| gh.GresSuffurd 0.4.13 | 67.4% ± 5.6 | 56.3% ± 6.4 | +11.1 ± 6.5 |
| kc.serpent.WaveSerpent 2.11 | 59.0% ± 5.7 | 50.8% ± 5.2 | +8.2 ± 8.5 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 72.5% ± 6.8 | 70.9% ± 13.4 | +1.6 ± 8.9 |
| cs.Nene 1.0.5 | 61.2% ± 3.5 | 58.0% ± 7.3 | +3.1 ± 9.9 |
| jk.melee.Neuromancer 7.12 | 52.8% ± 14.9 | 54.2% ± 5.6 | -1.4 ± 10.5 |
| voidious.Dookious 1.573c | 64.9% ± 8.4 | 57.9% ± 9.7 | +7.0 ± 12.0 |
| davidalves.Phoenix 1.02 | 98.9% ± 0.4 | 99.2% ± 0.4 | -0.3 ± 0.5 |
| rsalesc.roborio.Roborio 1.2.4 | 61.4% ± 5.1 | 58.4% ± 7.2 | +3.0 ± 11.4 |
| cb.Domogled 1.2 | 68.8% ± 6.5 | 60.7% ± 8.1 | +8.1 ± 7.4 |
| mue.Ascendant 1.2.27 | 67.4% ± 11.8 | 61.6% ± 5.7 | +5.8 ± 6.9 |
| abc.Shadow 3.83c | 54.1% ± 14.3 | 50.3% ± 6.0 | +3.8 ± 18.5 |
| darkcanuck.Pris 0.92 | 63.5% ± 10.0 | 63.4% ± 13.8 | +0.1 ± 20.9 |
| fromHell.BlackBox 0.0.2 | 71.8% ± 6.3 | 71.6% ± 14.1 | +0.1 ± 8.6 |
| jk.precise.Wintermute 0.8 | 69.6% ± 7.7 | 61.3% ± 6.7 | +8.3 ± 8.5 |
| kc.serpent.Hydra 0.21 | 99.8% ± 0.7 | 100.0% ± 0.0 | -0.2 ± 0.7 |
| davidalves.Firebird 0.25 | 96.8% ± 5.1 | 94.5% ± 8.6 | +2.3 ± 8.6 |
| pulsar.PulsarMax 0.8.9 | 66.3% ± 8.7 | 53.9% ± 7.7 | +12.3 ± 15.5 |
| zyx.mega.YersiniaPestis 3.0 | 62.2% ± 10.4 | 56.9% ± 6.2 | +5.3 ± 13.6 |
| ags.Midboss 1q.fast | 66.5% ± 3.9 | 72.0% ± 5.1 | -5.6 ± 6.6 |
| pez.rumble.CassiusClay 2rho.02no | 58.3% ± 5.6 | 60.0% ± 4.2 | -1.6 ± 8.8 |
| Krabb.sliNk.Garm 0.9u | 67.8% ± 12.2 | 65.9% ± 6.8 | +1.9 ± 14.2 |
| axeBots.SilverSurfer 2.53.33fix | 70.6% ± 7.6 | 73.2% ± 3.3 | -2.5 ± 10.4 |
| mn.Combat 3.25.0 | 57.9% ± 5.6 | 54.3% ± 7.1 | +3.6 ± 4.0 |
| cs.s2.Seraphim 2.3.1 | 64.8% ± 10.8 | 65.2% ± 9.1 | -0.5 ± 13.6 |
| fromHell.CHCl3 1.4.2 | 72.8% ± 6.1 | 68.3% ± 14.6 | +4.5 ± 17.4 |
| jk.mini.CunobelinDC 1.2 | 97.4% ± 2.9 | 97.5% ± 3.0 | -0.1 ± 4.5 |
| sheldor.mini.Foilist 1.3.1 | 62.8% ± 3.8 | 65.7% ± 4.4 | -3.0 ± 6.7 |
| florent.test.Toad 0.14t | 65.9% ± 16.1 | 59.1% ± 4.8 | +6.8 ± 20.1 |
| ar.horizon.Horizon 1.2.2 | 62.3% ± 13.4 | 57.0% ± 5.2 | +5.3 ± 13.1 |
| cjm.chalk.Chalk 2.6.Be | 100.0% ± 0.0 | 98.2% ± 5.8 | +1.8 ± 5.8 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 97.2% ± 4.5 | 98.4% ± 1.3 | -1.2 ± 5.8 |
| sheldor.mini.FoilistMC 1.0 | 74.6% ± 12.5 | 74.3% ± 11.0 | +0.4 ± 20.0 |
| pez.rumble.Ali 0.4.9 | 80.3% ± 9.1 | 72.2% ± 15.1 | +8.1 ± 20.0 |
| catcat20.Lambda 0.017 | 72.5% ± 5.8 | 66.5% ± 4.3 | +6.0 ± 6.6 |
| florent.XSeries.X2 0.17 | 65.2% ± 13.2 | 64.9% ± 8.9 | +0.3 ± 11.9 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | +3.3 ± 13.0 | +5.7 ± 20.7 | +5.7 ± 20.7 | -0.4 ± 7.8 |
| jd.Nullstride 2.3.3 | +5.5 ± 7.0 | +7.1 ± 13.1 | +7.1 ± 13.1 | +3.2 ± 4.5 |
| jk.mega.DrussGT 3.1.16 | +1.6 ± 6.0 | +2.4 ± 14.1 | +2.9 ± 13.4 | +0.5 ± 4.4 |
| oog.mega.saguaro.Saguaro 1.0 | +3.5 ± 8.5 | +2.9 ± 11.7 | +2.9 ± 11.7 | +3.4 ± 6.7 |
| aaa.r.ScalarR 0.005h.053-noshield | +2.5 ± 12.7 | +2.9 ± 22.6 | +2.9 ± 22.6 | +1.7 ± 7.5 |
| voidious.Diamond 1.8.22 | -2.2 ± 5.1 | -3.6 ± 9.4 | -3.6 ± 9.4 | +0.6 ± 0.9 |
| cb.fire.Firestarter 2.0f | +3.8 ± 13.2 | +3.6 ± 19.1 | +3.6 ± 19.1 | +3.8 ± 6.5 |
| dsekercioglu.mega.Raven 3.56j8 | +8.2 ± 19.0 | +11.4 ± 29.9 | +11.4 ± 29.9 | +4.2 ± 8.7 |
| xander.cat.XanderCat 12.9 | -2.2 ± 13.2 | -0.4 ± 17.8 | +0.0 ± 18.6 | -2.3 ± 9.2 |
| lxx.Tomcat 3.68 | +3.6 ± 7.4 | +5.5 ± 11.8 | +5.0 ± 13.1 | +0.8 ± 4.1 |
| rsalesc.mega.Knight 0.6.28 | -1.7 ± 9.4 | -2.1 ± 15.0 | -2.1 ± 15.0 | -1.1 ± 4.6 |
| aw.Gilgalad 1.99.5c | +2.0 ± 14.6 | -1.4 ± 15.5 | -1.4 ± 15.5 | +5.3 ± 13.0 |
| pc.Wavelet 1.5 | -1.5 ± 10.4 | +3.6 ± 9.4 | +3.6 ± 9.4 | -6.0 ± 21.2 |
| gh.GresSuffurd 0.4.13 | +11.1 ± 6.5 | +15.7 ± 5.9 | +15.7 ± 5.9 | +6.1 ± 9.1 |
| kc.serpent.WaveSerpent 2.11 | +8.2 ± 8.5 | +10.0 ± 15.5 | +10.0 ± 15.5 | +6.5 ± 4.7 |
| dsekercioglu.mega.WhiteFang 2.8.1 | +1.6 ± 8.9 | +2.0 ± 12.9 | +2.1 ± 13.1 | +2.3 ± 7.8 |
| cs.Nene 1.0.5 | +3.1 ± 9.9 | +3.6 ± 12.0 | +3.6 ± 12.0 | +2.8 ± 5.6 |
| jk.melee.Neuromancer 7.12 | -1.4 ± 10.5 | -4.7 ± 17.9 | -5.0 ± 18.7 | +1.9 ± 8.6 |
| voidious.Dookious 1.573c | +7.0 ± 12.0 | +9.3 ± 18.3 | +9.3 ± 18.3 | +4.1 ± 7.0 |
| davidalves.Phoenix 1.02 | -0.3 ± 0.5 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 |
| rsalesc.roborio.Roborio 1.2.4 | +3.0 ± 11.4 | +2.9 ± 16.6 | +2.9 ± 16.6 | +2.7 ± 11.2 |
| cb.Domogled 1.2 | +8.1 ± 7.4 | +10.7 ± 11.4 | +10.7 ± 11.4 | +4.9 ± 10.1 |
| mue.Ascendant 1.2.27 | +5.8 ± 6.9 | +5.0 ± 9.4 | +5.0 ± 9.4 | +6.5 ± 5.8 |
| abc.Shadow 3.83c | +3.8 ± 18.5 | +2.1 ± 32.2 | +2.1 ± 32.2 | +4.9 ± 4.7 |
| darkcanuck.Pris 0.92 | +0.1 ± 20.9 | -1.4 ± 26.4 | -1.4 ± 26.4 | +1.6 ± 15.6 |
| fromHell.BlackBox 0.0.2 | +0.1 ± 8.6 | -2.1 ± 11.4 | -2.1 ± 11.4 | +2.5 ± 7.9 |
| jk.precise.Wintermute 0.8 | +8.3 ± 8.5 | +7.1 ± 7.9 | +7.1 ± 7.9 | +10.1 ± 11.7 |
| kc.serpent.Hydra 0.21 | -0.2 ± 0.7 | +0.0 ± 0.0 | +0.0 ± 0.0 | -12.5 ± 39.8 |
| davidalves.Firebird 0.25 | +2.3 ± 8.6 | +0.7 ± 4.4 | +0.7 ± 4.4 | -12.5 ± 39.8 |
| pulsar.PulsarMax 0.8.9 | +12.3 ± 15.5 | +15.7 ± 24.8 | +15.7 ± 24.8 | +9.5 ± 3.9 |
| zyx.mega.YersiniaPestis 3.0 | +5.3 ± 13.6 | +5.0 ± 15.9 | +5.0 ± 15.9 | +6.3 ± 14.3 |
| ags.Midboss 1q.fast | -5.6 ± 6.6 | -8.6 ± 8.3 | -8.6 ± 8.3 | -2.7 ± 5.4 |
| pez.rumble.CassiusClay 2rho.02no | -1.6 ± 8.8 | -3.6 ± 15.5 | -3.6 ± 15.5 | +0.1 ± 5.9 |
| Krabb.sliNk.Garm 0.9u | +1.9 ± 14.2 | +0.0 ± 18.6 | +0.0 ± 18.6 | +3.8 ± 11.3 |
| axeBots.SilverSurfer 2.53.33fix | -2.5 ± 10.4 | -2.1 ± 8.6 | -2.1 ± 8.6 | -2.3 ± 11.2 |
| mn.Combat 3.25.0 | +3.6 ± 4.0 | +6.2 ± 5.9 | +6.4 ± 5.7 | +0.5 ± 3.2 |
| cs.s2.Seraphim 2.3.1 | -0.5 ± 13.6 | -1.4 ± 10.8 | -1.4 ± 10.8 | +0.6 ± 16.4 |
| fromHell.CHCl3 1.4.2 | +4.5 ± 17.4 | +4.2 ± 23.0 | +4.3 ± 22.7 | +5.6 ± 12.0 |
| jk.mini.CunobelinDC 1.2 | -0.1 ± 4.5 | +0.0 ± 3.7 | +0.0 ± 3.7 | +2.0 ± 8.6 |
| sheldor.mini.Foilist 1.3.1 | -3.0 ± 6.7 | -4.3 ± 4.5 | -4.3 ± 4.5 | -0.7 ± 11.1 |
| florent.test.Toad 0.14t | +6.8 ± 20.1 | +5.7 ± 26.0 | +5.7 ± 26.0 | +8.1 ± 12.2 |
| ar.horizon.Horizon 1.2.2 | +5.3 ± 13.1 | +4.3 ± 20.2 | +4.3 ± 20.2 | +6.6 ± 6.2 |
| cjm.chalk.Chalk 2.6.Be | +1.8 ± 5.8 | +0.7 ± 2.3 | +0.7 ± 2.3 | +12.5 ± 39.8 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | -1.2 ± 5.8 | -0.7 ± 2.3 | -0.7 ± 2.3 | -2.4 ± 8.2 |
| sheldor.mini.FoilistMC 1.0 | +0.4 ± 20.0 | -1.4 ± 26.4 | -1.4 ± 26.4 | +2.5 ± 13.0 |
| pez.rumble.Ali 0.4.9 | +8.1 ± 20.0 | +4.3 ± 13.6 | +4.3 ± 13.6 | +11.8 ± 4.3 |
| catcat20.Lambda 0.017 | +6.0 ± 6.6 | +3.0 ± 9.0 | +2.9 ± 9.1 | +9.5 ± 7.2 |
| florent.XSeries.X2 0.17 | +0.3 ± 11.9 | -1.4 ± 13.6 | -1.4 ± 13.6 | +2.8 ± 9.6 |
| All pairs | +2.7 ± 1.1 | +2.6 ± 1.4 | +2.6 ± 1.4 | +2.5 ± 1.3 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or, for a Hadur build, a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 3 | +3.3 ± 13.0 | +1.4 ± 22.1 |
| jd.Nullstride 2.3.3 | 4 | 1 | +5.5 ± 7.0 | +4.6 |
| jk.mega.DrussGT 3.1.16 | 4 | 0 | +1.6 ± 6.0 | n/a |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 3 | +3.5 ± 8.5 | +1.2 ± 8.5 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 0 | +2.5 ± 12.7 | n/a |
| voidious.Diamond 1.8.22 | 4 | 0 | -2.2 ± 5.1 | n/a |
| cb.fire.Firestarter 2.0f | 4 | 3 | +3.8 ± 13.2 | -0.1 ± 8.7 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 2 | +8.2 ± 19.0 | +6.7 ± 152.0 |
| xander.cat.XanderCat 12.9 | 4 | 1 | -2.2 ± 13.2 | -9.2 |
| lxx.Tomcat 3.68 | 4 | 0 | +3.6 ± 7.4 | n/a |
| rsalesc.mega.Knight 0.6.28 | 4 | 0 | -1.7 ± 9.4 | n/a |
| aw.Gilgalad 1.99.5c | 4 | 2 | +2.0 ± 14.6 | +3.3 ± 49.4 |
| pc.Wavelet 1.5 | 4 | 3 | -1.5 ± 10.4 | +0.3 ± 16.7 |
| gh.GresSuffurd 0.4.13 | 4 | 1 | +11.1 ± 6.5 | +13.4 |
| kc.serpent.WaveSerpent 2.11 | 4 | 0 | +8.2 ± 8.5 | n/a |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 3 | +1.6 ± 8.9 | +3.6 ± 11.6 |
| cs.Nene 1.0.5 | 4 | 4 | +3.1 ± 9.9 | +3.1 ± 9.9 |
| jk.melee.Neuromancer 7.12 | 4 | 0 | -1.4 ± 10.5 | n/a |
| voidious.Dookious 1.573c | 4 | 2 | +7.0 ± 12.0 | +5.1 ± 80.8 |
| davidalves.Phoenix 1.02 | 4 | 4 | -0.3 ± 0.5 | -0.3 ± 0.5 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 0 | +3.0 ± 11.4 | n/a |
| cb.Domogled 1.2 | 4 | 3 | +8.1 ± 7.4 | +6.3 ± 9.2 |
| mue.Ascendant 1.2.27 | 4 | 2 | +5.8 ± 6.9 | +7.3 ± 12.2 |
| abc.Shadow 3.83c | 4 | 2 | +3.8 ± 18.5 | +12.3 ± 23.8 |
| darkcanuck.Pris 0.92 | 4 | 1 | +0.1 ± 20.9 | -10.9 |
| fromHell.BlackBox 0.0.2 | 4 | 4 | +0.1 ± 8.6 | +0.1 ± 8.6 |
| jk.precise.Wintermute 0.8 | 4 | 1 | +8.3 ± 8.5 | +13.4 |
| kc.serpent.Hydra 0.21 | 4 | 4 | -0.2 ± 0.7 | -0.2 ± 0.7 |
| davidalves.Firebird 0.25 | 4 | 4 | +2.3 ± 8.6 | +2.3 ± 8.6 |
| pulsar.PulsarMax 0.8.9 | 4 | 1 | +12.3 ± 15.5 | +22.5 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 0 | +5.3 ± 13.6 | n/a |
| ags.Midboss 1q.fast | 4 | 2 | -5.6 ± 6.6 | -5.7 ± 46.6 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 3 | -1.6 ± 8.8 | +0.5 ± 10.3 |
| Krabb.sliNk.Garm 0.9u | 4 | 1 | +1.9 ± 14.2 | +14.5 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 3 | -2.5 ± 10.4 | -0.9 ± 17.4 |
| mn.Combat 3.25.0 | 4 | 4 | +3.6 ± 4.0 | +3.6 ± 4.0 |
| cs.s2.Seraphim 2.3.1 | 4 | 1 | -0.5 ± 13.6 | +2.1 |
| fromHell.CHCl3 1.4.2 | 4 | 3 | +4.5 ± 17.4 | +1.0 ± 25.4 |
| jk.mini.CunobelinDC 1.2 | 4 | 4 | -0.1 ± 4.5 | -0.1 ± 4.5 |
| sheldor.mini.Foilist 1.3.1 | 4 | 1 | -3.0 ± 6.7 | +2.8 |
| florent.test.Toad 0.14t | 4 | 4 | +6.8 ± 20.1 | +6.8 ± 20.1 |
| ar.horizon.Horizon 1.2.2 | 4 | 2 | +5.3 ± 13.1 | +12.0 ± 23.1 |
| cjm.chalk.Chalk 2.6.Be | 4 | 4 | +1.8 ± 5.8 | +1.8 ± 5.8 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 4 | -1.2 ± 5.8 | -1.2 ± 5.8 |
| sheldor.mini.FoilistMC 1.0 | 4 | 2 | +0.4 ± 20.0 | +2.5 ± 136.3 |
| pez.rumble.Ali 0.4.9 | 4 | 3 | +8.1 ± 20.0 | +4.8 ± 32.6 |
| catcat20.Lambda 0.017 | 4 | 4 | +6.0 ± 6.6 | +6.0 ± 6.6 |
| florent.XSeries.X2 0.17 | 4 | 4 | +0.3 ± 11.9 | +0.3 ± 11.9 |
| All pairs | 192 | 103 | +2.7 ± 1.1 | +2.8 ± 1.4 |

# Bench: hadur2.Hadur 3.14hjswthfgnk baseline (hadur2.Hadur 3.14hjsw) (cold)

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 7868 over 192 battles (41.0 per battle, most in one battle 87). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | rank1-band1 | 24.4% ± 7.2 | 12.1% ± 12.0 | 41.6% ± 1.4 | 17 / 140 | 5.3% ± 0.4 | 8.7% ± 0.2 | 226 | 0 | 1.91 / 418.3 |
| jd.Nullstride 2.3.3 | rank2-band1 | 21.9% ± 5.4 | 8.6% ± 6.4 | 40.1% ± 5.0 | 12 / 140 | 4.9% ± 0.5 | 9.4% ± 0.9 | 215 | 0 | 1.67 / 342.0 |
| jk.mega.DrussGT 3.1.16 | rank3-band1 | 44.0% ± 3.1 | 42.1% ± 5.7 | 46.0% ± 2.7 | 59 / 140 | 7.7% ± 1.0 | 10.3% ± 0.6 | 300 | 0 | 1.48 / 301.2 |
| oog.mega.saguaro.Saguaro 1.0 | rank4-band1 | 72.3% ± 7.2 | 84.3% ± 9.5 | 60.8% ± 5.3 | 118 / 140 | 18.3% ± 2.0 | 6.8% ± 0.5 | 52 | 0 | 2.07 / 116.9 |
| aaa.r.ScalarR 0.005h.053-noshield | rank5-band1 | 30.2% ± 7.9 | 22.1% ± 12.0 | 40.0% ± 3.3 | 31 / 140 | 6.9% ± 0.5 | 10.6% ± 1.0 | 291 | 0 | 1.71 / 66.2 |
| voidious.Diamond 1.8.22 | rank6-band1 | 49.0% ± 2.6 | 57.9% ± 4.4 | 39.6% ± 2.0 | 81 / 140 | 6.9% ± 0.4 | 9.3% ± 0.5 | 287 | 0 | 1.71 / 42.8 |
| cb.fire.Firestarter 2.0f | rank7-band1 | 50.3% ± 5.3 | 49.3% ± 6.8 | 51.2% ± 3.6 | 69 / 140 | 8.5% ± 0.6 | 9.8% ± 0.5 | 263 | 0 | 1.71 / 28.6 |
| dsekercioglu.mega.Raven 3.56j8 | rank8-band1 | 51.5% ± 14.3 | 64.3% ± 21.2 | 39.2% ± 7.4 | 90 / 140 | 9.2% ± 1.5 | 10.0% ± 0.6 | 200 | 0 | 1.17 / 17.1 |
| xander.cat.XanderCat 12.9 | rank9-band1 | 60.1% ± 8.2 | 66.4% ± 10.1 | 53.1% ± 6.5 | 93 / 140 | 11.9% ± 0.6 | 8.6% ± 0.9 | 171 | 0 | 1.22 / 19.2 |
| lxx.Tomcat 3.68 | rank10-band1 | 51.4% ± 4.9 | 61.7% ± 8.3 | 42.3% ± 3.3 | 87 / 140 | 9.6% ± 0.9 | 10.5% ± 0.5 | 263 | 0 | 1.90 / 220.0 |
| rsalesc.mega.Knight 0.6.28 | rank11-band2 | 53.5% ± 3.4 | 55.0% ± 4.4 | 51.5% ± 3.2 | 77 / 140 | 9.2% ± 0.8 | 10.3% ± 0.5 | 296 | 0 | 2.00 / 29.7 |
| aw.Gilgalad 1.99.5c | rank12-band2 | 48.4% ± 9.9 | 55.0% ± 10.1 | 42.5% ± 10.4 | 77 / 140 | 10.0% ± 2.4 | 11.0% ± 0.6 | 244 | 0 | 1.47 / 22.5 |
| pc.Wavelet 1.5 | rank13-band2 | 53.1% ± 7.7 | 42.1% ± 10.1 | 62.9% ± 14.5 | 59 / 140 | 11.7% ± 2.3 | 9.6% ± 1.8 | 204 | 0 | 1.99 / 264.0 |
| gh.GresSuffurd 0.4.13 | rank14-band2 | 56.3% ± 6.4 | 65.7% ± 9.8 | 46.9% ± 6.0 | 92 / 140 | 11.0% ± 0.6 | 8.6% ± 0.8 | 188 | 0 | 1.05 / 14.6 |
| kc.serpent.WaveSerpent 2.11 | rank15-band2 | 50.8% ± 5.2 | 62.1% ± 8.6 | 39.3% ± 2.7 | 87 / 140 | 8.8% ± 1.0 | 7.8% ± 0.7 | 64 | 0 | 2.06 / 58.8 |
| dsekercioglu.mega.WhiteFang 2.8.1 | rank16-band2 | 70.9% ± 13.4 | 85.0% ± 17.2 | 55.2% ± 10.3 | 119 / 140 | 11.0% ± 0.7 | 7.5% ± 1.1 | 138 | 0 | 1.16 / 17.2 |
| cs.Nene 1.0.5 | rank17-band2 | 58.0% ± 7.3 | 75.7% ± 8.7 | 39.5% ± 5.1 | 106 / 140 | 9.6% ± 0.9 | 8.0% ± 1.1 | 109 | 0 | 1.30 / 13.8 |
| jk.melee.Neuromancer 7.12 | rank18-band2 | 54.2% ± 5.6 | 59.0% ± 8.1 | 49.5% ± 3.8 | 83 / 140 | 10.4% ± 1.3 | 10.7% ± 0.7 | 285 | 0 | 1.71 / 24.7 |
| voidious.Dookious 1.573c | rank19-band2 | 57.9% ± 9.7 | 72.9% ± 13.1 | 41.4% ± 4.1 | 102 / 140 | 9.4% ± 1.0 | 7.6% ± 1.5 | 111 | 0 | 1.22 / 24.6 |
| davidalves.Phoenix 1.02 | rank21-band2 | 99.2% ± 0.4 | 100.0% ± 0.0 | 0.0% ± 0.0 | 140 / 140 | 0.0% ± 0.0 | 0.1% ± 0.0 | 45 | 0 | 0.53 / 19.0 |
| rsalesc.roborio.Roborio 1.2.4 | rank22-band2 | 58.4% ± 7.2 | 52.9% ± 10.8 | 62.5% ± 4.8 | 74 / 140 | 12.1% ± 0.5 | 9.9% ± 0.7 | 287 | 0 | 1.55 / 23.9 |
| cb.Domogled 1.2 | rank23-band2 | 60.7% ± 8.1 | 53.6% ± 15.0 | 66.6% ± 5.8 | 75 / 140 | 10.9% ± 0.9 | 8.0% ± 0.5 | 240 | 0 | 0.98 / 173.1 |
| mue.Ascendant 1.2.27 | rank24-band2 | 61.6% ± 5.7 | 75.0% ± 9.4 | 49.1% ± 3.6 | 105 / 140 | 11.2% ± 0.3 | 8.1% ± 0.9 | 114 | 0 | 0.99 / 236.3 |
| abc.Shadow 3.83c | rank25-band2 | 50.3% ± 6.0 | 64.3% ± 12.0 | 37.6% ± 1.1 | 90 / 140 | 9.6% ± 0.6 | 9.5% ± 0.5 | 130 | 0 | 1.14 / 17.3 |
| darkcanuck.Pris 0.92 | rank26-band2 | 63.4% ± 13.8 | 77.9% ± 18.3 | 50.0% ± 9.4 | 109 / 140 | 11.9% ± 1.4 | 8.0% ± 0.5 | 74 | 0 | 1.83 / 13.7 |
| fromHell.BlackBox 0.0.2 | rank27-band2 | 71.6% ± 14.1 | 84.3% ± 19.8 | 59.0% ± 8.6 | 118 / 140 | 13.6% ± 2.4 | 7.8% ± 1.5 | 117 | 0 | 1.02 / 13.5 |
| jk.precise.Wintermute 0.8 | rank28-band2 | 61.3% ± 6.7 | 77.9% ± 9.4 | 44.9% ± 6.9 | 109 / 140 | 10.5% ± 1.0 | 8.6% ± 0.9 | 143 | 0 | 1.26 / 166.6 |
| kc.serpent.Hydra 0.21 | rank29-band2 | 100.0% ± 0.0 | 100.0% ± 0.0 | 50.0% ± 0.0 | 140 / 140 | 0.0% ± 0.0 | 0.0% ± 0.0 | 44 | 0 | 0.77 / 68.9 |
| davidalves.Firebird 0.25 | rank30-band2 | 94.5% ± 8.6 | 97.9% ± 4.4 | 12.5% ± 39.8 | 137 / 140 | 0.0% ± 0.0 | 0.3% ± 0.4 | 50 | 0 | 0.69 / 102.7 |
| pulsar.PulsarMax 0.8.9 | rank31-band2 | 53.9% ± 7.7 | 69.3% ± 13.6 | 37.6% ± 2.8 | 97 / 140 | 9.3% ± 0.4 | 7.4% ± 1.0 | 126 | 0 | 1.16 / 166.3 |
| zyx.mega.YersiniaPestis 3.0 | rank32-band2 | 56.9% ± 6.2 | 71.4% ± 9.1 | 42.3% ± 5.5 | 100 / 140 | 10.3% ± 0.4 | 7.8% ± 0.4 | 152 | 0 | 1.48 / 24.8 |
| ags.Midboss 1q.fast | rank33-band2 | 72.0% ± 5.1 | 85.0% ± 5.7 | 59.8% ± 4.6 | 119 / 140 | 13.4% ± 1.3 | 8.5% ± 0.2 | 174 | 0 | 1.39 / 217.4 |
| pez.rumble.CassiusClay 2rho.02no | rank35-band2 | 60.0% ± 4.2 | 61.4% ± 7.9 | 58.1% ± 2.2 | 86 / 140 | 12.4% ± 1.0 | 8.6% ± 1.3 | 211 | 0 | 1.12 / 118.8 |
| Krabb.sliNk.Garm 0.9u | rank36-band2 | 65.9% ± 6.8 | 81.4% ± 10.8 | 48.6% ± 3.4 | 114 / 140 | 10.5% ± 0.5 | 6.6% ± 0.7 | 121 | 0 | 1.16 / 213.4 |
| axeBots.SilverSurfer 2.53.33fix | rank37-band2 | 73.2% ± 3.3 | 86.4% ± 4.4 | 60.1% ± 4.5 | 121 / 140 | 12.5% ± 1.1 | 6.9% ± 1.5 | 137 | 0 | 1.37 / 55.7 |
| mn.Combat 3.25.0 | rank38-band2 | 54.3% ± 7.1 | 65.0% ± 10.1 | 43.4% ± 2.8 | 91 / 140 | 10.4% ± 1.3 | 9.3% ± 0.7 | 213 | 0 | 1.73 / 309.3 |
| cs.s2.Seraphim 2.3.1 | rank39-band2 | 65.2% ± 9.1 | 81.4% ± 13.6 | 48.8% ± 9.0 | 114 / 140 | 11.0% ± 0.6 | 7.2% ± 0.9 | 132 | 0 | 1.10 / 12.0 |
| fromHell.CHCl3 1.4.2 | rank40-band2 | 68.3% ± 14.6 | 81.4% ± 21.2 | 54.8% ± 7.0 | 114 / 140 | 12.4% ± 0.7 | 7.4% ± 2.0 | 131 | 0 | 0.99 / 13.6 |
| jk.mini.CunobelinDC 1.2 | rank41-band2 | 97.5% ± 3.0 | 99.3% ± 2.3 | 3.5% ± 3.4 | 139 / 140 | 0.0% ± 0.0 | 1.1% ± 0.1 | 73 | 0 | 0.60 / 323.0 |
| sheldor.mini.Foilist 1.3.1 | rank42-band2 | 65.7% ± 4.4 | 78.6% ± 2.6 | 52.7% ± 7.0 | 110 / 140 | 11.6% ± 0.5 | 8.4% ± 0.4 | 246 | 0 | 1.16 / 15.1 |
| florent.test.Toad 0.14t | rank43-band2 | 59.1% ± 4.8 | 74.3% ± 8.3 | 44.0% ± 2.8 | 104 / 140 | 11.0% ± 0.5 | 7.9% ± 0.5 | 159 | 0 | 1.09 / 63.8 |
| ar.horizon.Horizon 1.2.2 | rank44-band2 | 57.0% ± 5.2 | 70.0% ± 9.5 | 43.8% ± 4.1 | 98 / 140 | 11.1% ± 1.0 | 9.1% ± 1.3 | 182 | 0 | 1.44 / 154.0 |
| cjm.chalk.Chalk 2.6.Be | rank45-band2 | 98.2% ± 5.8 | 99.3% ± 2.3 | 37.5% ± 39.8 | 139 / 140 | 0.0% ± 0.0 | 0.1% ± 0.3 | 48 | 0 | 0.56 / 282.0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | rank46-band2 | 98.4% ± 1.3 | 100.0% ± 0.0 | 5.3% ± 6.7 | 140 / 140 | 0.0% ± 0.0 | 2.0% ± 0.7 | 51 | 0 | 0.48 / 268.8 |
| sheldor.mini.FoilistMC 1.0 | rank47-band2 | 74.3% ± 11.0 | 88.6% ± 12.9 | 59.1% ± 10.0 | 124 / 140 | 12.0% ± 1.0 | 8.0% ± 1.2 | 200 | 0 | 1.24 / 17.9 |
| pez.rumble.Ali 0.4.9 | rank48-band2 | 72.2% ± 15.1 | 88.6% ± 9.8 | 33.1% ± 4.1 | 124 / 140 | 3.5% ± 1.6 | 3.6% ± 2.2 | 89 | 0 | 1.94 / 220.9 |
| catcat20.Lambda 0.017 | rank49-band2 | 66.5% ± 4.3 | 83.4% ± 5.8 | 49.2% ± 5.7 | 117 / 140 | 11.5% ± 1.4 | 7.8% ± 1.5 | 158 | 0 | 1.75 / 21.2 |
| florent.XSeries.X2 0.17 | rank50-band2 | 64.9% ± 8.9 | 80.7% ± 9.4 | 49.2% ± 7.8 | 113 / 140 | 11.2% ± 1.2 | 7.8% ± 1.7 | 114 | 0 | 2.06 / 20.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 2969 | 51.8% | 32.1% | 0.0% | 16.1% | 1820 |
| jd.Nullstride 2.3.3 | 4 | 3113 | 51.4% | 32.2% | 0.0% | 16.4% | 1666 |
| jk.mega.DrussGT 3.1.16 | 4 | 2452 | 41.3% | 45.0% | 0.0% | 13.7% | 2923 |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 1361 | 20.2% | 71.1% | 0.1% | 8.7% | 677 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 3004 | 45.4% | 39.1% | 0.1% | 15.4% | 2589 |
| voidious.Diamond 1.8.22 | 4 | 2165 | 34.1% | 53.8% | 0.0% | 12.1% | 2875 |
| cb.fire.Firestarter 2.0f | 4 | 2175 | 40.8% | 46.3% | 0.0% | 12.9% | 3249 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 2188 | 28.6% | 60.0% | 0.0% | 11.4% | 1246 |
| xander.cat.XanderCat 12.9 | 4 | 1830 | 32.1% | 57.9% | 0.0% | 10.0% | 1393 |
| lxx.Tomcat 3.68 | 4 | 2238 | 29.6% | 58.6% | 0.0% | 11.8% | 1924 |
| rsalesc.mega.Knight 0.6.28 | 4 | 2130 | 37.0% | 50.8% | 0.0% | 12.2% | 3220 |
| aw.Gilgalad 1.99.5c | 4 | 2392 | 32.9% | 54.2% | 0.0% | 12.9% | 1632 |
| pc.Wavelet 1.5 | 4 | 2214 | 45.7% | 38.4% | 0.2% | 15.6% | 1876 |
| gh.GresSuffurd 0.4.13 | 4 | 1969 | 30.5% | 57.7% | 0.0% | 11.9% | 1106 |
| kc.serpent.WaveSerpent 2.11 | 4 | 2140 | 31.0% | 57.3% | 0.0% | 11.7% | 1033 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 1279 | 20.5% | 72.2% | 0.0% | 7.3% | 1254 |
| cs.Nene 1.0.5 | 4 | 1836 | 23.1% | 67.7% | 0.0% | 9.2% | 930 |
| jk.melee.Neuromancer 7.12 | 4 | 2110 | 33.8% | 54.6% | 0.0% | 11.6% | 2299 |
| voidious.Dookious 1.573c | 4 | 1819 | 26.1% | 64.0% | 0.0% | 9.9% | 991 |
| davidalves.Phoenix 1.02 | 4 | 18 | 0.0% | 100.0% | 0.0% | 0.0% | 1238 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 1960 | 42.1% | 44.6% | 0.0% | 13.3% | 2648 |
| cb.Domogled 1.2 | 4 | 1766 | 46.0% | 41.1% | 0.0% | 12.9% | 2494 |
| mue.Ascendant 1.2.27 | 4 | 1836 | 23.8% | 66.2% | 0.0% | 10.0% | 817 |
| abc.Shadow 3.83c | 4 | 2318 | 27.0% | 61.8% | 0.0% | 11.3% | 955 |
| darkcanuck.Pris 0.92 | 4 | 1751 | 22.1% | 68.5% | 0.0% | 9.4% | 846 |
| fromHell.BlackBox 0.0.2 | 4 | 1347 | 20.4% | 71.5% | 0.0% | 8.1% | 883 |
| jk.precise.Wintermute 0.8 | 4 | 1764 | 22.0% | 68.7% | 0.0% | 9.3% | 1012 |
| kc.serpent.Hydra 0.21 | 4 | - | - | - | - | - | 1386 |
| davidalves.Firebird 0.25 | 4 | 123 | 30.5% | 58.0% | 0.0% | 11.4% | 1312 |
| pulsar.PulsarMax 0.8.9 | 4 | 1960 | 27.4% | 61.5% | 0.1% | 11.1% | 961 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 1932 | 25.9% | 63.8% | 0.0% | 10.3% | 971 |
| ags.Midboss 1q.fast | 4 | 1386 | 18.9% | 73.0% | 0.0% | 8.1% | 908 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 1916 | 35.2% | 52.4% | 0.0% | 12.4% | 1583 |
| Krabb.sliNk.Garm 0.9u | 4 | 1468 | 22.1% | 69.1% | 0.0% | 8.8% | 964 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 1272 | 18.7% | 74.2% | 0.0% | 7.2% | 974 |
| mn.Combat 3.25.0 | 4 | 2054 | 29.8% | 59.3% | 0.0% | 10.9% | 1584 |
| cs.s2.Seraphim 2.3.1 | 4 | 1574 | 20.7% | 71.0% | 0.0% | 8.4% | 877 |
| fromHell.CHCl3 1.4.2 | 4 | 1479 | 22.0% | 69.1% | 0.0% | 9.0% | 888 |
| jk.mini.CunobelinDC 1.2 | 4 | 54 | 23.3% | 68.4% | 0.0% | 8.4% | 1407 |
| sheldor.mini.Foilist 1.3.1 | 4 | 1575 | 23.8% | 66.7% | 0.0% | 9.5% | 1319 |
| florent.test.Toad 0.14t | 4 | 1847 | 24.4% | 65.9% | 0.0% | 9.7% | 1001 |
| ar.horizon.Horizon 1.2.2 | 4 | 1940 | 27.1% | 62.8% | 0.0% | 10.1% | 1173 |
| cjm.chalk.Chalk 2.6.Be | 4 | 40 | 31.6% | 50.6% | 1.3% | 16.5% | 1367 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 33 | 0.0% | 100.0% | 0.0% | 0.0% | 1059 |
| sheldor.mini.FoilistMC 1.0 | 4 | 1178 | 17.0% | 76.3% | 0.0% | 6.7% | 1265 |
| pez.rumble.Ali 0.4.9 | 4 | 868 | 23.0% | 68.7% | 0.0% | 8.3% | 1346 |
| catcat20.Lambda 0.017 | 4 | 1513 | 19.0% | 73.4% | 0.0% | 7.6% | 1113 |
| florent.XSeries.X2 0.17 | 4 | 1625 | 20.8% | 70.7% | 0.0% | 8.5% | 963 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 4 | 3 | 0 | 0 | 1.61 | 1 | 1 | 0 |
| jd.Nullstride 2.3.3 | 4 | 1 | 0 | 0 | 1.54 | 3 | 3 | 0 |
| jk.mega.DrussGT 3.1.16 | 4 | 0 | 0 | 0 | 2.14 | 3 | 3 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 4 | 3 | 0 | 0 | 0.37 | 1 | 1 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 4 | 0 | 0 | 0 | 2.08 | 1 | 1 | 0 |
| voidious.Diamond 1.8.22 | 4 | 1 | 0 | 0 | 2.05 | 1 | 1 | 0 |
| cb.fire.Firestarter 2.0f | 4 | 3 | 0 | 0 | 1.88 | 0 | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 4 | 4 | 0 | 0 | 1.43 | 0 | 0 | 0 |
| xander.cat.XanderCat 12.9 | 4 | 1 | 0 | 0 | 1.22 | 3 | 3 | 0 |
| lxx.Tomcat 3.68 | 4 | 2 | 0 | 0 | 1.88 | 1 | 1 | 0 |
| rsalesc.mega.Knight 0.6.28 | 4 | 0 | 0 | 0 | 2.11 | 1 | 1 | 0 |
| aw.Gilgalad 1.99.5c | 4 | 3 | 0 | 0 | 1.74 | 1 | 1 | 0 |
| pc.Wavelet 1.5 | 4 | 4 | 0 | 0 | 1.46 | 0 | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 4 | 2 | 0 | 0 | 1.34 | 2 | 2 | 0 |
| kc.serpent.WaveSerpent 2.11 | 4 | 1 | 0 | 0 | 0.46 | 3 | 3 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 4 | 4 | 0 | 0 | 0.99 | 0 | 0 | 0 |
| cs.Nene 1.0.5 | 4 | 4 | 0 | 0 | 0.78 | 0 | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 4 | 1 | 0 | 0 | 2.04 | 1 | 1 | 0 |
| voidious.Dookious 1.573c | 4 | 2 | 0 | 0 | 0.79 | 2 | 2 | 0 |
| davidalves.Phoenix 1.02 | 4 | 4 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 4 | 1 | 0 | 0 | 2.05 | 1 | 1 | 0 |
| cb.Domogled 1.2 | 4 | 4 | 0 | 0 | 1.71 | 0 | 0 | 0 |
| mue.Ascendant 1.2.27 | 4 | 4 | 0 | 0 | 0.81 | 0 | 0 | 0 |
| abc.Shadow 3.83c | 4 | 2 | 0 | 0 | 0.93 | 2 | 2 | 0 |
| darkcanuck.Pris 0.92 | 4 | 2 | 0 | 0 | 0.53 | 2 | 2 | 0 |
| fromHell.BlackBox 0.0.2 | 4 | 4 | 0 | 0 | 0.84 | 0 | 0 | 0 |
| jk.precise.Wintermute 0.8 | 4 | 3 | 0 | 0 | 1.02 | 1 | 1 | 0 |
| kc.serpent.Hydra 0.21 | 4 | 4 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| davidalves.Firebird 0.25 | 4 | 4 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 4 | 2 | 0 | 0 | 0.90 | 2 | 2 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 4 | 2 | 0 | 0 | 1.09 | 2 | 2 | 0 |
| ags.Midboss 1q.fast | 4 | 4 | 0 | 0 | 1.24 | 0 | 0 | 0 |
| pez.rumble.CassiusClay 2rho.02no | 4 | 4 | 0 | 0 | 1.51 | 0 | 0 | 0 |
| Krabb.sliNk.Garm 0.9u | 4 | 3 | 0 | 0 | 0.86 | 1 | 1 | 0 |
| axeBots.SilverSurfer 2.53.33fix | 4 | 4 | 0 | 0 | 0.98 | 0 | 0 | 0 |
| mn.Combat 3.25.0 | 4 | 4 | 0 | 0 | 1.52 | 0 | 0 | 0 |
| cs.s2.Seraphim 2.3.1 | 4 | 3 | 0 | 0 | 0.94 | 1 | 1 | 0 |
| fromHell.CHCl3 1.4.2 | 4 | 4 | 0 | 0 | 0.94 | 0 | 0 | 0 |
| jk.mini.CunobelinDC 1.2 | 4 | 4 | 0 | 0 | 0.52 | 0 | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 4 | 4 | 0 | 0 | 1.76 | 0 | 0 | 0 |
| florent.test.Toad 0.14t | 4 | 4 | 0 | 0 | 1.14 | 0 | 0 | 0 |
| ar.horizon.Horizon 1.2.2 | 4 | 2 | 0 | 0 | 1.30 | 2 | 2 | 0 |
| cjm.chalk.Chalk 2.6.Be | 4 | 4 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 4 | 4 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 4 | 4 | 0 | 0 | 1.43 | 0 | 0 | 0 |
| pez.rumble.Ali 0.4.9 | 4 | 4 | 0 | 0 | 0.64 | 0 | 0 | 0 |
| catcat20.Lambda 0.017 | 4 | 4 | 0 | 0 | 1.13 | 0 | 0 | 0 |
| florent.XSeries.X2 0.17 | 4 | 4 | 0 | 0 | 0.81 | 0 | 0 | 0 |

139 of 192 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 19392 | 214 | 19435 | 19352 (99.8%) | 40 (0.2%) | 83 (0.4%) | 1622 | 132 | 264 |
| jd.Nullstride 2.3.3 | 17118 | 240 | 17194 | 17103 (99.9%) | 15 (0.1%) | 91 (0.5%) | 1447 | 130 | 230 |
| jk.mega.DrussGT 3.1.16 | 33385 | 6 | 33387 | 33383 (100.0%) | 2 (0.0%) | 4 (0.0%) | 2036 | 238 | 288 |
| oog.mega.saguaro.Saguaro 1.0 | 4547 | 8 | 4550 | 4543 (99.9%) | 4 (0.1%) | 7 (0.2%) | 298 | 52 | 22 |
| aaa.r.ScalarR 0.005h.053-noshield | 28625 | 17 | 28693 | 28621 (100.0%) | 4 (0.0%) | 72 (0.3%) | 2296 | 308 | 283 |
| voidious.Diamond 1.8.22 | 32461 | 589 | 32533 | 32448 (100.0%) | 13 (0.0%) | 85 (0.3%) | 2868 | 202 | 286 |
| cb.fire.Firestarter 2.0f | 32495 | 761 | 32896 | 32473 (99.9%) | 22 (0.1%) | 423 (1.3%) | 6962 | 255 | 258 |
| dsekercioglu.mega.Raven 3.56j8 | 11584 | 55 | 11586 | 11581 (100.0%) | 3 (0.0%) | 5 (0.0%) | 779 | 120 | 167 |
| xander.cat.XanderCat 12.9 | 11044 | 2 | 11073 | 11042 (100.0%) | 2 (0.0%) | 31 (0.3%) | 1249 | 142 | 159 |
| lxx.Tomcat 3.68 | 20507 | 436 | 20455 | 20434 (99.6%) | 73 (0.4%) | 21 (0.1%) | 1744 | 195 | 269 |
| rsalesc.mega.Knight 0.6.28 | 36923 | 331 | 36929 | 36919 (100.0%) | 4 (0.0%) | 10 (0.0%) | 3013 | 326 | 282 |
| aw.Gilgalad 1.99.5c | 16791 | 9 | 16802 | 16787 (100.0%) | 4 (0.0%) | 15 (0.1%) | 1407 | 187 | 248 |
| pc.Wavelet 1.5 | 16696 | 4 | 16723 | 16687 (99.9%) | 9 (0.1%) | 36 (0.2%) | 1916 | 174 | 233 |
| gh.GresSuffurd 0.4.13 | 9854 | 6 | 9855 | 9854 (100.0%) | 0 (0.0%) | 1 (0.0%) | 703 | 79 | 166 |
| kc.serpent.WaveSerpent 2.11 | 7507 | 9 | 7507 | 7507 (100.0%) | 0 (0.0%) | 0 (0.0%) | 513 | 54 | 61 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 10548 | 7 | 10551 | 10544 (100.0%) | 4 (0.0%) | 7 (0.1%) | 897 | 77 | 105 |
| cs.Nene 1.0.5 | 7628 | 70 | 7629 | 7627 (100.0%) | 1 (0.0%) | 2 (0.0%) | 486 | 62 | 83 |
| jk.melee.Neuromancer 7.12 | 24300 | 7 | 24326 | 24298 (100.0%) | 2 (0.0%) | 28 (0.1%) | 2274 | 216 | 282 |
| voidious.Dookious 1.573c | 7329 | 11 | 7331 | 7329 (100.0%) | 0 (0.0%) | 2 (0.0%) | 531 | 48 | 79 |
| davidalves.Phoenix 1.02 | 5784 | 0 | 5784 | 5784 (100.0%) | 0 (0.0%) | 0 (0.0%) | 2519 | 1 | 12 |
| rsalesc.roborio.Roborio 1.2.4 | 25784 | 6 | 25805 | 25782 (100.0%) | 2 (0.0%) | 23 (0.1%) | 2795 | 206 | 258 |
| cb.Domogled 1.2 | 20806 | 7 | 21425 | 20804 (100.0%) | 2 (0.0%) | 621 (2.9%) | 7705 | 124 | 225 |
| mue.Ascendant 1.2.27 | 6242 | 5 | 6241 | 6238 (99.9%) | 4 (0.1%) | 3 (0.0%) | 259 | 57 | 102 |
| abc.Shadow 3.83c | 8002 | 506 | 7952 | 7947 (99.3%) | 55 (0.7%) | 5 (0.1%) | 492 | 72 | 121 |
| darkcanuck.Pris 0.92 | 6335 | 33 | 6335 | 6334 (100.0%) | 1 (0.0%) | 1 (0.0%) | 312 | 76 | 66 |
| fromHell.BlackBox 0.0.2 | 7417 | 13 | 7413 | 7411 (99.9%) | 6 (0.1%) | 2 (0.0%) | 515 | 82 | 189 |
| jk.precise.Wintermute 0.8 | 8865 | 13 | 8867 | 8865 (100.0%) | 0 (0.0%) | 2 (0.0%) | 565 | 93 | 111 |
| kc.serpent.Hydra 0.21 | 9029 | 0 | 9030 | 9027 (100.0%) | 2 (0.0%) | 3 (0.0%) | 24 | 3 | 12 |
| davidalves.Firebird 0.25 | 7148 | 0 | 7148 | 7148 (100.0%) | 0 (0.0%) | 0 (0.0%) | 1350 | 4 | 17 |
| pulsar.PulsarMax 0.8.9 | 7694 | 3 | 7695 | 7694 (100.0%) | 0 (0.0%) | 1 (0.0%) | 527 | 51 | 97 |
| zyx.mega.YersiniaPestis 3.0 | 7037 | 356 | 7019 | 7018 (99.7%) | 19 (0.3%) | 1 (0.0%) | 576 | 64 | 134 |
| ags.Midboss 1q.fast | 7737 | 26 | 7737 | 7736 (100.0%) | 1 (0.0%) | 1 (0.0%) | 424 | 130 | 131 |
| pez.rumble.CassiusClay 2rho.02no | 14558 | 4 | 14582 | 14557 (100.0%) | 1 (0.0%) | 25 (0.2%) | 1620 | 128 | 188 |
| Krabb.sliNk.Garm 0.9u | 7833 | 2 | 7832 | 7825 (99.9%) | 8 (0.1%) | 7 (0.1%) | 544 | 50 | 103 |
| axeBots.SilverSurfer 2.53.33fix | 5559 | 10 | 5617 | 5557 (100.0%) | 2 (0.0%) | 60 (1.1%) | 1035 | 76 | 105 |
| mn.Combat 3.25.0 | 15858 | 10 | 15858 | 15854 (100.0%) | 4 (0.0%) | 4 (0.0%) | 1348 | 131 | 171 |
| cs.s2.Seraphim 2.3.1 | 6788 | 21 | 6788 | 6788 (100.0%) | 0 (0.0%) | 0 (0.0%) | 388 | 53 | 81 |
| fromHell.CHCl3 1.4.2 | 6450 | 9 | 6449 | 6448 (100.0%) | 2 (0.0%) | 1 (0.0%) | 440 | 61 | 108 |
| jk.mini.CunobelinDC 1.2 | 13573 | 143 | 13573 | 13573 (100.0%) | 0 (0.0%) | 0 (0.0%) | 10 | 5 | 21 |
| sheldor.mini.Foilist 1.3.1 | 12911 | 8 | 12910 | 12907 (100.0%) | 4 (0.0%) | 3 (0.0%) | 962 | 111 | 214 |
| florent.test.Toad 0.14t | 7317 | 5 | 7317 | 7315 (100.0%) | 2 (0.0%) | 2 (0.0%) | 631 | 61 | 115 |
| ar.horizon.Horizon 1.2.2 | 10180 | 4 | 10183 | 10177 (100.0%) | 3 (0.0%) | 6 (0.1%) | 812 | 97 | 172 |
| cjm.chalk.Chalk 2.6.Be | 7956 | 0 | 7956 | 7956 (100.0%) | 0 (0.0%) | 0 (0.0%) | 144 | 0 | 16 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 8832 | 232 | 8829 | 8829 (100.0%) | 3 (0.0%) | 0 (0.0%) | 0 | 4 | 11 |
| sheldor.mini.FoilistMC 1.0 | 12555 | 36 | 12558 | 12551 (100.0%) | 4 (0.0%) | 7 (0.1%) | 874 | 102 | 163 |
| pez.rumble.Ali 0.4.9 | 8171 | 65 | 8170 | 8156 (99.8%) | 15 (0.2%) | 14 (0.2%) | 1989 | 29 | 55 |
| catcat20.Lambda 0.017 | 9621 | 141 | 9614 | 9613 (99.9%) | 8 (0.1%) | 1 (0.0%) | 736 | 68 | 117 |
| florent.XSeries.X2 0.17 | 6791 | 3 | 6792 | 6788 (100.0%) | 3 (0.0%) | 4 (0.1%) | 523 | 70 | 84 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 19190 | 2057 (10.7%) | 18721 |
| jd.Nullstride 2.3.3 | 17175 | 1822 (10.6%) | 16499 |
| jk.mega.DrussGT 3.1.16 | 33021 | 4244 (12.9%) | 32725 |
| oog.mega.saguaro.Saguaro 1.0 | 5221 | 353 (6.8%) | 5199 |
| aaa.r.ScalarR 0.005h.053-noshield | 28687 | 3290 (11.5%) | 27876 |
| voidious.Diamond 1.8.22 | 33067 | 3463 (10.5%) | 32531 |
| cb.fire.Firestarter 2.0f | 37616 | 3396 (9.0%) | 35987 |
| dsekercioglu.mega.Raven 3.56j8 | 12451 | 1230 (9.9%) | 11780 |
| xander.cat.XanderCat 12.9 | 13313 | 1134 (8.5%) | 12848 |
| lxx.Tomcat 3.68 | 20915 | 2301 (11.0%) | 20697 |
| rsalesc.mega.Knight 0.6.28 | 37061 | 4347 (11.7%) | 36516 |
| aw.Gilgalad 1.99.5c | 17090 | 1708 (10.0%) | 16103 |
| pc.Wavelet 1.5 | 19863 | 1864 (9.4%) | 19285 |
| gh.GresSuffurd 0.4.13 | 10265 | 1028 (10.0%) | 9824 |
| kc.serpent.WaveSerpent 2.11 | 9476 | 666 (7.0%) | 8072 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 12301 | 1146 (9.3%) | 10366 |
| cs.Nene 1.0.5 | 8611 | 830 (9.6%) | 7683 |
| jk.melee.Neuromancer 7.12 | 25500 | 2572 (10.1%) | 25035 |
| voidious.Dookious 1.573c | 9125 | 750 (8.2%) | 7437 |
| davidalves.Phoenix 1.02 | 130 | 5771 (4439.2%) | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 29493 | 2673 (9.1%) | 29465 |
| cb.Domogled 1.2 | 27764 | 2261 (8.1%) | 25986 |
| mue.Ascendant 1.2.27 | 6862 | 607 (8.8%) | 6003 |
| abc.Shadow 3.83c | 8714 | 762 (8.7%) | 5920 |
| darkcanuck.Pris 0.92 | 7204 | 526 (7.3%) | 4218 |
| fromHell.BlackBox 0.0.2 | 7527 | 756 (10.0%) | 6369 |
| jk.precise.Wintermute 0.8 | 9380 | 1017 (10.8%) | 8234 |
| kc.serpent.Hydra 0.21 | 148 | 9029 (6100.7%) | 0 |
| davidalves.Firebird 0.25 | 136 | 7119 (5234.6%) | 0 |
| pulsar.PulsarMax 0.8.9 | 8850 | 807 (9.1%) | 7886 |
| zyx.mega.YersiniaPestis 3.0 | 8915 | 616 (6.9%) | 6025 |
| ags.Midboss 1q.fast | 7949 | 721 (9.1%) | 7075 |
| pez.rumble.CassiusClay 2rho.02no | 16236 | 1530 (9.4%) | 15113 |
| Krabb.sliNk.Garm 0.9u | 8774 | 759 (8.7%) | 8369 |
| axeBots.SilverSurfer 2.53.33fix | 8805 | 502 (5.7%) | 5552 |
| mn.Combat 3.25.0 | 16721 | 1662 (9.9%) | 15861 |
| cs.s2.Seraphim 2.3.1 | 7720 | 607 (7.9%) | 4812 |
| fromHell.CHCl3 1.4.2 | 7621 | 684 (9.0%) | 6273 |
| jk.mini.CunobelinDC 1.2 | 370 | 13424 (3628.1%) | 0 |
| sheldor.mini.Foilist 1.3.1 | 13287 | 1193 (9.0%) | 12674 |
| florent.test.Toad 0.14t | 9301 | 741 (8.0%) | 8163 |
| ar.horizon.Horizon 1.2.2 | 11241 | 1026 (9.1%) | 9965 |
| cjm.chalk.Chalk 2.6.Be | 139 | 7949 (5718.7%) | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 339 | 8817 (2600.9%) | 0 |
| sheldor.mini.FoilistMC 1.0 | 12513 | 1173 (9.4%) | 11715 |
| pez.rumble.Ali 0.4.9 | 5104 | 5355 (104.9%) | 3287 |
| catcat20.Lambda 0.017 | 10648 | 932 (8.8%) | 8753 |
| florent.XSeries.X2 0.17 | 8790 | 540 (6.1%) | 7057 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 650 | 532 | 650 | 1678 | 19.4 / 27.3 | 6 | 765 | 75 |
| jd.Nullstride 2.3.3 | 650 | 530 | 650 | 1531 | 19.2 / 28.7 | 0 | 342 | 27 |
| jk.mega.DrussGT 3.1.16 | 650 | 515 | 650 | 2804 | 26.9 / 31.5 | 36 | 4868 | 372 |
| oog.mega.saguaro.Saguaro 1.0 | 650 | 439 | 400 | 527 | 42.9 / 27.6 | 628 | 1574 | 300 |
| aaa.r.ScalarR 0.005h.053-noshield | 650 | 482 | 650 | 2424 | 22.4 / 33.6 | 0 | 1353 | 0 |
| voidious.Diamond 1.8.22 | 650 | 536 | 650 | 2742 | 21.8 / 33.3 | 97 | 9700 | 109 |
| cb.fire.Firestarter 2.0f | 650 | 543 | 650 | 3099 | 30.2 / 28.8 | 64 | 4049 | 159 |
| dsekercioglu.mega.Raven 3.56j8 | 650 | 454 | 650 | 1096 | 24.3 / 37.5 | 124 | 10344 | 1170 |
| xander.cat.XanderCat 12.9 | 650 | 447 | 650 | 1235 | 34.4 / 30.2 | 309 | 1567 | 56 |
| lxx.Tomcat 3.68 | 650 | 507 | 650 | 1782 | 27.5 / 37.5 | 90 | 10588 | 9 |
| rsalesc.mega.Knight 0.6.28 | 650 | 509 | 650 | 3088 | 32.8 / 30.9 | 226 | 5355 | 1 |
| aw.Gilgalad 1.99.5c | 650 | 461 | 650 | 1481 | 27.6 / 37.0 | 202 | 11542 | 95 |
| pc.Wavelet 1.5 | 650 | 434 | 588 | 1726 | 42.3 / 24.3 | 567 | 1716 | 11 |
| gh.GresSuffurd 0.4.13 | 650 | 459 | 650 | 961 | 28.6 / 32.4 | 382 | 3843 | 3 |
| kc.serpent.WaveSerpent 2.11 | 650 | 479 | 650 | 883 | 22.7 / 35.1 | 123 | 4488 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 650 | 462 | 650 | 1104 | 32.8 / 26.4 | 277 | 6826 | 138 |
| cs.Nene 1.0.5 | 650 | 470 | 650 | 780 | 23.2 / 35.5 | 104 | 5054 | 1575 |
| jk.melee.Neuromancer 7.12 | 650 | 529 | 650 | 2154 | 32.3 / 32.9 | 182 | 9093 | 7 |
| voidious.Dookious 1.573c | 650 | 486 | 650 | 843 | 23.4 / 33.3 | 95 | 3927 | 2376 |
| davidalves.Phoenix 1.02 | 650 | 400 | 650 | 1088 | 0.0 / 0.5 | 0 | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 650 | 504 | 650 | 2505 | 41.7 / 25.0 | 647 | 5902 | 40 |
| cb.Domogled 1.2 | 650 | 554 | 650 | 2344 | 41.4 / 20.7 | 321 | 1490 | 104 |
| mue.Ascendant 1.2.27 | 650 | 413 | 650 | 667 | 33.5 / 34.7 | 95 | 1847 | 0 |
| abc.Shadow 3.83c | 650 | 454 | 650 | 809 | 24.7 / 40.9 | 61 | 4131 | 59 |
| darkcanuck.Pris 0.92 | 650 | 414 | 650 | 696 | 34.4 / 34.2 | 167 | 2292 | 794 |
| fromHell.BlackBox 0.0.2 | 650 | 421 | 525 | 733 | 39.5 / 27.5 | 883 | 1757 | 69 |
| jk.precise.Wintermute 0.8 | 650 | 453 | 650 | 860 | 28.2 / 34.6 | 135 | 5361 | 33 |
| kc.serpent.Hydra 0.21 | 650 | 346 | 650 | 1236 | 0.0 / 0.0 | 0 | 0 | 0 |
| davidalves.Firebird 0.25 | 650 | 402 | 650 | 1162 | 0.0 / 2.0 | 0 | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 650 | 483 | 650 | 814 | 20.8 / 34.4 | 14 | 5483 | 28 |
| zyx.mega.YersiniaPestis 3.0 | 650 | 446 | 650 | 822 | 25.9 / 35.2 | 100 | 4119 | 90 |
| ags.Midboss 1q.fast | 650 | 411 | 650 | 758 | 43.0 / 28.9 | 413 | 2234 | 341 |
| pez.rumble.CassiusClay 2rho.02no | 650 | 472 | 594 | 1433 | 39.7 / 28.7 | 591 | 1331 | 1 |
| Krabb.sliNk.Garm 0.9u | 650 | 526 | 650 | 813 | 27.5 / 29.0 | 122 | 3426 | 2470 |
| axeBots.SilverSurfer 2.53.33fix | 650 | 477 | 650 | 824 | 40.4 / 27.0 | 225 | 981 | 90 |
| mn.Combat 3.25.0 | 650 | 487 | 650 | 1434 | 26.6 / 34.8 | 179 | 9967 | 2 |
| cs.s2.Seraphim 2.3.1 | 650 | 479 | 606 | 728 | 30.6 / 31.9 | 165 | 2598 | 667 |
| fromHell.CHCl3 1.4.2 | 650 | 431 | 544 | 738 | 35.1 / 29.2 | 426 | 1004 | 0 |
| jk.mini.CunobelinDC 1.2 | 650 | 534 | 650 | 1257 | 0.0 / 1.1 | 0 | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 650 | 566 | 650 | 1169 | 33.7 / 30.0 | 299 | 5725 | 12 |
| florent.test.Toad 0.14t | 650 | 491 | 650 | 851 | 27.4 / 34.8 | 216 | 4003 | 52 |
| ar.horizon.Horizon 1.2.2 | 650 | 485 | 650 | 1024 | 27.2 / 34.8 | 195 | 6544 | 57 |
| cjm.chalk.Chalk 2.6.Be | 650 | 412 | 650 | 1217 | 0.0 / 0.6 | 0 | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 650 | 356 | 650 | 909 | 0.0 / 1.0 | 0 | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 650 | 573 | 588 | 1115 | 37.5 / 25.7 | 297 | 3786 | 1147 |
| pez.rumble.Ali 0.4.9 | 650 | 401 | 588 | 1196 | 8.2 / 17.0 | 13 | 3118 | 41 |
| catcat20.Lambda 0.017 | 650 | 536 | 650 | 963 | 30.8 / 31.7 | 240 | 2531 | 2 |
| florent.XSeries.X2 0.17 | 650 | 492 | 650 | 813 | 31.7 / 32.8 | 134 | 2648 | 61 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| kc.mega.BeepBoop 2.0 | 8.7% | 226 | 1004 | 3 | 137.2 | 2052 / 2057 (100%) | 0 | 0 |
| jd.Nullstride 2.3.3 | 9.4% | 215 | 293 | 3 | 121.0 | 1816 / 1822 (100%) | 0 | 0 |
| jk.mega.DrussGT 3.1.16 | 10.3% | 300 | 221 | 3 | 234.7 | 4239 / 4244 (100%) | 0 | 0 |
| oog.mega.saguaro.Saguaro 1.0 | 6.8% | 52 | 315 | 3 | 32.3 | 353 / 353 (100%) | 0 | 0 |
| aaa.r.ScalarR 0.005h.053-noshield | 10.6% | 291 | 1030 | 3 | 201.8 | 3287 / 3290 (100%) | 0 | 0 |
| voidious.Diamond 1.8.22 | 9.3% | 287 | 333 | 3 | 231.4 | 3457 / 3463 (100%) | 0 | 0 |
| cb.fire.Firestarter 2.0f | 9.8% | 263 | 1133 | 3 | 234.1 | 3386 / 3396 (100%) | 0 | 0 |
| dsekercioglu.mega.Raven 3.56j8 | 10.0% | 200 | 656 | 3 | 82.5 | 1221 / 1230 (99%) | 0 | 0 |
| xander.cat.XanderCat 12.9 | 8.6% | 171 | 284 | 3 | 76.4 | 1134 / 1134 (100%) | 0 | 0 |
| lxx.Tomcat 3.68 | 10.5% | 263 | 1924 | 3 | 145.6 | 2299 / 2301 (100%) | 0 | 0 |
| rsalesc.mega.Knight 0.6.28 | 10.3% | 296 | 1556 | 3 | 262.0 | 4340 / 4347 (100%) | 0 | 0 |
| aw.Gilgalad 1.99.5c | 11.0% | 244 | 754 | 3 | 118.4 | 1705 / 1708 (100%) | 0 | 0 |
| pc.Wavelet 1.5 | 9.6% | 204 | 232 | 3 | 119.4 | 1861 / 1864 (100%) | 0 | 0 |
| gh.GresSuffurd 0.4.13 | 8.6% | 188 | 897 | 3 | 69.5 | 1026 / 1028 (100%) | 0 | 0 |
| kc.serpent.WaveSerpent 2.11 | 7.8% | 64 | 112 | 3 | 51.9 | 666 / 666 (100%) | 0 | 0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | 7.5% | 138 | 221 | 3 | 74.8 | 1144 / 1146 (100%) | 0 | 0 |
| cs.Nene 1.0.5 | 8.0% | 109 | 629 | 3 | 54.5 | 824 / 830 (99%) | 0 | 0 |
| jk.melee.Neuromancer 7.12 | 10.7% | 285 | 590 | 3 | 172.1 | 2569 / 2572 (100%) | 0 | 0 |
| voidious.Dookious 1.573c | 7.6% | 111 | 159 | 3 | 51.7 | 750 / 750 (100%) | 0 | 0 |
| davidalves.Phoenix 1.02 | 0.1% | 45 | 8 | 2 | 0.0 | 0 / 5771 (0%) | 0 | 0 |
| rsalesc.roborio.Roborio 1.2.4 | 9.9% | 287 | 324 | 3 | 182.0 | 2669 / 2673 (100%) | 0 | 0 |
| cb.Domogled 1.2 | 8.0% | 240 | 86 | 3 | 152.4 | 2254 / 2261 (100%) | 0 | 0 |
| mue.Ascendant 1.2.27 | 8.1% | 114 | 4933 | 3 | 44.4 | 604 / 607 (100%) | 0 | 0 |
| abc.Shadow 3.83c | 9.5% | 130 | 123 | 3 | 56.1 | 760 / 762 (100%) | 0 | 0 |
| darkcanuck.Pris 0.92 | 8.0% | 74 | 42 | 2 | 44.5 | 524 / 526 (100%) | 0 | 0 |
| fromHell.BlackBox 0.0.2 | 7.8% | 117 | 165 | 3 | 52.8 | 756 / 756 (100%) | 0 | 0 |
| jk.precise.Wintermute 0.8 | 8.6% | 143 | 10627 | 3 | 62.7 | 1015 / 1017 (100%) | 0 | 0 |
| kc.serpent.Hydra 0.21 | 0.0% | 44 | 8 | 2 | 0.0 | 0 / 9029 (0%) | 0 | 0 |
| davidalves.Firebird 0.25 | 0.3% | 50 | 12 | 3 | 0.0 | 0 / 7119 (0%) | 0 | 0 |
| pulsar.PulsarMax 0.8.9 | 7.4% | 126 | 49 | 3 | 54.0 | 807 / 807 (100%) | 0 | 0 |
| zyx.mega.YersiniaPestis 3.0 | 7.8% | 152 | 156 | 3 | 49.3 | 614 / 616 (100%) | 0 | 0 |
| ags.Midboss 1q.fast | 8.5% | 174 | 61 | 3 | 55.3 | 716 / 721 (99%) | 0 | 0 |
| pez.rumble.CassiusClay 2rho.02no | 8.6% | 211 | 56 | 3 | 103.4 | 1528 / 1530 (100%) | 0 | 0 |
| Krabb.sliNk.Garm 0.9u | 6.6% | 121 | 116 | 3 | 55.3 | 757 / 759 (100%) | 0 | 0 |
| axeBots.SilverSurfer 2.53.33fix | 6.9% | 137 | 122 | 3 | 40.1 | 501 / 502 (100%) | 0 | 0 |
| mn.Combat 3.25.0 | 9.3% | 213 | 20037 | 3 | 113.1 | 1657 / 1662 (100%) | 0 | 0 |
| cs.s2.Seraphim 2.3.1 | 7.2% | 132 | 194 | 3 | 48.2 | 607 / 607 (100%) | 0 | 0 |
| fromHell.CHCl3 1.4.2 | 7.4% | 131 | 43 | 3 | 45.9 | 682 / 684 (100%) | 0 | 0 |
| jk.mini.CunobelinDC 1.2 | 1.1% | 73 | 12 | 3 | 0.0 | 0 / 13424 (0%) | 0 | 0 |
| sheldor.mini.Foilist 1.3.1 | 8.4% | 246 | 248 | 3 | 91.9 | 1190 / 1193 (100%) | 0 | 0 |
| florent.test.Toad 0.14t | 7.9% | 159 | 144 | 3 | 52.0 | 740 / 741 (100%) | 0 | 0 |
| ar.horizon.Horizon 1.2.2 | 9.1% | 182 | 171 | 3 | 70.9 | 1022 / 1026 (100%) | 0 | 0 |
| cjm.chalk.Chalk 2.6.Be | 0.1% | 48 | 10 | 3 | 0.0 | 0 / 7949 (0%) | 0 | 0 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | 2.0% | 51 | 5 | 3 | 0.0 | 0 / 8817 (0%) | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 8.0% | 200 | 918 | 3 | 89.7 | 1171 / 1173 (100%) | 0 | 0 |
| pez.rumble.Ali 0.4.9 | 3.6% | 89 | 48 | 3 | 21.4 | 285 / 5355 (5%) | 0 | 0 |
| catcat20.Lambda 0.017 | 7.8% | 158 | 187 | 3 | 68.5 | 931 / 932 (100%) | 0 | 0 |
| florent.XSeries.X2 0.17 | 7.8% | 114 | 44 | 3 | 48.4 | 540 / 540 (100%) | 0 | 0 |

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
| Krabb.sliNk.Garm 0.9u | hadur2.Hadur 3.14hjswthfgnk | 4 | 80.0% ± 26.0 | 86.7% ± 22.5 | +6.7 ± 19.8 | 50.1% ± 7.1 | 52.7% ± 15.5 | +2.6 ± 8.9 |
| Krabb.sliNk.Garm 0.9u | hadur2.Hadur 3.14hjsw | 4 | 65.0% ± 15.9 | 90.0% ± 22.5 | +25.0 ± 20.5 | 41.6% ± 7.8 | 47.2% ± 14.7 | +5.6 ± 14.3 |
| aaa.r.ScalarR 0.005h.053-noshield | hadur2.Hadur 3.14hjswthfgnk | 4 | 35.0% ± 40.0 | 22.5% ± 15.2 | -12.5 ± 45.7 | 45.3% ± 11.9 | 38.8% ± 4.6 | -6.5 ± 7.8 |
| aaa.r.ScalarR 0.005h.053-noshield | hadur2.Hadur 3.14hjsw | 4 | 10.0% ± 18.4 | 23.1% ± 7.6 | +13.1 ± 22.9 | 36.6% ± 21.0 | 40.8% ± 6.1 | +4.2 ± 24.2 |
| abc.Shadow 3.83c | hadur2.Hadur 3.14hjswthfgnk | 4 | 70.0% ± 18.4 | 63.6% ± 39.9 | -6.4 ± 22.1 | 42.6% ± 12.1 | 42.2% ± 10.2 | -0.4 ± 10.0 |
| abc.Shadow 3.83c | hadur2.Hadur 3.14hjsw | 4 | 55.0% ± 30.5 | 63.9% ± 29.3 | +8.9 ± 27.5 | 34.6% ± 9.0 | 36.4% ± 8.6 | +1.8 ± 9.8 |
| ags.Midboss 1q.fast | hadur2.Hadur 3.14hjswthfgnk | 4 | 90.0% ± 31.8 | 68.9% ± 16.3 | -21.1 ± 26.1 | 57.6% ± 21.9 | 54.2% ± 6.9 | -3.4 ± 18.8 |
| ags.Midboss 1q.fast | hadur2.Hadur 3.14hjsw | 4 | 70.0% ± 18.4 | 87.5% ± 23.9 | +17.5 ± 41.8 | 52.5% ± 4.2 | 60.4% ± 15.1 | +7.9 ± 18.1 |
| ar.horizon.Horizon 1.2.2 | hadur2.Hadur 3.14hjswthfgnk | 4 | 70.0% ± 41.1 | 71.7% ± 15.9 | +1.7 ± 26.5 | 53.6% ± 19.0 | 45.7% ± 9.2 | -7.9 ± 18.2 |
| ar.horizon.Horizon 1.2.2 | hadur2.Hadur 3.14hjsw | 4 | 65.0% ± 30.5 | 71.4% ± 26.9 | +6.4 ± 22.4 | 45.5% ± 10.6 | 44.2% ± 10.1 | -1.3 ± 20.1 |
| aw.Gilgalad 1.99.5c | hadur2.Hadur 3.14hjswthfgnk | 4 | 60.0% ± 45.0 | 57.5% ± 26.5 | -2.5 ± 24.3 | 54.6% ± 16.9 | 47.9% ± 14.4 | -6.8 ± 14.6 |
| aw.Gilgalad 1.99.5c | hadur2.Hadur 3.14hjsw | 4 | 40.0% ± 45.0 | 51.1% ± 21.1 | +11.1 ± 63.3 | 42.9% ± 19.3 | 43.4% ± 11.7 | +0.5 ± 11.1 |
| axeBots.SilverSurfer 2.53.33fix | hadur2.Hadur 3.14hjswthfgnk | 4 | 85.0% ± 15.9 | 87.2% ± 7.7 | +2.2 ± 14.8 | 58.9% ± 10.8 | 60.8% ± 8.1 | +1.9 ± 9.2 |
| axeBots.SilverSurfer 2.53.33fix | hadur2.Hadur 3.14hjsw | 4 | 75.0% ± 15.9 | 90.0% ± 13.0 | +15.0 ± 20.5 | 57.0% ± 6.2 | 65.0% ± 12.5 | +8.0 ± 9.8 |
| catcat20.Lambda 0.017 | hadur2.Hadur 3.14hjswthfgnk | 4 | 90.0% ± 18.4 | 85.0% ± 9.2 | -5.0 ± 20.5 | 56.1% ± 6.5 | 58.5% ± 11.9 | +2.4 ± 14.8 |
| catcat20.Lambda 0.017 | hadur2.Hadur 3.14hjsw | 4 | 95.0% ± 15.9 | 75.0% ± 15.9 | -20.0 ± 26.0 | 53.5% ± 15.7 | 45.9% ± 13.8 | -7.6 ± 17.8 |
| cb.Domogled 1.2 | hadur2.Hadur 3.14hjswthfgnk | 4 | 75.0% ± 30.5 | 65.0% ± 20.5 | -10.0 ± 13.0 | 72.0% ± 9.9 | 71.8% ± 6.8 | -0.1 ± 8.5 |
| cb.Domogled 1.2 | hadur2.Hadur 3.14hjsw | 4 | 65.0% ± 15.9 | 47.5% ± 27.2 | -17.5 ± 39.8 | 76.5% ± 3.5 | 55.0% ± 9.3 | -21.5 ± 11.5 |
| cb.fire.Firestarter 2.0f | hadur2.Hadur 3.14hjswthfgnk | 4 | 35.0% ± 30.5 | 67.5% ± 23.9 | +32.5 ± 15.2 | 62.8% ± 8.1 | 54.2% ± 4.4 | -8.6 ± 3.8 |
| cb.fire.Firestarter 2.0f | hadur2.Hadur 3.14hjsw | 4 | 35.0% ± 15.9 | 40.0% ± 13.0 | +5.0 ± 27.6 | 55.9% ± 14.0 | 50.2% ± 4.5 | -5.7 ± 16.8 |
| cjm.chalk.Chalk 2.6.Be | hadur2.Hadur 3.14hjswthfgnk | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | - | - | n/a |
| cjm.chalk.Chalk 2.6.Be | hadur2.Hadur 3.14hjsw | 4 | 100.0% ± 0.0 | 97.5% ± 8.0 | -2.5 ± 8.0 | - | 0.0% | n/a |
| cs.Nene 1.0.5 | hadur2.Hadur 3.14hjswthfgnk | 4 | 85.0% ± 30.5 | 70.0% ± 18.4 | -15.0 ± 30.5 | 44.3% ± 12.5 | 36.9% ± 10.1 | -7.4 ± 7.1 |
| cs.Nene 1.0.5 | hadur2.Hadur 3.14hjsw | 4 | 80.0% ± 26.0 | 80.0% ± 22.5 | +0.0 ± 39.0 | 43.2% ± 10.7 | 42.1% ± 9.9 | -1.1 ± 15.8 |
| cs.s2.Seraphim 2.3.1 | hadur2.Hadur 3.14hjswthfgnk | 4 | 80.0% ± 26.0 | 89.2% ± 25.0 | +9.2 ± 31.0 | 47.8% ± 8.2 | 49.9% ± 11.8 | +2.1 ± 17.2 |
| cs.s2.Seraphim 2.3.1 | hadur2.Hadur 3.14hjsw | 4 | 80.0% ± 26.0 | 87.2% ± 7.7 | +7.2 ± 27.8 | 47.0% ± 10.4 | 53.6% ± 16.2 | +6.6 ± 23.1 |
| darkcanuck.Pris 0.92 | hadur2.Hadur 3.14hjswthfgnk | 4 | 65.0% ± 40.0 | 69.2% ± 2.7 | +4.2 ± 39.8 | 44.0% ± 10.8 | 49.8% ± 13.5 | +5.8 ± 12.2 |
| darkcanuck.Pris 0.92 | hadur2.Hadur 3.14hjsw | 4 | 70.0% ± 41.1 | 75.8% ± 23.1 | +5.8 ± 21.0 | 43.3% ± 17.5 | 54.0% ± 4.5 | +10.7 ± 14.5 |
| davidalves.Firebird 0.25 | hadur2.Hadur 3.14hjswthfgnk | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | - | 0.0% ± 0.0 | n/a |
| davidalves.Firebird 0.25 | hadur2.Hadur 3.14hjsw | 4 | 95.0% ± 15.9 | 97.5% ± 8.0 | +2.5 ± 8.0 | 0.0% | 0.0% ± 0.0 | +0.0 |
| davidalves.Phoenix 1.02 | hadur2.Hadur 3.14hjswthfgnk | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% ± 0.0 | - | n/a |
| davidalves.Phoenix 1.02 | hadur2.Hadur 3.14hjsw | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% ± 0.0 | - | n/a |
| dsekercioglu.mega.Raven 3.56j8 | hadur2.Hadur 3.14hjswthfgnk | 4 | 65.0% ± 30.5 | 65.6% ± 28.2 | +0.6 ± 35.7 | 40.4% ± 17.4 | 38.8% ± 7.9 | -1.6 ± 10.8 |
| dsekercioglu.mega.Raven 3.56j8 | hadur2.Hadur 3.14hjsw | 4 | 75.0% ± 30.5 | 67.5% ± 30.1 | -7.5 ± 50.9 | 45.7% ± 18.9 | 38.3% ± 13.1 | -7.4 ± 31.7 |
| dsekercioglu.mega.WhiteFang 2.8.1 | hadur2.Hadur 3.14hjswthfgnk | 4 | 90.0% ± 31.8 | 82.2% ± 14.8 | -7.8 ± 32.9 | 54.3% ± 9.6 | 58.8% ± 7.7 | +4.4 ± 8.5 |
| dsekercioglu.mega.WhiteFang 2.8.1 | hadur2.Hadur 3.14hjsw | 4 | 90.0% ± 18.4 | 87.5% ± 20.0 | -2.5 ± 30.1 | 57.5% ± 14.5 | 57.0% ± 10.8 | -0.5 ± 17.6 |
| florent.XSeries.X2 0.17 | hadur2.Hadur 3.14hjswthfgnk | 4 | 90.0% ± 18.4 | 70.0% ± 34.4 | -20.0 ± 29.1 | 48.2% ± 10.3 | 50.2% ± 17.3 | +2.1 ± 8.3 |
| florent.XSeries.X2 0.17 | hadur2.Hadur 3.14hjsw | 4 | 85.0% ± 15.9 | 77.5% ± 32.8 | -7.5 ± 23.9 | 52.9% ± 3.8 | 46.0% ± 15.6 | -6.8 ± 17.8 |
| florent.test.Toad 0.14t | hadur2.Hadur 3.14hjswthfgnk | 4 | 75.0% ± 30.5 | 75.0% ± 30.5 | +0.0 ± 31.8 | 44.3% ± 6.3 | 51.7% ± 9.6 | +7.4 ± 12.8 |
| florent.test.Toad 0.14t | hadur2.Hadur 3.14hjsw | 4 | 95.0% ± 15.9 | 67.5% ± 30.1 | -27.5 ± 39.8 | 44.5% ± 16.2 | 43.4% ± 6.6 | -1.2 ± 15.6 |
| fromHell.BlackBox 0.0.2 | hadur2.Hadur 3.14hjswthfgnk | 4 | 80.0% ± 26.0 | 80.0% ± 22.5 | +0.0 ± 39.0 | 55.9% ± 8.9 | 61.1% ± 5.2 | +5.2 ± 12.7 |
| fromHell.BlackBox 0.0.2 | hadur2.Hadur 3.14hjsw | 4 | 70.0% ± 31.8 | 87.5% ± 20.0 | +17.5 ± 15.2 | 47.5% ± 14.0 | 62.8% ± 10.5 | +15.3 ± 4.2 |
| fromHell.CHCl3 1.4.2 | hadur2.Hadur 3.14hjswthfgnk | 4 | 75.0% ± 15.9 | 87.2% ± 15.1 | +12.2 ± 15.4 | 56.7% ± 15.4 | 60.5% ± 11.5 | +3.7 ± 23.2 |
| fromHell.CHCl3 1.4.2 | hadur2.Hadur 3.14hjsw | 4 | 70.0% ± 31.8 | 85.0% ± 20.5 | +15.0 ± 33.1 | 50.5% ± 11.5 | 57.7% ± 8.3 | +7.2 ± 14.7 |
| gh.GresSuffurd 0.4.13 | hadur2.Hadur 3.14hjswthfgnk | 4 | 100.0% ± 0.0 | 64.7% ± 10.0 | -35.3 ± 10.0 | 58.7% ± 5.3 | 44.1% ± 21.4 | -14.6 ± 20.5 |
| gh.GresSuffurd 0.4.13 | hadur2.Hadur 3.14hjsw | 4 | 80.0% ± 45.0 | 60.6% ± 27.0 | -19.4 ± 51.8 | 47.0% ± 11.3 | 46.1% ± 9.9 | -0.8 ± 21.2 |
| jd.Nullstride 2.3.3 | hadur2.Hadur 3.14hjswthfgnk | 4 | 5.0% ± 15.9 | 25.6% ± 32.9 | +20.6 ± 34.4 | 40.0% ± 9.0 | 44.5% ± 7.7 | +4.5 ± 14.7 |
| jd.Nullstride 2.3.3 | hadur2.Hadur 3.14hjsw | 4 | 0.0% ± 0.0 | 13.1% ± 19.8 | +13.1 ± 19.8 | 35.8% ± 9.0 | 43.0% ± 10.5 | +7.2 ± 10.9 |
| jk.mega.DrussGT 3.1.16 | hadur2.Hadur 3.14hjswthfgnk | 4 | 50.0% ± 31.8 | 46.4% ± 34.7 | -3.6 ± 33.3 | 57.6% ± 11.4 | 42.1% ± 6.5 | -15.5 ± 15.9 |
| jk.mega.DrussGT 3.1.16 | hadur2.Hadur 3.14hjsw | 4 | 60.0% ± 26.0 | 43.9% ± 26.7 | -16.1 ± 50.9 | 59.2% ± 14.3 | 43.5% ± 5.9 | -15.8 ± 18.2 |
| jk.melee.Neuromancer 7.12 | hadur2.Hadur 3.14hjswthfgnk | 4 | 40.0% ± 26.0 | 69.2% ± 26.1 | +29.2 ± 35.3 | 54.7% ± 13.1 | 51.5% ± 14.4 | -3.3 ± 8.8 |
| jk.melee.Neuromancer 7.12 | hadur2.Hadur 3.14hjsw | 4 | 40.0% ± 36.7 | 66.4% ± 11.5 | +26.4 ± 31.5 | 52.8% ± 15.8 | 51.3% ± 2.2 | -1.5 ± 15.3 |
| jk.mini.CunobelinDC 1.2 | hadur2.Hadur 3.14hjswthfgnk | 4 | 95.0% ± 15.9 | 100.0% ± 0.0 | +5.0 ± 15.9 | 2.9% ± 7.1 | 3.1% ± 9.9 | +0.2 ± 3.1 |
| jk.mini.CunobelinDC 1.2 | hadur2.Hadur 3.14hjsw | 4 | 95.0% ± 15.9 | 100.0% ± 0.0 | +5.0 ± 15.9 | 0.2% ± 0.5 | 11.3% ± 7.8 | +11.2 ± 8.1 |
| jk.precise.Wintermute 0.8 | hadur2.Hadur 3.14hjswthfgnk | 4 | 95.0% ± 15.9 | 76.1% ± 10.2 | -18.9 ± 6.1 | 57.0% ± 13.9 | 52.5% ± 8.8 | -4.6 ± 5.6 |
| jk.precise.Wintermute 0.8 | hadur2.Hadur 3.14hjsw | 4 | 80.0% ± 45.0 | 84.7% ± 27.4 | +4.7 ± 67.1 | 45.6% ± 14.1 | 42.4% ± 18.3 | -3.2 ± 31.8 |
| kc.mega.BeepBoop 2.0 | hadur2.Hadur 3.14hjswthfgnk | 4 | 10.0% ± 18.4 | 27.5% ± 15.2 | +17.5 ± 8.0 | 37.3% ± 12.7 | 43.2% ± 8.3 | +5.9 ± 11.6 |
| kc.mega.BeepBoop 2.0 | hadur2.Hadur 3.14hjsw | 4 | 5.0% ± 15.9 | 17.8% ± 23.6 | +12.8 ± 19.9 | 35.9% ± 4.2 | 43.8% ± 8.4 | +7.9 ± 11.4 |
| kc.serpent.Hydra 0.21 | hadur2.Hadur 3.14hjswthfgnk | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | - | 0.0% | n/a |
| kc.serpent.Hydra 0.21 | hadur2.Hadur 3.14hjsw | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | - | - | n/a |
| kc.serpent.WaveSerpent 2.11 | hadur2.Hadur 3.14hjswthfgnk | 4 | 90.0% ± 18.4 | 72.2% ± 23.2 | -17.8 ± 32.0 | 51.2% ± 7.3 | 41.5% ± 0.7 | -9.7 ± 7.2 |
| kc.serpent.WaveSerpent 2.11 | hadur2.Hadur 3.14hjsw | 4 | 75.0% ± 15.9 | 56.9% ± 11.1 | -18.1 ± 18.2 | 48.7% ± 10.0 | 34.8% ± 3.0 | -13.8 ± 12.0 |
| lxx.Tomcat 3.68 | hadur2.Hadur 3.14hjswthfgnk | 4 | 75.0% ± 15.9 | 77.5% ± 8.0 | +2.5 ± 8.0 | 42.7% ± 8.3 | 48.1% ± 4.3 | +5.4 ± 11.7 |
| lxx.Tomcat 3.68 | hadur2.Hadur 3.14hjsw | 4 | 60.0% ± 36.7 | 66.1% ± 27.4 | +6.1 ± 63.1 | 42.1% ± 9.4 | 41.4% ± 4.9 | -0.7 ± 13.5 |
| mn.Combat 3.25.0 | hadur2.Hadur 3.14hjswthfgnk | 4 | 80.0% ± 45.0 | 77.5% ± 15.2 | -2.5 ± 57.2 | 49.6% ± 15.3 | 44.6% ± 6.3 | -5.0 ± 19.1 |
| mn.Combat 3.25.0 | hadur2.Hadur 3.14hjsw | 4 | 80.0% ± 26.0 | 60.0% ± 36.7 | -20.0 ± 58.1 | 46.9% ± 15.4 | 39.7% ± 7.0 | -7.2 ± 15.0 |
| mue.Ascendant 1.2.27 | hadur2.Hadur 3.14hjswthfgnk | 4 | 70.0% ± 41.1 | 83.9% ± 22.4 | +13.9 ± 37.5 | 47.9% ± 20.2 | 52.0% ± 14.0 | +4.1 ± 24.0 |
| mue.Ascendant 1.2.27 | hadur2.Hadur 3.14hjsw | 4 | 75.0% ± 15.9 | 85.0% ± 20.5 | +10.0 ± 22.5 | 48.2% ± 12.4 | 51.0% ± 7.0 | +2.8 ± 12.5 |
| oog.mega.saguaro.Saguaro 1.0 | hadur2.Hadur 3.14hjswthfgnk | 4 | 85.0% ± 15.9 | 87.5% ± 8.0 | +2.5 ± 15.2 | 90.4% ± 5.2 | 60.3% ± 7.2 | -30.1 ± 11.7 |
| oog.mega.saguaro.Saguaro 1.0 | hadur2.Hadur 3.14hjsw | 4 | 85.0% ± 15.9 | 84.4% ± 10.3 | -0.6 ± 13.1 | 93.1% ± 5.4 | 47.1% ± 12.2 | -46.0 ± 14.2 |
| pc.Wavelet 1.5 | hadur2.Hadur 3.14hjswthfgnk | 4 | 35.0% ± 30.5 | 69.2% ± 13.3 | +34.2 ± 39.8 | 59.5% ± 6.8 | 61.2% ± 19.8 | +1.7 ± 24.6 |
| pc.Wavelet 1.5 | hadur2.Hadur 3.14hjsw | 4 | 25.0% ± 40.0 | 72.5% ± 43.8 | +47.5 ± 81.5 | 60.3% ± 12.0 | 73.5% ± 33.4 | +13.2 ± 38.1 |
| pez.rumble.Ali 0.4.9 | hadur2.Hadur 3.14hjswthfgnk | 4 | 100.0% ± 0.0 | 90.0% ± 13.0 | -10.0 ± 13.0 | 0.0% ± 0.0 | 53.9% ± 9.1 | +53.9 ± 9.1 |
| pez.rumble.Ali 0.4.9 | hadur2.Hadur 3.14hjsw | 4 | 95.0% ± 15.9 | 85.0% ± 9.2 | -10.0 ± 22.5 | 0.0% ± 0.0 | 40.3% ± 6.2 | +40.3 ± 6.2 |
| pez.rumble.CassiusClay 2rho.02no | hadur2.Hadur 3.14hjswthfgnk | 4 | 35.0% ± 47.7 | 55.0% ± 27.6 | +20.0 ± 70.0 | 53.5% ± 18.0 | 58.3% ± 13.5 | +4.8 ± 31.0 |
| pez.rumble.CassiusClay 2rho.02no | hadur2.Hadur 3.14hjsw | 4 | 65.0% ± 47.7 | 70.0% ± 13.0 | +5.0 ± 37.9 | 56.1% ± 19.1 | 60.3% ± 8.0 | +4.2 ± 13.5 |
| pulsar.PulsarMax 0.8.9 | hadur2.Hadur 3.14hjswthfgnk | 4 | 90.0% ± 18.4 | 92.5% ± 15.2 | +2.5 ± 32.8 | 51.8% ± 13.4 | 47.3% ± 16.5 | -4.6 ± 3.6 |
| pulsar.PulsarMax 0.8.9 | hadur2.Hadur 3.14hjsw | 4 | 85.0% ± 30.5 | 66.1% ± 29.2 | -18.9 ± 20.3 | 47.2% ± 9.0 | 36.0% ± 6.7 | -11.2 ± 14.2 |
| rsalesc.mega.Knight 0.6.28 | hadur2.Hadur 3.14hjswthfgnk | 4 | 35.0% ± 30.5 | 60.6% ± 14.9 | +25.6 ± 34.2 | 57.7% ± 5.8 | 47.5% ± 8.0 | -10.1 ± 12.0 |
| rsalesc.mega.Knight 0.6.28 | hadur2.Hadur 3.14hjsw | 4 | 35.0% ± 15.9 | 61.9% ± 18.4 | +26.9 ± 13.7 | 52.4% ± 4.5 | 52.6% ± 5.5 | +0.1 ± 9.1 |
| rsalesc.roborio.Roborio 1.2.4 | hadur2.Hadur 3.14hjswthfgnk | 4 | 70.0% ± 18.4 | 52.5% ± 15.2 | -17.5 ± 20.0 | 72.8% ± 5.9 | 64.0% ± 11.4 | -8.8 ± 17.1 |
| rsalesc.roborio.Roborio 1.2.4 | hadur2.Hadur 3.14hjsw | 4 | 45.0% ± 15.9 | 69.4% ± 11.6 | +24.4 ± 19.2 | 70.9% ± 6.0 | 60.1% ± 11.2 | -10.7 ± 7.3 |
| sheldor.mini.FoilistMC 1.0 | hadur2.Hadur 3.14hjswthfgnk | 4 | 95.0% ± 15.9 | 92.2% ± 15.4 | -2.8 ± 27.4 | 58.7% ± 8.6 | 59.5% ± 8.5 | +0.8 ± 10.3 |
| sheldor.mini.FoilistMC 1.0 | hadur2.Hadur 3.14hjsw | 4 | 80.0% ± 26.0 | 95.0% ± 15.9 | +15.0 ± 30.5 | 51.5% ± 6.3 | 66.3% ± 18.5 | +14.7 ± 18.0 |
| sheldor.mini.Foilist 1.3.1 | hadur2.Hadur 3.14hjswthfgnk | 4 | 75.0% ± 15.9 | 83.9% ± 9.3 | +8.9 ± 22.5 | 48.1% ± 5.3 | 52.4% ± 8.2 | +4.3 ± 8.5 |
| sheldor.mini.Foilist 1.3.1 | hadur2.Hadur 3.14hjsw | 4 | 85.0% ± 15.9 | 80.0% ± 13.0 | -5.0 ± 9.2 | 52.0% ± 13.5 | 55.0% ± 8.7 | +3.0 ± 8.6 |
| voidious.Diamond 1.8.22 | hadur2.Hadur 3.14hjswthfgnk | 4 | 60.0% ± 26.0 | 52.2% ± 24.1 | -7.8 ± 44.0 | 41.7% ± 14.1 | 40.1% ± 3.6 | -1.6 ± 17.1 |
| voidious.Diamond 1.8.22 | hadur2.Hadur 3.14hjsw | 4 | 45.0% ± 15.9 | 51.1% ± 10.3 | +6.1 ± 24.2 | 36.0% ± 16.1 | 38.2% ± 6.2 | +2.2 ± 19.9 |
| voidious.Dookious 1.573c | hadur2.Hadur 3.14hjswthfgnk | 4 | 80.0% ± 36.7 | 80.0% ± 22.5 | +0.0 ± 50.3 | 45.4% ± 13.5 | 41.4% ± 11.5 | -4.0 ± 17.3 |
| voidious.Dookious 1.573c | hadur2.Hadur 3.14hjsw | 4 | 65.0% ± 47.7 | 76.1% ± 27.9 | +11.1 ± 41.5 | 43.7% ± 11.5 | 38.6% ± 11.3 | -5.2 ± 10.2 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | hadur2.Hadur 3.14hjswthfgnk | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 1.8% ± 4.3 | 8.6% ± 4.5 | +6.9 ± 3.6 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | hadur2.Hadur 3.14hjsw | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 3.6% ± 9.5 | 6.2% ± 6.0 | +2.6 ± 7.0 |
| xander.cat.XanderCat 12.9 | hadur2.Hadur 3.14hjswthfgnk | 4 | 75.0% ± 40.0 | 60.0% ± 29.1 | -15.0 ± 37.9 | 55.1% ± 22.3 | 50.6% ± 6.8 | -4.5 ± 19.8 |
| xander.cat.XanderCat 12.9 | hadur2.Hadur 3.14hjsw | 4 | 75.0% ± 30.5 | 62.2% ± 8.7 | -12.8 ± 30.5 | 52.3% ± 11.7 | 50.6% ± 10.2 | -1.7 ± 19.6 |
| zyx.mega.YersiniaPestis 3.0 | hadur2.Hadur 3.14hjswthfgnk | 4 | 75.0% ± 30.5 | 89.2% ± 0.9 | +14.2 ± 29.7 | 50.2% ± 18.1 | 51.0% ± 10.2 | +0.8 ± 17.7 |
| zyx.mega.YersiniaPestis 3.0 | hadur2.Hadur 3.14hjsw | 4 | 85.0% ± 15.9 | 68.1% ± 24.4 | -16.9 ± 29.9 | 48.4% ± 17.4 | 40.9% ± 5.8 | -7.5 ± 13.3 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| Krabb.sliNk.Garm 0.9u | +15.0 ± 30.5 | -3.3 ± 29.1 | +8.5 ± 8.0 | +5.5 ± 25.0 |
| aaa.r.ScalarR 0.005h.053-noshield | +25.0 ± 54.4 | -0.6 ± 21.7 | +8.8 ± 31.6 | -2.0 ± 9.2 |
| abc.Shadow 3.83c | +15.0 ± 47.7 | -0.3 ± 66.2 | +8.0 ± 18.7 | +5.8 ± 16.5 |
| ags.Midboss 1q.fast | +20.0 ± 45.0 | -18.6 ± 9.3 | +5.1 ± 20.7 | -6.2 ± 18.2 |
| ar.horizon.Horizon 1.2.2 | +5.0 ± 70.6 | +0.3 ± 34.8 | +8.1 ± 24.9 | +1.5 ± 15.6 |
| aw.Gilgalad 1.99.5c | +20.0 ± 82.2 | +6.4 ± 29.2 | +11.7 ± 32.9 | +4.4 ± 24.9 |
| axeBots.SilverSurfer 2.53.33fix | +10.0 ± 18.4 | -2.8 ± 15.1 | +1.9 ± 16.1 | -4.2 ± 20.1 |
| catcat20.Lambda 0.017 | -5.0 ± 15.9 | +10.0 ± 22.5 | +2.6 ± 17.9 | +12.6 ± 14.3 |
| cb.Domogled 1.2 | +10.0 ± 18.4 | +17.5 ± 39.8 | -4.5 ± 10.7 | +16.8 ± 7.9 |
| cb.fire.Firestarter 2.0f | -0.0 ± 26.0 | +27.5 ± 32.8 | +6.8 ± 16.7 | +4.0 ± 8.1 |
| cjm.chalk.Chalk 2.6.Be | +0.0 ± 0.0 | +2.5 ± 8.0 | n/a | n/a |
| cs.Nene 1.0.5 | +5.0 ± 30.5 | -10.0 ± 22.5 | +1.1 ± 15.0 | -5.2 ± 14.6 |
| cs.s2.Seraphim 2.3.1 | +0.0 ± 26.0 | +1.9 ± 26.8 | +0.7 ± 17.5 | -3.7 ± 25.9 |
| darkcanuck.Pris 0.92 | -5.0 ± 75.2 | -6.7 ± 24.9 | +0.7 ± 27.5 | -4.2 ± 15.9 |
| davidalves.Firebird 0.25 | +5.0 ± 15.9 | +2.5 ± 8.0 | n/a | +0.0 ± 0.0 |
| davidalves.Phoenix 1.02 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | n/a |
| dsekercioglu.mega.Raven 3.56j8 | -10.0 ± 41.1 | -1.9 ± 27.6 | -5.4 ± 21.2 | +0.4 ± 19.0 |
| dsekercioglu.mega.WhiteFang 2.8.1 | -0.0 ± 45.0 | -5.3 ± 20.3 | -3.1 ± 19.7 | +1.8 ± 7.0 |
| florent.XSeries.X2 0.17 | +5.0 ± 30.5 | -7.5 ± 20.0 | -4.7 ± 11.3 | +4.2 ± 12.5 |
| florent.test.Toad 0.14t | -20.0 ± 26.0 | +7.5 ± 41.8 | -0.3 ± 14.2 | +8.3 ± 14.2 |
| fromHell.BlackBox 0.0.2 | +10.0 ± 18.4 | -7.5 ± 35.3 | +8.4 ± 11.6 | -1.7 ± 12.6 |
| fromHell.CHCl3 1.4.2 | +5.0 ± 40.0 | +2.2 ± 35.1 | +6.2 ± 20.0 | +2.8 ± 15.9 |
| gh.GresSuffurd 0.4.13 | +20.0 ± 45.0 | +4.2 ± 28.9 | +11.7 ± 15.8 | -2.0 ± 25.8 |
| jd.Nullstride 2.3.3 | +5.0 ± 15.9 | +12.5 ± 25.1 | +4.2 ± 6.3 | +1.5 ± 4.1 |
| jk.mega.DrussGT 3.1.16 | -10.0 ± 55.1 | +2.5 ± 39.0 | -1.7 ± 16.1 | -1.4 ± 12.1 |
| jk.melee.Neuromancer 7.12 | +0.0 ± 45.0 | +2.8 ± 28.9 | +2.0 ± 27.1 | +0.2 ± 13.1 |
| jk.mini.CunobelinDC 1.2 | +0.0 ± 26.0 | +0.0 ± 0.0 | +2.7 ± 7.2 | -8.2 ± 6.8 |
| jk.precise.Wintermute 0.8 | +15.0 ± 47.7 | -8.6 ± 32.1 | +11.5 ± 20.7 | +10.1 ± 22.2 |
| kc.mega.BeepBoop 2.0 | +5.0 ± 30.5 | +9.7 ± 36.2 | +1.4 ± 13.6 | -0.6 ± 6.1 |
| kc.serpent.Hydra 0.21 | +0.0 ± 0.0 | +0.0 ± 0.0 | n/a | n/a |
| kc.serpent.WaveSerpent 2.11 | +15.0 ± 15.9 | +15.3 ± 25.9 | +2.5 ± 12.0 | +6.7 ± 2.4 |
| lxx.Tomcat 3.68 | +15.0 ± 30.5 | +11.4 ± 32.4 | +0.6 ± 16.5 | +6.7 ± 8.6 |
| mn.Combat 3.25.0 | +0.0 ± 58.1 | +17.5 ± 43.8 | +2.7 ± 15.3 | +4.9 ± 11.2 |
| mue.Ascendant 1.2.27 | -5.0 ± 30.5 | -1.1 ± 15.2 | -0.3 ± 29.1 | +1.0 ± 7.1 |
| oog.mega.saguaro.Saguaro 1.0 | +0.0 ± 26.0 | +3.1 ± 7.6 | -2.7 ± 10.4 | +13.2 ± 17.4 |
| pc.Wavelet 1.5 | +10.0 ± 60.9 | -3.3 ± 56.6 | -0.8 ± 14.8 | -12.3 ± 43.7 |
| pez.rumble.Ali 0.4.9 | +5.0 ± 15.9 | +5.0 ± 15.9 | +0.0 ± 0.0 | +13.5 ± 9.2 |
| pez.rumble.CassiusClay 2rho.02no | -30.0 ± 84.2 | -15.0 ± 30.5 | -2.6 ± 31.6 | -2.0 ± 10.1 |
| pulsar.PulsarMax 0.8.9 | +5.0 ± 40.0 | +26.4 ± 25.8 | +4.6 ± 15.6 | +11.2 ± 22.3 |
| rsalesc.mega.Knight 0.6.28 | -0.0 ± 26.0 | -1.4 ± 31.3 | +5.2 ± 8.8 | -5.0 ± 12.5 |
| rsalesc.roborio.Roborio 1.2.4 | +25.0 ± 15.9 | -16.9 ± 7.6 | +1.9 ± 2.6 | +3.9 ± 19.2 |
| sheldor.mini.FoilistMC 1.0 | +15.0 ± 30.5 | -2.8 ± 27.4 | +7.2 ± 14.5 | -6.8 ± 24.3 |
| sheldor.mini.Foilist 1.3.1 | -10.0 ± 18.4 | +3.9 ± 8.2 | -3.9 ± 15.5 | -2.5 ± 16.5 |
| voidious.Diamond 1.8.22 | +15.0 ± 40.0 | +1.1 ± 34.3 | +5.6 ± 27.8 | +1.8 ± 6.2 |
| voidious.Dookious 1.573c | +15.0 ± 83.7 | +3.9 ± 47.5 | +1.7 ± 24.2 | +2.9 ± 16.9 |
| wcsv.PowerHouse.PowerHouse 1.7e3 | +0.0 ± 0.0 | +0.0 ± 0.0 | -1.8 ± 5.5 | +2.5 ± 3.3 |
| xander.cat.XanderCat 12.9 | +0.0 ± 36.7 | -2.2 ± 31.5 | +2.8 ± 11.7 | -0.0 ± 16.0 |
| zyx.mega.YersiniaPestis 3.0 | -10.0 ± 18.4 | +21.1 ± 24.5 | +1.8 ± 27.8 | +10.1 ± 14.8 |
