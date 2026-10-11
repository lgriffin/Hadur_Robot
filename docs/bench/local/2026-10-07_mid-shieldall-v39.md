# Bench: hadur2.Hadur 3.9sa (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 3934 over 320 battles (12.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | mid | 61.9% ± 4.2 | 76.8% ± 4.5 | 49.3% ± 4.0 | 215 / 280 | 12.8% ± 0.5 | 9.8% ± 0.6 | 135 | 0 | 1.37 / 71.4 |
| alk.lap.LoudAndProud 2.23 | mid | 76.0% ± 2.6 | 91.4% ± 3.1 | 60.3% ± 3.1 | 256 / 280 | 16.3% ± 1.1 | 6.3% ± 0.3 | 93 | 0 | 1.21 / 16.5 |
| axeBots.Musashi 2.18 | mid | 69.7% ± 5.1 | 83.2% ± 6.8 | 57.9% ± 3.7 | 233 / 280 | 14.6% ± 0.9 | 7.7% ± 0.5 | 121 | 0 | 1.23 / 27.4 |
| axeBots.Okami 1.04 | mid | 67.9% ± 4.9 | 79.5% ± 7.1 | 58.0% ± 2.9 | 223 / 280 | 14.4% ± 0.5 | 8.5% ± 0.8 | 236 | 0 | 1.36 / 8.7 |
| cjm.Charo 1.1 | mid | 96.9% ± 1.7 | 99.6% ± 0.8 | 84.7% ± 6.7 | 279 / 280 | 14.1% ± 1.5 | 0.5% ± 0.2 | 88 | 0 | 0.49 / 15.1 |
| cx.micro.Spark 0.6 | mid | 78.4% ± 4.1 | 92.1% ± 3.6 | 54.0% ± 6.3 | 258 / 280 | 13.4% ± 1.7 | 4.2% ± 1.3 | 87 | 0 | 1.01 / 18.2 |
| cx.mini.Cigaret 1.31 | mid | 70.0% ± 5.6 | 84.3% ± 6.9 | 52.0% ± 3.1 | 236 / 280 | 13.4% ± 0.6 | 4.6% ± 0.5 | 85 | 0 | 2.10 / 16.3 |
| davidalves.PhoenixOS 1.1 | mid | 63.3% ± 3.1 | 76.3% ± 3.8 | 50.8% ± 2.3 | 214 / 280 | 13.8% ± 0.6 | 7.4% ± 0.5 | 118 | 0 | 0.94 / 284.5 |
| deo.CloudBot 1.3 | mid | 78.3% ± 4.2 | 92.5% ± 4.6 | 52.3% ± 3.8 | 259 / 280 | 12.0% ± 2.0 | 6.9% ± 6.9 | 113 | 0 | 0.74 / 318.3 |
| dft.Immortal 1.40 | mid | 68.2% ± 3.4 | 87.0% ± 4.8 | 49.6% ± 3.6 | 244 / 280 | 12.0% ± 0.7 | 9.0% ± 3.8 | 111 | 0 | 1.00 / 286.9 |
| dmh.robocode.robot.BlackDeath 9.2 | mid | 91.6% ± 2.1 | 98.9% ± 1.2 | 64.4% ± 4.5 | 277 / 280 | 9.7% ± 1.3 | 1.4% ± 0.3 | 87 | 0 | 0.62 / 20.1 |
| dragonbyte.Neutrino 4 | mid | 81.9% ± 3.4 | 57.1% ± 7.7 | 98.7% ± 0.2 | 160 / 280 | 15.4% ± 0.5 | 2.6% ± 0.2 | 75 | 0 | 0.67 / 24.2 |
| drm.Magazine 0.39 | mid | 76.9% ± 6.4 | 89.6% ± 5.7 | 54.0% ± 3.6 | 251 / 280 | 18.5% ± 2.6 | 3.8% ± 1.3 | 86 | 0 | 1.36 / 16.3 |
| dz.GalbaMini 0.121 | mid | 68.6% ± 2.8 | 83.6% ± 3.3 | 54.9% ± 3.4 | 234 / 280 | 14.6% ± 0.7 | 9.1% ± 2.2 | 113 | 0 | 0.96 / 31.4 |
| eem.zapper v6.03 | mid | 65.7% ± 6.2 | 81.7% ± 8.5 | 50.4% ± 4.4 | 229 / 280 | 11.9% ± 0.4 | 7.9% ± 0.6 | 111 | 0 | 1.99 / 62.8 |
| fromHell.C22H30N2O2S 2.2 | mid | 80.9% ± 5.0 | 94.6% ± 4.3 | 42.1% ± 4.9 | 265 / 280 | 12.6% ± 1.5 | 5.0% ± 4.7 | 76 | 0 | 0.81 / 16.6 |
| hlavko.micro.Flex 1.5 | mid | 75.7% ± 4.4 | 89.3% ± 4.6 | 60.2% ± 4.4 | 250 / 280 | 27.7% ± 7.5 | 6.6% ± 0.6 | 81 | 0 | 0.94 / 60.4 |
| jk.micro.Cotillion 0.8 | mid | 77.9% ± 8.7 | 91.4% ± 5.6 | 48.4% ± 5.8 | 256 / 280 | 11.1% ± 4.3 | 3.5% ± 2.1 | 76 | 0 | 1.13 / 23.1 |
| jk.sheldor.nano.Yatagan 1.2.3 | mid | 71.8% ± 2.1 | 82.8% ± 3.8 | 62.5% ± 1.7 | 232 / 280 | 24.4% ± 1.9 | 11.3% ± 1.0 | 84 | 0 | 0.91 / 14.1 |
| lazarecki.mega.PinkerStinker 0.7 | mid | 69.6% ± 3.8 | 80.4% ± 5.8 | 59.5% ± 2.5 | 225 / 280 | 15.0% ± 0.8 | 7.4% ± 0.5 | 131 | 0 | 0.98 / 30.3 |
| lj.Dapps 0.2 | mid | 78.8% ± 2.5 | 93.2% ± 3.6 | 65.3% ± 2.4 | 261 / 280 | 16.0% ± 1.0 | 7.6% ± 0.5 | 91 | 0 | 0.92 / 40.1 |
| nat.Samekh 0.4 | mid | 65.1% ± 5.6 | 81.8% ± 8.1 | 48.5% ± 3.2 | 229 / 280 | 11.3% ± 0.3 | 7.5% ± 0.5 | 113 | 0 | 1.10 / 35.7 |
| nz.jdc.nano.NeophytePRAL 1.4 | mid | 84.5% ± 1.2 | 96.8% ± 2.4 | 74.7% ± 0.7 | 271 / 280 | 22.0% ± 0.4 | 12.4% ± 0.8 | 94 | 0 | 0.90 / 39.5 |
| origin.SleepSiphon 1.7b | mid | 91.9% ± 2.2 | 98.2% ± 1.2 | 64.5% ± 3.8 | 275 / 280 | 19.4% ± 2.9 | 1.2% ± 0.4 | 87 | 0 | 0.66 / 133.4 |
| pe.SandboxLump 1.52 | mid | 73.6% ± 3.3 | 85.4% ± 4.5 | 60.3% ± 3.1 | 239 / 280 | 21.0% ± 2.3 | 5.7% ± 0.6 | 105 | 0 | 0.81 / 150.6 |
| penguin.Ivy 1.1r | mid | 78.7% ± 4.8 | 89.6% ± 4.6 | 67.9% ± 5.0 | 251 / 280 | 16.1% ± 0.5 | 5.8% ± 0.7 | 109 | 0 | 0.87 / 33.9 |
| penguin.MrFreeze 1.0a | mid | 75.8% ± 1.8 | 88.2% ± 3.5 | 63.7% ± 2.3 | 247 / 280 | 15.2% ± 1.1 | 8.3% ± 0.9 | 125 | 0 | 1.07 / 24.5 |
| pez.mini.VertiLeach 0.4.0 | mid | 96.8% ± 2.0 | 99.3% ± 1.1 | 50.4% ± 17.2 | 278 / 280 | 0.8% ± 0.3 | 0.4% ± 0.1 | 33 | 0 | 0.50 / 14.9 |
| rampancy.Durandal 2.2d | mid | 70.5% ± 1.8 | 83.2% ± 4.3 | 58.8% ± 2.4 | 233 / 280 | 17.2% ± 1.0 | 8.3% ± 0.5 | 77 | 0 | 0.96 / 16.1 |
| ry.VirtualGunExperiment 1.2.0 | mid | 94.2% ± 2.8 | 98.9% ± 1.8 | 63.3% ± 6.8 | 277 / 280 | 6.6% ± 1.4 | 0.9% ± 0.3 | 83 | 0 | 0.56 / 215.9 |
| sheldor.micro.EpeeistDC 3.0 | mid | 69.9% ± 3.4 | 87.1% ± 4.6 | 53.2% ± 2.7 | 244 / 280 | 12.3% ± 0.7 | 7.6% ± 0.5 | 113 | 0 | 1.34 / 219.7 |
| sheldor.micro.PointInLineRRAL 1.0 | mid | 80.4% ± 2.3 | 96.4% ± 2.8 | 62.7% ± 2.9 | 270 / 280 | 12.8% ± 0.7 | 5.6% ± 0.5 | 124 | 0 | 1.00 / 26.8 |
| sheldor.nano.FoilistNano 3.2 | mid | 72.1% ± 4.2 | 84.6% ± 5.3 | 57.3% ± 2.9 | 237 / 280 | 20.9% ± 3.2 | 7.2% ± 1.3 | 74 | 0 | 0.89 / 29.8 |
| slugzilla.ButtHead 2.0 | mid | 68.9% ± 2.6 | 95.4% ± 4.0 | 59.8% ± 0.9 | 267 / 280 | 72.0% ± 2.7 | 54.7% ± 2.9 | 88 | 0 | 0.56 / 73.7 |
| slugzilla.RandomGF 1.0 | mid | 90.5% ± 4.2 | 97.9% ± 2.8 | 46.3% ± 6.8 | 274 / 280 | 7.5% ± 2.2 | 1.2% ± 0.4 | 81 | 0 | 0.51 / 164.4 |
| sos.SOS 1.0 | mid | 88.0% ± 2.3 | 97.1% ± 1.8 | 68.7% ± 2.7 | 272 / 280 | 12.8% ± 1.9 | 3.2% ± 0.4 | 88 | 0 | 0.63 / 77.4 |
| stelo.Chord 1.0 | mid | 92.5% ± 2.9 | 98.6% ± 1.8 | 64.2% ± 6.3 | 276 / 280 | 9.2% ± 2.1 | 1.3% ± 0.5 | 79 | 0 | 0.49 / 29.4 |
| stelo.PastFuture 2.3.2 | mid | 70.3% ± 7.2 | 83.9% ± 8.2 | 53.4% ± 4.9 | 235 / 280 | 15.1% ± 2.3 | 5.9% ± 0.8 | 94 | 0 | 1.13 / 68.2 |
| synnalagma.NeuralPremier 0.51 | mid | 77.7% ± 3.5 | 86.8% ± 5.3 | 69.3% ± 2.2 | 243 / 280 | 19.5% ± 1.1 | 7.5% ± 0.6 | 87 | 0 | 0.87 / 33.8 |
| xander.cat.SamAxe 1.1 | mid | 80.8% ± 2.2 | 91.8% ± 4.3 | 71.0% ± 0.9 | 257 / 280 | 21.6% ± 0.9 | 8.6% ± 0.8 | 82 | 0 | 0.93 / 10.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 8 | 1937 | 21.0% | 69.4% | 0.0% | 9.6% | 963 |
| alk.lap.LoudAndProud 2.23 | 8 | 1118 | 13.4% | 80.4% | 0.0% | 6.2% | 586 |
| axeBots.Musashi 2.18 | 8 | 1505 | 19.5% | 71.8% | 0.0% | 8.6% | 1096 |
| axeBots.Okami 1.04 | 8 | 1632 | 21.8% | 68.5% | 0.0% | 9.7% | 1027 |
| cjm.Charo 1.1 | 8 | 84 | 7.4% | 90.2% | 0.0% | 2.4% | 716 |
| cx.micro.Spark 0.6 | 8 | 801 | 17.2% | 76.2% | 0.0% | 6.6% | 820 |
| cx.mini.Cigaret 1.31 | 8 | 1214 | 22.7% | 67.1% | 0.1% | 10.1% | 738 |
| davidalves.PhoenixOS 1.1 | 8 | 1712 | 24.1% | 66.4% | 0.0% | 9.5% | 1035 |
| deo.CloudBot 1.3 | 8 | 757 | 17.3% | 74.2% | 1.5% | 6.9% | 858 |
| dft.Immortal 1.40 | 8 | 1467 | 15.3% | 77.9% | 0.0% | 6.8% | 877 |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 233 | 8.1% | 88.2% | 0.1% | 3.6% | 933 |
| dragonbyte.Neutrino 4 | 8 | 937 | 80.0% | 3.9% | 0.0% | 16.1% | 1896 |
| drm.Magazine 0.39 | 8 | 851 | 21.3% | 70.0% | 0.0% | 8.7% | 709 |
| dz.GalbaMini 0.121 | 8 | 1566 | 18.4% | 73.6% | 0.0% | 8.1% | 774 |
| eem.zapper v6.03 | 8 | 1629 | 19.6% | 72.0% | 0.0% | 8.4% | 1036 |
| fromHell.C22H30N2O2S 2.2 | 8 | 600 | 15.6% | 78.0% | 0.0% | 6.3% | 769 |
| hlavko.micro.Flex 1.5 | 8 | 1063 | 17.6% | 74.4% | 0.0% | 8.0% | 695 |
| jk.micro.Cotillion 0.8 | 8 | 805 | 18.6% | 73.3% | 0.0% | 8.1% | 976 |
| jk.sheldor.nano.Yatagan 1.2.3 | 8 | 1550 | 19.4% | 72.7% | 0.0% | 7.9% | 580 |
| lazarecki.mega.PinkerStinker 0.7 | 8 | 1502 | 22.9% | 67.4% | 0.0% | 9.7% | 898 |
| lj.Dapps 0.2 | 8 | 1076 | 11.0% | 84.1% | 0.0% | 4.9% | 781 |
| nat.Samekh 0.4 | 8 | 1605 | 19.9% | 71.6% | 0.0% | 8.5% | 894 |
| nz.jdc.nano.NeophytePRAL 1.4 | 8 | 910 | 6.2% | 91.3% | 0.0% | 2.5% | 564 |
| origin.SleepSiphon 1.7b | 8 | 217 | 14.4% | 80.4% | 0.0% | 5.2% | 1607 |
| pe.SandboxLump 1.52 | 8 | 1173 | 21.8% | 69.8% | 0.0% | 8.4% | 637 |
| penguin.Ivy 1.1r | 8 | 1035 | 17.5% | 74.8% | 0.0% | 7.7% | 902 |
| penguin.MrFreeze 1.0a | 8 | 1182 | 17.5% | 74.9% | 0.0% | 7.7% | 840 |
| pez.mini.VertiLeach 0.4.0 | 8 | 70 | 17.9% | 73.3% | 0.0% | 8.8% | 164 |
| rampancy.Durandal 2.2d | 8 | 1500 | 19.6% | 72.4% | 0.0% | 8.0% | 667 |
| ry.VirtualGunExperiment 1.2.0 | 8 | 147 | 12.8% | 82.6% | 0.0% | 4.6% | 1107 |
| sheldor.micro.EpeeistDC 3.0 | 8 | 1429 | 15.7% | 77.3% | 0.0% | 6.9% | 997 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 884 | 7.1% | 90.1% | 0.0% | 2.8% | 986 |
| sheldor.nano.FoilistNano 3.2 | 8 | 1221 | 22.0% | 69.8% | 0.1% | 8.1% | 717 |
| slugzilla.ButtHead 2.0 | 8 | 3004 | 2.7% | 83.3% | 12.2% | 1.9% | 321 |
| slugzilla.RandomGF 1.0 | 8 | 244 | 15.3% | 78.8% | 0.0% | 5.9% | 905 |
| sos.SOS 1.0 | 8 | 388 | 12.9% | 74.7% | 6.3% | 6.1% | 969 |
| stelo.Chord 1.0 | 8 | 200 | 12.5% | 83.1% | 0.0% | 4.4% | 907 |
| stelo.PastFuture 2.3.2 | 8 | 1246 | 22.6% | 68.5% | 0.3% | 8.6% | 1467 |
| synnalagma.NeuralPremier 0.51 | 8 | 1170 | 19.8% | 71.8% | 0.0% | 8.4% | 670 |
| xander.cat.SamAxe 1.1 | 8 | 1025 | 14.0% | 80.2% | 0.0% | 5.7% | 614 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 8 | 7 | 596 | 0 | 0.48 | 0 | 0 | 0 |
| alk.lap.LoudAndProud 2.23 | 8 | 6 | 596 | 0 | 0.33 | 0 | 0 | 0 |
| axeBots.Musashi 2.18 | 8 | 8 | 0 | 0 | 0.43 | 0 | 0 | 0 |
| axeBots.Okami 1.04 | 8 | 6 | 596 | 0 | 0.84 | 0 | 0 | 0 |
| cjm.Charo 1.1 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| cx.micro.Spark 0.6 | 8 | 7 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| cx.mini.Cigaret 1.31 | 8 | 7 | 0 | 0 | 0.30 | 1 | 1 | 0 |
| davidalves.PhoenixOS 1.1 | 8 | 7 | 298 | 0 | 0.42 | 0 | 0 | 0 |
| deo.CloudBot 1.3 | 8 | 6 | 597 | 0 | 0.40 | 0 | 0 | 0 |
| dft.Immortal 1.40 | 8 | 6 | 596 | 0 | 0.40 | 0 | 0 | 0 |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| dragonbyte.Neutrino 4 | 8 | 3 | 1192 | 0 | 0.27 | 3 | 3 | 0 |
| drm.Magazine 0.39 | 8 | 7 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| dz.GalbaMini 0.121 | 8 | 6 | 408 | 0 | 0.40 | 0 | 0 | 0 |
| eem.zapper v6.03 | 8 | 5 | 0 | 0 | 0.40 | 3 | 3 | 0 |
| fromHell.C22H30N2O2S 2.2 | 8 | 6 | 430 | 0 | 0.27 | 1 | 1 | 0 |
| hlavko.micro.Flex 1.5 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| jk.micro.Cotillion 0.8 | 8 | 6 | 0 | 0 | 0.27 | 2 | 2 | 0 |
| jk.sheldor.nano.Yatagan 1.2.3 | 8 | 7 | 298 | 0 | 0.30 | 0 | 0 | 0 |
| lazarecki.mega.PinkerStinker 0.7 | 8 | 6 | 0 | 0 | 0.47 | 2 | 2 | 0 |
| lj.Dapps 0.2 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| nat.Samekh 0.4 | 8 | 7 | 0 | 0 | 0.40 | 1 | 1 | 0 |
| nz.jdc.nano.NeophytePRAL 1.4 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| origin.SleepSiphon 1.7b | 8 | 7 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| pe.SandboxLump 1.52 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| penguin.Ivy 1.1r | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| penguin.MrFreeze 1.0a | 8 | 7 | 0 | 0 | 0.45 | 1 | 0 | 0 |
| pez.mini.VertiLeach 0.4.0 | 8 | 8 | 0 | 0 | 0.12 | 0 | 0 | 8 |
| rampancy.Durandal 2.2d | 8 | 6 | 0 | 0 | 0.28 | 2 | 2 | 0 |
| ry.VirtualGunExperiment 1.2.0 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| sheldor.micro.EpeeistDC 3.0 | 8 | 6 | 298 | 0 | 0.40 | 2 | 2 | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 7 | 298 | 0 | 0.44 | 0 | 0 | 0 |
| sheldor.nano.FoilistNano 3.2 | 8 | 6 | 0 | 0 | 0.26 | 2 | 2 | 0 |
| slugzilla.ButtHead 2.0 | 8 | 6 | 492 | 0 | 0.31 | 0 | 0 | 0 |
| slugzilla.RandomGF 1.0 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| sos.SOS 1.0 | 8 | 6 | 436 | 0 | 0.31 | 0 | 0 | 0 |
| stelo.Chord 1.0 | 8 | 7 | 298 | 0 | 0.28 | 0 | 0 | 0 |
| stelo.PastFuture 2.3.2 | 8 | 6 | 0 | 0 | 0.34 | 2 | 2 | 0 |
| synnalagma.NeuralPremier 0.51 | 8 | 7 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| xander.cat.SamAxe 1.1 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |

272 of 320 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 16643 | 76 | 16597 | 16593 (99.7%) | 50 (0.3%) | 4 (0.0%) | 1054 | 258 | 72 |
| alk.lap.LoudAndProud 2.23 | 7200 | 15 | 7165 | 7162 (99.5%) | 38 (0.5%) | 3 (0.0%) | 251 | 92 | 33 |
| axeBots.Musashi 2.18 | 13683 | 10 | 14826 | 13683 (100.0%) | 0 (0.0%) | 1143 (7.7%) | 1747 | 191 | 59 |
| axeBots.Okami 1.04 | 12298 | 10 | 13728 | 12254 (99.6%) | 44 (0.4%) | 1474 (10.7%) | 1462 | 167 | 215 |
| cjm.Charo 1.1 | 8374 | 2 | 8374 | 8374 (100.0%) | 0 (0.0%) | 0 (0.0%) | 47 | 17 | 32 |
| cx.micro.Spark 0.6 | 11312 | 7 | 11312 | 11312 (100.0%) | 0 (0.0%) | 0 (0.0%) | 316 | 68 | 32 |
| cx.mini.Cigaret 1.31 | 8221 | 6 | 8223 | 8220 (100.0%) | 1 (0.0%) | 3 (0.0%) | 435 | 84 | 41 |
| davidalves.PhoenixOS 1.1 | 13023 | 8 | 13950 | 13000 (99.8%) | 23 (0.2%) | 950 (6.8%) | 1829 | 168 | 54 |
| deo.CloudBot 1.3 | 13256 | 9 | 13214 | 13212 (99.7%) | 44 (0.3%) | 2 (0.0%) | 223 | 74 | 77 |
| dft.Immortal 1.40 | 12331 | 8 | 12288 | 12280 (99.6%) | 51 (0.4%) | 8 (0.1%) | 765 | 110 | 209 |
| dmh.robocode.robot.BlackDeath 9.2 | 14400 | 4 | 14406 | 14400 (100.0%) | 0 (0.0%) | 6 (0.0%) | 95 | 41 | 31 |
| dragonbyte.Neutrino 4 | 25109 | 0 | 37392 | 25001 (99.6%) | 108 (0.4%) | 12391 (33.1%) | 3480 | 199 | 37 |
| drm.Magazine 0.39 | 8927 | 32 | 8926 | 8926 (100.0%) | 1 (0.0%) | 0 (0.0%) | 213 | 41 | 33 |
| dz.GalbaMini 0.121 | 11564 | 22 | 11537 | 11536 (99.8%) | 28 (0.2%) | 1 (0.0%) | 580 | 153 | 56 |
| eem.zapper v6.03 | 18214 | 11 | 18214 | 18212 (100.0%) | 2 (0.0%) | 2 (0.0%) | 1128 | 181 | 75 |
| fromHell.C22H30N2O2S 2.2 | 10627 | 11 | 10616 | 10598 (99.7%) | 29 (0.3%) | 18 (0.2%) | 245 | 68 | 66 |
| hlavko.micro.Flex 1.5 | 9948 | 145 | 9956 | 9941 (99.9%) | 7 (0.1%) | 15 (0.2%) | 997 | 112 | 26 |
| jk.micro.Cotillion 0.8 | 13190 | 3 | 13253 | 13190 (100.0%) | 0 (0.0%) | 63 (0.5%) | 524 | 64 | 39 |
| jk.sheldor.nano.Yatagan 1.2.3 | 7899 | 24 | 7879 | 7870 (99.6%) | 29 (0.4%) | 9 (0.1%) | 640 | 194 | 29 |
| lazarecki.mega.PinkerStinker 0.7 | 11781 | 11 | 11797 | 11779 (100.0%) | 2 (0.0%) | 18 (0.2%) | 972 | 143 | 95 |
| lj.Dapps 0.2 | 12688 | 54 | 12688 | 12687 (100.0%) | 1 (0.0%) | 1 (0.0%) | 660 | 220 | 34 |
| nat.Samekh 0.4 | 13523 | 102 | 13522 | 13521 (100.0%) | 2 (0.0%) | 1 (0.0%) | 702 | 149 | 57 |
| nz.jdc.nano.NeophytePRAL 1.4 | 8079 | 25 | 8097 | 8070 (99.9%) | 9 (0.1%) | 27 (0.3%) | 636 | 196 | 41 |
| origin.SleepSiphon 1.7b | 31942 | 4 | 32517 | 31941 (100.0%) | 1 (0.0%) | 576 (1.8%) | 128 | 37 | 33 |
| pe.SandboxLump 1.52 | 7885 | 12 | 7894 | 7885 (100.0%) | 0 (0.0%) | 9 (0.1%) | 117 | 55 | 53 |
| penguin.Ivy 1.1r | 8006 | 7 | 8011 | 8005 (100.0%) | 1 (0.0%) | 6 (0.1%) | 1050 | 92 | 41 |
| penguin.MrFreeze 1.0a | 13264 | 17 | 13270 | 13261 (100.0%) | 3 (0.0%) | 9 (0.1%) | 644 | 179 | 79 |
| pez.mini.VertiLeach 0.4.0 | 218 | 2 | 218 | 218 (100.0%) | 0 (0.0%) | 0 (0.0%) | 21 | 5 | 14 |
| rampancy.Durandal 2.2d | 8747 | 23 | 8747 | 8745 (100.0%) | 2 (0.0%) | 2 (0.0%) | 560 | 146 | 33 |
| ry.VirtualGunExperiment 1.2.0 | 17875 | 1 | 17874 | 17874 (100.0%) | 1 (0.0%) | 0 (0.0%) | 126 | 29 | 27 |
| sheldor.micro.EpeeistDC 3.0 | 17716 | 79 | 17716 | 17693 (99.9%) | 23 (0.1%) | 23 (0.1%) | 951 | 171 | 86 |
| sheldor.micro.PointInLineRRAL 1.0 | 16550 | 8 | 16526 | 16523 (99.8%) | 27 (0.2%) | 3 (0.0%) | 925 | 144 | 114 |
| sheldor.nano.FoilistNano 3.2 | 10685 | 32 | 10688 | 10656 (99.7%) | 29 (0.3%) | 32 (0.3%) | 743 | 111 | 27 |
| slugzilla.ButtHead 2.0 | 2762 | 13 | 2727 | 2725 (98.7%) | 37 (1.3%) | 2 (0.1%) | 2096 | 298 | 23 |
| slugzilla.RandomGF 1.0 | 13797 | 1 | 13797 | 13797 (100.0%) | 0 (0.0%) | 0 (0.0%) | 34 | 19 | 23 |
| sos.SOS 1.0 | 15881 | 15 | 15849 | 15847 (99.8%) | 34 (0.2%) | 2 (0.0%) | 279 | 71 | 43 |
| stelo.Chord 1.0 | 13952 | 8 | 13932 | 13932 (99.9%) | 20 (0.1%) | 0 (0.0%) | 61 | 32 | 39 |
| stelo.PastFuture 2.3.2 | 29720 | 16 | 38014 | 29717 (100.0%) | 3 (0.0%) | 8297 (21.8%) | 628 | 686 | 51 |
| synnalagma.NeuralPremier 0.51 | 8458 | 38 | 8458 | 8457 (100.0%) | 1 (0.0%) | 1 (0.0%) | 386 | 119 | 29 |
| xander.cat.SamAxe 1.1 | 8394 | 11 | 8394 | 8382 (99.9%) | 12 (0.1%) | 12 (0.1%) | 749 | 139 | 39 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.Glacier 0.3.2 | 17124 | 1928 (11.3%) | 15679 |
| alk.lap.LoudAndProud 2.23 | 7802 | 750 (9.6%) | 3173 |
| axeBots.Musashi 2.18 | 20263 | 1356 (6.7%) | 16021 |
| axeBots.Okami 1.04 | 18780 | 1084 (5.8%) | 11294 |
| cjm.Charo 1.1 | 2580 | 8014 (310.6%) | 98 |
| cx.micro.Spark 0.6 | 6518 | 6455 (99.0%) | 1902 |
| cx.mini.Cigaret 1.31 | 8250 | 3581 (43.4%) | 3895 |
| davidalves.PhoenixOS 1.1 | 18309 | 1548 (8.5%) | 14736 |
| deo.CloudBot 1.3 | 3720 | 10216 (274.6%) | 1666 |
| dft.Immortal 1.40 | 14996 | 1450 (9.7%) | 12832 |
| dmh.robocode.robot.BlackDeath 9.2 | 2415 | 13335 (552.2%) | 664 |
| dragonbyte.Neutrino 4 | 37264 | 1585 (4.3%) | 28124 |
| drm.Magazine 0.39 | 4083 | 6302 (154.3%) | 450 |
| dz.GalbaMini 0.121 | 12408 | 1111 (9.0%) | 10416 |
| eem.zapper v6.03 | 18922 | 1932 (10.2%) | 17842 |
| fromHell.C22H30N2O2S 2.2 | 2197 | 9187 (418.2%) | 192 |
| hlavko.micro.Flex 1.5 | 6360 | 4172 (65.6%) | 3483 |
| jk.micro.Cotillion 0.8 | 8875 | 8604 (96.9%) | 4651 |
| jk.sheldor.nano.Yatagan 1.2.3 | 7190 | 707 (9.8%) | 4897 |
| lazarecki.mega.PinkerStinker 0.7 | 14739 | 1380 (9.4%) | 10709 |
| lj.Dapps 0.2 | 11921 | 1509 (12.7%) | 9612 |
| nat.Samekh 0.4 | 15296 | 1364 (8.9%) | 9788 |
| nz.jdc.nano.NeophytePRAL 1.4 | 6701 | 675 (10.1%) | 4980 |
| origin.SleepSiphon 1.7b | 2577 | 30252 (1173.9%) | 535 |
| pe.SandboxLump 1.52 | 4878 | 4332 (88.8%) | 1953 |
| penguin.Ivy 1.1r | 14435 | 1223 (8.5%) | 4739 |
| penguin.MrFreeze 1.0a | 13131 | 1872 (14.3%) | 10474 |
| pez.mini.VertiLeach 0.4.0 | 208 | 39 (18.8%) | 24 |
| rampancy.Durandal 2.2d | 9306 | 916 (9.8%) | 4787 |
| ry.VirtualGunExperiment 1.2.0 | 2025 | 16937 (836.4%) | 382 |
| sheldor.micro.EpeeistDC 3.0 | 17917 | 1716 (9.6%) | 16067 |
| sheldor.micro.PointInLineRRAL 1.0 | 17259 | 1245 (7.2%) | 11714 |
| sheldor.nano.FoilistNano 3.2 | 4499 | 6293 (139.9%) | 2026 |
| slugzilla.ButtHead 2.0 | 2657 | 230 (8.7%) | 830 |
| slugzilla.RandomGF 1.0 | 1892 | 12989 (686.5%) | 434 |
| sos.SOS 1.0 | 3007 | 13339 (443.6%) | 1238 |
| stelo.Chord 1.0 | 1711 | 13185 (770.6%) | 276 |
| stelo.PastFuture 2.3.2 | 10170 | 19820 (194.9%) | 8067 |
| synnalagma.NeuralPremier 0.51 | 9082 | 804 (8.9%) | 6029 |
| xander.cat.SamAxe 1.1 | 7861 | 974 (12.4%) | 3047 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 650 | 423 | 650 | 813 | 37.1 / 38.4 | 637 | 2952 | 1576 |
| alk.lap.LoudAndProud 2.23 | 650 | 492 | 494 | 436 | 39.2 / 25.7 | 1741 | 5272 | 3037 |
| axeBots.Musashi 2.18 | 650 | 485 | 575 | 946 | 42.4 / 30.9 | 1463 | 1258 | 105 |
| axeBots.Okami 1.04 | 650 | 489 | 556 | 877 | 43.9 / 31.9 | 1457 | 1613 | 49 |
| cjm.Charo 1.1 | 650 | 382 | 650 | 566 | 11.3 / 2.2 | 0 | 390 | 0 |
| cx.micro.Spark 0.6 | 650 | 485 | 619 | 669 | 21.7 / 17.4 | 420 | 2553 | 31 |
| cx.mini.Cigaret 1.31 | 650 | 483 | 600 | 589 | 25.2 / 23.3 | 406 | 2842 | 53 |
| davidalves.PhoenixOS 1.1 | 650 | 454 | 444 | 885 | 33.5 / 32.5 | 1990 | 1474 | 179 |
| deo.CloudBot 1.3 | 650 | 326 | 619 | 708 | 17.9 / 16.0 | 456 | 1634 | 1542 |
| dft.Immortal 1.40 | 650 | 501 | 619 | 727 | 32.5 / 32.7 | 368 | 3569 | 583 |
| dmh.robocode.robot.BlackDeath 9.2 | 650 | 499 | 650 | 783 | 10.6 / 5.9 | 111 | 585 | 93 |
| dragonbyte.Neutrino 4 | 650 | 414 | 400 | 1746 | 78.3 / 1.1 | 4013 | 2 | 21 |
| drm.Magazine 0.39 | 650 | 478 | 650 | 558 | 19.7 / 17.0 | 596 | 2004 | 73 |
| dz.GalbaMini 0.121 | 650 | 431 | 619 | 624 | 40.0 / 32.9 | 1166 | 4292 | 0 |
| eem.zapper v6.03 | 650 | 493 | 650 | 887 | 34.3 / 33.5 | 338 | 3954 | 27 |
| fromHell.C22H30N2O2S 2.2 | 650 | 286 | 650 | 619 | 10.4 / 13.4 | 222 | 777 | 515 |
| hlavko.micro.Flex 1.5 | 650 | 307 | 522 | 545 | 34.3 / 22.6 | 1406 | 2707 | 539 |
| jk.micro.Cotillion 0.8 | 650 | 509 | 647 | 828 | 14.9 / 16.9 | 80 | 2048 | 9 |
| jk.sheldor.nano.Yatagan 1.2.3 | 650 | 318 | 488 | 430 | 53.6 / 32.2 | 2614 | 3661 | 2083 |
| lazarecki.mega.PinkerStinker 0.7 | 650 | 410 | 578 | 747 | 42.5 / 28.9 | 1380 | 2801 | 35 |
| lj.Dapps 0.2 | 650 | 417 | 534 | 631 | 48.7 / 25.8 | 1465 | 4895 | 1024 |
| nat.Samekh 0.4 | 650 | 486 | 650 | 743 | 30.9 / 32.9 | 157 | 5518 | 1811 |
| nz.jdc.nano.NeophytePRAL 1.4 | 650 | 338 | 506 | 414 | 70.0 / 23.7 | 4464 | 3897 | 1140 |
| origin.SleepSiphon 1.7b | 650 | 425 | 631 | 1458 | 9.1 / 5.0 | 59 | 497 | 3 |
| pe.SandboxLump 1.52 | 650 | 290 | 541 | 487 | 35.9 / 23.4 | 1627 | 2526 | 0 |
| penguin.Ivy 1.1r | 650 | 500 | 400 | 752 | 46.6 / 22.1 | 1715 | 1470 | 121 |
| penguin.MrFreeze 1.0a | 650 | 519 | 588 | 690 | 44.3 / 25.3 | 1042 | 3813 | 88 |
| pez.mini.VertiLeach 0.4.0 | 650 | 326 | 650 | 14 | 1.4 / 1.5 | 6 | 56 | 19 |
| rampancy.Durandal 2.2d | 650 | 394 | 525 | 517 | 44.3 / 31.0 | 2483 | 2885 | 1933 |
| ry.VirtualGunExperiment 1.2.0 | 650 | 486 | 650 | 957 | 5.8 / 3.5 | 5 | 453 | 448 |
| sheldor.micro.EpeeistDC 3.0 | 650 | 543 | 647 | 849 | 36.0 / 31.6 | 319 | 6038 | 2145 |
| sheldor.micro.PointInLineRRAL 1.0 | 650 | 529 | 541 | 836 | 38.3 / 22.8 | 402 | 4658 | 163 |
| sheldor.nano.FoilistNano 3.2 | 650 | 290 | 625 | 567 | 32.6 / 24.4 | 1793 | 2042 | 731 |
| slugzilla.ButtHead 2.0 | 650 | 153 | 650 | 171 | 106.7 / 71.5 | 2166 | 2044 | 99 |
| slugzilla.RandomGF 1.0 | 650 | 492 | 650 | 755 | 4.8 / 5.5 | 2 | 493 | 453 |
| sos.SOS 1.0 | 650 | 308 | 650 | 819 | 18.1 / 8.3 | 580 | 1322 | 179 |
| stelo.Chord 1.0 | 650 | 437 | 619 | 757 | 8.5 / 4.8 | 69 | 470 | 64 |
| stelo.PastFuture 2.3.2 | 650 | 396 | 638 | 1321 | 27.7 / 24.4 | 383 | 2969 | 279 |
| synnalagma.NeuralPremier 0.51 | 650 | 379 | 444 | 520 | 54.0 / 24.0 | 2980 | 3437 | 261 |
| xander.cat.SamAxe 1.1 | 650 | 432 | 400 | 464 | 57.6 / 23.5 | 4089 | 2672 | 113 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 9.8% | 135 | 11190 | 3 | 57.9 | 1662 / 1928 (86%) | 0 | 0 |
| alk.lap.LoudAndProud 2.23 | 6.3% | 93 | 44 | 3 | 23.9 | 484 / 750 (65%) | 0 | 0 |
| axeBots.Musashi 2.18 | 7.7% | 121 | 555 | 3 | 51.9 | 1263 / 1356 (93%) | 0 | 0 |
| axeBots.Okami 1.04 | 8.5% | 236 | 184 | 3 | 48.3 | 1042 / 1084 (96%) | 0 | 0 |
| cjm.Charo 1.1 | 0.5% | 88 | 31 | 3 | 1.2 | 42 / 8014 (1%) | 0 | 0 |
| cx.micro.Spark 0.6 | 4.2% | 87 | 48 | 3 | 16.3 | 354 / 6455 (5%) | 0 | 0 |
| cx.mini.Cigaret 1.31 | 4.6% | 85 | 112 | 3 | 17.4 | 490 / 3581 (14%) | 0 | 0 |
| davidalves.PhoenixOS 1.1 | 7.4% | 118 | 61 | 3 | 47.4 | 1109 / 1548 (72%) | 0 | 0 |
| deo.CloudBot 1.3 | 6.9% | 113 | 44 | 3 | 10.9 | 323 / 10216 (3%) | 0 | 0 |
| dft.Immortal 1.40 | 9.0% | 111 | 72 | 3 | 42.8 | 1308 / 1450 (90%) | 0 | 0 |
| dmh.robocode.robot.BlackDeath 9.2 | 1.4% | 87 | 55 | 3 | 3.9 | 112 / 13335 (1%) | 0 | 0 |
| dragonbyte.Neutrino 4 | 2.6% | 75 | 52 | 3 | 130.2 | 1538 / 1585 (97%) | 0 | 0 |
| drm.Magazine 0.39 | 3.8% | 86 | 46 | 3 | 9.2 | 162 / 6302 (3%) | 0 | 0 |
| dz.GalbaMini 0.121 | 9.1% | 113 | 272 | 3 | 40.0 | 1055 / 1111 (95%) | 0 | 0 |
| eem.zapper v6.03 | 7.9% | 111 | 3156 | 3 | 63.8 | 1918 / 1932 (99%) | 0 | 0 |
| fromHell.C22H30N2O2S 2.2 | 5.0% | 76 | 31 | 3 | 4.2 | 95 / 9187 (1%) | 0 | 0 |
| hlavko.micro.Flex 1.5 | 6.6% | 81 | 90 | 3 | 20.5 | 537 / 4172 (13%) | 0 | 0 |
| jk.micro.Cotillion 0.8 | 3.5% | 76 | 991 | 3 | 17.4 | 451 / 8604 (5%) | 0 | 0 |
| jk.sheldor.nano.Yatagan 1.2.3 | 11.3% | 84 | 148 | 3 | 25.9 | 646 / 707 (91%) | 0 | 0 |
| lazarecki.mega.PinkerStinker 0.7 | 7.4% | 131 | 55 | 3 | 39.2 | 953 / 1380 (69%) | 0 | 0 |
| lj.Dapps 0.2 | 7.6% | 91 | 416 | 2 | 42.6 | 1125 / 1509 (75%) | 0 | 0 |
| nat.Samekh 0.4 | 7.5% | 113 | 754 | 3 | 46.6 | 1172 / 1364 (86%) | 0 | 0 |
| nz.jdc.nano.NeophytePRAL 1.4 | 12.4% | 94 | 50 | 3 | 27.1 | 630 / 675 (93%) | 0 | 0 |
| origin.SleepSiphon 1.7b | 1.2% | 87 | 150 | 3 | 4.9 | 97 / 30252 (0%) | 0 | 0 |
| pe.SandboxLump 1.52 | 5.7% | 105 | 213 | 3 | 13.1 | 364 / 4332 (8%) | 0 | 0 |
| penguin.Ivy 1.1r | 5.8% | 109 | 305 | 3 | 24.9 | 556 / 1223 (45%) | 0 | 0 |
| penguin.MrFreeze 1.0a | 8.3% | 125 | 99 | 3 | 44.0 | 1278 / 1872 (68%) | 0 | 0 |
| pez.mini.VertiLeach 0.4.0 | 0.4% | 33 | 16 | 3 | 0.6 | 29 / 39 (74%) | 0 | 0 |
| rampancy.Durandal 2.2d | 8.3% | 77 | 3997 | 3 | 29.2 | 638 / 916 (70%) | 0 | 0 |
| ry.VirtualGunExperiment 1.2.0 | 0.9% | 83 | 46 | 3 | 3.3 | 90 / 16937 (1%) | 0 | 0 |
| sheldor.micro.EpeeistDC 3.0 | 7.6% | 113 | 9353 | 3 | 61.7 | 1641 / 1716 (96%) | 0 | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 5.6% | 124 | 716 | 3 | 56.6 | 1163 / 1245 (93%) | 0 | 0 |
| sheldor.nano.FoilistNano 3.2 | 7.2% | 74 | 38 | 3 | 15.3 | 376 / 6293 (6%) | 0 | 0 |
| slugzilla.ButtHead 2.0 | 54.7% | 88 | 24 | 3 | 9.2 | 199 / 230 (87%) | 0 | 0 |
| slugzilla.RandomGF 1.0 | 1.2% | 81 | 43 | 3 | 2.7 | 77 / 12989 (1%) | 0 | 0 |
| sos.SOS 1.0 | 3.2% | 88 | 57 | 3 | 9.1 | 225 / 13339 (2%) | 0 | 0 |
| stelo.Chord 1.0 | 1.3% | 79 | 36 | 3 | 2.5 | 72 / 13185 (1%) | 0 | 0 |
| stelo.PastFuture 2.3.2 | 5.9% | 94 | 969 | 3 | 39.3 | 941 / 19820 (5%) | 0 | 0 |
| synnalagma.NeuralPremier 0.51 | 7.5% | 87 | 50 | 3 | 27.6 | 698 / 804 (87%) | 0 | 0 |
| xander.cat.SamAxe 1.1 | 8.6% | 82 | 74 | 3 | 27.9 | 593 / 974 (61%) | 0 | 0 |

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
| ags.Glacier 0.3.2 | ags.Glacier | 1 | 35 | 280 | 10.2% | 8.2% ± 1.3 | 12.2% | 24.4% / 22.3% | 5.7% | 0 / 0 | T3/M1 | 69% |
| alk.lap.LoudAndProud 2.23 | alk.lap.LoudAndProud | 1 | 35 | 314 | 7.1% | 8.3% ± 2.0 | 14.9% | 36.5% / 33.6% | 31.7% | 0 / 0 | T3/M? | 76% |
| axeBots.Musashi 2.18 | axeBots.Musashi | 1 | 35 | 294 | 7.2% | 6.6% ± 1.2 | 13.3% | 24.2% / 19.9% | 4.0% | 0 / 0 | T2/M1 | 71% |
| axeBots.Okami 1.04 | axeBots.Okami | 1 | 35 | 286 | 9.3% | 8.4% ± 1.4 | 13.8% | 28.3% / 27.1% | 4.6% | 0 / 0 | T3/M0 | 62% |
| cjm.Charo 1.1 | cjm.Charo | 1 | 35 | 268 | 0.9% | 8.1% ± 6.1 | 10.3% | 25.7% / 22.5% | 3.3% | 0 / 0 | T?/M? | 92% |
| cx.micro.Spark 0.6 | cx.micro.Spark | 1 | 35 | 288 | 2.4% | 12.8% ± 3.9 | 11.3% | 25.7% / 23.4% | 8.7% | 0 / 0 | T?/M? | 86% |
| cx.mini.Cigaret 1.31 | cx.mini.Cigaret | 1 | 35 | 294 | 5.2% | 10.1% ± 2.6 | 12.6% | 26.1% / 24.3% | 3.5% | 0 / 0 | T3/M0 | 72% |
| davidalves.PhoenixOS 1.1 | davidalves.PhoenixOS | 1 | 35 | 312 | 8.1% | 7.5% ± 1.3 | 13.7% | 23.4% / 23.9% | 3.9% | 0 / 0 | T3/M1 | 58% |
| deo.CloudBot 1.3 | deo.CloudBot | 1 | 35 | 280 | 4.5% | 7.9% ± 2.4 | 11.6% | 23.0% / 29.9% | 10.2% | 0 / 0 | T3/M? | 72% |
| dft.Immortal 1.40 | dft.Immortal | 1 | 35 | 282 | 8.7% | 8.5% ± 1.5 | 12.0% | 23.7% / 22.9% | 6.8% | 0 / 0 | T3/M1 | 64% |
| dmh.robocode.robot.BlackDeath 9.2 | dmh.robocode.robot.BlackDeath | 1 | 35 | 348 | 1.1% | 9.1% ± 5.0 | 11.8% | 36.2% / 25.3% | 2.5% | 0 / 0 | T?/M? | 94% |
| dragonbyte.Neutrino 4 | dragonbyte.Neutrino | 1 | 35 | 304 | 1.8% | 1.1% ± 0.4 | 14.7% | 23.2% / 21.5% | 9.7% | 0 / 0 | T0/M1 | 78% |
| drm.Magazine 0.39 | drm.Magazine | 1 | 35 | 282 | 3.1% | 13.7% ± 4.7 | 13.3% | 39.1% / 37.4% | 35.7% | 0 / 0 | T?/M? | 76% |
| dz.GalbaMini 0.121 | dz.GalbaMini | 1 | 35 | 284 | 9.2% | 7.5% ± 1.4 | 12.3% | 23.6% / 22.1% | 6.7% | 0 / 0 | T3/M1 | 68% |
| eem.zapper v6.03 | eem.zapper | 1 | 35 | 276 | 8.3% | 7.4% ± 1.1 | 11.5% | 23.7% / 24.0% | 0.9% | 0 / 0 | T3/M1 | 77% |
| fromHell.C22H30N2O2S 2.2 | fromHell.C22H30N2O2S | 1 | 35 | 312 | 2.5% | 15.1% ± 6.9 | 12.3% | 21.1% / 21.1% | 18.8% | 0 / 0 | T?/M? | 81% |
| hlavko.micro.Flex 1.5 | hlavko.micro.Flex | 1 | 35 | 300 | 7.2% | 7.5% ± 2.1 | 17.0% | 23.0% / 20.9% | 6.7% | 0 / 0 | T3/M? | 81% |
| jk.micro.Cotillion 0.8 | jk.micro.Cotillion | 1 | 35 | 304 | 8.1% | 8.3% ± 1.4 | 10.9% | 23.8% / 22.4% | 4.1% | 0 / 0 | T3/M1 | 63% |
| jk.sheldor.nano.Yatagan 1.2.3 | jk.sheldor.nano.Yatagan | 1 | 35 | 328 | 12.9% | 8.5% ± 1.9 | 19.6% | 24.1% / 24.9% | 5.5% | 0 / 0 | T3/M? | 73% |
| lazarecki.mega.PinkerStinker 0.7 | lazarecki.mega.PinkerStinker | 1 | 35 | 344 | 7.9% | 6.8% ± 1.4 | 13.0% | 23.6% / 22.4% | 1.4% | 0 / 0 | T2/M1 | 68% |
| lj.Dapps 0.2 | lj.Dapps | 1 | 35 | 264 | 8.7% | 7.1% ± 1.3 | 12.8% | 24.3% / 21.8% | 4.6% | 0 / 0 | T3/M1 | 73% |
| nat.Samekh 0.4 | nat.Samekh | 1 | 35 | 272 | 8.7% | 8.0% ± 1.4 | 10.6% | 24.2% / 24.3% | 4.5% | 0 / 0 | T3/M1 | 64% |
| nz.jdc.nano.NeophytePRAL 1.4 | nz.jdc.nano.NeophytePRAL | 1 | 35 | 328 | 12.4% | 7.5% ± 1.8 | 19.4% | 26.1% / 24.6% | 15.5% | 0 / 0 | T3/M? | 85% |
| origin.SleepSiphon 1.7b | origin.SleepSiphon | 1 | 35 | 306 | 0.5% | 5.8% ± 3.4 | 8.0% | 30.8% / 30.5% | 3.6% | 0 / 0 | T?/M? | 94% |
| pe.SandboxLump 1.52 | pe.SandboxLump | 1 | 35 | 290 | 7.1% | 9.3% ± 2.7 | 16.1% | 23.6% / 20.9% | 9.7% | 0 / 0 | T3/M? | 73% |
| penguin.Ivy 1.1r | penguin.Ivy | 1 | 35 | 278 | 6.5% | 7.9% ± 1.8 | 14.0% | 34.6% / 32.0% | 13.8% | 0 / 0 | T3/M0 | 79% |
| penguin.MrFreeze 1.0a | penguin.MrFreeze | 1 | 35 | 298 | 9.8% | 8.3% ± 1.5 | 14.7% | 26.5% / 23.9% | 9.0% | 0 / 0 | T3/M0 | 75% |
| pez.mini.VertiLeach 0.4.0 | pez.mini.VertiLeach | 1 | 35 | 312 | 3.8% | 3.8% ± 12.0 | 16.7% | 19.9% / 21.1% | 3.5% | 0 / 0 | T?/M? | 99% |
| rampancy.Durandal 2.2d | rampancy.Durandal | 1 | 35 | 302 | 9.2% | 6.8% ± 1.7 | 15.5% | 23.7% / 22.4% | 4.7% | 0 / 0 | T2/M1 | 71% |
| ry.VirtualGunExperiment 1.2.0 | ry.VirtualGunExperiment | 1 | 35 | 328 | 1.3% | 12.2% ± 5.5 | 10.2% | 25.0% / 27.7% | 7.0% | 0 / 0 | T?/M? | 88% |
| sheldor.micro.EpeeistDC 3.0 | sheldor.micro.EpeeistDC | 1 | 35 | 324 | 8.5% | 8.8% ± 1.3 | 12.1% | 25.9% / 23.6% | 5.1% | 0 / 0 | T3/M0 | 69% |
| sheldor.micro.PointInLineRRAL 1.0 | sheldor.micro.PointInLineRRAL | 1 | 35 | 348 | 5.5% | 4.7% ± 1.0 | 11.1% | 24.1% / 22.1% | 4.0% | 0 / 0 | T2/M1 | 78% |
| sheldor.nano.FoilistNano 3.2 | sheldor.nano.FoilistNano | 1 | 35 | 328 | 8.4% | 10.9% ± 2.6 | 15.9% | 24.8% / 22.3% | 7.8% | 0 / 0 | T3/M? | 66% |
| slugzilla.ButtHead 2.0 | slugzilla.ButtHead | 1 | 35 | 304 | 58.6% | 12.8% ± 3.8 | 46.5% | 9.7% / 9.2% | 4.4% | 0 / 0 | T?/M? | 68% |
| slugzilla.RandomGF 1.0 | slugzilla.RandomGF | 1 | 35 | 304 | 2.2% | 13.9% ± 5.2 | 11.9% | 27.9% / 24.5% | 8.9% | 0 / 0 | T?/M? | 80% |
| sos.SOS 1.0 | sos.SOS | 1 | 35 | 260 | 3.2% | 7.5% ± 2.7 | 13.3% | 20.5% / 29.1% | 9.5% | 0 / 0 | T3/M? | 91% |
| stelo.Chord 1.0 | stelo.Chord | 1 | 35 | 276 | 1.6% | 12.0% ± 5.7 | 10.7% | 28.5% / 33.1% | 11.2% | 0 / 0 | T?/M? | 86% |
| stelo.PastFuture 2.3.2 | stelo.PastFuture | 1 | 35 | 300 | 6.4% | 6.4% ± 1.0 | 11.1% | 19.1% / 22.9% | 3.3% | 0 / 0 | T2/M2 | 61% |
| synnalagma.NeuralPremier 0.51 | synnalagma.NeuralPremier | 1 | 35 | 330 | 9.1% | 7.3% ± 1.7 | 16.6% | 27.4% / 25.4% | 3.9% | 0 / 0 | T3/M0 | 79% |
| xander.cat.SamAxe 1.1 | xander.cat.SamAxe | 1 | 35 | 300 | 9.5% | 7.4% ± 1.7 | 18.8% | 36.9% / 33.6% | 9.6% | 0 / 0 | T3/M? | 79% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.9sa vs hadur2.Hadur 3.9

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ags.Glacier 0.3.2 | 61.9% ± 4.2 | 65.6% ± 4.5 | -3.7 ± 6.2 |
| alk.lap.LoudAndProud 2.23 | 76.0% ± 2.6 | 81.8% ± 1.8 | -5.8 ± 3.2 |
| axeBots.Musashi 2.18 | 69.7% ± 5.1 | 76.7% ± 3.3 | -6.9 ± 7.4 |
| axeBots.Okami 1.04 | 67.9% ± 4.9 | 74.4% ± 4.3 | -6.5 ± 7.9 |
| cjm.Charo 1.1 | 96.9% ± 1.7 | 75.8% ± 3.6 | +21.0 ± 3.3 |
| cx.micro.Spark 0.6 | 78.4% ± 4.1 | 80.5% ± 3.2 | -2.1 ± 5.6 |
| cx.mini.Cigaret 1.31 | 70.0% ± 5.6 | 74.2% ± 3.4 | -4.2 ± 6.6 |
| davidalves.PhoenixOS 1.1 | 63.3% ± 3.1 | 67.8% ± 2.5 | -4.5 ± 2.1 |
| deo.CloudBot 1.3 | 78.3% ± 4.2 | 79.1% ± 2.4 | -0.8 ± 4.0 |
| dft.Immortal 1.40 | 68.2% ± 3.4 | 71.5% ± 3.4 | -3.3 ± 5.7 |
| dmh.robocode.robot.BlackDeath 9.2 | 91.6% ± 2.1 | 86.9% ± 1.8 | +4.7 ± 1.9 |
| dragonbyte.Neutrino 4 | 81.9% ± 3.4 | 82.2% ± 1.8 | -0.3 ± 4.0 |
| drm.Magazine 0.39 | 76.9% ± 6.4 | 78.6% ± 2.3 | -1.7 ± 6.3 |
| dz.GalbaMini 0.121 | 68.6% ± 2.8 | 70.7% ± 2.8 | -2.1 ± 4.5 |
| eem.zapper v6.03 | 65.7% ± 6.2 | 70.3% ± 4.3 | -4.5 ± 8.1 |
| fromHell.C22H30N2O2S 2.2 | 80.9% ± 5.0 | 76.1% ± 2.4 | +4.7 ± 4.4 |
| hlavko.micro.Flex 1.5 | 75.7% ± 4.4 | 82.6% ± 2.9 | -6.8 ± 4.5 |
| jk.micro.Cotillion 0.8 | 77.9% ± 8.7 | 66.2% ± 5.1 | +11.7 ± 10.4 |
| jk.sheldor.nano.Yatagan 1.2.3 | 71.8% ± 2.1 | 79.0% ± 1.5 | -7.2 ± 3.1 |
| lazarecki.mega.PinkerStinker 0.7 | 69.6% ± 3.8 | 77.1% ± 3.3 | -7.5 ± 5.6 |
| lj.Dapps 0.2 | 78.8% ± 2.5 | 83.0% ± 1.6 | -4.2 ± 2.5 |
| nat.Samekh 0.4 | 65.1% ± 5.6 | 67.8% ± 5.8 | -2.7 ± 9.9 |
| nz.jdc.nano.NeophytePRAL 1.4 | 84.5% ± 1.2 | 89.8% ± 0.7 | -5.3 ± 1.6 |
| origin.SleepSiphon 1.7b | 91.9% ± 2.2 | 89.4% ± 2.2 | +2.5 ± 3.3 |
| pe.SandboxLump 1.52 | 73.6% ± 3.3 | 81.1% ± 3.3 | -7.5 ± 6.3 |
| penguin.Ivy 1.1r | 78.7% ± 4.8 | 87.0% ± 2.1 | -8.3 ± 5.3 |
| penguin.MrFreeze 1.0a | 75.8% ± 1.8 | 87.4% ± 2.6 | -11.6 ± 3.6 |
| pez.mini.VertiLeach 0.4.0 | 96.8% ± 2.0 | 98.5% ± 1.9 | -1.6 ± 3.1 |
| rampancy.Durandal 2.2d | 70.5% ± 1.8 | 74.9% ± 3.7 | -4.4 ± 4.8 |
| ry.VirtualGunExperiment 1.2.0 | 94.2% ± 2.8 | 82.1% ± 3.5 | +12.1 ± 3.5 |
| sheldor.micro.EpeeistDC 3.0 | 69.9% ± 3.4 | 70.7% ± 3.5 | -0.8 ± 3.2 |
| sheldor.micro.PointInLineRRAL 1.0 | 80.4% ± 2.3 | 85.2% ± 4.3 | -4.8 ± 5.1 |
| sheldor.nano.FoilistNano 3.2 | 72.1% ± 4.2 | 77.4% ± 2.9 | -5.3 ± 5.7 |
| slugzilla.ButtHead 2.0 | 68.9% ± 2.6 | 69.4% ± 1.8 | -0.4 ± 3.5 |
| slugzilla.RandomGF 1.0 | 90.5% ± 4.2 | 79.6% ± 4.1 | +10.8 ± 7.3 |
| sos.SOS 1.0 | 88.0% ± 2.3 | 88.5% ± 2.4 | -0.5 ± 3.1 |
| stelo.Chord 1.0 | 92.5% ± 2.9 | 78.8% ± 3.1 | +13.7 ± 5.6 |
| stelo.PastFuture 2.3.2 | 70.3% ± 7.2 | 64.9% ± 4.5 | +5.4 ± 9.1 |
| synnalagma.NeuralPremier 0.51 | 77.7% ± 3.5 | 84.7% ± 2.3 | -7.1 ± 3.3 |
| xander.cat.SamAxe 1.1 | 80.8% ± 2.2 | 84.6% ± 2.6 | -3.8 ± 2.5 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| ags.Glacier 0.3.2 | -3.7 ± 6.2 | -3.6 ± 8.6 | -3.6 ± 8.6 | -3.2 ± 4.9 |
| alk.lap.LoudAndProud 2.23 | -5.8 ± 3.2 | -4.6 ± 3.6 | -4.6 ± 3.6 | -6.5 ± 3.3 |
| axeBots.Musashi 2.18 | -6.9 ± 7.4 | -6.1 ± 9.1 | -6.1 ± 9.1 | -6.8 ± 5.9 |
| axeBots.Okami 1.04 | -6.5 ± 7.9 | -7.2 ± 11.1 | -7.1 ± 11.1 | -5.1 ± 4.7 |
| cjm.Charo 1.1 | +21.0 ± 3.3 | +8.6 ± 3.6 | +8.6 ± 3.6 | +25.1 ± 5.9 |
| cx.micro.Spark 0.6 | -2.1 ± 5.6 | -0.4 ± 5.2 | -0.4 ± 5.2 | -13.4 ± 6.7 |
| cx.mini.Cigaret 1.31 | -4.2 ± 6.6 | -6.1 ± 8.7 | -6.1 ± 8.7 | -5.6 ± 4.0 |
| davidalves.PhoenixOS 1.1 | -4.5 ± 2.1 | -4.9 ± 3.2 | -5.0 ± 3.3 | -3.5 ± 1.9 |
| deo.CloudBot 1.3 | -0.8 ± 4.0 | +0.7 ± 4.7 | +0.7 ± 4.7 | -14.7 ± 4.6 |
| dft.Immortal 1.40 | -3.3 ± 5.7 | -1.9 ± 9.5 | -1.8 ± 9.5 | -3.2 ± 1.8 |
| dmh.robocode.robot.BlackDeath 9.2 | +4.7 ± 1.9 | +2.1 ± 1.1 | +2.1 ± 1.1 | -12.8 ± 5.9 |
| dragonbyte.Neutrino 4 | -0.3 ± 4.0 | +0.4 ± 9.2 | +0.4 ± 9.2 | -1.1 ± 0.2 |
| drm.Magazine 0.39 | -1.7 ± 6.3 | -3.6 ± 5.8 | -3.6 ± 5.8 | -9.1 ± 4.5 |
| dz.GalbaMini 0.121 | -2.1 ± 4.5 | -1.4 ± 3.8 | -1.4 ± 3.8 | -2.0 ± 5.8 |
| eem.zapper v6.03 | -4.5 ± 8.1 | -4.6 ± 10.1 | -4.6 ± 10.1 | -3.5 ± 7.7 |
| fromHell.C22H30N2O2S 2.2 | +4.7 ± 4.4 | +4.7 ± 4.8 | +4.6 ± 4.8 | -21.3 ± 6.9 |
| hlavko.micro.Flex 1.5 | -6.8 ± 4.5 | -4.6 ± 3.1 | -4.6 ± 3.1 | -11.4 ± 5.5 |
| jk.micro.Cotillion 0.8 | +11.7 ± 10.4 | +9.6 ± 7.8 | +9.6 ± 7.8 | -1.8 ± 10.5 |
| jk.sheldor.nano.Yatagan 1.2.3 | -7.2 ± 3.1 | -7.6 ± 5.1 | -7.5 ± 4.9 | -6.4 ± 2.6 |
| lazarecki.mega.PinkerStinker 0.7 | -7.5 ± 5.6 | -7.5 ± 7.9 | -7.5 ± 7.9 | -7.2 ± 3.9 |
| lj.Dapps 0.2 | -4.2 ± 2.5 | -3.2 ± 4.9 | -3.2 ± 4.9 | -4.8 ± 3.3 |
| nat.Samekh 0.4 | -2.7 ± 9.9 | -1.8 ± 12.7 | -1.8 ± 12.7 | -3.4 ± 6.9 |
| nz.jdc.nano.NeophytePRAL 1.4 | -5.3 ± 1.6 | -2.1 ± 2.8 | -2.1 ± 2.8 | -7.2 ± 1.3 |
| origin.SleepSiphon 1.7b | +2.5 ± 3.3 | +0.7 ± 2.5 | +0.7 ± 2.5 | -16.8 ± 5.0 |
| pe.SandboxLump 1.52 | -7.5 ± 6.3 | -8.6 ± 8.5 | -8.6 ± 8.5 | -8.8 ± 4.4 |
| penguin.Ivy 1.1r | -8.3 ± 5.3 | -4.6 ± 5.7 | -4.6 ± 5.7 | -11.5 ± 5.3 |
| penguin.MrFreeze 1.0a | -11.6 ± 3.6 | -8.6 ± 5.1 | -8.6 ± 5.1 | -13.9 ± 4.4 |
| pez.mini.VertiLeach 0.4.0 | -1.6 ± 3.1 | -0.4 ± 1.5 | -0.4 ± 1.5 | -22.5 ± 30.6 |
| rampancy.Durandal 2.2d | -4.4 ± 4.8 | -2.9 ± 8.5 | -2.9 ± 8.5 | -6.0 ± 3.8 |
| ry.VirtualGunExperiment 1.2.0 | +12.1 ± 3.5 | +4.6 ± 4.0 | +4.6 ± 4.0 | -5.0 ± 4.6 |
| sheldor.micro.EpeeistDC 3.0 | -0.8 ± 3.2 | +1.8 ± 4.0 | +1.8 ± 4.0 | -2.8 ± 3.4 |
| sheldor.micro.PointInLineRRAL 1.0 | -4.8 ± 5.1 | -0.4 ± 4.5 | -0.4 ± 4.5 | -8.1 ± 6.9 |
| sheldor.nano.FoilistNano 3.2 | -5.3 ± 5.7 | -5.0 ± 7.1 | -5.0 ± 7.1 | -9.6 ± 3.8 |
| slugzilla.ButtHead 2.0 | -0.4 ± 3.5 | +0.4 ± 4.7 | +0.4 ± 4.7 | -0.2 ± 1.9 |
| slugzilla.RandomGF 1.0 | +10.8 ± 7.3 | +2.1 ± 5.1 | +2.1 ± 5.1 | -14.1 ± 11.1 |
| sos.SOS 1.0 | -0.5 ± 3.1 | +1.4 ± 3.1 | +1.4 ± 3.1 | -12.1 ± 3.6 |
| stelo.Chord 1.0 | +13.7 ± 5.6 | +7.1 ± 5.3 | +7.1 ± 5.3 | -0.6 ± 8.4 |
| stelo.PastFuture 2.3.2 | +5.4 ± 9.1 | +3.9 ± 11.6 | +3.9 ± 11.6 | +2.7 ± 5.8 |
| synnalagma.NeuralPremier 0.51 | -7.1 ± 3.3 | -7.9 ± 4.4 | -7.9 ± 4.4 | -6.1 ± 2.3 |
| xander.cat.SamAxe 1.1 | -3.8 ± 2.5 | -2.5 ± 4.3 | -2.5 ± 4.3 | -4.9 ± 1.9 |
| All pairs | -1.2 ± 1.0 | -1.6 ± 1.0 | -1.6 ± 1.0 | -6.7 ± 1.2 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or, for a Hadur build, a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| ags.Glacier 0.3.2 | 8 | 4 | -3.7 ± 6.2 | -4.9 ± 16.8 |
| alk.lap.LoudAndProud 2.23 | 8 | 5 | -5.8 ± 3.2 | -7.2 ± 3.3 |
| axeBots.Musashi 2.18 | 8 | 8 | -6.9 ± 7.4 | -6.9 ± 7.4 |
| axeBots.Okami 1.04 | 8 | 5 | -6.5 ± 7.9 | -5.7 ± 12.8 |
| cjm.Charo 1.1 | 8 | 7 | +21.0 ± 3.3 | +20.0 ± 2.6 |
| cx.micro.Spark 0.6 | 8 | 7 | -2.1 ± 5.6 | -1.5 ± 6.5 |
| cx.mini.Cigaret 1.31 | 8 | 7 | -4.2 ± 6.6 | -2.4 ± 6.1 |
| davidalves.PhoenixOS 1.1 | 8 | 5 | -4.5 ± 2.1 | -4.3 ± 3.0 |
| deo.CloudBot 1.3 | 8 | 6 | -0.8 ± 4.0 | -0.7 ± 5.8 |
| dft.Immortal 1.40 | 8 | 4 | -3.3 ± 5.7 | -4.4 ± 6.7 |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 7 | +4.7 ± 1.9 | +4.5 ± 2.2 |
| dragonbyte.Neutrino 4 | 8 | 3 | -0.3 ± 4.0 | +1.3 ± 20.0 |
| drm.Magazine 0.39 | 8 | 7 | -1.7 ± 6.3 | +0.2 ± 5.4 |
| dz.GalbaMini 0.121 | 8 | 5 | -2.1 ± 4.5 | +0.3 ± 5.8 |
| eem.zapper v6.03 | 8 | 3 | -4.5 ± 8.1 | +0.5 ± 31.7 |
| fromHell.C22H30N2O2S 2.2 | 8 | 6 | +4.7 ± 4.4 | +7.0 ± 2.8 |
| hlavko.micro.Flex 1.5 | 8 | 8 | -6.8 ± 4.5 | -6.8 ± 4.5 |
| jk.micro.Cotillion 0.8 | 8 | 5 | +11.7 ± 10.4 | +14.1 ± 17.7 |
| jk.sheldor.nano.Yatagan 1.2.3 | 8 | 5 | -7.2 ± 3.1 | -8.9 ± 4.3 |
| lazarecki.mega.PinkerStinker 0.7 | 8 | 5 | -7.5 ± 5.6 | -9.1 ± 7.1 |
| lj.Dapps 0.2 | 8 | 7 | -4.2 ± 2.5 | -3.9 ± 2.8 |
| nat.Samekh 0.4 | 8 | 6 | -2.7 ± 9.9 | -3.4 ± 14.6 |
| nz.jdc.nano.NeophytePRAL 1.4 | 8 | 7 | -5.3 ± 1.6 | -5.1 ± 1.8 |
| origin.SleepSiphon 1.7b | 8 | 7 | +2.5 ± 3.3 | +3.5 ± 2.8 |
| pe.SandboxLump 1.52 | 8 | 7 | -7.5 ± 6.3 | -7.5 ± 7.5 |
| penguin.Ivy 1.1r | 8 | 5 | -8.3 ± 5.3 | -8.5 ± 4.7 |
| penguin.MrFreeze 1.0a | 8 | 6 | -11.6 ± 3.6 | -11.9 ± 3.9 |
| pez.mini.VertiLeach 0.4.0 | 8 | 8 | -1.6 ± 3.1 | -1.6 ± 3.1 |
| rampancy.Durandal 2.2d | 8 | 5 | -4.4 ± 4.8 | -4.3 ± 5.9 |
| ry.VirtualGunExperiment 1.2.0 | 8 | 8 | +12.1 ± 3.5 | +12.1 ± 3.5 |
| sheldor.micro.EpeeistDC 3.0 | 8 | 5 | -0.8 ± 3.2 | -0.9 ± 5.1 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 7 | -4.8 ± 5.1 | -6.1 ± 4.9 |
| sheldor.nano.FoilistNano 3.2 | 8 | 4 | -5.3 ± 5.7 | -1.4 ± 9.9 |
| slugzilla.ButtHead 2.0 | 8 | 4 | -0.4 ± 3.5 | -1.6 ± 7.0 |
| slugzilla.RandomGF 1.0 | 8 | 8 | +10.8 ± 7.3 | +10.8 ± 7.3 |
| sos.SOS 1.0 | 8 | 6 | -0.5 ± 3.1 | -0.5 ± 4.5 |
| stelo.Chord 1.0 | 8 | 4 | +13.7 ± 5.6 | +13.8 ± 14.7 |
| stelo.PastFuture 2.3.2 | 8 | 4 | +5.4 ± 9.1 | +2.8 ± 20.9 |
| synnalagma.NeuralPremier 0.51 | 8 | 5 | -7.1 ± 3.3 | -5.0 ± 3.8 |
| xander.cat.SamAxe 1.1 | 8 | 8 | -3.8 ± 2.5 | -3.8 ± 2.5 |
| All pairs | 320 | 233 | -1.2 ± 1.0 | -0.8 ± 1.2 |

# Bench: hadur2.Hadur 3.9sa baseline (hadur2.Hadur 3.9) (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 3809 over 320 battles (11.9 per battle, most in one battle 76). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | mid | 65.6% ± 4.5 | 80.4% ± 6.3 | 52.5% ± 3.1 | 225 / 280 | 12.9% ± 0.7 | 9.7% ± 0.6 | 140 | 0 | 1.36 / 20.8 |
| alk.lap.LoudAndProud 2.23 | mid | 81.8% ± 1.8 | 96.1% ± 2.2 | 66.9% ± 2.1 | 269 / 280 | 15.9% ± 1.0 | 5.7% ± 0.7 | 86 | 0 | 1.20 / 24.5 |
| axeBots.Musashi 2.18 | mid | 76.7% ± 3.3 | 89.3% ± 3.6 | 64.7% ± 3.2 | 250 / 280 | 13.8% ± 0.4 | 7.2% ± 0.5 | 102 | 0 | 1.17 / 24.8 |
| axeBots.Okami 1.04 | mid | 74.4% ± 4.3 | 86.8% ± 6.1 | 63.1% ± 2.5 | 243 / 280 | 13.6% ± 0.5 | 7.6% ± 0.6 | 224 | 0 | 1.35 / 16.1 |
| cjm.Charo 1.1 | mid | 75.8% ± 3.6 | 91.1% ± 3.9 | 59.6% ± 3.4 | 255 / 280 | 14.1% ± 1.0 | 5.5% ± 0.7 | 77 | 0 | 0.86 / 13.9 |
| cx.micro.Spark 0.6 | mid | 80.5% ± 3.2 | 92.5% ± 3.6 | 67.4% ± 2.8 | 259 / 280 | 14.6% ± 0.6 | 5.7% ± 0.4 | 88 | 0 | 1.01 / 40.6 |
| cx.mini.Cigaret 1.31 | mid | 74.2% ± 3.4 | 90.4% ± 4.4 | 57.5% ± 3.5 | 253 / 280 | 12.7% ± 0.6 | 5.6% ± 0.3 | 87 | 0 | 2.18 / 22.1 |
| davidalves.PhoenixOS 1.1 | mid | 67.8% ± 2.5 | 81.3% ± 3.9 | 54.3% ± 1.1 | 228 / 280 | 12.4% ± 0.5 | 6.9% ± 0.7 | 99 | 0 | 0.96 / 135.8 |
| deo.CloudBot 1.3 | mid | 79.1% ± 2.4 | 91.8% ± 3.5 | 67.0% ± 2.3 | 257 / 280 | 16.6% ± 0.9 | 7.4% ± 0.6 | 155 | 0 | 0.89 / 287.4 |
| dft.Immortal 1.40 | mid | 71.5% ± 3.4 | 88.9% ± 5.5 | 52.8% ± 2.6 | 249 / 280 | 11.2% ± 0.4 | 6.5% ± 0.5 | 94 | 0 | 1.01 / 18.7 |
| dmh.robocode.robot.BlackDeath 9.2 | mid | 86.9% ± 1.8 | 96.8% ± 1.5 | 77.2% ± 2.5 | 271 / 280 | 19.1% ± 0.7 | 5.4% ± 0.8 | 93 | 0 | 0.92 / 44.0 |
| dragonbyte.Neutrino 4 | mid | 82.2% ± 1.8 | 56.8% ± 3.9 | 99.8% ± 0.1 | 159 / 280 | 15.0% ± 0.4 | 0.4% ± 0.1 | 78 | 0 | 0.67 / 23.3 |
| drm.Magazine 0.39 | mid | 78.6% ± 2.3 | 93.2% ± 2.5 | 63.1% ± 2.8 | 261 / 280 | 14.3% ± 0.6 | 5.5% ± 0.6 | 83 | 0 | 1.20 / 16.3 |
| dz.GalbaMini 0.121 | mid | 70.7% ± 2.8 | 85.0% ± 2.8 | 57.0% ± 3.3 | 238 / 280 | 13.4% ± 0.8 | 7.4% ± 0.5 | 99 | 0 | 0.94 / 15.4 |
| eem.zapper v6.03 | mid | 70.3% ± 4.3 | 86.4% ± 4.9 | 54.0% ± 4.7 | 242 / 280 | 11.6% ± 0.6 | 7.4% ± 0.7 | 113 | 0 | 1.85 / 38.3 |
| fromHell.C22H30N2O2S 2.2 | mid | 76.1% ± 2.4 | 90.0% ± 3.1 | 63.4% ± 2.2 | 252 / 280 | 16.7% ± 1.0 | 7.7% ± 0.8 | 80 | 0 | 0.91 / 18.6 |
| hlavko.micro.Flex 1.5 | mid | 82.6% ± 2.9 | 93.9% ± 3.0 | 71.7% ± 3.0 | 263 / 280 | 22.2% ± 1.7 | 6.9% ± 1.0 | 79 | 0 | 0.84 / 14.5 |
| jk.micro.Cotillion 0.8 | mid | 66.2% ± 5.1 | 81.8% ± 6.2 | 50.2% ± 5.4 | 229 / 280 | 11.2% ± 0.8 | 6.9% ± 0.5 | 89 | 0 | 1.14 / 30.1 |
| jk.sheldor.nano.Yatagan 1.2.3 | mid | 79.0% ± 1.5 | 90.4% ± 2.5 | 68.9% ± 1.2 | 253 / 280 | 21.7% ± 0.6 | 9.5% ± 0.7 | 74 | 0 | 0.83 / 14.3 |
| lazarecki.mega.PinkerStinker 0.7 | mid | 77.1% ± 3.3 | 87.9% ± 4.4 | 66.7% ± 2.5 | 246 / 280 | 14.8% ± 0.5 | 7.1% ± 0.4 | 133 | 0 | 0.94 / 41.4 |
| lj.Dapps 0.2 | mid | 83.0% ± 1.6 | 96.4% ± 2.8 | 70.1% ± 1.8 | 270 / 280 | 14.9% ± 0.8 | 7.2% ± 0.2 | 87 | 0 | 0.91 / 16.2 |
| nat.Samekh 0.4 | mid | 67.8% ± 5.8 | 83.6% ± 6.2 | 51.8% ± 5.2 | 234 / 280 | 11.0% ± 0.3 | 7.3% ± 0.6 | 102 | 0 | 1.10 / 197.2 |
| nz.jdc.nano.NeophytePRAL 1.4 | mid | 89.8% ± 0.7 | 98.9% ± 1.8 | 81.9% ± 1.0 | 277 / 280 | 20.7% ± 0.4 | 9.2% ± 0.7 | 82 | 0 | 0.74 / 28.7 |
| origin.SleepSiphon 1.7b | mid | 89.4% ± 2.2 | 97.5% ± 2.4 | 81.3% ± 2.8 | 273 / 280 | 18.4% ± 1.0 | 5.0% ± 0.9 | 97 | 0 | 1.03 / 70.2 |
| pe.SandboxLump 1.52 | mid | 81.1% ± 3.3 | 93.9% ± 4.5 | 69.1% ± 2.7 | 263 / 280 | 18.2% ± 1.0 | 7.4% ± 1.4 | 98 | 0 | 0.82 / 95.7 |
| penguin.Ivy 1.1r | mid | 87.0% ± 2.1 | 94.3% ± 2.6 | 79.4% ± 2.8 | 264 / 280 | 15.2% ± 0.3 | 5.4% ± 0.6 | 92 | 0 | 0.87 / 22.5 |
| penguin.MrFreeze 1.0a | mid | 87.4% ± 2.6 | 96.8% ± 2.7 | 77.5% ± 2.7 | 271 / 280 | 14.4% ± 0.7 | 7.3% ± 0.5 | 109 | 0 | 1.04 / 16.6 |
| pez.mini.VertiLeach 0.4.0 | mid | 98.5% ± 1.9 | 99.6% ± 0.8 | 72.9% ± 18.8 | 279 / 280 | 0.6% ± 0.2 | 0.2% ± 0.1 | 40 | 0 | 0.56 / 16.5 |
| rampancy.Durandal 2.2d | mid | 74.9% ± 3.7 | 86.1% ± 6.3 | 64.8% ± 2.6 | 241 / 280 | 18.3% ± 1.2 | 8.3% ± 0.6 | 73 | 0 | 0.91 / 20.2 |
| ry.VirtualGunExperiment 1.2.0 | mid | 82.1% ± 3.5 | 94.3% ± 3.4 | 68.3% ± 4.3 | 264 / 280 | 12.3% ± 0.9 | 5.7% ± 0.6 | 103 | 0 | 1.00 / 42.6 |
| sheldor.micro.EpeeistDC 3.0 | mid | 70.7% ± 3.5 | 85.4% ± 4.7 | 56.0% ± 2.6 | 239 / 280 | 12.2% ± 0.6 | 7.3% ± 0.6 | 99 | 0 | 1.23 / 70.4 |
| sheldor.micro.PointInLineRRAL 1.0 | mid | 85.2% ± 4.3 | 96.8% ± 3.5 | 70.8% ± 5.3 | 271 / 280 | 12.2% ± 0.7 | 4.7% ± 1.0 | 91 | 0 | 0.90 / 21.7 |
| sheldor.nano.FoilistNano 3.2 | mid | 77.4% ± 2.9 | 89.6% ± 3.8 | 66.8% ± 2.3 | 251 / 280 | 18.1% ± 1.1 | 9.5% ± 0.7 | 76 | 0 | 0.90 / 14.8 |
| slugzilla.ButtHead 2.0 | mid | 69.4% ± 1.8 | 95.0% ± 1.7 | 60.1% ± 1.5 | 266 / 280 | 70.1% ± 2.0 | 53.0% ± 3.1 | 73 | 0 | 0.57 / 186.3 |
| slugzilla.RandomGF 1.0 | mid | 79.6% ± 4.1 | 95.7% ± 2.9 | 60.5% ± 5.0 | 268 / 280 | 11.5% ± 0.8 | 5.3% ± 0.6 | 88 | 0 | 0.93 / 33.6 |
| sos.SOS 1.0 | mid | 88.5% ± 2.4 | 95.7% ± 2.9 | 80.8% ± 2.3 | 268 / 280 | 17.4% ± 1.1 | 6.0% ± 0.6 | 111 | 0 | 0.80 / 41.5 |
| stelo.Chord 1.0 | mid | 78.8% ± 3.1 | 91.4% ± 4.2 | 64.8% ± 3.1 | 256 / 280 | 13.4% ± 1.5 | 5.7% ± 0.6 | 72 | 0 | 0.93 / 50.7 |
| stelo.PastFuture 2.3.2 | mid | 64.9% ± 4.5 | 80.0% ± 6.5 | 50.7% ± 2.3 | 224 / 280 | 12.1% ± 0.4 | 8.1% ± 0.5 | 84 | 0 | 1.23 / 15.3 |
| synnalagma.NeuralPremier 0.51 | mid | 84.7% ± 2.3 | 94.6% ± 3.2 | 75.4% ± 2.1 | 265 / 280 | 17.5% ± 0.7 | 6.9% ± 0.6 | 81 | 0 | 0.83 / 15.8 |
| xander.cat.SamAxe 1.1 | mid | 84.6% ± 2.6 | 94.3% ± 3.4 | 75.9% ± 2.1 | 264 / 280 | 21.0% ± 1.1 | 8.2% ± 0.8 | 78 | 0 | 0.90 / 49.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 8 | 1706 | 20.2% | 70.8% | 0.0% | 9.0% | 976 |
| alk.lap.LoudAndProud 2.23 | 8 | 852 | 8.1% | 88.4% | 0.0% | 3.5% | 555 |
| axeBots.Musashi 2.18 | 8 | 1138 | 16.5% | 76.8% | 0.0% | 6.7% | 1036 |
| axeBots.Okami 1.04 | 8 | 1276 | 18.1% | 73.9% | 0.0% | 7.9% | 1043 |
| cjm.Charo 1.1 | 8 | 1095 | 14.3% | 79.3% | 0.0% | 6.4% | 622 |
| cx.micro.Spark 0.6 | 8 | 899 | 14.6% | 79.2% | 0.0% | 6.2% | 652 |
| cx.mini.Cigaret 1.31 | 8 | 1171 | 14.4% | 78.5% | 0.1% | 7.1% | 694 |
| davidalves.PhoenixOS 1.1 | 8 | 1467 | 22.1% | 68.7% | 0.0% | 9.1% | 1033 |
| deo.CloudBot 1.3 | 8 | 1043 | 13.8% | 80.3% | 0.3% | 5.5% | 658 |
| dft.Immortal 1.40 | 8 | 1283 | 15.1% | 78.7% | 0.0% | 6.2% | 879 |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 656 | 8.6% | 87.8% | 0.0% | 3.6% | 543 |
| dragonbyte.Neutrino 4 | 8 | 913 | 82.9% | 0.6% | 0.0% | 16.6% | 1960 |
| drm.Magazine 0.39 | 8 | 984 | 12.1% | 82.3% | 0.0% | 5.6% | 601 |
| dz.GalbaMini 0.121 | 8 | 1423 | 18.5% | 73.4% | 0.0% | 8.1% | 769 |
| eem.zapper v6.03 | 8 | 1372 | 17.3% | 75.4% | 0.0% | 7.3% | 1083 |
| fromHell.C22H30N2O2S 2.2 | 8 | 1204 | 14.5% | 78.8% | 0.0% | 6.6% | 571 |
| hlavko.micro.Flex 1.5 | 8 | 885 | 12.0% | 83.1% | 0.0% | 4.8% | 515 |
| jk.micro.Cotillion 0.8 | 8 | 1529 | 20.8% | 70.4% | 0.0% | 8.7% | 852 |
| jk.sheldor.nano.Yatagan 1.2.3 | 8 | 1134 | 14.9% | 79.2% | 0.0% | 5.9% | 551 |
| lazarecki.mega.PinkerStinker 0.7 | 8 | 1134 | 18.7% | 73.4% | 0.0% | 7.8% | 830 |
| lj.Dapps 0.2 | 8 | 846 | 7.4% | 89.3% | 0.0% | 3.3% | 752 |
| nat.Samekh 0.4 | 8 | 1481 | 19.4% | 72.3% | 0.0% | 8.3% | 867 |
| nz.jdc.nano.NeophytePRAL 1.4 | 8 | 567 | 3.3% | 95.5% | 0.0% | 1.2% | 533 |
| origin.SleepSiphon 1.7b | 8 | 535 | 8.2% | 88.1% | 0.0% | 3.7% | 606 |
| pe.SandboxLump 1.52 | 8 | 969 | 11.0% | 84.0% | 0.0% | 5.0% | 532 |
| penguin.Ivy 1.1r | 8 | 636 | 15.7% | 78.0% | 0.0% | 6.3% | 880 |
| penguin.MrFreeze 1.0a | 8 | 609 | 9.2% | 86.9% | 0.0% | 3.9% | 808 |
| pez.mini.VertiLeach 0.4.0 | 8 | 34 | 18.5% | 72.0% | 0.0% | 9.6% | 162 |
| rampancy.Durandal 2.2d | 8 | 1310 | 18.6% | 73.6% | 0.0% | 7.8% | 613 |
| ry.VirtualGunExperiment 1.2.0 | 8 | 808 | 12.4% | 82.8% | 0.0% | 4.9% | 845 |
| sheldor.micro.EpeeistDC 3.0 | 8 | 1372 | 18.7% | 73.3% | 0.0% | 8.1% | 942 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 637 | 8.8% | 87.7% | 0.0% | 3.5% | 910 |
| sheldor.nano.FoilistNano 3.2 | 8 | 1225 | 14.8% | 79.0% | 0.0% | 6.2% | 568 |
| slugzilla.ButtHead 2.0 | 8 | 2965 | 3.0% | 86.7% | 8.2% | 2.1% | 326 |
| slugzilla.RandomGF 1.0 | 8 | 876 | 8.6% | 87.8% | 0.1% | 3.5% | 745 |
| sos.SOS 1.0 | 8 | 564 | 13.3% | 81.9% | 0.4% | 4.4% | 706 |
| stelo.Chord 1.0 | 8 | 964 | 15.6% | 78.2% | 0.0% | 6.3% | 735 |
| stelo.PastFuture 2.3.2 | 8 | 1696 | 20.6% | 70.4% | 0.0% | 9.0% | 793 |
| synnalagma.NeuralPremier 0.51 | 8 | 792 | 11.8% | 83.1% | 0.3% | 4.8% | 638 |
| xander.cat.SamAxe 1.1 | 8 | 836 | 12.0% | 83.1% | 0.0% | 5.0% | 564 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 8 | 5 | 1192 | 0 | 0.50 | 0 | 0 | 0 |
| alk.lap.LoudAndProud 2.23 | 8 | 7 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| axeBots.Musashi 2.18 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| axeBots.Okami 1.04 | 8 | 6 | 596 | 0 | 0.80 | 0 | 0 | 0 |
| cjm.Charo 1.1 | 8 | 7 | 298 | 0 | 0.28 | 1 | 1 | 0 |
| cx.micro.Spark 0.6 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| cx.mini.Cigaret 1.31 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| davidalves.PhoenixOS 1.1 | 8 | 6 | 298 | 0 | 0.35 | 1 | 1 | 0 |
| deo.CloudBot 1.3 | 8 | 7 | 0 | 1 | 0.55 | 0 | 0 | 0 |
| dft.Immortal 1.40 | 8 | 6 | 298 | 0 | 0.34 | 1 | 1 | 0 |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 7 | 298 | 0 | 0.33 | 0 | 0 | 0 |
| dragonbyte.Neutrino 4 | 8 | 7 | 0 | 0 | 0.28 | 1 | 1 | 0 |
| drm.Magazine 0.39 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| dz.GalbaMini 0.121 | 8 | 7 | 0 | 0 | 0.35 | 1 | 1 | 0 |
| eem.zapper v6.03 | 8 | 5 | 0 | 0 | 0.40 | 3 | 3 | 0 |
| fromHell.C22H30N2O2S 2.2 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| hlavko.micro.Flex 1.5 | 8 | 8 | 0 | 0 | 0.28 | 0 | 0 | 0 |
| jk.micro.Cotillion 0.8 | 8 | 7 | 0 | 0 | 0.32 | 1 | 1 | 0 |
| jk.sheldor.nano.Yatagan 1.2.3 | 8 | 6 | 298 | 0 | 0.26 | 1 | 1 | 0 |
| lazarecki.mega.PinkerStinker 0.7 | 8 | 7 | 298 | 0 | 0.48 | 0 | 0 | 0 |
| lj.Dapps 0.2 | 8 | 7 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| nat.Samekh 0.4 | 8 | 7 | 0 | 0 | 0.36 | 1 | 1 | 0 |
| nz.jdc.nano.NeophytePRAL 1.4 | 8 | 7 | 298 | 0 | 0.29 | 0 | 0 | 0 |
| origin.SleepSiphon 1.7b | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| pe.SandboxLump 1.52 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| penguin.Ivy 1.1r | 8 | 5 | 596 | 0 | 0.33 | 1 | 1 | 0 |
| penguin.MrFreeze 1.0a | 8 | 7 | 298 | 0 | 0.39 | 0 | 0 | 0 |
| pez.mini.VertiLeach 0.4.0 | 8 | 8 | 0 | 0 | 0.14 | 0 | 0 | 8 |
| rampancy.Durandal 2.2d | 8 | 7 | 0 | 0 | 0.26 | 1 | 1 | 0 |
| ry.VirtualGunExperiment 1.2.0 | 8 | 8 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| sheldor.micro.EpeeistDC 3.0 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| sheldor.nano.FoilistNano 3.2 | 8 | 6 | 0 | 0 | 0.27 | 2 | 2 | 0 |
| slugzilla.ButtHead 2.0 | 8 | 6 | 0 | 0 | 0.26 | 2 | 1 | 0 |
| slugzilla.RandomGF 1.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| sos.SOS 1.0 | 8 | 7 | 0 | 1 | 0.40 | 1 | 1 | 0 |
| stelo.Chord 1.0 | 8 | 4 | 596 | 0 | 0.26 | 3 | 3 | 0 |
| stelo.PastFuture 2.3.2 | 8 | 6 | 0 | 0 | 0.30 | 2 | 2 | 0 |
| synnalagma.NeuralPremier 0.51 | 8 | 6 | 298 | 0 | 0.29 | 1 | 1 | 0 |
| xander.cat.SamAxe 1.1 | 8 | 8 | 0 | 0 | 0.28 | 0 | 0 | 0 |

275 of 320 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 17079 | 74 | 16994 | 16991 (99.5%) | 88 (0.5%) | 3 (0.0%) | 1127 | 305 | 66 |
| alk.lap.LoudAndProud 2.23 | 6652 | 11 | 6641 | 6633 (99.7%) | 19 (0.3%) | 8 (0.1%) | 140 | 89 | 32 |
| axeBots.Musashi 2.18 | 12767 | 6 | 14144 | 12766 (100.0%) | 1 (0.0%) | 1378 (9.7%) | 1289 | 184 | 44 |
| axeBots.Okami 1.04 | 12390 | 8 | 13825 | 12348 (99.7%) | 42 (0.3%) | 1477 (10.7%) | 1293 | 168 | 163 |
| cjm.Charo 1.1 | 7008 | 5 | 6996 | 6990 (99.7%) | 18 (0.3%) | 6 (0.1%) | 335 | 96 | 19 |
| cx.micro.Spark 0.6 | 8549 | 4 | 8549 | 8549 (100.0%) | 0 (0.0%) | 0 (0.0%) | 274 | 124 | 31 |
| cx.mini.Cigaret 1.31 | 7470 | 4 | 7513 | 7470 (100.0%) | 0 (0.0%) | 43 (0.6%) | 413 | 92 | 24 |
| davidalves.PhoenixOS 1.1 | 12681 | 4 | 13415 | 12660 (99.8%) | 21 (0.2%) | 755 (5.6%) | 1570 | 115 | 39 |
| deo.CloudBot 1.3 | 9536 | 15 | 9536 | 9535 (100.0%) | 1 (0.0%) | 1 (0.0%) | 281 | 150 | 35 |
| dft.Immortal 1.40 | 12126 | 6 | 12129 | 12103 (99.8%) | 23 (0.2%) | 26 (0.2%) | 704 | 121 | 36 |
| dmh.robocode.robot.BlackDeath 9.2 | 6984 | 18 | 6964 | 6964 (99.7%) | 20 (0.3%) | 0 (0.0%) | 195 | 113 | 25 |
| dragonbyte.Neutrino 4 | 24884 | 0 | 37248 | 24884 (100.0%) | 0 (0.0%) | 12364 (33.2%) | 3760 | 140 | 24 |
| drm.Magazine 0.39 | 7382 | 27 | 7381 | 7381 (100.0%) | 1 (0.0%) | 0 (0.0%) | 211 | 102 | 27 |
| dz.GalbaMini 0.121 | 11541 | 17 | 11541 | 11541 (100.0%) | 0 (0.0%) | 0 (0.0%) | 488 | 125 | 41 |
| eem.zapper v6.03 | 19346 | 18 | 19358 | 19346 (100.0%) | 0 (0.0%) | 12 (0.1%) | 1209 | 206 | 65 |
| fromHell.C22H30N2O2S 2.2 | 7245 | 21 | 7247 | 7244 (100.0%) | 1 (0.0%) | 3 (0.0%) | 330 | 115 | 21 |
| hlavko.micro.Flex 1.5 | 6277 | 33 | 6280 | 6277 (100.0%) | 0 (0.0%) | 3 (0.0%) | 499 | 114 | 21 |
| jk.micro.Cotillion 0.8 | 11717 | 10 | 11725 | 11717 (100.0%) | 0 (0.0%) | 8 (0.1%) | 673 | 111 | 44 |
| jk.sheldor.nano.Yatagan 1.2.3 | 7324 | 21 | 7307 | 7295 (99.6%) | 29 (0.4%) | 12 (0.2%) | 473 | 140 | 21 |
| lazarecki.mega.PinkerStinker 0.7 | 10782 | 11 | 10791 | 10763 (99.8%) | 19 (0.2%) | 28 (0.3%) | 686 | 172 | 67 |
| lj.Dapps 0.2 | 12033 | 63 | 12033 | 12030 (100.0%) | 3 (0.0%) | 3 (0.0%) | 510 | 176 | 45 |
| nat.Samekh 0.4 | 13020 | 81 | 13019 | 13018 (100.0%) | 2 (0.0%) | 1 (0.0%) | 628 | 159 | 53 |
| nz.jdc.nano.NeophytePRAL 1.4 | 7424 | 28 | 7427 | 7398 (99.6%) | 26 (0.4%) | 29 (0.4%) | 463 | 172 | 15 |
| origin.SleepSiphon 1.7b | 8797 | 29 | 8797 | 8797 (100.0%) | 0 (0.0%) | 0 (0.0%) | 309 | 122 | 25 |
| pe.SandboxLump 1.52 | 6065 | 23 | 6047 | 6046 (99.7%) | 19 (0.3%) | 1 (0.0%) | 96 | 96 | 26 |
| penguin.Ivy 1.1r | 6974 | 2 | 6961 | 6956 (99.7%) | 18 (0.3%) | 5 (0.1%) | 710 | 96 | 39 |
| penguin.MrFreeze 1.0a | 13009 | 21 | 13012 | 12988 (99.8%) | 21 (0.2%) | 24 (0.2%) | 402 | 146 | 39 |
| pez.mini.VertiLeach 0.4.0 | 182 | 0 | 182 | 182 (100.0%) | 0 (0.0%) | 0 (0.0%) | 8 | 0 | 9 |
| rampancy.Durandal 2.2d | 7741 | 22 | 7742 | 7741 (100.0%) | 0 (0.0%) | 1 (0.0%) | 387 | 124 | 25 |
| ry.VirtualGunExperiment 1.2.0 | 13050 | 17 | 13049 | 13048 (100.0%) | 2 (0.0%) | 1 (0.0%) | 455 | 154 | 38 |
| sheldor.micro.EpeeistDC 3.0 | 16473 | 66 | 16463 | 16452 (99.9%) | 21 (0.1%) | 11 (0.1%) | 875 | 163 | 46 |
| sheldor.micro.PointInLineRRAL 1.0 | 14867 | 10 | 14867 | 14867 (100.0%) | 0 (0.0%) | 0 (0.0%) | 739 | 134 | 27 |
| sheldor.nano.FoilistNano 3.2 | 7870 | 19 | 7871 | 7856 (99.8%) | 14 (0.2%) | 15 (0.2%) | 431 | 142 | 19 |
| slugzilla.ButtHead 2.0 | 2827 | 16 | 2806 | 2805 (99.2%) | 22 (0.8%) | 1 (0.0%) | 1411 | 245 | 13 |
| slugzilla.RandomGF 1.0 | 11152 | 17 | 11152 | 11152 (100.0%) | 0 (0.0%) | 0 (0.0%) | 330 | 123 | 25 |
| sos.SOS 1.0 | 10996 | 31 | 10996 | 10995 (100.0%) | 1 (0.0%) | 1 (0.0%) | 280 | 143 | 18 |
| stelo.Chord 1.0 | 11149 | 19 | 11105 | 11105 (99.6%) | 44 (0.4%) | 0 (0.0%) | 307 | 127 | 66 |
| stelo.PastFuture 2.3.2 | 12396 | 14 | 12397 | 12395 (100.0%) | 1 (0.0%) | 2 (0.0%) | 566 | 144 | 35 |
| synnalagma.NeuralPremier 0.51 | 7922 | 28 | 7906 | 7905 (99.8%) | 17 (0.2%) | 1 (0.0%) | 280 | 107 | 29 |
| xander.cat.SamAxe 1.1 | 7336 | 16 | 7337 | 7333 (100.0%) | 3 (0.0%) | 4 (0.1%) | 527 | 163 | 24 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.Glacier 0.3.2 | 17796 | 1525 (8.6%) | 15703 |
| alk.lap.LoudAndProud 2.23 | 7577 | 518 (6.8%) | 4366 |
| axeBots.Musashi 2.18 | 19038 | 1199 (6.3%) | 15010 |
| axeBots.Okami 1.04 | 19238 | 1102 (5.7%) | 14966 |
| cjm.Charo 1.1 | 9118 | 618 (6.8%) | 3636 |
| cx.micro.Spark 0.6 | 9817 | 742 (7.6%) | 5163 |
| cx.mini.Cigaret 1.31 | 10992 | 730 (6.6%) | 6617 |
| davidalves.PhoenixOS 1.1 | 18991 | 1068 (5.6%) | 13903 |
| deo.CloudBot 1.3 | 9667 | 882 (9.1%) | 7614 |
| dft.Immortal 1.40 | 15364 | 1365 (8.9%) | 13834 |
| dmh.robocode.robot.BlackDeath 9.2 | 7074 | 604 (8.5%) | 4116 |
| dragonbyte.Neutrino 4 | 39850 | 1617 (4.1%) | 31486 |
| drm.Magazine 0.39 | 8775 | 557 (6.3%) | 1741 |
| dz.GalbaMini 0.121 | 12589 | 1007 (8.0%) | 9187 |
| eem.zapper v6.03 | 20360 | 1977 (9.7%) | 18209 |
| fromHell.C22H30N2O2S 2.2 | 7703 | 631 (8.2%) | 4351 |
| hlavko.micro.Flex 1.5 | 6573 | 516 (7.9%) | 4555 |
| jk.micro.Cotillion 0.8 | 14955 | 1094 (7.3%) | 9893 |
| jk.sheldor.nano.Yatagan 1.2.3 | 7153 | 588 (8.2%) | 3449 |
| lazarecki.mega.PinkerStinker 0.7 | 13845 | 873 (6.3%) | 6588 |
| lj.Dapps 0.2 | 11940 | 1033 (8.7%) | 9676 |
| nat.Samekh 0.4 | 15066 | 1183 (7.9%) | 10798 |
| nz.jdc.nano.NeophytePRAL 1.4 | 6571 | 574 (8.7%) | 4548 |
| origin.SleepSiphon 1.7b | 8409 | 618 (7.3%) | 4162 |
| pe.SandboxLump 1.52 | 6889 | 525 (7.6%) | 2665 |
| penguin.Ivy 1.1r | 14771 | 619 (4.2%) | 3654 |
| penguin.MrFreeze 1.0a | 13206 | 1295 (9.8%) | 11567 |
| pez.mini.VertiLeach 0.4.0 | 206 | 17 (8.3%) | 0 |
| rampancy.Durandal 2.2d | 8613 | 577 (6.7%) | 2217 |
| ry.VirtualGunExperiment 1.2.0 | 14145 | 1230 (8.7%) | 11234 |
| sheldor.micro.EpeeistDC 3.0 | 17009 | 1557 (9.2%) | 15895 |
| sheldor.micro.PointInLineRRAL 1.0 | 16165 | 1149 (7.1%) | 13424 |
| sheldor.nano.FoilistNano 3.2 | 7406 | 692 (9.3%) | 4914 |
| slugzilla.ButtHead 2.0 | 2741 | 199 (7.3%) | 1479 |
| slugzilla.RandomGF 1.0 | 12010 | 1212 (10.1%) | 9580 |
| sos.SOS 1.0 | 10578 | 855 (8.1%) | 7697 |
| stelo.Chord 1.0 | 11313 | 1097 (9.7%) | 10047 |
| stelo.PastFuture 2.3.2 | 13084 | 1131 (8.6%) | 11126 |
| synnalagma.NeuralPremier 0.51 | 9083 | 770 (8.5%) | 6468 |
| xander.cat.SamAxe 1.1 | 7413 | 584 (7.9%) | 3970 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 650 | 426 | 644 | 826 | 38.1 / 34.5 | 833 | 3680 | 1226 |
| alk.lap.LoudAndProud 2.23 | 650 | 487 | 497 | 405 | 43.5 / 21.5 | 2050 | 5333 | 3101 |
| axeBots.Musashi 2.18 | 650 | 491 | 588 | 886 | 45.7 / 25.0 | 986 | 1697 | 46 |
| axeBots.Okami 1.04 | 650 | 507 | 619 | 893 | 45.9 / 27.0 | 1112 | 1677 | 45 |
| cjm.Charo 1.1 | 650 | 412 | 525 | 472 | 36.5 / 24.8 | 943 | 5716 | 102 |
| cx.micro.Spark 0.6 | 650 | 500 | 566 | 502 | 42.0 / 20.3 | 1167 | 5490 | 169 |
| cx.mini.Cigaret 1.31 | 650 | 508 | 619 | 544 | 35.5 / 26.2 | 400 | 4915 | 151 |
| davidalves.PhoenixOS 1.1 | 650 | 482 | 453 | 884 | 34.2 / 28.8 | 1235 | 1988 | 67 |
| deo.CloudBot 1.3 | 650 | 410 | 563 | 508 | 48.7 / 23.9 | 2202 | 4234 | 3114 |
| dft.Immortal 1.40 | 650 | 505 | 650 | 730 | 32.3 / 28.8 | 192 | 4827 | 534 |
| dmh.robocode.robot.BlackDeath 9.2 | 650 | 455 | 400 | 393 | 55.4 / 16.4 | 3231 | 4663 | 82 |
| dragonbyte.Neutrino 4 | 650 | 415 | 400 | 1808 | 77.7 / 0.2 | 3997 | 6 | 28 |
| drm.Magazine 0.39 | 650 | 557 | 641 | 451 | 39.6 / 23.1 | 1119 | 7416 | 274 |
| dz.GalbaMini 0.121 | 650 | 443 | 641 | 619 | 39.5 / 29.8 | 805 | 4782 | 0 |
| eem.zapper v6.03 | 650 | 496 | 625 | 936 | 34.8 / 29.6 | 322 | 8871 | 8 |
| fromHell.C22H30N2O2S 2.2 | 650 | 364 | 591 | 421 | 46.9 / 27.1 | 2618 | 4422 | 1885 |
| hlavko.micro.Flex 1.5 | 650 | 334 | 422 | 365 | 53.0 / 21.0 | 2577 | 5178 | 239 |
| jk.micro.Cotillion 0.8 | 650 | 531 | 619 | 701 | 31.2 / 30.8 | 172 | 5478 | 2 |
| jk.sheldor.nano.Yatagan 1.2.3 | 650 | 322 | 428 | 400 | 56.8 / 25.7 | 2693 | 4015 | 1561 |
| lazarecki.mega.PinkerStinker 0.7 | 650 | 414 | 569 | 680 | 47.6 / 23.8 | 1494 | 3812 | 62 |
| lj.Dapps 0.2 | 650 | 446 | 588 | 602 | 50.7 / 21.6 | 1418 | 6133 | 1128 |
| nat.Samekh 0.4 | 650 | 491 | 650 | 717 | 32.8 / 30.6 | 174 | 6290 | 1635 |
| nz.jdc.nano.NeophytePRAL 1.4 | 650 | 342 | 475 | 383 | 69.9 / 15.5 | 4461 | 4639 | 1119 |
| origin.SleepSiphon 1.7b | 650 | 482 | 428 | 456 | 58.3 / 13.5 | 3231 | 4523 | 0 |
| pe.SandboxLump 1.52 | 650 | 336 | 491 | 382 | 51.8 / 23.3 | 2476 | 4717 | 0 |
| penguin.Ivy 1.1r | 650 | 538 | 466 | 729 | 54.5 / 14.2 | 1651 | 1828 | 0 |
| penguin.MrFreeze 1.0a | 650 | 533 | 613 | 658 | 52.2 / 15.1 | 1109 | 5178 | 107 |
| pez.mini.VertiLeach 0.4.0 | 650 | 344 | 650 | 12 | 1.4 / 0.7 | 2 | 156 | 0 |
| rampancy.Durandal 2.2d | 650 | 382 | 469 | 462 | 50.6 / 27.6 | 2629 | 3462 | 2155 |
| ry.VirtualGunExperiment 1.2.0 | 650 | 511 | 588 | 695 | 41.0 / 19.1 | 327 | 3805 | 4268 |
| sheldor.micro.EpeeistDC 3.0 | 650 | 529 | 600 | 792 | 36.6 / 28.7 | 412 | 5437 | 1651 |
| sheldor.micro.PointInLineRRAL 1.0 | 650 | 521 | 466 | 760 | 38.4 / 16.0 | 478 | 8516 | 198 |
| sheldor.nano.FoilistNano 3.2 | 650 | 324 | 591 | 418 | 55.7 / 27.7 | 3298 | 4125 | 1214 |
| slugzilla.ButtHead 2.0 | 650 | 159 | 650 | 174 | 110.1 / 73.5 | 2224 | 2122 | 139 |
| slugzilla.RandomGF 1.0 | 650 | 526 | 606 | 595 | 33.4 / 22.0 | 373 | 3339 | 5017 |
| sos.SOS 1.0 | 650 | 381 | 403 | 556 | 55.6 / 13.2 | 2330 | 4784 | 873 |
| stelo.Chord 1.0 | 650 | 468 | 522 | 582 | 39.8 / 21.5 | 1064 | 4356 | 3901 |
| stelo.PastFuture 2.3.2 | 650 | 456 | 641 | 643 | 35.0 / 34.1 | 449 | 2252 | 181 |
| synnalagma.NeuralPremier 0.51 | 650 | 389 | 503 | 488 | 57.4 / 18.8 | 2943 | 4438 | 194 |
| xander.cat.SamAxe 1.1 | 650 | 447 | 459 | 414 | 62.6 / 19.9 | 4235 | 3121 | 88 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 9.7% | 140 | 60 | 3 | 60.6 | 1516 / 1525 (99%) | 0 | 0 |
| alk.lap.LoudAndProud 2.23 | 5.7% | 86 | 85 | 3 | 23.7 | 517 / 518 (100%) | 0 | 0 |
| axeBots.Musashi 2.18 | 7.2% | 102 | 83 | 2 | 50.5 | 1198 / 1199 (100%) | 0 | 0 |
| axeBots.Okami 1.04 | 7.6% | 224 | 4589 | 3 | 49.3 | 1099 / 1102 (100%) | 0 | 0 |
| cjm.Charo 1.1 | 5.5% | 77 | 56 | 3 | 24.9 | 617 / 618 (100%) | 0 | 0 |
| cx.micro.Spark 0.6 | 5.7% | 88 | 60 | 3 | 30.4 | 742 / 742 (100%) | 0 | 0 |
| cx.mini.Cigaret 1.31 | 5.6% | 87 | 64 | 3 | 26.8 | 728 / 730 (100%) | 0 | 0 |
| davidalves.PhoenixOS 1.1 | 6.9% | 99 | 440 | 3 | 47.6 | 1067 / 1068 (100%) | 0 | 0 |
| deo.CloudBot 1.3 | 7.4% | 155 | 89 | 3 | 34.0 | 882 / 882 (100%) | 0 | 0 |
| dft.Immortal 1.40 | 6.5% | 94 | 149 | 3 | 43.1 | 1365 / 1365 (100%) | 0 | 0 |
| dmh.robocode.robot.BlackDeath 9.2 | 5.4% | 93 | 46 | 3 | 24.9 | 601 / 604 (100%) | 0 | 0 |
| dragonbyte.Neutrino 4 | 0.4% | 78 | 53 | 3 | 132.3 | 1615 / 1617 (100%) | 0 | 0 |
| drm.Magazine 0.39 | 5.5% | 83 | 4923 | 3 | 26.3 | 557 / 557 (100%) | 0 | 0 |
| dz.GalbaMini 0.121 | 7.4% | 99 | 478 | 3 | 40.9 | 1007 / 1007 (100%) | 0 | 0 |
| eem.zapper v6.03 | 7.4% | 113 | 163 | 3 | 68.4 | 1976 / 1977 (100%) | 0 | 0 |
| fromHell.C22H30N2O2S 2.2 | 7.7% | 80 | 49 | 3 | 25.8 | 631 / 631 (100%) | 0 | 0 |
| hlavko.micro.Flex 1.5 | 6.9% | 79 | 38 | 3 | 22.3 | 516 / 516 (100%) | 0 | 0 |
| jk.micro.Cotillion 0.8 | 6.9% | 89 | 418 | 3 | 41.7 | 1093 / 1094 (100%) | 0 | 0 |
| jk.sheldor.nano.Yatagan 1.2.3 | 9.5% | 74 | 43 | 3 | 25.8 | 583 / 588 (99%) | 0 | 0 |
| lazarecki.mega.PinkerStinker 0.7 | 7.1% | 133 | 259 | 3 | 38.4 | 871 / 873 (100%) | 0 | 0 |
| lj.Dapps 0.2 | 7.2% | 87 | 440 | 3 | 42.8 | 1026 / 1033 (99%) | 0 | 0 |
| nat.Samekh 0.4 | 7.3% | 102 | 949 | 3 | 46.3 | 1176 / 1183 (99%) | 0 | 0 |
| nz.jdc.nano.NeophytePRAL 1.4 | 9.2% | 82 | 46 | 3 | 26.5 | 573 / 574 (100%) | 0 | 0 |
| origin.SleepSiphon 1.7b | 5.0% | 97 | 141 | 3 | 31.4 | 618 / 618 (100%) | 0 | 0 |
| pe.SandboxLump 1.52 | 7.4% | 98 | 46 | 3 | 21.5 | 524 / 525 (100%) | 0 | 0 |
| penguin.Ivy 1.1r | 5.4% | 92 | 341 | 3 | 24.6 | 616 / 619 (100%) | 0 | 0 |
| penguin.MrFreeze 1.0a | 7.3% | 109 | 675 | 3 | 46.5 | 1293 / 1295 (100%) | 0 | 0 |
| pez.mini.VertiLeach 0.4.0 | 0.2% | 40 | 16 | 3 | 0.7 | 17 / 17 (100%) | 0 | 0 |
| rampancy.Durandal 2.2d | 8.3% | 73 | 2581 | 3 | 27.5 | 577 / 577 (100%) | 0 | 0 |
| ry.VirtualGunExperiment 1.2.0 | 5.7% | 103 | 73 | 3 | 46.6 | 1228 / 1230 (100%) | 0 | 0 |
| sheldor.micro.EpeeistDC 3.0 | 7.3% | 99 | 68 | 3 | 58.6 | 1552 / 1557 (100%) | 0 | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 4.7% | 91 | 57 | 3 | 53.1 | 1147 / 1149 (100%) | 0 | 0 |
| sheldor.nano.FoilistNano 3.2 | 9.5% | 76 | 121 | 3 | 27.8 | 690 / 692 (100%) | 0 | 0 |
| slugzilla.ButtHead 2.0 | 53.0% | 73 | 24 | 3 | 9.7 | 199 / 199 (100%) | 0 | 0 |
| slugzilla.RandomGF 1.0 | 5.3% | 88 | 71 | 3 | 39.8 | 1209 / 1212 (100%) | 0 | 0 |
| sos.SOS 1.0 | 6.0% | 111 | 54 | 3 | 39.1 | 854 / 855 (100%) | 0 | 0 |
| stelo.Chord 1.0 | 5.7% | 72 | 91 | 3 | 38.4 | 1091 / 1097 (99%) | 0 | 0 |
| stelo.PastFuture 2.3.2 | 8.1% | 84 | 356 | 3 | 43.9 | 1131 / 1131 (100%) | 0 | 0 |
| synnalagma.NeuralPremier 0.51 | 6.9% | 81 | 56 | 3 | 28.1 | 767 / 770 (100%) | 0 | 0 |
| xander.cat.SamAxe 1.1 | 8.2% | 78 | 69 | 3 | 26.2 | 583 / 584 (100%) | 0 | 0 |

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
| ags.Glacier 0.3.2 | hadur2.Hadur 3.9sa | 8 | 62.5% ± 16.6 | 77.5% ± 9.7 | +15.0 ± 19.0 | 41.2% ± 5.8 | 50.5% ± 5.6 | +9.3 ± 5.0 |
| ags.Glacier 0.3.2 | hadur2.Hadur 3.9 | 8 | 77.5% ± 18.8 | 77.5% ± 10.7 | -0.0 ± 16.7 | 49.9% ± 10.5 | 51.1% ± 6.2 | +1.2 ± 10.2 |
| alk.lap.LoudAndProud 2.23 | hadur2.Hadur 3.9sa | 8 | 72.5% ± 17.7 | 97.5% ± 3.9 | +25.0 ± 19.0 | 37.1% ± 6.9 | 68.8% ± 4.4 | +31.7 ± 5.1 |
| alk.lap.LoudAndProud 2.23 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 96.3% ± 4.3 | +1.2 ± 8.3 | 56.8% ± 7.2 | 67.4% ± 5.6 | +10.6 ± 8.4 |
| axeBots.Musashi 2.18 | hadur2.Hadur 3.9sa | 8 | 80.0% ± 8.9 | 83.8% ± 9.9 | +3.7 ± 11.8 | 55.2% ± 6.0 | 60.9% ± 2.8 | +5.7 ± 5.0 |
| axeBots.Musashi 2.18 | hadur2.Hadur 3.9 | 8 | 87.5% ± 17.7 | 90.0% ± 7.7 | +2.5 ± 23.1 | 63.7% ± 8.0 | 64.0% ± 7.8 | +0.3 ± 13.3 |
| axeBots.Okami 1.04 | hadur2.Hadur 3.9sa | 8 | 60.0% ± 12.6 | 87.5% ± 7.4 | +27.5 ± 11.6 | 45.7% ± 5.5 | 65.1% ± 3.8 | +19.5 ± 6.1 |
| axeBots.Okami 1.04 | hadur2.Hadur 3.9 | 8 | 80.0% ± 15.5 | 87.5% ± 9.7 | +7.5 ± 20.4 | 58.8% ± 8.6 | 63.9% ± 5.9 | +5.1 ± 13.4 |
| cjm.Charo 1.1 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 88.7% ± 13.6 | 77.6% ± 17.5 | -11.1 ± 18.4 |
| cjm.Charo 1.1 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 94.7% ± 6.9 | +7.2 ± 16.3 | 54.6% ± 6.7 | 59.4% ± 8.2 | +4.8 ± 12.4 |
| cx.micro.Spark 0.6 | hadur2.Hadur 3.9sa | 8 | 90.0% ± 17.9 | 98.8% ± 3.0 | +8.8 ± 18.7 | 55.0% ± 16.4 | 58.7% ± 7.6 | +3.7 ± 13.9 |
| cx.micro.Spark 0.6 | hadur2.Hadur 3.9 | 8 | 92.5% ± 12.4 | 90.0% ± 7.7 | -2.5 ± 18.3 | 67.7% ± 8.9 | 64.8% ± 3.5 | -3.0 ± 10.6 |
| cx.mini.Cigaret 1.31 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 92.2% ± 6.4 | -5.3 ± 4.3 | 65.6% ± 6.6 | 61.7% ± 8.0 | -3.9 ± 8.2 |
| cx.mini.Cigaret 1.31 | hadur2.Hadur 3.9 | 8 | 87.5% ± 15.3 | 88.8% ± 7.0 | +1.3 ± 15.1 | 51.9% ± 10.0 | 56.5% ± 6.5 | +4.6 ± 6.4 |
| davidalves.PhoenixOS 1.1 | hadur2.Hadur 3.9sa | 8 | 62.5% ± 14.0 | 86.3% ± 6.2 | +23.8 ± 18.4 | 37.8% ± 7.9 | 57.4% ± 3.8 | +19.6 ± 9.9 |
| davidalves.PhoenixOS 1.1 | hadur2.Hadur 3.9 | 8 | 67.5% ± 23.5 | 83.8% ± 12.6 | +16.3 ± 26.0 | 46.5% ± 7.2 | 57.7% ± 5.8 | +11.2 ± 10.7 |
| deo.CloudBot 1.3 | hadur2.Hadur 3.9sa | 8 | 97.5% ± 5.9 | 90.0% ± 8.9 | -7.5 ± 12.4 | 49.5% ± 7.9 | 54.3% ± 8.1 | +4.8 ± 8.6 |
| deo.CloudBot 1.3 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 90.0% ± 8.9 | -5.0 ± 7.7 | 67.0% ± 6.6 | 66.4% ± 4.2 | -0.5 ± 6.6 |
| dft.Immortal 1.40 | hadur2.Hadur 3.9sa | 8 | 70.0% ± 17.9 | 88.8% ± 12.2 | +18.7 ± 23.8 | 34.0% ± 4.7 | 54.1% ± 6.9 | +20.1 ± 9.6 |
| dft.Immortal 1.40 | hadur2.Hadur 3.9 | 8 | 75.0% ± 14.8 | 90.8% ± 10.2 | +15.8 ± 21.2 | 45.3% ± 6.4 | 50.3% ± 8.8 | +5.0 ± 14.1 |
| dmh.robocode.robot.BlackDeath 9.2 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 62.0% ± 15.6 | 68.2% ± 9.0 | +6.2 ± 20.7 |
| dmh.robocode.robot.BlackDeath 9.2 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 69.2% ± 8.7 | 81.5% ± 5.6 | +12.3 ± 11.6 |
| dragonbyte.Neutrino 4 | hadur2.Hadur 3.9sa | 8 | 52.5% ± 17.7 | 71.1% ± 11.7 | +18.6 ± 18.7 | 98.0% ± 1.5 | 98.9% ± 0.2 | +0.9 ± 1.5 |
| dragonbyte.Neutrino 4 | hadur2.Hadur 3.9 | 8 | 45.0% ± 14.8 | 63.6% ± 11.5 | +18.6 ± 12.1 | 99.9% ± 0.1 | 99.8% ± 0.1 | -0.1 ± 0.1 |
| drm.Magazine 0.39 | hadur2.Hadur 3.9sa | 8 | 80.0% ± 15.5 | 93.6% ± 4.4 | +13.6 ± 16.0 | 45.6% ± 14.4 | 56.0% ± 7.3 | +10.4 ± 15.4 |
| drm.Magazine 0.39 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 95.0% ± 4.5 | +5.0 ± 10.0 | 55.9% ± 7.2 | 62.7% ± 5.7 | +6.9 ± 9.3 |
| dz.GalbaMini 0.121 | hadur2.Hadur 3.9sa | 8 | 62.5% ± 20.8 | 91.3% ± 5.4 | +28.8 ± 21.6 | 42.6% ± 5.9 | 60.0% ± 7.5 | +17.4 ± 9.9 |
| dz.GalbaMini 0.121 | hadur2.Hadur 3.9 | 8 | 87.5% ± 8.7 | 86.3% ± 9.9 | -1.3 ± 15.8 | 61.3% ± 6.9 | 56.3% ± 6.5 | -5.0 ± 7.8 |
| eem.zapper v6.03 | hadur2.Hadur 3.9sa | 8 | 80.0% ± 8.9 | 83.9% ± 10.2 | +3.9 ± 12.0 | 42.3% ± 5.5 | 50.4% ± 8.7 | +8.1 ± 8.9 |
| eem.zapper v6.03 | hadur2.Hadur 3.9 | 8 | 87.5% ± 8.7 | 82.9% ± 9.4 | -4.6 ± 12.6 | 57.0% ± 6.1 | 51.4% ± 4.7 | -5.6 ± 6.9 |
| fromHell.C22H30N2O2S 2.2 | hadur2.Hadur 3.9sa | 8 | 90.0% ± 8.9 | 96.1% ± 6.3 | +6.1 ± 7.6 | 25.1% ± 21.5 | 41.8% ± 9.3 | +16.7 ± 26.9 |
| fromHell.C22H30N2O2S 2.2 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 91.3% ± 7.0 | +1.2 ± 8.3 | 61.1% ± 6.7 | 63.4% ± 4.0 | +2.3 ± 8.4 |
| hlavko.micro.Flex 1.5 | hadur2.Hadur 3.9sa | 8 | 87.5% ± 8.7 | 90.0% ± 10.9 | +2.5 ± 15.3 | 45.3% ± 9.1 | 67.6% ± 7.8 | +22.3 ± 12.4 |
| hlavko.micro.Flex 1.5 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 92.5% ± 5.9 | -7.5 ± 5.9 | 72.2% ± 4.2 | 69.6% ± 3.4 | -2.6 ± 4.6 |
| jk.micro.Cotillion 0.8 | hadur2.Hadur 3.9sa | 8 | 87.5% ± 12.4 | 94.7% ± 6.9 | +7.2 ± 11.4 | 49.9% ± 11.8 | 52.1% ± 10.3 | +2.2 ± 11.5 |
| jk.micro.Cotillion 0.8 | hadur2.Hadur 3.9 | 8 | 85.0% ± 7.7 | 84.6% ± 9.5 | -0.4 ± 8.2 | 56.1% ± 5.5 | 48.4% ± 10.4 | -7.8 ± 10.5 |
| jk.sheldor.nano.Yatagan 1.2.3 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 83.8% ± 8.9 | -16.2 ± 8.9 | 68.2% ± 4.0 | 62.5% ± 6.0 | -5.6 ± 7.1 |
| jk.sheldor.nano.Yatagan 1.2.3 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 81.9% ± 4.4 | 68.4% ± 2.9 | -13.5 ± 6.3 |
| lazarecki.mega.PinkerStinker 0.7 | hadur2.Hadur 3.9sa | 8 | 62.5% ± 18.8 | 90.0% ± 6.3 | +27.5 ± 20.8 | 41.5% ± 4.5 | 66.1% ± 3.8 | +24.6 ± 6.0 |
| lazarecki.mega.PinkerStinker 0.7 | hadur2.Hadur 3.9 | 8 | 80.0% ± 12.6 | 92.5% ± 7.4 | +12.5 ± 16.0 | 58.7% ± 7.7 | 68.7% ± 3.7 | +10.0 ± 10.3 |
| lj.Dapps 0.2 | hadur2.Hadur 3.9sa | 8 | 82.5% ± 16.6 | 96.3% ± 4.3 | +13.7 ± 17.8 | 50.1% ± 6.3 | 73.6% ± 6.7 | +23.5 ± 8.4 |
| lj.Dapps 0.2 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 96.1% ± 4.5 | -1.4 ± 5.1 | 66.8% ± 5.7 | 71.4% ± 4.0 | +4.6 ± 6.3 |
| nat.Samekh 0.4 | hadur2.Hadur 3.9sa | 8 | 77.5% ± 18.8 | 83.6% ± 7.6 | +6.1 ± 19.9 | 40.4% ± 10.2 | 49.9% ± 7.5 | +9.5 ± 10.3 |
| nat.Samekh 0.4 | hadur2.Hadur 3.9 | 8 | 77.5% ± 10.7 | 79.7% ± 11.0 | +2.2 ± 10.8 | 47.1% ± 6.8 | 49.0% ± 7.1 | +1.9 ± 5.7 |
| nz.jdc.nano.NeophytePRAL 1.4 | hadur2.Hadur 3.9sa | 8 | 90.0% ± 8.9 | 98.8% ± 3.0 | +8.7 ± 8.3 | 65.9% ± 3.5 | 81.6% ± 3.9 | +15.7 ± 3.2 |
| nz.jdc.nano.NeophytePRAL 1.4 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 78.7% ± 2.7 | 81.0% ± 2.4 | +2.3 ± 2.5 |
| origin.SleepSiphon 1.7b | hadur2.Hadur 3.9sa | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 60.5% ± 17.8 | 73.4% ± 15.8 | +12.9 ± 27.9 |
| origin.SleepSiphon 1.7b | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 77.8% ± 6.1 | 85.6% ± 3.3 | +7.8 ± 6.4 |
| pe.SandboxLump 1.52 | hadur2.Hadur 3.9sa | 8 | 90.0% ± 17.9 | 92.5% ± 3.9 | +2.5 ± 17.2 | 56.8% ± 15.0 | 70.6% ± 3.1 | +13.8 ± 13.8 |
| pe.SandboxLump 1.52 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 95.0% ± 8.9 | +5.0 ± 17.9 | 61.3% ± 9.7 | 73.0% ± 5.6 | +11.7 ± 13.3 |
| penguin.Ivy 1.1r | hadur2.Hadur 3.9sa | 8 | 82.5% ± 18.8 | 92.5% ± 9.7 | +10.0 ± 23.2 | 55.4% ± 11.0 | 78.1% ± 12.4 | +22.7 ± 13.7 |
| penguin.Ivy 1.1r | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 92.5% ± 5.9 | -7.5 ± 5.9 | 84.5% ± 4.4 | 75.0% ± 5.0 | -9.5 ± 6.4 |
| penguin.MrFreeze 1.0a | hadur2.Hadur 3.9sa | 8 | 62.5% ± 10.7 | 92.5% ± 7.4 | +30.0 ± 13.4 | 34.3% ± 9.9 | 72.6% ± 3.6 | +38.2 ± 8.6 |
| penguin.MrFreeze 1.0a | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 95.0% ± 7.7 | -5.0 ± 7.7 | 75.2% ± 4.7 | 77.1% ± 5.5 | +1.8 ± 7.5 |
| pez.mini.VertiLeach 0.4.0 | hadur2.Hadur 3.9sa | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 100.0% ± 0.0 | - | n/a |
| pez.mini.VertiLeach 0.4.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 100.0% ± 0.0 | - | n/a |
| rampancy.Durandal 2.2d | hadur2.Hadur 3.9sa | 8 | 80.0% ± 15.5 | 89.4% ± 9.7 | +9.4 ± 22.4 | 48.8% ± 5.9 | 63.6% ± 4.9 | +14.8 ± 5.0 |
| rampancy.Durandal 2.2d | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 84.7% ± 6.5 | -2.8 ± 16.2 | 66.3% ± 7.4 | 65.4% ± 7.9 | -0.8 ± 12.9 |
| ry.VirtualGunExperiment 1.2.0 | hadur2.Hadur 3.9sa | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 54.1% ± 19.6 | 76.6% ± 8.2 | +22.1 ± 20.0 |
| ry.VirtualGunExperiment 1.2.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 92.5% ± 5.9 | -2.5 ± 10.7 | 73.7% ± 5.4 | 66.6% ± 5.3 | -7.1 ± 6.1 |
| sheldor.micro.EpeeistDC 3.0 | hadur2.Hadur 3.9sa | 8 | 85.0% ± 11.8 | 89.7% ± 6.7 | +4.7 ± 13.5 | 51.9% ± 5.6 | 55.9% ± 5.8 | +4.0 ± 8.5 |
| sheldor.micro.EpeeistDC 3.0 | hadur2.Hadur 3.9 | 8 | 87.5% ± 8.7 | 85.0% ± 10.0 | -2.5 ± 12.4 | 58.7% ± 7.3 | 53.7% ± 5.8 | -5.0 ± 9.4 |
| sheldor.micro.PointInLineRRAL 1.0 | hadur2.Hadur 3.9sa | 8 | 92.5% ± 8.7 | 98.8% ± 3.0 | +6.2 ± 9.9 | 58.0% ± 8.3 | 71.6% ± 4.7 | +13.6 ± 6.3 |
| sheldor.micro.PointInLineRRAL 1.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 7.4 | 73.1% ± 3.2 | 70.3% ± 4.2 | -2.8 ± 4.1 |
| sheldor.nano.FoilistNano 3.2 | hadur2.Hadur 3.9sa | 8 | 77.5% ± 10.7 | 88.6% ± 7.0 | +11.1 ± 14.5 | 38.5% ± 8.9 | 66.0% ± 2.8 | +27.5 ± 10.1 |
| sheldor.nano.FoilistNano 3.2 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 89.9% ± 6.3 | -5.1 ± 7.8 | 64.4% ± 3.6 | 67.8% ± 3.6 | +3.3 ± 5.2 |
| slugzilla.ButtHead 2.0 | hadur2.Hadur 3.9sa | 8 | 90.0% ± 12.6 | 96.2% ± 6.2 | +6.3 ± 13.4 | 57.3% ± 3.4 | 58.1% ± 2.0 | +0.8 ± 4.8 |
| slugzilla.ButtHead 2.0 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 97.5% ± 3.9 | +7.5 ± 9.7 | 62.7% ± 3.0 | 57.6% ± 1.1 | -5.1 ± 2.7 |
| slugzilla.RandomGF 1.0 | hadur2.Hadur 3.9sa | 8 | 95.0% ± 7.7 | 98.8% ± 3.0 | +3.7 ± 6.2 | 40.3% ± 24.5 | 48.4% ± 22.8 | +8.0 ± 38.0 |
| slugzilla.RandomGF 1.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 3.9 | 53.9% ± 5.3 | 61.2% ± 6.6 | +7.3 ± 7.6 |
| sos.SOS 1.0 | hadur2.Hadur 3.9sa | 8 | 92.5% ± 8.7 | 98.8% ± 3.0 | +6.2 ± 9.9 | 59.1% ± 9.3 | 75.9% ± 7.0 | +16.8 ± 10.2 |
| sos.SOS 1.0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 100.0% ± 0.0 | +7.5 ± 8.7 | 77.4% ± 2.4 | 81.0% ± 2.8 | +3.7 ± 4.0 |
| stelo.Chord 1.0 | hadur2.Hadur 3.9sa | 8 | 95.0% ± 7.7 | 98.8% ± 3.0 | +3.7 ± 8.9 | 41.5% ± 21.4 | 64.7% ± 13.1 | +21.5 ± 21.8 |
| stelo.Chord 1.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 89.7% ± 6.3 | -5.3 ± 9.9 | 70.6% ± 7.6 | 59.1% ± 3.5 | -11.5 ± 6.4 |
| stelo.PastFuture 2.3.2 | hadur2.Hadur 3.9sa | 8 | 70.0% ± 20.0 | 89.7% ± 6.7 | +19.7 ± 22.3 | 49.8% ± 8.9 | 53.0% ± 5.2 | +3.3 ± 9.9 |
| stelo.PastFuture 2.3.2 | hadur2.Hadur 3.9 | 8 | 75.0% ± 14.8 | 81.9% ± 4.2 | +6.9 ± 13.2 | 47.0% ± 6.0 | 49.9% ± 2.9 | +2.8 ± 5.9 |
| synnalagma.NeuralPremier 0.51 | hadur2.Hadur 3.9sa | 8 | 80.0% ± 12.6 | 94.7% ± 6.9 | +14.7 ± 17.2 | 58.4% ± 6.4 | 76.2% ± 5.2 | +17.8 ± 10.8 |
| synnalagma.NeuralPremier 0.51 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 100.0% ± 0.0 | +7.5 ± 8.7 | 69.3% ± 3.5 | 79.4% ± 2.3 | +10.1 ± 4.8 |
| xander.cat.SamAxe 1.1 | hadur2.Hadur 3.9sa | 8 | 82.5% ± 14.0 | 98.8% ± 3.0 | +16.2 ± 14.1 | 59.1% ± 7.4 | 80.2% ± 3.1 | +21.1 ± 9.3 |
| xander.cat.SamAxe 1.1 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 95.0% ± 6.3 | -2.5 ± 7.4 | 75.1% ± 4.7 | 75.6% ± 3.4 | +0.4 ± 4.1 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| ags.Glacier 0.3.2 | -15.0 ± 34.3 | +0.0 ± 16.1 | -8.6 ± 14.6 | -0.6 ± 7.6 |
| alk.lap.LoudAndProud 2.23 | -22.5 ± 20.8 | +1.2 ± 7.0 | -19.7 ± 9.4 | +1.4 ± 8.6 |
| axeBots.Musashi 2.18 | -7.5 ± 19.9 | -6.3 ± 12.6 | -8.5 ± 11.8 | -3.1 ± 8.5 |
| axeBots.Okami 1.04 | -20.0 ± 17.9 | +0.0 ± 14.8 | -13.1 ± 6.9 | +1.3 ± 8.3 |
| cjm.Charo 1.1 | +10.0 ± 12.6 | +5.3 ± 6.9 | +34.1 ± 18.3 | +18.2 ± 13.9 |
| cx.micro.Spark 0.6 | -2.5 ± 20.8 | +8.7 ± 7.0 | -12.8 ± 17.5 | -6.1 ± 9.8 |
| cx.mini.Cigaret 1.31 | +10.0 ± 17.9 | +3.5 ± 4.6 | +13.7 ± 15.7 | +5.2 ± 8.0 |
| davidalves.PhoenixOS 1.1 | -5.0 ± 27.9 | +2.5 ± 12.4 | -8.7 ± 8.5 | -0.3 ± 7.6 |
| deo.CloudBot 1.3 | +2.5 ± 10.7 | +0.0 ± 0.0 | -17.5 ± 12.8 | -12.1 ± 8.5 |
| dft.Immortal 1.40 | -5.0 ± 17.3 | -2.1 ± 17.2 | -11.3 ± 6.6 | +3.8 ± 9.3 |
| dmh.robocode.robot.BlackDeath 9.2 | +2.5 ± 5.9 | +1.2 ± 3.0 | -7.2 ± 23.1 | -13.3 ± 14.0 |
| dragonbyte.Neutrino 4 | +7.5 ± 26.7 | +7.5 ± 16.6 | -1.9 ± 1.5 | -1.0 ± 0.3 |
| drm.Magazine 0.39 | -10.0 ± 17.9 | -1.4 ± 7.0 | -10.3 ± 19.5 | -6.7 ± 10.2 |
| dz.GalbaMini 0.121 | -25.0 ± 21.4 | +5.0 ± 13.4 | -18.7 ± 10.1 | +3.7 ± 12.4 |
| eem.zapper v6.03 | -7.5 ± 12.4 | +1.0 ± 9.0 | -14.7 ± 9.1 | -1.0 ± 11.2 |
| fromHell.C22H30N2O2S 2.2 | +0.0 ± 15.5 | +4.9 ± 12.0 | -36.0 ± 25.8 | -21.7 ± 8.3 |
| hlavko.micro.Flex 1.5 | -12.5 ± 8.7 | -2.5 ± 8.7 | -26.9 ± 8.7 | -2.0 ± 8.6 |
| jk.micro.Cotillion 0.8 | +2.5 ± 14.0 | +10.1 ± 9.8 | -6.3 ± 13.0 | +3.7 ± 16.6 |
| jk.sheldor.nano.Yatagan 1.2.3 | +0.0 ± 0.0 | -16.2 ± 8.9 | -13.7 ± 4.5 | -5.9 ± 5.4 |
| lazarecki.mega.PinkerStinker 0.7 | -17.5 ± 18.8 | -2.5 ± 7.4 | -17.2 ± 8.6 | -2.6 ± 4.9 |
| lj.Dapps 0.2 | -15.0 ± 17.3 | +0.1 ± 6.3 | -16.7 ± 9.0 | +2.2 ± 7.2 |
| nat.Samekh 0.4 | -0.0 ± 25.3 | +3.9 ± 13.3 | -6.7 ± 14.2 | +0.9 ± 11.6 |
| nz.jdc.nano.NeophytePRAL 1.4 | -10.0 ± 8.9 | -1.2 ± 3.0 | -12.8 ± 3.6 | +0.6 ± 4.3 |
| origin.SleepSiphon 1.7b | +0.0 ± 8.9 | +0.0 ± 0.0 | -17.3 ± 14.9 | -12.2 ± 14.5 |
| pe.SandboxLump 1.52 | +0.0 ± 12.6 | -2.5 ± 11.6 | -4.5 ± 18.7 | -2.4 ± 6.9 |
| penguin.Ivy 1.1r | -17.5 ± 18.8 | -0.0 ± 11.8 | -29.1 ± 12.5 | +3.1 ± 12.2 |
| penguin.MrFreeze 1.0a | -37.5 ± 10.7 | -2.5 ± 9.7 | -40.9 ± 12.2 | -4.5 ± 4.8 |
| pez.mini.VertiLeach 0.4.0 | -2.5 ± 10.7 | +0.0 ± 0.0 | +0.0 ± 0.0 | n/a |
| rampancy.Durandal 2.2d | -7.5 ± 19.9 | +4.7 ± 13.2 | -17.5 ± 10.5 | -1.8 ± 10.0 |
| ry.VirtualGunExperiment 1.2.0 | +5.0 ± 7.7 | +7.5 ± 5.9 | -19.1 ± 20.7 | +10.0 ± 9.6 |
| sheldor.micro.EpeeistDC 3.0 | -2.5 ± 14.0 | +4.7 ± 15.1 | -6.8 ± 8.9 | +2.2 ± 10.0 |
| sheldor.micro.PointInLineRRAL 1.0 | -2.5 ± 5.9 | +1.2 ± 3.0 | -15.1 ± 9.0 | +1.4 ± 7.1 |
| sheldor.nano.FoilistNano 3.2 | -17.5 ± 10.7 | -1.3 ± 9.5 | -26.0 ± 8.3 | -1.8 ± 4.5 |
| slugzilla.ButtHead 2.0 | -0.0 ± 17.9 | -1.2 ± 5.4 | -5.4 ± 4.6 | +0.5 ± 2.2 |
| slugzilla.RandomGF 1.0 | +0.0 ± 12.6 | +1.2 ± 5.4 | -13.6 ± 22.3 | -12.8 ± 19.4 |
| sos.SOS 1.0 | +0.0 ± 8.9 | -1.2 ± 3.0 | -18.3 ± 8.7 | -5.1 ± 6.7 |
| stelo.Chord 1.0 | +0.0 ± 12.6 | +9.0 ± 8.3 | -30.6 ± 17.3 | +5.5 ± 13.0 |
| stelo.PastFuture 2.3.2 | -5.0 ± 26.4 | +7.8 ± 9.5 | +2.7 ± 8.1 | +3.1 ± 6.6 |
| synnalagma.NeuralPremier 0.51 | -12.5 ± 12.4 | -5.3 ± 6.9 | -10.9 ± 6.2 | -3.2 ± 5.4 |
| xander.cat.SamAxe 1.1 | -15.0 ± 17.3 | +3.7 ± 7.7 | -16.0 ± 8.3 | +4.6 ± 5.5 |
