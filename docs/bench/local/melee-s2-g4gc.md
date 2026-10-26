# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 424 over 6 battles (70.7 per battle, most in one battle 159). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 83.9 | 37 / 210 | 2.45 | 16.2% | 27152 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.0% | 147 |
| hadur2.Hadur 3.17.1g4gc | 2.0 | 16.2% | 37 |
| sgp.JollyNinja 3.53 | 3.2 | 11.5% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 11.2% | 1 |
| mz.MicroGodMelee 1 | 5.3 | 10.3% | 4 |
| lorneswork.Predator 1.0 | 5.5 | 10.0% | 5 |
| adt.Ar2 1.0 | 7.0 | 7.8% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 6.1% | 0 |
| skm.butterfly 1.0 | 9.0 | 3.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 85.4 | 6 / 35 | 4335 |
| 2 | 2 | 66.3 | 85.4 | 7 / 35 | 4604 |
| 3 | 2 | 65.1 | 84.4 | 5 / 35 | 4252 |
| 4 | 2 | 63.4 | 77.1 | 3 / 35 | 4407 |
| 5 | 2 | 66.2 | 84.4 | 9 / 35 | 4710 |
| 6 | 2 | 67.1 | 86.7 | 7 / 35 | 4844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 119 | 7% |
| sgp.JollyNinja 3.53 | 14 | 36% |
| mz.MicroGodMelee 1 | 9 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 89% |
| lorneswork.Predator 1.0 | 7 | 86% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 1125. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 123 | 70% | 132 |
| sgp.JollyNinja 3.53 | 23 | 13% | 27 |
| lorneswork.Predator 1.0 | 11 | 6% | 16 |
| mz.MicroGodMelee 1 | 6 | 3% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 3% | 11 |
| adt.Ar2 1.0 | 4 | 2% | 8 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 142378 melee ticks, 79487 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 63 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 2.

Targeting waves (204 rounds): 47161 sent, 42696 reached their opponent, 9615 virtual hits (22.5% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 766 over 6 battles (127.7 per battle, most in one battle 210). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 86.1 | 92 / 210 | 2.25 | 17.9% | 26813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 17.9% | 92 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.2% | 27 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.3% | 46 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.0% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.3% | 10 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 8.5% | 1 |
| Noran.BitchingElk 0.054 | 6.8 | 8.1% | 14 |
| sch.Simone 0.3d | 7.5 | 7.7% | 15 |
| stelo.PatternRobot 1.0 | 9.0 | 5.9% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 83.2 | 10 / 35 | 4453 |
| 2 | 1 | 65.1 | 83.8 | 9 / 35 | 4076 |
| 3 | 1 | 68.2 | 87.6 | 19 / 35 | 4719 |
| 4 | 1 | 67.9 | 88.9 | 18 / 35 | 4321 |
| 5 | 1 | 67.5 | 86.0 | 16 / 35 | 4636 |
| 6 | 1 | 68.1 | 87.3 | 20 / 35 | 4608 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 43 | 63% |
| pulsar.PulsarMax 0.8.9 | 39 | 38% |
| com.cohesiva.robocode.ManOwaR 1.0 | 22 | 73% |
| Noran.BitchingElk 0.054 | 14 | 57% |
| sch.Simone 0.3d | 13 | 54% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 88% |
| stelo.PatternRobot 1.0 | 8 | 88% |
| fnc.bandit.Bandit 5.2.0 | 4 | 75% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 1002. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 41 | 34% | 57 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 28 | 23% | 58 |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 11% | 32 |
| Noran.BitchingElk 0.054 | 11 | 9% | 19 |
| sch.Simone 0.3d | 10 | 8% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 7% | 10 |
| stelo.PatternRobot 1.0 | 5 | 4% | 7 |
| fnc.bandit.Bandit 5.2.0 | 1 | 1% | 4 |
| fullsail.SweetTea 1.1 | 1 | 1% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 172635 melee ticks, 43709 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 39 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 8.

Targeting waves (205 rounds): 61922 sent, 57372 reached their opponent, 10705 virtual hits (18.7% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 269 over 6 battles (44.8 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.5 | 140 / 210 | 2.03 | 19.0% | 33254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 19.0% | 140 |
| radnor.DoctorBob 1.42 | 2.3 | 14.5% | 32 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.7% | 12 |
| vuen.Cake 2.51 | 3.8 | 12.1% | 20 |
| urdos.URDOS 1.3 | 5.3 | 9.1% | 3 |
| adt.Ar1 2.1 | 6.2 | 7.5% | 1 |
| oa.weak.FlyMk1 0.1 | 7.0 | 6.7% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.8 | 6.6% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.8 | 28 / 35 | 5803 |
| 2 | 1 | 67.9 | 87.6 | 20 / 35 | 5408 |
| 3 | 1 | 69.1 | 89.5 | 24 / 35 | 5419 |
| 4 | 1 | 69.5 | 91.1 | 25 / 35 | 5704 |
| 5 | 1 | 69.7 | 92.1 | 24 / 35 | 5525 |
| 6 | 1 | 66.5 | 80.0 | 19 / 35 | 5395 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 55 | 98% |
| vuen.Cake 2.51 | 54 | 81% |
| kawigi.nano.Lib 1.0 | 37 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 50% |
| adt.Ar1 2.1 | 1 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 31% | 68 |
| vuen.Cake 2.51 | 15 | 21% | 57 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 14% | 10 |
| kawigi.nano.Lib 1.0 | 9 | 13% | 50 |
| urdos.URDOS 1.3 | 7 | 10% | 9 |
| oa.weak.FlyMk1 0.1 | 5 | 7% | 10 |
| adt.Ar1 2.1 | 1 | 1% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 1% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 131447 melee ticks, 35395 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 64 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 2.

Targeting waves (202 rounds): 40979 sent, 36769 reached their opponent, 10621 virtual hits (28.9% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 649 over 6 battles (108.2 per battle, most in one battle 151). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.6 | 26 / 210 | 2.39 | 16.6% | 29518 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.7% | 166 |
| hadur2.Hadur 3.17.1g4gc | 2.0 | 16.6% | 26 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.5% | 10 |
| TNT.TNT 0.99.1 | 4.0 | 11.0% | 4 |
| josago.Jorgito 0.16 | 5.0 | 9.8% | 2 |
| css.Delitioner 0.11 | 6.0 | 7.6% | 0 |
| tj.zombie1n 1.0.1 | 7.3 | 6.0% | 1 |
| rampancy.Durandal 2.1d | 7.8 | 5.3% | 0 |
| spin.Bugstard 0.012b | 9.2 | 3.8% | 1 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 85.1 | 3 / 35 | 4632 |
| 2 | 2 | 65.7 | 81.6 | 3 / 35 | 4690 |
| 3 | 2 | 66.5 | 84.1 | 3 / 35 | 4740 |
| 4 | 2 | 68.3 | 86.0 | 7 / 35 | 5430 |
| 5 | 2 | 66.6 | 84.8 | 4 / 35 | 4725 |
| 6 | 2 | 67.9 | 85.7 | 6 / 35 | 5301 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 121 | 6% |
| apc.LeeroyJenkins2 1.0 | 13 | 54% |
| TNT.TNT 0.99.1 | 8 | 63% |
| josago.Jorgito 0.16 | 6 | 83% |
| spin.Bugstard 0.012b | 2 | 50% |
| rampancy.Durandal 2.1d | 1 | 100% |
| tj.zombie1n 1.0.1 | 1 | 0% |

Hadur died in 188 of 210 rounds, at a mean tick of 1299. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 132 | 70% | 140 |
| apc.LeeroyJenkins2 1.0 | 26 | 14% | 35 |
| TNT.TNT 0.99.1 | 11 | 6% | 15 |
| josago.Jorgito 0.16 | 10 | 5% | 15 |
| tj.zombie1n 1.0.1 | 3 | 2% | 3 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
| spin.Bugstard 0.012b | 1 | 1% | 0 |
| css.Delitioner 0.11 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 203247 melee ticks, 64779 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 59 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 4.

Targeting waves (205 rounds): 62662 sent, 58098 reached their opponent, 9546 virtual hits (16.4% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 674 over 6 battles (112.3 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 76.2 | 19 / 210 | 3.14 | 14.1% | 19858 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.7% | 119 |
| justin.DemonicRage 3.4 | 1.8 | 16.6% | 47 |
| hadur2.Hadur 3.17.1g4gc | 3.0 | 14.1% | 19 |
| wompi.Numbat 2.1 | 4.0 | 12.9% | 17 |
| ms.Ares 0.19 | 5.3 | 9.1% | 2 |
| axeBots.HataMoto 3.09 | 5.7 | 9.1% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 5.5% | 0 |
| supersample.SuperBoxBot 1.0 | 7.8 | 5.6% | 0 |
| GarmBox.Oranges 1.0 | 9.2 | 4.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.4 | 74.9 | 3 / 35 | 3084 |
| 2 | 3 | 61.6 | 74.0 | 2 / 35 | 3319 |
| 3 | 3 | 62.4 | 76.8 | 3 / 35 | 3465 |
| 4 | 3 | 64.1 | 81.0 | 7 / 35 | 3340 |
| 5 | 3 | 60.7 | 72.7 | 0 / 35 | 3038 |
| 6 | 3 | 63.1 | 77.8 | 4 / 35 | 3612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 39 | 8% |
| justin.DemonicRage 3.4 | 24 | 25% |
| wompi.Numbat 2.1 | 15 | 53% |
| ms.Ares 0.19 | 3 | 67% |
| axeBots.HataMoto 3.09 | 3 | 0% |

Hadur died in 196 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 78 | 40% | 83 |
| justin.DemonicRage 3.4 | 62 | 32% | 66 |
| wompi.Numbat 2.1 | 27 | 14% | 34 |
| axeBots.HataMoto 3.09 | 12 | 6% | 13 |
| ms.Ares 0.19 | 8 | 4% | 10 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 210 rounds): 162141 melee ticks, 30121 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (210 rounds): longest scan gap while four or more were alive 73 ticks (210 rounds over 8); rounds whose longest gap at any count was over 8: 210; robots dropped as dead without a death event: 2.

Targeting waves (210 rounds): 50645 sent, 45918 reached their opponent, 8148 virtual hits (17.7% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 330 over 6 battles (55.0 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.3 | 130 / 210 | 1.97 | 19.1% | 29099 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 19.1% | 130 |
| jekl.StoneGhost 0.7 | 2.2 | 14.4% | 21 |
| origin.SleepSiphon 1.7b | 3.2 | 13.7% | 37 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.2% | 13 |
| mld.Wisdom 1.0 | 5.0 | 10.4% | 1 |
| gg.Wolverine 2.0 | 6.0 | 8.6% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 6.6% | 7 |
| DBall.NUKE 0.1 | 8.2 | 6.4% | 0 |
| spinnercat.Omen 1.0 | 8.5 | 6.0% | 0 |
| sample.Fire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.4 | 16 / 35 | 4537 |
| 2 | 1 | 70.8 | 94.3 | 27 / 35 | 5007 |
| 3 | 1 | 66.8 | 82.5 | 17 / 35 | 4355 |
| 4 | 1 | 70.0 | 91.7 | 24 / 35 | 4940 |
| 5 | 1 | 70.6 | 91.7 | 25 / 35 | 5370 |
| 6 | 1 | 69.4 | 89.8 | 21 / 35 | 4890 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 52 | 92% |
| origin.SleepSiphon 1.7b | 35 | 69% |
| pe.minimelee.SandboxMiniMelee 1.1 | 32 | 91% |
| gg.Wolverine 2.0 | 13 | 85% |
| mld.Wisdom 1.0 | 12 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 60% |
| DBall.NUKE 0.1 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 29 | 36% | 63 |
| jekl.StoneGhost 0.7 | 24 | 30% | 66 |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 22% | 36 |
| gg.Wolverine 2.0 | 4 | 5% | 12 |
| mld.Wisdom 1.0 | 3 | 4% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 9 |
| DBall.NUKE 0.1 | 0 | 0% | 5 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |
| sample.Fire 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 156630 melee ticks, 36982 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 33 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 2.

Targeting waves (207 rounds): 48781 sent, 44322 reached their opponent, 10805 virtual hits (24.4% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 350 over 6 battles (58.3 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.9 | 110 / 210 | 1.73 | 19.7% | 34234 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 19.7% | 110 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.6% | 50 |
| rtk.Tachikoma 1.0 | 2.8 | 16.5% | 35 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.9% | 7 |
| franzor.Lizt 1.3.1 | 4.5 | 11.1% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.0% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.2 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 88.9 | 15 / 35 | 5775 |
| 2 | 1 | 72.5 | 95.9 | 22 / 35 | 5898 |
| 3 | 1 | 70.3 | 88.6 | 17 / 35 | 5629 |
| 4 | 1 | 71.3 | 93.3 | 17 / 35 | 5631 |
| 5 | 1 | 70.6 | 90.5 | 18 / 35 | 5737 |
| 6 | 1 | 71.4 | 94.0 | 21 / 35 | 5564 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 90 | 69% |
| rsalesc.melee.Monk 0.3.6c | 50 | 18% |
| franzor.Lizt 1.3.1 | 27 | 85% |
| oog.melee.CapuletDroid 1.1 | 20 | 80% |

Hadur died in 103 of 210 rounds, at a mean tick of 1375. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 45 | 44% | 67 |
| rtk.Tachikoma 1.0 | 39 | 38% | 108 |
| oog.melee.CapuletDroid 1.1 | 7 | 7% | 26 |
| franzor.Lizt 1.3.1 | 6 | 6% | 3 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 4 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 189309 melee ticks, 93357 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 26 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 3.

Targeting waves (205 rounds): 57970 sent, 53492 reached their opponent, 11940 virtual hits (22.3% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 824 over 6 battles (137.3 per battle, most in one battle 181). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 91.3 | 131 / 210 | 1.79 | 19.2% | 27831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 19.2% | 131 |
| tm.Yuugao 1.0 | 2.5 | 13.1% | 33 |
| shrub.Vapour v159 | 3.2 | 12.2% | 19 |
| Krabb.sliNk.Garm 0.9u | 3.5 | 11.7% | 15 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.9% | 7 |
| m3thos.Eva00 1.1 | 6.0 | 8.9% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.0% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.3% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.6% | 0 |
| SHAM.WOW 1.4 | 9.7 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 86.7 | 20 / 35 | 4705 |
| 2 | 1 | 69.4 | 92.7 | 23 / 35 | 4842 |
| 3 | 1 | 69.0 | 92.1 | 22 / 35 | 4513 |
| 4 | 1 | 70.0 | 94.6 | 25 / 35 | 4638 |
| 5 | 1 | 68.4 | 90.5 | 20 / 35 | 4588 |
| 6 | 1 | 68.8 | 91.1 | 21 / 35 | 4545 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 46 | 74% |
| shrub.Vapour v159 | 38 | 76% |
| Krabb.sliNk.Garm 0.9u | 30 | 70% |
| com.spp.robocode.MostlyHarmless 010 | 21 | 95% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 83% |
| m3thos.Eva00 1.1 | 10 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 80% |
| SHAM.WOW 1.4 | 2 | 50% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 27 | 32% | 65 |
| shrub.Vapour v159 | 19 | 23% | 43 |
| Krabb.sliNk.Garm 0.9u | 14 | 17% | 35 |
| com.spp.robocode.MostlyHarmless 010 | 13 | 15% | 32 |
| jwst.DAD.DarkAndDarker 1.1 | 2 | 2% | 14 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 4 |
| m3thos.Eva00 1.1 | 1 | 1% | 12 |
| SHAM.WOW 1.4 | 1 | 1% | 5 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 159015 melee ticks, 41858 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 497 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 296 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 5.

Targeting waves (205 rounds): 51442 sent, 46784 reached their opponent, 9811 virtual hits (21.0% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 511 over 6 battles (85.2 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 76.1 | 52 / 210 | 3.15 | 14.9% | 20003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.0% | 95 |
| hadur2.Hadur 3.17.1g4gc | 2.5 | 14.9% | 52 |
| kc.micro.Figment 1.0 | 2.5 | 14.2% | 25 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.8% | 16 |
| yagami.Tidus 0.11 | 5.0 | 10.5% | 3 |
| mc2.enemy.Original 0.9 | 5.3 | 9.3% | 15 |
| dft.Calliope 5.6 | 7.0 | 8.0% | 4 |
| step.nanoPri 1.0 | 8.0 | 6.0% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 77.8 | 10 / 35 | 3534 |
| 2 | 3 | 61.4 | 74.0 | 6 / 35 | 3045 |
| 3 | 3 | 61.6 | 74.6 | 5 / 35 | 3047 |
| 4 | 3 | 62.3 | 75.9 | 7 / 35 | 3352 |
| 5 | 2 | 63.3 | 76.2 | 11 / 35 | 3597 |
| 6 | 2 | 64.5 | 78.4 | 13 / 35 | 3428 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 42 | 26% |
| kc.micro.Figment 1.0 | 30 | 83% |
| pedersen.Grishnakh 1.0 | 10 | 50% |
| yagami.Tidus 0.11 | 7 | 71% |
| dft.Calliope 5.6 | 6 | 67% |
| mc2.enemy.Original 0.9 | 6 | 33% |

Hadur died in 161 of 210 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 58 | 36% | 71 |
| kc.micro.Figment 1.0 | 28 | 17% | 54 |
| mc2.enemy.Original 0.9 | 21 | 13% | 23 |
| yagami.Tidus 0.11 | 18 | 11% | 21 |
| pedersen.Grishnakh 1.0 | 18 | 11% | 19 |
| dft.Calliope 5.6 | 7 | 4% | 13 |
| robar.nano.Assertive_Melee 0.2 | 4 | 2% | 4 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
| step.nanoPri 1.0 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 154814 melee ticks, 31520 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 113 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 113 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 49685 sent, 45324 reached their opponent, 7292 virtual hits (16.1% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 592 over 6 battles (98.7 per battle, most in one battle 172). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 92.9 | 148 / 210 | 1.64 | 19.4% | 29752 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 19.4% | 148 |
| DTF.Kludgy 1.2b | 2.2 | 14.1% | 25 |
| ne.Chimera 1.2 | 2.8 | 13.6% | 12 |
| ejb.Polaris 1.0.1 | 4.0 | 12.5% | 16 |
| vStar.RAFzilla 2.15 | 5.2 | 10.3% | 7 |
| tvv.micro.Antares 1.1.1 | 5.8 | 10.1% | 1 |
| kurios.DOSexe .9b | 7.7 | 5.4% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.7 | 5.5% | 0 |
| sam.Samspin 1.0 | 9.0 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 93.0 | 23 / 35 | 5038 |
| 2 | 1 | 69.8 | 92.4 | 22 / 35 | 5279 |
| 3 | 1 | 69.1 | 90.2 | 23 / 35 | 5035 |
| 4 | 1 | 69.8 | 95.9 | 28 / 35 | 4610 |
| 5 | 1 | 69.1 | 92.7 | 27 / 35 | 4619 |
| 6 | 1 | 70.0 | 93.0 | 25 / 35 | 5171 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 55 | 76% |
| ejb.Polaris 1.0.1 | 39 | 72% |
| ne.Chimera 1.2 | 36 | 86% |
| vStar.RAFzilla 2.15 | 21 | 90% |
| tvv.micro.Antares 1.1.1 | 18 | 100% |
| kurios.DOSexe .9b | 5 | 80% |
| donjezza.Muncho 1.0 | 3 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 23 | 36% | 65 |
| ejb.Polaris 1.0.1 | 18 | 28% | 47 |
| ne.Chimera 1.2 | 13 | 20% | 37 |
| vStar.RAFzilla 2.15 | 4 | 6% | 26 |
| kurios.DOSexe .9b | 1 | 2% | 12 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 4 |
| sam.Samspin 1.0 | 1 | 2% | 3 |
| donjezza.Muncho 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 149948 melee ticks, 55039 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 55 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 4.

Targeting waves (204 rounds): 49705 sent, 45298 reached their opponent, 9527 virtual hits (21.0% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 672 over 6 battles (112.0 per battle, most in one battle 160). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 79.7 | 67 / 210 | 2.82 | 15.7% | 21245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 16.7% | 80 |
| hadur2.Hadur 3.17.1g4gc | 1.7 | 15.7% | 67 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.8% | 27 |
| djc.DynaBot 0.1.1 | 4.3 | 10.8% | 14 |
| br2.MobyDickBot 1.6 | 5.5 | 9.2% | 7 |
| rdt199.Warlord 0.73 | 6.2 | 8.7% | 8 |
| uji.YellohFellah 1.0 | 6.7 | 8.1% | 7 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.4% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.9% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 81.9 | 14 / 35 | 3726 |
| 2 | 2 | 63.5 | 78.4 | 11 / 35 | 3535 |
| 3 | 2 | 63.4 | 78.1 | 10 / 35 | 3577 |
| 4 | 2 | 63.8 | 78.4 | 12 / 35 | 3742 |
| 5 | 1 | 63.8 | 80.6 | 13 / 35 | 3255 |
| 6 | 2 | 63.2 | 81.0 | 7 / 35 | 3410 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 48 | 31% |
| djc.DynaBot 0.1.1 | 18 | 67% |
| cx.mini.Nimrod 0.55 | 14 | 64% |
| rdt199.Warlord 0.73 | 14 | 79% |
| uji.YellohFellah 1.0 | 14 | 79% |
| br2.MobyDickBot 1.6 | 9 | 67% |
| stelo.MirrorNano 1.3 | 2 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 66 | 45% | 85 |
| cx.mini.Nimrod 0.55 | 29 | 20% | 40 |
| djc.DynaBot 0.1.1 | 17 | 12% | 30 |
| br2.MobyDickBot 1.6 | 9 | 6% | 14 |
| rdt199.Warlord 0.73 | 7 | 5% | 15 |
| uji.YellohFellah 1.0 | 6 | 4% | 12 |
| KiraNL.Chupacabra 0.4 | 5 | 3% | 8 |
| stelo.MirrorNano 1.3 | 3 | 2% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 161069 melee ticks, 36770 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 562 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 325 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 52787 sent, 48137 reached their opponent, 7206 virtual hits (15.0% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 861 over 6 battles (143.5 per battle, most in one battle 154). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 85.9 | 104 / 210 | 2.27 | 17.2% | 20848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 17.2% | 104 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.7% | 38 |
| nat.PallasHawk 1.0 | 3.3 | 12.9% | 37 |
| darkcanuck.Leon 1.01 | 3.5 | 12.8% | 22 |
| brainfade.melee.Genghis 0.36 | 5.0 | 9.5% | 7 |
| jrm.Test0 1.0 | 6.3 | 7.8% | 1 |
| cs.sheldor.Talon 1.1 | 7.3 | 6.9% | 0 |
| jp.Perpy 16.0 | 7.3 | 7.0% | 1 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.5% | 0 |
| stuff.Vlad 0.1 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 83.5 | 12 / 35 | 3432 |
| 2 | 1 | 66.3 | 87.6 | 19 / 35 | 3196 |
| 3 | 1 | 69.2 | 93.3 | 23 / 35 | 3958 |
| 4 | 1 | 66.5 | 86.3 | 20 / 35 | 3420 |
| 5 | 1 | 64.5 | 80.3 | 14 / 35 | 3513 |
| 6 | 1 | 65.5 | 84.4 | 16 / 35 | 3329 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 53 | 64% |
| darkcanuck.Leon 1.01 | 43 | 74% |
| nat.PallasHawk 1.0 | 38 | 58% |
| brainfade.melee.Genghis 0.36 | 5 | 60% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| jrm.Test0 1.0 | 4 | 100% |
| jaybot.bots.Oddball 4.0 | 3 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 34 | 30% | 55 |
| nat.PallasHawk 1.0 | 33 | 29% | 55 |
| darkcanuck.Leon 1.01 | 22 | 19% | 61 |
| brainfade.melee.Genghis 0.36 | 9 | 8% | 12 |
| jrm.Test0 1.0 | 7 | 6% | 13 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 6 |
| jp.Perpy 16.0 | 1 | 1% | 1 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 4 |
| stuff.Vlad 0.1 | 0 | 0% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 135600 melee ticks, 34722 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 50 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 3.

Targeting waves (205 rounds): 46639 sent, 42000 reached their opponent, 7670 virtual hits (18.3% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 275 over 6 battles (45.8 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 80.5 | 49 / 210 | 2.76 | 15.1% | 21491 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 17.0% | 88 |
| ags.Glacier 0.2.11 | 1.7 | 16.6% | 43 |
| hadur2.Hadur 3.17.1g4gc | 2.8 | 15.1% | 49 |
| shinh.Entangled 0.3 | 4.0 | 12.7% | 21 |
| gh.micro.Gruweltje 0.7 | 5.0 | 11.6% | 9 |
| apc.Colossus2 0.17 | 6.2 | 7.7% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.7% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.7% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.3 | 74.9 | 9 / 35 | 3504 |
| 2 | 3 | 63.6 | 78.7 | 8 / 35 | 3698 |
| 3 | 3 | 63.9 | 81.3 | 7 / 35 | 3612 |
| 4 | 3 | 64.2 | 81.3 | 7 / 35 | 3661 |
| 5 | 2 | 65.6 | 85.7 | 10 / 35 | 3761 |
| 6 | 3 | 64.0 | 81.0 | 8 / 35 | 3255 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 42 | 12% |
| ags.Glacier 0.2.11 | 38 | 61% |
| shinh.Entangled 0.3 | 25 | 64% |
| gh.micro.Gruweltje 0.7 | 7 | 43% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 62 | 38% | 67 |
| ags.Glacier 0.2.11 | 49 | 30% | 74 |
| shinh.Entangled 0.3 | 28 | 17% | 39 |
| gh.micro.Gruweltje 0.7 | 11 | 7% | 16 |
| stelo.Wang 1.0 | 6 | 4% | 8 |
| maribo.FollowFire 1 | 4 | 2% | 5 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 152129 melee ticks, 37377 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 53 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 53 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 4.

Targeting waves (205 rounds): 44931 sent, 40322 reached their opponent, 7276 virtual hits (18.0% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 263 over 6 battles (43.8 per battle, most in one battle 59). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.9 | 149 / 210 | 1.73 | 19.5% | 30285 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 19.5% | 149 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.6% | 24 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.4% | 24 |
| sanyi.mikrobi.Roberto 1.0 | 4.8 | 9.8% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 9.2% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.7 | 9.3% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 8.7% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.9% | 8 |
| pa.Improved 1.0 | 9.0 | 5.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 90.8 | 25 / 35 | 5133 |
| 2 | 1 | 70.7 | 94.3 | 28 / 35 | 5139 |
| 3 | 1 | 67.8 | 87.9 | 21 / 35 | 4657 |
| 4 | 1 | 69.5 | 90.8 | 24 / 35 | 4929 |
| 5 | 1 | 70.1 | 93.7 | 25 / 35 | 4969 |
| 6 | 1 | 71.0 | 93.7 | 26 / 35 | 5458 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 78 | 91% |
| catcat20.shape.Theta 0.018 | 53 | 72% |
| sanyi.mikrobi.Roberto 1.0 | 20 | 95% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 58% |
| co.edu.usb.rc.LidisTron 1.0 | 7 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 23 | 38% | 58 |
| simonton.micro.Sprout 1.1.3 | 17 | 28% | 91 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 10% | 24 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 10% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 5 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 3% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 3% | 8 |
| pa.Improved 1.0 | 2 | 3% | 3 |

Posture (Hadur's M records, 201 rounds): 141964 melee ticks, 48971 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 52 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 52 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 4.

Targeting waves (201 rounds): 46327 sent, 42094 reached their opponent, 11493 virtual hits (27.3% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 438 over 6 battles (73.0 per battle, most in one battle 179). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.0 | 115 / 210 | 2.17 | 18.3% | 27515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 18.3% | 115 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.7% | 20 |
| emp.Yngwie 1.11 | 3.2 | 13.3% | 48 |
| mld.DustBunny 3.8 | 3.5 | 12.6% | 10 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.3% | 7 |
| kawigi.robot.Girl 1.2 | 6.0 | 8.8% | 8 |
| lambdaxy.TBot 0.1 | 7.5 | 6.6% | 0 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.9% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 5.2% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 85.4 | 16 / 35 | 4581 |
| 2 | 1 | 68.2 | 87.6 | 20 / 35 | 4484 |
| 3 | 1 | 69.2 | 87.9 | 22 / 35 | 4853 |
| 4 | 1 | 67.9 | 87.3 | 20 / 35 | 4545 |
| 5 | 1 | 69.4 | 92.4 | 22 / 35 | 4810 |
| 6 | 1 | 66.0 | 81.6 | 15 / 35 | 4242 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 64 | 64% |
| kawigi.micro.Shiz 1.1 | 30 | 90% |
| mld.DustBunny 3.8 | 20 | 90% |
| cb.nano.Insomnia 1.0 | 16 | 81% |
| kawigi.robot.Girl 1.2 | 13 | 69% |
| divineomega.TrialBot 0.003 | 5 | 80% |
| Grystrion.TrackerWO 1.0 | 3 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 957. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 40 | 41% | 91 |
| mld.DustBunny 3.8 | 16 | 16% | 39 |
| cb.nano.Insomnia 1.0 | 13 | 13% | 17 |
| kawigi.micro.Shiz 1.1 | 12 | 12% | 35 |
| kawigi.robot.Girl 1.2 | 10 | 10% | 14 |
| divineomega.TrialBot 0.003 | 3 | 3% | 8 |
| lambdaxy.TBot 0.1 | 1 | 1% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 2 |
| Grystrion.TrackerWO 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 162313 melee ticks, 45621 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 55 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 2.

Targeting waves (201 rounds): 53887 sent, 49489 reached their opponent, 8905 virtual hits (18.0% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 456 over 6 battles (76.0 per battle, most in one battle 160). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.1 | 112 / 210 | 2.16 | 18.7% | 29826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 18.7% | 112 |
| gh.Griezel 0.5.2 | 2.0 | 16.3% | 45 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.1% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.6% | 32 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.8% | 4 |
| tvv.nano.Polaris 1.2 | 5.7 | 9.2% | 7 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.7% | 2 |
| repositorio.NanoStep 1.0 | 8.7 | 4.8% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 4.6% | 1 |
| asd.Cthulhu 1.3 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 90.2 | 20 / 35 | 5257 |
| 2 | 1 | 68.9 | 88.3 | 20 / 35 | 4848 |
| 3 | 1 | 69.7 | 89.8 | 23 / 35 | 4942 |
| 4 | 1 | 68.9 | 86.7 | 16 / 35 | 5265 |
| 5 | 1 | 66.9 | 82.5 | 15 / 35 | 4694 |
| 6 | 1 | 68.3 | 85.4 | 18 / 35 | 4820 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 81 | 73% |
| techdude.forest.FlamingForest 1.1 | 33 | 45% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 95% |
| bvh.fnr.Fenrir 0.36l | 10 | 80% |
| divineomega.DivineBot 1.9.4.5 | 6 | 100% |
| tvv.nano.Polaris 1.2 | 5 | 60% |
| stelo.IntrinsicVolatility 1.4 | 3 | 67% |

Hadur died in 101 of 210 rounds, at a mean tick of 1168. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 34 | 34% | 96 |
| techdude.forest.FlamingForest 1.1 | 23 | 23% | 35 |
| bvh.fnr.Fenrir 0.36l | 14 | 14% | 19 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 11 | 11% | 31 |
| stelo.IntrinsicVolatility 1.4 | 7 | 7% | 12 |
| divineomega.DivineBot 1.9.4.5 | 4 | 4% | 9 |
| tvv.nano.Polaris 1.2 | 3 | 3% | 6 |
| asd.Cthulhu 1.3 | 2 | 2% | 2 |
| repositorio.NanoStep 1.0 | 1 | 1% | 0 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 183570 melee ticks, 63682 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 50 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 4.

Targeting waves (205 rounds): 59943 sent, 55461 reached their opponent, 10537 virtual hits (19.0% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 824 over 6 battles (137.3 per battle, most in one battle 186). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.9 | 102 / 210 | 2.45 | 18.1% | 30367 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 18.1% | 102 |
| oog.melee.Mercutio 1.0 | 2.2 | 13.7% | 32 |
| et.Predator 1.8 | 3.5 | 12.9% | 16 |
| cx.BlestPain 1.41 | 3.5 | 12.5% | 40 |
| ahf.NanoAndrew .4 | 5.0 | 11.0% | 13 |
| nic.Nicator 2.4 | 5.8 | 10.1% | 5 |
| maribo.melee.BMV 0.1 | 7.0 | 8.5% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.6% | 1 |
| tex.Longbot 0.4 | 8.7 | 5.3% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 80.3 | 17 / 35 | 4934 |
| 2 | 1 | 68.4 | 86.3 | 19 / 35 | 4952 |
| 3 | 1 | 68.9 | 87.3 | 16 / 35 | 5271 |
| 4 | 1 | 68.4 | 85.1 | 18 / 35 | 5158 |
| 5 | 1 | 68.2 | 83.8 | 18 / 35 | 5244 |
| 6 | 1 | 66.6 | 80.6 | 14 / 35 | 4808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 56 | 75% |
| et.Predator 1.8 | 36 | 81% |
| cx.BlestPain 1.41 | 24 | 25% |
| ahf.NanoAndrew .4 | 15 | 100% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| nic.Nicator 2.4 | 3 | 67% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 1045. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 34 | 30% | 46 |
| oog.melee.Mercutio 1.0 | 26 | 23% | 62 |
| et.Predator 1.8 | 21 | 18% | 48 |
| ahf.NanoAndrew .4 | 12 | 11% | 25 |
| maribo.melee.BMV 0.1 | 9 | 8% | 13 |
| nic.Nicator 2.4 | 5 | 4% | 11 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 3 |
| tex.Longbot 0.4 | 1 | 1% | 1 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 166426 melee ticks, 57929 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 878 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 453 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 9.

Targeting waves (206 rounds): 55946 sent, 51419 reached their opponent, 12186 virtual hits (23.7% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 597 over 6 battles (99.5 per battle, most in one battle 186). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 90.6 | 137 / 210 | 1.84 | 19.2% | 26842 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 19.2% | 137 |
| morbid.MorbidPriest 1.0 | 2.0 | 14.0% | 29 |
| uji.DBH 1.1 | 3.5 | 11.6% | 11 |
| agd.Mooserwirt2 2.7 | 3.5 | 11.7% | 14 |
| spinnercat.Robovirus 2.718 | 5.8 | 8.4% | 3 |
| ratosh.Nobo 0.21 | 6.5 | 8.3% | 6 |
| sigterm.Sigterm 1.0 | 6.5 | 8.4% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 7.2 | 7.7% | 1 |
| stelo.WangRobot 1.0 | 9.2 | 5.5% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 88.9 | 19 / 35 | 4524 |
| 2 | 1 | 69.3 | 92.1 | 24 / 35 | 4525 |
| 3 | 1 | 68.9 | 90.5 | 24 / 35 | 4312 |
| 4 | 1 | 69.6 | 94.0 | 25 / 35 | 4644 |
| 5 | 1 | 68.7 | 91.1 | 23 / 35 | 4454 |
| 6 | 1 | 68.1 | 87.3 | 22 / 35 | 4383 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 68 | 74% |
| uji.DBH 1.1 | 33 | 97% |
| agd.Mooserwirt2 2.7 | 27 | 85% |
| sigterm.Sigterm 1.0 | 12 | 83% |
| stelo.WangRobot 1.0 | 7 | 100% |
| spinnercat.Robovirus 2.718 | 6 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 100% |
| ratosh.Nobo 0.21 | 4 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 40 | 53% | 90 |
| uji.DBH 1.1 | 9 | 12% | 32 |
| agd.Mooserwirt2 2.7 | 7 | 9% | 31 |
| ratosh.Nobo 0.21 | 6 | 8% | 14 |
| sigterm.Sigterm 1.0 | 5 | 7% | 14 |
| spinnercat.Robovirus 2.718 | 3 | 4% | 12 |
| stelo.WangRobot 1.0 | 3 | 4% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 1% | 7 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 140061 melee ticks, 45026 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 47 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 6.

Targeting waves (201 rounds): 47583 sent, 43111 reached their opponent, 10036 virtual hits (23.3% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 291 over 6 battles (48.5 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 96.2 | 181 / 210 | 1.34 | 21.5% | 34304 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 21.5% | 181 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.8% | 12 |
| mld.Infinity 2.2 | 3.2 | 13.0% | 8 |
| erdnis.Rover 0.3 | 4.3 | 10.5% | 3 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 11.2% | 4 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.3% | 0 |
| mbh.Mbh 0.1 | 7.3 | 7.2% | 1 |
| pac.ABC 2.1 | 7.5 | 6.9% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.5% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 94.9 | 30 / 35 | 5442 |
| 2 | 1 | 73.1 | 97.8 | 30 / 35 | 5986 |
| 3 | 1 | 71.9 | 94.3 | 29 / 35 | 5719 |
| 4 | 1 | 73.4 | 99.7 | 34 / 35 | 5791 |
| 5 | 1 | 71.2 | 92.1 | 27 / 35 | 5641 |
| 6 | 1 | 73.0 | 98.7 | 31 / 35 | 5725 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 103 | 94% |
| mld.Infinity 2.2 | 38 | 95% |
| krillr.mini.JointStrike 2.0.0 | 24 | 88% |
| erdnis.Rover 0.3 | 11 | 100% |
| pac.ABC 2.1 | 8 | 100% |
| patson.PatsonTestBot 1.0 | 4 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 16 | 53% | 94 |
| krillr.mini.JointStrike 2.0.0 | 5 | 17% | 32 |
| erdnis.Rover 0.3 | 3 | 10% | 21 |
| mld.Infinity 2.2 | 2 | 7% | 21 |
| pbg.R2D2 1.0 | 2 | 7% | 6 |
| patson.PatsonTestBot 1.0 | 1 | 3% | 16 |
| pac.ABC 2.1 | 0 | 0% | 11 |
| mbh.Mbh 0.1 | 0 | 0% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 134970 melee ticks, 47817 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 58 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 45851 sent, 41559 reached their opponent, 10951 virtual hits (26.4% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 653 over 6 battles (108.8 per battle, most in one battle 150). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 90.0 | 128 / 210 | 1.90 | 19.8% | 33146 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 19.8% | 128 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.7% | 41 |
| fwb.Nine 1.0.1 | 3.2 | 11.7% | 14 |
| catcat20.Rabbit 0.001 | 3.8 | 10.9% | 20 |
| nz.jdc.nano.GridFu 1.0 | 5.0 | 10.3% | 1 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.3% | 3 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 8.2 | 6.3% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.7 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 92.7 | 25 / 35 | 5651 |
| 2 | 1 | 70.3 | 91.1 | 22 / 35 | 5486 |
| 3 | 1 | 71.1 | 91.4 | 23 / 35 | 6256 |
| 4 | 1 | 69.2 | 89.8 | 19 / 35 | 5026 |
| 5 | 1 | 68.9 | 86.7 | 20 / 35 | 5426 |
| 6 | 1 | 69.3 | 88.3 | 19 / 35 | 5301 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 80 | 73% |
| fwb.Nine 1.0.1 | 35 | 97% |
| catcat20.Rabbit 0.001 | 29 | 66% |
| nz.jdc.nano.GridFu 1.0 | 8 | 100% |
| bayen.nut.Squirrel 1.615 | 6 | 83% |
| m3thos.mini.Eva01 0.5.5 | 4 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 981. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 38 | 44% | 96 |
| catcat20.Rabbit 0.001 | 17 | 20% | 39 |
| fwb.Nine 1.0.1 | 10 | 12% | 27 |
| bayen.nut.Squirrel 1.615 | 7 | 8% | 10 |
| nz.jdc.nano.GridFu 1.0 | 5 | 6% | 21 |
| m3thos.mini.Eva01 0.5.5 | 5 | 6% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 167976 melee ticks, 55259 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 32 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 54281 sent, 49685 reached their opponent, 11928 virtual hits (24.0% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 710 over 6 battles (118.3 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.0 | 117 / 210 | 1.99 | 19.4% | 32635 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 19.4% | 117 |
| eem.EvBot v4.6.16 | 2.0 | 17.1% | 70 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.6% | 12 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.3% | 2 |
| eld.Hmm 1.0 | 5.2 | 8.7% | 10 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.7% | 0 |
| el.JumpShoot 0.2 | 7.7 | 6.0% | 0 |
| fire219.CatBot 1.0 | 7.8 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.6 | 18 / 35 | 5182 |
| 2 | 1 | 69.0 | 85.7 | 19 / 35 | 5407 |
| 3 | 1 | 71.8 | 95.2 | 22 / 35 | 5938 |
| 4 | 1 | 68.9 | 86.3 | 15 / 35 | 5413 |
| 5 | 1 | 70.0 | 91.1 | 22 / 35 | 5405 |
| 6 | 1 | 69.7 | 87.9 | 21 / 35 | 5290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 130 | 64% |
| dummy.mini.Scimitar 1.01 | 21 | 90% |
| eld.Hmm 1.0 | 9 | 56% |
| cf.RiO.RiOx 4.2.1 | 8 | 88% |
| el.JumpShoot 0.2 | 2 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1227. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 58 | 59% | 110 |
| dummy.mini.Scimitar 1.01 | 13 | 13% | 48 |
| eld.Hmm 1.0 | 7 | 7% | 20 |
| PSW.Relentless 0.1 | 6 | 6% | 6 |
| cf.RiO.RiOx 4.2.1 | 5 | 5% | 18 |
| arthord.MannyPacquiao Beta | 2 | 2% | 2 |
| el.JumpShoot 0.2 | 1 | 1% | 3 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 183827 melee ticks, 83672 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 104 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 104 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 2.

Targeting waves (209 rounds): 54507 sent, 50216 reached their opponent, 9964 virtual hits (19.8% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 414 over 6 battles (69.0 per battle, most in one battle 152). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 86.7 | 85 / 210 | 2.20 | 17.5% | 26423 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.5 | 17.5% | 85 |
| pe.SandboxDT 2.71m | 1.5 | 17.3% | 73 |
| kvk.HebusLeTroll 0.35 | 3.2 | 14.2% | 24 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.1% | 21 |
| bigpete.Stewie 1.0 | 5.0 | 11.0% | 3 |
| tad.Dalek98 0.98 | 6.8 | 6.3% | 0 |
| yk.JahRoslav 1.1 | 6.8 | 6.6% | 2 |
| gg.Squaraus 0.6 | 7.7 | 5.8% | 0 |
| pbg.NinjaX 1.2 | 8.7 | 5.5% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 86.0 | 16 / 35 | 4552 |
| 2 | 2 | 67.0 | 85.4 | 15 / 35 | 4070 |
| 3 | 1 | 67.6 | 87.0 | 16 / 35 | 4395 |
| 4 | 1 | 69.2 | 91.1 | 16 / 35 | 4687 |
| 5 | 2 | 66.2 | 83.5 | 12 / 35 | 4325 |
| 6 | 2 | 67.0 | 87.0 | 10 / 35 | 4394 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 57 | 35% |
| kvk.HebusLeTroll 0.35 | 40 | 73% |
| jlm.javaDisturbance 0.59 | 30 | 70% |
| bigpete.Stewie 1.0 | 13 | 85% |
| yk.JahRoslav 1.1 | 4 | 50% |
| pbg.NinjaX 1.2 | 2 | 50% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 1059. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 63 | 50% | 87 |
| kvk.HebusLeTroll 0.35 | 34 | 27% | 55 |
| jlm.javaDisturbance 0.59 | 16 | 13% | 39 |
| tad.Dalek98 0.98 | 4 | 3% | 4 |
| bigpete.Stewie 1.0 | 3 | 2% | 14 |
| pbg.NinjaX 1.2 | 3 | 2% | 5 |
| yk.JahRoslav 1.1 | 2 | 2% | 4 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 169335 melee ticks, 48290 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 39 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 2.

Targeting waves (204 rounds): 54371 sent, 49959 reached their opponent, 8758 virtual hits (17.5% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 661 over 6 battles (110.2 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 94.0 | 157 / 210 | 1.54 | 20.5% | 31759 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 20.5% | 157 |
| pe.SandboxLump 1.52 | 2.0 | 16.6% | 27 |
| cre.Karolos 0.32 | 3.0 | 14.7% | 15 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.1% | 6 |
| stelo.RamTrackSurfer 1.2 | 5.2 | 9.4% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.2 | 8.7% | 0 |
| cw.megas.Blade 0.8 | 6.5 | 8.3% | 1 |
| sample.Walls 1.0 | 7.8 | 7.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.5% | 0 |
| rrh.Iwillfindyou 2.0 | 9.7 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.3 | 28 / 35 | 5445 |
| 2 | 1 | 70.6 | 92.7 | 23 / 35 | 4849 |
| 3 | 1 | 70.6 | 90.8 | 24 / 35 | 5170 |
| 4 | 1 | 71.8 | 94.3 | 27 / 35 | 5113 |
| 5 | 1 | 72.7 | 94.9 | 27 / 35 | 5966 |
| 6 | 1 | 72.1 | 97.1 | 28 / 35 | 5216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 102 | 83% |
| cre.Karolos 0.32 | 53 | 94% |
| stelo.RamTrackSurfer 1.2 | 8 | 63% |
| stelo.AreaTargetingBot 1.1 | 6 | 83% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 4 | 75% |

Hadur died in 58 of 210 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 29 | 50% | 108 |
| cre.Karolos 0.32 | 12 | 21% | 54 |
| stelo.RamTrackSurfer 1.2 | 5 | 9% | 16 |
| stelo.AreaTargetingBot 1.1 | 3 | 5% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 3% | 10 |
| cw.megas.Blade 0.8 | 1 | 2% | 4 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 2 |
| sample.Walls 1.0 | 0 | 0% | 7 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 134772 melee ticks, 48485 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 450 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 184 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 42663 sent, 38213 reached their opponent, 11828 virtual hits (31.0% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 738 over 6 battles (123.0 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 75.6 | 54 / 210 | 3.20 | 14.6% | 19523 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.8 | 14.5% | 55 |
| hadur2.Hadur 3.17.1g4gc | 2.0 | 14.6% | 54 |
| florent.XSeries.X2 0.12 | 2.5 | 14.1% | 36 |
| davidalves.Phoenix 0.54 | 3.8 | 12.8% | 36 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.5% | 16 |
| oog.melee.Corsair 1.0 | 6.0 | 9.9% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.2% | 6 |
| lunchie.Lunchbox 0.93 | 8.3 | 5.9% | 0 |
| as.FrankTheTank 1.3 | 8.7 | 5.7% | 0 |
| evd.X1 0.01 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 74.6 | 7 / 35 | 3264 |
| 2 | 1 | 64.7 | 81.6 | 12 / 35 | 3593 |
| 3 | 3 | 59.1 | 67.3 | 6 / 35 | 3039 |
| 4 | 3 | 61.2 | 73.0 | 8 / 35 | 3155 |
| 5 | 1 | 63.9 | 79.7 | 11 / 35 | 3408 |
| 6 | 2 | 62.3 | 77.5 | 10 / 35 | 3064 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 38 | 50% |
| florent.XSeries.X2 0.12 | 18 | 39% |
| davidalves.Phoenix 0.54 | 15 | 33% |
| pedersen.Ugluk 1.1.1 | 15 | 53% |
| oog.melee.Corsair 1.0 | 9 | 67% |
| stelo.SoJNanoMelee 1.1 | 4 | 100% |
| lunchie.Lunchbox 0.93 | 3 | 100% |
| as.FrankTheTank 1.3 | 2 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 42 | 26% | 56 |
| florent.XSeries.X2 0.12 | 39 | 24% | 52 |
| davidalves.Phoenix 0.54 | 27 | 17% | 33 |
| pedersen.Ugluk 1.1.1 | 21 | 13% | 27 |
| oog.melee.Corsair 1.0 | 17 | 10% | 23 |
| lunchie.Lunchbox 0.93 | 4 | 2% | 7 |
| as.FrankTheTank 1.3 | 2 | 1% | 6 |
| stelo.SoJNanoMelee 1.1 | 2 | 1% | 4 |
| evd.X1 0.01 | 2 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 139392 melee ticks, 31005 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 48 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 47175 sent, 42371 reached their opponent, 8549 virtual hits (20.2% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 818 over 6 battles (136.3 per battle, most in one battle 148). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.6 | 132 / 210 | 2.30 | 17.9% | 22168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 17.9% | 132 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.7% | 19 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 13.0% | 17 |
| jdw.Hurricane 1.4 | 4.0 | 11.1% | 16 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.5% | 7 |
| ds.Oo 2.2 | 5.7 | 9.6% | 11 |
| awesomeness.Elite 1.0 | 7.5 | 7.3% | 3 |
| adt.Ar2 1.1 | 7.7 | 7.0% | 5 |
| gjr.Cephalosporin 0.1 | 8.7 | 6.2% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 90.8 | 24 / 35 | 4264 |
| 2 | 1 | 68.0 | 88.6 | 23 / 35 | 3753 |
| 3 | 1 | 66.7 | 85.1 | 22 / 35 | 3749 |
| 4 | 1 | 66.6 | 85.7 | 23 / 35 | 3454 |
| 5 | 1 | 65.7 | 81.3 | 20 / 35 | 3513 |
| 6 | 1 | 65.5 | 81.9 | 20 / 35 | 3435 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 49 | 90% |
| voidious.micro.BlitzBat 1.05 | 33 | 94% |
| jdw.Hurricane 1.4 | 28 | 79% |
| ds.Oo 2.2 | 16 | 88% |
| gre.svman4.Morfeas 1.4.1 | 8 | 100% |
| awesomeness.Elite 1.0 | 6 | 83% |
| adt.Ar2 1.1 | 5 | 80% |
| gjr.Cephalosporin 0.1 | 4 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 24% | 47 |
| jdw.Hurricane 1.4 | 16 | 19% | 30 |
| voidious.mini.BrokenSword 2.0.3 | 14 | 17% | 55 |
| ds.Oo 2.2 | 10 | 12% | 24 |
| awesomeness.Elite 1.0 | 5 | 6% | 11 |
| adt.Ar2 1.1 | 5 | 6% | 9 |
| gre.svman4.Morfeas 1.4.1 | 4 | 5% | 19 |
| amk.ChumbaMini 0.2 | 3 | 4% | 7 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 7 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 127330 melee ticks, 29163 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 357 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 199 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 46039 sent, 41552 reached their opponent, 7712 virtual hits (18.6% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 272 over 6 battles (45.3 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.5 | 134 / 210 | 1.77 | 19.6% | 32660 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 19.6% | 134 |
| ak.Fermat 2.0 | 2.2 | 15.4% | 33 |
| shu.nitro.LENIN .T34 | 3.3 | 12.4% | 23 |
| lrem.Spectre 0.4.4 | 3.5 | 12.2% | 12 |
| js.PinBall 1.6 | 5.3 | 10.3% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 5.7 | 9.5% | 3 |
| gh.mini.GrubbmOne 1.0 | 7.2 | 7.8% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 7.1% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.3 | 25 / 35 | 5678 |
| 2 | 1 | 69.6 | 89.5 | 20 / 35 | 5582 |
| 3 | 1 | 70.5 | 92.4 | 22 / 35 | 5246 |
| 4 | 1 | 69.9 | 90.8 | 18 / 35 | 5611 |
| 5 | 1 | 69.6 | 90.2 | 23 / 35 | 5197 |
| 6 | 1 | 70.7 | 91.7 | 26 / 35 | 5346 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 65 | 69% |
| lrem.Spectre 0.4.4 | 38 | 92% |
| shu.nitro.LENIN .T34 | 38 | 82% |
| js.PinBall 1.6 | 11 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 75% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 36 | 46% | 76 |
| shu.nitro.LENIN .T34 | 16 | 21% | 49 |
| lrem.Spectre 0.4.4 | 13 | 17% | 50 |
| jaybot.adv.bots.JayBot 2.0 | 8 | 10% | 13 |
| js.PinBall 1.6 | 2 | 3% | 13 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 3% | 6 |
| sample.SpinBot 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 165302 melee ticks, 48943 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 705 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 215 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 54565 sent, 50085 reached their opponent, 13392 virtual hits (26.7% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 390 over 6 battles (65.0 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.4 | 149 / 210 | 2.13 | 18.9% | 27327 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.2 | 18.9% | 149 |
| mk.Alpha 0.2.1 | 1.8 | 14.5% | 33 |
| EH.Eagle 1.0.6 | 3.2 | 11.2% | 4 |
| sheldor.melee.nano.TestMelee 0.1 | 5.3 | 9.6% | 10 |
| wee.Gem 1.8.4 | 5.8 | 9.5% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 8.8% | 2 |
| throxbot.ThroxBot 0.1 | 6.3 | 7.9% | 6 |
| joe.ADinosaur 1.0 | 6.5 | 8.6% | 0 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.7% | 1 |
| cs.Grudge 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.1 | 57.1 | 16 / 35 | 4460 |
| 2 | 1 | 69.0 | 92.1 | 26 / 35 | 4192 |
| 3 | 1 | 70.4 | 95.6 | 28 / 35 | 4552 |
| 4 | 1 | 69.5 | 92.4 | 25 / 35 | 4724 |
| 5 | 1 | 70.9 | 95.2 | 29 / 35 | 5014 |
| 6 | 1 | 68.9 | 92.1 | 25 / 35 | 4385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 95 | 91% |
| EH.Eagle 1.0.6 | 27 | 100% |
| throxbot.ThroxBot 0.1 | 11 | 82% |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 60% |
| wee.Gem 1.8.4 | 9 | 89% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| joe.ADinosaur 1.0 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |

Hadur died in 65 of 210 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 21 | 32% | 87 |
| cs.Grudge 1.0 | 13 | 20% | 14 |
| throxbot.ThroxBot 0.1 | 9 | 14% | 18 |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 11% | 17 |
| joe.ADinosaur 1.0 | 4 | 6% | 11 |
| EH.Eagle 1.0.6 | 3 | 5% | 36 |
| wee.Gem 1.8.4 | 2 | 3% | 15 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 3% | 10 |
| caimano.Furia_Ceca 0.22 | 2 | 3% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 133231 melee ticks, 37660 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 39 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 44300 sent, 39846 reached their opponent, 10168 virtual hits (25.5% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 274 over 6 battles (45.7 per battle, most in one battle 54). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 89.2 | 127 / 210 | 1.98 | 18.2% | 22767 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 18.2% | 127 |
| kid.test.NightFox .2 | 2.0 | 15.2% | 39 |
| uji.Antique 1.0 | 3.2 | 12.6% | 22 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.5% | 3 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.7% | 12 |
| ahr.ice.Ice 1.0.2 | 6.5 | 7.9% | 4 |
| amk.ChumbaWumba 0.3 | 6.8 | 7.6% | 2 |
| matt.advanced.Katana 1.0 | 8.3 | 6.2% | 1 |
| stelo.PianistNano 1.2 | 9.2 | 5.3% | 0 |
| stelo.Lifestealer 1.0 | 9.2 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 85.4 | 17 / 35 | 3943 |
| 2 | 1 | 68.2 | 92.1 | 24 / 35 | 3795 |
| 3 | 1 | 69.0 | 93.7 | 24 / 35 | 3906 |
| 4 | 1 | 67.2 | 86.7 | 21 / 35 | 3860 |
| 5 | 1 | 68.0 | 91.1 | 20 / 35 | 3741 |
| 6 | 1 | 66.3 | 86.0 | 21 / 35 | 3522 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 64 | 80% |
| uji.Antique 1.0 | 53 | 87% |
| qohnil.blot.BlotBot 3.61 | 23 | 57% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| amk.ChumbaWumba 0.3 | 7 | 71% |
| ahr.ice.Ice 1.0.2 | 5 | 80% |
| matt.advanced.Katana 1.0 | 2 | 50% |

Hadur died in 85 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 29 | 34% | 67 |
| uji.Antique 1.0 | 17 | 20% | 53 |
| qohnil.blot.BlotBot 3.61 | 13 | 15% | 36 |
| pfvicm.Sobieski 7.2.3b | 10 | 12% | 17 |
| amk.ChumbaWumba 0.3 | 8 | 9% | 13 |
| ahr.ice.Ice 1.0.2 | 3 | 4% | 11 |
| stelo.Lifestealer 1.0 | 3 | 4% | 6 |
| matt.advanced.Katana 1.0 | 2 | 2% | 7 |

Posture (Hadur's M records, 206 rounds): 133510 melee ticks, 37788 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 343 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 257 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 3.

Targeting waves (206 rounds): 45382 sent, 40903 reached their opponent, 6611 virtual hits (16.2% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 564 over 6 battles (94.0 per battle, most in one battle 156). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 83.2 | 94 / 210 | 2.51 | 17.4% | 24445 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.2 | 17.4% | 94 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.8% | 48 |
| deewiant.Anomaly 0.2 | 2.5 | 14.6% | 37 |
| myl.micro.Troodon 1.10 | 3.8 | 12.9% | 12 |
| jok.PheonixM 0.1.2 | 5.0 | 11.4% | 10 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.4% | 0 |
| DBall.Anarchy 0.1 | 7.3 | 6.0% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.7% | 1 |
| jangs.ns51 1.0 | 10.0 | 4.0% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 79.4 | 18 / 35 | 4032 |
| 2 | 1 | 67.4 | 85.4 | 16 / 35 | 3938 |
| 3 | 1 | 67.3 | 84.8 | 14 / 35 | 4145 |
| 4 | 1 | 69.8 | 90.8 | 20 / 35 | 4596 |
| 5 | 1 | 65.1 | 78.4 | 14 / 35 | 3807 |
| 6 | 2 | 66.3 | 80.3 | 12 / 35 | 3927 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 52 | 65% |
| zyx.mega.YersiniaPestis 3.1 | 46 | 61% |
| myl.micro.Troodon 1.10 | 16 | 100% |
| jok.PheonixM 0.1.2 | 12 | 83% |
| ph.melee.ArcherME 0.3 | 3 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 46 | 38% | 86 |
| zyx.mega.YersiniaPestis 3.1 | 33 | 28% | 62 |
| myl.micro.Troodon 1.10 | 19 | 16% | 32 |
| jok.PheonixM 0.1.2 | 12 | 10% | 17 |
| ph.melee.ArcherME 0.3 | 3 | 3% | 7 |
| jangs.ns51 1.0 | 3 | 3% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 161777 melee ticks, 47022 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 39 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 54213 sent, 49753 reached their opponent, 8964 virtual hits (18.0% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 753 over 6 battles (125.5 per battle, most in one battle 148). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 77.8 | 44 / 210 | 3.00 | 15.0% | 21175 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.8 | 15.0% | 44 |
| catcat20.Matcha 0.006 | 2.5 | 13.7% | 50 |
| darkcanuck.B26354 1.06 | 2.5 | 13.5% | 49 |
| stelo.PastFuture 2.3.2 | 4.0 | 12.3% | 25 |
| oog.melee.Capulet 1.2 | 4.2 | 12.1% | 25 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.0% | 9 |
| ntc.Opposite 1.5 | 7.5 | 7.4% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.3% | 6 |
| tripphippy.Alice 1.1 | 8.7 | 6.9% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 89.5 | 15 / 35 | 3812 |
| 2 | 1 | 62.4 | 77.5 | 5 / 35 | 3565 |
| 3 | 3 | 61.9 | 75.2 | 4 / 35 | 3690 |
| 4 | 2 | 63.0 | 78.1 | 5 / 35 | 3595 |
| 5 | 2 | 60.7 | 71.1 | 9 / 35 | 3326 |
| 6 | 2 | 61.2 | 75.6 | 6 / 35 | 3187 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 27 | 30% |
| catcat20.Matcha 0.006 | 21 | 19% |
| oog.melee.Capulet 1.2 | 19 | 42% |
| stelo.PastFuture 2.3.2 | 18 | 44% |
| fowl3628800.LightningBolt 2.6.0 | 9 | 56% |
| tripphippy.Alice 1.1 | 7 | 86% |
| intruder.PrairieWolf 2.61 | 6 | 83% |

Hadur died in 172 of 210 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 43 | 25% | 49 |
| catcat20.Matcha 0.006 | 39 | 23% | 47 |
| oog.melee.Capulet 1.2 | 27 | 16% | 38 |
| stelo.PastFuture 2.3.2 | 27 | 16% | 36 |
| fowl3628800.LightningBolt 2.6.0 | 12 | 7% | 13 |
| intruder.PrairieWolf 2.61 | 7 | 4% | 10 |
| ntc.Opposite 1.5 | 6 | 3% | 6 |
| tripphippy.Alice 1.1 | 5 | 3% | 10 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 164967 melee ticks, 32746 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 41 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 53159 sent, 48623 reached their opponent, 8893 virtual hits (18.3% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 883 over 6 battles (147.2 per battle, most in one battle 159). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 74.6 | 44 / 210 | 3.29 | 14.3% | 18733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.5% | 86 |
| gh.mini.Griezel 0.2 | 2.7 | 14.1% | 57 |
| hadur2.Hadur 3.17.1g4gc | 2.7 | 14.3% | 44 |
| d414.nano.Quantum 1.0.0 | 3.8 | 12.2% | 7 |
| spinnercat.micro.Tyger 0.1 | 5.2 | 10.8% | 8 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.0% | 7 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.2% | 1 |
| fm.mammillarias 1.3 | 8.5 | 5.4% | 1 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.6% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.2 | 73.0 | 6 / 35 | 2850 |
| 2 | 2 | 65.1 | 84.4 | 9 / 35 | 3305 |
| 3 | 3 | 63.1 | 76.8 | 6 / 35 | 3519 |
| 4 | 2 | 62.0 | 73.7 | 9 / 35 | 3061 |
| 5 | 3 | 59.9 | 69.2 | 7 / 35 | 2872 |
| 6 | 3 | 60.7 | 70.5 | 7 / 35 | 3126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 37 | 51% |
| gh.mini.Griezel 0.2 | 36 | 36% |
| gh.nano.Grofvuil 0.2 | 5 | 100% |
| spinnercat.micro.Tyger 0.1 | 5 | 60% |
| d414.nano.Quantum 1.0.0 | 3 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 50% |

Hadur died in 172 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 59 | 34% | 76 |
| gh.mini.Griezel 0.2 | 54 | 31% | 67 |
| d414.nano.Quantum 1.0.0 | 16 | 9% | 19 |
| spinnercat.micro.Tyger 0.1 | 13 | 8% | 17 |
| timmit.nano.TimDog 0.33 | 10 | 6% | 11 |
| gh.nano.Grofvuil 0.2 | 8 | 5% | 11 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 4 |
| fm.mammillarias 1.3 | 2 | 1% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 155201 melee ticks, 26045 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 35 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 4.

Targeting waves (206 rounds): 50906 sent, 46166 reached their opponent, 8252 virtual hits (17.9% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 403 over 6 battles (67.2 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 88.3 | 120 / 210 | 2.06 | 17.9% | 25104 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 17.9% | 120 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.6% | 49 |
| apc.botM 3.0 | 3.2 | 12.4% | 17 |
| vjik.UnViolation 1.1 | 4.7 | 10.1% | 9 |
| lxx.ConceptA 0.8 | 4.7 | 10.3% | 4 |
| bayen.UbaMicro 1.4 | 6.0 | 9.0% | 7 |
| panzer.Panzer 0.2 | 7.3 | 7.5% | 0 |
| yk.JahMicro 1.0 | 7.5 | 7.3% | 1 |
| conscience.Electron 1.3g | 8.7 | 6.3% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 89.8 | 21 / 35 | 4105 |
| 2 | 1 | 67.2 | 88.9 | 22 / 35 | 4039 |
| 3 | 1 | 64.6 | 83.2 | 14 / 35 | 3836 |
| 4 | 1 | 67.8 | 87.9 | 20 / 35 | 4752 |
| 5 | 1 | 66.9 | 87.9 | 18 / 35 | 4164 |
| 6 | 1 | 68.4 | 91.7 | 25 / 35 | 4208 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 76 | 58% |
| apc.botM 3.0 | 32 | 69% |
| vjik.UnViolation 1.1 | 18 | 94% |
| lxx.ConceptA 0.8 | 14 | 93% |
| bayen.UbaMicro 1.4 | 9 | 78% |
| yk.JahMicro 1.0 | 9 | 89% |
| donjezza.Jezza 1.0 | 5 | 100% |
| panzer.Panzer 0.2 | 3 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 37 | 40% | 78 |
| apc.botM 3.0 | 17 | 18% | 39 |
| lxx.ConceptA 0.8 | 15 | 16% | 23 |
| bayen.UbaMicro 1.4 | 13 | 14% | 24 |
| vjik.UnViolation 1.1 | 3 | 3% | 26 |
| conscience.Electron 1.3g | 3 | 3% | 4 |
| yk.JahMicro 1.0 | 1 | 1% | 6 |
| panzer.Panzer 0.2 | 1 | 1% | 5 |
| donjezza.Jezza 1.0 | 0 | 0% | 5 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 123626 melee ticks, 48470 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 72 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 2.

Targeting waves (203 rounds): 43038 sent, 38525 reached their opponent, 8144 virtual hits (21.1% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 615 over 6 battles (102.5 per battle, most in one battle 175). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.8 | 107 / 210 | 2.19 | 18.3% | 26530 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 18.3% | 107 |
| maribo.Quester 0.3 | 2.0 | 17.0% | 57 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.6% | 15 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.0% | 12 |
| labg.Cataclysm 2.05 | 4.5 | 11.0% | 18 |
| baal.nano.N 1.42 | 6.3 | 8.6% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.7% | 0 |
| zyx.micro.Ant 1.1 | 8.3 | 4.8% | 1 |
| sanja.First 0.1 | 8.7 | 4.8% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.6 | 16 / 35 | 4382 |
| 2 | 1 | 67.7 | 84.4 | 18 / 35 | 4339 |
| 3 | 1 | 68.1 | 84.8 | 16 / 35 | 4526 |
| 4 | 1 | 68.9 | 88.3 | 18 / 35 | 4431 |
| 5 | 1 | 68.8 | 88.3 | 19 / 35 | 4383 |
| 6 | 1 | 68.9 | 87.6 | 20 / 35 | 4469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 65 | 65% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 80% |
| gre.svman4.Leonidas 1.3.2 | 24 | 79% |
| labg.Cataclysm 2.05 | 14 | 57% |
| baal.nano.N 1.42 | 4 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 46 | 43% | 96 |
| gre.svman4.Leonidas 1.3.2 | 21 | 20% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 16% | 48 |
| labg.Cataclysm 2.05 | 11 | 10% | 19 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 7% | 10 |
| sanja.First 0.1 | 2 | 2% | 2 |
| baal.nano.N 1.42 | 0 | 0% | 3 |
| zyx.micro.Ant 1.1 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 175552 melee ticks, 47186 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 64 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 3.

Targeting waves (204 rounds): 57075 sent, 52437 reached their opponent, 8666 virtual hits (16.5% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 452 over 6 battles (75.3 per battle, most in one battle 149). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 88.1 | 85 / 210 | 2.07 | 17.9% | 27863 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 17.9% | 85 |
| kid.Gladiator .7.2 | 2.2 | 16.5% | 48 |
| stelo.Spread 0.9 | 2.8 | 16.3% | 58 |
| jcs.Seth 1.8 | 4.3 | 11.2% | 17 |
| tcf.Reach 3 | 4.8 | 10.8% | 4 |
| cli.Dancer 1.1 | 5.8 | 9.3% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.0% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.2% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.4% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 87.0 | 11 / 35 | 4316 |
| 2 | 1 | 68.7 | 87.9 | 15 / 35 | 4792 |
| 3 | 1 | 69.5 | 89.5 | 15 / 35 | 4794 |
| 4 | 1 | 68.2 | 87.9 | 16 / 35 | 4544 |
| 5 | 1 | 67.3 | 84.8 | 15 / 35 | 4360 |
| 6 | 1 | 69.4 | 91.4 | 13 / 35 | 5057 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 73 | 63% |
| kid.Gladiator .7.2 | 51 | 45% |
| jcs.Seth 1.8 | 19 | 42% |
| tcf.Reach 3 | 6 | 67% |
| cli.Dancer 1.1 | 4 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 1120. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 53 | 41% | 71 |
| stelo.Spread 0.9 | 44 | 34% | 93 |
| jcs.Seth 1.8 | 14 | 11% | 22 |
| tcf.Reach 3 | 6 | 5% | 12 |
| cli.Dancer 1.1 | 4 | 3% | 8 |
| ratosh.Wesco 1.4 | 3 | 2% | 3 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 177195 melee ticks, 59973 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 50 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 56363 sent, 51837 reached their opponent, 9863 virtual hits (19.0% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 831 over 6 battles (138.5 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 79.0 | 38 / 210 | 2.89 | 14.9% | 19924 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.6% | 140 |
| hadur2.Hadur 3.17.1g4gc | 2.0 | 14.9% | 38 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.5% | 23 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 12.3% | 9 |
| rz.HawkOnFire 0.1 | 4.7 | 11.2% | 2 |
| wit.Chuliath 1.0 | 6.2 | 7.2% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 6.4% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 5.7% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.7% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 76.8 | 4 / 35 | 3254 |
| 2 | 2 | 62.5 | 76.8 | 5 / 35 | 3155 |
| 3 | 2 | 64.0 | 78.7 | 7 / 35 | 3512 |
| 4 | 2 | 62.5 | 76.2 | 7 / 35 | 3172 |
| 5 | 2 | 64.6 | 83.5 | 7 / 35 | 3455 |
| 6 | 2 | 64.1 | 81.9 | 8 / 35 | 3376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 64 | 13% |
| gh.mini.Gruwel 0.9 | 21 | 57% |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 85% |
| rz.HawkOnFire 0.1 | 6 | 83% |
| wit.Chuliath 1.0 | 1 | 100% |
| dans.Cinnamon 1.2 | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 87 | 48% | 96 |
| gh.mini.Gruwel 0.9 | 29 | 16% | 39 |
| dmh.robocode.robot.BlackDeath 9.2 | 23 | 13% | 33 |
| rz.HawkOnFire 0.1 | 21 | 12% | 25 |
| wit.Chuliath 1.0 | 4 | 2% | 6 |
| stelo.MyAgileRobot 0.2 | 3 | 2% | 3 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 5 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 145479 melee ticks, 37617 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 32 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 4.

Targeting waves (207 rounds): 46204 sent, 41576 reached their opponent, 7164 virtual hits (17.2% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 369 over 6 battles (61.5 per battle, most in one battle 150). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 91.5 | 145 / 210 | 1.77 | 20.0% | 30097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 20.0% | 145 |
| bzdp.Pansy 2.1 | 2.3 | 12.7% | 11 |
| alpha.RainingFire 1.0 | 3.0 | 12.5% | 23 |
| bvh.micro.Freya 0.3 | 4.3 | 11.1% | 13 |
| mz.Cork 0.1 | 4.7 | 10.8% | 8 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.8% | 6 |
| bvh.mini.Fenrir 0.39 | 6.7 | 8.9% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 5.7% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 4.5% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 94.3 | 26 / 35 | 4966 |
| 2 | 1 | 67.6 | 83.8 | 17 / 35 | 4763 |
| 3 | 1 | 69.9 | 88.9 | 24 / 35 | 5020 |
| 4 | 1 | 70.9 | 94.0 | 28 / 35 | 4935 |
| 5 | 1 | 70.0 | 92.1 | 23 / 35 | 4888 |
| 6 | 1 | 71.9 | 95.9 | 27 / 35 | 5525 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 91% |
| mz.Cork 0.1 | 34 | 85% |
| alpha.RainingFire 1.0 | 34 | 68% |
| bvh.micro.Freya 0.3 | 27 | 89% |
| m3thos.Eva02 0.7.1 | 15 | 87% |
| bvh.mini.Fenrir 0.39 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |
| sample.MyFirstRobot 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 21 | 32% | 42 |
| bvh.micro.Freya 0.3 | 11 | 17% | 30 |
| bzdp.Pansy 2.1 | 8 | 12% | 45 |
| mz.Cork 0.1 | 8 | 12% | 41 |
| m3thos.Eva02 0.7.1 | 6 | 9% | 27 |
| bvh.mini.Fenrir 0.39 | 6 | 9% | 12 |
| squidM.TentalceMeleeNano 1.1 | 3 | 5% | 6 |
| dl.BetterWalls 1.0 | 1 | 2% | 5 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 144697 melee ticks, 47595 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 51 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 50174 sent, 46013 reached their opponent, 10370 virtual hits (22.5% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 377 over 6 battles (62.8 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 88.3 | 158 / 210 | 2.06 | 18.7% | 30673 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 18.7% | 158 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.7 | 10.5% | 7 |
| germ.TheMind .2 | 3.7 | 10.2% | 14 |
| EBBU.Sim2 1.02 | 4.2 | 9.9% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 5.8 | 9.0% | 3 |
| stelo.UntouchableNano 1.3 | 6.0 | 9.0% | 11 |
| lmk.ACPFinal 0.1 | 6.3 | 8.7% | 2 |
| agrach.Dalek 1.0 | 6.5 | 8.9% | 9 |
| mb.Beast 0.1 | 8.2 | 7.9% | 2 |
| skm.Ryubot 1.0 | 9.7 | 7.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 93.0 | 29 / 35 | 5439 |
| 2 | 1 | 66.7 | 85.1 | 23 / 35 | 5147 |
| 3 | 1 | 69.0 | 92.7 | 29 / 35 | 5241 |
| 4 | 1 | 67.9 | 89.8 | 27 / 35 | 4999 |
| 5 | 1 | 67.6 | 88.3 | 29 / 35 | 4949 |
| 6 | 1 | 65.2 | 80.6 | 21 / 35 | 4898 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 33 | 97% |
| germ.TheMind .2 | 27 | 89% |
| EBBU.Sim2 1.02 | 22 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 22 | 86% |
| stelo.UntouchableNano 1.3 | 22 | 86% |
| lmk.ACPFinal 0.1 | 17 | 100% |
| mb.Beast 0.1 | 17 | 100% |
| skm.Ryubot 1.0 | 7 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 448. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 15 | 27% | 18 |
| com.syncleus.robocode.Dreadnaught 0.1 | 10 | 18% | 33 |
| stelo.UntouchableNano 1.3 | 7 | 13% | 21 |
| germ.TheMind .2 | 6 | 11% | 17 |
| agrach.Dalek 1.0 | 5 | 9% | 42 |
| EBBU.Sim2 1.02 | 4 | 7% | 29 |
| mb.Beast 0.1 | 4 | 7% | 21 |
| lmk.ACPFinal 0.1 | 3 | 5% | 21 |
| skm.Ryubot 1.0 | 1 | 2% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 98485 melee ticks, 25989 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 48 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 4.

Targeting waves (202 rounds): 33432 sent, 29303 reached their opponent, 9609 virtual hits (32.8% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 514 over 6 battles (85.7 per battle, most in one battle 164). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 85.0 | 98 / 210 | 2.35 | 17.0% | 23309 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.3 | 17.0% | 98 |
| justin.Mallais 14.0 | 1.8 | 16.1% | 66 |
| bvh.mini.Freya 0.55 | 3.0 | 13.0% | 17 |
| bts.mega.Gnarly 1.4 | 4.3 | 10.8% | 12 |
| cs.Wren 1.0 | 5.0 | 10.2% | 8 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.7% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.7 | 9.1% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.5% | 1 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.3% | 1 |
| bzdp.BoxCar 2.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 93.3 | 22 / 35 | 4209 |
| 2 | 2 | 65.0 | 80.0 | 14 / 35 | 3820 |
| 3 | 1 | 67.2 | 88.9 | 17 / 35 | 3990 |
| 4 | 2 | 65.4 | 82.5 | 14 / 35 | 3561 |
| 5 | 1 | 65.3 | 81.6 | 16 / 35 | 3774 |
| 6 | 1 | 65.8 | 83.5 | 15 / 35 | 3955 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 61 | 66% |
| bvh.mini.Freya 0.55 | 24 | 63% |
| bts.mega.Gnarly 1.4 | 18 | 67% |
| kdf.KoulDestroyer 1.0 | 12 | 75% |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 100% |
| cs.Wren 1.0 | 11 | 64% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 67% |
| matt.UnderDark3 2.4.34 | 1 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 52 | 45% | 88 |
| bvh.mini.Freya 0.55 | 20 | 17% | 33 |
| cs.Wren 1.0 | 12 | 10% | 20 |
| bts.mega.Gnarly 1.4 | 10 | 9% | 32 |
| kdf.KoulDestroyer 1.0 | 10 | 9% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 8% | 16 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 3 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 141800 melee ticks, 37876 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 63 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 4.

Targeting waves (204 rounds): 47124 sent, 42519 reached their opponent, 9255 virtual hits (21.8% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 927 over 6 battles (154.5 per battle, most in one battle 161). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 83.3 | 88 / 210 | 2.50 | 17.0% | 26417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 17.0% | 88 |
| bvh.fry.Freya 0.82 | 2.2 | 14.8% | 25 |
| az.Ololobot 0.2.4 | 3.2 | 12.9% | 55 |
| catcat20.Lambda 0.024 | 3.7 | 12.8% | 36 |
| apollokidd.ApolloKidd 0.9 | 5.7 | 8.4% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 6.7 | 7.9% | 3 |
| winamp32.micro.MicroMacro 1.0 | 6.8 | 7.8% | 1 |
| gimp.GimpBot 0.1 | 6.8 | 7.8% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.5% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 84.1 | 17 / 35 | 4491 |
| 2 | 1 | 64.7 | 80.3 | 14 / 35 | 4266 |
| 3 | 1 | 67.0 | 86.0 | 13 / 35 | 4705 |
| 4 | 1 | 67.2 | 85.4 | 17 / 35 | 4781 |
| 5 | 1 | 65.0 | 82.2 | 12 / 35 | 4070 |
| 6 | 1 | 65.3 | 81.6 | 15 / 35 | 4104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 47 | 49% |
| bvh.fry.Freya 0.82 | 40 | 78% |
| catcat20.Lambda 0.024 | 37 | 51% |
| apollokidd.ApolloKidd 0.9 | 5 | 80% |
| gimp.GimpBot 0.1 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| stelo.SoRobotNanoMelee 1.2 | 3 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 1028. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 37 | 28% | 65 |
| az.Ololobot 0.2.4 | 36 | 27% | 59 |
| catcat20.Lambda 0.024 | 28 | 21% | 45 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 8% | 11 |
| gimp.GimpBot 0.1 | 5 | 4% | 12 |
| apollokidd.ApolloKidd 0.9 | 5 | 4% | 8 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 5 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 163461 melee ticks, 53937 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 99 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 99 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 3.

Targeting waves (206 rounds): 53132 sent, 48516 reached their opponent, 9636 virtual hits (19.9% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 476 over 6 battles (79.3 per battle, most in one battle 159). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.5 | 122 / 210 | 2.03 | 18.8% | 27096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 18.8% | 122 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.5% | 31 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 12.7% | 23 |
| mz.AntiGrav 1.0 | 3.8 | 11.4% | 7 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.6% | 12 |
| stelo.Randomness 1.0 | 6.2 | 9.1% | 8 |
| alpha.BlackIce 1.0 | 6.7 | 8.7% | 5 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.5% | 2 |
| sample.Corners 1.0 | 9.5 | 3.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.7 | 25 / 35 | 4794 |
| 2 | 1 | 69.5 | 90.2 | 21 / 35 | 4624 |
| 3 | 1 | 67.2 | 84.4 | 16 / 35 | 4198 |
| 4 | 1 | 68.3 | 88.3 | 20 / 35 | 4422 |
| 5 | 1 | 69.7 | 90.8 | 21 / 35 | 4814 |
| 6 | 1 | 67.3 | 84.8 | 19 / 35 | 4244 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 55 | 75% |
| kano.gamma.KanoGamma 1.8 | 49 | 78% |
| mz.AntiGrav 1.0 | 23 | 91% |
| Polkwane.SmashMelee 1.0 | 13 | 92% |
| alpha.BlackIce 1.0 | 7 | 57% |
| stelo.Randomness 1.0 | 4 | 50% |
| amk.superstrike.SuperStrike 0.3 | 4 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 28 | 31% | 64 |
| kano.gamma.KanoGamma 1.8 | 16 | 18% | 54 |
| stelo.Randomness 1.0 | 15 | 16% | 19 |
| mz.AntiGrav 1.0 | 10 | 11% | 31 |
| Polkwane.SmashMelee 1.0 | 8 | 9% | 21 |
| alpha.BlackIce 1.0 | 7 | 8% | 11 |
| amk.superstrike.SuperStrike 0.3 | 5 | 5% | 8 |
| sample.Corners 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 155798 melee ticks, 39649 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 701 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 267 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 51818 sent, 47085 reached their opponent, 10327 virtual hits (21.9% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 331 over 6 battles (55.2 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 85.7 | 98 / 210 | 2.29 | 17.2% | 23238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.2 | 17.2% | 98 |
| eem.EvBotNG v12.8 | 1.8 | 16.0% | 71 |
| ary.Swarm 1.1 | 3.3 | 13.0% | 10 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.9% | 15 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.6% | 15 |
| shrub.Silver v048 | 6.0 | 8.7% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 6.9% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 5.7% | 2 |
| stelo.Mirror 1.1 | 8.8 | 5.6% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.0 | 18 / 35 | 4134 |
| 2 | 1 | 67.4 | 87.3 | 18 / 35 | 3952 |
| 3 | 1 | 64.9 | 78.4 | 15 / 35 | 3639 |
| 4 | 1 | 67.4 | 88.6 | 13 / 35 | 4151 |
| 5 | 2 | 67.4 | 87.6 | 16 / 35 | 3722 |
| 6 | 1 | 66.9 | 86.0 | 18 / 35 | 3640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 72 | 46% |
| lessonz.robocode.Oz 0.5.0 | 29 | 79% |
| ary.Swarm 1.1 | 21 | 90% |
| simonton.nano.MeleeSeed 1.8 | 19 | 95% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| shrub.Silver v048 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 0% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 58 | 50% | 84 |
| ary.Swarm 1.1 | 15 | 13% | 41 |
| lessonz.robocode.Oz 0.5.0 | 14 | 12% | 26 |
| simonton.nano.MeleeSeed 1.8 | 13 | 11% | 35 |
| shrub.Silver v048 | 9 | 8% | 15 |
| zyx.nano.Ant 1.1 | 3 | 3% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |
| stelo.Mirror 1.1 | 0 | 0% | 2 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 149994 melee ticks, 41966 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 43 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 3.

Targeting waves (200 rounds): 50571 sent, 46160 reached their opponent, 8083 virtual hits (17.5% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1004 over 6 battles (167.3 per battle, most in one battle 187). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 86.3 | 116 / 210 | 2.23 | 18.5% | 30365 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 18.5% | 116 |
| wompi.Wallaby 5.1 | 2.0 | 15.8% | 46 |
| ara.Shera 0.88 | 3.3 | 14.2% | 37 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.4% | 7 |
| amz.NanoClone 1.41 | 5.0 | 8.6% | 0 |
| dsw.StaticD 1.0 | 6.5 | 6.9% | 4 |
| maribo.IotaCT 1.1 | 6.5 | 7.0% | 0 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.8% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 89.8 | 21 / 35 | 5237 |
| 2 | 1 | 69.6 | 90.2 | 21 / 35 | 5365 |
| 3 | 1 | 66.1 | 81.0 | 14 / 35 | 4681 |
| 4 | 1 | 67.4 | 83.5 | 18 / 35 | 4812 |
| 5 | 1 | 69.3 | 86.7 | 22 / 35 | 5284 |
| 6 | 1 | 68.7 | 87.0 | 20 / 35 | 4986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 74 | 84% |
| maribo.mini.MiniQuester 0.1 | 34 | 100% |
| ara.Shera 0.88 | 25 | 60% |
| dsw.StaticD 1.0 | 4 | 75% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 35 | 35% | 52 |
| wompi.Wallaby 5.1 | 32 | 32% | 92 |
| maribo.mini.MiniQuester 0.1 | 23 | 23% | 54 |
| mme.NikeEnhanced 2.0 | 2 | 2% | 4 |
| dsw.StaticD 1.0 | 1 | 1% | 4 |
| maribo.IotaCT 1.1 | 1 | 1% | 3 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 168884 melee ticks, 44314 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 34 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 6.

Targeting waves (207 rounds): 53563 sent, 49067 reached their opponent, 10991 virtual hits (22.4% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 782 over 6 battles (130.3 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 80.5 | 31 / 210 | 2.75 | 15.2% | 20933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.7% | 140 |
| hadur2.Hadur 3.17.1g4gc | 2.0 | 15.2% | 31 |
| dummy.micro.Sparrow 2.5 | 3.7 | 12.1% | 11 |
| brainfade.melee.Dusk 0.44 | 3.8 | 12.2% | 24 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.1% | 2 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.5% | 2 |
| jab.DiamondStealer 5 | 7.3 | 7.6% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 82.2 | 6 / 35 | 3492 |
| 2 | 2 | 65.1 | 81.6 | 6 / 35 | 3315 |
| 3 | 2 | 63.4 | 75.6 | 4 / 35 | 3270 |
| 4 | 2 | 65.3 | 80.6 | 6 / 35 | 3659 |
| 5 | 2 | 64.0 | 78.4 | 3 / 35 | 3511 |
| 6 | 2 | 66.5 | 84.8 | 6 / 35 | 3686 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 89 | 13% |
| brainfade.melee.Dusk 0.44 | 17 | 35% |
| dummy.micro.Sparrow 2.5 | 12 | 83% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 1024. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 109 | 59% | 121 |
| brainfade.melee.Dusk 0.44 | 31 | 17% | 37 |
| dummy.micro.Sparrow 2.5 | 16 | 9% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 8 | 4% | 9 |
| mz.NanoGod 2.02 | 6 | 3% | 6 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 7 |
| jab.DiamondStealer 5 | 3 | 2% | 4 |
| cvt.Firsty 1.0 | 2 | 1% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 161512 melee ticks, 52647 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 36 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 36 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 4.

Targeting waves (207 rounds): 52128 sent, 47511 reached their opponent, 8859 virtual hits (18.6% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 286 over 6 battles (47.7 per battle, most in one battle 62). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.3 | 120 / 210 | 1.88 | 19.3% | 29634 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 19.3% | 120 |
| stelo.Liblix 0.3.1 | 2.0 | 16.0% | 60 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.0% | 17 |
| jwirde.Gort 2.0 | 4.3 | 9.8% | 8 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.7 | 9.4% | 1 |
| wompi.Quokka 1.6 | 6.7 | 7.6% | 0 |
| disan.Chair 2.2.0 | 6.8 | 7.8% | 3 |
| stf.PanzerGeneral 0.1 | 7.5 | 6.9% | 1 |
| sample.Crazy 1.0 | 9.2 | 4.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.8 | 19 / 35 | 4824 |
| 2 | 1 | 70.4 | 93.7 | 25 / 35 | 4908 |
| 3 | 1 | 69.2 | 89.5 | 18 / 35 | 5163 |
| 4 | 1 | 68.2 | 85.4 | 18 / 35 | 4631 |
| 5 | 1 | 68.4 | 88.3 | 17 / 35 | 4894 |
| 6 | 1 | 70.6 | 94.9 | 23 / 35 | 5214 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 71 | 56% |
| tzu.TheArtOfWar 1.2 | 58 | 83% |
| jwirde.Gort 2.0 | 14 | 93% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 88% |
| disan.Chair 2.2.0 | 5 | 60% |
| sample.Crazy 1.0 | 5 | 100% |
| stf.PanzerGeneral 0.1 | 3 | 67% |
| wompi.Quokka 1.6 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 50 | 55% | 95 |
| tzu.TheArtOfWar 1.2 | 17 | 19% | 61 |
| jwirde.Gort 2.0 | 10 | 11% | 24 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 7% | 11 |
| disan.Chair 2.2.0 | 4 | 4% | 7 |
| wompi.Quokka 1.6 | 2 | 2% | 5 |
| stf.PanzerGeneral 0.1 | 2 | 2% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 3 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 206 rounds): 162512 melee ticks, 44204 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 769 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 280 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 56273 sent, 51793 reached their opponent, 11676 virtual hits (22.5% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 769 over 6 battles (128.2 per battle, most in one battle 173). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 90.1 | 119 / 210 | 1.89 | 19.8% | 31404 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1g4gc | 1.0 | 19.8% | 119 |
| jje.BagPuss 1.2 | 2.7 | 12.1% | 12 |
| eem.IWillFireNoBullet v2.8 | 2.7 | 11.9% | 61 |
| sul.Lunar 1.1 | 4.5 | 10.6% | 10 |
| myl.nano.Graviton 1.10 | 4.5 | 10.2% | 5 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.2% | 2 |
| fm.claire 1.7 | 6.8 | 8.5% | 0 |
| hvilela.HVilela 0.9 | 7.0 | 8.5% | 3 |
| wit.Deep7 2.0 | 9.0 | 6.0% | 0 |
| abud.ThirdRobo 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.4 | 22 / 35 | 5158 |
| 2 | 1 | 69.9 | 90.5 | 20 / 35 | 5652 |
| 3 | 1 | 68.1 | 87.9 | 20 / 35 | 4708 |
| 4 | 1 | 70.4 | 91.1 | 22 / 35 | 5448 |
| 5 | 1 | 70.8 | 92.1 | 22 / 35 | 5650 |
| 6 | 1 | 67.7 | 87.6 | 13 / 35 | 4788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 88 | 66% |
| jje.BagPuss 1.2 | 20 | 80% |
| sul.Lunar 1.1 | 18 | 78% |
| myl.nano.Graviton 1.10 | 11 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 82% |
| hvilela.HVilela 0.9 | 6 | 67% |
| wit.Deep7 2.0 | 5 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 1646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 33 | 34% | 0 |
| jje.BagPuss 1.2 | 17 | 17% | 63 |
| myl.nano.Graviton 1.10 | 13 | 13% | 45 |
| sul.Lunar 1.1 | 12 | 12% | 51 |
| hvilela.HVilela 0.9 | 5 | 5% | 11 |
| fm.claire 1.7 | 5 | 5% | 10 |
| wit.Deep7 2.0 | 4 | 4% | 16 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 3% | 11 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 213940 melee ticks, 93939 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 39 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 8.

Targeting waves (205 rounds): 65224 sent, 60852 reached their opponent, 10289 virtual hits (16.9% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1g4gc against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 783 over 6 battles (130.5 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 83.3 | 64 / 210 | 2.50 | 16.1% | 22630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.0% | 57 |
| hadur2.Hadur 3.17.1g4gc | 2.2 | 16.1% | 64 |
| rsalesc.melee.Medina 0.4.5 | 2.5 | 16.1% | 74 |
| mz.MicroSheep 1.0 | 4.7 | 10.4% | 2 |
| cx.Princess 1.0 | 5.0 | 9.9% | 11 |
| sadoner.killer 0.2 | 5.3 | 9.7% | 2 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.2% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.9% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 87.0 | 12 / 35 | 3961 |
| 2 | 3 | 64.9 | 79.0 | 12 / 35 | 3768 |
| 3 | 1 | 66.6 | 87.6 | 13 / 35 | 3813 |
| 4 | 3 | 64.3 | 80.3 | 9 / 35 | 3601 |
| 5 | 2 | 65.1 | 82.5 | 10 / 35 | 3907 |
| 6 | 3 | 64.7 | 83.5 | 8 / 35 | 3580 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 68 | 60% |
| rsalesc.melee.Medina 0.4.5 | 37 | 22% |
| cx.Princess 1.0 | 11 | 55% |
| mz.MicroSheep 1.0 | 6 | 83% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 59 | 39% | 96 |
| rsalesc.melee.Medina 0.4.5 | 55 | 36% | 69 |
| cx.Princess 1.0 | 11 | 7% | 14 |
| sadoner.killer 0.2 | 8 | 5% | 10 |
| mz.MicroSheep 1.0 | 6 | 4% | 12 |
| jeremyreeder.collective.Prophet 5 | 4 | 3% | 6 |
| arthord.NanoSatanMelee Beta | 2 | 1% | 2 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 154130 melee ticks, 43431 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 686 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 238 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 1.

Targeting waves (209 rounds): 46745 sent, 42075 reached their opponent, 7179 virtual hits (17.1% of those reached).

