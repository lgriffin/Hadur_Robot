# Bench: hadur2.Hadur 3.12shslsmss (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 9958 over 712 battles (14.0 per battle, most in one battle 102). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dft.Cyanide 1.90 | null-both | 99.5% ± 0.2 | 100.0% ± 0.0 | 18.8% ± 6.4 | 280 / 280 | 0.0% ± 0.0 | 1.2% ± 0.5 | 152 | 0 | 0.63 / 16.0 |
| wcsv.Engineer.Engineer 0.5.4 | null-both | 98.3% ± 1.3 | 99.6% ± 0.8 | 5.4% ± 4.1 | 279 / 280 | 0.0% ± 0.0 | 1.6% ± 0.5 | 132 | 0 | 0.61 / 603.8 |
| tide.pear.Pear 0.62.1 | null-both | 99.3% ± 0.5 | 100.0% ± 0.0 | 41.6% ± 30.7 | 280 / 280 | 0.0% ± 0.0 | 0.1% ± 0.1 | 271 | 0 | 0.56 / 435.4 |
| simonton.mini.WeeksOnEnd 1.10.4 | null-both | 99.4% ± 0.3 | 100.0% ± 0.0 | 9.3% ± 6.1 | 280 / 280 | 0.0% ± 0.0 | 0.6% ± 0.1 | 122 | 0 | 0.68 / 101.2 |
| simonton.beta.LifelongObsession 0.5.1 | null-both | 98.0% ± 2.2 | 99.6% ± 0.8 | 4.9% ± 2.1 | 279 / 280 | 0.0% ± 0.0 | 1.4% ± 0.7 | 114 | 0 | 0.62 / 446.7 |
| simonton.mega.SniperFrog 1.0.fix2 | null-both | 99.1% ± 0.8 | 99.6% ± 0.8 | 6.3% ± 14.8 | 279 / 280 | 0.0% ± 0.0 | 0.3% ± 0.1 | 160 | 0 | 0.79 / 228.4 |
| cf.proto.Shiva 2.2 | null-both | 83.2% ± 8.9 | 91.8% ± 7.2 | 44.5% ± 22.9 | 257 / 280 | 7.4% ± 5.2 | 3.7% ± 2.5 | 105 | 0 | 0.95 / 13.8 |
| apv.test.Virus 0.6.1 | null-both | 99.6% ± 0.2 | 100.0% ± 0.0 | 0.0% ± 0.0 | 280 / 280 | 0.0% ± 0.0 | 1.4% ± 0.5 | 95 | 0 | 0.54 / 379.9 |
| rz.Aleph 0.34 | null-both | 98.9% ± 0.7 | 100.0% ± 0.0 | 0.0% ± 0.0 | 280 / 280 | 0.0% ± 0.0 | 0.1% ± 0.1 | 109 | 0 | 0.64 / 241.0 |
| jcs.Decepticon 2.5.3 | null-both | 97.3% ± 0.9 | 100.0% ± 0.0 | 3.3% ± 1.4 | 280 / 280 | 0.3% ± 0.4 | 3.5% ± 0.8 | 80 | 0 | 0.47 / 96.6 |
| rdt.AgentSmith.AgentSmith 0.5 | null-both | 98.9% ± 1.8 | 99.6% ± 0.8 | 12.5% ± 19.4 | 279 / 280 | 0.0% ± 0.0 | 0.1% ± 0.1 | 90 | 0 | 0.87 / 94.2 |
| trab.Crusader 0.1.7 | null-both | 60.1% ± 4.3 | 77.9% ± 5.4 | 34.8% ± 2.8 | 218 / 280 | 5.9% ± 0.7 | 6.3% ± 0.5 | 131 | 0 | 1.44 / 38.9 |
| theo.real.Ahab 1.0 | null-both | 84.6% ± 4.0 | 96.1% ± 2.2 | 37.1% ± 10.9 | 269 / 280 | 2.9% ± 1.1 | 2.6% ± 1.2 | 94 | 0 | 1.34 / 68.6 |
| lucasslf.Wiggins 0.6 | null-both | 97.6% ± 1.5 | 99.3% ± 1.1 | 8.2% ± 12.5 | 278 / 280 | 0.5% ± 0.9 | 1.1% ± 0.1 | 81 | 0 | 0.49 / 341.2 |
| jekl.DarkHallow .90.9 | null-both | 88.6% ± 14.5 | 93.9% ± 8.3 | 11.6% ± 17.1 | 263 / 280 | 2.7% ± 4.2 | 2.8% ± 3.2 | 93 | 0 | 1.13 / 159.1 |
| kid.Gladiator .7.2 | null-both | 99.6% ± 0.5 | 100.0% ± 0.0 | 31.3% ± 21.6 | 280 / 280 | 0.0% ± 0.0 | 0.0% ± 0.0 | 101 | 0 | 0.55 / 450.2 |
| stefw.Tigger 0.0.23 | null-both | 97.8% ± 2.2 | 99.6% ± 0.8 | 13.9% ± 18.8 | 279 / 280 | 0.0% ± 0.0 | 0.2% ± 0.1 | 93 | 0 | 0.50 / 224.5 |
| kc.micro.Thorn 1.252 | null-both | 96.0% ± 2.9 | 98.6% ± 1.3 | 1.6% ± 3.9 | 276 / 280 | 0.0% ± 0.0 | 0.5% ± 0.6 | 104 | 0 | 0.48 / 299.7 |
| ej.ChocolateBar 1.1 | null-both | 99.9% ± 0.2 | 100.0% ± 0.0 | 37.5% ± 19.4 | 280 / 280 | 0.0% ± 0.0 | 0.0% ± 0.0 | 97 | 0 | 0.45 / 278.0 |
| trm.Wrekt 1.1.6.f | null-both | 98.1% ± 0.7 | 100.0% ± 0.0 | 4.4% ± 4.8 | 280 / 280 | 0.0% ± 0.0 | 0.2% ± 0.1 | 90 | 0 | 0.94 / 172.1 |
| jam.mini.Raiko 0.43 | null-both | 98.6% ± 2.9 | 99.6% ± 0.8 | 31.3% ± 21.6 | 279 / 280 | 0.0% ± 0.0 | 0.3% ± 0.6 | 89 | 0 | 0.46 / 194.6 |
| florent.small.LittleAngel 1.8 | null-both | 93.3% ± 3.3 | 99.3% ± 1.1 | 7.5% ± 9.0 | 278 / 280 | 0.3% ± 0.6 | 0.6% ± 0.3 | 102 | 0 | 0.53 / 346.4 |
| theo.Tungsten 1.0a | null-both | 98.5% ± 2.8 | 99.6% ± 0.8 | 25.0% ± 22.3 | 279 / 280 | 0.0% ± 0.0 | 0.4% ± 0.8 | 94 | 0 | 0.55 / 444.0 |
| ary.mini.Nimi 1.0 | null-both | 91.6% ± 9.1 | 96.8% ± 4.1 | 19.6% ± 22.6 | 271 / 280 | 1.9% ± 3.1 | 2.2% ± 2.4 | 106 | 0 | 0.94 / 497.0 |
| kms.Golden 0.10 | null-both | 96.4% ± 4.0 | 98.9% ± 1.2 | 35.5% ± 32.8 | 277 / 280 | 0.2% ± 0.4 | 1.1% ± 1.2 | 148 | 0 | 0.39 / 144.6 |
| pkbots.BoyTDSurfer 1.0 | null-both | 98.6% ± 3.2 | 99.6% ± 0.8 | 25.0% ± 22.3 | 279 / 280 | 0.0% ± 0.0 | 0.4% ± 0.9 | 101 | 0 | 0.47 / 184.3 |
| theo.avenge.Pequod 1.0 | null-both | 86.2% ± 5.3 | 96.4% ± 2.5 | 20.7% ± 14.1 | 270 / 280 | 1.7% ± 1.4 | 1.8% ± 1.1 | 109 | 0 | 1.08 / 277.8 |
| gh.GrubbmGrb 1.2.4 | null-both | 94.2% ± 4.7 | 97.1% ± 3.6 | 9.5% ± 22.6 | 272 / 280 | 1.7% ± 3.2 | 0.8% ± 0.7 | 92 | 0 | 0.47 / 211.3 |
| kid.Toa .0.5 | null-both | 77.5% ± 3.3 | 87.1% ± 2.8 | 63.6% ± 4.9 | 244 / 280 | 8.4% ± 1.5 | 3.8% ± 0.5 | 105 | 0 | 1.07 / 38.0 |
| jam.micro.RaikoMicro 1.44 | null-both | 99.6% ± 0.3 | 100.0% ± 0.0 | 27.3% ± 30.3 | 280 / 280 | 0.0% ± 0.0 | 0.0% ± 0.0 | 132 | 0 | 0.44 / 56.1 |
| vic.Locke 0.7.5.5 | null-both | 100.0% ± 0.0 | 100.0% ± 0.0 | 50.0% ± 0.0 | 280 / 280 | 0.0% ± 0.0 | 0.0% ± 0.0 | 90 | 0 | 0.58 / 112.9 |
| simonton.micro.GFMicro 1.0 | null-both | 89.6% ± 3.4 | 96.4% ± 1.7 | 39.4% ± 33.6 | 270 / 280 | 9.2% ± 8.4 | 5.0% ± 1.7 | 114 | 0 | 0.84 / 20.2 |
| brainfade.Fallen 0.63 | null-both | 90.3% ± 7.1 | 97.5% ± 3.2 | 21.3% ± 22.8 | 273 / 280 | 2.9% ± 4.0 | 2.1% ± 1.6 | 99 | 0 | 0.69 / 283.3 |
| ad.Quest 0.10 | null-both | 90.9% ± 6.2 | 97.1% ± 2.6 | 27.7% ± 19.2 | 272 / 280 | 4.9% ± 3.8 | 3.4% ± 1.0 | 105 | 0 | 0.90 / 320.1 |
| lucasslf.HariSeldon 0.2.1 | null-both | 95.2% ± 4.4 | 97.9% ± 2.1 | 9.7% ± 13.5 | 274 / 280 | 0.4% ± 0.6 | 0.8% ± 0.4 | 96 | 0 | 1.30 / 170.2 |
| wilson.Chameleon 0.91 | null-both | 93.5% ± 6.5 | 97.5% ± 3.2 | 18.5% ± 18.3 | 273 / 280 | 1.7% ± 2.1 | 2.0% ± 1.7 | 93 | 0 | 0.82 / 17.7 |
| wiki.mini.Sedan 1.0 | null-both | 99.6% ± 0.3 | 100.0% ± 0.0 | 0.0% ± 0.0 | 280 / 280 | 0.0% ± 0.0 | 2.2% ± 0.3 | 86 | 0 | 0.46 / 451.1 |
| ph.mini.Archer 0.6.6 | null-both | 97.0% ± 2.2 | 98.9% ± 1.2 | 13.8% ± 5.9 | 277 / 280 | 0.2% ± 0.4 | 2.5% ± 0.5 | 110 | 0 | 0.46 / 563.5 |
| nkn.mini.Jskr0 0.1 | null-both | 93.3% ± 5.5 | 97.5% ± 2.0 | 19.3% ± 22.3 | 273 / 280 | 0.8% ± 1.8 | 0.9% ± 1.2 | 101 | 0 | 0.81 / 714.9 |
| kcn.unnamed.Unnamed 1.21 | null-both | 98.4% ± 2.3 | 99.6% ± 0.8 | 9.1% ± 15.0 | 279 / 280 | 0.0% ± 0.0 | 0.3% ± 0.5 | 105 | 0 | 0.52 / 482.7 |
| metal.small.dna2.MCoolDNA 1.5 | null-both | 98.5% ± 1.7 | 99.3% ± 1.1 | 38.6% ± 36.2 | 278 / 280 | 0.0% ± 0.0 | 0.0% ± 0.0 | 94 | 0 | 0.47 / 256.3 |
| ph.musketeer.Musketeer 0.6 | null-both | 98.1% ± 1.9 | 99.6% ± 0.8 | 18.7% ± 7.9 | 279 / 280 | 0.0% ± 0.0 | 2.2% ± 0.4 | 95 | 0 | 0.45 / 343.7 |
| jekl.Jekyl .70 | null-both | 97.4% ± 2.4 | 99.6% ± 0.8 | 1.0% ± 2.4 | 279 / 280 | 0.0% ± 0.0 | 0.2% ± 0.1 | 95 | 0 | 0.46 / 602.5 |
| mladjo.Grrrrr 0.9 | null-both | 71.6% ± 11.3 | 84.3% ± 8.8 | 35.8% ± 18.6 | 236 / 280 | 6.7% ± 3.8 | 5.2% ± 2.4 | 108 | 0 | 0.96 / 608.5 |
| nat.Hikari dev0001 | null-both | 86.0% ± 4.3 | 97.5% ± 1.5 | 48.0% ± 24.1 | 273 / 280 | 6.5% ± 3.6 | 4.2% ± 1.9 | 97 | 0 | 0.83 / 16.4 |
| pez.gloom.GloomyDark 0.9.2 | null-both | 97.5% ± 3.2 | 99.3% ± 1.1 | 55.2% ± 40.1 | 278 / 280 | 0.0% ± 0.0 | 0.4% ± 0.5 | 167 | 0 | 0.46 / 724.2 |
| jekl.mini.BlackPearl .91 | null-both | 89.9% ± 9.2 | 96.1% ± 4.6 | 7.0% ± 13.8 | 269 / 280 | 1.7% ± 3.4 | 1.6% ± 2.2 | 112 | 0 | 0.99 / 837.7 |
| ph.micro.Pikeman 0.4.5 | null-both | 99.7% ± 0.4 | 100.0% ± 0.0 | 31.3% ± 21.6 | 280 / 280 | 0.0% ± 0.0 | 0.0% ± 0.0 | 106 | 0 | 0.48 / 762.1 |
| wiki.mini.BlackDestroyer 0.9.0 | null-both | 96.0% ± 2.4 | 99.3% ± 1.1 | 28.9% ± 14.3 | 278 / 280 | 2.7% ± 2.1 | 3.3% ± 0.7 | 110 | 0 | 0.47 / 83.0 |
| pez.clean.Swiffer 0.2.9 | null-both | 92.0% ± 4.1 | 97.1% ± 1.3 | 18.8% ± 13.5 | 272 / 280 | 0.5% ± 0.8 | 1.2% ± 1.2 | 109 | 0 | 0.50 / 839.6 |
| dft.Virgin 1.25 | null-both | 95.1% ± 4.1 | 98.6% ± 1.8 | 0.3% ± 0.6 | 276 / 280 | 0.0% ± 0.0 | 0.6% ± 0.7 | 193 | 0 | 0.53 / 728.7 |
| davidalves.net.DuelistMini 1.1 | null-both | 99.7% ± 0.4 | 100.0% ± 0.0 | 32.5% ± 20.4 | 280 / 280 | 0.0% ± 0.0 | 0.0% ± 0.0 | 192 | 0 | 0.59 / 274.7 |
| kawigi.mini.Fhqwhgads 1.1 | null-both | 94.8% ± 2.7 | 98.2% ± 1.2 | 6.9% ± 4.6 | 275 / 280 | 0.7% ± 0.6 | 5.1% ± 0.9 | 136 | 0 | 0.55 / 499.3 |
| reaper.Reaper 1.1 | null-both | 98.5% ± 1.0 | 100.0% ± 0.0 | 14.0% ± 18.7 | 280 / 280 | 0.1% ± 0.3 | 0.3% ± 0.1 | 170 | 0 | 0.66 / 583.7 |
| arthord.KostyaTszyu Beta2 | null-both | 99.6% ± 0.4 | 100.0% ± 0.0 | 25.0% ± 22.3 | 280 / 280 | 0.0% ± 0.0 | 0.0% ± 0.0 | 100 | 0 | 0.46 / 615.7 |
| mk.Alpha 0.2.1 | null-both | 99.8% ± 0.3 | 100.0% ± 0.0 | 31.3% ± 21.6 | 280 / 280 | 0.0% ± 0.0 | 0.0% ± 0.0 | 107 | 0 | 0.53 / 507.7 |
| ahf.r2d2.R2d2 0.86 | null-both | 96.2% ± 2.0 | 98.9% ± 1.2 | 0.2% ± 0.5 | 277 / 280 | 0.0% ± 0.0 | 0.2% ± 0.1 | 96 | 0 | 0.45 / 367.1 |
| kawigi.mini.Coriantumr 1.1 | null-both | 98.5% ± 1.3 | 99.6% ± 0.8 | 33.3% ± 34.8 | 279 / 280 | 0.0% ± 0.0 | 0.1% ± 0.0 | 100 | 0 | 0.48 / 779.5 |
| bvh.frg.Friga 0.112dev | null-both | 99.9% ± 0.2 | 100.0% ± 0.0 | 37.5% ± 19.4 | 280 / 280 | 0.0% ± 0.0 | 0.0% ± 0.0 | 103 | 0 | 0.48 / 655.2 |
| ags.micro.Carpet 1.1 | null-both | 89.9% ± 2.6 | 98.9% ± 1.2 | 39.9% ± 11.3 | 277 / 280 | 7.1% ± 1.8 | 2.7% ± 0.3 | 105 | 0 | 1.34 / 725.7 |
| bvh.mini.Freya 0.55 | null-both | 99.8% ± 0.3 | 100.0% ± 0.0 | 37.5% ± 19.4 | 280 / 280 | 0.0% ± 0.0 | 0.0% ± 0.0 | 91 | 0 | 0.46 / 432.1 |
| robar.micro.Kirbyi 1.0 | null-both | 92.9% ± 2.8 | 99.6% ± 0.8 | 24.8% ± 14.5 | 279 / 280 | 12.3% ± 3.2 | 2.2% ± 0.7 | 101 | 0 | 0.64 / 310.6 |
| davidalves.net.DuelistMicroMkII 1.1 | null-both | 82.3% ± 5.7 | 94.3% ± 3.8 | 50.1% ± 16.7 | 264 / 280 | 6.9% ± 3.5 | 3.2% ± 1.4 | 114 | 0 | 0.85 / 1024.2 |
| mnt.AHEB 0.6a | null-both | 84.2% ± 9.3 | 93.2% ± 5.7 | 26.8% ± 24.5 | 261 / 280 | 4.4% ± 4.0 | 4.5% ± 2.3 | 95 | 0 | 0.72 / 1030.6 |
| lucasslf.Dodger 1.0 | null-both | 97.1% ± 2.3 | 98.9% ± 1.2 | 6.0% ± 4.3 | 277 / 280 | 0.0% ± 0.0 | 1.3% ± 0.2 | 96 | 0 | 0.44 / 30.0 |
| tw.Exterminator 1.0 | null-both | 69.5% ± 4.5 | 58.6% ± 7.3 | 78.5% ± 2.8 | 164 / 280 | 13.4% ± 2.4 | 7.9% ± 1.0 | 241 | 0 | 1.24 / 487.3 |
| Krabb.krabby.Krabby 1.18b | null-both | 94.3% ± 2.7 | 99.3% ± 1.1 | 7.9% ± 17.8 | 278 / 280 | 2.2% ± 1.6 | 0.7% ± 0.4 | 97 | 0 | 0.48 / 14.6 |
| pez.mako.Mako 1.5 | null-both | 95.7% ± 2.2 | 98.6% ± 1.3 | 4.9% ± 6.3 | 276 / 280 | 0.4% ± 0.9 | 0.7% ± 0.1 | 108 | 0 | 0.47 / 237.7 |
| pe.mini.SandboxMini 1.2 | null-both | 99.1% ± 2.1 | 99.6% ± 0.8 | 43.8% ± 14.8 | 279 / 280 | 0.0% ± 0.0 | 0.1% ± 0.2 | 89 | 0 | 0.47 / 16.7 |
| KiraNL.ChupaLite 0.4 | null-both | 99.9% ± 0.1 | 100.0% ± 0.0 | 43.8% ± 14.8 | 280 / 280 | 0.0% ± 0.0 | 0.0% ± 0.0 | 100 | 0 | 0.53 / 591.7 |
| zen.Lindada 0.2 | null-both | 95.3% ± 7.6 | 98.2% ± 3.4 | 37.4% ± 29.5 | 275 / 280 | 0.8% ± 1.8 | 1.0% ± 1.5 | 102 | 0 | 0.61 / 52.6 |
| ds.OoV4 0.3b | null-both | 99.7% ± 0.1 | 100.0% ± 0.0 | 13.9% ± 9.3 | 280 / 280 | 0.0% ± 0.0 | 0.2% ± 0.0 | 115 | 0 | 0.53 / 692.1 |
| simonton.nano.WeekendObsession_S 1.7 | null-both | 88.4% ± 5.6 | 96.4% ± 2.8 | 26.4% ± 24.0 | 270 / 280 | 3.5% ± 3.8 | 2.5% ± 1.9 | 97 | 0 | 0.89 / 14.0 |
| amk.ChumbaWumba 0.3 | null-both | 93.9% ± 5.2 | 97.9% ± 2.5 | 20.6% ± 28.7 | 274 / 280 | 1.7% ± 1.5 | 0.5% ± 0.5 | 105 | 0 | 0.57 / 708.1 |
| tzu.TheArtOfWar 1.2 | null-both | 99.8% ± 0.3 | 100.0% ± 0.0 | 37.5% ± 19.4 | 280 / 280 | 0.0% ± 0.0 | 0.0% ± 0.0 | 93 | 0 | 0.47 / 236.0 |
| suh.nano.RandomPM 1.02 | null-both | 89.7% ± 5.7 | 98.2% ± 2.2 | 23.2% ± 22.1 | 275 / 280 | 2.9% ± 3.1 | 2.0% ± 1.4 | 133 | 0 | 0.93 / 385.2 |
| nat.nano.OcnirpPM 1.0 | null-both | 91.1% ± 3.5 | 99.6% ± 0.8 | 22.2% ± 20.1 | 279 / 280 | 1.8% ± 1.8 | 1.6% ± 0.9 | 112 | 0 | 0.78 / 605.5 |
| nat.nano.Ocnirp 1.73 | null-both | 87.8% ± 6.0 | 98.2% ± 2.5 | 32.9% ± 23.1 | 275 / 280 | 3.9% ± 2.8 | 2.5% ± 1.3 | 103 | 0 | 0.82 / 388.4 |
| lrem.magic.TormentedAngel Antiquitie | null-both | 93.8% ± 5.6 | 97.9% ± 2.5 | 14.0% ± 21.8 | 274 / 280 | 0.8% ± 2.0 | 1.0% ± 1.0 | 106 | 0 | 0.60 / 531.5 |
| spinnercat.CopyKat 1.2.3 | null-both | 87.6% ± 3.4 | 96.8% ± 0.8 | 28.4% ± 25.4 | 271 / 280 | 4.0% ± 3.8 | 3.8% ± 1.2 | 88 | 0 | 0.87 / 156.2 |
| syl.Centipede 0.5 | null-both | 99.8% ± 0.3 | 100.0% ± 0.0 | 37.5% ± 19.4 | 280 / 280 | 0.0% ± 0.0 | 0.0% ± 0.0 | 169 | 0 | 0.54 / 611.8 |
| myl.micro.NekoNinja 1.30 | null-both | 93.4% ± 6.4 | 97.9% ± 2.5 | 35.6% ± 32.4 | 274 / 280 | 3.0% ± 4.4 | 1.5% ± 1.8 | 102 | 0 | 0.85 / 234.2 |
| ins.MobyNano 0.8 | null-both | 88.8% ± 3.2 | 99.3% ± 1.1 | 50.1% ± 9.6 | 278 / 280 | 4.5% ± 2.4 | 3.5% ± 0.9 | 117 | 0 | 0.93 / 561.8 |
| metal.small.MCool 1.21 | null-both | 99.9% ± 0.2 | 100.0% ± 0.0 | 43.8% ± 14.8 | 280 / 280 | 0.0% ± 0.0 | 0.0% ± 0.0 | 94 | 0 | 0.54 / 737.1 |
| starpkg.StarViewerZ 1.26 | null-both | 97.0% ± 4.4 | 98.9% ± 1.8 | 37.0% ± 19.5 | 277 / 280 | 0.3% ± 0.8 | 0.8% ± 1.2 | 101 | 0 | 0.48 / 536.1 |
| apv.NanoLauLectrikTheCannibal 1.1 | null-both | 88.1% ± 4.7 | 96.8% ± 1.5 | 36.4% ± 28.7 | 271 / 280 | 10.6% ± 4.9 | 7.8% ± 1.0 | 104 | 0 | 1.11 / 14.2 |
| stelo.SteloTestNano 1.0 | null-both | 90.5% ± 5.6 | 96.4% ± 2.5 | 16.1% ± 25.0 | 270 / 280 | 2.3% ± 3.6 | 2.3% ± 1.7 | 101 | 0 | 0.59 / 464.7 |
| casey.Flee 1.0 | null-both | 89.9% ± 3.7 | 99.3% ± 1.1 | 32.6% ± 19.7 | 278 / 280 | 2.7% ± 2.0 | 1.8% ± 0.8 | 111 | 0 | 0.76 / 972.4 |
| vuen.Fractal 0.55 | null-both | 97.9% ± 1.1 | 99.6% ± 0.8 | 6.2% ± 2.4 | 279 / 280 | 0.0% ± 0.0 | 0.2% ± 0.0 | 87 | 0 | 0.51 / 17.7 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| dft.Cyanide 1.90 | 8 | 10 | 0.0% | 100.0% | 0.0% | 0.0% | 990 |
| wcsv.Engineer.Engineer 0.5.4 | 8 | 37 | 17.1% | 77.5% | 0.0% | 5.5% | 1054 |
| tide.pear.Pear 0.62.1 | 8 | 16 | 0.0% | 99.2% | 0.8% | 0.0% | 1207 |
| simonton.mini.WeeksOnEnd 1.10.4 | 8 | 13 | 0.0% | 99.0% | 1.0% | 0.0% | 1438 |
| simonton.beta.LifelongObsession 0.5.1 | 8 | 43 | 14.7% | 76.8% | 0.0% | 8.5% | 1460 |
| simonton.mega.SniperFrog 1.0.fix2 | 8 | 18 | 34.7% | 58.3% | 0.0% | 6.9% | 971 |
| cf.proto.Shiva 2.2 | 8 | 676 | 21.3% | 68.7% | 1.6% | 8.5% | 1032 |
| apv.test.Virus 0.6.1 | 8 | 8 | 0.0% | 100.0% | 0.0% | 0.0% | 1034 |
| rz.Aleph 0.34 | 8 | 24 | 0.0% | 100.0% | 0.0% | 0.0% | 1277 |
| jcs.Decepticon 2.5.3 | 8 | 59 | 0.0% | 100.0% | 0.0% | 0.0% | 1063 |
| rdt.AgentSmith.AgentSmith 0.5 | 8 | 24 | 26.0% | 63.0% | 0.0% | 10.9% | 1338 |
| trab.Crusader 0.1.7 | 8 | 1474 | 26.3% | 63.6% | 0.0% | 10.1% | 1178 |
| theo.real.Ahab 1.0 | 8 | 423 | 16.3% | 68.9% | 8.5% | 6.3% | 1378 |
| lucasslf.Wiggins 0.6 | 8 | 52 | 24.2% | 67.1% | 0.0% | 8.7% | 1426 |
| jekl.DarkHallow .90.9 | 8 | 489 | 21.8% | 69.5% | 0.1% | 8.6% | 1163 |
| kid.Gladiator .7.2 | 8 | 8 | 0.0% | 100.0% | 0.0% | 0.0% | 1237 |
| stefw.Tigger 0.0.23 | 8 | 48 | 13.1% | 82.2% | 0.0% | 4.7% | 989 |
| kc.micro.Thorn 1.252 | 8 | 88 | 28.6% | 48.9% | 10.9% | 11.7% | 1310 |
| ej.ChocolateBar 1.1 | 8 | 3 | 0.0% | 100.0% | 0.0% | 0.0% | 1325 |
| trm.Wrekt 1.1.6.f | 8 | 40 | 0.0% | 100.0% | 0.0% | 0.0% | 1298 |
| jam.mini.Raiko 0.43 | 8 | 31 | 20.2% | 29.6% | 38.1% | 12.1% | 1316 |
| florent.small.LittleAngel 1.8 | 8 | 157 | 8.0% | 79.2% | 8.9% | 3.9% | 1306 |
| theo.Tungsten 1.0a | 8 | 33 | 19.2% | 61.9% | 7.3% | 11.5% | 1314 |
| ary.mini.Nimi 1.0 | 8 | 287 | 19.6% | 70.2% | 0.0% | 10.2% | 1368 |
| kms.Golden 0.10 | 8 | 84 | 22.4% | 63.9% | 0.3% | 13.4% | 829 |
| pkbots.BoyTDSurfer 1.0 | 8 | 32 | 19.4% | 26.0% | 39.1% | 15.5% | 1205 |
| theo.avenge.Pequod 1.0 | 8 | 363 | 17.2% | 68.9% | 6.5% | 7.3% | 1285 |
| gh.GrubbmGrb 1.2.4 | 8 | 148 | 33.8% | 54.6% | 0.1% | 11.6% | 1269 |
| kid.Toa .0.5 | 8 | 857 | 26.3% | 64.1% | 0.0% | 9.6% | 1211 |
| jam.micro.RaikoMicro 1.44 | 8 | 8 | 0.0% | 100.0% | 0.0% | 0.0% | 1316 |
| vic.Locke 0.7.5.5 | 8 | - | - | - | - | - | 1319 |
| simonton.micro.GFMicro 1.0 | 8 | 359 | 17.4% | 73.3% | 0.0% | 9.2% | 1133 |
| brainfade.Fallen 0.63 | 8 | 315 | 13.9% | 78.9% | 0.0% | 7.3% | 1191 |
| ad.Quest 0.10 | 8 | 292 | 17.1% | 75.8% | 0.0% | 7.1% | 901 |
| lucasslf.HariSeldon 0.2.1 | 8 | 110 | 34.2% | 52.1% | 0.1% | 13.6% | 1417 |
| wilson.Chameleon 0.91 | 8 | 181 | 24.2% | 62.8% | 0.0% | 13.0% | 1175 |
| wiki.mini.Sedan 1.0 | 8 | 8 | 0.0% | 100.0% | 0.0% | 0.0% | 867 |
| ph.mini.Archer 0.6.6 | 8 | 65 | 28.9% | 59.7% | 0.0% | 11.4% | 1093 |
| nkn.mini.Jskr0 0.1 | 8 | 175 | 24.9% | 62.8% | 1.7% | 10.5% | 890 |
| kcn.unnamed.Unnamed 1.21 | 8 | 34 | 18.2% | 68.4% | 2.9% | 10.5% | 1296 |
| metal.small.dna2.MCoolDNA 1.5 | 8 | 32 | 38.8% | 43.4% | 5.0% | 12.8% | 1308 |
| ph.musketeer.Musketeer 0.6 | 8 | 41 | 15.1% | 77.9% | 0.0% | 6.9% | 1089 |
| jekl.Jekyl .70 | 8 | 57 | 11.0% | 74.8% | 8.2% | 6.0% | 1296 |
| mladjo.Grrrrr 0.9 | 8 | 1164 | 23.6% | 64.0% | 2.1% | 10.3% | 855 |
| nat.Hikari dev0001 | 8 | 512 | 8.5% | 86.5% | 0.0% | 5.0% | 774 |
| pez.gloom.GloomyDark 0.9.2 | 8 | 57 | 22.1% | 52.0% | 13.1% | 12.8% | 1313 |
| jekl.mini.BlackPearl .91 | 8 | 335 | 20.5% | 59.4% | 10.0% | 10.1% | 880 |
| ph.micro.Pikeman 0.4.5 | 8 | 6 | 0.0% | 100.0% | 0.0% | 0.0% | 948 |
| wiki.mini.BlackDestroyer 0.9.0 | 8 | 89 | 14.0% | 79.5% | 0.0% | 6.5% | 1066 |
| pez.clean.Swiffer 0.2.9 | 8 | 188 | 26.6% | 42.5% | 17.8% | 13.1% | 1287 |
| dft.Virgin 1.25 | 8 | 109 | 22.9% | 49.7% | 16.1% | 11.4% | 1152 |
| davidalves.net.DuelistMini 1.1 | 8 | 7 | 0.0% | 100.0% | 0.0% | 0.0% | 1176 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 116 | 26.9% | 58.2% | 2.2% | 12.8% | 886 |
| reaper.Reaper 1.1 | 8 | 33 | 0.0% | 98.1% | 1.9% | 0.0% | 1005 |
| arthord.KostyaTszyu Beta2 | 8 | 8 | 0.0% | 100.0% | 0.0% | 0.0% | 1230 |
| mk.Alpha 0.2.1 | 8 | 5 | 0.0% | 100.0% | 0.0% | 0.0% | 1330 |
| ahf.r2d2.R2d2 0.86 | 8 | 84 | 22.4% | 64.3% | 7.5% | 5.8% | 1298 |
| kawigi.mini.Coriantumr 1.1 | 8 | 33 | 19.2% | 74.7% | 0.0% | 6.1% | 1292 |
| bvh.frg.Friga 0.112dev | 8 | 3 | 0.0% | 100.0% | 0.0% | 0.0% | 1264 |
| ags.micro.Carpet 1.1 | 8 | 267 | 7.0% | 90.1% | 0.0% | 2.9% | 1242 |
| bvh.mini.Freya 0.55 | 8 | 4 | 0.0% | 100.0% | 0.0% | 0.0% | 1097 |
| robar.micro.Kirbyi 1.0 | 8 | 177 | 3.5% | 92.0% | 3.1% | 1.3% | 897 |
| davidalves.net.DuelistMicroMkII 1.1 | 8 | 635 | 15.7% | 77.8% | 0.0% | 6.4% | 996 |
| mnt.AHEB 0.6a | 8 | 526 | 22.6% | 67.5% | 0.0% | 9.9% | 1119 |
| lucasslf.Dodger 1.0 | 8 | 62 | 30.2% | 57.9% | 0.0% | 11.9% | 1401 |
| tw.Exterminator 1.0 | 8 | 1418 | 51.1% | 34.1% | 0.1% | 14.7% | 1833 |
| Krabb.krabby.Krabby 1.18b | 8 | 137 | 9.1% | 86.9% | 0.0% | 4.0% | 852 |
| pez.mako.Mako 1.5 | 8 | 95 | 26.4% | 61.0% | 2.1% | 10.4% | 1138 |
| pe.mini.SandboxMini 1.2 | 8 | 20 | 31.8% | 51.0% | 0.6% | 16.6% | 1151 |
| KiraNL.ChupaLite 0.4 | 8 | 1 | 0.0% | 100.0% | 0.0% | 0.0% | 903 |
| zen.Lindada 0.2 | 8 | 140 | 22.3% | 66.0% | 0.0% | 11.7% | 1166 |
| ds.OoV4 0.3b | 8 | 5 | 0.0% | 100.0% | 0.0% | 0.0% | 1862 |
| simonton.nano.WeekendObsession_S 1.7 | 8 | 345 | 18.1% | 73.9% | 0.3% | 7.7% | 836 |
| amk.ChumbaWumba 0.3 | 8 | 145 | 25.9% | 61.2% | 1.7% | 11.1% | 744 |
| tzu.TheArtOfWar 1.2 | 8 | 4 | 0.0% | 100.0% | 0.0% | 0.0% | 1169 |
| suh.nano.RandomPM 1.02 | 8 | 303 | 10.3% | 85.0% | 0.0% | 4.7% | 809 |
| nat.nano.OcnirpPM 1.0 | 8 | 233 | 2.7% | 95.3% | 0.7% | 1.3% | 731 |
| nat.nano.Ocnirp 1.73 | 8 | 382 | 8.2% | 88.0% | 0.4% | 3.4% | 722 |
| lrem.magic.TormentedAngel Antiquitie | 8 | 164 | 22.8% | 59.7% | 6.1% | 11.4% | 890 |
| spinnercat.CopyKat 1.2.3 | 8 | 356 | 15.8% | 72.1% | 2.7% | 9.4% | 730 |
| syl.Centipede 0.5 | 8 | 4 | 0.0% | 100.0% | 0.0% | 0.0% | 1139 |
| myl.micro.NekoNinja 1.30 | 8 | 228 | 16.4% | 75.5% | 0.0% | 8.0% | 1214 |
| ins.MobyNano 0.8 | 8 | 336 | 3.7% | 94.3% | 0.6% | 1.4% | 776 |
| metal.small.MCool 1.21 | 8 | 2 | 0.0% | 100.0% | 0.0% | 0.0% | 781 |
| starpkg.StarViewerZ 1.26 | 8 | 76 | 24.7% | 60.7% | 0.3% | 14.3% | 2144 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 434 | 13.0% | 80.0% | 0.0% | 7.0% | 787 |
| stelo.SteloTestNano 1.0 | 8 | 269 | 23.2% | 61.6% | 2.6% | 12.6% | 716 |
| casey.Flee 1.0 | 8 | 280 | 4.5% | 93.5% | 0.1% | 1.9% | 720 |
| vuen.Fractal 0.55 | 8 | 46 | 13.7% | 83.5% | 0.0% | 2.7% | 1216 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dft.Cyanide 1.90 | 8 | 8 | 0 | 0 | 0.54 | 0 | 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 8 | 8 | 0 | 0 | 0.47 | 0 | 0 | 0 |
| tide.pear.Pear 0.62.1 | 8 | 5 | 0 | 2 | 0.97 | 1 | 0 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 8 | 8 | 0 | 0 | 0.44 | 0 | 0 | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 8 | 8 | 0 | 0 | 0.41 | 0 | 0 | 0 |
| simonton.mega.SniperFrog 1.0.fix2 | 8 | 8 | 0 | 1 | 0.57 | 0 | 0 | 0 |
| cf.proto.Shiva 2.2 | 8 | 6 | 0 | 0 | 0.38 | 2 | 1 | 0 |
| apv.test.Virus 0.6.1 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| rz.Aleph 0.34 | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| jcs.Decepticon 2.5.3 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| trab.Crusader 0.1.7 | 8 | 7 | 0 | 0 | 0.47 | 1 | 1 | 0 |
| theo.real.Ahab 1.0 | 8 | 7 | 0 | 0 | 0.34 | 1 | 1 | 0 |
| lucasslf.Wiggins 0.6 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| jekl.DarkHallow .90.9 | 8 | 7 | 0 | 0 | 0.33 | 1 | 1 | 0 |
| kid.Gladiator .7.2 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| stefw.Tigger 0.0.23 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| kc.micro.Thorn 1.252 | 8 | 8 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| ej.ChocolateBar 1.1 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| trm.Wrekt 1.1.6.f | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| jam.mini.Raiko 0.43 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| florent.small.LittleAngel 1.8 | 8 | 7 | 0 | 0 | 0.36 | 1 | 1 | 0 |
| theo.Tungsten 1.0a | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| ary.mini.Nimi 1.0 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| kms.Golden 0.10 | 8 | 8 | 0 | 1 | 0.53 | 0 | 0 | 0 |
| pkbots.BoyTDSurfer 1.0 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| theo.avenge.Pequod 1.0 | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| kid.Toa .0.5 | 8 | 7 | 0 | 0 | 0.38 | 1 | 1 | 0 |
| jam.micro.RaikoMicro 1.44 | 8 | 8 | 0 | 1 | 0.47 | 0 | 0 | 0 |
| vic.Locke 0.7.5.5 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| simonton.micro.GFMicro 1.0 | 8 | 8 | 0 | 0 | 0.41 | 0 | 0 | 0 |
| brainfade.Fallen 0.63 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| ad.Quest 0.10 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| lucasslf.HariSeldon 0.2.1 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| wilson.Chameleon 0.91 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| wiki.mini.Sedan 1.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| ph.mini.Archer 0.6.6 | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| nkn.mini.Jskr0 0.1 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| kcn.unnamed.Unnamed 1.21 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| ph.musketeer.Musketeer 0.6 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| jekl.Jekyl .70 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| mladjo.Grrrrr 0.9 | 8 | 4 | 0 | 0 | 0.39 | 4 | 4 | 0 |
| nat.Hikari dev0001 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| pez.gloom.GloomyDark 0.9.2 | 8 | 7 | 0 | 1 | 0.60 | 0 | 0 | 0 |
| jekl.mini.BlackPearl .91 | 8 | 8 | 0 | 0 | 0.40 | 0 | 0 | 0 |
| ph.micro.Pikeman 0.4.5 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| pez.clean.Swiffer 0.2.9 | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| dft.Virgin 1.25 | 8 | 7 | 0 | 1 | 0.69 | 0 | 0 | 0 |
| davidalves.net.DuelistMini 1.1 | 8 | 8 | 0 | 0 | 0.69 | 0 | 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 8 | 0 | 0 | 0.49 | 0 | 0 | 0 |
| reaper.Reaper 1.1 | 8 | 8 | 0 | 1 | 0.61 | 0 | 0 | 0 |
| arthord.KostyaTszyu Beta2 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| mk.Alpha 0.2.1 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| ahf.r2d2.R2d2 0.86 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| bvh.frg.Friga 0.112dev | 8 | 8 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| ags.micro.Carpet 1.1 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| bvh.mini.Freya 0.55 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| robar.micro.Kirbyi 1.0 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 8 | 8 | 0 | 0 | 0.41 | 0 | 0 | 0 |
| mnt.AHEB 0.6a | 8 | 7 | 0 | 0 | 0.34 | 1 | 1 | 0 |
| lucasslf.Dodger 1.0 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| tw.Exterminator 1.0 | 8 | 5 | 0 | 0 | 0.86 | 3 | 3 | 0 |
| Krabb.krabby.Krabby 1.18b | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| pez.mako.Mako 1.5 | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| pe.mini.SandboxMini 1.2 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| KiraNL.ChupaLite 0.4 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| zen.Lindada 0.2 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| ds.OoV4 0.3b | 8 | 8 | 0 | 0 | 0.41 | 0 | 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| amk.ChumbaWumba 0.3 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| tzu.TheArtOfWar 1.2 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| suh.nano.RandomPM 1.02 | 8 | 8 | 0 | 0 | 0.48 | 0 | 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 8 | 8 | 0 | 0 | 0.40 | 0 | 0 | 0 |
| nat.nano.Ocnirp 1.73 | 8 | 7 | 0 | 0 | 0.37 | 1 | 1 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| spinnercat.CopyKat 1.2.3 | 8 | 5 | 0 | 0 | 0.31 | 3 | 3 | 0 |
| syl.Centipede 0.5 | 8 | 7 | 0 | 1 | 0.60 | 0 | 0 | 0 |
| myl.micro.NekoNinja 1.30 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| ins.MobyNano 0.8 | 8 | 8 | 0 | 0 | 0.42 | 0 | 0 | 0 |
| metal.small.MCool 1.21 | 8 | 7 | 0 | 0 | 0.34 | 1 | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 8 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| stelo.SteloTestNano 1.0 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| casey.Flee 1.0 | 8 | 8 | 0 | 0 | 0.40 | 0 | 0 | 0 |
| vuen.Fractal 0.55 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |

686 of 712 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dft.Cyanide 1.90 | 15837 | 368 | 15840 | 15837 (100.0%) | 0 (0.0%) | 3 (0.0%) | 27 | 0 | 46 |
| wcsv.Engineer.Engineer 0.5.4 | 17591 | 411 | 17591 | 17591 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 1 | 36 |
| tide.pear.Pear 0.62.1 | 11562 | 0 | 14340 | 11562 (100.0%) | 0 (0.0%) | 2778 (19.4%) | 8 | 1 | 27 |
| simonton.mini.WeeksOnEnd 1.10.4 | 27194 | 331 | 27193 | 27193 (100.0%) | 1 (0.0%) | 0 (0.0%) | 77 | 5 | 36 |
| simonton.beta.LifelongObsession 0.5.1 | 27749 | 427 | 27738 | 27735 (99.9%) | 14 (0.1%) | 3 (0.0%) | 13 | 5 | 190 |
| simonton.mega.SniperFrog 1.0.fix2 | 15249 | 38 | 15249 | 15249 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 2 | 38 |
| cf.proto.Shiva 2.2 | 12178 | 5 | 13662 | 12177 (100.0%) | 1 (0.0%) | 1485 (10.9%) | 201 | 60 | 66 |
| apv.test.Virus 0.6.1 | 17034 | 419 | 17027 | 17027 (100.0%) | 7 (0.0%) | 0 (0.0%) | 3 | 3 | 34 |
| rz.Aleph 0.34 | 13231 | 0 | 14043 | 13231 (100.0%) | 0 (0.0%) | 812 (5.8%) | 0 | 0 | 38 |
| jcs.Decepticon 2.5.3 | 17385 | 733 | 17380 | 17373 (99.9%) | 12 (0.1%) | 7 (0.0%) | 271 | 26 | 35 |
| rdt.AgentSmith.AgentSmith 0.5 | 14863 | 0 | 15142 | 14863 (100.0%) | 0 (0.0%) | 279 (1.8%) | 0 | 1 | 25 |
| trab.Crusader 0.1.7 | 18264 | 15 | 18264 | 18261 (100.0%) | 3 (0.0%) | 3 (0.0%) | 781 | 128 | 76 |
| theo.real.Ahab 1.0 | 16921 | 4 | 18473 | 16921 (100.0%) | 0 (0.0%) | 1552 (8.4%) | 452 | 25 | 39 |
| lucasslf.Wiggins 0.6 | 27326 | 499 | 27327 | 27326 (100.0%) | 0 (0.0%) | 1 (0.0%) | 23 | 5 | 36 |
| jekl.DarkHallow .90.9 | 14048 | 85 | 14880 | 14046 (100.0%) | 2 (0.0%) | 834 (5.6%) | 422 | 38 | 43 |
| kid.Gladiator .7.2 | 8658 | 0 | 50908 | 8658 (100.0%) | 0 (0.0%) | 42250 (83.0%) | 29 | 7 | 32 |
| stefw.Tigger 0.0.23 | 13667 | 0 | 14067 | 13666 (100.0%) | 1 (0.0%) | 401 (2.9%) | 317 | 10 | 37 |
| kc.micro.Thorn 1.252 | 13714 | 0 | 18995 | 13714 (100.0%) | 0 (0.0%) | 5281 (27.8%) | 59 | 11 | 36 |
| ej.ChocolateBar 1.1 | 15123 | 0 | 17365 | 15123 (100.0%) | 0 (0.0%) | 2242 (12.9%) | 1 | 0 | 28 |
| trm.Wrekt 1.1.6.f | 13098 | 0 | 15666 | 13098 (100.0%) | 0 (0.0%) | 2568 (16.4%) | 23 | 3 | 53 |
| jam.mini.Raiko 0.43 | 15063 | 0 | 17303 | 15063 (100.0%) | 0 (0.0%) | 2240 (12.9%) | 75 | 4 | 30 |
| florent.small.LittleAngel 1.8 | 14739 | 0 | 16791 | 14737 (100.0%) | 2 (0.0%) | 2054 (12.2%) | 199 | 12 | 35 |
| theo.Tungsten 1.0a | 13900 | 0 | 15516 | 13900 (100.0%) | 0 (0.0%) | 1616 (10.4%) | 14 | 0 | 39 |
| ary.mini.Nimi 1.0 | 19108 | 2 | 21191 | 19108 (100.0%) | 0 (0.0%) | 2083 (9.8%) | 152 | 22 | 108 |
| kms.Golden 0.10 | 11836 | 0 | 11836 | 11836 (100.0%) | 0 (0.0%) | 0 (0.0%) | 138 | 0 | 61 |
| pkbots.BoyTDSurfer 1.0 | 21775 | 2 | 21776 | 21775 (100.0%) | 0 (0.0%) | 1 (0.0%) | 72 | 0 | 28 |
| theo.avenge.Pequod 1.0 | 13212 | 2 | 16226 | 13208 (100.0%) | 4 (0.0%) | 3018 (18.6%) | 345 | 22 | 78 |
| gh.GrubbmGrb 1.2.4 | 18482 | 1 | 18482 | 18482 (100.0%) | 0 (0.0%) | 0 (0.0%) | 14 | 9 | 59 |
| kid.Toa .0.5 | 11706 | 2 | 29887 | 11704 (100.0%) | 2 (0.0%) | 18183 (60.8%) | 990 | 106 | 44 |
| jam.micro.RaikoMicro 1.44 | 13736 | 0 | 19026 | 13735 (100.0%) | 1 (0.0%) | 5291 (27.8%) | 4 | 1 | 30 |
| vic.Locke 0.7.5.5 | 15091 | 0 | 17338 | 15091 (100.0%) | 0 (0.0%) | 2247 (13.0%) | 2 | 0 | 19 |
| simonton.micro.GFMicro 1.0 | 20543 | 270 | 20544 | 20543 (100.0%) | 0 (0.0%) | 1 (0.0%) | 113 | 43 | 62 |
| brainfade.Fallen 0.63 | 13181 | 2 | 17142 | 13181 (100.0%) | 0 (0.0%) | 3961 (23.1%) | 157 | 26 | 83 |
| ad.Quest 0.10 | 12037 | 327 | 12038 | 12036 (100.0%) | 1 (0.0%) | 2 (0.0%) | 119 | 22 | 42 |
| lucasslf.HariSeldon 0.2.1 | 26927 | 348 | 26927 | 26926 (100.0%) | 1 (0.0%) | 1 (0.0%) | 68 | 8 | 29 |
| wilson.Chameleon 0.91 | 13633 | 4 | 17583 | 13633 (100.0%) | 0 (0.0%) | 3950 (22.5%) | 49 | 68 | 53 |
| wiki.mini.Sedan 1.0 | 12598 | 542 | 12598 | 12596 (100.0%) | 2 (0.0%) | 2 (0.0%) | 19 | 2 | 26 |
| ph.mini.Archer 0.6.6 | 18631 | 497 | 18631 | 18631 (100.0%) | 0 (0.0%) | 0 (0.0%) | 8 | 1 | 39 |
| nkn.mini.Jskr0 0.1 | 13804 | 1 | 13804 | 13803 (100.0%) | 1 (0.0%) | 1 (0.0%) | 75 | 9 | 29 |
| kcn.unnamed.Unnamed 1.21 | 14762 | 0 | 16205 | 14762 (100.0%) | 0 (0.0%) | 1443 (8.9%) | 7 | 1 | 38 |
| metal.small.dna2.MCoolDNA 1.5 | 13983 | 0 | 19542 | 13983 (100.0%) | 0 (0.0%) | 5559 (28.4%) | 15 | 0 | 34 |
| ph.musketeer.Musketeer 0.6 | 18589 | 447 | 18587 | 18587 (100.0%) | 2 (0.0%) | 0 (0.0%) | 4 | 1 | 38 |
| jekl.Jekyl .70 | 13846 | 0 | 17392 | 13846 (100.0%) | 0 (0.0%) | 3546 (20.4%) | 28 | 1 | 24 |
| mladjo.Grrrrr 0.9 | 13367 | 7 | 13368 | 13367 (100.0%) | 0 (0.0%) | 1 (0.0%) | 520 | 80 | 70 |
| nat.Hikari dev0001 | 11674 | 12 | 11756 | 11658 (99.9%) | 16 (0.1%) | 98 (0.8%) | 654 | 133 | 84 |
| pez.gloom.GloomyDark 0.9.2 | 12574 | 6 | 26407 | 12574 (100.0%) | 0 (0.0%) | 13833 (52.4%) | 64 | 4 | 34 |
| jekl.mini.BlackPearl .91 | 13315 | 0 | 13316 | 13314 (100.0%) | 1 (0.0%) | 2 (0.0%) | 265 | 23 | 37 |
| ph.micro.Pikeman 0.4.5 | 14845 | 0 | 14846 | 14844 (100.0%) | 1 (0.0%) | 2 (0.0%) | 11 | 2 | 28 |
| wiki.mini.BlackDestroyer 0.9.0 | 17312 | 598 | 17311 | 17310 (100.0%) | 2 (0.0%) | 1 (0.0%) | 10 | 8 | 42 |
| pez.clean.Swiffer 0.2.9 | 12518 | 33 | 24985 | 12518 (100.0%) | 0 (0.0%) | 12467 (49.9%) | 259 | 20 | 33 |
| dft.Virgin 1.25 | 10353 | 1 | 12676 | 10352 (100.0%) | 1 (0.0%) | 2324 (18.3%) | 138 | 9 | 39 |
| davidalves.net.DuelistMini 1.1 | 10369 | 0 | 13516 | 10369 (100.0%) | 0 (0.0%) | 3147 (23.3%) | 37 | 1 | 47 |
| kawigi.mini.Fhqwhgads 1.1 | 12961 | 745 | 12959 | 12959 (100.0%) | 2 (0.0%) | 0 (0.0%) | 15 | 2 | 35 |
| reaper.Reaper 1.1 | 13799 | 14 | 13972 | 13798 (100.0%) | 1 (0.0%) | 174 (1.2%) | 413 | 18 | 41 |
| arthord.KostyaTszyu Beta2 | 11365 | 0 | 14860 | 11364 (100.0%) | 1 (0.0%) | 3496 (23.5%) | 157 | 2 | 34 |
| mk.Alpha 0.2.1 | 18263 | 0 | 18423 | 18263 (100.0%) | 0 (0.0%) | 160 (0.9%) | 84 | 4 | 43 |
| ahf.r2d2.R2d2 0.86 | 13785 | 0 | 18427 | 13785 (100.0%) | 0 (0.0%) | 4642 (25.2%) | 99 | 3 | 31 |
| kawigi.mini.Coriantumr 1.1 | 11099 | 0 | 34614 | 11099 (100.0%) | 0 (0.0%) | 23515 (67.9%) | 35 | 4 | 30 |
| bvh.frg.Friga 0.112dev | 12046 | 0 | 15122 | 12046 (100.0%) | 0 (0.0%) | 3076 (20.3%) | 1 | 0 | 27 |
| ags.micro.Carpet 1.1 | 22182 | 332 | 22182 | 22182 (100.0%) | 0 (0.0%) | 0 (0.0%) | 113 | 27 | 44 |
| bvh.mini.Freya 0.55 | 10156 | 0 | 11774 | 10156 (100.0%) | 0 (0.0%) | 1618 (13.7%) | 2 | 0 | 49 |
| robar.micro.Kirbyi 1.0 | 13270 | 188 | 13382 | 13243 (99.8%) | 27 (0.2%) | 139 (1.0%) | 691 | 68 | 35 |
| davidalves.net.DuelistMicroMkII 1.1 | 10346 | 7 | 15602 | 10346 (100.0%) | 0 (0.0%) | 5256 (33.7%) | 268 | 49 | 45 |
| mnt.AHEB 0.6a | 13604 | 86 | 15027 | 13596 (99.9%) | 8 (0.1%) | 1431 (9.5%) | 360 | 36 | 75 |
| lucasslf.Dodger 1.0 | 26748 | 423 | 26747 | 26747 (100.0%) | 1 (0.0%) | 0 (0.0%) | 5 | 8 | 27 |
| tw.Exterminator 1.0 | 40791 | 36 | 40815 | 40791 (100.0%) | 0 (0.0%) | 24 (0.1%) | 2747 | 329 | 216 |
| Krabb.krabby.Krabby 1.18b | 11671 | 3 | 11708 | 11620 (99.6%) | 51 (0.4%) | 88 (0.8%) | 356 | 38 | 55 |
| pez.mako.Mako 1.5 | 12048 | 50 | 12491 | 12044 (100.0%) | 4 (0.0%) | 447 (3.6%) | 148 | 11 | 46 |
| pe.mini.SandboxMini 1.2 | 9224 | 0 | 12010 | 9224 (100.0%) | 0 (0.0%) | 2786 (23.2%) | 1 | 0 | 28 |
| KiraNL.ChupaLite 0.4 | 13988 | 0 | 13988 | 13988 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 1 | 30 |
| zen.Lindada 0.2 | 12703 | 0 | 14515 | 12703 (100.0%) | 0 (0.0%) | 1812 (12.5%) | 68 | 12 | 55 |
| ds.OoV4 0.3b | 31432 | 65 | 32020 | 31427 (100.0%) | 5 (0.0%) | 593 (1.9%) | 54 | 10 | 40 |
| simonton.nano.WeekendObsession_S 1.7 | 12666 | 59 | 12832 | 12659 (99.9%) | 7 (0.1%) | 173 (1.3%) | 1292 | 82 | 38 |
| amk.ChumbaWumba 0.3 | 9500 | 0 | 9500 | 9500 (100.0%) | 0 (0.0%) | 0 (0.0%) | 47 | 5 | 41 |
| tzu.TheArtOfWar 1.2 | 12606 | 0 | 12606 | 12606 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 0 | 27 |
| suh.nano.RandomPM 1.02 | 12149 | 10 | 12168 | 12118 (99.7%) | 31 (0.3%) | 50 (0.4%) | 1148 | 108 | 52 |
| nat.nano.OcnirpPM 1.0 | 9883 | 6 | 9891 | 9848 (99.6%) | 35 (0.4%) | 43 (0.4%) | 1298 | 101 | 32 |
| nat.nano.Ocnirp 1.73 | 9717 | 20 | 9737 | 9675 (99.6%) | 42 (0.4%) | 62 (0.6%) | 1256 | 108 | 45 |
| lrem.magic.TormentedAngel Antiquitie | 13716 | 3 | 13716 | 13716 (100.0%) | 0 (0.0%) | 0 (0.0%) | 63 | 3 | 41 |
| spinnercat.CopyKat 1.2.3 | 9919 | 3 | 9925 | 9910 (99.9%) | 9 (0.1%) | 15 (0.2%) | 512 | 54 | 71 |
| syl.Centipede 0.5 | 9528 | 0 | 9807 | 9528 (100.0%) | 0 (0.0%) | 279 (2.8%) | 0 | 0 | 42 |
| myl.micro.NekoNinja 1.30 | 15407 | 1 | 21090 | 15407 (100.0%) | 0 (0.0%) | 5683 (26.9%) | 131 | 30 | 50 |
| ins.MobyNano 0.8 | 11173 | 222 | 11215 | 11154 (99.8%) | 19 (0.2%) | 61 (0.5%) | 1452 | 149 | 47 |
| metal.small.MCool 1.21 | 10338 | 1 | 10339 | 10338 (100.0%) | 0 (0.0%) | 1 (0.0%) | 1 | 0 | 33 |
| starpkg.StarViewerZ 1.26 | 38033 | 31 | 38579 | 38033 (100.0%) | 0 (0.0%) | 546 (1.4%) | 24 | 1 | 85 |
| apv.NanoLauLectrikTheCannibal 1.1 | 11226 | 519 | 11227 | 11223 (100.0%) | 3 (0.0%) | 4 (0.0%) | 219 | 40 | 49 |
| stelo.SteloTestNano 1.0 | 9046 | 2 | 9047 | 9046 (100.0%) | 0 (0.0%) | 1 (0.0%) | 75 | 12 | 36 |
| casey.Flee 1.0 | 9478 | 16 | 9560 | 9453 (99.7%) | 25 (0.3%) | 107 (1.1%) | 964 | 79 | 38 |
| vuen.Fractal 0.55 | 8999 | 0 | 18755 | 8983 (99.8%) | 16 (0.2%) | 9772 (52.1%) | 129 | 13 | 56 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dft.Cyanide 1.90 | 815 | 15895 (1950.3%) | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 659 | 17572 (2666.5%) | 0 |
| tide.pear.Pear 0.62.1 | 26 | 11490 (44192.3%) | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 894 | 27257 (3048.9%) | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 835 | 27694 (3316.6%) | 0 |
| simonton.mega.SniperFrog 1.0.fix2 | 579 | 15226 (2629.7%) | 0 |
| cf.proto.Shiva 2.2 | 4288 | 8296 (193.5%) | 3060 |
| apv.test.Virus 0.6.1 | 892 | 17111 (1918.3%) | 0 |
| rz.Aleph 0.34 | 78 | 13211 (16937.2%) | 0 |
| jcs.Decepticon 2.5.3 | 774 | 17335 (2239.7%) | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 0 | - | 0 |
| trab.Crusader 0.1.7 | 13080 | 8024 (61.3%) | 10066 |
| theo.real.Ahab 1.0 | 2557 | 14785 (578.2%) | 1261 |
| lucasslf.Wiggins 0.6 | 721 | 27263 (3781.3%) | 0 |
| jekl.DarkHallow .90.9 | 4714 | 11136 (236.2%) | 1988 |
| kid.Gladiator .7.2 | 0 | - | 0 |
| stefw.Tigger 0.0.23 | 536 | 13625 (2542.0%) | 0 |
| kc.micro.Thorn 1.252 | 0 | - | 0 |
| ej.ChocolateBar 1.1 | 0 | - | 0 |
| trm.Wrekt 1.1.6.f | 0 | - | 0 |
| jam.mini.Raiko 0.43 | 0 | - | 0 |
| florent.small.LittleAngel 1.8 | 593 | 14298 (2411.1%) | 0 |
| theo.Tungsten 1.0a | 48 | 13883 (28922.9%) | 0 |
| ary.mini.Nimi 1.0 | 2445 | 17115 (700.0%) | 1688 |
| kms.Golden 0.10 | 616 | 11604 (1883.8%) | 0 |
| pkbots.BoyTDSurfer 1.0 | 532 | 21765 (4091.2%) | 0 |
| theo.avenge.Pequod 1.0 | 2046 | 11919 (582.6%) | 280 |
| gh.GrubbmGrb 1.2.4 | 467 | 18156 (3887.8%) | 186 |
| kid.Toa .0.5 | 11180 | 6657 (59.5%) | 1516 |
| jam.micro.RaikoMicro 1.44 | 0 | - | 0 |
| vic.Locke 0.7.5.5 | 0 | - | 0 |
| simonton.micro.GFMicro 1.0 | 3773 | 17223 (456.5%) | 2463 |
| brainfade.Fallen 0.63 | 1840 | 11567 (628.6%) | 1099 |
| ad.Quest 0.10 | 2691 | 10289 (382.3%) | 1591 |
| lucasslf.HariSeldon 0.2.1 | 989 | 26775 (2707.3%) | 0 |
| wilson.Chameleon 0.91 | 880 | 12666 (1439.3%) | 152 |
| wiki.mini.Sedan 1.0 | 813 | 12595 (1549.2%) | 0 |
| ph.mini.Archer 0.6.6 | 679 | 18374 (2706.0%) | 0 |
| nkn.mini.Jskr0 0.1 | 1306 | 13128 (1005.2%) | 724 |
| kcn.unnamed.Unnamed 1.21 | 0 | - | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 0 | - | 0 |
| ph.musketeer.Musketeer 0.6 | 687 | 18339 (2669.4%) | 0 |
| jekl.Jekyl .70 | 0 | - | 0 |
| mladjo.Grrrrr 0.9 | 7533 | 6941 (92.1%) | 6019 |
| nat.Hikari dev0001 | 4795 | 7572 (157.9%) | 2420 |
| pez.gloom.GloomyDark 0.9.2 | 4 | 12554 (313850.0%) | 0 |
| jekl.mini.BlackPearl .91 | 2183 | 12000 (549.7%) | 540 |
| ph.micro.Pikeman 0.4.5 | 790 | 14840 (1878.5%) | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 658 | 17091 (2597.4%) | 0 |
| pez.clean.Swiffer 0.2.9 | 313 | 12293 (3927.5%) | 0 |
| dft.Virgin 1.25 | 48 | 10320 (21500.0%) | 0 |
| davidalves.net.DuelistMini 1.1 | 126 | 10364 (8225.4%) | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 502 | 12774 (2544.6%) | 0 |
| reaper.Reaper 1.1 | 375 | 13768 (3671.5%) | 0 |
| arthord.KostyaTszyu Beta2 | 18 | 11360 (63111.1%) | 0 |
| mk.Alpha 0.2.1 | 208 | 18259 (8778.4%) | 0 |
| ahf.r2d2.R2d2 0.86 | 58 | 13739 (23687.9%) | 0 |
| kawigi.mini.Coriantumr 1.1 | 3 | 11083 (369433.3%) | 0 |
| bvh.frg.Friga 0.112dev | 0 | - | 0 |
| ags.micro.Carpet 1.1 | 2931 | 19907 (679.2%) | 671 |
| bvh.mini.Freya 0.55 | 218 | 10154 (4657.8%) | 0 |
| robar.micro.Kirbyi 1.0 | 596 | 12805 (2148.5%) | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 4353 | 7156 (164.4%) | 772 |
| mnt.AHEB 0.6a | 2253 | 11403 (506.1%) | 603 |
| lucasslf.Dodger 1.0 | 679 | 26643 (3923.9%) | 0 |
| tw.Exterminator 1.0 | 28575 | 11568 (40.5%) | 27037 |
| Krabb.krabby.Krabby 1.18b | 832 | 11332 (1362.0%) | 0 |
| pez.mako.Mako 1.5 | 132 | 11999 (9090.2%) | 0 |
| pe.mini.SandboxMini 1.2 | 0 | - | 0 |
| KiraNL.ChupaLite 0.4 | 695 | 13987 (2012.5%) | 0 |
| zen.Lindada 0.2 | 563 | 12238 (2173.7%) | 0 |
| ds.OoV4 0.3b | 194 | 31424 (16197.9%) | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 1821 | 11408 (626.5%) | 532 |
| amk.ChumbaWumba 0.3 | 826 | 9320 (1128.3%) | 0 |
| tzu.TheArtOfWar 1.2 | 284 | 12604 (4438.0%) | 0 |
| suh.nano.RandomPM 1.02 | 2067 | 10675 (516.4%) | 427 |
| nat.nano.OcnirpPM 1.0 | 1546 | 9009 (582.7%) | 302 |
| nat.nano.Ocnirp 1.73 | 2605 | 7853 (301.5%) | 259 |
| lrem.magic.TormentedAngel Antiquitie | 945 | 13316 (1409.1%) | 246 |
| spinnercat.CopyKat 1.2.3 | 1956 | 8500 (434.6%) | 1088 |
| syl.Centipede 0.5 | 2 | 9526 (476300.0%) | 0 |
| myl.micro.NekoNinja 1.30 | 2192 | 13566 (618.9%) | 626 |
| ins.MobyNano 0.8 | 2359 | 9477 (401.7%) | 195 |
| metal.small.MCool 1.21 | 770 | 10302 (1337.9%) | 0 |
| starpkg.StarViewerZ 1.26 | 234 | 37803 (16155.1%) | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 2315 | 9000 (388.8%) | 1520 |
| stelo.SteloTestNano 1.0 | 1117 | 8490 (760.1%) | 32 |
| casey.Flee 1.0 | 1972 | 8217 (416.7%) | 185 |
| vuen.Fractal 0.55 | 11 | 8971 (81554.5%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dft.Cyanide 1.90 | 650 | 431 | 650 | 840 | 0.1 / 0.3 | 0 | 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 650 | 353 | 650 | 904 | 0.0 / 0.8 | 0 | 0 | 0 |
| tide.pear.Pear 0.62.1 | 650 | 230 | 650 | 1057 | 0.2 / 0.5 | 0 | 0 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 650 | 468 | 650 | 1288 | 0.0 / 0.4 | 0 | 0 | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 650 | 485 | 650 | 1310 | 0.0 / 0.9 | 0 | 0 | 0 |
| simonton.mega.SniperFrog 1.0.fix2 | 650 | 349 | 650 | 821 | 0.0 / 0.3 | 0 | 0 | 0 |
| cf.proto.Shiva 2.2 | 650 | 449 | 591 | 881 | 21.3 / 13.3 | 997 | 1200 | 4 |
| apv.test.Virus 0.6.1 | 650 | 437 | 650 | 884 | 0.0 / 0.2 | 0 | 0 | 0 |
| rz.Aleph 0.34 | 650 | 458 | 650 | 1127 | 0.0 / 0.7 | 0 | 0 | 0 |
| jcs.Decepticon 2.5.3 | 650 | 392 | 650 | 913 | 0.1 / 1.7 | 0 | 0 | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 650 | 487 | 650 | 1188 | 0.0 / 0.4 | 0 | 0 | 0 |
| trab.Crusader 0.1.7 | 650 | 439 | 650 | 1030 | 14.3 / 26.8 | 193 | 10615 | 6 |
| theo.real.Ahab 1.0 | 650 | 513 | 650 | 1229 | 6.0 / 8.3 | 266 | 958 | 0 |
| lucasslf.Wiggins 0.6 | 650 | 474 | 650 | 1276 | 0.1 / 1.0 | 0 | 0 | 0 |
| jekl.DarkHallow .90.9 | 650 | 396 | 650 | 1014 | 7.4 / 9.7 | 56 | 803 | 34 |
| kid.Gladiator .7.2 | 650 | 470 | 650 | 1087 | 0.0 / 0.2 | 0 | 0 | 0 |
| stefw.Tigger 0.0.23 | 650 | 365 | 650 | 839 | 0.0 / 1.1 | 0 | 0 | 0 |
| kc.micro.Thorn 1.252 | 650 | 429 | 650 | 1160 | 0.0 / 1.2 | 0 | 0 | 0 |
| ej.ChocolateBar 1.1 | 650 | 452 | 650 | 1175 | 0.0 / 0.1 | 0 | 0 | 0 |
| trm.Wrekt 1.1.6.f | 650 | 374 | 650 | 1148 | 0.1 / 1.1 | 0 | 0 | 0 |
| jam.mini.Raiko 0.43 | 650 | 445 | 650 | 1166 | 0.0 / 0.3 | 0 | 0 | 0 |
| florent.small.LittleAngel 1.8 | 650 | 425 | 650 | 1157 | 0.6 / 3.5 | 0 | 271 | 2 |
| theo.Tungsten 1.0a | 650 | 434 | 650 | 1164 | 0.0 / 0.6 | 0 | 0 | 0 |
| ary.mini.Nimi 1.0 | 650 | 497 | 650 | 1218 | 5.5 / 5.8 | 76 | 730 | 0 |
| kms.Golden 0.10 | 650 | 348 | 650 | 679 | 0.5 / 1.5 | 0 | 39 | 54 |
| pkbots.BoyTDSurfer 1.0 | 650 | 329 | 650 | 1055 | 0.0 / 0.2 | 0 | 0 | 0 |
| theo.avenge.Pequod 1.0 | 650 | 518 | 650 | 1135 | 3.2 / 7.1 | 110 | 984 | 99 |
| gh.GrubbmGrb 1.2.4 | 650 | 314 | 619 | 1119 | 2.8 / 2.3 | 124 | 187 | 0 |
| kid.Toa .0.5 | 650 | 427 | 422 | 1063 | 28.0 / 15.7 | 1091 | 525 | 63 |
| jam.micro.RaikoMicro 1.44 | 650 | 444 | 650 | 1166 | 0.0 / 0.2 | 0 | 0 | 0 |
| vic.Locke 0.7.5.5 | 650 | 443 | 650 | 1169 | 0.0 / 0.0 | 0 | 0 | 0 |
| simonton.micro.GFMicro 1.0 | 650 | 412 | 525 | 983 | 19.3 / 7.5 | 396 | 1566 | 244 |
| brainfade.Fallen 0.63 | 650 | 352 | 556 | 1041 | 7.5 / 7.1 | 380 | 591 | 0 |
| ad.Quest 0.10 | 650 | 477 | 600 | 751 | 7.5 / 6.3 | 195 | 980 | 141 |
| lucasslf.HariSeldon 0.2.1 | 650 | 447 | 650 | 1267 | 0.6 / 1.6 | 0 | 117 | 0 |
| wilson.Chameleon 0.91 | 650 | 484 | 650 | 1025 | 2.8 / 3.3 | 52 | 756 | 17 |
| wiki.mini.Sedan 1.0 | 650 | 462 | 650 | 717 | 0.0 / 0.2 | 0 | 0 | 0 |
| ph.mini.Archer 0.6.6 | 650 | 448 | 650 | 943 | 0.1 / 1.1 | 0 | 0 | 0 |
| nkn.mini.Jskr0 0.1 | 650 | 391 | 650 | 740 | 2.2 / 3.1 | 64 | 204 | 281 |
| kcn.unnamed.Unnamed 1.21 | 650 | 456 | 650 | 1146 | 0.0 / 0.7 | 0 | 0 | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 650 | 372 | 650 | 1158 | 0.0 / 0.4 | 0 | 0 | 0 |
| ph.musketeer.Musketeer 0.6 | 650 | 460 | 650 | 939 | 0.1 / 0.9 | 0 | 0 | 0 |
| jekl.Jekyl .70 | 650 | 446 | 650 | 1146 | 0.0 / 1.2 | 0 | 0 | 0 |
| mladjo.Grrrrr 0.9 | 650 | 437 | 650 | 704 | 18.8 / 21.3 | 306 | 2375 | 2386 |
| nat.Hikari dev0001 | 650 | 344 | 600 | 624 | 20.5 / 12.7 | 675 | 1860 | 1223 |
| pez.gloom.GloomyDark 0.9.2 | 650 | 448 | 650 | 1163 | 0.1 / 0.8 | 0 | 0 | 0 |
| jekl.mini.BlackPearl .91 | 650 | 442 | 650 | 730 | 3.8 / 5.7 | 43 | 195 | 348 |
| ph.micro.Pikeman 0.4.5 | 650 | 500 | 650 | 798 | 0.0 / 0.2 | 0 | 0 | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 650 | 429 | 650 | 916 | 0.7 / 2.0 | 0 | 0 | 0 |
| pez.clean.Swiffer 0.2.9 | 650 | 422 | 619 | 1137 | 0.9 / 2.3 | 32 | 178 | 2 |
| dft.Virgin 1.25 | 650 | 425 | 650 | 1002 | 0.0 / 1.5 | 0 | 0 | 0 |
| davidalves.net.DuelistMini 1.1 | 650 | 528 | 650 | 1026 | 0.0 / 0.2 | 0 | 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 650 | 335 | 650 | 736 | 0.2 / 1.9 | 0 | 0 | 0 |
| reaper.Reaper 1.1 | 650 | 413 | 650 | 855 | 0.0 / 0.9 | 0 | 0 | 0 |
| arthord.KostyaTszyu Beta2 | 650 | 429 | 650 | 1080 | 0.0 / 0.2 | 0 | 0 | 0 |
| mk.Alpha 0.2.1 | 650 | 557 | 650 | 1180 | 0.0 / 0.1 | 0 | 0 | 0 |
| ahf.r2d2.R2d2 0.86 | 650 | 489 | 650 | 1148 | 0.0 / 1.5 | 0 | 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 650 | 530 | 650 | 1142 | 0.1 / 0.7 | 0 | 0 | 0 |
| bvh.frg.Friga 0.112dev | 650 | 524 | 650 | 1114 | 0.0 / 0.1 | 0 | 0 | 0 |
| ags.micro.Carpet 1.1 | 650 | 499 | 650 | 1092 | 5.7 / 6.9 | 5 | 436 | 298 |
| bvh.mini.Freya 0.55 | 650 | 509 | 650 | 947 | 0.0 / 0.1 | 0 | 0 | 0 |
| robar.micro.Kirbyi 1.0 | 650 | 242 | 650 | 747 | 2.7 / 4.7 | 48 | 134 | 13 |
| davidalves.net.DuelistMicroMkII 1.1 | 650 | 447 | 619 | 846 | 19.1 / 14.1 | 675 | 2066 | 0 |
| mnt.AHEB 0.6a | 650 | 369 | 556 | 969 | 10.3 / 10.1 | 657 | 944 | 0 |
| lucasslf.Dodger 1.0 | 650 | 387 | 650 | 1251 | 0.0 / 1.0 | 0 | 0 | 0 |
| tw.Exterminator 1.0 | 650 | 492 | 466 | 1680 | 51.1 / 13.8 | 3795 | 1476 | 1417 |
| Krabb.krabby.Krabby 1.18b | 650 | 389 | 619 | 702 | 1.6 / 3.4 | 50 | 125 | 100 |
| pez.mako.Mako 1.5 | 650 | 445 | 650 | 988 | 0.1 / 1.7 | 0 | 0 | 0 |
| pe.mini.SandboxMini 1.2 | 650 | 317 | 650 | 1001 | 0.0 / 0.3 | 0 | 0 | 0 |
| KiraNL.ChupaLite 0.4 | 650 | 429 | 650 | 753 | 0.0 / 0.0 | 0 | 0 | 0 |
| zen.Lindada 0.2 | 650 | 502 | 650 | 1016 | 1.9 / 2.6 | 86 | 273 | 0 |
| ds.OoV4 0.3b | 650 | 463 | 650 | 1712 | 0.0 / 0.2 | 0 | 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 650 | 364 | 616 | 686 | 7.4 / 7.3 | 241 | 1167 | 333 |
| amk.ChumbaWumba 0.3 | 650 | 419 | 650 | 594 | 0.8 / 2.5 | 55 | 47 | 92 |
| tzu.TheArtOfWar 1.2 | 650 | 345 | 650 | 1019 | 0.0 / 0.1 | 0 | 0 | 0 |
| suh.nano.RandomPM 1.02 | 650 | 390 | 619 | 659 | 6.4 / 7.3 | 150 | 934 | 838 |
| nat.nano.OcnirpPM 1.0 | 650 | 370 | 650 | 581 | 3.9 / 6.4 | 42 | 525 | 672 |
| nat.nano.Ocnirp 1.73 | 650 | 397 | 650 | 572 | 9.8 / 9.6 | 219 | 1131 | 1199 |
| lrem.magic.TormentedAngel Antiquitie | 650 | 394 | 622 | 740 | 2.1 / 2.8 | 69 | 260 | 107 |
| spinnercat.CopyKat 1.2.3 | 650 | 355 | 591 | 580 | 7.8 / 7.3 | 196 | 1092 | 977 |
| syl.Centipede 0.5 | 650 | 413 | 650 | 989 | 0.0 / 0.1 | 0 | 0 | 0 |
| myl.micro.NekoNinja 1.30 | 650 | 490 | 619 | 1064 | 9.2 / 4.9 | 212 | 1428 | 40 |
| ins.MobyNano 0.8 | 650 | 394 | 650 | 626 | 10.6 / 9.1 | 194 | 1676 | 416 |
| metal.small.MCool 1.21 | 650 | 451 | 650 | 631 | 0.0 / 0.1 | 0 | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 650 | 412 | 619 | 1994 | 1.1 / 1.3 | 44 | 53 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 650 | 353 | 538 | 637 | 18.4 / 9.9 | 1011 | 2084 | 235 |
| stelo.SteloTestNano 1.0 | 650 | 365 | 588 | 566 | 5.4 / 4.7 | 352 | 393 | 248 |
| casey.Flee 1.0 | 650 | 370 | 650 | 570 | 6.3 / 7.5 | 77 | 1008 | 620 |
| vuen.Fractal 0.55 | 650 | 445 | 650 | 1066 | 0.1 / 1.1 | 0 | 0 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dft.Cyanide 1.90 | 1.2% | 152 | 20 | 3 | 0.0 | 0 / 15895 (0%) | 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 1.6% | 132 | 12 | 3 | 0.0 | 0 / 17572 (0%) | 0 | 0 |
| tide.pear.Pear 0.62.1 | 0.1% | 271 | 22 | 3 | 0.0 | 0 / 11490 (0%) | 0 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 0.6% | 122 | 18 | 3 | 0.0 | 0 / 27257 (0%) | 0 | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 1.4% | 114 | 43 | 3 | 0.0 | 0 / 27694 (0%) | 0 | 0 |
| simonton.mega.SniperFrog 1.0.fix2 | 0.3% | 160 | 18 | 3 | 0.0 | 0 / 15226 (0%) | 0 | 0 |
| cf.proto.Shiva 2.2 | 3.7% | 105 | 30 | 3 | 13.9 | 352 / 8296 (4%) | 0 | 0 |
| apv.test.Virus 0.6.1 | 1.4% | 95 | 23 | 3 | 0.0 | 0 / 17111 (0%) | 0 | 0 |
| rz.Aleph 0.34 | 0.1% | 109 | 31 | 3 | 0.0 | 0 / 13211 (0%) | 0 | 0 |
| jcs.Decepticon 2.5.3 | 3.5% | 80 | 21 | 3 | 0.0 | 0 / 17335 (0%) | 0 | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 0.1% | 90 | 27 | 3 | 0.0 | 0 / 14847 (0%) | 0 | 0 |
| trab.Crusader 0.1.7 | 6.3% | 131 | 94 | 3 | 39.6 | 1153 / 8024 (14%) | 0 | 0 |
| theo.real.Ahab 1.0 | 2.6% | 94 | 42 | 3 | 7.4 | 213 / 14785 (1%) | 0 | 0 |
| lucasslf.Wiggins 0.6 | 1.1% | 81 | 40 | 3 | 0.0 | 0 / 27263 (0%) | 0 | 0 |
| jekl.DarkHallow .90.9 | 2.8% | 93 | 49 | 3 | 11.2 | 296 / 11136 (3%) | 0 | 0 |
| kid.Gladiator .7.2 | 0.0% | 101 | 32 | 3 | 0.0 | 0 / 8654 (0%) | 0 | 0 |
| stefw.Tigger 0.0.23 | 0.2% | 93 | 22 | 3 | 0.0 | 0 / 13625 (0%) | 0 | 0 |
| kc.micro.Thorn 1.252 | 0.5% | 104 | 33 | 3 | 0.0 | 0 / 13676 (0%) | 0 | 0 |
| ej.ChocolateBar 1.1 | 0.0% | 97 | 43 | 3 | 0.0 | 0 / 15120 (0%) | 0 | 0 |
| trm.Wrekt 1.1.6.f | 0.2% | 90 | 21 | 3 | 0.0 | 0 / 13065 (0%) | 0 | 0 |
| jam.mini.Raiko 0.43 | 0.3% | 89 | 39 | 3 | 0.0 | 0 / 15057 (0%) | 0 | 0 |
| florent.small.LittleAngel 1.8 | 0.6% | 102 | 28 | 3 | 1.1 | 19 / 14298 (0%) | 0 | 0 |
| theo.Tungsten 1.0a | 0.4% | 94 | 30 | 3 | 0.0 | 0 / 13883 (0%) | 0 | 0 |
| ary.mini.Nimi 1.0 | 2.2% | 106 | 42 | 3 | 7.7 | 207 / 17115 (1%) | 0 | 0 |
| kms.Golden 0.10 | 1.1% | 148 | 24 | 3 | 0.2 | 4 / 11604 (0%) | 0 | 0 |
| pkbots.BoyTDSurfer 1.0 | 0.4% | 101 | 22 | 3 | 0.0 | 0 / 21765 (0%) | 0 | 0 |
| theo.avenge.Pequod 1.0 | 1.8% | 109 | 31 | 3 | 4.7 | 122 / 11919 (1%) | 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 0.8% | 92 | 24 | 3 | 0.7 | 15 / 18156 (0%) | 0 | 0 |
| kid.Toa .0.5 | 3.8% | 105 | 42 | 3 | 27.4 | 352 / 6657 (5%) | 0 | 0 |
| jam.micro.RaikoMicro 1.44 | 0.0% | 132 | 31 | 3 | 0.0 | 0 / 13730 (0%) | 0 | 0 |
| vic.Locke 0.7.5.5 | 0.0% | 90 | 33 | 3 | 0.0 | 0 / 15090 (0%) | 0 | 0 |
| simonton.micro.GFMicro 1.0 | 5.0% | 114 | 42 | 3 | 11.9 | 287 / 17223 (2%) | 0 | 0 |
| brainfade.Fallen 0.63 | 2.1% | 99 | 33 | 3 | 5.8 | 156 / 11567 (1%) | 0 | 0 |
| ad.Quest 0.10 | 3.4% | 105 | 37 | 3 | 5.8 | 137 / 10289 (1%) | 0 | 0 |
| lucasslf.HariSeldon 0.2.1 | 0.8% | 96 | 42 | 3 | 0.5 | 4 / 26775 (0%) | 0 | 0 |
| wilson.Chameleon 0.91 | 2.0% | 93 | 35 | 3 | 2.6 | 72 / 12666 (1%) | 0 | 0 |
| wiki.mini.Sedan 1.0 | 2.2% | 86 | 40 | 3 | 0.0 | 0 / 12595 (0%) | 0 | 0 |
| ph.mini.Archer 0.6.6 | 2.5% | 110 | 26 | 3 | 0.0 | 0 / 18374 (0%) | 0 | 0 |
| nkn.mini.Jskr0 0.1 | 0.9% | 101 | 32 | 3 | 2.5 | 91 / 13128 (1%) | 0 | 0 |
| kcn.unnamed.Unnamed 1.21 | 0.3% | 105 | 25 | 3 | 0.0 | 0 / 14726 (0%) | 0 | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 0.0% | 94 | 32 | 3 | 0.0 | 0 / 13972 (0%) | 0 | 0 |
| ph.musketeer.Musketeer 0.6 | 2.2% | 95 | 24 | 3 | 0.0 | 0 / 18339 (0%) | 0 | 0 |
| jekl.Jekyl .70 | 0.2% | 95 | 32 | 3 | 0.0 | 0 / 13822 (0%) | 0 | 0 |
| mladjo.Grrrrr 0.9 | 5.2% | 108 | 64 | 3 | 23.9 | 676 / 6941 (10%) | 0 | 0 |
| nat.Hikari dev0001 | 4.2% | 97 | 37 | 3 | 15.7 | 417 / 7572 (6%) | 0 | 0 |
| pez.gloom.GloomyDark 0.9.2 | 0.4% | 167 | 30 | 3 | 0.0 | 0 / 12554 (0%) | 0 | 0 |
| jekl.mini.BlackPearl .91 | 1.6% | 112 | 40 | 3 | 5.0 | 114 / 12000 (1%) | 0 | 0 |
| ph.micro.Pikeman 0.4.5 | 0.0% | 106 | 30 | 3 | 0.0 | 0 / 14840 (0%) | 0 | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 3.3% | 110 | 28 | 3 | 0.0 | 0 / 17091 (0%) | 0 | 0 |
| pez.clean.Swiffer 0.2.9 | 1.2% | 109 | 30 | 3 | 0.7 | 4 / 12293 (0%) | 0 | 0 |
| dft.Virgin 1.25 | 0.6% | 193 | 33 | 3 | 0.0 | 0 / 10320 (0%) | 0 | 0 |
| davidalves.net.DuelistMini 1.1 | 0.0% | 192 | 30 | 3 | 0.0 | 0 / 10364 (0%) | 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 5.1% | 136 | 24 | 3 | 0.0 | 0 / 12774 (0%) | 0 | 0 |
| reaper.Reaper 1.1 | 0.3% | 170 | 43 | 3 | 0.0 | 0 / 13768 (0%) | 0 | 0 |
| arthord.KostyaTszyu Beta2 | 0.0% | 100 | 34 | 3 | 0.0 | 0 / 11360 (0%) | 0 | 0 |
| mk.Alpha 0.2.1 | 0.0% | 107 | 28 | 3 | 0.0 | 0 / 18259 (0%) | 0 | 0 |
| ahf.r2d2.R2d2 0.86 | 0.2% | 96 | 36 | 3 | 0.0 | 0 / 13739 (0%) | 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 0.1% | 100 | 38 | 3 | 0.0 | 0 / 11083 (0%) | 0 | 0 |
| bvh.frg.Friga 0.112dev | 0.0% | 103 | 32 | 3 | 0.0 | 0 / 12043 (0%) | 0 | 0 |
| ags.micro.Carpet 1.1 | 2.7% | 105 | 31 | 3 | 7.3 | 180 / 19907 (1%) | 0 | 0 |
| bvh.mini.Freya 0.55 | 0.0% | 91 | 39 | 3 | 0.0 | 0 / 10154 (0%) | 0 | 0 |
| robar.micro.Kirbyi 1.0 | 2.2% | 101 | 26 | 3 | 1.1 | 28 / 12805 (0%) | 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 3.2% | 114 | 46 | 3 | 12.1 | 298 / 7156 (4%) | 0 | 0 |
| mnt.AHEB 0.6a | 4.5% | 95 | 32 | 3 | 7.6 | 138 / 11403 (1%) | 0 | 0 |
| lucasslf.Dodger 1.0 | 1.3% | 96 | 60 | 3 | 0.0 | 0 / 26643 (0%) | 0 | 0 |
| tw.Exterminator 1.0 | 7.9% | 241 | 120 | 3 | 111.4 | 2797 / 11568 (24%) | 0 | 0 |
| Krabb.krabby.Krabby 1.18b | 0.7% | 97 | 20 | 3 | 1.0 | 21 / 11332 (0%) | 0 | 0 |
| pez.mako.Mako 1.5 | 0.7% | 108 | 31 | 3 | 0.0 | 0 / 11999 (0%) | 0 | 0 |
| pe.mini.SandboxMini 1.2 | 0.1% | 89 | 38 | 3 | 0.0 | 0 / 9217 (0%) | 0 | 0 |
| KiraNL.ChupaLite 0.4 | 0.0% | 100 | 27 | 3 | 0.0 | 0 / 13987 (0%) | 0 | 0 |
| zen.Lindada 0.2 | 1.0% | 102 | 32 | 3 | 1.7 | 25 / 12238 (0%) | 0 | 0 |
| ds.OoV4 0.3b | 0.2% | 115 | 32 | 3 | 0.0 | 0 / 31424 (0%) | 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 2.5% | 97 | 29 | 3 | 4.4 | 98 / 11408 (1%) | 0 | 0 |
| amk.ChumbaWumba 0.3 | 0.5% | 105 | 22 | 3 | 0.5 | 10 / 9320 (0%) | 0 | 0 |
| tzu.TheArtOfWar 1.2 | 0.0% | 93 | 19 | 3 | 0.0 | 0 / 12604 (0%) | 0 | 0 |
| suh.nano.RandomPM 1.02 | 2.0% | 133 | 37 | 3 | 5.2 | 93 / 10675 (1%) | 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 1.6% | 112 | 32 | 3 | 3.2 | 87 / 9009 (1%) | 0 | 0 |
| nat.nano.Ocnirp 1.73 | 2.5% | 103 | 31 | 3 | 6.8 | 154 / 7853 (2%) | 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 1.0% | 106 | 24 | 3 | 1.3 | 29 / 13316 (0%) | 0 | 0 |
| spinnercat.CopyKat 1.2.3 | 3.8% | 88 | 24 | 3 | 4.8 | 135 / 8500 (2%) | 0 | 0 |
| syl.Centipede 0.5 | 0.0% | 169 | 21 | 3 | 0.0 | 0 / 9526 (0%) | 0 | 0 |
| myl.micro.NekoNinja 1.30 | 1.5% | 102 | 35 | 3 | 6.8 | 117 / 13566 (1%) | 0 | 0 |
| ins.MobyNano 0.8 | 3.5% | 117 | 40 | 3 | 6.1 | 137 / 9477 (1%) | 0 | 0 |
| metal.small.MCool 1.21 | 0.0% | 94 | 14 | 3 | 0.0 | 0 / 10302 (0%) | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 0.8% | 101 | 27 | 3 | 0.8 | 19 / 37803 (0%) | 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 7.8% | 104 | 31 | 3 | 6.7 | 174 / 9000 (2%) | 0 | 0 |
| stelo.SteloTestNano 1.0 | 2.3% | 101 | 26 | 3 | 1.9 | 48 / 8490 (1%) | 0 | 0 |
| casey.Flee 1.0 | 1.8% | 111 | 29 | 3 | 4.7 | 101 / 8217 (1%) | 0 | 0 |
| vuen.Fractal 0.55 | 0.2% | 87 | 35 | 3 | 0.0 | 0 / 8971 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dft.Cyanide 1.90 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tide.pear.Pear 0.62.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.mega.SniperFrog 1.0.fix2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cf.proto.Shiva 2.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.test.Virus 0.6.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rz.Aleph 0.34 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jcs.Decepticon 2.5.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| trab.Crusader 0.1.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.real.Ahab 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lucasslf.Wiggins 0.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jekl.DarkHallow .90.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kid.Gladiator .7.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stefw.Tigger 0.0.23 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kc.micro.Thorn 1.252 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ej.ChocolateBar 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| trm.Wrekt 1.1.6.f | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jam.mini.Raiko 0.43 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| florent.small.LittleAngel 1.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.Tungsten 1.0a | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ary.mini.Nimi 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kms.Golden 0.10 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pkbots.BoyTDSurfer 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.avenge.Pequod 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kid.Toa .0.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jam.micro.RaikoMicro 1.44 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| vic.Locke 0.7.5.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.micro.GFMicro 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| brainfade.Fallen 0.63 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ad.Quest 0.10 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lucasslf.HariSeldon 0.2.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wilson.Chameleon 0.91 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wiki.mini.Sedan 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ph.mini.Archer 0.6.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nkn.mini.Jskr0 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kcn.unnamed.Unnamed 1.21 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ph.musketeer.Musketeer 0.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jekl.Jekyl .70 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mladjo.Grrrrr 0.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.Hikari dev0001 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.gloom.GloomyDark 0.9.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jekl.mini.BlackPearl .91 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ph.micro.Pikeman 0.4.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.clean.Swiffer 0.2.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dft.Virgin 1.25 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.net.DuelistMini 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| reaper.Reaper 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| arthord.KostyaTszyu Beta2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mk.Alpha 0.2.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ahf.r2d2.R2d2 0.86 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.frg.Friga 0.112dev | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ags.micro.Carpet 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.mini.Freya 0.55 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.micro.Kirbyi 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mnt.AHEB 0.6a | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lucasslf.Dodger 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tw.Exterminator 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| Krabb.krabby.Krabby 1.18b | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.mako.Mako 1.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pe.mini.SandboxMini 1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| KiraNL.ChupaLite 0.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| zen.Lindada 0.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ds.OoV4 0.3b | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| amk.ChumbaWumba 0.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tzu.TheArtOfWar 1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| suh.nano.RandomPM 1.02 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.nano.Ocnirp 1.73 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| spinnercat.CopyKat 1.2.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| syl.Centipede 0.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| myl.micro.NekoNinja 1.30 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ins.MobyNano 0.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| metal.small.MCool 1.21 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| starpkg.StarViewerZ 1.26 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.SteloTestNano 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| casey.Flee 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| vuen.Fractal 0.55 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| dft.Cyanide 1.90 | dft.Cyanide | 1 | 35 | 278 | 1.3% | 40.6% ± 39.9 | 11.4% | 29.9% / 6.9% | 7.3% | 0 / 0 | T?/M? | 99% |
| wcsv.Engineer.Engineer 0.5.4 | wcsv.Engineer.Engineer | 1 | 35 | 324 | 1.3% | 0.0% ± 21.1 | 10.2% | 16.7% / 15.8% | 5.7% | 0 / 0 | T?/M? | 100% |
| tide.pear.Pear 0.62.1 | tide.pear.Pear | 1 | 35 | 294 | 0.1% | 0.4% ± 0.9 | 7.1% | - / - | 5.2% | 0 / 0 | T0/M? | 99% |
| simonton.mini.WeeksOnEnd 1.10.4 | simonton.mini.WeeksOnEnd | 1 | 35 | 334 | 0.5% | 15.8% ± 26.6 | 7.7% | 41.5% / 25.5% | 3.7% | 0 / 0 | T?/M? | 99% |
| simonton.beta.LifelongObsession 0.5.1 | simonton.beta.LifelongObsession | 1 | 35 | 360 | 1.1% | 19.9% ± 30.8 | 9.5% | 5.1% / 8.2% | 5.0% | 0 / 0 | T?/M? | 99% |
| simonton.mega.SniperFrog 1.0.fix2 | simonton.mega.SniperFrog | 1 | 35 | 338 | 0.3% | 51.3% ± 40.0 | 7.8% | 9.4% / 9.9% | 3.8% | 0 / 0 | T?/M? | 99% |
| cf.proto.Shiva 2.2 | cf.proto.Shiva | 1 | 35 | 288 | 5.2% | 7.3% ± 1.9 | 12.1% | 24.8% / 33.2% | 23.7% | 0 / 0 | T3/M? | 70% |
| apv.test.Virus 0.6.1 | apv.test.Virus | 1 | 35 | 292 | 1.3% | 14.4% ± 38.9 | 7.7% | 55.4% / 26.4% | 5.2% | 0 / 0 | T?/M? | 100% |
| rz.Aleph 0.34 | rz.Aleph | 1 | 35 | 266 | 0.1% | 1.9% ± 3.6 | 0.3% | - / - | 1.9% | 0 / 0 | T?/M? | 98% |
| jcs.Decepticon 2.5.3 | jcs.Decepticon | 1 | 35 | 292 | 4.2% | 24.1% ± 20.5 | 10.0% | 31.8% / 23.1% | 5.9% | 0 / 0 | T?/M? | 99% |
| rdt.AgentSmith.AgentSmith 0.5 | rdt.AgentSmith.AgentSmith | 1 | 35 | 332 | 0.0% | 0.0% ± 7.1 | 0.0% | - / - | 3.6% | 0 / 0 | T?/M? | 100% |
| trab.Crusader 0.1.7 | trab.Crusader | 1 | 35 | 288 | 6.8% | 9.3% ± 1.6 | 9.1% | 19.5% / 26.9% | 2.4% | 0 / 0 | T3/M2 | 57% |
| theo.real.Ahab 1.0 | theo.real.Ahab | 1 | 35 | 288 | 1.6% | 6.0% ± 2.2 | 9.1% | 22.8% / 26.0% | 2.2% | 0 / 0 | T2/M? | 87% |
| lucasslf.Wiggins 0.6 | lucasslf.Wiggins | 1 | 35 | 296 | 1.9% | 24.1% ± 39.4 | 8.3% | 60.8% / 3.3% | 8.2% | 0 / 0 | T?/M? | 99% |
| jekl.DarkHallow .90.9 | jekl.DarkHallow | 1 | 35 | 296 | 1.3% | 0.8% ± 2.9 | 4.1% | 9.9% / 15.7% | 2.0% | 0 / 0 | T0/M? | 100% |
| kid.Gladiator .7.2 | kid.Gladiator | 1 | 35 | 286 | 0.0% | 0.0% ± 0.1 | 0.0% | - / - | 3.1% | 0 / 0 | T0/M? | 99% |
| stefw.Tigger 0.0.23 | stefw.Tigger | 1 | 35 | 286 | 0.2% | 1.9% ± 5.8 | 6.6% | 3.5% / 12.1% | 10.8% | 0 / 0 | T?/M? | 98% |
| kc.micro.Thorn 1.252 | kc.micro.Thorn | 1 | 35 | 292 | 0.1% | 0.1% ± 0.5 | 1.2% | - / - | 5.6% | 0 / 0 | T0/M? | 99% |
| ej.ChocolateBar 1.1 | ej.ChocolateBar | 1 | 35 | 292 | 0.0% | 0.2% ± 1.1 | 0.0% | - / - | 0.8% | 0 / 0 | T0/M? | 100% |
| trm.Wrekt 1.1.6.f | trm.Wrekt | 1 | 35 | 276 | 0.3% | 1.4% ± 1.4 | 1.5% | - / - | 39.8% | 0 / 0 | T0/M? | 97% |
| jam.mini.Raiko 0.43 | jam.mini.Raiko | 1 | 35 | 290 | 0.0% | 0.0% ± 1.0 | 0.0% | - / - | 0.8% | 0 / 0 | T0/M? | 100% |
| florent.small.LittleAngel 1.8 | florent.small.LittleAngel | 1 | 35 | 332 | 0.3% | 1.0% ± 1.4 | 1.8% | - / - | 0.5% | 0 / 0 | T0/M? | 97% |
| theo.Tungsten 1.0a | theo.Tungsten | 1 | 35 | 286 | 0.0% | 0.0% ± 1.5 | 0.3% | - / - | 1.1% | 0 / 0 | T0/M? | 100% |
| ary.mini.Nimi 1.0 | ary.mini.Nimi | 1 | 35 | 284 | 0.0% | 0.4% ± 1.1 | 0.0% | - / - | 27.5% | 0 / 0 | T0/M? | 100% |
| kms.Golden 0.10 | kms.Golden | 1 | 35 | 274 | 0.0% | 0.0% ± 8.4 | 13.7% | - / - | 100.0% | 0 / 0 | T?/M? | 100% |
| pkbots.BoyTDSurfer 1.0 | pkbots.BoyTDSurfer | 1 | 35 | 304 | 0.0% | 74.3% ± 43.6 | 7.7% | - / - | 3.3% | 0 / 0 | T?/M? | 100% |
| theo.avenge.Pequod 1.0 | theo.avenge.Pequod | 1 | 35 | 304 | 1.3% | 3.4% ± 1.5 | 7.6% | 20.2% / 28.2% | 2.2% | 0 / 0 | T1/M? | 82% |
| gh.GrubbmGrb 1.2.4 | gh.GrubbmGrb | 1 | 35 | 284 | 1.0% | 14.1% ± 14.6 | 0.7% | - / - | 2.9% | 0 / 0 | T?/M? | 98% |
| kid.Toa .0.5 | kid.Toa | 1 | 35 | 262 | 2.3% | 2.4% ± 0.6 | 14.1% | 26.0% / 26.1% | 9.4% | 0 / 0 | T1/M0 | 75% |
| jam.micro.RaikoMicro 1.44 | jam.micro.RaikoMicro | 1 | 35 | 314 | 0.0% | 0.0% ± 0.4 | 0.3% | - / - | 3.8% | 0 / 0 | T0/M? | 100% |
| vic.Locke 0.7.5.5 | vic.Locke | 1 | 35 | 276 | 0.0% | 0.0% ± 1.0 | 0.0% | - / - | 3.9% | 0 / 0 | T0/M? | 100% |
| simonton.micro.GFMicro 1.0 | simonton.micro.GFMicro | 1 | 35 | 320 | 2.2% | 2.9% ± 8.5 | 10.2% | 18.3% / 23.0% | 18.7% | 0 / 0 | T?/M? | 92% |
| brainfade.Fallen 0.63 | brainfade.Fallen | 1 | 35 | 298 | 0.4% | 0.1% ± 0.5 | 1.3% | - / - | 98.6% | 0 / 0 | T0/M? | 98% |
| ad.Quest 0.10 | ad.Quest | 1 | 35 | 266 | 3.2% | 24.9% ± 17.8 | 13.5% | 23.2% / 21.9% | 13.5% | 0 / 0 | T?/M? | 96% |
| lucasslf.HariSeldon 0.2.1 | lucasslf.HariSeldon | 1 | 35 | 312 | 0.8% | 45.6% ± 19.2 | 7.0% | 37.9% / 24.3% | 3.3% | 0 / 0 | T?/M? | 94% |
| wilson.Chameleon 0.91 | wilson.Chameleon | 1 | 35 | 298 | 1.4% | 1.9% ± 1.2 | 0.9% | - / - | 41.1% | 0 / 0 | T0/M? | 98% |
| wiki.mini.Sedan 1.0 | wiki.mini.Sedan | 1 | 35 | 292 | 3.9% | - | 7.5% | 2.8% / 8.4% | 5.3% | 0 / 0 | T?/M? | 100% |
| ph.mini.Archer 0.6.6 | ph.mini.Archer | 1 | 35 | 292 | 2.8% | 8.9% ± 43.2 | 27.5% | 30.5% / 12.1% | 7.7% | 0 / 0 | T?/M? | 98% |
| nkn.mini.Jskr0 0.1 | nkn.mini.Jskr0 | 1 | 35 | 288 | 0.6% | 7.7% ± 22.0 | 7.6% | - / - | 5.8% | 0 / 0 | T?/M? | 93% |
| kcn.unnamed.Unnamed 1.21 | kcn.unnamed.Unnamed | 1 | 35 | 310 | 0.0% | 0.0% ± 1.5 | 0.0% | - / - | 1.9% | 0 / 0 | T0/M? | 100% |
| metal.small.dna2.MCoolDNA 1.5 | metal.small.dna2.MCoolDNA | 1 | 35 | 332 | 0.1% | 0.0% ± 0.4 | 2.2% | - / - | 3.9% | 0 / 0 | T0/M? | 96% |
| ph.musketeer.Musketeer 0.6 | ph.musketeer.Musketeer | 1 | 35 | 320 | 2.9% | 12.1% ± 25.9 | 19.8% | 39.4% / 24.4% | 8.2% | 0 / 0 | T?/M? | 94% |
| jekl.Jekyl .70 | jekl.Jekyl | 1 | 35 | 272 | 0.0% | 0.0% ± 0.6 | 0.0% | - / - | 1.7% | 0 / 0 | T0/M? | 99% |
| mladjo.Grrrrr 0.9 | mladjo.Grrrrr | 1 | 35 | 284 | 5.5% | 8.5% ± 2.1 | 11.6% | 25.4% / 22.7% | 6.6% | 0 / 0 | T3/M? | 67% |
| nat.Hikari dev0001 | nat.Hikari | 1 | 35 | 280 | 4.4% | 5.6% ± 1.7 | 12.1% | 31.7% / 33.9% | 20.1% | 0 / 0 | T2/M? | 82% |
| pez.gloom.GloomyDark 0.9.2 | pez.gloom.GloomyDark | 1 | 35 | 316 | 0.2% | 0.0% ± 0.2 | 4.1% | - / - | 8.5% | 0 / 0 | T0/M? | 94% |
| jekl.mini.BlackPearl .91 | jekl.mini.BlackPearl | 1 | 35 | 312 | 0.1% | 100.0% ± 42.9 | 7.2% | - / - | 9.3% | 0 / 0 | T?/M? | 100% |
| ph.micro.Pikeman 0.4.5 | ph.micro.Pikeman | 1 | 35 | 300 | 0.0% | - | 7.2% | - / - | 8.1% | 0 / 0 | T?/M? | 100% |
| wiki.mini.BlackDestroyer 0.9.0 | wiki.mini.BlackDestroyer | 1 | 35 | 332 | 5.2% | 11.6% ± 13.9 | 15.8% | 21.0% / 14.3% | 9.0% | 0 / 0 | T?/M? | 92% |
| pez.clean.Swiffer 0.2.9 | pez.clean.Swiffer | 1 | 35 | 304 | 0.1% | 0.0% ± 0.2 | 6.9% | - / - | 12.4% | 0 / 0 | T0/M? | 95% |
| dft.Virgin 1.25 | dft.Virgin | 1 | 35 | 274 | 0.1% | 0.0% ± 0.9 | 0.3% | 8.7% / 11.0% | 2.0% | 0 / 0 | T0/M? | 99% |
| davidalves.net.DuelistMini 1.1 | davidalves.net.DuelistMini | 1 | 35 | 336 | 0.0% | 0.0% ± 0.6 | 0.9% | 33.8% / 4.2% | 21.8% | 0 / 0 | T0/M? | 100% |
| kawigi.mini.Fhqwhgads 1.1 | kawigi.mini.Fhqwhgads | 1 | 35 | 316 | 5.1% | 12.4% ± 22.1 | 14.7% | 20.2% / 16.2% | 7.4% | 0 / 0 | T?/M? | 93% |
| reaper.Reaper 1.1 | reaper.Reaper | 1 | 35 | 284 | 0.3% | 14.6% ± 13.9 | 4.6% | - / - | 6.0% | 0 / 0 | T?/M? | 97% |
| arthord.KostyaTszyu Beta2 | arthord.KostyaTszyu | 1 | 35 | 312 | 0.0% | 0.0% ± 0.6 | 0.0% | - / - | 1.1% | 0 / 0 | T0/M? | 100% |
| mk.Alpha 0.2.1 | mk.Alpha | 1 | 35 | 268 | 0.0% | 5.2% ± 13.7 | 0.8% | 1.4% / 6.8% | 1.2% | 0 / 0 | T?/M? | 100% |
| ahf.r2d2.R2d2 0.86 | ahf.r2d2.R2d2 | 1 | 35 | 286 | 0.1% | 0.0% ± 0.5 | 1.5% | 3.7% / 23.7% | 2.8% | 0 / 0 | T0/M? | 99% |
| kawigi.mini.Coriantumr 1.1 | kawigi.mini.Coriantumr | 1 | 35 | 320 | 0.1% | 0.0% ± 0.1 | 2.7% | - / - | 1.4% | 0 / 0 | T0/M? | 96% |
| bvh.frg.Friga 0.112dev | bvh.frg.Friga | 1 | 35 | 294 | 0.0% | 0.0% ± 0.7 | 0.0% | - / - | 0.9% | 0 / 0 | T0/M? | 100% |
| ags.micro.Carpet 1.1 | ags.micro.Carpet | 1 | 35 | 296 | 2.9% | 14.4% ± 3.7 | 13.2% | 25.4% / 24.9% | 6.4% | 0 / 0 | T?/M? | 89% |
| bvh.mini.Freya 0.55 | bvh.mini.Freya | 1 | 35 | 290 | 0.1% | 0.0% ± 1.5 | 2.2% | - / - | 10.5% | 0 / 0 | T0/M? | 99% |
| robar.micro.Kirbyi 1.0 | robar.micro.Kirbyi | 1 | 35 | 304 | 3.2% | 8.6% ± 3.8 | 12.5% | 26.4% / 25.2% | 10.2% | 0 / 0 | T?/M? | 87% |
| davidalves.net.DuelistMicroMkII 1.1 | davidalves.net.DuelistMicroMkII | 1 | 35 | 356 | 0.4% | 0.9% ± 0.6 | 1.6% | - / - | 14.3% | 0 / 0 | T0/M? | 95% |
| mnt.AHEB 0.6a | mnt.AHEB | 1 | 35 | 266 | 5.7% | 8.6% ± 2.1 | 13.7% | 29.9% / 31.3% | 75.0% | 0 / 0 | T3/M? | 67% |
| lucasslf.Dodger 1.0 | lucasslf.Dodger | 1 | 35 | 292 | 1.2% | 20.6% ± 33.1 | 14.9% | 22.0% / 16.2% | 5.9% | 0 / 0 | T?/M? | 100% |
| tw.Exterminator 1.0 | tw.Exterminator | 1 | 35 | 292 | 6.4% | 5.8% ± 0.8 | 12.3% | 27.2% / 28.3% | 5.5% | 0 / 0 | T2/M0 | 58% |
| Krabb.krabby.Krabby 1.18b | Krabb.krabby.Krabby | 1 | 35 | 312 | 0.4% | 4.8% ± 12.4 | 7.7% | - / - | 26.4% | 0 / 0 | T?/M? | 97% |
| pez.mako.Mako 1.5 | pez.mako.Mako | 1 | 35 | 284 | 1.0% | 3.0% ± 5.7 | 1.2% | 18.5% / 12.5% | 3.6% | 0 / 0 | T?/M? | 99% |
| pe.mini.SandboxMini 1.2 | pe.mini.SandboxMini | 1 | 35 | 308 | 0.0% | 0.0% ± 0.8 | 0.0% | - / - | 16.2% | 0 / 0 | T0/M? | 100% |
| KiraNL.ChupaLite 0.4 | KiraNL.ChupaLite | 1 | 35 | 296 | 0.0% | - | 7.4% | - / - | 5.1% | 0 / 0 | T?/M? | 100% |
| zen.Lindada 0.2 | zen.Lindada | 1 | 35 | 276 | 0.0% | 0.0% ± 1.2 | 0.0% | - / - | 40.3% | 0 / 0 | T0/M? | 100% |
| ds.OoV4 0.3b | ds.OoV4 | 1 | 35 | 262 | 0.2% | 0.0% ± 3.7 | 2.8% | - / - | 18.0% | 0 / 0 | T?/M? | 100% |
| simonton.nano.WeekendObsession_S 1.7 | simonton.nano.WeekendObsession_S | 1 | 35 | 360 | 0.8% | 25.6% ± 13.1 | 7.7% | - / - | 13.0% | 0 / 0 | T?/M? | 91% |
| amk.ChumbaWumba 0.3 | amk.ChumbaWumba | 1 | 35 | 292 | 1.9% | 9.6% ± 5.2 | 8.9% | 26.2% / 22.3% | 9.5% | 0 / 0 | T?/M? | 81% |
| tzu.TheArtOfWar 1.2 | tzu.TheArtOfWar | 1 | 35 | 292 | 0.0% | - | 0.0% | - / - | 0.7% | 0 / 0 | T?/M? | 100% |
| suh.nano.RandomPM 1.02 | suh.nano.RandomPM | 1 | 35 | 302 | 1.2% | 23.3% ± 13.1 | 8.3% | 30.7% / 17.8% | 16.2% | 0 / 0 | T?/M? | 92% |
| nat.nano.OcnirpPM 1.0 | nat.nano.OcnirpPM | 1 | 35 | 300 | 1.3% | 8.1% ± 6.1 | 9.8% | 37.1% / 27.6% | 10.2% | 0 / 0 | T?/M? | 92% |
| nat.nano.Ocnirp 1.73 | nat.nano.Ocnirp | 1 | 35 | 294 | 1.1% | 41.4% ± 23.6 | 7.7% | 34.8% / 6.9% | 9.8% | 0 / 0 | T?/M? | 94% |
| lrem.magic.TormentedAngel Antiquitie | lrem.magic.TormentedAngel | 1 | 35 | 346 | 0.6% | 6.3% ± 21.6 | 7.5% | - / - | 6.8% | 0 / 0 | T?/M? | 93% |
| spinnercat.CopyKat 1.2.3 | spinnercat.CopyKat | 1 | 35 | 308 | 0.8% | 16.3% ± 22.0 | 7.6% | - / - | 78.3% | 0 / 0 | T?/M? | 91% |
| syl.Centipede 0.5 | syl.Centipede | 1 | 35 | 284 | 0.1% | 4.1% ± 8.9 | 0.0% | - / - | 4.4% | 0 / 0 | T?/M? | 99% |
| myl.micro.NekoNinja 1.30 | myl.micro.NekoNinja | 1 | 35 | 310 | 0.1% | 0.3% ± 0.5 | 1.5% | 8.1% / 8.0% | 12.8% | 0 / 0 | T0/M? | 99% |
| ins.MobyNano 0.8 | ins.MobyNano | 1 | 35 | 280 | 2.2% | 9.8% ± 7.1 | 9.1% | 21.2% / 20.6% | 8.5% | 0 / 0 | T?/M? | 92% |
| metal.small.MCool 1.21 | metal.small.MCool | 1 | 35 | 302 | 0.0% | - | 7.3% | - / - | 10.8% | 0 / 0 | T?/M? | 100% |
| starpkg.StarViewerZ 1.26 | starpkg.StarViewerZ | 1 | 35 | 310 | 0.0% | 0.0% ± 3.8 | 0.0% | - / - | 19.5% | 0 / 0 | T?/M? | 100% |
| apv.NanoLauLectrikTheCannibal 1.1 | apv.NanoLauLectrikTheCannibal | 1 | 35 | 348 | 13.4% | 12.3% ± 5.5 | 19.5% | - / - | 100.0% | 0 / 0 | T?/M? | 92% |
| stelo.SteloTestNano 1.0 | stelo.SteloTestNano | 1 | 35 | 308 | 0.2% | 11.7% ± 38.7 | 7.6% | - / - | 9.5% | 0 / 0 | T?/M? | 99% |
| casey.Flee 1.0 | casey.Flee | 1 | 35 | 272 | 0.9% | 19.1% ± 14.6 | 8.0% | 32.4% / 25.3% | 7.7% | 0 / 0 | T?/M? | 93% |
| vuen.Fractal 0.55 | vuen.Fractal | 1 | 35 | 282 | 0.1% | 0.0% ± 0.2 | 3.5% | 0.9% / 24.0% | 5.0% | 0 / 0 | T0/M? | 99% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.12shslsmss vs hadur2.Hadur 3.12

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| dft.Cyanide 1.90 | 99.5% ± 0.2 | 95.6% ± 2.2 | +3.9 ± 2.3 |
| wcsv.Engineer.Engineer 0.5.4 | 98.3% ± 1.3 | 77.2% ± 4.2 | +21.1 ± 3.6 |
| tide.pear.Pear 0.62.1 | 99.3% ± 0.5 | 84.8% ± 1.2 | +14.4 ± 1.6 |
| simonton.mini.WeeksOnEnd 1.10.4 | 99.4% ± 0.3 | 93.1% ± 2.3 | +6.3 ± 2.2 |
| simonton.beta.LifelongObsession 0.5.1 | 98.0% ± 2.2 | 91.8% ± 2.4 | +6.3 ± 2.2 |
| simonton.mega.SniperFrog 1.0.fix2 | 99.1% ± 0.8 | 93.8% ± 1.9 | +5.3 ± 2.0 |
| cf.proto.Shiva 2.2 | 83.2% ± 8.9 | 93.5% ± 2.4 | -10.3 ± 8.8 |
| apv.test.Virus 0.6.1 | 99.6% ± 0.2 | 87.4% ± 2.5 | +12.2 ± 2.5 |
| rz.Aleph 0.34 | 98.9% ± 0.7 | 90.2% ± 4.0 | +8.7 ± 4.3 |
| jcs.Decepticon 2.5.3 | 97.3% ± 0.9 | 79.3% ± 3.4 | +17.9 ± 3.1 |
| rdt.AgentSmith.AgentSmith 0.5 | 98.9% ± 1.8 | 91.9% ± 2.6 | +7.0 ± 2.8 |
| trab.Crusader 0.1.7 | 60.1% ± 4.3 | 72.9% ± 4.8 | -12.8 ± 4.4 |
| theo.real.Ahab 1.0 | 84.6% ± 4.0 | 87.3% ± 3.2 | -2.6 ± 4.4 |
| lucasslf.Wiggins 0.6 | 97.6% ± 1.5 | 92.8% ± 3.1 | +4.8 ± 3.0 |
| jekl.DarkHallow .90.9 | 88.6% ± 14.5 | 91.3% ± 2.5 | -2.7 ± 15.6 |
| kid.Gladiator .7.2 | 99.6% ± 0.5 | 96.8% ± 1.9 | +2.8 ± 1.8 |
| stefw.Tigger 0.0.23 | 97.8% ± 2.2 | 86.5% ± 4.5 | +11.3 ± 3.8 |
| kc.micro.Thorn 1.252 | 96.0% ± 2.9 | 85.6% ± 5.8 | +10.4 ± 4.8 |
| ej.ChocolateBar 1.1 | 99.9% ± 0.2 | 91.9% ± 2.2 | +8.0 ± 2.3 |
| trm.Wrekt 1.1.6.f | 98.1% ± 0.7 | 84.4% ± 4.5 | +13.7 ± 4.6 |
| jam.mini.Raiko 0.43 | 98.6% ± 2.9 | 91.2% ± 3.4 | +7.5 ± 4.3 |
| florent.small.LittleAngel 1.8 | 93.3% ± 3.3 | 84.2% ± 4.1 | +9.0 ± 6.2 |
| theo.Tungsten 1.0a | 98.5% ± 2.8 | 89.0% ± 2.9 | +9.6 ± 3.9 |
| ary.mini.Nimi 1.0 | 91.6% ± 9.1 | 93.5% ± 2.0 | -1.9 ± 8.8 |
| kms.Golden 0.10 | 96.4% ± 4.0 | 81.6% ± 3.8 | +14.8 ± 5.4 |
| pkbots.BoyTDSurfer 1.0 | 98.6% ± 3.2 | 86.4% ± 3.7 | +12.2 ± 4.6 |
| theo.avenge.Pequod 1.0 | 86.2% ± 5.3 | 85.0% ± 3.5 | +1.2 ± 7.7 |
| gh.GrubbmGrb 1.2.4 | 94.2% ± 4.7 | 84.6% ± 9.3 | +9.6 ± 10.1 |
| kid.Toa .0.5 | 77.5% ± 3.3 | 91.2% ± 4.2 | -13.7 ± 4.4 |
| jam.micro.RaikoMicro 1.44 | 99.6% ± 0.3 | 91.4% ± 6.2 | +8.2 ± 6.4 |
| vic.Locke 0.7.5.5 | 100.0% ± 0.0 | 88.7% ± 4.1 | +11.3 ± 4.1 |
| simonton.micro.GFMicro 1.0 | 89.6% ± 3.4 | 91.9% ± 1.7 | -2.3 ± 3.9 |
| brainfade.Fallen 0.63 | 90.3% ± 7.1 | 93.8% ± 2.6 | -3.4 ± 5.2 |
| ad.Quest 0.10 | 90.9% ± 6.2 | 89.0% ± 3.9 | +1.9 ± 8.2 |
| lucasslf.HariSeldon 0.2.1 | 95.2% ± 4.4 | 96.2% ± 1.2 | -0.9 ± 4.7 |
| wilson.Chameleon 0.91 | 93.5% ± 6.5 | 97.9% ± 1.4 | -4.5 ± 5.5 |
| wiki.mini.Sedan 1.0 | 99.6% ± 0.3 | 92.8% ± 2.9 | +6.8 ± 2.8 |
| ph.mini.Archer 0.6.6 | 97.0% ± 2.2 | 85.0% ± 2.7 | +12.0 ± 2.9 |
| nkn.mini.Jskr0 0.1 | 93.3% ± 5.5 | 93.7% ± 1.5 | -0.4 ± 5.8 |
| kcn.unnamed.Unnamed 1.21 | 98.4% ± 2.3 | 93.2% ± 3.1 | +5.2 ± 3.7 |
| metal.small.dna2.MCoolDNA 1.5 | 98.5% ± 1.7 | 88.9% ± 4.5 | +9.6 ± 5.8 |
| ph.musketeer.Musketeer 0.6 | 98.1% ± 1.9 | 83.4% ± 5.2 | +14.7 ± 4.6 |
| jekl.Jekyl .70 | 97.4% ± 2.4 | 92.6% ± 2.8 | +4.8 ± 1.8 |
| mladjo.Grrrrr 0.9 | 71.6% ± 11.3 | 90.3% ± 2.6 | -18.7 ± 12.5 |
| nat.Hikari dev0001 | 86.0% ± 4.3 | 86.6% ± 3.8 | -0.5 ± 6.0 |
| pez.gloom.GloomyDark 0.9.2 | 97.5% ± 3.2 | 92.1% ± 2.4 | +5.4 ± 3.0 |
| jekl.mini.BlackPearl .91 | 89.9% ± 9.2 | 94.7% ± 2.1 | -4.8 ± 8.6 |
| ph.micro.Pikeman 0.4.5 | 99.7% ± 0.4 | 93.2% ± 2.4 | +6.5 ± 2.2 |
| wiki.mini.BlackDestroyer 0.9.0 | 96.0% ± 2.4 | 88.9% ± 3.9 | +7.1 ± 3.9 |
| pez.clean.Swiffer 0.2.9 | 92.0% ± 4.1 | 90.5% ± 1.8 | +1.5 ± 4.8 |
| dft.Virgin 1.25 | 95.1% ± 4.1 | 93.5% ± 2.8 | +1.6 ± 5.1 |
| davidalves.net.DuelistMini 1.1 | 99.7% ± 0.4 | 97.2% ± 1.7 | +2.4 ± 1.8 |
| kawigi.mini.Fhqwhgads 1.1 | 94.8% ± 2.7 | 87.7% ± 3.7 | +7.0 ± 4.0 |
| reaper.Reaper 1.1 | 98.5% ± 1.0 | 95.7% ± 3.1 | +2.8 ± 3.3 |
| arthord.KostyaTszyu Beta2 | 99.6% ± 0.4 | 87.0% ± 3.8 | +12.6 ± 3.7 |
| mk.Alpha 0.2.1 | 99.8% ± 0.3 | 98.2% ± 0.9 | +1.5 ± 0.8 |
| ahf.r2d2.R2d2 0.86 | 96.2% ± 2.0 | 92.7% ± 2.6 | +3.5 ± 3.2 |
| kawigi.mini.Coriantumr 1.1 | 98.5% ± 1.3 | 97.7% ± 1.0 | +0.8 ± 1.6 |
| bvh.frg.Friga 0.112dev | 99.9% ± 0.2 | 96.8% ± 2.0 | +3.0 ± 2.1 |
| ags.micro.Carpet 1.1 | 89.9% ± 2.6 | 86.9% ± 2.9 | +3.0 ± 3.4 |
| bvh.mini.Freya 0.55 | 99.8% ± 0.3 | 98.1% ± 1.9 | +1.8 ± 1.9 |
| robar.micro.Kirbyi 1.0 | 92.9% ± 2.8 | 85.4% ± 4.4 | +7.5 ± 5.4 |
| davidalves.net.DuelistMicroMkII 1.1 | 82.3% ± 5.7 | 84.6% ± 4.4 | -2.3 ± 6.3 |
| mnt.AHEB 0.6a | 84.2% ± 9.3 | 89.2% ± 4.4 | -5.0 ± 10.7 |
| lucasslf.Dodger 1.0 | 97.1% ± 2.3 | 86.9% ± 6.5 | +10.2 ± 8.0 |
| tw.Exterminator 1.0 | 69.5% ± 4.5 | 89.7% ± 5.6 | -20.2 ± 7.6 |
| Krabb.krabby.Krabby 1.18b | 94.3% ± 2.7 | 93.6% ± 3.0 | +0.7 ± 4.2 |
| pez.mako.Mako 1.5 | 95.7% ± 2.2 | 93.1% ± 4.5 | +2.5 ± 5.9 |
| pe.mini.SandboxMini 1.2 | 99.1% ± 2.1 | 87.8% ± 3.9 | +11.3 ± 5.1 |
| KiraNL.ChupaLite 0.4 | 99.9% ± 0.1 | 88.3% ± 5.3 | +11.7 ± 5.2 |
| zen.Lindada 0.2 | 95.3% ± 7.6 | 94.1% ± 1.6 | +1.2 ± 8.1 |
| ds.OoV4 0.3b | 99.7% ± 0.1 | 94.0% ± 1.3 | +5.7 ± 1.4 |
| simonton.nano.WeekendObsession_S 1.7 | 88.4% ± 5.6 | 85.1% ± 3.5 | +3.4 ± 5.8 |
| amk.ChumbaWumba 0.3 | 93.9% ± 5.2 | 87.6% ± 4.6 | +6.3 ± 7.6 |
| tzu.TheArtOfWar 1.2 | 99.8% ± 0.3 | 97.1% ± 1.7 | +2.7 ± 1.8 |
| suh.nano.RandomPM 1.02 | 89.7% ± 5.7 | 81.6% ± 4.9 | +8.1 ± 7.7 |
| nat.nano.OcnirpPM 1.0 | 91.1% ± 3.5 | 84.1% ± 3.3 | +6.9 ± 3.4 |
| nat.nano.Ocnirp 1.73 | 87.8% ± 6.0 | 82.0% ± 1.6 | +5.8 ± 5.5 |
| lrem.magic.TormentedAngel Antiquitie | 93.8% ± 5.6 | 86.0% ± 2.7 | +7.9 ± 7.5 |
| spinnercat.CopyKat 1.2.3 | 87.6% ± 3.4 | 87.7% ± 1.9 | -0.2 ± 3.2 |
| syl.Centipede 0.5 | 99.8% ± 0.3 | 96.9% ± 1.8 | +3.0 ± 1.7 |
| myl.micro.NekoNinja 1.30 | 93.4% ± 6.4 | 91.8% ± 3.2 | +1.6 ± 7.6 |
| ins.MobyNano 0.8 | 88.8% ± 3.2 | 88.7% ± 3.1 | +0.1 ± 4.7 |
| metal.small.MCool 1.21 | 99.9% ± 0.2 | 97.1% ± 1.4 | +2.8 ± 1.5 |
| starpkg.StarViewerZ 1.26 | 97.0% ± 4.4 | 95.6% ± 1.6 | +1.3 ± 3.8 |
| apv.NanoLauLectrikTheCannibal 1.1 | 88.1% ± 4.7 | 91.2% ± 2.7 | -3.1 ± 5.8 |
| stelo.SteloTestNano 1.0 | 90.5% ± 5.6 | 91.4% ± 3.8 | -0.9 ± 7.1 |
| casey.Flee 1.0 | 89.9% ± 3.7 | 85.8% ± 2.0 | +4.1 ± 4.0 |
| vuen.Fractal 0.55 | 97.9% ± 1.1 | 95.6% ± 2.9 | +2.3 ± 3.2 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| dft.Cyanide 1.90 | +3.9 ± 2.3 | +0.7 ± 1.1 | +0.7 ± 1.1 | -50.0 ± 10.5 |
| wcsv.Engineer.Engineer 0.5.4 | +21.1 ± 3.6 | +7.5 ± 4.0 | +7.5 ± 4.0 | -47.2 ± 4.5 |
| tide.pear.Pear 0.62.1 | +14.4 ± 1.6 | +3.2 ± 2.4 | +3.2 ± 2.4 | -30.9 ± 31.3 |
| simonton.mini.WeeksOnEnd 1.10.4 | +6.3 ± 2.2 | +0.7 ± 1.1 | +0.7 ± 1.1 | -55.2 ± 4.9 |
| simonton.beta.LifelongObsession 0.5.1 | +6.3 ± 2.2 | +0.7 ± 1.1 | +0.7 ± 1.1 | -49.5 ± 8.1 |
| simonton.mega.SniperFrog 1.0.fix2 | +5.3 ± 2.0 | +0.4 ± 1.5 | +0.4 ± 1.5 | -59.8 ± 17.7 |
| cf.proto.Shiva 2.2 | -10.3 ± 8.8 | -7.5 ± 6.7 | -7.5 ± 6.7 | -16.6 ± 25.7 |
| apv.test.Virus 0.6.1 | +12.2 ± 2.5 | +1.8 ± 1.8 | +1.8 ± 1.8 | -57.3 ± 3.9 |
| rz.Aleph 0.34 | +8.7 ± 4.3 | +2.1 ± 2.8 | +2.1 ± 2.8 | -47.8 ± 6.0 |
| jcs.Decepticon 2.5.3 | +17.9 ± 3.1 | +6.8 ± 2.8 | +6.8 ± 2.8 | -46.8 ± 3.1 |
| rdt.AgentSmith.AgentSmith 0.5 | +7.0 ± 2.8 | +1.1 ± 1.2 | +1.1 ± 1.2 | -38.8 ± 21.8 |
| trab.Crusader 0.1.7 | -12.8 ± 4.4 | -11.1 ± 4.1 | -11.1 ± 4.1 | -1.1 ± 5.0 |
| theo.real.Ahab 1.0 | -2.6 ± 4.4 | -2.9 ± 2.6 | -2.9 ± 2.6 | -9.9 ± 14.5 |
| lucasslf.Wiggins 0.6 | +4.8 ± 3.0 | +0.0 ± 1.3 | +0.0 ± 1.3 | -53.8 ± 12.7 |
| jekl.DarkHallow .90.9 | -2.7 ± 15.6 | -4.3 ± 9.3 | -4.3 ± 9.3 | -42.9 ± 17.0 |
| kid.Gladiator .7.2 | +2.8 ± 1.8 | +1.1 ± 1.8 | +1.1 ± 1.8 | -59.4 ± 19.2 |
| stefw.Tigger 0.0.23 | +11.3 ± 3.8 | +3.6 ± 4.2 | +3.6 ± 4.2 | -27.8 ± 17.6 |
| kc.micro.Thorn 1.252 | +10.4 ± 4.8 | +2.9 ± 2.2 | +2.9 ± 2.2 | -51.3 ± 8.8 |
| ej.ChocolateBar 1.1 | +8.0 ± 2.3 | +1.8 ± 1.2 | +1.8 ± 1.2 | -13.1 ± 20.4 |
| trm.Wrekt 1.1.6.f | +13.7 ± 4.6 | +5.7 ± 2.9 | +5.7 ± 2.9 | -44.6 ± 4.4 |
| jam.mini.Raiko 0.43 | +7.5 ± 4.3 | +1.8 ± 1.8 | +1.8 ± 1.8 | -23.1 ± 18.2 |
| florent.small.LittleAngel 1.8 | +9.0 ± 6.2 | +2.1 ± 3.6 | +2.1 ± 3.6 | -37.6 ± 7.8 |
| theo.Tungsten 1.0a | +9.6 ± 3.9 | +1.8 ± 2.2 | +1.8 ± 2.2 | -37.6 ± 27.2 |
| ary.mini.Nimi 1.0 | -1.9 ± 8.8 | -2.5 ± 3.7 | -2.5 ± 3.7 | -42.2 ± 23.4 |
| kms.Golden 0.10 | +14.8 ± 5.4 | +5.7 ± 2.2 | +5.7 ± 2.2 | -9.0 ± 38.9 |
| pkbots.BoyTDSurfer 1.0 | +12.2 ± 4.6 | +2.1 ± 2.1 | +2.1 ± 2.1 | -18.3 ± 24.7 |
| theo.avenge.Pequod 1.0 | +1.2 ± 7.7 | -0.7 ± 4.2 | -0.7 ± 4.2 | -25.1 ± 13.3 |
| gh.GrubbmGrb 1.2.4 | +9.6 ± 10.1 | +3.9 ± 6.5 | +3.9 ± 6.5 | -54.3 ± 30.0 |
| kid.Toa .0.5 | -13.7 ± 4.4 | -10.4 ± 3.8 | -10.4 ± 3.8 | -11.5 ± 6.6 |
| jam.micro.RaikoMicro 1.44 | +8.2 ± 6.4 | +2.1 ± 4.2 | +2.1 ± 4.2 | -24.9 ± 34.6 |
| vic.Locke 0.7.5.5 | +11.3 ± 4.1 | +3.2 ± 2.4 | +3.2 ± 2.4 | +4.9 ± 9.1 |
| simonton.micro.GFMicro 1.0 | -2.3 ± 3.9 | -2.1 ± 2.5 | -2.1 ± 2.5 | -35.0 ± 31.7 |
| brainfade.Fallen 0.63 | -3.4 ± 5.2 | -1.8 ± 2.8 | -1.8 ± 2.8 | -32.9 ± 30.0 |
| ad.Quest 0.10 | +1.9 ± 8.2 | -0.4 ± 3.9 | -0.4 ± 3.9 | -31.4 ± 17.7 |
| lucasslf.HariSeldon 0.2.1 | -0.9 ± 4.7 | -2.1 ± 2.1 | -2.1 ± 2.1 | -65.2 ± 13.4 |
| wilson.Chameleon 0.91 | -4.5 ± 5.5 | -2.1 ± 2.5 | -2.1 ± 2.5 | -68.8 ± 21.7 |
| wiki.mini.Sedan 1.0 | +6.8 ± 2.8 | +2.1 ± 1.7 | +2.1 ± 1.7 | -65.7 ± 8.7 |
| ph.mini.Archer 0.6.6 | +12.0 ± 2.9 | +3.9 ± 1.8 | +3.9 ± 1.8 | -23.0 ± 7.2 |
| nkn.mini.Jskr0 0.1 | -0.4 ± 5.8 | -2.1 ± 2.1 | -2.1 ± 2.1 | -34.9 ± 21.1 |
| kcn.unnamed.Unnamed 1.21 | +5.2 ± 3.7 | +1.1 ± 2.2 | +1.1 ± 2.2 | -44.0 ± 18.1 |
| metal.small.dna2.MCoolDNA 1.5 | +9.6 ± 5.8 | +2.9 ± 3.8 | +2.9 ± 3.8 | -21.9 ± 40.1 |
| ph.musketeer.Musketeer 0.6 | +14.7 ± 4.6 | +6.8 ± 3.4 | +6.8 ± 3.4 | -20.6 ± 10.6 |
| jekl.Jekyl .70 | +4.8 ± 1.8 | +1.1 ± 1.2 | +1.1 ± 1.2 | -66.6 ± 7.2 |
| mladjo.Grrrrr 0.9 | -18.7 ± 12.5 | -14.6 ± 8.5 | -14.6 ± 8.5 | -14.2 ± 17.1 |
| nat.Hikari dev0001 | -0.5 ± 6.0 | -1.8 ± 2.2 | -1.8 ± 2.2 | +3.6 ± 22.2 |
| pez.gloom.GloomyDark 0.9.2 | +5.4 ± 3.0 | +1.1 ± 1.2 | +1.1 ± 1.2 | -8.1 ± 44.2 |
| jekl.mini.BlackPearl .91 | -4.8 ± 8.6 | -3.6 ± 4.7 | -3.6 ± 4.7 | -61.5 ± 17.2 |
| ph.micro.Pikeman 0.4.5 | +6.5 ± 2.2 | +1.1 ± 1.2 | +1.1 ± 1.2 | -19.7 ± 23.5 |
| wiki.mini.BlackDestroyer 0.9.0 | +7.1 ± 3.9 | +2.5 ± 3.0 | +2.5 ± 3.0 | -24.6 ± 12.0 |
| pez.clean.Swiffer 0.2.9 | +1.5 ± 4.8 | -0.4 ± 2.4 | -0.4 ± 2.4 | -47.9 ± 15.7 |
| dft.Virgin 1.25 | +1.6 ± 5.1 | -0.7 ± 2.8 | -0.7 ± 2.8 | -69.8 ± 6.2 |
| davidalves.net.DuelistMini 1.1 | +2.4 ± 1.8 | +0.0 ± 0.0 | +0.0 ± 0.0 | -48.8 ± 23.1 |
| kawigi.mini.Fhqwhgads 1.1 | +7.0 ± 4.0 | +2.1 ± 4.0 | +2.1 ± 4.0 | -52.1 ± 9.1 |
| reaper.Reaper 1.1 | +2.8 ± 3.3 | +1.1 ± 1.8 | +1.1 ± 1.8 | -60.0 ± 20.7 |
| arthord.KostyaTszyu Beta2 | +12.6 ± 3.7 | +3.6 ± 2.8 | +3.6 ± 2.8 | -19.0 ± 20.9 |
| mk.Alpha 0.2.1 | +1.5 ± 0.8 | +0.0 ± 0.0 | +0.0 ± 0.0 | -53.0 ± 22.8 |
| ahf.r2d2.R2d2 0.86 | +3.5 ± 3.2 | -0.4 ± 1.5 | -0.4 ± 1.5 | -66.6 ± 5.4 |
| kawigi.mini.Coriantumr 1.1 | +0.8 ± 1.6 | -0.4 ± 0.8 | -0.4 ± 0.8 | -54.9 ± 33.8 |
| bvh.frg.Friga 0.112dev | +3.0 ± 2.1 | +0.4 ± 0.8 | +0.4 ± 0.8 | -42.1 ± 20.6 |
| ags.micro.Carpet 1.1 | +3.0 ± 3.4 | +2.1 ± 2.1 | +2.1 ± 2.1 | -8.8 ± 11.8 |
| bvh.mini.Freya 0.55 | +1.8 ± 1.9 | +0.4 ± 0.8 | +0.4 ± 0.8 | -50.5 ± 18.2 |
| robar.micro.Kirbyi 1.0 | +7.5 ± 5.4 | +3.9 ± 2.2 | +3.9 ± 2.2 | -34.4 ± 17.2 |
| davidalves.net.DuelistMicroMkII 1.1 | -2.3 ± 6.3 | -0.7 ± 3.6 | -0.7 ± 3.6 | -9.3 ± 20.1 |
| mnt.AHEB 0.6a | -5.0 ± 10.7 | -3.6 ± 7.1 | -3.6 ± 7.1 | -23.2 ± 27.2 |
| lucasslf.Dodger 1.0 | +10.2 ± 8.0 | +2.9 ± 5.7 | +2.9 ± 5.7 | -30.2 ± 7.3 |
| tw.Exterminator 1.0 | -20.2 ± 7.6 | -34.6 ± 9.9 | -34.6 ± 9.9 | +3.2 ± 7.3 |
| Krabb.krabby.Krabby 1.18b | +0.7 ± 4.2 | +0.0 ± 1.3 | +0.0 ± 1.3 | -59.4 ± 22.9 |
| pez.mako.Mako 1.5 | +2.5 ± 5.9 | -0.7 ± 2.1 | -0.7 ± 2.1 | -60.6 ± 13.5 |
| pe.mini.SandboxMini 1.2 | +11.3 ± 5.1 | +3.6 ± 3.1 | +3.6 ± 3.1 | -16.8 ± 16.4 |
| KiraNL.ChupaLite 0.4 | +11.7 ± 5.2 | +3.2 ± 2.7 | +3.2 ± 2.7 | -10.0 ± 14.3 |
| zen.Lindada 0.2 | +1.2 ± 8.1 | -1.4 ± 3.6 | -1.4 ± 3.6 | -26.4 ± 32.1 |
| ds.OoV4 0.3b | +5.7 ± 1.4 | +0.4 ± 0.8 | +0.4 ± 0.8 | -50.1 ± 11.6 |
| simonton.nano.WeekendObsession_S 1.7 | +3.4 ± 5.8 | +1.1 ± 3.1 | +1.1 ± 3.1 | -29.8 ± 24.0 |
| amk.ChumbaWumba 0.3 | +6.3 ± 7.6 | +2.1 ± 5.1 | +2.1 ± 5.1 | -36.4 ± 32.7 |
| tzu.TheArtOfWar 1.2 | +2.7 ± 1.8 | +0.4 ± 0.8 | +0.4 ± 0.8 | -49.3 ± 21.1 |
| suh.nano.RandomPM 1.02 | +8.1 ± 7.7 | +4.3 ± 4.6 | +4.3 ± 4.6 | -13.4 ± 24.6 |
| nat.nano.OcnirpPM 1.0 | +6.9 ± 3.4 | +3.6 ± 3.3 | +3.6 ± 3.3 | -23.2 ± 18.0 |
| nat.nano.Ocnirp 1.73 | +5.8 ± 5.5 | +3.6 ± 2.5 | +3.6 ± 2.5 | -10.1 ± 26.5 |
| lrem.magic.TormentedAngel Antiquitie | +7.9 ± 7.5 | +1.4 ± 4.2 | +1.4 ± 4.2 | -27.5 ± 24.6 |
| spinnercat.CopyKat 1.2.3 | -0.2 ± 3.2 | +3.2 ± 2.0 | +3.2 ± 2.0 | -39.2 ± 24.5 |
| syl.Centipede 0.5 | +3.0 ± 1.7 | +0.7 ± 1.1 | +0.7 ± 1.1 | -43.7 ± 19.3 |
| myl.micro.NekoNinja 1.30 | +1.6 ± 7.6 | -1.1 ± 3.1 | -1.1 ± 3.1 | -32.3 ± 36.2 |
| ins.MobyNano 0.8 | +0.1 ± 4.7 | +0.7 ± 1.7 | +0.7 ± 1.7 | -5.8 ± 9.4 |
| metal.small.MCool 1.21 | +2.8 ± 1.5 | +0.0 ± 0.0 | +0.0 ± 0.0 | -28.8 ± 13.8 |
| starpkg.StarViewerZ 1.26 | +1.3 ± 3.8 | -1.1 ± 1.8 | -1.1 ± 1.8 | -32.6 ± 22.1 |
| apv.NanoLauLectrikTheCannibal 1.1 | -3.1 ± 5.8 | -0.7 ± 3.1 | -0.7 ± 3.1 | -47.0 ± 29.2 |
| stelo.SteloTestNano 1.0 | -0.9 ± 7.1 | -1.8 ± 3.1 | -1.8 ± 3.1 | -54.6 ± 25.4 |
| casey.Flee 1.0 | +4.1 ± 4.0 | +2.1 ± 2.5 | +2.1 ± 2.5 | -19.8 ± 21.1 |
| vuen.Fractal 0.55 | +2.3 ± 3.2 | +1.1 ± 2.2 | +1.1 ± 2.2 | -81.4 ± 7.0 |
| All pairs | +3.9 ± 0.7 | +0.2 ± 0.5 | +0.2 ± 0.5 | -35.8 ± 2.2 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or, for a Hadur build, a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| dft.Cyanide 1.90 | 8 | 8 | +3.9 ± 2.3 | +3.9 ± 2.3 |
| wcsv.Engineer.Engineer 0.5.4 | 8 | 7 | +21.1 ± 3.6 | +20.6 ± 4.1 |
| tide.pear.Pear 0.62.1 | 8 | 3 | +14.4 ± 1.6 | +15.2 ± 6.1 |
| simonton.mini.WeeksOnEnd 1.10.4 | 8 | 8 | +6.3 ± 2.2 | +6.3 ± 2.2 |
| simonton.beta.LifelongObsession 0.5.1 | 8 | 6 | +6.3 ± 2.2 | +5.1 ± 0.7 |
| simonton.mega.SniperFrog 1.0.fix2 | 8 | 6 | +5.3 ± 2.0 | +4.5 ± 1.7 |
| cf.proto.Shiva 2.2 | 8 | 6 | -10.3 ± 8.8 | -8.2 ± 9.4 |
| apv.test.Virus 0.6.1 | 8 | 8 | +12.2 ± 2.5 | +12.2 ± 2.5 |
| rz.Aleph 0.34 | 8 | 8 | +8.7 ± 4.3 | +8.7 ± 4.3 |
| jcs.Decepticon 2.5.3 | 8 | 7 | +17.9 ± 3.1 | +17.8 ± 3.7 |
| rdt.AgentSmith.AgentSmith 0.5 | 8 | 8 | +7.0 ± 2.8 | +7.0 ± 2.8 |
| trab.Crusader 0.1.7 | 8 | 6 | -12.8 ± 4.4 | -14.3 ± 5.4 |
| theo.real.Ahab 1.0 | 8 | 7 | -2.6 ± 4.4 | -2.2 ± 5.1 |
| lucasslf.Wiggins 0.6 | 8 | 8 | +4.8 ± 3.0 | +4.8 ± 3.0 |
| jekl.DarkHallow .90.9 | 8 | 7 | -2.7 ± 15.6 | +1.6 ± 14.1 |
| kid.Gladiator .7.2 | 8 | 7 | +2.8 ± 1.8 | +2.2 ± 1.3 |
| stefw.Tigger 0.0.23 | 8 | 8 | +11.3 ± 3.8 | +11.3 ± 3.8 |
| kc.micro.Thorn 1.252 | 8 | 8 | +10.4 ± 4.8 | +10.4 ± 4.8 |
| ej.ChocolateBar 1.1 | 8 | 8 | +8.0 ± 2.3 | +8.0 ± 2.3 |
| trm.Wrekt 1.1.6.f | 8 | 8 | +13.7 ± 4.6 | +13.7 ± 4.6 |
| jam.mini.Raiko 0.43 | 8 | 8 | +7.5 ± 4.3 | +7.5 ± 4.3 |
| florent.small.LittleAngel 1.8 | 8 | 6 | +9.0 ± 6.2 | +11.2 ± 7.7 |
| theo.Tungsten 1.0a | 8 | 7 | +9.6 ± 3.9 | +9.5 ± 4.6 |
| ary.mini.Nimi 1.0 | 8 | 8 | -1.9 ± 8.8 | -1.9 ± 8.8 |
| kms.Golden 0.10 | 8 | 6 | +14.8 ± 5.4 | +13.6 ± 7.0 |
| pkbots.BoyTDSurfer 1.0 | 8 | 8 | +12.2 ± 4.6 | +12.2 ± 4.6 |
| theo.avenge.Pequod 1.0 | 8 | 7 | +1.2 ± 7.7 | -0.9 ± 7.1 |
| gh.GrubbmGrb 1.2.4 | 8 | 7 | +9.6 ± 10.1 | +6.8 ± 9.2 |
| kid.Toa .0.5 | 8 | 7 | -13.7 ± 4.4 | -13.6 ± 5.3 |
| jam.micro.RaikoMicro 1.44 | 8 | 8 | +8.2 ± 6.4 | +8.2 ± 6.4 |
| vic.Locke 0.7.5.5 | 8 | 7 | +11.3 ± 4.1 | +10.9 ± 4.8 |
| simonton.micro.GFMicro 1.0 | 8 | 8 | -2.3 ± 3.9 | -2.3 ± 3.9 |
| brainfade.Fallen 0.63 | 8 | 8 | -3.4 ± 5.2 | -3.4 ± 5.2 |
| ad.Quest 0.10 | 8 | 8 | +1.9 ± 8.2 | +1.9 ± 8.2 |
| lucasslf.HariSeldon 0.2.1 | 8 | 8 | -0.9 ± 4.7 | -0.9 ± 4.7 |
| wilson.Chameleon 0.91 | 8 | 8 | -4.5 ± 5.5 | -4.5 ± 5.5 |
| wiki.mini.Sedan 1.0 | 8 | 8 | +6.8 ± 2.8 | +6.8 ± 2.8 |
| ph.mini.Archer 0.6.6 | 8 | 7 | +12.0 ± 2.9 | +12.4 ± 3.3 |
| nkn.mini.Jskr0 0.1 | 8 | 8 | -0.4 ± 5.8 | -0.4 ± 5.8 |
| kcn.unnamed.Unnamed 1.21 | 8 | 8 | +5.2 ± 3.7 | +5.2 ± 3.7 |
| metal.small.dna2.MCoolDNA 1.5 | 8 | 8 | +9.6 ± 5.8 | +9.6 ± 5.8 |
| ph.musketeer.Musketeer 0.6 | 8 | 7 | +14.7 ± 4.6 | +15.0 ± 5.5 |
| jekl.Jekyl .70 | 8 | 8 | +4.8 ± 1.8 | +4.8 ± 1.8 |
| mladjo.Grrrrr 0.9 | 8 | 4 | -18.7 ± 12.5 | -9.0 ± 25.7 |
| nat.Hikari dev0001 | 8 | 7 | -0.5 ± 6.0 | -1.7 ± 6.5 |
| pez.gloom.GloomyDark 0.9.2 | 8 | 7 | +5.4 ± 3.0 | +4.7 ± 2.9 |
| jekl.mini.BlackPearl .91 | 8 | 8 | -4.8 ± 8.6 | -4.8 ± 8.6 |
| ph.micro.Pikeman 0.4.5 | 8 | 7 | +6.5 ± 2.2 | +6.4 ± 2.6 |
| wiki.mini.BlackDestroyer 0.9.0 | 8 | 8 | +7.1 ± 3.9 | +7.1 ± 3.9 |
| pez.clean.Swiffer 0.2.9 | 8 | 8 | +1.5 ± 4.8 | +1.5 ± 4.8 |
| dft.Virgin 1.25 | 8 | 7 | +1.6 ± 5.1 | +1.7 ± 6.1 |
| davidalves.net.DuelistMini 1.1 | 8 | 8 | +2.4 ± 1.8 | +2.4 ± 1.8 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 8 | +7.0 ± 4.0 | +7.0 ± 4.0 |
| reaper.Reaper 1.1 | 8 | 8 | +2.8 ± 3.3 | +2.8 ± 3.3 |
| arthord.KostyaTszyu Beta2 | 8 | 8 | +12.6 ± 3.7 | +12.6 ± 3.7 |
| mk.Alpha 0.2.1 | 8 | 8 | +1.5 ± 0.8 | +1.5 ± 0.8 |
| ahf.r2d2.R2d2 0.86 | 8 | 8 | +3.5 ± 3.2 | +3.5 ± 3.2 |
| kawigi.mini.Coriantumr 1.1 | 8 | 8 | +0.8 ± 1.6 | +0.8 ± 1.6 |
| bvh.frg.Friga 0.112dev | 8 | 8 | +3.0 ± 2.1 | +3.0 ± 2.1 |
| ags.micro.Carpet 1.1 | 8 | 7 | +3.0 ± 3.4 | +2.6 ± 3.9 |
| bvh.mini.Freya 0.55 | 8 | 8 | +1.8 ± 1.9 | +1.8 ± 1.9 |
| robar.micro.Kirbyi 1.0 | 8 | 8 | +7.5 ± 5.4 | +7.5 ± 5.4 |
| davidalves.net.DuelistMicroMkII 1.1 | 8 | 8 | -2.3 ± 6.3 | -2.3 ± 6.3 |
| mnt.AHEB 0.6a | 8 | 7 | -5.0 ± 10.7 | -3.1 ± 11.6 |
| lucasslf.Dodger 1.0 | 8 | 8 | +10.2 ± 8.0 | +10.2 ± 8.0 |
| tw.Exterminator 1.0 | 8 | 4 | -20.2 ± 7.6 | -15.7 ± 11.0 |
| Krabb.krabby.Krabby 1.18b | 8 | 7 | +0.7 ± 4.2 | +1.0 ± 5.0 |
| pez.mako.Mako 1.5 | 8 | 8 | +2.5 ± 5.9 | +2.5 ± 5.9 |
| pe.mini.SandboxMini 1.2 | 8 | 8 | +11.3 ± 5.1 | +11.3 ± 5.1 |
| KiraNL.ChupaLite 0.4 | 8 | 8 | +11.7 ± 5.2 | +11.7 ± 5.2 |
| zen.Lindada 0.2 | 8 | 7 | +1.2 ± 8.1 | -0.0 ± 9.0 |
| ds.OoV4 0.3b | 8 | 8 | +5.7 ± 1.4 | +5.7 ± 1.4 |
| simonton.nano.WeekendObsession_S 1.7 | 8 | 8 | +3.4 ± 5.8 | +3.4 ± 5.8 |
| amk.ChumbaWumba 0.3 | 8 | 7 | +6.3 ± 7.6 | +8.3 ± 7.1 |
| tzu.TheArtOfWar 1.2 | 8 | 8 | +2.7 ± 1.8 | +2.7 ± 1.8 |
| suh.nano.RandomPM 1.02 | 8 | 4 | +8.1 ± 7.7 | +5.0 ± 10.2 |
| nat.nano.OcnirpPM 1.0 | 8 | 8 | +6.9 ± 3.4 | +6.9 ± 3.4 |
| nat.nano.Ocnirp 1.73 | 8 | 6 | +5.8 ± 5.5 | +6.6 ± 6.2 |
| lrem.magic.TormentedAngel Antiquitie | 8 | 7 | +7.9 ± 7.5 | +7.9 ± 8.9 |
| spinnercat.CopyKat 1.2.3 | 8 | 4 | -0.2 ± 3.2 | -0.2 ± 6.2 |
| syl.Centipede 0.5 | 8 | 7 | +3.0 ± 1.7 | +3.2 ± 1.9 |
| myl.micro.NekoNinja 1.30 | 8 | 8 | +1.6 ± 7.6 | +1.6 ± 7.6 |
| ins.MobyNano 0.8 | 8 | 8 | +0.1 ± 4.7 | +0.1 ± 4.7 |
| metal.small.MCool 1.21 | 8 | 6 | +2.8 ± 1.5 | +2.2 ± 1.8 |
| starpkg.StarViewerZ 1.26 | 8 | 8 | +1.3 ± 3.8 | +1.3 ± 3.8 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 8 | -3.1 ± 5.8 | -3.1 ± 5.8 |
| stelo.SteloTestNano 1.0 | 8 | 8 | -0.9 ± 7.1 | -0.9 ± 7.1 |
| casey.Flee 1.0 | 8 | 7 | +4.1 ± 4.0 | +4.9 ± 4.2 |
| vuen.Fractal 0.55 | 8 | 8 | +2.3 ± 3.2 | +2.3 ± 3.2 |
| All pairs | 712 | 651 | +3.9 ± 0.7 | +4.2 ± 0.6 |

# Bench: hadur2.Hadur 3.12shslsmss baseline (hadur2.Hadur 3.12) (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 9992 over 712 battles (14.0 per battle, most in one battle 109). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| dft.Cyanide 1.90 | null-both | 95.6% ± 2.2 | 99.3% ± 1.1 | 68.9% ± 9.4 | 278 / 280 | 9.4% ± 2.5 | 3.5% ± 0.2 | 168 | 0 | 0.67 / 16.1 |
| wcsv.Engineer.Engineer 0.5.4 | null-both | 77.2% ± 4.2 | 92.1% ± 4.4 | 52.6% ± 2.7 | 258 / 280 | 20.8% ± 1.7 | 4.9% ± 0.7 | 145 | 0 | 1.05 / 669.5 |
| tide.pear.Pear 0.62.1 | null-both | 84.8% ± 1.2 | 96.8% ± 2.4 | 72.4% ± 1.5 | 271 / 280 | 42.5% ± 3.6 | 7.9% ± 1.2 | 109 | 0 | 0.87 / 666.6 |
| simonton.mini.WeeksOnEnd 1.10.4 | null-both | 93.1% ± 2.3 | 99.3% ± 1.1 | 64.5% ± 3.8 | 278 / 280 | 13.3% ± 2.4 | 2.2% ± 0.4 | 110 | 0 | 0.82 / 49.3 |
| simonton.beta.LifelongObsession 0.5.1 | null-both | 91.8% ± 2.4 | 98.9% ± 1.2 | 54.4% ± 7.6 | 277 / 280 | 10.4% ± 2.5 | 2.3% ± 0.4 | 172 | 0 | 0.71 / 490.8 |
| simonton.mega.SniperFrog 1.0.fix2 | null-both | 93.8% ± 1.9 | 99.3% ± 1.1 | 66.0% ± 6.4 | 278 / 280 | 14.6% ± 1.5 | 0.9% ± 0.3 | 157 | 0 | 0.81 / 60.2 |
| cf.proto.Shiva 2.2 | null-both | 93.5% ± 2.4 | 99.3% ± 1.1 | 61.1% ± 7.7 | 278 / 280 | 7.1% ± 0.9 | 1.1% ± 0.4 | 116 | 0 | 0.54 / 92.1 |
| apv.test.Virus 0.6.1 | null-both | 87.4% ± 2.5 | 98.2% ± 1.8 | 57.3% ± 3.9 | 275 / 280 | 20.7% ± 2.1 | 4.0% ± 0.2 | 124 | 0 | 0.69 / 406.9 |
| rz.Aleph 0.34 | null-both | 90.2% ± 4.0 | 97.9% ± 2.8 | 47.8% ± 6.0 | 274 / 280 | 6.7% ± 1.1 | 1.2% ± 0.2 | 104 | 0 | 0.82 / 169.3 |
| jcs.Decepticon 2.5.3 | null-both | 79.3% ± 3.4 | 93.2% ± 2.8 | 50.1% ± 2.8 | 261 / 280 | 10.6% ± 1.8 | 4.7% ± 0.5 | 113 | 0 | 1.31 / 225.6 |
| rdt.AgentSmith.AgentSmith 0.5 | null-both | 91.9% ± 2.6 | 98.6% ± 1.3 | 51.3% ± 5.6 | 276 / 280 | 6.7% ± 1.7 | 1.1% ± 0.3 | 107 | 0 | 1.03 / 152.2 |
| trab.Crusader 0.1.7 | null-both | 72.9% ± 4.8 | 88.9% ± 3.5 | 35.9% ± 3.6 | 249 / 280 | 7.8% ± 1.4 | 3.7% ± 0.8 | 110 | 0 | 1.45 / 21.9 |
| theo.real.Ahab 1.0 | null-both | 87.3% ± 3.2 | 98.9% ± 1.8 | 46.9% ± 5.2 | 277 / 280 | 7.4% ± 0.9 | 2.2% ± 0.6 | 109 | 0 | 1.38 / 16.9 |
| lucasslf.Wiggins 0.6 | null-both | 92.8% ± 3.1 | 99.3% ± 1.1 | 62.0% ± 7.1 | 278 / 280 | 9.8% ± 1.9 | 2.1% ± 0.8 | 90 | 0 | 0.81 / 19.1 |
| jekl.DarkHallow .90.9 | null-both | 91.3% ± 2.5 | 98.2% ± 1.8 | 54.5% ± 6.9 | 275 / 280 | 8.1% ± 1.2 | 1.3% ± 0.3 | 102 | 0 | 0.67 / 325.4 |
| kid.Gladiator .7.2 | null-both | 96.8% ± 1.9 | 98.9% ± 1.8 | 90.6% ± 4.6 | 277 / 280 | 13.5% ± 0.6 | 0.5% ± 0.3 | 95 | 0 | 0.67 / 18.9 |
| stefw.Tigger 0.0.23 | null-both | 86.5% ± 4.5 | 96.1% ± 4.2 | 41.7% ± 4.0 | 269 / 280 | 6.8% ± 1.1 | 1.5% ± 0.3 | 107 | 0 | 0.64 / 14.5 |
| kc.micro.Thorn 1.252 | null-both | 85.6% ± 5.8 | 95.7% ± 2.9 | 52.9% ± 8.2 | 268 / 280 | 7.8% ± 2.5 | 2.4% ± 1.8 | 113 | 0 | 0.90 / 213.8 |
| ej.ChocolateBar 1.1 | null-both | 91.9% ± 2.2 | 98.2% ± 1.2 | 50.6% ± 8.2 | 275 / 280 | 7.9% ± 1.4 | 1.0% ± 0.4 | 103 | 0 | 0.54 / 293.2 |
| trm.Wrekt 1.1.6.f | null-both | 84.4% ± 4.5 | 94.3% ± 2.9 | 49.1% ± 6.2 | 264 / 280 | 7.5% ± 1.0 | 1.8% ± 0.6 | 96 | 0 | 1.24 / 16.0 |
| jam.mini.Raiko 0.43 | null-both | 91.2% ± 3.4 | 97.9% ± 1.7 | 54.4% ± 9.5 | 274 / 280 | 7.8% ± 1.2 | 1.0% ± 0.3 | 115 | 0 | 0.63 / 17.4 |
| florent.small.LittleAngel 1.8 | null-both | 84.2% ± 4.1 | 97.1% ± 2.9 | 45.1% ± 4.1 | 272 / 280 | 10.2% ± 0.9 | 2.4% ± 0.6 | 179 | 0 | 0.82 / 291.7 |
| theo.Tungsten 1.0a | null-both | 89.0% ± 2.9 | 97.9% ± 2.1 | 62.6% ± 6.6 | 274 / 280 | 18.5% ± 2.3 | 1.8% ± 0.4 | 140 | 0 | 0.63 / 15.3 |
| ary.mini.Nimi 1.0 | null-both | 93.5% ± 2.0 | 99.3% ± 1.1 | 61.7% ± 7.9 | 278 / 280 | 8.7% ± 1.4 | 0.8% ± 0.2 | 106 | 0 | 0.60 / 530.3 |
| kms.Golden 0.10 | null-both | 81.6% ± 3.8 | 93.2% ± 2.2 | 44.4% ± 7.3 | 261 / 280 | 13.7% ± 3.6 | 2.5% ± 1.1 | 96 | 0 | 0.76 / 308.5 |
| pkbots.BoyTDSurfer 1.0 | null-both | 86.4% ± 3.7 | 97.5% ± 2.0 | 43.3% ± 5.4 | 273 / 280 | 12.3% ± 1.2 | 2.5% ± 0.5 | 109 | 0 | 0.70 / 17.7 |
| theo.avenge.Pequod 1.0 | null-both | 85.0% ± 3.5 | 97.1% ± 2.2 | 45.9% ± 5.0 | 272 / 280 | 9.8% ± 1.1 | 2.2% ± 0.6 | 104 | 0 | 1.11 / 268.5 |
| gh.GrubbmGrb 1.2.4 | null-both | 84.6% ± 9.3 | 93.2% ± 5.8 | 63.9% ± 14.6 | 261 / 280 | 17.1% ± 8.2 | 2.4% ± 1.3 | 108 | 0 | 0.80 / 264.7 |
| kid.Toa .0.5 | null-both | 91.2% ± 4.2 | 97.5% ± 2.7 | 75.1% ± 7.6 | 273 / 280 | 11.8% ± 0.8 | 1.3% ± 0.3 | 101 | 0 | 1.09 / 130.8 |
| jam.micro.RaikoMicro 1.44 | null-both | 91.4% ± 6.2 | 97.9% ± 4.2 | 52.2% ± 5.6 | 274 / 280 | 7.8% ± 1.0 | 1.0% ± 0.6 | 99 | 0 | 0.62 / 23.2 |
| vic.Locke 0.7.5.5 | null-both | 88.7% ± 4.1 | 96.8% ± 2.4 | 45.1% ± 9.1 | 271 / 280 | 9.3% ± 0.6 | 1.4% ± 0.3 | 91 | 0 | 0.68 / 189.9 |
| simonton.micro.GFMicro 1.0 | null-both | 91.9% ± 1.7 | 98.6% ± 1.3 | 74.3% ± 4.6 | 276 / 280 | 31.8% ± 3.8 | 3.1% ± 0.5 | 92 | 0 | 0.56 / 118.7 |
| brainfade.Fallen 0.63 | null-both | 93.8% ± 2.6 | 99.3% ± 1.1 | 54.2% ± 8.4 | 278 / 280 | 6.1% ± 1.5 | 1.1% ± 0.7 | 101 | 0 | 0.51 / 22.0 |
| ad.Quest 0.10 | null-both | 89.0% ± 3.9 | 97.5% ± 2.0 | 59.1% ± 6.9 | 273 / 280 | 11.8% ± 1.3 | 2.1% ± 0.4 | 145 | 0 | 0.77 / 301.4 |
| lucasslf.HariSeldon 0.2.1 | null-both | 96.2% ± 1.2 | 100.0% ± 0.0 | 75.0% ± 7.0 | 280 / 280 | 14.0% ± 2.2 | 1.7% ± 0.3 | 98 | 0 | 1.36 / 247.1 |
| wilson.Chameleon 0.91 | null-both | 97.9% ± 1.4 | 99.6% ± 0.8 | 87.3% ± 5.4 | 279 / 280 | 9.4% ± 2.0 | 0.5% ± 0.2 | 92 | 0 | 0.55 / 16.4 |
| wiki.mini.Sedan 1.0 | null-both | 92.8% ± 2.9 | 97.9% ± 1.7 | 65.7% ± 8.7 | 274 / 280 | 11.2% ± 1.7 | 2.8% ± 0.2 | 99 | 0 | 0.50 / 415.8 |
| ph.mini.Archer 0.6.6 | null-both | 85.0% ± 2.7 | 95.0% ± 1.7 | 36.8% ± 5.7 | 266 / 280 | 5.7% ± 1.7 | 3.6% ± 0.2 | 108 | 0 | 0.57 / 551.5 |
| nkn.mini.Jskr0 0.1 | null-both | 93.7% ± 1.5 | 99.6% ± 0.8 | 54.2% ± 7.2 | 279 / 280 | 8.4% ± 1.9 | 0.9% ± 0.2 | 115 | 0 | 0.51 / 673.2 |
| kcn.unnamed.Unnamed 1.21 | null-both | 93.2% ± 3.1 | 98.6% ± 1.8 | 53.1% ± 9.5 | 276 / 280 | 9.0% ± 0.5 | 0.8% ± 0.3 | 93 | 0 | 0.59 / 700.6 |
| metal.small.dna2.MCoolDNA 1.5 | null-both | 88.9% ± 4.5 | 96.4% ± 3.1 | 60.5% ± 6.6 | 270 / 280 | 8.6% ± 1.6 | 1.4% ± 0.5 | 97 | 0 | 0.59 / 18.5 |
| ph.musketeer.Musketeer 0.6 | null-both | 83.4% ± 5.2 | 92.9% ± 3.6 | 39.3% ± 7.3 | 260 / 280 | 7.5% ± 1.5 | 3.6% ± 0.4 | 102 | 0 | 0.57 / 461.6 |
| jekl.Jekyl .70 | null-both | 92.6% ± 2.8 | 98.6% ± 1.8 | 67.6% ± 5.5 | 276 / 280 | 8.4% ± 0.9 | 1.4% ± 0.6 | 98 | 0 | 0.58 / 16.1 |
| mladjo.Grrrrr 0.9 | null-both | 90.3% ± 2.6 | 98.9% ± 1.2 | 50.0% ± 8.3 | 277 / 280 | 9.6% ± 1.5 | 1.6% ± 0.4 | 100 | 0 | 0.62 / 650.9 |
| nat.Hikari dev0001 | null-both | 86.6% ± 3.8 | 99.3% ± 1.7 | 44.4% ± 5.3 | 278 / 280 | 14.5% ± 3.0 | 2.8% ± 0.5 | 109 | 0 | 0.69 / 16.2 |
| pez.gloom.GloomyDark 0.9.2 | null-both | 92.1% ± 2.4 | 98.2% ± 1.8 | 63.3% ± 6.4 | 275 / 280 | 7.4% ± 1.3 | 1.0% ± 0.3 | 107 | 0 | 0.56 / 83.6 |
| jekl.mini.BlackPearl .91 | null-both | 94.7% ± 2.1 | 99.6% ± 0.8 | 68.5% ± 6.6 | 279 / 280 | 8.6% ± 2.2 | 0.9% ± 0.4 | 102 | 0 | 0.50 / 831.3 |
| ph.micro.Pikeman 0.4.5 | null-both | 93.2% ± 2.4 | 98.9% ± 1.2 | 50.9% ± 9.6 | 277 / 280 | 6.0% ± 1.2 | 0.8% ± 0.2 | 216 | 0 | 0.58 / 796.3 |
| wiki.mini.BlackDestroyer 0.9.0 | null-both | 88.9% ± 3.9 | 96.8% ± 2.7 | 53.5% ± 5.5 | 271 / 280 | 10.0% ± 2.4 | 3.0% ± 0.4 | 112 | 0 | 0.66 / 88.2 |
| pez.clean.Swiffer 0.2.9 | null-both | 90.5% ± 1.8 | 97.5% ± 1.5 | 66.8% ± 5.1 | 273 / 280 | 11.5% ± 3.0 | 1.5% ± 0.4 | 122 | 0 | 0.63 / 223.9 |
| dft.Virgin 1.25 | null-both | 93.5% ± 2.8 | 99.3% ± 1.7 | 70.1% ± 5.7 | 278 / 280 | 10.5% ± 0.9 | 1.1% ± 0.4 | 114 | 0 | 0.67 / 710.3 |
| davidalves.net.DuelistMini 1.1 | null-both | 97.2% ± 1.7 | 100.0% ± 0.0 | 81.3% ± 7.4 | 280 / 280 | 10.2% ± 3.8 | 0.5% ± 0.3 | 154 | 0 | 0.66 / 642.1 |
| kawigi.mini.Fhqwhgads 1.1 | null-both | 87.7% ± 3.7 | 96.1% ± 3.6 | 59.0% ± 5.9 | 269 / 280 | 13.7% ± 1.4 | 4.7% ± 0.3 | 149 | 0 | 0.71 / 616.8 |
| reaper.Reaper 1.1 | null-both | 95.7% ± 3.1 | 98.9% ± 1.8 | 73.9% ± 8.4 | 277 / 280 | 9.3% ± 2.3 | 0.8% ± 0.3 | 140 | 0 | 0.69 / 754.4 |
| arthord.KostyaTszyu Beta2 | null-both | 87.0% ± 3.8 | 96.4% ± 2.8 | 44.0% ± 5.4 | 270 / 280 | 7.9% ± 0.4 | 1.4% ± 0.4 | 112 | 0 | 0.61 / 66.1 |
| mk.Alpha 0.2.1 | null-both | 98.2% ± 0.9 | 100.0% ± 0.0 | 84.3% ± 6.4 | 280 / 280 | 8.0% ± 1.5 | 0.4% ± 0.2 | 112 | 0 | 0.54 / 549.5 |
| ahf.r2d2.R2d2 0.86 | null-both | 92.7% ± 2.6 | 99.3% ± 1.1 | 66.8% ± 5.7 | 278 / 280 | 13.1% ± 2.5 | 1.4% ± 0.5 | 107 | 0 | 0.54 / 133.8 |
| kawigi.mini.Coriantumr 1.1 | null-both | 97.7% ± 1.0 | 100.0% ± 0.0 | 88.2% ± 4.4 | 280 / 280 | 8.6% ± 1.6 | 0.4% ± 0.2 | 97 | 0 | 0.53 / 690.2 |
| bvh.frg.Friga 0.112dev | null-both | 96.8% ± 2.0 | 99.6% ± 0.8 | 79.6% ± 5.7 | 279 / 280 | 7.2% ± 1.0 | 0.6% ± 0.3 | 105 | 0 | 0.57 / 791.4 |
| ags.micro.Carpet 1.1 | null-both | 86.9% ± 2.9 | 96.8% ± 2.0 | 48.7% ± 4.1 | 271 / 280 | 10.8% ± 2.0 | 3.1% ± 0.1 | 99 | 0 | 1.30 / 763.8 |
| bvh.mini.Freya 0.55 | null-both | 98.1% ± 1.9 | 99.6% ± 0.8 | 88.0% ± 8.3 | 279 / 280 | 9.2% ± 0.8 | 0.3% ± 0.2 | 93 | 0 | 0.51 / 821.9 |
| robar.micro.Kirbyi 1.0 | null-both | 85.4% ± 4.4 | 95.7% ± 2.6 | 59.3% ± 5.0 | 268 / 280 | 27.2% ± 3.4 | 4.4% ± 0.8 | 121 | 0 | 0.85 / 558.1 |
| davidalves.net.DuelistMicroMkII 1.1 | null-both | 84.6% ± 4.4 | 95.0% ± 3.1 | 59.4% ± 5.7 | 266 / 280 | 14.0% ± 1.1 | 2.4% ± 0.6 | 138 | 0 | 0.70 / 955.5 |
| mnt.AHEB 0.6a | null-both | 89.2% ± 4.4 | 96.8% ± 3.2 | 50.0% ± 7.5 | 271 / 280 | 6.7% ± 2.5 | 1.8% ± 0.4 | 95 | 0 | 0.55 / 1110.3 |
| lucasslf.Dodger 1.0 | null-both | 86.9% ± 6.5 | 96.1% ± 5.1 | 36.2% ± 7.2 | 269 / 280 | 8.2% ± 1.7 | 2.7% ± 0.3 | 102 | 0 | 0.47 / 111.6 |
| tw.Exterminator 1.0 | null-both | 89.7% ± 5.6 | 93.2% ± 5.1 | 75.3% ± 8.5 | 261 / 280 | 5.2% ± 2.0 | 2.1% ± 0.7 | 138 | 0 | 1.01 / 561.4 |
| Krabb.krabby.Krabby 1.18b | null-both | 93.6% ± 3.0 | 99.3% ± 1.1 | 67.3% ± 11.9 | 278 / 280 | 17.5% ± 6.4 | 1.1% ± 0.5 | 100 | 0 | 0.47 / 15.2 |
| pez.mako.Mako 1.5 | null-both | 93.1% ± 4.5 | 99.3% ± 1.1 | 65.5% ± 10.3 | 278 / 280 | 10.8% ± 3.8 | 1.2% ± 0.7 | 113 | 0 | 0.66 / 14.7 |
| pe.mini.SandboxMini 1.2 | null-both | 87.8% ± 3.9 | 96.1% ± 2.5 | 60.5% ± 5.6 | 269 / 280 | 12.2% ± 1.8 | 1.5% ± 0.5 | 92 | 0 | 0.59 / 236.6 |
| KiraNL.ChupaLite 0.4 | null-both | 88.3% ± 5.3 | 96.8% ± 2.7 | 53.8% ± 6.3 | 271 / 280 | 13.5% ± 2.5 | 1.5% ± 0.6 | 109 | 0 | 0.62 / 481.9 |
| zen.Lindada 0.2 | null-both | 94.1% ± 1.6 | 99.6% ± 0.8 | 63.7% ± 5.4 | 279 / 280 | 9.3% ± 1.0 | 0.7% ± 0.1 | 100 | 0 | 0.55 / 650.3 |
| ds.OoV4 0.3b | null-both | 94.0% ± 1.3 | 99.6% ± 0.8 | 64.0% ± 8.5 | 279 / 280 | 8.2% ± 1.6 | 1.0% ± 0.2 | 116 | 0 | 0.63 / 695.4 |
| simonton.nano.WeekendObsession_S 1.7 | null-both | 85.1% ± 3.5 | 95.4% ± 2.2 | 56.3% ± 5.5 | 267 / 280 | 21.6% ± 2.8 | 3.3% ± 0.6 | 138 | 0 | 0.78 / 602.0 |
| amk.ChumbaWumba 0.3 | null-both | 87.6% ± 4.6 | 95.7% ± 3.4 | 57.0% ± 7.2 | 268 / 280 | 11.3% ± 3.4 | 1.6% ± 0.9 | 101 | 0 | 0.58 / 641.6 |
| tzu.TheArtOfWar 1.2 | null-both | 97.1% ± 1.7 | 99.6% ± 0.8 | 86.8% ± 3.9 | 279 / 280 | 16.8% ± 1.7 | 1.1% ± 0.3 | 103 | 0 | 0.55 / 14.9 |
| suh.nano.RandomPM 1.02 | null-both | 81.6% ± 4.9 | 93.9% ± 4.3 | 36.6% ± 4.5 | 263 / 280 | 11.3% ± 2.7 | 2.4% ± 0.8 | 77 | 0 | 0.90 / 472.4 |
| nat.nano.OcnirpPM 1.0 | null-both | 84.1% ± 3.3 | 96.1% ± 3.1 | 45.3% ± 5.2 | 269 / 280 | 15.6% ± 4.2 | 2.6% ± 0.4 | 120 | 0 | 0.79 / 572.7 |
| nat.nano.Ocnirp 1.73 | null-both | 82.0% ± 1.6 | 94.6% ± 2.0 | 43.0% ± 5.8 | 265 / 280 | 15.2% ± 2.3 | 2.9% ± 0.4 | 105 | 0 | 0.68 / 345.1 |
| lrem.magic.TormentedAngel Antiquitie | null-both | 86.0% ± 2.7 | 96.4% ± 2.8 | 41.5% ± 8.7 | 270 / 280 | 9.7% ± 1.7 | 1.6% ± 0.2 | 105 | 0 | 0.57 / 401.8 |
| spinnercat.CopyKat 1.2.3 | null-both | 87.7% ± 1.9 | 93.6% ± 2.1 | 67.6% ± 4.7 | 262 / 280 | 33.2% ± 4.8 | 1.7% ± 0.3 | 93 | 0 | 0.58 / 499.3 |
| syl.Centipede 0.5 | null-both | 96.9% ± 1.8 | 99.3% ± 1.1 | 81.2% ± 6.8 | 278 / 280 | 10.1% ± 1.5 | 0.7% ± 0.2 | 100 | 0 | 0.61 / 15.5 |
| myl.micro.NekoNinja 1.30 | null-both | 91.8% ± 3.2 | 98.9% ± 1.8 | 67.8% ± 6.8 | 277 / 280 | 12.0% ± 5.5 | 1.3% ± 0.7 | 115 | 0 | 0.65 / 589.7 |
| ins.MobyNano 0.8 | null-both | 88.7% ± 3.1 | 98.6% ± 1.3 | 55.9% ± 6.5 | 276 / 280 | 18.2% ± 2.8 | 2.9% ± 0.4 | 105 | 0 | 0.65 / 714.4 |
| metal.small.MCool 1.21 | null-both | 97.1% ± 1.4 | 100.0% ± 0.0 | 72.5% ± 12.4 | 280 / 280 | 10.3% ± 2.1 | 0.5% ± 0.2 | 87 | 0 | 0.58 / 508.8 |
| starpkg.StarViewerZ 1.26 | null-both | 95.6% ± 1.6 | 100.0% ± 0.0 | 69.6% ± 6.6 | 280 / 280 | 5.8% ± 1.1 | 1.0% ± 0.3 | 101 | 0 | 0.53 / 166.2 |
| apv.NanoLauLectrikTheCannibal 1.1 | null-both | 91.2% ± 2.7 | 97.5% ± 2.0 | 83.4% ± 4.4 | 273 / 280 | 80.6% ± 5.0 | 4.3% ± 1.6 | 106 | 0 | 0.68 / 192.8 |
| stelo.SteloTestNano 1.0 | null-both | 91.4% ± 3.8 | 98.2% ± 1.8 | 70.7% ± 6.9 | 275 / 280 | 23.6% ± 3.3 | 1.9% ± 1.0 | 125 | 0 | 0.59 / 625.8 |
| casey.Flee 1.0 | null-both | 85.8% ± 2.0 | 97.1% ± 1.8 | 52.4% ± 4.2 | 272 / 280 | 14.0% ± 2.9 | 2.5% ± 0.3 | 110 | 0 | 0.63 / 942.4 |
| vuen.Fractal 0.55 | null-both | 95.6% ± 2.9 | 98.6% ± 1.8 | 87.6% ± 6.2 | 276 / 280 | 17.4% ± 2.0 | 0.6% ± 0.3 | 89 | 0 | 0.61 / 14.2 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| dft.Cyanide 1.90 | 8 | 106 | 11.8% | 83.2% | 0.0% | 5.1% | 1002 |
| wcsv.Engineer.Engineer 0.5.4 | 8 | 824 | 16.7% | 76.7% | 0.0% | 6.6% | 942 |
| tide.pear.Pear 0.62.1 | 8 | 743 | 7.6% | 89.6% | 0.0% | 2.8% | 599 |
| simonton.mini.WeeksOnEnd 1.10.4 | 8 | 185 | 6.8% | 90.4% | 0.0% | 2.8% | 1416 |
| simonton.beta.LifelongObsession 0.5.1 | 8 | 212 | 8.8% | 87.4% | 0.0% | 3.7% | 1437 |
| simonton.mega.SniperFrog 1.0.fix2 | 8 | 160 | 7.8% | 89.4% | 0.0% | 2.7% | 955 |
| cf.proto.Shiva 2.2 | 8 | 166 | 7.5% | 88.2% | 0.7% | 3.5% | 985 |
| apv.test.Virus 0.6.1 | 8 | 377 | 8.3% | 88.9% | 0.0% | 2.8% | 981 |
| rz.Aleph 0.34 | 8 | 251 | 14.9% | 79.2% | 0.0% | 5.8% | 997 |
| jcs.Decepticon 2.5.3 | 8 | 684 | 17.4% | 75.3% | 0.0% | 7.3% | 1005 |
| rdt.AgentSmith.AgentSmith 0.5 | 8 | 207 | 12.1% | 82.9% | 0.0% | 5.0% | 969 |
| trab.Crusader 0.1.7 | 8 | 856 | 22.6% | 68.4% | 0.0% | 8.9% | 1125 |
| theo.real.Ahab 1.0 | 8 | 368 | 5.1% | 92.7% | 0.0% | 2.2% | 1116 |
| lucasslf.Wiggins 0.6 | 8 | 202 | 6.2% | 91.0% | 0.0% | 2.9% | 1354 |
| jekl.DarkHallow .90.9 | 8 | 220 | 14.2% | 80.6% | 0.0% | 5.1% | 1098 |
| kid.Gladiator .7.2 | 8 | 97 | 19.3% | 76.0% | 0.0% | 4.7% | 896 |
| stefw.Tigger 0.0.23 | 8 | 352 | 19.6% | 73.2% | 0.0% | 7.2% | 918 |
| kc.micro.Thorn 1.252 | 8 | 461 | 16.3% | 77.9% | 0.0% | 5.8% | 929 |
| ej.ChocolateBar 1.1 | 8 | 201 | 15.6% | 78.9% | 0.0% | 5.5% | 1013 |
| trm.Wrekt 1.1.6.f | 8 | 430 | 23.3% | 66.7% | 0.0% | 10.0% | 969 |
| jam.mini.Raiko 0.43 | 8 | 225 | 16.7% | 76.4% | 0.0% | 6.8% | 1003 |
| florent.small.LittleAngel 1.8 | 8 | 461 | 10.8% | 85.0% | 0.1% | 4.1% | 1014 |
| theo.Tungsten 1.0a | 8 | 325 | 11.6% | 84.6% | 0.0% | 3.8% | 906 |
| ary.mini.Nimi 1.0 | 8 | 165 | 7.6% | 89.2% | 0.0% | 3.2% | 1174 |
| kms.Golden 0.10 | 8 | 545 | 21.8% | 70.0% | 0.2% | 8.0% | 770 |
| pkbots.BoyTDSurfer 1.0 | 8 | 374 | 11.7% | 83.5% | 0.0% | 4.8% | 1191 |
| theo.avenge.Pequod 1.0 | 8 | 440 | 11.4% | 84.3% | 0.0% | 4.3% | 966 |
| gh.GrubbmGrb 1.2.4 | 8 | 506 | 23.5% | 66.0% | 0.0% | 10.5% | 968 |
| kid.Toa .0.5 | 8 | 269 | 16.2% | 77.3% | 0.0% | 6.5% | 1225 |
| jam.micro.RaikoMicro 1.44 | 8 | 227 | 16.5% | 77.4% | 0.0% | 6.1% | 1005 |
| vic.Locke 0.7.5.5 | 8 | 288 | 19.5% | 73.1% | 0.0% | 7.4% | 1043 |
| simonton.micro.GFMicro 1.0 | 8 | 247 | 10.1% | 86.1% | 0.0% | 3.7% | 1285 |
| brainfade.Fallen 0.63 | 8 | 154 | 8.1% | 88.9% | 0.0% | 3.0% | 968 |
| ad.Quest 0.10 | 8 | 312 | 14.0% | 80.1% | 0.0% | 5.8% | 850 |
| lucasslf.HariSeldon 0.2.1 | 8 | 99 | 0.0% | 100.0% | 0.0% | 0.0% | 1357 |
| wilson.Chameleon 0.91 | 8 | 52 | 12.0% | 83.5% | 0.0% | 4.5% | 956 |
| wiki.mini.Sedan 1.0 | 8 | 185 | 20.3% | 72.5% | 0.0% | 7.2% | 839 |
| ph.mini.Archer 0.6.6 | 8 | 387 | 22.6% | 68.3% | 0.0% | 9.1% | 1101 |
| nkn.mini.Jskr0 0.1 | 8 | 154 | 4.1% | 94.2% | 0.0% | 1.8% | 897 |
| kcn.unnamed.Unnamed 1.21 | 8 | 166 | 15.1% | 79.4% | 0.0% | 5.5% | 1040 |
| metal.small.dna2.MCoolDNA 1.5 | 8 | 309 | 20.2% | 71.6% | 0.1% | 8.1% | 930 |
| ph.musketeer.Musketeer 0.6 | 8 | 439 | 28.5% | 60.6% | 0.0% | 11.0% | 1088 |
| jekl.Jekyl .70 | 8 | 200 | 12.5% | 79.1% | 1.7% | 6.6% | 933 |
| mladjo.Grrrrr 0.9 | 8 | 256 | 7.3% | 89.8% | 0.0% | 2.9% | 932 |
| nat.Hikari dev0001 | 8 | 386 | 3.2% | 95.5% | 0.0% | 1.3% | 864 |
| pez.gloom.GloomyDark 0.9.2 | 8 | 209 | 15.0% | 79.4% | 0.1% | 5.6% | 989 |
| jekl.mini.BlackPearl .91 | 8 | 138 | 4.5% | 92.9% | 0.5% | 2.0% | 888 |
| ph.micro.Pikeman 0.4.5 | 8 | 164 | 11.4% | 83.7% | 0.0% | 4.9% | 941 |
| wiki.mini.BlackDestroyer 0.9.0 | 8 | 295 | 19.1% | 74.1% | 0.0% | 6.8% | 1021 |
| pez.clean.Swiffer 0.2.9 | 8 | 272 | 16.1% | 77.0% | 0.1% | 6.8% | 895 |
| dft.Virgin 1.25 | 8 | 177 | 7.1% | 89.8% | 0.1% | 3.0% | 774 |
| davidalves.net.DuelistMini 1.1 | 8 | 71 | 0.0% | 100.0% | 0.0% | 0.0% | 813 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 343 | 20.0% | 72.6% | 0.2% | 7.2% | 829 |
| reaper.Reaper 1.1 | 8 | 108 | 17.4% | 74.7% | 0.7% | 7.2% | 884 |
| arthord.KostyaTszyu Beta2 | 8 | 340 | 18.4% | 74.9% | 0.0% | 6.8% | 889 |
| mk.Alpha 0.2.1 | 8 | 43 | 0.0% | 100.0% | 0.0% | 0.0% | 1053 |
| ahf.r2d2.R2d2 0.86 | 8 | 202 | 6.2% | 90.2% | 1.2% | 2.5% | 887 |
| kawigi.mini.Coriantumr 1.1 | 8 | 63 | 0.0% | 100.0% | 0.0% | 0.0% | 865 |
| bvh.frg.Friga 0.112dev | 8 | 81 | 7.7% | 89.4% | 0.0% | 2.9% | 848 |
| ags.micro.Carpet 1.1 | 8 | 356 | 15.8% | 78.7% | 0.0% | 5.5% | 1227 |
| bvh.mini.Freya 0.55 | 8 | 50 | 12.6% | 81.8% | 0.0% | 5.6% | 806 |
| robar.micro.Kirbyi 1.0 | 8 | 462 | 16.2% | 77.7% | 0.2% | 5.9% | 820 |
| davidalves.net.DuelistMicroMkII 1.1 | 8 | 483 | 18.1% | 75.0% | 0.0% | 6.9% | 890 |
| mnt.AHEB 0.6a | 8 | 290 | 19.4% | 73.3% | 0.0% | 7.3% | 951 |
| lucasslf.Dodger 1.0 | 8 | 338 | 20.3% | 72.3% | 0.0% | 7.4% | 1399 |
| tw.Exterminator 1.0 | 8 | 298 | 39.8% | 48.4% | 0.1% | 11.6% | 4052 |
| Krabb.krabby.Krabby 1.18b | 8 | 174 | 7.2% | 90.6% | 0.0% | 2.2% | 804 |
| pez.mako.Mako 1.5 | 8 | 189 | 6.6% | 91.1% | 0.1% | 2.2% | 834 |
| pe.mini.SandboxMini 1.2 | 8 | 352 | 19.5% | 73.7% | 0.0% | 6.8% | 728 |
| KiraNL.ChupaLite 0.4 | 8 | 321 | 17.5% | 74.1% | 0.0% | 8.4% | 887 |
| zen.Lindada 0.2 | 8 | 151 | 4.1% | 93.8% | 0.0% | 2.1% | 906 |
| ds.OoV4 0.3b | 8 | 154 | 4.1% | 94.6% | 0.0% | 1.4% | 1567 |
| simonton.nano.WeekendObsession_S 1.7 | 8 | 446 | 18.2% | 74.5% | 0.0% | 7.3% | 806 |
| amk.ChumbaWumba 0.3 | 8 | 343 | 21.9% | 68.9% | 0.8% | 8.5% | 713 |
| tzu.TheArtOfWar 1.2 | 8 | 79 | 7.9% | 88.7% | 0.0% | 3.5% | 793 |
| suh.nano.RandomPM 1.02 | 8 | 516 | 20.6% | 71.3% | 0.0% | 8.1% | 827 |
| nat.nano.OcnirpPM 1.0 | 8 | 455 | 15.1% | 78.8% | 0.1% | 6.0% | 724 |
| nat.nano.Ocnirp 1.73 | 8 | 514 | 18.2% | 74.5% | 0.0% | 7.2% | 735 |
| lrem.magic.TormentedAngel Antiquitie | 8 | 371 | 16.9% | 76.9% | 0.0% | 6.2% | 902 |
| spinnercat.CopyKat 1.2.3 | 8 | 341 | 33.0% | 55.5% | 0.0% | 11.5% | 748 |
| syl.Centipede 0.5 | 8 | 78 | 16.1% | 77.5% | 0.0% | 6.4% | 744 |
| myl.micro.NekoNinja 1.30 | 8 | 237 | 7.9% | 88.5% | 0.0% | 3.6% | 1058 |
| ins.MobyNano 0.8 | 8 | 320 | 7.8% | 89.1% | 0.0% | 3.1% | 795 |
| metal.small.MCool 1.21 | 8 | 69 | 0.0% | 100.0% | 0.0% | 0.0% | 768 |
| starpkg.StarViewerZ 1.26 | 8 | 112 | 0.0% | 100.0% | 0.0% | 0.0% | 1764 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 376 | 11.6% | 81.9% | 0.0% | 6.4% | 619 |
| stelo.SteloTestNano 1.0 | 8 | 257 | 12.1% | 83.0% | 0.2% | 4.7% | 690 |
| casey.Flee 1.0 | 8 | 413 | 12.1% | 82.7% | 0.0% | 5.2% | 711 |
| vuen.Fractal 0.55 | 8 | 134 | 18.7% | 74.3% | 0.0% | 7.0% | 739 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| dft.Cyanide 1.90 | 8 | 8 | 0 | 0 | 0.60 | 0 | 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 8 | 7 | 0 | 0 | 0.52 | 1 | 1 | 0 |
| tide.pear.Pear 0.62.1 | 8 | 6 | 0 | 0 | 0.39 | 2 | 0 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 8 | 6 | 0 | 1 | 0.61 | 1 | 1 | 0 |
| simonton.mega.SniperFrog 1.0.fix2 | 8 | 6 | 0 | 1 | 0.56 | 1 | 1 | 0 |
| cf.proto.Shiva 2.2 | 8 | 8 | 0 | 0 | 0.41 | 0 | 0 | 0 |
| apv.test.Virus 0.6.1 | 8 | 8 | 0 | 0 | 0.44 | 0 | 0 | 0 |
| rz.Aleph 0.34 | 8 | 8 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| jcs.Decepticon 2.5.3 | 8 | 7 | 0 | 0 | 0.40 | 1 | 1 | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| trab.Crusader 0.1.7 | 8 | 7 | 0 | 0 | 0.39 | 1 | 1 | 0 |
| theo.real.Ahab 1.0 | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| lucasslf.Wiggins 0.6 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| jekl.DarkHallow .90.9 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| kid.Gladiator .7.2 | 8 | 7 | 0 | 0 | 0.34 | 1 | 1 | 0 |
| stefw.Tigger 0.0.23 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| kc.micro.Thorn 1.252 | 8 | 8 | 0 | 0 | 0.40 | 0 | 0 | 0 |
| ej.ChocolateBar 1.1 | 8 | 8 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| trm.Wrekt 1.1.6.f | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| jam.mini.Raiko 0.43 | 8 | 8 | 0 | 0 | 0.41 | 0 | 0 | 0 |
| florent.small.LittleAngel 1.8 | 8 | 7 | 0 | 1 | 0.64 | 0 | 0 | 0 |
| theo.Tungsten 1.0a | 8 | 7 | 0 | 1 | 0.50 | 1 | 0 | 0 |
| ary.mini.Nimi 1.0 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| kms.Golden 0.10 | 8 | 6 | 0 | 0 | 0.34 | 2 | 1 | 0 |
| pkbots.BoyTDSurfer 1.0 | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| theo.avenge.Pequod 1.0 | 8 | 7 | 0 | 0 | 0.37 | 1 | 1 | 0 |
| gh.GrubbmGrb 1.2.4 | 8 | 7 | 0 | 0 | 0.39 | 1 | 1 | 0 |
| kid.Toa .0.5 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| jam.micro.RaikoMicro 1.44 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| vic.Locke 0.7.5.5 | 8 | 7 | 0 | 0 | 0.33 | 1 | 1 | 0 |
| simonton.micro.GFMicro 1.0 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| brainfade.Fallen 0.63 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| ad.Quest 0.10 | 8 | 8 | 0 | 1 | 0.52 | 0 | 0 | 0 |
| lucasslf.HariSeldon 0.2.1 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| wilson.Chameleon 0.91 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| wiki.mini.Sedan 1.0 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| ph.mini.Archer 0.6.6 | 8 | 7 | 0 | 0 | 0.39 | 1 | 1 | 0 |
| nkn.mini.Jskr0 0.1 | 8 | 8 | 0 | 0 | 0.41 | 0 | 0 | 0 |
| kcn.unnamed.Unnamed 1.21 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| ph.musketeer.Musketeer 0.6 | 8 | 7 | 0 | 0 | 0.36 | 1 | 1 | 0 |
| jekl.Jekyl .70 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| mladjo.Grrrrr 0.9 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| nat.Hikari dev0001 | 8 | 7 | 0 | 0 | 0.39 | 1 | 1 | 0 |
| pez.gloom.GloomyDark 0.9.2 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| jekl.mini.BlackPearl .91 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| ph.micro.Pikeman 0.4.5 | 8 | 7 | 0 | 1 | 0.77 | 0 | 0 | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 8 | 8 | 0 | 0 | 0.40 | 0 | 0 | 0 |
| pez.clean.Swiffer 0.2.9 | 8 | 8 | 0 | 0 | 0.44 | 0 | 0 | 0 |
| dft.Virgin 1.25 | 8 | 8 | 0 | 0 | 0.41 | 0 | 0 | 0 |
| davidalves.net.DuelistMini 1.1 | 8 | 8 | 0 | 0 | 0.55 | 0 | 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 8 | 0 | 0 | 0.53 | 0 | 0 | 0 |
| reaper.Reaper 1.1 | 8 | 8 | 0 | 0 | 0.50 | 0 | 0 | 0 |
| arthord.KostyaTszyu Beta2 | 8 | 8 | 0 | 0 | 0.40 | 0 | 0 | 0 |
| mk.Alpha 0.2.1 | 8 | 8 | 0 | 0 | 0.40 | 0 | 0 | 0 |
| ahf.r2d2.R2d2 0.86 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| bvh.frg.Friga 0.112dev | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| ags.micro.Carpet 1.1 | 8 | 7 | 0 | 0 | 0.35 | 1 | 1 | 0 |
| bvh.mini.Freya 0.55 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| robar.micro.Kirbyi 1.0 | 8 | 8 | 0 | 0 | 0.43 | 0 | 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 8 | 8 | 0 | 0 | 0.49 | 0 | 0 | 0 |
| mnt.AHEB 0.6a | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| lucasslf.Dodger 1.0 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| tw.Exterminator 1.0 | 8 | 7 | 0 | 0 | 0.49 | 1 | 1 | 0 |
| Krabb.krabby.Krabby 1.18b | 8 | 7 | 0 | 0 | 0.36 | 1 | 1 | 0 |
| pez.mako.Mako 1.5 | 8 | 8 | 0 | 0 | 0.40 | 0 | 0 | 0 |
| pe.mini.SandboxMini 1.2 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| KiraNL.ChupaLite 0.4 | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| zen.Lindada 0.2 | 8 | 7 | 0 | 0 | 0.36 | 1 | 1 | 0 |
| ds.OoV4 0.3b | 8 | 8 | 0 | 0 | 0.41 | 0 | 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 8 | 8 | 0 | 1 | 0.49 | 0 | 0 | 0 |
| amk.ChumbaWumba 0.3 | 8 | 7 | 0 | 0 | 0.36 | 1 | 1 | 0 |
| tzu.TheArtOfWar 1.2 | 8 | 8 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| suh.nano.RandomPM 1.02 | 8 | 4 | 0 | 0 | 0.28 | 4 | 4 | 0 |
| nat.nano.OcnirpPM 1.0 | 8 | 8 | 0 | 0 | 0.43 | 0 | 0 | 0 |
| nat.nano.Ocnirp 1.73 | 8 | 6 | 0 | 0 | 0.38 | 2 | 2 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 8 | 7 | 0 | 0 | 0.38 | 1 | 1 | 0 |
| spinnercat.CopyKat 1.2.3 | 8 | 7 | 0 | 0 | 0.33 | 1 | 1 | 0 |
| syl.Centipede 0.5 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| myl.micro.NekoNinja 1.30 | 8 | 8 | 0 | 0 | 0.41 | 0 | 0 | 0 |
| ins.MobyNano 0.8 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| metal.small.MCool 1.21 | 8 | 7 | 0 | 0 | 0.31 | 1 | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| stelo.SteloTestNano 1.0 | 8 | 8 | 0 | 0 | 0.45 | 0 | 0 | 0 |
| casey.Flee 1.0 | 8 | 7 | 0 | 0 | 0.39 | 1 | 0 | 0 |
| vuen.Fractal 0.55 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |

676 of 712 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| dft.Cyanide 1.90 | 15691 | 696 | 15692 | 15691 (100.0%) | 0 (0.0%) | 1 (0.0%) | 36 | 16 | 49 |
| wcsv.Engineer.Engineer 0.5.4 | 15359 | 308 | 15358 | 15358 (100.0%) | 1 (0.0%) | 0 (0.0%) | 138 | 80 | 63 |
| tide.pear.Pear 0.62.1 | 7933 | 96 | 7932 | 7925 (99.9%) | 8 (0.1%) | 7 (0.1%) | 49 | 131 | 32 |
| simonton.mini.WeeksOnEnd 1.10.4 | 26597 | 496 | 26596 | 26595 (100.0%) | 2 (0.0%) | 1 (0.0%) | 114 | 33 | 48 |
| simonton.beta.LifelongObsession 0.5.1 | 27058 | 516 | 27061 | 27057 (100.0%) | 1 (0.0%) | 4 (0.0%) | 74 | 13 | 40 |
| simonton.mega.SniperFrog 1.0.fix2 | 14879 | 13 | 14884 | 14879 (100.0%) | 0 (0.0%) | 5 (0.0%) | 24 | 32 | 33 |
| cf.proto.Shiva 2.2 | 14023 | 0 | 14026 | 14023 (100.0%) | 0 (0.0%) | 3 (0.0%) | 201 | 21 | 78 |
| apv.test.Virus 0.6.1 | 15894 | 502 | 15894 | 15893 (100.0%) | 1 (0.0%) | 1 (0.0%) | 16 | 62 | 40 |
| rz.Aleph 0.34 | 13899 | 2 | 13904 | 13899 (100.0%) | 0 (0.0%) | 5 (0.0%) | 230 | 15 | 54 |
| jcs.Decepticon 2.5.3 | 15971 | 394 | 15971 | 15969 (100.0%) | 2 (0.0%) | 2 (0.0%) | 284 | 96 | 43 |
| rdt.AgentSmith.AgentSmith 0.5 | 14488 | 4 | 14488 | 14488 (100.0%) | 0 (0.0%) | 0 (0.0%) | 27 | 17 | 44 |
| trab.Crusader 0.1.7 | 18919 | 7 | 18920 | 18917 (100.0%) | 2 (0.0%) | 3 (0.0%) | 410 | 87 | 61 |
| theo.real.Ahab 1.0 | 16953 | 2 | 16960 | 16953 (100.0%) | 0 (0.0%) | 7 (0.0%) | 193 | 45 | 52 |
| lucasslf.Wiggins 0.6 | 25574 | 456 | 25574 | 25570 (100.0%) | 4 (0.0%) | 4 (0.0%) | 104 | 29 | 46 |
| jekl.DarkHallow .90.9 | 14477 | 50 | 14803 | 14477 (100.0%) | 0 (0.0%) | 326 (2.2%) | 483 | 14 | 41 |
| kid.Gladiator .7.2 | 8116 | 0 | 8998 | 8115 (100.0%) | 1 (0.0%) | 883 (9.8%) | 645 | 19 | 39 |
| stefw.Tigger 0.0.23 | 13724 | 4 | 13712 | 13711 (99.9%) | 13 (0.1%) | 1 (0.0%) | 145 | 24 | 236 |
| kc.micro.Thorn 1.252 | 13070 | 1 | 13094 | 13070 (100.0%) | 0 (0.0%) | 24 (0.2%) | 179 | 39 | 46 |
| ej.ChocolateBar 1.1 | 14892 | 1 | 14891 | 14891 (100.0%) | 1 (0.0%) | 0 (0.0%) | 153 | 11 | 31 |
| trm.Wrekt 1.1.6.f | 14077 | 1 | 14089 | 14077 (100.0%) | 0 (0.0%) | 12 (0.1%) | 226 | 29 | 50 |
| jam.mini.Raiko 0.43 | 14811 | 1 | 14815 | 14811 (100.0%) | 0 (0.0%) | 4 (0.0%) | 141 | 16 | 32 |
| florent.small.LittleAngel 1.8 | 14321 | 6 | 14359 | 14320 (100.0%) | 1 (0.0%) | 39 (0.3%) | 366 | 32 | 37 |
| theo.Tungsten 1.0a | 12806 | 3 | 12809 | 12806 (100.0%) | 0 (0.0%) | 3 (0.0%) | 51 | 44 | 47 |
| ary.mini.Nimi 1.0 | 19418 | 2 | 19422 | 19418 (100.0%) | 0 (0.0%) | 4 (0.0%) | 190 | 23 | 66 |
| kms.Golden 0.10 | 10603 | 7 | 10603 | 10603 (100.0%) | 0 (0.0%) | 0 (0.0%) | 145 | 32 | 84 |
| pkbots.BoyTDSurfer 1.0 | 21488 | 154 | 21489 | 21488 (100.0%) | 0 (0.0%) | 1 (0.0%) | 89 | 43 | 46 |
| theo.avenge.Pequod 1.0 | 12897 | 5 | 12911 | 12896 (100.0%) | 1 (0.0%) | 15 (0.1%) | 219 | 40 | 47 |
| gh.GrubbmGrb 1.2.4 | 15465 | 4 | 15465 | 15465 (100.0%) | 0 (0.0%) | 0 (0.0%) | 162 | 27 | 48 |
| kid.Toa .0.5 | 14136 | 1 | 15333 | 14136 (100.0%) | 0 (0.0%) | 1197 (7.8%) | 885 | 38 | 41 |
| jam.micro.RaikoMicro 1.44 | 13661 | 3 | 13718 | 13661 (100.0%) | 0 (0.0%) | 57 (0.4%) | 289 | 9 | 45 |
| vic.Locke 0.7.5.5 | 15035 | 0 | 15036 | 15035 (100.0%) | 0 (0.0%) | 1 (0.0%) | 253 | 18 | 39 |
| simonton.micro.GFMicro 1.0 | 24039 | 448 | 24039 | 24039 (100.0%) | 0 (0.0%) | 0 (0.0%) | 51 | 47 | 61 |
| brainfade.Fallen 0.63 | 14000 | 0 | 14013 | 14000 (100.0%) | 0 (0.0%) | 13 (0.1%) | 172 | 11 | 62 |
| ad.Quest 0.10 | 11671 | 149 | 11674 | 11671 (100.0%) | 0 (0.0%) | 3 (0.0%) | 202 | 35 | 52 |
| lucasslf.HariSeldon 0.2.1 | 25657 | 470 | 25656 | 25655 (100.0%) | 2 (0.0%) | 1 (0.0%) | 31 | 17 | 31 |
| wilson.Chameleon 0.91 | 14208 | 10 | 14212 | 14207 (100.0%) | 1 (0.0%) | 5 (0.0%) | 62 | 17 | 65 |
| wiki.mini.Sedan 1.0 | 12033 | 435 | 12036 | 12033 (100.0%) | 0 (0.0%) | 3 (0.0%) | 52 | 24 | 37 |
| ph.mini.Archer 0.6.6 | 18540 | 532 | 18540 | 18540 (100.0%) | 0 (0.0%) | 0 (0.0%) | 49 | 19 | 44 |
| nkn.mini.Jskr0 0.1 | 13697 | 1 | 13697 | 13696 (100.0%) | 1 (0.0%) | 1 (0.0%) | 41 | 31 | 35 |
| kcn.unnamed.Unnamed 1.21 | 14625 | 0 | 14635 | 14625 (100.0%) | 0 (0.0%) | 10 (0.1%) | 217 | 18 | 37 |
| metal.small.dna2.MCoolDNA 1.5 | 13327 | 1 | 13326 | 13326 (100.0%) | 1 (0.0%) | 0 (0.0%) | 58 | 24 | 48 |
| ph.musketeer.Musketeer 0.6 | 18296 | 533 | 18296 | 18296 (100.0%) | 0 (0.0%) | 0 (0.0%) | 41 | 22 | 51 |
| jekl.Jekyl .70 | 13173 | 2 | 13173 | 13173 (100.0%) | 0 (0.0%) | 0 (0.0%) | 144 | 27 | 29 |
| mladjo.Grrrrr 0.9 | 14425 | 3 | 14425 | 14425 (100.0%) | 0 (0.0%) | 0 (0.0%) | 73 | 22 | 39 |
| nat.Hikari dev0001 | 13235 | 19 | 13353 | 13209 (99.8%) | 26 (0.2%) | 144 (1.1%) | 983 | 98 | 77 |
| pez.gloom.GloomyDark 0.9.2 | 13046 | 4 | 13176 | 13046 (100.0%) | 0 (0.0%) | 130 (1.0%) | 251 | 16 | 33 |
| jekl.mini.BlackPearl .91 | 13342 | 0 | 13341 | 13341 (100.0%) | 1 (0.0%) | 0 (0.0%) | 41 | 20 | 35 |
| ph.micro.Pikeman 0.4.5 | 14536 | 5 | 14541 | 14536 (100.0%) | 0 (0.0%) | 5 (0.0%) | 70 | 20 | 40 |
| wiki.mini.BlackDestroyer 0.9.0 | 16511 | 392 | 16511 | 16511 (100.0%) | 0 (0.0%) | 0 (0.0%) | 67 | 20 | 36 |
| pez.clean.Swiffer 0.2.9 | 12415 | 13 | 12415 | 12415 (100.0%) | 0 (0.0%) | 0 (0.0%) | 84 | 29 | 37 |
| dft.Virgin 1.25 | 9698 | 2 | 9696 | 9696 (100.0%) | 2 (0.0%) | 0 (0.0%) | 51 | 23 | 50 |
| davidalves.net.DuelistMini 1.1 | 9826 | 1 | 9828 | 9824 (100.0%) | 2 (0.0%) | 4 (0.0%) | 123 | 16 | 48 |
| kawigi.mini.Fhqwhgads 1.1 | 12043 | 469 | 12042 | 12042 (100.0%) | 1 (0.0%) | 0 (0.0%) | 40 | 19 | 45 |
| reaper.Reaper 1.1 | 12810 | 12 | 12850 | 12803 (99.9%) | 7 (0.1%) | 47 (0.4%) | 360 | 20 | 106 |
| arthord.KostyaTszyu Beta2 | 11324 | 0 | 11364 | 11317 (99.9%) | 7 (0.1%) | 47 (0.4%) | 271 | 20 | 94 |
| mk.Alpha 0.2.1 | 17386 | 3 | 17389 | 17385 (100.0%) | 1 (0.0%) | 4 (0.0%) | 71 | 21 | 56 |
| ahf.r2d2.R2d2 0.86 | 12931 | 0 | 12931 | 12931 (100.0%) | 0 (0.0%) | 0 (0.0%) | 86 | 54 | 50 |
| kawigi.mini.Coriantumr 1.1 | 10881 | 3 | 10881 | 10881 (100.0%) | 0 (0.0%) | 0 (0.0%) | 70 | 17 | 33 |
| bvh.frg.Friga 0.112dev | 11419 | 0 | 11419 | 11419 (100.0%) | 0 (0.0%) | 0 (0.0%) | 26 | 15 | 39 |
| ags.micro.Carpet 1.1 | 21584 | 374 | 21583 | 21583 (100.0%) | 1 (0.0%) | 0 (0.0%) | 185 | 43 | 49 |
| bvh.mini.Freya 0.55 | 9552 | 4 | 9552 | 9552 (100.0%) | 0 (0.0%) | 0 (0.0%) | 102 | 7 | 57 |
| robar.micro.Kirbyi 1.0 | 11985 | 131 | 12089 | 11970 (99.9%) | 15 (0.1%) | 119 (1.0%) | 707 | 77 | 47 |
| davidalves.net.DuelistMicroMkII 1.1 | 11289 | 10 | 11336 | 11289 (100.0%) | 0 (0.0%) | 47 (0.4%) | 387 | 49 | 47 |
| mnt.AHEB 0.6a | 14382 | 31 | 14388 | 14378 (100.0%) | 4 (0.0%) | 10 (0.1%) | 229 | 35 | 60 |
| lucasslf.Dodger 1.0 | 26535 | 565 | 26535 | 26535 (100.0%) | 0 (0.0%) | 0 (0.0%) | 42 | 17 | 41 |
| tw.Exterminator 1.0 | 96661 | 19 | 97414 | 96660 (100.0%) | 1 (0.0%) | 754 (0.8%) | 603 | 105 | 96 |
| Krabb.krabby.Krabby 1.18b | 10929 | 3 | 10958 | 10898 (99.7%) | 31 (0.3%) | 60 (0.5%) | 297 | 51 | 47 |
| pez.mako.Mako 1.5 | 11192 | 15 | 11196 | 11189 (100.0%) | 3 (0.0%) | 7 (0.1%) | 191 | 28 | 55 |
| pe.mini.SandboxMini 1.2 | 8658 | 2 | 8659 | 8658 (100.0%) | 0 (0.0%) | 1 (0.0%) | 47 | 29 | 29 |
| KiraNL.ChupaLite 0.4 | 13502 | 6 | 13502 | 13502 (100.0%) | 0 (0.0%) | 0 (0.0%) | 46 | 32 | 35 |
| zen.Lindada 0.2 | 12577 | 13 | 12578 | 12576 (100.0%) | 1 (0.0%) | 2 (0.0%) | 133 | 21 | 72 |
| ds.OoV4 0.3b | 30224 | 69 | 30224 | 30222 (100.0%) | 2 (0.0%) | 2 (0.0%) | 124 | 46 | 58 |
| simonton.nano.WeekendObsession_S 1.7 | 11908 | 59 | 11967 | 11900 (99.9%) | 8 (0.1%) | 67 (0.6%) | 1229 | 113 | 51 |
| amk.ChumbaWumba 0.3 | 8943 | 4 | 8944 | 8942 (100.0%) | 1 (0.0%) | 2 (0.0%) | 86 | 23 | 40 |
| tzu.TheArtOfWar 1.2 | 11064 | 0 | 11064 | 11064 (100.0%) | 0 (0.0%) | 0 (0.0%) | 14 | 17 | 47 |
| suh.nano.RandomPM 1.02 | 12377 | 11 | 12403 | 12368 (99.9%) | 9 (0.1%) | 35 (0.3%) | 1156 | 113 | 81 |
| nat.nano.OcnirpPM 1.0 | 9669 | 8 | 9679 | 9633 (99.6%) | 36 (0.4%) | 46 (0.5%) | 1205 | 125 | 42 |
| nat.nano.Ocnirp 1.73 | 9880 | 17 | 9896 | 9840 (99.6%) | 40 (0.4%) | 56 (0.6%) | 1277 | 129 | 39 |
| lrem.magic.TormentedAngel Antiquitie | 13864 | 1 | 13863 | 13863 (100.0%) | 1 (0.0%) | 0 (0.0%) | 34 | 20 | 43 |
| spinnercat.CopyKat 1.2.3 | 10112 | 0 | 10113 | 10112 (100.0%) | 0 (0.0%) | 1 (0.0%) | 265 | 47 | 61 |
| syl.Centipede 0.5 | 8933 | 2 | 8933 | 8933 (100.0%) | 0 (0.0%) | 0 (0.0%) | 9 | 18 | 42 |
| myl.micro.NekoNinja 1.30 | 16263 | 1 | 16286 | 16262 (100.0%) | 1 (0.0%) | 24 (0.1%) | 296 | 35 | 51 |
| ins.MobyNano 0.8 | 11551 | 150 | 11607 | 11536 (99.9%) | 15 (0.1%) | 71 (0.6%) | 1443 | 120 | 34 |
| metal.small.MCool 1.21 | 10032 | 12 | 10032 | 10032 (100.0%) | 0 (0.0%) | 0 (0.0%) | 36 | 14 | 41 |
| starpkg.StarViewerZ 1.26 | 35743 | 2 | 35743 | 35743 (100.0%) | 0 (0.0%) | 0 (0.0%) | 73 | 24 | 60 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8374 | 198 | 8374 | 8373 (100.0%) | 1 (0.0%) | 1 (0.0%) | 555 | 84 | 66 |
| stelo.SteloTestNano 1.0 | 8560 | 13 | 8560 | 8560 (100.0%) | 0 (0.0%) | 0 (0.0%) | 63 | 39 | 43 |
| casey.Flee 1.0 | 9307 | 14 | 9381 | 9276 (99.7%) | 31 (0.3%) | 105 (1.1%) | 948 | 96 | 39 |
| vuen.Fractal 0.55 | 7596 | 1 | 7626 | 7583 (99.8%) | 13 (0.2%) | 43 (0.6%) | 221 | 36 | 42 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| dft.Cyanide 1.90 | 2104 | 15162 (720.6%) | 484 |
| wcsv.Engineer.Engineer 0.5.4 | 4695 | 11647 (248.1%) | 2979 |
| tide.pear.Pear 0.62.1 | 2199 | 5976 (271.8%) | 125 |
| simonton.mini.WeeksOnEnd 1.10.4 | 2912 | 25123 (862.7%) | 959 |
| simonton.beta.LifelongObsession 0.5.1 | 2624 | 25752 (981.4%) | 1293 |
| simonton.mega.SniperFrog 1.0.fix2 | 1831 | 13990 (764.1%) | 181 |
| cf.proto.Shiva 2.2 | 3801 | 12871 (338.6%) | 764 |
| apv.test.Virus 0.6.1 | 1825 | 15177 (831.6%) | 42 |
| rz.Aleph 0.34 | 4428 | 12697 (286.7%) | 239 |
| jcs.Decepticon 2.5.3 | 6667 | 10671 (160.1%) | 2532 |
| rdt.AgentSmith.AgentSmith 0.5 | 2579 | 13752 (533.2%) | 361 |
| trab.Crusader 0.1.7 | 7105 | 13752 (193.6%) | 4259 |
| theo.real.Ahab 1.0 | 4700 | 14713 (313.0%) | 2006 |
| lucasslf.Wiggins 0.6 | 2792 | 23704 (849.0%) | 1005 |
| jekl.DarkHallow .90.9 | 6028 | 13671 (226.8%) | 680 |
| kid.Gladiator .7.2 | 6692 | 7785 (116.3%) | 0 |
| stefw.Tigger 0.0.23 | 2405 | 12783 (531.5%) | 189 |
| kc.micro.Thorn 1.252 | 4701 | 10917 (232.2%) | 956 |
| ej.ChocolateBar 1.1 | 3303 | 14331 (433.9%) | 783 |
| trm.Wrekt 1.1.6.f | 4211 | 12116 (287.7%) | 816 |
| jam.mini.Raiko 0.43 | 3602 | 13842 (384.3%) | 839 |
| florent.small.LittleAngel 1.8 | 5465 | 12014 (219.8%) | 1538 |
| theo.Tungsten 1.0a | 2504 | 12050 (481.2%) | 657 |
| ary.mini.Nimi 1.0 | 3885 | 18069 (465.1%) | 697 |
| kms.Golden 0.10 | 2361 | 9081 (384.6%) | 700 |
| pkbots.BoyTDSurfer 1.0 | 2408 | 19819 (823.0%) | 973 |
| theo.avenge.Pequod 1.0 | 4177 | 11312 (270.8%) | 130 |
| gh.GrubbmGrb 1.2.4 | 3921 | 13365 (340.9%) | 1110 |
| kid.Toa .0.5 | 9354 | 13123 (140.3%) | 924 |
| jam.micro.RaikoMicro 1.44 | 4444 | 12937 (291.1%) | 125 |
| vic.Locke 0.7.5.5 | 4311 | 13972 (324.1%) | 377 |
| simonton.micro.GFMicro 1.0 | 1530 | 23238 (1518.8%) | 0 |
| brainfade.Fallen 0.63 | 2780 | 13458 (484.1%) | 0 |
| ad.Quest 0.10 | 3700 | 9733 (263.1%) | 1644 |
| lucasslf.HariSeldon 0.2.1 | 1567 | 24923 (1590.5%) | 247 |
| wilson.Chameleon 0.91 | 2988 | 13539 (453.1%) | 336 |
| wiki.mini.Sedan 1.0 | 2143 | 11407 (532.3%) | 159 |
| ph.mini.Archer 0.6.6 | 2315 | 17286 (746.7%) | 0 |
| nkn.mini.Jskr0 0.1 | 1609 | 13100 (814.2%) | 715 |
| kcn.unnamed.Unnamed 1.21 | 3831 | 14081 (367.6%) | 141 |
| metal.small.dna2.MCoolDNA 1.5 | 2567 | 12547 (488.8%) | 245 |
| ph.musketeer.Musketeer 0.6 | 2280 | 16960 (743.9%) | 128 |
| jekl.Jekyl .70 | 3407 | 12182 (357.6%) | 0 |
| mladjo.Grrrrr 0.9 | 2231 | 13268 (594.7%) | 593 |
| nat.Hikari dev0001 | 2045 | 12006 (587.1%) | 629 |
| pez.gloom.GloomyDark 0.9.2 | 4348 | 12214 (280.9%) | 0 |
| jekl.mini.BlackPearl .91 | 2173 | 12357 (568.7%) | 109 |
| ph.micro.Pikeman 0.4.5 | 2117 | 13579 (641.4%) | 402 |
| wiki.mini.BlackDestroyer 0.9.0 | 2475 | 15164 (612.7%) | 423 |
| pez.clean.Swiffer 0.2.9 | 2942 | 11372 (386.5%) | 0 |
| dft.Virgin 1.25 | 2921 | 8947 (306.3%) | 578 |
| davidalves.net.DuelistMini 1.1 | 3041 | 9075 (298.4%) | 81 |
| kawigi.mini.Fhqwhgads 1.1 | 2164 | 10881 (502.8%) | 601 |
| reaper.Reaper 1.1 | 2193 | 12410 (565.9%) | 0 |
| arthord.KostyaTszyu Beta2 | 3332 | 10694 (320.9%) | 0 |
| mk.Alpha 0.2.1 | 1748 | 17054 (975.6%) | 147 |
| ahf.r2d2.R2d2 0.86 | 2067 | 12452 (602.4%) | 294 |
| kawigi.mini.Coriantumr 1.1 | 3140 | 10430 (332.2%) | 0 |
| bvh.frg.Friga 0.112dev | 2156 | 10856 (503.5%) | 0 |
| ags.micro.Carpet 1.1 | 3817 | 19111 (500.7%) | 750 |
| bvh.mini.Freya 0.55 | 3282 | 9293 (283.2%) | 0 |
| robar.micro.Kirbyi 1.0 | 2924 | 9912 (339.0%) | 1130 |
| davidalves.net.DuelistMicroMkII 1.1 | 4790 | 9834 (205.3%) | 0 |
| mnt.AHEB 0.6a | 2502 | 13477 (538.6%) | 240 |
| lucasslf.Dodger 1.0 | 1677 | 25768 (1536.6%) | 0 |
| tw.Exterminator 1.0 | 8130 | 89112 (1096.1%) | 6356 |
| Krabb.krabby.Krabby 1.18b | 1793 | 10246 (571.4%) | 85 |
| pez.mako.Mako 1.5 | 3008 | 10272 (341.5%) | 0 |
| pe.mini.SandboxMini 1.2 | 2503 | 8036 (321.1%) | 0 |
| KiraNL.ChupaLite 0.4 | 1766 | 12675 (717.7%) | 55 |
| zen.Lindada 0.2 | 3317 | 11889 (358.4%) | 396 |
| ds.OoV4 0.3b | 2858 | 29155 (1020.1%) | 908 |
| simonton.nano.WeekendObsession_S 1.7 | 1859 | 10827 (582.4%) | 20 |
| amk.ChumbaWumba 0.3 | 2308 | 7997 (346.5%) | 242 |
| tzu.TheArtOfWar 1.2 | 2099 | 10404 (495.7%) | 96 |
| suh.nano.RandomPM 1.02 | 1811 | 11079 (611.8%) | 0 |
| nat.nano.OcnirpPM 1.0 | 2081 | 8270 (397.4%) | 197 |
| nat.nano.Ocnirp 1.73 | 2070 | 8549 (413.0%) | 76 |
| lrem.magic.TormentedAngel Antiquitie | 1696 | 12835 (756.8%) | 265 |
| spinnercat.CopyKat 1.2.3 | 1340 | 9431 (703.8%) | 319 |
| syl.Centipede 0.5 | 2470 | 8568 (346.9%) | 0 |
| myl.micro.NekoNinja 1.30 | 4180 | 14573 (348.6%) | 0 |
| ins.MobyNano 0.8 | 1820 | 10756 (591.0%) | 89 |
| metal.small.MCool 1.21 | 1948 | 9633 (494.5%) | 0 |
| starpkg.StarViewerZ 1.26 | 2439 | 34518 (1415.3%) | 834 |
| apv.NanoLauLectrikTheCannibal 1.1 | 2088 | 6446 (308.7%) | 1392 |
| stelo.SteloTestNano 1.0 | 1606 | 7946 (494.8%) | 108 |
| casey.Flee 1.0 | 2304 | 8051 (349.4%) | 380 |
| vuen.Fractal 0.55 | 3664 | 7289 (198.9%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| dft.Cyanide 1.90 | 650 | 475 | 650 | 852 | 5.2 / 2.5 | 2 | 698 | 2606 |
| wcsv.Engineer.Engineer 0.5.4 | 650 | 375 | 619 | 792 | 19.9 / 18.1 | 495 | 1233 | 856 |
| tide.pear.Pear 0.62.1 | 650 | 299 | 400 | 447 | 50.4 / 19.0 | 1061 | 1456 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 650 | 479 | 650 | 1266 | 8.3 / 4.8 | 6 | 870 | 2093 |
| simonton.beta.LifelongObsession 0.5.1 | 650 | 478 | 650 | 1290 | 6.4 / 5.3 | 0 | 512 | 1987 |
| simonton.mega.SniperFrog 1.0.fix2 | 650 | 378 | 650 | 805 | 7.9 / 4.1 | 8 | 453 | 251 |
| cf.proto.Shiva 2.2 | 650 | 441 | 650 | 835 | 6.6 / 4.2 | 60 | 607 | 76 |
| apv.test.Virus 0.6.1 | 650 | 431 | 647 | 831 | 12.9 / 9.6 | 76 | 661 | 1636 |
| rz.Aleph 0.34 | 650 | 492 | 650 | 847 | 5.2 / 5.7 | 32 | 976 | 35 |
| jcs.Decepticon 2.5.3 | 650 | 532 | 647 | 856 | 15.1 / 14.7 | 86 | 1658 | 2887 |
| rdt.AgentSmith.AgentSmith 0.5 | 650 | 497 | 650 | 819 | 5.4 / 4.9 | 0 | 354 | 0 |
| trab.Crusader 0.1.7 | 650 | 430 | 650 | 977 | 9.6 / 16.7 | 1 | 2370 | 18 |
| theo.real.Ahab 1.0 | 650 | 502 | 650 | 966 | 9.0 / 9.7 | 2 | 549 | 59 |
| lucasslf.Wiggins 0.6 | 650 | 459 | 650 | 1204 | 8.7 / 5.2 | 63 | 717 | 351 |
| jekl.DarkHallow .90.9 | 650 | 455 | 650 | 948 | 5.8 / 5.1 | 5 | 480 | 169 |
| kid.Gladiator .7.2 | 650 | 467 | 431 | 746 | 19.2 / 2.1 | 96 | 65 | 20 |
| stefw.Tigger 0.0.23 | 650 | 426 | 650 | 768 | 5.3 / 7.4 | 3 | 320 | 0 |
| kc.micro.Thorn 1.252 | 650 | 429 | 625 | 779 | 12.0 / 10.3 | 88 | 509 | 2 |
| ej.ChocolateBar 1.1 | 650 | 445 | 650 | 863 | 4.7 / 4.5 | 19 | 248 | 1 |
| trm.Wrekt 1.1.6.f | 650 | 374 | 650 | 819 | 7.7 / 8.2 | 54 | 283 | 2 |
| jam.mini.Raiko 0.43 | 650 | 445 | 650 | 853 | 5.7 / 4.9 | 1 | 131 | 2 |
| florent.small.LittleAngel 1.8 | 650 | 515 | 634 | 864 | 9.1 / 11.2 | 27 | 1104 | 253 |
| theo.Tungsten 1.0a | 650 | 404 | 650 | 758 | 13.0 / 7.8 | 52 | 388 | 0 |
| ary.mini.Nimi 1.0 | 650 | 487 | 650 | 1024 | 6.9 / 4.2 | 16 | 730 | 5 |
| kms.Golden 0.10 | 650 | 306 | 650 | 619 | 9.4 / 10.9 | 195 | 772 | 621 |
| pkbots.BoyTDSurfer 1.0 | 650 | 357 | 650 | 1041 | 6.7 / 8.9 | 14 | 465 | 201 |
| theo.avenge.Pequod 1.0 | 650 | 493 | 650 | 815 | 9.4 / 10.6 | 66 | 714 | 102 |
| gh.GrubbmGrb 1.2.4 | 650 | 456 | 609 | 820 | 15.5 / 9.5 | 253 | 1244 | 49 |
| kid.Toa .0.5 | 650 | 420 | 481 | 1075 | 17.6 / 5.9 | 55 | 27 | 68 |
| jam.micro.RaikoMicro 1.44 | 650 | 453 | 650 | 855 | 5.0 / 5.0 | 0 | 336 | 7 |
| vic.Locke 0.7.5.5 | 650 | 451 | 650 | 893 | 4.7 / 6.0 | 0 | 352 | 0 |
| simonton.micro.GFMicro 1.0 | 650 | 408 | 584 | 1135 | 17.9 / 6.1 | 81 | 353 | 503 |
| brainfade.Fallen 0.63 | 650 | 378 | 650 | 818 | 4.1 / 3.9 | 0 | 273 | 3 |
| ad.Quest 0.10 | 650 | 480 | 650 | 700 | 10.1 / 7.1 | 66 | 733 | 360 |
| lucasslf.HariSeldon 0.2.1 | 650 | 469 | 588 | 1207 | 8.5 / 2.8 | 76 | 583 | 271 |
| wilson.Chameleon 0.91 | 650 | 491 | 650 | 806 | 8.0 / 1.2 | 23 | 399 | 3 |
| wiki.mini.Sedan 1.0 | 650 | 460 | 650 | 689 | 6.8 / 3.8 | 6 | 352 | 337 |
| ph.mini.Archer 0.6.6 | 650 | 461 | 650 | 951 | 4.5 / 7.6 | 0 | 437 | 1473 |
| nkn.mini.Jskr0 0.1 | 650 | 423 | 650 | 747 | 4.9 / 4.1 | 1 | 251 | 184 |
| kcn.unnamed.Unnamed 1.21 | 650 | 476 | 650 | 890 | 4.2 / 3.8 | 2 | 864 | 4 |
| metal.small.dna2.MCoolDNA 1.5 | 650 | 372 | 650 | 780 | 9.3 / 6.3 | 29 | 579 | 0 |
| ph.musketeer.Musketeer 0.6 | 650 | 469 | 650 | 938 | 5.0 / 7.6 | 6 | 399 | 1432 |
| jekl.Jekyl .70 | 650 | 437 | 647 | 783 | 9.3 / 4.5 | 50 | 549 | 1 |
| mladjo.Grrrrr 0.9 | 650 | 433 | 650 | 782 | 6.8 / 6.6 | 49 | 308 | 468 |
| nat.Hikari dev0001 | 650 | 323 | 650 | 714 | 8.3 / 10.5 | 101 | 231 | 474 |
| pez.gloom.GloomyDark 0.9.2 | 650 | 461 | 631 | 839 | 8.0 / 4.7 | 22 | 625 | 8 |
| jekl.mini.BlackPearl .91 | 650 | 460 | 650 | 738 | 7.4 / 3.7 | 26 | 693 | 562 |
| ph.micro.Pikeman 0.4.5 | 650 | 501 | 650 | 791 | 4.1 / 3.9 | 0 | 253 | 443 |
| wiki.mini.BlackDestroyer 0.9.0 | 650 | 440 | 650 | 871 | 7.1 / 6.2 | 19 | 675 | 560 |
| pez.clean.Swiffer 0.2.9 | 650 | 439 | 619 | 745 | 12.6 / 6.0 | 79 | 440 | 0 |
| dft.Virgin 1.25 | 650 | 417 | 650 | 624 | 10.4 / 4.5 | 29 | 853 | 0 |
| davidalves.net.DuelistMini 1.1 | 650 | 517 | 650 | 663 | 7.7 / 2.0 | 2 | 559 | 123 |
| kawigi.mini.Fhqwhgads 1.1 | 650 | 343 | 650 | 679 | 10.3 / 7.1 | 90 | 1106 | 996 |
| reaper.Reaper 1.1 | 650 | 404 | 650 | 734 | 6.2 / 2.3 | 0 | 402 | 6 |
| arthord.KostyaTszyu Beta2 | 650 | 444 | 650 | 739 | 5.7 / 7.3 | 3 | 437 | 4 |
| mk.Alpha 0.2.1 | 650 | 551 | 650 | 903 | 5.9 / 1.2 | 20 | 335 | 0 |
| ahf.r2d2.R2d2 0.86 | 650 | 488 | 650 | 737 | 10.1 / 5.2 | 16 | 312 | 2 |
| kawigi.mini.Coriantumr 1.1 | 650 | 518 | 650 | 715 | 13.0 / 1.8 | 0 | 65 | 0 |
| bvh.frg.Friga 0.112dev | 650 | 528 | 650 | 698 | 7.3 / 2.1 | 12 | 513 | 0 |
| ags.micro.Carpet 1.1 | 650 | 492 | 650 | 1077 | 7.6 / 8.0 | 19 | 406 | 1872 |
| bvh.mini.Freya 0.55 | 650 | 505 | 650 | 656 | 7.1 / 1.2 | 0 | 66 | 0 |
| robar.micro.Kirbyi 1.0 | 650 | 262 | 628 | 670 | 14.4 / 10.3 | 288 | 1005 | 556 |
| davidalves.net.DuelistMicroMkII 1.1 | 650 | 441 | 647 | 740 | 14.7 / 10.4 | 102 | 434 | 36 |
| mnt.AHEB 0.6a | 650 | 378 | 638 | 801 | 6.6 / 6.1 | 39 | 553 | 17 |
| lucasslf.Dodger 1.0 | 650 | 403 | 650 | 1249 | 3.9 / 7.0 | 0 | 291 | 1250 |
| tw.Exterminator 1.0 | 650 | 508 | 650 | 3914 | 13.9 / 4.1 | 348 | 763 | 510 |
| Krabb.krabby.Krabby 1.18b | 650 | 392 | 628 | 653 | 9.8 / 4.5 | 61 | 409 | 191 |
| pez.mako.Mako 1.5 | 650 | 449 | 650 | 684 | 7.9 / 4.9 | 36 | 542 | 42 |
| pe.mini.SandboxMini 1.2 | 650 | 323 | 650 | 578 | 11.0 / 7.4 | 47 | 640 | 0 |
| KiraNL.ChupaLite 0.4 | 650 | 443 | 650 | 737 | 7.4 / 6.8 | 94 | 368 | 267 |
| zen.Lindada 0.2 | 650 | 496 | 650 | 757 | 7.3 / 4.1 | 16 | 395 | 77 |
| ds.OoV4 0.3b | 650 | 491 | 650 | 1417 | 7.8 / 4.2 | 19 | 447 | 89 |
| simonton.nano.WeekendObsession_S 1.7 | 650 | 371 | 650 | 656 | 12.2 / 9.5 | 81 | 810 | 486 |
| amk.ChumbaWumba 0.3 | 650 | 437 | 650 | 563 | 8.9 / 6.8 | 143 | 888 | 637 |
| tzu.TheArtOfWar 1.2 | 650 | 342 | 616 | 643 | 12.9 / 2.0 | 119 | 470 | 0 |
| suh.nano.RandomPM 1.02 | 650 | 393 | 650 | 676 | 6.4 / 10.5 | 56 | 599 | 463 |
| nat.nano.OcnirpPM 1.0 | 650 | 393 | 650 | 574 | 8.8 / 10.2 | 64 | 562 | 831 |
| nat.nano.Ocnirp 1.73 | 650 | 386 | 650 | 585 | 8.5 / 10.9 | 38 | 719 | 963 |
| lrem.magic.TormentedAngel Antiquitie | 650 | 409 | 619 | 751 | 6.0 / 8.2 | 6 | 1043 | 264 |
| spinnercat.CopyKat 1.2.3 | 650 | 348 | 650 | 598 | 11.4 / 5.4 | 99 | 396 | 412 |
| syl.Centipede 0.5 | 650 | 411 | 650 | 594 | 7.7 / 1.7 | 12 | 384 | 147 |
| myl.micro.NekoNinja 1.30 | 650 | 488 | 647 | 908 | 12.2 / 6.0 | 52 | 316 | 17 |
| ins.MobyNano 0.8 | 650 | 385 | 650 | 645 | 10.2 / 8.2 | 38 | 613 | 1010 |
| metal.small.MCool 1.21 | 650 | 449 | 650 | 618 | 5.2 / 2.0 | 0 | 182 | 81 |
| starpkg.StarViewerZ 1.26 | 650 | 412 | 650 | 1614 | 7.3 / 3.2 | 28 | 721 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 650 | 359 | 400 | 469 | 42.7 / 8.8 | 859 | 1129 | 297 |
| stelo.SteloTestNano 1.0 | 650 | 369 | 650 | 540 | 13.6 / 6.1 | 160 | 628 | 289 |
| casey.Flee 1.0 | 650 | 385 | 631 | 561 | 10.8 / 9.8 | 65 | 1118 | 1027 |
| vuen.Fractal 0.55 | 650 | 435 | 638 | 589 | 19.6 / 2.8 | 49 | 267 | 17 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| dft.Cyanide 1.90 | 3.5% | 168 | 19 | 3 | 2.1 | 67 / 15162 (0%) | 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 4.9% | 145 | 33 | 3 | 13.1 | 385 / 11647 (3%) | 0 | 0 |
| tide.pear.Pear 0.62.1 | 7.9% | 109 | 17 | 3 | 5.9 | 163 / 5976 (3%) | 0 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 2.2% | 110 | 39 | 3 | 5.2 | 179 / 25123 (1%) | 0 | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 2.3% | 172 | 54 | 3 | 4.3 | 136 / 25752 (1%) | 0 | 0 |
| simonton.mega.SniperFrog 1.0.fix2 | 0.9% | 157 | 22 | 3 | 2.9 | 92 / 13990 (1%) | 0 | 0 |
| cf.proto.Shiva 2.2 | 1.1% | 116 | 29 | 3 | 3.5 | 104 / 12871 (1%) | 0 | 0 |
| apv.test.Virus 0.6.1 | 4.0% | 124 | 24 | 3 | 1.6 | 46 / 15177 (0%) | 0 | 0 |
| rz.Aleph 0.34 | 1.2% | 104 | 28 | 3 | 4.4 | 113 / 12697 (1%) | 0 | 0 |
| jcs.Decepticon 2.5.3 | 4.7% | 113 | 47 | 3 | 17.5 | 442 / 10671 (4%) | 0 | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 1.1% | 107 | 33 | 3 | 2.4 | 65 / 13752 (0%) | 0 | 0 |
| trab.Crusader 0.1.7 | 3.7% | 110 | 60 | 3 | 19.0 | 498 / 13752 (4%) | 0 | 0 |
| theo.real.Ahab 1.0 | 2.2% | 109 | 35 | 3 | 7.7 | 223 / 14713 (2%) | 0 | 0 |
| lucasslf.Wiggins 0.6 | 2.1% | 90 | 52 | 3 | 6.7 | 148 / 23704 (1%) | 0 | 0 |
| jekl.DarkHallow .90.9 | 1.3% | 102 | 30 | 3 | 3.8 | 55 / 13671 (0%) | 0 | 0 |
| kid.Gladiator .7.2 | 0.5% | 95 | 21 | 3 | 4.3 | 41 / 7785 (1%) | 0 | 0 |
| stefw.Tigger 0.0.23 | 1.5% | 107 | 27 | 3 | 2.9 | 69 / 12783 (1%) | 0 | 0 |
| kc.micro.Thorn 1.252 | 2.4% | 113 | 40 | 3 | 7.9 | 215 / 10917 (2%) | 0 | 0 |
| ej.ChocolateBar 1.1 | 1.0% | 103 | 38 | 3 | 1.8 | 52 / 14331 (0%) | 0 | 0 |
| trm.Wrekt 1.1.6.f | 1.8% | 96 | 30 | 3 | 7.1 | 161 / 12116 (1%) | 0 | 0 |
| jam.mini.Raiko 0.43 | 1.0% | 115 | 41 | 3 | 3.3 | 88 / 13842 (1%) | 0 | 0 |
| florent.small.LittleAngel 1.8 | 2.4% | 179 | 40 | 3 | 7.6 | 168 / 12014 (1%) | 0 | 0 |
| theo.Tungsten 1.0a | 1.8% | 140 | 24 | 3 | 2.1 | 75 / 12050 (1%) | 0 | 0 |
| ary.mini.Nimi 1.0 | 0.8% | 106 | 28 | 3 | 4.9 | 111 / 18069 (1%) | 0 | 0 |
| kms.Golden 0.10 | 2.5% | 96 | 27 | 3 | 4.9 | 132 / 9081 (1%) | 0 | 0 |
| pkbots.BoyTDSurfer 1.0 | 2.5% | 109 | 31 | 3 | 5.4 | 148 / 19819 (1%) | 0 | 0 |
| theo.avenge.Pequod 1.0 | 2.2% | 104 | 27 | 3 | 5.3 | 138 / 11312 (1%) | 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 2.4% | 108 | 35 | 3 | 7.6 | 230 / 13365 (2%) | 0 | 0 |
| kid.Toa .0.5 | 1.3% | 101 | 36 | 3 | 7.6 | 65 / 13123 (0%) | 0 | 0 |
| jam.micro.RaikoMicro 1.44 | 1.0% | 99 | 38 | 3 | 2.6 | 56 / 12937 (0%) | 0 | 0 |
| vic.Locke 0.7.5.5 | 1.4% | 91 | 44 | 3 | 3.3 | 88 / 13972 (1%) | 0 | 0 |
| simonton.micro.GFMicro 1.0 | 3.1% | 92 | 36 | 3 | 1.2 | 24 / 23238 (0%) | 0 | 0 |
| brainfade.Fallen 0.63 | 1.1% | 101 | 21 | 3 | 1.6 | 36 / 13458 (0%) | 0 | 0 |
| ad.Quest 0.10 | 2.1% | 145 | 40 | 3 | 6.2 | 155 / 9733 (2%) | 0 | 0 |
| lucasslf.HariSeldon 0.2.1 | 1.7% | 98 | 25 | 3 | 2.2 | 40 / 24923 (0%) | 0 | 0 |
| wilson.Chameleon 0.91 | 0.5% | 92 | 39 | 3 | 2.1 | 50 / 13539 (0%) | 0 | 0 |
| wiki.mini.Sedan 1.0 | 2.8% | 99 | 34 | 3 | 1.9 | 50 / 11407 (0%) | 0 | 0 |
| ph.mini.Archer 0.6.6 | 3.6% | 108 | 28 | 3 | 3.6 | 71 / 17286 (0%) | 0 | 0 |
| nkn.mini.Jskr0 0.1 | 0.9% | 115 | 34 | 3 | 2.1 | 71 / 13100 (1%) | 0 | 0 |
| kcn.unnamed.Unnamed 1.21 | 0.8% | 93 | 27 | 3 | 1.7 | 43 / 14081 (0%) | 0 | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 1.4% | 97 | 22 | 3 | 2.5 | 52 / 12547 (0%) | 0 | 0 |
| ph.musketeer.Musketeer 0.6 | 3.6% | 102 | 38 | 3 | 3.7 | 69 / 16960 (0%) | 0 | 0 |
| jekl.Jekyl .70 | 1.4% | 98 | 30 | 3 | 3.5 | 73 / 12182 (1%) | 0 | 0 |
| mladjo.Grrrrr 0.9 | 1.6% | 100 | 33 | 3 | 4.1 | 102 / 13268 (1%) | 0 | 0 |
| nat.Hikari dev0001 | 2.8% | 109 | 24 | 3 | 3.8 | 141 / 12006 (1%) | 0 | 0 |
| pez.gloom.GloomyDark 0.9.2 | 1.0% | 107 | 37 | 3 | 3.0 | 36 / 12214 (0%) | 0 | 0 |
| jekl.mini.BlackPearl .91 | 0.9% | 102 | 30 | 3 | 3.6 | 70 / 12357 (1%) | 0 | 0 |
| ph.micro.Pikeman 0.4.5 | 0.8% | 216 | 34 | 3 | 3.5 | 79 / 13579 (1%) | 0 | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 3.0% | 112 | 32 | 3 | 4.1 | 101 / 15164 (1%) | 0 | 0 |
| pez.clean.Swiffer 0.2.9 | 1.5% | 122 | 33 | 3 | 3.1 | 44 / 11372 (0%) | 0 | 0 |
| dft.Virgin 1.25 | 1.1% | 114 | 32 | 3 | 2.5 | 54 / 8947 (1%) | 0 | 0 |
| davidalves.net.DuelistMini 1.1 | 0.5% | 154 | 19 | 3 | 1.5 | 35 / 9075 (0%) | 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 4.7% | 149 | 27 | 3 | 3.5 | 93 / 10881 (1%) | 0 | 0 |
| reaper.Reaper 1.1 | 0.8% | 140 | 49 | 3 | 1.3 | 25 / 12410 (0%) | 0 | 0 |
| arthord.KostyaTszyu Beta2 | 1.4% | 112 | 30 | 3 | 2.0 | 37 / 10694 (0%) | 0 | 0 |
| mk.Alpha 0.2.1 | 0.4% | 112 | 33 | 3 | 1.3 | 46 / 17054 (0%) | 0 | 0 |
| ahf.r2d2.R2d2 0.86 | 1.4% | 107 | 28 | 3 | 1.4 | 45 / 12452 (0%) | 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 0.4% | 97 | 28 | 3 | 1.3 | 28 / 10430 (0%) | 0 | 0 |
| bvh.frg.Friga 0.112dev | 0.6% | 105 | 32 | 3 | 2.1 | 44 / 10856 (0%) | 0 | 0 |
| ags.micro.Carpet 1.1 | 3.1% | 99 | 42 | 3 | 8.3 | 225 / 19111 (1%) | 0 | 0 |
| bvh.mini.Freya 0.55 | 0.3% | 93 | 36 | 3 | 0.8 | 13 / 9293 (0%) | 0 | 0 |
| robar.micro.Kirbyi 1.0 | 4.4% | 121 | 34 | 3 | 6.1 | 137 / 9912 (1%) | 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 2.4% | 138 | 35 | 3 | 4.4 | 88 / 9834 (1%) | 0 | 0 |
| mnt.AHEB 0.6a | 1.8% | 95 | 31 | 3 | 2.8 | 55 / 13477 (0%) | 0 | 0 |
| lucasslf.Dodger 1.0 | 2.7% | 102 | 49 | 3 | 1.7 | 17 / 25768 (0%) | 0 | 0 |
| tw.Exterminator 1.0 | 2.1% | 138 | 48 | 3 | 28.1 | 632 / 89112 (1%) | 0 | 0 |
| Krabb.krabby.Krabby 1.18b | 1.1% | 100 | 22 | 3 | 2.1 | 50 / 10246 (0%) | 0 | 0 |
| pez.mako.Mako 1.5 | 1.2% | 113 | 31 | 3 | 2.6 | 45 / 10272 (0%) | 0 | 0 |
| pe.mini.SandboxMini 1.2 | 1.5% | 92 | 27 | 3 | 1.9 | 42 / 8036 (1%) | 0 | 0 |
| KiraNL.ChupaLite 0.4 | 1.5% | 109 | 26 | 3 | 2.6 | 51 / 12675 (0%) | 0 | 0 |
| zen.Lindada 0.2 | 0.7% | 100 | 21 | 3 | 2.1 | 49 / 11889 (0%) | 0 | 0 |
| ds.OoV4 0.3b | 1.0% | 116 | 38 | 3 | 3.8 | 109 / 29155 (0%) | 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 3.3% | 138 | 32 | 3 | 2.9 | 49 / 10827 (0%) | 0 | 0 |
| amk.ChumbaWumba 0.3 | 1.6% | 101 | 33 | 3 | 3.0 | 50 / 7997 (1%) | 0 | 0 |
| tzu.TheArtOfWar 1.2 | 1.1% | 103 | 32 | 3 | 2.0 | 38 / 10404 (0%) | 0 | 0 |
| suh.nano.RandomPM 1.02 | 2.4% | 77 | 33 | 3 | 3.0 | 54 / 11079 (0%) | 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 2.6% | 120 | 28 | 3 | 3.8 | 80 / 8270 (1%) | 0 | 0 |
| nat.nano.Ocnirp 1.73 | 2.9% | 105 | 22 | 3 | 3.6 | 67 / 8549 (1%) | 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 1.6% | 105 | 27 | 3 | 2.7 | 37 / 12835 (0%) | 0 | 0 |
| spinnercat.CopyKat 1.2.3 | 1.7% | 93 | 30 | 3 | 1.8 | 70 / 9431 (1%) | 0 | 0 |
| syl.Centipede 0.5 | 0.7% | 100 | 21 | 3 | 1.1 | 18 / 8568 (0%) | 0 | 0 |
| myl.micro.NekoNinja 1.30 | 1.3% | 115 | 27 | 3 | 4.6 | 88 / 14573 (1%) | 0 | 0 |
| ins.MobyNano 0.8 | 2.9% | 105 | 24 | 3 | 2.3 | 49 / 10756 (0%) | 0 | 0 |
| metal.small.MCool 1.21 | 0.5% | 87 | 22 | 3 | 1.1 | 20 / 9633 (0%) | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 1.0% | 101 | 625 | 3 | 4.2 | 104 / 34518 (0%) | 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 4.3% | 106 | 35 | 3 | 3.5 | 106 / 6446 (2%) | 0 | 0 |
| stelo.SteloTestNano 1.0 | 1.9% | 125 | 26 | 3 | 1.8 | 53 / 7946 (1%) | 0 | 0 |
| casey.Flee 1.0 | 2.5% | 110 | 26 | 3 | 4.2 | 90 / 8051 (1%) | 0 | 0 |
| vuen.Fractal 0.55 | 0.6% | 89 | 28 | 3 | 0.9 | 14 / 7289 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| dft.Cyanide 1.90 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tide.pear.Pear 0.62.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.mega.SniperFrog 1.0.fix2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cf.proto.Shiva 2.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.test.Virus 0.6.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rz.Aleph 0.34 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jcs.Decepticon 2.5.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| trab.Crusader 0.1.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.real.Ahab 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lucasslf.Wiggins 0.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jekl.DarkHallow .90.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kid.Gladiator .7.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stefw.Tigger 0.0.23 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kc.micro.Thorn 1.252 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ej.ChocolateBar 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| trm.Wrekt 1.1.6.f | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jam.mini.Raiko 0.43 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| florent.small.LittleAngel 1.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.Tungsten 1.0a | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ary.mini.Nimi 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kms.Golden 0.10 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pkbots.BoyTDSurfer 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.avenge.Pequod 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kid.Toa .0.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jam.micro.RaikoMicro 1.44 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| vic.Locke 0.7.5.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.micro.GFMicro 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| brainfade.Fallen 0.63 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ad.Quest 0.10 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lucasslf.HariSeldon 0.2.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wilson.Chameleon 0.91 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wiki.mini.Sedan 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ph.mini.Archer 0.6.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nkn.mini.Jskr0 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kcn.unnamed.Unnamed 1.21 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ph.musketeer.Musketeer 0.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jekl.Jekyl .70 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mladjo.Grrrrr 0.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.Hikari dev0001 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.gloom.GloomyDark 0.9.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jekl.mini.BlackPearl .91 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ph.micro.Pikeman 0.4.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.clean.Swiffer 0.2.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dft.Virgin 1.25 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.net.DuelistMini 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| reaper.Reaper 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| arthord.KostyaTszyu Beta2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mk.Alpha 0.2.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ahf.r2d2.R2d2 0.86 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.frg.Friga 0.112dev | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ags.micro.Carpet 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.mini.Freya 0.55 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.micro.Kirbyi 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mnt.AHEB 0.6a | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lucasslf.Dodger 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tw.Exterminator 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| Krabb.krabby.Krabby 1.18b | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.mako.Mako 1.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pe.mini.SandboxMini 1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| KiraNL.ChupaLite 0.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| zen.Lindada 0.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ds.OoV4 0.3b | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| amk.ChumbaWumba 0.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tzu.TheArtOfWar 1.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| suh.nano.RandomPM 1.02 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.nano.Ocnirp 1.73 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| spinnercat.CopyKat 1.2.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| syl.Centipede 0.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| myl.micro.NekoNinja 1.30 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ins.MobyNano 0.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| metal.small.MCool 1.21 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| starpkg.StarViewerZ 1.26 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.SteloTestNano 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| casey.Flee 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| vuen.Fractal 0.55 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% | - | n/a |
| KiraNL.ChupaLite 0.4 | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 61.3% ± 18.9 | 64.3% ± 13.9 | -2.9 ± 24.6 |
| Krabb.krabby.Krabby 1.18b | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 0.8% ± 1.8 | 9.7% ± 21.1 | +8.9 ± 19.3 |
| Krabb.krabby.Krabby 1.18b | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 59.3% ± 27.6 | 67.4% ± 17.0 | +8.2 ± 29.8 |
| ad.Quest 0.10 | hadur2.Hadur 3.12shslsmss | 8 | 90.0% ± 8.9 | 98.8% ± 3.0 | +8.7 ± 8.3 | 20.4% ± 12.2 | 27.1% ± 21.5 | +6.8 ± 24.5 |
| ad.Quest 0.10 | hadur2.Hadur 3.12 | 8 | 92.5% ± 8.7 | 100.0% ± 0.0 | +7.5 ± 8.7 | 44.2% ± 15.1 | 82.5% ± 12.2 | +38.3 ± 16.5 |
| ags.micro.Carpet 1.1 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 97.5% ± 3.9 | -2.5 ± 3.9 | 11.8% ± 7.2 | 46.9% ± 14.7 | +35.1 ± 17.2 |
| ags.micro.Carpet 1.1 | hadur2.Hadur 3.12 | 8 | 95.0% ± 7.7 | 97.4% ± 4.1 | +2.4 ± 9.9 | 64.9% ± 20.0 | 42.2% ± 6.0 | -22.7 ± 22.5 |
| ahf.r2d2.R2d2 0.86 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 97.5% ± 3.9 | -2.5 ± 3.9 | 66.7% ± 143.4 | 13.5% ± 29.3 | -33.3 ± 286.8 |
| ahf.r2d2.R2d2 0.86 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 64.7% ± 9.1 | 66.0% ± 6.9 | +1.3 ± 7.2 |
| amk.ChumbaWumba 0.3 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 96.3% ± 6.2 | -3.7 ± 6.2 | 3.6% ± 15.3 | 32.2% ± 51.2 | +5.9 ± 210.3 |
| amk.ChumbaWumba 0.3 | hadur2.Hadur 3.12 | 8 | 92.5% ± 8.7 | 96.3% ± 6.2 | +3.7 ± 10.9 | 59.4% ± 20.1 | 50.5% ± 12.4 | -8.9 ± 16.4 |
| apv.NanoLauLectrikTheCannibal 1.1 | hadur2.Hadur 3.12shslsmss | 8 | 87.5% ± 8.7 | 100.0% ± 0.0 | +12.5 ± 8.7 | 4.9% ± 6.1 | 42.9% ± 28.7 | +38.0 ± 32.7 |
| apv.NanoLauLectrikTheCannibal 1.1 | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 81.6% ± 10.7 | 86.9% ± 6.8 | +5.3 ± 15.9 |
| apv.test.Virus 0.6.1 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.3% ± 0.8 | 0.4% ± 1.0 | +0.1 ± 0.2 |
| apv.test.Virus 0.6.1 | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 50.1% ± 11.2 | 58.0% ± 6.5 | +7.9 ± 13.9 |
| arthord.KostyaTszyu Beta2 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% ± 0.0 | - | n/a |
| arthord.KostyaTszyu Beta2 | hadur2.Hadur 3.12 | 8 | 95.0% ± 7.7 | 95.0% ± 4.5 | +0.0 ± 8.9 | 43.2% ± 14.7 | 40.2% ± 9.0 | -3.0 ± 17.1 |
| ary.mini.Nimi 1.0 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 97.5% ± 3.9 | -2.5 ± 3.9 | 1.3% ± 5.5 | 33.0% ± 60.6 | n/a |
| ary.mini.Nimi 1.0 | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 54.8% ± 13.5 | 68.2% ± 12.5 | +13.4 ± 15.9 |
| brainfade.Fallen 0.63 | hadur2.Hadur 3.12shslsmss | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 7.4 | 60.0% ± 68.0 | 35.3% ± 33.3 | -12.5 ± 103.7 |
| brainfade.Fallen 0.63 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 80.7% ± 23.5 | 49.4% ± 18.2 | -31.3 ± 31.5 |
| bvh.frg.Friga 0.112dev | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% | - | n/a |
| bvh.frg.Friga 0.112dev | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 54.9% ± 21.5 | 87.0% ± 5.3 | +32.1 ± 21.4 |
| bvh.mini.Freya 0.55 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | - | 0.0% | n/a |
| bvh.mini.Freya 0.55 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 84.7% ± 18.8 | 90.8% ± 12.2 | +6.0 ± 22.4 |
| casey.Flee 1.0 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 0.0% ± 0.0 | 42.5% ± 23.1 | +50.0 ± 26.6 |
| casey.Flee 1.0 | hadur2.Hadur 3.12 | 8 | 95.0% ± 7.7 | 96.3% ± 6.2 | +1.2 ± 11.3 | 61.5% ± 23.2 | 51.7% ± 14.3 | -9.8 ± 30.5 |
| cf.proto.Shiva 2.2 | hadur2.Hadur 3.12shslsmss | 8 | 92.5% ± 12.4 | 91.0% ± 9.7 | -1.5 ± 7.7 | 9.7% ± 12.1 | 58.7% ± 15.0 | +49.1 ± 22.9 |
| cf.proto.Shiva 2.2 | hadur2.Hadur 3.12 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 44.6% ± 11.2 | 72.0% ± 10.2 | +27.3 ± 12.2 |
| davidalves.net.DuelistMicroMkII 1.1 | hadur2.Hadur 3.12shslsmss | 8 | 95.0% ± 11.8 | 95.0% ± 6.3 | +0.0 ± 14.8 | 5.1% ± 4.6 | 57.5% ± 19.2 | +52.4 ± 20.4 |
| davidalves.net.DuelistMicroMkII 1.1 | hadur2.Hadur 3.12 | 8 | 85.0% ± 14.8 | 97.5% ± 3.9 | +12.5 ± 17.2 | 53.9% ± 15.2 | 57.7% ± 7.9 | +3.8 ± 19.4 |
| davidalves.net.DuelistMini 1.1 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | - | 16.8% | n/a |
| davidalves.net.DuelistMini 1.1 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 80.8% ± 22.5 | 76.8% ± 13.1 | -4.0 ± 29.4 |
| dft.Cyanide 1.90 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 8.3% ± 6.4 | 13.4% ± 3.1 | +5.1 ± 7.3 |
| dft.Cyanide 1.90 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 61.9% ± 19.6 | 74.2% ± 15.7 | +12.3 ± 26.8 |
| dft.Virgin 1.25 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 96.3% ± 4.3 | -3.7 ± 4.3 | 0.0% ± 0.0 | 20.0% ± 55.5 | +0.0 ± 0.0 |
| dft.Virgin 1.25 | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 3.0 | 71.2% ± 19.1 | 70.2% ± 13.3 | -1.0 ± 14.7 |
| ds.OoV4 0.3b | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 29.2% ± 16.5 | 18.1% ± 12.8 | -7.8 ± 28.4 |
| ds.OoV4 0.3b | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 49.9% ± 24.0 | 66.3% ± 11.2 | +16.4 ± 30.2 |
| ej.ChocolateBar 1.1 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% ± 0.0 | - | n/a |
| ej.ChocolateBar 1.1 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 97.5% ± 3.9 | -2.5 ± 3.9 | 68.6% ± 19.2 | 44.7% ± 8.8 | -23.8 ± 19.9 |
| florent.small.LittleAngel 1.8 | hadur2.Hadur 3.12shslsmss | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 0.1% ± 0.1 | 9.4% ± 12.9 | +9.4 ± 12.8 |
| florent.small.LittleAngel 1.8 | hadur2.Hadur 3.12 | 8 | 90.0% ± 8.9 | 98.8% ± 3.0 | +8.7 ± 8.3 | 41.1% ± 14.9 | 40.6% ± 8.8 | -0.6 ± 20.4 |
| gh.GrubbmGrb 1.2.4 | hadur2.Hadur 3.12shslsmss | 8 | 85.0% ± 14.8 | 100.0% ± 0.0 | +15.0 ± 14.8 | 0.2% ± 0.4 | 11.2% ± 26.4 | +11.0 ± 26.5 |
| gh.GrubbmGrb 1.2.4 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 89.3% ± 17.5 | -10.7 ± 17.5 | 70.7% ± 12.8 | 68.0% ± 24.2 | -2.7 ± 25.1 |
| ins.MobyNano 0.8 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 0.1% ± 0.2 | 61.4% ± 8.5 | +61.3 ± 8.3 |
| ins.MobyNano 0.8 | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 42.2% ± 10.4 | 57.8% ± 11.5 | +15.6 ± 13.3 |
| jam.micro.RaikoMicro 1.44 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 75.0% ± 79.6 | 100.0% | n/a |
| jam.micro.RaikoMicro 1.44 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 97.5% ± 5.9 | -2.5 ± 5.9 | 65.4% ± 23.4 | 55.1% ± 9.0 | -10.3 ± 22.6 |
| jam.mini.Raiko 0.43 | hadur2.Hadur 3.12shslsmss | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 0.0% | 0.0% ± 0.0 | n/a |
| jam.mini.Raiko 0.43 | hadur2.Hadur 3.12 | 8 | 95.0% ± 7.7 | 98.8% ± 3.0 | +3.7 ± 8.9 | 43.9% ± 12.6 | 65.8% ± 18.9 | +22.0 ± 24.6 |
| jcs.Decepticon 2.5.3 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 3.2% ± 3.5 | 3.1% ± 1.7 | -0.2 ± 4.4 |
| jcs.Decepticon 2.5.3 | hadur2.Hadur 3.12 | 8 | 95.0% ± 7.7 | 96.3% ± 6.2 | +1.2 ± 11.3 | 45.2% ± 9.8 | 58.2% ± 10.2 | +13.0 ± 17.1 |
| jekl.DarkHallow .90.9 | hadur2.Hadur 3.12shslsmss | 8 | 80.0% ± 23.6 | 97.4% ± 4.1 | +17.4 ± 20.2 | 9.3% ± 9.2 | 17.4% ± 19.4 | +6.8 ± 14.1 |
| jekl.DarkHallow .90.9 | hadur2.Hadur 3.12 | 8 | 90.0% ± 12.6 | 100.0% ± 0.0 | +10.0 ± 12.6 | 46.5% ± 8.0 | 79.2% ± 13.3 | +32.7 ± 8.8 |
| jekl.Jekyl .70 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 0.0% | 2.8% ± 9.1 | n/a |
| jekl.Jekyl .70 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 76.0% ± 19.5 | 72.8% ± 11.5 | -3.2 ± 16.7 |
| jekl.mini.BlackPearl .91 | hadur2.Hadur 3.12shslsmss | 8 | 82.5% ± 16.6 | 97.5% ± 5.9 | +15.0 ± 11.8 | 5.6% ± 9.7 | 12.3% ± 39.2 | +6.1 ± 43.4 |
| jekl.mini.BlackPearl .91 | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 65.4% ± 19.5 | 73.3% ± 21.9 | +7.9 ± 38.1 |
| kawigi.mini.Coriantumr 1.1 | hadur2.Hadur 3.12shslsmss | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 62.7% ± 43.1 | 86.1% ± 34.1 | +28.7 ± 69.1 |
| kawigi.mini.Coriantumr 1.1 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 85.9% ± 13.2 | 86.7% ± 10.2 | +0.8 ± 10.8 |
| kawigi.mini.Fhqwhgads 1.1 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 25.3% ± 23.9 | 7.1% ± 5.8 | -18.2 ± 23.8 |
| kawigi.mini.Fhqwhgads 1.1 | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 95.0% ± 6.3 | -2.5 ± 7.4 | 68.9% ± 11.8 | 57.4% ± 8.5 | -11.5 ± 14.5 |
| kc.micro.Thorn 1.252 | hadur2.Hadur 3.12shslsmss | 8 | 92.5% ± 8.7 | 100.0% ± 0.0 | +7.5 ± 8.7 | 1.6% ± 3.3 | 100.0% ± 0.0 | +94.4 ± 70.6 |
| kc.micro.Thorn 1.252 | hadur2.Hadur 3.12 | 8 | 92.5% ± 12.4 | 98.8% ± 3.0 | +6.3 ± 13.4 | 52.8% ± 9.9 | 53.4% ± 14.8 | +0.6 ± 17.7 |
| kcn.unnamed.Unnamed 1.21 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 6.5% ± 28.1 | - | n/a |
| kcn.unnamed.Unnamed 1.21 | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 60.8% ± 30.7 | 69.4% ± 21.1 | +8.6 ± 37.7 |
| kid.Gladiator .7.2 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | - | 33.3% ± 143.4 | n/a |
| kid.Gladiator .7.2 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 97.4% ± 4.1 | -2.6 ± 4.1 | 96.2% ± 6.0 | 87.7% ± 9.4 | -8.5 ± 11.8 |
| kid.Toa .0.5 | hadur2.Hadur 3.12shslsmss | 8 | 90.0% ± 8.9 | 88.6% ± 8.3 | -1.4 ± 15.7 | 0.0% ± 0.0 | 72.5% ± 6.9 | +72.5 ± 6.9 |
| kid.Toa .0.5 | hadur2.Hadur 3.12 | 8 | 92.5% ± 12.4 | 100.0% ± 0.0 | +7.5 ± 12.4 | 61.7% ± 17.0 | 82.9% ± 3.6 | +21.3 ± 17.1 |
| kms.Golden 0.10 | hadur2.Hadur 3.12shslsmss | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 0.0% ± 0.0 | 39.6% ± 50.8 | +16.9 ± 214.6 |
| kms.Golden 0.10 | hadur2.Hadur 3.12 | 8 | 90.0% ± 12.6 | 95.0% ± 4.5 | +5.0 ± 14.8 | 36.7% ± 12.8 | 47.8% ± 11.6 | +11.2 ± 18.2 |
| lrem.magic.TormentedAngel Antiquitie | hadur2.Hadur 3.12shslsmss | 8 | 97.5% ± 5.9 | 97.5% ± 5.9 | +0.0 ± 8.9 | 0.0% ± 0.0 | 22.8% ± 98.1 | +34.2 ± 434.6 |
| lrem.magic.TormentedAngel Antiquitie | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 4.5 | 30.0% ± 25.2 | 44.9% ± 12.6 | +12.4 ± 22.4 |
| lucasslf.Dodger 1.0 | hadur2.Hadur 3.12shslsmss | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 8.9% ± 5.7 | 7.0% ± 4.2 | -1.9 ± 7.1 |
| lucasslf.Dodger 1.0 | hadur2.Hadur 3.12 | 8 | 95.0% ± 11.8 | 96.3% ± 6.2 | +1.3 ± 7.0 | 40.0% ± 18.8 | 37.9% ± 14.2 | -2.0 ± 19.5 |
| lucasslf.HariSeldon 0.2.1 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 96.3% ± 6.2 | -3.7 ± 6.2 | 7.4% ± 11.4 | 15.3% ± 14.5 | +3.9 ± 16.2 |
| lucasslf.HariSeldon 0.2.1 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 77.5% ± 10.6 | 73.9% ± 10.3 | -3.6 ± 13.2 |
| lucasslf.Wiggins 0.6 | hadur2.Hadur 3.12shslsmss | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 7.3% ± 13.8 | 3.7% ± 2.8 | -3.6 ± 13.7 |
| lucasslf.Wiggins 0.6 | hadur2.Hadur 3.12 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 46.1% ± 13.3 | 57.8% ± 5.2 | +11.7 ± 12.0 |
| metal.small.MCool 1.21 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% | - | n/a |
| metal.small.MCool 1.21 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 81.4% ± 20.2 | 74.6% ± 19.9 | -0.6 ± 25.7 |
| metal.small.dna2.MCoolDNA 1.5 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 100.0% ± 0.0 | 83.3% ± 42.8 | +0.0 |
| metal.small.dna2.MCoolDNA 1.5 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 66.5% ± 21.6 | 70.0% ± 13.2 | +3.5 ± 29.1 |
| mk.Alpha 0.2.1 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | - | - | n/a |
| mk.Alpha 0.2.1 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 79.8% ± 24.5 | 89.2% ± 8.7 | +9.4 ± 17.6 |
| mladjo.Grrrrr 0.9 | hadur2.Hadur 3.12shslsmss | 8 | 67.5% ± 8.7 | 89.4% ± 9.2 | +21.9 ± 8.6 | 9.9% ± 12.3 | 42.0% ± 17.9 | +30.6 ± 18.4 |
| mladjo.Grrrrr 0.9 | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 57.7% ± 10.9 | 52.3% ± 19.6 | -5.4 ± 14.5 |
| mnt.AHEB 0.6a | hadur2.Hadur 3.12shslsmss | 8 | 97.5% ± 5.9 | 84.4% ± 13.6 | -13.1 ± 12.7 | 0.0% ± 0.0 | 29.9% ± 27.1 | +39.8 ± 33.2 |
| mnt.AHEB 0.6a | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 96.3% ± 6.2 | -3.7 ± 6.2 | 52.0% ± 22.6 | 47.3% ± 15.5 | -4.7 ± 20.8 |
| myl.micro.NekoNinja 1.30 | hadur2.Hadur 3.12shslsmss | 8 | 95.0% ± 11.8 | 97.5% ± 5.9 | +2.5 ± 14.0 | 83.1% ± 53.7 | 48.4% ± 36.3 | -14.2 ± 80.5 |
| myl.micro.NekoNinja 1.30 | hadur2.Hadur 3.12 | 8 | 95.0% ± 11.8 | 100.0% ± 0.0 | +5.0 ± 11.8 | 78.2% ± 19.1 | 75.5% ± 15.4 | -2.7 ± 24.3 |
| nat.Hikari dev0001 | hadur2.Hadur 3.12shslsmss | 8 | 92.5% ± 8.7 | 100.0% ± 0.0 | +7.5 ± 8.7 | 0.0% ± 0.0 | 54.2% ± 27.0 | +54.2 ± 27.0 |
| nat.Hikari dev0001 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 30.1% ± 12.3 | 48.8% ± 6.2 | +18.7 ± 12.5 |
| nat.nano.OcnirpPM 1.0 | hadur2.Hadur 3.12shslsmss | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 0.0% ± 0.0 | 29.5% ± 26.9 | +28.1 ± 32.8 |
| nat.nano.OcnirpPM 1.0 | hadur2.Hadur 3.12 | 8 | 95.0% ± 7.7 | 98.8% ± 3.0 | +3.7 ± 8.9 | 42.5% ± 14.7 | 44.2% ± 18.1 | +1.7 ± 24.3 |
| nat.nano.Ocnirp 1.73 | hadur2.Hadur 3.12shslsmss | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 0.0% ± 0.0 | 40.4% ± 26.0 | +47.2 ± 25.0 |
| nat.nano.Ocnirp 1.73 | hadur2.Hadur 3.12 | 8 | 95.0% ± 7.7 | 93.6% ± 6.3 | -1.4 ± 10.5 | 42.1% ± 28.0 | 42.6% ± 10.2 | +0.5 ± 28.1 |
| nkn.mini.Jskr0 0.1 | hadur2.Hadur 3.12shslsmss | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 2.1% ± 9.2 | 20.5% ± 88.4 | +55.2 |
| nkn.mini.Jskr0 0.1 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 43.3% ± 15.2 | 54.1% ± 23.2 | +10.8 ± 24.4 |
| pe.mini.SandboxMini 1.2 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 100.0% | 100.0% | n/a |
| pe.mini.SandboxMini 1.2 | hadur2.Hadur 3.12 | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 7.4 | 58.8% ± 11.2 | 58.6% ± 8.3 | -0.2 ± 14.9 |
| pez.clean.Swiffer 0.2.9 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 96.3% ± 4.3 | -3.7 ± 4.3 | 53.9% ± 41.3 | 60.8% ± 37.9 | +7.0 ± 50.9 |
| pez.clean.Swiffer 0.2.9 | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 67.1% ± 15.7 | 75.8% ± 7.4 | +8.7 ± 15.3 |
| pez.gloom.GloomyDark 0.9.2 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 66.7% ± 143.4 | 67.1% ± 38.4 | +8.6 ± 37.0 |
| pez.gloom.GloomyDark 0.9.2 | hadur2.Hadur 3.12 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 55.3% ± 14.2 | 77.2% ± 17.0 | +21.9 ± 17.2 |
| pez.mako.Mako 1.5 | hadur2.Hadur 3.12shslsmss | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 15.1% ± 14.7 | 3.2% ± 6.8 | -11.0 ± 13.6 |
| pez.mako.Mako 1.5 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 97.5% ± 3.9 | -2.5 ± 3.9 | 77.4% ± 17.6 | 57.6% ± 11.9 | -19.8 ± 21.1 |
| ph.micro.Pikeman 0.4.5 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% | 0.0% ± 0.0 | n/a |
| ph.micro.Pikeman 0.4.5 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 49.7% ± 35.1 | 57.1% ± 23.9 | +9.8 ± 19.5 |
| ph.mini.Archer 0.6.6 | hadur2.Hadur 3.12shslsmss | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 18.8% ± 10.9 | 29.1% ± 7.2 | +10.3 ± 9.3 |
| ph.mini.Archer 0.6.6 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 97.5% ± 3.9 | -2.5 ± 3.9 | 24.9% ± 27.0 | 40.5% ± 12.7 | +15.6 ± 31.2 |
| ph.musketeer.Musketeer 0.6 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 26.6% ± 9.5 | 25.6% ± 9.1 | -1.0 ± 14.3 |
| ph.musketeer.Musketeer 0.6 | hadur2.Hadur 3.12 | 8 | 90.0% ± 8.9 | 97.5% ± 3.9 | +7.5 ± 9.7 | 17.8% ± 19.4 | 43.6% ± 16.5 | +25.8 ± 31.8 |
| pkbots.BoyTDSurfer 1.0 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% ± 0.0 | 14.3% | n/a |
| pkbots.BoyTDSurfer 1.0 | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 93.8% ± 7.7 | -3.7 ± 10.9 | 30.6% ± 14.1 | 38.9% ± 11.1 | +8.3 ± 17.7 |
| rdt.AgentSmith.AgentSmith 0.5 | hadur2.Hadur 3.12shslsmss | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 0.0% ± 0.0 | - | n/a |
| rdt.AgentSmith.AgentSmith 0.5 | hadur2.Hadur 3.12 | 8 | 92.5% ± 8.7 | 100.0% ± 0.0 | +7.5 ± 8.7 | 29.8% ± 9.6 | 59.2% ± 7.5 | +29.4 ± 12.7 |
| reaper.Reaper 1.1 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 1.5% ± 3.9 | 15.0% ± 26.6 | n/a |
| reaper.Reaper 1.1 | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 70.5% ± 26.2 | 72.4% ± 23.4 | +2.0 ± 34.8 |
| robar.micro.Kirbyi 1.0 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 26.8% ± 28.5 | 27.3% ± 19.7 | +0.5 ± 40.1 |
| robar.micro.Kirbyi 1.0 | hadur2.Hadur 3.12 | 8 | 95.0% ± 7.7 | 96.3% ± 4.3 | +1.2 ± 8.3 | 58.4% ± 7.0 | 61.0% ± 7.9 | +2.7 ± 7.8 |
| rz.Aleph 0.34 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% ± 0.0 | 0.0% ± 0.0 | n/a |
| rz.Aleph 0.34 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 97.5% ± 3.9 | -2.5 ± 3.9 | 82.8% ± 18.4 | 41.4% ± 8.6 | -41.4 ± 23.8 |
| simonton.beta.LifelongObsession 0.5.1 | hadur2.Hadur 3.12shslsmss | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 8.9% ± 7.9 | 12.2% ± 9.0 | +3.3 ± 12.5 |
| simonton.beta.LifelongObsession 0.5.1 | hadur2.Hadur 3.12 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 52.9% ± 19.0 | 47.8% ± 7.9 | -5.1 ± 22.2 |
| simonton.mega.SniperFrog 1.0.fix2 | hadur2.Hadur 3.12shslsmss | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 0.0% | 0.3% ± 0.5 | +0.0 |
| simonton.mega.SniperFrog 1.0.fix2 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 85.6% ± 14.4 | 58.6% ± 10.2 | -27.0 ± 16.8 |
| simonton.micro.GFMicro 1.0 | hadur2.Hadur 3.12shslsmss | 8 | 95.0% ± 7.7 | 96.3% ± 4.3 | +1.2 ± 8.3 | 5.5% ± 5.6 | 41.3% ± 33.5 | +35.7 ± 33.5 |
| simonton.micro.GFMicro 1.0 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 97.5% ± 3.9 | -2.5 ± 3.9 | 78.3% ± 9.2 | 71.1% ± 9.4 | -7.3 ± 17.2 |
| simonton.mini.WeeksOnEnd 1.10.4 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 7.5% ± 9.4 | 13.7% ± 9.2 | +6.3 ± 13.9 |
| simonton.mini.WeeksOnEnd 1.10.4 | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 68.9% ± 17.3 | 62.6% ± 11.8 | -6.2 ± 21.8 |
| simonton.nano.WeekendObsession_S 1.7 | hadur2.Hadur 3.12shslsmss | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 9.7 | 2.5% ± 5.9 | 31.4% ± 28.4 | +28.8 ± 31.1 |
| simonton.nano.WeekendObsession_S 1.7 | hadur2.Hadur 3.12 | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 9.7 | 72.3% ± 14.4 | 57.0% ± 6.7 | -15.2 ± 18.1 |
| spinnercat.CopyKat 1.2.3 | hadur2.Hadur 3.12shslsmss | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 5.0% ± 12.3 | 49.6% ± 35.0 | +54.6 ± 29.2 |
| spinnercat.CopyKat 1.2.3 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 96.3% ± 4.3 | -3.7 ± 4.3 | 56.0% ± 16.4 | 80.4% ± 12.5 | +24.4 ± 25.2 |
| starpkg.StarViewerZ 1.26 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 39.2% | 68.7% | n/a |
| starpkg.StarViewerZ 1.26 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 66.8% ± 21.3 | 61.8% ± 19.4 | -5.0 ± 24.5 |
| stefw.Tigger 0.0.23 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 25.2% ± 79.4 | 25.0% ± 79.6 | -0.3 ± 3.9 |
| stefw.Tigger 0.0.23 | hadur2.Hadur 3.12 | 8 | 90.0% ± 12.6 | 98.8% ± 3.0 | +8.8 ± 12.2 | 32.9% ± 11.2 | 49.5% ± 6.7 | +16.6 ± 15.7 |
| stelo.SteloTestNano 1.0 | hadur2.Hadur 3.12shslsmss | 8 | 95.0% ± 11.8 | 98.8% ± 3.0 | +3.8 ± 12.6 | 0.0% ± 0.0 | 37.4% ± 68.9 | n/a |
| stelo.SteloTestNano 1.0 | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 72.9% ± 21.3 | 71.2% ± 10.9 | -1.7 ± 18.7 |
| suh.nano.RandomPM 1.02 | hadur2.Hadur 3.12shslsmss | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 0.6% ± 0.9 | 27.8% ± 25.5 | +23.5 ± 28.5 |
| suh.nano.RandomPM 1.02 | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 96.0% ± 6.8 | -1.5 ± 9.9 | 21.4% ± 15.8 | 44.0% ± 9.4 | +22.6 ± 21.5 |
| syl.Centipede 0.5 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% ± 0.0 | - | n/a |
| syl.Centipede 0.5 | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 79.0% ± 17.6 | 89.8% ± 8.6 | +10.8 ± 22.2 |
| theo.Tungsten 1.0a | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | - | 0.0% ± 0.0 | n/a |
| theo.Tungsten 1.0a | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 3.0 | 67.9% ± 10.6 | 63.5% ± 9.3 | -4.4 ± 17.6 |
| theo.avenge.Pequod 1.0 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 93.8% ± 7.7 | -6.2 ± 7.7 | 0.0% ± 0.0 | 29.1% ± 18.8 | +29.7 ± 66.0 |
| theo.avenge.Pequod 1.0 | hadur2.Hadur 3.12 | 8 | 95.0% ± 7.7 | 97.4% ± 4.1 | +2.4 ± 9.9 | 41.6% ± 14.2 | 46.4% ± 11.9 | +4.8 ± 17.0 |
| theo.real.Ahab 1.0 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 92.4% ± 4.0 | -7.6 ± 4.0 | 0.0% ± 0.0 | 48.5% ± 11.9 | +50.3 ± 17.1 |
| theo.real.Ahab 1.0 | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 31.5% ± 15.2 | 42.0% ± 14.6 | +10.5 ± 21.1 |
| tide.pear.Pear 0.62.1 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 75.0% ± 38.7 | 67.8% ± 37.5 | -7.2 ± 50.4 |
| tide.pear.Pear 0.62.1 | hadur2.Hadur 3.12 | 8 | 86.9% ± 9.2 | 100.0% ± 0.0 | +13.1 ± 9.2 | 39.1% ± 5.2 | 84.8% ± 2.5 | +45.7 ± 5.9 |
| trab.Crusader 0.1.7 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 76.9% ± 11.5 | -23.1 ± 11.5 | - | 38.6% ± 3.2 | n/a |
| trab.Crusader 0.1.7 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 83.5% ± 10.0 | -16.5 ± 10.0 | 55.4% ± 16.8 | 39.8% ± 7.3 | -15.6 ± 22.2 |
| trm.Wrekt 1.1.6.f | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 1.2% ± 2.6 | 7.3% ± 18.9 | +7.3 ± 18.9 |
| trm.Wrekt 1.1.6.f | hadur2.Hadur 3.12 | 8 | 95.0% ± 7.7 | 97.5% ± 5.9 | +2.5 ± 10.7 | 45.6% ± 10.9 | 55.8% ± 7.6 | +10.1 ± 11.7 |
| tw.Exterminator 1.0 | hadur2.Hadur 3.12shslsmss | 8 | 65.0% ± 17.3 | 53.3% ± 7.4 | -11.7 ± 21.4 | 26.7% ± 21.5 | 83.5% ± 3.7 | +56.8 ± 19.6 |
| tw.Exterminator 1.0 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 87.5% ± 14.0 | -12.5 ± 14.0 | 72.8% ± 21.8 | 62.0% ± 22.3 | -10.8 ± 33.1 |
| tzu.TheArtOfWar 1.2 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% ± 0.0 | - | n/a |
| tzu.TheArtOfWar 1.2 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 83.8% ± 10.1 | 82.3% ± 7.9 | -1.5 ± 12.1 |
| vic.Locke 0.7.5.5 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | - | - | n/a |
| vic.Locke 0.7.5.5 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 97.5% ± 3.9 | -2.5 ± 3.9 | 54.2% ± 31.2 | 43.7% ± 12.3 | -10.5 ± 32.9 |
| vuen.Fractal 0.55 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 43.2% ± 64.8 | 47.7% ± 45.7 | +28.0 ± 140.9 |
| vuen.Fractal 0.55 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 86.9% ± 12.2 | 85.8% ± 9.2 | -1.0 ± 16.9 |
| wcsv.Engineer.Engineer 0.5.4 | hadur2.Hadur 3.12shslsmss | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 0.5% ± 0.5 | 8.4% ± 5.8 | +7.8 ± 6.0 |
| wcsv.Engineer.Engineer 0.5.4 | hadur2.Hadur 3.12 | 8 | 90.0% ± 8.9 | 89.7% ± 9.2 | -0.3 ± 11.0 | 40.1% ± 5.2 | 57.6% ± 7.8 | +17.5 ± 10.8 |
| wiki.mini.BlackDestroyer 0.9.0 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 43.9% ± 31.9 | 28.6% ± 19.4 | -15.3 ± 47.1 |
| wiki.mini.BlackDestroyer 0.9.0 | hadur2.Hadur 3.12 | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 50.4% ± 24.8 | 53.1% ± 16.9 | +2.7 ± 35.7 |
| wiki.mini.Sedan 1.0 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.8% ± 1.8 | 2.2% ± 2.0 | +1.4 ± 2.3 |
| wiki.mini.Sedan 1.0 | hadur2.Hadur 3.12 | 8 | 95.0% ± 7.7 | 98.8% ± 3.0 | +3.7 ± 8.9 | 57.1% ± 23.5 | 67.8% ± 13.5 | +10.7 ± 23.2 |
| wilson.Chameleon 0.91 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 96.3% ± 6.2 | -3.7 ± 6.2 | 3.4% ± 5.3 | 17.8% ± 21.6 | +14.4 ± 20.5 |
| wilson.Chameleon 0.91 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 95.1% ± 10.2 | 83.6% ± 11.2 | -11.5 ± 14.8 |
| zen.Lindada 0.2 | hadur2.Hadur 3.12shslsmss | 8 | 100.0% ± 0.0 | 96.3% ± 6.2 | -3.7 ± 6.2 | - | 17.7% ± 72.8 | n/a |
| zen.Lindada 0.2 | hadur2.Hadur 3.12 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 69.3% ± 13.8 | 70.2% ± 19.3 | +0.9 ± 21.1 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| KiraNL.ChupaLite 0.4 | +2.5 ± 5.9 | +0.0 ± 0.0 | -66.0 | n/a |
| Krabb.krabby.Krabby 1.18b | +0.0 ± 0.0 | +0.0 ± 4.5 | -58.5 ± 28.0 | -57.7 ± 31.2 |
| ad.Quest 0.10 | -2.5 ± 10.7 | -1.2 ± 3.0 | -23.8 ± 13.4 | -55.3 ± 16.7 |
| ags.micro.Carpet 1.1 | +5.0 ± 7.7 | +0.1 ± 4.5 | -53.1 ± 21.8 | +4.7 ± 15.1 |
| ahf.r2d2.R2d2 0.86 | +0.0 ± 0.0 | -1.2 ± 3.0 | -5.9 ± 144.5 | -52.5 ± 27.3 |
| amk.ChumbaWumba 0.3 | +7.5 ± 8.7 | +0.0 ± 10.0 | -46.4 ± 74.1 | -14.4 ± 63.9 |
| apv.NanoLauLectrikTheCannibal 1.1 | -10.0 ± 8.9 | +2.5 ± 3.9 | -76.7 ± 10.6 | -44.0 ± 29.6 |
| apv.test.Virus 0.6.1 | +2.5 ± 5.9 | +1.2 ± 3.0 | -49.8 ± 11.1 | -57.6 ± 6.9 |
| arthord.KostyaTszyu Beta2 | +5.0 ± 7.7 | +5.0 ± 4.5 | -48.8 ± 330.4 | n/a |
| ary.mini.Nimi 1.0 | +2.5 ± 5.9 | -2.5 ± 3.9 | -48.4 ± 21.1 | -39.8 ± 58.3 |
| brainfade.Fallen 0.63 | -5.0 ± 7.7 | -1.2 ± 5.4 | -9.1 ± 74.6 | -14.1 ± 34.4 |
| bvh.frg.Friga 0.112dev | +2.5 ± 5.9 | +0.0 ± 0.0 | -63.3 | n/a |
| bvh.mini.Freya 0.55 | +0.0 ± 0.0 | +0.0 ± 0.0 | n/a | -62.4 |
| casey.Flee 1.0 | +5.0 ± 7.7 | +2.5 ± 7.4 | -65.6 ± 33.0 | -9.2 ± 30.9 |
| cf.proto.Shiva 2.2 | -2.5 ± 14.0 | -9.0 ± 9.7 | -34.9 ± 17.4 | -14.1 ± 14.1 |
| davidalves.net.DuelistMicroMkII 1.1 | +10.0 ± 12.6 | -2.5 ± 5.9 | -48.8 ± 17.3 | -0.2 ± 22.5 |
| davidalves.net.DuelistMini 1.1 | +0.0 ± 0.0 | +0.0 ± 0.0 | n/a | -56.7 |
| dft.Cyanide 1.90 | +0.0 ± 0.0 | +1.2 ± 3.0 | -53.7 ± 20.0 | -60.9 ± 15.4 |
| dft.Virgin 1.25 | +2.5 ± 5.9 | -2.5 ± 5.9 | -77.1 ± 26.9 | -46.0 ± 79.1 |
| ds.OoV4 0.3b | +0.0 ± 0.0 | +0.0 ± 0.0 | -19.5 ± 29.1 | -48.3 ± 16.2 |
| ej.ChocolateBar 1.1 | +0.0 ± 0.0 | +2.5 ± 3.9 | -71.0 ± 368.7 | n/a |
| florent.small.LittleAngel 1.8 | +7.5 ± 12.4 | +1.2 ± 3.0 | -41.1 ± 14.9 | -31.1 ± 17.1 |
| gh.GrubbmGrb 1.2.4 | -15.0 ± 14.8 | +10.7 ± 17.5 | -70.6 ± 12.9 | -56.8 ± 41.6 |
| ins.MobyNano 0.8 | +2.5 ± 5.9 | +1.2 ± 5.4 | -42.1 ± 10.5 | +3.6 ± 11.2 |
| jam.micro.RaikoMicro 1.44 | +0.0 ± 0.0 | +2.5 ± 5.9 | +10.4 ± 119.5 | +45.0 |
| jam.mini.Raiko 0.43 | +2.5 ± 5.9 | +1.2 ± 3.0 | -19.8 | -50.1 ± 121.9 |
| jcs.Decepticon 2.5.3 | +5.0 ± 7.7 | +3.7 ± 6.2 | -42.0 ± 10.7 | -55.1 ± 10.8 |
| jekl.DarkHallow .90.9 | -10.0 ± 29.6 | -2.6 ± 4.1 | -37.2 ± 12.1 | -59.9 ± 19.2 |
| jekl.Jekyl .70 | +0.0 ± 0.0 | +0.0 ± 0.0 | -100.0 | -59.8 ± 18.0 |
| jekl.mini.BlackPearl .91 | -15.0 ± 17.3 | -2.5 ± 5.9 | -61.9 ± 26.2 | -67.9 ± 61.5 |
| kawigi.mini.Coriantumr 1.1 | -2.5 ± 5.9 | +0.0 ± 0.0 | -23.3 ± 39.8 | -4.2 ± 34.4 |
| kawigi.mini.Fhqwhgads 1.1 | +2.5 ± 5.9 | +3.7 ± 7.7 | -43.5 ± 24.0 | -50.3 ± 12.4 |
| kc.micro.Thorn 1.252 | +0.0 ± 8.9 | +1.2 ± 3.0 | -51.2 ± 11.7 | +38.1 ± 324.9 |
| kcn.unnamed.Unnamed 1.21 | +2.5 ± 5.9 | +2.5 ± 3.9 | -71.4 ± 58.5 | n/a |
| kid.Gladiator .7.2 | +0.0 ± 0.0 | +2.6 ± 4.1 | n/a | -55.5 ± 121.1 |
| kid.Toa .0.5 | -2.5 ± 14.0 | -11.4 ± 8.3 | -61.7 ± 17.0 | -10.5 ± 6.1 |
| kms.Golden 0.10 | +7.5 ± 15.3 | +2.5 ± 7.4 | -35.5 ± 295.9 | -4.5 ± 51.0 |
| lrem.magic.TormentedAngel Antiquitie | +0.0 ± 0.0 | +0.0 ± 7.7 | -36.9 ± 54.7 | -24.5 ± 62.2 |
| lucasslf.Dodger 1.0 | +2.5 ± 14.0 | +1.2 ± 8.3 | -31.1 ± 21.1 | -30.9 ± 15.4 |
| lucasslf.HariSeldon 0.2.1 | +0.0 ± 0.0 | -3.7 ± 6.2 | -70.4 ± 20.8 | -58.7 ± 15.9 |
| lucasslf.Wiggins 0.6 | +0.0 ± 8.9 | +0.0 ± 0.0 | -38.8 ± 21.3 | -54.2 ± 6.0 |
| metal.small.MCool 1.21 | +0.0 ± 0.0 | +0.0 ± 0.0 | n/a | n/a |
| metal.small.dna2.MCoolDNA 1.5 | +0.0 ± 0.0 | +1.2 ± 3.0 | +24.4 ± 52.9 | +12.8 ± 41.2 |
| mk.Alpha 0.2.1 | +0.0 ± 0.0 | +0.0 ± 0.0 | n/a | n/a |
| mladjo.Grrrrr 0.9 | -30.0 ± 12.6 | -9.3 ± 10.7 | -47.8 ± 18.4 | -11.4 ± 23.9 |
| mnt.AHEB 0.6a | -2.5 ± 5.9 | -11.8 ± 17.2 | -58.3 ± 26.0 | -17.5 ± 26.7 |
| myl.micro.NekoNinja 1.30 | +0.0 ± 17.9 | -2.5 ± 5.9 | +10.0 ± 80.4 | -27.1 ± 32.2 |
| nat.Hikari dev0001 | -7.5 ± 8.7 | +0.0 ± 0.0 | -30.1 ± 12.3 | +5.4 ± 25.1 |
| nat.nano.OcnirpPM 1.0 | +2.5 ± 10.7 | +1.2 ± 3.0 | -46.6 ± 19.6 | -14.7 ± 27.5 |
| nat.nano.Ocnirp 1.73 | +2.5 ± 10.7 | +6.4 ± 6.3 | -48.1 ± 28.8 | +0.2 ± 30.5 |
| nkn.mini.Jskr0 0.1 | -2.5 ± 5.9 | -1.2 ± 3.0 | -40.9 ± 18.6 | -30.5 ± 130.2 |
| pe.mini.SandboxMini 1.2 | +5.0 ± 7.7 | +2.5 ± 3.9 | +37.6 | +47.5 |
| pez.clean.Swiffer 0.2.9 | +2.5 ± 5.9 | -2.5 ± 3.9 | -13.2 ± 41.2 | -14.9 ± 39.6 |
| pez.gloom.GloomyDark 0.9.2 | +5.0 ± 7.7 | -1.2 ± 3.0 | +0.1 ± 163.0 | -10.1 ± 46.3 |
| pez.mako.Mako 1.5 | -2.5 ± 5.9 | +0.0 ± 6.3 | -60.4 ± 32.2 | -54.4 ± 16.4 |
| ph.micro.Pikeman 0.4.5 | +0.0 ± 0.0 | +0.0 ± 0.0 | -59.0 | -72.1 ± 354.2 |
| ph.mini.Archer 0.6.6 | -2.5 ± 5.9 | +2.5 ± 3.9 | -6.2 ± 34.0 | -11.5 ± 15.7 |
| ph.musketeer.Musketeer 0.6 | +10.0 ± 8.9 | +1.2 ± 5.4 | +8.8 ± 21.0 | -18.0 ± 18.7 |
| pkbots.BoyTDSurfer 1.0 | +2.5 ± 5.9 | +6.2 ± 7.7 | -44.5 ± 249.2 | -24.6 |
| rdt.AgentSmith.AgentSmith 0.5 | +5.0 ± 7.7 | +0.0 ± 0.0 | -33.5 ± 9.7 | n/a |
| reaper.Reaper 1.1 | +2.5 ± 5.9 | +1.2 ± 3.0 | -78.2 ± 81.7 | -45.7 ± 77.8 |
| robar.micro.Kirbyi 1.0 | +5.0 ± 7.7 | +2.5 ± 3.9 | -31.6 ± 31.0 | -33.7 ± 20.8 |
| rz.Aleph 0.34 | +0.0 ± 0.0 | +2.5 ± 3.9 | -88.3 ± 148.7 | -38.5 ± 10.3 |
| simonton.beta.LifelongObsession 0.5.1 | +2.5 ± 5.9 | +0.0 ± 0.0 | -44.0 ± 19.6 | -35.6 ± 11.9 |
| simonton.mega.SniperFrog 1.0.fix2 | -2.5 ± 5.9 | +0.0 ± 0.0 | -100.0 | -57.9 ± 12.2 |
| simonton.micro.GFMicro 1.0 | -5.0 ± 7.7 | -1.2 ± 7.0 | -72.8 ± 9.0 | -29.8 ± 36.3 |
| simonton.mini.WeeksOnEnd 1.10.4 | +2.5 ± 5.9 | +0.0 ± 0.0 | -61.4 ± 20.1 | -48.9 ± 16.7 |
| simonton.nano.WeekendObsession_S 1.7 | +0.0 ± 8.9 | +0.0 ± 6.3 | -69.7 ± 17.6 | -25.7 ± 25.7 |
| spinnercat.CopyKat 1.2.3 | -2.5 ± 5.9 | +1.2 ± 5.4 | -55.2 ± 28.3 | -28.9 ± 46.8 |
| starpkg.StarViewerZ 1.26 | +0.0 ± 0.0 | -1.2 ± 3.0 | +20.2 | -14.2 |
| stefw.Tigger 0.0.23 | +10.0 ± 12.6 | +1.2 ± 3.0 | -3.4 ± 74.7 | -22.3 ± 65.0 |
| stelo.SteloTestNano 1.0 | -2.5 ± 14.0 | +0.0 ± 4.5 | -76.8 ± 294.9 | -35.0 ± 69.7 |
| suh.nano.RandomPM 1.02 | +0.0 ± 0.0 | +2.8 ± 6.6 | -23.9 ± 17.2 | -16.2 ± 29.9 |
| syl.Centipede 0.5 | +2.5 ± 5.9 | +0.0 ± 0.0 | -88.2 ± 140.1 | n/a |
| theo.Tungsten 1.0a | +2.5 ± 5.9 | +1.2 ± 3.0 | n/a | -65.4 ± 89.6 |
| theo.avenge.Pequod 1.0 | +5.0 ± 7.7 | -3.6 ± 10.1 | -27.9 ± 16.5 | -17.3 ± 18.0 |
| theo.real.Ahab 1.0 | +2.5 ± 5.9 | -7.6 ± 4.0 | -24.8 ± 9.5 | +6.5 ± 22.6 |
| tide.pear.Pear 0.62.1 | +13.1 ± 9.2 | +0.0 ± 0.0 | +35.9 ± 41.4 | -17.0 ± 37.6 |
| trab.Crusader 0.1.7 | +0.0 ± 0.0 | -6.5 ± 6.2 | n/a | -1.2 ± 7.4 |
| trm.Wrekt 1.1.6.f | +5.0 ± 7.7 | +2.5 ± 5.9 | -44.5 ± 9.3 | -48.6 ± 25.6 |
| tw.Exterminator 1.0 | -35.0 ± 17.3 | -34.2 ± 12.8 | -46.1 ± 24.4 | +21.4 ± 23.5 |
| tzu.TheArtOfWar 1.2 | +0.0 ± 0.0 | +1.2 ± 3.0 | -86.2 ± 4.7 | n/a |
| vic.Locke 0.7.5.5 | +0.0 ± 0.0 | +2.5 ± 3.9 | n/a | n/a |
| vuen.Fractal 0.55 | +0.0 ± 0.0 | +1.2 ± 3.0 | -42.7 ± 60.1 | -36.1 ± 41.2 |
| wcsv.Engineer.Engineer 0.5.4 | +7.5 ± 8.7 | +10.3 ± 9.2 | -39.6 ± 5.0 | -49.2 ± 8.7 |
| wiki.mini.BlackDestroyer 0.9.0 | +2.5 ± 5.9 | +2.5 ± 3.9 | -6.5 ± 39.1 | -24.5 ± 15.4 |
| wiki.mini.Sedan 1.0 | +5.0 ± 7.7 | +1.2 ± 3.0 | -56.3 ± 24.1 | -65.6 ± 14.2 |
| wilson.Chameleon 0.91 | +0.0 ± 0.0 | -3.7 ± 6.2 | -91.7 ± 14.3 | -65.8 ± 23.1 |
| zen.Lindada 0.2 | +0.0 ± 0.0 | -3.7 ± 6.2 | n/a | -61.3 ± 127.0 |
