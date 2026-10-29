# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 72.3 | 27 / 350 | 3.49 | 13.6% | 38092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 260 |
| hadur117.nano.SanaroB800 0.1 | 2.1 | 13.6% | 27 |
| sgp.JollyNinja 3.53 | 3.6 | 11.8% | 31 |
| mz.MicroGodMelee 1 | 4.0 | 11.4% | 18 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.6 | 10.9% | 3 |
| lorneswork.Predator 1.0 | 5.7 | 10.1% | 8 |
| adt.Ar2 1.0 | 7.0 | 8.1% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.5% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.1 | 71.1 | 3 / 35 | 3445 |
| 2 | 2 | 62.0 | 74.6 | 2 / 35 | 4078 |
| 3 | 2 | 61.2 | 72.7 | 2 / 35 | 3644 |
| 4 | 2 | 61.5 | 75.2 | 3 / 35 | 3823 |
| 5 | 2 | 61.1 | 72.7 | 3 / 35 | 3891 |
| 6 | 2 | 62.1 | 73.0 | 4 / 35 | 4191 |
| 7 | 2 | 61.0 | 72.7 | 4 / 35 | 3790 |
| 8 | 2 | 62.1 | 76.5 | 2 / 35 | 3918 |
| 9 | 3 | 57.2 | 63.2 | 3 / 35 | 3395 |
| 10 | 2 | 60.4 | 71.7 | 1 / 35 | 3917 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 122 | 4% |
| mz.MicroGodMelee 1 | 16 | 44% |
| sgp.JollyNinja 3.53 | 16 | 38% |
| lorneswork.Predator 1.0 | 7 | 29% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 80% |
| adt.Ar2 1.0 | 3 | 100% |

Hadur died in 323 of 350 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 174 | 54% | 178 |
| sgp.JollyNinja 3.53 | 45 | 14% | 50 |
| mz.MicroGodMelee 1 | 31 | 10% | 40 |
| lorneswork.Predator 1.0 | 28 | 9% | 30 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 6% | 23 |
| adt.Ar2 1.0 | 16 | 5% | 19 |
| kawigi.sbf.FloodSonnet 0.9 | 6 | 2% | 6 |
| skm.butterfly 1.0 | 3 | 1% | 4 |

## Melee bench: F02

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 65.1 | 48 / 350 | 4.14 | 13.7% | 43583 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.6 | 14.8% | 83 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.5% | 108 |
| hadur117.nano.SanaroB800 0.1 | 2.5 | 13.7% | 48 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.2% | 10 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.3% | 34 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.1% | 6 |
| sch.Simone 0.3d | 6.9 | 8.3% | 27 |
| Noran.BitchingElk 0.054 | 7.5 | 7.7% | 25 |
| stelo.PatternRobot 1.0 | 8.7 | 6.4% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 5.0% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 66.3 | 7 / 35 | 4615 |
| 2 | 3 | 58.1 | 62.5 | 5 / 35 | 3959 |
| 3 | 3 | 59.1 | 62.5 | 4 / 35 | 4327 |
| 4 | 2 | 61.3 | 69.8 | 4 / 35 | 4202 |
| 5 | 3 | 60.0 | 64.1 | 3 / 35 | 4459 |
| 6 | 2 | 58.7 | 61.0 | 6 / 35 | 4341 |
| 7 | 3 | 56.1 | 55.6 | 5 / 35 | 3975 |
| 8 | 3 | 60.9 | 67.6 | 4 / 35 | 4469 |
| 9 | 3 | 61.7 | 69.8 | 5 / 35 | 4488 |
| 10 | 1 | 62.7 | 71.7 | 5 / 35 | 4748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 46 | 24% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 36 | 22% |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 53% |
| sch.Simone 0.3d | 11 | 27% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 78% |
| Noran.BitchingElk 0.054 | 9 | 22% |
| stelo.PatternRobot 1.0 | 6 | 83% |
| fnc.bandit.Bandit 5.2.0 | 5 | 60% |
| fullsail.SweetTea 1.1 | 2 | 0% |

Hadur died in 303 of 350 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 86 | 28% | 94 |
| pulsar.PulsarMax 0.8.9 | 70 | 23% | 75 |
| lrem.micro.SpikeSoldier 0.4 | 44 | 15% | 49 |
| sch.Simone 0.3d | 25 | 8% | 29 |
| fnc.bandit.Bandit 5.2.0 | 22 | 7% | 25 |
| com.cohesiva.robocode.ManOwaR 1.0 | 21 | 7% | 30 |
| stelo.PatternRobot 1.0 | 13 | 4% | 19 |
| Noran.BitchingElk 0.054 | 11 | 4% | 16 |
| fullsail.SweetTea 1.1 | 11 | 4% | 11 |

## Melee bench: F03

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 76.6 | 58 / 350 | 3.10 | 14.7% | 43506 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 2.0 | 14.8% | 97 |
| hadur117.nano.SanaroB800 0.1 | 2.1 | 14.7% | 58 |
| kawigi.nano.Lib 1.0 | 2.6 | 14.6% | 90 |
| vuen.Cake 2.51 | 3.3 | 13.7% | 84 |
| urdos.URDOS 1.3 | 5.0 | 10.2% | 10 |
| adt.Ar1 2.1 | 6.5 | 7.6% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 6.9 | 7.2% | 2 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.7% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.9 | 5.8% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 83.5 | 6 / 35 | 4443 |
| 2 | 3 | 62.2 | 76.2 | 4 / 35 | 4308 |
| 3 | 4 | 61.6 | 74.9 | 3 / 35 | 4275 |
| 4 | 1 | 61.0 | 73.7 | 8 / 35 | 4214 |
| 5 | 2 | 62.4 | 74.3 | 8 / 35 | 4391 |
| 6 | 4 | 58.8 | 67.9 | 2 / 35 | 3780 |
| 7 | 1 | 63.9 | 78.7 | 9 / 35 | 4645 |
| 8 | 2 | 63.6 | 79.7 | 4 / 35 | 4835 |
| 9 | 2 | 62.5 | 77.1 | 5 / 35 | 4227 |
| 10 | 1 | 63.4 | 80.3 | 9 / 35 | 4388 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 56 | 38% |
| radnor.DoctorBob 1.42 | 54 | 35% |
| kawigi.nano.Lib 1.0 | 45 | 2% |
| urdos.URDOS 1.3 | 11 | 64% |
| adt.Ar1 2.1 | 6 | 67% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 75% |
| oa.weak.FlyMk1 0.1 | 4 | 75% |

Hadur died in 295 of 350 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 105 | 36% | 107 |
| radnor.DoctorBob 1.42 | 80 | 27% | 97 |
| vuen.Cake 2.51 | 45 | 15% | 66 |
| urdos.URDOS 1.3 | 39 | 13% | 45 |
| ghent.ArthurPanzergon 1.0.0 | 10 | 3% | 12 |
| adt.Ar1 2.1 | 8 | 3% | 10 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 1% | 3 |
| oa.weak.FlyMk1 0.1 | 2 | 1% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 68.1 | 3 / 350 | 3.87 | 13.6% | 45426 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.1% | 330 |
| hadur117.nano.SanaroB800 0.1 | 2.5 | 13.6% | 3 |
| apc.LeeroyJenkins2 1.0 | 2.5 | 13.6% | 13 |
| TNT.TNT 0.99.1 | 4.0 | 10.7% | 1 |
| josago.Jorgito 0.16 | 5.3 | 9.0% | 0 |
| tj.zombie1n 1.0.1 | 6.2 | 7.7% | 1 |
| css.Delitioner 0.11 | 6.7 | 7.6% | 2 |
| rampancy.Durandal 2.1d | 7.8 | 5.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.1 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.9 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 69.5 | 0 / 35 | 4493 |
| 2 | 3 | 60.3 | 64.8 | 1 / 35 | 4143 |
| 3 | 2 | 62.9 | 72.7 | 0 / 35 | 4714 |
| 4 | 3 | 61.0 | 65.1 | 0 / 35 | 4528 |
| 5 | 2 | 63.5 | 72.7 | 0 / 35 | 4902 |
| 6 | 2 | 61.8 | 67.0 | 1 / 35 | 4802 |
| 7 | 3 | 61.7 | 68.9 | 0 / 35 | 4290 |
| 8 | 2 | 63.7 | 72.7 | 1 / 35 | 4999 |
| 9 | 3 | 60.9 | 65.1 | 0 / 35 | 4553 |
| 10 | 3 | 59.1 | 62.9 | 0 / 35 | 4002 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 104 | 2% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 347 of 350 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 223 | 64% | 225 |
| apc.LeeroyJenkins2 1.0 | 56 | 16% | 57 |
| josago.Jorgito 0.16 | 25 | 7% | 25 |
| TNT.TNT 0.99.1 | 20 | 6% | 20 |
| css.Delitioner 0.11 | 9 | 3% | 9 |
| tj.zombie1n 1.0.1 | 7 | 2% | 8 |
| sp.Nanos.Ember 1.1 | 3 | 1% | 3 |
| rampancy.Durandal 2.1d | 3 | 1% | 3 |
| spin.Bugstard 0.012b | 1 | 0% | 0 |

## Melee bench: F06

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 64.3 | 28 / 350 | 4.22 | 12.3% | 32307 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.3 | 15.8% | 103 |
| origin.SleepSiphon 1.7b | 1.8 | 14.2% | 113 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.4 | 12.7% | 58 |
| hadur117.nano.SanaroB800 0.1 | 3.9 | 12.3% | 28 |
| mld.Wisdom 1.0 | 4.7 | 11.4% | 16 |
| gg.Wolverine 2.0 | 6.2 | 8.7% | 9 |
| DBall.NUKE 0.1 | 7.5 | 7.4% | 9 |
| spinnercat.Omen 1.0 | 7.6 | 7.5% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 8.6 | 6.5% | 8 |
| sample.Fire 1.0 | 10.0 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.3 | 68.3 | 3 / 35 | 3842 |
| 2 | 4 | 57.9 | 63.5 | 5 / 35 | 3188 |
| 3 | 4 | 58.6 | 67.0 | 2 / 35 | 3279 |
| 4 | 5 | 50.2 | 50.5 | 0 / 35 | 2539 |
| 5 | 4 | 57.4 | 66.3 | 1 / 35 | 3002 |
| 6 | 2 | 61.4 | 73.0 | 6 / 35 | 3686 |
| 7 | 5 | 56.5 | 61.6 | 4 / 35 | 2993 |
| 8 | 4 | 57.6 | 64.4 | 3 / 35 | 3133 |
| 9 | 3 | 58.9 | 67.0 | 2 / 35 | 3410 |
| 10 | 5 | 56.2 | 61.0 | 2 / 35 | 3235 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 34 | 18% |
| origin.SleepSiphon 1.7b | 25 | 8% |
| pe.minimelee.SandboxMiniMelee 1.1 | 20 | 35% |
| mld.Wisdom 1.0 | 9 | 56% |
| gg.Wolverine 2.0 | 5 | 80% |
| spinnercat.Omen 1.0 | 4 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 33% |
| DBall.NUKE 0.1 | 1 | 0% |
| sample.Fire 1.0 | 1 | 0% |

Hadur died in 324 of 350 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 98 | 30% | 102 |
| origin.SleepSiphon 1.7b | 76 | 23% | 81 |
| pe.minimelee.SandboxMiniMelee 1.1 | 62 | 19% | 69 |
| mld.Wisdom 1.0 | 43 | 13% | 47 |
| DBall.NUKE 0.1 | 13 | 4% | 14 |
| spinnercat.Omen 1.0 | 12 | 4% | 14 |
| gg.Wolverine 2.0 | 11 | 3% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 2% | 7 |
| sample.Fire 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 78.1 | 54 / 350 | 2.97 | 15.9% | 49918 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.3 | 18.4% | 122 |
| rtk.Tachikoma 1.0 | 1.8 | 18.0% | 124 |
| hadur117.nano.SanaroB800 0.1 | 2.9 | 15.9% | 54 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.8% | 21 |
| franzor.Lizt 1.3.1 | 5.0 | 10.9% | 30 |
| lrem.micro.MoggFanatic 0.2 | 6.1 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.9 | 7.2% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.1% | 0 |
| sample.Target 1.0 | 9.4 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.6 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.4 | 79.4 | 8 / 35 | 4973 |
| 2 | 3 | 66.8 | 79.7 | 4 / 35 | 5349 |
| 3 | 3 | 65.4 | 74.3 | 4 / 35 | 4993 |
| 4 | 3 | 68.0 | 81.9 | 10 / 35 | 5260 |
| 5 | 3 | 67.6 | 79.4 | 8 / 35 | 5508 |
| 6 | 3 | 63.7 | 71.4 | 2 / 35 | 4572 |
| 7 | 3 | 66.8 | 81.6 | 5 / 35 | 4839 |
| 8 | 3 | 64.5 | 75.6 | 3 / 35 | 4562 |
| 9 | 3 | 66.4 | 80.0 | 4 / 35 | 4845 |
| 10 | 3 | 65.8 | 77.5 | 6 / 35 | 5017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 90 | 36% |
| rsalesc.melee.Monk 0.3.6c | 53 | 4% |
| oog.melee.CapuletDroid 1.1 | 21 | 76% |
| franzor.Lizt 1.3.1 | 6 | 50% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 296 of 350 rounds, at a mean tick of 1052. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 150 | 51% | 184 |
| rsalesc.melee.Monk 0.3.6c | 109 | 37% | 113 |
| oog.melee.CapuletDroid 1.1 | 21 | 7% | 36 |
| exauge.GateKeeper 1.1.121g | 7 | 2% | 9 |
| franzor.Lizt 1.3.1 | 4 | 1% | 2 |
| lrem.micro.MoggFanatic 0.2 | 3 | 1% | 3 |
| skm.PateranBotlock2 1.0 | 1 | 0% | 2 |
| drd.Dreadknoght 0.9 | 1 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 67.0 | 64 / 350 | 3.97 | 13.2% | 34602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tm.Yuugao 1.0 | 1.7 | 14.0% | 102 |
| shrub.Vapour v159 | 2.0 | 13.8% | 79 |
| hadur117.nano.SanaroB800 0.1 | 2.3 | 13.2% | 64 |
| Krabb.sliNk.Garm 0.9u | 5.0 | 10.3% | 30 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.8% | 29 |
| m3thos.Eva00 1.1 | 5.9 | 9.3% | 16 |
| jwst.DAD.DarkAndDarker 1.1 | 6.6 | 8.9% | 19 |
| qualidafial.MajorDick 1.0.1 | 8.4 | 7.2% | 5 |
| zyx.nano.BacillusComma 1.0 | 8.7 | 6.9% | 1 |
| SHAM.WOW 1.4 | 9.1 | 6.8% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 67.9 | 6 / 35 | 3367 |
| 2 | 3 | 56.1 | 60.3 | 7 / 35 | 3347 |
| 3 | 2 | 57.9 | 66.7 | 5 / 35 | 3241 |
| 4 | 3 | 57.0 | 62.5 | 6 / 35 | 3286 |
| 5 | 2 | 59.4 | 69.5 | 5 / 35 | 3492 |
| 6 | 2 | 59.6 | 69.2 | 6 / 35 | 3628 |
| 7 | 1 | 59.9 | 70.8 | 8 / 35 | 3628 |
| 8 | 3 | 55.8 | 60.6 | 3 / 35 | 3300 |
| 9 | 2 | 61.4 | 73.0 | 10 / 35 | 3708 |
| 10 | 2 | 59.7 | 68.9 | 8 / 35 | 3605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 42 | 38% |
| shrub.Vapour v159 | 30 | 13% |
| Krabb.sliNk.Garm 0.9u | 23 | 74% |
| com.spp.robocode.MostlyHarmless 010 | 17 | 35% |
| m3thos.Eva00 1.1 | 15 | 53% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 73% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 4 | 25% |

Hadur died in 290 of 350 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 67 | 23% | 85 |
| shrub.Vapour v159 | 57 | 20% | 65 |
| com.spp.robocode.MostlyHarmless 010 | 39 | 13% | 44 |
| Krabb.sliNk.Garm 0.9u | 37 | 13% | 41 |
| m3thos.Eva00 1.1 | 28 | 10% | 32 |
| jwst.DAD.DarkAndDarker 1.1 | 22 | 8% | 35 |
| zyx.nano.BacillusComma 1.0 | 20 | 7% | 23 |
| SHAM.WOW 1.4 | 10 | 3% | 14 |
| qualidafial.MajorDick 1.0.1 | 9 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.2 | 59.5 | 16 / 350 | 4.65 | 11.6% | 31397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.5% | 186 |
| kc.micro.Figment 1.0 | 2.0 | 15.2% | 81 |
| yagami.Tidus 0.11 | 3.9 | 11.5% | 9 |
| hadur117.nano.SanaroB800 0.1 | 3.9 | 11.6% | 16 |
| pedersen.Grishnakh 1.0 | 4.9 | 10.5% | 26 |
| mc2.enemy.Original 0.9 | 5.6 | 9.6% | 20 |
| dft.Calliope 5.6 | 6.7 | 8.6% | 13 |
| step.nanoPri 1.0 | 8.4 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.1 | 5.3% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.1 | 60.6 | 2 / 35 | 3081 |
| 2 | 3 | 56.9 | 61.0 | 2 / 35 | 3109 |
| 3 | 6 | 53.2 | 52.1 | 0 / 35 | 3035 |
| 4 | 3 | 58.8 | 66.0 | 1 / 35 | 3498 |
| 5 | 6 | 52.0 | 49.5 | 1 / 35 | 2785 |
| 6 | 4 | 55.5 | 57.8 | 1 / 35 | 3086 |
| 7 | 4 | 56.1 | 60.0 | 1 / 35 | 3006 |
| 8 | 3 | 58.1 | 63.2 | 4 / 35 | 3382 |
| 9 | 3 | 55.4 | 58.4 | 2 / 35 | 3060 |
| 10 | 3 | 59.2 | 66.0 | 2 / 35 | 3355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 42 | 12% |
| kc.micro.Figment 1.0 | 25 | 24% |
| yagami.Tidus 0.11 | 6 | 67% |
| mc2.enemy.Original 0.9 | 5 | 0% |
| pedersen.Grishnakh 1.0 | 4 | 0% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 334 of 350 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 95 | 28% | 98 |
| kc.micro.Figment 1.0 | 75 | 22% | 80 |
| yagami.Tidus 0.11 | 64 | 19% | 68 |
| mc2.enemy.Original 0.9 | 36 | 11% | 36 |
| pedersen.Grishnakh 1.0 | 30 | 9% | 31 |
| dft.Calliope 5.6 | 12 | 4% | 14 |
| robar.nano.Assertive_Melee 0.2 | 12 | 4% | 12 |
| step.nanoPri 1.0 | 6 | 2% | 7 |
| rdm.Dueler 0.4x | 4 | 1% | 4 |

## Melee bench: F10

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 76.2 | 90 / 350 | 3.14 | 15.2% | 44160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB800 0.1 | 1.4 | 15.2% | 90 |
| DTF.Kludgy 1.2b | 2.1 | 14.7% | 80 |
| ne.Chimera 1.2 | 3.2 | 13.3% | 44 |
| ejb.Polaris 1.0.1 | 3.3 | 13.4% | 60 |
| vStar.RAFzilla 2.15 | 5.4 | 10.7% | 28 |
| tvv.micro.Antares 1.1.1 | 5.6 | 10.4% | 33 |
| sam.Samspin 1.0 | 7.8 | 6.3% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.9 | 6.0% | 1 |
| kurios.DOSexe .9b | 8.6 | 5.5% | 5 |
| donjezza.Muncho 1.0 | 9.7 | 4.5% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 77.8 | 11 / 35 | 4559 |
| 2 | 1 | 65.2 | 80.6 | 13 / 35 | 4692 |
| 3 | 2 | 62.8 | 74.6 | 8 / 35 | 4522 |
| 4 | 1 | 61.6 | 75.2 | 6 / 35 | 4203 |
| 5 | 1 | 66.3 | 85.7 | 12 / 35 | 4769 |
| 6 | 1 | 64.1 | 79.0 | 9 / 35 | 4488 |
| 7 | 1 | 64.3 | 78.7 | 9 / 35 | 4544 |
| 8 | 1 | 63.3 | 75.9 | 12 / 35 | 4159 |
| 9 | 3 | 58.0 | 62.9 | 3 / 35 | 4049 |
| 10 | 2 | 61.3 | 71.4 | 7 / 35 | 4175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 50 | 58% |
| DTF.Kludgy 1.2b | 48 | 42% |
| vStar.RAFzilla 2.15 | 30 | 57% |
| ne.Chimera 1.2 | 23 | 35% |
| tvv.micro.Antares 1.1.1 | 17 | 47% |
| kurios.DOSexe .9b | 5 | 80% |
| donjezza.Muncho 1.0 | 3 | 67% |
| sam.Samspin 1.0 | 3 | 33% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 263 of 350 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 82 | 31% | 102 |
| ne.Chimera 1.2 | 65 | 25% | 78 |
| ejb.Polaris 1.0.1 | 38 | 14% | 69 |
| vStar.RAFzilla 2.15 | 29 | 11% | 40 |
| tvv.micro.Antares 1.1.1 | 19 | 7% | 21 |
| sam.Samspin 1.0 | 12 | 5% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 9 | 3% | 10 |
| kurios.DOSexe .9b | 4 | 2% | 9 |
| donjezza.Muncho 1.0 | 4 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.7 | 61.2 | 28 / 350 | 4.49 | 12.0% | 32838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.7% | 170 |
| cx.mini.Nimrod 0.55 | 2.6 | 12.2% | 38 |
| hadur117.nano.SanaroB800 0.1 | 2.8 | 12.0% | 28 |
| djc.DynaBot 0.1.1 | 3.7 | 11.4% | 36 |
| br2.MobyDickBot 1.6 | 5.4 | 10.1% | 26 |
| rdt199.Warlord 0.73 | 6.1 | 9.4% | 21 |
| uji.YellohFellah 1.0 | 6.8 | 8.9% | 28 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.7% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 9.1 | 5.6% | 1 |
| stelo.MirrorNano 1.3 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.3 | 63.5 | 6 / 35 | 3434 |
| 2 | 2 | 58.1 | 62.9 | 4 / 35 | 3606 |
| 3 | 3 | 57.9 | 64.4 | 2 / 35 | 3337 |
| 4 | 4 | 55.5 | 59.0 | 0 / 35 | 3307 |
| 5 | 2 | 58.9 | 67.9 | 2 / 35 | 3410 |
| 6 | 3 | 56.2 | 59.0 | 5 / 35 | 3055 |
| 7 | 3 | 55.5 | 58.4 | 1 / 35 | 3179 |
| 8 | 2 | 57.1 | 61.0 | 4 / 35 | 3555 |
| 9 | 4 | 54.5 | 55.2 | 3 / 35 | 3206 |
| 10 | 3 | 54.7 | 60.6 | 1 / 35 | 2749 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 47 | 15% |
| cx.mini.Nimrod 0.55 | 15 | 33% |
| uji.YellohFellah 1.0 | 11 | 9% |
| rdt199.Warlord 0.73 | 8 | 63% |
| djc.DynaBot 0.1.1 | 8 | 75% |
| br2.MobyDickBot 1.6 | 5 | 40% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |

Hadur died in 322 of 350 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 116 | 36% | 126 |
| cx.mini.Nimrod 0.55 | 66 | 20% | 71 |
| djc.DynaBot 0.1.1 | 29 | 9% | 34 |
| rdt199.Warlord 0.73 | 27 | 8% | 30 |
| KiraNL.Chupacabra 0.4 | 24 | 7% | 26 |
| br2.MobyDickBot 1.6 | 21 | 7% | 22 |
| uji.YellohFellah 1.0 | 20 | 6% | 22 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 3% | 11 |
| stelo.MirrorNano 1.3 | 8 | 2% | 8 |

## Melee bench: F12

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 65.0 | 39 / 350 | 4.15 | 12.7% | 32260 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.8 | 14.6% | 98 |
| nat.PallasHawk 1.0 | 2.0 | 14.4% | 105 |
| darkcanuck.Leon 1.01 | 3.0 | 13.0% | 62 |
| hadur117.nano.SanaroB800 0.1 | 3.6 | 12.7% | 39 |
| brainfade.melee.Genghis 0.36 | 4.7 | 10.9% | 24 |
| jrm.Test0 1.0 | 6.7 | 8.1% | 4 |
| jp.Perpy 16.0 | 6.8 | 7.8% | 7 |
| cs.sheldor.Talon 1.1 | 7.8 | 7.0% | 0 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.9% | 10 |
| stuff.Vlad 0.1 | 9.6 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.5 | 62.2 | 4 / 35 | 3076 |
| 2 | 4 | 57.2 | 65.1 | 2 / 35 | 2861 |
| 3 | 6 | 52.7 | 52.4 | 2 / 35 | 2893 |
| 4 | 3 | 58.0 | 65.1 | 4 / 35 | 3245 |
| 5 | 4 | 59.4 | 69.8 | 4 / 35 | 3092 |
| 6 | 3 | 60.4 | 69.5 | 4 / 35 | 3647 |
| 7 | 4 | 56.4 | 61.9 | 2 / 35 | 2921 |
| 8 | 1 | 61.6 | 72.4 | 5 / 35 | 3861 |
| 9 | 2 | 60.8 | 69.2 | 8 / 35 | 3574 |
| 10 | 4 | 57.4 | 62.9 | 4 / 35 | 3090 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 38 | 18% |
| bts.wiki.RipCurl 0.9b | 38 | 29% |
| darkcanuck.Leon 1.01 | 31 | 23% |
| brainfade.melee.Genghis 0.36 | 12 | 58% |
| jaybot.bots.Oddball 4.0 | 4 | 25% |
| jrm.Test0 1.0 | 4 | 100% |
| jp.Perpy 16.0 | 3 | 33% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 0% |

Hadur died in 312 of 350 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 84 | 27% | 91 |
| bts.wiki.RipCurl 0.9b | 71 | 23% | 80 |
| darkcanuck.Leon 1.01 | 60 | 19% | 71 |
| brainfade.melee.Genghis 0.36 | 35 | 11% | 41 |
| jp.Perpy 16.0 | 22 | 7% | 24 |
| jrm.Test0 1.0 | 17 | 5% | 16 |
| cs.sheldor.Talon 1.1 | 12 | 4% | 16 |
| stuff.Vlad 0.1 | 7 | 2% | 7 |
| jaybot.bots.Oddball 4.0 | 4 | 1% | 4 |

## Melee bench: F13

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 69.2 | 21 / 350 | 3.77 | 12.8% | 33969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.4% | 177 |
| ags.Glacier 0.2.11 | 1.6 | 17.0% | 97 |
| hadur117.nano.SanaroB800 0.1 | 3.5 | 12.8% | 21 |
| shinh.Entangled 0.3 | 4.2 | 12.2% | 30 |
| gh.micro.Gruweltje 0.7 | 4.3 | 12.1% | 21 |
| apc.Colossus2 0.17 | 6.1 | 8.1% | 0 |
| stelo.Wang 1.0 | 6.9 | 7.0% | 4 |
| ayk.WallHugger 1.0 | 8.2 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.4 | 66.3 | 3 / 35 | 3263 |
| 2 | 3 | 60.9 | 75.6 | 1 / 35 | 3268 |
| 3 | 3 | 59.9 | 67.9 | 2 / 35 | 3751 |
| 4 | 4 | 60.0 | 67.6 | 5 / 35 | 3582 |
| 5 | 3 | 59.0 | 66.7 | 1 / 35 | 3426 |
| 6 | 4 | 59.3 | 67.9 | 3 / 35 | 3469 |
| 7 | 3 | 61.1 | 74.6 | 3 / 35 | 3513 |
| 8 | 4 | 59.7 | 71.1 | 0 / 35 | 3050 |
| 9 | 3 | 59.1 | 68.6 | 0 / 35 | 3347 |
| 10 | 5 | 58.4 | 65.7 | 3 / 35 | 3300 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 57 | 12% |
| ags.Glacier 0.2.11 | 45 | 20% |
| shinh.Entangled 0.3 | 10 | 30% |
| gh.micro.Gruweltje 0.7 | 6 | 0% |
| stelo.Wang 1.0 | 2 | 50% |

Hadur died in 329 of 350 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 102 | 31% | 109 |
| ags.Glacier 0.2.11 | 100 | 30% | 110 |
| gh.micro.Gruweltje 0.7 | 44 | 13% | 44 |
| shinh.Entangled 0.3 | 36 | 11% | 39 |
| stelo.Wang 1.0 | 27 | 8% | 28 |
| apc.Colossus2 0.17 | 10 | 3% | 10 |
| ayk.WallHugger 1.0 | 7 | 2% | 7 |
| maribo.FollowFire 1 | 2 | 1% | 2 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 73.9 | 70 / 350 | 3.35 | 14.2% | 36274 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.1 | 17.4% | 149 |
| hadur117.nano.SanaroB800 0.1 | 2.1 | 14.2% | 70 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.4% | 61 |
| co.edu.usb.rc.LidisTron 1.0 | 4.7 | 10.3% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 10.2% | 4 |
| Lo_Ian.Gandalf_V4 4.0 | 5.9 | 9.8% | 13 |
| sanyi.mikrobi.Roberto 1.0 | 6.7 | 9.2% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 9.0% | 31 |
| pa.Improved 1.0 | 9.0 | 5.4% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 66.7 | 5 / 35 | 3328 |
| 2 | 2 | 62.6 | 78.7 | 5 / 35 | 3691 |
| 3 | 2 | 64.3 | 79.4 | 11 / 35 | 3822 |
| 4 | 2 | 62.3 | 76.5 | 8 / 35 | 3591 |
| 5 | 2 | 61.6 | 74.3 | 7 / 35 | 3606 |
| 6 | 2 | 62.7 | 76.8 | 9 / 35 | 3593 |
| 7 | 1 | 62.9 | 75.2 | 10 / 35 | 4023 |
| 8 | 2 | 61.9 | 73.7 | 9 / 35 | 3574 |
| 9 | 2 | 60.6 | 71.4 | 5 / 35 | 3533 |
| 10 | 3 | 59.0 | 66.7 | 1 / 35 | 3513 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 82 | 28% |
| catcat20.shape.Theta 0.018 | 35 | 51% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 43% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 67% |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 38% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 60% |
| sample.TrackFire 1.0 | 1 | 0% |

Hadur died in 281 of 350 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 136 | 48% | 161 |
| catcat20.shape.Theta 0.018 | 44 | 16% | 56 |
| sanyi.mikrobi.Roberto 1.0 | 26 | 9% | 39 |
| sheldor.micro.PointInLineRRAL 1.0 | 25 | 9% | 31 |
| dmh.robocode.robot.RedDwarf 0.4 | 20 | 7% | 21 |
| Lo_Ian.Gandalf_V4 4.0 | 17 | 6% | 21 |
| co.edu.usb.rc.LidisTron 1.0 | 7 | 2% | 11 |
| pa.Improved 1.0 | 4 | 1% | 4 |
| sample.TrackFire 1.0 | 2 | 1% | 2 |

## Melee bench: F15

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 59.9 | 30 / 350 | 4.61 | 12.1% | 36960 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.2 | 15.4% | 95 |
| emp.Yngwie 1.11 | 2.1 | 13.9% | 110 |
| mld.DustBunny 3.8 | 3.3 | 12.8% | 37 |
| hadur117.nano.SanaroB800 0.1 | 4.2 | 12.1% | 30 |
| cb.nano.Insomnia 1.0 | 4.5 | 11.6% | 25 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.5% | 49 |
| Grystrion.TrackerWO 1.0 | 7.3 | 7.3% | 4 |
| lambdaxy.TBot 0.1 | 7.7 | 6.6% | 0 |
| divineomega.TrialBot 0.003 | 9.1 | 5.4% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 66.3 | 4 / 35 | 4408 |
| 2 | 4 | 57.9 | 61.9 | 1 / 35 | 3995 |
| 3 | 4 | 55.4 | 55.9 | 3 / 35 | 3735 |
| 4 | 5 | 55.4 | 55.6 | 3 / 35 | 3505 |
| 5 | 4 | 57.1 | 61.0 | 3 / 35 | 3483 |
| 6 | 4 | 58.6 | 61.9 | 3 / 35 | 3878 |
| 7 | 5 | 55.7 | 58.7 | 2 / 35 | 3163 |
| 8 | 3 | 57.8 | 64.8 | 4 / 35 | 3227 |
| 9 | 5 | 57.8 | 58.7 | 4 / 35 | 3933 |
| 10 | 6 | 54.9 | 54.0 | 3 / 35 | 3633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 20 | 30% |
| emp.Yngwie 1.11 | 16 | 19% |
| kawigi.robot.Girl 1.2 | 15 | 60% |
| cb.nano.Insomnia 1.0 | 13 | 62% |
| mld.DustBunny 3.8 | 12 | 8% |
| divineomega.TrialBot 0.003 | 2 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 0% |

Hadur died in 322 of 350 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 74 | 23% | 81 |
| mld.DustBunny 3.8 | 64 | 20% | 66 |
| kawigi.micro.Shiz 1.1 | 63 | 20% | 69 |
| cb.nano.Insomnia 1.0 | 55 | 17% | 50 |
| kawigi.robot.Girl 1.2 | 35 | 11% | 45 |
| Grystrion.TrackerWO 1.0 | 14 | 4% | 14 |
| lambdaxy.TBot 0.1 | 7 | 2% | 8 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 6 | 2% | 6 |
| divineomega.TrialBot 0.003 | 4 | 1% | 11 |

## Melee bench: F16

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 61.3 | 24 / 350 | 4.48 | 12.8% | 41969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.1 | 17.5% | 164 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.0 | 15.7% | 44 |
| hadur117.nano.SanaroB800 0.1 | 3.0 | 12.8% | 24 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 11.0% | 72 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.7% | 8 |
| tvv.nano.Polaris 1.2 | 5.6 | 9.6% | 17 |
| stelo.IntrinsicVolatility 1.4 | 6.6 | 8.1% | 13 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.5% | 5 |
| repositorio.NanoStep 1.0 | 9.1 | 5.3% | 2 |
| asd.Cthulhu 1.3 | 9.2 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.7 | 60.3 | 0 / 35 | 3819 |
| 2 | 3 | 59.9 | 65.1 | 1 / 35 | 4099 |
| 3 | 3 | 59.1 | 62.5 | 4 / 35 | 4069 |
| 4 | 2 | 63.0 | 70.2 | 7 / 35 | 4554 |
| 5 | 3 | 58.2 | 60.3 | 2 / 35 | 4025 |
| 6 | 3 | 59.3 | 64.1 | 2 / 35 | 4259 |
| 7 | 3 | 59.5 | 60.6 | 3 / 35 | 4426 |
| 8 | 3 | 57.7 | 56.5 | 2 / 35 | 4269 |
| 9 | 3 | 58.3 | 61.0 | 0 / 35 | 4388 |
| 10 | 4 | 55.6 | 52.4 | 3 / 35 | 4061 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 60 | 3% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 39% |
| techdude.forest.FlamingForest 1.1 | 11 | 18% |
| tvv.nano.Polaris 1.2 | 6 | 83% |
| bvh.fnr.Fenrir 0.36l | 3 | 100% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |
| stelo.IntrinsicVolatility 1.4 | 2 | 50% |

Hadur died in 326 of 350 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 126 | 39% | 131 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 76 | 23% | 83 |
| bvh.fnr.Fenrir 0.36l | 51 | 16% | 52 |
| techdude.forest.FlamingForest 1.1 | 30 | 9% | 33 |
| stelo.IntrinsicVolatility 1.4 | 13 | 4% | 15 |
| tvv.nano.Polaris 1.2 | 10 | 3% | 11 |
| divineomega.DivineBot 1.9.4.5 | 9 | 3% | 12 |
| asd.Cthulhu 1.3 | 7 | 2% | 9 |
| repositorio.NanoStep 1.0 | 4 | 1% | 4 |

## Melee bench: F17

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 63.6 | 43 / 350 | 4.28 | 13.1% | 41562 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.8 | 14.2% | 74 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.5% | 84 |
| cx.BlestPain 1.41 | 2.9 | 13.1% | 76 |
| hadur117.nano.SanaroB800 0.1 | 3.3 | 13.1% | 43 |
| nic.Nicator 2.4 | 5.1 | 11.6% | 33 |
| ahf.NanoAndrew .4 | 5.3 | 11.0% | 34 |
| maribo.melee.BMV 0.1 | 6.9 | 9.2% | 4 |
| tex.Longbot 0.4 | 8.5 | 5.6% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.5% | 3 |
| goblin.Bender 2.4 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 66.7 | 4 / 35 | 4413 |
| 2 | 4 | 58.3 | 62.9 | 1 / 35 | 4083 |
| 3 | 3 | 60.9 | 67.6 | 5 / 35 | 4141 |
| 4 | 3 | 58.9 | 61.9 | 4 / 35 | 3996 |
| 5 | 4 | 59.6 | 63.2 | 4 / 35 | 4155 |
| 6 | 2 | 62.3 | 70.8 | 6 / 35 | 4594 |
| 7 | 5 | 57.0 | 54.6 | 5 / 35 | 4226 |
| 8 | 4 | 58.0 | 61.6 | 1 / 35 | 3854 |
| 9 | 2 | 58.7 | 62.2 | 6 / 35 | 4009 |
| 10 | 3 | 59.9 | 64.1 | 7 / 35 | 4091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 35 | 14% |
| cx.BlestPain 1.41 | 29 | 59% |
| oog.melee.Mercutio 1.0 | 29 | 28% |
| nic.Nicator 2.4 | 10 | 50% |
| ahf.NanoAndrew .4 | 7 | 29% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| goblin.Bender 2.4 | 1 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 307 of 350 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 72 | 23% | 75 |
| cx.BlestPain 1.41 | 56 | 18% | 74 |
| oog.melee.Mercutio 1.0 | 53 | 17% | 62 |
| nic.Nicator 2.4 | 43 | 14% | 48 |
| ahf.NanoAndrew .4 | 40 | 13% | 45 |
| maribo.melee.BMV 0.1 | 20 | 7% | 22 |
| tex.Longbot 0.4 | 11 | 4% | 11 |
| edu.otg.spr.TheTeacher 1.2 | 10 | 3% | 11 |
| goblin.Bender 2.4 | 2 | 1% | 2 |

## Melee bench: F18

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 63.8 | 52 / 350 | 4.26 | 12.8% | 35434 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.5 | 13.9% | 86 |
| hadur117.nano.SanaroB800 0.1 | 2.4 | 12.8% | 52 |
| agd.Mooserwirt2 2.7 | 3.3 | 12.1% | 63 |
| uji.DBH 1.1 | 3.7 | 11.7% | 41 |
| spinnercat.Robovirus 2.718 | 4.9 | 11.0% | 37 |
| ratosh.Nobo 0.21 | 5.7 | 10.4% | 19 |
| sigterm.Sigterm 1.0 | 6.5 | 9.0% | 26 |
| kawigi.mini.Fhqwhgads 1.1 | 8.2 | 7.5% | 9 |
| stelo.WangRobot 1.0 | 9.1 | 6.1% | 15 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.5 | 61.3 | 7 / 35 | 3585 |
| 2 | 3 | 58.0 | 61.9 | 7 / 35 | 3891 |
| 3 | 3 | 56.1 | 58.4 | 3 / 35 | 3562 |
| 4 | 3 | 56.1 | 61.3 | 3 / 35 | 3335 |
| 5 | 2 | 60.7 | 71.1 | 6 / 35 | 3818 |
| 6 | 1 | 59.7 | 67.9 | 9 / 35 | 3497 |
| 7 | 2 | 59.2 | 67.0 | 6 / 35 | 3662 |
| 8 | 3 | 56.0 | 61.3 | 5 / 35 | 3052 |
| 9 | 2 | 57.4 | 64.4 | 4 / 35 | 3413 |
| 10 | 2 | 57.3 | 63.2 | 2 / 35 | 3619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 41 | 46% |
| uji.DBH 1.1 | 23 | 39% |
| spinnercat.Robovirus 2.718 | 21 | 43% |
| sigterm.Sigterm 1.0 | 14 | 50% |
| agd.Mooserwirt2 2.7 | 14 | 21% |
| ratosh.Nobo 0.21 | 6 | 50% |
| stelo.WangRobot 1.0 | 6 | 17% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 33% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 0% |

Hadur died in 300 of 350 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 83 | 28% | 102 |
| agd.Mooserwirt2 2.7 | 48 | 16% | 55 |
| uji.DBH 1.1 | 41 | 14% | 46 |
| ratosh.Nobo 0.21 | 32 | 11% | 33 |
| spinnercat.Robovirus 2.718 | 30 | 10% | 34 |
| stelo.WangRobot 1.0 | 23 | 8% | 24 |
| kawigi.mini.Fhqwhgads 1.1 | 20 | 7% | 24 |
| sigterm.Sigterm 1.0 | 14 | 5% | 21 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9 | 3% | 11 |

## Melee bench: F19

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 78.1 | 67 / 350 | 2.97 | 15.4% | 41503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.5 | 16.5% | 113 |
| mld.Infinity 2.2 | 2.2 | 16.0% | 128 |
| hadur117.nano.SanaroB800 0.1 | 2.3 | 15.4% | 67 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.4% | 17 |
| erdnis.Rover 0.3 | 5.0 | 10.6% | 8 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.8% | 9 |
| mbh.Mbh 0.1 | 7.4 | 7.2% | 0 |
| pac.ABC 2.1 | 7.6 | 7.1% | 8 |
| pbg.R2D2 1.0 | 8.7 | 6.0% | 1 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.4 | 74.0 | 3 / 35 | 3614 |
| 2 | 2 | 63.5 | 74.6 | 7 / 35 | 4272 |
| 3 | 2 | 64.1 | 76.5 | 8 / 35 | 4047 |
| 4 | 2 | 65.8 | 82.9 | 7 / 35 | 4456 |
| 5 | 2 | 65.0 | 77.8 | 5 / 35 | 4644 |
| 6 | 2 | 65.1 | 79.7 | 6 / 35 | 4358 |
| 7 | 3 | 64.4 | 76.8 | 8 / 35 | 4126 |
| 8 | 1 | 66.6 | 85.4 | 10 / 35 | 4244 |
| 9 | 3 | 63.3 | 76.5 | 5 / 35 | 3647 |
| 10 | 3 | 64.4 | 76.8 | 8 / 35 | 4095 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 70 | 14% |
| mld.Infinity 2.2 | 65 | 38% |
| krillr.mini.JointStrike 2.0.0 | 19 | 74% |
| patson.PatsonTestBot 1.0 | 11 | 45% |
| erdnis.Rover 0.3 | 8 | 50% |
| pac.ABC 2.1 | 5 | 60% |
| mbh.Mbh 0.1 | 4 | 100% |
| pbg.R2D2 1.0 | 2 | 50% |

Hadur died in 286 of 350 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 130 | 45% | 163 |
| mld.Infinity 2.2 | 63 | 22% | 33 |
| krillr.mini.JointStrike 2.0.0 | 32 | 11% | 48 |
| erdnis.Rover 0.3 | 19 | 7% | 30 |
| patson.PatsonTestBot 1.0 | 17 | 6% | 36 |
| pbg.R2D2 1.0 | 13 | 5% | 16 |
| pac.ABC 2.1 | 8 | 3% | 15 |
| mbh.Mbh 0.1 | 3 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 67.5 | 43 / 350 | 3.92 | 13.5% | 38211 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.8% | 166 |
| hadur117.nano.SanaroB800 0.1 | 2.4 | 13.5% | 43 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 12.0% | 30 |
| fwb.Nine 1.0.1 | 3.9 | 11.4% | 39 |
| catcat20.Rabbit 0.001 | 4.8 | 10.4% | 32 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.7% | 13 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 8.9% | 12 |
| bayen.nut.Squirrel 1.615 | 7.7 | 7.7% | 12 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 4.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.1 | 69.2 | 5 / 35 | 3712 |
| 2 | 3 | 57.7 | 61.6 | 3 / 35 | 3763 |
| 3 | 2 | 59.4 | 67.0 | 3 / 35 | 3742 |
| 4 | 2 | 60.2 | 68.9 | 3 / 35 | 4121 |
| 5 | 2 | 60.3 | 68.9 | 6 / 35 | 3784 |
| 6 | 3 | 60.2 | 66.3 | 5 / 35 | 3889 |
| 7 | 2 | 61.3 | 69.8 | 6 / 35 | 3797 |
| 8 | 4 | 56.8 | 61.3 | 2 / 35 | 3372 |
| 9 | 2 | 61.7 | 72.4 | 4 / 35 | 4165 |
| 10 | 2 | 60.9 | 69.8 | 6 / 35 | 3866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 63 | 25% |
| fwb.Nine 1.0.1 | 18 | 56% |
| catcat20.Rabbit 0.001 | 15 | 73% |
| nz.jdc.nano.GridFu 1.0 | 9 | 22% |
| djdjdj.NanoSkunk10 1.0 | 7 | 29% |
| m3thos.mini.Eva01 0.5.5 | 5 | 20% |
| bayen.nut.Squirrel 1.615 | 2 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% |

Hadur died in 307 of 350 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 146 | 48% | 158 |
| nz.jdc.nano.GridFu 1.0 | 46 | 15% | 52 |
| fwb.Nine 1.0.1 | 39 | 13% | 40 |
| bayen.nut.Squirrel 1.615 | 19 | 6% | 20 |
| catcat20.Rabbit 0.001 | 18 | 6% | 28 |
| m3thos.mini.Eva01 0.5.5 | 15 | 5% | 20 |
| djdjdj.NanoSkunk10 1.0 | 13 | 4% | 15 |
| sample.MyFirstJuniorRobot 1.0 | 7 | 2% | 12 |
| ntc.ControlledChaos 1.1.4 | 4 | 1% | 4 |

## Melee bench: F21

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 78.1 | 83 / 350 | 2.97 | 16.3% | 48841 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.2 | 17.3% | 181 |
| hadur117.nano.SanaroB800 0.1 | 1.9 | 16.3% | 83 |
| dummy.mini.Scimitar 1.01 | 2.9 | 15.1% | 36 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 23 |
| oa.weak.BotherBot 0.1 | 5.5 | 9.1% | 8 |
| eld.Hmm 1.0 | 5.6 | 8.6% | 20 |
| fire219.CatBot 1.0 | 7.8 | 6.0% | 0 |
| el.JumpShoot 0.2 | 8.0 | 5.9% | 2 |
| PSW.Relentless 0.1 | 8.1 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 80.3 | 8 / 35 | 5068 |
| 2 | 1 | 66.3 | 80.0 | 12 / 35 | 5029 |
| 3 | 1 | 66.7 | 84.1 | 10 / 35 | 4922 |
| 4 | 3 | 63.0 | 72.1 | 5 / 35 | 4561 |
| 5 | 2 | 64.4 | 75.9 | 10 / 35 | 4569 |
| 6 | 2 | 64.5 | 75.2 | 8 / 35 | 4874 |
| 7 | 2 | 65.7 | 78.1 | 6 / 35 | 4914 |
| 8 | 2 | 65.8 | 76.8 | 9 / 35 | 5309 |
| 9 | 2 | 66.5 | 81.6 | 8 / 35 | 5175 |
| 10 | 2 | 64.2 | 76.8 | 7 / 35 | 4420 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 91 | 41% |
| dummy.mini.Scimitar 1.01 | 36 | 83% |
| cf.RiO.RiOx 4.2.1 | 17 | 35% |
| eld.Hmm 1.0 | 11 | 36% |
| oa.weak.BotherBot 0.1 | 5 | 20% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 267 of 350 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 107 | 40% | 129 |
| dummy.mini.Scimitar 1.01 | 75 | 28% | 113 |
| cf.RiO.RiOx 4.2.1 | 43 | 16% | 47 |
| oa.weak.BotherBot 0.1 | 17 | 6% | 20 |
| eld.Hmm 1.0 | 15 | 6% | 26 |
| el.JumpShoot 0.2 | 5 | 2% | 8 |
| fire219.CatBot 1.0 | 3 | 1% | 3 |
| arthord.MannyPacquiao Beta | 1 | 0% | 3 |
| PSW.Relentless 0.1 | 1 | 0% | 1 |

## Melee bench: F23

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 75.9 | 64 / 350 | 3.17 | 15.0% | 40398 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.1 | 18.2% | 161 |
| hadur117.nano.SanaroB800 0.1 | 2.5 | 15.0% | 64 |
| cre.Karolos 0.32 | 2.5 | 14.9% | 70 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.3% | 21 |
| stelo.RamTrackSurfer 1.2 | 5.9 | 9.5% | 16 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 9.4% | 6 |
| sample.Walls 1.0 | 6.2 | 9.0% | 13 |
| cw.megas.Blade 0.8 | 7.8 | 8.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.1 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 77.5 | 11 / 35 | 4491 |
| 2 | 2 | 64.5 | 79.0 | 7 / 35 | 3985 |
| 3 | 2 | 63.8 | 73.7 | 6 / 35 | 4142 |
| 4 | 3 | 62.0 | 71.1 | 3 / 35 | 4087 |
| 5 | 3 | 63.0 | 73.0 | 7 / 35 | 3968 |
| 6 | 3 | 65.5 | 80.0 | 7 / 35 | 4034 |
| 7 | 2 | 62.8 | 74.9 | 4 / 35 | 3649 |
| 8 | 3 | 64.7 | 77.1 | 8 / 35 | 4046 |
| 9 | 2 | 65.9 | 81.9 | 7 / 35 | 4110 |
| 10 | 3 | 62.3 | 71.1 | 4 / 35 | 3886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 93 | 31% |
| cre.Karolos 0.32 | 43 | 30% |
| stelo.AreaTargetingBot 1.1 | 19 | 53% |
| sample.Walls 1.0 | 10 | 60% |
| stelo.RamTrackSurfer 1.2 | 9 | 11% |
| cw.megas.Blade 0.8 | 3 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 100% |

Hadur died in 287 of 350 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 129 | 45% | 163 |
| cre.Karolos 0.32 | 74 | 26% | 87 |
| stelo.AreaTargetingBot 1.1 | 36 | 13% | 42 |
| stelo.RamTrackSurfer 1.2 | 18 | 6% | 22 |
| sample.Walls 1.0 | 13 | 5% | 15 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 3% | 11 |
| cw.megas.Blade 0.8 | 7 | 2% | 9 |
1 death(s) with no robot to name.

## Melee bench: F24

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.7 | 57.9 | 24 / 350 | 4.79 | 11.2% | 29541 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.6 | 14.8% | 85 |
| florent.XSeries.X2 0.12 | 2.6 | 13.7% | 69 |
| davidalves.Phoenix 0.54 | 2.6 | 13.4% | 97 |
| pedersen.Ugluk 1.1.1 | 3.6 | 12.5% | 47 |
| hadur117.nano.SanaroB800 0.1 | 4.7 | 11.2% | 24 |
| oog.melee.Corsair 1.0 | 6.0 | 9.7% | 12 |
| stelo.SoJNanoMelee 1.1 | 6.9 | 8.5% | 17 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.5% | 0 |
| evd.X1 0.01 | 9.4 | 4.9% | 0 |
| as.FrankTheTank 1.3 | 9.4 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.0 | 54.9 | 1 / 35 | 2691 |
| 2 | 5 | 52.5 | 53.0 | 1 / 35 | 2670 |
| 3 | 6 | 51.6 | 51.7 | 1 / 35 | 2655 |
| 4 | 5 | 55.2 | 59.0 | 2 / 35 | 2884 |
| 5 | 5 | 54.8 | 56.8 | 3 / 35 | 3195 |
| 6 | 4 | 57.8 | 64.4 | 3 / 35 | 3361 |
| 7 | 3 | 59.2 | 67.6 | 5 / 35 | 3238 |
| 8 | 4 | 55.8 | 60.0 | 3 / 35 | 3077 |
| 9 | 5 | 52.9 | 53.0 | 2 / 35 | 2910 |
| 10 | 5 | 54.8 | 58.7 | 3 / 35 | 2860 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 18 | 44% |
| florent.XSeries.X2 0.12 | 16 | 25% |
| davidalves.Phoenix 0.54 | 16 | 19% |
| pedersen.Ugluk 1.1.1 | 15 | 40% |
| stelo.SoJNanoMelee 1.1 | 6 | 17% |
| oog.melee.Corsair 1.0 | 5 | 40% |

Hadur died in 328 of 350 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 72 | 22% | 74 |
| davidalves.Phoenix 0.54 | 66 | 20% | 68 |
| pedersen.Ugluk 1.1.1 | 64 | 20% | 68 |
| rz.GlowBlowMelee 1.4 | 63 | 19% | 70 |
| stelo.SoJNanoMelee 1.1 | 21 | 6% | 21 |
| oog.melee.Corsair 1.0 | 20 | 6% | 26 |
| lunchie.Lunchbox 0.93 | 14 | 4% | 15 |
| as.FrankTheTank 1.3 | 5 | 2% | 6 |
| evd.X1 0.01 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 63.4 | 38 / 350 | 4.29 | 12.4% | 30330 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.5 | 14.3% | 72 |
| voidious.micro.BlitzBat 1.05 | 1.9 | 13.9% | 76 |
| hadur117.nano.SanaroB800 0.1 | 3.4 | 12.4% | 38 |
| jdw.Hurricane 1.4 | 3.8 | 11.8% | 55 |
| gre.svman4.Morfeas 1.4.1 | 4.8 | 11.1% | 42 |
| ds.Oo 2.2 | 6.0 | 9.4% | 29 |
| gjr.Cephalosporin 0.1 | 6.9 | 8.8% | 24 |
| awesomeness.Elite 1.0 | 8.0 | 7.3% | 6 |
| adt.Ar2 1.1 | 8.8 | 6.4% | 10 |
| amk.ChumbaMini 0.2 | 9.9 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.9 | 56.5 | 5 / 35 | 3209 |
| 2 | 5 | 55.2 | 57.1 | 3 / 35 | 2935 |
| 3 | 3 | 57.7 | 64.4 | 4 / 35 | 3004 |
| 4 | 2 | 58.9 | 68.9 | 4 / 35 | 3162 |
| 5 | 3 | 60.5 | 70.2 | 6 / 35 | 3293 |
| 6 | 3 | 57.0 | 64.1 | 5 / 35 | 2760 |
| 7 | 2 | 59.0 | 69.5 | 3 / 35 | 3039 |
| 8 | 4 | 56.8 | 62.2 | 4 / 35 | 2970 |
| 9 | 4 | 55.5 | 59.7 | 3 / 35 | 2963 |
| 10 | 3 | 56.1 | 61.6 | 1 / 35 | 2995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 36 | 17% |
| voidious.mini.BrokenSword 2.0.3 | 31 | 19% |
| jdw.Hurricane 1.4 | 16 | 63% |
| gre.svman4.Morfeas 1.4.1 | 13 | 62% |
| ds.Oo 2.2 | 10 | 20% |
| gjr.Cephalosporin 0.1 | 8 | 25% |
| adt.Ar2 1.1 | 5 | 40% |
| amk.ChumbaMini 0.2 | 1 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |

Hadur died in 312 of 350 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 80 | 26% | 89 |
| voidious.micro.BlitzBat 1.05 | 72 | 23% | 76 |
| jdw.Hurricane 1.4 | 58 | 19% | 65 |
| gre.svman4.Morfeas 1.4.1 | 29 | 9% | 39 |
| ds.Oo 2.2 | 22 | 7% | 23 |
| adt.Ar2 1.1 | 20 | 6% | 22 |
| gjr.Cephalosporin 0.1 | 17 | 5% | 20 |
| awesomeness.Elite 1.0 | 11 | 4% | 11 |
| amk.ChumbaMini 0.2 | 3 | 1% | 4 |

## Melee bench: F26

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 66.5 | 30 / 350 | 4.01 | 13.1% | 41118 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.2% | 134 |
| shu.nitro.LENIN .T34 | 2.7 | 13.5% | 76 |
| hadur117.nano.SanaroB800 0.1 | 2.9 | 13.1% | 30 |
| lrem.Spectre 0.4.4 | 3.6 | 12.5% | 53 |
| gh.mini.GrubbmOne 1.0 | 5.3 | 11.0% | 14 |
| js.PinBall 1.6 | 5.7 | 11.0% | 23 |
| jaybot.adv.bots.JayBot 2.0 | 6.8 | 9.4% | 14 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.7% | 8 |
| sample.SpinBot 1.0 | 8.9 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.5 | 65.1 | 4 / 35 | 4190 |
| 2 | 2 | 61.6 | 71.4 | 3 / 35 | 4118 |
| 3 | 3 | 59.6 | 64.4 | 2 / 35 | 4120 |
| 4 | 4 | 58.3 | 61.3 | 2 / 35 | 4289 |
| 5 | 4 | 56.9 | 62.2 | 0 / 35 | 3517 |
| 6 | 3 | 60.2 | 65.4 | 2 / 35 | 4182 |
| 7 | 3 | 61.3 | 70.5 | 2 / 35 | 4355 |
| 8 | 3 | 59.0 | 64.1 | 3 / 35 | 3793 |
| 9 | 3 | 61.5 | 69.5 | 5 / 35 | 4088 |
| 10 | 2 | 62.5 | 71.1 | 7 / 35 | 4466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shu.nitro.LENIN .T34 | 34 | 24% |
| ak.Fermat 2.0 | 33 | 18% |
| lrem.Spectre 0.4.4 | 22 | 32% |
| js.PinBall 1.6 | 11 | 36% |
| gh.mini.GrubbmOne 1.0 | 4 | 50% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 33% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 33% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 321 of 350 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 91 | 28% | 94 |
| shu.nitro.LENIN .T34 | 56 | 17% | 66 |
| gh.mini.GrubbmOne 1.0 | 47 | 15% | 51 |
| lrem.Spectre 0.4.4 | 45 | 14% | 49 |
| js.PinBall 1.6 | 36 | 11% | 40 |
| jaybot.adv.bots.JayBot 2.0 | 21 | 7% | 23 |
| fullsail.LaxativeTeaTwo 1.0 | 14 | 4% | 17 |
| sample.SpinBot 1.0 | 10 | 3% | 10 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 65.3 | 45 / 350 | 4.13 | 12.7% | 32680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.7 | 14.5% | 124 |
| hadur117.nano.SanaroB800 0.1 | 2.7 | 12.7% | 45 |
| sheldor.melee.nano.TestMelee 0.1 | 3.3 | 11.9% | 42 |
| wee.Gem 1.8.4 | 3.5 | 12.0% | 67 |
| EH.Eagle 1.0.6 | 4.1 | 11.5% | 36 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 9.6% | 20 |
| throxbot.ThroxBot 0.1 | 7.3 | 8.7% | 7 |
| joe.ADinosaur 1.0 | 7.7 | 8.7% | 6 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.8% | 6 |
| cs.Grudge 1.0 | 9.9 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.3 | 69.8 | 3 / 35 | 3181 |
| 2 | 3 | 57.9 | 69.5 | 3 / 35 | 2956 |
| 3 | 2 | 60.5 | 73.0 | 5 / 35 | 3339 |
| 4 | 3 | 57.2 | 61.9 | 6 / 35 | 3246 |
| 5 | 3 | 57.1 | 63.5 | 5 / 35 | 3262 |
| 6 | 5 | 54.0 | 43.5 | 3 / 35 | 4466 |
| 7 | 2 | 58.6 | 68.3 | 6 / 35 | 3172 |
| 8 | 2 | 58.0 | 67.9 | 4 / 35 | 2999 |
| 9 | 3 | 56.7 | 65.1 | 3 / 35 | 2818 |
| 10 | 2 | 59.9 | 70.2 | 7 / 35 | 3241 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 50 | 38% |
| sheldor.melee.nano.TestMelee 0.1 | 22 | 36% |
| wee.Gem 1.8.4 | 16 | 25% |
| EH.Eagle 1.0.6 | 15 | 33% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 63% |
| caimano.Furia_Ceca 0.22 | 4 | 25% |
| throxbot.ThroxBot 0.1 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 308 of 350 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 90 | 29% | 108 |
| wee.Gem 1.8.4 | 50 | 16% | 54 |
| sheldor.melee.nano.TestMelee 0.1 | 48 | 16% | 60 |
| EH.Eagle 1.0.6 | 29 | 9% | 34 |
| throxbot.ThroxBot 0.1 | 27 | 9% | 27 |
| joe.ADinosaur 1.0 | 25 | 8% | 25 |
| techdude.kombat.FlamingKombat 1.5 | 19 | 6% | 22 |
| caimano.Furia_Ceca 0.22 | 12 | 4% | 14 |
| cs.Grudge 1.0 | 6 | 2% | 6 |
2 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 73.7 | 56 / 350 | 3.37 | 14.3% | 36308 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.1 | 16.2% | 131 |
| hadur117.nano.SanaroB800 0.1 | 2.0 | 14.3% | 56 |
| uji.Antique 1.0 | 3.0 | 13.4% | 83 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 11.3% | 38 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.7% | 13 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.3% | 18 |
| amk.ChumbaWumba 0.3 | 6.7 | 7.9% | 7 |
| matt.advanced.Katana 1.0 | 8.2 | 6.6% | 6 |
| stelo.PianistNano 1.2 | 8.8 | 6.1% | 0 |
| stelo.Lifestealer 1.0 | 9.6 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 73.7 | 3 / 35 | 3606 |
| 2 | 2 | 60.7 | 71.4 | 6 / 35 | 3557 |
| 3 | 2 | 59.1 | 66.7 | 5 / 35 | 3631 |
| 4 | 2 | 61.0 | 72.1 | 5 / 35 | 3611 |
| 5 | 1 | 62.6 | 77.8 | 7 / 35 | 3768 |
| 6 | 2 | 61.0 | 74.3 | 7 / 35 | 3283 |
| 7 | 2 | 62.3 | 77.1 | 6 / 35 | 3700 |
| 8 | 2 | 62.4 | 75.9 | 10 / 35 | 3553 |
| 9 | 2 | 61.1 | 73.7 | 2 / 35 | 3672 |
| 10 | 2 | 62.0 | 74.3 | 5 / 35 | 3927 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 80 | 28% |
| uji.Antique 1.0 | 41 | 34% |
| qohnil.blot.BlotBot 3.61 | 20 | 45% |
| ahr.ice.Ice 1.0.2 | 8 | 38% |
| amk.ChumbaWumba 0.3 | 7 | 71% |
| pfvicm.Sobieski 7.2.3b | 6 | 50% |
| matt.advanced.Katana 1.0 | 1 | 0% |

Hadur died in 296 of 350 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 113 | 38% | 123 |
| uji.Antique 1.0 | 67 | 23% | 87 |
| pfvicm.Sobieski 7.2.3b | 41 | 14% | 44 |
| qohnil.blot.BlotBot 3.61 | 25 | 8% | 36 |
| amk.ChumbaWumba 0.3 | 23 | 8% | 24 |
| ahr.ice.Ice 1.0.2 | 14 | 5% | 18 |
| matt.advanced.Katana 1.0 | 7 | 2% | 10 |
| stelo.PianistNano 1.2 | 3 | 1% | 3 |
| stelo.Lifestealer 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 60.6 | 33 / 350 | 4.55 | 12.3% | 34015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.6 | 16.0% | 133 |
| deewiant.Anomaly 0.2 | 1.7 | 15.5% | 100 |
| myl.micro.Troodon 1.10 | 3.2 | 13.3% | 33 |
| hadur117.nano.SanaroB800 0.1 | 4.0 | 12.3% | 33 |
| jok.PheonixM 0.1.2 | 4.6 | 11.2% | 23 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.4% | 3 |
| DBall.Anarchy 0.1 | 6.7 | 8.1% | 21 |
| fullsail.TimbotNoPrediction 1.0 | 8.4 | 5.6% | 0 |
| ap.Frederick 1.1 | 9.3 | 4.8% | 3 |
| jangs.ns51 1.0 | 9.3 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.7 | 60.3 | 4 / 35 | 3266 |
| 2 | 5 | 56.7 | 56.8 | 1 / 35 | 3331 |
| 3 | 5 | 56.4 | 55.6 | 4 / 35 | 3218 |
| 4 | 3 | 60.0 | 64.1 | 5 / 35 | 3499 |
| 5 | 3 | 58.9 | 61.9 | 4 / 35 | 3824 |
| 6 | 4 | 57.6 | 58.4 | 2 / 35 | 3468 |
| 7 | 4 | 55.9 | 56.8 | 1 / 35 | 3146 |
| 8 | 4 | 58.6 | 63.5 | 3 / 35 | 3608 |
| 9 | 5 | 58.0 | 62.2 | 3 / 35 | 3294 |
| 10 | 3 | 59.5 | 66.3 | 6 / 35 | 3361 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 35 | 23% |
| zyx.mega.YersiniaPestis 3.1 | 24 | 17% |
| myl.micro.Troodon 1.10 | 22 | 64% |
| jok.PheonixM 0.1.2 | 6 | 33% |
| DBall.Anarchy 0.1 | 5 | 0% |
| ap.Frederick 1.1 | 3 | 67% |
| jangs.ns51 1.0 | 2 | 50% |
| ph.melee.ArcherME 0.3 | 2 | 50% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 318 of 350 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 93 | 29% | 104 |
| zyx.mega.YersiniaPestis 3.1 | 76 | 24% | 78 |
| myl.micro.Troodon 1.10 | 61 | 19% | 72 |
| jok.PheonixM 0.1.2 | 38 | 12% | 43 |
| ph.melee.ArcherME 0.3 | 25 | 8% | 25 |
| DBall.Anarchy 0.1 | 17 | 5% | 19 |
| jangs.ns51 1.0 | 5 | 2% | 7 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 1% | 2 |
| ap.Frederick 1.1 | 1 | 0% | 0 |

## Melee bench: F30

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 51.7 | 50.1 | 17 / 350 | 5.49 | 9.8% | 27684 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.9 | 14.5% | 85 |
| oog.melee.Capulet 1.2 | 2.6 | 13.8% | 68 |
| darkcanuck.B26354 1.06 | 2.7 | 13.9% | 84 |
| stelo.PastFuture 2.3.2 | 2.8 | 13.7% | 60 |
| intruder.PrairieWolf 2.61 | 5.5 | 9.5% | 18 |
| hadur117.nano.SanaroB800 0.1 | 5.6 | 9.8% | 17 |
| ntc.Opposite 1.5 | 7.3 | 7.8% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 7.5% | 8 |
| tripphippy.Alice 1.1 | 8.6 | 6.9% | 9 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 49.1 | 43.8 | 1 / 35 | 2732 |
| 2 | 5 | 52.6 | 52.7 | 1 / 35 | 2766 |
| 3 | 5 | 53.0 | 51.1 | 2 / 35 | 2958 |
| 4 | 6 | 51.5 | 48.6 | 2 / 35 | 2720 |
| 5 | 6 | 52.2 | 52.4 | 1 / 35 | 2809 |
| 6 | 6 | 51.3 | 48.6 | 2 / 35 | 2780 |
| 7 | 6 | 50.6 | 47.6 | 3 / 35 | 2724 |
| 8 | 5 | 51.0 | 47.6 | 2 / 35 | 2961 |
| 9 | 5 | 53.4 | 55.6 | 3 / 35 | 2641 |
| 10 | 6 | 52.3 | 53.0 | 0 / 35 | 2593 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 11 | 55% |
| stelo.PastFuture 2.3.2 | 11 | 27% |
| darkcanuck.B26354 1.06 | 10 | 30% |
| oog.melee.Capulet 1.2 | 10 | 20% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 33% |
| ntc.Opposite 1.5 | 2 | 50% |
| intruder.PrairieWolf 2.61 | 2 | 50% |

Hadur died in 334 of 350 rounds, at a mean tick of 547. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 67 | 20% | 71 |
| catcat20.Matcha 0.006 | 65 | 19% | 70 |
| oog.melee.Capulet 1.2 | 56 | 17% | 58 |
| darkcanuck.B26354 1.06 | 50 | 15% | 53 |
| intruder.PrairieWolf 2.61 | 27 | 8% | 28 |
| ntc.Opposite 1.5 | 27 | 8% | 27 |
| fowl3628800.LightningBolt 2.6.0 | 19 | 6% | 19 |
| tripphippy.Alice 1.1 | 18 | 5% | 19 |
| GarmBox.Anger 1.0 | 5 | 1% | 5 |

## Melee bench: F31

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.2 | 55.7 | 10 / 350 | 4.99 | 10.7% | 28512 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 19.3% | 217 |
| gh.mini.Griezel 0.2 | 2.2 | 13.5% | 64 |
| d414.nano.Quantum 1.0.0 | 3.4 | 12.2% | 26 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 11.9% | 23 |
| hadur117.nano.SanaroB800 0.1 | 4.4 | 10.7% | 10 |
| gh.nano.Grofvuil 0.2 | 6.3 | 8.9% | 6 |
| timmit.nano.TimDog 0.33 | 7.3 | 7.1% | 4 |
| fm.mammillarias 1.3 | 7.4 | 6.8% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.4 | 5.0% | 1 |
| tlp.ThreeLeggedPig 1 | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 50.9 | 48.9 | 1 / 35 | 2446 |
| 2 | 5 | 53.8 | 53.3 | 1 / 35 | 2954 |
| 3 | 5 | 54.7 | 57.5 | 0 / 35 | 2894 |
| 4 | 5 | 52.8 | 54.0 | 0 / 35 | 2625 |
| 5 | 5 | 53.0 | 52.7 | 0 / 35 | 2741 |
| 6 | 4 | 54.9 | 55.6 | 3 / 35 | 3023 |
| 7 | 3 | 58.8 | 66.0 | 2 / 35 | 3394 |
| 8 | 4 | 52.9 | 52.7 | 2 / 35 | 2653 |
| 9 | 5 | 52.5 | 52.7 | 1 / 35 | 2601 |
| 10 | 3 | 57.8 | 63.8 | 0 / 35 | 3181 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 39 | 10% |
| gh.mini.Griezel 0.2 | 20 | 15% |
| d414.nano.Quantum 1.0.0 | 6 | 17% |
| spinnercat.micro.Tyger 0.1 | 4 | 25% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 0% |
| timmit.nano.TimDog 0.33 | 1 | 0% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 340 of 350 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 91 | 27% | 96 |
| gh.mini.Griezel 0.2 | 81 | 24% | 84 |
| spinnercat.micro.Tyger 0.1 | 59 | 17% | 60 |
| d414.nano.Quantum 1.0.0 | 45 | 13% | 45 |
| gh.nano.Grofvuil 0.2 | 20 | 6% | 21 |
| timmit.nano.TimDog 0.33 | 20 | 6% | 20 |
| fm.mammillarias 1.3 | 13 | 4% | 13 |
| Gecko.ultimateGeckoBot 1.0 | 9 | 3% | 9 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 73.4 | 88 / 350 | 3.39 | 14.5% | 38037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.6 | 14.9% | 103 |
| hadur117.nano.SanaroB800 0.1 | 1.7 | 14.5% | 88 |
| apc.botM 3.0 | 3.0 | 12.5% | 66 |
| vjik.UnViolation 1.1 | 4.1 | 11.5% | 49 |
| lxx.ConceptA 0.8 | 4.9 | 10.5% | 7 |
| bayen.UbaMicro 1.4 | 5.8 | 9.0% | 10 |
| panzer.Panzer 0.2 | 7.0 | 7.9% | 0 |
| yk.JahMicro 1.0 | 8.3 | 6.8% | 14 |
| conscience.Electron 1.3g | 8.9 | 6.5% | 2 |
| donjezza.Jezza 1.0 | 9.7 | 6.0% | 11 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 76.5 | 9 / 35 | 4010 |
| 2 | 2 | 62.0 | 74.6 | 12 / 35 | 3750 |
| 3 | 2 | 60.3 | 70.5 | 7 / 35 | 3555 |
| 4 | 4 | 58.5 | 66.7 | 6 / 35 | 3467 |
| 5 | 1 | 60.3 | 72.4 | 8 / 35 | 3598 |
| 6 | 1 | 63.4 | 76.8 | 13 / 35 | 4082 |
| 7 | 1 | 62.5 | 75.9 | 11 / 35 | 3968 |
| 8 | 1 | 61.6 | 72.7 | 8 / 35 | 4055 |
| 9 | 1 | 62.6 | 77.1 | 11 / 35 | 3878 |
| 10 | 2 | 59.4 | 70.8 | 3 / 35 | 3674 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 67 | 31% |
| apc.botM 3.0 | 37 | 46% |
| vjik.UnViolation 1.1 | 23 | 26% |
| lxx.ConceptA 0.8 | 19 | 95% |
| yk.JahMicro 1.0 | 11 | 45% |
| panzer.Panzer 0.2 | 10 | 100% |
| bayen.UbaMicro 1.4 | 9 | 67% |
| donjezza.Jezza 1.0 | 7 | 43% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 263 of 350 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 83 | 32% | 107 |
| lxx.ConceptA 0.8 | 47 | 18% | 56 |
| apc.botM 3.0 | 41 | 16% | 61 |
| vjik.UnViolation 1.1 | 30 | 11% | 40 |
| bayen.UbaMicro 1.4 | 22 | 8% | 29 |
| panzer.Panzer 0.2 | 18 | 7% | 22 |
| yk.JahMicro 1.0 | 9 | 3% | 12 |
| donjezza.Jezza 1.0 | 8 | 3% | 11 |
| conscience.Electron 1.3g | 5 | 2% | 11 |

## Melee bench: F33

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 62.5 | 21 / 350 | 4.38 | 12.6% | 36496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 18.0% | 157 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.2% | 48 |
| hadur117.nano.SanaroB800 0.1 | 3.0 | 12.6% | 21 |
| gre.svman4.Leonidas 1.3.2 | 3.3 | 12.3% | 62 |
| labg.Cataclysm 2.05 | 4.9 | 11.0% | 41 |
| baal.nano.N 1.42 | 6.5 | 8.8% | 7 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.5% | 11 |
| zyx.micro.Ant 1.1 | 8.6 | 5.8% | 2 |
| sanja.First 0.1 | 8.8 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.6 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 70.2 | 3 / 35 | 3896 |
| 2 | 4 | 58.0 | 59.4 | 3 / 35 | 3867 |
| 3 | 3 | 58.5 | 64.4 | 2 / 35 | 3474 |
| 4 | 4 | 56.1 | 56.5 | 2 / 35 | 3390 |
| 5 | 2 | 60.2 | 65.7 | 3 / 35 | 3876 |
| 6 | 2 | 58.2 | 62.9 | 2 / 35 | 3738 |
| 7 | 4 | 56.5 | 60.3 | 1 / 35 | 3222 |
| 8 | 3 | 57.8 | 61.0 | 1 / 35 | 3811 |
| 9 | 2 | 60.5 | 69.5 | 2 / 35 | 3729 |
| 10 | 4 | 55.4 | 54.9 | 2 / 35 | 3493 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 52 | 19% |
| gre.svman4.Leonidas 1.3.2 | 19 | 5% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 29% |
| labg.Cataclysm 2.05 | 8 | 0% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 50% |
| baal.nano.N 1.42 | 2 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 50% |

Hadur died in 329 of 350 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 125 | 38% | 136 |
| gre.svman4.Leonidas 1.3.2 | 60 | 18% | 59 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 53 | 16% | 59 |
| labg.Cataclysm 2.05 | 29 | 9% | 30 |
| kinsen.melee.Angsaichmophobia 1.8c | 29 | 9% | 28 |
| baal.nano.N 1.42 | 17 | 5% | 20 |
| zyx.micro.Ant 1.1 | 7 | 2% | 9 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 5 | 2% | 5 |
| sanja.First 0.1 | 4 | 1% | 4 |

## Melee bench: F34

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 70.5 | 46 / 350 | 3.66 | 14.2% | 42612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 17.2% | 138 |
| kid.Gladiator .7.2 | 1.5 | 17.0% | 106 |
| hadur117.nano.SanaroB800 0.1 | 3.1 | 14.2% | 46 |
| jcs.Seth 1.8 | 4.2 | 11.7% | 33 |
| tcf.Reach 3 | 4.9 | 10.8% | 17 |
| cli.Dancer 1.1 | 5.9 | 9.5% | 4 |
| ratosh.Wesco 1.4 | 6.9 | 7.6% | 6 |
| amk.Punbot.Punbot 0.01 | 8.1 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.9% | 1 |
| sample.RamFire 1.0 | 9.9 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.1 | 73.3 | 5 / 35 | 4247 |
| 2 | 3 | 64.7 | 75.9 | 7 / 35 | 4783 |
| 3 | 3 | 65.1 | 77.5 | 6 / 35 | 4603 |
| 4 | 3 | 60.1 | 62.9 | 5 / 35 | 4074 |
| 5 | 3 | 60.0 | 64.8 | 2 / 35 | 4021 |
| 6 | 3 | 62.9 | 72.1 | 5 / 35 | 4117 |
| 7 | 4 | 58.7 | 61.9 | 3 / 35 | 3664 |
| 8 | 3 | 62.4 | 69.8 | 6 / 35 | 4342 |
| 9 | 3 | 62.8 | 72.4 | 3 / 35 | 4245 |
| 10 | 3 | 63.8 | 74.3 | 4 / 35 | 4516 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 54 | 50% |
| kid.Gladiator .7.2 | 48 | 19% |
| jcs.Seth 1.8 | 13 | 31% |
| tcf.Reach 3 | 11 | 27% |
| ratosh.Wesco 1.4 | 3 | 100% |
| cli.Dancer 1.1 | 3 | 0% |
| sample.VelociRobot 1.0 | 1 | 0% |

Hadur died in 305 of 350 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 116 | 38% | 120 |
| stelo.Spread 0.9 | 77 | 25% | 106 |
| jcs.Seth 1.8 | 35 | 11% | 40 |
| tcf.Reach 3 | 30 | 10% | 32 |
| ratosh.Wesco 1.4 | 28 | 9% | 31 |
| cli.Dancer 1.1 | 12 | 4% | 14 |
| sample.VelociRobot 1.0 | 4 | 1% | 5 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 64.2 | 10 / 350 | 4.22 | 11.9% | 29194 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.6% | 279 |
| gh.mini.Gruwel 0.9 | 2.5 | 13.2% | 27 |
| rz.HawkOnFire 0.1 | 3.6 | 12.3% | 11 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.2% | 21 |
| hadur117.nano.SanaroB800 0.1 | 4.1 | 11.9% | 10 |
| myl.nano.KomoriNinja 1.1 | 6.2 | 7.2% | 2 |
| wit.Chuliath 1.0 | 7.1 | 6.9% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 6.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.1 | 5.1% | 0 |
| dans.Cinnamon 1.2 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.7 | 58.4 | 1 / 35 | 3008 |
| 2 | 5 | 55.7 | 60.6 | 1 / 35 | 2667 |
| 3 | 4 | 58.8 | 66.7 | 1 / 35 | 3004 |
| 4 | 2 | 58.9 | 68.3 | 0 / 35 | 3073 |
| 5 | 5 | 57.3 | 64.8 | 0 / 35 | 2680 |
| 6 | 4 | 56.2 | 61.3 | 1 / 35 | 2813 |
| 7 | 4 | 57.6 | 66.3 | 1 / 35 | 2786 |
| 8 | 3 | 58.2 | 65.1 | 2 / 35 | 3112 |
| 9 | 4 | 59.4 | 68.6 | 2 / 35 | 3063 |
| 10 | 5 | 57.1 | 61.9 | 1 / 35 | 2988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 67 | 4% |
| rz.HawkOnFire 0.1 | 9 | 56% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 25% |
| gh.mini.Gruwel 0.9 | 4 | 0% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |

Hadur died in 340 of 350 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 136 | 40% | 138 |
| rz.HawkOnFire 0.1 | 70 | 21% | 74 |
| gh.mini.Gruwel 0.9 | 53 | 16% | 53 |
| dmh.robocode.robot.BlackDeath 9.2 | 39 | 11% | 43 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 15 | 4% | 16 |
| myl.nano.KomoriNinja 1.1 | 11 | 3% | 11 |
| stelo.MyAgileRobot 0.2 | 7 | 2% | 7 |
| wit.Chuliath 1.0 | 6 | 2% | 6 |
| dans.Cinnamon 1.2 | 3 | 1% | 2 |

## Melee bench: F36

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 64.9 | 57 / 350 | 4.16 | 13.2% | 36459 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| alpha.RainingFire 1.0 | 1.7 | 13.3% | 73 |
| hadur117.nano.SanaroB800 0.1 | 1.9 | 13.2% | 57 |
| bzdp.Pansy 2.1 | 2.8 | 12.5% | 64 |
| mz.Cork 0.1 | 4.0 | 11.8% | 50 |
| bvh.micro.Freya 0.3 | 5.3 | 10.9% | 38 |
| m3thos.Eva02 0.7.1 | 5.9 | 10.3% | 35 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.4% | 8 |
| dl.BetterWalls 1.0 | 8.4 | 7.0% | 6 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 7.1% | 10 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.5% | 12 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.4 | 68.6 | 10 / 35 | 3652 |
| 2 | 2 | 58.3 | 65.7 | 3 / 35 | 3531 |
| 3 | 3 | 57.8 | 61.6 | 6 / 35 | 3588 |
| 4 | 2 | 60.7 | 69.5 | 8 / 35 | 3768 |
| 5 | 1 | 59.8 | 68.3 | 5 / 35 | 3799 |
| 6 | 3 | 57.3 | 60.6 | 6 / 35 | 3490 |
| 7 | 2 | 58.0 | 62.9 | 5 / 35 | 3754 |
| 8 | 2 | 58.2 | 64.1 | 5 / 35 | 3564 |
| 9 | 2 | 58.2 | 63.2 | 5 / 35 | 3691 |
| 10 | 1 | 57.9 | 64.8 | 4 / 35 | 3622 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 31 | 32% |
| alpha.RainingFire 1.0 | 24 | 42% |
| mz.Cork 0.1 | 22 | 41% |
| m3thos.Eva02 0.7.1 | 19 | 32% |
| bvh.micro.Freya 0.3 | 18 | 56% |
| bvh.mini.Fenrir 0.39 | 10 | 70% |
| dl.BetterWalls 1.0 | 7 | 43% |
| squidM.TentalceMeleeNano 1.1 | 2 | 50% |
| sample.MyFirstRobot 1.0 | 1 | 0% |

Hadur died in 295 of 350 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 65 | 22% | 72 |
| bzdp.Pansy 2.1 | 61 | 21% | 74 |
| mz.Cork 0.1 | 38 | 13% | 49 |
| bvh.mini.Fenrir 0.39 | 33 | 11% | 37 |
| m3thos.Eva02 0.7.1 | 31 | 11% | 36 |
| bvh.micro.Freya 0.3 | 29 | 10% | 37 |
| dl.BetterWalls 1.0 | 15 | 5% | 21 |
| squidM.TentalceMeleeNano 1.1 | 14 | 5% | 15 |
| sample.MyFirstRobot 1.0 | 7 | 2% | 9 |
2 death(s) with no robot to name.

## Melee bench: F37

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 76.4 | 107 / 350 | 3.13 | 15.3% | 45031 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB800 0.1 | 1.1 | 15.3% | 107 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.7 | 11.7% | 37 |
| germ.TheMind .2 | 3.4 | 11.2% | 50 |
| EBBU.Sim2 1.02 | 5.1 | 10.0% | 19 |
| agrach.Dalek 1.0 | 5.1 | 10.0% | 44 |
| lmk.ACPFinal 0.1 | 6.1 | 9.0% | 23 |
| stelo.UntouchableNano 1.3 | 6.4 | 9.1% | 31 |
| mb.Beast 0.1 | 7.9 | 8.3% | 21 |
| skm.Ryubot 1.0 | 8.2 | 7.8% | 17 |
| mn.nano.perceptual.Impact 1.3.0 | 9.0 | 7.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 76.8 | 13 / 35 | 4207 |
| 2 | 1 | 62.5 | 77.5 | 12 / 35 | 4507 |
| 3 | 1 | 63.6 | 81.6 | 11 / 35 | 4622 |
| 4 | 2 | 57.4 | 65.7 | 8 / 35 | 3735 |
| 5 | 1 | 62.3 | 76.2 | 9 / 35 | 4743 |
| 6 | 1 | 62.9 | 79.4 | 12 / 35 | 4481 |
| 7 | 1 | 62.5 | 74.0 | 12 / 35 | 4690 |
| 8 | 1 | 64.3 | 82.5 | 14 / 35 | 4699 |
| 9 | 1 | 62.0 | 77.5 | 7 / 35 | 4718 |
| 10 | 1 | 61.2 | 72.7 | 9 / 35 | 4629 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.UntouchableNano 1.3 | 29 | 62% |
| com.syncleus.robocode.Dreadnaught 0.1 | 28 | 54% |
| EBBU.Sim2 1.02 | 26 | 65% |
| germ.TheMind .2 | 25 | 40% |
| agrach.Dalek 1.0 | 25 | 44% |
| lmk.ACPFinal 0.1 | 22 | 68% |
| mb.Beast 0.1 | 17 | 76% |
| skm.Ryubot 1.0 | 12 | 58% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 246 of 350 rounds, at a mean tick of 504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 49 | 20% | 62 |
| agrach.Dalek 1.0 | 44 | 18% | 68 |
| com.syncleus.robocode.Dreadnaught 0.1 | 31 | 13% | 49 |
| lmk.ACPFinal 0.1 | 30 | 12% | 36 |
| mb.Beast 0.1 | 25 | 10% | 40 |
| stelo.UntouchableNano 1.3 | 25 | 10% | 38 |
| EBBU.Sim2 1.02 | 25 | 10% | 35 |
| skm.Ryubot 1.0 | 9 | 4% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 8 | 3% | 10 |

## Melee bench: F38

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.8 | 59.0 | 20 / 350 | 4.69 | 11.4% | 31433 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.5% | 177 |
| bvh.mini.Freya 0.55 | 2.4 | 13.3% | 39 |
| bts.mega.Gnarly 1.4 | 3.9 | 11.9% | 47 |
| cs.Wren 1.0 | 4.0 | 11.7% | 32 |
| hadur117.nano.SanaroB800 0.1 | 4.5 | 11.4% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.4 | 10.7% | 22 |
| kdf.KoulDestroyer 1.0 | 6.8 | 9.1% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.7% | 4 |
| bzdp.BoxCar 2.0 | 9.3 | 4.4% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 55.7 | 56.8 | 1 / 35 | 3168 |
| 2 | 4 | 56.6 | 61.6 | 2 / 35 | 3063 |
| 3 | 3 | 56.5 | 61.3 | 2 / 35 | 3026 |
| 4 | 4 | 56.0 | 60.0 | 1 / 35 | 3086 |
| 5 | 5 | 57.2 | 61.9 | 4 / 35 | 3175 |
| 6 | 5 | 54.8 | 58.1 | 1 / 35 | 2991 |
| 7 | 6 | 53.0 | 50.5 | 2 / 35 | 3382 |
| 8 | 4 | 55.9 | 58.4 | 2 / 35 | 3043 |
| 9 | 5 | 54.4 | 54.9 | 3 / 35 | 3120 |
| 10 | 3 | 57.9 | 66.3 | 2 / 35 | 3379 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 55 | 18% |
| bts.mega.Gnarly 1.4 | 14 | 21% |
| cs.Wren 1.0 | 7 | 14% |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 29% |
| bvh.mini.Freya 0.55 | 7 | 29% |
| kdf.KoulDestroyer 1.0 | 4 | 50% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 0% |

Hadur died in 331 of 350 rounds, at a mean tick of 593. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 103 | 31% | 112 |
| cs.Wren 1.0 | 52 | 16% | 54 |
| bvh.mini.Freya 0.55 | 47 | 14% | 49 |
| bts.mega.Gnarly 1.4 | 39 | 12% | 43 |
| davidalves.net.DuelistNanoMelee 1.01 | 38 | 11% | 41 |
| kdf.KoulDestroyer 1.0 | 33 | 10% | 32 |
| kawigi.spare.SpareParts 0.7.6nosnd | 11 | 3% | 11 |
| bzdp.BoxCar 2.0 | 5 | 2% | 5 |
| matt.UnderDark3 2.4.34 | 3 | 1% | 3 |

## Melee bench: F39

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.6 | 62.6 | 29 / 350 | 4.36 | 12.2% | 35041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.0 | 15.7% | 83 |
| az.Ololobot 0.2.4 | 2.1 | 13.9% | 124 |
| hadur117.nano.SanaroB800 0.1 | 3.3 | 12.2% | 29 |
| catcat20.Lambda 0.024 | 3.6 | 11.6% | 58 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 9.1% | 21 |
| stelo.SoRobotNanoMelee 1.2 | 6.0 | 9.2% | 28 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 8.6% | 3 |
| gimp.GimpBot 0.1 | 7.4 | 8.3% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.9 | 6.2% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 54.6 | 56.8 | 2 / 35 | 3650 |
| 2 | 3 | 57.6 | 64.1 | 4 / 35 | 3347 |
| 3 | 3 | 58.9 | 65.1 | 4 / 35 | 4092 |
| 4 | 4 | 52.7 | 56.5 | 1 / 35 | 2915 |
| 5 | 4 | 55.2 | 59.0 | 6 / 35 | 3163 |
| 6 | 3 | 59.2 | 67.9 | 2 / 35 | 4017 |
| 7 | 3 | 58.4 | 68.6 | 3 / 35 | 3502 |
| 8 | 4 | 54.9 | 57.1 | 3 / 35 | 3427 |
| 9 | 2 | 57.1 | 65.1 | 1 / 35 | 3493 |
| 10 | 4 | 57.8 | 66.0 | 3 / 35 | 3435 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 40 | 10% |
| bvh.fry.Freya 0.82 | 33 | 39% |
| catcat20.Lambda 0.024 | 15 | 53% |
| stelo.SoRobotNanoMelee 1.2 | 10 | 20% |
| winamp32.micro.MicroMacro 1.0 | 7 | 0% |
| gimp.GimpBot 0.1 | 1 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 0% |

Hadur died in 323 of 350 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 105 | 33% | 116 |
| az.Ololobot 0.2.4 | 68 | 21% | 72 |
| stelo.SoRobotNanoMelee 1.2 | 39 | 12% | 40 |
| catcat20.Lambda 0.024 | 33 | 10% | 38 |
| apollokidd.ApolloKidd 0.9 | 30 | 9% | 34 |
| winamp32.micro.MicroMacro 1.0 | 18 | 6% | 18 |
| gimp.GimpBot 0.1 | 12 | 4% | 15 |
| dcs.Eater_of_Worlds 1.1.3-A | 9 | 3% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F41

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 65.3 | 24 / 350 | 4.13 | 12.4% | 31828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.1 | 17.4% | 181 |
| ary.Swarm 1.1 | 2.5 | 13.9% | 34 |
| lessonz.robocode.Oz 0.5.0 | 2.8 | 13.6% | 63 |
| hadur117.nano.SanaroB800 0.1 | 4.2 | 12.4% | 24 |
| simonton.nano.MeleeSeed 1.8 | 4.4 | 11.9% | 38 |
| shrub.Silver v048 | 6.1 | 8.8% | 5 |
| zyx.nano.Ant 1.1 | 7.0 | 7.6% | 0 |
| stelo.Mirror 1.1 | 8.4 | 5.6% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 6.1% | 8 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 73.0 | 5 / 35 | 3337 |
| 2 | 4 | 59.3 | 68.6 | 2 / 35 | 3053 |
| 3 | 4 | 59.0 | 66.3 | 2 / 35 | 3066 |
| 4 | 5 | 54.8 | 56.5 | 0 / 35 | 2809 |
| 5 | 5 | 57.0 | 61.0 | 3 / 35 | 3049 |
| 6 | 4 | 58.7 | 66.0 | 3 / 35 | 3300 |
| 7 | 5 | 59.7 | 65.7 | 4 / 35 | 3293 |
| 8 | 2 | 61.7 | 72.7 | 3 / 35 | 3482 |
| 9 | 5 | 55.6 | 59.0 | 0 / 35 | 3286 |
| 10 | 5 | 57.9 | 63.8 | 2 / 35 | 3153 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 44 | 11% |
| lessonz.robocode.Oz 0.5.0 | 21 | 38% |
| ary.Swarm 1.1 | 19 | 37% |
| simonton.nano.MeleeSeed 1.8 | 9 | 22% |
| shrub.Silver v048 | 2 | 50% |

Hadur died in 326 of 350 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 107 | 33% | 111 |
| ary.Swarm 1.1 | 72 | 22% | 79 |
| lessonz.robocode.Oz 0.5.0 | 65 | 20% | 73 |
| simonton.nano.MeleeSeed 1.8 | 44 | 13% | 47 |
| shrub.Silver v048 | 15 | 5% | 15 |
| zyx.nano.Ant 1.1 | 11 | 3% | 12 |
| jsal.Jsalbot 1.0 | 5 | 2% | 6 |
| stelo.Mirror 1.1 | 5 | 2% | 5 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |

## Melee bench: F42

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 68.2 | 46 / 350 | 3.86 | 13.5% | 39439 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.4% | 183 |
| maribo.mini.MiniQuester 0.1 | 2.7 | 14.5% | 53 |
| ara.Shera 0.88 | 3.1 | 13.8% | 57 |
| hadur117.nano.SanaroB800 0.1 | 3.2 | 13.5% | 46 |
| amz.NanoClone 1.41 | 5.1 | 9.1% | 2 |
| maribo.IotaCT 1.1 | 6.0 | 7.9% | 3 |
| dsw.StaticD 1.0 | 7.1 | 6.9% | 3 |
| stelo.MirrorMicro 1.0 | 8.8 | 5.8% | 1 |
| mme.NikeEnhanced 2.0 | 8.9 | 5.8% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.1 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.4 | 69.2 | 5 / 35 | 3881 |
| 2 | 4 | 58.4 | 63.5 | 3 / 35 | 3560 |
| 3 | 3 | 58.8 | 65.4 | 7 / 35 | 3642 |
| 4 | 3 | 59.2 | 67.3 | 3 / 35 | 3966 |
| 5 | 4 | 59.9 | 66.7 | 3 / 35 | 3913 |
| 6 | 4 | 61.4 | 70.8 | 4 / 35 | 3957 |
| 7 | 2 | 61.4 | 68.9 | 6 / 35 | 4356 |
| 8 | 2 | 62.3 | 72.7 | 6 / 35 | 4175 |
| 9 | 4 | 58.0 | 62.5 | 2 / 35 | 3676 |
| 10 | 2 | 63.2 | 75.2 | 7 / 35 | 4313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 64 | 23% |
| maribo.mini.MiniQuester 0.1 | 35 | 51% |
| ara.Shera 0.88 | 18 | 39% |
| dsw.StaticD 1.0 | 3 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 0% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 304 of 350 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 115 | 38% | 130 |
| maribo.mini.MiniQuester 0.1 | 73 | 24% | 89 |
| ara.Shera 0.88 | 69 | 23% | 75 |
| amz.NanoClone 1.41 | 17 | 6% | 17 |
| maribo.IotaCT 1.1 | 13 | 4% | 16 |
| stelo.MirrorMicro 1.0 | 7 | 2% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 5 | 2% | 5 |
| mme.NikeEnhanced 2.0 | 3 | 1% | 3 |
| dsw.StaticD 1.0 | 2 | 1% | 8 |

## Melee bench: F43

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 61.5 | 8 / 350 | 4.47 | 11.9% | 33446 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.3% | 278 |
| brainfade.melee.Dusk 0.44 | 2.4 | 13.3% | 34 |
| dummy.micro.Sparrow 2.5 | 3.1 | 12.4% | 12 |
| hadur117.nano.SanaroB800 0.1 | 4.1 | 11.9% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.6% | 7 |
| Krabb.akim2.Akim2 1.1b | 5.6 | 10.0% | 7 |
| mz.NanoGod 2.02 | 7.4 | 7.8% | 2 |
| jab.DiamondStealer 5 | 7.6 | 7.7% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 3 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.6 | 58.7 | 0 / 35 | 3189 |
| 2 | 2 | 60.8 | 64.4 | 1 / 35 | 3824 |
| 3 | 4 | 61.9 | 69.5 | 4 / 35 | 3528 |
| 4 | 5 | 56.6 | 55.2 | 0 / 35 | 3275 |
| 5 | 4 | 60.6 | 67.3 | 0 / 35 | 3239 |
| 6 | 4 | 58.7 | 60.0 | 0 / 35 | 3582 |
| 7 | 4 | 57.3 | 59.0 | 1 / 35 | 3170 |
| 8 | 4 | 58.1 | 59.4 | 0 / 35 | 3379 |
| 9 | 3 | 60.5 | 67.0 | 0 / 35 | 3372 |
| 10 | 6 | 55.5 | 54.3 | 2 / 35 | 2888 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 60 | 7% |
| brainfade.melee.Dusk 0.44 | 12 | 25% |
| dummy.micro.Sparrow 2.5 | 5 | 20% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 0% |
| cvt.Firsty 1.0 | 2 | 0% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 342 of 350 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 159 | 46% | 163 |
| brainfade.melee.Dusk 0.44 | 48 | 14% | 51 |
| dummy.micro.Sparrow 2.5 | 42 | 12% | 43 |
| wcsv.melee.EngineerMelee 0.1 | 29 | 8% | 29 |
| Krabb.akim2.Akim2 1.1b | 22 | 6% | 22 |
| mz.NanoGod 2.02 | 17 | 5% | 17 |
| jab.DiamondStealer 5 | 17 | 5% | 17 |
| cvt.Firsty 1.0 | 8 | 2% | 8 |

## Melee bench: F44

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 64.5 | 34 / 350 | 4.19 | 13.0% | 38611 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.2 | 17.0% | 167 |
| tzu.TheArtOfWar 1.2 | 2.1 | 15.2% | 89 |
| hadur117.nano.SanaroB800 0.1 | 2.9 | 13.0% | 34 |
| wompi.Quokka 1.6 | 4.2 | 11.1% | 19 |
| jwirde.Gort 2.0 | 4.8 | 10.5% | 31 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.3 | 8.7% | 4 |
| stf.PanzerGeneral 0.1 | 7.2 | 7.4% | 1 |
| disan.Chair 2.2.0 | 7.3 | 7.8% | 6 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.6% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.1 | 54.6 | 3 / 35 | 3526 |
| 2 | 3 | 60.0 | 65.1 | 5 / 35 | 3871 |
| 3 | 2 | 64.6 | 77.1 | 7 / 35 | 4493 |
| 4 | 3 | 57.8 | 61.0 | 4 / 35 | 3769 |
| 5 | 3 | 58.3 | 64.1 | 3 / 35 | 3484 |
| 6 | 3 | 57.5 | 60.3 | 1 / 35 | 3899 |
| 7 | 3 | 60.7 | 68.3 | 2 / 35 | 4211 |
| 8 | 3 | 60.6 | 67.0 | 5 / 35 | 3957 |
| 9 | 3 | 59.2 | 65.7 | 1 / 35 | 3847 |
| 10 | 3 | 57.9 | 62.2 | 3 / 35 | 3554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 49 | 31% |
| tzu.TheArtOfWar 1.2 | 43 | 30% |
| wompi.Quokka 1.6 | 8 | 25% |
| jwirde.Gort 2.0 | 7 | 14% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 0% |
| disan.Chair 2.2.0 | 1 | 100% |

Hadur died in 318 of 350 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 102 | 32% | 112 |
| stelo.Liblix 0.3.1 | 97 | 31% | 115 |
| wompi.Quokka 1.6 | 35 | 11% | 36 |
| jwirde.Gort 2.0 | 26 | 8% | 28 |
| disan.Chair 2.2.0 | 17 | 5% | 17 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 16 | 5% | 16 |
| stf.PanzerGeneral 0.1 | 14 | 4% | 15 |
| amk.jointstrike.JointStrike 0.2 | 6 | 2% | 6 |
| sample.Crazy 1.0 | 5 | 2% | 5 |

## Melee bench: F45

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 69.4 | 55 / 350 | 3.75 | 14.6% | 42545 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB800 0.1 | 1.0 | 14.6% | 55 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 13.1% | 176 |
| jje.BagPuss 1.2 | 3.4 | 12.0% | 23 |
| sul.Lunar 1.1 | 3.6 | 11.2% | 41 |
| myl.nano.Graviton 1.10 | 5.5 | 10.2% | 11 |
| hvilela.HVilela 0.9 | 6.5 | 9.4% | 6 |
| pez.mini.ChironexFleckeri 0.5 | 6.5 | 9.1% | 15 |
| fm.claire 1.7 | 7.2 | 8.4% | 3 |
| wit.Deep7 2.0 | 9.2 | 6.4% | 22 |
| abud.ThirdRobo 1.0 | 9.8 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 75.9 | 8 / 35 | 4532 |
| 2 | 1 | 60.5 | 67.0 | 5 / 35 | 4263 |
| 3 | 1 | 62.1 | 70.5 | 7 / 35 | 4454 |
| 4 | 1 | 60.4 | 67.9 | 5 / 35 | 4004 |
| 5 | 1 | 62.3 | 70.5 | 6 / 35 | 4619 |
| 6 | 1 | 59.7 | 67.0 | 4 / 35 | 4015 |
| 7 | 1 | 59.7 | 67.3 | 3 / 35 | 3974 |
| 8 | 1 | 60.8 | 66.0 | 5 / 35 | 4417 |
| 9 | 1 | 61.9 | 71.7 | 7 / 35 | 4160 |
| 10 | 1 | 61.1 | 70.5 | 5 / 35 | 4107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 69 | 36% |
| sul.Lunar 1.1 | 15 | 47% |
| jje.BagPuss 1.2 | 11 | 45% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 75% |
| myl.nano.Graviton 1.10 | 8 | 50% |
| wit.Deep7 2.0 | 6 | 50% |
| hvilela.HVilela 0.9 | 3 | 67% |
| abud.ThirdRobo 1.0 | 3 | 67% |
| fm.claire 1.7 | 2 | 50% |

Hadur died in 296 of 350 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 62 | 21% | 85 |
| myl.nano.Graviton 1.10 | 51 | 17% | 66 |
| eem.IWillFireNoBullet v2.8 | 51 | 17% | 0 |
| sul.Lunar 1.1 | 40 | 14% | 68 |
| hvilela.HVilela 0.9 | 33 | 11% | 42 |
| pez.mini.ChironexFleckeri 0.5 | 19 | 6% | 32 |
| fm.claire 1.7 | 18 | 6% | 25 |
| wit.Deep7 2.0 | 11 | 4% | 16 |
| abud.ThirdRobo 1.0 | 10 | 3% | 14 |
1 death(s) with no robot to name.

## Melee bench: F46

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 64.2 | 15 / 350 | 4.23 | 11.6% | 27671 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 18.2% | 153 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 17.6% | 161 |
| hadur117.nano.SanaroB800 0.1 | 3.4 | 11.6% | 15 |
| mz.MicroSheep 1.0 | 4.0 | 11.0% | 5 |
| cx.Princess 1.0 | 4.8 | 10.0% | 14 |
| sadoner.killer 0.2 | 5.8 | 9.1% | 1 |
| arthord.NanoSatanMelee Beta | 7.1 | 7.6% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.5% | 0 |
| kurios.DOSexe .9a | 9.1 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.5 | 61.9 | 0 / 35 | 2915 |
| 2 | 3 | 58.9 | 69.8 | 3 / 35 | 2874 |
| 3 | 3 | 57.2 | 66.0 | 3 / 35 | 2604 |
| 4 | 4 | 57.2 | 63.8 | 1 / 35 | 2921 |
| 5 | 3 | 57.6 | 64.4 | 1 / 35 | 3021 |
| 6 | 3 | 55.8 | 61.9 | 1 / 35 | 2731 |
| 7 | 3 | 58.6 | 69.5 | 2 / 35 | 2818 |
| 8 | 3 | 57.0 | 64.1 | 2 / 35 | 2810 |
| 9 | 5 | 52.1 | 54.3 | 1 / 35 | 2272 |
| 10 | 3 | 57.0 | 65.7 | 1 / 35 | 2705 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 43 | 9% |
| rsalesc.melee.Medina 0.4.5 | 34 | 24% |
| cx.Princess 1.0 | 3 | 33% |
| sadoner.killer 0.2 | 1 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 335 of 350 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 137 | 41% | 141 |
| rsalesc.melee.Medina 0.4.5 | 83 | 25% | 88 |
| mz.MicroSheep 1.0 | 32 | 10% | 32 |
| sadoner.killer 0.2 | 28 | 8% | 30 |
| arthord.NanoSatanMelee Beta | 24 | 7% | 25 |
| cx.Princess 1.0 | 16 | 5% | 17 |
| jeremyreeder.collective.Prophet 5 | 9 | 3% | 10 |
| kurios.DOSexe .9a | 5 | 1% | 6 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 1 |

