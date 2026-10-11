# Bench: hadur2.Hadur 3.9sa (cold)

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 11610 over 1040 battles (11.2 per battle, most in one battle 55). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | shield-confirm | 91.8% ± 1.9 | 98.2% ± 1.1 | 51.6% ± 3.5 | 550 / 560 | 7.1% ± 0.8 | 1.2% ± 0.4 | 186 | 0 | 0.57 / 187.0 |
| simonton.beta.LifelongObsession 0.5.1 | shield-confirm | 92.7% ± 2.2 | 98.6% ± 1.6 | 61.7% ± 4.2 | 552 / 560 | 10.2% ± 1.6 | 2.2% ± 0.2 | 178 | 0 | 0.58 / 103.1 |
| rdt.AgentSmith.AgentSmith 0.5 | shield-confirm | 90.3% ± 2.1 | 97.3% ± 1.5 | 53.5% ± 2.9 | 545 / 560 | 6.9% ± 0.8 | 1.1% ± 0.2 | 157 | 0 | 0.92 / 168.7 |
| bvh.mini.Freya 0.55 | shield-confirm | 97.7% ± 0.9 | 99.8% ± 0.4 | 85.3% ± 4.3 | 559 / 560 | 8.7% ± 0.7 | 0.4% ± 0.1 | 171 | 0 | 0.49 / 16.1 |
| tide.pear.Pear 0.62.1 | shield-confirm | 84.9% ± 0.9 | 97.0% ± 1.5 | 72.1% ± 1.3 | 543 / 560 | 40.4% ± 2.5 | 7.5% ± 0.9 | 190 | 0 | 0.74 / 172.9 |
| simonton.mini.WeeksOnEnd 1.10.4 | shield-confirm | 88.6% ± 2.0 | 97.3% ± 1.6 | 52.7% ± 4.0 | 545 / 560 | 11.5% ± 1.0 | 2.5% ± 0.2 | 163 | 0 | 0.77 / 69.1 |
| Krabb.krabby.Krabby 1.18b | shield-confirm | 94.2% ± 1.5 | 99.5% ± 0.6 | 67.0% ± 5.2 | 557 / 560 | 14.7% ± 4.2 | 0.9% ± 0.2 | 183 | 0 | 0.43 / 17.7 |
| jekl.mini.BlackPearl .91 | shield-confirm | 93.6% ± 1.9 | 98.6% ± 1.0 | 66.2% ± 5.5 | 552 / 560 | 8.3% ± 0.9 | 0.8% ± 0.2 | 167 | 0 | 0.48 / 19.8 |
| kc.micro.Thorn 1.252 | shield-confirm | 87.5% ± 3.3 | 95.5% ± 1.9 | 54.6% ± 4.9 | 535 / 560 | 7.4% ± 0.8 | 1.5% ± 0.4 | 179 | 0 | 0.61 / 21.7 |
| lucasslf.HariSeldon 0.2.1 | shield-confirm | 95.7% ± 1.3 | 99.6% ± 0.5 | 73.5% ± 5.8 | 558 / 560 | 13.0% ± 1.6 | 1.6% ± 0.1 | 154 | 0 | 1.14 / 22.7 |
| wiki.mini.BlackDestroyer 0.9.0 | shield-confirm | 89.3% ± 2.1 | 97.1% ± 1.5 | 54.4% ± 3.2 | 544 / 560 | 10.4% ± 1.5 | 3.0% ± 0.1 | 164 | 0 | 0.51 / 18.4 |
| stefw.Tigger 0.0.23 | shield-confirm | 83.9% ± 2.2 | 95.5% ± 1.4 | 42.5% ± 2.9 | 535 / 560 | 7.1% ± 1.2 | 2.0% ± 0.4 | 167 | 0 | 0.78 / 18.7 |
| AIR.iRobot 1.0 | shield-confirm | 96.4% ± 1.1 | 99.6% ± 0.5 | 71.3% ± 5.9 | 558 / 560 | 8.4% ± 1.5 | 0.5% ± 0.1 | 171 | 0 | 0.42 / 226.9 |
| wilson.Chameleon 0.91 | shield-confirm | 96.6% ± 1.3 | 99.1% ± 0.9 | 82.4% ± 4.9 | 555 / 560 | 9.5% ± 0.9 | 0.5% ± 0.2 | 178 | 0 | 0.65 / 194.1 |
| simonton.micro.GFMicro 1.0 | shield-confirm | 93.8% ± 0.9 | 99.6% ± 0.5 | 75.5% ± 2.7 | 558 / 560 | 27.2% ± 5.6 | 2.8% ± 0.3 | 174 | 0 | 0.51 / 21.4 |
| bvh.frg.Friga 0.112dev | shield-confirm | 97.4% ± 1.0 | 99.8% ± 0.4 | 78.6% ± 6.2 | 559 / 560 | 5.7% ± 0.8 | 0.4% ± 0.1 | 180 | 0 | 0.48 / 16.7 |
| pkbots.BoyTDSurfer 1.0 | shield-confirm | 87.2% ± 2.9 | 97.1% ± 1.8 | 41.2% ± 4.3 | 544 / 560 | 13.0% ± 1.3 | 2.1% ± 0.3 | 170 | 0 | 0.62 / 28.1 |
| kawigi.mini.Coriantumr 1.1 | shield-confirm | 96.7% ± 1.1 | 99.5% ± 0.6 | 86.7% ± 3.2 | 557 / 560 | 9.5% ± 1.0 | 0.5% ± 0.1 | 182 | 0 | 0.46 / 17.8 |
| ahf.r2d2.R2d2 0.86 | shield-confirm | 91.4% ± 1.5 | 99.1% ± 0.9 | 63.7% ± 2.9 | 555 / 560 | 12.5% ± 0.8 | 1.5% ± 0.3 | 186 | 0 | 0.59 / 110.3 |
| florent.small.LittleAngel 1.8 | shield-confirm | 80.4% ± 3.0 | 94.5% ± 2.4 | 41.8% ± 3.2 | 529 / 560 | 9.4% ± 0.7 | 2.8% ± 0.5 | 170 | 0 | 0.83 / 53.8 |
| theo.Tungsten 1.0a | shield-confirm | 87.1% ± 3.1 | 96.8% ± 1.8 | 61.1% ± 3.2 | 542 / 560 | 15.9% ± 2.0 | 2.2% ± 0.6 | 171 | 0 | 0.96 / 17.8 |
| mnt.AHEB 0.6a | shield-confirm | 86.6% ± 2.5 | 94.6% ± 1.7 | 48.2% ± 2.9 | 530 / 560 | 6.7% ± 0.6 | 1.8% ± 0.3 | 176 | 0 | 0.51 / 356.3 |
| DM.mega.Bezier 1.618fprrr | shield-confirm | 95.4% ± 1.4 | 99.3% ± 0.7 | 64.2% ± 12.0 | 556 / 560 | 14.1% ± 11.5 | 0.6% ± 0.2 | 167 | 0 | 3.52 / 89.1 |
| ph.mini.Archer 0.6.6 | shield-confirm | 84.6% ± 3.6 | 94.3% ± 2.4 | 31.1% ± 4.8 | 528 / 560 | 6.3% ± 1.1 | 3.5% ± 0.2 | 150 | 0 | 0.50 / 20.8 |
| lucasslf.Wiggins 0.6 | shield-confirm | 92.2% ± 3.7 | 99.3% ± 1.5 | 60.9% ± 6.4 | 556 / 560 | 9.2% ± 1.6 | 2.4% ± 1.0 | 158 | 0 | 1.05 / 20.9 |
| davidalves.net.DuelistMini 1.1 | shield-confirm | 89.9% ± 4.4 | 98.2% ± 1.6 | 69.3% ± 6.1 | 550 / 560 | 13.7% ± 4.1 | 2.3% ± 1.4 | 198 | 0 | 0.81 / 74.1 |
| pez.mako.Mako 1.5 | shield-confirm | 90.4% ± 3.3 | 98.4% ± 1.1 | 62.5% ± 4.4 | 551 / 560 | 10.2% ± 1.3 | 1.5% ± 0.6 | 192 | 0 | 0.82 / 19.1 |
| wcsv.Engineer.Engineer 0.5.4 | shield-confirm | 78.2% ± 2.9 | 91.8% ± 2.7 | 52.9% ± 1.3 | 514 / 560 | 22.3% ± 2.0 | 4.6% ± 0.4 | 179 | 0 | 0.76 / 19.9 |
| rz.Aleph 0.34 | shield-confirm | 85.3% ± 3.8 | 95.9% ± 1.8 | 45.1% ± 3.4 | 537 / 560 | 7.0% ± 0.9 | 2.0% ± 0.9 | 168 | 0 | 0.94 / 137.0 |
| ad.Quest 0.10 | shield-confirm | 87.1% ± 3.0 | 96.1% ± 1.8 | 57.5% ± 3.9 | 538 / 560 | 11.2% ± 1.1 | 2.3% ± 0.4 | 191 | 0 | 0.85 / 138.8 |
| nat.Hikari dev0001 | shield-confirm | 87.6% ± 1.7 | 98.8% ± 1.1 | 47.4% ± 3.2 | 553 / 560 | 15.1% ± 1.1 | 2.4% ± 0.3 | 169 | 0 | 0.59 / 129.7 |
| davidalves.net.DuelistMicroMkII 1.1 | shield-confirm | 84.5% ± 2.2 | 95.2% ± 1.7 | 60.6% ± 2.0 | 533 / 560 | 15.6% ± 1.3 | 2.5% ± 0.5 | 190 | 0 | 0.78 / 33.8 |
| jekl.DarkHallow .90.9 | shield-confirm | 87.1% ± 5.0 | 95.2% ± 2.8 | 55.2% ± 6.0 | 533 / 560 | 8.0% ± 0.9 | 1.8% ± 0.9 | 160 | 0 | 1.02 / 170.6 |
| jcs.Decepticon 2.5.3 | shield-confirm | 80.4% ± 2.2 | 95.5% ± 1.8 | 47.9% ± 2.9 | 535 / 560 | 12.5% ± 1.8 | 4.7% ± 0.2 | 163 | 0 | 1.32 / 75.7 |
| jekl.Jekyl .70 | shield-confirm | 91.0% ± 2.3 | 97.5% ± 1.6 | 66.7% ± 4.1 | 546 / 560 | 8.1% ± 1.0 | 1.7% ± 0.5 | 176 | 0 | 0.52 / 78.0 |
| stelo.Randomness 1.1 | shield-confirm | 85.2% ± 2.6 | 94.6% ± 2.1 | 60.4% ± 3.7 | 530 / 560 | 15.8% ± 1.3 | 2.8% ± 0.3 | 202 | 0 | 0.60 / 84.4 |
| gh.GrubbmGrb 1.2.4 | shield-confirm | 87.6% ± 4.4 | 94.8% ± 2.8 | 67.0% ± 8.0 | 531 / 560 | 22.1% ± 7.1 | 1.9% ± 0.6 | 176 | 0 | 0.71 / 110.2 |
| rcb.Vanessa03 0 | shield-confirm | 86.7% ± 3.4 | 94.6% ± 2.2 | 60.0% ± 4.9 | 530 / 560 | 13.3% ± 1.5 | 1.8% ± 0.4 | 181 | 0 | 0.62 / 256.8 |
| arthord.KostyaTszyu Beta2 | shield-confirm | 88.0% ± 2.4 | 96.4% ± 1.3 | 50.2% ± 4.3 | 540 / 560 | 9.4% ± 0.8 | 1.3% ± 0.3 | 168 | 0 | 0.53 / 99.4 |
| robar.micro.Kirbyi 1.0 | shield-confirm | 85.3% ± 2.2 | 95.7% ± 1.8 | 59.3% ± 2.8 | 536 / 560 | 30.9% ± 1.9 | 4.6% ± 0.4 | 179 | 0 | 0.90 / 48.0 |
| metal.small.dna2.MCoolDNA 1.5 | shield-confirm | 88.2% ± 1.9 | 96.6% ± 1.3 | 55.4% ± 3.8 | 541 / 560 | 9.0% ± 0.8 | 1.4% ± 0.2 | 187 | 0 | 0.51 / 56.4 |
| tw.Exterminator 1.0 | shield-confirm | 89.5% ± 3.4 | 93.0% ± 3.0 | 73.3% ± 4.4 | 521 / 560 | 5.2% ± 1.3 | 2.0% ± 0.4 | 174 | 0 | 0.94 / 34.4 |
| pe.mini.SandboxMini 1.2 | shield-confirm | 87.0% ± 3.3 | 95.9% ± 2.4 | 58.4% ± 2.9 | 537 / 560 | 12.4% ± 1.4 | 1.8% ± 0.5 | 175 | 0 | 0.68 / 18.3 |
| trm.Wrekt 1.1.6.f | shield-confirm | 87.3% ± 5.3 | 95.5% ± 3.0 | 56.6% ± 5.7 | 535 / 560 | 7.6% ± 1.4 | 2.1% ± 1.2 | 178 | 0 | 1.51 / 86.7 |
| ags.micro.Carpet 1.1 | shield-confirm | 87.2% ± 2.4 | 96.6% ± 1.8 | 48.7% ± 4.2 | 541 / 560 | 9.3% ± 0.7 | 2.9% ± 0.2 | 153 | 0 | 1.33 / 115.4 |
| pez.clean.Swiffer 0.2.9 | shield-confirm | 88.8% ± 2.5 | 96.3% ± 1.8 | 64.2% ± 4.5 | 539 / 560 | 11.6% ± 1.9 | 2.8% ± 2.3 | 197 | 0 | 0.50 / 124.1 |
| zen.Lindada 0.2 | shield-confirm | 94.9% ± 1.3 | 99.3% ± 0.9 | 71.5% ± 4.3 | 556 / 560 | 9.1% ± 0.9 | 0.7% ± 0.1 | 198 | 0 | 0.50 / 95.0 |
| vuen.Fractal 0.55 | shield-confirm | 96.0% ± 1.2 | 99.1% ± 0.7 | 87.9% ± 2.3 | 555 / 560 | 17.3% ± 1.2 | 0.7% ± 0.2 | 178 | 0 | 0.56 / 260.2 |
| nat.nano.Ocnirp 1.73 | shield-confirm | 82.3% ± 2.9 | 94.8% ± 2.0 | 44.5% ± 3.0 | 531 / 560 | 14.7% ± 1.4 | 3.0% ± 0.5 | 195 | 0 | 0.78 / 168.0 |
| syl.Centipede 0.5 | shield-confirm | 96.9% ± 1.1 | 99.5% ± 0.6 | 81.8% ± 3.9 | 557 / 560 | 10.7% ± 1.1 | 0.7% ± 0.1 | 183 | 0 | 0.56 / 126.7 |
| myl.micro.NekoNinja 1.30 | shield-confirm | 94.1% ± 2.5 | 99.1% ± 0.9 | 74.9% ± 5.3 | 555 / 560 | 9.0% ± 1.0 | 1.0% ± 0.5 | 193 | 0 | 0.77 / 37.3 |
| stelo.SteloTestNano 1.0 | shield-confirm | 92.9% ± 1.6 | 98.2% ± 1.1 | 73.6% ± 3.0 | 550 / 560 | 22.7% ± 1.8 | 1.4% ± 0.3 | 193 | 0 | 0.48 / 58.4 |
| casey.Flee 1.0 | shield-confirm | 88.9% ± 1.4 | 98.9% ± 0.9 | 56.0% ± 2.4 | 554 / 560 | 15.3% ± 1.6 | 2.3% ± 0.3 | 190 | 0 | 0.59 / 145.0 |
| amk.ChumbaWumba 0.3 | shield-confirm | 89.7% ± 2.0 | 97.5% ± 1.2 | 59.4% ± 4.3 | 546 / 560 | 10.8% ± 1.2 | 1.5% ± 0.4 | 171 | 0 | 0.52 / 110.7 |
| metal.small.MCool 1.21 | shield-confirm | 95.7% ± 1.0 | 99.5% ± 0.6 | 70.3% ± 2.9 | 557 / 560 | 10.6% ± 1.2 | 0.7% ± 0.1 | 190 | 0 | 0.56 / 178.5 |
| tzu.TheArtOfWar 1.2 | shield-confirm | 96.1% ± 2.7 | 99.3% ± 0.9 | 85.5% ± 4.3 | 556 / 560 | 18.6% ± 1.3 | 1.4% ± 0.9 | 188 | 0 | 0.67 / 89.1 |
| lrem.magic.TormentedAngel Antiquitie | shield-confirm | 84.9% ± 2.1 | 96.1% ± 1.5 | 41.9% ± 5.2 | 538 / 560 | 9.8% ± 1.1 | 2.0% ± 0.4 | 180 | 0 | 0.73 / 59.2 |
| spinnercat.CopyKat 1.2.3 | shield-confirm | 90.6% ± 2.2 | 95.9% ± 1.6 | 73.6% ± 4.7 | 537 / 560 | 36.2% ± 3.5 | 1.9% ± 0.5 | 172 | 0 | 0.54 / 89.1 |
| apv.NanoLauLectrikTheCannibal 1.1 | shield-confirm | 88.3% ± 2.1 | 96.8% ± 1.5 | 78.3% ± 2.4 | 542 / 560 | 93.8% ± 8.2 | 5.4% ± 0.6 | 185 | 0 | 0.81 / 46.0 |
| simonton.nano.WeekendObsession_S 1.7 | shield-confirm | 86.6% ± 2.8 | 95.9% ± 1.9 | 57.1% ± 3.1 | 537 / 560 | 19.6% ± 2.0 | 2.8% ± 0.5 | 193 | 0 | 0.87 / 99.9 |
| nat.nano.OcnirpPM 1.0 | shield-confirm | 81.6% ± 3.5 | 93.9% ± 2.4 | 45.6% ± 4.0 | 526 / 560 | 16.8% ± 2.3 | 3.1% ± 0.7 | 232 | 0 | 0.81 / 169.5 |
| ds.OoV4 0.3b | shield-confirm | 93.2% ± 1.2 | 99.1% ± 0.7 | 58.7% ± 4.2 | 555 / 560 | 7.1% ± 0.9 | 1.1% ± 0.2 | 186 | 0 | 0.56 / 211.0 |
| suh.nano.RandomPM 1.02 | shield-confirm | 83.7% ± 2.2 | 95.9% ± 1.8 | 35.8% ± 5.1 | 537 / 560 | 10.2% ± 1.7 | 2.5% ± 0.4 | 171 | 0 | 0.80 / 71.2 |
| ins.MobyNano 0.8 | shield-confirm | 88.2% ± 1.6 | 98.4% ± 1.0 | 56.8% ± 2.9 | 551 / 560 | 18.1% ± 1.7 | 3.1% ± 0.3 | 176 | 0 | 0.62 / 28.4 |
| starpkg.StarViewerZ 1.26 | shield-confirm | 95.2% ± 1.0 | 99.8% ± 0.4 | 67.2% ± 3.8 | 559 / 560 | 6.3% ± 1.1 | 0.9% ± 0.3 | 188 | 0 | 0.53 / 182.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 16 | 206 | 15.2% | 78.6% | 0.4% | 5.9% | 1012 |
| simonton.beta.LifelongObsession 0.5.1 | 16 | 188 | 13.3% | 81.7% | 0.0% | 5.1% | 1424 |
| rdt.AgentSmith.AgentSmith 0.5 | 16 | 251 | 18.7% | 73.7% | 0.0% | 7.6% | 966 |
| bvh.mini.Freya 0.55 | 16 | 57 | 5.5% | 92.2% | 0.0% | 2.3% | 794 |
| tide.pear.Pear 0.62.1 | 16 | 724 | 7.3% | 89.9% | 0.0% | 2.8% | 611 |
| simonton.mini.WeeksOnEnd 1.10.4 | 16 | 305 | 15.4% | 78.6% | 0.0% | 6.0% | 1411 |
| Krabb.krabby.Krabby 1.18b | 16 | 153 | 6.1% | 91.4% | 0.0% | 2.5% | 819 |
| jekl.mini.BlackPearl .91 | 16 | 166 | 15.1% | 78.8% | 0.0% | 6.1% | 896 |
| kc.micro.Thorn 1.252 | 16 | 342 | 22.8% | 69.2% | 0.0% | 8.0% | 970 |
| lucasslf.HariSeldon 0.2.1 | 16 | 109 | 5.7% | 91.8% | 0.0% | 2.5% | 1369 |
| wiki.mini.BlackDestroyer 0.9.0 | 16 | 283 | 17.7% | 75.7% | 0.0% | 6.6% | 1016 |
| stefw.Tigger 0.0.23 | 16 | 455 | 17.2% | 76.2% | 0.0% | 6.6% | 923 |
| AIR.iRobot 1.0 | 16 | 89 | 7.0% | 90.0% | 0.0% | 2.9% | 906 |
| wilson.Chameleon 0.91 | 16 | 86 | 18.1% | 76.2% | 0.0% | 5.7% | 962 |
| simonton.micro.GFMicro 1.0 | 16 | 185 | 3.4% | 95.4% | 0.0% | 1.2% | 1298 |
| bvh.frg.Friga 0.112dev | 16 | 62 | 5.0% | 92.8% | 0.0% | 2.2% | 864 |
| pkbots.BoyTDSurfer 1.0 | 16 | 340 | 14.7% | 79.5% | 0.0% | 5.8% | 1198 |
| kawigi.mini.Coriantumr 1.1 | 16 | 91 | 10.3% | 85.4% | 0.1% | 4.3% | 843 |
| ahf.r2d2.R2d2 0.86 | 16 | 241 | 6.5% | 91.0% | 0.0% | 2.4% | 889 |
| florent.small.LittleAngel 1.8 | 16 | 609 | 15.9% | 77.9% | 0.0% | 6.2% | 1015 |
| theo.Tungsten 1.0a | 16 | 409 | 13.8% | 81.2% | 0.0% | 5.0% | 908 |
| mnt.AHEB 0.6a | 16 | 353 | 26.6% | 63.0% | 0.0% | 10.4% | 947 |
| DM.mega.Bezier 1.618fprrr | 16 | 117 | 10.6% | 85.6% | 0.0% | 3.7% | 1461 |
| ph.mini.Archer 0.6.6 | 16 | 393 | 25.5% | 64.3% | 0.0% | 10.2% | 1104 |
| lucasslf.Wiggins 0.6 | 16 | 266 | 4.7% | 93.2% | 0.0% | 2.1% | 1335 |
| davidalves.net.DuelistMini 1.1 | 16 | 370 | 8.5% | 88.1% | 0.0% | 3.4% | 775 |
| pez.mako.Mako 1.5 | 16 | 289 | 9.7% | 86.1% | 0.0% | 4.2% | 818 |
| wcsv.Engineer.Engineer 0.5.4 | 16 | 763 | 18.8% | 73.9% | 0.0% | 7.3% | 949 |
| rz.Aleph 0.34 | 16 | 436 | 16.5% | 76.8% | 0.0% | 6.7% | 985 |
| ad.Quest 0.10 | 16 | 379 | 18.1% | 73.9% | 0.0% | 8.0% | 850 |
| nat.Hikari dev0001 | 16 | 346 | 6.3% | 91.3% | 0.0% | 2.4% | 854 |
| davidalves.net.DuelistMicroMkII 1.1 | 16 | 508 | 16.6% | 76.8% | 0.0% | 6.5% | 868 |
| jekl.DarkHallow .90.9 | 16 | 397 | 21.2% | 70.7% | 0.0% | 8.1% | 1079 |
| jcs.Decepticon 2.5.3 | 16 | 640 | 12.2% | 82.7% | 0.0% | 5.1% | 1024 |
| jekl.Jekyl .70 | 16 | 248 | 17.7% | 71.8% | 3.8% | 6.8% | 929 |
| stelo.Randomness 1.1 | 16 | 452 | 20.8% | 70.9% | 0.7% | 7.6% | 852 |
| gh.GrubbmGrb 1.2.4 | 16 | 380 | 23.9% | 65.6% | 0.0% | 10.5% | 985 |
| rcb.Vanessa03 0 | 16 | 379 | 24.7% | 64.8% | 0.0% | 10.4% | 734 |
| arthord.KostyaTszyu Beta2 | 16 | 319 | 19.6% | 72.7% | 0.0% | 7.7% | 905 |
| robar.micro.Kirbyi 1.0 | 16 | 471 | 15.9% | 78.3% | 0.0% | 5.7% | 811 |
| metal.small.dna2.MCoolDNA 1.5 | 16 | 318 | 18.7% | 73.6% | 0.0% | 7.8% | 944 |
| tw.Exterminator 1.0 | 16 | 294 | 41.5% | 46.0% | 0.2% | 12.3% | 3961 |
| pe.mini.SandboxMini 1.2 | 16 | 389 | 18.5% | 74.9% | 0.0% | 6.7% | 729 |
| trm.Wrekt 1.1.6.f | 16 | 423 | 18.5% | 73.9% | 0.0% | 7.6% | 954 |
| ags.micro.Carpet 1.1 | 16 | 343 | 17.3% | 76.4% | 0.1% | 6.2% | 1229 |
| pez.clean.Swiffer 0.2.9 | 16 | 326 | 20.1% | 72.7% | 0.0% | 7.1% | 890 |
| zen.Lindada 0.2 | 16 | 132 | 9.5% | 87.1% | 0.0% | 3.5% | 885 |
| vuen.Fractal 0.55 | 16 | 125 | 12.5% | 82.3% | 0.0% | 5.2% | 728 |
| nat.nano.Ocnirp 1.73 | 16 | 530 | 17.1% | 76.0% | 0.0% | 6.9% | 736 |
| syl.Centipede 0.5 | 16 | 79 | 11.9% | 83.0% | 0.0% | 5.1% | 743 |
| myl.micro.NekoNinja 1.30 | 16 | 174 | 9.0% | 87.0% | 0.0% | 4.0% | 1042 |
| stelo.SteloTestNano 1.0 | 16 | 199 | 15.7% | 77.1% | 1.3% | 6.0% | 693 |
| casey.Flee 1.0 | 16 | 316 | 5.9% | 91.5% | 0.0% | 2.5% | 713 |
| amk.ChumbaWumba 0.3 | 16 | 281 | 15.5% | 77.9% | 0.2% | 6.4% | 714 |
| metal.small.MCool 1.21 | 16 | 107 | 8.8% | 88.0% | 0.0% | 3.2% | 764 |
| tzu.TheArtOfWar 1.2 | 16 | 141 | 8.9% | 87.9% | 0.0% | 3.2% | 800 |
| lrem.magic.TormentedAngel Antiquitie | 16 | 422 | 16.3% | 77.6% | 0.0% | 6.1% | 895 |
| spinnercat.CopyKat 1.2.3 | 16 | 269 | 26.8% | 63.7% | 0.0% | 9.6% | 740 |
| apv.NanoLauLectrikTheCannibal 1.1 | 16 | 520 | 10.8% | 83.5% | 0.0% | 5.7% | 603 |
| simonton.nano.WeekendObsession_S 1.7 | 16 | 410 | 17.5% | 75.3% | 0.1% | 7.0% | 804 |
| nat.nano.OcnirpPM 1.0 | 16 | 570 | 18.6% | 73.8% | 0.0% | 7.5% | 717 |
| ds.OoV4 0.3b | 16 | 174 | 9.0% | 87.6% | 0.0% | 3.4% | 1566 |
| suh.nano.RandomPM 1.02 | 16 | 449 | 16.0% | 77.6% | 0.0% | 6.4% | 826 |
| ins.MobyNano 0.8 | 16 | 344 | 8.2% | 88.5% | 0.1% | 3.2% | 779 |
| starpkg.StarViewerZ 1.26 | 16 | 125 | 2.5% | 96.7% | 0.0% | 0.8% | 1814 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 16 | 13 | 1347 | 0 | 0.33 | 1 | 1 | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 16 | 16 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 16 | 15 | 0 | 0 | 0.28 | 1 | 1 | 0 |
| bvh.mini.Freya 0.55 | 16 | 16 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| tide.pear.Pear 0.62.1 | 16 | 16 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 16 | 15 | 1 | 0 | 0.29 | 0 | 0 | 0 |
| Krabb.krabby.Krabby 1.18b | 16 | 15 | 298 | 0 | 0.33 | 0 | 0 | 16 |
| jekl.mini.BlackPearl .91 | 16 | 16 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| kc.micro.Thorn 1.252 | 16 | 14 | 0 | 0 | 0.32 | 2 | 2 | 0 |
| lucasslf.HariSeldon 0.2.1 | 16 | 16 | 0 | 0 | 0.28 | 0 | 0 | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 16 | 16 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| stefw.Tigger 0.0.23 | 16 | 15 | 0 | 0 | 0.30 | 1 | 1 | 0 |
| AIR.iRobot 1.0 | 16 | 16 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| wilson.Chameleon 0.91 | 16 | 16 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| simonton.micro.GFMicro 1.0 | 16 | 14 | 363 | 0 | 0.31 | 0 | 0 | 0 |
| bvh.frg.Friga 0.112dev | 16 | 16 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| pkbots.BoyTDSurfer 1.0 | 16 | 15 | 0 | 0 | 0.30 | 1 | 1 | 0 |
| kawigi.mini.Coriantumr 1.1 | 16 | 14 | 298 | 0 | 0.33 | 1 | 1 | 0 |
| ahf.r2d2.R2d2 0.86 | 16 | 15 | 298 | 0 | 0.33 | 0 | 0 | 0 |
| florent.small.LittleAngel 1.8 | 16 | 13 | 0 | 0 | 0.30 | 3 | 3 | 0 |
| theo.Tungsten 1.0a | 16 | 14 | 0 | 0 | 0.31 | 2 | 1 | 0 |
| mnt.AHEB 0.6a | 16 | 16 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| DM.mega.Bezier 1.618fprrr | 16 | 16 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| ph.mini.Archer 0.6.6 | 16 | 16 | 0 | 0 | 0.27 | 0 | 0 | 0 |
| lucasslf.Wiggins 0.6 | 16 | 16 | 0 | 0 | 0.28 | 0 | 0 | 0 |
| davidalves.net.DuelistMini 1.1 | 16 | 15 | 596 | 0 | 0.35 | 0 | 0 | 0 |
| pez.mako.Mako 1.5 | 16 | 16 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 16 | 15 | 0 | 0 | 0.32 | 1 | 1 | 0 |
| rz.Aleph 0.34 | 16 | 14 | 0 | 0 | 0.30 | 2 | 2 | 0 |
| ad.Quest 0.10 | 16 | 16 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| nat.Hikari dev0001 | 16 | 14 | 0 | 0 | 0.30 | 2 | 2 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 16 | 15 | 298 | 0 | 0.34 | 0 | 0 | 0 |
| jekl.DarkHallow .90.9 | 16 | 15 | 0 | 0 | 0.29 | 1 | 1 | 0 |
| jcs.Decepticon 2.5.3 | 16 | 15 | 0 | 0 | 0.29 | 1 | 1 | 0 |
| jekl.Jekyl .70 | 16 | 15 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| stelo.Randomness 1.1 | 16 | 15 | 212 | 0 | 0.36 | 0 | 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 16 | 14 | 0 | 0 | 0.31 | 2 | 2 | 0 |
| rcb.Vanessa03 0 | 16 | 16 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| arthord.KostyaTszyu Beta2 | 16 | 15 | 0 | 0 | 0.30 | 1 | 1 | 0 |
| robar.micro.Kirbyi 1.0 | 16 | 15 | 0 | 0 | 0.32 | 1 | 1 | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 16 | 16 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| tw.Exterminator 1.0 | 16 | 13 | 298 | 0 | 0.31 | 2 | 2 | 0 |
| pe.mini.SandboxMini 1.2 | 16 | 16 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| trm.Wrekt 1.1.6.f | 16 | 16 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| ags.micro.Carpet 1.1 | 16 | 14 | 0 | 0 | 0.27 | 2 | 2 | 0 |
| pez.clean.Swiffer 0.2.9 | 16 | 15 | 488 | 0 | 0.35 | 0 | 0 | 0 |
| zen.Lindada 0.2 | 16 | 16 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| vuen.Fractal 0.55 | 16 | 15 | 0 | 0 | 0.32 | 1 | 1 | 0 |
| nat.nano.Ocnirp 1.73 | 16 | 16 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| syl.Centipede 0.5 | 16 | 16 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| myl.micro.NekoNinja 1.30 | 16 | 16 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| stelo.SteloTestNano 1.0 | 16 | 15 | 0 | 0 | 0.34 | 1 | 1 | 0 |
| casey.Flee 1.0 | 16 | 16 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| amk.ChumbaWumba 0.3 | 16 | 15 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| metal.small.MCool 1.21 | 16 | 16 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| tzu.TheArtOfWar 1.2 | 16 | 16 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 16 | 15 | 0 | 0 | 0.32 | 1 | 1 | 0 |
| spinnercat.CopyKat 1.2.3 | 16 | 15 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 16 | 14 | 0 | 0 | 0.33 | 2 | 2 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 16 | 16 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 16 | 14 | 15 | 1 | 0.41 | 1 | 1 | 0 |
| ds.OoV4 0.3b | 16 | 16 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| suh.nano.RandomPM 1.02 | 16 | 15 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| ins.MobyNano 0.8 | 16 | 16 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 16 | 16 | 0 | 0 | 0.34 | 0 | 0 | 0 |

989 of 1040 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 29761 | 0 | 29688 | 29669 (99.7%) | 92 (0.3%) | 19 (0.1%) | 346 | 24 | 56 |
| simonton.beta.LifelongObsession 0.5.1 | 53658 | 1060 | 53661 | 53657 (100.0%) | 1 (0.0%) | 4 (0.0%) | 104 | 52 | 69 |
| rdt.AgentSmith.AgentSmith 0.5 | 28917 | 6 | 28916 | 28916 (100.0%) | 1 (0.0%) | 0 (0.0%) | 109 | 56 | 56 |
| bvh.mini.Freya 0.55 | 18932 | 5 | 18934 | 18932 (100.0%) | 0 (0.0%) | 2 (0.0%) | 136 | 33 | 76 |
| tide.pear.Pear 0.62.1 | 16248 | 174 | 16242 | 16239 (99.9%) | 9 (0.1%) | 3 (0.0%) | 102 | 228 | 75 |
| simonton.mini.WeeksOnEnd 1.10.4 | 53066 | 922 | 53066 | 53062 (100.0%) | 4 (0.0%) | 4 (0.0%) | 349 | 75 | 69 |
| Krabb.krabby.Krabby 1.18b | 22510 | 3 | 22520 | 22437 (99.7%) | 73 (0.3%) | 83 (0.4%) | 589 | 76 | 105 |
| jekl.mini.BlackPearl .91 | 27026 | 3 | 27026 | 27026 (100.0%) | 0 (0.0%) | 0 (0.0%) | 86 | 26 | 54 |
| kc.micro.Thorn 1.252 | 26812 | 0 | 26913 | 26812 (100.0%) | 0 (0.0%) | 101 (0.4%) | 347 | 29 | 70 |
| lucasslf.HariSeldon 0.2.1 | 51836 | 982 | 51836 | 51832 (100.0%) | 4 (0.0%) | 4 (0.0%) | 68 | 31 | 47 |
| wiki.mini.BlackDestroyer 0.9.0 | 32842 | 759 | 32842 | 32841 (100.0%) | 1 (0.0%) | 1 (0.0%) | 71 | 60 | 53 |
| stefw.Tigger 0.0.23 | 27358 | 11 | 27358 | 27356 (100.0%) | 2 (0.0%) | 2 (0.0%) | 444 | 61 | 50 |
| AIR.iRobot 1.0 | 27493 | 4 | 27493 | 27493 (100.0%) | 0 (0.0%) | 0 (0.0%) | 76 | 37 | 52 |
| wilson.Chameleon 0.91 | 28586 | 10 | 28592 | 28586 (100.0%) | 0 (0.0%) | 6 (0.0%) | 106 | 40 | 125 |
| simonton.micro.GFMicro 1.0 | 48440 | 931 | 48416 | 48416 (100.0%) | 24 (0.0%) | 0 (0.0%) | 86 | 84 | 89 |
| bvh.frg.Friga 0.112dev | 23254 | 3 | 23254 | 23254 (100.0%) | 0 (0.0%) | 0 (0.0%) | 56 | 22 | 77 |
| pkbots.BoyTDSurfer 1.0 | 43314 | 289 | 43314 | 43314 (100.0%) | 0 (0.0%) | 0 (0.0%) | 136 | 72 | 56 |
| kawigi.mini.Coriantumr 1.1 | 21187 | 8 | 21170 | 21170 (99.9%) | 17 (0.1%) | 0 (0.0%) | 136 | 32 | 54 |
| ahf.r2d2.R2d2 0.86 | 25873 | 5 | 25854 | 25850 (99.9%) | 23 (0.1%) | 4 (0.0%) | 164 | 78 | 69 |
| florent.small.LittleAngel 1.8 | 28610 | 2 | 28636 | 28607 (100.0%) | 3 (0.0%) | 29 (0.1%) | 771 | 89 | 82 |
| theo.Tungsten 1.0a | 25619 | 3 | 25629 | 25619 (100.0%) | 0 (0.0%) | 10 (0.0%) | 194 | 108 | 74 |
| mnt.AHEB 0.6a | 28687 | 72 | 28697 | 28672 (99.9%) | 15 (0.1%) | 25 (0.1%) | 573 | 79 | 103 |
| DM.mega.Bezier 1.618fprrr | 54340 | 4 | 54355 | 54340 (100.0%) | 0 (0.0%) | 15 (0.0%) | 255 | 39 | 66 |
| ph.mini.Archer 0.6.6 | 37249 | 1080 | 37250 | 37249 (100.0%) | 0 (0.0%) | 1 (0.0%) | 80 | 23 | 63 |
| lucasslf.Wiggins 0.6 | 50258 | 878 | 50260 | 50256 (100.0%) | 2 (0.0%) | 4 (0.0%) | 378 | 88 | 54 |
| davidalves.net.DuelistMini 1.1 | 18694 | 6 | 18662 | 18659 (99.8%) | 35 (0.2%) | 3 (0.0%) | 456 | 81 | 61 |
| pez.mako.Mako 1.5 | 21872 | 13 | 21876 | 21870 (100.0%) | 2 (0.0%) | 6 (0.0%) | 391 | 64 | 66 |
| wcsv.Engineer.Engineer 0.5.4 | 30892 | 712 | 30893 | 30892 (100.0%) | 0 (0.0%) | 1 (0.0%) | 181 | 122 | 69 |
| rz.Aleph 0.34 | 27737 | 10 | 27741 | 27737 (100.0%) | 0 (0.0%) | 4 (0.0%) | 528 | 53 | 64 |
| ad.Quest 0.10 | 23306 | 330 | 23311 | 23305 (100.0%) | 1 (0.0%) | 6 (0.0%) | 427 | 74 | 117 |
| nat.Hikari dev0001 | 26074 | 24 | 26276 | 26034 (99.8%) | 40 (0.2%) | 242 (0.9%) | 2057 | 195 | 93 |
| davidalves.net.DuelistMicroMkII 1.1 | 21901 | 19 | 21981 | 21883 (99.9%) | 18 (0.1%) | 98 (0.4%) | 751 | 93 | 83 |
| jekl.DarkHallow .90.9 | 28422 | 93 | 29079 | 28421 (100.0%) | 1 (0.0%) | 658 (2.3%) | 977 | 68 | 73 |
| jcs.Decepticon 2.5.3 | 32797 | 786 | 32799 | 32792 (100.0%) | 5 (0.0%) | 7 (0.0%) | 701 | 157 | 52 |
| jekl.Jekyl .70 | 26397 | 5 | 26397 | 26397 (100.0%) | 0 (0.0%) | 0 (0.0%) | 317 | 52 | 63 |
| stelo.Randomness 1.1 | 25749 | 23 | 25735 | 25735 (99.9%) | 14 (0.1%) | 0 (0.0%) | 213 | 87 | 81 |
| gh.GrubbmGrb 1.2.4 | 31735 | 6 | 31735 | 31735 (100.0%) | 0 (0.0%) | 0 (0.0%) | 180 | 82 | 125 |
| rcb.Vanessa03 0 | 18204 | 9 | 18204 | 18204 (100.0%) | 0 (0.0%) | 0 (0.0%) | 135 | 49 | 85 |
| arthord.KostyaTszyu Beta2 | 22340 | 0 | 22459 | 22337 (100.0%) | 3 (0.0%) | 122 (0.5%) | 587 | 34 | 105 |
| robar.micro.Kirbyi 1.0 | 23531 | 242 | 23726 | 23495 (99.8%) | 36 (0.2%) | 231 (1.0%) | 1360 | 150 | 68 |
| metal.small.dna2.MCoolDNA 1.5 | 27030 | 7 | 27030 | 27029 (100.0%) | 1 (0.0%) | 1 (0.0%) | 168 | 49 | 102 |
| tw.Exterminator 1.0 | 188356 | 22 | 189274 | 188327 (100.0%) | 29 (0.0%) | 947 (0.5%) | 979 | 160 | 91 |
| pe.mini.SandboxMini 1.2 | 17285 | 5 | 17291 | 17285 (100.0%) | 0 (0.0%) | 6 (0.0%) | 109 | 51 | 59 |
| trm.Wrekt 1.1.6.f | 27696 | 3 | 27729 | 27696 (100.0%) | 0 (0.0%) | 33 (0.1%) | 482 | 81 | 104 |
| ags.micro.Carpet 1.1 | 43290 | 789 | 43291 | 43290 (100.0%) | 0 (0.0%) | 1 (0.0%) | 340 | 66 | 58 |
| pez.clean.Swiffer 0.2.9 | 24727 | 15 | 24721 | 24694 (99.9%) | 33 (0.1%) | 27 (0.1%) | 159 | 35 | 72 |
| zen.Lindada 0.2 | 24713 | 13 | 24723 | 24710 (100.0%) | 3 (0.0%) | 13 (0.1%) | 159 | 43 | 135 |
| vuen.Fractal 0.55 | 14990 | 3 | 15045 | 14971 (99.9%) | 19 (0.1%) | 74 (0.5%) | 399 | 88 | 109 |
| nat.nano.Ocnirp 1.73 | 19789 | 28 | 19813 | 19730 (99.7%) | 59 (0.3%) | 83 (0.4%) | 2448 | 207 | 67 |
| syl.Centipede 0.5 | 17870 | 6 | 17871 | 17870 (100.0%) | 0 (0.0%) | 1 (0.0%) | 48 | 33 | 70 |
| myl.micro.NekoNinja 1.30 | 32075 | 2 | 32090 | 32075 (100.0%) | 0 (0.0%) | 15 (0.0%) | 384 | 64 | 121 |
| stelo.SteloTestNano 1.0 | 17190 | 8 | 17190 | 17190 (100.0%) | 0 (0.0%) | 0 (0.0%) | 86 | 42 | 72 |
| casey.Flee 1.0 | 18664 | 27 | 18818 | 18597 (99.6%) | 67 (0.4%) | 221 (1.2%) | 1968 | 187 | 67 |
| amk.ChumbaWumba 0.3 | 17890 | 7 | 17891 | 17889 (100.0%) | 1 (0.0%) | 2 (0.0%) | 135 | 48 | 61 |
| metal.small.MCool 1.21 | 19990 | 15 | 19991 | 19990 (100.0%) | 0 (0.0%) | 1 (0.0%) | 79 | 31 | 73 |
| tzu.TheArtOfWar 1.2 | 22655 | 6 | 23117 | 22655 (100.0%) | 0 (0.0%) | 462 (2.0%) | 73 | 57 | 66 |
| lrem.magic.TormentedAngel Antiquitie | 27507 | 8 | 27507 | 27506 (100.0%) | 1 (0.0%) | 1 (0.0%) | 100 | 62 | 87 |
| spinnercat.CopyKat 1.2.3 | 19912 | 9 | 19918 | 19910 (100.0%) | 2 (0.0%) | 8 (0.0%) | 545 | 83 | 127 |
| apv.NanoLauLectrikTheCannibal 1.1 | 15987 | 416 | 15989 | 15986 (100.0%) | 1 (0.0%) | 3 (0.0%) | 1277 | 166 | 105 |
| simonton.nano.WeekendObsession_S 1.7 | 23817 | 81 | 24021 | 23786 (99.9%) | 31 (0.1%) | 235 (1.0%) | 2585 | 203 | 88 |
| nat.nano.OcnirpPM 1.0 | 19127 | 21 | 19142 | 19069 (99.7%) | 58 (0.3%) | 73 (0.4%) | 2364 | 218 | 64 |
| ds.OoV4 0.3b | 60336 | 129 | 60337 | 60334 (100.0%) | 2 (0.0%) | 3 (0.0%) | 242 | 79 | 79 |
| suh.nano.RandomPM 1.02 | 24683 | 17 | 24738 | 24658 (99.9%) | 25 (0.1%) | 80 (0.3%) | 2436 | 192 | 83 |
| ins.MobyNano 0.8 | 22493 | 309 | 22614 | 22477 (99.9%) | 16 (0.1%) | 137 (0.6%) | 2877 | 236 | 70 |
| starpkg.StarViewerZ 1.26 | 74034 | 16 | 74035 | 74034 (100.0%) | 0 (0.0%) | 1 (0.0%) | 189 | 61 | 127 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jam.mini.Raiko 0.43 | 7341 | 27989 (381.3%) | 1252 |
| simonton.beta.LifelongObsession 0.5.1 | 4959 | 51325 (1035.0%) | 1846 |
| rdt.AgentSmith.AgentSmith 0.5 | 5461 | 27026 (494.9%) | 797 |
| bvh.mini.Freya 0.55 | 6528 | 17984 (275.5%) | 0 |
| tide.pear.Pear 0.62.1 | 4609 | 12456 (270.3%) | 1353 |
| simonton.mini.WeeksOnEnd 1.10.4 | 6786 | 48933 (721.1%) | 3395 |
| Krabb.krabby.Krabby 1.18b | 3505 | 21220 (605.4%) | 316 |
| jekl.mini.BlackPearl .91 | 4414 | 25018 (566.8%) | 600 |
| kc.micro.Thorn 1.252 | 7593 | 24970 (328.9%) | 964 |
| lucasslf.HariSeldon 0.2.1 | 3545 | 50169 (1415.2%) | 692 |
| wiki.mini.BlackDestroyer 0.9.0 | 4561 | 30402 (666.6%) | 611 |
| stefw.Tigger 0.0.23 | 6866 | 23930 (348.5%) | 707 |
| AIR.iRobot 1.0 | 3663 | 25977 (709.2%) | 157 |
| wilson.Chameleon 0.91 | 6163 | 27133 (440.3%) | 522 |
| simonton.micro.GFMicro 1.0 | 3462 | 46750 (1350.4%) | 120 |
| bvh.frg.Friga 0.112dev | 4062 | 22512 (554.2%) | 0 |
| pkbots.BoyTDSurfer 1.0 | 3712 | 40914 (1102.2%) | 370 |
| kawigi.mini.Coriantumr 1.1 | 6193 | 19924 (321.7%) | 0 |
| ahf.r2d2.R2d2 0.86 | 4885 | 24314 (497.7%) | 1049 |
| florent.small.LittleAngel 1.8 | 12494 | 22630 (181.1%) | 2360 |
| theo.Tungsten 1.0a | 6822 | 22603 (331.3%) | 2909 |
| mnt.AHEB 0.6a | 4916 | 26785 (544.9%) | 176 |
| DM.mega.Bezier 1.618fprrr | 6803 | 51759 (760.8%) | 1642 |
| ph.mini.Archer 0.6.6 | 4013 | 35346 (880.8%) | 0 |
| lucasslf.Wiggins 0.6 | 8171 | 44296 (542.1%) | 4988 |
| davidalves.net.DuelistMini 1.1 | 9997 | 12993 (130.0%) | 2004 |
| pez.mako.Mako 1.5 | 6891 | 19178 (278.3%) | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 7008 | 25753 (367.5%) | 4107 |
| rz.Aleph 0.34 | 10947 | 22998 (210.1%) | 3434 |
| ad.Quest 0.10 | 7751 | 19196 (247.7%) | 3751 |
| nat.Hikari dev0001 | 3664 | 23871 (651.5%) | 879 |
| davidalves.net.DuelistMicroMkII 1.1 | 9870 | 18532 (187.8%) | 708 |
| jekl.DarkHallow .90.9 | 13974 | 24778 (177.3%) | 2001 |
| jcs.Decepticon 2.5.3 | 13390 | 22070 (164.8%) | 7581 |
| jekl.Jekyl .70 | 6700 | 24229 (361.6%) | 746 |
| stelo.Randomness 1.1 | 5366 | 22631 (421.7%) | 1200 |
| gh.GrubbmGrb 1.2.4 | 5672 | 29395 (518.2%) | 2389 |
| rcb.Vanessa03 0 | 4912 | 16292 (331.7%) | 211 |
| arthord.KostyaTszyu Beta2 | 8152 | 20870 (256.0%) | 369 |
| robar.micro.Kirbyi 1.0 | 5084 | 19919 (391.8%) | 114 |
| metal.small.dna2.MCoolDNA 1.5 | 5135 | 25599 (498.5%) | 0 |
| tw.Exterminator 1.0 | 13503 | 176280 (1305.5%) | 8123 |
| pe.mini.SandboxMini 1.2 | 5346 | 15642 (292.6%) | 397 |
| trm.Wrekt 1.1.6.f | 9847 | 22469 (228.2%) | 2587 |
| ags.micro.Carpet 1.1 | 7422 | 38562 (519.6%) | 2183 |
| pez.clean.Swiffer 0.2.9 | 5533 | 22709 (410.4%) | 593 |
| zen.Lindada 0.2 | 6136 | 23272 (379.3%) | 378 |
| vuen.Fractal 0.55 | 7281 | 14144 (194.3%) | 0 |
| nat.nano.Ocnirp 1.73 | 4523 | 16983 (375.5%) | 1176 |
| syl.Centipede 0.5 | 5366 | 16835 (313.7%) | 0 |
| myl.micro.NekoNinja 1.30 | 7801 | 29847 (382.6%) | 0 |
| stelo.SteloTestNano 1.0 | 3066 | 16129 (526.1%) | 195 |
| casey.Flee 1.0 | 4283 | 16553 (386.5%) | 216 |
| amk.ChumbaWumba 0.3 | 4924 | 15919 (323.3%) | 163 |
| metal.small.MCool 1.21 | 4140 | 18932 (457.3%) | 0 |
| tzu.TheArtOfWar 1.2 | 4341 | 21013 (484.1%) | 1155 |
| lrem.magic.TormentedAngel Antiquitie | 4192 | 24760 (590.6%) | 236 |
| spinnercat.CopyKat 1.2.3 | 2400 | 18796 (783.2%) | 2 |
| apv.NanoLauLectrikTheCannibal 1.1 | 4533 | 11366 (250.7%) | 1863 |
| simonton.nano.WeekendObsession_S 1.7 | 4427 | 21195 (478.8%) | 518 |
| nat.nano.OcnirpPM 1.0 | 5320 | 15254 (286.7%) | 2023 |
| ds.OoV4 0.3b | 5703 | 58181 (1020.2%) | 2273 |
| suh.nano.RandomPM 1.02 | 3649 | 22392 (613.6%) | 145 |
| ins.MobyNano 0.8 | 3970 | 20565 (518.0%) | 155 |
| starpkg.StarViewerZ 1.26 | 4944 | 71485 (1445.9%) | 773 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 650 | 448 | 650 | 863 | 5.0 / 4.6 | 13 | 781 | 6 |
| simonton.beta.LifelongObsession 0.5.1 | 650 | 486 | 650 | 1274 | 6.9 / 4.4 | 9 | 1520 | 3340 |
| rdt.AgentSmith.AgentSmith 0.5 | 650 | 499 | 650 | 816 | 6.1 / 5.3 | 36 | 656 | 0 |
| bvh.mini.Freya 0.55 | 650 | 513 | 650 | 644 | 8.3 / 1.5 | 18 | 750 | 141 |
| tide.pear.Pear 0.62.1 | 650 | 298 | 400 | 461 | 48.4 / 18.6 | 2187 | 2974 | 91 |
| simonton.mini.WeeksOnEnd 1.10.4 | 650 | 472 | 650 | 1261 | 7.7 / 6.9 | 7 | 1338 | 3797 |
| Krabb.krabby.Krabby 1.18b | 650 | 404 | 634 | 669 | 8.5 / 4.0 | 89 | 840 | 414 |
| jekl.mini.BlackPearl .91 | 650 | 466 | 650 | 746 | 6.8 / 3.7 | 69 | 1223 | 1066 |
| kc.micro.Thorn 1.252 | 650 | 426 | 636 | 819 | 7.5 / 6.8 | 39 | 562 | 13 |
| lucasslf.HariSeldon 0.2.1 | 650 | 476 | 627 | 1219 | 7.6 / 2.9 | 19 | 839 | 391 |
| wiki.mini.BlackDestroyer 0.9.0 | 650 | 442 | 650 | 866 | 7.4 / 6.1 | 10 | 1731 | 851 |
| stefw.Tigger 0.0.23 | 650 | 426 | 650 | 773 | 7.5 / 9.9 | 45 | 853 | 90 |
| AIR.iRobot 1.0 | 650 | 483 | 627 | 756 | 5.8 / 2.3 | 31 | 1229 | 702 |
| wilson.Chameleon 0.91 | 650 | 486 | 650 | 812 | 8.5 / 1.9 | 50 | 871 | 3 |
| simonton.micro.GFMicro 1.0 | 650 | 422 | 569 | 1148 | 16.2 / 5.1 | 141 | 1103 | 1720 |
| bvh.frg.Friga 0.112dev | 650 | 531 | 650 | 714 | 5.5 / 1.6 | 11 | 595 | 0 |
| pkbots.BoyTDSurfer 1.0 | 650 | 357 | 650 | 1049 | 5.5 / 7.7 | 19 | 471 | 318 |
| kawigi.mini.Coriantumr 1.1 | 650 | 507 | 644 | 693 | 14.2 / 2.2 | 24 | 641 | 0 |
| ahf.r2d2.R2d2 0.86 | 650 | 484 | 650 | 739 | 10.7 / 6.3 | 109 | 1095 | 0 |
| florent.small.LittleAngel 1.8 | 650 | 522 | 650 | 865 | 10.3 / 13.6 | 32 | 2268 | 545 |
| theo.Tungsten 1.0a | 650 | 418 | 650 | 757 | 14.0 / 9.5 | 159 | 1611 | 61 |
| mnt.AHEB 0.6a | 650 | 372 | 650 | 797 | 6.0 / 6.4 | 66 | 543 | 30 |
| DM.mega.Bezier 1.618fprrr | 650 | 480 | 650 | 1311 | 18.5 / 2.9 | 228 | 2518 | 60 |
| ph.mini.Archer 0.6.6 | 650 | 463 | 650 | 954 | 3.3 / 7.2 | 1 | 628 | 3006 |
| lucasslf.Wiggins 0.6 | 650 | 467 | 650 | 1185 | 10.5 / 7.1 | 179 | 1913 | 1021 |
| davidalves.net.DuelistMini 1.1 | 650 | 521 | 598 | 625 | 16.2 / 9.3 | 543 | 2882 | 315 |
| pez.mako.Mako 1.5 | 650 | 452 | 642 | 668 | 10.1 / 7.1 | 209 | 1877 | 114 |
| wcsv.Engineer.Engineer 0.5.4 | 650 | 364 | 569 | 799 | 18.0 / 16.1 | 760 | 2199 | 1149 |
| rz.Aleph 0.34 | 650 | 494 | 650 | 836 | 7.7 / 9.6 | 70 | 1619 | 134 |
| ad.Quest 0.10 | 650 | 486 | 644 | 700 | 10.6 / 8.0 | 284 | 1430 | 564 |
| nat.Hikari dev0001 | 650 | 324 | 650 | 704 | 8.2 / 9.0 | 137 | 730 | 768 |
| davidalves.net.DuelistMicroMkII 1.1 | 650 | 431 | 634 | 718 | 17.0 / 11.1 | 649 | 1260 | 140 |
| jekl.DarkHallow .90.9 | 650 | 455 | 650 | 929 | 8.5 / 8.0 | 102 | 1413 | 379 |
| jcs.Decepticon 2.5.3 | 650 | 526 | 647 | 874 | 14.2 / 15.1 | 190 | 3930 | 5938 |
| jekl.Jekyl .70 | 650 | 443 | 650 | 779 | 9.9 / 5.1 | 195 | 1310 | 2 |
| stelo.Randomness 1.1 | 650 | 417 | 644 | 702 | 14.1 / 9.1 | 490 | 2995 | 240 |
| gh.GrubbmGrb 1.2.4 | 650 | 437 | 613 | 837 | 13.9 / 7.1 | 165 | 1246 | 80 |
| rcb.Vanessa03 0 | 650 | 347 | 634 | 584 | 9.9 / 7.0 | 177 | 1594 | 0 |
| arthord.KostyaTszyu Beta2 | 650 | 452 | 650 | 755 | 6.5 / 6.6 | 6 | 852 | 20 |
| robar.micro.Kirbyi 1.0 | 650 | 261 | 616 | 660 | 15.4 / 10.5 | 682 | 1603 | 882 |
| metal.small.dna2.MCoolDNA 1.5 | 650 | 371 | 650 | 794 | 8.3 / 6.7 | 32 | 1083 | 0 |
| tw.Exterminator 1.0 | 650 | 510 | 639 | 3816 | 10.9 / 3.9 | 567 | 1058 | 716 |
| pe.mini.SandboxMini 1.2 | 650 | 325 | 650 | 579 | 11.4 / 8.3 | 233 | 1362 | 0 |
| trm.Wrekt 1.1.6.f | 650 | 375 | 650 | 804 | 10.5 / 8.9 | 202 | 1317 | 5 |
| ags.micro.Carpet 1.1 | 650 | 496 | 650 | 1080 | 7.0 / 7.5 | 8 | 979 | 3028 |
| pez.clean.Swiffer 0.2.9 | 650 | 431 | 617 | 740 | 12.1 / 6.8 | 148 | 918 | 8 |
| zen.Lindada 0.2 | 650 | 486 | 650 | 735 | 8.3 / 3.3 | 34 | 698 | 146 |
| vuen.Fractal 0.55 | 650 | 445 | 620 | 578 | 20.7 / 2.9 | 212 | 724 | 186 |
| nat.nano.Ocnirp 1.73 | 650 | 386 | 645 | 586 | 9.4 / 11.5 | 170 | 1412 | 1792 |
| syl.Centipede 0.5 | 650 | 409 | 650 | 593 | 8.2 / 1.9 | 18 | 1160 | 366 |
| myl.micro.NekoNinja 1.30 | 650 | 482 | 638 | 892 | 11.4 / 4.3 | 70 | 1022 | 155 |
| stelo.SteloTestNano 1.0 | 650 | 385 | 645 | 543 | 12.2 / 4.4 | 138 | 1108 | 365 |
| casey.Flee 1.0 | 650 | 385 | 650 | 563 | 10.5 / 8.3 | 164 | 1897 | 1733 |
| amk.ChumbaWumba 0.3 | 650 | 443 | 650 | 564 | 9.0 / 6.3 | 172 | 1762 | 1417 |
| metal.small.MCool 1.21 | 650 | 446 | 650 | 614 | 6.4 / 2.7 | 5 | 917 | 424 |
| tzu.TheArtOfWar 1.2 | 650 | 342 | 641 | 650 | 14.0 / 3.5 | 452 | 1240 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 650 | 411 | 650 | 745 | 7.3 / 9.4 | 150 | 1721 | 1244 |
| spinnercat.CopyKat 1.2.3 | 650 | 354 | 645 | 590 | 12.7 / 4.9 | 106 | 671 | 613 |
| apv.NanoLauLectrikTheCannibal 1.1 | 650 | 338 | 403 | 443 | 43.9 / 12.4 | 1926 | 2927 | 597 |
| simonton.nano.WeekendObsession_S 1.7 | 650 | 386 | 627 | 654 | 12.0 / 8.8 | 237 | 2177 | 1011 |
| nat.nano.OcnirpPM 1.0 | 650 | 386 | 650 | 567 | 10.9 / 12.0 | 258 | 2459 | 2245 |
| ds.OoV4 0.3b | 650 | 483 | 650 | 1416 | 6.4 / 4.3 | 48 | 582 | 48 |
| suh.nano.RandomPM 1.02 | 650 | 379 | 650 | 676 | 6.1 / 10.0 | 84 | 1300 | 1109 |
| ins.MobyNano 0.8 | 650 | 390 | 650 | 629 | 11.5 / 8.7 | 209 | 1189 | 1434 |
| starpkg.StarViewerZ 1.26 | 650 | 425 | 634 | 1664 | 7.4 / 3.4 | 110 | 1930 | 0 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 1.2% | 186 | 81 | 3 | 2.9 | 145 / 27989 (1%) | 0 | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 2.2% | 178 | 140 | 3 | 4.0 | 245 / 51325 (0%) | 0 | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 1.1% | 157 | 52 | 3 | 3.0 | 153 / 27026 (1%) | 0 | 0 |
| bvh.mini.Freya 0.55 | 0.4% | 171 | 75 | 3 | 1.6 | 53 / 17984 (0%) | 0 | 0 |
| tide.pear.Pear 0.62.1 | 7.5% | 190 | 73 | 3 | 6.1 | 387 / 12456 (3%) | 0 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 2.5% | 163 | 65 | 3 | 7.2 | 418 / 48933 (1%) | 0 | 0 |
| Krabb.krabby.Krabby 1.18b | 0.9% | 183 | 75 | 3 | 2.0 | 85 / 21220 (0%) | 0 | 0 |
| jekl.mini.BlackPearl .91 | 0.8% | 167 | 79 | 3 | 3.7 | 145 / 25018 (1%) | 0 | 0 |
| kc.micro.Thorn 1.252 | 1.5% | 179 | 81 | 3 | 2.9 | 125 / 24970 (1%) | 0 | 0 |
| lucasslf.HariSeldon 0.2.1 | 1.6% | 154 | 44 | 2 | 2.8 | 139 / 50169 (0%) | 0 | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 3.0% | 164 | 90 | 3 | 3.5 | 141 / 30402 (0%) | 0 | 0 |
| stefw.Tigger 0.0.23 | 2.0% | 167 | 74 | 3 | 5.6 | 283 / 23930 (1%) | 0 | 0 |
| AIR.iRobot 1.0 | 0.5% | 171 | 68 | 3 | 2.6 | 91 / 25977 (0%) | 0 | 0 |
| wilson.Chameleon 0.91 | 0.5% | 178 | 73 | 3 | 2.3 | 103 / 27133 (0%) | 0 | 0 |
| simonton.micro.GFMicro 1.0 | 2.8% | 174 | 361 | 3 | 1.6 | 62 / 46750 (0%) | 0 | 0 |
| bvh.frg.Friga 0.112dev | 0.4% | 180 | 73 | 3 | 1.4 | 48 / 22512 (0%) | 0 | 0 |
| pkbots.BoyTDSurfer 1.0 | 2.1% | 170 | 98 | 3 | 3.4 | 155 / 40914 (0%) | 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 0.5% | 182 | 69 | 3 | 1.9 | 58 / 19924 (0%) | 0 | 0 |
| ahf.r2d2.R2d2 0.86 | 1.5% | 186 | 73 | 3 | 2.5 | 171 / 24314 (1%) | 0 | 0 |
| florent.small.LittleAngel 1.8 | 2.8% | 170 | 75 | 3 | 9.9 | 473 / 22630 (2%) | 0 | 0 |
| theo.Tungsten 1.0a | 2.2% | 171 | 80 | 3 | 4.9 | 322 / 22603 (1%) | 0 | 0 |
| mnt.AHEB 0.6a | 1.8% | 176 | 73 | 3 | 3.0 | 114 / 26785 (0%) | 0 | 0 |
| DM.mega.Bezier 1.618fprrr | 0.6% | 167 | 300 | 3 | 4.7 | 254 / 51759 (0%) | 0 | 0 |
| ph.mini.Archer 0.6.6 | 3.5% | 150 | 75 | 3 | 2.5 | 98 / 35346 (0%) | 0 | 0 |
| lucasslf.Wiggins 0.6 | 2.4% | 158 | 775 | 3 | 11.2 | 612 / 44296 (1%) | 0 | 0 |
| davidalves.net.DuelistMini 1.1 | 2.3% | 198 | 83 | 3 | 8.8 | 395 / 12993 (3%) | 0 | 0 |
| pez.mako.Mako 1.5 | 1.5% | 192 | 76 | 3 | 4.4 | 171 / 19178 (1%) | 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 4.6% | 179 | 92 | 3 | 8.7 | 537 / 25753 (2%) | 0 | 0 |
| rz.Aleph 0.34 | 2.0% | 168 | 275 | 3 | 8.7 | 445 / 22998 (2%) | 0 | 0 |
| ad.Quest 0.10 | 2.3% | 191 | 485 | 3 | 6.6 | 370 / 19196 (2%) | 0 | 0 |
| nat.Hikari dev0001 | 2.4% | 169 | 67 | 3 | 3.2 | 212 / 23871 (1%) | 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 2.5% | 190 | 82 | 3 | 5.4 | 250 / 18532 (1%) | 0 | 0 |
| jekl.DarkHallow .90.9 | 1.8% | 160 | 85 | 3 | 7.6 | 321 / 24778 (1%) | 0 | 0 |
| jcs.Decepticon 2.5.3 | 4.7% | 163 | 132 | 3 | 17.6 | 952 / 22070 (4%) | 0 | 0 |
| jekl.Jekyl .70 | 1.7% | 176 | 75 | 3 | 3.8 | 176 / 24229 (1%) | 0 | 0 |
| stelo.Randomness 1.1 | 2.8% | 202 | 74 | 3 | 5.1 | 263 / 22631 (1%) | 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 1.9% | 176 | 99 | 3 | 3.7 | 235 / 29395 (1%) | 0 | 0 |
| rcb.Vanessa03 0 | 1.8% | 181 | 69 | 3 | 2.8 | 99 / 16292 (1%) | 0 | 0 |
| arthord.KostyaTszyu Beta2 | 1.3% | 168 | 74 | 3 | 2.4 | 92 / 20870 (0%) | 0 | 0 |
| robar.micro.Kirbyi 1.0 | 4.6% | 179 | 74 | 3 | 4.7 | 167 / 19919 (1%) | 0 | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 1.4% | 187 | 52 | 3 | 2.1 | 81 / 25599 (0%) | 0 | 0 |
| tw.Exterminator 1.0 | 2.0% | 174 | 3434 | 3 | 22.2 | 1017 / 176280 (1%) | 0 | 0 |
| pe.mini.SandboxMini 1.2 | 1.8% | 175 | 87 | 3 | 2.6 | 104 / 15642 (1%) | 0 | 0 |
| trm.Wrekt 1.1.6.f | 2.1% | 178 | 83 | 3 | 9.8 | 475 / 22469 (2%) | 0 | 0 |
| ags.micro.Carpet 1.1 | 2.9% | 153 | 62 | 3 | 8.0 | 417 / 38562 (1%) | 0 | 0 |
| pez.clean.Swiffer 0.2.9 | 2.8% | 197 | 80 | 3 | 2.7 | 98 / 22709 (0%) | 0 | 0 |
| zen.Lindada 0.2 | 0.7% | 198 | 85 | 3 | 2.3 | 105 / 23272 (0%) | 0 | 0 |
| vuen.Fractal 0.55 | 0.7% | 178 | 49 | 3 | 1.3 | 28 / 14144 (0%) | 0 | 0 |
| nat.nano.Ocnirp 1.73 | 3.0% | 195 | 137 | 3 | 4.3 | 194 / 16983 (1%) | 0 | 0 |
| syl.Centipede 0.5 | 0.7% | 183 | 72 | 3 | 1.7 | 49 / 16835 (0%) | 0 | 0 |
| myl.micro.NekoNinja 1.30 | 1.0% | 193 | 91 | 3 | 4.0 | 146 / 29847 (0%) | 0 | 0 |
| stelo.SteloTestNano 1.0 | 1.4% | 193 | 69 | 3 | 1.5 | 87 / 16129 (1%) | 0 | 0 |
| casey.Flee 1.0 | 2.3% | 190 | 76 | 3 | 3.6 | 144 / 16553 (1%) | 0 | 0 |
| amk.ChumbaWumba 0.3 | 1.5% | 171 | 73 | 3 | 3.3 | 128 / 15919 (1%) | 0 | 0 |
| metal.small.MCool 1.21 | 0.7% | 190 | 62 | 3 | 1.7 | 60 / 18932 (0%) | 0 | 0 |
| tzu.TheArtOfWar 1.2 | 1.4% | 188 | 81 | 3 | 2.9 | 115 / 21013 (1%) | 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 2.0% | 180 | 73 | 3 | 4.2 | 156 / 24760 (1%) | 0 | 0 |
| spinnercat.CopyKat 1.2.3 | 1.9% | 172 | 90 | 3 | 1.3 | 71 / 18796 (0%) | 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 5.4% | 185 | 67 | 3 | 4.5 | 252 / 11366 (2%) | 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 2.8% | 193 | 118 | 3 | 4.0 | 188 / 21195 (1%) | 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 3.1% | 232 | 1721 | 3 | 5.9 | 284 / 15254 (2%) | 0 | 0 |
| ds.OoV4 0.3b | 1.1% | 186 | 82 | 3 | 3.8 | 208 / 58181 (0%) | 0 | 0 |
| suh.nano.RandomPM 1.02 | 2.5% | 171 | 72 | 3 | 3.1 | 101 / 22392 (0%) | 0 | 0 |
| ins.MobyNano 0.8 | 3.1% | 176 | 71 | 3 | 3.0 | 136 / 20565 (1%) | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 0.9% | 188 | 141 | 3 | 4.3 | 182 / 71485 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.mini.Freya 0.55 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tide.pear.Pear 0.62.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| Krabb.krabby.Krabby 1.18b | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jekl.mini.BlackPearl .91 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kc.micro.Thorn 1.252 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lucasslf.HariSeldon 0.2.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stefw.Tigger 0.0.23 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| AIR.iRobot 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wilson.Chameleon 0.91 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.micro.GFMicro 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.frg.Friga 0.112dev | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pkbots.BoyTDSurfer 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ahf.r2d2.R2d2 0.86 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| florent.small.LittleAngel 1.8 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.Tungsten 1.0a | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mnt.AHEB 0.6a | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| DM.mega.Bezier 1.618fprrr | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ph.mini.Archer 0.6.6 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lucasslf.Wiggins 0.6 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.net.DuelistMini 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.mako.Mako 1.5 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rz.Aleph 0.34 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ad.Quest 0.10 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.Hikari dev0001 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jekl.DarkHallow .90.9 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jcs.Decepticon 2.5.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jekl.Jekyl .70 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.Randomness 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rcb.Vanessa03 0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| arthord.KostyaTszyu Beta2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.micro.Kirbyi 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tw.Exterminator 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pe.mini.SandboxMini 1.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| trm.Wrekt 1.1.6.f | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ags.micro.Carpet 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.clean.Swiffer 0.2.9 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| zen.Lindada 0.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| vuen.Fractal 0.55 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.nano.Ocnirp 1.73 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| syl.Centipede 0.5 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| myl.micro.NekoNinja 1.30 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.SteloTestNano 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| casey.Flee 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| amk.ChumbaWumba 0.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| metal.small.MCool 1.21 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tzu.TheArtOfWar 1.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| spinnercat.CopyKat 1.2.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ds.OoV4 0.3b | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| suh.nano.RandomPM 1.02 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ins.MobyNano 0.8 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| starpkg.StarViewerZ 1.26 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | jam.mini.Raiko | 1 | 35 | 290 | 0.9% | 17.8% ± 10.1 | 8.3% | 21.2% / 20.6% | 3.8% | 0 / 0 | T?/M? | 92% |
| simonton.beta.LifelongObsession 0.5.1 | simonton.beta.LifelongObsession | 1 | 35 | 360 | 2.3% | 11.1% ± 5.3 | 10.0% | 25.0% / 28.9% | 5.3% | 0 / 0 | T?/M? | 95% |
| rdt.AgentSmith.AgentSmith 0.5 | rdt.AgentSmith.AgentSmith | 1 | 35 | 332 | 1.0% | 10.9% ± 5.3 | 9.5% | 28.7% / 28.5% | 3.7% | 0 / 0 | T?/M? | 93% |
| bvh.mini.Freya 0.55 | bvh.mini.Freya | 1 | 35 | 290 | 0.2% | 6.8% ± 10.3 | 9.1% | 26.6% / 25.2% | 11.5% | 0 / 0 | T?/M? | 99% |
| tide.pear.Pear 0.62.1 | tide.pear.Pear | 1 | 35 | 294 | 7.1% | 12.6% ± 4.1 | 25.1% | 34.4% / 38.7% | 3.3% | 0 / 0 | T?/M? | 81% |
| simonton.mini.WeeksOnEnd 1.10.4 | simonton.mini.WeeksOnEnd | 1 | 35 | 334 | 2.4% | 13.7% ± 5.1 | 9.4% | 25.9% / 26.1% | 5.2% | 0 / 0 | T?/M? | 90% |
| Krabb.krabby.Krabby 1.18b | Krabb.krabby.Krabby | 1 | 35 | 312 | 1.1% | 8.3% ± 5.6 | 10.1% | 23.5% / 21.7% | 23.5% | 0 / 0 | T?/M? | 93% |
| jekl.mini.BlackPearl .91 | jekl.mini.BlackPearl | 1 | 35 | 312 | 0.6% | 8.9% ± 5.6 | 9.8% | 29.0% / 23.4% | 9.2% | 0 / 0 | T?/M? | 96% |
| kc.micro.Thorn 1.252 | kc.micro.Thorn | 1 | 35 | 292 | 0.9% | 15.0% ± 8.0 | 8.6% | 20.5% / 22.4% | 4.7% | 0 / 0 | T?/M? | 91% |
| lucasslf.HariSeldon 0.2.1 | lucasslf.HariSeldon | 1 | 35 | 312 | 2.0% | 4.5% ± 5.2 | 11.9% | 33.7% / 28.6% | 4.0% | 0 / 0 | T?/M? | 99% |
| wiki.mini.BlackDestroyer 0.9.0 | wiki.mini.BlackDestroyer | 1 | 35 | 332 | 3.8% | 14.5% ± 6.8 | 11.6% | 22.1% / 20.2% | 8.3% | 0 / 0 | T?/M? | 85% |
| stefw.Tigger 0.0.23 | stefw.Tigger | 1 | 35 | 286 | 2.1% | 11.8% ± 4.9 | 10.2% | 23.9% / 32.4% | 15.5% | 0 / 0 | T?/M? | 83% |
| AIR.iRobot 1.0 | AIR.iRobot | 1 | 35 | 272 | 0.6% | 16.0% ± 11.3 | 10.4% | 29.1% / 27.6% | 9.5% | 0 / 0 | T?/M? | 92% |
| wilson.Chameleon 0.91 | wilson.Chameleon | 1 | 35 | 298 | 0.2% | 41.5% ± 34.5 | 9.1% | 26.1% / 23.2% | 13.2% | 0 / 0 | T?/M? | 99% |
| simonton.micro.GFMicro 1.0 | simonton.micro.GFMicro | 1 | 35 | 320 | 2.0% | 12.2% ± 9.2 | 11.5% | 34.2% / 30.2% | 8.0% | 0 / 0 | T?/M? | 96% |
| bvh.frg.Friga 0.112dev | bvh.frg.Friga | 1 | 35 | 294 | 0.2% | 6.4% ± 9.3 | 9.0% | 30.3% / 27.0% | 1.1% | 0 / 0 | T?/M? | 99% |
| pkbots.BoyTDSurfer 1.0 | pkbots.BoyTDSurfer | 1 | 35 | 304 | 2.7% | 19.5% ± 6.7 | 12.0% | 21.6% / 36.5% | 11.0% | 0 / 0 | T?/M? | 84% |
| kawigi.mini.Coriantumr 1.1 | kawigi.mini.Coriantumr | 1 | 35 | 320 | 0.6% | 9.4% ± 7.3 | 9.9% | 28.1% / 25.7% | 1.4% | 0 / 0 | T?/M? | 96% |
| ahf.r2d2.R2d2 0.86 | ahf.r2d2.R2d2 | 1 | 35 | 286 | 2.2% | 13.2% ± 5.2 | 11.6% | 25.1% / 23.4% | 2.8% | 0 / 0 | T?/M? | 88% |
| florent.small.LittleAngel 1.8 | florent.small.LittleAngel | 1 | 35 | 332 | 4.1% | 11.8% ± 2.8 | 10.1% | 22.0% / 22.5% | 2.7% | 0 / 0 | T3/M? | 72% |
| theo.Tungsten 1.0a | theo.Tungsten | 1 | 35 | 286 | 2.5% | 16.3% ± 6.7 | 12.4% | 24.4% / 27.4% | 2.3% | 0 / 0 | T?/M? | 86% |
| mnt.AHEB 0.6a | mnt.AHEB | 1 | 35 | 266 | 1.9% | 12.9% ± 6.3 | 9.7% | 23.2% / 22.8% | 63.2% | 0 / 0 | T?/M? | 87% |
| DM.mega.Bezier 1.618fprrr | DM.mega.Bezier | 1 | 35 | 302 | 0.7% | 5.6% ± 4.1 | 25.0% | 53.1% / 52.5% | 16.7% | 0 / 0 | T?/M? | 98% |
| ph.mini.Archer 0.6.6 | ph.mini.Archer | 1 | 35 | 292 | 4.0% | 12.0% ± 4.3 | 9.9% | 24.6% / 23.5% | 7.8% | 0 / 0 | T?/M? | 82% |
| lucasslf.Wiggins 0.6 | lucasslf.Wiggins | 1 | 35 | 296 | 2.4% | 6.4% ± 3.2 | 11.1% | 29.5% / 27.5% | 6.4% | 0 / 0 | T?/M? | 94% |
| davidalves.net.DuelistMini 1.1 | davidalves.net.DuelistMini | 1 | 35 | 336 | 0.3% | 6.5% ± 7.8 | 8.6% | 26.5% / 25.5% | 20.0% | 0 / 0 | T?/M? | 98% |
| pez.mako.Mako 1.5 | pez.mako.Mako | 1 | 35 | 284 | 5.3% | 8.8% ± 2.1 | 11.1% | 25.3% / 24.6% | 3.7% | 0 / 0 | T3/M0 | 75% |
| wcsv.Engineer.Engineer 0.5.4 | wcsv.Engineer.Engineer | 1 | 35 | 324 | 5.1% | 10.5% ± 2.9 | 13.4% | 22.0% / 27.6% | 11.0% | 0 / 0 | T3/M? | 74% |
| rz.Aleph 0.34 | rz.Aleph | 1 | 35 | 266 | 1.8% | 14.8% ± 5.2 | 8.3% | 20.8% / 23.6% | 4.5% | 0 / 0 | T?/M? | 86% |
| ad.Quest 0.10 | ad.Quest | 1 | 35 | 266 | 3.3% | 13.6% ± 4.8 | 11.3% | 25.7% / 25.7% | 10.5% | 0 / 0 | T?/M? | 82% |
| nat.Hikari dev0001 | nat.Hikari | 1 | 35 | 280 | 2.7% | 14.6% ± 6.0 | 13.0% | 28.3% / 26.5% | 28.3% | 0 / 0 | T?/M? | 86% |
| davidalves.net.DuelistMicroMkII 1.1 | davidalves.net.DuelistMicroMkII | 1 | 35 | 356 | 2.8% | 14.0% ± 4.5 | 13.1% | 26.6% / 24.7% | 17.4% | 0 / 0 | T?/M? | 82% |
| jekl.DarkHallow .90.9 | jekl.DarkHallow | 1 | 35 | 296 | 2.2% | 8.8% ± 3.1 | 8.9% | 21.5% / 26.9% | 8.9% | 0 / 0 | T?/M2 | 81% |
| jcs.Decepticon 2.5.3 | jcs.Decepticon | 1 | 35 | 292 | 5.1% | 7.9% ± 2.0 | 11.2% | 24.8% / 22.3% | 5.9% | 0 / 0 | T3/M? | 84% |
| jekl.Jekyl .70 | jekl.Jekyl | 1 | 35 | 272 | 0.3% | 10.4% ± 12.5 | 8.8% | 21.2% / 19.4% | 2.0% | 0 / 0 | T?/M? | 98% |
| stelo.Randomness 1.1 | stelo.Randomness | 1 | 35 | 296 | 2.8% | 13.0% ± 5.6 | 13.2% | 24.7% / 20.5% | 8.0% | 0 / 0 | T?/M? | 88% |
| gh.GrubbmGrb 1.2.4 | gh.GrubbmGrb | 1 | 35 | 284 | 1.2% | 10.9% ± 4.4 | 8.9% | 25.4% / 23.9% | 4.2% | 0 / 0 | T?/M? | 94% |
| rcb.Vanessa03 0 | rcb.Vanessa03 | 1 | 35 | 280 | 1.9% | 19.3% ± 8.7 | 10.8% | 23.2% / 22.2% | 15.4% | 0 / 0 | T?/M? | 86% |
| arthord.KostyaTszyu Beta2 | arthord.KostyaTszyu | 1 | 35 | 312 | 1.1% | 39.4% ± 19.3 | 9.0% | 20.1% / 20.7% | 5.9% | 0 / 0 | T?/M? | 89% |
| robar.micro.Kirbyi 1.0 | robar.micro.Kirbyi | 1 | 35 | 304 | 7.6% | 9.2% ± 2.3 | 15.8% | 26.4% / 26.3% | 6.7% | 0 / 0 | T3/M? | 73% |
| metal.small.dna2.MCoolDNA 1.5 | metal.small.dna2.MCoolDNA | 1 | 35 | 332 | 2.0% | 14.9% ± 6.1 | 11.0% | 24.2% / 21.6% | 4.1% | 0 / 0 | T?/M? | 84% |
| tw.Exterminator 1.0 | tw.Exterminator | 1 | 35 | 292 | 1.0% | 6.6% ± 1.5 | 10.9% | 24.8% / 27.9% | 3.6% | 0 / 0 | T2/M2 | 88% |
| pe.mini.SandboxMini 1.2 | pe.mini.SandboxMini | 1 | 35 | 308 | 1.4% | 25.2% ± 14.0 | 10.5% | 21.8% / 21.6% | 17.3% | 0 / 0 | T?/M? | 89% |
| trm.Wrekt 1.1.6.f | trm.Wrekt | 1 | 35 | 276 | 0.2% | 76.0% ± 33.5 | 8.2% | 17.2% / 26.1% | 6.2% | 0 / 0 | T?/M? | 98% |
| ags.micro.Carpet 1.1 | ags.micro.Carpet | 1 | 35 | 296 | 2.4% | 11.8% ± 4.4 | 9.8% | 25.3% / 22.6% | 6.9% | 0 / 0 | T?/M? | 90% |
| pez.clean.Swiffer 0.2.9 | pez.clean.Swiffer | 1 | 35 | 304 | 1.1% | 19.4% ± 11.0 | 8.3% | 23.1% / 22.3% | 12.0% | 0 / 0 | T?/M? | 95% |
| zen.Lindada 0.2 | zen.Lindada | 1 | 35 | 276 | 0.8% | 20.1% ± 11.0 | 9.9% | 26.0% / 20.3% | 11.5% | 0 / 0 | T?/M? | 95% |
| vuen.Fractal 0.55 | vuen.Fractal | 1 | 35 | 282 | 0.8% | 8.3% ± 8.2 | 14.3% | 32.2% / 32.0% | 6.3% | 0 / 0 | T?/M? | 96% |
| nat.nano.Ocnirp 1.73 | nat.nano.Ocnirp | 1 | 35 | 294 | 2.8% | 26.2% ± 9.5 | 12.8% | 27.3% / 20.4% | 11.9% | 0 / 0 | T?/M? | 86% |
| syl.Centipede 0.5 | syl.Centipede | 1 | 35 | 284 | 0.9% | 10.3% ± 9.2 | 9.6% | 25.7% / 24.1% | 5.0% | 0 / 0 | T?/M? | 94% |
| myl.micro.NekoNinja 1.30 | myl.micro.NekoNinja | 1 | 35 | 310 | 0.5% | 5.4% ± 4.6 | 9.5% | 28.5% / 26.5% | 12.9% | 0 / 0 | T?/M? | 99% |
| stelo.SteloTestNano 1.0 | stelo.SteloTestNano | 1 | 35 | 308 | 1.3% | 20.9% ± 11.8 | 14.0% | 33.0% / 27.2% | 9.3% | 0 / 0 | T?/M? | 94% |
| casey.Flee 1.0 | casey.Flee | 1 | 35 | 272 | 1.8% | 14.1% ± 7.8 | 13.0% | 26.5% / 22.4% | 7.9% | 0 / 0 | T?/M? | 86% |
| amk.ChumbaWumba 0.3 | amk.ChumbaWumba | 1 | 35 | 292 | 0.9% | 7.4% ± 6.0 | 9.0% | 23.5% / 23.0% | 10.1% | 0 / 0 | T?/M? | 95% |
| metal.small.MCool 1.21 | metal.small.MCool | 1 | 35 | 302 | 0.4% | 12.4% ± 14.5 | 10.1% | 23.7% / 23.8% | 12.0% | 0 / 0 | T?/M? | 98% |
| tzu.TheArtOfWar 1.2 | tzu.TheArtOfWar | 1 | 35 | 292 | 1.2% | 23.6% ± 14.0 | 13.5% | 34.5% / 31.8% | 1.1% | 0 / 0 | T?/M? | 98% |
| lrem.magic.TormentedAngel Antiquitie | lrem.magic.TormentedAngel | 1 | 35 | 346 | 1.6% | 13.5% ± 6.7 | 10.9% | 27.7% / 24.7% | 6.8% | 0 / 0 | T?/M? | 85% |
| spinnercat.CopyKat 1.2.3 | spinnercat.CopyKat | 1 | 35 | 308 | 2.3% | 20.9% ± 8.4 | 20.6% | 47.9% / 47.1% | 79.8% | 0 / 0 | T?/M? | 86% |
| apv.NanoLauLectrikTheCannibal 1.1 | apv.NanoLauLectrikTheCannibal | 1 | 35 | 348 | 8.0% | 13.0% ± 4.4 | 43.2% | 49.1% / 40.8% | 86.0% | 0 / 0 | T?/M? | 82% |
| simonton.nano.WeekendObsession_S 1.7 | simonton.nano.WeekendObsession_S | 1 | 35 | 360 | 2.3% | 38.2% ± 13.1 | 12.7% | 31.0% / 23.3% | 14.9% | 0 / 0 | T?/M? | 87% |
| nat.nano.OcnirpPM 1.0 | nat.nano.OcnirpPM | 1 | 35 | 300 | 2.0% | 9.4% ± 4.2 | 11.3% | 27.3% / 24.1% | 11.0% | 0 / 0 | T?/M? | 90% |
| ds.OoV4 0.3b | ds.OoV4 | 1 | 35 | 262 | 0.7% | 7.2% ± 3.7 | 9.3% | 27.1% / 25.8% | 4.4% | 0 / 0 | T?/M? | 95% |
| suh.nano.RandomPM 1.02 | suh.nano.RandomPM | 1 | 35 | 302 | 1.7% | 44.5% ± 16.7 | 8.6% | 17.5% / 20.6% | 16.9% | 0 / 0 | T?/M? | 88% |
| ins.MobyNano 0.8 | ins.MobyNano | 1 | 35 | 280 | 2.4% | 24.4% ± 9.7 | 11.1% | 26.8% / 24.5% | 9.4% | 0 / 0 | T?/M? | 91% |
| starpkg.StarViewerZ 1.26 | starpkg.StarViewerZ | 1 | 35 | 310 | 0.6% | 9.1% ± 4.4 | 10.4% | 25.8% / 25.7% | 4.6% | 0 / 0 | T?/M? | 96% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.9sa vs hadur2.Hadur 3.9

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| jam.mini.Raiko 0.43 | 91.8% ± 1.9 | 71.0% ± 1.9 | +20.8 ± 2.5 |
| simonton.beta.LifelongObsession 0.5.1 | 92.7% ± 2.2 | 60.6% ± 2.0 | +32.0 ± 2.8 |
| rdt.AgentSmith.AgentSmith 0.5 | 90.3% ± 2.1 | 68.9% ± 2.8 | +21.4 ± 3.3 |
| bvh.mini.Freya 0.55 | 97.7% ± 0.9 | 81.9% ± 1.9 | +15.8 ± 1.6 |
| tide.pear.Pear 0.62.1 | 84.9% ± 0.9 | 64.5% ± 2.0 | +20.4 ± 2.5 |
| simonton.mini.WeeksOnEnd 1.10.4 | 88.6% ± 2.0 | 62.2% ± 1.9 | +26.3 ± 3.1 |
| Krabb.krabby.Krabby 1.18b | 94.2% ± 1.5 | 83.0% ± 2.0 | +11.2 ± 2.6 |
| jekl.mini.BlackPearl .91 | 93.6% ± 1.9 | 76.5% ± 2.3 | +17.0 ± 3.2 |
| kc.micro.Thorn 1.252 | 87.5% ± 3.3 | 74.0% ± 2.3 | +13.5 ± 4.7 |
| lucasslf.HariSeldon 0.2.1 | 95.7% ± 1.3 | 80.2% ± 2.1 | +15.5 ± 2.6 |
| wiki.mini.BlackDestroyer 0.9.0 | 89.3% ± 2.1 | 76.5% ± 2.3 | +12.9 ± 3.0 |
| stefw.Tigger 0.0.23 | 83.9% ± 2.2 | 71.7% ± 2.8 | +12.1 ± 3.5 |
| AIR.iRobot 1.0 | 96.4% ± 1.1 | 82.8% ± 2.3 | +13.6 ± 2.3 |
| wilson.Chameleon 0.91 | 96.6% ± 1.3 | 79.3% ± 3.1 | +17.3 ± 3.1 |
| simonton.micro.GFMicro 1.0 | 93.8% ± 0.9 | 82.6% ± 1.7 | +11.2 ± 2.3 |
| bvh.frg.Friga 0.112dev | 97.4% ± 1.0 | 87.1% ± 1.2 | +10.4 ± 1.3 |
| pkbots.BoyTDSurfer 1.0 | 87.2% ± 2.9 | 71.4% ± 1.6 | +15.8 ± 3.4 |
| kawigi.mini.Coriantumr 1.1 | 96.7% ± 1.1 | 89.1% ± 1.5 | +7.7 ± 1.7 |
| ahf.r2d2.R2d2 0.86 | 91.4% ± 1.5 | 82.1% ± 1.6 | +9.4 ± 2.2 |
| florent.small.LittleAngel 1.8 | 80.4% ± 3.0 | 75.9% ± 2.2 | +4.4 ± 4.1 |
| theo.Tungsten 1.0a | 87.1% ± 3.1 | 74.5% ± 1.8 | +12.6 ± 3.6 |
| mnt.AHEB 0.6a | 86.6% ± 2.5 | 78.3% ± 2.2 | +8.3 ± 3.3 |
| DM.mega.Bezier 1.618fprrr | 95.4% ± 1.4 | 77.6% ± 5.5 | +17.8 ± 5.2 |
| ph.mini.Archer 0.6.6 | 84.6% ± 3.6 | 68.6% ± 2.5 | +16.0 ± 5.3 |
| lucasslf.Wiggins 0.6 | 92.2% ± 3.7 | 77.3% ± 2.1 | +14.9 ± 4.2 |
| davidalves.net.DuelistMini 1.1 | 89.9% ± 4.4 | 82.8% ± 1.4 | +7.2 ± 4.0 |
| pez.mako.Mako 1.5 | 90.4% ± 3.3 | 79.5% ± 2.3 | +11.0 ± 4.2 |
| wcsv.Engineer.Engineer 0.5.4 | 78.2% ± 2.9 | 63.6% ± 3.2 | +14.6 ± 3.8 |
| rz.Aleph 0.34 | 85.3% ± 3.8 | 70.7% ± 2.5 | +14.6 ± 5.0 |
| ad.Quest 0.10 | 87.1% ± 3.0 | 79.9% ± 1.9 | +7.2 ± 4.0 |
| nat.Hikari dev0001 | 87.6% ± 1.7 | 81.6% ± 1.7 | +6.0 ± 2.3 |
| davidalves.net.DuelistMicroMkII 1.1 | 84.5% ± 2.2 | 75.7% ± 2.6 | +8.8 ± 3.4 |
| jekl.DarkHallow .90.9 | 87.1% ± 5.0 | 68.7% ± 3.0 | +18.4 ± 5.8 |
| jcs.Decepticon 2.5.3 | 80.4% ± 2.2 | 73.8% ± 2.0 | +6.6 ± 3.0 |
| jekl.Jekyl .70 | 91.0% ± 2.3 | 80.5% ± 1.5 | +10.5 ± 2.2 |
| stelo.Randomness 1.1 | 85.2% ± 2.6 | 82.8% ± 1.5 | +2.4 ± 2.7 |
| gh.GrubbmGrb 1.2.4 | 87.6% ± 4.4 | 84.5% ± 1.6 | +3.2 ± 4.9 |
| rcb.Vanessa03 0 | 86.7% ± 3.4 | 78.7% ± 2.1 | +7.9 ± 4.0 |
| arthord.KostyaTszyu Beta2 | 88.0% ± 2.4 | 77.9% ± 2.1 | +10.1 ± 2.5 |
| robar.micro.Kirbyi 1.0 | 85.3% ± 2.2 | 77.0% ± 1.3 | +8.3 ± 2.5 |
| metal.small.dna2.MCoolDNA 1.5 | 88.2% ± 1.9 | 74.7% ± 1.8 | +13.5 ± 3.0 |
| tw.Exterminator 1.0 | 89.5% ± 3.4 | 79.3% ± 2.5 | +10.3 ± 4.0 |
| pe.mini.SandboxMini 1.2 | 87.0% ± 3.3 | 79.3% ± 1.5 | +7.8 ± 3.3 |
| trm.Wrekt 1.1.6.f | 87.3% ± 5.3 | 69.9% ± 1.9 | +17.4 ± 5.7 |
| ags.micro.Carpet 1.1 | 87.2% ± 2.4 | 82.3% ± 2.1 | +5.0 ± 3.3 |
| pez.clean.Swiffer 0.2.9 | 88.8% ± 2.5 | 64.0% ± 9.8 | +24.8 ± 9.9 |
| zen.Lindada 0.2 | 94.9% ± 1.3 | 80.8% ± 1.6 | +14.1 ± 2.2 |
| vuen.Fractal 0.55 | 96.0% ± 1.2 | 83.6% ± 2.1 | +12.4 ± 2.1 |
| nat.nano.Ocnirp 1.73 | 82.3% ± 2.9 | 77.3% ± 1.7 | +5.0 ± 3.2 |
| syl.Centipede 0.5 | 96.9% ± 1.1 | 86.8% ± 1.2 | +10.1 ± 1.7 |
| myl.micro.NekoNinja 1.30 | 94.1% ± 2.5 | 85.9% ± 2.4 | +8.2 ± 1.9 |
| stelo.SteloTestNano 1.0 | 92.9% ± 1.6 | 86.1% ± 1.6 | +6.7 ± 2.4 |
| casey.Flee 1.0 | 88.9% ± 1.4 | 83.0% ± 1.7 | +5.9 ± 2.5 |
| amk.ChumbaWumba 0.3 | 89.7% ± 2.0 | 81.8% ± 2.5 | +7.9 ± 4.1 |
| metal.small.MCool 1.21 | 95.7% ± 1.0 | 90.6% ± 0.8 | +5.1 ± 1.5 |
| tzu.TheArtOfWar 1.2 | 96.1% ± 2.7 | 90.4% ± 0.8 | +5.7 ± 3.0 |
| lrem.magic.TormentedAngel Antiquitie | 84.9% ± 2.1 | 83.7% ± 1.4 | +1.2 ± 2.4 |
| spinnercat.CopyKat 1.2.3 | 90.6% ± 2.2 | 80.6% ± 1.8 | +10.0 ± 2.9 |
| apv.NanoLauLectrikTheCannibal 1.1 | 88.3% ± 2.1 | 86.2% ± 1.7 | +2.1 ± 2.2 |
| simonton.nano.WeekendObsession_S 1.7 | 86.6% ± 2.8 | 82.9% ± 1.8 | +3.7 ± 3.2 |
| nat.nano.OcnirpPM 1.0 | 81.6% ± 3.5 | 80.2% ± 1.4 | +1.4 ± 4.4 |
| ds.OoV4 0.3b | 93.2% ± 1.2 | 90.6% ± 1.1 | +2.6 ± 1.3 |
| suh.nano.RandomPM 1.02 | 83.7% ± 2.2 | 77.4% ± 1.8 | +6.3 ± 2.2 |
| ins.MobyNano 0.8 | 88.2% ± 1.6 | 83.0% ± 1.7 | +5.1 ± 2.1 |
| starpkg.StarViewerZ 1.26 | 95.2% ± 1.0 | 91.6% ± 1.1 | +3.6 ± 1.3 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| jam.mini.Raiko 0.43 | +20.8 ± 2.5 | +10.5 ± 2.3 | +10.5 ± 2.3 | -1.6 ± 3.6 |
| simonton.beta.LifelongObsession 0.5.1 | +32.0 ± 2.8 | +23.8 ± 2.9 | +23.8 ± 2.9 | +15.9 ± 4.1 |
| rdt.AgentSmith.AgentSmith 0.5 | +21.4 ± 3.3 | +12.5 ± 3.8 | +12.5 ± 3.7 | +0.8 ± 3.0 |
| bvh.mini.Freya 0.55 | +15.8 ± 1.6 | +5.2 ± 2.4 | +5.2 ± 2.4 | +17.1 ± 4.1 |
| tide.pear.Pear 0.62.1 | +20.4 ± 2.5 | +14.8 ± 3.7 | +14.8 ± 3.7 | +26.8 ± 1.8 |
| simonton.mini.WeeksOnEnd 1.10.4 | +26.3 ± 3.1 | +21.1 ± 3.9 | +21.1 ± 3.9 | +5.7 ± 3.8 |
| Krabb.krabby.Krabby 1.18b | +11.2 ± 2.6 | +4.3 ± 1.7 | +4.3 ± 1.7 | -2.3 ± 5.3 |
| jekl.mini.BlackPearl .91 | +17.0 ± 3.2 | +6.6 ± 3.5 | +6.6 ± 3.5 | +5.6 ± 5.4 |
| kc.micro.Thorn 1.252 | +13.5 ± 4.7 | +6.1 ± 3.9 | +6.1 ± 3.9 | -3.8 ± 5.8 |
| lucasslf.HariSeldon 0.2.1 | +15.5 ± 2.6 | +4.5 ± 2.2 | +4.5 ± 2.2 | +8.7 ± 6.9 |
| wiki.mini.BlackDestroyer 0.9.0 | +12.9 ± 3.0 | +5.4 ± 2.9 | +5.4 ± 2.9 | -5.3 ± 3.6 |
| stefw.Tigger 0.0.23 | +12.1 ± 3.5 | +8.6 ± 3.6 | +8.6 ± 3.6 | -13.7 ± 4.3 |
| AIR.iRobot 1.0 | +13.6 ± 2.3 | +2.7 ± 2.1 | +2.7 ± 2.1 | +7.1 ± 6.7 |
| wilson.Chameleon 0.91 | +17.3 ± 3.1 | +7.1 ± 3.5 | +7.1 ± 3.5 | +16.2 ± 4.8 |
| simonton.micro.GFMicro 1.0 | +11.2 ± 2.3 | +3.8 ± 2.1 | +3.8 ± 2.1 | +7.4 ± 3.4 |
| bvh.frg.Friga 0.112dev | +10.4 ± 1.3 | +2.1 ± 1.0 | +2.1 ± 1.0 | +2.5 ± 6.1 |
| pkbots.BoyTDSurfer 1.0 | +15.8 ± 3.4 | +12.3 ± 3.1 | +12.3 ± 3.1 | -17.9 ± 4.2 |
| kawigi.mini.Coriantumr 1.1 | +7.7 ± 1.7 | +1.1 ± 1.3 | +1.1 ± 1.3 | +8.1 ± 3.2 |
| ahf.r2d2.R2d2 0.86 | +9.4 ± 2.2 | +3.6 ± 1.8 | +3.6 ± 1.8 | -4.5 ± 3.3 |
| florent.small.LittleAngel 1.8 | +4.4 ± 4.1 | +3.4 ± 3.5 | +3.4 ± 3.5 | -16.8 ± 4.2 |
| theo.Tungsten 1.0a | +12.6 ± 3.6 | +5.7 ± 2.3 | +5.7 ± 2.3 | +4.7 ± 4.0 |
| mnt.AHEB 0.6a | +8.3 ± 3.3 | +4.3 ± 4.2 | +4.3 ± 4.2 | -18.3 ± 3.4 |
| DM.mega.Bezier 1.618fprrr | +17.8 ± 5.2 | +9.3 ± 3.8 | +9.3 ± 3.8 | +0.0 ± 14.6 |
| ph.mini.Archer 0.6.6 | +16.0 ± 5.3 | +9.8 ± 4.9 | +9.8 ± 4.9 | -21.9 ± 4.5 |
| lucasslf.Wiggins 0.6 | +14.9 ± 4.2 | +6.1 ± 2.6 | +6.1 ± 2.6 | +0.3 ± 7.3 |
| davidalves.net.DuelistMini 1.1 | +7.2 ± 4.0 | +0.7 ± 1.7 | +0.7 ± 1.7 | +3.9 ± 5.7 |
| pez.mako.Mako 1.5 | +11.0 ± 4.2 | +5.4 ± 2.5 | +5.4 ± 2.5 | -0.5 ± 5.2 |
| wcsv.Engineer.Engineer 0.5.4 | +14.6 ± 3.8 | +11.4 ± 4.7 | +11.4 ± 4.7 | +6.6 ± 2.7 |
| rz.Aleph 0.34 | +14.6 ± 5.0 | +9.1 ± 4.3 | +9.1 ± 4.3 | -8.6 ± 4.0 |
| ad.Quest 0.10 | +7.2 ± 4.0 | +0.2 ± 2.9 | +0.2 ± 2.9 | -5.1 ± 4.8 |
| nat.Hikari dev0001 | +6.0 ± 2.3 | +4.6 ± 2.4 | +4.6 ± 2.4 | -21.7 ± 3.3 |
| davidalves.net.DuelistMicroMkII 1.1 | +8.8 ± 3.4 | +4.6 ± 3.4 | +4.6 ± 3.4 | -0.5 ± 3.4 |
| jekl.DarkHallow .90.9 | +18.4 ± 5.8 | +10.9 ± 4.8 | +10.9 ± 4.8 | +2.1 ± 5.8 |
| jcs.Decepticon 2.5.3 | +6.6 ± 3.0 | +6.4 ± 2.8 | +6.4 ± 2.8 | -9.3 ± 3.7 |
| jekl.Jekyl .70 | +10.5 ± 2.2 | +2.5 ± 1.7 | +2.5 ± 1.7 | +0.8 ± 3.8 |
| stelo.Randomness 1.1 | +2.4 ± 2.7 | -1.1 ± 2.2 | -1.1 ± 2.2 | -9.1 ± 4.3 |
| gh.GrubbmGrb 1.2.4 | +3.2 ± 4.9 | -1.1 ± 3.3 | -1.1 ± 3.3 | -5.3 ± 8.4 |
| rcb.Vanessa03 0 | +7.9 ± 4.0 | +2.7 ± 3.3 | +2.7 ± 3.3 | -5.2 ± 5.4 |
| arthord.KostyaTszyu Beta2 | +10.1 ± 2.5 | +2.9 ± 2.0 | +2.9 ± 2.0 | -9.6 ± 4.6 |
| robar.micro.Kirbyi 1.0 | +8.3 ± 2.5 | +5.7 ± 3.0 | +5.7 ± 3.0 | -6.4 ± 3.0 |
| metal.small.dna2.MCoolDNA 1.5 | +13.5 ± 3.0 | +8.6 ± 3.1 | +8.6 ± 3.1 | -6.8 ± 4.0 |
| tw.Exterminator 1.0 | +10.3 ± 4.0 | +20.8 ± 4.7 | +20.7 ± 4.7 | -9.9 ± 4.7 |
| pe.mini.SandboxMini 1.2 | +7.8 ± 3.3 | +1.2 ± 3.2 | +1.3 ± 3.2 | -5.8 ± 3.2 |
| trm.Wrekt 1.1.6.f | +17.4 ± 5.7 | +13.6 ± 3.7 | +13.6 ± 3.7 | -1.6 ± 5.4 |
| ags.micro.Carpet 1.1 | +5.0 ± 3.3 | +1.4 ± 2.7 | +1.4 ± 2.7 | -19.6 ± 4.7 |
| pez.clean.Swiffer 0.2.9 | +24.8 ± 9.9 | +21.1 ± 7.7 | +21.1 ± 7.7 | +9.4 ± 11.1 |
| zen.Lindada 0.2 | +14.1 ± 2.2 | +4.3 ± 1.9 | +4.3 ± 1.9 | +6.2 ± 4.9 |
| vuen.Fractal 0.55 | +12.4 ± 2.1 | +2.3 ± 2.0 | +2.3 ± 2.0 | +17.4 ± 2.6 |
| nat.nano.Ocnirp 1.73 | +5.0 ± 3.2 | +1.3 ± 2.7 | +1.3 ± 2.7 | -14.7 ± 3.3 |
| syl.Centipede 0.5 | +10.1 ± 1.7 | +2.7 ± 1.0 | +2.7 ± 1.0 | +7.3 ± 4.8 |
| myl.micro.NekoNinja 1.30 | +8.2 ± 1.9 | +1.6 ± 1.5 | +1.6 ± 1.5 | +2.0 ± 5.2 |
| stelo.SteloTestNano 1.0 | +6.7 ± 2.4 | +1.3 ± 1.8 | +1.3 ± 1.8 | -1.5 ± 4.1 |
| casey.Flee 1.0 | +5.9 ± 2.5 | +3.4 ± 2.3 | +3.4 ± 2.3 | -12.4 ± 3.4 |
| amk.ChumbaWumba 0.3 | +7.9 ± 4.1 | +1.3 ± 2.7 | +1.3 ± 2.7 | -4.1 ± 6.5 |
| metal.small.MCool 1.21 | +5.1 ± 1.5 | -0.2 ± 0.9 | -0.2 ± 0.9 | -7.3 ± 4.2 |
| tzu.TheArtOfWar 1.2 | +5.7 ± 3.0 | +0.0 ± 1.1 | +0.0 ± 1.1 | +2.9 ± 4.5 |
| lrem.magic.TormentedAngel Antiquitie | +1.2 ± 2.4 | -1.1 ± 2.3 | -1.1 ± 2.3 | -27.4 ± 5.3 |
| spinnercat.CopyKat 1.2.3 | +10.0 ± 2.9 | +2.3 ± 2.2 | +2.3 ± 2.2 | +6.1 ± 4.9 |
| apv.NanoLauLectrikTheCannibal 1.1 | +2.1 ± 2.2 | -0.7 ± 2.3 | -0.7 ± 2.3 | +3.4 ± 2.4 |
| simonton.nano.WeekendObsession_S 1.7 | +3.7 ± 3.2 | +0.5 ± 2.3 | +0.5 ± 2.3 | -12.8 ± 4.2 |
| nat.nano.OcnirpPM 1.0 | +1.4 ± 4.4 | -3.2 ± 3.2 | -3.2 ± 3.2 | -15.1 ± 4.0 |
| ds.OoV4 0.3b | +2.6 ± 1.3 | +1.1 ± 2.1 | +1.1 ± 2.1 | -24.8 ± 4.2 |
| suh.nano.RandomPM 1.02 | +6.3 ± 2.2 | +3.9 ± 2.6 | +3.9 ± 2.6 | -26.7 ± 5.5 |
| ins.MobyNano 0.8 | +5.1 ± 2.1 | +1.6 ± 1.8 | +1.6 ± 1.8 | -10.4 ± 2.8 |
| starpkg.StarViewerZ 1.26 | +3.6 ± 1.3 | +1.1 ± 0.9 | +1.1 ± 0.9 | -17.0 ± 4.3 |
| All pairs | +10.9 ± 0.5 | +5.4 ± 0.5 | +5.4 ± 0.5 | -3.2 ± 0.9 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or, for a Hadur build, a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 16 | 7 | +20.8 ± 2.5 | +19.8 ± 3.6 |
| simonton.beta.LifelongObsession 0.5.1 | 16 | 12 | +32.0 ± 2.8 | +31.0 ± 3.5 |
| rdt.AgentSmith.AgentSmith 0.5 | 16 | 13 | +21.4 ± 3.3 | +21.9 ± 4.0 |
| bvh.mini.Freya 0.55 | 16 | 15 | +15.8 ± 1.6 | +15.8 ± 1.7 |
| tide.pear.Pear 0.62.1 | 16 | 12 | +20.4 ± 2.5 | +19.4 ± 2.8 |
| simonton.mini.WeeksOnEnd 1.10.4 | 16 | 10 | +26.3 ± 3.1 | +24.7 ± 4.4 |
| Krabb.krabby.Krabby 1.18b | 16 | 13 | +11.2 ± 2.6 | +11.8 ± 2.1 |
| jekl.mini.BlackPearl .91 | 16 | 13 | +17.0 ± 3.2 | +15.5 ± 3.2 |
| kc.micro.Thorn 1.252 | 16 | 13 | +13.5 ± 4.7 | +13.7 ± 5.9 |
| lucasslf.HariSeldon 0.2.1 | 16 | 16 | +15.5 ± 2.6 | +15.5 ± 2.6 |
| wiki.mini.BlackDestroyer 0.9.0 | 16 | 15 | +12.9 ± 3.0 | +12.8 ± 3.2 |
| stefw.Tigger 0.0.23 | 16 | 12 | +12.1 ± 3.5 | +11.3 ± 3.6 |
| AIR.iRobot 1.0 | 16 | 16 | +13.6 ± 2.3 | +13.6 ± 2.3 |
| wilson.Chameleon 0.91 | 16 | 14 | +17.3 ± 3.1 | +17.4 ± 3.6 |
| simonton.micro.GFMicro 1.0 | 16 | 12 | +11.2 ± 2.3 | +11.1 ± 2.9 |
| bvh.frg.Friga 0.112dev | 16 | 16 | +10.4 ± 1.3 | +10.4 ± 1.3 |
| pkbots.BoyTDSurfer 1.0 | 16 | 14 | +15.8 ± 3.4 | +17.0 ± 3.3 |
| kawigi.mini.Coriantumr 1.1 | 16 | 14 | +7.7 ± 1.7 | +7.7 ± 1.7 |
| ahf.r2d2.R2d2 0.86 | 16 | 15 | +9.4 ± 2.2 | +9.6 ± 2.3 |
| florent.small.LittleAngel 1.8 | 16 | 13 | +4.4 ± 4.1 | +4.0 ± 4.7 |
| theo.Tungsten 1.0a | 16 | 10 | +12.6 ± 3.6 | +13.3 ± 4.4 |
| mnt.AHEB 0.6a | 16 | 13 | +8.3 ± 3.3 | +7.1 ± 3.5 |
| DM.mega.Bezier 1.618fprrr | 16 | 13 | +17.8 ± 5.2 | +16.1 ± 5.6 |
| ph.mini.Archer 0.6.6 | 16 | 15 | +16.0 ± 5.3 | +15.4 ± 5.5 |
| lucasslf.Wiggins 0.6 | 16 | 15 | +14.9 ± 4.2 | +14.5 ± 4.4 |
| davidalves.net.DuelistMini 1.1 | 16 | 15 | +7.2 ± 4.0 | +7.8 ± 4.0 |
| pez.mako.Mako 1.5 | 16 | 15 | +11.0 ± 4.2 | +11.0 ± 4.5 |
| wcsv.Engineer.Engineer 0.5.4 | 16 | 11 | +14.6 ± 3.8 | +14.0 ± 5.1 |
| rz.Aleph 0.34 | 16 | 11 | +14.6 ± 5.0 | +12.9 ± 6.1 |
| ad.Quest 0.10 | 16 | 13 | +7.2 ± 4.0 | +7.5 ± 4.5 |
| nat.Hikari dev0001 | 16 | 13 | +6.0 ± 2.3 | +6.8 ± 2.6 |
| davidalves.net.DuelistMicroMkII 1.1 | 16 | 12 | +8.8 ± 3.4 | +10.1 ± 3.5 |
| jekl.DarkHallow .90.9 | 16 | 12 | +18.4 ± 5.8 | +19.0 ± 7.0 |
| jcs.Decepticon 2.5.3 | 16 | 14 | +6.6 ± 3.0 | +6.9 ± 3.3 |
| jekl.Jekyl .70 | 16 | 14 | +10.5 ± 2.2 | +10.2 ± 2.5 |
| stelo.Randomness 1.1 | 16 | 12 | +2.4 ± 2.7 | +2.3 ± 3.3 |
| gh.GrubbmGrb 1.2.4 | 16 | 11 | +3.2 ± 4.9 | +1.8 ± 6.7 |
| rcb.Vanessa03 0 | 16 | 13 | +7.9 ± 4.0 | +6.2 ± 4.3 |
| arthord.KostyaTszyu Beta2 | 16 | 15 | +10.1 ± 2.5 | +10.3 ± 2.6 |
| robar.micro.Kirbyi 1.0 | 16 | 13 | +8.3 ± 2.5 | +9.6 ± 2.4 |
| metal.small.dna2.MCoolDNA 1.5 | 16 | 13 | +13.5 ± 3.0 | +13.0 ± 2.4 |
| tw.Exterminator 1.0 | 16 | 11 | +10.3 ± 4.0 | +12.1 ± 3.6 |
| pe.mini.SandboxMini 1.2 | 16 | 15 | +7.8 ± 3.3 | +8.2 ± 3.4 |
| trm.Wrekt 1.1.6.f | 16 | 16 | +17.4 ± 5.7 | +17.4 ± 5.7 |
| ags.micro.Carpet 1.1 | 16 | 13 | +5.0 ± 3.3 | +6.0 ± 3.2 |
| pez.clean.Swiffer 0.2.9 | 16 | 6 | +24.8 ± 9.9 | +17.1 ± 18.0 |
| zen.Lindada 0.2 | 16 | 16 | +14.1 ± 2.2 | +14.1 ± 2.2 |
| vuen.Fractal 0.55 | 16 | 13 | +12.4 ± 2.1 | +12.1 ± 2.7 |
| nat.nano.Ocnirp 1.73 | 16 | 16 | +5.0 ± 3.2 | +5.0 ± 3.2 |
| syl.Centipede 0.5 | 16 | 14 | +10.1 ± 1.7 | +9.4 ± 1.6 |
| myl.micro.NekoNinja 1.30 | 16 | 16 | +8.2 ± 1.9 | +8.2 ± 1.9 |
| stelo.SteloTestNano 1.0 | 16 | 14 | +6.7 ± 2.4 | +6.8 ± 2.8 |
| casey.Flee 1.0 | 16 | 13 | +5.9 ± 2.5 | +7.2 ± 2.1 |
| amk.ChumbaWumba 0.3 | 16 | 12 | +7.9 ± 4.1 | +7.6 ± 5.1 |
| metal.small.MCool 1.21 | 16 | 16 | +5.1 ± 1.5 | +5.1 ± 1.5 |
| tzu.TheArtOfWar 1.2 | 16 | 14 | +5.7 ± 3.0 | +5.3 ± 3.4 |
| lrem.magic.TormentedAngel Antiquitie | 16 | 13 | +1.2 ± 2.4 | +1.5 ± 2.9 |
| spinnercat.CopyKat 1.2.3 | 16 | 12 | +10.0 ± 2.9 | +9.0 ± 3.5 |
| apv.NanoLauLectrikTheCannibal 1.1 | 16 | 13 | +2.1 ± 2.2 | +2.1 ± 2.6 |
| simonton.nano.WeekendObsession_S 1.7 | 16 | 15 | +3.7 ± 3.2 | +3.1 ± 3.2 |
| nat.nano.OcnirpPM 1.0 | 16 | 12 | +1.4 ± 4.4 | +2.4 ± 4.8 |
| ds.OoV4 0.3b | 16 | 14 | +2.6 ± 1.3 | +2.1 ± 1.1 |
| suh.nano.RandomPM 1.02 | 16 | 14 | +6.3 ± 2.2 | +6.7 ± 2.4 |
| ins.MobyNano 0.8 | 16 | 15 | +5.1 ± 2.1 | +5.3 ± 2.2 |
| starpkg.StarViewerZ 1.26 | 16 | 16 | +3.6 ± 1.3 | +3.6 ± 1.3 |
| All pairs | 1040 | 867 | +10.9 ± 0.5 | +10.5 ± 0.5 |

# Bench: hadur2.Hadur 3.9sa baseline (hadur2.Hadur 3.9) (cold)

35 rounds x 16 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 13018 over 1040 battles (12.5 per battle, most in one battle 79). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | shield-confirm | 71.0% ± 1.9 | 87.7% ± 2.1 | 53.2% ± 2.1 | 491 / 560 | 11.6% ± 0.3 | 8.7% ± 3.2 | 285 | 0 | 0.97 / 88.5 |
| simonton.beta.LifelongObsession 0.5.1 | shield-confirm | 60.6% ± 2.0 | 74.8% ± 2.4 | 45.8% ± 2.0 | 419 / 560 | 10.2% ± 0.3 | 8.6% ± 0.3 | 290 | 0 | 1.23 / 67.8 |
| rdt.AgentSmith.AgentSmith 0.5 | shield-confirm | 68.9% ± 2.8 | 84.8% ± 3.8 | 52.7% ± 2.3 | 475 / 560 | 11.3% ± 0.4 | 6.9% ± 0.2 | 210 | 0 | 1.41 / 142.0 |
| bvh.mini.Freya 0.55 | shield-confirm | 81.9% ± 1.9 | 94.6% ± 2.5 | 68.2% ± 1.6 | 530 / 560 | 15.1% ± 0.6 | 5.2% ± 0.3 | 184 | 0 | 0.86 / 16.2 |
| tide.pear.Pear 0.62.1 | shield-confirm | 64.5% ± 2.0 | 82.1% ± 2.9 | 45.3% ± 1.6 | 460 / 560 | 10.5% ± 0.3 | 6.8% ± 0.3 | 174 | 0 | 1.00 / 138.9 |
| simonton.mini.WeeksOnEnd 1.10.4 | shield-confirm | 62.2% ± 1.9 | 76.3% ± 3.0 | 47.0% ± 0.9 | 427 / 560 | 10.4% ± 0.2 | 8.4% ± 0.2 | 226 | 0 | 1.33 / 82.3 |
| Krabb.krabby.Krabby 1.18b | shield-confirm | 83.0% ± 2.0 | 95.2% ± 1.6 | 69.3% ± 2.5 | 533 / 560 | 14.8% ± 0.9 | 5.0% ± 0.4 | 174 | 0 | 0.79 / 40.0 |
| jekl.mini.BlackPearl .91 | shield-confirm | 76.5% ± 2.3 | 92.0% ± 3.1 | 60.6% ± 1.9 | 515 / 560 | 12.8% ± 0.4 | 7.4% ± 1.9 | 182 | 0 | 0.95 / 20.7 |
| kc.micro.Thorn 1.252 | shield-confirm | 74.0% ± 2.3 | 89.5% ± 2.9 | 58.4% ± 1.8 | 501 / 560 | 13.3% ± 0.4 | 6.6% ± 0.4 | 182 | 0 | 0.89 / 108.5 |
| lucasslf.HariSeldon 0.2.1 | shield-confirm | 80.2% ± 2.1 | 95.2% ± 2.2 | 64.8% ± 2.2 | 533 / 560 | 12.8% ± 0.4 | 6.6% ± 0.4 | 170 | 0 | 1.49 / 21.0 |
| wiki.mini.BlackDestroyer 0.9.0 | shield-confirm | 76.5% ± 2.3 | 91.8% ± 2.4 | 59.8% ± 2.2 | 514 / 560 | 12.1% ± 0.5 | 6.1% ± 0.3 | 181 | 0 | 0.96 / 15.2 |
| stefw.Tigger 0.0.23 | shield-confirm | 71.7% ± 2.8 | 87.0% ± 3.5 | 56.2% ± 2.1 | 487 / 560 | 12.4% ± 0.4 | 6.7% ± 0.3 | 169 | 0 | 1.01 / 14.7 |
| AIR.iRobot 1.0 | shield-confirm | 82.8% ± 2.3 | 97.0% ± 2.2 | 64.2% ± 2.8 | 543 / 560 | 11.4% ± 0.6 | 4.6% ± 0.3 | 184 | 0 | 0.87 / 16.5 |
| wilson.Chameleon 0.91 | shield-confirm | 79.3% ± 3.1 | 92.0% ± 3.7 | 66.2% ± 2.5 | 515 / 560 | 14.5% ± 0.5 | 6.3% ± 0.5 | 187 | 0 | 1.21 / 188.0 |
| simonton.micro.GFMicro 1.0 | shield-confirm | 82.6% ± 1.7 | 95.9% ± 2.0 | 68.1% ± 2.0 | 537 / 560 | 14.9% ± 0.5 | 6.2% ± 0.3 | 189 | 0 | 1.03 / 15.9 |
| bvh.frg.Friga 0.112dev | shield-confirm | 87.1% ± 1.2 | 97.7% ± 1.1 | 76.2% ± 1.4 | 547 / 560 | 17.9% ± 0.4 | 5.2% ± 0.3 | 178 | 0 | 0.87 / 15.5 |
| pkbots.BoyTDSurfer 1.0 | shield-confirm | 71.4% ± 1.6 | 84.8% ± 2.1 | 59.1% ± 1.5 | 475 / 560 | 14.5% ± 0.4 | 8.1% ± 0.3 | 243 | 0 | 1.01 / 90.1 |
| kawigi.mini.Coriantumr 1.1 | shield-confirm | 89.1% ± 1.5 | 98.4% ± 1.1 | 78.6% ± 1.8 | 551 / 560 | 15.6% ± 0.4 | 4.0% ± 0.5 | 194 | 0 | 0.79 / 17.8 |
| ahf.r2d2.R2d2 0.86 | shield-confirm | 82.1% ± 1.6 | 95.5% ± 1.8 | 68.2% ± 1.7 | 535 / 560 | 15.6% ± 0.7 | 6.3% ± 0.3 | 193 | 0 | 0.84 / 134.7 |
| florent.small.LittleAngel 1.8 | shield-confirm | 75.9% ± 2.2 | 91.1% ± 2.5 | 58.6% ± 2.3 | 510 / 560 | 11.5% ± 0.4 | 5.7% ± 0.3 | 191 | 0 | 0.97 / 58.0 |
| theo.Tungsten 1.0a | shield-confirm | 74.5% ± 1.8 | 91.1% ± 2.0 | 56.3% ± 2.3 | 510 / 560 | 11.3% ± 0.3 | 6.1% ± 0.3 | 158 | 0 | 1.01 / 15.8 |
| mnt.AHEB 0.6a | shield-confirm | 78.3% ± 2.2 | 90.4% ± 3.6 | 66.5% ± 1.4 | 506 / 560 | 17.1% ± 0.9 | 6.9% ± 0.3 | 176 | 0 | 0.89 / 346.2 |
| DM.mega.Bezier 1.618fprrr | shield-confirm | 77.6% ± 5.5 | 90.0% ± 3.7 | 64.2% ± 8.3 | 504 / 560 | 19.1% ± 7.5 | 6.2% ± 1.2 | 341 | 0 | 3.57 / 107.8 |
| ph.mini.Archer 0.6.6 | shield-confirm | 68.6% ± 2.5 | 84.5% ± 3.6 | 53.0% ± 1.8 | 473 / 560 | 11.9% ± 0.4 | 7.5% ± 0.3 | 184 | 0 | 0.96 / 29.6 |
| lucasslf.Wiggins 0.6 | shield-confirm | 77.3% ± 2.1 | 93.2% ± 2.0 | 60.6% ± 2.2 | 522 / 560 | 11.9% ± 0.3 | 6.7% ± 0.3 | 208 | 0 | 1.08 / 24.3 |
| davidalves.net.DuelistMini 1.1 | shield-confirm | 82.8% ± 1.4 | 97.5% ± 1.3 | 65.4% ± 2.3 | 546 / 560 | 13.0% ± 0.5 | 4.7% ± 0.3 | 208 | 0 | 0.91 / 18.0 |
| pez.mako.Mako 1.5 | shield-confirm | 79.5% ± 2.3 | 93.0% ± 2.4 | 62.9% ± 2.1 | 521 / 560 | 12.2% ± 0.5 | 4.5% ± 0.3 | 198 | 0 | 0.90 / 25.1 |
| wcsv.Engineer.Engineer 0.5.4 | shield-confirm | 63.6% ± 3.2 | 80.4% ± 4.3 | 46.3% ± 2.5 | 450 / 560 | 10.5% ± 0.3 | 7.4% ± 0.3 | 193 | 0 | 1.04 / 26.3 |
| rz.Aleph 0.34 | shield-confirm | 70.7% ± 2.5 | 86.8% ± 3.4 | 53.7% ± 1.6 | 486 / 560 | 11.3% ± 0.2 | 6.5% ± 0.4 | 170 | 0 | 1.03 / 65.2 |
| ad.Quest 0.10 | shield-confirm | 79.9% ± 1.9 | 95.9% ± 1.8 | 62.6% ± 2.1 | 537 / 560 | 13.8% ± 0.7 | 5.3% ± 0.4 | 188 | 0 | 0.92 / 134.5 |
| nat.Hikari dev0001 | shield-confirm | 81.6% ± 1.7 | 94.1% ± 2.5 | 69.1% ± 1.6 | 527 / 560 | 15.6% ± 0.4 | 6.3% ± 0.4 | 188 | 0 | 0.91 / 106.8 |
| davidalves.net.DuelistMicroMkII 1.1 | shield-confirm | 75.7% ± 2.6 | 90.5% ± 3.3 | 61.1% ± 2.0 | 507 / 560 | 14.4% ± 0.5 | 6.7% ± 0.4 | 213 | 0 | 0.90 / 27.0 |
| jekl.DarkHallow .90.9 | shield-confirm | 68.7% ± 3.0 | 84.2% ± 3.8 | 53.0% ± 2.3 | 472 / 560 | 11.4% ± 0.2 | 6.8% ± 0.2 | 184 | 0 | 1.05 / 91.0 |
| jcs.Decepticon 2.5.3 | shield-confirm | 73.8% ± 2.0 | 89.1% ± 2.4 | 57.3% ± 2.4 | 499 / 560 | 11.6% ± 0.4 | 6.3% ± 0.2 | 168 | 0 | 1.22 / 82.7 |
| jekl.Jekyl .70 | shield-confirm | 80.5% ± 1.5 | 95.0% ± 1.4 | 65.8% ± 1.8 | 532 / 560 | 14.9% ± 0.6 | 6.5% ± 0.5 | 199 | 0 | 0.91 / 124.2 |
| stelo.Randomness 1.1 | shield-confirm | 82.8% ± 1.5 | 95.7% ± 1.8 | 69.5% ± 1.7 | 536 / 560 | 16.4% ± 0.8 | 6.3% ± 0.4 | 191 | 0 | 0.90 / 80.7 |
| gh.GrubbmGrb 1.2.4 | shield-confirm | 84.5% ± 1.6 | 95.9% ± 1.5 | 72.4% ± 1.6 | 537 / 560 | 14.8% ± 0.9 | 6.4% ± 0.7 | 199 | 0 | 0.93 / 140.8 |
| rcb.Vanessa03 0 | shield-confirm | 78.7% ± 2.1 | 92.0% ± 2.7 | 65.3% ± 1.8 | 515 / 560 | 16.4% ± 0.7 | 6.3% ± 1.6 | 170 | 0 | 0.86 / 209.6 |
| arthord.KostyaTszyu Beta2 | shield-confirm | 77.9% ± 2.1 | 93.6% ± 1.6 | 59.7% ± 3.2 | 524 / 560 | 12.0% ± 0.7 | 5.3% ± 0.3 | 205 | 0 | 0.93 / 89.8 |
| robar.micro.Kirbyi 1.0 | shield-confirm | 77.0% ± 1.3 | 90.0% ± 2.2 | 65.6% ± 1.2 | 504 / 560 | 19.0% ± 1.0 | 9.3% ± 0.6 | 191 | 0 | 0.97 / 181.4 |
| metal.small.dna2.MCoolDNA 1.5 | shield-confirm | 74.7% ± 1.8 | 88.0% ± 2.6 | 62.2% ± 1.4 | 493 / 560 | 14.8% ± 0.5 | 7.3% ± 0.5 | 177 | 0 | 0.94 / 19.3 |
| tw.Exterminator 1.0 | shield-confirm | 79.3% ± 2.5 | 72.3% ± 3.9 | 83.2% ± 1.4 | 405 / 560 | 15.6% ± 0.4 | 9.4% ± 0.2 | 456 | 0 | 1.24 / 58.8 |
| pe.mini.SandboxMini 1.2 | shield-confirm | 79.3% ± 1.5 | 94.6% ± 2.2 | 64.1% ± 1.6 | 530 / 560 | 16.8% ± 0.4 | 6.4% ± 0.3 | 169 | 0 | 0.90 / 18.1 |
| trm.Wrekt 1.1.6.f | shield-confirm | 69.9% ± 1.9 | 82.0% ± 2.6 | 58.1% ± 1.3 | 459 / 560 | 12.5% ± 0.4 | 7.2% ± 0.3 | 236 | 0 | 1.88 / 49.6 |
| ags.micro.Carpet 1.1 | shield-confirm | 82.3% ± 2.1 | 95.2% ± 2.1 | 68.3% ± 2.6 | 533 / 560 | 13.4% ± 0.6 | 5.9% ± 0.6 | 190 | 0 | 1.29 / 29.7 |
| pez.clean.Swiffer 0.2.9 | shield-confirm | 64.0% ± 9.8 | 75.2% ± 7.9 | 54.8% ± 11.1 | 421 / 560 | 19.1% ± 3.8 | 8.6% ± 0.7 | 182 | 0 | 0.84 / 112.7 |
| zen.Lindada 0.2 | shield-confirm | 80.8% ± 1.6 | 95.0% ± 1.8 | 65.3% ± 1.6 | 532 / 560 | 14.2% ± 0.5 | 4.9% ± 0.3 | 209 | 0 | 0.88 / 151.9 |
| vuen.Fractal 0.55 | shield-confirm | 83.6% ± 2.1 | 96.8% ± 1.9 | 70.5% ± 2.5 | 542 / 560 | 17.4% ± 0.6 | 5.7% ± 0.5 | 178 | 0 | 0.89 / 173.9 |
| nat.nano.Ocnirp 1.73 | shield-confirm | 77.3% ± 1.7 | 93.6% ± 1.4 | 59.2% ± 2.3 | 524 / 560 | 13.8% ± 0.7 | 6.3% ± 0.4 | 196 | 0 | 0.91 / 112.7 |
| syl.Centipede 0.5 | shield-confirm | 86.8% ± 1.2 | 96.8% ± 0.8 | 74.5% ± 2.2 | 542 / 560 | 14.9% ± 0.7 | 3.6% ± 0.3 | 171 | 0 | 0.84 / 122.4 |
| myl.micro.NekoNinja 1.30 | shield-confirm | 85.9% ± 2.4 | 97.5% ± 2.0 | 72.9% ± 2.8 | 546 / 560 | 14.2% ± 0.7 | 4.7% ± 0.5 | 196 | 0 | 0.93 / 15.5 |
| stelo.SteloTestNano 1.0 | shield-confirm | 86.1% ± 1.6 | 97.0% ± 1.4 | 75.1% ± 2.2 | 543 / 560 | 20.1% ± 0.5 | 5.4% ± 0.5 | 204 | 0 | 0.74 / 146.1 |
| casey.Flee 1.0 | shield-confirm | 83.0% ± 1.7 | 95.5% ± 1.7 | 68.4% ± 2.2 | 535 / 560 | 14.9% ± 0.7 | 5.2% ± 0.5 | 194 | 0 | 0.85 / 14.9 |
| amk.ChumbaWumba 0.3 | shield-confirm | 81.8% ± 2.5 | 96.3% ± 2.1 | 63.5% ± 2.8 | 539 / 560 | 12.5% ± 0.6 | 4.3% ± 0.5 | 194 | 0 | 0.90 / 198.9 |
| metal.small.MCool 1.21 | shield-confirm | 90.6% ± 0.8 | 99.6% ± 0.5 | 77.5% ± 1.7 | 558 / 560 | 12.9% ± 0.6 | 3.1% ± 0.3 | 173 | 0 | 0.79 / 195.0 |
| tzu.TheArtOfWar 1.2 | shield-confirm | 90.4% ± 0.8 | 99.3% ± 0.7 | 82.6% ± 1.1 | 556 / 560 | 24.8% ± 0.8 | 8.0% ± 0.6 | 229 | 0 in 1 round(s) | 0.78 / 58.1 |
| lrem.magic.TormentedAngel Antiquitie | shield-confirm | 83.7% ± 1.4 | 97.1% ± 1.8 | 69.4% ± 1.4 | 544 / 560 | 15.1% ± 0.5 | 5.6% ± 0.2 | 212 | 0 | 0.93 / 29.5 |
| spinnercat.CopyKat 1.2.3 | shield-confirm | 80.6% ± 1.8 | 93.6% ± 2.0 | 67.5% ± 1.8 | 524 / 560 | 20.1% ± 0.8 | 8.1% ± 2.0 | 186 | 0 | 0.84 / 58.3 |
| apv.NanoLauLectrikTheCannibal 1.1 | shield-confirm | 86.2% ± 1.7 | 97.5% ± 1.7 | 75.0% ± 1.9 | 546 / 560 | 21.9% ± 0.9 | 7.1% ± 1.5 | 184 | 0 | 0.81 / 47.5 |
| simonton.nano.WeekendObsession_S 1.7 | shield-confirm | 82.9% ± 1.8 | 95.4% ± 1.7 | 69.9% ± 1.9 | 534 / 560 | 22.2% ± 0.7 | 6.3% ± 0.5 | 194 | 0 | 0.85 / 94.1 |
| nat.nano.OcnirpPM 1.0 | shield-confirm | 80.2% ± 1.4 | 97.1% ± 1.5 | 60.7% ± 2.0 | 544 / 560 | 14.2% ± 0.8 | 6.3% ± 0.5 | 220 | 0 | 0.92 / 87.0 |
| ds.OoV4 0.3b | shield-confirm | 90.6% ± 1.1 | 98.0% ± 1.9 | 83.5% ± 0.8 | 549 / 560 | 17.4% ± 0.4 | 6.6% ± 0.3 | 217 | 0 | 1.00 / 33.4 |
| suh.nano.RandomPM 1.02 | shield-confirm | 77.4% ± 1.8 | 92.0% ± 2.4 | 62.5% ± 1.4 | 515 / 560 | 15.0% ± 0.5 | 7.4% ± 0.4 | 180 | 0 | 1.02 / 142.1 |
| ins.MobyNano 0.8 | shield-confirm | 83.0% ± 1.7 | 96.8% ± 1.5 | 67.3% ± 2.3 | 542 / 560 | 16.1% ± 1.0 | 5.5% ± 0.4 | 178 | 0 | 0.88 / 109.8 |
| starpkg.StarViewerZ 1.26 | shield-confirm | 91.6% ± 1.1 | 98.8% ± 1.1 | 84.2% ± 1.4 | 553 / 560 | 16.5% ± 0.6 | 4.3% ± 0.5 | 175 | 0 | 0.85 / 27.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 16 | 1299 | 16.6% | 76.3% | 0.0% | 7.1% | 847 |
| simonton.beta.LifelongObsession 0.5.1 | 16 | 1759 | 25.0% | 65.4% | 0.0% | 9.6% | 1260 |
| rdt.AgentSmith.AgentSmith 0.5 | 16 | 1427 | 18.6% | 73.5% | 0.0% | 7.9% | 836 |
| bvh.mini.Freya 0.55 | 16 | 836 | 11.2% | 83.7% | 0.0% | 5.1% | 609 |
| tide.pear.Pear 0.62.1 | 16 | 1539 | 20.3% | 71.6% | 0.0% | 8.1% | 961 |
| simonton.mini.WeeksOnEnd 1.10.4 | 16 | 1660 | 25.0% | 65.7% | 0.0% | 9.2% | 1220 |
| Krabb.krabby.Krabby 1.18b | 16 | 772 | 10.9% | 84.4% | 0.0% | 4.6% | 632 |
| jekl.mini.BlackPearl .91 | 16 | 1095 | 12.8% | 81.7% | 0.0% | 5.5% | 736 |
| kc.micro.Thorn 1.252 | 16 | 1220 | 15.1% | 78.9% | 0.0% | 6.0% | 837 |
| lucasslf.HariSeldon 0.2.1 | 16 | 934 | 9.0% | 87.1% | 0.0% | 3.9% | 891 |
| wiki.mini.BlackDestroyer 0.9.0 | 16 | 1064 | 13.5% | 80.9% | 0.0% | 5.6% | 821 |
| stefw.Tigger 0.0.23 | 16 | 1317 | 17.3% | 75.4% | 0.0% | 7.3% | 765 |
| AIR.iRobot 1.0 | 16 | 709 | 7.5% | 89.6% | 0.0% | 2.9% | 761 |
| wilson.Chameleon 0.91 | 16 | 988 | 14.2% | 79.7% | 0.0% | 6.1% | 717 |
| simonton.micro.GFMicro 1.0 | 16 | 801 | 9.0% | 87.5% | 0.0% | 3.5% | 894 |
| bvh.frg.Friga 0.112dev | 16 | 629 | 6.5% | 90.7% | 0.0% | 2.8% | 563 |
| pkbots.BoyTDSurfer 1.0 | 16 | 1435 | 18.5% | 73.4% | 0.0% | 8.1% | 797 |
| kawigi.mini.Coriantumr 1.1 | 16 | 506 | 5.6% | 92.2% | 0.0% | 2.2% | 649 |
| ahf.r2d2.R2d2 0.86 | 16 | 858 | 9.1% | 87.3% | 0.1% | 3.5% | 660 |
| florent.small.LittleAngel 1.8 | 16 | 1050 | 14.9% | 79.2% | 0.0% | 6.0% | 857 |
| theo.Tungsten 1.0a | 16 | 1128 | 13.8% | 80.4% | 0.0% | 5.7% | 845 |
| mnt.AHEB 0.6a | 16 | 1077 | 15.7% | 77.9% | 0.0% | 6.5% | 657 |
| DM.mega.Bezier 1.618fprrr | 16 | 1017 | 17.2% | 76.3% | 0.0% | 6.5% | 1073 |
| ph.mini.Archer 0.6.6 | 16 | 1473 | 18.5% | 73.7% | 0.0% | 7.9% | 842 |
| lucasslf.Wiggins 0.6 | 16 | 1050 | 11.3% | 83.8% | 0.0% | 4.9% | 958 |
| davidalves.net.DuelistMini 1.1 | 16 | 753 | 5.8% | 91.7% | 0.0% | 2.5% | 659 |
| pez.mako.Mako 1.5 | 16 | 870 | 14.0% | 79.7% | 0.0% | 6.3% | 639 |
| wcsv.Engineer.Engineer 0.5.4 | 16 | 1636 | 21.0% | 70.3% | 0.0% | 8.7% | 894 |
| rz.Aleph 0.34 | 16 | 1328 | 17.4% | 75.2% | 0.0% | 7.4% | 830 |
| ad.Quest 0.10 | 16 | 920 | 7.8% | 88.4% | 0.0% | 3.8% | 723 |
| nat.Hikari dev0001 | 16 | 895 | 11.5% | 83.8% | 0.0% | 4.7% | 653 |
| davidalves.net.DuelistMicroMkII 1.1 | 16 | 1153 | 14.4% | 79.1% | 0.0% | 6.5% | 697 |
| jekl.DarkHallow .90.9 | 16 | 1427 | 19.3% | 72.7% | 0.0% | 8.0% | 953 |
| jcs.Decepticon 2.5.3 | 16 | 1183 | 16.1% | 77.3% | 0.0% | 6.6% | 871 |
| jekl.Jekyl .70 | 16 | 933 | 9.4% | 86.5% | 0.2% | 4.0% | 732 |
| stelo.Randomness 1.1 | 16 | 823 | 9.1% | 87.1% | 0.0% | 3.8% | 718 |
| gh.GrubbmGrb 1.2.4 | 16 | 739 | 9.7% | 86.1% | 0.0% | 4.1% | 751 |
| rcb.Vanessa03 0 | 16 | 1004 | 14.0% | 79.5% | 0.0% | 6.4% | 559 |
| arthord.KostyaTszyu Beta2 | 16 | 962 | 11.7% | 83.5% | 0.0% | 4.9% | 726 |
| robar.micro.Kirbyi 1.0 | 16 | 1227 | 14.3% | 79.5% | 0.0% | 6.3% | 576 |
| metal.small.dna2.MCoolDNA 1.5 | 16 | 1253 | 16.7% | 75.7% | 0.0% | 7.6% | 700 |
| tw.Exterminator 1.0 | 16 | 1071 | 45.2% | 41.8% | 0.0% | 13.0% | 1643 |
| pe.mini.SandboxMini 1.2 | 16 | 1006 | 9.3% | 86.6% | 0.0% | 4.0% | 569 |
| trm.Wrekt 1.1.6.f | 16 | 1443 | 21.9% | 68.9% | 0.0% | 9.2% | 845 |
| ags.micro.Carpet 1.1 | 16 | 824 | 10.2% | 85.5% | 0.0% | 4.2% | 840 |
| pez.clean.Swiffer 0.2.9 | 16 | 1863 | 23.3% | 65.1% | 0.0% | 11.6% | 732 |
| zen.Lindada 0.2 | 16 | 871 | 10.0% | 85.4% | 0.0% | 4.5% | 634 |
| vuen.Fractal 0.55 | 16 | 798 | 7.0% | 89.7% | 0.0% | 3.2% | 565 |
| nat.nano.Ocnirp 1.73 | 16 | 1009 | 11.1% | 83.7% | 0.0% | 5.1% | 602 |
| syl.Centipede 0.5 | 16 | 566 | 9.9% | 85.5% | 0.0% | 4.6% | 565 |
| myl.micro.NekoNinja 1.30 | 16 | 646 | 6.8% | 90.1% | 0.0% | 3.1% | 714 |
| stelo.SteloTestNano 1.0 | 16 | 679 | 7.8% | 88.7% | 0.1% | 3.4% | 485 |
| casey.Flee 1.0 | 16 | 746 | 10.5% | 84.9% | 0.0% | 4.6% | 577 |
| amk.ChumbaWumba 0.3 | 16 | 761 | 8.6% | 87.5% | 0.0% | 3.8% | 599 |
| metal.small.MCool 1.21 | 16 | 377 | 1.7% | 97.7% | 0.0% | 0.7% | 590 |
| tzu.TheArtOfWar 1.2 | 16 | 530 | 2.4% | 96.7% | 0.0% | 0.9% | 465 |
| lrem.magic.TormentedAngel Antiquitie | 16 | 763 | 6.6% | 90.7% | 0.0% | 2.7% | 651 |
| spinnercat.CopyKat 1.2.3 | 16 | 938 | 12.0% | 82.7% | 0.0% | 5.3% | 519 |
| apv.NanoLauLectrikTheCannibal 1.1 | 16 | 690 | 6.3% | 90.9% | 0.0% | 2.8% | 478 |
| simonton.nano.WeekendObsession_S 1.7 | 16 | 813 | 10.0% | 85.7% | 0.0% | 4.3% | 496 |
| nat.nano.OcnirpPM 1.0 | 16 | 869 | 5.8% | 91.6% | 0.0% | 2.6% | 586 |
| ds.OoV4 0.3b | 16 | 496 | 6.9% | 90.7% | 0.0% | 2.4% | 770 |
| suh.nano.RandomPM 1.02 | 16 | 1070 | 13.1% | 81.1% | 0.0% | 5.8% | 623 |
| ins.MobyNano 0.8 | 16 | 752 | 7.5% | 89.0% | 0.0% | 3.5% | 541 |
| starpkg.StarViewerZ 1.26 | 16 | 419 | 5.2% | 92.7% | 0.0% | 2.1% | 724 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 16 | 8 | 1796 | 1 | 0.51 | 3 | 3 | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 16 | 12 | 0 | 0 | 0.52 | 4 | 4 | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 16 | 14 | 298 | 0 | 0.38 | 1 | 1 | 0 |
| bvh.mini.Freya 0.55 | 16 | 15 | 298 | 0 | 0.33 | 0 | 0 | 0 |
| tide.pear.Pear 0.62.1 | 16 | 12 | 298 | 0 | 0.31 | 3 | 3 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 16 | 11 | 0 | 0 | 0.40 | 5 | 5 | 0 |
| Krabb.krabby.Krabby 1.18b | 16 | 14 | 596 | 0 | 0.31 | 1 | 1 | 16 |
| jekl.mini.BlackPearl .91 | 16 | 13 | 567 | 0 | 0.33 | 2 | 2 | 0 |
| kc.micro.Thorn 1.252 | 16 | 15 | 298 | 0 | 0.33 | 0 | 0 | 0 |
| lucasslf.HariSeldon 0.2.1 | 16 | 16 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 16 | 15 | 298 | 0 | 0.32 | 0 | 0 | 0 |
| stefw.Tigger 0.0.23 | 16 | 13 | 0 | 0 | 0.30 | 3 | 3 | 0 |
| AIR.iRobot 1.0 | 16 | 16 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| wilson.Chameleon 0.91 | 16 | 14 | 298 | 0 | 0.33 | 1 | 1 | 0 |
| simonton.micro.GFMicro 1.0 | 16 | 14 | 298 | 0 | 0.34 | 1 | 1 | 0 |
| bvh.frg.Friga 0.112dev | 16 | 16 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| pkbots.BoyTDSurfer 1.0 | 16 | 15 | 0 | 0 | 0.43 | 1 | 1 | 0 |
| kawigi.mini.Coriantumr 1.1 | 16 | 16 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| ahf.r2d2.R2d2 0.86 | 16 | 15 | 298 | 0 | 0.34 | 0 | 0 | 0 |
| florent.small.LittleAngel 1.8 | 16 | 16 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| theo.Tungsten 1.0a | 16 | 12 | 0 | 0 | 0.28 | 4 | 4 | 0 |
| mnt.AHEB 0.6a | 16 | 13 | 298 | 0 | 0.31 | 2 | 2 | 0 |
| DM.mega.Bezier 1.618fprrr | 16 | 13 | 298 | 0 | 0.61 | 2 | 2 | 0 |
| ph.mini.Archer 0.6.6 | 16 | 15 | 0 | 0 | 0.33 | 1 | 1 | 0 |
| lucasslf.Wiggins 0.6 | 16 | 15 | 0 | 0 | 0.37 | 1 | 1 | 0 |
| davidalves.net.DuelistMini 1.1 | 16 | 16 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| pez.mako.Mako 1.5 | 16 | 15 | 0 | 0 | 0.35 | 1 | 1 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 16 | 12 | 0 | 0 | 0.34 | 4 | 4 | 0 |
| rz.Aleph 0.34 | 16 | 13 | 298 | 0 | 0.30 | 2 | 2 | 0 |
| ad.Quest 0.10 | 16 | 13 | 596 | 0 | 0.34 | 2 | 2 | 0 |
| nat.Hikari dev0001 | 16 | 14 | 596 | 0 | 0.34 | 0 | 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 16 | 13 | 1192 | 0 | 0.38 | 0 | 0 | 0 |
| jekl.DarkHallow .90.9 | 16 | 13 | 298 | 0 | 0.33 | 2 | 2 | 0 |
| jcs.Decepticon 2.5.3 | 16 | 15 | 0 | 0 | 0.30 | 1 | 1 | 0 |
| jekl.Jekyl .70 | 16 | 15 | 207 | 0 | 0.36 | 0 | 0 | 0 |
| stelo.Randomness 1.1 | 16 | 13 | 596 | 0 | 0.34 | 1 | 1 | 0 |
| gh.GrubbmGrb 1.2.4 | 16 | 13 | 894 | 0 | 0.36 | 1 | 1 | 0 |
| rcb.Vanessa03 0 | 16 | 13 | 519 | 0 | 0.30 | 3 | 3 | 0 |
| arthord.KostyaTszyu Beta2 | 16 | 16 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| robar.micro.Kirbyi 1.0 | 16 | 13 | 596 | 0 | 0.34 | 1 | 1 | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 16 | 13 | 298 | 0 | 0.32 | 2 | 2 | 0 |
| tw.Exterminator 1.0 | 16 | 14 | 0 | 0 | 0.81 | 2 | 2 | 0 |
| pe.mini.SandboxMini 1.2 | 16 | 15 | 0 | 0 | 0.30 | 1 | 1 | 0 |
| trm.Wrekt 1.1.6.f | 16 | 16 | 0 | 0 | 0.42 | 0 | 0 | 0 |
| ags.micro.Carpet 1.1 | 16 | 15 | 298 | 0 | 0.34 | 0 | 0 | 0 |
| pez.clean.Swiffer 0.2.9 | 16 | 7 | 894 | 0 | 0.33 | 7 | 7 | 0 |
| zen.Lindada 0.2 | 16 | 16 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| vuen.Fractal 0.55 | 16 | 13 | 596 | 0 | 0.32 | 1 | 1 | 0 |
| nat.nano.Ocnirp 1.73 | 16 | 16 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| syl.Centipede 0.5 | 16 | 14 | 298 | 0 | 0.31 | 1 | 1 | 0 |
| myl.micro.NekoNinja 1.30 | 16 | 16 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| stelo.SteloTestNano 1.0 | 16 | 15 | 298 | 0 | 0.36 | 0 | 0 | 0 |
| casey.Flee 1.0 | 16 | 13 | 894 | 0 | 0.35 | 1 | 1 | 0 |
| amk.ChumbaWumba 0.3 | 16 | 13 | 894 | 0 | 0.35 | 0 | 0 | 0 |
| metal.small.MCool 1.21 | 16 | 16 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| tzu.TheArtOfWar 1.2 | 16 | 14 | 298 | 1 | 0.41 | 1 | 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 16 | 14 | 0 | 0 | 0.38 | 2 | 2 | 0 |
| spinnercat.CopyKat 1.2.3 | 16 | 13 | 1117 | 0 | 0.33 | 1 | 1 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 16 | 14 | 322 | 0 | 0.33 | 1 | 1 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 16 | 15 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 16 | 13 | 721 | 0 | 0.39 | 0 | 0 | 0 |
| ds.OoV4 0.3b | 16 | 14 | 0 | 0 | 0.39 | 2 | 2 | 0 |
| suh.nano.RandomPM 1.02 | 16 | 15 | 0 | 0 | 0.32 | 1 | 1 | 0 |
| ins.MobyNano 0.8 | 16 | 15 | 298 | 0 | 0.32 | 0 | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 16 | 16 | 0 | 0 | 0.31 | 0 | 0 | 0 |

910 of 1040 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 24887 | 21 | 24785 | 24762 (99.5%) | 125 (0.5%) | 23 (0.1%) | 1338 | 229 | 74 |
| simonton.beta.LifelongObsession 0.5.1 | 47285 | 1435 | 47139 | 47136 (99.7%) | 149 (0.3%) | 3 (0.0%) | 3383 | 375 | 197 |
| rdt.AgentSmith.AgentSmith 0.5 | 24589 | 22 | 24567 | 24565 (99.9%) | 24 (0.1%) | 2 (0.0%) | 1156 | 269 | 121 |
| bvh.mini.Freya 0.55 | 13824 | 187 | 13797 | 13797 (99.8%) | 27 (0.2%) | 0 (0.0%) | 281 | 185 | 62 |
| tide.pear.Pear 0.62.1 | 26366 | 710 | 26294 | 26250 (99.6%) | 116 (0.4%) | 44 (0.2%) | 2210 | 190 | 62 |
| simonton.mini.WeeksOnEnd 1.10.4 | 45728 | 238 | 45721 | 45710 (100.0%) | 18 (0.0%) | 11 (0.0%) | 3480 | 354 | 186 |
| Krabb.krabby.Krabby 1.18b | 16825 | 21 | 16787 | 16749 (99.5%) | 76 (0.5%) | 38 (0.2%) | 743 | 231 | 36 |
| jekl.mini.BlackPearl .91 | 21995 | 27 | 21957 | 21957 (99.8%) | 38 (0.2%) | 0 (0.0%) | 657 | 205 | 61 |
| kc.micro.Thorn 1.252 | 21223 | 10 | 21542 | 21202 (99.9%) | 21 (0.1%) | 340 (1.6%) | 1384 | 272 | 52 |
| lucasslf.HariSeldon 0.2.1 | 30611 | 167 | 30611 | 30611 (100.0%) | 0 (0.0%) | 0 (0.0%) | 1328 | 347 | 56 |
| wiki.mini.BlackDestroyer 0.9.0 | 26005 | 141 | 25985 | 25984 (99.9%) | 21 (0.1%) | 1 (0.0%) | 1072 | 259 | 67 |
| stefw.Tigger 0.0.23 | 22080 | 14 | 22080 | 22079 (100.0%) | 1 (0.0%) | 1 (0.0%) | 1120 | 238 | 53 |
| AIR.iRobot 1.0 | 22985 | 27 | 22985 | 22984 (100.0%) | 1 (0.0%) | 1 (0.0%) | 753 | 224 | 52 |
| wilson.Chameleon 0.91 | 20781 | 42 | 20766 | 20765 (99.9%) | 16 (0.1%) | 1 (0.0%) | 796 | 273 | 55 |
| simonton.micro.GFMicro 1.0 | 30611 | 166 | 30593 | 30592 (99.9%) | 19 (0.1%) | 1 (0.0%) | 1313 | 395 | 59 |
| bvh.frg.Friga 0.112dev | 13910 | 23 | 13910 | 13910 (100.0%) | 0 (0.0%) | 0 (0.0%) | 289 | 234 | 48 |
| pkbots.BoyTDSurfer 1.0 | 26042 | 128 | 26042 | 26042 (100.0%) | 0 (0.0%) | 0 (0.0%) | 1344 | 397 | 116 |
| kawigi.mini.Coriantumr 1.1 | 14530 | 4 | 14530 | 14529 (100.0%) | 1 (0.0%) | 1 (0.0%) | 492 | 208 | 49 |
| ahf.r2d2.R2d2 0.86 | 18347 | 28 | 18354 | 18326 (99.9%) | 21 (0.1%) | 28 (0.2%) | 643 | 278 | 50 |
| florent.small.LittleAngel 1.8 | 23256 | 22 | 23298 | 23250 (100.0%) | 6 (0.0%) | 48 (0.2%) | 1544 | 259 | 49 |
| theo.Tungsten 1.0a | 22408 | 16 | 22474 | 22406 (100.0%) | 2 (0.0%) | 68 (0.3%) | 1235 | 240 | 60 |
| mnt.AHEB 0.6a | 18862 | 45 | 18844 | 18834 (99.9%) | 28 (0.1%) | 10 (0.1%) | 1156 | 313 | 43 |
| DM.mega.Bezier 1.618fprrr | 37298 | 23 | 37285 | 37276 (99.9%) | 22 (0.1%) | 9 (0.0%) | 2616 | 329 | 241 |
| ph.mini.Archer 0.6.6 | 27324 | 156 | 27324 | 27323 (100.0%) | 1 (0.0%) | 1 (0.0%) | 1216 | 288 | 69 |
| lucasslf.Wiggins 0.6 | 33645 | 168 | 33642 | 33639 (100.0%) | 6 (0.0%) | 3 (0.0%) | 1696 | 327 | 130 |
| davidalves.net.DuelistMini 1.1 | 15613 | 15 | 15617 | 15612 (100.0%) | 1 (0.0%) | 5 (0.0%) | 516 | 155 | 64 |
| pez.mako.Mako 1.5 | 16691 | 38 | 16694 | 16685 (100.0%) | 6 (0.0%) | 9 (0.1%) | 502 | 187 | 83 |
| wcsv.Engineer.Engineer 0.5.4 | 28821 | 195 | 28820 | 28819 (100.0%) | 2 (0.0%) | 1 (0.0%) | 1517 | 278 | 90 |
| rz.Aleph 0.34 | 23836 | 26 | 23821 | 23818 (99.9%) | 18 (0.1%) | 3 (0.0%) | 1193 | 235 | 68 |
| ad.Quest 0.10 | 20045 | 101 | 20012 | 20007 (99.8%) | 38 (0.2%) | 5 (0.0%) | 1058 | 193 | 82 |
| nat.Hikari dev0001 | 18983 | 42 | 18941 | 18939 (99.8%) | 44 (0.2%) | 2 (0.0%) | 513 | 314 | 57 |
| davidalves.net.DuelistMicroMkII 1.1 | 16645 | 25 | 16726 | 16569 (99.5%) | 76 (0.5%) | 157 (0.9%) | 1077 | 212 | 80 |
| jekl.DarkHallow .90.9 | 25175 | 21 | 25550 | 25154 (99.9%) | 21 (0.1%) | 396 (1.5%) | 1943 | 274 | 77 |
| jcs.Decepticon 2.5.3 | 25853 | 157 | 25852 | 25851 (100.0%) | 2 (0.0%) | 1 (0.0%) | 1366 | 237 | 52 |
| jekl.Jekyl .70 | 20622 | 18 | 20593 | 20593 (99.9%) | 29 (0.1%) | 0 (0.0%) | 1031 | 223 | 227 |
| stelo.Randomness 1.1 | 22049 | 67 | 22012 | 22012 (99.8%) | 37 (0.2%) | 0 (0.0%) | 1009 | 265 | 67 |
| gh.GrubbmGrb 1.2.4 | 24014 | 43 | 23951 | 23951 (99.7%) | 63 (0.3%) | 0 (0.0%) | 778 | 279 | 66 |
| rcb.Vanessa03 0 | 13118 | 25 | 13089 | 13087 (99.8%) | 31 (0.2%) | 2 (0.0%) | 285 | 221 | 45 |
| arthord.KostyaTszyu Beta2 | 17931 | 14 | 17991 | 17927 (100.0%) | 4 (0.0%) | 64 (0.4%) | 943 | 190 | 117 |
| robar.micro.Kirbyi 1.0 | 15115 | 60 | 15160 | 15038 (99.5%) | 77 (0.5%) | 122 (0.8%) | 956 | 316 | 53 |
| metal.small.dna2.MCoolDNA 1.5 | 18587 | 26 | 18586 | 18566 (99.9%) | 21 (0.1%) | 20 (0.1%) | 894 | 273 | 89 |
| tw.Exterminator 1.0 | 72320 | 90 | 72321 | 72314 (100.0%) | 6 (0.0%) | 7 (0.0%) | 6390 | 796 | 395 |
| pe.mini.SandboxMini 1.2 | 12704 | 14 | 12707 | 12703 (100.0%) | 1 (0.0%) | 4 (0.0%) | 349 | 225 | 43 |
| trm.Wrekt 1.1.6.f | 23279 | 21 | 23294 | 23276 (100.0%) | 3 (0.0%) | 18 (0.1%) | 1125 | 305 | 144 |
| ags.micro.Carpet 1.1 | 27475 | 142 | 27457 | 27457 (99.9%) | 18 (0.1%) | 0 (0.0%) | 1065 | 295 | 69 |
| pez.clean.Swiffer 0.2.9 | 19420 | 15 | 20851 | 19359 (99.7%) | 61 (0.3%) | 1492 (7.2%) | 384 | 278 | 81 |
| zen.Lindada 0.2 | 16427 | 43 | 16430 | 16427 (100.0%) | 0 (0.0%) | 3 (0.0%) | 548 | 194 | 42 |
| vuen.Fractal 0.55 | 11462 | 14 | 11498 | 11413 (99.6%) | 49 (0.4%) | 85 (0.7%) | 692 | 199 | 48 |
| nat.nano.Ocnirp 1.73 | 15329 | 34 | 15352 | 15265 (99.6%) | 64 (0.4%) | 87 (0.6%) | 2752 | 353 | 74 |
| syl.Centipede 0.5 | 12881 | 23 | 12863 | 12863 (99.9%) | 18 (0.1%) | 0 (0.0%) | 120 | 159 | 40 |
| myl.micro.NekoNinja 1.30 | 19240 | 27 | 19341 | 19238 (100.0%) | 2 (0.0%) | 103 (0.5%) | 814 | 234 | 52 |
| stelo.SteloTestNano 1.0 | 10748 | 27 | 10730 | 10730 (99.8%) | 18 (0.2%) | 0 (0.0%) | 218 | 174 | 50 |
| casey.Flee 1.0 | 14242 | 41 | 14337 | 14125 (99.2%) | 117 (0.8%) | 212 (1.5%) | 1872 | 297 | 130 |
| amk.ChumbaWumba 0.3 | 14586 | 23 | 14531 | 14531 (99.6%) | 55 (0.4%) | 0 (0.0%) | 270 | 144 | 66 |
| metal.small.MCool 1.21 | 14140 | 68 | 14139 | 14137 (100.0%) | 3 (0.0%) | 2 (0.0%) | 101 | 140 | 40 |
| tzu.TheArtOfWar 1.2 | 9842 | 34 | 9822 | 9822 (99.8%) | 20 (0.2%) | 0 (0.0%) | 60 | 166 | 53 |
| lrem.magic.TormentedAngel Antiquitie | 18754 | 23 | 18755 | 18754 (100.0%) | 0 (0.0%) | 1 (0.0%) | 447 | 278 | 88 |
| spinnercat.CopyKat 1.2.3 | 12463 | 44 | 12424 | 12353 (99.1%) | 110 (0.9%) | 71 (0.6%) | 2355 | 321 | 49 |
| apv.NanoLauLectrikTheCannibal 1.1 | 10808 | 70 | 10812 | 10780 (99.7%) | 28 (0.3%) | 32 (0.3%) | 1254 | 254 | 46 |
| simonton.nano.WeekendObsession_S 1.7 | 11396 | 45 | 11404 | 11367 (99.7%) | 29 (0.3%) | 37 (0.3%) | 2084 | 300 | 51 |
| nat.nano.OcnirpPM 1.0 | 14727 | 27 | 14710 | 14620 (99.3%) | 107 (0.7%) | 90 (0.6%) | 2837 | 356 | 58 |
| ds.OoV4 0.3b | 26622 | 56 | 26621 | 26619 (100.0%) | 3 (0.0%) | 2 (0.0%) | 941 | 400 | 104 |
| suh.nano.RandomPM 1.02 | 17344 | 46 | 17389 | 17304 (99.8%) | 40 (0.2%) | 85 (0.5%) | 2513 | 395 | 53 |
| ins.MobyNano 0.8 | 13144 | 64 | 13156 | 13107 (99.7%) | 37 (0.3%) | 49 (0.4%) | 2591 | 319 | 48 |
| starpkg.StarViewerZ 1.26 | 23485 | 116 | 23486 | 23485 (100.0%) | 0 (0.0%) | 1 (0.0%) | 565 | 306 | 43 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| jam.mini.Raiko 0.43 | 29092 | 2503 (8.6%) | 21089 |
| simonton.beta.LifelongObsession 0.5.1 | 50229 | 4499 (9.0%) | 46241 |
| rdt.AgentSmith.AgentSmith 0.5 | 29021 | 2092 (7.2%) | 23728 |
| bvh.mini.Freya 0.55 | 17823 | 930 (5.2%) | 1409 |
| tide.pear.Pear 0.62.1 | 35735 | 2450 (6.9%) | 26973 |
| simonton.mini.WeeksOnEnd 1.10.4 | 48102 | 4351 (9.0%) | 41110 |
| Krabb.krabby.Krabby 1.18b | 18502 | 1296 (7.0%) | 8125 |
| jekl.mini.BlackPearl .91 | 23518 | 1766 (7.5%) | 15553 |
| kc.micro.Thorn 1.252 | 28529 | 2089 (7.3%) | 23919 |
| lucasslf.HariSeldon 0.2.1 | 31023 | 2963 (9.6%) | 27730 |
| wiki.mini.BlackDestroyer 0.9.0 | 27853 | 2490 (8.9%) | 22819 |
| stefw.Tigger 0.0.23 | 24903 | 1950 (7.8%) | 18146 |
| AIR.iRobot 1.0 | 24968 | 2073 (8.3%) | 19005 |
| wilson.Chameleon 0.91 | 22403 | 1804 (8.1%) | 17234 |
| simonton.micro.GFMicro 1.0 | 31242 | 2781 (8.9%) | 28092 |
| bvh.frg.Friga 0.112dev | 15110 | 1254 (8.3%) | 7684 |
| pkbots.BoyTDSurfer 1.0 | 26183 | 2200 (8.4%) | 18504 |
| kawigi.mini.Coriantumr 1.1 | 19091 | 1211 (6.3%) | 7363 |
| ahf.r2d2.R2d2 0.86 | 19568 | 2365 (12.1%) | 17046 |
| florent.small.LittleAngel 1.8 | 29574 | 2145 (7.3%) | 23261 |
| theo.Tungsten 1.0a | 29133 | 2072 (7.1%) | 22074 |
| mnt.AHEB 0.6a | 19582 | 1216 (6.2%) | 7089 |
| DM.mega.Bezier 1.618fprrr | 41232 | 3866 (9.4%) | 37850 |
| ph.mini.Archer 0.6.6 | 28925 | 2482 (8.6%) | 19398 |
| lucasslf.Wiggins 0.6 | 34278 | 3370 (9.8%) | 31399 |
| davidalves.net.DuelistMini 1.1 | 20148 | 1500 (7.4%) | 12253 |
| pez.mako.Mako 1.5 | 19317 | 1215 (6.3%) | 8231 |
| wcsv.Engineer.Engineer 0.5.4 | 31553 | 2754 (8.7%) | 27459 |
| rz.Aleph 0.34 | 28350 | 2343 (8.3%) | 23756 |
| ad.Quest 0.10 | 23311 | 2131 (9.1%) | 18247 |
| nat.Hikari dev0001 | 19161 | 2004 (10.5%) | 15404 |
| davidalves.net.DuelistMicroMkII 1.1 | 21902 | 1407 (6.4%) | 13318 |
| jekl.DarkHallow .90.9 | 34324 | 2509 (7.3%) | 27947 |
| jcs.Decepticon 2.5.3 | 30320 | 2618 (8.6%) | 26043 |
| jekl.Jekyl .70 | 23359 | 1800 (7.7%) | 14037 |
| stelo.Randomness 1.1 | 22642 | 2353 (10.4%) | 18646 |
| gh.GrubbmGrb 1.2.4 | 23863 | 2476 (10.4%) | 20401 |
| rcb.Vanessa03 0 | 15293 | 1039 (6.8%) | 7170 |
| arthord.KostyaTszyu Beta2 | 23650 | 1385 (5.9%) | 7479 |
| robar.micro.Kirbyi 1.0 | 15726 | 1068 (6.8%) | 6315 |
| metal.small.dna2.MCoolDNA 1.5 | 21902 | 1438 (6.6%) | 12239 |
| tw.Exterminator 1.0 | 66106 | 6963 (10.5%) | 63783 |
| pe.mini.SandboxMini 1.2 | 15607 | 1045 (6.7%) | 5602 |
| trm.Wrekt 1.1.6.f | 28540 | 2128 (7.5%) | 18386 |
| ags.micro.Carpet 1.1 | 28643 | 2460 (8.6%) | 23391 |
| pez.clean.Swiffer 0.2.9 | 14428 | 1008 (7.0%) | 5986 |
| zen.Lindada 0.2 | 18983 | 1437 (7.6%) | 12644 |
| vuen.Fractal 0.55 | 15587 | 708 (4.5%) | 880 |
| nat.nano.Ocnirp 1.73 | 17624 | 1175 (6.7%) | 5752 |
| syl.Centipede 0.5 | 15844 | 709 (4.5%) | 1838 |
| myl.micro.NekoNinja 1.30 | 22530 | 1294 (5.7%) | 10670 |
| stelo.SteloTestNano 1.0 | 11694 | 870 (7.4%) | 3927 |
| casey.Flee 1.0 | 16240 | 964 (5.9%) | 4543 |
| amk.ChumbaWumba 0.3 | 17477 | 1084 (6.2%) | 6291 |
| metal.small.MCool 1.21 | 16827 | 840 (5.0%) | 3196 |
| tzu.TheArtOfWar 1.2 | 10602 | 567 (5.3%) | 888 |
| lrem.magic.TormentedAngel Antiquitie | 19158 | 1415 (7.4%) | 11843 |
| spinnercat.CopyKat 1.2.3 | 13566 | 1213 (8.9%) | 9245 |
| apv.NanoLauLectrikTheCannibal 1.1 | 11509 | 1037 (9.0%) | 6050 |
| simonton.nano.WeekendObsession_S 1.7 | 12698 | 967 (7.6%) | 2953 |
| nat.nano.OcnirpPM 1.0 | 16914 | 1136 (6.7%) | 6323 |
| ds.OoV4 0.3b | 23844 | 2526 (10.6%) | 20952 |
| suh.nano.RandomPM 1.02 | 18306 | 1153 (6.3%) | 5902 |
| ins.MobyNano 0.8 | 14690 | 1097 (7.5%) | 7112 |
| starpkg.StarViewerZ 1.26 | 22372 | 1679 (7.5%) | 14904 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 650 | 490 | 623 | 695 | 32.4 / 28.3 | 606 | 8060 | 14 |
| simonton.beta.LifelongObsession 0.5.1 | 650 | 549 | 647 | 1113 | 27.8 / 32.9 | 407 | 35577 | 5656 |
| rdt.AgentSmith.AgentSmith 0.5 | 650 | 539 | 648 | 686 | 33.4 / 30.0 | 453 | 11227 | 0 |
| bvh.mini.Freya 0.55 | 650 | 522 | 473 | 459 | 42.8 / 20.0 | 2301 | 10778 | 2333 |
| tide.pear.Pear 0.62.1 | 650 | 499 | 627 | 812 | 26.1 / 31.5 | 560 | 17552 | 501 |
| simonton.mini.WeeksOnEnd 1.10.4 | 650 | 542 | 650 | 1073 | 27.7 / 31.2 | 549 | 36909 | 5590 |
| Krabb.krabby.Krabby 1.18b | 650 | 422 | 464 | 482 | 41.9 / 18.6 | 2848 | 10080 | 5540 |
| jekl.mini.BlackPearl .91 | 650 | 505 | 608 | 586 | 39.2 / 25.5 | 1417 | 7254 | 9113 |
| kc.micro.Thorn 1.252 | 650 | 457 | 520 | 687 | 38.6 / 27.5 | 990 | 4823 | 27 |
| lucasslf.HariSeldon 0.2.1 | 650 | 501 | 598 | 741 | 42.6 / 23.2 | 999 | 10043 | 3132 |
| wiki.mini.BlackDestroyer 0.9.0 | 650 | 496 | 588 | 671 | 36.5 / 24.6 | 892 | 11059 | 2253 |
| stefw.Tigger 0.0.23 | 650 | 490 | 603 | 615 | 36.4 / 28.4 | 1725 | 7006 | 884 |
| AIR.iRobot 1.0 | 650 | 506 | 520 | 611 | 32.8 / 18.2 | 489 | 10860 | 10299 |
| wilson.Chameleon 0.91 | 650 | 506 | 613 | 565 | 43.9 / 22.5 | 2637 | 11763 | 26 |
| simonton.micro.GFMicro 1.0 | 650 | 468 | 473 | 744 | 42.7 / 20.0 | 948 | 9458 | 3020 |
| bvh.frg.Friga 0.112dev | 650 | 500 | 422 | 413 | 52.0 / 16.3 | 5335 | 10212 | 75 |
| pkbots.BoyTDSurfer 1.0 | 650 | 414 | 634 | 647 | 43.4 / 30.1 | 2897 | 7789 | 1979 |
| kawigi.mini.Coriantumr 1.1 | 650 | 517 | 420 | 499 | 48.5 / 13.3 | 3234 | 4638 | 91 |
| ahf.r2d2.R2d2 0.86 | 650 | 495 | 566 | 510 | 46.0 / 21.4 | 3296 | 9115 | 51 |
| florent.small.LittleAngel 1.8 | 650 | 553 | 592 | 707 | 33.8 / 23.8 | 657 | 10225 | 670 |
| theo.Tungsten 1.0a | 650 | 532 | 630 | 694 | 33.5 / 25.9 | 561 | 11417 | 254 |
| mnt.AHEB 0.6a | 650 | 459 | 431 | 507 | 47.6 / 24.0 | 4752 | 9226 | 250 |
| DM.mega.Bezier 1.618fprrr | 650 | 552 | 648 | 924 | 44.3 / 22.2 | 1318 | 31414 | 665 |
| ph.mini.Archer 0.6.6 | 650 | 505 | 650 | 692 | 35.0 / 31.0 | 729 | 5525 | 2539 |
| lucasslf.Wiggins 0.6 | 650 | 547 | 650 | 808 | 38.5 / 25.1 | 861 | 7391 | 3234 |
| davidalves.net.DuelistMini 1.1 | 650 | 534 | 538 | 509 | 37.2 / 19.7 | 1682 | 10940 | 599 |
| pez.mako.Mako 1.5 | 650 | 495 | 580 | 489 | 33.5 / 19.8 | 503 | 15256 | 236 |
| wcsv.Engineer.Engineer 0.5.4 | 650 | 468 | 650 | 745 | 28.5 / 32.8 | 633 | 13636 | 3537 |
| rz.Aleph 0.34 | 650 | 516 | 647 | 681 | 33.0 / 28.5 | 428 | 8449 | 229 |
| ad.Quest 0.10 | 650 | 502 | 572 | 573 | 38.7 / 23.2 | 1854 | 12822 | 2278 |
| nat.Hikari dev0001 | 650 | 404 | 494 | 503 | 47.8 / 21.4 | 4537 | 6946 | 4105 |
| davidalves.net.DuelistMicroMkII 1.1 | 650 | 474 | 598 | 547 | 40.7 / 26.1 | 3046 | 8116 | 185 |
| jekl.DarkHallow .90.9 | 650 | 514 | 650 | 804 | 33.5 / 29.7 | 886 | 8022 | 254 |
| jcs.Decepticon 2.5.3 | 650 | 555 | 638 | 720 | 35.1 / 26.1 | 660 | 12066 | 3517 |
| jekl.Jekyl .70 | 650 | 486 | 502 | 582 | 44.1 / 23.1 | 2860 | 8476 | 19 |
| stelo.Randomness 1.1 | 650 | 462 | 517 | 567 | 46.5 / 20.5 | 3656 | 10811 | 1300 |
| gh.GrubbmGrb 1.2.4 | 650 | 484 | 509 | 601 | 47.3 / 18.2 | 2784 | 11061 | 226 |
| rcb.Vanessa03 0 | 650 | 423 | 486 | 408 | 42.7 / 22.8 | 3351 | 12085 | 82 |
| arthord.KostyaTszyu Beta2 | 650 | 513 | 573 | 576 | 34.2 / 22.9 | 701 | 11453 | 46 |
| robar.micro.Kirbyi 1.0 | 650 | 367 | 508 | 425 | 53.2 / 27.9 | 5042 | 9897 | 923 |
| metal.small.dna2.MCoolDNA 1.5 | 650 | 439 | 614 | 551 | 44.4 / 27.1 | 2829 | 9013 | 4 |
| tw.Exterminator 1.0 | 650 | 487 | 511 | 1491 | 63.5 / 12.8 | 7703 | 3736 | 3385 |
| pe.mini.SandboxMini 1.2 | 650 | 368 | 539 | 419 | 44.5 / 24.9 | 3695 | 10998 | 1 |
| trm.Wrekt 1.1.6.f | 650 | 446 | 648 | 695 | 39.4 / 28.4 | 1171 | 6398 | 4 |
| ags.micro.Carpet 1.1 | 650 | 511 | 492 | 690 | 43.3 / 20.1 | 1190 | 13484 | 2410 |
| pez.clean.Swiffer 0.2.9 | 650 | 473 | 534 | 580 | 42.8 / 34.6 | 2828 | 7481 | 36 |
| zen.Lindada 0.2 | 650 | 494 | 531 | 484 | 39.9 / 21.3 | 2082 | 11041 | 355 |
| vuen.Fractal 0.55 | 650 | 494 | 466 | 415 | 48.6 / 20.5 | 4426 | 8816 | 70 |
| nat.nano.Ocnirp 1.73 | 650 | 495 | 570 | 452 | 34.9 / 24.1 | 1589 | 8970 | 8389 |
| syl.Centipede 0.5 | 650 | 447 | 427 | 415 | 40.5 / 13.8 | 1791 | 15262 | 2732 |
| myl.micro.NekoNinja 1.30 | 650 | 496 | 472 | 564 | 44.2 / 16.6 | 2212 | 11516 | 165 |
| stelo.SteloTestNano 1.0 | 650 | 421 | 406 | 335 | 51.6 / 17.2 | 6477 | 9665 | 4116 |
| casey.Flee 1.0 | 650 | 484 | 469 | 426 | 38.9 / 18.1 | 2058 | 12514 | 8121 |
| amk.ChumbaWumba 0.3 | 650 | 505 | 539 | 449 | 32.7 / 19.0 | 850 | 13493 | 8662 |
| metal.small.MCool 1.21 | 650 | 475 | 430 | 440 | 36.1 / 10.5 | 1125 | 16447 | 4099 |
| tzu.TheArtOfWar 1.2 | 650 | 339 | 406 | 316 | 69.3 / 14.6 | 7448 | 9661 | 13 |
| lrem.magic.TormentedAngel Antiquitie | 650 | 497 | 514 | 500 | 44.8 / 19.8 | 3130 | 11556 | 6973 |
| spinnercat.CopyKat 1.2.3 | 650 | 407 | 403 | 369 | 46.0 / 22.2 | 4191 | 8382 | 5576 |
| apv.NanoLauLectrikTheCannibal 1.1 | 650 | 377 | 430 | 328 | 53.4 / 17.9 | 6042 | 11843 | 1709 |
| simonton.nano.WeekendObsession_S 1.7 | 650 | 411 | 416 | 346 | 46.2 / 19.9 | 3332 | 10522 | 1876 |
| nat.nano.OcnirpPM 1.0 | 650 | 501 | 633 | 436 | 35.1 / 22.7 | 1387 | 10242 | 8715 |
| ds.OoV4 0.3b | 650 | 479 | 434 | 619 | 65.2 / 12.9 | 6650 | 8540 | 680 |
| suh.nano.RandomPM 1.02 | 650 | 504 | 569 | 472 | 41.4 / 24.8 | 2943 | 8927 | 7079 |
| ins.MobyNano 0.8 | 650 | 469 | 528 | 391 | 39.2 / 19.1 | 2777 | 11705 | 3236 |
| starpkg.StarViewerZ 1.26 | 650 | 445 | 400 | 574 | 58.7 / 11.1 | 4433 | 12480 | 21 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 8.7% | 285 | 301 | 3 | 43.7 | 2495 / 2503 (100%) | 0 | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 8.6% | 290 | 3960 | 3 | 83.5 | 4483 / 4499 (100%) | 0 | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 6.9% | 210 | 134 | 3 | 43.7 | 2089 / 2092 (100%) | 0 | 0 |
| bvh.mini.Freya 0.55 | 5.2% | 184 | 167 | 3 | 24.6 | 928 / 930 (100%) | 0 | 0 |
| tide.pear.Pear 0.62.1 | 6.8% | 174 | 1000 | 3 | 46.6 | 2450 / 2450 (100%) | 0 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 8.4% | 226 | 217 | 3 | 80.9 | 4334 / 4351 (100%) | 0 | 0 |
| Krabb.krabby.Krabby 1.18b | 5.0% | 174 | 100 | 3 | 29.9 | 1296 / 1296 (100%) | 0 | 0 |
| jekl.mini.BlackPearl .91 | 7.4% | 182 | 668 | 3 | 39.0 | 1765 / 1766 (100%) | 0 | 0 |
| kc.micro.Thorn 1.252 | 6.6% | 182 | 451 | 3 | 38.5 | 2089 / 2089 (100%) | 0 | 0 |
| lucasslf.HariSeldon 0.2.1 | 6.6% | 170 | 1772 | 3 | 54.6 | 2955 / 2963 (100%) | 0 | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 6.1% | 181 | 4634 | 3 | 46.3 | 2483 / 2490 (100%) | 0 | 0 |
| stefw.Tigger 0.0.23 | 6.7% | 169 | 120 | 3 | 39.0 | 1950 / 1950 (100%) | 0 | 0 |
| AIR.iRobot 1.0 | 4.6% | 184 | 113 | 3 | 41.0 | 2071 / 2073 (100%) | 0 | 0 |
| wilson.Chameleon 0.91 | 6.3% | 187 | 471 | 3 | 36.7 | 1803 / 1804 (100%) | 0 | 0 |
| simonton.micro.GFMicro 1.0 | 6.2% | 189 | 140 | 3 | 54.5 | 2769 / 2781 (100%) | 0 | 0 |
| bvh.frg.Friga 0.112dev | 5.2% | 178 | 103 | 3 | 24.8 | 1254 / 1254 (100%) | 0 | 0 |
| pkbots.BoyTDSurfer 1.0 | 8.1% | 243 | 400 | 3 | 46.3 | 2190 / 2200 (100%) | 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 4.0% | 194 | 105 | 3 | 25.9 | 1210 / 1211 (100%) | 0 | 0 |
| ahf.r2d2.R2d2 0.86 | 6.3% | 193 | 3257 | 3 | 32.8 | 2364 / 2365 (100%) | 0 | 0 |
| florent.small.LittleAngel 1.8 | 5.7% | 191 | 4508 | 2 | 41.4 | 2144 / 2145 (100%) | 0 | 0 |
| theo.Tungsten 1.0a | 6.1% | 158 | 377 | 3 | 39.7 | 2070 / 2072 (100%) | 0 | 0 |
| mnt.AHEB 0.6a | 6.9% | 176 | 584 | 3 | 33.4 | 1215 / 1216 (100%) | 0 | 0 |
| DM.mega.Bezier 1.618fprrr | 6.2% | 341 | 1824 | 3 | 66.3 | 3857 / 3866 (100%) | 0 | 0 |
| ph.mini.Archer 0.6.6 | 7.5% | 184 | 580 | 3 | 48.6 | 2473 / 2482 (100%) | 0 | 0 |
| lucasslf.Wiggins 0.6 | 6.7% | 208 | 6935 | 2 | 59.8 | 3351 / 3370 (99%) | 0 | 0 |
| davidalves.net.DuelistMini 1.1 | 4.7% | 208 | 118 | 3 | 27.9 | 1499 / 1500 (100%) | 0 | 0 |
| pez.mako.Mako 1.5 | 4.5% | 198 | 106 | 3 | 29.6 | 1215 / 1215 (100%) | 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 7.4% | 193 | 1683 | 3 | 51.0 | 2746 / 2754 (100%) | 0 | 0 |
| rz.Aleph 0.34 | 6.5% | 170 | 156 | 3 | 42.4 | 2341 / 2343 (100%) | 0 | 0 |
| ad.Quest 0.10 | 5.3% | 188 | 196 | 3 | 35.5 | 2120 / 2131 (99%) | 0 | 0 |
| nat.Hikari dev0001 | 6.3% | 188 | 163 | 3 | 33.7 | 2003 / 2004 (100%) | 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 6.7% | 213 | 1342 | 3 | 29.8 | 1402 / 1407 (100%) | 0 | 0 |
| jekl.DarkHallow .90.9 | 6.8% | 184 | 152 | 3 | 45.3 | 2506 / 2509 (100%) | 0 | 0 |
| jcs.Decepticon 2.5.3 | 6.3% | 168 | 384 | 3 | 46.0 | 2608 / 2618 (100%) | 0 | 0 |
| jekl.Jekyl .70 | 6.5% | 199 | 463 | 3 | 36.8 | 1797 / 1800 (100%) | 0 | 0 |
| stelo.Randomness 1.1 | 6.3% | 191 | 128 | 3 | 39.2 | 2348 / 2353 (100%) | 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 6.4% | 199 | 113 | 3 | 42.7 | 2473 / 2476 (100%) | 0 | 0 |
| rcb.Vanessa03 0 | 6.3% | 170 | 99 | 3 | 23.2 | 1037 / 1039 (100%) | 0 | 0 |
| arthord.KostyaTszyu Beta2 | 5.3% | 205 | 116 | 3 | 32.1 | 1385 / 1385 (100%) | 0 | 0 |
| robar.micro.Kirbyi 1.0 | 9.3% | 191 | 5283 | 3 | 26.9 | 1060 / 1068 (99%) | 0 | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 7.3% | 177 | 2927 | 3 | 33.0 | 1435 / 1438 (100%) | 0 | 0 |
| tw.Exterminator 1.0 | 9.4% | 456 | 23526 | 3 | 128.2 | 6946 / 6963 (100%) | 0 | 0 |
| pe.mini.SandboxMini 1.2 | 6.4% | 169 | 100 | 3 | 22.6 | 1045 / 1045 (100%) | 0 | 0 |
| trm.Wrekt 1.1.6.f | 7.2% | 236 | 1367 | 3 | 41.3 | 2126 / 2128 (100%) | 0 | 0 |
| ags.micro.Carpet 1.1 | 5.9% | 190 | 137 | 3 | 49.0 | 2450 / 2460 (100%) | 0 | 0 |
| pez.clean.Swiffer 0.2.9 | 8.6% | 182 | 275 | 3 | 23.4 | 1002 / 1008 (99%) | 0 | 0 |
| zen.Lindada 0.2 | 4.9% | 209 | 1945 | 3 | 29.3 | 1437 / 1437 (100%) | 0 | 0 |
| vuen.Fractal 0.55 | 5.7% | 178 | 85 | 3 | 20.5 | 706 / 708 (100%) | 0 | 0 |
| nat.nano.Ocnirp 1.73 | 6.3% | 196 | 106 | 3 | 27.4 | 1171 / 1175 (100%) | 0 | 0 |
| syl.Centipede 0.5 | 3.6% | 171 | 102 | 3 | 22.9 | 707 / 709 (100%) | 0 | 0 |
| myl.micro.NekoNinja 1.30 | 4.7% | 196 | 1608 | 3 | 34.5 | 1294 / 1294 (100%) | 0 | 0 |
| stelo.SteloTestNano 1.0 | 5.4% | 204 | 90 | 3 | 19.1 | 870 / 870 (100%) | 0 | 0 |
| casey.Flee 1.0 | 5.2% | 194 | 126 | 3 | 25.4 | 957 / 964 (99%) | 0 | 0 |
| amk.ChumbaWumba 0.3 | 4.3% | 194 | 103 | 3 | 25.9 | 1083 / 1084 (100%) | 0 | 0 |
| metal.small.MCool 1.21 | 3.1% | 173 | 120 | 3 | 25.2 | 840 / 840 (100%) | 0 | 0 |
| tzu.TheArtOfWar 1.2 | 8.0% | 229 | 81 | 3 | 17.5 | 567 / 567 (100%) | 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 5.6% | 212 | 2395 | 3 | 33.3 | 1413 / 1415 (100%) | 0 | 0 |
| spinnercat.CopyKat 1.2.3 | 8.1% | 186 | 2133 | 3 | 22.1 | 1209 / 1213 (100%) | 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 7.1% | 184 | 78 | 3 | 19.3 | 1034 / 1037 (100%) | 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 6.3% | 194 | 79 | 3 | 20.3 | 964 / 967 (100%) | 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 6.3% | 220 | 99 | 3 | 26.3 | 1129 / 1136 (99%) | 0 | 0 |
| ds.OoV4 0.3b | 6.6% | 217 | 769 | 3 | 47.3 | 2522 / 2526 (100%) | 0 | 0 |
| suh.nano.RandomPM 1.02 | 7.4% | 180 | 107 | 3 | 30.9 | 1151 / 1153 (100%) | 0 | 0 |
| ins.MobyNano 0.8 | 5.5% | 178 | 99 | 3 | 23.4 | 1091 / 1097 (99%) | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 4.3% | 175 | 104 | 3 | 41.9 | 1679 / 1679 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| jam.mini.Raiko 0.43 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.beta.LifelongObsession 0.5.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rdt.AgentSmith.AgentSmith 0.5 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.mini.Freya 0.55 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tide.pear.Pear 0.62.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.mini.WeeksOnEnd 1.10.4 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| Krabb.krabby.Krabby 1.18b | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jekl.mini.BlackPearl .91 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kc.micro.Thorn 1.252 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lucasslf.HariSeldon 0.2.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wiki.mini.BlackDestroyer 0.9.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stefw.Tigger 0.0.23 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| AIR.iRobot 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wilson.Chameleon 0.91 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.micro.GFMicro 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.frg.Friga 0.112dev | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pkbots.BoyTDSurfer 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ahf.r2d2.R2d2 0.86 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| florent.small.LittleAngel 1.8 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.Tungsten 1.0a | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mnt.AHEB 0.6a | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| DM.mega.Bezier 1.618fprrr | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ph.mini.Archer 0.6.6 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lucasslf.Wiggins 0.6 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.net.DuelistMini 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.mako.Mako 1.5 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rz.Aleph 0.34 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ad.Quest 0.10 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.Hikari dev0001 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jekl.DarkHallow .90.9 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jcs.Decepticon 2.5.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jekl.Jekyl .70 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.Randomness 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| gh.GrubbmGrb 1.2.4 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rcb.Vanessa03 0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| arthord.KostyaTszyu Beta2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| robar.micro.Kirbyi 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| metal.small.dna2.MCoolDNA 1.5 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tw.Exterminator 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pe.mini.SandboxMini 1.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| trm.Wrekt 1.1.6.f | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ags.micro.Carpet 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.clean.Swiffer 0.2.9 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| zen.Lindada 0.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| vuen.Fractal 0.55 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.nano.Ocnirp 1.73 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| syl.Centipede 0.5 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| myl.micro.NekoNinja 1.30 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.SteloTestNano 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| casey.Flee 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| amk.ChumbaWumba 0.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| metal.small.MCool 1.21 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tzu.TheArtOfWar 1.2 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lrem.magic.TormentedAngel Antiquitie | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| spinnercat.CopyKat 1.2.3 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.nano.WeekendObsession_S 1.7 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.nano.OcnirpPM 1.0 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ds.OoV4 0.3b | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| suh.nano.RandomPM 1.02 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ins.MobyNano 0.8 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| starpkg.StarViewerZ 1.26 | 0 / 16 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live, live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | hadur2.Hadur 3.9sa | 16 | 98.8% ± 2.7 | 99.4% ± 1.3 | +0.6 ± 3.1 | 63.2% ± 8.4 | 78.0% ± 10.2 | +14.7 ± 12.4 |
| AIR.iRobot 1.0 | hadur2.Hadur 3.9 | 16 | 96.3% ± 4.3 | 98.1% ± 2.9 | +1.9 ± 4.0 | 66.1% ± 3.6 | 60.8% ± 4.5 | -5.3 ± 5.6 |
| DM.mega.Bezier 1.618fprrr | hadur2.Hadur 3.9sa | 16 | 100.0% ± 0.0 | 99.4% ± 1.3 | -0.6 ± 1.3 | 54.3% ± 17.9 | 67.5% ± 16.1 | +13.3 ± 21.3 |
| DM.mega.Bezier 1.618fprrr | hadur2.Hadur 3.9 | 16 | 92.5% ± 5.3 | 91.7% ± 5.6 | -0.8 ± 9.0 | 59.2% ± 4.5 | 67.5% ± 12.3 | +8.3 ± 11.1 |
| Krabb.krabby.Krabby 1.18b | hadur2.Hadur 3.9sa | 16 | 97.5% ± 3.6 | 99.4% ± 1.3 | +1.9 ± 4.0 | 58.9% ± 14.1 | 67.7% ± 12.3 | +8.7 ± 19.8 |
| Krabb.krabby.Krabby 1.18b | hadur2.Hadur 3.9 | 16 | 91.3% ± 5.5 | 96.9% ± 3.2 | +5.6 ± 7.5 | 64.5% ± 3.7 | 71.1% ± 4.0 | +6.7 ± 6.3 |
| ad.Quest 0.10 | hadur2.Hadur 3.9sa | 16 | 85.0% ± 7.3 | 98.1% ± 2.1 | +13.1 ± 7.2 | 42.7% ± 9.8 | 66.5% ± 8.0 | +23.8 ± 10.4 |
| ad.Quest 0.10 | hadur2.Hadur 3.9 | 16 | 97.5% ± 3.6 | 96.2% ± 2.7 | -1.3 ± 4.3 | 62.0% ± 4.1 | 64.1% ± 3.8 | +2.1 ± 5.7 |
| ags.micro.Carpet 1.1 | hadur2.Hadur 3.9sa | 16 | 100.0% ± 0.0 | 94.2% ± 4.5 | -5.8 ± 4.5 | 84.1% ± 5.6 | 38.8% ± 4.9 | -45.3 ± 5.6 |
| ags.micro.Carpet 1.1 | hadur2.Hadur 3.9 | 16 | 90.0% ± 7.8 | 99.4% ± 1.3 | +9.4 ± 8.1 | 67.6% ± 5.1 | 71.2% ± 3.4 | +3.6 ± 6.1 |
| ahf.r2d2.R2d2 0.86 | hadur2.Hadur 3.9sa | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 61.8% ± 8.2 | 63.9% ± 6.0 | +2.1 ± 8.3 |
| ahf.r2d2.R2d2 0.86 | hadur2.Hadur 3.9 | 16 | 96.3% ± 4.3 | 97.5% ± 2.4 | +1.2 ± 5.5 | 65.1% ± 2.8 | 69.7% ± 3.0 | +4.6 ± 2.3 |
| amk.ChumbaWumba 0.3 | hadur2.Hadur 3.9sa | 16 | 97.5% ± 3.6 | 97.5% ± 2.4 | +0.0 ± 4.8 | 65.1% ± 15.2 | 62.4% ± 8.5 | -2.7 ± 19.7 |
| amk.ChumbaWumba 0.3 | hadur2.Hadur 3.9 | 16 | 93.8% ± 6.4 | 96.9% ± 2.6 | +3.1 ± 6.7 | 51.6% ± 6.0 | 66.0% ± 3.5 | +14.4 ± 7.2 |
| apv.NanoLauLectrikTheCannibal 1.1 | hadur2.Hadur 3.9sa | 16 | 97.5% ± 3.6 | 96.3% ± 3.3 | -1.2 ± 5.5 | 79.6% ± 6.9 | 77.3% ± 5.1 | -2.3 ± 10.1 |
| apv.NanoLauLectrikTheCannibal 1.1 | hadur2.Hadur 3.9 | 16 | 98.8% ± 2.7 | 97.4% ± 2.5 | -1.3 ± 3.9 | 69.7% ± 6.1 | 75.9% ± 3.1 | +6.1 ± 6.7 |
| arthord.KostyaTszyu Beta2 | hadur2.Hadur 3.9sa | 16 | 100.0% ± 0.0 | 94.4% ± 3.9 | -5.6 ± 3.9 | 67.6% ± 12.8 | 43.4% ± 9.7 | -24.2 ± 15.9 |
| arthord.KostyaTszyu Beta2 | hadur2.Hadur 3.9 | 16 | 93.8% ± 5.1 | 90.0% ± 4.4 | -3.8 ± 7.2 | 57.8% ± 6.2 | 57.1% ± 3.1 | -0.7 ± 6.7 |
| bvh.frg.Friga 0.112dev | hadur2.Hadur 3.9sa | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 74.9% ± 12.9 | 94.1% ± 5.1 | +19.2 ± 13.9 |
| bvh.frg.Friga 0.112dev | hadur2.Hadur 3.9 | 16 | 95.0% ± 4.8 | 99.4% ± 1.3 | +4.4 ± 5.1 | 71.3% ± 4.4 | 76.1% ± 1.8 | +4.8 ± 4.5 |
| bvh.mini.Freya 0.55 | hadur2.Hadur 3.9sa | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 83.6% ± 12.2 | 90.4% ± 7.4 | +6.8 ± 16.1 |
| bvh.mini.Freya 0.55 | hadur2.Hadur 3.9 | 16 | 92.5% ± 7.7 | 96.3% ± 3.3 | +3.8 ± 8.0 | 63.3% ± 6.7 | 69.2% ± 3.5 | +5.9 ± 8.5 |
| casey.Flee 1.0 | hadur2.Hadur 3.9sa | 16 | 98.8% ± 2.7 | 98.8% ± 1.8 | +0.0 ± 3.4 | 51.9% ± 10.7 | 55.0% ± 7.7 | +3.1 ± 16.2 |
| casey.Flee 1.0 | hadur2.Hadur 3.9 | 16 | 93.8% ± 5.1 | 95.6% ± 2.7 | +1.9 ± 5.2 | 60.5% ± 5.6 | 66.6% ± 3.3 | +6.1 ± 6.2 |
| davidalves.net.DuelistMicroMkII 1.1 | hadur2.Hadur 3.9sa | 16 | 95.0% ± 7.3 | 95.6% ± 3.4 | +0.6 ± 7.9 | 63.0% ± 8.8 | 64.2% ± 4.5 | +1.2 ± 9.6 |
| davidalves.net.DuelistMicroMkII 1.1 | hadur2.Hadur 3.9 | 16 | 87.5% ± 7.7 | 90.6% ± 6.0 | +3.1 ± 9.5 | 56.4% ± 6.2 | 60.2% ± 3.4 | +3.8 ± 6.9 |
| davidalves.net.DuelistMini 1.1 | hadur2.Hadur 3.9sa | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 81.8% ± 11.8 | 76.4% ± 6.8 | -5.3 ± 12.9 |
| davidalves.net.DuelistMini 1.1 | hadur2.Hadur 3.9 | 16 | 96.3% ± 5.8 | 98.1% ± 2.1 | +1.9 ± 5.9 | 58.2% ± 5.4 | 66.7% ± 4.1 | +8.5 ± 6.5 |
| ds.OoV4 0.3b | hadur2.Hadur 3.9sa | 16 | 98.8% ± 2.7 | 99.4% ± 1.3 | +0.6 ± 3.1 | 63.5% ± 10.7 | 55.0% ± 9.9 | -8.6 ± 14.9 |
| ds.OoV4 0.3b | hadur2.Hadur 3.9 | 16 | 97.5% ± 3.6 | 98.0% ± 3.2 | +0.5 ± 3.1 | 77.6% ± 3.4 | 83.4% ± 2.1 | +5.9 ± 4.4 |
| florent.small.LittleAngel 1.8 | hadur2.Hadur 3.9sa | 16 | 95.0% ± 6.2 | 95.6% ± 2.8 | +0.6 ± 5.4 | 47.1% ± 8.4 | 42.1% ± 6.2 | -5.0 ± 8.9 |
| florent.small.LittleAngel 1.8 | hadur2.Hadur 3.9 | 16 | 88.8% ± 6.7 | 90.6% ± 6.0 | +1.9 ± 9.6 | 57.6% ± 4.8 | 60.9% ± 5.9 | +3.3 ± 8.2 |
| gh.GrubbmGrb 1.2.4 | hadur2.Hadur 3.9sa | 16 | 97.5% ± 3.6 | 95.6% ± 5.5 | -1.9 ± 7.1 | 69.4% ± 5.9 | 74.1% ± 12.8 | +4.7 ± 11.9 |
| gh.GrubbmGrb 1.2.4 | hadur2.Hadur 3.9 | 16 | 95.0% ± 6.2 | 93.7% ± 3.9 | -1.3 ± 7.5 | 72.5% ± 4.5 | 72.7% ± 2.4 | +0.2 ± 4.0 |
| ins.MobyNano 0.8 | hadur2.Hadur 3.9sa | 16 | 96.3% ± 4.3 | 99.4% ± 1.3 | +3.1 ± 4.7 | 51.4% ± 8.8 | 56.0% ± 7.0 | +4.6 ± 12.5 |
| ins.MobyNano 0.8 | hadur2.Hadur 3.9 | 16 | 95.0% ± 6.2 | 98.1% ± 2.1 | +3.1 ± 6.9 | 61.9% ± 6.1 | 66.9% ± 3.4 | +5.0 ± 6.0 |
| jam.mini.Raiko 0.43 | hadur2.Hadur 3.9sa | 16 | 96.3% ± 4.3 | 97.5% ± 2.4 | +1.2 ± 4.7 | 55.5% ± 11.9 | 50.8% ± 15.5 | -4.7 ± 18.5 |
| jam.mini.Raiko 0.43 | hadur2.Hadur 3.9 | 16 | 78.8% ± 8.2 | 91.0% ± 4.8 | +12.3 ± 8.2 | 50.5% ± 6.0 | 54.7% ± 2.8 | +4.2 ± 5.9 |
| jcs.Decepticon 2.5.3 | hadur2.Hadur 3.9sa | 16 | 92.5% ± 5.3 | 95.6% ± 3.9 | +3.1 ± 6.9 | 40.0% ± 8.2 | 51.8% ± 5.1 | +11.9 ± 7.8 |
| jcs.Decepticon 2.5.3 | hadur2.Hadur 3.9 | 16 | 92.5% ± 5.3 | 91.9% ± 4.4 | -0.6 ± 5.7 | 54.1% ± 5.5 | 59.1% ± 6.2 | +5.0 ± 8.2 |
| jekl.DarkHallow .90.9 | hadur2.Hadur 3.9sa | 16 | 86.3% ± 9.3 | 96.2% ± 3.3 | +9.9 ± 9.9 | 49.9% ± 12.5 | 65.7% ± 12.2 | +15.8 ± 12.9 |
| jekl.DarkHallow .90.9 | hadur2.Hadur 3.9 | 16 | 80.0% ± 7.8 | 82.2% ± 5.5 | +2.2 ± 9.0 | 54.6% ± 4.5 | 51.1% ± 4.0 | -3.5 ± 6.7 |
| jekl.Jekyl .70 | hadur2.Hadur 3.9sa | 16 | 98.8% ± 2.7 | 96.9% ± 3.8 | -1.9 ± 4.9 | 64.7% ± 13.7 | 70.0% ± 8.1 | +5.3 ± 16.9 |
| jekl.Jekyl .70 | hadur2.Hadur 3.9 | 16 | 92.5% ± 5.3 | 95.6% ± 3.4 | +3.1 ± 6.7 | 60.8% ± 5.7 | 68.3% ± 3.0 | +7.5 ± 4.8 |
| jekl.mini.BlackPearl .91 | hadur2.Hadur 3.9sa | 16 | 91.3% ± 7.8 | 100.0% ± 0.0 | +8.8 ± 7.8 | 60.5% ± 13.4 | 87.1% ± 10.0 | +26.6 ± 17.2 |
| jekl.mini.BlackPearl .91 | hadur2.Hadur 3.9 | 16 | 86.3% ± 8.5 | 93.6% ± 5.8 | +7.4 ± 8.6 | 57.7% ± 4.9 | 61.6% ± 5.1 | +3.9 ± 7.6 |
| kawigi.mini.Coriantumr 1.1 | hadur2.Hadur 3.9sa | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 84.0% ± 7.3 | 88.7% ± 5.2 | +4.8 ± 9.7 |
| kawigi.mini.Coriantumr 1.1 | hadur2.Hadur 3.9 | 16 | 96.3% ± 4.3 | 98.1% ± 2.1 | +1.9 ± 5.2 | 68.6% ± 2.9 | 80.7% ± 3.0 | +12.1 ± 4.3 |
| kc.micro.Thorn 1.252 | hadur2.Hadur 3.9sa | 16 | 92.5% ± 5.3 | 95.6% ± 4.8 | +3.1 ± 6.4 | 56.8% ± 8.5 | 59.5% ± 10.8 | +2.7 ± 15.7 |
| kc.micro.Thorn 1.252 | hadur2.Hadur 3.9 | 16 | 91.3% ± 6.7 | 90.6% ± 4.9 | -0.6 ± 9.8 | 59.0% ± 4.7 | 60.2% ± 2.9 | +1.2 ± 4.9 |
| lrem.magic.TormentedAngel Antiquitie | hadur2.Hadur 3.9sa | 16 | 95.0% ± 4.8 | 97.5% ± 2.4 | +2.5 ± 5.3 | 33.9% ± 13.9 | 40.5% ± 8.2 | +6.6 ± 16.6 |
| lrem.magic.TormentedAngel Antiquitie | hadur2.Hadur 3.9 | 16 | 96.3% ± 4.3 | 98.1% ± 2.1 | +1.9 ± 4.4 | 62.8% ± 3.7 | 70.5% ± 3.0 | +7.8 ± 4.5 |
| lucasslf.HariSeldon 0.2.1 | hadur2.Hadur 3.9sa | 16 | 97.5% ± 3.6 | 100.0% ± 0.0 | +2.5 ± 3.6 | 71.3% ± 8.9 | 75.5% ± 8.5 | +4.2 ± 10.4 |
| lucasslf.HariSeldon 0.2.1 | hadur2.Hadur 3.9 | 16 | 91.3% ± 6.7 | 96.9% ± 3.2 | +5.6 ± 7.5 | 61.5% ± 4.5 | 65.6% ± 2.6 | +4.2 ± 5.3 |
| lucasslf.Wiggins 0.6 | hadur2.Hadur 3.9sa | 16 | 97.5% ± 5.3 | 98.8% ± 2.7 | +1.3 ± 2.7 | 43.7% ± 5.3 | 69.1% ± 8.3 | +25.4 ± 9.7 |
| lucasslf.Wiggins 0.6 | hadur2.Hadur 3.9 | 16 | 96.3% ± 4.3 | 93.7% ± 3.9 | -2.6 ± 4.9 | 56.2% ± 4.4 | 61.8% ± 3.9 | +5.6 ± 6.5 |
| metal.small.MCool 1.21 | hadur2.Hadur 3.9sa | 16 | 97.5% ± 3.6 | 99.4% ± 1.3 | +1.9 ± 4.0 | 56.9% ± 18.8 | 76.6% ± 8.8 | +19.8 ± 21.7 |
| metal.small.MCool 1.21 | hadur2.Hadur 3.9 | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 63.0% ± 3.2 | 81.2% ± 2.9 | +18.1 ± 5.3 |
| metal.small.dna2.MCoolDNA 1.5 | hadur2.Hadur 3.9sa | 16 | 100.0% ± 0.0 | 95.6% ± 3.9 | -4.4 ± 3.9 | 61.8% ± 11.1 | 56.1% ± 8.1 | -5.7 ± 12.1 |
| metal.small.dna2.MCoolDNA 1.5 | hadur2.Hadur 3.9 | 16 | 83.8% ± 8.0 | 86.8% ± 5.7 | +3.1 ± 9.5 | 58.0% ± 6.0 | 62.7% ± 2.8 | +4.7 ± 6.1 |
| mnt.AHEB 0.6a | hadur2.Hadur 3.9sa | 16 | 96.3% ± 4.3 | 95.6% ± 2.7 | -0.6 ± 6.0 | 49.3% ± 16.8 | 56.0% ± 12.1 | +6.7 ± 17.4 |
| mnt.AHEB 0.6a | hadur2.Hadur 3.9 | 16 | 80.0% ± 6.7 | 93.6% ± 4.4 | +13.6 ± 5.9 | 54.9% ± 3.6 | 68.1% ± 3.5 | +13.2 ± 6.4 |
| myl.micro.NekoNinja 1.30 | hadur2.Hadur 3.9sa | 16 | 98.8% ± 2.7 | 99.4% ± 1.3 | +0.6 ± 3.1 | 79.3% ± 12.7 | 78.4% ± 8.7 | -1.0 ± 14.4 |
| myl.micro.NekoNinja 1.30 | hadur2.Hadur 3.9 | 16 | 93.8% ± 8.5 | 97.5% ± 2.4 | +3.8 ± 8.0 | 66.7% ± 7.8 | 73.4% ± 2.8 | +6.8 ± 8.0 |
| nat.Hikari dev0001 | hadur2.Hadur 3.9sa | 16 | 100.0% ± 0.0 | 99.4% ± 1.3 | -0.6 ± 1.3 | 46.2% ± 7.1 | 47.5% ± 5.9 | +1.3 ± 8.9 |
| nat.Hikari dev0001 | hadur2.Hadur 3.9 | 16 | 90.0% ± 7.8 | 96.3% ± 2.7 | +6.3 ± 7.8 | 60.8% ± 4.2 | 71.3% ± 3.7 | +10.5 ± 4.2 |
| nat.nano.OcnirpPM 1.0 | hadur2.Hadur 3.9sa | 16 | 97.5% ± 3.6 | 92.4% ± 4.6 | -5.1 ± 6.8 | 42.3% ± 11.7 | 48.2% ± 7.8 | +6.0 ± 15.3 |
| nat.nano.OcnirpPM 1.0 | hadur2.Hadur 3.9 | 16 | 96.3% ± 4.3 | 99.4% ± 1.3 | +3.1 ± 4.7 | 57.8% ± 5.8 | 57.3% ± 2.1 | -0.5 ± 5.6 |
| nat.nano.Ocnirp 1.73 | hadur2.Hadur 3.9sa | 16 | 92.5% ± 6.6 | 92.5% ± 5.0 | +0.0 ± 6.5 | 39.6% ± 11.2 | 41.9% ± 7.7 | +2.3 ± 12.7 |
| nat.nano.Ocnirp 1.73 | hadur2.Hadur 3.9 | 16 | 90.0% ± 6.7 | 93.8% ± 3.3 | +3.8 ± 8.0 | 54.4% ± 6.0 | 59.0% ± 3.1 | +4.6 ± 5.9 |
| pe.mini.SandboxMini 1.2 | hadur2.Hadur 3.9sa | 16 | 96.2% ± 4.3 | 97.5% ± 2.4 | +1.2 ± 3.8 | 51.2% ± 9.9 | 65.3% ± 8.0 | +14.1 ± 12.4 |
| pe.mini.SandboxMini 1.2 | hadur2.Hadur 3.9 | 16 | 96.3% ± 4.3 | 94.9% ± 3.4 | -1.3 ± 5.1 | 62.5% ± 5.1 | 63.8% ± 2.7 | +1.4 ± 5.7 |
| pez.clean.Swiffer 0.2.9 | hadur2.Hadur 3.9sa | 16 | 93.8% ± 6.4 | 98.1% ± 2.1 | +4.4 ± 7.3 | 64.8% ± 11.5 | 66.7% ± 9.1 | +1.9 ± 15.5 |
| pez.clean.Swiffer 0.2.9 | hadur2.Hadur 3.9 | 16 | 83.8% ± 8.0 | 59.0% ± 16.7 | -24.7 ± 14.8 | 62.3% ± 10.6 | 40.3% ± 16.5 | -22.0 ± 13.2 |
| pez.mako.Mako 1.5 | hadur2.Hadur 3.9sa | 16 | 98.8% ± 2.7 | 98.1% ± 2.1 | -0.6 ± 3.6 | 57.5% ± 12.8 | 60.9% ± 8.4 | +3.4 ± 15.7 |
| pez.mako.Mako 1.5 | hadur2.Hadur 3.9 | 16 | 91.3% ± 5.5 | 93.7% ± 3.9 | +2.4 ± 6.3 | 56.9% ± 5.7 | 63.8% ± 4.6 | +6.9 ± 6.5 |
| ph.mini.Archer 0.6.6 | hadur2.Hadur 3.9sa | 16 | 93.8% ± 8.5 | 93.8% ± 4.3 | +0.0 ± 6.2 | 36.5% ± 16.0 | 27.8% ± 7.8 | -8.7 ± 15.7 |
| ph.mini.Archer 0.6.6 | hadur2.Hadur 3.9 | 16 | 86.3% ± 5.1 | 87.4% ± 5.3 | +1.2 ± 6.1 | 52.1% ± 3.4 | 52.3% ± 3.2 | +0.2 ± 4.4 |
| pkbots.BoyTDSurfer 1.0 | hadur2.Hadur 3.9sa | 16 | 93.8% ± 6.4 | 98.7% ± 1.9 | +4.9 ± 7.1 | 29.9% ± 6.1 | 49.5% ± 8.6 | +19.6 ± 11.3 |
| pkbots.BoyTDSurfer 1.0 | hadur2.Hadur 3.9 | 16 | 73.8% ± 8.5 | 91.3% ± 4.3 | +17.5 ± 8.4 | 48.6% ± 4.1 | 63.8% ± 3.3 | +15.2 ± 5.1 |
| rcb.Vanessa03 0 | hadur2.Hadur 3.9sa | 16 | 86.3% ± 7.5 | 96.3% ± 3.8 | +10.0 ± 9.3 | 46.4% ± 7.5 | 69.4% ± 8.8 | +23.0 ± 12.6 |
| rcb.Vanessa03 0 | hadur2.Hadur 3.9 | 16 | 88.8% ± 7.8 | 94.8% ± 3.6 | +6.0 ± 9.1 | 56.0% ± 4.6 | 67.8% ± 3.8 | +11.9 ± 7.4 |
| rdt.AgentSmith.AgentSmith 0.5 | hadur2.Hadur 3.9sa | 16 | 92.5% ± 5.3 | 98.1% ± 2.2 | +5.6 ± 5.2 | 35.2% ± 9.3 | 60.5% ± 10.9 | +25.3 ± 17.2 |
| rdt.AgentSmith.AgentSmith 0.5 | hadur2.Hadur 3.9 | 16 | 81.3% ± 9.1 | 83.8% ± 5.1 | +2.5 ± 9.8 | 49.3% ± 4.2 | 50.6% ± 3.0 | +1.3 ± 5.8 |
| robar.micro.Kirbyi 1.0 | hadur2.Hadur 3.9sa | 16 | 93.8% ± 5.1 | 98.1% ± 2.1 | +4.4 ± 6.1 | 59.9% ± 9.4 | 60.7% ± 4.8 | +0.8 ± 11.0 |
| robar.micro.Kirbyi 1.0 | hadur2.Hadur 3.9 | 16 | 96.3% ± 4.3 | 91.8% ± 4.0 | -4.4 ± 5.5 | 67.8% ± 3.6 | 65.6% ± 2.4 | -2.1 ± 4.1 |
| rz.Aleph 0.34 | hadur2.Hadur 3.9sa | 16 | 97.5% ± 5.3 | 91.7% ± 4.1 | -5.8 ± 7.6 | 72.1% ± 13.6 | 35.1% ± 5.7 | -37.0 ± 16.8 |
| rz.Aleph 0.34 | hadur2.Hadur 3.9 | 16 | 90.0% ± 6.7 | 89.2% ± 3.1 | -0.8 ± 7.7 | 54.8% ± 4.3 | 53.5% ± 3.3 | -1.3 ± 6.0 |
| simonton.beta.LifelongObsession 0.5.1 | hadur2.Hadur 3.9sa | 16 | 97.5% ± 5.3 | 98.8% ± 2.7 | +1.3 ± 2.7 | 57.0% ± 13.1 | 60.7% ± 7.8 | +3.7 ± 12.9 |
| simonton.beta.LifelongObsession 0.5.1 | hadur2.Hadur 3.9 | 16 | 75.0% ± 9.1 | 74.9% ± 6.4 | -0.1 ± 11.6 | 48.9% ± 6.0 | 44.8% ± 2.5 | -4.1 ± 5.9 |
| simonton.micro.GFMicro 1.0 | hadur2.Hadur 3.9sa | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 73.8% ± 5.9 | 75.4% ± 4.5 | +1.7 ± 7.9 |
| simonton.micro.GFMicro 1.0 | hadur2.Hadur 3.9 | 16 | 93.8% ± 5.1 | 96.9% ± 3.2 | +3.1 ± 6.4 | 79.7% ± 2.1 | 67.8% ± 3.9 | -11.9 ± 4.4 |
| simonton.mini.WeeksOnEnd 1.10.4 | hadur2.Hadur 3.9sa | 16 | 95.0% ± 4.8 | 96.9% ± 2.6 | +1.9 ± 5.6 | 52.6% ± 12.3 | 55.3% ± 5.2 | +2.7 ± 15.5 |
| simonton.mini.WeeksOnEnd 1.10.4 | hadur2.Hadur 3.9 | 16 | 82.5% ± 6.6 | 78.0% ± 6.6 | -4.5 ± 9.9 | 49.0% ± 2.9 | 45.5% ± 2.8 | -3.5 ± 3.9 |
| simonton.nano.WeekendObsession_S 1.7 | hadur2.Hadur 3.9sa | 16 | 92.5% ± 6.6 | 97.5% ± 2.4 | +5.0 ± 6.7 | 73.5% ± 10.9 | 60.2% ± 5.6 | -13.3 ± 13.0 |
| simonton.nano.WeekendObsession_S 1.7 | hadur2.Hadur 3.9 | 16 | 100.0% ± 0.0 | 96.9% ± 2.6 | -3.1 ± 2.6 | 83.8% ± 2.6 | 69.3% ± 3.4 | -14.5 ± 4.0 |
| spinnercat.CopyKat 1.2.3 | hadur2.Hadur 3.9sa | 16 | 96.2% ± 4.3 | 98.8% ± 1.8 | +2.5 ± 5.0 | 55.4% ± 11.2 | 86.9% ± 3.5 | +31.5 ± 11.8 |
| spinnercat.CopyKat 1.2.3 | hadur2.Hadur 3.9 | 16 | 98.8% ± 2.7 | 94.3% ± 3.4 | -4.4 ± 4.8 | 78.1% ± 3.9 | 65.7% ± 3.7 | -12.4 ± 5.5 |
| starpkg.StarViewerZ 1.26 | hadur2.Hadur 3.9sa | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 56.7% ± 11.4 | 54.4% ± 14.3 | -2.2 ± 21.9 |
| starpkg.StarViewerZ 1.26 | hadur2.Hadur 3.9 | 16 | 96.3% ± 4.3 | 99.4% ± 1.3 | +3.1 ± 3.8 | 78.6% ± 3.5 | 84.3% ± 2.4 | +5.7 ± 2.9 |
| stefw.Tigger 0.0.23 | hadur2.Hadur 3.9sa | 16 | 92.5% ± 6.6 | 94.3% ± 4.4 | +1.8 ± 8.6 | 37.6% ± 7.9 | 42.1% ± 6.9 | +4.5 ± 11.4 |
| stefw.Tigger 0.0.23 | hadur2.Hadur 3.9 | 16 | 78.8% ± 8.2 | 89.0% ± 4.3 | +10.3 ± 8.4 | 50.0% ± 4.9 | 56.6% ± 2.9 | +6.6 ± 5.0 |
| stelo.Randomness 1.1 | hadur2.Hadur 3.9sa | 16 | 93.8% ± 6.4 | 98.1% ± 2.1 | +4.4 ± 5.5 | 62.4% ± 8.2 | 61.3% ± 6.3 | -1.2 ± 11.4 |
| stelo.Randomness 1.1 | hadur2.Hadur 3.9 | 16 | 97.5% ± 3.6 | 98.1% ± 2.1 | +0.6 ± 4.6 | 68.5% ± 5.3 | 71.6% ± 3.7 | +3.0 ± 5.7 |
| stelo.SteloTestNano 1.0 | hadur2.Hadur 3.9sa | 16 | 96.3% ± 4.3 | 99.4% ± 1.3 | +3.1 ± 4.7 | 73.4% ± 12.8 | 77.2% ± 6.5 | +3.8 ± 13.7 |
| stelo.SteloTestNano 1.0 | hadur2.Hadur 3.9 | 16 | 95.0% ± 4.8 | 97.5% ± 2.4 | +2.5 ± 5.3 | 64.7% ± 2.5 | 75.3% ± 3.4 | +10.5 ± 3.7 |
| suh.nano.RandomPM 1.02 | hadur2.Hadur 3.9sa | 16 | 100.0% ± 0.0 | 94.4% ± 4.3 | -5.6 ± 4.3 | 29.9% ± 15.1 | 31.6% ± 8.1 | +1.2 ± 17.3 |
| suh.nano.RandomPM 1.02 | hadur2.Hadur 3.9 | 16 | 93.8% ± 5.1 | 91.9% ± 4.4 | -1.9 ± 7.3 | 61.7% ± 2.9 | 60.6% ± 3.5 | -1.0 ± 4.0 |
| syl.Centipede 0.5 | hadur2.Hadur 3.9sa | 16 | 100.0% ± 0.0 | 98.8% ± 1.8 | -1.2 ± 1.8 | 83.5% ± 11.1 | 86.0% ± 7.6 | +2.5 ± 15.9 |
| syl.Centipede 0.5 | hadur2.Hadur 3.9 | 16 | 95.0% ± 6.2 | 95.6% ± 2.7 | +0.6 ± 7.1 | 67.9% ± 5.8 | 76.2% ± 4.9 | +8.3 ± 7.9 |
| theo.Tungsten 1.0a | hadur2.Hadur 3.9sa | 16 | 97.5% ± 3.6 | 96.3% ± 3.3 | -1.2 ± 3.8 | 68.3% ± 7.7 | 59.0% ± 6.5 | -9.2 ± 9.9 |
| theo.Tungsten 1.0a | hadur2.Hadur 3.9 | 16 | 93.8% ± 5.1 | 89.0% ± 4.7 | -4.8 ± 6.0 | 60.1% ± 3.4 | 54.0% ± 5.2 | -6.0 ± 7.5 |
| tide.pear.Pear 0.62.1 | hadur2.Hadur 3.9sa | 16 | 96.3% ± 4.3 | 100.0% ± 0.0 | +3.7 ± 4.3 | 38.4% ± 3.6 | 82.7% ± 2.7 | +44.3 ± 4.4 |
| tide.pear.Pear 0.62.1 | hadur2.Hadur 3.9 | 16 | 83.8% ± 7.0 | 85.9% ± 5.4 | +2.2 ± 8.7 | 46.1% ± 3.0 | 44.4% ± 2.9 | -1.7 ± 4.3 |
| trm.Wrekt 1.1.6.f | hadur2.Hadur 3.9sa | 16 | 95.0% ± 4.8 | 92.5% ± 5.7 | -2.5 ± 7.9 | 44.9% ± 10.2 | 57.5% ± 11.1 | +12.6 ± 12.1 |
| trm.Wrekt 1.1.6.f | hadur2.Hadur 3.9 | 16 | 82.5% ± 9.4 | 80.0% ± 5.5 | -2.5 ± 11.6 | 61.3% ± 3.6 | 56.7% ± 3.6 | -4.5 ± 5.2 |
| tw.Exterminator 1.0 | hadur2.Hadur 3.9sa | 16 | 100.0% ± 0.0 | 91.2% ± 5.8 | -8.8 ± 5.8 | 85.5% ± 5.2 | 59.6% ± 16.7 | -25.9 ± 17.6 |
| tw.Exterminator 1.0 | hadur2.Hadur 3.9 | 16 | 83.7% ± 7.0 | 70.3% ± 5.9 | -13.4 ± 7.6 | 86.8% ± 3.1 | 81.9% ± 1.9 | -4.9 ± 3.9 |
| tzu.TheArtOfWar 1.2 | hadur2.Hadur 3.9sa | 16 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 88.9% ± 4.4 | 87.0% ± 4.8 | -1.9 ± 5.8 |
| tzu.TheArtOfWar 1.2 | hadur2.Hadur 3.9 | 16 | 98.8% ± 2.7 | 99.4% ± 1.3 | +0.6 ± 3.1 | 79.0% ± 3.7 | 81.1% ± 2.0 | +2.1 ± 4.1 |
| vuen.Fractal 0.55 | hadur2.Hadur 3.9sa | 16 | 97.5% ± 3.6 | 100.0% ± 0.0 | +2.5 ± 3.6 | 83.2% ± 8.9 | 88.6% ± 4.2 | +5.4 ± 10.9 |
| vuen.Fractal 0.55 | hadur2.Hadur 3.9 | 16 | 95.0% ± 4.8 | 97.5% ± 2.4 | +2.5 ± 5.3 | 65.8% ± 4.7 | 71.5% ± 2.9 | +5.7 ± 5.3 |
| wcsv.Engineer.Engineer 0.5.4 | hadur2.Hadur 3.9sa | 16 | 85.0% ± 9.9 | 92.5% ± 5.0 | +7.5 ± 10.4 | 38.3% ± 4.0 | 56.0% ± 5.2 | +17.7 ± 6.2 |
| wcsv.Engineer.Engineer 0.5.4 | hadur2.Hadur 3.9 | 16 | 85.0% ± 6.2 | 76.9% ± 5.7 | -8.1 ± 10.2 | 48.4% ± 3.3 | 42.2% ± 3.8 | -6.2 ± 5.5 |
| wiki.mini.BlackDestroyer 0.9.0 | hadur2.Hadur 3.9sa | 16 | 96.2% ± 5.8 | 97.5% ± 2.4 | +1.3 ± 6.7 | 50.6% ± 9.9 | 55.2% ± 7.0 | +4.6 ± 10.1 |
| wiki.mini.BlackDestroyer 0.9.0 | hadur2.Hadur 3.9 | 16 | 83.8% ± 8.9 | 91.9% ± 5.6 | +8.1 ± 10.0 | 51.2% ± 4.0 | 62.1% ± 4.4 | +10.9 ± 4.6 |
| wilson.Chameleon 0.91 | hadur2.Hadur 3.9sa | 16 | 100.0% ± 0.0 | 99.4% ± 1.3 | -0.6 ± 1.3 | 91.4% ± 6.8 | 83.1% ± 8.0 | -8.3 ± 10.1 |
| wilson.Chameleon 0.91 | hadur2.Hadur 3.9 | 16 | 83.8% ± 9.7 | 94.4% ± 5.5 | +10.6 ± 9.4 | 59.6% ± 6.2 | 67.9% ± 3.5 | +8.3 ± 4.9 |
| zen.Lindada 0.2 | hadur2.Hadur 3.9sa | 16 | 98.8% ± 2.7 | 100.0% ± 0.0 | +1.2 ± 2.7 | 63.0% ± 14.0 | 79.8% ± 6.8 | +16.8 ± 11.0 |
| zen.Lindada 0.2 | hadur2.Hadur 3.9 | 16 | 92.5% ± 6.6 | 97.5% ± 2.4 | +5.0 ± 6.7 | 67.0% ± 5.0 | 65.0% ± 3.5 | -1.9 ± 6.5 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| AIR.iRobot 1.0 | +2.5 ± 5.3 | +1.2 ± 3.3 | -2.9 ± 8.5 | +17.1 ± 11.5 |
| DM.mega.Bezier 1.618fprrr | +7.5 ± 5.3 | +7.6 ± 5.7 | -4.9 ± 17.7 | -0.0 ± 19.5 |
| Krabb.krabby.Krabby 1.18b | +6.2 ± 6.4 | +2.5 ± 3.1 | -5.5 ± 14.3 | -3.5 ± 12.5 |
| ad.Quest 0.10 | -12.5 ± 7.7 | +1.9 ± 4.0 | -19.3 ± 10.5 | +2.4 ± 9.3 |
| ags.micro.Carpet 1.1 | +10.0 ± 7.8 | -5.1 ± 4.9 | +16.5 ± 7.1 | -32.4 ± 5.4 |
| ahf.r2d2.R2d2 0.86 | +2.5 ± 3.6 | +2.5 ± 2.4 | -3.3 ± 7.6 | -5.7 ± 7.3 |
| amk.ChumbaWumba 0.3 | +3.8 ± 8.0 | +0.6 ± 2.4 | +13.5 ± 15.7 | -3.6 ± 8.2 |
| apv.NanoLauLectrikTheCannibal 1.1 | -1.2 ± 4.7 | -1.2 ± 4.8 | +9.9 ± 8.7 | +1.5 ± 6.0 |
| arthord.KostyaTszyu Beta2 | +6.2 ± 5.1 | +4.4 ± 6.4 | +9.7 ± 13.8 | -13.7 ± 10.8 |
| bvh.frg.Friga 0.112dev | +5.0 ± 4.8 | +0.6 ± 1.3 | +3.6 ± 16.0 | +18.0 ± 5.5 |
| bvh.mini.Freya 0.55 | +7.5 ± 7.7 | +3.7 ± 3.3 | +20.4 ± 14.4 | +21.2 ± 7.5 |
| casey.Flee 1.0 | +5.0 ± 6.2 | +3.1 ± 3.8 | -8.6 ± 9.9 | -11.5 ± 8.3 |
| davidalves.net.DuelistMicroMkII 1.1 | +7.5 ± 10.9 | +5.0 ± 6.7 | +6.6 ± 8.9 | +4.0 ± 5.0 |
| davidalves.net.DuelistMini 1.1 | +2.5 ± 6.6 | +1.9 ± 2.1 | +23.6 ± 14.4 | +9.7 ± 8.2 |
| ds.OoV4 0.3b | +1.2 ± 4.7 | +1.4 ± 3.5 | -14.1 ± 9.9 | -28.5 ± 11.2 |
| florent.small.LittleAngel 1.8 | +6.2 ± 8.5 | +4.9 ± 6.7 | -10.5 ± 9.0 | -18.8 ± 8.0 |
| gh.GrubbmGrb 1.2.4 | +2.5 ± 7.7 | +1.9 ± 7.6 | -3.1 ± 6.4 | +1.4 ± 13.0 |
| ins.MobyNano 0.8 | +1.3 ± 8.2 | +1.2 ± 1.8 | -10.5 ± 11.9 | -10.8 ± 7.6 |
| jam.mini.Raiko 0.43 | +17.5 ± 9.4 | +6.5 ± 5.2 | +5.0 ± 10.2 | -3.9 ± 14.7 |
| jcs.Decepticon 2.5.3 | +0.0 ± 7.8 | +3.7 ± 5.5 | -14.1 ± 8.7 | -7.2 ± 7.6 |
| jekl.DarkHallow .90.9 | +6.3 ± 11.5 | +14.0 ± 6.0 | -4.7 ± 11.4 | +14.6 ± 13.4 |
| jekl.Jekyl .70 | +6.2 ± 6.4 | +1.2 ± 4.7 | +3.8 ± 14.5 | +1.6 ± 7.4 |
| jekl.mini.BlackPearl .91 | +5.0 ± 12.6 | +6.4 ± 5.8 | +2.8 ± 15.5 | +25.4 ± 10.2 |
| kawigi.mini.Coriantumr 1.1 | +2.5 ± 5.3 | +1.9 ± 2.1 | +15.3 ± 7.3 | +8.0 ± 6.2 |
| kc.micro.Thorn 1.252 | +1.3 ± 9.1 | +5.0 ± 6.2 | -2.1 ± 10.4 | -0.6 ± 10.2 |
| lrem.magic.TormentedAngel Antiquitie | -1.2 ± 6.1 | -0.6 ± 3.1 | -28.9 ± 14.4 | -30.0 ± 9.1 |
| lucasslf.HariSeldon 0.2.1 | +6.2 ± 6.4 | +3.1 ± 3.2 | +9.9 ± 8.6 | +9.9 ± 10.1 |
| lucasslf.Wiggins 0.6 | +1.2 ± 7.2 | +5.1 ± 5.2 | -12.5 ± 7.2 | +7.3 ± 7.5 |
| metal.small.MCool 1.21 | -1.2 ± 4.7 | -0.6 ± 1.3 | -6.1 ± 18.9 | -4.5 ± 9.2 |
| metal.small.dna2.MCoolDNA 1.5 | +16.3 ± 8.0 | +8.8 ± 6.4 | +3.8 ± 13.1 | -6.6 ± 7.9 |
| mnt.AHEB 0.6a | +16.3 ± 8.9 | +2.0 ± 4.6 | -5.6 ± 16.8 | -12.1 ± 13.0 |
| myl.micro.NekoNinja 1.30 | +5.0 ± 8.3 | +1.9 ± 2.1 | +12.7 ± 8.5 | +4.9 ± 9.4 |
| nat.Hikari dev0001 | +10.0 ± 7.8 | +3.1 ± 3.2 | -14.6 ± 7.5 | -23.9 ± 7.9 |
| nat.nano.OcnirpPM 1.0 | +1.2 ± 4.7 | -6.9 ± 5.1 | -15.6 ± 10.8 | -9.0 ± 8.4 |
| nat.nano.Ocnirp 1.73 | +2.5 ± 9.4 | -1.3 ± 5.8 | -14.8 ± 13.0 | -17.1 ± 8.2 |
| pe.mini.SandboxMini 1.2 | +0.0 ± 5.5 | +2.6 ± 4.6 | -11.3 ± 10.6 | +1.4 ± 7.9 |
| pez.clean.Swiffer 0.2.9 | +10.0 ± 10.3 | +39.1 ± 17.1 | +2.5 ± 16.5 | +26.4 ± 19.9 |
| pez.mako.Mako 1.5 | +7.5 ± 5.3 | +4.4 ± 4.8 | +0.6 ± 14.6 | -2.9 ± 9.4 |
| ph.mini.Archer 0.6.6 | +7.5 ± 9.4 | +6.3 ± 7.3 | -15.6 ± 16.0 | -24.4 ± 9.1 |
| pkbots.BoyTDSurfer 1.0 | +20.0 ± 12.3 | +7.4 ± 5.4 | -18.7 ± 6.3 | -14.3 ± 10.0 |
| rcb.Vanessa03 0 | -2.5 ± 10.2 | +1.5 ± 6.3 | -9.6 ± 8.4 | +1.6 ± 10.8 |
| rdt.AgentSmith.AgentSmith 0.5 | +11.3 ± 9.5 | +14.3 ± 5.9 | -14.2 ± 11.6 | +9.9 ± 11.9 |
| robar.micro.Kirbyi 1.0 | -2.5 ± 6.6 | +6.3 ± 4.7 | -7.9 ± 9.7 | -4.9 ± 5.5 |
| rz.Aleph 0.34 | +7.5 ± 7.7 | +2.4 ± 5.5 | +17.3 ± 14.6 | -18.5 ± 6.8 |
| simonton.beta.LifelongObsession 0.5.1 | +22.5 ± 10.9 | +23.9 ± 7.7 | +8.0 ± 12.6 | +15.8 ± 8.7 |
| simonton.micro.GFMicro 1.0 | +5.0 ± 6.2 | +3.1 ± 3.2 | -5.9 ± 5.8 | +7.6 ± 6.3 |
| simonton.mini.WeeksOnEnd 1.10.4 | +12.5 ± 6.6 | +18.9 ± 7.8 | +3.6 ± 13.0 | +9.7 ± 6.2 |
| simonton.nano.WeekendObsession_S 1.7 | -7.5 ± 6.6 | +0.6 ± 3.1 | -10.3 ± 11.7 | -9.1 ± 7.6 |
| spinnercat.CopyKat 1.2.3 | -2.5 ± 5.3 | +4.4 ± 3.4 | -22.7 ± 12.1 | +21.2 ± 5.6 |
| starpkg.StarViewerZ 1.26 | +3.7 ± 4.3 | +0.6 ± 1.3 | -22.0 ± 10.7 | -29.9 ± 14.8 |
| stefw.Tigger 0.0.23 | +13.7 ± 10.8 | +5.3 ± 5.5 | -12.4 ± 9.2 | -14.5 ± 6.9 |
| stelo.Randomness 1.1 | -3.8 ± 8.0 | +0.0 ± 2.8 | -6.1 ± 11.8 | -10.3 ± 7.9 |
| stelo.SteloTestNano 1.0 | +1.2 ± 7.2 | +1.9 ± 2.1 | +8.7 ± 14.2 | +1.9 ± 7.2 |
| suh.nano.RandomPM 1.02 | +6.2 ± 5.1 | +2.5 ± 5.3 | -32.2 ± 16.6 | -29.0 ± 8.4 |
| syl.Centipede 0.5 | +5.0 ± 6.2 | +3.1 ± 3.2 | +15.7 ± 13.4 | +9.8 ± 9.0 |
| theo.Tungsten 1.0a | +3.7 ± 5.8 | +7.3 ± 5.8 | +8.2 ± 8.9 | +5.0 ± 8.3 |
| tide.pear.Pear 0.62.1 | +12.5 ± 6.6 | +14.1 ± 5.4 | -7.7 ± 3.8 | +38.3 ± 3.8 |
| trm.Wrekt 1.1.6.f | +12.5 ± 9.4 | +12.5 ± 7.7 | -16.4 ± 9.5 | +0.7 ± 11.0 |
| tw.Exterminator 1.0 | +16.2 ± 7.0 | +20.8 ± 8.0 | -1.3 ± 6.1 | -22.3 ± 16.9 |
| tzu.TheArtOfWar 1.2 | +1.2 ± 2.7 | +0.6 ± 1.3 | +9.9 ± 5.3 | +5.9 ± 5.3 |
| vuen.Fractal 0.55 | +2.5 ± 5.3 | +2.5 ± 2.4 | +17.4 ± 11.1 | +17.1 ± 4.6 |
| wcsv.Engineer.Engineer 0.5.4 | -0.0 ± 11.0 | +15.6 ± 7.9 | -10.1 ± 5.0 | +13.8 ± 5.5 |
| wiki.mini.BlackDestroyer 0.9.0 | +12.5 ± 12.2 | +5.6 ± 5.5 | -0.5 ± 9.6 | -6.9 ± 7.5 |
| wilson.Chameleon 0.91 | +16.2 ± 9.7 | +5.0 ± 5.8 | +31.7 ± 9.8 | +15.1 ± 8.4 |
| zen.Lindada 0.2 | +6.2 ± 6.4 | +2.5 ± 2.4 | -3.9 ± 13.9 | +14.8 ± 5.9 |
