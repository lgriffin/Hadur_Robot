# Bench: hadur117.Hadur 3.19aror (cold)

35 rounds x 1 seeds (data wiped) per opponent on 800x600. Engine Robocode 1.11.1, security manager on. Java 21.0.12.1, 4 cores. robocode.cpu.constant=3105745. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Shares are Hadur's fraction of the two robots' total, mean ± 95% interval over battles.

Skipped turns: 217 over 50 battles (4.3 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| Opponent | Role | Score share | Survival share | Bullet-damage share | Rounds won | Our hit rate | Their hit rate | Skipped turns | Faults | Turn p95 / max (ms) |
|---|---|---|---|---|---|---|---|---|---|---|
| nz.jdc.micro.HedgehogGF 1.5 | rank114-band3 | 94.7% | 97.1% | 2.0% | 34 / 35 | 0.0% | 2.5% | 6 | 0 | 0.63 / 59.9 |
| whind.Strength 0.6.4 | rank285-band4 | 97.2% | 100.0% | 0.0% | 35 / 35 | 0.0% | 0.3% | 2 | 0 | 1.03 / 35.3 |
| sqTank.waveSurfing.LionWWSVMvoid 0.01 | rank384-band4 | 99.2% | 100.0% | 98.2% | 35 / 35 | 15.4% | 0.5% | 4 | 0 | 0.97 / 36.2 |
| squidM.SurfinUSA 1.0 | rank411-band5 | 97.9% | 100.0% | 94.5% | 35 / 35 | 13.2% | 0.8% | 6 | 0 | 1.34 / 36.3 |
| And.BasicSurfer FF1.6 | rank466-band5 | 97.8% | 100.0% | 94.9% | 35 / 35 | 14.0% | 1.1% | 17 | 0 | 1.50 / 85.4 |
| wiki.nano.Flick 1.0 | rank529-band5 | 95.4% | 88.6% | 99.3% | 31 / 35 | 19.4% | 1.8% | 16 | 0 | 1.28 / 105.9 |
| ahr.ice.Ice 1.0 | rank556-band5 | 94.5% | 97.1% | 91.4% | 34 / 35 | 26.3% | 2.3% | 15 | 0 | 2.51 / 363.8 |
| mcb.Audace 1.3 | rank574-band5 | 91.1% | 100.0% | 83.5% | 35 / 35 | 40.3% | 6.5% | 2 | 0 | 1.34 / 26.5 |
| radnor.DoctorBob 1.42 | rank600-band5 | 99.3% | 100.0% | 98.5% | 35 / 35 | 32.0% | 0.9% | 2 | 0 | 1.23 / 30.3 |
| voidious.perceptual.RetroGirl 1.0.0 | rank625-band5 | 96.0% | 100.0% | 91.3% | 35 / 35 | 15.8% | 1.9% | 0 | 0 | 0.86 / 70.8 |
| josago.Jorgito 0.16 | rank640-band5 | 89.0% | 94.3% | 84.0% | 33 / 35 | 21.7% | 8.3% | 5 | 0 | 1.39 / 41.9 |
| sam.ChipmunkDuelist 1.0 | rank661-band5 | 94.5% | 100.0% | 88.6% | 35 / 35 | 20.8% | 3.7% | 3 | 0 | 1.05 / 38.4 |
| banshee.micro.Nexus6 0.3.0 | rank671-band5 | 97.9% | 100.0% | 95.5% | 35 / 35 | 24.2% | 1.1% | 2 | 0 | 0.92 / 30.3 |
| wiki.nano.DevilFISH 1.0 | rank692-band5 | 98.4% | 100.0% | 96.7% | 35 / 35 | 32.7% | 1.4% | 6 | 0 | 1.13 / 70.0 |
| ahf.NanoAndrew .4 | rank703-band6 | 99.3% | 100.0% | 98.6% | 35 / 35 | 44.0% | 0.8% | 2 | 0 | 1.07 / 55.2 |
| suh.nano.OscillatorL 1.00 | rank721-band6 | 99.4% | 100.0% | 98.7% | 35 / 35 | 27.7% | 0.5% | 2 | 0 | 1.38 / 52.5 |
| pez.nano.Icarus 0.3 | rank731-band6 | 97.5% | 100.0% | 93.9% | 35 / 35 | 15.7% | 1.4% | 2 | 0 | 1.09 / 33.4 |
| sul.NanoR2 1.32 | rank743-band6 | 93.7% | 100.0% | 84.2% | 35 / 35 | 14.8% | 2.4% | 8 | 0 | 1.17 / 25.8 |
| supersample.SuperCorners 1.0 | rank766-band6 | 92.5% | 100.0% | 85.9% | 35 / 35 | 35.8% | 6.1% | 6 | 0 | 1.55 / 24.5 |
| bots.UnterExBot 1.0 | rank775-band6 | 98.6% | 100.0% | 97.2% | 35 / 35 | 23.1% | 1.5% | 4 | 0 | 1.14 / 52.2 |
| geep.mini.GPBotA 1.0 | rank789-band6 | 98.3% | 100.0% | 96.2% | 35 / 35 | 27.8% | 1.4% | 4 | 0 | 1.20 / 39.6 |
| jaybot.adv.bots.JayBot 2.0 | rank799-band6 | 96.2% | 100.0% | 91.7% | 35 / 35 | 19.3% | 2.2% | 9 | 0 | 1.38 / 59.3 |
| mmb.Roskilde 0.5 | rank818-band6 | 99.2% | 100.0% | 98.6% | 35 / 35 | 20.6% | 0.9% | 7 | 0 | 1.10 / 48.0 |
| suh.nano.MirrorL 1.00 | rank831-band6 | 96.9% | 100.0% | 94.2% | 35 / 35 | 43.5% | 6.2% | 3 | 0 | 1.27 / 37.3 |
| mdouet.BotKicker 2.0 | rank848-band6 | 95.1% | 100.0% | 89.7% | 35 / 35 | 19.3% | 3.0% | 4 | 0 | 1.11 / 44.5 |
| extra.Sauce .01 | rank861-band6 | 100.0% | 100.0% | 100.0% | 35 / 35 | 25.3% | 0.2% | 2 | 0 | 1.08 / 19.4 |
| apollokidd.ApolloKidd 0.9 | rank872-band6 | 95.9% | 100.0% | 92.6% | 35 / 35 | 52.3% | 5.2% | 5 | 0 | 1.49 / 30.0 |
| knackibot.KnackOnOne 0.8.1 | rank882-band6 | 96.7% | 100.0% | 92.7% | 35 / 35 | 16.9% | 2.1% | 1 | 0 | 1.25 / 28.0 |
| hlavko.nano.Phoenix 1.0 | rank893-band6 | 97.9% | 100.0% | 95.5% | 35 / 35 | 25.1% | 1.5% | 6 | 0 | 1.28 / 20.8 |
| velas.Beta_2_0 2.0 | rank904-band6 | 91.6% | 100.0% | 82.7% | 35 / 35 | 22.9% | 4.7% | 2 | 0 | 1.22 / 29.4 |
| WidowMakersAtWar.EpicCow 1.0 | rank912-band6 | 99.9% | 100.0% | 99.7% | 35 / 35 | 34.8% | 0.2% | 2 | 0 | 1.09 / 41.7 |
| suh.nano.MirrorH 1.01 | rank922-band6 | 95.5% | 100.0% | 91.8% | 35 / 35 | 38.8% | 8.8% | 0 | 0 | 1.01 / 24.4 |
| zyx.nano.Ant 1.1 | rank940-band6 | 99.3% | 100.0% | 98.5% | 35 / 35 | 30.9% | 0.7% | 2 | 0 | 1.05 / 22.7 |
| sng.arco.Arco 0.0 | rank958-band6 | 97.8% | 100.0% | 95.9% | 35 / 35 | 23.6% | 2.1% | 2 | 0 | 1.05 / 38.9 |
| suh.nano.CrossC 1.00 | rank975-band6 | 97.8% | 100.0% | 95.7% | 35 / 35 | 34.9% | 2.8% | 2 | 0 | 1.18 / 21.8 |
| eskimo.micro.Echo 0.1 | rank984-band6 | 99.8% | 100.0% | 99.6% | 35 / 35 | 33.1% | 0.2% | 3 | 0 | 1.21 / 44.0 |
| com.timothyveletta.FuzzyBot 1.1 | rank996-band6 | 98.5% | 100.0% | 97.0% | 35 / 35 | 36.8% | 1.8% | 7 | 0 | 1.21 / 17.5 |
| suh.nano.CrossL 1.00 | rank1015-band6 | 99.5% | 100.0% | 99.1% | 35 / 35 | 34.5% | 0.6% | 11 | 0 | 1.08 / 36.3 |
| discan.mini.Exode 0.25 | rank1030-band6 | 97.2% | 100.0% | 94.4% | 35 / 35 | 22.0% | 1.9% | 0 | 0 | 1.24 / 22.6 |
| ao.T100 0.9 | rank1042-band6 | 99.7% | 100.0% | 99.5% | 35 / 35 | 22.4% | 1.3% | 5 | 0 | 1.26 / 35.3 |
| pa.Improved 1.1 | rank1060-band6 | 98.8% | 100.0% | 97.7% | 35 / 35 | 21.4% | 0.7% | 6 | 0 | 1.06 / 24.0 |
| braaropolis.Abot 1.0 | rank1071-band6 | 97.1% | 100.0% | 94.3% | 35 / 35 | 33.5% | 3.3% | 4 | 0 | 1.03 / 21.3 |
| oa.weak.FlyMk1 0.1 | rank1088-band6 | 97.0% | 100.0% | 95.0% | 35 / 35 | 34.8% | 3.0% | 4 | 0 | 1.04 / 26.3 |
| kanishk.Fr0z3n 1.1 | rank1101-band6 | 99.9% | 100.0% | 99.8% | 35 / 35 | 30.1% | 1.1% | 4 | 0 | 0.78 / 19.8 |
| mwj.A1176183 1.0 | rank1129-band6 | 100.0% | 100.0% | 100.0% | 35 / 35 | 35.6% | 0.0% | 2 | 0 | 0.76 / 37.2 |
| reeder.caden.Elmo 1 | rank1145-band6 | 99.5% | 100.0% | 99.1% | 35 / 35 | 38.6% | 0.7% | 2 | 0 | 1.20 / 18.7 |
| sample.MyFirstJuniorRobot 1.0 | rank1153-band6 | 98.7% | 100.0% | 97.6% | 35 / 35 | 25.3% | 2.8% | 5 | 0 | 1.03 / 38.0 |
| sample.MyFirstRobot 1.0 | rank1167-band6 | 100.0% | 100.0% | 100.0% | 35 / 35 | 48.9% | 0.0% | 0 | 0 | 0.87 / 15.6 |
| mym.EdgeStalker 1.0 | rank1176-band6 | 99.8% | 100.0% | 99.9% | 35 / 35 | 57.5% | 5.2% | 2 | 0 | 0.95 / 36.1 |
| paket.MojRobot 1.0 | rank1190-band6 | 100.0% | 100.0% | 100.0% | 35 / 35 | 37.4% | 0.0% | 1 | 0 | 0.89 / 79.4 |

## Where their points come from

The opponent's score split by source, pooled over the battles: survival, bullet damage, ram damage, and the bonuses (last survivor, bullet-damage and ram-damage), each as a share of the opponent's total. A robot that scores mostly from survival is outliving us; one that scores from bullet damage is out-shooting us; a share in ram damage means it is ramming. "-" means no battle carried the split (rows from before issue #138). Ticks per round are the engine's own count, for any build.

| Opponent | Battles | Their score | Survival | Bullet damage | Ram damage | Bonuses | Ticks / round |
|---|---|---|---|---|---|---|---|
| nz.jdc.micro.HedgehogGF 1.5 | 1 | 114 | 43.9% | 42.1% | 0.0% | 14.0% | 1149 |
| whind.Strength 0.6.4 | 1 | 60 | 0.0% | 100.0% | 0.0% | 0.0% | 949 |
| sqTank.waveSurfing.LionWWSVMvoid 0.01 | 1 | 38 | 0.0% | 100.0% | 0.0% | 0.0% | 758 |
| squidM.SurfinUSA 1.0 | 1 | 84 | 0.0% | 100.0% | 0.0% | 0.0% | 605 |
| And.BasicSurfer FF1.6 | 1 | 92 | 0.0% | 100.0% | 0.0% | 0.0% | 677 |
| wiki.nano.Flick 1.0 | 1 | 264 | 75.8% | 8.7% | 0.0% | 15.5% | 1226 |
| ahr.ice.Ice 1.0 | 1 | 262 | 19.1% | 74.4% | 0.8% | 5.7% | 434 |
| mcb.Audace 1.3 | 1 | 512 | 0.0% | 100.0% | 0.0% | 0.0% | 352 |
| radnor.DoctorBob 1.42 | 1 | 39 | 0.0% | 100.0% | 0.0% | 0.0% | 407 |
| voidious.perceptual.RetroGirl 1.0.0 | 1 | 183 | 0.0% | 100.0% | 0.0% | 0.0% | 697 |
| josago.Jorgito 0.16 | 1 | 623 | 16.1% | 77.8% | 0.2% | 5.9% | 601 |
| sam.ChipmunkDuelist 1.0 | 1 | 272 | 0.0% | 100.0% | 0.0% | 0.0% | 488 |
| banshee.micro.Nexus6 0.3.0 | 1 | 99 | 0.0% | 99.0% | 1.0% | 0.0% | 420 |
| wiki.nano.DevilFISH 1.0 | 1 | 84 | 0.0% | 100.0% | 0.0% | 0.0% | 407 |
| ahf.NanoAndrew .4 | 1 | 38 | 0.0% | 100.0% | 0.0% | 0.0% | 355 |
| suh.nano.OscillatorL 1.00 | 1 | 30 | 0.0% | 100.0% | 0.0% | 0.0% | 417 |
| pez.nano.Icarus 0.3 | 1 | 102 | 0.0% | 100.0% | 0.0% | 0.0% | 558 |
| sul.NanoR2 1.32 | 1 | 247 | 0.0% | 100.0% | 0.0% | 0.0% | 526 |
| supersample.SuperCorners 1.0 | 1 | 412 | 0.0% | 98.8% | 1.2% | 0.0% | 410 |
| bots.UnterExBot 1.0 | 1 | 68 | 0.0% | 100.0% | 0.0% | 0.0% | 483 |
| geep.mini.GPBotA 1.0 | 1 | 77 | 0.0% | 100.0% | 0.0% | 0.0% | 389 |
| jaybot.adv.bots.JayBot 2.0 | 1 | 178 | 0.0% | 100.0% | 0.0% | 0.0% | 508 |
| mmb.Roskilde 0.5 | 1 | 40 | 0.0% | 90.0% | 10.0% | 0.0% | 582 |
| suh.nano.MirrorL 1.00 | 1 | 182 | 0.0% | 100.0% | 0.0% | 0.0% | 369 |
| mdouet.BotKicker 2.0 | 1 | 232 | 0.0% | 100.0% | 0.0% | 0.0% | 520 |
| extra.Sauce .01 | 1 | 1 | 0.0% | 0.0% | 100.0% | 0.0% | 397 |
| apollokidd.ApolloKidd 0.9 | 1 | 244 | 0.0% | 99.2% | 0.8% | 0.0% | 345 |
| knackibot.KnackOnOne 0.8.1 | 1 | 148 | 0.0% | 100.0% | 0.0% | 0.0% | 582 |
| hlavko.nano.Phoenix 1.0 | 1 | 97 | 0.0% | 94.8% | 5.2% | 0.0% | 401 |
| velas.Beta_2_0 2.0 | 1 | 400 | 0.0% | 98.5% | 1.5% | 0.0% | 446 |
| WidowMakersAtWar.EpicCow 1.0 | 1 | 7 | 0.0% | 100.0% | 0.0% | 0.0% | 358 |
| suh.nano.MirrorH 1.01 | 1 | 265 | 0.0% | 100.0% | 0.0% | 0.0% | 391 |
| zyx.nano.Ant 1.1 | 1 | 35 | 0.0% | 100.0% | 0.0% | 0.0% | 392 |
| sng.arco.Arco 0.0 | 1 | 111 | 0.0% | 90.1% | 9.9% | 0.0% | 506 |
| suh.nano.CrossC 1.00 | 1 | 118 | 0.0% | 100.0% | 0.0% | 0.0% | 383 |
| eskimo.micro.Echo 0.1 | 1 | 10 | 0.0% | 100.0% | 0.0% | 0.0% | 377 |
| com.timothyveletta.FuzzyBot 1.1 | 1 | 79 | 0.0% | 100.0% | 0.0% | 0.0% | 368 |
| suh.nano.CrossL 1.00 | 1 | 24 | 0.0% | 95.8% | 4.2% | 0.0% | 382 |
| discan.mini.Exode 0.25 | 1 | 134 | 0.0% | 94.8% | 5.2% | 0.0% | 479 |
| ao.T100 0.9 | 1 | 17 | 0.0% | 94.1% | 5.9% | 0.0% | 625 |
| pa.Improved 1.1 | 1 | 62 | 0.0% | 100.0% | 0.0% | 0.0% | 576 |
| braaropolis.Abot 1.0 | 1 | 150 | 0.0% | 100.0% | 0.0% | 0.0% | 401 |
| oa.weak.FlyMk1 0.1 | 1 | 161 | 0.0% | 87.6% | 12.4% | 0.0% | 419 |
| kanishk.Fr0z3n 1.1 | 1 | 7 | 0.0% | 100.0% | 0.0% | 0.0% | 471 |
| mwj.A1176183 1.0 | 1 | 2 | 0.0% | 0.0% | 100.0% | 0.0% | 428 |
| reeder.caden.Elmo 1 | 1 | 28 | 0.0% | 96.4% | 3.6% | 0.0% | 408 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 72 | 0.0% | 100.0% | 0.0% | 0.0% | 512 |
| sample.MyFirstRobot 1.0 | 1 | 1 | 0.0% | 0.0% | 100.0% | 0.0% | 366 |
| mym.EdgeStalker 1.0 | 1 | 10 | 0.0% | 30.0% | 70.0% | 0.0% | 361 |
| paket.MojRobot 1.0 | 1 | 1 | 0.0% | 0.0% | 100.0% | 0.0% | 428 |

## Trust

A battle is trusted when it finished, spent no ticks in duress, skipped at most 2.0 turns a round on average and delivered an R record for every round. A reference build (not Hadur, issue #138) writes no R records, so it is held to the engine's skipped turns alone, and its duress is "n/a", as it is for battles written before the column existed.

| Opponent | Battles | Trusted | Duress ticks | Engine disables | Skips / round | Rounds without R | Final R missing | Security errors |
|---|---|---|---|---|---|---|---|---|
| nz.jdc.micro.HedgehogGF 1.5 | 1 | 1 | 0 | 0 | 0.17 | 0 | 0 | 0 |
| whind.Strength 0.6.4 | 1 | 1 | 0 | 0 | 0.06 | 0 | 0 | 0 |
| sqTank.waveSurfing.LionWWSVMvoid 0.01 | 1 | 1 | 0 | 0 | 0.11 | 0 | 0 | 0 |
| squidM.SurfinUSA 1.0 | 1 | 1 | 0 | 0 | 0.17 | 0 | 0 | 0 |
| And.BasicSurfer FF1.6 | 1 | 1 | 0 | 0 | 0.49 | 0 | 0 | 0 |
| wiki.nano.Flick 1.0 | 1 | 1 | 0 | 0 | 0.46 | 0 | 0 | 0 |
| ahr.ice.Ice 1.0 | 1 | 1 | 0 | 0 | 0.43 | 0 | 0 | 0 |
| mcb.Audace 1.3 | 1 | 1 | 0 | 0 | 0.06 | 0 | 0 | 0 |
| radnor.DoctorBob 1.42 | 1 | 1 | 0 | 0 | 0.06 | 0 | 0 | 0 |
| voidious.perceptual.RetroGirl 1.0.0 | 1 | 1 | 0 | 0 | 0.00 | 0 | 0 | 0 |
| josago.Jorgito 0.16 | 1 | 1 | 0 | 0 | 0.14 | 0 | 0 | 0 |
| sam.ChipmunkDuelist 1.0 | 1 | 1 | 0 | 0 | 0.09 | 0 | 0 | 0 |
| banshee.micro.Nexus6 0.3.0 | 1 | 1 | 0 | 0 | 0.06 | 0 | 0 | 0 |
| wiki.nano.DevilFISH 1.0 | 1 | 1 | 0 | 0 | 0.17 | 0 | 0 | 0 |
| ahf.NanoAndrew .4 | 1 | 1 | 0 | 0 | 0.06 | 0 | 0 | 0 |
| suh.nano.OscillatorL 1.00 | 1 | 1 | 0 | 0 | 0.06 | 0 | 0 | 0 |
| pez.nano.Icarus 0.3 | 1 | 1 | 0 | 0 | 0.06 | 0 | 0 | 0 |
| sul.NanoR2 1.32 | 1 | 1 | 0 | 0 | 0.23 | 0 | 0 | 0 |
| supersample.SuperCorners 1.0 | 1 | 1 | 0 | 0 | 0.17 | 0 | 0 | 0 |
| bots.UnterExBot 1.0 | 1 | 1 | 0 | 0 | 0.11 | 0 | 0 | 0 |
| geep.mini.GPBotA 1.0 | 1 | 1 | 0 | 0 | 0.11 | 0 | 0 | 0 |
| jaybot.adv.bots.JayBot 2.0 | 1 | 1 | 0 | 0 | 0.26 | 0 | 0 | 0 |
| mmb.Roskilde 0.5 | 1 | 1 | 0 | 0 | 0.20 | 0 | 0 | 0 |
| suh.nano.MirrorL 1.00 | 1 | 1 | 0 | 0 | 0.09 | 0 | 0 | 0 |
| mdouet.BotKicker 2.0 | 1 | 1 | 0 | 0 | 0.11 | 0 | 0 | 0 |
| extra.Sauce .01 | 1 | 1 | 0 | 0 | 0.06 | 0 | 0 | 0 |
| apollokidd.ApolloKidd 0.9 | 1 | 1 | 0 | 0 | 0.14 | 0 | 0 | 0 |
| knackibot.KnackOnOne 0.8.1 | 1 | 1 | 0 | 0 | 0.03 | 0 | 0 | 0 |
| hlavko.nano.Phoenix 1.0 | 1 | 1 | 0 | 0 | 0.17 | 0 | 0 | 0 |
| velas.Beta_2_0 2.0 | 1 | 1 | 0 | 0 | 0.06 | 0 | 0 | 0 |
| WidowMakersAtWar.EpicCow 1.0 | 1 | 1 | 0 | 0 | 0.06 | 0 | 0 | 0 |
| suh.nano.MirrorH 1.01 | 1 | 1 | 0 | 0 | 0.00 | 0 | 0 | 0 |
| zyx.nano.Ant 1.1 | 1 | 1 | 0 | 0 | 0.06 | 0 | 0 | 0 |
| sng.arco.Arco 0.0 | 1 | 1 | 0 | 0 | 0.06 | 0 | 0 | 0 |
| suh.nano.CrossC 1.00 | 1 | 1 | 0 | 0 | 0.06 | 0 | 0 | 0 |
| eskimo.micro.Echo 0.1 | 1 | 1 | 0 | 0 | 0.09 | 0 | 0 | 0 |
| com.timothyveletta.FuzzyBot 1.1 | 1 | 1 | 0 | 0 | 0.20 | 0 | 0 | 0 |
| suh.nano.CrossL 1.00 | 1 | 1 | 0 | 0 | 0.31 | 0 | 0 | 0 |
| discan.mini.Exode 0.25 | 1 | 1 | 0 | 0 | 0.00 | 0 | 0 | 0 |
| ao.T100 0.9 | 1 | 1 | 0 | 0 | 0.14 | 0 | 0 | 0 |
| pa.Improved 1.1 | 1 | 1 | 0 | 0 | 0.17 | 0 | 0 | 0 |
| braaropolis.Abot 1.0 | 1 | 1 | 0 | 0 | 0.11 | 0 | 0 | 0 |
| oa.weak.FlyMk1 0.1 | 1 | 1 | 0 | 0 | 0.11 | 0 | 0 | 0 |
| kanishk.Fr0z3n 1.1 | 1 | 1 | 0 | 0 | 0.11 | 0 | 0 | 0 |
| mwj.A1176183 1.0 | 1 | 1 | 0 | 0 | 0.06 | 0 | 0 | 0 |
| reeder.caden.Elmo 1 | 1 | 1 | 0 | 0 | 0.06 | 0 | 0 | 0 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1 | 0 | 0 | 0.14 | 0 | 0 | 0 |
| sample.MyFirstRobot 1.0 | 1 | 1 | 0 | 0 | 0.00 | 0 | 0 | 0 |
| mym.EdgeStalker 1.0 | 1 | 1 | 0 | 0 | 0.06 | 0 | 0 | 0 |
| paket.MojRobot 1.0 | 1 | 1 | 0 | 0 | 0.03 | 0 | 0 | 0 |

50 of 50 battles trusted.

## Wave fidelity

How well Hadur's inferred enemy waves match the bullets the enemy really fired (from the engine's ground truth). A found wave matches a real bullet within 3 ticks and 0.15 power. Real shots leave out the unseen ones: shots fired while either robot was disabled that no wave matched. Hidden shots are ones the ledger found that the raw drop hid (WAVE-1); radar reacquire counts the ticks the radar spent sweeping for a lost enemy (RADAR-1). Ledger phantoms are energy drops the ledger explained away that 1.20 would have read as shots (WAVE-1).

| Opponent | Real shots | Unseen | Waves found | Matched | Missed | False waves | Ledger phantoms | Hidden shots | Radar reacquire ticks |
|---|---|---|---|---|---|---|---|---|---|
| nz.jdc.micro.HedgehogGF 1.5 | 2495 | 79 | 2495 | 2495 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 0 | 4 |
| whind.Strength 0.6.4 | 1873 | 0 | 1873 | 1873 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 1 | 3 |
| sqTank.waveSurfing.LionWWSVMvoid 0.01 | 1585 | 5 | 1585 | 1585 (100.0%) | 0 (0.0%) | 0 (0.0%) | 30 | 13 | 6 |
| squidM.SurfinUSA 1.0 | 1062 | 2 | 1062 | 1062 (100.0%) | 0 (0.0%) | 0 (0.0%) | 2 | 9 | 7 |
| And.BasicSurfer FF1.6 | 1243 | 0 | 1243 | 1243 (100.0%) | 0 (0.0%) | 0 (0.0%) | 3 | 8 | 14 |
| wiki.nano.Flick 1.0 | 3298 | 3 | 3298 | 3298 (100.0%) | 0 (0.0%) | 0 (0.0%) | 245 | 23 | 13 |
| ahr.ice.Ice 1.0 | 583 | 1 | 583 | 583 (100.0%) | 0 (0.0%) | 0 (0.0%) | 3 | 5 | 6 |
| mcb.Audace 1.3 | 397 | 3 | 397 | 397 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 8 | 2 |
| radnor.DoctorBob 1.42 | 577 | 1 | 577 | 576 (99.8%) | 1 (0.2%) | 1 (0.2%) | 6 | 13 | 20 |
| voidious.perceptual.RetroGirl 1.0.0 | 1414 | 3 | 1414 | 1414 (100.0%) | 0 (0.0%) | 0 (0.0%) | 20 | 11 | 2 |
| josago.Jorgito 0.16 | 944 | 4 | 944 | 944 (100.0%) | 0 (0.0%) | 0 (0.0%) | 46 | 13 | 6 |
| sam.ChipmunkDuelist 1.0 | 731 | 1 | 732 | 731 (100.0%) | 0 (0.0%) | 1 (0.1%) | 85 | 21 | 4 |
| banshee.micro.Nexus6 0.3.0 | 559 | 4 | 559 | 559 (100.0%) | 0 (0.0%) | 0 (0.0%) | 3 | 11 | 1 |
| wiki.nano.DevilFISH 1.0 | 580 | 2 | 580 | 580 (100.0%) | 0 (0.0%) | 0 (0.0%) | 9 | 11 | 5 |
| ahf.NanoAndrew .4 | 457 | 1 | 457 | 457 (100.0%) | 0 (0.0%) | 0 (0.0%) | 12 | 17 | 3 |
| suh.nano.OscillatorL 1.00 | 585 | 1 | 586 | 585 (100.0%) | 0 (0.0%) | 1 (0.2%) | 13 | 8 | 2 |
| pez.nano.Icarus 0.3 | 939 | 0 | 939 | 938 (99.9%) | 1 (0.1%) | 1 (0.1%) | 93 | 15 | 3 |
| sul.NanoR2 1.32 | 759 | 0 | 762 | 759 (100.0%) | 0 (0.0%) | 3 (0.4%) | 40 | 10 | 3 |
| supersample.SuperCorners 1.0 | 557 | 5 | 557 | 557 (100.0%) | 0 (0.0%) | 0 (0.0%) | 19 | 13 | 4 |
| bots.UnterExBot 1.0 | 786 | 6 | 786 | 786 (100.0%) | 0 (0.0%) | 0 (0.0%) | 32 | 12 | 4 |
| geep.mini.GPBotA 1.0 | 462 | 4 | 462 | 461 (99.8%) | 1 (0.2%) | 1 (0.2%) | 75 | 14 | 22 |
| jaybot.adv.bots.JayBot 2.0 | 612 | 4 | 612 | 612 (100.0%) | 0 (0.0%) | 0 (0.0%) | 11 | 12 | 5 |
| mmb.Roskilde 0.5 | 884 | 2 | 884 | 884 (100.0%) | 0 (0.0%) | 0 (0.0%) | 16 | 10 | 7 |
| suh.nano.MirrorL 1.00 | 520 | 5 | 520 | 520 (100.0%) | 0 (0.0%) | 0 (0.0%) | 1 | 18 | 3 |
| mdouet.BotKicker 2.0 | 671 | 3 | 671 | 671 (100.0%) | 0 (0.0%) | 0 (0.0%) | 45 | 12 | 3 |
| extra.Sauce .01 | 494 | 0 | 497 | 494 (100.0%) | 0 (0.0%) | 3 (0.6%) | 45 | 6 | 9 |
| apollokidd.ApolloKidd 0.9 | 437 | 0 | 437 | 437 (100.0%) | 0 (0.0%) | 0 (0.0%) | 20 | 19 | 4 |
| knackibot.KnackOnOne 0.8.1 | 907 | 1 | 907 | 907 (100.0%) | 0 (0.0%) | 0 (0.0%) | 10 | 6 | 2 |
| hlavko.nano.Phoenix 1.0 | 491 | 0 | 491 | 491 (100.0%) | 0 (0.0%) | 0 (0.0%) | 46 | 8 | 6 |
| velas.Beta_2_0 2.0 | 592 | 1 | 598 | 589 (99.5%) | 3 (0.5%) | 9 (1.5%) | 106 | 19 | 4 |
| WidowMakersAtWar.EpicCow 1.0 | 402 | 2 | 402 | 402 (100.0%) | 0 (0.0%) | 0 (0.0%) | 39 | 15 | 3 |
| suh.nano.MirrorH 1.01 | 585 | 1 | 586 | 585 (100.0%) | 0 (0.0%) | 1 (0.2%) | 2 | 12 | 0 |
| zyx.nano.Ant 1.1 | 509 | 1 | 510 | 509 (100.0%) | 0 (0.0%) | 1 (0.2%) | 15 | 6 | 3 |
| sng.arco.Arco 0.0 | 395 | 0 | 395 | 395 (100.0%) | 0 (0.0%) | 0 (0.0%) | 22 | 6 | 2 |
| suh.nano.CrossC 1.00 | 521 | 5 | 521 | 521 (100.0%) | 0 (0.0%) | 0 (0.0%) | 25 | 16 | 4 |
| eskimo.micro.Echo 0.1 | 511 | 2 | 514 | 509 (99.6%) | 2 (0.4%) | 5 (1.0%) | 16 | 14 | 3 |
| com.timothyveletta.FuzzyBot 1.1 | 459 | 7 | 460 | 459 (100.0%) | 0 (0.0%) | 1 (0.2%) | 1 | 8 | 3 |
| suh.nano.CrossL 1.00 | 531 | 5 | 531 | 530 (99.8%) | 1 (0.2%) | 1 (0.2%) | 20 | 14 | 6 |
| discan.mini.Exode 0.25 | 725 | 2 | 736 | 724 (99.9%) | 1 (0.1%) | 12 (1.6%) | 12 | 10 | 0 |
| ao.T100 0.9 | 1425 | 0 | 1427 | 1425 (100.0%) | 0 (0.0%) | 2 (0.1%) | 16 | 18 | 7 |
| pa.Improved 1.1 | 918 | 3 | 921 | 918 (100.0%) | 0 (0.0%) | 3 (0.3%) | 20 | 14 | 6 |
| braaropolis.Abot 1.0 | 464 | 1 | 464 | 464 (100.0%) | 0 (0.0%) | 0 (0.0%) | 56 | 14 | 4 |
| oa.weak.FlyMk1 0.1 | 533 | 4 | 534 | 533 (100.0%) | 0 (0.0%) | 1 (0.2%) | 115 | 16 | 5 |
| kanishk.Fr0z3n 1.1 | 380 | 1 | 380 | 380 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 6 | 4 |
| mwj.A1176183 1.0 | 148 | 0 | 148 | 148 (100.0%) | 0 (0.0%) | 0 (0.0%) | 2 | 3 | 3 |
| reeder.caden.Elmo 1 | 197 | 0 | 197 | 197 (100.0%) | 0 (0.0%) | 0 (0.0%) | 3 | 4 | 2 |
| sample.MyFirstJuniorRobot 1.0 | 665 | 1 | 662 | 662 (99.5%) | 3 (0.5%) | 0 (0.0%) | 4 | 12 | 4 |
| sample.MyFirstRobot 1.0 | 159 | 1 | 159 | 159 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 9 | 0 |
| mym.EdgeStalker 1.0 | 73 | 1 | 73 | 73 (100.0%) | 0 (0.0%) | 0 (0.0%) | 21 | 1 | 1 |
| paket.MojRobot 1.0 | 203 | 0 | 203 | 203 (100.0%) | 0 (0.0%) | 0 (0.0%) | 0 | 2 | 3 |

## Bullet shielding

How many of Hadur's bullets an enemy bullet destroyed. A share well above a few percent means the enemy shoots our bullets down on purpose (SHIELD-1); jittered shots went out with the anti-shield aim offset (SHIELD-2).

| Opponent | Our shots | Shot down | Jittered shots |
|---|---|---|---|
| nz.jdc.micro.HedgehogGF 1.5 | 55 | 2474 (4498.2%) | 0 |
| whind.Strength 0.6.4 | 96 | 1678 (1747.9%) | 0 |
| sqTank.waveSurfing.LionWWSVMvoid 0.01 | 1467 | 99 (6.7%) | 1244 |
| squidM.SurfinUSA 1.0 | 1067 | 113 (10.6%) | 759 |
| And.BasicSurfer FF1.6 | 1244 | 125 (10.0%) | 765 |
| wiki.nano.Flick 1.0 | 2757 | 323 (11.7%) | 2741 |
| ahr.ice.Ice 1.0 | 595 | 30 (5.0%) | 469 |
| mcb.Audace 1.3 | 411 | 20 (4.9%) | 0 |
| radnor.DoctorBob 1.42 | 519 | 55 (10.6%) | 502 |
| voidious.perceptual.RetroGirl 1.0.0 | 1316 | 94 (7.1%) | 1032 |
| josago.Jorgito 0.16 | 1016 | 55 (5.4%) | 788 |
| sam.ChipmunkDuelist 1.0 | 726 | 62 (8.5%) | 146 |
| banshee.micro.Nexus6 0.3.0 | 566 | 36 (6.4%) | 0 |
| wiki.nano.DevilFISH 1.0 | 517 | 27 (5.2%) | 0 |
| ahf.NanoAndrew .4 | 406 | 39 (9.6%) | 0 |
| suh.nano.OscillatorL 1.00 | 552 | 30 (5.4%) | 0 |
| pez.nano.Icarus 0.3 | 946 | 79 (8.4%) | 236 |
| sul.NanoR2 1.32 | 872 | 36 (4.1%) | 0 |
| supersample.SuperCorners 1.0 | 533 | 28 (5.3%) | 0 |
| bots.UnterExBot 1.0 | 700 | 33 (4.7%) | 507 |
| geep.mini.GPBotA 1.0 | 493 | 17 (3.4%) | 0 |
| jaybot.adv.bots.JayBot 2.0 | 767 | 66 (8.6%) | 107 |
| mmb.Roskilde 0.5 | 940 | 73 (7.8%) | 57 |
| suh.nano.MirrorL 1.00 | 442 | 21 (4.8%) | 0 |
| mdouet.BotKicker 2.0 | 814 | 29 (3.6%) | 0 |
| extra.Sauce .01 | 510 | 35 (6.9%) | 0 |
| apollokidd.ApolloKidd 0.9 | 385 | 28 (7.3%) | 0 |
| knackibot.KnackOnOne 0.8.1 | 985 | 42 (4.3%) | 0 |
| hlavko.nano.Phoenix 1.0 | 520 | 20 (3.8%) | 116 |
| velas.Beta_2_0 2.0 | 639 | 27 (4.2%) | 0 |
| WidowMakersAtWar.EpicCow 1.0 | 421 | 25 (5.9%) | 0 |
| suh.nano.MirrorH 1.01 | 490 | 34 (6.9%) | 0 |
| zyx.nano.Ant 1.1 | 494 | 29 (5.9%) | 0 |
| sng.arco.Arco 0.0 | 769 | 10 (1.3%) | 0 |
| suh.nano.CrossC 1.00 | 476 | 21 (4.4%) | 0 |
| eskimo.micro.Echo 0.1 | 459 | 33 (7.2%) | 0 |
| com.timothyveletta.FuzzyBot 1.1 | 443 | 17 (3.8%) | 0 |
| suh.nano.CrossL 1.00 | 476 | 24 (5.0%) | 193 |
| discan.mini.Exode 0.25 | 705 | 48 (6.8%) | 600 |
| ao.T100 0.9 | 1029 | 92 (8.9%) | 674 |
| pa.Improved 1.1 | 936 | 53 (5.7%) | 30 |
| braaropolis.Abot 1.0 | 509 | 23 (4.5%) | 0 |
| oa.weak.FlyMk1 0.1 | 559 | 26 (4.7%) | 0 |
| kanishk.Fr0z3n 1.1 | 663 | 21 (3.2%) | 0 |
| mwj.A1176183 1.0 | 576 | 6 (1.0%) | 0 |
| reeder.caden.Elmo 1 | 536 | 9 (1.7%) | 0 |
| sample.MyFirstJuniorRobot 1.0 | 773 | 32 (4.1%) | 0 |
| sample.MyFirstRobot 1.0 | 439 | 4 (0.9%) | 0 |
| mym.EdgeStalker 1.0 | 442 | 4 (0.9%) | 0 |
| paket.MojRobot 1.0 | 580 | 16 (2.8%) | 0 |

## Aggression

The opening distance is where the distance controller started in each battle (set by the profile's gun tier; 650 px, 1.20's, for a stranger). The fighting distance is the mean scan distance over rounds, and the final target is the controller's target when the last round ended (DIST-1). Damage per round is bullet damage dealt and taken. Full-power shots were fired at 3.0 (POW-1, POW-2); finish and ram ticks were spent closing on a weak enemy (END-1) and ramming a disabled one (END-2).

| Opponent | Opening distance | Fighting distance | Final target | Round length (ticks) | Damage per round (dealt / taken) | Full-power shots | Finish ticks | Ram ticks |
|---|---|---|---|---|---|---|---|---|
| nz.jdc.micro.HedgehogGF 1.5 | 650 | 373 | 650 | 999 | 0.0 / 1.4 | 0 | 0 | 0 |
| whind.Strength 0.6.4 | 650 | 434 | 650 | 799 | 0.0 / 1.7 | 0 | 0 | 0 |
| sqTank.waveSurfing.LionWWSVMvoid 0.01 | 650 | 438 | 400 | 608 | 58.4 / 1.1 | 140 | 701 | 60 |
| squidM.SurfinUSA 1.0 | 650 | 395 | 400 | 455 | 41.1 / 2.4 | 69 | 1034 | 312 |
| And.BasicSurfer FF1.6 | 650 | 366 | 400 | 527 | 48.8 / 2.6 | 96 | 832 | 396 |
| wiki.nano.Flick 1.0 | 650 | 422 | 400 | 1076 | 88.0 / 0.7 | 796 | 285 | 14 |
| ahr.ice.Ice 1.0 | 650 | 287 | 400 | 284 | 58.9 / 5.6 | 392 | 392 | 17 |
| mcb.Audace 1.3 | 650 | 258 | 400 | 202 | 74.1 / 14.6 | 296 | 546 | 32 |
| radnor.DoctorBob 1.42 | 650 | 258 | 400 | 257 | 73.1 / 1.1 | 405 | 489 | 84 |
| voidious.perceptual.RetroGirl 1.0.0 | 650 | 411 | 400 | 547 | 54.8 / 5.2 | 224 | 947 | 51 |
| josago.Jorgito 0.16 | 650 | 455 | 400 | 451 | 72.9 / 13.9 | 580 | 413 | 44 |
| sam.ChipmunkDuelist 1.0 | 650 | 346 | 400 | 338 | 60.7 / 7.8 | 452 | 614 | 155 |
| banshee.micro.Nexus6 0.3.0 | 650 | 372 | 400 | 270 | 59.2 / 2.8 | 372 | 620 | 0 |
| wiki.nano.DevilFISH 1.0 | 650 | 251 | 400 | 257 | 71.3 / 2.4 | 401 | 423 | 40 |
| ahf.NanoAndrew .4 | 650 | 268 | 400 | 205 | 78.9 / 1.1 | 306 | 256 | 106 |
| suh.nano.OscillatorL 1.00 | 650 | 300 | 400 | 267 | 65.5 / 0.9 | 392 | 562 | 78 |
| pez.nano.Icarus 0.3 | 650 | 396 | 400 | 408 | 44.5 / 2.9 | 129 | 631 | 216 |
| sul.NanoR2 1.32 | 650 | 383 | 400 | 376 | 37.6 / 7.1 | 104 | 1056 | 441 |
| supersample.SuperCorners 1.0 | 650 | 278 | 400 | 260 | 70.9 / 11.6 | 413 | 322 | 36 |
| bots.UnterExBot 1.0 | 650 | 330 | 400 | 333 | 66.9 / 1.9 | 509 | 369 | 24 |
| geep.mini.GPBotA 1.0 | 650 | 403 | 400 | 239 | 54.9 / 2.2 | 333 | 723 | 286 |
| jaybot.adv.bots.JayBot 2.0 | 650 | 364 | 400 | 358 | 56.3 / 5.1 | 412 | 572 | 133 |
| mmb.Roskilde 0.5 | 650 | 370 | 400 | 432 | 74.1 / 1.0 | 541 | 229 | 111 |
| suh.nano.MirrorL 1.00 | 650 | 484 | 400 | 219 | 84.9 / 5.2 | 337 | 294 | 19 |
| mdouet.BotKicker 2.0 | 650 | 434 | 400 | 370 | 57.5 / 6.6 | 419 | 493 | 201 |
| extra.Sauce .01 | 650 | 396 | 400 | 247 | 57.8 / 0.0 | 362 | 557 | 138 |
| apollokidd.ApolloKidd 0.9 | 650 | 279 | 400 | 195 | 86.7 / 6.9 | 289 | 231 | 16 |
| knackibot.KnackOnOne 0.8.1 | 650 | 420 | 400 | 432 | 53.5 / 4.2 | 295 | 826 | 310 |
| hlavko.nano.Phoenix 1.0 | 650 | 383 | 400 | 251 | 55.8 / 2.6 | 374 | 596 | 290 |
| velas.Beta_2_0 2.0 | 650 | 414 | 400 | 296 | 53.8 / 11.3 | 319 | 551 | 165 |
| WidowMakersAtWar.EpicCow 1.0 | 650 | 409 | 400 | 208 | 62.9 / 0.2 | 305 | 729 | 111 |
| suh.nano.MirrorH 1.01 | 650 | 503 | 400 | 241 | 84.9 / 7.6 | 384 | 203 | 38 |
| zyx.nano.Ant 1.1 | 650 | 296 | 400 | 242 | 65.9 / 1.0 | 369 | 635 | 22 |
| sng.arco.Arco 0.0 | 650 | 406 | 400 | 356 | 67.5 / 2.9 | 440 | 303 | 89 |
| suh.nano.CrossC 1.00 | 650 | 369 | 400 | 233 | 75.6 / 3.4 | 345 | 424 | 137 |
| eskimo.micro.Echo 0.1 | 650 | 401 | 400 | 227 | 71.3 / 0.3 | 347 | 380 | 67 |
| com.timothyveletta.FuzzyBot 1.1 | 650 | 281 | 400 | 218 | 73.3 / 2.3 | 318 | 407 | 8 |
| suh.nano.CrossL 1.00 | 650 | 398 | 400 | 232 | 75.6 / 0.7 | 353 | 261 | 102 |
| discan.mini.Exode 0.25 | 650 | 394 | 400 | 329 | 61.4 / 3.6 | 434 | 571 | 19 |
| ao.T100 0.9 | 650 | 352 | 400 | 475 | 91.9 / 0.5 | 663 | 677 | 57 |
| pa.Improved 1.1 | 650 | 371 | 400 | 426 | 74.3 / 1.8 | 579 | 386 | 100 |
| braaropolis.Abot 1.0 | 650 | 376 | 400 | 251 | 71.3 / 4.3 | 403 | 293 | 91 |
| oa.weak.FlyMk1 0.1 | 650 | 377 | 400 | 269 | 76.7 / 4.0 | 410 | 341 | 110 |
| kanishk.Fr0z3n 1.1 | 650 | 387 | 400 | 321 | 92.8 / 0.2 | 498 | 184 | 8 |
| mwj.A1176183 1.0 | 650 | 429 | 400 | 278 | 87.9 / 0.0 | 404 | 74 | 0 |
| reeder.caden.Elmo 1 | 650 | 467 | 400 | 258 | 83.7 / 0.8 | 367 | 209 | 39 |
| sample.MyFirstJuniorRobot 1.0 | 650 | 398 | 400 | 362 | 82.5 / 2.1 | 547 | 403 | 91 |
| sample.MyFirstRobot 1.0 | 650 | 392 | 400 | 216 | 95.4 / 0.0 | 339 | 43 | 69 |
| mym.EdgeStalker 1.0 | 650 | 357 | 400 | 211 | 96.3 / 0.1 | 225 | 29 | 0 |
| paket.MojRobot 1.0 | 650 | 426 | 400 | 278 | 94.2 / 0.0 | 423 | 102 | 18 |

## Unhittable

Shadowed waves are enemy firing waves one of our bullets crossed, so part of them could not hit (MOVE-1); intercepts in a shadow are the enemy bullets ours destroyed that fell inside a shadow Hadur had computed, a check on the shadow geometry. Slow ticks used more than 70% of the assumed 3 ms allowance and shed a level for the next tick (TIME-1); the highest level is the most any round shed (a skipped turn holds a level for the rest of the round, TIME-2). Flavour changes count the times their hit rate beat the profile's and the movement changed (MOVE-2); the last step is 0 base, 1 flattener, 2 go-to, 3 far.

| Opponent | Their hit rate | Skipped turns | Slow ticks | Highest level | Shadowed waves per round | Intercepts in a shadow | Flavour changes | Last step |
|---|---|---|---|---|---|---|---|---|
| nz.jdc.micro.HedgehogGF 1.5 | 2.5% | 6 | 14 | 2 | 0.0 | 0 / 2474 (0%) | 0 | 0 |
| whind.Strength 0.6.4 | 0.3% | 2 | 14 | 2 | 0.0 | 0 / 1678 (0%) | 0 | 0 |
| sqTank.waveSurfing.LionWWSVMvoid 0.01 | 0.5% | 4 | 27 | 2 | 45.3 | 99 / 99 (100%) | 0 | 0 |
| squidM.SurfinUSA 1.0 | 0.8% | 6 | 42 | 3 | 30.3 | 113 / 113 (100%) | 0 | 0 |
| And.BasicSurfer FF1.6 | 1.1% | 17 | 25 | 3 | 35.5 | 125 / 125 (100%) | 0 | 0 |
| wiki.nano.Flick 1.0 | 1.8% | 16 | 68 | 3 | 93.6 | 323 / 323 (100%) | 0 | 0 |
| ahr.ice.Ice 1.0 | 2.3% | 15 | 22 | 3 | 16.7 | 30 / 30 (100%) | 0 | 0 |
| mcb.Audace 1.3 | 6.5% | 2 | 16 | 2 | 11.3 | 20 / 20 (100%) | 0 | 0 |
| radnor.DoctorBob 1.42 | 0.9% | 2 | 4 | 2 | 16.5 | 55 / 55 (100%) | 0 | 0 |
| voidious.perceptual.RetroGirl 1.0.0 | 1.9% | 0 | 28 | 1 | 40.4 | 94 / 94 (100%) | 0 | 0 |
| josago.Jorgito 0.16 | 8.3% | 5 | 29 | 3 | 26.9 | 55 / 55 (100%) | 0 | 0 |
| sam.ChipmunkDuelist 1.0 | 3.7% | 3 | 10 | 3 | 20.9 | 62 / 62 (100%) | 0 | 0 |
| banshee.micro.Nexus6 0.3.0 | 1.1% | 2 | 8 | 2 | 16.0 | 36 / 36 (100%) | 0 | 0 |
| wiki.nano.DevilFISH 1.0 | 1.4% | 6 | 8 | 3 | 16.6 | 27 / 27 (100%) | 0 | 0 |
| ahf.NanoAndrew .4 | 0.8% | 2 | 6 | 3 | 13.1 | 39 / 39 (100%) | 0 | 0 |
| suh.nano.OscillatorL 1.00 | 0.5% | 2 | 37 | 2 | 16.7 | 30 / 30 (100%) | 0 | 0 |
| pez.nano.Icarus 0.3 | 1.4% | 2 | 11 | 2 | 26.8 | 79 / 79 (100%) | 0 | 0 |
| sul.NanoR2 1.32 | 2.4% | 8 | 22 | 3 | 21.8 | 36 / 36 (100%) | 0 | 0 |
| supersample.SuperCorners 1.0 | 6.1% | 6 | 10 | 3 | 15.8 | 28 / 28 (100%) | 0 | 0 |
| bots.UnterExBot 1.0 | 1.5% | 4 | 9 | 3 | 22.5 | 33 / 33 (100%) | 0 | 0 |
| geep.mini.GPBotA 1.0 | 1.4% | 4 | 19 | 3 | 13.2 | 17 / 17 (100%) | 0 | 0 |
| jaybot.adv.bots.JayBot 2.0 | 2.2% | 9 | 11 | 3 | 17.5 | 66 / 66 (100%) | 0 | 0 |
| mmb.Roskilde 0.5 | 0.9% | 7 | 9 | 2 | 25.2 | 73 / 73 (100%) | 0 | 0 |
| suh.nano.MirrorL 1.00 | 6.2% | 3 | 4 | 2 | 14.9 | 21 / 21 (100%) | 0 | 0 |
| mdouet.BotKicker 2.0 | 3.0% | 4 | 10 | 2 | 19.2 | 29 / 29 (100%) | 0 | 0 |
| extra.Sauce .01 | 0.2% | 2 | 14 | 2 | 14.2 | 35 / 35 (100%) | 0 | 0 |
| apollokidd.ApolloKidd 0.9 | 5.2% | 5 | 24 | 2 | 12.5 | 28 / 28 (100%) | 0 | 0 |
| knackibot.KnackOnOne 0.8.1 | 2.1% | 1 | 30 | 2 | 25.9 | 42 / 42 (100%) | 0 | 0 |
| hlavko.nano.Phoenix 1.0 | 1.5% | 6 | 9 | 3 | 14.0 | 20 / 20 (100%) | 0 | 0 |
| velas.Beta_2_0 2.0 | 4.7% | 2 | 13 | 2 | 17.0 | 27 / 27 (100%) | 0 | 0 |
| WidowMakersAtWar.EpicCow 1.0 | 0.2% | 2 | 10 | 2 | 11.5 | 25 / 25 (100%) | 0 | 0 |
| suh.nano.MirrorH 1.01 | 8.8% | 0 | 23 | 1 | 16.7 | 34 / 34 (100%) | 0 | 0 |
| zyx.nano.Ant 1.1 | 0.7% | 2 | 22 | 2 | 14.6 | 29 / 29 (100%) | 0 | 0 |
| sng.arco.Arco 0.0 | 2.1% | 2 | 14 | 2 | 11.2 | 10 / 10 (100%) | 0 | 0 |
| suh.nano.CrossC 1.00 | 2.8% | 2 | 12 | 2 | 14.9 | 21 / 21 (100%) | 0 | 0 |
| eskimo.micro.Echo 0.1 | 0.2% | 3 | 18 | 2 | 14.7 | 33 / 33 (100%) | 0 | 0 |
| com.timothyveletta.FuzzyBot 1.1 | 1.8% | 7 | 8 | 3 | 13.1 | 17 / 17 (100%) | 0 | 0 |
| suh.nano.CrossL 1.00 | 0.6% | 11 | 22 | 3 | 15.2 | 24 / 24 (100%) | 0 | 0 |
| discan.mini.Exode 0.25 | 1.9% | 0 | 35 | 1 | 21.0 | 48 / 48 (100%) | 0 | 0 |
| ao.T100 0.9 | 1.3% | 5 | 29 | 2 | 40.8 | 92 / 92 (100%) | 0 | 0 |
| pa.Improved 1.1 | 0.7% | 6 | 24 | 3 | 26.3 | 53 / 53 (100%) | 0 | 0 |
| braaropolis.Abot 1.0 | 3.3% | 4 | 7 | 2 | 13.3 | 23 / 23 (100%) | 0 | 0 |
| oa.weak.FlyMk1 0.1 | 3.0% | 4 | 9 | 2 | 15.1 | 26 / 26 (100%) | 0 | 0 |
| kanishk.Fr0z3n 1.1 | 1.1% | 4 | 6 | 3 | 10.9 | 21 / 21 (100%) | 0 | 0 |
| mwj.A1176183 1.0 | 0.0% | 2 | 16 | 2 | 4.2 | 6 / 6 (100%) | 0 | 0 |
| reeder.caden.Elmo 1 | 0.7% | 2 | 6 | 2 | 5.6 | 9 / 9 (100%) | 0 | 0 |
| sample.MyFirstJuniorRobot 1.0 | 2.8% | 5 | 11 | 2 | 18.9 | 32 / 32 (100%) | 0 | 0 |
| sample.MyFirstRobot 1.0 | 0.0% | 0 | 11 | 1 | 4.5 | 4 / 4 (100%) | 0 | 0 |
| mym.EdgeStalker 1.0 | 5.2% | 2 | 8 | 2 | 2.1 | 4 / 4 (100%) | 0 | 0 |
| paket.MojRobot 1.0 | 0.0% | 1 | 7 | 2 | 5.8 | 16 / 16 (100%) | 0 | 0 |

## Opponent memory

"Started warm" counts battles whose first scan loaded a stored profile (MEM-1). Memory failures are profiles that failed to load, fold or save (MEM-4, MEM-3); seed evictions are profiles whose seeds were dropped for room (MEM-5). Tiers are what the profile said at each battle's first scan, and the opening is the gun the opening book chose from them (ADAPT-1; "live" leaves it to the virtual guns, as 1.20 did). Seeds are the gun and surf samples replayed at the start of the last battle (ADAPT-3); seed decays count the waves on which the live data disagreed with the profile and a seed lost weight (RES-4), over all battles.

| Opponent | Started warm | Memory failures | Seed evictions | Tiers by battle | Opening by battle | Seeds (last battle) | Seed decays |
|---|---|---|---|---|---|---|---|
| nz.jdc.micro.HedgehogGF 1.5 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| whind.Strength 0.6.4 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| sqTank.waveSurfing.LionWWSVMvoid 0.01 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| squidM.SurfinUSA 1.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| And.BasicSurfer FF1.6 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| wiki.nano.Flick 1.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| ahr.ice.Ice 1.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| mcb.Audace 1.3 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| radnor.DoctorBob 1.42 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| voidious.perceptual.RetroGirl 1.0.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| josago.Jorgito 0.16 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| sam.ChipmunkDuelist 1.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| banshee.micro.Nexus6 0.3.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| wiki.nano.DevilFISH 1.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| ahf.NanoAndrew .4 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| suh.nano.OscillatorL 1.00 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| pez.nano.Icarus 0.3 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| sul.NanoR2 1.32 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| supersample.SuperCorners 1.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| bots.UnterExBot 1.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| geep.mini.GPBotA 1.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| jaybot.adv.bots.JayBot 2.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| mmb.Roskilde 0.5 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| suh.nano.MirrorL 1.00 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| mdouet.BotKicker 2.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| extra.Sauce .01 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| apollokidd.ApolloKidd 0.9 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| knackibot.KnackOnOne 0.8.1 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| hlavko.nano.Phoenix 1.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| velas.Beta_2_0 2.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| WidowMakersAtWar.EpicCow 1.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| suh.nano.MirrorH 1.01 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| zyx.nano.Ant 1.1 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| sng.arco.Arco 0.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| suh.nano.CrossC 1.00 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| eskimo.micro.Echo 0.1 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| com.timothyveletta.FuzzyBot 1.1 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| suh.nano.CrossL 1.00 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| discan.mini.Exode 0.25 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| ao.T100 0.9 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| pa.Improved 1.1 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| braaropolis.Abot 1.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| oa.weak.FlyMk1 0.1 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| kanishk.Fr0z3n 1.1 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| mwj.A1176183 1.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| reeder.caden.Elmo 1 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| sample.MyFirstJuniorRobot 1.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| sample.MyFirstRobot 1.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| mym.EdgeStalker 1.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |
| paket.MojRobot 1.0 | 0 / 1 | 0 | 0 | T?/M? | live | 0 / 0 | 0 |

### Stored profiles

Decoded from Hadur's data directory after the opponent's last battle. Hit rates are over all remembered shots; ratings are the virtual guns' weighted hits per wave; the normalised rate weights each of their hits by how small Hadur looked from where they fired, which is what the gun tier reads. Seeds are gun / surf samples. The last column is the estimated score share the profile recorded for each battle, oldest first.

| Opponent | Key | Battles | Rounds | Bytes | Their hit rate | Their normalised rate | Our hit rate | Main / anti-surfer rating | Stopped | Seeds | Tiers | Recorded score share |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| nz.jdc.micro.HedgehogGF 1.5 | nz.jdc.micro.HedgehogGF | 1 | 35 | 324 | 3.7% | 39.9% ± 23.5 | 11.6% | - / - | 31.7% | 0 / 0 | T?/M? | 95% |
| whind.Strength 0.6.4 | whind.Strength | 1 | 35 | 292 | 0.3% | 1.4% ± 2.1 | 7.2% | 7.0% / 7.5% | 18.4% | 0 / 0 | T0/M? | 97% |
| sqTank.waveSurfing.LionWWSVMvoid 0.01 | sqTank.waveSurfing.LionWWSVMvoid | 1 | 35 | 362 | 0.7% | 0.4% ± 0.4 | 13.7% | 26.1% / 23.4% | 3.5% | 0 / 0 | T0/M0 | 99% |
| squidM.SurfinUSA 1.0 | squidM.SurfinUSA | 1 | 35 | 296 | 0.8% | 0.8% ± 0.6 | 12.6% | 24.6% / 24.5% | 10.7% | 0 / 0 | T0/M1 | 98% |
| And.BasicSurfer FF1.6 | And.BasicSurfer | 1 | 35 | 296 | 1.3% | 0.8% ± 0.6 | 13.1% | 24.9% / 25.0% | 10.2% | 0 / 0 | T0/M1 | 97% |
| wiki.nano.Flick 1.0 | wiki.nano.Flick | 1 | 35 | 292 | 1.9% | 1.2% ± 0.4 | 17.1% | 26.6% / 22.9% | 3.4% | 0 / 0 | T0/M0 | 95% |
| ahr.ice.Ice 1.0 | ahr.ice.Ice | 1 | 35 | 276 | 2.7% | 1.2% ± 1.0 | 18.5% | 24.8% / 22.5% | 2.6% | 0 / 0 | T0/M? | 94% |
| mcb.Audace 1.3 | mcb.Audace | 1 | 35 | 272 | 9.1% | 5.6% ± 2.4 | 28.0% | 34.1% / 33.4% | 5.8% | 0 / 0 | T2/M? | 89% |
| radnor.DoctorBob 1.42 | radnor.DoctorBob | 1 | 35 | 298 | 1.6% | 0.7% ± 0.9 | 24.1% | 27.4% / 26.1% | 1.3% | 0 / 0 | T0/M? | 99% |
| voidious.perceptual.RetroGirl 1.0.0 | voidious.perceptual.RetroGirl | 1 | 35 | 352 | 2.4% | 1.5% ± 0.7 | 13.2% | 26.2% / 23.0% | 4.4% | 0 / 0 | T0/M0 | 95% |
| josago.Jorgito 0.16 | josago.Jorgito | 1 | 35 | 290 | 8.7% | 6.8% ± 1.7 | 17.7% | 37.7% / 33.0% | 4.3% | 0 / 0 | T2/M? | 88% |
| sam.ChipmunkDuelist 1.0 | sam.ChipmunkDuelist | 1 | 35 | 308 | 5.1% | 3.5% ± 1.4 | 17.1% | 28.6% / 26.0% | 7.8% | 0 / 0 | T1/M? | 93% |
| banshee.micro.Nexus6 0.3.0 | banshee.micro.Nexus6 | 1 | 35 | 316 | 2.1% | 1.6% ± 1.2 | 18.7% | 40.1% / 31.4% | 3.3% | 0 / 0 | T0/M? | 97% |
| wiki.nano.DevilFISH 1.0 | wiki.nano.DevilFISH | 1 | 35 | 308 | 2.2% | 0.8% ± 0.9 | 22.6% | 24.5% / 21.9% | 8.5% | 0 / 0 | T0/M? | 98% |
| ahf.NanoAndrew .4 | ahf.NanoAndrew | 1 | 35 | 286 | 1.3% | 0.6% ± 1.0 | 30.6% | 35.6% / 38.8% | 2.6% | 0 / 0 | T0/M? | 99% |
| suh.nano.OscillatorL 1.00 | suh.nano.OscillatorL | 1 | 35 | 314 | 1.0% | 0.6% ± 0.8 | 21.4% | 32.4% / 36.3% | 2.0% | 0 / 0 | T0/M? | 99% |
| pez.nano.Icarus 0.3 | pez.nano.Icarus | 1 | 35 | 292 | 1.5% | 1.3% ± 0.8 | 13.5% | 24.3% / 22.9% | 6.1% | 0 / 0 | T0/M1 | 97% |
| sul.NanoR2 1.32 | sul.NanoR2 | 1 | 35 | 274 | 3.1% | 2.0% ± 1.1 | 13.8% | 25.4% / 23.4% | 6.1% | 0 / 0 | T1/M? | 92% |
| supersample.SuperCorners 1.0 | supersample.SuperCorners | 1 | 35 | 328 | 6.6% | 3.4% ± 1.6 | 22.7% | 26.8% / 27.7% | 3.8% | 0 / 0 | T1/M? | 92% |
| bots.UnterExBot 1.0 | bots.UnterExBot | 1 | 35 | 292 | 1.9% | 0.8% ± 0.7 | 17.7% | 35.1% / 30.2% | 16.3% | 0 / 0 | T0/M? | 98% |
| geep.mini.GPBotA 1.0 | geep.mini.GPBotA | 1 | 35 | 296 | 2.6% | 1.6% ± 1.3 | 19.7% | 34.7% / 32.1% | 12.3% | 0 / 0 | T0/M? | 96% |
| jaybot.adv.bots.JayBot 2.0 | jaybot.adv.bots.JayBot | 1 | 35 | 320 | 2.8% | 2.3% ± 1.3 | 16.2% | 28.9% / 24.9% | 2.8% | 0 / 0 | T1/M? | 96% |
| mmb.Roskilde 0.5 | mmb.Roskilde | 1 | 35 | 280 | 1.4% | 0.9% ± 0.7 | 17.6% | 30.6% / 28.6% | 6.6% | 0 / 0 | T0/M? | 99% |
| suh.nano.MirrorL 1.00 | suh.nano.MirrorL | 1 | 35 | 298 | 8.3% | 6.8% ± 2.3 | 29.2% | 37.7% / 29.5% | 1.3% | 0 / 0 | T2/M? | 96% |
| mdouet.BotKicker 2.0 | mdouet.BotKicker | 1 | 35 | 296 | 4.0% | 3.7% ± 1.5 | 16.5% | 33.9% / 32.9% | 5.9% | 0 / 0 | T1/M? | 94% |
| extra.Sauce .01 | extra.Sauce | 1 | 35 | 276 | 0.2% | 0.1% ± 0.7 | 19.8% | 43.4% / 41.5% | 2.2% | 0 / 0 | T0/M? | 100% |
| apollokidd.ApolloKidd 0.9 | apollokidd.ApolloKidd | 1 | 35 | 316 | 6.6% | 2.4% ± 1.6 | 32.4% | 40.4% / 39.7% | 18.9% | 0 / 0 | T1/M? | 95% |
| knackibot.KnackOnOne 0.8.1 | knackibot.KnackOnOne | 1 | 35 | 316 | 2.5% | 0.7% ± 0.6 | 14.9% | 23.6% / 22.4% | 5.9% | 0 / 0 | T0/M1 | 96% |
| hlavko.nano.Phoenix 1.0 | hlavko.nano.Phoenix | 1 | 35 | 308 | 2.6% | 1.3% ± 1.2 | 19.4% | 37.2% / 33.4% | 6.8% | 0 / 0 | T0/M? | 96% |
| velas.Beta_2_0 2.0 | velas.Beta_2_0 | 1 | 35 | 288 | 5.0% | 4.2% ± 1.7 | 17.5% | 37.3% / 34.8% | 29.6% | 0 / 0 | T1/M? | 91% |
| WidowMakersAtWar.EpicCow 1.0 | WidowMakersAtWar.EpicCow | 1 | 35 | 328 | 1.2% | 0.4% ± 1.0 | 23.8% | 58.9% / 56.1% | 33.2% | 0 / 0 | T0/M? | 99% |
| suh.nano.MirrorH 1.01 | suh.nano.MirrorH | 1 | 35 | 298 | 11.4% | 9.6% ± 2.5 | 27.6% | 30.5% / 26.5% | 1.7% | 0 / 0 | T3/M? | 94% |
| zyx.nano.Ant 1.1 | zyx.nano.Ant | 1 | 35 | 280 | 0.6% | 0.2% ± 0.7 | 21.8% | 29.7% / 29.9% | 14.5% | 0 / 0 | T0/M? | 99% |
| sng.arco.Arco 0.0 | sng.arco.Arco | 1 | 35 | 284 | 2.0% | 0.9% ± 1.2 | 17.9% | 33.9% / 30.2% | 1.8% | 0 / 0 | T0/M? | 98% |
| suh.nano.CrossC 1.00 | suh.nano.CrossC | 1 | 35 | 294 | 3.6% | 2.5% ± 1.5 | 25.7% | 53.9% / 53.4% | 21.9% | 0 / 0 | T1/M? | 97% |
| eskimo.micro.Echo 0.1 | eskimo.micro.Echo | 1 | 35 | 300 | 0.4% | 0.1% ± 0.7 | 24.5% | 56.5% / 52.4% | 18.2% | 0 / 0 | T0/M? | 100% |
| com.timothyveletta.FuzzyBot 1.1 | com.timothyveletta.FuzzyBot | 1 | 35 | 340 | 2.0% | 1.0% ± 1.1 | 25.5% | 39.4% / 42.4% | 1.0% | 0 / 0 | T0/M? | 98% |
| suh.nano.CrossL 1.00 | suh.nano.CrossL | 1 | 35 | 294 | 1.1% | 0.8% ± 1.0 | 25.9% | 57.4% / 62.6% | 21.5% | 0 / 0 | T0/M? | 99% |
| discan.mini.Exode 0.25 | discan.mini.Exode | 1 | 35 | 302 | 1.8% | 1.2% ± 0.9 | 17.2% | 40.5% / 34.9% | 1.0% | 0 / 0 | T0/M? | 97% |
| ao.T100 0.9 | ao.T100 | 1 | 35 | 260 | 1.6% | 0.4% ± 0.4 | 19.1% | 31.8% / 29.6% | 0.2% | 0 / 0 | T0/M0 | 100% |
| pa.Improved 1.1 | pa.Improved | 1 | 35 | 276 | 0.7% | 0.1% ± 0.4 | 17.3% | 30.4% / 26.6% | 8.6% | 0 / 0 | T0/M? | 99% |
| braaropolis.Abot 1.0 | braaropolis.Abot | 1 | 35 | 296 | 3.7% | 2.5% ± 1.6 | 23.6% | 38.6% / 37.8% | 5.9% | 0 / 0 | T1/M? | 97% |
| oa.weak.FlyMk1 0.1 | oa.weak.FlyMk1 | 1 | 35 | 288 | 3.4% | 1.4% ± 1.2 | 22.8% | 42.9% / 37.7% | 37.2% | 0 / 0 | T0/M? | 97% |
| kanishk.Fr0z3n 1.1 | kanishk.Fr0z3n | 1 | 35 | 288 | 1.1% | 0.7% ± 1.1 | 23.2% | 46.9% / 43.7% | 38.3% | 0 / 0 | T0/M? | 100% |
| mwj.A1176183 1.0 | mwj.A1176183 | 1 | 35 | 280 | 0.0% | 0.0% ± 1.9 | 25.3% | 45.5% / 40.3% | 25.4% | 0 / 0 | T0/M? | 100% |
| reeder.caden.Elmo 1 | reeder.caden.Elmo | 1 | 35 | 296 | 1.0% | 0.9% ± 1.9 | 26.1% | 69.9% / 67.6% | 49.9% | 0 / 0 | T0/M? | 99% |
| sample.MyFirstJuniorRobot 1.0 | sample.MyFirstJuniorRobot | 1 | 35 | 332 | 2.9% | 1.5% ± 1.0 | 19.5% | 48.3% / 45.3% | 52.9% | 0 / 0 | T0/M? | 99% |
| sample.MyFirstRobot 1.0 | sample.MyFirstRobot | 1 | 35 | 308 | 1.3% | 0.7% ± 2.1 | 33.2% | 69.2% / 66.3% | 53.8% | 0 / 0 | T0/M? | 100% |
| mym.EdgeStalker 1.0 | mym.EdgeStalker | 1 | 35 | 292 | 5.5% | 0.3% ± 4.0 | 37.4% | 43.7% / 39.8% | 34.0% | 0 / 0 | T?/M? | 100% |
| paket.MojRobot 1.0 | paket.MojRobot | 1 | 35 | 288 | 0.0% | 0.0% ± 1.4 | 27.4% | 66.1% / 69.3% | 50.6% | 0 / 0 | T0/M? | 100% |

Turn times are wall-clock per engine turn (both robots plus the engine), measured by the harness. Skipped turns are counted from the engine's messages in Hadur's console. Hit rates and faults come from Hadur's own R and FAULT records (RES-5); hit rates are per-round means, and "-" means the robot wrote no R records.

## First rounds against last rounds

Per battle, the first 5 rounds against the last 10, then the paired difference (last minus first) over battles with its 95% interval. Win rate is rounds won over rounds with an R record; damage share is bullet damage dealt over dealt plus taken. Positive means the robot does better late in the battle.

| Opponent | Build | Battles | Win rate, first 5 | Win rate, last 10 | Late minus early (pp) | Damage share, first 5 | Damage share, last 10 | Late minus early (pp) |
|---|---|---|---|---|---|---|---|---|
| And.BasicSurfer FF1.6 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 84.9% | 98.8% | +13.9 |
| WidowMakersAtWar.EpicCow 1.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 100.0% | 100.0% | +0.0 |
| ahf.NanoAndrew .4 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 92.3% | 100.0% | +7.7 |
| ahr.ice.Ice 1.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 100.0% | 91.0% | -9.0 |
| ao.T100 0.9 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 99.3% | 99.8% | +0.5 |
| apollokidd.ApolloKidd 0.9 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 86.5% | 99.0% | +12.5 |
| banshee.micro.Nexus6 0.3.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 100.0% | 97.3% | -2.7 |
| bots.UnterExBot 1.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 94.9% | 97.3% | +2.4 |
| braaropolis.Abot 1.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 96.9% | 92.3% | -4.6 |
| com.timothyveletta.FuzzyBot 1.1 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 93.4% | 98.2% | +4.8 |
| discan.mini.Exode 0.25 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 100.0% | 95.5% | -4.5 |
| eskimo.micro.Echo 0.1 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 100.0% | 100.0% | +0.0 |
| extra.Sauce .01 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 99.9% | 100.0% | +0.1 |
| geep.mini.GPBotA 1.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 89.8% | 94.1% | +4.3 |
| hlavko.nano.Phoenix 1.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 93.6% | 99.3% | +5.7 |
| jaybot.adv.bots.JayBot 2.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 84.0% | 89.4% | +5.4 |
| josago.Jorgito 0.16 | hadur117.Hadur 3.19aror | 1 | 80.0% | 90.0% | +10.0 | 77.9% | 84.4% | +6.5 |
| kanishk.Fr0z3n 1.1 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 100.0% | 99.2% | -0.8 |
| knackibot.KnackOnOne 0.8.1 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 95.4% | 91.4% | -4.0 |
| mcb.Audace 1.3 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 61.8% | 90.3% | +28.6 |
| mdouet.BotKicker 2.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 88.5% | 88.7% | +0.2 |
| mmb.Roskilde 0.5 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 96.1% | 98.4% | +2.3 |
| mwj.A1176183 1.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 100.0% | 100.0% | +0.0 |
| mym.EdgeStalker 1.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 99.8% | 99.8% | -0.0 |
| nz.jdc.micro.HedgehogGF 1.5 | hadur117.Hadur 3.19aror | 1 | 80.0% | 100.0% | +20.0 | 0.0% | 4.0% | +4.0 |
| oa.weak.FlyMk1 0.1 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 82.0% | 97.9% | +15.9 |
| pa.Improved 1.1 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 96.7% | 94.0% | -2.7 |
| paket.MojRobot 1.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 100.0% | 100.0% | +0.0 |
| pez.nano.Icarus 0.3 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 78.6% | 100.0% | +21.4 |
| radnor.DoctorBob 1.42 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 92.3% | 99.8% | +7.5 |
| reeder.caden.Elmo 1 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 97.4% | 98.2% | +0.8 |
| sam.ChipmunkDuelist 1.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 81.0% | 91.3% | +10.3 |
| sample.MyFirstJuniorRobot 1.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 99.0% | 97.1% | -1.9 |
| sample.MyFirstRobot 1.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 100.0% | 100.0% | +0.0 |
| sng.arco.Arco 0.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 100.0% | 89.6% | -10.4 |
| sqTank.waveSurfing.LionWWSVMvoid 0.01 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 98.6% | 95.9% | -2.7 |
| squidM.SurfinUSA 1.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 76.6% | 97.8% | +21.2 |
| suh.nano.CrossC 1.00 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 91.5% | 94.3% | +2.8 |
| suh.nano.CrossL 1.00 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 95.4% | 100.0% | +4.6 |
| suh.nano.MirrorH 1.01 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 94.1% | 90.7% | -3.4 |
| suh.nano.MirrorL 1.00 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 91.6% | 94.4% | +2.8 |
| suh.nano.OscillatorL 1.00 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 93.1% | 100.0% | +6.9 |
| sul.NanoR2 1.32 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 100.0% | 74.4% | -25.6 |
| supersample.SuperCorners 1.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 77.5% | 87.0% | +9.5 |
| velas.Beta_2_0 2.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 68.1% | 97.9% | +29.8 |
| voidious.perceptual.RetroGirl 1.0.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 94.3% | 88.7% | -5.6 |
| whind.Strength 0.6.4 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 0.0% | 0.0% | +0.0 |
| wiki.nano.DevilFISH 1.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 89.7% | 96.2% | +6.5 |
| wiki.nano.Flick 1.0 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 99.5% | 99.4% | -0.1 |
| zyx.nano.Ant 1.1 | hadur117.Hadur 3.19aror | 1 | 100.0% | 100.0% | +0.0 | 100.0% | 100.0% | +0.0 |
