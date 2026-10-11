# Bench: hadur2.Hadur 3.9 (cold)

## Excluded or failing opponents

These failed at least half of their battles, so their rows are missing or thin and the set is smaller than it was asked to be.

| Opponent | Battles failed | First failure |
|---|---|---|
| zen.Ronin 1.0.0 | 8 of 8 (all) | expected 2 robots; found 1 |
| zen.Ronin 1.0.0 (baseline) | 8 of 8 (all) | expected 2 robots; found 1 |

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 3639 over 312 battles (11.7 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | weak | 92.3% ± 2.2 | 97.5% ± 2.0 | 87.4% ± 3.1 | 273 / 280 | 22.9% ± 2.2 | 9.1% ± 7.6 | 104 | 0 | 0.77 / 14.8 |
| ahr.ice.Ice 1.0 | weak | 86.9% ± 1.7 | 95.7% ± 2.6 | 78.1% ± 1.5 | 268 / 280 | 20.6% ± 1.4 | 5.4% ± 0.5 | 90 | 0 | 1.23 / 31.0 |
| wiki.WaveRammer 1.0 | weak | 73.3% ± 3.2 | 86.1% ± 4.5 | 66.7% ± 2.3 | 241 / 280 | 37.5% ± 2.4 | 25.4% ± 5.3 | 119 | 0 | 0.89 / 13.2 |
| pl.Drum 0.1 | weak | 83.4% ± 1.8 | 94.3% ± 2.6 | 74.2% ± 2.2 | 264 / 280 | 23.8% ± 1.0 | 10.4% ± 1.4 | 98 | 0 | 0.90 / 13.6 |
| shrub.Silver v048 | weak | 96.2% ± 1.0 | 98.9% ± 1.2 | 93.4% ± 1.3 | 277 / 280 | 22.3% ± 0.9 | 2.5% ± 0.4 | 82 | 0 | 0.73 / 141.4 |
| justin.DemonicRage 3.20 | mid | 73.3% ± 4.7 | 89.6% ± 5.8 | 56.0% ± 3.8 | 251 / 280 | 11.5% ± 0.5 | 6.8% ± 0.6 | 107 | 0 | 1.18 / 19.6 |
| lorneswork.Predator 1.0 | weak | 90.1% ± 2.8 | 97.1% ± 2.6 | 84.8% ± 3.3 | 272 / 280 | 41.3% ± 1.6 | 9.8% ± 2.3 | 81 | 0 | 0.65 / 11.2 |
| maribo.IotaCT 1.0 | weak | 92.9% ± 2.2 | 99.3% ± 1.1 | 87.5% ± 3.0 | 278 / 280 | 36.9% ± 1.7 | 6.7% ± 1.4 | 88 | 0 | 0.73 / 10.9 |
| jcs.AutoBot 4.2.1 | weak | 74.6% ± 3.1 | 88.2% ± 4.1 | 62.8% ± 2.4 | 247 / 280 | 18.6% ± 0.9 | 10.9% ± 1.3 | 89 | 0 | 1.24 / 14.6 |
| GarmBox.Oranges 1.0.1 | weak | 90.0% ± 2.3 | 98.2% ± 2.2 | 82.9% ± 4.1 | 275 / 280 | 29.0% ± 2.4 | 7.5% ± 2.0 | 92 | 0 | 0.82 / 12.8 |
| zen.Ronin 1.0.0 | mid | n/a | n/a | n/a | 0 / 0 | - | - | 0 | 0 | 0.00 / 0.0 | 8 battle(s) failed
| dz.Caedo 1.4 | weak | 85.4% ± 3.0 | 90.7% ± 3.6 | 80.5% ± 3.2 | 254 / 280 | 19.3% ± 0.9 | 13.0% ± 0.7 | 98 | 0 | 0.96 / 16.2 |
| supersample.SuperTrackFire 1.0 | weak | 95.8% ± 0.8 | 100.0% ± 0.0 | 90.2% ± 2.0 | 280 / 280 | 18.9% ± 1.6 | 2.0% ± 0.4 | 87 | 0 | 0.77 / 13.4 |
| theo.QuarkSoup 1.5fga | weak | 70.9% ± 4.2 | 86.8% ± 4.9 | 55.1% ± 3.3 | 243 / 280 | 12.3% ± 0.5 | 7.0% ± 0.5 | 96 | 0 | 1.04 / 17.0 |
| nat.Samekh 0.4 | mid | 67.9% ± 4.9 | 84.6% ± 6.5 | 50.9% ± 3.6 | 237 / 280 | 10.9% ± 0.4 | 7.4% ± 0.6 | 104 | 0 | 1.13 / 38.1 |
| pl.Patton.GeneralPatton 1.54 | weak | 80.6% ± 4.3 | 89.3% ± 5.9 | 73.0% ± 4.0 | 250 / 280 | 20.0% ± 1.3 | 9.1% ± 1.3 | 76 | 0 | 1.00 / 16.5 |
| dcs.Eater_of_Worlds_Mini 1.0 | weak | 97.6% ± 1.0 | 99.3% ± 1.1 | 95.9% ± 1.6 | 278 / 280 | 24.3% ± 1.7 | 1.6% ± 0.7 | 83 | 0 | 0.63 / 12.3 |
| com.syncleus.robocode.Dreadnaught 0.1 | weak | 84.4% ± 1.1 | 99.6% ± 0.8 | 75.1% ± 1.3 | 279 / 280 | 68.0% ± 1.8 | 26.3% ± 2.3 | 87 | 0 | 0.69 / 10.5 |
| theo.real.Ahab 1.0 | mid | 66.3% ± 3.6 | 80.4% ± 4.5 | 50.4% ± 3.3 | 225 / 280 | 10.6% ± 0.4 | 6.5% ± 0.3 | 111 | 0 | 1.60 / 17.2 |
| vjik.UnViolation 1.1 | weak | 90.0% ± 2.1 | 99.3% ± 1.1 | 83.6% ± 3.1 | 278 / 280 | 41.1% ± 2.9 | 20.8% ± 8.4 | 78 | 0 | 0.82 / 13.6 |
| bvh.tyr.Tyr 1.74 | weak | 89.7% ± 4.0 | 97.9% ± 3.3 | 83.2% ± 4.5 | 274 / 280 | 28.1% ± 2.4 | 10.6% ± 1.9 | 86 | 0 | 0.87 / 13.9 |
| zezinho.QuerMePegarKKKK 1.0 | weak | 76.5% ± 3.2 | 89.6% ± 4.0 | 67.1% ± 2.7 | 251 / 280 | 19.5% ± 1.7 | 13.1% ± 6.4 | 99 | 0 | 1.02 / 11.4 |
| jwst.DAD.DarkAndDarker 1.1 | weak | 85.9% ± 1.9 | 95.4% ± 2.2 | 77.5% ± 2.0 | 267 / 280 | 21.2% ± 1.9 | 8.2% ± 1.4 | 80 | 0 | 0.80 / 16.7 |
| apc.Colossus2 0.12 | weak | 89.0% ± 4.6 | 99.6% ± 0.8 | 82.3% ± 6.1 | 279 / 280 | 62.3% ± 1.8 | 28.3% ± 19.3 | 86 | 0 | 0.58 / 9.8 |
| ara.Shera 0.88 | weak | 78.4% ± 2.3 | 91.8% ± 2.7 | 64.8% ± 2.3 | 257 / 280 | 15.1% ± 0.5 | 6.1% ± 0.7 | 86 | 0 | 0.96 / 15.0 |
| dft.Immortal 1.40 | mid | 71.3% ± 3.0 | 86.8% ± 4.8 | 55.3% ± 2.5 | 243 / 280 | 11.9% ± 0.5 | 6.7% ± 0.3 | 97 | 0 | 1.01 / 14.8 |
| ethdsy.Malacka 2.4 | weak | 93.6% ± 1.2 | 99.6% ± 0.8 | 88.7% ± 1.7 | 279 / 280 | 44.0% ± 1.9 | 8.5% ± 0.9 | 83 | 0 | 0.63 / 10.5 |
| dmh.robocode.robot.PinkPanther 1.1 | weak | 65.8% ± 9.6 | 85.0% ± 8.6 | 45.1% ± 10.9 | 238 / 280 | 11.6% ± 2.8 | 6.5% ± 0.8 | 109 | 0 | 1.10 / 15.9 |
| rtk.Tachikoma 1.0 | weak | 77.7% ± 2.6 | 91.1% ± 3.9 | 64.7% ± 1.6 | 255 / 280 | 15.7% ± 0.9 | 7.3% ± 0.6 | 91 | 0 | 1.24 / 14.4 |
| tad.Dalek98 0.98 | weak | 83.2% ± 2.9 | 96.1% ± 2.8 | 68.3% ± 3.2 | 269 / 280 | 14.5% ± 0.9 | 4.5% ± 0.5 | 87 | 0 | 0.94 / 16.4 |
| dk.stable.Gorgatron 1.1 | weak | 83.9% ± 4.2 | 96.1% ± 4.0 | 74.0% ± 4.2 | 269 / 280 | 25.7% ± 2.3 | 9.0% ± 2.4 | 108 | 0 | 1.07 / 87.3 |
| element.Earth 1.1 | weak | 76.2% ± 2.4 | 87.1% ± 3.8 | 65.8% ± 1.3 | 244 / 280 | 16.8% ± 1.3 | 7.9% ± 0.6 | 84 | 0 | 0.92 / 17.1 |
| davidalves.Firebird 0.25 | mid | 56.8% ± 3.9 | 71.4% ± 5.4 | 41.1% ± 2.3 | 200 / 280 | 9.6% ± 0.4 | 7.4% ± 0.6 | 80 | 0 | 1.19 / 20.5 |
| wcsv.Engineer.Engineer 0.5.4 | mid | 61.0% ± 2.7 | 76.8% ± 3.7 | 45.2% ± 2.7 | 215 / 280 | 10.6% ± 0.4 | 7.9% ± 0.2 | 101 | 0 | 1.06 / 15.4 |
| kinsen.nano.Quarrelet 1.0 | weak | 77.5% ± 2.4 | 92.1% ± 2.1 | 61.6% ± 3.1 | 258 / 280 | 15.5% ± 1.5 | 5.9% ± 0.8 | 83 | 0 | 0.89 / 13.0 |
| sheldor.mini.FoilistMC 1.0 | mid | 72.6% ± 4.9 | 86.8% ± 6.6 | 57.6% ± 3.9 | 243 / 280 | 11.6% ± 0.5 | 7.7% ± 0.4 | 145 | 0 | 1.32 / 17.9 |
| tide.pear.Pear 0.62.1 | mid | 65.1% ± 3.7 | 82.5% ± 5.5 | 46.4% ± 3.5 | 231 / 280 | 10.6% ± 0.3 | 6.9% ± 0.4 | 70 | 0 | 1.02 / 15.4 |
| theo.avenge.Pequod 1.0 | mid | 66.2% ± 6.4 | 79.6% ± 8.6 | 51.1% ± 4.8 | 223 / 280 | 10.9% ± 0.3 | 6.2% ± 0.4 | 98 | 0 | 1.39 / 18.7 |
| rz.Aleph 0.34 | mid | 71.5% ± 3.6 | 88.6% ± 4.9 | 53.5% ± 2.3 | 248 / 280 | 11.6% ± 0.4 | 6.5% ± 0.5 | 97 | 0 | 1.03 / 15.5 |
| oog.mini.AlphaDragon 0.1 | weak | 75.9% ± 3.0 | 90.7% ± 3.8 | 61.6% ± 3.0 | 254 / 280 | 13.9% ± 0.5 | 7.6% ± 0.6 | 99 | 0 | 1.01 / 14.8 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | 8 | 5 | 1146 | 0 | 0.37 | 0 | 0 | 0 |
| ahr.ice.Ice 1.0 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| wiki.WaveRammer 1.0 | 8 | 7 | 117 | 1 | 0.43 | 0 | 0 | 0 |
| pl.Drum 0.1 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| shrub.Silver v048 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| justin.DemonicRage 3.20 | 8 | 6 | 0 | 0 | 0.38 | 2 | 2 | 0 |
| lorneswork.Predator 1.0 | 8 | 7 | 298 | 0 | 0.29 | 0 | 0 | 0 |
| maribo.IotaCT 1.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| jcs.AutoBot 4.2.1 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| GarmBox.Oranges 1.0.1 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| zen.Ronin 1.0.0 | 8 | 0 | 0 | 0 | 0.00 | 0 | 0 | 0 |
| dz.Caedo 1.4 | 8 | 5 | 596 | 0 | 0.35 | 1 | 1 | 0 |
| supersample.SuperTrackFire 1.0 | 8 | 6 | 596 | 0 | 0.31 | 0 | 0 | 0 |
| theo.QuarkSoup 1.5fga | 8 | 5 | 298 | 0 | 0.34 | 2 | 2 | 0 |
| nat.Samekh 0.4 | 8 | 7 | 0 | 0 | 0.37 | 1 | 1 | 0 |
| pl.Patton.GeneralPatton 1.54 | 8 | 6 | 0 | 0 | 0.27 | 2 | 2 | 0 |
| dcs.Eater_of_Worlds_Mini 1.0 | 8 | 7 | 298 | 0 | 0.30 | 0 | 0 | 0 |
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 7 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| theo.real.Ahab 1.0 | 8 | 6 | 298 | 0 | 0.40 | 1 | 1 | 0 |
| vjik.UnViolation 1.1 | 8 | 8 | 0 | 0 | 0.28 | 0 | 0 | 0 |
| bvh.tyr.Tyr 1.74 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| zezinho.QuerMePegarKKKK 1.0 | 8 | 6 | 157 | 0 | 0.35 | 1 | 0 | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 7 | 298 | 0 | 0.29 | 0 | 0 | 0 |
| apc.Colossus2 0.12 | 8 | 7 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| ara.Shera 0.88 | 8 | 7 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| dft.Immortal 1.40 | 8 | 7 | 0 | 0 | 0.35 | 1 | 1 | 0 |
| ethdsy.Malacka 2.4 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| dmh.robocode.robot.PinkPanther 1.1 | 8 | 5 | 0 | 0 | 0.39 | 3 | 3 | 0 |
| rtk.Tachikoma 1.0 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| tad.Dalek98 0.98 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| dk.stable.Gorgatron 1.1 | 8 | 6 | 596 | 0 | 0.39 | 0 | 0 | 0 |
| element.Earth 1.1 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| davidalves.Firebird 0.25 | 8 | 6 | 0 | 0 | 0.29 | 2 | 2 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 8 | 6 | 0 | 0 | 0.36 | 2 | 2 | 0 |
| kinsen.nano.Quarrelet 1.0 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 8 | 6 | 298 | 0 | 0.52 | 1 | 1 | 0 |
| tide.pear.Pear 0.62.1 | 8 | 5 | 0 | 0 | 0.25 | 3 | 3 | 0 |
| theo.avenge.Pequod 1.0 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| rz.Aleph 0.34 | 8 | 7 | 0 | 0 | 0.35 | 1 | 1 | 0 |
| oog.mini.AlphaDragon 0.1 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |

267 of 320 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | 5849 | 26 | 5784 | 5754 (98.4%) | 95 (1.6%) | 30 (0.5%) | 1019 | 140 | 31 |
| ahr.ice.Ice 1.0 | 5809 | 25 | 5808 | 5808 (100.0%) | 1 (0.0%) | 0 (0.0%) | 65 | 81 | 21 |
| wiki.WaveRammer 1.0 | 4849 | 21 | 4843 | 4841 (99.8%) | 8 (0.2%) | 2 (0.0%) | 1002 | 233 | 26 |
| pl.Drum 0.1 | 6755 | 30 | 6739 | 6728 (99.6%) | 27 (0.4%) | 11 (0.2%) | 445 | 131 | 33 |
| shrub.Silver v048 | 5372 | 16 | 5372 | 5372 (100.0%) | 0 (0.0%) | 0 (0.0%) | 30 | 62 | 13 |
| justin.DemonicRage 3.20 | 14122 | 15 | 14122 | 14122 (100.0%) | 0 (0.0%) | 0 (0.0%) | 680 | 153 | 54 |
| lorneswork.Predator 1.0 | 3756 | 10 | 3739 | 3737 (99.5%) | 19 (0.5%) | 2 (0.1%) | 115 | 135 | 21 |
| maribo.IotaCT 1.0 | 3866 | 26 | 3866 | 3865 (100.0%) | 1 (0.0%) | 1 (0.0%) | 36 | 94 | 22 |
| jcs.AutoBot 4.2.1 | 9136 | 40 | 9137 | 9136 (100.0%) | 0 (0.0%) | 1 (0.0%) | 684 | 131 | 35 |
| GarmBox.Oranges 1.0.1 | 4844 | 14 | 4851 | 4830 (99.7%) | 14 (0.3%) | 21 (0.4%) | 937 | 135 | 27 |
| zen.Ronin 1.0.0 | 0 | 0 | 0 | - | - | - | 0 | 0 | 0 |
| dz.Caedo 1.4 | 8550 | 21 | 8511 | 8510 (99.5%) | 40 (0.5%) | 1 (0.0%) | 66 | 182 | 83 |
| supersample.SuperTrackFire 1.0 | 5613 | 30 | 5624 | 5540 (98.7%) | 73 (1.3%) | 84 (1.5%) | 843 | 126 | 27 |
| theo.QuarkSoup 1.5fga | 11029 | 8 | 11027 | 11007 (99.8%) | 22 (0.2%) | 20 (0.2%) | 510 | 124 | 48 |
| nat.Samekh 0.4 | 13269 | 91 | 13269 | 13267 (100.0%) | 2 (0.0%) | 2 (0.0%) | 690 | 163 | 50 |
| pl.Patton.GeneralPatton 1.54 | 7906 | 24 | 7907 | 7902 (99.9%) | 4 (0.1%) | 5 (0.1%) | 375 | 124 | 21 |
| dcs.Eater_of_Worlds_Mini 1.0 | 5233 | 29 | 5217 | 5216 (99.7%) | 17 (0.3%) | 1 (0.0%) | 33 | 77 | 17 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2216 | 22 | 2211 | 2203 (99.4%) | 13 (0.6%) | 8 (0.4%) | 173 | 115 | 21 |
| theo.real.Ahab 1.0 | 14664 | 9 | 14689 | 14638 (99.8%) | 26 (0.2%) | 51 (0.3%) | 1241 | 123 | 92 |
| vjik.UnViolation 1.1 | 4811 | 28 | 4810 | 4808 (99.9%) | 3 (0.1%) | 2 (0.0%) | 114 | 172 | 24 |
| bvh.tyr.Tyr 1.74 | 5004 | 21 | 5004 | 5004 (100.0%) | 0 (0.0%) | 0 (0.0%) | 210 | 119 | 33 |
| zezinho.QuerMePegarKKKK 1.0 | 10330 | 33 | 10321 | 10318 (99.9%) | 12 (0.1%) | 3 (0.0%) | 897 | 166 | 40 |
| jwst.DAD.DarkAndDarker 1.1 | 6900 | 20 | 6882 | 6874 (99.6%) | 26 (0.4%) | 8 (0.1%) | 332 | 145 | 23 |
| apc.Colossus2 0.12 | 2096 | 13 | 2087 | 2076 (99.0%) | 20 (1.0%) | 11 (0.5%) | 104 | 118 | 19 |
| ara.Shera 0.88 | 7948 | 14 | 7950 | 7948 (100.0%) | 0 (0.0%) | 2 (0.0%) | 218 | 114 | 32 |
| dft.Immortal 1.40 | 11655 | 11 | 11710 | 11654 (100.0%) | 1 (0.0%) | 56 (0.5%) | 559 | 136 | 55 |
| ethdsy.Malacka 2.4 | 3252 | 17 | 3252 | 3249 (99.9%) | 3 (0.1%) | 3 (0.1%) | 148 | 105 | 22 |
| dmh.robocode.robot.PinkPanther 1.1 | 10749 | 369 | 10763 | 10738 (99.9%) | 11 (0.1%) | 25 (0.2%) | 530 | 105 | 74 |
| rtk.Tachikoma 1.0 | 11165 | 52 | 11164 | 11161 (100.0%) | 4 (0.0%) | 3 (0.0%) | 560 | 151 | 32 |
| tad.Dalek98 0.98 | 7360 | 20 | 7360 | 7360 (100.0%) | 0 (0.0%) | 0 (0.0%) | 130 | 93 | 19 |
| dk.stable.Gorgatron 1.1 | 4492 | 23 | 4506 | 4452 (99.1%) | 40 (0.9%) | 54 (1.2%) | 131 | 94 | 50 |
| element.Earth 1.1 | 10376 | 25 | 10376 | 10376 (100.0%) | 0 (0.0%) | 0 (0.0%) | 395 | 162 | 24 |
| davidalves.Firebird 0.25 | 14708 | 14 | 14719 | 14708 (100.0%) | 0 (0.0%) | 11 (0.1%) | 1135 | 114 | 34 |
| wcsv.Engineer.Engineer 0.5.4 | 14420 | 98 | 14422 | 14420 (100.0%) | 0 (0.0%) | 2 (0.0%) | 761 | 133 | 54 |
| kinsen.nano.Quarrelet 1.0 | 6408 | 22 | 6478 | 6392 (99.8%) | 16 (0.2%) | 86 (1.3%) | 801 | 114 | 27 |
| sheldor.mini.FoilistMC 1.0 | 25588 | 86 | 25567 | 25563 (99.9%) | 25 (0.1%) | 4 (0.0%) | 1744 | 224 | 133 |
| tide.pear.Pear 0.62.1 | 13042 | 369 | 13043 | 13023 (99.9%) | 19 (0.1%) | 20 (0.2%) | 1018 | 114 | 29 |
| theo.avenge.Pequod 1.0 | 10980 | 8 | 11037 | 10976 (100.0%) | 4 (0.0%) | 61 (0.6%) | 1138 | 81 | 39 |
| rz.Aleph 0.34 | 11948 | 12 | 11953 | 11948 (100.0%) | 0 (0.0%) | 5 (0.0%) | 662 | 113 | 45 |
| oog.mini.AlphaDragon 0.1 | 13482 | 57 | 13463 | 13457 (99.8%) | 25 (0.2%) | 6 (0.0%) | 893 | 195 | 47 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| marcinek.TopGun 1.3 | 5813 | 333 (5.7%) | 666 |
| ahr.ice.Ice 1.0 | 6081 | 382 (6.3%) | 1653 |
| wiki.WaveRammer 1.0 | 4352 | 284 (6.5%) | 876 |
| pl.Drum 0.1 | 6499 | 450 (6.9%) | 2062 |
| shrub.Silver v048 | 6067 | 255 (4.2%) | 720 |
| justin.DemonicRage 3.20 | 15809 | 1314 (8.3%) | 13691 |
| lorneswork.Predator 1.0 | 3679 | 191 (5.2%) | 0 |
| maribo.IotaCT 1.0 | 3741 | 222 (5.9%) | 0 |
| jcs.AutoBot 4.2.1 | 9905 | 777 (7.8%) | 6771 |
| GarmBox.Oranges 1.0.1 | 4690 | 451 (9.6%) | 3948 |
| zen.Ronin 1.0.0 | 0 | - | 0 |
| dz.Caedo 1.4 | 8712 | 594 (6.8%) | 3162 |
| supersample.SuperTrackFire 1.0 | 5855 | 384 (6.6%) | 1408 |
| theo.QuarkSoup 1.5fga | 13223 | 996 (7.5%) | 11111 |
| nat.Samekh 0.4 | 15399 | 1173 (7.6%) | 10817 |
| pl.Patton.GeneralPatton 1.54 | 7794 | 575 (7.4%) | 3050 |
| dcs.Eater_of_Worlds_Mini 1.0 | 5518 | 320 (5.8%) | 1202 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2507 | 57 (2.3%) | 0 |
| theo.real.Ahab 1.0 | 19337 | 1377 (7.1%) | 15686 |
| vjik.UnViolation 1.1 | 4413 | 523 (11.9%) | 2615 |
| bvh.tyr.Tyr 1.74 | 5005 | 301 (6.0%) | 593 |
| zezinho.QuerMePegarKKKK 1.0 | 10970 | 880 (8.0%) | 8405 |
| jwst.DAD.DarkAndDarker 1.1 | 6938 | 472 (6.8%) | 2732 |
| apc.Colossus2 0.12 | 2795 | 73 (2.6%) | 0 |
| ara.Shera 0.88 | 8886 | 785 (8.8%) | 6328 |
| dft.Immortal 1.40 | 14245 | 1297 (9.1%) | 11703 |
| ethdsy.Malacka 2.4 | 3454 | 199 (5.8%) | 0 |
| dmh.robocode.robot.PinkPanther 1.1 | 11435 | 822 (7.2%) | 6494 |
| rtk.Tachikoma 1.0 | 11305 | 768 (6.8%) | 5644 |
| tad.Dalek98 0.98 | 8508 | 624 (7.3%) | 3765 |
| dk.stable.Gorgatron 1.1 | 5132 | 388 (7.6%) | 2081 |
| element.Earth 1.1 | 10624 | 940 (8.8%) | 8647 |
| davidalves.Firebird 0.25 | 18669 | 1416 (7.6%) | 15666 |
| wcsv.Engineer.Engineer 0.5.4 | 15751 | 1353 (8.6%) | 13267 |
| kinsen.nano.Quarrelet 1.0 | 7628 | 467 (6.1%) | 2653 |
| sheldor.mini.FoilistMC 1.0 | 25463 | 2400 (9.4%) | 24094 |
| tide.pear.Pear 0.62.1 | 17388 | 1193 (6.9%) | 12880 |
| theo.avenge.Pequod 1.0 | 18004 | 1005 (5.6%) | 8437 |
| rz.Aleph 0.34 | 14118 | 1250 (8.9%) | 11007 |
| oog.mini.AlphaDragon 0.1 | 13570 | 1212 (8.9%) | 12182 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | 650 | 380 | 400 | 333 | 57.9 / 8.5 | 3028 | 4085 | 1156 |
| ahr.ice.Ice 1.0 | 650 | 339 | 400 | 346 | 55.3 / 15.5 | 3139 | 4240 | 712 |
| wiki.WaveRammer 1.0 | 650 | 241 | 541 | 267 | 80.8 / 40.6 | 3469 | 2378 | 109 |
| pl.Drum 0.1 | 650 | 345 | 406 | 373 | 65.5 / 22.8 | 3995 | 3814 | 1130 |
| shrub.Silver v048 | 650 | 332 | 400 | 354 | 67.7 / 4.8 | 4092 | 4655 | 243 |
| justin.DemonicRage 3.20 | 650 | 536 | 619 | 747 | 34.9 / 27.5 | 245 | 6214 | 0 |
| lorneswork.Predator 1.0 | 650 | 232 | 400 | 231 | 82.1 / 15.0 | 2904 | 2468 | 28 |
| maribo.IotaCT 1.0 | 650 | 334 | 400 | 230 | 74.4 / 10.8 | 2705 | 2824 | 83 |
| jcs.AutoBot 4.2.1 | 650 | 418 | 603 | 505 | 46.2 / 27.4 | 1899 | 4545 | 672 |
| GarmBox.Oranges 1.0.1 | 650 | 367 | 416 | 278 | 63.4 / 13.4 | 3181 | 3247 | 381 |
| zen.Ronin 1.0.0 | - | - | - | - | - | 0 | 0 | 0 |
| dz.Caedo 1.4 | 650 | 319 | 650 | 488 | 75.9 / 18.4 | 4404 | 3620 | 96 |
| supersample.SuperTrackFire 1.0 | 650 | 423 | 400 | 328 | 47.8 / 5.2 | 2035 | 5749 | 462 |
| theo.QuarkSoup 1.5fga | 650 | 486 | 650 | 647 | 36.2 / 29.4 | 414 | 4839 | 73 |
| nat.Samekh 0.4 | 650 | 490 | 641 | 729 | 32.4 / 31.2 | 279 | 6775 | 1877 |
| pl.Patton.GeneralPatton 1.54 | 650 | 364 | 447 | 436 | 61.4 / 22.8 | 3938 | 3247 | 1157 |
| dcs.Eater_of_Worlds_Mini 1.0 | 650 | 355 | 400 | 325 | 63.9 / 2.8 | 3663 | 4082 | 916 |
| com.syncleus.robocode.Dreadnaught 0.1 | 650 | 185 | 400 | 161 | 96.4 / 32.1 | 2022 | 2280 | 21 |
| theo.real.Ahab 1.0 | 650 | 526 | 616 | 876 | 28.1 / 27.6 | 180 | 8870 | 158 |
| vjik.UnViolation 1.1 | 650 | 357 | 463 | 267 | 93.3 / 18.7 | 3385 | 2651 | 187 |
| bvh.tyr.Tyr 1.74 | 650 | 392 | 431 | 299 | 71.2 / 14.7 | 3718 | 2287 | 6 |
| zezinho.QuerMePegarKKKK 1.0 | 650 | 399 | 566 | 565 | 55.6 / 27.4 | 2685 | 4150 | 227 |
| jwst.DAD.DarkAndDarker 1.1 | 650 | 348 | 409 | 394 | 61.2 / 17.8 | 3752 | 3663 | 1139 |
| apc.Colossus2 0.12 | 650 | 218 | 463 | 180 | 99.1 / 23.1 | 2228 | 1743 | 119 |
| ara.Shera 0.88 | 650 | 402 | 547 | 462 | 42.1 / 22.9 | 1277 | 6656 | 0 |
| dft.Immortal 1.40 | 650 | 500 | 650 | 693 | 35.2 / 28.4 | 328 | 3751 | 85 |
| ethdsy.Malacka 2.4 | 650 | 260 | 400 | 215 | 82.0 / 10.5 | 2546 | 2919 | 65 |
| dmh.robocode.robot.PinkPanther 1.1 | 650 | 593 | 619 | 606 | 26.5 / 31.6 | 415 | 12611 | 2109 |
| rtk.Tachikoma 1.0 | 650 | 476 | 616 | 569 | 45.9 / 25.1 | 1874 | 4518 | 761 |
| tad.Dalek98 0.98 | 650 | 489 | 481 | 440 | 39.0 / 18.1 | 806 | 8366 | 6 |
| dk.stable.Gorgatron 1.1 | 650 | 387 | 453 | 303 | 62.8 / 22.5 | 3432 | 3758 | 1351 |
| element.Earth 1.1 | 650 | 385 | 422 | 549 | 49.0 / 25.5 | 2246 | 3119 | 2540 |
| davidalves.Firebird 0.25 | 650 | 465 | 650 | 850 | 23.4 / 33.5 | 152 | 11184 | 212 |
| wcsv.Engineer.Engineer 0.5.4 | 650 | 461 | 650 | 746 | 28.3 / 34.1 | 371 | 7439 | 1826 |
| kinsen.nano.Quarrelet 1.0 | 650 | 484 | 531 | 401 | 37.8 / 23.4 | 1253 | 5343 | 4048 |
| sheldor.mini.FoilistMC 1.0 | 650 | 576 | 650 | 1139 | 36.4 / 26.8 | 455 | 6981 | 2717 |
| tide.pear.Pear 0.62.1 | 650 | 502 | 622 | 799 | 27.4 / 31.6 | 208 | 7710 | 573 |
| theo.avenge.Pequod 1.0 | 650 | 527 | 578 | 824 | 28.9 / 27.3 | 236 | 6699 | 379 |
| rz.Aleph 0.34 | 650 | 513 | 619 | 680 | 32.8 / 28.5 | 614 | 3586 | 139 |
| oog.mini.AlphaDragon 0.1 | 650 | 499 | 572 | 661 | 42.9 / 26.7 | 1152 | 4475 | 1427 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | 9.1% | 104 | 41 | 3 | 20.6 | 327 / 333 (98%) | 0 | 0 |
| ahr.ice.Ice 1.0 | 5.4% | 90 | 39 | 3 | 20.7 | 381 / 382 (100%) | 0 | 0 |
| wiki.WaveRammer 1.0 | 25.4% | 119 | 45 | 3 | 16.7 | 284 / 284 (100%) | 0 | 0 |
| pl.Drum 0.1 | 10.4% | 98 | 41 | 3 | 24.0 | 446 / 450 (99%) | 0 | 0 |
| shrub.Silver v048 | 2.5% | 82 | 34 | 3 | 19.2 | 255 / 255 (100%) | 0 | 0 |
| justin.DemonicRage 3.20 | 6.8% | 107 | 737 | 3 | 50.0 | 1314 / 1314 (100%) | 0 | 0 |
| lorneswork.Predator 1.0 | 9.8% | 81 | 36 | 3 | 13.3 | 191 / 191 (100%) | 0 | 0 |
| maribo.IotaCT 1.0 | 6.7% | 88 | 41 | 3 | 13.8 | 221 / 222 (100%) | 0 | 0 |
| jcs.AutoBot 4.2.1 | 10.9% | 89 | 176 | 3 | 32.4 | 774 / 777 (100%) | 0 | 0 |
| GarmBox.Oranges 1.0.1 | 7.5% | 92 | 36 | 3 | 17.3 | 448 / 451 (99%) | 0 | 0 |
| zen.Ronin 1.0.0 | - | 0 | 0 | 0 | - | - | 0 | 0 |
| dz.Caedo 1.4 | 13.0% | 98 | 343 | 3 | 30.2 | 590 / 594 (99%) | 0 | 0 |
| supersample.SuperTrackFire 1.0 | 2.0% | 87 | 93 | 3 | 20.1 | 376 / 384 (98%) | 0 | 0 |
| theo.QuarkSoup 1.5fga | 7.0% | 96 | 91 | 3 | 38.8 | 995 / 996 (100%) | 0 | 0 |
| nat.Samekh 0.4 | 7.4% | 104 | 121 | 3 | 47.2 | 1167 / 1173 (99%) | 0 | 0 |
| pl.Patton.GeneralPatton 1.54 | 9.1% | 76 | 98 | 3 | 27.9 | 575 / 575 (100%) | 0 | 0 |
| dcs.Eater_of_Worlds_Mini 1.0 | 1.6% | 83 | 33 | 3 | 18.6 | 320 / 320 (100%) | 0 | 0 |
| com.syncleus.robocode.Dreadnaught 0.1 | 26.3% | 87 | 37 | 3 | 7.4 | 57 / 57 (100%) | 0 | 0 |
| theo.real.Ahab 1.0 | 6.5% | 111 | 781 | 3 | 52.3 | 1370 / 1377 (99%) | 0 | 0 |
| vjik.UnViolation 1.1 | 20.8% | 78 | 40 | 3 | 17.1 | 523 / 523 (100%) | 0 | 0 |
| bvh.tyr.Tyr 1.74 | 10.6% | 86 | 40 | 3 | 17.7 | 301 / 301 (100%) | 0 | 0 |
| zezinho.QuerMePegarKKKK 1.0 | 13.1% | 99 | 398 | 3 | 36.7 | 880 / 880 (100%) | 0 | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 8.2% | 80 | 83 | 3 | 24.5 | 472 / 472 (100%) | 0 | 0 |
| apc.Colossus2 0.12 | 28.3% | 86 | 320 | 3 | 7.4 | 71 / 73 (97%) | 0 | 0 |
| ara.Shera 0.88 | 6.1% | 86 | 194 | 3 | 28.3 | 785 / 785 (100%) | 0 | 0 |
| dft.Immortal 1.40 | 6.7% | 97 | 69 | 3 | 41.7 | 1295 / 1297 (100%) | 0 | 0 |
| ethdsy.Malacka 2.4 | 8.5% | 83 | 23 | 3 | 11.6 | 199 / 199 (100%) | 0 | 0 |
| dmh.robocode.robot.PinkPanther 1.1 | 6.5% | 109 | 66 | 2 | 33.9 | 819 / 822 (100%) | 0 | 0 |
| rtk.Tachikoma 1.0 | 7.3% | 91 | 407 | 2 | 39.8 | 766 / 768 (100%) | 0 | 0 |
| tad.Dalek98 0.98 | 4.5% | 87 | 55 | 3 | 26.1 | 624 / 624 (100%) | 0 | 0 |
| dk.stable.Gorgatron 1.1 | 9.0% | 108 | 253 | 3 | 16.0 | 386 / 388 (99%) | 0 | 0 |
| element.Earth 1.1 | 7.9% | 84 | 108 | 3 | 37.0 | 939 / 940 (100%) | 0 | 0 |
| davidalves.Firebird 0.25 | 7.4% | 80 | 378 | 2 | 52.1 | 1416 / 1416 (100%) | 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 7.9% | 101 | 754 | 3 | 50.9 | 1344 / 1353 (99%) | 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 5.9% | 83 | 928 | 3 | 23.1 | 467 / 467 (100%) | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 7.7% | 145 | 7296 | 3 | 90.8 | 2394 / 2400 (100%) | 0 | 0 |
| tide.pear.Pear 0.62.1 | 6.9% | 70 | 69 | 3 | 45.9 | 1193 / 1193 (100%) | 0 | 0 |
| theo.avenge.Pequod 1.0 | 6.2% | 98 | 77 | 2 | 39.2 | 1005 / 1005 (100%) | 0 | 0 |
| rz.Aleph 0.34 | 6.5% | 97 | 245 | 3 | 42.5 | 1248 / 1250 (100%) | 0 | 0 |
| oog.mini.AlphaDragon 0.1 | 7.6% | 99 | 75 | 3 | 48.0 | 1205 / 1212 (99%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ahr.ice.Ice 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wiki.WaveRammer 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pl.Drum 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| shrub.Silver v048 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| justin.DemonicRage 3.20 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lorneswork.Predator 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| maribo.IotaCT 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jcs.AutoBot 4.2.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| GarmBox.Oranges 1.0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| zen.Ronin 1.0.0 | 0 / 0 | 0 | 0 |  |  | - | 0 |
| dz.Caedo 1.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| supersample.SuperTrackFire 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.QuarkSoup 1.5fga | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.Samekh 0.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pl.Patton.GeneralPatton 1.54 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dcs.Eater_of_Worlds_Mini 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| com.syncleus.robocode.Dreadnaught 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.real.Ahab 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| vjik.UnViolation 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.tyr.Tyr 1.74 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| zezinho.QuerMePegarKKKK 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apc.Colossus2 0.12 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ara.Shera 0.88 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dft.Immortal 1.40 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ethdsy.Malacka 2.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dmh.robocode.robot.PinkPanther 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rtk.Tachikoma 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tad.Dalek98 0.98 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dk.stable.Gorgatron 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| element.Earth 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.Firebird 0.25 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tide.pear.Pear 0.62.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.avenge.Pequod 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rz.Aleph 0.34 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| oog.mini.AlphaDragon 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | marcinek.TopGun | 1 | 35 | 292 | 5.1% | 3.1% ± 1.3 | 16.9% | 30.0% / 28.7% | 8.7% | 0 / 0 | T1/M? | 92% |
| ahr.ice.Ice 1.0 | ahr.ice.Ice | 1 | 35 | 276 | 5.8% | 3.9% ± 1.5 | 15.8% | 26.7% / 22.7% | 2.9% | 0 / 0 | T1/M? | 87% |
| wiki.WaveRammer 1.0 | wiki.WaveRammer | 1 | 35 | 292 | 22.9% | 6.5% ± 2.2 | 28.1% | 19.7% / 20.3% | 4.3% | 0 / 0 | T2/M? | 76% |
| pl.Drum 0.1 | pl.Drum | 1 | 35 | 260 | 12.1% | 7.4% ± 1.9 | 19.4% | 28.6% / 25.9% | 5.3% | 0 / 0 | T3/M? | 81% |
| shrub.Silver v048 | shrub.Silver | 1 | 35 | 282 | 2.2% | 1.2% ± 1.0 | 17.8% | 32.0% / 29.1% | 0.3% | 0 / 0 | T0/M? | 97% |
| justin.DemonicRage 3.20 | justin.DemonicRage | 1 | 35 | 306 | 8.1% | 8.7% ± 1.3 | 10.1% | 25.0% / 24.6% | 2.5% | 0 / 0 | T3/M1 | 65% |
| lorneswork.Predator 1.0 | lorneswork.Predator | 1 | 35 | 308 | 13.8% | 5.8% ± 2.2 | 27.9% | 22.2% / 22.1% | 2.7% | 0 / 0 | T2/M? | 88% |
| maribo.IotaCT 1.0 | maribo.IotaCT | 1 | 35 | 284 | 5.9% | 4.0% ± 1.9 | 25.0% | 38.8% / 36.2% | 20.6% | 0 / 0 | T1/M? | 95% |
| jcs.AutoBot 4.2.1 | jcs.AutoBot | 1 | 35 | 280 | 11.0% | 9.2% ± 1.8 | 14.5% | 25.9% / 23.3% | 2.7% | 0 / 0 | T3/M0 | 70% |
| GarmBox.Oranges 1.0.1 | GarmBox.Oranges | 1 | 35 | 296 | 9.5% | 5.5% ± 2.1 | 21.9% | 31.2% / 28.3% | 12.3% | 0 / 0 | T2/M? | 89% |
| zen.Ronin 1.0.0 | none |||||||||||
| dz.Caedo 1.4 | dz.Caedo | 1 | 35 | 264 | 12.7% | 6.3% ± 1.6 | 17.4% | 27.3% / 24.5% | 1.6% | 0 / 0 | T2/M0 | 92% |
| supersample.SuperTrackFire 1.0 | supersample.SuperTrackFire | 1 | 35 | 336 | 2.5% | 1.9% ± 1.2 | 15.9% | 38.4% / 35.9% | 4.3% | 0 / 0 | T0/M? | 96% |
| theo.QuarkSoup 1.5fga | theo.QuarkSoup | 1 | 35 | 294 | 8.0% | 7.9% ± 1.5 | 11.8% | 23.6% / 23.2% | 5.5% | 0 / 0 | T3/M1 | 71% |
| nat.Samekh 0.4 | nat.Samekh | 1 | 35 | 272 | 8.3% | 7.9% ± 1.3 | 10.7% | 23.0% / 24.1% | 4.0% | 0 / 0 | T3/M1 | 68% |
| pl.Patton.GeneralPatton 1.54 | pl.Patton.GeneralPatton | 1 | 35 | 326 | 11.0% | 6.8% ± 1.7 | 17.4% | 26.7% / 24.7% | 7.4% | 0 / 0 | T2/M0 | 78% |
| dcs.Eater_of_Worlds_Mini 1.0 | dcs.Eater_of_Worlds_Mini | 1 | 35 | 328 | 1.9% | 0.8% ± 0.9 | 20.4% | 31.5% / 26.7% | 13.2% | 0 / 0 | T0/M? | 98% |
| com.syncleus.robocode.Dreadnaught 0.1 | com.syncleus.robocode.Dreadnaught | 1 | 35 | 364 | 27.3% | 5.6% ± 2.9 | 39.9% | 15.9% / 15.2% | 2.1% | 0 / 0 | T2/M? | 84% |
| theo.real.Ahab 1.0 | theo.real.Ahab | 1 | 35 | 288 | 7.2% | 7.1% ± 1.2 | 10.2% | 22.1% / 21.6% | 2.1% | 0 / 0 | T3/M1 | 65% |
| vjik.UnViolation 1.1 | vjik.UnViolation | 1 | 35 | 296 | 19.8% | 8.9% ± 2.5 | 29.4% | 34.7% / 33.1% | 1.0% | 0 / 0 | T3/M? | 89% |
| bvh.tyr.Tyr 1.74 | bvh.tyr.Tyr | 1 | 35 | 278 | 11.3% | 3.7% ± 1.6 | 21.7% | 36.9% / 30.9% | 2.7% | 0 / 0 | T1/M? | 91% |
| zezinho.QuerMePegarKKKK 1.0 | zezinho.QuerMePegarKKKK | 1 | 35 | 324 | 12.1% | 9.2% ± 1.7 | 16.0% | 25.4% / 25.6% | 8.7% | 0 / 0 | T3/M0 | 71% |
| jwst.DAD.DarkAndDarker 1.1 | jwst.DAD.DarkAndDarker | 1 | 35 | 320 | 8.2% | 5.7% ± 1.5 | 16.3% | 29.5% / 27.4% | 8.2% | 0 / 0 | T2/M0 | 82% |
| apc.Colossus2 0.12 | apc.Colossus2 | 1 | 35 | 286 | 76.6% | 18.4% ± 4.5 | 40.8% | 24.2% / 22.0% | 3.4% | 0 / 0 | T?/M? | 76% |
| ara.Shera 0.88 | ara.Shera | 1 | 35 | 270 | 6.4% | 6.0% ± 1.6 | 13.2% | 28.6% / 24.9% | 4.2% | 0 / 0 | T2/M0 | 80% |
| dft.Immortal 1.40 | dft.Immortal | 1 | 35 | 282 | 7.1% | 7.2% ± 1.4 | 11.1% | 23.0% / 22.9% | 5.1% | 0 / 0 | T3/M1 | 73% |
| ethdsy.Malacka 2.4 | ethdsy.Malacka | 1 | 35 | 288 | 9.5% | 3.4% ± 2.0 | 30.1% | 24.5% / 24.5% | 9.7% | 0 / 0 | T1/M? | 93% |
| dmh.robocode.robot.PinkPanther 1.1 | dmh.robocode.robot.PinkPanther | 1 | 35 | 352 | 9.2% | 9.4% ± 1.5 | 10.2% | 26.6% / 23.9% | 4.3% | 0 / 0 | T3/M0 | 52% |
| rtk.Tachikoma 1.0 | rtk.Tachikoma | 1 | 35 | 284 | 8.3% | 7.6% ± 1.4 | 14.5% | 25.9% / 25.1% | 15.3% | 0 / 0 | T3/M0 | 77% |
| tad.Dalek98 0.98 | tad.Dalek98 | 1 | 35 | 278 | 4.7% | 5.1% ± 1.6 | 13.1% | 35.1% / 31.4% | 8.3% | 0 / 0 | T2/M? | 87% |
| dk.stable.Gorgatron 1.1 | dk.stable.Gorgatron | 1 | 35 | 308 | 10.9% | 10.9% ± 2.7 | 19.8% | 42.9% / 37.0% | 1.5% | 0 / 0 | T3/M? | 83% |
| element.Earth 1.1 | element.Earth | 1 | 35 | 284 | 9.5% | 6.6% ± 1.4 | 14.5% | 23.9% / 25.0% | 9.5% | 0 / 0 | T2/M1 | 74% |
| davidalves.Firebird 0.25 | davidalves.Firebird | 1 | 35 | 310 | 9.1% | 7.8% ± 1.3 | 9.2% | 21.1% / 24.6% | 4.6% | 0 / 0 | T3/M2 | 48% |
| wcsv.Engineer.Engineer 0.5.4 | wcsv.Engineer.Engineer | 1 | 35 | 324 | 8.5% | 7.4% ± 1.3 | 10.2% | 21.1% / 23.0% | 11.9% | 0 / 0 | T3/M1 | 60% |
| kinsen.nano.Quarrelet 1.0 | kinsen.nano.Quarrelet | 1 | 35 | 316 | 7.5% | 8.5% ± 2.1 | 14.8% | 30.0% / 27.0% | 5.8% | 0 / 0 | T3/M? | 77% |
| sheldor.mini.FoilistMC 1.0 | sheldor.mini.FoilistMC | 1 | 35 | 320 | 9.1% | 8.5% ± 1.1 | 11.3% | 24.5% / 23.9% | 3.5% | 0 / 0 | T3/M1 | 70% |
| tide.pear.Pear 0.62.1 | tide.pear.Pear | 1 | 35 | 294 | 7.4% | 7.5% ± 1.4 | 10.2% | 23.7% / 23.9% | 9.3% | 0 / 0 | T3/M1 | 64% |
| theo.avenge.Pequod 1.0 | theo.avenge.Pequod | 1 | 35 | 304 | 6.5% | 6.9% ± 1.4 | 10.3% | 21.8% / 21.5% | 2.2% | 0 / 0 | T2/M1 | 68% |
| rz.Aleph 0.34 | rz.Aleph | 1 | 35 | 266 | 6.5% | 7.1% ± 1.4 | 10.4% | 26.2% / 24.3% | 4.1% | 0 / 0 | T3/M0 | 75% |
| oog.mini.AlphaDragon 0.1 | oog.mini.AlphaDragon | 1 | 35 | 312 | 8.6% | 8.2% ± 1.4 | 12.3% | 25.1% / 23.5% | 4.5% | 0 / 0 | T3/M0 | 76% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.9 vs hadur2.Hadur 3.8.5

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| marcinek.TopGun 1.3 | 92.3% ± 2.2 | 72.2% ± 7.1 | +20.1 ± 8.2 |
| ahr.ice.Ice 1.0 | 86.9% ± 1.7 | 71.9% ± 6.2 | +15.0 ± 6.7 |
| wiki.WaveRammer 1.0 | 73.3% ± 3.2 | 51.2% ± 2.8 | +22.0 ± 4.2 |
| pl.Drum 0.1 | 83.4% ± 1.8 | 69.0% ± 5.5 | +14.4 ± 5.7 |
| shrub.Silver v048 | 96.2% ± 1.0 | 75.6% ± 4.8 | +20.5 ± 4.5 |
| justin.DemonicRage 3.20 | 73.3% ± 4.7 | 66.8% ± 2.0 | +6.5 ± 5.2 |
| lorneswork.Predator 1.0 | 90.1% ± 2.8 | 69.1% ± 4.6 | +21.1 ± 5.6 |
| maribo.IotaCT 1.0 | 92.9% ± 2.2 | 88.5% ± 2.2 | +4.4 ± 2.8 |
| jcs.AutoBot 4.2.1 | 74.6% ± 3.1 | 73.0% ± 4.1 | +1.5 ± 6.3 |
| GarmBox.Oranges 1.0.1 | 90.0% ± 2.3 | 77.8% ± 2.2 | +12.2 ± 3.4 |
| zen.Ronin 1.0.0 | n/a | n/a | n/a |
| dz.Caedo 1.4 | 85.4% ± 3.0 | 84.5% ± 3.5 | +0.8 ± 5.5 |
| supersample.SuperTrackFire 1.0 | 95.8% ± 0.8 | 95.4% ± 1.1 | +0.4 ± 1.4 |
| theo.QuarkSoup 1.5fga | 70.9% ± 4.2 | 76.5% ± 2.2 | -5.6 ± 5.3 |
| nat.Samekh 0.4 | 67.9% ± 4.9 | 66.5% ± 4.7 | +1.4 ± 5.5 |
| pl.Patton.GeneralPatton 1.54 | 80.6% ± 4.3 | 72.6% ± 4.3 | +8.0 ± 6.7 |
| dcs.Eater_of_Worlds_Mini 1.0 | 97.6% ± 1.0 | 90.9% ± 2.6 | +6.7 ± 2.8 |
| com.syncleus.robocode.Dreadnaught 0.1 | 84.4% ± 1.1 | 75.7% ± 1.2 | +8.7 ± 1.8 |
| theo.real.Ahab 1.0 | 66.3% ± 3.6 | 64.6% ± 3.8 | +1.6 ± 4.4 |
| vjik.UnViolation 1.1 | 90.0% ± 2.1 | 85.1% ± 1.3 | +4.9 ± 2.9 |
| bvh.tyr.Tyr 1.74 | 89.7% ± 4.0 | 84.6% ± 1.1 | +5.1 ± 4.9 |
| zezinho.QuerMePegarKKKK 1.0 | 76.5% ± 3.2 | 67.4% ± 3.5 | +9.1 ± 2.7 |
| jwst.DAD.DarkAndDarker 1.1 | 85.9% ± 1.9 | 68.7% ± 11.7 | +17.2 ± 11.8 |
| apc.Colossus2 0.12 | 89.0% ± 4.6 | 80.6% ± 0.8 | +8.4 ± 5.3 |
| ara.Shera 0.88 | 78.4% ± 2.3 | 77.4% ± 4.7 | +1.0 ± 4.2 |
| dft.Immortal 1.40 | 71.3% ± 3.0 | 73.2% ± 1.1 | -1.8 ± 3.6 |
| ethdsy.Malacka 2.4 | 93.6% ± 1.2 | 89.1% ± 3.8 | +4.5 ± 4.1 |
| dmh.robocode.robot.PinkPanther 1.1 | 65.8% ± 9.6 | 66.1% ± 3.5 | -0.3 ± 10.3 |
| rtk.Tachikoma 1.0 | 77.7% ± 2.6 | 79.1% ± 2.2 | -1.4 ± 4.7 |
| tad.Dalek98 0.98 | 83.2% ± 2.9 | 84.3% ± 2.7 | -1.0 ± 3.2 |
| dk.stable.Gorgatron 1.1 | 83.9% ± 4.2 | 78.8% ± 2.5 | +5.2 ± 4.4 |
| element.Earth 1.1 | 76.2% ± 2.4 | 77.2% ± 3.6 | -1.0 ± 3.7 |
| davidalves.Firebird 0.25 | 56.8% ± 3.9 | 57.8% ± 5.5 | -1.0 ± 5.6 |
| wcsv.Engineer.Engineer 0.5.4 | 61.0% ± 2.7 | 61.3% ± 5.4 | -0.3 ± 6.0 |
| kinsen.nano.Quarrelet 1.0 | 77.5% ± 2.4 | 79.2% ± 3.3 | -1.8 ± 4.3 |
| sheldor.mini.FoilistMC 1.0 | 72.6% ± 4.9 | 68.0% ± 4.8 | +4.6 ± 7.9 |
| tide.pear.Pear 0.62.1 | 65.1% ± 3.7 | 62.0% ± 2.5 | +3.1 ± 3.0 |
| theo.avenge.Pequod 1.0 | 66.2% ± 6.4 | 65.4% ± 2.7 | +0.9 ± 8.4 |
| rz.Aleph 0.34 | 71.5% ± 3.6 | 72.9% ± 2.2 | -1.4 ± 3.7 |
| oog.mini.AlphaDragon 0.1 | 75.9% ± 3.0 | 76.8% ± 2.8 | -0.9 ± 4.1 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| marcinek.TopGun 1.3 | +20.1 ± 8.2 | +20.0 ± 7.0 | +20.0 ± 7.0 | +19.6 ± 9.2 |
| ahr.ice.Ice 1.0 | +15.0 ± 6.7 | +16.8 ± 8.4 | +16.8 ± 8.4 | +12.1 ± 5.2 |
| wiki.WaveRammer 1.0 | +22.0 ± 4.2 | +40.0 ± 6.6 | +40.0 ± 6.6 | +13.0 ± 2.6 |
| pl.Drum 0.1 | +14.4 ± 5.7 | +19.7 ± 10.0 | +19.6 ± 10.1 | +9.8 ± 3.6 |
| shrub.Silver v048 | +20.5 ± 4.5 | +20.0 ± 7.6 | +20.0 ± 7.6 | +20.9 ± 3.3 |
| justin.DemonicRage 3.20 | +6.5 ± 5.2 | +6.4 ± 6.2 | +6.4 ± 6.2 | +6.4 ± 4.8 |
| lorneswork.Predator 1.0 | +21.1 ± 5.6 | +17.5 ± 8.5 | +17.5 ± 8.5 | +21.3 ± 4.2 |
| maribo.IotaCT 1.0 | +4.4 ± 2.8 | +1.1 ± 1.2 | +1.1 ± 1.2 | +6.8 ± 4.7 |
| jcs.AutoBot 4.2.1 | +1.5 ± 6.3 | +2.9 ± 7.4 | +2.9 ± 7.4 | +0.2 ± 6.0 |
| GarmBox.Oranges 1.0.1 | +12.2 ± 3.4 | +10.0 ± 3.8 | +10.0 ± 3.8 | +13.7 ± 4.6 |
| zen.Ronin 1.0.0 | n/a | n/a | n/a | n/a |
| dz.Caedo 1.4 | +0.8 ± 5.5 | +1.8 ± 7.9 | +1.8 ± 7.9 | +0.2 ± 4.4 |
| supersample.SuperTrackFire 1.0 | +0.4 ± 1.4 | +0.4 ± 0.8 | +0.4 ± 0.8 | +0.3 ± 2.5 |
| theo.QuarkSoup 1.5fga | -5.6 ± 5.3 | -6.1 ± 5.8 | -6.1 ± 5.8 | -4.2 ± 4.4 |
| nat.Samekh 0.4 | +1.4 ± 5.5 | +3.6 ± 7.5 | +3.6 ± 7.5 | -1.0 ± 4.3 |
| pl.Patton.GeneralPatton 1.54 | +8.0 ± 6.7 | +10.0 ± 9.9 | +10.0 ± 10.0 | +6.7 ± 5.1 |
| dcs.Eater_of_Worlds_Mini 1.0 | +6.7 ± 2.8 | +2.9 ± 2.9 | +2.9 ± 2.9 | +10.4 ± 3.2 |
| com.syncleus.robocode.Dreadnaught 0.1 | +8.7 ± 1.8 | +4.3 ± 2.9 | +4.3 ± 2.9 | +9.5 ± 1.8 |
| theo.real.Ahab 1.0 | +1.6 ± 4.4 | +2.5 ± 5.9 | +2.5 ± 5.9 | +0.2 ± 4.2 |
| vjik.UnViolation 1.1 | +4.9 ± 2.9 | +1.8 ± 2.2 | +1.8 ± 2.2 | +6.3 ± 3.6 |
| bvh.tyr.Tyr 1.74 | +5.1 ± 4.9 | +2.5 ± 5.2 | +2.5 ± 5.2 | +7.1 ± 4.8 |
| zezinho.QuerMePegarKKKK 1.0 | +9.1 ± 2.7 | +18.2 ± 5.1 | +18.2 ± 5.1 | +2.7 ± 2.0 |
| jwst.DAD.DarkAndDarker 1.1 | +17.2 ± 11.8 | +21.4 ± 15.5 | +21.4 ± 15.5 | +13.8 ± 8.4 |
| apc.Colossus2 0.12 | +8.4 ± 5.3 | -0.4 ± 0.8 | -0.4 ± 0.8 | +11.7 ± 7.0 |
| ara.Shera 0.88 | +1.0 ± 4.2 | +1.4 ± 4.0 | +1.4 ± 4.0 | +0.2 ± 4.1 |
| dft.Immortal 1.40 | -1.8 ± 3.6 | -5.0 ± 6.6 | -5.0 ± 6.6 | +2.2 ± 2.8 |
| ethdsy.Malacka 2.4 | +4.5 ± 4.1 | +1.8 ± 1.8 | +1.8 ± 1.8 | +5.8 ± 6.0 |
| dmh.robocode.robot.PinkPanther 1.1 | -0.3 ± 10.3 | -0.4 ± 9.6 | -0.4 ± 9.6 | +1.8 ± 11.3 |
| rtk.Tachikoma 1.0 | -1.4 ± 4.7 | -2.5 ± 5.9 | -2.5 ± 5.9 | -0.4 ± 3.9 |
| tad.Dalek98 0.98 | -1.0 ± 3.2 | -1.8 ± 3.4 | -1.8 ± 3.4 | +0.5 ± 5.5 |
| dk.stable.Gorgatron 1.1 | +5.2 ± 4.4 | +5.4 ± 3.9 | +5.4 ± 3.9 | +4.5 ± 5.1 |
| element.Earth 1.1 | -1.0 ± 3.7 | +0.4 ± 4.7 | +0.4 ± 4.7 | -1.9 ± 3.6 |
| davidalves.Firebird 0.25 | -1.0 ± 5.6 | -2.5 ± 7.6 | -2.5 ± 7.6 | +0.7 ± 2.8 |
| wcsv.Engineer.Engineer 0.5.4 | -0.3 ± 6.0 | -0.7 ± 9.0 | -0.7 ± 9.0 | +0.3 ± 4.2 |
| kinsen.nano.Quarrelet 1.0 | -1.8 ± 4.3 | -1.8 ± 4.2 | -1.8 ± 4.2 | -1.2 ± 4.7 |
| sheldor.mini.FoilistMC 1.0 | +4.6 ± 7.9 | +5.7 ± 9.5 | +5.7 ± 9.5 | +3.7 ± 7.4 |
| tide.pear.Pear 0.62.1 | +3.1 ± 3.0 | +3.2 ± 4.9 | +3.2 ± 4.9 | +3.4 ± 5.1 |
| theo.avenge.Pequod 1.0 | +0.9 ± 8.4 | +0.7 ± 10.3 | +0.7 ± 10.3 | +0.0 ± 6.9 |
| rz.Aleph 0.34 | -1.4 ± 3.7 | -1.4 ± 4.0 | -1.4 ± 4.0 | -1.5 ± 3.9 |
| oog.mini.AlphaDragon 0.1 | -0.9 ± 4.1 | -1.4 ± 6.1 | -1.4 ± 6.1 | -0.0 ± 3.7 |
| All pairs | +5.5 ± 1.1 | +5.6 ± 1.3 | +5.6 ± 1.3 | +5.3 ± 1.0 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| marcinek.TopGun 1.3 | 8 | 3 | +20.1 ± 8.2 | +25.1 ± 15.7 |
| ahr.ice.Ice 1.0 | 8 | 6 | +15.0 ± 6.7 | +13.3 ± 8.0 |
| wiki.WaveRammer 1.0 | 8 | 4 | +22.0 ± 4.2 | +22.7 ± 6.5 |
| pl.Drum 0.1 | 8 | 2 | +14.4 ± 5.7 | +5.3 ± 43.4 |
| shrub.Silver v048 | 8 | 5 | +20.5 ± 4.5 | +21.7 ± 8.4 |
| justin.DemonicRage 3.20 | 8 | 5 | +6.5 ± 5.2 | +6.3 ± 9.1 |
| lorneswork.Predator 1.0 | 8 | 6 | +21.1 ± 5.6 | +22.6 ± 7.0 |
| maribo.IotaCT 1.0 | 8 | 7 | +4.4 ± 2.8 | +4.1 ± 3.2 |
| jcs.AutoBot 4.2.1 | 8 | 8 | +1.5 ± 6.3 | +1.5 ± 6.3 |
| GarmBox.Oranges 1.0.1 | 8 | 6 | +12.2 ± 3.4 | +10.9 ± 3.9 |
| zen.Ronin 1.0.0 | 0 | 0 | n/a | n/a |
| dz.Caedo 1.4 | 8 | 4 | +0.8 ± 5.5 | -1.0 ± 8.2 |
| supersample.SuperTrackFire 1.0 | 8 | 5 | +0.4 ± 1.4 | +0.5 ± 1.7 |
| theo.QuarkSoup 1.5fga | 8 | 3 | -5.6 ± 5.3 | -3.1 ± 15.0 |
| nat.Samekh 0.4 | 8 | 7 | +1.4 ± 5.5 | +1.6 ± 6.6 |
| pl.Patton.GeneralPatton 1.54 | 8 | 4 | +8.0 ± 6.7 | +7.0 ± 15.1 |
| dcs.Eater_of_Worlds_Mini 1.0 | 8 | 6 | +6.7 ± 2.8 | +6.8 ± 3.0 |
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 5 | +8.7 ± 1.8 | +9.5 ± 1.7 |
| theo.real.Ahab 1.0 | 8 | 6 | +1.6 ± 4.4 | +3.4 ± 4.9 |
| vjik.UnViolation 1.1 | 8 | 8 | +4.9 ± 2.9 | +4.9 ± 2.9 |
| bvh.tyr.Tyr 1.74 | 8 | 7 | +5.1 ± 4.9 | +4.7 ± 5.8 |
| zezinho.QuerMePegarKKKK 1.0 | 8 | 3 | +9.1 ± 2.7 | +9.1 ± 9.8 |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 5 | +17.2 ± 11.8 | +21.0 ± 18.8 |
| apc.Colossus2 0.12 | 8 | 7 | +8.4 ± 5.3 | +7.8 ± 6.1 |
| ara.Shera 0.88 | 8 | 7 | +1.0 ± 4.2 | +1.4 ± 4.9 |
| dft.Immortal 1.40 | 8 | 6 | -1.8 ± 3.6 | -0.9 ± 4.8 |
| ethdsy.Malacka 2.4 | 8 | 5 | +4.5 ± 4.1 | +6.3 ± 5.9 |
| dmh.robocode.robot.PinkPanther 1.1 | 8 | 4 | -0.3 ± 10.3 | +5.3 ± 21.9 |
| rtk.Tachikoma 1.0 | 8 | 8 | -1.4 ± 4.7 | -1.4 ± 4.7 |
| tad.Dalek98 0.98 | 8 | 8 | -1.0 ± 3.2 | -1.0 ± 3.2 |
| dk.stable.Gorgatron 1.1 | 8 | 6 | +5.2 ± 4.4 | +6.6 ± 4.8 |
| element.Earth 1.1 | 8 | 7 | -1.0 ± 3.7 | -0.9 ± 4.4 |
| davidalves.Firebird 0.25 | 8 | 5 | -1.0 ± 5.6 | -2.4 ± 8.6 |
| wcsv.Engineer.Engineer 0.5.4 | 8 | 3 | -0.3 ± 6.0 | -3.9 ± 9.3 |
| kinsen.nano.Quarrelet 1.0 | 8 | 5 | -1.8 ± 4.3 | +0.9 ± 5.5 |
| sheldor.mini.FoilistMC 1.0 | 8 | 6 | +4.6 ± 7.9 | +6.5 ± 9.6 |
| tide.pear.Pear 0.62.1 | 8 | 3 | +3.1 ± 3.0 | +5.2 ± 12.8 |
| theo.avenge.Pequod 1.0 | 8 | 8 | +0.9 ± 8.4 | +0.9 ± 8.4 |
| rz.Aleph 0.34 | 8 | 6 | -1.4 ± 3.7 | -1.4 ± 4.6 |
| oog.mini.AlphaDragon 0.1 | 8 | 7 | -0.9 ± 4.1 | -2.1 ± 3.4 |
| All pairs | 312 | 216 | +5.5 ± 1.1 | +5.2 ± 1.2 |

# Bench: hadur2.Hadur 3.9 baseline (hadur2.Hadur 3.8.5) (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 3806 over 312 battles (12.2 per battle, most in one battle 51). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | weak | 72.2% ± 7.1 | 77.5% ± 7.2 | 67.8% ± 7.0 | 217 / 280 | 20.7% ± 1.6 | 13.5% ± 4.8 | 103 | 0 | 0.87 / 13.3 |
| ahr.ice.Ice 1.0 | weak | 71.9% ± 6.2 | 78.9% ± 7.5 | 66.0% ± 4.9 | 221 / 280 | 19.2% ± 1.3 | 9.7% ± 2.2 | 104 | 0 | 1.23 / 33.5 |
| wiki.WaveRammer 1.0 | weak | 51.2% ± 2.8 | 46.1% ± 5.0 | 53.7% ± 2.1 | 129 / 280 | 28.2% ± 2.1 | 30.7% ± 2.6 | 113 | 0 | 0.81 / 13.8 |
| pl.Drum 0.1 | weak | 69.0% ± 5.5 | 74.6% ± 9.2 | 64.4% ± 3.0 | 209 / 280 | 21.3% ± 2.7 | 13.8% ± 1.6 | 84 | 0 | 0.94 / 16.1 |
| shrub.Silver v048 | weak | 75.6% ± 4.8 | 78.9% ± 7.8 | 72.4% ± 3.4 | 221 / 280 | 20.6% ± 1.3 | 13.8% ± 2.6 | 75 | 0 | 0.80 / 13.4 |
| justin.DemonicRage 3.20 | mid | 66.8% ± 2.0 | 83.2% ± 2.0 | 49.6% ± 2.5 | 233 / 280 | 11.2% ± 0.4 | 7.5% ± 0.5 | 122 | 0 | 1.17 / 21.5 |
| lorneswork.Predator 1.0 | weak | 69.1% ± 4.6 | 79.6% ± 7.4 | 63.5% ± 3.2 | 223 / 280 | 39.4% ± 1.5 | 38.7% ± 5.9 | 77 | 0 | 0.68 / 12.3 |
| maribo.IotaCT 1.0 | weak | 88.5% ± 2.2 | 98.2% ± 1.8 | 80.7% ± 3.1 | 275 / 280 | 33.3% ± 2.6 | 8.7% ± 2.1 | 75 | 0 | 0.73 / 11.5 |
| jcs.AutoBot 4.2.1 | weak | 73.0% ± 4.1 | 85.4% ± 5.2 | 62.6% ± 4.3 | 239 / 280 | 18.0% ± 1.1 | 10.7% ± 1.2 | 110 | 0 | 1.27 / 15.1 |
| GarmBox.Oranges 1.0.1 | weak | 77.8% ± 2.2 | 88.2% ± 3.2 | 69.2% ± 2.0 | 247 / 280 | 23.4% ± 2.1 | 12.5% ± 0.7 | 99 | 0 | 0.86 / 13.3 |
| zen.Ronin 1.0.0 | mid | n/a | n/a | n/a | 0 / 0 | - | - | 0 | 0 | 0.00 / 0.0 | 8 battle(s) failed
| dz.Caedo 1.4 | weak | 84.5% ± 3.5 | 88.9% ± 5.5 | 80.3% ± 2.6 | 249 / 280 | 19.4% ± 1.1 | 12.7% ± 0.4 | 89 | 0 | 0.96 / 16.3 |
| supersample.SuperTrackFire 1.0 | weak | 95.4% ± 1.1 | 99.6% ± 0.8 | 89.9% ± 2.0 | 279 / 280 | 19.1% ± 0.9 | 2.0% ± 0.4 | 88 | 0 | 0.78 / 14.4 |
| theo.QuarkSoup 1.5fga | weak | 76.5% ± 2.2 | 92.9% ± 2.9 | 59.3% ± 1.9 | 260 / 280 | 12.2% ± 0.8 | 6.7% ± 0.4 | 100 | 0 | 0.99 / 16.5 |
| nat.Samekh 0.4 | mid | 66.5% ± 4.7 | 81.1% ± 6.0 | 51.9% ± 3.0 | 227 / 280 | 11.1% ± 0.2 | 7.1% ± 0.5 | 106 | 0 | 1.09 / 33.2 |
| pl.Patton.GeneralPatton 1.54 | weak | 72.6% ± 4.3 | 79.3% ± 7.2 | 66.3% ± 2.3 | 222 / 280 | 17.5% ± 1.0 | 11.0% ± 1.9 | 101 | 0 | 1.01 / 17.6 |
| dcs.Eater_of_Worlds_Mini 1.0 | weak | 90.9% ± 2.6 | 96.4% ± 2.1 | 85.5% ± 3.3 | 270 / 280 | 23.3% ± 1.4 | 5.4% ± 1.7 | 83 | 0 | 0.71 / 12.6 |
| com.syncleus.robocode.Dreadnaught 0.1 | weak | 75.7% ± 1.2 | 95.4% ± 2.5 | 65.6% ± 0.7 | 267 / 280 | 52.7% ± 2.0 | 40.8% ± 1.7 | 92 | 0 | 0.66 / 10.5 |
| theo.real.Ahab 1.0 | mid | 64.6% ± 3.8 | 77.9% ± 5.7 | 50.1% ± 2.2 | 218 / 280 | 10.3% ± 0.4 | 7.0% ± 0.3 | 108 | 0 | 1.56 / 18.4 |
| vjik.UnViolation 1.1 | weak | 85.1% ± 1.3 | 97.5% ± 2.0 | 77.3% ± 1.2 | 273 / 280 | 38.9% ± 0.9 | 37.2% ± 2.6 | 81 | 0 | 0.80 / 13.9 |
| bvh.tyr.Tyr 1.74 | weak | 84.6% ± 1.1 | 95.4% ± 2.2 | 76.2% ± 0.5 | 267 / 280 | 25.9% ± 1.4 | 12.9% ± 0.6 | 99 | 0 | 0.89 / 12.8 |
| zezinho.QuerMePegarKKKK 1.0 | weak | 67.4% ± 3.5 | 71.4% ± 5.1 | 64.4% ± 2.4 | 200 / 280 | 18.9% ± 1.4 | 13.0% ± 1.8 | 80 | 0 | 1.03 / 11.4 |
| jwst.DAD.DarkAndDarker 1.1 | weak | 68.7% ± 11.7 | 73.9% ± 16.2 | 63.8% ± 7.6 | 207 / 280 | 17.7% ± 0.6 | 13.6% ± 5.1 | 92 | 0 | 0.95 / 17.6 |
| apc.Colossus2 0.12 | weak | 80.6% ± 0.8 | 100.0% ± 0.0 | 70.6% ± 1.1 | 280 / 280 | 64.6% ± 2.0 | 67.4% ± 2.3 | 83 | 0 | 0.61 / 10.7 |
| ara.Shera 0.88 | weak | 77.4% ± 4.7 | 90.4% ± 4.9 | 64.6% ± 4.1 | 253 / 280 | 15.5% ± 0.9 | 6.7% ± 0.8 | 106 | 0 | 0.96 / 13.9 |
| dft.Immortal 1.40 | mid | 73.2% ± 1.1 | 91.8% ± 2.7 | 53.1% ± 2.8 | 257 / 280 | 11.3% ± 0.3 | 6.5% ± 0.4 | 97 | 0 | 1.01 / 16.7 |
| ethdsy.Malacka 2.4 | weak | 89.1% ± 3.8 | 97.9% ± 1.7 | 82.9% ± 5.5 | 274 / 280 | 40.1% ± 1.3 | 15.1% ± 3.8 | 78 | 0 | 0.74 / 11.8 |
| dmh.robocode.robot.PinkPanther 1.1 | weak | 66.1% ± 3.5 | 85.4% ± 3.2 | 43.3% ± 4.7 | 239 / 280 | 10.4% ± 0.5 | 6.1% ± 0.6 | 120 | 0 | 1.14 / 15.7 |
| rtk.Tachikoma 1.0 | weak | 79.1% ± 2.2 | 93.6% ± 2.1 | 65.1% ± 2.5 | 262 / 280 | 15.5% ± 0.8 | 7.5% ± 1.1 | 97 | 0 | 1.19 / 15.0 |
| tad.Dalek98 0.98 | weak | 84.3% ± 2.7 | 97.9% ± 2.1 | 67.9% ± 4.7 | 274 / 280 | 14.1% ± 1.2 | 4.3% ± 0.5 | 89 | 0 | 0.93 / 15.9 |
| dk.stable.Gorgatron 1.1 | weak | 78.8% ± 2.5 | 90.7% ± 3.1 | 69.5% ± 2.7 | 254 / 280 | 25.2% ± 2.3 | 10.4% ± 1.4 | 121 | 0 | 1.08 / 15.8 |
| element.Earth 1.1 | weak | 77.2% ± 3.6 | 86.8% ± 3.8 | 67.6% ± 3.7 | 243 / 280 | 17.0% ± 1.6 | 7.5% ± 0.7 | 97 | 0 | 0.88 / 18.0 |
| davidalves.Firebird 0.25 | mid | 57.8% ± 5.5 | 73.9% ± 7.6 | 40.4% ± 3.3 | 207 / 280 | 9.4% ± 0.3 | 7.6% ± 0.6 | 101 | 0 | 1.20 / 21.2 |
| wcsv.Engineer.Engineer 0.5.4 | mid | 61.3% ± 5.4 | 77.5% ± 7.9 | 44.9% ± 3.2 | 217 / 280 | 10.4% ± 0.5 | 8.3% ± 0.8 | 113 | 0 | 1.08 / 14.9 |
| kinsen.nano.Quarrelet 1.0 | weak | 79.2% ± 3.3 | 93.9% ± 3.2 | 62.8% ± 4.2 | 263 / 280 | 14.9% ± 0.8 | 5.6% ± 0.7 | 86 | 0 | 0.90 / 14.9 |
| sheldor.mini.FoilistMC 1.0 | mid | 68.0% ± 4.8 | 81.1% ± 5.7 | 53.8% ± 4.4 | 227 / 280 | 11.3% ± 0.6 | 7.4% ± 0.4 | 141 | 0 | 1.28 / 18.1 |
| tide.pear.Pear 0.62.1 | mid | 62.0% ± 2.5 | 79.3% ± 3.8 | 43.0% ± 4.0 | 222 / 280 | 10.2% ± 0.4 | 6.8% ± 0.4 | 84 | 0 | 1.00 / 16.1 |
| theo.avenge.Pequod 1.0 | mid | 65.4% ± 2.7 | 78.9% ± 2.5 | 51.1% ± 3.1 | 221 / 280 | 10.7% ± 0.4 | 6.7% ± 0.4 | 107 | 0 | 1.40 / 17.9 |
| rz.Aleph 0.34 | mid | 72.9% ± 2.2 | 90.0% ± 2.6 | 55.1% ± 2.2 | 252 / 280 | 11.5% ± 0.3 | 6.7% ± 0.4 | 93 | 0 | 1.00 / 15.8 |
| oog.mini.AlphaDragon 0.1 | weak | 76.8% ± 2.8 | 92.1% ± 4.0 | 61.6% ± 1.9 | 258 / 280 | 13.9% ± 0.5 | 7.6% ± 0.7 | 112 | 0 | 1.01 / 14.9 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. Duress is "n/a" for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | 8 | 5 | 437 | 0 | 0.37 | 2 | 2 | 0 |
| ahr.ice.Ice 1.0 | 8 | 6 | 0 | 1 | 0.37 | 2 | 2 | 0 |
| wiki.WaveRammer 1.0 | 8 | 4 | 0 | 1 | 0.40 | 4 | 4 | 0 |
| pl.Drum 0.1 | 8 | 2 | 0 | 0 | 0.30 | 6 | 6 | 0 |
| shrub.Silver v048 | 8 | 5 | 0 | 0 | 0.27 | 3 | 3 | 0 |
| justin.DemonicRage 3.20 | 8 | 7 | 596 | 0 | 0.44 | 0 | 0 | 0 |
| lorneswork.Predator 1.0 | 8 | 7 | 0 | 0 | 0.28 | 1 | 1 | 0 |
| maribo.IotaCT 1.0 | 8 | 7 | 0 | 0 | 0.27 | 1 | 1 | 0 |
| jcs.AutoBot 4.2.1 | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| GarmBox.Oranges 1.0.1 | 8 | 6 | 0 | 0 | 0.35 | 2 | 2 | 0 |
| zen.Ronin 1.0.0 | 8 | 0 | 0 | 0 | 0.00 | 0 | 0 | 0 |
| dz.Caedo 1.4 | 8 | 6 | 0 | 0 | 0.32 | 2 | 2 | 0 |
| supersample.SuperTrackFire 1.0 | 8 | 7 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| theo.QuarkSoup 1.5fga | 8 | 6 | 596 | 0 | 0.36 | 0 | 0 | 0 |
| nat.Samekh 0.4 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| pl.Patton.GeneralPatton 1.54 | 8 | 5 | 131 | 0 | 0.36 | 1 | 1 | 0 |
| dcs.Eater_of_Worlds_Mini 1.0 | 8 | 7 | 298 | 0 | 0.30 | 0 | 0 | 0 |
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 6 | 596 | 0 | 0.33 | 0 | 0 | 0 |
| theo.real.Ahab 1.0 | 8 | 8 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| vjik.UnViolation 1.1 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| bvh.tyr.Tyr 1.74 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| zezinho.QuerMePegarKKKK 1.0 | 8 | 4 | 0 | 0 | 0.29 | 4 | 3 | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 5 | 283 | 0 | 0.33 | 2 | 2 | 0 |
| apc.Colossus2 0.12 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| ara.Shera 0.88 | 8 | 7 | 0 | 0 | 0.38 | 1 | 0 | 0 |
| dft.Immortal 1.40 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| ethdsy.Malacka 2.4 | 8 | 5 | 570 | 0 | 0.28 | 1 | 1 | 0 |
| dmh.robocode.robot.PinkPanther 1.1 | 8 | 7 | 0 | 0 | 0.43 | 1 | 1 | 0 |
| rtk.Tachikoma 1.0 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| tad.Dalek98 0.98 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| dk.stable.Gorgatron 1.1 | 8 | 7 | 298 | 0 | 0.43 | 0 | 0 | 0 |
| element.Earth 1.1 | 8 | 7 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| davidalves.Firebird 0.25 | 8 | 7 | 0 | 0 | 0.36 | 1 | 1 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 8 | 5 | 1023 | 0 | 0.40 | 1 | 1 | 0 |
| kinsen.nano.Quarrelet 1.0 | 8 | 5 | 596 | 0 | 0.31 | 1 | 1 | 0 |
| sheldor.mini.FoilistMC 1.0 | 8 | 8 | 0 | 0 | 0.50 | 0 | 0 | 0 |
| tide.pear.Pear 0.62.1 | 8 | 6 | 0 | 0 | 0.30 | 2 | 2 | 0 |
| theo.avenge.Pequod 1.0 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| rz.Aleph 0.34 | 8 | 7 | 298 | 0 | 0.33 | 0 | 0 | 0 |
| oog.mini.AlphaDragon 0.1 | 8 | 7 | 0 | 0 | 0.40 | 1 | 1 | 0 |

251 of 320 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | 6831 | 30 | 6815 | 6774 (99.2%) | 57 (0.8%) | 41 (0.6%) | 908 | 164 | 45 |
| ahr.ice.Ice 1.0 | 6080 | 28 | 6080 | 6080 (100.0%) | 0 (0.0%) | 0 (0.0%) | 83 | 94 | 18 |
| wiki.WaveRammer 1.0 | 5838 | 22 | 5837 | 5835 (99.9%) | 3 (0.1%) | 2 (0.0%) | 183 | 208 | 32 |
| pl.Drum 0.1 | 7620 | 23 | 7622 | 7613 (99.9%) | 7 (0.1%) | 9 (0.1%) | 592 | 154 | 53 |
| shrub.Silver v048 | 6299 | 20 | 6299 | 6299 (100.0%) | 0 (0.0%) | 0 (0.0%) | 145 | 117 | 33 |
| justin.DemonicRage 3.20 | 15181 | 13 | 15130 | 15129 (99.7%) | 52 (0.3%) | 1 (0.0%) | 977 | 138 | 190 |
| lorneswork.Predator 1.0 | 5363 | 16 | 5361 | 5359 (99.9%) | 4 (0.1%) | 2 (0.0%) | 231 | 254 | 21 |
| maribo.IotaCT 1.0 | 4479 | 35 | 4478 | 4478 (100.0%) | 1 (0.0%) | 0 (0.0%) | 74 | 136 | 22 |
| jcs.AutoBot 4.2.1 | 9293 | 49 | 9294 | 9292 (100.0%) | 1 (0.0%) | 2 (0.0%) | 548 | 139 | 44 |
| GarmBox.Oranges 1.0.1 | 6298 | 14 | 6309 | 6280 (99.7%) | 18 (0.3%) | 29 (0.5%) | 1119 | 182 | 45 |
| zen.Ronin 1.0.0 | 0 | 0 | 0 | - | - | - | 0 | 0 | 0 |
| dz.Caedo 1.4 | 8716 | 36 | 8716 | 8716 (100.0%) | 0 (0.0%) | 0 (0.0%) | 115 | 189 | 36 |
| supersample.SuperTrackFire 1.0 | 5522 | 33 | 5593 | 5504 (99.7%) | 18 (0.3%) | 89 (1.6%) | 718 | 118 | 31 |
| theo.QuarkSoup 1.5fga | 10537 | 7 | 10501 | 10494 (99.6%) | 43 (0.4%) | 7 (0.1%) | 393 | 154 | 41 |
| nat.Samekh 0.4 | 12929 | 80 | 12925 | 12924 (100.0%) | 5 (0.0%) | 1 (0.0%) | 626 | 141 | 105 |
| pl.Patton.GeneralPatton 1.54 | 9175 | 27 | 9157 | 9151 (99.7%) | 24 (0.3%) | 6 (0.1%) | 520 | 158 | 261 |
| dcs.Eater_of_Worlds_Mini 1.0 | 5638 | 20 | 5618 | 5618 (99.6%) | 20 (0.4%) | 0 (0.0%) | 81 | 102 | 23 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3499 | 20 | 3469 | 3466 (99.1%) | 33 (0.9%) | 3 (0.1%) | 385 | 195 | 19 |
| theo.real.Ahab 1.0 | 14352 | 3 | 14404 | 14352 (100.0%) | 0 (0.0%) | 52 (0.4%) | 1127 | 146 | 48 |
| vjik.UnViolation 1.1 | 5512 | 13 | 5509 | 5507 (99.9%) | 5 (0.1%) | 2 (0.0%) | 205 | 247 | 29 |
| bvh.tyr.Tyr 1.74 | 5585 | 23 | 5568 | 5567 (99.7%) | 18 (0.3%) | 1 (0.0%) | 105 | 132 | 44 |
| zezinho.QuerMePegarKKKK 1.0 | 9534 | 19 | 9534 | 9531 (100.0%) | 3 (0.0%) | 3 (0.0%) | 629 | 165 | 48 |
| jwst.DAD.DarkAndDarker 1.1 | 8202 | 22 | 8184 | 8178 (99.7%) | 24 (0.3%) | 6 (0.1%) | 452 | 135 | 37 |
| apc.Colossus2 0.12 | 2403 | 26 | 2417 | 2403 (100.0%) | 0 (0.0%) | 14 (0.6%) | 94 | 197 | 18 |
| ara.Shera 0.88 | 7870 | 19 | 7870 | 7869 (100.0%) | 1 (0.0%) | 1 (0.0%) | 254 | 113 | 75 |
| dft.Immortal 1.40 | 12197 | 9 | 12204 | 12175 (99.8%) | 22 (0.2%) | 29 (0.2%) | 800 | 129 | 35 |
| ethdsy.Malacka 2.4 | 3455 | 16 | 3421 | 3418 (98.9%) | 37 (1.1%) | 3 (0.1%) | 177 | 107 | 24 |
| dmh.robocode.robot.PinkPanther 1.1 | 11479 | 314 | 11457 | 11427 (99.5%) | 52 (0.5%) | 30 (0.3%) | 700 | 105 | 68 |
| rtk.Tachikoma 1.0 | 11228 | 53 | 11230 | 11225 (100.0%) | 3 (0.0%) | 5 (0.0%) | 552 | 167 | 36 |
| tad.Dalek98 0.98 | 7708 | 29 | 7708 | 7708 (100.0%) | 0 (0.0%) | 0 (0.0%) | 174 | 81 | 38 |
| dk.stable.Gorgatron 1.1 | 4648 | 9 | 4679 | 4631 (99.6%) | 17 (0.4%) | 48 (1.0%) | 72 | 110 | 40 |
| element.Earth 1.1 | 10083 | 18 | 10062 | 10062 (99.8%) | 21 (0.2%) | 0 (0.0%) | 343 | 123 | 31 |
| davidalves.Firebird 0.25 | 14984 | 9 | 14988 | 14984 (100.0%) | 0 (0.0%) | 4 (0.0%) | 1119 | 139 | 46 |
| wcsv.Engineer.Engineer 0.5.4 | 14603 | 101 | 14533 | 14533 (99.5%) | 70 (0.5%) | 0 (0.0%) | 782 | 151 | 59 |
| kinsen.nano.Quarrelet 1.0 | 6480 | 16 | 6490 | 6428 (99.2%) | 52 (0.8%) | 62 (1.0%) | 808 | 140 | 29 |
| sheldor.mini.FoilistMC 1.0 | 25974 | 71 | 25975 | 25963 (100.0%) | 11 (0.0%) | 12 (0.0%) | 1911 | 210 | 214 |
| tide.pear.Pear 0.62.1 | 13312 | 461 | 13314 | 13285 (99.8%) | 27 (0.2%) | 29 (0.2%) | 1085 | 84 | 39 |
| theo.avenge.Pequod 1.0 | 10874 | 7 | 10947 | 10869 (100.0%) | 5 (0.0%) | 78 (0.7%) | 991 | 92 | 98 |
| rz.Aleph 0.34 | 11438 | 6 | 11420 | 11420 (99.8%) | 18 (0.2%) | 0 (0.0%) | 524 | 115 | 37 |
| oog.mini.AlphaDragon 0.1 | 13798 | 55 | 13801 | 13787 (99.9%) | 11 (0.1%) | 14 (0.1%) | 968 | 196 | 70 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| marcinek.TopGun 1.3 | 6488 | 383 (5.9%) | 934 |
| ahr.ice.Ice 1.0 | 6177 | 398 (6.4%) | 1682 |
| wiki.WaveRammer 1.0 | 5218 | 312 (6.0%) | 1337 |
| pl.Drum 0.1 | 7204 | 485 (6.7%) | 3405 |
| shrub.Silver v048 | 7083 | 338 (4.8%) | 112 |
| justin.DemonicRage 3.20 | 17623 | 1492 (8.5%) | 14305 |
| lorneswork.Predator 1.0 | 4780 | 360 (7.5%) | 1796 |
| maribo.IotaCT 1.0 | 4290 | 280 (6.5%) | 42 |
| jcs.AutoBot 4.2.1 | 10131 | 855 (8.4%) | 7146 |
| GarmBox.Oranges 1.0.1 | 5981 | 535 (8.9%) | 4322 |
| zen.Ronin 1.0.0 | 0 | - | 0 |
| dz.Caedo 1.4 | 8864 | 574 (6.5%) | 3055 |
| supersample.SuperTrackFire 1.0 | 5717 | 330 (5.8%) | 1093 |
| theo.QuarkSoup 1.5fga | 12757 | 950 (7.4%) | 8427 |
| nat.Samekh 0.4 | 15009 | 1197 (8.0%) | 12331 |
| pl.Patton.GeneralPatton 1.54 | 9111 | 715 (7.8%) | 6081 |
| dcs.Eater_of_Worlds_Mini 1.0 | 6042 | 316 (5.2%) | 904 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3600 | 141 (3.9%) | 0 |
| theo.real.Ahab 1.0 | 19068 | 1316 (6.9%) | 13960 |
| vjik.UnViolation 1.1 | 5232 | 518 (9.9%) | 3411 |
| bvh.tyr.Tyr 1.74 | 5507 | 307 (5.6%) | 202 |
| zezinho.QuerMePegarKKKK 1.0 | 9723 | 747 (7.7%) | 3843 |
| jwst.DAD.DarkAndDarker 1.1 | 8279 | 525 (6.3%) | 3455 |
| apc.Colossus2 0.12 | 3107 | 130 (4.2%) | 253 |
| ara.Shera 0.88 | 8724 | 728 (8.3%) | 6653 |
| dft.Immortal 1.40 | 15928 | 1345 (8.4%) | 13624 |
| ethdsy.Malacka 2.4 | 4184 | 213 (5.1%) | 321 |
| dmh.robocode.robot.PinkPanther 1.1 | 13080 | 918 (7.0%) | 7983 |
| rtk.Tachikoma 1.0 | 11382 | 796 (7.0%) | 5876 |
| tad.Dalek98 0.98 | 9060 | 621 (6.9%) | 4902 |
| dk.stable.Gorgatron 1.1 | 5288 | 360 (6.8%) | 1729 |
| element.Earth 1.1 | 10300 | 936 (9.1%) | 7862 |
| davidalves.Firebird 0.25 | 19036 | 1489 (7.8%) | 17130 |
| wcsv.Engineer.Engineer 0.5.4 | 16060 | 1364 (8.5%) | 13119 |
| kinsen.nano.Quarrelet 1.0 | 7694 | 446 (5.8%) | 2035 |
| sheldor.mini.FoilistMC 1.0 | 26207 | 2548 (9.7%) | 25158 |
| tide.pear.Pear 0.62.1 | 17675 | 1376 (7.8%) | 14335 |
| theo.avenge.Pequod 1.0 | 17466 | 1009 (5.8%) | 11581 |
| rz.Aleph 0.34 | 13674 | 1111 (8.1%) | 9860 |
| oog.mini.AlphaDragon 0.1 | 13901 | 1191 (8.6%) | 11734 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | 650 | 435 | 650 | 374 | 60.4 / 29.6 | 4190 | 2932 | 1265 |
| ahr.ice.Ice 1.0 | 650 | 371 | 556 | 357 | 56.0 / 29.4 | 3789 | 3898 | 356 |
| wiki.WaveRammer 1.0 | 650 | 334 | 650 | 313 | 69.9 / 60.4 | 4036 | 1272 | 39 |
| pl.Drum 0.1 | 650 | 425 | 650 | 415 | 59.4 / 32.9 | 4458 | 2676 | 1140 |
| shrub.Silver v048 | 650 | 382 | 650 | 408 | 66.9 / 25.7 | 4705 | 3273 | 223 |
| justin.DemonicRage 3.20 | 650 | 525 | 650 | 807 | 30.5 / 31.0 | 137 | 10777 | 0 |
| lorneswork.Predator 1.0 | 650 | 291 | 650 | 291 | 99.6 / 58.0 | 3829 | 1995 | 0 |
| maribo.IotaCT 1.0 | 650 | 392 | 400 | 261 | 74.6 / 18.1 | 3157 | 3167 | 87 |
| jcs.AutoBot 4.2.1 | 650 | 435 | 650 | 518 | 47.2 / 28.3 | 2163 | 4114 | 714 |
| GarmBox.Oranges 1.0.1 | 650 | 450 | 619 | 346 | 61.4 / 27.3 | 3823 | 3367 | 643 |
| zen.Ronin 1.0.0 | - | - | - | - | - | 0 | 0 | 0 |
| dz.Caedo 1.4 | 650 | 322 | 650 | 498 | 76.2 / 18.7 | 4572 | 3736 | 92 |
| supersample.SuperTrackFire 1.0 | 650 | 424 | 400 | 324 | 48.9 / 5.5 | 2152 | 5360 | 598 |
| theo.QuarkSoup 1.5fga | 650 | 480 | 650 | 625 | 37.9 / 26.0 | 399 | 4984 | 66 |
| nat.Samekh 0.4 | 650 | 488 | 650 | 713 | 33.0 / 30.6 | 178 | 5807 | 1649 |
| pl.Patton.GeneralPatton 1.54 | 650 | 417 | 563 | 498 | 56.5 / 28.8 | 4580 | 2516 | 1651 |
| dcs.Eater_of_Worlds_Mini 1.0 | 650 | 395 | 400 | 352 | 64.8 / 11.1 | 4221 | 4391 | 1585 |
| com.syncleus.robocode.Dreadnaught 0.1 | 650 | 276 | 650 | 225 | 101.9 / 53.5 | 2977 | 2616 | 174 |
| theo.real.Ahab 1.0 | 650 | 523 | 650 | 868 | 29.1 / 28.9 | 281 | 6982 | 195 |
| vjik.UnViolation 1.1 | 650 | 404 | 650 | 312 | 100.8 / 29.7 | 4146 | 2560 | 57 |
| bvh.tyr.Tyr 1.74 | 650 | 434 | 459 | 325 | 72.0 / 22.6 | 4061 | 2469 | 0 |
| zezinho.QuerMePegarKKKK 1.0 | 650 | 436 | 641 | 525 | 56.4 / 31.3 | 3696 | 3414 | 119 |
| jwst.DAD.DarkAndDarker 1.1 | 650 | 421 | 538 | 457 | 53.1 / 31.2 | 4012 | 2603 | 1327 |
| apc.Colossus2 0.12 | 650 | 237 | 650 | 199 | 114.3 / 47.6 | 2670 | 2047 | 170 |
| ara.Shera 0.88 | 650 | 405 | 575 | 457 | 43.8 / 24.2 | 1638 | 6113 | 0 |
| dft.Immortal 1.40 | 650 | 504 | 619 | 750 | 32.4 / 28.4 | 178 | 5221 | 153 |
| ethdsy.Malacka 2.4 | 650 | 288 | 497 | 255 | 87.0 / 18.6 | 2927 | 2600 | 104 |
| dmh.robocode.robot.PinkPanther 1.1 | 650 | 602 | 603 | 640 | 22.4 / 29.2 | 230 | 14883 | 2705 |
| rtk.Tachikoma 1.0 | 650 | 474 | 613 | 572 | 46.3 / 24.8 | 1642 | 4833 | 794 |
| tad.Dalek98 0.98 | 650 | 493 | 522 | 460 | 37.3 / 17.8 | 568 | 8259 | 41 |
| dk.stable.Gorgatron 1.1 | 650 | 410 | 556 | 311 | 63.4 / 27.9 | 3729 | 3962 | 1442 |
| element.Earth 1.1 | 650 | 391 | 456 | 535 | 48.4 / 23.2 | 2128 | 3326 | 2384 |
| davidalves.Firebird 0.25 | 650 | 470 | 650 | 862 | 23.2 / 34.4 | 106 | 11777 | 144 |
| wcsv.Engineer.Engineer 0.5.4 | 650 | 464 | 650 | 753 | 28.1 / 34.5 | 327 | 7635 | 1898 |
| kinsen.nano.Quarrelet 1.0 | 650 | 488 | 534 | 404 | 36.7 / 21.9 | 1052 | 5334 | 3702 |
| sheldor.mini.FoilistMC 1.0 | 650 | 569 | 572 | 1154 | 32.8 / 28.0 | 300 | 13118 | 2328 |
| tide.pear.Pear 0.62.1 | 650 | 506 | 647 | 807 | 24.2 / 32.0 | 190 | 8582 | 460 |
| theo.avenge.Pequod 1.0 | 650 | 530 | 650 | 805 | 30.8 / 29.5 | 297 | 5246 | 450 |
| rz.Aleph 0.34 | 650 | 509 | 603 | 657 | 34.4 / 28.1 | 270 | 4725 | 99 |
| oog.mini.AlphaDragon 0.1 | 650 | 511 | 638 | 675 | 42.3 / 26.3 | 938 | 4837 | 1353 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | 13.5% | 103 | 42 | 3 | 24.0 | 380 / 383 (99%) | 0 | 0 |
| ahr.ice.Ice 1.0 | 9.7% | 104 | 36 | 3 | 21.5 | 398 / 398 (100%) | 0 | 0 |
| wiki.WaveRammer 1.0 | 30.7% | 113 | 270 | 3 | 20.5 | 312 / 312 (100%) | 0 | 0 |
| pl.Drum 0.1 | 13.8% | 84 | 2369 | 3 | 26.6 | 484 / 485 (100%) | 0 | 0 |
| shrub.Silver v048 | 13.8% | 75 | 34 | 3 | 22.1 | 338 / 338 (100%) | 0 | 0 |
| justin.DemonicRage 3.20 | 7.5% | 122 | 896 | 3 | 53.9 | 1489 / 1492 (100%) | 0 | 0 |
| lorneswork.Predator 1.0 | 38.7% | 77 | 57 | 3 | 19.0 | 360 / 360 (100%) | 0 | 0 |
| maribo.IotaCT 1.0 | 8.7% | 75 | 32 | 3 | 16.0 | 280 / 280 (100%) | 0 | 0 |
| jcs.AutoBot 4.2.1 | 10.7% | 110 | 3105 | 3 | 33.1 | 850 / 855 (99%) | 0 | 0 |
| GarmBox.Oranges 1.0.1 | 12.5% | 99 | 276 | 3 | 22.2 | 534 / 535 (100%) | 0 | 0 |
| zen.Ronin 1.0.0 | - | 0 | 0 | 0 | - | - | 0 | 0 |
| dz.Caedo 1.4 | 12.7% | 89 | 198 | 3 | 30.8 | 573 / 574 (100%) | 0 | 0 |
| supersample.SuperTrackFire 1.0 | 2.0% | 88 | 1170 | 3 | 19.9 | 327 / 330 (99%) | 0 | 0 |
| theo.QuarkSoup 1.5fga | 6.7% | 100 | 479 | 3 | 37.5 | 948 / 950 (100%) | 0 | 0 |
| nat.Samekh 0.4 | 7.1% | 106 | 83 | 3 | 46.1 | 1189 / 1197 (99%) | 0 | 0 |
| pl.Patton.GeneralPatton 1.54 | 11.0% | 101 | 292 | 3 | 32.4 | 710 / 715 (99%) | 0 | 0 |
| dcs.Eater_of_Worlds_Mini 1.0 | 5.4% | 83 | 35 | 3 | 20.1 | 316 / 316 (100%) | 0 | 0 |
| com.syncleus.robocode.Dreadnaught 0.1 | 40.8% | 92 | 28 | 3 | 12.4 | 140 / 141 (99%) | 0 | 0 |
| theo.real.Ahab 1.0 | 7.0% | 108 | 74 | 3 | 51.4 | 1314 / 1316 (100%) | 0 | 0 |
| vjik.UnViolation 1.1 | 37.2% | 81 | 106 | 3 | 19.6 | 517 / 518 (100%) | 0 | 0 |
| bvh.tyr.Tyr 1.74 | 12.9% | 99 | 46 | 3 | 19.9 | 304 / 307 (99%) | 0 | 0 |
| zezinho.QuerMePegarKKKK 1.0 | 13.0% | 80 | 60 | 3 | 33.5 | 746 / 747 (100%) | 0 | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 13.6% | 92 | 194 | 3 | 28.9 | 524 / 525 (100%) | 0 | 0 |
| apc.Colossus2 0.12 | 67.4% | 83 | 33 | 3 | 8.6 | 130 / 130 (100%) | 0 | 0 |
| ara.Shera 0.88 | 6.7% | 106 | 55 | 3 | 28.0 | 728 / 728 (100%) | 0 | 0 |
| dft.Immortal 1.40 | 6.5% | 97 | 98 | 3 | 43.5 | 1341 / 1345 (100%) | 0 | 0 |
| ethdsy.Malacka 2.4 | 15.1% | 78 | 30 | 3 | 12.1 | 213 / 213 (100%) | 0 | 0 |
| dmh.robocode.robot.PinkPanther 1.1 | 6.1% | 120 | 74 | 3 | 38.4 | 916 / 918 (100%) | 0 | 0 |
| rtk.Tachikoma 1.0 | 7.5% | 97 | 5215 | 2 | 40.0 | 794 / 796 (100%) | 0 | 0 |
| tad.Dalek98 0.98 | 4.3% | 89 | 4686 | 3 | 27.5 | 620 / 621 (100%) | 0 | 0 |
| dk.stable.Gorgatron 1.1 | 10.4% | 121 | 104 | 3 | 16.7 | 357 / 360 (99%) | 0 | 0 |
| element.Earth 1.1 | 7.5% | 97 | 354 | 3 | 35.9 | 934 / 936 (100%) | 0 | 0 |
| davidalves.Firebird 0.25 | 7.6% | 101 | 222 | 3 | 53.1 | 1487 / 1489 (100%) | 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 8.3% | 113 | 78 | 3 | 51.6 | 1350 / 1364 (99%) | 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 5.6% | 86 | 220 | 3 | 23.0 | 444 / 446 (100%) | 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 7.4% | 141 | 1754 | 3 | 92.5 | 2537 / 2548 (100%) | 0 | 0 |
| tide.pear.Pear 0.62.1 | 6.8% | 84 | 714 | 3 | 47.2 | 1375 / 1376 (100%) | 0 | 0 |
| theo.avenge.Pequod 1.0 | 6.7% | 107 | 358 | 3 | 39.0 | 1009 / 1009 (100%) | 0 | 0 |
| rz.Aleph 0.34 | 6.7% | 93 | 153 | 3 | 40.8 | 1110 / 1111 (100%) | 0 | 0 |
| oog.mini.AlphaDragon 0.1 | 7.6% | 112 | 295 | 3 | 49.1 | 1190 / 1191 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| marcinek.TopGun 1.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ahr.ice.Ice 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wiki.WaveRammer 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pl.Drum 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| shrub.Silver v048 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| justin.DemonicRage 3.20 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| lorneswork.Predator 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| maribo.IotaCT 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jcs.AutoBot 4.2.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| GarmBox.Oranges 1.0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| zen.Ronin 1.0.0 | 0 / 0 | 0 | 0 |  |  | - | 0 |
| dz.Caedo 1.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| supersample.SuperTrackFire 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.QuarkSoup 1.5fga | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.Samekh 0.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pl.Patton.GeneralPatton 1.54 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dcs.Eater_of_Worlds_Mini 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| com.syncleus.robocode.Dreadnaught 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.real.Ahab 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| vjik.UnViolation 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bvh.tyr.Tyr 1.74 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| zezinho.QuerMePegarKKKK 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apc.Colossus2 0.12 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ara.Shera 0.88 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dft.Immortal 1.40 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ethdsy.Malacka 2.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dmh.robocode.robot.PinkPanther 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rtk.Tachikoma 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tad.Dalek98 0.98 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dk.stable.Gorgatron 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| element.Earth 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.Firebird 0.25 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wcsv.Engineer.Engineer 0.5.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kinsen.nano.Quarrelet 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sheldor.mini.FoilistMC 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tide.pear.Pear 0.62.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| theo.avenge.Pequod 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rz.Aleph 0.34 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| oog.mini.AlphaDragon 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 97.5% ± 5.9 | +2.5 ± 10.7 | 75.5% ± 7.6 | 84.6% ± 6.3 | +9.1 ± 7.7 |
| GarmBox.Oranges 1.0.1 | hadur2.Hadur 3.8.5 | 8 | 97.5% ± 5.9 | 89.6% ± 8.1 | -7.9 ± 11.9 | 77.7% ± 4.6 | 67.7% ± 3.7 | -10.0 ± 7.6 |
| ahr.ice.Ice 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 69.9% ± 4.9 | 83.9% ± 3.9 | +14.0 ± 7.0 |
| ahr.ice.Ice 1.0 | hadur2.Hadur 3.8.5 | 8 | 95.0% ± 7.7 | 60.4% ± 14.3 | -34.6 ± 15.8 | 71.9% ± 5.4 | 54.6% ± 6.1 | -17.3 ± 9.8 |
| apc.Colossus2 0.12 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 68.3% ± 3.9 | 84.3% ± 7.1 | +16.0 ± 3.9 |
| apc.Colossus2 0.12 | hadur2.Hadur 3.8.5 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 66.2% ± 1.4 | 69.9% ± 1.6 | +3.7 ± 1.6 |
| ara.Shera 0.88 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 93.8% ± 4.3 | +6.3 ± 14.8 | 56.2% ± 9.4 | 67.3% ± 4.6 | +11.1 ± 12.6 |
| ara.Shera 0.88 | hadur2.Hadur 3.8.5 | 8 | 84.4% ± 12.1 | 90.0% ± 6.3 | +5.6 ± 13.3 | 55.9% ± 9.7 | 65.5% ± 8.3 | +9.6 ± 13.9 |
| bvh.tyr.Tyr 1.74 | hadur2.Hadur 3.9 | 8 | 92.5% ± 12.4 | 97.5% ± 3.9 | +5.0 ± 10.9 | 74.4% ± 8.0 | 85.7% ± 5.6 | +11.3 ± 7.4 |
| bvh.tyr.Tyr 1.74 | hadur2.Hadur 3.8.5 | 8 | 97.5% ± 5.9 | 93.8% ± 6.2 | -3.7 ± 9.9 | 79.2% ± 6.7 | 74.9% ± 3.6 | -4.4 ± 8.3 |
| com.syncleus.robocode.Dreadnaught 0.1 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 61.9% ± 2.8 | 76.0% ± 4.5 | +14.2 ± 5.1 |
| com.syncleus.robocode.Dreadnaught 0.1 | hadur2.Hadur 3.8.5 | 8 | 90.0% ± 8.9 | 97.5% ± 3.9 | +7.5 ± 11.6 | 59.8% ± 3.7 | 62.4% ± 1.2 | +2.6 ± 4.3 |
| davidalves.Firebird 0.25 | hadur2.Hadur 3.9 | 8 | 70.0% ± 20.0 | 68.3% ± 13.7 | -1.7 ± 21.3 | 41.6% ± 7.6 | 40.4% ± 4.4 | -1.1 ± 7.8 |
| davidalves.Firebird 0.25 | hadur2.Hadur 3.8.5 | 8 | 67.5% ± 19.9 | 76.1% ± 14.0 | +8.6 ± 13.6 | 42.8% ± 5.0 | 38.7% ± 6.1 | -4.1 ± 5.6 |
| dcs.Eater_of_Worlds_Mini 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 94.7% ± 3.9 | 96.4% ± 1.4 | +1.7 ± 3.5 |
| dcs.Eater_of_Worlds_Mini 1.0 | hadur2.Hadur 3.8.5 | 8 | 100.0% ± 0.0 | 96.2% ± 4.3 | -3.7 ± 4.3 | 91.4% ± 4.5 | 82.1% ± 4.0 | -9.3 ± 5.4 |
| dft.Immortal 1.40 | hadur2.Hadur 3.9 | 8 | 72.5% ± 17.7 | 86.0% ± 7.9 | +13.5 ± 21.3 | 45.8% ± 6.6 | 54.4% ± 5.7 | +8.6 ± 8.5 |
| dft.Immortal 1.40 | hadur2.Hadur 3.8.5 | 8 | 97.5% ± 5.9 | 92.5% ± 7.4 | -5.0 ± 10.9 | 47.2% ± 7.2 | 53.3% ± 4.2 | +6.1 ± 7.2 |
| dk.stable.Gorgatron 1.1 | hadur2.Hadur 3.9 | 8 | 92.5% ± 12.4 | 97.5% ± 3.9 | +5.0 ± 14.1 | 63.7% ± 6.5 | 76.3% ± 5.2 | +12.6 ± 8.3 |
| dk.stable.Gorgatron 1.1 | hadur2.Hadur 3.8.5 | 8 | 100.0% ± 0.0 | 90.0% ± 7.7 | -10.0 ± 7.7 | 66.5% ± 4.5 | 65.6% ± 4.7 | -0.8 ± 8.7 |
| dmh.robocode.robot.PinkPanther 1.1 | hadur2.Hadur 3.9 | 8 | 85.0% ± 11.8 | 85.7% ± 6.3 | +0.7 ± 10.7 | 48.1% ± 10.8 | 40.3% ± 9.6 | -7.8 ± 13.5 |
| dmh.robocode.robot.PinkPanther 1.1 | hadur2.Hadur 3.8.5 | 8 | 77.5% ± 10.7 | 87.5% ± 5.9 | +10.0 ± 14.1 | 43.0% ± 13.8 | 43.8% ± 6.7 | +0.8 ± 14.9 |
| dz.Caedo 1.4 | hadur2.Hadur 3.9 | 8 | 85.0% ± 11.8 | 95.0% ± 6.3 | +10.0 ± 14.8 | 72.7% ± 6.0 | 83.3% ± 6.0 | +10.6 ± 7.4 |
| dz.Caedo 1.4 | hadur2.Hadur 3.8.5 | 8 | 85.0% ± 14.8 | 92.2% ± 4.0 | +7.2 ± 14.8 | 69.4% ± 4.9 | 83.6% ± 5.2 | +14.3 ± 8.2 |
| element.Earth 1.1 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 88.8% ± 9.4 | +1.2 ± 15.1 | 71.0% ± 6.7 | 63.6% ± 3.9 | -7.4 ± 7.3 |
| element.Earth 1.1 | hadur2.Hadur 3.8.5 | 8 | 92.5% ± 8.7 | 85.0% ± 13.4 | -7.5 ± 10.7 | 73.4% ± 8.2 | 65.4% ± 5.0 | -8.1 ± 5.1 |
| ethdsy.Malacka 2.4 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 80.8% ± 4.3 | 87.3% ± 4.3 | +6.5 ± 6.2 |
| ethdsy.Malacka 2.4 | hadur2.Hadur 3.8.5 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 75.9% ± 5.9 | 81.5% ± 7.9 | +5.6 ± 9.9 |
| jcs.AutoBot 4.2.1 | hadur2.Hadur 3.9 | 8 | 80.0% ± 12.6 | 88.8% ± 11.3 | +8.8 ± 15.8 | 54.1% ± 8.3 | 64.9% ± 5.2 | +10.9 ± 10.7 |
| jcs.AutoBot 4.2.1 | hadur2.Hadur 3.8.5 | 8 | 80.0% ± 12.6 | 88.8% ± 7.0 | +8.8 ± 17.0 | 60.2% ± 4.3 | 63.9% ± 5.2 | +3.7 ± 7.7 |
| justin.DemonicRage 3.20 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 88.2% ± 12.5 | -6.8 ± 15.2 | 59.8% ± 7.3 | 51.1% ± 10.2 | -8.8 ± 11.2 |
| justin.DemonicRage 3.20 | hadur2.Hadur 3.8.5 | 8 | 80.0% ± 8.9 | 85.0% ± 8.9 | +5.0 ± 10.9 | 49.3% ± 5.8 | 53.4% ± 10.1 | +4.1 ± 12.7 |
| jwst.DAD.DarkAndDarker 1.1 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 97.5% ± 3.9 | +5.0 ± 10.9 | 70.3% ± 5.8 | 80.2% ± 4.7 | +9.9 ± 9.1 |
| jwst.DAD.DarkAndDarker 1.1 | hadur2.Hadur 3.8.5 | 8 | 92.5% ± 8.7 | 64.0% ± 23.9 | -28.5 ± 26.0 | 66.4% ± 5.2 | 58.4% ± 9.6 | -7.9 ± 13.2 |
| kinsen.nano.Quarrelet 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 90.0% ± 4.5 | -7.5 ± 9.7 | 62.0% ± 7.0 | 59.8% ± 6.4 | -2.2 ± 8.4 |
| kinsen.nano.Quarrelet 1.0 | hadur2.Hadur 3.8.5 | 8 | 95.0% ± 7.7 | 95.0% ± 6.3 | +0.0 ± 11.8 | 58.1% ± 10.6 | 62.8% ± 6.1 | +4.7 ± 12.2 |
| lorneswork.Predator 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 80.8% ± 8.5 | 90.9% ± 1.7 | +10.1 ± 8.5 |
| lorneswork.Predator 1.0 | hadur2.Hadur 3.8.5 | 8 | 95.0% ± 7.7 | 78.6% ± 15.0 | -16.4 ± 19.4 | 80.4% ± 8.5 | 58.7% ± 1.6 | -21.7 ± 9.1 |
| marcinek.TopGun 1.3 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 100.0% ± 0.0 | +7.5 ± 8.7 | 73.5% ± 7.9 | 94.3% ± 2.6 | +20.8 ± 7.5 |
| marcinek.TopGun 1.3 | hadur2.Hadur 3.8.5 | 8 | 100.0% ± 0.0 | 70.1% ± 11.7 | -29.9 ± 11.7 | 80.5% ± 7.0 | 61.6% ± 4.1 | -18.9 ± 7.3 |
| maribo.IotaCT 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 83.9% ± 3.0 | 89.2% ± 3.3 | +5.3 ± 5.7 |
| maribo.IotaCT 1.0 | hadur2.Hadur 3.8.5 | 8 | 100.0% ± 0.0 | 97.5% ± 5.9 | -2.5 ± 5.9 | 84.6% ± 5.5 | 78.2% ± 5.2 | -6.4 ± 8.2 |
| nat.Samekh 0.4 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 86.1% ± 11.7 | -8.9 ± 12.2 | 56.8% ± 7.2 | 49.7% ± 7.7 | -7.1 ± 10.6 |
| nat.Samekh 0.4 | hadur2.Hadur 3.8.5 | 8 | 82.5% ± 14.0 | 78.8% ± 12.2 | -3.8 ± 18.4 | 53.8% ± 8.8 | 52.7% ± 3.9 | -1.0 ± 9.5 |
| oog.mini.AlphaDragon 0.1 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 91.3% ± 7.0 | -3.7 ± 7.7 | 58.0% ± 9.5 | 64.1% ± 4.8 | +6.1 ± 10.1 |
| oog.mini.AlphaDragon 0.1 | hadur2.Hadur 3.8.5 | 8 | 85.0% ± 11.8 | 92.1% ± 9.5 | +7.1 ± 8.6 | 55.2% ± 3.8 | 63.9% ± 8.2 | +8.7 ± 7.5 |
| pl.Drum 0.1 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 96.3% ± 4.3 | +1.2 ± 10.4 | 74.3% ± 3.6 | 74.0% ± 4.2 | -0.3 ± 4.5 |
| pl.Drum 0.1 | hadur2.Hadur 3.8.5 | 8 | 95.0% ± 7.7 | 61.7% ± 17.1 | -33.3 ± 17.9 | 72.8% ± 3.9 | 55.3% ± 7.2 | -17.5 ± 8.5 |
| pl.Patton.GeneralPatton 1.54 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 85.7% ± 9.5 | -11.8 ± 13.5 | 74.5% ± 7.6 | 69.9% ± 4.7 | -4.7 ± 8.8 |
| pl.Patton.GeneralPatton 1.54 | hadur2.Hadur 3.8.5 | 8 | 92.5% ± 8.7 | 68.3% ± 15.1 | -24.2 ± 15.6 | 75.0% ± 7.7 | 59.5% ± 3.0 | -15.5 ± 7.8 |
| rtk.Tachikoma 1.0 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 95.0% ± 6.3 | +2.5 ± 7.4 | 57.5% ± 6.5 | 65.3% ± 2.6 | +7.8 ± 7.6 |
| rtk.Tachikoma 1.0 | hadur2.Hadur 3.8.5 | 8 | 95.0% ± 11.8 | 95.0% ± 4.5 | +0.0 ± 14.1 | 62.5% ± 5.6 | 68.2% ± 5.4 | +5.7 ± 8.5 |
| rz.Aleph 0.34 | hadur2.Hadur 3.9 | 8 | 85.0% ± 11.8 | 87.5% ± 7.4 | +2.5 ± 9.7 | 47.3% ± 5.0 | 56.6% ± 4.2 | +9.3 ± 6.8 |
| rz.Aleph 0.34 | hadur2.Hadur 3.8.5 | 8 | 90.0% ± 12.6 | 91.3% ± 9.4 | +1.2 ± 19.7 | 54.4% ± 8.6 | 53.8% ± 5.5 | -0.6 ± 12.7 |
| sheldor.mini.FoilistMC 1.0 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 88.5% ± 8.5 | -1.5 ± 11.7 | 57.1% ± 9.0 | 58.0% ± 10.1 | +1.0 ± 15.3 |
| sheldor.mini.FoilistMC 1.0 | hadur2.Hadur 3.8.5 | 8 | 77.5% ± 10.7 | 78.8% ± 13.0 | +1.2 ± 15.8 | 48.0% ± 4.9 | 56.8% ± 8.1 | +8.8 ± 9.0 |
| shrub.Silver v048 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 88.2% ± 2.7 | 98.2% ± 1.8 | +10.0 ± 3.8 |
| shrub.Silver v048 | hadur2.Hadur 3.8.5 | 8 | 95.0% ± 7.7 | 76.7% ± 12.1 | -18.3 ± 11.8 | 84.0% ± 5.7 | 64.1% ± 2.7 | -19.9 ± 5.8 |
| supersample.SuperTrackFire 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 85.9% ± 6.3 | 92.1% ± 4.6 | +6.3 ± 6.6 |
| supersample.SuperTrackFire 1.0 | hadur2.Hadur 3.8.5 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 86.7% ± 6.6 | 90.7% ± 6.9 | +4.0 ± 9.1 |
| tad.Dalek98 0.98 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 95.0% ± 6.3 | +0.0 ± 7.7 | 64.7% ± 8.1 | 68.2% ± 5.4 | +3.5 ± 8.8 |
| tad.Dalek98 0.98 | hadur2.Hadur 3.8.5 | 8 | 100.0% ± 0.0 | 97.5% ± 5.9 | -2.5 ± 5.9 | 63.7% ± 6.1 | 70.9% ± 5.2 | +7.2 ± 8.4 |
| theo.QuarkSoup 1.5fga | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 84.7% ± 4.2 | -10.3 ± 6.3 | 53.5% ± 6.9 | 52.5% ± 5.1 | -1.0 ± 9.0 |
| theo.QuarkSoup 1.5fga | hadur2.Hadur 3.8.5 | 8 | 100.0% ± 0.0 | 91.3% ± 7.0 | -8.7 ± 7.0 | 63.0% ± 6.1 | 55.9% ± 5.8 | -7.0 ± 6.7 |
| theo.avenge.Pequod 1.0 | hadur2.Hadur 3.9 | 8 | 82.5% ± 22.7 | 85.0% ± 7.7 | +2.5 ± 22.7 | 51.1% ± 10.3 | 52.7% ± 4.7 | +1.6 ± 11.3 |
| theo.avenge.Pequod 1.0 | hadur2.Hadur 3.8.5 | 8 | 82.5% ± 5.9 | 76.3% ± 10.9 | -6.3 ± 9.9 | 47.1% ± 9.9 | 50.8% ± 6.2 | +3.7 ± 14.5 |
| theo.real.Ahab 1.0 | hadur2.Hadur 3.9 | 8 | 87.5% ± 8.7 | 83.5% ± 7.8 | -4.0 ± 13.3 | 56.2% ± 8.7 | 50.8% ± 6.7 | -5.4 ± 14.7 |
| theo.real.Ahab 1.0 | hadur2.Hadur 3.8.5 | 8 | 85.0% ± 11.8 | 63.8% ± 12.6 | -21.3 ± 14.4 | 51.5% ± 5.8 | 46.3% ± 4.3 | -5.3 ± 7.6 |
| tide.pear.Pear 0.62.1 | hadur2.Hadur 3.9 | 8 | 82.5% ± 14.0 | 83.3% ± 10.9 | +0.8 ± 14.6 | 41.7% ± 5.4 | 46.2% ± 5.7 | +4.5 ± 6.9 |
| tide.pear.Pear 0.62.1 | hadur2.Hadur 3.8.5 | 8 | 72.5% ± 12.4 | 85.8% ± 11.0 | +13.3 ± 21.8 | 39.1% ± 7.6 | 43.0% ± 3.7 | +3.9 ± 8.1 |
| vjik.UnViolation 1.1 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 81.9% ± 5.0 | 81.9% ± 3.8 | -0.1 ± 7.2 |
| vjik.UnViolation 1.1 | hadur2.Hadur 3.8.5 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 80.3% ± 5.8 | 76.3% ± 2.5 | -4.0 ± 7.0 |
| wcsv.Engineer.Engineer 0.5.4 | hadur2.Hadur 3.9 | 8 | 82.5% ± 14.0 | 71.9% ± 13.9 | -10.6 ± 24.3 | 50.2% ± 9.1 | 41.1% ± 4.8 | -9.1 ± 10.8 |
| wcsv.Engineer.Engineer 0.5.4 | hadur2.Hadur 3.8.5 | 8 | 70.0% ± 23.6 | 77.2% ± 12.4 | +7.2 ± 25.7 | 45.2% ± 6.2 | 41.6% ± 7.0 | -3.6 ± 8.5 |
| wiki.WaveRammer 1.0 | hadur2.Hadur 3.9 | 8 | 72.5% ± 15.3 | 90.0% ± 8.9 | +17.5 ± 15.3 | 60.1% ± 5.3 | 68.4% ± 5.3 | +8.3 ± 6.9 |
| wiki.WaveRammer 1.0 | hadur2.Hadur 3.8.5 | 8 | 77.5% ± 14.0 | 48.5% ± 11.8 | -29.0 ± 16.5 | 65.0% ± 6.6 | 52.6% ± 3.6 | -12.3 ± 6.2 |
| zezinho.QuerMePegarKKKK 1.0 | hadur2.Hadur 3.9 | 8 | 82.5% ± 14.0 | 95.0% ± 4.5 | +12.5 ± 17.7 | 64.4% ± 8.6 | 69.8% ± 3.8 | +5.4 ± 9.2 |
| zezinho.QuerMePegarKKKK 1.0 | hadur2.Hadur 3.8.5 | 8 | 76.9% ± 18.8 | 72.6% ± 6.5 | -4.2 ± 22.3 | 62.7% ± 7.8 | 63.9% ± 3.0 | +1.1 ± 9.7 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| GarmBox.Oranges 1.0.1 | -2.5 ± 5.9 | +7.9 ± 7.8 | -2.3 ± 7.4 | +16.8 ± 9.3 |
| ahr.ice.Ice 1.0 | +2.5 ± 5.9 | +38.3 ± 14.2 | -2.0 ± 3.4 | +29.2 ± 8.3 |
| apc.Colossus2 0.12 | -2.5 ± 5.9 | +0.0 ± 0.0 | +2.1 ± 4.5 | +14.4 ± 7.8 |
| ara.Shera 0.88 | +3.1 ± 13.2 | +3.7 ± 7.7 | +0.3 ± 14.4 | +1.8 ± 8.0 |
| bvh.tyr.Tyr 1.74 | -5.0 ± 14.8 | +3.7 ± 8.9 | -4.8 ± 7.1 | +10.8 ± 5.6 |
| com.syncleus.robocode.Dreadnaught 0.1 | +7.5 ± 8.7 | +2.5 ± 3.9 | +2.0 ± 5.7 | +13.6 ± 5.4 |
| davidalves.Firebird 0.25 | +2.5 ± 24.4 | -7.8 ± 19.2 | -1.3 ± 10.2 | +1.7 ± 6.3 |
| dcs.Eater_of_Worlds_Mini 1.0 | +0.0 ± 0.0 | +3.7 ± 4.3 | +3.3 ± 5.5 | +14.3 ± 4.5 |
| dft.Immortal 1.40 | -25.0 ± 21.4 | -6.5 ± 13.4 | -1.4 ± 5.4 | +1.2 ± 5.4 |
| dk.stable.Gorgatron 1.1 | -7.5 ± 12.4 | +7.5 ± 9.7 | -2.8 ± 8.0 | +10.6 ± 6.2 |
| dmh.robocode.robot.PinkPanther 1.1 | +7.5 ± 19.9 | -1.8 ± 11.3 | +5.1 ± 18.4 | -3.5 ± 11.6 |
| dz.Caedo 1.4 | +0.0 ± 17.9 | +2.8 ± 8.6 | +3.3 ± 9.5 | -0.4 ± 7.8 |
| element.Earth 1.1 | -5.0 ± 14.8 | +3.7 ± 20.4 | -2.5 ± 12.7 | -1.8 ± 7.1 |
| ethdsy.Malacka 2.4 | +2.5 ± 5.9 | +1.2 ± 3.0 | +4.9 ± 6.5 | +5.8 ± 9.0 |
| jcs.AutoBot 4.2.1 | +0.0 ± 17.9 | -0.0 ± 16.1 | -6.1 ± 7.5 | +1.0 ± 9.6 |
| justin.DemonicRage 3.20 | +15.0 ± 11.8 | +3.2 ± 15.2 | +10.6 ± 9.0 | -2.3 ± 12.8 |
| jwst.DAD.DarkAndDarker 1.1 | +0.0 ± 8.9 | +33.5 ± 25.9 | +4.0 ± 10.0 | +21.8 ± 12.1 |
| kinsen.nano.Quarrelet 1.0 | +2.5 ± 5.9 | -5.0 ± 7.7 | +3.9 ± 10.4 | -2.9 ± 7.3 |
| lorneswork.Predator 1.0 | +2.5 ± 10.7 | +21.4 ± 15.0 | +0.4 ± 8.3 | +32.2 ± 1.4 |
| marcinek.TopGun 1.3 | -7.5 ± 8.7 | +29.9 ± 11.7 | -7.0 ± 8.6 | +32.6 ± 5.9 |
| maribo.IotaCT 1.0 | +0.0 ± 0.0 | +2.5 ± 5.9 | -0.8 ± 7.6 | +11.0 ± 5.7 |
| nat.Samekh 0.4 | +12.5 ± 19.9 | +7.4 ± 17.1 | +3.0 ± 13.7 | -3.1 ± 8.0 |
| oog.mini.AlphaDragon 0.1 | +10.0 ± 15.5 | -0.8 ± 15.2 | +2.8 ± 9.8 | +0.2 ± 11.9 |
| pl.Drum 0.1 | +0.0 ± 8.9 | +34.6 ± 19.3 | +1.5 ± 5.1 | +18.7 ± 10.3 |
| pl.Patton.GeneralPatton 1.54 | +5.0 ± 11.8 | +17.4 ± 20.2 | -0.5 ± 6.8 | +10.3 ± 5.1 |
| rtk.Tachikoma 1.0 | -2.5 ± 16.6 | +0.0 ± 8.9 | -5.0 ± 7.4 | -2.8 ± 7.5 |
| rz.Aleph 0.34 | -5.0 ± 21.4 | -3.7 ± 12.6 | -7.1 ± 12.2 | +2.7 ± 5.5 |
| sheldor.mini.FoilistMC 1.0 | +12.5 ± 15.3 | +9.7 ± 17.1 | +9.1 ± 9.1 | +1.2 ± 14.7 |
| shrub.Silver v048 | +5.0 ± 7.7 | +23.3 ± 12.1 | +4.2 ± 6.5 | +34.1 ± 3.4 |
| supersample.SuperTrackFire 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.8 ± 10.1 | +1.5 ± 4.6 |
| tad.Dalek98 0.98 | -5.0 ± 7.7 | -2.5 ± 3.9 | +1.0 ± 8.5 | -2.7 ± 7.3 |
| theo.QuarkSoup 1.5fga | -5.0 ± 7.7 | -6.5 ± 9.8 | -9.5 ± 6.5 | -3.4 ± 10.0 |
| theo.avenge.Pequod 1.0 | -0.0 ± 28.3 | +8.8 ± 12.2 | +4.0 ± 16.5 | +1.9 ± 4.7 |
| theo.real.Ahab 1.0 | +2.5 ± 18.8 | +19.7 ± 11.0 | +4.7 ± 13.1 | +4.5 ± 9.4 |
| tide.pear.Pear 0.62.1 | +10.0 ± 12.6 | -2.5 ± 12.6 | +2.6 ± 11.6 | +3.2 ± 8.1 |
| vjik.UnViolation 1.1 | -2.5 ± 5.9 | +0.0 ± 0.0 | +1.6 ± 7.9 | +5.6 ± 5.0 |
| wcsv.Engineer.Engineer 0.5.4 | +12.5 ± 21.8 | -5.3 ± 23.1 | +5.0 ± 8.8 | -0.5 ± 10.0 |
| wiki.WaveRammer 1.0 | -5.0 ± 23.2 | +41.5 ± 16.7 | -4.9 ± 9.3 | +15.7 ± 4.0 |
| zezinho.QuerMePegarKKKK 1.0 | +5.6 ± 17.8 | +22.4 ± 7.4 | +1.6 ± 5.3 | +5.9 ± 5.2 |

## Failed battles

- zen.Ronin 1.0.0 seed 1 zen.Ronin_1.0.0-1: failed after 2 attempts (expected 2 robots; found 1)
- zen.Ronin 1.0.0 seed 2 zen.Ronin_1.0.0-2-baseline: failed after 2 attempts (expected 2 robots; found 1)
- zen.Ronin 1.0.0 seed 3 zen.Ronin_1.0.0-3: failed after 2 attempts (expected 2 robots; found 1)
- zen.Ronin 1.0.0 seed 4 zen.Ronin_1.0.0-4-baseline: failed after 2 attempts (expected 2 robots; found 1)
- zen.Ronin 1.0.0 seed 1 zen.Ronin_1.0.0-1-baseline: failed after 2 attempts (expected 2 robots; found 1)
- zen.Ronin 1.0.0 seed 2 zen.Ronin_1.0.0-2: failed after 2 attempts (expected 2 robots; found 1)
- zen.Ronin 1.0.0 seed 3 zen.Ronin_1.0.0-3-baseline: failed after 2 attempts (expected 2 robots; found 1)
- zen.Ronin 1.0.0 seed 5 zen.Ronin_1.0.0-5: failed after 2 attempts (expected 2 robots; found 1)
- zen.Ronin 1.0.0 seed 6 zen.Ronin_1.0.0-6-baseline: failed after 2 attempts (expected 2 robots; found 1)
- zen.Ronin 1.0.0 seed 4 zen.Ronin_1.0.0-4: failed after 2 attempts (expected 2 robots; found 1)
- zen.Ronin 1.0.0 seed 7 zen.Ronin_1.0.0-7: failed after 2 attempts (expected 2 robots; found 1)
- zen.Ronin 1.0.0 seed 8 zen.Ronin_1.0.0-8-baseline: failed after 2 attempts (expected 2 robots; found 1)
- zen.Ronin 1.0.0 seed 5 zen.Ronin_1.0.0-5-baseline: failed after 2 attempts (expected 2 robots; found 1)
- zen.Ronin 1.0.0 seed 6 zen.Ronin_1.0.0-6: failed after 2 attempts (expected 2 robots; found 1)
- zen.Ronin 1.0.0 seed 7 zen.Ronin_1.0.0-7-baseline: failed after 2 attempts (expected 2 robots; found 1)
- zen.Ronin 1.0.0 seed 8 zen.Ronin_1.0.0-8: failed after 2 attempts (expected 2 robots; found 1)
