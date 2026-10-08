# Bench: hadur2.Hadur 3.10 (cold)

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1883 over 156 battles (12.1 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | weak | 88.7% ± 5.4 | 97.9% ± 4.4 | 79.3% ± 6.1 | 137 / 140 | 23.1% ± 2.5 | 6.1% ± 2.1 | 53 | 0 | 0.69 / 14.7 |
| apv.TheBrainPi 0.5fix | weak | 72.8% ± 9.5 | 88.6% ± 9.1 | 57.4% ± 7.6 | 124 / 140 | 14.3% ± 1.4 | 6.6% ± 1.6 | 48 | 0 | 1.16 / 14.0 |
| jmcd.BeoWulf 2.8 | weak | 85.5% ± 3.9 | 97.9% ± 4.4 | 73.4% ± 3.9 | 137 / 140 | 16.2% ± 0.8 | 7.0% ± 1.0 | 52 | 0 | 0.99 / 14.6 |
| DM.Mijit .3 | weak | 89.7% ± 4.0 | 99.3% ± 2.3 | 79.1% ± 5.6 | 139 / 140 | 18.3% ± 0.9 | 5.5% ± 1.9 | 43 | 0 | 0.86 / 12.9 |
| nan.Ihivatar_Mk_1 1.0 | weak | 88.6% ± 5.7 | 99.3% ± 2.3 | 74.3% ± 12.2 | 139 / 140 | 13.8% ± 3.3 | 3.2% ± 1.6 | 44 | 0 | 0.75 / 17.4 |
| jab.micro.Sanguijuela 0.8 | weak | 69.6% ± 2.7 | 96.4% ± 4.4 | 60.4% ± 0.7 | 135 / 140 | 76.3% ± 2.5 | 53.0% ± 2.7 | 43 | 0 | 0.52 / 9.1 |
| serenity.moonlightBat 1.17 | weak | 96.6% ± 2.9 | 99.3% ± 2.3 | 93.6% ± 3.6 | 139 / 140 | 16.6% ± 0.3 | 2.6% ± 1.2 | 44 | 0 | 0.80 / 103.9 |
| myl.nano.Kakuru 1.20 | weak | 75.4% ± 4.4 | 92.1% ± 4.4 | 56.7% ± 7.6 | 129 / 140 | 14.4% ± 4.2 | 6.2% ± 1.1 | 45 | 0 | 0.89 / 39.9 |
| mcb.Audace 1.3 | weak | 94.7% ± 1.5 | 100.0% ± 0.0 | 89.7% ± 2.7 | 140 / 140 | 38.4% ± 1.5 | 3.8% ± 1.1 | 45 | 0 | 0.81 / 9.5 |
| suh.micro.WallPM 1.00 | weak | 80.9% ± 5.7 | 90.0% ± 5.9 | 72.8% ± 5.6 | 126 / 140 | 20.9% ± 3.1 | 9.6% ± 1.4 | 63 | 0 | 1.12 / 14.9 |
| fm.claire 1.7 | weak | 94.9% ± 0.8 | 100.0% ± 0.0 | 86.6% ± 2.8 | 140 / 140 | 15.9% ± 4.0 | 1.9% ± 0.2 | 43 | 0 | 0.65 / 13.6 |
| dmh.robocode.robot.GreenDragon 1.0 | weak | 91.6% ± 1.6 | 100.0% ± 0.0 | 81.7% ± 3.1 | 140 / 140 | 17.0% ± 1.4 | 3.9% ± 0.7 | 45 | 0 | 0.85 / 13.0 |
| oog.melee.Mercutio 1.0 | weak | 97.4% ± 0.5 | 100.0% ± 0.0 | 94.9% ± 0.9 | 140 / 140 | 24.0% ± 1.8 | 3.1% ± 0.7 | 47 | 0 | 0.78 / 13.7 |
| js.PinBall 1.6 | weak | 97.5% ± 1.2 | 99.3% ± 2.3 | 95.5% ± 2.1 | 139 / 140 | 27.2% ± 2.4 | 1.8% ± 1.2 | 44 | 0 | 0.71 / 13.1 |
| EH.Fusion 0.32 | weak | 79.0% ± 2.4 | 94.3% ± 0.0 | 71.6% ± 3.2 | 132 / 140 | 62.1% ± 4.0 | 23.6% ± 4.5 | 48 | 0 | 0.70 / 13.2 |
| ratosh.Wesco 1.4 | weak | 95.1% ± 4.3 | 99.3% ± 2.3 | 89.7% ± 5.3 | 139 / 140 | 15.5% ± 1.7 | 1.9% ± 2.1 | 48 | 0 | 0.76 / 17.4 |
| xander.cat.Spitfire 1.4 | weak | 100.0% ± 0.1 | 100.0% ± 0.0 | 100.0% ± 0.1 | 140 / 140 | 64.6% ± 6.3 | 0.2% ± 0.6 | 48 | 0 | 0.62 / 9.7 |
| marksteam.Phoenix 1.0 | weak | 90.4% ± 8.0 | 98.6% ± 2.6 | 82.0% ± 12.8 | 138 / 140 | 20.5% ± 2.3 | 4.7% ± 2.3 | 53 | 0 | 0.95 / 15.7 |
| ndn.DyslexicMonkey 1.1 | weak | 94.8% ± 3.7 | 99.3% ± 2.3 | 90.2% ± 5.0 | 139 / 140 | 21.2% ± 2.5 | 3.3% ± 2.2 | 43 | 0 | 0.66 / 14.7 |
| supersample.SuperCorners 1.0 | weak | 91.4% ± 1.6 | 98.6% ± 2.6 | 86.7% ± 1.9 | 138 / 140 | 39.9% ± 2.3 | 9.1% ± 2.6 | 49 | 0 | 0.70 / 133.8 |
| bots.UnterExBot 1.0 | weak | 98.4% ± 1.9 | 100.0% ± 0.0 | 96.8% ± 3.8 | 140 / 140 | 23.6% ± 2.0 | 3.4% ± 2.3 | 50 | 0 | 0.66 / 16.3 |
| hlavko.nano.Ringo 2.0 | weak | 96.8% ± 4.7 | 99.3% ± 2.3 | 94.1% ± 7.7 | 139 / 140 | 23.2% ± 2.1 | 1.5% ± 2.6 | 46 | 0 | 0.71 / 14.9 |
| dsw.StaticD 1.0 | weak | 99.2% ± 0.3 | 100.0% ± 0.0 | 98.5% ± 0.5 | 140 / 140 | 29.3% ± 3.3 | 1.1% ± 0.3 | 40 | 0 | 0.62 / 15.5 |
| sul.BlueBot 1.0 | weak | 99.5% ± 0.4 | 100.0% ± 0.0 | 99.1% ± 0.7 | 140 / 140 | 47.1% ± 3.0 | 0.5% ± 0.6 | 45 | 0 | 0.60 / 12.4 |
| hapiel.Spiral 0.1 | weak | 95.9% ± 2.3 | 99.3% ± 2.3 | 92.6% ± 3.6 | 139 / 140 | 21.1% ± 2.7 | 5.3% ± 2.0 | 51 | 0 | 0.73 / 13.4 |
| Lo_Ian.Gandalf_V4 4.0 | weak | 98.1% ± 1.1 | 100.0% ± 0.0 | 96.9% ± 1.4 | 140 / 140 | 38.8% ± 3.6 | 3.2% ± 2.6 | 50 | 0 | 0.63 / 10.7 |
| suh.nano.CrossC 1.00 | weak | 98.1% ± 1.2 | 100.0% ± 0.0 | 96.4% ± 2.2 | 140 / 140 | 35.8% ± 2.8 | 2.5% ± 1.3 | 53 | 0 | 0.76 / 24.3 |
| hirataatsushi.Trinity 0.003 | weak | 94.7% ± 2.5 | 99.3% ± 2.3 | 91.3% ± 4.1 | 139 / 140 | 47.1% ± 7.9 | 9.8% ± 3.9 | 49 | 0 | 0.70 / 9.5 |
| adt.Ar2 1.0 | weak | 95.1% ± 2.1 | 100.0% ± 0.0 | 90.4% ± 3.8 | 140 / 140 | 33.4% ± 4.9 | 3.9% ± 1.6 | 53 | 0 | 0.89 / 10.5 |
| yk.JahMicro 1.0 | weak | 93.7% ± 4.2 | 98.6% ± 4.5 | 89.6% ± 4.0 | 138 / 140 | 22.7% ± 1.5 | 7.1% ± 2.0 | 58 | 0 | 0.79 / 13.3 |
| uccc.MilkyWay 1.01 | weak | 96.2% ± 3.6 | 99.3% ± 2.3 | 94.2% ± 6.5 | 139 / 140 | 32.2% ± 5.4 | 6.7% ± 7.9 | 48 | 0 | 0.92 / 12.3 |
| amk.superstrike.SuperStrike 0.3 | weak | 97.5% ± 0.5 | 100.0% ± 0.0 | 94.9% ± 1.0 | 140 / 140 | 27.6% ± 2.3 | 1.9% ± 0.6 | 56 | 0 | 0.81 / 23.2 |
| omens.CannonfodderNano 1.4 | weak | 97.1% ± 1.0 | 100.0% ± 0.0 | 94.7% ± 1.7 | 140 / 140 | 33.7% ± 3.4 | 4.1% ± 1.7 | 47 | 0 | 0.68 / 14.2 |
| AD.CodaFirst 1.1 | weak | 99.1% ± 0.5 | 100.0% ± 0.0 | 98.2% ± 1.0 | 140 / 140 | 47.6% ± 4.7 | 1.4% ± 0.9 | 47 | 0 | 0.60 / 9.2 |
| madmath.Cow 0.1.1 | weak | 96.1% ± 1.0 | 100.0% ± 0.0 | 92.6% ± 1.7 | 140 / 140 | 44.0% ± 4.4 | 4.7% ± 1.4 | 55 | 0 | 0.74 / 11.1 |
| kjc.Karaykan 1.0 | weak | 94.5% ± 1.9 | 100.0% ± 0.0 | 89.9% ± 3.3 | 140 / 140 | 50.9% ± 4.3 | 8.6% ± 4.9 | 50 | 0 | 0.72 / 30.2 |
| pac.ABC 2.1 | weak | 99.7% ± 0.2 | 100.0% ± 0.0 | 99.5% ± 0.4 | 140 / 140 | 41.0% ± 3.9 | 2.2% ± 1.2 | 46 | 0 | 0.58 / 148.3 |
| bk.Shooter 1.0 | weak | 98.4% ± 0.4 | 100.0% ± 0.0 | 97.0% ± 0.8 | 140 / 140 | 27.9% ± 1.4 | 2.2% ± 0.7 | 51 | 0 | 0.68 / 11.2 |
| McS.Spanky_test 0.1a | weak | 99.9% ± 0.1 | 100.0% ± 0.0 | 99.9% ± 0.2 | 140 / 140 | 33.9% ± 1.6 | 0.4% ± 0.8 | 40 | 0 | 0.54 / 12.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 4 | 565 | 6.6% | 91.0% | 0.0% | 2.3% | 539 |
| apv.TheBrainPi 0.5fix | 4 | 1297 | 15.4% | 77.3% | 0.0% | 7.3% | 641 |
| jmcd.BeoWulf 2.8 | 4 | 735 | 5.1% | 93.1% | 0.0% | 1.7% | 736 |
| DM.Mijit .3 | 4 | 486 | 2.6% | 96.5% | 0.0% | 0.9% | 528 |
| nan.Ihivatar_Mk_1 1.0 | 4 | 468 | 2.7% | 94.9% | 0.7% | 1.7% | 561 |
| jab.micro.Sanguijuela 0.8 | 4 | 2934 | 2.1% | 84.6% | 11.8% | 1.5% | 301 |
| serenity.moonlightBat 1.17 | 4 | 172 | 7.3% | 90.1% | 0.0% | 2.6% | 761 |
| myl.nano.Kakuru 1.20 | 4 | 1083 | 12.7% | 81.6% | 0.0% | 5.7% | 564 |
| mcb.Audace 1.3 | 4 | 284 | 0.0% | 100.0% | 0.0% | 0.0% | 355 |
| suh.micro.WallPM 1.00 | 4 | 1055 | 16.6% | 76.5% | 0.2% | 6.7% | 683 |
| fm.claire 1.7 | 4 | 195 | 0.0% | 100.0% | 0.0% | 0.0% | 494 |
| dmh.robocode.robot.GreenDragon 1.0 | 4 | 377 | 0.0% | 99.9% | 0.1% | 0.0% | 559 |
| oog.melee.Mercutio 1.0 | 4 | 141 | 0.0% | 100.0% | 0.0% | 0.0% | 513 |
| js.PinBall 1.6 | 4 | 128 | 9.7% | 86.2% | 0.0% | 4.1% | 446 |
| EH.Fusion 0.32 | 4 | 1508 | 6.6% | 79.9% | 8.3% | 5.1% | 310 |
| ratosh.Wesco 1.4 | 4 | 197 | 6.4% | 83.7% | 7.8% | 2.2% | 534 |
| xander.cat.Spitfire 1.4 | 4 | 1 | 0.0% | 100.0% | 0.0% | 0.0% | 327 |
| marksteam.Phoenix 1.0 | 4 | 468 | 5.3% | 92.0% | 0.0% | 2.7% | 503 |
| ndn.DyslexicMonkey 1.1 | 4 | 260 | 4.8% | 92.8% | 0.1% | 2.3% | 504 |
| supersample.SuperCorners 1.0 | 4 | 487 | 5.1% | 79.6% | 12.9% | 2.4% | 388 |
| bots.UnterExBot 1.0 | 4 | 82 | 0.0% | 97.9% | 2.1% | 0.0% | 484 |
| hlavko.nano.Ringo 2.0 | 4 | 143 | 8.7% | 83.2% | 3.3% | 4.7% | 434 |
| dsw.StaticD 1.0 | 4 | 42 | 0.0% | 100.0% | 0.0% | 0.0% | 447 |
| sul.BlueBot 1.0 | 4 | 26 | 0.0% | 98.1% | 1.9% | 0.0% | 334 |
| hapiel.Spiral 0.1 | 4 | 221 | 5.7% | 92.6% | 0.0% | 1.7% | 575 |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 105 | 0.0% | 87.4% | 12.6% | 0.0% | 399 |
| suh.nano.CrossC 1.00 | 4 | 102 | 0.0% | 99.5% | 0.5% | 0.0% | 386 |
| hirataatsushi.Trinity 0.003 | 4 | 323 | 3.9% | 88.6% | 5.3% | 2.2% | 360 |
| adt.Ar2 1.0 | 4 | 257 | 0.0% | 99.6% | 0.4% | 0.0% | 376 |
| yk.JahMicro 1.0 | 4 | 362 | 6.9% | 87.8% | 1.9% | 3.3% | 591 |
| uccc.MilkyWay 1.01 | 4 | 223 | 5.6% | 82.6% | 10.2% | 1.6% | 457 |
| amk.superstrike.SuperStrike 0.3 | 4 | 125 | 0.0% | 100.0% | 0.0% | 0.0% | 425 |
| omens.CannonfodderNano 1.4 | 4 | 167 | 0.0% | 99.3% | 0.7% | 0.0% | 435 |
| AD.CodaFirst 1.1 | 4 | 50 | 0.0% | 100.0% | 0.0% | 0.0% | 347 |
| madmath.Cow 0.1.1 | 4 | 220 | 0.0% | 100.0% | 0.0% | 0.0% | 362 |
| kjc.Karaykan 1.0 | 4 | 326 | 0.0% | 99.7% | 0.3% | 0.0% | 340 |
| pac.ABC 2.1 | 4 | 17 | 0.0% | 97.0% | 3.0% | 0.0% | 436 |
| bk.Shooter 1.0 | 4 | 88 | 0.0% | 100.0% | 0.0% | 0.0% | 462 |
| McS.Spanky_test 0.1a | 4 | 4 | 0.0% | 87.5% | 12.5% | 0.0% | 452 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 4 | 3 | 298 | 0 | 0.38 | 0 | 0 | 0 |
| apv.TheBrainPi 0.5fix | 4 | 2 | 298 | 0 | 0.34 | 1 | 1 | 4 |
| jmcd.BeoWulf 2.8 | 4 | 4 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| DM.Mijit .3 | 4 | 4 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| nan.Ihivatar_Mk_1 1.0 | 4 | 4 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 4 | 4 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| serenity.moonlightBat 1.17 | 4 | 4 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| myl.nano.Kakuru 1.20 | 4 | 2 | 298 | 0 | 0.32 | 1 | 1 | 0 |
| mcb.Audace 1.3 | 4 | 4 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| suh.micro.WallPM 1.00 | 4 | 4 | 0 | 0 | 0.45 | 0 | 0 | 0 |
| fm.claire 1.7 | 4 | 4 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| dmh.robocode.robot.GreenDragon 1.0 | 4 | 4 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| oog.melee.Mercutio 1.0 | 4 | 4 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| js.PinBall 1.6 | 4 | 3 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| EH.Fusion 0.32 | 4 | 3 | 137 | 0 | 0.34 | 0 | 0 | 0 |
| ratosh.Wesco 1.4 | 4 | 4 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| xander.cat.Spitfire 1.4 | 4 | 2 | 596 | 0 | 0.34 | 0 | 0 | 0 |
| marksteam.Phoenix 1.0 | 4 | 2 | 596 | 0 | 0.38 | 0 | 0 | 0 |
| ndn.DyslexicMonkey 1.1 | 4 | 4 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| supersample.SuperCorners 1.0 | 4 | 4 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| bots.UnterExBot 1.0 | 4 | 3 | 596 | 0 | 0.36 | 0 | 0 | 0 |
| hlavko.nano.Ringo 2.0 | 4 | 2 | 596 | 0 | 0.33 | 0 | 0 | 0 |
| dsw.StaticD 1.0 | 4 | 4 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| sul.BlueBot 1.0 | 4 | 4 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| hapiel.Spiral 0.1 | 4 | 2 | 596 | 0 | 0.36 | 0 | 0 | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 3 | 298 | 0 | 0.36 | 0 | 0 | 0 |
| suh.nano.CrossC 1.00 | 4 | 2 | 596 | 0 | 0.38 | 0 | 0 | 0 |
| hirataatsushi.Trinity 0.003 | 4 | 4 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| adt.Ar2 1.0 | 4 | 3 | 298 | 0 | 0.38 | 0 | 0 | 0 |
| yk.JahMicro 1.0 | 4 | 3 | 298 | 0 | 0.41 | 0 | 0 | 0 |
| uccc.MilkyWay 1.01 | 4 | 4 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| amk.superstrike.SuperStrike 0.3 | 4 | 4 | 0 | 0 | 0.40 | 0 | 0 | 0 |
| omens.CannonfodderNano 1.4 | 4 | 4 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| AD.CodaFirst 1.1 | 4 | 3 | 298 | 0 | 0.34 | 0 | 0 | 0 |
| madmath.Cow 0.1.1 | 4 | 2 | 486 | 0 | 0.39 | 0 | 0 | 0 |
| kjc.Karaykan 1.0 | 4 | 4 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| pac.ABC 2.1 | 4 | 4 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| bk.Shooter 1.0 | 4 | 3 | 596 | 0 | 0.36 | 0 | 0 | 0 |
| McS.Spanky_test 0.1a | 4 | 4 | 0 | 0 | 0.29 | 0 | 0 | 0 |

131 of 156 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 3536 | 13 | 3516 | 3513 (99.3%) | 23 (0.7%) | 3 (0.1%) | 157 | 67 | 8 |
| apv.TheBrainPi 0.5fix | 4068 | 9 | 4050 | 4050 (99.6%) | 18 (0.4%) | 0 (0.0%) | 158 | 48 | 14 |
| jmcd.BeoWulf 2.8 | 5705 | 23 | 5698 | 5697 (99.9%) | 8 (0.1%) | 1 (0.0%) | 301 | 107 | 17 |
| DM.Mijit .3 | 3362 | 6 | 3383 | 3358 (99.9%) | 4 (0.1%) | 25 (0.7%) | 645 | 94 | 17 |
| nan.Ihivatar_Mk_1 1.0 | 3337 | 5 | 3337 | 3337 (100.0%) | 0 (0.0%) | 0 (0.0%) | 42 | 31 | 10 |
| jab.micro.Sanguijuela 0.8 | 1127 | 5 | 1127 | 1127 (100.0%) | 0 (0.0%) | 0 (0.0%) | 984 | 117 | 8 |
| serenity.moonlightBat 1.17 | 5760 | 3 | 5760 | 5760 (100.0%) | 0 (0.0%) | 0 (0.0%) | 140 | 83 | 8 |
| myl.nano.Kakuru 1.20 | 3316 | 11 | 3300 | 3296 (99.4%) | 20 (0.6%) | 4 (0.1%) | 486 | 91 | 14 |
| mcb.Audace 1.3 | 1601 | 2 | 1601 | 1601 (100.0%) | 0 (0.0%) | 0 (0.0%) | 2 | 22 | 7 |
| suh.micro.WallPM 1.00 | 5451 | 21 | 5451 | 5451 (100.0%) | 0 (0.0%) | 0 (0.0%) | 455 | 77 | 27 |
| fm.claire 1.7 | 2746 | 8 | 2766 | 2744 (99.9%) | 2 (0.1%) | 22 (0.8%) | 427 | 40 | 10 |
| dmh.robocode.robot.GreenDragon 1.0 | 3790 | 21 | 3812 | 3774 (99.6%) | 16 (0.4%) | 38 (1.0%) | 266 | 88 | 11 |
| oog.melee.Mercutio 1.0 | 3287 | 10 | 3289 | 3287 (100.0%) | 0 (0.0%) | 2 (0.1%) | 20 | 55 | 10 |
| js.PinBall 1.6 | 2812 | 12 | 2806 | 2785 (99.0%) | 27 (1.0%) | 21 (0.7%) | 251 | 80 | 11 |
| EH.Fusion 0.32 | 1212 | 3 | 1205 | 1204 (99.3%) | 8 (0.7%) | 1 (0.1%) | 454 | 83 | 8 |
| ratosh.Wesco 1.4 | 3242 | 11 | 3253 | 3242 (100.0%) | 0 (0.0%) | 11 (0.3%) | 151 | 33 | 11 |
| xander.cat.Spitfire 1.4 | 1358 | 16 | 1312 | 1312 (96.6%) | 46 (3.4%) | 0 (0.0%) | 0 | 75 | 11 |
| marksteam.Phoenix 1.0 | 2948 | 11 | 2926 | 2909 (98.7%) | 39 (1.3%) | 17 (0.6%) | 120 | 45 | 16 |
| ndn.DyslexicMonkey 1.1 | 3213 | 12 | 3213 | 3211 (99.9%) | 2 (0.1%) | 2 (0.1%) | 75 | 49 | 10 |
| supersample.SuperCorners 1.0 | 2019 | 20 | 2019 | 2018 (100.0%) | 1 (0.0%) | 1 (0.0%) | 223 | 70 | 9 |
| bots.UnterExBot 1.0 | 3255 | 9 | 3211 | 3206 (98.5%) | 49 (1.5%) | 5 (0.2%) | 124 | 75 | 12 |
| hlavko.nano.Ringo 2.0 | 2362 | 11 | 2594 | 2311 (97.8%) | 51 (2.2%) | 283 (10.9%) | 38 | 42 | 7 |
| dsw.StaticD 1.0 | 2934 | 10 | 2936 | 2934 (100.0%) | 0 (0.0%) | 2 (0.1%) | 75 | 81 | 7 |
| sul.BlueBot 1.0 | 1569 | 6 | 1569 | 1569 (100.0%) | 0 (0.0%) | 0 (0.0%) | 3 | 46 | 10 |
| hapiel.Spiral 0.1 | 4560 | 19 | 4519 | 4512 (98.9%) | 48 (1.1%) | 7 (0.2%) | 315 | 92 | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 829 | 9 | 819 | 818 (98.7%) | 11 (1.3%) | 1 (0.1%) | 163 | 26 | 8 |
| suh.nano.CrossC 1.00 | 2162 | 10 | 2124 | 2121 (98.1%) | 41 (1.9%) | 3 (0.1%) | 66 | 56 | 11 |
| hirataatsushi.Trinity 0.003 | 1977 | 18 | 1978 | 1976 (99.9%) | 1 (0.1%) | 2 (0.1%) | 279 | 79 | 10 |
| adt.Ar2 1.0 | 1813 | 13 | 1800 | 1795 (99.0%) | 18 (1.0%) | 5 (0.3%) | 28 | 34 | 10 |
| yk.JahMicro 1.0 | 2798 | 6 | 2785 | 2785 (99.5%) | 13 (0.5%) | 0 (0.0%) | 164 | 49 | 17 |
| uccc.MilkyWay 1.01 | 2802 | 17 | 2802 | 2802 (100.0%) | 0 (0.0%) | 0 (0.0%) | 145 | 61 | 11 |
| amk.superstrike.SuperStrike 0.3 | 2339 | 14 | 2343 | 2335 (99.8%) | 4 (0.2%) | 8 (0.3%) | 151 | 54 | 13 |
| omens.CannonfodderNano 1.4 | 2303 | 14 | 2309 | 2303 (100.0%) | 0 (0.0%) | 6 (0.3%) | 36 | 48 | 10 |
| AD.CodaFirst 1.1 | 1111 | 10 | 1093 | 1093 (98.4%) | 18 (1.6%) | 0 (0.0%) | 33 | 25 | 11 |
| madmath.Cow 0.1.1 | 1142 | 7 | 1137 | 1122 (98.2%) | 20 (1.8%) | 15 (1.3%) | 42 | 32 | 17 |
| kjc.Karaykan 1.0 | 1515 | 9 | 1516 | 1515 (100.0%) | 0 (0.0%) | 1 (0.1%) | 137 | 61 | 16 |
| pac.ABC 2.1 | 361 | 3 | 357 | 357 (98.9%) | 4 (1.1%) | 0 (0.0%) | 11 | 9 | 9 |
| bk.Shooter 1.0 | 1362 | 12 | 1337 | 1337 (98.2%) | 25 (1.8%) | 0 (0.0%) | 3 | 19 | 12 |
| McS.Spanky_test 0.1a | 653 | 3 | 652 | 652 (99.8%) | 1 (0.2%) | 0 (0.0%) | 44 | 16 | 11 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 3532 | 266 (7.5%) | 1167 |
| apv.TheBrainPi 0.5fix | 4844 | 327 (6.8%) | 1017 |
| jmcd.BeoWulf 2.8 | 5721 | 435 (7.6%) | 3230 |
| DM.Mijit .3 | 3414 | 454 (13.3%) | 2465 |
| nan.Ihivatar_Mk_1 1.0 | 3802 | 315 (8.3%) | 2560 |
| jab.micro.Sanguijuela 0.8 | 1176 | 73 (6.2%) | 217 |
| serenity.moonlightBat 1.17 | 5883 | 539 (9.2%) | 4437 |
| myl.nano.Kakuru 1.20 | 3969 | 223 (5.6%) | 1131 |
| mcb.Audace 1.3 | 1669 | 89 (5.3%) | 256 |
| suh.micro.WallPM 1.00 | 5161 | 360 (7.0%) | 2276 |
| fm.claire 1.7 | 3167 | 261 (8.2%) | 1854 |
| dmh.robocode.robot.GreenDragon 1.0 | 3758 | 307 (8.2%) | 1186 |
| oog.melee.Mercutio 1.0 | 3100 | 240 (7.7%) | 1524 |
| js.PinBall 1.6 | 2499 | 209 (8.4%) | 772 |
| EH.Fusion 0.32 | 1249 | 29 (2.3%) | 0 |
| ratosh.Wesco 1.4 | 3539 | 133 (3.8%) | 0 |
| xander.cat.Spitfire 1.4 | 1413 | 126 (8.9%) | 336 |
| marksteam.Phoenix 1.0 | 3212 | 156 (4.9%) | 0 |
| ndn.DyslexicMonkey 1.1 | 3082 | 197 (6.4%) | 2014 |
| supersample.SuperCorners 1.0 | 1944 | 93 (4.8%) | 0 |
| bots.UnterExBot 1.0 | 2847 | 151 (5.3%) | 244 |
| hlavko.nano.Ringo 2.0 | 2429 | 124 (5.1%) | 565 |
| dsw.StaticD 1.0 | 2487 | 152 (6.1%) | 559 |
| sul.BlueBot 1.0 | 1476 | 147 (10.0%) | 851 |
| hapiel.Spiral 0.1 | 3764 | 223 (5.9%) | 258 |
| Lo_Ian.Gandalf_V4 4.0 | 2077 | 89 (4.3%) | 0 |
| suh.nano.CrossC 1.00 | 1945 | 93 (4.8%) | 0 |
| hirataatsushi.Trinity 0.003 | 1664 | 187 (11.2%) | 868 |
| adt.Ar2 1.0 | 1837 | 147 (8.0%) | 391 |
| yk.JahMicro 1.0 | 3890 | 232 (6.0%) | 0 |
| uccc.MilkyWay 1.01 | 2556 | 224 (8.8%) | 850 |
| amk.superstrike.SuperStrike 0.3 | 2291 | 105 (4.6%) | 0 |
| omens.CannonfodderNano 1.4 | 2369 | 126 (5.3%) | 0 |
| AD.CodaFirst 1.1 | 1591 | 46 (2.9%) | 0 |
| madmath.Cow 0.1.1 | 1714 | 55 (3.2%) | 0 |
| kjc.Karaykan 1.0 | 1511 | 60 (4.0%) | 375 |
| pac.ABC 2.1 | 2451 | 15 (0.6%) | 0 |
| bk.Shooter 1.0 | 2625 | 33 (1.3%) | 657 |
| McS.Spanky_test 0.1a | 2526 | 36 (1.4%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 650 | 298 | 400 | 389 | 55.4 / 14.7 | 1062 | 2167 | 57 |
| apv.TheBrainPi 0.5fix | 650 | 474 | 638 | 490 | 38.3 / 28.6 | 473 | 3003 | 0 |
| jmcd.BeoWulf 2.8 | 650 | 443 | 588 | 586 | 53.9 / 19.6 | 1278 | 2499 | 20 |
| DM.Mijit .3 | 650 | 471 | 463 | 378 | 50.2 / 13.4 | 1187 | 2654 | 766 |
| nan.Ihivatar_Mk_1 1.0 | 650 | 399 | 450 | 411 | 36.2 / 12.7 | 573 | 3604 | 1720 |
| jab.micro.Sanguijuela 0.8 | 650 | 135 | 650 | 151 | 108.4 / 70.9 | 1071 | 1409 | 29 |
| serenity.moonlightBat 1.17 | 650 | 462 | 400 | 611 | 64.2 / 4.4 | 1308 | 1804 | 0 |
| myl.nano.Kakuru 1.20 | 650 | 486 | 588 | 413 | 33.5 / 25.2 | 617 | 2501 | 2007 |
| mcb.Audace 1.3 | 650 | 256 | 400 | 205 | 70.4 / 8.1 | 1207 | 2218 | 386 |
| suh.micro.WallPM 1.00 | 650 | 479 | 463 | 533 | 61.9 / 23.1 | 1978 | 2039 | 307 |
| fm.claire 1.7 | 650 | 462 | 400 | 344 | 36.4 / 5.6 | 605 | 3523 | 1811 |
| dmh.robocode.robot.GreenDragon 1.0 | 650 | 508 | 400 | 409 | 47.8 / 10.8 | 1127 | 3179 | 1281 |
| oog.melee.Mercutio 1.0 | 650 | 438 | 400 | 363 | 74.6 / 4.0 | 2139 | 1935 | 567 |
| js.PinBall 1.6 | 650 | 351 | 400 | 296 | 66.8 / 3.2 | 1733 | 1730 | 580 |
| EH.Fusion 0.32 | 650 | 310 | 475 | 160 | 86.6 / 34.4 | 967 | 1561 | 77 |
| ratosh.Wesco 1.4 | 650 | 403 | 400 | 384 | 40.4 / 4.7 | 537 | 3982 | 114 |
| xander.cat.Spitfire 1.4 | 650 | 393 | 400 | 177 | 98.0 / 0.0 | 1043 | 571 | 0 |
| marksteam.Phoenix 1.0 | 650 | 435 | 400 | 353 | 54.9 / 12.3 | 1340 | 3227 | 109 |
| ndn.DyslexicMonkey 1.1 | 650 | 387 | 400 | 354 | 62.3 / 6.9 | 1728 | 2454 | 598 |
| supersample.SuperCorners 1.0 | 650 | 263 | 400 | 238 | 72.0 / 11.1 | 1426 | 1376 | 56 |
| bots.UnterExBot 1.0 | 650 | 319 | 400 | 334 | 67.6 / 2.3 | 1874 | 2045 | 75 |
| hlavko.nano.Ringo 2.0 | 650 | 478 | 400 | 284 | 53.5 / 3.4 | 1365 | 2322 | 248 |
| dsw.StaticD 1.0 | 650 | 394 | 400 | 297 | 78.0 / 1.2 | 1861 | 1553 | 441 |
| sul.BlueBot 1.0 | 650 | 400 | 400 | 184 | 77.9 / 0.7 | 1086 | 1222 | 698 |
| hapiel.Spiral 0.1 | 650 | 359 | 400 | 425 | 73.3 / 5.9 | 2237 | 1903 | 225 |
| Lo_Ian.Gandalf_V4 4.0 | 650 | 314 | 400 | 249 | 81.9 / 2.6 | 1255 | 897 | 114 |
| suh.nano.CrossC 1.00 | 650 | 397 | 400 | 236 | 76.7 / 2.9 | 1364 | 1433 | 383 |
| hirataatsushi.Trinity 0.003 | 650 | 288 | 400 | 210 | 85.1 / 8.2 | 1361 | 1087 | 116 |
| adt.Ar2 1.0 | 650 | 307 | 400 | 226 | 68.6 / 7.3 | 1337 | 1989 | 25 |
| yk.JahMicro 1.0 | 650 | 394 | 400 | 441 | 77.9 / 9.1 | 2461 | 967 | 0 |
| uccc.MilkyWay 1.01 | 650 | 402 | 400 | 307 | 82.9 / 5.3 | 1950 | 1408 | 219 |
| amk.superstrike.SuperStrike 0.3 | 650 | 399 | 400 | 275 | 66.7 / 3.6 | 1680 | 1881 | 444 |
| omens.CannonfodderNano 1.4 | 650 | 376 | 400 | 285 | 83.9 / 4.7 | 1758 | 1467 | 186 |
| AD.CodaFirst 1.1 | 650 | 292 | 400 | 197 | 76.8 / 1.4 | 1091 | 2216 | 756 |
| madmath.Cow 0.1.1 | 650 | 396 | 400 | 212 | 78.9 / 6.3 | 1228 | 1334 | 482 |
| kjc.Karaykan 1.0 | 650 | 408 | 400 | 190 | 81.9 / 9.3 | 1111 | 1094 | 223 |
| pac.ABC 2.1 | 650 | 402 | 400 | 286 | 95.4 / 0.5 | 1323 | 269 | 96 |
| bk.Shooter 1.0 | 650 | 418 | 400 | 312 | 81.8 / 2.5 | 1952 | 1204 | 254 |
| McS.Spanky_test 0.1a | 650 | 392 | 400 | 302 | 95.1 / 0.1 | 1886 | 266 | 74 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 6.1% | 53 | 346 | 3 | 25.1 | 266 / 266 (100%) | 0 | 0 |
| apv.TheBrainPi 0.5fix | 6.6% | 48 | 4876 | 3 | 28.6 | 326 / 327 (100%) | 0 | 0 |
| jmcd.BeoWulf 2.8 | 7.0% | 52 | 35 | 3 | 40.7 | 434 / 435 (100%) | 0 | 0 |
| DM.Mijit .3 | 5.5% | 43 | 29 | 3 | 24.2 | 453 / 454 (100%) | 0 | 0 |
| nan.Ihivatar_Mk_1 1.0 | 3.2% | 44 | 27 | 3 | 23.7 | 315 / 315 (100%) | 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 53.0% | 43 | 15 | 3 | 7.9 | 73 / 73 (100%) | 0 | 0 |
| serenity.moonlightBat 1.17 | 2.6% | 44 | 21 | 3 | 41.1 | 539 / 539 (100%) | 0 | 0 |
| myl.nano.Kakuru 1.20 | 6.2% | 45 | 30 | 3 | 23.4 | 220 / 223 (99%) | 0 | 0 |
| mcb.Audace 1.3 | 3.8% | 45 | 17 | 3 | 11.4 | 89 / 89 (100%) | 0 | 0 |
| suh.micro.WallPM 1.00 | 9.6% | 63 | 27 | 3 | 38.8 | 359 / 360 (100%) | 0 | 0 |
| fm.claire 1.7 | 1.9% | 43 | 22 | 3 | 19.8 | 261 / 261 (100%) | 0 | 0 |
| dmh.robocode.robot.GreenDragon 1.0 | 3.9% | 45 | 24 | 3 | 27.2 | 306 / 307 (100%) | 0 | 0 |
| oog.melee.Mercutio 1.0 | 3.1% | 47 | 21 | 3 | 23.5 | 239 / 240 (100%) | 0 | 0 |
| js.PinBall 1.6 | 1.8% | 44 | 16 | 3 | 20.0 | 208 / 209 (100%) | 0 | 0 |
| EH.Fusion 0.32 | 23.6% | 48 | 17 | 3 | 8.5 | 29 / 29 (100%) | 0 | 0 |
| ratosh.Wesco 1.4 | 1.9% | 48 | 22 | 3 | 23.2 | 133 / 133 (100%) | 0 | 0 |
| xander.cat.Spitfire 1.4 | 0.2% | 48 | 12 | 3 | 9.4 | 81 / 126 (64%) | 0 | 0 |
| marksteam.Phoenix 1.0 | 4.7% | 53 | 123 | 3 | 20.9 | 154 / 156 (99%) | 0 | 0 |
| ndn.DyslexicMonkey 1.1 | 3.3% | 43 | 875 | 3 | 23.0 | 197 / 197 (100%) | 0 | 0 |
| supersample.SuperCorners 1.0 | 9.1% | 49 | 19 | 3 | 14.4 | 93 / 93 (100%) | 0 | 0 |
| bots.UnterExBot 1.0 | 3.4% | 50 | 19 | 3 | 22.9 | 146 / 151 (97%) | 0 | 0 |
| hlavko.nano.Ringo 2.0 | 1.5% | 46 | 19 | 3 | 18.5 | 122 / 124 (98%) | 0 | 0 |
| dsw.StaticD 1.0 | 1.1% | 40 | 19 | 3 | 21.0 | 152 / 152 (100%) | 0 | 0 |
| sul.BlueBot 1.0 | 0.5% | 45 | 12 | 3 | 11.2 | 147 / 147 (100%) | 0 | 0 |
| hapiel.Spiral 0.1 | 5.3% | 51 | 23 | 3 | 32.3 | 220 / 223 (99%) | 0 | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 3.2% | 50 | 13 | 3 | 5.8 | 87 / 89 (98%) | 0 | 0 |
| suh.nano.CrossC 1.00 | 2.5% | 53 | 16 | 3 | 15.2 | 90 / 93 (97%) | 0 | 0 |
| hirataatsushi.Trinity 0.003 | 9.8% | 49 | 14 | 3 | 14.0 | 187 / 187 (100%) | 0 | 0 |
| adt.Ar2 1.0 | 3.9% | 53 | 16 | 3 | 12.9 | 146 / 147 (99%) | 0 | 0 |
| yk.JahMicro 1.0 | 7.1% | 58 | 22 | 3 | 19.8 | 232 / 232 (100%) | 0 | 0 |
| uccc.MilkyWay 1.01 | 6.7% | 48 | 50 | 3 | 19.9 | 224 / 224 (100%) | 0 | 0 |
| amk.superstrike.SuperStrike 0.3 | 1.9% | 56 | 65 | 3 | 16.7 | 105 / 105 (100%) | 0 | 0 |
| omens.CannonfodderNano 1.4 | 4.1% | 47 | 16 | 3 | 16.5 | 126 / 126 (100%) | 0 | 0 |
| AD.CodaFirst 1.1 | 1.4% | 47 | 17 | 3 | 7.8 | 45 / 46 (98%) | 0 | 0 |
| madmath.Cow 0.1.1 | 4.7% | 55 | 614 | 3 | 8.1 | 55 / 55 (100%) | 0 | 0 |
| kjc.Karaykan 1.0 | 8.6% | 50 | 21 | 3 | 10.8 | 60 / 60 (100%) | 0 | 0 |
| pac.ABC 2.1 | 2.2% | 46 | 11 | 3 | 2.5 | 15 / 15 (100%) | 0 | 0 |
| bk.Shooter 1.0 | 2.2% | 51 | 17 | 3 | 9.6 | 33 / 33 (100%) | 0 | 0 |
| McS.Spanky_test 0.1a | 0.4% | 40 | 11 | 3 | 4.7 | 36 / 36 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| apv.TheBrainPi 0.5fix | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| jmcd.BeoWulf 2.8 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| DM.Mijit .3 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| nan.Ihivatar_Mk_1 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| serenity.moonlightBat 1.17 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| myl.nano.Kakuru 1.20 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| mcb.Audace 1.3 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| suh.micro.WallPM 1.00 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| fm.claire 1.7 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| dmh.robocode.robot.GreenDragon 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| oog.melee.Mercutio 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| js.PinBall 1.6 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| EH.Fusion 0.32 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| ratosh.Wesco 1.4 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| xander.cat.Spitfire 1.4 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| marksteam.Phoenix 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| ndn.DyslexicMonkey 1.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| supersample.SuperCorners 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| bots.UnterExBot 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| hlavko.nano.Ringo 2.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| dsw.StaticD 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| sul.BlueBot 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| hapiel.Spiral 0.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| suh.nano.CrossC 1.00 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| hirataatsushi.Trinity 0.003 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| adt.Ar2 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| yk.JahMicro 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| uccc.MilkyWay 1.01 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| amk.superstrike.SuperStrike 0.3 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| omens.CannonfodderNano 1.4 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| AD.CodaFirst 1.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| madmath.Cow 0.1.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| kjc.Karaykan 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| pac.ABC 2.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| bk.Shooter 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| McS.Spanky_test 0.1a | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | ers.nano.lig.LigMA | 1 | 35 | 304 | 5.6% | 3.4% ± 1.3 | 17.0% | 24.6% / 21.9% | 4.6% | 0 / 0 | T1/M1 | 89% |
| apv.TheBrainPi 0.5fix | apv.TheBrainPi | 1 | 35 | 294 | 6.6% | 7.4% ± 1.8 | 12.5% | 30.0% / 29.3% | 17.0% | 0 / 0 | T3/M0 | 79% |
| jmcd.BeoWulf 2.8 | jmcd.BeoWulf | 1 | 35 | 280 | 7.7% | 6.6% ± 1.4 | 14.9% | 27.2% / 23.2% | 4.0% | 0 / 0 | T2/M0 | 84% |
| DM.Mijit .3 | DM.Mijit | 1 | 35 | 262 | 5.1% | 5.5% ± 1.7 | 15.2% | 36.3% / 30.8% | 5.8% | 0 / 0 | T2/M? | 91% |
| nan.Ihivatar_Mk_1 1.0 | nan.Ihivatar_Mk_1 | 1 | 35 | 300 | 5.2% | 4.8% ± 1.6 | 15.7% | 24.4% / 25.3% | 13.7% | 0 / 0 | T2/M? | 85% |
| jab.micro.Sanguijuela 0.8 | jab.micro.Sanguijuela | 1 | 35 | 316 | 64.9% | 11.2% ± 3.8 | 50.0% | 8.1% / 6.8% | 3.1% | 0 / 0 | T?/M? | 67% |
| serenity.moonlightBat 1.17 | serenity.moonlightBat | 1 | 35 | 318 | 2.9% | 2.5% ± 0.9 | 14.2% | 32.0% / 25.0% | 8.2% | 0 / 0 | T1/M0 | 97% |
| myl.nano.Kakuru 1.20 | myl.nano.Kakuru | 1 | 35 | 294 | 7.0% | 8.5% ± 2.1 | 14.1% | 29.2% / 27.2% | 25.8% | 0 / 0 | T3/M? | 78% |
| mcb.Audace 1.3 | mcb.Audace | 1 | 35 | 272 | 5.3% | 3.4% ± 2.0 | 28.1% | 34.0% / 33.7% | 7.0% | 0 / 0 | T1/M? | 94% |
| suh.micro.WallPM 1.00 | suh.micro.WallPM | 1 | 35 | 298 | 10.8% | 9.2% ± 1.7 | 18.3% | 33.5% / 27.4% | 13.1% | 0 / 0 | T3/M0 | 84% |
| fm.claire 1.7 | fm.claire | 1 | 35 | 268 | 3.1% | 3.3% ± 1.4 | 12.6% | 31.9% / 29.8% | 9.8% | 0 / 0 | T1/M? | 93% |
| dmh.robocode.robot.GreenDragon 1.0 | dmh.robocode.robot.GreenDragon | 1 | 35 | 352 | 5.0% | 4.7% ± 1.4 | 14.5% | 41.4% / 37.3% | 2.7% | 0 / 0 | T2/M? | 89% |
| oog.melee.Mercutio 1.0 | oog.melee.Mercutio | 1 | 35 | 304 | 3.9% | 3.1% ± 1.3 | 18.9% | 40.4% / 32.3% | 7.2% | 0 / 0 | T1/M? | 96% |
| js.PinBall 1.6 | js.PinBall | 1 | 35 | 272 | 1.6% | 1.0% ± 0.9 | 21.0% | 37.1% / 33.7% | 8.8% | 0 / 0 | T0/M? | 97% |
| EH.Fusion 0.32 | EH.Fusion | 1 | 35 | 270 | 34.2% | 13.1% ± 3.9 | 41.7% | 31.2% / 31.7% | 6.0% | 0 / 0 | T?/M? | 74% |
| ratosh.Wesco 1.4 | ratosh.Wesco | 1 | 35 | 280 | 3.2% | 1.2% ± 0.8 | 13.2% | 22.7% / 21.8% | 2.0% | 0 / 0 | T0/M1 | 91% |
| xander.cat.Spitfire 1.4 | xander.cat.Spitfire | 1 | 35 | 308 | 0.0% | 0.0% ± 0.9 | 35.4% | 112.3% / 111.3% | 99.2% | 0 / 0 | T0/M0 | 100% |
| marksteam.Phoenix 1.0 | marksteam.Phoenix | 1 | 35 | 300 | 4.8% | 4.0% ± 1.6 | 16.5% | 37.9% / 29.8% | 23.0% | 0 / 0 | T1/M? | 94% |
| ndn.DyslexicMonkey 1.1 | ndn.DyslexicMonkey | 1 | 35 | 304 | 2.0% | 1.6% ± 0.9 | 16.2% | 35.0% / 34.2% | 19.9% | 0 / 0 | T0/M? | 97% |
| supersample.SuperCorners 1.0 | supersample.SuperCorners | 1 | 35 | 328 | 9.9% | 4.2% ± 1.9 | 24.8% | 24.6% / 26.1% | 4.3% | 0 / 0 | T1/M? | 90% |
| bots.UnterExBot 1.0 | bots.UnterExBot | 1 | 35 | 292 | 2.7% | 0.8% ± 0.7 | 18.6% | 34.0% / 30.8% | 16.4% | 0 / 0 | T0/M? | 100% |
| hlavko.nano.Ringo 2.0 | hlavko.nano.Ringo | 1 | 35 | 300 | 0.5% | 0.0% ± 0.5 | 17.8% | 42.5% / 35.3% | 6.1% | 0 / 0 | T0/M? | 99% |
| dsw.StaticD 1.0 | dsw.StaticD | 1 | 35 | 276 | 1.9% | 1.4% ± 1.0 | 22.0% | 53.2% / 49.2% | 39.6% | 0 / 0 | T0/M? | 99% |
| sul.BlueBot 1.0 | sul.BlueBot | 1 | 35 | 276 | 1.7% | 1.4% ± 1.4 | 31.7% | 73.8% / 68.4% | 38.2% | 0 / 0 | T0/M? | 99% |
| hapiel.Spiral 0.1 | hapiel.Spiral | 1 | 35 | 284 | 6.3% | 2.8% ± 1.0 | 18.2% | 29.7% / 26.4% | 5.5% | 0 / 0 | T1/M? | 94% |
| Lo_Ian.Gandalf_V4 4.0 | Lo_Ian.Gandalf_V4 | 1 | 35 | 300 | 2.9% | 1.5% ± 2.3 | 27.9% | 33.8% / 31.7% | 2.9% | 0 / 0 | T0/M? | 98% |
| suh.nano.CrossC 1.00 | suh.nano.CrossC | 1 | 35 | 294 | 3.0% | 2.0% ± 1.4 | 26.8% | 60.8% / 60.6% | 21.6% | 0 / 0 | T0/M? | 98% |
| hirataatsushi.Trinity 0.003 | hirataatsushi.Trinity | 1 | 35 | 320 | 10.3% | 3.8% ± 1.9 | 31.0% | 32.1% / 31.2% | 8.4% | 0 / 0 | T1/M? | 94% |
| adt.Ar2 1.0 | adt.Ar2 | 1 | 35 | 260 | 5.7% | 3.1% ± 1.8 | 26.4% | 31.2% / 28.1% | 0.6% | 0 / 0 | T1/M? | 94% |
| yk.JahMicro 1.0 | yk.JahMicro | 1 | 35 | 276 | 7.3% | 6.0% ± 1.8 | 17.8% | 31.3% / 31.4% | 3.3% | 0 / 0 | T2/M0 | 94% |
| uccc.MilkyWay 1.01 | uccc.MilkyWay | 1 | 35 | 286 | 3.3% | 1.2% ± 1.0 | 24.0% | 42.2% / 37.3% | 1.8% | 0 / 0 | T0/M? | 98% |
| amk.superstrike.SuperStrike 0.3 | amk.superstrike.SuperStrike | 1 | 35 | 340 | 2.7% | 2.3% ± 1.3 | 20.4% | 53.5% / 45.8% | 7.1% | 0 / 0 | T1/M? | 97% |
| omens.CannonfodderNano 1.4 | omens.CannonfodderNano | 1 | 35 | 320 | 3.3% | 2.0% ± 1.3 | 24.1% | 46.2% / 35.4% | 30.2% | 0 / 0 | T0/M? | 98% |
| AD.CodaFirst 1.1 | AD.CodaFirst | 1 | 35 | 280 | 3.7% | 1.8% ± 1.9 | 31.5% | 33.3% / 38.3% | 17.2% | 0 / 0 | T0/M? | 98% |
| madmath.Cow 0.1.1 | madmath.Cow | 1 | 35 | 280 | 4.8% | 4.5% ± 2.6 | 28.9% | 63.7% / 62.9% | 16.4% | 0 / 0 | T1/M? | 96% |
| kjc.Karaykan 1.0 | kjc.Karaykan | 1 | 35 | 280 | 7.0% | 4.8% ± 2.3 | 31.4% | 66.2% / 62.3% | 37.7% | 0 / 0 | T2/M? | 95% |
| pac.ABC 2.1 | pac.ABC | 1 | 35 | 260 | 4.1% | 1.8% ± 3.8 | 28.8% | 54.5% / 48.1% | 35.8% | 0 / 0 | T?/M? | 99% |
| bk.Shooter 1.0 | bk.Shooter | 1 | 35 | 272 | 3.3% | 2.8% ± 1.9 | 21.7% | 56.7% / 51.5% | 50.5% | 0 / 0 | T1/M? | 98% |
| McS.Spanky_test 0.1a | McS.Spanky_test | 1 | 35 | 294 | 1.3% | 0.3% ± 2.0 | 25.0% | 52.5% / 45.5% | 39.8% | 0 / 0 | T0/M? | 100% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.10 vs hadur2.Hadur 3.9

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 88.7% ± 5.4 | 89.4% ± 2.5 | -0.7 ± 6.7 |
| apv.TheBrainPi 0.5fix | 72.8% ± 9.5 | 76.0% ± 7.4 | -3.1 ± 13.7 |
| jmcd.BeoWulf 2.8 | 85.5% ± 3.9 | 83.4% ± 3.9 | +2.1 ± 4.2 |
| DM.Mijit .3 | 89.7% ± 4.0 | 89.5% ± 3.0 | +0.1 ± 6.1 |
| nan.Ihivatar_Mk_1 1.0 | 88.6% ± 5.7 | 82.0% ± 11.2 | +6.6 ± 6.2 |
| jab.micro.Sanguijuela 0.8 | 69.6% ± 2.7 | 70.9% ± 4.3 | -1.3 ± 1.8 |
| serenity.moonlightBat 1.17 | 96.6% ± 2.9 | 97.4% ± 1.0 | -0.9 ± 2.8 |
| myl.nano.Kakuru 1.20 | 75.4% ± 4.4 | 77.7% ± 6.4 | -2.3 ± 5.2 |
| mcb.Audace 1.3 | 94.7% ± 1.5 | 94.0% ± 1.9 | +0.7 ± 3.3 |
| suh.micro.WallPM 1.00 | 80.9% ± 5.7 | 82.7% ± 6.3 | -1.8 ± 9.8 |
| fm.claire 1.7 | 94.9% ± 0.8 | 94.3% ± 1.4 | +0.6 ± 0.8 |
| dmh.robocode.robot.GreenDragon 1.0 | 91.6% ± 1.6 | 89.6% ± 5.0 | +2.0 ± 4.9 |
| oog.melee.Mercutio 1.0 | 97.4% ± 0.5 | 96.9% ± 0.9 | +0.5 ± 0.9 |
| js.PinBall 1.6 | 97.5% ± 1.2 | 97.1% ± 1.1 | +0.3 ± 1.3 |
| EH.Fusion 0.32 | 79.0% ± 2.4 | 80.4% ± 6.0 | -1.4 ± 7.1 |
| ratosh.Wesco 1.4 | 95.1% ± 4.3 | 95.1% ± 4.5 | +0.0 ± 6.7 |
| xander.cat.Spitfire 1.4 | 100.0% ± 0.1 | 100.0% ± 0.0 | -0.0 ± 0.1 |
| marksteam.Phoenix 1.0 | 90.4% ± 8.0 | 93.3% ± 3.0 | -2.9 ± 9.5 |
| ndn.DyslexicMonkey 1.1 | 94.8% ± 3.7 | 96.4% ± 1.0 | -1.5 ± 3.9 |
| supersample.SuperCorners 1.0 | 91.4% ± 1.6 | 89.5% ± 6.3 | +1.8 ± 6.2 |
| bots.UnterExBot 1.0 | 98.4% ± 1.9 | 98.4% ± 1.5 | -0.0 ± 2.4 |
| hlavko.nano.Ringo 2.0 | 96.8% ± 4.7 | 97.6% ± 2.8 | -0.7 ± 6.5 |
| dsw.StaticD 1.0 | 99.2% ± 0.3 | 99.1% ± 0.6 | +0.2 ± 0.7 |
| sul.BlueBot 1.0 | 99.5% ± 0.4 | 99.6% ± 0.4 | -0.0 ± 0.6 |
| hapiel.Spiral 0.1 | 95.9% ± 2.3 | 95.8% ± 0.7 | +0.1 ± 2.4 |
| Lo_Ian.Gandalf_V4 4.0 | 98.1% ± 1.1 | 98.9% ± 0.4 | -0.7 ± 0.9 |
| suh.nano.CrossC 1.00 | 98.1% ± 1.2 | 97.9% ± 1.1 | +0.2 ± 1.5 |
| hirataatsushi.Trinity 0.003 | 94.7% ± 2.5 | 95.2% ± 1.4 | -0.5 ± 3.0 |
| adt.Ar2 1.0 | 95.1% ± 2.1 | 95.1% ± 3.1 | +0.1 ± 2.4 |
| yk.JahMicro 1.0 | 93.7% ± 4.2 | 93.1% ± 1.6 | +0.6 ± 5.7 |
| uccc.MilkyWay 1.01 | 96.2% ± 3.6 | 96.7% ± 2.2 | -0.5 ± 5.4 |
| amk.superstrike.SuperStrike 0.3 | 97.5% ± 0.5 | 97.0% ± 1.3 | +0.6 ± 1.8 |
| omens.CannonfodderNano 1.4 | 97.1% ± 1.0 | 97.4% ± 1.8 | -0.2 ± 1.7 |
| AD.CodaFirst 1.1 | 99.1% ± 0.5 | 99.0% ± 1.0 | +0.1 ± 1.6 |
| madmath.Cow 0.1.1 | 96.1% ± 1.0 | 97.9% ± 0.8 | -1.8 ± 1.4 |
| kjc.Karaykan 1.0 | 94.5% ± 1.9 | 95.9% ± 2.5 | -1.4 ± 2.7 |
| pac.ABC 2.1 | 99.7% ± 0.2 | 99.5% ± 0.6 | +0.2 ± 0.7 |
| bk.Shooter 1.0 | 98.4% ± 0.4 | 98.6% ± 0.6 | -0.2 ± 0.7 |
| McS.Spanky_test 0.1a | 99.9% ± 0.1 | 99.7% ± 0.6 | +0.3 ± 0.5 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | -0.7 ± 6.7 | +0.7 ± 5.7 | +0.7 ± 5.7 | -2.2 ± 7.8 |
| apv.TheBrainPi 0.5fix | -3.1 ± 13.7 | -3.6 ± 12.5 | -3.6 ± 12.5 | -2.4 ± 12.1 |
| jmcd.BeoWulf 2.8 | +2.1 ± 4.2 | +2.9 ± 5.2 | +2.9 ± 5.2 | +1.0 ± 4.1 |
| DM.Mijit .3 | +0.1 ± 6.1 | -0.7 ± 2.3 | -0.7 ± 2.3 | +0.7 ± 9.4 |
| nan.Ihivatar_Mk_1 1.0 | +6.6 ± 6.2 | +5.0 ± 5.7 | +5.0 ± 5.7 | +7.6 ± 7.3 |
| jab.micro.Sanguijuela 0.8 | -1.3 ± 1.8 | -0.7 ± 4.4 | -0.7 ± 4.4 | -1.4 ± 3.4 |
| serenity.moonlightBat 1.17 | -0.9 ± 2.8 | -0.7 ± 2.3 | -0.7 ± 2.3 | -1.1 ± 3.6 |
| myl.nano.Kakuru 1.20 | -2.3 ± 5.2 | -0.7 ± 4.4 | -0.7 ± 4.4 | -5.0 ± 12.0 |
| mcb.Audace 1.3 | +0.7 ± 3.3 | +0.0 ± 0.0 | +0.0 ± 0.0 | +1.1 ± 6.0 |
| suh.micro.WallPM 1.00 | -1.8 ± 9.8 | -2.1 ± 12.0 | -2.1 ± 12.0 | -1.8 ± 8.7 |
| fm.claire 1.7 | +0.6 ± 0.8 | +0.0 ± 0.0 | +0.0 ± 0.0 | +1.5 ± 0.5 |
| dmh.robocode.robot.GreenDragon 1.0 | +2.0 ± 4.9 | +1.4 ± 2.6 | +1.4 ± 2.6 | +2.2 ± 6.9 |
| oog.melee.Mercutio 1.0 | +0.5 ± 0.9 | +0.0 ± 0.0 | +0.0 ± 0.0 | +1.1 ± 1.8 |
| js.PinBall 1.6 | +0.3 ± 1.3 | -0.7 ± 2.3 | -0.7 ± 2.3 | +1.4 ± 3.1 |
| EH.Fusion 0.32 | -1.4 ± 7.1 | -2.1 ± 6.8 | -2.1 ± 6.8 | -0.3 ± 6.6 |
| ratosh.Wesco 1.4 | +0.0 ± 6.7 | +0.0 ± 3.7 | +0.0 ± 3.7 | +0.2 ± 10.3 |
| xander.cat.Spitfire 1.4 | -0.0 ± 0.1 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.0 ± 0.1 |
| marksteam.Phoenix 1.0 | -2.9 ± 9.5 | +0.0 ± 3.7 | +0.0 ± 3.7 | -5.2 ± 15.9 |
| ndn.DyslexicMonkey 1.1 | -1.5 ± 3.9 | -0.7 ± 2.3 | -0.7 ± 2.3 | -2.3 ± 5.5 |
| supersample.SuperCorners 1.0 | +1.8 ± 6.2 | +2.1 ± 4.4 | +2.1 ± 4.4 | +2.7 ± 8.4 |
| bots.UnterExBot 1.0 | -0.0 ± 2.4 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 4.7 |
| hlavko.nano.Ringo 2.0 | -0.7 ± 6.5 | +0.0 ± 3.7 | +0.0 ± 3.7 | -1.5 ± 9.5 |
| dsw.StaticD 1.0 | +0.2 ± 0.7 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.4 ± 1.4 |
| sul.BlueBot 1.0 | -0.0 ± 0.6 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.1 ± 1.1 |
| hapiel.Spiral 0.1 | +0.1 ± 2.4 | -0.7 ± 2.3 | -0.7 ± 2.3 | +0.6 ± 3.3 |
| Lo_Ian.Gandalf_V4 4.0 | -0.7 ± 0.9 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.9 ± 0.8 |
| suh.nano.CrossC 1.00 | +0.2 ± 1.5 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.5 ± 2.8 |
| hirataatsushi.Trinity 0.003 | -0.5 ± 3.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.6 ± 4.9 |
| adt.Ar2 1.0 | +0.1 ± 2.4 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.1 ± 4.6 |
| yk.JahMicro 1.0 | +0.6 ± 5.7 | +0.0 ± 6.4 | +0.0 ± 6.4 | +1.2 ± 5.5 |
| uccc.MilkyWay 1.01 | -0.5 ± 5.4 | +1.4 ± 4.5 | +1.4 ± 4.5 | -1.3 ± 6.9 |
| amk.superstrike.SuperStrike 0.3 | +0.6 ± 1.8 | +0.0 ± 0.0 | +0.0 ± 0.0 | +1.1 ± 3.4 |
| omens.CannonfodderNano 1.4 | -0.2 ± 1.7 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.4 ± 3.1 |
| AD.CodaFirst 1.1 | +0.1 ± 1.6 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.1 ± 3.0 |
| madmath.Cow 0.1.1 | -1.8 ± 1.4 | +0.0 ± 0.0 | +0.0 ± 0.0 | -3.4 ± 2.6 |
| kjc.Karaykan 1.0 | -1.4 ± 2.7 | +0.0 ± 0.0 | +0.0 ± 0.0 | -2.4 ± 4.8 |
| pac.ABC 2.1 | +0.2 ± 0.7 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.3 ± 1.2 |
| bk.Shooter 1.0 | -0.2 ± 0.7 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.3 ± 1.4 |
| McS.Spanky_test 0.1a | +0.3 ± 0.5 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.4 ± 1.0 |
| All pairs | -0.1 ± 0.5 | +0.0 ± 0.4 | +0.0 ± 0.4 | -0.2 ± 0.6 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or, for a Hadur build, a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 4 | 2 | -0.7 ± 6.7 | +0.2 ± 5.5 |
| apv.TheBrainPi 0.5fix | 4 | 1 | -3.1 ± 13.7 | +1.5 |
| jmcd.BeoWulf 2.8 | 4 | 2 | +2.1 ± 4.2 | +0.0 ± 17.3 |
| DM.Mijit .3 | 4 | 3 | +0.1 ± 6.1 | -1.1 ± 9.1 |
| nan.Ihivatar_Mk_1 1.0 | 4 | 3 | +6.6 ± 6.2 | +5.8 ± 10.6 |
| jab.micro.Sanguijuela 0.8 | 4 | 4 | -1.3 ± 1.8 | -1.3 ± 1.8 |
| serenity.moonlightBat 1.17 | 4 | 4 | -0.9 ± 2.8 | -0.9 ± 2.8 |
| myl.nano.Kakuru 1.20 | 4 | 2 | -2.3 ± 5.2 | -4.1 ± 38.2 |
| mcb.Audace 1.3 | 4 | 4 | +0.7 ± 3.3 | +0.7 ± 3.3 |
| suh.micro.WallPM 1.00 | 4 | 3 | -1.8 ± 9.8 | -1.0 ± 18.0 |
| fm.claire 1.7 | 4 | 4 | +0.6 ± 0.8 | +0.6 ± 0.8 |
| dmh.robocode.robot.GreenDragon 1.0 | 4 | 4 | +2.0 ± 4.9 | +2.0 ± 4.9 |
| oog.melee.Mercutio 1.0 | 4 | 4 | +0.5 ± 0.9 | +0.5 ± 0.9 |
| js.PinBall 1.6 | 4 | 3 | +0.3 ± 1.3 | +0.4 ± 2.5 |
| EH.Fusion 0.32 | 4 | 2 | -1.4 ± 7.1 | -0.4 ± 46.2 |
| ratosh.Wesco 1.4 | 4 | 3 | +0.0 ± 6.7 | -2.0 ± 3.2 |
| xander.cat.Spitfire 1.4 | 4 | 2 | -0.0 ± 0.1 | -0.0 ± 0.5 |
| marksteam.Phoenix 1.0 | 4 | 1 | -2.9 ± 9.5 | -6.0 |
| ndn.DyslexicMonkey 1.1 | 4 | 3 | -1.5 ± 3.9 | -2.5 ± 4.7 |
| supersample.SuperCorners 1.0 | 4 | 3 | +1.8 ± 6.2 | +2.7 ± 10.7 |
| bots.UnterExBot 1.0 | 4 | 2 | -0.0 ± 2.4 | -0.4 ± 21.0 |
| hlavko.nano.Ringo 2.0 | 4 | 1 | -0.7 ± 6.5 | +0.6 |
| dsw.StaticD 1.0 | 4 | 3 | +0.2 ± 0.7 | -0.0 ± 0.8 |
| sul.BlueBot 1.0 | 4 | 4 | -0.0 ± 0.6 | -0.0 ± 0.6 |
| hapiel.Spiral 0.1 | 4 | 2 | +0.1 ± 2.4 | +0.8 ± 13.3 |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 3 | -0.7 ± 0.9 | -0.7 ± 1.7 |
| suh.nano.CrossC 1.00 | 4 | 2 | +0.2 ± 1.5 | +0.9 ± 9.3 |
| hirataatsushi.Trinity 0.003 | 4 | 4 | -0.5 ± 3.0 | -0.5 ± 3.0 |
| adt.Ar2 1.0 | 4 | 3 | +0.1 ± 2.4 | -0.3 ± 4.0 |
| yk.JahMicro 1.0 | 4 | 3 | +0.6 ± 5.7 | +0.3 ± 10.7 |
| uccc.MilkyWay 1.01 | 4 | 4 | -0.5 ± 5.4 | -0.5 ± 5.4 |
| amk.superstrike.SuperStrike 0.3 | 4 | 4 | +0.6 ± 1.8 | +0.6 ± 1.8 |
| omens.CannonfodderNano 1.4 | 4 | 4 | -0.2 ± 1.7 | -0.2 ± 1.7 |
| AD.CodaFirst 1.1 | 4 | 3 | +0.1 ± 1.6 | +0.4 ± 2.3 |
| madmath.Cow 0.1.1 | 4 | 2 | -1.8 ± 1.4 | -1.6 ± 12.8 |
| kjc.Karaykan 1.0 | 4 | 3 | -1.4 ± 2.7 | -1.5 ± 5.1 |
| pac.ABC 2.1 | 4 | 4 | +0.2 ± 0.7 | +0.2 ± 0.7 |
| bk.Shooter 1.0 | 4 | 2 | -0.2 ± 0.7 | +0.1 ± 1.0 |
| McS.Spanky_test 0.1a | 4 | 4 | +0.3 ± 0.5 | +0.3 ± 0.5 |
| All pairs | 156 | 114 | -0.1 ± 0.5 | -0.1 ± 0.5 |

# Bench: hadur2.Hadur 3.10 baseline (hadur2.Hadur 3.9) (cold)

35 rounds x 4 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1859 over 156 battles (11.9 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | weak | 89.4% ± 2.5 | 97.1% ± 3.7 | 81.5% ± 2.3 | 136 / 140 | 23.8% ± 2.1 | 7.0% ± 3.6 | 51 | 0 | 0.72 / 16.0 |
| apv.TheBrainPi 0.5fix | weak | 76.0% ± 7.4 | 92.1% ± 7.8 | 59.8% ± 6.4 | 129 / 140 | 14.4% ± 1.1 | 6.2% ± 0.7 | 50 | 0 | 1.13 / 13.8 |
| jmcd.BeoWulf 2.8 | weak | 83.4% ± 3.9 | 95.0% ± 5.7 | 72.4% ± 2.3 | 133 / 140 | 17.3% ± 2.4 | 7.4% ± 1.4 | 57 | 0 | 0.93 / 13.9 |
| DM.Mijit .3 | weak | 89.5% ± 3.0 | 100.0% ± 0.0 | 78.4% ± 5.5 | 140 / 140 | 19.2% ± 1.5 | 6.1% ± 1.5 | 47 | 0 | 0.79 / 16.8 |
| nan.Ihivatar_Mk_1 1.0 | weak | 82.0% ± 11.2 | 94.3% ± 7.4 | 66.7% ± 13.6 | 132 / 140 | 13.2% ± 2.9 | 4.8% ± 3.6 | 49 | 0 | 0.83 / 17.4 |
| jab.micro.Sanguijuela 0.8 | weak | 70.9% ± 4.3 | 97.1% ± 3.7 | 61.9% ± 3.2 | 136 / 140 | 75.9% ± 2.7 | 50.1% ± 7.9 | 40 | 0 | 0.52 / 9.7 |
| serenity.moonlightBat 1.17 | weak | 97.4% ± 1.0 | 100.0% ± 0.0 | 94.7% ± 2.0 | 140 / 140 | 16.7% ± 1.3 | 2.1% ± 0.7 | 43 | 0 | 0.70 / 15.0 |
| myl.nano.Kakuru 1.20 | weak | 77.7% ± 6.4 | 92.9% ± 8.7 | 61.7% ± 6.3 | 130 / 140 | 15.8% ± 2.7 | 6.4% ± 1.0 | 46 | 0 | 0.87 / 17.3 |
| mcb.Audace 1.3 | weak | 94.0% ± 1.9 | 100.0% ± 0.0 | 88.6% ± 3.5 | 140 / 140 | 39.9% ± 5.8 | 4.6% ± 1.4 | 42 | 0 | 0.89 / 55.1 |
| suh.micro.WallPM 1.00 | weak | 82.7% ± 6.3 | 92.1% ± 7.8 | 74.6% ± 5.7 | 129 / 140 | 22.1% ± 5.4 | 9.6% ± 2.1 | 55 | 0 | 1.17 / 13.7 |
| fm.claire 1.7 | weak | 94.3% ± 1.4 | 100.0% ± 0.0 | 85.1% ± 3.0 | 140 / 140 | 15.3% ± 1.7 | 2.2% ± 0.5 | 43 | 0 | 0.67 / 19.1 |
| dmh.robocode.robot.GreenDragon 1.0 | weak | 89.6% ± 5.0 | 98.6% ± 2.6 | 79.5% ± 7.9 | 138 / 140 | 17.5% ± 2.6 | 4.4% ± 1.2 | 46 | 0 | 0.88 / 19.2 |
| oog.melee.Mercutio 1.0 | weak | 96.9% ± 0.9 | 100.0% ± 0.0 | 93.8% ± 1.8 | 140 / 140 | 21.2% ± 1.6 | 3.3% ± 0.9 | 44 | 0 | 0.78 / 14.3 |
| js.PinBall 1.6 | weak | 97.1% ± 1.1 | 100.0% ± 0.0 | 94.2% ± 2.1 | 140 / 140 | 26.1% ± 4.2 | 2.6% ± 1.4 | 45 | 0 | 0.73 / 10.5 |
| EH.Fusion 0.32 | weak | 80.4% ± 6.0 | 96.4% ± 6.8 | 71.9% ± 5.3 | 135 / 140 | 61.7% ± 3.5 | 22.7% ± 5.3 | 52 | 0 | 0.69 / 9.5 |
| ratosh.Wesco 1.4 | weak | 95.1% ± 4.5 | 99.3% ± 2.3 | 89.5% ± 7.2 | 139 / 140 | 15.9% ± 2.0 | 1.8% ± 1.1 | 43 | 0 | 0.78 / 16.5 |
| xander.cat.Spitfire 1.4 | weak | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | 140 / 140 | 65.4% ± 4.7 | 0.1% ± 0.2 | 44 | 0 | 0.61 / 11.0 |
| marksteam.Phoenix 1.0 | weak | 93.3% ± 3.0 | 98.6% ± 2.6 | 87.3% ± 4.9 | 138 / 140 | 20.5% ± 2.3 | 3.4% ± 1.1 | 50 | 0 | 0.75 / 13.8 |
| ndn.DyslexicMonkey 1.1 | weak | 96.4% ± 1.0 | 100.0% ± 0.0 | 92.6% ± 2.0 | 140 / 140 | 23.0% ± 2.6 | 2.7% ± 0.8 | 47 | 0 | 0.65 / 13.0 |
| supersample.SuperCorners 1.0 | weak | 89.5% ± 6.3 | 96.4% ± 4.4 | 84.0% ± 7.6 | 135 / 140 | 37.8% ± 6.8 | 8.7% ± 5.9 | 43 | 0 | 0.70 / 169.0 |
| bots.UnterExBot 1.0 | weak | 98.4% ± 1.5 | 100.0% ± 0.0 | 96.8% ± 3.1 | 140 / 140 | 22.9% ± 2.5 | 2.2% ± 0.3 | 48 | 0 | 0.67 / 13.4 |
| hlavko.nano.Ringo 2.0 | weak | 97.6% ± 2.8 | 99.3% ± 2.3 | 95.6% ± 3.2 | 139 / 140 | 23.8% ± 1.2 | 4.3% ± 11.1 | 45 | 0 | 0.73 / 10.7 |
| dsw.StaticD 1.0 | weak | 99.1% ± 0.6 | 100.0% ± 0.0 | 98.1% ± 1.2 | 140 / 140 | 29.1% ± 4.1 | 1.6% ± 1.1 | 44 | 0 | 0.64 / 10.9 |
| sul.BlueBot 1.0 | weak | 99.6% ± 0.4 | 100.0% ± 0.0 | 99.1% ± 0.8 | 140 / 140 | 50.9% ± 4.8 | 0.6% ± 0.5 | 49 | 0 | 0.60 / 9.2 |
| hapiel.Spiral 0.1 | weak | 95.8% ± 0.7 | 100.0% ± 0.0 | 92.0% ± 1.3 | 140 / 140 | 22.4% ± 2.1 | 6.3% ± 1.4 | 49 | 0 | 0.72 / 13.0 |
| Lo_Ian.Gandalf_V4 4.0 | weak | 98.9% ± 0.4 | 100.0% ± 0.0 | 97.8% ± 0.7 | 140 / 140 | 38.4% ± 4.2 | 1.5% ± 0.5 | 47 | 0 | 0.63 / 11.6 |
| suh.nano.CrossC 1.00 | weak | 97.9% ± 1.1 | 100.0% ± 0.0 | 95.9% ± 2.1 | 140 / 140 | 34.1% ± 1.1 | 2.7% ± 1.4 | 52 | 0 | 0.78 / 14.2 |
| hirataatsushi.Trinity 0.003 | weak | 95.2% ± 1.4 | 99.3% ± 2.3 | 91.9% ± 2.0 | 139 / 140 | 47.0% ± 9.2 | 9.6% ± 2.2 | 59 | 0 | 0.73 / 9.8 |
| adt.Ar2 1.0 | weak | 95.1% ± 3.1 | 100.0% ± 0.0 | 90.3% ± 5.8 | 140 / 140 | 33.2% ± 3.0 | 3.6% ± 2.4 | 48 | 0 | 0.83 / 14.2 |
| yk.JahMicro 1.0 | weak | 93.1% ± 1.6 | 98.6% ± 2.6 | 88.5% ± 2.4 | 138 / 140 | 24.2% ± 2.8 | 6.8% ± 3.8 | 54 | 0 | 0.77 / 215.2 |
| uccc.MilkyWay 1.01 | weak | 96.7% ± 2.2 | 97.9% ± 4.4 | 95.5% ± 0.8 | 137 / 140 | 32.2% ± 2.7 | 4.0% ± 1.5 | 46 | 0 | 0.75 / 87.8 |
| amk.superstrike.SuperStrike 0.3 | weak | 97.0% ± 1.3 | 100.0% ± 0.0 | 93.9% ± 2.5 | 140 / 140 | 27.5% ± 2.8 | 2.4% ± 1.4 | 55 | 0 | 0.83 / 84.4 |
| omens.CannonfodderNano 1.4 | weak | 97.4% ± 1.8 | 100.0% ± 0.0 | 95.1% ± 3.3 | 140 / 140 | 32.2% ± 1.9 | 3.8% ± 1.9 | 50 | 0 | 0.71 / 12.2 |
| AD.CodaFirst 1.1 | weak | 99.0% ± 1.0 | 100.0% ± 0.0 | 98.0% ± 2.0 | 140 / 140 | 50.0% ± 5.9 | 1.0% ± 1.2 | 45 | 0 | 0.62 / 11.5 |
| madmath.Cow 0.1.1 | weak | 97.9% ± 0.8 | 100.0% ± 0.0 | 96.1% ± 1.6 | 140 / 140 | 45.2% ± 1.6 | 2.4% ± 1.3 | 47 | 0 | 0.73 / 9.8 |
| kjc.Karaykan 1.0 | weak | 95.9% ± 2.5 | 100.0% ± 0.0 | 92.3% ± 4.5 | 140 / 140 | 49.9% ± 5.5 | 6.1% ± 3.3 | 47 | 0 | 0.66 / 9.8 |
| pac.ABC 2.1 | weak | 99.5% ± 0.6 | 100.0% ± 0.0 | 99.2% ± 1.1 | 140 / 140 | 40.1% ± 2.0 | 2.2% ± 3.4 | 44 | 0 | 0.57 / 217.7 |
| bk.Shooter 1.0 | weak | 98.6% ± 0.6 | 100.0% ± 0.0 | 97.4% ± 1.1 | 140 / 140 | 28.8% ± 2.7 | 1.9% ± 0.3 | 49 | 0 | 0.64 / 10.1 |
| McS.Spanky_test 0.1a | weak | 99.7% ± 0.6 | 100.0% ± 0.0 | 99.5% ± 1.1 | 140 / 140 | 33.6% ± 1.8 | 2.7% ± 5.1 | 44 | 0 | 0.53 / 9.8 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 4 | 528 | 9.5% | 86.6% | 0.1% | 3.8% | 506 |
| apv.TheBrainPi 0.5fix | 4 | 1143 | 12.0% | 82.6% | 0.0% | 5.4% | 622 |
| jmcd.BeoWulf 2.8 | 4 | 853 | 10.3% | 85.5% | 0.0% | 4.3% | 706 |
| DM.Mijit .3 | 4 | 498 | 0.0% | 100.0% | 0.0% | 0.0% | 535 |
| nan.Ihivatar_Mk_1 1.0 | 4 | 777 | 12.9% | 80.4% | 1.1% | 5.7% | 581 |
| jab.micro.Sanguijuela 0.8 | 4 | 2735 | 1.8% | 83.0% | 14.0% | 1.2% | 299 |
| serenity.moonlightBat 1.17 | 4 | 126 | 0.0% | 100.0% | 0.0% | 0.0% | 735 |
| myl.nano.Kakuru 1.20 | 4 | 1028 | 12.2% | 82.0% | 0.0% | 5.9% | 535 |
| mcb.Audace 1.3 | 4 | 325 | 0.0% | 99.7% | 0.3% | 0.0% | 350 |
| suh.micro.WallPM 1.00 | 4 | 971 | 14.2% | 79.7% | 0.0% | 6.1% | 645 |
| fm.claire 1.7 | 4 | 218 | 0.0% | 100.0% | 0.0% | 0.0% | 493 |
| dmh.robocode.robot.GreenDragon 1.0 | 4 | 485 | 5.2% | 92.4% | 0.1% | 2.4% | 542 |
| oog.melee.Mercutio 1.0 | 4 | 166 | 0.0% | 100.0% | 0.0% | 0.0% | 566 |
| js.PinBall 1.6 | 4 | 147 | 0.0% | 99.8% | 0.2% | 0.0% | 456 |
| EH.Fusion 0.32 | 4 | 1407 | 4.4% | 84.7% | 7.8% | 3.1% | 311 |
| ratosh.Wesco 1.4 | 4 | 200 | 6.2% | 86.4% | 5.0% | 2.4% | 520 |
| xander.cat.Spitfire 1.4 | 4 | - | - | - | - | - | 324 |
| marksteam.Phoenix 1.0 | 4 | 315 | 7.9% | 89.1% | 0.0% | 3.0% | 507 |
| ndn.DyslexicMonkey 1.1 | 4 | 183 | 0.0% | 99.9% | 0.1% | 0.0% | 486 |
| supersample.SuperCorners 1.0 | 4 | 603 | 10.4% | 81.7% | 3.4% | 4.5% | 408 |
| bots.UnterExBot 1.0 | 4 | 79 | 0.0% | 100.0% | 0.0% | 0.0% | 495 |
| hlavko.nano.Ringo 2.0 | 4 | 108 | 11.5% | 79.9% | 2.1% | 6.5% | 420 |
| dsw.StaticD 1.0 | 4 | 52 | 0.0% | 100.0% | 0.0% | 0.0% | 447 |
| sul.BlueBot 1.0 | 4 | 24 | 0.0% | 100.0% | 0.0% | 0.0% | 324 |
| hapiel.Spiral 0.1 | 4 | 229 | 0.0% | 100.0% | 0.0% | 0.0% | 550 |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 64 | 0.0% | 100.0% | 0.0% | 0.0% | 399 |
| suh.nano.CrossC 1.00 | 4 | 116 | 0.0% | 100.0% | 0.0% | 0.0% | 395 |
| hirataatsushi.Trinity 0.003 | 4 | 288 | 4.3% | 91.1% | 2.1% | 2.4% | 361 |
| adt.Ar2 1.0 | 4 | 259 | 0.0% | 99.7% | 0.3% | 0.0% | 380 |
| yk.JahMicro 1.0 | 4 | 400 | 6.3% | 90.0% | 2.3% | 1.5% | 579 |
| uccc.MilkyWay 1.01 | 4 | 188 | 20.0% | 71.9% | 2.4% | 5.7% | 460 |
| amk.superstrike.SuperStrike 0.3 | 4 | 155 | 0.0% | 99.8% | 0.2% | 0.0% | 428 |
| omens.CannonfodderNano 1.4 | 4 | 153 | 0.0% | 99.0% | 1.0% | 0.0% | 444 |
| AD.CodaFirst 1.1 | 4 | 56 | 0.0% | 100.0% | 0.0% | 0.0% | 339 |
| madmath.Cow 0.1.1 | 4 | 114 | 0.0% | 100.0% | 0.0% | 0.0% | 353 |
| kjc.Karaykan 1.0 | 4 | 238 | 0.0% | 99.9% | 0.1% | 0.0% | 344 |
| pac.ABC 2.1 | 4 | 28 | 0.0% | 100.0% | 0.0% | 0.0% | 446 |
| bk.Shooter 1.0 | 4 | 78 | 0.0% | 100.0% | 0.0% | 0.0% | 459 |
| McS.Spanky_test 0.1a | 4 | 20 | 0.0% | 94.9% | 5.1% | 0.0% | 454 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 4 | 3 | 596 | 0 | 0.36 | 0 | 0 | 0 |
| apv.TheBrainPi 0.5fix | 4 | 2 | 298 | 0 | 0.36 | 1 | 1 | 4 |
| jmcd.BeoWulf 2.8 | 4 | 2 | 596 | 0 | 0.41 | 0 | 0 | 0 |
| DM.Mijit .3 | 4 | 3 | 298 | 0 | 0.34 | 0 | 0 | 0 |
| nan.Ihivatar_Mk_1 1.0 | 4 | 3 | 298 | 0 | 0.35 | 0 | 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 4 | 4 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| serenity.moonlightBat 1.17 | 4 | 4 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| myl.nano.Kakuru 1.20 | 4 | 4 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| mcb.Audace 1.3 | 4 | 4 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| suh.micro.WallPM 1.00 | 4 | 3 | 0 | 0 | 0.39 | 1 | 1 | 0 |
| fm.claire 1.7 | 4 | 4 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| dmh.robocode.robot.GreenDragon 1.0 | 4 | 4 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| oog.melee.Mercutio 1.0 | 4 | 4 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| js.PinBall 1.6 | 4 | 4 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| EH.Fusion 0.32 | 4 | 3 | 262 | 0 | 0.37 | 0 | 0 | 0 |
| ratosh.Wesco 1.4 | 4 | 3 | 0 | 0 | 0.31 | 1 | 1 | 0 |
| xander.cat.Spitfire 1.4 | 4 | 3 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| marksteam.Phoenix 1.0 | 4 | 2 | 596 | 0 | 0.36 | 0 | 0 | 0 |
| ndn.DyslexicMonkey 1.1 | 4 | 3 | 298 | 0 | 0.34 | 0 | 0 | 0 |
| supersample.SuperCorners 1.0 | 4 | 3 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| bots.UnterExBot 1.0 | 4 | 3 | 298 | 0 | 0.34 | 0 | 0 | 0 |
| hlavko.nano.Ringo 2.0 | 4 | 3 | 257 | 0 | 0.32 | 0 | 0 | 0 |
| dsw.StaticD 1.0 | 4 | 3 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| sul.BlueBot 1.0 | 4 | 4 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| hapiel.Spiral 0.1 | 4 | 4 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 4 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| suh.nano.CrossC 1.00 | 4 | 4 | 0 | 0 | 0.37 | 0 | 0 | 0 |
| hirataatsushi.Trinity 0.003 | 4 | 4 | 0 | 0 | 0.42 | 0 | 0 | 0 |
| adt.Ar2 1.0 | 4 | 4 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| yk.JahMicro 1.0 | 4 | 3 | 298 | 0 | 0.39 | 0 | 0 | 0 |
| uccc.MilkyWay 1.01 | 4 | 4 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| amk.superstrike.SuperStrike 0.3 | 4 | 4 | 0 | 0 | 0.39 | 0 | 0 | 0 |
| omens.CannonfodderNano 1.4 | 4 | 4 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| AD.CodaFirst 1.1 | 4 | 4 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| madmath.Cow 0.1.1 | 4 | 4 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| kjc.Karaykan 1.0 | 4 | 3 | 231 | 0 | 0.34 | 0 | 0 | 0 |
| pac.ABC 2.1 | 4 | 4 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| bk.Shooter 1.0 | 4 | 2 | 596 | 0 | 0.35 | 0 | 0 | 0 |
| McS.Spanky_test 0.1a | 4 | 4 | 0 | 0 | 0.31 | 0 | 0 | 0 |

134 of 156 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 3229 | 6 | 3184 | 3183 (98.6%) | 46 (1.4%) | 1 (0.0%) | 156 | 67 | 10 |
| apv.TheBrainPi 0.5fix | 3898 | 7 | 3880 | 3880 (99.5%) | 18 (0.5%) | 0 (0.0%) | 150 | 59 | 20 |
| jmcd.BeoWulf 2.8 | 5372 | 38 | 5340 | 5339 (99.4%) | 33 (0.6%) | 1 (0.0%) | 283 | 80 | 69 |
| DM.Mijit .3 | 3415 | 6 | 3418 | 3385 (99.1%) | 30 (0.9%) | 33 (1.0%) | 580 | 83 | 13 |
| nan.Ihivatar_Mk_1 1.0 | 3508 | 10 | 3490 | 3490 (99.5%) | 18 (0.5%) | 0 (0.0%) | 62 | 42 | 15 |
| jab.micro.Sanguijuela 0.8 | 1097 | 7 | 1099 | 1097 (100.0%) | 0 (0.0%) | 2 (0.2%) | 1100 | 128 | 10 |
| serenity.moonlightBat 1.17 | 5613 | 4 | 5613 | 5613 (100.0%) | 0 (0.0%) | 0 (0.0%) | 111 | 79 | 12 |
| myl.nano.Kakuru 1.20 | 3071 | 8 | 3073 | 3071 (100.0%) | 0 (0.0%) | 2 (0.1%) | 461 | 60 | 10 |
| mcb.Audace 1.3 | 1552 | 7 | 1552 | 1552 (100.0%) | 0 (0.0%) | 0 (0.0%) | 8 | 36 | 7 |
| suh.micro.WallPM 1.00 | 5039 | 20 | 5039 | 5034 (99.9%) | 5 (0.1%) | 5 (0.1%) | 367 | 94 | 26 |
| fm.claire 1.7 | 2728 | 11 | 2763 | 2723 (99.8%) | 5 (0.2%) | 40 (1.4%) | 517 | 70 | 12 |
| dmh.robocode.robot.GreenDragon 1.0 | 3625 | 17 | 3631 | 3590 (99.0%) | 35 (1.0%) | 41 (1.1%) | 303 | 60 | 204 |
| oog.melee.Mercutio 1.0 | 3783 | 15 | 3784 | 3782 (100.0%) | 1 (0.0%) | 2 (0.1%) | 29 | 67 | 23 |
| js.PinBall 1.6 | 2918 | 14 | 2946 | 2910 (99.7%) | 8 (0.3%) | 36 (1.2%) | 230 | 58 | 13 |
| EH.Fusion 0.32 | 1216 | 13 | 1201 | 1200 (98.7%) | 16 (1.3%) | 1 (0.1%) | 423 | 80 | 11 |
| ratosh.Wesco 1.4 | 3089 | 15 | 3095 | 3089 (100.0%) | 0 (0.0%) | 6 (0.2%) | 128 | 39 | 12 |
| xander.cat.Spitfire 1.4 | 1330 | 11 | 1307 | 1307 (98.3%) | 23 (1.7%) | 0 (0.0%) | 0 | 67 | 8 |
| marksteam.Phoenix 1.0 | 2999 | 8 | 2973 | 2960 (98.7%) | 39 (1.3%) | 13 (0.4%) | 105 | 43 | 13 |
| ndn.DyslexicMonkey 1.1 | 3015 | 7 | 2996 | 2994 (99.3%) | 21 (0.7%) | 2 (0.1%) | 58 | 42 | 9 |
| supersample.SuperCorners 1.0 | 2229 | 13 | 2210 | 2210 (99.1%) | 19 (0.9%) | 0 (0.0%) | 111 | 61 | 13 |
| bots.UnterExBot 1.0 | 3387 | 6 | 3366 | 3364 (99.3%) | 23 (0.7%) | 2 (0.1%) | 96 | 68 | 13 |
| hlavko.nano.Ringo 2.0 | 2213 | 11 | 2435 | 2181 (98.6%) | 32 (1.4%) | 254 (10.4%) | 9 | 51 | 8 |
| dsw.StaticD 1.0 | 2912 | 8 | 2896 | 2888 (99.2%) | 24 (0.8%) | 8 (0.3%) | 74 | 62 | 16 |
| sul.BlueBot 1.0 | 1484 | 6 | 1484 | 1484 (100.0%) | 0 (0.0%) | 0 (0.0%) | 3 | 53 | 7 |
| hapiel.Spiral 0.1 | 4258 | 22 | 4260 | 4254 (99.9%) | 4 (0.1%) | 6 (0.1%) | 212 | 88 | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 835 | 5 | 835 | 835 (100.0%) | 0 (0.0%) | 0 (0.0%) | 116 | 23 | 10 |
| suh.nano.CrossC 1.00 | 2266 | 11 | 2268 | 2265 (100.0%) | 1 (0.0%) | 3 (0.1%) | 62 | 60 | 12 |
| hirataatsushi.Trinity 0.003 | 1995 | 18 | 1995 | 1994 (99.9%) | 1 (0.1%) | 1 (0.1%) | 232 | 83 | 10 |
| adt.Ar2 1.0 | 1850 | 8 | 1856 | 1850 (100.0%) | 0 (0.0%) | 6 (0.3%) | 38 | 40 | 13 |
| yk.JahMicro 1.0 | 2743 | 2 | 2731 | 2730 (99.5%) | 13 (0.5%) | 1 (0.0%) | 187 | 48 | 15 |
| uccc.MilkyWay 1.01 | 2837 | 25 | 2829 | 2829 (99.7%) | 8 (0.3%) | 0 (0.0%) | 45 | 47 | 14 |
| amk.superstrike.SuperStrike 0.3 | 2358 | 8 | 2362 | 2355 (99.9%) | 3 (0.1%) | 7 (0.3%) | 163 | 53 | 13 |
| omens.CannonfodderNano 1.4 | 2367 | 15 | 2373 | 2366 (100.0%) | 1 (0.0%) | 7 (0.3%) | 54 | 71 | 11 |
| AD.CodaFirst 1.1 | 1019 | 2 | 1017 | 1017 (99.8%) | 2 (0.2%) | 0 (0.0%) | 28 | 27 | 13 |
| madmath.Cow 0.1.1 | 1052 | 11 | 1068 | 1050 (99.8%) | 2 (0.2%) | 18 (1.7%) | 44 | 32 | 12 |
| kjc.Karaykan 1.0 | 1556 | 6 | 1542 | 1541 (99.0%) | 15 (1.0%) | 1 (0.1%) | 82 | 60 | 17 |
| pac.ABC 2.1 | 366 | 4 | 366 | 366 (100.0%) | 0 (0.0%) | 0 (0.0%) | 16 | 5 | 9 |
| bk.Shooter 1.0 | 1343 | 11 | 1316 | 1316 (98.0%) | 27 (2.0%) | 0 (0.0%) | 3 | 18 | 11 |
| McS.Spanky_test 0.1a | 664 | 4 | 664 | 664 (100.0%) | 0 (0.0%) | 0 (0.0%) | 23 | 23 | 10 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 3152 | 242 (7.7%) | 1531 |
| apv.TheBrainPi 0.5fix | 4610 | 357 (7.7%) | 3326 |
| jmcd.BeoWulf 2.8 | 5396 | 458 (8.5%) | 4694 |
| DM.Mijit .3 | 3498 | 428 (12.2%) | 2820 |
| nan.Ihivatar_Mk_1 1.0 | 4094 | 321 (7.8%) | 2168 |
| jab.micro.Sanguijuela 0.8 | 1159 | 86 (7.4%) | 381 |
| serenity.moonlightBat 1.17 | 5570 | 505 (9.1%) | 4587 |
| myl.nano.Kakuru 1.20 | 3619 | 180 (5.0%) | 725 |
| mcb.Audace 1.3 | 1624 | 76 (4.7%) | 0 |
| suh.micro.WallPM 1.00 | 4723 | 292 (6.2%) | 1723 |
| fm.claire 1.7 | 3164 | 219 (6.9%) | 1077 |
| dmh.robocode.robot.GreenDragon 1.0 | 3571 | 273 (7.6%) | 1668 |
| oog.melee.Mercutio 1.0 | 3633 | 344 (9.5%) | 3078 |
| js.PinBall 1.6 | 2569 | 245 (9.5%) | 1177 |
| EH.Fusion 0.32 | 1257 | 35 (2.8%) | 0 |
| ratosh.Wesco 1.4 | 3340 | 132 (4.0%) | 139 |
| xander.cat.Spitfire 1.4 | 1380 | 90 (6.5%) | 621 |
| marksteam.Phoenix 1.0 | 3247 | 151 (4.7%) | 0 |
| ndn.DyslexicMonkey 1.1 | 2896 | 167 (5.8%) | 344 |
| supersample.SuperCorners 1.0 | 2092 | 93 (4.4%) | 207 |
| bots.UnterExBot 1.0 | 2963 | 173 (5.8%) | 485 |
| hlavko.nano.Ringo 2.0 | 2275 | 137 (6.0%) | 0 |
| dsw.StaticD 1.0 | 2484 | 152 (6.1%) | 609 |
| sul.BlueBot 1.0 | 1376 | 106 (7.7%) | 50 |
| hapiel.Spiral 0.1 | 3475 | 226 (6.5%) | 1128 |
| Lo_Ian.Gandalf_V4 4.0 | 2055 | 94 (4.6%) | 0 |
| suh.nano.CrossC 1.00 | 2029 | 105 (5.2%) | 824 |
| hirataatsushi.Trinity 0.003 | 1678 | 165 (9.8%) | 708 |
| adt.Ar2 1.0 | 1867 | 143 (7.7%) | 505 |
| yk.JahMicro 1.0 | 3746 | 179 (4.8%) | 510 |
| uccc.MilkyWay 1.01 | 2601 | 208 (8.0%) | 1523 |
| amk.superstrike.SuperStrike 0.3 | 2312 | 98 (4.2%) | 0 |
| omens.CannonfodderNano 1.4 | 2446 | 129 (5.3%) | 578 |
| AD.CodaFirst 1.1 | 1510 | 36 (2.4%) | 0 |
| madmath.Cow 0.1.1 | 1629 | 45 (2.8%) | 0 |
| kjc.Karaykan 1.0 | 1544 | 56 (3.6%) | 0 |
| pac.ABC 2.1 | 2569 | 23 (0.9%) | 0 |
| bk.Shooter 1.0 | 2603 | 46 (1.8%) | 0 |
| McS.Spanky_test 0.1a | 2547 | 35 (1.4%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 650 | 304 | 400 | 356 | 57.7 / 13.1 | 1238 | 2164 | 0 |
| apv.TheBrainPi 0.5fix | 650 | 454 | 588 | 473 | 40.0 / 27.0 | 595 | 3341 | 13 |
| jmcd.BeoWulf 2.8 | 650 | 413 | 463 | 556 | 54.7 / 20.8 | 1351 | 2366 | 48 |
| DM.Mijit .3 | 650 | 443 | 450 | 385 | 51.3 / 14.2 | 1223 | 2399 | 799 |
| nan.Ihivatar_Mk_1 1.0 | 650 | 408 | 513 | 431 | 34.1 / 17.8 | 446 | 3610 | 1952 |
| jab.micro.Sanguijuela 0.8 | 650 | 138 | 650 | 149 | 105.0 / 64.8 | 1036 | 1677 | 64 |
| serenity.moonlightBat 1.17 | 650 | 448 | 400 | 585 | 64.1 / 3.6 | 1412 | 2166 | 0 |
| myl.nano.Kakuru 1.20 | 650 | 466 | 525 | 385 | 38.9 / 24.1 | 824 | 2761 | 1797 |
| mcb.Audace 1.3 | 650 | 255 | 400 | 200 | 71.9 / 9.3 | 1159 | 2625 | 350 |
| suh.micro.WallPM 1.00 | 650 | 476 | 519 | 495 | 64.8 / 22.1 | 1905 | 2154 | 249 |
| fm.claire 1.7 | 650 | 475 | 400 | 343 | 35.4 / 6.2 | 499 | 3762 | 2012 |
| dmh.robocode.robot.GreenDragon 1.0 | 650 | 516 | 400 | 392 | 49.5 / 12.8 | 1179 | 2854 | 1270 |
| oog.melee.Mercutio 1.0 | 650 | 448 | 400 | 416 | 71.7 / 4.7 | 2158 | 2241 | 580 |
| js.PinBall 1.6 | 650 | 359 | 400 | 306 | 67.0 / 4.2 | 1747 | 2061 | 532 |
| EH.Fusion 0.32 | 650 | 303 | 456 | 161 | 86.6 / 34.1 | 966 | 1744 | 94 |
| ratosh.Wesco 1.4 | 650 | 392 | 400 | 370 | 41.2 / 4.9 | 559 | 3587 | 75 |
| xander.cat.Spitfire 1.4 | 650 | 394 | 400 | 174 | 98.0 / 0.0 | 1031 | 519 | 15 |
| marksteam.Phoenix 1.0 | 650 | 422 | 400 | 357 | 54.4 / 8.0 | 1232 | 3517 | 279 |
| ndn.DyslexicMonkey 1.1 | 650 | 394 | 400 | 336 | 64.8 / 5.2 | 1817 | 2388 | 922 |
| supersample.SuperCorners 1.0 | 650 | 273 | 400 | 258 | 71.6 / 14.1 | 1482 | 1326 | 37 |
| bots.UnterExBot 1.0 | 650 | 326 | 400 | 345 | 67.0 / 2.3 | 1890 | 1942 | 54 |
| hlavko.nano.Ringo 2.0 | 650 | 466 | 400 | 270 | 54.4 / 2.5 | 1353 | 2061 | 162 |
| dsw.StaticD 1.0 | 650 | 383 | 400 | 297 | 77.8 / 1.5 | 1888 | 1518 | 486 |
| sul.BlueBot 1.0 | 650 | 397 | 400 | 174 | 79.1 / 0.7 | 1013 | 1106 | 497 |
| hapiel.Spiral 0.1 | 650 | 348 | 400 | 400 | 75.3 / 6.5 | 2173 | 2168 | 218 |
| Lo_Ian.Gandalf_V4 4.0 | 650 | 302 | 400 | 249 | 81.7 / 1.8 | 1336 | 937 | 1 |
| suh.nano.CrossC 1.00 | 650 | 404 | 400 | 245 | 76.7 / 3.3 | 1475 | 1502 | 574 |
| hirataatsushi.Trinity 0.003 | 650 | 299 | 400 | 211 | 85.1 / 7.5 | 1350 | 1099 | 186 |
| adt.Ar2 1.0 | 650 | 309 | 400 | 230 | 67.8 / 7.4 | 1375 | 1926 | 18 |
| yk.JahMicro 1.0 | 650 | 383 | 400 | 429 | 78.4 / 10.3 | 2430 | 760 | 27 |
| uccc.MilkyWay 1.01 | 650 | 385 | 413 | 310 | 82.3 / 3.9 | 1931 | 1575 | 211 |
| amk.superstrike.SuperStrike 0.3 | 650 | 391 | 400 | 278 | 67.0 / 4.4 | 1717 | 2027 | 505 |
| omens.CannonfodderNano 1.4 | 650 | 382 | 400 | 294 | 83.2 / 4.3 | 1881 | 1273 | 286 |
| AD.CodaFirst 1.1 | 650 | 288 | 400 | 189 | 79.1 / 1.6 | 1037 | 2304 | 627 |
| madmath.Cow 0.1.1 | 650 | 382 | 400 | 203 | 78.9 / 3.2 | 1166 | 1315 | 316 |
| kjc.Karaykan 1.0 | 650 | 409 | 400 | 194 | 80.2 / 6.8 | 1107 | 1294 | 396 |
| pac.ABC 2.1 | 650 | 410 | 400 | 296 | 95.4 / 0.8 | 1191 | 234 | 23 |
| bk.Shooter 1.0 | 650 | 421 | 400 | 309 | 82.0 / 2.2 | 1869 | 1068 | 238 |
| McS.Spanky_test 0.1a | 650 | 391 | 400 | 304 | 95.4 / 0.5 | 1898 | 270 | 111 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 7.0% | 51 | 14 | 3 | 22.7 | 240 / 242 (99%) | 0 | 0 |
| apv.TheBrainPi 0.5fix | 6.2% | 50 | 159 | 3 | 27.5 | 357 / 357 (100%) | 0 | 0 |
| jmcd.BeoWulf 2.8 | 7.4% | 57 | 32 | 3 | 38.1 | 456 / 458 (100%) | 0 | 0 |
| DM.Mijit .3 | 6.1% | 47 | 22 | 3 | 24.4 | 422 / 428 (99%) | 0 | 0 |
| nan.Ihivatar_Mk_1 1.0 | 4.8% | 49 | 30 | 3 | 24.9 | 317 / 321 (99%) | 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 50.1% | 40 | 14 | 3 | 7.7 | 86 / 86 (100%) | 0 | 0 |
| serenity.moonlightBat 1.17 | 2.1% | 43 | 21 | 3 | 40.1 | 505 / 505 (100%) | 0 | 0 |
| myl.nano.Kakuru 1.20 | 6.4% | 46 | 28 | 3 | 21.9 | 180 / 180 (100%) | 0 | 0 |
| mcb.Audace 1.3 | 4.6% | 42 | 13 | 2 | 11.1 | 76 / 76 (100%) | 0 | 0 |
| suh.micro.WallPM 1.00 | 9.6% | 55 | 31 | 2 | 35.8 | 290 / 292 (99%) | 0 | 0 |
| fm.claire 1.7 | 2.2% | 43 | 22 | 3 | 19.7 | 218 / 219 (100%) | 0 | 0 |
| dmh.robocode.robot.GreenDragon 1.0 | 4.4% | 46 | 88 | 2 | 25.9 | 271 / 273 (99%) | 0 | 0 |
| oog.melee.Mercutio 1.0 | 3.3% | 44 | 25 | 3 | 27.0 | 342 / 344 (99%) | 0 | 0 |
| js.PinBall 1.6 | 2.6% | 45 | 20 | 3 | 21.0 | 245 / 245 (100%) | 0 | 0 |
| EH.Fusion 0.32 | 22.7% | 52 | 14 | 3 | 8.4 | 35 / 35 (100%) | 0 | 0 |
| ratosh.Wesco 1.4 | 1.8% | 43 | 22 | 3 | 21.9 | 132 / 132 (100%) | 0 | 0 |
| xander.cat.Spitfire 1.4 | 0.1% | 44 | 16 | 3 | 9.3 | 67 / 90 (74%) | 0 | 0 |
| marksteam.Phoenix 1.0 | 3.4% | 50 | 21 | 3 | 21.1 | 150 / 151 (99%) | 0 | 0 |
| ndn.DyslexicMonkey 1.1 | 2.7% | 47 | 68 | 3 | 21.4 | 164 / 167 (98%) | 0 | 0 |
| supersample.SuperCorners 1.0 | 8.7% | 43 | 15 | 3 | 15.2 | 93 / 93 (100%) | 0 | 0 |
| bots.UnterExBot 1.0 | 2.2% | 48 | 17 | 3 | 24.0 | 172 / 173 (99%) | 0 | 0 |
| hlavko.nano.Ringo 2.0 | 4.3% | 45 | 14 | 3 | 17.4 | 134 / 137 (98%) | 0 | 0 |
| dsw.StaticD 1.0 | 1.6% | 44 | 15 | 3 | 20.7 | 148 / 152 (97%) | 0 | 0 |
| sul.BlueBot 1.0 | 0.6% | 49 | 16 | 3 | 10.6 | 106 / 106 (100%) | 0 | 0 |
| hapiel.Spiral 0.1 | 6.3% | 49 | 20 | 3 | 30.4 | 226 / 226 (100%) | 0 | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 1.5% | 47 | 15 | 3 | 6.0 | 94 / 94 (100%) | 0 | 0 |
| suh.nano.CrossC 1.00 | 2.7% | 52 | 19 | 3 | 16.2 | 104 / 105 (99%) | 0 | 0 |
| hirataatsushi.Trinity 0.003 | 9.6% | 59 | 13 | 3 | 14.2 | 165 / 165 (100%) | 0 | 0 |
| adt.Ar2 1.0 | 3.6% | 48 | 13 | 3 | 13.2 | 143 / 143 (100%) | 0 | 0 |
| yk.JahMicro 1.0 | 6.8% | 54 | 17 | 3 | 19.3 | 179 / 179 (100%) | 0 | 0 |
| uccc.MilkyWay 1.01 | 4.0% | 46 | 15 | 3 | 20.1 | 208 / 208 (100%) | 0 | 0 |
| amk.superstrike.SuperStrike 0.3 | 2.4% | 55 | 16 | 3 | 16.9 | 98 / 98 (100%) | 0 | 0 |
| omens.CannonfodderNano 1.4 | 3.8% | 50 | 21 | 3 | 16.9 | 129 / 129 (100%) | 0 | 0 |
| AD.CodaFirst 1.1 | 1.0% | 45 | 11 | 3 | 7.3 | 36 / 36 (100%) | 0 | 0 |
| madmath.Cow 0.1.1 | 2.4% | 47 | 588 | 3 | 7.6 | 45 / 45 (100%) | 0 | 0 |
| kjc.Karaykan 1.0 | 6.1% | 47 | 12 | 3 | 11.0 | 56 / 56 (100%) | 0 | 0 |
| pac.ABC 2.1 | 2.2% | 44 | 13 | 3 | 2.6 | 23 / 23 (100%) | 0 | 0 |
| bk.Shooter 1.0 | 1.9% | 49 | 14 | 3 | 9.4 | 46 / 46 (100%) | 0 | 0 |
| McS.Spanky_test 0.1a | 2.7% | 44 | 15 | 3 | 4.7 | 35 / 35 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| apv.TheBrainPi 0.5fix | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| jmcd.BeoWulf 2.8 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| DM.Mijit .3 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| nan.Ihivatar_Mk_1 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| serenity.moonlightBat 1.17 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| myl.nano.Kakuru 1.20 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| mcb.Audace 1.3 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| suh.micro.WallPM 1.00 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| fm.claire 1.7 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| dmh.robocode.robot.GreenDragon 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| oog.melee.Mercutio 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| js.PinBall 1.6 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| EH.Fusion 0.32 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| ratosh.Wesco 1.4 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| xander.cat.Spitfire 1.4 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| marksteam.Phoenix 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| ndn.DyslexicMonkey 1.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| supersample.SuperCorners 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| bots.UnterExBot 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| hlavko.nano.Ringo 2.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| dsw.StaticD 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| sul.BlueBot 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| hapiel.Spiral 0.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| suh.nano.CrossC 1.00 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| hirataatsushi.Trinity 0.003 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| adt.Ar2 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| yk.JahMicro 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| uccc.MilkyWay 1.01 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| amk.superstrike.SuperStrike 0.3 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| omens.CannonfodderNano 1.4 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| AD.CodaFirst 1.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| madmath.Cow 0.1.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| kjc.Karaykan 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| pac.ABC 2.1 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| bk.Shooter 1.0 | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |
| McS.Spanky_test 0.1a | 0 / 4 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| AD.CodaFirst 1.1 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 93.1% ± 17.4 | 96.6% ± 4.3 | +3.5 ± 20.9 |
| AD.CodaFirst 1.1 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 96.4% ± 3.8 | 97.1% ± 4.9 | +0.7 ± 7.6 |
| DM.Mijit .3 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 72.2% ± 8.3 | 82.1% ± 5.7 | +9.9 ± 11.2 |
| DM.Mijit .3 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 71.3% ± 7.0 | 78.2% ± 6.8 | +6.9 ± 12.5 |
| EH.Fusion 0.32 | hadur2.Hadur 3.10 | 4 | 70.0% ± 18.4 | 100.0% ± 0.0 | +30.0 ± 18.4 | 54.2% ± 1.3 | 68.6% ± 1.2 | +14.3 ± 1.3 |
| EH.Fusion 0.32 | hadur2.Hadur 3.9 | 4 | 85.0% ± 30.5 | 100.0% ± 0.0 | +15.0 ± 30.5 | 54.5% ± 5.0 | 71.1% ± 10.1 | +16.6 ± 8.8 |
| Lo_Ian.Gandalf_V4 4.0 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 89.1% ± 11.1 | 99.5% ± 1.5 | +10.4 ± 10.0 |
| Lo_Ian.Gandalf_V4 4.0 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 90.9% ± 10.0 | 99.9% ± 0.1 | +9.1 ± 10.0 |
| McS.Spanky_test 0.1a | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 99.5% ± 1.6 | 99.9% ± 0.3 | +0.4 ± 1.8 |
| McS.Spanky_test 0.1a | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 99.5% ± 1.6 | 99.1% ± 2.5 | -0.4 ± 3.5 |
| adt.Ar2 1.0 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 86.7% ± 13.6 | 94.0% ± 8.5 | +7.3 ± 16.1 |
| adt.Ar2 1.0 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 77.0% ± 2.6 | 91.9% ± 6.9 | +14.9 ± 8.7 |
| amk.superstrike.SuperStrike 0.3 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 88.5% ± 7.0 | 95.2% ± 3.3 | +6.7 ± 10.2 |
| amk.superstrike.SuperStrike 0.3 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 85.1% ± 5.8 | 93.5% ± 2.2 | +8.4 ± 5.8 |
| apv.TheBrainPi 0.5fix | hadur2.Hadur 3.10 | 4 | 90.0% ± 18.4 | 87.5% ± 20.0 | -2.5 ± 15.2 | 63.8% ± 19.2 | 62.7% ± 7.4 | -1.0 ± 15.5 |
| apv.TheBrainPi 0.5fix | hadur2.Hadur 3.9 | 4 | 95.0% ± 15.9 | 90.0% ± 22.5 | -5.0 ± 27.6 | 61.9% ± 16.8 | 64.2% ± 13.9 | +2.3 ± 24.1 |
| bk.Shooter 1.0 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 93.5% ± 5.2 | 98.0% ± 1.8 | +4.5 ± 5.2 |
| bk.Shooter 1.0 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 92.1% ± 6.0 | 98.3% ± 3.2 | +6.2 ± 9.0 |
| bots.UnterExBot 1.0 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 91.2% ± 1.9 | 99.4% ± 0.3 | +8.2 ± 2.2 |
| bots.UnterExBot 1.0 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 89.4% ± 11.3 | 99.1% ± 1.0 | +9.7 ± 11.9 |
| dmh.robocode.robot.GreenDragon 1.0 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 67.9% ± 15.2 | 80.5% ± 4.0 | +12.5 ± 18.0 |
| dmh.robocode.robot.GreenDragon 1.0 | hadur2.Hadur 3.9 | 4 | 95.0% ± 15.9 | 100.0% ± 0.0 | +5.0 ± 15.9 | 68.9% ± 21.9 | 82.9% ± 7.5 | +14.0 ± 22.9 |
| dsw.StaticD 1.0 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 94.3% ± 4.1 | 99.6% ± 0.9 | +5.3 ± 4.2 |
| dsw.StaticD 1.0 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 94.0% ± 2.1 | 99.2% ± 1.1 | +5.2 ± 2.7 |
| ers.nano.lig.LigMA 1.9 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 95.0% ± 9.2 | -5.0 ± 9.2 | 79.1% ± 5.9 | 79.4% ± 8.6 | +0.3 ± 13.5 |
| ers.nano.lig.LigMA 1.9 | hadur2.Hadur 3.9 | 4 | 95.0% ± 15.9 | 100.0% ± 0.0 | +5.0 ± 15.9 | 78.0% ± 10.3 | 81.2% ± 6.1 | +3.2 ± 14.1 |
| fm.claire 1.7 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 76.8% ± 15.4 | 86.6% ± 9.8 | +9.8 ± 22.8 |
| fm.claire 1.7 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 76.3% ± 11.7 | 79.3% ± 5.2 | +2.9 ± 16.5 |
| hapiel.Spiral 0.1 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 89.6% ± 4.6 | 94.0% ± 4.0 | +4.4 ± 4.7 |
| hapiel.Spiral 0.1 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 90.2% ± 6.0 | 93.8% ± 3.9 | +3.6 ± 3.8 |
| hirataatsushi.Trinity 0.003 | hadur2.Hadur 3.10 | 4 | 95.0% ± 15.9 | 100.0% ± 0.0 | +5.0 ± 15.9 | 82.0% ± 11.5 | 91.5% ± 4.9 | +9.6 ± 14.2 |
| hirataatsushi.Trinity 0.003 | hadur2.Hadur 3.9 | 4 | 95.0% ± 15.9 | 100.0% ± 0.0 | +5.0 ± 15.9 | 80.9% ± 8.4 | 94.7% ± 2.1 | +13.8 ± 7.9 |
| hlavko.nano.Ringo 2.0 | hadur2.Hadur 3.10 | 4 | 95.0% ± 15.9 | 100.0% ± 0.0 | +5.0 ± 15.9 | 83.8% ± 18.5 | 94.9% ± 7.5 | +11.2 ± 18.2 |
| hlavko.nano.Ringo 2.0 | hadur2.Hadur 3.9 | 4 | 95.0% ± 15.9 | 100.0% ± 0.0 | +5.0 ± 15.9 | 87.7% ± 25.6 | 97.3% ± 3.4 | +9.6 ± 28.5 |
| jab.micro.Sanguijuela 0.8 | hadur2.Hadur 3.10 | 4 | 95.0% ± 15.9 | 100.0% ± 0.0 | +5.0 ± 15.9 | 55.9% ± 7.4 | 57.9% ± 2.8 | +2.1 ± 8.3 |
| jab.micro.Sanguijuela 0.8 | hadur2.Hadur 3.9 | 4 | 90.0% ± 18.4 | 100.0% ± 0.0 | +10.0 ± 18.4 | 56.3% ± 7.3 | 57.6% ± 0.9 | +1.2 ± 7.0 |
| jmcd.BeoWulf 2.8 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 63.0% ± 9.8 | 76.8% ± 5.4 | +13.8 ± 14.2 |
| jmcd.BeoWulf 2.8 | hadur2.Hadur 3.9 | 4 | 85.0% ± 15.9 | 100.0% ± 0.0 | +15.0 ± 15.9 | 65.4% ± 20.4 | 76.5% ± 2.7 | +11.1 ± 18.5 |
| js.PinBall 1.6 | hadur2.Hadur 3.10 | 4 | 95.0% ± 15.9 | 100.0% ± 0.0 | +5.0 ± 15.9 | 82.9% ± 3.8 | 98.2% ± 2.2 | +15.2 ± 5.6 |
| js.PinBall 1.6 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 87.7% ± 5.0 | 94.5% ± 3.9 | +6.8 ± 8.8 |
| kjc.Karaykan 1.0 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 85.6% ± 15.7 | 87.5% ± 8.9 | +1.9 ± 15.5 |
| kjc.Karaykan 1.0 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 90.2% ± 2.3 | 92.6% ± 7.5 | +2.4 ± 7.6 |
| madmath.Cow 0.1.1 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 86.1% ± 8.8 | 92.0% ± 6.4 | +6.0 ± 14.6 |
| madmath.Cow 0.1.1 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 88.8% ± 6.6 | 97.1% ± 1.7 | +8.3 ± 5.6 |
| marksteam.Phoenix 1.0 | hadur2.Hadur 3.10 | 4 | 95.0% ± 15.9 | 100.0% ± 0.0 | +5.0 ± 15.9 | 67.7% ± 11.6 | 87.4% ± 10.9 | +19.7 ± 13.8 |
| marksteam.Phoenix 1.0 | hadur2.Hadur 3.9 | 4 | 95.0% ± 15.9 | 100.0% ± 0.0 | +5.0 ± 15.9 | 71.3% ± 13.0 | 93.8% ± 5.7 | +22.5 ± 11.0 |
| mcb.Audace 1.3 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 75.6% ± 7.0 | 85.2% ± 5.0 | +9.5 ± 9.3 |
| mcb.Audace 1.3 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 77.4% ± 5.8 | 91.9% ± 10.3 | +14.5 ± 12.2 |
| myl.nano.Kakuru 1.20 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 89.7% ± 13.0 | -10.3 ± 13.0 | 53.9% ± 10.8 | 52.9% ± 5.2 | -1.1 ± 15.4 |
| myl.nano.Kakuru 1.20 | hadur2.Hadur 3.9 | 4 | 95.0% ± 15.9 | 92.5% ± 15.2 | -2.5 ± 27.2 | 59.3% ± 21.0 | 56.2% ± 5.0 | -3.1 ± 18.5 |
| nan.Ihivatar_Mk_1 1.0 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 97.5% ± 8.0 | -2.5 ± 8.0 | 58.6% ± 6.0 | 81.7% ± 24.8 | +23.1 ± 28.9 |
| nan.Ihivatar_Mk_1 1.0 | hadur2.Hadur 3.9 | 4 | 95.0% ± 15.9 | 92.5% ± 15.2 | -2.5 ± 27.2 | 56.4% ± 10.5 | 71.1% ± 28.7 | +14.7 ± 30.9 |
| ndn.DyslexicMonkey 1.1 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 84.8% ± 5.5 | 92.9% ± 8.2 | +8.1 ± 6.2 |
| ndn.DyslexicMonkey 1.1 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 82.5% ± 7.0 | 94.4% ± 3.0 | +11.8 ± 6.1 |
| omens.CannonfodderNano 1.4 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 92.5% ± 7.1 | 93.4% ± 2.9 | +1.0 ± 7.7 |
| omens.CannonfodderNano 1.4 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 94.0% ± 4.5 | 91.9% ± 4.7 | -2.1 ± 3.6 |
| oog.melee.Mercutio 1.0 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 86.9% ± 3.2 | 95.2% ± 3.3 | +8.3 ± 4.7 |
| oog.melee.Mercutio 1.0 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 87.9% ± 4.7 | 95.5% ± 3.4 | +7.6 ± 6.1 |
| pac.ABC 2.1 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 99.6% ± 1.4 | 99.4% ± 0.7 | -0.2 ± 2.1 |
| pac.ABC 2.1 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 98.7% ± 4.2 | 99.2% ± 1.6 | +0.5 ± 4.3 |
| ratosh.Wesco 1.4 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 86.5% ± 14.6 | 85.1% ± 17.3 | -1.4 ± 26.4 |
| ratosh.Wesco 1.4 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 99.0% ± 2.4 | 88.7% ± 18.2 | -10.3 ± 19.3 |
| serenity.moonlightBat 1.17 | hadur2.Hadur 3.10 | 4 | 95.0% ± 15.9 | 100.0% ± 0.0 | +5.0 ± 15.9 | 84.8% ± 5.1 | 96.4% ± 3.3 | +11.6 ± 5.0 |
| serenity.moonlightBat 1.17 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 85.9% ± 5.6 | 96.3% ± 0.8 | +10.4 ± 5.6 |
| suh.micro.WallPM 1.00 | hadur2.Hadur 3.10 | 4 | 95.0% ± 15.9 | 92.5% ± 8.0 | -2.5 ± 23.9 | 75.0% ± 5.8 | 73.4% ± 5.3 | -1.5 ± 9.5 |
| suh.micro.WallPM 1.00 | hadur2.Hadur 3.9 | 4 | 95.0% ± 15.9 | 97.5% ± 8.0 | +2.5 ± 8.0 | 74.5% ± 8.7 | 78.3% ± 5.5 | +3.8 ± 4.5 |
| suh.nano.CrossC 1.00 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 89.7% ± 6.9 | 98.3% ± 1.7 | +8.5 ± 6.9 |
| suh.nano.CrossC 1.00 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 92.0% ± 3.1 | 96.8% ± 6.0 | +4.8 ± 3.0 |
| sul.BlueBot 1.0 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 98.0% ± 2.1 | 97.2% ± 2.4 | -0.8 ± 3.1 |
| sul.BlueBot 1.0 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 98.9% ± 2.1 | 97.6% ± 1.5 | -1.3 ± 2.6 |
| supersample.SuperCorners 1.0 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 95.0% ± 9.2 | -5.0 ± 9.2 | 81.2% ± 11.6 | 88.2% ± 3.1 | +7.1 ± 14.6 |
| supersample.SuperCorners 1.0 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 97.5% ± 8.0 | -2.5 ± 8.0 | 79.6% ± 15.4 | 85.4% ± 8.3 | +5.8 ± 19.7 |
| uccc.MilkyWay 1.01 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 91.3% ± 10.5 | 95.4% ± 4.8 | +4.1 ± 10.1 |
| uccc.MilkyWay 1.01 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 92.9% ± 4.2 | 94.2% ± 8.3 | +1.3 ± 11.5 |
| xander.cat.Spitfire 1.4 | hadur2.Hadur 3.10 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 100.0% ± 0.1 | 100.0% ± 0.0 | +0.0 ± 0.1 |
| xander.cat.Spitfire 1.4 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 99.9% ± 0.1 | 100.0% ± 0.0 | +0.0 ± 0.1 |
| yk.JahMicro 1.0 | hadur2.Hadur 3.10 | 4 | 95.0% ± 15.9 | 97.5% ± 8.0 | +2.5 ± 8.0 | 83.9% ± 14.3 | 89.9% ± 6.8 | +6.0 ± 11.7 |
| yk.JahMicro 1.0 | hadur2.Hadur 3.9 | 4 | 100.0% ± 0.0 | 97.5% ± 8.0 | -2.5 ± 8.0 | 83.0% ± 13.6 | 89.2% ± 2.6 | +6.2 ± 15.5 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| AD.CodaFirst 1.1 | +0.0 ± 0.0 | +0.0 ± 0.0 | -3.3 ± 19.0 | -0.5 ± 5.5 |
| DM.Mijit .3 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.9 ± 9.0 | +3.9 ± 8.0 |
| EH.Fusion 0.32 | -15.0 ± 30.5 | +0.0 ± 0.0 | -0.3 ± 6.3 | -2.6 ± 10.3 |
| Lo_Ian.Gandalf_V4 4.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | -1.8 ± 13.5 | -0.4 ± 1.5 |
| McS.Spanky_test 0.1a | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.0 ± 0.0 | +0.8 ± 2.6 |
| adt.Ar2 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +9.6 ± 13.0 | +2.1 ± 8.3 |
| amk.superstrike.SuperStrike 0.3 | +0.0 ± 0.0 | +0.0 ± 0.0 | +3.4 ± 5.3 | +1.7 ± 5.3 |
| apv.TheBrainPi 0.5fix | -5.0 ± 30.5 | -2.5 ± 35.3 | +1.9 ± 33.0 | -1.4 ± 17.1 |
| bk.Shooter 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +1.4 ± 3.1 | -0.3 ± 3.1 |
| bots.UnterExBot 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +1.8 ± 10.4 | +0.3 ± 0.9 |
| dmh.robocode.robot.GreenDragon 1.0 | +5.0 ± 15.9 | +0.0 ± 0.0 | -1.0 ± 19.1 | -2.4 ± 8.8 |
| dsw.StaticD 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.4 ± 3.5 | +0.4 ± 1.0 |
| ers.nano.lig.LigMA 1.9 | +5.0 ± 15.9 | -5.0 ± 9.2 | +1.1 ± 7.4 | -1.8 ± 14.1 |
| fm.claire 1.7 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.4 ± 13.3 | +7.3 ± 12.0 |
| hapiel.Spiral 0.1 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.5 ± 5.8 | +0.3 ± 4.1 |
| hirataatsushi.Trinity 0.003 | +0.0 ± 0.0 | +0.0 ± 0.0 | +1.1 ± 3.4 | -3.2 ± 6.7 |
| hlavko.nano.Ringo 2.0 | +0.0 ± 26.0 | +0.0 ± 0.0 | -3.9 ± 33.2 | -2.4 ± 7.6 |
| jab.micro.Sanguijuela 0.8 | +5.0 ± 15.9 | +0.0 ± 0.0 | -0.5 ± 1.6 | +0.4 ± 2.3 |
| jmcd.BeoWulf 2.8 | +15.0 ± 15.9 | +0.0 ± 0.0 | -2.4 ± 23.3 | +0.3 ± 4.0 |
| js.PinBall 1.6 | -5.0 ± 15.9 | +0.0 ± 0.0 | -4.8 ± 7.3 | +3.7 ± 5.9 |
| kjc.Karaykan 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | -4.5 ± 16.2 | -5.1 ± 12.2 |
| madmath.Cow 0.1.1 | +0.0 ± 0.0 | +0.0 ± 0.0 | -2.8 ± 13.4 | -5.0 ± 5.4 |
| marksteam.Phoenix 1.0 | +0.0 ± 26.0 | +0.0 ± 0.0 | -3.6 ± 14.1 | -6.5 ± 14.1 |
| mcb.Audace 1.3 | +0.0 ± 0.0 | +0.0 ± 0.0 | -1.8 ± 6.0 | -6.8 ± 15.2 |
| myl.nano.Kakuru 1.20 | +5.0 ± 15.9 | -2.8 ± 19.9 | -5.4 ± 17.6 | -3.4 ± 7.3 |
| nan.Ihivatar_Mk_1 1.0 | +5.0 ± 15.9 | +5.0 ± 9.2 | +2.1 ± 13.6 | +10.5 ± 15.6 |
| ndn.DyslexicMonkey 1.1 | +0.0 ± 0.0 | +0.0 ± 0.0 | +2.2 ± 9.5 | -1.5 ± 8.2 |
| omens.CannonfodderNano 1.4 | +0.0 ± 0.0 | +0.0 ± 0.0 | -1.5 ± 4.4 | +1.5 ± 6.0 |
| oog.melee.Mercutio 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | -1.0 ± 4.8 | -0.3 ± 4.0 |
| pac.ABC 2.1 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.9 ± 4.8 | +0.1 ± 1.3 |
| ratosh.Wesco 1.4 | +0.0 ± 0.0 | +0.0 ± 0.0 | -12.5 ± 14.6 | -3.6 ± 35.1 |
| serenity.moonlightBat 1.17 | -5.0 ± 15.9 | +0.0 ± 0.0 | -1.1 ± 4.7 | +0.1 ± 3.8 |
| suh.micro.WallPM 1.00 | +0.0 ± 26.0 | -5.0 ± 9.2 | +0.4 ± 9.8 | -4.8 ± 7.5 |
| suh.nano.CrossC 1.00 | +0.0 ± 0.0 | +0.0 ± 0.0 | -2.2 ± 6.1 | +1.5 ± 7.1 |
| sul.BlueBot 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.9 ± 2.1 | -0.3 ± 2.4 |
| supersample.SuperCorners 1.0 | +0.0 ± 0.0 | -2.5 ± 8.0 | +1.6 ± 19.6 | +2.9 ± 11.3 |
| uccc.MilkyWay 1.01 | +0.0 ± 0.0 | +0.0 ± 0.0 | -1.6 ± 8.9 | +1.2 ± 3.5 |
| xander.cat.Spitfire 1.4 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.2 | +0.0 ± 0.0 |
| yk.JahMicro 1.0 | -5.0 ± 15.9 | +0.0 ± 13.0 | +0.9 ± 16.9 | +0.7 ± 8.8 |
