# Bench: hadur2.Hadur 3.9 (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 3735 over 320 battles (11.7 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | mid | 64.0% ± 3.5 | 77.5% ± 4.3 | 51.9% ± 3.3 | 217 / 280 | 12.6% ± 0.5 | 9.4% ± 0.5 | 118 | 0 | 1.34 / 19.2 |
| alk.lap.LoudAndProud 2.23 | mid | 81.5% ± 2.1 | 95.7% ± 2.6 | 65.8% ± 2.7 | 268 / 280 | 14.8% ± 1.0 | 5.3% ± 0.4 | 82 | 0 | 1.21 / 15.5 |
| axeBots.Musashi 2.18 | mid | 75.0% ± 4.1 | 86.4% ± 4.2 | 64.3% ± 4.6 | 242 / 280 | 14.2% ± 0.8 | 7.4% ± 0.3 | 102 | 0 | 1.20 / 23.8 |
| axeBots.Okami 1.04 | mid | 76.4% ± 3.5 | 88.9% ± 5.3 | 64.6% ± 2.3 | 249 / 280 | 13.7% ± 0.8 | 7.3% ± 0.6 | 215 | 0 | 1.32 / 35.1 |
| cjm.Charo 1.1 | mid | 80.7% ± 3.4 | 96.1% ± 3.4 | 63.5% ± 3.2 | 269 / 280 | 14.4% ± 0.8 | 5.1% ± 0.7 | 72 | 0 | 0.87 / 156.4 |
| cx.micro.Spark 0.6 | mid | 79.4% ± 3.0 | 92.5% ± 2.8 | 65.6% ± 3.4 | 259 / 280 | 14.5% ± 0.9 | 6.1% ± 0.7 | 83 | 0 | 1.04 / 15.4 |
| cx.mini.Cigaret 1.31 | mid | 76.2% ± 3.9 | 91.8% ± 4.3 | 59.6% ± 2.8 | 257 / 280 | 13.3% ± 0.9 | 5.4% ± 0.8 | 91 | 0 | 2.16 / 15.4 |
| davidalves.PhoenixOS 1.1 | mid | 68.2% ± 2.5 | 82.1% ± 3.6 | 54.1% ± 1.9 | 230 / 280 | 13.0% ± 0.9 | 7.0% ± 0.4 | 98 | 0 | 0.96 / 294.3 |
| deo.CloudBot 1.3 | mid | 81.0% ± 1.3 | 94.6% ± 2.0 | 67.7% ± 3.3 | 265 / 280 | 17.2% ± 1.5 | 6.8% ± 0.6 | 90 | 0 | 0.91 / 255.3 |
| dft.Immortal 1.40 | mid | 70.3% ± 2.9 | 87.1% ± 3.1 | 52.4% ± 3.9 | 244 / 280 | 11.2% ± 0.5 | 6.6% ± 0.6 | 72 | 0 | 1.01 / 219.5 |
| dmh.robocode.robot.BlackDeath 9.2 | mid | 87.4% ± 2.1 | 97.5% ± 2.0 | 77.4% ± 2.3 | 273 / 280 | 19.5% ± 0.6 | 5.4% ± 0.6 | 90 | 0 | 0.95 / 14.9 |
| dragonbyte.Neutrino 4 | mid | 80.1% ± 3.3 | 52.5% ± 7.0 | 99.8% ± 0.1 | 147 / 280 | 15.0% ± 0.4 | 0.4% ± 0.2 | 73 | 0 | 0.67 / 23.6 |
| drm.Magazine 0.39 | mid | 76.1% ± 1.8 | 91.4% ± 3.6 | 60.5% ± 1.6 | 256 / 280 | 14.7% ± 0.8 | 5.8% ± 0.6 | 91 | 0 | 1.22 / 16.5 |
| dz.GalbaMini 0.121 | mid | 72.1% ± 4.8 | 87.1% ± 6.4 | 57.6% ± 4.1 | 244 / 280 | 13.3% ± 1.1 | 7.5% ± 0.7 | 82 | 0 | 0.92 / 14.5 |
| eem.zapper v6.03 | mid | 71.5% ± 4.2 | 88.6% ± 4.4 | 53.9% ± 4.3 | 248 / 280 | 11.3% ± 0.4 | 7.6% ± 0.5 | 133 | 0 | 2.21 / 26.4 |
| fromHell.C22H30N2O2S 2.2 | mid | 77.6% ± 3.0 | 91.4% ± 4.6 | 64.8% ± 2.2 | 256 / 280 | 17.0% ± 0.9 | 7.6% ± 0.7 | 77 | 0 | 0.87 / 93.1 |
| hlavko.micro.Flex 1.5 | mid | 82.1% ± 3.6 | 93.6% ± 3.3 | 71.2% ± 4.0 | 262 / 280 | 22.9% ± 1.8 | 7.0% ± 0.8 | 76 | 0 | 0.88 / 14.4 |
| jk.micro.Cotillion 0.8 | mid | 66.0% ± 4.2 | 81.7% ± 5.9 | 50.1% ± 3.1 | 229 / 280 | 11.5% ± 0.6 | 7.0% ± 0.6 | 91 | 0 | 1.10 / 15.1 |
| jk.sheldor.nano.Yatagan 1.2.3 | mid | 75.6% ± 3.0 | 84.6% ± 3.8 | 67.3% ± 2.5 | 237 / 280 | 21.9% ± 0.8 | 9.2% ± 1.0 | 72 | 0 | 0.84 / 13.2 |
| lazarecki.mega.PinkerStinker 0.7 | mid | 75.6% ± 3.0 | 86.8% ± 5.4 | 64.8% ± 1.2 | 243 / 280 | 14.6% ± 0.3 | 7.4% ± 0.3 | 131 | 0 | 0.97 / 158.4 |
| lj.Dapps 0.2 | mid | 82.3% ± 1.7 | 95.0% ± 2.8 | 69.9% ± 1.6 | 266 / 280 | 15.4% ± 1.3 | 7.2% ± 0.6 | 87 | 0 | 0.87 / 78.2 |
| nat.Samekh 0.4 | mid | 68.4% ± 5.7 | 83.9% ± 6.0 | 52.5% ± 4.7 | 235 / 280 | 11.0% ± 0.4 | 7.1% ± 0.7 | 100 | 0 | 1.12 / 252.9 |
| nz.jdc.nano.NeophytePRAL 1.4 | mid | 89.6% ± 1.0 | 99.3% ± 1.1 | 81.2% ± 1.6 | 278 / 280 | 20.1% ± 0.6 | 9.3% ± 0.8 | 80 | 0 | 0.77 / 250.2 |
| origin.SleepSiphon 1.7b | mid | 91.3% ± 1.2 | 99.6% ± 0.8 | 83.1% ± 2.5 | 279 / 280 | 19.1% ± 0.6 | 4.6% ± 0.6 | 87 | 0 | 1.00 / 197.8 |
| pe.SandboxLump 1.52 | mid | 78.5% ± 3.7 | 90.7% ± 4.4 | 67.3% ± 3.5 | 254 / 280 | 18.5% ± 0.7 | 7.6% ± 0.9 | 94 | 0 | 0.89 / 15.6 |
| penguin.Ivy 1.1r | mid | 84.4% ± 3.2 | 91.4% ± 3.4 | 77.0% ± 3.8 | 256 / 280 | 14.5% ± 0.7 | 5.6% ± 0.7 | 100 | 0 | 0.89 / 56.4 |
| penguin.MrFreeze 1.0a | mid | 86.8% ± 2.7 | 97.5% ± 2.7 | 75.6% ± 3.1 | 273 / 280 | 14.1% ± 0.8 | 7.7% ± 0.6 | 156 | 0 | 1.07 / 52.0 |
| pez.mini.VertiLeach 0.4.0 | mid | 99.2% ± 0.8 | 100.0% ± 0.0 | 79.3% ± 15.6 | 280 / 280 | 0.6% ± 0.2 | 0.3% ± 0.3 | 78 | 0 | 0.53 / 158.5 |
| rampancy.Durandal 2.2d | mid | 77.2% ± 3.5 | 90.0% ± 4.6 | 65.6% ± 2.7 | 252 / 280 | 18.7% ± 1.7 | 8.2% ± 0.7 | 85 | 0 | 0.87 / 16.2 |
| ry.VirtualGunExperiment 1.2.0 | mid | 80.5% ± 4.1 | 93.9% ± 4.7 | 65.3% ± 4.4 | 263 / 280 | 12.2% ± 0.6 | 5.8% ± 0.6 | 91 | 0 | 1.04 / 16.6 |
| sheldor.micro.EpeeistDC 3.0 | mid | 74.9% ± 4.4 | 91.4% ± 4.4 | 57.8% ± 4.0 | 256 / 280 | 12.0% ± 0.6 | 6.7% ± 0.3 | 98 | 0 | 1.24 / 13.6 |
| sheldor.micro.PointInLineRRAL 1.0 | mid | 85.9% ± 4.0 | 97.1% ± 3.4 | 71.5% ± 5.0 | 272 / 280 | 11.9% ± 0.6 | 4.5% ± 0.9 | 92 | 0 | 0.94 / 17.1 |
| sheldor.nano.FoilistNano 3.2 | mid | 73.6% ± 3.4 | 85.4% ± 5.8 | 63.8% ± 1.9 | 239 / 280 | 18.0% ± 0.9 | 10.5% ± 0.9 | 79 | 0 | 0.96 / 13.8 |
| slugzilla.ButtHead 2.0 | mid | 69.4% ± 3.5 | 95.0% ± 4.2 | 60.6% ± 1.9 | 266 / 280 | 71.5% ± 2.5 | 53.6% ± 3.6 | 86 | 0 | 0.57 / 25.6 |
| slugzilla.RandomGF 1.0 | mid | 77.9% ± 3.6 | 94.3% ± 3.8 | 58.0% ± 4.1 | 264 / 280 | 11.1% ± 0.5 | 5.4% ± 0.5 | 89 | 0 | 0.87 / 15.9 |
| sos.SOS 1.0 | mid | 89.8% ± 1.8 | 98.6% ± 1.8 | 80.5% ± 2.9 | 276 / 280 | 16.4% ± 1.7 | 5.5% ± 0.4 | 83 | 0 | 0.81 / 17.6 |
| stelo.Chord 1.0 | mid | 81.8% ± 3.6 | 93.9% ± 4.3 | 68.1% ± 3.6 | 263 / 280 | 14.1% ± 1.4 | 5.2% ± 0.8 | 79 | 0 | 0.87 / 156.3 |
| stelo.PastFuture 2.3.2 | mid | 63.0% ± 3.3 | 75.7% ± 4.8 | 51.6% ± 2.3 | 212 / 280 | 12.6% ± 0.7 | 8.6% ± 0.5 | 79 | 0 | 1.22 / 19.1 |
| synnalagma.NeuralPremier 0.51 | mid | 82.9% ± 2.7 | 91.4% ± 3.8 | 74.8% ± 2.1 | 256 / 280 | 18.3% ± 0.9 | 7.2% ± 0.6 | 80 | 0 | 0.83 / 32.3 |
| xander.cat.SamAxe 1.1 | mid | 86.6% ± 2.2 | 97.1% ± 2.6 | 76.9% ± 2.5 | 272 / 280 | 20.2% ± 0.7 | 7.3% ± 0.6 | 73 | 0 | 0.90 / 223.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 8 | 1784 | 22.1% | 68.0% | 0.0% | 9.9% | 986 |
| alk.lap.LoudAndProud 2.23 | 8 | 836 | 9.0% | 87.2% | 0.0% | 3.9% | 572 |
| axeBots.Musashi 2.18 | 8 | 1228 | 19.3% | 72.8% | 0.0% | 7.9% | 1028 |
| axeBots.Okami 1.04 | 8 | 1151 | 16.8% | 76.0% | 0.0% | 7.2% | 1018 |
| cjm.Charo 1.1 | 8 | 867 | 7.9% | 88.6% | 0.0% | 3.4% | 619 |
| cx.micro.Spark 0.6 | 8 | 952 | 13.8% | 80.1% | 0.0% | 6.1% | 659 |
| cx.mini.Cigaret 1.31 | 8 | 1079 | 13.3% | 79.9% | 0.1% | 6.6% | 669 |
| davidalves.PhoenixOS 1.1 | 8 | 1459 | 21.4% | 70.1% | 0.0% | 8.4% | 1054 |
| deo.CloudBot 1.3 | 8 | 939 | 10.0% | 85.8% | 0.2% | 4.0% | 660 |
| dft.Immortal 1.40 | 8 | 1323 | 17.0% | 76.1% | 0.0% | 6.9% | 876 |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 637 | 6.9% | 90.1% | 0.0% | 3.0% | 547 |
| dragonbyte.Neutrino 4 | 8 | 1004 | 82.8% | 0.6% | 0.0% | 16.6% | 1927 |
| drm.Magazine 0.39 | 8 | 1113 | 13.5% | 80.2% | 0.0% | 6.3% | 609 |
| dz.GalbaMini 0.121 | 8 | 1355 | 16.6% | 76.1% | 0.0% | 7.3% | 766 |
| eem.zapper v6.03 | 8 | 1303 | 15.4% | 78.3% | 0.0% | 6.4% | 1126 |
| fromHell.C22H30N2O2S 2.2 | 8 | 1134 | 13.2% | 81.1% | 0.0% | 5.7% | 566 |
| hlavko.micro.Flex 1.5 | 8 | 917 | 12.3% | 82.6% | 0.0% | 5.1% | 522 |
| jk.micro.Cotillion 0.8 | 8 | 1544 | 20.6% | 70.5% | 0.0% | 8.8% | 854 |
| jk.sheldor.nano.Yatagan 1.2.3 | 8 | 1307 | 20.6% | 71.3% | 0.0% | 8.2% | 559 |
| lazarecki.mega.PinkerStinker 0.7 | 8 | 1206 | 19.2% | 72.8% | 0.0% | 8.0% | 842 |
| lj.Dapps 0.2 | 8 | 889 | 9.8% | 86.2% | 0.1% | 3.9% | 750 |
| nat.Samekh 0.4 | 8 | 1459 | 19.3% | 72.4% | 0.0% | 8.3% | 868 |
| nz.jdc.nano.NeophytePRAL 1.4 | 8 | 577 | 2.2% | 97.0% | 0.0% | 0.8% | 546 |
| origin.SleepSiphon 1.7b | 8 | 438 | 1.4% | 97.9% | 0.0% | 0.7% | 595 |
| pe.SandboxLump 1.52 | 8 | 1120 | 14.5% | 79.2% | 0.0% | 6.3% | 536 |
| penguin.Ivy 1.1r | 8 | 761 | 19.7% | 72.5% | 0.0% | 7.8% | 891 |
| penguin.MrFreeze 1.0a | 8 | 636 | 6.9% | 90.4% | 0.0% | 2.8% | 843 |
| pez.mini.VertiLeach 0.4.0 | 8 | 18 | 0.0% | 88.1% | 11.9% | 0.0% | 161 |
| rampancy.Durandal 2.2d | 8 | 1186 | 14.8% | 78.9% | 0.0% | 6.3% | 613 |
| ry.VirtualGunExperiment 1.2.0 | 8 | 879 | 12.1% | 83.0% | 0.0% | 4.9% | 877 |
| sheldor.micro.EpeeistDC 3.0 | 8 | 1164 | 12.9% | 81.6% | 0.0% | 5.5% | 963 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 596 | 8.4% | 88.5% | 0.0% | 3.1% | 912 |
| sheldor.nano.FoilistNano 3.2 | 8 | 1460 | 17.5% | 75.2% | 0.0% | 7.2% | 579 |
| slugzilla.ButtHead 2.0 | 8 | 2944 | 3.0% | 82.6% | 12.4% | 2.0% | 317 |
| slugzilla.RandomGF 1.0 | 8 | 930 | 10.8% | 85.0% | 0.0% | 4.3% | 759 |
| sos.SOS 1.0 | 8 | 489 | 5.1% | 92.8% | 0.3% | 1.8% | 728 |
| stelo.Chord 1.0 | 8 | 825 | 12.9% | 82.1% | 0.0% | 5.0% | 709 |
| stelo.PastFuture 2.3.2 | 8 | 1832 | 23.2% | 66.4% | 0.2% | 10.2% | 769 |
| synnalagma.NeuralPremier 0.51 | 8 | 895 | 16.8% | 76.3% | 0.2% | 6.7% | 636 |
| xander.cat.SamAxe 1.1 | 8 | 718 | 7.0% | 90.3% | 0.0% | 2.7% | 568 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 8 | 8 | 0 | 0 | 0.42 | 0 | 0 | 0 |
| alk.lap.LoudAndProud 2.23 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| axeBots.Musashi 2.18 | 8 | 7 | 0 | 0 | 0.36 | 1 | 1 | 0 |
| axeBots.Okami 1.04 | 8 | 5 | 894 | 0 | 0.77 | 0 | 0 | 0 |
| cjm.Charo 1.1 | 8 | 6 | 0 | 0 | 0.26 | 2 | 2 | 0 |
| cx.micro.Spark 0.6 | 8 | 7 | 298 | 0 | 0.30 | 0 | 0 | 0 |
| cx.mini.Cigaret 1.31 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| davidalves.PhoenixOS 1.1 | 8 | 6 | 0 | 0 | 0.35 | 2 | 2 | 0 |
| deo.CloudBot 1.3 | 8 | 7 | 298 | 0 | 0.32 | 0 | 0 | 0 |
| dft.Immortal 1.40 | 8 | 5 | 0 | 0 | 0.26 | 3 | 3 | 0 |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| dragonbyte.Neutrino 4 | 8 | 6 | 298 | 0 | 0.26 | 2 | 2 | 0 |
| drm.Magazine 0.39 | 8 | 7 | 298 | 0 | 0.33 | 0 | 0 | 0 |
| dz.GalbaMini 0.121 | 8 | 6 | 0 | 0 | 0.29 | 2 | 2 | 0 |
| eem.zapper v6.03 | 8 | 6 | 0 | 0 | 0.48 | 2 | 2 | 0 |
| fromHell.C22H30N2O2S 2.2 | 8 | 6 | 298 | 0 | 0.28 | 1 | 1 | 0 |
| hlavko.micro.Flex 1.5 | 8 | 8 | 0 | 0 | 0.27 | 0 | 0 | 0 |
| jk.micro.Cotillion 0.8 | 8 | 6 | 0 | 0 | 0.33 | 2 | 1 | 0 |
| jk.sheldor.nano.Yatagan 1.2.3 | 8 | 6 | 0 | 0 | 0.26 | 2 | 2 | 0 |
| lazarecki.mega.PinkerStinker 0.7 | 8 | 7 | 298 | 0 | 0.47 | 0 | 0 | 0 |
| lj.Dapps 0.2 | 8 | 7 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| nat.Samekh 0.4 | 8 | 5 | 596 | 0 | 0.36 | 3 | 3 | 0 |
| nz.jdc.nano.NeophytePRAL 1.4 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| origin.SleepSiphon 1.7b | 8 | 7 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| pe.SandboxLump 1.52 | 8 | 7 | 298 | 0 | 0.34 | 0 | 0 | 0 |
| penguin.Ivy 1.1r | 8 | 7 | 298 | 0 | 0.36 | 0 | 0 | 0 |
| penguin.MrFreeze 1.0a | 8 | 7 | 298 | 1 | 0.56 | 0 | 0 | 0 |
| pez.mini.VertiLeach 0.4.0 | 8 | 7 | 298 | 1 | 0.28 | 0 | 0 | 8 |
| rampancy.Durandal 2.2d | 8 | 7 | 298 | 0 | 0.30 | 0 | 0 | 0 |
| ry.VirtualGunExperiment 1.2.0 | 8 | 6 | 298 | 0 | 0.33 | 1 | 1 | 0 |
| sheldor.micro.EpeeistDC 3.0 | 8 | 5 | 298 | 0 | 0.35 | 2 | 2 | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 6 | 596 | 0 | 0.33 | 0 | 0 | 0 |
| sheldor.nano.FoilistNano 3.2 | 8 | 7 | 0 | 0 | 0.28 | 1 | 1 | 0 |
| slugzilla.ButtHead 2.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| slugzilla.RandomGF 1.0 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| sos.SOS 1.0 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| stelo.Chord 1.0 | 8 | 6 | 298 | 0 | 0.28 | 1 | 1 | 0 |
| stelo.PastFuture 2.3.2 | 8 | 3 | 0 | 0 | 0.28 | 5 | 5 | 0 |
| synnalagma.NeuralPremier 0.51 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| xander.cat.SamAxe 1.1 | 8 | 7 | 0 | 0 | 0.26 | 1 | 1 | 0 |

267 of 320 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 17295 | 70 | 17290 | 17286 (99.9%) | 9 (0.1%) | 4 (0.0%) | 1072 | 280 | 68 |
| alk.lap.LoudAndProud 2.23 | 6944 | 8 | 6945 | 6942 (100.0%) | 2 (0.0%) | 3 (0.0%) | 142 | 89 | 25 |
| axeBots.Musashi 2.18 | 12636 | 11 | 14251 | 12634 (100.0%) | 2 (0.0%) | 1617 (11.3%) | 1359 | 185 | 52 |
| axeBots.Okami 1.04 | 12114 | 6 | 13718 | 12053 (99.5%) | 61 (0.5%) | 1665 (12.1%) | 1218 | 170 | 151 |
| cjm.Charo 1.1 | 6799 | 7 | 6812 | 6799 (100.0%) | 0 (0.0%) | 13 (0.2%) | 292 | 98 | 21 |
| cx.micro.Spark 0.6 | 8753 | 12 | 8733 | 8732 (99.8%) | 21 (0.2%) | 1 (0.0%) | 265 | 126 | 27 |
| cx.mini.Cigaret 1.31 | 7284 | 6 | 7303 | 7284 (100.0%) | 0 (0.0%) | 19 (0.3%) | 361 | 90 | 31 |
| davidalves.PhoenixOS 1.1 | 12966 | 7 | 13726 | 12966 (100.0%) | 0 (0.0%) | 760 (5.5%) | 1783 | 133 | 54 |
| deo.CloudBot 1.3 | 9597 | 9 | 9575 | 9575 (99.8%) | 22 (0.2%) | 0 (0.0%) | 306 | 135 | 26 |
| dft.Immortal 1.40 | 12073 | 8 | 12093 | 12072 (100.0%) | 1 (0.0%) | 21 (0.2%) | 736 | 127 | 24 |
| dmh.robocode.robot.BlackDeath 9.2 | 7138 | 28 | 7138 | 7138 (100.0%) | 0 (0.0%) | 0 (0.0%) | 221 | 106 | 34 |
| dragonbyte.Neutrino 4 | 25284 | 0 | 38495 | 25257 (99.9%) | 27 (0.1%) | 13238 (34.4%) | 3598 | 170 | 23 |
| drm.Magazine 0.39 | 7459 | 33 | 7436 | 7436 (99.7%) | 23 (0.3%) | 0 (0.0%) | 266 | 122 | 35 |
| dz.GalbaMini 0.121 | 11486 | 18 | 11485 | 11485 (100.0%) | 1 (0.0%) | 0 (0.0%) | 454 | 151 | 30 |
| eem.zapper v6.03 | 20170 | 21 | 20217 | 20169 (100.0%) | 1 (0.0%) | 48 (0.2%) | 1332 | 194 | 90 |
| fromHell.C22H30N2O2S 2.2 | 7141 | 16 | 7126 | 7119 (99.7%) | 22 (0.3%) | 7 (0.1%) | 293 | 137 | 20 |
| hlavko.micro.Flex 1.5 | 6461 | 33 | 6463 | 6455 (99.9%) | 6 (0.1%) | 8 (0.1%) | 533 | 125 | 23 |
| jk.micro.Cotillion 0.8 | 11812 | 9 | 11802 | 11790 (99.8%) | 22 (0.2%) | 12 (0.1%) | 693 | 122 | 45 |
| jk.sheldor.nano.Yatagan 1.2.3 | 7479 | 13 | 7481 | 7472 (99.9%) | 7 (0.1%) | 9 (0.1%) | 484 | 145 | 19 |
| lazarecki.mega.PinkerStinker 0.7 | 10782 | 10 | 10794 | 10764 (99.8%) | 18 (0.2%) | 30 (0.3%) | 787 | 161 | 63 |
| lj.Dapps 0.2 | 11995 | 60 | 11975 | 11972 (99.8%) | 23 (0.2%) | 3 (0.0%) | 544 | 162 | 27 |
| nat.Samekh 0.4 | 13062 | 87 | 13025 | 13024 (99.7%) | 38 (0.3%) | 1 (0.0%) | 634 | 129 | 51 |
| nz.jdc.nano.NeophytePRAL 1.4 | 7706 | 25 | 7718 | 7701 (99.9%) | 5 (0.1%) | 17 (0.2%) | 489 | 175 | 20 |
| origin.SleepSiphon 1.7b | 8600 | 27 | 8581 | 8581 (99.8%) | 19 (0.2%) | 0 (0.0%) | 306 | 126 | 22 |
| pe.SandboxLump 1.52 | 6194 | 16 | 6176 | 6176 (99.7%) | 18 (0.3%) | 0 (0.0%) | 119 | 115 | 28 |
| penguin.Ivy 1.1r | 7215 | 4 | 7209 | 7205 (99.9%) | 10 (0.1%) | 4 (0.1%) | 719 | 75 | 33 |
| penguin.MrFreeze 1.0a | 13649 | 21 | 13649 | 13628 (99.8%) | 21 (0.2%) | 21 (0.2%) | 455 | 167 | 57 |
| pez.mini.VertiLeach 0.4.0 | 179 | 2 | 161 | 161 (89.9%) | 18 (10.1%) | 0 (0.0%) | 14 | 3 | 10 |
| rampancy.Durandal 2.2d | 7752 | 16 | 7735 | 7733 (99.8%) | 19 (0.2%) | 2 (0.0%) | 446 | 150 | 25 |
| ry.VirtualGunExperiment 1.2.0 | 13701 | 18 | 13677 | 13675 (99.8%) | 26 (0.2%) | 2 (0.0%) | 575 | 137 | 53 |
| sheldor.micro.EpeeistDC 3.0 | 17002 | 70 | 16981 | 16975 (99.8%) | 27 (0.2%) | 6 (0.0%) | 908 | 148 | 126 |
| sheldor.micro.PointInLineRRAL 1.0 | 14699 | 3 | 14657 | 14655 (99.7%) | 44 (0.3%) | 2 (0.0%) | 706 | 117 | 32 |
| sheldor.nano.FoilistNano 3.2 | 8060 | 12 | 8063 | 8054 (99.9%) | 6 (0.1%) | 9 (0.1%) | 525 | 144 | 21 |
| slugzilla.ButtHead 2.0 | 2678 | 11 | 2679 | 2678 (100.0%) | 0 (0.0%) | 1 (0.0%) | 2085 | 277 | 22 |
| slugzilla.RandomGF 1.0 | 11436 | 8 | 11436 | 11436 (100.0%) | 0 (0.0%) | 0 (0.0%) | 437 | 107 | 35 |
| sos.SOS 1.0 | 11412 | 47 | 11412 | 11412 (100.0%) | 0 (0.0%) | 0 (0.0%) | 310 | 162 | 20 |
| stelo.Chord 1.0 | 10563 | 22 | 10541 | 10541 (99.8%) | 22 (0.2%) | 0 (0.0%) | 240 | 137 | 27 |
| stelo.PastFuture 2.3.2 | 11976 | 21 | 11975 | 11975 (100.0%) | 1 (0.0%) | 0 (0.0%) | 501 | 151 | 46 |
| synnalagma.NeuralPremier 0.51 | 7871 | 30 | 7871 | 7871 (100.0%) | 0 (0.0%) | 0 (0.0%) | 305 | 142 | 24 |
| xander.cat.SamAxe 1.1 | 7503 | 11 | 7504 | 7493 (99.9%) | 10 (0.1%) | 11 (0.1%) | 534 | 147 | 22 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.Glacier 0.3.2 | 18021 | 1612 (8.9%) | 15306 |
| alk.lap.LoudAndProud 2.23 | 8025 | 501 (6.2%) | 2670 |
| axeBots.Musashi 2.18 | 18805 | 1043 (5.5%) | 14752 |
| axeBots.Okami 1.04 | 18637 | 1015 (5.4%) | 13890 |
| cjm.Charo 1.1 | 9041 | 560 (6.2%) | 5708 |
| cx.micro.Spark 0.6 | 9970 | 733 (7.4%) | 7726 |
| cx.mini.Cigaret 1.31 | 10346 | 738 (7.1%) | 8787 |
| davidalves.PhoenixOS 1.1 | 19388 | 1121 (5.8%) | 14079 |
| deo.CloudBot 1.3 | 9636 | 963 (10.0%) | 7319 |
| dft.Immortal 1.40 | 15190 | 1333 (8.8%) | 13926 |
| dmh.robocode.robot.BlackDeath 9.2 | 7201 | 676 (9.4%) | 4912 |
| dragonbyte.Neutrino 4 | 38980 | 1618 (4.2%) | 25974 |
| drm.Magazine 0.39 | 9003 | 552 (6.1%) | 3534 |
| dz.GalbaMini 0.121 | 12464 | 1009 (8.1%) | 7631 |
| eem.zapper v6.03 | 21568 | 2171 (10.1%) | 18910 |
| fromHell.C22H30N2O2S 2.2 | 7614 | 588 (7.7%) | 2609 |
| hlavko.micro.Flex 1.5 | 6719 | 497 (7.4%) | 4282 |
| jk.micro.Cotillion 0.8 | 14844 | 1126 (7.6%) | 11680 |
| jk.sheldor.nano.Yatagan 1.2.3 | 7289 | 617 (8.5%) | 4289 |
| lazarecki.mega.PinkerStinker 0.7 | 14169 | 899 (6.3%) | 6901 |
| lj.Dapps 0.2 | 11898 | 1066 (9.0%) | 10072 |
| nat.Samekh 0.4 | 15016 | 1182 (7.9%) | 11001 |
| nz.jdc.nano.NeophytePRAL 1.4 | 6847 | 670 (9.8%) | 3623 |
| origin.SleepSiphon 1.7b | 8210 | 615 (7.5%) | 5478 |
| pe.SandboxLump 1.52 | 6993 | 546 (7.8%) | 2436 |
| penguin.Ivy 1.1r | 15117 | 674 (4.5%) | 3343 |
| penguin.MrFreeze 1.0a | 14078 | 1383 (9.8%) | 11729 |
| pez.mini.VertiLeach 0.4.0 | 201 | 13 (6.5%) | 0 |
| rampancy.Durandal 2.2d | 8670 | 619 (7.1%) | 4902 |
| ry.VirtualGunExperiment 1.2.0 | 14883 | 1292 (8.7%) | 9943 |
| sheldor.micro.EpeeistDC 3.0 | 17516 | 1661 (9.5%) | 15694 |
| sheldor.micro.PointInLineRRAL 1.0 | 16182 | 1118 (6.9%) | 13873 |
| sheldor.nano.FoilistNano 3.2 | 7623 | 647 (8.5%) | 5083 |
| slugzilla.ButtHead 2.0 | 2645 | 181 (6.8%) | 1179 |
| slugzilla.RandomGF 1.0 | 12423 | 1120 (9.0%) | 10488 |
| sos.SOS 1.0 | 11238 | 912 (8.1%) | 7086 |
| stelo.Chord 1.0 | 10864 | 1139 (10.5%) | 9578 |
| stelo.PastFuture 2.3.2 | 12290 | 1044 (8.5%) | 10280 |
| synnalagma.NeuralPremier 0.51 | 9017 | 735 (8.2%) | 6201 |
| xander.cat.SamAxe 1.1 | 7480 | 603 (8.1%) | 5318 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 650 | 425 | 650 | 836 | 37.6 / 34.7 | 618 | 4944 | 1514 |
| alk.lap.LoudAndProud 2.23 | 650 | 500 | 581 | 422 | 40.0 / 20.8 | 1437 | 6348 | 3126 |
| axeBots.Musashi 2.18 | 650 | 489 | 516 | 878 | 46.3 / 25.5 | 1333 | 1743 | 128 |
| axeBots.Okami 1.04 | 650 | 498 | 559 | 868 | 45.5 / 25.0 | 959 | 2233 | 83 |
| cjm.Charo 1.1 | 650 | 414 | 541 | 469 | 38.1 / 22.0 | 922 | 5665 | 53 |
| cx.micro.Spark 0.6 | 650 | 509 | 622 | 509 | 41.4 / 21.8 | 890 | 5454 | 158 |
| cx.mini.Cigaret 1.31 | 650 | 506 | 634 | 519 | 36.1 / 24.6 | 677 | 4811 | 137 |
| davidalves.PhoenixOS 1.1 | 650 | 467 | 459 | 906 | 34.4 / 29.2 | 1705 | 1386 | 117 |
| deo.CloudBot 1.3 | 650 | 369 | 431 | 510 | 48.3 / 23.0 | 2201 | 3522 | 2890 |
| dft.Immortal 1.40 | 650 | 497 | 619 | 726 | 31.7 / 28.7 | 283 | 5239 | 201 |
| dmh.robocode.robot.BlackDeath 9.2 | 650 | 471 | 416 | 397 | 55.8 / 16.4 | 3235 | 4949 | 0 |
| dragonbyte.Neutrino 4 | 650 | 418 | 400 | 1778 | 76.4 / 0.2 | 3959 | 10 | 22 |
| drm.Magazine 0.39 | 650 | 545 | 538 | 459 | 39.1 / 25.5 | 1428 | 6637 | 480 |
| dz.GalbaMini 0.121 | 650 | 445 | 650 | 616 | 39.9 / 29.5 | 784 | 5087 | 0 |
| eem.zapper v6.03 | 650 | 501 | 650 | 977 | 34.1 / 29.1 | 222 | 9809 | 8 |
| fromHell.C22H30N2O2S 2.2 | 650 | 360 | 522 | 416 | 48.2 / 26.3 | 2448 | 4852 | 1990 |
| hlavko.micro.Flex 1.5 | 650 | 336 | 409 | 372 | 53.3 / 21.7 | 2669 | 4519 | 326 |
| jk.micro.Cotillion 0.8 | 650 | 512 | 625 | 705 | 31.3 / 31.1 | 216 | 4651 | 244 |
| jk.sheldor.nano.Yatagan 1.2.3 | 650 | 319 | 400 | 409 | 54.6 / 26.6 | 2549 | 3609 | 1915 |
| lazarecki.mega.PinkerStinker 0.7 | 650 | 411 | 525 | 692 | 46.3 / 25.1 | 1649 | 3827 | 21 |
| lj.Dapps 0.2 | 650 | 432 | 575 | 600 | 50.8 / 21.9 | 1698 | 5460 | 836 |
| nat.Samekh 0.4 | 650 | 489 | 619 | 719 | 33.2 / 30.2 | 167 | 5707 | 2008 |
| nz.jdc.nano.NeophytePRAL 1.4 | 650 | 342 | 556 | 396 | 68.9 / 16.0 | 4359 | 4304 | 1025 |
| origin.SleepSiphon 1.7b | 650 | 479 | 400 | 445 | 60.0 / 12.3 | 3390 | 3949 | 42 |
| pe.SandboxLump 1.52 | 650 | 332 | 503 | 386 | 51.7 / 25.3 | 2498 | 5061 | 0 |
| penguin.Ivy 1.1r | 650 | 534 | 469 | 741 | 52.8 / 15.8 | 1560 | 1629 | 40 |
| penguin.MrFreeze 1.0a | 650 | 537 | 619 | 693 | 50.9 / 16.4 | 1043 | 5120 | 275 |
| pez.mini.VertiLeach 0.4.0 | 650 | 325 | 650 | 11 | 1.5 / 0.5 | 5 | 226 | 0 |
| rampancy.Durandal 2.2d | 650 | 383 | 438 | 463 | 50.9 / 26.7 | 2807 | 4059 | 2158 |
| ry.VirtualGunExperiment 1.2.0 | 650 | 512 | 650 | 725 | 39.2 / 20.9 | 354 | 3476 | 4234 |
| sheldor.micro.EpeeistDC 3.0 | 650 | 535 | 619 | 816 | 37.0 / 27.1 | 411 | 6328 | 1735 |
| sheldor.micro.PointInLineRRAL 1.0 | 650 | 519 | 431 | 762 | 37.8 / 15.1 | 430 | 8050 | 251 |
| sheldor.nano.FoilistNano 3.2 | 650 | 328 | 619 | 428 | 55.2 / 31.4 | 3545 | 3240 | 1686 |
| slugzilla.ButtHead 2.0 | 650 | 159 | 650 | 167 | 106.5 / 69.5 | 2146 | 2133 | 153 |
| slugzilla.RandomGF 1.0 | 650 | 533 | 591 | 609 | 31.3 / 22.6 | 239 | 4948 | 5527 |
| sos.SOS 1.0 | 650 | 401 | 463 | 578 | 53.7 / 13.0 | 1926 | 5222 | 1306 |
| stelo.Chord 1.0 | 650 | 459 | 484 | 558 | 41.0 / 19.4 | 1130 | 4039 | 3955 |
| stelo.PastFuture 2.3.2 | 650 | 450 | 641 | 616 | 37.1 / 34.8 | 708 | 2764 | 149 |
| synnalagma.NeuralPremier 0.51 | 650 | 380 | 453 | 486 | 57.9 / 19.5 | 3191 | 4545 | 187 |
| xander.cat.SamAxe 1.1 | 650 | 442 | 431 | 418 | 61.6 / 18.5 | 4150 | 3280 | 118 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 9.4% | 118 | 73 | 3 | 61.6 | 1601 / 1612 (99%) | 0 | 0 |
| alk.lap.LoudAndProud 2.23 | 5.3% | 82 | 228 | 3 | 24.8 | 500 / 501 (100%) | 0 | 0 |
| axeBots.Musashi 2.18 | 7.4% | 102 | 75 | 3 | 50.7 | 1043 / 1043 (100%) | 0 | 0 |
| axeBots.Okami 1.04 | 7.3% | 215 | 162 | 3 | 48.9 | 1008 / 1015 (99%) | 0 | 0 |
| cjm.Charo 1.1 | 5.1% | 72 | 49 | 3 | 24.2 | 560 / 560 (100%) | 0 | 0 |
| cx.micro.Spark 0.6 | 6.1% | 83 | 96 | 3 | 30.9 | 730 / 733 (100%) | 0 | 0 |
| cx.mini.Cigaret 1.31 | 5.4% | 91 | 107 | 3 | 26.0 | 738 / 738 (100%) | 0 | 0 |
| davidalves.PhoenixOS 1.1 | 7.0% | 98 | 821 | 3 | 48.5 | 1120 / 1121 (100%) | 0 | 0 |
| deo.CloudBot 1.3 | 6.8% | 90 | 1617 | 3 | 33.9 | 959 / 963 (100%) | 0 | 0 |
| dft.Immortal 1.40 | 6.6% | 72 | 68 | 3 | 42.7 | 1333 / 1333 (100%) | 0 | 0 |
| dmh.robocode.robot.BlackDeath 9.2 | 5.4% | 90 | 44 | 3 | 25.5 | 676 / 676 (100%) | 0 | 0 |
| dragonbyte.Neutrino 4 | 0.4% | 73 | 55 | 3 | 136.4 | 1618 / 1618 (100%) | 0 | 0 |
| drm.Magazine 0.39 | 5.8% | 91 | 688 | 3 | 26.5 | 549 / 552 (99%) | 0 | 0 |
| dz.GalbaMini 0.121 | 7.5% | 82 | 505 | 3 | 40.6 | 1009 / 1009 (100%) | 0 | 0 |
| eem.zapper v6.03 | 7.6% | 133 | 2839 | 2 | 71.8 | 2168 / 2171 (100%) | 0 | 0 |
| fromHell.C22H30N2O2S 2.2 | 7.6% | 77 | 45 | 3 | 25.3 | 587 / 588 (100%) | 0 | 0 |
| hlavko.micro.Flex 1.5 | 7.0% | 76 | 100 | 3 | 22.8 | 495 / 497 (100%) | 0 | 0 |
| jk.micro.Cotillion 0.8 | 7.0% | 91 | 362 | 3 | 41.7 | 1126 / 1126 (100%) | 0 | 0 |
| jk.sheldor.nano.Yatagan 1.2.3 | 9.2% | 72 | 246 | 3 | 26.3 | 616 / 617 (100%) | 0 | 0 |
| lazarecki.mega.PinkerStinker 0.7 | 7.4% | 131 | 333 | 3 | 38.4 | 899 / 899 (100%) | 0 | 0 |
| lj.Dapps 0.2 | 7.2% | 87 | 62 | 3 | 42.7 | 1064 / 1066 (100%) | 0 | 0 |
| nat.Samekh 0.4 | 7.1% | 100 | 417 | 3 | 46.0 | 1171 / 1182 (99%) | 0 | 0 |
| nz.jdc.nano.NeophytePRAL 1.4 | 9.3% | 80 | 45 | 3 | 27.6 | 669 / 670 (100%) | 0 | 0 |
| origin.SleepSiphon 1.7b | 4.6% | 87 | 42 | 3 | 30.6 | 615 / 615 (100%) | 0 | 0 |
| pe.SandboxLump 1.52 | 7.6% | 94 | 195 | 3 | 22.0 | 544 / 546 (100%) | 0 | 0 |
| penguin.Ivy 1.1r | 5.6% | 100 | 52 | 3 | 25.6 | 674 / 674 (100%) | 0 | 0 |
| penguin.MrFreeze 1.0a | 7.7% | 156 | 68 | 3 | 48.7 | 1377 / 1383 (100%) | 0 | 0 |
| pez.mini.VertiLeach 0.4.0 | 0.3% | 78 | 16 | 3 | 0.6 | 12 / 13 (92%) | 0 | 0 |
| rampancy.Durandal 2.2d | 8.2% | 85 | 2678 | 3 | 27.6 | 619 / 619 (100%) | 0 | 0 |
| ry.VirtualGunExperiment 1.2.0 | 5.8% | 91 | 368 | 3 | 48.5 | 1286 / 1292 (100%) | 0 | 0 |
| sheldor.micro.EpeeistDC 3.0 | 6.7% | 98 | 8485 | 3 | 60.4 | 1654 / 1661 (100%) | 0 | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 4.5% | 92 | 56 | 3 | 52.3 | 1115 / 1118 (100%) | 0 | 0 |
| sheldor.nano.FoilistNano 3.2 | 10.5% | 79 | 50 | 3 | 28.5 | 645 / 647 (100%) | 0 | 0 |
| slugzilla.ButtHead 2.0 | 53.6% | 86 | 24 | 3 | 9.2 | 181 / 181 (100%) | 0 | 0 |
| slugzilla.RandomGF 1.0 | 5.4% | 89 | 62 | 3 | 40.8 | 1119 / 1120 (100%) | 0 | 0 |
| sos.SOS 1.0 | 5.5% | 83 | 57 | 3 | 40.8 | 911 / 912 (100%) | 0 | 0 |
| stelo.Chord 1.0 | 5.2% | 79 | 213 | 3 | 37.1 | 1138 / 1139 (100%) | 0 | 0 |
| stelo.PastFuture 2.3.2 | 8.6% | 79 | 63 | 3 | 41.6 | 1044 / 1044 (100%) | 0 | 0 |
| synnalagma.NeuralPremier 0.51 | 7.2% | 80 | 49 | 3 | 27.9 | 735 / 735 (100%) | 0 | 0 |
| xander.cat.SamAxe 1.1 | 7.3% | 73 | 63 | 3 | 26.7 | 602 / 603 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| alk.lap.LoudAndProud 2.23 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| axeBots.Musashi 2.18 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| axeBots.Okami 1.04 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cjm.Charo 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cx.micro.Spark 0.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cx.mini.Cigaret 1.31 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.PhoenixOS 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| deo.CloudBot 1.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dft.Immortal 1.40 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dmh.robocode.robot.BlackDeath 9.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dragonbyte.Neutrino 4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| drm.Magazine 0.39 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dz.GalbaMini 0.121 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| eem.zapper v6.03 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| fromHell.C22H30N2O2S 2.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| hlavko.micro.Flex 1.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jk.micro.Cotillion 0.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jk.sheldor.nano.Yatagan 1.2.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lazarecki.mega.PinkerStinker 0.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lj.Dapps 0.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.Samekh 0.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nz.jdc.nano.NeophytePRAL 1.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| origin.SleepSiphon 1.7b | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pe.SandboxLump 1.52 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| penguin.Ivy 1.1r | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| penguin.MrFreeze 1.0a | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.mini.VertiLeach 0.4.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rampancy.Durandal 2.2d | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ry.VirtualGunExperiment 1.2.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sheldor.micro.EpeeistDC 3.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sheldor.nano.FoilistNano 3.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| slugzilla.ButtHead 2.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| slugzilla.RandomGF 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sos.SOS 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.Chord 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.PastFuture 2.3.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| synnalagma.NeuralPremier 0.51 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| xander.cat.SamAxe 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | ags.Glacier | 1 | 35 | 280 | 9.6% | 7.5% ± 1.2 | 12.0% | 23.9% / 23.4% | 6.0% | 0 / 0 | T3/M1 | 69% |
| alk.lap.LoudAndProud 2.23 | alk.lap.LoudAndProud | 1 | 35 | 314 | 6.1% | 7.1% ± 1.8 | 12.5% | 37.3% / 33.7% | 30.1% | 0 / 0 | T3/M? | 81% |
| axeBots.Musashi 2.18 | axeBots.Musashi | 1 | 35 | 294 | 7.7% | 7.2% ± 1.3 | 13.0% | 23.9% / 21.9% | 4.0% | 0 / 0 | T3/M1 | 77% |
| axeBots.Okami 1.04 | axeBots.Okami | 1 | 35 | 286 | 6.4% | 6.2% ± 1.2 | 11.3% | 28.4% / 27.1% | 4.6% | 0 / 0 | T2/M0 | 76% |
| cjm.Charo 1.1 | cjm.Charo | 1 | 35 | 268 | 5.5% | 6.2% ± 1.7 | 11.9% | 25.6% / 22.7% | 4.0% | 0 / 0 | T2/M0 | 78% |
| cx.micro.Spark 0.6 | cx.micro.Spark | 1 | 35 | 288 | 5.9% | 6.8% ± 1.6 | 12.7% | 29.7% / 24.9% | 8.3% | 0 / 0 | T2/M0 | 80% |
| cx.mini.Cigaret 1.31 | cx.mini.Cigaret | 1 | 35 | 294 | 6.8% | 8.7% ± 2.0 | 12.6% | 30.3% / 25.7% | 3.5% | 0 / 0 | T3/M0 | 78% |
| davidalves.PhoenixOS 1.1 | davidalves.PhoenixOS | 1 | 35 | 312 | 7.3% | 6.7% ± 1.2 | 12.4% | 23.2% / 25.2% | 4.2% | 0 / 0 | T2/M2 | 70% |
| deo.CloudBot 1.3 | deo.CloudBot | 1 | 35 | 280 | 7.7% | 5.4% ± 1.4 | 15.4% | 24.9% / 25.2% | 10.5% | 0 / 0 | T2/M1 | 80% |
| dft.Immortal 1.40 | dft.Immortal | 1 | 35 | 282 | 8.0% | 8.1% ± 1.4 | 11.0% | 23.6% / 23.3% | 5.8% | 0 / 0 | T3/M1 | 68% |
| dmh.robocode.robot.BlackDeath 9.2 | dmh.robocode.robot.BlackDeath | 1 | 35 | 348 | 6.8% | 7.3% ± 1.8 | 17.3% | 37.6% / 29.1% | 1.1% | 0 / 0 | T3/M? | 83% |
| dragonbyte.Neutrino 4 | dragonbyte.Neutrino | 1 | 35 | 304 | 0.3% | 0.1% ± 0.1 | 13.9% | 22.6% / 21.4% | 9.2% | 0 / 0 | T0/M1 | 76% |
| drm.Magazine 0.39 | drm.Magazine | 1 | 35 | 282 | 7.1% | 9.0% ± 1.8 | 11.9% | 37.0% / 34.0% | 26.4% | 0 / 0 | T3/M0 | 78% |
| dz.GalbaMini 0.121 | dz.GalbaMini | 1 | 35 | 284 | 8.0% | 7.1% ± 1.5 | 12.3% | 24.3% / 22.3% | 7.6% | 0 / 0 | T3/M1 | 74% |
| eem.zapper v6.03 | eem.zapper | 1 | 35 | 276 | 8.6% | 7.4% ± 1.2 | 10.9% | 23.0% / 24.1% | 1.1% | 0 / 0 | T3/M1 | 76% |
| fromHell.C22H30N2O2S 2.2 | fromHell.C22H30N2O2S | 1 | 35 | 312 | 8.1% | 6.4% ± 1.7 | 14.9% | 21.0% / 21.6% | 17.5% | 0 / 0 | T2/M1 | 75% |
| hlavko.micro.Flex 1.5 | hlavko.micro.Flex | 1 | 35 | 300 | 9.9% | 7.8% ± 1.8 | 16.7% | 25.2% / 21.7% | 4.6% | 0 / 0 | T3/M0 | 78% |
| jk.micro.Cotillion 0.8 | jk.micro.Cotillion | 1 | 35 | 304 | 9.0% | 8.9% ± 1.5 | 10.6% | 23.6% / 21.9% | 4.3% | 0 / 0 | T3/M1 | 61% |
| jk.sheldor.nano.Yatagan 1.2.3 | jk.sheldor.nano.Yatagan | 1 | 35 | 328 | 10.7% | 6.9% ± 1.7 | 18.1% | 24.1% / 22.7% | 8.9% | 0 / 0 | T2/M1 | 75% |
| lazarecki.mega.PinkerStinker 0.7 | lazarecki.mega.PinkerStinker | 1 | 35 | 344 | 8.3% | 6.7% ± 1.4 | 13.8% | 24.6% / 20.9% | 1.4% | 0 / 0 | T2/M1 | 72% |
| lj.Dapps 0.2 | lj.Dapps | 1 | 35 | 264 | 9.1% | 7.0% ± 1.4 | 13.4% | 24.5% / 22.7% | 4.5% | 0 / 0 | T3/M1 | 80% |
| nat.Samekh 0.4 | nat.Samekh | 1 | 35 | 272 | 7.4% | 7.1% ± 1.4 | 10.6% | 24.3% / 24.1% | 4.0% | 0 / 0 | T3/M1 | 80% |
| nz.jdc.nano.NeophytePRAL 1.4 | nz.jdc.nano.NeophytePRAL | 1 | 35 | 328 | 10.0% | 5.9% ± 1.6 | 17.7% | 26.2% / 24.8% | 14.9% | 0 / 0 | T2/M? | 88% |
| origin.SleepSiphon 1.7b | origin.SleepSiphon | 1 | 35 | 306 | 5.9% | 5.5% ± 1.5 | 15.5% | 41.5% / 36.7% | 3.4% | 0 / 0 | T2/M? | 90% |
| pe.SandboxLump 1.52 | pe.SandboxLump | 1 | 35 | 290 | 7.4% | 5.4% ± 1.8 | 15.2% | 22.5% / 20.7% | 11.5% | 0 / 0 | T2/M? | 82% |
| penguin.Ivy 1.1r | penguin.Ivy | 1 | 35 | 278 | 6.1% | 6.8% ± 1.7 | 12.5% | 36.4% / 33.4% | 14.3% | 0 / 0 | T2/M0 | 83% |
| penguin.MrFreeze 1.0a | penguin.MrFreeze | 1 | 35 | 298 | 8.7% | 8.1% ± 1.3 | 12.1% | 28.0% / 26.0% | 8.0% | 0 / 0 | T3/M0 | 81% |
| pez.mini.VertiLeach 0.4.0 | pez.mini.VertiLeach | 1 | 35 | 312 | 4.0% | 2.4% ± 11.4 | 17.2% | 21.8% / 27.0% | 3.6% | 0 / 0 | T?/M? | 99% |
| rampancy.Durandal 2.2d | rampancy.Durandal | 1 | 35 | 302 | 8.9% | 7.6% ± 1.8 | 17.3% | 25.6% / 23.7% | 5.1% | 0 / 0 | T3/M0 | 77% |
| ry.VirtualGunExperiment 1.2.0 | ry.VirtualGunExperiment | 1 | 35 | 328 | 5.7% | 5.6% ± 1.2 | 11.7% | 26.5% / 25.7% | 4.7% | 0 / 0 | T2/M0 | 85% |
| sheldor.micro.EpeeistDC 3.0 | sheldor.micro.EpeeistDC | 1 | 35 | 324 | 7.0% | 7.1% ± 1.2 | 10.7% | 26.0% / 23.1% | 5.0% | 0 / 0 | T3/M0 | 82% |
| sheldor.micro.PointInLineRRAL 1.0 | sheldor.micro.PointInLineRRAL | 1 | 35 | 348 | 5.3% | 4.9% ± 1.1 | 10.9% | 25.1% / 23.7% | 4.0% | 0 / 0 | T2/M0 | 83% |
| sheldor.nano.FoilistNano 3.2 | sheldor.nano.FoilistNano | 1 | 35 | 328 | 10.4% | 7.1% ± 1.6 | 15.7% | 25.5% / 22.1% | 6.1% | 0 / 0 | T3/M0 | 74% |
| slugzilla.ButtHead 2.0 | slugzilla.ButtHead | 1 | 35 | 304 | 56.2% | 10.9% ± 3.6 | 44.3% | 12.8% / 11.7% | 6.8% | 0 / 0 | T?/M? | 70% |
| slugzilla.RandomGF 1.0 | slugzilla.RandomGF | 1 | 35 | 304 | 5.6% | 6.4% ± 1.4 | 11.8% | 26.0% / 23.3% | 6.6% | 0 / 0 | T2/M0 | 82% |
| sos.SOS 1.0 | sos.SOS | 1 | 35 | 260 | 6.1% | 4.3% ± 1.1 | 13.0% | 25.9% / 27.1% | 7.9% | 0 / 0 | T1/M0 | 85% |
| stelo.Chord 1.0 | stelo.Chord | 1 | 35 | 276 | 5.8% | 6.1% ± 1.3 | 12.8% | 26.0% / 26.4% | 16.4% | 0 / 0 | T2/M0 | 79% |
| stelo.PastFuture 2.3.2 | stelo.PastFuture | 1 | 35 | 300 | 9.9% | 8.6% ± 1.5 | 12.1% | 22.3% / 22.8% | 3.7% | 0 / 0 | T3/M1 | 63% |
| synnalagma.NeuralPremier 0.51 | synnalagma.NeuralPremier | 1 | 35 | 330 | 7.2% | 5.4% ± 1.6 | 16.1% | 29.8% / 24.8% | 3.9% | 0 / 0 | T2/M0 | 86% |
| xander.cat.SamAxe 1.1 | xander.cat.SamAxe | 1 | 35 | 300 | 8.6% | 8.0% ± 1.8 | 19.4% | 36.9% / 34.2% | 9.2% | 0 / 0 | T3/M? | 84% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.9 vs hadur2.Hadur 3.4

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ags.Glacier 0.3.2 | 64.0% ± 3.5 | 62.6% ± 4.2 | +1.4 ± 5.5 |
| alk.lap.LoudAndProud 2.23 | 81.5% ± 2.1 | 80.4% ± 1.9 | +1.1 ± 3.1 |
| axeBots.Musashi 2.18 | 75.0% ± 4.1 | 78.2% ± 4.0 | -3.2 ± 7.6 |
| axeBots.Okami 1.04 | 76.4% ± 3.5 | 77.5% ± 4.0 | -1.1 ± 6.1 |
| cjm.Charo 1.1 | 80.7% ± 3.4 | 77.2% ± 4.3 | +3.5 ± 4.8 |
| cx.micro.Spark 0.6 | 79.4% ± 3.0 | 77.6% ± 3.7 | +1.9 ± 6.3 |
| cx.mini.Cigaret 1.31 | 76.2% ± 3.9 | 74.0% ± 3.8 | +2.2 ± 6.3 |
| davidalves.PhoenixOS 1.1 | 68.2% ± 2.5 | 67.5% ± 3.0 | +0.7 ± 3.7 |
| deo.CloudBot 1.3 | 81.0% ± 1.3 | 80.8% ± 2.6 | +0.2 ± 3.3 |
| dft.Immortal 1.40 | 70.3% ± 2.9 | 74.2% ± 4.9 | -3.9 ± 7.1 |
| dmh.robocode.robot.BlackDeath 9.2 | 87.4% ± 2.1 | 89.8% ± 1.2 | -2.4 ± 2.4 |
| dragonbyte.Neutrino 4 | 80.1% ± 3.3 | 83.2% ± 3.3 | -3.1 ± 5.0 |
| drm.Magazine 0.39 | 76.1% ± 1.8 | 77.4% ± 2.1 | -1.3 ± 1.6 |
| dz.GalbaMini 0.121 | 72.1% ± 4.8 | 70.1% ± 6.1 | +2.0 ± 9.7 |
| eem.zapper v6.03 | 71.5% ± 4.2 | 66.8% ± 4.3 | +4.7 ± 6.0 |
| fromHell.C22H30N2O2S 2.2 | 77.6% ± 3.0 | 78.1% ± 3.4 | -0.5 ± 4.5 |
| hlavko.micro.Flex 1.5 | 82.1% ± 3.6 | 83.4% ± 2.9 | -1.3 ± 3.9 |
| jk.micro.Cotillion 0.8 | 66.0% ± 4.2 | 62.9% ± 4.1 | +3.1 ± 6.4 |
| jk.sheldor.nano.Yatagan 1.2.3 | 75.6% ± 3.0 | 77.1% ± 2.7 | -1.6 ± 4.8 |
| lazarecki.mega.PinkerStinker 0.7 | 75.6% ± 3.0 | 75.7% ± 1.9 | -0.1 ± 3.9 |
| lj.Dapps 0.2 | 82.3% ± 1.7 | 82.4% ± 2.4 | -0.1 ± 3.2 |
| nat.Samekh 0.4 | 68.4% ± 5.7 | 65.7% ± 3.4 | +2.6 ± 8.0 |
| nz.jdc.nano.NeophytePRAL 1.4 | 89.6% ± 1.0 | 89.3% ± 1.7 | +0.3 ± 2.0 |
| origin.SleepSiphon 1.7b | 91.3% ± 1.2 | 91.5% ± 2.1 | -0.1 ± 2.9 |
| pe.SandboxLump 1.52 | 78.5% ± 3.7 | 82.1% ± 3.3 | -3.7 ± 4.9 |
| penguin.Ivy 1.1r | 84.4% ± 3.2 | 87.3% ± 2.3 | -2.8 ± 2.8 |
| penguin.MrFreeze 1.0a | 86.8% ± 2.7 | 84.4% ± 3.1 | +2.3 ± 4.4 |
| pez.mini.VertiLeach 0.4.0 | 99.2% ± 0.8 | 99.3% ± 0.5 | -0.1 ± 0.8 |
| rampancy.Durandal 2.2d | 77.2% ± 3.5 | 76.7% ± 3.1 | +0.5 ± 4.4 |
| ry.VirtualGunExperiment 1.2.0 | 80.5% ± 4.1 | 82.4% ± 2.0 | -1.9 ± 3.3 |
| sheldor.micro.EpeeistDC 3.0 | 74.9% ± 4.4 | 75.3% ± 2.8 | -0.5 ± 5.6 |
| sheldor.micro.PointInLineRRAL 1.0 | 85.9% ± 4.0 | 87.2% ± 1.6 | -1.3 ± 3.7 |
| sheldor.nano.FoilistNano 3.2 | 73.6% ± 3.4 | 75.8% ± 1.7 | -2.1 ± 3.3 |
| slugzilla.ButtHead 2.0 | 69.4% ± 3.5 | 63.4% ± 1.7 | +6.0 ± 3.0 |
| slugzilla.RandomGF 1.0 | 77.9% ± 3.6 | 77.5% ± 2.3 | +0.4 ± 4.8 |
| sos.SOS 1.0 | 89.8% ± 1.8 | 88.9% ± 2.4 | +0.9 ± 1.4 |
| stelo.Chord 1.0 | 81.8% ± 3.6 | 79.2% ± 3.8 | +2.6 ± 4.3 |
| stelo.PastFuture 2.3.2 | 63.0% ± 3.3 | 66.9% ± 4.4 | -3.9 ± 4.8 |
| synnalagma.NeuralPremier 0.51 | 82.9% ± 2.7 | 84.0% ± 1.3 | -1.2 ± 3.5 |
| xander.cat.SamAxe 1.1 | 86.6% ± 2.2 | 87.2% ± 2.7 | -0.6 ± 3.8 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| ags.Glacier 0.3.2 | +1.4 ± 5.5 | +1.4 ± 6.4 | +1.4 ± 6.4 | +1.1 ± 5.2 |
| alk.lap.LoudAndProud 2.23 | +1.1 ± 3.1 | +1.4 ± 3.8 | +1.4 ± 3.8 | +0.2 ± 4.5 |
| axeBots.Musashi 2.18 | -3.2 ± 7.6 | -4.6 ± 8.0 | -4.6 ± 8.0 | -1.7 ± 7.2 |
| axeBots.Okami 1.04 | -1.1 ± 6.1 | -1.8 ± 9.9 | -1.8 ± 9.9 | -0.2 ± 2.6 |
| cjm.Charo 1.1 | +3.5 ± 4.8 | +2.9 ± 3.1 | +2.9 ± 3.1 | +3.3 ± 5.9 |
| cx.micro.Spark 0.6 | +1.9 ± 6.3 | +1.4 ± 6.0 | +1.4 ± 6.0 | +2.2 ± 6.2 |
| cx.mini.Cigaret 1.31 | +2.2 ± 6.3 | +4.6 ± 5.8 | +4.6 ± 5.8 | -1.0 ± 6.1 |
| davidalves.PhoenixOS 1.1 | +0.7 ± 3.7 | +1.4 ± 5.6 | +1.4 ± 5.6 | -0.4 ± 2.4 |
| deo.CloudBot 1.3 | +0.2 ± 3.3 | +1.8 ± 3.8 | +1.8 ± 3.8 | -1.4 ± 4.8 |
| dft.Immortal 1.40 | -3.9 ± 7.1 | -4.6 ± 8.1 | -4.6 ± 8.1 | -3.1 ± 6.3 |
| dmh.robocode.robot.BlackDeath 9.2 | -2.4 ± 2.4 | -2.5 ± 2.0 | -2.5 ± 2.0 | -2.3 ± 3.6 |
| dragonbyte.Neutrino 4 | -3.1 ± 5.0 | -6.5 ± 10.3 | -6.8 ± 10.3 | +0.0 ± 0.1 |
| drm.Magazine 0.39 | -1.3 ± 1.6 | -1.4 ± 2.9 | -1.4 ± 2.9 | -1.1 ± 2.9 |
| dz.GalbaMini 0.121 | +2.0 ± 9.7 | +2.6 ± 13.0 | +2.5 ± 13.0 | +0.8 ± 6.9 |
| eem.zapper v6.03 | +4.7 ± 6.0 | +5.3 ± 7.4 | +5.4 ± 7.4 | +2.5 ± 5.3 |
| fromHell.C22H30N2O2S 2.2 | -0.5 ± 4.5 | +0.0 ± 6.1 | +0.0 ± 6.1 | -0.7 ± 3.4 |
| hlavko.micro.Flex 1.5 | -1.3 ± 3.9 | -1.8 ± 3.8 | -1.8 ± 3.8 | -0.7 ± 4.6 |
| jk.micro.Cotillion 0.8 | +3.1 ± 6.4 | +4.9 ± 9.4 | +5.0 ± 9.4 | +0.3 ± 3.5 |
| jk.sheldor.nano.Yatagan 1.2.3 | -1.6 ± 4.8 | -3.3 ± 5.8 | -3.2 ± 5.8 | -0.5 ± 3.7 |
| lazarecki.mega.PinkerStinker 0.7 | -0.1 ± 3.9 | -1.1 ± 7.0 | -1.1 ± 7.0 | +0.6 ± 1.8 |
| lj.Dapps 0.2 | -0.1 ± 3.2 | +0.4 ± 4.5 | +0.4 ± 4.5 | -0.6 ± 2.7 |
| nat.Samekh 0.4 | +2.6 ± 8.0 | +3.6 ± 8.9 | +3.6 ± 8.9 | +1.2 ± 6.4 |
| nz.jdc.nano.NeophytePRAL 1.4 | +0.3 ± 2.0 | +0.4 ± 2.0 | +0.4 ± 2.0 | +0.2 ± 2.4 |
| origin.SleepSiphon 1.7b | -0.1 ± 2.9 | -0.4 ± 0.8 | -0.4 ± 0.8 | -0.2 ± 5.6 |
| pe.SandboxLump 1.52 | -3.7 ± 4.9 | -4.6 ± 6.2 | -4.6 ± 6.2 | -2.3 ± 3.8 |
| penguin.Ivy 1.1r | -2.8 ± 2.8 | -3.2 ± 1.5 | -3.2 ± 1.5 | -2.5 ± 4.6 |
| penguin.MrFreeze 1.0a | +2.3 ± 4.4 | +2.9 ± 4.8 | +2.9 ± 4.8 | +1.6 ± 4.6 |
| pez.mini.VertiLeach 0.4.0 | -0.1 ± 0.8 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.7 ± 13.8 |
| rampancy.Durandal 2.2d | +0.5 ± 4.4 | +0.0 ± 6.3 | +0.0 ± 6.3 | +1.1 ± 3.6 |
| ry.VirtualGunExperiment 1.2.0 | -1.9 ± 3.3 | -2.1 ± 4.7 | -2.1 ± 4.7 | -2.0 ± 4.8 |
| sheldor.micro.EpeeistDC 3.0 | -0.5 ± 5.6 | +1.4 ± 6.1 | +1.4 ± 6.1 | -1.8 ± 5.0 |
| sheldor.micro.PointInLineRRAL 1.0 | -1.3 ± 3.7 | -2.1 ± 3.6 | -2.1 ± 3.6 | -0.3 ± 4.0 |
| sheldor.nano.FoilistNano 3.2 | -2.1 ± 3.3 | -1.8 ± 6.2 | -1.8 ± 6.2 | -2.1 ± 1.5 |
| slugzilla.ButtHead 2.0 | +6.0 ± 3.0 | +3.6 ± 5.7 | +3.6 ± 5.7 | +0.8 ± 1.6 |
| slugzilla.RandomGF 1.0 | +0.4 ± 4.8 | +0.7 ± 5.4 | +0.7 ± 5.4 | -0.3 ± 5.5 |
| sos.SOS 1.0 | +0.9 ± 1.4 | +1.4 ± 3.1 | +1.4 ± 3.1 | +0.5 ± 2.6 |
| stelo.Chord 1.0 | +2.6 ± 4.3 | +1.1 ± 6.1 | +1.1 ± 6.1 | +4.1 ± 4.3 |
| stelo.PastFuture 2.3.2 | -3.9 ± 4.8 | -6.1 ± 7.4 | -6.1 ± 7.4 | -1.2 ± 3.1 |
| synnalagma.NeuralPremier 0.51 | -1.2 ± 3.5 | -1.8 ± 4.8 | -1.8 ± 4.8 | -0.6 ± 3.1 |
| xander.cat.SamAxe 1.1 | -0.6 ± 3.8 | -0.4 ± 4.5 | -0.4 ± 4.5 | -0.9 ± 3.7 |
| All pairs | -0.0 ± 0.6 | -0.2 ± 0.8 | -0.2 ± 0.8 | -0.2 ± 0.6 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or, for a Hadur build, a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| ags.Glacier 0.3.2 | 8 | 8 | +1.4 ± 5.5 | +1.4 ± 5.5 |
| alk.lap.LoudAndProud 2.23 | 8 | 7 | +1.1 ± 3.1 | +1.7 ± 3.3 |
| axeBots.Musashi 2.18 | 8 | 6 | -3.2 ± 7.6 | -4.9 ± 8.8 |
| axeBots.Okami 1.04 | 8 | 5 | -1.1 ± 6.1 | -0.2 ± 4.9 |
| cjm.Charo 1.1 | 8 | 5 | +3.5 ± 4.8 | -0.1 ± 3.2 |
| cx.micro.Spark 0.6 | 8 | 7 | +1.9 ± 6.3 | +1.0 ± 7.1 |
| cx.mini.Cigaret 1.31 | 8 | 5 | +2.2 ± 6.3 | -0.8 ± 6.4 |
| davidalves.PhoenixOS 1.1 | 8 | 5 | +0.7 ± 3.7 | +0.5 ± 3.6 |
| deo.CloudBot 1.3 | 8 | 6 | +0.2 ± 3.3 | +0.9 ± 4.5 |
| dft.Immortal 1.40 | 8 | 5 | -3.9 ± 7.1 | -6.1 ± 10.0 |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 8 | -2.4 ± 2.4 | -2.4 ± 2.4 |
| dragonbyte.Neutrino 4 | 8 | 4 | -3.1 ± 5.0 | -2.8 ± 10.9 |
| drm.Magazine 0.39 | 8 | 4 | -1.3 ± 1.6 | -1.2 ± 4.1 |
| dz.GalbaMini 0.121 | 8 | 5 | +2.0 ± 9.7 | +5.6 ± 8.4 |
| eem.zapper v6.03 | 8 | 6 | +4.7 ± 6.0 | +5.3 ± 6.1 |
| fromHell.C22H30N2O2S 2.2 | 8 | 5 | -0.5 ± 4.5 | +2.9 ± 3.0 |
| hlavko.micro.Flex 1.5 | 8 | 8 | -1.3 ± 3.9 | -1.3 ± 3.9 |
| jk.micro.Cotillion 0.8 | 8 | 6 | +3.1 ± 6.4 | +3.9 ± 9.1 |
| jk.sheldor.nano.Yatagan 1.2.3 | 8 | 4 | -1.6 ± 4.8 | -0.5 ± 11.4 |
| lazarecki.mega.PinkerStinker 0.7 | 8 | 7 | -0.1 ± 3.9 | +0.0 ± 4.6 |
| lj.Dapps 0.2 | 8 | 6 | -0.1 ± 3.2 | -1.2 ± 4.0 |
| nat.Samekh 0.4 | 8 | 3 | +2.6 ± 8.0 | +10.1 ± 11.9 |
| nz.jdc.nano.NeophytePRAL 1.4 | 8 | 6 | +0.3 ± 2.0 | -0.2 ± 2.5 |
| origin.SleepSiphon 1.7b | 8 | 7 | -0.1 ± 2.9 | +0.2 ± 3.3 |
| pe.SandboxLump 1.52 | 8 | 6 | -3.7 ± 4.9 | -5.4 ± 5.5 |
| penguin.Ivy 1.1r | 8 | 3 | -2.8 ± 2.8 | -5.9 ± 8.3 |
| penguin.MrFreeze 1.0a | 8 | 7 | +2.3 ± 4.4 | +2.0 ± 5.1 |
| pez.mini.VertiLeach 0.4.0 | 8 | 7 | -0.1 ± 0.8 | +0.2 ± 0.5 |
| rampancy.Durandal 2.2d | 8 | 7 | +0.5 ± 4.4 | +1.7 ± 4.2 |
| ry.VirtualGunExperiment 1.2.0 | 8 | 6 | -1.9 ± 3.3 | -0.7 ± 3.7 |
| sheldor.micro.EpeeistDC 3.0 | 8 | 5 | -0.5 ± 5.6 | +3.1 ± 6.3 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 6 | -1.3 ± 3.7 | +0.3 ± 1.0 |
| sheldor.nano.FoilistNano 3.2 | 8 | 5 | -2.1 ± 3.3 | -1.8 ± 3.2 |
| slugzilla.ButtHead 2.0 | 8 | 8 | +6.0 ± 3.0 | +6.0 ± 3.0 |
| slugzilla.RandomGF 1.0 | 8 | 8 | +0.4 ± 4.8 | +0.4 ± 4.8 |
| sos.SOS 1.0 | 8 | 7 | +0.9 ± 1.4 | +0.9 ± 1.7 |
| stelo.Chord 1.0 | 8 | 6 | +2.6 ± 4.3 | +2.6 ± 5.9 |
| stelo.PastFuture 2.3.2 | 8 | 2 | -3.9 ± 4.8 | -7.1 ± 19.5 |
| synnalagma.NeuralPremier 0.51 | 8 | 7 | -1.2 ± 3.5 | -0.3 ± 3.4 |
| xander.cat.SamAxe 1.1 | 8 | 7 | -0.6 ± 3.8 | +0.2 ± 4.0 |
| All pairs | 320 | 235 | -0.0 ± 0.6 | +0.4 ± 0.7 |

# Bench: hadur2.Hadur 3.9 baseline (hadur2.Hadur 3.4) (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 3841 over 320 battles (12.0 per battle, most in one battle 64). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | mid | 62.6% ± 4.2 | 76.1% ± 5.4 | 50.8% ± 3.1 | 213 / 280 | 12.2% ± 0.2 | 9.3% ± 0.4 | 133 | 0 | 1.34 / 41.7 |
| alk.lap.LoudAndProud 2.23 | mid | 80.4% ± 1.9 | 94.3% ± 1.8 | 65.6% ± 3.3 | 264 / 280 | 15.6% ± 1.4 | 7.3% ± 3.8 | 88 | 0 | 1.15 / 16.4 |
| axeBots.Musashi 2.18 | mid | 78.2% ± 4.0 | 91.1% ± 5.2 | 66.0% ± 3.0 | 255 / 280 | 14.0% ± 0.5 | 7.4% ± 0.7 | 99 | 0 | 1.13 / 34.0 |
| axeBots.Okami 1.04 | mid | 77.5% ± 4.0 | 90.7% ± 5.5 | 64.8% ± 2.3 | 254 / 280 | 13.1% ± 0.5 | 9.5% ± 6.3 | 214 | 0 | 1.24 / 11.2 |
| cjm.Charo 1.1 | mid | 77.2% ± 4.3 | 93.2% ± 3.1 | 60.2% ± 5.1 | 261 / 280 | 14.0% ± 1.3 | 7.1% ± 3.8 | 88 | 0 | 0.83 / 15.4 |
| cx.micro.Spark 0.6 | mid | 77.6% ± 3.7 | 91.1% ± 4.1 | 63.4% ± 3.2 | 255 / 280 | 14.6% ± 0.7 | 6.3% ± 0.7 | 101 | 0 | 1.04 / 77.4 |
| cx.mini.Cigaret 1.31 | mid | 74.0% ± 3.8 | 87.1% ± 3.1 | 60.6% ± 4.2 | 244 / 280 | 13.2% ± 1.0 | 8.2% ± 4.9 | 77 | 0 | 2.21 / 16.3 |
| davidalves.PhoenixOS 1.1 | mid | 67.5% ± 3.0 | 80.7% ± 4.4 | 54.5% ± 1.8 | 226 / 280 | 13.0% ± 0.8 | 7.1% ± 0.6 | 95 | 0 | 0.94 / 119.1 |
| deo.CloudBot 1.3 | mid | 80.8% ± 2.6 | 92.9% ± 3.6 | 69.1% ± 2.4 | 260 / 280 | 17.8% ± 1.4 | 8.2% ± 2.2 | 99 | 0 | 0.92 / 210.7 |
| dft.Immortal 1.40 | mid | 74.2% ± 4.9 | 91.7% ± 6.3 | 55.5% ± 3.3 | 257 / 280 | 10.7% ± 0.7 | 6.4% ± 0.7 | 101 | 0 | 0.98 / 16.1 |
| dmh.robocode.robot.BlackDeath 9.2 | mid | 89.8% ± 1.2 | 100.0% ± 0.0 | 79.6% ± 2.1 | 280 / 280 | 19.6% ± 0.7 | 5.7% ± 0.7 | 87 | 0 | 0.90 / 14.5 |
| dragonbyte.Neutrino 4 | mid | 83.2% ± 3.3 | 59.0% ± 6.7 | 99.8% ± 0.1 | 166 / 280 | 15.0% ± 0.2 | 0.4% ± 0.1 | 84 | 0 | 0.66 / 24.1 |
| drm.Magazine 0.39 | mid | 77.4% ± 2.1 | 92.9% ± 3.6 | 61.7% ± 2.2 | 260 / 280 | 14.4% ± 0.8 | 5.7% ± 0.5 | 76 | 0 | 1.23 / 20.4 |
| dz.GalbaMini 0.121 | mid | 70.1% ± 6.1 | 84.6% ± 7.2 | 56.9% ± 4.4 | 237 / 280 | 13.9% ± 0.6 | 8.1% ± 0.8 | 96 | 0 | 0.93 / 15.5 |
| eem.zapper v6.03 | mid | 66.8% ± 4.3 | 83.2% ± 5.5 | 51.4% ± 3.2 | 233 / 280 | 11.0% ± 0.3 | 7.6% ± 0.7 | 120 | 0 | 2.11 / 25.7 |
| fromHell.C22H30N2O2S 2.2 | mid | 78.1% ± 3.4 | 91.4% ± 3.1 | 65.5% ± 3.5 | 256 / 280 | 16.6% ± 0.9 | 7.4% ± 0.9 | 74 | 0 | 0.85 / 130.9 |
| hlavko.micro.Flex 1.5 | mid | 83.4% ± 2.9 | 95.4% ± 3.4 | 71.9% ± 2.8 | 267 / 280 | 22.5% ± 1.6 | 7.0% ± 0.6 | 75 | 0 | 0.83 / 30.9 |
| jk.micro.Cotillion 0.8 | mid | 62.9% ± 4.1 | 76.8% ± 6.2 | 49.8% ± 2.2 | 215 / 280 | 11.5% ± 0.5 | 7.4% ± 0.4 | 92 | 0 | 1.09 / 15.8 |
| jk.sheldor.nano.Yatagan 1.2.3 | mid | 77.1% ± 2.7 | 87.9% ± 4.6 | 67.9% ± 1.6 | 246 / 280 | 22.0% ± 0.8 | 9.8% ± 0.8 | 79 | 0 | 0.87 / 16.7 |
| lazarecki.mega.PinkerStinker 0.7 | mid | 75.7% ± 1.9 | 87.9% ± 3.6 | 64.2% ± 1.5 | 246 / 280 | 13.9% ± 0.5 | 7.5% ± 0.2 | 128 | 0 | 0.92 / 166.4 |
| lj.Dapps 0.2 | mid | 82.4% ± 2.4 | 94.6% ± 3.0 | 70.5% ± 1.8 | 265 / 280 | 15.1% ± 0.9 | 7.1% ± 0.7 | 88 | 0 | 0.88 / 102.6 |
| nat.Samekh 0.4 | mid | 65.7% ± 3.4 | 80.4% ± 4.1 | 51.4% ± 2.8 | 225 / 280 | 10.8% ± 0.5 | 9.3% ± 5.2 | 104 | 0 | 1.06 / 226.4 |
| nz.jdc.nano.NeophytePRAL 1.4 | mid | 89.3% ± 1.7 | 98.9% ± 1.2 | 81.0% ± 2.2 | 277 / 280 | 20.4% ± 0.8 | 12.3% ± 6.6 | 90 | 0 | 0.80 / 311.9 |
| origin.SleepSiphon 1.7b | mid | 91.5% ± 2.1 | 100.0% ± 0.0 | 83.3% ± 3.8 | 280 / 280 | 19.7% ± 0.6 | 5.2% ± 1.2 | 92 | 0 | 1.01 / 75.5 |
| pe.SandboxLump 1.52 | mid | 82.1% ± 3.3 | 95.4% ± 3.8 | 69.6% ± 2.7 | 267 / 280 | 17.8% ± 0.9 | 9.0% ± 5.4 | 99 | 0 | 0.82 / 23.7 |
| penguin.Ivy 1.1r | mid | 87.3% ± 2.3 | 94.6% ± 2.7 | 79.5% ± 2.4 | 265 / 280 | 14.9% ± 0.3 | 5.6% ± 0.5 | 85 | 0 | 0.86 / 18.3 |
| penguin.MrFreeze 1.0a | mid | 84.4% ± 3.1 | 94.6% ± 3.5 | 74.0% ± 3.0 | 265 / 280 | 13.9% ± 0.9 | 7.8% ± 0.2 | 117 | 0 | 1.06 / 172.3 |
| pez.mini.VertiLeach 0.4.0 | mid | 99.3% ± 0.5 | 100.0% ± 0.0 | 80.1% ± 12.5 | 280 / 280 | 0.6% ± 0.2 | 0.1% ± 0.1 | 102 | 0 | 0.61 / 118.9 |
| rampancy.Durandal 2.2d | mid | 76.7% ± 3.1 | 90.0% ± 4.0 | 64.5% ± 3.1 | 252 / 280 | 18.1% ± 1.8 | 7.9% ± 0.5 | 86 | 0 | 0.91 / 17.0 |
| ry.VirtualGunExperiment 1.2.0 | mid | 82.4% ± 2.0 | 96.1% ± 2.2 | 67.3% ± 2.8 | 269 / 280 | 12.1% ± 0.7 | 5.9% ± 0.4 | 99 | 0 | 0.99 / 46.6 |
| sheldor.micro.EpeeistDC 3.0 | mid | 75.3% ± 2.8 | 90.0% ± 3.4 | 59.6% ± 2.7 | 252 / 280 | 11.8% ± 0.8 | 6.3% ± 0.3 | 110 | 0 | 1.18 / 290.1 |
| sheldor.micro.PointInLineRRAL 1.0 | mid | 87.2% ± 1.6 | 99.3% ± 1.1 | 71.8% ± 2.8 | 278 / 280 | 10.6% ± 0.7 | 4.3% ± 0.3 | 87 | 0 | 0.79 / 16.7 |
| sheldor.nano.FoilistNano 3.2 | mid | 75.8% ± 1.7 | 87.1% ± 2.9 | 65.8% ± 1.1 | 244 / 280 | 17.8% ± 1.1 | 12.1% ± 5.9 | 84 | 0 | 0.91 / 14.3 |
| slugzilla.ButtHead 2.0 | mid | 63.4% ± 1.7 | 91.4% ± 4.4 | 59.8% ± 0.7 | 256 / 280 | 78.4% ± 3.0 | 55.2% ± 2.7 | 77 | 0 | 0.52 / 9.7 |
| slugzilla.RandomGF 1.0 | mid | 77.5% ± 2.3 | 93.6% ± 2.5 | 58.3% ± 2.9 | 262 / 280 | 10.3% ± 0.6 | 5.3% ± 0.3 | 88 | 0 | 0.89 / 64.2 |
| sos.SOS 1.0 | mid | 88.9% ± 2.4 | 97.1% ± 2.9 | 79.9% ± 2.8 | 272 / 280 | 16.5% ± 1.6 | 6.0% ± 0.9 | 74 | 0 | 0.79 / 16.9 |
| stelo.Chord 1.0 | mid | 79.2% ± 3.8 | 92.9% ± 5.3 | 64.0% ± 2.7 | 260 / 280 | 13.3% ± 1.0 | 5.7% ± 0.7 | 94 | 0 | 0.92 / 25.1 |
| stelo.PastFuture 2.3.2 | mid | 66.9% ± 4.4 | 81.8% ± 5.7 | 52.8% ± 3.5 | 229 / 280 | 12.0% ± 0.7 | 8.0% ± 0.5 | 92 | 0 | 1.17 / 18.7 |
| synnalagma.NeuralPremier 0.51 | mid | 84.0% ± 1.3 | 93.2% ± 1.2 | 75.4% ± 2.0 | 261 / 280 | 18.4% ± 0.5 | 8.9% ± 4.1 | 85 | 0 | 0.83 / 17.5 |
| xander.cat.SamAxe 1.1 | mid | 87.2% ± 2.7 | 97.5% ± 2.7 | 77.8% ± 2.7 | 273 / 280 | 21.0% ± 0.6 | 7.5% ± 0.7 | 82 | 0 | 0.95 / 25.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 8 | 1874 | 22.3% | 67.8% | 0.0% | 9.9% | 993 |
| alk.lap.LoudAndProud 2.23 | 8 | 902 | 11.1% | 83.9% | 0.0% | 5.0% | 563 |
| axeBots.Musashi 2.18 | 8 | 1080 | 14.5% | 79.5% | 0.0% | 6.0% | 1016 |
| axeBots.Okami 1.04 | 8 | 1097 | 14.8% | 78.8% | 0.0% | 6.4% | 1058 |
| cjm.Charo 1.1 | 8 | 1044 | 11.4% | 83.5% | 0.0% | 5.1% | 622 |
| cx.micro.Spark 0.6 | 8 | 1043 | 15.0% | 78.3% | 0.0% | 6.7% | 664 |
| cx.mini.Cigaret 1.31 | 8 | 1188 | 18.9% | 71.8% | 0.1% | 9.2% | 649 |
| davidalves.PhoenixOS 1.1 | 8 | 1512 | 22.3% | 68.6% | 0.0% | 9.1% | 1015 |
| deo.CloudBot 1.3 | 8 | 964 | 13.0% | 81.5% | 0.3% | 5.2% | 633 |
| dft.Immortal 1.40 | 8 | 1169 | 12.3% | 82.7% | 0.0% | 5.0% | 856 |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 514 | 0.0% | 100.0% | 0.0% | 0.0% | 532 |
| dragonbyte.Neutrino 4 | 8 | 861 | 82.7% | 0.7% | 0.0% | 16.5% | 1917 |
| drm.Magazine 0.39 | 8 | 1058 | 11.8% | 82.5% | 0.0% | 5.7% | 600 |
| dz.GalbaMini 0.121 | 8 | 1499 | 17.9% | 74.2% | 0.0% | 7.8% | 769 |
| eem.zapper v6.03 | 8 | 1591 | 18.5% | 73.3% | 0.0% | 8.3% | 1040 |
| fromHell.C22H30N2O2S 2.2 | 8 | 1101 | 13.6% | 80.1% | 0.0% | 6.3% | 561 |
| hlavko.micro.Flex 1.5 | 8 | 851 | 9.5% | 86.9% | 0.1% | 3.5% | 519 |
| jk.micro.Cotillion 0.8 | 8 | 1767 | 23.0% | 67.0% | 0.0% | 10.0% | 818 |
| jk.sheldor.nano.Yatagan 1.2.3 | 8 | 1250 | 17.0% | 75.9% | 0.0% | 7.1% | 548 |
| lazarecki.mega.PinkerStinker 0.7 | 8 | 1209 | 17.6% | 75.2% | 0.0% | 7.3% | 886 |
| lj.Dapps 0.2 | 8 | 880 | 10.7% | 84.6% | 0.1% | 4.6% | 743 |
| nat.Samekh 0.4 | 8 | 1595 | 21.6% | 69.0% | 0.0% | 9.5% | 867 |
| nz.jdc.nano.NeophytePRAL 1.4 | 8 | 600 | 3.1% | 95.6% | 0.0% | 1.3% | 542 |
| origin.SleepSiphon 1.7b | 8 | 442 | 0.0% | 100.0% | 0.0% | 0.0% | 583 |
| pe.SandboxLump 1.52 | 8 | 908 | 8.9% | 87.1% | 0.0% | 4.0% | 535 |
| penguin.Ivy 1.1r | 8 | 622 | 15.1% | 78.8% | 0.0% | 6.1% | 899 |
| penguin.MrFreeze 1.0a | 8 | 757 | 12.4% | 82.6% | 0.0% | 5.0% | 846 |
| pez.mini.VertiLeach 0.4.0 | 8 | 15 | 0.0% | 100.0% | 0.0% | 0.0% | 161 |
| rampancy.Durandal 2.2d | 8 | 1196 | 14.6% | 79.3% | 0.0% | 6.1% | 630 |
| ry.VirtualGunExperiment 1.2.0 | 8 | 806 | 8.5% | 88.1% | 0.0% | 3.4% | 854 |
| sheldor.micro.EpeeistDC 3.0 | 8 | 1119 | 15.6% | 77.8% | 0.0% | 6.5% | 947 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 543 | 2.3% | 96.9% | 0.0% | 0.8% | 900 |
| sheldor.nano.FoilistNano 3.2 | 8 | 1309 | 17.2% | 75.7% | 0.0% | 7.1% | 572 |
| slugzilla.ButtHead 2.0 | 8 | 3609 | 4.2% | 52.6% | 40.4% | 2.8% | 277 |
| slugzilla.RandomGF 1.0 | 8 | 960 | 11.7% | 83.4% | 0.0% | 4.9% | 755 |
| sos.SOS 1.0 | 8 | 533 | 9.4% | 87.6% | 0.0% | 3.0% | 701 |
| stelo.Chord 1.0 | 8 | 941 | 13.3% | 81.2% | 0.0% | 5.5% | 738 |
| stelo.PastFuture 2.3.2 | 8 | 1602 | 19.9% | 71.4% | 0.0% | 8.7% | 780 |
| synnalagma.NeuralPremier 0.51 | 8 | 842 | 14.1% | 80.4% | 0.1% | 5.4% | 626 |
| xander.cat.SamAxe 1.1 | 8 | 691 | 6.3% | 91.2% | 0.0% | 2.5% | 555 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 8 | 8 | 0 | 0 | 0.48 | 0 | 0 | 0 |
| alk.lap.LoudAndProud 2.23 | 8 | 7 | 332 | 0 | 0.31 | 0 | 0 | 0 |
| axeBots.Musashi 2.18 | 8 | 7 | 0 | 0 | 0.35 | 1 | 1 | 0 |
| axeBots.Okami 1.04 | 8 | 7 | 317 | 0 | 0.76 | 0 | 0 | 0 |
| cjm.Charo 1.1 | 8 | 7 | 308 | 0 | 0.31 | 0 | 0 | 0 |
| cx.micro.Spark 0.6 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| cx.mini.Cigaret 1.31 | 8 | 5 | 1071 | 0 | 0.28 | 3 | 3 | 0 |
| davidalves.PhoenixOS 1.1 | 8 | 7 | 0 | 0 | 0.34 | 1 | 1 | 0 |
| deo.CloudBot 1.3 | 8 | 7 | 325 | 0 | 0.35 | 0 | 0 | 0 |
| dft.Immortal 1.40 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| dragonbyte.Neutrino 4 | 8 | 6 | 0 | 0 | 0.30 | 2 | 2 | 0 |
| drm.Magazine 0.39 | 8 | 5 | 0 | 0 | 0.27 | 3 | 3 | 0 |
| dz.GalbaMini 0.121 | 8 | 7 | 0 | 0 | 0.34 | 1 | 1 | 0 |
| eem.zapper v6.03 | 8 | 6 | 0 | 0 | 0.43 | 2 | 2 | 0 |
| fromHell.C22H30N2O2S 2.2 | 8 | 7 | 0 | 0 | 0.26 | 1 | 1 | 0 |
| hlavko.micro.Flex 1.5 | 8 | 8 | 0 | 0 | 0.27 | 0 | 0 | 0 |
| jk.micro.Cotillion 0.8 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| jk.sheldor.nano.Yatagan 1.2.3 | 8 | 6 | 0 | 0 | 0.28 | 2 | 2 | 0 |
| lazarecki.mega.PinkerStinker 0.7 | 8 | 8 | 0 | 0 | 0.46 | 0 | 0 | 0 |
| lj.Dapps 0.2 | 8 | 7 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| nat.Samekh 0.4 | 8 | 5 | 603 | 0 | 0.37 | 2 | 2 | 0 |
| nz.jdc.nano.NeophytePRAL 1.4 | 8 | 6 | 1417 | 0 | 0.32 | 0 | 0 | 0 |
| origin.SleepSiphon 1.7b | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| pe.SandboxLump 1.52 | 8 | 7 | 592 | 0 | 0.35 | 0 | 0 | 0 |
| penguin.Ivy 1.1r | 8 | 4 | 673 | 0 | 0.30 | 3 | 3 | 0 |
| penguin.MrFreeze 1.0a | 8 | 8 | 0 | 0 | 0.42 | 0 | 0 | 0 |
| pez.mini.VertiLeach 0.4.0 | 8 | 8 | 0 | 1 | 0.36 | 0 | 0 | 8 |
| rampancy.Durandal 2.2d | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| ry.VirtualGunExperiment 1.2.0 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| sheldor.micro.EpeeistDC 3.0 | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| sheldor.nano.FoilistNano 3.2 | 8 | 6 | 638 | 0 | 0.30 | 1 | 1 | 0 |
| slugzilla.ButtHead 2.0 | 8 | 8 | 0 | 0 | 0.28 | 0 | 0 | 0 |
| slugzilla.RandomGF 1.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| sos.SOS 1.0 | 8 | 7 | 0 | 0 | 0.26 | 1 | 1 | 0 |
| stelo.Chord 1.0 | 8 | 7 | 0 | 0 | 0.34 | 1 | 1 | 0 |
| stelo.PastFuture 2.3.2 | 8 | 7 | 0 | 0 | 0.33 | 1 | 1 | 0 |
| synnalagma.NeuralPremier 0.51 | 8 | 7 | 526 | 0 | 0.30 | 0 | 0 | 0 |
| xander.cat.SamAxe 1.1 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |

283 of 320 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 17434 | 71 | 17432 | 17424 (99.9%) | 10 (0.1%) | 8 (0.0%) | 1035 | 293 | 78 |
| alk.lap.LoudAndProud 2.23 | 6801 | 18 | 6785 | 6781 (99.7%) | 20 (0.3%) | 4 (0.1%) | 131 | 101 | 26 |
| axeBots.Musashi 2.18 | 12095 | 7 | 13430 | 12095 (100.0%) | 0 (0.0%) | 1335 (9.9%) | 1231 | 173 | 35 |
| axeBots.Okami 1.04 | 12712 | 7 | 14320 | 12690 (99.8%) | 22 (0.2%) | 1630 (11.4%) | 1247 | 177 | 154 |
| cjm.Charo 1.1 | 6954 | 6 | 6938 | 6934 (99.7%) | 20 (0.3%) | 4 (0.1%) | 238 | 95 | 21 |
| cx.micro.Spark 0.6 | 8941 | 16 | 8941 | 8941 (100.0%) | 0 (0.0%) | 0 (0.0%) | 357 | 132 | 34 |
| cx.mini.Cigaret 1.31 | 7055 | 3 | 6990 | 6990 (99.1%) | 65 (0.9%) | 0 (0.0%) | 274 | 84 | 39 |
| davidalves.PhoenixOS 1.1 | 12489 | 7 | 13065 | 12488 (100.0%) | 1 (0.0%) | 577 (4.4%) | 1628 | 139 | 37 |
| deo.CloudBot 1.3 | 9085 | 14 | 9061 | 9061 (99.7%) | 24 (0.3%) | 0 (0.0%) | 223 | 136 | 30 |
| dft.Immortal 1.40 | 11894 | 7 | 11920 | 11894 (100.0%) | 0 (0.0%) | 26 (0.2%) | 466 | 126 | 45 |
| dmh.robocode.robot.BlackDeath 9.2 | 6775 | 30 | 6778 | 6775 (100.0%) | 0 (0.0%) | 3 (0.0%) | 127 | 100 | 20 |
| dragonbyte.Neutrino 4 | 24522 | 0 | 37835 | 24522 (100.0%) | 0 (0.0%) | 13313 (35.2%) | 3534 | 157 | 27 |
| drm.Magazine 0.39 | 7318 | 38 | 7317 | 7315 (100.0%) | 3 (0.0%) | 2 (0.0%) | 183 | 95 | 28 |
| dz.GalbaMini 0.121 | 11551 | 12 | 11550 | 11549 (100.0%) | 2 (0.0%) | 1 (0.0%) | 481 | 145 | 35 |
| eem.zapper v6.03 | 18223 | 23 | 18243 | 18223 (100.0%) | 0 (0.0%) | 20 (0.1%) | 975 | 186 | 68 |
| fromHell.C22H30N2O2S 2.2 | 7051 | 11 | 7055 | 7049 (100.0%) | 2 (0.0%) | 6 (0.1%) | 271 | 109 | 26 |
| hlavko.micro.Flex 1.5 | 6382 | 23 | 6393 | 6377 (99.9%) | 5 (0.1%) | 16 (0.3%) | 456 | 117 | 17 |
| jk.micro.Cotillion 0.8 | 11807 | 7 | 11826 | 11807 (100.0%) | 0 (0.0%) | 19 (0.2%) | 501 | 135 | 31 |
| jk.sheldor.nano.Yatagan 1.2.3 | 7304 | 20 | 7306 | 7298 (99.9%) | 6 (0.1%) | 8 (0.1%) | 513 | 129 | 21 |
| lazarecki.mega.PinkerStinker 0.7 | 11448 | 8 | 11502 | 11447 (100.0%) | 1 (0.0%) | 55 (0.5%) | 794 | 167 | 69 |
| lj.Dapps 0.2 | 11831 | 52 | 11830 | 11823 (99.9%) | 8 (0.1%) | 7 (0.1%) | 479 | 162 | 23 |
| nat.Samekh 0.4 | 13014 | 75 | 12971 | 12967 (99.6%) | 47 (0.4%) | 4 (0.0%) | 550 | 158 | 61 |
| nz.jdc.nano.NeophytePRAL 1.4 | 7611 | 29 | 7524 | 7504 (98.6%) | 107 (1.4%) | 20 (0.3%) | 435 | 146 | 24 |
| origin.SleepSiphon 1.7b | 8356 | 18 | 8356 | 8355 (100.0%) | 1 (0.0%) | 1 (0.0%) | 291 | 118 | 20 |
| pe.SandboxLump 1.52 | 6173 | 23 | 6136 | 6136 (99.4%) | 37 (0.6%) | 0 (0.0%) | 71 | 100 | 34 |
| penguin.Ivy 1.1r | 7053 | 2 | 7036 | 7032 (99.7%) | 21 (0.3%) | 4 (0.1%) | 699 | 83 | 41 |
| penguin.MrFreeze 1.0a | 13812 | 11 | 13817 | 13812 (100.0%) | 0 (0.0%) | 5 (0.0%) | 423 | 188 | 52 |
| pez.mini.VertiLeach 0.4.0 | 168 | 0 | 168 | 167 (99.4%) | 1 (0.6%) | 1 (0.6%) | 8 | 5 | 10 |
| rampancy.Durandal 2.2d | 8062 | 22 | 8062 | 8057 (99.9%) | 5 (0.1%) | 5 (0.1%) | 483 | 136 | 24 |
| ry.VirtualGunExperiment 1.2.0 | 13224 | 8 | 13224 | 13224 (100.0%) | 0 (0.0%) | 0 (0.0%) | 463 | 162 | 30 |
| sheldor.micro.EpeeistDC 3.0 | 16575 | 89 | 16585 | 16575 (100.0%) | 0 (0.0%) | 10 (0.1%) | 787 | 176 | 57 |
| sheldor.micro.PointInLineRRAL 1.0 | 14635 | 13 | 14636 | 14635 (100.0%) | 0 (0.0%) | 1 (0.0%) | 438 | 132 | 21 |
| sheldor.nano.FoilistNano 3.2 | 7951 | 13 | 7907 | 7892 (99.3%) | 59 (0.7%) | 15 (0.2%) | 453 | 106 | 25 |
| slugzilla.ButtHead 2.0 | 1909 | 25 | 1919 | 1909 (100.0%) | 0 (0.0%) | 10 (0.5%) | 8155 | 660 | 18 |
| slugzilla.RandomGF 1.0 | 11357 | 13 | 11357 | 11357 (100.0%) | 0 (0.0%) | 0 (0.0%) | 294 | 112 | 27 |
| sos.SOS 1.0 | 10768 | 41 | 10768 | 10768 (100.0%) | 0 (0.0%) | 0 (0.0%) | 228 | 142 | 23 |
| stelo.Chord 1.0 | 11155 | 16 | 11150 | 11149 (99.9%) | 6 (0.1%) | 1 (0.0%) | 325 | 113 | 105 |
| stelo.PastFuture 2.3.2 | 12209 | 18 | 12211 | 12208 (100.0%) | 1 (0.0%) | 3 (0.0%) | 480 | 149 | 41 |
| synnalagma.NeuralPremier 0.51 | 7687 | 24 | 7659 | 7658 (99.6%) | 29 (0.4%) | 1 (0.0%) | 286 | 113 | 24 |
| xander.cat.SamAxe 1.1 | 7212 | 13 | 7212 | 7208 (99.9%) | 4 (0.1%) | 4 (0.1%) | 467 | 143 | 22 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.Glacier 0.3.2 | 18207 | 1655 (9.1%) | 17348 |
| alk.lap.LoudAndProud 2.23 | 7794 | 512 (6.6%) | 1360 |
| axeBots.Musashi 2.18 | 18463 | 1061 (5.7%) | 13530 |
| axeBots.Okami 1.04 | 19556 | 1140 (5.8%) | 15893 |
| cjm.Charo 1.1 | 9188 | 619 (6.7%) | 3886 |
| cx.micro.Spark 0.6 | 10073 | 783 (7.8%) | 5453 |
| cx.mini.Cigaret 1.31 | 9749 | 619 (6.3%) | 4457 |
| davidalves.PhoenixOS 1.1 | 18447 | 1062 (5.8%) | 15930 |
| deo.CloudBot 1.3 | 9075 | 890 (9.8%) | 6243 |
| dft.Immortal 1.40 | 14617 | 1337 (9.1%) | 11466 |
| dmh.robocode.robot.BlackDeath 9.2 | 6840 | 588 (8.6%) | 5085 |
| dragonbyte.Neutrino 4 | 38702 | 1600 (4.1%) | 36500 |
| drm.Magazine 0.39 | 8679 | 543 (6.3%) | 4030 |
| dz.GalbaMini 0.121 | 12503 | 1079 (8.6%) | 9012 |
| eem.zapper v6.03 | 19351 | 1856 (9.6%) | 17345 |
| fromHell.C22H30N2O2S 2.2 | 7476 | 574 (7.7%) | 4293 |
| hlavko.micro.Flex 1.5 | 6568 | 498 (7.6%) | 3976 |
| jk.micro.Cotillion 0.8 | 13996 | 1113 (8.0%) | 11508 |
| jk.sheldor.nano.Yatagan 1.2.3 | 7076 | 557 (7.9%) | 3130 |
| lazarecki.mega.PinkerStinker 0.7 | 15197 | 999 (6.6%) | 8846 |
| lj.Dapps 0.2 | 11753 | 1033 (8.8%) | 8708 |
| nat.Samekh 0.4 | 14925 | 1133 (7.6%) | 9820 |
| nz.jdc.nano.NeophytePRAL 1.4 | 6756 | 616 (9.1%) | 3570 |
| origin.SleepSiphon 1.7b | 7879 | 593 (7.5%) | 3404 |
| pe.SandboxLump 1.52 | 6960 | 546 (7.8%) | 3552 |
| penguin.Ivy 1.1r | 15133 | 625 (4.1%) | 4914 |
| penguin.MrFreeze 1.0a | 14180 | 1345 (9.5%) | 10963 |
| pez.mini.VertiLeach 0.4.0 | 188 | 16 (8.5%) | 0 |
| rampancy.Durandal 2.2d | 9091 | 674 (7.4%) | 3389 |
| ry.VirtualGunExperiment 1.2.0 | 14318 | 1279 (8.9%) | 12212 |
| sheldor.micro.EpeeistDC 3.0 | 17030 | 1591 (9.3%) | 14141 |
| sheldor.micro.PointInLineRRAL 1.0 | 15612 | 1041 (6.7%) | 9762 |
| sheldor.nano.FoilistNano 3.2 | 7522 | 692 (9.2%) | 3021 |
| slugzilla.ButtHead 2.0 | 1921 | 42 (2.2%) | 729 |
| slugzilla.RandomGF 1.0 | 12225 | 1141 (9.3%) | 9926 |
| sos.SOS 1.0 | 10526 | 849 (8.1%) | 7452 |
| stelo.Chord 1.0 | 11718 | 1140 (9.7%) | 9641 |
| stelo.PastFuture 2.3.2 | 12869 | 1102 (8.6%) | 10762 |
| synnalagma.NeuralPremier 0.51 | 8769 | 688 (7.8%) | 4917 |
| xander.cat.SamAxe 1.1 | 7203 | 596 (8.3%) | 3963 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 650 | 425 | 650 | 843 | 37.3 / 36.3 | 399 | 3247 | 1212 |
| alk.lap.LoudAndProud 2.23 | 650 | 494 | 525 | 413 | 41.3 / 21.6 | 1322 | 6158 | 2783 |
| axeBots.Musashi 2.18 | 650 | 487 | 559 | 867 | 47.4 / 24.5 | 1198 | 2008 | 52 |
| axeBots.Okami 1.04 | 650 | 510 | 619 | 908 | 45.3 / 24.7 | 791 | 1789 | 88 |
| cjm.Charo 1.1 | 650 | 415 | 556 | 472 | 37.3 / 24.9 | 667 | 5357 | 1 |
| cx.micro.Spark 0.6 | 650 | 501 | 597 | 514 | 40.4 / 23.3 | 1167 | 5546 | 40 |
| cx.mini.Cigaret 1.31 | 650 | 500 | 588 | 499 | 37.2 / 24.4 | 632 | 5325 | 110 |
| davidalves.PhoenixOS 1.1 | 650 | 463 | 400 | 864 | 35.6 / 29.7 | 1685 | 1808 | 204 |
| deo.CloudBot 1.3 | 650 | 377 | 447 | 483 | 50.3 / 22.4 | 2247 | 3954 | 2407 |
| dft.Immortal 1.40 | 650 | 503 | 650 | 706 | 34.3 / 27.6 | 93 | 3297 | 374 |
| dmh.robocode.robot.BlackDeath 9.2 | 650 | 463 | 400 | 382 | 57.4 / 14.7 | 3134 | 5020 | 131 |
| dragonbyte.Neutrino 4 | 650 | 415 | 400 | 1766 | 78.7 / 0.2 | 3646 | 30 | 32 |
| drm.Magazine 0.39 | 650 | 552 | 597 | 450 | 40.0 / 24.9 | 1102 | 7057 | 321 |
| dz.GalbaMini 0.121 | 650 | 437 | 644 | 619 | 41.5 / 31.8 | 871 | 4172 | 1 |
| eem.zapper v6.03 | 650 | 498 | 650 | 892 | 35.0 / 33.3 | 147 | 2599 | 5 |
| fromHell.C22H30N2O2S 2.2 | 650 | 365 | 559 | 411 | 47.4 / 25.2 | 2470 | 4308 | 2237 |
| hlavko.micro.Flex 1.5 | 650 | 331 | 403 | 369 | 53.9 / 21.1 | 2623 | 4436 | 267 |
| jk.micro.Cotillion 0.8 | 650 | 521 | 613 | 668 | 33.6 / 33.8 | 278 | 2541 | 81 |
| jk.sheldor.nano.Yatagan 1.2.3 | 650 | 323 | 403 | 397 | 57.2 / 27.1 | 2725 | 3704 | 1698 |
| lazarecki.mega.PinkerStinker 0.7 | 650 | 419 | 650 | 736 | 46.6 / 26.0 | 1082 | 3227 | 64 |
| lj.Dapps 0.2 | 650 | 447 | 609 | 593 | 50.7 / 21.3 | 1602 | 5915 | 963 |
| nat.Samekh 0.4 | 650 | 486 | 650 | 716 | 33.1 / 31.4 | 159 | 4155 | 1596 |
| nz.jdc.nano.NeophytePRAL 1.4 | 650 | 340 | 519 | 392 | 69.6 / 16.4 | 4467 | 4269 | 1210 |
| origin.SleepSiphon 1.7b | 650 | 472 | 400 | 433 | 61.8 / 12.6 | 3611 | 4577 | 0 |
| pe.SandboxLump 1.52 | 650 | 335 | 503 | 385 | 51.7 / 22.6 | 2452 | 5381 | 0 |
| penguin.Ivy 1.1r | 650 | 549 | 572 | 748 | 54.5 / 14.0 | 1562 | 1733 | 0 |
| penguin.MrFreeze 1.0a | 650 | 547 | 609 | 696 | 51.1 / 17.9 | 992 | 3813 | 188 |
| pez.mini.VertiLeach 0.4.0 | 650 | 356 | 650 | 11 | 1.5 / 0.4 | 0 | 112 | 0 |
| rampancy.Durandal 2.2d | 650 | 385 | 525 | 480 | 49.3 / 27.1 | 2564 | 3511 | 2015 |
| ry.VirtualGunExperiment 1.2.0 | 650 | 512 | 619 | 704 | 41.8 / 20.3 | 372 | 4080 | 4485 |
| sheldor.micro.EpeeistDC 3.0 | 650 | 538 | 609 | 797 | 36.7 / 24.9 | 381 | 3893 | 2112 |
| sheldor.micro.PointInLineRRAL 1.0 | 650 | 548 | 553 | 750 | 38.2 / 15.0 | 175 | 4956 | 261 |
| sheldor.nano.FoilistNano 3.2 | 650 | 322 | 619 | 422 | 54.5 / 28.3 | 2931 | 3915 | 1401 |
| slugzilla.ButtHead 2.0 | 650 | 152 | 650 | 127 | 80.6 / 54.2 | 1460 | 735 | 171 |
| slugzilla.RandomGF 1.0 | 650 | 538 | 619 | 605 | 32.0 / 22.9 | 134 | 3107 | 5212 |
| sos.SOS 1.0 | 650 | 401 | 431 | 550 | 53.5 / 13.3 | 1954 | 5867 | 1354 |
| stelo.Chord 1.0 | 650 | 492 | 616 | 587 | 38.7 / 21.8 | 584 | 3585 | 3999 |
| stelo.PastFuture 2.3.2 | 650 | 456 | 650 | 630 | 36.5 / 32.7 | 350 | 2850 | 282 |
| synnalagma.NeuralPremier 0.51 | 650 | 388 | 550 | 476 | 59.4 / 19.3 | 3453 | 4228 | 124 |
| xander.cat.SamAxe 1.1 | 650 | 437 | 400 | 405 | 63.1 / 18.0 | 4174 | 3478 | 73 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 9.3% | 133 | 4161 | 3 | 62.0 | 1650 / 1655 (100%) | 0 | 0 |
| alk.lap.LoudAndProud 2.23 | 7.3% | 88 | 2158 | 3 | 24.2 | 510 / 512 (100%) | 0 | 0 |
| axeBots.Musashi 2.18 | 7.4% | 99 | 4314 | 3 | 47.8 | 1061 / 1061 (100%) | 0 | 0 |
| axeBots.Okami 1.04 | 9.5% | 214 | 650 | 3 | 51.1 | 1135 / 1140 (100%) | 0 | 0 |
| cjm.Charo 1.1 | 7.1% | 88 | 1132 | 3 | 24.8 | 618 / 619 (100%) | 0 | 0 |
| cx.micro.Spark 0.6 | 6.3% | 101 | 2352 | 3 | 31.6 | 783 / 783 (100%) | 0 | 0 |
| cx.mini.Cigaret 1.31 | 8.2% | 77 | 62 | 3 | 24.6 | 613 / 619 (99%) | 0 | 0 |
| davidalves.PhoenixOS 1.1 | 7.1% | 95 | 4938 | 3 | 46.2 | 1060 / 1062 (100%) | 0 | 0 |
| deo.CloudBot 1.3 | 8.2% | 99 | 676 | 3 | 32.3 | 887 / 890 (100%) | 0 | 0 |
| dft.Immortal 1.40 | 6.4% | 101 | 1096 | 3 | 42.5 | 1337 / 1337 (100%) | 0 | 0 |
| dmh.robocode.robot.BlackDeath 9.2 | 5.7% | 87 | 1338 | 2 | 24.2 | 586 / 588 (100%) | 0 | 0 |
| dragonbyte.Neutrino 4 | 0.4% | 84 | 999 | 3 | 133.7 | 1600 / 1600 (100%) | 0 | 0 |
| drm.Magazine 0.39 | 5.7% | 76 | 5225 | 3 | 25.8 | 543 / 543 (100%) | 0 | 0 |
| dz.GalbaMini 0.121 | 8.1% | 96 | 2541 | 3 | 40.9 | 1078 / 1079 (100%) | 0 | 0 |
| eem.zapper v6.03 | 7.6% | 120 | 15546 | 3 | 64.8 | 1851 / 1856 (100%) | 0 | 0 |
| fromHell.C22H30N2O2S 2.2 | 7.4% | 74 | 777 | 3 | 25.1 | 573 / 574 (100%) | 0 | 0 |
| hlavko.micro.Flex 1.5 | 7.0% | 75 | 382 | 3 | 22.4 | 498 / 498 (100%) | 0 | 0 |
| jk.micro.Cotillion 0.8 | 7.4% | 92 | 2644 | 3 | 42.1 | 1113 / 1113 (100%) | 0 | 0 |
| jk.sheldor.nano.Yatagan 1.2.3 | 9.8% | 79 | 627 | 3 | 25.8 | 557 / 557 (100%) | 0 | 0 |
| lazarecki.mega.PinkerStinker 0.7 | 7.5% | 128 | 4731 | 3 | 40.9 | 999 / 999 (100%) | 0 | 0 |
| lj.Dapps 0.2 | 7.1% | 88 | 4429 | 3 | 42.1 | 1031 / 1033 (100%) | 0 | 0 |
| nat.Samekh 0.4 | 9.3% | 104 | 3942 | 3 | 45.9 | 1127 / 1133 (99%) | 0 | 0 |
| nz.jdc.nano.NeophytePRAL 1.4 | 12.3% | 90 | 663 | 3 | 26.9 | 606 / 616 (98%) | 0 | 0 |
| origin.SleepSiphon 1.7b | 5.2% | 92 | 699 | 3 | 29.8 | 592 / 593 (100%) | 0 | 0 |
| pe.SandboxLump 1.52 | 9.0% | 99 | 318 | 3 | 21.9 | 544 / 546 (100%) | 0 | 0 |
| penguin.Ivy 1.1r | 5.6% | 85 | 1682 | 3 | 24.6 | 622 / 625 (100%) | 0 | 0 |
| penguin.MrFreeze 1.0a | 7.8% | 117 | 2210 | 3 | 49.3 | 1344 / 1345 (100%) | 0 | 0 |
| pez.mini.VertiLeach 0.4.0 | 0.1% | 102 | 14 | 3 | 0.6 | 16 / 16 (100%) | 0 | 0 |
| rampancy.Durandal 2.2d | 7.9% | 86 | 1669 | 3 | 28.8 | 673 / 674 (100%) | 0 | 0 |
| ry.VirtualGunExperiment 1.2.0 | 5.9% | 99 | 3180 | 3 | 47.1 | 1278 / 1279 (100%) | 0 | 0 |
| sheldor.micro.EpeeistDC 3.0 | 6.3% | 110 | 4222 | 3 | 59.2 | 1584 / 1591 (100%) | 0 | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 4.3% | 87 | 663 | 3 | 52.2 | 1041 / 1041 (100%) | 0 | 0 |
| sheldor.nano.FoilistNano 3.2 | 12.1% | 84 | 2441 | 3 | 28.0 | 690 / 692 (100%) | 0 | 0 |
| slugzilla.ButtHead 2.0 | 55.2% | 77 | 25 | 3 | 6.0 | 42 / 42 (100%) | 0 | 0 |
| slugzilla.RandomGF 1.0 | 5.3% | 88 | 4837 | 3 | 40.5 | 1140 / 1141 (100%) | 0 | 0 |
| sos.SOS 1.0 | 6.0% | 74 | 243 | 3 | 38.1 | 849 / 849 (100%) | 0 | 0 |
| stelo.Chord 1.0 | 5.7% | 94 | 3780 | 3 | 39.4 | 1139 / 1140 (100%) | 0 | 0 |
| stelo.PastFuture 2.3.2 | 8.0% | 92 | 7651 | 3 | 43.4 | 1102 / 1102 (100%) | 0 | 0 |
| synnalagma.NeuralPremier 0.51 | 8.9% | 85 | 1701 | 3 | 27.3 | 687 / 688 (100%) | 0 | 0 |
| xander.cat.SamAxe 1.1 | 7.5% | 82 | 1931 | 3 | 25.8 | 595 / 596 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| alk.lap.LoudAndProud 2.23 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| axeBots.Musashi 2.18 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| axeBots.Okami 1.04 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cjm.Charo 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cx.micro.Spark 0.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cx.mini.Cigaret 1.31 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.PhoenixOS 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| deo.CloudBot 1.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dft.Immortal 1.40 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dmh.robocode.robot.BlackDeath 9.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dragonbyte.Neutrino 4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| drm.Magazine 0.39 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dz.GalbaMini 0.121 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| eem.zapper v6.03 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| fromHell.C22H30N2O2S 2.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| hlavko.micro.Flex 1.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jk.micro.Cotillion 0.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jk.sheldor.nano.Yatagan 1.2.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lazarecki.mega.PinkerStinker 0.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lj.Dapps 0.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.Samekh 0.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nz.jdc.nano.NeophytePRAL 1.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| origin.SleepSiphon 1.7b | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pe.SandboxLump 1.52 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| penguin.Ivy 1.1r | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| penguin.MrFreeze 1.0a | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pez.mini.VertiLeach 0.4.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rampancy.Durandal 2.2d | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ry.VirtualGunExperiment 1.2.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sheldor.micro.EpeeistDC 3.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sheldor.nano.FoilistNano 3.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| slugzilla.ButtHead 2.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| slugzilla.RandomGF 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sos.SOS 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.Chord 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.PastFuture 2.3.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| synnalagma.NeuralPremier 0.51 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| xander.cat.SamAxe 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | hadur2.Hadur 3.9 | 8 | 82.5% ± 16.6 | 70.0% ± 11.8 | -12.5 ± 24.0 | 51.3% ± 10.0 | 51.7% ± 6.0 | +0.4 ± 9.6 |
| ags.Glacier 0.3.2 | hadur2.Hadur 3.4 | 8 | 75.0% ± 14.8 | 76.3% ± 10.9 | +1.2 ± 14.4 | 47.6% ± 4.5 | 52.6% ± 5.2 | +5.0 ± 6.1 |
| alk.lap.LoudAndProud 2.23 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 98.8% ± 3.0 | +8.8 ± 13.7 | 57.3% ± 8.1 | 66.1% ± 5.3 | +8.8 ± 8.3 |
| alk.lap.LoudAndProud 2.23 | hadur2.Hadur 3.4 | 8 | 87.5% ± 15.3 | 95.0% ± 6.3 | +7.5 ± 17.2 | 53.8% ± 5.5 | 65.2% ± 7.4 | +11.4 ± 8.4 |
| axeBots.Musashi 2.18 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 86.1% ± 7.6 | -3.9 ± 15.3 | 64.1% ± 7.8 | 65.4% ± 4.2 | +1.4 ± 9.3 |
| axeBots.Musashi 2.18 | hadur2.Hadur 3.4 | 8 | 92.5% ± 8.7 | 93.5% ± 6.7 | +1.0 ± 8.3 | 66.4% ± 10.9 | 67.8% ± 5.7 | +1.4 ± 12.0 |
| axeBots.Okami 1.04 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 86.3% ± 7.7 | -1.2 ± 9.4 | 60.7% ± 8.0 | 68.8% ± 5.0 | +8.1 ± 9.1 |
| axeBots.Okami 1.04 | hadur2.Hadur 3.4 | 8 | 90.0% ± 12.6 | 90.0% ± 7.7 | +0.0 ± 11.8 | 60.4% ± 6.9 | 66.6% ± 5.1 | +6.3 ± 6.7 |
| cjm.Charo 1.1 | hadur2.Hadur 3.9 | 8 | 95.0% ± 11.8 | 97.5% ± 5.9 | +2.5 ± 14.0 | 62.0% ± 7.3 | 59.3% ± 4.3 | -2.7 ± 9.2 |
| cjm.Charo 1.1 | hadur2.Hadur 3.4 | 8 | 90.0% ± 8.9 | 96.3% ± 4.3 | +6.2 ± 10.9 | 56.5% ± 9.8 | 62.0% ± 6.7 | +5.5 ± 10.3 |
| cx.micro.Spark 0.6 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 90.0% ± 7.7 | +0.0 ± 16.1 | 61.6% ± 5.9 | 65.2% ± 5.7 | +3.6 ± 9.2 |
| cx.micro.Spark 0.6 | hadur2.Hadur 3.4 | 8 | 90.0% ± 15.5 | 92.5% ± 11.6 | +2.5 ± 20.4 | 67.3% ± 11.5 | 63.1% ± 7.8 | -4.2 ± 13.4 |
| cx.mini.Cigaret 1.31 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 91.3% ± 5.4 | +1.2 ± 13.0 | 53.1% ± 5.5 | 61.4% ± 6.0 | +8.3 ± 10.0 |
| cx.mini.Cigaret 1.31 | hadur2.Hadur 3.4 | 8 | 87.5% ± 15.3 | 93.5% ± 8.1 | +6.0 ± 16.2 | 54.1% ± 9.4 | 62.3% ± 9.2 | +8.2 ± 11.9 |
| davidalves.PhoenixOS 1.1 | hadur2.Hadur 3.9 | 8 | 82.5% ± 5.9 | 89.9% ± 4.5 | +7.4 ± 7.7 | 53.1% ± 6.7 | 58.1% ± 3.3 | +5.0 ± 9.1 |
| davidalves.PhoenixOS 1.1 | hadur2.Hadur 3.4 | 8 | 85.0% ± 7.7 | 78.3% ± 8.7 | -6.7 ± 12.7 | 55.5% ± 4.3 | 55.0% ± 3.7 | -0.4 ± 4.5 |
| deo.CloudBot 1.3 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 96.3% ± 4.3 | +1.2 ± 5.4 | 73.2% ± 9.6 | 65.4% ± 5.3 | -7.8 ± 7.2 |
| deo.CloudBot 1.3 | hadur2.Hadur 3.4 | 8 | 82.5% ± 10.7 | 97.5% ± 3.9 | +15.0 ± 8.9 | 68.4% ± 8.9 | 71.0% ± 2.3 | +2.7 ± 8.7 |
| dft.Immortal 1.40 | hadur2.Hadur 3.9 | 8 | 80.0% ± 12.6 | 90.8% ± 7.4 | +10.8 ± 14.9 | 42.8% ± 7.9 | 52.5% ± 6.8 | +9.7 ± 10.5 |
| dft.Immortal 1.40 | hadur2.Hadur 3.4 | 8 | 92.5% ± 8.7 | 90.0% ± 8.9 | -2.5 ± 12.4 | 48.9% ± 5.5 | 59.7% ± 8.0 | +10.8 ± 8.0 |
| dmh.robocode.robot.BlackDeath 9.2 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 66.6% ± 7.2 | 80.0% ± 2.1 | +13.5 ± 8.9 |
| dmh.robocode.robot.BlackDeath 9.2 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 70.1% ± 8.1 | 79.2% ± 5.2 | +9.1 ± 9.2 |
| dragonbyte.Neutrino 4 | hadur2.Hadur 3.9 | 8 | 50.0% ± 15.5 | 58.9% ± 15.6 | +8.9 ± 21.4 | 99.8% ± 0.2 | 99.8% ± 0.1 | -0.1 ± 0.2 |
| dragonbyte.Neutrino 4 | hadur2.Hadur 3.4 | 8 | 42.5% ± 20.8 | 60.0% ± 17.5 | +17.5 ± 29.4 | 99.8% ± 0.2 | 99.7% ± 0.2 | -0.1 ± 0.1 |
| drm.Magazine 0.39 | hadur2.Hadur 3.9 | 8 | 77.5% ± 18.8 | 93.8% ± 6.2 | +16.3 ± 18.4 | 50.7% ± 7.6 | 60.7% ± 6.1 | +10.0 ± 10.7 |
| drm.Magazine 0.39 | hadur2.Hadur 3.4 | 8 | 87.5% ± 8.7 | 97.2% ± 4.3 | +9.7 ± 7.8 | 54.5% ± 9.0 | 60.0% ± 4.4 | +5.5 ± 10.3 |
| dz.GalbaMini 0.121 | hadur2.Hadur 3.9 | 8 | 85.0% ± 11.8 | 81.8% ± 9.2 | -3.2 ± 13.7 | 59.0% ± 6.2 | 55.0% ± 5.6 | -4.0 ± 8.1 |
| dz.GalbaMini 0.121 | hadur2.Hadur 3.4 | 8 | 85.0% ± 11.8 | 80.7% ± 14.5 | -4.3 ± 18.8 | 60.2% ± 8.2 | 55.1% ± 5.8 | -5.1 ± 9.7 |
| eem.zapper v6.03 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 91.1% ± 7.0 | -1.4 ± 10.5 | 56.4% ± 3.7 | 52.8% ± 6.3 | -3.6 ± 6.6 |
| eem.zapper v6.03 | hadur2.Hadur 3.4 | 8 | 85.0% ± 11.8 | 84.6% ± 13.5 | -0.4 ± 21.2 | 54.1% ± 7.1 | 52.3% ± 6.5 | -1.8 ± 11.2 |
| fromHell.C22H30N2O2S 2.2 | hadur2.Hadur 3.9 | 8 | 87.5% ± 15.3 | 91.1% ± 3.0 | +3.6 ± 14.6 | 57.0% ± 7.5 | 66.1% ± 5.0 | +9.1 ± 8.0 |
| fromHell.C22H30N2O2S 2.2 | hadur2.Hadur 3.4 | 8 | 90.0% ± 12.6 | 92.5% ± 8.7 | +2.5 ± 16.6 | 62.9% ± 8.2 | 66.5% ± 6.1 | +3.5 ± 10.6 |
| hlavko.micro.Flex 1.5 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 92.5% ± 5.9 | +0.0 ± 10.9 | 69.7% ± 6.7 | 70.3% ± 7.2 | +0.6 ± 8.9 |
| hlavko.micro.Flex 1.5 | hadur2.Hadur 3.4 | 8 | 95.0% ± 7.7 | 96.3% ± 6.2 | +1.2 ± 7.0 | 67.6% ± 5.9 | 73.5% ± 3.2 | +5.9 ± 7.3 |
| jk.micro.Cotillion 0.8 | hadur2.Hadur 3.9 | 8 | 78.8% ± 19.2 | 84.7% ± 7.9 | +6.0 ± 20.8 | 55.3% ± 10.7 | 49.0% ± 5.4 | -6.3 ± 12.9 |
| jk.micro.Cotillion 0.8 | hadur2.Hadur 3.4 | 8 | 77.5% ± 14.0 | 76.3% ± 9.9 | -1.3 ± 17.6 | 56.6% ± 8.5 | 48.1% ± 6.1 | -8.5 ± 10.3 |
| jk.sheldor.nano.Yatagan 1.2.3 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 89.9% ± 6.3 | -10.1 ± 6.3 | 85.5% ± 2.8 | 64.7% ± 4.4 | -20.8 ± 4.8 |
| jk.sheldor.nano.Yatagan 1.2.3 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 91.0% ± 7.0 | -9.0 ± 7.0 | 83.1% ± 3.3 | 64.8% ± 3.9 | -18.3 ± 4.7 |
| lazarecki.mega.PinkerStinker 0.7 | hadur2.Hadur 3.9 | 8 | 77.5% ± 10.7 | 88.8% ± 8.3 | +11.2 ± 10.4 | 58.8% ± 4.1 | 65.5% ± 7.2 | +6.7 ± 9.2 |
| lazarecki.mega.PinkerStinker 0.7 | hadur2.Hadur 3.4 | 8 | 85.0% ± 17.3 | 92.5% ± 3.9 | +7.5 ± 16.0 | 60.3% ± 8.0 | 68.2% ± 4.6 | +7.9 ± 7.8 |
| lj.Dapps 0.2 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 96.3% ± 4.3 | +3.7 ± 9.9 | 64.9% ± 6.7 | 70.4% ± 3.4 | +5.4 ± 9.4 |
| lj.Dapps 0.2 | hadur2.Hadur 3.4 | 8 | 90.0% ± 8.9 | 97.5% ± 5.9 | +7.5 ± 8.7 | 61.6% ± 5.6 | 73.0% ± 3.8 | +11.4 ± 6.6 |
| nat.Samekh 0.4 | hadur2.Hadur 3.9 | 8 | 82.5% ± 10.7 | 85.4% ± 9.6 | +2.9 ± 7.5 | 48.1% ± 10.6 | 54.1% ± 8.7 | +6.0 ± 12.4 |
| nat.Samekh 0.4 | hadur2.Hadur 3.4 | 8 | 82.5% ± 14.0 | 79.7% ± 10.0 | -2.8 ± 18.3 | 48.5% ± 5.9 | 52.1% ± 5.6 | +3.5 ± 8.0 |
| nz.jdc.nano.NeophytePRAL 1.4 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 76.2% ± 3.2 | 80.5% ± 2.5 | +4.3 ± 3.3 |
| nz.jdc.nano.NeophytePRAL 1.4 | hadur2.Hadur 3.4 | 8 | 92.5% ± 8.7 | 100.0% ± 0.0 | +7.5 ± 8.7 | 73.0% ± 6.7 | 81.0% ± 4.0 | +8.0 ± 7.0 |
| origin.SleepSiphon 1.7b | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 76.5% ± 5.8 | 85.6% ± 5.1 | +9.0 ± 7.5 |
| origin.SleepSiphon 1.7b | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 81.7% ± 6.9 | 83.7% ± 4.8 | +2.0 ± 7.9 |
| pe.SandboxLump 1.52 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 90.0% ± 7.7 | +0.0 ± 17.3 | 64.0% ± 8.3 | 67.0% ± 4.4 | +3.1 ± 10.1 |
| pe.SandboxLump 1.52 | hadur2.Hadur 3.4 | 8 | 92.5% ± 12.4 | 95.0% ± 4.5 | +2.5 ± 14.0 | 66.8% ± 7.9 | 70.4% ± 6.0 | +3.6 ± 12.1 |
| penguin.Ivy 1.1r | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 96.3% ± 4.3 | +6.3 ± 15.4 | 75.3% ± 6.5 | 78.2% ± 7.5 | +2.8 ± 11.8 |
| penguin.Ivy 1.1r | hadur2.Hadur 3.4 | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 9.7 | 79.4% ± 4.2 | 80.0% ± 3.6 | +0.7 ± 7.1 |
| penguin.MrFreeze 1.0a | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 73.0% ± 6.6 | 74.9% ± 6.5 | +1.8 ± 10.8 |
| penguin.MrFreeze 1.0a | hadur2.Hadur 3.4 | 8 | 92.5% ± 12.4 | 93.8% ± 6.2 | +1.3 ± 10.4 | 68.6% ± 10.6 | 76.3% ± 3.7 | +7.8 ± 10.7 |
| pez.mini.VertiLeach 0.4.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 100.0% ± 0.0 | - | n/a |
| pez.mini.VertiLeach 0.4.0 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 100.0% ± 0.0 | - | n/a |
| rampancy.Durandal 2.2d | hadur2.Hadur 3.9 | 8 | 95.0% ± 11.8 | 91.3% ± 8.3 | -3.7 ± 6.2 | 69.4% ± 9.5 | 64.7% ± 7.1 | -4.7 ± 13.2 |
| rampancy.Durandal 2.2d | hadur2.Hadur 3.4 | 8 | 90.0% ± 12.6 | 91.3% ± 8.3 | +1.2 ± 15.8 | 69.5% ± 10.2 | 62.5% ± 7.3 | -7.0 ± 11.2 |
| ry.VirtualGunExperiment 1.2.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 91.1% ± 9.4 | -8.9 ± 9.4 | 66.0% ± 8.2 | 61.3% ± 7.2 | -4.7 ± 13.6 |
| ry.VirtualGunExperiment 1.2.0 | hadur2.Hadur 3.4 | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 9.7 | 66.5% ± 9.1 | 68.1% ± 2.9 | +1.5 ± 11.2 |
| sheldor.micro.EpeeistDC 3.0 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 93.6% ± 6.3 | +3.6 ± 14.9 | 61.2% ± 9.5 | 57.7% ± 4.2 | -3.5 ± 10.0 |
| sheldor.micro.EpeeistDC 3.0 | hadur2.Hadur 3.4 | 8 | 92.5% ± 8.7 | 87.5% ± 5.9 | -5.0 ± 11.8 | 64.6% ± 9.0 | 56.2% ± 3.5 | -8.3 ± 10.9 |
| sheldor.micro.PointInLineRRAL 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 93.8% ± 6.2 | -3.7 ± 7.7 | 75.5% ± 7.8 | 70.0% ± 5.7 | -5.5 ± 8.8 |
| sheldor.micro.PointInLineRRAL 1.0 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 74.8% ± 5.3 | 71.5% ± 5.1 | -3.3 ± 8.4 |
| sheldor.nano.FoilistNano 3.2 | hadur2.Hadur 3.9 | 8 | 87.5% ± 19.9 | 86.1% ± 12.6 | -1.4 ± 27.2 | 63.7% ± 7.4 | 64.5% ± 4.9 | +0.8 ± 10.7 |
| sheldor.nano.FoilistNano 3.2 | hadur2.Hadur 3.4 | 8 | 95.0% ± 11.8 | 88.3% ± 10.1 | -6.7 ± 18.3 | 66.3% ± 8.3 | 67.1% ± 4.4 | +0.8 ± 12.0 |
| slugzilla.ButtHead 2.0 | hadur2.Hadur 3.9 | 8 | 82.5% ± 16.6 | 96.3% ± 4.3 | +13.8 ± 15.4 | 61.3% ± 1.8 | 57.8% ± 2.1 | -3.4 ± 3.2 |
| slugzilla.ButtHead 2.0 | hadur2.Hadur 3.4 | 8 | 82.5% ± 16.6 | 93.8% ± 6.2 | +11.2 ± 18.1 | 63.4% ± 2.4 | 60.0% ± 1.9 | -3.4 ± 3.0 |
| slugzilla.RandomGF 1.0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 95.0% ± 6.3 | +2.5 ± 11.6 | 56.6% ± 6.0 | 59.1% ± 5.8 | +2.5 ± 8.2 |
| slugzilla.RandomGF 1.0 | hadur2.Hadur 3.4 | 8 | 90.0% ± 12.6 | 93.8% ± 6.2 | +3.8 ± 13.4 | 53.0% ± 7.8 | 61.6% ± 6.9 | +8.6 ± 11.6 |
| sos.SOS 1.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 77.0% ± 4.6 | 82.6% ± 3.5 | +5.6 ± 6.2 |
| sos.SOS 1.0 | hadur2.Hadur 3.4 | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 7.4 | 75.8% ± 5.7 | 79.9% ± 4.2 | +4.1 ± 7.3 |
| stelo.Chord 1.0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 92.2% ± 7.8 | -0.3 ± 7.8 | 76.1% ± 6.1 | 63.8% ± 6.9 | -12.3 ± 11.8 |
| stelo.Chord 1.0 | hadur2.Hadur 3.4 | 8 | 97.5% ± 5.9 | 91.3% ± 5.4 | -6.2 ± 7.7 | 70.2% ± 7.6 | 58.9% ± 8.0 | -11.3 ± 12.9 |
| stelo.PastFuture 2.3.2 | hadur2.Hadur 3.9 | 8 | 55.0% ± 24.9 | 82.9% ± 7.7 | +27.9 ± 30.2 | 41.1% ± 9.5 | 51.4% ± 4.4 | +10.3 ± 12.8 |
| stelo.PastFuture 2.3.2 | hadur2.Hadur 3.4 | 8 | 67.5% ± 19.9 | 84.6% ± 7.1 | +17.1 ± 19.2 | 47.6% ± 9.6 | 52.0% ± 7.5 | +4.3 ± 12.7 |
| synnalagma.NeuralPremier 0.51 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 91.3% ± 9.4 | +3.7 ± 14.8 | 69.1% ± 5.8 | 76.4% ± 4.9 | +7.4 ± 7.5 |
| synnalagma.NeuralPremier 0.51 | hadur2.Hadur 3.4 | 8 | 87.5% ± 8.7 | 92.5% ± 7.4 | +5.0 ± 14.1 | 68.5% ± 4.7 | 75.1% ± 2.9 | +6.6 ± 5.5 |
| xander.cat.SamAxe 1.1 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 97.5% ± 5.9 | +5.0 ± 7.7 | 70.7% ± 4.0 | 78.0% ± 4.4 | +7.2 ± 5.3 |
| xander.cat.SamAxe 1.1 | hadur2.Hadur 3.4 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 75.0% ± 4.1 | 76.7% ± 3.0 | +1.7 ± 5.4 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| ags.Glacier 0.3.2 | +7.5 ± 23.5 | -6.3 ± 7.7 | +3.7 ± 8.9 | -0.9 ± 5.7 |
| alk.lap.LoudAndProud 2.23 | +2.5 ± 24.4 | +3.7 ± 7.7 | +3.4 ± 10.1 | +0.8 ± 7.6 |
| axeBots.Musashi 2.18 | -2.5 ± 14.0 | -7.4 ± 11.1 | -2.4 ± 15.1 | -2.4 ± 6.0 |
| axeBots.Okami 1.04 | -2.5 ± 20.8 | -3.7 ± 11.8 | +0.3 ± 9.7 | +2.2 ± 3.1 |
| cjm.Charo 1.1 | +5.0 ± 17.3 | +1.2 ± 5.4 | +5.5 ± 13.4 | -2.7 ± 8.4 |
| cx.micro.Spark 0.6 | +0.0 ± 20.0 | -2.5 ± 14.7 | -5.7 ± 10.3 | +2.2 ± 12.5 |
| cx.mini.Cigaret 1.31 | +2.5 ± 16.6 | -2.2 ± 7.8 | -1.0 ± 12.0 | -0.9 ± 12.2 |
| davidalves.PhoenixOS 1.1 | -2.5 ± 5.9 | +11.5 ± 7.3 | -2.4 ± 6.0 | +3.0 ± 6.0 |
| deo.CloudBot 1.3 | +12.5 ± 12.4 | -1.2 ± 5.4 | +4.8 ± 14.1 | -5.6 ± 7.3 |
| dft.Immortal 1.40 | -12.5 ± 12.4 | +0.8 ± 9.4 | -6.1 ± 10.0 | -7.2 ± 12.6 |
| dmh.robocode.robot.BlackDeath 9.2 | -5.0 ± 7.7 | +0.0 ± 0.0 | -3.5 ± 12.9 | +0.8 ± 5.8 |
| dragonbyte.Neutrino 4 | +7.5 ± 25.2 | -1.1 ± 24.6 | +0.0 ± 0.3 | +0.0 ± 0.2 |
| drm.Magazine 0.39 | -10.0 ± 15.5 | -3.5 ± 6.4 | -3.8 ± 6.5 | +0.7 ± 4.3 |
| dz.GalbaMini 0.121 | +0.0 ± 20.0 | +1.1 ± 20.4 | -1.1 ± 12.0 | -0.0 ± 8.7 |
| eem.zapper v6.03 | +7.5 ± 15.3 | +6.5 ± 17.5 | +2.3 ± 8.2 | +0.4 ± 9.0 |
| fromHell.C22H30N2O2S 2.2 | -2.5 ± 16.6 | -1.4 ± 8.4 | -5.9 ± 5.7 | -0.3 ± 7.5 |
| hlavko.micro.Flex 1.5 | -2.5 ± 10.7 | -3.7 ± 6.2 | +2.1 ± 9.1 | -3.3 ± 5.9 |
| jk.micro.Cotillion 0.8 | +1.2 ± 25.5 | +8.5 ± 13.5 | -1.3 ± 15.0 | +0.9 ± 9.7 |
| jk.sheldor.nano.Yatagan 1.2.3 | +0.0 ± 0.0 | -1.1 ± 9.4 | +2.4 ± 5.2 | -0.1 ± 6.7 |
| lazarecki.mega.PinkerStinker 0.7 | -7.5 ± 17.7 | -3.8 ± 9.9 | -1.5 ± 7.2 | -2.8 ± 9.0 |
| lj.Dapps 0.2 | +2.5 ± 14.0 | -1.2 ± 8.3 | +3.3 ± 6.4 | -2.7 ± 5.1 |
| nat.Samekh 0.4 | +0.0 ± 17.9 | +5.7 ± 17.3 | -0.4 ± 12.6 | +2.0 ± 12.4 |
| nz.jdc.nano.NeophytePRAL 1.4 | +7.5 ± 8.7 | +0.0 ± 0.0 | +3.3 ± 6.8 | -0.5 ± 4.1 |
| origin.SleepSiphon 1.7b | +0.0 ± 0.0 | +0.0 ± 0.0 | -5.2 ± 10.6 | +1.8 ± 8.7 |
| pe.SandboxLump 1.52 | -2.5 ± 20.8 | -5.0 ± 10.0 | -2.9 ± 13.1 | -3.4 ± 7.5 |
| penguin.Ivy 1.1r | -5.0 ± 14.8 | -1.2 ± 3.0 | -4.0 ± 4.2 | -1.9 ± 8.1 |
| penguin.MrFreeze 1.0a | +5.0 ± 14.8 | +3.7 ± 8.9 | +4.5 ± 16.4 | -1.5 ± 8.7 |
| pez.mini.VertiLeach 0.4.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | n/a |
| rampancy.Durandal 2.2d | +5.0 ± 7.7 | +0.0 ± 10.9 | -0.2 ± 14.8 | +2.2 ± 11.0 |
| ry.VirtualGunExperiment 1.2.0 | +5.0 ± 7.7 | -6.4 ± 11.8 | -0.6 ± 10.1 | -6.8 ± 7.9 |
| sheldor.micro.EpeeistDC 3.0 | -2.5 ± 18.8 | +6.1 ± 9.0 | -3.4 ± 14.1 | +1.4 ± 3.4 |
| sheldor.micro.PointInLineRRAL 1.0 | -2.5 ± 5.9 | -6.2 ± 6.2 | +0.7 ± 5.7 | -1.5 ± 6.0 |
| sheldor.nano.FoilistNano 3.2 | -7.5 ± 25.2 | -2.2 ± 17.2 | -2.6 ± 11.9 | -2.6 ± 6.0 |
| slugzilla.ButtHead 2.0 | -0.0 ± 17.9 | +2.5 ± 7.4 | -2.1 ± 1.7 | -2.2 ± 2.6 |
| slugzilla.RandomGF 1.0 | +2.5 ± 10.7 | +1.2 ± 8.3 | +3.6 ± 7.3 | -2.6 ± 9.8 |
| sos.SOS 1.0 | +0.0 ± 8.9 | +2.5 ± 3.9 | +1.2 ± 5.9 | +2.7 ± 5.3 |
| stelo.Chord 1.0 | -5.0 ± 11.8 | +1.0 ± 8.9 | +5.9 ± 8.5 | +4.9 ± 10.5 |
| stelo.PastFuture 2.3.2 | -12.5 ± 32.1 | -1.7 ± 7.8 | -6.5 ± 11.8 | -0.6 ± 9.2 |
| synnalagma.NeuralPremier 0.51 | -0.0 ± 15.5 | -1.3 ± 13.7 | +0.6 ± 6.8 | +1.3 ± 5.5 |
| xander.cat.SamAxe 1.1 | -5.0 ± 11.8 | -1.2 ± 3.0 | -4.2 ± 6.9 | +1.3 ± 4.6 |
