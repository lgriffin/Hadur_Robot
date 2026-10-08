# Bench: hadur2.Hadur 3.10 (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 7682 over 664 battles (11.6 per battle, most in one battle 62). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | shield-310 | 94.7% ± 3.0 | 98.6% ± 1.3 | 65.9% ± 11.5 | 276 / 280 | 7.1% ± 1.5 | 4.2% ± 5.5 | 99 | 0 | 0.49 / 39.6 |
| DM.mega.Bezier 1.618fprrr | shield-310 | 96.2% ± 1.3 | 99.6% ± 0.8 | 45.6% ± 18.8 | 279 / 280 | 3.0% ± 2.4 | 0.4% ± 0.2 | 104 | 0 | 0.85 / 252.6 |
| KiraNL.ChupaLite 0.4 | shield-310 | 93.2% ± 1.7 | 99.3% ± 1.1 | 54.7% ± 8.3 | 278 / 280 | 10.4% ± 3.5 | 1.0% ± 0.4 | 80 | 0 | 0.50 / 18.1 |
| Krabb.krabby.Krabby 1.18b | shield-310 | 94.3% ± 2.7 | 99.3% ± 1.1 | 66.4% ± 10.4 | 278 / 280 | 14.1% ± 6.0 | 0.8% ± 0.3 | 87 | 0 | 0.40 / 18.9 |
| ad.Quest 0.10 | shield-310 | 87.4% ± 5.7 | 96.8% ± 2.4 | 59.8% ± 5.4 | 271 / 280 | 11.4% ± 2.0 | 2.6% ± 1.5 | 108 | 0 | 0.85 / 18.2 |
| ags.micro.Carpet 1.1 | shield-310 | 87.8% ± 2.9 | 97.9% ± 2.1 | 48.8% ± 4.3 | 274 / 280 | 10.9% ± 2.6 | 2.9% ± 0.3 | 79 | 0 | 1.29 / 20.4 |
| ahf.r2d2.R2d2 0.86 | shield-310 | 89.2% ± 3.6 | 97.5% ± 2.4 | 62.4% ± 4.8 | 273 / 280 | 12.6% ± 1.3 | 2.0% ± 0.9 | 76 | 0 | 0.42 / 14.7 |
| amk.ChumbaWumba 0.3 | shield-310 | 87.4% ± 4.1 | 97.1% ± 2.2 | 56.2% ± 4.4 | 272 / 280 | 12.1% ± 2.4 | 1.8% ± 0.5 | 83 | 0 | 0.62 / 41.9 |
| apv.NanoLauLectrikTheCannibal 1.1 | shield-310 | 90.0% ± 3.0 | 97.1% ± 1.8 | 81.2% ± 4.0 | 272 / 280 | 85.5% ± 10.4 | 4.6% ± 0.9 | 95 | 0 | 0.70 / 170.1 |
| arthord.KostyaTszyu Beta2 | shield-310 | 88.3% ± 3.6 | 97.1% ± 2.9 | 46.7% ± 5.7 | 272 / 280 | 8.6% ± 1.3 | 1.3% ± 0.3 | 84 | 0 | 0.53 / 154.9 |
| ary.SMG 1.01 | shield-310 | 84.9% ± 5.7 | 96.1% ± 4.4 | 48.6% ± 4.1 | 269 / 280 | 7.7% ± 0.8 | 2.5% ± 0.8 | 91 | 0 | 0.80 / 40.7 |
| ary.mini.Nimi 1.0 | shield-310 | 94.8% ± 1.1 | 100.0% ± 0.0 | 63.2% ± 5.0 | 280 / 280 | 6.5% ± 1.4 | 0.8% ± 0.2 | 86 | 0 | 0.48 / 20.3 |
| brainfade.Fallen 0.63 | shield-310 | 93.2% ± 2.6 | 99.3% ± 1.1 | 50.5% ± 8.5 | 278 / 280 | 4.6% ± 1.6 | 1.1% ± 0.4 | 89 | 0 | 0.50 / 153.5 |
| bvh.frg.Friga 0.112dev | shield-310 | 96.9% ± 2.2 | 99.3% ± 1.1 | 79.2% ± 9.9 | 278 / 280 | 6.1% ± 1.1 | 0.4% ± 0.2 | 89 | 0 | 0.52 / 16.6 |
| bvh.mini.Freya 0.55 | shield-310 | 97.5% ± 1.4 | 99.6% ± 0.8 | 83.6% ± 4.8 | 279 / 280 | 8.0% ± 1.1 | 0.4% ± 0.2 | 86 | 0 | 0.55 / 73.7 |
| casey.Flee 1.0 | shield-310 | 89.4% ± 1.7 | 98.6% ± 1.3 | 57.0% ± 3.1 | 276 / 280 | 14.3% ± 2.2 | 2.0% ± 0.4 | 93 | 0 | 0.56 / 327.2 |
| cf.mini.Chiva 1.0 | shield-310 | 85.3% ± 1.5 | 96.8% ± 2.0 | 76.4% ± 2.0 | 271 / 280 | 48.6% ± 2.3 | 9.1% ± 0.9 | 91 | 0 | 0.71 / 14.3 |
| cf.proto.Shiva 2.2 | shield-310 | 91.7% ± 2.6 | 97.5% ± 2.0 | 52.7% ± 8.0 | 273 / 280 | 7.1% ± 0.6 | 1.0% ± 0.5 | 85 | 0 | 0.48 / 16.5 |
| davidalves.net.DuelistMicroMkII 1.1 | shield-310 | 88.7% ± 3.0 | 96.8% ± 2.0 | 66.4% ± 4.2 | 271 / 280 | 14.1% ± 1.5 | 1.9% ± 0.4 | 138 | 0 | 0.58 / 122.5 |
| davidalves.net.DuelistMini 1.1 | shield-310 | 88.2% ± 6.3 | 98.6% ± 1.3 | 64.3% ± 9.7 | 276 / 280 | 11.6% ± 3.3 | 2.3% ± 1.5 | 101 | 0 | 0.85 / 170.6 |
| dft.Cyanide 1.90 | shield-310 | 93.3% ± 3.3 | 98.6% ± 1.8 | 59.1% ± 10.6 | 276 / 280 | 6.6% ± 2.5 | 3.7% ± 0.7 | 87 | 0 | 0.51 / 16.9 |
| ds.OoV4 0.3b | shield-310 | 94.2% ± 2.2 | 99.6% ± 0.8 | 61.4% ± 6.1 | 279 / 280 | 7.6% ± 2.0 | 1.0% ± 0.4 | 96 | 0 | 0.57 / 146.8 |
| florent.small.LittleAngel 1.8 | shield-310 | 83.2% ± 4.1 | 95.7% ± 2.9 | 41.0% ± 5.4 | 268 / 280 | 10.3% ± 1.2 | 2.1% ± 0.5 | 100 | 0 | 0.71 / 15.7 |
| gh.GrubbmGrb 1.2.4 | shield-310 | 91.0% ± 10.7 | 95.0% ± 8.2 | 82.6% ± 12.0 | 266 / 280 | 28.0% ± 9.3 | 2.2% ± 2.0 | 97 | 0 | 0.90 / 248.9 |
| ins.MobyNano 0.8 | shield-310 | 87.1% ± 2.9 | 97.5% ± 2.0 | 53.9% ± 4.9 | 273 / 280 | 18.0% ± 1.8 | 3.3% ± 0.4 | 89 | 0 | 0.68 / 108.1 |
| jam.mini.Raiko 0.43 | shield-310 | 93.4% ± 2.4 | 98.6% ± 1.3 | 58.8% ± 11.3 | 276 / 280 | 8.0% ± 1.6 | 0.8% ± 0.2 | 98 | 0 | 0.49 / 34.1 |
| jcs.Decepticon 2.5.3 | shield-310 | 81.0% ± 4.1 | 96.1% ± 2.8 | 46.6% ± 4.2 | 269 / 280 | 10.5% ± 2.5 | 4.7% ± 0.6 | 92 | 0 | 1.30 / 31.7 |
| jekl.DarkHallow .90.9 | shield-310 | 84.9% ± 6.8 | 94.6% ± 4.3 | 51.8% ± 6.0 | 265 / 280 | 7.8% ± 1.1 | 2.3% ± 1.0 | 82 | 0 | 0.84 / 125.9 |
| jekl.Jekyl .70 | shield-310 | 93.3% ± 2.7 | 98.6% ± 1.3 | 68.3% ± 6.5 | 276 / 280 | 8.4% ± 1.0 | 1.4% ± 0.8 | 108 | 0 | 0.56 / 31.6 |
| jekl.mini.BlackPearl .91 | shield-310 | 95.2% ± 2.5 | 99.3% ± 1.1 | 70.4% ± 5.9 | 278 / 280 | 9.0% ± 2.1 | 0.7% ± 0.3 | 89 | 0 | 0.58 / 17.7 |
| kawigi.mini.Coriantumr 1.1 | shield-310 | 97.6% ± 1.3 | 99.6% ± 0.8 | 89.1% ± 3.8 | 279 / 280 | 9.3% ± 2.0 | 0.4% ± 0.2 | 93 | 0 | 0.50 / 39.0 |
| kawigi.mini.Fhqwhgads 1.1 | shield-310 | 90.1% ± 3.2 | 97.9% ± 2.5 | 60.7% ± 6.9 | 274 / 280 | 13.8% ± 2.3 | 6.0% ± 3.3 | 104 | 0 | 0.49 / 36.4 |
| kc.micro.Thorn 1.252 | shield-310 | 86.5% ± 5.5 | 95.3% ± 3.1 | 53.6% ± 10.1 | 267 / 280 | 8.1% ± 1.7 | 1.9% ± 1.3 | 88 | 0 | 0.85 / 41.0 |
| kid.Toa .0.5 | shield-310 | 92.0% ± 1.7 | 98.6% ± 1.8 | 76.0% ± 2.4 | 276 / 280 | 12.4% ± 0.7 | 1.6% ± 0.2 | 89 | 0 | 1.06 / 45.8 |
| kms.Golden 0.10 | shield-310 | 77.2% ± 5.2 | 89.3% ± 4.2 | 47.5% ± 5.8 | 250 / 280 | 14.1% ± 2.4 | 3.0% ± 0.8 | 82 | 0 | 0.76 / 17.6 |
| lrem.magic.TormentedAngel Antiquitie | shield-310 | 86.1% ± 5.0 | 96.4% ± 3.3 | 40.6% ± 6.9 | 270 / 280 | 10.1% ± 3.4 | 1.7% ± 0.4 | 92 | 0 | 0.53 / 31.3 |
| lucasslf.Dodger 1.0 | shield-310 | 88.3% ± 4.8 | 97.5% ± 3.2 | 40.9% ± 9.2 | 273 / 280 | 10.0% ± 2.4 | 2.6% ± 0.3 | 85 | 0 | 0.49 / 25.5 |
| lucasslf.HariSeldon 0.2.1 | shield-310 | 97.1% ± 1.5 | 100.0% ± 0.0 | 79.0% ± 9.5 | 280 / 280 | 14.1% ± 1.7 | 1.5% ± 0.2 | 87 | 0 | 1.24 / 33.0 |
| lucasslf.Wiggins 0.6 | shield-310 | 93.6% ± 2.1 | 99.6% ± 0.8 | 60.1% ± 12.7 | 279 / 280 | 9.5% ± 2.4 | 1.9% ± 0.3 | 80 | 0 | 0.55 / 19.9 |
| metal.small.MCool 1.21 | shield-310 | 94.8% ± 1.7 | 98.6% ± 1.3 | 69.6% ± 7.3 | 276 / 280 | 8.8% ± 1.5 | 0.6% ± 0.2 | 92 | 0 | 0.56 / 20.5 |
| metal.small.dna2.MCoolDNA 1.5 | shield-310 | 88.3% ± 2.7 | 96.8% ± 2.0 | 56.8% ± 4.2 | 271 / 280 | 10.0% ± 1.8 | 1.5% ± 0.4 | 93 | 0 | 0.55 / 39.5 |
| mk.Alpha 0.2.1 | shield-310 | 97.6% ± 1.5 | 100.0% ± 0.0 | 81.0% ± 8.1 | 280 / 280 | 7.6% ± 1.2 | 0.6% ± 0.2 | 94 | 0 | 0.58 / 51.9 |
| mladjo.Grrrrr 0.9 | shield-310 | 92.8% ± 1.7 | 98.9% ± 1.2 | 52.6% ± 6.5 | 277 / 280 | 9.4% ± 2.3 | 1.1% ± 0.4 | 90 | 0 | 0.47 / 162.0 |
| mnt.AHEB 0.6a | shield-310 | 85.3% ± 4.5 | 94.3% ± 3.4 | 43.1% ± 7.1 | 264 / 280 | 6.4% ± 1.6 | 2.0% ± 0.3 | 89 | 0 | 0.49 / 133.8 |
| myl.micro.NekoNinja 1.30 | shield-310 | 91.3% ± 4.7 | 97.5% ± 2.7 | 69.7% ± 9.4 | 273 / 280 | 9.6% ± 1.5 | 2.7% ± 3.4 | 100 | 0 | 0.63 / 146.8 |
| nat.Hikari dev0001 | shield-310 | 87.9% ± 1.9 | 98.9% ± 1.2 | 47.5% ± 5.2 | 277 / 280 | 16.4% ± 2.3 | 2.4% ± 0.3 | 90 | 0 | 0.56 / 35.7 |
| nat.nano.Ocnirp 1.73 | shield-310 | 82.8% ± 6.5 | 95.4% ± 4.4 | 46.2% ± 7.2 | 267 / 280 | 13.5% ± 2.5 | 3.4% ± 1.6 | 98 | 0 | 0.92 / 103.9 |
| nat.nano.OcnirpPM 1.0 | shield-310 | 84.2% ± 3.4 | 96.4% ± 1.7 | 49.2% ± 7.4 | 270 / 280 | 17.8% ± 3.9 | 3.0% ± 0.8 | 94 | 0 | 0.78 / 266.7 |
| pe.mini.SandboxMini 1.2 | shield-310 | 87.9% ± 2.8 | 96.8% ± 1.5 | 56.9% ± 3.8 | 271 / 280 | 14.3% ± 3.1 | 1.5% ± 0.5 | 93 | 0 | 0.57 / 113.2 |
| pez.clean.Swiffer 0.2.9 | shield-310 | 90.6% ± 4.6 | 96.8% ± 3.5 | 68.2% ± 7.5 | 271 / 280 | 10.3% ± 2.6 | 1.6% ± 0.5 | 113 | 0 | 0.52 / 234.0 |
| pez.mako.Mako 1.5 | shield-310 | 92.6% ± 5.0 | 99.3% ± 1.1 | 68.6% ± 10.1 | 278 / 280 | 14.7% ± 7.5 | 1.4% ± 1.0 | 98 | 0 | 0.80 / 15.9 |
| ph.micro.Pikeman 0.4.5 | shield-310 | 95.3% ± 2.4 | 98.9% ± 1.2 | 61.9% ± 9.2 | 277 / 280 | 6.7% ± 1.3 | 0.5% ± 0.2 | 93 | 0 | 0.48 / 18.9 |
| ph.mini.Archer 0.6.6 | shield-310 | 86.5% ± 4.8 | 95.7% ± 3.6 | 35.4% ± 12.0 | 268 / 280 | 6.6% ± 1.6 | 3.5% ± 0.2 | 89 | 0 | 0.51 / 20.3 |
| pkbots.BoyTDSurfer 1.0 | shield-310 | 89.7% ± 1.4 | 99.3% ± 1.1 | 41.7% ± 3.3 | 278 / 280 | 13.3% ± 1.6 | 2.0% ± 0.1 | 95 | 0 | 0.47 / 27.9 |
| rcb.Vanessa03 0 | shield-310 | 88.5% ± 4.8 | 96.4% ± 2.5 | 62.6% ± 5.9 | 270 / 280 | 12.8% ± 2.4 | 2.0% ± 0.9 | 79 | 0 | 0.70 / 33.9 |
| rdt.AgentSmith.AgentSmith 0.5 | shield-310 | 94.0% ± 3.0 | 98.9% ± 1.2 | 61.0% ± 8.0 | 277 / 280 | 5.4% ± 1.2 | 1.1% ± 0.6 | 94 | 0 | 0.97 / 219.7 |
| robar.micro.Kirbyi 1.0 | shield-310 | 83.7% ± 1.8 | 95.0% ± 1.7 | 53.7% ± 3.7 | 266 / 280 | 28.4% ± 2.6 | 4.5% ± 0.4 | 87 | 0 | 0.66 / 34.2 |
| rz.Aleph 0.34 | shield-310 | 90.0% ± 2.9 | 97.9% ± 2.1 | 43.1% ± 5.6 | 274 / 280 | 6.7% ± 0.6 | 1.2% ± 0.2 | 122 | 0 | 0.80 / 173.2 |
| simonton.beta.LifelongObsession 0.5.1 | shield-310 | 90.3% ± 3.4 | 97.9% ± 2.1 | 57.5% ± 5.4 | 274 / 280 | 10.6% ± 2.1 | 2.4% ± 0.3 | 86 | 0 | 0.65 / 56.7 |
| simonton.micro.GFMicro 1.0 | shield-310 | 91.5% ± 2.2 | 98.2% ± 1.2 | 75.5% ± 3.8 | 275 / 280 | 30.8% ± 2.6 | 2.9% ± 0.5 | 92 | 0 | 0.53 / 53.3 |
| simonton.mini.WeeksOnEnd 1.10.4 | shield-310 | 92.1% ± 2.0 | 99.6% ± 0.8 | 59.1% ± 4.5 | 279 / 280 | 11.8% ± 1.9 | 2.3% ± 0.3 | 90 | 0 | 0.77 / 67.2 |
| simonton.nano.WeekendObsession_S 1.7 | shield-310 | 88.7% ± 2.3 | 97.1% ± 1.3 | 58.7% ± 4.5 | 272 / 280 | 19.0% ± 2.7 | 2.4% ± 0.3 | 75 | 0 | 0.61 / 257.3 |
| spinnercat.CopyKat 1.2.3 | shield-310 | 88.2% ± 4.4 | 94.6% ± 3.9 | 67.8% ± 6.3 | 265 / 280 | 34.2% ± 6.5 | 2.4% ± 1.0 | 78 | 0 | 0.48 / 65.0 |
| starpkg.StarViewerZ 1.26 | shield-310 | 95.4% ± 2.3 | 99.3% ± 1.1 | 66.8% ± 6.6 | 278 / 280 | 5.6% ± 1.9 | 0.7% ± 0.3 | 104 | 0 | 0.51 / 256.7 |
| stefw.Tigger 0.0.23 | shield-310 | 87.7% ± 2.5 | 97.9% ± 1.1 | 41.4% ± 6.3 | 274 / 280 | 6.7% ± 1.1 | 1.6% ± 0.5 | 97 | 0 | 0.68 / 18.0 |
| stelo.Randomness 1.1 | shield-310 | 83.5% ± 4.0 | 94.3% ± 3.1 | 56.5% ± 2.9 | 264 / 280 | 13.9% ± 1.5 | 2.9% ± 0.4 | 97 | 0 | 0.67 / 76.9 |
| stelo.SteloTestNano 1.0 | shield-310 | 90.1% ± 3.7 | 97.1% ± 2.6 | 66.5% ± 5.1 | 272 / 280 | 21.9% ± 1.3 | 3.5% ± 2.9 | 109 | 0 | 0.47 / 436.9 |
| suh.nano.RandomPM 1.02 | shield-310 | 82.2% ± 5.5 | 94.3% ± 4.2 | 41.5% ± 9.4 | 264 / 280 | 14.2% ± 4.0 | 3.0% ± 1.8 | 97 | 0 | 0.98 / 119.4 |
| syl.Centipede 0.5 | shield-310 | 96.9% ± 1.8 | 99.6% ± 0.8 | 78.5% ± 9.8 | 279 / 280 | 8.4% ± 1.1 | 0.7% ± 0.3 | 90 | 0 | 0.59 / 179.5 |
| theo.Tungsten 1.0a | shield-310 | 86.6% ± 4.2 | 96.8% ± 2.7 | 58.5% ± 5.5 | 271 / 280 | 17.0% ± 1.5 | 2.2% ± 0.5 | 97 | 0 | 0.65 / 18.5 |
| theo.avenge.Pequod 1.0 | shield-310 | 87.1% ± 5.7 | 96.8% ± 4.1 | 53.1% ± 5.1 | 271 / 280 | 10.1% ± 1.1 | 1.8% ± 0.7 | 80 | 0 | 1.09 / 30.0 |
| theo.real.Ahab 1.0 | shield-310 | 87.1% ± 2.3 | 99.6% ± 0.8 | 50.3% ± 2.6 | 279 / 280 | 8.3% ± 0.7 | 2.5% ± 0.6 | 95 | 0 | 1.38 / 22.4 |
| tide.pear.Pear 0.62.1 | shield-310 | 85.1% ± 1.7 | 96.4% ± 3.1 | 72.7% ± 1.7 | 270 / 280 | 39.2% ± 3.3 | 6.8% ± 0.9 | 102 | 0 | 0.76 / 17.2 |
| trab.Crusader 0.1.7 | shield-310 | 72.4% ± 3.8 | 89.3% ± 3.8 | 39.2% ± 3.5 | 250 / 280 | 8.3% ± 1.4 | 4.1% ± 0.5 | 110 | 0 | 1.44 / 25.0 |
| trm.Wrekt 1.1.6.f | shield-310 | 86.8% ± 10.0 | 94.6% ± 7.2 | 55.5% ± 9.1 | 265 / 280 | 7.4% ± 1.3 | 2.1% ± 2.0 | 91 | 0 | 1.45 / 121.0 |
| tw.Exterminator 1.0 | shield-310 | 89.0% ± 6.6 | 92.1% ± 6.4 | 71.0% ± 8.2 | 258 / 280 | 4.3% ± 1.9 | 2.1% ± 1.0 | 95 | 0 | 1.12 / 289.7 |
| tzu.TheArtOfWar 1.2 | shield-310 | 96.9% ± 1.6 | 99.6% ± 0.8 | 86.1% ± 4.8 | 279 / 280 | 18.4% ± 1.4 | 1.2% ± 0.4 | 89 | 0 | 0.52 / 17.6 |
| vuen.Fractal 0.55 | shield-310 | 96.3% ± 1.3 | 99.6% ± 0.8 | 88.2% ± 3.2 | 279 / 280 | 17.1% ± 2.3 | 0.8% ± 0.3 | 80 | 0 | 0.54 / 101.9 |
| wcsv.Engineer.Engineer 0.5.4 | shield-310 | 77.4% ± 7.1 | 92.1% ± 5.1 | 51.2% ± 5.5 | 258 / 280 | 21.7% ± 2.7 | 4.9% ± 0.9 | 104 | 0 | 0.90 / 19.2 |
| wiki.mini.BlackDestroyer 0.9.0 | shield-310 | 88.5% ± 2.7 | 96.8% ± 2.0 | 49.2% ± 6.1 | 271 / 280 | 10.6% ± 2.8 | 3.0% ± 0.3 | 81 | 0 | 0.57 / 91.8 |
| wiki.mini.Sedan 1.0 | shield-310 | 93.0% ± 3.2 | 97.9% ± 2.1 | 65.2% ± 7.2 | 274 / 280 | 8.6% ± 1.6 | 2.7% ± 0.3 | 85 | 0 | 0.53 / 138.0 |
| wilson.Chameleon 0.91 | shield-310 | 97.5% ± 1.6 | 100.0% ± 0.0 | 85.3% ± 9.3 | 280 / 280 | 8.8% ± 1.6 | 0.5% ± 0.3 | 90 | 0 | 0.62 / 20.4 |
| zen.Lindada 0.2 | shield-310 | 95.5% ± 1.3 | 100.0% ± 0.0 | 73.1% ± 6.6 | 280 / 280 | 9.1% ± 1.3 | 0.8% ± 0.2 | 83 | 0 | 0.51 / 40.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | 8 | 129 | 19.4% | 71.1% | 0.1% | 9.4% | 912 |
| DM.mega.Bezier 1.618fprrr | 8 | 88 | 7.1% | 90.6% | 0.0% | 2.3% | 1676 |
| KiraNL.ChupaLite 0.4 | 8 | 171 | 7.3% | 89.6% | 0.0% | 3.1% | 894 |
| Krabb.krabby.Krabby 1.18b | 8 | 145 | 8.6% | 87.7% | 0.0% | 3.7% | 824 |
| ad.Quest 0.10 | 8 | 413 | 13.6% | 79.8% | 0.1% | 6.5% | 856 |
| ags.micro.Carpet 1.1 | 8 | 335 | 11.2% | 84.8% | 0.1% | 3.9% | 1227 |
| ahf.r2d2.R2d2 0.86 | 8 | 311 | 14.1% | 78.8% | 1.8% | 5.3% | 882 |
| amk.ChumbaWumba 0.3 | 8 | 369 | 13.6% | 80.7% | 0.2% | 5.5% | 713 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 435 | 11.5% | 81.9% | 0.1% | 6.6% | 592 |
| arthord.KostyaTszyu Beta2 | 8 | 307 | 16.3% | 77.8% | 0.0% | 6.0% | 903 |
| ary.SMG 1.01 | 8 | 448 | 15.3% | 78.7% | 0.0% | 5.9% | 1174 |
| ary.mini.Nimi 1.0 | 8 | 130 | 0.0% | 100.0% | 0.0% | 0.0% | 1163 |
| brainfade.Fallen 0.63 | 8 | 167 | 7.5% | 89.1% | 0.0% | 3.4% | 961 |
| bvh.frg.Friga 0.112dev | 8 | 76 | 16.4% | 76.2% | 0.0% | 7.4% | 860 |
| bvh.mini.Freya 0.55 | 8 | 63 | 9.9% | 86.9% | 0.0% | 3.2% | 785 |
| casey.Flee 1.0 | 8 | 295 | 8.5% | 88.4% | 0.0% | 3.1% | 713 |
| cf.mini.Chiva 1.0 | 8 | 830 | 6.8% | 84.7% | 5.5% | 3.0% | 487 |
| cf.proto.Shiva 2.2 | 8 | 203 | 21.5% | 71.4% | 0.1% | 7.0% | 1010 |
| davidalves.net.DuelistMicroMkII 1.1 | 8 | 340 | 16.5% | 77.6% | 0.1% | 5.8% | 876 |
| davidalves.net.DuelistMini 1.1 | 8 | 421 | 5.9% | 91.0% | 0.0% | 3.0% | 768 |
| dft.Cyanide 1.90 | 8 | 165 | 15.2% | 78.5% | 0.0% | 6.4% | 1007 |
| ds.OoV4 0.3b | 8 | 148 | 4.2% | 94.1% | 0.0% | 1.7% | 1551 |
| florent.small.LittleAngel 1.8 | 8 | 470 | 16.0% | 77.7% | 0.0% | 6.4% | 1036 |
| gh.GrubbmGrb 1.2.4 | 8 | 355 | 24.7% | 64.6% | 0.0% | 10.8% | 915 |
| ins.MobyNano 0.8 | 8 | 367 | 11.9% | 83.3% | 0.2% | 4.6% | 804 |
| jam.mini.Raiko 0.43 | 8 | 163 | 15.3% | 78.9% | 0.0% | 5.7% | 988 |
| jcs.Decepticon 2.5.3 | 8 | 616 | 11.2% | 84.4% | 0.0% | 4.5% | 1033 |
| jekl.DarkHallow .90.9 | 8 | 445 | 21.1% | 70.5% | 0.0% | 8.4% | 1042 |
| jekl.Jekyl .70 | 8 | 178 | 14.1% | 77.5% | 3.2% | 5.2% | 950 |
| jekl.mini.BlackPearl .91 | 8 | 124 | 10.1% | 85.4% | 0.1% | 4.4% | 887 |
| kawigi.mini.Coriantumr 1.1 | 8 | 67 | 9.3% | 87.4% | 0.0% | 3.3% | 851 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 269 | 13.9% | 80.7% | 0.0% | 5.3% | 836 |
| kc.micro.Thorn 1.252 | 8 | 405 | 20.1% | 73.0% | 0.0% | 6.9% | 963 |
| kid.Toa .0.5 | 8 | 252 | 9.9% | 87.1% | 0.0% | 3.0% | 1179 |
| kms.Golden 0.10 | 8 | 702 | 26.7% | 62.4% | 0.5% | 10.4% | 759 |
| lrem.magic.TormentedAngel Antiquitie | 8 | 372 | 16.8% | 77.1% | 0.0% | 6.1% | 905 |
| lucasslf.Dodger 1.0 | 8 | 300 | 14.6% | 80.0% | 0.0% | 5.4% | 1396 |
| lucasslf.HariSeldon 0.2.1 | 8 | 74 | 0.0% | 100.0% | 0.0% | 0.0% | 1365 |
| lucasslf.Wiggins 0.6 | 8 | 163 | 3.8% | 94.3% | 0.0% | 1.8% | 1377 |
| metal.small.MCool 1.21 | 8 | 129 | 19.3% | 74.5% | 0.1% | 6.1% | 763 |
| metal.small.dna2.MCoolDNA 1.5 | 8 | 324 | 17.3% | 75.6% | 0.0% | 7.0% | 942 |
| mk.Alpha 0.2.1 | 8 | 60 | 0.0% | 100.0% | 0.0% | 0.0% | 1052 |
| mladjo.Grrrrr 0.9 | 8 | 180 | 10.4% | 85.3% | 0.0% | 4.2% | 935 |
| mnt.AHEB 0.6a | 8 | 380 | 26.3% | 63.8% | 0.0% | 9.9% | 957 |
| myl.micro.NekoNinja 1.30 | 8 | 246 | 17.8% | 74.7% | 0.0% | 7.5% | 1033 |
| nat.Hikari dev0001 | 8 | 334 | 5.6% | 92.3% | 0.0% | 2.1% | 858 |
| nat.nano.Ocnirp 1.73 | 8 | 553 | 14.7% | 79.4% | 0.0% | 5.9% | 724 |
| nat.nano.OcnirpPM 1.0 | 8 | 474 | 13.2% | 81.3% | 0.1% | 5.4% | 705 |
| pe.mini.SandboxMini 1.2 | 8 | 341 | 16.5% | 77.6% | 0.0% | 5.9% | 730 |
| pez.clean.Swiffer 0.2.9 | 8 | 265 | 21.3% | 71.6% | 0.0% | 7.2% | 913 |
| pez.mako.Mako 1.5 | 8 | 222 | 5.6% | 91.5% | 0.2% | 2.6% | 808 |
| ph.micro.Pikeman 0.4.5 | 8 | 112 | 16.7% | 76.2% | 0.0% | 7.0% | 939 |
| ph.mini.Archer 0.6.6 | 8 | 338 | 22.2% | 69.2% | 0.0% | 8.5% | 1105 |
| pkbots.BoyTDSurfer 1.0 | 8 | 264 | 4.7% | 93.2% | 0.0% | 2.0% | 1210 |
| rcb.Vanessa03 0 | 8 | 341 | 18.3% | 73.4% | 0.1% | 8.2% | 729 |
| rdt.AgentSmith.AgentSmith 0.5 | 8 | 151 | 12.4% | 81.8% | 0.0% | 5.7% | 963 |
| robar.micro.Kirbyi 1.0 | 8 | 493 | 17.8% | 75.4% | 0.1% | 6.8% | 819 |
| rz.Aleph 0.34 | 8 | 251 | 14.9% | 79.2% | 0.0% | 5.9% | 989 |
| simonton.beta.LifelongObsession 0.5.1 | 8 | 258 | 14.5% | 80.4% | 0.0% | 5.1% | 1414 |
| simonton.micro.GFMicro 1.0 | 8 | 276 | 11.3% | 84.8% | 0.0% | 3.9% | 1239 |
| simonton.mini.WeeksOnEnd 1.10.4 | 8 | 211 | 3.0% | 96.0% | 0.0% | 1.1% | 1406 |
| simonton.nano.WeekendObsession_S 1.7 | 8 | 316 | 15.8% | 78.1% | 0.0% | 6.1% | 825 |
| spinnercat.CopyKat 1.2.3 | 8 | 335 | 28.0% | 60.5% | 0.0% | 11.5% | 741 |
| starpkg.StarViewerZ 1.26 | 8 | 117 | 10.7% | 86.1% | 0.0% | 3.2% | 1814 |
| stefw.Tigger 0.0.23 | 8 | 326 | 11.5% | 83.7% | 0.0% | 4.8% | 921 |
| stelo.Randomness 1.1 | 8 | 519 | 19.3% | 73.6% | 0.0% | 7.1% | 875 |
| stelo.SteloTestNano 1.0 | 8 | 283 | 17.7% | 75.2% | 0.2% | 7.0% | 699 |
| suh.nano.RandomPM 1.02 | 8 | 556 | 18.0% | 74.5% | 0.0% | 7.5% | 804 |
| syl.Centipede 0.5 | 8 | 77 | 8.1% | 88.3% | 0.7% | 2.9% | 749 |
| theo.Tungsten 1.0a | 8 | 403 | 14.0% | 80.8% | 0.0% | 5.2% | 912 |
| theo.avenge.Pequod 1.0 | 8 | 382 | 14.7% | 80.0% | 0.0% | 5.3% | 958 |
| theo.real.Ahab 1.0 | 8 | 382 | 1.6% | 97.7% | 0.0% | 0.7% | 1097 |
| tide.pear.Pear 0.62.1 | 8 | 705 | 8.9% | 87.7% | 0.0% | 3.4% | 615 |
| trab.Crusader 0.1.7 | 8 | 910 | 20.6% | 70.8% | 0.0% | 8.6% | 1111 |
| trm.Wrekt 1.1.6.f | 8 | 445 | 21.1% | 70.1% | 0.0% | 8.8% | 959 |
| tw.Exterminator 1.0 | 8 | 320 | 43.0% | 44.6% | 0.2% | 12.2% | 4210 |
| tzu.TheArtOfWar 1.2 | 8 | 87 | 7.2% | 90.4% | 0.0% | 2.4% | 785 |
| vuen.Fractal 0.55 | 8 | 116 | 5.4% | 93.2% | 0.0% | 1.4% | 710 |
| wcsv.Engineer.Engineer 0.5.4 | 8 | 816 | 16.9% | 76.3% | 0.0% | 6.8% | 956 |
| wiki.mini.BlackDestroyer 0.9.0 | 8 | 303 | 18.6% | 74.5% | 0.0% | 7.0% | 1026 |
| wiki.mini.Sedan 1.0 | 8 | 179 | 21.0% | 71.2% | 0.0% | 7.8% | 834 |
| wilson.Chameleon 0.91 | 8 | 65 | 0.0% | 100.0% | 0.0% | 0.0% | 945 |
| zen.Lindada 0.2 | 8 | 116 | 0.0% | 100.0% | 0.0% | 0.0% | 884 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | 8 | 4 | 1364 | 0 | 0.35 | 0 | 0 | 0 |
| DM.mega.Bezier 1.618fprrr | 8 | 8 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| KiraNL.ChupaLite 0.4 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| Krabb.krabby.Krabby 1.18b | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 8 |
| ad.Quest 0.10 | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| ags.micro.Carpet 1.1 | 8 | 7 | 0 | 0 | 0.28 | 1 | 1 | 0 |
| ahf.r2d2.R2d2 0.86 | 8 | 7 | 0 | 0 | 0.27 | 1 | 1 | 0 |
| amk.ChumbaWumba 0.3 | 8 | 7 | 0 | 0 | 0.30 | 1 | 1 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| arthord.KostyaTszyu Beta2 | 8 | 7 | 0 | 0 | 0.30 | 1 | 1 | 0 |
| ary.SMG 1.01 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| ary.mini.Nimi 1.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| brainfade.Fallen 0.63 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| bvh.frg.Friga 0.112dev | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| bvh.mini.Freya 0.55 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| casey.Flee 1.0 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| cf.mini.Chiva 1.0 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| cf.proto.Shiva 2.2 | 8 | 7 | 259 | 0 | 0.30 | 0 | 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 8 | 7 | 0 | 1 | 0.49 | 1 | 1 | 0 |
| davidalves.net.DuelistMini 1.1 | 8 | 7 | 298 | 0 | 0.36 | 0 | 0 | 0 |
| dft.Cyanide 1.90 | 8 | 5 | 596 | 0 | 0.31 | 1 | 1 | 0 |
| ds.OoV4 0.3b | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| florent.small.LittleAngel 1.8 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| ins.MobyNano 0.8 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| jam.mini.Raiko 0.43 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| jcs.Decepticon 2.5.3 | 8 | 7 | 298 | 0 | 0.33 | 0 | 0 | 0 |
| jekl.DarkHallow .90.9 | 8 | 7 | 0 | 0 | 0.29 | 1 | 1 | 0 |
| jekl.Jekyl .70 | 8 | 7 | 99 | 0 | 0.39 | 0 | 0 | 0 |
| jekl.mini.BlackPearl .91 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 8 | 7 | 298 | 0 | 0.33 | 0 | 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 6 | 1065 | 0 | 0.37 | 0 | 0 | 0 |
| kc.micro.Thorn 1.252 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| kid.Toa .0.5 | 8 | 7 | 524 | 0 | 0.32 | 0 | 0 | 0 |
| kms.Golden 0.10 | 8 | 7 | 298 | 0 | 0.29 | 1 | 1 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 8 | 6 | 165 | 0 | 0.33 | 0 | 0 | 0 |
| lucasslf.Dodger 1.0 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| lucasslf.HariSeldon 0.2.1 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| lucasslf.Wiggins 0.6 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| metal.small.MCool 1.21 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| mk.Alpha 0.2.1 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| mladjo.Grrrrr 0.9 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| mnt.AHEB 0.6a | 8 | 7 | 298 | 0 | 0.32 | 0 | 0 | 0 |
| myl.micro.NekoNinja 1.30 | 8 | 6 | 878 | 0 | 0.36 | 1 | 1 | 0 |
| nat.Hikari dev0001 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| nat.nano.Ocnirp 1.73 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| pe.mini.SandboxMini 1.2 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| pez.clean.Swiffer 0.2.9 | 8 | 8 | 0 | 0 | 0.40 | 0 | 0 | 0 |
| pez.mako.Mako 1.5 | 8 | 7 | 0 | 0 | 0.35 | 1 | 1 | 0 |
| ph.micro.Pikeman 0.4.5 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| ph.mini.Archer 0.6.6 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| pkbots.BoyTDSurfer 1.0 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| rcb.Vanessa03 0 | 8 | 7 | 0 | 0 | 0.28 | 1 | 1 | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 8 | 6 | 894 | 0 | 0.34 | 0 | 0 | 0 |
| robar.micro.Kirbyi 1.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| rz.Aleph 0.34 | 8 | 8 | 0 | 0 | 0.44 | 0 | 0 | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 8 | 7 | 44 | 0 | 0.31 | 0 | 0 | 0 |
| simonton.micro.GFMicro 1.0 | 8 | 7 | 4 | 0 | 0.33 | 0 | 0 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 8 | 6 | 0 | 0 | 0.27 | 2 | 2 | 0 |
| spinnercat.CopyKat 1.2.3 | 8 | 7 | 0 | 0 | 0.28 | 1 | 1 | 0 |
| starpkg.StarViewerZ 1.26 | 8 | 8 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| stefw.Tigger 0.0.23 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| stelo.Randomness 1.1 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| stelo.SteloTestNano 1.0 | 8 | 5 | 1430 | 0 | 0.39 | 0 | 0 | 0 |
| suh.nano.RandomPM 1.02 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| syl.Centipede 0.5 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| theo.Tungsten 1.0a | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| theo.avenge.Pequod 1.0 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| theo.real.Ahab 1.0 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| tide.pear.Pear 0.62.1 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| trab.Crusader 0.1.7 | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| trm.Wrekt 1.1.6.f | 8 | 7 | 298 | 0 | 0.33 | 0 | 0 | 0 |
| tw.Exterminator 1.0 | 8 | 6 | 0 | 0 | 0.34 | 2 | 2 | 0 |
| tzu.TheArtOfWar 1.2 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| vuen.Fractal 0.55 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 8 | 7 | 0 | 0 | 0.37 | 1 | 1 | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 8 | 7 | 0 | 0 | 0.29 | 1 | 1 | 0 |
| wiki.mini.Sedan 1.0 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| wilson.Chameleon 0.91 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| zen.Lindada 0.2 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |

617 of 664 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | 13841 | 2 | 13752 | 13752 (99.4%) | 89 (0.6%) | 0 (0.0%) | 41 | 9 | 33 |
| DM.mega.Bezier 1.618fprrr | 32292 | 1 | 32301 | 32291 (100.0%) | 1 (0.0%) | 10 (0.0%) | 104 | 5 | 48 |
| KiraNL.ChupaLite 0.4 | 13615 | 4 | 13615 | 13615 (100.0%) | 0 (0.0%) | 0 (0.0%) | 22 | 20 | 31 |
| Krabb.krabby.Krabby 1.18b | 11318 | 0 | 11337 | 11286 (99.7%) | 32 (0.3%) | 51 (0.4%) | 316 | 53 | 56 |
| ad.Quest 0.10 | 11927 | 147 | 11928 | 11927 (100.0%) | 0 (0.0%) | 1 (0.0%) | 263 | 45 | 65 |
| ags.micro.Carpet 1.1 | 21571 | 381 | 21571 | 21571 (100.0%) | 0 (0.0%) | 0 (0.0%) | 204 | 50 | 35 |
| ahf.r2d2.R2d2 0.86 | 12859 | 2 | 12859 | 12859 (100.0%) | 0 (0.0%) | 0 (0.0%) | 148 | 39 | 35 |
| amk.ChumbaWumba 0.3 | 8900 | 5 | 8899 | 8899 (100.0%) | 1 (0.0%) | 0 (0.0%) | 82 | 17 | 32 |
| apv.NanoLauLectrikTheCannibal 1.1 | 7664 | 207 | 7668 | 7663 (100.0%) | 1 (0.0%) | 5 (0.1%) | 576 | 109 | 63 |
| arthord.KostyaTszyu Beta2 | 11273 | 0 | 11306 | 11273 (100.0%) | 0 (0.0%) | 33 (0.3%) | 297 | 14 | 34 |
| ary.SMG 1.01 | 20314 | 2 | 20316 | 20313 (100.0%) | 1 (0.0%) | 3 (0.0%) | 145 | 47 | 36 |
| ary.mini.Nimi 1.0 | 19483 | 0 | 19487 | 19483 (100.0%) | 0 (0.0%) | 4 (0.0%) | 127 | 22 | 64 |
| brainfade.Fallen 0.63 | 13927 | 0 | 13948 | 13927 (100.0%) | 0 (0.0%) | 21 (0.2%) | 176 | 14 | 74 |
| bvh.frg.Friga 0.112dev | 11571 | 0 | 11571 | 11571 (100.0%) | 0 (0.0%) | 0 (0.0%) | 8 | 9 | 39 |
| bvh.mini.Freya 0.55 | 9538 | 6 | 9538 | 9538 (100.0%) | 0 (0.0%) | 0 (0.0%) | 35 | 19 | 41 |
| casey.Flee 1.0 | 9366 | 10 | 9429 | 9335 (99.7%) | 31 (0.3%) | 94 (1.0%) | 985 | 91 | 38 |
| cf.mini.Chiva 1.0 | 5660 | 17 | 5661 | 5660 (100.0%) | 0 (0.0%) | 1 (0.0%) | 362 | 153 | 33 |
| cf.proto.Shiva 2.2 | 14300 | 0 | 14283 | 14281 (99.9%) | 19 (0.1%) | 2 (0.0%) | 235 | 17 | 34 |
| davidalves.net.DuelistMicroMkII 1.1 | 11117 | 3 | 11226 | 11117 (100.0%) | 0 (0.0%) | 109 (1.0%) | 244 | 22 | 42 |
| davidalves.net.DuelistMini 1.1 | 9390 | 2 | 9375 | 9372 (99.8%) | 18 (0.2%) | 3 (0.0%) | 220 | 57 | 30 |
| dft.Cyanide 1.90 | 15736 | 694 | 15697 | 15696 (99.7%) | 40 (0.3%) | 1 (0.0%) | 39 | 12 | 34 |
| ds.OoV4 0.3b | 29767 | 53 | 29768 | 29765 (100.0%) | 2 (0.0%) | 3 (0.0%) | 120 | 44 | 33 |
| florent.small.LittleAngel 1.8 | 14547 | 2 | 14571 | 14546 (100.0%) | 1 (0.0%) | 25 (0.2%) | 354 | 48 | 46 |
| gh.GrubbmGrb 1.2.4 | 14693 | 3 | 14693 | 14693 (100.0%) | 0 (0.0%) | 0 (0.0%) | 91 | 48 | 65 |
| ins.MobyNano 0.8 | 11790 | 185 | 11842 | 11781 (99.9%) | 9 (0.1%) | 61 (0.5%) | 1525 | 108 | 40 |
| jam.mini.Raiko 0.43 | 14806 | 0 | 14810 | 14806 (100.0%) | 0 (0.0%) | 4 (0.0%) | 84 | 16 | 31 |
| jcs.Decepticon 2.5.3 | 16593 | 386 | 16571 | 16569 (99.9%) | 24 (0.1%) | 2 (0.0%) | 288 | 81 | 30 |
| jekl.DarkHallow .90.9 | 14151 | 83 | 14395 | 14151 (100.0%) | 0 (0.0%) | 244 (1.7%) | 388 | 36 | 39 |
| jekl.Jekyl .70 | 13267 | 4 | 13276 | 13261 (100.0%) | 6 (0.0%) | 15 (0.1%) | 159 | 31 | 41 |
| jekl.mini.BlackPearl .91 | 13304 | 2 | 13304 | 13303 (100.0%) | 1 (0.0%) | 1 (0.0%) | 30 | 17 | 24 |
| kawigi.mini.Coriantumr 1.1 | 10682 | 5 | 10665 | 10665 (99.8%) | 17 (0.2%) | 0 (0.0%) | 62 | 9 | 39 |
| kawigi.mini.Fhqwhgads 1.1 | 12148 | 492 | 12083 | 12083 (99.5%) | 65 (0.5%) | 0 (0.0%) | 29 | 19 | 39 |
| kc.micro.Thorn 1.252 | 13174 | 2 | 13226 | 13167 (99.9%) | 7 (0.1%) | 59 (0.4%) | 219 | 29 | 131 |
| kid.Toa .0.5 | 13919 | 0 | 14591 | 13907 (99.9%) | 12 (0.1%) | 684 (4.7%) | 790 | 48 | 42 |
| kms.Golden 0.10 | 10431 | 13 | 10413 | 10411 (99.8%) | 20 (0.2%) | 2 (0.0%) | 181 | 32 | 64 |
| lrem.magic.TormentedAngel Antiquitie | 13911 | 5 | 13901 | 13901 (99.9%) | 10 (0.1%) | 0 (0.0%) | 29 | 27 | 62 |
| lucasslf.Dodger 1.0 | 26602 | 522 | 26602 | 26602 (100.0%) | 0 (0.0%) | 0 (0.0%) | 43 | 23 | 28 |
| lucasslf.HariSeldon 0.2.1 | 25786 | 499 | 25786 | 25785 (100.0%) | 1 (0.0%) | 1 (0.0%) | 25 | 12 | 39 |
| lucasslf.Wiggins 0.6 | 26036 | 494 | 26036 | 26035 (100.0%) | 1 (0.0%) | 1 (0.0%) | 91 | 28 | 30 |
| metal.small.MCool 1.21 | 9992 | 13 | 9994 | 9991 (100.0%) | 1 (0.0%) | 3 (0.0%) | 41 | 14 | 36 |
| metal.small.dna2.MCoolDNA 1.5 | 13469 | 0 | 13469 | 13469 (100.0%) | 0 (0.0%) | 0 (0.0%) | 85 | 20 | 38 |
| mk.Alpha 0.2.1 | 17306 | 4 | 17308 | 17305 (100.0%) | 1 (0.0%) | 3 (0.0%) | 79 | 15 | 41 |
| mladjo.Grrrrr 0.9 | 14453 | 2 | 14453 | 14452 (100.0%) | 1 (0.0%) | 1 (0.0%) | 38 | 17 | 32 |
| mnt.AHEB 0.6a | 14574 | 41 | 14560 | 14549 (99.8%) | 25 (0.2%) | 11 (0.1%) | 229 | 17 | 69 |
| myl.micro.NekoNinja 1.30 | 15900 | 3 | 15863 | 15846 (99.7%) | 54 (0.3%) | 17 (0.1%) | 184 | 28 | 48 |
| nat.Hikari dev0001 | 13115 | 12 | 13216 | 13102 (99.9%) | 13 (0.1%) | 114 (0.9%) | 1043 | 75 | 63 |
| nat.nano.Ocnirp 1.73 | 9686 | 20 | 9699 | 9651 (99.6%) | 35 (0.4%) | 48 (0.5%) | 1293 | 116 | 46 |
| nat.nano.OcnirpPM 1.0 | 9329 | 12 | 9341 | 9297 (99.7%) | 32 (0.3%) | 44 (0.5%) | 1360 | 111 | 47 |
| pe.mini.SandboxMini 1.2 | 8781 | 2 | 8781 | 8781 (100.0%) | 0 (0.0%) | 0 (0.0%) | 49 | 26 | 34 |
| pez.clean.Swiffer 0.2.9 | 12586 | 7 | 12587 | 12586 (100.0%) | 0 (0.0%) | 1 (0.0%) | 76 | 28 | 40 |
| pez.mako.Mako 1.5 | 10847 | 13 | 10848 | 10843 (100.0%) | 4 (0.0%) | 5 (0.0%) | 177 | 33 | 54 |
| ph.micro.Pikeman 0.4.5 | 14469 | 2 | 14470 | 14469 (100.0%) | 0 (0.0%) | 1 (0.0%) | 44 | 8 | 39 |
| ph.mini.Archer 0.6.6 | 18653 | 547 | 18653 | 18653 (100.0%) | 0 (0.0%) | 0 (0.0%) | 31 | 19 | 33 |
| pkbots.BoyTDSurfer 1.0 | 21897 | 166 | 21897 | 21897 (100.0%) | 0 (0.0%) | 0 (0.0%) | 42 | 17 | 35 |
| rcb.Vanessa03 0 | 8998 | 2 | 9000 | 8998 (100.0%) | 0 (0.0%) | 2 (0.0%) | 56 | 26 | 56 |
| rdt.AgentSmith.AgentSmith 0.5 | 14359 | 0 | 14296 | 14296 (99.6%) | 63 (0.4%) | 0 (0.0%) | 30 | 16 | 40 |
| robar.micro.Kirbyi 1.0 | 11879 | 124 | 11996 | 11847 (99.7%) | 32 (0.3%) | 149 (1.2%) | 787 | 102 | 38 |
| rz.Aleph 0.34 | 13877 | 1 | 13877 | 13877 (100.0%) | 0 (0.0%) | 0 (0.0%) | 206 | 14 | 49 |
| simonton.beta.LifelongObsession 0.5.1 | 26569 | 524 | 26569 | 26569 (100.0%) | 0 (0.0%) | 0 (0.0%) | 61 | 21 | 34 |
| simonton.micro.GFMicro 1.0 | 22944 | 427 | 22944 | 22944 (100.0%) | 0 (0.0%) | 0 (0.0%) | 50 | 47 | 74 |
| simonton.mini.WeeksOnEnd 1.10.4 | 26393 | 484 | 26393 | 26392 (100.0%) | 1 (0.0%) | 1 (0.0%) | 162 | 29 | 39 |
| simonton.nano.WeekendObsession_S 1.7 | 12342 | 39 | 12420 | 12331 (99.9%) | 11 (0.1%) | 89 (0.7%) | 1205 | 73 | 56 |
| spinnercat.CopyKat 1.2.3 | 9978 | 8 | 9979 | 9977 (100.0%) | 1 (0.0%) | 2 (0.0%) | 302 | 44 | 88 |
| starpkg.StarViewerZ 1.26 | 37028 | 12 | 37029 | 37027 (100.0%) | 1 (0.0%) | 2 (0.0%) | 84 | 21 | 58 |
| stefw.Tigger 0.0.23 | 13733 | 0 | 13712 | 13709 (99.8%) | 24 (0.2%) | 3 (0.0%) | 189 | 28 | 35 |
| stelo.Randomness 1.1 | 13374 | 13 | 13355 | 13355 (99.9%) | 19 (0.1%) | 0 (0.0%) | 120 | 51 | 49 |
| stelo.SteloTestNano 1.0 | 8705 | 10 | 8620 | 8620 (99.0%) | 85 (1.0%) | 0 (0.0%) | 64 | 22 | 38 |
| suh.nano.RandomPM 1.02 | 11948 | 6 | 11949 | 11916 (99.7%) | 32 (0.3%) | 33 (0.3%) | 1107 | 103 | 69 |
| syl.Centipede 0.5 | 9078 | 3 | 9078 | 9078 (100.0%) | 0 (0.0%) | 0 (0.0%) | 9 | 16 | 34 |
| theo.Tungsten 1.0a | 13013 | 4 | 13019 | 13012 (100.0%) | 1 (0.0%) | 7 (0.1%) | 45 | 52 | 38 |
| theo.avenge.Pequod 1.0 | 12608 | 4 | 12640 | 12603 (100.0%) | 5 (0.0%) | 37 (0.3%) | 219 | 38 | 38 |
| theo.real.Ahab 1.0 | 16736 | 7 | 16741 | 16736 (100.0%) | 0 (0.0%) | 5 (0.0%) | 176 | 48 | 42 |
| tide.pear.Pear 0.62.1 | 8222 | 98 | 8214 | 8212 (99.9%) | 10 (0.1%) | 2 (0.0%) | 32 | 106 | 44 |
| trab.Crusader 0.1.7 | 18477 | 5 | 18476 | 18474 (100.0%) | 3 (0.0%) | 2 (0.0%) | 479 | 91 | 65 |
| trm.Wrekt 1.1.6.f | 13960 | 3 | 13967 | 13939 (99.8%) | 21 (0.2%) | 28 (0.2%) | 212 | 41 | 64 |
| tw.Exterminator 1.0 | 100714 | 22 | 101439 | 100713 (100.0%) | 1 (0.0%) | 726 (0.7%) | 595 | 84 | 89 |
| tzu.TheArtOfWar 1.2 | 10871 | 5 | 10871 | 10871 (100.0%) | 0 (0.0%) | 0 (0.0%) | 13 | 24 | 35 |
| vuen.Fractal 0.55 | 7328 | 3 | 7335 | 7314 (99.8%) | 14 (0.2%) | 21 (0.3%) | 202 | 44 | 46 |
| wcsv.Engineer.Engineer 0.5.4 | 15581 | 359 | 15581 | 15581 (100.0%) | 0 (0.0%) | 0 (0.0%) | 118 | 69 | 38 |
| wiki.mini.BlackDestroyer 0.9.0 | 16555 | 393 | 16555 | 16555 (100.0%) | 0 (0.0%) | 0 (0.0%) | 57 | 30 | 44 |
| wiki.mini.Sedan 1.0 | 11889 | 438 | 11890 | 11889 (100.0%) | 0 (0.0%) | 1 (0.0%) | 59 | 14 | 28 |
| wilson.Chameleon 0.91 | 13956 | 8 | 13957 | 13956 (100.0%) | 0 (0.0%) | 1 (0.0%) | 48 | 23 | 44 |
| zen.Lindada 0.2 | 12342 | 6 | 12344 | 12341 (100.0%) | 1 (0.0%) | 3 (0.0%) | 85 | 17 | 49 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| AIR.iRobot 1.0 | 1765 | 13195 (747.6%) | 0 |
| DM.mega.Bezier 1.618fprrr | 2636 | 31580 (1198.0%) | 75 |
| KiraNL.ChupaLite 0.4 | 1485 | 13095 (881.8%) | 60 |
| Krabb.krabby.Krabby 1.18b | 1693 | 10782 (636.9%) | 289 |
| ad.Quest 0.10 | 4505 | 9383 (208.3%) | 2329 |
| ags.micro.Carpet 1.1 | 4016 | 18940 (471.6%) | 1332 |
| ahf.r2d2.R2d2 0.86 | 2325 | 12046 (518.1%) | 550 |
| amk.ChumbaWumba 0.3 | 2605 | 7806 (299.7%) | 257 |
| apv.NanoLauLectrikTheCannibal 1.1 | 2003 | 6175 (308.3%) | 679 |
| arthord.KostyaTszyu Beta2 | 3856 | 10571 (274.1%) | 0 |
| ary.SMG 1.01 | 4102 | 17922 (436.9%) | 1996 |
| ary.mini.Nimi 1.0 | 3229 | 18456 (571.6%) | 776 |
| brainfade.Fallen 0.63 | 2884 | 13222 (458.5%) | 255 |
| bvh.frg.Friga 0.112dev | 1986 | 11231 (565.5%) | 85 |
| bvh.mini.Freya 0.55 | 2875 | 9149 (318.2%) | 0 |
| casey.Flee 1.0 | 2077 | 8326 (400.9%) | 0 |
| cf.mini.Chiva 1.0 | 2667 | 3336 (125.1%) | 534 |
| cf.proto.Shiva 2.2 | 3764 | 13304 (353.5%) | 406 |
| davidalves.net.DuelistMicroMkII 1.1 | 4124 | 10155 (246.2%) | 488 |
| davidalves.net.DuelistMini 1.1 | 5307 | 6251 (117.8%) | 573 |
| dft.Cyanide 1.90 | 2513 | 14829 (590.1%) | 1139 |
| ds.OoV4 0.3b | 2466 | 29035 (1177.4%) | 444 |
| florent.small.LittleAngel 1.8 | 5175 | 12706 (245.5%) | 949 |
| gh.GrubbmGrb 1.2.4 | 3051 | 12940 (424.1%) | 1179 |
| ins.MobyNano 0.8 | 2023 | 10824 (535.0%) | 57 |
| jam.mini.Raiko 0.43 | 2913 | 14099 (484.0%) | 223 |
| jcs.Decepticon 2.5.3 | 6246 | 11679 (187.0%) | 4308 |
| jekl.DarkHallow .90.9 | 6101 | 12343 (202.3%) | 315 |
| jekl.Jekyl .70 | 3743 | 12274 (327.9%) | 392 |
| jekl.mini.BlackPearl .91 | 2027 | 12491 (616.2%) | 204 |
| kawigi.mini.Coriantumr 1.1 | 3036 | 10220 (336.6%) | 108 |
| kawigi.mini.Fhqwhgads 1.1 | 1971 | 11193 (567.9%) | 241 |
| kc.micro.Thorn 1.252 | 4919 | 11465 (233.1%) | 2716 |
| kid.Toa .0.5 | 8681 | 12703 (146.3%) | 0 |
| kms.Golden 0.10 | 2610 | 8729 (334.4%) | 1104 |
| lrem.magic.TormentedAngel Antiquitie | 1601 | 13051 (815.2%) | 0 |
| lucasslf.Dodger 1.0 | 1805 | 25605 (1418.6%) | 50 |
| lucasslf.HariSeldon 0.2.1 | 1480 | 25197 (1702.5%) | 0 |
| lucasslf.Wiggins 0.6 | 2367 | 24682 (1042.8%) | 281 |
| metal.small.MCool 1.21 | 2187 | 9322 (426.2%) | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 2614 | 12712 (486.3%) | 0 |
| mk.Alpha 0.2.1 | 1961 | 16842 (858.8%) | 395 |
| mladjo.Grrrrr 0.9 | 1512 | 13886 (918.4%) | 6 |
| mnt.AHEB 0.6a | 2213 | 13767 (622.1%) | 0 |
| myl.micro.NekoNinja 1.30 | 3821 | 14594 (381.9%) | 20 |
| nat.Hikari dev0001 | 1920 | 12002 (625.1%) | 611 |
| nat.nano.Ocnirp 1.73 | 2823 | 7773 (275.3%) | 586 |
| nat.nano.OcnirpPM 1.0 | 2395 | 7636 (318.8%) | 449 |
| pe.mini.SandboxMini 1.2 | 2217 | 8339 (376.1%) | 0 |
| pez.clean.Swiffer 0.2.9 | 2842 | 11772 (414.2%) | 0 |
| pez.mako.Mako 1.5 | 3026 | 9558 (315.9%) | 628 |
| ph.micro.Pikeman 0.4.5 | 1664 | 13907 (835.8%) | 0 |
| ph.mini.Archer 0.6.6 | 1918 | 17725 (924.1%) | 0 |
| pkbots.BoyTDSurfer 1.0 | 1631 | 20963 (1285.3%) | 206 |
| rcb.Vanessa03 0 | 2571 | 7884 (306.7%) | 35 |
| rdt.AgentSmith.AgentSmith 0.5 | 2512 | 13698 (545.3%) | 194 |
| robar.micro.Kirbyi 1.0 | 2468 | 10215 (413.9%) | 0 |
| rz.Aleph 0.34 | 4077 | 12781 (313.5%) | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 2683 | 25215 (939.8%) | 1695 |
| simonton.micro.GFMicro 1.0 | 1692 | 22054 (1303.4%) | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 3034 | 24697 (814.0%) | 1197 |
| simonton.nano.WeekendObsession_S 1.7 | 1726 | 11432 (662.3%) | 131 |
| spinnercat.CopyKat 1.2.3 | 1194 | 9356 (783.6%) | 282 |
| starpkg.StarViewerZ 1.26 | 2165 | 35887 (1657.6%) | 178 |
| stefw.Tigger 0.0.23 | 2706 | 12593 (465.4%) | 561 |
| stelo.Randomness 1.1 | 3249 | 11378 (350.2%) | 1426 |
| stelo.SteloTestNano 1.0 | 1615 | 8127 (503.2%) | 0 |
| suh.nano.RandomPM 1.02 | 2753 | 9945 (361.2%) | 108 |
| syl.Centipede 0.5 | 2463 | 8662 (351.7%) | 0 |
| theo.Tungsten 1.0a | 2576 | 12136 (471.1%) | 728 |
| theo.avenge.Pequod 1.0 | 4529 | 10961 (242.0%) | 498 |
| theo.real.Ahab 1.0 | 4802 | 14262 (297.0%) | 1656 |
| tide.pear.Pear 0.62.1 | 2370 | 6286 (265.2%) | 1081 |
| trab.Crusader 0.1.7 | 8537 | 12278 (143.8%) | 4446 |
| trm.Wrekt 1.1.6.f | 4620 | 11654 (252.3%) | 1956 |
| tw.Exterminator 1.0 | 7200 | 94023 (1305.9%) | 5141 |
| tzu.TheArtOfWar 1.2 | 2026 | 10231 (505.0%) | 0 |
| vuen.Fractal 0.55 | 3574 | 6795 (190.1%) | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 4183 | 12459 (297.8%) | 2839 |
| wiki.mini.BlackDestroyer 0.9.0 | 2294 | 15350 (669.1%) | 0 |
| wiki.mini.Sedan 1.0 | 2369 | 11065 (467.1%) | 416 |
| wilson.Chameleon 0.91 | 3165 | 13072 (413.0%) | 46 |
| zen.Lindada 0.2 | 3119 | 11563 (370.7%) | 263 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | 650 | 491 | 650 | 762 | 4.6 / 2.6 | 12 | 424 | 259 |
| DM.mega.Bezier 1.618fprrr | 650 | 503 | 650 | 1526 | 3.2 / 2.3 | 19 | 974 | 11 |
| KiraNL.ChupaLite 0.4 | 650 | 458 | 650 | 744 | 5.6 / 4.4 | 7 | 323 | 98 |
| Krabb.krabby.Krabby 1.18b | 650 | 404 | 650 | 674 | 7.4 / 3.6 | 17 | 178 | 178 |
| ad.Quest 0.10 | 650 | 483 | 619 | 706 | 12.6 / 9.4 | 182 | 966 | 281 |
| ags.micro.Carpet 1.1 | 650 | 496 | 650 | 1078 | 7.8 / 8.1 | 10 | 913 | 1659 |
| ahf.r2d2.R2d2 0.86 | 650 | 476 | 650 | 732 | 11.5 / 7.0 | 106 | 487 | 0 |
| amk.ChumbaWumba 0.3 | 650 | 433 | 650 | 563 | 10.5 / 8.5 | 91 | 659 | 943 |
| apv.NanoLauLectrikTheCannibal 1.1 | 650 | 360 | 428 | 442 | 43.3 / 10.2 | 555 | 717 | 296 |
| arthord.KostyaTszyu Beta2 | 650 | 449 | 650 | 754 | 6.0 / 6.8 | 0 | 351 | 5 |
| ary.SMG 1.01 | 650 | 393 | 650 | 1024 | 9.6 / 10.1 | 29 | 1080 | 53 |
| ary.mini.Nimi 1.0 | 650 | 492 | 650 | 1013 | 6.3 / 3.7 | 18 | 682 | 2 |
| brainfade.Fallen 0.63 | 650 | 378 | 650 | 811 | 4.3 / 4.3 | 18 | 271 | 3 |
| bvh.frg.Friga 0.112dev | 650 | 530 | 650 | 710 | 5.8 / 1.7 | 0 | 307 | 23 |
| bvh.mini.Freya 0.55 | 650 | 510 | 650 | 635 | 7.6 / 1.6 | 0 | 339 | 4 |
| casey.Flee 1.0 | 650 | 391 | 638 | 563 | 9.9 / 7.4 | 82 | 942 | 693 |
| cf.mini.Chiva 1.0 | 650 | 357 | 400 | 337 | 64.9 / 20.1 | 1767 | 2024 | 48 |
| cf.proto.Shiva 2.2 | 650 | 440 | 650 | 860 | 4.7 / 4.1 | 25 | 238 | 12 |
| davidalves.net.DuelistMicroMkII 1.1 | 650 | 432 | 650 | 726 | 14.5 / 7.6 | 125 | 444 | 47 |
| davidalves.net.DuelistMini 1.1 | 650 | 523 | 619 | 618 | 16.9 / 11.0 | 217 | 1731 | 226 |
| dft.Cyanide 1.90 | 650 | 476 | 650 | 856 | 5.2 / 3.7 | 17 | 771 | 3300 |
| ds.OoV4 0.3b | 650 | 479 | 650 | 1401 | 6.4 / 4.0 | 7 | 347 | 66 |
| florent.small.LittleAngel 1.8 | 650 | 523 | 650 | 886 | 7.1 / 10.4 | 0 | 599 | 65 |
| gh.GrubbmGrb 1.2.4 | 650 | 414 | 650 | 765 | 20.2 / 6.5 | 318 | 1229 | 62 |
| ins.MobyNano 0.8 | 650 | 392 | 650 | 654 | 10.2 / 8.7 | 115 | 814 | 1157 |
| jam.mini.Raiko 0.43 | 650 | 444 | 650 | 838 | 5.2 / 3.7 | 0 | 346 | 1 |
| jcs.Decepticon 2.5.3 | 650 | 525 | 650 | 883 | 13.3 / 14.8 | 28 | 1524 | 3305 |
| jekl.DarkHallow .90.9 | 650 | 447 | 647 | 892 | 9.1 / 9.0 | 20 | 1114 | 270 |
| jekl.Jekyl .70 | 650 | 441 | 650 | 800 | 8.3 / 3.9 | 12 | 720 | 4 |
| jekl.mini.BlackPearl .91 | 650 | 462 | 631 | 737 | 6.9 / 3.0 | 29 | 581 | 414 |
| kawigi.mini.Coriantumr 1.1 | 650 | 508 | 650 | 701 | 13.3 / 1.7 | 15 | 183 | 41 |
| kawigi.mini.Fhqwhgads 1.1 | 650 | 343 | 650 | 686 | 9.7 / 6.2 | 84 | 739 | 1111 |
| kc.micro.Thorn 1.252 | 650 | 433 | 638 | 813 | 10.3 / 8.4 | 27 | 562 | 8 |
| kid.Toa .0.5 | 650 | 420 | 484 | 1029 | 19.9 / 6.3 | 163 | 33 | 41 |
| kms.Golden 0.10 | 650 | 308 | 619 | 610 | 11.4 / 12.5 | 312 | 917 | 530 |
| lrem.magic.TormentedAngel Antiquitie | 650 | 409 | 606 | 755 | 5.6 / 8.2 | 0 | 586 | 404 |
| lucasslf.Dodger 1.0 | 650 | 395 | 650 | 1246 | 4.7 / 6.9 | 7 | 504 | 984 |
| lucasslf.HariSeldon 0.2.1 | 650 | 489 | 619 | 1215 | 7.6 / 2.1 | 18 | 387 | 157 |
| lucasslf.Wiggins 0.6 | 650 | 463 | 650 | 1227 | 6.9 / 4.4 | 7 | 840 | 413 |
| metal.small.MCool 1.21 | 650 | 448 | 650 | 613 | 6.4 / 2.8 | 4 | 649 | 116 |
| metal.small.dna2.MCoolDNA 1.5 | 650 | 376 | 650 | 792 | 9.2 / 7.0 | 46 | 421 | 0 |
| mk.Alpha 0.2.1 | 650 | 545 | 650 | 902 | 6.5 / 1.7 | 8 | 280 | 0 |
| mladjo.Grrrrr 0.9 | 650 | 434 | 650 | 785 | 5.1 / 4.4 | 13 | 299 | 112 |
| mnt.AHEB 0.6a | 650 | 362 | 650 | 807 | 5.3 / 6.9 | 1 | 418 | 0 |
| myl.micro.NekoNinja 1.30 | 650 | 477 | 619 | 882 | 11.4 / 5.2 | 84 | 505 | 2 |
| nat.Hikari dev0001 | 650 | 320 | 650 | 708 | 8.1 / 8.8 | 61 | 420 | 369 |
| nat.nano.Ocnirp 1.73 | 650 | 395 | 650 | 574 | 11.2 / 12.5 | 153 | 1056 | 1240 |
| nat.nano.OcnirpPM 1.0 | 650 | 398 | 650 | 555 | 11.0 / 11.0 | 124 | 1019 | 919 |
| pe.mini.SandboxMini 1.2 | 650 | 318 | 650 | 580 | 9.8 / 7.6 | 10 | 333 | 0 |
| pez.clean.Swiffer 0.2.9 | 650 | 440 | 619 | 763 | 11.6 / 5.4 | 73 | 547 | 36 |
| pez.mako.Mako 1.5 | 650 | 443 | 650 | 659 | 10.3 / 5.8 | 41 | 952 | 32 |
| ph.micro.Pikeman 0.4.5 | 650 | 504 | 650 | 789 | 3.7 / 2.4 | 0 | 222 | 178 |
| ph.mini.Archer 0.6.6 | 650 | 458 | 650 | 955 | 3.7 / 6.7 | 13 | 458 | 1210 |
| pkbots.BoyTDSurfer 1.0 | 650 | 355 | 650 | 1060 | 5.1 / 7.0 | 0 | 181 | 157 |
| rcb.Vanessa03 0 | 650 | 348 | 650 | 580 | 10.9 / 7.2 | 106 | 1110 | 1 |
| rdt.AgentSmith.AgentSmith 0.5 | 650 | 509 | 650 | 813 | 5.2 / 3.5 | 4 | 404 | 0 |
| robar.micro.Kirbyi 1.0 | 650 | 255 | 650 | 669 | 12.5 / 10.6 | 267 | 638 | 601 |
| rz.Aleph 0.34 | 650 | 488 | 638 | 839 | 4.5 / 5.7 | 23 | 339 | 68 |
| simonton.beta.LifelongObsession 0.5.1 | 650 | 478 | 650 | 1264 | 7.8 / 5.9 | 14 | 407 | 1764 |
| simonton.micro.GFMicro 1.0 | 650 | 411 | 600 | 1089 | 20.1 / 6.7 | 177 | 605 | 716 |
| simonton.mini.WeeksOnEnd 1.10.4 | 650 | 466 | 650 | 1256 | 8.2 / 5.8 | 8 | 601 | 1864 |
| simonton.nano.WeekendObsession_S 1.7 | 650 | 358 | 650 | 676 | 10.0 / 7.1 | 9 | 778 | 206 |
| spinnercat.CopyKat 1.2.3 | 650 | 336 | 644 | 591 | 12.1 / 5.8 | 76 | 370 | 223 |
| starpkg.StarViewerZ 1.26 | 650 | 419 | 650 | 1664 | 6.1 / 2.9 | 33 | 756 | 0 |
| stefw.Tigger 0.0.23 | 650 | 428 | 650 | 771 | 5.5 / 7.8 | 6 | 346 | 78 |
| stelo.Randomness 1.1 | 650 | 421 | 650 | 725 | 14.0 / 10.9 | 312 | 1069 | 209 |
| stelo.SteloTestNano 1.0 | 650 | 370 | 650 | 549 | 11.6 / 6.1 | 90 | 507 | 219 |
| suh.nano.RandomPM 1.02 | 650 | 389 | 619 | 654 | 11.0 / 11.8 | 252 | 972 | 901 |
| syl.Centipede 0.5 | 650 | 410 | 644 | 599 | 6.5 / 1.9 | 27 | 194 | 103 |
| theo.Tungsten 1.0a | 650 | 407 | 625 | 762 | 12.8 / 9.3 | 60 | 569 | 0 |
| theo.avenge.Pequod 1.0 | 650 | 486 | 619 | 808 | 9.9 / 8.7 | 76 | 873 | 88 |
| theo.real.Ahab 1.0 | 650 | 491 | 650 | 947 | 10.7 / 10.6 | 65 | 509 | 47 |
| tide.pear.Pear 0.62.1 | 650 | 302 | 400 | 465 | 47.2 / 17.7 | 1094 | 1340 | 3 |
| trab.Crusader 0.1.7 | 650 | 441 | 650 | 961 | 12.1 / 18.4 | 11 | 3599 | 2 |
| trm.Wrekt 1.1.6.f | 650 | 377 | 650 | 809 | 9.1 / 8.9 | 68 | 391 | 5 |
| tw.Exterminator 1.0 | 650 | 496 | 619 | 4080 | 11.1 / 4.1 | 408 | 366 | 385 |
| tzu.TheArtOfWar 1.2 | 650 | 341 | 647 | 635 | 13.3 / 2.2 | 148 | 415 | 0 |
| vuen.Fractal 0.55 | 650 | 437 | 578 | 560 | 22.6 / 3.1 | 252 | 506 | 36 |
| wcsv.Engineer.Engineer 0.5.4 | 650 | 365 | 588 | 806 | 17.9 / 17.8 | 363 | 1338 | 759 |
| wiki.mini.BlackDestroyer 0.9.0 | 650 | 443 | 650 | 876 | 6.5 / 6.4 | 39 | 465 | 529 |
| wiki.mini.Sedan 1.0 | 650 | 476 | 650 | 684 | 6.6 / 3.6 | 0 | 857 | 258 |
| wilson.Chameleon 0.91 | 650 | 488 | 634 | 795 | 9.1 / 1.8 | 37 | 499 | 1 |
| zen.Lindada 0.2 | 650 | 496 | 638 | 734 | 8.9 / 3.3 | 13 | 475 | 76 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | 4.2% | 99 | 36 | 3 | 1.9 | 35 / 13195 (0%) | 0 | 0 |
| DM.mega.Bezier 1.618fprrr | 0.4% | 104 | 29 | 3 | 2.5 | 67 / 31580 (0%) | 0 | 0 |
| KiraNL.ChupaLite 0.4 | 1.0% | 80 | 25 | 3 | 1.6 | 26 / 13095 (0%) | 0 | 0 |
| Krabb.krabby.Krabby 1.18b | 0.8% | 87 | 34 | 3 | 1.8 | 52 / 10782 (0%) | 0 | 0 |
| ad.Quest 0.10 | 2.6% | 108 | 40 | 3 | 8.8 | 279 / 9383 (3%) | 0 | 0 |
| ags.micro.Carpet 1.1 | 2.9% | 79 | 38 | 3 | 9.0 | 216 / 18940 (1%) | 0 | 0 |
| ahf.r2d2.R2d2 0.86 | 2.0% | 76 | 30 | 3 | 2.5 | 89 / 12046 (1%) | 0 | 0 |
| amk.ChumbaWumba 0.3 | 1.8% | 83 | 34 | 3 | 3.6 | 76 / 7806 (1%) | 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 4.6% | 95 | 28 | 3 | 2.8 | 74 / 6175 (1%) | 0 | 0 |
| arthord.KostyaTszyu Beta2 | 1.3% | 84 | 32 | 3 | 2.1 | 45 / 10571 (0%) | 0 | 0 |
| ary.SMG 1.01 | 2.5% | 91 | 37 | 3 | 8.5 | 220 / 17922 (1%) | 0 | 0 |
| ary.mini.Nimi 1.0 | 0.8% | 86 | 34 | 3 | 3.8 | 108 / 18456 (1%) | 0 | 0 |
| brainfade.Fallen 0.63 | 1.1% | 89 | 31 | 3 | 2.4 | 61 / 13222 (0%) | 0 | 0 |
| bvh.frg.Friga 0.112dev | 0.4% | 89 | 29 | 3 | 1.2 | 28 / 11231 (0%) | 0 | 0 |
| bvh.mini.Freya 0.55 | 0.4% | 86 | 29 | 3 | 1.3 | 25 / 9149 (0%) | 0 | 0 |
| casey.Flee 1.0 | 2.0% | 93 | 30 | 3 | 3.7 | 81 / 8326 (1%) | 0 | 0 |
| cf.mini.Chiva 1.0 | 9.1% | 91 | 32 | 3 | 8.1 | 235 / 3336 (7%) | 0 | 0 |
| cf.proto.Shiva 2.2 | 1.0% | 85 | 38 | 3 | 2.6 | 66 / 13304 (0%) | 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 1.9% | 138 | 35 | 3 | 3.0 | 72 / 10155 (1%) | 0 | 0 |
| davidalves.net.DuelistMini 1.1 | 2.3% | 101 | 38 | 3 | 10.3 | 230 / 6251 (4%) | 0 | 0 |
| dft.Cyanide 1.90 | 3.7% | 87 | 25 | 3 | 3.2 | 97 / 14829 (1%) | 0 | 0 |
| ds.OoV4 0.3b | 1.0% | 96 | 907 | 3 | 2.4 | 68 / 29035 (0%) | 0 | 0 |
| florent.small.LittleAngel 1.8 | 2.1% | 100 | 29 | 3 | 5.7 | 142 / 12706 (1%) | 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 2.2% | 97 | 39 | 3 | 6.1 | 145 / 12940 (1%) | 0 | 0 |
| ins.MobyNano 0.8 | 3.3% | 89 | 32 | 3 | 3.0 | 64 / 10824 (1%) | 0 | 0 |
| jam.mini.Raiko 0.43 | 0.8% | 98 | 29 | 3 | 2.3 | 52 / 14099 (0%) | 0 | 0 |
| jcs.Decepticon 2.5.3 | 4.7% | 92 | 38 | 3 | 16.0 | 449 / 11679 (4%) | 0 | 0 |
| jekl.DarkHallow .90.9 | 2.3% | 82 | 37 | 3 | 7.1 | 150 / 12343 (1%) | 0 | 0 |
| jekl.Jekyl .70 | 1.4% | 108 | 36 | 3 | 3.6 | 74 / 12274 (1%) | 0 | 0 |
| jekl.mini.BlackPearl .91 | 0.7% | 89 | 31 | 3 | 3.0 | 71 / 12491 (1%) | 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 0.4% | 93 | 24 | 3 | 1.4 | 29 / 10220 (0%) | 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 6.0% | 104 | 26 | 3 | 2.4 | 52 / 11193 (0%) | 0 | 0 |
| kc.micro.Thorn 1.252 | 1.9% | 88 | 36 | 3 | 6.3 | 172 / 11465 (2%) | 0 | 0 |
| kid.Toa .0.5 | 1.6% | 89 | 37 | 3 | 6.5 | 78 / 12703 (1%) | 0 | 0 |
| kms.Golden 0.10 | 3.0% | 82 | 37 | 3 | 5.7 | 150 / 8729 (2%) | 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 1.7% | 92 | 31 | 3 | 2.3 | 42 / 13051 (0%) | 0 | 0 |
| lucasslf.Dodger 1.0 | 2.6% | 85 | 32 | 3 | 2.5 | 47 / 25605 (0%) | 0 | 0 |
| lucasslf.HariSeldon 0.2.1 | 1.5% | 87 | 35 | 3 | 1.7 | 19 / 25197 (0%) | 0 | 0 |
| lucasslf.Wiggins 0.6 | 1.9% | 80 | 25 | 3 | 4.7 | 111 / 24682 (0%) | 0 | 0 |
| metal.small.MCool 1.21 | 0.6% | 92 | 28 | 3 | 2.1 | 36 / 9322 (0%) | 0 | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 1.5% | 93 | 51 | 3 | 2.3 | 41 / 12712 (0%) | 0 | 0 |
| mk.Alpha 0.2.1 | 0.6% | 94 | 37 | 3 | 1.9 | 71 / 16842 (0%) | 0 | 0 |
| mladjo.Grrrrr 0.9 | 1.1% | 90 | 31 | 3 | 1.7 | 32 / 13886 (0%) | 0 | 0 |
| mnt.AHEB 0.6a | 2.0% | 89 | 34 | 3 | 2.2 | 30 / 13767 (0%) | 0 | 0 |
| myl.micro.NekoNinja 1.30 | 2.7% | 100 | 32 | 3 | 4.0 | 77 / 14594 (1%) | 0 | 0 |
| nat.Hikari dev0001 | 2.4% | 90 | 28 | 3 | 3.4 | 118 / 12002 (1%) | 0 | 0 |
| nat.nano.Ocnirp 1.73 | 3.4% | 98 | 30 | 3 | 6.3 | 126 / 7773 (2%) | 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 3.0% | 94 | 32 | 3 | 4.9 | 117 / 7636 (2%) | 0 | 0 |
| pe.mini.SandboxMini 1.2 | 1.5% | 93 | 36 | 3 | 1.1 | 19 / 8339 (0%) | 0 | 0 |
| pez.clean.Swiffer 0.2.9 | 1.6% | 113 | 34 | 3 | 2.0 | 23 / 11772 (0%) | 0 | 0 |
| pez.mako.Mako 1.5 | 1.4% | 98 | 32 | 3 | 3.4 | 62 / 9558 (1%) | 0 | 0 |
| ph.micro.Pikeman 0.4.5 | 0.5% | 93 | 33 | 3 | 2.1 | 43 / 13907 (0%) | 0 | 0 |
| ph.mini.Archer 0.6.6 | 3.5% | 89 | 39 | 3 | 2.4 | 40 / 17725 (0%) | 0 | 0 |
| pkbots.BoyTDSurfer 1.0 | 2.0% | 95 | 34 | 3 | 2.5 | 67 / 20963 (0%) | 0 | 0 |
| rcb.Vanessa03 0 | 2.0% | 79 | 30 | 3 | 3.4 | 62 / 7884 (1%) | 0 | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 1.1% | 94 | 34 | 3 | 2.1 | 58 / 13698 (0%) | 0 | 0 |
| robar.micro.Kirbyi 1.0 | 4.5% | 87 | 33 | 3 | 4.3 | 85 / 10215 (1%) | 0 | 0 |
| rz.Aleph 0.34 | 1.2% | 122 | 35 | 3 | 3.9 | 93 / 12781 (1%) | 0 | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 2.4% | 86 | 66 | 3 | 4.5 | 152 / 25215 (1%) | 0 | 0 |
| simonton.micro.GFMicro 1.0 | 2.9% | 92 | 37 | 3 | 1.7 | 44 / 22054 (0%) | 0 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 2.3% | 90 | 36 | 3 | 5.8 | 169 / 24697 (1%) | 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 2.4% | 75 | 31 | 3 | 2.3 | 74 / 11432 (1%) | 0 | 0 |
| spinnercat.CopyKat 1.2.3 | 2.4% | 78 | 24 | 3 | 1.5 | 56 / 9356 (1%) | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 0.7% | 104 | 43 | 2 | 3.6 | 85 / 35887 (0%) | 0 | 0 |
| stefw.Tigger 0.0.23 | 1.6% | 97 | 32 | 3 | 3.5 | 87 / 12593 (1%) | 0 | 0 |
| stelo.Randomness 1.1 | 2.9% | 97 | 39 | 3 | 6.9 | 200 / 11378 (2%) | 0 | 0 |
| stelo.SteloTestNano 1.0 | 3.5% | 109 | 33 | 3 | 1.3 | 35 / 8127 (0%) | 0 | 0 |
| suh.nano.RandomPM 1.02 | 3.0% | 97 | 35 | 3 | 6.4 | 108 / 9945 (1%) | 0 | 0 |
| syl.Centipede 0.5 | 0.7% | 90 | 35 | 3 | 1.3 | 22 / 8662 (0%) | 0 | 0 |
| theo.Tungsten 1.0a | 2.2% | 97 | 28 | 3 | 2.5 | 94 / 12136 (1%) | 0 | 0 |
| theo.avenge.Pequod 1.0 | 1.8% | 80 | 41 | 3 | 5.8 | 138 / 10961 (1%) | 0 | 0 |
| theo.real.Ahab 1.0 | 2.5% | 95 | 68 | 3 | 8.7 | 247 / 14262 (2%) | 0 | 0 |
| tide.pear.Pear 0.62.1 | 6.8% | 102 | 57 | 2 | 6.4 | 217 / 6286 (3%) | 0 | 0 |
| trab.Crusader 0.1.7 | 4.1% | 110 | 45 | 3 | 23.3 | 602 / 12278 (5%) | 0 | 0 |
| trm.Wrekt 1.1.6.f | 2.1% | 91 | 27 | 3 | 8.7 | 209 / 11654 (2%) | 0 | 0 |
| tw.Exterminator 1.0 | 2.1% | 95 | 44 | 3 | 24.8 | 574 / 94023 (1%) | 0 | 0 |
| tzu.TheArtOfWar 1.2 | 1.2% | 89 | 45 | 3 | 1.8 | 40 / 10231 (0%) | 0 | 0 |
| vuen.Fractal 0.55 | 0.8% | 80 | 35 | 3 | 1.7 | 20 / 6795 (0%) | 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 4.9% | 104 | 41 | 3 | 10.9 | 335 / 12459 (3%) | 0 | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 3.0% | 81 | 32 | 3 | 3.4 | 70 / 15350 (0%) | 0 | 0 |
| wiki.mini.Sedan 1.0 | 2.7% | 85 | 30 | 3 | 2.8 | 74 / 11065 (1%) | 0 | 0 |
| wilson.Chameleon 0.91 | 0.5% | 90 | 32 | 3 | 2.9 | 67 / 13072 (1%) | 0 | 0 |
| zen.Lindada 0.2 | 0.8% | 83 | 28 | 3 | 2.5 | 42 / 11563 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| DM.mega.Bezier 1.618fprrr | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| KiraNL.ChupaLite 0.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| Krabb.krabby.Krabby 1.18b | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ad.Quest 0.10 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ags.micro.Carpet 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ahf.r2d2.R2d2 0.86 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| amk.ChumbaWumba 0.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| arthord.KostyaTszyu Beta2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ary.SMG 1.01 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ary.mini.Nimi 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| brainfade.Fallen 0.63 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.frg.Friga 0.112dev | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.mini.Freya 0.55 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| casey.Flee 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cf.mini.Chiva 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cf.proto.Shiva 2.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.net.DuelistMini 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dft.Cyanide 1.90 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ds.OoV4 0.3b | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| florent.small.LittleAngel 1.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ins.MobyNano 0.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jam.mini.Raiko 0.43 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jcs.Decepticon 2.5.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jekl.DarkHallow .90.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jekl.Jekyl .70 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jekl.mini.BlackPearl .91 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kc.micro.Thorn 1.252 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kid.Toa .0.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kms.Golden 0.10 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lucasslf.Dodger 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lucasslf.HariSeldon 0.2.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lucasslf.Wiggins 0.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| metal.small.MCool 1.21 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mk.Alpha 0.2.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mladjo.Grrrrr 0.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mnt.AHEB 0.6a | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| myl.micro.NekoNinja 1.30 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.Hikari dev0001 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.nano.Ocnirp 1.73 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pe.mini.SandboxMini 1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.clean.Swiffer 0.2.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.mako.Mako 1.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ph.micro.Pikeman 0.4.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ph.mini.Archer 0.6.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pkbots.BoyTDSurfer 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rcb.Vanessa03 0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.micro.Kirbyi 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rz.Aleph 0.34 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.micro.GFMicro 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| spinnercat.CopyKat 1.2.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| starpkg.StarViewerZ 1.26 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stefw.Tigger 0.0.23 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.Randomness 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.SteloTestNano 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| suh.nano.RandomPM 1.02 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| syl.Centipede 0.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.Tungsten 1.0a | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.avenge.Pequod 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.real.Ahab 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tide.pear.Pear 0.62.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| trab.Crusader 0.1.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| trm.Wrekt 1.1.6.f | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tw.Exterminator 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tzu.TheArtOfWar 1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| vuen.Fractal 0.55 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wiki.mini.Sedan 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wilson.Chameleon 0.91 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| zen.Lindada 0.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | AIR.iRobot | 1 | 35 | 272 | 0.4% | 4.0% ± 3.9 | 8.9% | 24.3% / 20.0% | 9.4% | 0 / 0 | T?/M? | 94% |
| DM.mega.Bezier 1.618fprrr | DM.mega.Bezier | 1 | 35 | 302 | 0.5% | 9.1% ± 5.4 | 10.7% | 30.3% / 29.8% | 4.7% | 0 / 0 | T?/M? | 97% |
| KiraNL.ChupaLite 0.4 | KiraNL.ChupaLite | 1 | 35 | 296 | 0.9% | 15.5% ± 9.4 | 11.4% | 39.8% / 36.6% | 6.5% | 0 / 0 | T?/M? | 94% |
| Krabb.krabby.Krabby 1.18b | Krabb.krabby.Krabby | 1 | 35 | 312 | 0.4% | 13.4% ± 22.3 | 10.1% | 21.2% / 21.4% | 23.5% | 0 / 0 | T?/M? | 97% |
| ad.Quest 0.10 | ad.Quest | 1 | 35 | 266 | 3.0% | 10.7% ± 4.8 | 9.2% | 26.5% / 22.6% | 10.6% | 0 / 0 | T?/M? | 86% |
| ags.micro.Carpet 1.1 | ags.micro.Carpet | 1 | 35 | 296 | 3.9% | 13.5% ± 3.4 | 12.9% | 26.3% / 24.4% | 6.8% | 0 / 0 | T?/M? | 82% |
| ahf.r2d2.R2d2 0.86 | ahf.r2d2.R2d2 | 1 | 35 | 286 | 1.7% | 10.6% ± 5.1 | 12.2% | 28.8% / 22.5% | 2.7% | 0 / 0 | T?/M? | 88% |
| amk.ChumbaWumba 0.3 | amk.ChumbaWumba | 1 | 35 | 292 | 2.5% | 12.6% ± 5.4 | 11.7% | 23.1% / 23.1% | 10.6% | 0 / 0 | T?/M? | 82% |
| apv.NanoLauLectrikTheCannibal 1.1 | apv.NanoLauLectrikTheCannibal | 1 | 35 | 348 | 4.2% | 15.4% ± 7.4 | 36.0% | 62.2% / 60.3% | 96.1% | 0 / 0 | T?/M? | 95% |
| arthord.KostyaTszyu Beta2 | arthord.KostyaTszyu | 1 | 35 | 312 | 1.9% | 28.0% ± 12.2 | 9.2% | 22.4% / 22.2% | 4.4% | 0 / 0 | T?/M? | 83% |
| ary.SMG 1.01 | ary.SMG | 1 | 35 | 262 | 4.3% | 10.0% ± 2.4 | 9.6% | 23.6% / 27.9% | 3.2% | 0 / 0 | T3/M? | 72% |
| ary.mini.Nimi 1.0 | ary.mini.Nimi | 1 | 35 | 284 | 0.7% | 6.3% ± 3.9 | 9.1% | 22.9% / 24.8% | 5.3% | 0 / 0 | T?/M? | 95% |
| brainfade.Fallen 0.63 | brainfade.Fallen | 1 | 35 | 298 | 1.2% | 14.3% ± 6.8 | 10.2% | 27.9% / 27.7% | 22.4% | 0 / 0 | T?/M? | 89% |
| bvh.frg.Friga 0.112dev | bvh.frg.Friga | 1 | 35 | 294 | 0.6% | 13.3% ± 10.9 | 9.1% | 31.2% / 27.2% | 1.1% | 0 / 0 | T?/M? | 94% |
| bvh.mini.Freya 0.55 | bvh.mini.Freya | 1 | 35 | 290 | 0.3% | 11.7% ± 15.0 | 8.5% | 28.5% / 28.5% | 11.3% | 0 / 0 | T?/M? | 98% |
| casey.Flee 1.0 | casey.Flee | 1 | 35 | 272 | 1.9% | 7.5% ± 4.0 | 11.3% | 26.8% / 24.8% | 7.7% | 0 / 0 | T?/M? | 89% |
| cf.mini.Chiva 1.0 | cf.mini.Chiva | 1 | 35 | 284 | 9.7% | 13.1% ± 3.7 | 27.5% | 50.4% / 38.8% | 1.9% | 0 / 0 | T?/M? | 85% |
| cf.proto.Shiva 2.2 | cf.proto.Shiva | 1 | 35 | 288 | 0.8% | 6.9% ± 5.7 | 8.7% | 21.9% / 24.4% | 27.0% | 0 / 0 | T?/M? | 90% |
| davidalves.net.DuelistMicroMkII 1.1 | davidalves.net.DuelistMicroMkII | 1 | 35 | 356 | 2.4% | 13.6% ± 4.7 | 12.7% | 27.7% / 22.0% | 15.6% | 0 / 0 | T?/M? | 86% |
| davidalves.net.DuelistMini 1.1 | davidalves.net.DuelistMini | 1 | 35 | 336 | 1.1% | 11.0% ± 5.5 | 10.1% | 28.2% / 25.2% | 21.2% | 0 / 0 | T?/M? | 92% |
| dft.Cyanide 1.90 | dft.Cyanide | 1 | 35 | 278 | 4.1% | 8.5% ± 6.5 | 10.2% | 29.7% / 29.1% | 12.0% | 0 / 0 | T?/M? | 96% |
| ds.OoV4 0.3b | ds.OoV4 | 1 | 35 | 262 | 0.8% | 12.0% ± 6.1 | 9.0% | 28.1% / 26.5% | 4.8% | 0 / 0 | T?/M? | 94% |
| florent.small.LittleAngel 1.8 | florent.small.LittleAngel | 1 | 35 | 332 | 2.4% | 13.2% ± 4.0 | 9.0% | 22.5% / 24.6% | 2.7% | 0 / 0 | T?/M? | 82% |
| gh.GrubbmGrb 1.2.4 | gh.GrubbmGrb | 1 | 35 | 284 | 0.9% | 41.2% ± 17.4 | 19.7% | 47.8% / 46.3% | 39.9% | 0 / 0 | T?/M? | 97% |
| ins.MobyNano 0.8 | ins.MobyNano | 1 | 35 | 280 | 3.4% | 24.9% ± 8.1 | 14.2% | 28.0% / 25.7% | 9.4% | 0 / 0 | T?/M? | 84% |
| jam.mini.Raiko 0.43 | jam.mini.Raiko | 1 | 35 | 290 | 1.1% | 14.9% ± 7.7 | 8.5% | 21.8% / 22.0% | 3.9% | 0 / 0 | T?/M? | 92% |
| jcs.Decepticon 2.5.3 | jcs.Decepticon | 1 | 35 | 292 | 4.7% | 8.5% ± 2.3 | 10.8% | 21.6% / 24.2% | 7.2% | 0 / 0 | T3/M? | 81% |
| jekl.DarkHallow .90.9 | jekl.DarkHallow | 1 | 35 | 296 | 2.1% | 12.4% ± 8.3 | 9.5% | 21.7% / 22.2% | 9.6% | 0 / 0 | T?/M? | 88% |
| jekl.Jekyl .70 | jekl.Jekyl | 1 | 35 | 272 | 1.2% | 9.3% ± 4.9 | 8.8% | 20.0% / 22.6% | 2.2% | 0 / 0 | T?/M? | 94% |
| jekl.mini.BlackPearl .91 | jekl.mini.BlackPearl | 1 | 35 | 312 | 0.9% | 5.8% ± 3.4 | 11.1% | 29.1% / 30.0% | 9.1% | 0 / 0 | T?/M? | 95% |
| kawigi.mini.Coriantumr 1.1 | kawigi.mini.Coriantumr | 1 | 35 | 320 | 0.1% | 5.9% ± 8.2 | 9.8% | 30.1% / 27.9% | 1.3% | 0 / 0 | T?/M? | 99% |
| kawigi.mini.Fhqwhgads 1.1 | kawigi.mini.Fhqwhgads | 1 | 35 | 316 | 5.4% | 12.7% ± 7.1 | 14.3% | 21.8% / 20.2% | 7.5% | 0 / 0 | T?/M? | 93% |
| kc.micro.Thorn 1.252 | kc.micro.Thorn | 1 | 35 | 292 | 1.3% | 11.9% ± 6.0 | 10.0% | 24.9% / 23.3% | 4.8% | 0 / 0 | T?/M? | 92% |
| kid.Toa .0.5 | kid.Toa | 1 | 35 | 262 | 1.4% | 8.1% ± 3.3 | 12.5% | 26.2% / 24.9% | 8.7% | 0 / 0 | T?/M0 | 94% |
| kms.Golden 0.10 | kms.Golden | 1 | 35 | 274 | 3.7% | 7.2% ± 2.8 | 14.2% | 23.1% / 24.2% | 16.0% | 0 / 0 | T3/M? | 77% |
| lrem.magic.TormentedAngel Antiquitie | lrem.magic.TormentedAngel | 1 | 35 | 346 | 2.2% | 17.7% ± 7.4 | 9.4% | 27.3% / 25.2% | 7.6% | 0 / 0 | T?/M? | 81% |
| lucasslf.Dodger 1.0 | lucasslf.Dodger | 1 | 35 | 292 | 2.9% | 20.2% ± 7.5 | 9.6% | 22.4% / 21.8% | 5.9% | 0 / 0 | T?/M? | 81% |
| lucasslf.HariSeldon 0.2.1 | lucasslf.HariSeldon | 1 | 35 | 312 | 2.0% | 19.0% ± 11.9 | 12.4% | 43.9% / 39.0% | 4.0% | 0 / 0 | T?/M? | 96% |
| lucasslf.Wiggins 0.6 | lucasslf.Wiggins | 1 | 35 | 296 | 2.6% | 9.0% ± 4.4 | 11.7% | 26.6% / 25.4% | 6.5% | 0 / 0 | T?/M? | 94% |
| metal.small.MCool 1.21 | metal.small.MCool | 1 | 35 | 302 | 0.9% | 8.4% ± 6.1 | 8.7% | 23.6% / 23.7% | 10.6% | 0 / 0 | T?/M? | 93% |
| metal.small.dna2.MCoolDNA 1.5 | metal.small.dna2.MCoolDNA | 1 | 35 | 332 | 1.1% | 8.1% ± 4.4 | 10.2% | 22.8% / 23.4% | 4.1% | 0 / 0 | T?/M? | 94% |
| mk.Alpha 0.2.1 | mk.Alpha | 1 | 35 | 268 | 0.2% | 17.7% ± 12.8 | 8.3% | 31.1% / 27.7% | 1.7% | 0 / 0 | T?/M? | 98% |
| mladjo.Grrrrr 0.9 | mladjo.Grrrrr | 1 | 35 | 284 | 0.8% | 11.3% ± 7.2 | 10.3% | 28.4% / 28.4% | 9.1% | 0 / 0 | T?/M? | 95% |
| mnt.AHEB 0.6a | mnt.AHEB | 1 | 35 | 266 | 1.6% | 28.1% ± 12.6 | 8.6% | 21.3% / 20.7% | 51.8% | 0 / 0 | T?/M? | 85% |
| myl.micro.NekoNinja 1.30 | myl.micro.NekoNinja | 1 | 35 | 310 | 1.2% | 13.6% ± 5.5 | 10.8% | 29.0% / 27.4% | 13.9% | 0 / 0 | T?/M? | 89% |
| nat.Hikari dev0001 | nat.Hikari | 1 | 35 | 280 | 2.2% | 19.4% ± 7.4 | 11.6% | 24.1% / 27.8% | 26.6% | 0 / 0 | T?/M? | 89% |
| nat.nano.Ocnirp 1.73 | nat.nano.Ocnirp | 1 | 35 | 294 | 1.4% | 7.9% ± 5.2 | 11.0% | 26.9% / 23.9% | 11.7% | 0 / 0 | T?/M? | 92% |
| nat.nano.OcnirpPM 1.0 | nat.nano.OcnirpPM | 1 | 35 | 300 | 2.3% | 15.7% ± 7.3 | 12.2% | 29.3% / 24.3% | 11.9% | 0 / 0 | T?/M? | 86% |
| pe.mini.SandboxMini 1.2 | pe.mini.SandboxMini | 1 | 35 | 308 | 2.1% | 30.4% ± 13.5 | 13.6% | 24.1% / 21.8% | 16.6% | 0 / 0 | T?/M? | 85% |
| pez.clean.Swiffer 0.2.9 | pez.clean.Swiffer | 1 | 35 | 304 | 1.8% | 21.0% ± 8.9 | 12.3% | 23.7% / 24.9% | 11.0% | 0 / 0 | T?/M? | 87% |
| pez.mako.Mako 1.5 | pez.mako.Mako | 1 | 35 | 284 | 0.3% | 33.0% ± 36.6 | 7.7% | 21.5% / 21.0% | 3.7% | 0 / 0 | T?/M? | 99% |
| ph.micro.Pikeman 0.4.5 | ph.micro.Pikeman | 1 | 35 | 300 | 0.8% | 14.3% ± 7.6 | 9.3% | 28.7% / 27.2% | 9.5% | 0 / 0 | T?/M? | 92% |
| ph.mini.Archer 0.6.6 | ph.mini.Archer | 1 | 35 | 292 | 4.3% | 16.6% ± 8.4 | 11.1% | 30.0% / 23.9% | 9.0% | 0 / 0 | T?/M? | 92% |
| pkbots.BoyTDSurfer 1.0 | pkbots.BoyTDSurfer | 1 | 35 | 304 | 2.3% | 14.3% ± 5.7 | 10.6% | 26.4% / 30.8% | 11.5% | 0 / 0 | T?/M? | 91% |
| rcb.Vanessa03 0 | rcb.Vanessa03 | 1 | 35 | 280 | 1.8% | 16.4% ± 8.6 | 10.8% | 20.3% / 21.8% | 15.7% | 0 / 0 | T?/M? | 91% |
| rdt.AgentSmith.AgentSmith 0.5 | rdt.AgentSmith.AgentSmith | 1 | 35 | 332 | 1.4% | 11.4% ± 4.7 | 7.9% | 26.3% / 21.4% | 3.7% | 0 / 0 | T?/M? | 88% |
| robar.micro.Kirbyi 1.0 | robar.micro.Kirbyi | 1 | 35 | 304 | 4.3% | 10.7% ± 5.1 | 17.4% | 23.3% / 21.5% | 9.9% | 0 / 0 | T?/M? | 86% |
| rz.Aleph 0.34 | rz.Aleph | 1 | 35 | 266 | 1.1% | 12.3% ± 5.5 | 8.7% | 23.1% / 22.5% | 4.2% | 0 / 0 | T?/M? | 90% |
| simonton.beta.LifelongObsession 0.5.1 | simonton.beta.LifelongObsession | 1 | 35 | 360 | 3.2% | 11.5% ± 3.9 | 11.4% | 26.3% / 30.2% | 5.9% | 0 / 0 | T?/M? | 87% |
| simonton.micro.GFMicro 1.0 | simonton.micro.GFMicro | 1 | 35 | 320 | 3.0% | 18.1% ± 7.3 | 21.1% | 53.1% / 46.6% | 17.9% | 0 / 0 | T?/M? | 90% |
| simonton.mini.WeeksOnEnd 1.10.4 | simonton.mini.WeeksOnEnd | 1 | 35 | 334 | 2.3% | 13.3% ± 4.7 | 12.4% | 23.7% / 32.7% | 5.0% | 0 / 0 | T?/M? | 92% |
| simonton.nano.WeekendObsession_S 1.7 | simonton.nano.WeekendObsession_S | 1 | 35 | 360 | 2.1% | 21.2% ± 8.0 | 13.2% | 27.3% / 27.5% | 13.1% | 0 / 0 | T?/M? | 92% |
| spinnercat.CopyKat 1.2.3 | spinnercat.CopyKat | 1 | 35 | 308 | 0.6% | 7.7% ± 6.8 | 14.0% | 48.2% / 47.8% | 75.8% | 0 / 0 | T?/M? | 97% |
| starpkg.StarViewerZ 1.26 | starpkg.StarViewerZ | 1 | 35 | 310 | 0.6% | 8.7% ± 4.1 | 9.0% | 21.8% / 24.3% | 5.1% | 0 / 0 | T?/M? | 95% |
| stefw.Tigger 0.0.23 | stefw.Tigger | 1 | 35 | 286 | 1.6% | 12.5% ± 5.6 | 9.4% | 25.4% / 26.8% | 18.9% | 0 / 0 | T?/M? | 88% |
| stelo.Randomness 1.1 | stelo.Randomness | 1 | 35 | 296 | 2.6% | 14.7% ± 5.1 | 11.8% | 25.1% / 18.8% | 8.1% | 0 / 0 | T?/M? | 89% |
| stelo.SteloTestNano 1.0 | stelo.SteloTestNano | 1 | 35 | 308 | 2.7% | 14.5% ± 7.2 | 16.5% | 31.9% / 25.1% | 9.7% | 0 / 0 | T?/M? | 81% |
| suh.nano.RandomPM 1.02 | suh.nano.RandomPM | 1 | 35 | 302 | 2.3% | 18.2% ± 6.6 | 10.8% | 26.6% / 27.5% | 16.2% | 0 / 0 | T?/M? | 79% |
| syl.Centipede 0.5 | syl.Centipede | 1 | 35 | 284 | 1.0% | 31.5% ± 15.6 | 9.5% | 25.6% / 24.8% | 4.7% | 0 / 0 | T?/M? | 94% |
| theo.Tungsten 1.0a | theo.Tungsten | 1 | 35 | 286 | 1.5% | 14.9% ± 7.6 | 12.8% | 25.6% / 26.3% | 2.9% | 0 / 0 | T?/M? | 93% |
| theo.avenge.Pequod 1.0 | theo.avenge.Pequod | 1 | 35 | 304 | 1.7% | 12.5% ± 4.9 | 9.2% | 22.6% / 22.9% | 2.4% | 0 / 0 | T?/M? | 90% |
| theo.real.Ahab 1.0 | theo.real.Ahab | 1 | 35 | 288 | 3.5% | 11.6% ± 2.9 | 11.1% | 26.0% / 21.7% | 1.3% | 0 / 0 | T3/M? | 82% |
| tide.pear.Pear 0.62.1 | tide.pear.Pear | 1 | 35 | 294 | 7.8% | 11.9% ± 3.5 | 23.8% | 32.8% / 38.0% | 5.0% | 0 / 0 | T?/M? | 81% |
| trab.Crusader 0.1.7 | trab.Crusader | 1 | 35 | 288 | 4.9% | 9.7% ± 1.9 | 9.9% | 22.4% / 24.2% | 3.4% | 0 / 0 | T3/M1 | 72% |
| trm.Wrekt 1.1.6.f | trm.Wrekt | 1 | 35 | 276 | 0.4% | 14.6% ± 11.4 | 7.9% | 19.4% / 27.1% | 12.0% | 0 / 0 | T?/M? | 97% |
| tw.Exterminator 1.0 | tw.Exterminator | 1 | 35 | 292 | 0.1% | 9.3% ± 4.4 | 9.2% | 16.7% / 27.7% | 2.2% | 0 / 0 | T?/M? | 94% |
| tzu.TheArtOfWar 1.2 | tzu.TheArtOfWar | 1 | 35 | 292 | 1.0% | 9.9% ± 7.5 | 13.9% | 36.8% / 37.1% | 1.4% | 0 / 0 | T?/M? | 99% |
| vuen.Fractal 0.55 | vuen.Fractal | 1 | 35 | 282 | 0.5% | 6.7% ± 10.0 | 13.2% | 30.3% / 29.5% | 6.5% | 0 / 0 | T?/M? | 97% |
| wcsv.Engineer.Engineer 0.5.4 | wcsv.Engineer.Engineer | 1 | 35 | 324 | 6.4% | 8.1% ± 1.9 | 10.2% | 20.0% / 27.3% | 11.8% | 0 / 0 | T3/M2 | 70% |
| wiki.mini.BlackDestroyer 0.9.0 | wiki.mini.BlackDestroyer | 1 | 35 | 332 | 3.7% | 9.8% ± 4.4 | 10.0% | 25.3% / 19.0% | 7.9% | 0 / 0 | T?/M? | 90% |
| wiki.mini.Sedan 1.0 | wiki.mini.Sedan | 1 | 35 | 292 | 3.8% | 9.7% ± 6.1 | 9.6% | 21.5% / 24.7% | 6.0% | 0 / 0 | T?/M? | 88% |
| wilson.Chameleon 0.91 | wilson.Chameleon | 1 | 35 | 298 | 0.6% | 6.6% ± 5.0 | 9.4% | 23.5% / 21.1% | 13.9% | 0 / 0 | T?/M? | 96% |
| zen.Lindada 0.2 | zen.Lindada | 1 | 35 | 276 | 0.4% | 7.4% ± 6.5 | 8.9% | 26.1% / 22.8% | 11.5% | 0 / 0 | T?/M? | 98% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.10 vs hadur2.Hadur 3.9

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| AIR.iRobot 1.0 | 94.7% ± 3.0 | 82.0% ± 2.3 | +12.7 ± 2.9 |
| DM.mega.Bezier 1.618fprrr | 96.2% ± 1.3 | 74.9% ± 1.9 | +21.3 ± 3.0 |
| KiraNL.ChupaLite 0.4 | 93.2% ± 1.7 | 78.6% ± 2.3 | +14.6 ± 3.3 |
| Krabb.krabby.Krabby 1.18b | 94.3% ± 2.7 | 86.9% ± 4.3 | +7.5 ± 3.4 |
| ad.Quest 0.10 | 87.4% ± 5.7 | 79.3% ± 2.7 | +8.1 ± 6.5 |
| ags.micro.Carpet 1.1 | 87.8% ± 2.9 | 81.6% ± 1.9 | +6.2 ± 2.7 |
| ahf.r2d2.R2d2 0.86 | 89.2% ± 3.6 | 84.2% ± 2.5 | +5.0 ± 3.0 |
| amk.ChumbaWumba 0.3 | 87.4% ± 4.1 | 82.4% ± 3.2 | +5.0 ± 5.6 |
| apv.NanoLauLectrikTheCannibal 1.1 | 90.0% ± 3.0 | 86.7% ± 2.7 | +3.3 ± 4.2 |
| arthord.KostyaTszyu Beta2 | 88.3% ± 3.6 | 79.9% ± 3.9 | +8.4 ± 6.3 |
| ary.SMG 1.01 | 84.9% ± 5.7 | 70.4% ± 4.1 | +14.5 ± 7.3 |
| ary.mini.Nimi 1.0 | 94.8% ± 1.1 | 76.2% ± 2.8 | +18.6 ± 3.3 |
| brainfade.Fallen 0.63 | 93.2% ± 2.6 | 70.1% ± 3.8 | +23.1 ± 4.2 |
| bvh.frg.Friga 0.112dev | 96.9% ± 2.2 | 85.8% ± 0.8 | +11.1 ± 2.4 |
| bvh.mini.Freya 0.55 | 97.5% ± 1.4 | 83.0% ± 3.1 | +14.5 ± 3.3 |
| casey.Flee 1.0 | 89.4% ± 1.7 | 84.0% ± 2.6 | +5.4 ± 3.0 |
| cf.mini.Chiva 1.0 | 85.3% ± 1.5 | 81.1% ± 3.6 | +4.2 ± 4.3 |
| cf.proto.Shiva 2.2 | 91.7% ± 2.6 | 68.8% ± 4.4 | +22.9 ± 4.5 |
| davidalves.net.DuelistMicroMkII 1.1 | 88.7% ± 3.0 | 77.8% ± 3.4 | +10.9 ± 4.5 |
| davidalves.net.DuelistMini 1.1 | 88.2% ± 6.3 | 81.2% ± 3.0 | +7.0 ± 6.8 |
| dft.Cyanide 1.90 | 93.3% ± 3.3 | 66.8% ± 3.5 | +26.5 ± 5.1 |
| ds.OoV4 0.3b | 94.2% ± 2.2 | 91.5% ± 1.2 | +2.7 ± 2.6 |
| florent.small.LittleAngel 1.8 | 83.2% ± 4.1 | 78.3% ± 2.8 | +5.0 ± 3.5 |
| gh.GrubbmGrb 1.2.4 | 91.0% ± 10.7 | 82.3% ± 2.3 | +8.7 ± 9.7 |
| ins.MobyNano 0.8 | 87.1% ± 2.9 | 83.8% ± 2.2 | +3.3 ± 3.7 |
| jam.mini.Raiko 0.43 | 93.4% ± 2.4 | 70.6% ± 3.4 | +22.8 ± 3.9 |
| jcs.Decepticon 2.5.3 | 81.0% ± 4.1 | 76.5% ± 3.0 | +4.5 ± 5.4 |
| jekl.DarkHallow .90.9 | 84.9% ± 6.8 | 69.4% ± 4.1 | +15.6 ± 8.5 |
| jekl.Jekyl .70 | 93.3% ± 2.7 | 76.4% ± 4.1 | +16.9 ± 4.4 |
| jekl.mini.BlackPearl .91 | 95.2% ± 2.5 | 79.5% ± 2.3 | +15.6 ± 3.5 |
| kawigi.mini.Coriantumr 1.1 | 97.6% ± 1.3 | 89.8% ± 1.9 | +7.8 ± 2.8 |
| kawigi.mini.Fhqwhgads 1.1 | 90.1% ± 3.2 | 78.8% ± 1.2 | +11.3 ± 3.5 |
| kc.micro.Thorn 1.252 | 86.5% ± 5.5 | 74.7% ± 3.5 | +11.8 ± 7.6 |
| kid.Toa .0.5 | 92.0% ± 1.7 | 83.3% ± 2.3 | +8.7 ± 3.3 |
| kms.Golden 0.10 | 77.2% ± 5.2 | 72.3% ± 3.9 | +5.0 ± 5.5 |
| lrem.magic.TormentedAngel Antiquitie | 86.1% ± 5.0 | 83.0% ± 2.3 | +3.1 ± 3.6 |
| lucasslf.Dodger 1.0 | 88.3% ± 4.8 | 82.1% ± 3.2 | +6.2 ± 6.4 |
| lucasslf.HariSeldon 0.2.1 | 97.1% ± 1.5 | 81.4% ± 2.4 | +15.6 ± 2.4 |
| lucasslf.Wiggins 0.6 | 93.6% ± 2.1 | 76.0% ± 2.6 | +17.6 ± 2.9 |
| metal.small.MCool 1.21 | 94.8% ± 1.7 | 89.4% ± 2.5 | +5.4 ± 3.1 |
| metal.small.dna2.MCoolDNA 1.5 | 88.3% ± 2.7 | 76.0% ± 3.8 | +12.3 ± 4.3 |
| mk.Alpha 0.2.1 | 97.6% ± 1.5 | 88.2% ± 2.0 | +9.5 ± 2.5 |
| mladjo.Grrrrr 0.9 | 92.8% ± 1.7 | 69.3% ± 3.4 | +23.5 ± 3.5 |
| mnt.AHEB 0.6a | 85.3% ± 4.5 | 78.7% ± 2.0 | +6.6 ± 4.6 |
| myl.micro.NekoNinja 1.30 | 91.3% ± 4.7 | 87.8% ± 2.9 | +3.5 ± 4.7 |
| nat.Hikari dev0001 | 87.9% ± 1.9 | 81.1% ± 2.0 | +6.8 ± 1.8 |
| nat.nano.Ocnirp 1.73 | 82.8% ± 6.5 | 78.1% ± 2.9 | +4.7 ± 8.5 |
| nat.nano.OcnirpPM 1.0 | 84.2% ± 3.4 | 78.8% ± 2.1 | +5.4 ± 4.6 |
| pe.mini.SandboxMini 1.2 | 87.9% ± 2.8 | 82.1% ± 2.9 | +5.8 ± 4.8 |
| pez.clean.Swiffer 0.2.9 | 90.6% ± 4.6 | 69.1% ± 14.4 | +21.5 ± 14.5 |
| pez.mako.Mako 1.5 | 92.6% ± 5.0 | 79.1% ± 3.5 | +13.5 ± 2.4 |
| ph.micro.Pikeman 0.4.5 | 95.3% ± 2.4 | 74.3% ± 3.3 | +21.0 ± 3.8 |
| ph.mini.Archer 0.6.6 | 86.5% ± 4.8 | 70.8% ± 2.6 | +15.7 ± 5.5 |
| pkbots.BoyTDSurfer 1.0 | 89.7% ± 1.4 | 72.3% ± 3.0 | +17.4 ± 2.3 |
| rcb.Vanessa03 0 | 88.5% ± 4.8 | 82.7% ± 2.0 | +5.8 ± 5.9 |
| rdt.AgentSmith.AgentSmith 0.5 | 94.0% ± 3.0 | 69.9% ± 5.2 | +24.1 ± 5.6 |
| robar.micro.Kirbyi 1.0 | 83.7% ± 1.8 | 76.9% ± 3.3 | +6.7 ± 3.9 |
| rz.Aleph 0.34 | 90.0% ± 2.9 | 70.9% ± 3.8 | +19.1 ± 4.0 |
| simonton.beta.LifelongObsession 0.5.1 | 90.3% ± 3.4 | 60.3% ± 3.6 | +30.0 ± 6.5 |
| simonton.micro.GFMicro 1.0 | 91.5% ± 2.2 | 83.3% ± 2.9 | +8.2 ± 3.7 |
| simonton.mini.WeeksOnEnd 1.10.4 | 92.1% ± 2.0 | 62.9% ± 4.9 | +29.3 ± 5.7 |
| simonton.nano.WeekendObsession_S 1.7 | 88.7% ± 2.3 | 84.0% ± 2.7 | +4.7 ± 4.2 |
| spinnercat.CopyKat 1.2.3 | 88.2% ± 4.4 | 80.2% ± 1.6 | +8.0 ± 5.1 |
| starpkg.StarViewerZ 1.26 | 95.4% ± 2.3 | 91.8% ± 1.9 | +3.6 ± 3.2 |
| stefw.Tigger 0.0.23 | 87.7% ± 2.5 | 72.7% ± 2.8 | +15.0 ± 3.7 |
| stelo.Randomness 1.1 | 83.5% ± 4.0 | 82.9% ± 2.4 | +0.6 ± 5.8 |
| stelo.SteloTestNano 1.0 | 90.1% ± 3.7 | 86.9% ± 2.6 | +3.2 ± 4.0 |
| suh.nano.RandomPM 1.02 | 82.2% ± 5.5 | 77.2% ± 2.8 | +5.0 ± 6.6 |
| syl.Centipede 0.5 | 96.9% ± 1.8 | 86.2% ± 2.8 | +10.7 ± 3.0 |
| theo.Tungsten 1.0a | 86.6% ± 4.2 | 73.2% ± 2.6 | +13.4 ± 5.4 |
| theo.avenge.Pequod 1.0 | 87.1% ± 5.7 | 66.4% ± 3.8 | +20.7 ± 7.5 |
| theo.real.Ahab 1.0 | 87.1% ± 2.3 | 67.2% ± 4.4 | +19.9 ± 5.2 |
| tide.pear.Pear 0.62.1 | 85.1% ± 1.7 | 64.9% ± 4.1 | +20.2 ± 4.7 |
| trab.Crusader 0.1.7 | 72.4% ± 3.8 | 68.1% ± 3.9 | +4.3 ± 5.7 |
| trm.Wrekt 1.1.6.f | 86.8% ± 10.0 | 71.8% ± 4.3 | +15.0 ± 11.2 |
| tw.Exterminator 1.0 | 89.0% ± 6.6 | 76.8% ± 4.1 | +12.3 ± 7.0 |
| tzu.TheArtOfWar 1.2 | 96.9% ± 1.6 | 90.1% ± 0.7 | +6.8 ± 2.0 |
| vuen.Fractal 0.55 | 96.3% ± 1.3 | 83.6% ± 3.0 | +12.7 ± 3.7 |
| wcsv.Engineer.Engineer 0.5.4 | 77.4% ± 7.1 | 62.0% ± 3.4 | +15.4 ± 6.9 |
| wiki.mini.BlackDestroyer 0.9.0 | 88.5% ± 2.7 | 78.3% ± 3.2 | +10.2 ± 5.0 |
| wiki.mini.Sedan 1.0 | 93.0% ± 3.2 | 80.5% ± 3.9 | +12.5 ± 4.8 |
| wilson.Chameleon 0.91 | 97.5% ± 1.6 | 80.0% ± 1.8 | +17.5 ± 1.9 |
| zen.Lindada 0.2 | 95.5% ± 1.3 | 80.9% ± 3.5 | +14.7 ± 4.3 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| AIR.iRobot 1.0 | +12.7 ± 2.9 | +3.9 ± 2.2 | +3.9 ± 2.2 | -0.1 ± 11.0 |
| DM.mega.Bezier 1.618fprrr | +21.3 ± 3.0 | +10.0 ± 3.4 | +10.0 ± 3.4 | -13.0 ± 18.6 |
| KiraNL.ChupaLite 0.4 | +14.6 ± 3.3 | +6.8 ± 3.6 | +6.8 ± 3.6 | -11.1 ± 8.7 |
| Krabb.krabby.Krabby 1.18b | +7.5 ± 3.4 | +0.7 ± 1.1 | +0.7 ± 1.1 | -7.3 ± 9.4 |
| ad.Quest 0.10 | +8.1 ± 6.5 | +2.1 ± 3.1 | +2.1 ± 3.1 | -3.5 ± 5.7 |
| ags.micro.Carpet 1.1 | +6.2 ± 2.7 | +3.6 ± 1.7 | +3.6 ± 1.7 | -19.0 ± 4.9 |
| ahf.r2d2.R2d2 0.86 | +5.0 ± 3.0 | -0.7 ± 2.5 | -0.7 ± 2.5 | -7.4 ± 4.9 |
| amk.ChumbaWumba 0.3 | +5.0 ± 5.6 | +0.0 ± 3.8 | +0.0 ± 3.8 | -7.5 ± 6.7 |
| apv.NanoLauLectrikTheCannibal 1.1 | +3.3 ± 4.2 | -0.4 ± 4.1 | -0.4 ± 4.1 | +5.4 ± 4.4 |
| arthord.KostyaTszyu Beta2 | +8.4 ± 6.3 | +1.4 ± 4.9 | +1.4 ± 4.9 | -14.4 ± 7.1 |
| ary.SMG 1.01 | +14.5 ± 7.3 | +11.8 ± 7.2 | +11.8 ± 7.2 | -9.1 ± 1.8 |
| ary.mini.Nimi 1.0 | +18.6 ± 3.3 | +8.6 ± 3.1 | +8.6 ± 3.1 | +2.9 ± 6.7 |
| brainfade.Fallen 0.63 | +23.1 ± 4.2 | +16.1 ± 5.3 | +16.1 ± 5.3 | -7.0 ± 8.6 |
| bvh.frg.Friga 0.112dev | +11.1 ± 2.4 | +1.8 ± 2.2 | +1.8 ± 2.2 | +5.5 ± 10.0 |
| bvh.mini.Freya 0.55 | +14.5 ± 3.3 | +3.2 ± 2.7 | +3.2 ± 2.7 | +15.0 ± 5.5 |
| casey.Flee 1.0 | +5.4 ± 3.0 | +1.1 ± 1.2 | +1.1 ± 1.2 | -11.1 ± 6.0 |
| cf.mini.Chiva 1.0 | +4.2 ± 4.3 | +3.6 ± 5.7 | +3.6 ± 5.7 | +7.2 ± 3.3 |
| cf.proto.Shiva 2.2 | +22.9 ± 4.5 | +13.2 ± 5.5 | +13.2 ± 5.6 | +0.5 ± 7.2 |
| davidalves.net.DuelistMicroMkII 1.1 | +10.9 ± 4.5 | +3.9 ± 3.6 | +3.9 ± 3.6 | +3.8 ± 6.1 |
| davidalves.net.DuelistMini 1.1 | +7.0 ± 6.8 | +2.5 ± 3.5 | +2.5 ± 3.5 | +0.2 ± 9.9 |
| dft.Cyanide 1.90 | +26.5 ± 5.1 | +13.9 ± 4.7 | +13.9 ± 4.7 | +11.2 ± 10.3 |
| ds.OoV4 0.3b | +2.7 ± 2.6 | +0.7 ± 2.1 | +0.7 ± 2.1 | -23.0 ± 6.1 |
| florent.small.LittleAngel 1.8 | +5.0 ± 3.5 | +2.9 ± 4.6 | +2.9 ± 4.6 | -19.8 ± 2.6 |
| gh.GrubbmGrb 1.2.4 | +8.7 ± 9.7 | -0.4 ± 7.9 | -0.4 ± 7.9 | +14.1 ± 10.4 |
| ins.MobyNano 0.8 | +3.3 ± 3.7 | -0.4 ± 3.2 | -0.4 ± 3.2 | -13.5 ± 5.2 |
| jam.mini.Raiko 0.43 | +22.8 ± 3.9 | +11.4 ± 3.8 | +11.4 ± 3.8 | +6.4 ± 12.3 |
| jcs.Decepticon 2.5.3 | +4.5 ± 5.4 | +5.0 ± 5.1 | +5.0 ± 5.1 | -13.6 ± 6.2 |
| jekl.DarkHallow .90.9 | +15.6 ± 8.5 | +9.0 ± 5.6 | +8.9 ± 5.6 | -0.9 ± 5.8 |
| jekl.Jekyl .70 | +16.9 ± 4.4 | +9.6 ± 6.4 | +9.6 ± 6.4 | +5.1 ± 6.7 |
| jekl.mini.BlackPearl .91 | +15.6 ± 3.5 | +4.3 ± 3.6 | +4.3 ± 3.6 | +7.0 ± 5.9 |
| kawigi.mini.Coriantumr 1.1 | +7.8 ± 2.8 | +0.4 ± 1.5 | +0.4 ± 1.5 | +10.2 ± 6.1 |
| kawigi.mini.Fhqwhgads 1.1 | +11.3 ± 3.5 | +5.4 ± 3.0 | +5.4 ± 3.0 | -3.4 ± 7.3 |
| kc.micro.Thorn 1.252 | +11.8 ± 7.6 | +4.7 ± 5.9 | +4.6 ± 5.8 | -4.5 ± 12.7 |
| kid.Toa .0.5 | +8.7 ± 3.3 | +6.9 ± 3.9 | +6.8 ± 3.8 | +0.9 ± 3.5 |
| kms.Golden 0.10 | +5.0 ± 5.5 | +3.6 ± 5.7 | +3.6 ± 5.7 | -11.8 ± 7.0 |
| lrem.magic.TormentedAngel Antiquitie | +3.1 ± 3.6 | -0.7 ± 3.1 | -0.7 ± 3.1 | -27.5 ± 6.4 |
| lucasslf.Dodger 1.0 | +6.2 ± 6.4 | +1.4 ± 4.8 | +1.4 ± 4.8 | -26.6 ± 10.6 |
| lucasslf.HariSeldon 0.2.1 | +15.6 ± 2.4 | +3.6 ± 2.1 | +3.6 ± 2.1 | +13.4 ± 9.9 |
| lucasslf.Wiggins 0.6 | +17.6 ± 2.9 | +7.9 ± 3.1 | +7.9 ± 3.1 | +0.3 ± 13.1 |
| metal.small.MCool 1.21 | +5.4 ± 3.1 | -0.7 ± 1.7 | -0.7 ± 1.7 | -6.1 ± 8.6 |
| metal.small.dna2.MCoolDNA 1.5 | +12.3 ± 4.3 | +6.4 ± 5.1 | +6.4 ± 5.1 | -5.9 ± 4.6 |
| mk.Alpha 0.2.1 | +9.5 ± 2.5 | +2.9 ± 2.6 | +2.9 ± 2.6 | +1.7 ± 8.0 |
| mladjo.Grrrrr 0.9 | +23.5 ± 3.5 | +14.3 ± 4.6 | +14.3 ± 4.6 | -1.7 ± 8.3 |
| mnt.AHEB 0.6a | +6.6 ± 4.6 | +4.6 ± 3.8 | +4.6 ± 3.8 | -25.0 ± 7.9 |
| myl.micro.NekoNinja 1.30 | +3.5 ± 4.7 | -1.4 ± 2.9 | -1.4 ± 2.9 | -5.3 ± 9.3 |
| nat.Hikari dev0001 | +6.8 ± 1.8 | +3.9 ± 2.5 | +3.9 ± 2.5 | -20.2 ± 3.8 |
| nat.nano.Ocnirp 1.73 | +4.7 ± 8.5 | +0.7 ± 5.7 | +0.7 ± 5.7 | -13.2 ± 8.5 |
| nat.nano.OcnirpPM 1.0 | +5.4 ± 4.6 | +2.5 ± 3.5 | +2.5 ± 3.5 | -12.3 ± 8.2 |
| pe.mini.SandboxMini 1.2 | +5.8 ± 4.8 | +0.0 ± 3.4 | +0.0 ± 3.4 | -10.3 ± 5.6 |
| pez.clean.Swiffer 0.2.9 | +21.5 ± 14.5 | +16.4 ± 12.2 | +16.4 ± 12.2 | +8.3 ± 15.1 |
| pez.mako.Mako 1.5 | +13.5 ± 2.4 | +6.1 ± 2.7 | +6.1 ± 2.7 | +6.7 ± 8.8 |
| ph.micro.Pikeman 0.4.5 | +21.0 ± 3.8 | +7.1 ± 4.4 | +7.1 ± 4.4 | +7.3 ± 8.6 |
| ph.mini.Archer 0.6.6 | +15.7 ± 5.5 | +9.3 ± 5.1 | +9.3 ± 5.1 | -19.7 ± 12.4 |
| pkbots.BoyTDSurfer 1.0 | +17.4 ± 2.3 | +13.9 ± 3.9 | +13.9 ± 3.9 | -18.6 ± 3.4 |
| rcb.Vanessa03 0 | +5.8 ± 5.9 | -0.4 ± 3.7 | -0.4 ± 3.7 | -5.6 ± 7.1 |
| rdt.AgentSmith.AgentSmith 0.5 | +24.1 ± 5.6 | +13.2 ± 6.5 | +13.2 ± 6.5 | +7.9 ± 8.7 |
| robar.micro.Kirbyi 1.0 | +6.7 ± 3.9 | +5.7 ± 5.4 | +5.7 ± 5.4 | -12.4 ± 4.9 |
| rz.Aleph 0.34 | +19.1 ± 4.0 | +10.4 ± 4.0 | +10.4 ± 4.0 | -11.1 ± 7.1 |
| simonton.beta.LifelongObsession 0.5.1 | +30.0 ± 6.5 | +23.9 ± 5.4 | +23.9 ± 5.4 | +11.3 ± 8.0 |
| simonton.micro.GFMicro 1.0 | +8.2 ± 3.7 | +2.5 ± 3.7 | +2.5 ± 3.7 | +5.7 ± 5.1 |
| simonton.mini.WeeksOnEnd 1.10.4 | +29.3 ± 5.7 | +22.9 ± 7.0 | +22.9 ± 7.0 | +10.7 ± 7.5 |
| simonton.nano.WeekendObsession_S 1.7 | +4.7 ± 4.2 | +1.1 ± 2.8 | +1.1 ± 2.8 | -12.7 ± 6.3 |
| spinnercat.CopyKat 1.2.3 | +8.0 ± 5.1 | +0.4 ± 4.3 | +0.4 ± 4.3 | +1.8 ± 7.0 |
| starpkg.StarViewerZ 1.26 | +3.6 ± 3.2 | +1.1 ± 2.5 | +1.1 ± 2.5 | -18.3 ± 7.8 |
| stefw.Tigger 0.0.23 | +15.0 ± 3.7 | +9.3 ± 3.3 | +9.3 ± 3.3 | -14.9 ± 7.4 |
| stelo.Randomness 1.1 | +0.6 ± 5.8 | -2.5 ± 3.5 | -2.5 ± 3.5 | -12.4 ± 5.8 |
| stelo.SteloTestNano 1.0 | +3.2 ± 4.0 | -0.7 ± 3.1 | -0.7 ± 3.1 | -9.1 ± 4.5 |
| suh.nano.RandomPM 1.02 | +5.0 ± 6.6 | +2.5 ± 6.3 | +2.5 ± 6.3 | -20.7 ± 10.6 |
| syl.Centipede 0.5 | +10.7 ± 3.0 | +3.2 ± 2.0 | +3.2 ± 2.0 | +4.9 ± 9.8 |
| theo.Tungsten 1.0a | +13.4 ± 5.4 | +8.6 ± 4.8 | +8.6 ± 4.8 | +1.7 ± 6.9 |
| theo.avenge.Pequod 1.0 | +20.7 ± 7.5 | +16.1 ± 8.0 | +16.1 ± 8.0 | +2.6 ± 7.5 |
| theo.real.Ahab 1.0 | +19.9 ± 5.2 | +18.6 ± 7.2 | +18.6 ± 7.2 | -1.8 ± 2.2 |
| tide.pear.Pear 0.62.1 | +20.2 ± 4.7 | +15.7 ± 6.5 | +15.7 ± 6.5 | +24.7 ± 5.0 |
| trab.Crusader 0.1.7 | +4.3 ± 5.7 | +4.3 ± 5.6 | +4.3 ± 5.6 | -12.3 ± 4.3 |
| trm.Wrekt 1.1.6.f | +15.0 ± 11.2 | +8.9 ± 9.6 | +8.9 ± 9.6 | -2.5 ± 9.5 |
| tw.Exterminator 1.0 | +12.3 ± 7.0 | +23.6 ± 7.4 | +23.6 ± 7.4 | -10.5 ± 8.6 |
| tzu.TheArtOfWar 1.2 | +6.8 ± 2.0 | +0.0 ± 1.3 | +0.0 ± 1.3 | +4.2 ± 5.4 |
| vuen.Fractal 0.55 | +12.7 ± 3.7 | +4.3 ± 3.1 | +4.3 ± 3.1 | +16.6 ± 5.4 |
| wcsv.Engineer.Engineer 0.5.4 | +15.4 ± 6.9 | +14.3 ± 4.6 | +14.3 ± 4.6 | +5.7 ± 6.0 |
| wiki.mini.BlackDestroyer 0.9.0 | +10.2 ± 5.0 | +3.6 ± 4.7 | +3.6 ± 4.7 | -12.8 ± 6.7 |
| wiki.mini.Sedan 1.0 | +12.5 ± 4.8 | +2.9 ± 3.6 | +2.9 ± 3.6 | +1.5 ± 7.3 |
| wilson.Chameleon 0.91 | +17.5 ± 1.9 | +5.7 ± 3.1 | +5.7 ± 3.1 | +20.2 ± 9.8 |
| zen.Lindada 0.2 | +14.7 ± 4.3 | +5.7 ± 3.4 | +5.7 ± 3.4 | +7.2 ± 8.1 |
| All pairs | +11.7 ± 0.7 | +5.9 ± 0.6 | +5.9 ± 0.6 | -3.5 ± 1.1 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or, for a Hadur build, a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| AIR.iRobot 1.0 | 8 | 3 | +12.7 ± 2.9 | +14.8 ± 9.0 |
| DM.mega.Bezier 1.618fprrr | 8 | 5 | +21.3 ± 3.0 | +22.2 ± 3.0 |
| KiraNL.ChupaLite 0.4 | 8 | 8 | +14.6 ± 3.3 | +14.6 ± 3.3 |
| Krabb.krabby.Krabby 1.18b | 8 | 8 | +7.5 ± 3.4 | +7.5 ± 3.4 |
| ad.Quest 0.10 | 8 | 7 | +8.1 ± 6.5 | +8.2 ± 7.8 |
| ags.micro.Carpet 1.1 | 8 | 7 | +6.2 ± 2.7 | +6.8 ± 2.8 |
| ahf.r2d2.R2d2 0.86 | 8 | 7 | +5.0 ± 3.0 | +5.9 ± 2.4 |
| amk.ChumbaWumba 0.3 | 8 | 7 | +5.0 ± 5.6 | +4.8 ± 6.7 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 6 | +3.3 ± 4.2 | +4.0 ± 5.5 |
| arthord.KostyaTszyu Beta2 | 8 | 7 | +8.4 ± 6.3 | +7.4 ± 7.0 |
| ary.SMG 1.01 | 8 | 4 | +14.5 ± 7.3 | +10.8 ± 9.3 |
| ary.mini.Nimi 1.0 | 8 | 7 | +18.6 ± 3.3 | +18.5 ± 3.9 |
| brainfade.Fallen 0.63 | 8 | 7 | +23.1 ± 4.2 | +22.5 ± 4.7 |
| bvh.frg.Friga 0.112dev | 8 | 8 | +11.1 ± 2.4 | +11.1 ± 2.4 |
| bvh.mini.Freya 0.55 | 8 | 8 | +14.5 ± 3.3 | +14.5 ± 3.3 |
| casey.Flee 1.0 | 8 | 7 | +5.4 ± 3.0 | +5.3 ± 3.5 |
| cf.mini.Chiva 1.0 | 8 | 7 | +4.2 ± 4.3 | +2.9 ± 3.8 |
| cf.proto.Shiva 2.2 | 8 | 6 | +22.9 ± 4.5 | +23.6 ± 5.6 |
| davidalves.net.DuelistMicroMkII 1.1 | 8 | 7 | +10.9 ± 4.5 | +10.9 ± 5.4 |
| davidalves.net.DuelistMini 1.1 | 8 | 6 | +7.0 ± 6.8 | +6.9 ± 8.1 |
| dft.Cyanide 1.90 | 8 | 4 | +26.5 ± 5.1 | +28.6 ± 9.6 |
| ds.OoV4 0.3b | 8 | 8 | +2.7 ± 2.6 | +2.7 ± 2.6 |
| florent.small.LittleAngel 1.8 | 8 | 8 | +5.0 ± 3.5 | +5.0 ± 3.5 |
| gh.GrubbmGrb 1.2.4 | 8 | 8 | +8.7 ± 9.7 | +8.7 ± 9.7 |
| ins.MobyNano 0.8 | 8 | 8 | +3.3 ± 3.7 | +3.3 ± 3.7 |
| jam.mini.Raiko 0.43 | 8 | 8 | +22.8 ± 3.9 | +22.8 ± 3.9 |
| jcs.Decepticon 2.5.3 | 8 | 7 | +4.5 ± 5.4 | +4.1 ± 6.4 |
| jekl.DarkHallow .90.9 | 8 | 6 | +15.6 ± 8.5 | +16.3 ± 9.3 |
| jekl.Jekyl .70 | 8 | 7 | +16.9 ± 4.4 | +17.1 ± 5.2 |
| jekl.mini.BlackPearl .91 | 8 | 8 | +15.6 ± 3.5 | +15.6 ± 3.5 |
| kawigi.mini.Coriantumr 1.1 | 8 | 7 | +7.8 ± 2.8 | +7.5 ± 3.2 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 5 | +11.3 ± 3.5 | +11.3 ± 5.5 |
| kc.micro.Thorn 1.252 | 8 | 5 | +11.8 ± 7.6 | +9.2 ± 11.0 |
| kid.Toa .0.5 | 8 | 7 | +8.7 ± 3.3 | +8.2 ± 3.7 |
| kms.Golden 0.10 | 8 | 5 | +5.0 ± 5.5 | +5.3 ± 8.5 |
| lrem.magic.TormentedAngel Antiquitie | 8 | 5 | +3.1 ± 3.6 | +1.7 ± 6.2 |
| lucasslf.Dodger 1.0 | 8 | 7 | +6.2 ± 6.4 | +4.7 ± 6.3 |
| lucasslf.HariSeldon 0.2.1 | 8 | 8 | +15.6 ± 2.4 | +15.6 ± 2.4 |
| lucasslf.Wiggins 0.6 | 8 | 8 | +17.6 ± 2.9 | +17.6 ± 2.9 |
| metal.small.MCool 1.21 | 8 | 8 | +5.4 ± 3.1 | +5.4 ± 3.1 |
| metal.small.dna2.MCoolDNA 1.5 | 8 | 6 | +12.3 ± 4.3 | +11.9 ± 5.9 |
| mk.Alpha 0.2.1 | 8 | 7 | +9.5 ± 2.5 | +8.6 ± 2.0 |
| mladjo.Grrrrr 0.9 | 8 | 7 | +23.5 ± 3.5 | +23.4 ± 4.2 |
| mnt.AHEB 0.6a | 8 | 6 | +6.6 ± 4.6 | +5.4 ± 3.9 |
| myl.micro.NekoNinja 1.30 | 8 | 5 | +3.5 ± 4.7 | +1.8 ± 6.8 |
| nat.Hikari dev0001 | 8 | 7 | +6.8 ± 1.8 | +7.1 ± 2.0 |
| nat.nano.Ocnirp 1.73 | 8 | 7 | +4.7 ± 8.5 | +5.2 ± 10.1 |
| nat.nano.OcnirpPM 1.0 | 8 | 7 | +5.4 ± 4.6 | +5.6 ± 5.5 |
| pe.mini.SandboxMini 1.2 | 8 | 6 | +5.8 ± 4.8 | +5.4 ± 6.9 |
| pez.clean.Swiffer 0.2.9 | 8 | 4 | +21.5 ± 14.5 | +12.8 ± 29.0 |
| pez.mako.Mako 1.5 | 8 | 7 | +13.5 ± 2.4 | +14.3 ± 1.8 |
| ph.micro.Pikeman 0.4.5 | 8 | 6 | +21.0 ± 3.8 | +21.3 ± 5.6 |
| ph.mini.Archer 0.6.6 | 8 | 7 | +15.7 ± 5.5 | +14.6 ± 5.9 |
| pkbots.BoyTDSurfer 1.0 | 8 | 5 | +17.4 ± 2.3 | +17.0 ± 4.1 |
| rcb.Vanessa03 0 | 8 | 6 | +5.8 ± 5.9 | +7.8 ± 6.0 |
| rdt.AgentSmith.AgentSmith 0.5 | 8 | 4 | +24.1 ± 5.6 | +21.5 ± 10.9 |
| robar.micro.Kirbyi 1.0 | 8 | 7 | +6.7 ± 3.9 | +5.6 ± 3.4 |
| rz.Aleph 0.34 | 8 | 7 | +19.1 ± 4.0 | +18.9 ± 4.8 |
| simonton.beta.LifelongObsession 0.5.1 | 8 | 4 | +30.0 ± 6.5 | +31.0 ± 15.4 |
| simonton.micro.GFMicro 1.0 | 8 | 6 | +8.2 ± 3.7 | +8.5 ± 5.3 |
| simonton.mini.WeeksOnEnd 1.10.4 | 8 | 8 | +29.3 ± 5.7 | +29.3 ± 5.7 |
| simonton.nano.WeekendObsession_S 1.7 | 8 | 3 | +4.7 ± 4.2 | +6.7 ± 3.9 |
| spinnercat.CopyKat 1.2.3 | 8 | 7 | +8.0 ± 5.1 | +8.9 ± 5.6 |
| starpkg.StarViewerZ 1.26 | 8 | 8 | +3.6 ± 3.2 | +3.6 ± 3.2 |
| stefw.Tigger 0.0.23 | 8 | 6 | +15.0 ± 3.7 | +14.0 ± 4.8 |
| stelo.Randomness 1.1 | 8 | 7 | +0.6 ± 5.8 | +0.6 ± 7.0 |
| stelo.SteloTestNano 1.0 | 8 | 5 | +3.2 ± 4.0 | +5.4 ± 2.1 |
| suh.nano.RandomPM 1.02 | 8 | 3 | +5.0 ± 6.6 | +7.9 ± 20.0 |
| syl.Centipede 0.5 | 8 | 6 | +10.7 ± 3.0 | +10.2 ± 3.0 |
| theo.Tungsten 1.0a | 8 | 6 | +13.4 ± 5.4 | +13.4 ± 7.0 |
| theo.avenge.Pequod 1.0 | 8 | 5 | +20.7 ± 7.5 | +18.5 ± 11.9 |
| theo.real.Ahab 1.0 | 8 | 5 | +19.9 ± 5.2 | +17.0 ± 5.2 |
| tide.pear.Pear 0.62.1 | 8 | 6 | +20.2 ± 4.7 | +20.8 ± 6.9 |
| trab.Crusader 0.1.7 | 8 | 6 | +4.3 ± 5.7 | +4.7 ± 6.2 |
| trm.Wrekt 1.1.6.f | 8 | 7 | +15.0 ± 11.2 | +15.6 ± 13.2 |
| tw.Exterminator 1.0 | 8 | 5 | +12.3 ± 7.0 | +15.2 ± 11.3 |
| tzu.TheArtOfWar 1.2 | 8 | 7 | +6.8 ± 2.0 | +6.4 ± 2.2 |
| vuen.Fractal 0.55 | 8 | 7 | +12.7 ± 3.7 | +12.6 ± 4.4 |
| wcsv.Engineer.Engineer 0.5.4 | 8 | 4 | +15.4 ± 6.9 | +21.5 ± 4.9 |
| wiki.mini.BlackDestroyer 0.9.0 | 8 | 5 | +10.2 ± 5.0 | +6.5 ± 4.8 |
| wiki.mini.Sedan 1.0 | 8 | 8 | +12.5 ± 4.8 | +12.5 ± 4.8 |
| wilson.Chameleon 0.91 | 8 | 5 | +17.5 ± 1.9 | +17.3 ± 3.6 |
| zen.Lindada 0.2 | 8 | 8 | +14.7 ± 4.3 | +14.7 ± 4.3 |
| All pairs | 664 | 527 | +11.7 ± 0.7 | +11.4 ± 0.7 |

# Bench: hadur2.Hadur 3.10 baseline (hadur2.Hadur 3.9) (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 8888 over 664 battles (13.4 per battle, most in one battle 108). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | shield-310 | 82.0% ± 2.3 | 94.6% ± 2.4 | 66.0% ± 2.9 | 265 / 280 | 11.6% ± 1.0 | 7.9% ± 5.4 | 113 | 0 | 0.81 / 24.5 |
| DM.mega.Bezier 1.618fprrr | shield-310 | 74.9% ± 1.9 | 89.6% ± 3.1 | 58.6% ± 2.5 | 251 / 280 | 11.8% ± 1.6 | 7.3% ± 0.8 | 202 | 0 | 2.28 / 325.9 |
| KiraNL.ChupaLite 0.4 | shield-310 | 78.6% ± 2.3 | 92.5% ± 3.4 | 65.8% ± 2.3 | 259 / 280 | 16.5% ± 0.7 | 7.5% ± 0.7 | 129 | 0 | 1.01 / 163.5 |
| Krabb.krabby.Krabby 1.18b | shield-310 | 86.9% ± 4.3 | 98.6% ± 1.3 | 73.7% ± 8.8 | 276 / 280 | 21.1% ± 12.0 | 5.3% ± 0.6 | 87 | 0 | 0.76 / 14.4 |
| ad.Quest 0.10 | shield-310 | 79.3% ± 2.7 | 94.6% ± 2.0 | 63.3% ± 3.5 | 265 / 280 | 14.8% ± 1.0 | 5.5% ± 0.4 | 112 | 0 | 0.96 / 14.1 |
| ags.micro.Carpet 1.1 | shield-310 | 81.6% ± 1.9 | 94.3% ± 1.8 | 67.8% ± 3.0 | 264 / 280 | 12.9% ± 0.8 | 5.9% ± 0.7 | 88 | 0 | 1.19 / 14.9 |
| ahf.r2d2.R2d2 0.86 | shield-310 | 84.2% ± 2.5 | 98.2% ± 1.8 | 69.8% ± 3.4 | 275 / 280 | 16.1% ± 1.0 | 6.1% ± 0.6 | 85 | 0 | 0.80 / 49.3 |
| amk.ChumbaWumba 0.3 | shield-310 | 82.4% ± 3.2 | 97.1% ± 2.6 | 63.8% ± 3.3 | 272 / 280 | 12.6% ± 1.2 | 4.4% ± 0.7 | 94 | 0 | 0.87 / 22.7 |
| apv.NanoLauLectrikTheCannibal 1.1 | shield-310 | 86.7% ± 2.7 | 97.5% ± 3.2 | 75.8% ± 2.4 | 273 / 280 | 23.4% ± 1.3 | 6.7% ± 0.9 | 107 | 0 | 0.78 / 136.1 |
| arthord.KostyaTszyu Beta2 | shield-310 | 79.9% ± 3.9 | 95.7% ± 4.2 | 61.1% ± 3.3 | 268 / 280 | 11.5% ± 0.5 | 5.3% ± 0.5 | 110 | 0 | 0.91 / 69.9 |
| ary.SMG 1.01 | shield-310 | 70.4% ± 4.1 | 84.3% ± 5.7 | 57.6% ± 3.8 | 236 / 280 | 14.8% ± 1.8 | 8.1% ± 0.7 | 96 | 0 | 1.09 / 16.6 |
| ary.mini.Nimi 1.0 | shield-310 | 76.2% ± 2.8 | 91.4% ± 3.1 | 60.3% ± 3.0 | 256 / 280 | 12.4% ± 0.7 | 6.7% ± 0.4 | 88 | 0 | 0.95 / 12.9 |
| brainfade.Fallen 0.63 | shield-310 | 70.1% ± 3.8 | 83.2% ± 5.2 | 57.6% ± 2.8 | 233 / 280 | 15.5% ± 0.9 | 7.6% ± 0.5 | 108 | 0 | 0.99 / 185.8 |
| bvh.frg.Friga 0.112dev | shield-310 | 85.8% ± 0.8 | 97.5% ± 1.5 | 73.7% ± 1.4 | 273 / 280 | 17.3% ± 0.5 | 5.5% ± 0.4 | 105 | 0 | 0.90 / 14.7 |
| bvh.mini.Freya 0.55 | shield-310 | 83.0% ± 3.1 | 96.4% ± 2.5 | 68.5% ± 4.0 | 270 / 280 | 14.9% ± 0.8 | 4.9% ± 0.5 | 126 | 0 | 0.91 / 71.3 |
| casey.Flee 1.0 | shield-310 | 84.0% ± 2.6 | 97.5% ± 1.5 | 68.1% ± 3.8 | 273 / 280 | 14.4% ± 1.3 | 5.1% ± 0.6 | 97 | 0 | 0.92 / 139.1 |
| cf.mini.Chiva 1.0 | shield-310 | 81.1% ± 3.6 | 93.2% ± 4.4 | 69.2% ± 2.9 | 261 / 280 | 16.7% ± 0.8 | 6.6% ± 1.1 | 99 | 0 | 0.89 / 17.6 |
| cf.proto.Shiva 2.2 | shield-310 | 68.8% ± 4.4 | 84.3% ± 5.4 | 52.2% ± 4.2 | 236 / 280 | 11.4% ± 0.6 | 6.6% ± 0.6 | 111 | 0 | 0.99 / 15.4 |
| davidalves.net.DuelistMicroMkII 1.1 | shield-310 | 77.8% ± 3.4 | 92.9% ± 3.4 | 62.6% ± 3.7 | 260 / 280 | 14.3% ± 0.9 | 6.5% ± 0.6 | 106 | 0 | 0.92 / 278.2 |
| davidalves.net.DuelistMini 1.1 | shield-310 | 81.2% ± 3.0 | 96.1% ± 3.4 | 64.1% ± 2.4 | 269 / 280 | 12.9% ± 0.6 | 4.9% ± 0.4 | 109 | 0 | 0.90 / 118.7 |
| dft.Cyanide 1.90 | shield-310 | 66.8% ± 3.5 | 84.6% ± 4.0 | 47.9% ± 3.7 | 237 / 280 | 10.7% ± 0.5 | 7.3% ± 0.4 | 102 | 0 | 1.02 / 12.9 |
| ds.OoV4 0.3b | shield-310 | 91.5% ± 1.2 | 98.9% ± 1.8 | 84.4% ± 1.1 | 277 / 280 | 16.9% ± 1.1 | 6.5% ± 0.5 | 120 | 0 | 1.02 / 16.4 |
| florent.small.LittleAngel 1.8 | shield-310 | 78.3% ± 2.8 | 92.9% ± 3.6 | 60.8% ± 4.1 | 260 / 280 | 11.4% ± 0.4 | 5.4% ± 0.4 | 101 | 0 | 0.96 / 33.0 |
| gh.GrubbmGrb 1.2.4 | shield-310 | 82.3% ± 2.3 | 95.4% ± 2.2 | 68.6% ± 3.3 | 267 / 280 | 14.8% ± 1.5 | 6.6% ± 0.2 | 131 | 0 | 1.00 / 135.5 |
| ins.MobyNano 0.8 | shield-310 | 83.8% ± 2.2 | 97.9% ± 2.1 | 67.3% ± 2.7 | 274 / 280 | 15.4% ± 1.7 | 5.7% ± 0.5 | 89 | 0 | 0.88 / 105.3 |
| jam.mini.Raiko 0.43 | shield-310 | 70.6% ± 3.4 | 87.1% ± 3.8 | 52.3% ± 3.0 | 244 / 280 | 11.2% ± 0.4 | 6.3% ± 0.6 | 99 | 0 | 0.97 / 118.5 |
| jcs.Decepticon 2.5.3 | shield-310 | 76.5% ± 3.0 | 91.1% ± 3.7 | 60.2% ± 2.9 | 255 / 280 | 11.4% ± 0.5 | 6.1% ± 0.4 | 89 | 0 | 1.22 / 63.6 |
| jekl.DarkHallow .90.9 | shield-310 | 69.4% ± 4.1 | 85.7% ± 4.0 | 52.7% ± 4.3 | 240 / 280 | 11.2% ± 0.5 | 6.7% ± 0.7 | 90 | 0 | 1.06 / 209.2 |
| jekl.Jekyl .70 | shield-310 | 76.4% ± 4.1 | 88.9% ± 6.6 | 63.2% ± 2.3 | 249 / 280 | 14.9% ± 1.2 | 6.6% ± 0.7 | 110 | 0 | 0.94 / 168.0 |
| jekl.mini.BlackPearl .91 | shield-310 | 79.5% ± 2.3 | 95.0% ± 3.3 | 63.4% ± 1.8 | 266 / 280 | 13.3% ± 0.4 | 6.3% ± 0.3 | 103 | 0 | 0.93 / 32.0 |
| kawigi.mini.Coriantumr 1.1 | shield-310 | 89.8% ± 1.9 | 99.3% ± 1.1 | 78.9% ± 2.9 | 278 / 280 | 15.0% ± 0.8 | 3.9% ± 0.7 | 87 | 0 | 0.81 / 15.7 |
| kawigi.mini.Fhqwhgads 1.1 | shield-310 | 78.8% ± 1.2 | 92.5% ± 2.5 | 64.2% ± 1.5 | 259 / 280 | 14.7% ± 1.1 | 5.4% ± 0.3 | 109 | 0 | 0.88 / 15.2 |
| kc.micro.Thorn 1.252 | shield-310 | 74.7% ± 3.5 | 90.7% ± 4.2 | 58.1% ± 3.2 | 254 / 280 | 13.1% ± 0.5 | 6.6% ± 0.5 | 235 | 0 | 0.92 / 270.8 |
| kid.Toa .0.5 | shield-310 | 83.3% ± 2.3 | 91.7% ± 2.8 | 75.1% ± 2.3 | 257 / 280 | 15.3% ± 0.4 | 5.8% ± 0.8 | 81 | 0 | 1.00 / 79.0 |
| kms.Golden 0.10 | shield-310 | 72.3% ± 3.9 | 85.7% ± 4.4 | 59.4% ± 3.4 | 240 / 280 | 15.3% ± 1.0 | 7.8% ± 1.5 | 92 | 0 | 0.93 / 16.6 |
| lrem.magic.TormentedAngel Antiquitie | shield-310 | 83.0% ± 2.3 | 97.1% ± 1.8 | 68.1% ± 2.6 | 272 / 280 | 14.9% ± 0.3 | 6.0% ± 0.5 | 117 | 0 | 0.95 / 62.0 |
| lucasslf.Dodger 1.0 | shield-310 | 82.1% ± 3.2 | 96.1% ± 3.4 | 67.5% ± 3.0 | 269 / 280 | 13.9% ± 0.5 | 6.3% ± 0.6 | 79 | 0 | 0.92 / 24.5 |
| lucasslf.HariSeldon 0.2.1 | shield-310 | 81.4% ± 2.4 | 96.4% ± 2.1 | 65.6% ± 2.2 | 270 / 280 | 12.6% ± 0.5 | 6.5% ± 0.6 | 86 | 0 | 1.57 / 24.6 |
| lucasslf.Wiggins 0.6 | shield-310 | 76.0% ± 2.6 | 91.8% ± 3.2 | 59.8% ± 2.1 | 257 / 280 | 12.0% ± 0.6 | 6.9% ± 0.3 | 133 | 0 | 1.11 / 14.5 |
| metal.small.MCool 1.21 | shield-310 | 89.4% ± 2.5 | 99.3% ± 1.7 | 75.7% ± 3.4 | 278 / 280 | 13.2% ± 0.7 | 3.4% ± 0.5 | 86 | 0 | 0.82 / 42.4 |
| metal.small.dna2.MCoolDNA 1.5 | shield-310 | 76.0% ± 3.8 | 90.4% ± 4.9 | 62.7% ± 2.9 | 253 / 280 | 15.3% ± 0.7 | 7.6% ± 0.6 | 118 | 0 | 0.96 / 38.3 |
| mk.Alpha 0.2.1 | shield-310 | 88.2% ± 2.0 | 97.1% ± 2.6 | 79.3% ± 2.3 | 272 / 280 | 18.6% ± 0.4 | 5.8% ± 0.6 | 86 | 0 | 0.93 / 93.8 |
| mladjo.Grrrrr 0.9 | shield-310 | 69.3% ± 3.4 | 84.6% ± 4.4 | 54.3% ± 2.4 | 237 / 280 | 12.7% ± 1.2 | 10.2% ± 6.5 | 97 | 0 | 0.97 / 117.3 |
| mnt.AHEB 0.6a | shield-310 | 78.7% ± 2.0 | 89.6% ± 2.8 | 68.0% ± 2.1 | 251 / 280 | 17.5% ± 0.9 | 7.0% ± 0.5 | 87 | 0 | 0.91 / 15.2 |
| myl.micro.NekoNinja 1.30 | shield-310 | 87.8% ± 2.9 | 98.9% ± 1.2 | 75.1% ± 4.6 | 277 / 280 | 14.0% ± 0.4 | 5.0% ± 1.5 | 101 | 0 | 0.93 / 18.1 |
| nat.Hikari dev0001 | shield-310 | 81.1% ± 2.0 | 95.0% ± 2.5 | 67.7% ± 2.1 | 266 / 280 | 15.5% ± 0.5 | 6.9% ± 0.6 | 101 | 0 | 0.93 / 18.6 |
| nat.nano.Ocnirp 1.73 | shield-310 | 78.1% ± 2.9 | 94.6% ± 2.4 | 59.4% ± 3.8 | 265 / 280 | 14.0% ± 1.1 | 6.6% ± 1.0 | 97 | 0 | 0.92 / 220.0 |
| nat.nano.OcnirpPM 1.0 | shield-310 | 78.8% ± 2.1 | 93.9% ± 2.7 | 61.5% ± 1.9 | 263 / 280 | 13.8% ± 0.8 | 6.0% ± 0.6 | 111 | 0 | 0.95 / 197.6 |
| pe.mini.SandboxMini 1.2 | shield-310 | 82.1% ± 2.9 | 96.8% ± 2.7 | 67.2% ± 3.0 | 271 / 280 | 17.1% ± 0.5 | 5.9% ± 0.7 | 93 | 0 | 0.86 / 256.8 |
| pez.clean.Swiffer 0.2.9 | shield-310 | 69.1% ± 14.4 | 80.4% ± 12.0 | 59.9% ± 16.2 | 225 / 280 | 21.3% ± 6.6 | 8.6% ± 0.8 | 95 | 0 | 0.88 / 307.9 |
| pez.mako.Mako 1.5 | shield-310 | 79.1% ± 3.5 | 93.2% ± 3.6 | 61.9% ± 4.0 | 261 / 280 | 11.9% ± 0.6 | 4.6% ± 0.5 | 114 | 0 | 0.96 / 281.3 |
| ph.micro.Pikeman 0.4.5 | shield-310 | 74.3% ± 3.3 | 91.8% ± 3.9 | 54.6% ± 4.6 | 257 / 280 | 11.2% ± 0.9 | 6.3% ± 0.2 | 110 | 0 | 0.98 / 31.2 |
| ph.mini.Archer 0.6.6 | shield-310 | 70.8% ± 2.6 | 86.4% ± 4.7 | 55.0% ± 1.6 | 242 / 280 | 12.1% ± 0.7 | 7.2% ± 0.3 | 106 | 0 | 1.00 / 15.1 |
| pkbots.BoyTDSurfer 1.0 | shield-310 | 72.3% ± 3.0 | 85.4% ± 4.1 | 60.3% ± 2.0 | 239 / 280 | 14.3% ± 0.9 | 8.2% ± 0.7 | 115 | 0 | 1.02 / 18.8 |
| rcb.Vanessa03 0 | shield-310 | 82.7% ± 2.0 | 96.8% ± 2.7 | 68.2% ± 1.3 | 271 / 280 | 16.7% ± 0.4 | 5.7% ± 0.3 | 98 | 0 | 0.86 / 38.3 |
| rdt.AgentSmith.AgentSmith 0.5 | shield-310 | 69.9% ± 5.2 | 85.7% ± 6.8 | 53.1% ± 5.2 | 240 / 280 | 11.5% ± 0.6 | 6.6% ± 0.4 | 109 | 0 | 1.42 / 183.9 |
| robar.micro.Kirbyi 1.0 | shield-310 | 76.9% ± 3.3 | 89.3% ± 4.7 | 66.1% ± 2.7 | 250 / 280 | 19.6% ± 0.9 | 8.5% ± 0.6 | 108 | 0 | 0.99 / 15.4 |
| rz.Aleph 0.34 | shield-310 | 70.9% ± 3.8 | 87.5% ± 4.8 | 54.2% ± 2.8 | 245 / 280 | 11.7% ± 0.8 | 7.2% ± 0.5 | 111 | 0 | 1.04 / 204.4 |
| simonton.beta.LifelongObsession 0.5.1 | shield-310 | 60.3% ± 3.6 | 73.9% ± 4.3 | 46.1% ± 3.4 | 207 / 280 | 10.3% ± 0.6 | 8.9% ± 0.5 | 157 | 0 | 1.27 / 67.1 |
| simonton.micro.GFMicro 1.0 | shield-310 | 83.3% ± 2.9 | 95.7% ± 3.8 | 69.8% ± 2.3 | 268 / 280 | 15.5% ± 0.8 | 6.0% ± 0.4 | 108 | 0 | 1.05 / 76.8 |
| simonton.mini.WeeksOnEnd 1.10.4 | shield-310 | 62.9% ± 4.9 | 76.8% ± 6.9 | 48.5% ± 3.9 | 215 / 280 | 10.5% ± 0.7 | 8.7% ± 0.6 | 143 | 0 | 1.36 / 374.0 |
| simonton.nano.WeekendObsession_S 1.7 | shield-310 | 84.0% ± 2.7 | 96.1% ± 2.2 | 71.4% ± 3.2 | 269 / 280 | 22.7% ± 1.0 | 5.9% ± 0.6 | 81 | 0 | 0.82 / 13.1 |
| spinnercat.CopyKat 1.2.3 | shield-310 | 80.2% ± 1.6 | 94.3% ± 1.8 | 65.9% ± 2.5 | 264 / 280 | 20.2% ± 1.3 | 7.9% ± 0.8 | 89 | 0 | 0.88 / 236.7 |
| starpkg.StarViewerZ 1.26 | shield-310 | 91.8% ± 1.9 | 98.2% ± 1.8 | 85.0% ± 2.4 | 275 / 280 | 16.4% ± 0.7 | 4.2% ± 0.8 | 98 | 0 | 0.88 / 106.7 |
| stefw.Tigger 0.0.23 | shield-310 | 72.7% ± 2.8 | 88.6% ± 2.9 | 56.2% ± 3.1 | 248 / 280 | 12.2% ± 0.6 | 6.5% ± 0.7 | 90 | 0 | 1.05 / 35.1 |
| stelo.Randomness 1.1 | shield-310 | 82.9% ± 2.4 | 96.8% ± 2.0 | 68.9% ± 3.4 | 271 / 280 | 16.5% ± 1.3 | 6.4% ± 0.7 | 115 | 0 | 0.95 / 82.9 |
| stelo.SteloTestNano 1.0 | shield-310 | 86.9% ± 2.6 | 97.9% ± 2.1 | 75.6% ± 2.8 | 274 / 280 | 19.8% ± 0.8 | 5.1% ± 0.8 | 93 | 0 | 0.74 / 479.5 |
| suh.nano.RandomPM 1.02 | shield-310 | 77.2% ± 2.8 | 91.8% ± 3.0 | 62.2% ± 3.2 | 257 / 280 | 15.1% ± 0.8 | 7.3% ± 0.6 | 166 | 0 | 1.02 / 197.1 |
| syl.Centipede 0.5 | shield-310 | 86.2% ± 2.8 | 96.4% ± 2.1 | 73.6% ± 3.7 | 270 / 280 | 14.8% ± 0.5 | 3.7% ± 0.7 | 93 | 0 | 0.88 / 241.0 |
| theo.Tungsten 1.0a | shield-310 | 73.2% ± 2.6 | 88.2% ± 3.7 | 56.8% ± 2.3 | 247 / 280 | 11.1% ± 0.4 | 8.7% ± 6.1 | 103 | 0 | 1.05 / 43.7 |
| theo.avenge.Pequod 1.0 | shield-310 | 66.4% ± 3.8 | 80.7% ± 5.1 | 50.5% ± 3.7 | 226 / 280 | 10.7% ± 0.8 | 6.3% ± 0.6 | 93 | 0 | 1.39 / 18.7 |
| theo.real.Ahab 1.0 | shield-310 | 67.2% ± 4.4 | 81.1% ± 7.0 | 52.1% ± 2.9 | 227 / 280 | 10.7% ± 0.3 | 6.9% ± 0.5 | 94 | 0 | 1.56 / 23.2 |
| tide.pear.Pear 0.62.1 | shield-310 | 64.9% ± 4.1 | 80.7% ± 4.9 | 48.0% ± 4.4 | 226 / 280 | 10.9% ± 0.7 | 7.0% ± 0.7 | 97 | 0 | 1.06 / 16.3 |
| trab.Crusader 0.1.7 | shield-310 | 68.1% ± 3.9 | 85.0% ± 4.2 | 51.5% ± 3.4 | 238 / 280 | 11.7% ± 0.7 | 7.6% ± 0.7 | 120 | 0 | 1.37 / 24.6 |
| trm.Wrekt 1.1.6.f | shield-310 | 71.8% ± 4.3 | 85.7% ± 5.9 | 58.0% ± 2.5 | 240 / 280 | 12.4% ± 0.3 | 7.2% ± 0.4 | 91 | 0 | 1.45 / 14.3 |
| tw.Exterminator 1.0 | shield-310 | 76.8% ± 4.1 | 68.6% ± 6.8 | 81.6% ± 2.5 | 192 / 280 | 16.1% ± 0.9 | 9.7% ± 0.3 | 235 | 0 | 1.21 / 98.0 |
| tzu.TheArtOfWar 1.2 | shield-310 | 90.1% ± 0.7 | 99.6% ± 0.8 | 81.9% ± 1.0 | 279 / 280 | 25.2% ± 1.5 | 8.1% ± 0.4 | 100 | 0 | 0.81 / 257.6 |
| vuen.Fractal 0.55 | shield-310 | 83.6% ± 3.0 | 95.4% ± 3.1 | 71.6% ± 3.4 | 267 / 280 | 17.8% ± 1.4 | 5.0% ± 0.4 | 76 | 0 | 0.89 / 21.6 |
| wcsv.Engineer.Engineer 0.5.4 | shield-310 | 62.0% ± 3.4 | 77.9% ± 3.3 | 45.6% ± 3.6 | 218 / 280 | 10.2% ± 0.4 | 8.0% ± 0.7 | 91 | 0 | 1.08 / 38.9 |
| wiki.mini.BlackDestroyer 0.9.0 | shield-310 | 78.3% ± 3.2 | 93.2% ± 4.4 | 62.0% ± 2.9 | 261 / 280 | 12.1% ± 0.5 | 6.0% ± 0.5 | 97 | 0 | 0.95 / 331.2 |
| wiki.mini.Sedan 1.0 | shield-310 | 80.5% ± 3.9 | 95.0% ± 3.1 | 63.7% ± 4.1 | 266 / 280 | 13.3% ± 1.1 | 4.9% ± 0.6 | 95 | 0 | 0.97 / 62.9 |
| wilson.Chameleon 0.91 | shield-310 | 80.0% ± 1.8 | 94.3% ± 3.1 | 65.1% ± 2.0 | 264 / 280 | 14.3% ± 1.0 | 6.0% ± 0.6 | 107 | 0 | 1.28 / 47.5 |
| zen.Lindada 0.2 | shield-310 | 80.9% ± 3.5 | 94.3% ± 3.4 | 65.9% ± 3.6 | 264 / 280 | 13.7% ± 1.2 | 4.9% ± 0.5 | 88 | 0 | 0.89 / 15.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | 8 | 754 | 12.4% | 82.5% | 0.0% | 5.0% | 746 |
| DM.mega.Bezier 1.618fprrr | 8 | 1128 | 16.1% | 78.0% | 0.0% | 6.0% | 1141 |
| KiraNL.ChupaLite 0.4 | 8 | 1097 | 12.0% | 82.7% | 0.0% | 5.3% | 632 |
| Krabb.krabby.Krabby 1.18b | 8 | 601 | 4.2% | 94.2% | 0.0% | 1.7% | 575 |
| ad.Quest 0.10 | 8 | 964 | 9.7% | 85.8% | 0.0% | 4.5% | 704 |
| ags.micro.Carpet 1.1 | 8 | 853 | 11.7% | 83.4% | 0.0% | 4.9% | 859 |
| ahf.r2d2.R2d2 0.86 | 8 | 760 | 4.1% | 94.3% | 0.1% | 1.5% | 652 |
| amk.ChumbaWumba 0.3 | 8 | 741 | 6.8% | 90.0% | 0.0% | 3.2% | 596 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 666 | 6.6% | 90.5% | 0.0% | 2.9% | 464 |
| arthord.KostyaTszyu Beta2 | 8 | 866 | 8.7% | 88.0% | 0.0% | 3.3% | 725 |
| ary.SMG 1.01 | 8 | 1480 | 18.6% | 72.6% | 0.7% | 8.1% | 840 |
| ary.mini.Nimi 1.0 | 8 | 1099 | 13.6% | 80.5% | 0.1% | 5.7% | 913 |
| brainfade.Fallen 0.63 | 8 | 1463 | 20.1% | 71.5% | 0.0% | 8.4% | 747 |
| bvh.frg.Friga 0.112dev | 8 | 682 | 6.4% | 91.0% | 0.0% | 2.6% | 579 |
| bvh.mini.Freya 0.55 | 8 | 782 | 8.0% | 88.3% | 0.0% | 3.7% | 621 |
| casey.Flee 1.0 | 8 | 698 | 6.3% | 90.9% | 0.0% | 2.9% | 586 |
| cf.mini.Chiva 1.0 | 8 | 923 | 12.9% | 81.4% | 0.4% | 5.3% | 646 |
| cf.proto.Shiva 2.2 | 8 | 1393 | 19.7% | 72.5% | 0.0% | 7.7% | 860 |
| davidalves.net.DuelistMicroMkII 1.1 | 8 | 1054 | 11.9% | 82.8% | 0.1% | 5.3% | 684 |
| davidalves.net.DuelistMini 1.1 | 8 | 833 | 8.3% | 87.9% | 0.0% | 3.9% | 655 |
| dft.Cyanide 1.90 | 8 | 1481 | 18.1% | 74.6% | 0.0% | 7.2% | 863 |
| ds.OoV4 0.3b | 8 | 449 | 4.2% | 94.7% | 0.0% | 1.2% | 766 |
| florent.small.LittleAngel 1.8 | 8 | 935 | 13.4% | 81.5% | 0.0% | 5.1% | 851 |
| gh.GrubbmGrb 1.2.4 | 8 | 837 | 9.7% | 86.3% | 0.0% | 3.9% | 817 |
| ins.MobyNano 0.8 | 8 | 713 | 5.3% | 92.2% | 0.0% | 2.5% | 544 |
| jam.mini.Raiko 0.43 | 8 | 1302 | 17.3% | 75.7% | 0.0% | 7.0% | 859 |
| jcs.Decepticon 2.5.3 | 8 | 1051 | 14.9% | 79.1% | 0.0% | 6.1% | 847 |
| jekl.DarkHallow .90.9 | 8 | 1380 | 18.1% | 74.3% | 0.0% | 7.6% | 961 |
| jekl.Jekyl .70 | 8 | 1110 | 17.5% | 74.9% | 0.4% | 7.2% | 741 |
| jekl.mini.BlackPearl .91 | 8 | 955 | 9.2% | 86.8% | 0.0% | 4.1% | 717 |
| kawigi.mini.Coriantumr 1.1 | 8 | 467 | 2.7% | 96.1% | 0.0% | 1.2% | 650 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 965 | 13.6% | 80.0% | 0.0% | 6.4% | 600 |
| kc.micro.Thorn 1.252 | 8 | 1168 | 13.9% | 80.4% | 0.0% | 5.7% | 818 |
| kid.Toa .0.5 | 8 | 836 | 17.2% | 76.9% | 0.0% | 5.9% | 1069 |
| kms.Golden 0.10 | 8 | 1350 | 18.5% | 73.7% | 0.0% | 7.8% | 665 |
| lrem.magic.TormentedAngel Antiquitie | 8 | 803 | 6.2% | 91.2% | 0.0% | 2.6% | 657 |
| lucasslf.Dodger 1.0 | 8 | 844 | 8.1% | 88.4% | 0.0% | 3.4% | 814 |
| lucasslf.HariSeldon 0.2.1 | 8 | 871 | 7.2% | 89.7% | 0.0% | 3.1% | 879 |
| lucasslf.Wiggins 0.6 | 8 | 1118 | 12.9% | 81.6% | 0.0% | 5.6% | 964 |
| metal.small.MCool 1.21 | 8 | 435 | 2.9% | 95.7% | 0.0% | 1.4% | 589 |
| metal.small.dna2.MCoolDNA 1.5 | 8 | 1214 | 13.9% | 79.9% | 0.0% | 6.2% | 714 |
| mk.Alpha 0.2.1 | 8 | 601 | 8.3% | 88.6% | 0.0% | 3.1% | 587 |
| mladjo.Grrrrr 0.9 | 8 | 1459 | 18.4% | 73.3% | 0.0% | 8.3% | 779 |
| mnt.AHEB 0.6a | 8 | 1066 | 17.0% | 76.1% | 0.0% | 6.9% | 638 |
| myl.micro.NekoNinja 1.30 | 8 | 553 | 3.4% | 94.9% | 0.0% | 1.7% | 715 |
| nat.Hikari dev0001 | 8 | 938 | 9.3% | 86.8% | 0.0% | 3.8% | 658 |
| nat.nano.Ocnirp 1.73 | 8 | 964 | 9.7% | 85.8% | 0.0% | 4.5% | 600 |
| nat.nano.OcnirpPM 1.0 | 8 | 928 | 11.4% | 83.4% | 0.0% | 5.1% | 582 |
| pe.mini.SandboxMini 1.2 | 8 | 859 | 6.6% | 90.4% | 0.0% | 3.0% | 557 |
| pez.clean.Swiffer 0.2.9 | 8 | 1624 | 21.2% | 67.9% | 0.0% | 10.9% | 677 |
| pez.mako.Mako 1.5 | 8 | 883 | 13.5% | 80.4% | 0.0% | 6.1% | 645 |
| ph.micro.Pikeman 0.4.5 | 8 | 1124 | 12.8% | 81.9% | 0.0% | 5.3% | 793 |
| ph.mini.Archer 0.6.6 | 8 | 1366 | 17.4% | 75.2% | 0.0% | 7.4% | 842 |
| pkbots.BoyTDSurfer 1.0 | 8 | 1404 | 18.3% | 73.8% | 0.0% | 8.0% | 781 |
| rcb.Vanessa03 0 | 8 | 821 | 6.8% | 90.1% | 0.0% | 3.1% | 547 |
| rdt.AgentSmith.AgentSmith 0.5 | 8 | 1364 | 18.3% | 73.9% | 0.0% | 7.7% | 833 |
| robar.micro.Kirbyi 1.0 | 8 | 1229 | 15.3% | 78.0% | 0.0% | 6.7% | 563 |
| rz.Aleph 0.34 | 8 | 1350 | 16.2% | 76.6% | 0.0% | 7.2% | 817 |
| simonton.beta.LifelongObsession 0.5.1 | 8 | 1773 | 25.7% | 64.5% | 0.0% | 9.7% | 1236 |
| simonton.micro.GFMicro 1.0 | 8 | 774 | 9.7% | 86.4% | 0.0% | 3.9% | 862 |
| simonton.mini.WeeksOnEnd 1.10.4 | 8 | 1679 | 24.2% | 66.8% | 0.0% | 9.0% | 1191 |
| simonton.nano.WeekendObsession_S 1.7 | 8 | 761 | 9.0% | 86.9% | 0.0% | 4.1% | 500 |
| spinnercat.CopyKat 1.2.3 | 8 | 962 | 10.4% | 85.0% | 0.0% | 4.6% | 522 |
| starpkg.StarViewerZ 1.26 | 8 | 407 | 7.7% | 89.5% | 0.0% | 2.8% | 745 |
| stefw.Tigger 0.0.23 | 8 | 1254 | 16.0% | 77.2% | 0.0% | 6.8% | 766 |
| stelo.Randomness 1.1 | 8 | 820 | 6.9% | 90.0% | 0.0% | 3.2% | 716 |
| stelo.SteloTestNano 1.0 | 8 | 636 | 5.9% | 91.3% | 0.0% | 2.8% | 487 |
| suh.nano.RandomPM 1.02 | 8 | 1068 | 13.5% | 80.5% | 0.0% | 6.0% | 634 |
| syl.Centipede 0.5 | 8 | 592 | 10.6% | 84.5% | 0.0% | 4.9% | 571 |
| theo.Tungsten 1.0a | 8 | 1189 | 17.3% | 75.5% | 0.0% | 7.2% | 826 |
| theo.avenge.Pequod 1.0 | 8 | 1461 | 23.1% | 67.9% | 0.0% | 9.0% | 971 |
| theo.real.Ahab 1.0 | 8 | 1449 | 22.9% | 68.6% | 0.0% | 8.6% | 976 |
| tide.pear.Pear 0.62.1 | 8 | 1556 | 21.7% | 69.5% | 0.0% | 8.8% | 920 |
| trab.Crusader 0.1.7 | 8 | 1496 | 17.6% | 75.0% | 0.0% | 7.4% | 914 |
| trm.Wrekt 1.1.6.f | 8 | 1345 | 18.6% | 73.6% | 0.0% | 7.8% | 846 |
| tw.Exterminator 1.0 | 8 | 1204 | 45.7% | 41.3% | 0.1% | 13.0% | 1629 |
| tzu.TheArtOfWar 1.2 | 8 | 552 | 1.1% | 98.5% | 0.0% | 0.4% | 466 |
| vuen.Fractal 0.55 | 8 | 782 | 10.4% | 84.8% | 0.0% | 4.8% | 566 |
| wcsv.Engineer.Engineer 0.5.4 | 8 | 1704 | 22.7% | 68.0% | 0.0% | 9.2% | 882 |
| wiki.mini.BlackDestroyer 0.9.0 | 8 | 989 | 12.0% | 83.1% | 0.0% | 4.9% | 795 |
| wiki.mini.Sedan 1.0 | 8 | 854 | 10.2% | 84.9% | 0.0% | 4.8% | 619 |
| wilson.Chameleon 0.91 | 8 | 934 | 10.7% | 84.7% | 0.0% | 4.6% | 734 |
| zen.Lindada 0.2 | 8 | 856 | 11.7% | 82.7% | 0.0% | 5.6% | 634 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | 8 | 6 | 834 | 0 | 0.40 | 0 | 0 | 0 |
| DM.mega.Bezier 1.618fprrr | 8 | 5 | 596 | 0 | 0.72 | 2 | 2 | 0 |
| KiraNL.ChupaLite 0.4 | 8 | 8 | 0 | 0 | 0.46 | 0 | 0 | 0 |
| Krabb.krabby.Krabby 1.18b | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 8 |
| ad.Quest 0.10 | 8 | 7 | 298 | 0 | 0.40 | 0 | 0 | 0 |
| ags.micro.Carpet 1.1 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| ahf.r2d2.R2d2 0.86 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| amk.ChumbaWumba 0.3 | 8 | 7 | 298 | 0 | 0.34 | 0 | 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 6 | 596 | 0 | 0.38 | 0 | 0 | 0 |
| arthord.KostyaTszyu Beta2 | 8 | 7 | 596 | 0 | 0.39 | 0 | 0 | 0 |
| ary.SMG 1.01 | 8 | 4 | 0 | 0 | 0.34 | 5 | 4 | 0 |
| ary.mini.Nimi 1.0 | 8 | 7 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| brainfade.Fallen 0.63 | 8 | 7 | 0 | 0 | 0.39 | 1 | 1 | 0 |
| bvh.frg.Friga 0.112dev | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| bvh.mini.Freya 0.55 | 8 | 8 | 0 | 0 | 0.45 | 0 | 0 | 0 |
| casey.Flee 1.0 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| cf.mini.Chiva 1.0 | 8 | 7 | 0 | 0 | 0.35 | 1 | 1 | 0 |
| cf.proto.Shiva 2.2 | 8 | 7 | 0 | 0 | 0.40 | 1 | 1 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| davidalves.net.DuelistMini 1.1 | 8 | 6 | 596 | 0 | 0.39 | 0 | 0 | 0 |
| dft.Cyanide 1.90 | 8 | 6 | 298 | 0 | 0.36 | 1 | 1 | 0 |
| ds.OoV4 0.3b | 8 | 8 | 0 | 0 | 0.43 | 0 | 0 | 0 |
| florent.small.LittleAngel 1.8 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 8 | 8 | 0 | 0 | 0.47 | 0 | 0 | 0 |
| ins.MobyNano 0.8 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| jam.mini.Raiko 0.43 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| jcs.Decepticon 2.5.3 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| jekl.DarkHallow .90.9 | 8 | 6 | 298 | 0 | 0.32 | 2 | 2 | 0 |
| jekl.Jekyl .70 | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| jekl.mini.BlackPearl .91 | 8 | 8 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 7 | 298 | 0 | 0.39 | 0 | 0 | 0 |
| kc.micro.Thorn 1.252 | 8 | 5 | 0 | 2 | 0.84 | 3 | 2 | 0 |
| kid.Toa .0.5 | 8 | 7 | 0 | 0 | 0.29 | 1 | 1 | 0 |
| kms.Golden 0.10 | 8 | 6 | 286 | 0 | 0.33 | 1 | 1 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 8 | 6 | 596 | 0 | 0.42 | 0 | 0 | 0 |
| lucasslf.Dodger 1.0 | 8 | 7 | 0 | 0 | 0.28 | 1 | 1 | 0 |
| lucasslf.HariSeldon 0.2.1 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| lucasslf.Wiggins 0.6 | 8 | 8 | 0 | 0 | 0.48 | 0 | 0 | 0 |
| metal.small.MCool 1.21 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 8 | 6 | 596 | 0 | 0.42 | 0 | 0 | 0 |
| mk.Alpha 0.2.1 | 8 | 7 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| mladjo.Grrrrr 0.9 | 8 | 7 | 286 | 0 | 0.35 | 0 | 0 | 0 |
| mnt.AHEB 0.6a | 8 | 7 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| myl.micro.NekoNinja 1.30 | 8 | 5 | 1035 | 0 | 0.36 | 1 | 1 | 0 |
| nat.Hikari dev0001 | 8 | 7 | 0 | 0 | 0.36 | 1 | 1 | 0 |
| nat.nano.Ocnirp 1.73 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 8 | 7 | 298 | 0 | 0.40 | 0 | 0 | 0 |
| pe.mini.SandboxMini 1.2 | 8 | 6 | 596 | 0 | 0.33 | 0 | 0 | 0 |
| pez.clean.Swiffer 0.2.9 | 8 | 4 | 298 | 0 | 0.34 | 4 | 4 | 0 |
| pez.mako.Mako 1.5 | 8 | 8 | 0 | 0 | 0.41 | 0 | 0 | 0 |
| ph.micro.Pikeman 0.4.5 | 8 | 6 | 596 | 0 | 0.39 | 0 | 0 | 0 |
| ph.mini.Archer 0.6.6 | 8 | 7 | 0 | 0 | 0.38 | 1 | 1 | 0 |
| pkbots.BoyTDSurfer 1.0 | 8 | 5 | 279 | 0 | 0.41 | 2 | 2 | 0 |
| rcb.Vanessa03 0 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 8 | 6 | 0 | 0 | 0.39 | 2 | 2 | 0 |
| robar.micro.Kirbyi 1.0 | 8 | 7 | 298 | 0 | 0.39 | 0 | 0 | 0 |
| rz.Aleph 0.34 | 8 | 7 | 0 | 0 | 0.40 | 1 | 1 | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 8 | 4 | 0 | 0 | 0.56 | 4 | 4 | 0 |
| simonton.micro.GFMicro 1.0 | 8 | 7 | 298 | 0 | 0.39 | 0 | 0 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 8 | 8 | 0 | 0 | 0.51 | 0 | 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 8 | 5 | 596 | 0 | 0.29 | 1 | 1 | 0 |
| spinnercat.CopyKat 1.2.3 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| stefw.Tigger 0.0.23 | 8 | 7 | 0 | 0 | 0.32 | 1 | 1 | 0 |
| stelo.Randomness 1.1 | 8 | 8 | 0 | 0 | 0.41 | 0 | 0 | 0 |
| stelo.SteloTestNano 1.0 | 8 | 7 | 512 | 0 | 0.33 | 0 | 0 | 0 |
| suh.nano.RandomPM 1.02 | 8 | 4 | 894 | 1 | 0.59 | 1 | 1 | 0 |
| syl.Centipede 0.5 | 8 | 6 | 298 | 0 | 0.33 | 1 | 1 | 0 |
| theo.Tungsten 1.0a | 8 | 6 | 855 | 0 | 0.37 | 1 | 1 | 0 |
| theo.avenge.Pequod 1.0 | 8 | 5 | 0 | 0 | 0.33 | 3 | 3 | 0 |
| theo.real.Ahab 1.0 | 8 | 5 | 0 | 0 | 0.34 | 3 | 3 | 0 |
| tide.pear.Pear 0.62.1 | 8 | 6 | 0 | 0 | 0.35 | 2 | 2 | 0 |
| trab.Crusader 0.1.7 | 8 | 6 | 0 | 0 | 0.43 | 2 | 2 | 0 |
| trm.Wrekt 1.1.6.f | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| tw.Exterminator 1.0 | 8 | 6 | 0 | 0 | 0.84 | 2 | 2 | 0 |
| tzu.TheArtOfWar 1.2 | 8 | 7 | 204 | 0 | 0.36 | 0 | 0 | 0 |
| vuen.Fractal 0.55 | 8 | 7 | 0 | 0 | 0.27 | 1 | 1 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 8 | 5 | 0 | 0 | 0.33 | 3 | 3 | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 8 | 6 | 298 | 0 | 0.35 | 1 | 1 | 0 |
| wiki.mini.Sedan 1.0 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| wilson.Chameleon 0.91 | 8 | 5 | 894 | 0 | 0.38 | 0 | 0 | 0 |
| zen.Lindada 0.2 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |

561 of 664 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | 11218 | 18 | 11161 | 11161 (99.5%) | 57 (0.5%) | 0 (0.0%) | 288 | 98 | 29 |
| DM.mega.Bezier 1.618fprrr | 20357 | 16 | 20323 | 20316 (99.8%) | 41 (0.2%) | 7 (0.0%) | 1333 | 177 | 143 |
| KiraNL.ChupaLite 0.4 | 9017 | 21 | 9017 | 9017 (100.0%) | 0 (0.0%) | 0 (0.0%) | 249 | 152 | 73 |
| Krabb.krabby.Krabby 1.18b | 7367 | 18 | 7369 | 7354 (99.8%) | 13 (0.2%) | 15 (0.2%) | 271 | 126 | 20 |
| ad.Quest 0.10 | 9737 | 42 | 9721 | 9719 (99.8%) | 18 (0.2%) | 2 (0.0%) | 550 | 96 | 42 |
| ags.micro.Carpet 1.1 | 14187 | 81 | 14186 | 14186 (100.0%) | 1 (0.0%) | 0 (0.0%) | 546 | 170 | 22 |
| ahf.r2d2.R2d2 0.86 | 8973 | 16 | 8990 | 8973 (100.0%) | 0 (0.0%) | 17 (0.2%) | 307 | 158 | 25 |
| amk.ChumbaWumba 0.3 | 7233 | 13 | 7214 | 7213 (99.7%) | 20 (0.3%) | 1 (0.0%) | 127 | 89 | 29 |
| apv.NanoLauLectrikTheCannibal 1.1 | 5123 | 30 | 5095 | 5085 (99.3%) | 38 (0.7%) | 10 (0.2%) | 742 | 115 | 22 |
| arthord.KostyaTszyu Beta2 | 8971 | 9 | 8964 | 8930 (99.5%) | 41 (0.5%) | 34 (0.4%) | 408 | 87 | 38 |
| ary.SMG 1.01 | 13878 | 18 | 13876 | 13875 (100.0%) | 3 (0.0%) | 1 (0.0%) | 701 | 196 | 64 |
| ary.mini.Nimi 1.0 | 14475 | 14 | 14480 | 14475 (100.0%) | 0 (0.0%) | 5 (0.0%) | 830 | 145 | 35 |
| brainfade.Fallen 0.63 | 10662 | 8 | 10661 | 10660 (100.0%) | 2 (0.0%) | 1 (0.0%) | 925 | 151 | 62 |
| bvh.frg.Friga 0.112dev | 7256 | 9 | 7256 | 7256 (100.0%) | 0 (0.0%) | 0 (0.0%) | 149 | 100 | 27 |
| bvh.mini.Freya 0.55 | 6955 | 70 | 6965 | 6945 (99.9%) | 10 (0.1%) | 20 (0.3%) | 182 | 95 | 55 |
| casey.Flee 1.0 | 7279 | 14 | 7335 | 7229 (99.3%) | 50 (0.7%) | 106 (1.4%) | 942 | 128 | 35 |
| cf.mini.Chiva 1.0 | 8289 | 12 | 8292 | 8288 (100.0%) | 1 (0.0%) | 4 (0.0%) | 312 | 124 | 58 |
| cf.proto.Shiva 2.2 | 12095 | 5 | 12110 | 12095 (100.0%) | 0 (0.0%) | 15 (0.1%) | 729 | 120 | 53 |
| davidalves.net.DuelistMicroMkII 1.1 | 8106 | 11 | 8177 | 8106 (100.0%) | 0 (0.0%) | 71 (0.9%) | 458 | 110 | 45 |
| davidalves.net.DuelistMini 1.1 | 7857 | 9 | 7817 | 7809 (99.4%) | 48 (0.6%) | 8 (0.1%) | 250 | 101 | 251 |
| dft.Cyanide 1.90 | 13678 | 524 | 13633 | 13633 (99.7%) | 45 (0.3%) | 0 (0.0%) | 699 | 115 | 47 |
| ds.OoV4 0.3b | 13159 | 45 | 13161 | 13157 (100.0%) | 2 (0.0%) | 4 (0.0%) | 356 | 206 | 66 |
| florent.small.LittleAngel 1.8 | 11471 | 7 | 11481 | 11468 (100.0%) | 3 (0.0%) | 13 (0.1%) | 714 | 118 | 42 |
| gh.GrubbmGrb 1.2.4 | 13509 | 23 | 13508 | 13507 (100.0%) | 2 (0.0%) | 1 (0.0%) | 630 | 139 | 78 |
| ins.MobyNano 0.8 | 6583 | 39 | 6605 | 6571 (99.8%) | 12 (0.2%) | 34 (0.5%) | 1291 | 152 | 27 |
| jam.mini.Raiko 0.43 | 12730 | 7 | 12731 | 12730 (100.0%) | 0 (0.0%) | 1 (0.0%) | 750 | 118 | 37 |
| jcs.Decepticon 2.5.3 | 12532 | 87 | 12533 | 12531 (100.0%) | 1 (0.0%) | 2 (0.0%) | 540 | 88 | 25 |
| jekl.DarkHallow .90.9 | 12667 | 12 | 12953 | 12648 (99.9%) | 19 (0.1%) | 305 (2.4%) | 960 | 132 | 37 |
| jekl.Jekyl .70 | 10581 | 22 | 10581 | 10581 (100.0%) | 0 (0.0%) | 0 (0.0%) | 701 | 123 | 38 |
| jekl.mini.BlackPearl .91 | 10611 | 15 | 10611 | 10609 (100.0%) | 2 (0.0%) | 2 (0.0%) | 282 | 89 | 44 |
| kawigi.mini.Coriantumr 1.1 | 7142 | 4 | 7143 | 7142 (100.0%) | 0 (0.0%) | 1 (0.0%) | 230 | 107 | 26 |
| kawigi.mini.Fhqwhgads 1.1 | 7680 | 41 | 7662 | 7662 (99.8%) | 18 (0.2%) | 0 (0.0%) | 210 | 116 | 31 |
| kc.micro.Thorn 1.252 | 10607 | 8 | 10663 | 10607 (100.0%) | 0 (0.0%) | 56 (0.5%) | 637 | 103 | 40 |
| kid.Toa .0.5 | 8676 | 2 | 12258 | 8676 (100.0%) | 0 (0.0%) | 3582 (29.2%) | 1629 | 105 | 26 |
| kms.Golden 0.10 | 9384 | 19 | 9365 | 9364 (99.8%) | 20 (0.2%) | 1 (0.0%) | 397 | 115 | 33 |
| lrem.magic.TormentedAngel Antiquitie | 9502 | 18 | 9460 | 9460 (99.6%) | 42 (0.4%) | 0 (0.0%) | 209 | 133 | 57 |
| lucasslf.Dodger 1.0 | 13604 | 72 | 13604 | 13604 (100.0%) | 0 (0.0%) | 0 (0.0%) | 577 | 158 | 30 |
| lucasslf.HariSeldon 0.2.1 | 15027 | 65 | 15025 | 15025 (100.0%) | 2 (0.0%) | 0 (0.0%) | 607 | 156 | 25 |
| lucasslf.Wiggins 0.6 | 16977 | 96 | 16970 | 16969 (100.0%) | 8 (0.0%) | 1 (0.0%) | 863 | 151 | 123 |
| metal.small.MCool 1.21 | 7014 | 39 | 7014 | 7014 (100.0%) | 0 (0.0%) | 0 (0.0%) | 70 | 78 | 24 |
| metal.small.dna2.MCoolDNA 1.5 | 9248 | 8 | 9219 | 9206 (99.5%) | 42 (0.5%) | 13 (0.1%) | 516 | 147 | 57 |
| mk.Alpha 0.2.1 | 7603 | 23 | 7603 | 7602 (100.0%) | 1 (0.0%) | 1 (0.0%) | 227 | 117 | 29 |
| mladjo.Grrrrr 0.9 | 12028 | 16 | 12009 | 12007 (99.8%) | 21 (0.2%) | 2 (0.0%) | 486 | 123 | 45 |
| mnt.AHEB 0.6a | 9073 | 21 | 9075 | 9069 (100.0%) | 4 (0.0%) | 6 (0.1%) | 553 | 140 | 27 |
| myl.micro.NekoNinja 1.30 | 9610 | 8 | 9580 | 9555 (99.4%) | 55 (0.6%) | 25 (0.3%) | 345 | 123 | 40 |
| nat.Hikari dev0001 | 9582 | 14 | 9583 | 9581 (100.0%) | 1 (0.0%) | 2 (0.0%) | 240 | 141 | 57 |
| nat.nano.Ocnirp 1.73 | 7627 | 17 | 7627 | 7581 (99.4%) | 46 (0.6%) | 46 (0.6%) | 1398 | 174 | 41 |
| nat.nano.OcnirpPM 1.0 | 7296 | 19 | 7288 | 7247 (99.3%) | 49 (0.7%) | 41 (0.6%) | 1331 | 157 | 33 |
| pe.mini.SandboxMini 1.2 | 6169 | 10 | 6139 | 6133 (99.4%) | 36 (0.6%) | 6 (0.1%) | 174 | 123 | 30 |
| pez.clean.Swiffer 0.2.9 | 8857 | 6 | 9366 | 8838 (99.8%) | 19 (0.2%) | 528 (5.6%) | 153 | 133 | 48 |
| pez.mako.Mako 1.5 | 8471 | 22 | 8472 | 8469 (100.0%) | 2 (0.0%) | 3 (0.0%) | 269 | 118 | 41 |
| ph.micro.Pikeman 0.4.5 | 12158 | 11 | 12117 | 12117 (99.7%) | 41 (0.3%) | 0 (0.0%) | 483 | 118 | 43 |
| ph.mini.Archer 0.6.6 | 13672 | 84 | 13672 | 13672 (100.0%) | 0 (0.0%) | 0 (0.0%) | 580 | 139 | 61 |
| pkbots.BoyTDSurfer 1.0 | 12686 | 67 | 12667 | 12667 (99.9%) | 19 (0.1%) | 0 (0.0%) | 562 | 190 | 59 |
| rcb.Vanessa03 0 | 6317 | 10 | 6299 | 6299 (99.7%) | 18 (0.3%) | 0 (0.0%) | 73 | 107 | 28 |
| rdt.AgentSmith.AgentSmith 0.5 | 12242 | 9 | 12240 | 12240 (100.0%) | 2 (0.0%) | 0 (0.0%) | 605 | 128 | 51 |
| robar.micro.Kirbyi 1.0 | 7278 | 30 | 7304 | 7252 (99.6%) | 26 (0.4%) | 52 (0.7%) | 427 | 154 | 48 |
| rz.Aleph 0.34 | 11780 | 9 | 11780 | 11780 (100.0%) | 0 (0.0%) | 0 (0.0%) | 590 | 124 | 57 |
| simonton.beta.LifelongObsession 0.5.1 | 23058 | 745 | 23013 | 23013 (99.8%) | 45 (0.2%) | 0 (0.0%) | 1649 | 207 | 170 |
| simonton.micro.GFMicro 1.0 | 14563 | 87 | 14543 | 14542 (99.9%) | 21 (0.1%) | 1 (0.0%) | 598 | 183 | 40 |
| simonton.mini.WeeksOnEnd 1.10.4 | 22209 | 111 | 22209 | 22205 (100.0%) | 4 (0.0%) | 4 (0.0%) | 1628 | 178 | 100 |
| simonton.nano.WeekendObsession_S 1.7 | 5786 | 31 | 5760 | 5748 (99.3%) | 38 (0.7%) | 12 (0.2%) | 903 | 143 | 23 |
| spinnercat.CopyKat 1.2.3 | 6278 | 15 | 6289 | 6259 (99.7%) | 19 (0.3%) | 30 (0.5%) | 1315 | 170 | 31 |
| starpkg.StarViewerZ 1.26 | 12261 | 68 | 12261 | 12261 (100.0%) | 0 (0.0%) | 0 (0.0%) | 332 | 159 | 30 |
| stefw.Tigger 0.0.23 | 11142 | 6 | 11143 | 11142 (100.0%) | 0 (0.0%) | 1 (0.0%) | 564 | 111 | 27 |
| stelo.Randomness 1.1 | 10985 | 28 | 10986 | 10985 (100.0%) | 0 (0.0%) | 1 (0.0%) | 493 | 133 | 42 |
| stelo.SteloTestNano 1.0 | 5409 | 15 | 5380 | 5380 (99.5%) | 29 (0.5%) | 0 (0.0%) | 119 | 95 | 25 |
| suh.nano.RandomPM 1.02 | 8867 | 22 | 8824 | 8781 (99.0%) | 86 (1.0%) | 43 (0.5%) | 1229 | 200 | 32 |
| syl.Centipede 0.5 | 6564 | 14 | 6527 | 6527 (99.4%) | 37 (0.6%) | 0 (0.0%) | 95 | 66 | 29 |
| theo.Tungsten 1.0a | 11069 | 5 | 11022 | 11011 (99.5%) | 58 (0.5%) | 11 (0.1%) | 536 | 129 | 50 |
| theo.avenge.Pequod 1.0 | 10992 | 10 | 11049 | 10991 (100.0%) | 1 (0.0%) | 58 (0.5%) | 1071 | 89 | 45 |
| theo.real.Ahab 1.0 | 14185 | 10 | 14203 | 14184 (100.0%) | 1 (0.0%) | 19 (0.1%) | 988 | 108 | 54 |
| tide.pear.Pear 0.62.1 | 12746 | 398 | 12745 | 12717 (99.8%) | 29 (0.2%) | 28 (0.2%) | 913 | 135 | 50 |
| trab.Crusader 0.1.7 | 14728 | 22 | 14728 | 14728 (100.0%) | 0 (0.0%) | 0 (0.0%) | 818 | 185 | 66 |
| trm.Wrekt 1.1.6.f | 11697 | 10 | 11701 | 11697 (100.0%) | 0 (0.0%) | 4 (0.0%) | 594 | 155 | 40 |
| tw.Exterminator 1.0 | 35790 | 35 | 35798 | 35788 (100.0%) | 2 (0.0%) | 10 (0.0%) | 3213 | 425 | 213 |
| tzu.TheArtOfWar 1.2 | 4961 | 15 | 4945 | 4945 (99.7%) | 16 (0.3%) | 0 (0.0%) | 27 | 81 | 36 |
| vuen.Fractal 0.55 | 5721 | 6 | 5752 | 5706 (99.7%) | 15 (0.3%) | 46 (0.8%) | 413 | 97 | 26 |
| wcsv.Engineer.Engineer 0.5.4 | 14192 | 88 | 14191 | 14191 (100.0%) | 1 (0.0%) | 0 (0.0%) | 767 | 135 | 44 |
| wiki.mini.BlackDestroyer 0.9.0 | 12438 | 74 | 12419 | 12418 (99.8%) | 20 (0.2%) | 1 (0.0%) | 407 | 114 | 57 |
| wiki.mini.Sedan 1.0 | 8067 | 36 | 8068 | 8066 (100.0%) | 1 (0.0%) | 2 (0.0%) | 236 | 91 | 35 |
| wilson.Chameleon 0.91 | 10655 | 21 | 10606 | 10605 (99.5%) | 50 (0.5%) | 1 (0.0%) | 510 | 128 | 54 |
| zen.Lindada 0.2 | 8217 | 18 | 8218 | 8217 (100.0%) | 0 (0.0%) | 1 (0.0%) | 220 | 95 | 30 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| AIR.iRobot 1.0 | 11989 | 957 (8.0%) | 8327 |
| DM.mega.Bezier 1.618fprrr | 22028 | 2026 (9.2%) | 21424 |
| KiraNL.ChupaLite 0.4 | 9285 | 640 (6.9%) | 3466 |
| Krabb.krabby.Krabby 1.18b | 8097 | 584 (7.2%) | 1838 |
| ad.Quest 0.10 | 11240 | 1050 (9.3%) | 8820 |
| ags.micro.Carpet 1.1 | 14690 | 1297 (8.8%) | 12620 |
| ahf.r2d2.R2d2 0.86 | 9616 | 1122 (11.7%) | 8524 |
| amk.ChumbaWumba 0.3 | 8637 | 556 (6.4%) | 2884 |
| apv.NanoLauLectrikTheCannibal 1.1 | 5450 | 527 (9.7%) | 3864 |
| arthord.KostyaTszyu Beta2 | 11672 | 722 (6.2%) | 7794 |
| ary.SMG 1.01 | 14229 | 1175 (8.3%) | 10847 |
| ary.mini.Nimi 1.0 | 15971 | 1417 (8.9%) | 13894 |
| brainfade.Fallen 0.63 | 11870 | 780 (6.6%) | 4344 |
| bvh.frg.Friga 0.112dev | 7974 | 605 (7.6%) | 5157 |
| bvh.mini.Freya 0.55 | 9221 | 447 (4.8%) | 797 |
| casey.Flee 1.0 | 8366 | 461 (5.5%) | 3504 |
| cf.mini.Chiva 1.0 | 9491 | 691 (7.3%) | 7656 |
| cf.proto.Shiva 2.2 | 14747 | 1091 (7.4%) | 10881 |
| davidalves.net.DuelistMicroMkII 1.1 | 10604 | 691 (6.5%) | 5813 |
| davidalves.net.DuelistMini 1.1 | 10011 | 723 (7.2%) | 5508 |
| dft.Cyanide 1.90 | 15167 | 1291 (8.5%) | 13360 |
| ds.OoV4 0.3b | 11842 | 1255 (10.6%) | 10416 |
| florent.small.LittleAngel 1.8 | 14658 | 1059 (7.2%) | 12759 |
| gh.GrubbmGrb 1.2.4 | 13659 | 1444 (10.6%) | 11712 |
| ins.MobyNano 0.8 | 7474 | 561 (7.5%) | 4389 |
| jam.mini.Raiko 0.43 | 14987 | 1315 (8.8%) | 12438 |
| jcs.Decepticon 2.5.3 | 14514 | 1281 (8.8%) | 11757 |
| jekl.DarkHallow .90.9 | 17339 | 1242 (7.2%) | 14587 |
| jekl.Jekyl .70 | 11828 | 945 (8.0%) | 7761 |
| jekl.mini.BlackPearl .91 | 11357 | 905 (8.0%) | 8117 |
| kawigi.mini.Coriantumr 1.1 | 9572 | 574 (6.0%) | 4886 |
| kawigi.mini.Fhqwhgads 1.1 | 8694 | 749 (8.6%) | 6082 |
| kc.micro.Thorn 1.252 | 13783 | 1024 (7.4%) | 11410 |
| kid.Toa .0.5 | 19577 | 675 (3.4%) | 5686 |
| kms.Golden 0.10 | 9846 | 898 (9.1%) | 7559 |
| lrem.magic.TormentedAngel Antiquitie | 9830 | 753 (7.7%) | 6625 |
| lucasslf.Dodger 1.0 | 13318 | 1280 (9.6%) | 10780 |
| lucasslf.HariSeldon 0.2.1 | 15221 | 1470 (9.7%) | 13021 |
| lucasslf.Wiggins 0.6 | 17425 | 1704 (9.8%) | 15523 |
| metal.small.MCool 1.21 | 8412 | 418 (5.0%) | 430 |
| metal.small.dna2.MCoolDNA 1.5 | 11295 | 684 (6.1%) | 5065 |
| mk.Alpha 0.2.1 | 7935 | 930 (11.7%) | 6790 |
| mladjo.Grrrrr 0.9 | 12894 | 1119 (8.7%) | 10588 |
| mnt.AHEB 0.6a | 9271 | 594 (6.4%) | 4219 |
| myl.micro.NekoNinja 1.30 | 11261 | 616 (5.5%) | 2698 |
| nat.Hikari dev0001 | 9642 | 1033 (10.7%) | 7882 |
| nat.nano.Ocnirp 1.73 | 8751 | 575 (6.6%) | 3109 |
| nat.nano.OcnirpPM 1.0 | 8382 | 578 (6.9%) | 3280 |
| pe.mini.SandboxMini 1.2 | 7574 | 542 (7.2%) | 3477 |
| pez.clean.Swiffer 0.2.9 | 6901 | 493 (7.1%) | 2792 |
| pez.mako.Mako 1.5 | 9871 | 636 (6.4%) | 3889 |
| ph.micro.Pikeman 0.4.5 | 13397 | 997 (7.4%) | 8999 |
| ph.mini.Archer 0.6.6 | 14360 | 1253 (8.7%) | 12211 |
| pkbots.BoyTDSurfer 1.0 | 12649 | 1077 (8.5%) | 10382 |
| rcb.Vanessa03 0 | 7426 | 492 (6.6%) | 3101 |
| rdt.AgentSmith.AgentSmith 0.5 | 14341 | 1095 (7.6%) | 9546 |
| robar.micro.Kirbyi 1.0 | 7640 | 525 (6.9%) | 2711 |
| rz.Aleph 0.34 | 13833 | 1130 (8.2%) | 9082 |
| simonton.beta.LifelongObsession 0.5.1 | 24350 | 2094 (8.6%) | 22146 |
| simonton.micro.GFMicro 1.0 | 14874 | 1261 (8.5%) | 12163 |
| simonton.mini.WeeksOnEnd 1.10.4 | 23359 | 2063 (8.8%) | 21144 |
| simonton.nano.WeekendObsession_S 1.7 | 6381 | 479 (7.5%) | 2620 |
| spinnercat.CopyKat 1.2.3 | 6879 | 581 (8.4%) | 3577 |
| starpkg.StarViewerZ 1.26 | 11700 | 919 (7.9%) | 8382 |
| stefw.Tigger 0.0.23 | 12492 | 1000 (8.0%) | 9475 |
| stelo.Randomness 1.1 | 11343 | 1172 (10.3%) | 8599 |
| stelo.SteloTestNano 1.0 | 5900 | 459 (7.8%) | 2394 |
| suh.nano.RandomPM 1.02 | 9407 | 545 (5.8%) | 2349 |
| syl.Centipede 0.5 | 8042 | 359 (4.5%) | 93 |
| theo.Tungsten 1.0a | 14081 | 1072 (7.6%) | 11275 |
| theo.avenge.Pequod 1.0 | 17797 | 981 (5.5%) | 7842 |
| theo.real.Ahab 1.0 | 17786 | 1277 (7.2%) | 15799 |
| tide.pear.Pear 0.62.1 | 16664 | 1216 (7.3%) | 12237 |
| trab.Crusader 0.1.7 | 16103 | 1471 (9.1%) | 12601 |
| trm.Wrekt 1.1.6.f | 14373 | 1071 (7.5%) | 8999 |
| tw.Exterminator 1.0 | 32529 | 3397 (10.4%) | 31834 |
| tzu.TheArtOfWar 1.2 | 5340 | 312 (5.8%) | 781 |
| vuen.Fractal 0.55 | 7817 | 398 (5.1%) | 365 |
| wcsv.Engineer.Engineer 0.5.4 | 15524 | 1267 (8.2%) | 11424 |
| wiki.mini.BlackDestroyer 0.9.0 | 13146 | 1090 (8.3%) | 8238 |
| wiki.mini.Sedan 1.0 | 9240 | 842 (9.1%) | 5864 |
| wilson.Chameleon 0.91 | 11727 | 1011 (8.6%) | 9903 |
| zen.Lindada 0.2 | 9462 | 669 (7.1%) | 5075 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | 650 | 500 | 556 | 596 | 34.5 / 17.8 | 239 | 5105 | 5010 |
| DM.mega.Bezier 1.618fprrr | 650 | 566 | 625 | 993 | 35.7 / 25.1 | 286 | 13601 | 343 |
| KiraNL.ChupaLite 0.4 | 650 | 501 | 559 | 482 | 49.8 / 25.9 | 2201 | 4590 | 3045 |
| Krabb.krabby.Krabby 1.18b | 650 | 422 | 488 | 425 | 49.5 / 16.2 | 1156 | 5275 | 2513 |
| ad.Quest 0.10 | 650 | 506 | 578 | 554 | 40.7 / 23.6 | 1195 | 5627 | 717 |
| ags.micro.Carpet 1.1 | 650 | 526 | 516 | 709 | 42.7 / 20.3 | 707 | 4976 | 1379 |
| ahf.r2d2.R2d2 0.86 | 650 | 479 | 491 | 502 | 47.2 / 20.5 | 1724 | 4442 | 61 |
| amk.ChumbaWumba 0.3 | 650 | 510 | 553 | 446 | 33.3 / 19.0 | 439 | 6773 | 4151 |
| apv.NanoLauLectrikTheCannibal 1.1 | 650 | 357 | 400 | 314 | 53.9 / 17.2 | 3054 | 5078 | 655 |
| arthord.KostyaTszyu Beta2 | 650 | 523 | 619 | 575 | 34.1 / 21.8 | 174 | 5601 | 13 |
| ary.SMG 1.01 | 650 | 455 | 650 | 691 | 41.7 / 30.7 | 780 | 3648 | 100 |
| ary.mini.Nimi 1.0 | 650 | 498 | 619 | 763 | 38.6 / 25.3 | 837 | 6664 | 1 |
| brainfade.Fallen 0.63 | 650 | 450 | 406 | 597 | 40.5 / 29.9 | 2662 | 2240 | 0 |
| bvh.frg.Friga 0.112dev | 650 | 530 | 478 | 429 | 49.8 / 17.7 | 2287 | 5557 | 0 |
| bvh.mini.Freya 0.55 | 650 | 522 | 481 | 471 | 42.7 / 19.7 | 994 | 5306 | 1250 |
| casey.Flee 1.0 | 650 | 489 | 578 | 436 | 38.3 / 18.1 | 845 | 6065 | 4255 |
| cf.mini.Chiva 1.0 | 650 | 491 | 519 | 495 | 48.1 / 21.5 | 1905 | 4191 | 237 |
| cf.proto.Shiva 2.2 | 650 | 495 | 647 | 711 | 31.7 / 28.9 | 433 | 3916 | 201 |
| davidalves.net.DuelistMicroMkII 1.1 | 650 | 471 | 650 | 534 | 41.8 / 24.9 | 1343 | 4099 | 22 |
| davidalves.net.DuelistMini 1.1 | 650 | 539 | 625 | 505 | 37.3 / 20.9 | 730 | 5642 | 138 |
| dft.Cyanide 1.90 | 650 | 521 | 650 | 713 | 29.0 / 31.6 | 275 | 6685 | 3497 |
| ds.OoV4 0.3b | 650 | 482 | 525 | 616 | 65.5 / 12.1 | 2970 | 4597 | 715 |
| florent.small.LittleAngel 1.8 | 650 | 560 | 609 | 701 | 33.9 / 21.8 | 344 | 5160 | 353 |
| gh.GrubbmGrb 1.2.4 | 650 | 499 | 538 | 667 | 45.3 / 20.7 | 1561 | 4115 | 64 |
| ins.MobyNano 0.8 | 650 | 478 | 513 | 394 | 38.9 / 18.8 | 1064 | 6973 | 1966 |
| jam.mini.Raiko 0.43 | 650 | 493 | 650 | 709 | 30.8 / 28.2 | 212 | 4156 | 27 |
| jcs.Decepticon 2.5.3 | 650 | 552 | 631 | 697 | 36.0 / 23.7 | 141 | 5310 | 1625 |
| jekl.DarkHallow .90.9 | 650 | 519 | 650 | 812 | 32.7 / 29.3 | 352 | 3935 | 96 |
| jekl.Jekyl .70 | 650 | 485 | 488 | 591 | 40.8 / 23.8 | 1893 | 4159 | 77 |
| jekl.mini.BlackPearl .91 | 650 | 498 | 581 | 567 | 40.9 / 23.7 | 722 | 4185 | 4534 |
| kawigi.mini.Coriantumr 1.1 | 650 | 506 | 409 | 500 | 47.7 / 12.8 | 1509 | 2499 | 60 |
| kawigi.mini.Fhqwhgads 1.1 | 650 | 432 | 531 | 450 | 39.6 / 22.1 | 1125 | 7118 | 406 |
| kc.micro.Thorn 1.252 | 650 | 460 | 547 | 671 | 37.2 / 26.8 | 392 | 2520 | 7 |
| kid.Toa .0.5 | 650 | 437 | 431 | 920 | 55.2 / 18.4 | 2160 | 298 | 47 |
| kms.Golden 0.10 | 650 | 403 | 488 | 513 | 41.4 / 28.4 | 1966 | 4231 | 2980 |
| lrem.magic.TormentedAngel Antiquitie | 650 | 502 | 547 | 507 | 44.6 / 20.9 | 1429 | 5373 | 3459 |
| lucasslf.Dodger 1.0 | 650 | 437 | 572 | 663 | 44.2 / 21.3 | 955 | 5640 | 862 |
| lucasslf.HariSeldon 0.2.1 | 650 | 513 | 588 | 729 | 42.4 / 22.3 | 573 | 4660 | 1480 |
| lucasslf.Wiggins 0.6 | 650 | 544 | 650 | 814 | 38.6 / 26.1 | 365 | 4105 | 1688 |
| metal.small.MCool 1.21 | 650 | 464 | 413 | 439 | 36.9 / 11.9 | 666 | 7957 | 2456 |
| metal.small.dna2.MCoolDNA 1.5 | 650 | 440 | 569 | 564 | 46.6 / 27.7 | 1782 | 4222 | 34 |
| mk.Alpha 0.2.1 | 650 | 497 | 400 | 437 | 57.9 / 15.2 | 3347 | 4370 | 12 |
| mladjo.Grrrrr 0.9 | 650 | 464 | 591 | 629 | 36.3 / 30.6 | 475 | 2867 | 3775 |
| mnt.AHEB 0.6a | 650 | 442 | 400 | 487 | 49.3 / 23.2 | 2815 | 4302 | 126 |
| myl.micro.NekoNinja 1.30 | 650 | 508 | 506 | 565 | 44.6 / 15.0 | 716 | 6290 | 67 |
| nat.Hikari dev0001 | 650 | 413 | 531 | 507 | 48.7 / 23.3 | 2306 | 3467 | 2607 |
| nat.nano.Ocnirp 1.73 | 650 | 490 | 581 | 450 | 34.7 / 23.6 | 828 | 4761 | 4427 |
| nat.nano.OcnirpPM 1.0 | 650 | 495 | 588 | 432 | 35.2 / 22.1 | 593 | 5711 | 4262 |
| pe.mini.SandboxMini 1.2 | 650 | 367 | 478 | 407 | 45.3 / 22.2 | 1994 | 5188 | 1 |
| pez.clean.Swiffer 0.2.9 | 650 | 477 | 550 | 526 | 49.0 / 31.5 | 1605 | 3303 | 14 |
| pez.mako.Mako 1.5 | 650 | 497 | 569 | 495 | 32.8 / 20.3 | 77 | 7843 | 73 |
| ph.micro.Pikeman 0.4.5 | 650 | 536 | 606 | 643 | 32.1 / 26.3 | 209 | 4942 | 5044 |
| ph.mini.Archer 0.6.6 | 650 | 506 | 619 | 691 | 35.9 / 29.4 | 343 | 2442 | 1571 |
| pkbots.BoyTDSurfer 1.0 | 650 | 412 | 634 | 631 | 44.9 / 29.6 | 1333 | 4558 | 1091 |
| rcb.Vanessa03 0 | 650 | 429 | 541 | 397 | 45.3 / 21.1 | 1720 | 6440 | 58 |
| rdt.AgentSmith.AgentSmith 0.5 | 650 | 538 | 613 | 681 | 32.9 / 28.8 | 159 | 6673 | 0 |
| robar.micro.Kirbyi 1.0 | 650 | 351 | 431 | 413 | 53.3 / 27.4 | 2480 | 4293 | 414 |
| rz.Aleph 0.34 | 650 | 517 | 638 | 667 | 34.8 / 29.5 | 428 | 4673 | 84 |
| simonton.beta.LifelongObsession 0.5.1 | 650 | 545 | 650 | 1092 | 28.1 / 32.7 | 198 | 18892 | 2838 |
| simonton.micro.GFMicro 1.0 | 650 | 472 | 500 | 712 | 44.2 / 19.1 | 592 | 4674 | 1383 |
| simonton.mini.WeeksOnEnd 1.10.4 | 650 | 536 | 650 | 1041 | 30.3 / 32.0 | 324 | 16597 | 2321 |
| simonton.nano.WeekendObsession_S 1.7 | 650 | 413 | 400 | 350 | 47.0 / 18.9 | 1655 | 5757 | 892 |
| spinnercat.CopyKat 1.2.3 | 650 | 406 | 400 | 372 | 45.3 / 23.4 | 2188 | 4401 | 2996 |
| starpkg.StarViewerZ 1.26 | 650 | 453 | 400 | 595 | 59.1 / 10.4 | 2281 | 6495 | 0 |
| stefw.Tigger 0.0.23 | 650 | 491 | 634 | 616 | 35.3 / 27.7 | 872 | 3240 | 372 |
| stelo.Randomness 1.1 | 650 | 467 | 553 | 566 | 46.4 / 21.1 | 1748 | 4956 | 450 |
| stelo.SteloTestNano 1.0 | 650 | 423 | 400 | 337 | 51.1 / 16.6 | 3150 | 4564 | 2167 |
| suh.nano.RandomPM 1.02 | 650 | 508 | 616 | 483 | 40.3 / 24.6 | 1416 | 4526 | 4003 |
| syl.Centipede 0.5 | 650 | 445 | 431 | 420 | 39.2 / 14.3 | 943 | 7252 | 1522 |
| theo.Tungsten 1.0a | 650 | 523 | 606 | 676 | 33.7 / 25.6 | 174 | 4807 | 76 |
| theo.avenge.Pequod 1.0 | 650 | 528 | 631 | 823 | 28.9 / 28.3 | 224 | 6403 | 419 |
| theo.real.Ahab 1.0 | 650 | 524 | 619 | 826 | 30.8 / 28.4 | 335 | 5854 | 194 |
| tide.pear.Pear 0.62.1 | 650 | 504 | 650 | 771 | 28.9 / 30.9 | 235 | 7503 | 474 |
| trab.Crusader 0.1.7 | 650 | 476 | 650 | 765 | 33.9 / 32.1 | 399 | 4846 | 0 |
| trm.Wrekt 1.1.6.f | 650 | 451 | 647 | 696 | 38.9 / 28.3 | 677 | 3237 | 2 |
| tw.Exterminator 1.0 | 650 | 471 | 516 | 1478 | 63.1 / 14.2 | 4008 | 1708 | 1396 |
| tzu.TheArtOfWar 1.2 | 650 | 340 | 400 | 316 | 70.1 / 15.5 | 3625 | 4769 | 49 |
| vuen.Fractal 0.55 | 650 | 501 | 463 | 415 | 47.7 / 18.9 | 2208 | 4181 | 37 |
| wcsv.Engineer.Engineer 0.5.4 | 650 | 465 | 650 | 733 | 27.7 / 33.1 | 244 | 8982 | 1650 |
| wiki.mini.BlackDestroyer 0.9.0 | 650 | 501 | 606 | 646 | 38.3 / 23.5 | 427 | 4655 | 1319 |
| wiki.mini.Sedan 1.0 | 650 | 490 | 541 | 469 | 36.2 / 20.7 | 656 | 7357 | 632 |
| wilson.Chameleon 0.91 | 650 | 500 | 531 | 584 | 42.0 / 22.6 | 1330 | 6274 | 40 |
| zen.Lindada 0.2 | 650 | 498 | 556 | 484 | 39.0 / 20.2 | 878 | 7036 | 39 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | 7.9% | 113 | 48 | 3 | 39.7 | 953 / 957 (100%) | 0 | 0 |
| DM.mega.Bezier 1.618fprrr | 7.3% | 202 | 1721 | 3 | 72.2 | 2019 / 2026 (100%) | 0 | 0 |
| KiraNL.ChupaLite 0.4 | 7.5% | 129 | 4682 | 3 | 32.2 | 639 / 640 (100%) | 0 | 0 |
| Krabb.krabby.Krabby 1.18b | 5.3% | 87 | 45 | 3 | 26.3 | 584 / 584 (100%) | 0 | 0 |
| ad.Quest 0.10 | 5.5% | 112 | 363 | 3 | 34.7 | 1043 / 1050 (99%) | 0 | 0 |
| ags.micro.Carpet 1.1 | 5.9% | 88 | 70 | 3 | 50.6 | 1295 / 1297 (100%) | 0 | 0 |
| ahf.r2d2.R2d2 0.86 | 6.1% | 85 | 51 | 3 | 32.1 | 1122 / 1122 (100%) | 0 | 0 |
| amk.ChumbaWumba 0.3 | 4.4% | 94 | 50 | 3 | 25.7 | 555 / 556 (100%) | 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 6.7% | 107 | 41 | 3 | 18.2 | 523 / 527 (99%) | 0 | 0 |
| arthord.KostyaTszyu Beta2 | 5.3% | 110 | 99 | 3 | 32.0 | 719 / 722 (100%) | 0 | 0 |
| ary.SMG 1.01 | 8.1% | 96 | 66 | 3 | 48.7 | 1175 / 1175 (100%) | 0 | 0 |
| ary.mini.Nimi 1.0 | 6.7% | 88 | 63 | 3 | 51.1 | 1417 / 1417 (100%) | 0 | 0 |
| brainfade.Fallen 0.63 | 7.6% | 108 | 364 | 3 | 37.8 | 780 / 780 (100%) | 0 | 0 |
| bvh.frg.Friga 0.112dev | 5.5% | 105 | 51 | 3 | 25.9 | 605 / 605 (100%) | 0 | 0 |
| bvh.mini.Freya 0.55 | 4.9% | 126 | 232 | 3 | 24.9 | 447 / 447 (100%) | 0 | 0 |
| casey.Flee 1.0 | 5.1% | 97 | 100 | 3 | 26.2 | 459 / 461 (100%) | 0 | 0 |
| cf.mini.Chiva 1.0 | 6.6% | 99 | 45 | 3 | 29.4 | 691 / 691 (100%) | 0 | 0 |
| cf.proto.Shiva 2.2 | 6.6% | 111 | 68 | 3 | 43.0 | 1090 / 1091 (100%) | 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 6.5% | 106 | 53 | 3 | 29.1 | 691 / 691 (100%) | 0 | 0 |
| davidalves.net.DuelistMini 1.1 | 4.9% | 109 | 63 | 3 | 27.9 | 718 / 723 (99%) | 0 | 0 |
| dft.Cyanide 1.90 | 7.3% | 102 | 59 | 3 | 48.5 | 1282 / 1291 (99%) | 0 | 0 |
| ds.OoV4 0.3b | 6.5% | 120 | 368 | 3 | 46.9 | 1249 / 1255 (100%) | 0 | 0 |
| florent.small.LittleAngel 1.8 | 5.4% | 101 | 62 | 3 | 40.9 | 1058 / 1059 (100%) | 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 6.6% | 131 | 104 | 3 | 48.2 | 1443 / 1444 (100%) | 0 | 0 |
| ins.MobyNano 0.8 | 5.7% | 89 | 45 | 3 | 23.6 | 560 / 561 (100%) | 0 | 0 |
| jam.mini.Raiko 0.43 | 6.3% | 99 | 65 | 3 | 45.4 | 1314 / 1315 (100%) | 0 | 0 |
| jcs.Decepticon 2.5.3 | 6.1% | 89 | 56 | 3 | 44.7 | 1278 / 1281 (100%) | 0 | 0 |
| jekl.DarkHallow .90.9 | 6.7% | 90 | 68 | 3 | 45.8 | 1242 / 1242 (100%) | 0 | 0 |
| jekl.Jekyl .70 | 6.6% | 110 | 64 | 3 | 37.7 | 945 / 945 (100%) | 0 | 0 |
| jekl.mini.BlackPearl .91 | 6.3% | 103 | 59 | 3 | 37.9 | 904 / 905 (100%) | 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 3.9% | 87 | 43 | 3 | 25.5 | 574 / 574 (100%) | 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 5.4% | 109 | 52 | 3 | 27.3 | 748 / 749 (100%) | 0 | 0 |
| kc.micro.Thorn 1.252 | 6.6% | 235 | 58 | 3 | 37.8 | 1023 / 1024 (100%) | 0 | 0 |
| kid.Toa .0.5 | 5.8% | 81 | 72 | 3 | 43.6 | 675 / 675 (100%) | 0 | 0 |
| kms.Golden 0.10 | 7.8% | 92 | 58 | 3 | 33.1 | 898 / 898 (100%) | 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 6.0% | 117 | 172 | 3 | 33.8 | 747 / 753 (99%) | 0 | 0 |
| lucasslf.Dodger 1.0 | 6.3% | 79 | 48 | 2 | 48.0 | 1277 / 1280 (100%) | 0 | 0 |
| lucasslf.HariSeldon 0.2.1 | 6.5% | 86 | 7550 | 3 | 53.7 | 1467 / 1470 (100%) | 0 | 0 |
| lucasslf.Wiggins 0.6 | 6.9% | 133 | 1362 | 2 | 60.5 | 1691 / 1704 (99%) | 0 | 0 |
| metal.small.MCool 1.21 | 3.4% | 86 | 50 | 3 | 25.1 | 416 / 418 (100%) | 0 | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 7.6% | 118 | 80 | 3 | 32.8 | 679 / 684 (99%) | 0 | 0 |
| mk.Alpha 0.2.1 | 5.8% | 86 | 3159 | 3 | 27.0 | 930 / 930 (100%) | 0 | 0 |
| mladjo.Grrrrr 0.9 | 10.2% | 97 | 63 | 3 | 42.5 | 1116 / 1119 (100%) | 0 | 0 |
| mnt.AHEB 0.6a | 7.0% | 87 | 3716 | 3 | 32.2 | 593 / 594 (100%) | 0 | 0 |
| myl.micro.NekoNinja 1.30 | 5.0% | 101 | 49 | 3 | 34.1 | 610 / 616 (99%) | 0 | 0 |
| nat.Hikari dev0001 | 6.9% | 101 | 246 | 3 | 34.0 | 1033 / 1033 (100%) | 0 | 0 |
| nat.nano.Ocnirp 1.73 | 6.6% | 97 | 47 | 3 | 27.2 | 570 / 575 (99%) | 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 6.0% | 111 | 66 | 3 | 26.0 | 573 / 578 (99%) | 0 | 0 |
| pe.mini.SandboxMini 1.2 | 5.9% | 93 | 865 | 3 | 21.9 | 541 / 542 (100%) | 0 | 0 |
| pez.clean.Swiffer 0.2.9 | 8.6% | 95 | 44 | 3 | 22.1 | 490 / 493 (99%) | 0 | 0 |
| pez.mako.Mako 1.5 | 4.6% | 114 | 54 | 2 | 30.1 | 636 / 636 (100%) | 0 | 0 |
| ph.micro.Pikeman 0.4.5 | 6.3% | 110 | 353 | 3 | 43.2 | 994 / 997 (100%) | 0 | 0 |
| ph.mini.Archer 0.6.6 | 7.2% | 106 | 75 | 3 | 48.4 | 1241 / 1253 (99%) | 0 | 0 |
| pkbots.BoyTDSurfer 1.0 | 8.2% | 115 | 66 | 3 | 44.9 | 1073 / 1077 (100%) | 0 | 0 |
| rcb.Vanessa03 0 | 5.7% | 98 | 49 | 3 | 22.5 | 492 / 492 (100%) | 0 | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 6.6% | 109 | 1672 | 3 | 43.2 | 1094 / 1095 (100%) | 0 | 0 |
| robar.micro.Kirbyi 1.0 | 8.5% | 108 | 3144 | 3 | 26.0 | 523 / 525 (100%) | 0 | 0 |
| rz.Aleph 0.34 | 7.2% | 111 | 79 | 3 | 41.9 | 1130 / 1130 (100%) | 0 | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 8.9% | 157 | 124 | 3 | 81.1 | 2088 / 2094 (100%) | 0 | 0 |
| simonton.micro.GFMicro 1.0 | 6.0% | 108 | 63 | 3 | 51.9 | 1250 / 1261 (99%) | 0 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 8.7% | 143 | 3651 | 3 | 78.9 | 2055 / 2063 (100%) | 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 5.9% | 81 | 42 | 3 | 20.4 | 476 / 479 (99%) | 0 | 0 |
| spinnercat.CopyKat 1.2.3 | 7.9% | 89 | 42 | 3 | 22.5 | 578 / 581 (99%) | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 4.2% | 98 | 45 | 3 | 43.8 | 919 / 919 (100%) | 0 | 0 |
| stefw.Tigger 0.0.23 | 6.5% | 90 | 64 | 3 | 39.5 | 999 / 1000 (100%) | 0 | 0 |
| stelo.Randomness 1.1 | 6.4% | 115 | 54 | 3 | 39.2 | 1170 / 1172 (100%) | 0 | 0 |
| stelo.SteloTestNano 1.0 | 5.1% | 93 | 41 | 3 | 19.2 | 455 / 459 (99%) | 0 | 0 |
| suh.nano.RandomPM 1.02 | 7.3% | 166 | 49 | 3 | 31.3 | 541 / 545 (99%) | 0 | 0 |
| syl.Centipede 0.5 | 3.7% | 93 | 49 | 3 | 23.3 | 359 / 359 (100%) | 0 | 0 |
| theo.Tungsten 1.0a | 8.7% | 103 | 66 | 3 | 39.2 | 1070 / 1072 (100%) | 0 | 0 |
| theo.avenge.Pequod 1.0 | 6.3% | 93 | 67 | 3 | 39.1 | 979 / 981 (100%) | 0 | 0 |
| theo.real.Ahab 1.0 | 6.9% | 94 | 76 | 3 | 50.1 | 1275 / 1277 (100%) | 0 | 0 |
| tide.pear.Pear 0.62.1 | 7.0% | 97 | 120 | 3 | 45.1 | 1216 / 1216 (100%) | 0 | 0 |
| trab.Crusader 0.1.7 | 7.6% | 120 | 79 | 3 | 52.2 | 1471 / 1471 (100%) | 0 | 0 |
| trm.Wrekt 1.1.6.f | 7.2% | 91 | 914 | 3 | 41.7 | 1071 / 1071 (100%) | 0 | 0 |
| tw.Exterminator 1.0 | 9.7% | 235 | 75 | 3 | 126.4 | 3388 / 3397 (100%) | 0 | 0 |
| tzu.TheArtOfWar 1.2 | 8.1% | 100 | 57 | 3 | 17.7 | 312 / 312 (100%) | 0 | 0 |
| vuen.Fractal 0.55 | 5.0% | 76 | 46 | 3 | 20.4 | 398 / 398 (100%) | 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 8.0% | 91 | 72 | 3 | 50.2 | 1259 / 1267 (99%) | 0 | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 6.0% | 97 | 68 | 3 | 44.1 | 1084 / 1090 (99%) | 0 | 0 |
| wiki.mini.Sedan 1.0 | 4.9% | 95 | 56 | 3 | 28.8 | 840 / 842 (100%) | 0 | 0 |
| wilson.Chameleon 0.91 | 6.0% | 107 | 71 | 3 | 37.7 | 1009 / 1011 (100%) | 0 | 0 |
| zen.Lindada 0.2 | 4.9% | 88 | 396 | 3 | 29.4 | 669 / 669 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| DM.mega.Bezier 1.618fprrr | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| KiraNL.ChupaLite 0.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| Krabb.krabby.Krabby 1.18b | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ad.Quest 0.10 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ags.micro.Carpet 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ahf.r2d2.R2d2 0.86 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| amk.ChumbaWumba 0.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| arthord.KostyaTszyu Beta2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ary.SMG 1.01 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ary.mini.Nimi 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| brainfade.Fallen 0.63 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.frg.Friga 0.112dev | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.mini.Freya 0.55 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| casey.Flee 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cf.mini.Chiva 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cf.proto.Shiva 2.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.net.DuelistMini 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dft.Cyanide 1.90 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ds.OoV4 0.3b | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| florent.small.LittleAngel 1.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ins.MobyNano 0.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jam.mini.Raiko 0.43 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jcs.Decepticon 2.5.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jekl.DarkHallow .90.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jekl.Jekyl .70 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jekl.mini.BlackPearl .91 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kc.micro.Thorn 1.252 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kid.Toa .0.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kms.Golden 0.10 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lucasslf.Dodger 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lucasslf.HariSeldon 0.2.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lucasslf.Wiggins 0.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| metal.small.MCool 1.21 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mk.Alpha 0.2.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mladjo.Grrrrr 0.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mnt.AHEB 0.6a | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| myl.micro.NekoNinja 1.30 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.Hikari dev0001 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.nano.Ocnirp 1.73 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pe.mini.SandboxMini 1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.clean.Swiffer 0.2.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.mako.Mako 1.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ph.micro.Pikeman 0.4.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ph.mini.Archer 0.6.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pkbots.BoyTDSurfer 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rcb.Vanessa03 0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.micro.Kirbyi 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rz.Aleph 0.34 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.micro.GFMicro 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| spinnercat.CopyKat 1.2.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| starpkg.StarViewerZ 1.26 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stefw.Tigger 0.0.23 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.Randomness 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.SteloTestNano 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| suh.nano.RandomPM 1.02 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| syl.Centipede 0.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.Tungsten 1.0a | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.avenge.Pequod 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.real.Ahab 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tide.pear.Pear 0.62.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| trab.Crusader 0.1.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| trm.Wrekt 1.1.6.f | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tw.Exterminator 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tzu.TheArtOfWar 1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| vuen.Fractal 0.55 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wiki.mini.Sedan 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wilson.Chameleon 0.91 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| zen.Lindada 0.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | hadur2.Hadur 3.10 | 8 | 90.0% ± 8.9 | 100.0% ± 0.0 | +10.0 ± 8.9 | 54.3% ± 21.2 | 83.4% ± 19.9 | +33.7 ± 20.6 |
| AIR.iRobot 1.0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 92.5% ± 8.7 | -0.0 ± 10.9 | 61.7% ± 6.4 | 67.0% ± 8.7 | +5.3 ± 10.9 |
| DM.mega.Bezier 1.618fprrr | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 68.5% ± 25.2 | 47.0% ± 19.5 | -21.5 ± 21.3 |
| DM.mega.Bezier 1.618fprrr | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 94.7% ± 6.9 | +2.2 ± 13.6 | 55.2% ± 8.4 | 61.6% ± 9.0 | +6.3 ± 12.6 |
| KiraNL.ChupaLite 0.4 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 56.5% ± 41.7 | 54.1% ± 21.9 | -5.1 ± 52.2 |
| KiraNL.ChupaLite 0.4 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 93.8% ± 4.3 | +3.8 ± 15.4 | 60.1% ± 4.7 | 65.4% ± 4.3 | +5.3 ± 5.0 |
| Krabb.krabby.Krabby 1.18b | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 72.8% ± 25.5 | 68.8% ± 13.2 | -4.0 ± 24.4 |
| Krabb.krabby.Krabby 1.18b | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 67.6% ± 13.4 | 80.2% ± 8.1 | +12.6 ± 7.7 |
| ad.Quest 0.10 | hadur2.Hadur 3.10 | 8 | 90.0% ± 8.9 | 98.8% ± 3.0 | +8.7 ± 10.4 | 47.4% ± 10.1 | 70.9% ± 15.1 | +23.5 ± 13.6 |
| ad.Quest 0.10 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 97.5% ± 3.9 | +10.0 ± 11.8 | 55.7% ± 9.4 | 66.7% ± 5.4 | +11.0 ± 8.3 |
| ags.micro.Carpet 1.1 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 94.9% ± 6.4 | -5.1 ± 6.4 | 60.5% ± 25.0 | 39.1% ± 5.8 | -21.3 ± 24.9 |
| ags.micro.Carpet 1.1 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 97.5% ± 3.9 | +7.5 ± 14.7 | 65.9% ± 6.2 | 71.8% ± 5.0 | +5.9 ± 7.5 |
| ahf.r2d2.R2d2 0.86 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 71.7% ± 15.4 | 58.7% ± 9.8 | -13.0 ± 20.5 |
| ahf.r2d2.R2d2 0.86 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 62.2% ± 4.2 | 73.0% ± 3.4 | +10.8 ± 3.5 |
| amk.ChumbaWumba 0.3 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 96.3% ± 6.2 | -3.7 ± 6.2 | 63.6% ± 22.6 | 60.4% ± 13.8 | -3.3 ± 24.6 |
| amk.ChumbaWumba 0.3 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 9.7 | 60.1% ± 7.5 | 63.9% ± 7.2 | +3.8 ± 13.0 |
| apv.NanoLauLectrikTheCannibal 1.1 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 95.0% ± 4.5 | -5.0 ± 4.5 | 87.3% ± 9.2 | 77.7% ± 8.2 | -9.6 ± 11.6 |
| apv.NanoLauLectrikTheCannibal 1.1 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 98.8% ± 3.0 | +3.7 ± 8.9 | 71.6% ± 6.9 | 77.1% ± 2.8 | +5.5 ± 8.4 |
| arthord.KostyaTszyu Beta2 | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 57.4% ± 24.5 | 47.2% ± 14.7 | -10.2 ± 29.8 |
| arthord.KostyaTszyu Beta2 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 96.3% ± 6.2 | +3.7 ± 6.2 | 57.4% ± 5.6 | 61.1% ± 4.3 | +3.7 ± 7.8 |
| ary.SMG 1.01 | hadur2.Hadur 3.10 | 8 | 87.5% ± 19.9 | 95.0% ± 6.3 | +7.5 ± 18.3 | 45.1% ± 16.1 | 43.5% ± 10.9 | -1.5 ± 18.2 |
| ary.SMG 1.01 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 88.1% ± 10.3 | +0.6 ± 16.7 | 63.5% ± 12.7 | 53.3% ± 6.8 | -10.2 ± 16.3 |
| ary.mini.Nimi 1.0 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 55.3% ± 6.7 | 74.3% ± 15.0 | +19.0 ± 17.1 |
| ary.mini.Nimi 1.0 | hadur2.Hadur 3.9 | 8 | 85.0% ± 7.7 | 96.1% ± 6.3 | +11.1 ± 12.2 | 61.2% ± 5.8 | 59.1% ± 5.0 | -2.1 ± 8.6 |
| brainfade.Fallen 0.63 | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 65.5% ± 20.9 | 39.8% ± 10.7 | -25.7 ± 21.0 |
| brainfade.Fallen 0.63 | hadur2.Hadur 3.9 | 8 | 82.5% ± 14.0 | 85.8% ± 8.4 | +3.3 ± 19.5 | 52.2% ± 6.8 | 59.1% ± 5.4 | +7.0 ± 10.1 |
| bvh.frg.Friga 0.112dev | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 75.8% ± 28.3 | 87.2% ± 11.6 | +11.3 ± 25.3 |
| bvh.frg.Friga 0.112dev | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 71.1% ± 4.8 | 73.3% ± 3.2 | +2.2 ± 7.4 |
| bvh.mini.Freya 0.55 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 100.0% ± 0.0 | 81.0% ± 14.9 | -19.0 ± 14.9 |
| bvh.mini.Freya 0.55 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 96.3% ± 4.3 | +3.7 ± 9.9 | 61.2% ± 8.4 | 70.5% ± 3.2 | +9.4 ± 10.0 |
| casey.Flee 1.0 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 48.5% ± 16.9 | 57.2% ± 8.4 | +8.7 ± 20.6 |
| casey.Flee 1.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 98.8% ± 3.0 | +3.7 ± 6.2 | 62.5% ± 10.3 | 68.9% ± 5.7 | +6.4 ± 8.3 |
| cf.mini.Chiva 1.0 | hadur2.Hadur 3.10 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 60.7% ± 7.9 | 85.3% ± 3.5 | +24.6 ± 8.9 |
| cf.mini.Chiva 1.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 11.8 | 96.1% ± 4.5 | +1.1 ± 10.1 | 65.2% ± 4.7 | 70.6% ± 3.5 | +5.5 ± 4.2 |
| cf.proto.Shiva 2.2 | hadur2.Hadur 3.10 | 8 | 90.0% ± 8.9 | 97.5% ± 3.9 | +7.5 ± 9.7 | 36.6% ± 13.0 | 68.3% ± 22.5 | +31.8 ± 19.1 |
| cf.proto.Shiva 2.2 | hadur2.Hadur 3.9 | 8 | 75.0% ± 19.5 | 91.1% ± 7.0 | +16.1 ± 19.5 | 47.9% ± 11.7 | 55.4% ± 7.9 | +7.5 ± 11.9 |
| davidalves.net.DuelistMicroMkII 1.1 | hadur2.Hadur 3.10 | 8 | 95.0% ± 7.7 | 98.8% ± 3.0 | +3.7 ± 6.2 | 60.1% ± 17.2 | 68.0% ± 8.4 | +7.9 ± 20.5 |
| davidalves.net.DuelistMicroMkII 1.1 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 95.0% ± 6.3 | +2.5 ± 11.6 | 55.3% ± 7.5 | 64.6% ± 6.3 | +9.4 ± 9.8 |
| davidalves.net.DuelistMini 1.1 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 80.9% ± 23.5 | 67.6% ± 14.1 | -13.3 ± 27.2 |
| davidalves.net.DuelistMini 1.1 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 95.0% ± 6.3 | +5.0 ± 8.9 | 53.0% ± 6.2 | 65.7% ± 5.0 | +12.6 ± 9.5 |
| dft.Cyanide 1.90 | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 50.8% ± 20.0 | 62.6% ± 11.8 | +11.8 ± 24.6 |
| dft.Cyanide 1.90 | hadur2.Hadur 3.9 | 8 | 80.0% ± 20.0 | 84.7% ± 4.8 | +4.7 ± 22.6 | 43.3% ± 6.2 | 45.8% ± 5.3 | +2.6 ± 8.3 |
| ds.OoV4 0.3b | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 60.2% ± 24.5 | 56.7% ± 13.6 | -3.5 ± 26.2 |
| ds.OoV4 0.3b | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 79.4% ± 5.1 | 84.8% ± 2.0 | +5.4 ± 5.7 |
| florent.small.LittleAngel 1.8 | hadur2.Hadur 3.10 | 8 | 95.0% ± 7.7 | 97.5% ± 5.9 | +2.5 ± 10.7 | 41.0% ± 14.0 | 46.5% ± 7.3 | +5.5 ± 18.4 |
| florent.small.LittleAngel 1.8 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 95.0% ± 4.5 | +2.5 ± 10.7 | 64.2% ± 4.6 | 59.9% ± 6.6 | -4.3 ± 6.5 |
| gh.GrubbmGrb 1.2.4 | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 97.5% ± 5.9 | +0.0 ± 0.0 | 78.1% ± 6.8 | 87.3% ± 9.7 | +9.2 ± 7.5 |
| gh.GrubbmGrb 1.2.4 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 95.0% ± 6.3 | -2.5 ± 9.7 | 68.5% ± 7.4 | 69.1% ± 6.1 | +0.7 ± 10.7 |
| ins.MobyNano 0.8 | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 53.8% ± 13.8 | 55.0% ± 14.1 | +1.2 ± 20.7 |
| ins.MobyNano 0.8 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 97.5% ± 5.9 | +0.0 ± 8.9 | 59.9% ± 10.0 | 70.0% ± 7.5 | +10.0 ± 8.2 |
| jam.mini.Raiko 0.43 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 96.3% ± 4.3 | -3.7 ± 4.3 | 73.0% ± 22.5 | 56.0% ± 18.2 | -17.0 ± 23.5 |
| jam.mini.Raiko 0.43 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 88.8% ± 9.4 | -3.8 ± 11.8 | 51.8% ± 6.7 | 52.3% ± 3.1 | +0.5 ± 5.9 |
| jcs.Decepticon 2.5.3 | hadur2.Hadur 3.10 | 8 | 90.0% ± 8.9 | 98.8% ± 3.0 | +8.7 ± 8.3 | 41.1% ± 6.1 | 42.5% ± 17.5 | +1.4 ± 17.7 |
| jcs.Decepticon 2.5.3 | hadur2.Hadur 3.9 | 8 | 92.5% ± 12.4 | 91.3% ± 8.3 | -1.2 ± 14.4 | 57.6% ± 6.3 | 61.8% ± 8.7 | +4.2 ± 10.2 |
| jekl.DarkHallow .90.9 | hadur2.Hadur 3.10 | 8 | 95.0% ± 7.7 | 93.2% ± 13.0 | -1.8 ± 16.9 | 54.4% ± 17.7 | 54.3% ± 16.3 | -0.1 ± 33.0 |
| jekl.DarkHallow .90.9 | hadur2.Hadur 3.9 | 8 | 75.0% ± 11.8 | 86.0% ± 7.6 | +11.0 ± 13.4 | 48.8% ± 11.2 | 49.0% ± 5.3 | +0.3 ± 8.1 |
| jekl.Jekyl .70 | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 66.6% ± 21.0 | 76.9% ± 13.6 | +10.3 ± 23.2 |
| jekl.Jekyl .70 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 88.8% ± 7.0 | -1.2 ± 13.7 | 60.4% ± 9.9 | 63.9% ± 6.9 | +3.5 ± 15.7 |
| jekl.mini.BlackPearl .91 | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 64.4% ± 15.4 | 80.1% ± 17.4 | +15.7 ± 23.8 |
| jekl.mini.BlackPearl .91 | hadur2.Hadur 3.9 | 8 | 92.5% ± 12.4 | 95.0% ± 4.5 | +2.5 ± 12.4 | 61.6% ± 4.9 | 63.7% ± 5.1 | +2.1 ± 5.3 |
| kawigi.mini.Coriantumr 1.1 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 91.6% ± 16.0 | 92.9% ± 7.9 | +1.4 ± 19.6 |
| kawigi.mini.Coriantumr 1.1 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 73.9% ± 5.3 | 78.4% ± 5.2 | +4.5 ± 9.7 |
| kawigi.mini.Fhqwhgads 1.1 | hadur2.Hadur 3.10 | 8 | 95.0% ± 7.7 | 97.5% ± 5.9 | +2.5 ± 10.7 | 58.5% ± 15.9 | 61.8% ± 12.8 | +3.2 ± 23.7 |
| kawigi.mini.Fhqwhgads 1.1 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 90.0% ± 6.3 | +0.0 ± 15.5 | 58.8% ± 9.5 | 66.0% ± 6.6 | +7.2 ± 15.4 |
| kc.micro.Thorn 1.252 | hadur2.Hadur 3.10 | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 7.4 | 51.3% ± 15.0 | 60.6% ± 9.5 | +9.3 ± 16.3 |
| kc.micro.Thorn 1.252 | hadur2.Hadur 3.9 | 8 | 89.4% ± 9.6 | 87.2% ± 8.9 | -2.2 ± 14.1 | 58.5% ± 8.6 | 54.2% ± 8.7 | -4.3 ± 13.3 |
| kid.Toa .0.5 | hadur2.Hadur 3.10 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 71.3% ± 10.0 | 76.3% ± 6.1 | +5.0 ± 12.9 |
| kid.Toa .0.5 | hadur2.Hadur 3.9 | 8 | 87.5% ± 8.7 | 92.5% ± 9.7 | +5.0 ± 15.5 | 68.5% ± 8.1 | 77.1% ± 4.6 | +8.5 ± 9.4 |
| kms.Golden 0.10 | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 88.3% ± 10.1 | -9.2 ± 12.0 | 43.6% ± 16.6 | 50.8% ± 11.8 | +7.2 ± 25.9 |
| kms.Golden 0.10 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 80.8% ± 8.8 | -9.2 ± 17.4 | 56.8% ± 5.7 | 58.3% ± 4.3 | +1.5 ± 8.1 |
| lrem.magic.TormentedAngel Antiquitie | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 97.5% ± 3.9 | -2.5 ± 3.9 | 37.8% ± 24.6 | 37.8% ± 14.3 | +0.0 ± 26.3 |
| lrem.magic.TormentedAngel Antiquitie | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 59.6% ± 6.7 | 69.7% ± 5.2 | +10.1 ± 8.6 |
| lucasslf.Dodger 1.0 | hadur2.Hadur 3.10 | 8 | 95.0% ± 11.8 | 98.8% ± 3.0 | +3.8 ± 12.6 | 37.1% ± 22.0 | 39.0% ± 12.6 | +1.9 ± 21.9 |
| lucasslf.Dodger 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 96.0% ± 6.8 | -1.5 ± 9.9 | 67.2% ± 4.4 | 66.0% ± 6.6 | -1.3 ± 7.5 |
| lucasslf.HariSeldon 0.2.1 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 72.3% ± 10.4 | 73.5% ± 11.0 | +1.2 ± 10.0 |
| lucasslf.HariSeldon 0.2.1 | hadur2.Hadur 3.9 | 8 | 92.5% ± 12.4 | 98.8% ± 3.0 | +6.3 ± 13.4 | 61.3% ± 7.2 | 68.4% ± 4.5 | +7.1 ± 10.0 |
| lucasslf.Wiggins 0.6 | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 38.1% ± 15.6 | 71.5% ± 11.8 | +33.4 ± 15.0 |
| lucasslf.Wiggins 0.6 | hadur2.Hadur 3.9 | 8 | 85.0% ± 11.8 | 95.0% ± 6.3 | +10.0 ± 10.0 | 52.4% ± 9.3 | 65.3% ± 4.3 | +12.9 ± 10.7 |
| metal.small.MCool 1.21 | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 75.8% ± 24.7 | 81.8% ± 13.3 | +3.4 ± 32.3 |
| metal.small.MCool 1.21 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 61.1% ± 7.5 | 76.5% ± 3.6 | +15.4 ± 10.2 |
| metal.small.dna2.MCoolDNA 1.5 | hadur2.Hadur 3.10 | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 7.4 | 46.2% ± 20.6 | 59.1% ± 7.7 | +13.0 ± 18.5 |
| metal.small.dna2.MCoolDNA 1.5 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 91.3% ± 7.0 | -3.7 ± 9.9 | 62.6% ± 6.2 | 62.8% ± 5.0 | +0.2 ± 6.7 |
| mk.Alpha 0.2.1 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 100.0% ± 0.0 | 81.1% ± 17.1 | -18.9 ± 17.1 |
| mk.Alpha 0.2.1 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 98.6% ± 3.3 | -1.4 ± 3.3 | 77.2% ± 5.2 | 81.2% ± 3.9 | +4.0 ± 4.4 |
| mladjo.Grrrrr 0.9 | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 57.2% ± 7.8 | 54.6% ± 15.5 | -2.6 ± 21.3 |
| mladjo.Grrrrr 0.9 | hadur2.Hadur 3.9 | 8 | 85.0% ± 7.7 | 80.0% ± 10.0 | -5.0 ± 6.3 | 58.4% ± 9.0 | 51.7% ± 4.1 | -6.7 ± 11.2 |
| mnt.AHEB 0.6a | hadur2.Hadur 3.10 | 8 | 95.0% ± 7.7 | 93.8% ± 6.2 | -1.2 ± 10.4 | 54.7% ± 28.6 | 50.4% ± 17.9 | -4.3 ± 43.0 |
| mnt.AHEB 0.6a | hadur2.Hadur 3.9 | 8 | 80.0% ± 8.9 | 96.3% ± 4.3 | +16.2 ± 9.9 | 59.9% ± 5.9 | 69.8% ± 5.3 | +9.9 ± 7.3 |
| myl.micro.NekoNinja 1.30 | hadur2.Hadur 3.10 | 8 | 92.5% ± 8.7 | 100.0% ± 0.0 | +7.5 ± 8.7 | 66.0% ± 23.7 | 74.5% ± 6.3 | +8.6 ± 22.8 |
| myl.micro.NekoNinja 1.30 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 70.4% ± 9.5 | 74.2% ± 5.5 | +3.8 ± 6.9 |
| nat.Hikari dev0001 | hadur2.Hadur 3.10 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 35.6% ± 16.9 | 51.9% ± 9.7 | +16.3 ± 20.7 |
| nat.Hikari dev0001 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 93.5% ± 6.7 | +1.0 ± 12.6 | 64.7% ± 4.9 | 66.4% ± 6.5 | +1.6 ± 9.1 |
| nat.nano.OcnirpPM 1.0 | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 96.3% ± 4.3 | -1.2 ± 8.3 | 39.1% ± 14.1 | 54.3% ± 12.6 | +15.3 ± 16.8 |
| nat.nano.OcnirpPM 1.0 | hadur2.Hadur 3.9 | 8 | 82.5% ± 10.7 | 97.5% ± 3.9 | +15.0 ± 12.6 | 50.5% ± 8.6 | 63.6% ± 4.6 | +13.1 ± 11.3 |
| nat.nano.Ocnirp 1.73 | hadur2.Hadur 3.10 | 8 | 87.5% ± 12.4 | 92.5% ± 5.9 | +5.0 ± 10.0 | 29.2% ± 17.2 | 42.9% ± 8.4 | +13.7 ± 20.6 |
| nat.nano.Ocnirp 1.73 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 95.0% ± 4.5 | -2.5 ± 8.7 | 57.4% ± 6.4 | 59.7% ± 6.3 | +2.3 ± 9.5 |
| pe.mini.SandboxMini 1.2 | hadur2.Hadur 3.10 | 8 | 92.5% ± 8.7 | 98.8% ± 3.0 | +6.2 ± 9.9 | 43.7% ± 10.2 | 58.5% ± 8.6 | +14.8 ± 17.8 |
| pe.mini.SandboxMini 1.2 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 96.3% ± 4.3 | -3.7 ± 4.3 | 59.5% ± 6.6 | 68.2% ± 5.2 | +8.7 ± 9.3 |
| pez.clean.Swiffer 0.2.9 | hadur2.Hadur 3.10 | 8 | 92.5% ± 8.7 | 95.0% ± 6.3 | +2.5 ± 7.4 | 48.8% ± 20.4 | 76.1% ± 14.6 | +27.3 ± 19.6 |
| pez.clean.Swiffer 0.2.9 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 61.0% ± 26.2 | -34.0 ± 26.1 | 68.6% ± 9.2 | 41.0% ± 21.5 | -27.6 ± 20.0 |
| pez.mako.Mako 1.5 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 71.5% ± 20.0 | 73.9% ± 12.0 | +2.4 ± 30.1 |
| pez.mako.Mako 1.5 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 96.3% ± 6.2 | +8.8 ± 16.4 | 55.4% ± 4.4 | 63.3% ± 6.9 | +7.9 ± 10.0 |
| ph.micro.Pikeman 0.4.5 | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 66.8% ± 25.7 | 76.2% ± 19.1 | +9.4 ± 31.6 |
| ph.micro.Pikeman 0.4.5 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 87.5% ± 10.7 | -2.5 ± 10.7 | 53.0% ± 5.7 | 54.0% ± 8.1 | +1.0 ± 5.7 |
| ph.mini.Archer 0.6.6 | hadur2.Hadur 3.10 | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 7.4 | 34.9% ± 24.4 | 34.3% ± 19.7 | -0.6 ± 36.4 |
| ph.mini.Archer 0.6.6 | hadur2.Hadur 3.9 | 8 | 82.5% ± 10.7 | 91.3% ± 7.0 | +8.8 ± 11.3 | 54.4% ± 7.4 | 57.3% ± 5.4 | +2.9 ± 9.3 |
| pkbots.BoyTDSurfer 1.0 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 32.2% ± 11.6 | 48.6% ± 7.6 | +16.5 ± 11.1 |
| pkbots.BoyTDSurfer 1.0 | hadur2.Hadur 3.9 | 8 | 67.5% ± 15.3 | 93.5% ± 6.4 | +26.0 ± 17.8 | 53.1% ± 7.2 | 65.1% ± 5.9 | +12.0 ± 8.9 |
| rcb.Vanessa03 0 | hadur2.Hadur 3.10 | 8 | 92.5% ± 8.7 | 98.6% ± 3.3 | +6.1 ± 10.1 | 35.1% ± 13.5 | 77.6% ± 15.0 | +42.6 ± 23.2 |
| rcb.Vanessa03 0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 97.5% ± 3.9 | +5.0 ± 6.3 | 61.7% ± 7.2 | 70.3% ± 4.0 | +8.6 ± 8.2 |
| rdt.AgentSmith.AgentSmith 0.5 | hadur2.Hadur 3.10 | 8 | 92.5% ± 8.7 | 100.0% ± 0.0 | +7.5 ± 8.7 | 50.1% ± 36.0 | 55.4% ± 16.6 | +5.3 ± 39.5 |
| rdt.AgentSmith.AgentSmith 0.5 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 88.5% ± 7.0 | -1.5 ± 12.4 | 52.2% ± 11.2 | 53.7% ± 5.2 | +1.5 ± 13.2 |
| robar.micro.Kirbyi 1.0 | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 93.8% ± 6.2 | -3.7 ± 7.7 | 63.5% ± 13.8 | 52.4% ± 10.3 | -11.1 ± 9.6 |
| robar.micro.Kirbyi 1.0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 90.0% ± 4.5 | -2.5 ± 11.6 | 71.5% ± 6.2 | 66.4% ± 3.6 | -5.1 ± 7.3 |
| rz.Aleph 0.34 | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 60.6% ± 25.3 | 32.2% ± 11.2 | -28.4 ± 22.2 |
| rz.Aleph 0.34 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 84.4% ± 12.0 | -5.6 ± 16.5 | 51.0% ± 5.0 | 53.9% ± 8.0 | +2.8 ± 9.8 |
| simonton.beta.LifelongObsession 0.5.1 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 95.0% ± 7.7 | -5.0 ± 7.7 | 62.6% ± 14.7 | 56.4% ± 13.0 | -6.2 ± 20.3 |
| simonton.beta.LifelongObsession 0.5.1 | hadur2.Hadur 3.9 | 8 | 75.0% ± 7.7 | 73.5% ± 11.4 | -1.5 ± 12.7 | 43.6% ± 6.2 | 43.8% ± 3.7 | +0.2 ± 6.2 |
| simonton.micro.GFMicro 1.0 | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 96.3% ± 4.3 | -1.2 ± 8.3 | 71.8% ± 14.1 | 75.0% ± 11.4 | +3.2 ± 13.9 |
| simonton.micro.GFMicro 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 96.3% ± 6.2 | -1.2 ± 9.4 | 84.5% ± 4.1 | 71.0% ± 3.9 | -13.5 ± 5.4 |
| simonton.mini.WeeksOnEnd 1.10.4 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 49.4% ± 10.9 | 61.5% ± 12.7 | +12.2 ± 22.9 |
| simonton.mini.WeeksOnEnd 1.10.4 | hadur2.Hadur 3.9 | 8 | 70.0% ± 15.5 | 81.3% ± 10.4 | +11.2 ± 19.2 | 45.8% ± 5.0 | 49.0% ± 7.3 | +3.3 ± 8.2 |
| simonton.nano.WeekendObsession_S 1.7 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 87.1% ± 12.8 | 60.6% ± 14.1 | -26.5 ± 23.4 |
| simonton.nano.WeekendObsession_S 1.7 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 95.0% ± 4.5 | -5.0 ± 4.5 | 82.2% ± 2.7 | 65.4% ± 6.1 | -16.9 ± 5.5 |
| spinnercat.CopyKat 1.2.3 | hadur2.Hadur 3.10 | 8 | 95.0% ± 7.7 | 94.9% ± 6.4 | -0.1 ± 11.9 | 61.6% ± 18.3 | 79.2% ± 12.9 | +17.6 ± 24.1 |
| spinnercat.CopyKat 1.2.3 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 91.3% ± 7.0 | -8.7 ± 7.0 | 75.1% ± 4.5 | 63.9% ± 6.5 | -11.2 ± 9.1 |
| starpkg.StarViewerZ 1.26 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 49.1% ± 25.6 | 59.9% ± 22.2 | +10.8 ± 34.6 |
| starpkg.StarViewerZ 1.26 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 9.7 | 76.2% ± 2.8 | 87.8% ± 3.8 | +11.6 ± 5.3 |
| stefw.Tigger 0.0.23 | hadur2.Hadur 3.10 | 8 | 92.5% ± 8.7 | 98.8% ± 3.0 | +6.2 ± 9.9 | 37.8% ± 12.5 | 47.5% ± 19.5 | +9.7 ± 28.8 |
| stefw.Tigger 0.0.23 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 88.8% ± 9.4 | +1.2 ± 16.4 | 51.7% ± 6.0 | 56.6% ± 6.2 | +4.9 ± 8.1 |
| stelo.Randomness 1.1 | hadur2.Hadur 3.10 | 8 | 87.5% ± 8.7 | 92.5% ± 5.9 | +5.0 ± 11.8 | 47.0% ± 10.2 | 57.0% ± 5.8 | +10.0 ± 10.2 |
| stelo.Randomness 1.1 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 4.5 | 61.3% ± 7.7 | 71.0% ± 7.9 | +9.6 ± 7.8 |
| stelo.SteloTestNano 1.0 | hadur2.Hadur 3.10 | 8 | 95.0% ± 7.7 | 96.3% ± 4.3 | +1.2 ± 5.4 | 64.4% ± 18.9 | 65.2% ± 12.3 | +0.8 ± 21.8 |
| stelo.SteloTestNano 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 96.3% ± 4.3 | -3.7 ± 4.3 | 66.4% ± 5.6 | 73.0% ± 5.2 | +6.6 ± 9.7 |
| suh.nano.RandomPM 1.02 | hadur2.Hadur 3.10 | 8 | 87.5% ± 15.3 | 93.8% ± 6.2 | +6.3 ± 15.4 | 28.2% ± 13.2 | 44.8% ± 16.0 | +16.6 ± 21.8 |
| suh.nano.RandomPM 1.02 | hadur2.Hadur 3.9 | 8 | 95.0% ± 11.8 | 92.5% ± 7.4 | -2.5 ± 9.7 | 64.1% ± 7.8 | 60.4% ± 5.3 | -3.7 ± 8.2 |
| syl.Centipede 0.5 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 93.4% ± 6.4 | 71.5% ± 14.1 | -21.9 ± 15.6 |
| syl.Centipede 0.5 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 96.1% ± 4.5 | +3.6 ± 11.9 | 58.6% ± 9.5 | 75.1% ± 5.5 | +16.5 ± 14.1 |
| theo.Tungsten 1.0a | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 96.3% ± 6.2 | -3.7 ± 6.2 | 67.5% ± 8.9 | 50.9% ± 12.9 | -16.6 ± 18.9 |
| theo.Tungsten 1.0a | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 79.9% ± 8.8 | -15.1 ± 11.6 | 58.2% ± 7.0 | 51.6% ± 6.1 | -6.5 ± 10.4 |
| theo.avenge.Pequod 1.0 | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 96.3% ± 4.3 | -1.2 ± 8.3 | 50.8% ± 15.9 | 57.5% ± 13.6 | +6.7 ± 20.6 |
| theo.avenge.Pequod 1.0 | hadur2.Hadur 3.9 | 8 | 82.5% ± 14.0 | 80.8% ± 10.4 | -1.7 ± 13.6 | 49.6% ± 6.8 | 46.8% ± 5.1 | -2.8 ± 7.9 |
| theo.real.Ahab 1.0 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 41.7% ± 16.3 | 50.2% ± 6.7 | +8.5 ± 17.3 |
| theo.real.Ahab 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 76.0% ± 15.6 | -21.5 ± 18.3 | 53.7% ± 7.7 | 47.5% ± 4.5 | -6.2 ± 10.3 |
| tide.pear.Pear 0.62.1 | hadur2.Hadur 3.10 | 8 | 92.5% ± 12.4 | 100.0% ± 0.0 | +7.5 ± 12.4 | 41.8% ± 6.3 | 85.1% ± 4.2 | +43.3 ± 5.6 |
| tide.pear.Pear 0.62.1 | hadur2.Hadur 3.9 | 8 | 67.5% ± 17.7 | 82.1% ± 5.9 | +14.6 ± 20.5 | 43.9% ± 4.0 | 48.1% ± 6.6 | +4.2 ± 8.4 |
| trab.Crusader 0.1.7 | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 86.3% ± 12.6 | -11.3 ± 15.8 | 52.7% ± 20.8 | 45.3% ± 5.5 | -7.4 ± 24.5 |
| trab.Crusader 0.1.7 | hadur2.Hadur 3.9 | 8 | 77.5% ± 14.0 | 87.1% ± 7.6 | +9.6 ± 15.0 | 43.9% ± 10.1 | 53.4% ± 8.1 | +9.5 ± 12.9 |
| trm.Wrekt 1.1.6.f | hadur2.Hadur 3.10 | 8 | 92.5% ± 12.4 | 93.8% ± 6.2 | +1.3 ± 13.7 | 52.3% ± 9.5 | 57.5% ± 21.1 | +5.2 ± 27.6 |
| trm.Wrekt 1.1.6.f | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 81.3% ± 16.4 | -6.3 ± 14.1 | 60.4% ± 5.8 | 54.5% ± 7.6 | -5.9 ± 7.6 |
| tw.Exterminator 1.0 | hadur2.Hadur 3.10 | 8 | 92.5% ± 8.7 | 88.1% ± 12.1 | -4.4 ± 10.5 | 67.2% ± 14.9 | 53.7% ± 29.8 | -13.4 ± 31.7 |
| tw.Exterminator 1.0 | hadur2.Hadur 3.9 | 8 | 82.5% ± 10.7 | 66.4% ± 20.2 | -16.1 ± 29.3 | 83.9% ± 5.7 | 78.9% ± 5.6 | -5.0 ± 9.0 |
| tzu.TheArtOfWar 1.2 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 89.6% ± 7.5 | 84.9% ± 9.5 | -4.7 ± 12.5 |
| tzu.TheArtOfWar 1.2 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 76.5% ± 3.4 | 81.2% ± 3.8 | +4.7 ± 6.1 |
| vuen.Fractal 0.55 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 91.4% ± 6.2 | 90.2% ± 8.7 | -1.2 ± 11.6 |
| vuen.Fractal 0.55 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 98.8% ± 3.0 | +3.7 ± 8.9 | 67.8% ± 7.5 | 75.9% ± 4.2 | +8.1 ± 8.5 |
| wcsv.Engineer.Engineer 0.5.4 | hadur2.Hadur 3.10 | 8 | 95.0% ± 7.7 | 88.5% ± 11.5 | -6.5 ± 15.6 | 40.8% ± 13.6 | 57.4% ± 11.1 | +16.6 ± 17.9 |
| wcsv.Engineer.Engineer 0.5.4 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 70.0% ± 12.1 | -20.0 ± 8.7 | 50.0% ± 5.3 | 39.5% ± 5.8 | -10.5 ± 4.1 |
| wiki.mini.BlackDestroyer 0.9.0 | hadur2.Hadur 3.10 | 8 | 95.0% ± 7.7 | 98.8% ± 3.0 | +3.7 ± 8.9 | 46.1% ± 20.9 | 46.2% ± 13.6 | +0.1 ± 30.0 |
| wiki.mini.BlackDestroyer 0.9.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 94.9% ± 6.4 | -0.1 ± 7.9 | 62.3% ± 5.0 | 61.9% ± 7.1 | -0.4 ± 7.2 |
| wiki.mini.Sedan 1.0 | hadur2.Hadur 3.10 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 68.2% ± 27.4 | 75.3% ± 18.0 | +7.1 ± 38.2 |
| wiki.mini.Sedan 1.0 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 96.3% ± 6.2 | +6.3 ± 16.1 | 59.7% ± 11.6 | 65.5% ± 6.7 | +5.8 ± 16.1 |
| wilson.Chameleon 0.91 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 81.4% ± 18.5 | 92.2% ± 8.8 | +10.7 ± 21.2 |
| wilson.Chameleon 0.91 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 93.8% ± 6.2 | -3.7 ± 4.3 | 61.2% ± 9.6 | 65.0% ± 6.8 | +3.7 ± 9.1 |
| zen.Lindada 0.2 | hadur2.Hadur 3.10 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 79.6% ± 11.7 | 70.4% ± 9.7 | -9.3 ± 18.0 |
| zen.Lindada 0.2 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 91.3% ± 12.2 | -3.8 ± 16.7 | 65.7% ± 7.5 | 67.8% ± 8.9 | +2.1 ± 9.6 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| AIR.iRobot 1.0 | -2.5 ± 14.0 | +7.5 ± 8.7 | -7.4 ± 25.7 | +16.2 ± 19.4 |
| DM.mega.Bezier 1.618fprrr | +7.5 ± 8.7 | +5.3 ± 6.9 | +13.3 ± 21.3 | -14.6 ± 16.3 |
| KiraNL.ChupaLite 0.4 | +10.0 ± 12.6 | +5.0 ± 4.5 | -3.1 ± 46.0 | -11.3 ± 22.8 |
| Krabb.krabby.Krabby 1.18b | +2.5 ± 5.9 | +0.0 ± 4.5 | +5.2 ± 23.1 | -11.5 ± 11.9 |
| ad.Quest 0.10 | +2.5 ± 20.8 | +1.2 ± 5.4 | -8.3 ± 17.2 | +4.2 ± 13.4 |
| ags.micro.Carpet 1.1 | +10.0 ± 12.6 | -2.6 ± 7.4 | -5.4 ± 28.6 | -32.7 ± 9.7 |
| ahf.r2d2.R2d2 0.86 | +5.0 ± 7.7 | +0.0 ± 0.0 | +9.5 ± 14.4 | -14.4 ± 10.7 |
| amk.ChumbaWumba 0.3 | +5.0 ± 7.7 | -1.2 ± 8.3 | +3.5 ± 21.7 | -3.6 ± 17.2 |
| apv.NanoLauLectrikTheCannibal 1.1 | +5.0 ± 7.7 | -3.7 ± 6.2 | +15.7 ± 12.6 | +0.6 ± 7.3 |
| arthord.KostyaTszyu Beta2 | +5.0 ± 7.7 | +1.2 ± 7.0 | +0.0 ± 25.6 | -13.9 ± 12.4 |
| ary.SMG 1.01 | -0.0 ± 28.3 | +6.9 ± 13.5 | -18.4 ± 15.0 | -9.8 ± 13.2 |
| ary.mini.Nimi 1.0 | +15.0 ± 7.7 | +3.9 ± 6.3 | -5.9 ± 10.7 | +15.2 ± 13.2 |
| brainfade.Fallen 0.63 | +15.0 ± 17.3 | +12.9 ± 9.4 | +13.3 ± 21.8 | -19.3 ± 9.7 |
| bvh.frg.Friga 0.112dev | +0.0 ± 8.9 | +2.5 ± 3.9 | +4.8 ± 27.8 | +13.9 ± 11.3 |
| bvh.mini.Freya 0.55 | +7.5 ± 8.7 | +3.7 ± 4.3 | +38.8 ± 8.4 | +10.5 ± 15.3 |
| casey.Flee 1.0 | +5.0 ± 7.7 | +0.0 ± 4.5 | -14.0 ± 21.9 | -11.7 ± 11.7 |
| cf.mini.Chiva 1.0 | +0.0 ± 15.5 | +3.9 ± 4.5 | -4.5 ± 9.6 | +14.6 ± 5.7 |
| cf.proto.Shiva 2.2 | +15.0 ± 24.9 | +6.4 ± 8.9 | -11.4 ± 11.5 | +12.9 ± 25.6 |
| davidalves.net.DuelistMicroMkII 1.1 | +2.5 ± 10.7 | +3.7 ± 6.2 | +4.8 ± 22.8 | +3.4 ± 8.0 |
| davidalves.net.DuelistMini 1.1 | +10.0 ± 8.9 | +5.0 ± 6.3 | +27.9 ± 26.7 | +1.9 ± 15.3 |
| dft.Cyanide 1.90 | +17.5 ± 20.8 | +15.3 ± 4.8 | +7.5 ± 23.0 | +16.7 ± 14.6 |
| ds.OoV4 0.3b | +5.0 ± 7.7 | -1.2 ± 3.0 | -19.2 ± 22.4 | -28.1 ± 13.5 |
| florent.small.LittleAngel 1.8 | +2.5 ± 10.7 | +2.5 ± 8.7 | -23.2 ± 16.5 | -13.4 ± 8.6 |
| gh.GrubbmGrb 1.2.4 | +0.0 ± 0.0 | +2.5 ± 9.7 | +9.6 ± 6.5 | +18.2 ± 13.1 |
| ins.MobyNano 0.8 | +0.0 ± 8.9 | +1.2 ± 7.0 | -6.1 ± 12.1 | -15.0 ± 18.5 |
| jam.mini.Raiko 0.43 | +7.5 ± 8.7 | +7.5 ± 8.7 | +21.2 ± 23.3 | +3.7 ± 17.5 |
| jcs.Decepticon 2.5.3 | -2.5 ± 18.8 | +7.5 ± 9.7 | -16.5 ± 7.8 | -19.2 ± 20.9 |
| jekl.DarkHallow .90.9 | +20.0 ± 15.5 | +7.2 ± 16.2 | +5.6 ± 25.2 | +5.3 ± 15.3 |
| jekl.Jekyl .70 | +7.5 ± 8.7 | +11.2 ± 7.0 | +6.3 ± 22.9 | +13.1 ± 12.4 |
| jekl.mini.BlackPearl .91 | +5.0 ± 11.8 | +3.7 ± 6.2 | +2.8 ± 18.7 | +16.4 ± 14.8 |
| kawigi.mini.Coriantumr 1.1 | +0.0 ± 0.0 | +1.2 ± 3.0 | +17.7 ± 19.7 | +14.5 ± 10.4 |
| kawigi.mini.Fhqwhgads 1.1 | +5.0 ± 17.3 | +7.5 ± 8.7 | -0.2 ± 20.4 | -4.2 ± 15.1 |
| kc.micro.Thorn 1.252 | +5.6 ± 8.8 | +10.3 ± 12.0 | -7.2 ± 16.5 | +6.4 ± 16.4 |
| kid.Toa .0.5 | +7.5 ± 12.4 | +7.5 ± 9.7 | +2.7 ± 13.9 | -0.8 ± 5.5 |
| kms.Golden 0.10 | +7.5 ± 15.3 | +7.5 ± 15.6 | -13.1 ± 19.1 | -7.5 ± 14.9 |
| lrem.magic.TormentedAngel Antiquitie | +2.5 ± 5.9 | +0.0 ± 4.5 | -21.7 ± 27.3 | -31.8 ± 16.5 |
| lucasslf.Dodger 1.0 | -2.5 ± 14.0 | +2.8 ± 7.9 | -30.1 ± 20.6 | -26.9 ± 16.7 |
| lucasslf.HariSeldon 0.2.1 | +7.5 ± 12.4 | +1.2 ± 3.0 | +10.9 ± 14.5 | +5.1 ± 10.4 |
| lucasslf.Wiggins 0.6 | +12.5 ± 8.7 | +5.0 ± 6.3 | -14.4 ± 17.0 | +6.2 ± 11.5 |
| metal.small.MCool 1.21 | -2.5 ± 5.9 | +0.0 ± 0.0 | +14.9 ± 27.7 | +5.3 ± 13.7 |
| metal.small.dna2.MCoolDNA 1.5 | +0.0 ± 12.6 | +6.2 ± 9.9 | -16.4 ± 21.8 | -3.7 ± 8.2 |
| mk.Alpha 0.2.1 | +0.0 ± 0.0 | +1.4 ± 3.3 | +22.8 ± 5.2 | -0.0 ± 18.1 |
| mladjo.Grrrrr 0.9 | +12.5 ± 12.4 | +20.0 ± 10.0 | -1.2 ± 15.3 | +3.0 ± 16.7 |
| mnt.AHEB 0.6a | +15.0 ± 14.8 | -2.5 ± 7.4 | -5.2 ± 28.6 | -19.4 ± 20.5 |
| myl.micro.NekoNinja 1.30 | -5.0 ± 11.8 | +0.0 ± 0.0 | -4.4 ± 21.1 | +0.3 ± 7.8 |
| nat.Hikari dev0001 | +2.5 ± 10.7 | +6.5 ± 6.7 | -29.1 ± 17.5 | -14.4 ± 8.2 |
| nat.nano.OcnirpPM 1.0 | +15.0 ± 14.8 | -1.2 ± 7.0 | -11.5 ± 18.2 | -9.3 ± 13.9 |
| nat.nano.Ocnirp 1.73 | -10.0 ± 15.5 | -2.5 ± 8.7 | -28.2 ± 21.0 | -16.8 ± 10.5 |
| pe.mini.SandboxMini 1.2 | -7.5 ± 8.7 | +2.5 ± 3.9 | -15.8 ± 13.0 | -9.7 ± 9.4 |
| pez.clean.Swiffer 0.2.9 | -2.5 ± 10.7 | +34.0 ± 30.3 | -19.8 ± 15.3 | +35.1 ± 31.3 |
| pez.mako.Mako 1.5 | +12.5 ± 12.4 | +3.7 ± 6.2 | +16.1 ± 18.6 | +10.5 ± 11.9 |
| ph.micro.Pikeman 0.4.5 | +7.5 ± 8.7 | +12.5 ± 10.7 | +13.8 ± 25.7 | +22.2 ± 17.1 |
| ph.mini.Archer 0.6.6 | +12.5 ± 12.4 | +6.2 ± 6.2 | -19.5 ± 26.0 | -23.0 ± 22.3 |
| pkbots.BoyTDSurfer 1.0 | +32.5 ± 15.3 | +5.3 ± 7.9 | -20.9 ± 13.3 | -16.4 ± 11.6 |
| rcb.Vanessa03 0 | +0.0 ± 12.6 | +1.1 ± 5.6 | -26.6 ± 15.3 | +7.4 ± 14.7 |
| rdt.AgentSmith.AgentSmith 0.5 | +2.5 ± 14.0 | +11.5 ± 7.0 | -2.1 ± 39.0 | +1.7 ± 18.9 |
| robar.micro.Kirbyi 1.0 | +5.0 ± 11.8 | +3.7 ± 9.9 | -8.0 ± 16.7 | -14.0 ± 13.2 |
| rz.Aleph 0.34 | +7.5 ± 12.4 | +15.6 ± 12.0 | +9.6 ± 28.0 | -21.6 ± 14.2 |
| simonton.beta.LifelongObsession 0.5.1 | +25.0 ± 7.7 | +21.5 ± 13.7 | +19.1 ± 18.5 | +12.7 ± 14.8 |
| simonton.micro.GFMicro 1.0 | +0.0 ± 8.9 | +0.0 ± 6.3 | -12.7 ± 13.6 | +4.0 ± 10.7 |
| simonton.mini.WeeksOnEnd 1.10.4 | +30.0 ± 15.5 | +18.8 ± 10.4 | +3.6 ± 14.8 | +12.5 ± 16.4 |
| simonton.nano.WeekendObsession_S 1.7 | +0.0 ± 0.0 | +5.0 ± 4.5 | +4.9 ± 12.3 | -4.8 ± 14.9 |
| spinnercat.CopyKat 1.2.3 | -5.0 ± 7.7 | +3.6 ± 9.0 | -13.5 ± 19.0 | +15.4 ± 16.0 |
| starpkg.StarViewerZ 1.26 | +5.0 ± 7.7 | +2.5 ± 3.9 | -27.1 ± 26.5 | -27.9 ± 22.3 |
| stefw.Tigger 0.0.23 | +5.0 ± 19.5 | +10.0 ± 8.9 | -13.9 ± 15.0 | -9.1 ± 24.1 |
| stelo.Randomness 1.1 | -10.0 ± 8.9 | -5.0 ± 7.7 | -14.4 ± 11.5 | -14.0 ± 11.3 |
| stelo.SteloTestNano 1.0 | -5.0 ± 7.7 | +0.0 ± 4.5 | -2.0 ± 21.6 | -7.8 ± 10.5 |
| suh.nano.RandomPM 1.02 | -7.5 ± 21.8 | +1.2 ± 10.4 | -35.9 ± 18.1 | -15.6 ± 16.7 |
| syl.Centipede 0.5 | +7.5 ± 8.7 | +3.9 ± 4.5 | +34.8 ± 8.4 | -3.6 ± 11.0 |
| theo.Tungsten 1.0a | +5.0 ± 7.7 | +16.4 ± 10.8 | +9.3 ± 8.3 | -0.8 ± 12.1 |
| theo.avenge.Pequod 1.0 | +15.0 ± 11.8 | +15.4 ± 12.7 | +1.2 ± 19.8 | +10.7 ± 17.1 |
| theo.real.Ahab 1.0 | +2.5 ± 5.9 | +24.0 ± 15.6 | -12.0 ± 16.9 | +2.7 ± 7.2 |
| tide.pear.Pear 0.62.1 | +25.0 ± 21.4 | +17.9 ± 5.9 | -2.1 ± 7.0 | +37.0 ± 6.5 |
| trab.Crusader 0.1.7 | +20.0 ± 17.9 | -0.8 ± 17.7 | +8.7 ± 21.7 | -8.1 ± 8.7 |
| trm.Wrekt 1.1.6.f | +5.0 ± 21.4 | +12.5 ± 14.7 | -8.1 ± 12.5 | +3.0 ± 20.6 |
| tw.Exterminator 1.0 | +10.0 ± 15.5 | +21.7 ± 23.3 | -16.7 ± 16.0 | -25.1 ± 30.2 |
| tzu.TheArtOfWar 1.2 | +0.0 ± 0.0 | -1.2 ± 3.0 | +13.1 ± 7.2 | +3.7 ± 11.3 |
| vuen.Fractal 0.55 | +5.0 ± 7.7 | +1.2 ± 3.0 | +23.6 ± 9.9 | +14.3 ± 6.7 |
| wcsv.Engineer.Engineer 0.5.4 | +5.0 ± 7.7 | +18.5 ± 11.3 | -9.1 ± 11.5 | +17.9 ± 12.3 |
| wiki.mini.BlackDestroyer 0.9.0 | +0.0 ± 12.6 | +3.9 ± 7.8 | -16.2 ± 25.1 | -15.7 ± 12.6 |
| wiki.mini.Sedan 1.0 | +7.5 ± 15.3 | +2.5 ± 7.4 | +8.5 ± 30.4 | +9.8 ± 16.3 |
| wilson.Chameleon 0.91 | +2.5 ± 5.9 | +6.2 ± 6.2 | +20.2 ± 22.8 | +27.2 ± 13.1 |
| zen.Lindada 0.2 | +5.0 ± 7.7 | +8.8 ± 12.2 | +14.0 ± 17.6 | +2.5 ± 5.7 |
