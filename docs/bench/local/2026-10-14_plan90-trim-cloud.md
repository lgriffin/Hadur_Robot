# Bench: hadur2.Hadur 3.13tr (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.12.1, 4 cores. robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 1066 over 176 battles (6.1 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.micro.Smoke 0.96 | rank233-band4 | 74.5% ± 2.4 | 89.6% ± 2.2 | 58.3% ± 3.0 | 251 / 280 | 13.1% ± 0.5 | 5.5% ± 0.5 | 49 | 0 | 2.39 / 43.4 |
| suh.micro.MirrorPM 1.00 | rank393-band4 | 92.3% ± 0.9 | 100.0% ± 0.0 | 86.1% ± 1.5 | 280 / 280 | 39.1% ± 1.1 | 9.4% ± 0.6 | 17 | 0 | 1.80 / 39.0 |
| cf.proto.Shiva 2.2 | rank75-band3 | 67.4% ± 4.1 | 83.5% ± 5.5 | 50.8% ± 3.2 | 234 / 280 | 11.6% ± 0.5 | 7.1% ± 0.5 | 57 | 0 | 2.15 / 112.1 |
| brainfade.Fallen 0.63 | rank164-band3 | 71.0% ± 5.4 | 83.5% ± 7.0 | 58.5% ± 4.4 | 233 / 280 | 14.1% ± 0.9 | 7.0% ± 0.5 | 58 | 0 in 2 round(s) | 2.22 / 67.6 |
| ary.mini.Nimi 1.0 | rank132-band3 | 75.2% ± 3.5 | 90.4% ± 4.0 | 59.6% ± 3.3 | 253 / 280 | 12.3% ± 0.5 | 6.5% ± 0.5 | 64 | 0 | 2.16 / 48.1 |
| ary.SMG 1.01 | rank81-band3 | 69.6% ± 2.4 | 83.2% ± 3.0 | 57.0% ± 2.7 | 233 / 280 | 14.3% ± 1.2 | 8.4% ± 0.4 | 62 | 0 | 2.77 / 32.9 |
| mladjo.Grrrrr 0.9 | rank217-band4 | 71.6% ± 5.6 | 86.4% ± 6.5 | 57.0% ± 4.7 | 242 / 280 | 13.5% ± 1.1 | 7.2% ± 0.8 | 48 | 0 | 2.27 / 45.2 |
| trab.Crusader 0.1.7 | rank95-band3 | 66.2% ± 5.1 | 81.8% ± 5.8 | 51.1% ± 4.5 | 229 / 280 | 12.3% ± 0.8 | 7.6% ± 0.5 | 79 | 0 | 3.04 / 47.2 |
| kid.Toa .0.5 | rank149-band3 | 82.4% ± 4.2 | 90.7% ± 4.6 | 74.2% ± 4.0 | 254 / 280 | 15.0% ± 0.7 | 5.7% ± 0.9 | 37 | 0 | 2.81 / 107.9 |
| DM.mega.Bezier 1.618fprrr | rank86-band3 | 72.3% ± 4.9 | 86.8% ± 6.0 | 55.5% ± 4.6 | 243 / 280 | 11.2% ± 0.5 | 7.4% ± 0.2 | 99 | 0 in 1 round(s) | 5.72 / 150.5 |
| wilson.Chameleon 0.91 | rank193-band3 | 81.8% ± 4.2 | 93.6% ± 5.4 | 69.4% ± 3.1 | 262 / 280 | 14.0% ± 0.9 | 5.7% ± 0.6 | 43 | 0 | 2.86 / 54.8 |
| AIR.iRobot 1.0 | rank263-band4 | 80.3% ± 2.5 | 94.3% ± 2.9 | 63.0% ± 3.6 | 264 / 280 | 11.8% ± 1.2 | 4.9% ± 0.5 | 33 | 0 | 2.04 / 43.0 |
| simonton.micro.GFMicro 1.0 | rank158-band3 | 83.1% ± 2.7 | 95.4% ± 2.2 | 69.6% ± 3.1 | 267 / 280 | 14.7% ± 0.7 | 6.1% ± 0.7 | 47 | 0 | 2.43 / 45.7 |
| mnt.AHEB 0.6a | rank353-band4 | 79.3% ± 4.6 | 91.1% ± 6.2 | 67.8% ± 3.0 | 255 / 280 | 17.8% ± 1.8 | 6.9% ± 0.7 | 35 | 0 | 2.32 / 34.7 |
| rcb.Vanessa03 0 | rank318-band4 | 80.0% ± 3.2 | 93.6% ± 4.0 | 65.3% ± 2.8 | 262 / 280 | 15.6% ± 0.9 | 5.4% ± 0.5 | 42 | 0 | 2.00 / 42.5 |
| tw.Exterminator 1.0 | rank360-band4 | 80.6% ± 3.0 | 74.3% ± 5.3 | 83.8% ± 1.9 | 208 / 280 | 16.6% ± 1.2 | 9.5% ± 0.6 | 98 | 0 | 3.07 / 49.6 |
| davidalves.net.DuelistMicroMkII 1.1 | rank345-band4 | 78.4% ± 3.1 | 93.2% ± 3.8 | 63.4% ± 3.9 | 261 / 280 | 14.8% ± 1.2 | 6.3% ± 0.6 | 34 | 0 | 1.81 / 124.6 |
| kawigi.mini.Coriantumr 1.1 | rank319-band4 | 90.2% ± 1.3 | 99.3% ± 1.1 | 80.1% ± 2.8 | 278 / 280 | 15.6% ± 0.7 | 6.4% ± 5.6 | 24 | 0 | 1.69 / 36.2 |
| stelo.Randomness 1.1 | rank357-band4 | 81.9% ± 2.6 | 94.3% ± 3.1 | 69.3% ± 3.0 | 264 / 280 | 16.3% ± 1.6 | 8.0% ± 4.4 | 51 | 0 | 2.06 / 39.4 |
| nat.Hikari dev0001 | rank220-band4 | 81.1% ± 3.3 | 93.9% ± 4.5 | 68.3% ± 2.8 | 263 / 280 | 15.6% ± 0.6 | 6.5% ± 0.4 | 37 | 0 | 2.06 / 48.1 |
| apv.NanoLauLectrikTheCannibal 1.1 | rank537-band5 | 86.0% ± 2.5 | 97.1% ± 2.2 | 74.9% ± 2.6 | 272 / 280 | 22.0% ± 1.8 | 6.2% ± 1.1 | 29 | 0 | 1.89 / 44.1 |
| starpkg.StarViewerZ 1.26 | rank530-band5 | 91.7% ± 1.6 | 99.6% ± 0.8 | 83.6% ± 2.6 | 279 / 280 | 16.3% ± 0.8 | 4.3% ± 0.5 | 23 | 0 | 1.66 / 41.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cx.micro.Smoke 0.96 | 8 | 1150 | 15.8% | 77.0% | 0.0% | 7.3% | 635 |
| suh.micro.MirrorPM 1.00 | 8 | 463 | 0.0% | 100.0% | 0.0% | 0.0% | 376 |
| cf.proto.Shiva 2.2 | 8 | 1490 | 19.3% | 73.2% | 0.0% | 7.5% | 871 |
| brainfade.Fallen 0.63 | 8 | 1375 | 20.9% | 70.7% | 0.0% | 8.4% | 752 |
| ary.mini.Nimi 1.0 | 8 | 1156 | 14.6% | 79.0% | 0.3% | 6.0% | 914 |
| ary.SMG 1.01 | 8 | 1511 | 19.4% | 72.1% | 0.0% | 8.4% | 857 |
| mladjo.Grrrrr 0.9 | 8 | 1343 | 17.7% | 74.8% | 0.0% | 7.5% | 769 |
| trab.Crusader 0.1.7 | 8 | 1599 | 19.9% | 71.5% | 0.0% | 8.6% | 899 |
| kid.Toa .0.5 | 8 | 877 | 18.5% | 74.4% | 0.0% | 7.1% | 1078 |
| DM.mega.Bezier 1.618fprrr | 8 | 1197 | 19.3% | 73.8% | 0.0% | 6.9% | 1228 |
| wilson.Chameleon 0.91 | 8 | 853 | 13.2% | 81.0% | 0.0% | 5.9% | 688 |
| AIR.iRobot 1.0 | 8 | 831 | 12.0% | 83.4% | 0.0% | 4.6% | 756 |
| simonton.micro.GFMicro 1.0 | 8 | 776 | 10.5% | 85.5% | 0.0% | 4.0% | 892 |
| mnt.AHEB 0.6a | 8 | 1040 | 15.0% | 78.8% | 0.0% | 6.1% | 658 |
| rcb.Vanessa03 0 | 8 | 919 | 12.2% | 82.4% | 0.0% | 5.3% | 555 |
| tw.Exterminator 1.0 | 8 | 1023 | 44.0% | 43.7% | 0.1% | 12.3% | 1610 |
| davidalves.net.DuelistMicroMkII 1.1 | 8 | 1030 | 11.5% | 83.3% | 0.0% | 5.2% | 679 |
| kawigi.mini.Coriantumr 1.1 | 8 | 457 | 2.7% | 96.1% | 0.0% | 1.2% | 631 |
| stelo.Randomness 1.1 | 8 | 867 | 11.5% | 83.7% | 0.0% | 4.8% | 697 |
| nat.Hikari dev0001 | 8 | 926 | 11.5% | 83.9% | 0.0% | 4.6% | 657 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 698 | 7.2% | 89.6% | 0.0% | 3.2% | 485 |
| starpkg.StarViewerZ 1.26 | 8 | 408 | 1.5% | 97.9% | 0.0% | 0.6% | 732 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cx.micro.Smoke 0.96 | 8 | 6 | 0 | 2 | 0.18 | 2 | 0 | 0 |
| suh.micro.MirrorPM 1.00 | 8 | 8 | 0 | 0 | 0.06 | 0 | 0 | 0 |
| cf.proto.Shiva 2.2 | 8 | 7 | 0 | 1 | 0.20 | 1 | 0 | 0 |
| brainfade.Fallen 0.63 | 8 | 4 | 0 | 6 | 0.21 | 7 | 0 | 0 |
| ary.mini.Nimi 1.0 | 8 | 6 | 0 | 1 | 0.23 | 2 | 1 | 0 |
| ary.SMG 1.01 | 8 | 5 | 0 | 4 | 0.22 | 4 | 0 | 0 |
| mladjo.Grrrrr 0.9 | 8 | 6 | 0 | 3 | 0.17 | 2 | 0 | 0 |
| trab.Crusader 0.1.7 | 8 | 6 | 0 | 2 | 0.28 | 3 | 1 | 0 |
| kid.Toa .0.5 | 8 | 8 | 0 | 0 | 0.13 | 0 | 0 | 0 |
| DM.mega.Bezier 1.618fprrr | 8 | 7 | 0 | 2 | 0.35 | 3 | 0 | 0 |
| wilson.Chameleon 0.91 | 8 | 7 | 0 | 1 | 0.15 | 1 | 0 | 0 |
| AIR.iRobot 1.0 | 8 | 7 | 0 | 1 | 0.12 | 1 | 0 | 0 |
| simonton.micro.GFMicro 1.0 | 8 | 8 | 0 | 0 | 0.17 | 0 | 0 | 0 |
| mnt.AHEB 0.6a | 8 | 7 | 0 | 1 | 0.13 | 1 | 0 | 0 |
| rcb.Vanessa03 0 | 8 | 7 | 0 | 2 | 0.15 | 1 | 0 | 0 |
| tw.Exterminator 1.0 | 8 | 5 | 0 | 4 | 0.35 | 4 | 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 8 | 8 | 0 | 0 | 0.12 | 0 | 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 8 | 8 | 0 | 0 | 0.09 | 0 | 0 | 0 |
| stelo.Randomness 1.1 | 8 | 6 | 0 | 2 | 0.18 | 2 | 0 | 0 |
| nat.Hikari dev0001 | 8 | 7 | 0 | 1 | 0.13 | 1 | 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 8 | 0 | 0 | 0.10 | 0 | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 8 | 8 | 0 | 0 | 0.08 | 0 | 0 | 0 |

149 of 176 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| cx.micro.Smoke 0.96 | 7437 | 4 | 7443 | 7436 (100.0%) | 1 (0.0%) | 7 (0.1%) | 285 | 90 | 49 |
| suh.micro.MirrorPM 1.00 | 3956 | 24 | 3956 | 3953 (99.9%) | 3 (0.1%) | 3 (0.1%) | 30 | 129 | 23 |
| cf.proto.Shiva 2.2 | 12242 | 14 | 12274 | 12241 (100.0%) | 1 (0.0%) | 33 (0.3%) | 756 | 102 | 60 |
| brainfade.Fallen 0.63 | 10648 | 16 | 10649 | 10646 (100.0%) | 2 (0.0%) | 3 (0.0%) | 637 | 132 | 62 |
| ary.mini.Nimi 1.0 | 14520 | 11 | 14521 | 14520 (100.0%) | 0 (0.0%) | 1 (0.0%) | 798 | 153 | 68 |
| ary.SMG 1.01 | 14153 | 15 | 14152 | 14150 (100.0%) | 3 (0.0%) | 2 (0.0%) | 659 | 187 | 86 |
| mladjo.Grrrrr 0.9 | 11790 | 21 | 11790 | 11789 (100.0%) | 1 (0.0%) | 1 (0.0%) | 432 | 120 | 70 |
| trab.Crusader 0.1.7 | 14496 | 18 | 14494 | 14492 (100.0%) | 4 (0.0%) | 2 (0.0%) | 828 | 159 | 92 |
| kid.Toa .0.5 | 9034 | 1 | 12153 | 9030 (100.0%) | 4 (0.0%) | 3123 (25.7%) | 1627 | 109 | 39 |
| DM.mega.Bezier 1.618fprrr | 22385 | 12 | 22386 | 22380 (100.0%) | 5 (0.0%) | 6 (0.0%) | 1678 | 198 | 101 |
| wilson.Chameleon 0.91 | 9824 | 16 | 9824 | 9824 (100.0%) | 0 (0.0%) | 0 (0.0%) | 240 | 139 | 59 |
| AIR.iRobot 1.0 | 11422 | 11 | 11422 | 11422 (100.0%) | 0 (0.0%) | 0 (0.0%) | 346 | 94 | 34 |
| simonton.micro.GFMicro 1.0 | 15296 | 93 | 15294 | 15293 (100.0%) | 3 (0.0%) | 1 (0.0%) | 658 | 167 | 58 |
| mnt.AHEB 0.6a | 9412 | 14 | 9414 | 9406 (99.9%) | 6 (0.1%) | 8 (0.1%) | 621 | 129 | 39 |
| rcb.Vanessa03 0 | 6542 | 10 | 6542 | 6542 (100.0%) | 0 (0.0%) | 0 (0.0%) | 129 | 89 | 48 |
| tw.Exterminator 1.0 | 35379 | 44 | 35426 | 35379 (100.0%) | 0 (0.0%) | 47 (0.1%) | 3025 | 405 | 109 |
| davidalves.net.DuelistMicroMkII 1.1 | 8003 | 13 | 8046 | 7993 (99.9%) | 10 (0.1%) | 53 (0.7%) | 483 | 119 | 191 |
| kawigi.mini.Coriantumr 1.1 | 6816 | 1 | 6807 | 6798 (99.7%) | 18 (0.3%) | 9 (0.1%) | 140 | 94 | 340 |
| stelo.Randomness 1.1 | 10539 | 29 | 10525 | 10524 (99.9%) | 15 (0.1%) | 1 (0.0%) | 390 | 147 | 286 |
| nat.Hikari dev0001 | 9555 | 15 | 9556 | 9554 (100.0%) | 1 (0.0%) | 2 (0.0%) | 315 | 151 | 43 |
| apv.NanoLauLectrikTheCannibal 1.1 | 5557 | 39 | 5562 | 5549 (99.9%) | 8 (0.1%) | 13 (0.2%) | 695 | 134 | 33 |
| starpkg.StarViewerZ 1.26 | 11845 | 36 | 11846 | 11845 (100.0%) | 0 (0.0%) | 1 (0.0%) | 306 | 146 | 27 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| cx.micro.Smoke 0.96 | 9483 | 696 (7.3%) | 6961 |
| suh.micro.MirrorPM 1.00 | 3646 | 224 (6.1%) | 290 |
| cf.proto.Shiva 2.2 | 14941 | 1077 (7.2%) | 10695 |
| brainfade.Fallen 0.63 | 11857 | 846 (7.1%) | 6013 |
| ary.mini.Nimi 1.0 | 15925 | 1391 (8.7%) | 13227 |
| ary.SMG 1.01 | 14595 | 1246 (8.5%) | 12197 |
| mladjo.Grrrrr 0.9 | 12471 | 1167 (9.4%) | 10439 |
| trab.Crusader 0.1.7 | 15569 | 1376 (8.8%) | 11499 |
| kid.Toa .0.5 | 19788 | 679 (3.4%) | 10008 |
| DM.mega.Bezier 1.618fprrr | 24352 | 2328 (9.6%) | 22844 |
| wilson.Chameleon 0.91 | 10521 | 836 (7.9%) | 7376 |
| AIR.iRobot 1.0 | 12295 | 997 (8.1%) | 8404 |
| simonton.micro.GFMicro 1.0 | 15548 | 1386 (8.9%) | 13472 |
| mnt.AHEB 0.6a | 9700 | 627 (6.5%) | 3475 |
| rcb.Vanessa03 0 | 7619 | 518 (6.8%) | 3353 |
| tw.Exterminator 1.0 | 31382 | 3172 (10.1%) | 29881 |
| davidalves.net.DuelistMicroMkII 1.1 | 10493 | 682 (6.5%) | 8024 |
| kawigi.mini.Coriantumr 1.1 | 9132 | 471 (5.2%) | 1690 |
| stelo.Randomness 1.1 | 10696 | 1024 (9.6%) | 8240 |
| nat.Hikari dev0001 | 9678 | 1050 (10.8%) | 8266 |
| apv.NanoLauLectrikTheCannibal 1.1 | 5942 | 518 (8.7%) | 3132 |
| starpkg.StarViewerZ 1.26 | 11333 | 841 (7.4%) | 6807 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| cx.micro.Smoke 0.96 | 650 | 491 | 634 | 485 | 35.2 / 25.3 | 506 | 5661 | 215 |
| suh.micro.MirrorPM 1.00 | 650 | 500 | 400 | 226 | 81.5 / 13.2 | 2797 | 1576 | 1 |
| cf.proto.Shiva 2.2 | 650 | 495 | 619 | 724 | 32.2 / 31.2 | 473 | 3570 | 120 |
| brainfade.Fallen 0.63 | 650 | 462 | 497 | 605 | 39.2 / 27.8 | 1644 | 2612 | 0 |
| ary.mini.Nimi 1.0 | 650 | 512 | 650 | 763 | 38.4 / 26.1 | 650 | 4447 | 0 |
| ary.SMG 1.01 | 650 | 455 | 619 | 706 | 41.3 / 31.1 | 836 | 3860 | 69 |
| mladjo.Grrrrr 0.9 | 650 | 472 | 641 | 622 | 37.8 / 28.7 | 430 | 2417 | 3857 |
| trab.Crusader 0.1.7 | 650 | 482 | 650 | 747 | 34.2 / 32.7 | 474 | 4204 | 2 |
| kid.Toa .0.5 | 650 | 438 | 400 | 928 | 53.5 / 18.6 | 1904 | 258 | 40 |
| DM.mega.Bezier 1.618fprrr | 650 | 568 | 647 | 1087 | 32.0 / 25.2 | 510 | 26670 | 220 |
| wilson.Chameleon 0.91 | 650 | 511 | 603 | 537 | 44.4 / 19.7 | 1071 | 6662 | 14 |
| AIR.iRobot 1.0 | 650 | 508 | 606 | 606 | 33.9 / 19.8 | 363 | 5409 | 4826 |
| simonton.micro.GFMicro 1.0 | 650 | 479 | 531 | 742 | 43.3 / 19.0 | 563 | 4739 | 1408 |
| mnt.AHEB 0.6a | 650 | 455 | 400 | 506 | 49.0 / 23.4 | 2690 | 4228 | 181 |
| rcb.Vanessa03 0 | 650 | 418 | 553 | 405 | 40.6 / 21.6 | 1399 | 6286 | 276 |
| tw.Exterminator 1.0 | 650 | 476 | 519 | 1448 | 66.1 / 12.8 | 3841 | 1602 | 1410 |
| davidalves.net.DuelistMicroMkII 1.1 | 650 | 464 | 553 | 529 | 42.5 / 24.5 | 1604 | 3983 | 77 |
| kawigi.mini.Coriantumr 1.1 | 650 | 506 | 409 | 481 | 50.3 / 12.6 | 1500 | 2784 | 36 |
| stelo.Randomness 1.1 | 650 | 465 | 541 | 546 | 46.8 / 20.7 | 1680 | 5446 | 672 |
| nat.Hikari dev0001 | 650 | 412 | 584 | 507 | 47.7 / 22.2 | 2354 | 3862 | 2489 |
| apv.NanoLauLectrikTheCannibal 1.1 | 650 | 383 | 400 | 335 | 52.7 / 17.9 | 2793 | 5644 | 735 |
| starpkg.StarViewerZ 1.26 | 650 | 440 | 400 | 582 | 58.1 / 11.4 | 2235 | 6166 | 27 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| cx.micro.Smoke 0.96 | 5.5% | 49 | 346 | 3 | 26.1 | 695 / 696 (100%) | 0 | 0 |
| suh.micro.MirrorPM 1.00 | 9.4% | 17 | 164 | 3 | 14.1 | 224 / 224 (100%) | 0 | 0 |
| cf.proto.Shiva 2.2 | 7.1% | 57 | 5754 | 3 | 43.7 | 1076 / 1077 (100%) | 0 | 0 |
| brainfade.Fallen 0.63 | 7.0% | 58 | 413 | 3 | 37.1 | 846 / 846 (100%) | 0 | 0 |
| ary.mini.Nimi 1.0 | 6.5% | 64 | 570 | 3 | 51.2 | 1389 / 1391 (100%) | 0 | 0 |
| ary.SMG 1.01 | 8.4% | 62 | 5862 | 3 | 49.6 | 1246 / 1246 (100%) | 0 | 0 |
| mladjo.Grrrrr 0.9 | 7.2% | 48 | 360 | 3 | 41.4 | 1167 / 1167 (100%) | 0 | 0 |
| trab.Crusader 0.1.7 | 7.6% | 79 | 8529 | 3 | 51.0 | 1374 / 1376 (100%) | 0 | 0 |
| kid.Toa .0.5 | 5.7% | 37 | 284 | 3 | 43.3 | 679 / 679 (100%) | 0 | 0 |
| DM.mega.Bezier 1.618fprrr | 7.4% | 99 | 10972 | 3 | 79.6 | 2325 / 2328 (100%) | 0 | 0 |
| wilson.Chameleon 0.91 | 5.7% | 43 | 801 | 3 | 34.7 | 836 / 836 (100%) | 0 | 0 |
| AIR.iRobot 1.0 | 4.9% | 33 | 531 | 3 | 40.6 | 997 / 997 (100%) | 0 | 0 |
| simonton.micro.GFMicro 1.0 | 6.1% | 47 | 4386 | 3 | 54.6 | 1382 / 1386 (100%) | 0 | 0 |
| mnt.AHEB 0.6a | 6.9% | 35 | 7044 | 3 | 33.1 | 627 / 627 (100%) | 0 | 0 |
| rcb.Vanessa03 0 | 5.4% | 42 | 264 | 3 | 23.2 | 518 / 518 (100%) | 0 | 0 |
| tw.Exterminator 1.0 | 9.5% | 98 | 28854 | 3 | 122.8 | 3170 / 3172 (100%) | 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 6.3% | 34 | 1363 | 3 | 28.6 | 680 / 682 (100%) | 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 6.4% | 24 | 318 | 3 | 24.3 | 471 / 471 (100%) | 0 | 0 |
| stelo.Randomness 1.1 | 8.0% | 51 | 311 | 3 | 37.0 | 1023 / 1024 (100%) | 0 | 0 |
| nat.Hikari dev0001 | 6.5% | 37 | 2500 | 3 | 33.9 | 1049 / 1050 (100%) | 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 6.2% | 29 | 519 | 3 | 19.8 | 517 / 518 (100%) | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 4.3% | 23 | 437 | 3 | 42.3 | 840 / 841 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| cx.micro.Smoke 0.96 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| suh.micro.MirrorPM 1.00 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cf.proto.Shiva 2.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| brainfade.Fallen 0.63 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ary.mini.Nimi 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ary.SMG 1.01 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mladjo.Grrrrr 0.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| trab.Crusader 0.1.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kid.Toa .0.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| DM.mega.Bezier 1.618fprrr | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wilson.Chameleon 0.91 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| AIR.iRobot 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.micro.GFMicro 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mnt.AHEB 0.6a | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rcb.Vanessa03 0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tw.Exterminator 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.Randomness 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.Hikari dev0001 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| starpkg.StarViewerZ 1.26 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| cx.micro.Smoke 0.96 | cx.micro.Smoke | 1 | 35 | 290 | 6.6% | 8.0% ± 1.9 | 12.0% | 26.6% / 22.3% | 9.8% | 0 / 0 | T3/M0 | 72% |
| suh.micro.MirrorPM 1.00 | suh.micro.MirrorPM | 1 | 35 | 306 | 13.3% | 12.7% ± 3.0 | 27.1% | 30.7% / 27.8% | 1.3% | 0 / 0 | T?/M? | 92% |
| cf.proto.Shiva 2.2 | cf.proto.Shiva | 1 | 35 | 288 | 7.5% | 7.4% ± 1.4 | 11.1% | 22.8% / 23.0% | 6.1% | 0 / 0 | T3/M1 | 72% |
| brainfade.Fallen 0.63 | brainfade.Fallen | 1 | 35 | 298 | 7.8% | 7.7% ± 1.6 | 13.2% | 30.4% / 28.8% | 15.5% | 0 / 0 | T3/M0 | 72% |
| ary.mini.Nimi 1.0 | ary.mini.Nimi | 1 | 35 | 284 | 6.6% | 6.8% ± 1.2 | 10.8% | 26.9% / 24.9% | 6.7% | 0 / 0 | T2/M0 | 74% |
| ary.SMG 1.01 | ary.SMG | 1 | 35 | 262 | 9.1% | 7.5% ± 1.2 | 10.8% | 25.5% / 27.6% | 3.2% | 0 / 0 | T3/M0 | 67% |
| mladjo.Grrrrr 0.9 | mladjo.Grrrrr | 1 | 35 | 284 | 6.9% | 7.1% ± 1.4 | 12.5% | 25.6% / 24.0% | 5.9% | 0 / 0 | T3/M0 | 78% |
| trab.Crusader 0.1.7 | trab.Crusader | 1 | 35 | 288 | 9.1% | 9.2% ± 1.4 | 11.5% | 24.5% / 25.1% | 3.1% | 0 / 0 | T3/M1 | 58% |
| kid.Toa .0.5 | kid.Toa | 1 | 35 | 262 | 5.9% | 5.0% ± 1.2 | 14.0% | 26.6% / 25.5% | 15.2% | 0 / 0 | T2/M0 | 82% |
| DM.mega.Bezier 1.618fprrr | DM.mega.Bezier | 1 | 35 | 302 | 8.3% | 7.8% ± 1.1 | 10.9% | 29.2% / 27.3% | 1.6% | 0 / 0 | T3/M0 | 63% |
| wilson.Chameleon 0.91 | wilson.Chameleon | 1 | 35 | 298 | 5.5% | 5.6% ± 1.4 | 11.8% | 29.1% / 24.4% | 14.3% | 0 / 0 | T2/M0 | 86% |
| AIR.iRobot 1.0 | AIR.iRobot | 1 | 35 | 272 | 5.4% | 5.4% ± 1.2 | 10.5% | 23.9% / 22.0% | 5.8% | 0 / 0 | T2/M1 | 80% |
| simonton.micro.GFMicro 1.0 | simonton.micro.GFMicro | 1 | 35 | 320 | 7.7% | 7.0% ± 1.2 | 11.9% | 25.8% / 23.0% | 5.3% | 0 / 0 | T2/M0 | 80% |
| mnt.AHEB 0.6a | mnt.AHEB | 1 | 35 | 266 | 9.4% | 8.0% ± 1.6 | 18.2% | 30.6% / 25.7% | 30.0% | 0 / 0 | T3/M0 | 68% |
| rcb.Vanessa03 0 | rcb.Vanessa03 | 1 | 35 | 280 | 5.8% | 5.9% ± 1.7 | 12.3% | 28.8% / 26.5% | 12.6% | 0 / 0 | T2/M0 | 83% |
| tw.Exterminator 1.0 | tw.Exterminator | 1 | 35 | 292 | 8.7% | 6.7% ± 0.9 | 14.7% | 27.1% / 26.9% | 4.9% | 0 / 0 | T2/M0 | 79% |
| davidalves.net.DuelistMicroMkII 1.1 | davidalves.net.DuelistMicroMkII | 1 | 35 | 356 | 6.8% | 6.6% ± 1.7 | 13.9% | 29.0% / 25.7% | 13.1% | 0 / 0 | T2/M0 | 81% |
| kawigi.mini.Coriantumr 1.1 | kawigi.mini.Coriantumr | 1 | 35 | 320 | 4.5% | 5.3% ± 1.5 | 12.9% | 31.1% / 28.4% | 1.5% | 0 / 0 | T2/M0 | 90% |
| stelo.Randomness 1.1 | stelo.Randomness | 1 | 35 | 296 | 7.4% | 7.3% ± 1.5 | 13.8% | 25.4% / 23.1% | 4.6% | 0 / 0 | T3/M0 | 78% |
| nat.Hikari dev0001 | nat.Hikari | 1 | 35 | 280 | 8.4% | 7.5% ± 1.6 | 15.4% | 32.1% / 31.1% | 25.6% | 0 / 0 | T3/M0 | 80% |
| apv.NanoLauLectrikTheCannibal 1.1 | apv.NanoLauLectrikTheCannibal | 1 | 35 | 348 | 8.7% | 7.3% ± 2.0 | 16.5% | 30.3% / 24.1% | 20.6% | 0 / 0 | T3/M? | 80% |
| starpkg.StarViewerZ 1.26 | starpkg.StarViewerZ | 1 | 35 | 310 | 5.7% | 4.8% ± 1.1 | 13.3% | 27.8% / 25.4% | 8.3% | 0 / 0 | T2/M0 | 90% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## Paired A/B: hadur2.Hadur 3.13tr vs hadur2.Hadur 3.13

Each row pairs the candidate's and baseline's battles at the same seed against the same opponent, so noise common to both (the seed's opening, the field) cancels out of the difference (BENCH-2). Positive is better for the candidate.

| Opponent | Candidate share | Baseline share | Paired diff (pp) |
|---|---|---|---|
| cx.micro.Smoke 0.96 | 74.5% ± 2.4 | 71.9% ± 4.5 | +2.5 ± 4.5 |
| suh.micro.MirrorPM 1.00 | 92.3% ± 0.9 | 86.6% ± 5.4 | +5.7 ± 5.4 |
| cf.proto.Shiva 2.2 | 67.4% ± 4.1 | 82.7% ± 5.4 | -15.4 ± 7.3 |
| brainfade.Fallen 0.63 | 71.0% ± 5.4 | 86.3% ± 7.2 | -15.3 ± 9.4 |
| ary.mini.Nimi 1.0 | 75.2% ± 3.5 | 94.2% ± 7.3 | -19.0 ± 9.3 |
| ary.SMG 1.01 | 69.6% ± 2.4 | 80.6% ± 7.9 | -11.1 ± 8.5 |
| mladjo.Grrrrr 0.9 | 71.6% ± 5.6 | 71.3% ± 12.4 | +0.4 ± 11.8 |
| trab.Crusader 0.1.7 | 66.2% ± 5.1 | 98.4% ± 0.8 | -32.2 ± 4.9 |
| kid.Toa .0.5 | 82.4% ± 4.2 | 80.0% ± 3.2 | +2.4 ± 4.7 |
| DM.mega.Bezier 1.618fprrr | 72.3% ± 4.9 | 86.8% ± 8.4 | -14.6 ± 8.1 |
| wilson.Chameleon 0.91 | 81.8% ± 4.2 | 87.2% ± 6.9 | -5.3 ± 8.0 |
| AIR.iRobot 1.0 | 80.3% ± 2.5 | 86.6% ± 7.1 | -6.3 ± 8.0 |
| simonton.micro.GFMicro 1.0 | 83.1% ± 2.7 | 88.2% ± 4.2 | -5.0 ± 6.1 |
| mnt.AHEB 0.6a | 79.3% ± 4.6 | 94.5% ± 3.5 | -15.2 ± 6.7 |
| rcb.Vanessa03 0 | 80.0% ± 3.2 | 84.8% ± 6.2 | -4.7 ± 5.6 |
| tw.Exterminator 1.0 | 80.6% ± 3.0 | 72.3% ± 4.6 | +8.3 ± 6.0 |
| davidalves.net.DuelistMicroMkII 1.1 | 78.4% ± 3.1 | 83.0% ± 4.9 | -4.7 ± 5.1 |
| kawigi.mini.Coriantumr 1.1 | 90.2% ± 1.3 | 96.2% ± 2.2 | -6.0 ± 2.3 |
| stelo.Randomness 1.1 | 81.9% ± 2.6 | 83.6% ± 3.6 | -1.7 ± 2.6 |
| nat.Hikari dev0001 | 81.1% ± 3.3 | 81.7% ± 2.9 | -0.7 ± 3.4 |
| apv.NanoLauLectrikTheCannibal 1.1 | 86.0% ± 2.5 | 86.7% ± 2.0 | -0.6 ± 3.0 |
| starpkg.StarViewerZ 1.26 | 91.7% ± 1.6 | 93.4% ± 5.1 | -1.7 ± 6.0 |

### Paired intervals by metric (pp)

The same seed-for-seed pairing on four metrics: mean candidate-minus-baseline difference in points, with the 95% interval over seeds.

| Opponent | Score share | Survival share | Win rate | Bullet-damage share |
|---|---|---|---|---|
| cx.micro.Smoke 0.96 | +2.5 ± 4.5 | +1.8 ± 4.2 | +1.8 ± 4.2 | +12.2 ± 6.5 |
| suh.micro.MirrorPM 1.00 | +5.7 ± 5.4 | +6.1 ± 2.7 | +6.1 ± 2.7 | +49.6 ± 28.3 |
| cf.proto.Shiva 2.2 | -15.4 ± 7.3 | -9.7 ± 5.5 | -9.6 ± 5.4 | -0.0 ± 18.5 |
| brainfade.Fallen 0.63 | -15.3 ± 9.4 | -12.2 ± 8.8 | -12.5 ± 9.0 | +37.1 ± 21.0 |
| ary.mini.Nimi 1.0 | -19.0 ± 9.3 | -7.5 ± 5.8 | -7.5 ± 5.8 | +46.0 ± 18.9 |
| ary.SMG 1.01 | -11.1 ± 8.5 | -8.2 ± 4.3 | -8.2 ± 4.3 | +19.4 ± 18.2 |
| mladjo.Grrrrr 0.9 | +0.4 ± 11.8 | +2.9 ± 9.9 | +2.9 ± 9.9 | +20.5 ± 22.2 |
| trab.Crusader 0.1.7 | -32.2 ± 4.9 | -18.2 ± 5.8 | -18.2 ± 5.8 | +50.8 ± 4.6 |
| kid.Toa .0.5 | +2.4 ± 4.7 | +0.4 ± 4.9 | +0.4 ± 4.9 | +8.3 ± 4.8 |
| DM.mega.Bezier 1.618fprrr | -14.6 ± 8.1 | -7.9 ± 6.6 | -7.9 ± 6.6 | +39.0 ± 19.6 |
| wilson.Chameleon 0.91 | -5.3 ± 8.0 | -0.7 ± 6.6 | -0.7 ± 6.6 | +37.6 ± 24.9 |
| AIR.iRobot 1.0 | -6.3 ± 8.0 | -0.0 ± 5.7 | -0.0 ± 5.7 | +32.9 ± 22.9 |
| simonton.micro.GFMicro 1.0 | -5.0 ± 6.1 | +0.0 ± 3.1 | +0.0 ± 3.1 | +21.9 ± 30.2 |
| mnt.AHEB 0.6a | -15.2 ± 6.7 | -7.5 ± 6.7 | -7.5 ± 6.7 | +67.7 ± 2.9 |
| rcb.Vanessa03 0 | -4.7 ± 5.6 | -0.4 ± 5.2 | -0.4 ± 5.2 | +26.8 ± 23.7 |
| tw.Exterminator 1.0 | +8.3 ± 6.0 | +8.9 ± 12.0 | +8.9 ± 12.0 | +5.9 ± 2.8 |
| davidalves.net.DuelistMicroMkII 1.1 | -4.7 ± 5.1 | -2.9 ± 4.2 | -2.9 ± 4.2 | +11.3 ± 11.4 |
| kawigi.mini.Coriantumr 1.1 | -6.0 ± 2.3 | +1.1 ± 1.2 | +1.1 ± 1.2 | +58.2 ± 27.7 |
| stelo.Randomness 1.1 | -1.7 ± 2.6 | +1.8 ± 3.4 | +1.8 ± 3.4 | +30.3 ± 29.2 |
| nat.Hikari dev0001 | -0.7 ± 3.4 | -1.1 ± 4.6 | -1.1 ± 4.6 | +9.9 ± 5.2 |
| apv.NanoLauLectrikTheCannibal 1.1 | -0.6 ± 3.0 | +0.4 ± 2.7 | +0.4 ± 2.7 | +19.7 ± 22.3 |
| starpkg.StarViewerZ 1.26 | -1.7 ± 6.0 | +2.1 ± 2.5 | +2.1 ± 2.5 | +47.1 ± 27.5 |
| All pairs | -6.4 ± 1.8 | -2.3 ± 1.3 | -2.3 ± 1.3 | +29.6 ± 4.3 |

### Sensitivity: trusted pairs only

Score-share paired difference (pp) with every pair dropped in which either battle is untrusted (see the Trust section: duress, skips over 2.0 a round, or, for a Hadur build, a round without an R record).

| Opponent | Pairs | Trusted pairs | All pairs (pp) | Trusted pairs only (pp) |
|---|---|---|---|---|
| cx.micro.Smoke 0.96 | 8 | 6 | +2.5 ± 4.5 | +1.2 ± 6.0 |
| suh.micro.MirrorPM 1.00 | 8 | 8 | +5.7 ± 5.4 | +5.7 ± 5.4 |
| cf.proto.Shiva 2.2 | 8 | 7 | -15.4 ± 7.3 | -16.1 ± 8.5 |
| brainfade.Fallen 0.63 | 8 | 4 | -15.3 ± 9.4 | -9.5 ± 19.2 |
| ary.mini.Nimi 1.0 | 8 | 6 | -19.0 ± 9.3 | -17.0 ± 12.8 |
| ary.SMG 1.01 | 8 | 5 | -11.1 ± 8.5 | -11.3 ± 14.9 |
| mladjo.Grrrrr 0.9 | 8 | 4 | +0.4 ± 11.8 | -7.2 ± 23.0 |
| trab.Crusader 0.1.7 | 8 | 6 | -32.2 ± 4.9 | -32.3 ± 7.1 |
| kid.Toa .0.5 | 8 | 8 | +2.4 ± 4.7 | +2.4 ± 4.7 |
| DM.mega.Bezier 1.618fprrr | 8 | 6 | -14.6 ± 8.1 | -15.1 ± 5.4 |
| wilson.Chameleon 0.91 | 8 | 5 | -5.3 ± 8.0 | -4.4 ± 12.6 |
| AIR.iRobot 1.0 | 8 | 6 | -6.3 ± 8.0 | -5.0 ± 11.0 |
| simonton.micro.GFMicro 1.0 | 8 | 7 | -5.0 ± 6.1 | -4.8 ± 7.2 |
| mnt.AHEB 0.6a | 8 | 7 | -15.2 ± 6.7 | -15.1 ± 8.0 |
| rcb.Vanessa03 0 | 8 | 7 | -4.7 ± 5.6 | -5.1 ± 6.6 |
| tw.Exterminator 1.0 | 8 | 4 | +8.3 ± 6.0 | +9.2 ± 8.3 |
| davidalves.net.DuelistMicroMkII 1.1 | 8 | 8 | -4.7 ± 5.1 | -4.7 ± 5.1 |
| kawigi.mini.Coriantumr 1.1 | 8 | 8 | -6.0 ± 2.3 | -6.0 ± 2.3 |
| stelo.Randomness 1.1 | 8 | 4 | -1.7 ± 2.6 | -1.9 ± 1.1 |
| nat.Hikari dev0001 | 8 | 6 | -0.7 ± 3.4 | +0.4 ± 4.5 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 8 | -0.6 ± 3.0 | -0.6 ± 3.0 |
| starpkg.StarViewerZ 1.26 | 8 | 8 | -1.7 ± 6.0 | -1.7 ± 6.0 |
| All pairs | 176 | 138 | -6.4 ± 1.8 | -6.2 ± 1.9 |

# Bench: hadur2.Hadur 3.13tr baseline (hadur2.Hadur 3.13) (cold)

35 rounds x 8 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.12.1, 4 cores. robocode.cpu.constant=4138771 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v114, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 580 over 176 battles (3.3 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| cx.micro.Smoke 0.96 | rank233-band4 | 71.9% ± 4.5 | 87.9% ± 3.1 | 46.1% ± 6.6 | 246 / 280 | 7.8% ± 2.5 | 4.9% ± 1.8 | 38 | 0 | 2.29 / 50.8 |
| suh.micro.MirrorPM 1.00 | rank393-band4 | 86.6% ± 5.4 | 93.9% ± 2.7 | 36.5% ± 29.4 | 263 / 280 | 10.6% ± 6.4 | 4.4% ± 2.1 | 23 | 0 | 1.35 / 62.0 |
| cf.proto.Shiva 2.2 | rank75-band3 | 82.7% ± 5.4 | 93.2% ± 3.1 | 50.8% ± 19.7 | 261 / 280 | 7.6% ± 4.2 | 3.8% ± 2.1 | 23 | 0 | 1.44 / 63.2 |
| brainfade.Fallen 0.63 | rank164-band3 | 86.3% ± 7.2 | 95.7% ± 3.1 | 21.3% ± 18.2 | 268 / 280 | 2.5% ± 3.4 | 2.9% ± 1.8 | 12 | 0 | 1.84 / 40.3 |
| ary.mini.Nimi 1.0 | rank132-band3 | 94.2% ± 7.3 | 97.9% ± 3.3 | 13.6% ± 21.1 | 274 / 280 | 1.4% ± 3.3 | 1.5% ± 2.0 | 23 | 0 | 1.72 / 44.8 |
| ary.SMG 1.01 | rank81-band3 | 80.6% ± 7.9 | 91.4% ± 5.1 | 37.6% ± 20.6 | 256 / 280 | 4.6% ± 3.3 | 3.9% ± 1.9 | 17 | 0 | 2.03 / 47.4 |
| mladjo.Grrrrr 0.9 | rank217-band4 | 71.3% ± 12.4 | 83.6% ± 8.4 | 36.5% ± 19.1 | 234 / 280 | 7.0% ± 3.9 | 5.7% ± 2.8 | 42 | 0 in 1 round(s) | 2.07 / 44.0 |
| trab.Crusader 0.1.7 | rank95-band3 | 98.4% ± 0.8 | 100.0% ± 0.0 | 0.3% ± 0.7 | 280 / 280 | 0.0% ± 0.0 | 0.2% ± 0.1 | 15 | 0 | 3.09 / 47.2 |
| kid.Toa .0.5 | rank149-band3 | 80.0% ± 3.2 | 90.3% ± 3.6 | 65.9% ± 3.1 | 253 / 280 | 9.8% ± 1.6 | 4.5% ± 0.8 | 33 | 0 | 2.53 / 95.7 |
| DM.mega.Bezier 1.618fprrr | rank86-band3 | 86.8% ± 8.4 | 94.6% ± 3.9 | 16.6% ± 18.1 | 265 / 280 | 2.0% ± 2.1 | 3.0% ± 1.9 | 26 | 0 | 4.04 / 144.6 |
| wilson.Chameleon 0.91 | rank193-band3 | 87.2% ± 6.9 | 94.3% ± 4.8 | 31.8% ± 24.7 | 264 / 280 | 4.8% ± 5.3 | 3.3% ± 1.6 | 28 | 0 | 2.52 / 65.5 |
| AIR.iRobot 1.0 | rank263-band4 | 86.6% ± 7.1 | 94.3% ± 4.9 | 30.1% ± 24.3 | 264 / 280 | 3.5% ± 3.8 | 1.9% ± 1.6 | 15 | 0 | 1.82 / 54.4 |
| simonton.micro.GFMicro 1.0 | rank158-band3 | 88.2% ± 4.2 | 95.4% ± 1.8 | 47.8% ± 31.7 | 267 / 280 | 11.1% ± 7.4 | 5.0% ± 2.2 | 27 | 0 | 1.94 / 47.5 |
| mnt.AHEB 0.6a | rank353-band4 | 94.5% ± 3.5 | 98.6% ± 1.3 | 0.1% ± 0.2 | 276 / 280 | 0.0% ± 0.0 | 2.0% ± 1.0 | 13 | 0 | 0.73 / 44.2 |
| rcb.Vanessa03 0 | rank318-band4 | 84.8% ± 6.2 | 93.9% ± 2.7 | 38.5% ± 21.6 | 263 / 280 | 5.4% ± 3.7 | 2.8% ± 1.8 | 36 | 0 | 1.57 / 37.9 |
| tw.Exterminator 1.0 | rank360-band4 | 72.3% ± 4.6 | 65.4% ± 8.3 | 77.9% ± 2.9 | 183 / 280 | 13.0% ± 1.7 | 7.8% ± 1.2 | 87 | 0 | 3.22 / 47.8 |
| davidalves.net.DuelistMicroMkII 1.1 | rank345-band4 | 83.0% ± 4.9 | 96.1% ± 3.1 | 52.1% ± 12.5 | 269 / 280 | 7.2% ± 2.9 | 3.4% ± 1.4 | 13 | 0 | 1.43 / 50.3 |
| kawigi.mini.Coriantumr 1.1 | rank319-band4 | 96.2% ± 2.2 | 98.2% ± 1.2 | 21.9% ± 27.4 | 275 / 280 | 0.0% ± 0.0 | 0.2% ± 0.1 | 25 | 0 | 0.96 / 44.0 |
| stelo.Randomness 1.1 | rank357-band4 | 83.6% ± 3.6 | 92.5% ± 1.8 | 39.0% ± 26.7 | 259 / 280 | 5.3% ± 3.7 | 2.8% ± 1.4 | 17 | 0 | 1.42 / 38.5 |
| nat.Hikari dev0001 | rank220-band4 | 81.7% ± 2.9 | 95.0% ± 2.8 | 58.4% ± 4.4 | 266 / 280 | 7.2% ± 1.9 | 5.1% ± 1.3 | 32 | 0 | 1.63 / 41.7 |
| apv.NanoLauLectrikTheCannibal 1.1 | rank537-band5 | 86.7% ± 2.0 | 96.8% ± 0.8 | 55.2% ± 21.2 | 271 / 280 | 14.6% ± 4.9 | 7.4% ± 0.7 | 25 | 0 | 1.88 / 39.5 |
| starpkg.StarViewerZ 1.26 | rank530-band5 | 93.4% ± 5.1 | 97.5% ± 2.0 | 36.6% ± 26.4 | 273 / 280 | 1.7% ± 2.7 | 2.0% ± 1.9 | 10 | 0 | 1.09 / 44.5 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| cx.micro.Smoke 0.96 | 8 | 1063 | 20.0% | 69.0% | 1.7% | 9.3% | 850 |
| suh.micro.MirrorPM 1.00 | 8 | 386 | 27.5% | 41.0% | 18.6% | 12.9% | 1578 |
| cf.proto.Shiva 2.2 | 8 | 635 | 18.7% | 69.7% | 3.2% | 8.5% | 1047 |
| brainfade.Fallen 0.63 | 8 | 424 | 17.7% | 73.0% | 0.0% | 9.3% | 1199 |
| ary.mini.Nimi 1.0 | 8 | 199 | 18.9% | 71.5% | 0.2% | 9.4% | 1385 |
| ary.SMG 1.01 | 8 | 647 | 23.2% | 65.2% | 1.3% | 10.3% | 1022 |
| mladjo.Grrrrr 0.9 | 8 | 1201 | 23.9% | 60.0% | 5.1% | 10.9% | 844 |
| trab.Crusader 0.1.7 | 8 | 35 | 0.0% | 100.0% | 0.0% | 0.0% | 1406 |
| kid.Toa .0.5 | 8 | 821 | 20.5% | 71.7% | 0.0% | 7.8% | 1180 |
| DM.mega.Bezier 1.618fprrr | 8 | 383 | 24.5% | 64.0% | 0.0% | 11.5% | 1706 |
| wilson.Chameleon 0.91 | 8 | 458 | 21.8% | 67.8% | 0.0% | 10.4% | 1049 |
| AIR.iRobot 1.0 | 8 | 435 | 23.0% | 67.2% | 0.2% | 9.6% | 859 |
| simonton.micro.GFMicro 1.0 | 8 | 441 | 18.4% | 72.7% | 0.0% | 8.9% | 1122 |
| mnt.AHEB 0.6a | 8 | 124 | 20.2% | 67.6% | 0.0% | 12.1% | 1265 |
| rcb.Vanessa03 0 | 8 | 489 | 21.7% | 69.1% | 0.0% | 9.1% | 938 |
| tw.Exterminator 1.0 | 8 | 1260 | 48.1% | 37.4% | 0.1% | 14.3% | 2044 |
| davidalves.net.DuelistMicroMkII 1.1 | 8 | 607 | 11.3% | 84.2% | 0.0% | 4.5% | 1009 |
| kawigi.mini.Coriantumr 1.1 | 8 | 83 | 37.7% | 47.2% | 0.0% | 15.1% | 1286 |
| stelo.Randomness 1.1 | 8 | 524 | 25.1% | 64.0% | 1.1% | 9.8% | 879 |
| nat.Hikari dev0001 | 8 | 663 | 13.2% | 80.4% | 0.0% | 6.4% | 773 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 484 | 11.6% | 82.1% | 0.0% | 6.3% | 758 |
| starpkg.StarViewerZ 1.26 | 8 | 192 | 22.8% | 63.9% | 0.3% | 13.0% | 2024 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| cx.micro.Smoke 0.96 | 8 | 8 | 0 | 0 | 0.14 | 0 | 0 | 0 |
| suh.micro.MirrorPM 1.00 | 8 | 8 | 0 | 0 | 0.08 | 0 | 0 | 0 |
| cf.proto.Shiva 2.2 | 8 | 8 | 0 | 0 | 0.08 | 0 | 0 | 0 |
| brainfade.Fallen 0.63 | 8 | 8 | 0 | 0 | 0.04 | 0 | 0 | 0 |
| ary.mini.Nimi 1.0 | 8 | 8 | 0 | 0 | 0.08 | 0 | 0 | 0 |
| ary.SMG 1.01 | 8 | 8 | 0 | 0 | 0.06 | 0 | 0 | 0 |
| mladjo.Grrrrr 0.9 | 8 | 5 | 0 | 2 | 0.15 | 3 | 1 | 0 |
| trab.Crusader 0.1.7 | 8 | 8 | 0 | 0 | 0.05 | 0 | 0 | 0 |
| kid.Toa .0.5 | 8 | 8 | 0 | 0 | 0.12 | 0 | 0 | 0 |
| DM.mega.Bezier 1.618fprrr | 8 | 7 | 0 | 1 | 0.09 | 1 | 0 | 0 |
| wilson.Chameleon 0.91 | 8 | 6 | 0 | 1 | 0.10 | 2 | 1 | 0 |
| AIR.iRobot 1.0 | 8 | 7 | 0 | 1 | 0.05 | 1 | 0 | 0 |
| simonton.micro.GFMicro 1.0 | 8 | 7 | 0 | 1 | 0.10 | 1 | 0 | 0 |
| mnt.AHEB 0.6a | 8 | 8 | 0 | 0 | 0.05 | 0 | 0 | 0 |
| rcb.Vanessa03 0 | 8 | 8 | 0 | 0 | 0.13 | 0 | 0 | 0 |
| tw.Exterminator 1.0 | 8 | 5 | 0 | 4 | 0.31 | 4 | 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 8 | 8 | 0 | 0 | 0.05 | 0 | 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 8 | 8 | 0 | 0 | 0.09 | 0 | 0 | 0 |
| stelo.Randomness 1.1 | 8 | 5 | 0 | 3 | 0.06 | 4 | 0 | 0 |
| nat.Hikari dev0001 | 8 | 7 | 0 | 1 | 0.11 | 1 | 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 8 | 8 | 0 | 0 | 0.09 | 0 | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 8 | 8 | 0 | 0 | 0.04 | 0 | 0 | 0 |

161 of 176 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| cx.micro.Smoke 0.96 | 8464 | 7 | 9565 | 8464 (100.0%) | 0 (0.0%) | 1101 (11.5%) | 429 | 61 | 46 |
| suh.micro.MirrorPM 1.00 | 31736 | 319 | 33701 | 31736 (100.0%) | 0 (0.0%) | 1965 (5.8%) | 466 | 46 | 34 |
| cf.proto.Shiva 2.2 | 12235 | 2 | 13820 | 12235 (100.0%) | 0 (0.0%) | 1585 (11.5%) | 288 | 65 | 46 |
| brainfade.Fallen 0.63 | 13216 | 3 | 17194 | 13216 (100.0%) | 0 (0.0%) | 3978 (23.1%) | 179 | 20 | 94 |
| ary.mini.Nimi 1.0 | 19348 | 2 | 21541 | 19348 (100.0%) | 0 (0.0%) | 2193 (10.2%) | 108 | 27 | 57 |
| ary.SMG 1.01 | 16575 | 77 | 16586 | 16550 (99.8%) | 25 (0.2%) | 36 (0.2%) | 564 | 75 | 23 |
| mladjo.Grrrrr 0.9 | 13134 | 9 | 13135 | 13134 (100.0%) | 0 (0.0%) | 1 (0.0%) | 697 | 74 | 50 |
| trab.Crusader 0.1.7 | 19864 | 1 | 19868 | 19863 (100.0%) | 1 (0.0%) | 5 (0.0%) | 17 | 6 | 26 |
| kid.Toa .0.5 | 11188 | 4 | 27178 | 11179 (99.9%) | 9 (0.1%) | 15999 (58.9%) | 1029 | 113 | 41 |
| DM.mega.Bezier 1.618fprrr | 31207 | 3 | 31218 | 31203 (100.0%) | 4 (0.0%) | 15 (0.0%) | 321 | 26 | 31 |
| wilson.Chameleon 0.91 | 12514 | 5 | 15524 | 12514 (100.0%) | 0 (0.0%) | 3010 (19.4%) | 169 | 75 | 50 |
| AIR.iRobot 1.0 | 13040 | 2 | 13041 | 13040 (100.0%) | 0 (0.0%) | 1 (0.0%) | 215 | 32 | 22 |
| simonton.micro.GFMicro 1.0 | 20352 | 282 | 20352 | 20352 (100.0%) | 0 (0.0%) | 0 (0.0%) | 167 | 48 | 50 |
| mnt.AHEB 0.6a | 14709 | 67 | 16667 | 14704 (100.0%) | 5 (0.0%) | 1963 (11.8%) | 126 | 9 | 53 |
| rcb.Vanessa03 0 | 8919 | 5 | 9271 | 8919 (100.0%) | 0 (0.0%) | 352 (3.8%) | 86 | 37 | 68 |
| tw.Exterminator 1.0 | 46105 | 24 | 46112 | 46104 (100.0%) | 1 (0.0%) | 8 (0.0%) | 2528 | 274 | 93 |
| davidalves.net.DuelistMicroMkII 1.1 | 10619 | 6 | 15770 | 10618 (100.0%) | 1 (0.0%) | 5152 (32.7%) | 352 | 61 | 28 |
| kawigi.mini.Coriantumr 1.1 | 11115 | 1 | 34932 | 11115 (100.0%) | 0 (0.0%) | 23817 (68.2%) | 18 | 4 | 34 |
| stelo.Randomness 1.1 | 13665 | 8 | 13665 | 13665 (100.0%) | 0 (0.0%) | 0 (0.0%) | 170 | 44 | 23 |
| nat.Hikari dev0001 | 11617 | 21 | 11685 | 11599 (99.8%) | 18 (0.2%) | 86 (0.7%) | 646 | 134 | 46 |
| apv.NanoLauLectrikTheCannibal 1.1 | 10654 | 487 | 10658 | 10653 (100.0%) | 1 (0.0%) | 5 (0.0%) | 246 | 51 | 44 |
| starpkg.StarViewerZ 1.26 | 35892 | 72 | 36385 | 35891 (100.0%) | 1 (0.0%) | 494 (1.4%) | 61 | 13 | 129 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| cx.micro.Smoke 0.96 | 6359 | 4189 (65.9%) | 1653 |
| suh.micro.MirrorPM 1.00 | 746 | 30953 (4149.2%) | 11 |
| cf.proto.Shiva 2.2 | 3996 | 8758 (219.2%) | 3018 |
| brainfade.Fallen 0.63 | 2032 | 11461 (564.0%) | 847 |
| ary.mini.Nimi 1.0 | 1676 | 17954 (1071.2%) | 875 |
| ary.SMG 1.01 | 3858 | 13275 (344.1%) | 2513 |
| mladjo.Grrrrr 0.9 | 7683 | 6606 (86.0%) | 3710 |
| trab.Crusader 0.1.7 | 272 | 19813 (7284.2%) | 0 |
| kid.Toa .0.5 | 12198 | 5625 (46.1%) | 1054 |
| DM.mega.Bezier 1.618fprrr | 4007 | 28026 (699.4%) | 2509 |
| wilson.Chameleon 0.91 | 3305 | 9499 (287.4%) | 2179 |
| AIR.iRobot 1.0 | 4211 | 9708 (230.5%) | 2325 |
| simonton.micro.GFMicro 1.0 | 4527 | 16104 (355.7%) | 3162 |
| mnt.AHEB 0.6a | 51 | 14633 (28692.2%) | 0 |
| rcb.Vanessa03 0 | 2415 | 6827 (282.7%) | 183 |
| tw.Exterminator 1.0 | 27360 | 18386 (67.2%) | 25577 |
| davidalves.net.DuelistMicroMkII 1.1 | 4958 | 7125 (143.7%) | 2588 |
| kawigi.mini.Coriantumr 1.1 | 0 | - | 0 |
| stelo.Randomness 1.1 | 3914 | 10276 (262.5%) | 2567 |
| nat.Hikari dev0001 | 5048 | 7242 (143.5%) | 3096 |
| apv.NanoLauLectrikTheCannibal 1.1 | 2693 | 8069 (299.6%) | 1789 |
| starpkg.StarViewerZ 1.26 | 1533 | 34478 (2249.1%) | 1142 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| cx.micro.Smoke 0.96 | 650 | 481 | 650 | 700 | 19.4 / 21.0 | 271 | 3355 | 208 |
| suh.micro.MirrorPM 1.00 | 650 | 465 | 581 | 1429 | 10.6 / 4.5 | 309 | 175 | 6 |
| cf.proto.Shiva 2.2 | 650 | 442 | 550 | 897 | 20.0 / 12.6 | 1076 | 1444 | 33 |
| brainfade.Fallen 0.63 | 650 | 349 | 650 | 1049 | 6.2 / 8.8 | 330 | 338 | 0 |
| ary.mini.Nimi 1.0 | 650 | 493 | 650 | 1235 | 4.2 / 4.1 | 58 | 329 | 0 |
| ary.SMG 1.01 | 650 | 296 | 650 | 872 | 12.2 / 12.1 | 231 | 1668 | 84 |
| mladjo.Grrrrr 0.9 | 650 | 437 | 650 | 696 | 19.2 / 20.6 | 226 | 2166 | 2411 |
| trab.Crusader 0.1.7 | 650 | 383 | 650 | 1256 | 0.0 / 1.0 | 0 | 0 | 0 |
| kid.Toa .0.5 | 650 | 437 | 463 | 1030 | 32.9 / 16.8 | 1204 | 298 | 33 |
| DM.mega.Bezier 1.618fprrr | 650 | 501 | 631 | 1558 | 4.4 / 7.0 | 33 | 5007 | 89 |
| wilson.Chameleon 0.91 | 650 | 468 | 597 | 903 | 13.3 / 8.9 | 545 | 1930 | 0 |
| AIR.iRobot 1.0 | 650 | 477 | 638 | 708 | 9.7 / 8.3 | 138 | 1881 | 1515 |
| simonton.micro.GFMicro 1.0 | 650 | 409 | 519 | 975 | 22.6 / 9.2 | 397 | 1827 | 337 |
| mnt.AHEB 0.6a | 650 | 353 | 650 | 1115 | 0.0 / 2.4 | 0 | 0 | 0 |
| rcb.Vanessa03 0 | 650 | 359 | 588 | 788 | 11.7 / 9.7 | 438 | 2169 | 32 |
| tw.Exterminator 1.0 | 650 | 478 | 494 | 1897 | 47.9 / 13.5 | 3049 | 846 | 1189 |
| davidalves.net.DuelistMicroMkII 1.1 | 650 | 451 | 594 | 860 | 19.0 / 14.6 | 731 | 2174 | 62 |
| kawigi.mini.Coriantumr 1.1 | 650 | 530 | 650 | 1136 | 0.1 / 1.1 | 0 | 0 | 0 |
| stelo.Randomness 1.1 | 650 | 433 | 588 | 731 | 13.8 / 9.6 | 654 | 1283 | 336 |
| nat.Hikari dev0001 | 650 | 345 | 650 | 623 | 22.1 / 15.2 | 879 | 1962 | 1096 |
| apv.NanoLauLectrikTheCannibal 1.1 | 650 | 352 | 569 | 608 | 23.4 / 11.4 | 1137 | 2822 | 347 |
| starpkg.StarViewerZ 1.26 | 650 | 417 | 619 | 1874 | 6.3 / 3.5 | 140 | 782 | 2 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| cx.micro.Smoke 0.96 | 4.9% | 38 | 5492 | 3 | 16.3 | 423 / 4189 (10%) | 0 | 0 |
| suh.micro.MirrorPM 1.00 | 4.4% | 23 | 184 | 3 | 1.6 | 30 / 30953 (0%) | 0 | 0 |
| cf.proto.Shiva 2.2 | 3.8% | 23 | 181 | 3 | 12.7 | 367 / 8758 (4%) | 0 | 0 |
| brainfade.Fallen 0.63 | 2.9% | 12 | 421 | 2 | 6.3 | 143 / 11461 (1%) | 0 | 0 |
| ary.mini.Nimi 1.0 | 1.5% | 23 | 216 | 3 | 5.4 | 174 / 17954 (1%) | 0 | 0 |
| ary.SMG 1.01 | 3.9% | 17 | 373 | 3 | 12.5 | 331 / 13275 (2%) | 0 | 0 |
| mladjo.Grrrrr 0.9 | 5.7% | 42 | 6682 | 3 | 24.5 | 628 / 6606 (10%) | 0 | 0 |
| trab.Crusader 0.1.7 | 0.2% | 15 | 238 | 3 | 0.0 | 0 / 19813 (0%) | 0 | 0 |
| kid.Toa .0.5 | 4.5% | 33 | 274 | 3 | 27.8 | 409 / 5625 (7%) | 0 | 0 |
| DM.mega.Bezier 1.618fprrr | 3.0% | 26 | 336 | 3 | 12.1 | 371 / 28026 (1%) | 0 | 0 |
| wilson.Chameleon 0.91 | 3.3% | 28 | 373 | 3 | 10.6 | 259 / 9499 (3%) | 0 | 0 |
| AIR.iRobot 1.0 | 1.9% | 15 | 402 | 2 | 12.3 | 280 / 9708 (3%) | 0 | 0 |
| simonton.micro.GFMicro 1.0 | 5.0% | 27 | 367 | 3 | 14.8 | 383 / 16104 (2%) | 0 | 0 |
| mnt.AHEB 0.6a | 2.0% | 13 | 215 | 3 | 0.0 | 0 / 14633 (0%) | 0 | 0 |
| rcb.Vanessa03 0 | 2.8% | 36 | 493 | 3 | 7.2 | 118 / 6827 (2%) | 0 | 0 |
| tw.Exterminator 1.0 | 7.8% | 87 | 809 | 3 | 105.7 | 2701 / 18386 (15%) | 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 3.4% | 13 | 5416 | 2 | 13.3 | 315 / 7125 (4%) | 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 0.2% | 25 | 198 | 3 | 0.0 | 0 / 11076 (0%) | 0 | 0 |
| stelo.Randomness 1.1 | 2.8% | 17 | 4496 | 2 | 12.3 | 321 / 10276 (3%) | 0 | 0 |
| nat.Hikari dev0001 | 5.1% | 32 | 203 | 3 | 16.6 | 455 / 7242 (6%) | 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 7.4% | 25 | 171 | 3 | 8.2 | 221 / 8069 (3%) | 0 | 0 |
| starpkg.StarViewerZ 1.26 | 2.0% | 10 | 355 | 2 | 5.3 | 120 / 34478 (0%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| cx.micro.Smoke 0.96 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| suh.micro.MirrorPM 1.00 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| cf.proto.Shiva 2.2 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| brainfade.Fallen 0.63 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ary.mini.Nimi 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| ary.SMG 1.01 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mladjo.Grrrrr 0.9 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| trab.Crusader 0.1.7 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kid.Toa .0.5 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| DM.mega.Bezier 1.618fprrr | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| wilson.Chameleon 0.91 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| AIR.iRobot 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| simonton.micro.GFMicro 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| mnt.AHEB 0.6a | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| rcb.Vanessa03 0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| tw.Exterminator 1.0 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| davidalves.net.DuelistMicroMkII 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| kawigi.mini.Coriantumr 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| stelo.Randomness 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| nat.Hikari dev0001 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| apv.NanoLauLectrikTheCannibal 1.1 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |
| starpkg.StarViewerZ 1.26 | 0 / 8 | 0 | 0 | T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M?, T?/M? | live, live, live, live, live, live, live, live | 0 / 0 | 0 |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| AIR.iRobot 1.0 | hadur2.Hadur 3.13tr | 8 | 95.0% ± 7.7 | 93.6% ± 6.3 | -1.4 ± 12.3 | 71.2% ± 6.6 | 58.2% ± 5.7 | -13.0 ± 8.6 |
| AIR.iRobot 1.0 | hadur2.Hadur 3.13 | 8 | 76.9% ± 5.9 | 97.5% ± 5.9 | +20.6 ± 1.5 | 8.3% ± 8.2 | 52.4% ± 37.0 | +41.9 ± 32.7 |
| DM.mega.Bezier 1.618fprrr | hadur2.Hadur 3.13tr | 8 | 92.5% ± 8.7 | 88.8% ± 7.0 | -3.7 ± 11.8 | 59.1% ± 7.4 | 57.7% ± 7.9 | -1.4 ± 11.5 |
| DM.mega.Bezier 1.618fprrr | hadur2.Hadur 3.13 | 8 | 97.5% ± 5.9 | 91.1% ± 5.4 | -6.4 ± 4.4 | 13.2% ± 56.8 | 26.8% ± 31.3 | +50.1 ± 76.8 |
| apv.NanoLauLectrikTheCannibal 1.1 | hadur2.Hadur 3.13tr | 8 | 97.5% ± 5.9 | 96.2% ± 6.2 | -1.2 ± 9.4 | 68.0% ± 7.9 | 72.7% ± 5.7 | +4.7 ± 10.8 |
| apv.NanoLauLectrikTheCannibal 1.1 | hadur2.Hadur 3.13 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 17.8% ± 14.0 | 65.6% ± 19.6 | +47.8 ± 23.1 |
| ary.SMG 1.01 | hadur2.Hadur 3.13tr | 8 | 82.5% ± 5.9 | 90.9% ± 5.5 | +8.4 ± 8.3 | 68.3% ± 8.5 | 54.6% ± 3.5 | -13.7 ± 8.2 |
| ary.SMG 1.01 | hadur2.Hadur 3.13 | 8 | 95.0% ± 7.7 | 85.0% ± 10.9 | -10.0 ± 10.0 | 1.3% ± 3.1 | 43.4% ± 19.8 | +42.1 ± 22.0 |
| ary.mini.Nimi 1.0 | hadur2.Hadur 3.13tr | 8 | 87.5% ± 12.4 | 91.3% ± 5.4 | +3.8 ± 14.1 | 65.1% ± 8.6 | 62.0% ± 7.8 | -3.1 ± 4.3 |
| ary.mini.Nimi 1.0 | hadur2.Hadur 3.13 | 8 | 97.5% ± 5.9 | 96.3% ± 4.3 | -1.2 ± 5.4 | 0.0% ± 0.0 | 19.6% ± 84.2 | +29.3 ± 372.9 |
| brainfade.Fallen 0.63 | hadur2.Hadur 3.13tr | 8 | 87.5% ± 8.7 | 87.4% ± 13.9 | -0.1 ± 14.1 | 60.0% ± 6.2 | 59.1% ± 6.4 | -0.9 ± 8.3 |
| brainfade.Fallen 0.63 | hadur2.Hadur 3.13 | 8 | 100.0% ± 0.0 | 90.0% ± 7.7 | -10.0 ± 7.7 | 2.3% ± 10.0 | 36.4% ± 29.2 | +42.3 ± 126.3 |
| cf.proto.Shiva 2.2 | hadur2.Hadur 3.13tr | 8 | 77.5% ± 14.0 | 86.1% ± 9.9 | +8.6 ± 16.2 | 42.2% ± 5.6 | 49.6% ± 8.3 | +7.5 ± 7.9 |
| cf.proto.Shiva 2.2 | hadur2.Hadur 3.13 | 8 | 82.5% ± 14.0 | 92.5% ± 5.9 | +10.0 ± 15.5 | 3.1% ± 3.6 | 58.6% ± 16.2 | +57.2 ± 19.1 |
| cx.micro.Smoke 0.96 | hadur2.Hadur 3.13tr | 8 | 92.5% ± 8.7 | 92.5% ± 5.9 | +0.0 ± 8.9 | 59.3% ± 8.5 | 58.9% ± 5.3 | -0.4 ± 8.5 |
| cx.micro.Smoke 0.96 | hadur2.Hadur 3.13 | 8 | 82.5% ± 16.6 | 88.8% ± 9.4 | +6.2 ± 20.9 | 3.7% ± 7.1 | 52.9% ± 7.4 | +49.2 ± 12.3 |
| davidalves.net.DuelistMicroMkII 1.1 | hadur2.Hadur 3.13tr | 8 | 92.5% ± 8.7 | 95.0% ± 6.3 | +2.5 ± 7.4 | 56.4% ± 7.2 | 67.8% ± 6.2 | +11.4 ± 5.4 |
| davidalves.net.DuelistMicroMkII 1.1 | hadur2.Hadur 3.13 | 8 | 95.0% ± 7.7 | 96.3% ± 4.3 | +1.2 ± 8.3 | 4.1% ± 4.5 | 59.6% ± 15.5 | +61.7 ± 4.4 |
| kawigi.mini.Coriantumr 1.1 | hadur2.Hadur 3.13tr | 8 | 95.0% ± 7.7 | 100.0% ± 0.0 | +5.0 ± 7.7 | 70.2% ± 6.7 | 82.8% ± 3.6 | +12.6 ± 8.0 |
| kawigi.mini.Coriantumr 1.1 | hadur2.Hadur 3.13 | 8 | 97.5% ± 5.9 | 98.8% ± 3.0 | +1.2 ± 7.0 | 31.3% ± 74.3 | 76.2% ± 36.9 | +68.7 ± 74.3 |
| kid.Toa .0.5 | hadur2.Hadur 3.13tr | 8 | 97.5% ± 5.9 | 86.3% ± 9.9 | -11.2 ± 13.7 | 71.6% ± 7.9 | 75.5% ± 7.2 | +4.0 ± 7.2 |
| kid.Toa .0.5 | hadur2.Hadur 3.13 | 8 | 90.0% ± 15.5 | 90.0% ± 8.9 | +0.0 ± 17.9 | 1.7% ± 3.9 | 74.3% ± 5.0 | +72.6 ± 5.3 |
| mladjo.Grrrrr 0.9 | hadur2.Hadur 3.13tr | 8 | 85.0% ± 17.3 | 90.0% ± 6.3 | +5.0 ± 18.4 | 61.6% ± 8.5 | 57.6% ± 5.6 | -4.0 ± 10.6 |
| mladjo.Grrrrr 0.9 | hadur2.Hadur 3.13 | 8 | 65.0% ± 11.8 | 85.7% ± 10.2 | +20.7 ± 11.8 | 1.1% ± 2.6 | 43.4% ± 18.4 | +42.1 ± 18.6 |
| mnt.AHEB 0.6a | hadur2.Hadur 3.13tr | 8 | 87.5% ± 8.7 | 96.3% ± 4.3 | +8.7 ± 7.0 | 59.1% ± 6.8 | 67.7% ± 4.3 | +8.6 ± 10.2 |
| mnt.AHEB 0.6a | hadur2.Hadur 3.13 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | 0.0% ± 0.0 | 0.3% ± 0.7 | +0.0 ± 0.0 |
| nat.Hikari dev0001 | hadur2.Hadur 3.13tr | 8 | 95.0% ± 11.8 | 92.5% ± 5.9 | -2.5 ± 15.3 | 59.4% ± 7.4 | 70.3% ± 3.7 | +10.9 ± 5.9 |
| nat.Hikari dev0001 | hadur2.Hadur 3.13 | 8 | 97.5% ± 5.9 | 91.3% ± 7.0 | -6.2 ± 8.9 | 0.0% ± 0.0 | 67.5% ± 5.8 | +67.5 ± 5.8 |
| rcb.Vanessa03 0 | hadur2.Hadur 3.13tr | 8 | 95.0% ± 7.7 | 92.5% ± 7.4 | -2.5 ± 9.7 | 53.5% ± 9.0 | 64.3% ± 4.7 | +10.7 ± 12.2 |
| rcb.Vanessa03 0 | hadur2.Hadur 3.13 | 8 | 80.0% ± 8.9 | 95.0% ± 6.3 | +15.0 ± 10.9 | 4.9% ± 8.6 | 52.3% ± 24.0 | +46.7 ± 25.6 |
| simonton.micro.GFMicro 1.0 | hadur2.Hadur 3.13tr | 8 | 80.0% ± 0.0 | 100.0% ± 0.0 | +20.0 ± 0.0 | 79.7% ± 5.8 | 74.2% ± 3.4 | -5.5 ± 8.1 |
| simonton.micro.GFMicro 1.0 | hadur2.Hadur 3.13 | 8 | 92.5% ± 8.7 | 97.5% ± 3.9 | +5.0 ± 10.9 | 17.3% ± 12.3 | 51.9% ± 33.3 | +34.6 ± 36.7 |
| starpkg.StarViewerZ 1.26 | hadur2.Hadur 3.13tr | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 79.0% ± 6.3 | 86.8% ± 2.2 | +7.8 ± 4.6 |
| starpkg.StarViewerZ 1.26 | hadur2.Hadur 3.13 | 8 | 100.0% ± 0.0 | 98.8% ± 3.0 | -1.2 ± 3.0 | - | 41.7% ± 76.8 | n/a |
| stelo.Randomness 1.1 | hadur2.Hadur 3.13tr | 8 | 95.0% ± 11.8 | 100.0% ± 0.0 | +5.0 ± 11.8 | 63.4% ± 10.2 | 73.9% ± 3.1 | +10.4 ± 11.8 |
| stelo.Randomness 1.1 | hadur2.Hadur 3.13 | 8 | 92.5% ± 8.7 | 96.3% ± 4.3 | +3.7 ± 9.9 | 0.1% ± 0.3 | 44.7% ± 30.9 | +55.2 ± 58.6 |
| suh.micro.MirrorPM 1.00 | hadur2.Hadur 3.13tr | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 84.9% ± 5.7 | 84.7% ± 2.3 | -0.2 ± 6.9 |
| suh.micro.MirrorPM 1.00 | hadur2.Hadur 3.13 | 8 | 90.0% ± 12.6 | 95.0% ± 7.7 | +5.0 ± 14.8 | 35.7% ± 31.2 | 39.6% ± 35.6 | +3.9 ± 45.8 |
| trab.Crusader 0.1.7 | hadur2.Hadur 3.13tr | 8 | 85.0% ± 7.7 | 89.7% ± 10.0 | +4.7 ± 12.6 | 52.8% ± 6.3 | 53.9% ± 7.6 | +1.1 ± 7.1 |
| trab.Crusader 0.1.7 | hadur2.Hadur 3.13 | 8 | 100.0% ± 0.0 | 100.0% ± 0.0 | +0.0 ± 0.0 | 0.0% ± 0.0 | 0.0% ± 0.0 | +0.0 |
| tw.Exterminator 1.0 | hadur2.Hadur 3.13tr | 8 | 85.0% ± 11.8 | 68.5% ± 15.6 | -16.5 ± 20.3 | 88.4% ± 3.2 | 82.1% ± 5.0 | -6.2 ± 4.2 |
| tw.Exterminator 1.0 | hadur2.Hadur 3.13 | 8 | 87.5% ± 8.7 | 64.3% ± 16.7 | -23.2 ± 11.2 | 13.7% ± 17.0 | 83.1% ± 5.2 | +69.4 ± 19.5 |
| wilson.Chameleon 0.91 | hadur2.Hadur 3.13tr | 8 | 90.0% ± 8.9 | 96.3% ± 6.2 | +6.2 ± 9.9 | 70.5% ± 4.7 | 73.8% ± 4.5 | +3.3 ± 5.4 |
| wilson.Chameleon 0.91 | hadur2.Hadur 3.13 | 8 | 95.0% ± 7.7 | 93.6% ± 6.3 | -1.4 ± 8.4 | 16.8% ± 22.0 | 30.9% ± 28.1 | +14.1 ± 19.1 |

### Candidate minus baseline, by window (pp)

Seed for seed, so it shows whether the change helped the cold start, the mature model, or both.

| Opponent | Win rate, first 5 | Win rate, last 10 | Damage share, first 5 | Damage share, last 10 |
|---|---|---|---|---|
| AIR.iRobot 1.0 | +18.1 ± 10.9 | -3.9 ± 7.8 | +62.9 ± 9.6 | +9.8 ± 36.6 |
| DM.mega.Bezier 1.618fprrr | -5.0 ± 11.8 | -2.4 ± 5.8 | +47.6 ± 80.5 | +28.2 ± 37.3 |
| apv.NanoLauLectrikTheCannibal 1.1 | +0.0 ± 8.9 | -2.5 ± 7.4 | +50.2 ± 16.8 | +7.1 ± 23.1 |
| ary.SMG 1.01 | -12.5 ± 8.7 | +5.9 ± 7.6 | +67.0 ± 8.5 | +11.2 ± 17.5 |
| ary.mini.Nimi 1.0 | -10.0 ± 15.5 | -5.0 ± 4.5 | +70.0 ± 10.6 | +44.1 ± 63.2 |
| brainfade.Fallen 0.63 | -12.5 ± 8.7 | -2.6 ± 7.4 | +59.5 ± 20.3 | +22.6 ± 29.5 |
| cf.proto.Shiva 2.2 | -5.0 ± 11.8 | -6.4 ± 14.0 | +40.2 ± 7.6 | -7.0 ± 23.0 |
| cx.micro.Smoke 0.96 | +10.0 ± 15.5 | +3.8 ± 11.8 | +55.5 ± 10.3 | +6.0 ± 10.1 |
| davidalves.net.DuelistMicroMkII 1.1 | -2.5 ± 10.7 | -1.2 ± 5.4 | +51.9 ± 7.7 | +8.2 ± 14.6 |
| kawigi.mini.Coriantumr 1.1 | -2.5 ± 10.7 | +1.2 ± 3.0 | +41.3 ± 66.0 | +6.6 ± 38.5 |
| kid.Toa .0.5 | +7.5 ± 12.4 | -3.7 ± 7.7 | +69.9 ± 10.2 | +1.3 ± 6.5 |
| mladjo.Grrrrr 0.9 | +20.0 ± 17.9 | +4.3 ± 10.2 | +60.5 ± 8.8 | +12.6 ± 19.3 |
| mnt.AHEB 0.6a | -12.5 ± 8.7 | -2.5 ± 5.9 | +58.1 ± 13.0 | +70.0 ± 4.9 |
| nat.Hikari dev0001 | -2.5 ± 5.9 | +1.2 ± 8.3 | +59.4 ± 7.4 | +2.8 ± 6.7 |
| rcb.Vanessa03 0 | +15.0 ± 7.7 | -2.5 ± 9.7 | +48.6 ± 11.8 | +13.6 ± 25.0 |
| simonton.micro.GFMicro 1.0 | -12.5 ± 8.7 | +2.5 ± 3.9 | +62.4 ± 11.3 | +22.3 ± 32.1 |
| starpkg.StarViewerZ 1.26 | +0.0 ± 0.0 | +1.2 ± 3.0 | n/a | +45.9 ± 73.8 |
| stelo.Randomness 1.1 | +2.5 ± 16.6 | +3.7 ± 4.3 | +62.7 ± 12.5 | +29.1 ± 29.6 |
| suh.micro.MirrorPM 1.00 | +10.0 ± 12.6 | +5.0 ± 7.7 | +49.2 ± 31.9 | +45.0 ± 35.0 |
| trab.Crusader 0.1.7 | -15.0 ± 7.7 | -10.3 ± 10.0 | +45.3 ± 96.2 | +52.9 ± 9.2 |
| tw.Exterminator 1.0 | -2.5 ± 14.0 | +4.2 ± 20.7 | +74.7 ± 18.0 | -1.0 ± 7.3 |
| wilson.Chameleon 0.91 | -5.0 ± 14.8 | +2.6 ± 10.8 | +53.7 ± 22.9 | +43.0 ± 27.2 |
