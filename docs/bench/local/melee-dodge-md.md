# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1502844. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 148 over 6 battles (24.7 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.4 | 51 / 210 | 2.40 | 17.7% | 34191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.6% | 134 |
| hadur117.Hadur 3.21md | 2.0 | 17.7% | 51 |
| sgp.JollyNinja 3.53 | 3.8 | 11.2% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 10.9% | 2 |
| lorneswork.Predator 1.0 | 4.7 | 10.1% | 1 |
| mz.MicroGodMelee 1 | 5.3 | 10.1% | 5 |
| adt.Ar2 1.0 | 7.2 | 7.5% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.7% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.3% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.1 | 85.1 | 10 / 35 | 5707 |
| 2 | 2 | 69.7 | 89.5 | 12 / 35 | 6138 |
| 3 | 2 | 66.8 | 81.3 | 8 / 35 | 5342 |
| 4 | 2 | 66.9 | 82.5 | 4 / 35 | 5770 |
| 5 | 2 | 67.5 | 85.1 | 10 / 35 | 5376 |
| 6 | 2 | 67.5 | 83.2 | 7 / 35 | 5858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 111 | 11% |
| sgp.JollyNinja 3.53 | 25 | 72% |
| mz.MicroGodMelee 1 | 10 | 70% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 88% |
| lorneswork.Predator 1.0 | 6 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 1125. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 114 | 72% | 130 |
| sgp.JollyNinja 3.53 | 15 | 9% | 27 |
| lorneswork.Predator 1.0 | 11 | 7% | 15 |
| mz.MicroGodMelee 1 | 9 | 6% | 18 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 3% | 11 |
| adt.Ar2 1.0 | 4 | 3% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 2 |
| skm.butterfly 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 132462 melee ticks, 83935 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 72 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 42265 sent, 37266 reached their opponent, 7136 virtual hits (19.1% of those reached).

## Melee bench: F02

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1508416. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 219 over 6 battles (36.5 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.8 | 116 / 210 | 2.10 | 19.4% | 32576 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 19.4% | 116 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.6% | 28 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.4% | 34 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.8% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.7% | 5 |
| sch.Simone 0.3d | 6.7 | 8.3% | 8 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.0% | 1 |
| Noran.BitchingElk 0.054 | 7.5 | 7.8% | 14 |
| stelo.PatternRobot 1.0 | 8.8 | 5.4% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 88.9 | 24 / 35 | 5633 |
| 2 | 1 | 69.4 | 86.7 | 19 / 35 | 5629 |
| 3 | 1 | 68.8 | 87.6 | 18 / 35 | 5092 |
| 4 | 1 | 69.4 | 87.9 | 16 / 35 | 5528 |
| 5 | 1 | 69.6 | 89.2 | 22 / 35 | 5451 |
| 6 | 1 | 68.6 | 86.3 | 17 / 35 | 5243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 53 | 58% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 52 | 73% |
| sch.Simone 0.3d | 16 | 94% |
| Noran.BitchingElk 0.054 | 16 | 44% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 82% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 88% |
| fnc.bandit.Bandit 5.2.0 | 5 | 80% |
| stelo.PatternRobot 1.0 | 4 | 75% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 35 | 37% | 64 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 21 | 22% | 66 |
| Noran.BitchingElk 0.054 | 10 | 11% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 8% | 17 |
| stelo.PatternRobot 1.0 | 7 | 7% | 9 |
| sch.Simone 0.3d | 5 | 5% | 15 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5 | 5% | 13 |
| fnc.bandit.Bandit 5.2.0 | 3 | 3% | 9 |
| fullsail.SweetTea 1.1 | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 161001 melee ticks, 46437 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 72 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 56528 sent, 51655 reached their opponent, 8366 virtual hits (16.2% of those reached).

## Melee bench: F03

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1493501. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 171 over 6 battles (28.5 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 94.2 | 181 / 210 | 1.52 | 21.7% | 41007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 21.7% | 181 |
| radnor.DoctorBob 1.42 | 2.7 | 13.7% | 13 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.0% | 4 |
| vuen.Cake 2.51 | 3.3 | 13.0% | 12 |
| urdos.URDOS 1.3 | 5.0 | 8.6% | 0 |
| adt.Ar1 2.1 | 6.0 | 7.5% | 0 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.4% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.3 | 5.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 86.3 | 28 / 35 | 6329 |
| 2 | 1 | 72.9 | 96.8 | 32 / 35 | 7177 |
| 3 | 1 | 73.2 | 97.1 | 32 / 35 | 7172 |
| 4 | 1 | 73.0 | 96.8 | 31 / 35 | 6959 |
| 5 | 1 | 70.8 | 89.5 | 26 / 35 | 6463 |
| 6 | 1 | 73.1 | 98.7 | 32 / 35 | 6907 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 70 | 91% |
| radnor.DoctorBob 1.42 | 63 | 98% |
| kawigi.nano.Lib 1.0 | 44 | 98% |
| oa.weak.FlyMk1 0.1 | 5 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 10 | 34% | 72 |
| radnor.DoctorBob 1.42 | 5 | 17% | 54 |
| kawigi.nano.Lib 1.0 | 4 | 14% | 44 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 14% | 5 |
| urdos.URDOS 1.3 | 3 | 10% | 8 |
| oa.weak.FlyMk1 0.1 | 1 | 3% | 10 |
| adt.Ar1 2.1 | 1 | 3% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 3% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 199 rounds): 124615 melee ticks, 43037 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 59 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 37479 sent, 32596 reached their opponent, 7880 virtual hits (24.2% of those reached).

## Melee bench: F04

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488335. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 91 over 6 battles (15.2 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.2 | 35 / 210 | 2.15 | 18.4% | 36682 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.1% | 157 |
| hadur117.Hadur 3.21md | 2.0 | 18.4% | 35 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 14.0% | 13 |
| TNT.TNT 0.99.1 | 4.0 | 10.7% | 5 |
| josago.Jorgito 0.16 | 5.0 | 9.3% | 0 |
| css.Delitioner 0.11 | 6.2 | 7.0% | 0 |
| rampancy.Durandal 2.1d | 7.3 | 5.4% | 0 |
| tj.zombie1n 1.0.1 | 7.5 | 5.8% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 3.7% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.5 | 86.0 | 5 / 35 | 5813 |
| 2 | 2 | 69.4 | 87.6 | 6 / 35 | 5772 |
| 3 | 2 | 69.3 | 85.4 | 7 / 35 | 6083 |
| 4 | 2 | 69.6 | 87.0 | 6 / 35 | 6335 |
| 5 | 2 | 69.6 | 88.6 | 6 / 35 | 6187 |
| 6 | 2 | 70.0 | 88.6 | 5 / 35 | 6492 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 126 | 11% |
| apc.LeeroyJenkins2 1.0 | 22 | 64% |
| TNT.TNT 0.99.1 | 10 | 50% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 1288. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 123 | 70% | 140 |
| apc.LeeroyJenkins2 1.0 | 29 | 17% | 39 |
| TNT.TNT 0.99.1 | 13 | 7% | 18 |
| josago.Jorgito 0.16 | 8 | 5% | 9 |
| css.Delitioner 0.11 | 2 | 1% | 3 |
| rampancy.Durandal 2.1d | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 192137 melee ticks, 64691 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 70 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 57506 sent, 52560 reached their opponent, 7414 virtual hits (14.1% of those reached).

## Melee bench: F05

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1490264. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 121 over 6 battles (20.2 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 79.8 | 35 / 210 | 2.81 | 15.9% | 26292 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.7% | 113 |
| justin.DemonicRage 3.4 | 2.0 | 16.8% | 53 |
| hadur117.Hadur 3.21md | 2.8 | 15.9% | 35 |
| wompi.Numbat 2.1 | 4.0 | 12.2% | 7 |
| ms.Ares 0.19 | 5.3 | 9.1% | 0 |
| axeBots.HataMoto 3.09 | 5.7 | 8.7% | 2 |
| supersample.SuperBoxBot 1.0 | 7.0 | 5.6% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.1% | 0 |
| GarmBox.Oranges 1.0 | 9.3 | 4.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 80.6 | 6 / 35 | 4212 |
| 2 | 3 | 66.5 | 80.3 | 9 / 35 | 4692 |
| 3 | 3 | 63.7 | 77.1 | 1 / 35 | 4124 |
| 4 | 3 | 65.5 | 80.0 | 7 / 35 | 4300 |
| 5 | 3 | 64.9 | 78.1 | 5 / 35 | 4322 |
| 6 | 3 | 66.6 | 82.9 | 7 / 35 | 4642 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 47 | 13% |
| justin.DemonicRage 3.4 | 37 | 41% |
| wompi.Numbat 2.1 | 8 | 100% |
| axeBots.HataMoto 3.09 | 4 | 100% |
| ms.Ares 0.19 | 2 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 76 | 43% | 85 |
| justin.DemonicRage 3.4 | 65 | 37% | 78 |
| wompi.Numbat 2.1 | 20 | 11% | 26 |
| axeBots.HataMoto 3.09 | 7 | 4% | 10 |
| ms.Ares 0.19 | 4 | 2% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 3 |

Posture (Hadur's M records, 201 rounds): 153887 melee ticks, 40143 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 113 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 113 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 46110 sent, 40975 reached their opponent, 6357 virtual hits (15.5% of those reached).

## Melee bench: F06

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1496269. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 171 over 6 battles (28.5 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 94.0 | 159 / 210 | 1.54 | 21.5% | 36823 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 21.5% | 159 |
| jekl.StoneGhost 0.7 | 2.2 | 14.1% | 15 |
| origin.SleepSiphon 1.7b | 2.8 | 13.2% | 23 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.7% | 5 |
| mld.Wisdom 1.0 | 5.0 | 10.5% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.3% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 6.7% | 3 |
| DBall.NUKE 0.1 | 8.2 | 5.9% | 2 |
| spinnercat.Omen 1.0 | 8.7 | 5.7% | 0 |
| sample.Fire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 91.7 | 27 / 35 | 6185 |
| 2 | 1 | 72.0 | 92.7 | 28 / 35 | 5997 |
| 3 | 1 | 73.5 | 97.5 | 30 / 35 | 6277 |
| 4 | 1 | 71.6 | 92.7 | 24 / 35 | 5961 |
| 5 | 1 | 72.7 | 95.9 | 25 / 35 | 6388 |
| 6 | 1 | 71.9 | 93.3 | 25 / 35 | 6015 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 70 | 91% |
| origin.SleepSiphon 1.7b | 49 | 82% |
| pe.minimelee.SandboxMiniMelee 1.1 | 34 | 91% |
| mld.Wisdom 1.0 | 11 | 91% |
| gg.Wolverine 2.0 | 9 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 75% |
| DBall.NUKE 0.1 | 3 | 67% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 18 | 35% | 67 |
| jekl.StoneGhost 0.7 | 14 | 27% | 58 |
| pe.minimelee.SandboxMiniMelee 1.1 | 8 | 16% | 37 |
| mld.Wisdom 1.0 | 5 | 10% | 21 |
| gg.Wolverine 2.0 | 4 | 8% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 2% | 8 |
| DBall.NUKE 0.1 | 1 | 2% | 5 |
| spinnercat.Omen 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 198 rounds): 145667 melee ticks, 43994 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 32 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 44016 sent, 39201 reached their opponent, 7999 virtual hits (20.4% of those reached).

## Melee bench: F07

hadur117.Hadur 3.21md against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1502898. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 102 over 6 battles (17.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.4 | 96.1 | 156 / 210 | 1.31 | 26.0% | 47596 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 26.0% | 156 |
| rtk.Tachikoma 1.0 | 2.0 | 18.5% | 27 |
| franzor.Lizt 1.3.1 | 3.5 | 12.8% | 16 |
| oog.melee.CapuletDroid 1.1 | 3.5 | 12.7% | 10 |
| lrem.micro.MoggFanatic 0.2 | 5.2 | 10.0% | 1 |
| exauge.GateKeeper 1.1.121g | 5.8 | 9.0% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.2% | 0 |
| sample.Target 1.0 | 8.0 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 94.3 | 22 / 35 | 7241 |
| 2 | 1 | 74.8 | 93.9 | 23 / 35 | 7912 |
| 3 | 1 | 76.0 | 97.1 | 27 / 35 | 8209 |
| 4 | 1 | 75.8 | 96.4 | 27 / 35 | 8164 |
| 5 | 1 | 75.4 | 97.1 | 28 / 35 | 7622 |
| 6 | 1 | 76.5 | 97.5 | 29 / 35 | 8448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 120 | 81% |
| oog.melee.CapuletDroid 1.1 | 40 | 83% |
| franzor.Lizt 1.3.1 | 39 | 67% |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% |

Hadur died in 54 of 210 rounds, at a mean tick of 1725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 28 | 52% | 140 |
| franzor.Lizt 1.3.1 | 15 | 28% | 3 |
| oog.melee.CapuletDroid 1.1 | 8 | 15% | 55 |
| exauge.GateKeeper 1.1.121g | 2 | 4% | 5 |
| lrem.micro.MoggFanatic 0.2 | 1 | 2% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 194380 melee ticks, 94107 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 52458 sent, 48210 reached their opponent, 9651 virtual hits (20.0% of those reached).

## Melee bench: F08

hadur117.Hadur 3.21md against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1494004. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 305 over 6 battles (50.8 per battle, most in one battle 61). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.8 | 158 / 210 | 1.42 | 23.5% | 33163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 23.5% | 158 |
| shrub.Vapour v159 | 2.3 | 14.3% | 18 |
| tm.Yuugao 1.0 | 2.7 | 14.4% | 24 |
| com.spp.robocode.MostlyHarmless 010 | 4.0 | 11.1% | 6 |
| m3thos.Eva00 1.1 | 5.2 | 10.0% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 5.8 | 9.0% | 1 |
| qualidafial.MajorDick 1.0.1 | 7.3 | 6.7% | 0 |
| SHAM.WOW 1.4 | 7.8 | 6.0% | 1 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 96.1 | 27 / 35 | 5235 |
| 2 | 1 | 72.7 | 95.4 | 27 / 35 | 5859 |
| 3 | 1 | 71.5 | 95.4 | 25 / 35 | 5422 |
| 4 | 1 | 70.8 | 91.1 | 26 / 35 | 5302 |
| 5 | 1 | 72.0 | 95.0 | 25 / 35 | 5691 |
| 6 | 1 | 72.3 | 95.7 | 28 / 35 | 5654 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 64 | 72% |
| shrub.Vapour v159 | 56 | 82% |
| com.spp.robocode.MostlyHarmless 010 | 34 | 94% |
| m3thos.Eva00 1.1 | 15 | 93% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 93% |
| SHAM.WOW 1.4 | 5 | 80% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 996. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 20 | 38% | 67 |
| shrub.Vapour v159 | 16 | 31% | 67 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 19% | 35 |
| m3thos.Eva00 1.1 | 2 | 4% | 13 |
| SHAM.WOW 1.4 | 2 | 4% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 1 | 2% | 18 |
| zyx.nano.BacillusComma 1.0 | 1 | 2% | 2 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 143384 melee ticks, 52130 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 62 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 42458 sent, 38187 reached their opponent, 6718 virtual hits (17.6% of those reached).

## Melee bench: F09

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1492091. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 162 over 6 battles (27.0 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 80.6 | 72 / 210 | 2.74 | 16.7% | 24615 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.5 | 17.0% | 88 |
| hadur117.Hadur 3.21md | 1.5 | 16.7% | 72 |
| kc.micro.Figment 1.0 | 3.0 | 14.1% | 21 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.3% | 15 |
| yagami.Tidus 0.11 | 4.7 | 10.5% | 4 |
| mc2.enemy.Original 0.9 | 5.8 | 8.8% | 8 |
| dft.Calliope 5.6 | 6.8 | 7.7% | 2 |
| step.nanoPri 1.0 | 8.3 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 4.8% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 75.2 | 10 / 35 | 3945 |
| 2 | 1 | 66.8 | 82.5 | 14 / 35 | 4431 |
| 3 | 1 | 67.2 | 82.9 | 15 / 35 | 4502 |
| 4 | 2 | 65.4 | 80.6 | 9 / 35 | 3994 |
| 5 | 1 | 65.9 | 81.9 | 12 / 35 | 3960 |
| 6 | 2 | 65.6 | 80.6 | 12 / 35 | 3783 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 54 | 33% |
| kc.micro.Figment 1.0 | 40 | 83% |
| pedersen.Grishnakh 1.0 | 18 | 44% |
| mc2.enemy.Original 0.9 | 7 | 57% |
| yagami.Tidus 0.11 | 7 | 71% |
| dft.Calliope 5.6 | 3 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 57 | 41% | 77 |
| kc.micro.Figment 1.0 | 26 | 19% | 62 |
| yagami.Tidus 0.11 | 16 | 12% | 20 |
| pedersen.Grishnakh 1.0 | 16 | 12% | 18 |
| mc2.enemy.Original 0.9 | 13 | 9% | 19 |
| step.nanoPri 1.0 | 3 | 2% | 3 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
| dft.Calliope 5.6 | 2 | 1% | 5 |
| robar.nano.Assertive_Melee 0.2 | 2 | 1% | 3 |

Posture (Hadur's M records, 201 rounds): 146557 melee ticks, 42066 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 52 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 52 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 47604 sent, 42713 reached their opponent, 5866 virtual hits (13.7% of those reached).

## Melee bench: F10

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1481457. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 211 over 6 battles (35.2 per battle, most in one battle 45). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 96.8 | 170 / 210 | 1.29 | 21.5% | 37477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 21.5% | 170 |
| DTF.Kludgy 1.2b | 2.3 | 14.0% | 15 |
| ne.Chimera 1.2 | 3.0 | 13.3% | 6 |
| ejb.Polaris 1.0.1 | 3.7 | 12.1% | 11 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.7% | 2 |
| vStar.RAFzilla 2.15 | 5.5 | 10.0% | 4 |
| kurios.DOSexe .9b | 7.5 | 5.4% | 0 |
| sam.Samspin 1.0 | 8.3 | 4.8% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 4.9% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.6 | 26 / 35 | 6252 |
| 2 | 1 | 72.1 | 96.8 | 27 / 35 | 6166 |
| 3 | 1 | 72.4 | 97.1 | 29 / 35 | 6384 |
| 4 | 1 | 72.2 | 97.8 | 29 / 35 | 6063 |
| 5 | 1 | 72.8 | 96.8 | 31 / 35 | 6514 |
| 6 | 1 | 72.1 | 97.5 | 28 / 35 | 6098 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 63 | 86% |
| ejb.Polaris 1.0.1 | 51 | 84% |
| ne.Chimera 1.2 | 44 | 91% |
| vStar.RAFzilla 2.15 | 20 | 90% |
| tvv.micro.Antares 1.1.1 | 9 | 100% |
| donjezza.Muncho 1.0 | 4 | 50% |
| kurios.DOSexe .9b | 3 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 1057. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 15 | 38% | 63 |
| ne.Chimera 1.2 | 9 | 23% | 52 |
| ejb.Polaris 1.0.1 | 8 | 20% | 49 |
| tvv.micro.Antares 1.1.1 | 4 | 10% | 10 |
| vStar.RAFzilla 2.15 | 2 | 5% | 19 |
| donjezza.Muncho 1.0 | 2 | 5% | 4 |
| kurios.DOSexe .9b | 0 | 0% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 2 |
| sam.Samspin 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 140422 melee ticks, 58485 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 64 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 44770 sent, 40032 reached their opponent, 7217 virtual hits (18.0% of those reached).

## Melee bench: F11

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1506995. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 160 over 6 battles (26.7 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 82.2 | 76 / 210 | 2.60 | 16.9% | 25033 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.2 | 16.9% | 76 |
| rz.Aleph 0.34 | 1.8 | 15.7% | 54 |
| cx.mini.Nimrod 0.55 | 3.0 | 13.0% | 30 |
| djc.DynaBot 0.1.1 | 4.2 | 10.9% | 19 |
| rdt199.Warlord 0.73 | 5.5 | 9.2% | 11 |
| br2.MobyDickBot 1.6 | 6.2 | 8.6% | 12 |
| uji.YellohFellah 1.0 | 6.5 | 8.3% | 7 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.3% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.1% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 82.2 | 9 / 35 | 4009 |
| 2 | 1 | 63.7 | 77.8 | 9 / 35 | 3891 |
| 3 | 1 | 67.2 | 87.0 | 15 / 35 | 4378 |
| 4 | 1 | 65.7 | 82.9 | 13 / 35 | 4057 |
| 5 | 1 | 66.1 | 82.2 | 13 / 35 | 4382 |
| 6 | 1 | 66.2 | 81.3 | 17 / 35 | 4316 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 54 | 54% |
| cx.mini.Nimrod 0.55 | 23 | 61% |
| djc.DynaBot 0.1.1 | 18 | 61% |
| rdt199.Warlord 0.73 | 13 | 77% |
| uji.YellohFellah 1.0 | 10 | 90% |
| br2.MobyDickBot 1.6 | 7 | 43% |

Hadur died in 134 of 210 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 47 | 35% | 75 |
| cx.mini.Nimrod 0.55 | 30 | 22% | 41 |
| rdt199.Warlord 0.73 | 19 | 14% | 33 |
| djc.DynaBot 0.1.1 | 16 | 12% | 25 |
| br2.MobyDickBot 1.6 | 8 | 6% | 13 |
| KiraNL.Chupacabra 0.4 | 8 | 6% | 8 |
| uji.YellohFellah 1.0 | 3 | 2% | 10 |
| stelo.MirrorNano 1.3 | 2 | 1% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 2 |

Posture (Hadur's M records, 201 rounds): 152529 melee ticks, 36341 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 70 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 49029 sent, 44066 reached their opponent, 5826 virtual hits (13.2% of those reached).

## Melee bench: F12

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1535187. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 185 over 6 battles (30.8 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 89.2 | 132 / 210 | 1.97 | 19.3% | 27832 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 19.3% | 132 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.4% | 26 |
| nat.PallasHawk 1.0 | 3.0 | 13.0% | 27 |
| darkcanuck.Leon 1.01 | 3.2 | 12.7% | 17 |
| brainfade.melee.Genghis 0.36 | 5.0 | 9.6% | 7 |
| jrm.Test0 1.0 | 6.2 | 8.4% | 0 |
| cs.sheldor.Talon 1.1 | 6.8 | 7.0% | 2 |
| jp.Perpy 16.0 | 8.5 | 5.8% | 0 |
| stuff.Vlad 0.1 | 9.2 | 5.3% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.3 | 19 / 35 | 4733 |
| 2 | 1 | 69.6 | 90.2 | 24 / 35 | 4761 |
| 3 | 1 | 68.2 | 85.4 | 22 / 35 | 4504 |
| 4 | 1 | 68.5 | 87.9 | 21 / 35 | 4415 |
| 5 | 1 | 70.1 | 93.3 | 23 / 35 | 4778 |
| 6 | 1 | 69.9 | 92.1 | 23 / 35 | 4641 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 50 | 72% |
| darkcanuck.Leon 1.01 | 48 | 88% |
| bts.wiki.RipCurl 0.9b | 41 | 83% |
| brainfade.melee.Genghis 0.36 | 7 | 71% |
| jaybot.bots.Oddball 4.0 | 6 | 100% |
| jrm.Test0 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 50% |
| stuff.Vlad 0.1 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 25 | 31% | 59 |
| bts.wiki.RipCurl 0.9b | 21 | 26% | 46 |
| darkcanuck.Leon 1.01 | 10 | 13% | 65 |
| brainfade.melee.Genghis 0.36 | 8 | 10% | 15 |
| jrm.Test0 1.0 | 7 | 9% | 11 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 6 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |
| jp.Perpy 16.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 133287 melee ticks, 40758 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 33 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43267 sent, 38285 reached their opponent, 6226 virtual hits (16.3% of those reached).

## Melee bench: F13

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1514711. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 177 over 6 battles (29.5 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 80.5 | 63 / 210 | 2.76 | 16.1% | 26698 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 16.6% | 85 |
| ags.Glacier 0.2.11 | 2.2 | 16.3% | 40 |
| hadur117.Hadur 3.21md | 2.3 | 16.1% | 63 |
| shinh.Entangled 0.3 | 4.2 | 12.1% | 14 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.3% | 5 |
| apc.Colossus2 0.17 | 6.3 | 7.9% | 0 |
| stelo.Wang 1.0 | 6.7 | 7.7% | 3 |
| maribo.FollowFire 1 | 8.2 | 4.5% | 0 |
| ayk.WallHugger 1.0 | 8.8 | 4.3% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.6 | 76.2 | 12 / 35 | 4578 |
| 2 | 2 | 64.9 | 78.7 | 11 / 35 | 4308 |
| 3 | 1 | 67.3 | 85.7 | 17 / 35 | 4491 |
| 4 | 3 | 64.7 | 78.7 | 7 / 35 | 4218 |
| 5 | 3 | 65.2 | 81.9 | 8 / 35 | 4337 |
| 6 | 2 | 66.4 | 81.6 | 8 / 35 | 4766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 43 | 63% |
| mn.Combat 3.25.0 | 42 | 33% |
| shinh.Entangled 0.3 | 19 | 63% |
| gh.micro.Gruweltje 0.7 | 9 | 78% |
| stelo.Wang 1.0 | 4 | 50% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 52 | 35% | 81 |
| mn.Combat 3.25.0 | 51 | 35% | 66 |
| shinh.Entangled 0.3 | 19 | 13% | 30 |
| gh.micro.Gruweltje 0.7 | 13 | 9% | 18 |
| stelo.Wang 1.0 | 5 | 3% | 7 |
| apc.Colossus2 0.17 | 3 | 2% | 4 |
| maribo.FollowFire 1 | 3 | 2% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 200 rounds): 139834 melee ticks, 39175 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 60 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 60 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 40524 sent, 35296 reached their opponent, 5375 virtual hits (15.2% of those reached).

## Melee bench: F14

hadur117.Hadur 3.21md against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1501898. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 185 over 6 battles (30.8 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 97.0 | 181 / 210 | 1.24 | 24.6% | 38982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 24.6% | 181 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.7% | 20 |
| sanyi.mikrobi.Roberto 1.0 | 3.7 | 11.4% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 4.3 | 10.6% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.2 | 10.2% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.1% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.0 | 9.0% | 6 |
| pa.Improved 1.0 | 8.0 | 6.8% | 1 |
| sample.TrackFire 1.0 | 9.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 94.3 | 26 / 35 | 6182 |
| 2 | 1 | 72.9 | 96.1 | 30 / 35 | 6299 |
| 3 | 1 | 73.8 | 98.2 | 33 / 35 | 6580 |
| 4 | 1 | 74.2 | 98.2 | 33 / 35 | 6810 |
| 5 | 1 | 73.9 | 97.9 | 29 / 35 | 6815 |
| 6 | 1 | 73.4 | 97.5 | 30 / 35 | 6296 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 111 | 89% |
| sanyi.mikrobi.Roberto 1.0 | 39 | 97% |
| sheldor.micro.PointInLineRRAL 1.0 | 21 | 71% |
| Lo_Ian.Gandalf_V4 4.0 | 11 | 91% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 100% |
| pa.Improved 1.0 | 7 | 86% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 15 | 52% | 97 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 31% | 27 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 7% | 14 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 3% | 39 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 3% | 14 |
| pa.Improved 1.0 | 1 | 3% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 8 |
| sample.TrackFire 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 198 rounds): 123896 melee ticks, 52838 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 35 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 35748 sent, 31509 reached their opponent, 7787 virtual hits (24.7% of those reached).

## Melee bench: F15

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1487490. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 182 over 6 battles (30.3 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.3 | 135 / 210 | 1.97 | 20.1% | 34515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 20.1% | 135 |
| emp.Yngwie 1.11 | 2.8 | 12.9% | 41 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.4% | 14 |
| mld.DustBunny 3.8 | 3.2 | 12.7% | 5 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.5% | 3 |
| kawigi.robot.Girl 1.2 | 5.8 | 8.8% | 10 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.5% | 0 |
| lambdaxy.TBot 0.1 | 7.5 | 6.5% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.2 | 4.4% | 0 |
| divineomega.TrialBot 0.003 | 9.8 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 90.8 | 24 / 35 | 5639 |
| 2 | 1 | 72.6 | 95.6 | 29 / 35 | 6407 |
| 3 | 1 | 70.9 | 91.1 | 22 / 35 | 5960 |
| 4 | 1 | 66.6 | 78.7 | 16 / 35 | 4983 |
| 5 | 1 | 69.8 | 87.9 | 19 / 35 | 5698 |
| 6 | 1 | 71.0 | 91.4 | 25 / 35 | 5828 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 62 | 68% |
| kawigi.micro.Shiz 1.1 | 39 | 92% |
| mld.DustBunny 3.8 | 30 | 100% |
| kawigi.robot.Girl 1.2 | 16 | 69% |
| cb.nano.Insomnia 1.0 | 12 | 100% |
| lambdaxy.TBot 0.1 | 2 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| divineomega.TrialBot 0.003 | 1 | 0% |

Hadur died in 75 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 33 | 44% | 93 |
| mld.DustBunny 3.8 | 10 | 13% | 38 |
| cb.nano.Insomnia 1.0 | 10 | 13% | 17 |
| kawigi.robot.Girl 1.2 | 9 | 12% | 15 |
| kawigi.micro.Shiz 1.1 | 7 | 9% | 30 |
| lambdaxy.TBot 0.1 | 3 | 4% | 7 |
| divineomega.TrialBot 0.003 | 2 | 3% | 6 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 4 |

Posture (Hadur's M records, 199 rounds): 163061 melee ticks, 49484 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 64 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 52017 sent, 47117 reached their opponent, 7384 virtual hits (15.7% of those reached).

## Melee bench: F16

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1504787. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 174 over 6 battles (29.0 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 91.3 | 130 / 210 | 1.78 | 20.8% | 37532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 20.8% | 130 |
| gh.Griezel 0.5.2 | 2.0 | 15.8% | 41 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 2 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.6% | 28 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.7% | 4 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.7% | 2 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.0% | 3 |
| asd.Cthulhu 1.3 | 8.7 | 4.7% | 0 |
| repositorio.NanoStep 1.0 | 8.7 | 4.8% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 90.5 | 22 / 35 | 6021 |
| 2 | 1 | 71.6 | 90.2 | 20 / 35 | 6433 |
| 3 | 1 | 72.1 | 92.4 | 21 / 35 | 6516 |
| 4 | 1 | 70.9 | 90.8 | 21 / 35 | 5994 |
| 5 | 1 | 71.0 | 89.8 | 21 / 35 | 6015 |
| 6 | 1 | 72.7 | 94.3 | 25 / 35 | 6553 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 85 | 71% |
| techdude.forest.FlamingForest 1.1 | 42 | 67% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 27 | 100% |
| tvv.nano.Polaris 1.2 | 9 | 100% |
| bvh.fnr.Fenrir 0.36l | 7 | 43% |
| stelo.IntrinsicVolatility 1.4 | 5 | 60% |

Hadur died in 80 of 210 rounds, at a mean tick of 1231. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 32 | 40% | 99 |
| techdude.forest.FlamingForest 1.1 | 20 | 25% | 46 |
| bvh.fnr.Fenrir 0.36l | 16 | 20% | 20 |
| stelo.IntrinsicVolatility 1.4 | 4 | 5% | 6 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2 | 3% | 22 |
| tvv.nano.Polaris 1.2 | 2 | 3% | 10 |
| divineomega.DivineBot 1.9.4.5 | 2 | 3% | 4 |
| asd.Cthulhu 1.3 | 2 | 3% | 2 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 173987 melee ticks, 68725 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 33 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 54864 sent, 49962 reached their opponent, 7996 virtual hits (16.0% of those reached).

## Melee bench: F17

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1494900. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 168 over 6 battles (28.0 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 85.5 | 105 / 210 | 2.30 | 19.3% | 36256 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 19.3% | 105 |
| et.Predator 1.8 | 2.2 | 13.6% | 26 |
| cx.BlestPain 1.41 | 3.3 | 12.4% | 38 |
| oog.melee.Mercutio 1.0 | 3.5 | 12.6% | 28 |
| ahf.NanoAndrew .4 | 5.2 | 10.5% | 8 |
| maribo.melee.BMV 0.1 | 6.2 | 9.2% | 2 |
| nic.Nicator 2.4 | 6.7 | 8.9% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.6% | 1 |
| tex.Longbot 0.4 | 8.7 | 5.3% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 85.4 | 16 / 35 | 5968 |
| 2 | 1 | 71.7 | 90.5 | 23 / 35 | 6765 |
| 3 | 1 | 67.4 | 80.0 | 13 / 35 | 5748 |
| 4 | 1 | 70.5 | 88.6 | 19 / 35 | 6257 |
| 5 | 1 | 69.4 | 86.3 | 19 / 35 | 5796 |
| 6 | 1 | 68.1 | 82.2 | 15 / 35 | 5722 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 46 | 80% |
| et.Predator 1.8 | 42 | 71% |
| cx.BlestPain 1.41 | 38 | 47% |
| ahf.NanoAndrew .4 | 10 | 90% |
| nic.Nicator 2.4 | 4 | 100% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 3 | 67% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1043. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 29 | 27% | 48 |
| et.Predator 1.8 | 28 | 26% | 54 |
| oog.melee.Mercutio 1.0 | 19 | 18% | 55 |
| ahf.NanoAndrew .4 | 14 | 13% | 28 |
| maribo.melee.BMV 0.1 | 8 | 7% | 11 |
| nic.Nicator 2.4 | 3 | 3% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 4 |
| tex.Longbot 0.4 | 2 | 2% | 2 |
| goblin.Bender 2.4 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 154993 melee ticks, 60374 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 49 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 50483 sent, 45642 reached their opponent, 9226 virtual hits (20.2% of those reached).

## Melee bench: F18

hadur117.Hadur 3.21md against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1492392. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 275 over 6 battles (45.8 per battle, most in one battle 53). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.7 | 157 / 210 | 1.67 | 22.6% | 30286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 22.6% | 157 |
| agd.Mooserwirt2 2.7 | 2.0 | 14.1% | 20 |
| uji.DBH 1.1 | 3.2 | 12.7% | 13 |
| sigterm.Sigterm 1.0 | 4.7 | 10.3% | 7 |
| spinnercat.Robovirus 2.718 | 5.2 | 9.6% | 2 |
| ratosh.Nobo 0.21 | 5.5 | 9.6% | 3 |
| kawigi.mini.Fhqwhgads 1.1 | 6.5 | 8.7% | 4 |
| stelo.WangRobot 1.0 | 8.2 | 6.8% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.6 | 30 / 35 | 5084 |
| 2 | 1 | 71.4 | 93.9 | 28 / 35 | 5284 |
| 3 | 1 | 69.8 | 90.0 | 25 / 35 | 4900 |
| 4 | 1 | 71.7 | 95.7 | 28 / 35 | 5370 |
| 5 | 1 | 69.0 | 87.1 | 24 / 35 | 4671 |
| 6 | 1 | 69.5 | 89.6 | 22 / 35 | 4977 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 51 | 92% |
| uji.DBH 1.1 | 46 | 78% |
| sigterm.Sigterm 1.0 | 28 | 93% |
| stelo.WangRobot 1.0 | 14 | 93% |
| spinnercat.Robovirus 2.718 | 14 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 12 | 92% |
| ratosh.Nobo 0.21 | 8 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 20 | 37% | 58 |
| uji.DBH 1.1 | 15 | 28% | 40 |
| ratosh.Nobo 0.21 | 6 | 11% | 21 |
| sigterm.Sigterm 1.0 | 5 | 9% | 25 |
| stelo.WangRobot 1.0 | 3 | 6% | 15 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 4% | 21 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 4% | 7 |
| spinnercat.Robovirus 2.718 | 1 | 2% | 22 |

Posture (Hadur's M records, 199 rounds): 126201 melee ticks, 45028 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 65 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38749 sent, 34346 reached their opponent, 7389 virtual hits (21.5% of those reached).

## Melee bench: F19

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1492204. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 155 over 6 battles (25.8 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.4 | 98.8 | 200 / 210 | 1.10 | 23.3% | 40449 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 23.3% | 200 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.8% | 5 |
| krillr.mini.JointStrike 2.0.0 | 3.7 | 11.7% | 1 |
| mld.Infinity 2.2 | 3.7 | 11.5% | 3 |
| erdnis.Rover 0.3 | 4.7 | 10.9% | 0 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.6% | 0 |
| mbh.Mbh 0.1 | 7.0 | 6.9% | 0 |
| pac.ABC 2.1 | 7.8 | 6.2% | 1 |
| pbg.R2D2 1.0 | 9.0 | 5.0% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.4 | 99.0 | 34 / 35 | 6809 |
| 2 | 1 | 73.7 | 96.2 | 31 / 35 | 6596 |
| 3 | 1 | 74.7 | 99.4 | 34 / 35 | 6977 |
| 4 | 1 | 74.5 | 99.4 | 34 / 35 | 6706 |
| 5 | 1 | 74.4 | 99.4 | 33 / 35 | 6593 |
| 6 | 1 | 74.8 | 99.7 | 34 / 35 | 6768 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 128 | 98% |
| mld.Infinity 2.2 | 24 | 100% |
| krillr.mini.JointStrike 2.0.0 | 23 | 96% |
| erdnis.Rover 0.3 | 18 | 100% |
| patson.PatsonTestBot 1.0 | 5 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |
| pac.ABC 2.1 | 2 | 100% |

Hadur died in 10 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 3 | 30% | 72 |
| krillr.mini.JointStrike 2.0.0 | 3 | 30% | 32 |
| erdnis.Rover 0.3 | 1 | 10% | 41 |
| patson.PatsonTestBot 1.0 | 1 | 10% | 16 |
| pbg.R2D2 1.0 | 1 | 10% | 12 |
| mbh.Mbh 0.1 | 1 | 10% | 7 |
| mld.Infinity 2.2 | 0 | 0% | 18 |
| pac.ABC 2.1 | 0 | 0% | 6 |

Posture (Hadur's M records, 198 rounds): 121745 melee ticks, 47616 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 47 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 40558 sent, 35830 reached their opponent, 7918 virtual hits (22.1% of those reached).

## Melee bench: F20

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1526616. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 141 over 6 battles (23.5 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 92.4 | 149 / 210 | 1.69 | 21.4% | 38341 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 21.4% | 149 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 31 |
| fwb.Nine 1.0.1 | 3.5 | 11.4% | 8 |
| catcat20.Rabbit 0.001 | 4.0 | 10.7% | 18 |
| nz.jdc.nano.GridFu 1.0 | 4.7 | 9.8% | 2 |
| m3thos.mini.Eva01 0.5.5 | 5.8 | 8.9% | 0 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.2% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.6% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.7 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 89.8 | 24 / 35 | 6538 |
| 2 | 1 | 72.9 | 96.2 | 27 / 35 | 6299 |
| 3 | 1 | 71.8 | 90.5 | 24 / 35 | 6532 |
| 4 | 1 | 72.0 | 93.3 | 26 / 35 | 6508 |
| 5 | 1 | 73.7 | 96.2 | 29 / 35 | 6895 |
| 6 | 1 | 69.9 | 88.3 | 19 / 35 | 5569 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 82 | 82% |
| fwb.Nine 1.0.1 | 39 | 100% |
| catcat20.Rabbit 0.001 | 36 | 69% |
| nz.jdc.nano.GridFu 1.0 | 7 | 100% |
| m3thos.mini.Eva01 0.5.5 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| bayen.nut.Squirrel 1.615 | 3 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% |

Hadur died in 61 of 210 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 26 | 43% | 99 |
| catcat20.Rabbit 0.001 | 17 | 28% | 42 |
| fwb.Nine 1.0.1 | 9 | 15% | 29 |
| ntc.ControlledChaos 1.1.4 | 3 | 5% | 5 |
| nz.jdc.nano.GridFu 1.0 | 2 | 3% | 13 |
| bayen.nut.Squirrel 1.615 | 2 | 3% | 8 |
| djdjdj.NanoSkunk10 1.0 | 1 | 2% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 3 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 6 |

Posture (Hadur's M records, 200 rounds): 159032 melee ticks, 54348 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 40 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 49252 sent, 44397 reached their opponent, 9385 virtual hits (21.1% of those reached).

## Melee bench: F21

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1492512. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 121 over 6 battles (20.2 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.4 | 123 / 210 | 1.69 | 20.6% | 36569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 20.6% | 123 |
| eem.EvBot v4.6.16 | 2.0 | 16.5% | 66 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.9% | 9 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 7 |
| eld.Hmm 1.0 | 5.0 | 8.6% | 5 |
| oa.weak.BotherBot 0.1 | 6.5 | 6.8% | 0 |
| fire219.CatBot 1.0 | 7.2 | 6.3% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.0% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 91.7 | 18 / 35 | 6094 |
| 2 | 1 | 71.2 | 91.4 | 19 / 35 | 6286 |
| 3 | 1 | 71.6 | 93.3 | 20 / 35 | 6023 |
| 4 | 1 | 70.7 | 91.1 | 22 / 35 | 5844 |
| 5 | 1 | 70.8 | 92.4 | 20 / 35 | 5866 |
| 6 | 1 | 72.4 | 94.3 | 24 / 35 | 6456 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 117 | 57% |
| cf.RiO.RiOx 4.2.1 | 29 | 90% |
| dummy.mini.Scimitar 1.01 | 27 | 89% |
| eld.Hmm 1.0 | 8 | 50% |
| el.JumpShoot 0.2 | 1 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1318. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 60 | 69% | 120 |
| dummy.mini.Scimitar 1.01 | 11 | 13% | 43 |
| cf.RiO.RiOx 4.2.1 | 7 | 8% | 16 |
| eld.Hmm 1.0 | 5 | 6% | 18 |
| arthord.MannyPacquiao Beta | 2 | 2% | 5 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 6 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 170418 melee ticks, 78436 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 54 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 48852 sent, 44106 reached their opponent, 7035 virtual hits (16.0% of those reached).

## Melee bench: F22

hadur117.Hadur 3.21md against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489507. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 152 over 6 battles (25.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.1 | 83 / 210 | 2.19 | 19.5% | 26549 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 19.5% | 83 |
| pe.SandboxDT 2.71m | 2.0 | 18.0% | 63 |
| kvk.HebusLeTroll 0.35 | 3.0 | 15.7% | 42 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.4% | 13 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 5 |
| yk.JahRoslav 1.1 | 6.3 | 6.8% | 2 |
| tad.Dalek98 0.98 | 7.0 | 5.8% | 2 |
| gg.Squaraus 0.6 | 7.7 | 5.9% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 85.0 | 14 / 35 | 4386 |
| 2 | 1 | 67.3 | 85.4 | 17 / 35 | 4048 |
| 3 | 1 | 68.6 | 87.1 | 16 / 35 | 4640 |
| 4 | 1 | 67.1 | 83.6 | 13 / 35 | 4472 |
| 5 | 1 | 68.5 | 87.5 | 13 / 35 | 4592 |
| 6 | 1 | 66.7 | 82.1 | 10 / 35 | 4411 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 50 | 42% |
| kvk.HebusLeTroll 0.35 | 45 | 51% |
| jlm.javaDisturbance 0.59 | 33 | 79% |
| bigpete.Stewie 1.0 | 12 | 83% |
| yk.JahRoslav 1.1 | 3 | 33% |
| pbg.NinjaX 1.2 | 2 | 100% |
| tad.Dalek98 0.98 | 1 | 0% |

Hadur died in 127 of 210 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 48 | 38% | 72 |
| kvk.HebusLeTroll 0.35 | 41 | 32% | 61 |
| jlm.javaDisturbance 0.59 | 23 | 18% | 41 |
| bigpete.Stewie 1.0 | 8 | 6% | 22 |
| yk.JahRoslav 1.1 | 3 | 2% | 5 |
| tad.Dalek98 0.98 | 2 | 2% | 4 |
| pbg.NinjaX 1.2 | 2 | 2% | 3 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 152218 melee ticks, 42333 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 31 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 44470 sent, 40109 reached their opponent, 5163 virtual hits (12.9% of those reached).

## Melee bench: F23

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1477475. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 144 over 6 battles (24.0 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 97.1 | 182 / 210 | 1.26 | 22.7% | 40805 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 22.7% | 182 |
| pe.SandboxLump 1.52 | 2.0 | 16.4% | 21 |
| cre.Karolos 0.32 | 3.0 | 13.0% | 4 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.1% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 9.1% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.2 | 8.4% | 0 |
| cw.megas.Blade 0.8 | 6.5 | 8.2% | 1 |
| sample.Walls 1.0 | 8.0 | 6.9% | 0 |
| rrh.Iwillfindyou 2.0 | 9.0 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.2 | 99.0 | 32 / 35 | 6901 |
| 2 | 1 | 72.5 | 95.6 | 27 / 35 | 6167 |
| 3 | 1 | 74.4 | 98.4 | 31 / 35 | 7182 |
| 4 | 1 | 74.3 | 95.9 | 30 / 35 | 7318 |
| 5 | 1 | 72.9 | 95.6 | 30 / 35 | 6079 |
| 6 | 1 | 74.7 | 98.4 | 32 / 35 | 7158 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 123 | 90% |
| cre.Karolos 0.32 | 46 | 100% |
| stelo.AreaTargetingBot 1.1 | 9 | 100% |
| stelo.RamTrackSurfer 1.2 | 7 | 86% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 50% |

Hadur died in 28 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 15 | 54% | 108 |
| cre.Karolos 0.32 | 7 | 25% | 51 |
| stelo.AreaTargetingBot 1.1 | 2 | 7% | 19 |
| stelo.RamTrackSurfer 1.2 | 2 | 7% | 13 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 4% | 7 |
| cw.megas.Blade 0.8 | 1 | 4% | 4 |
| sample.Walls 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 198 rounds): 117305 melee ticks, 49066 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 39 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 36861 sent, 31966 reached their opponent, 9130 virtual hits (28.6% of those reached).

## Melee bench: F24

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1489708. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 156 over 6 battles (26.0 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 81.6 | 63 / 210 | 2.66 | 16.7% | 25664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 16.7% | 63 |
| rz.GlowBlowMelee 1.4 | 2.7 | 14.1% | 47 |
| florent.XSeries.X2 0.12 | 2.8 | 13.7% | 34 |
| davidalves.Phoenix 0.54 | 3.7 | 13.0% | 40 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.6% | 18 |
| oog.melee.Corsair 1.0 | 6.0 | 9.6% | 6 |
| lunchie.Lunchbox 0.93 | 7.3 | 5.8% | 1 |
| stelo.SoJNanoMelee 1.1 | 8.2 | 6.0% | 2 |
| as.FrankTheTank 1.3 | 9.0 | 4.8% | 0 |
| evd.X1 0.01 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 80.0 | 11 / 35 | 4177 |
| 2 | 1 | 67.3 | 87.6 | 13 / 35 | 4166 |
| 3 | 1 | 66.1 | 83.8 | 10 / 35 | 4280 |
| 4 | 1 | 64.9 | 79.0 | 7 / 35 | 4417 |
| 5 | 1 | 66.3 | 80.3 | 14 / 35 | 4608 |
| 6 | 1 | 64.3 | 78.7 | 8 / 35 | 4016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 45 | 51% |
| davidalves.Phoenix 0.54 | 27 | 37% |
| florent.XSeries.X2 0.12 | 20 | 45% |
| pedersen.Ugluk 1.1.1 | 19 | 53% |
| oog.melee.Corsair 1.0 | 12 | 75% |
| stelo.SoJNanoMelee 1.1 | 2 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 0% |

Hadur died in 148 of 210 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 38 | 26% | 53 |
| florent.XSeries.X2 0.12 | 35 | 24% | 46 |
| davidalves.Phoenix 0.54 | 29 | 20% | 40 |
| pedersen.Ugluk 1.1.1 | 24 | 16% | 32 |
| oog.melee.Corsair 1.0 | 12 | 8% | 27 |
| evd.X1 0.01 | 4 | 3% | 4 |
| stelo.SoJNanoMelee 1.1 | 3 | 2% | 5 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 2 |
| as.FrankTheTank 1.3 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 138473 melee ticks, 35833 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 271 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 120 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 44819 sent, 39611 reached their opponent, 6824 virtual hits (17.2% of those reached).

## Melee bench: F25

hadur117.Hadur 3.21md against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1500149. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 157 over 6 battles (26.2 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.0 | 147 / 210 | 1.96 | 21.0% | 23685 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 21.0% | 147 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 14.3% | 12 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 13.5% | 12 |
| jdw.Hurricane 1.4 | 3.5 | 13.3% | 24 |
| ds.Oo 2.2 | 5.0 | 10.2% | 8 |
| awesomeness.Elite 1.0 | 6.5 | 8.0% | 1 |
| adt.Ar2 1.1 | 7.2 | 7.4% | 1 |
| gjr.Cephalosporin 0.1 | 7.3 | 7.1% | 5 |
| amk.ChumbaMini 0.2 | 9.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.3 | 29 / 35 | 4410 |
| 2 | 1 | 69.7 | 91.1 | 25 / 35 | 3971 |
| 3 | 1 | 68.6 | 88.6 | 23 / 35 | 3855 |
| 4 | 1 | 67.8 | 83.9 | 22 / 35 | 3940 |
| 5 | 1 | 67.0 | 82.5 | 25 / 35 | 3645 |
| 6 | 1 | 68.3 | 87.9 | 23 / 35 | 3864 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 51 | 96% |
| voidious.micro.BlitzBat 1.05 | 41 | 93% |
| jdw.Hurricane 1.4 | 36 | 78% |
| ds.Oo 2.2 | 24 | 79% |
| awesomeness.Elite 1.0 | 8 | 88% |
| gjr.Cephalosporin 0.1 | 4 | 75% |
| adt.Ar2 1.1 | 3 | 67% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 17 | 27% | 35 |
| voidious.micro.BlitzBat 1.05 | 13 | 21% | 45 |
| voidious.mini.BrokenSword 2.0.3 | 10 | 16% | 50 |
| ds.Oo 2.2 | 7 | 11% | 27 |
| adt.Ar2 1.1 | 6 | 10% | 16 |
| gjr.Cephalosporin 0.1 | 5 | 8% | 20 |
| awesomeness.Elite 1.0 | 4 | 6% | 15 |
| amk.ChumbaMini 0.2 | 1 | 2% | 2 |

Posture (Hadur's M records, 199 rounds): 120232 melee ticks, 30473 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 24 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38791 sent, 34386 reached their opponent, 5619 virtual hits (16.3% of those reached).

## Melee bench: F26

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1498149. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 207 over 6 battles (34.5 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 94.3 | 153 / 210 | 1.51 | 21.8% | 41069 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 21.8% | 153 |
| ak.Fermat 2.0 | 2.0 | 14.6% | 30 |
| lrem.Spectre 0.4.4 | 3.3 | 12.2% | 11 |
| shu.nitro.LENIN .T34 | 3.7 | 12.2% | 15 |
| js.PinBall 1.6 | 5.0 | 10.3% | 0 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.3% | 1 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 7.6% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 0 |
| sample.SpinBot 1.0 | 9.0 | 4.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 92.7 | 24 / 35 | 6502 |
| 2 | 1 | 73.1 | 95.2 | 29 / 35 | 6737 |
| 3 | 1 | 72.2 | 93.7 | 21 / 35 | 6778 |
| 4 | 1 | 72.6 | 94.3 | 26 / 35 | 6725 |
| 5 | 1 | 73.2 | 94.6 | 27 / 35 | 7166 |
| 6 | 1 | 73.6 | 95.6 | 26 / 35 | 7161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 67 | 75% |
| lrem.Spectre 0.4.4 | 42 | 90% |
| shu.nitro.LENIN .T34 | 40 | 90% |
| js.PinBall 1.6 | 12 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 90% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 100% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 1022. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 32 | 56% | 75 |
| shu.nitro.LENIN .T34 | 10 | 18% | 48 |
| lrem.Spectre 0.4.4 | 8 | 14% | 47 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 7% | 15 |
| js.PinBall 1.6 | 2 | 4% | 13 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 9 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 2 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 158420 melee ticks, 49557 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 33 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 49095 sent, 44139 reached their opponent, 10227 virtual hits (23.2% of those reached).

## Melee bench: F27

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1502434. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 94.1 | 172 / 210 | 1.53 | 21.3% | 33987 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 21.3% | 172 |
| mk.Alpha 0.2.1 | 2.2 | 13.6% | 24 |
| techdude.kombat.FlamingKombat 1.5 | 4.2 | 9.8% | 2 |
| EH.Eagle 1.0.6 | 4.3 | 9.9% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 5.8 | 8.8% | 3 |
| wee.Gem 1.8.4 | 6.3 | 8.5% | 4 |
| throxbot.ThroxBot 0.1 | 6.5 | 7.8% | 1 |
| joe.ADinosaur 1.0 | 7.2 | 8.3% | 0 |
| caimano.Furia_Ceca 0.22 | 8.0 | 7.4% | 1 |
| cs.Grudge 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 93.0 | 31 / 35 | 5859 |
| 2 | 1 | 72.0 | 95.2 | 29 / 35 | 5734 |
| 3 | 1 | 72.1 | 94.9 | 30 / 35 | 6073 |
| 4 | 1 | 71.6 | 93.0 | 31 / 35 | 5889 |
| 5 | 1 | 70.2 | 93.7 | 24 / 35 | 5019 |
| 6 | 1 | 71.1 | 94.6 | 27 / 35 | 5413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 100 | 91% |
| EH.Eagle 1.0.6 | 36 | 97% |
| wee.Gem 1.8.4 | 12 | 100% |
| throxbot.ThroxBot 0.1 | 12 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 91% |
| techdude.kombat.FlamingKombat 1.5 | 10 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 16 | 42% | 90 |
| EH.Eagle 1.0.6 | 9 | 24% | 43 |
| cs.Grudge 1.0 | 4 | 11% | 4 |
| sheldor.melee.nano.TestMelee 0.1 | 2 | 5% | 14 |
| joe.ADinosaur 1.0 | 2 | 5% | 13 |
| caimano.Furia_Ceca 0.22 | 2 | 5% | 7 |
| throxbot.ThroxBot 0.1 | 1 | 3% | 15 |
| wee.Gem 1.8.4 | 1 | 3% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 3% | 11 |

Posture (Hadur's M records, 200 rounds): 128011 melee ticks, 42400 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 24 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 41320 sent, 36394 reached their opponent, 8080 virtual hits (22.2% of those reached).

## Melee bench: F28

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1501768. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 187 over 6 battles (31.2 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 88.7 | 133 / 210 | 2.01 | 18.5% | 24940 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 18.5% | 133 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 36 |
| uji.Antique 1.0 | 3.3 | 12.2% | 23 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.4% | 3 |
| qohnil.blot.BlotBot 3.61 | 4.7 | 10.3% | 10 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.3% | 0 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.1% | 3 |
| matt.advanced.Katana 1.0 | 7.5 | 6.7% | 2 |
| stelo.Lifestealer 1.0 | 9.5 | 5.4% | 0 |
| stelo.PianistNano 1.2 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 92.4 | 23 / 35 | 4253 |
| 2 | 1 | 68.9 | 92.7 | 26 / 35 | 4157 |
| 3 | 1 | 67.6 | 88.6 | 22 / 35 | 3971 |
| 4 | 1 | 66.5 | 83.8 | 16 / 35 | 4025 |
| 5 | 1 | 67.8 | 85.7 | 23 / 35 | 4334 |
| 6 | 1 | 68.2 | 89.2 | 23 / 35 | 4200 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 70 | 81% |
| uji.Antique 1.0 | 48 | 85% |
| qohnil.blot.BlotBot 3.61 | 13 | 69% |
| pfvicm.Sobieski 7.2.3b | 11 | 91% |
| ahr.ice.Ice 1.0.2 | 8 | 88% |
| amk.ChumbaWumba 0.3 | 7 | 100% |
| matt.advanced.Katana 1.0 | 3 | 67% |

Hadur died in 79 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 21 | 27% | 55 |
| uji.Antique 1.0 | 17 | 22% | 57 |
| pfvicm.Sobieski 7.2.3b | 17 | 22% | 26 |
| qohnil.blot.BlotBot 3.61 | 11 | 14% | 32 |
| amk.ChumbaWumba 0.3 | 6 | 8% | 12 |
| ahr.ice.Ice 1.0.2 | 4 | 5% | 12 |
| stelo.Lifestealer 1.0 | 2 | 3% | 5 |
| matt.advanced.Katana 1.0 | 1 | 1% | 10 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 200 rounds): 129253 melee ticks, 32392 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 65 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 42878 sent, 37813 reached their opponent, 5045 virtual hits (13.3% of those reached).

## Melee bench: F29

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1499534. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 167 over 6 battles (27.8 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.7 | 111 / 210 | 2.01 | 19.6% | 30493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 19.6% | 111 |
| deewiant.Anomaly 0.2 | 2.5 | 14.7% | 39 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.0% | 48 |
| myl.micro.Troodon 1.10 | 4.2 | 11.5% | 4 |
| jok.PheonixM 0.1.2 | 4.8 | 10.8% | 4 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.1% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 5.7% | 0 |
| DBall.Anarchy 0.1 | 7.7 | 5.8% | 2 |
| ap.Frederick 1.1 | 9.0 | 4.7% | 1 |
| jangs.ns51 1.0 | 9.8 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.3 | 26 / 35 | 5137 |
| 2 | 1 | 69.9 | 88.9 | 14 / 35 | 5015 |
| 3 | 1 | 68.4 | 84.4 | 15 / 35 | 4835 |
| 4 | 1 | 69.8 | 86.3 | 17 / 35 | 5227 |
| 5 | 1 | 70.4 | 89.8 | 18 / 35 | 5174 |
| 6 | 1 | 70.2 | 89.5 | 21 / 35 | 5105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 68 | 62% |
| zyx.mega.YersiniaPestis 3.1 | 48 | 46% |
| myl.micro.Troodon 1.10 | 19 | 100% |
| jok.PheonixM 0.1.2 | 16 | 94% |
| DBall.Anarchy 0.1 | 4 | 100% |
| ph.melee.ArcherME 0.3 | 3 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1077. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 41 | 41% | 72 |
| deewiant.Anomaly 0.2 | 37 | 37% | 74 |
| myl.micro.Troodon 1.10 | 12 | 12% | 22 |
| jok.PheonixM 0.1.2 | 5 | 5% | 27 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 5 |
| jangs.ns51 1.0 | 2 | 2% | 3 |
| DBall.Anarchy 0.1 | 0 | 0% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 170202 melee ticks, 56599 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 33 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 52593 sent, 47608 reached their opponent, 6714 virtual hits (14.1% of those reached).

## Melee bench: F30

hadur117.Hadur 3.21md against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1497536. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 156 over 6 battles (26.0 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 81.2 | 78 / 210 | 2.50 | 19.0% | 27574 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 19.0% | 78 |
| darkcanuck.B26354 1.06 | 2.0 | 16.0% | 67 |
| oog.melee.Capulet 1.2 | 3.5 | 14.2% | 30 |
| stelo.PastFuture 2.3.2 | 3.5 | 14.6% | 18 |
| intruder.PrairieWolf 2.61 | 5.2 | 9.9% | 10 |
| ntc.Opposite 1.5 | 6.3 | 8.3% | 1 |
| tripphippy.Alice 1.1 | 6.7 | 8.4% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 6.7% | 2 |
| GarmBox.Anger 1.0 | 9.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 81.1 | 11 / 35 | 4718 |
| 2 | 1 | 67.5 | 80.7 | 18 / 35 | 4853 |
| 3 | 1 | 64.7 | 78.6 | 12 / 35 | 4062 |
| 4 | 1 | 70.3 | 88.6 | 20 / 35 | 5272 |
| 5 | 1 | 66.4 | 82.5 | 8 / 35 | 4406 |
| 6 | 1 | 64.4 | 75.7 | 9 / 35 | 4263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 47 | 45% |
| oog.melee.Capulet 1.2 | 33 | 58% |
| stelo.PastFuture 2.3.2 | 27 | 74% |
| intruder.PrairieWolf 2.61 | 13 | 62% |
| tripphippy.Alice 1.1 | 8 | 88% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 50% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 47 | 36% | 68 |
| oog.melee.Capulet 1.2 | 32 | 24% | 53 |
| stelo.PastFuture 2.3.2 | 28 | 21% | 48 |
| intruder.PrairieWolf 2.61 | 10 | 8% | 20 |
| tripphippy.Alice 1.1 | 6 | 5% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 4% | 5 |
| ntc.Opposite 1.5 | 4 | 3% | 5 |

Posture (Hadur's M records, 202 rounds): 161464 melee ticks, 39388 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 58 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 45530 sent, 40997 reached their opponent, 7010 virtual hits (17.1% of those reached).

## Melee bench: F31

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1492788. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 152 over 6 battles (25.3 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 80.0 | 68 / 210 | 2.80 | 16.3% | 23485 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.8% | 87 |
| hadur117.Hadur 3.21md | 1.8 | 16.3% | 68 |
| gh.mini.Griezel 0.2 | 3.2 | 12.5% | 36 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.3% | 8 |
| d414.nano.Quantum 1.0.0 | 4.7 | 11.4% | 7 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.9% | 5 |
| timmit.nano.TimDog 0.33 | 6.8 | 7.0% | 1 |
| fm.mammillarias 1.3 | 8.5 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.8% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 74.0 | 8 / 35 | 3668 |
| 2 | 2 | 66.6 | 83.2 | 15 / 35 | 3945 |
| 3 | 2 | 62.9 | 74.6 | 9 / 35 | 3504 |
| 4 | 2 | 65.2 | 79.7 | 10 / 35 | 4138 |
| 5 | 2 | 67.2 | 86.3 | 11 / 35 | 4259 |
| 6 | 1 | 66.1 | 82.2 | 15 / 35 | 3971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 67 | 52% |
| gh.mini.Griezel 0.2 | 23 | 39% |
| d414.nano.Quantum 1.0.0 | 14 | 100% |
| spinnercat.micro.Tyger 0.1 | 7 | 86% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 50% |

Hadur died in 143 of 210 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 54 | 38% | 87 |
| gh.mini.Griezel 0.2 | 32 | 22% | 45 |
| spinnercat.micro.Tyger 0.1 | 19 | 13% | 22 |
| d414.nano.Quantum 1.0.0 | 17 | 12% | 29 |
| fm.mammillarias 1.3 | 7 | 5% | 7 |
| timmit.nano.TimDog 0.33 | 6 | 4% | 9 |
| gh.nano.Grofvuil 0.2 | 6 | 4% | 9 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

Posture (Hadur's M records, 201 rounds): 143369 melee ticks, 32399 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 29 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 29 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 46420 sent, 41216 reached their opponent, 6379 virtual hits (15.5% of those reached).

## Melee bench: F32

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1509399. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 198 over 6 battles (33.0 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 88.7 | 121 / 210 | 2.01 | 18.7% | 29021 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 18.7% | 121 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.8% | 53 |
| apc.botM 3.0 | 3.0 | 11.8% | 19 |
| vjik.UnViolation 1.1 | 4.8 | 9.7% | 6 |
| lxx.ConceptA 0.8 | 5.2 | 9.7% | 2 |
| bayen.UbaMicro 1.4 | 5.2 | 9.4% | 2 |
| yk.JahMicro 1.0 | 7.7 | 7.2% | 5 |
| panzer.Panzer 0.2 | 7.7 | 7.4% | 0 |
| conscience.Electron 1.3g | 8.5 | 6.7% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.9 | 18 / 35 | 5186 |
| 2 | 1 | 68.6 | 91.4 | 23 / 35 | 4735 |
| 3 | 1 | 67.6 | 87.0 | 19 / 35 | 4909 |
| 4 | 1 | 66.9 | 86.3 | 18 / 35 | 4515 |
| 5 | 1 | 68.9 | 90.2 | 22 / 35 | 4953 |
| 6 | 1 | 68.2 | 89.5 | 21 / 35 | 4723 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 91 | 64% |
| apc.botM 3.0 | 38 | 76% |
| vjik.UnViolation 1.1 | 10 | 90% |
| lxx.ConceptA 0.8 | 10 | 80% |
| yk.JahMicro 1.0 | 8 | 63% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| panzer.Panzer 0.2 | 5 | 100% |
| donjezza.Jezza 1.0 | 4 | 50% |

Hadur died in 89 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 40 | 45% | 86 |
| apc.botM 3.0 | 12 | 13% | 48 |
| bayen.UbaMicro 1.4 | 9 | 10% | 17 |
| lxx.ConceptA 0.8 | 8 | 9% | 18 |
| vjik.UnViolation 1.1 | 5 | 6% | 16 |
| conscience.Electron 1.3g | 5 | 6% | 8 |
| yk.JahMicro 1.0 | 4 | 4% | 8 |
| panzer.Panzer 0.2 | 4 | 4% | 4 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |

Posture (Hadur's M records, 200 rounds): 120795 melee ticks, 55175 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 64 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 40536 sent, 35570 reached their opponent, 6310 virtual hits (17.7% of those reached).

## Melee bench: F33

hadur117.Hadur 3.21md against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1496629. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 157 over 6 battles (26.2 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 90.2 | 145 / 210 | 1.79 | 22.6% | 31041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 22.6% | 145 |
| maribo.Quester 0.3 | 2.0 | 17.1% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.5% | 19 |
| labg.Cataclysm 2.05 | 4.2 | 11.7% | 14 |
| baal.nano.N 1.42 | 5.2 | 10.1% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.8 | 9.5% | 5 |
| sanja.First 0.1 | 7.3 | 5.7% | 0 |
| zyx.micro.Ant 1.1 | 7.5 | 5.9% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 95.0 | 27 / 35 | 5213 |
| 2 | 1 | 72.8 | 94.3 | 28 / 35 | 5404 |
| 3 | 1 | 71.5 | 91.4 | 22 / 35 | 5196 |
| 4 | 1 | 70.3 | 88.6 | 21 / 35 | 4869 |
| 5 | 1 | 71.1 | 88.2 | 26 / 35 | 5180 |
| 6 | 1 | 69.9 | 83.6 | 21 / 35 | 5179 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 76 | 86% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 53 | 85% |
| labg.Cataclysm 2.05 | 21 | 76% |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 90% |
| baal.nano.N 1.42 | 10 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 24 | 36% | 92 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 20% | 49 |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 17% | 16 |
| labg.Cataclysm 2.05 | 10 | 15% | 32 |
| baal.nano.N 1.42 | 3 | 5% | 9 |
| zyx.micro.Ant 1.1 | 2 | 3% | 6 |
| sanja.First 0.1 | 2 | 3% | 3 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 2% | 1 |

Posture (Hadur's M records, 201 rounds): 159903 melee ticks, 59338 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 54 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 46563 sent, 42137 reached their opponent, 6039 virtual hits (14.3% of those reached).

## Melee bench: F34

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1495774. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 139 over 6 battles (23.2 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.6 | 88 / 210 | 2.02 | 19.1% | 33946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.2 | 19.1% | 88 |
| stelo.Spread 0.9 | 2.0 | 16.9% | 63 |
| kid.Gladiator .7.2 | 2.8 | 15.8% | 41 |
| tcf.Reach 3 | 4.3 | 10.9% | 5 |
| jcs.Seth 1.8 | 4.7 | 10.7% | 13 |
| cli.Dancer 1.1 | 6.0 | 8.7% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.7% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.5% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 89.2 | 16 / 35 | 5909 |
| 2 | 1 | 69.5 | 88.9 | 13 / 35 | 5411 |
| 3 | 1 | 69.8 | 89.8 | 12 / 35 | 5655 |
| 4 | 1 | 71.1 | 90.8 | 13 / 35 | 6040 |
| 5 | 1 | 71.1 | 89.8 | 21 / 35 | 5887 |
| 6 | 2 | 68.0 | 83.2 | 13 / 35 | 5044 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 82 | 49% |
| kid.Gladiator .7.2 | 52 | 58% |
| jcs.Seth 1.8 | 21 | 57% |
| tcf.Reach 3 | 6 | 67% |
| ratosh.Wesco 1.4 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 1137. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 49 | 40% | 85 |
| kid.Gladiator .7.2 | 42 | 34% | 69 |
| jcs.Seth 1.8 | 15 | 12% | 25 |
| tcf.Reach 3 | 11 | 9% | 19 |
| cli.Dancer 1.1 | 3 | 2% | 4 |
| ratosh.Wesco 1.4 | 2 | 2% | 2 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 2 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 167076 melee ticks, 62294 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 33 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 49945 sent, 45030 reached their opponent, 7202 virtual hits (16.0% of those reached).

## Melee bench: F35

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1483188. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 126 over 6 battles (21.0 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 81.3 | 36 / 210 | 2.68 | 16.2% | 25206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.7% | 147 |
| hadur117.Hadur 3.21md | 2.0 | 16.2% | 36 |
| gh.mini.Gruwel 0.9 | 3.2 | 12.7% | 20 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 12.0% | 6 |
| rz.HawkOnFire 0.1 | 4.5 | 11.7% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6.5 | 6.3% | 0 |
| wit.Chuliath 1.0 | 6.8 | 6.2% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.0 | 5.3% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 80.0 | 7 / 35 | 3848 |
| 2 | 2 | 64.9 | 79.4 | 5 / 35 | 3995 |
| 3 | 2 | 66.1 | 82.5 | 5 / 35 | 4411 |
| 4 | 2 | 65.9 | 82.9 | 6 / 35 | 4322 |
| 5 | 2 | 66.6 | 83.5 | 8 / 35 | 4428 |
| 6 | 2 | 65.1 | 79.7 | 5 / 35 | 4202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 97 | 15% |
| gh.mini.Gruwel 0.9 | 12 | 33% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 100% |
| rz.HawkOnFire 0.1 | 8 | 100% |
| dans.Cinnamon 1.2 | 1 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 111 | 64% | 129 |
| gh.mini.Gruwel 0.9 | 25 | 14% | 30 |
| dmh.robocode.robot.BlackDeath 9.2 | 14 | 8% | 20 |
| rz.HawkOnFire 0.1 | 13 | 7% | 20 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7 | 4% | 7 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| wit.Chuliath 1.0 | 1 | 1% | 1 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 143551 melee ticks, 44572 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43605 sent, 38665 reached their opponent, 5726 virtual hits (14.8% of those reached).

## Melee bench: F36

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1484481. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 194 over 6 battles (32.3 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 94.8 | 164 / 210 | 1.47 | 21.7% | 35789 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 21.7% | 164 |
| alpha.RainingFire 1.0 | 2.2 | 12.4% | 14 |
| bzdp.Pansy 2.1 | 3.0 | 12.1% | 10 |
| mz.Cork 0.1 | 5.0 | 10.2% | 7 |
| bvh.micro.Freya 0.3 | 5.3 | 10.7% | 5 |
| m3thos.Eva02 0.7.1 | 5.5 | 9.6% | 5 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.3% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.4% | 1 |
| dl.BetterWalls 1.0 | 8.7 | 5.1% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 92.7 | 26 / 35 | 5837 |
| 2 | 1 | 71.6 | 92.1 | 24 / 35 | 6115 |
| 3 | 1 | 72.4 | 95.9 | 27 / 35 | 6004 |
| 4 | 1 | 73.3 | 97.1 | 30 / 35 | 6258 |
| 5 | 1 | 72.0 | 95.6 | 28 / 35 | 5597 |
| 6 | 1 | 72.4 | 95.2 | 29 / 35 | 5978 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 50 | 92% |
| alpha.RainingFire 1.0 | 37 | 76% |
| bvh.micro.Freya 0.3 | 32 | 94% |
| mz.Cork 0.1 | 31 | 90% |
| m3thos.Eva02 0.7.1 | 17 | 88% |
| bvh.mini.Fenrir 0.39 | 15 | 100% |
| dl.BetterWalls 1.0 | 2 | 50% |
| sample.MyFirstRobot 1.0 | 1 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 12 | 26% | 41 |
| bzdp.Pansy 2.1 | 11 | 24% | 50 |
| m3thos.Eva02 0.7.1 | 7 | 15% | 20 |
| bvh.micro.Freya 0.3 | 6 | 13% | 42 |
| mz.Cork 0.1 | 5 | 11% | 32 |
| bvh.mini.Fenrir 0.39 | 3 | 7% | 11 |
| dl.BetterWalls 1.0 | 1 | 2% | 9 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 199 rounds): 141393 melee ticks, 48331 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 47810 sent, 42982 reached their opponent, 8284 virtual hits (19.3% of those reached).

## Melee bench: F37

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1493800. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 218 over 6 battles (36.3 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 83.9 | 144 / 210 | 2.45 | 18.4% | 33066 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 18.4% | 144 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.8 | 11.1% | 11 |
| agrach.Dalek 1.0 | 3.7 | 10.1% | 12 |
| germ.TheMind .2 | 4.5 | 9.8% | 9 |
| EBBU.Sim2 1.02 | 5.0 | 9.2% | 5 |
| stelo.UntouchableNano 1.3 | 6.2 | 8.9% | 15 |
| mn.nano.perceptual.Impact 1.3.0 | 7.0 | 8.6% | 1 |
| lmk.ACPFinal 0.1 | 7.7 | 8.2% | 3 |
| mb.Beast 0.1 | 7.8 | 8.3% | 7 |
| skm.Ryubot 1.0 | 9.3 | 7.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 79.7 | 23 / 35 | 5198 |
| 2 | 1 | 67.8 | 87.6 | 24 / 35 | 5477 |
| 3 | 1 | 68.8 | 87.9 | 27 / 35 | 5932 |
| 4 | 1 | 65.3 | 79.7 | 21 / 35 | 5305 |
| 5 | 1 | 67.0 | 82.2 | 25 / 35 | 5467 |
| 6 | 1 | 67.9 | 86.3 | 24 / 35 | 5687 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 29 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 24 | 88% |
| germ.TheMind .2 | 21 | 95% |
| stelo.UntouchableNano 1.3 | 20 | 85% |
| EBBU.Sim2 1.02 | 16 | 100% |
| skm.Ryubot 1.0 | 15 | 100% |
| mb.Beast 0.1 | 14 | 93% |
| lmk.ACPFinal 0.1 | 13 | 92% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 383. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 19 | 28% | 23 |
| com.syncleus.robocode.Dreadnaught 0.1 | 16 | 24% | 42 |
| agrach.Dalek 1.0 | 8 | 12% | 40 |
| stelo.UntouchableNano 1.3 | 6 | 9% | 24 |
| germ.TheMind .2 | 5 | 7% | 19 |
| mb.Beast 0.1 | 5 | 7% | 18 |
| EBBU.Sim2 1.02 | 3 | 4% | 22 |
| lmk.ACPFinal 0.1 | 2 | 3% | 13 |
| skm.Ryubot 1.0 | 2 | 3% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 89816 melee ticks, 24910 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 77 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 77 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 30049 sent, 25319 reached their opponent, 6806 virtual hits (26.9% of those reached).

## Melee bench: F38

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1487405. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 155 over 6 battles (25.8 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.7 | 112 / 210 | 2.10 | 18.7% | 29944 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 18.7% | 112 |
| justin.Mallais 14.0 | 2.0 | 15.7% | 54 |
| bvh.mini.Freya 0.55 | 3.3 | 12.8% | 15 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.2% | 16 |
| cs.Wren 1.0 | 4.8 | 10.5% | 6 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.3% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 7.6% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.5% | 3 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.2% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 89.5 | 20 / 35 | 5207 |
| 2 | 1 | 69.1 | 90.8 | 18 / 35 | 4919 |
| 3 | 1 | 67.9 | 85.4 | 19 / 35 | 4675 |
| 4 | 1 | 68.1 | 86.3 | 17 / 35 | 5043 |
| 5 | 1 | 69.7 | 89.5 | 22 / 35 | 5238 |
| 6 | 1 | 67.9 | 84.8 | 16 / 35 | 4862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 80 | 69% |
| bts.mega.Gnarly 1.4 | 28 | 64% |
| bvh.mini.Freya 0.55 | 22 | 77% |
| cs.Wren 1.0 | 13 | 92% |
| kdf.KoulDestroyer 1.0 | 7 | 86% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 42 | 43% | 91 |
| bts.mega.Gnarly 1.4 | 24 | 24% | 47 |
| bvh.mini.Freya 0.55 | 14 | 14% | 33 |
| cs.Wren 1.0 | 6 | 6% | 14 |
| kdf.KoulDestroyer 1.0 | 6 | 6% | 11 |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 3% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 4 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 3 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 132975 melee ticks, 43198 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 41 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 42686 sent, 37536 reached their opponent, 7613 virtual hits (20.3% of those reached).

## Melee bench: F39

hadur117.Hadur 3.21md against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1483459. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 135 over 6 battles (22.5 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 90.0 | 122 / 210 | 1.80 | 21.9% | 34414 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 21.9% | 122 |
| bvh.fry.Freya 0.82 | 2.2 | 16.4% | 18 |
| az.Ololobot 0.2.4 | 2.8 | 15.6% | 66 |
| winamp32.micro.MicroMacro 1.0 | 4.5 | 9.8% | 1 |
| gimp.GimpBot 0.1 | 5.3 | 8.9% | 0 |
| apollokidd.ApolloKidd 0.9 | 5.7 | 8.6% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 6.5 | 7.6% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.0 | 6.1% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.0 | 21 / 35 | 5750 |
| 2 | 1 | 69.4 | 87.9 | 20 / 35 | 5492 |
| 3 | 1 | 70.9 | 91.4 | 21 / 35 | 5915 |
| 4 | 1 | 71.5 | 93.9 | 22 / 35 | 5845 |
| 5 | 1 | 70.9 | 91.8 | 20 / 35 | 6072 |
| 6 | 1 | 68.7 | 85.0 | 18 / 35 | 5340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 91 | 54% |
| bvh.fry.Freya 0.82 | 63 | 84% |
| winamp32.micro.MicroMacro 1.0 | 10 | 100% |
| gimp.GimpBot 0.1 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 4 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 3 | 67% |

Hadur died in 88 of 210 rounds, at a mean tick of 1177. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 50 | 57% | 102 |
| bvh.fry.Freya 0.82 | 24 | 27% | 63 |
| stelo.SoRobotNanoMelee 1.2 | 6 | 7% | 8 |
| gimp.GimpBot 0.1 | 3 | 3% | 10 |
| apollokidd.ApolloKidd 0.9 | 3 | 3% | 9 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 13 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 155805 melee ticks, 67414 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 32 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 45134 sent, 40760 reached their opponent, 7247 virtual hits (17.8% of those reached).

## Melee bench: F40

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488013. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 174 over 6 battles (29.0 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.2 | 143 / 210 | 1.70 | 20.9% | 34243 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 20.9% | 143 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.2% | 26 |
| kano.gamma.KanoGamma 1.8 | 2.8 | 13.0% | 15 |
| mz.AntiGrav 1.0 | 4.3 | 11.3% | 7 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.6% | 4 |
| alpha.BlackIce 1.0 | 6.2 | 8.6% | 1 |
| stelo.Randomness 1.0 | 6.7 | 8.9% | 13 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.0% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 3.9% | 0 |
| sample.Corners 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 94.0 | 24 / 35 | 5911 |
| 2 | 1 | 71.6 | 90.8 | 25 / 35 | 5770 |
| 3 | 1 | 71.1 | 89.8 | 22 / 35 | 5629 |
| 4 | 1 | 70.6 | 91.7 | 19 / 35 | 5515 |
| 5 | 1 | 71.6 | 92.7 | 27 / 35 | 5515 |
| 6 | 1 | 72.2 | 94.3 | 26 / 35 | 5903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kano.gamma.KanoGamma 1.8 | 52 | 85% |
| kawigi.mini.Coriantumr 1.1 | 51 | 76% |
| mz.AntiGrav 1.0 | 33 | 100% |
| stelo.Randomness 1.0 | 15 | 67% |
| Polkwane.SmashMelee 1.0 | 14 | 86% |
| alpha.BlackIce 1.0 | 6 | 83% |
| amk.superstrike.SuperStrike 0.3 | 1 | 0% |

Hadur died in 67 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 22 | 33% | 56 |
| Polkwane.SmashMelee 1.0 | 13 | 19% | 29 |
| kano.gamma.KanoGamma 1.8 | 10 | 15% | 60 |
| stelo.Randomness 1.0 | 10 | 15% | 28 |
| mz.AntiGrav 1.0 | 5 | 7% | 18 |
| alpha.BlackIce 1.0 | 5 | 7% | 12 |
| amk.superstrike.SuperStrike 0.3 | 2 | 3% | 4 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 146697 melee ticks, 43002 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 81 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 47314 sent, 42299 reached their opponent, 8543 virtual hits (20.2% of those reached).

## Melee bench: F41

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1493893. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 134 over 6 battles (22.3 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.3 | 118 / 210 | 1.96 | 18.9% | 28471 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 18.9% | 118 |
| eem.EvBotNG v12.8 | 2.0 | 15.5% | 64 |
| ary.Swarm 1.1 | 3.2 | 13.2% | 6 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.9% | 15 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.6% | 6 |
| shrub.Silver v048 | 6.2 | 8.7% | 1 |
| zyx.nano.Ant 1.1 | 6.8 | 8.0% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.1% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.1% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.1 | 20 / 35 | 5116 |
| 2 | 1 | 70.3 | 91.4 | 22 / 35 | 4829 |
| 3 | 1 | 68.6 | 87.0 | 20 / 35 | 4434 |
| 4 | 1 | 68.0 | 85.1 | 19 / 35 | 4582 |
| 5 | 1 | 68.2 | 86.7 | 17 / 35 | 4535 |
| 6 | 1 | 70.5 | 93.7 | 20 / 35 | 4975 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 78 | 45% |
| lessonz.robocode.Oz 0.5.0 | 41 | 88% |
| ary.Swarm 1.1 | 30 | 100% |
| simonton.nano.MeleeSeed 1.8 | 13 | 100% |
| stelo.Mirror 1.1 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| shrub.Silver v048 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 987. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 50 | 54% | 86 |
| lessonz.robocode.Oz 0.5.0 | 16 | 17% | 43 |
| ary.Swarm 1.1 | 9 | 10% | 33 |
| simonton.nano.MeleeSeed 1.8 | 9 | 10% | 27 |
| stelo.Mirror 1.1 | 4 | 4% | 7 |
| shrub.Silver v048 | 3 | 3% | 8 |
| zyx.nano.Ant 1.1 | 1 | 1% | 3 |
| jsal.Jsalbot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 199 rounds): 147615 melee ticks, 50065 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 47 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 47471 sent, 42572 reached their opponent, 6163 virtual hits (14.5% of those reached).

## Melee bench: F42

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1480621. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.7 | 150 / 210 | 1.57 | 21.2% | 37827 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 21.2% | 150 |
| wompi.Wallaby 5.1 | 2.0 | 15.0% | 34 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.6% | 10 |
| ara.Shera 0.88 | 3.7 | 12.6% | 17 |
| amz.NanoClone 1.41 | 5.0 | 8.9% | 0 |
| dsw.StaticD 1.0 | 6.3 | 6.9% | 0 |
| maribo.IotaCT 1.1 | 7.3 | 6.3% | 0 |
| stelo.MirrorMicro 1.0 | 7.5 | 6.1% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 93.7 | 25 / 35 | 6161 |
| 2 | 1 | 71.8 | 93.7 | 23 / 35 | 6361 |
| 3 | 1 | 71.4 | 92.4 | 23 / 35 | 6194 |
| 4 | 1 | 71.9 | 94.0 | 25 / 35 | 6251 |
| 5 | 1 | 72.5 | 93.0 | 27 / 35 | 6617 |
| 6 | 1 | 72.1 | 95.6 | 27 / 35 | 6243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 87 | 83% |
| maribo.mini.MiniQuester 0.1 | 53 | 89% |
| ara.Shera 0.88 | 29 | 72% |
| amz.NanoClone 1.41 | 5 | 100% |
| dsw.StaticD 1.0 | 4 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 26 | 41% | 101 |
| ara.Shera 0.88 | 19 | 30% | 36 |
| maribo.mini.MiniQuester 0.1 | 11 | 17% | 49 |
| amz.NanoClone 1.41 | 6 | 10% | 9 |
| dsw.StaticD 1.0 | 0 | 0% | 12 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 2 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 160183 melee ticks, 51215 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 39 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 49074 sent, 44147 reached their opponent, 8026 virtual hits (18.2% of those reached).

## Melee bench: F43

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1516615. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 128 over 6 battles (21.3 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.7 | 41 / 210 | 2.73 | 16.4% | 26802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.0% | 133 |
| hadur117.Hadur 3.21md | 2.0 | 16.4% | 41 |
| brainfade.melee.Dusk 0.44 | 3.7 | 12.3% | 21 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.3% | 10 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 11.1% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 9.5% | 0 |
| jab.DiamondStealer 5 | 7.5 | 7.2% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 78.7 | 7 / 35 | 4472 |
| 2 | 2 | 66.1 | 77.8 | 3 / 35 | 4481 |
| 3 | 2 | 67.2 | 83.5 | 10 / 35 | 3944 |
| 4 | 2 | 66.4 | 79.0 | 6 / 35 | 4636 |
| 5 | 2 | 65.6 | 79.7 | 4 / 35 | 4053 |
| 6 | 2 | 69.1 | 85.7 | 11 / 35 | 5216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 84 | 23% |
| brainfade.melee.Dusk 0.44 | 18 | 33% |
| dummy.micro.Sparrow 2.5 | 15 | 80% |
| Krabb.akim2.Akim2 1.1b | 3 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 96 | 57% | 111 |
| brainfade.melee.Dusk 0.44 | 28 | 17% | 37 |
| dummy.micro.Sparrow 2.5 | 20 | 12% | 28 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 8% | 18 |
| mz.NanoGod 2.02 | 8 | 5% | 8 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 8 |

Posture (Hadur's M records, 203 rounds): 150148 melee ticks, 46766 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 33 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 46870 sent, 41727 reached their opponent, 6604 virtual hits (15.8% of those reached).

## Melee bench: F44

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1505848. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 155 over 6 battles (25.8 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 91.6 | 137 / 210 | 1.76 | 21.0% | 37034 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 21.0% | 137 |
| stelo.Liblix 0.3.1 | 2.2 | 16.0% | 48 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.4% | 19 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.2 | 9.6% | 1 |
| jwirde.Gort 2.0 | 5.0 | 9.0% | 2 |
| disan.Chair 2.2.0 | 6.7 | 7.6% | 0 |
| stf.PanzerGeneral 0.1 | 7.0 | 6.9% | 1 |
| wompi.Quokka 1.6 | 7.2 | 7.0% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.3% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 89.2 | 24 / 35 | 5936 |
| 2 | 1 | 71.1 | 90.2 | 23 / 35 | 6033 |
| 3 | 1 | 71.6 | 92.1 | 22 / 35 | 5993 |
| 4 | 1 | 71.7 | 91.1 | 21 / 35 | 6384 |
| 5 | 1 | 72.3 | 94.3 | 23 / 35 | 6293 |
| 6 | 1 | 72.2 | 92.7 | 24 / 35 | 6395 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 85 | 71% |
| tzu.TheArtOfWar 1.2 | 65 | 88% |
| jwirde.Gort 2.0 | 8 | 88% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 100% |
| disan.Chair 2.2.0 | 5 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| wompi.Quokka 1.6 | 1 | 0% |
| stf.PanzerGeneral 0.1 | 1 | 0% |

Hadur died in 73 of 210 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 37 | 51% | 100 |
| tzu.TheArtOfWar 1.2 | 19 | 26% | 60 |
| jwirde.Gort 2.0 | 5 | 7% | 22 |
| wompi.Quokka 1.6 | 4 | 5% | 6 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 4% | 10 |
| stf.PanzerGeneral 0.1 | 2 | 3% | 4 |
| amk.jointstrike.JointStrike 0.2 | 2 | 3% | 3 |
| disan.Chair 2.2.0 | 1 | 1% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 150786 melee ticks, 48081 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 65 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 50656 sent, 45712 reached their opponent, 9139 virtual hits (20.0% of those reached).

## Melee bench: F45

hadur117.Hadur 3.21md against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1492252. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 157 over 6 battles (26.2 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.9 | 121 / 210 | 1.91 | 20.5% | 35290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 20.5% | 121 |
| jje.BagPuss 1.2 | 2.3 | 13.2% | 12 |
| eem.IWillFireNoBullet v2.8 | 3.3 | 11.2% | 62 |
| sul.Lunar 1.1 | 4.2 | 10.7% | 10 |
| myl.nano.Graviton 1.10 | 4.5 | 10.3% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 6.2 | 8.2% | 0 |
| fm.claire 1.7 | 6.7 | 8.5% | 1 |
| hvilela.HVilela 0.9 | 7.8 | 7.6% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.6% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.8 | 19 / 35 | 6003 |
| 2 | 1 | 70.7 | 91.7 | 21 / 35 | 5664 |
| 3 | 1 | 70.7 | 90.8 | 21 / 35 | 5999 |
| 4 | 1 | 71.7 | 93.3 | 25 / 35 | 5951 |
| 5 | 1 | 70.1 | 87.9 | 17 / 35 | 5885 |
| 6 | 1 | 69.2 | 84.8 | 18 / 35 | 5788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 67 | 40% |
| jje.BagPuss 1.2 | 46 | 83% |
| sul.Lunar 1.1 | 21 | 81% |
| myl.nano.Graviton 1.10 | 18 | 89% |
| pez.mini.ChironexFleckeri 0.5 | 12 | 100% |
| wit.Deep7 2.0 | 8 | 100% |
| fm.claire 1.7 | 2 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 1541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 44 | 49% | 0 |
| jje.BagPuss 1.2 | 21 | 24% | 71 |
| sul.Lunar 1.1 | 10 | 11% | 50 |
| myl.nano.Graviton 1.10 | 6 | 7% | 43 |
| fm.claire 1.7 | 3 | 3% | 9 |
| hvilela.HVilela 0.9 | 2 | 2% | 11 |
| wit.Deep7 2.0 | 2 | 2% | 10 |
| pez.mini.ChironexFleckeri 0.5 | 1 | 1% | 12 |
| abud.ThirdRobo 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 199 rounds): 184108 melee ticks, 88894 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 77 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 77 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 56476 sent, 51604 reached their opponent, 7020 virtual hits (13.6% of those reached).

## Melee bench: F46

hadur117.Hadur 3.21md against 8 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1507907. Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 119 over 6 battles (19.8 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.1 | 130 / 210 | 1.71 | 21.9% | 31334 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.21md | 1.0 | 21.9% | 130 |
| kc.mini.Mirage 0.2 | 2.0 | 18.9% | 62 |
| cx.Princess 1.0 | 3.3 | 11.9% | 15 |
| mz.MicroSheep 1.0 | 3.8 | 11.8% | 0 |
| sadoner.killer 0.2 | 5.0 | 10.3% | 1 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.7% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.0 | 7.3% | 0 |
| kurios.DOSexe .9a | 7.8 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.7 | 24 / 35 | 5103 |
| 2 | 1 | 70.7 | 90.7 | 21 / 35 | 5551 |
| 3 | 1 | 70.1 | 88.6 | 21 / 35 | 5263 |
| 4 | 1 | 70.3 | 92.9 | 22 / 35 | 4921 |
| 5 | 1 | 69.3 | 88.2 | 18 / 35 | 5051 |
| 6 | 1 | 71.7 | 95.7 | 24 / 35 | 5445 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 131 | 73% |
| cx.Princess 1.0 | 23 | 61% |
| mz.MicroSheep 1.0 | 11 | 100% |
| arthord.NanoSatanMelee Beta | 7 | 86% |
| sadoner.killer 0.2 | 2 | 50% |
| jeremyreeder.collective.Prophet 5 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 50 | 63% | 145 |
| cx.Princess 1.0 | 12 | 15% | 27 |
| sadoner.killer 0.2 | 5 | 6% | 8 |
| jeremyreeder.collective.Prophet 5 | 5 | 6% | 7 |
| mz.MicroSheep 1.0 | 4 | 5% | 13 |
| arthord.NanoSatanMelee Beta | 4 | 5% | 7 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
| kurios.DOSexe .9a | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 136520 melee ticks, 58131 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 44 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 44 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 37821 sent, 33468 reached their opponent, 5283 virtual hits (15.8% of those reached).

