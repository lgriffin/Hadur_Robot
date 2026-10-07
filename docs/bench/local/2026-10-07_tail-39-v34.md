# Bench: hadur2.Hadur 3.9 (cold)

## Excluded or failing opponents

These failed at least half of their battles, so their rows are missing or thin and the set is smaller than it was asked to be.

| Opponent | Battles failed | First failure |
|---|---|---|
| e32.Omni 0.06 | 8 of 8 (all) | expected 2 robots; found 1 |
| e32.Omni 0.06 (baseline) | 8 of 8 (all) | expected 2 robots; found 1 |

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 3576 over 312 battles (11.5 per battle, most in one battle 67). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | weak | 87.5% ± 2.5 | 96.1% ± 2.5 | 78.9% ± 2.8 | 269 / 280 | 22.8% ± 1.3 | 8.1% ± 4.5 | 154 | 0 | 0.74 / 61.4 |
| apv.TheBrainPi 0.5fix | weak | 75.5% ± 2.8 | 90.0% ± 3.8 | 61.0% ± 1.9 | 252 / 280 | 14.7% ± 0.6 | 6.1% ± 0.6 | 95 | 0 | 1.14 / 112.0 |
| jmcd.BeoWulf 2.8 | weak | 83.8% ± 1.9 | 95.0% ± 2.5 | 72.9% ± 1.9 | 266 / 280 | 16.9% ± 0.7 | 7.4% ± 0.5 | 105 | 0 | 0.96 / 167.7 |
| DM.Mijit .3 | weak | 90.1% ± 1.1 | 100.0% ± 0.0 | 79.4% ± 2.1 | 280 / 280 | 19.7% ± 1.0 | 5.6% ± 0.7 | 90 | 0 | 0.78 / 17.8 |
| nan.Ihivatar_Mk_1 1.0 | weak | 89.8% ± 4.1 | 98.2% ± 2.5 | 78.3% ± 6.1 | 275 / 280 | 14.7% ± 0.8 | 4.5% ± 4.6 | 92 | 0 | 0.77 / 17.1 |
| jab.micro.Sanguijuela 0.8 | weak | 71.4% ± 1.5 | 97.1% ± 2.6 | 61.4% ± 1.0 | 272 / 280 | 73.9% ± 2.0 | 52.0% ± 4.2 | 79 | 0 | 0.53 / 9.6 |
| serenity.moonlightBat 1.17 | weak | 97.0% ± 1.0 | 99.6% ± 0.8 | 94.1% ± 1.2 | 279 / 280 | 16.7% ± 0.4 | 2.4% ± 0.6 | 82 | 0 | 0.80 / 15.7 |
| myl.nano.Kakuru 1.20 | weak | 77.9% ± 3.5 | 94.3% ± 2.9 | 60.6% ± 5.2 | 264 / 280 | 15.9% ± 1.8 | 6.3% ± 0.6 | 75 | 0 | 0.90 / 16.9 |
| mcb.Audace 1.3 | weak | 93.5% ± 1.2 | 100.0% ± 0.0 | 87.6% ± 2.1 | 280 / 280 | 38.4% ± 1.5 | 4.7% ± 0.9 | 88 | 0 | 0.86 / 14.3 |
| suh.micro.WallPM 1.00 | weak | 83.9% ± 2.8 | 94.3% ± 3.6 | 74.9% ± 2.3 | 264 / 280 | 20.2% ± 0.9 | 9.0% ± 0.9 | 101 | 0 | 1.14 / 12.9 |
| fm.claire 1.7 | weak | 93.0% ± 1.9 | 99.6% ± 0.8 | 83.0% ± 3.8 | 279 / 280 | 15.9% ± 0.7 | 2.4% ± 0.6 | 82 | 0 | 0.77 / 17.1 |
| dmh.robocode.robot.GreenDragon 1.0 | weak | 90.4% ± 2.5 | 98.6% ± 1.8 | 81.2% ± 3.2 | 276 / 280 | 17.4% ± 0.9 | 4.1% ± 0.9 | 89 | 0 | 0.89 / 17.8 |
| oog.melee.Mercutio 1.0 | weak | 96.5% ± 0.8 | 99.6% ± 0.8 | 93.5% ± 1.2 | 279 / 280 | 22.0% ± 0.9 | 3.8% ± 0.8 | 95 | 0 | 0.78 / 16.0 |
| js.PinBall 1.6 | weak | 94.7% ± 2.1 | 99.3% ± 1.1 | 90.6% ± 3.3 | 278 / 280 | 27.4% ± 1.8 | 4.7% ± 1.8 | 95 | 0 | 0.71 / 11.9 |
| EH.Fusion 0.32 | weak | 81.3% ± 1.5 | 98.6% ± 1.8 | 72.8% ± 1.8 | 276 / 280 | 63.9% ± 2.9 | 23.3% ± 1.7 | 90 | 0 | 0.67 / 9.2 |
| ratosh.Wesco 1.4 | weak | 97.3% ± 1.1 | 100.0% ± 0.0 | 93.4% ± 2.5 | 280 / 280 | 16.2% ± 1.1 | 1.1% ± 0.6 | 95 | 0 | 0.69 / 82.6 |
| xander.cat.Spitfire 1.4 | weak | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | 280 / 280 | 65.3% ± 2.9 | 0.2% ± 0.2 | 89 | 0 | 0.57 / 10.3 |
| marksteam.Phoenix 1.0 | weak | 92.2% ± 3.2 | 99.6% ± 0.8 | 84.4% ± 5.7 | 279 / 280 | 20.5% ± 1.0 | 4.2% ± 1.6 | 84 | 0 | 0.90 / 115.7 |
| ndn.DyslexicMonkey 1.1 | weak | 95.3% ± 2.4 | 99.3% ± 1.7 | 91.3% ± 3.2 | 278 / 280 | 22.8% ± 1.2 | 3.0% ± 1.3 | 90 | 0 | 0.69 / 12.0 |
| supersample.SuperCorners 1.0 | weak | 90.0% ± 2.2 | 95.7% ± 2.9 | 86.4% ± 1.4 | 268 / 280 | 39.6% ± 2.6 | 8.7% ± 1.8 | 89 | 0 | 0.70 / 13.3 |
| bots.UnterExBot 1.0 | weak | 97.9% ± 1.3 | 99.6% ± 0.8 | 96.1% ± 1.7 | 279 / 280 | 23.7% ± 1.2 | 2.5% ± 0.8 | 91 | 0 | 0.65 / 14.6 |
| hlavko.nano.Ringo 2.0 | weak | 96.8% ± 1.4 | 99.6% ± 0.8 | 93.6% ± 2.8 | 279 / 280 | 22.7% ± 1.2 | 1.2% ± 0.5 | 91 | 0 | 0.70 / 13.9 |
| dsw.StaticD 1.0 | weak | 99.0% ± 0.3 | 100.0% ± 0.0 | 98.0% ± 0.7 | 280 / 280 | 29.9% ± 2.1 | 1.8% ± 0.6 | 87 | 0 | 0.63 / 13.6 |
| sul.BlueBot 1.0 | weak | 99.6% ± 0.3 | 100.0% ± 0.0 | 99.2% ± 0.6 | 280 / 280 | 48.6% ± 1.5 | 0.4% ± 0.2 | 84 | 0 | 0.64 / 13.2 |
| hapiel.Spiral 0.1 | weak | 95.6% ± 0.6 | 99.6% ± 0.8 | 92.0% ± 0.9 | 279 / 280 | 22.1% ± 1.1 | 6.0% ± 0.5 | 98 | 0 | 0.71 / 13.1 |
| Lo_Ian.Gandalf_V4 4.0 | weak | 98.5% ± 0.5 | 100.0% ± 0.0 | 97.4% ± 0.9 | 280 / 280 | 39.2% ± 1.8 | 2.4% ± 0.8 | 90 | 0 | 0.56 / 10.8 |
| e32.Omni 0.06 | weak | n/a | n/a | n/a | 0 / 0 | - | - | 0 | 0 | 0.00 / 0.0 | 8 battle(s) failed
| suh.nano.CrossC 1.00 | weak | 97.5% ± 0.5 | 100.0% ± 0.0 | 95.3% ± 0.8 | 280 / 280 | 35.4% ± 1.1 | 3.1% ± 0.7 | 85 | 0 | 0.71 / 14.3 |
| hirataatsushi.Trinity 0.003 | weak | 95.4% ± 0.9 | 99.6% ± 0.8 | 92.0% ± 1.3 | 279 / 280 | 45.8% ± 3.7 | 9.7% ± 1.8 | 93 | 0 | 0.66 / 10.5 |
| adt.Ar2 1.0 | weak | 94.4% ± 1.1 | 100.0% ± 0.0 | 89.1% ± 2.0 | 280 / 280 | 32.2% ± 2.9 | 6.4% ± 5.2 | 94 | 0 | 0.77 / 16.0 |
| yk.JahMicro 1.0 | weak | 93.1% ± 1.6 | 97.9% ± 2.5 | 88.9% ± 2.0 | 274 / 280 | 23.2% ± 0.9 | 6.8% ± 1.5 | 85 | 0 | 0.73 / 13.4 |
| uccc.MilkyWay 1.01 | weak | 97.6% ± 1.3 | 99.6% ± 0.8 | 95.8% ± 1.7 | 279 / 280 | 32.9% ± 1.4 | 4.5% ± 1.7 | 89 | 0 | 0.74 / 12.1 |
| amk.superstrike.SuperStrike 0.3 | weak | 97.2% ± 0.5 | 100.0% ± 0.0 | 94.3% ± 1.0 | 280 / 280 | 25.6% ± 1.3 | 2.0% ± 0.5 | 98 | 0 | 0.80 / 15.4 |
| omens.CannonfodderNano 1.4 | weak | 97.4% ± 0.9 | 99.6% ± 0.8 | 95.4% ± 1.1 | 279 / 280 | 31.5% ± 1.5 | 3.5% ± 0.8 | 95 | 0 | 0.67 / 14.1 |
| AD.CodaFirst 1.1 | weak | 99.4% ± 0.4 | 100.0% ± 0.0 | 98.8% ± 0.8 | 280 / 280 | 50.8% ± 3.1 | 1.1% ± 0.8 | 89 | 0 | 0.60 / 10.9 |
| madmath.Cow 0.1.1 | weak | 97.3% ± 0.8 | 100.0% ± 0.0 | 94.9% ± 1.4 | 280 / 280 | 44.8% ± 3.1 | 3.1% ± 0.8 | 92 | 0 | 0.72 / 13.9 |
| kjc.Karaykan 1.0 | weak | 94.4% ± 1.1 | 99.6% ± 0.8 | 90.0% ± 1.8 | 279 / 280 | 48.7% ± 1.9 | 6.8% ± 1.4 | 92 | 0 | 0.69 / 11.4 |
| pac.ABC 2.1 | weak | 99.6% ± 0.2 | 100.0% ± 0.0 | 99.2% ± 0.3 | 280 / 280 | 41.2% ± 2.3 | 2.8% ± 1.0 | 95 | 0 | 0.56 / 10.2 |
| bk.Shooter 1.0 | weak | 98.7% ± 0.2 | 100.0% ± 0.0 | 97.6% ± 0.5 | 280 / 280 | 27.7% ± 1.5 | 1.9% ± 0.4 | 89 | 0 | 0.66 / 115.7 |
| McS.Spanky_test 0.1a | weak | 99.9% ± 0.2 | 100.0% ± 0.0 | 99.8% ± 0.4 | 280 / 280 | 32.4% ± 0.9 | 1.0% ± 1.3 | 80 | 0 | 0.58 / 10.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 8 | 636 | 10.8% | 85.4% | 0.0% | 3.7% | 521 |
| apv.TheBrainPi 0.5fix | 8 | 1159 | 15.1% | 77.9% | 0.0% | 7.0% | 617 |
| jmcd.BeoWulf 2.8 | 8 | 832 | 10.5% | 85.5% | 0.0% | 4.0% | 715 |
| DM.Mijit .3 | 8 | 473 | 0.0% | 99.9% | 0.1% | 0.0% | 531 |
| nan.Ihivatar_Mk_1 1.0 | 8 | 418 | 7.5% | 88.9% | 0.2% | 3.5% | 548 |
| jab.micro.Sanguijuela 0.8 | 8 | 2686 | 1.9% | 88.8% | 8.2% | 1.2% | 306 |
| serenity.moonlightBat 1.17 | 8 | 150 | 4.2% | 94.3% | 0.0% | 1.6% | 746 |
| myl.nano.Kakuru 1.20 | 8 | 1000 | 10.0% | 85.1% | 0.0% | 4.9% | 544 |
| mcb.Audace 1.3 | 8 | 355 | 0.0% | 100.0% | 0.0% | 0.0% | 357 |
| suh.micro.WallPM 1.00 | 8 | 891 | 11.2% | 83.7% | 0.3% | 4.8% | 652 |
| fm.claire 1.7 | 8 | 272 | 2.3% | 96.7% | 0.0% | 1.0% | 498 |
| dmh.robocode.robot.GreenDragon 1.0 | 8 | 445 | 5.6% | 91.9% | 0.0% | 2.4% | 549 |
| oog.melee.Mercutio 1.0 | 8 | 185 | 3.4% | 95.3% | 0.0% | 1.3% | 557 |
| js.PinBall 1.6 | 8 | 286 | 4.4% | 89.6% | 3.9% | 2.1% | 449 |
| EH.Fusion 0.32 | 8 | 1342 | 1.9% | 85.0% | 11.6% | 1.5% | 305 |
| ratosh.Wesco 1.4 | 8 | 109 | 0.0% | 97.1% | 2.9% | 0.0% | 519 |
| xander.cat.Spitfire 1.4 | 8 | 0 | 0.0% | 100.0% | 0.0% | 0.0% | 323 |
| marksteam.Phoenix 1.0 | 8 | 381 | 1.6% | 97.6% | 0.0% | 0.8% | 500 |
| ndn.DyslexicMonkey 1.1 | 8 | 237 | 5.3% | 92.1% | 0.4% | 2.3% | 486 |
| supersample.SuperCorners 1.0 | 8 | 557 | 13.5% | 69.6% | 10.1% | 6.9% | 391 |
| bots.UnterExBot 1.0 | 8 | 107 | 5.8% | 89.8% | 1.1% | 3.3% | 480 |
| hlavko.nano.Ringo 2.0 | 8 | 145 | 4.3% | 88.7% | 5.5% | 1.5% | 436 |
| dsw.StaticD 1.0 | 8 | 57 | 0.0% | 100.0% | 0.0% | 0.0% | 443 |
| sul.BlueBot 1.0 | 8 | 21 | 0.0% | 100.0% | 0.0% | 0.0% | 332 |
| hapiel.Spiral 0.1 | 8 | 241 | 2.6% | 96.5% | 0.1% | 0.9% | 552 |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 83 | 0.0% | 91.9% | 8.1% | 0.0% | 396 |
| e32.Omni 0.06 | 0 | - | - | - | - | - | - |
| suh.nano.CrossC 1.00 | 8 | 135 | 0.0% | 99.5% | 0.5% | 0.0% | 388 |
| hirataatsushi.Trinity 0.003 | 8 | 275 | 2.3% | 94.0% | 2.4% | 1.3% | 367 |
| adt.Ar2 1.0 | 8 | 293 | 0.0% | 99.5% | 0.5% | 0.0% | 383 |
| yk.JahMicro 1.0 | 8 | 399 | 9.4% | 87.0% | 1.3% | 2.3% | 584 |
| uccc.MilkyWay 1.01 | 8 | 141 | 4.4% | 90.5% | 3.5% | 1.6% | 454 |
| amk.superstrike.SuperStrike 0.3 | 8 | 137 | 0.0% | 99.7% | 0.3% | 0.0% | 444 |
| omens.CannonfodderNano 1.4 | 8 | 150 | 4.2% | 93.4% | 0.6% | 1.8% | 444 |
| AD.CodaFirst 1.1 | 8 | 34 | 0.0% | 100.0% | 0.0% | 0.0% | 336 |
| madmath.Cow 0.1.1 | 8 | 148 | 0.0% | 99.9% | 0.1% | 0.0% | 356 |
| kjc.Karaykan 1.0 | 8 | 323 | 1.9% | 97.2% | 0.2% | 0.7% | 355 |
| pac.ABC 2.1 | 8 | 27 | 0.0% | 99.1% | 0.9% | 0.0% | 443 |
| bk.Shooter 1.0 | 8 | 70 | 0.0% | 100.0% | 0.0% | 0.0% | 459 |
| McS.Spanky_test 0.1a | 8 | 8 | 0.0% | 95.5% | 4.5% | 0.0% | 462 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 8 | 6 | 844 | 1 | 0.55 | 0 | 0 | 0 |
| apv.TheBrainPi 0.5fix | 8 | 6 | 298 | 0 | 0.34 | 1 | 1 | 8 |
| jmcd.BeoWulf 2.8 | 8 | 8 | 0 | 0 | 0.38 | 0 | 0 | 0 |
| DM.Mijit .3 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| nan.Ihivatar_Mk_1 1.0 | 8 | 7 | 270 | 0 | 0.33 | 0 | 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 8 | 7 | 113 | 0 | 0.28 | 0 | 0 | 0 |
| serenity.moonlightBat 1.17 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| myl.nano.Kakuru 1.20 | 8 | 6 | 0 | 0 | 0.27 | 2 | 2 | 0 |
| mcb.Audace 1.3 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| suh.micro.WallPM 1.00 | 8 | 7 | 298 | 0 | 0.36 | 0 | 0 | 0 |
| fm.claire 1.7 | 8 | 6 | 596 | 0 | 0.29 | 0 | 0 | 0 |
| dmh.robocode.robot.GreenDragon 1.0 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| oog.melee.Mercutio 1.0 | 8 | 6 | 596 | 0 | 0.34 | 0 | 0 | 0 |
| js.PinBall 1.6 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| EH.Fusion 0.32 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| ratosh.Wesco 1.4 | 8 | 7 | 298 | 0 | 0.34 | 0 | 0 | 0 |
| xander.cat.Spitfire 1.4 | 8 | 7 | 298 | 0 | 0.32 | 0 | 0 | 0 |
| marksteam.Phoenix 1.0 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| ndn.DyslexicMonkey 1.1 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| supersample.SuperCorners 1.0 | 8 | 6 | 596 | 0 | 0.32 | 0 | 0 | 0 |
| bots.UnterExBot 1.0 | 8 | 5 | 699 | 0 | 0.33 | 0 | 0 | 0 |
| hlavko.nano.Ringo 2.0 | 8 | 6 | 596 | 0 | 0.33 | 0 | 0 | 0 |
| dsw.StaticD 1.0 | 8 | 6 | 596 | 0 | 0.31 | 0 | 0 | 0 |
| sul.BlueBot 1.0 | 8 | 7 | 298 | 0 | 0.30 | 0 | 0 | 0 |
| hapiel.Spiral 0.1 | 8 | 6 | 596 | 0 | 0.35 | 0 | 0 | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 7 | 298 | 0 | 0.32 | 0 | 0 | 0 |
| e32.Omni 0.06 | 8 | 0 | 0 | 0 | 0.00 | 0 | 0 | 0 |
| suh.nano.CrossC 1.00 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| hirataatsushi.Trinity 0.003 | 8 | 6 | 596 | 0 | 0.33 | 0 | 0 | 0 |
| adt.Ar2 1.0 | 8 | 6 | 762 | 0 | 0.34 | 0 | 0 | 0 |
| yk.JahMicro 1.0 | 8 | 7 | 298 | 0 | 0.30 | 0 | 0 | 0 |
| uccc.MilkyWay 1.01 | 8 | 6 | 596 | 0 | 0.32 | 0 | 0 | 0 |
| amk.superstrike.SuperStrike 0.3 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| omens.CannonfodderNano 1.4 | 8 | 8 | 0 | 0 | 0.34 | 0 | 0 | 0 |
| AD.CodaFirst 1.1 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| madmath.Cow 0.1.1 | 8 | 7 | 298 | 0 | 0.33 | 0 | 0 | 0 |
| kjc.Karaykan 1.0 | 8 | 6 | 298 | 0 | 0.33 | 1 | 0 | 0 |
| pac.ABC 2.1 | 8 | 5 | 894 | 0 | 0.34 | 0 | 0 | 0 |
| bk.Shooter 1.0 | 8 | 7 | 298 | 0 | 0.32 | 0 | 0 | 0 |
| McS.Spanky_test 0.1a | 8 | 6 | 894 | 0 | 0.29 | 0 | 0 | 0 |

268 of 320 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 6758 | 16 | 6701 | 6694 (99.1%) | 64 (0.9%) | 7 (0.1%) | 300 | 134 | 23 |
| apv.TheBrainPi 0.5fix | 7785 | 12 | 7767 | 7767 (99.8%) | 18 (0.2%) | 0 (0.0%) | 225 | 112 | 29 |
| jmcd.BeoWulf 2.8 | 10995 | 77 | 10992 | 10989 (99.9%) | 6 (0.1%) | 3 (0.0%) | 547 | 183 | 28 |
| DM.Mijit .3 | 6768 | 14 | 6814 | 6748 (99.7%) | 20 (0.3%) | 66 (1.0%) | 1088 | 168 | 28 |
| nan.Ihivatar_Mk_1 1.0 | 6471 | 5 | 6454 | 6454 (99.7%) | 17 (0.3%) | 0 (0.0%) | 68 | 73 | 23 |
| jab.micro.Sanguijuela 0.8 | 2299 | 14 | 2292 | 2291 (99.7%) | 8 (0.3%) | 1 (0.0%) | 1179 | 166 | 21 |
| serenity.moonlightBat 1.17 | 11292 | 8 | 11292 | 11292 (100.0%) | 0 (0.0%) | 0 (0.0%) | 279 | 159 | 13 |
| myl.nano.Kakuru 1.20 | 6288 | 12 | 6294 | 6286 (100.0%) | 2 (0.0%) | 8 (0.1%) | 928 | 144 | 20 |
| mcb.Audace 1.3 | 3237 | 9 | 3237 | 3237 (100.0%) | 0 (0.0%) | 0 (0.0%) | 10 | 51 | 22 |
| suh.micro.WallPM 1.00 | 10186 | 46 | 10173 | 10161 (99.8%) | 25 (0.2%) | 12 (0.1%) | 723 | 176 | 36 |
| fm.claire 1.7 | 5549 | 13 | 5565 | 5503 (99.2%) | 46 (0.8%) | 62 (1.1%) | 926 | 111 | 25 |
| dmh.robocode.robot.GreenDragon 1.0 | 7368 | 45 | 7399 | 7345 (99.7%) | 23 (0.3%) | 54 (0.7%) | 512 | 152 | 25 |
| oog.melee.Mercutio 1.0 | 7422 | 21 | 7381 | 7379 (99.4%) | 43 (0.6%) | 2 (0.0%) | 77 | 119 | 27 |
| js.PinBall 1.6 | 5705 | 23 | 5750 | 5690 (99.7%) | 15 (0.3%) | 60 (1.0%) | 575 | 152 | 22 |
| EH.Fusion 0.32 | 2325 | 23 | 2327 | 2325 (100.0%) | 0 (0.0%) | 2 (0.1%) | 1147 | 184 | 25 |
| ratosh.Wesco 1.4 | 6190 | 24 | 6186 | 6168 (99.6%) | 22 (0.4%) | 18 (0.3%) | 177 | 76 | 46 |
| xander.cat.Spitfire 1.4 | 2642 | 33 | 2619 | 2619 (99.1%) | 23 (0.9%) | 0 (0.0%) | 0 | 158 | 18 |
| marksteam.Phoenix 1.0 | 5828 | 14 | 5862 | 5824 (99.9%) | 4 (0.1%) | 38 (0.6%) | 217 | 80 | 20 |
| ndn.DyslexicMonkey 1.1 | 6064 | 18 | 6064 | 6054 (99.8%) | 10 (0.2%) | 10 (0.2%) | 143 | 118 | 22 |
| supersample.SuperCorners 1.0 | 4055 | 36 | 4021 | 4017 (99.1%) | 38 (0.9%) | 4 (0.1%) | 392 | 102 | 19 |
| bots.UnterExBot 1.0 | 6354 | 23 | 6314 | 6304 (99.2%) | 50 (0.8%) | 10 (0.2%) | 243 | 128 | 25 |
| hlavko.nano.Ringo 2.0 | 4751 | 27 | 5289 | 4686 (98.6%) | 65 (1.4%) | 603 (11.4%) | 116 | 101 | 24 |
| dsw.StaticD 1.0 | 5752 | 27 | 5719 | 5709 (99.3%) | 43 (0.7%) | 10 (0.2%) | 100 | 118 | 17 |
| sul.BlueBot 1.0 | 3137 | 15 | 3117 | 3116 (99.3%) | 21 (0.7%) | 1 (0.0%) | 36 | 116 | 21 |
| hapiel.Spiral 0.1 | 8585 | 44 | 8542 | 8534 (99.4%) | 51 (0.6%) | 8 (0.1%) | 471 | 164 | 22 |
| Lo_Ian.Gandalf_V4 4.0 | 1607 | 13 | 1597 | 1596 (99.3%) | 11 (0.7%) | 1 (0.1%) | 307 | 54 | 26 |
| e32.Omni 0.06 | 0 | 0 | 0 | - | - | - | 0 | 0 | 0 |
| suh.nano.CrossC 1.00 | 4374 | 21 | 4375 | 4371 (99.9%) | 3 (0.1%) | 4 (0.1%) | 124 | 114 | 15 |
| hirataatsushi.Trinity 0.003 | 4082 | 36 | 4040 | 4037 (98.9%) | 45 (1.1%) | 3 (0.1%) | 471 | 169 | 23 |
| adt.Ar2 1.0 | 3747 | 26 | 3708 | 3698 (98.7%) | 49 (1.3%) | 10 (0.3%) | 53 | 81 | 24 |
| yk.JahMicro 1.0 | 5338 | 5 | 5375 | 5325 (99.8%) | 13 (0.2%) | 50 (0.9%) | 277 | 76 | 21 |
| uccc.MilkyWay 1.01 | 5537 | 25 | 5496 | 5495 (99.2%) | 42 (0.8%) | 1 (0.0%) | 108 | 117 | 26 |
| amk.superstrike.SuperStrike 0.3 | 4980 | 11 | 4984 | 4971 (99.8%) | 9 (0.2%) | 13 (0.3%) | 396 | 89 | 33 |
| omens.CannonfodderNano 1.4 | 4777 | 16 | 4792 | 4776 (100.0%) | 1 (0.0%) | 16 (0.3%) | 83 | 95 | 23 |
| AD.CodaFirst 1.1 | 1986 | 17 | 1984 | 1984 (99.9%) | 2 (0.1%) | 0 (0.0%) | 41 | 57 | 21 |
| madmath.Cow 0.1.1 | 2193 | 15 | 2196 | 2178 (99.3%) | 15 (0.7%) | 18 (0.8%) | 88 | 68 | 18 |
| kjc.Karaykan 1.0 | 3289 | 21 | 3250 | 3249 (98.8%) | 40 (1.2%) | 1 (0.0%) | 164 | 113 | 14 |
| pac.ABC 2.1 | 686 | 10 | 674 | 673 (98.1%) | 13 (1.9%) | 1 (0.1%) | 8 | 23 | 18 |
| bk.Shooter 1.0 | 2836 | 19 | 2826 | 2826 (99.6%) | 10 (0.4%) | 0 (0.0%) | 4 | 55 | 42 |
| McS.Spanky_test 0.1a | 1361 | 8 | 1343 | 1343 (98.7%) | 18 (1.3%) | 0 (0.0%) | 22 | 32 | 17 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 6604 | 567 (8.6%) | 3875 |
| apv.TheBrainPi 0.5fix | 9047 | 710 (7.8%) | 3984 |
| jmcd.BeoWulf 2.8 | 10945 | 907 (8.3%) | 8912 |
| DM.Mijit .3 | 6897 | 1021 (14.8%) | 6178 |
| nan.Ihivatar_Mk_1 1.0 | 7413 | 604 (8.1%) | 4693 |
| jab.micro.Sanguijuela 0.8 | 2430 | 179 (7.4%) | 128 |
| serenity.moonlightBat 1.17 | 11380 | 990 (8.7%) | 9315 |
| myl.nano.Kakuru 1.20 | 7381 | 395 (5.4%) | 0 |
| mcb.Audace 1.3 | 3368 | 176 (5.2%) | 971 |
| suh.micro.WallPM 1.00 | 9521 | 624 (6.6%) | 1974 |
| fm.claire 1.7 | 6407 | 494 (7.7%) | 1119 |
| dmh.robocode.robot.GreenDragon 1.0 | 7303 | 627 (8.6%) | 2877 |
| oog.melee.Mercutio 1.0 | 7155 | 607 (8.5%) | 4792 |
| js.PinBall 1.6 | 5023 | 392 (7.8%) | 2003 |
| EH.Fusion 0.32 | 2421 | 44 (1.8%) | 0 |
| ratosh.Wesco 1.4 | 6715 | 302 (4.5%) | 0 |
| xander.cat.Spitfire 1.4 | 2739 | 166 (6.1%) | 1293 |
| marksteam.Phoenix 1.0 | 6278 | 284 (4.5%) | 633 |
| ndn.DyslexicMonkey 1.1 | 5800 | 332 (5.7%) | 656 |
| supersample.SuperCorners 1.0 | 3934 | 211 (5.4%) | 322 |
| bots.UnterExBot 1.0 | 5600 | 297 (5.3%) | 718 |
| hlavko.nano.Ringo 2.0 | 4917 | 286 (5.8%) | 2158 |
| dsw.StaticD 1.0 | 4916 | 335 (6.8%) | 1174 |
| sul.BlueBot 1.0 | 2925 | 292 (10.0%) | 1196 |
| hapiel.Spiral 0.1 | 7037 | 395 (5.6%) | 2614 |
| Lo_Ian.Gandalf_V4 4.0 | 4069 | 173 (4.3%) | 0 |
| e32.Omni 0.06 | 0 | - | 0 |
| suh.nano.CrossC 1.00 | 3922 | 192 (4.9%) | 544 |
| hirataatsushi.Trinity 0.003 | 3473 | 370 (10.7%) | 1979 |
| adt.Ar2 1.0 | 3795 | 306 (8.1%) | 702 |
| yk.JahMicro 1.0 | 7633 | 404 (5.3%) | 2068 |
| uccc.MilkyWay 1.01 | 5071 | 445 (8.8%) | 2644 |
| amk.superstrike.SuperStrike 0.3 | 4961 | 194 (3.9%) | 262 |
| omens.CannonfodderNano 1.4 | 4885 | 263 (5.4%) | 603 |
| AD.CodaFirst 1.1 | 2958 | 64 (2.2%) | 0 |
| madmath.Cow 0.1.1 | 3322 | 103 (3.1%) | 0 |
| kjc.Karaykan 1.0 | 3248 | 113 (3.5%) | 193 |
| pac.ABC 2.1 | 5072 | 28 (0.6%) | 0 |
| bk.Shooter 1.0 | 5179 | 104 (2.0%) | 1736 |
| McS.Spanky_test 0.1a | 5246 | 79 (1.5%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 650 | 301 | 400 | 371 | 57.4 / 15.5 | 2479 | 4629 | 90 |
| apv.TheBrainPi 0.5fix | 650 | 448 | 547 | 467 | 40.3 / 25.8 | 1142 | 6783 | 0 |
| jmcd.BeoWulf 2.8 | 650 | 435 | 500 | 565 | 54.8 / 20.3 | 2798 | 4526 | 70 |
| DM.Mijit .3 | 650 | 436 | 428 | 381 | 52.0 / 13.5 | 2519 | 5326 | 1371 |
| nan.Ihivatar_Mk_1 1.0 | 650 | 398 | 400 | 398 | 37.0 / 10.6 | 1171 | 7449 | 3277 |
| jab.micro.Sanguijuela 0.8 | 650 | 145 | 650 | 156 | 108.4 / 68.1 | 2222 | 3169 | 67 |
| serenity.moonlightBat 1.17 | 650 | 456 | 400 | 596 | 64.2 / 4.0 | 2760 | 3750 | 9 |
| myl.nano.Kakuru 1.20 | 650 | 471 | 591 | 393 | 37.7 / 24.3 | 1669 | 5603 | 3699 |
| mcb.Audace 1.3 | 650 | 256 | 400 | 207 | 70.9 / 10.1 | 2433 | 4750 | 691 |
| suh.micro.WallPM 1.00 | 650 | 484 | 463 | 502 | 63.4 / 21.3 | 3947 | 3605 | 428 |
| fm.claire 1.7 | 650 | 458 | 400 | 348 | 36.1 / 7.5 | 1138 | 7225 | 3842 |
| dmh.robocode.robot.GreenDragon 1.0 | 650 | 505 | 400 | 399 | 50.0 / 11.7 | 2398 | 5062 | 2846 |
| oog.melee.Mercutio 1.0 | 650 | 449 | 400 | 407 | 72.4 / 5.0 | 4271 | 3764 | 1141 |
| js.PinBall 1.6 | 650 | 351 | 400 | 299 | 68.6 / 7.3 | 3485 | 3816 | 1026 |
| EH.Fusion 0.32 | 650 | 293 | 431 | 155 | 86.7 / 32.6 | 1856 | 3466 | 217 |
| ratosh.Wesco 1.4 | 650 | 406 | 400 | 369 | 41.9 / 3.0 | 1200 | 7568 | 185 |
| xander.cat.Spitfire 1.4 | 650 | 390 | 400 | 173 | 98.0 / 0.0 | 2104 | 1036 | 4 |
| marksteam.Phoenix 1.0 | 650 | 436 | 400 | 350 | 55.5 / 10.6 | 2701 | 6725 | 509 |
| ndn.DyslexicMonkey 1.1 | 650 | 386 | 400 | 336 | 64.2 / 6.2 | 3630 | 4467 | 1291 |
| supersample.SuperCorners 1.0 | 650 | 270 | 400 | 241 | 70.2 / 11.1 | 2890 | 2660 | 56 |
| bots.UnterExBot 1.0 | 650 | 328 | 400 | 330 | 67.0 / 2.8 | 3802 | 3820 | 322 |
| hlavko.nano.Ringo 2.0 | 650 | 466 | 400 | 286 | 52.8 / 3.7 | 2761 | 4413 | 530 |
| dsw.StaticD 1.0 | 650 | 381 | 400 | 293 | 78.4 / 1.6 | 3629 | 3388 | 724 |
| sul.BlueBot 1.0 | 650 | 397 | 400 | 182 | 77.8 / 0.6 | 2128 | 2369 | 859 |
| hapiel.Spiral 0.1 | 650 | 361 | 400 | 402 | 75.9 / 6.6 | 4316 | 3770 | 332 |
| Lo_Ian.Gandalf_V4 4.0 | 650 | 315 | 400 | 246 | 82.4 / 2.2 | 2590 | 1723 | 127 |
| e32.Omni 0.06 | - | - | - | - | - | 0 | 0 | 0 |
| suh.nano.CrossC 1.00 | 650 | 395 | 400 | 238 | 77.4 / 3.8 | 2849 | 2934 | 896 |
| hirataatsushi.Trinity 0.003 | 650 | 298 | 400 | 217 | 84.9 / 7.4 | 2724 | 2311 | 663 |
| adt.Ar2 1.0 | 650 | 317 | 400 | 233 | 67.7 / 8.3 | 2817 | 3547 | 60 |
| yk.JahMicro 1.0 | 650 | 389 | 400 | 434 | 79.0 / 9.9 | 4861 | 1709 | 70 |
| uccc.MilkyWay 1.01 | 650 | 381 | 400 | 304 | 82.7 / 3.6 | 3733 | 2723 | 532 |
| amk.superstrike.SuperStrike 0.3 | 650 | 409 | 400 | 294 | 64.4 / 3.9 | 3339 | 4456 | 1142 |
| omens.CannonfodderNano 1.4 | 650 | 383 | 400 | 294 | 83.0 / 4.0 | 3773 | 2665 | 276 |
| AD.CodaFirst 1.1 | 650 | 289 | 400 | 186 | 79.3 / 1.0 | 2076 | 3938 | 964 |
| madmath.Cow 0.1.1 | 650 | 377 | 400 | 206 | 78.6 / 4.2 | 2414 | 2381 | 725 |
| kjc.Karaykan 1.0 | 650 | 414 | 400 | 203 | 80.2 / 9.0 | 2374 | 2126 | 777 |
| pac.ABC 2.1 | 650 | 407 | 400 | 293 | 95.7 / 0.8 | 2295 | 497 | 94 |
| bk.Shooter 1.0 | 650 | 426 | 400 | 309 | 80.8 / 2.0 | 3853 | 2145 | 542 |
| McS.Spanky_test 0.1a | 650 | 395 | 400 | 312 | 95.2 / 0.2 | 3825 | 595 | 296 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 8.1% | 154 | 1088 | 3 | 23.8 | 563 / 567 (99%) | 0 | 0 |
| apv.TheBrainPi 0.5fix | 6.1% | 95 | 163 | 3 | 27.5 | 707 / 710 (100%) | 0 | 0 |
| jmcd.BeoWulf 2.8 | 7.4% | 105 | 68 | 3 | 39.2 | 905 / 907 (100%) | 0 | 0 |
| DM.Mijit .3 | 5.6% | 90 | 51 | 3 | 24.3 | 1019 / 1021 (100%) | 0 | 0 |
| nan.Ihivatar_Mk_1 1.0 | 4.5% | 92 | 52 | 3 | 23.1 | 602 / 604 (100%) | 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 52.0% | 79 | 22 | 3 | 8.1 | 179 / 179 (100%) | 0 | 0 |
| serenity.moonlightBat 1.17 | 2.4% | 82 | 44 | 2 | 40.3 | 990 / 990 (100%) | 0 | 0 |
| myl.nano.Kakuru 1.20 | 6.3% | 75 | 55 | 2 | 22.3 | 395 / 395 (100%) | 0 | 0 |
| mcb.Audace 1.3 | 4.7% | 88 | 32 | 3 | 11.6 | 176 / 176 (100%) | 0 | 0 |
| suh.micro.WallPM 1.00 | 9.0% | 101 | 233 | 3 | 36.2 | 622 / 624 (100%) | 0 | 0 |
| fm.claire 1.7 | 2.4% | 82 | 73 | 3 | 19.9 | 486 / 494 (98%) | 0 | 0 |
| dmh.robocode.robot.GreenDragon 1.0 | 4.1% | 89 | 163 | 3 | 26.4 | 625 / 627 (100%) | 0 | 0 |
| oog.melee.Mercutio 1.0 | 3.8% | 95 | 45 | 3 | 26.4 | 604 / 607 (100%) | 0 | 0 |
| js.PinBall 1.6 | 4.7% | 95 | 51 | 3 | 20.5 | 390 / 392 (99%) | 0 | 0 |
| EH.Fusion 0.32 | 23.3% | 90 | 28 | 3 | 8.1 | 44 / 44 (100%) | 0 | 0 |
| ratosh.Wesco 1.4 | 1.1% | 95 | 41 | 3 | 22.1 | 302 / 302 (100%) | 0 | 0 |
| xander.cat.Spitfire 1.4 | 0.2% | 89 | 20 | 3 | 9.4 | 143 / 166 (86%) | 0 | 0 |
| marksteam.Phoenix 1.0 | 4.2% | 84 | 45 | 3 | 20.9 | 283 / 284 (100%) | 0 | 0 |
| ndn.DyslexicMonkey 1.1 | 3.0% | 90 | 41 | 3 | 21.7 | 330 / 332 (99%) | 0 | 0 |
| supersample.SuperCorners 1.0 | 8.7% | 89 | 32 | 3 | 14.3 | 209 / 211 (99%) | 0 | 0 |
| bots.UnterExBot 1.0 | 2.5% | 91 | 37 | 3 | 22.5 | 295 / 297 (99%) | 0 | 0 |
| hlavko.nano.Ringo 2.0 | 1.2% | 91 | 39 | 3 | 18.9 | 280 / 286 (98%) | 0 | 0 |
| dsw.StaticD 1.0 | 1.8% | 87 | 32 | 3 | 20.4 | 334 / 335 (100%) | 0 | 0 |
| sul.BlueBot 1.0 | 0.4% | 84 | 90 | 3 | 11.1 | 290 / 292 (99%) | 0 | 0 |
| hapiel.Spiral 0.1 | 6.0% | 98 | 41 | 3 | 30.5 | 391 / 395 (99%) | 0 | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 2.4% | 90 | 27 | 3 | 5.7 | 171 / 173 (99%) | 0 | 0 |
| e32.Omni 0.06 | - | 0 | 0 | 0 | - | - | 0 | 0 |
| suh.nano.CrossC 1.00 | 3.1% | 85 | 39 | 3 | 15.6 | 192 / 192 (100%) | 0 | 0 |
| hirataatsushi.Trinity 0.003 | 9.7% | 93 | 28 | 3 | 14.4 | 369 / 370 (100%) | 0 | 0 |
| adt.Ar2 1.0 | 6.4% | 94 | 38 | 3 | 13.2 | 305 / 306 (100%) | 0 | 0 |
| yk.JahMicro 1.0 | 6.8% | 85 | 38 | 3 | 19.1 | 404 / 404 (100%) | 0 | 0 |
| uccc.MilkyWay 1.01 | 4.5% | 89 | 33 | 3 | 19.6 | 443 / 445 (100%) | 0 | 0 |
| amk.superstrike.SuperStrike 0.3 | 2.0% | 98 | 1194 | 3 | 17.8 | 193 / 194 (99%) | 0 | 0 |
| omens.CannonfodderNano 1.4 | 3.5% | 95 | 186 | 3 | 17.1 | 263 / 263 (100%) | 0 | 0 |
| AD.CodaFirst 1.1 | 1.1% | 89 | 30 | 3 | 7.1 | 64 / 64 (100%) | 0 | 0 |
| madmath.Cow 0.1.1 | 3.1% | 92 | 558 | 3 | 7.8 | 102 / 103 (99%) | 0 | 0 |
| kjc.Karaykan 1.0 | 6.8% | 92 | 266 | 3 | 11.5 | 113 / 113 (100%) | 0 | 0 |
| pac.ABC 2.1 | 2.8% | 95 | 23 | 3 | 2.4 | 27 / 28 (96%) | 0 | 0 |
| bk.Shooter 1.0 | 1.9% | 89 | 36 | 3 | 10.1 | 104 / 104 (100%) | 0 | 0 |
| McS.Spanky_test 0.1a | 1.0% | 80 | 49 | 3 | 4.8 | 77 / 79 (97%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.TheBrainPi 0.5fix | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jmcd.BeoWulf 2.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| DM.Mijit .3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nan.Ihivatar_Mk_1 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| serenity.moonlightBat 1.17 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| myl.nano.Kakuru 1.20 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mcb.Audace 1.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| suh.micro.WallPM 1.00 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| fm.claire 1.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dmh.robocode.robot.GreenDragon 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| oog.melee.Mercutio 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| js.PinBall 1.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| EH.Fusion 0.32 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ratosh.Wesco 1.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| xander.cat.Spitfire 1.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| marksteam.Phoenix 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ndn.DyslexicMonkey 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| supersample.SuperCorners 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bots.UnterExBot 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| hlavko.nano.Ringo 2.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dsw.StaticD 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sul.BlueBot 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| hapiel.Spiral 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| e32.Omni 0.06 | 0 / 0 | 0 | 0 |  |  | - | 0 |
| suh.nano.CrossC 1.00 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| hirataatsushi.Trinity 0.003 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| adt.Ar2 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| yk.JahMicro 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| uccc.MilkyWay 1.01 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| amk.superstrike.SuperStrike 0.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| omens.CannonfodderNano 1.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| AD.CodaFirst 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| madmath.Cow 0.1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kjc.Karaykan 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pac.ABC 2.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bk.Shooter 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| McS.Spanky_test 0.1a | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | ers.nano.lig.LigMA | 1 | 35 | 304 | 8.4% | 5.4% ± 1.7 | 17.5% | 25.5% / 23.0% | 4.6% | 0 / 0 | T2/M? | 83% |
| apv.TheBrainPi 0.5fix | apv.TheBrainPi | 1 | 35 | 294 | 7.2% | 7.1% ± 1.7 | 13.6% | 30.0% / 26.8% | 14.8% | 0 / 0 | T3/M0 | 76% |
| jmcd.BeoWulf 2.8 | jmcd.BeoWulf | 1 | 35 | 280 | 7.2% | 5.9% ± 1.4 | 14.4% | 27.2% / 24.0% | 3.5% | 0 / 0 | T2/M0 | 85% |
| DM.Mijit .3 | DM.Mijit | 1 | 35 | 262 | 7.0% | 7.3% ± 1.9 | 15.5% | 35.9% / 30.9% | 4.9% | 0 / 0 | T3/M? | 88% |
| nan.Ihivatar_Mk_1 1.0 | nan.Ihivatar_Mk_1 | 1 | 35 | 300 | 4.0% | 3.9% ± 1.4 | 13.0% | 23.4% / 23.0% | 11.8% | 0 / 0 | T1/M1 | 87% |
| jab.micro.Sanguijuela 0.8 | jab.micro.Sanguijuela | 1 | 35 | 316 | 58.6% | 10.1% ± 3.7 | 45.5% | 10.8% / 10.1% | 3.1% | 0 / 0 | T?/M? | 68% |
| serenity.moonlightBat 1.17 | serenity.moonlightBat | 1 | 35 | 318 | 4.6% | 4.0% ± 1.1 | 15.8% | 31.0% / 24.0% | 8.1% | 0 / 0 | T1/M0 | 94% |
| myl.nano.Kakuru 1.20 | myl.nano.Kakuru | 1 | 35 | 294 | 8.0% | 9.3% ± 2.1 | 13.8% | 28.2% / 26.2% | 22.6% | 0 / 0 | T3/M0 | 74% |
| mcb.Audace 1.3 | mcb.Audace | 1 | 35 | 272 | 7.9% | 5.0% ± 2.2 | 28.1% | 34.8% / 35.2% | 6.1% | 0 / 0 | T2/M? | 90% |
| suh.micro.WallPM 1.00 | suh.micro.WallPM | 1 | 35 | 298 | 9.2% | 8.3% ± 1.5 | 16.1% | 30.3% / 26.1% | 12.9% | 0 / 0 | T3/M0 | 84% |
| fm.claire 1.7 | fm.claire | 1 | 35 | 268 | 4.3% | 4.9% ± 1.7 | 13.9% | 32.4% / 27.6% | 11.1% | 0 / 0 | T2/M? | 88% |
| dmh.robocode.robot.GreenDragon 1.0 | dmh.robocode.robot.GreenDragon | 1 | 35 | 352 | 7.9% | 7.0% ± 1.7 | 16.9% | 42.6% / 34.9% | 2.6% | 0 / 0 | T2/M? | 84% |
| oog.melee.Mercutio 1.0 | oog.melee.Mercutio | 1 | 35 | 304 | 3.8% | 2.8% ± 1.2 | 18.1% | 39.7% / 35.9% | 6.6% | 0 / 0 | T1/M? | 97% |
| js.PinBall 1.6 | js.PinBall | 1 | 35 | 272 | 7.2% | 4.0% ± 1.5 | 22.0% | 32.5% / 30.3% | 8.0% | 0 / 0 | T1/M? | 90% |
| EH.Fusion 0.32 | EH.Fusion | 1 | 35 | 270 | 28.6% | 5.1% ± 2.9 | 42.0% | 26.5% / 25.1% | 10.0% | 0 / 0 | T2/M? | 82% |
| ratosh.Wesco 1.4 | ratosh.Wesco | 1 | 35 | 280 | 1.5% | 0.9% ± 0.8 | 13.8% | 23.3% / 22.3% | 1.6% | 0 / 0 | T0/M? | 96% |
| xander.cat.Spitfire 1.4 | xander.cat.Spitfire | 1 | 35 | 308 | 0.0% | 0.0% ± 0.9 | 35.4% | 107.6% / 107.2% | 99.3% | 0 / 0 | T0/M0 | 100% |
| marksteam.Phoenix 1.0 | marksteam.Phoenix | 1 | 35 | 300 | 8.3% | 8.1% ± 1.9 | 15.4% | 35.9% / 31.4% | 19.7% | 0 / 0 | T3/M? | 83% |
| ndn.DyslexicMonkey 1.1 | ndn.DyslexicMonkey | 1 | 35 | 304 | 2.9% | 1.6% ± 1.0 | 19.1% | 38.3% / 34.9% | 21.6% | 0 / 0 | T0/M? | 96% |
| supersample.SuperCorners 1.0 | supersample.SuperCorners | 1 | 35 | 328 | 7.6% | 3.0% ± 1.7 | 24.0% | 23.4% / 21.4% | 4.2% | 0 / 0 | T1/M? | 92% |
| bots.UnterExBot 1.0 | bots.UnterExBot | 1 | 35 | 292 | 2.3% | 0.9% ± 0.8 | 18.1% | 33.1% / 29.9% | 17.2% | 0 / 0 | T0/M? | 98% |
| hlavko.nano.Ringo 2.0 | hlavko.nano.Ringo | 1 | 35 | 300 | 2.5% | 2.3% ± 1.2 | 17.0% | 38.3% / 36.4% | 6.4% | 0 / 0 | T1/M? | 94% |
| dsw.StaticD 1.0 | dsw.StaticD | 1 | 35 | 276 | 1.7% | 1.0% ± 0.8 | 21.1% | 49.1% / 45.4% | 38.8% | 0 / 0 | T0/M? | 99% |
| sul.BlueBot 1.0 | sul.BlueBot | 1 | 35 | 276 | 0.5% | 0.3% ± 1.0 | 32.6% | 78.8% / 73.8% | 38.3% | 0 / 0 | T0/M? | 100% |
| hapiel.Spiral 0.1 | hapiel.Spiral | 1 | 35 | 284 | 7.4% | 4.3% ± 1.2 | 17.8% | 28.4% / 24.9% | 5.1% | 0 / 0 | T1/M0 | 94% |
| Lo_Ian.Gandalf_V4 4.0 | Lo_Ian.Gandalf_V4 | 1 | 35 | 300 | 2.9% | 0.8% ± 2.0 | 27.5% | 32.7% / 29.1% | 3.5% | 0 / 0 | T0/M? | 99% |
| e32.Omni 0.06 | none |||||||||||
| suh.nano.CrossC 1.00 | suh.nano.CrossC | 1 | 35 | 294 | 4.2% | 3.0% ± 1.5 | 25.6% | 58.3% / 63.8% | 21.0% | 0 / 0 | T1/M? | 97% |
| hirataatsushi.Trinity 0.003 | hirataatsushi.Trinity | 1 | 35 | 320 | 12.6% | 3.5% ± 1.8 | 32.6% | 26.3% / 23.3% | 11.6% | 0 / 0 | T1/M? | 93% |
| adt.Ar2 1.0 | adt.Ar2 | 1 | 35 | 260 | 4.2% | 2.8% ± 1.7 | 23.6% | 33.2% / 31.0% | 0.2% | 0 / 0 | T1/M? | 95% |
| yk.JahMicro 1.0 | yk.JahMicro | 1 | 35 | 276 | 8.7% | 5.3% ± 1.8 | 18.9% | 31.5% / 30.3% | 3.2% | 0 / 0 | T2/M? | 90% |
| uccc.MilkyWay 1.01 | uccc.MilkyWay | 1 | 35 | 286 | 4.4% | 1.9% ± 1.1 | 24.1% | 43.7% / 38.3% | 6.9% | 0 / 0 | T0/M? | 98% |
| amk.superstrike.SuperStrike 0.3 | amk.superstrike.SuperStrike | 1 | 35 | 340 | 4.1% | 3.4% ± 1.6 | 20.4% | 56.0% / 48.1% | 9.3% | 0 / 0 | T1/M? | 95% |
| omens.CannonfodderNano 1.4 | omens.CannonfodderNano | 1 | 35 | 320 | 3.0% | 1.7% ± 1.2 | 24.2% | 49.2% / 38.6% | 33.7% | 0 / 0 | T0/M? | 98% |
| AD.CodaFirst 1.1 | AD.CodaFirst | 1 | 35 | 280 | 3.4% | 0.9% ± 1.7 | 33.2% | 33.2% / 34.8% | 21.4% | 0 / 0 | T0/M? | 98% |
| madmath.Cow 0.1.1 | madmath.Cow | 1 | 35 | 280 | 5.6% | 6.2% ± 3.0 | 30.9% | 68.7% / 63.7% | 15.2% | 0 / 0 | T2/M? | 95% |
| kjc.Karaykan 1.0 | kjc.Karaykan | 1 | 35 | 280 | 7.2% | 4.1% ± 2.1 | 31.3% | 64.2% / 60.1% | 38.5% | 0 / 0 | T1/M? | 95% |
| pac.ABC 2.1 | pac.ABC | 1 | 35 | 260 | 4.9% | 3.3% ± 5.0 | 29.2% | 53.3% / 48.2% | 34.1% | 0 / 0 | T?/M? | 99% |
| bk.Shooter 1.0 | bk.Shooter | 1 | 35 | 272 | 2.5% | 2.0% ± 1.5 | 20.7% | 54.9% / 50.8% | 55.0% | 0 / 0 | T0/M? | 98% |
| McS.Spanky_test 0.1a | McS.Spanky_test | 1 | 35 | 294 | 2.9% | 0.6% ± 2.1 | 25.4% | 52.8% / 49.5% | 40.7% | 0 / 0 | T0/M? | 100% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.9 vs hadur2.Hadur 3.4

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 87.5% ± 2.5 | 87.4% ± 1.4 | +0.2 ± 2.5 |
| apv.TheBrainPi 0.5fix | 75.5% ± 2.8 | 76.7% ± 1.7 | -1.3 ± 3.4 |
| jmcd.BeoWulf 2.8 | 83.8% ± 1.9 | 84.5% ± 2.3 | -0.8 ± 1.9 |
| DM.Mijit .3 | 90.1% ± 1.1 | 90.4% ± 1.2 | -0.3 ± 1.0 |
| nan.Ihivatar_Mk_1 1.0 | 89.8% ± 4.1 | 90.3% ± 2.1 | -0.5 ± 4.3 |
| jab.micro.Sanguijuela 0.8 | 71.4% ± 1.5 | 62.9% ± 2.4 | +8.5 ± 2.8 |
| serenity.moonlightBat 1.17 | 97.0% ± 1.0 | 96.7% ± 0.6 | +0.3 ± 1.3 |
| myl.nano.Kakuru 1.20 | 77.9% ± 3.5 | 77.7% ± 2.7 | +0.2 ± 5.4 |
| mcb.Audace 1.3 | 93.5% ± 1.2 | 94.1% ± 1.3 | -0.6 ± 2.0 |
| suh.micro.WallPM 1.00 | 83.9% ± 2.8 | 83.3% ± 2.1 | +0.6 ± 2.8 |
| fm.claire 1.7 | 93.0% ± 1.9 | 92.5% ± 2.3 | +0.6 ± 2.7 |
| dmh.robocode.robot.GreenDragon 1.0 | 90.4% ± 2.5 | 90.7% ± 0.7 | -0.3 ± 2.9 |
| oog.melee.Mercutio 1.0 | 96.5% ± 0.8 | 96.0% ± 1.4 | +0.5 ± 1.5 |
| js.PinBall 1.6 | 94.7% ± 2.1 | 96.7% ± 1.6 | -2.0 ± 2.9 |
| EH.Fusion 0.32 | 81.3% ± 1.5 | 79.9% ± 2.7 | +1.4 ± 2.2 |
| ratosh.Wesco 1.4 | 97.3% ± 1.1 | 97.3% ± 0.6 | -0.0 ± 1.4 |
| xander.cat.Spitfire 1.4 | 100.0% ± 0.0 | 99.9% ± 0.3 | +0.1 ± 0.3 |
| marksteam.Phoenix 1.0 | 92.2% ± 3.2 | 91.8% ± 1.1 | +0.4 ± 3.3 |
| ndn.DyslexicMonkey 1.1 | 95.3% ± 2.4 | 94.2% ± 1.3 | +1.1 ± 2.5 |
| supersample.SuperCorners 1.0 | 90.0% ± 2.2 | 90.5% ± 1.2 | -0.5 ± 2.3 |
| bots.UnterExBot 1.0 | 97.9% ± 1.3 | 98.4% ± 0.4 | -0.5 ± 1.2 |
| hlavko.nano.Ringo 2.0 | 96.8% ± 1.4 | 98.5% ± 0.8 | -1.7 ± 1.3 |
| dsw.StaticD 1.0 | 99.0% ± 0.3 | 99.0% ± 0.3 | -0.1 ± 0.3 |
| sul.BlueBot 1.0 | 99.6% ± 0.3 | 99.7% ± 0.2 | -0.1 ± 0.3 |
| hapiel.Spiral 0.1 | 95.6% ± 0.6 | 96.2% ± 0.9 | -0.5 ± 1.1 |
| Lo_Ian.Gandalf_V4 4.0 | 98.5% ± 0.5 | 98.7% ± 0.8 | -0.1 ± 0.7 |
| e32.Omni 0.06 | n/a | n/a | n/a |
| suh.nano.CrossC 1.00 | 97.5% ± 0.5 | 97.7% ± 0.5 | -0.2 ± 0.8 |
| hirataatsushi.Trinity 0.003 | 95.4% ± 0.9 | 94.0% ± 1.6 | +1.4 ± 2.1 |
| adt.Ar2 1.0 | 94.4% ± 1.1 | 94.5% ± 1.1 | -0.0 ± 1.6 |
| yk.JahMicro 1.0 | 93.1% ± 1.6 | 93.3% ± 1.5 | -0.2 ± 2.6 |
| uccc.MilkyWay 1.01 | 97.6% ± 1.3 | 98.0% ± 0.5 | -0.5 ± 1.1 |
| amk.superstrike.SuperStrike 0.3 | 97.2% ± 0.5 | 96.9% ± 0.5 | +0.4 ± 0.7 |
| omens.CannonfodderNano 1.4 | 97.4% ± 0.9 | 97.0% ± 0.9 | +0.4 ± 1.2 |
| AD.CodaFirst 1.1 | 99.4% ± 0.4 | 98.4% ± 1.2 | +1.0 ± 1.3 |
| madmath.Cow 0.1.1 | 97.3% ± 0.8 | 97.4% ± 0.7 | -0.1 ± 1.2 |
| kjc.Karaykan 1.0 | 94.4% ± 1.1 | 94.7% ± 0.8 | -0.2 ± 1.0 |
| pac.ABC 2.1 | 99.6% ± 0.2 | 99.7% ± 0.2 | -0.1 ± 0.4 |
| bk.Shooter 1.0 | 98.7% ± 0.2 | 98.8% ± 0.2 | -0.1 ± 0.3 |
| McS.Spanky_test 0.1a | 99.9% ± 0.2 | 99.9% ± 0.1 | -0.0 ± 0.2 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | +0.2 ± 2.5 | -0.7 ± 3.1 | -0.7 ± 3.1 | +0.6 ± 2.6 |
| apv.TheBrainPi 0.5fix | -1.3 ± 3.4 | -2.9 ± 4.8 | -2.9 ± 4.8 | +0.8 ± 2.7 |
| jmcd.BeoWulf 2.8 | -0.8 ± 1.9 | -1.4 ± 3.4 | -1.4 ± 3.4 | -0.3 ± 1.5 |
| DM.Mijit .3 | -0.3 ± 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.9 ± 2.1 |
| nan.Ihivatar_Mk_1 1.0 | -0.5 ± 4.3 | +0.0 ± 3.1 | +0.0 ± 3.1 | -0.9 ± 5.8 |
| jab.micro.Sanguijuela 0.8 | +8.5 ± 2.8 | +7.1 ± 6.4 | +6.8 ± 6.2 | +1.8 ± 1.4 |
| serenity.moonlightBat 1.17 | +0.3 ± 1.3 | +0.4 ± 1.5 | +0.4 ± 1.5 | +0.3 ± 1.5 |
| myl.nano.Kakuru 1.20 | +0.2 ± 5.4 | -0.7 ± 4.4 | -0.7 ± 4.4 | +0.8 ± 8.1 |
| mcb.Audace 1.3 | -0.6 ± 2.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | -1.2 ± 3.6 |
| suh.micro.WallPM 1.00 | +0.6 ± 2.8 | +0.4 ± 4.7 | +0.4 ± 4.7 | +0.5 ± 2.4 |
| fm.claire 1.7 | +0.6 ± 2.7 | -0.4 ± 0.8 | -0.4 ± 0.8 | +1.9 ± 5.6 |
| dmh.robocode.robot.GreenDragon 1.0 | -0.3 ± 2.9 | -1.1 ± 2.2 | -1.1 ± 2.2 | +0.6 ± 3.7 |
| oog.melee.Mercutio 1.0 | +0.5 ± 1.5 | +0.7 ± 1.1 | +0.7 ± 1.1 | +0.3 ± 2.5 |
| js.PinBall 1.6 | -2.0 ± 2.9 | +0.0 ± 1.8 | +0.0 ± 1.8 | -3.5 ± 4.3 |
| EH.Fusion 0.32 | +1.4 ± 2.2 | +1.1 ± 2.5 | +1.1 ± 2.5 | -1.9 ± 3.2 |
| ratosh.Wesco 1.4 | -0.0 ± 1.4 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.3 ± 3.2 |
| xander.cat.Spitfire 1.4 | +0.1 ± 0.3 | +0.4 ± 0.8 | +0.4 ± 0.8 | +0.0 ± 0.0 |
| marksteam.Phoenix 1.0 | +0.4 ± 3.3 | -0.4 ± 0.8 | -0.4 ± 0.8 | +1.4 ± 6.2 |
| ndn.DyslexicMonkey 1.1 | +1.1 ± 2.5 | +0.7 ± 1.7 | +0.7 ± 1.7 | +1.3 ± 3.4 |
| supersample.SuperCorners 1.0 | -0.5 ± 2.3 | -2.5 ± 3.0 | -2.5 ± 3.0 | +0.0 ± 1.5 |
| bots.UnterExBot 1.0 | -0.5 ± 1.2 | -0.4 ± 0.8 | -0.4 ± 0.8 | -0.5 ± 1.7 |
| hlavko.nano.Ringo 2.0 | -1.7 ± 1.3 | -0.4 ± 0.8 | -0.4 ± 0.8 | -3.4 ± 2.6 |
| dsw.StaticD 1.0 | -0.1 ± 0.3 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.1 ± 0.6 |
| sul.BlueBot 1.0 | -0.1 ± 0.3 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.2 ± 0.6 |
| hapiel.Spiral 0.1 | -0.5 ± 1.1 | +0.0 ± 1.3 | +0.0 ± 1.3 | -1.0 ± 1.7 |
| Lo_Ian.Gandalf_V4 4.0 | -0.1 ± 0.7 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.2 ± 1.3 |
| e32.Omni 0.06 | n/a | n/a | n/a | n/a |
| suh.nano.CrossC 1.00 | -0.2 ± 0.8 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.4 ± 1.5 |
| hirataatsushi.Trinity 0.003 | +1.4 ± 2.1 | +0.4 ± 0.8 | +0.4 ± 0.8 | +1.9 ± 2.9 |
| adt.Ar2 1.0 | -0.0 ± 1.6 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.1 ± 3.1 |
| yk.JahMicro 1.0 | -0.2 ± 2.6 | -1.4 ± 2.9 | -1.4 ± 2.9 | +0.4 ± 3.4 |
| uccc.MilkyWay 1.01 | -0.5 ± 1.1 | -0.4 ± 0.8 | -0.4 ± 0.8 | -0.6 ± 1.5 |
| amk.superstrike.SuperStrike 0.3 | +0.4 ± 0.7 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.7 ± 1.3 |
| omens.CannonfodderNano 1.4 | +0.4 ± 1.2 | +0.0 ± 1.3 | +0.0 ± 1.3 | +0.7 ± 1.4 |
| AD.CodaFirst 1.1 | +1.0 ± 1.3 | +0.4 ± 0.8 | +0.4 ± 0.8 | +1.5 ± 1.8 |
| madmath.Cow 0.1.1 | -0.1 ± 1.2 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.2 ± 2.2 |
| kjc.Karaykan 1.0 | -0.2 ± 1.0 | +0.0 ± 1.3 | +0.0 ± 1.3 | -0.4 ± 1.2 |
| pac.ABC 2.1 | -0.1 ± 0.4 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.2 ± 0.7 |
| bk.Shooter 1.0 | -0.1 ± 0.3 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.1 ± 0.6 |
| McS.Spanky_test 0.1a | -0.0 ± 0.2 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.1 ± 0.4 |
| All pairs | +0.2 ± 0.3 | -0.0 ± 0.3 | -0.0 ± 0.3 | -0.0 ± 0.4 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or, for a Hadur build, a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 8 | 4 | +0.2 ± 2.5 | -1.3 ± 2.5 |
| apv.TheBrainPi 0.5fix | 8 | 5 | -1.3 ± 3.4 | -2.1 ± 4.6 |
| jmcd.BeoWulf 2.8 | 8 | 8 | -0.8 ± 1.9 | -0.8 ± 1.9 |
| DM.Mijit .3 | 8 | 7 | -0.3 ± 1.0 | -0.4 ± 1.2 |
| nan.Ihivatar_Mk_1 1.0 | 8 | 6 | -0.5 ± 4.3 | +0.8 ± 2.7 |
| jab.micro.Sanguijuela 0.8 | 8 | 6 | +8.5 ± 2.8 | +9.3 ± 3.6 |
| serenity.moonlightBat 1.17 | 8 | 7 | +0.3 ± 1.3 | +0.1 ± 1.4 |
| myl.nano.Kakuru 1.20 | 8 | 6 | +0.2 ± 5.4 | +3.1 ± 4.1 |
| mcb.Audace 1.3 | 8 | 8 | -0.6 ± 2.0 | -0.6 ± 2.0 |
| suh.micro.WallPM 1.00 | 8 | 7 | +0.6 ± 2.8 | -0.0 ± 2.8 |
| fm.claire 1.7 | 8 | 6 | +0.6 ± 2.7 | +0.4 ± 3.9 |
| dmh.robocode.robot.GreenDragon 1.0 | 8 | 7 | -0.3 ± 2.9 | +0.4 ± 2.9 |
| oog.melee.Mercutio 1.0 | 8 | 4 | +0.5 ± 1.5 | +0.3 ± 2.8 |
| js.PinBall 1.6 | 8 | 7 | -2.0 ± 2.9 | -2.1 ± 3.5 |
| EH.Fusion 0.32 | 8 | 7 | +1.4 ± 2.2 | +0.8 ± 2.2 |
| ratosh.Wesco 1.4 | 8 | 7 | -0.0 ± 1.4 | +0.2 ± 1.5 |
| xander.cat.Spitfire 1.4 | 8 | 6 | +0.1 ± 0.3 | +0.0 ± 0.0 |
| marksteam.Phoenix 1.0 | 8 | 6 | +0.4 ± 3.3 | -0.4 ± 4.6 |
| ndn.DyslexicMonkey 1.1 | 8 | 8 | +1.1 ± 2.5 | +1.1 ± 2.5 |
| supersample.SuperCorners 1.0 | 8 | 5 | -0.5 ± 2.3 | -0.9 ± 3.3 |
| bots.UnterExBot 1.0 | 8 | 5 | -0.5 ± 1.2 | +0.1 ± 0.5 |
| hlavko.nano.Ringo 2.0 | 8 | 6 | -1.7 ± 1.3 | -1.2 ± 1.5 |
| dsw.StaticD 1.0 | 8 | 6 | -0.1 ± 0.3 | -0.2 ± 0.4 |
| sul.BlueBot 1.0 | 8 | 7 | -0.1 ± 0.3 | -0.0 ± 0.3 |
| hapiel.Spiral 0.1 | 8 | 6 | -0.5 ± 1.1 | -0.7 ± 1.6 |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 7 | -0.1 ± 0.7 | -0.0 ± 0.7 |
| e32.Omni 0.06 | 0 | 0 | n/a | n/a |
| suh.nano.CrossC 1.00 | 8 | 8 | -0.2 ± 0.8 | -0.2 ± 0.8 |
| hirataatsushi.Trinity 0.003 | 8 | 4 | +1.4 ± 2.1 | +0.8 ± 2.9 |
| adt.Ar2 1.0 | 8 | 5 | -0.0 ± 1.6 | +0.1 ± 1.9 |
| yk.JahMicro 1.0 | 8 | 7 | -0.2 ± 2.6 | -0.2 ± 3.1 |
| uccc.MilkyWay 1.01 | 8 | 5 | -0.5 ± 1.1 | -0.3 ± 0.6 |
| amk.superstrike.SuperStrike 0.3 | 8 | 7 | +0.4 ± 0.7 | +0.3 ± 0.8 |
| omens.CannonfodderNano 1.4 | 8 | 7 | +0.4 ± 1.2 | +0.7 ± 1.2 |
| AD.CodaFirst 1.1 | 8 | 8 | +1.0 ± 1.3 | +1.0 ± 1.3 |
| madmath.Cow 0.1.1 | 8 | 6 | -0.1 ± 1.2 | +0.0 ± 0.9 |
| kjc.Karaykan 1.0 | 8 | 5 | -0.2 ± 1.0 | -0.3 ± 1.2 |
| pac.ABC 2.1 | 8 | 5 | -0.1 ± 0.4 | -0.0 ± 0.6 |
| bk.Shooter 1.0 | 8 | 6 | -0.1 ± 0.3 | -0.1 ± 0.4 |
| McS.Spanky_test 0.1a | 8 | 6 | -0.0 ± 0.2 | -0.0 ± 0.4 |
| All pairs | 312 | 243 | +0.2 ± 0.3 | +0.2 ± 0.3 |

# Bench: hadur2.Hadur 3.9 baseline (hadur2.Hadur 3.4) (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 3459 over 312 battles (11.1 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | weak | 87.4% ± 1.4 | 96.8% ± 2.0 | 78.3% ± 1.7 | 271 / 280 | 23.3% ± 1.3 | 11.3% ± 7.3 | 88 | 0 | 0.69 / 13.4 |
| apv.TheBrainPi 0.5fix | weak | 76.7% ± 1.7 | 92.9% ± 2.2 | 60.2% ± 1.7 | 260 / 280 | 14.6% ± 0.9 | 7.3% ± 3.9 | 96 | 0 | 1.06 / 60.0 |
| jmcd.BeoWulf 2.8 | weak | 84.5% ± 2.3 | 96.4% ± 3.6 | 73.2% ± 1.4 | 270 / 280 | 16.8% ± 1.2 | 7.4% ± 0.9 | 100 | 0 | 0.96 / 14.6 |
| DM.Mijit .3 | weak | 90.4% ± 1.2 | 100.0% ± 0.0 | 80.3% ± 2.2 | 280 / 280 | 19.6% ± 1.1 | 6.4% ± 1.7 | 82 | 0 | 0.74 / 14.0 |
| nan.Ihivatar_Mk_1 1.0 | weak | 90.3% ± 2.1 | 98.2% ± 1.2 | 79.2% ± 3.4 | 275 / 280 | 14.4% ± 1.4 | 4.2% ± 3.4 | 94 | 0 | 0.75 / 16.5 |
| jab.micro.Sanguijuela 0.8 | weak | 62.9% ± 2.4 | 90.1% ± 6.0 | 59.6% ± 1.2 | 253 / 280 | 80.0% ± 2.0 | 55.7% ± 2.2 | 59 | 0 | 0.47 / 9.9 |
| serenity.moonlightBat 1.17 | weak | 96.7% ± 0.6 | 99.3% ± 1.1 | 93.8% ± 0.6 | 278 / 280 | 16.6% ± 0.5 | 5.6% ± 7.4 | 83 | 0 | 0.69 / 32.3 |
| myl.nano.Kakuru 1.20 | weak | 77.7% ± 2.7 | 95.0% ± 2.1 | 59.8% ± 3.8 | 266 / 280 | 16.2% ± 1.5 | 6.9% ± 1.0 | 85 | 0 | 0.89 / 13.2 |
| mcb.Audace 1.3 | weak | 94.1% ± 1.3 | 100.0% ± 0.0 | 88.8% ± 2.4 | 280 / 280 | 39.4% ± 2.0 | 4.4% ± 0.9 | 83 | 0 | 0.89 / 10.3 |
| suh.micro.WallPM 1.00 | weak | 83.3% ± 2.1 | 93.9% ± 2.7 | 74.4% ± 2.5 | 263 / 280 | 22.9% ± 1.1 | 10.6% ± 1.0 | 100 | 0 | 1.11 / 110.2 |
| fm.claire 1.7 | weak | 92.5% ± 2.3 | 100.0% ± 0.0 | 81.1% ± 4.9 | 280 / 280 | 15.4% ± 1.0 | 2.7% ± 0.8 | 76 | 0 | 0.80 / 16.1 |
| dmh.robocode.robot.GreenDragon 1.0 | weak | 90.7% ± 0.7 | 99.6% ± 0.8 | 80.5% ± 1.6 | 279 / 280 | 16.9% ± 0.5 | 4.3% ± 0.6 | 88 | 0 | 0.82 / 15.7 |
| oog.melee.Mercutio 1.0 | weak | 96.0% ± 1.4 | 98.9% ± 1.2 | 93.2% ± 1.8 | 277 / 280 | 22.3% ± 1.3 | 10.0% ± 10.0 | 94 | 0 | 0.77 / 16.0 |
| js.PinBall 1.6 | weak | 96.7% ± 1.6 | 99.3% ± 1.1 | 94.1% ± 2.2 | 278 / 280 | 27.7% ± 2.3 | 4.9% ± 6.1 | 88 | 0 | 0.64 / 12.0 |
| EH.Fusion 0.32 | weak | 79.9% ± 2.7 | 97.5% ± 3.0 | 74.6% ± 2.5 | 273 / 280 | 67.5% ± 2.4 | 24.9% ± 6.0 | 82 | 0 | 0.59 / 8.9 |
| ratosh.Wesco 1.4 | weak | 97.3% ± 0.6 | 100.0% ± 0.0 | 93.7% ± 1.4 | 280 / 280 | 16.9% ± 1.5 | 1.2% ± 0.4 | 88 | 0 | 0.67 / 14.4 |
| xander.cat.Spitfire 1.4 | weak | 99.9% ± 0.3 | 99.6% ± 0.8 | 100.0% ± 0.0 | 279 / 280 | 67.5% ± 2.4 | 0.7% ± 0.8 | 89 | 0 | 0.57 / 10.7 |
| marksteam.Phoenix 1.0 | weak | 91.8% ± 1.1 | 100.0% ± 0.0 | 83.0% ± 2.4 | 280 / 280 | 20.5% ± 1.5 | 8.0% ± 5.7 | 94 | 0 | 0.79 / 13.4 |
| ndn.DyslexicMonkey 1.1 | weak | 94.2% ± 1.3 | 98.6% ± 1.3 | 89.9% ± 2.0 | 276 / 280 | 23.4% ± 1.3 | 3.8% ± 0.9 | 84 | 0 | 0.63 / 12.6 |
| supersample.SuperCorners 1.0 | weak | 90.5% ± 1.2 | 98.2% ± 1.2 | 86.4% ± 1.7 | 275 / 280 | 41.8% ± 3.4 | 11.7% ± 5.4 | 85 | 0 | 0.66 / 10.7 |
| bots.UnterExBot 1.0 | weak | 98.4% ± 0.4 | 100.0% ± 0.0 | 96.6% ± 0.8 | 280 / 280 | 23.2% ± 0.9 | 2.2% ± 0.6 | 87 | 0 | 0.64 / 11.9 |
| hlavko.nano.Ringo 2.0 | weak | 98.5% ± 0.8 | 100.0% ± 0.0 | 97.0% ± 1.5 | 280 / 280 | 23.4% ± 2.2 | 0.7% ± 0.3 | 88 | 0 | 0.65 / 13.2 |
| dsw.StaticD 1.0 | weak | 99.0% ± 0.3 | 100.0% ± 0.0 | 98.1% ± 0.5 | 280 / 280 | 27.9% ± 0.9 | 1.4% ± 0.3 | 87 | 0 | 0.61 / 11.3 |
| sul.BlueBot 1.0 | weak | 99.7% ± 0.2 | 100.0% ± 0.0 | 99.4% ± 0.4 | 280 / 280 | 48.9% ± 2.4 | 0.4% ± 0.3 | 82 | 0 | 0.61 / 9.6 |
| hapiel.Spiral 0.1 | weak | 96.2% ± 0.9 | 99.6% ± 0.8 | 92.9% ± 1.4 | 279 / 280 | 22.2% ± 1.2 | 5.3% ± 1.0 | 99 | 0 | 0.65 / 13.8 |
| Lo_Ian.Gandalf_V4 4.0 | weak | 98.7% ± 0.8 | 100.0% ± 0.0 | 97.6% ± 1.3 | 280 / 280 | 39.9% ± 1.5 | 2.6% ± 1.4 | 90 | 0 | 0.55 / 31.1 |
| e32.Omni 0.06 | weak | n/a | n/a | n/a | 0 / 0 | - | - | 0 | 0 | 0.00 / 0.0 | 8 battle(s) failed
| suh.nano.CrossC 1.00 | weak | 97.7% ± 0.5 | 100.0% ± 0.0 | 95.7% ± 1.0 | 280 / 280 | 36.0% ± 0.9 | 2.8% ± 1.0 | 87 | 0 | 0.69 / 10.4 |
| hirataatsushi.Trinity 0.003 | weak | 94.0% ± 1.6 | 99.3% ± 1.1 | 90.1% ± 2.1 | 278 / 280 | 51.9% ± 2.0 | 19.1% ± 12.5 | 90 | 0 | 0.58 / 10.2 |
| adt.Ar2 1.0 | weak | 94.5% ± 1.1 | 100.0% ± 0.0 | 89.2% ± 2.0 | 280 / 280 | 34.2% ± 1.5 | 5.2% ± 2.7 | 94 | 0 | 0.73 / 10.8 |
| yk.JahMicro 1.0 | weak | 93.3% ± 1.5 | 99.3% ± 1.1 | 88.5% ± 2.3 | 278 / 280 | 24.6% ± 1.5 | 7.8% ± 1.6 | 87 | 0 | 0.64 / 14.9 |
| uccc.MilkyWay 1.01 | weak | 98.0% ± 0.5 | 100.0% ± 0.0 | 96.5% ± 0.8 | 280 / 280 | 34.0% ± 1.8 | 7.5% ± 8.7 | 91 | 0 | 0.65 / 11.4 |
| amk.superstrike.SuperStrike 0.3 | weak | 96.9% ± 0.5 | 100.0% ± 0.0 | 93.6% ± 0.9 | 280 / 280 | 24.9% ± 1.2 | 2.2% ± 0.4 | 104 | 0 | 0.80 / 13.3 |
| omens.CannonfodderNano 1.4 | weak | 97.0% ± 0.9 | 99.6% ± 0.8 | 94.7% ± 1.3 | 279 / 280 | 31.4% ± 1.2 | 6.0% ± 5.0 | 90 | 0 | 0.61 / 12.7 |
| AD.CodaFirst 1.1 | weak | 98.4% ± 1.2 | 99.6% ± 0.8 | 97.3% ± 1.5 | 279 / 280 | 48.7% ± 1.8 | 1.8% ± 0.9 | 93 | 0 | 0.58 / 9.8 |
| madmath.Cow 0.1.1 | weak | 97.4% ± 0.7 | 100.0% ± 0.0 | 95.1% ± 1.3 | 280 / 280 | 45.1% ± 1.9 | 2.8% ± 0.9 | 90 | 0 | 0.68 / 11.8 |
| kjc.Karaykan 1.0 | weak | 94.7% ± 0.8 | 99.6% ± 0.8 | 90.4% ± 1.3 | 279 / 280 | 49.2% ± 1.9 | 7.6% ± 1.6 | 90 | 0 | 0.64 / 9.8 |
| pac.ABC 2.1 | weak | 99.7% ± 0.2 | 100.0% ± 0.0 | 99.4% ± 0.4 | 280 / 280 | 42.3% ± 1.2 | 1.8% ± 1.4 | 92 | 0 | 0.55 / 10.5 |
| bk.Shooter 1.0 | weak | 98.8% ± 0.2 | 100.0% ± 0.0 | 97.7% ± 0.3 | 280 / 280 | 28.2% ± 1.4 | 2.0% ± 0.8 | 89 | 0 | 0.64 / 11.4 |
| McS.Spanky_test 0.1a | weak | 99.9% ± 0.1 | 100.0% ± 0.0 | 99.9% ± 0.2 | 280 / 280 | 33.8% ± 1.6 | 0.6% ± 1.1 | 91 | 0 | 0.58 / 10.3 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 8 | 648 | 8.7% | 87.6% | 0.3% | 3.4% | 519 |
| apv.TheBrainPi 0.5fix | 8 | 1087 | 11.5% | 83.2% | 0.0% | 5.3% | 636 |
| jmcd.BeoWulf 2.8 | 8 | 800 | 7.8% | 89.1% | 0.0% | 3.0% | 724 |
| DM.Mijit .3 | 8 | 463 | 0.0% | 100.0% | 0.0% | 0.0% | 514 |
| nan.Ihivatar_Mk_1 1.0 | 8 | 386 | 8.1% | 87.5% | 0.5% | 3.9% | 549 |
| jab.micro.Sanguijuela 0.8 | 8 | 3620 | 4.7% | 52.4% | 39.1% | 3.8% | 266 |
| serenity.moonlightBat 1.17 | 8 | 164 | 7.6% | 89.7% | 0.0% | 2.7% | 756 |
| myl.nano.Kakuru 1.20 | 8 | 1035 | 8.5% | 87.6% | 0.0% | 3.9% | 546 |
| mcb.Audace 1.3 | 8 | 318 | 0.0% | 100.0% | 0.0% | 0.0% | 352 |
| suh.micro.WallPM 1.00 | 8 | 952 | 11.2% | 83.8% | 0.2% | 4.9% | 610 |
| fm.claire 1.7 | 8 | 295 | 0.0% | 100.0% | 0.0% | 0.0% | 500 |
| dmh.robocode.robot.GreenDragon 1.0 | 8 | 427 | 1.5% | 97.8% | 0.0% | 0.7% | 553 |
| oog.melee.Mercutio 1.0 | 8 | 212 | 8.9% | 87.6% | 0.0% | 3.5% | 550 |
| js.PinBall 1.6 | 8 | 171 | 7.3% | 87.0% | 1.2% | 4.5% | 441 |
| EH.Fusion 0.32 | 8 | 1448 | 3.0% | 66.6% | 28.3% | 2.1% | 291 |
| ratosh.Wesco 1.4 | 8 | 108 | 0.0% | 94.7% | 5.3% | 0.0% | 510 |
| xander.cat.Spitfire 1.4 | 8 | 9 | 70.4% | 15.5% | 0.0% | 14.1% | 325 |
| marksteam.Phoenix 1.0 | 8 | 397 | 0.0% | 100.0% | 0.0% | 0.0% | 507 |
| ndn.DyslexicMonkey 1.1 | 8 | 297 | 8.4% | 85.7% | 1.5% | 4.4% | 481 |
| supersample.SuperCorners 1.0 | 8 | 545 | 5.7% | 74.2% | 16.3% | 3.8% | 375 |
| bots.UnterExBot 1.0 | 8 | 82 | 0.0% | 100.0% | 0.0% | 0.0% | 481 |
| hlavko.nano.Ringo 2.0 | 8 | 68 | 0.0% | 85.3% | 14.7% | 0.0% | 422 |
| dsw.StaticD 1.0 | 8 | 53 | 0.0% | 100.0% | 0.0% | 0.0% | 456 |
| sul.BlueBot 1.0 | 8 | 16 | 0.0% | 99.2% | 0.8% | 0.0% | 330 |
| hapiel.Spiral 0.1 | 8 | 210 | 3.0% | 95.4% | 0.8% | 0.9% | 542 |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 77 | 0.0% | 91.8% | 8.2% | 0.0% | 390 |
| e32.Omni 0.06 | 0 | - | - | - | - | - | - |
| suh.nano.CrossC 1.00 | 8 | 124 | 0.0% | 99.9% | 0.1% | 0.0% | 385 |
| hirataatsushi.Trinity 0.003 | 8 | 370 | 3.4% | 90.3% | 4.6% | 1.7% | 348 |
| adt.Ar2 1.0 | 8 | 295 | 0.0% | 99.5% | 0.5% | 0.0% | 375 |
| yk.JahMicro 1.0 | 8 | 397 | 3.2% | 92.5% | 3.2% | 1.1% | 550 |
| uccc.MilkyWay 1.01 | 8 | 113 | 0.0% | 94.9% | 5.1% | 0.0% | 440 |
| amk.superstrike.SuperStrike 0.3 | 8 | 156 | 0.0% | 100.0% | 0.0% | 0.0% | 445 |
| omens.CannonfodderNano 1.4 | 8 | 174 | 3.6% | 93.3% | 0.9% | 2.2% | 446 |
| AD.CodaFirst 1.1 | 8 | 89 | 7.0% | 87.3% | 0.0% | 5.6% | 342 |
| madmath.Cow 0.1.1 | 8 | 142 | 0.0% | 100.0% | 0.0% | 0.0% | 355 |
| kjc.Karaykan 1.0 | 8 | 310 | 2.0% | 97.0% | 0.2% | 0.8% | 349 |
| pac.ABC 2.1 | 8 | 19 | 0.0% | 99.3% | 0.7% | 0.0% | 427 |
| bk.Shooter 1.0 | 8 | 68 | 0.0% | 100.0% | 0.0% | 0.0% | 459 |
| McS.Spanky_test 0.1a | 8 | 6 | 0.0% | 78.4% | 21.6% | 0.0% | 455 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 8 | 6 | 570 | 0 | 0.31 | 0 | 0 | 0 |
| apv.TheBrainPi 0.5fix | 8 | 7 | 423 | 0 | 0.34 | 0 | 0 | 8 |
| jmcd.BeoWulf 2.8 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| DM.Mijit .3 | 8 | 7 | 659 | 0 | 0.29 | 0 | 0 | 0 |
| nan.Ihivatar_Mk_1 1.0 | 8 | 7 | 262 | 0 | 0.34 | 0 | 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 8 | 6 | 0 | 0 | 0.21 | 2 | 2 | 0 |
| serenity.moonlightBat 1.17 | 8 | 7 | 1021 | 0 | 0.30 | 0 | 0 | 0 |
| myl.nano.Kakuru 1.20 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| mcb.Audace 1.3 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| suh.micro.WallPM 1.00 | 8 | 8 | 0 | 0 | 0.36 | 0 | 0 | 0 |
| fm.claire 1.7 | 8 | 8 | 0 | 0 | 0.27 | 0 | 0 | 0 |
| dmh.robocode.robot.GreenDragon 1.0 | 8 | 7 | 8 | 0 | 0.31 | 0 | 0 | 0 |
| oog.melee.Mercutio 1.0 | 8 | 6 | 1614 | 0 | 0.34 | 0 | 0 | 0 |
| js.PinBall 1.6 | 8 | 7 | 325 | 0 | 0.31 | 0 | 0 | 0 |
| EH.Fusion 0.32 | 8 | 7 | 113 | 0 | 0.29 | 0 | 0 | 0 |
| ratosh.Wesco 1.4 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| xander.cat.Spitfire 1.4 | 8 | 7 | 1826 | 0 | 0.32 | 0 | 0 | 0 |
| marksteam.Phoenix 1.0 | 8 | 6 | 1151 | 0 | 0.34 | 0 | 0 | 0 |
| ndn.DyslexicMonkey 1.1 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| supersample.SuperCorners 1.0 | 8 | 7 | 175 | 0 | 0.30 | 0 | 0 | 0 |
| bots.UnterExBot 1.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| hlavko.nano.Ringo 2.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| dsw.StaticD 1.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| sul.BlueBot 1.0 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| hapiel.Spiral 0.1 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 8 | 0 | 0 | 0.32 | 0 | 0 | 0 |
| e32.Omni 0.06 | 8 | 0 | 0 | 0 | 0.00 | 0 | 0 | 0 |
| suh.nano.CrossC 1.00 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| hirataatsushi.Trinity 0.003 | 8 | 6 | 1284 | 0 | 0.32 | 0 | 0 | 0 |
| adt.Ar2 1.0 | 8 | 7 | 514 | 0 | 0.34 | 0 | 0 | 0 |
| yk.JahMicro 1.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| uccc.MilkyWay 1.01 | 8 | 7 | 855 | 0 | 0.33 | 0 | 0 | 0 |
| amk.superstrike.SuperStrike 0.3 | 8 | 7 | 460 | 0 | 0.37 | 0 | 0 | 0 |
| omens.CannonfodderNano 1.4 | 8 | 7 | 612 | 0 | 0.32 | 0 | 0 | 0 |
| AD.CodaFirst 1.1 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| madmath.Cow 0.1.1 | 8 | 7 | 446 | 0 | 0.32 | 0 | 0 | 0 |
| kjc.Karaykan 1.0 | 8 | 7 | 798 | 0 | 0.32 | 0 | 0 | 0 |
| pac.ABC 2.1 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| bk.Shooter 1.0 | 8 | 7 | 627 | 0 | 0.32 | 0 | 0 | 0 |
| McS.Spanky_test 0.1a | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |

286 of 320 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 6652 | 12 | 6604 | 6594 (99.1%) | 58 (0.9%) | 10 (0.2%) | 330 | 129 | 177 |
| apv.TheBrainPi 0.5fix | 8114 | 19 | 8089 | 8088 (99.7%) | 26 (0.3%) | 1 (0.0%) | 321 | 105 | 24 |
| jmcd.BeoWulf 2.8 | 11194 | 58 | 11192 | 11185 (99.9%) | 9 (0.1%) | 7 (0.1%) | 605 | 155 | 31 |
| DM.Mijit .3 | 6502 | 16 | 6503 | 6445 (99.1%) | 57 (0.9%) | 58 (0.9%) | 1015 | 157 | 20 |
| nan.Ihivatar_Mk_1 1.0 | 6484 | 10 | 6468 | 6468 (99.8%) | 16 (0.2%) | 0 (0.0%) | 78 | 79 | 30 |
| jab.micro.Sanguijuela 0.8 | 1590 | 27 | 1592 | 1590 (100.0%) | 0 (0.0%) | 2 (0.1%) | 8161 | 665 | 19 |
| serenity.moonlightBat 1.17 | 11573 | 14 | 11516 | 11491 (99.3%) | 82 (0.7%) | 25 (0.2%) | 288 | 142 | 25 |
| myl.nano.Kakuru 1.20 | 6312 | 16 | 6318 | 6307 (99.9%) | 5 (0.1%) | 11 (0.2%) | 961 | 140 | 18 |
| mcb.Audace 1.3 | 3165 | 11 | 3165 | 3165 (100.0%) | 0 (0.0%) | 0 (0.0%) | 15 | 75 | 16 |
| suh.micro.WallPM 1.00 | 9188 | 41 | 9194 | 9180 (99.9%) | 8 (0.1%) | 14 (0.2%) | 685 | 190 | 35 |
| fm.claire 1.7 | 5574 | 15 | 5638 | 5568 (99.9%) | 6 (0.1%) | 70 (1.2%) | 1002 | 135 | 21 |
| dmh.robocode.robot.GreenDragon 1.0 | 7464 | 18 | 7508 | 7438 (99.7%) | 26 (0.3%) | 70 (0.9%) | 563 | 125 | 27 |
| oog.melee.Mercutio 1.0 | 7315 | 25 | 7203 | 7198 (98.4%) | 117 (1.6%) | 5 (0.1%) | 87 | 106 | 32 |
| js.PinBall 1.6 | 5517 | 26 | 5543 | 5478 (99.3%) | 39 (0.7%) | 65 (1.2%) | 498 | 120 | 21 |
| EH.Fusion 0.32 | 2098 | 16 | 2092 | 2091 (99.7%) | 7 (0.3%) | 1 (0.0%) | 2558 | 251 | 15 |
| ratosh.Wesco 1.4 | 6020 | 24 | 6035 | 6020 (100.0%) | 0 (0.0%) | 15 (0.2%) | 214 | 66 | 19 |
| xander.cat.Spitfire 1.4 | 2676 | 38 | 2569 | 2569 (96.0%) | 107 (4.0%) | 0 (0.0%) | 0 | 106 | 18 |
| marksteam.Phoenix 1.0 | 5944 | 16 | 5899 | 5863 (98.6%) | 81 (1.4%) | 36 (0.6%) | 222 | 98 | 20 |
| ndn.DyslexicMonkey 1.1 | 5956 | 25 | 5958 | 5953 (99.9%) | 3 (0.1%) | 5 (0.1%) | 236 | 109 | 21 |
| supersample.SuperCorners 1.0 | 3778 | 22 | 3768 | 3767 (99.7%) | 11 (0.3%) | 1 (0.0%) | 580 | 93 | 15 |
| bots.UnterExBot 1.0 | 6402 | 27 | 6409 | 6399 (100.0%) | 3 (0.0%) | 10 (0.2%) | 182 | 123 | 16 |
| hlavko.nano.Ringo 2.0 | 4467 | 26 | 5007 | 4429 (99.1%) | 38 (0.9%) | 578 (11.5%) | 98 | 102 | 16 |
| dsw.StaticD 1.0 | 6021 | 22 | 6038 | 6018 (100.0%) | 3 (0.0%) | 20 (0.3%) | 151 | 120 | 19 |
| sul.BlueBot 1.0 | 3082 | 12 | 3082 | 3082 (100.0%) | 0 (0.0%) | 0 (0.0%) | 7 | 100 | 21 |
| hapiel.Spiral 0.1 | 8312 | 41 | 8317 | 8303 (99.9%) | 9 (0.1%) | 14 (0.2%) | 485 | 158 | 24 |
| Lo_Ian.Gandalf_V4 4.0 | 1625 | 17 | 1625 | 1625 (100.0%) | 0 (0.0%) | 0 (0.0%) | 322 | 47 | 24 |
| e32.Omni 0.06 | 0 | 0 | 0 | - | - | - | 0 | 0 | 0 |
| suh.nano.CrossC 1.00 | 4298 | 20 | 4300 | 4293 (99.9%) | 5 (0.1%) | 7 (0.2%) | 134 | 106 | 19 |
| hirataatsushi.Trinity 0.003 | 3689 | 39 | 3593 | 3591 (97.3%) | 98 (2.7%) | 2 (0.1%) | 597 | 182 | 17 |
| adt.Ar2 1.0 | 3603 | 30 | 3571 | 3570 (99.1%) | 33 (0.9%) | 1 (0.0%) | 93 | 95 | 19 |
| yk.JahMicro 1.0 | 4952 | 6 | 4952 | 4952 (100.0%) | 0 (0.0%) | 0 (0.0%) | 387 | 107 | 25 |
| uccc.MilkyWay 1.01 | 5272 | 27 | 5211 | 5211 (98.8%) | 61 (1.2%) | 0 (0.0%) | 75 | 109 | 20 |
| amk.superstrike.SuperStrike 0.3 | 4984 | 11 | 4960 | 4951 (99.3%) | 33 (0.7%) | 9 (0.2%) | 322 | 97 | 41 |
| omens.CannonfodderNano 1.4 | 4814 | 16 | 4785 | 4772 (99.1%) | 42 (0.9%) | 13 (0.3%) | 123 | 113 | 24 |
| AD.CodaFirst 1.1 | 2127 | 17 | 2126 | 2126 (100.0%) | 1 (0.0%) | 0 (0.0%) | 56 | 74 | 20 |
| madmath.Cow 0.1.1 | 2183 | 10 | 2187 | 2160 (98.9%) | 23 (1.1%) | 27 (1.2%) | 80 | 53 | 18 |
| kjc.Karaykan 1.0 | 3204 | 22 | 3152 | 3151 (98.3%) | 53 (1.7%) | 1 (0.0%) | 334 | 116 | 26 |
| pac.ABC 2.1 | 709 | 8 | 707 | 707 (99.7%) | 2 (0.3%) | 0 (0.0%) | 3 | 19 | 20 |
| bk.Shooter 1.0 | 2717 | 12 | 2699 | 2699 (99.3%) | 18 (0.7%) | 0 (0.0%) | 2 | 59 | 22 |
| McS.Spanky_test 0.1a | 1307 | 8 | 1307 | 1307 (100.0%) | 0 (0.0%) | 0 (0.0%) | 39 | 37 | 31 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 6586 | 572 (8.7%) | 5164 |
| apv.TheBrainPi 0.5fix | 9620 | 716 (7.4%) | 3233 |
| jmcd.BeoWulf 2.8 | 11190 | 986 (8.8%) | 8933 |
| DM.Mijit .3 | 6476 | 917 (14.2%) | 5276 |
| nan.Ihivatar_Mk_1 1.0 | 7442 | 550 (7.4%) | 3558 |
| jab.micro.Sanguijuela 0.8 | 1705 | 22 (1.3%) | 0 |
| serenity.moonlightBat 1.17 | 11663 | 1032 (8.8%) | 9080 |
| myl.nano.Kakuru 1.20 | 7529 | 417 (5.5%) | 2061 |
| mcb.Audace 1.3 | 3268 | 161 (4.9%) | 0 |
| suh.micro.WallPM 1.00 | 8626 | 540 (6.3%) | 1933 |
| fm.claire 1.7 | 6480 | 494 (7.6%) | 1571 |
| dmh.robocode.robot.GreenDragon 1.0 | 7370 | 607 (8.2%) | 4605 |
| oog.melee.Mercutio 1.0 | 6979 | 637 (9.1%) | 5553 |
| js.PinBall 1.6 | 4848 | 411 (8.5%) | 2858 |
| EH.Fusion 0.32 | 2196 | 26 (1.2%) | 0 |
| ratosh.Wesco 1.4 | 6517 | 295 (4.5%) | 0 |
| xander.cat.Spitfire 1.4 | 2787 | 189 (6.8%) | 0 |
| marksteam.Phoenix 1.0 | 6488 | 291 (4.5%) | 650 |
| ndn.DyslexicMonkey 1.1 | 5669 | 323 (5.7%) | 1701 |
| supersample.SuperCorners 1.0 | 3635 | 172 (4.7%) | 0 |
| bots.UnterExBot 1.0 | 5605 | 285 (5.1%) | 981 |
| hlavko.nano.Ringo 2.0 | 4593 | 260 (5.7%) | 1120 |
| dsw.StaticD 1.0 | 5141 | 340 (6.6%) | 593 |
| sul.BlueBot 1.0 | 2858 | 269 (9.4%) | 1125 |
| hapiel.Spiral 0.1 | 6786 | 411 (6.1%) | 1163 |
| Lo_Ian.Gandalf_V4 4.0 | 3927 | 164 (4.2%) | 0 |
| e32.Omni 0.06 | 0 | - | 0 |
| suh.nano.CrossC 1.00 | 3868 | 169 (4.4%) | 0 |
| hirataatsushi.Trinity 0.003 | 3137 | 302 (9.6%) | 1046 |
| adt.Ar2 1.0 | 3649 | 312 (8.6%) | 1757 |
| yk.JahMicro 1.0 | 6902 | 351 (5.1%) | 685 |
| uccc.MilkyWay 1.01 | 4794 | 397 (8.3%) | 3079 |
| amk.superstrike.SuperStrike 0.3 | 4962 | 204 (4.1%) | 0 |
| omens.CannonfodderNano 1.4 | 4953 | 276 (5.6%) | 0 |
| AD.CodaFirst 1.1 | 3084 | 97 (3.1%) | 0 |
| madmath.Cow 0.1.1 | 3320 | 102 (3.1%) | 0 |
| kjc.Karaykan 1.0 | 3195 | 127 (4.0%) | 0 |
| pac.ABC 2.1 | 4737 | 27 (0.6%) | 0 |
| bk.Shooter 1.0 | 5185 | 108 (2.1%) | 0 |
| McS.Spanky_test 0.1a | 5094 | 57 (1.1%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 650 | 304 | 400 | 369 | 58.2 / 16.2 | 2464 | 4614 | 160 |
| apv.TheBrainPi 0.5fix | 650 | 461 | 581 | 486 | 39.0 / 25.8 | 1031 | 6765 | 0 |
| jmcd.BeoWulf 2.8 | 650 | 438 | 494 | 574 | 55.5 / 20.4 | 2753 | 4939 | 187 |
| DM.Mijit .3 | 650 | 425 | 400 | 364 | 53.6 / 13.2 | 2721 | 4788 | 1136 |
| nan.Ihivatar_Mk_1 1.0 | 650 | 394 | 431 | 399 | 36.5 / 9.7 | 920 | 7567 | 3285 |
| jab.micro.Sanguijuela 0.8 | 650 | 135 | 650 | 116 | 79.9 / 54.2 | 1442 | 1153 | 85 |
| serenity.moonlightBat 1.17 | 650 | 454 | 400 | 606 | 63.5 / 4.2 | 2526 | 4033 | 24 |
| myl.nano.Kakuru 1.20 | 650 | 477 | 606 | 396 | 38.6 / 25.9 | 1445 | 5410 | 3906 |
| mcb.Audace 1.3 | 650 | 255 | 400 | 202 | 71.2 / 9.1 | 2382 | 4216 | 606 |
| suh.micro.WallPM 1.00 | 650 | 440 | 431 | 460 | 66.1 / 22.8 | 3908 | 4255 | 358 |
| fm.claire 1.7 | 650 | 472 | 422 | 350 | 35.4 / 8.4 | 982 | 7461 | 4207 |
| dmh.robocode.robot.GreenDragon 1.0 | 650 | 509 | 400 | 403 | 49.1 / 11.9 | 2358 | 5703 | 2516 |
| oog.melee.Mercutio 1.0 | 650 | 445 | 400 | 400 | 72.6 / 5.3 | 4382 | 3775 | 1169 |
| js.PinBall 1.6 | 650 | 352 | 400 | 291 | 67.7 / 4.3 | 3411 | 3577 | 997 |
| EH.Fusion 0.32 | 650 | 266 | 400 | 141 | 80.6 / 27.5 | 1602 | 2616 | 154 |
| ratosh.Wesco 1.4 | 650 | 403 | 400 | 360 | 43.1 / 2.9 | 1339 | 7342 | 255 |
| xander.cat.Spitfire 1.4 | 650 | 385 | 400 | 175 | 97.8 / 0.0 | 1926 | 1308 | 9 |
| marksteam.Phoenix 1.0 | 650 | 427 | 400 | 357 | 55.5 / 11.3 | 2512 | 6838 | 447 |
| ndn.DyslexicMonkey 1.1 | 650 | 385 | 400 | 331 | 64.8 / 7.3 | 3752 | 4226 | 1112 |
| supersample.SuperCorners 1.0 | 650 | 254 | 400 | 225 | 72.7 / 11.6 | 2685 | 2526 | 49 |
| bots.UnterExBot 1.0 | 650 | 324 | 400 | 331 | 67.3 / 2.4 | 3793 | 3603 | 158 |
| hlavko.nano.Ringo 2.0 | 650 | 454 | 400 | 272 | 53.2 / 1.7 | 2749 | 4194 | 201 |
| dsw.StaticD 1.0 | 650 | 394 | 400 | 306 | 77.6 / 1.5 | 3860 | 3315 | 1142 |
| sul.BlueBot 1.0 | 650 | 392 | 400 | 180 | 78.2 / 0.5 | 2106 | 2312 | 873 |
| hapiel.Spiral 0.1 | 650 | 353 | 400 | 392 | 74.8 / 5.7 | 4407 | 3783 | 522 |
| Lo_Ian.Gandalf_V4 4.0 | 650 | 308 | 400 | 240 | 82.3 / 2.0 | 2655 | 2053 | 30 |
| e32.Omni 0.06 | - | - | - | - | - | 0 | 0 | 0 |
| suh.nano.CrossC 1.00 | 650 | 395 | 400 | 235 | 77.4 / 3.5 | 2784 | 2805 | 964 |
| hirataatsushi.Trinity 0.003 | 650 | 247 | 400 | 198 | 86.2 / 9.6 | 2352 | 2033 | 190 |
| adt.Ar2 1.0 | 650 | 297 | 400 | 225 | 68.9 / 8.4 | 2705 | 3549 | 3 |
| yk.JahMicro 1.0 | 650 | 374 | 400 | 400 | 79.8 / 10.5 | 4671 | 1928 | 47 |
| uccc.MilkyWay 1.01 | 650 | 372 | 400 | 290 | 83.1 / 3.1 | 3602 | 2260 | 423 |
| amk.superstrike.SuperStrike 0.3 | 650 | 407 | 400 | 295 | 65.0 / 4.5 | 3501 | 4286 | 999 |
| omens.CannonfodderNano 1.4 | 650 | 381 | 400 | 296 | 82.8 / 4.6 | 3722 | 3002 | 660 |
| AD.CodaFirst 1.1 | 650 | 283 | 400 | 192 | 78.3 / 2.2 | 2142 | 4292 | 1280 |
| madmath.Cow 0.1.1 | 650 | 390 | 400 | 205 | 78.7 / 4.1 | 2354 | 2470 | 713 |
| kjc.Karaykan 1.0 | 650 | 397 | 400 | 199 | 80.2 / 8.6 | 2254 | 2238 | 716 |
| pac.ABC 2.1 | 650 | 395 | 400 | 277 | 95.4 / 0.5 | 2468 | 492 | 116 |
| bk.Shooter 1.0 | 650 | 413 | 400 | 309 | 81.7 / 1.9 | 3951 | 1840 | 531 |
| McS.Spanky_test 0.1a | 650 | 400 | 400 | 305 | 95.2 / 0.1 | 3756 | 513 | 203 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 11.3% | 88 | 153 | 3 | 23.4 | 572 / 572 (100%) | 0 | 0 |
| apv.TheBrainPi 0.5fix | 7.3% | 96 | 336 | 3 | 28.8 | 714 / 716 (100%) | 0 | 0 |
| jmcd.BeoWulf 2.8 | 7.4% | 100 | 2098 | 3 | 40.0 | 985 / 986 (100%) | 0 | 0 |
| DM.Mijit .3 | 6.4% | 82 | 398 | 3 | 23.2 | 911 / 917 (99%) | 0 | 0 |
| nan.Ihivatar_Mk_1 1.0 | 4.2% | 94 | 325 | 3 | 23.1 | 548 / 550 (100%) | 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 55.7% | 59 | 19 | 3 | 5.0 | 22 / 22 (100%) | 0 | 0 |
| serenity.moonlightBat 1.17 | 5.6% | 83 | 538 | 3 | 41.1 | 1030 / 1032 (100%) | 0 | 0 |
| myl.nano.Kakuru 1.20 | 6.9% | 85 | 2521 | 3 | 22.5 | 416 / 417 (100%) | 0 | 0 |
| mcb.Audace 1.3 | 4.4% | 83 | 33 | 3 | 11.3 | 161 / 161 (100%) | 0 | 0 |
| suh.micro.WallPM 1.00 | 10.6% | 100 | 197 | 3 | 32.8 | 538 / 540 (100%) | 0 | 0 |
| fm.claire 1.7 | 2.7% | 76 | 318 | 2 | 20.1 | 492 / 494 (100%) | 0 | 0 |
| dmh.robocode.robot.GreenDragon 1.0 | 4.3% | 88 | 1370 | 3 | 26.8 | 602 / 607 (99%) | 0 | 0 |
| oog.melee.Mercutio 1.0 | 10.0% | 94 | 642 | 3 | 25.7 | 633 / 637 (99%) | 0 | 0 |
| js.PinBall 1.6 | 4.9% | 88 | 113 | 3 | 19.8 | 408 / 411 (99%) | 0 | 0 |
| EH.Fusion 0.32 | 24.9% | 82 | 55 | 3 | 7.2 | 26 / 26 (100%) | 0 | 0 |
| ratosh.Wesco 1.4 | 1.2% | 88 | 116 | 3 | 21.6 | 295 / 295 (100%) | 0 | 0 |
| xander.cat.Spitfire 1.4 | 0.7% | 89 | 27 | 3 | 9.2 | 84 / 189 (44%) | 0 | 0 |
| marksteam.Phoenix 1.0 | 8.0% | 94 | 774 | 3 | 21.1 | 288 / 291 (99%) | 0 | 0 |
| ndn.DyslexicMonkey 1.1 | 3.8% | 84 | 48 | 3 | 21.3 | 322 / 323 (100%) | 0 | 0 |
| supersample.SuperCorners 1.0 | 11.7% | 85 | 197 | 3 | 13.4 | 172 / 172 (100%) | 0 | 0 |
| bots.UnterExBot 1.0 | 2.2% | 87 | 60 | 3 | 22.9 | 284 / 285 (100%) | 0 | 0 |
| hlavko.nano.Ringo 2.0 | 0.7% | 88 | 35 | 3 | 17.9 | 255 / 260 (98%) | 0 | 0 |
| dsw.StaticD 1.0 | 1.4% | 87 | 62 | 3 | 21.6 | 340 / 340 (100%) | 0 | 0 |
| sul.BlueBot 1.0 | 0.4% | 82 | 40 | 3 | 11.0 | 269 / 269 (100%) | 0 | 0 |
| hapiel.Spiral 0.1 | 5.3% | 99 | 47 | 3 | 29.7 | 410 / 411 (100%) | 0 | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 2.6% | 90 | 48 | 3 | 5.8 | 164 / 164 (100%) | 0 | 0 |
| e32.Omni 0.06 | - | 0 | 0 | 0 | - | - | 0 | 0 |
| suh.nano.CrossC 1.00 | 2.8% | 87 | 124 | 3 | 15.4 | 167 / 169 (99%) | 0 | 0 |
| hirataatsushi.Trinity 0.003 | 19.1% | 90 | 81 | 3 | 12.7 | 296 / 302 (98%) | 0 | 0 |
| adt.Ar2 1.0 | 5.2% | 94 | 214 | 3 | 12.7 | 310 / 312 (99%) | 0 | 0 |
| yk.JahMicro 1.0 | 7.8% | 87 | 40 | 3 | 17.6 | 351 / 351 (100%) | 0 | 0 |
| uccc.MilkyWay 1.01 | 7.5% | 91 | 147 | 3 | 18.6 | 397 / 397 (100%) | 0 | 0 |
| amk.superstrike.SuperStrike 0.3 | 2.2% | 104 | 502 | 3 | 17.7 | 202 / 204 (99%) | 0 | 0 |
| omens.CannonfodderNano 1.4 | 6.0% | 90 | 232 | 3 | 17.1 | 276 / 276 (100%) | 0 | 0 |
| AD.CodaFirst 1.1 | 1.8% | 93 | 31 | 3 | 7.6 | 97 / 97 (100%) | 0 | 0 |
| madmath.Cow 0.1.1 | 2.8% | 90 | 75 | 3 | 7.8 | 101 / 102 (99%) | 0 | 0 |
| kjc.Karaykan 1.0 | 7.6% | 90 | 87 | 3 | 11.2 | 124 / 127 (98%) | 0 | 0 |
| pac.ABC 2.1 | 1.8% | 92 | 41 | 3 | 2.5 | 27 / 27 (100%) | 0 | 0 |
| bk.Shooter 1.0 | 2.0% | 89 | 57 | 3 | 9.6 | 108 / 108 (100%) | 0 | 0 |
| McS.Spanky_test 0.1a | 0.6% | 91 | 34 | 3 | 4.7 | 56 / 57 (98%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.TheBrainPi 0.5fix | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jmcd.BeoWulf 2.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| DM.Mijit .3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nan.Ihivatar_Mk_1 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| serenity.moonlightBat 1.17 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| myl.nano.Kakuru 1.20 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mcb.Audace 1.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| suh.micro.WallPM 1.00 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| fm.claire 1.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dmh.robocode.robot.GreenDragon 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| oog.melee.Mercutio 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| js.PinBall 1.6 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| EH.Fusion 0.32 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ratosh.Wesco 1.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| xander.cat.Spitfire 1.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| marksteam.Phoenix 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ndn.DyslexicMonkey 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| supersample.SuperCorners 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bots.UnterExBot 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| hlavko.nano.Ringo 2.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| dsw.StaticD 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| sul.BlueBot 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| hapiel.Spiral 0.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| e32.Omni 0.06 | 0 / 0 | 0 | 0 |  |  | - | 0 |
| suh.nano.CrossC 1.00 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| hirataatsushi.Trinity 0.003 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| adt.Ar2 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| yk.JahMicro 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| uccc.MilkyWay 1.01 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| amk.superstrike.SuperStrike 0.3 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| omens.CannonfodderNano 1.4 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| AD.CodaFirst 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| madmath.Cow 0.1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kjc.Karaykan 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| pac.ABC 2.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| bk.Shooter 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| McS.Spanky_test 0.1a | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| AD.CodaFirst 1.1 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 95.7% ± 2.7 | 98.1% ± 1.2 | +2.5 ± 2.6 |
| AD.CodaFirst 1.1 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 93.7% ± 4.4 | 97.1% ± 1.7 | +3.3 ± 4.5 |
| DM.Mijit .3 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 73.2% ± 4.2 | 82.4% ± 3.9 | +9.2 ± 3.6 |
| DM.Mijit .3 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 69.7% ± 4.6 | 82.1% ± 3.3 | +12.4 ± 4.2 |
| EH.Fusion 0.32 | hadur2.Hadur 3.9 | 8 | 90.0% ± 12.6 | 100.0% ± 0.0 | +10.0 ± 12.6 | 57.7% ± 4.5 | 68.2% ± 4.1 | +10.6 ± 7.5 |
| EH.Fusion 0.32 | hadur2.Hadur 3.4 | 8 | 85.0% ± 17.3 | 98.8% ± 3.0 | +13.8 ± 16.1 | 59.7% ± 5.0 | 76.0% ± 3.9 | +16.3 ± 6.1 |
| Lo_Ian.Gandalf_V4 4.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 90.3% ± 5.4 | 99.0% ± 0.8 | +8.8 ± 5.0 |
| Lo_Ian.Gandalf_V4 4.0 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 94.0% ± 4.7 | 98.4% ± 1.5 | +4.3 ± 5.5 |
| McS.Spanky_test 0.1a | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 99.3% ± 0.7 | 99.6% ± 0.6 | +0.3 ± 0.9 |
| McS.Spanky_test 0.1a | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 99.5% ± 1.1 | 99.6% ± 0.4 | +0.1 ± 0.7 |
| adt.Ar2 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 78.5% ± 3.6 | 90.8% ± 2.7 | +12.4 ± 4.9 |
| adt.Ar2 1.0 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 80.6% ± 6.0 | 89.2% ± 4.6 | +8.6 ± 9.4 |
| amk.superstrike.SuperStrike 0.3 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 83.6% ± 3.5 | 95.0% ± 2.4 | +11.4 ± 5.6 |
| amk.superstrike.SuperStrike 0.3 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 84.7% ± 2.4 | 95.2% ± 2.4 | +10.6 ± 4.3 |
| apv.TheBrainPi 0.5fix | hadur2.Hadur 3.9 | 8 | 82.5% ± 18.8 | 92.2% ± 7.8 | +9.7 ± 21.7 | 56.7% ± 10.9 | 63.8% ± 8.4 | +7.1 ± 18.1 |
| apv.TheBrainPi 0.5fix | hadur2.Hadur 3.4 | 8 | 92.5% ± 8.7 | 91.3% ± 5.4 | -1.2 ± 9.4 | 56.4% ± 9.1 | 60.3% ± 5.0 | +3.9 ± 10.8 |
| bk.Shooter 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 94.1% ± 3.8 | 97.7% ± 1.4 | +3.6 ± 3.9 |
| bk.Shooter 1.0 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 96.2% ± 2.4 | 98.4% ± 1.5 | +2.2 ± 3.0 |
| bots.UnterExBot 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 85.8% ± 7.8 | 99.0% ± 1.0 | +13.1 ± 7.7 |
| bots.UnterExBot 1.0 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 89.5% ± 4.7 | 98.9% ± 1.0 | +9.4 ± 5.3 |
| dmh.robocode.robot.GreenDragon 1.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 98.8% ± 3.0 | +3.7 ± 8.9 | 71.2% ± 12.2 | 81.3% ± 4.5 | +10.1 ± 14.0 |
| dmh.robocode.robot.GreenDragon 1.0 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 69.9% ± 3.3 | 79.9% ± 1.9 | +10.0 ± 3.0 |
| dsw.StaticD 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 94.1% ± 1.7 | 98.5% ± 1.0 | +4.4 ± 1.8 |
| dsw.StaticD 1.0 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 93.6% ± 1.4 | 98.6% ± 1.3 | +5.0 ± 1.7 |
| ers.nano.lig.LigMA 1.9 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 97.5% ± 3.9 | +0.0 ± 7.7 | 78.7% ± 5.3 | 80.8% ± 4.8 | +2.1 ± 6.1 |
| ers.nano.lig.LigMA 1.9 | hadur2.Hadur 3.4 | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 9.7 | 77.1% ± 4.8 | 81.5% ± 4.3 | +4.4 ± 7.2 |
| fm.claire 1.7 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 63.7% ± 9.7 | 82.7% ± 8.9 | +19.0 ± 14.6 |
| fm.claire 1.7 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 66.4% ± 8.9 | 87.0% ± 5.4 | +20.5 ± 7.5 |
| hapiel.Spiral 0.1 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 86.0% ± 4.4 | 94.4% ± 1.3 | +8.4 ± 4.8 |
| hapiel.Spiral 0.1 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 89.9% ± 3.0 | 94.0% ± 1.7 | +4.1 ± 3.2 |
| hirataatsushi.Trinity 0.003 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 84.1% ± 5.6 | 94.1% ± 1.7 | +10.0 ± 5.4 |
| hirataatsushi.Trinity 0.003 | hadur2.Hadur 3.4 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 81.1% ± 7.3 | 92.3% ± 2.1 | +11.2 ± 7.8 |
| hlavko.nano.Ringo 2.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 89.3% ± 7.5 | 93.1% ± 5.3 | +3.8 ± 9.3 |
| hlavko.nano.Ringo 2.0 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 95.5% ± 6.1 | 95.4% ± 2.9 | -0.0 ± 6.5 |
| jab.micro.Sanguijuela 0.8 | hadur2.Hadur 3.9 | 8 | 87.5% ± 12.4 | 97.5% ± 3.9 | +10.0 ± 13.4 | 54.3% ± 3.1 | 58.2% ± 0.9 | +3.9 ± 3.5 |
| jab.micro.Sanguijuela 0.8 | hadur2.Hadur 3.4 | 8 | 82.5% ± 16.6 | 88.6% ± 8.3 | +6.1 ± 11.7 | 56.0% ± 4.2 | 60.9% ± 2.8 | +4.9 ± 1.8 |
| jmcd.BeoWulf 2.8 | hadur2.Hadur 3.9 | 8 | 90.0% ± 8.9 | 98.8% ± 3.0 | +8.7 ± 8.3 | 64.6% ± 6.7 | 76.4% ± 3.3 | +11.8 ± 8.4 |
| jmcd.BeoWulf 2.8 | hadur2.Hadur 3.4 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 69.7% ± 5.4 | 74.8% ± 2.0 | +5.1 ± 6.6 |
| js.PinBall 1.6 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 88.2% ± 2.9 | 91.8% ± 3.8 | +3.6 ± 5.1 |
| js.PinBall 1.6 | hadur2.Hadur 3.4 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 84.0% ± 8.3 | 97.0% ± 2.2 | +13.1 ± 9.0 |
| kjc.Karaykan 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 82.4% ± 6.6 | 89.5% ± 2.2 | +7.1 ± 7.5 |
| kjc.Karaykan 1.0 | hadur2.Hadur 3.4 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 91.0% ± 4.1 | 89.4% ± 2.5 | -1.6 ± 6.0 |
| madmath.Cow 0.1.1 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 91.8% ± 5.1 | 93.8% ± 3.2 | +2.0 ± 6.9 |
| madmath.Cow 0.1.1 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 89.5% ± 4.5 | 97.2% ± 1.6 | +7.7 ± 5.3 |
| marksteam.Phoenix 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 70.1% ± 7.6 | 86.6% ± 3.2 | +16.5 ± 5.7 |
| marksteam.Phoenix 1.0 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 73.0% ± 6.1 | 84.4% ± 3.8 | +11.4 ± 7.8 |
| mcb.Audace 1.3 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 76.0% ± 5.0 | 90.1% ± 4.4 | +14.1 ± 7.6 |
| mcb.Audace 1.3 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 73.7% ± 3.3 | 91.7% ± 3.3 | +18.0 ± 5.1 |
| myl.nano.Kakuru 1.20 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 96.3% ± 4.3 | -1.2 ± 8.3 | 58.1% ± 6.5 | 62.0% ± 5.4 | +3.8 ± 6.2 |
| myl.nano.Kakuru 1.20 | hadur2.Hadur 3.4 | 8 | 87.5% ± 12.4 | 98.8% ± 3.0 | +11.2 ± 13.7 | 62.4% ± 7.7 | 58.7% ± 4.2 | -3.7 ± 8.8 |
| nan.Ihivatar_Mk_1 1.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 58.5% ± 8.0 | 88.1% ± 5.2 | +29.6 ± 8.7 |
| nan.Ihivatar_Mk_1 1.0 | hadur2.Hadur 3.4 | 8 | 90.0% ± 8.9 | 100.0% ± 0.0 | +10.0 ± 8.9 | 52.4% ± 7.4 | 87.3% ± 4.7 | +34.8 ± 6.6 |
| ndn.DyslexicMonkey 1.1 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 97.5% ± 5.9 | -2.5 ± 5.9 | 82.9% ± 3.6 | 91.0% ± 6.3 | +8.2 ± 6.9 |
| ndn.DyslexicMonkey 1.1 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 86.2% ± 5.0 | 89.6% ± 6.0 | +3.4 ± 6.4 |
| omens.CannonfodderNano 1.4 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 91.9% ± 3.6 | 95.4% ± 1.8 | +3.5 ± 3.2 |
| omens.CannonfodderNano 1.4 | hadur2.Hadur 3.4 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 88.6% ± 5.0 | 95.7% ± 2.0 | +7.1 ± 5.6 |
| oog.melee.Mercutio 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 84.3% ± 3.5 | 95.3% ± 1.8 | +11.1 ± 3.9 |
| oog.melee.Mercutio 1.0 | hadur2.Hadur 3.4 | 8 | 92.5% ± 8.7 | 100.0% ± 0.0 | +7.5 ± 8.7 | 84.7% ± 8.1 | 95.5% ± 1.4 | +10.8 ± 7.9 |
| pac.ABC 2.1 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 99.1% ± 0.8 | 98.8% ± 0.5 | -0.3 ± 0.8 |
| pac.ABC 2.1 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 99.8% ± 0.5 | 99.3% ± 0.6 | -0.5 ± 0.8 |
| ratosh.Wesco 1.4 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 92.5% ± 3.7 | 92.5% ± 5.9 | +0.0 ± 5.3 |
| ratosh.Wesco 1.4 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 92.2% ± 4.5 | 93.2% ± 3.6 | +1.0 ± 5.7 |
| serenity.moonlightBat 1.17 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 87.2% ± 3.1 | 95.5% ± 0.8 | +8.2 ± 3.1 |
| serenity.moonlightBat 1.17 | hadur2.Hadur 3.4 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 87.1% ± 2.9 | 94.2% ± 1.2 | +7.2 ± 3.6 |
| suh.micro.WallPM 1.00 | hadur2.Hadur 3.9 | 8 | 92.5% ± 8.7 | 95.0% ± 4.5 | +2.5 ± 8.7 | 71.1% ± 5.8 | 76.1% ± 2.8 | +5.0 ± 5.7 |
| suh.micro.WallPM 1.00 | hadur2.Hadur 3.4 | 8 | 95.0% ± 7.7 | 95.0% ± 4.5 | +0.0 ± 10.9 | 73.9% ± 6.9 | 75.3% ± 2.7 | +1.5 ± 6.5 |
| suh.nano.CrossC 1.00 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 90.7% ± 2.2 | 95.6% ± 1.1 | +4.9 ± 2.5 |
| suh.nano.CrossC 1.00 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 89.4% ± 2.2 | 97.2% ± 1.6 | +7.7 ± 2.4 |
| sul.BlueBot 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 96.6% ± 5.4 | 98.6% ± 1.4 | +2.0 ± 5.7 |
| sul.BlueBot 1.0 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 98.3% ± 2.4 | 97.7% ± 1.1 | -0.6 ± 2.8 |
| supersample.SuperCorners 1.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 98.8% ± 3.0 | +3.7 ± 8.9 | 77.7% ± 7.3 | 90.9% ± 3.1 | +13.1 ± 7.6 |
| supersample.SuperCorners 1.0 | hadur2.Hadur 3.4 | 8 | 95.0% ± 7.7 | 97.5% ± 3.9 | +2.5 ± 9.7 | 76.2% ± 7.9 | 87.5% ± 4.2 | +11.4 ± 11.0 |
| uccc.MilkyWay 1.01 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 91.7% ± 3.8 | 97.0% ± 1.5 | +5.3 ± 3.3 |
| uccc.MilkyWay 1.01 | hadur2.Hadur 3.4 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 92.3% ± 2.9 | 96.7% ± 2.3 | +4.4 ± 3.6 |
| xander.cat.Spitfire 1.4 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 99.9% ± 0.1 | 100.0% ± 0.0 | +0.0 ± 0.1 |
| xander.cat.Spitfire 1.4 | hadur2.Hadur 3.4 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 99.8% ± 0.2 | 99.9% ± 0.1 | +0.2 ± 0.3 |
| yk.JahMicro 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 84.0% ± 4.0 | 87.2% ± 2.6 | +3.2 ± 5.9 |
| yk.JahMicro 1.0 | hadur2.Hadur 3.4 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 86.3% ± 7.1 | 87.0% ± 4.5 | +0.7 ± 7.1 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| AD.CodaFirst 1.1 | +0.0 ± 0.0 | +0.0 ± 0.0 | +1.9 ± 3.8 | +1.1 ± 2.1 |
| DM.Mijit .3 | +0.0 ± 0.0 | +0.0 ± 0.0 | +3.5 ± 5.8 | +0.3 ± 4.8 |
| EH.Fusion 0.32 | +5.0 ± 14.8 | +1.2 ± 3.0 | -2.1 ± 4.5 | -7.8 ± 4.0 |
| Lo_Ian.Gandalf_V4 4.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | -3.7 ± 4.9 | +0.7 ± 2.0 |
| McS.Spanky_test 0.1a | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.2 ± 0.8 | -0.0 ± 0.7 |
| adt.Ar2 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | -2.1 ± 8.1 | +1.7 ± 3.6 |
| amk.superstrike.SuperStrike 0.3 | +0.0 ± 0.0 | +0.0 ± 0.0 | -1.1 ± 4.4 | -0.3 ± 3.7 |
| apv.TheBrainPi 0.5fix | -10.0 ± 17.9 | +1.0 ± 9.7 | +0.3 ± 10.2 | +3.5 ± 6.1 |
| bk.Shooter 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | -2.1 ± 4.7 | -0.7 ± 2.6 |
| bots.UnterExBot 1.0 | -2.5 ± 5.9 | +0.0 ± 0.0 | -3.6 ± 6.2 | +0.1 ± 1.3 |
| dmh.robocode.robot.GreenDragon 1.0 | -5.0 ± 7.7 | -1.2 ± 3.0 | +1.3 ± 12.1 | +1.4 ± 4.9 |
| dsw.StaticD 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.4 ± 2.6 | -0.2 ± 1.4 |
| ers.nano.lig.LigMA 1.9 | +2.5 ± 10.7 | +0.0 ± 6.3 | +1.6 ± 6.4 | -0.7 ± 6.2 |
| fm.claire 1.7 | -2.5 ± 5.9 | +0.0 ± 0.0 | -2.8 ± 12.4 | -4.3 ± 7.1 |
| hapiel.Spiral 0.1 | -2.5 ± 5.9 | +0.0 ± 0.0 | -3.9 ± 4.9 | +0.5 ± 2.7 |
| hirataatsushi.Trinity 0.003 | +2.5 ± 5.9 | +0.0 ± 0.0 | +2.9 ± 10.4 | +1.7 ± 2.5 |
| hlavko.nano.Ringo 2.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | -6.2 ± 10.2 | -2.3 ± 5.4 |
| jab.micro.Sanguijuela 0.8 | +5.0 ± 14.8 | +8.9 ± 10.4 | -1.7 ± 5.7 | -2.7 ± 2.6 |
| jmcd.BeoWulf 2.8 | -5.0 ± 11.8 | -1.2 ± 3.0 | -5.1 ± 8.9 | +1.6 ± 3.7 |
| js.PinBall 1.6 | +2.5 ± 5.9 | +0.0 ± 0.0 | +4.3 ± 9.2 | -5.3 ± 5.7 |
| kjc.Karaykan 1.0 | +2.5 ± 5.9 | +0.0 ± 0.0 | -8.6 ± 4.7 | +0.1 ± 2.5 |
| madmath.Cow 0.1.1 | +0.0 ± 0.0 | +0.0 ± 0.0 | +2.3 ± 7.3 | -3.4 ± 2.6 |
| marksteam.Phoenix 1.0 | -2.5 ± 5.9 | +1.2 ± 3.0 | -2.8 ± 9.5 | +2.2 ± 6.5 |
| mcb.Audace 1.3 | +0.0 ± 0.0 | +0.0 ± 0.0 | +2.3 ± 7.3 | -1.6 ± 7.1 |
| myl.nano.Kakuru 1.20 | +10.0 ± 12.6 | -2.5 ± 3.9 | -4.3 ± 10.8 | +3.3 ± 7.7 |
| nan.Ihivatar_Mk_1 1.0 | +5.0 ± 11.8 | +0.0 ± 0.0 | +6.0 ± 11.9 | +0.8 ± 5.3 |
| ndn.DyslexicMonkey 1.1 | +0.0 ± 0.0 | -1.2 ± 7.0 | -3.3 ± 5.9 | +1.5 ± 7.0 |
| omens.CannonfodderNano 1.4 | +2.5 ± 5.9 | +0.0 ± 0.0 | +3.3 ± 6.6 | -0.3 ± 2.7 |
| oog.melee.Mercutio 1.0 | +5.0 ± 7.7 | +0.0 ± 0.0 | -0.4 ± 8.7 | -0.1 ± 1.8 |
| pac.ABC 2.1 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.7 ± 0.8 | -0.4 ± 0.7 |
| ratosh.Wesco 1.4 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.3 ± 6.6 | -0.7 ± 9.0 |
| serenity.moonlightBat 1.17 | +2.5 ± 10.7 | +0.0 ± 0.0 | +0.2 ± 5.1 | +1.2 ± 1.4 |
| suh.micro.WallPM 1.00 | -2.5 ± 5.9 | +0.0 ± 6.3 | -2.8 ± 6.0 | +0.8 ± 3.5 |
| suh.nano.CrossC 1.00 | +0.0 ± 0.0 | +0.0 ± 0.0 | +1.2 ± 2.9 | -1.6 ± 2.1 |
| sul.BlueBot 1.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | -1.7 ± 3.2 | +0.9 ± 1.8 |
| supersample.SuperCorners 1.0 | +0.0 ± 12.6 | +1.2 ± 5.4 | +1.6 ± 13.5 | +3.3 ± 5.4 |
| uccc.MilkyWay 1.01 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.6 ± 5.2 | +0.3 ± 2.3 |
| xander.cat.Spitfire 1.4 | +2.5 ± 5.9 | +0.0 ± 0.0 | +0.2 ± 0.3 | +0.0 ± 0.1 |
| yk.JahMicro 1.0 | +0.0 ± 8.9 | +0.0 ± 0.0 | -2.3 ± 9.2 | +0.2 ± 3.9 |

## Failed battles

- e32.Omni 0.06 seed 1 e32.Omni_0.06-1: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 2 e32.Omni_0.06-2-baseline: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 4 e32.Omni_0.06-4-baseline: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 3 e32.Omni_0.06-3: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 1 e32.Omni_0.06-1-baseline: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 2 e32.Omni_0.06-2: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 3 e32.Omni_0.06-3-baseline: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 4 e32.Omni_0.06-4: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 5 e32.Omni_0.06-5: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 6 e32.Omni_0.06-6-baseline: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 7 e32.Omni_0.06-7: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 8 e32.Omni_0.06-8-baseline: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 5 e32.Omni_0.06-5-baseline: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 6 e32.Omni_0.06-6: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 7 e32.Omni_0.06-7-baseline: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 8 e32.Omni_0.06-8: failed after 2 attempts (expected 2 robots; found 1)
