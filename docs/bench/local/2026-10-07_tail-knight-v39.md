# Bench: rsalesc.mega.Knight 0.6.28 (cold)

## Excluded or failing opponents

These failed at least half of their battles, so their rows are missing or thin and the set is smaller than it was asked to be.

| Opponent | Battles failed | First failure |
|---|---|---|
| e32.Omni 0.06 | 8 of 8 (all) | expected 2 robots; found 1 |
| e32.Omni 0.06 (baseline) | 8 of 8 (all) | expected 2 robots; found 1 |

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are the robot's fraction of the two robots' total, mean ± 95% interval over battles. It is a reference build, not Hadur: it writes no R records, so the columns that come from them show "-" and the battle's trust rests on the engine's skipped turns alone.

Skipped turns: 596 over 312 battles (1.9 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | weak | 85.7% ± 2.5 | 97.9% ± 1.7 | 74.7% ± 3.4 | 274 / 280 | - | - | 16 | - | 1.06 / 18.8 |
| apv.TheBrainPi 0.5fix | weak | 77.7% ± 3.4 | 93.9% ± 2.7 | 61.2% ± 3.4 | 263 / 280 | - | - | 10 | - | 1.18 / 19.6 |
| jmcd.BeoWulf 2.8 | weak | 84.8% ± 2.6 | 97.9% ± 2.1 | 73.1% ± 3.1 | 274 / 280 | - | - | 18 | - | 1.01 / 19.6 |
| DM.Mijit .3 | weak | 89.9% ± 1.1 | 100.0% ± 0.0 | 78.7% ± 1.9 | 280 / 280 | - | - | 18 | - | 1.01 / 17.2 |
| nan.Ihivatar_Mk_1 1.0 | weak | 96.8% ± 1.5 | 100.0% ± 0.0 | 91.5% ± 3.9 | 280 / 280 | - | - | 13 | - | 0.99 / 16.5 |
| jab.micro.Sanguijuela 0.8 | weak | 77.0% ± 1.9 | 98.2% ± 1.2 | 69.2% ± 1.7 | 275 / 280 | - | - | 10 | - | 0.93 / 14.4 |
| serenity.moonlightBat 1.17 | weak | 96.4% ± 0.5 | 100.0% ± 0.0 | 92.7% ± 1.0 | 280 / 280 | - | - | 15 | - | 1.06 / 17.9 |
| myl.nano.Kakuru 1.20 | weak | 76.9% ± 2.9 | 94.6% ± 2.4 | 59.3% ± 3.2 | 265 / 280 | - | - | 11 | - | 0.97 / 17.8 |
| mcb.Audace 1.3 | weak | 95.5% ± 2.5 | 99.6% ± 0.8 | 91.6% ± 4.3 | 279 / 280 | - | - | 8 | - | 1.26 / 153.7 |
| suh.micro.WallPM 1.00 | weak | 83.4% ± 1.5 | 96.8% ± 1.5 | 71.8% ± 1.8 | 271 / 280 | - | - | 34 | - | 1.11 / 64.5 |
| fm.claire 1.7 | weak | 94.9% ± 0.6 | 100.0% ± 0.0 | 86.0% ± 1.5 | 280 / 280 | - | - | 11 | - | 0.93 / 15.9 |
| dmh.robocode.robot.GreenDragon 1.0 | weak | 92.5% ± 1.1 | 100.0% ± 0.0 | 83.5% ± 2.2 | 280 / 280 | - | - | 22 | - | 1.06 / 18.3 |
| oog.melee.Mercutio 1.0 | weak | 96.9% ± 0.4 | 100.0% ± 0.0 | 93.8% ± 0.8 | 280 / 280 | - | - | 56 | - | 1.14 / 14.5 |
| js.PinBall 1.6 | weak | 98.1% ± 0.7 | 100.0% ± 0.0 | 96.1% ± 1.5 | 280 / 280 | - | - | 12 | - | 1.04 / 16.9 |
| EH.Fusion 0.32 | weak | 86.7% ± 0.9 | 100.0% ± 0.0 | 78.8% ± 1.2 | 280 / 280 | - | - | 7 | - | 0.96 / 86.0 |
| ratosh.Wesco 1.4 | weak | 97.5% ± 0.7 | 100.0% ± 0.0 | 94.3% ± 1.5 | 280 / 280 | - | - | 20 | - | 1.06 / 14.8 |
| xander.cat.Spitfire 1.4 | weak | 99.9% ± 0.0 | 100.0% ± 0.0 | 99.9% ± 0.1 | 280 / 280 | - | - | 7 | - | 1.02 / 14.9 |
| marksteam.Phoenix 1.0 | weak | 93.3% ± 1.2 | 99.6% ± 0.8 | 85.4% ± 1.7 | 279 / 280 | - | - | 8 | - | 1.01 / 15.6 |
| ndn.DyslexicMonkey 1.1 | weak | 96.8% ± 0.8 | 100.0% ± 0.0 | 93.3% ± 1.6 | 280 / 280 | - | - | 16 | - | 0.97 / 17.0 |
| supersample.SuperCorners 1.0 | weak | 92.4% ± 1.7 | 100.0% ± 0.0 | 86.2% ± 2.6 | 280 / 280 | - | - | 15 | - | 1.04 / 16.5 |
| bots.UnterExBot 1.0 | weak | 97.8% ± 0.3 | 100.0% ± 0.0 | 95.6% ± 0.7 | 280 / 280 | - | - | 11 | - | 1.00 / 16.6 |
| hlavko.nano.Ringo 2.0 | weak | 98.2% ± 0.5 | 100.0% ± 0.0 | 96.2% ± 0.9 | 280 / 280 | - | - | 13 | - | 1.03 / 15.1 |
| dsw.StaticD 1.0 | weak | 99.3% ± 0.3 | 100.0% ± 0.0 | 98.6% ± 0.7 | 280 / 280 | - | - | 5 | - | 0.98 / 15.2 |
| sul.BlueBot 1.0 | weak | 99.4% ± 0.3 | 100.0% ± 0.0 | 98.8% ± 0.6 | 280 / 280 | - | - | 10 | - | 0.99 / 14.1 |
| hapiel.Spiral 0.1 | weak | 96.6% ± 0.5 | 100.0% ± 0.0 | 93.5% ± 0.9 | 280 / 280 | - | - | 8 | - | 0.95 / 18.1 |
| Lo_Ian.Gandalf_V4 4.0 | weak | 98.3% ± 0.4 | 100.0% ± 0.0 | 96.7% ± 0.8 | 280 / 280 | - | - | 11 | - | 0.96 / 14.7 |
| e32.Omni 0.06 | weak | n/a | n/a | n/a | 0 / 0 | - | - | 0 | - | 0.00 / 0.0 | 8 battle(s) failed
| suh.nano.CrossC 1.00 | weak | 98.5% ± 1.1 | 99.6% ± 0.8 | 97.4% ± 1.3 | 279 / 280 | - | - | 9 | - | 1.01 / 15.1 |
| hirataatsushi.Trinity 0.003 | weak | 96.6% ± 0.3 | 100.0% ± 0.0 | 93.8% ± 0.6 | 280 / 280 | - | - | 15 | - | 1.01 / 16.6 |
| adt.Ar2 1.0 | weak | 92.6% ± 2.4 | 100.0% ± 0.0 | 86.2% ± 4.1 | 280 / 280 | - | - | 34 | - | 1.14 / 16.3 |
| yk.JahMicro 1.0 | weak | 95.6% ± 0.7 | 100.0% ± 0.0 | 91.7% ± 1.2 | 280 / 280 | - | - | 18 | - | 1.02 / 17.8 |
| uccc.MilkyWay 1.01 | weak | 99.0% ± 0.3 | 100.0% ± 0.0 | 98.1% ± 0.5 | 280 / 280 | - | - | 12 | - | 1.02 / 16.1 |
| amk.superstrike.SuperStrike 0.3 | weak | 96.9% ± 1.2 | 100.0% ± 0.0 | 93.6% ± 2.4 | 280 / 280 | - | - | 23 | - | 1.12 / 28.9 |
| omens.CannonfodderNano 1.4 | weak | 98.4% ± 0.4 | 100.0% ± 0.0 | 97.0% ± 0.7 | 280 / 280 | - | - | 17 | - | 1.01 / 16.0 |
| AD.CodaFirst 1.1 | weak | 99.1% ± 0.8 | 100.0% ± 0.0 | 98.3% ± 1.4 | 280 / 280 | - | - | 12 | - | 1.00 / 97.1 |
| madmath.Cow 0.1.1 | weak | 96.8% ± 0.7 | 100.0% ± 0.0 | 93.9% ± 1.3 | 280 / 280 | - | - | 18 | - | 1.04 / 14.8 |
| kjc.Karaykan 1.0 | weak | 95.1% ± 0.4 | 100.0% ± 0.0 | 90.9% ± 0.6 | 280 / 280 | - | - | 9 | - | 0.96 / 15.2 |
| pac.ABC 2.1 | weak | 99.8% ± 0.1 | 100.0% ± 0.0 | 99.6% ± 0.3 | 280 / 280 | - | - | 8 | - | 0.96 / 15.7 |
| bk.Shooter 1.0 | weak | 99.1% ± 0.6 | 100.0% ± 0.0 | 98.2% ± 1.1 | 280 / 280 | - | - | 23 | - | 1.02 / 14.7 |
| McS.Spanky_test 0.1a | weak | 100.0% ± 0.1 | 100.0% ± 0.0 | 99.9% ± 0.1 | 280 / 280 | - | - | 13 | - | 0.97 / 15.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 8 | 753 | 5.0% | 92.7% | 0.0% | 2.3% | 552 |
| apv.TheBrainPi 0.5fix | 8 | 1045 | 10.2% | 84.8% | 0.0% | 5.0% | 625 |
| jmcd.BeoWulf 2.8 | 8 | 801 | 4.7% | 93.0% | 0.0% | 2.3% | 663 |
| DM.Mijit .3 | 8 | 469 | 0.0% | 100.0% | 0.0% | 0.0% | 536 |
| nan.Ihivatar_Mk_1 1.0 | 8 | 123 | 0.0% | 99.8% | 0.2% | 0.0% | 535 |
| jab.micro.Sanguijuela 0.8 | 8 | 1851 | 1.7% | 82.2% | 14.9% | 1.3% | 297 |
| serenity.moonlightBat 1.17 | 8 | 186 | 0.0% | 100.0% | 0.0% | 0.0% | 809 |
| myl.nano.Kakuru 1.20 | 8 | 1091 | 8.6% | 87.1% | 0.0% | 4.3% | 549 |
| mcb.Audace 1.3 | 8 | 247 | 2.5% | 96.0% | 0.1% | 1.4% | 342 |
| suh.micro.WallPM 1.00 | 8 | 899 | 6.3% | 90.4% | 0.1% | 3.3% | 756 |
| fm.claire 1.7 | 8 | 189 | 0.0% | 100.0% | 0.0% | 0.0% | 510 |
| dmh.robocode.robot.GreenDragon 1.0 | 8 | 338 | 0.0% | 100.0% | 0.0% | 0.0% | 546 |
| oog.melee.Mercutio 1.0 | 8 | 159 | 0.0% | 99.8% | 0.2% | 0.0% | 638 |
| js.PinBall 1.6 | 8 | 94 | 0.0% | 100.0% | 0.0% | 0.0% | 466 |
| EH.Fusion 0.32 | 8 | 874 | 0.0% | 91.9% | 8.1% | 0.0% | 299 |
| ratosh.Wesco 1.4 | 8 | 108 | 0.0% | 99.1% | 0.9% | 0.0% | 467 |
| xander.cat.Spitfire 1.4 | 8 | 3 | 0.0% | 100.0% | 0.0% | 0.0% | 313 |
| marksteam.Phoenix 1.0 | 8 | 295 | 2.1% | 96.9% | 0.0% | 1.0% | 504 |
| ndn.DyslexicMonkey 1.1 | 8 | 152 | 0.0% | 99.9% | 0.1% | 0.0% | 526 |
| supersample.SuperCorners 1.0 | 8 | 433 | 0.0% | 96.9% | 3.1% | 0.0% | 395 |
| bots.UnterExBot 1.0 | 8 | 108 | 0.0% | 99.8% | 0.2% | 0.0% | 519 |
| hlavko.nano.Ringo 2.0 | 8 | 77 | 0.0% | 95.5% | 4.5% | 0.0% | 436 |
| dsw.StaticD 1.0 | 8 | 37 | 0.0% | 100.0% | 0.0% | 0.0% | 509 |
| sul.BlueBot 1.0 | 8 | 33 | 0.0% | 100.0% | 0.0% | 0.0% | 336 |
| hapiel.Spiral 0.1 | 8 | 184 | 0.0% | 99.9% | 0.1% | 0.0% | 613 |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 95 | 0.0% | 99.7% | 0.3% | 0.0% | 388 |
| e32.Omni 0.06 | 0 | - | - | - | - | - | - |
| suh.nano.CrossC 1.00 | 8 | 83 | 7.5% | 87.6% | 0.4% | 4.5% | 386 |
| hirataatsushi.Trinity 0.003 | 8 | 203 | 0.0% | 96.9% | 3.1% | 0.0% | 343 |
| adt.Ar2 1.0 | 8 | 413 | 0.0% | 99.5% | 0.5% | 0.0% | 374 |
| yk.JahMicro 1.0 | 8 | 247 | 0.0% | 98.9% | 1.1% | 0.0% | 608 |
| uccc.MilkyWay 1.01 | 8 | 57 | 0.0% | 97.8% | 2.2% | 0.0% | 443 |
| amk.superstrike.SuperStrike 0.3 | 8 | 151 | 0.0% | 99.9% | 0.1% | 0.0% | 463 |
| omens.CannonfodderNano 1.4 | 8 | 88 | 0.0% | 99.1% | 0.9% | 0.0% | 479 |
| AD.CodaFirst 1.1 | 8 | 54 | 0.0% | 100.0% | 0.0% | 0.0% | 322 |
| madmath.Cow 0.1.1 | 8 | 174 | 0.0% | 99.9% | 0.1% | 0.0% | 379 |
| kjc.Karaykan 1.0 | 8 | 284 | 0.0% | 99.7% | 0.3% | 0.0% | 347 |
| pac.ABC 2.1 | 8 | 14 | 0.0% | 99.1% | 0.9% | 0.0% | 509 |
| bk.Shooter 1.0 | 8 | 51 | 0.0% | 100.0% | 0.0% | 0.0% | 455 |
| McS.Spanky_test 0.1a | 8 | 2 | 0.0% | 87.5% | 12.5% | 0.0% | 567 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 8 | 8 | n/a | 0 | 0.06 | 0 | 0 | 0 |
| apv.TheBrainPi 0.5fix | 8 | 8 | n/a | 0 | 0.04 | 0 | 0 | 8 |
| jmcd.BeoWulf 2.8 | 8 | 8 | n/a | 0 | 0.06 | 0 | 0 | 0 |
| DM.Mijit .3 | 8 | 8 | n/a | 0 | 0.06 | 0 | 0 | 0 |
| nan.Ihivatar_Mk_1 1.0 | 8 | 8 | n/a | 0 | 0.05 | 0 | 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 8 | 8 | n/a | 0 | 0.04 | 0 | 0 | 0 |
| serenity.moonlightBat 1.17 | 8 | 8 | n/a | 0 | 0.05 | 0 | 0 | 0 |
| myl.nano.Kakuru 1.20 | 8 | 8 | n/a | 0 | 0.04 | 0 | 0 | 0 |
| mcb.Audace 1.3 | 8 | 8 | n/a | 0 | 0.03 | 0 | 0 | 0 |
| suh.micro.WallPM 1.00 | 8 | 8 | n/a | 0 | 0.12 | 0 | 0 | 0 |
| fm.claire 1.7 | 8 | 8 | n/a | 0 | 0.04 | 0 | 0 | 0 |
| dmh.robocode.robot.GreenDragon 1.0 | 8 | 8 | n/a | 0 | 0.08 | 0 | 0 | 0 |
| oog.melee.Mercutio 1.0 | 8 | 8 | n/a | 0 | 0.20 | 0 | 0 | 0 |
| js.PinBall 1.6 | 8 | 8 | n/a | 0 | 0.04 | 0 | 0 | 0 |
| EH.Fusion 0.32 | 8 | 8 | n/a | 0 | 0.03 | 0 | 0 | 0 |
| ratosh.Wesco 1.4 | 8 | 8 | n/a | 0 | 0.07 | 0 | 0 | 0 |
| xander.cat.Spitfire 1.4 | 8 | 8 | n/a | 0 | 0.03 | 0 | 0 | 0 |
| marksteam.Phoenix 1.0 | 8 | 8 | n/a | 0 | 0.03 | 0 | 0 | 0 |
| ndn.DyslexicMonkey 1.1 | 8 | 8 | n/a | 0 | 0.06 | 0 | 0 | 0 |
| supersample.SuperCorners 1.0 | 8 | 8 | n/a | 0 | 0.05 | 0 | 0 | 0 |
| bots.UnterExBot 1.0 | 8 | 8 | n/a | 0 | 0.04 | 0 | 0 | 0 |
| hlavko.nano.Ringo 2.0 | 8 | 8 | n/a | 0 | 0.05 | 0 | 0 | 0 |
| dsw.StaticD 1.0 | 8 | 8 | n/a | 0 | 0.02 | 0 | 0 | 0 |
| sul.BlueBot 1.0 | 8 | 8 | n/a | 0 | 0.04 | 0 | 0 | 0 |
| hapiel.Spiral 0.1 | 8 | 8 | n/a | 0 | 0.03 | 0 | 0 | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 8 | n/a | 0 | 0.04 | 0 | 0 | 0 |
| e32.Omni 0.06 | 8 | 0 | 0 | 0 | 0.00 | 0 | 0 | 0 |
| suh.nano.CrossC 1.00 | 8 | 8 | n/a | 0 | 0.03 | 0 | 0 | 0 |
| hirataatsushi.Trinity 0.003 | 8 | 8 | n/a | 0 | 0.05 | 0 | 0 | 0 |
| adt.Ar2 1.0 | 8 | 8 | n/a | 0 | 0.12 | 0 | 0 | 0 |
| yk.JahMicro 1.0 | 8 | 8 | n/a | 0 | 0.06 | 0 | 0 | 0 |
| uccc.MilkyWay 1.01 | 8 | 8 | n/a | 0 | 0.04 | 0 | 0 | 0 |
| amk.superstrike.SuperStrike 0.3 | 8 | 8 | n/a | 0 | 0.08 | 0 | 0 | 0 |
| omens.CannonfodderNano 1.4 | 8 | 8 | n/a | 0 | 0.06 | 0 | 0 | 0 |
| AD.CodaFirst 1.1 | 8 | 8 | n/a | 0 | 0.04 | 0 | 0 | 0 |
| madmath.Cow 0.1.1 | 8 | 8 | n/a | 0 | 0.06 | 0 | 0 | 0 |
| kjc.Karaykan 1.0 | 8 | 8 | n/a | 0 | 0.03 | 0 | 0 | 0 |
| pac.ABC 2.1 | 8 | 8 | n/a | 0 | 0.03 | 0 | 0 | 0 |
| bk.Shooter 1.0 | 8 | 8 | n/a | 0 | 0.08 | 0 | 0 | 0 |
| McS.Spanky_test 0.1a | 8 | 8 | n/a | 0 | 0.05 | 0 | 0 | 0 |

312 of 320 battles trusted.

## Paired A/B: rsalesc.mega.Knight 0.6.28 vs hadur2.Hadur 3.9

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 85.7% ± 2.5 | 86.8% ± 2.3 | -1.0 ± 2.6 |
| apv.TheBrainPi 0.5fix | 77.7% ± 3.4 | 74.2% ± 4.9 | +3.6 ± 7.0 |
| jmcd.BeoWulf 2.8 | 84.8% ± 2.6 | 84.2% ± 3.7 | +0.6 ± 4.4 |
| DM.Mijit .3 | 89.9% ± 1.1 | 89.7% ± 2.2 | +0.3 ± 2.1 |
| nan.Ihivatar_Mk_1 1.0 | 96.8% ± 1.5 | 90.3% ± 2.7 | +6.5 ± 3.1 |
| jab.micro.Sanguijuela 0.8 | 77.0% ± 1.9 | 70.0% ± 3.0 | +7.0 ± 3.7 |
| serenity.moonlightBat 1.17 | 96.4% ± 0.5 | 96.3% ± 1.3 | +0.1 ± 1.3 |
| myl.nano.Kakuru 1.20 | 76.9% ± 2.9 | 78.5% ± 4.0 | -1.6 ± 6.0 |
| mcb.Audace 1.3 | 95.5% ± 2.5 | 93.6% ± 2.5 | +1.9 ± 3.7 |
| suh.micro.WallPM 1.00 | 83.4% ± 1.5 | 81.3% ± 3.8 | +2.1 ± 4.4 |
| fm.claire 1.7 | 94.9% ± 0.6 | 92.0% ± 1.5 | +2.9 ± 1.3 |
| dmh.robocode.robot.GreenDragon 1.0 | 92.5% ± 1.1 | 90.1% ± 1.9 | +2.4 ± 2.2 |
| oog.melee.Mercutio 1.0 | 96.9% ± 0.4 | 96.1% ± 1.3 | +0.8 ± 1.4 |
| js.PinBall 1.6 | 98.1% ± 0.7 | 93.9% ± 3.1 | +4.2 ± 3.5 |
| EH.Fusion 0.32 | 86.7% ± 0.9 | 81.3% ± 1.8 | +5.4 ± 2.0 |
| ratosh.Wesco 1.4 | 97.5% ± 0.7 | 97.8% ± 0.7 | -0.3 ± 1.2 |
| xander.cat.Spitfire 1.4 | 99.9% ± 0.0 | 100.0% ± 0.0 | -0.0 ± 0.0 |
| marksteam.Phoenix 1.0 | 93.3% ± 1.2 | 93.9% ± 1.7 | -0.6 ± 2.2 |
| ndn.DyslexicMonkey 1.1 | 96.8% ± 0.8 | 93.8% ± 3.4 | +3.1 ± 3.5 |
| supersample.SuperCorners 1.0 | 92.4% ± 1.7 | 90.0% ± 1.8 | +2.4 ± 2.0 |
| bots.UnterExBot 1.0 | 97.8% ± 0.3 | 98.6% ± 0.6 | -0.7 ± 0.7 |
| hlavko.nano.Ringo 2.0 | 98.2% ± 0.5 | 97.6% ± 1.3 | +0.6 ± 1.2 |
| dsw.StaticD 1.0 | 99.3% ± 0.3 | 99.0% ± 0.3 | +0.3 ± 0.5 |
| sul.BlueBot 1.0 | 99.4% ± 0.3 | 99.5% ± 0.2 | -0.1 ± 0.3 |
| hapiel.Spiral 0.1 | 96.6% ± 0.5 | 95.7% ± 0.7 | +0.9 ± 0.7 |
| Lo_Ian.Gandalf_V4 4.0 | 98.3% ± 0.4 | 98.4% ± 0.6 | -0.1 ± 1.0 |
| e32.Omni 0.06 | n/a | n/a | n/a |
| suh.nano.CrossC 1.00 | 98.5% ± 1.1 | 97.9% ± 0.6 | +0.6 ± 1.1 |
| hirataatsushi.Trinity 0.003 | 96.6% ± 0.3 | 95.1% ± 0.9 | +1.5 ± 0.8 |
| adt.Ar2 1.0 | 92.6% ± 2.4 | 94.4% ± 1.1 | -1.8 ± 3.1 |
| yk.JahMicro 1.0 | 95.6% ± 0.7 | 93.4% ± 1.3 | +2.2 ± 1.6 |
| uccc.MilkyWay 1.01 | 99.0% ± 0.3 | 97.3% ± 0.8 | +1.6 ± 0.9 |
| amk.superstrike.SuperStrike 0.3 | 96.9% ± 1.2 | 96.8% ± 0.7 | +0.1 ± 1.5 |
| omens.CannonfodderNano 1.4 | 98.4% ± 0.4 | 97.1% ± 0.6 | +1.3 ± 0.8 |
| AD.CodaFirst 1.1 | 99.1% ± 0.8 | 99.4% ± 0.3 | -0.3 ± 0.7 |
| madmath.Cow 0.1.1 | 96.8% ± 0.7 | 97.2% ± 0.8 | -0.4 ± 0.6 |
| kjc.Karaykan 1.0 | 95.1% ± 0.4 | 94.6% ± 1.3 | +0.5 ± 1.1 |
| pac.ABC 2.1 | 99.8% ± 0.1 | 99.6% ± 0.1 | +0.2 ± 0.2 |
| bk.Shooter 1.0 | 99.1% ± 0.6 | 98.3% ± 0.3 | +0.8 ± 0.7 |
| McS.Spanky_test 0.1a | 100.0% ± 0.1 | 99.9% ± 0.2 | +0.1 ± 0.2 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | -1.0 ± 2.6 | +1.8 ± 2.2 | +1.8 ± 2.2 | -3.1 ± 3.9 |
| apv.TheBrainPi 0.5fix | +3.6 ± 7.0 | +6.4 ± 6.7 | +6.4 ± 6.7 | +0.7 ± 6.7 |
| jmcd.BeoWulf 2.8 | +0.6 ± 4.4 | +2.9 ± 4.8 | +2.9 ± 4.8 | -0.7 ± 4.1 |
| DM.Mijit .3 | +0.3 ± 2.1 | +1.1 ± 1.8 | +1.1 ± 1.8 | -1.0 ± 2.5 |
| nan.Ihivatar_Mk_1 1.0 | +6.5 ± 3.1 | +0.4 ± 0.8 | +0.4 ± 0.8 | +14.3 ± 6.1 |
| jab.micro.Sanguijuela 0.8 | +7.0 ± 3.7 | +2.6 ± 3.8 | +2.5 ± 3.7 | +7.8 ± 1.7 |
| serenity.moonlightBat 1.17 | +0.1 ± 1.3 | +0.7 ± 1.1 | +0.7 ± 1.1 | -0.4 ± 1.6 |
| myl.nano.Kakuru 1.20 | -1.6 ± 6.0 | +1.5 ± 5.1 | +1.4 ± 5.1 | -3.6 ± 6.8 |
| mcb.Audace 1.3 | +1.9 ± 3.7 | -0.4 ± 0.8 | -0.4 ± 0.8 | +3.8 ± 6.3 |
| suh.micro.WallPM 1.00 | +2.1 ± 4.4 | +6.4 ± 5.5 | +6.4 ± 5.5 | -1.3 ± 4.1 |
| fm.claire 1.7 | +2.9 ± 1.3 | +1.1 ± 1.2 | +1.1 ± 1.2 | +5.0 ± 2.4 |
| dmh.robocode.robot.GreenDragon 1.0 | +2.4 ± 2.2 | +0.4 ± 0.8 | +0.4 ± 0.8 | +4.5 ± 4.0 |
| oog.melee.Mercutio 1.0 | +0.8 ± 1.4 | +0.4 ± 0.8 | +0.4 ± 0.8 | +1.1 ± 2.1 |
| js.PinBall 1.6 | +4.2 ± 3.5 | +1.4 ± 1.8 | +1.4 ± 1.8 | +6.3 ± 5.2 |
| EH.Fusion 0.32 | +5.4 ± 2.0 | +1.4 ± 1.8 | +1.4 ± 1.8 | +6.4 ± 2.6 |
| ratosh.Wesco 1.4 | -0.3 ± 1.2 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.3 ± 3.1 |
| xander.cat.Spitfire 1.4 | -0.0 ± 0.0 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.1 ± 0.1 |
| marksteam.Phoenix 1.0 | -0.6 ± 2.2 | +0.0 ± 1.3 | +0.0 ± 1.3 | -2.2 ± 3.8 |
| ndn.DyslexicMonkey 1.1 | +3.1 ± 3.5 | +1.8 ± 2.6 | +1.8 ± 2.5 | +3.8 ± 4.3 |
| supersample.SuperCorners 1.0 | +2.4 ± 2.0 | +3.9 ± 2.2 | +3.9 ± 2.2 | +0.5 ± 2.2 |
| bots.UnterExBot 1.0 | -0.7 ± 0.7 | +0.0 ± 0.0 | +0.0 ± 0.0 | -1.5 ± 1.4 |
| hlavko.nano.Ringo 2.0 | +0.6 ± 1.2 | +0.0 ± 0.0 | +0.0 ± 0.0 | +1.1 ± 2.4 |
| dsw.StaticD 1.0 | +0.3 ± 0.5 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.6 ± 1.1 |
| sul.BlueBot 1.0 | -0.1 ± 0.3 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.2 ± 0.6 |
| hapiel.Spiral 0.1 | +0.9 ± 0.7 | +0.7 ± 1.1 | +0.7 ± 1.1 | +1.2 ± 1.0 |
| Lo_Ian.Gandalf_V4 4.0 | -0.1 ± 1.0 | +0.4 ± 0.8 | +0.4 ± 0.8 | -0.8 ± 1.2 |
| e32.Omni 0.06 | n/a | n/a | n/a | n/a |
| suh.nano.CrossC 1.00 | +0.6 ± 1.1 | -0.4 ± 0.8 | -0.4 ± 0.8 | +1.5 ± 1.4 |
| hirataatsushi.Trinity 0.003 | +1.5 ± 0.8 | +0.0 ± 0.0 | +0.0 ± 0.0 | +2.5 ± 1.4 |
| adt.Ar2 1.0 | -1.8 ± 3.1 | +0.0 ± 0.0 | +0.0 ± 0.0 | -2.9 ± 5.3 |
| yk.JahMicro 1.0 | +2.2 ± 1.6 | +1.4 ± 1.3 | +1.4 ± 1.3 | +2.8 ± 2.8 |
| uccc.MilkyWay 1.01 | +1.6 ± 0.9 | +0.4 ± 0.8 | +0.4 ± 0.8 | +2.6 ± 1.3 |
| amk.superstrike.SuperStrike 0.3 | +0.1 ± 1.5 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.1 ± 2.9 |
| omens.CannonfodderNano 1.4 | +1.3 ± 0.8 | +0.0 ± 0.0 | +0.0 ± 0.0 | +2.4 ± 1.4 |
| AD.CodaFirst 1.1 | -0.3 ± 0.7 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.5 ± 1.4 |
| madmath.Cow 0.1.1 | -0.4 ± 0.6 | +0.0 ± 0.0 | +0.0 ± 0.0 | -0.8 ± 1.0 |
| kjc.Karaykan 1.0 | +0.5 ± 1.1 | +0.7 ± 1.1 | +0.7 ± 1.1 | +0.3 ± 1.5 |
| pac.ABC 2.1 | +0.2 ± 0.2 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.3 ± 0.4 |
| bk.Shooter 1.0 | +0.8 ± 0.7 | +0.0 ± 0.0 | +0.0 ± 0.0 | +1.4 ± 1.3 |
| McS.Spanky_test 0.1a | +0.1 ± 0.2 | +0.0 ± 0.0 | +0.0 ± 0.0 | +0.2 ± 0.3 |
| All pairs | +1.2 ± 0.4 | +0.9 ± 0.3 | +0.9 ± 0.3 | +1.3 ± 0.5 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or, for a Hadur build, a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 8 | 5 | -1.0 ± 2.6 | -2.0 ± 4.1 |
| apv.TheBrainPi 0.5fix | 8 | 5 | +3.6 ± 7.0 | +6.5 ± 8.5 |
| jmcd.BeoWulf 2.8 | 8 | 8 | +0.6 ± 4.4 | +0.6 ± 4.4 |
| DM.Mijit .3 | 8 | 7 | +0.3 ± 2.1 | -0.0 ± 2.4 |
| nan.Ihivatar_Mk_1 1.0 | 8 | 8 | +6.5 ± 3.1 | +6.5 ± 3.1 |
| jab.micro.Sanguijuela 0.8 | 8 | 6 | +7.0 ± 3.7 | +5.6 ± 4.0 |
| serenity.moonlightBat 1.17 | 8 | 8 | +0.1 ± 1.3 | +0.1 ± 1.3 |
| myl.nano.Kakuru 1.20 | 8 | 8 | -1.6 ± 6.0 | -1.6 ± 6.0 |
| mcb.Audace 1.3 | 8 | 8 | +1.9 ± 3.7 | +1.9 ± 3.7 |
| suh.micro.WallPM 1.00 | 8 | 7 | +2.1 ± 4.4 | +2.4 ± 5.2 |
| fm.claire 1.7 | 8 | 8 | +2.9 ± 1.3 | +2.9 ± 1.3 |
| dmh.robocode.robot.GreenDragon 1.0 | 8 | 7 | +2.4 ± 2.2 | +2.4 ± 2.6 |
| oog.melee.Mercutio 1.0 | 8 | 8 | +0.8 ± 1.4 | +0.8 ± 1.4 |
| js.PinBall 1.6 | 8 | 8 | +4.2 ± 3.5 | +4.2 ± 3.5 |
| EH.Fusion 0.32 | 8 | 8 | +5.4 ± 2.0 | +5.4 ± 2.0 |
| ratosh.Wesco 1.4 | 8 | 6 | -0.3 ± 1.2 | -0.8 ± 1.0 |
| xander.cat.Spitfire 1.4 | 8 | 8 | -0.0 ± 0.0 | -0.0 ± 0.0 |
| marksteam.Phoenix 1.0 | 8 | 7 | -0.6 ± 2.2 | -0.4 ± 2.5 |
| ndn.DyslexicMonkey 1.1 | 8 | 8 | +3.1 ± 3.5 | +3.1 ± 3.5 |
| supersample.SuperCorners 1.0 | 8 | 8 | +2.4 ± 2.0 | +2.4 ± 2.0 |
| bots.UnterExBot 1.0 | 8 | 8 | -0.7 ± 0.7 | -0.7 ± 0.7 |
| hlavko.nano.Ringo 2.0 | 8 | 8 | +0.6 ± 1.2 | +0.6 ± 1.2 |
| dsw.StaticD 1.0 | 8 | 8 | +0.3 ± 0.5 | +0.3 ± 0.5 |
| sul.BlueBot 1.0 | 8 | 8 | -0.1 ± 0.3 | -0.1 ± 0.3 |
| hapiel.Spiral 0.1 | 8 | 7 | +0.9 ± 0.7 | +1.0 ± 0.9 |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 6 | -0.1 ± 1.0 | -0.6 ± 0.8 |
| e32.Omni 0.06 | 0 | 0 | n/a | n/a |
| suh.nano.CrossC 1.00 | 8 | 8 | +0.6 ± 1.1 | +0.6 ± 1.1 |
| hirataatsushi.Trinity 0.003 | 8 | 8 | +1.5 ± 0.8 | +1.5 ± 0.8 |
| adt.Ar2 1.0 | 8 | 6 | -1.8 ± 3.1 | -2.9 ± 3.7 |
| yk.JahMicro 1.0 | 8 | 6 | +2.2 ± 1.6 | +2.3 ± 2.3 |
| uccc.MilkyWay 1.01 | 8 | 6 | +1.6 ± 0.9 | +1.4 ± 1.2 |
| amk.superstrike.SuperStrike 0.3 | 8 | 7 | +0.1 ± 1.5 | -0.1 ± 1.6 |
| omens.CannonfodderNano 1.4 | 8 | 8 | +1.3 ± 0.8 | +1.3 ± 0.8 |
| AD.CodaFirst 1.1 | 8 | 7 | -0.3 ± 0.7 | -0.4 ± 0.9 |
| madmath.Cow 0.1.1 | 8 | 6 | -0.4 ± 0.6 | -0.5 ± 0.8 |
| kjc.Karaykan 1.0 | 8 | 8 | +0.5 ± 1.1 | +0.5 ± 1.1 |
| pac.ABC 2.1 | 8 | 6 | +0.2 ± 0.2 | +0.1 ± 0.2 |
| bk.Shooter 1.0 | 8 | 7 | +0.8 ± 0.7 | +0.7 ± 0.8 |
| McS.Spanky_test 0.1a | 8 | 8 | +0.1 ± 0.2 | +0.1 ± 0.2 |
| All pairs | 312 | 282 | +1.2 ± 0.4 | +1.2 ± 0.4 |

# Bench: rsalesc.mega.Knight 0.6.28 baseline (hadur2.Hadur 3.9) (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.10, 48 cores. robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 3358 over 312 battles (10.8 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | weak | 86.8% ± 2.3 | 96.1% ± 2.2 | 77.8% ± 3.2 | 269 / 280 | 22.8% ± 1.5 | 7.0% ± 1.2 | 92 | 0 | 0.77 / 12.8 |
| apv.TheBrainPi 0.5fix | weak | 74.2% ± 4.9 | 87.5% ± 4.8 | 60.5% ± 4.8 | 245 / 280 | 14.3% ± 0.9 | 6.0% ± 1.1 | 86 | 0 | 1.16 / 21.4 |
| jmcd.BeoWulf 2.8 | weak | 84.2% ± 3.7 | 95.0% ± 4.2 | 73.8% ± 3.3 | 266 / 280 | 17.0% ± 1.1 | 7.1% ± 0.8 | 99 | 0 | 0.98 / 18.5 |
| DM.Mijit .3 | weak | 89.7% ± 2.2 | 98.9% ± 1.8 | 79.7% ± 2.8 | 277 / 280 | 19.1% ± 0.9 | 5.6% ± 0.6 | 87 | 0 | 0.82 / 13.1 |
| nan.Ihivatar_Mk_1 1.0 | weak | 90.3% ± 2.7 | 99.6% ± 0.8 | 77.1% ± 4.3 | 279 / 280 | 14.2% ± 0.5 | 2.8% ± 0.7 | 87 | 0 | 0.83 / 16.5 |
| jab.micro.Sanguijuela 0.8 | weak | 70.0% ± 3.0 | 95.6% ± 2.9 | 61.5% ± 1.3 | 268 / 280 | 74.7% ± 2.9 | 51.2% ± 4.1 | 71 | 0 | 0.54 / 32.8 |
| serenity.moonlightBat 1.17 | weak | 96.3% ± 1.3 | 99.3% ± 1.1 | 93.1% ± 1.6 | 278 / 280 | 16.4% ± 0.6 | 2.7% ± 0.6 | 80 | 0 | 0.83 / 17.0 |
| myl.nano.Kakuru 1.20 | weak | 78.5% ± 4.0 | 93.2% ± 3.6 | 62.9% ± 5.0 | 261 / 280 | 15.9% ± 1.4 | 6.3% ± 0.5 | 82 | 0 | 0.89 / 13.7 |
| mcb.Audace 1.3 | weak | 93.6% ± 2.5 | 100.0% ± 0.0 | 87.9% ± 4.2 | 280 / 280 | 37.6% ± 0.6 | 4.7% ± 1.9 | 81 | 0 | 0.99 / 14.3 |
| suh.micro.WallPM 1.00 | weak | 81.3% ± 3.8 | 90.4% ± 4.6 | 73.2% ± 3.7 | 253 / 280 | 20.1% ± 1.2 | 9.6% ± 1.0 | 114 | 0 | 1.12 / 16.3 |
| fm.claire 1.7 | weak | 92.0% ± 1.5 | 98.9% ± 1.2 | 81.0% ± 2.5 | 277 / 280 | 14.8% ± 0.9 | 2.5% ± 0.3 | 79 | 0 | 0.68 / 13.6 |
| dmh.robocode.robot.GreenDragon 1.0 | weak | 90.1% ± 1.9 | 99.6% ± 0.8 | 79.1% ± 3.4 | 279 / 280 | 16.5% ± 0.5 | 4.4% ± 0.8 | 107 | 0 | 0.93 / 14.7 |
| oog.melee.Mercutio 1.0 | weak | 96.1% ± 1.3 | 99.6% ± 0.8 | 92.7% ± 1.9 | 279 / 280 | 21.9% ± 1.2 | 4.1% ± 0.8 | 91 | 0 | 0.85 / 15.0 |
| js.PinBall 1.6 | weak | 93.9% ± 3.1 | 98.6% ± 1.8 | 89.7% ± 4.4 | 276 / 280 | 26.9% ± 1.0 | 4.9% ± 2.7 | 80 | 0 | 0.81 / 17.6 |
| EH.Fusion 0.32 | weak | 81.3% ± 1.8 | 98.6% ± 1.8 | 72.4% ± 2.3 | 276 / 280 | 64.3% ± 2.1 | 23.3% ± 2.7 | 84 | 0 | 0.71 / 10.5 |
| ratosh.Wesco 1.4 | weak | 97.8% ± 0.7 | 100.0% ± 0.0 | 94.5% ± 2.1 | 280 / 280 | 15.7% ± 0.9 | 1.1% ± 0.4 | 90 | 0 | 0.69 / 18.2 |
| xander.cat.Spitfire 1.4 | weak | 100.0% ± 0.0 | 100.0% ± 0.0 | 100.0% ± 0.0 | 280 / 280 | 64.7% ± 2.2 | 0.3% ± 0.3 | 84 | 0 | 0.59 / 11.0 |
| marksteam.Phoenix 1.0 | weak | 93.9% ± 1.7 | 99.6% ± 0.8 | 87.6% ± 3.1 | 279 / 280 | 20.9% ± 1.7 | 3.2% ± 0.7 | 83 | 0 | 0.76 / 17.1 |
| ndn.DyslexicMonkey 1.1 | weak | 93.8% ± 3.4 | 98.2% ± 2.6 | 89.5% ± 3.9 | 275 / 280 | 22.7% ± 0.9 | 3.9% ± 1.8 | 87 | 0 | 0.76 / 12.8 |
| supersample.SuperCorners 1.0 | weak | 90.0% ± 1.8 | 96.1% ± 2.2 | 85.7% ± 2.4 | 269 / 280 | 38.8% ± 2.8 | 7.8% ± 1.6 | 80 | 0 | 0.81 / 11.7 |
| bots.UnterExBot 1.0 | weak | 98.6% ± 0.6 | 100.0% ± 0.0 | 97.1% ± 1.2 | 280 / 280 | 23.4% ± 0.9 | 1.8% ± 0.4 | 88 | 0 | 0.65 / 40.7 |
| hlavko.nano.Ringo 2.0 | weak | 97.6% ± 1.3 | 100.0% ± 0.0 | 95.1% ± 2.5 | 280 / 280 | 23.3% ± 1.9 | 1.1% ± 0.5 | 77 | 0 | 0.71 / 16.0 |
| dsw.StaticD 1.0 | weak | 99.0% ± 0.3 | 100.0% ± 0.0 | 98.1% ± 0.6 | 280 / 280 | 28.0% ± 0.9 | 1.6% ± 0.6 | 86 | 0 | 0.66 / 11.8 |
| sul.BlueBot 1.0 | weak | 99.5% ± 0.2 | 100.0% ± 0.0 | 99.0% ± 0.3 | 280 / 280 | 48.1% ± 0.8 | 0.7% ± 0.1 | 86 | 0 | 0.59 / 9.3 |
| hapiel.Spiral 0.1 | weak | 95.7% ± 0.7 | 99.3% ± 1.1 | 92.3% ± 1.4 | 278 / 280 | 22.3% ± 1.6 | 5.9% ± 0.9 | 84 | 0 | 0.73 / 15.4 |
| Lo_Ian.Gandalf_V4 4.0 | weak | 98.4% ± 0.6 | 99.6% ± 0.8 | 97.5% ± 0.7 | 279 / 280 | 38.9% ± 1.9 | 2.1% ± 0.6 | 83 | 0 | 0.57 / 11.1 |
| e32.Omni 0.06 | weak | n/a | n/a | n/a | 0 / 0 | - | - | 0 | 0 | 0.00 / 0.0 | 8 battle(s) failed
| suh.nano.CrossC 1.00 | weak | 97.9% ± 0.6 | 100.0% ± 0.0 | 96.0% ± 1.1 | 280 / 280 | 35.3% ± 1.1 | 2.7% ± 0.8 | 82 | 0 | 0.76 / 11.8 |
| hirataatsushi.Trinity 0.003 | weak | 95.1% ± 0.9 | 100.0% ± 0.0 | 91.3% ± 1.5 | 280 / 280 | 46.9% ± 2.3 | 10.6% ± 1.5 | 82 | 0 | 0.65 / 11.7 |
| adt.Ar2 1.0 | weak | 94.4% ± 1.1 | 100.0% ± 0.0 | 89.1% ± 1.9 | 280 / 280 | 32.8% ± 1.5 | 4.6% ± 1.5 | 91 | 0 | 0.73 / 11.8 |
| yk.JahMicro 1.0 | weak | 93.4% ± 1.3 | 98.6% ± 1.3 | 88.9% ± 2.1 | 276 / 280 | 23.1% ± 2.3 | 6.5% ± 1.2 | 89 | 0 | 0.74 / 15.0 |
| uccc.MilkyWay 1.01 | weak | 97.3% ± 0.8 | 99.6% ± 0.8 | 95.5% ± 1.0 | 279 / 280 | 32.1% ± 1.6 | 4.8% ± 1.2 | 83 | 0 | 0.67 / 17.0 |
| amk.superstrike.SuperStrike 0.3 | weak | 96.8% ± 0.7 | 100.0% ± 0.0 | 93.6% ± 1.4 | 280 / 280 | 27.9% ± 1.1 | 2.6% ± 0.7 | 90 | 0 | 0.78 / 10.9 |
| omens.CannonfodderNano 1.4 | weak | 97.1% ± 0.6 | 100.0% ± 0.0 | 94.6% ± 1.0 | 280 / 280 | 32.5% ± 1.5 | 4.6% ± 0.8 | 88 | 0 | 0.69 / 12.1 |
| AD.CodaFirst 1.1 | weak | 99.4% ± 0.3 | 100.0% ± 0.0 | 98.7% ± 0.5 | 280 / 280 | 49.9% ± 3.4 | 1.1% ± 1.0 | 79 | 0 | 0.59 / 10.0 |
| madmath.Cow 0.1.1 | weak | 97.2% ± 0.8 | 100.0% ± 0.0 | 94.7% ± 1.4 | 280 / 280 | 43.3% ± 1.1 | 3.4% ± 1.0 | 90 | 0 | 0.70 / 10.4 |
| kjc.Karaykan 1.0 | weak | 94.6% ± 1.3 | 99.3% ± 1.1 | 90.6% ± 1.7 | 278 / 280 | 48.7% ± 2.2 | 6.3% ± 1.0 | 84 | 0 | 0.71 / 11.5 |
| pac.ABC 2.1 | weak | 99.6% ± 0.1 | 100.0% ± 0.0 | 99.3% ± 0.3 | 280 / 280 | 40.2% ± 1.6 | 2.5% ± 1.1 | 92 | 0 | 0.54 / 11.1 |
| bk.Shooter 1.0 | weak | 98.3% ± 0.3 | 100.0% ± 0.0 | 96.8% ± 0.5 | 280 / 280 | 28.3% ± 0.9 | 2.4% ± 0.5 | 83 | 0 | 0.65 / 12.3 |
| McS.Spanky_test 0.1a | weak | 99.9% ± 0.2 | 100.0% ± 0.0 | 99.8% ± 0.3 | 280 / 280 | 33.2% ± 0.7 | 1.0% ± 1.4 | 77 | 0 | 0.58 / 10.0 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 8 | 681 | 10.1% | 86.1% | 0.0% | 3.8% | 526 |
| apv.TheBrainPi 0.5fix | 8 | 1198 | 18.3% | 73.1% | 0.0% | 8.6% | 608 |
| jmcd.BeoWulf 2.8 | 8 | 804 | 10.9% | 84.7% | 0.0% | 4.4% | 717 |
| DM.Mijit .3 | 8 | 492 | 3.8% | 94.5% | 0.0% | 1.7% | 522 |
| nan.Ihivatar_Mk_1 1.0 | 8 | 394 | 1.6% | 97.6% | 0.0% | 0.8% | 559 |
| jab.micro.Sanguijuela 0.8 | 8 | 2821 | 2.7% | 79.6% | 15.7% | 2.0% | 299 |
| serenity.moonlightBat 1.17 | 8 | 184 | 6.8% | 90.7% | 0.0% | 2.5% | 767 |
| myl.nano.Kakuru 1.20 | 8 | 977 | 12.2% | 82.1% | 0.0% | 5.8% | 534 |
| mcb.Audace 1.3 | 8 | 353 | 0.0% | 100.0% | 0.0% | 0.0% | 359 |
| suh.micro.WallPM 1.00 | 8 | 1014 | 16.6% | 76.4% | 0.1% | 6.9% | 692 |
| fm.claire 1.7 | 8 | 306 | 6.1% | 91.4% | 0.0% | 2.5% | 507 |
| dmh.robocode.robot.GreenDragon 1.0 | 8 | 452 | 1.4% | 98.1% | 0.0% | 0.6% | 563 |
| oog.melee.Mercutio 1.0 | 8 | 210 | 3.0% | 95.8% | 0.0% | 1.2% | 558 |
| js.PinBall 1.6 | 8 | 333 | 7.5% | 87.5% | 1.2% | 3.8% | 450 |
| EH.Fusion 0.32 | 8 | 1350 | 1.9% | 87.2% | 9.5% | 1.4% | 306 |
| ratosh.Wesco 1.4 | 8 | 86 | 0.0% | 96.1% | 3.9% | 0.0% | 522 |
| xander.cat.Spitfire 1.4 | 8 | 1 | 0.0% | 100.0% | 0.0% | 0.0% | 322 |
| marksteam.Phoenix 1.0 | 8 | 288 | 2.2% | 96.9% | 0.0% | 1.0% | 488 |
| ndn.DyslexicMonkey 1.1 | 8 | 317 | 9.8% | 83.2% | 2.2% | 4.8% | 493 |
| supersample.SuperCorners 1.0 | 8 | 564 | 12.2% | 74.6% | 7.5% | 5.7% | 391 |
| bots.UnterExBot 1.0 | 8 | 72 | 0.0% | 99.7% | 0.3% | 0.0% | 469 |
| hlavko.nano.Ringo 2.0 | 8 | 107 | 0.0% | 90.8% | 9.2% | 0.0% | 432 |
| dsw.StaticD 1.0 | 8 | 54 | 0.0% | 100.0% | 0.0% | 0.0% | 454 |
| sul.BlueBot 1.0 | 8 | 27 | 0.0% | 100.0% | 0.0% | 0.0% | 331 |
| hapiel.Spiral 0.1 | 8 | 237 | 5.3% | 93.0% | 0.3% | 1.4% | 555 |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 89 | 7.0% | 81.9% | 7.7% | 3.4% | 396 |
| e32.Omni 0.06 | 0 | - | - | - | - | - | - |
| suh.nano.CrossC 1.00 | 8 | 115 | 0.0% | 100.0% | 0.0% | 0.0% | 387 |
| hirataatsushi.Trinity 0.003 | 8 | 296 | 0.0% | 96.5% | 3.5% | 0.0% | 362 |
| adt.Ar2 1.0 | 8 | 297 | 0.0% | 99.0% | 1.0% | 0.0% | 377 |
| yk.JahMicro 1.0 | 8 | 383 | 6.5% | 89.9% | 1.9% | 1.6% | 593 |
| uccc.MilkyWay 1.01 | 8 | 152 | 4.1% | 90.3% | 4.4% | 1.2% | 459 |
| amk.superstrike.SuperStrike 0.3 | 8 | 162 | 0.0% | 99.9% | 0.1% | 0.0% | 429 |
| omens.CannonfodderNano 1.4 | 8 | 169 | 0.0% | 99.5% | 0.5% | 0.0% | 442 |
| AD.CodaFirst 1.1 | 8 | 35 | 0.0% | 100.0% | 0.0% | 0.0% | 338 |
| madmath.Cow 0.1.1 | 8 | 156 | 0.0% | 99.5% | 0.5% | 0.0% | 362 |
| kjc.Karaykan 1.0 | 8 | 310 | 4.0% | 94.2% | 0.0% | 1.7% | 353 |
| pac.ABC 2.1 | 8 | 24 | 0.0% | 99.5% | 0.5% | 0.0% | 439 |
| bk.Shooter 1.0 | 8 | 95 | 0.0% | 100.0% | 0.0% | 0.0% | 459 |
| McS.Spanky_test 0.1a | 8 | 8 | 0.0% | 89.2% | 10.8% | 0.0% | 456 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 8 | 5 | 1192 | 0 | 0.33 | 0 | 0 | 0 |
| apv.TheBrainPi 0.5fix | 8 | 5 | 298 | 0 | 0.31 | 2 | 2 | 8 |
| jmcd.BeoWulf 2.8 | 8 | 8 | 0 | 0 | 0.35 | 0 | 0 | 0 |
| DM.Mijit .3 | 8 | 7 | 298 | 0 | 0.31 | 0 | 0 | 0 |
| nan.Ihivatar_Mk_1 1.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 8 | 6 | 82 | 0 | 0.25 | 1 | 1 | 0 |
| serenity.moonlightBat 1.17 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| myl.nano.Kakuru 1.20 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| mcb.Audace 1.3 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| suh.micro.WallPM 1.00 | 8 | 7 | 298 | 0 | 0.41 | 0 | 0 | 0 |
| fm.claire 1.7 | 8 | 8 | 0 | 0 | 0.28 | 0 | 0 | 0 |
| dmh.robocode.robot.GreenDragon 1.0 | 8 | 7 | 298 | 0 | 0.38 | 0 | 0 | 0 |
| oog.melee.Mercutio 1.0 | 8 | 8 | 0 | 0 | 0.33 | 0 | 0 | 0 |
| js.PinBall 1.6 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| EH.Fusion 0.32 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| ratosh.Wesco 1.4 | 8 | 6 | 596 | 0 | 0.32 | 0 | 0 | 0 |
| xander.cat.Spitfire 1.4 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| marksteam.Phoenix 1.0 | 8 | 7 | 298 | 0 | 0.30 | 0 | 0 | 0 |
| ndn.DyslexicMonkey 1.1 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| supersample.SuperCorners 1.0 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| bots.UnterExBot 1.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| hlavko.nano.Ringo 2.0 | 8 | 8 | 0 | 0 | 0.28 | 0 | 0 | 0 |
| dsw.StaticD 1.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| sul.BlueBot 1.0 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| hapiel.Spiral 0.1 | 8 | 7 | 298 | 0 | 0.30 | 0 | 0 | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 6 | 596 | 0 | 0.30 | 0 | 0 | 0 |
| e32.Omni 0.06 | 8 | 0 | 0 | 0 | 0.00 | 0 | 0 | 0 |
| suh.nano.CrossC 1.00 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| hirataatsushi.Trinity 0.003 | 8 | 8 | 0 | 0 | 0.29 | 0 | 0 | 0 |
| adt.Ar2 1.0 | 8 | 6 | 596 | 0 | 0.33 | 0 | 0 | 0 |
| yk.JahMicro 1.0 | 8 | 6 | 596 | 0 | 0.32 | 0 | 0 | 0 |
| uccc.MilkyWay 1.01 | 8 | 6 | 596 | 0 | 0.30 | 0 | 0 | 0 |
| amk.superstrike.SuperStrike 0.3 | 8 | 7 | 298 | 0 | 0.32 | 0 | 0 | 0 |
| omens.CannonfodderNano 1.4 | 8 | 8 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| AD.CodaFirst 1.1 | 8 | 7 | 145 | 0 | 0.28 | 0 | 0 | 0 |
| madmath.Cow 0.1.1 | 8 | 6 | 596 | 0 | 0.32 | 0 | 0 | 0 |
| kjc.Karaykan 1.0 | 8 | 8 | 0 | 0 | 0.30 | 0 | 0 | 0 |
| pac.ABC 2.1 | 8 | 6 | 597 | 0 | 0.33 | 0 | 0 | 0 |
| bk.Shooter 1.0 | 8 | 7 | 298 | 0 | 0.30 | 0 | 0 | 0 |
| McS.Spanky_test 0.1a | 8 | 8 | 0 | 0 | 0.28 | 0 | 0 | 0 |

282 of 320 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 6862 | 16 | 6782 | 6773 (98.7%) | 89 (1.3%) | 9 (0.1%) | 287 | 129 | 19 |
| apv.TheBrainPi 0.5fix | 7531 | 13 | 7511 | 7511 (99.7%) | 20 (0.3%) | 0 (0.0%) | 259 | 101 | 25 |
| jmcd.BeoWulf 2.8 | 11085 | 85 | 11076 | 11074 (99.9%) | 11 (0.1%) | 2 (0.0%) | 597 | 193 | 26 |
| DM.Mijit .3 | 6674 | 15 | 6707 | 6630 (99.3%) | 44 (0.7%) | 77 (1.1%) | 1015 | 172 | 17 |
| nan.Ihivatar_Mk_1 1.0 | 6632 | 10 | 6632 | 6632 (100.0%) | 0 (0.0%) | 0 (0.0%) | 87 | 79 | 22 |
| jab.micro.Sanguijuela 0.8 | 2162 | 18 | 2158 | 2156 (99.7%) | 6 (0.3%) | 2 (0.1%) | 2459 | 258 | 18 |
| serenity.moonlightBat 1.17 | 11672 | 11 | 11719 | 11672 (100.0%) | 0 (0.0%) | 47 (0.4%) | 313 | 147 | 16 |
| myl.nano.Kakuru 1.20 | 6070 | 19 | 6075 | 6067 (100.0%) | 3 (0.0%) | 8 (0.1%) | 870 | 130 | 21 |
| mcb.Audace 1.3 | 3275 | 5 | 3275 | 3275 (100.0%) | 0 (0.0%) | 0 (0.0%) | 6 | 69 | 16 |
| suh.micro.WallPM 1.00 | 11113 | 44 | 11096 | 11082 (99.7%) | 31 (0.3%) | 14 (0.1%) | 885 | 202 | 47 |
| fm.claire 1.7 | 5695 | 17 | 5741 | 5687 (99.9%) | 8 (0.1%) | 54 (0.9%) | 1041 | 125 | 19 |
| dmh.robocode.robot.GreenDragon 1.0 | 7629 | 28 | 7649 | 7586 (99.4%) | 43 (0.6%) | 63 (0.8%) | 649 | 159 | 38 |
| oog.melee.Mercutio 1.0 | 7433 | 30 | 7436 | 7433 (100.0%) | 0 (0.0%) | 3 (0.0%) | 92 | 121 | 33 |
| js.PinBall 1.6 | 5718 | 24 | 5764 | 5702 (99.7%) | 16 (0.3%) | 62 (1.1%) | 554 | 159 | 20 |
| EH.Fusion 0.32 | 2344 | 17 | 2345 | 2344 (100.0%) | 0 (0.0%) | 1 (0.0%) | 1001 | 187 | 19 |
| ratosh.Wesco 1.4 | 6238 | 27 | 6216 | 6200 (99.4%) | 38 (0.6%) | 16 (0.3%) | 195 | 73 | 26 |
| xander.cat.Spitfire 1.4 | 2610 | 46 | 2610 | 2610 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 146 | 18 |
| marksteam.Phoenix 1.0 | 5640 | 20 | 5648 | 5617 (99.6%) | 23 (0.4%) | 31 (0.5%) | 183 | 89 | 18 |
| ndn.DyslexicMonkey 1.1 | 6220 | 23 | 6221 | 6216 (99.9%) | 4 (0.1%) | 5 (0.1%) | 200 | 119 | 22 |
| supersample.SuperCorners 1.0 | 4112 | 28 | 4114 | 4110 (100.0%) | 2 (0.0%) | 4 (0.1%) | 353 | 108 | 17 |
| bots.UnterExBot 1.0 | 6081 | 21 | 6087 | 6075 (99.9%) | 6 (0.1%) | 12 (0.2%) | 217 | 108 | 23 |
| hlavko.nano.Ringo 2.0 | 4669 | 29 | 5188 | 4640 (99.4%) | 29 (0.6%) | 548 (10.6%) | 106 | 92 | 17 |
| dsw.StaticD 1.0 | 5966 | 27 | 5970 | 5965 (100.0%) | 1 (0.0%) | 5 (0.1%) | 149 | 105 | 20 |
| sul.BlueBot 1.0 | 3107 | 14 | 3107 | 3107 (100.0%) | 0 (0.0%) | 0 (0.0%) | 5 | 107 | 18 |
| hapiel.Spiral 0.1 | 8656 | 30 | 8637 | 8623 (99.6%) | 33 (0.4%) | 14 (0.2%) | 563 | 202 | 17 |
| Lo_Ian.Gandalf_V4 4.0 | 1674 | 8 | 1652 | 1651 (98.6%) | 23 (1.4%) | 1 (0.1%) | 351 | 50 | 21 |
| e32.Omni 0.06 | 0 | 0 | 0 | - | - | - | 0 | 0 | 0 |
| suh.nano.CrossC 1.00 | 4345 | 22 | 4347 | 4342 (99.9%) | 3 (0.1%) | 5 (0.1%) | 127 | 119 | 22 |
| hirataatsushi.Trinity 0.003 | 3983 | 27 | 3984 | 3983 (100.0%) | 0 (0.0%) | 1 (0.0%) | 512 | 160 | 18 |
| adt.Ar2 1.0 | 3634 | 25 | 3609 | 3598 (99.0%) | 36 (1.0%) | 11 (0.3%) | 112 | 81 | 27 |
| yk.JahMicro 1.0 | 5478 | 7 | 5535 | 5445 (99.4%) | 33 (0.6%) | 90 (1.6%) | 379 | 110 | 27 |
| uccc.MilkyWay 1.01 | 5637 | 24 | 5594 | 5594 (99.2%) | 43 (0.8%) | 0 (0.0%) | 111 | 106 | 26 |
| amk.superstrike.SuperStrike 0.3 | 4732 | 20 | 4722 | 4706 (99.5%) | 26 (0.5%) | 16 (0.3%) | 299 | 90 | 25 |
| omens.CannonfodderNano 1.4 | 4682 | 15 | 4695 | 4680 (100.0%) | 2 (0.0%) | 15 (0.3%) | 72 | 91 | 17 |
| AD.CodaFirst 1.1 | 2063 | 16 | 2052 | 2052 (99.5%) | 11 (0.5%) | 0 (0.0%) | 45 | 61 | 16 |
| madmath.Cow 0.1.1 | 2211 | 15 | 2211 | 2185 (98.8%) | 26 (1.2%) | 26 (1.2%) | 95 | 79 | 20 |
| kjc.Karaykan 1.0 | 3275 | 18 | 3276 | 3275 (100.0%) | 0 (0.0%) | 1 (0.0%) | 166 | 115 | 22 |
| pac.ABC 2.1 | 719 | 4 | 710 | 710 (98.7%) | 9 (1.3%) | 0 (0.0%) | 6 | 20 | 24 |
| bk.Shooter 1.0 | 2721 | 14 | 2710 | 2710 (99.6%) | 11 (0.4%) | 0 (0.0%) | 4 | 65 | 22 |
| McS.Spanky_test 0.1a | 1317 | 2 | 1317 | 1317 (100.0%) | 0 (0.0%) | 0 (0.0%) | 33 | 25 | 20 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 6683 | 523 (7.8%) | 3716 |
| apv.TheBrainPi 0.5fix | 8814 | 722 (8.2%) | 5276 |
| jmcd.BeoWulf 2.8 | 11000 | 856 (7.8%) | 6650 |
| DM.Mijit .3 | 6615 | 901 (13.6%) | 5300 |
| nan.Ihivatar_Mk_1 1.0 | 7664 | 665 (8.7%) | 4753 |
| jab.micro.Sanguijuela 0.8 | 2293 | 132 (5.8%) | 345 |
| serenity.moonlightBat 1.17 | 11912 | 1088 (9.1%) | 9205 |
| myl.nano.Kakuru 1.20 | 7193 | 376 (5.2%) | 1004 |
| mcb.Audace 1.3 | 3401 | 150 (4.4%) | 0 |
| suh.micro.WallPM 1.00 | 10542 | 719 (6.8%) | 6440 |
| fm.claire 1.7 | 6652 | 494 (7.4%) | 2358 |
| dmh.robocode.robot.GreenDragon 1.0 | 7635 | 600 (7.9%) | 3000 |
| oog.melee.Mercutio 1.0 | 7150 | 620 (8.7%) | 3191 |
| js.PinBall 1.6 | 5033 | 403 (8.0%) | 2419 |
| EH.Fusion 0.32 | 2428 | 52 (2.1%) | 0 |
| ratosh.Wesco 1.4 | 6815 | 293 (4.3%) | 837 |
| xander.cat.Spitfire 1.4 | 2735 | 170 (6.2%) | 1304 |
| marksteam.Phoenix 1.0 | 6036 | 274 (4.5%) | 0 |
| ndn.DyslexicMonkey 1.1 | 5958 | 360 (6.0%) | 2487 |
| supersample.SuperCorners 1.0 | 3937 | 185 (4.7%) | 447 |
| bots.UnterExBot 1.0 | 5362 | 289 (5.4%) | 0 |
| hlavko.nano.Ringo 2.0 | 4824 | 305 (6.3%) | 1872 |
| dsw.StaticD 1.0 | 5085 | 337 (6.6%) | 783 |
| sul.BlueBot 1.0 | 2907 | 276 (9.5%) | 583 |
| hapiel.Spiral 0.1 | 7087 | 356 (5.0%) | 814 |
| Lo_Ian.Gandalf_V4 4.0 | 4063 | 173 (4.3%) | 0 |
| e32.Omni 0.06 | 0 | - | 0 |
| suh.nano.CrossC 1.00 | 3896 | 203 (5.2%) | 485 |
| hirataatsushi.Trinity 0.003 | 3380 | 371 (11.0%) | 1607 |
| adt.Ar2 1.0 | 3690 | 298 (8.1%) | 800 |
| yk.JahMicro 1.0 | 7845 | 394 (5.0%) | 1736 |
| uccc.MilkyWay 1.01 | 5174 | 461 (8.9%) | 3252 |
| amk.superstrike.SuperStrike 0.3 | 4667 | 178 (3.8%) | 163 |
| omens.CannonfodderNano 1.4 | 4860 | 288 (5.9%) | 941 |
| AD.CodaFirst 1.1 | 3000 | 61 (2.0%) | 0 |
| madmath.Cow 0.1.1 | 3436 | 114 (3.3%) | 0 |
| kjc.Karaykan 1.0 | 3258 | 148 (4.5%) | 399 |
| pac.ABC 2.1 | 4953 | 32 (0.6%) | 0 |
| bk.Shooter 1.0 | 5176 | 104 (2.0%) | 1208 |
| McS.Spanky_test 0.1a | 5151 | 65 (1.3%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 650 | 307 | 413 | 376 | 58.0 / 16.7 | 2495 | 4033 | 192 |
| apv.TheBrainPi 0.5fix | 650 | 441 | 528 | 456 | 38.0 / 25.0 | 1156 | 6823 | 29 |
| jmcd.BeoWulf 2.8 | 650 | 442 | 441 | 567 | 54.7 / 19.4 | 2874 | 4254 | 106 |
| DM.Mijit .3 | 650 | 430 | 425 | 372 | 52.3 / 13.3 | 2608 | 4767 | 1284 |
| nan.Ihivatar_Mk_1 1.0 | 650 | 395 | 413 | 409 | 36.0 / 11.0 | 1034 | 7345 | 3648 |
| jab.micro.Sanguijuela 0.8 | 650 | 150 | 650 | 149 | 102.4 / 64.2 | 2078 | 2535 | 56 |
| serenity.moonlightBat 1.17 | 650 | 459 | 400 | 617 | 64.0 / 4.8 | 2532 | 3851 | 34 |
| myl.nano.Kakuru 1.20 | 650 | 481 | 544 | 384 | 38.8 / 22.9 | 1416 | 5525 | 4317 |
| mcb.Audace 1.3 | 650 | 254 | 400 | 209 | 70.5 / 10.1 | 2481 | 4776 | 621 |
| suh.micro.WallPM 1.00 | 650 | 484 | 472 | 542 | 60.3 / 22.1 | 3938 | 3614 | 603 |
| fm.claire 1.7 | 650 | 478 | 413 | 357 | 34.1 / 8.0 | 901 | 7600 | 4176 |
| dmh.robocode.robot.GreenDragon 1.0 | 650 | 527 | 463 | 413 | 47.5 / 12.7 | 1987 | 5914 | 2800 |
| oog.melee.Mercutio 1.0 | 650 | 443 | 400 | 408 | 72.5 / 5.8 | 4430 | 3624 | 1213 |
| js.PinBall 1.6 | 650 | 360 | 431 | 300 | 69.1 / 8.3 | 3617 | 3541 | 1050 |
| EH.Fusion 0.32 | 650 | 292 | 406 | 156 | 87.3 / 33.6 | 1885 | 3392 | 254 |
| ratosh.Wesco 1.4 | 650 | 407 | 400 | 372 | 41.1 / 2.4 | 962 | 7942 | 169 |
| xander.cat.Spitfire 1.4 | 650 | 391 | 400 | 172 | 98.0 / 0.0 | 2113 | 1306 | 4 |
| marksteam.Phoenix 1.0 | 650 | 414 | 400 | 338 | 56.0 / 8.0 | 2730 | 6188 | 217 |
| ndn.DyslexicMonkey 1.1 | 650 | 389 | 400 | 343 | 63.7 / 7.5 | 3701 | 4410 | 1435 |
| supersample.SuperCorners 1.0 | 650 | 273 | 400 | 241 | 71.8 / 12.0 | 2954 | 2595 | 69 |
| bots.UnterExBot 1.0 | 650 | 321 | 400 | 319 | 67.1 / 2.1 | 3773 | 3707 | 173 |
| hlavko.nano.Ringo 2.0 | 650 | 473 | 400 | 282 | 53.3 / 2.8 | 2741 | 4342 | 522 |
| dsw.StaticD 1.0 | 650 | 387 | 400 | 304 | 77.5 / 1.5 | 3842 | 3166 | 829 |
| sul.BlueBot 1.0 | 650 | 401 | 400 | 181 | 78.2 / 0.8 | 2098 | 2367 | 1108 |
| hapiel.Spiral 0.1 | 650 | 360 | 400 | 405 | 75.3 / 6.3 | 4515 | 3911 | 435 |
| Lo_Ian.Gandalf_V4 4.0 | 650 | 312 | 400 | 246 | 81.2 / 2.1 | 2595 | 1809 | 36 |
| e32.Omni 0.06 | - | - | - | - | - | 0 | 0 | 0 |
| suh.nano.CrossC 1.00 | 650 | 395 | 400 | 237 | 77.1 / 3.3 | 2829 | 2935 | 946 |
| hirataatsushi.Trinity 0.003 | 650 | 278 | 400 | 212 | 85.6 / 8.2 | 2639 | 2555 | 382 |
| adt.Ar2 1.0 | 650 | 311 | 400 | 227 | 68.2 / 8.4 | 2780 | 3555 | 56 |
| yk.JahMicro 1.0 | 650 | 393 | 400 | 443 | 78.3 / 9.8 | 4799 | 1614 | 51 |
| uccc.MilkyWay 1.01 | 650 | 379 | 400 | 309 | 82.5 / 3.9 | 3816 | 2714 | 642 |
| amk.superstrike.SuperStrike 0.3 | 650 | 386 | 400 | 279 | 67.0 / 4.6 | 3342 | 4131 | 1000 |
| omens.CannonfodderNano 1.4 | 650 | 374 | 400 | 292 | 83.6 / 4.8 | 3696 | 2897 | 484 |
| AD.CodaFirst 1.1 | 650 | 289 | 400 | 188 | 78.4 / 1.0 | 2122 | 3951 | 1080 |
| madmath.Cow 0.1.1 | 650 | 385 | 400 | 212 | 78.6 / 4.4 | 2466 | 2494 | 939 |
| kjc.Karaykan 1.0 | 650 | 417 | 400 | 203 | 79.8 / 8.3 | 2331 | 2210 | 752 |
| pac.ABC 2.1 | 650 | 400 | 400 | 289 | 95.5 / 0.7 | 2503 | 524 | 116 |
| bk.Shooter 1.0 | 650 | 419 | 400 | 309 | 82.1 / 2.7 | 3919 | 1782 | 484 |
| McS.Spanky_test 0.1a | 650 | 396 | 400 | 306 | 95.3 / 0.2 | 3757 | 583 | 268 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| ers.nano.lig.LigMA 1.9 | 7.0% | 92 | 38 | 3 | 24.0 | 518 / 523 (99%) | 0 | 0 |
| apv.TheBrainPi 0.5fix | 6.0% | 86 | 4374 | 3 | 26.5 | 722 / 722 (100%) | 0 | 0 |
| jmcd.BeoWulf 2.8 | 7.1% | 99 | 66 | 3 | 39.5 | 856 / 856 (100%) | 0 | 0 |
| DM.Mijit .3 | 5.6% | 87 | 44 | 3 | 23.9 | 896 / 901 (99%) | 0 | 0 |
| nan.Ihivatar_Mk_1 1.0 | 2.8% | 87 | 49 | 3 | 23.7 | 665 / 665 (100%) | 0 | 0 |
| jab.micro.Sanguijuela 0.8 | 51.2% | 71 | 23 | 3 | 7.5 | 132 / 132 (100%) | 0 | 0 |
| serenity.moonlightBat 1.17 | 2.7% | 80 | 57 | 3 | 41.9 | 1088 / 1088 (100%) | 0 | 0 |
| myl.nano.Kakuru 1.20 | 6.3% | 82 | 51 | 3 | 21.7 | 376 / 376 (100%) | 0 | 0 |
| mcb.Audace 1.3 | 4.7% | 81 | 43 | 3 | 11.7 | 150 / 150 (100%) | 0 | 0 |
| suh.micro.WallPM 1.00 | 9.6% | 114 | 1994 | 3 | 39.6 | 715 / 719 (99%) | 0 | 0 |
| fm.claire 1.7 | 2.5% | 79 | 39 | 3 | 20.5 | 493 / 494 (100%) | 0 | 0 |
| dmh.robocode.robot.GreenDragon 1.0 | 4.4% | 107 | 330 | 3 | 27.3 | 593 / 600 (99%) | 0 | 0 |
| oog.melee.Mercutio 1.0 | 4.1% | 91 | 62 | 3 | 26.6 | 618 / 620 (100%) | 0 | 0 |
| js.PinBall 1.6 | 4.9% | 80 | 40 | 3 | 20.5 | 400 / 403 (99%) | 0 | 0 |
| EH.Fusion 0.32 | 23.3% | 84 | 40 | 3 | 8.2 | 52 / 52 (100%) | 0 | 0 |
| ratosh.Wesco 1.4 | 1.1% | 90 | 887 | 3 | 22.2 | 292 / 293 (100%) | 0 | 0 |
| xander.cat.Spitfire 1.4 | 0.3% | 84 | 28 | 3 | 9.3 | 170 / 170 (100%) | 0 | 0 |
| marksteam.Phoenix 1.0 | 3.2% | 83 | 41 | 3 | 20.1 | 274 / 274 (100%) | 0 | 0 |
| ndn.DyslexicMonkey 1.1 | 3.9% | 87 | 43 | 3 | 22.2 | 360 / 360 (100%) | 0 | 0 |
| supersample.SuperCorners 1.0 | 7.8% | 80 | 29 | 3 | 14.6 | 185 / 185 (100%) | 0 | 0 |
| bots.UnterExBot 1.0 | 1.8% | 88 | 37 | 3 | 21.7 | 289 / 289 (100%) | 0 | 0 |
| hlavko.nano.Ringo 2.0 | 1.1% | 77 | 34 | 3 | 18.5 | 301 / 305 (99%) | 0 | 0 |
| dsw.StaticD 1.0 | 1.6% | 86 | 36 | 3 | 21.3 | 336 / 337 (100%) | 0 | 0 |
| sul.BlueBot 1.0 | 0.7% | 86 | 111 | 3 | 11.1 | 276 / 276 (100%) | 0 | 0 |
| hapiel.Spiral 0.1 | 5.9% | 84 | 46 | 3 | 30.8 | 356 / 356 (100%) | 0 | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 2.1% | 83 | 31 | 3 | 5.9 | 171 / 173 (99%) | 0 | 0 |
| e32.Omni 0.06 | - | 0 | 0 | 0 | - | - | 0 | 0 |
| suh.nano.CrossC 1.00 | 2.7% | 82 | 35 | 3 | 15.5 | 202 / 203 (100%) | 0 | 0 |
| hirataatsushi.Trinity 0.003 | 10.6% | 82 | 32 | 3 | 14.2 | 369 / 371 (99%) | 0 | 0 |
| adt.Ar2 1.0 | 4.6% | 91 | 654 | 3 | 12.9 | 296 / 298 (99%) | 0 | 0 |
| yk.JahMicro 1.0 | 6.5% | 89 | 39 | 3 | 19.7 | 392 / 394 (99%) | 0 | 0 |
| uccc.MilkyWay 1.01 | 4.8% | 83 | 41 | 3 | 19.9 | 461 / 461 (100%) | 0 | 0 |
| amk.superstrike.SuperStrike 0.3 | 2.6% | 90 | 102 | 3 | 16.9 | 178 / 178 (100%) | 0 | 0 |
| omens.CannonfodderNano 1.4 | 4.6% | 88 | 28 | 3 | 16.7 | 288 / 288 (100%) | 0 | 0 |
| AD.CodaFirst 1.1 | 1.1% | 79 | 115 | 3 | 7.3 | 61 / 61 (100%) | 0 | 0 |
| madmath.Cow 0.1.1 | 3.4% | 90 | 857 | 3 | 7.9 | 113 / 114 (99%) | 0 | 0 |
| kjc.Karaykan 1.0 | 6.3% | 84 | 32 | 3 | 11.7 | 148 / 148 (100%) | 0 | 0 |
| pac.ABC 2.1 | 2.5% | 92 | 187 | 3 | 2.5 | 30 / 32 (94%) | 0 | 0 |
| bk.Shooter 1.0 | 2.4% | 83 | 38 | 3 | 9.7 | 104 / 104 (100%) | 0 | 0 |
| McS.Spanky_test 0.1a | 1.0% | 77 | 23 | 3 | 4.7 | 65 / 65 (100%) | 0 | 0 |

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
| AD.CodaFirst 1.1 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 98.4% ± 1.8 | 97.2% ± 3.5 | -1.2 ± 3.4 |
| AD.CodaFirst 1.1 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 94.1% ± 3.1 | 97.7% ± 2.0 | +3.5 ± 3.6 |
| DM.Mijit .3 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 70.7% ± 5.0 | 79.8% ± 3.2 | +9.1 ± 6.6 |
| DM.Mijit .3 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 71.0% ± 6.7 | 81.8% ± 5.0 | +10.7 ± 5.7 |
| EH.Fusion 0.32 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 64.1% ± 4.4 | 78.2% ± 3.4 | +14.1 ± 7.1 |
| EH.Fusion 0.32 | hadur2.Hadur 3.9 | 8 | 92.5% ± 12.4 | 98.8% ± 3.0 | +6.3 ± 13.4 | 59.9% ± 3.5 | 70.2% ± 5.3 | +10.3 ± 6.5 |
| Lo_Ian.Gandalf_V4 4.0 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 91.5% ± 5.5 | 98.0% ± 1.9 | +6.5 ± 6.4 |
| Lo_Ian.Gandalf_V4 4.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 89.1% ± 5.5 | 99.5% ± 0.7 | +10.4 ± 5.4 |
| McS.Spanky_test 0.1a | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 99.9% ± 0.3 | 99.8% ± 0.4 | -0.1 ± 0.5 |
| McS.Spanky_test 0.1a | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 98.9% ± 1.6 | 99.5% ± 0.6 | +0.6 ± 1.6 |
| adt.Ar2 1.0 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 81.0% ± 7.1 | 87.6% ± 4.5 | +6.6 ± 7.2 |
| adt.Ar2 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 82.3% ± 6.4 | 88.1% ± 3.0 | +5.8 ± 5.1 |
| amk.superstrike.SuperStrike 0.3 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 88.5% ± 2.9 | 95.4% ± 4.5 | +6.9 ± 4.8 |
| amk.superstrike.SuperStrike 0.3 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 85.6% ± 2.7 | 94.5% ± 3.0 | +8.9 ± 3.5 |
| apv.TheBrainPi 0.5fix | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 64.2% ± 9.0 | 63.8% ± 4.1 | -0.3 ± 9.7 |
| apv.TheBrainPi 0.5fix | hadur2.Hadur 3.9 | 8 | 85.0% ± 14.8 | 96.3% ± 4.3 | +11.3 ± 17.0 | 57.3% ± 10.7 | 67.8% ± 6.7 | +10.5 ± 11.5 |
| bk.Shooter 1.0 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 95.2% ± 2.4 | 99.6% ± 0.7 | +4.4 ± 2.3 |
| bk.Shooter 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 93.7% ± 2.7 | 97.6% ± 2.5 | +3.9 ± 4.0 |
| bots.UnterExBot 1.0 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 91.5% ± 3.2 | 97.3% ± 1.1 | +5.9 ± 3.4 |
| bots.UnterExBot 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 90.3% ± 3.8 | 99.2% ± 0.7 | +9.0 ± 3.7 |
| dmh.robocode.robot.GreenDragon 1.0 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 76.3% ± 7.8 | 87.6% ± 4.4 | +11.2 ± 10.6 |
| dmh.robocode.robot.GreenDragon 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 66.7% ± 4.9 | 81.9% ± 4.0 | +15.2 ± 6.3 |
| dsw.StaticD 1.0 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 95.2% ± 2.5 | 99.4% ± 0.6 | +4.1 ± 2.5 |
| dsw.StaticD 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 94.6% ± 1.8 | 98.6% ± 0.5 | +4.0 ± 2.1 |
| ers.nano.lig.LigMA 1.9 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 78.7% ± 4.4 | 76.6% ± 4.0 | -2.2 ± 5.0 |
| ers.nano.lig.LigMA 1.9 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 96.3% ± 6.2 | -3.7 ± 6.2 | 78.7% ± 5.2 | 78.5% ± 4.6 | -0.1 ± 1.5 |
| fm.claire 1.7 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 75.0% ± 5.5 | 87.2% ± 6.3 | +12.1 ± 11.3 |
| fm.claire 1.7 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 98.8% ± 3.0 | +3.7 ± 8.9 | 67.5% ± 6.2 | 80.4% ± 7.7 | +12.9 ± 10.1 |
| hapiel.Spiral 0.1 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 90.9% ± 3.0 | 94.2% ± 1.8 | +3.4 ± 3.6 |
| hapiel.Spiral 0.1 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 86.1% ± 3.8 | 94.3% ± 1.8 | +8.2 ± 3.9 |
| hirataatsushi.Trinity 0.003 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 90.2% ± 1.8 | 94.2% ± 1.7 | +4.0 ± 2.5 |
| hirataatsushi.Trinity 0.003 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 86.9% ± 3.2 | 94.1% ± 2.3 | +7.2 ± 3.8 |
| hlavko.nano.Ringo 2.0 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 93.8% ± 4.4 | 96.2% ± 2.1 | +2.4 ± 5.3 |
| hlavko.nano.Ringo 2.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 94.8% ± 5.6 | 95.5% ± 3.2 | +0.8 ± 7.0 |
| jab.micro.Sanguijuela 0.8 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 66.3% ± 1.5 | 67.0% ± 2.4 | +0.8 ± 2.5 |
| jab.micro.Sanguijuela 0.8 | hadur2.Hadur 3.9 | 8 | 87.5% ± 8.7 | 96.1% ± 6.3 | +8.6 ± 13.9 | 55.7% ± 2.8 | 58.8% ± 1.4 | +3.1 ± 2.8 |
| jmcd.BeoWulf 2.8 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 73.3% ± 5.1 | 74.1% ± 4.9 | +0.8 ± 8.8 |
| jmcd.BeoWulf 2.8 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 95.0% ± 6.3 | +0.0 ± 10.0 | 65.5% ± 6.2 | 76.3% ± 4.8 | +10.8 ± 7.4 |
| js.PinBall 1.6 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 90.6% ± 3.2 | 95.8% ± 3.3 | +5.2 ± 4.7 |
| js.PinBall 1.6 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 87.4% ± 3.2 | 88.4% ± 8.5 | +0.9 ± 9.4 |
| kjc.Karaykan 1.0 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 89.9% ± 4.4 | 90.0% ± 2.2 | +0.2 ± 4.7 |
| kjc.Karaykan 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 83.7% ± 4.7 | 90.2% ± 1.5 | +6.6 ± 5.7 |
| madmath.Cow 0.1.1 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 90.0% ± 6.2 | 95.1% ± 3.3 | +5.1 ± 8.3 |
| madmath.Cow 0.1.1 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 89.2% ± 6.4 | 95.8% ± 2.2 | +6.6 ± 7.8 |
| marksteam.Phoenix 1.0 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 72.4% ± 9.3 | 89.5% ± 5.5 | +17.1 ± 11.9 |
| marksteam.Phoenix 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 76.8% ± 5.6 | 91.2% ± 4.4 | +14.3 ± 6.1 |
| mcb.Audace 1.3 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 90.7% ± 9.6 | 91.0% ± 5.6 | +0.3 ± 10.6 |
| mcb.Audace 1.3 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 76.1% ± 6.2 | 89.7% ± 4.4 | +13.6 ± 6.3 |
| myl.nano.Kakuru 1.20 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 59.8% ± 8.9 | 60.4% ± 6.1 | +0.7 ± 8.3 |
| myl.nano.Kakuru 1.20 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 88.8% ± 7.0 | -6.2 ± 12.6 | 61.7% ± 11.3 | 61.0% ± 6.9 | -0.7 ± 8.5 |
| nan.Ihivatar_Mk_1 1.0 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 78.5% ± 7.9 | 93.1% ± 5.0 | +14.6 ± 8.0 |
| nan.Ihivatar_Mk_1 1.0 | hadur2.Hadur 3.9 | 8 | 97.5% ± 5.9 | 100.0% ± 0.0 | +2.5 ± 5.9 | 54.5% ± 9.9 | 87.5% ± 6.4 | +32.9 ± 13.6 |
| ndn.DyslexicMonkey 1.1 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 84.2% ± 6.1 | 96.3% ± 2.2 | +12.2 ± 7.0 |
| ndn.DyslexicMonkey 1.1 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 82.2% ± 5.2 | 89.0% ± 5.2 | +6.9 ± 5.9 |
| omens.CannonfodderNano 1.4 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 94.7% ± 1.1 | 97.2% ± 1.6 | +2.5 ± 1.7 |
| omens.CannonfodderNano 1.4 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 92.7% ± 3.3 | 94.7% ± 1.5 | +2.0 ± 3.9 |
| oog.melee.Mercutio 1.0 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 84.0% ± 4.8 | 96.7% ± 0.9 | +12.6 ± 4.3 |
| oog.melee.Mercutio 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 86.7% ± 3.6 | 94.1% ± 1.3 | +7.4 ± 2.7 |
| pac.ABC 2.1 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 99.2% ± 0.9 | 99.8% ± 0.4 | +0.6 ± 1.0 |
| pac.ABC 2.1 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 99.3% ± 0.8 | 98.8% ± 0.6 | -0.5 ± 0.7 |
| ratosh.Wesco 1.4 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 87.3% ± 4.8 | 94.8% ± 2.4 | +7.5 ± 5.8 |
| ratosh.Wesco 1.4 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 90.2% ± 9.8 | 94.2% ± 3.1 | +4.0 ± 10.6 |
| serenity.moonlightBat 1.17 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 88.0% ± 2.3 | 94.3% ± 1.6 | +6.4 ± 1.6 |
| serenity.moonlightBat 1.17 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 85.4% ± 5.5 | 94.9% ± 2.1 | +9.5 ± 5.6 |
| suh.micro.WallPM 1.00 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 66.2% ± 5.2 | 70.5% ± 6.3 | +4.3 ± 7.5 |
| suh.micro.WallPM 1.00 | hadur2.Hadur 3.9 | 8 | 92.5% ± 12.4 | 88.8% ± 8.3 | -3.7 ± 17.8 | 71.3% ± 6.0 | 73.1% ± 7.1 | +1.8 ± 8.3 |
| suh.nano.CrossC 1.00 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 96.0% ± 2.3 | 98.2% ± 0.7 | +2.2 ± 1.9 |
| suh.nano.CrossC 1.00 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 90.2% ± 3.1 | 96.7% ± 1.5 | +6.5 ± 3.7 |
| sul.BlueBot 1.0 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 97.3% ± 3.1 | 98.9% ± 0.9 | +1.6 ± 3.1 |
| sul.BlueBot 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 98.2% ± 1.5 | 97.7% ± 0.9 | -0.5 ± 2.2 |
| supersample.SuperCorners 1.0 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 77.7% ± 3.6 | 89.5% ± 3.1 | +11.8 ± 3.8 |
| supersample.SuperCorners 1.0 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 97.5% ± 5.9 | -2.5 ± 5.9 | 82.1% ± 5.4 | 90.3% ± 5.9 | +8.2 ± 6.8 |
| uccc.MilkyWay 1.01 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 94.3% ± 2.3 | 98.9% ± 0.7 | +4.6 ± 2.0 |
| uccc.MilkyWay 1.01 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 89.6% ± 3.1 | 96.8% ± 1.1 | +7.2 ± 3.5 |
| xander.cat.Spitfire 1.4 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 99.8% ± 0.3 | 99.9% ± 0.1 | +0.1 ± 0.4 |
| xander.cat.Spitfire 1.4 | hadur2.Hadur 3.9 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 99.9% ± 0.1 | 99.9% ± 0.1 | -0.0 ± 0.1 |
| yk.JahMicro 1.0 | rsalesc.mega.Knight 0.6.28 | 8 | - | - | n/a | 83.5% ± 4.6 | 94.2% ± 1.7 | +10.7 ± 4.9 |
| yk.JahMicro 1.0 | hadur2.Hadur 3.9 | 8 | 95.0% ± 7.7 | 98.8% ± 3.0 | +3.7 ± 8.9 | 83.1% ± 6.1 | 88.4% ± 2.8 | +5.2 ± 6.2 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| AD.CodaFirst 1.1 | n/a | n/a | +4.3 ± 3.4 | -0.5 ± 3.1 |
| DM.Mijit .3 | n/a | n/a | -0.3 ± 3.0 | -2.0 ± 6.0 |
| EH.Fusion 0.32 | n/a | n/a | +4.2 ± 4.1 | +8.0 ± 6.8 |
| Lo_Ian.Gandalf_V4 4.0 | n/a | n/a | +2.4 ± 8.4 | -1.5 ± 2.4 |
| McS.Spanky_test 0.1a | n/a | n/a | +1.0 ± 1.6 | +0.3 ± 0.8 |
| adt.Ar2 1.0 | n/a | n/a | -1.3 ± 6.5 | -0.5 ± 6.1 |
| amk.superstrike.SuperStrike 0.3 | n/a | n/a | +2.9 ± 2.9 | +0.9 ± 4.1 |
| apv.TheBrainPi 0.5fix | n/a | n/a | +6.8 ± 13.9 | -4.0 ± 6.7 |
| bk.Shooter 1.0 | n/a | n/a | +1.5 ± 4.4 | +2.0 ± 2.4 |
| bots.UnterExBot 1.0 | n/a | n/a | +1.2 ± 5.6 | -1.9 ± 1.6 |
| dmh.robocode.robot.GreenDragon 1.0 | n/a | n/a | +9.7 ± 8.5 | +5.7 ± 7.7 |
| dsw.StaticD 1.0 | n/a | n/a | +0.6 ± 2.8 | +0.8 ± 1.0 |
| ers.nano.lig.LigMA 1.9 | n/a | n/a | +0.1 ± 5.8 | -2.0 ± 5.0 |
| fm.claire 1.7 | n/a | n/a | +7.5 ± 10.4 | +6.8 ± 9.7 |
| hapiel.Spiral 0.1 | n/a | n/a | +4.7 ± 4.7 | -0.1 ± 1.6 |
| hirataatsushi.Trinity 0.003 | n/a | n/a | +3.3 ± 4.4 | +0.1 ± 3.0 |
| hlavko.nano.Ringo 2.0 | n/a | n/a | -1.0 ± 8.3 | +0.7 ± 4.7 |
| jab.micro.Sanguijuela 0.8 | n/a | n/a | +10.6 ± 2.3 | +8.2 ± 2.0 |
| jmcd.BeoWulf 2.8 | n/a | n/a | +7.8 ± 7.7 | -2.2 ± 5.4 |
| js.PinBall 1.6 | n/a | n/a | +3.2 ± 4.1 | +7.4 ± 9.6 |
| kjc.Karaykan 1.0 | n/a | n/a | +6.2 ± 4.8 | -0.2 ± 2.6 |
| madmath.Cow 0.1.1 | n/a | n/a | +0.8 ± 8.6 | -0.7 ± 3.1 |
| marksteam.Phoenix 1.0 | n/a | n/a | -4.5 ± 9.2 | -1.7 ± 8.5 |
| mcb.Audace 1.3 | n/a | n/a | +14.6 ± 13.0 | +1.3 ± 6.0 |
| myl.nano.Kakuru 1.20 | n/a | n/a | -2.0 ± 13.6 | -0.6 ± 9.0 |
| nan.Ihivatar_Mk_1 1.0 | n/a | n/a | +24.0 ± 15.0 | +5.7 ± 10.1 |
| ndn.DyslexicMonkey 1.1 | n/a | n/a | +2.0 ± 9.0 | +7.3 ± 5.1 |
| omens.CannonfodderNano 1.4 | n/a | n/a | +2.0 ± 3.8 | +2.6 ± 2.5 |
| oog.melee.Mercutio 1.0 | n/a | n/a | -2.6 ± 5.4 | +2.6 ± 1.5 |
| pac.ABC 2.1 | n/a | n/a | -0.1 ± 1.0 | +1.0 ± 0.7 |
| ratosh.Wesco 1.4 | n/a | n/a | -2.9 ± 10.9 | +0.6 ± 3.9 |
| serenity.moonlightBat 1.17 | n/a | n/a | +2.6 ± 6.4 | -0.5 ± 1.8 |
| suh.micro.WallPM 1.00 | n/a | n/a | -5.0 ± 6.8 | -2.5 ± 10.2 |
| suh.nano.CrossC 1.00 | n/a | n/a | +5.9 ± 3.4 | +1.5 ± 1.9 |
| sul.BlueBot 1.0 | n/a | n/a | -0.9 ± 3.7 | +1.2 ± 1.3 |
| supersample.SuperCorners 1.0 | n/a | n/a | -4.5 ± 6.0 | -0.9 ± 6.3 |
| uccc.MilkyWay 1.01 | n/a | n/a | +4.7 ± 4.0 | +2.1 ± 1.7 |
| xander.cat.Spitfire 1.4 | n/a | n/a | -0.2 ± 0.3 | -0.0 ± 0.2 |
| yk.JahMicro 1.0 | n/a | n/a | +0.4 ± 9.6 | +5.9 ± 3.1 |

## Failed battles

- e32.Omni 0.06 seed 1 e32.Omni_0.06-1: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 2 e32.Omni_0.06-2-baseline: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 3 e32.Omni_0.06-3: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 4 e32.Omni_0.06-4-baseline: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 5 e32.Omni_0.06-5: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 1 e32.Omni_0.06-1-baseline: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 2 e32.Omni_0.06-2: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 3 e32.Omni_0.06-3-baseline: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 4 e32.Omni_0.06-4: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 6 e32.Omni_0.06-6-baseline: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 5 e32.Omni_0.06-5-baseline: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 7 e32.Omni_0.06-7: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 8 e32.Omni_0.06-8-baseline: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 6 e32.Omni_0.06-6: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 7 e32.Omni_0.06-7-baseline: failed after 2 attempts (expected 2 robots; found 1)
- e32.Omni 0.06 seed 8 e32.Omni_0.06-8: failed after 2 attempts (expected 2 robots; found 1)
