# Bench: jd.Nullstride 2.3.3 (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 14750 over 320 battles (46.1 per battle, most in one battle 1123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | mid | 77.7% ± 2.4 | 92.1% ± 3.1 | 62.5% ± 2.8 | 258 / 280 | - | - | 223 | - | 1.40 / 35.3 |
| alk.lap.LoudAndProud 2.23 | mid | 87.9% ± 2.5 | 99.3% ± 1.1 | 73.1% ± 4.8 | 278 / 280 | - | - | 102 | - | 1.28 / 33.0 |
| axeBots.Musashi 2.18 | mid | 80.4% ± 2.1 | 91.4% ± 3.1 | 65.2% ± 2.0 | 256 / 280 | - | - | 163 | - | 1.18 / 37.3 |
| axeBots.Okami 1.04 | mid | 80.8% ± 3.2 | 93.2% ± 4.6 | 67.7% ± 2.3 | 261 / 280 | - | - | 2621 | - | 1.87 / 14.9 |
| cjm.Charo 1.1 | mid | 99.9% ± 0.2 | 100.0% ± 0.0 | 43.8% ± 14.8 | 280 / 280 | - | - | 0 | - | 0.14 / 8.8 |
| cx.micro.Spark 0.6 | mid | 89.5% ± 4.0 | 96.1% ± 2.2 | 25.1% ± 19.0 | 269 / 280 | - | - | 53 | - | 0.81 / 68.0 |
| cx.mini.Cigaret 1.31 | mid | 75.8% ± 2.7 | 86.4% ± 3.1 | 60.9% ± 3.4 | 242 / 280 | - | - | 253 | - | 2.02 / 71.2 |
| davidalves.PhoenixOS 1.1 | mid | 81.3% ± 2.2 | 95.7% ± 2.6 | 64.0% ± 2.6 | 268 / 280 | - | - | 260 | - | 1.16 / 35.1 |
| deo.CloudBot 1.3 | mid | 95.8% ± 0.8 | 100.0% ± 0.0 | 92.3% ± 1.4 | 280 / 280 | - | - | 27 | - | 0.80 / 28.4 |
| dft.Immortal 1.40 | mid | 83.0% ± 1.9 | 97.5% ± 0.8 | 65.0% ± 2.7 | 273 / 280 | - | - | 88 | - | 1.08 / 38.9 |
| dmh.robocode.robot.BlackDeath 9.2 | mid | 98.3% ± 0.9 | 100.0% ± 0.0 | 29.6% ± 13.1 | 280 / 280 | - | - | 1 | - | 0.23 / 8.9 |
| dragonbyte.Neutrino 4 | mid | 99.3% ± 0.6 | 98.2% ± 1.8 | 99.9% ± 0.1 | 275 / 280 | - | - | 6523 | - | 1.61 / 56.3 |
| drm.Magazine 0.39 | mid | 84.6% ± 2.0 | 95.4% ± 2.5 | 71.6% ± 1.8 | 267 / 280 | - | - | 119 | - | 1.27 / 40.1 |
| dz.GalbaMini 0.121 | mid | 79.7% ± 2.5 | 94.3% ± 2.9 | 63.9% ± 2.3 | 264 / 280 | - | - | 206 | - | 1.12 / 35.6 |
| eem.zapper v6.03 | mid | 80.3% ± 3.3 | 96.1% ± 2.5 | 62.0% ± 4.6 | 269 / 280 | - | - | 141 | - | 1.73 / 59.8 |
| fromHell.C22H30N2O2S 2.2 | mid | 98.6% ± 1.4 | 100.0% ± 0.0 | 26.9% ± 17.9 | 280 / 280 | - | - | 0 | - | 0.16 / 7.6 |
| hlavko.micro.Flex 1.5 | mid | 87.6% ± 2.1 | 97.1% ± 1.8 | 77.3% ± 3.0 | 272 / 280 | - | - | 55 | - | 0.97 / 36.6 |
| jk.micro.Cotillion 0.8 | mid | 82.1% ± 1.7 | 95.4% ± 1.8 | 64.9% ± 3.6 | 267 / 280 | - | - | 83 | - | 1.14 / 63.1 |
| jk.sheldor.nano.Yatagan 1.2.3 | mid | 94.0% ± 4.5 | 99.3% ± 1.1 | 23.4% ± 14.1 | 278 / 280 | - | - | 1 | - | 0.76 / 235.1 |
| lazarecki.mega.PinkerStinker 0.7 | mid | 85.0% ± 1.8 | 96.8% ± 1.5 | 72.2% ± 2.1 | 271 / 280 | - | - | 365 | - | 1.18 / 31.1 |
| lj.Dapps 0.2 | mid | 87.0% ± 2.1 | 97.9% ± 1.7 | 75.5% ± 2.7 | 274 / 280 | - | - | 154 | - | 1.03 / 33.8 |
| nat.Samekh 0.4 | mid | 78.3% ± 2.7 | 95.0% ± 3.6 | 57.8% ± 3.5 | 266 / 280 | - | - | 84 | - | 1.03 / 55.0 |
| nz.jdc.nano.NeophytePRAL 1.4 | mid | 95.4% ± 2.8 | 99.3% ± 1.1 | 28.9% ± 12.8 | 278 / 280 | - | - | 0 | - | 0.15 / 15.6 |
| origin.SleepSiphon 1.7b | mid | 100.0% ± 0.0 | 100.0% ± 0.0 | 56.3% ± 14.8 | 280 / 280 | - | - | 0 | - | 0.26 / 178.5 |
| pe.SandboxLump 1.52 | mid | 87.9% ± 1.8 | 98.6% ± 1.3 | 77.1% ± 2.5 | 276 / 280 | - | - | 82 | - | 0.98 / 57.8 |
| penguin.Ivy 1.1r | mid | 89.0% ± 1.6 | 94.6% ± 2.0 | 82.7% ± 1.9 | 265 / 280 | - | - | 1451 | - | 1.49 / 44.3 |
| penguin.MrFreeze 1.0a | mid | 86.8% ± 1.7 | 97.1% ± 2.6 | 75.0% ± 2.0 | 272 / 280 | - | - | 834 | - | 1.33 / 45.2 |
| pez.mini.VertiLeach 0.4.0 | mid | 99.2% ± 0.7 | 100.0% ± 0.0 | 80.8% ± 13.1 | 280 / 280 | - | - | 21 | - | 0.61 / 315.6 |
| rampancy.Durandal 2.2d | mid | 92.4% ± 2.8 | 98.9% ± 1.2 | 86.6% ± 4.6 | 277 / 280 | - | - | 27 | - | 0.98 / 38.8 |
| ry.VirtualGunExperiment 1.2.0 | mid | 99.1% ± 0.5 | 100.0% ± 0.0 | 0.0% ± 0.0 | 280 / 280 | - | - | 0 | - | 0.18 / 84.1 |
| sheldor.micro.EpeeistDC 3.0 | mid | 81.5% ± 2.4 | 95.7% ± 2.6 | 64.2% ± 2.8 | 268 / 280 | - | - | 271 | - | 1.37 / 38.3 |
| sheldor.micro.PointInLineRRAL 1.0 | mid | 91.2% ± 1.4 | 99.6% ± 0.8 | 79.3% ± 3.1 | 279 / 280 | - | - | 189 | - | 1.06 / 43.2 |
| sheldor.nano.FoilistNano 3.2 | mid | 92.2% ± 1.1 | 100.0% ± 0.0 | 83.3% ± 2.3 | 280 / 280 | - | - | 30 | - | 0.89 / 64.0 |
| slugzilla.ButtHead 2.0 | mid | 96.1% ± 5.1 | 98.9% ± 1.8 | 10.3% ± 23.1 | 277 / 280 | - | - | 3 | - | 0.33 / 8.5 |
| slugzilla.RandomGF 1.0 | mid | 100.0% ± 0.0 | 100.0% ± 0.0 | 50.0% ± 0.0 | 280 / 280 | - | - | 0 | - | 0.18 / 38.9 |
| sos.SOS 1.0 | mid | 96.5% ± 1.2 | 98.9% ± 1.8 | 94.2% ± 1.7 | 277 / 280 | - | - | 44 | - | 0.88 / 42.3 |
| stelo.Chord 1.0 | mid | 96.4% ± 1.0 | 100.0% ± 0.0 | 93.1% ± 2.0 | 280 / 280 | - | - | 25 | - | 0.98 / 33.2 |
| stelo.PastFuture 2.3.2 | mid | 78.4% ± 3.3 | 93.2% ± 3.6 | 61.8% ± 3.1 | 261 / 280 | - | - | 151 | - | 1.28 / 122.0 |
| synnalagma.NeuralPremier 0.51 | mid | 91.7% ± 1.4 | 100.0% ± 0.0 | 83.8% ± 2.6 | 280 / 280 | - | - | 64 | - | 1.00 / 30.5 |
| xander.cat.SamAxe 1.1 | mid | 94.5% ± 0.9 | 100.0% ± 0.0 | 89.4% ± 1.7 | 280 / 280 | - | - | 36 | - | 1.05 / 31.9 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 8 | 1041 | 13.2% | 81.4% | 0.0% | 5.3% | 874 |
| alk.lap.LoudAndProud 2.23 | 8 | 512 | 2.4% | 96.4% | 0.0% | 1.1% | 575 |
| axeBots.Musashi 2.18 | 8 | 784 | 19.1% | 72.9% | 0.0% | 7.9% | 1119 |
| axeBots.Okami 1.04 | 8 | 895 | 13.3% | 81.5% | 0.0% | 5.3% | 1058 |
| cjm.Charo 1.1 | 8 | 2 | 0.0% | 100.0% | 0.0% | 0.0% | 1144 |
| cx.micro.Spark 0.6 | 8 | 276 | 24.9% | 67.0% | 0.0% | 8.1% | 1190 |
| cx.mini.Cigaret 1.31 | 8 | 952 | 24.9% | 64.9% | 0.4% | 9.8% | 691 |
| davidalves.PhoenixOS 1.1 | 8 | 824 | 9.1% | 86.8% | 0.0% | 4.0% | 984 |
| deo.CloudBot 1.3 | 8 | 246 | 0.0% | 99.9% | 0.1% | 0.0% | 327 |
| dft.Immortal 1.40 | 8 | 723 | 6.1% | 91.3% | 0.1% | 2.6% | 797 |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 37 | 0.0% | 95.2% | 4.8% | 0.0% | 1193 |
| dragonbyte.Neutrino 4 | 8 | 41 | 76.0% | 8.5% | 0.3% | 15.2% | 2847 |
| drm.Magazine 0.39 | 8 | 665 | 12.2% | 82.4% | 0.0% | 5.4% | 576 |
| dz.GalbaMini 0.121 | 8 | 935 | 10.7% | 85.1% | 0.0% | 4.2% | 742 |
| eem.zapper v6.03 | 8 | 860 | 8.0% | 88.6% | 0.0% | 3.4% | 1029 |
| fromHell.C22H30N2O2S 2.2 | 8 | 31 | 0.0% | 100.0% | 0.0% | 0.0% | 779 |
| hlavko.micro.Flex 1.5 | 8 | 580 | 8.6% | 87.5% | 0.1% | 3.8% | 525 |
| jk.micro.Cotillion 0.8 | 8 | 743 | 10.9% | 84.7% | 0.0% | 4.3% | 770 |
| jk.sheldor.nano.Yatagan 1.2.3 | 8 | 163 | 7.7% | 73.8% | 13.9% | 4.6% | 815 |
| lazarecki.mega.PinkerStinker 0.7 | 8 | 724 | 7.8% | 89.3% | 0.0% | 2.9% | 860 |
| lj.Dapps 0.2 | 8 | 622 | 6.0% | 91.4% | 0.0% | 2.5% | 734 |
| nat.Samekh 0.4 | 8 | 911 | 9.6% | 86.5% | 0.0% | 3.9% | 856 |
| nz.jdc.nano.NeophytePRAL 1.4 | 8 | 104 | 12.0% | 80.2% | 0.0% | 7.8% | 882 |
| origin.SleepSiphon 1.7b | 8 | - | - | - | - | - | 1915 |
| pe.SandboxLump 1.52 | 8 | 598 | 4.2% | 94.0% | 0.0% | 1.9% | 507 |
| penguin.Ivy 1.1r | 8 | 533 | 17.6% | 76.3% | 0.0% | 6.1% | 932 |
| penguin.MrFreeze 1.0a | 8 | 596 | 8.4% | 88.1% | 0.0% | 3.5% | 954 |
| pez.mini.VertiLeach 0.4.0 | 8 | 17 | 0.0% | 100.0% | 0.0% | 0.0% | 162 |
| rampancy.Durandal 2.2d | 8 | 421 | 4.5% | 93.7% | 0.0% | 1.8% | 399 |
| ry.VirtualGunExperiment 1.2.0 | 8 | 19 | 0.0% | 100.0% | 0.0% | 0.0% | 1115 |
| sheldor.micro.EpeeistDC 3.0 | 8 | 796 | 9.4% | 87.1% | 0.0% | 3.5% | 930 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 359 | 1.7% | 97.7% | 0.0% | 0.6% | 917 |
| sheldor.nano.FoilistNano 3.2 | 8 | 367 | 0.0% | 100.0% | 0.0% | 0.0% | 538 |
| slugzilla.ButtHead 2.0 | 8 | 106 | 17.7% | 37.9% | 33.3% | 11.0% | 773 |
| slugzilla.RandomGF 1.0 | 8 | - | - | - | - | - | 908 |
| sos.SOS 1.0 | 8 | 194 | 9.7% | 87.8% | 0.3% | 2.3% | 352 |
| stelo.Chord 1.0 | 8 | 205 | 0.0% | 100.0% | 0.0% | 0.0% | 343 |
| stelo.PastFuture 2.3.2 | 8 | 966 | 12.3% | 82.6% | 0.0% | 5.1% | 744 |
| synnalagma.NeuralPremier 0.51 | 8 | 434 | 0.0% | 100.0% | 0.0% | 0.0% | 575 |
| xander.cat.SamAxe 1.1 | 8 | 301 | 0.0% | 100.0% | 0.0% | 0.0% | 438 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 8 | 8 | n/a | 0 | 0.80 | 0 | 0 | 0 |
| alk.lap.LoudAndProud 2.23 | 8 | 8 | n/a | 0 | 0.36 | 0 | 0 | 0 |
| axeBots.Musashi 2.18 | 8 | 8 | n/a | 0 | 0.58 | 0 | 0 | 0 |
| axeBots.Okami 1.04 | 8 | 0 | n/a | 0 | 9.36 | 0 | 0 | 0 |
| cjm.Charo 1.1 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| cx.micro.Spark 0.6 | 8 | 8 | n/a | 0 | 0.19 | 0 | 0 | 0 |
| cx.mini.Cigaret 1.31 | 8 | 8 | n/a | 0 | 0.90 | 0 | 0 | 0 |
| davidalves.PhoenixOS 1.1 | 8 | 8 | n/a | 0 | 0.93 | 0 | 0 | 0 |
| deo.CloudBot 1.3 | 8 | 8 | n/a | 0 | 0.10 | 0 | 0 | 0 |
| dft.Immortal 1.40 | 8 | 8 | n/a | 0 | 0.31 | 0 | 0 | 0 |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| dragonbyte.Neutrino 4 | 8 | 0 | n/a | 0 | 23.30 | 0 | 0 | 0 |
| drm.Magazine 0.39 | 8 | 8 | n/a | 0 | 0.43 | 0 | 0 | 0 |
| dz.GalbaMini 0.121 | 8 | 8 | n/a | 0 | 0.74 | 0 | 0 | 0 |
| eem.zapper v6.03 | 8 | 8 | n/a | 0 | 0.50 | 0 | 0 | 0 |
| fromHell.C22H30N2O2S 2.2 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| hlavko.micro.Flex 1.5 | 8 | 8 | n/a | 0 | 0.20 | 0 | 0 | 0 |
| jk.micro.Cotillion 0.8 | 8 | 8 | n/a | 0 | 0.30 | 0 | 0 | 0 |
| jk.sheldor.nano.Yatagan 1.2.3 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| lazarecki.mega.PinkerStinker 0.7 | 8 | 8 | n/a | 0 | 1.30 | 0 | 0 | 0 |
| lj.Dapps 0.2 | 8 | 8 | n/a | 0 | 0.55 | 0 | 0 | 0 |
| nat.Samekh 0.4 | 8 | 8 | n/a | 0 | 0.30 | 0 | 0 | 0 |
| nz.jdc.nano.NeophytePRAL 1.4 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| origin.SleepSiphon 1.7b | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| pe.SandboxLump 1.52 | 8 | 8 | n/a | 0 | 0.29 | 0 | 0 | 0 |
| penguin.Ivy 1.1r | 8 | 0 | n/a | 0 | 5.18 | 0 | 0 | 0 |
| penguin.MrFreeze 1.0a | 8 | 0 | n/a | 0 | 2.98 | 0 | 0 | 0 |
| pez.mini.VertiLeach 0.4.0 | 8 | 8 | n/a | 0 | 0.08 | 0 | 0 | 8 |
| rampancy.Durandal 2.2d | 8 | 8 | n/a | 0 | 0.10 | 0 | 0 | 0 |
| ry.VirtualGunExperiment 1.2.0 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| sheldor.micro.EpeeistDC 3.0 | 8 | 7 | n/a | 0 | 0.97 | 0 | 0 | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 8 | n/a | 0 | 0.68 | 0 | 0 | 0 |
| sheldor.nano.FoilistNano 3.2 | 8 | 8 | n/a | 0 | 0.11 | 0 | 0 | 0 |
| slugzilla.ButtHead 2.0 | 8 | 8 | n/a | 0 | 0.01 | 0 | 0 | 0 |
| slugzilla.RandomGF 1.0 | 8 | 8 | n/a | 0 | 0.00 | 0 | 0 | 0 |
| sos.SOS 1.0 | 8 | 8 | n/a | 0 | 0.16 | 0 | 0 | 0 |
| stelo.Chord 1.0 | 8 | 8 | n/a | 0 | 0.09 | 0 | 0 | 0 |
| stelo.PastFuture 2.3.2 | 8 | 8 | n/a | 0 | 0.54 | 0 | 0 | 0 |
| synnalagma.NeuralPremier 0.51 | 8 | 8 | n/a | 0 | 0.23 | 0 | 0 | 0 |
| xander.cat.SamAxe 1.1 | 8 | 8 | n/a | 0 | 0.13 | 0 | 0 | 0 |

287 of 320 battles trusted.

## Paired A/B: jd.Nullstride 2.3.3 vs hadur2.Hadur 3.9

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ags.Glacier 0.3.2 | 77.7% ± 2.4 | 63.2% ± 1.7 | +14.5 ± 2.6 |
| alk.lap.LoudAndProud 2.23 | 87.9% ± 2.5 | 80.2% ± 2.6 | +7.7 ± 4.0 |
| axeBots.Musashi 2.18 | 80.4% ± 2.1 | 77.4% ± 4.0 | +3.0 ± 5.1 |
| axeBots.Okami 1.04 | 80.8% ± 3.2 | 74.8% ± 2.5 | +6.0 ± 2.5 |
| cjm.Charo 1.1 | 99.9% ± 0.2 | 77.1% ± 3.3 | +22.8 ± 3.3 |
| cx.micro.Spark 0.6 | 89.5% ± 4.0 | 79.8% ± 1.7 | +9.7 ± 4.3 |
| cx.mini.Cigaret 1.31 | 75.8% ± 2.7 | 72.9% ± 5.4 | +2.9 ± 7.3 |
| davidalves.PhoenixOS 1.1 | 81.3% ± 2.2 | 68.9% ± 4.9 | +12.4 ± 6.1 |
| deo.CloudBot 1.3 | 95.8% ± 0.8 | 80.6% ± 3.5 | +15.2 ± 3.7 |
| dft.Immortal 1.40 | 83.0% ± 1.9 | 72.6% ± 2.2 | +10.4 ± 2.0 |
| dmh.robocode.robot.BlackDeath 9.2 | 98.3% ± 0.9 | 87.3% ± 2.0 | +11.0 ± 2.6 |
| dragonbyte.Neutrino 4 | 99.3% ± 0.6 | 82.6% ± 3.6 | +16.7 ± 3.6 |
| drm.Magazine 0.39 | 84.6% ± 2.0 | 79.1% ± 3.5 | +5.5 ± 5.2 |
| dz.GalbaMini 0.121 | 79.7% ± 2.5 | 70.8% ± 4.6 | +8.9 ± 6.3 |
| eem.zapper v6.03 | 80.3% ± 3.3 | 70.5% ± 3.8 | +9.8 ± 5.7 |
| fromHell.C22H30N2O2S 2.2 | 98.6% ± 1.4 | 76.8% ± 3.7 | +21.8 ± 4.1 |
| hlavko.micro.Flex 1.5 | 87.6% ± 2.1 | 81.2% ± 3.6 | +6.5 ± 3.7 |
| jk.micro.Cotillion 0.8 | 82.1% ± 1.7 | 65.7% ± 5.9 | +16.5 ± 5.4 |
| jk.sheldor.nano.Yatagan 1.2.3 | 94.0% ± 4.5 | 78.6% ± 2.7 | +15.4 ± 4.9 |
| lazarecki.mega.PinkerStinker 0.7 | 85.0% ± 1.8 | 74.4% ± 4.6 | +10.5 ± 5.6 |
| lj.Dapps 0.2 | 87.0% ± 2.1 | 80.6% ± 2.1 | +6.4 ± 2.9 |
| nat.Samekh 0.4 | 78.3% ± 2.7 | 65.0% ± 5.7 | +13.3 ± 6.3 |
| nz.jdc.nano.NeophytePRAL 1.4 | 95.4% ± 2.8 | 89.5% ± 1.0 | +5.9 ± 3.0 |
| origin.SleepSiphon 1.7b | 100.0% ± 0.0 | 92.2% ± 1.8 | +7.8 ± 1.8 |
| pe.SandboxLump 1.52 | 87.9% ± 1.8 | 81.0% ± 4.5 | +6.9 ± 4.3 |
| penguin.Ivy 1.1r | 89.0% ± 1.6 | 87.4% ± 3.3 | +1.7 ± 3.5 |
| penguin.MrFreeze 1.0a | 86.8% ± 1.7 | 87.2% ± 2.4 | -0.4 ± 3.2 |
| pez.mini.VertiLeach 0.4.0 | 99.2% ± 0.7 | 99.3% ± 0.3 | -0.1 ± 0.7 |
| rampancy.Durandal 2.2d | 92.4% ± 2.8 | 77.4% ± 2.2 | +15.0 ± 3.7 |
| ry.VirtualGunExperiment 1.2.0 | 99.1% ± 0.5 | 83.2% ± 2.7 | +15.9 ± 2.6 |
| sheldor.micro.EpeeistDC 3.0 | 81.5% ± 2.4 | 71.6% ± 3.5 | +9.9 ± 2.6 |
| sheldor.micro.PointInLineRRAL 1.0 | 91.2% ± 1.4 | 85.9% ± 2.5 | +5.3 ± 2.5 |
| sheldor.nano.FoilistNano 3.2 | 92.2% ± 1.1 | 74.0% ± 3.5 | +18.2 ± 3.9 |
| slugzilla.ButtHead 2.0 | 96.1% ± 5.1 | 69.2% ± 2.3 | +26.9 ± 6.6 |
| slugzilla.RandomGF 1.0 | 100.0% ± 0.0 | 78.2% ± 3.5 | +21.8 ± 3.5 |
| sos.SOS 1.0 | 96.5% ± 1.2 | 89.5% ± 2.8 | +7.1 ± 3.4 |
| stelo.Chord 1.0 | 96.4% ± 1.0 | 79.9% ± 4.8 | +16.5 ± 4.7 |
| stelo.PastFuture 2.3.2 | 78.4% ± 3.3 | 63.1% ± 3.6 | +15.2 ± 5.6 |
| synnalagma.NeuralPremier 0.51 | 91.7% ± 1.4 | 84.2% ± 1.6 | +7.5 ± 2.6 |
| xander.cat.SamAxe 1.1 | 94.5% ± 0.9 | 84.7% ± 3.4 | +9.8 ± 3.4 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| ags.Glacier 0.3.2 | +14.5 ± 2.6 | +15.0 ± 2.5 | +15.0 ± 2.5 | +11.7 ± 3.3 |
| alk.lap.LoudAndProud 2.23 | +7.7 ± 4.0 | +4.3 ± 3.4 | +4.3 ± 3.4 | +8.4 ± 4.9 |
| axeBots.Musashi 2.18 | +3.0 ± 5.1 | +1.4 ± 5.3 | +1.4 ± 5.3 | -0.2 ± 4.9 |
| axeBots.Okami 1.04 | +6.0 ± 2.5 | +6.8 ± 3.4 | +6.8 ± 3.4 | +3.6 ± 3.4 |
| cjm.Charo 1.1 | +22.8 ± 3.3 | +5.7 ± 2.8 | +5.7 ± 2.9 | -15.4 ± 14.6 |
| cx.micro.Spark 0.6 | +9.7 ± 4.3 | +3.9 ± 1.8 | +3.9 ± 1.8 | -41.4 ± 17.1 |
| cx.mini.Cigaret 1.31 | +2.9 ± 7.3 | -1.4 ± 7.8 | -1.4 ± 7.8 | +3.9 ± 7.0 |
| davidalves.PhoenixOS 1.1 | +12.4 ± 6.1 | +12.9 ± 7.3 | +12.9 ± 7.3 | +9.2 ± 5.0 |
| deo.CloudBot 1.3 | +15.2 ± 3.7 | +7.5 ± 3.4 | +7.5 ± 3.4 | +23.4 ± 4.5 |
| dft.Immortal 1.40 | +10.4 ± 2.0 | +7.9 ± 3.1 | +7.9 ± 3.1 | +10.2 ± 4.0 |
| dmh.robocode.robot.BlackDeath 9.2 | +11.0 ± 2.6 | +1.4 ± 1.8 | +1.4 ± 1.8 | -46.6 ± 13.4 |
| dragonbyte.Neutrino 4 | +16.7 ± 3.6 | +40.1 ± 8.1 | +40.0 ± 8.1 | +0.1 ± 0.1 |
| drm.Magazine 0.39 | +5.5 ± 5.2 | +1.8 ± 4.6 | +1.8 ± 4.6 | +7.2 ± 5.5 |
| dz.GalbaMini 0.121 | +8.9 ± 6.3 | +8.9 ± 7.0 | +8.9 ± 7.0 | +6.7 ± 4.9 |
| eem.zapper v6.03 | +9.8 ± 5.7 | +9.7 ± 5.7 | +9.6 ± 5.7 | +8.1 ± 6.7 |
| fromHell.C22H30N2O2S 2.2 | +21.8 ± 4.1 | +9.6 ± 4.2 | +9.6 ± 4.2 | -37.2 ± 18.0 |
| hlavko.micro.Flex 1.5 | +6.5 ± 3.7 | +5.4 ± 3.5 | +5.4 ± 3.5 | +6.4 ± 4.9 |
| jk.micro.Cotillion 0.8 | +16.5 ± 5.4 | +15.7 ± 7.0 | +15.7 ± 7.0 | +12.8 ± 6.3 |
| jk.sheldor.nano.Yatagan 1.2.3 | +15.4 ± 4.9 | +10.4 ± 3.6 | +10.4 ± 3.6 | -45.8 ± 13.4 |
| lazarecki.mega.PinkerStinker 0.7 | +10.5 ± 5.6 | +10.7 ± 6.4 | +10.7 ± 6.4 | +8.8 ± 4.9 |
| lj.Dapps 0.2 | +6.4 ± 2.9 | +3.6 ± 2.8 | +3.6 ± 2.8 | +8.1 ± 3.4 |
| nat.Samekh 0.4 | +13.3 ± 6.3 | +14.3 ± 7.7 | +14.3 ± 7.7 | +8.8 ± 5.6 |
| nz.jdc.nano.NeophytePRAL 1.4 | +5.9 ± 3.0 | -0.4 ± 1.5 | -0.4 ± 1.5 | -51.8 ± 13.0 |
| origin.SleepSiphon 1.7b | +7.8 ± 1.8 | +0.7 ± 1.7 | +0.7 ± 1.7 | -28.7 ± 15.5 |
| pe.SandboxLump 1.52 | +6.9 ± 4.3 | +4.6 ± 5.6 | +4.6 ± 5.6 | +7.8 ± 3.9 |
| penguin.Ivy 1.1r | +1.7 ± 3.5 | +0.0 ± 4.6 | +0.0 ± 4.6 | +2.9 ± 2.8 |
| penguin.MrFreeze 1.0a | -0.4 ± 3.2 | +1.1 ± 4.9 | +1.1 ± 4.9 | -2.8 ± 2.9 |
| pez.mini.VertiLeach 0.4.0 | -0.1 ± 0.7 | +0.0 ± 0.0 | +0.0 ± 0.0 | +5.4 ± 18.1 |
| rampancy.Durandal 2.2d | +15.0 ± 3.7 | +10.0 ± 4.0 | +10.0 ± 4.0 | +20.1 ± 5.0 |
| ry.VirtualGunExperiment 1.2.0 | +15.9 ± 2.6 | +4.6 ± 2.5 | +4.6 ± 2.5 | -69.4 ± 3.3 |
| sheldor.micro.EpeeistDC 3.0 | +9.9 ± 2.6 | +8.9 ± 5.3 | +8.9 ± 5.3 | +8.0 ± 2.2 |
| sheldor.micro.PointInLineRRAL 1.0 | +5.3 ± 2.5 | +1.4 ± 2.2 | +1.4 ± 2.2 | +8.6 ± 6.3 |
| sheldor.nano.FoilistNano 3.2 | +18.2 ± 3.9 | +14.6 ± 5.5 | +14.6 ± 5.5 | +19.2 ± 3.3 |
| slugzilla.ButtHead 2.0 | +26.9 ± 6.6 | +3.6 ± 4.0 | +3.6 ± 4.0 | -49.9 ± 22.4 |
| slugzilla.RandomGF 1.0 | +21.8 ± 3.5 | +6.1 ± 3.7 | +6.1 ± 3.7 | -8.9 ± 3.3 |
| sos.SOS 1.0 | +7.1 ± 3.4 | +2.1 ± 4.6 | +2.1 ± 4.6 | +12.7 ± 4.3 |
| stelo.Chord 1.0 | +16.5 ± 4.7 | +5.7 ± 5.3 | +5.7 ± 5.3 | +28.5 ± 3.9 |
| stelo.PastFuture 2.3.2 | +15.2 ± 5.6 | +16.8 ± 6.7 | +16.8 ± 6.7 | +10.8 ± 4.8 |
| synnalagma.NeuralPremier 0.51 | +7.5 ± 2.6 | +7.5 ± 2.8 | +7.5 ± 2.8 | +7.5 ± 3.9 |
| xander.cat.SamAxe 1.1 | +9.8 ± 3.4 | +5.4 ± 4.7 | +5.4 ± 4.7 | +13.7 ± 3.4 |
| All pairs | +11.0 ± 0.9 | +7.2 ± 1.0 | +7.2 ± 1.0 | -2.9 ± 2.8 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or, for a Hadur build, a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| ags.Glacier 0.3.2 | 8 | 7 | +14.5 ± 2.6 | +14.4 ± 3.1 |
| alk.lap.LoudAndProud 2.23 | 8 | 7 | +7.7 ± 4.0 | +6.7 ± 3.8 |
| axeBots.Musashi 2.18 | 8 | 8 | +3.0 ± 5.1 | +3.0 ± 5.1 |
| axeBots.Okami 1.04 | 8 | 0 | +6.0 ± 2.5 | n/a |
| cjm.Charo 1.1 | 8 | 8 | +22.8 ± 3.3 | +22.8 ± 3.3 |
| cx.micro.Spark 0.6 | 8 | 3 | +9.7 ± 4.3 | +5.4 ± 15.5 |
| cx.mini.Cigaret 1.31 | 8 | 7 | +2.9 ± 7.3 | +4.6 ± 7.4 |
| davidalves.PhoenixOS 1.1 | 8 | 5 | +12.4 ± 6.1 | +13.7 ± 10.9 |
| deo.CloudBot 1.3 | 8 | 8 | +15.2 ± 3.7 | +15.2 ± 3.7 |
| dft.Immortal 1.40 | 8 | 6 | +10.4 ± 2.0 | +9.9 ± 2.8 |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 8 | +11.0 ± 2.6 | +11.0 ± 2.6 |
| dragonbyte.Neutrino 4 | 8 | 0 | +16.7 ± 3.6 | n/a |
| drm.Magazine 0.39 | 8 | 7 | +5.5 ± 5.2 | +6.7 ± 5.1 |
| dz.GalbaMini 0.121 | 8 | 6 | +8.9 ± 6.3 | +8.0 ± 9.0 |
| eem.zapper v6.03 | 8 | 7 | +9.8 ± 5.7 | +8.2 ± 5.2 |
| fromHell.C22H30N2O2S 2.2 | 8 | 5 | +21.8 ± 4.1 | +22.6 ± 5.0 |
| hlavko.micro.Flex 1.5 | 8 | 6 | +6.5 ± 3.7 | +5.5 ± 5.0 |
| jk.micro.Cotillion 0.8 | 8 | 6 | +16.5 ± 5.4 | +13.9 ± 5.2 |
| jk.sheldor.nano.Yatagan 1.2.3 | 8 | 5 | +15.4 ± 4.9 | +13.2 ± 7.9 |
| lazarecki.mega.PinkerStinker 0.7 | 8 | 7 | +10.5 ± 5.6 | +8.4 ± 3.3 |
| lj.Dapps 0.2 | 8 | 8 | +6.4 ± 2.9 | +6.4 ± 2.9 |
| nat.Samekh 0.4 | 8 | 5 | +13.3 ± 6.3 | +11.9 ± 5.7 |
| nz.jdc.nano.NeophytePRAL 1.4 | 8 | 8 | +5.9 ± 3.0 | +5.9 ± 3.0 |
| origin.SleepSiphon 1.7b | 8 | 8 | +7.8 ± 1.8 | +7.8 ± 1.8 |
| pe.SandboxLump 1.52 | 8 | 6 | +6.9 ± 4.3 | +6.1 ± 5.9 |
| penguin.Ivy 1.1r | 8 | 0 | +1.7 ± 3.5 | n/a |
| penguin.MrFreeze 1.0a | 8 | 0 | -0.4 ± 3.2 | n/a |
| pez.mini.VertiLeach 0.4.0 | 8 | 8 | -0.1 ± 0.7 | -0.1 ± 0.7 |
| rampancy.Durandal 2.2d | 8 | 5 | +15.0 ± 3.7 | +14.0 ± 4.0 |
| ry.VirtualGunExperiment 1.2.0 | 8 | 6 | +15.9 ± 2.6 | +14.3 ± 1.1 |
| sheldor.micro.EpeeistDC 3.0 | 8 | 4 | +9.9 ± 2.6 | +8.6 ± 5.9 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 8 | +5.3 ± 2.5 | +5.3 ± 2.5 |
| sheldor.nano.FoilistNano 3.2 | 8 | 7 | +18.2 ± 3.9 | +17.8 ± 4.5 |
| slugzilla.ButtHead 2.0 | 8 | 8 | +26.9 ± 6.6 | +26.9 ± 6.6 |
| slugzilla.RandomGF 1.0 | 8 | 8 | +21.8 ± 3.5 | +21.8 ± 3.5 |
| sos.SOS 1.0 | 8 | 5 | +7.1 ± 3.4 | +6.5 ± 5.5 |
| stelo.Chord 1.0 | 8 | 6 | +16.5 ± 4.7 | +15.1 ± 5.9 |
| stelo.PastFuture 2.3.2 | 8 | 5 | +15.2 ± 5.6 | +13.7 ± 10.4 |
| synnalagma.NeuralPremier 0.51 | 8 | 6 | +7.5 ± 2.6 | +6.8 ± 2.9 |
| xander.cat.SamAxe 1.1 | 8 | 8 | +9.8 ± 3.4 | +9.8 ± 3.4 |
| All pairs | 320 | 235 | +11.0 ± 0.9 | +10.9 ± 1.0 |

# Bench: jd.Nullstride 2.3.3 baseline (hadur2.Hadur 3.9) (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 3866 over 320 battles (12.1 per battle, most in one battle 72). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | mid | 63.2% ± 1.7 | 77.1% ± 2.6 | 50.7% ± 1.8 | 216 / 280 | 12.5% ± 0.4 | 9.3% ± 0.5 | 127 | 0 | 1.39 / 15.2 |
| alk.lap.LoudAndProud 2.23 | mid | 80.2% ± 2.6 | 95.0% ± 3.3 | 64.8% ± 2.3 | 266 / 280 | 15.5% ± 1.0 | 5.6% ± 0.3 | 94 | 0 | 1.19 / 11.4 |
| axeBots.Musashi 2.18 | mid | 77.4% ± 4.0 | 90.0% ± 4.4 | 65.4% ± 3.6 | 252 / 280 | 14.6% ± 0.7 | 7.3% ± 0.6 | 106 | 0 | 1.13 / 19.0 |
| axeBots.Okami 1.04 | mid | 74.8% ± 2.5 | 86.4% ± 3.8 | 64.1% ± 2.5 | 242 / 280 | 13.6% ± 1.0 | 7.9% ± 1.0 | 203 | 0 | 1.36 / 42.5 |
| cjm.Charo 1.1 | mid | 77.1% ± 3.3 | 94.3% ± 2.8 | 59.1% ± 4.3 | 264 / 280 | 14.2% ± 0.9 | 5.9% ± 0.5 | 79 | 0 | 0.87 / 17.7 |
| cx.micro.Spark 0.6 | mid | 79.8% ± 1.7 | 92.1% ± 3.1 | 66.5% ± 2.4 | 258 / 280 | 14.1% ± 0.6 | 6.0% ± 0.7 | 86 | 0 | 1.06 / 15.8 |
| cx.mini.Cigaret 1.31 | mid | 72.9% ± 5.4 | 87.9% ± 6.1 | 57.0% ± 4.0 | 246 / 280 | 12.7% ± 1.1 | 5.8% ± 0.8 | 105 | 0 | 2.18 / 19.1 |
| davidalves.PhoenixOS 1.1 | mid | 68.9% ± 4.9 | 82.9% ± 6.1 | 54.8% ± 3.6 | 232 / 280 | 12.8% ± 0.6 | 7.2% ± 0.4 | 79 | 0 | 0.95 / 16.4 |
| deo.CloudBot 1.3 | mid | 80.6% ± 3.5 | 92.5% ± 3.4 | 68.9% ± 3.9 | 259 / 280 | 17.4% ± 1.1 | 7.1% ± 0.9 | 94 | 0 | 0.93 / 27.6 |
| dft.Immortal 1.40 | mid | 72.6% ± 2.2 | 89.6% ± 3.6 | 54.8% ± 2.1 | 251 / 280 | 11.4% ± 0.4 | 6.5% ± 0.4 | 108 | 0 | 1.01 / 17.9 |
| dmh.robocode.robot.BlackDeath 9.2 | mid | 87.3% ± 2.0 | 98.6% ± 1.8 | 76.2% ± 2.6 | 276 / 280 | 18.8% ± 0.9 | 5.9% ± 0.6 | 101 | 0 | 0.98 / 10.1 |
| dragonbyte.Neutrino 4 | mid | 82.6% ± 3.6 | 58.1% ± 7.8 | 99.8% ± 0.1 | 163 / 280 | 15.0% ± 0.3 | 0.4% ± 0.2 | 69 | 0 | 0.68 / 24.5 |
| drm.Magazine 0.39 | mid | 79.1% ± 3.5 | 93.6% ± 3.3 | 64.4% ± 4.5 | 262 / 280 | 15.6% ± 0.8 | 5.7% ± 0.6 | 101 | 0 | 1.20 / 203.7 |
| dz.GalbaMini 0.121 | mid | 70.8% ± 4.6 | 85.4% ± 5.0 | 57.2% ± 4.2 | 239 / 280 | 13.6% ± 1.1 | 7.8% ± 0.4 | 93 | 0 | 0.94 / 18.2 |
| eem.zapper v6.03 | mid | 70.5% ± 3.8 | 86.4% ± 3.7 | 53.8% ± 4.3 | 242 / 280 | 11.5% ± 0.5 | 7.8% ± 0.5 | 144 | 0 | 1.94 / 19.3 |
| fromHell.C22H30N2O2S 2.2 | mid | 76.8% ± 3.7 | 90.4% ± 4.2 | 64.1% ± 2.9 | 253 / 280 | 16.5% ± 0.8 | 7.6% ± 1.2 | 131 | 0 | 0.85 / 14.6 |
| hlavko.micro.Flex 1.5 | mid | 81.2% ± 3.6 | 91.8% ± 3.9 | 70.9% ± 4.0 | 257 / 280 | 21.7% ± 1.8 | 7.0% ± 1.1 | 73 | 0 | 0.85 / 14.1 |
| jk.micro.Cotillion 0.8 | mid | 65.7% ± 5.9 | 79.6% ± 8.0 | 52.1% ± 3.9 | 223 / 280 | 12.3% ± 1.0 | 7.5% ± 1.0 | 74 | 0 | 1.17 / 137.8 |
| jk.sheldor.nano.Yatagan 1.2.3 | mid | 78.6% ± 2.7 | 88.9% ± 3.7 | 69.2% ± 2.1 | 249 / 280 | 21.3% ± 1.3 | 8.9% ± 1.0 | 66 | 0 | 0.85 / 40.2 |
| lazarecki.mega.PinkerStinker 0.7 | mid | 74.4% ± 4.6 | 86.1% ± 5.5 | 63.4% ± 4.0 | 241 / 280 | 14.4% ± 0.8 | 7.7% ± 0.6 | 120 | 0 | 0.97 / 17.8 |
| lj.Dapps 0.2 | mid | 80.6% ± 2.1 | 94.3% ± 2.6 | 67.5% ± 2.2 | 264 / 280 | 14.9% ± 1.2 | 7.5% ± 0.6 | 100 | 0 | 0.96 / 41.9 |
| nat.Samekh 0.4 | mid | 65.0% ± 5.7 | 80.7% ± 7.0 | 49.0% ± 4.8 | 226 / 280 | 10.8% ± 0.5 | 7.3% ± 0.7 | 117 | 0 | 1.13 / 35.6 |
| nz.jdc.nano.NeophytePRAL 1.4 | mid | 89.5% ± 1.0 | 99.6% ± 0.8 | 80.7% ± 1.5 | 279 / 280 | 20.5% ± 1.2 | 9.9% ± 0.8 | 87 | 0 | 0.82 / 91.7 |
| origin.SleepSiphon 1.7b | mid | 92.2% ± 1.8 | 99.3% ± 1.7 | 84.9% ± 2.2 | 278 / 280 | 19.4% ± 0.5 | 4.1% ± 0.4 | 93 | 0 | 0.93 / 16.3 |
| pe.SandboxLump 1.52 | mid | 81.0% ± 4.5 | 93.9% ± 5.2 | 69.2% ± 4.4 | 263 / 280 | 19.1% ± 1.0 | 8.0% ± 1.7 | 106 | 0 | 0.88 / 14.1 |
| penguin.Ivy 1.1r | mid | 87.4% ± 3.3 | 94.6% ± 3.7 | 79.8% ± 3.1 | 265 / 280 | 15.1% ± 0.2 | 5.7% ± 0.6 | 93 | 0 | 0.89 / 26.4 |
| penguin.MrFreeze 1.0a | mid | 87.2% ± 2.4 | 96.1% ± 2.8 | 77.8% ± 2.7 | 269 / 280 | 14.3% ± 0.6 | 7.6% ± 0.8 | 106 | 0 | 1.06 / 289.9 |
| pez.mini.VertiLeach 0.4.0 | mid | 99.3% ± 0.3 | 100.0% ± 0.0 | 75.4% ± 11.6 | 280 / 280 | 0.5% ± 0.2 | 0.2% ± 0.1 | 45 | 0 | 0.55 / 231.0 |
| rampancy.Durandal 2.2d | mid | 77.4% ± 2.2 | 88.9% ± 3.5 | 66.5% ± 1.3 | 249 / 280 | 17.7% ± 0.8 | 7.6% ± 0.5 | 93 | 0 | 0.87 / 10.8 |
| ry.VirtualGunExperiment 1.2.0 | mid | 83.2% ± 2.7 | 95.4% ± 2.5 | 69.4% ± 3.3 | 267 / 280 | 12.2% ± 0.5 | 5.4% ± 0.6 | 98 | 0 | 1.02 / 124.3 |
| sheldor.micro.EpeeistDC 3.0 | mid | 71.6% ± 3.5 | 86.8% ± 5.3 | 56.2% ± 2.4 | 243 / 280 | 12.3% ± 0.4 | 6.9% ± 0.5 | 108 | 0 | 1.29 / 50.7 |
| sheldor.micro.PointInLineRRAL 1.0 | mid | 85.9% ± 2.5 | 98.2% ± 1.8 | 70.7% ± 5.5 | 275 / 280 | 12.3% ± 0.7 | 4.7% ± 0.6 | 86 | 0 | 0.90 / 28.0 |
| sheldor.nano.FoilistNano 3.2 | mid | 74.0% ± 3.5 | 85.4% ± 5.5 | 64.1% ± 1.9 | 239 / 280 | 17.5% ± 1.1 | 10.0% ± 0.8 | 80 | 0 | 0.98 / 14.4 |
| slugzilla.ButtHead 2.0 | mid | 69.2% ± 2.3 | 95.4% ± 2.8 | 60.3% ± 1.4 | 267 / 280 | 71.7% ± 2.9 | 53.4% ± 3.2 | 84 | 0 | 0.57 / 26.4 |
| slugzilla.RandomGF 1.0 | mid | 78.2% ± 3.5 | 93.9% ± 3.7 | 58.9% ± 3.3 | 263 / 280 | 11.0% ± 0.5 | 5.0% ± 0.4 | 94 | 0 | 0.93 / 87.0 |
| sos.SOS 1.0 | mid | 89.5% ± 2.8 | 96.8% ± 3.5 | 81.5% ± 3.6 | 271 / 280 | 17.0% ± 1.3 | 7.3% ± 4.2 | 89 | 0 | 0.79 / 141.8 |
| stelo.Chord 1.0 | mid | 79.9% ± 4.8 | 94.3% ± 5.3 | 64.6% ± 4.4 | 264 / 280 | 13.5% ± 1.2 | 6.0% ± 0.7 | 88 | 0 | 0.96 / 86.2 |
| stelo.PastFuture 2.3.2 | mid | 63.1% ± 3.6 | 76.4% ± 5.1 | 50.9% ± 2.2 | 214 / 280 | 12.4% ± 0.8 | 8.4% ± 0.6 | 85 | 0 | 1.24 / 16.7 |
| synnalagma.NeuralPremier 0.51 | mid | 84.2% ± 1.6 | 92.5% ± 2.8 | 76.3% ± 1.8 | 259 / 280 | 18.3% ± 0.8 | 6.6% ± 0.6 | 81 | 0 | 0.79 / 14.3 |
| xander.cat.SamAxe 1.1 | mid | 84.7% ± 3.4 | 94.6% ± 4.7 | 75.7% ± 2.7 | 265 / 280 | 20.4% ± 0.4 | 8.2% ± 0.8 | 80 | 0 | 0.99 / 185.1 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 8 | 1822 | 22.0% | 68.3% | 0.0% | 9.7% | 961 |
| alk.lap.LoudAndProud 2.23 | 8 | 922 | 9.5% | 86.0% | 0.0% | 4.5% | 570 |
| axeBots.Musashi 2.18 | 8 | 1108 | 15.8% | 77.7% | 0.0% | 6.5% | 1024 |
| axeBots.Okami 1.04 | 8 | 1244 | 19.1% | 72.9% | 0.0% | 8.0% | 1009 |
| cjm.Charo 1.1 | 8 | 1052 | 9.5% | 86.3% | 0.0% | 4.2% | 623 |
| cx.micro.Spark 0.6 | 8 | 925 | 14.9% | 78.6% | 0.0% | 6.6% | 663 |
| cx.mini.Cigaret 1.31 | 8 | 1225 | 17.3% | 74.1% | 0.1% | 8.5% | 680 |
| davidalves.PhoenixOS 1.1 | 8 | 1441 | 20.8% | 70.8% | 0.0% | 8.4% | 1027 |
| deo.CloudBot 1.3 | 8 | 963 | 13.6% | 80.9% | 0.4% | 5.1% | 647 |
| dft.Immortal 1.40 | 8 | 1236 | 14.7% | 79.3% | 0.0% | 6.1% | 861 |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 640 | 3.9% | 94.5% | 0.1% | 1.6% | 555 |
| dragonbyte.Neutrino 4 | 8 | 884 | 82.8% | 0.7% | 0.0% | 16.6% | 1979 |
| drm.Magazine 0.39 | 8 | 989 | 11.4% | 83.3% | 0.1% | 5.2% | 583 |
| dz.GalbaMini 0.121 | 8 | 1430 | 17.9% | 74.3% | 0.0% | 7.8% | 754 |
| eem.zapper v6.03 | 8 | 1346 | 17.6% | 75.5% | 0.0% | 6.9% | 1155 |
| fromHell.C22H30N2O2S 2.2 | 8 | 1184 | 14.3% | 79.4% | 0.0% | 6.3% | 569 |
| hlavko.micro.Flex 1.5 | 8 | 949 | 15.1% | 78.8% | 0.0% | 6.1% | 532 |
| jk.micro.Cotillion 0.8 | 8 | 1639 | 21.7% | 68.8% | 0.0% | 9.5% | 806 |
| jk.sheldor.nano.Yatagan 1.2.3 | 8 | 1144 | 16.9% | 76.0% | 0.1% | 7.0% | 549 |
| lazarecki.mega.PinkerStinker 0.7 | 8 | 1274 | 19.1% | 72.7% | 0.0% | 8.1% | 858 |
| lj.Dapps 0.2 | 8 | 972 | 10.3% | 85.2% | 0.0% | 4.5% | 783 |
| nat.Samekh 0.4 | 8 | 1583 | 21.3% | 69.6% | 0.0% | 9.1% | 883 |
| nz.jdc.nano.NeophytePRAL 1.4 | 8 | 594 | 1.1% | 98.6% | 0.0% | 0.3% | 545 |
| origin.SleepSiphon 1.7b | 8 | 389 | 3.2% | 95.2% | 0.0% | 1.5% | 580 |
| pe.SandboxLump 1.52 | 8 | 1000 | 10.6% | 84.6% | 0.0% | 4.7% | 520 |
| penguin.Ivy 1.1r | 8 | 628 | 14.9% | 79.0% | 0.0% | 6.1% | 864 |
| penguin.MrFreeze 1.0a | 8 | 617 | 11.1% | 84.4% | 0.0% | 4.4% | 814 |
| pez.mini.VertiLeach 0.4.0 | 8 | 15 | 0.0% | 100.0% | 0.0% | 0.0% | 162 |
| rampancy.Durandal 2.2d | 8 | 1145 | 16.9% | 76.2% | 0.0% | 6.9% | 613 |
| ry.VirtualGunExperiment 1.2.0 | 8 | 756 | 10.7% | 85.0% | 0.0% | 4.2% | 844 |
| sheldor.micro.EpeeistDC 3.0 | 8 | 1317 | 17.6% | 74.9% | 0.0% | 7.5% | 956 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 614 | 5.1% | 92.8% | 0.0% | 2.2% | 886 |
| sheldor.nano.FoilistNano 3.2 | 8 | 1407 | 18.2% | 74.3% | 0.0% | 7.5% | 585 |
| slugzilla.ButtHead 2.0 | 8 | 2984 | 2.7% | 82.8% | 12.4% | 2.0% | 318 |
| slugzilla.RandomGF 1.0 | 8 | 915 | 11.6% | 83.4% | 0.0% | 5.0% | 759 |
| sos.SOS 1.0 | 8 | 508 | 11.1% | 85.0% | 0.5% | 3.5% | 699 |
| stelo.Chord 1.0 | 8 | 929 | 10.8% | 84.6% | 0.0% | 4.6% | 725 |
| stelo.PastFuture 2.3.2 | 8 | 1799 | 22.9% | 67.0% | 0.3% | 9.8% | 795 |
| synnalagma.NeuralPremier 0.51 | 8 | 819 | 16.0% | 77.6% | 0.0% | 6.4% | 619 |
| xander.cat.SamAxe 1.1 | 8 | 827 | 11.3% | 84.3% | 0.0% | 4.4% | 574 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 8 | 7 | 298 | 0 | 0.45 | 0 | 0 | 0 |
| alk.lap.LoudAndProud 2.23 | 8 | 7 | 0 | 0 | 0.34 | 1 | 1 | 0 |
| axeBots.Musashi 2.18 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| axeBots.Okami 1.04 | 8 | 6 | 486 | 0 | 0.73 | 0 | 0 | 0 |
| cjm.Charo 1.1 | 8 | 8 | 0 | 0 | 0.28 | 0 | 0 | 0 |
| cx.micro.Spark 0.6 | 8 | 3 | 894 | 0 | 0.31 | 2 | 2 | 0 |
| cx.mini.Cigaret 1.31 | 8 | 7 | 298 | 0 | 0.38 | 0 | 0 | 0 |
| davidalves.PhoenixOS 1.1 | 8 | 5 | 0 | 0 | 0.28 | 3 | 3 | 0 |
| deo.CloudBot 1.3 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| dft.Immortal 1.40 | 8 | 6 | 298 | 0 | 0.39 | 1 | 1 | 0 |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| dragonbyte.Neutrino 4 | 8 | 6 | 0 | 0 | 0.25 | 2 | 2 | 0 |
| drm.Magazine 0.39 | 8 | 7 | 298 | 0 | 0.36 | 0 | 0 | 0 |
| dz.GalbaMini 0.121 | 8 | 6 | 298 | 0 | 0.33 | 1 | 1 | 0 |
| eem.zapper v6.03 | 8 | 7 | 0 | 0 | 0.51 | 1 | 1 | 0 |
| fromHell.C22H30N2O2S 2.2 | 8 | 5 | 0 | 1 | 0.47 | 2 | 2 | 0 |
| hlavko.micro.Flex 1.5 | 8 | 6 | 298 | 0 | 0.26 | 2 | 2 | 0 |
| jk.micro.Cotillion 0.8 | 8 | 6 | 0 | 0 | 0.26 | 2 | 2 | 0 |
| jk.sheldor.nano.Yatagan 1.2.3 | 8 | 5 | 0 | 0 | 0.24 | 3 | 3 | 0 |
| lazarecki.mega.PinkerStinker 0.7 | 8 | 7 | 0 | 0 | 0.43 | 1 | 1 | 0 |
| lj.Dapps 0.2 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| nat.Samekh 0.4 | 8 | 5 | 0 | 0 | 0.42 | 3 | 3 | 0 |
| nz.jdc.nano.NeophytePRAL 1.4 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| origin.SleepSiphon 1.7b | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| pe.SandboxLump 1.52 | 8 | 6 | 596 | 0 | 0.38 | 0 | 0 | 0 |
| penguin.Ivy 1.1r | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| penguin.MrFreeze 1.0a | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| pez.mini.VertiLeach 0.4.0 | 8 | 8 | 0 | 0 | 0.16 | 0 | 0 | 8 |
| rampancy.Durandal 2.2d | 8 | 5 | 596 | 0 | 0.33 | 1 | 1 | 0 |
| ry.VirtualGunExperiment 1.2.0 | 8 | 6 | 596 | 0 | 0.35 | 0 | 0 | 0 |
| sheldor.micro.EpeeistDC 3.0 | 8 | 5 | 0 | 0 | 0.39 | 3 | 3 | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| sheldor.nano.FoilistNano 3.2 | 8 | 7 | 0 | 0 | 0.29 | 1 | 1 | 0 |
| slugzilla.ButtHead 2.0 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| slugzilla.RandomGF 1.0 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| sos.SOS 1.0 | 8 | 5 | 852 | 0 | 0.32 | 0 | 0 | 0 |
| stelo.Chord 1.0 | 8 | 6 | 298 | 0 | 0.31 | 1 | 1 | 0 |
| stelo.PastFuture 2.3.2 | 8 | 5 | 0 | 0 | 0.30 | 3 | 3 | 0 |
| synnalagma.NeuralPremier 0.51 | 8 | 6 | 298 | 0 | 0.29 | 1 | 1 | 0 |
| xander.cat.SamAxe 1.1 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |

264 of 320 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 16585 | 83 | 16559 | 16556 (99.8%) | 29 (0.2%) | 3 (0.0%) | 1071 | 280 | 120 |
| alk.lap.LoudAndProud 2.23 | 6901 | 15 | 6907 | 6899 (100.0%) | 2 (0.0%) | 8 (0.1%) | 183 | 99 | 34 |
| axeBots.Musashi 2.18 | 12290 | 10 | 13570 | 12288 (100.0%) | 2 (0.0%) | 1282 (9.4%) | 1398 | 165 | 37 |
| axeBots.Okami 1.04 | 12203 | 13 | 13817 | 12165 (99.7%) | 38 (0.3%) | 1652 (12.0%) | 1142 | 146 | 156 |
| cjm.Charo 1.1 | 7013 | 4 | 7039 | 7013 (100.0%) | 0 (0.0%) | 26 (0.4%) | 277 | 102 | 18 |
| cx.micro.Spark 0.6 | 8934 | 9 | 8874 | 8873 (99.3%) | 61 (0.7%) | 1 (0.0%) | 238 | 92 | 35 |
| cx.mini.Cigaret 1.31 | 7435 | 6 | 7423 | 7417 (99.8%) | 18 (0.2%) | 6 (0.1%) | 425 | 95 | 30 |
| davidalves.PhoenixOS 1.1 | 12510 | 5 | 13113 | 12510 (100.0%) | 0 (0.0%) | 603 (4.6%) | 1688 | 120 | 42 |
| deo.CloudBot 1.3 | 9330 | 12 | 9330 | 9330 (100.0%) | 0 (0.0%) | 0 (0.0%) | 246 | 121 | 31 |
| dft.Immortal 1.40 | 11881 | 4 | 11884 | 11860 (99.8%) | 21 (0.2%) | 24 (0.2%) | 620 | 125 | 44 |
| dmh.robocode.robot.BlackDeath 9.2 | 7247 | 18 | 7247 | 7247 (100.0%) | 0 (0.0%) | 0 (0.0%) | 182 | 123 | 21 |
| dragonbyte.Neutrino 4 | 26027 | 0 | 39449 | 26027 (100.0%) | 0 (0.0%) | 13422 (34.0%) | 3723 | 140 | 22 |
| drm.Magazine 0.39 | 7025 | 32 | 7006 | 7006 (99.7%) | 19 (0.3%) | 0 (0.0%) | 212 | 121 | 37 |
| dz.GalbaMini 0.121 | 11308 | 15 | 11288 | 11287 (99.8%) | 21 (0.2%) | 1 (0.0%) | 450 | 144 | 44 |
| eem.zapper v6.03 | 21143 | 26 | 21158 | 21142 (100.0%) | 1 (0.0%) | 16 (0.1%) | 1460 | 201 | 86 |
| fromHell.C22H30N2O2S 2.2 | 7196 | 14 | 7199 | 7194 (100.0%) | 2 (0.0%) | 5 (0.1%) | 314 | 119 | 21 |
| hlavko.micro.Flex 1.5 | 6626 | 37 | 6613 | 6602 (99.6%) | 24 (0.4%) | 11 (0.2%) | 540 | 127 | 23 |
| jk.micro.Cotillion 0.8 | 11273 | 11 | 11287 | 11272 (100.0%) | 1 (0.0%) | 15 (0.1%) | 541 | 166 | 42 |
| jk.sheldor.nano.Yatagan 1.2.3 | 7312 | 17 | 7311 | 7301 (99.8%) | 11 (0.2%) | 10 (0.1%) | 500 | 145 | 59 |
| lazarecki.mega.PinkerStinker 0.7 | 11246 | 10 | 11268 | 11246 (100.0%) | 0 (0.0%) | 22 (0.2%) | 870 | 160 | 59 |
| lj.Dapps 0.2 | 12708 | 56 | 12709 | 12703 (100.0%) | 5 (0.0%) | 6 (0.0%) | 622 | 161 | 42 |
| nat.Samekh 0.4 | 13361 | 77 | 13362 | 13358 (100.0%) | 3 (0.0%) | 4 (0.0%) | 720 | 148 | 66 |
| nz.jdc.nano.NeophytePRAL 1.4 | 7695 | 26 | 7707 | 7686 (99.9%) | 9 (0.1%) | 21 (0.3%) | 495 | 161 | 29 |
| origin.SleepSiphon 1.7b | 8294 | 25 | 8294 | 8294 (100.0%) | 0 (0.0%) | 0 (0.0%) | 250 | 95 | 26 |
| pe.SandboxLump 1.52 | 5904 | 25 | 5869 | 5869 (99.4%) | 35 (0.6%) | 0 (0.0%) | 73 | 83 | 25 |
| penguin.Ivy 1.1r | 6756 | 4 | 6759 | 6756 (100.0%) | 0 (0.0%) | 3 (0.0%) | 610 | 83 | 32 |
| penguin.MrFreeze 1.0a | 13250 | 9 | 13252 | 13250 (100.0%) | 0 (0.0%) | 2 (0.0%) | 343 | 159 | 49 |
| pez.mini.VertiLeach 0.4.0 | 192 | 3 | 192 | 192 (100.0%) | 0 (0.0%) | 0 (0.0%) | 8 | 1 | 12 |
| rampancy.Durandal 2.2d | 7740 | 19 | 7703 | 7700 (99.5%) | 40 (0.5%) | 3 (0.0%) | 455 | 119 | 30 |
| ry.VirtualGunExperiment 1.2.0 | 13033 | 18 | 12988 | 12987 (99.6%) | 46 (0.4%) | 1 (0.0%) | 457 | 131 | 29 |
| sheldor.micro.EpeeistDC 3.0 | 16816 | 69 | 16815 | 16813 (100.0%) | 3 (0.0%) | 2 (0.0%) | 864 | 161 | 81 |
| sheldor.micro.PointInLineRRAL 1.0 | 14325 | 12 | 14325 | 14325 (100.0%) | 0 (0.0%) | 0 (0.0%) | 646 | 141 | 25 |
| sheldor.nano.FoilistNano 3.2 | 8193 | 17 | 8195 | 8182 (99.9%) | 11 (0.1%) | 13 (0.2%) | 473 | 156 | 21 |
| slugzilla.ButtHead 2.0 | 2695 | 11 | 2698 | 2694 (100.0%) | 1 (0.0%) | 4 (0.1%) | 2140 | 261 | 17 |
| slugzilla.RandomGF 1.0 | 11449 | 7 | 11449 | 11448 (100.0%) | 1 (0.0%) | 1 (0.0%) | 387 | 99 | 29 |
| sos.SOS 1.0 | 10794 | 36 | 10732 | 10732 (99.4%) | 62 (0.6%) | 0 (0.0%) | 278 | 150 | 31 |
| stelo.Chord 1.0 | 10870 | 17 | 10850 | 10850 (99.8%) | 20 (0.2%) | 0 (0.0%) | 303 | 141 | 35 |
| stelo.PastFuture 2.3.2 | 12541 | 19 | 12540 | 12539 (100.0%) | 2 (0.0%) | 1 (0.0%) | 596 | 153 | 41 |
| synnalagma.NeuralPremier 0.51 | 7513 | 32 | 7497 | 7497 (99.8%) | 16 (0.2%) | 0 (0.0%) | 240 | 97 | 26 |
| xander.cat.SamAxe 1.1 | 7562 | 18 | 7562 | 7556 (99.9%) | 6 (0.1%) | 6 (0.1%) | 555 | 158 | 21 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ags.Glacier 0.3.2 | 17462 | 1539 (8.8%) | 13210 |
| alk.lap.LoudAndProud 2.23 | 7867 | 480 (6.1%) | 2378 |
| axeBots.Musashi 2.18 | 18702 | 1102 (5.9%) | 13695 |
| axeBots.Okami 1.04 | 18404 | 1122 (6.1%) | 16216 |
| cjm.Charo 1.1 | 9145 | 609 (6.7%) | 2511 |
| cx.micro.Spark 0.6 | 9848 | 803 (8.2%) | 5835 |
| cx.mini.Cigaret 1.31 | 10667 | 696 (6.5%) | 5028 |
| davidalves.PhoenixOS 1.1 | 18631 | 1067 (5.7%) | 11987 |
| deo.CloudBot 1.3 | 9367 | 909 (9.7%) | 6652 |
| dft.Immortal 1.40 | 14746 | 1327 (9.0%) | 12356 |
| dmh.robocode.robot.BlackDeath 9.2 | 7346 | 626 (8.5%) | 4440 |
| dragonbyte.Neutrino 4 | 40163 | 1633 (4.1%) | 33598 |
| drm.Magazine 0.39 | 8266 | 496 (6.0%) | 3488 |
| dz.GalbaMini 0.121 | 12145 | 1069 (8.8%) | 9460 |
| eem.zapper v6.03 | 22365 | 2314 (10.3%) | 19793 |
| fromHell.C22H30N2O2S 2.2 | 7612 | 553 (7.3%) | 5969 |
| hlavko.micro.Flex 1.5 | 6866 | 515 (7.5%) | 3143 |
| jk.micro.Cotillion 0.8 | 13609 | 1003 (7.4%) | 9577 |
| jk.sheldor.nano.Yatagan 1.2.3 | 7077 | 578 (8.2%) | 3089 |
| lazarecki.mega.PinkerStinker 0.7 | 14469 | 954 (6.6%) | 7531 |
| lj.Dapps 0.2 | 12678 | 1109 (8.7%) | 9984 |
| nat.Samekh 0.4 | 15449 | 1251 (8.1%) | 13041 |
| nz.jdc.nano.NeophytePRAL 1.4 | 6829 | 639 (9.4%) | 4767 |
| origin.SleepSiphon 1.7b | 7847 | 578 (7.4%) | 4190 |
| pe.SandboxLump 1.52 | 6579 | 508 (7.7%) | 5234 |
| penguin.Ivy 1.1r | 14438 | 548 (3.8%) | 3511 |
| penguin.MrFreeze 1.0a | 13313 | 1295 (9.7%) | 9880 |
| pez.mini.VertiLeach 0.4.0 | 218 | 23 (10.6%) | 15 |
| rampancy.Durandal 2.2d | 8592 | 600 (7.0%) | 2441 |
| ry.VirtualGunExperiment 1.2.0 | 14144 | 1315 (9.3%) | 11610 |
| sheldor.micro.EpeeistDC 3.0 | 17120 | 1644 (9.6%) | 13252 |
| sheldor.micro.PointInLineRRAL 1.0 | 15465 | 1128 (7.3%) | 11912 |
| sheldor.nano.FoilistNano 3.2 | 7796 | 722 (9.3%) | 5665 |
| slugzilla.ButtHead 2.0 | 2665 | 180 (6.8%) | 1416 |
| slugzilla.RandomGF 1.0 | 12401 | 1200 (9.7%) | 11044 |
| sos.SOS 1.0 | 10502 | 873 (8.3%) | 9121 |
| stelo.Chord 1.0 | 11321 | 1137 (10.0%) | 10511 |
| stelo.PastFuture 2.3.2 | 13027 | 1117 (8.6%) | 10487 |
| synnalagma.NeuralPremier 0.51 | 8542 | 691 (8.1%) | 4865 |
| xander.cat.SamAxe 1.1 | 7617 | 629 (8.3%) | 5266 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 650 | 425 | 650 | 811 | 36.6 / 35.6 | 772 | 3321 | 1732 |
| alk.lap.LoudAndProud 2.23 | 650 | 495 | 550 | 419 | 41.7 / 22.7 | 1807 | 5966 | 3277 |
| axeBots.Musashi 2.18 | 650 | 478 | 588 | 874 | 46.4 / 24.6 | 1492 | 1900 | 42 |
| axeBots.Okami 1.04 | 650 | 499 | 647 | 859 | 46.2 / 25.9 | 1163 | 1897 | 46 |
| cjm.Charo 1.1 | 650 | 416 | 600 | 473 | 37.5 / 25.9 | 772 | 5225 | 2 |
| cx.micro.Spark 0.6 | 650 | 502 | 538 | 510 | 41.0 / 20.8 | 892 | 5681 | 79 |
| cx.mini.Cigaret 1.31 | 650 | 511 | 628 | 530 | 34.3 / 26.0 | 471 | 4878 | 73 |
| davidalves.PhoenixOS 1.1 | 650 | 471 | 425 | 880 | 35.4 / 29.2 | 1880 | 1733 | 119 |
| deo.CloudBot 1.3 | 650 | 378 | 456 | 497 | 49.1 / 22.3 | 2126 | 4076 | 2958 |
| dft.Immortal 1.40 | 650 | 502 | 619 | 712 | 34.0 / 28.0 | 332 | 4485 | 150 |
| dmh.robocode.robot.BlackDeath 9.2 | 650 | 475 | 416 | 405 | 55.2 / 17.3 | 3156 | 4648 | 27 |
| dragonbyte.Neutrino 4 | 650 | 417 | 400 | 1824 | 76.7 / 0.2 | 3844 | 18 | 28 |
| drm.Magazine 0.39 | 650 | 541 | 569 | 433 | 42.2 / 23.5 | 1568 | 6134 | 391 |
| dz.GalbaMini 0.121 | 650 | 428 | 619 | 604 | 40.4 / 30.4 | 998 | 4628 | 0 |
| eem.zapper v6.03 | 650 | 494 | 650 | 1006 | 33.8 / 29.0 | 461 | 13863 | 6 |
| fromHell.C22H30N2O2S 2.2 | 650 | 368 | 575 | 420 | 47.6 / 26.9 | 2781 | 4346 | 2266 |
| hlavko.micro.Flex 1.5 | 650 | 332 | 422 | 380 | 51.8 / 21.4 | 2469 | 5093 | 459 |
| jk.micro.Cotillion 0.8 | 650 | 501 | 588 | 655 | 34.8 / 32.2 | 475 | 3746 | 40 |
| jk.sheldor.nano.Yatagan 1.2.3 | 650 | 321 | 425 | 398 | 55.6 / 24.8 | 2650 | 3904 | 1446 |
| lazarecki.mega.PinkerStinker 0.7 | 650 | 417 | 597 | 708 | 45.9 / 26.5 | 1500 | 3130 | 4 |
| lj.Dapps 0.2 | 650 | 447 | 619 | 633 | 49.1 / 23.7 | 1411 | 4966 | 1119 |
| nat.Samekh 0.4 | 650 | 487 | 650 | 735 | 30.3 / 31.5 | 224 | 6332 | 1583 |
| nz.jdc.nano.NeophytePRAL 1.4 | 650 | 347 | 563 | 395 | 69.9 / 16.7 | 4427 | 4418 | 1348 |
| origin.SleepSiphon 1.7b | 650 | 473 | 400 | 430 | 59.5 / 10.6 | 3393 | 4330 | 0 |
| pe.SandboxLump 1.52 | 650 | 332 | 553 | 370 | 53.7 / 24.2 | 2709 | 4441 | 0 |
| penguin.Ivy 1.1r | 650 | 539 | 497 | 714 | 56.0 / 14.2 | 1737 | 1951 | 0 |
| penguin.MrFreeze 1.0a | 650 | 545 | 613 | 664 | 52.2 / 14.9 | 1056 | 5416 | 124 |
| pez.mini.VertiLeach 0.4.0 | 650 | 352 | 650 | 12 | 1.3 / 0.4 | 1 | 266 | 27 |
| rampancy.Durandal 2.2d | 650 | 381 | 413 | 462 | 49.5 / 24.9 | 2941 | 3876 | 1838 |
| ry.VirtualGunExperiment 1.2.0 | 650 | 520 | 619 | 694 | 41.3 / 18.4 | 419 | 4697 | 4446 |
| sheldor.micro.EpeeistDC 3.0 | 650 | 538 | 613 | 805 | 36.3 / 28.2 | 269 | 5468 | 1525 |
| sheldor.micro.PointInLineRRAL 1.0 | 650 | 514 | 463 | 736 | 40.0 / 16.3 | 372 | 7391 | 287 |
| sheldor.nano.FoilistNano 3.2 | 650 | 329 | 650 | 434 | 53.3 / 29.9 | 3134 | 3945 | 1417 |
| slugzilla.ButtHead 2.0 | 650 | 157 | 650 | 168 | 106.9 / 70.6 | 2143 | 2079 | 167 |
| slugzilla.RandomGF 1.0 | 650 | 525 | 597 | 609 | 31.2 / 21.8 | 203 | 4650 | 5274 |
| sos.SOS 1.0 | 650 | 383 | 431 | 549 | 54.8 / 12.3 | 2267 | 5770 | 937 |
| stelo.Chord 1.0 | 650 | 470 | 519 | 575 | 40.9 / 22.5 | 1103 | 3776 | 4308 |
| stelo.PastFuture 2.3.2 | 650 | 454 | 650 | 642 | 35.7 / 34.4 | 582 | 2502 | 161 |
| synnalagma.NeuralPremier 0.51 | 650 | 378 | 453 | 467 | 58.4 / 18.2 | 3291 | 4108 | 166 |
| xander.cat.SamAxe 1.1 | 650 | 444 | 409 | 424 | 61.7 / 19.9 | 4290 | 3806 | 88 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ags.Glacier 0.3.2 | 9.3% | 127 | 124 | 3 | 59.1 | 1533 / 1539 (100%) | 0 | 0 |
| alk.lap.LoudAndProud 2.23 | 5.6% | 94 | 70 | 3 | 24.5 | 480 / 480 (100%) | 0 | 0 |
| axeBots.Musashi 2.18 | 7.3% | 106 | 95 | 3 | 48.4 | 1102 / 1102 (100%) | 0 | 0 |
| axeBots.Okami 1.04 | 7.9% | 203 | 5822 | 3 | 49.3 | 1122 / 1122 (100%) | 0 | 0 |
| cjm.Charo 1.1 | 5.9% | 79 | 288 | 3 | 25.1 | 609 / 609 (100%) | 0 | 0 |
| cx.micro.Spark 0.6 | 6.0% | 86 | 54 | 3 | 30.9 | 799 / 803 (100%) | 0 | 0 |
| cx.mini.Cigaret 1.31 | 5.8% | 105 | 913 | 3 | 26.5 | 694 / 696 (100%) | 0 | 0 |
| davidalves.PhoenixOS 1.1 | 7.2% | 79 | 802 | 3 | 46.3 | 1067 / 1067 (100%) | 0 | 0 |
| deo.CloudBot 1.3 | 7.1% | 94 | 43 | 3 | 33.3 | 909 / 909 (100%) | 0 | 0 |
| dft.Immortal 1.40 | 6.5% | 108 | 64 | 3 | 42.2 | 1325 / 1327 (100%) | 0 | 0 |
| dmh.robocode.robot.BlackDeath 9.2 | 5.9% | 101 | 57 | 3 | 25.9 | 626 / 626 (100%) | 0 | 0 |
| dragonbyte.Neutrino 4 | 0.4% | 69 | 88 | 2 | 139.3 | 1630 / 1633 (100%) | 0 | 0 |
| drm.Magazine 0.39 | 5.7% | 101 | 3250 | 3 | 24.9 | 494 / 496 (100%) | 0 | 0 |
| dz.GalbaMini 0.121 | 7.8% | 93 | 58 | 3 | 40.1 | 1067 / 1069 (100%) | 0 | 0 |
| eem.zapper v6.03 | 7.8% | 144 | 1694 | 3 | 75.3 | 2312 / 2314 (100%) | 0 | 0 |
| fromHell.C22H30N2O2S 2.2 | 7.6% | 131 | 3176 | 3 | 25.5 | 553 / 553 (100%) | 0 | 0 |
| hlavko.micro.Flex 1.5 | 7.0% | 73 | 220 | 3 | 23.1 | 513 / 515 (100%) | 0 | 0 |
| jk.micro.Cotillion 0.8 | 7.5% | 74 | 65 | 3 | 39.9 | 1003 / 1003 (100%) | 0 | 0 |
| jk.sheldor.nano.Yatagan 1.2.3 | 8.9% | 66 | 38 | 3 | 25.7 | 576 / 578 (100%) | 0 | 0 |
| lazarecki.mega.PinkerStinker 0.7 | 7.7% | 120 | 307 | 3 | 40.0 | 953 / 954 (100%) | 0 | 0 |
| lj.Dapps 0.2 | 7.5% | 100 | 62 | 3 | 45.1 | 1105 / 1109 (100%) | 0 | 0 |
| nat.Samekh 0.4 | 7.3% | 117 | 149 | 3 | 47.2 | 1249 / 1251 (100%) | 0 | 0 |
| nz.jdc.nano.NeophytePRAL 1.4 | 9.9% | 87 | 63 | 3 | 27.5 | 639 / 639 (100%) | 0 | 0 |
| origin.SleepSiphon 1.7b | 4.1% | 93 | 66 | 3 | 29.6 | 578 / 578 (100%) | 0 | 0 |
| pe.SandboxLump 1.52 | 8.0% | 106 | 42 | 3 | 20.9 | 506 / 508 (100%) | 0 | 0 |
| penguin.Ivy 1.1r | 5.7% | 93 | 51 | 3 | 24.1 | 548 / 548 (100%) | 0 | 0 |
| penguin.MrFreeze 1.0a | 7.6% | 106 | 322 | 3 | 47.3 | 1295 / 1295 (100%) | 0 | 0 |
| pez.mini.VertiLeach 0.4.0 | 0.2% | 45 | 10 | 3 | 0.7 | 23 / 23 (100%) | 0 | 0 |
| rampancy.Durandal 2.2d | 7.6% | 93 | 2042 | 3 | 27.4 | 598 / 600 (100%) | 0 | 0 |
| ry.VirtualGunExperiment 1.2.0 | 5.4% | 98 | 60 | 3 | 46.4 | 1310 / 1315 (100%) | 0 | 0 |
| sheldor.micro.EpeeistDC 3.0 | 6.9% | 108 | 9194 | 3 | 59.0 | 1639 / 1644 (100%) | 0 | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 4.7% | 86 | 57 | 3 | 50.9 | 1125 / 1128 (100%) | 0 | 0 |
| sheldor.nano.FoilistNano 3.2 | 10.0% | 80 | 3343 | 3 | 29.0 | 721 / 722 (100%) | 0 | 0 |
| slugzilla.ButtHead 2.0 | 53.4% | 84 | 22 | 3 | 9.4 | 180 / 180 (100%) | 0 | 0 |
| slugzilla.RandomGF 1.0 | 5.0% | 94 | 58 | 3 | 40.8 | 1199 / 1200 (100%) | 0 | 0 |
| sos.SOS 1.0 | 7.3% | 89 | 42 | 3 | 38.3 | 868 / 873 (99%) | 0 | 0 |
| stelo.Chord 1.0 | 6.0% | 88 | 614 | 3 | 38.4 | 1135 / 1137 (100%) | 0 | 0 |
| stelo.PastFuture 2.3.2 | 8.4% | 85 | 61 | 3 | 44.0 | 1114 / 1117 (100%) | 0 | 0 |
| synnalagma.NeuralPremier 0.51 | 6.6% | 81 | 57 | 3 | 26.5 | 689 / 691 (100%) | 0 | 0 |
| xander.cat.SamAxe 1.1 | 8.2% | 80 | 54 | 3 | 27.0 | 629 / 629 (100%) | 0 | 0 |

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
| ags.Glacier 0.3.2 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 59.6% ± 5.0 | 62.0% ± 2.1 | +2.5 ± 5.6 |
| ags.Glacier 0.3.2 | hadur2.Hadur 3.9 | 8 | 67.5% ± 17.7 | 78.8% ± 10.4 | +11.2 ± 27.0 | 48.5% ± 6.5 | 52.3% ± 3.9 | +3.8 ± 9.3 |
| alk.lap.LoudAndProud 2.23 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 62.8% ± 9.7 | 76.3% ± 5.4 | +13.6 ± 8.9 |
| alk.lap.LoudAndProud 2.23 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 100.0% ± 0.0 | +7.5 ± 8.7 | 60.5% ± 9.9 | 65.8% ± 6.7 | +5.3 ± 11.8 |
| axeBots.Musashi 2.18 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | - | 70.4% ± 3.8 | n/a |
| axeBots.Musashi 2.18 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 88.8% ± 7.0 | -3.7 ± 7.7 | 68.5% ± 7.9 | 63.1% ± 3.9 | -5.4 ± 10.1 |
| axeBots.Okami 1.04 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 67.8% ± 7.3 | 67.1% ± 3.7 | -0.7 ± 10.1 |
| axeBots.Okami 1.04 | hadur2.Hadur 3.9 | 8 | 85.0% ± 11.8 | 83.8% ± 13.4 | -1.3 ± 21.6 | 63.3% ± 8.1 | 63.8% ± 6.2 | +0.5 ± 7.9 |
| cjm.Charo 1.1 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | - | - | n/a |
| cjm.Charo 1.1 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 97.5% ± 3.9 | +5.0 ± 8.9 | 56.0% ± 7.3 | 59.1% ± 4.1 | +3.1 ± 7.1 |
| cx.micro.Spark 0.6 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 7.7% ± 12.2 | 30.7% ± 27.3 | +19.5 ± 33.4 |
| cx.micro.Spark 0.6 | hadur2.Hadur 3.9 | 8 | 82.5% ± 16.6 | 92.2% ± 7.8 | +9.7 ± 17.2 | 64.4% ± 13.4 | 65.4% ± 8.4 | +1.0 ± 17.7 |
| cx.mini.Cigaret 1.31 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 18.2% ± 12.7 | 69.3% ± 9.3 | +51.2 ± 18.0 |
| cx.mini.Cigaret 1.31 | hadur2.Hadur 3.9 | 8 | 85.0% ± 17.3 | 90.0% ± 6.3 | +5.0 ± 14.8 | 54.3% ± 11.7 | 57.8% ± 8.4 | +3.5 ± 10.9 |
| davidalves.PhoenixOS 1.1 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 61.4% ± 7.3 | 64.5% ± 4.5 | +3.1 ± 7.5 |
| davidalves.PhoenixOS 1.1 | hadur2.Hadur 3.9 | 8 | 82.5% ± 16.6 | 86.0% ± 9.9 | +3.5 ± 21.9 | 54.8% ± 7.8 | 54.0% ± 5.7 | -0.7 ± 9.8 |
| deo.CloudBot 1.3 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 89.2% ± 3.0 | 92.4% ± 1.8 | +3.2 ± 3.8 |
| deo.CloudBot 1.3 | hadur2.Hadur 3.9 | 8 | 87.5% ± 8.7 | 95.0% ± 6.3 | +7.5 ± 13.2 | 71.7% ± 5.1 | 66.4% ± 7.1 | -5.3 ± 8.9 |
| dft.Immortal 1.40 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 63.3% ± 4.4 | 63.9% ± 4.9 | +0.5 ± 6.9 |
| dft.Immortal 1.40 | hadur2.Hadur 3.9 | 8 | 80.0% ± 20.0 | 87.4% ± 7.4 | +7.4 ± 24.9 | 48.6% ± 8.1 | 52.3% ± 6.0 | +3.7 ± 9.9 |
| dmh.robocode.robot.BlackDeath 9.2 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 29.0% ± 23.3 | 0.0% | n/a |
| dmh.robocode.robot.BlackDeath 9.2 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 68.9% ± 6.8 | 80.6% ± 4.3 | +11.8 ± 6.3 |
| dragonbyte.Neutrino 4 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 100.0% ± 0.1 | 99.8% ± 0.2 | -0.1 ± 0.2 |
| dragonbyte.Neutrino 4 | hadur2.Hadur 3.9 | 8 | 52.5% ± 15.3 | 63.5% ± 16.3 | +11.0 ± 26.7 | 100.0% ± 0.1 | 99.8% ± 0.1 | -0.2 ± 0.1 |
| drm.Magazine 0.39 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 62.6% ± 13.9 | 71.5% ± 5.2 | +8.9 ± 13.7 |
| drm.Magazine 0.39 | hadur2.Hadur 3.9 | 8 | 85.0% ± 14.8 | 97.5% ± 3.9 | +12.5 ± 14.7 | 55.1% ± 9.6 | 66.9% ± 5.3 | +11.8 ± 11.2 |
| dz.GalbaMini 0.121 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 63.0% ± 5.5 | 67.6% ± 4.8 | +4.5 ± 8.0 |
| dz.GalbaMini 0.121 | hadur2.Hadur 3.9 | 8 | 87.5% ± 8.7 | 84.7% ± 10.1 | -2.8 ± 11.1 | 55.0% ± 7.9 | 57.7% ± 7.5 | +2.7 ± 11.6 |
| eem.zapper v6.03 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 57.6% ± 6.5 | 62.0% ± 7.0 | +4.3 ± 7.7 |
| eem.zapper v6.03 | hadur2.Hadur 3.9 | 8 | 85.0% ± 11.8 | 87.2% ± 8.9 | +2.2 ± 11.2 | 58.5% ± 4.1 | 50.5% ± 8.2 | -8.0 ± 8.3 |
| fromHell.C22H30N2O2S 2.2 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 5.0% ± 15.8 | 22.9% ± 33.9 | +16.2 ± 61.8 |
| fromHell.C22H30N2O2S 2.2 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 89.6% ± 9.7 | +2.1 ± 14.3 | 61.6% ± 4.1 | 63.1% ± 6.3 | +1.5 ± 8.0 |
| hlavko.micro.Flex 1.5 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 74.8% ± 9.3 | 81.8% ± 5.0 | +6.9 ± 7.2 |
| hlavko.micro.Flex 1.5 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 92.4% ± 6.0 | +2.4 ± 14.1 | 70.2% ± 10.2 | 70.1% ± 7.7 | -0.2 ± 11.2 |
| jk.micro.Cotillion 0.8 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 70.4% ± 8.0 | 67.4% ± 4.3 | -3.0 ± 8.6 |
| jk.micro.Cotillion 0.8 | hadur2.Hadur 3.9 | 8 | 77.5% ± 14.0 | 76.5% ± 18.0 | -1.0 ± 24.8 | 55.3% ± 7.7 | 51.1% ± 9.0 | -4.2 ± 12.8 |
| jk.sheldor.nano.Yatagan 1.2.3 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 5.4% ± 4.6 | 67.4% ± 75.1 | +62.9 ± 83.8 |
| jk.sheldor.nano.Yatagan 1.2.3 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 89.9% ± 10.0 | -10.1 ± 10.0 | 84.3% ± 4.7 | 67.4% ± 6.6 | -16.9 ± 9.6 |
| lazarecki.mega.PinkerStinker 0.7 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 67.1% ± 5.6 | 71.1% ± 5.9 | +4.0 ± 5.2 |
| lazarecki.mega.PinkerStinker 0.7 | hadur2.Hadur 3.9 | 8 | 85.0% ± 7.7 | 89.9% ± 7.7 | +4.9 ± 12.6 | 60.3% ± 6.1 | 64.9% ± 6.0 | +4.7 ± 9.4 |
| lj.Dapps 0.2 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 74.7% ± 6.8 | 78.4% ± 5.5 | +3.8 ± 11.0 |
| lj.Dapps 0.2 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 95.0% ± 6.3 | -2.5 ± 9.7 | 70.8% ± 4.4 | 68.5% ± 2.7 | -2.3 ± 4.4 |
| nat.Samekh 0.4 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 59.2% ± 8.4 | 58.1% ± 4.8 | -1.1 ± 7.9 |
| nat.Samekh 0.4 | hadur2.Hadur 3.9 | 8 | 75.0% ± 14.8 | 81.5% ± 12.1 | +6.5 ± 16.8 | 47.8% ± 10.9 | 47.8% ± 8.7 | -0.1 ± 14.2 |
| nz.jdc.nano.NeophytePRAL 1.4 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 14.7% ± 12.3 | 61.8% ± 26.6 | +47.1 ± 31.3 |
| nz.jdc.nano.NeophytePRAL 1.4 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 75.9% ± 2.4 | 81.3% ± 2.4 | +5.4 ± 2.3 |
| origin.SleepSiphon 1.7b | jd.Nullstride 2.3.3 | 8 | - | - | n/a | - | - | n/a |
| origin.SleepSiphon 1.7b | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 78.3% ± 3.5 | 86.5% ± 3.2 | +8.2 ± 3.4 |
| pe.SandboxLump 1.52 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 69.8% ± 7.2 | 80.4% ± 4.5 | +10.6 ± 9.8 |
| pe.SandboxLump 1.52 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 95.0% ± 6.3 | +0.0 ± 7.7 | 67.2% ± 5.4 | 69.4% ± 5.6 | +2.2 ± 5.5 |
| penguin.Ivy 1.1r | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 80.7% ± 6.6 | 81.2% ± 4.2 | +0.4 ± 7.2 |
| penguin.Ivy 1.1r | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 95.0% ± 6.3 | -2.5 ± 9.7 | 78.8% ± 8.3 | 81.2% ± 6.1 | +2.4 ± 12.5 |
| penguin.MrFreeze 1.0a | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 71.6% ± 7.2 | 78.3% ± 4.8 | +6.7 ± 9.3 |
| penguin.MrFreeze 1.0a | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 97.5% ± 3.9 | +5.0 ± 10.9 | 75.6% ± 8.0 | 79.3% ± 5.2 | +3.8 ± 9.2 |
| pez.mini.VertiLeach 0.4.0 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 95.4% ± 10.8 | - | n/a |
| pez.mini.VertiLeach 0.4.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 100.0% ± 0.0 | - | n/a |
| rampancy.Durandal 2.2d | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 85.2% ± 8.3 | 85.3% ± 8.1 | +0.0 ± 13.1 |
| rampancy.Durandal 2.2d | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 91.1% ± 8.3 | +1.1 ± 17.1 | 63.8% ± 9.1 | 68.4% ± 5.5 | +4.7 ± 13.4 |
| ry.VirtualGunExperiment 1.2.0 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | - | 0.0% ± 0.0 | n/a |
| ry.VirtualGunExperiment 1.2.0 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 97.5% ± 3.9 | +7.5 ± 14.7 | 65.7% ± 8.8 | 70.7% ± 5.1 | +5.0 ± 10.1 |
| sheldor.micro.EpeeistDC 3.0 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 67.4% ± 7.0 | 62.1% ± 4.2 | -5.3 ± 7.9 |
| sheldor.micro.EpeeistDC 3.0 | hadur2.Hadur 3.9 | 8 | 72.5% ± 8.7 | 88.3% ± 9.6 | +15.8 ± 9.9 | 53.2% ± 4.7 | 53.6% ± 4.6 | +0.4 ± 7.8 |
| sheldor.micro.PointInLineRRAL 1.0 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 75.0% ± 2.7 | 82.2% ± 3.8 | +7.2 ± 4.7 |
| sheldor.micro.PointInLineRRAL 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 97.5% ± 3.9 | -2.5 ± 3.9 | 75.2% ± 6.2 | 72.3% ± 8.0 | -2.9 ± 4.6 |
| sheldor.nano.FoilistNano 3.2 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 76.7% ± 4.8 | 82.9% ± 4.5 | +6.2 ± 8.5 |
| sheldor.nano.FoilistNano 3.2 | hadur2.Hadur 3.9 | 8 | 72.5% ± 8.7 | 83.2% ± 12.7 | +10.7 ± 10.0 | 58.9% ± 1.4 | 65.2% ± 5.8 | +6.3 ± 6.3 |
| slugzilla.ButtHead 2.0 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 0.2% ± 0.6 | 25.9% ± 75.4 | +25.5 ± 74.0 |
| slugzilla.ButtHead 2.0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 97.5% ± 3.9 | +5.0 ± 10.9 | 62.8% ± 3.0 | 57.8% ± 1.8 | -5.0 ± 3.9 |
| slugzilla.RandomGF 1.0 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | - | - | n/a |
| slugzilla.RandomGF 1.0 | hadur2.Hadur 3.9 | 8 | 85.0% ± 17.3 | 93.8% ± 4.3 | +8.8 ± 16.4 | 49.1% ± 4.0 | 57.5% ± 5.8 | +8.4 ± 4.7 |
| sos.SOS 1.0 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 92.5% ± 3.7 | 91.2% ± 2.9 | -1.4 ± 1.8 |
| sos.SOS 1.0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 98.8% ± 3.0 | +6.2 ± 7.7 | 77.5% ± 3.7 | 80.9% ± 4.7 | +3.4 ± 5.6 |
| stelo.Chord 1.0 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 89.3% ± 3.2 | 93.4% ± 2.3 | +4.1 ± 4.8 |
| stelo.Chord 1.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 11.8 | 93.6% ± 6.3 | -1.4 ± 12.3 | 68.1% ± 10.8 | 64.1% ± 6.5 | -4.0 ± 13.1 |
| stelo.PastFuture 2.3.2 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 61.2% ± 6.9 | 60.7% ± 9.0 | -0.5 ± 14.1 |
| stelo.PastFuture 2.3.2 | hadur2.Hadur 3.9 | 8 | 70.0% ± 21.9 | 74.7% ± 13.2 | +4.7 ± 23.6 | 52.7% ± 9.2 | 46.6% ± 6.1 | -6.1 ± 11.2 |
| synnalagma.NeuralPremier 0.51 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 80.6% ± 7.6 | 82.9% ± 2.6 | +2.3 ± 7.4 |
| synnalagma.NeuralPremier 0.51 | hadur2.Hadur 3.9 | 8 | 85.0% ± 11.8 | 98.8% ± 3.0 | +13.7 ± 11.8 | 70.9% ± 4.7 | 78.0% ± 5.1 | +7.2 ± 4.9 |
| xander.cat.SamAxe 1.1 | jd.Nullstride 2.3.3 | 8 | - | - | n/a | 85.7% ± 3.1 | 88.6% ± 3.6 | +2.9 ± 4.4 |
| xander.cat.SamAxe 1.1 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 98.8% ± 3.0 | +6.2 ± 9.9 | 70.8% ± 3.2 | 76.2% ± 3.2 | +5.4 ± 4.9 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| ags.Glacier 0.3.2 | n/a | n/a | +11.1 ± 7.4 | +9.8 ± 3.4 |
| alk.lap.LoudAndProud 2.23 | n/a | n/a | +2.3 ± 16.2 | +10.5 ± 6.4 |
| axeBots.Musashi 2.18 | n/a | n/a | n/a | +7.2 ± 5.0 |
| axeBots.Okami 1.04 | n/a | n/a | +4.5 ± 11.1 | +3.3 ± 6.4 |
| cjm.Charo 1.1 | n/a | n/a | n/a | n/a |
| cx.micro.Spark 0.6 | n/a | n/a | -59.1 ± 15.1 | -36.5 ± 28.0 |
| cx.mini.Cigaret 1.31 | n/a | n/a | -36.1 ± 18.8 | +11.5 ± 13.2 |
| davidalves.PhoenixOS 1.1 | n/a | n/a | +6.7 ± 8.1 | +10.4 ± 6.5 |
| deo.CloudBot 1.3 | n/a | n/a | +17.5 ± 5.6 | +26.0 ± 6.8 |
| dft.Immortal 1.40 | n/a | n/a | +14.7 ± 9.0 | +11.6 ± 7.7 |
| dmh.robocode.robot.BlackDeath 9.2 | n/a | n/a | -41.1 ± 11.9 | -81.7 |
| dragonbyte.Neutrino 4 | n/a | n/a | -0.0 ± 0.1 | +0.0 ± 0.2 |
| drm.Magazine 0.39 | n/a | n/a | +7.5 ± 20.7 | +4.6 ± 8.8 |
| dz.GalbaMini 0.121 | n/a | n/a | +8.1 ± 10.8 | +9.8 ± 9.8 |
| eem.zapper v6.03 | n/a | n/a | -0.9 ± 9.7 | +11.5 ± 13.2 |
| fromHell.C22H30N2O2S 2.2 | n/a | n/a | -55.9 ± 24.7 | -34.9 ± 36.4 |
| hlavko.micro.Flex 1.5 | n/a | n/a | +4.6 ± 14.2 | +11.7 ± 10.2 |
| jk.micro.Cotillion 0.8 | n/a | n/a | +15.1 ± 8.2 | +16.4 ± 9.5 |
| jk.sheldor.nano.Yatagan 1.2.3 | n/a | n/a | -78.9 ± 8.1 | -0.3 ± 82.4 |
| lazarecki.mega.PinkerStinker 0.7 | n/a | n/a | +6.9 ± 9.8 | +6.2 ± 4.9 |
| lj.Dapps 0.2 | n/a | n/a | +3.9 ± 8.1 | +9.9 ± 7.0 |
| nat.Samekh 0.4 | n/a | n/a | +11.4 ± 7.9 | +10.3 ± 9.9 |
| nz.jdc.nano.NeophytePRAL 1.4 | n/a | n/a | -61.1 ± 13.9 | -19.5 ± 27.1 |
| origin.SleepSiphon 1.7b | n/a | n/a | n/a | n/a |
| pe.SandboxLump 1.52 | n/a | n/a | +2.6 ± 9.3 | +11.0 ± 6.0 |
| penguin.Ivy 1.1r | n/a | n/a | +1.9 ± 5.3 | -0.0 ± 7.9 |
| penguin.MrFreeze 1.0a | n/a | n/a | -4.0 ± 12.3 | -1.1 ± 6.2 |
| pez.mini.VertiLeach 0.4.0 | n/a | n/a | -4.6 ± 10.8 | n/a |
| rampancy.Durandal 2.2d | n/a | n/a | +21.5 ± 12.8 | +16.8 ± 10.9 |
| ry.VirtualGunExperiment 1.2.0 | n/a | n/a | n/a | -74.5 ± 91.3 |
| sheldor.micro.EpeeistDC 3.0 | n/a | n/a | +14.2 ± 9.7 | +8.5 ± 5.1 |
| sheldor.micro.PointInLineRRAL 1.0 | n/a | n/a | -0.2 ± 5.6 | +9.8 ± 8.0 |
| sheldor.nano.FoilistNano 3.2 | n/a | n/a | +17.8 ± 4.3 | +17.7 ± 8.3 |
| slugzilla.ButtHead 2.0 | n/a | n/a | -63.2 ± 2.9 | -32.2 ± 73.9 |
| slugzilla.RandomGF 1.0 | n/a | n/a | n/a | n/a |
| sos.SOS 1.0 | n/a | n/a | +15.0 ± 5.3 | +10.2 ± 6.1 |
| stelo.Chord 1.0 | n/a | n/a | +21.2 ± 9.1 | +29.3 ± 5.4 |
| stelo.PastFuture 2.3.2 | n/a | n/a | +8.5 ± 12.1 | +14.1 ± 13.7 |
| synnalagma.NeuralPremier 0.51 | n/a | n/a | +9.7 ± 6.7 | +4.9 ± 6.4 |
| xander.cat.SamAxe 1.1 | n/a | n/a | +14.9 ± 4.6 | +12.4 ± 4.7 |
