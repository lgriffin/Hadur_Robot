# Bench: hadur2.Hadur 3.9sa (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 8704 over 728 battles (12.0 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | sweep-low | 79.8% ± 2.0 | 92.5% ± 3.8 | 60.8% ± 3.7 | 259 / 280 | 14.1% ± 1.6 | 6.2% ± 5.3 | 103 | 0 | 0.81 / 16.8 |
| KiraNL.Cataris 1.0 | sweep-low | 75.6% ± 4.1 | 90.7% ± 5.4 | 58.2% ± 2.3 | 254 / 280 | 18.0% ± 1.2 | 7.2% ± 2.0 | 107 | 0 | 0.99 / 155.8 |
| PkKillers.PkAssassin 1.0 | sweep-low | 84.5% ± 1.6 | 97.1% ± 2.6 | 69.2% ± 2.2 | 272 / 280 | 22.9% ± 5.4 | 6.5% ± 1.0 | 94 | 0 | 0.81 / 15.3 |
| alpha.BlackIce 1.0 | sweep-low | 75.1% ± 3.3 | 90.4% ± 3.6 | 57.3% ± 2.4 | 253 / 280 | 19.0% ± 2.3 | 6.0% ± 1.0 | 230 | 0 | 0.90 / 296.0 |
| amk.ChumbaMini 0.2 | sweep-low | 75.6% ± 2.9 | 91.4% ± 2.9 | 60.2% ± 2.9 | 256 / 280 | 17.6% ± 0.9 | 6.5% ± 0.8 | 97 | 0 | 0.89 / 14.1 |
| amk.ChumbaWumba 0.3 | sweep-low | 89.1% ± 3.8 | 97.5% ± 2.7 | 54.8% ± 4.1 | 273 / 280 | 10.8% ± 2.5 | 1.6% ± 0.6 | 89 | 0 | 0.57 / 15.7 |
| apc.botM 3.0 | sweep-low | 77.5% ± 3.1 | 91.1% ± 3.2 | 61.2% ± 4.7 | 255 / 280 | 16.0% ± 2.4 | 5.5% ± 0.4 | 114 | 0 | 0.89 / 16.3 |
| apv.NanoLauLectrik 1.0 | sweep-low | 72.3% ± 1.1 | 87.1% ± 2.2 | 57.0% ± 2.2 | 244 / 280 | 19.2% ± 1.6 | 6.8% ± 0.5 | 86 | 0 | 1.11 / 47.0 |
| apv.NanoLauLectrikTheCannibal 1.1 | sweep-low | 89.8% ± 2.8 | 97.1% ± 1.8 | 81.1% ± 3.7 | 272 / 280 | 89.7% ± 11.5 | 4.8% ± 0.9 | 91 | 0 | 0.70 / 14.1 |
| ary.nano.ColorNanoP 1.1 | sweep-low | 83.9% ± 1.4 | 99.3% ± 1.1 | 70.0% ± 1.5 | 278 / 280 | 27.0% ± 2.0 | 8.2% ± 0.6 | 88 | 0 | 0.84 / 14.2 |
| asm.Statistas 0.1 | sweep-low | 79.1% ± 1.8 | 96.0% ± 2.2 | 58.5% ± 1.4 | 269 / 280 | 13.1% ± 1.4 | 4.9% ± 0.4 | 104 | 0 | 0.91 / 14.9 |
| bigpete.Stewie 1.0 | sweep-low | 83.4% ± 1.9 | 93.5% ± 3.6 | 72.7% ± 1.4 | 262 / 280 | 20.8% ± 1.5 | 5.5% ± 0.6 | 93 | 0 | 0.82 / 16.5 |
| brainfade.melee.Dusk 0.44 | sweep-low | 93.0% ± 1.9 | 98.6% ± 1.3 | 53.0% ± 15.3 | 276 / 280 | 8.7% ± 3.8 | 0.7% ± 0.2 | 85 | 0 | 0.51 / 24.6 |
| buba.Archivist 0.1 | sweep-low | 89.0% ± 4.6 | 96.8% ± 3.2 | 52.0% ± 8.4 | 271 / 280 | 14.2% ± 2.9 | 1.6% ± 0.3 | 85 | 0 | 0.49 / 15.6 |
| bvh.mini.Fenrir 0.39 | sweep-low | 78.5% ± 3.1 | 92.1% ± 4.2 | 61.2% ± 3.0 | 258 / 280 | 39.0% ± 4.7 | 5.2% ± 0.7 | 98 | 0 | 0.79 / 85.9 |
| casey.Flee 1.0 | sweep-low | 90.9% ± 2.2 | 99.3% ± 1.1 | 57.7% ± 8.8 | 278 / 280 | 12.3% ± 1.6 | 2.1% ± 0.4 | 92 | 0 | 0.53 / 18.2 |
| csm.NthGeneration 0.04 | sweep-low | 89.5% ± 2.8 | 97.1% ± 1.8 | 64.0% ± 6.6 | 272 / 280 | 12.7% ± 3.1 | 3.6% ± 0.3 | 87 | 0 | 0.56 / 21.9 |
| demetrix.nano.Neutrino 0.27 | sweep-low | 74.4% ± 2.9 | 90.0% ± 4.6 | 58.8% ± 2.3 | 252 / 280 | 15.1% ± 1.2 | 7.5% ± 0.9 | 103 | 0 | 0.96 / 14.4 |
| dmp.nano.Eve 3.41 | sweep-low | 84.6% ± 0.8 | 93.2% ± 3.4 | 76.8% ± 1.9 | 261 / 280 | 40.5% ± 3.1 | 6.8% ± 1.2 | 88 | 0 | 0.79 / 40.5 |
| ds.OoV4 0.3b | sweep-low | 92.5% ± 2.5 | 98.9% ± 1.2 | 61.5% ± 11.1 | 277 / 280 | 9.1% ± 0.9 | 1.2% ± 0.2 | 94 | 0 | 0.59 / 24.6 |
| dsx724.VSAB_EP3a 1.0 | sweep-low | 95.8% ± 2.5 | 99.3% ± 1.1 | 70.5% ± 6.6 | 278 / 280 | 4.4% ± 1.9 | 0.8% ± 0.3 | 85 | 0 | 0.42 / 30.6 |
| dummy.micro.Sparrow 2.5 | sweep-low | 79.8% ± 2.7 | 93.2% ± 3.4 | 55.5% ± 3.1 | 261 / 280 | 18.8% ± 1.9 | 4.8% ± 0.3 | 93 | 0 | 0.63 / 18.3 |
| dy.LevelOne 2.0 | sweep-low | 83.0% ± 1.4 | 87.9% ± 2.1 | 78.6% ± 1.5 | 246 / 280 | 30.4% ± 2.3 | 6.8% ± 0.7 | 100 | 0 | 0.84 / 74.7 |
| dz.MostlyHarmlessNano 2.1 | sweep-low | 85.0% ± 2.6 | 96.4% ± 2.1 | 61.2% ± 4.0 | 270 / 280 | 15.4% ± 2.1 | 3.5% ± 0.8 | 93 | 0 | 0.74 / 20.0 |
| et.Predator 1.8 | sweep-low | 85.0% ± 5.2 | 96.1% ± 4.9 | 59.9% ± 3.6 | 269 / 280 | 16.2% ± 2.2 | 2.6% ± 0.6 | 110 | 0 | 0.87 / 20.9 |
| exauge.GateKeeper 1.1.121g | sweep-low | 74.1% ± 3.2 | 90.7% ± 4.7 | 55.6% ± 1.8 | 254 / 280 | 15.9% ± 1.7 | 6.9% ± 1.0 | 93 | 0 | 0.98 / 14.5 |
| fcr.First 1.0 | sweep-low | 87.0% ± 0.7 | 99.6% ± 0.8 | 77.9% ± 1.0 | 279 / 280 | 47.5% ± 2.3 | 15.7% ± 1.0 | 94 | 0 | 0.73 / 26.7 |
| fnc.bandit2002.Bandit2002 4.0.2 | sweep-low | 78.6% ± 1.8 | 90.7% ± 3.3 | 66.2% ± 1.8 | 254 / 280 | 21.1% ± 1.7 | 7.1% ± 1.0 | 93 | 0 | 0.82 / 17.9 |
| frag.FragBot 1.0 | sweep-low | 77.7% ± 3.6 | 89.6% ± 5.5 | 63.7% ± 2.0 | 251 / 280 | 21.9% ± 2.3 | 5.9% ± 0.3 | 101 | 0 | 0.87 / 16.3 |
| gh.nano.Grofvuil 0.2 | sweep-low | 93.1% ± 1.7 | 99.3% ± 1.1 | 71.8% ± 3.7 | 278 / 280 | 28.4% ± 4.3 | 1.9% ± 0.4 | 93 | 0 | 0.45 / 16.5 |
| gu.MicroScoob 1.3 | sweep-low | 82.7% ± 1.4 | 94.3% ± 3.4 | 67.2% ± 2.8 | 264 / 280 | 24.1% ± 2.0 | 4.5% ± 0.3 | 91 | 0 | 0.67 / 136.5 |
| ha2.T3 0.2 | sweep-low | 89.3% ± 2.3 | 97.1% ± 1.8 | 72.0% ± 4.9 | 272 / 280 | 22.6% ± 1.7 | 2.4% ± 0.6 | 94 | 0 | 0.57 / 85.8 |
| hamilton.Hamilton 1.0 | sweep-low | 83.3% ± 1.5 | 95.7% ± 2.6 | 64.2% ± 2.9 | 268 / 280 | 21.0% ± 3.4 | 7.2% ± 0.5 | 110 | 0 | 0.90 / 23.5 |
| ins.MobyNano 0.8 | sweep-low | 86.2% ± 4.3 | 97.5% ± 2.0 | 54.3% ± 3.1 | 273 / 280 | 18.4% ± 2.3 | 3.5% ± 0.8 | 84 | 0 | 0.86 / 16.6 |
| jp.Perpy 16.0 | sweep-low | 77.8% ± 6.1 | 87.5% ± 7.8 | 67.6% ± 4.4 | 245 / 280 | 22.2% ± 3.2 | 9.1% ± 1.5 | 105 | 0 | 0.85 / 18.1 |
| kawigi.nano.FunkyChicken 1.1 | sweep-low | 87.8% ± 2.9 | 97.9% ± 2.1 | 58.1% ± 4.6 | 274 / 280 | 17.3% ± 1.7 | 5.8% ± 4.1 | 87 | 0 | 0.63 / 16.2 |
| kawigi.sbf.Barracuda 1.0 | sweep-low | 85.6% ± 4.2 | 92.9% ± 3.4 | 59.9% ± 7.7 | 260 / 280 | 13.5% ± 3.3 | 4.6% ± 0.5 | 83 | 0 | 0.54 / 17.2 |
| kinsen.nano.Quarrelet 1.0 | sweep-low | 72.3% ± 2.8 | 86.4% ± 2.5 | 57.4% ± 2.6 | 242 / 280 | 20.2% ± 2.5 | 6.3% ± 1.0 | 97 | 0 | 0.99 / 14.2 |
| krzysiek.robbo2.Robbo 1.0.0 | sweep-low | 81.3% ± 1.5 | 94.6% ± 1.5 | 69.3% ± 1.6 | 265 / 280 | 28.2% ± 2.3 | 8.7% ± 1.0 | 88 | 0 | 0.82 / 217.8 |
| lechu.Ala 0.0.4 | sweep-low | 75.8% ± 2.8 | 84.3% ± 3.8 | 66.8% ± 2.3 | 236 / 280 | 18.9% ± 2.1 | 8.0% ± 1.0 | 116 | 0 | 1.44 / 17.0 |
| lessonz.robocode.Oz 0.5.0 | sweep-low | 84.4% ± 1.0 | 96.8% ± 1.5 | 69.7% ± 2.2 | 271 / 280 | 20.8% ± 2.5 | 5.4% ± 0.3 | 96 | 0 | 0.79 / 46.1 |
| lrem.magic.TormentedAngel Antiquitie | sweep-low | 87.1% ± 2.4 | 98.2% ± 1.8 | 43.1% ± 9.5 | 275 / 280 | 10.7% ± 1.8 | 1.9% ± 0.7 | 91 | 0 | 0.77 / 32.3 |
| lrem.micro.FalseProphet Alpha | sweep-low | 82.7% ± 1.6 | 97.9% ± 2.5 | 67.8% ± 2.8 | 274 / 280 | 81.2% ± 27.1 | 9.2% ± 2.0 | 91 | 0 | 0.85 / 13.7 |
| lrem.quickhack.QuickHack 1.0 | sweep-low | 88.6% ± 2.4 | 98.9% ± 1.2 | 47.1% ± 6.1 | 277 / 280 | 13.7% ± 2.4 | 4.1% ± 0.3 | 95 | 0 | 0.49 / 21.0 |
| mb.Monte 0.1.0 | sweep-low | 81.8% ± 1.8 | 92.9% ± 3.1 | 72.7% ± 1.4 | 260 / 280 | 27.2% ± 2.0 | 9.9% ± 1.2 | 94 | 0 | 0.82 / 12.2 |
| metal.small.MCool 1.21 | sweep-low | 94.1% ± 3.4 | 98.6% ± 1.8 | 66.2% ± 10.7 | 276 / 280 | 10.0% ± 1.3 | 0.7% ± 0.3 | 87 | 0 | 0.56 / 18.4 |
| mladjo.AIR 0.7 | sweep-low | 81.9% ± 2.4 | 95.4% ± 2.5 | 53.8% ± 3.9 | 267 / 280 | 11.9% ± 1.7 | 3.5% ± 0.7 | 91 | 0 | 0.78 / 18.1 |
| mladjo.Startko 1.0 | sweep-low | 86.1% ± 1.6 | 98.9% ± 1.2 | 42.7% ± 6.9 | 277 / 280 | 13.1% ± 1.4 | 2.6% ± 0.4 | 94 | 0 | 0.49 / 66.7 |
| mld.LittleBlackBook 1.69e | sweep-low | 87.9% ± 0.5 | 99.6% ± 0.8 | 79.4% ± 0.9 | 279 / 280 | 61.3% ± 3.2 | 15.0% ± 3.2 | 94 | 0 | 0.77 / 197.8 |
| mld.jdc.nano.LittleBlackBook 1.0 | sweep-low | 88.0% ± 0.4 | 100.0% ± 0.0 | 79.2% ± 0.7 | 280 / 280 | 61.7% ± 3.0 | 13.8% ± 1.3 | 90 | 0 | 0.74 / 232.6 |
| myl.micro.NekoNinja 1.30 | sweep-low | 93.8% ± 2.4 | 98.6% ± 1.8 | 75.2% ± 4.9 | 276 / 280 | 9.6% ± 2.6 | 0.9% ± 0.4 | 96 | 0 | 0.62 / 19.1 |
| myl.micro.Predator 1.50 | sweep-low | 85.7% ± 2.6 | 98.9% ± 1.2 | 61.5% ± 4.0 | 277 / 280 | 18.2% ± 1.1 | 2.7% ± 0.8 | 106 | 0 | 0.77 / 16.2 |
| mz.Adept 2.65 | sweep-low | 81.0% ± 3.9 | 91.8% ± 5.2 | 57.3% ± 6.7 | 257 / 280 | 29.2% ± 3.9 | 4.1% ± 1.1 | 84 | 0 | 0.71 / 17.2 |
| mz.AdeptBSB 1.03 | sweep-low | 90.3% ± 1.0 | 100.0% ± 0.0 | 37.7% ± 13.4 | 280 / 280 | 10.2% ± 3.3 | 1.7% ± 0.4 | 85 | 0 | 0.43 / 15.9 |
| nat.nano.Ocnirp 1.73 | sweep-low | 86.2% ± 2.8 | 98.2% ± 1.8 | 52.4% ± 2.3 | 275 / 280 | 14.3% ± 1.4 | 3.0% ± 0.7 | 77 | 0 | 0.82 / 16.5 |
| nat.nano.OcnirpPM 1.0 | sweep-low | 82.5% ± 4.7 | 95.0% ± 2.8 | 42.5% ± 8.3 | 266 / 280 | 14.6% ± 4.2 | 2.9% ± 1.6 | 89 | 0 | 0.89 / 19.0 |
| nova.Snow 1.0 | sweep-low | 78.2% ± 3.2 | 90.7% ± 5.1 | 65.2% ± 1.6 | 254 / 280 | 20.5% ± 1.1 | 7.5% ± 0.8 | 92 | 0 | 0.97 / 15.5 |
| pez.mini.Gouldingi 1.5 | sweep-low | 82.8% ± 5.7 | 96.1% ± 3.1 | 62.5% ± 4.7 | 269 / 280 | 14.6% ± 2.5 | 3.8% ± 1.3 | 94 | 0 | 0.87 / 15.9 |
| qwaker00.Ahchoo 1.6 | sweep-low | 85.3% ± 3.0 | 93.6% ± 3.1 | 66.2% ± 3.4 | 262 / 280 | 18.0% ± 1.9 | 2.2% ± 0.5 | 77 | 0 | 0.54 / 17.8 |
| ratosh.Nobo 0.21 | sweep-low | 80.6% ± 1.6 | 90.0% ± 2.6 | 70.8% ± 1.9 | 252 / 280 | 24.3% ± 4.4 | 5.7% ± 0.5 | 98 | 0 | 0.88 / 12.2 |
| rdt199.Warlord 0.73 | sweep-low | 84.8% ± 6.9 | 94.6% ± 6.4 | 66.3% ± 5.9 | 265 / 280 | 18.3% ± 1.1 | 5.8% ± 1.1 | 99 | 0 | 0.91 / 16.8 |
| rjw.RabidWombat 0.71 | sweep-low | 81.7% ± 2.7 | 91.4% ± 3.8 | 65.6% ± 3.1 | 256 / 280 | 29.1% ± 1.8 | 2.9% ± 0.5 | 103 | 0 | 0.65 / 359.5 |
| robar.nano.MosquitoPM 1.0 | sweep-low | 82.9% ± 4.3 | 93.2% ± 2.8 | 52.9% ± 8.5 | 261 / 280 | 14.2% ± 2.8 | 4.8% ± 4.9 | 106 | 0 | 0.85 / 335.7 |
| robar.nano.Prestige 1.0 | sweep-low | 74.2% ± 3.4 | 89.6% ± 3.6 | 46.0% ± 4.6 | 251 / 280 | 14.6% ± 1.0 | 4.4% ± 0.8 | 95 | 0 | 0.96 / 16.9 |
| robar.nano.Scytodes 0.3 | sweep-low | 92.2% ± 1.7 | 99.6% ± 0.8 | 75.9% ± 4.9 | 279 / 280 | 48.0% ± 3.3 | 2.1% ± 0.6 | 92 | 0 | 0.52 / 14.5 |
| robar.nano.Vespa 0.95 | sweep-low | 86.8% ± 1.2 | 99.3% ± 1.1 | 53.1% ± 3.8 | 278 / 280 | 20.2% ± 1.5 | 2.8% ± 0.5 | 87 | 0 | 0.79 / 20.6 |
| rsk1.RSK1 4.0 | sweep-low | 85.6% ± 3.7 | 94.3% ± 2.2 | 51.0% ± 7.8 | 264 / 280 | 12.9% ± 1.6 | 2.5% ± 1.5 | 85 | 0 | 0.86 / 16.7 |
| rtk.Tachikoma 1.0 | sweep-low | 84.3% ± 6.8 | 94.3% ± 6.1 | 56.4% ± 5.5 | 264 / 280 | 12.0% ± 1.8 | 3.3% ± 1.2 | 77 | 0 | 0.98 / 19.2 |
| rz.SmallDevil 1.502 | sweep-low | 92.5% ± 4.3 | 96.8% ± 3.0 | 72.8% ± 8.0 | 271 / 280 | 17.9% ± 1.7 | 3.1% ± 0.3 | 85 | 0 | 0.47 / 16.7 |
| satan.White 0.26 | sweep-low | 85.7% ± 1.5 | 98.6% ± 1.3 | 43.8% ± 6.6 | 276 / 280 | 13.4% ± 2.9 | 2.7% ± 0.7 | 86 | 0 | 0.57 / 18.6 |
| sheldor.nano.PointInLine 1.0 | sweep-low | 82.3% ± 3.5 | 95.0% ± 3.8 | 45.5% ± 4.3 | 266 / 280 | 14.9% ± 1.3 | 4.2% ± 3.4 | 162 | 0 | 0.77 / 101.6 |
| sheldor.nano.PointInLineRRAL 1.0.0 | sweep-low | 80.7% ± 2.5 | 93.6% ± 2.8 | 68.9% ± 2.6 | 262 / 280 | 22.0% ± 1.0 | 8.1% ± 0.9 | 106 | 0 | 0.88 / 13.6 |
| simonton.GFNano_D 3.1b | sweep-low | 84.5% ± 3.9 | 93.9% ± 2.0 | 62.3% ± 5.8 | 263 / 280 | 25.2% ± 3.7 | 3.1% ± 0.9 | 90 | 0 | 0.92 / 118.8 |
| simonton.nano.WeekendObsession_S 1.7 | sweep-low | 88.6% ± 2.6 | 97.1% ± 1.8 | 63.5% ± 4.0 | 272 / 280 | 21.3% ± 4.5 | 2.7% ± 0.7 | 82 | 0 | 0.65 / 17.4 |
| sm.Devil 7.3 | sweep-low | 83.4% ± 1.6 | 96.4% ± 2.1 | 60.0% ± 4.0 | 270 / 280 | 28.5% ± 5.3 | 4.1% ± 0.8 | 127 | 0 | 1.24 / 28.8 |
| spinnercat.CopyKat 1.2.3 | sweep-low | 89.0% ± 5.1 | 94.3% ± 3.1 | 73.1% ± 9.1 | 264 / 280 | 36.4% ± 5.5 | 2.1% ± 1.0 | 73 | 0 | 0.48 / 70.5 |
| spinnercat.Kitten 1.6 | sweep-low | 85.8% ± 3.5 | 96.4% ± 2.5 | 42.6% ± 8.1 | 270 / 280 | 11.4% ± 2.1 | 2.2% ± 0.7 | 81 | 0 | 0.71 / 14.4 |
| starpkg.StarViewerZ 1.26 | sweep-low | 94.5% ± 1.9 | 99.3% ± 1.1 | 61.2% ± 8.0 | 278 / 280 | 4.2% ± 1.2 | 0.8% ± 0.2 | 96 | 0 | 0.51 / 78.6 |
| stelo.MatchupMicro 1.2 | sweep-low | 82.5% ± 2.5 | 90.7% ± 3.3 | 71.0% ± 2.3 | 254 / 280 | 24.4% ± 5.3 | 3.6% ± 0.6 | 78 | 0 | 0.79 / 114.8 |
| stelo.PianistNano 1.3 | sweep-low | 85.0% ± 1.6 | 95.0% ± 1.7 | 46.0% ± 4.4 | 266 / 280 | 13.7% ± 2.3 | 2.0% ± 0.4 | 90 | 0 | 0.53 / 51.5 |
| stelo.SteloTestNano 1.0 | sweep-low | 91.2% ± 3.2 | 97.1% ± 2.2 | 68.9% ± 6.2 | 272 / 280 | 20.4% ± 2.0 | 1.5% ± 0.3 | 83 | 0 | 0.52 / 15.1 |
| suh.nano.RandomPM 1.02 | sweep-low | 83.0% ± 4.3 | 96.1% ± 2.5 | 37.3% ± 8.7 | 269 / 280 | 12.9% ± 4.9 | 2.9% ± 1.2 | 88 | 0 | 1.06 / 33.9 |
| syl.Centipede 0.5 | sweep-low | 96.6% ± 2.0 | 99.3% ± 1.1 | 78.1% ± 9.4 | 278 / 280 | 9.0% ± 1.4 | 0.7% ± 0.2 | 87 | 0 | 0.59 / 16.9 |
| tobe.Saturn lambda | sweep-low | 75.2% ± 1.8 | 87.5% ± 3.4 | 62.3% ± 2.5 | 245 / 280 | 18.3% ± 1.3 | 6.3% ± 0.5 | 108 | 0 | 0.94 / 15.8 |
| trab.nano.AinippeNano 1.3 | sweep-low | 79.8% ± 2.3 | 93.6% ± 3.8 | 66.3% ± 2.5 | 262 / 280 | 19.2% ± 1.5 | 8.3% ± 0.6 | 99 | 0 | 1.04 / 15.0 |
| tzu.TheArtOfWar 1.2 | sweep-low | 95.6% ± 4.5 | 98.9% ± 2.5 | 84.2% ± 7.5 | 277 / 280 | 18.3% ± 3.5 | 1.2% ± 0.5 | 101 | 0 | 0.54 / 83.7 |
| vuen.Fractal 0.55 | sweep-low | 96.3% ± 1.8 | 99.6% ± 0.8 | 87.6% ± 4.4 | 279 / 280 | 17.0% ± 1.1 | 0.7% ± 0.4 | 92 | 0 | 0.56 / 12.6 |
| whind.Constitution 0.7.1 | sweep-low | 76.8% ± 2.1 | 90.4% ± 2.8 | 63.4% ± 3.1 | 253 / 280 | 19.9% ± 4.4 | 6.9% ± 1.0 | 101 | 0 | 1.06 / 15.4 |
| wiki.mako.MakoHT 1.2.2.1 | sweep-low | 79.6% ± 1.6 | 90.4% ± 2.8 | 59.2% ± 9.6 | 253 / 280 | 17.6% ± 2.9 | 5.4% ± 0.4 | 86 | 0 | 0.83 / 17.1 |
| wiki.nano.RaikoNano 1.1 | sweep-low | 74.2% ± 1.2 | 93.9% ± 1.5 | 52.3% ± 3.6 | 263 / 280 | 11.4% ± 0.4 | 6.2% ± 0.5 | 116 | 0 | 1.01 / 16.5 |
| zen.Lindada 0.2 | sweep-low | 94.4% ± 2.1 | 99.6% ± 0.8 | 68.7% ± 8.1 | 279 / 280 | 10.0% ± 1.8 | 0.8% ± 0.3 | 84 | 0 | 0.51 / 19.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | 8 | 782 | 16.8% | 76.6% | 0.0% | 6.6% | 748 |
| KiraNL.Cataris 1.0 | 8 | 1080 | 15.0% | 78.2% | 0.0% | 6.7% | 704 |
| PkKillers.PkAssassin 1.0 | 8 | 683 | 7.3% | 89.7% | 0.0% | 3.0% | 703 |
| alpha.BlackIce 1.0 | 8 | 1080 | 15.6% | 77.6% | 0.0% | 6.8% | 710 |
| amk.ChumbaMini 0.2 | 8 | 1176 | 12.8% | 81.2% | 0.2% | 5.8% | 565 |
| amk.ChumbaWumba 0.3 | 8 | 296 | 14.8% | 79.0% | 0.7% | 5.5% | 721 |
| apc.botM 3.0 | 8 | 962 | 16.2% | 77.5% | 0.0% | 6.3% | 856 |
| apv.NanoLauLectrik 1.0 | 8 | 1286 | 17.5% | 74.7% | 0.0% | 7.8% | 562 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 447 | 11.2% | 82.6% | 0.0% | 6.2% | 603 |
| ary.nano.ColorNanoP 1.1 | 8 | 843 | 1.5% | 97.8% | 0.0% | 0.7% | 506 |
| asm.Statistas 0.1 | 8 | 876 | 7.8% | 88.4% | 0.1% | 3.6% | 671 |
| bigpete.Stewie 1.0 | 8 | 802 | 14.0% | 80.5% | 0.0% | 5.5% | 681 |
| brainfade.melee.Dusk 0.44 | 8 | 169 | 14.8% | 80.3% | 0.0% | 4.9% | 1461 |
| buba.Archivist 0.1 | 8 | 286 | 19.7% | 72.9% | 0.0% | 7.5% | 745 |
| bvh.mini.Fenrir 0.39 | 8 | 897 | 15.3% | 78.7% | 0.0% | 6.0% | 725 |
| casey.Flee 1.0 | 8 | 247 | 5.1% | 93.0% | 0.0% | 1.9% | 717 |
| csm.NthGeneration 0.04 | 8 | 303 | 16.5% | 77.7% | 0.0% | 5.8% | 984 |
| demetrix.nano.Neutrino 0.27 | 8 | 1217 | 14.4% | 79.2% | 0.2% | 6.2% | 701 |
| dmp.nano.Eve 3.41 | 8 | 824 | 14.4% | 79.6% | 0.0% | 6.0% | 431 |
| ds.OoV4 0.3b | 8 | 195 | 9.6% | 86.9% | 0.0% | 3.5% | 1521 |
| dsx724.VSAB_EP3a 1.0 | 8 | 103 | 12.2% | 82.1% | 0.0% | 5.7% | 2368 |
| dummy.micro.Sparrow 2.5 | 8 | 699 | 17.0% | 76.7% | 0.1% | 6.2% | 952 |
| dy.LevelOne 2.0 | 8 | 936 | 22.7% | 66.7% | 0.1% | 10.6% | 480 |
| dz.MostlyHarmlessNano 2.1 | 8 | 520 | 12.0% | 82.8% | 0.0% | 5.1% | 800 |
| et.Predator 1.8 | 8 | 501 | 13.7% | 80.8% | 0.0% | 5.5% | 851 |
| exauge.GateKeeper 1.1.121g | 8 | 1170 | 13.9% | 80.8% | 0.0% | 5.3% | 707 |
| fcr.First 1.0 | 8 | 836 | 0.7% | 98.8% | 0.1% | 0.4% | 385 |
| fnc.bandit2002.Bandit2002 4.0.2 | 8 | 1032 | 15.7% | 78.0% | 0.0% | 6.2% | 671 |
| frag.FragBot 1.0 | 8 | 974 | 18.6% | 74.2% | 0.0% | 7.2% | 693 |
| gh.nano.Grofvuil 0.2 | 8 | 199 | 6.3% | 92.2% | 0.0% | 1.5% | 1019 |
| gu.MicroScoob 1.3 | 8 | 706 | 14.2% | 80.2% | 0.1% | 5.6% | 591 |
| ha2.T3 0.2 | 8 | 346 | 14.5% | 80.3% | 0.0% | 5.2% | 723 |
| hamilton.Hamilton 1.0 | 8 | 648 | 11.6% | 84.0% | 0.0% | 4.4% | 958 |
| ins.MobyNano 0.8 | 8 | 424 | 10.3% | 85.8% | 0.0% | 3.9% | 774 |
| jp.Perpy 16.0 | 8 | 1069 | 20.5% | 71.5% | 0.3% | 7.7% | 965 |
| kawigi.nano.FunkyChicken 1.1 | 8 | 362 | 10.4% | 85.2% | 0.0% | 4.4% | 730 |
| kawigi.sbf.Barracuda 1.0 | 8 | 401 | 31.2% | 58.5% | 0.0% | 10.3% | 858 |
| kinsen.nano.Quarrelet 1.0 | 8 | 1249 | 19.0% | 72.5% | 0.0% | 8.5% | 560 |
| krzysiek.robbo2.Robbo 1.0.0 | 8 | 999 | 9.4% | 86.4% | 0.0% | 4.2% | 491 |
| lechu.Ala 0.0.4 | 8 | 1198 | 23.0% | 68.7% | 0.0% | 8.4% | 908 |
| lessonz.robocode.Oz 0.5.0 | 8 | 683 | 8.2% | 88.6% | 0.0% | 3.2% | 743 |
| lrem.magic.TormentedAngel Antiquitie | 8 | 358 | 8.7% | 88.3% | 0.0% | 2.9% | 893 |
| lrem.micro.FalseProphet Alpha | 8 | 873 | 4.3% | 93.5% | 0.0% | 2.2% | 613 |
| lrem.quickhack.QuickHack 1.0 | 8 | 308 | 6.1% | 91.8% | 0.0% | 2.1% | 1153 |
| mb.Monte 0.1.0 | 8 | 1048 | 11.9% | 82.4% | 0.8% | 4.9% | 488 |
| metal.small.MCool 1.21 | 8 | 148 | 16.9% | 76.2% | 0.2% | 6.7% | 770 |
| mladjo.AIR 0.7 | 8 | 597 | 13.6% | 81.4% | 0.1% | 4.9% | 843 |
| mladjo.Startko 1.0 | 8 | 393 | 4.8% | 93.0% | 0.1% | 2.1% | 843 |
| mld.LittleBlackBook 1.69e | 8 | 773 | 0.8% | 98.8% | 0.0% | 0.4% | 351 |
| mld.jdc.nano.LittleBlackBook 1.0 | 8 | 767 | 0.0% | 100.0% | 0.0% | 0.0% | 355 |
| myl.micro.NekoNinja 1.30 | 8 | 172 | 14.5% | 80.3% | 0.0% | 5.2% | 1033 |
| myl.micro.Predator 1.50 | 8 | 505 | 3.7% | 94.9% | 0.0% | 1.4% | 830 |
| mz.Adept 2.65 | 8 | 668 | 21.5% | 71.8% | 0.0% | 6.7% | 665 |
| mz.AdeptBSB 1.03 | 8 | 250 | 0.0% | 100.0% | 0.0% | 0.0% | 902 |
| nat.nano.Ocnirp 1.73 | 8 | 419 | 7.5% | 89.4% | 0.1% | 3.1% | 719 |
| nat.nano.OcnirpPM 1.0 | 8 | 534 | 16.4% | 77.0% | 0.0% | 6.6% | 720 |
| nova.Snow 1.0 | 8 | 1040 | 15.6% | 78.2% | 0.5% | 5.7% | 785 |
| pez.mini.Gouldingi 1.5 | 8 | 705 | 9.8% | 85.9% | 0.0% | 4.3% | 671 |
| qwaker00.Ahchoo 1.6 | 8 | 474 | 23.7% | 68.3% | 0.0% | 8.0% | 1013 |
| ratosh.Nobo 0.21 | 8 | 914 | 19.1% | 71.9% | 0.0% | 9.0% | 495 |
| rdt199.Warlord 0.73 | 8 | 586 | 16.0% | 77.5% | 0.1% | 6.4% | 748 |
| rjw.RabidWombat 0.71 | 8 | 660 | 22.7% | 68.6% | 0.2% | 8.4% | 649 |
| robar.nano.MosquitoPM 1.0 | 8 | 563 | 21.1% | 70.9% | 0.0% | 8.0% | 708 |
| robar.nano.Prestige 1.0 | 8 | 886 | 20.5% | 71.2% | 0.0% | 8.4% | 723 |
| robar.nano.Scytodes 0.3 | 8 | 259 | 2.4% | 96.6% | 0.0% | 1.0% | 626 |
| robar.nano.Vespa 0.95 | 8 | 400 | 3.1% | 95.8% | 0.0% | 1.1% | 732 |
| rsk1.RSK1 4.0 | 8 | 428 | 23.3% | 67.5% | 0.0% | 9.2% | 940 |
| rtk.Tachikoma 1.0 | 8 | 494 | 20.2% | 69.4% | 1.7% | 8.6% | 993 |
| rz.SmallDevil 1.502 | 8 | 201 | 28.0% | 62.5% | 0.0% | 9.5% | 849 |
| satan.White 0.26 | 8 | 414 | 6.0% | 91.4% | 0.0% | 2.6% | 882 |
| sheldor.nano.PointInLine 1.0 | 8 | 517 | 16.9% | 76.4% | 0.0% | 6.6% | 667 |
| sheldor.nano.PointInLineRRAL 1.0.0 | 8 | 989 | 11.4% | 83.2% | 0.0% | 5.4% | 568 |
| simonton.GFNano_D 3.1b | 8 | 497 | 21.4% | 70.7% | 0.1% | 7.9% | 649 |
| simonton.nano.WeekendObsession_S 1.7 | 8 | 334 | 15.0% | 79.6% | 0.1% | 5.3% | 803 |
| sm.Devil 7.3 | 8 | 588 | 10.6% | 85.2% | 0.0% | 4.1% | 1559 |
| spinnercat.CopyKat 1.2.3 | 8 | 324 | 30.9% | 58.3% | 0.2% | 10.6% | 737 |
| spinnercat.Kitten 1.6 | 8 | 396 | 15.8% | 78.0% | 0.0% | 6.2% | 740 |
| starpkg.StarViewerZ 1.26 | 8 | 138 | 9.1% | 87.2% | 0.0% | 3.7% | 1864 |
| stelo.MatchupMicro 1.2 | 8 | 708 | 22.9% | 69.2% | 0.0% | 7.8% | 1512 |
| stelo.PianistNano 1.3 | 8 | 404 | 21.7% | 69.8% | 0.0% | 8.5% | 697 |
| stelo.SteloTestNano 1.0 | 8 | 246 | 20.4% | 71.5% | 1.0% | 7.2% | 703 |
| suh.nano.RandomPM 1.02 | 8 | 506 | 13.6% | 80.9% | 0.0% | 5.5% | 812 |
| syl.Centipede 0.5 | 8 | 85 | 14.7% | 78.6% | 0.0% | 6.6% | 748 |
| tobe.Saturn lambda | 8 | 1163 | 18.8% | 73.7% | 0.0% | 7.5% | 616 |
| trab.nano.AinippeNano 1.3 | 8 | 998 | 11.3% | 83.6% | 0.0% | 5.1% | 656 |
| tzu.TheArtOfWar 1.2 | 8 | 134 | 14.0% | 80.7% | 0.0% | 5.3% | 818 |
| vuen.Fractal 0.55 | 8 | 115 | 5.4% | 92.1% | 0.0% | 2.5% | 726 |
| whind.Constitution 0.7.1 | 8 | 1121 | 15.1% | 78.1% | 0.0% | 6.8% | 683 |
| wiki.mako.MakoHT 1.2.2.1 | 8 | 789 | 21.4% | 70.7% | 0.0% | 7.9% | 710 |
| wiki.nano.RaikoNano 1.1 | 8 | 1131 | 9.4% | 86.5% | 0.0% | 4.1% | 892 |
| zen.Lindada 0.2 | 8 | 146 | 4.3% | 93.6% | 0.1% | 2.1% | 885 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | 8 | 6 | 912 | 0 | 0.37 | 0 | 0 | 0 |
| KiraNL.Cataris 1.0 | 8 | 5 | 824 | 0 | 0.38 | 1 | 1 | 0 |
| PkKillers.PkAssassin 1.0 | 8 | 7 | 66 | 0 | 0.34 | 0 | 0 | 0 |
| alpha.BlackIce 1.0 | 8 | 7 | 596 | 1 | 0.82 | 0 | 0 | 0 |
| amk.ChumbaMini 0.2 | 8 | 6 | 446 | 0 | 0.35 | 0 | 0 | 0 |
| amk.ChumbaWumba 0.3 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| apc.botM 3.0 | 8 | 8 | 0 | 0 | 0.41 | 0 | 0 | 0 |
| apv.NanoLauLectrik 1.0 | 8 | 7 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 7 | 35 | 0 | 0.33 | 0 | 0 | 0 |
| ary.nano.ColorNanoP 1.1 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| asm.Statistas 0.1 | 8 | 8 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| bigpete.Stewie 1.0 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| brainfade.melee.Dusk 0.44 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| buba.Archivist 0.1 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| bvh.mini.Fenrir 0.39 | 8 | 6 | 298 | 0 | 0.35 | 1 | 1 | 0 |
| casey.Flee 1.0 | 8 | 7 | 596 | 0 | 0.33 | 0 | 0 | 0 |
| csm.NthGeneration 0.04 | 8 | 7 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| demetrix.nano.Neutrino 0.27 | 8 | 8 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| dmp.nano.Eve 3.41 | 8 | 7 | 177 | 0 | 0.31 | 0 | 0 | 0 |
| ds.OoV4 0.3b | 8 | 7 | 298 | 0 | 0.34 | 0 | 0 | 0 |
| dsx724.VSAB_EP3a 1.0 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| dummy.micro.Sparrow 2.5 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| dy.LevelOne 2.0 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| dz.MostlyHarmlessNano 2.1 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| et.Predator 1.8 | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| exauge.GateKeeper 1.1.121g | 8 | 7 | 0 | 0 | 0.33 | 1 | 1 | 0 |
| fcr.First 1.0 | 8 | 6 | 596 | 0 | 0.34 | 0 | 0 | 0 |
| fnc.bandit2002.Bandit2002 4.0.2 | 8 | 7 | 0 | 0 | 0.33 | 1 | 1 | 0 |
| frag.FragBot 1.0 | 8 | 6 | 0 | 0 | 0.36 | 2 | 2 | 0 |
| gh.nano.Grofvuil 0.2 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| gu.MicroScoob 1.3 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| ha2.T3 0.2 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| hamilton.Hamilton 1.0 | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| ins.MobyNano 0.8 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| jp.Perpy 16.0 | 8 | 6 | 596 | 0 | 0.38 | 0 | 0 | 0 |
| kawigi.nano.FunkyChicken 1.1 | 8 | 6 | 778 | 0 | 0.31 | 0 | 0 | 0 |
| kawigi.sbf.Barracuda 1.0 | 8 | 7 | 0 | 0 | 0.30 | 1 | 1 | 0 |
| kinsen.nano.Quarrelet 1.0 | 8 | 7 | 0 | 0 | 0.35 | 1 | 0 | 0 |
| krzysiek.robbo2.Robbo 1.0.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| lechu.Ala 0.0.4 | 8 | 6 | 298 | 0 | 0.41 | 1 | 1 | 0 |
| lessonz.robocode.Oz 0.5.0 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| lrem.micro.FalseProphet Alpha | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| lrem.quickhack.QuickHack 1.0 | 8 | 7 | 14 | 0 | 0.34 | 0 | 0 | 0 |
| mb.Monte 0.1.0 | 8 | 7 | 298 | 0 | 0.34 | 0 | 0 | 0 |
| metal.small.MCool 1.21 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| mladjo.AIR 0.7 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| mladjo.Startko 1.0 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| mld.LittleBlackBook 1.69e | 8 | 6 | 838 | 0 | 0.34 | 0 | 0 | 0 |
| mld.jdc.nano.LittleBlackBook 1.0 | 8 | 7 | 298 | 0 | 0.32 | 0 | 0 | 0 |
| myl.micro.NekoNinja 1.30 | 8 | 7 | 298 | 0 | 0.34 | 0 | 0 | 0 |
| myl.micro.Predator 1.50 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| mz.Adept 2.65 | 8 | 7 | 298 | 0 | 0.30 | 0 | 0 | 0 |
| mz.AdeptBSB 1.03 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| nat.nano.Ocnirp 1.73 | 8 | 7 | 0 | 0 | 0.28 | 1 | 1 | 0 |
| nat.nano.OcnirpPM 1.0 | 8 | 7 | 285 | 0 | 0.32 | 0 | 0 | 0 |
| nova.Snow 1.0 | 8 | 7 | 0 | 0 | 0.33 | 1 | 1 | 0 |
| pez.mini.Gouldingi 1.5 | 8 | 7 | 0 | 0 | 0.34 | 1 | 1 | 0 |
| qwaker00.Ahchoo 1.6 | 8 | 7 | 0 | 0 | 0.28 | 1 | 1 | 0 |
| ratosh.Nobo 0.21 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| rdt199.Warlord 0.73 | 8 | 7 | 105 | 0 | 0.35 | 0 | 0 | 0 |
| rjw.RabidWombat 0.71 | 8 | 7 | 259 | 0 | 0.37 | 0 | 0 | 0 |
| robar.nano.MosquitoPM 1.0 | 8 | 7 | 502 | 0 | 0.38 | 0 | 0 | 0 |
| robar.nano.Prestige 1.0 | 8 | 7 | 0 | 0 | 0.34 | 1 | 1 | 0 |
| robar.nano.Scytodes 0.3 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| robar.nano.Vespa 0.95 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| rsk1.RSK1 4.0 | 8 | 6 | 526 | 0 | 0.30 | 1 | 1 | 0 |
| rtk.Tachikoma 1.0 | 8 | 7 | 0 | 0 | 0.28 | 1 | 1 | 0 |
| rz.SmallDevil 1.502 | 8 | 7 | 66 | 0 | 0.30 | 0 | 0 | 0 |
| satan.White 0.26 | 8 | 7 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| sheldor.nano.PointInLine 1.0 | 8 | 4 | 1069 | 1 | 0.58 | 0 | 0 | 0 |
| sheldor.nano.PointInLineRRAL 1.0.0 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| simonton.GFNano_D 3.1b | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 8 | 6 | 3 | 0 | 0.29 | 1 | 1 | 0 |
| sm.Devil 7.3 | 8 | 7 | 77 | 0 | 0.45 | 0 | 0 | 0 |
| spinnercat.CopyKat 1.2.3 | 8 | 7 | 0 | 0 | 0.26 | 1 | 1 | 0 |
| spinnercat.Kitten 1.6 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| stelo.MatchupMicro 1.2 | 8 | 3 | 1176 | 0 | 0.28 | 3 | 3 | 0 |
| stelo.PianistNano 1.3 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| stelo.SteloTestNano 1.0 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| suh.nano.RandomPM 1.02 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| syl.Centipede 0.5 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| tobe.Saturn lambda | 8 | 6 | 408 | 0 | 0.39 | 0 | 0 | 0 |
| trab.nano.AinippeNano 1.3 | 8 | 7 | 0 | 0 | 0.35 | 1 | 1 | 0 |
| tzu.TheArtOfWar 1.2 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| vuen.Fractal 0.55 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| whind.Constitution 0.7.1 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| wiki.mako.MakoHT 1.2.2.1 | 8 | 6 | 46 | 0 | 0.31 | 1 | 1 | 0 |
| wiki.nano.RaikoNano 1.1 | 8 | 7 | 0 | 0 | 0.41 | 1 | 1 | 0 |
| zen.Lindada 0.2 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |

657 of 728 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | 10276 | 155 | 10217 | 10217 (99.4%) | 59 (0.6%) | 0 (0.0%) | 147 | 96 | 39 |
| KiraNL.Cataris 1.0 | 9520 | 12 | 9476 | 9463 (99.4%) | 57 (0.6%) | 13 (0.1%) | 625 | 134 | 68 |
| PkKillers.PkAssassin 1.0 | 10013 | 17 | 10026 | 9980 (99.7%) | 33 (0.3%) | 46 (0.5%) | 922 | 163 | 37 |
| alpha.BlackIce 1.0 | 9235 | 282 | 9172 | 9171 (99.3%) | 64 (0.7%) | 1 (0.0%) | 206 | 99 | 64 |
| amk.ChumbaMini 0.2 | 6751 | 13 | 6723 | 6723 (99.6%) | 28 (0.4%) | 0 (0.0%) | 244 | 85 | 33 |
| amk.ChumbaWumba 0.3 | 9069 | 3 | 9069 | 9068 (100.0%) | 1 (0.0%) | 1 (0.0%) | 85 | 30 | 31 |
| apc.botM 3.0 | 13788 | 203 | 13769 | 13767 (99.8%) | 21 (0.2%) | 2 (0.0%) | 344 | 144 | 60 |
| apv.NanoLauLectrik 1.0 | 6596 | 13 | 6611 | 6594 (100.0%) | 2 (0.0%) | 17 (0.3%) | 625 | 126 | 25 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8052 | 180 | 8049 | 8048 (100.0%) | 4 (0.0%) | 1 (0.0%) | 551 | 74 | 48 |
| ary.nano.ColorNanoP 1.1 | 6126 | 14 | 6144 | 6122 (99.9%) | 4 (0.1%) | 22 (0.4%) | 401 | 114 | 32 |
| asm.Statistas 0.1 | 7472 | 23 | 7519 | 7466 (99.9%) | 6 (0.1%) | 53 (0.7%) | 264 | 90 | 44 |
| bigpete.Stewie 1.0 | 8299 | 17 | 8300 | 8299 (100.0%) | 0 (0.0%) | 1 (0.0%) | 457 | 111 | 30 |
| brainfade.melee.Dusk 0.44 | 26650 | 29 | 26655 | 26647 (100.0%) | 3 (0.0%) | 8 (0.0%) | 230 | 21 | 35 |
| buba.Archivist 0.1 | 10038 | 5 | 10066 | 10035 (100.0%) | 3 (0.0%) | 31 (0.3%) | 803 | 55 | 62 |
| bvh.mini.Fenrir 0.39 | 9473 | 10 | 9469 | 9454 (99.8%) | 19 (0.2%) | 15 (0.2%) | 267 | 78 | 33 |
| casey.Flee 1.0 | 9423 | 19 | 9474 | 9363 (99.4%) | 60 (0.6%) | 111 (1.2%) | 908 | 75 | 33 |
| csm.NthGeneration 0.04 | 15560 | 456 | 15560 | 15559 (100.0%) | 1 (0.0%) | 1 (0.0%) | 58 | 43 | 30 |
| demetrix.nano.Neutrino 0.27 | 10402 | 13 | 10402 | 10400 (100.0%) | 2 (0.0%) | 2 (0.0%) | 382 | 144 | 52 |
| dmp.nano.Eve 3.41 | 4424 | 27 | 4413 | 4410 (99.7%) | 14 (0.3%) | 3 (0.1%) | 275 | 101 | 28 |
| ds.OoV4 0.3b | 29116 | 47 | 29096 | 29093 (99.9%) | 23 (0.1%) | 3 (0.0%) | 193 | 54 | 41 |
| dsx724.VSAB_EP3a 1.0 | 50180 | 2 | 50146 | 50141 (99.9%) | 39 (0.1%) | 5 (0.0%) | 255 | 18 | 32 |
| dummy.micro.Sparrow 2.5 | 15466 | 319 | 15466 | 15466 (100.0%) | 0 (0.0%) | 0 (0.0%) | 56 | 69 | 34 |
| dy.LevelOne 2.0 | 6000 | 19 | 6000 | 6000 (100.0%) | 0 (0.0%) | 0 (0.0%) | 40 | 101 | 33 |
| dz.MostlyHarmlessNano 2.1 | 11958 | 11 | 11971 | 11956 (100.0%) | 2 (0.0%) | 15 (0.1%) | 279 | 74 | 47 |
| et.Predator 1.8 | 11516 | 9 | 11516 | 11515 (100.0%) | 1 (0.0%) | 1 (0.0%) | 168 | 52 | 50 |
| exauge.GateKeeper 1.1.121g | 8391 | 5 | 8473 | 8380 (99.9%) | 11 (0.1%) | 93 (1.1%) | 1175 | 130 | 53 |
| fcr.First 1.0 | 4205 | 29 | 4169 | 4160 (98.9%) | 45 (1.1%) | 9 (0.2%) | 111 | 191 | 35 |
| fnc.bandit2002.Bandit2002 4.0.2 | 8355 | 14 | 8355 | 8355 (100.0%) | 0 (0.0%) | 0 (0.0%) | 154 | 110 | 46 |
| frag.FragBot 1.0 | 9578 | 61 | 9576 | 9571 (99.9%) | 7 (0.1%) | 5 (0.1%) | 228 | 122 | 123 |
| gh.nano.Grofvuil 0.2 | 17099 | 2 | 17103 | 17098 (100.0%) | 1 (0.0%) | 5 (0.0%) | 99 | 32 | 35 |
| gu.MicroScoob 1.3 | 7048 | 13 | 7048 | 7048 (100.0%) | 0 (0.0%) | 0 (0.0%) | 74 | 57 | 38 |
| ha2.T3 0.2 | 9846 | 8 | 9848 | 9846 (100.0%) | 0 (0.0%) | 2 (0.0%) | 122 | 44 | 36 |
| hamilton.Hamilton 1.0 | 15693 | 20 | 15693 | 15684 (99.9%) | 9 (0.1%) | 9 (0.1%) | 443 | 117 | 55 |
| ins.MobyNano 0.8 | 11136 | 174 | 11190 | 11121 (99.9%) | 15 (0.1%) | 69 (0.6%) | 1468 | 142 | 41 |
| jp.Perpy 16.0 | 15842 | 16 | 16115 | 15803 (99.8%) | 39 (0.2%) | 312 (1.9%) | 357 | 145 | 40 |
| kawigi.nano.FunkyChicken 1.1 | 9849 | 237 | 9879 | 9789 (99.4%) | 60 (0.6%) | 90 (0.9%) | 948 | 90 | 28 |
| kawigi.sbf.Barracuda 1.0 | 12716 | 548 | 12715 | 12715 (100.0%) | 1 (0.0%) | 0 (0.0%) | 29 | 20 | 23 |
| kinsen.nano.Quarrelet 1.0 | 6623 | 19 | 6690 | 6612 (99.8%) | 11 (0.2%) | 78 (1.2%) | 908 | 127 | 40 |
| krzysiek.robbo2.Robbo 1.0.0 | 5462 | 14 | 5462 | 5462 (100.0%) | 0 (0.0%) | 0 (0.0%) | 38 | 123 | 33 |
| lechu.Ala 0.0.4 | 14343 | 17 | 14352 | 14327 (99.9%) | 16 (0.1%) | 25 (0.2%) | 680 | 168 | 65 |
| lessonz.robocode.Oz 0.5.0 | 10322 | 27 | 10321 | 10321 (100.0%) | 1 (0.0%) | 0 (0.0%) | 223 | 111 | 34 |
| lrem.magic.TormentedAngel Antiquitie | 13684 | 1 | 13684 | 13684 (100.0%) | 0 (0.0%) | 0 (0.0%) | 45 | 35 | 40 |
| lrem.micro.FalseProphet Alpha | 8495 | 12 | 8519 | 8455 (99.5%) | 40 (0.5%) | 64 (0.8%) | 487 | 140 | 50 |
| lrem.quickhack.QuickHack 1.0 | 19879 | 623 | 19878 | 19877 (100.0%) | 2 (0.0%) | 1 (0.0%) | 80 | 34 | 29 |
| mb.Monte 0.1.0 | 5860 | 27 | 5840 | 5840 (99.7%) | 20 (0.3%) | 0 (0.0%) | 286 | 130 | 30 |
| metal.small.MCool 1.21 | 10116 | 11 | 10116 | 10114 (100.0%) | 2 (0.0%) | 2 (0.0%) | 29 | 14 | 59 |
| mladjo.AIR 0.7 | 12896 | 16 | 12896 | 12896 (100.0%) | 0 (0.0%) | 0 (0.0%) | 94 | 53 | 33 |
| mladjo.Startko 1.0 | 12763 | 10 | 12816 | 12753 (99.9%) | 10 (0.1%) | 63 (0.5%) | 706 | 94 | 30 |
| mld.LittleBlackBook 1.69e | 3337 | 23 | 3291 | 3279 (98.3%) | 58 (1.7%) | 12 (0.4%) | 117 | 151 | 34 |
| mld.jdc.nano.LittleBlackBook 1.0 | 3417 | 20 | 3410 | 3396 (99.4%) | 21 (0.6%) | 14 (0.4%) | 150 | 147 | 37 |
| myl.micro.NekoNinja 1.30 | 15900 | 5 | 15893 | 15879 (99.9%) | 21 (0.1%) | 14 (0.1%) | 186 | 29 | 46 |
| myl.micro.Predator 1.50 | 10516 | 1 | 10535 | 10513 (100.0%) | 3 (0.0%) | 22 (0.2%) | 448 | 56 | 55 |
| mz.Adept 2.65 | 8240 | 13 | 8222 | 8222 (99.8%) | 18 (0.2%) | 0 (0.0%) | 122 | 40 | 28 |
| mz.AdeptBSB 1.03 | 13919 | 0 | 13919 | 13919 (100.0%) | 0 (0.0%) | 0 (0.0%) | 8 | 19 | 26 |
| nat.nano.Ocnirp 1.73 | 9584 | 24 | 9606 | 9546 (99.6%) | 38 (0.4%) | 60 (0.6%) | 1209 | 120 | 35 |
| nat.nano.OcnirpPM 1.0 | 9616 | 9 | 9610 | 9564 (99.5%) | 52 (0.5%) | 46 (0.5%) | 1220 | 106 | 29 |
| nova.Snow 1.0 | 12023 | 22 | 12023 | 12021 (100.0%) | 2 (0.0%) | 2 (0.0%) | 439 | 134 | 35 |
| pez.mini.Gouldingi 1.5 | 8565 | 16 | 8565 | 8565 (100.0%) | 0 (0.0%) | 0 (0.0%) | 208 | 87 | 36 |
| qwaker00.Ahchoo 1.6 | 15006 | 1 | 15006 | 15006 (100.0%) | 0 (0.0%) | 0 (0.0%) | 89 | 51 | 27 |
| ratosh.Nobo 0.21 | 5694 | 28 | 5696 | 5694 (100.0%) | 0 (0.0%) | 2 (0.0%) | 460 | 110 | 33 |
| rdt199.Warlord 0.73 | 10205 | 34 | 10199 | 10198 (99.9%) | 7 (0.1%) | 1 (0.0%) | 242 | 48 | 26 |
| rjw.RabidWombat 0.71 | 7805 | 8 | 7792 | 7788 (99.8%) | 17 (0.2%) | 4 (0.1%) | 50 | 45 | 44 |
| robar.nano.MosquitoPM 1.0 | 9453 | 12 | 9449 | 9424 (99.7%) | 29 (0.3%) | 25 (0.3%) | 737 | 93 | 64 |
| robar.nano.Prestige 1.0 | 9818 | 15 | 9839 | 9815 (100.0%) | 3 (0.0%) | 24 (0.2%) | 696 | 95 | 51 |
| robar.nano.Scytodes 0.3 | 7588 | 11 | 7647 | 7584 (99.9%) | 4 (0.1%) | 63 (0.8%) | 285 | 77 | 66 |
| robar.nano.Vespa 0.95 | 9985 | 18 | 10028 | 9981 (100.0%) | 4 (0.0%) | 47 (0.5%) | 585 | 51 | 56 |
| rsk1.RSK1 4.0 | 14171 | 6 | 14145 | 14140 (99.8%) | 31 (0.2%) | 5 (0.0%) | 187 | 53 | 55 |
| rtk.Tachikoma 1.0 | 16339 | 146 | 16343 | 16334 (100.0%) | 5 (0.0%) | 9 (0.1%) | 290 | 49 | 32 |
| rz.SmallDevil 1.502 | 12536 | 457 | 12531 | 12530 (100.0%) | 6 (0.0%) | 1 (0.0%) | 22 | 22 | 52 |
| satan.White 0.26 | 13392 | 102 | 13373 | 13372 (99.9%) | 20 (0.1%) | 1 (0.0%) | 39 | 30 | 70 |
| sheldor.nano.PointInLine 1.0 | 8197 | 9 | 8138 | 8119 (99.0%) | 78 (1.0%) | 19 (0.2%) | 1193 | 99 | 31 |
| sheldor.nano.PointInLineRRAL 1.0.0 | 7709 | 16 | 7725 | 7696 (99.8%) | 13 (0.2%) | 29 (0.4%) | 539 | 160 | 47 |
| simonton.GFNano_D 3.1b | 7967 | 12 | 8027 | 7958 (99.9%) | 9 (0.1%) | 69 (0.9%) | 531 | 75 | 34 |
| simonton.nano.WeekendObsession_S 1.7 | 11893 | 43 | 11980 | 11884 (99.9%) | 9 (0.1%) | 96 (0.8%) | 1264 | 109 | 59 |
| sm.Devil 7.3 | 31070 | 36 | 34437 | 31063 (100.0%) | 7 (0.0%) | 3374 (9.8%) | 639 | 192 | 68 |
| spinnercat.CopyKat 1.2.3 | 9918 | 3 | 9919 | 9916 (100.0%) | 2 (0.0%) | 3 (0.0%) | 290 | 45 | 63 |
| spinnercat.Kitten 1.6 | 9933 | 3 | 9977 | 9922 (99.9%) | 11 (0.1%) | 55 (0.6%) | 941 | 66 | 51 |
| starpkg.StarViewerZ 1.26 | 38212 | 23 | 38212 | 38212 (100.0%) | 0 (0.0%) | 0 (0.0%) | 123 | 20 | 64 |
| stelo.MatchupMicro 1.2 | 31364 | 21 | 36973 | 31271 (99.7%) | 93 (0.3%) | 5702 (15.4%) | 560 | 272 | 125 |
| stelo.PianistNano 1.3 | 8652 | 10 | 8673 | 8638 (99.8%) | 14 (0.2%) | 35 (0.4%) | 665 | 48 | 62 |
| stelo.SteloTestNano 1.0 | 8763 | 8 | 8763 | 8763 (100.0%) | 0 (0.0%) | 0 (0.0%) | 40 | 12 | 35 |
| suh.nano.RandomPM 1.02 | 12113 | 17 | 12140 | 12101 (99.9%) | 12 (0.1%) | 39 (0.3%) | 1308 | 133 | 77 |
| syl.Centipede 0.5 | 9017 | 3 | 9017 | 9017 (100.0%) | 0 (0.0%) | 0 (0.0%) | 18 | 12 | 27 |
| tobe.Saturn lambda | 6555 | 146 | 6535 | 6527 (99.6%) | 28 (0.4%) | 8 (0.1%) | 268 | 75 | 44 |
| trab.nano.AinippeNano 1.3 | 9636 | 56 | 9651 | 9621 (99.8%) | 15 (0.2%) | 30 (0.3%) | 1013 | 175 | 35 |
| tzu.TheArtOfWar 1.2 | 11708 | 1 | 12086 | 11708 (100.0%) | 0 (0.0%) | 378 (3.1%) | 43 | 29 | 33 |
| vuen.Fractal 0.55 | 7516 | 6 | 7516 | 7501 (99.8%) | 15 (0.2%) | 15 (0.2%) | 188 | 44 | 58 |
| whind.Constitution 0.7.1 | 9894 | 33 | 9899 | 9890 (100.0%) | 4 (0.0%) | 9 (0.1%) | 479 | 122 | 47 |
| wiki.mako.MakoHT 1.2.2.1 | 9908 | 274 | 9906 | 9905 (100.0%) | 3 (0.0%) | 1 (0.0%) | 104 | 67 | 49 |
| wiki.nano.RaikoNano 1.1 | 14189 | 93 | 14188 | 14186 (100.0%) | 3 (0.0%) | 2 (0.0%) | 789 | 143 | 58 |
| zen.Lindada 0.2 | 12423 | 7 | 12424 | 12422 (100.0%) | 1 (0.0%) | 2 (0.0%) | 82 | 31 | 82 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | 5669 | 6129 (108.1%) | 2613 |
| KiraNL.Cataris 1.0 | 6446 | 4208 (65.3%) | 1089 |
| PkKillers.PkAssassin 1.0 | 4448 | 6014 (135.2%) | 1886 |
| alpha.BlackIce 1.0 | 6564 | 4587 (69.9%) | 2310 |
| amk.ChumbaMini 0.2 | 7559 | 631 (8.3%) | 4474 |
| amk.ChumbaWumba 0.3 | 2284 | 8267 (362.0%) | 0 |
| apc.botM 3.0 | 8336 | 6156 (73.8%) | 4444 |
| apv.NanoLauLectrik 1.0 | 6783 | 1154 (17.0%) | 4475 |
| apv.NanoLauLectrikTheCannibal 1.1 | 2111 | 6114 (289.6%) | 667 |
| ary.nano.ColorNanoP 1.1 | 3945 | 2470 (62.6%) | 3024 |
| asm.Statistas 0.1 | 8328 | 1975 (23.7%) | 2545 |
| bigpete.Stewie 1.0 | 7265 | 2829 (38.9%) | 3972 |
| brainfade.melee.Dusk 0.44 | 3706 | 25189 (679.7%) | 417 |
| buba.Archivist 0.1 | 1345 | 9455 (703.0%) | 0 |
| bvh.mini.Fenrir 0.39 | 4933 | 4868 (98.7%) | 253 |
| casey.Flee 1.0 | 1957 | 8480 (433.3%) | 171 |
| csm.NthGeneration 0.04 | 2329 | 14446 (620.3%) | 537 |
| demetrix.nano.Neutrino 0.27 | 9887 | 1517 (15.3%) | 8766 |
| dmp.nano.Eve 3.41 | 3400 | 1280 (37.6%) | 730 |
| ds.OoV4 0.3b | 3514 | 27351 (778.3%) | 1482 |
| dsx724.VSAB_EP3a 1.0 | 1673 | 49101 (2934.9%) | 264 |
| dummy.micro.Sparrow 2.5 | 2738 | 13804 (504.2%) | 294 |
| dy.LevelOne 2.0 | 4260 | 1667 (39.1%) | 715 |
| dz.MostlyHarmlessNano 2.1 | 3204 | 9470 (295.6%) | 553 |
| et.Predator 1.8 | 4092 | 9620 (235.1%) | 0 |
| exauge.GateKeeper 1.1.121g | 8777 | 2177 (24.8%) | 1523 |
| fcr.First 1.0 | 3385 | 361 (10.7%) | 1668 |
| fnc.bandit2002.Bandit2002 4.0.2 | 5698 | 3893 (68.3%) | 1900 |
| frag.FragBot 1.0 | 4817 | 5450 (113.1%) | 1225 |
| gh.nano.Grofvuil 0.2 | 1138 | 16365 (1438.0%) | 167 |
| gu.MicroScoob 1.3 | 3113 | 4923 (158.1%) | 1423 |
| ha2.T3 0.2 | 2072 | 8785 (424.0%) | 337 |
| hamilton.Hamilton 1.0 | 4955 | 11262 (227.3%) | 1750 |
| ins.MobyNano 0.8 | 2253 | 9924 (440.5%) | 117 |
| jp.Perpy 16.0 | 5790 | 10758 (185.8%) | 3371 |
| kawigi.nano.FunkyChicken 1.1 | 2043 | 8792 (430.3%) | 89 |
| kawigi.sbf.Barracuda 1.0 | 2106 | 11483 (545.3%) | 0 |
| kinsen.nano.Quarrelet 1.0 | 6427 | 1393 (21.7%) | 878 |
| krzysiek.robbo2.Robbo 1.0.0 | 4173 | 1692 (40.5%) | 689 |
| lechu.Ala 0.0.4 | 9180 | 6273 (68.3%) | 6720 |
| lessonz.robocode.Oz 0.5.0 | 5691 | 5159 (90.7%) | 4263 |
| lrem.magic.TormentedAngel Antiquitie | 2182 | 12252 (561.5%) | 293 |
| lrem.micro.FalseProphet Alpha | 3508 | 4246 (121.0%) | 1238 |
| lrem.quickhack.QuickHack 1.0 | 1523 | 18647 (1224.4%) | 43 |
| mb.Monte 0.1.0 | 5576 | 629 (11.3%) | 3984 |
| metal.small.MCool 1.21 | 1888 | 9726 (515.1%) | 0 |
| mladjo.AIR 0.7 | 3206 | 10433 (325.4%) | 467 |
| mladjo.Startko 1.0 | 1082 | 11958 (1105.2%) | 0 |
| mld.LittleBlackBook 1.69e | 2694 | 478 (17.7%) | 0 |
| mld.jdc.nano.LittleBlackBook 1.0 | 2654 | 602 (22.7%) | 310 |
| myl.micro.NekoNinja 1.30 | 3638 | 14712 (404.4%) | 0 |
| myl.micro.Predator 1.50 | 5874 | 6506 (110.8%) | 193 |
| mz.Adept 2.65 | 2306 | 6836 (296.4%) | 551 |
| mz.AdeptBSB 1.03 | 825 | 13405 (1624.8%) | 0 |
| nat.nano.Ocnirp 1.73 | 2481 | 7917 (319.1%) | 328 |
| nat.nano.OcnirpPM 1.0 | 2559 | 7782 (304.1%) | 651 |
| nova.Snow 1.0 | 8134 | 4307 (53.0%) | 4195 |
| pez.mini.Gouldingi 1.5 | 6402 | 3311 (51.7%) | 1181 |
| qwaker00.Ahchoo 1.6 | 3382 | 13029 (385.2%) | 0 |
| ratosh.Nobo 0.21 | 5623 | 821 (14.6%) | 1273 |
| rdt199.Warlord 0.73 | 4025 | 7238 (179.8%) | 899 |
| rjw.RabidWombat 0.71 | 2228 | 6890 (309.2%) | 42 |
| robar.nano.MosquitoPM 1.0 | 2415 | 7763 (321.4%) | 0 |
| robar.nano.Prestige 1.0 | 3729 | 7058 (189.3%) | 538 |
| robar.nano.Scytodes 0.3 | 1282 | 6764 (527.6%) | 0 |
| robar.nano.Vespa 0.95 | 1567 | 8989 (573.6%) | 3 |
| rsk1.RSK1 4.0 | 2571 | 12610 (490.5%) | 0 |
| rtk.Tachikoma 1.0 | 3293 | 14178 (430.5%) | 703 |
| rz.SmallDevil 1.502 | 1505 | 11958 (794.6%) | 171 |
| satan.White 0.26 | 1220 | 12496 (1024.3%) | 159 |
| sheldor.nano.PointInLine 1.0 | 2455 | 6845 (278.8%) | 32 |
| sheldor.nano.PointInLineRRAL 1.0.0 | 5452 | 2225 (40.8%) | 1373 |
| simonton.GFNano_D 3.1b | 1995 | 7021 (351.9%) | 7 |
| simonton.nano.WeekendObsession_S 1.7 | 1919 | 10779 (561.7%) | 417 |
| sm.Devil 7.3 | 7718 | 23107 (299.4%) | 4173 |
| spinnercat.CopyKat 1.2.3 | 1209 | 9314 (770.4%) | 48 |
| spinnercat.Kitten 1.6 | 1826 | 8975 (491.5%) | 109 |
| starpkg.StarViewerZ 1.26 | 2481 | 37010 (1491.7%) | 599 |
| stelo.MatchupMicro 1.2 | 5776 | 25112 (434.8%) | 3725 |
| stelo.PianistNano 1.3 | 1782 | 7930 (445.0%) | 0 |
| stelo.SteloTestNano 1.0 | 1536 | 8244 (536.7%) | 0 |
| suh.nano.RandomPM 1.02 | 2684 | 10228 (381.1%) | 454 |
| syl.Centipede 0.5 | 2573 | 8561 (332.7%) | 0 |
| tobe.Saturn lambda | 6780 | 1994 (29.4%) | 3718 |
| trab.nano.AinippeNano 1.3 | 7243 | 2708 (37.4%) | 1011 |
| tzu.TheArtOfWar 1.2 | 2333 | 10831 (464.3%) | 105 |
| vuen.Fractal 0.55 | 3533 | 7149 (202.3%) | 0 |
| whind.Constitution 0.7.1 | 9144 | 1568 (17.1%) | 2496 |
| wiki.mako.MakoHT 1.2.2.1 | 4466 | 6151 (137.7%) | 0 |
| wiki.nano.RaikoNano 1.1 | 15593 | 1243 (8.0%) | 11798 |
| zen.Lindada 0.2 | 2971 | 11699 (393.8%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | 650 | 427 | 522 | 598 | 27.4 / 17.1 | 707 | 3336 | 17 |
| KiraNL.Cataris 1.0 | 650 | 462 | 541 | 554 | 33.6 / 24.1 | 1419 | 2680 | 2248 |
| PkKillers.PkAssassin 1.0 | 650 | 420 | 434 | 553 | 40.0 / 17.5 | 1946 | 2439 | 1386 |
| alpha.BlackIce 1.0 | 650 | 331 | 619 | 560 | 32.2 / 23.9 | 739 | 3359 | 1 |
| amk.ChumbaMini 0.2 | 650 | 447 | 494 | 415 | 41.1 / 27.3 | 1837 | 4631 | 2992 |
| amk.ChumbaWumba 0.3 | 650 | 433 | 650 | 571 | 8.0 / 6.7 | 48 | 546 | 592 |
| apc.botM 3.0 | 650 | 402 | 569 | 706 | 34.2 / 21.3 | 1116 | 2613 | 1860 |
| apv.NanoLauLectrik 1.0 | 650 | 454 | 572 | 411 | 36.5 / 27.4 | 1596 | 4784 | 3430 |
| apv.NanoLauLectrikTheCannibal 1.1 | 650 | 345 | 416 | 453 | 44.8 / 10.6 | 690 | 866 | 195 |
| ary.nano.ColorNanoP 1.1 | 650 | 287 | 522 | 356 | 54.9 / 23.6 | 2653 | 4274 | 1233 |
| asm.Statistas 0.1 | 650 | 464 | 553 | 521 | 31.3 / 22.1 | 578 | 4045 | 4 |
| bigpete.Stewie 1.0 | 650 | 401 | 400 | 531 | 49.2 / 18.4 | 2937 | 2943 | 478 |
| brainfade.melee.Dusk 0.44 | 650 | 454 | 650 | 1311 | 5.4 / 3.9 | 0 | 389 | 62 |
| buba.Archivist 0.1 | 650 | 368 | 625 | 595 | 6.4 / 6.0 | 26 | 424 | 353 |
| bvh.mini.Fenrir 0.39 | 650 | 401 | 531 | 576 | 32.1 / 20.2 | 1269 | 2059 | 90 |
| casey.Flee 1.0 | 650 | 392 | 650 | 567 | 9.1 / 6.6 | 59 | 1091 | 695 |
| csm.NthGeneration 0.04 | 650 | 456 | 619 | 834 | 12.1 / 6.7 | 165 | 880 | 1332 |
| demetrix.nano.Neutrino 0.27 | 650 | 425 | 588 | 551 | 39.4 / 27.6 | 1339 | 3912 | 3277 |
| dmp.nano.Eve 3.41 | 650 | 398 | 400 | 281 | 61.6 / 18.7 | 2233 | 3506 | 1398 |
| ds.OoV4 0.3b | 650 | 474 | 631 | 1371 | 8.3 / 4.9 | 52 | 305 | 127 |
| dsx724.VSAB_EP3a 1.0 | 650 | 339 | 619 | 2218 | 5.5 / 2.4 | 64 | 381 | 84 |
| dummy.micro.Sparrow 2.5 | 650 | 362 | 594 | 802 | 19.3 / 15.3 | 631 | 1067 | 551 |
| dy.LevelOne 2.0 | 650 | 325 | 400 | 330 | 65.4 / 17.8 | 2315 | 6877 | 401 |
| dz.MostlyHarmlessNano 2.1 | 650 | 410 | 503 | 650 | 20.3 / 12.3 | 720 | 1007 | 773 |
| et.Predator 1.8 | 650 | 517 | 597 | 701 | 17.0 / 11.6 | 323 | 906 | 124 |
| exauge.GateKeeper 1.1.121g | 650 | 491 | 634 | 555 | 33.9 / 27.0 | 811 | 2931 | 1305 |
| fcr.First 1.0 | 650 | 252 | 400 | 235 | 82.9 / 23.6 | 2397 | 2439 | 712 |
| fnc.bandit2002.Bandit2002 4.0.2 | 650 | 315 | 503 | 521 | 45.3 / 23.0 | 2562 | 2623 | 1200 |
| frag.FragBot 1.0 | 650 | 342 | 488 | 544 | 36.4 / 20.7 | 1611 | 2258 | 664 |
| gh.nano.Grofvuil 0.2 | 650 | 203 | 650 | 869 | 13.5 / 5.2 | 150 | 456 | 0 |
| gu.MicroScoob 1.3 | 650 | 349 | 466 | 441 | 33.3 / 16.2 | 1483 | 2866 | 1138 |
| ha2.T3 0.2 | 650 | 357 | 525 | 573 | 20.0 / 7.9 | 444 | 1024 | 310 |
| hamilton.Hamilton 1.0 | 650 | 325 | 597 | 808 | 28.5 / 15.6 | 1047 | 2016 | 722 |
| ins.MobyNano 0.8 | 650 | 387 | 650 | 624 | 12.1 / 10.4 | 128 | 949 | 1122 |
| jp.Perpy 16.0 | 650 | 360 | 588 | 815 | 45.2 / 21.8 | 2573 | 2227 | 112 |
| kawigi.nano.FunkyChicken 1.1 | 650 | 377 | 650 | 580 | 12.3 / 8.8 | 119 | 1260 | 963 |
| kawigi.sbf.Barracuda 1.0 | 650 | 297 | 422 | 708 | 10.2 / 6.7 | 141 | 1136 | 1842 |
| kinsen.nano.Quarrelet 1.0 | 650 | 476 | 463 | 411 | 34.4 / 25.9 | 1274 | 4415 | 3259 |
| krzysiek.robbo2.Robbo 1.0.0 | 650 | 267 | 431 | 341 | 55.9 / 24.7 | 2772 | 3385 | 902 |
| lechu.Ala 0.0.4 | 650 | 430 | 525 | 758 | 47.4 / 23.5 | 2797 | 1975 | 3 |
| lessonz.robocode.Oz 0.5.0 | 650 | 435 | 453 | 593 | 40.1 / 17.3 | 2130 | 2442 | 1217 |
| lrem.magic.TormentedAngel Antiquitie | 650 | 419 | 650 | 743 | 8.0 / 9.0 | 34 | 1143 | 619 |
| lrem.micro.FalseProphet Alpha | 650 | 248 | 525 | 463 | 50.7 / 23.3 | 2226 | 2351 | 1036 |
| lrem.quickhack.QuickHack 1.0 | 650 | 249 | 650 | 1003 | 7.2 / 8.1 | 109 | 1203 | 1649 |
| mb.Monte 0.1.0 | 650 | 346 | 400 | 338 | 65.6 / 24.7 | 3601 | 3280 | 1217 |
| metal.small.MCool 1.21 | 650 | 454 | 650 | 620 | 5.6 / 3.2 | 1 | 226 | 122 |
| mladjo.AIR 0.7 | 650 | 423 | 622 | 693 | 16.6 / 13.9 | 395 | 1749 | 1089 |
| mladjo.Startko 1.0 | 650 | 227 | 650 | 693 | 8.3 / 10.4 | 108 | 349 | 102 |
| mld.LittleBlackBook 1.69e | 650 | 302 | 400 | 201 | 84.2 / 21.8 | 1701 | 2221 | 561 |
| mld.jdc.nano.LittleBlackBook 1.0 | 650 | 303 | 400 | 205 | 83.6 / 21.9 | 1712 | 2305 | 561 |
| myl.micro.NekoNinja 1.30 | 650 | 480 | 650 | 883 | 11.1 / 4.0 | 4 | 592 | 18 |
| myl.micro.Predator 1.50 | 650 | 542 | 563 | 680 | 21.7 / 13.7 | 233 | 1244 | 260 |
| mz.Adept 2.65 | 650 | 241 | 616 | 515 | 20.4 / 13.7 | 741 | 1131 | 661 |
| mz.AdeptBSB 1.03 | 650 | 219 | 650 | 752 | 5.2 / 7.1 | 16 | 276 | 77 |
| nat.nano.Ocnirp 1.73 | 650 | 389 | 650 | 569 | 11.8 / 10.7 | 131 | 1199 | 1106 |
| nat.nano.OcnirpPM 1.0 | 650 | 400 | 650 | 570 | 9.7 / 11.7 | 179 | 675 | 901 |
| nova.Snow 1.0 | 650 | 335 | 619 | 633 | 43.6 / 23.2 | 2123 | 2565 | 1728 |
| pez.mini.Gouldingi 1.5 | 650 | 493 | 553 | 520 | 27.6 / 17.3 | 679 | 4246 | 0 |
| qwaker00.Ahchoo 1.6 | 650 | 338 | 603 | 863 | 18.3 / 9.3 | 379 | 547 | 0 |
| ratosh.Nobo 0.21 | 650 | 438 | 400 | 345 | 45.4 / 18.8 | 2298 | 6453 | 672 |
| rdt199.Warlord 0.73 | 650 | 349 | 563 | 598 | 23.7 / 13.0 | 964 | 1354 | 98 |
| rjw.RabidWombat 0.71 | 650 | 310 | 594 | 499 | 25.0 / 12.9 | 436 | 1183 | 0 |
| robar.nano.MosquitoPM 1.0 | 650 | 393 | 563 | 558 | 15.3 / 11.4 | 607 | 928 | 610 |
| robar.nano.Prestige 1.0 | 650 | 375 | 650 | 573 | 15.9 / 18.0 | 436 | 1615 | 1215 |
| robar.nano.Scytodes 0.3 | 650 | 313 | 619 | 476 | 22.3 / 7.1 | 41 | 411 | 151 |
| robar.nano.Vespa 0.95 | 650 | 298 | 650 | 582 | 12.8 / 11.0 | 224 | 1503 | 413 |
| rsk1.RSK1 4.0 | 650 | 390 | 619 | 791 | 10.5 / 8.3 | 199 | 552 | 687 |
| rtk.Tachikoma 1.0 | 650 | 445 | 650 | 843 | 12.6 / 9.8 | 262 | 942 | 280 |
| rz.SmallDevil 1.502 | 650 | 373 | 644 | 699 | 9.5 / 3.6 | 93 | 461 | 279 |
| satan.White 0.26 | 650 | 209 | 603 | 732 | 9.1 / 10.8 | 142 | 621 | 78 |
| sheldor.nano.PointInLine 1.0 | 650 | 391 | 650 | 517 | 9.5 / 11.3 | 49 | 802 | 959 |
| sheldor.nano.PointInLineRRAL 1.0.0 | 650 | 346 | 481 | 418 | 52.4 / 23.5 | 3163 | 4057 | 1617 |
| simonton.GFNano_D 3.1b | 650 | 292 | 628 | 499 | 16.0 / 10.0 | 205 | 879 | 406 |
| simonton.nano.WeekendObsession_S 1.7 | 650 | 384 | 619 | 653 | 13.0 / 7.6 | 108 | 1061 | 287 |
| sm.Devil 7.3 | 650 | 508 | 600 | 1409 | 22.3 / 14.3 | 381 | 2246 | 883 |
| spinnercat.CopyKat 1.2.3 | 650 | 355 | 619 | 587 | 13.2 / 5.4 | 63 | 423 | 169 |
| spinnercat.Kitten 1.6 | 650 | 376 | 650 | 590 | 7.2 / 8.8 | 96 | 491 | 455 |
| starpkg.StarViewerZ 1.26 | 650 | 433 | 619 | 1714 | 5.7 / 3.4 | 27 | 496 | 34 |
| stelo.MatchupMicro 1.2 | 650 | 388 | 400 | 1358 | 34.2 / 14.0 | 1901 | 2665 | 0 |
| stelo.PianistNano 1.3 | 650 | 392 | 650 | 547 | 6.9 / 8.1 | 18 | 272 | 378 |
| stelo.SteloTestNano 1.0 | 650 | 389 | 650 | 553 | 10.8 / 5.0 | 103 | 488 | 192 |
| suh.nano.RandomPM 1.02 | 650 | 396 | 650 | 662 | 8.1 / 11.7 | 74 | 934 | 1143 |
| syl.Centipede 0.5 | 650 | 414 | 650 | 598 | 6.9 / 1.9 | 2 | 431 | 125 |
| tobe.Saturn lambda | 650 | 376 | 525 | 466 | 40.4 / 24.5 | 1767 | 3347 | 2132 |
| trab.nano.AinippeNano 1.3 | 650 | 478 | 541 | 505 | 46.9 / 23.8 | 2134 | 4601 | 1396 |
| tzu.TheArtOfWar 1.2 | 650 | 341 | 616 | 668 | 13.5 / 3.1 | 143 | 471 | 14 |
| vuen.Fractal 0.55 | 650 | 441 | 634 | 576 | 20.5 / 3.0 | 136 | 270 | 0 |
| whind.Constitution 0.7.1 | 650 | 458 | 463 | 533 | 43.4 / 25.0 | 1566 | 5344 | 2614 |
| wiki.mako.MakoHT 1.2.2.1 | 650 | 326 | 447 | 561 | 28.3 / 15.9 | 1043 | 2528 | 1047 |
| wiki.nano.RaikoNano 1.1 | 650 | 534 | 619 | 741 | 30.9 / 27.9 | 270 | 7742 | 2031 |
| zen.Lindada 0.2 | 650 | 487 | 650 | 735 | 8.6 / 3.9 | 1 | 287 | 55 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | 6.2% | 103 | 52 | 3 | 15.3 | 377 / 6129 (6%) | 0 | 0 |
| KiraNL.Cataris 1.0 | 7.2% | 107 | 2828 | 3 | 19.2 | 404 / 4208 (10%) | 0 | 0 |
| PkKillers.PkAssassin 1.0 | 6.5% | 94 | 1305 | 3 | 14.4 | 383 / 6014 (6%) | 0 | 0 |
| alpha.BlackIce 1.0 | 6.0% | 230 | 46 | 3 | 16.6 | 304 / 4587 (7%) | 0 | 0 |
| amk.ChumbaMini 0.2 | 6.5% | 97 | 58 | 3 | 23.3 | 605 / 631 (96%) | 0 | 0 |
| amk.ChumbaWumba 0.3 | 1.6% | 89 | 42 | 3 | 2.6 | 49 / 8267 (1%) | 0 | 0 |
| apc.botM 3.0 | 5.5% | 114 | 213 | 3 | 28.6 | 610 / 6156 (10%) | 0 | 0 |
| apv.NanoLauLectrik 1.0 | 6.8% | 86 | 94 | 3 | 20.4 | 554 / 1154 (48%) | 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 4.8% | 91 | 34 | 3 | 3.3 | 78 / 6114 (1%) | 0 | 0 |
| ary.nano.ColorNanoP 1.1 | 8.2% | 88 | 38 | 3 | 13.8 | 458 / 2470 (19%) | 0 | 0 |
| asm.Statistas 0.1 | 4.9% | 104 | 2550 | 3 | 20.2 | 336 / 1975 (17%) | 0 | 0 |
| bigpete.Stewie 1.0 | 5.5% | 93 | 2698 | 3 | 20.7 | 499 / 2829 (18%) | 0 | 0 |
| brainfade.melee.Dusk 0.44 | 0.7% | 85 | 47 | 3 | 4.3 | 83 / 25189 (0%) | 0 | 0 |
| buba.Archivist 0.1 | 1.6% | 85 | 32 | 3 | 1.5 | 30 / 9455 (0%) | 0 | 0 |
| bvh.mini.Fenrir 0.39 | 5.2% | 98 | 54 | 3 | 12.9 | 212 / 4868 (4%) | 0 | 0 |
| casey.Flee 1.0 | 2.1% | 92 | 366 | 3 | 3.1 | 53 / 8480 (1%) | 0 | 0 |
| csm.NthGeneration 0.04 | 3.6% | 87 | 40 | 3 | 3.7 | 91 / 14446 (1%) | 0 | 0 |
| demetrix.nano.Neutrino 0.27 | 7.5% | 103 | 95 | 3 | 33.8 | 816 / 1517 (54%) | 0 | 0 |
| dmp.nano.Eve 3.41 | 6.8% | 88 | 41 | 3 | 10.9 | 180 / 1280 (14%) | 0 | 0 |
| ds.OoV4 0.3b | 1.2% | 94 | 1607 | 3 | 6.4 | 164 / 27351 (1%) | 0 | 0 |
| dsx724.VSAB_EP3a 1.0 | 0.8% | 85 | 49 | 2 | 3.7 | 85 / 49101 (0%) | 0 | 0 |
| dummy.micro.Sparrow 2.5 | 4.8% | 93 | 67 | 3 | 4.9 | 114 / 13804 (1%) | 0 | 0 |
| dy.LevelOne 2.0 | 6.8% | 100 | 1902 | 3 | 15.5 | 273 / 1667 (16%) | 0 | 0 |
| dz.MostlyHarmlessNano 2.1 | 3.5% | 93 | 76 | 3 | 8.8 | 195 / 9470 (2%) | 0 | 0 |
| et.Predator 1.8 | 2.6% | 110 | 60 | 3 | 6.3 | 118 / 9620 (1%) | 0 | 0 |
| exauge.GateKeeper 1.1.121g | 6.9% | 93 | 3408 | 3 | 22.8 | 418 / 2177 (19%) | 0 | 0 |
| fcr.First 1.0 | 15.7% | 94 | 32 | 3 | 13.4 | 347 / 361 (96%) | 0 | 0 |
| fnc.bandit2002.Bandit2002 4.0.2 | 7.1% | 93 | 45 | 3 | 16.3 | 356 / 3893 (9%) | 0 | 0 |
| frag.FragBot 1.0 | 5.9% | 101 | 230 | 3 | 14.3 | 299 / 5450 (5%) | 0 | 0 |
| gh.nano.Grofvuil 0.2 | 1.9% | 93 | 46 | 3 | 2.0 | 47 / 16365 (0%) | 0 | 0 |
| gu.MicroScoob 1.3 | 4.5% | 91 | 39 | 3 | 7.9 | 319 / 4923 (6%) | 0 | 0 |
| ha2.T3 0.2 | 2.4% | 94 | 543 | 3 | 3.6 | 92 / 8785 (1%) | 0 | 0 |
| hamilton.Hamilton 1.0 | 7.2% | 110 | 375 | 3 | 13.9 | 322 / 11262 (3%) | 0 | 0 |
| ins.MobyNano 0.8 | 3.5% | 84 | 150 | 3 | 4.0 | 98 / 9924 (1%) | 0 | 0 |
| jp.Perpy 16.0 | 9.1% | 105 | 1407 | 3 | 18.2 | 507 / 10758 (5%) | 0 | 0 |
| kawigi.nano.FunkyChicken 1.1 | 5.8% | 87 | 32 | 3 | 3.2 | 69 / 8792 (1%) | 0 | 0 |
| kawigi.sbf.Barracuda 1.0 | 4.6% | 83 | 481 | 3 | 3.6 | 42 / 11483 (0%) | 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 6.3% | 97 | 358 | 3 | 19.3 | 350 / 1393 (25%) | 0 | 0 |
| krzysiek.robbo2.Robbo 1.0.0 | 8.7% | 88 | 37 | 3 | 13.4 | 226 / 1692 (13%) | 0 | 0 |
| lechu.Ala 0.0.4 | 8.0% | 116 | 657 | 3 | 29.2 | 688 / 6273 (11%) | 0 | 0 |
| lessonz.robocode.Oz 0.5.0 | 5.4% | 96 | 76 | 3 | 17.1 | 477 / 5159 (9%) | 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 1.9% | 91 | 48 | 3 | 4.4 | 72 / 12252 (1%) | 0 | 0 |
| lrem.micro.FalseProphet Alpha | 9.2% | 91 | 40 | 3 | 12.8 | 310 / 4246 (7%) | 0 | 0 |
| lrem.quickhack.QuickHack 1.0 | 4.1% | 95 | 39 | 3 | 3.7 | 74 / 18647 (0%) | 0 | 0 |
| mb.Monte 0.1.0 | 9.9% | 94 | 1660 | 3 | 20.0 | 593 / 629 (94%) | 0 | 0 |
| metal.small.MCool 1.21 | 0.7% | 87 | 39 | 3 | 1.0 | 20 / 9726 (0%) | 0 | 0 |
| mladjo.AIR 0.7 | 3.5% | 91 | 48 | 3 | 8.5 | 183 / 10433 (2%) | 0 | 0 |
| mladjo.Startko 1.0 | 2.6% | 94 | 337 | 3 | 2.2 | 45 / 11958 (0%) | 0 | 0 |
| mld.LittleBlackBook 1.69e | 15.0% | 94 | 28 | 3 | 9.4 | 150 / 478 (31%) | 0 | 0 |
| mld.jdc.nano.LittleBlackBook 1.0 | 13.8% | 90 | 30 | 3 | 9.4 | 149 / 602 (25%) | 0 | 0 |
| myl.micro.NekoNinja 1.30 | 0.9% | 96 | 825 | 3 | 3.5 | 56 / 14712 (0%) | 0 | 0 |
| myl.micro.Predator 1.50 | 2.7% | 106 | 715 | 3 | 10.0 | 189 / 6506 (3%) | 0 | 0 |
| mz.Adept 2.65 | 4.1% | 84 | 281 | 3 | 4.7 | 145 / 6836 (2%) | 0 | 0 |
| mz.AdeptBSB 1.03 | 1.7% | 85 | 62 | 3 | 1.4 | 37 / 13405 (0%) | 0 | 0 |
| nat.nano.Ocnirp 1.73 | 3.0% | 77 | 37 | 3 | 5.3 | 132 / 7917 (2%) | 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 2.9% | 89 | 144 | 3 | 5.4 | 121 / 7782 (2%) | 0 | 0 |
| nova.Snow 1.0 | 7.5% | 92 | 46 | 3 | 28.5 | 624 / 4307 (14%) | 0 | 0 |
| pez.mini.Gouldingi 1.5 | 3.8% | 94 | 122 | 3 | 17.9 | 338 / 3311 (10%) | 0 | 0 |
| qwaker00.Ahchoo 1.6 | 2.2% | 77 | 34 | 3 | 3.9 | 55 / 13029 (0%) | 0 | 0 |
| ratosh.Nobo 0.21 | 5.7% | 98 | 44 | 3 | 18.0 | 371 / 821 (45%) | 0 | 0 |
| rdt199.Warlord 0.73 | 5.8% | 99 | 42 | 3 | 9.6 | 202 / 7238 (3%) | 0 | 0 |
| rjw.RabidWombat 0.71 | 2.9% | 103 | 42 | 3 | 2.8 | 90 / 6890 (1%) | 0 | 0 |
| robar.nano.MosquitoPM 1.0 | 4.8% | 106 | 35 | 3 | 5.5 | 99 / 7763 (1%) | 0 | 0 |
| robar.nano.Prestige 1.0 | 4.4% | 95 | 239 | 3 | 9.5 | 179 / 7058 (3%) | 0 | 0 |
| robar.nano.Scytodes 0.3 | 2.1% | 92 | 24 | 3 | 1.1 | 20 / 6764 (0%) | 0 | 0 |
| robar.nano.Vespa 0.95 | 2.8% | 87 | 30 | 3 | 3.0 | 79 / 8989 (1%) | 0 | 0 |
| rsk1.RSK1 4.0 | 2.5% | 85 | 471 | 3 | 5.1 | 109 / 12610 (1%) | 0 | 0 |
| rtk.Tachikoma 1.0 | 3.3% | 77 | 34 | 3 | 7.2 | 130 / 14178 (1%) | 0 | 0 |
| rz.SmallDevil 1.502 | 3.1% | 85 | 36 | 3 | 1.6 | 35 / 11958 (0%) | 0 | 0 |
| satan.White 0.26 | 2.7% | 86 | 22 | 3 | 2.6 | 53 / 12496 (0%) | 0 | 0 |
| sheldor.nano.PointInLine 1.0 | 4.2% | 162 | 32 | 3 | 4.2 | 99 / 6845 (1%) | 0 | 0 |
| sheldor.nano.PointInLineRRAL 1.0.0 | 8.1% | 106 | 45 | 3 | 19.9 | 382 / 2225 (17%) | 0 | 0 |
| simonton.GFNano_D 3.1b | 3.1% | 90 | 30 | 3 | 2.7 | 85 / 7021 (1%) | 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 2.7% | 82 | 385 | 3 | 3.1 | 70 / 10779 (1%) | 0 | 0 |
| sm.Devil 7.3 | 4.1% | 127 | 81 | 3 | 31.5 | 573 / 23107 (2%) | 0 | 0 |
| spinnercat.CopyKat 1.2.3 | 2.1% | 73 | 53 | 3 | 1.3 | 48 / 9314 (1%) | 0 | 0 |
| spinnercat.Kitten 1.6 | 2.2% | 81 | 42 | 3 | 2.9 | 90 / 8975 (1%) | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 0.8% | 96 | 82 | 3 | 4.2 | 102 / 37010 (0%) | 0 | 0 |
| stelo.MatchupMicro 1.2 | 3.6% | 78 | 59 | 3 | 28.5 | 544 / 25112 (2%) | 0 | 0 |
| stelo.PianistNano 1.3 | 2.0% | 90 | 36 | 3 | 2.0 | 37 / 7930 (0%) | 0 | 0 |
| stelo.SteloTestNano 1.0 | 1.5% | 83 | 34 | 3 | 1.4 | 33 / 8244 (0%) | 0 | 0 |
| suh.nano.RandomPM 1.02 | 2.9% | 88 | 72 | 3 | 6.1 | 98 / 10228 (1%) | 0 | 0 |
| syl.Centipede 0.5 | 0.7% | 87 | 199 | 3 | 1.5 | 24 / 8561 (0%) | 0 | 0 |
| tobe.Saturn lambda | 6.3% | 108 | 197 | 3 | 16.6 | 344 / 1994 (17%) | 0 | 0 |
| trab.nano.AinippeNano 1.3 | 8.3% | 99 | 63 | 3 | 25.2 | 440 / 2708 (16%) | 0 | 0 |
| tzu.TheArtOfWar 1.2 | 1.2% | 101 | 236 | 3 | 3.3 | 66 / 10831 (1%) | 0 | 0 |
| vuen.Fractal 0.55 | 0.7% | 92 | 27 | 3 | 1.0 | 13 / 7149 (0%) | 0 | 0 |
| whind.Constitution 0.7.1 | 6.9% | 101 | 65 | 3 | 30.6 | 598 / 1568 (38%) | 0 | 0 |
| wiki.mako.MakoHT 1.2.2.1 | 5.4% | 86 | 39 | 3 | 12.9 | 173 / 6151 (3%) | 0 | 0 |
| wiki.nano.RaikoNano 1.1 | 6.2% | 116 | 75 | 3 | 49.7 | 1204 / 1243 (97%) | 0 | 0 |
| zen.Lindada 0.2 | 0.8% | 84 | 44 | 3 | 2.3 | 37 / 11699 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| KiraNL.Cataris 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| PkKillers.PkAssassin 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| alpha.BlackIce 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| amk.ChumbaMini 0.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| amk.ChumbaWumba 0.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apc.botM 3.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.NanoLauLectrik 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ary.nano.ColorNanoP 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| asm.Statistas 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bigpete.Stewie 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| brainfade.melee.Dusk 0.44 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| buba.Archivist 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.mini.Fenrir 0.39 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| casey.Flee 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| csm.NthGeneration 0.04 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| demetrix.nano.Neutrino 0.27 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dmp.nano.Eve 3.41 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ds.OoV4 0.3b | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dsx724.VSAB_EP3a 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dummy.micro.Sparrow 2.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dy.LevelOne 2.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dz.MostlyHarmlessNano 2.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| et.Predator 1.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| exauge.GateKeeper 1.1.121g | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| fcr.First 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| fnc.bandit2002.Bandit2002 4.0.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| frag.FragBot 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gh.nano.Grofvuil 0.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gu.MicroScoob 1.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ha2.T3 0.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| hamilton.Hamilton 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ins.MobyNano 0.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jp.Perpy 16.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.nano.FunkyChicken 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.sbf.Barracuda 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| krzysiek.robbo2.Robbo 1.0.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lechu.Ala 0.0.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lessonz.robocode.Oz 0.5.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lrem.micro.FalseProphet Alpha | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lrem.quickhack.QuickHack 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mb.Monte 0.1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| metal.small.MCool 1.21 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mladjo.AIR 0.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mladjo.Startko 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mld.LittleBlackBook 1.69e | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mld.jdc.nano.LittleBlackBook 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| myl.micro.NekoNinja 1.30 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| myl.micro.Predator 1.50 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mz.Adept 2.65 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mz.AdeptBSB 1.03 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.nano.Ocnirp 1.73 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nova.Snow 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.mini.Gouldingi 1.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| qwaker00.Ahchoo 1.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ratosh.Nobo 0.21 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rdt199.Warlord 0.73 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rjw.RabidWombat 0.71 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.nano.MosquitoPM 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.nano.Prestige 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.nano.Scytodes 0.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.nano.Vespa 0.95 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rsk1.RSK1 4.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rtk.Tachikoma 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rz.SmallDevil 1.502 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| satan.White 0.26 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sheldor.nano.PointInLine 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sheldor.nano.PointInLineRRAL 1.0.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.GFNano_D 3.1b | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sm.Devil 7.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| spinnercat.CopyKat 1.2.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| spinnercat.Kitten 1.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| starpkg.StarViewerZ 1.26 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.MatchupMicro 1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.PianistNano 1.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.SteloTestNano 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| suh.nano.RandomPM 1.02 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| syl.Centipede 0.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tobe.Saturn lambda | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| trab.nano.AinippeNano 1.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tzu.TheArtOfWar 1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| vuen.Fractal 0.55 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| whind.Constitution 0.7.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wiki.mako.MakoHT 1.2.2.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wiki.nano.RaikoNano 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| zen.Lindada 0.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | CharlieN.Omega.Omega | 1 | 35 | 314 | 3.5% | 7.5% ± 2.6 | 13.2% | 26.1% / 20.9% | 3.6% | 0 / 0 | T3/M? | 80% |
| KiraNL.Cataris 1.0 | KiraNL.Cataris | 1 | 35 | 288 | 7.2% | 12.7% ± 2.7 | 15.5% | 35.6% / 29.7% | 21.0% | 0 / 0 | T3/M? | 73% |
| PkKillers.PkAssassin 1.0 | PkKillers.PkAssassin | 1 | 35 | 312 | 5.0% | 10.9% ± 3.0 | 17.0% | 38.2% / 30.6% | 10.3% | 0 / 0 | T?/M? | 84% |
| alpha.BlackIce 1.0 | alpha.BlackIce | 1 | 35 | 288 | 7.0% | 8.0% ± 2.0 | 13.0% | 25.0% / 23.2% | 8.1% | 0 / 0 | T3/M0 | 74% |
| amk.ChumbaMini 0.2 | amk.ChumbaMini | 1 | 35 | 288 | 7.1% | 7.3% ± 1.9 | 15.2% | 25.0% / 23.2% | 7.3% | 0 / 0 | T3/M1 | 77% |
| amk.ChumbaWumba 0.3 | amk.ChumbaWumba | 1 | 35 | 292 | 1.5% | 21.0% ± 11.0 | 11.8% | 22.2% / 23.5% | 11.7% | 0 / 0 | T?/M? | 92% |
| apc.botM 3.0 | apc.botM | 1 | 35 | 264 | 6.6% | 7.1% ± 1.6 | 14.8% | 26.1% / 23.5% | 4.8% | 0 / 0 | T3/M0 | 77% |
| apv.NanoLauLectrik 1.0 | apv.NanoLauLectrik | 1 | 35 | 304 | 8.5% | 9.9% ± 2.3 | 14.8% | 35.4% / 30.0% | 11.8% | 0 / 0 | T3/M? | 71% |
| apv.NanoLauLectrikTheCannibal 1.1 | apv.NanoLauLectrikTheCannibal | 1 | 35 | 348 | 9.5% | 9.8% ± 3.9 | 36.5% | 52.6% / 50.1% | 89.5% | 0 / 0 | T?/M? | 87% |
| ary.nano.ColorNanoP 1.1 | ary.nano.ColorNanoP | 1 | 35 | 308 | 8.7% | 9.0% ± 2.6 | 19.0% | 32.2% / 28.8% | 16.3% | 0 / 0 | T3/M? | 83% |
| asm.Statistas 0.1 | asm.Statistas | 1 | 35 | 284 | 6.6% | 7.1% ± 1.8 | 12.6% | 27.6% / 25.1% | 5.1% | 0 / 0 | T3/M0 | 76% |
| bigpete.Stewie 1.0 | bigpete.Stewie | 1 | 35 | 288 | 6.4% | 7.9% ± 2.0 | 18.1% | 32.9% / 28.0% | 5.4% | 0 / 0 | T3/M? | 83% |
| brainfade.melee.Dusk 0.44 | brainfade.melee.Dusk | 1 | 35 | 314 | 0.5% | 4.0% ± 2.2 | 9.5% | 23.2% / 21.1% | 4.1% | 0 / 0 | T1/M? | 97% |
| buba.Archivist 0.1 | buba.Archivist | 1 | 35 | 288 | 2.5% | 23.2% ± 8.6 | 12.5% | 31.6% / 31.9% | 21.3% | 0 / 0 | T?/M? | 80% |
| bvh.mini.Fenrir 0.39 | bvh.mini.Fenrir | 1 | 35 | 294 | 5.4% | 7.2% ± 2.1 | 17.9% | 28.9% / 26.5% | 2.5% | 0 / 0 | T3/M? | 80% |
| casey.Flee 1.0 | casey.Flee | 1 | 35 | 272 | 1.5% | 6.2% ± 4.2 | 11.8% | 26.0% / 21.7% | 8.1% | 0 / 0 | T?/M? | 93% |
| csm.NthGeneration 0.04 | csm.NthGeneration | 1 | 35 | 302 | 3.5% | 11.2% ± 5.5 | 12.1% | 35.1% / 35.3% | 7.7% | 0 / 0 | T?/M? | 93% |
| demetrix.nano.Neutrino 0.27 | demetrix.nano.Neutrino | 1 | 35 | 322 | 9.4% | 7.5% ± 1.6 | 14.8% | 25.1% / 22.3% | 6.4% | 0 / 0 | T3/M0 | 68% |
| dmp.nano.Eve 3.41 | dmp.nano.Eve | 1 | 35 | 282 | 9.2% | 10.5% ± 2.9 | 29.3% | 59.7% / 59.9% | 55.7% | 0 / 0 | T3/M? | 83% |
| ds.OoV4 0.3b | ds.OoV4 | 1 | 35 | 262 | 0.9% | 8.0% ± 3.6 | 10.6% | 28.6% / 24.6% | 4.6% | 0 / 0 | T?/M? | 96% |
| dsx724.VSAB_EP3a 1.0 | dsx724.VSAB_EP3a | 1 | 35 | 296 | 0.7% | 10.1% ± 4.4 | 10.7% | 25.1% / 24.0% | 2.1% | 0 / 0 | T?/M? | 91% |
| dummy.micro.Sparrow 2.5 | dummy.micro.Sparrow | 1 | 35 | 308 | 4.8% | 15.0% ± 4.7 | 16.3% | 28.9% / 26.2% | 4.9% | 0 / 0 | T?/M? | 81% |
| dy.LevelOne 2.0 | dy.LevelOne | 1 | 35 | 276 | 8.3% | 6.2% ± 2.0 | 22.0% | 33.2% / 35.5% | 15.0% | 0 / 0 | T2/M? | 83% |
| dz.MostlyHarmlessNano 2.1 | dz.MostlyHarmlessNano | 1 | 35 | 316 | 4.7% | 8.8% ± 2.4 | 16.0% | 36.1% / 33.7% | 29.7% | 0 / 0 | T3/M? | 81% |
| et.Predator 1.8 | et.Predator | 1 | 35 | 276 | 2.4% | 21.9% ± 6.4 | 13.1% | 32.3% / 29.2% | 2.0% | 0 / 0 | T?/M? | 89% |
| exauge.GateKeeper 1.1.121g | exauge.GateKeeper | 1 | 35 | 310 | 7.1% | 9.8% ± 2.2 | 13.3% | 27.1% / 23.7% | 24.9% | 0 / 0 | T3/M0 | 75% |
| fcr.First 1.0 | fcr.First | 1 | 35 | 268 | 16.7% | 10.1% ± 2.7 | 32.5% | 33.1% / 35.0% | 1.9% | 0 / 0 | T3/M? | 86% |
| fnc.bandit2002.Bandit2002 4.0.2 | fnc.bandit2002.Bandit2002 | 1 | 35 | 336 | 6.5% | 6.8% ± 2.2 | 16.2% | 21.3% / 21.7% | 8.6% | 0 / 0 | T2/M? | 76% |
| frag.FragBot 1.0 | frag.FragBot | 1 | 35 | 280 | 6.6% | 10.2% ± 2.8 | 15.7% | 28.3% / 26.2% | 5.9% | 0 / 0 | T3/M? | 80% |
| gh.nano.Grofvuil 0.2 | gh.nano.Grofvuil | 1 | 35 | 296 | 0.8% | 15.4% ± 10.2 | 16.3% | 38.8% / 40.0% | 4.1% | 0 / 0 | T?/M? | 96% |
| gu.MicroScoob 1.3 | gu.MicroScoob | 1 | 35 | 284 | 4.5% | 5.8% ± 2.7 | 18.3% | 27.6% / 21.6% | 7.1% | 0 / 0 | T2/M? | 81% |
| ha2.T3 0.2 | ha2.T3 | 1 | 35 | 256 | 1.4% | 9.0% ± 5.6 | 16.9% | 35.5% / 33.1% | 10.9% | 0 / 0 | T?/M? | 90% |
| hamilton.Hamilton 1.0 | hamilton.Hamilton | 1 | 35 | 300 | 7.4% | 11.3% ± 2.6 | 14.9% | 26.1% / 23.1% | 6.6% | 0 / 0 | T3/M? | 84% |
| ins.MobyNano 0.8 | ins.MobyNano | 1 | 35 | 280 | 4.0% | 17.4% ± 5.9 | 14.2% | 30.5% / 21.4% | 8.2% | 0 / 0 | T?/M? | 84% |
| jp.Perpy 16.0 | jp.Perpy | 1 | 35 | 266 | 5.7% | 6.6% ± 1.7 | 15.3% | 25.0% / 22.5% | 7.6% | 0 / 0 | T2/M1 | 82% |
| kawigi.nano.FunkyChicken 1.1 | kawigi.nano.FunkyChicken | 1 | 35 | 328 | 4.4% | 11.8% ± 5.5 | 15.0% | 29.4% / 23.7% | 5.8% | 0 / 0 | T?/M? | 88% |
| kawigi.sbf.Barracuda 1.0 | kawigi.sbf.Barracuda | 1 | 35 | 312 | 5.3% | 10.0% ± 5.3 | 13.1% | 19.7% / 21.2% | 5.2% | 0 / 0 | T?/M? | 82% |
| kinsen.nano.Quarrelet 1.0 | kinsen.nano.Quarrelet | 1 | 35 | 316 | 7.5% | 8.4% ± 2.1 | 13.5% | 30.2% / 29.2% | 5.7% | 0 / 0 | T3/M? | 71% |
| krzysiek.robbo2.Robbo 1.0.0 | krzysiek.robbo2.Robbo | 1 | 35 | 320 | 12.1% | 8.1% ± 2.4 | 21.7% | 21.6% / 21.5% | 10.1% | 0 / 0 | T3/M? | 78% |
| lechu.Ala 0.0.4 | lechu.Ala | 1 | 35 | 272 | 10.1% | 9.2% ± 1.6 | 16.7% | 29.6% / 27.6% | 2.2% | 0 / 0 | T3/M0 | 74% |
| lessonz.robocode.Oz 0.5.0 | lessonz.robocode.Oz | 1 | 35 | 312 | 5.1% | 9.9% ± 2.5 | 17.9% | 33.1% / 30.7% | 5.5% | 0 / 0 | T3/M? | 83% |
| lrem.magic.TormentedAngel Antiquitie | lrem.magic.TormentedAngel | 1 | 35 | 346 | 4.0% | 8.4% ± 2.3 | 13.8% | 33.1% / 27.7% | 6.6% | 0 / 0 | T3/M? | 82% |
| lrem.micro.FalseProphet Alpha | lrem.micro.FalseProphet | 1 | 35 | 328 | 6.1% | 6.3% ± 2.2 | 23.8% | 20.0% / 19.7% | 17.9% | 0 / 0 | T2/M? | 82% |
| lrem.quickhack.QuickHack 1.0 | lrem.quickhack.QuickHack | 1 | 35 | 328 | 4.6% | 17.4% ± 7.6 | 14.2% | 30.7% / 25.4% | 17.2% | 0 / 0 | T?/M? | 89% |
| mb.Monte 0.1.0 | mb.Monte | 1 | 35 | 268 | 10.0% | 8.4% ± 2.2 | 20.6% | 30.3% / 32.2% | 4.1% | 0 / 0 | T3/M? | 83% |
| metal.small.MCool 1.21 | metal.small.MCool | 1 | 35 | 302 | 0.6% | 12.5% ± 8.6 | 9.1% | 22.7% / 25.4% | 11.4% | 0 / 0 | T?/M? | 96% |
| mladjo.AIR 0.7 | mladjo.AIR | 1 | 35 | 272 | 2.6% | 13.2% ± 5.4 | 11.9% | 26.6% / 23.2% | 8.4% | 0 / 0 | T?/M? | 82% |
| mladjo.Startko 1.0 | mladjo.Startko | 1 | 35 | 288 | 3.1% | 11.3% ± 4.7 | 14.2% | 23.8% / 22.4% | 5.6% | 0 / 0 | T?/M? | 83% |
| mld.LittleBlackBook 1.69e | mld.LittleBlackBook | 1 | 35 | 312 | 13.4% | 11.1% ± 3.3 | 41.6% | 54.4% / 50.9% | 36.0% | 0 / 0 | T?/M? | 87% |
| mld.jdc.nano.LittleBlackBook 1.0 | mld.jdc.nano.LittleBlackBook | 1 | 35 | 344 | 13.4% | 11.1% ± 3.3 | 41.6% | 54.4% / 50.9% | 36.0% | 0 / 0 | T?/M? | 87% |
| myl.micro.NekoNinja 1.30 | myl.micro.NekoNinja | 1 | 35 | 310 | 0.4% | 7.7% ± 6.0 | 9.4% | 25.9% / 24.5% | 14.6% | 0 / 0 | T?/M? | 96% |
| myl.micro.Predator 1.50 | myl.micro.Predator | 1 | 35 | 306 | 1.7% | 5.8% ± 2.2 | 13.4% | 33.5% / 27.9% | 28.0% | 0 / 0 | T2/M? | 90% |
| mz.Adept 2.65 | mz.Adept | 1 | 35 | 266 | 2.9% | 17.1% ± 7.9 | 15.3% | 23.1% / 20.6% | 9.8% | 0 / 0 | T?/M? | 79% |
| mz.AdeptBSB 1.03 | mz.AdeptBSB | 1 | 35 | 278 | 1.1% | 14.7% ± 8.6 | 10.7% | 21.7% / 17.7% | 8.6% | 0 / 0 | T?/M? | 92% |
| nat.nano.Ocnirp 1.73 | nat.nano.Ocnirp | 1 | 35 | 294 | 2.6% | 10.7% ± 4.4 | 12.8% | 30.6% / 25.9% | 11.0% | 0 / 0 | T?/M? | 86% |
| nat.nano.OcnirpPM 1.0 | nat.nano.OcnirpPM | 1 | 35 | 300 | 2.8% | 13.7% ± 5.8 | 12.8% | 25.1% / 23.6% | 10.8% | 0 / 0 | T?/M? | 84% |
| nova.Snow 1.0 | nova.Snow | 1 | 35 | 268 | 7.1% | 6.4% ± 1.5 | 14.9% | 23.8% / 22.4% | 4.7% | 0 / 0 | T2/M1 | 77% |
| pez.mini.Gouldingi 1.5 | pez.mini.Gouldingi | 1 | 35 | 304 | 6.0% | 6.5% ± 1.7 | 14.7% | 27.2% / 23.0% | 2.7% | 0 / 0 | T2/M0 | 81% |
| qwaker00.Ahchoo 1.6 | qwaker00.Ahchoo | 1 | 35 | 292 | 2.4% | 8.5% ± 3.7 | 14.4% | 25.9% / 24.4% | 4.4% | 0 / 0 | T?/M? | 81% |
| ratosh.Nobo 0.21 | ratosh.Nobo | 1 | 35 | 278 | 7.3% | 8.8% ± 2.3 | 15.5% | 37.2% / 33.9% | 15.4% | 0 / 0 | T3/M? | 80% |
| rdt199.Warlord 0.73 | rdt199.Warlord | 1 | 35 | 290 | 3.7% | 22.3% ± 8.1 | 13.9% | 25.3% / 21.3% | 3.2% | 0 / 0 | T?/M? | 93% |
| rjw.RabidWombat 0.71 | rjw.RabidWombat | 1 | 35 | 294 | 3.4% | 19.8% ± 7.9 | 17.8% | 33.0% / 28.2% | 11.3% | 0 / 0 | T?/M? | 77% |
| robar.nano.MosquitoPM 1.0 | robar.nano.MosquitoPM | 1 | 35 | 316 | 2.5% | 20.5% ± 7.9 | 13.6% | 30.8% / 29.8% | 15.6% | 0 / 0 | T?/M? | 82% |
| robar.nano.Prestige 1.0 | robar.nano.Prestige | 1 | 35 | 308 | 3.4% | 16.9% ± 5.6 | 11.9% | 25.7% / 24.3% | 20.0% | 0 / 0 | T?/M? | 77% |
| robar.nano.Scytodes 0.3 | robar.nano.Scytodes | 1 | 35 | 308 | 2.2% | 10.6% ± 6.1 | 23.8% | 57.5% / 51.2% | 42.1% | 0 / 0 | T?/M? | 89% |
| robar.nano.Vespa 0.95 | robar.nano.Vespa | 1 | 35 | 298 | 2.7% | 22.6% ± 8.9 | 13.7% | 32.0% / 27.3% | 36.9% | 0 / 0 | T?/M? | 86% |
| rsk1.RSK1 4.0 | rsk1.RSK1 | 1 | 35 | 268 | 6.8% | 8.5% ± 1.8 | 14.2% | 31.6% / 29.0% | 15.2% | 0 / 0 | T3/M0 | 78% |
| rtk.Tachikoma 1.0 | rtk.Tachikoma | 1 | 35 | 284 | 5.0% | 9.4% ± 2.3 | 14.3% | 23.8% / 23.2% | 16.0% | 0 / 0 | T3/M? | 67% |
| rz.SmallDevil 1.502 | rz.SmallDevil | 1 | 35 | 288 | 4.1% | 6.0% ± 5.8 | 13.1% | 28.4% / 23.1% | 7.8% | 0 / 0 | T?/M? | 94% |
| satan.White 0.26 | satan.White | 1 | 35 | 278 | 2.2% | 18.6% ± 8.2 | 12.0% | 21.6% / 19.3% | 11.5% | 0 / 0 | T?/M? | 87% |
| sheldor.nano.PointInLine 1.0 | sheldor.nano.PointInLine | 1 | 35 | 328 | 2.7% | 30.1% ± 10.0 | 12.4% | 22.9% / 19.5% | 10.3% | 0 / 0 | T?/M? | 82% |
| sheldor.nano.PointInLineRRAL 1.0.0 | sheldor.nano.PointInLineRRAL | 1 | 35 | 348 | 11.2% | 8.1% ± 1.9 | 18.4% | 27.5% / 25.5% | 15.6% | 0 / 0 | T3/M? | 80% |
| simonton.GFNano_D 3.1b | simonton.GFNano_D | 1 | 35 | 302 | 3.9% | 22.5% ± 8.5 | 16.5% | 25.8% / 24.3% | 7.3% | 0 / 0 | T?/M? | 82% |
| simonton.nano.WeekendObsession_S 1.7 | simonton.nano.WeekendObsession_S | 1 | 35 | 360 | 2.2% | 15.0% ± 5.8 | 14.3% | 34.2% / 25.4% | 13.9% | 0 / 0 | T?/M? | 91% |
| sm.Devil 7.3 | sm.Devil | 1 | 35 | 264 | 2.4% | 7.4% ± 1.5 | 12.6% | 29.3% / 23.1% | 4.0% | 0 / 0 | T3/M? | 87% |
| spinnercat.CopyKat 1.2.3 | spinnercat.CopyKat | 1 | 35 | 308 | 0.7% | 14.7% ± 12.1 | 16.7% | 55.3% / 51.7% | 81.3% | 0 / 0 | T?/M? | 98% |
| spinnercat.Kitten 1.6 | spinnercat.Kitten | 1 | 35 | 300 | 1.8% | 23.0% ± 8.6 | 11.8% | 30.7% / 25.7% | 29.1% | 0 / 0 | T?/M? | 85% |
| starpkg.StarViewerZ 1.26 | starpkg.StarViewerZ | 1 | 35 | 310 | 0.6% | 8.1% ± 3.9 | 8.9% | 25.2% / 25.2% | 4.3% | 0 / 0 | T?/M? | 95% |
| stelo.MatchupMicro 1.2 | stelo.MatchupMicro | 1 | 35 | 304 | 2.9% | 5.2% ± 1.2 | 17.9% | 31.2% / 25.7% | 3.2% | 0 / 0 | T2/M? | 82% |
| stelo.PianistNano 1.3 | stelo.PianistNano | 1 | 35 | 300 | 1.9% | 21.4% ± 10.5 | 11.7% | 27.1% / 21.0% | 24.8% | 0 / 0 | T?/M? | 85% |
| stelo.SteloTestNano 1.0 | stelo.SteloTestNano | 1 | 35 | 308 | 1.2% | 21.0% ± 10.2 | 14.3% | 34.6% / 27.2% | 9.9% | 0 / 0 | T?/M? | 93% |
| suh.nano.RandomPM 1.02 | suh.nano.RandomPM | 1 | 35 | 302 | 2.4% | 18.7% ± 6.5 | 11.4% | 30.6% / 25.7% | 17.0% | 0 / 0 | T?/M? | 85% |
| syl.Centipede 0.5 | syl.Centipede | 1 | 35 | 284 | 1.0% | 9.9% ± 6.6 | 10.2% | 29.0% / 25.4% | 5.1% | 0 / 0 | T?/M? | 93% |
| tobe.Saturn lambda | tobe.Saturn | 1 | 35 | 282 | 8.1% | 9.1% ± 2.2 | 15.8% | 27.0% / 24.7% | 4.3% | 0 / 0 | T3/M0 | 70% |
| trab.nano.AinippeNano 1.3 | trab.nano.AinippeNano | 1 | 35 | 316 | 10.9% | 10.1% ± 1.8 | 15.4% | 33.5% / 33.3% | 11.7% | 0 / 0 | T3/M0 | 77% |
| tzu.TheArtOfWar 1.2 | tzu.TheArtOfWar | 1 | 35 | 292 | 2.8% | 4.0% ± 1.4 | 13.5% | 30.0% / 29.9% | 0.9% | 0 / 0 | T1/M? | 82% |
| vuen.Fractal 0.55 | vuen.Fractal | 1 | 35 | 282 | 1.7% | 9.4% ± 6.6 | 14.2% | 33.6% / 32.5% | 6.4% | 0 / 0 | T?/M? | 93% |
| whind.Constitution 0.7.1 | whind.Constitution | 1 | 35 | 308 | 8.2% | 8.2% ± 1.7 | 14.5% | 31.4% / 28.6% | 14.8% | 0 / 0 | T3/M0 | 78% |
| wiki.mako.MakoHT 1.2.2.1 | wiki.mako.MakoHT | 1 | 35 | 304 | 6.6% | 5.3% ± 1.8 | 16.9% | 23.2% / 21.3% | 9.6% | 0 / 0 | T2/M? | 80% |
| wiki.nano.RaikoNano 1.1 | wiki.nano.RaikoNano | 1 | 35 | 308 | 7.1% | 7.2% ± 1.2 | 11.0% | 24.1% / 22.0% | 5.0% | 0 / 0 | T3/M1 | 74% |
| zen.Lindada 0.2 | zen.Lindada | 1 | 35 | 276 | 0.4% | 8.8% ± 7.4 | 8.7% | 24.6% / 21.1% | 11.5% | 0 / 0 | T?/M? | 97% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.9sa vs hadur2.Hadur 3.9

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | 79.8% ± 2.0 | 83.6% ± 1.3 | -3.8 ± 3.1 |
| KiraNL.Cataris 1.0 | 75.6% ± 4.1 | 77.0% ± 4.2 | -1.5 ± 7.4 |
| PkKillers.PkAssassin 1.0 | 84.5% ± 1.6 | 90.7% ± 0.9 | -6.1 ± 2.3 |
| alpha.BlackIce 1.0 | 75.1% ± 3.3 | 83.4% ± 1.3 | -8.3 ± 3.0 |
| amk.ChumbaMini 0.2 | 75.6% ± 2.9 | 80.3% ± 1.8 | -4.7 ± 3.3 |
| amk.ChumbaWumba 0.3 | 89.1% ± 3.8 | 80.7% ± 4.6 | +8.4 ± 5.3 |
| apc.botM 3.0 | 77.5% ± 3.1 | 88.2% ± 2.4 | -10.7 ± 2.2 |
| apv.NanoLauLectrik 1.0 | 72.3% ± 1.1 | 80.0% ± 3.5 | -7.7 ± 4.1 |
| apv.NanoLauLectrikTheCannibal 1.1 | 89.8% ± 2.8 | 85.5% ± 1.8 | +4.4 ± 3.3 |
| ary.nano.ColorNanoP 1.1 | 83.9% ± 1.4 | 88.5% ± 0.9 | -4.6 ± 1.2 |
| asm.Statistas 0.1 | 79.1% ± 1.8 | 81.5% ± 1.8 | -2.4 ± 2.4 |
| bigpete.Stewie 1.0 | 83.4% ± 1.9 | 96.3% ± 0.5 | -12.8 ± 2.2 |
| brainfade.melee.Dusk 0.44 | 93.0% ± 1.9 | 92.8% ± 1.4 | +0.3 ± 2.9 |
| buba.Archivist 0.1 | 89.0% ± 4.6 | 84.2% ± 2.7 | +4.8 ± 5.7 |
| bvh.mini.Fenrir 0.39 | 78.5% ± 3.1 | 79.3% ± 3.0 | -0.8 ± 4.8 |
| casey.Flee 1.0 | 90.9% ± 2.2 | 84.4% ± 3.0 | +6.6 ± 3.7 |
| csm.NthGeneration 0.04 | 89.5% ± 2.8 | 94.9% ± 1.2 | -5.5 ± 3.4 |
| demetrix.nano.Neutrino 0.27 | 74.4% ± 2.9 | 80.1% ± 3.3 | -5.7 ± 4.0 |
| dmp.nano.Eve 3.41 | 84.6% ± 0.8 | 93.3% ± 1.2 | -8.7 ± 1.8 |
| ds.OoV4 0.3b | 92.5% ± 2.5 | 90.3% ± 1.4 | +2.2 ± 2.0 |
| dsx724.VSAB_EP3a 1.0 | 95.8% ± 2.5 | 96.8% ± 0.7 | -1.0 ± 2.7 |
| dummy.micro.Sparrow 2.5 | 79.8% ± 2.7 | 88.1% ± 2.0 | -8.3 ± 1.9 |
| dy.LevelOne 2.0 | 83.0% ± 1.4 | 97.0% ± 0.6 | -13.9 ± 1.6 |
| dz.MostlyHarmlessNano 2.1 | 85.0% ± 2.6 | 93.4% ± 1.4 | -8.4 ± 2.6 |
| et.Predator 1.8 | 85.0% ± 5.2 | 87.3% ± 3.7 | -2.3 ± 7.0 |
| exauge.GateKeeper 1.1.121g | 74.1% ± 3.2 | 77.4% ± 3.4 | -3.3 ± 4.8 |
| fcr.First 1.0 | 87.0% ± 0.7 | 98.3% ± 0.5 | -11.3 ± 0.6 |
| fnc.bandit2002.Bandit2002 4.0.2 | 78.6% ± 1.8 | 82.8% ± 2.7 | -4.2 ± 3.5 |
| frag.FragBot 1.0 | 77.7% ± 3.6 | 89.5% ± 2.6 | -11.9 ± 3.4 |
| gh.nano.Grofvuil 0.2 | 93.1% ± 1.7 | 98.1% ± 0.6 | -5.0 ± 1.9 |
| gu.MicroScoob 1.3 | 82.7% ± 1.4 | 90.0% ± 2.2 | -7.3 ± 2.5 |
| ha2.T3 0.2 | 89.3% ± 2.3 | 87.0% ± 2.7 | +2.3 ± 4.5 |
| hamilton.Hamilton 1.0 | 83.3% ± 1.5 | 84.7% ± 2.6 | -1.4 ± 2.6 |
| ins.MobyNano 0.8 | 86.2% ± 4.3 | 82.3% ± 1.9 | +4.0 ± 3.8 |
| jp.Perpy 16.0 | 77.8% ± 6.1 | 85.6% ± 2.6 | -7.8 ± 6.7 |
| kawigi.nano.FunkyChicken 1.1 | 87.8% ± 2.9 | 84.8% ± 1.3 | +2.9 ± 3.4 |
| kawigi.sbf.Barracuda 1.0 | 85.6% ± 4.2 | 97.6% ± 0.9 | -12.0 ± 4.1 |
| kinsen.nano.Quarrelet 1.0 | 72.3% ± 2.8 | 79.0% ± 3.4 | -6.6 ± 4.0 |
| krzysiek.robbo2.Robbo 1.0.0 | 81.3% ± 1.5 | 89.7% ± 2.1 | -8.4 ± 2.8 |
| lechu.Ala 0.0.4 | 75.8% ± 2.8 | 81.7% ± 2.8 | -6.0 ± 3.5 |
| lessonz.robocode.Oz 0.5.0 | 84.4% ± 1.0 | 97.4% ± 0.6 | -13.0 ± 1.3 |
| lrem.magic.TormentedAngel Antiquitie | 87.1% ± 2.4 | 82.3% ± 2.4 | +4.8 ± 3.5 |
| lrem.micro.FalseProphet Alpha | 82.7% ± 1.6 | 86.9% ± 1.5 | -4.2 ± 2.6 |
| lrem.quickhack.QuickHack 1.0 | 88.6% ± 2.4 | 88.5% ± 2.1 | +0.2 ± 2.0 |
| mb.Monte 0.1.0 | 81.8% ± 1.8 | 86.6% ± 2.2 | -4.8 ± 3.0 |
| metal.small.MCool 1.21 | 94.1% ± 3.4 | 88.8% ± 2.0 | +5.3 ± 3.3 |
| mladjo.AIR 0.7 | 81.9% ± 2.4 | 82.8% ± 1.8 | -0.9 ± 3.0 |
| mladjo.Startko 1.0 | 86.1% ± 1.6 | 86.0% ± 1.8 | +0.0 ± 1.7 |
| mld.LittleBlackBook 1.69e | 87.9% ± 0.5 | 95.3% ± 1.0 | -7.4 ± 1.0 |
| mld.jdc.nano.LittleBlackBook 1.0 | 88.0% ± 0.4 | 94.4% ± 1.0 | -6.4 ± 0.9 |
| myl.micro.NekoNinja 1.30 | 93.8% ± 2.4 | 87.5% ± 1.5 | +6.3 ± 2.9 |
| myl.micro.Predator 1.50 | 85.7% ± 2.6 | 97.0% ± 1.5 | -11.3 ± 2.6 |
| mz.Adept 2.65 | 81.0% ± 3.9 | 89.9% ± 3.4 | -8.9 ± 6.5 |
| mz.AdeptBSB 1.03 | 90.3% ± 1.0 | 98.3% ± 1.0 | -8.0 ± 1.2 |
| nat.nano.Ocnirp 1.73 | 86.2% ± 2.8 | 79.2% ± 1.9 | +7.0 ± 2.2 |
| nat.nano.OcnirpPM 1.0 | 82.5% ± 4.7 | 76.7% ± 2.1 | +5.8 ± 4.8 |
| nova.Snow 1.0 | 78.2% ± 3.2 | 77.6% ± 2.2 | +0.6 ± 4.8 |
| pez.mini.Gouldingi 1.5 | 82.8% ± 5.7 | 90.6% ± 2.1 | -7.9 ± 7.3 |
| qwaker00.Ahchoo 1.6 | 85.3% ± 3.0 | 82.0% ± 2.9 | +3.3 ± 5.2 |
| ratosh.Nobo 0.21 | 80.6% ± 1.6 | 96.5% ± 0.7 | -15.9 ± 1.6 |
| rdt199.Warlord 0.73 | 84.8% ± 6.9 | 85.3% ± 2.1 | -0.5 ± 7.3 |
| rjw.RabidWombat 0.71 | 81.7% ± 2.7 | 95.0% ± 1.6 | -13.3 ± 3.0 |
| robar.nano.MosquitoPM 1.0 | 82.9% ± 4.3 | 84.2% ± 2.8 | -1.3 ± 3.0 |
| robar.nano.Prestige 1.0 | 74.2% ± 3.4 | 72.5% ± 4.1 | +1.7 ± 3.7 |
| robar.nano.Scytodes 0.3 | 92.2% ± 1.7 | 95.1% ± 1.0 | -2.9 ± 2.5 |
| robar.nano.Vespa 0.95 | 86.8% ± 1.2 | 91.2% ± 1.5 | -4.4 ± 1.6 |
| rsk1.RSK1 4.0 | 85.6% ± 3.7 | 88.0% ± 1.7 | -2.4 ± 3.8 |
| rtk.Tachikoma 1.0 | 84.3% ± 6.8 | 79.8% ± 2.9 | +4.5 ± 7.0 |
| rz.SmallDevil 1.502 | 92.5% ± 4.3 | 94.2% ± 1.4 | -1.8 ± 4.8 |
| satan.White 0.26 | 85.7% ± 1.5 | 91.1% ± 1.7 | -5.4 ± 2.2 |
| sheldor.nano.PointInLine 1.0 | 82.3% ± 3.5 | 81.0% ± 2.1 | +1.2 ± 4.1 |
| sheldor.nano.PointInLineRRAL 1.0.0 | 80.7% ± 2.5 | 88.9% ± 1.4 | -8.1 ± 3.3 |
| simonton.GFNano_D 3.1b | 84.5% ± 3.9 | 86.3% ± 2.5 | -1.8 ± 2.1 |
| simonton.nano.WeekendObsession_S 1.7 | 88.6% ± 2.6 | 84.4% ± 2.8 | +4.2 ± 3.2 |
| sm.Devil 7.3 | 83.4% ± 1.6 | 80.7% ± 3.3 | +2.7 ± 3.7 |
| spinnercat.CopyKat 1.2.3 | 89.0% ± 5.1 | 81.3% ± 2.3 | +7.7 ± 5.7 |
| spinnercat.Kitten 1.6 | 85.8% ± 3.5 | 83.3% ± 3.0 | +2.5 ± 3.0 |
| starpkg.StarViewerZ 1.26 | 94.5% ± 1.9 | 92.0% ± 1.1 | +2.4 ± 2.4 |
| stelo.MatchupMicro 1.2 | 82.5% ± 2.5 | 82.5% ± 3.4 | -0.0 ± 3.2 |
| stelo.PianistNano 1.3 | 85.0% ± 1.6 | 82.4% ± 2.5 | +2.6 ± 2.6 |
| stelo.SteloTestNano 1.0 | 91.2% ± 3.2 | 86.7% ± 2.2 | +4.5 ± 2.5 |
| suh.nano.RandomPM 1.02 | 83.0% ± 4.3 | 78.0% ± 2.3 | +5.0 ± 4.7 |
| syl.Centipede 0.5 | 96.6% ± 2.0 | 86.0% ± 2.7 | +10.5 ± 4.4 |
| tobe.Saturn lambda | 75.2% ± 1.8 | 81.1% ± 2.2 | -5.9 ± 3.8 |
| trab.nano.AinippeNano 1.3 | 79.8% ± 2.3 | 85.2% ± 3.5 | -5.4 ± 2.9 |
| tzu.TheArtOfWar 1.2 | 95.6% ± 4.5 | 89.8% ± 2.1 | +5.8 ± 4.2 |
| vuen.Fractal 0.55 | 96.3% ± 1.8 | 83.4% ± 2.5 | +12.9 ± 3.6 |
| whind.Constitution 0.7.1 | 76.8% ± 2.1 | 84.8% ± 3.0 | -8.0 ± 4.5 |
| wiki.mako.MakoHT 1.2.2.1 | 79.6% ± 1.6 | 92.4% ± 1.6 | -12.8 ± 2.6 |
| wiki.nano.RaikoNano 1.1 | 74.2% ± 1.2 | 77.6% ± 2.7 | -3.4 ± 1.9 |
| zen.Lindada 0.2 | 94.4% ± 2.1 | 81.5% ± 2.7 | +12.9 ± 3.6 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | -3.8 ± 3.1 | -3.9 ± 4.4 | -3.9 ± 4.4 | -8.4 ± 4.8 |
| KiraNL.Cataris 1.0 | -1.5 ± 7.4 | +0.7 ± 8.6 | +0.7 ± 8.6 | -6.6 ± 5.4 |
| PkKillers.PkAssassin 1.0 | -6.1 ± 2.3 | -2.1 ± 2.8 | -2.1 ± 2.8 | -12.7 ± 2.4 |
| alpha.BlackIce 1.0 | -8.3 ± 3.0 | -6.8 ± 2.2 | -6.8 ± 2.2 | -13.0 ± 3.5 |
| amk.ChumbaMini 0.2 | -4.7 ± 3.3 | -3.2 ± 3.2 | -3.2 ± 3.2 | -5.1 ± 3.4 |
| amk.ChumbaWumba 0.3 | +8.4 ± 5.3 | +2.5 ± 3.5 | +2.5 ± 3.5 | -7.5 ± 7.3 |
| apc.botM 3.0 | -10.7 ± 2.2 | -6.1 ± 3.0 | -6.1 ± 3.0 | -17.2 ± 3.8 |
| apv.NanoLauLectrik 1.0 | -7.7 ± 4.1 | -7.1 ± 3.8 | -7.1 ± 3.8 | -7.9 ± 4.3 |
| apv.NanoLauLectrikTheCannibal 1.1 | +4.4 ± 3.3 | -0.4 ± 2.7 | -0.4 ± 2.7 | +7.2 ± 3.7 |
| ary.nano.ColorNanoP 1.1 | -4.6 ± 1.2 | -0.7 ± 1.1 | -0.7 ± 1.1 | -8.2 ± 1.6 |
| asm.Statistas 0.1 | -2.4 ± 2.4 | -1.1 ± 2.9 | -1.1 ± 2.8 | -5.4 ± 1.6 |
| bigpete.Stewie 1.0 | -12.8 ± 2.2 | -6.1 ± 3.7 | -6.1 ± 3.7 | -19.7 ± 2.3 |
| brainfade.melee.Dusk 0.44 | +0.3 ± 2.9 | -1.1 ± 1.8 | -1.1 ± 1.8 | -31.9 ± 15.9 |
| buba.Archivist 0.1 | +4.8 ± 5.7 | -1.1 ± 4.8 | -1.1 ± 4.8 | -18.5 ± 8.7 |
| bvh.mini.Fenrir 0.39 | -0.8 ± 4.8 | -0.7 ± 6.5 | -0.7 ± 6.5 | -5.9 ± 4.0 |
| casey.Flee 1.0 | +6.6 ± 3.7 | +2.5 ± 1.5 | +2.5 ± 1.5 | -11.6 ± 10.6 |
| csm.NthGeneration 0.04 | -5.5 ± 3.4 | -2.9 ± 1.8 | -2.9 ± 1.8 | -25.5 ± 7.5 |
| demetrix.nano.Neutrino 0.27 | -5.7 ± 4.0 | -4.6 ± 5.3 | -4.6 ± 5.3 | -5.8 ± 3.8 |
| dmp.nano.Eve 3.41 | -8.7 ± 1.8 | -6.4 ± 3.8 | -6.4 ± 3.8 | -10.7 ± 2.6 |
| ds.OoV4 0.3b | +2.2 ± 2.0 | +1.1 ± 1.8 | +1.1 ± 1.8 | -21.7 ± 11.5 |
| dsx724.VSAB_EP3a 1.0 | -1.0 ± 2.7 | -0.4 ± 1.5 | -0.4 ± 1.5 | -23.4 ± 6.5 |
| dummy.micro.Sparrow 2.5 | -8.3 ± 1.9 | -5.0 ± 3.8 | -5.0 ± 3.8 | -22.4 ± 2.2 |
| dy.LevelOne 2.0 | -13.9 ± 1.6 | -12.1 ± 2.1 | -12.1 ± 2.1 | -15.4 ± 2.2 |
| dz.MostlyHarmlessNano 2.1 | -8.4 ± 2.6 | -2.1 ± 2.5 | -2.1 ± 2.5 | -27.0 ± 3.2 |
| et.Predator 1.8 | -2.3 ± 7.0 | -0.7 ± 6.2 | -0.7 ± 6.2 | -16.5 ± 6.0 |
| exauge.GateKeeper 1.1.121g | -3.3 ± 4.8 | -1.8 ± 6.5 | -1.8 ± 6.5 | -6.4 ± 4.2 |
| fcr.First 1.0 | -11.3 ± 0.6 | -0.4 ± 0.8 | -0.4 ± 0.8 | -18.7 ± 1.0 |
| fnc.bandit2002.Bandit2002 4.0.2 | -4.2 ± 3.5 | -1.1 ± 4.8 | -1.1 ± 4.8 | -8.3 ± 4.0 |
| frag.FragBot 1.0 | -11.9 ± 3.4 | -7.9 ± 6.2 | -7.9 ± 6.1 | -17.8 ± 3.2 |
| gh.nano.Grofvuil 0.2 | -5.0 ± 1.9 | -0.7 ± 1.1 | -0.7 ± 1.1 | -24.6 ± 4.2 |
| gu.MicroScoob 1.3 | -7.3 ± 2.5 | -4.6 ± 4.0 | -4.6 ± 4.0 | -13.8 ± 2.6 |
| ha2.T3 0.2 | +2.3 ± 4.5 | +0.4 ± 3.9 | +0.4 ± 3.9 | -5.7 ± 5.9 |
| hamilton.Hamilton 1.0 | -1.4 ± 2.6 | +3.9 ± 3.1 | +3.9 ± 3.1 | -13.4 ± 5.6 |
| ins.MobyNano 0.8 | +4.0 ± 3.8 | +1.1 ± 2.5 | +1.1 ± 2.5 | -11.6 ± 2.4 |
| jp.Perpy 16.0 | -7.8 ± 6.7 | -6.8 ± 9.4 | -6.8 ± 9.4 | -9.4 ± 4.0 |
| kawigi.nano.FunkyChicken 1.1 | +2.9 ± 3.4 | +0.7 ± 2.1 | +0.7 ± 2.1 | -13.3 ± 5.7 |
| kawigi.sbf.Barracuda 1.0 | -12.0 ± 4.1 | -7.1 ± 3.4 | -7.1 ± 3.4 | -33.8 ± 7.8 |
| kinsen.nano.Quarrelet 1.0 | -6.6 ± 4.0 | -7.9 ± 4.6 | -7.9 ± 4.6 | -4.2 ± 4.2 |
| krzysiek.robbo2.Robbo 1.0.0 | -8.4 ± 2.8 | -4.6 ± 1.8 | -4.6 ± 1.8 | -11.5 ± 3.4 |
| lechu.Ala 0.0.4 | -6.0 ± 3.5 | -5.0 ± 4.7 | -5.0 ± 4.7 | -7.9 ± 2.5 |
| lessonz.robocode.Oz 0.5.0 | -13.0 ± 1.3 | -3.2 ± 1.5 | -3.2 ± 1.5 | -24.8 ± 2.3 |
| lrem.magic.TormentedAngel Antiquitie | +4.8 ± 3.5 | +1.5 ± 2.6 | +1.4 ± 2.6 | -24.3 ± 9.3 |
| lrem.micro.FalseProphet Alpha | -4.2 ± 2.6 | -1.1 ± 3.1 | -1.1 ± 3.1 | -9.5 ± 3.0 |
| lrem.quickhack.QuickHack 1.0 | +0.2 ± 2.0 | +2.9 ± 2.2 | +2.9 ± 2.2 | -34.6 ± 6.2 |
| mb.Monte 0.1.0 | -4.8 ± 3.0 | -3.2 ± 3.2 | -3.2 ± 3.2 | -5.7 ± 2.9 |
| metal.small.MCool 1.21 | +5.3 ± 3.3 | +0.4 ± 2.7 | +0.4 ± 2.7 | -9.4 ± 9.6 |
| mladjo.AIR 0.7 | -0.9 ± 3.0 | -1.8 ± 3.1 | -1.8 ± 3.1 | -14.0 ± 5.0 |
| mladjo.Startko 1.0 | +0.0 ± 1.7 | +1.1 ± 1.8 | +1.1 ± 1.8 | -33.5 ± 6.7 |
| mld.LittleBlackBook 1.69e | -7.4 ± 1.0 | -0.4 ± 0.8 | -0.4 ± 0.8 | -11.9 ± 1.9 |
| mld.jdc.nano.LittleBlackBook 1.0 | -6.4 ± 0.9 | +0.4 ± 0.8 | +0.4 ± 0.8 | -10.7 ± 1.6 |
| myl.micro.NekoNinja 1.30 | +6.3 ± 2.9 | -0.4 ± 2.4 | -0.4 ± 2.4 | +0.8 ± 5.9 |
| myl.micro.Predator 1.50 | -11.3 ± 2.6 | -1.1 ± 1.2 | -1.1 ± 1.2 | -30.9 ± 4.5 |
| mz.Adept 2.65 | -8.9 ± 6.5 | -6.8 ± 5.6 | -6.8 ± 5.6 | -23.9 ± 8.8 |
| mz.AdeptBSB 1.03 | -8.0 ± 1.2 | +0.4 ± 0.8 | +0.4 ± 0.8 | -59.2 ± 12.6 |
| nat.nano.Ocnirp 1.73 | +7.0 ± 2.2 | +2.5 ± 1.5 | +2.5 ± 1.5 | -8.0 ± 3.5 |
| nat.nano.OcnirpPM 1.0 | +5.8 ± 4.8 | +1.8 ± 4.8 | +1.8 ± 4.8 | -16.7 ± 7.6 |
| nova.Snow 1.0 | +0.6 ± 4.8 | +4.0 ± 7.5 | +3.9 ± 7.4 | -3.8 ± 2.4 |
| pez.mini.Gouldingi 1.5 | -7.9 ± 7.3 | -3.2 ± 3.7 | -3.2 ± 3.7 | -15.9 ± 7.0 |
| qwaker00.Ahchoo 1.6 | +3.3 ± 5.2 | +3.9 ± 7.4 | +3.9 ± 7.4 | -8.2 ± 4.0 |
| ratosh.Nobo 0.21 | -15.9 ± 1.6 | -10.0 ± 2.6 | -10.0 ± 2.6 | -21.2 ± 2.6 |
| rdt199.Warlord 0.73 | -0.5 ± 7.3 | -1.8 ± 6.6 | -1.8 ± 6.6 | -7.7 ± 6.8 |
| rjw.RabidWombat 0.71 | -13.3 ± 3.0 | -8.6 ± 3.8 | -8.6 ± 3.8 | -24.4 ± 2.8 |
| robar.nano.MosquitoPM 1.0 | -1.3 ± 3.0 | -3.9 ± 2.2 | -3.9 ± 2.2 | -18.3 ± 10.2 |
| robar.nano.Prestige 1.0 | +1.7 ± 3.7 | +1.8 ± 4.6 | +1.8 ± 4.6 | -11.5 ± 3.6 |
| robar.nano.Scytodes 0.3 | -2.9 ± 2.5 | -0.4 ± 0.8 | -0.4 ± 0.8 | -14.8 ± 6.2 |
| robar.nano.Vespa 0.95 | -4.4 ± 1.6 | -0.7 ± 1.1 | -0.7 ± 1.1 | -29.8 ± 4.3 |
| rsk1.RSK1 4.0 | -2.4 ± 3.8 | -3.6 ± 4.0 | -3.6 ± 4.0 | -27.0 ± 9.1 |
| rtk.Tachikoma 1.0 | +4.5 ± 7.0 | +0.0 ± 7.0 | +0.0 ± 7.0 | -9.7 ± 6.0 |
| rz.SmallDevil 1.502 | -1.8 ± 4.8 | -2.9 ± 3.1 | -2.9 ± 3.1 | -14.7 ± 8.7 |
| satan.White 0.26 | -5.4 ± 2.2 | -0.7 ± 2.1 | -0.7 ± 2.1 | -39.4 ± 8.1 |
| sheldor.nano.PointInLine 1.0 | +1.2 ± 4.1 | -2.1 ± 3.6 | -2.1 ± 3.6 | -15.9 ± 7.2 |
| sheldor.nano.PointInLineRRAL 1.0.0 | -8.1 ± 3.3 | -5.4 ± 3.7 | -5.4 ± 3.7 | -10.2 ± 3.6 |
| simonton.GFNano_D 3.1b | -1.8 ± 2.1 | -3.6 ± 1.1 | -3.6 ± 1.1 | -11.5 ± 5.5 |
| simonton.nano.WeekendObsession_S 1.7 | +4.2 ± 3.2 | +0.4 ± 2.0 | +0.4 ± 2.0 | -7.9 ± 4.6 |
| sm.Devil 7.3 | +2.7 ± 3.7 | +4.3 ± 3.8 | +4.3 ± 3.8 | -9.8 ± 4.9 |
| spinnercat.CopyKat 1.2.3 | +7.7 ± 5.7 | -0.4 ± 5.6 | -0.4 ± 5.6 | +5.4 ± 7.8 |
| spinnercat.Kitten 1.6 | +2.5 ± 3.0 | -0.7 ± 2.5 | -0.7 ± 2.5 | -26.4 ± 8.2 |
| starpkg.StarViewerZ 1.26 | +2.4 ± 2.4 | +0.4 ± 2.0 | +0.4 ± 2.0 | -23.7 ± 7.7 |
| stelo.MatchupMicro 1.2 | -0.0 ± 3.2 | -2.9 ± 4.2 | -2.9 ± 4.2 | -0.9 ± 2.3 |
| stelo.PianistNano 1.3 | +2.6 ± 2.6 | -2.1 ± 2.1 | -2.1 ± 2.1 | -19.6 ± 5.6 |
| stelo.SteloTestNano 1.0 | +4.5 ± 2.5 | +0.0 ± 2.2 | +0.0 ± 2.2 | -7.2 ± 5.5 |
| suh.nano.RandomPM 1.02 | +5.0 ± 4.7 | +2.1 ± 2.8 | +2.1 ± 2.8 | -25.2 ± 8.7 |
| syl.Centipede 0.5 | +10.5 ± 4.4 | +2.5 ± 3.2 | +2.5 ± 3.2 | +5.1 ± 11.1 |
| tobe.Saturn lambda | -5.9 ± 3.8 | -5.7 ± 5.6 | -5.7 ± 5.6 | -7.0 ± 4.8 |
| trab.nano.AinippeNano 1.3 | -5.4 ± 2.9 | -3.9 ± 4.8 | -3.9 ± 4.8 | -7.8 ± 2.8 |
| tzu.TheArtOfWar 1.2 | +5.8 ± 4.2 | +0.4 ± 2.4 | +0.4 ± 2.4 | +2.1 ± 7.0 |
| vuen.Fractal 0.55 | +12.9 ± 3.6 | +3.6 ± 3.1 | +3.6 ± 3.1 | +17.0 ± 5.9 |
| whind.Constitution 0.7.1 | -8.0 ± 4.5 | -6.4 ± 5.1 | -6.4 ± 5.1 | -8.9 ± 5.7 |
| wiki.mako.MakoHT 1.2.2.1 | -12.8 ± 2.6 | -8.9 ± 3.2 | -8.9 ± 3.2 | -23.9 ± 8.9 |
| wiki.nano.RaikoNano 1.1 | -3.4 ± 1.9 | +0.7 ± 3.3 | +0.7 ± 3.3 | -6.3 ± 2.9 |
| zen.Lindada 0.2 | +12.9 ± 3.6 | +3.6 ± 2.5 | +3.6 ± 2.5 | +3.2 ± 10.4 |
| All pairs | -2.4 ± 0.6 | -1.8 ± 0.4 | -1.8 ± 0.4 | -14.1 ± 1.0 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or, for a Hadur build, a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | 8 | 4 | -3.8 ± 3.1 | -2.7 ± 6.9 |
| KiraNL.Cataris 1.0 | 8 | 4 | -1.5 ± 7.4 | -0.3 ± 6.8 |
| PkKillers.PkAssassin 1.0 | 8 | 6 | -6.1 ± 2.3 | -5.7 ± 2.0 |
| alpha.BlackIce 1.0 | 8 | 6 | -8.3 ± 3.0 | -6.9 ± 2.2 |
| amk.ChumbaMini 0.2 | 8 | 5 | -4.7 ± 3.3 | -3.8 ± 5.0 |
| amk.ChumbaWumba 0.3 | 8 | 5 | +8.4 ± 5.3 | +8.0 ± 8.5 |
| apc.botM 3.0 | 8 | 8 | -10.7 ± 2.2 | -10.7 ± 2.2 |
| apv.NanoLauLectrik 1.0 | 8 | 7 | -7.7 ± 4.1 | -9.3 ± 1.7 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 6 | +4.4 ± 3.3 | +3.7 ± 4.5 |
| ary.nano.ColorNanoP 1.1 | 8 | 8 | -4.6 ± 1.2 | -4.6 ± 1.2 |
| asm.Statistas 0.1 | 8 | 7 | -2.4 ± 2.4 | -2.5 ± 2.9 |
| bigpete.Stewie 1.0 | 8 | 5 | -12.8 ± 2.2 | -12.0 ± 3.8 |
| brainfade.melee.Dusk 0.44 | 8 | 7 | +0.3 ± 2.9 | +0.6 ± 3.3 |
| buba.Archivist 0.1 | 8 | 6 | +4.8 ± 5.7 | +5.5 ± 7.0 |
| bvh.mini.Fenrir 0.39 | 8 | 6 | -0.8 ± 4.8 | +0.3 ± 6.3 |
| casey.Flee 1.0 | 8 | 6 | +6.6 ± 3.7 | +6.4 ± 5.4 |
| csm.NthGeneration 0.04 | 8 | 5 | -5.5 ± 3.4 | -3.7 ± 3.5 |
| demetrix.nano.Neutrino 0.27 | 8 | 7 | -5.7 ± 4.0 | -6.7 ± 3.9 |
| dmp.nano.Eve 3.41 | 8 | 6 | -8.7 ± 1.8 | -8.8 ± 1.5 |
| ds.OoV4 0.3b | 8 | 7 | +2.2 ± 2.0 | +2.2 ± 2.4 |
| dsx724.VSAB_EP3a 1.0 | 8 | 7 | -1.0 ± 2.7 | -1.2 ± 3.2 |
| dummy.micro.Sparrow 2.5 | 8 | 8 | -8.3 ± 1.9 | -8.3 ± 1.9 |
| dy.LevelOne 2.0 | 8 | 7 | -13.9 ± 1.6 | -14.1 ± 1.8 |
| dz.MostlyHarmlessNano 2.1 | 8 | 8 | -8.4 ± 2.6 | -8.4 ± 2.6 |
| et.Predator 1.8 | 8 | 6 | -2.3 ± 7.0 | -4.3 ± 8.8 |
| exauge.GateKeeper 1.1.121g | 8 | 6 | -3.3 ± 4.8 | -2.8 ± 6.8 |
| fcr.First 1.0 | 8 | 5 | -11.3 ± 0.6 | -11.3 ± 1.1 |
| fnc.bandit2002.Bandit2002 4.0.2 | 8 | 6 | -4.2 ± 3.5 | -4.3 ± 4.9 |
| frag.FragBot 1.0 | 8 | 5 | -11.9 ± 3.4 | -11.3 ± 3.6 |
| gh.nano.Grofvuil 0.2 | 8 | 7 | -5.0 ± 1.9 | -4.9 ± 2.2 |
| gu.MicroScoob 1.3 | 8 | 8 | -7.3 ± 2.5 | -7.3 ± 2.5 |
| ha2.T3 0.2 | 8 | 6 | +2.3 ± 4.5 | +3.0 ± 6.0 |
| hamilton.Hamilton 1.0 | 8 | 6 | -1.4 ± 2.6 | -1.3 ± 3.8 |
| ins.MobyNano 0.8 | 8 | 6 | +4.0 ± 3.8 | +4.4 ± 3.8 |
| jp.Perpy 16.0 | 8 | 5 | -7.8 ± 6.7 | -5.4 ± 7.8 |
| kawigi.nano.FunkyChicken 1.1 | 8 | 6 | +2.9 ± 3.4 | +4.0 ± 4.4 |
| kawigi.sbf.Barracuda 1.0 | 8 | 5 | -12.0 ± 4.1 | -11.5 ± 7.4 |
| kinsen.nano.Quarrelet 1.0 | 8 | 5 | -6.6 ± 4.0 | -7.0 ± 3.8 |
| krzysiek.robbo2.Robbo 1.0.0 | 8 | 8 | -8.4 ± 2.8 | -8.4 ± 2.8 |
| lechu.Ala 0.0.4 | 8 | 5 | -6.0 ± 3.5 | -6.4 ± 5.6 |
| lessonz.robocode.Oz 0.5.0 | 8 | 7 | -13.0 ± 1.3 | -12.9 ± 1.5 |
| lrem.magic.TormentedAngel Antiquitie | 8 | 8 | +4.8 ± 3.5 | +4.8 ± 3.5 |
| lrem.micro.FalseProphet Alpha | 8 | 6 | -4.2 ± 2.6 | -5.0 ± 3.1 |
| lrem.quickhack.QuickHack 1.0 | 8 | 6 | +0.2 ± 2.0 | +0.5 ± 1.8 |
| mb.Monte 0.1.0 | 8 | 6 | -4.8 ± 3.0 | -6.3 ± 2.7 |
| metal.small.MCool 1.21 | 8 | 8 | +5.3 ± 3.3 | +5.3 ± 3.3 |
| mladjo.AIR 0.7 | 8 | 7 | -0.9 ± 3.0 | -1.0 ± 3.5 |
| mladjo.Startko 1.0 | 8 | 6 | +0.0 ± 1.7 | -0.8 ± 1.2 |
| mld.LittleBlackBook 1.69e | 8 | 6 | -7.4 ± 1.0 | -7.4 ± 1.4 |
| mld.jdc.nano.LittleBlackBook 1.0 | 8 | 6 | -6.4 ± 0.9 | -6.8 ± 0.5 |
| myl.micro.NekoNinja 1.30 | 8 | 6 | +6.3 ± 2.9 | +7.1 ± 3.8 |
| myl.micro.Predator 1.50 | 8 | 7 | -11.3 ± 2.6 | -11.3 ± 3.1 |
| mz.Adept 2.65 | 8 | 5 | -8.9 ± 6.5 | -10.1 ± 9.9 |
| mz.AdeptBSB 1.03 | 8 | 6 | -8.0 ± 1.2 | -8.6 ± 1.1 |
| nat.nano.Ocnirp 1.73 | 8 | 5 | +7.0 ± 2.2 | +7.3 ± 3.6 |
| nat.nano.OcnirpPM 1.0 | 8 | 7 | +5.8 ± 4.8 | +4.5 ± 4.6 |
| nova.Snow 1.0 | 8 | 6 | +0.6 ± 4.8 | -0.4 ± 5.7 |
| pez.mini.Gouldingi 1.5 | 8 | 7 | -7.9 ± 7.3 | -6.6 ± 8.0 |
| qwaker00.Ahchoo 1.6 | 8 | 7 | +3.3 ± 5.2 | +1.8 ± 4.5 |
| ratosh.Nobo 0.21 | 8 | 7 | -15.9 ± 1.6 | -15.7 ± 1.8 |
| rdt199.Warlord 0.73 | 8 | 7 | -0.5 ± 7.3 | +1.3 ± 7.1 |
| rjw.RabidWombat 0.71 | 8 | 7 | -13.3 ± 3.0 | -13.6 ± 3.5 |
| robar.nano.MosquitoPM 1.0 | 8 | 6 | -1.3 ± 3.0 | -2.1 ± 4.0 |
| robar.nano.Prestige 1.0 | 8 | 5 | +1.7 ± 3.7 | +2.3 ± 5.3 |
| robar.nano.Scytodes 0.3 | 8 | 8 | -2.9 ± 2.5 | -2.9 ± 2.5 |
| robar.nano.Vespa 0.95 | 8 | 8 | -4.4 ± 1.6 | -4.4 ± 1.6 |
| rsk1.RSK1 4.0 | 8 | 5 | -2.4 ± 3.8 | -3.8 ± 5.3 |
| rtk.Tachikoma 1.0 | 8 | 7 | +4.5 ± 7.0 | +7.2 ± 3.4 |
| rz.SmallDevil 1.502 | 8 | 7 | -1.8 ± 4.8 | -2.1 ± 5.6 |
| satan.White 0.26 | 8 | 7 | -5.4 ± 2.2 | -5.0 ± 2.4 |
| sheldor.nano.PointInLine 1.0 | 8 | 3 | +1.2 ± 4.1 | -1.2 ± 9.6 |
| sheldor.nano.PointInLineRRAL 1.0.0 | 8 | 7 | -8.1 ± 3.3 | -7.9 ± 3.9 |
| simonton.GFNano_D 3.1b | 8 | 7 | -1.8 ± 2.1 | -1.2 ± 1.9 |
| simonton.nano.WeekendObsession_S 1.7 | 8 | 4 | +4.2 ± 3.2 | +1.8 ± 6.5 |
| sm.Devil 7.3 | 8 | 6 | +2.7 ± 3.7 | +2.0 ± 3.7 |
| spinnercat.CopyKat 1.2.3 | 8 | 6 | +7.7 ± 5.7 | +6.6 ± 8.1 |
| spinnercat.Kitten 1.6 | 8 | 8 | +2.5 ± 3.0 | +2.5 ± 3.0 |
| starpkg.StarViewerZ 1.26 | 8 | 8 | +2.4 ± 2.4 | +2.4 ± 2.4 |
| stelo.MatchupMicro 1.2 | 8 | 2 | -0.0 ± 3.2 | +0.9 ± 36.6 |
| stelo.PianistNano 1.3 | 8 | 8 | +2.6 ± 2.6 | +2.6 ± 2.6 |
| stelo.SteloTestNano 1.0 | 8 | 7 | +4.5 ± 2.5 | +4.6 ± 3.0 |
| suh.nano.RandomPM 1.02 | 8 | 7 | +5.0 ± 4.7 | +4.3 ± 5.2 |
| syl.Centipede 0.5 | 8 | 7 | +10.5 ± 4.4 | +9.3 ± 3.9 |
| tobe.Saturn lambda | 8 | 6 | -5.9 ± 3.8 | -7.0 ± 4.6 |
| trab.nano.AinippeNano 1.3 | 8 | 6 | -5.4 ± 2.9 | -5.2 ± 4.2 |
| tzu.TheArtOfWar 1.2 | 8 | 7 | +5.8 ± 4.2 | +5.8 ± 5.1 |
| vuen.Fractal 0.55 | 8 | 6 | +12.9 ± 3.6 | +14.1 ± 4.7 |
| whind.Constitution 0.7.1 | 8 | 8 | -8.0 ± 4.5 | -8.0 ± 4.5 |
| wiki.mako.MakoHT 1.2.2.1 | 8 | 6 | -12.8 ± 2.6 | -11.4 ± 2.1 |
| wiki.nano.RaikoNano 1.1 | 8 | 7 | -3.4 ± 1.9 | -3.4 ± 2.3 |
| zen.Lindada 0.2 | 8 | 7 | +12.9 ± 3.6 | +12.9 ± 4.3 |
| All pairs | 728 | 575 | -2.4 ± 0.6 | -2.4 ± 0.6 |

# Bench: hadur2.Hadur 3.9sa baseline (hadur2.Hadur 3.9) (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 8653 over 728 battles (11.9 per battle, most in one battle 96). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | sweep-low | 83.6% ± 1.3 | 96.4% ± 1.1 | 69.2% ± 2.1 | 270 / 280 | 14.1% ± 1.4 | 5.2% ± 0.7 | 87 | 0 | 0.88 / 15.5 |
| KiraNL.Cataris 1.0 | sweep-low | 77.0% ± 4.2 | 90.0% ± 4.8 | 64.7% ± 3.7 | 252 / 280 | 16.6% ± 0.7 | 10.0% ± 6.3 | 111 | 0 | 1.00 / 14.6 |
| PkKillers.PkAssassin 1.0 | sweep-low | 90.7% ± 0.9 | 99.3% ± 1.1 | 81.9% ± 1.9 | 278 / 280 | 19.7% ± 1.9 | 6.1% ± 0.8 | 101 | 0 | 0.82 / 13.0 |
| alpha.BlackIce 1.0 | sweep-low | 83.4% ± 1.3 | 97.1% ± 2.2 | 70.3% ± 2.0 | 272 / 280 | 16.9% ± 1.1 | 7.0% ± 0.7 | 92 | 0 | 0.89 / 331.7 |
| amk.ChumbaMini 0.2 | sweep-low | 80.3% ± 1.8 | 94.6% ± 1.5 | 65.3% ± 3.1 | 265 / 280 | 16.2% ± 0.9 | 5.8% ± 0.7 | 181 | 0 | 0.84 / 14.1 |
| amk.ChumbaWumba 0.3 | sweep-low | 80.7% ± 4.6 | 95.0% ± 3.1 | 62.4% ± 6.0 | 266 / 280 | 11.9% ± 1.1 | 4.3% ± 1.1 | 109 | 0 | 0.90 / 14.6 |
| apc.botM 3.0 | sweep-low | 88.2% ± 2.4 | 97.1% ± 2.6 | 78.4% ± 3.0 | 272 / 280 | 15.1% ± 1.3 | 4.7% ± 0.6 | 87 | 0 | 0.80 / 16.3 |
| apv.NanoLauLectrik 1.0 | sweep-low | 80.0% ± 3.5 | 94.3% ± 3.6 | 64.9% ± 3.1 | 264 / 280 | 16.4% ± 0.9 | 5.8% ± 0.5 | 96 | 0 | 1.01 / 13.2 |
| apv.NanoLauLectrikTheCannibal 1.1 | sweep-low | 85.5% ± 1.8 | 97.5% ± 2.0 | 73.9% ± 1.2 | 273 / 280 | 22.7% ± 1.9 | 7.3% ± 1.1 | 91 | 0 | 0.80 / 13.0 |
| ary.nano.ColorNanoP 1.1 | sweep-low | 88.5% ± 0.9 | 100.0% ± 0.0 | 78.3% ± 1.5 | 280 / 280 | 23.6% ± 0.8 | 7.4% ± 0.6 | 85 | 0 | 0.80 / 112.6 |
| asm.Statistas 0.1 | sweep-low | 81.5% ± 1.8 | 97.1% ± 1.8 | 63.9% ± 2.0 | 272 / 280 | 13.5% ± 0.8 | 5.0% ± 0.3 | 96 | 0 | 0.89 / 16.3 |
| bigpete.Stewie 1.0 | sweep-low | 96.3% ± 0.5 | 99.6% ± 0.8 | 92.4% ± 1.2 | 279 / 280 | 19.0% ± 0.7 | 2.2% ± 0.2 | 88 | 0 | 0.68 / 15.7 |
| brainfade.melee.Dusk 0.44 | sweep-low | 92.8% ± 1.4 | 99.6% ± 0.9 | 84.9% ± 2.2 | 279 / 280 | 13.3% ± 0.9 | 3.8% ± 0.4 | 97 | 0 | 0.75 / 47.5 |
| buba.Archivist 0.1 | sweep-low | 84.2% ± 2.7 | 97.9% ± 2.1 | 70.5% ± 4.0 | 274 / 280 | 19.2% ± 2.0 | 6.3% ± 0.9 | 82 | 0 | 0.91 / 35.4 |
| bvh.mini.Fenrir 0.39 | sweep-low | 79.3% ± 3.0 | 92.8% ± 4.4 | 67.1% ± 2.5 | 260 / 280 | 18.1% ± 1.0 | 7.6% ± 0.8 | 111 | 0 | 0.91 / 48.9 |
| casey.Flee 1.0 | sweep-low | 84.4% ± 3.0 | 96.8% ± 2.4 | 69.3% ± 4.3 | 271 / 280 | 14.4% ± 0.8 | 4.9% ± 0.5 | 93 | 0 | 0.90 / 67.2 |
| csm.NthGeneration 0.04 | sweep-low | 94.9% ± 1.2 | 100.0% ± 0.0 | 89.5% ± 2.3 | 280 / 280 | 20.1% ± 0.6 | 3.0% ± 0.7 | 89 | 0 | 0.74 / 13.9 |
| demetrix.nano.Neutrino 0.27 | sweep-low | 80.1% ± 3.3 | 94.6% ± 4.1 | 64.5% ± 3.4 | 265 / 280 | 13.7% ± 0.9 | 6.1% ± 0.9 | 88 | 0 | 0.89 / 78.0 |
| dmp.nano.Eve 3.41 | sweep-low | 93.3% ± 1.2 | 99.6% ± 0.8 | 87.5% ± 1.7 | 279 / 280 | 36.1% ± 1.1 | 4.9% ± 0.7 | 88 | 0 | 0.70 / 11.0 |
| ds.OoV4 0.3b | sweep-low | 90.3% ± 1.4 | 97.9% ± 2.5 | 83.2% ± 1.4 | 274 / 280 | 17.6% ± 0.8 | 7.0% ± 0.5 | 115 | 0 | 1.02 / 15.5 |
| dsx724.VSAB_EP3a 1.0 | sweep-low | 96.8% ± 0.7 | 99.6% ± 0.8 | 93.9% ± 1.1 | 279 / 280 | 18.5% ± 0.8 | 3.1% ± 0.4 | 86 | 0 | 0.65 / 35.7 |
| dummy.micro.Sparrow 2.5 | sweep-low | 88.1% ± 2.0 | 98.2% ± 1.8 | 77.9% ± 3.4 | 275 / 280 | 18.6% ± 1.1 | 5.6% ± 0.7 | 86 | 0 | 0.84 / 285.2 |
| dy.LevelOne 2.0 | sweep-low | 97.0% ± 0.6 | 100.0% ± 0.0 | 94.0% ± 1.2 | 280 / 280 | 29.5% ± 1.0 | 2.5% ± 0.7 | 85 | 0 | 0.70 / 12.2 |
| dz.MostlyHarmlessNano 2.1 | sweep-low | 93.4% ± 1.4 | 98.6% ± 1.3 | 88.2% ± 1.8 | 276 / 280 | 31.7% ± 1.7 | 4.3% ± 0.7 | 92 | 0 | 0.75 / 12.1 |
| et.Predator 1.8 | sweep-low | 87.3% ± 3.7 | 96.8% ± 2.7 | 76.5% ± 5.0 | 271 / 280 | 15.8% ± 0.9 | 4.0% ± 0.7 | 88 | 0 | 1.00 / 15.5 |
| exauge.GateKeeper 1.1.121g | sweep-low | 77.4% ± 3.4 | 92.5% ± 3.4 | 62.0% ± 3.8 | 259 / 280 | 14.3% ± 1.0 | 7.3% ± 0.9 | 98 | 0 | 0.96 / 13.7 |
| fcr.First 1.0 | sweep-low | 98.3% ± 0.5 | 100.0% ± 0.0 | 96.6% ± 1.0 | 280 / 280 | 41.3% ± 1.4 | 1.8% ± 0.6 | 91 | 0 | 0.57 / 10.7 |
| fnc.bandit2002.Bandit2002 4.0.2 | sweep-low | 82.8% ± 2.7 | 91.8% ± 2.7 | 74.4% ± 3.0 | 257 / 280 | 19.6% ± 1.0 | 7.8% ± 0.7 | 85 | 0 | 0.84 / 15.7 |
| frag.FragBot 1.0 | sweep-low | 89.5% ± 2.6 | 97.5% ± 2.4 | 81.5% ± 3.5 | 273 / 280 | 20.6% ± 0.8 | 5.0% ± 1.0 | 88 | 0 | 0.82 / 13.5 |
| gh.nano.Grofvuil 0.2 | sweep-low | 98.1% ± 0.6 | 100.0% ± 0.0 | 96.3% ± 1.1 | 280 / 280 | 41.2% ± 1.8 | 1.8% ± 0.4 | 85 | 0 | 0.64 / 10.4 |
| gu.MicroScoob 1.3 | sweep-low | 90.0% ± 2.2 | 98.9% ± 1.8 | 80.9% ± 2.8 | 277 / 280 | 22.3% ± 1.0 | 4.5% ± 0.8 | 89 | 0 | 0.76 / 128.1 |
| ha2.T3 0.2 | sweep-low | 87.0% ± 2.7 | 96.8% ± 3.0 | 77.7% ± 2.9 | 271 / 280 | 20.7% ± 0.8 | 6.2% ± 0.8 | 99 | 0 | 0.89 / 259.0 |
| hamilton.Hamilton 1.0 | sweep-low | 84.7% ± 2.6 | 91.8% ± 2.7 | 77.6% ± 3.3 | 257 / 280 | 16.9% ± 0.9 | 8.2% ± 0.9 | 94 | 0 | 1.04 / 212.4 |
| ins.MobyNano 0.8 | sweep-low | 82.3% ± 1.9 | 96.4% ± 1.7 | 65.9% ± 2.5 | 270 / 280 | 15.5% ± 1.2 | 6.5% ± 2.0 | 94 | 0 | 0.88 / 14.4 |
| jp.Perpy 16.0 | sweep-low | 85.6% ± 2.6 | 94.3% ± 2.9 | 77.0% ± 2.9 | 264 / 280 | 17.9% ± 0.9 | 8.3% ± 0.8 | 94 | 0 | 0.94 / 17.0 |
| kawigi.nano.FunkyChicken 1.1 | sweep-low | 84.8% ± 1.3 | 97.1% ± 1.8 | 71.4% ± 2.5 | 272 / 280 | 18.5% ± 1.3 | 5.5% ± 0.4 | 88 | 0 | 0.89 / 14.1 |
| kawigi.sbf.Barracuda 1.0 | sweep-low | 97.6% ± 0.9 | 100.0% ± 0.0 | 93.7% ± 2.2 | 280 / 280 | 13.8% ± 1.0 | 0.8% ± 0.4 | 82 | 0 | 0.70 / 14.5 |
| kinsen.nano.Quarrelet 1.0 | sweep-low | 79.0% ± 3.4 | 94.3% ± 3.4 | 61.6% ± 3.3 | 264 / 280 | 14.8% ± 1.1 | 5.5% ± 0.7 | 99 | 0 | 0.95 / 14.5 |
| krzysiek.robbo2.Robbo 1.0.0 | sweep-low | 89.7% ± 2.1 | 99.3% ± 1.1 | 80.8% ± 3.1 | 278 / 280 | 25.7% ± 1.4 | 6.3% ± 1.0 | 142 | 0 | 0.77 / 12.5 |
| lechu.Ala 0.0.4 | sweep-low | 81.7% ± 2.8 | 89.3% ± 4.2 | 74.6% ± 2.0 | 250 / 280 | 18.1% ± 0.7 | 9.2% ± 0.8 | 116 | 0 | 1.49 / 16.0 |
| lessonz.robocode.Oz 0.5.0 | sweep-low | 97.4% ± 0.6 | 100.0% ± 0.0 | 94.5% ± 1.3 | 280 / 280 | 18.6% ± 0.8 | 1.5% ± 0.4 | 83 | 0 | 0.67 / 40.9 |
| lrem.magic.TormentedAngel Antiquitie | sweep-low | 82.3% ± 2.4 | 96.8% ± 2.0 | 67.5% ± 2.5 | 271 / 280 | 15.2% ± 0.9 | 6.1% ± 0.6 | 112 | 0 | 0.98 / 15.2 |
| lrem.micro.FalseProphet Alpha | sweep-low | 86.9% ± 1.5 | 98.9% ± 1.2 | 77.4% ± 2.1 | 277 / 280 | 27.2% ± 2.1 | 10.7% ± 0.9 | 93 | 0 | 0.85 / 106.2 |
| lrem.quickhack.QuickHack 1.0 | sweep-low | 88.5% ± 2.1 | 96.1% ± 2.8 | 81.7% ± 2.1 | 269 / 280 | 25.8% ± 1.7 | 7.9% ± 0.7 | 101 | 0 | 0.84 / 13.3 |
| mb.Monte 0.1.0 | sweep-low | 86.6% ± 2.2 | 96.1% ± 2.5 | 78.4% ± 2.0 | 269 / 280 | 26.4% ± 1.7 | 8.6% ± 1.0 | 77 | 0 | 0.78 / 13.2 |
| metal.small.MCool 1.21 | sweep-low | 88.8% ± 2.0 | 98.2% ± 1.8 | 75.7% ± 2.9 | 275 / 280 | 12.9% ± 1.2 | 3.2% ± 0.3 | 84 | 0 | 0.86 / 30.8 |
| mladjo.AIR 0.7 | sweep-low | 82.8% ± 1.8 | 97.1% ± 1.8 | 67.7% ± 2.1 | 272 / 280 | 15.0% ± 1.1 | 6.0% ± 0.4 | 99 | 0 | 0.87 / 14.9 |
| mladjo.Startko 1.0 | sweep-low | 86.0% ± 1.8 | 97.9% ± 2.1 | 76.2% ± 1.9 | 274 / 280 | 23.8% ± 1.0 | 9.7% ± 0.8 | 88 | 0 | 0.72 / 73.0 |
| mld.LittleBlackBook 1.69e | sweep-low | 95.3% ± 1.0 | 100.0% ± 0.0 | 91.3% ± 1.8 | 280 / 280 | 58.9% ± 1.8 | 6.8% ± 1.6 | 127 | 0 | 0.65 / 12.8 |
| mld.jdc.nano.LittleBlackBook 1.0 | sweep-low | 94.4% ± 1.0 | 99.6% ± 0.8 | 89.9% ± 1.7 | 279 / 280 | 58.8% ± 1.8 | 7.9% ± 1.1 | 142 | 0 | 0.67 / 254.5 |
| myl.micro.NekoNinja 1.30 | sweep-low | 87.5% ± 1.5 | 98.9% ± 1.2 | 74.5% ± 2.0 | 277 / 280 | 14.0% ± 0.7 | 4.8% ± 0.7 | 100 | 0 | 0.88 / 15.5 |
| myl.micro.Predator 1.50 | sweep-low | 97.0% ± 1.5 | 100.0% ± 0.0 | 92.3% ± 3.6 | 280 / 280 | 12.8% ± 0.8 | 1.1% ± 0.5 | 85 | 0 | 0.74 / 18.4 |
| mz.Adept 2.65 | sweep-low | 89.9% ± 3.4 | 98.6% ± 1.3 | 81.2% ± 5.4 | 276 / 280 | 23.5% ± 1.8 | 6.1% ± 4.2 | 91 | 0 | 0.69 / 12.0 |
| mz.AdeptBSB 1.03 | sweep-low | 98.3% ± 1.0 | 99.6% ± 0.8 | 96.8% ± 1.6 | 279 / 280 | 24.7% ± 1.5 | 1.3% ± 0.9 | 91 | 0 | 0.63 / 135.1 |
| nat.nano.Ocnirp 1.73 | sweep-low | 79.2% ± 1.9 | 95.7% ± 1.8 | 60.5% ± 2.3 | 268 / 280 | 14.1% ± 1.5 | 7.5% ± 2.4 | 98 | 0 | 0.92 / 16.4 |
| nat.nano.OcnirpPM 1.0 | sweep-low | 76.7% ± 2.1 | 93.2% ± 3.1 | 59.2% ± 1.7 | 261 / 280 | 14.4% ± 1.2 | 6.9% ± 0.7 | 80 | 0 | 0.92 / 14.0 |
| nova.Snow 1.0 | sweep-low | 77.6% ± 2.2 | 86.7% ± 3.5 | 69.1% ± 2.0 | 243 / 280 | 16.2% ± 0.6 | 9.0% ± 0.7 | 94 | 0 | 1.01 / 15.4 |
| pez.mini.Gouldingi 1.5 | sweep-low | 90.6% ± 2.1 | 99.3% ± 1.1 | 78.3% ± 3.2 | 278 / 280 | 13.9% ± 0.7 | 2.8% ± 0.4 | 79 | 0 | 0.76 / 15.2 |
| qwaker00.Ahchoo 1.6 | sweep-low | 82.0% ± 2.9 | 89.6% ± 5.4 | 74.3% ± 1.3 | 251 / 280 | 16.3% ± 0.8 | 7.2% ± 0.6 | 92 | 0 | 0.85 / 16.5 |
| ratosh.Nobo 0.21 | sweep-low | 96.5% ± 0.7 | 100.0% ± 0.0 | 92.0% ± 1.5 | 280 / 280 | 20.0% ± 1.0 | 1.7% ± 0.3 | 92 | 0 | 0.68 / 11.5 |
| rdt199.Warlord 0.73 | sweep-low | 85.3% ± 2.1 | 96.4% ± 2.8 | 74.0% ± 1.9 | 270 / 280 | 17.4% ± 0.9 | 6.4% ± 0.6 | 109 | 0 | 0.89 / 16.8 |
| rjw.RabidWombat 0.71 | sweep-low | 95.0% ± 1.6 | 100.0% ± 0.0 | 90.0% ± 3.1 | 280 / 280 | 27.8% ± 1.4 | 3.0% ± 1.0 | 88 | 0 | 0.81 / 331.3 |
| robar.nano.MosquitoPM 1.0 | sweep-low | 84.2% ± 2.8 | 97.1% ± 2.9 | 71.1% ± 2.8 | 272 / 280 | 18.8% ± 1.6 | 6.4% ± 0.5 | 101 | 0 | 0.92 / 230.2 |
| robar.nano.Prestige 1.0 | sweep-low | 72.5% ± 4.1 | 87.9% ± 5.1 | 57.5% ± 3.0 | 246 / 280 | 14.5% ± 0.7 | 7.1% ± 0.6 | 85 | 0 | 1.02 / 14.6 |
| robar.nano.Scytodes 0.3 | sweep-low | 95.1% ± 1.0 | 100.0% ± 0.0 | 90.8% ± 1.8 | 280 / 280 | 51.0% ± 1.8 | 5.0% ± 0.8 | 78 | 0 | 0.69 / 11.5 |
| robar.nano.Vespa 0.95 | sweep-low | 91.2% ± 1.5 | 100.0% ± 0.0 | 82.9% ± 2.6 | 280 / 280 | 26.9% ± 1.2 | 6.0% ± 1.0 | 86 | 0 | 0.81 / 12.2 |
| rsk1.RSK1 4.0 | sweep-low | 88.0% ± 1.7 | 97.9% ± 2.5 | 78.0% ± 2.7 | 274 / 280 | 16.8% ± 1.1 | 5.9% ± 0.7 | 95 | 0 | 0.93 / 14.8 |
| rtk.Tachikoma 1.0 | sweep-low | 79.8% ± 2.9 | 94.3% ± 3.6 | 66.2% ± 2.1 | 264 / 280 | 16.1% ± 0.7 | 7.3% ± 0.7 | 95 | 0 | 1.17 / 256.8 |
| rz.SmallDevil 1.502 | sweep-low | 94.2% ± 1.4 | 99.6% ± 0.8 | 87.5% ± 2.4 | 279 / 280 | 18.6% ± 0.7 | 2.4% ± 0.5 | 88 | 0 | 0.66 / 12.5 |
| satan.White 0.26 | sweep-low | 91.1% ± 1.7 | 99.3% ± 1.1 | 83.2% ± 3.2 | 278 / 280 | 23.7% ± 1.9 | 5.3% ± 1.0 | 89 | 0 | 0.75 / 14.9 |
| sheldor.nano.PointInLine 1.0 | sweep-low | 81.0% ± 2.1 | 97.1% ± 1.8 | 61.4% ± 3.8 | 272 / 280 | 14.1% ± 1.0 | 5.3% ± 0.5 | 102 | 0 | 0.91 / 13.6 |
| sheldor.nano.PointInLineRRAL 1.0.0 | sweep-low | 88.9% ± 1.4 | 98.9% ± 1.8 | 79.1% ± 1.6 | 277 / 280 | 19.6% ± 0.8 | 6.5% ± 0.7 | 86 | 0 | 0.76 / 14.3 |
| simonton.GFNano_D 3.1b | sweep-low | 86.3% ± 2.5 | 97.5% ± 1.5 | 73.7% ± 3.5 | 273 / 280 | 17.5% ± 1.2 | 4.7% ± 0.8 | 85 | 0 | 0.85 / 13.4 |
| simonton.nano.WeekendObsession_S 1.7 | sweep-low | 84.4% ± 2.8 | 96.8% ± 2.7 | 71.3% ± 3.0 | 271 / 280 | 22.4% ± 0.9 | 6.2% ± 0.7 | 89 | 0 | 0.85 / 12.8 |
| sm.Devil 7.3 | sweep-low | 80.7% ± 3.3 | 92.1% ± 3.8 | 69.8% ± 2.8 | 258 / 280 | 14.8% ± 0.4 | 7.9% ± 0.6 | 176 | 0 | 1.41 / 17.6 |
| spinnercat.CopyKat 1.2.3 | sweep-low | 81.3% ± 2.3 | 94.6% ± 3.5 | 67.7% ± 2.2 | 265 / 280 | 20.0% ± 0.5 | 7.0% ± 0.9 | 77 | 0 | 0.84 / 12.7 |
| spinnercat.Kitten 1.6 | sweep-low | 83.3% ± 3.0 | 97.1% ± 2.6 | 68.9% ± 3.2 | 272 / 280 | 18.2% ± 0.7 | 6.4% ± 0.8 | 82 | 0 | 0.85 / 16.5 |
| starpkg.StarViewerZ 1.26 | sweep-low | 92.0% ± 1.1 | 98.9% ± 1.2 | 84.9% ± 1.7 | 277 / 280 | 16.7% ± 0.6 | 4.3% ± 0.7 | 100 | 0 | 0.85 / 16.5 |
| stelo.MatchupMicro 1.2 | sweep-low | 82.5% ± 3.4 | 93.6% ± 4.4 | 71.9% ± 3.1 | 262 / 280 | 18.0% ± 1.1 | 6.4% ± 0.9 | 87 | 0 | 1.11 / 107.6 |
| stelo.PianistNano 1.3 | sweep-low | 82.4% ± 2.5 | 97.1% ± 2.2 | 65.6% ± 2.7 | 272 / 280 | 15.4% ± 1.0 | 5.4% ± 0.5 | 90 | 0 | 0.85 / 13.6 |
| stelo.SteloTestNano 1.0 | sweep-low | 86.7% ± 2.2 | 97.1% ± 2.2 | 76.1% ± 2.6 | 272 / 280 | 21.1% ± 0.9 | 5.3% ± 0.9 | 79 | 0 | 0.78 / 12.8 |
| suh.nano.RandomPM 1.02 | sweep-low | 78.0% ± 2.3 | 93.9% ± 2.0 | 62.4% ± 2.7 | 263 / 280 | 16.0% ± 0.9 | 7.9% ± 0.8 | 91 | 0 | 1.02 / 13.9 |
| syl.Centipede 0.5 | sweep-low | 86.0% ± 2.7 | 96.8% ± 2.4 | 73.0% ± 3.3 | 271 / 280 | 15.2% ± 1.5 | 4.0% ± 0.5 | 88 | 0 | 0.87 / 17.6 |
| tobe.Saturn lambda | sweep-low | 81.1% ± 2.2 | 93.2% ± 2.8 | 69.3% ± 3.1 | 261 / 280 | 17.0% ± 1.0 | 6.4% ± 0.6 | 90 | 0 | 0.94 / 14.2 |
| trab.nano.AinippeNano 1.3 | sweep-low | 85.2% ± 3.5 | 97.5% ± 3.5 | 74.1% ± 3.7 | 273 / 280 | 19.3% ± 0.9 | 8.5% ± 1.2 | 88 | 0 | 0.97 / 14.4 |
| tzu.TheArtOfWar 1.2 | sweep-low | 89.8% ± 2.1 | 98.6% ± 1.3 | 82.1% ± 3.0 | 276 / 280 | 24.4% ± 1.1 | 8.0% ± 1.0 | 97 | 0 | 0.80 / 188.2 |
| vuen.Fractal 0.55 | sweep-low | 83.4% ± 2.5 | 96.1% ± 2.8 | 70.5% ± 2.8 | 269 / 280 | 17.2% ± 0.8 | 6.4% ± 1.7 | 99 | 0 | 0.90 / 13.8 |
| whind.Constitution 0.7.1 | sweep-low | 84.8% ± 3.0 | 96.8% ± 3.2 | 72.3% ± 3.6 | 271 / 280 | 15.5% ± 1.0 | 5.8% ± 0.8 | 96 | 0 | 0.98 / 15.4 |
| wiki.mako.MakoHT 1.2.2.1 | sweep-low | 92.4% ± 1.6 | 99.3% ± 1.1 | 83.1% ± 2.1 | 278 / 280 | 14.5% ± 1.9 | 2.8% ± 0.6 | 77 | 0 | 0.73 / 13.5 |
| wiki.nano.RaikoNano 1.1 | sweep-low | 77.6% ± 2.7 | 93.2% ± 3.1 | 58.7% ± 2.9 | 261 / 280 | 11.1% ± 0.5 | 5.5% ± 0.5 | 100 | 0 | 0.97 / 16.0 |
| zen.Lindada 0.2 | sweep-low | 81.5% ± 2.7 | 96.1% ± 2.5 | 65.5% ± 2.9 | 269 / 280 | 13.7% ± 0.6 | 5.0% ± 0.7 | 84 | 0 | 0.90 / 15.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | 8 | 744 | 8.4% | 88.1% | 0.0% | 3.5% | 671 |
| KiraNL.Cataris 1.0 | 8 | 1151 | 15.2% | 78.0% | 0.0% | 6.8% | 611 |
| PkKillers.PkAssassin 1.0 | 8 | 468 | 2.7% | 96.4% | 0.0% | 0.9% | 547 |
| alpha.BlackIce 1.0 | 8 | 836 | 6.0% | 91.2% | 0.0% | 2.8% | 607 |
| amk.ChumbaMini 0.2 | 8 | 925 | 10.1% | 85.2% | 0.2% | 4.4% | 552 |
| amk.ChumbaWumba 0.3 | 8 | 799 | 10.9% | 84.0% | 0.0% | 5.1% | 606 |
| apc.botM 3.0 | 8 | 546 | 9.2% | 87.2% | 0.0% | 3.6% | 727 |
| apv.NanoLauLectrik 1.0 | 8 | 932 | 10.7% | 84.1% | 0.0% | 5.1% | 535 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 746 | 5.9% | 91.4% | 0.0% | 2.7% | 473 |
| ary.nano.ColorNanoP 1.1 | 8 | 622 | 0.0% | 100.0% | 0.0% | 0.0% | 442 |
| asm.Statistas 0.1 | 8 | 821 | 6.1% | 91.0% | 0.0% | 2.9% | 619 |
| bigpete.Stewie 1.0 | 8 | 178 | 3.5% | 95.7% | 0.0% | 0.8% | 573 |
| brainfade.melee.Dusk 0.44 | 8 | 331 | 1.9% | 97.6% | 0.0% | 0.5% | 947 |
| buba.Archivist 0.1 | 8 | 772 | 4.9% | 93.0% | 0.0% | 2.1% | 521 |
| bvh.mini.Fenrir 0.39 | 8 | 1074 | 11.6% | 83.3% | 0.0% | 5.0% | 594 |
| casey.Flee 1.0 | 8 | 672 | 8.4% | 88.1% | 0.0% | 3.5% | 582 |
| csm.NthGeneration 0.04 | 8 | 247 | 0.0% | 100.0% | 0.0% | 0.0% | 517 |
| demetrix.nano.Neutrino 0.27 | 8 | 918 | 10.2% | 85.4% | 0.0% | 4.4% | 684 |
| dmp.nano.Eve 3.41 | 8 | 359 | 1.7% | 97.4% | 0.0% | 0.9% | 367 |
| ds.OoV4 0.3b | 8 | 515 | 7.3% | 90.6% | 0.0% | 2.2% | 747 |
| dsx724.VSAB_EP3a 1.0 | 8 | 167 | 3.7% | 95.3% | 0.0% | 1.0% | 760 |
| dummy.micro.Sparrow 2.5 | 8 | 591 | 5.3% | 92.4% | 0.0% | 2.3% | 539 |
| dy.LevelOne 2.0 | 8 | 161 | 0.0% | 99.9% | 0.1% | 0.0% | 419 |
| dz.MostlyHarmlessNano 2.1 | 8 | 342 | 7.3% | 90.3% | 0.0% | 2.4% | 444 |
| et.Predator 1.8 | 8 | 573 | 9.8% | 85.4% | 0.3% | 4.5% | 599 |
| exauge.GateKeeper 1.1.121g | 8 | 1064 | 12.3% | 82.5% | 0.0% | 5.2% | 636 |
| fcr.First 1.0 | 8 | 93 | 0.0% | 99.6% | 0.4% | 0.0% | 354 |
| fnc.bandit2002.Bandit2002 4.0.2 | 8 | 925 | 15.5% | 78.2% | 0.0% | 6.2% | 572 |
| frag.FragBot 1.0 | 8 | 524 | 8.4% | 88.4% | 0.0% | 3.3% | 521 |
| gh.nano.Grofvuil 0.2 | 8 | 102 | 0.0% | 99.9% | 0.1% | 0.0% | 362 |
| gu.MicroScoob 1.3 | 8 | 491 | 3.8% | 94.0% | 0.5% | 1.7% | 455 |
| ha2.T3 0.2 | 8 | 669 | 8.4% | 87.9% | 0.0% | 3.7% | 517 |
| hamilton.Hamilton 1.0 | 8 | 787 | 18.3% | 75.0% | 0.1% | 6.7% | 803 |
| ins.MobyNano 0.8 | 8 | 784 | 8.0% | 88.2% | 0.1% | 3.8% | 548 |
| jp.Perpy 16.0 | 8 | 741 | 13.5% | 81.7% | 0.0% | 4.7% | 726 |
| kawigi.nano.FunkyChicken 1.1 | 8 | 700 | 7.1% | 89.6% | 0.0% | 3.2% | 506 |
| kawigi.sbf.Barracuda 1.0 | 8 | 91 | 0.0% | 99.9% | 0.1% | 0.0% | 553 |
| kinsen.nano.Quarrelet 1.0 | 8 | 932 | 10.7% | 84.5% | 0.0% | 4.8% | 563 |
| krzysiek.robbo2.Robbo 1.0.0 | 8 | 548 | 2.3% | 96.8% | 0.0% | 0.9% | 432 |
| lechu.Ala 0.0.4 | 8 | 1007 | 18.6% | 74.9% | 0.0% | 6.5% | 752 |
| lessonz.robocode.Oz 0.5.0 | 8 | 121 | 0.0% | 100.0% | 0.0% | 0.0% | 555 |
| lrem.magic.TormentedAngel Antiquitie | 8 | 839 | 6.7% | 90.5% | 0.0% | 2.7% | 659 |
| lrem.micro.FalseProphet Alpha | 8 | 777 | 2.4% | 96.5% | 0.0% | 1.1% | 451 |
| lrem.quickhack.QuickHack 1.0 | 8 | 645 | 10.7% | 85.2% | 0.0% | 4.1% | 513 |
| mb.Monte 0.1.0 | 8 | 744 | 9.2% | 85.1% | 1.7% | 4.0% | 464 |
| metal.small.MCool 1.21 | 8 | 449 | 7.0% | 90.1% | 0.0% | 3.0% | 595 |
| mladjo.AIR 0.7 | 8 | 810 | 6.2% | 91.2% | 0.0% | 2.6% | 663 |
| mladjo.Startko 1.0 | 8 | 794 | 4.7% | 93.4% | 0.0% | 1.9% | 475 |
| mld.LittleBlackBook 1.69e | 8 | 277 | 0.0% | 100.0% | 0.0% | 0.0% | 315 |
| mld.jdc.nano.LittleBlackBook 1.0 | 8 | 334 | 1.9% | 97.8% | 0.0% | 0.4% | 315 |
| myl.micro.NekoNinja 1.30 | 8 | 570 | 3.3% | 95.1% | 0.0% | 1.6% | 706 |
| myl.micro.Predator 1.50 | 8 | 115 | 0.0% | 100.0% | 0.0% | 0.0% | 597 |
| mz.Adept 2.65 | 8 | 514 | 4.9% | 92.9% | 0.0% | 2.3% | 442 |
| mz.AdeptBSB 1.03 | 8 | 83 | 7.5% | 88.5% | 0.1% | 3.9% | 444 |
| nat.nano.Ocnirp 1.73 | 8 | 918 | 8.2% | 88.1% | 0.0% | 3.8% | 595 |
| nat.nano.OcnirpPM 1.0 | 8 | 1063 | 11.2% | 83.6% | 0.0% | 5.2% | 582 |
| nova.Snow 1.0 | 8 | 1198 | 19.3% | 73.2% | 0.0% | 7.5% | 759 |
| pez.mini.Gouldingi 1.5 | 8 | 380 | 3.3% | 95.3% | 0.0% | 1.4% | 575 |
| qwaker00.Ahchoo 1.6 | 8 | 931 | 19.5% | 73.3% | 0.1% | 7.1% | 777 |
| ratosh.Nobo 0.21 | 8 | 151 | 0.0% | 100.0% | 0.0% | 0.0% | 460 |
| rdt199.Warlord 0.73 | 8 | 716 | 8.7% | 87.6% | 0.1% | 3.5% | 608 |
| rjw.RabidWombat 0.71 | 8 | 250 | 0.0% | 100.0% | 0.0% | 0.0% | 398 |
| robar.nano.MosquitoPM 1.0 | 8 | 764 | 6.5% | 90.5% | 0.0% | 3.0% | 524 |
| robar.nano.Prestige 1.0 | 8 | 1312 | 16.2% | 76.4% | 0.0% | 7.4% | 617 |
| robar.nano.Scytodes 0.3 | 8 | 275 | 0.0% | 100.0% | 0.0% | 0.0% | 320 |
| robar.nano.Vespa 0.95 | 8 | 465 | 0.0% | 100.0% | 0.0% | 0.0% | 423 |
| rsk1.RSK1 4.0 | 8 | 599 | 6.3% | 91.3% | 0.0% | 2.4% | 680 |
| rtk.Tachikoma 1.0 | 8 | 1014 | 9.9% | 85.4% | 0.6% | 4.1% | 697 |
| rz.SmallDevil 1.502 | 8 | 254 | 2.5% | 96.6% | 0.0% | 1.0% | 493 |
| satan.White 0.26 | 8 | 464 | 2.7% | 96.3% | 0.0% | 1.0% | 475 |
| sheldor.nano.PointInLine 1.0 | 8 | 804 | 6.2% | 90.4% | 0.5% | 2.8% | 560 |
| sheldor.nano.PointInLineRRAL 1.0.0 | 8 | 570 | 3.3% | 95.2% | 0.0% | 1.5% | 505 |
| simonton.GFNano_D 3.1b | 8 | 626 | 7.0% | 89.8% | 0.0% | 3.2% | 508 |
| simonton.nano.WeekendObsession_S 1.7 | 8 | 735 | 7.7% | 89.0% | 0.0% | 3.3% | 501 |
| sm.Devil 7.3 | 8 | 982 | 14.0% | 80.4% | 0.0% | 5.6% | 1040 |
| spinnercat.CopyKat 1.2.3 | 8 | 893 | 10.5% | 84.9% | 0.1% | 4.5% | 524 |
| spinnercat.Kitten 1.6 | 8 | 790 | 6.3% | 90.6% | 0.0% | 3.0% | 537 |
| starpkg.StarViewerZ 1.26 | 8 | 395 | 4.7% | 93.1% | 0.0% | 2.1% | 708 |
| stelo.MatchupMicro 1.2 | 8 | 878 | 12.8% | 81.8% | 0.0% | 5.3% | 627 |
| stelo.PianistNano 1.3 | 8 | 786 | 6.4% | 90.5% | 0.0% | 3.1% | 544 |
| stelo.SteloTestNano 1.0 | 8 | 657 | 7.6% | 88.9% | 0.1% | 3.4% | 477 |
| suh.nano.RandomPM 1.02 | 8 | 1075 | 9.9% | 85.6% | 0.0% | 4.5% | 623 |
| syl.Centipede 0.5 | 8 | 605 | 9.3% | 86.3% | 0.0% | 4.3% | 563 |
| tobe.Saturn lambda | 8 | 942 | 12.6% | 81.8% | 0.0% | 5.6% | 572 |
| trab.nano.AinippeNano 1.3 | 8 | 788 | 5.6% | 91.8% | 0.0% | 2.6% | 551 |
| tzu.TheArtOfWar 1.2 | 8 | 566 | 4.4% | 93.6% | 0.0% | 2.0% | 479 |
| vuen.Fractal 0.55 | 8 | 805 | 8.5% | 87.8% | 0.0% | 3.7% | 566 |
| whind.Constitution 0.7.1 | 8 | 723 | 7.8% | 88.9% | 0.0% | 3.4% | 644 |
| wiki.mako.MakoHT 1.2.2.1 | 8 | 321 | 3.9% | 94.3% | 0.0% | 1.8% | 585 |
| wiki.nano.RaikoNano 1.1 | 8 | 957 | 12.4% | 82.4% | 0.0% | 5.2% | 853 |
| zen.Lindada 0.2 | 8 | 836 | 8.2% | 87.9% | 0.0% | 3.9% | 633 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | 8 | 5 | 596 | 0 | 0.31 | 1 | 1 | 0 |
| KiraNL.Cataris 1.0 | 8 | 6 | 768 | 0 | 0.40 | 0 | 0 | 0 |
| PkKillers.PkAssassin 1.0 | 8 | 7 | 298 | 0 | 0.36 | 0 | 0 | 0 |
| alpha.BlackIce 1.0 | 8 | 7 | 298 | 0 | 0.33 | 0 | 0 | 0 |
| amk.ChumbaMini 0.2 | 8 | 7 | 0 | 1 | 0.65 | 0 | 0 | 0 |
| amk.ChumbaWumba 0.3 | 8 | 5 | 596 | 0 | 0.39 | 1 | 1 | 0 |
| apc.botM 3.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| apv.NanoLauLectrik 1.0 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 7 | 298 | 0 | 0.33 | 0 | 0 | 0 |
| ary.nano.ColorNanoP 1.1 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| asm.Statistas 0.1 | 8 | 7 | 298 | 0 | 0.34 | 0 | 0 | 0 |
| bigpete.Stewie 1.0 | 8 | 5 | 894 | 0 | 0.31 | 0 | 0 | 0 |
| brainfade.melee.Dusk 0.44 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| buba.Archivist 0.1 | 8 | 6 | 298 | 0 | 0.29 | 1 | 1 | 0 |
| bvh.mini.Fenrir 0.39 | 8 | 7 | 298 | 0 | 0.40 | 0 | 0 | 0 |
| casey.Flee 1.0 | 8 | 7 | 298 | 0 | 0.33 | 0 | 0 | 0 |
| csm.NthGeneration 0.04 | 8 | 6 | 306 | 0 | 0.32 | 0 | 0 | 0 |
| demetrix.nano.Neutrino 0.27 | 8 | 7 | 298 | 0 | 0.31 | 1 | 1 | 0 |
| dmp.nano.Eve 3.41 | 8 | 7 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| ds.OoV4 0.3b | 8 | 8 | 0 | 0 | 0.41 | 0 | 0 | 0 |
| dsx724.VSAB_EP3a 1.0 | 8 | 7 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| dummy.micro.Sparrow 2.5 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| dy.LevelOne 2.0 | 8 | 7 | 298 | 0 | 0.30 | 0 | 0 | 0 |
| dz.MostlyHarmlessNano 2.1 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| et.Predator 1.8 | 8 | 6 | 0 | 0 | 0.31 | 2 | 2 | 0 |
| exauge.GateKeeper 1.1.121g | 8 | 7 | 295 | 0 | 0.35 | 0 | 0 | 0 |
| fcr.First 1.0 | 8 | 7 | 298 | 0 | 0.33 | 0 | 0 | 0 |
| fnc.bandit2002.Bandit2002 4.0.2 | 8 | 6 | 298 | 0 | 0.30 | 1 | 1 | 0 |
| frag.FragBot 1.0 | 8 | 7 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| gh.nano.Grofvuil 0.2 | 8 | 7 | 298 | 0 | 0.30 | 0 | 0 | 0 |
| gu.MicroScoob 1.3 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| ha2.T3 0.2 | 8 | 6 | 596 | 0 | 0.35 | 0 | 0 | 0 |
| hamilton.Hamilton 1.0 | 8 | 6 | 0 | 0 | 0.34 | 2 | 2 | 0 |
| ins.MobyNano 0.8 | 8 | 6 | 596 | 0 | 0.34 | 0 | 0 | 0 |
| jp.Perpy 16.0 | 8 | 7 | 0 | 0 | 0.34 | 1 | 1 | 0 |
| kawigi.nano.FunkyChicken 1.1 | 8 | 7 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| kawigi.sbf.Barracuda 1.0 | 8 | 6 | 596 | 0 | 0.29 | 0 | 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 8 | 6 | 298 | 0 | 0.35 | 1 | 1 | 0 |
| krzysiek.robbo2.Robbo 1.0.0 | 8 | 8 | 0 | 1 | 0.51 | 0 | 0 | 0 |
| lechu.Ala 0.0.4 | 8 | 6 | 0 | 0 | 0.41 | 2 | 2 | 0 |
| lessonz.robocode.Oz 0.5.0 | 8 | 7 | 298 | 0 | 0.30 | 0 | 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 8 | 8 | 0 | 0 | 0.40 | 0 | 0 | 0 |
| lrem.micro.FalseProphet Alpha | 8 | 6 | 596 | 0 | 0.33 | 0 | 0 | 0 |
| lrem.quickhack.QuickHack 1.0 | 8 | 7 | 298 | 0 | 0.36 | 0 | 0 | 0 |
| mb.Monte 0.1.0 | 8 | 7 | 0 | 0 | 0.28 | 1 | 1 | 0 |
| metal.small.MCool 1.21 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| mladjo.AIR 0.7 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| mladjo.Startko 1.0 | 8 | 6 | 596 | 0 | 0.31 | 0 | 0 | 0 |
| mld.LittleBlackBook 1.69e | 8 | 7 | 298 | 1 | 0.45 | 0 | 0 | 0 |
| mld.jdc.nano.LittleBlackBook 1.0 | 8 | 6 | 298 | 1 | 0.51 | 1 | 0 | 0 |
| myl.micro.NekoNinja 1.30 | 8 | 7 | 298 | 0 | 0.36 | 0 | 0 | 0 |
| myl.micro.Predator 1.50 | 8 | 7 | 298 | 0 | 0.30 | 0 | 0 | 0 |
| mz.Adept 2.65 | 8 | 6 | 799 | 0 | 0.33 | 0 | 0 | 0 |
| mz.AdeptBSB 1.03 | 8 | 6 | 596 | 0 | 0.33 | 0 | 0 | 0 |
| nat.nano.Ocnirp 1.73 | 8 | 5 | 1088 | 0 | 0.35 | 0 | 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 8 | 7 | 0 | 0 | 0.29 | 1 | 1 | 0 |
| nova.Snow 1.0 | 8 | 7 | 0 | 0 | 0.34 | 1 | 1 | 0 |
| pez.mini.Gouldingi 1.5 | 8 | 8 | 0 | 0 | 0.28 | 0 | 0 | 0 |
| qwaker00.Ahchoo 1.6 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| ratosh.Nobo 0.21 | 8 | 7 | 298 | 0 | 0.33 | 0 | 0 | 0 |
| rdt199.Warlord 0.73 | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| rjw.RabidWombat 0.71 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| robar.nano.MosquitoPM 1.0 | 8 | 7 | 66 | 0 | 0.36 | 0 | 0 | 0 |
| robar.nano.Prestige 1.0 | 8 | 5 | 0 | 0 | 0.30 | 3 | 3 | 0 |
| robar.nano.Scytodes 0.3 | 8 | 8 | 0 | 0 | 0.28 | 0 | 0 | 0 |
| robar.nano.Vespa 0.95 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| rsk1.RSK1 4.0 | 8 | 7 | 298 | 0 | 0.34 | 0 | 0 | 0 |
| rtk.Tachikoma 1.0 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| rz.SmallDevil 1.502 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| satan.White 0.26 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| sheldor.nano.PointInLine 1.0 | 8 | 6 | 596 | 0 | 0.36 | 0 | 0 | 0 |
| sheldor.nano.PointInLineRRAL 1.0.0 | 8 | 7 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| simonton.GFNano_D 3.1b | 8 | 7 | 298 | 0 | 0.30 | 0 | 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 8 | 6 | 43 | 0 | 0.32 | 1 | 1 | 0 |
| sm.Devil 7.3 | 8 | 7 | 298 | 0 | 0.63 | 0 | 0 | 0 |
| spinnercat.CopyKat 1.2.3 | 8 | 7 | 0 | 0 | 0.28 | 1 | 1 | 0 |
| spinnercat.Kitten 1.6 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| stelo.MatchupMicro 1.2 | 8 | 6 | 298 | 0 | 0.31 | 1 | 1 | 0 |
| stelo.PianistNano 1.3 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| stelo.SteloTestNano 1.0 | 8 | 7 | 298 | 0 | 0.28 | 0 | 0 | 0 |
| suh.nano.RandomPM 1.02 | 8 | 7 | 298 | 0 | 0.33 | 0 | 0 | 0 |
| syl.Centipede 0.5 | 8 | 7 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| tobe.Saturn lambda | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| trab.nano.AinippeNano 1.3 | 8 | 7 | 290 | 0 | 0.31 | 0 | 0 | 0 |
| tzu.TheArtOfWar 1.2 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| vuen.Fractal 0.55 | 8 | 6 | 809 | 0 | 0.35 | 0 | 0 | 0 |
| whind.Constitution 0.7.1 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| wiki.mako.MakoHT 1.2.2.1 | 8 | 8 | 0 | 0 | 0.28 | 0 | 0 | 0 |
| wiki.nano.RaikoNano 1.1 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| zen.Lindada 0.2 | 8 | 7 | 0 | 0 | 0.30 | 1 | 1 | 0 |

633 of 728 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | 8975 | 72 | 8934 | 8933 (99.5%) | 42 (0.5%) | 1 (0.0%) | 216 | 112 | 29 |
| KiraNL.Cataris 1.0 | 7904 | 20 | 7861 | 7852 (99.3%) | 52 (0.7%) | 9 (0.1%) | 587 | 136 | 55 |
| PkKillers.PkAssassin 1.0 | 6955 | 24 | 6962 | 6916 (99.4%) | 39 (0.6%) | 46 (0.7%) | 758 | 146 | 28 |
| alpha.BlackIce 1.0 | 8048 | 86 | 8004 | 8003 (99.4%) | 45 (0.6%) | 1 (0.0%) | 154 | 134 | 26 |
| amk.ChumbaMini 0.2 | 6500 | 15 | 6500 | 6500 (100.0%) | 0 (0.0%) | 0 (0.0%) | 159 | 86 | 29 |
| amk.ChumbaWumba 0.3 | 7412 | 17 | 7376 | 7372 (99.5%) | 40 (0.5%) | 4 (0.1%) | 166 | 93 | 52 |
| apc.botM 3.0 | 11483 | 79 | 11483 | 11476 (99.9%) | 7 (0.1%) | 7 (0.1%) | 341 | 144 | 18 |
| apv.NanoLauLectrik 1.0 | 6163 | 13 | 6174 | 6161 (100.0%) | 2 (0.0%) | 13 (0.2%) | 661 | 96 | 36 |
| apv.NanoLauLectrikTheCannibal 1.1 | 5299 | 36 | 5291 | 5278 (99.6%) | 21 (0.4%) | 13 (0.2%) | 635 | 126 | 30 |
| ary.nano.ColorNanoP 1.1 | 4901 | 20 | 4915 | 4896 (99.9%) | 5 (0.1%) | 19 (0.4%) | 250 | 130 | 23 |
| asm.Statistas 0.1 | 6878 | 19 | 6907 | 6859 (99.7%) | 19 (0.3%) | 48 (0.7%) | 154 | 81 | 36 |
| bigpete.Stewie 1.0 | 6395 | 18 | 6345 | 6344 (99.2%) | 51 (0.8%) | 1 (0.0%) | 127 | 83 | 25 |
| brainfade.melee.Dusk 0.44 | 16702 | 16 | 16683 | 16678 (99.9%) | 24 (0.1%) | 5 (0.0%) | 540 | 196 | 25 |
| buba.Archivist 0.1 | 6260 | 20 | 6276 | 6225 (99.4%) | 35 (0.6%) | 51 (0.8%) | 790 | 159 | 23 |
| bvh.mini.Fenrir 0.39 | 7348 | 10 | 7331 | 7328 (99.7%) | 20 (0.3%) | 3 (0.0%) | 269 | 120 | 34 |
| casey.Flee 1.0 | 7223 | 15 | 7271 | 7180 (99.4%) | 43 (0.6%) | 91 (1.3%) | 893 | 129 | 29 |
| csm.NthGeneration 0.04 | 6717 | 44 | 6697 | 6696 (99.7%) | 21 (0.3%) | 1 (0.0%) | 82 | 102 | 27 |
| demetrix.nano.Neutrino 0.27 | 10070 | 18 | 10049 | 10049 (99.8%) | 21 (0.2%) | 0 (0.0%) | 277 | 126 | 38 |
| dmp.nano.Eve 3.41 | 3344 | 27 | 3326 | 3326 (99.5%) | 18 (0.5%) | 0 (0.0%) | 92 | 77 | 20 |
| ds.OoV4 0.3b | 12633 | 43 | 12633 | 12632 (100.0%) | 1 (0.0%) | 1 (0.0%) | 418 | 183 | 54 |
| dsx724.VSAB_EP3a 1.0 | 13189 | 18 | 13150 | 13148 (99.7%) | 41 (0.3%) | 2 (0.0%) | 583 | 186 | 21 |
| dummy.micro.Sparrow 2.5 | 6458 | 31 | 6458 | 6458 (100.0%) | 0 (0.0%) | 0 (0.0%) | 102 | 102 | 27 |
| dy.LevelOne 2.0 | 4891 | 17 | 4870 | 4868 (99.5%) | 23 (0.5%) | 2 (0.0%) | 45 | 84 | 21 |
| dz.MostlyHarmlessNano 2.1 | 5307 | 21 | 5316 | 5303 (99.9%) | 4 (0.1%) | 13 (0.2%) | 180 | 104 | 19 |
| et.Predator 1.8 | 7336 | 24 | 7336 | 7336 (100.0%) | 0 (0.0%) | 0 (0.0%) | 183 | 90 | 30 |
| exauge.GateKeeper 1.1.121g | 7534 | 6 | 7551 | 7504 (99.6%) | 30 (0.4%) | 47 (0.6%) | 957 | 155 | 43 |
| fcr.First 1.0 | 3601 | 17 | 3581 | 3580 (99.4%) | 21 (0.6%) | 1 (0.0%) | 66 | 133 | 16 |
| fnc.bandit2002.Bandit2002 4.0.2 | 6764 | 17 | 6746 | 6746 (99.7%) | 18 (0.3%) | 0 (0.0%) | 146 | 93 | 22 |
| frag.FragBot 1.0 | 6510 | 34 | 6492 | 6490 (99.7%) | 20 (0.3%) | 2 (0.0%) | 216 | 115 | 16 |
| gh.nano.Grofvuil 0.2 | 3644 | 17 | 3630 | 3626 (99.5%) | 18 (0.5%) | 4 (0.1%) | 93 | 89 | 23 |
| gu.MicroScoob 1.3 | 4864 | 10 | 4864 | 4864 (100.0%) | 0 (0.0%) | 0 (0.0%) | 65 | 94 | 16 |
| ha2.T3 0.2 | 6535 | 11 | 6498 | 6497 (99.4%) | 38 (0.6%) | 1 (0.0%) | 241 | 119 | 21 |
| hamilton.Hamilton 1.0 | 13204 | 30 | 13205 | 13190 (99.9%) | 14 (0.1%) | 15 (0.1%) | 928 | 216 | 48 |
| ins.MobyNano 0.8 | 6680 | 40 | 6656 | 6635 (99.3%) | 45 (0.7%) | 21 (0.3%) | 1302 | 173 | 30 |
| jp.Perpy 16.0 | 10645 | 22 | 10646 | 10645 (100.0%) | 0 (0.0%) | 1 (0.0%) | 584 | 132 | 34 |
| kawigi.nano.FunkyChicken 1.1 | 5838 | 24 | 5871 | 5816 (99.6%) | 22 (0.4%) | 55 (0.9%) | 878 | 146 | 21 |
| kawigi.sbf.Barracuda 1.0 | 6800 | 30 | 6765 | 6765 (99.5%) | 35 (0.5%) | 0 (0.0%) | 11 | 65 | 20 |
| kinsen.nano.Quarrelet 1.0 | 6617 | 19 | 6665 | 6595 (99.7%) | 22 (0.3%) | 70 (1.1%) | 811 | 124 | 27 |
| krzysiek.robbo2.Robbo 1.0.0 | 4536 | 17 | 4536 | 4536 (100.0%) | 0 (0.0%) | 0 (0.0%) | 14 | 112 | 18 |
| lechu.Ala 0.0.4 | 11167 | 18 | 11176 | 11167 (100.0%) | 0 (0.0%) | 9 (0.1%) | 772 | 176 | 52 |
| lessonz.robocode.Oz 0.5.0 | 6356 | 20 | 6337 | 6337 (99.7%) | 19 (0.3%) | 0 (0.0%) | 35 | 80 | 20 |
| lrem.magic.TormentedAngel Antiquitie | 9511 | 17 | 9510 | 9510 (100.0%) | 1 (0.0%) | 0 (0.0%) | 258 | 129 | 48 |
| lrem.micro.FalseProphet Alpha | 5402 | 24 | 5365 | 5360 (99.2%) | 42 (0.8%) | 5 (0.1%) | 89 | 138 | 23 |
| lrem.quickhack.QuickHack 1.0 | 6792 | 41 | 6770 | 6769 (99.7%) | 23 (0.3%) | 1 (0.0%) | 157 | 139 | 31 |
| mb.Monte 0.1.0 | 5361 | 26 | 5361 | 5360 (100.0%) | 1 (0.0%) | 1 (0.0%) | 239 | 127 | 17 |
| metal.small.MCool 1.21 | 7180 | 33 | 7180 | 7179 (100.0%) | 1 (0.0%) | 1 (0.0%) | 59 | 57 | 27 |
| mladjo.AIR 0.7 | 9629 | 23 | 9608 | 9608 (99.8%) | 21 (0.2%) | 0 (0.0%) | 213 | 108 | 37 |
| mladjo.Startko 1.0 | 5992 | 26 | 5960 | 5943 (99.2%) | 49 (0.8%) | 17 (0.3%) | 173 | 162 | 20 |
| mld.LittleBlackBook 1.69e | 2659 | 25 | 2648 | 2639 (99.2%) | 20 (0.8%) | 9 (0.3%) | 39 | 89 | 15 |
| mld.jdc.nano.LittleBlackBook 1.0 | 2661 | 34 | 2647 | 2642 (99.3%) | 19 (0.7%) | 5 (0.2%) | 33 | 82 | 22 |
| myl.micro.NekoNinja 1.30 | 9507 | 8 | 9512 | 9488 (99.8%) | 19 (0.2%) | 24 (0.3%) | 331 | 108 | 46 |
| myl.micro.Predator 1.50 | 7261 | 13 | 7247 | 7243 (99.8%) | 18 (0.2%) | 4 (0.1%) | 116 | 71 | 24 |
| mz.Adept 2.65 | 4666 | 20 | 4618 | 4618 (99.0%) | 48 (1.0%) | 0 (0.0%) | 25 | 93 | 21 |
| mz.AdeptBSB 1.03 | 5297 | 11 | 5257 | 5257 (99.2%) | 40 (0.8%) | 0 (0.0%) | 29 | 101 | 18 |
| nat.nano.Ocnirp 1.73 | 7531 | 25 | 7474 | 7422 (98.6%) | 109 (1.4%) | 52 (0.7%) | 1349 | 199 | 32 |
| nat.nano.OcnirpPM 1.0 | 7302 | 18 | 7317 | 7273 (99.6%) | 29 (0.4%) | 44 (0.6%) | 1317 | 172 | 26 |
| nova.Snow 1.0 | 11989 | 24 | 11990 | 11988 (100.0%) | 1 (0.0%) | 2 (0.0%) | 450 | 181 | 29 |
| pez.mini.Gouldingi 1.5 | 7070 | 19 | 7070 | 7069 (100.0%) | 1 (0.0%) | 1 (0.0%) | 85 | 78 | 27 |
| qwaker00.Ahchoo 1.6 | 9540 | 17 | 9541 | 9540 (100.0%) | 0 (0.0%) | 1 (0.0%) | 465 | 118 | 22 |
| ratosh.Nobo 0.21 | 5086 | 22 | 5070 | 5068 (99.6%) | 18 (0.4%) | 2 (0.0%) | 378 | 84 | 26 |
| rdt199.Warlord 0.73 | 7737 | 29 | 7737 | 7736 (100.0%) | 1 (0.0%) | 1 (0.0%) | 237 | 126 | 26 |
| rjw.RabidWombat 0.71 | 3786 | 8 | 3792 | 3786 (100.0%) | 0 (0.0%) | 6 (0.2%) | 10 | 67 | 18 |
| robar.nano.MosquitoPM 1.0 | 6338 | 19 | 6348 | 6328 (99.8%) | 10 (0.2%) | 20 (0.3%) | 735 | 124 | 26 |
| robar.nano.Prestige 1.0 | 8016 | 18 | 8029 | 8005 (99.9%) | 11 (0.1%) | 24 (0.3%) | 621 | 141 | 36 |
| robar.nano.Scytodes 0.3 | 2529 | 18 | 2538 | 2528 (100.0%) | 1 (0.0%) | 10 (0.4%) | 75 | 89 | 12 |
| robar.nano.Vespa 0.95 | 4539 | 14 | 4567 | 4530 (99.8%) | 9 (0.2%) | 37 (0.8%) | 349 | 112 | 25 |
| rsk1.RSK1 4.0 | 9237 | 15 | 9219 | 9208 (99.7%) | 29 (0.3%) | 11 (0.1%) | 443 | 138 | 30 |
| rtk.Tachikoma 1.0 | 10730 | 37 | 10730 | 10724 (99.9%) | 6 (0.1%) | 6 (0.1%) | 547 | 145 | 24 |
| rz.SmallDevil 1.502 | 5730 | 28 | 5730 | 5730 (100.0%) | 0 (0.0%) | 0 (0.0%) | 39 | 76 | 27 |
| satan.White 0.26 | 5813 | 30 | 5812 | 5812 (100.0%) | 1 (0.0%) | 0 (0.0%) | 49 | 107 | 14 |
| sheldor.nano.PointInLine 1.0 | 6595 | 16 | 6567 | 6557 (99.4%) | 38 (0.6%) | 10 (0.2%) | 1182 | 134 | 27 |
| sheldor.nano.PointInLineRRAL 1.0.0 | 6473 | 19 | 6459 | 6447 (99.6%) | 26 (0.4%) | 12 (0.2%) | 485 | 127 | 22 |
| simonton.GFNano_D 3.1b | 5776 | 13 | 5776 | 5755 (99.6%) | 21 (0.4%) | 21 (0.4%) | 318 | 100 | 24 |
| simonton.nano.WeekendObsession_S 1.7 | 5826 | 24 | 5837 | 5820 (99.9%) | 6 (0.1%) | 17 (0.3%) | 1033 | 165 | 30 |
| sm.Devil 7.3 | 18893 | 67 | 18870 | 18864 (99.8%) | 29 (0.2%) | 6 (0.0%) | 1402 | 231 | 108 |
| spinnercat.CopyKat 1.2.3 | 6312 | 21 | 6325 | 6295 (99.7%) | 17 (0.3%) | 30 (0.5%) | 1175 | 171 | 18 |
| spinnercat.Kitten 1.6 | 6575 | 12 | 6604 | 6557 (99.7%) | 18 (0.3%) | 47 (0.7%) | 863 | 147 | 22 |
| starpkg.StarViewerZ 1.26 | 11365 | 33 | 11356 | 11352 (99.9%) | 13 (0.1%) | 4 (0.0%) | 271 | 155 | 29 |
| stelo.MatchupMicro 1.2 | 8771 | 23 | 8751 | 8749 (99.7%) | 22 (0.3%) | 2 (0.0%) | 478 | 104 | 24 |
| stelo.PianistNano 1.3 | 6286 | 13 | 6297 | 6275 (99.8%) | 11 (0.2%) | 22 (0.3%) | 638 | 133 | 39 |
| stelo.SteloTestNano 1.0 | 5234 | 16 | 5216 | 5216 (99.7%) | 18 (0.3%) | 0 (0.0%) | 98 | 86 | 28 |
| suh.nano.RandomPM 1.02 | 8659 | 16 | 8659 | 8619 (99.5%) | 40 (0.5%) | 40 (0.5%) | 1232 | 185 | 24 |
| syl.Centipede 0.5 | 6441 | 15 | 6422 | 6422 (99.7%) | 19 (0.3%) | 0 (0.0%) | 88 | 74 | 22 |
| tobe.Saturn lambda | 5631 | 84 | 5639 | 5624 (99.9%) | 7 (0.1%) | 15 (0.3%) | 262 | 94 | 26 |
| trab.nano.AinippeNano 1.3 | 7524 | 40 | 7511 | 7491 (99.6%) | 33 (0.4%) | 20 (0.3%) | 729 | 171 | 24 |
| tzu.TheArtOfWar 1.2 | 5206 | 16 | 5186 | 5186 (99.6%) | 20 (0.4%) | 0 (0.0%) | 105 | 85 | 28 |
| vuen.Fractal 0.55 | 5736 | 3 | 5706 | 5684 (99.1%) | 52 (0.9%) | 22 (0.4%) | 325 | 97 | 25 |
| whind.Constitution 0.7.1 | 9029 | 37 | 9029 | 9026 (100.0%) | 3 (0.0%) | 3 (0.0%) | 309 | 163 | 28 |
| wiki.mako.MakoHT 1.2.2.1 | 7610 | 46 | 7610 | 7610 (100.0%) | 0 (0.0%) | 0 (0.0%) | 52 | 84 | 21 |
| wiki.nano.RaikoNano 1.1 | 13375 | 101 | 13374 | 13374 (100.0%) | 1 (0.0%) | 0 (0.0%) | 650 | 120 | 36 |
| zen.Lindada 0.2 | 8209 | 29 | 8209 | 8209 (100.0%) | 0 (0.0%) | 0 (0.0%) | 221 | 94 | 26 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | 10171 | 742 (7.3%) | 6230 |
| KiraNL.Cataris 1.0 | 8777 | 461 (5.3%) | 878 |
| PkKillers.PkAssassin 1.0 | 7149 | 643 (9.0%) | 4110 |
| alpha.BlackIce 1.0 | 8743 | 546 (6.2%) | 2861 |
| amk.ChumbaMini 0.2 | 7498 | 544 (7.3%) | 2940 |
| amk.ChumbaWumba 0.3 | 8865 | 611 (6.9%) | 2312 |
| apc.botM 3.0 | 11188 | 915 (8.2%) | 8545 |
| apv.NanoLauLectrik 1.0 | 7200 | 515 (7.2%) | 1206 |
| apv.NanoLauLectrikTheCannibal 1.1 | 5660 | 511 (9.0%) | 2315 |
| ary.nano.ColorNanoP 1.1 | 4894 | 563 (11.5%) | 2846 |
| asm.Statistas 0.1 | 9165 | 438 (4.8%) | 2775 |
| bigpete.Stewie 1.0 | 7676 | 450 (5.9%) | 2381 |
| brainfade.melee.Dusk 0.44 | 16373 | 1165 (7.1%) | 10988 |
| buba.Archivist 0.1 | 6719 | 409 (6.1%) | 906 |
| bvh.mini.Fenrir 0.39 | 8272 | 463 (5.6%) | 1478 |
| casey.Flee 1.0 | 8266 | 451 (5.5%) | 2932 |
| csm.NthGeneration 0.04 | 6503 | 484 (7.4%) | 2876 |
| demetrix.nano.Neutrino 0.27 | 10398 | 786 (7.6%) | 4362 |
| dmp.nano.Eve 3.41 | 3519 | 203 (5.8%) | 925 |
| ds.OoV4 0.3b | 11440 | 1174 (10.3%) | 9880 |
| dsx724.VSAB_EP3a 1.0 | 11464 | 1082 (9.4%) | 9852 |
| dummy.micro.Sparrow 2.5 | 7029 | 511 (7.3%) | 2874 |
| dy.LevelOne 2.0 | 4501 | 312 (6.9%) | 691 |
| dz.MostlyHarmlessNano 2.1 | 4984 | 344 (6.9%) | 1682 |
| et.Predator 1.8 | 8549 | 534 (6.2%) | 2775 |
| exauge.GateKeeper 1.1.121g | 9499 | 481 (5.1%) | 4239 |
| fcr.First 1.0 | 3263 | 338 (10.4%) | 679 |
| fnc.bandit2002.Bandit2002 4.0.2 | 7469 | 442 (5.9%) | 352 |
| frag.FragBot 1.0 | 6529 | 485 (7.4%) | 2472 |
| gh.nano.Grofvuil 0.2 | 3424 | 292 (8.5%) | 1038 |
| gu.MicroScoob 1.3 | 5161 | 581 (11.3%) | 4144 |
| ha2.T3 0.2 | 6475 | 659 (10.2%) | 3876 |
| hamilton.Hamilton 1.0 | 12675 | 1045 (8.2%) | 9703 |
| ins.MobyNano 0.8 | 7542 | 547 (7.3%) | 2747 |
| jp.Perpy 16.0 | 10911 | 1080 (9.9%) | 8857 |
| kawigi.nano.FunkyChicken 1.1 | 6483 | 511 (7.9%) | 1559 |
| kawigi.sbf.Barracuda 1.0 | 7575 | 343 (4.5%) | 1156 |
| kinsen.nano.Quarrelet 1.0 | 7869 | 455 (5.8%) | 1037 |
| krzysiek.robbo2.Robbo 1.0.0 | 4685 | 289 (6.2%) | 1881 |
| lechu.Ala 0.0.4 | 11497 | 917 (8.0%) | 9121 |
| lessonz.robocode.Oz 0.5.0 | 7213 | 588 (8.2%) | 3463 |
| lrem.magic.TormentedAngel Antiquitie | 9808 | 782 (8.0%) | 7070 |
| lrem.micro.FalseProphet Alpha | 4959 | 474 (9.6%) | 3229 |
| lrem.quickhack.QuickHack 1.0 | 6432 | 629 (9.8%) | 3679 |
| mb.Monte 0.1.0 | 5291 | 563 (10.6%) | 3452 |
| metal.small.MCool 1.21 | 8565 | 420 (4.9%) | 1578 |
| mladjo.AIR 0.7 | 9899 | 779 (7.9%) | 6323 |
| mladjo.Startko 1.0 | 5465 | 418 (7.6%) | 2274 |
| mld.LittleBlackBook 1.69e | 2618 | 169 (6.5%) | 331 |
| mld.jdc.nano.LittleBlackBook 1.0 | 2628 | 184 (7.0%) | 235 |
| myl.micro.NekoNinja 1.30 | 11059 | 674 (6.1%) | 4797 |
| myl.micro.Predator 1.50 | 8559 | 531 (6.2%) | 4152 |
| mz.Adept 2.65 | 4868 | 432 (8.9%) | 2880 |
| mz.AdeptBSB 1.03 | 4835 | 422 (8.7%) | 1640 |
| nat.nano.Ocnirp 1.73 | 8653 | 611 (7.1%) | 3527 |
| nat.nano.OcnirpPM 1.0 | 8244 | 570 (6.9%) | 3645 |
| nova.Snow 1.0 | 11802 | 940 (8.0%) | 8590 |
| pez.mini.Gouldingi 1.5 | 8150 | 579 (7.1%) | 3659 |
| qwaker00.Ahchoo 1.6 | 12212 | 887 (7.3%) | 8800 |
| ratosh.Nobo 0.21 | 5527 | 348 (6.3%) | 2376 |
| rdt199.Warlord 0.73 | 8527 | 629 (7.4%) | 3975 |
| rjw.RabidWombat 0.71 | 4089 | 294 (7.2%) | 988 |
| robar.nano.MosquitoPM 1.0 | 6815 | 439 (6.4%) | 3169 |
| robar.nano.Prestige 1.0 | 9001 | 561 (6.2%) | 3452 |
| robar.nano.Scytodes 0.3 | 2695 | 191 (7.1%) | 218 |
| robar.nano.Vespa 0.95 | 4559 | 385 (8.4%) | 2087 |
| rsk1.RSK1 4.0 | 10193 | 763 (7.5%) | 4250 |
| rtk.Tachikoma 1.0 | 10798 | 787 (7.3%) | 8512 |
| rz.SmallDevil 1.502 | 6087 | 463 (7.6%) | 2590 |
| satan.White 0.26 | 5550 | 432 (7.8%) | 1844 |
| sheldor.nano.PointInLine 1.0 | 7894 | 490 (6.2%) | 2183 |
| sheldor.nano.PointInLineRRAL 1.0.0 | 6116 | 447 (7.3%) | 2894 |
| simonton.GFNano_D 3.1b | 6423 | 409 (6.4%) | 3340 |
| simonton.nano.WeekendObsession_S 1.7 | 6440 | 497 (7.7%) | 3605 |
| sm.Devil 7.3 | 19128 | 1375 (7.2%) | 13464 |
| spinnercat.CopyKat 1.2.3 | 6860 | 607 (8.8%) | 5364 |
| spinnercat.Kitten 1.6 | 7181 | 623 (8.7%) | 3224 |
| starpkg.StarViewerZ 1.26 | 10788 | 823 (7.6%) | 6790 |
| stelo.MatchupMicro 1.2 | 9030 | 791 (8.8%) | 7288 |
| stelo.PianistNano 1.3 | 7461 | 353 (4.7%) | 0 |
| stelo.SteloTestNano 1.0 | 5667 | 441 (7.8%) | 2363 |
| suh.nano.RandomPM 1.02 | 9175 | 538 (5.9%) | 3892 |
| syl.Centipede 0.5 | 7874 | 328 (4.2%) | 0 |
| tobe.Saturn lambda | 7809 | 344 (4.4%) | 547 |
| trab.nano.AinippeNano 1.3 | 7405 | 455 (6.1%) | 2681 |
| tzu.TheArtOfWar 1.2 | 5611 | 340 (6.1%) | 3688 |
| vuen.Fractal 0.55 | 7863 | 376 (4.8%) | 813 |
| whind.Constitution 0.7.1 | 9560 | 530 (5.5%) | 3777 |
| wiki.mako.MakoHT 1.2.2.1 | 8270 | 525 (6.3%) | 2530 |
| wiki.nano.RaikoNano 1.1 | 14955 | 1176 (7.9%) | 10485 |
| zen.Lindada 0.2 | 9408 | 688 (7.3%) | 6393 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | 650 | 463 | 453 | 520 | 42.0 / 18.7 | 977 | 5862 | 40 |
| KiraNL.Cataris 1.0 | 650 | 486 | 544 | 461 | 46.9 / 25.7 | 2376 | 3950 | 2806 |
| PkKillers.PkAssassin 1.0 | 650 | 450 | 441 | 397 | 58.7 / 12.9 | 3155 | 4309 | 2340 |
| alpha.BlackIce 1.0 | 650 | 381 | 575 | 457 | 51.4 / 21.8 | 1805 | 6530 | 0 |
| amk.ChumbaMini 0.2 | 650 | 466 | 506 | 402 | 42.2 / 22.5 | 1916 | 5789 | 3492 |
| amk.ChumbaWumba 0.3 | 650 | 517 | 588 | 456 | 30.9 / 19.2 | 431 | 6664 | 4182 |
| apc.botM 3.0 | 650 | 425 | 441 | 577 | 49.2 / 13.6 | 1632 | 4981 | 2672 |
| apv.NanoLauLectrik 1.0 | 650 | 463 | 491 | 385 | 41.3 / 22.4 | 1719 | 5400 | 2913 |
| apv.NanoLauLectrikTheCannibal 1.1 | 650 | 374 | 400 | 323 | 55.1 / 19.5 | 2857 | 5576 | 756 |
| ary.nano.ColorNanoP 1.1 | 650 | 331 | 428 | 292 | 64.0 / 17.8 | 3536 | 4946 | 1086 |
| asm.Statistas 0.1 | 650 | 486 | 591 | 469 | 37.8 / 21.3 | 447 | 6114 | 3 |
| bigpete.Stewie 1.0 | 650 | 420 | 400 | 423 | 59.5 / 4.9 | 2939 | 5468 | 494 |
| brainfade.melee.Dusk 0.44 | 650 | 468 | 400 | 797 | 51.9 / 9.2 | 783 | 4568 | 125 |
| buba.Archivist 0.1 | 650 | 464 | 453 | 370 | 48.9 / 20.5 | 2608 | 5221 | 2644 |
| bvh.mini.Fenrir 0.39 | 650 | 412 | 463 | 444 | 52.2 / 25.6 | 2712 | 4240 | 59 |
| casey.Flee 1.0 | 650 | 479 | 491 | 432 | 38.1 / 16.9 | 1076 | 5976 | 3865 |
| csm.NthGeneration 0.04 | 650 | 442 | 400 | 367 | 59.9 / 7.1 | 3326 | 5333 | 553 |
| demetrix.nano.Neutrino 0.27 | 650 | 425 | 556 | 533 | 40.6 / 22.4 | 937 | 4407 | 3282 |
| dmp.nano.Eve 3.41 | 650 | 406 | 400 | 217 | 69.5 / 10.0 | 2542 | 4345 | 1211 |
| ds.OoV4 0.3b | 650 | 463 | 428 | 597 | 65.9 / 13.3 | 3286 | 4557 | 460 |
| dsx724.VSAB_EP3a 1.0 | 650 | 421 | 400 | 610 | 70.4 / 4.6 | 3906 | 4131 | 486 |
| dummy.micro.Sparrow 2.5 | 650 | 383 | 441 | 389 | 54.8 / 15.6 | 2756 | 6080 | 152 |
| dy.LevelOne 2.0 | 650 | 324 | 400 | 269 | 71.8 / 4.6 | 2757 | 6928 | 321 |
| dz.MostlyHarmlessNano 2.1 | 650 | 400 | 400 | 294 | 66.0 / 8.8 | 3415 | 3638 | 1612 |
| et.Predator 1.8 | 650 | 522 | 400 | 448 | 44.8 / 14.0 | 1380 | 6659 | 776 |
| exauge.GateKeeper 1.1.121g | 650 | 515 | 594 | 486 | 40.8 / 25.1 | 1278 | 3850 | 1527 |
| fcr.First 1.0 | 650 | 260 | 400 | 204 | 75.2 / 2.6 | 2378 | 2740 | 555 |
| fnc.bandit2002.Bandit2002 4.0.2 | 650 | 348 | 469 | 422 | 60.0 / 20.7 | 3709 | 3604 | 1277 |
| frag.FragBot 1.0 | 650 | 366 | 400 | 371 | 57.3 / 13.2 | 3242 | 4326 | 773 |
| gh.nano.Grofvuil 0.2 | 650 | 348 | 400 | 212 | 75.6 / 2.9 | 2365 | 2719 | 0 |
| gu.MicroScoob 1.3 | 650 | 370 | 400 | 305 | 55.5 / 13.2 | 3272 | 4794 | 1704 |
| ha2.T3 0.2 | 650 | 396 | 400 | 367 | 58.0 / 16.8 | 3582 | 4617 | 2140 |
| hamilton.Hamilton 1.0 | 650 | 415 | 572 | 652 | 58.8 / 16.9 | 3493 | 3430 | 1830 |
| ins.MobyNano 0.8 | 650 | 481 | 553 | 398 | 38.2 / 19.7 | 1308 | 5822 | 1780 |
| jp.Perpy 16.0 | 650 | 385 | 494 | 576 | 57.9 / 17.3 | 3120 | 4168 | 109 |
| kawigi.nano.FunkyChicken 1.1 | 650 | 444 | 438 | 356 | 44.9 / 17.9 | 2048 | 6124 | 1215 |
| kawigi.sbf.Barracuda 1.0 | 650 | 405 | 400 | 403 | 38.3 / 2.6 | 777 | 8110 | 189 |
| kinsen.nano.Quarrelet 1.0 | 650 | 481 | 522 | 412 | 35.8 / 22.5 | 1056 | 6144 | 3934 |
| krzysiek.robbo2.Robbo 1.0.0 | 650 | 292 | 400 | 282 | 63.3 / 15.2 | 3324 | 4178 | 1023 |
| lechu.Ala 0.0.4 | 650 | 446 | 484 | 603 | 63.3 / 21.6 | 3957 | 2748 | 2 |
| lessonz.robocode.Oz 0.5.0 | 650 | 435 | 400 | 405 | 59.0 / 3.5 | 3352 | 4971 | 1669 |
| lrem.magic.TormentedAngel Antiquitie | 650 | 489 | 466 | 509 | 44.9 / 21.7 | 1697 | 5103 | 3907 |
| lrem.micro.FalseProphet Alpha | 650 | 291 | 409 | 301 | 73.1 / 21.4 | 3751 | 3342 | 918 |
| lrem.quickhack.QuickHack 1.0 | 650 | 364 | 400 | 363 | 70.1 / 15.7 | 3499 | 4554 | 347 |
| mb.Monte 0.1.0 | 650 | 344 | 400 | 313 | 65.2 / 18.1 | 3569 | 4095 | 1453 |
| metal.small.MCool 1.21 | 650 | 471 | 463 | 445 | 36.0 / 11.6 | 483 | 8182 | 2264 |
| mladjo.AIR 0.7 | 650 | 464 | 488 | 513 | 44.3 / 21.1 | 1469 | 3856 | 3648 |
| mladjo.Startko 1.0 | 650 | 298 | 400 | 325 | 67.8 / 21.2 | 3930 | 3624 | 1110 |
| mld.LittleBlackBook 1.69e | 650 | 320 | 400 | 165 | 82.6 / 7.9 | 1760 | 2376 | 588 |
| mld.jdc.nano.LittleBlackBook 1.0 | 650 | 316 | 400 | 166 | 83.0 / 9.3 | 1751 | 2480 | 524 |
| myl.micro.NekoNinja 1.30 | 650 | 504 | 484 | 556 | 45.0 / 15.5 | 856 | 6429 | 180 |
| myl.micro.Predator 1.50 | 650 | 516 | 400 | 447 | 38.7 / 3.3 | 768 | 7195 | 121 |
| mz.Adept 2.65 | 650 | 292 | 400 | 292 | 57.3 / 13.6 | 3275 | 4319 | 1323 |
| mz.AdeptBSB 1.03 | 650 | 255 | 400 | 294 | 63.2 / 2.1 | 3506 | 4109 | 731 |
| nat.nano.Ocnirp 1.73 | 650 | 500 | 581 | 445 | 35.3 / 23.1 | 660 | 4795 | 4579 |
| nat.nano.OcnirpPM 1.0 | 650 | 482 | 556 | 431 | 36.8 / 25.4 | 897 | 5214 | 4085 |
| nova.Snow 1.0 | 650 | 382 | 634 | 607 | 55.8 / 25.1 | 2369 | 3488 | 1970 |
| pez.mini.Gouldingi 1.5 | 650 | 494 | 428 | 425 | 37.0 / 10.3 | 527 | 9261 | 31 |
| qwaker00.Ahchoo 1.6 | 650 | 371 | 475 | 627 | 56.4 / 19.5 | 2588 | 4181 | 29 |
| ratosh.Nobo 0.21 | 650 | 431 | 400 | 310 | 49.0 / 4.3 | 2301 | 7858 | 645 |
| rdt199.Warlord 0.73 | 650 | 383 | 406 | 458 | 50.8 / 17.9 | 2288 | 5091 | 221 |
| rjw.RabidWombat 0.71 | 650 | 354 | 400 | 248 | 63.3 / 7.1 | 2958 | 5437 | 0 |
| robar.nano.MosquitoPM 1.0 | 650 | 455 | 463 | 374 | 48.8 / 19.7 | 2643 | 4433 | 2553 |
| robar.nano.Prestige 1.0 | 650 | 459 | 631 | 466 | 38.6 / 28.6 | 1174 | 4779 | 3177 |
| robar.nano.Scytodes 0.3 | 650 | 399 | 400 | 170 | 76.9 / 7.9 | 1855 | 3741 | 827 |
| robar.nano.Vespa 0.95 | 650 | 406 | 400 | 273 | 64.0 / 13.3 | 3192 | 4478 | 1293 |
| rsk1.RSK1 4.0 | 650 | 468 | 450 | 530 | 55.3 / 15.6 | 2312 | 4207 | 2688 |
| rtk.Tachikoma 1.0 | 650 | 460 | 603 | 547 | 48.4 / 24.8 | 1944 | 4051 | 346 |
| rz.SmallDevil 1.502 | 650 | 399 | 400 | 343 | 49.1 / 7.0 | 2466 | 6520 | 60 |
| satan.White 0.26 | 650 | 331 | 400 | 325 | 63.0 / 12.8 | 3420 | 4073 | 146 |
| sheldor.nano.PointInLine 1.0 | 650 | 477 | 503 | 410 | 32.9 / 20.8 | 840 | 5663 | 4479 |
| sheldor.nano.PointInLineRRAL 1.0.0 | 650 | 357 | 400 | 355 | 58.5 / 15.5 | 3748 | 4520 | 1636 |
| simonton.GFNano_D 3.1b | 650 | 382 | 400 | 358 | 44.7 / 16.1 | 2258 | 5874 | 2318 |
| simonton.nano.WeekendObsession_S 1.7 | 650 | 416 | 463 | 350 | 46.1 / 18.7 | 1502 | 5713 | 948 |
| sm.Devil 7.3 | 650 | 542 | 578 | 890 | 52.1 / 22.5 | 1809 | 3573 | 1362 |
| spinnercat.CopyKat 1.2.3 | 650 | 406 | 403 | 374 | 45.2 / 21.7 | 2134 | 4726 | 3026 |
| spinnercat.Kitten 1.6 | 650 | 412 | 400 | 387 | 45.0 / 20.5 | 1927 | 5030 | 2700 |
| starpkg.StarViewerZ 1.26 | 650 | 440 | 400 | 558 | 59.0 / 10.5 | 2374 | 5405 | 12 |
| stelo.MatchupMicro 1.2 | 650 | 460 | 413 | 478 | 52.1 / 20.5 | 3024 | 5761 | 44 |
| stelo.PianistNano 1.3 | 650 | 493 | 522 | 394 | 38.7 / 20.3 | 1217 | 5587 | 4008 |
| stelo.SteloTestNano 1.0 | 650 | 418 | 400 | 327 | 53.0 / 16.7 | 3166 | 5087 | 1869 |
| suh.nano.RandomPM 1.02 | 650 | 486 | 578 | 473 | 43.6 / 26.3 | 1832 | 4625 | 3785 |
| syl.Centipede 0.5 | 650 | 447 | 466 | 413 | 40.5 / 14.9 | 947 | 7815 | 1362 |
| tobe.Saturn lambda | 650 | 394 | 456 | 422 | 49.9 / 22.0 | 2397 | 4464 | 1767 |
| trab.nano.AinippeNano 1.3 | 650 | 486 | 503 | 401 | 59.0 / 20.7 | 2841 | 6777 | 1401 |
| tzu.TheArtOfWar 1.2 | 650 | 339 | 400 | 329 | 68.6 / 15.1 | 3772 | 4592 | 24 |
| vuen.Fractal 0.55 | 650 | 493 | 450 | 416 | 48.3 / 20.2 | 2158 | 4983 | 33 |
| whind.Constitution 0.7.1 | 650 | 475 | 491 | 494 | 47.5 / 18.4 | 1523 | 6140 | 2057 |
| wiki.mako.MakoHT 1.2.2.1 | 650 | 422 | 422 | 435 | 42.2 / 8.7 | 1041 | 7056 | 425 |
| wiki.nano.RaikoNano 1.1 | 650 | 535 | 597 | 703 | 32.1 / 22.5 | 214 | 10681 | 1983 |
| zen.Lindada 0.2 | 650 | 505 | 566 | 483 | 39.6 / 21.0 | 983 | 6788 | 147 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | 5.2% | 87 | 86 | 3 | 31.7 | 741 / 742 (100%) | 0 | 0 |
| KiraNL.Cataris 1.0 | 10.0% | 111 | 165 | 3 | 28.0 | 458 / 461 (99%) | 0 | 0 |
| PkKillers.PkAssassin 1.0 | 6.1% | 101 | 863 | 3 | 24.9 | 639 / 643 (99%) | 0 | 0 |
| alpha.BlackIce 1.0 | 7.0% | 92 | 193 | 3 | 28.6 | 543 / 546 (99%) | 0 | 0 |
| amk.ChumbaMini 0.2 | 5.8% | 181 | 788 | 3 | 23.2 | 542 / 544 (100%) | 0 | 0 |
| amk.ChumbaWumba 0.3 | 4.3% | 109 | 52 | 3 | 26.2 | 604 / 611 (99%) | 0 | 0 |
| apc.botM 3.0 | 4.7% | 87 | 49 | 3 | 41.0 | 915 / 915 (100%) | 0 | 0 |
| apv.NanoLauLectrik 1.0 | 5.8% | 96 | 47 | 3 | 22.1 | 513 / 515 (100%) | 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 7.3% | 91 | 49 | 3 | 18.9 | 509 / 511 (100%) | 0 | 0 |
| ary.nano.ColorNanoP 1.1 | 7.4% | 85 | 35 | 3 | 17.6 | 560 / 563 (99%) | 0 | 0 |
| asm.Statistas 0.1 | 5.0% | 96 | 76 | 3 | 24.6 | 436 / 438 (100%) | 0 | 0 |
| bigpete.Stewie 1.0 | 2.2% | 88 | 42 | 3 | 22.7 | 449 / 450 (100%) | 0 | 0 |
| brainfade.melee.Dusk 0.44 | 3.8% | 97 | 60 | 3 | 59.5 | 1164 / 1165 (100%) | 0 | 0 |
| buba.Archivist 0.1 | 6.3% | 82 | 48 | 3 | 22.3 | 408 / 409 (100%) | 0 | 0 |
| bvh.mini.Fenrir 0.39 | 7.6% | 111 | 49 | 3 | 26.1 | 461 / 463 (100%) | 0 | 0 |
| casey.Flee 1.0 | 4.9% | 93 | 150 | 3 | 26.0 | 449 / 451 (100%) | 0 | 0 |
| csm.NthGeneration 0.04 | 3.0% | 89 | 46 | 3 | 23.9 | 483 / 484 (100%) | 0 | 0 |
| demetrix.nano.Neutrino 0.27 | 6.1% | 88 | 54 | 3 | 35.6 | 784 / 786 (100%) | 0 | 0 |
| dmp.nano.Eve 3.41 | 4.9% | 88 | 38 | 3 | 11.9 | 203 / 203 (100%) | 0 | 0 |
| ds.OoV4 0.3b | 7.0% | 115 | 62 | 3 | 45.1 | 1168 / 1174 (99%) | 0 | 0 |
| dsx724.VSAB_EP3a 1.0 | 3.1% | 86 | 48 | 3 | 47.0 | 1080 / 1082 (100%) | 0 | 0 |
| dummy.micro.Sparrow 2.5 | 5.6% | 86 | 51 | 3 | 23.1 | 510 / 511 (100%) | 0 | 0 |
| dy.LevelOne 2.0 | 2.5% | 85 | 33 | 3 | 17.4 | 311 / 312 (100%) | 0 | 0 |
| dz.MostlyHarmlessNano 2.1 | 4.3% | 92 | 427 | 3 | 19.0 | 344 / 344 (100%) | 0 | 0 |
| et.Predator 1.8 | 4.0% | 88 | 48 | 3 | 26.0 | 532 / 534 (100%) | 0 | 0 |
| exauge.GateKeeper 1.1.121g | 7.3% | 98 | 53 | 3 | 27.0 | 479 / 481 (100%) | 0 | 0 |
| fcr.First 1.0 | 1.8% | 91 | 27 | 3 | 12.8 | 335 / 338 (99%) | 0 | 0 |
| fnc.bandit2002.Bandit2002 4.0.2 | 7.8% | 85 | 46 | 3 | 23.9 | 441 / 442 (100%) | 0 | 0 |
| frag.FragBot 1.0 | 5.0% | 88 | 47 | 3 | 23.1 | 482 / 485 (99%) | 0 | 0 |
| gh.nano.Grofvuil 0.2 | 1.8% | 85 | 31 | 3 | 13.0 | 292 / 292 (100%) | 0 | 0 |
| gu.MicroScoob 1.3 | 4.5% | 89 | 46 | 3 | 17.3 | 581 / 581 (100%) | 0 | 0 |
| ha2.T3 0.2 | 6.2% | 99 | 49 | 3 | 23.2 | 657 / 659 (100%) | 0 | 0 |
| hamilton.Hamilton 1.0 | 8.2% | 94 | 625 | 3 | 46.6 | 1044 / 1045 (100%) | 0 | 0 |
| ins.MobyNano 0.8 | 6.5% | 94 | 103 | 3 | 23.8 | 543 / 547 (99%) | 0 | 0 |
| jp.Perpy 16.0 | 8.3% | 94 | 59 | 3 | 37.7 | 1080 / 1080 (100%) | 0 | 0 |
| kawigi.nano.FunkyChicken 1.1 | 5.5% | 88 | 1004 | 3 | 21.0 | 510 / 511 (100%) | 0 | 0 |
| kawigi.sbf.Barracuda 1.0 | 0.8% | 82 | 47 | 3 | 24.2 | 341 / 343 (99%) | 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 5.5% | 99 | 49 | 3 | 23.7 | 452 / 455 (99%) | 0 | 0 |
| krzysiek.robbo2.Robbo 1.0.0 | 6.3% | 142 | 624 | 3 | 16.2 | 289 / 289 (100%) | 0 | 0 |
| lechu.Ala 0.0.4 | 9.2% | 116 | 1700 | 3 | 39.6 | 914 / 917 (100%) | 0 | 0 |
| lessonz.robocode.Oz 0.5.0 | 1.5% | 83 | 409 | 3 | 22.6 | 587 / 588 (100%) | 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 6.1% | 112 | 135 | 3 | 34.0 | 780 / 782 (100%) | 0 | 0 |
| lrem.micro.FalseProphet Alpha | 10.7% | 93 | 38 | 3 | 19.1 | 471 / 474 (99%) | 0 | 0 |
| lrem.quickhack.QuickHack 1.0 | 7.9% | 101 | 43 | 3 | 24.2 | 628 / 629 (100%) | 0 | 0 |
| mb.Monte 0.1.0 | 8.6% | 77 | 254 | 3 | 19.0 | 563 / 563 (100%) | 0 | 0 |
| metal.small.MCool 1.21 | 3.2% | 84 | 2100 | 3 | 25.6 | 419 / 420 (100%) | 0 | 0 |
| mladjo.AIR 0.7 | 6.0% | 99 | 164 | 3 | 34.2 | 778 / 779 (100%) | 0 | 0 |
| mladjo.Startko 1.0 | 9.7% | 88 | 42 | 3 | 21.2 | 416 / 418 (100%) | 0 | 0 |
| mld.LittleBlackBook 1.69e | 6.8% | 127 | 30 | 3 | 9.5 | 166 / 169 (98%) | 0 | 0 |
| mld.jdc.nano.LittleBlackBook 1.0 | 7.9% | 142 | 27 | 3 | 9.5 | 183 / 184 (99%) | 0 | 0 |
| myl.micro.NekoNinja 1.30 | 4.8% | 100 | 90 | 3 | 34.0 | 673 / 674 (100%) | 0 | 0 |
| myl.micro.Predator 1.50 | 1.1% | 85 | 46 | 3 | 25.9 | 531 / 531 (100%) | 0 | 0 |
| mz.Adept 2.65 | 6.1% | 91 | 38 | 3 | 16.5 | 431 / 432 (100%) | 0 | 0 |
| mz.AdeptBSB 1.03 | 1.3% | 91 | 212 | 3 | 18.8 | 418 / 422 (99%) | 0 | 0 |
| nat.nano.Ocnirp 1.73 | 7.5% | 98 | 48 | 3 | 26.7 | 600 / 611 (98%) | 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 6.9% | 80 | 300 | 3 | 26.0 | 568 / 570 (100%) | 0 | 0 |
| nova.Snow 1.0 | 9.0% | 94 | 57 | 3 | 42.4 | 939 / 940 (100%) | 0 | 0 |
| pez.mini.Gouldingi 1.5 | 2.8% | 79 | 43 | 3 | 25.3 | 579 / 579 (100%) | 0 | 0 |
| qwaker00.Ahchoo 1.6 | 7.2% | 92 | 3841 | 3 | 33.9 | 887 / 887 (100%) | 0 | 0 |
| ratosh.Nobo 0.21 | 1.7% | 92 | 36 | 3 | 18.1 | 346 / 348 (99%) | 0 | 0 |
| rdt199.Warlord 0.73 | 6.4% | 109 | 53 | 3 | 27.6 | 628 / 629 (100%) | 0 | 0 |
| rjw.RabidWombat 0.71 | 3.0% | 88 | 37 | 3 | 13.5 | 294 / 294 (100%) | 0 | 0 |
| robar.nano.MosquitoPM 1.0 | 6.4% | 101 | 112 | 3 | 22.7 | 437 / 439 (100%) | 0 | 0 |
| robar.nano.Prestige 1.0 | 7.1% | 85 | 3109 | 3 | 28.3 | 560 / 561 (100%) | 0 | 0 |
| robar.nano.Scytodes 0.3 | 5.0% | 78 | 32 | 2 | 9.1 | 191 / 191 (100%) | 0 | 0 |
| robar.nano.Vespa 0.95 | 6.0% | 86 | 782 | 3 | 16.3 | 383 / 385 (99%) | 0 | 0 |
| rsk1.RSK1 4.0 | 5.9% | 95 | 65 | 3 | 32.9 | 763 / 763 (100%) | 0 | 0 |
| rtk.Tachikoma 1.0 | 7.3% | 95 | 5382 | 3 | 38.3 | 786 / 787 (100%) | 0 | 0 |
| rz.SmallDevil 1.502 | 2.4% | 88 | 40 | 3 | 20.5 | 463 / 463 (100%) | 0 | 0 |
| satan.White 0.26 | 5.3% | 89 | 34 | 3 | 20.8 | 432 / 432 (100%) | 0 | 0 |
| sheldor.nano.PointInLine 1.0 | 5.3% | 102 | 199 | 3 | 23.4 | 490 / 490 (100%) | 0 | 0 |
| sheldor.nano.PointInLineRRAL 1.0.0 | 6.5% | 86 | 44 | 3 | 23.1 | 446 / 447 (100%) | 0 | 0 |
| simonton.GFNano_D 3.1b | 4.7% | 85 | 44 | 3 | 20.6 | 409 / 409 (100%) | 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 6.2% | 89 | 48 | 3 | 20.7 | 495 / 497 (100%) | 0 | 0 |
| sm.Devil 7.3 | 7.9% | 176 | 2043 | 3 | 67.3 | 1369 / 1375 (100%) | 0 | 0 |
| spinnercat.CopyKat 1.2.3 | 7.0% | 77 | 295 | 3 | 22.5 | 602 / 607 (99%) | 0 | 0 |
| spinnercat.Kitten 1.6 | 6.4% | 82 | 1454 | 3 | 23.6 | 622 / 623 (100%) | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 4.3% | 100 | 50 | 3 | 40.6 | 823 / 823 (100%) | 0 | 0 |
| stelo.MatchupMicro 1.2 | 6.4% | 87 | 55 | 3 | 31.0 | 788 / 791 (100%) | 0 | 0 |
| stelo.PianistNano 1.3 | 5.4% | 90 | 156 | 3 | 22.5 | 351 / 353 (99%) | 0 | 0 |
| stelo.SteloTestNano 1.0 | 5.3% | 79 | 46 | 3 | 18.6 | 440 / 441 (100%) | 0 | 0 |
| suh.nano.RandomPM 1.02 | 7.9% | 91 | 60 | 3 | 30.9 | 535 / 538 (99%) | 0 | 0 |
| syl.Centipede 0.5 | 4.0% | 88 | 1561 | 3 | 22.9 | 326 / 328 (99%) | 0 | 0 |
| tobe.Saturn lambda | 6.4% | 90 | 55 | 3 | 20.1 | 342 / 344 (99%) | 0 | 0 |
| trab.nano.AinippeNano 1.3 | 8.5% | 88 | 294 | 3 | 26.8 | 453 / 455 (100%) | 0 | 0 |
| tzu.TheArtOfWar 1.2 | 8.0% | 97 | 33 | 3 | 18.5 | 338 / 340 (99%) | 0 | 0 |
| vuen.Fractal 0.55 | 6.4% | 99 | 38 | 3 | 20.4 | 374 / 376 (99%) | 0 | 0 |
| whind.Constitution 0.7.1 | 5.8% | 96 | 52 | 3 | 32.2 | 530 / 530 (100%) | 0 | 0 |
| wiki.mako.MakoHT 1.2.2.1 | 2.8% | 77 | 45 | 3 | 27.2 | 523 / 525 (100%) | 0 | 0 |
| wiki.nano.RaikoNano 1.1 | 5.5% | 100 | 69 | 3 | 47.8 | 1170 / 1176 (99%) | 0 | 0 |
| zen.Lindada 0.2 | 5.0% | 84 | 2005 | 2 | 29.2 | 688 / 688 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| KiraNL.Cataris 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| PkKillers.PkAssassin 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| alpha.BlackIce 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| amk.ChumbaMini 0.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| amk.ChumbaWumba 0.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apc.botM 3.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.NanoLauLectrik 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ary.nano.ColorNanoP 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| asm.Statistas 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bigpete.Stewie 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| brainfade.melee.Dusk 0.44 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| buba.Archivist 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.mini.Fenrir 0.39 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| casey.Flee 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| csm.NthGeneration 0.04 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| demetrix.nano.Neutrino 0.27 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dmp.nano.Eve 3.41 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ds.OoV4 0.3b | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dsx724.VSAB_EP3a 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dummy.micro.Sparrow 2.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dy.LevelOne 2.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dz.MostlyHarmlessNano 2.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| et.Predator 1.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| exauge.GateKeeper 1.1.121g | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| fcr.First 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| fnc.bandit2002.Bandit2002 4.0.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| frag.FragBot 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gh.nano.Grofvuil 0.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gu.MicroScoob 1.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ha2.T3 0.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| hamilton.Hamilton 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ins.MobyNano 0.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jp.Perpy 16.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.nano.FunkyChicken 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.sbf.Barracuda 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| krzysiek.robbo2.Robbo 1.0.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lechu.Ala 0.0.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lessonz.robocode.Oz 0.5.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lrem.micro.FalseProphet Alpha | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lrem.quickhack.QuickHack 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mb.Monte 0.1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| metal.small.MCool 1.21 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mladjo.AIR 0.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mladjo.Startko 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mld.LittleBlackBook 1.69e | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mld.jdc.nano.LittleBlackBook 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| myl.micro.NekoNinja 1.30 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| myl.micro.Predator 1.50 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mz.Adept 2.65 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mz.AdeptBSB 1.03 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.nano.Ocnirp 1.73 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nova.Snow 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.mini.Gouldingi 1.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| qwaker00.Ahchoo 1.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ratosh.Nobo 0.21 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rdt199.Warlord 0.73 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rjw.RabidWombat 0.71 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.nano.MosquitoPM 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.nano.Prestige 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.nano.Scytodes 0.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.nano.Vespa 0.95 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rsk1.RSK1 4.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rtk.Tachikoma 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rz.SmallDevil 1.502 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| satan.White 0.26 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sheldor.nano.PointInLine 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sheldor.nano.PointInLineRRAL 1.0.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.GFNano_D 3.1b | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sm.Devil 7.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| spinnercat.CopyKat 1.2.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| spinnercat.Kitten 1.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| starpkg.StarViewerZ 1.26 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.MatchupMicro 1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.PianistNano 1.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.SteloTestNano 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| suh.nano.RandomPM 1.02 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| syl.Centipede 0.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tobe.Saturn lambda | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| trab.nano.AinippeNano 1.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tzu.TheArtOfWar 1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| vuen.Fractal 0.55 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| whind.Constitution 0.7.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wiki.mako.MakoHT 1.2.2.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wiki.nano.RaikoNano 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| zen.Lindada 0.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | hadur2.Hadur 3.9sa | 8 | 87.5% ± 17.7 | 96.3% ± 4.3 | +8.8 ± 20.2 | 41.2% ± 17.8 | 74.1% ± 7.7 | +32.9 ± 23.8 |
| CharlieN.Omega.Omega 1.03 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 98.8% ± 3.0 | +8.7 ± 8.3 | 61.0% ± 4.2 | 69.7% ± 8.3 | +8.7 ± 7.4 |
| KiraNL.Cataris 1.0 | hadur2.Hadur 3.9sa | 8 | 87.5% ± 15.3 | 92.5% ± 9.7 | +5.0 ± 20.0 | 35.7% ± 10.8 | 67.5% ± 5.7 | +31.8 ± 14.7 |
| KiraNL.Cataris 1.0 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 90.0% ± 7.7 | +2.5 ± 9.7 | 59.5% ± 8.1 | 66.5% ± 6.7 | +7.0 ± 11.8 |
| PkKillers.PkAssassin 1.0 | hadur2.Hadur 3.9sa | 8 | 92.5% ± 8.7 | 97.5% ± 5.9 | +5.0 ± 7.7 | 56.3% ± 12.1 | 76.6% ± 4.7 | +20.3 ± 14.0 |
| PkKillers.PkAssassin 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 80.0% ± 5.0 | 84.1% ± 2.3 | +4.1 ± 6.2 |
| alpha.BlackIce 1.0 | hadur2.Hadur 3.9sa | 8 | 87.5% ± 8.7 | 95.0% ± 6.3 | +7.5 ± 9.7 | 41.5% ± 6.8 | 66.4% ± 6.3 | +24.9 ± 11.1 |
| alpha.BlackIce 1.0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 12.4 | 97.5% ± 3.9 | +5.0 ± 12.6 | 67.0% ± 7.0 | 75.5% ± 2.9 | +8.4 ± 8.2 |
| amk.ChumbaMini 0.2 | hadur2.Hadur 3.9sa | 8 | 67.5% ± 21.8 | 97.5% ± 3.9 | +30.0 ± 18.4 | 38.3% ± 8.7 | 69.0% ± 8.1 | +30.8 ± 11.7 |
| amk.ChumbaMini 0.2 | hadur2.Hadur 3.9 | 8 | 85.0% ± 11.8 | 97.5% ± 5.9 | +12.5 ± 12.4 | 55.0% ± 7.2 | 65.5% ± 9.0 | +10.5 ± 10.1 |
| amk.ChumbaWumba 0.3 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 54.9% ± 13.4 | 58.4% ± 12.1 | +3.5 ± 17.1 |
| amk.ChumbaWumba 0.3 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 7.4 | 57.1% ± 8.5 | 59.9% ± 10.0 | +2.8 ± 11.7 |
| apc.botM 3.0 | hadur2.Hadur 3.9sa | 8 | 87.5% ± 12.4 | 97.5% ± 5.9 | +10.0 ± 12.6 | 46.2% ± 6.5 | 72.1% ± 7.2 | +26.0 ± 7.9 |
| apc.botM 3.0 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 100.0% ± 0.0 | +10.0 ± 8.9 | 68.4% ± 7.9 | 79.8% ± 5.1 | +11.5 ± 7.5 |
| apv.NanoLauLectrikTheCannibal 1.1 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 84.7% ± 14.1 | 80.5% ± 8.3 | -4.2 ± 14.9 |
| apv.NanoLauLectrikTheCannibal 1.1 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 64.9% ± 3.8 | 75.8% ± 2.3 | +10.9 ± 2.9 |
| apv.NanoLauLectrik 1.0 | hadur2.Hadur 3.9sa | 8 | 57.5% ± 20.8 | 95.0% ± 6.3 | +37.5 ± 21.3 | 31.8% ± 4.6 | 60.5% ± 2.7 | +28.8 ± 4.2 |
| apv.NanoLauLectrik 1.0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 97.5% ± 3.9 | +5.0 ± 8.9 | 56.2% ± 8.3 | 66.6% ± 6.4 | +10.3 ± 13.7 |
| ary.nano.ColorNanoP 1.1 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 59.7% ± 4.2 | 74.6% ± 3.2 | +14.9 ± 4.5 |
| ary.nano.ColorNanoP 1.1 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 71.5% ± 4.8 | 79.6% ± 3.8 | +8.1 ± 7.5 |
| asm.Statistas 0.1 | hadur2.Hadur 3.9sa | 8 | 95.0% ± 7.7 | 96.3% ± 4.3 | +1.2 ± 10.4 | 68.8% ± 23.1 | 65.5% ± 4.4 | -3.3 ± 23.7 |
| asm.Statistas 0.1 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 60.7% ± 7.6 | 63.5% ± 6.5 | +2.8 ± 13.3 |
| bigpete.Stewie 1.0 | hadur2.Hadur 3.9sa | 8 | 80.0% ± 23.6 | 98.8% ± 3.0 | +18.8 ± 24.7 | 51.2% ± 8.6 | 87.6% ± 3.6 | +36.3 ± 9.5 |
| bigpete.Stewie 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 85.4% ± 4.1 | 94.6% ± 2.8 | +9.1 ± 5.0 |
| brainfade.melee.Dusk 0.44 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 74.2% ± 23.4 | 57.8% ± 20.7 | -16.5 ± 39.6 |
| brainfade.melee.Dusk 0.44 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 80.2% ± 3.0 | 84.6% ± 4.4 | +4.4 ± 3.1 |
| buba.Archivist 0.1 | hadur2.Hadur 3.9sa | 8 | 95.0% ± 7.7 | 96.3% ± 4.3 | +1.2 ± 5.4 | 51.3% ± 23.4 | 53.5% ± 20.1 | +2.2 ± 28.4 |
| buba.Archivist 0.1 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 97.4% ± 4.1 | -2.6 ± 4.1 | 64.2% ± 7.5 | 70.7% ± 6.0 | +6.5 ± 9.3 |
| bvh.mini.Fenrir 0.39 | hadur2.Hadur 3.9sa | 8 | 95.0% ± 7.7 | 93.8% ± 6.2 | -1.2 ± 12.2 | 59.8% ± 13.7 | 66.3% ± 4.2 | +6.6 ± 13.8 |
| bvh.mini.Fenrir 0.39 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 95.0% ± 4.5 | +2.5 ± 8.7 | 63.6% ± 6.2 | 66.2% ± 2.3 | +2.6 ± 6.1 |
| casey.Flee 1.0 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 44.1% ± 14.3 | 56.2% ± 7.9 | +12.2 ± 10.7 |
| casey.Flee 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 97.5% ± 5.9 | +0.0 ± 8.9 | 60.9% ± 8.7 | 68.2% ± 7.7 | +7.3 ± 11.6 |
| csm.NthGeneration 0.04 | hadur2.Hadur 3.9sa | 8 | 90.0% ± 8.9 | 98.8% ± 3.0 | +8.7 ± 8.3 | 50.0% ± 23.7 | 64.9% ± 12.6 | +14.8 ± 29.3 |
| csm.NthGeneration 0.04 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 79.9% ± 3.4 | 91.1% ± 1.9 | +11.2 ± 2.3 |
| demetrix.nano.Neutrino 0.27 | hadur2.Hadur 3.9sa | 8 | 82.5% ± 14.0 | 91.3% ± 7.0 | +8.8 ± 11.3 | 45.8% ± 5.6 | 63.8% ± 3.9 | +17.9 ± 8.0 |
| demetrix.nano.Neutrino 0.27 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 96.3% ± 4.3 | +6.3 ± 10.9 | 56.7% ± 8.5 | 64.9% ± 4.4 | +8.2 ± 7.8 |
| dmp.nano.Eve 3.41 | hadur2.Hadur 3.9sa | 8 | 72.5% ± 17.7 | 100.0% ± 0.0 | +27.5 ± 17.7 | 46.7% ± 10.7 | 88.5% ± 3.6 | +41.9 ± 11.4 |
| dmp.nano.Eve 3.41 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 80.5% ± 6.5 | 87.3% ± 3.6 | +6.8 ± 5.8 |
| ds.OoV4 0.3b | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 61.4% ± 17.8 | 64.7% ± 12.7 | +3.3 ± 13.2 |
| ds.OoV4 0.3b | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 4.5 | 80.2% ± 6.3 | 83.7% ± 2.2 | +3.5 ± 6.2 |
| dsx724.VSAB_EP3a 1.0 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 57.6% ± 16.2 | 48.4% ± 21.7 | -9.2 ± 24.3 |
| dsx724.VSAB_EP3a 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 85.8% ± 5.2 | 95.1% ± 2.4 | +9.3 ± 5.2 |
| dummy.micro.Sparrow 2.5 | hadur2.Hadur 3.9sa | 8 | 92.5% ± 12.4 | 91.3% ± 7.0 | -1.2 ± 13.7 | 45.1% ± 13.7 | 57.7% ± 9.7 | +12.6 ± 20.7 |
| dummy.micro.Sparrow 2.5 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 3.0 | 73.3% ± 8.0 | 78.4% ± 4.1 | +5.1 ± 6.5 |
| dy.LevelOne 2.0 | hadur2.Hadur 3.9sa | 8 | 30.0% ± 17.9 | 100.0% ± 0.0 | +70.0 ± 17.9 | 34.3% ± 6.8 | 91.8% ± 2.0 | +57.5 ± 8.5 |
| dy.LevelOne 2.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 80.5% ± 2.7 | 96.5% ± 2.3 | +15.9 ± 4.9 |
| dz.MostlyHarmlessNano 2.1 | hadur2.Hadur 3.9sa | 8 | 87.5% ± 12.4 | 96.3% ± 4.3 | +8.8 ± 14.4 | 45.0% ± 14.6 | 69.4% ± 6.8 | +24.4 ± 20.2 |
| dz.MostlyHarmlessNano 2.1 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 80.3% ± 4.0 | 89.8% ± 3.0 | +9.5 ± 5.0 |
| et.Predator 1.8 | hadur2.Hadur 3.9sa | 8 | 90.0% ± 8.9 | 96.3% ± 6.2 | +6.2 ± 11.8 | 60.1% ± 11.7 | 63.0% ± 8.0 | +3.0 ± 16.1 |
| et.Predator 1.8 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 96.3% ± 4.3 | -1.2 ± 5.4 | 75.5% ± 8.2 | 74.3% ± 4.9 | -1.2 ± 10.2 |
| exauge.GateKeeper 1.1.121g | hadur2.Hadur 3.9sa | 8 | 77.5% ± 24.4 | 96.1% ± 4.5 | +18.6 ± 25.0 | 38.6% ± 11.1 | 60.3% ± 4.6 | +21.7 ± 14.4 |
| exauge.GateKeeper 1.1.121g | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 91.3% ± 5.4 | +1.2 ± 9.4 | 59.3% ± 8.6 | 61.4% ± 4.9 | +2.1 ± 6.9 |
| fcr.First 1.0 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 72.9% ± 4.5 | 85.0% ± 3.7 | +12.1 ± 6.7 |
| fcr.First 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 89.7% ± 4.1 | 97.2% ± 0.9 | +7.5 ± 4.3 |
| fnc.bandit2002.Bandit2002 4.0.2 | hadur2.Hadur 3.9sa | 8 | 87.5% ± 12.4 | 96.3% ± 6.2 | +8.8 ± 16.4 | 45.4% ± 5.6 | 75.8% ± 5.2 | +30.4 ± 9.0 |
| fnc.bandit2002.Bandit2002 4.0.2 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 92.4% ± 6.0 | +4.9 ± 16.1 | 71.0% ± 3.3 | 75.2% ± 5.1 | +4.1 ± 5.9 |
| frag.FragBot 1.0 | hadur2.Hadur 3.9sa | 8 | 85.0% ± 11.8 | 97.5% ± 3.9 | +12.5 ± 11.6 | 37.8% ± 6.2 | 76.0% ± 4.5 | +38.2 ± 9.2 |
| frag.FragBot 1.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 96.3% ± 6.2 | +1.2 ± 7.0 | 74.1% ± 4.1 | 83.9% ± 7.7 | +9.8 ± 10.0 |
| gh.nano.Grofvuil 0.2 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 69.5% ± 15.0 | 69.8% ± 8.2 | +0.3 ± 15.8 |
| gh.nano.Grofvuil 0.2 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 87.8% ± 3.5 | 98.6% ± 1.1 | +10.8 ± 3.9 |
| gu.MicroScoob 1.3 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 61.5% ± 8.5 | 78.9% ± 8.4 | +17.4 ± 12.6 |
| gu.MicroScoob 1.3 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 70.0% ± 7.5 | 81.3% ± 2.8 | +11.3 ± 6.4 |
| ha2.T3 0.2 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 66.4% ± 19.2 | 70.2% ± 7.8 | +3.9 ± 20.3 |
| ha2.T3 0.2 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 93.8% ± 6.2 | -1.2 ± 5.4 | 69.5% ± 6.2 | 76.4% ± 6.6 | +7.0 ± 9.1 |
| hamilton.Hamilton 1.0 | hadur2.Hadur 3.9sa | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 50.7% ± 8.7 | 77.7% ± 4.6 | +27.0 ± 7.9 |
| hamilton.Hamilton 1.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 95.0% ± 6.3 | +0.0 ± 10.0 | 76.3% ± 7.1 | 80.0% ± 5.1 | +3.7 ± 8.0 |
| ins.MobyNano 0.8 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 96.3% ± 4.3 | -1.2 ± 8.3 | 51.2% ± 13.6 | 53.9% ± 12.3 | +2.7 ± 22.6 |
| ins.MobyNano 0.8 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 98.8% ± 3.0 | +8.8 ± 13.7 | 53.1% ± 10.2 | 66.2% ± 5.8 | +13.1 ± 12.1 |
| jp.Perpy 16.0 | hadur2.Hadur 3.9sa | 8 | 87.5% ± 8.7 | 91.3% ± 9.4 | +3.7 ± 13.4 | 57.7% ± 6.9 | 74.7% ± 8.6 | +17.1 ± 12.4 |
| jp.Perpy 16.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 94.9% ± 6.4 | -2.6 ± 9.8 | 76.5% ± 5.1 | 80.1% ± 3.6 | +3.6 ± 6.9 |
| kawigi.nano.FunkyChicken 1.1 | hadur2.Hadur 3.9sa | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 57.0% ± 11.9 | 55.7% ± 8.5 | -1.3 ± 15.7 |
| kawigi.nano.FunkyChicken 1.1 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 66.3% ± 5.6 | 71.0% ± 3.9 | +4.7 ± 5.6 |
| kawigi.sbf.Barracuda 1.0 | hadur2.Hadur 3.9sa | 8 | 95.0% ± 7.7 | 91.3% ± 7.0 | -3.7 ± 11.8 | 39.8% ± 30.8 | 56.5% ± 12.3 | +16.7 ± 35.7 |
| kawigi.sbf.Barracuda 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 91.7% ± 9.7 | 95.9% ± 2.3 | +4.2 ± 10.6 |
| kinsen.nano.Quarrelet 1.0 | hadur2.Hadur 3.9sa | 8 | 57.5% ± 24.4 | 95.0% ± 6.3 | +37.5 ± 27.8 | 26.7% ± 5.8 | 70.5% ± 8.1 | +43.8 ± 13.0 |
| kinsen.nano.Quarrelet 1.0 | hadur2.Hadur 3.9 | 8 | 85.0% ± 11.8 | 97.5% ± 5.9 | +12.5 ± 15.3 | 56.2% ± 11.4 | 63.0% ± 5.1 | +6.8 ± 11.3 |
| krzysiek.robbo2.Robbo 1.0.0 | hadur2.Hadur 3.9sa | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 9.7 | 66.7% ± 5.2 | 76.3% ± 5.8 | +9.5 ± 6.2 |
| krzysiek.robbo2.Robbo 1.0.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 78.9% ± 5.5 | 78.9% ± 4.2 | +0.0 ± 8.1 |
| lechu.Ala 0.0.4 | hadur2.Hadur 3.9sa | 8 | 75.0% ± 7.7 | 92.5% ± 5.9 | +17.5 ± 10.7 | 56.1% ± 5.8 | 74.9% ± 3.2 | +18.7 ± 7.7 |
| lechu.Ala 0.0.4 | hadur2.Hadur 3.9 | 8 | 80.0% ± 12.6 | 91.0% ± 9.5 | +11.0 ± 21.2 | 68.8% ± 6.3 | 77.1% ± 5.3 | +8.3 ± 9.9 |
| lessonz.robocode.Oz 0.5.0 | hadur2.Hadur 3.9sa | 8 | 92.5% ± 12.4 | 100.0% ± 0.0 | +7.5 ± 12.4 | 53.8% ± 11.6 | 82.5% ± 4.9 | +28.7 ± 14.8 |
| lessonz.robocode.Oz 0.5.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 83.8% ± 4.5 | 97.3% ± 1.9 | +13.5 ± 5.3 |
| lrem.magic.TormentedAngel Antiquitie | hadur2.Hadur 3.9sa | 8 | 90.0% ± 8.9 | 98.8% ± 3.0 | +8.7 ± 10.4 | 36.8% ± 21.2 | 41.9% ± 15.1 | +5.1 ± 30.5 |
| lrem.magic.TormentedAngel Antiquitie | hadur2.Hadur 3.9 | 8 | 95.0% ± 11.8 | 93.8% ± 4.3 | -1.2 ± 11.3 | 59.6% ± 11.0 | 70.8% ± 3.2 | +11.2 ± 11.2 |
| lrem.micro.FalseProphet Alpha | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 64.2% ± 7.5 | 75.4% ± 3.1 | +11.2 ± 7.5 |
| lrem.micro.FalseProphet Alpha | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 98.8% ± 3.0 | +3.7 ± 8.9 | 69.2% ± 5.0 | 79.8% ± 3.0 | +10.6 ± 6.9 |
| lrem.quickhack.QuickHack 1.0 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 33.8% ± 17.8 | 28.2% ± 22.0 | -5.6 ± 25.1 |
| lrem.quickhack.QuickHack 1.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 7.4 | 75.4% ± 6.7 | 82.6% ± 3.3 | +7.2 ± 6.6 |
| mb.Monte 0.1.0 | hadur2.Hadur 3.9sa | 8 | 87.5% ± 8.7 | 97.5% ± 3.9 | +10.0 ± 7.7 | 61.6% ± 3.5 | 79.5% ± 2.4 | +17.9 ± 2.3 |
| mb.Monte 0.1.0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 12.4 | 97.5% ± 3.9 | +5.0 ± 12.6 | 70.9% ± 4.8 | 80.8% ± 4.7 | +9.9 ± 6.4 |
| metal.small.MCool 1.21 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 4.5 | 57.1% ± 17.2 | 69.7% ± 18.4 | +12.6 ± 13.4 |
| metal.small.MCool 1.21 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 100.0% ± 0.0 | +7.5 ± 8.7 | 63.1% ± 8.1 | 79.6% ± 4.8 | +16.5 ± 10.8 |
| mladjo.AIR 0.7 | hadur2.Hadur 3.9sa | 8 | 92.5% ± 8.7 | 96.3% ± 6.2 | +3.7 ± 12.6 | 40.6% ± 15.7 | 61.3% ± 6.7 | +20.7 ± 20.9 |
| mladjo.AIR 0.7 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 62.1% ± 4.3 | 70.9% ± 4.4 | +8.9 ± 7.0 |
| mladjo.Startko 1.0 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 23.3% ± 14.1 | 38.3% ± 21.4 | +15.0 ± 19.4 |
| mladjo.Startko 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 70.3% ± 3.5 | 75.2% ± 4.4 | +4.8 ± 2.3 |
| mld.LittleBlackBook 1.69e | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 68.5% ± 4.1 | 90.2% ± 3.4 | +21.7 ± 5.5 |
| mld.LittleBlackBook 1.69e | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 85.5% ± 4.8 | 92.8% ± 3.4 | +7.3 ± 5.6 |
| mld.jdc.nano.LittleBlackBook 1.0 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 69.6% ± 4.3 | 90.0% ± 2.0 | +20.4 ± 4.3 |
| mld.jdc.nano.LittleBlackBook 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 82.5% ± 5.7 | 89.6% ± 2.1 | +7.1 ± 4.6 |
| myl.micro.NekoNinja 1.30 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 4.5 | 72.4% ± 19.4 | 80.1% ± 10.8 | +7.7 ± 19.3 |
| myl.micro.NekoNinja 1.30 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 68.1% ± 6.2 | 75.9% ± 4.6 | +7.8 ± 7.8 |
| myl.micro.Predator 1.50 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 56.0% ± 12.8 | 65.5% ± 5.0 | +9.5 ± 15.4 |
| myl.micro.Predator 1.50 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 96.9% ± 4.2 | 94.1% ± 2.4 | -2.8 ± 5.1 |
| mz.AdeptBSB 1.03 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 36.5% ± 24.9 | 33.0% ± 18.1 | -3.5 ± 27.4 |
| mz.AdeptBSB 1.03 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 86.6% ± 7.1 | 98.8% ± 1.2 | +12.3 ± 7.8 |
| mz.Adept 2.65 | hadur2.Hadur 3.9sa | 8 | 80.0% ± 12.6 | 90.0% ± 10.0 | +10.0 ± 17.3 | 39.7% ± 6.8 | 61.6% ± 14.0 | +21.9 ± 17.3 |
| mz.Adept 2.65 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 100.0% ± 0.0 | +7.5 ± 8.7 | 66.2% ± 5.8 | 86.3% ± 5.6 | +20.2 ± 6.0 |
| nat.nano.OcnirpPM 1.0 | hadur2.Hadur 3.9sa | 8 | 95.0% ± 7.7 | 96.3% ± 6.2 | +1.2 ± 11.3 | 31.2% ± 16.0 | 46.9% ± 11.7 | +15.6 ± 14.5 |
| nat.nano.OcnirpPM 1.0 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 92.5% ± 5.9 | +5.0 ± 14.8 | 57.3% ± 9.0 | 54.7% ± 3.7 | -2.5 ± 9.3 |
| nat.nano.Ocnirp 1.73 | hadur2.Hadur 3.9sa | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 30.4% ± 18.8 | 57.5% ± 4.3 | +27.2 ± 18.8 |
| nat.nano.Ocnirp 1.73 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 95.0% ± 6.3 | +5.0 ± 16.7 | 52.4% ± 11.9 | 59.4% ± 5.6 | +7.0 ± 16.5 |
| nova.Snow 1.0 | hadur2.Hadur 3.9sa | 8 | 90.0% ± 8.9 | 90.0% ± 10.0 | -0.0 ± 13.4 | 55.1% ± 6.4 | 70.0% ± 2.7 | +14.9 ± 7.7 |
| nova.Snow 1.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 88.5% ± 9.6 | -6.5 ± 11.2 | 67.6% ± 4.2 | 70.9% ± 5.6 | +3.3 ± 5.8 |
| pez.mini.Gouldingi 1.5 | hadur2.Hadur 3.9sa | 8 | 92.5% ± 8.7 | 100.0% ± 0.0 | +7.5 ± 8.7 | 63.7% ± 25.7 | 71.8% ± 9.1 | +8.1 ± 25.0 |
| pez.mini.Gouldingi 1.5 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 67.2% ± 9.6 | 81.3% ± 5.9 | +14.1 ± 11.3 |
| qwaker00.Ahchoo 1.6 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 92.5% ± 5.9 | -7.5 ± 5.9 | 57.7% ± 22.7 | 61.4% ± 7.3 | +3.7 ± 24.2 |
| qwaker00.Ahchoo 1.6 | hadur2.Hadur 3.9 | 8 | 85.0% ± 11.8 | 86.3% ± 13.4 | +1.2 ± 20.2 | 69.2% ± 7.6 | 76.4% ± 4.8 | +7.2 ± 10.9 |
| ratosh.Nobo 0.21 | hadur2.Hadur 3.9sa | 8 | 50.0% ± 23.6 | 100.0% ± 0.0 | +50.0 ± 23.6 | 30.8% ± 8.5 | 86.3% ± 2.7 | +55.5 ± 9.0 |
| ratosh.Nobo 0.21 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 74.3% ± 7.7 | 96.9% ± 3.5 | +22.6 ± 10.9 |
| rdt199.Warlord 0.73 | hadur2.Hadur 3.9sa | 8 | 87.5% ± 12.4 | 97.5% ± 5.9 | +10.0 ± 8.9 | 54.6% ± 13.1 | 73.0% ± 11.7 | +18.4 ± 20.8 |
| rdt199.Warlord 0.73 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 96.3% ± 4.3 | +1.2 ± 8.3 | 71.7% ± 5.3 | 73.3% ± 4.5 | +1.6 ± 7.3 |
| rjw.RabidWombat 0.71 | hadur2.Hadur 3.9sa | 8 | 90.0% ± 8.9 | 90.0% ± 7.7 | +0.0 ± 11.8 | 60.0% ± 10.6 | 63.6% ± 6.8 | +3.6 ± 11.4 |
| rjw.RabidWombat 0.71 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 76.8% ± 2.7 | 91.4% ± 4.8 | +14.6 ± 5.1 |
| robar.nano.MosquitoPM 1.0 | hadur2.Hadur 3.9sa | 8 | 90.0% ± 8.9 | 98.8% ± 3.0 | +8.7 ± 10.4 | 27.4% ± 19.0 | 66.6% ± 18.1 | +39.2 ± 29.8 |
| robar.nano.MosquitoPM 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 69.2% ± 6.8 | 66.6% ± 3.0 | -2.6 ± 7.5 |
| robar.nano.Prestige 1.0 | hadur2.Hadur 3.9sa | 8 | 92.5% ± 12.4 | 91.1% ± 8.3 | -1.4 ± 16.9 | 39.6% ± 9.6 | 51.9% ± 9.0 | +12.4 ± 15.8 |
| robar.nano.Prestige 1.0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 84.6% ± 11.0 | -7.9 ± 7.3 | 59.5% ± 5.4 | 54.3% ± 5.3 | -5.2 ± 6.0 |
| robar.nano.Scytodes 0.3 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 73.8% ± 9.8 | 74.8% ± 10.1 | +1.0 ± 15.4 |
| robar.nano.Scytodes 0.3 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 86.2% ± 4.5 | 89.9% ± 3.7 | +3.6 ± 5.6 |
| robar.nano.Vespa 0.95 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 43.6% ± 25.4 | 52.1% ± 12.1 | +8.5 ± 34.8 |
| robar.nano.Vespa 0.95 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 78.5% ± 6.0 | 82.8% ± 4.3 | +4.3 ± 6.5 |
| rsk1.RSK1 4.0 | hadur2.Hadur 3.9sa | 8 | 92.5% ± 8.7 | 98.8% ± 3.0 | +6.2 ± 9.9 | 37.7% ± 18.7 | 56.6% ± 22.6 | +18.9 ± 36.6 |
| rsk1.RSK1 4.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 11.8 | 96.3% ± 4.3 | +1.3 ± 10.4 | 66.3% ± 7.7 | 82.4% ± 3.6 | +16.1 ± 9.6 |
| rtk.Tachikoma 1.0 | hadur2.Hadur 3.9sa | 8 | 85.0% ± 11.8 | 96.0% ± 6.8 | +11.0 ± 8.1 | 42.6% ± 11.3 | 61.7% ± 13.8 | +19.2 ± 17.7 |
| rtk.Tachikoma 1.0 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 93.8% ± 6.2 | +3.8 ± 7.7 | 59.5% ± 5.2 | 65.9% ± 2.7 | +6.4 ± 5.2 |
| rz.SmallDevil 1.502 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 96.3% ± 4.3 | -3.7 ± 4.3 | 77.8% ± 12.2 | 68.1% ± 14.6 | -9.7 ± 13.5 |
| rz.SmallDevil 1.502 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 83.5% ± 4.4 | 89.7% ± 3.5 | +6.2 ± 3.6 |
| satan.White 0.26 | hadur2.Hadur 3.9sa | 8 | 90.0% ± 8.9 | 100.0% ± 0.0 | +10.0 ± 8.9 | 43.0% ± 14.6 | 26.8% ± 20.4 | -16.2 ± 24.5 |
| satan.White 0.26 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 97.5% ± 3.9 | -2.5 ± 3.9 | 84.0% ± 7.4 | 82.8% ± 5.6 | -1.2 ± 9.8 |
| sheldor.nano.PointInLineRRAL 1.0.0 | hadur2.Hadur 3.9sa | 8 | 70.0% ± 8.9 | 100.0% ± 0.0 | +30.0 ± 8.9 | 31.9% ± 17.2 | 78.0% ± 3.7 | +46.2 ± 17.3 |
| sheldor.nano.PointInLineRRAL 1.0.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 72.6% ± 4.4 | 79.7% ± 1.8 | +7.1 ± 4.8 |
| sheldor.nano.PointInLine 1.0 | hadur2.Hadur 3.9sa | 8 | 92.5% ± 12.4 | 95.0% ± 6.3 | +2.5 ± 9.7 | 33.0% ± 14.8 | 45.4% ± 13.4 | +12.4 ± 20.1 |
| sheldor.nano.PointInLine 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 97.5% ± 5.9 | +0.0 ± 8.9 | 48.3% ± 7.7 | 67.7% ± 6.1 | +19.4 ± 10.2 |
| simonton.GFNano_D 3.1b | hadur2.Hadur 3.9sa | 8 | 90.0% ± 12.6 | 92.5% ± 5.9 | +2.5 ± 10.7 | 60.3% ± 12.8 | 60.2% ± 11.0 | -0.1 ± 17.1 |
| simonton.GFNano_D 3.1b | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 63.4% ± 8.0 | 76.8% ± 7.1 | +13.5 ± 11.1 |
| simonton.nano.WeekendObsession_S 1.7 | hadur2.Hadur 3.9sa | 8 | 92.5% ± 8.7 | 97.5% ± 3.9 | +5.0 ± 10.9 | 74.1% ± 18.3 | 59.6% ± 4.7 | -14.5 ± 22.1 |
| simonton.nano.WeekendObsession_S 1.7 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 96.1% ± 4.5 | -3.9 ± 4.5 | 86.2% ± 4.0 | 66.0% ± 5.5 | -20.2 ± 6.7 |
| sm.Devil 7.3 | hadur2.Hadur 3.9sa | 8 | 95.0% ± 7.7 | 95.0% ± 4.5 | +0.0 ± 8.9 | 50.3% ± 9.2 | 67.6% ± 6.3 | +17.3 ± 10.1 |
| sm.Devil 7.3 | hadur2.Hadur 3.9 | 8 | 77.5% ± 16.6 | 92.5% ± 9.7 | +15.0 ± 21.9 | 63.1% ± 10.4 | 71.1% ± 3.9 | +8.0 ± 9.3 |
| spinnercat.CopyKat 1.2.3 | hadur2.Hadur 3.9sa | 8 | 92.5% ± 8.7 | 97.5% ± 5.9 | +5.0 ± 11.8 | 49.9% ± 14.7 | 82.1% ± 11.7 | +32.2 ± 13.1 |
| spinnercat.CopyKat 1.2.3 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 95.0% ± 8.9 | -5.0 ± 8.9 | 78.5% ± 4.2 | 64.1% ± 2.8 | -14.4 ± 6.2 |
| spinnercat.Kitten 1.6 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 95.0% ± 6.3 | -2.5 ± 7.4 | 38.1% ± 27.0 | 43.7% ± 12.0 | +5.6 ± 31.2 |
| spinnercat.Kitten 1.6 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 98.8% ± 3.0 | +6.2 ± 9.9 | 72.8% ± 3.3 | 68.9% ± 6.3 | -3.8 ± 7.9 |
| starpkg.StarViewerZ 1.26 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 50.1% ± 28.8 | 49.1% ± 23.4 | -0.9 ± 29.5 |
| starpkg.StarViewerZ 1.26 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 77.0% ± 7.1 | 87.2% ± 5.0 | +10.2 ± 10.1 |
| stelo.MatchupMicro 1.2 | hadur2.Hadur 3.9sa | 8 | 90.0% ± 12.6 | 93.5% ± 4.5 | +3.5 ± 12.7 | 67.3% ± 8.1 | 70.6% ± 4.2 | +3.4 ± 9.7 |
| stelo.MatchupMicro 1.2 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 92.5% ± 8.7 | +2.5 ± 15.3 | 65.2% ± 4.9 | 71.1% ± 4.8 | +5.9 ± 4.1 |
| stelo.PianistNano 1.3 | hadur2.Hadur 3.9sa | 8 | 90.0% ± 17.9 | 93.8% ± 6.2 | +3.8 ± 20.4 | 58.5% ± 18.8 | 42.4% ± 10.9 | -16.1 ± 19.4 |
| stelo.PianistNano 1.3 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 9.7 | 58.6% ± 10.9 | 65.4% ± 5.2 | +6.8 ± 14.0 |
| stelo.SteloTestNano 1.0 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 93.8% ± 6.2 | -3.7 ± 4.3 | 63.1% ± 22.6 | 66.4% ± 13.1 | +3.3 ± 18.8 |
| stelo.SteloTestNano 1.0 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 96.3% ± 4.3 | +6.2 ± 6.2 | 65.0% ± 4.8 | 77.9% ± 5.8 | +12.8 ± 5.7 |
| suh.nano.RandomPM 1.02 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 33.6% ± 26.2 | 42.0% ± 12.3 | +8.4 ± 36.8 |
| suh.nano.RandomPM 1.02 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 93.8% ± 6.2 | +6.3 ± 15.4 | 57.0% ± 9.5 | 63.1% ± 4.6 | +6.2 ± 7.2 |
| syl.Centipede 0.5 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 79.1% ± 13.2 | 77.8% ± 18.8 | -1.3 ± 28.6 |
| syl.Centipede 0.5 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 98.8% ± 3.0 | +11.2 ± 12.2 | 57.0% ± 5.1 | 79.6% ± 6.8 | +22.6 ± 6.0 |
| tobe.Saturn lambda | hadur2.Hadur 3.9sa | 8 | 62.5% ± 24.4 | 96.3% ± 4.3 | +33.8 ± 24.5 | 37.3% ± 8.7 | 69.0% ± 3.5 | +31.8 ± 9.8 |
| tobe.Saturn lambda | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 93.8% ± 7.7 | -3.7 ± 10.9 | 63.3% ± 5.2 | 67.9% ± 4.0 | +4.6 ± 6.8 |
| trab.nano.AinippeNano 1.3 | hadur2.Hadur 3.9sa | 8 | 87.5% ± 12.4 | 98.8% ± 3.0 | +11.2 ± 10.4 | 46.1% ± 6.8 | 77.2% ± 3.5 | +31.1 ± 5.5 |
| trab.nano.AinippeNano 1.3 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 4.5 | 67.4% ± 6.0 | 76.2% ± 4.4 | +8.8 ± 3.4 |
| tzu.TheArtOfWar 1.2 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 97.5% ± 5.9 | -2.5 ± 5.9 | 84.6% ± 10.5 | 82.8% ± 11.5 | -1.8 ± 6.6 |
| tzu.TheArtOfWar 1.2 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 79.6% ± 6.1 | 81.0% ± 3.6 | +1.3 ± 7.3 |
| vuen.Fractal 0.55 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 89.1% ± 12.1 | 83.9% ± 5.6 | -5.1 ± 13.1 |
| vuen.Fractal 0.55 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 96.2% ± 4.3 | +1.2 ± 8.3 | 60.7% ± 3.1 | 71.0% ± 4.2 | +10.3 ± 2.3 |
| whind.Constitution 0.7.1 | hadur2.Hadur 3.9sa | 8 | 67.5% ± 19.9 | 98.8% ± 3.0 | +31.3 ± 19.7 | 36.9% ± 11.3 | 76.2% ± 4.8 | +39.3 ± 15.4 |
| whind.Constitution 0.7.1 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 97.5% ± 3.9 | -2.5 ± 3.9 | 66.0% ± 5.2 | 74.6% ± 6.9 | +8.6 ± 8.3 |
| wiki.mako.MakoHT 1.2.2.1 | hadur2.Hadur 3.9sa | 8 | 95.0% ± 11.8 | 93.6% ± 6.3 | -1.4 ± 12.3 | 61.4% ± 7.2 | 66.6% ± 18.7 | +5.2 ± 17.2 |
| wiki.mako.MakoHT 1.2.2.1 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 79.2% ± 6.1 | 84.9% ± 3.4 | +5.7 ± 7.8 |
| wiki.nano.RaikoNano 1.1 | hadur2.Hadur 3.9sa | 8 | 82.5% ± 16.6 | 96.3% ± 4.3 | +13.7 ± 18.9 | 34.1% ± 7.2 | 56.2% ± 5.1 | +22.1 ± 10.2 |
| wiki.nano.RaikoNano 1.1 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 91.3% ± 3.0 | +1.2 ± 8.3 | 58.0% ± 9.2 | 57.3% ± 5.5 | -0.7 ± 13.4 |
| zen.Lindada 0.2 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 78.9% ± 18.4 | 67.2% ± 15.2 | -11.6 ± 25.5 |
| zen.Lindada 0.2 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 93.6% ± 6.3 | -3.9 ± 10.0 | 68.1% ± 6.3 | 61.9% ± 5.5 | -6.2 ± 6.9 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| CharlieN.Omega.Omega 1.03 | -2.5 ± 16.6 | -2.5 ± 5.9 | -19.8 ± 20.0 | +4.4 ± 8.5 |
| KiraNL.Cataris 1.0 | -0.0 ± 15.5 | +2.5 ± 14.0 | -23.8 ± 16.0 | +1.0 ± 9.3 |
| PkKillers.PkAssassin 1.0 | -5.0 ± 7.7 | -2.5 ± 5.9 | -23.7 ± 10.4 | -7.5 ± 4.8 |
| alpha.BlackIce 1.0 | -5.0 ± 11.8 | -2.5 ± 7.4 | -25.6 ± 10.2 | -9.1 ± 7.7 |
| amk.ChumbaMini 0.2 | -17.5 ± 24.4 | +0.0 ± 7.7 | -16.8 ± 12.4 | +3.5 ± 11.3 |
| amk.ChumbaWumba 0.3 | +5.0 ± 7.7 | +1.2 ± 5.4 | -2.2 ± 17.9 | -1.5 ± 18.6 |
| apc.botM 3.0 | -2.5 ± 16.6 | -2.5 ± 5.9 | -22.2 ± 9.8 | -7.7 ± 7.1 |
| apv.NanoLauLectrikTheCannibal 1.1 | +0.0 ± 8.9 | -2.5 ± 3.9 | +19.8 ± 12.9 | +4.7 ± 8.1 |
| apv.NanoLauLectrik 1.0 | -35.0 ± 19.5 | -2.5 ± 5.9 | -24.5 ± 6.4 | -6.0 ± 7.8 |
| ary.nano.ColorNanoP 1.1 | +0.0 ± 0.0 | -1.2 ± 3.0 | -11.8 ± 6.6 | -5.0 ± 3.8 |
| asm.Statistas 0.1 | -2.5 ± 10.7 | -1.2 ± 5.4 | +8.1 ± 20.5 | +2.0 ± 6.8 |
| bigpete.Stewie 1.0 | -17.5 ± 26.0 | -1.2 ± 3.0 | -34.2 ± 8.8 | -7.0 ± 5.6 |
| brainfade.melee.Dusk 0.44 | +2.5 ± 5.9 | +0.0 ± 0.0 | -6.0 ± 23.7 | -26.9 ± 21.4 |
| buba.Archivist 0.1 | -5.0 ± 7.7 | -1.1 ± 7.2 | -12.9 ± 24.8 | -17.3 ± 23.8 |
| bvh.mini.Fenrir 0.39 | +2.5 ± 10.7 | -1.2 ± 7.0 | -3.8 ± 16.2 | +0.1 ± 4.6 |
| casey.Flee 1.0 | +0.0 ± 0.0 | +2.5 ± 5.9 | -16.8 ± 16.4 | -12.0 ± 8.4 |
| csm.NthGeneration 0.04 | -7.5 ± 12.4 | -1.2 ± 3.0 | -29.8 ± 24.3 | -26.2 ± 12.9 |
| demetrix.nano.Neutrino 0.27 | -7.5 ± 12.4 | -5.0 ± 7.7 | -10.8 ± 8.9 | -1.1 ± 5.6 |
| dmp.nano.Eve 3.41 | -25.0 ± 21.4 | +0.0 ± 0.0 | -33.9 ± 13.3 | +1.2 ± 4.4 |
| ds.OoV4 0.3b | +0.0 ± 8.9 | +2.5 ± 3.9 | -18.8 ± 21.4 | -19.0 ± 13.3 |
| dsx724.VSAB_EP3a 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | -28.2 ± 14.8 | -46.7 ± 21.0 |
| dummy.micro.Sparrow 2.5 | -5.0 ± 14.8 | -7.5 ± 5.9 | -28.2 ± 15.7 | -20.7 ± 9.3 |
| dy.LevelOne 2.0 | -70.0 ± 17.9 | +0.0 ± 0.0 | -46.2 ± 5.6 | -4.6 ± 2.4 |
| dz.MostlyHarmlessNano 2.1 | -12.5 ± 12.4 | -3.7 ± 4.3 | -35.3 ± 16.3 | -20.4 ± 8.2 |
| et.Predator 1.8 | -7.5 ± 8.7 | +0.0 ± 8.9 | -15.4 ± 14.2 | -11.2 ± 9.6 |
| exauge.GateKeeper 1.1.121g | -12.5 ± 29.6 | +4.9 ± 6.4 | -20.6 ± 17.0 | -1.1 ± 6.4 |
| fcr.First 1.0 | -2.5 ± 5.9 | +0.0 ± 0.0 | -16.8 ± 5.4 | -12.2 ± 4.0 |
| fnc.bandit2002.Bandit2002 4.0.2 | +0.0 ± 8.9 | +3.9 ± 6.3 | -25.6 ± 4.5 | +0.7 ± 8.0 |
| frag.FragBot 1.0 | -10.0 ± 17.9 | +1.2 ± 7.0 | -36.3 ± 7.4 | -7.9 ± 8.0 |
| gh.nano.Grofvuil 0.2 | +0.0 ± 0.0 | -1.2 ± 3.0 | -18.3 ± 15.9 | -28.8 ± 8.6 |
| gu.MicroScoob 1.3 | +0.0 ± 8.9 | -2.5 ± 3.9 | -8.5 ± 12.0 | -2.5 ± 7.6 |
| ha2.T3 0.2 | +2.5 ± 5.9 | +3.7 ± 8.9 | -3.1 ± 17.6 | -6.2 ± 11.7 |
| hamilton.Hamilton 1.0 | +0.0 ± 12.6 | +5.0 ± 6.3 | -25.5 ± 11.6 | -2.3 ± 9.4 |
| ins.MobyNano 0.8 | +7.5 ± 8.7 | -2.5 ± 3.9 | -1.9 ± 10.1 | -12.3 ± 13.6 |
| jp.Perpy 16.0 | -10.0 ± 8.9 | -3.6 ± 12.7 | -18.8 ± 9.2 | -5.3 ± 8.8 |
| kawigi.nano.FunkyChicken 1.1 | -5.0 ± 7.7 | +1.2 ± 3.0 | -9.3 ± 15.0 | -15.3 ± 11.1 |
| kawigi.sbf.Barracuda 1.0 | -5.0 ± 7.7 | -8.7 ± 7.0 | -51.9 ± 29.9 | -39.5 ± 12.9 |
| kinsen.nano.Quarrelet 1.0 | -27.5 ± 29.6 | -2.5 ± 3.9 | -29.5 ± 9.5 | +7.4 ± 7.1 |
| krzysiek.robbo2.Robbo 1.0.0 | -5.0 ± 7.7 | -2.5 ± 3.9 | -12.1 ± 7.7 | -2.7 ± 7.7 |
| lechu.Ala 0.0.4 | -5.0 ± 19.5 | +1.5 ± 13.1 | -12.6 ± 9.5 | -2.2 ± 7.1 |
| lessonz.robocode.Oz 0.5.0 | -7.5 ± 12.4 | +0.0 ± 0.0 | -29.9 ± 13.8 | -14.8 ± 4.0 |
| lrem.magic.TormentedAngel Antiquitie | -5.0 ± 17.3 | +5.0 ± 4.5 | -22.8 ± 27.6 | -28.9 ± 13.7 |
| lrem.micro.FalseProphet Alpha | +5.0 ± 7.7 | +0.0 ± 0.0 | -4.9 ± 10.5 | -4.4 ± 2.8 |
| lrem.quickhack.QuickHack 1.0 | +5.0 ± 7.7 | +2.5 ± 3.9 | -41.6 ± 20.5 | -54.3 ± 21.7 |
| mb.Monte 0.1.0 | -5.0 ± 11.8 | +0.0 ± 6.3 | -9.3 ± 4.0 | -1.3 ± 5.3 |
| metal.small.MCool 1.21 | +5.0 ± 7.7 | -2.5 ± 3.9 | -5.9 ± 14.7 | -9.9 ± 15.9 |
| mladjo.AIR 0.7 | -5.0 ± 11.8 | -3.7 ± 6.2 | -21.5 ± 18.2 | -9.7 ± 7.6 |
| mladjo.Startko 1.0 | +0.0 ± 8.9 | +0.0 ± 4.5 | -47.0 ± 14.7 | -36.8 ± 20.8 |
| mld.LittleBlackBook 1.69e | -2.5 ± 5.9 | +0.0 ± 0.0 | -17.0 ± 3.2 | -2.7 ± 3.2 |
| mld.jdc.nano.LittleBlackBook 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | -12.9 ± 5.3 | +0.4 ± 2.8 |
| myl.micro.NekoNinja 1.30 | +0.0 ± 8.9 | -1.2 ± 5.4 | +4.3 ± 17.5 | +4.2 ± 13.7 |
| myl.micro.Predator 1.50 | -2.5 ± 5.9 | +0.0 ± 0.0 | -41.0 ± 14.5 | -28.6 ± 6.2 |
| mz.AdeptBSB 1.03 | +2.5 ± 5.9 | +0.0 ± 0.0 | -50.0 ± 24.6 | -65.8 ± 18.0 |
| mz.Adept 2.65 | -12.5 ± 15.3 | -10.0 ± 10.0 | -26.5 ± 10.1 | -24.7 ± 14.7 |
| nat.nano.OcnirpPM 1.0 | +7.5 ± 12.4 | +3.7 ± 6.2 | -26.0 ± 18.8 | -7.9 ± 12.4 |
| nat.nano.Ocnirp 1.73 | +5.0 ± 17.3 | +5.0 ± 6.3 | -22.0 ± 24.3 | -1.9 ± 7.8 |
| nova.Snow 1.0 | -5.0 ± 11.8 | +1.5 ± 16.4 | -12.5 ± 8.1 | -0.9 ± 6.8 |
| pez.mini.Gouldingi 1.5 | -2.5 ± 10.7 | +0.0 ± 0.0 | -3.5 ± 29.8 | -9.4 ± 13.0 |
| qwaker00.Ahchoo 1.6 | +15.0 ± 11.8 | +6.3 ± 16.7 | -11.5 ± 23.4 | -15.0 ± 9.5 |
| ratosh.Nobo 0.21 | -50.0 ± 23.6 | +0.0 ± 0.0 | -43.5 ± 9.4 | -10.6 ± 3.3 |
| rdt199.Warlord 0.73 | -7.5 ± 12.4 | +1.2 ± 5.4 | -17.0 ± 15.6 | -0.2 ± 9.7 |
| rjw.RabidWombat 0.71 | -10.0 ± 8.9 | -10.0 ± 7.7 | -16.8 ± 11.6 | -27.8 ± 7.8 |
| robar.nano.MosquitoPM 1.0 | -7.5 ± 8.7 | +1.2 ± 3.0 | -41.8 ± 18.7 | +0.0 ± 17.6 |
| robar.nano.Prestige 1.0 | -0.0 ± 8.9 | +6.5 ± 12.5 | -19.9 ± 11.6 | -2.4 ± 8.1 |
| robar.nano.Scytodes 0.3 | +0.0 ± 0.0 | +0.0 ± 0.0 | -12.4 ± 11.0 | -15.1 ± 11.3 |
| robar.nano.Vespa 0.95 | +0.0 ± 0.0 | -1.2 ± 3.0 | -34.9 ± 24.2 | -30.7 ± 11.6 |
| rsk1.RSK1 4.0 | -2.5 ± 16.6 | +2.5 ± 5.9 | -28.6 ± 17.8 | -25.8 ± 23.7 |
| rtk.Tachikoma 1.0 | -5.0 ± 14.8 | +2.2 ± 9.0 | -17.0 ± 11.8 | -4.2 ± 13.9 |
| rz.SmallDevil 1.502 | +0.0 ± 0.0 | -3.7 ± 4.3 | -5.6 ± 13.2 | -21.6 ± 16.6 |
| satan.White 0.26 | -10.0 ± 8.9 | +2.5 ± 3.9 | -41.0 ± 20.6 | -56.0 ± 18.8 |
| sheldor.nano.PointInLineRRAL 1.0.0 | -25.0 ± 14.8 | +0.0 ± 0.0 | -40.7 ± 19.5 | -1.7 ± 4.1 |
| sheldor.nano.PointInLine 1.0 | -5.0 ± 14.8 | -2.5 ± 9.7 | -15.2 ± 16.4 | -22.3 ± 17.3 |
| simonton.GFNano_D 3.1b | -7.5 ± 8.7 | -6.2 ± 4.3 | -3.1 ± 12.0 | -16.6 ± 13.1 |
| simonton.nano.WeekendObsession_S 1.7 | -7.5 ± 8.7 | +1.4 ± 5.5 | -12.1 ± 18.9 | -6.4 ± 7.2 |
| sm.Devil 7.3 | +17.5 ± 18.8 | +2.5 ± 8.7 | -12.8 ± 14.4 | -3.4 ± 7.7 |
| spinnercat.CopyKat 1.2.3 | -7.5 ± 8.7 | +2.5 ± 11.6 | -28.6 ± 14.7 | +18.0 ± 11.2 |
| spinnercat.Kitten 1.6 | +5.0 ± 11.8 | -3.7 ± 6.2 | -34.7 ± 27.7 | -25.3 ± 13.2 |
| starpkg.StarViewerZ 1.26 | +5.0 ± 7.7 | +0.0 ± 0.0 | -26.9 ± 27.9 | -38.1 ± 22.3 |
| stelo.MatchupMicro 1.2 | +0.0 ± 21.9 | +1.0 ± 8.1 | +2.1 ± 8.6 | -0.4 ± 5.7 |
| stelo.PianistNano 1.3 | -5.0 ± 14.8 | -3.7 ± 7.7 | -0.1 ± 24.4 | -23.0 ± 12.3 |
| stelo.SteloTestNano 1.0 | +7.5 ± 8.7 | -2.5 ± 5.9 | -2.0 ± 22.0 | -11.5 ± 13.7 |
| suh.nano.RandomPM 1.02 | +10.0 ± 15.5 | +5.0 ± 4.5 | -23.3 ± 32.3 | -21.1 ± 9.7 |
| syl.Centipede 0.5 | +12.5 ± 12.4 | +0.0 ± 4.5 | +22.0 ± 14.8 | -1.8 ± 22.3 |
| tobe.Saturn lambda | -35.0 ± 24.9 | +2.5 ± 10.7 | -26.0 ± 11.1 | +1.1 ± 6.6 |
| trab.nano.AinippeNano 1.3 | -10.0 ± 12.6 | +1.2 ± 5.4 | -21.3 ± 7.7 | +1.0 ± 4.8 |
| tzu.TheArtOfWar 1.2 | +2.5 ± 5.9 | -1.2 ± 7.0 | +5.0 ± 14.5 | +1.9 ± 13.0 |
| vuen.Fractal 0.55 | +2.5 ± 10.7 | +3.7 ± 4.3 | +28.4 ± 12.6 | +12.9 ± 9.1 |
| whind.Constitution 0.7.1 | -32.5 ± 19.9 | +1.2 ± 5.4 | -29.1 ± 8.9 | +1.5 ± 9.3 |
| wiki.mako.MakoHT 1.2.2.1 | -2.5 ± 14.0 | -6.4 ± 6.3 | -17.8 ± 9.0 | -18.3 ± 19.5 |
| wiki.nano.RaikoNano 1.1 | -7.5 ± 17.7 | +5.0 ± 6.3 | -23.9 ± 15.3 | -1.1 ± 9.9 |
| zen.Lindada 0.2 | +2.5 ± 5.9 | +6.4 ± 6.3 | +10.7 ± 21.9 | +5.3 ± 17.6 |
