# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 76.9 | 147 / 700 | 3.08 | 14.3% | 71447 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.1% | 436 |
| hadur117.nano.SanaroS3 0.3 | 2.1 | 14.3% | 147 |
| sgp.JollyNinja 3.53 | 3.6 | 11.9% | 66 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 11.4% | 18 |
| mz.MicroGodMelee 1 | 4.7 | 11.1% | 14 |
| lorneswork.Predator 1.0 | 5.5 | 10.1% | 18 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.5% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 75.2 | 5 / 35 | 3234 |
| 2 | 2 | 62.6 | 78.4 | 5 / 35 | 3437 |
| 3 | 2 | 63.6 | 80.6 | 12 / 35 | 3386 |
| 4 | 2 | 63.1 | 79.4 | 5 / 35 | 3670 |
| 5 | 2 | 65.6 | 86.3 | 9 / 35 | 3875 |
| 6 | 3 | 59.7 | 71.7 | 3 / 35 | 2862 |
| 7 | 2 | 61.0 | 71.7 | 6 / 35 | 3765 |
| 8 | 2 | 62.4 | 75.6 | 10 / 35 | 3309 |
| 9 | 2 | 63.8 | 81.9 | 11 / 35 | 3424 |
| 10 | 2 | 62.3 | 79.4 | 5 / 35 | 3534 |
| 11 | 2 | 60.1 | 68.3 | 9 / 35 | 3659 |
| 12 | 2 | 64.1 | 80.3 | 9 / 35 | 3961 |
| 13 | 2 | 63.8 | 82.2 | 8 / 35 | 3807 |
| 14 | 3 | 60.3 | 72.4 | 6 / 35 | 3345 |
| 15 | 2 | 62.3 | 73.7 | 6 / 35 | 3820 |
| 16 | 2 | 62.4 | 72.7 | 7 / 35 | 3987 |
| 17 | 2 | 61.6 | 75.6 | 5 / 35 | 3542 |
| 18 | 2 | 64.1 | 82.2 | 9 / 35 | 3886 |
| 19 | 2 | 62.8 | 77.8 | 9 / 35 | 3706 |
| 20 | 2 | 61.0 | 73.3 | 8 / 35 | 3238 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 280 | 20% |
| sgp.JollyNinja 3.53 | 48 | 50% |
| mz.MicroGodMelee 1 | 43 | 98% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 68% |
| lorneswork.Predator 1.0 | 12 | 58% |
| adt.Ar2 1.0 | 4 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 554 of 700 rounds, at a mean tick of 1019. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 283 | 51% | 342 |
| sgp.JollyNinja 3.53 | 87 | 16% | 111 |
| simonton.nano.WeekendObsession_Melee 1.0 | 64 | 12% | 74 |
| lorneswork.Predator 1.0 | 52 | 9% | 58 |
| mz.MicroGodMelee 1 | 40 | 7% | 83 |
| adt.Ar2 1.0 | 14 | 3% | 19 |
| kawigi.sbf.FloodSonnet 0.9 | 11 | 2% | 8 |
| skm.butterfly 1.0 | 3 | 1% | 4 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 70.0 | 165 / 700 | 3.70 | 14.0% | 73450 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.5 | 15.0% | 203 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.2 | 14.3% | 147 |
| hadur117.nano.SanaroS3 0.3 | 2.4 | 14.0% | 165 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.1% | 12 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.9 | 10.4% | 47 |
| sch.Simone 0.3d | 6.9 | 8.2% | 56 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.0% | 7 |
| Noran.BitchingElk 0.054 | 7.3 | 7.8% | 39 |
| stelo.PatternRobot 1.0 | 8.7 | 6.7% | 25 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.5 | 65.7 | 7 / 35 | 3270 |
| 2 | 3 | 60.4 | 66.3 | 6 / 35 | 3812 |
| 3 | 2 | 60.1 | 67.6 | 8 / 35 | 3665 |
| 4 | 2 | 62.0 | 73.7 | 5 / 35 | 4225 |
| 5 | 3 | 60.2 | 67.9 | 10 / 35 | 3503 |
| 6 | 3 | 61.5 | 73.0 | 7 / 35 | 3817 |
| 7 | 4 | 54.3 | 56.8 | 4 / 35 | 2919 |
| 8 | 3 | 59.8 | 69.2 | 5 / 35 | 3583 |
| 9 | 2 | 61.6 | 75.2 | 7 / 35 | 3563 |
| 10 | 2 | 59.8 | 67.3 | 6 / 35 | 3750 |
| 11 | 2 | 61.3 | 72.1 | 9 / 35 | 3742 |
| 12 | 1 | 62.7 | 77.5 | 12 / 35 | 3509 |
| 13 | 2 | 61.5 | 70.8 | 9 / 35 | 3848 |
| 14 | 2 | 60.2 | 69.2 | 7 / 35 | 3720 |
| 15 | 1 | 63.4 | 75.2 | 15 / 35 | 3982 |
| 16 | 1 | 63.5 | 77.1 | 14 / 35 | 3696 |
| 17 | 2 | 62.2 | 74.0 | 11 / 35 | 3634 |
| 18 | 3 | 58.5 | 64.1 | 6 / 35 | 3491 |
| 19 | 3 | 62.1 | 73.3 | 8 / 35 | 3894 |
| 20 | 3 | 59.0 | 62.9 | 9 / 35 | 3827 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 121 | 50% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 91 | 40% |
| com.cohesiva.robocode.ManOwaR 1.0 | 31 | 71% |
| sch.Simone 0.3d | 25 | 44% |
| Noran.BitchingElk 0.054 | 19 | 47% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 82% |
| stelo.PatternRobot 1.0 | 12 | 33% |
| fnc.bandit.Bandit 5.2.0 | 9 | 78% |
| fullsail.SweetTea 1.1 | 3 | 67% |

Hadur died in 538 of 700 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 149 | 28% | 195 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 122 | 23% | 167 |
| lrem.micro.SpikeSoldier 0.4 | 69 | 13% | 80 |
| stelo.PatternRobot 1.0 | 49 | 9% | 55 |
| com.cohesiva.robocode.ManOwaR 1.0 | 47 | 9% | 75 |
| sch.Simone 0.3d | 39 | 7% | 50 |
| fnc.bandit.Bandit 5.2.0 | 31 | 6% | 35 |
| Noran.BitchingElk 0.054 | 20 | 4% | 27 |
| fullsail.SweetTea 1.1 | 12 | 2% | 15 |

## Melee bench: F03

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 79.6 | 188 / 700 | 2.84 | 15.1% | 78356 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 2.0 | 15.1% | 188 |
| radnor.DoctorBob 1.42 | 2.0 | 14.7% | 184 |
| kawigi.nano.Lib 1.0 | 2.3 | 14.7% | 164 |
| vuen.Cake 2.51 | 3.8 | 13.2% | 129 |
| urdos.URDOS 1.3 | 5.0 | 10.6% | 23 |
| adt.Ar1 2.1 | 6.4 | 7.6% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 7.2 | 7.0% | 5 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.6% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 5.8% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 82.2 | 9 / 35 | 3972 |
| 2 | 2 | 62.3 | 75.6 | 9 / 35 | 4036 |
| 3 | 2 | 63.9 | 82.5 | 9 / 35 | 4050 |
| 4 | 1 | 63.0 | 80.0 | 9 / 35 | 3939 |
| 5 | 2 | 61.4 | 77.5 | 7 / 35 | 3752 |
| 6 | 3 | 61.7 | 74.0 | 11 / 35 | 4026 |
| 7 | 2 | 62.0 | 77.5 | 7 / 35 | 3972 |
| 8 | 1 | 63.3 | 80.3 | 10 / 35 | 3986 |
| 9 | 3 | 62.6 | 80.6 | 6 / 35 | 3864 |
| 10 | 2 | 62.5 | 78.7 | 9 / 35 | 4057 |
| 11 | 1 | 66.0 | 88.9 | 16 / 35 | 3939 |
| 12 | 1 | 64.3 | 82.5 | 9 / 35 | 4336 |
| 13 | 2 | 64.4 | 82.2 | 10 / 35 | 4030 |
| 14 | 2 | 63.7 | 80.0 | 8 / 35 | 4252 |
| 15 | 3 | 61.0 | 75.9 | 10 / 35 | 3289 |
| 16 | 4 | 60.8 | 70.8 | 7 / 35 | 4047 |
| 17 | 1 | 63.6 | 80.6 | 14 / 35 | 3708 |
| 18 | 2 | 62.1 | 79.4 | 9 / 35 | 3534 |
| 19 | 1 | 64.8 | 84.4 | 11 / 35 | 3941 |
| 20 | 2 | 62.1 | 78.1 | 8 / 35 | 3626 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 142 | 46% |
| vuen.Cake 2.51 | 121 | 64% |
| kawigi.nano.Lib 1.0 | 85 | 21% |
| urdos.URDOS 1.3 | 30 | 63% |
| ghent.ArthurPanzergon 1.0.0 | 6 | 33% |
| oa.weak.FlyMk1 0.1 | 3 | 67% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 100% |

Hadur died in 513 of 700 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 169 | 33% | 188 |
| radnor.DoctorBob 1.42 | 143 | 28% | 201 |
| urdos.URDOS 1.3 | 78 | 15% | 95 |
| vuen.Cake 2.51 | 72 | 14% | 153 |
| ghent.ArthurPanzergon 1.0.0 | 17 | 3% | 19 |
| adt.Ar1 2.1 | 16 | 3% | 18 |
| oa.weak.FlyMk1 0.1 | 7 | 1% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 1% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 5 | 1% | 7 |

## Melee bench: F04

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 73.1 | 20 / 700 | 3.42 | 13.8% | 80149 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.3% | 641 |
| apc.LeeroyJenkins2 1.0 | 2.5 | 13.8% | 25 |
| hadur117.nano.SanaroS3 0.3 | 2.5 | 13.8% | 20 |
| TNT.TNT 0.99.1 | 4.0 | 10.7% | 11 |
| josago.Jorgito 0.16 | 5.1 | 9.1% | 2 |
| css.Delitioner 0.11 | 6.5 | 7.5% | 2 |
| tj.zombie1n 1.0.1 | 6.8 | 7.1% | 0 |
| rampancy.Durandal 2.1d | 7.9 | 5.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.1 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 67.3 | 1 / 35 | 4241 |
| 2 | 2 | 62.6 | 74.3 | 1 / 35 | 4046 |
| 3 | 3 | 60.4 | 68.6 | 2 / 35 | 3832 |
| 4 | 2 | 64.8 | 80.0 | 3 / 35 | 4398 |
| 5 | 3 | 61.9 | 73.0 | 1 / 35 | 3962 |
| 6 | 3 | 59.8 | 67.0 | 2 / 35 | 3681 |
| 7 | 3 | 60.7 | 68.6 | 0 / 35 | 3991 |
| 8 | 3 | 62.3 | 71.7 | 0 / 35 | 4152 |
| 9 | 3 | 61.1 | 73.3 | 0 / 35 | 3516 |
| 10 | 2 | 62.3 | 73.7 | 0 / 35 | 4167 |
| 11 | 2 | 63.3 | 79.0 | 2 / 35 | 3742 |
| 12 | 2 | 62.7 | 74.0 | 1 / 35 | 4079 |
| 13 | 2 | 63.2 | 77.5 | 2 / 35 | 4108 |
| 14 | 2 | 63.3 | 77.5 | 1 / 35 | 3964 |
| 15 | 3 | 59.9 | 66.7 | 1 / 35 | 3690 |
| 16 | 2 | 64.6 | 79.7 | 1 / 35 | 4451 |
| 17 | 2 | 61.0 | 68.6 | 0 / 35 | 4161 |
| 18 | 3 | 61.4 | 70.8 | 1 / 35 | 3892 |
| 19 | 3 | 62.8 | 74.3 | 1 / 35 | 4165 |
| 20 | 2 | 62.9 | 77.5 | 0 / 35 | 3911 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 319 | 3% |
| apc.LeeroyJenkins2 1.0 | 11 | 36% |
| TNT.TNT 0.99.1 | 8 | 13% |
| josago.Jorgito 0.16 | 1 | 100% |
| css.Delitioner 0.11 | 1 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 681 of 700 rounds, at a mean tick of 1199. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 465 | 68% | 477 |
| apc.LeeroyJenkins2 1.0 | 85 | 12% | 91 |
| josago.Jorgito 0.16 | 52 | 8% | 52 |
| TNT.TNT 0.99.1 | 34 | 5% | 35 |
| css.Delitioner 0.11 | 23 | 3% | 23 |
| tj.zombie1n 1.0.1 | 12 | 2% | 12 |
| rampancy.Durandal 2.1d | 7 | 1% | 7 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 2 |
| spin.Bugstard 0.012b | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 71.3 | 195 / 700 | 3.58 | 13.7% | 62768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.4 | 15.4% | 155 |
| origin.SleepSiphon 1.7b | 2.3 | 14.2% | 191 |
| hadur117.nano.SanaroS3 0.3 | 2.7 | 13.7% | 195 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.1% | 81 |
| mld.Wisdom 1.0 | 4.8 | 11.0% | 17 |
| gg.Wolverine 2.0 | 6.6 | 8.3% | 15 |
| DBall.NUKE 0.1 | 7.4 | 7.5% | 10 |
| spinnercat.Omen 1.0 | 7.5 | 7.9% | 17 |
| ers.nano.hawk.HawkLA 3.0m | 8.6 | 6.8% | 19 |
| sample.Fire 1.0 | 10.0 | 3.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 76.8 | 11 / 35 | 3271 |
| 2 | 1 | 63.7 | 82.2 | 12 / 35 | 3073 |
| 3 | 3 | 61.3 | 74.6 | 11 / 35 | 3169 |
| 4 | 2 | 62.0 | 75.6 | 12 / 35 | 3150 |
| 5 | 3 | 59.0 | 67.6 | 7 / 35 | 3143 |
| 6 | 3 | 58.6 | 64.1 | 8 / 35 | 3234 |
| 7 | 4 | 58.0 | 64.4 | 7 / 35 | 3075 |
| 8 | 3 | 61.1 | 71.7 | 12 / 35 | 3103 |
| 9 | 2 | 58.9 | 68.3 | 8 / 35 | 3111 |
| 10 | 2 | 61.4 | 76.5 | 9 / 35 | 2942 |
| 11 | 4 | 58.3 | 67.6 | 8 / 35 | 2752 |
| 12 | 2 | 62.0 | 74.3 | 11 / 35 | 3519 |
| 13 | 3 | 59.6 | 69.5 | 9 / 35 | 2921 |
| 14 | 3 | 59.2 | 66.3 | 8 / 35 | 3383 |
| 15 | 3 | 61.2 | 74.0 | 11 / 35 | 3018 |
| 16 | 4 | 58.7 | 66.7 | 7 / 35 | 2989 |
| 17 | 3 | 59.7 | 67.6 | 9 / 35 | 3317 |
| 18 | 3 | 60.7 | 72.7 | 10 / 35 | 2983 |
| 19 | 3 | 60.0 | 68.3 | 9 / 35 | 3188 |
| 20 | 1 | 63.5 | 78.1 | 16 / 35 | 3427 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 105 | 70% |
| origin.SleepSiphon 1.7b | 94 | 53% |
| pe.minimelee.SandboxMiniMelee 1.1 | 37 | 73% |
| gg.Wolverine 2.0 | 21 | 86% |
| spinnercat.Omen 1.0 | 12 | 50% |
| DBall.NUKE 0.1 | 12 | 92% |
| mld.Wisdom 1.0 | 9 | 67% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 100% |
| sample.Fire 1.0 | 1 | 0% |

Hadur died in 511 of 700 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 143 | 28% | 192 |
| origin.SleepSiphon 1.7b | 128 | 25% | 189 |
| pe.minimelee.SandboxMiniMelee 1.1 | 92 | 18% | 126 |
| mld.Wisdom 1.0 | 71 | 14% | 83 |
| spinnercat.Omen 1.0 | 26 | 5% | 32 |
| gg.Wolverine 2.0 | 23 | 5% | 34 |
| DBall.NUKE 0.1 | 15 | 3% | 27 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 2% | 13 |
| sample.Fire 1.0 | 3 | 1% | 4 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.nano.SanaroS3 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.2 | 242 / 700 | 2.26 | 18.9% | 92709 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.1 | 21.1% | 205 |
| hadur117.nano.SanaroS3 0.3 | 2.0 | 18.9% | 242 |
| franzor.Lizt 1.3.1 | 3.4 | 13.9% | 163 |
| oog.melee.CapuletDroid 1.1 | 3.6 | 13.7% | 81 |
| lrem.micro.MoggFanatic 0.2 | 5.2 | 10.2% | 1 |
| exauge.GateKeeper 1.1.121g | 5.9 | 8.9% | 3 |
| skm.PateranBotlock2 1.0 | 7.0 | 7.1% | 3 |
| drd.Dreadknoght 0.9 | 8.4 | 3.3% | 4 |
| sample.Target 1.0 | 8.6 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.0 | 83.6 | 11 / 35 | 4972 |
| 2 | 2 | 67.2 | 83.6 | 12 / 35 | 4475 |
| 3 | 2 | 66.9 | 86.1 | 8 / 35 | 4628 |
| 4 | 2 | 67.9 | 85.0 | 14 / 35 | 4656 |
| 5 | 2 | 68.6 | 87.1 | 13 / 35 | 4790 |
| 6 | 2 | 66.1 | 80.4 | 10 / 35 | 4192 |
| 7 | 2 | 68.0 | 86.1 | 15 / 35 | 4750 |
| 8 | 2 | 66.9 | 82.5 | 8 / 35 | 4674 |
| 9 | 2 | 66.9 | 82.5 | 13 / 35 | 4266 |
| 10 | 2 | 68.2 | 85.4 | 13 / 35 | 4738 |
| 11 | 2 | 65.7 | 78.2 | 7 / 35 | 4713 |
| 12 | 2 | 67.7 | 85.4 | 12 / 35 | 4768 |
| 13 | 1 | 69.7 | 89.3 | 17 / 35 | 5115 |
| 14 | 2 | 67.0 | 83.9 | 9 / 35 | 4579 |
| 15 | 2 | 68.7 | 87.9 | 18 / 35 | 4424 |
| 16 | 2 | 67.0 | 79.3 | 8 / 35 | 4882 |
| 17 | 2 | 66.0 | 79.3 | 9 / 35 | 4305 |
| 18 | 2 | 66.8 | 82.1 | 10 / 35 | 4428 |
| 19 | 2 | 69.8 | 89.6 | 18 / 35 | 4926 |
| 20 | 2 | 68.3 | 87.1 | 17 / 35 | 4428 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 229 | 58% |
| oog.melee.CapuletDroid 1.1 | 122 | 65% |
| franzor.Lizt 1.3.1 | 67 | 36% |
| skm.PateranBotlock2 1.0 | 4 | 25% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |
| drd.Dreadknoght 0.9 | 2 | 50% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 459 of 700 rounds, at a mean tick of 1593. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 284 | 62% | 474 |
| oog.melee.CapuletDroid 1.1 | 82 | 18% | 162 |
| franzor.Lizt 1.3.1 | 67 | 15% | 6 |
| exauge.GateKeeper 1.1.121g | 10 | 2% | 24 |
| skm.PateranBotlock2 1.0 | 10 | 2% | 15 |
| lrem.micro.MoggFanatic 0.2 | 3 | 1% | 9 |
| drd.Dreadknoght 0.9 | 3 | 1% | 8 |

## Melee bench: F08

hadur117.nano.SanaroS3 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 76.2 | 253 / 700 | 2.91 | 16.5% | 66481 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.8 | 16.5% | 253 |
| tm.Yuugao 1.0 | 2.1 | 15.8% | 152 |
| shrub.Vapour v159 | 2.2 | 15.9% | 185 |
| com.spp.robocode.MostlyHarmless 010 | 4.4 | 11.4% | 52 |
| m3thos.Eva00 1.1 | 5.1 | 10.1% | 23 |
| jwst.DAD.DarkAndDarker 1.1 | 5.7 | 9.5% | 29 |
| SHAM.WOW 1.4 | 7.8 | 7.1% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.9 | 6.9% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 6.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.1 | 77.1 | 9 / 35 | 3011 |
| 2 | 1 | 60.8 | 72.5 | 12 / 35 | 3213 |
| 3 | 1 | 64.2 | 81.8 | 16 / 35 | 3537 |
| 4 | 1 | 64.6 | 81.8 | 19 / 35 | 3610 |
| 5 | 3 | 59.2 | 69.3 | 10 / 35 | 3002 |
| 6 | 1 | 64.9 | 82.9 | 18 / 35 | 3603 |
| 7 | 3 | 59.5 | 66.1 | 8 / 35 | 3492 |
| 8 | 1 | 62.8 | 79.6 | 11 / 35 | 3221 |
| 9 | 3 | 59.1 | 69.3 | 7 / 35 | 3018 |
| 10 | 2 | 61.8 | 75.0 | 10 / 35 | 3373 |
| 11 | 3 | 61.3 | 71.4 | 13 / 35 | 3350 |
| 12 | 1 | 65.0 | 82.5 | 16 / 35 | 3601 |
| 13 | 1 | 61.3 | 73.6 | 13 / 35 | 3120 |
| 14 | 2 | 63.4 | 77.1 | 17 / 35 | 3229 |
| 15 | 1 | 63.4 | 78.2 | 16 / 35 | 3252 |
| 16 | 2 | 61.9 | 74.6 | 9 / 35 | 3304 |
| 17 | 2 | 62.2 | 75.7 | 7 / 35 | 3556 |
| 18 | 1 | 63.2 | 80.7 | 13 / 35 | 3322 |
| 19 | 1 | 63.6 | 80.4 | 16 / 35 | 3373 |
| 20 | 2 | 62.1 | 73.9 | 13 / 35 | 3294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 164 | 71% |
| shrub.Vapour v159 | 115 | 43% |
| com.spp.robocode.MostlyHarmless 010 | 58 | 76% |
| jwst.DAD.DarkAndDarker 1.1 | 30 | 73% |
| m3thos.Eva00 1.1 | 20 | 60% |
| SHAM.WOW 1.4 | 5 | 60% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 67% |

Hadur died in 452 of 700 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 162 | 36% | 208 |
| tm.Yuugao 1.0 | 120 | 27% | 241 |
| com.spp.robocode.MostlyHarmless 010 | 52 | 12% | 93 |
| jwst.DAD.DarkAndDarker 1.1 | 35 | 8% | 56 |
| m3thos.Eva00 1.1 | 32 | 7% | 44 |
| zyx.nano.BacillusComma 1.0 | 18 | 4% | 23 |
| qualidafial.MajorDick 1.0.1 | 16 | 4% | 17 |
| SHAM.WOW 1.4 | 15 | 3% | 18 |
2 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 62.7 | 86 / 700 | 4.36 | 11.8% | 53825 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 18.1% | 378 |
| kc.micro.Figment 1.0 | 2.0 | 15.0% | 131 |
| hadur117.nano.SanaroS3 0.3 | 3.6 | 11.8% | 86 |
| yagami.Tidus 0.11 | 4.1 | 11.3% | 11 |
| pedersen.Grishnakh 1.0 | 4.6 | 10.6% | 43 |
| mc2.enemy.Original 0.9 | 5.9 | 9.3% | 41 |
| dft.Calliope 5.6 | 6.9 | 8.0% | 8 |
| step.nanoPri 1.0 | 8.5 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.1 | 5.1% | 2 |
| rdm.Dueler 0.4x | 9.4 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.6 | 54.6 | 3 / 35 | 2357 |
| 2 | 3 | 56.8 | 63.2 | 4 / 35 | 2509 |
| 3 | 4 | 55.9 | 61.6 | 4 / 35 | 2362 |
| 4 | 3 | 61.5 | 75.2 | 8 / 35 | 2802 |
| 5 | 4 | 55.9 | 60.6 | 3 / 35 | 2556 |
| 6 | 3 | 59.4 | 66.7 | 5 / 35 | 2997 |
| 7 | 3 | 58.4 | 66.7 | 5 / 35 | 2781 |
| 8 | 4 | 55.4 | 59.7 | 2 / 35 | 2674 |
| 9 | 3 | 57.7 | 65.7 | 5 / 35 | 2869 |
| 10 | 3 | 56.3 | 62.2 | 5 / 35 | 2753 |
| 11 | 4 | 56.8 | 62.2 | 3 / 35 | 2918 |
| 12 | 3 | 57.2 | 61.9 | 7 / 35 | 2812 |
| 13 | 4 | 55.0 | 58.1 | 3 / 35 | 2508 |
| 14 | 3 | 58.8 | 67.0 | 6 / 35 | 2739 |
| 15 | 4 | 57.1 | 63.2 | 6 / 35 | 2583 |
| 16 | 3 | 57.2 | 61.6 | 5 / 35 | 2804 |
| 17 | 4 | 55.4 | 59.0 | 6 / 35 | 2692 |
| 18 | 5 | 54.6 | 58.1 | 1 / 35 | 2600 |
| 19 | 4 | 55.9 | 59.0 | 3 / 35 | 2880 |
| 20 | 3 | 57.6 | 67.0 | 2 / 35 | 2629 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 130 | 23% |
| kc.micro.Figment 1.0 | 65 | 34% |
| mc2.enemy.Original 0.9 | 17 | 65% |
| pedersen.Grishnakh 1.0 | 17 | 53% |
| yagami.Tidus 0.11 | 9 | 78% |
| dft.Calliope 5.6 | 6 | 83% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 614 of 700 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 207 | 34% | 237 |
| kc.micro.Figment 1.0 | 167 | 27% | 189 |
| yagami.Tidus 0.11 | 73 | 12% | 85 |
| pedersen.Grishnakh 1.0 | 54 | 9% | 59 |
| mc2.enemy.Original 0.9 | 41 | 7% | 51 |
| dft.Calliope 5.6 | 25 | 4% | 30 |
| robar.nano.Assertive_Melee 0.2 | 25 | 4% | 26 |
| rdm.Dueler 0.4x | 12 | 2% | 12 |
| step.nanoPri 1.0 | 10 | 2% | 11 |

## Melee bench: F10

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 81.3 | 253 / 700 | 2.68 | 15.7% | 77523 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.6 | 15.7% | 253 |
| DTF.Kludgy 1.2b | 2.2 | 14.8% | 169 |
| ejb.Polaris 1.0.1 | 3.1 | 13.5% | 98 |
| ne.Chimera 1.2 | 3.5 | 13.2% | 66 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.8% | 82 |
| vStar.RAFzilla 2.15 | 5.6 | 10.3% | 17 |
| sam.Samspin 1.0 | 7.7 | 6.1% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.7% | 1 |
| kurios.DOSexe .9b | 8.4 | 5.5% | 7 |
| donjezza.Muncho 1.0 | 9.8 | 4.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 81.6 | 13 / 35 | 3498 |
| 2 | 3 | 62.7 | 74.6 | 8 / 35 | 4125 |
| 3 | 2 | 63.6 | 78.1 | 13 / 35 | 4003 |
| 4 | 1 | 67.3 | 86.7 | 20 / 35 | 4531 |
| 5 | 1 | 62.1 | 77.1 | 12 / 35 | 3429 |
| 6 | 1 | 64.9 | 83.2 | 16 / 35 | 3975 |
| 7 | 1 | 63.1 | 81.3 | 11 / 35 | 3591 |
| 8 | 1 | 65.5 | 85.1 | 12 / 35 | 4331 |
| 9 | 3 | 62.5 | 78.7 | 7 / 35 | 3591 |
| 10 | 2 | 62.7 | 77.1 | 8 / 35 | 3820 |
| 11 | 1 | 64.3 | 80.3 | 14 / 35 | 3952 |
| 12 | 1 | 65.3 | 85.1 | 14 / 35 | 3950 |
| 13 | 2 | 63.8 | 80.3 | 13 / 35 | 3392 |
| 14 | 1 | 64.2 | 81.6 | 13 / 35 | 3814 |
| 15 | 1 | 64.4 | 84.8 | 10 / 35 | 3828 |
| 16 | 2 | 63.3 | 79.0 | 13 / 35 | 3710 |
| 17 | 2 | 65.6 | 82.2 | 17 / 35 | 4031 |
| 18 | 1 | 65.4 | 86.7 | 14 / 35 | 4137 |
| 19 | 2 | 63.6 | 80.0 | 11 / 35 | 3960 |
| 20 | 1 | 64.4 | 83.5 | 14 / 35 | 3855 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 136 | 50% |
| ejb.Polaris 1.0.1 | 131 | 76% |
| ne.Chimera 1.2 | 47 | 53% |
| tvv.micro.Antares 1.1.1 | 46 | 24% |
| vStar.RAFzilla 2.15 | 36 | 83% |
| kurios.DOSexe .9b | 14 | 79% |
| sam.Samspin 1.0 | 6 | 33% |
| donjezza.Muncho 1.0 | 6 | 83% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 447 of 700 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 139 | 31% | 193 |
| ne.Chimera 1.2 | 114 | 26% | 148 |
| tvv.micro.Antares 1.1.1 | 69 | 15% | 68 |
| ejb.Polaris 1.0.1 | 68 | 15% | 179 |
| vStar.RAFzilla 2.15 | 16 | 4% | 46 |
| sam.Samspin 1.0 | 16 | 4% | 18 |
| kurios.DOSexe .9b | 14 | 3% | 29 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 2% | 9 |
| donjezza.Muncho 1.0 | 4 | 1% | 10 |

## Melee bench: F11

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 66.0 | 112 / 700 | 4.06 | 12.5% | 57344 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.0% | 278 |
| cx.mini.Nimrod 0.55 | 2.5 | 13.1% | 96 |
| hadur117.nano.SanaroS3 0.3 | 2.7 | 12.5% | 112 |
| djc.DynaBot 0.1.1 | 4.2 | 11.0% | 55 |
| rdt199.Warlord 0.73 | 5.8 | 9.6% | 53 |
| br2.MobyDickBot 1.6 | 5.8 | 9.5% | 40 |
| uji.YellohFellah 1.0 | 6.3 | 9.1% | 63 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.5% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.8% | 1 |
| stelo.MirrorNano 1.3 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 69.8 | 5 / 35 | 2935 |
| 2 | 2 | 60.3 | 71.7 | 8 / 35 | 3063 |
| 3 | 3 | 54.3 | 58.4 | 3 / 35 | 2661 |
| 4 | 3 | 54.2 | 59.7 | 2 / 35 | 2708 |
| 5 | 3 | 56.7 | 62.5 | 4 / 35 | 2911 |
| 6 | 2 | 60.5 | 72.4 | 11 / 35 | 2918 |
| 7 | 2 | 59.8 | 71.1 | 9 / 35 | 2787 |
| 8 | 4 | 56.6 | 62.5 | 4 / 35 | 2865 |
| 9 | 3 | 56.3 | 61.3 | 8 / 35 | 2692 |
| 10 | 3 | 56.1 | 62.5 | 4 / 35 | 2761 |
| 11 | 3 | 58.3 | 67.0 | 2 / 35 | 3248 |
| 12 | 3 | 58.2 | 68.9 | 3 / 35 | 2885 |
| 13 | 2 | 58.5 | 68.3 | 5 / 35 | 2943 |
| 14 | 2 | 58.5 | 69.2 | 7 / 35 | 2820 |
| 15 | 3 | 56.8 | 64.1 | 4 / 35 | 3086 |
| 16 | 3 | 57.8 | 67.6 | 8 / 35 | 2645 |
| 17 | 3 | 56.0 | 61.3 | 5 / 35 | 2970 |
| 18 | 2 | 57.9 | 68.6 | 6 / 35 | 2772 |
| 19 | 2 | 58.1 | 66.3 | 7 / 35 | 2750 |
| 20 | 2 | 58.7 | 67.6 | 7 / 35 | 2924 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 120 | 33% |
| uji.YellohFellah 1.0 | 35 | 31% |
| cx.mini.Nimrod 0.55 | 30 | 43% |
| rdt199.Warlord 0.73 | 27 | 74% |
| br2.MobyDickBot 1.6 | 21 | 48% |
| djc.DynaBot 0.1.1 | 20 | 75% |
| KiraNL.Chupacabra 0.4 | 4 | 75% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 588 of 700 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 216 | 37% | 250 |
| cx.mini.Nimrod 0.55 | 111 | 19% | 121 |
| rdt199.Warlord 0.73 | 60 | 10% | 82 |
| uji.YellohFellah 1.0 | 49 | 8% | 68 |
| djc.DynaBot 0.1.1 | 48 | 8% | 59 |
| br2.MobyDickBot 1.6 | 34 | 6% | 46 |
| KiraNL.Chupacabra 0.4 | 33 | 6% | 36 |
| stelo.MirrorNano 1.3 | 22 | 4% | 23 |
| jeremyreeder.Vincent 2011.12.09 | 15 | 3% | 15 |

## Melee bench: F12

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 69.4 | 150 / 700 | 3.75 | 13.1% | 54102 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.6 | 14.5% | 160 |
| nat.PallasHawk 1.0 | 2.5 | 14.0% | 175 |
| darkcanuck.Leon 1.01 | 3.0 | 13.5% | 138 |
| hadur117.nano.SanaroS3 0.3 | 3.2 | 13.1% | 150 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.5% | 45 |
| jrm.Test0 1.0 | 6.4 | 8.2% | 6 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.2% | 4 |
| jp.Perpy 16.0 | 7.4 | 7.3% | 5 |
| jaybot.bots.Oddball 4.0 | 9.4 | 5.9% | 18 |
| stuff.Vlad 0.1 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 75.9 | 8 / 35 | 2768 |
| 2 | 4 | 56.6 | 64.4 | 6 / 35 | 2528 |
| 3 | 3 | 60.7 | 74.3 | 11 / 35 | 2659 |
| 4 | 4 | 57.1 | 66.0 | 6 / 35 | 2483 |
| 5 | 5 | 55.9 | 62.9 | 3 / 35 | 2398 |
| 6 | 2 | 60.2 | 75.9 | 7 / 35 | 2527 |
| 7 | 3 | 59.3 | 67.9 | 10 / 35 | 2804 |
| 8 | 4 | 56.1 | 62.9 | 6 / 35 | 2473 |
| 9 | 2 | 59.3 | 70.8 | 8 / 35 | 2667 |
| 10 | 3 | 59.1 | 70.2 | 8 / 35 | 2656 |
| 11 | 3 | 59.8 | 71.4 | 9 / 35 | 2750 |
| 12 | 3 | 59.2 | 70.5 | 5 / 35 | 2992 |
| 13 | 4 | 57.8 | 63.5 | 9 / 35 | 2864 |
| 14 | 4 | 57.0 | 65.1 | 7 / 35 | 2536 |
| 15 | 2 | 61.1 | 74.6 | 8 / 35 | 2845 |
| 16 | 2 | 60.3 | 74.3 | 7 / 35 | 2818 |
| 17 | 3 | 61.3 | 73.3 | 9 / 35 | 3106 |
| 18 | 4 | 58.4 | 66.3 | 8 / 35 | 2778 |
| 19 | 4 | 58.4 | 68.3 | 7 / 35 | 2680 |
| 20 | 3 | 59.2 | 69.5 | 8 / 35 | 2770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 110 | 37% |
| bts.wiki.RipCurl 0.9b | 89 | 56% |
| nat.PallasHawk 1.0 | 89 | 27% |
| brainfade.melee.Genghis 0.36 | 24 | 75% |
| jaybot.bots.Oddball 4.0 | 8 | 0% |
| cs.sheldor.Talon 1.1 | 6 | 100% |
| jp.Perpy 16.0 | 6 | 100% |
| jrm.Test0 1.0 | 5 | 80% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 550 of 700 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 130 | 24% | 157 |
| darkcanuck.Leon 1.01 | 123 | 22% | 176 |
| bts.wiki.RipCurl 0.9b | 111 | 20% | 156 |
| brainfade.melee.Genghis 0.36 | 56 | 10% | 64 |
| jrm.Test0 1.0 | 56 | 10% | 60 |
| jp.Perpy 16.0 | 27 | 5% | 34 |
| jaybot.bots.Oddball 4.0 | 20 | 4% | 19 |
| cs.sheldor.Talon 1.1 | 19 | 3% | 23 |
| stuff.Vlad 0.1 | 8 | 1% | 8 |

## Melee bench: F13

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 73.3 | 117 / 700 | 3.41 | 13.2% | 60713 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.3% | 302 |
| ags.Glacier 0.2.11 | 1.7 | 16.9% | 172 |
| hadur117.nano.SanaroS3 0.3 | 3.3 | 13.2% | 117 |
| shinh.Entangled 0.3 | 4.1 | 12.2% | 66 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.6% | 37 |
| apc.Colossus2 0.17 | 6.1 | 8.3% | 2 |
| stelo.Wang 1.0 | 7.0 | 7.2% | 6 |
| ayk.WallHugger 1.0 | 8.3 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.3 | 74.9 | 4 / 35 | 2626 |
| 2 | 3 | 62.9 | 79.7 | 8 / 35 | 3267 |
| 3 | 3 | 60.8 | 70.8 | 9 / 35 | 3130 |
| 4 | 4 | 58.2 | 66.0 | 4 / 35 | 2982 |
| 5 | 3 | 60.6 | 72.7 | 7 / 35 | 3071 |
| 6 | 3 | 63.1 | 81.9 | 9 / 35 | 2917 |
| 7 | 3 | 62.8 | 80.6 | 7 / 35 | 3113 |
| 8 | 3 | 59.9 | 69.5 | 6 / 35 | 3270 |
| 9 | 4 | 60.0 | 74.0 | 6 / 35 | 2870 |
| 10 | 4 | 60.0 | 67.3 | 2 / 35 | 3844 |
| 11 | 3 | 60.8 | 74.6 | 6 / 35 | 3023 |
| 12 | 3 | 60.1 | 74.0 | 2 / 35 | 2885 |
| 13 | 3 | 63.6 | 80.3 | 15 / 35 | 3141 |
| 14 | 3 | 59.6 | 69.5 | 6 / 35 | 3049 |
| 15 | 3 | 60.4 | 71.7 | 5 / 35 | 3188 |
| 16 | 4 | 58.9 | 70.2 | 5 / 35 | 2668 |
| 17 | 3 | 60.5 | 74.6 | 6 / 35 | 3021 |
| 18 | 3 | 60.9 | 75.6 | 4 / 35 | 3077 |
| 19 | 4 | 57.6 | 65.1 | 2 / 35 | 2915 |
| 20 | 3 | 59.1 | 72.4 | 4 / 35 | 2656 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 176 | 43% |
| ags.Glacier 0.2.11 | 92 | 14% |
| shinh.Entangled 0.3 | 36 | 36% |
| gh.micro.Gruweltje 0.7 | 16 | 56% |
| stelo.Wang 1.0 | 8 | 63% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 585 of 700 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 184 | 31% | 256 |
| ags.Glacier 0.2.11 | 182 | 31% | 198 |
| shinh.Entangled 0.3 | 75 | 13% | 87 |
| gh.micro.Gruweltje 0.7 | 74 | 13% | 84 |
| stelo.Wang 1.0 | 26 | 4% | 31 |
| apc.Colossus2 0.17 | 20 | 3% | 22 |
| maribo.FollowFire 1 | 13 | 2% | 12 |
| ayk.WallHugger 1.0 | 8 | 1% | 8 |
| sample.Tracker 1.0 | 1 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F14

hadur117.nano.SanaroS3 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 80.0 | 243 / 700 | 2.60 | 16.4% | 62889 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 20.0% | 316 |
| hadur117.nano.SanaroS3 0.3 | 2.0 | 16.4% | 243 |
| dmh.robocode.robot.RedDwarf 0.4 | 3.7 | 12.4% | 19 |
| Lo_Ian.Gandalf_V4 4.0 | 4.4 | 11.7% | 29 |
| co.edu.usb.rc.LidisTron 1.0 | 5.1 | 11.1% | 25 |
| sanyi.mikrobi.Roberto 1.0 | 5.1 | 11.0% | 30 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 9.2% | 34 |
| pa.Improved 1.0 | 8.0 | 6.1% | 5 |
| sample.TrackFire 1.0 | 9.0 | 2.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 80.0 | 8 / 35 | 3161 |
| 2 | 2 | 63.5 | 79.6 | 12 / 35 | 3246 |
| 3 | 2 | 62.2 | 75.0 | 12 / 35 | 3092 |
| 4 | 2 | 63.0 | 78.2 | 12 / 35 | 3288 |
| 5 | 2 | 60.2 | 71.1 | 11 / 35 | 2652 |
| 6 | 2 | 63.8 | 81.4 | 11 / 35 | 3356 |
| 7 | 2 | 64.2 | 85.7 | 12 / 35 | 3074 |
| 8 | 2 | 63.2 | 77.5 | 12 / 35 | 3387 |
| 9 | 2 | 64.9 | 84.6 | 14 / 35 | 3548 |
| 10 | 2 | 64.5 | 83.9 | 16 / 35 | 3171 |
| 11 | 2 | 64.3 | 81.8 | 20 / 35 | 3061 |
| 12 | 2 | 62.4 | 78.2 | 9 / 35 | 3100 |
| 13 | 2 | 63.0 | 80.4 | 10 / 35 | 2842 |
| 14 | 2 | 64.6 | 84.3 | 15 / 35 | 3271 |
| 15 | 2 | 60.3 | 71.8 | 10 / 35 | 2622 |
| 16 | 2 | 64.2 | 84.6 | 10 / 35 | 3329 |
| 17 | 2 | 62.7 | 76.8 | 13 / 35 | 3010 |
| 18 | 2 | 63.8 | 81.1 | 15 / 35 | 3048 |
| 19 | 2 | 61.7 | 79.3 | 8 / 35 | 2909 |
| 20 | 2 | 65.1 | 84.3 | 13 / 35 | 3722 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 296 | 46% |
| co.edu.usb.rc.LidisTron 1.0 | 40 | 63% |
| dmh.robocode.robot.RedDwarf 0.4 | 32 | 69% |
| sheldor.micro.PointInLineRRAL 1.0 | 30 | 83% |
| sanyi.mikrobi.Roberto 1.0 | 27 | 67% |
| Lo_Ian.Gandalf_V4 4.0 | 22 | 73% |
| pa.Improved 1.0 | 5 | 20% |
| sample.TrackFire 1.0 | 1 | 0% |

Hadur died in 459 of 700 rounds, at a mean tick of 1022. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 239 | 52% | 372 |
| dmh.robocode.robot.RedDwarf 0.4 | 65 | 14% | 85 |
| co.edu.usb.rc.LidisTron 1.0 | 42 | 9% | 36 |
| Lo_Ian.Gandalf_V4 4.0 | 39 | 8% | 57 |
| sanyi.mikrobi.Roberto 1.0 | 32 | 7% | 66 |
| sheldor.micro.PointInLineRRAL 1.0 | 29 | 6% | 62 |
| pa.Improved 1.0 | 8 | 2% | 13 |
| sample.TrackFire 1.0 | 4 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 68.5 | 136 / 700 | 3.83 | 13.5% | 71962 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.4 | 15.0% | 150 |
| hadur117.nano.SanaroS3 0.3 | 2.6 | 13.5% | 136 |
| emp.Yngwie 1.11 | 3.0 | 13.4% | 188 |
| mld.DustBunny 3.8 | 3.1 | 13.4% | 81 |
| cb.nano.Insomnia 1.0 | 5.2 | 11.2% | 38 |
| kawigi.robot.Girl 1.2 | 5.8 | 10.2% | 93 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.8% | 1 |
| lambdaxy.TBot 0.1 | 7.7 | 6.8% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.3% | 12 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 67.9 | 6 / 35 | 3825 |
| 2 | 2 | 61.4 | 74.0 | 5 / 35 | 3849 |
| 3 | 3 | 59.0 | 65.7 | 4 / 35 | 3950 |
| 4 | 1 | 62.0 | 70.8 | 11 / 35 | 3969 |
| 5 | 3 | 59.3 | 66.7 | 7 / 35 | 3356 |
| 6 | 1 | 63.7 | 78.7 | 12 / 35 | 3782 |
| 7 | 2 | 59.1 | 67.9 | 5 / 35 | 3282 |
| 8 | 4 | 58.9 | 67.9 | 4 / 35 | 3159 |
| 9 | 2 | 60.0 | 68.3 | 6 / 35 | 3684 |
| 10 | 3 | 60.3 | 69.5 | 7 / 35 | 3440 |
| 11 | 2 | 59.9 | 68.9 | 7 / 35 | 3536 |
| 12 | 2 | 61.5 | 69.8 | 7 / 35 | 4150 |
| 13 | 4 | 57.8 | 61.9 | 4 / 35 | 3574 |
| 14 | 2 | 59.7 | 68.3 | 6 / 35 | 3534 |
| 15 | 4 | 57.7 | 62.9 | 4 / 35 | 3272 |
| 16 | 3 | 60.9 | 68.6 | 10 / 35 | 3740 |
| 17 | 3 | 60.1 | 68.3 | 7 / 35 | 3494 |
| 18 | 4 | 57.2 | 62.9 | 5 / 35 | 3138 |
| 19 | 3 | 60.6 | 70.2 | 9 / 35 | 3381 |
| 20 | 1 | 61.8 | 71.4 | 10 / 35 | 3847 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 94 | 54% |
| kawigi.micro.Shiz 1.1 | 60 | 38% |
| mld.DustBunny 3.8 | 38 | 24% |
| kawigi.robot.Girl 1.2 | 30 | 73% |
| cb.nano.Insomnia 1.0 | 30 | 73% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| Grystrion.TrackerWO 1.0 | 3 | 67% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 50% |
| lambdaxy.TBot 0.1 | 2 | 100% |

Hadur died in 564 of 700 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 126 | 22% | 183 |
| kawigi.micro.Shiz 1.1 | 124 | 22% | 150 |
| mld.DustBunny 3.8 | 110 | 20% | 136 |
| cb.nano.Insomnia 1.0 | 79 | 14% | 73 |
| kawigi.robot.Girl 1.2 | 63 | 11% | 84 |
| Grystrion.TrackerWO 1.0 | 23 | 4% | 25 |
| lambdaxy.TBot 0.1 | 21 | 4% | 23 |
| divineomega.TrialBot 0.003 | 14 | 2% | 22 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 4 | 1% | 4 |

## Melee bench: F16

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 67.9 | 123 / 700 | 3.89 | 13.5% | 72488 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.1 | 17.7% | 285 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.2 | 14.7% | 37 |
| hadur117.nano.SanaroS3 0.3 | 3.0 | 13.5% | 123 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 11.3% | 153 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.9% | 55 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 9.4% | 10 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.9% | 12 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.4% | 23 |
| asd.Cthulhu 1.3 | 9.1 | 5.1% | 1 |
| repositorio.NanoStep 1.0 | 9.3 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 67.9 | 6 / 35 | 3408 |
| 2 | 3 | 62.4 | 73.7 | 7 / 35 | 3629 |
| 3 | 2 | 61.2 | 70.2 | 6 / 35 | 3875 |
| 4 | 3 | 60.1 | 67.3 | 5 / 35 | 3780 |
| 5 | 4 | 56.8 | 61.0 | 4 / 35 | 3045 |
| 6 | 3 | 60.4 | 67.6 | 6 / 35 | 3603 |
| 7 | 3 | 61.7 | 71.4 | 9 / 35 | 3698 |
| 8 | 2 | 60.8 | 69.2 | 7 / 35 | 3786 |
| 9 | 3 | 59.4 | 66.7 | 6 / 35 | 3355 |
| 10 | 4 | 54.3 | 54.6 | 1 / 35 | 3134 |
| 11 | 4 | 57.7 | 60.6 | 6 / 35 | 3612 |
| 12 | 2 | 63.7 | 77.1 | 7 / 35 | 3843 |
| 13 | 3 | 61.4 | 70.5 | 9 / 35 | 3419 |
| 14 | 3 | 61.4 | 68.3 | 8 / 35 | 3988 |
| 15 | 3 | 59.5 | 66.0 | 6 / 35 | 3537 |
| 16 | 2 | 62.6 | 74.3 | 9 / 35 | 3909 |
| 17 | 3 | 58.6 | 62.9 | 4 / 35 | 3614 |
| 18 | 3 | 60.3 | 67.6 | 4 / 35 | 3890 |
| 19 | 3 | 61.2 | 71.7 | 8 / 35 | 3615 |
| 20 | 3 | 60.4 | 69.8 | 5 / 35 | 3748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 169 | 30% |
| techdude.forest.FlamingForest 1.1 | 38 | 29% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 25 | 92% |
| tvv.nano.Polaris 1.2 | 18 | 22% |
| bvh.fnr.Fenrir 0.36l | 17 | 71% |
| stelo.IntrinsicVolatility 1.4 | 13 | 100% |
| divineomega.DivineBot 1.9.4.5 | 11 | 73% |
| repositorio.NanoStep 1.0 | 3 | 67% |

Hadur died in 577 of 700 rounds, at a mean tick of 1206. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 249 | 43% | 304 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 98 | 17% | 118 |
| bvh.fnr.Fenrir 0.36l | 66 | 11% | 71 |
| techdude.forest.FlamingForest 1.1 | 60 | 10% | 79 |
| tvv.nano.Polaris 1.2 | 35 | 6% | 37 |
| divineomega.DivineBot 1.9.4.5 | 28 | 5% | 35 |
| stelo.IntrinsicVolatility 1.4 | 26 | 5% | 38 |
| asd.Cthulhu 1.3 | 13 | 2% | 13 |
| repositorio.NanoStep 1.0 | 2 | 0% | 5 |

## Melee bench: F17

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 68.2 | 152 / 700 | 3.86 | 13.3% | 67422 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 2.1 | 14.1% | 122 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.0% | 157 |
| hadur117.nano.SanaroS3 0.3 | 2.8 | 13.3% | 152 |
| cx.BlestPain 1.41 | 3.7 | 12.8% | 133 |
| nic.Nicator 2.4 | 4.5 | 11.9% | 65 |
| ahf.NanoAndrew .4 | 5.8 | 11.0% | 55 |
| maribo.melee.BMV 0.1 | 7.0 | 9.2% | 12 |
| tex.Longbot 0.4 | 8.5 | 5.7% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.6 | 5.4% | 4 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 71.1 | 9 / 35 | 3135 |
| 2 | 1 | 62.6 | 71.7 | 14 / 35 | 3774 |
| 3 | 2 | 60.0 | 68.6 | 4 / 35 | 3689 |
| 4 | 3 | 59.8 | 68.6 | 6 / 35 | 3665 |
| 5 | 4 | 60.1 | 67.0 | 7 / 35 | 3602 |
| 6 | 6 | 55.2 | 56.5 | 1 / 35 | 3150 |
| 7 | 3 | 61.0 | 65.4 | 10 / 35 | 4015 |
| 8 | 2 | 61.6 | 74.3 | 8 / 35 | 3464 |
| 9 | 3 | 60.4 | 67.0 | 8 / 35 | 3651 |
| 10 | 4 | 58.5 | 64.4 | 7 / 35 | 3286 |
| 11 | 2 | 61.6 | 73.3 | 10 / 35 | 3436 |
| 12 | 3 | 57.7 | 64.4 | 4 / 35 | 3162 |
| 13 | 4 | 57.2 | 61.9 | 6 / 35 | 2939 |
| 14 | 5 | 56.6 | 59.4 | 8 / 35 | 3105 |
| 15 | 4 | 58.3 | 65.1 | 5 / 35 | 2979 |
| 16 | 2 | 62.1 | 75.6 | 9 / 35 | 3258 |
| 17 | 1 | 61.2 | 74.6 | 9 / 35 | 3156 |
| 18 | 1 | 61.8 | 74.3 | 10 / 35 | 3432 |
| 19 | 3 | 58.4 | 65.1 | 7 / 35 | 3018 |
| 20 | 1 | 62.7 | 75.9 | 10 / 35 | 3506 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 83 | 61% |
| et.Predator 1.8 | 82 | 39% |
| cx.BlestPain 1.41 | 43 | 74% |
| nic.Nicator 2.4 | 38 | 53% |
| ahf.NanoAndrew .4 | 25 | 56% |
| edu.otg.spr.TheTeacher 1.2 | 3 | 33% |
| maribo.melee.BMV 0.1 | 2 | 50% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 548 of 700 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 130 | 24% | 159 |
| oog.melee.Mercutio 1.0 | 105 | 19% | 158 |
| ahf.NanoAndrew .4 | 87 | 16% | 99 |
| cx.BlestPain 1.41 | 85 | 16% | 119 |
| nic.Nicator 2.4 | 78 | 14% | 96 |
| maribo.melee.BMV 0.1 | 39 | 7% | 41 |
| tex.Longbot 0.4 | 13 | 2% | 14 |
| edu.otg.spr.TheTeacher 1.2 | 7 | 1% | 9 |
| goblin.Bender 2.4 | 4 | 1% | 5 |

## Melee bench: F18

hadur117.nano.SanaroS3 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 73.8 | 254 / 700 | 3.09 | 15.9% | 60034 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.4 | 15.9% | 254 |
| agd.Mooserwirt2 2.7 | 1.8 | 14.8% | 160 |
| uji.DBH 1.1 | 3.3 | 12.9% | 72 |
| ratosh.Nobo 0.21 | 4.2 | 12.2% | 40 |
| spinnercat.Robovirus 2.718 | 4.8 | 11.8% | 37 |
| sigterm.Sigterm 1.0 | 5.8 | 10.5% | 72 |
| kawigi.mini.Fhqwhgads 1.1 | 7.0 | 8.5% | 20 |
| stelo.WangRobot 1.0 | 8.1 | 7.2% | 41 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.8 | 6.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 75.0 | 12 / 35 | 3062 |
| 2 | 2 | 58.0 | 67.9 | 9 / 35 | 2692 |
| 3 | 1 | 57.4 | 65.0 | 11 / 35 | 2714 |
| 4 | 1 | 64.9 | 82.5 | 19 / 35 | 3738 |
| 5 | 2 | 59.9 | 72.9 | 7 / 35 | 3080 |
| 6 | 2 | 61.2 | 73.6 | 14 / 35 | 2880 |
| 7 | 1 | 63.1 | 78.9 | 19 / 35 | 2998 |
| 8 | 1 | 62.7 | 77.5 | 17 / 35 | 2966 |
| 9 | 1 | 62.0 | 74.6 | 15 / 35 | 3171 |
| 10 | 2 | 61.2 | 76.8 | 12 / 35 | 2844 |
| 11 | 1 | 60.0 | 71.1 | 11 / 35 | 3069 |
| 12 | 1 | 59.6 | 70.0 | 10 / 35 | 2964 |
| 13 | 2 | 60.1 | 72.1 | 10 / 35 | 2815 |
| 14 | 2 | 57.8 | 66.8 | 8 / 35 | 2800 |
| 15 | 1 | 60.6 | 74.3 | 11 / 35 | 3122 |
| 16 | 1 | 61.4 | 73.9 | 14 / 35 | 3093 |
| 17 | 1 | 62.9 | 79.3 | 16 / 35 | 2995 |
| 18 | 1 | 60.4 | 72.1 | 14 / 35 | 2794 |
| 19 | 2 | 60.9 | 74.6 | 11 / 35 | 2930 |
| 20 | 1 | 62.7 | 77.9 | 14 / 35 | 3307 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 135 | 65% |
| spinnercat.Robovirus 2.718 | 63 | 89% |
| uji.DBH 1.1 | 57 | 46% |
| sigterm.Sigterm 1.0 | 44 | 61% |
| ratosh.Nobo 0.21 | 39 | 79% |
| stelo.WangRobot 1.0 | 29 | 45% |
| kawigi.mini.Fhqwhgads 1.1 | 11 | 64% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5 | 60% |

Hadur died in 446 of 700 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 105 | 24% | 197 |
| uji.DBH 1.1 | 84 | 19% | 99 |
| ratosh.Nobo 0.21 | 67 | 15% | 109 |
| spinnercat.Robovirus 2.718 | 46 | 10% | 83 |
| sigterm.Sigterm 1.0 | 46 | 10% | 71 |
| stelo.WangRobot 1.0 | 39 | 9% | 54 |
| kawigi.mini.Fhqwhgads 1.1 | 36 | 8% | 53 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 23 | 5% | 31 |

## Melee bench: F19

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 81.1 | 246 / 700 | 2.70 | 15.9% | 75606 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.8 | 16.3% | 158 |
| mld.Infinity 2.2 | 2.1 | 15.8% | 219 |
| hadur117.nano.SanaroS3 0.3 | 2.2 | 15.9% | 246 |
| krillr.mini.JointStrike 2.0.0 | 4.4 | 11.4% | 23 |
| erdnis.Rover 0.3 | 4.9 | 10.6% | 13 |
| patson.PatsonTestBot 1.0 | 5.8 | 9.1% | 11 |
| pac.ABC 2.1 | 7.4 | 7.5% | 28 |
| mbh.Mbh 0.1 | 7.8 | 6.9% | 1 |
| pbg.R2D2 1.0 | 8.9 | 5.6% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 82.2 | 13 / 35 | 3949 |
| 2 | 3 | 63.3 | 75.6 | 13 / 35 | 3254 |
| 3 | 1 | 66.8 | 87.9 | 14 / 35 | 3563 |
| 4 | 3 | 64.6 | 78.4 | 12 / 35 | 3808 |
| 5 | 1 | 66.5 | 84.1 | 17 / 35 | 3953 |
| 6 | 3 | 64.6 | 76.8 | 11 / 35 | 4047 |
| 7 | 2 | 65.7 | 82.2 | 13 / 35 | 3649 |
| 8 | 1 | 66.7 | 84.8 | 12 / 35 | 4180 |
| 9 | 3 | 65.9 | 84.1 | 10 / 35 | 3657 |
| 10 | 2 | 65.7 | 82.5 | 13 / 35 | 3853 |
| 11 | 2 | 66.1 | 84.1 | 11 / 35 | 3953 |
| 12 | 1 | 67.6 | 86.3 | 18 / 35 | 3813 |
| 13 | 2 | 64.2 | 76.5 | 12 / 35 | 4103 |
| 14 | 1 | 65.8 | 81.9 | 12 / 35 | 3955 |
| 15 | 3 | 64.0 | 78.4 | 11 / 35 | 3630 |
| 16 | 2 | 64.5 | 76.8 | 13 / 35 | 3860 |
| 17 | 3 | 65.0 | 79.4 | 11 / 35 | 3826 |
| 18 | 3 | 65.2 | 82.5 | 11 / 35 | 3505 |
| 19 | 3 | 63.6 | 77.8 | 9 / 35 | 3253 |
| 20 | 3 | 64.6 | 79.0 | 10 / 35 | 3795 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 183 | 49% |
| davidalves.net.DuelistMiniMelee 1.2 | 158 | 52% |
| krillr.mini.JointStrike 2.0.0 | 39 | 79% |
| pac.ABC 2.1 | 26 | 50% |
| erdnis.Rover 0.3 | 19 | 84% |
| patson.PatsonTestBot 1.0 | 11 | 82% |
| pbg.R2D2 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 455 of 700 rounds, at a mean tick of 1121. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 194 | 43% | 360 |
| mld.Infinity 2.2 | 131 | 29% | 63 |
| krillr.mini.JointStrike 2.0.0 | 37 | 8% | 77 |
| erdnis.Rover 0.3 | 30 | 7% | 62 |
| patson.PatsonTestBot 1.0 | 28 | 6% | 59 |
| pac.ABC 2.1 | 23 | 5% | 43 |
| pbg.R2D2 1.0 | 6 | 1% | 15 |
| mbh.Mbh 0.1 | 6 | 1% | 13 |

## Melee bench: F20

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 71.4 | 175 / 700 | 3.58 | 13.8% | 65307 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 16.9% | 229 |
| hadur117.nano.SanaroS3 0.3 | 2.3 | 13.8% | 175 |
| nz.jdc.nano.GridFu 1.0 | 3.6 | 12.0% | 51 |
| fwb.Nine 1.0.1 | 3.7 | 11.7% | 108 |
| catcat20.Rabbit 0.001 | 4.6 | 10.8% | 79 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 8.6% | 12 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 8.4% | 17 |
| bayen.nut.Squirrel 1.615 | 7.6 | 7.7% | 23 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.6% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.5% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 73.0 | 5 / 35 | 3279 |
| 2 | 3 | 61.0 | 72.1 | 8 / 35 | 3401 |
| 3 | 2 | 62.1 | 75.2 | 10 / 35 | 3353 |
| 4 | 2 | 62.0 | 77.1 | 9 / 35 | 3331 |
| 5 | 2 | 57.5 | 62.5 | 8 / 35 | 3126 |
| 6 | 3 | 61.1 | 72.1 | 11 / 35 | 3200 |
| 7 | 3 | 60.4 | 71.7 | 9 / 35 | 3204 |
| 8 | 2 | 59.4 | 68.9 | 7 / 35 | 3267 |
| 9 | 2 | 61.4 | 76.5 | 9 / 35 | 3221 |
| 10 | 2 | 60.7 | 70.2 | 10 / 35 | 3639 |
| 11 | 3 | 60.0 | 70.8 | 9 / 35 | 3043 |
| 12 | 2 | 61.6 | 73.0 | 16 / 35 | 3030 |
| 13 | 2 | 60.2 | 70.5 | 8 / 35 | 3415 |
| 14 | 2 | 56.0 | 61.6 | 4 / 35 | 2869 |
| 15 | 2 | 60.7 | 73.3 | 9 / 35 | 3133 |
| 16 | 2 | 62.4 | 75.6 | 11 / 35 | 3438 |
| 17 | 3 | 58.7 | 67.6 | 6 / 35 | 3154 |
| 18 | 2 | 61.8 | 72.1 | 11 / 35 | 3645 |
| 19 | 2 | 59.3 | 67.6 | 7 / 35 | 3302 |
| 20 | 2 | 61.4 | 75.9 | 8 / 35 | 3257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 148 | 53% |
| catcat20.Rabbit 0.001 | 56 | 59% |
| fwb.Nine 1.0.1 | 39 | 79% |
| nz.jdc.nano.GridFu 1.0 | 25 | 52% |
| bayen.nut.Squirrel 1.615 | 12 | 92% |
| djdjdj.NanoSkunk10 1.0 | 9 | 44% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 0% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 525 of 700 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 194 | 37% | 249 |
| fwb.Nine 1.0.1 | 116 | 22% | 133 |
| nz.jdc.nano.GridFu 1.0 | 76 | 14% | 103 |
| catcat20.Rabbit 0.001 | 57 | 11% | 96 |
| bayen.nut.Squirrel 1.615 | 28 | 5% | 44 |
| djdjdj.NanoSkunk10 1.0 | 18 | 3% | 25 |
| m3thos.mini.Eva01 0.5.5 | 18 | 3% | 24 |
| ntc.ControlledChaos 1.1.4 | 10 | 2% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 8 | 2% | 12 |

## Melee bench: F21

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 84.3 | 302 / 700 | 2.41 | 17.2% | 86885 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.5 | 17.2% | 302 |
| eem.EvBot v4.6.16 | 1.6 | 17.1% | 262 |
| dummy.mini.Scimitar 1.01 | 3.1 | 14.6% | 60 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.1% | 34 |
| eld.Hmm 1.0 | 5.4 | 8.5% | 33 |
| oa.weak.BotherBot 0.1 | 5.6 | 8.5% | 7 |
| fire219.CatBot 1.0 | 7.6 | 6.3% | 0 |
| el.JumpShoot 0.2 | 8.1 | 6.1% | 5 |
| PSW.Relentless 0.1 | 8.6 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.8 | 15 / 35 | 4800 |
| 2 | 2 | 67.0 | 84.8 | 17 / 35 | 4297 |
| 3 | 2 | 65.8 | 82.5 | 13 / 35 | 3954 |
| 4 | 1 | 65.4 | 79.4 | 15 / 35 | 4281 |
| 5 | 2 | 66.8 | 83.5 | 17 / 35 | 4248 |
| 6 | 1 | 67.2 | 87.3 | 18 / 35 | 4031 |
| 7 | 1 | 65.7 | 82.9 | 12 / 35 | 4366 |
| 8 | 2 | 66.7 | 82.2 | 15 / 35 | 4601 |
| 9 | 1 | 67.1 | 85.4 | 14 / 35 | 4454 |
| 10 | 2 | 65.1 | 78.7 | 13 / 35 | 4333 |
| 11 | 1 | 67.2 | 85.7 | 13 / 35 | 4551 |
| 12 | 1 | 68.1 | 89.5 | 20 / 35 | 4150 |
| 13 | 2 | 66.2 | 84.1 | 13 / 35 | 4185 |
| 14 | 2 | 64.0 | 81.0 | 14 / 35 | 3516 |
| 15 | 1 | 68.2 | 88.9 | 18 / 35 | 4556 |
| 16 | 1 | 67.5 | 89.5 | 17 / 35 | 4281 |
| 17 | 2 | 66.3 | 81.9 | 15 / 35 | 4474 |
| 18 | 1 | 68.3 | 87.3 | 17 / 35 | 4751 |
| 19 | 2 | 67.0 | 86.0 | 12 / 35 | 4525 |
| 20 | 1 | 66.2 | 81.3 | 14 / 35 | 4531 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 297 | 55% |
| dummy.mini.Scimitar 1.01 | 82 | 84% |
| cf.RiO.RiOx 4.2.1 | 51 | 78% |
| eld.Hmm 1.0 | 32 | 66% |
| oa.weak.BotherBot 0.1 | 7 | 86% |
| el.JumpShoot 0.2 | 5 | 40% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 398 of 700 rounds, at a mean tick of 1311. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 185 | 46% | 309 |
| dummy.mini.Scimitar 1.01 | 106 | 27% | 194 |
| cf.RiO.RiOx 4.2.1 | 56 | 14% | 89 |
| eld.Hmm 1.0 | 17 | 4% | 51 |
| el.JumpShoot 0.2 | 9 | 2% | 13 |
| fire219.CatBot 1.0 | 9 | 2% | 10 |
| oa.weak.BotherBot 0.1 | 7 | 2% | 21 |
| PSW.Relentless 0.1 | 6 | 2% | 5 |
| arthord.MannyPacquiao Beta | 3 | 1% | 6 |

## Melee bench: F23

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.4 | 253 / 700 | 2.49 | 16.5% | 79115 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.1 | 18.7% | 296 |
| hadur117.nano.SanaroS3 0.3 | 1.9 | 16.5% | 253 |
| cre.Karolos 0.32 | 3.1 | 14.5% | 82 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.6% | 44 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 9.0% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.9 | 8.9% | 8 |
| cw.megas.Blade 0.8 | 7.1 | 8.1% | 0 |
| sample.Walls 1.0 | 7.3 | 8.1% | 9 |
| cli.WasteOfAmmo 1.0 | 9.1 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.7 | 88.6 | 13 / 35 | 3979 |
| 2 | 2 | 66.3 | 82.5 | 13 / 35 | 4085 |
| 3 | 2 | 67.8 | 86.3 | 16 / 35 | 4319 |
| 4 | 1 | 67.5 | 86.0 | 19 / 35 | 4232 |
| 5 | 2 | 66.3 | 83.8 | 12 / 35 | 3810 |
| 6 | 2 | 65.4 | 81.9 | 11 / 35 | 3937 |
| 7 | 2 | 67.6 | 86.0 | 17 / 35 | 4352 |
| 8 | 2 | 67.4 | 86.3 | 12 / 35 | 4015 |
| 9 | 2 | 67.7 | 86.7 | 17 / 35 | 3676 |
| 10 | 2 | 66.8 | 84.8 | 12 / 35 | 3926 |
| 11 | 2 | 66.8 | 86.0 | 9 / 35 | 4208 |
| 12 | 2 | 66.8 | 84.1 | 12 / 35 | 3931 |
| 13 | 2 | 66.2 | 82.9 | 13 / 35 | 3679 |
| 14 | 2 | 66.5 | 81.6 | 13 / 35 | 3805 |
| 15 | 2 | 65.6 | 81.6 | 12 / 35 | 3848 |
| 16 | 2 | 63.6 | 75.2 | 8 / 35 | 3606 |
| 17 | 2 | 64.5 | 76.5 | 8 / 35 | 3784 |
| 18 | 1 | 67.4 | 86.3 | 19 / 35 | 4056 |
| 19 | 2 | 65.8 | 81.6 | 11 / 35 | 4007 |
| 20 | 2 | 64.4 | 80.0 | 6 / 35 | 3860 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 246 | 48% |
| cre.Karolos 0.32 | 104 | 65% |
| stelo.AreaTargetingBot 1.1 | 43 | 58% |
| stelo.RamTrackSurfer 1.2 | 19 | 95% |
| sample.Walls 1.0 | 14 | 93% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 10 | 50% |
| cw.megas.Blade 0.8 | 4 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 447 of 700 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 226 | 51% | 353 |
| cre.Karolos 0.32 | 98 | 22% | 155 |
| stelo.AreaTargetingBot 1.1 | 77 | 17% | 96 |
| stelo.RamTrackSurfer 1.2 | 14 | 3% | 40 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 14 | 3% | 22 |
| sample.Walls 1.0 | 12 | 3% | 21 |
| cw.megas.Blade 0.8 | 5 | 1% | 10 |
| rrh.Iwillfindyou 2.0 | 1 | 0% | 1 |

## Melee bench: F24

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.2 | 61.0 | 104 / 700 | 4.51 | 11.4% | 49632 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.9 | 14.4% | 153 |
| florent.XSeries.X2 0.12 | 2.3 | 13.5% | 130 |
| davidalves.Phoenix 0.54 | 2.9 | 13.3% | 149 |
| pedersen.Ugluk 1.1.1 | 3.5 | 12.4% | 97 |
| hadur117.nano.SanaroS3 0.3 | 4.7 | 11.4% | 104 |
| oog.melee.Corsair 1.0 | 6.0 | 9.8% | 22 |
| stelo.SoJNanoMelee 1.1 | 6.9 | 8.7% | 44 |
| lunchie.Lunchbox 0.93 | 8.1 | 6.7% | 3 |
| as.FrankTheTank 1.3 | 9.2 | 5.1% | 2 |
| evd.X1 0.01 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.1 | 64.8 | 5 / 35 | 2735 |
| 2 | 4 | 55.6 | 61.9 | 6 / 35 | 2520 |
| 3 | 6 | 54.2 | 58.7 | 4 / 35 | 2462 |
| 4 | 5 | 55.1 | 63.5 | 4 / 35 | 2281 |
| 5 | 5 | 51.0 | 53.0 | 4 / 35 | 2176 |
| 6 | 5 | 53.3 | 57.8 | 1 / 35 | 2432 |
| 7 | 5 | 57.4 | 65.4 | 3 / 35 | 2742 |
| 8 | 3 | 58.9 | 70.5 | 6 / 35 | 2573 |
| 9 | 4 | 56.7 | 64.1 | 8 / 35 | 2376 |
| 10 | 4 | 55.4 | 61.3 | 5 / 35 | 2546 |
| 11 | 5 | 54.7 | 59.7 | 4 / 35 | 2530 |
| 12 | 5 | 53.8 | 58.7 | 3 / 35 | 2399 |
| 13 | 5 | 52.9 | 55.9 | 5 / 35 | 2337 |
| 14 | 5 | 56.0 | 63.2 | 4 / 35 | 2560 |
| 15 | 6 | 53.2 | 54.6 | 8 / 35 | 2329 |
| 16 | 2 | 59.3 | 71.1 | 8 / 35 | 2641 |
| 17 | 5 | 56.0 | 61.3 | 8 / 35 | 2542 |
| 18 | 5 | 57.8 | 65.4 | 8 / 35 | 2534 |
| 19 | 5 | 52.9 | 54.3 | 5 / 35 | 2572 |
| 20 | 6 | 53.1 | 55.9 | 5 / 35 | 2345 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 67 | 51% |
| florent.XSeries.X2 0.12 | 38 | 63% |
| davidalves.Phoenix 0.54 | 32 | 47% |
| pedersen.Ugluk 1.1.1 | 30 | 57% |
| stelo.SoJNanoMelee 1.1 | 20 | 15% |
| oog.melee.Corsair 1.0 | 12 | 58% |
| evd.X1 0.01 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 0% |

Hadur died in 597 of 700 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 125 | 21% | 140 |
| rz.GlowBlowMelee 1.4 | 121 | 20% | 150 |
| florent.XSeries.X2 0.12 | 117 | 20% | 141 |
| pedersen.Ugluk 1.1.1 | 107 | 18% | 119 |
| stelo.SoJNanoMelee 1.1 | 45 | 8% | 50 |
| oog.melee.Corsair 1.0 | 36 | 6% | 50 |
| lunchie.Lunchbox 0.93 | 24 | 4% | 25 |
| evd.X1 0.01 | 14 | 2% | 15 |
| as.FrankTheTank 1.3 | 7 | 1% | 8 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.nano.SanaroS3 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 71.9 | 176 / 700 | 3.25 | 15.0% | 50089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 1.7 | 15.8% | 157 |
| voidious.mini.BrokenSword 2.0.3 | 1.9 | 15.7% | 156 |
| hadur117.nano.SanaroS3 0.3 | 2.5 | 15.0% | 176 |
| jdw.Hurricane 1.4 | 4.3 | 12.7% | 85 |
| ds.Oo 2.2 | 5.0 | 10.8% | 62 |
| gjr.Cephalosporin 0.1 | 5.9 | 9.9% | 54 |
| adt.Ar2 1.1 | 7.4 | 7.6% | 4 |
| awesomeness.Elite 1.0 | 7.6 | 7.5% | 7 |
| amk.ChumbaMini 0.2 | 9.0 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.2 | 73.9 | 7 / 35 | 2559 |
| 2 | 3 | 58.9 | 70.0 | 10 / 35 | 2200 |
| 3 | 3 | 59.3 | 71.8 | 8 / 35 | 2505 |
| 4 | 2 | 60.7 | 74.6 | 11 / 35 | 2440 |
| 5 | 3 | 60.8 | 72.9 | 11 / 35 | 2476 |
| 6 | 3 | 58.5 | 68.2 | 8 / 35 | 2633 |
| 7 | 3 | 59.5 | 70.7 | 7 / 35 | 2461 |
| 8 | 1 | 61.3 | 76.1 | 14 / 35 | 2284 |
| 9 | 3 | 56.6 | 62.9 | 9 / 35 | 2493 |
| 10 | 1 | 64.8 | 83.9 | 13 / 35 | 2892 |
| 11 | 3 | 61.3 | 76.8 | 11 / 35 | 2385 |
| 12 | 2 | 59.8 | 71.4 | 11 / 35 | 2396 |
| 13 | 2 | 60.0 | 72.1 | 8 / 35 | 2694 |
| 14 | 3 | 59.1 | 70.7 | 5 / 35 | 2478 |
| 15 | 3 | 57.4 | 65.7 | 6 / 35 | 2488 |
| 16 | 3 | 58.1 | 68.2 | 8 / 35 | 2309 |
| 17 | 3 | 57.2 | 66.4 | 5 / 35 | 2387 |
| 18 | 3 | 59.1 | 70.0 | 6 / 35 | 2590 |
| 19 | 1 | 63.1 | 80.4 | 12 / 35 | 2745 |
| 20 | 3 | 60.1 | 71.8 | 6 / 35 | 2674 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 111 | 32% |
| voidious.micro.BlitzBat 1.05 | 110 | 36% |
| jdw.Hurricane 1.4 | 64 | 78% |
| gjr.Cephalosporin 0.1 | 34 | 53% |
| ds.Oo 2.2 | 26 | 54% |
| awesomeness.Elite 1.0 | 12 | 92% |
| adt.Ar2 1.1 | 7 | 86% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 526 of 700 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 171 | 33% | 218 |
| voidious.mini.BrokenSword 2.0.3 | 152 | 29% | 193 |
| jdw.Hurricane 1.4 | 68 | 13% | 107 |
| ds.Oo 2.2 | 51 | 10% | 70 |
| gjr.Cephalosporin 0.1 | 37 | 7% | 49 |
| adt.Ar2 1.1 | 25 | 5% | 30 |
| awesomeness.Elite 1.0 | 13 | 2% | 19 |
| amk.ChumbaMini 0.2 | 8 | 2% | 10 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 70.6 | 128 / 700 | 3.65 | 13.2% | 66877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.5% | 254 |
| hadur117.nano.SanaroS3 0.3 | 2.8 | 13.2% | 128 |
| shu.nitro.LENIN .T34 | 3.2 | 12.9% | 141 |
| lrem.Spectre 0.4.4 | 3.3 | 12.7% | 81 |
| js.PinBall 1.6 | 5.4 | 11.0% | 35 |
| gh.mini.GrubbmOne 1.0 | 5.6 | 10.8% | 41 |
| jaybot.adv.bots.JayBot 2.0 | 6.8 | 9.3% | 18 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.6% | 7 |
| sample.SpinBot 1.0 | 8.9 | 5.5% | 6 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 74.3 | 5 / 35 | 3395 |
| 2 | 2 | 60.4 | 72.4 | 6 / 35 | 3318 |
| 3 | 4 | 57.5 | 63.5 | 1 / 35 | 3277 |
| 4 | 3 | 59.6 | 70.2 | 7 / 35 | 3058 |
| 5 | 3 | 59.8 | 70.2 | 7 / 35 | 3152 |
| 6 | 2 | 64.4 | 82.9 | 11 / 35 | 3602 |
| 7 | 4 | 57.6 | 62.5 | 2 / 35 | 3515 |
| 8 | 2 | 61.4 | 73.3 | 9 / 35 | 3481 |
| 9 | 2 | 60.3 | 70.2 | 5 / 35 | 3535 |
| 10 | 4 | 59.0 | 65.7 | 9 / 35 | 3241 |
| 11 | 4 | 59.6 | 70.2 | 3 / 35 | 3340 |
| 12 | 2 | 62.0 | 75.2 | 10 / 35 | 3301 |
| 13 | 2 | 62.0 | 77.1 | 7 / 35 | 3163 |
| 14 | 2 | 62.2 | 76.5 | 8 / 35 | 3231 |
| 15 | 2 | 61.1 | 70.8 | 8 / 35 | 3501 |
| 16 | 3 | 60.0 | 67.3 | 9 / 35 | 3341 |
| 17 | 2 | 60.8 | 70.2 | 7 / 35 | 3687 |
| 18 | 2 | 60.6 | 69.8 | 6 / 35 | 3853 |
| 19 | 5 | 56.0 | 61.0 | 4 / 35 | 2660 |
| 20 | 4 | 59.3 | 68.3 | 4 / 35 | 3226 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 98 | 34% |
| shu.nitro.LENIN .T34 | 70 | 36% |
| lrem.Spectre 0.4.4 | 62 | 61% |
| gh.mini.GrubbmOne 1.0 | 24 | 33% |
| js.PinBall 1.6 | 17 | 76% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 45% |
| sample.SpinBot 1.0 | 6 | 17% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 573 of 700 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 179 | 31% | 215 |
| shu.nitro.LENIN .T34 | 105 | 18% | 129 |
| lrem.Spectre 0.4.4 | 81 | 14% | 106 |
| gh.mini.GrubbmOne 1.0 | 78 | 14% | 93 |
| js.PinBall 1.6 | 45 | 8% | 59 |
| jaybot.adv.bots.JayBot 2.0 | 39 | 7% | 45 |
| sample.SpinBot 1.0 | 26 | 5% | 27 |
| fullsail.LaxativeTeaTwo 1.0 | 19 | 3% | 25 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 70.1 | 222 / 700 | 3.69 | 13.7% | 61273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.7 | 15.2% | 219 |
| hadur117.nano.SanaroS3 0.3 | 2.2 | 13.7% | 222 |
| wee.Gem 1.8.4 | 3.3 | 12.3% | 117 |
| sheldor.melee.nano.TestMelee 0.1 | 3.8 | 12.0% | 81 |
| EH.Eagle 1.0.6 | 4.5 | 10.7% | 21 |
| techdude.kombat.FlamingKombat 1.5 | 6.4 | 9.0% | 22 |
| joe.ADinosaur 1.0 | 7.5 | 7.9% | 5 |
| throxbot.ThroxBot 0.1 | 7.7 | 7.7% | 15 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.5% | 1 |
| cs.Grudge 1.0 | 9.4 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.3 | 69.2 | 9 / 35 | 3081 |
| 2 | 2 | 62.4 | 78.4 | 14 / 35 | 3057 |
| 3 | 4 | 56.0 | 48.9 | 6 / 35 | 4349 |
| 4 | 2 | 61.7 | 74.6 | 14 / 35 | 2845 |
| 5 | 4 | 56.3 | 51.1 | 6 / 35 | 4148 |
| 6 | 1 | 59.7 | 71.4 | 12 / 35 | 2808 |
| 7 | 3 | 57.9 | 70.2 | 10 / 35 | 2197 |
| 8 | 2 | 60.7 | 75.2 | 14 / 35 | 2368 |
| 9 | 2 | 57.1 | 53.0 | 5 / 35 | 4342 |
| 10 | 1 | 60.1 | 71.7 | 13 / 35 | 2823 |
| 11 | 3 | 59.1 | 71.4 | 9 / 35 | 2575 |
| 12 | 1 | 63.4 | 80.3 | 19 / 35 | 2767 |
| 13 | 2 | 57.4 | 51.4 | 7 / 35 | 4430 |
| 14 | 1 | 62.8 | 78.7 | 12 / 35 | 3291 |
| 15 | 2 | 62.1 | 81.3 | 9 / 35 | 2795 |
| 16 | 2 | 62.8 | 79.0 | 16 / 35 | 2821 |
| 17 | 2 | 63.7 | 83.5 | 14 / 35 | 2644 |
| 18 | 2 | 59.3 | 70.2 | 10 / 35 | 2773 |
| 19 | 3 | 57.7 | 64.8 | 9 / 35 | 2631 |
| 20 | 2 | 61.7 | 77.5 | 14 / 35 | 2528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 155 | 69% |
| wee.Gem 1.8.4 | 77 | 56% |
| sheldor.melee.nano.TestMelee 0.1 | 42 | 62% |
| EH.Eagle 1.0.6 | 25 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 16 | 44% |
| throxbot.ThroxBot 0.1 | 10 | 70% |
| joe.ADinosaur 1.0 | 6 | 67% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |

Hadur died in 479 of 700 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 135 | 28% | 242 |
| wee.Gem 1.8.4 | 87 | 18% | 137 |
| sheldor.melee.nano.TestMelee 0.1 | 85 | 18% | 112 |
| joe.ADinosaur 1.0 | 42 | 9% | 48 |
| techdude.kombat.FlamingKombat 1.5 | 34 | 7% | 33 |
| EH.Eagle 1.0.6 | 28 | 6% | 52 |
| throxbot.ThroxBot 0.1 | 28 | 6% | 34 |
| cs.Grudge 1.0 | 21 | 4% | 21 |
| caimano.Furia_Ceca 0.22 | 19 | 4% | 21 |

## Melee bench: F28

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 81.2 | 249 / 700 | 2.69 | 15.7% | 65920 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.3 | 16.3% | 229 |
| hadur117.nano.SanaroS3 0.3 | 1.7 | 15.7% | 249 |
| uji.Antique 1.0 | 3.3 | 12.2% | 94 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 11.1% | 57 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.7% | 33 |
| amk.ChumbaWumba 0.3 | 6.6 | 8.2% | 10 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.0% | 18 |
| matt.advanced.Katana 1.0 | 8.1 | 6.6% | 6 |
| stelo.PianistNano 1.2 | 9.3 | 5.6% | 2 |
| stelo.Lifestealer 1.0 | 9.5 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 84.4 | 17 / 35 | 3668 |
| 2 | 1 | 65.7 | 84.8 | 16 / 35 | 3582 |
| 3 | 2 | 63.3 | 80.6 | 12 / 35 | 3128 |
| 4 | 2 | 62.5 | 79.0 | 9 / 35 | 3128 |
| 5 | 2 | 64.5 | 83.2 | 12 / 35 | 3399 |
| 6 | 2 | 62.9 | 80.3 | 10 / 35 | 3186 |
| 7 | 2 | 65.1 | 84.1 | 17 / 35 | 3185 |
| 8 | 2 | 61.4 | 74.6 | 7 / 35 | 3265 |
| 9 | 2 | 63.0 | 77.5 | 11 / 35 | 3415 |
| 10 | 2 | 63.5 | 81.6 | 12 / 35 | 2985 |
| 11 | 2 | 64.7 | 82.2 | 16 / 35 | 3420 |
| 12 | 1 | 64.3 | 81.9 | 16 / 35 | 3345 |
| 13 | 2 | 63.0 | 78.4 | 8 / 35 | 3507 |
| 14 | 1 | 64.1 | 81.9 | 16 / 35 | 3272 |
| 15 | 2 | 62.1 | 79.0 | 10 / 35 | 3063 |
| 16 | 2 | 64.2 | 83.8 | 15 / 35 | 3086 |
| 17 | 2 | 64.1 | 81.6 | 12 / 35 | 3372 |
| 18 | 2 | 64.0 | 84.4 | 11 / 35 | 3295 |
| 19 | 1 | 63.5 | 81.0 | 12 / 35 | 3223 |
| 20 | 1 | 62.8 | 79.7 | 10 / 35 | 3396 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 232 | 52% |
| uji.Antique 1.0 | 86 | 65% |
| qohnil.blot.BlotBot 3.61 | 57 | 44% |
| pfvicm.Sobieski 7.2.3b | 27 | 74% |
| ahr.ice.Ice 1.0.2 | 13 | 69% |
| amk.ChumbaWumba 0.3 | 12 | 83% |
| matt.advanced.Katana 1.0 | 5 | 60% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stelo.Lifestealer 1.0 | 3 | 67% |

Hadur died in 455 of 700 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 198 | 44% | 290 |
| uji.Antique 1.0 | 74 | 16% | 147 |
| pfvicm.Sobieski 7.2.3b | 60 | 13% | 77 |
| qohnil.blot.BlotBot 3.61 | 48 | 11% | 78 |
| amk.ChumbaWumba 0.3 | 37 | 8% | 43 |
| ahr.ice.Ice 1.0.2 | 16 | 4% | 29 |
| stelo.Lifestealer 1.0 | 9 | 2% | 14 |
| matt.advanced.Katana 1.0 | 7 | 2% | 12 |
| stelo.PianistNano 1.2 | 6 | 1% | 10 |

## Melee bench: F29

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 67.7 | 139 / 700 | 3.90 | 13.4% | 63323 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.4 | 16.2% | 240 |
| zyx.mega.YersiniaPestis 3.1 | 1.9 | 15.4% | 186 |
| hadur117.nano.SanaroS3 0.3 | 3.4 | 13.4% | 139 |
| myl.micro.Troodon 1.10 | 3.7 | 12.7% | 35 |
| jok.PheonixM 0.1.2 | 4.8 | 11.3% | 43 |
| ph.melee.ArcherME 0.3 | 6.4 | 8.5% | 8 |
| DBall.Anarchy 0.1 | 6.6 | 8.3% | 43 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 5.7% | 0 |
| jangs.ns51 1.0 | 9.4 | 4.2% | 3 |
| ap.Frederick 1.1 | 9.4 | 4.3% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 74.0 | 7 / 35 | 3249 |
| 2 | 3 | 61.5 | 72.4 | 7 / 35 | 3160 |
| 3 | 4 | 58.4 | 62.2 | 7 / 35 | 3115 |
| 4 | 4 | 58.9 | 64.8 | 5 / 35 | 2994 |
| 5 | 3 | 62.3 | 73.7 | 7 / 35 | 3542 |
| 6 | 4 | 59.8 | 65.7 | 7 / 35 | 2943 |
| 7 | 2 | 61.5 | 70.8 | 8 / 35 | 3563 |
| 8 | 3 | 59.9 | 66.3 | 6 / 35 | 3127 |
| 9 | 4 | 59.5 | 66.0 | 6 / 35 | 3161 |
| 10 | 3 | 60.6 | 69.5 | 6 / 35 | 2903 |
| 11 | 3 | 61.4 | 70.8 | 9 / 35 | 3080 |
| 12 | 4 | 57.6 | 60.3 | 9 / 35 | 2635 |
| 13 | 4 | 57.7 | 59.7 | 6 / 35 | 3220 |
| 14 | 3 | 61.3 | 72.4 | 8 / 35 | 2921 |
| 15 | 3 | 63.5 | 75.2 | 12 / 35 | 3491 |
| 16 | 5 | 59.0 | 63.5 | 6 / 35 | 3097 |
| 17 | 1 | 62.8 | 75.2 | 8 / 35 | 3552 |
| 18 | 4 | 56.7 | 59.4 | 3 / 35 | 2936 |
| 19 | 4 | 58.9 | 61.9 | 5 / 35 | 3409 |
| 20 | 3 | 61.3 | 71.1 | 7 / 35 | 3225 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 114 | 14% |
| zyx.mega.YersiniaPestis 3.1 | 100 | 61% |
| myl.micro.Troodon 1.10 | 36 | 83% |
| DBall.Anarchy 0.1 | 27 | 67% |
| jok.PheonixM 0.1.2 | 15 | 67% |
| ph.melee.ArcherME 0.3 | 4 | 50% |
| jangs.ns51 1.0 | 2 | 50% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 562 of 700 rounds, at a mean tick of 1030. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 231 | 41% | 246 |
| zyx.mega.YersiniaPestis 3.1 | 126 | 22% | 182 |
| myl.micro.Troodon 1.10 | 82 | 15% | 114 |
| jok.PheonixM 0.1.2 | 61 | 11% | 71 |
| ph.melee.ArcherME 0.3 | 24 | 4% | 28 |
| DBall.Anarchy 0.1 | 20 | 4% | 39 |
| fullsail.TimbotNoPrediction 1.0 | 16 | 3% | 17 |
| jangs.ns51 1.0 | 2 | 0% | 3 |

## Melee bench: F30

hadur117.nano.SanaroS3 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.3 | 59.8 | 78 / 700 | 4.22 | 12.4% | 51780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.9 | 16.3% | 161 |
| darkcanuck.B26354 1.06 | 1.9 | 16.3% | 223 |
| stelo.PastFuture 2.3.2 | 2.2 | 15.7% | 133 |
| hadur117.nano.SanaroS3 0.3 | 4.0 | 12.4% | 78 |
| intruder.PrairieWolf 2.61 | 5.5 | 10.1% | 51 |
| tripphippy.Alice 1.1 | 6.8 | 9.1% | 23 |
| ntc.Opposite 1.5 | 6.8 | 8.9% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 7.0 | 8.5% | 28 |
| GarmBox.Anger 1.0 | 9.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.0 | 60.4 | 1 / 35 | 2526 |
| 2 | 4 | 55.8 | 62.5 | 2 / 35 | 2535 |
| 3 | 4 | 59.6 | 70.4 | 7 / 35 | 2815 |
| 4 | 4 | 56.7 | 64.3 | 6 / 35 | 2437 |
| 5 | 4 | 55.0 | 57.5 | 3 / 35 | 2745 |
| 6 | 4 | 55.4 | 57.9 | 1 / 35 | 2885 |
| 7 | 4 | 54.6 | 60.4 | 6 / 35 | 2371 |
| 8 | 4 | 54.8 | 56.8 | 5 / 35 | 2639 |
| 9 | 4 | 53.6 | 56.4 | 4 / 35 | 2514 |
| 10 | 4 | 57.7 | 66.1 | 7 / 35 | 2541 |
| 11 | 4 | 55.8 | 61.4 | 5 / 35 | 2516 |
| 12 | 4 | 54.2 | 57.1 | 4 / 35 | 2406 |
| 13 | 4 | 53.5 | 56.1 | 3 / 35 | 2437 |
| 14 | 4 | 54.8 | 59.6 | 4 / 35 | 2514 |
| 15 | 4 | 54.2 | 58.2 | 2 / 35 | 2499 |
| 16 | 4 | 54.2 | 56.1 | 1 / 35 | 2649 |
| 17 | 4 | 54.5 | 58.2 | 5 / 35 | 2477 |
| 18 | 4 | 55.3 | 59.3 | 3 / 35 | 2632 |
| 19 | 4 | 56.3 | 59.6 | 6 / 35 | 2906 |
| 20 | 4 | 55.0 | 57.5 | 3 / 35 | 2736 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 73 | 30% |
| oog.melee.Capulet 1.2 | 56 | 29% |
| stelo.PastFuture 2.3.2 | 34 | 56% |
| intruder.PrairieWolf 2.61 | 15 | 40% |
| fowl3628800.LightningBolt 2.6.0 | 11 | 45% |
| tripphippy.Alice 1.1 | 10 | 60% |
| ntc.Opposite 1.5 | 5 | 80% |

Hadur died in 623 of 700 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 146 | 23% | 167 |
| stelo.PastFuture 2.3.2 | 144 | 23% | 162 |
| oog.melee.Capulet 1.2 | 133 | 21% | 158 |
| ntc.Opposite 1.5 | 56 | 9% | 59 |
| tripphippy.Alice 1.1 | 55 | 9% | 59 |
| intruder.PrairieWolf 2.61 | 51 | 8% | 56 |
| fowl3628800.LightningBolt 2.6.0 | 34 | 5% | 35 |
| GarmBox.Anger 1.0 | 4 | 1% | 4 |

## Melee bench: F31

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.4 | 58.9 | 68 / 700 | 4.70 | 10.9% | 47193 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.3% | 353 |
| gh.mini.Griezel 0.2 | 2.2 | 13.9% | 153 |
| spinnercat.micro.Tyger 0.1 | 3.4 | 12.2% | 46 |
| d414.nano.Quantum 1.0.0 | 3.9 | 11.9% | 47 |
| hadur117.nano.SanaroS3 0.3 | 4.8 | 10.9% | 68 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.1% | 20 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.9% | 9 |
| fm.mammillarias 1.3 | 7.5 | 6.7% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 9.4 | 5.2% | 1 |
| tlp.ThreeLeggedPig 1 | 9.6 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.6 | 60.6 | 2 / 35 | 2242 |
| 2 | 5 | 49.6 | 48.6 | 1 / 35 | 2312 |
| 3 | 5 | 55.4 | 59.4 | 5 / 35 | 2589 |
| 4 | 6 | 49.2 | 48.9 | 2 / 35 | 2105 |
| 5 | 4 | 56.7 | 63.2 | 3 / 35 | 2508 |
| 6 | 5 | 54.4 | 59.4 | 4 / 35 | 2273 |
| 7 | 6 | 53.0 | 55.2 | 5 / 35 | 1983 |
| 8 | 3 | 57.2 | 65.4 | 5 / 35 | 2479 |
| 9 | 5 | 56.0 | 62.2 | 2 / 35 | 2517 |
| 10 | 5 | 54.8 | 58.7 | 5 / 35 | 2407 |
| 11 | 5 | 52.9 | 53.7 | 3 / 35 | 2537 |
| 12 | 5 | 56.0 | 62.5 | 3 / 35 | 2364 |
| 13 | 5 | 52.9 | 56.5 | 2 / 35 | 2048 |
| 14 | 5 | 50.6 | 51.4 | 3 / 35 | 2127 |
| 15 | 3 | 58.9 | 68.9 | 6 / 35 | 2572 |
| 16 | 5 | 53.0 | 54.9 | 5 / 35 | 2293 |
| 17 | 5 | 53.3 | 56.8 | 2 / 35 | 2354 |
| 18 | 5 | 55.1 | 61.0 | 1 / 35 | 2471 |
| 19 | 5 | 56.3 | 63.2 | 4 / 35 | 2435 |
| 20 | 3 | 58.5 | 67.9 | 5 / 35 | 2577 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 75 | 41% |
| abc.Shadow 3.84i | 74 | 36% |
| d414.nano.Quantum 1.0.0 | 15 | 13% |
| spinnercat.micro.Tyger 0.1 | 11 | 27% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 50% |
| fm.mammillarias 1.3 | 1 | 0% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 632 of 700 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 153 | 24% | 185 |
| abc.Shadow 3.84i | 129 | 20% | 152 |
| spinnercat.micro.Tyger 0.1 | 114 | 18% | 116 |
| d414.nano.Quantum 1.0.0 | 102 | 16% | 108 |
| fm.mammillarias 1.3 | 47 | 7% | 47 |
| gh.nano.Grofvuil 0.2 | 40 | 6% | 43 |
| timmit.nano.TimDog 0.33 | 24 | 4% | 26 |
| Gecko.ultimateGeckoBot 1.0 | 18 | 3% | 18 |
| tlp.ThreeLeggedPig 1 | 5 | 1% | 5 |

## Melee bench: F32

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 75.6 | 253 / 700 | 3.20 | 14.6% | 64491 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.4 | 15.3% | 216 |
| hadur117.nano.SanaroS3 0.3 | 1.9 | 14.6% | 253 |
| apc.botM 3.0 | 3.1 | 12.3% | 85 |
| lxx.ConceptA 0.8 | 4.0 | 11.3% | 22 |
| vjik.UnViolation 1.1 | 5.0 | 10.4% | 52 |
| bayen.UbaMicro 1.4 | 5.8 | 9.6% | 26 |
| panzer.Panzer 0.2 | 7.6 | 7.4% | 4 |
| yk.JahMicro 1.0 | 8.4 | 6.8% | 19 |
| conscience.Electron 1.3g | 8.5 | 6.6% | 1 |
| donjezza.Jezza 1.0 | 9.7 | 5.7% | 23 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 72.7 | 13 / 35 | 3417 |
| 2 | 2 | 60.4 | 70.5 | 15 / 35 | 3151 |
| 3 | 2 | 62.8 | 78.4 | 12 / 35 | 3621 |
| 4 | 1 | 63.8 | 81.0 | 17 / 35 | 3380 |
| 5 | 1 | 61.5 | 77.1 | 14 / 35 | 3148 |
| 6 | 1 | 64.1 | 82.9 | 21 / 35 | 3096 |
| 7 | 2 | 59.8 | 71.1 | 12 / 35 | 3223 |
| 8 | 1 | 65.2 | 83.8 | 17 / 35 | 3690 |
| 9 | 2 | 61.9 | 76.8 | 12 / 35 | 3249 |
| 10 | 2 | 59.0 | 70.2 | 10 / 35 | 2887 |
| 11 | 3 | 58.4 | 69.2 | 6 / 35 | 3251 |
| 12 | 3 | 58.8 | 68.6 | 10 / 35 | 2932 |
| 13 | 2 | 57.3 | 67.6 | 7 / 35 | 2718 |
| 14 | 1 | 64.2 | 81.9 | 14 / 35 | 3640 |
| 15 | 1 | 64.6 | 85.7 | 14 / 35 | 3321 |
| 16 | 2 | 62.0 | 75.2 | 14 / 35 | 3238 |
| 17 | 1 | 64.5 | 86.0 | 13 / 35 | 3531 |
| 18 | 2 | 59.2 | 69.2 | 13 / 35 | 2947 |
| 19 | 4 | 56.1 | 64.1 | 6 / 35 | 2838 |
| 20 | 2 | 62.7 | 79.0 | 13 / 35 | 3213 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 189 | 56% |
| apc.botM 3.0 | 71 | 76% |
| lxx.ConceptA 0.8 | 41 | 95% |
| vjik.UnViolation 1.1 | 36 | 64% |
| bayen.UbaMicro 1.4 | 18 | 56% |
| donjezza.Jezza 1.0 | 16 | 56% |
| yk.JahMicro 1.0 | 14 | 50% |
| panzer.Panzer 0.2 | 4 | 75% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 451 of 700 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 147 | 33% | 254 |
| lxx.ConceptA 0.8 | 89 | 20% | 116 |
| apc.botM 3.0 | 59 | 13% | 112 |
| vjik.UnViolation 1.1 | 41 | 9% | 70 |
| bayen.UbaMicro 1.4 | 36 | 8% | 48 |
| panzer.Panzer 0.2 | 30 | 7% | 32 |
| yk.JahMicro 1.0 | 19 | 4% | 21 |
| conscience.Electron 1.3g | 16 | 4% | 20 |
| donjezza.Jezza 1.0 | 14 | 3% | 27 |

## Melee bench: F33

hadur117.nano.SanaroS3 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 76.0 | 182 / 700 | 2.92 | 16.3% | 64705 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.1 | 19.0% | 223 |
| hadur117.nano.SanaroS3 0.3 | 2.4 | 16.3% | 182 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 15.8% | 183 |
| labg.Cataclysm 2.05 | 4.2 | 12.5% | 78 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.4 | 9.9% | 25 |
| baal.nano.N 1.42 | 5.4 | 10.1% | 5 |
| zyx.micro.Ant 1.1 | 7.4 | 6.3% | 2 |
| sanja.First 0.1 | 7.8 | 5.6% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 8.9 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 71.8 | 7 / 35 | 2641 |
| 2 | 2 | 63.8 | 79.3 | 12 / 35 | 2994 |
| 3 | 3 | 61.2 | 70.7 | 7 / 35 | 3107 |
| 4 | 2 | 62.8 | 75.0 | 8 / 35 | 3338 |
| 5 | 2 | 63.3 | 75.4 | 9 / 35 | 3372 |
| 6 | 2 | 62.4 | 73.2 | 10 / 35 | 3303 |
| 7 | 2 | 65.0 | 80.7 | 15 / 35 | 3213 |
| 8 | 2 | 63.7 | 77.1 | 14 / 35 | 3427 |
| 9 | 3 | 60.6 | 72.1 | 3 / 35 | 3057 |
| 10 | 2 | 63.5 | 79.3 | 10 / 35 | 2911 |
| 11 | 1 | 65.7 | 84.6 | 12 / 35 | 3476 |
| 12 | 3 | 63.3 | 78.9 | 7 / 35 | 3531 |
| 13 | 2 | 64.8 | 81.1 | 14 / 35 | 3391 |
| 14 | 3 | 61.8 | 75.0 | 8 / 35 | 2805 |
| 15 | 2 | 62.0 | 72.1 | 12 / 35 | 3361 |
| 16 | 3 | 62.2 | 74.3 | 6 / 35 | 3172 |
| 17 | 3 | 64.0 | 77.1 | 10 / 35 | 3479 |
| 18 | 2 | 64.1 | 80.0 | 7 / 35 | 3366 |
| 19 | 3 | 61.6 | 71.4 | 6 / 35 | 3221 |
| 20 | 3 | 61.5 | 71.4 | 5 / 35 | 3540 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 149 | 17% |
| maribo.Quester 0.3 | 147 | 57% |
| labg.Cataclysm 2.05 | 47 | 51% |
| kinsen.melee.Angsaichmophobia 1.8c | 39 | 79% |
| baal.nano.N 1.42 | 13 | 92% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 75% |
| sanja.First 0.1 | 2 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 519 of 700 rounds, at a mean tick of 1385. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 193 | 37% | 287 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 183 | 35% | 218 |
| labg.Cataclysm 2.05 | 50 | 10% | 71 |
| kinsen.melee.Angsaichmophobia 1.8c | 49 | 9% | 60 |
| baal.nano.N 1.42 | 20 | 4% | 34 |
| zyx.micro.Ant 1.1 | 17 | 3% | 20 |
| sanja.First 0.1 | 4 | 1% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 1% | 4 |

## Melee bench: F34

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 73.8 | 131 / 700 | 3.36 | 14.0% | 68605 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.3 | 17.5% | 240 |
| stelo.Spread 0.9 | 1.8 | 16.7% | 237 |
| hadur117.nano.SanaroS3 0.3 | 3.0 | 14.0% | 131 |
| jcs.Seth 1.8 | 4.3 | 11.9% | 55 |
| tcf.Reach 3 | 4.9 | 11.3% | 32 |
| cli.Dancer 1.1 | 5.8 | 9.7% | 5 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 2 |
| amk.Punbot.Punbot 0.01 | 8.1 | 5.1% | 1 |
| sample.VelociRobot 1.0 | 9.3 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 74.0 | 8 / 35 | 3499 |
| 2 | 3 | 58.3 | 65.1 | 4 / 35 | 2880 |
| 3 | 3 | 65.2 | 80.0 | 9 / 35 | 3986 |
| 4 | 3 | 61.0 | 70.2 | 8 / 35 | 3391 |
| 5 | 3 | 62.8 | 77.5 | 4 / 35 | 3719 |
| 6 | 3 | 63.3 | 76.8 | 8 / 35 | 3313 |
| 7 | 3 | 62.3 | 75.2 | 9 / 35 | 3141 |
| 8 | 3 | 62.8 | 73.3 | 7 / 35 | 3663 |
| 9 | 3 | 62.6 | 73.0 | 7 / 35 | 3498 |
| 10 | 3 | 60.6 | 71.1 | 5 / 35 | 2983 |
| 11 | 3 | 62.0 | 71.7 | 5 / 35 | 3400 |
| 12 | 3 | 60.6 | 70.2 | 4 / 35 | 3455 |
| 13 | 3 | 63.7 | 79.0 | 9 / 35 | 3513 |
| 14 | 3 | 63.5 | 79.0 | 7 / 35 | 3446 |
| 15 | 3 | 62.6 | 74.9 | 8 / 35 | 3248 |
| 16 | 3 | 63.4 | 77.1 | 8 / 35 | 3561 |
| 17 | 3 | 60.4 | 69.8 | 1 / 35 | 3576 |
| 18 | 3 | 63.7 | 76.2 | 9 / 35 | 3785 |
| 19 | 3 | 61.5 | 74.3 | 6 / 35 | 3070 |
| 20 | 3 | 60.3 | 67.6 | 5 / 35 | 3478 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 124 | 20% |
| stelo.Spread 0.9 | 108 | 54% |
| jcs.Seth 1.8 | 34 | 65% |
| tcf.Reach 3 | 29 | 48% |
| cli.Dancer 1.1 | 9 | 67% |
| ratosh.Wesco 1.4 | 3 | 67% |
| amk.Punbot.Punbot 0.01 | 3 | 67% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 571 of 700 rounds, at a mean tick of 1004. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 237 | 42% | 245 |
| stelo.Spread 0.9 | 172 | 30% | 241 |
| tcf.Reach 3 | 51 | 9% | 68 |
| jcs.Seth 1.8 | 49 | 9% | 73 |
| ratosh.Wesco 1.4 | 30 | 5% | 32 |
| cli.Dancer 1.1 | 24 | 4% | 32 |
| amk.Punbot.Punbot 0.01 | 4 | 1% | 3 |
| sample.VelociRobot 1.0 | 2 | 0% | 6 |
2 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 69.3 | 60 / 700 | 3.76 | 12.5% | 52081 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.2% | 513 |
| gh.mini.Gruwel 0.9 | 2.6 | 13.4% | 75 |
| hadur117.nano.SanaroS3 0.3 | 3.3 | 12.5% | 60 |
| rz.HawkOnFire 0.1 | 3.9 | 12.2% | 21 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.8% | 29 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 7.2% | 2 |
| wit.Chuliath 1.0 | 6.8 | 7.1% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.1 | 6.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.9% | 0 |
| dans.Cinnamon 1.2 | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.4 | 64.1 | 2 / 35 | 2528 |
| 2 | 2 | 59.5 | 72.4 | 3 / 35 | 2600 |
| 3 | 4 | 57.3 | 65.7 | 2 / 35 | 2440 |
| 4 | 4 | 59.0 | 71.1 | 5 / 35 | 2441 |
| 5 | 4 | 57.8 | 67.0 | 2 / 35 | 2398 |
| 6 | 4 | 58.8 | 70.2 | 4 / 35 | 2330 |
| 7 | 4 | 58.8 | 72.1 | 3 / 35 | 2297 |
| 8 | 4 | 57.5 | 65.4 | 2 / 35 | 2579 |
| 9 | 4 | 58.5 | 68.9 | 2 / 35 | 2565 |
| 10 | 2 | 61.3 | 74.0 | 6 / 35 | 2976 |
| 11 | 3 | 58.7 | 67.9 | 2 / 35 | 2757 |
| 12 | 3 | 58.7 | 68.9 | 3 / 35 | 2542 |
| 13 | 4 | 59.1 | 67.3 | 4 / 35 | 2957 |
| 14 | 3 | 59.0 | 71.1 | 3 / 35 | 2609 |
| 15 | 2 | 60.7 | 74.3 | 4 / 35 | 2871 |
| 16 | 2 | 59.5 | 70.5 | 2 / 35 | 2958 |
| 17 | 3 | 58.1 | 68.9 | 5 / 35 | 2399 |
| 18 | 4 | 57.7 | 65.7 | 2 / 35 | 2696 |
| 19 | 3 | 58.7 | 70.8 | 2 / 35 | 2696 |
| 20 | 3 | 58.5 | 70.2 | 2 / 35 | 2442 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 185 | 3% |
| gh.mini.Gruwel 0.9 | 47 | 49% |
| rz.HawkOnFire 0.1 | 21 | 71% |
| dmh.robocode.robot.BlackDeath 9.2 | 16 | 81% |
| wit.Chuliath 1.0 | 2 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 640 of 700 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 290 | 45% | 294 |
| gh.mini.Gruwel 0.9 | 114 | 18% | 138 |
| rz.HawkOnFire 0.1 | 102 | 16% | 117 |
| dmh.robocode.robot.BlackDeath 9.2 | 67 | 10% | 83 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 22 | 3% | 22 |
| myl.nano.KomoriNinja 1.1 | 21 | 3% | 21 |
| wit.Chuliath 1.0 | 11 | 2% | 11 |
| dans.Cinnamon 1.2 | 9 | 1% | 10 |
| stelo.MyAgileRobot 0.2 | 4 | 1% | 4 |

## Melee bench: F36

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 74.5 | 246 / 700 | 3.29 | 14.9% | 69091 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.2 | 14.9% | 246 |
| bzdp.Pansy 2.1 | 2.6 | 12.8% | 118 |
| alpha.RainingFire 1.0 | 2.9 | 12.6% | 102 |
| mz.Cork 0.1 | 4.3 | 11.5% | 74 |
| bvh.micro.Freya 0.3 | 4.9 | 10.8% | 57 |
| m3thos.Eva02 0.7.1 | 5.9 | 10.1% | 51 |
| bvh.mini.Fenrir 0.39 | 6.4 | 9.8% | 13 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 6.6% | 8 |
| dl.BetterWalls 1.0 | 8.6 | 6.6% | 7 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.3% | 25 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 80.6 | 12 / 35 | 3404 |
| 2 | 1 | 60.3 | 69.8 | 10 / 35 | 3278 |
| 3 | 1 | 61.2 | 73.0 | 11 / 35 | 3283 |
| 4 | 1 | 61.7 | 74.6 | 11 / 35 | 3388 |
| 5 | 1 | 66.7 | 86.3 | 20 / 35 | 3971 |
| 6 | 1 | 62.3 | 74.6 | 13 / 35 | 3590 |
| 7 | 1 | 63.2 | 75.9 | 14 / 35 | 3470 |
| 8 | 2 | 58.9 | 64.8 | 11 / 35 | 3390 |
| 9 | 1 | 61.9 | 74.3 | 9 / 35 | 3441 |
| 10 | 1 | 60.5 | 70.2 | 9 / 35 | 3343 |
| 11 | 1 | 63.0 | 76.5 | 12 / 35 | 3764 |
| 12 | 1 | 60.9 | 69.8 | 12 / 35 | 3499 |
| 13 | 1 | 62.9 | 77.5 | 13 / 35 | 3378 |
| 14 | 1 | 65.0 | 84.1 | 17 / 35 | 3509 |
| 15 | 1 | 63.3 | 76.2 | 14 / 35 | 3587 |
| 16 | 1 | 63.4 | 77.5 | 16 / 35 | 3683 |
| 17 | 1 | 63.4 | 77.8 | 12 / 35 | 3753 |
| 18 | 1 | 60.9 | 70.2 | 12 / 35 | 3393 |
| 19 | 1 | 60.3 | 70.8 | 11 / 35 | 3096 |
| 20 | 3 | 57.7 | 66.0 | 7 / 35 | 2871 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 84 | 50% |
| bvh.micro.Freya 0.3 | 63 | 78% |
| mz.Cork 0.1 | 60 | 73% |
| alpha.RainingFire 1.0 | 51 | 63% |
| m3thos.Eva02 0.7.1 | 39 | 67% |
| bvh.mini.Fenrir 0.39 | 38 | 95% |
| sample.MyFirstRobot 1.0 | 17 | 24% |
| dl.BetterWalls 1.0 | 10 | 90% |
| squidM.TentalceMeleeNano 1.1 | 4 | 75% |

Hadur died in 454 of 700 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 108 | 24% | 167 |
| alpha.RainingFire 1.0 | 97 | 21% | 129 |
| bvh.micro.Freya 0.3 | 53 | 12% | 78 |
| mz.Cork 0.1 | 50 | 11% | 101 |
| m3thos.Eva02 0.7.1 | 47 | 10% | 80 |
| bvh.mini.Fenrir 0.39 | 45 | 10% | 59 |
| squidM.TentalceMeleeNano 1.1 | 23 | 5% | 31 |
| sample.MyFirstRobot 1.0 | 17 | 4% | 24 |
| dl.BetterWalls 1.0 | 14 | 3% | 31 |

## Melee bench: F37

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 80.6 | 299 / 700 | 2.75 | 16.1% | 87631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.0 | 16.1% | 299 |
| germ.TheMind .2 | 2.6 | 11.7% | 99 |
| EBBU.Sim2 1.02 | 3.6 | 10.9% | 70 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.6 | 10.8% | 53 |
| agrach.Dalek 1.0 | 5.5 | 9.5% | 60 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.7% | 37 |
| mb.Beast 0.1 | 7.1 | 8.5% | 39 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 8.2% | 2 |
| lmk.ACPFinal 0.1 | 8.1 | 8.0% | 16 |
| skm.Ryubot 1.0 | 8.9 | 7.5% | 25 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 79.0 | 12 / 35 | 4406 |
| 2 | 1 | 66.7 | 88.6 | 22 / 35 | 4654 |
| 3 | 1 | 65.6 | 83.8 | 19 / 35 | 4881 |
| 4 | 1 | 65.2 | 86.3 | 16 / 35 | 4424 |
| 5 | 1 | 63.1 | 81.6 | 13 / 35 | 4152 |
| 6 | 1 | 61.6 | 73.7 | 15 / 35 | 4184 |
| 7 | 1 | 63.0 | 79.7 | 16 / 35 | 4031 |
| 8 | 1 | 65.3 | 83.5 | 18 / 35 | 4892 |
| 9 | 1 | 63.4 | 79.4 | 17 / 35 | 4382 |
| 10 | 1 | 62.6 | 78.1 | 15 / 35 | 4293 |
| 11 | 1 | 63.9 | 82.2 | 16 / 35 | 4347 |
| 12 | 1 | 59.0 | 69.8 | 11 / 35 | 3577 |
| 13 | 1 | 61.8 | 76.2 | 14 / 35 | 4067 |
| 14 | 1 | 63.9 | 82.2 | 15 / 35 | 4395 |
| 15 | 1 | 64.1 | 82.2 | 11 / 35 | 4861 |
| 16 | 1 | 63.7 | 81.6 | 13 / 35 | 4548 |
| 17 | 1 | 64.1 | 83.2 | 14 / 35 | 4504 |
| 18 | 1 | 60.6 | 73.0 | 10 / 35 | 4207 |
| 19 | 1 | 63.4 | 80.3 | 13 / 35 | 4523 |
| 20 | 1 | 65.3 | 87.3 | 19 / 35 | 4303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 99 | 62% |
| EBBU.Sim2 1.02 | 76 | 50% |
| com.syncleus.robocode.Dreadnaught 0.1 | 65 | 60% |
| agrach.Dalek 1.0 | 56 | 79% |
| mb.Beast 0.1 | 47 | 68% |
| stelo.UntouchableNano 1.3 | 38 | 82% |
| skm.Ryubot 1.0 | 36 | 58% |
| lmk.ACPFinal 0.1 | 31 | 77% |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 90% |

Hadur died in 410 of 700 rounds, at a mean tick of 577. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 87 | 21% | 138 |
| EBBU.Sim2 1.02 | 81 | 20% | 103 |
| com.syncleus.robocode.Dreadnaught 0.1 | 64 | 16% | 116 |
| agrach.Dalek 1.0 | 35 | 9% | 92 |
| mb.Beast 0.1 | 32 | 8% | 73 |
| lmk.ACPFinal 0.1 | 32 | 8% | 54 |
| mn.nano.perceptual.Impact 1.3.0 | 30 | 7% | 37 |
| stelo.UntouchableNano 1.3 | 25 | 6% | 41 |
| skm.Ryubot 1.0 | 24 | 6% | 41 |

## Melee bench: F38

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 65.0 | 107 / 700 | 4.15 | 12.1% | 54622 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.8% | 293 |
| bvh.mini.Freya 0.55 | 2.7 | 13.0% | 67 |
| hadur117.nano.SanaroS3 0.3 | 3.6 | 12.1% | 107 |
| bts.mega.Gnarly 1.4 | 4.5 | 11.4% | 97 |
| cs.Wren 1.0 | 4.7 | 11.5% | 49 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.3 | 10.7% | 42 |
| kdf.KoulDestroyer 1.0 | 6.4 | 9.6% | 33 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 6.5% | 12 |
| bzdp.BoxCar 2.0 | 9.5 | 4.2% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.8 | 63.5 | 2 / 35 | 2526 |
| 2 | 3 | 57.2 | 63.8 | 6 / 35 | 2866 |
| 3 | 5 | 56.1 | 61.0 | 4 / 35 | 2682 |
| 4 | 3 | 59.4 | 70.2 | 6 / 35 | 2999 |
| 5 | 4 | 56.7 | 63.5 | 6 / 35 | 2675 |
| 6 | 3 | 57.2 | 66.0 | 4 / 35 | 2818 |
| 7 | 2 | 59.7 | 70.5 | 6 / 35 | 2800 |
| 8 | 3 | 58.2 | 69.2 | 7 / 35 | 2363 |
| 9 | 2 | 58.5 | 69.8 | 8 / 35 | 2605 |
| 10 | 2 | 59.3 | 67.6 | 7 / 35 | 3088 |
| 11 | 3 | 56.6 | 62.2 | 8 / 35 | 2701 |
| 12 | 6 | 54.4 | 57.8 | 1 / 35 | 2695 |
| 13 | 4 | 56.2 | 60.6 | 7 / 35 | 2758 |
| 14 | 4 | 56.8 | 64.8 | 5 / 35 | 2575 |
| 15 | 3 | 58.6 | 67.9 | 7 / 35 | 2782 |
| 16 | 4 | 56.6 | 64.1 | 6 / 35 | 2655 |
| 17 | 5 | 55.3 | 59.0 | 5 / 35 | 2642 |
| 18 | 6 | 54.8 | 60.6 | 2 / 35 | 2650 |
| 19 | 3 | 57.7 | 66.7 | 2 / 35 | 3011 |
| 20 | 2 | 59.7 | 70.8 | 8 / 35 | 2731 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 115 | 49% |
| bts.mega.Gnarly 1.4 | 36 | 31% |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 14% |
| bvh.mini.Freya 0.55 | 21 | 67% |
| cs.Wren 1.0 | 18 | 56% |
| kdf.KoulDestroyer 1.0 | 13 | 54% |
| kawigi.spare.SpareParts 0.7.6nosnd | 7 | 71% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 593 of 700 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 180 | 30% | 244 |
| bvh.mini.Freya 0.55 | 92 | 16% | 97 |
| bts.mega.Gnarly 1.4 | 80 | 13% | 95 |
| davidalves.net.DuelistNanoMelee 1.01 | 74 | 12% | 79 |
| cs.Wren 1.0 | 69 | 12% | 75 |
| kdf.KoulDestroyer 1.0 | 63 | 11% | 69 |
| kawigi.spare.SpareParts 0.7.6nosnd | 16 | 3% | 22 |
| bzdp.BoxCar 2.0 | 13 | 2% | 13 |
| matt.UnderDark3 2.4.34 | 6 | 1% | 6 |

## Melee bench: F39

hadur117.nano.SanaroS3 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 67.2 | 89 / 700 | 3.63 | 13.6% | 57718 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.2 | 18.4% | 201 |
| az.Ololobot 0.2.4 | 2.0 | 15.8% | 275 |
| hadur117.nano.SanaroS3 0.3 | 3.1 | 13.6% | 89 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 11.1% | 82 |
| apollokidd.ApolloKidd 0.9 | 5.1 | 10.1% | 20 |
| winamp32.micro.MicroMacro 1.0 | 6.1 | 9.6% | 18 |
| gimp.GimpBot 0.1 | 6.5 | 9.1% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 7.9 | 7.1% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.0 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.3 | 74.6 | 4 / 35 | 3055 |
| 2 | 4 | 56.9 | 65.4 | 4 / 35 | 2731 |
| 3 | 4 | 56.1 | 64.3 | 4 / 35 | 2735 |
| 4 | 3 | 58.6 | 67.9 | 5 / 35 | 3285 |
| 5 | 3 | 55.4 | 66.1 | 3 / 35 | 2413 |
| 6 | 3 | 56.5 | 64.6 | 3 / 35 | 2955 |
| 7 | 3 | 57.9 | 67.1 | 7 / 35 | 2995 |
| 8 | 3 | 56.5 | 66.1 | 2 / 35 | 2949 |
| 9 | 4 | 51.4 | 54.3 | 2 / 35 | 2648 |
| 10 | 3 | 56.6 | 66.4 | 5 / 35 | 2979 |
| 11 | 3 | 57.2 | 68.9 | 2 / 35 | 2897 |
| 12 | 3 | 58.6 | 70.0 | 9 / 35 | 2925 |
| 13 | 3 | 56.0 | 67.5 | 3 / 35 | 2530 |
| 14 | 3 | 57.4 | 65.4 | 7 / 35 | 2858 |
| 15 | 3 | 58.4 | 71.8 | 9 / 35 | 2706 |
| 16 | 3 | 58.6 | 68.6 | 4 / 35 | 3155 |
| 17 | 3 | 56.9 | 63.6 | 3 / 35 | 3081 |
| 18 | 3 | 58.4 | 69.3 | 8 / 35 | 2968 |
| 19 | 3 | 57.0 | 68.9 | 1 / 35 | 2763 |
| 20 | 2 | 58.9 | 72.5 | 4 / 35 | 3090 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 124 | 10% |
| bvh.fry.Freya 0.82 | 93 | 37% |
| stelo.SoRobotNanoMelee 1.2 | 48 | 50% |
| apollokidd.ApolloKidd 0.9 | 12 | 33% |
| winamp32.micro.MicroMacro 1.0 | 11 | 73% |
| gimp.GimpBot 0.1 | 10 | 70% |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 0% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 0% |

Hadur died in 611 of 700 rounds, at a mean tick of 1132. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 219 | 36% | 248 |
| az.Ololobot 0.2.4 | 153 | 25% | 168 |
| apollokidd.ApolloKidd 0.9 | 82 | 13% | 91 |
| stelo.SoRobotNanoMelee 1.2 | 80 | 13% | 87 |
| winamp32.micro.MicroMacro 1.0 | 33 | 5% | 48 |
| gimp.GimpBot 0.1 | 25 | 4% | 36 |
| whitesquare.robots.SkynetAdvanced 1.1 | 11 | 2% | 13 |
| dcs.Eater_of_Worlds 1.1.3-A | 8 | 1% | 9 |

## Melee bench: F41

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 71.2 | 197 / 700 | 3.60 | 13.7% | 59557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.4% | 279 |
| hadur117.nano.SanaroS3 0.3 | 2.9 | 13.7% | 197 |
| ary.Swarm 1.1 | 3.0 | 13.6% | 65 |
| lessonz.robocode.Oz 0.5.0 | 3.6 | 12.9% | 71 |
| simonton.nano.MeleeSeed 1.8 | 4.6 | 11.7% | 58 |
| shrub.Silver v048 | 6.1 | 9.1% | 11 |
| zyx.nano.Ant 1.1 | 7.0 | 7.7% | 2 |
| jsal.Jsalbot 1.0 | 8.4 | 6.1% | 12 |
| stelo.Mirror 1.1 | 8.6 | 5.9% | 7 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.2 | 67.9 | 6 / 35 | 2726 |
| 2 | 4 | 59.7 | 65.1 | 9 / 35 | 3134 |
| 3 | 3 | 60.3 | 70.5 | 10 / 35 | 2939 |
| 4 | 2 | 60.4 | 69.2 | 11 / 35 | 3176 |
| 5 | 3 | 60.1 | 70.2 | 8 / 35 | 2947 |
| 6 | 2 | 63.0 | 75.9 | 11 / 35 | 3190 |
| 7 | 3 | 61.9 | 75.6 | 8 / 35 | 3286 |
| 8 | 4 | 58.3 | 65.1 | 8 / 35 | 2693 |
| 9 | 3 | 59.3 | 66.3 | 8 / 35 | 2939 |
| 10 | 2 | 61.3 | 71.7 | 12 / 35 | 3039 |
| 11 | 4 | 58.4 | 65.4 | 9 / 35 | 2668 |
| 12 | 2 | 62.3 | 77.5 | 12 / 35 | 2980 |
| 13 | 2 | 62.3 | 77.5 | 10 / 35 | 2654 |
| 14 | 3 | 59.7 | 68.3 | 11 / 35 | 2894 |
| 15 | 2 | 62.8 | 77.8 | 13 / 35 | 2962 |
| 16 | 4 | 58.4 | 65.7 | 6 / 35 | 2985 |
| 17 | 2 | 63.3 | 79.7 | 12 / 35 | 3028 |
| 18 | 2 | 62.3 | 73.7 | 12 / 35 | 3351 |
| 19 | 4 | 59.8 | 67.6 | 9 / 35 | 2759 |
| 20 | 2 | 62.5 | 72.7 | 12 / 35 | 3207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 156 | 51% |
| lessonz.robocode.Oz 0.5.0 | 60 | 60% |
| ary.Swarm 1.1 | 56 | 70% |
| simonton.nano.MeleeSeed 1.8 | 40 | 73% |
| stelo.Mirror 1.1 | 7 | 57% |
| jsal.Jsalbot 1.0 | 6 | 83% |
| shrub.Silver v048 | 5 | 60% |

Hadur died in 503 of 700 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 154 | 31% | 231 |
| ary.Swarm 1.1 | 115 | 23% | 165 |
| lessonz.robocode.Oz 0.5.0 | 75 | 15% | 101 |
| simonton.nano.MeleeSeed 1.8 | 68 | 14% | 95 |
| shrub.Silver v048 | 33 | 7% | 35 |
| zyx.nano.Ant 1.1 | 27 | 5% | 28 |
| stelo.Mirror 1.1 | 16 | 3% | 22 |
| jsal.Jsalbot 1.0 | 10 | 2% | 18 |
| acogdev.alpha 0.2 | 5 | 1% | 5 |

## Melee bench: F42

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 74.9 | 182 / 700 | 3.26 | 14.5% | 71311 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.3% | 296 |
| ara.Shera 0.88 | 3.0 | 14.1% | 111 |
| hadur117.nano.SanaroS3 0.3 | 3.0 | 14.5% | 182 |
| maribo.mini.MiniQuester 0.1 | 3.1 | 14.1% | 85 |
| amz.NanoClone 1.41 | 5.2 | 9.5% | 9 |
| maribo.IotaCT 1.1 | 6.3 | 7.6% | 2 |
| dsw.StaticD 1.0 | 6.8 | 7.2% | 13 |
| stelo.MirrorMicro 1.0 | 8.6 | 5.6% | 2 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.6 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 70.5 | 8 / 35 | 3718 |
| 2 | 3 | 61.4 | 73.7 | 9 / 35 | 3393 |
| 3 | 3 | 61.7 | 74.3 | 11 / 35 | 3419 |
| 4 | 3 | 62.3 | 76.8 | 7 / 35 | 3417 |
| 5 | 2 | 63.2 | 76.8 | 13 / 35 | 3765 |
| 6 | 4 | 62.2 | 75.2 | 9 / 35 | 3338 |
| 7 | 3 | 62.7 | 75.9 | 12 / 35 | 3307 |
| 8 | 2 | 64.7 | 81.6 | 12 / 35 | 3811 |
| 9 | 2 | 61.8 | 76.2 | 8 / 35 | 3503 |
| 10 | 4 | 61.3 | 69.5 | 8 / 35 | 3752 |
| 11 | 3 | 63.1 | 76.5 | 8 / 35 | 3694 |
| 12 | 4 | 61.1 | 71.4 | 8 / 35 | 3396 |
| 13 | 3 | 62.3 | 76.5 | 6 / 35 | 3667 |
| 14 | 4 | 60.9 | 72.4 | 7 / 35 | 3247 |
| 15 | 2 | 62.4 | 74.6 | 9 / 35 | 3890 |
| 16 | 4 | 59.4 | 67.9 | 7 / 35 | 3049 |
| 17 | 2 | 63.6 | 78.7 | 10 / 35 | 4074 |
| 18 | 3 | 63.1 | 75.2 | 12 / 35 | 3851 |
| 19 | 3 | 62.6 | 76.8 | 7 / 35 | 3610 |
| 20 | 2 | 62.7 | 77.5 | 11 / 35 | 3410 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 187 | 53% |
| ara.Shera 0.88 | 69 | 57% |
| maribo.mini.MiniQuester 0.1 | 49 | 67% |
| dsw.StaticD 1.0 | 9 | 67% |
| amz.NanoClone 1.41 | 3 | 33% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 100% |
| maribo.IotaCT 1.1 | 1 | 0% |

Hadur died in 519 of 700 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 184 | 35% | 282 |
| ara.Shera 0.88 | 135 | 26% | 171 |
| maribo.mini.MiniQuester 0.1 | 111 | 21% | 147 |
| amz.NanoClone 1.41 | 45 | 9% | 45 |
| dsw.StaticD 1.0 | 18 | 3% | 24 |
| maribo.IotaCT 1.1 | 14 | 3% | 14 |
| stelo.MirrorMicro 1.0 | 5 | 1% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 4 | 1% | 9 |
| mme.NikeEnhanced 2.0 | 3 | 1% | 3 |

## Melee bench: F43

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 62.8 | 46 / 700 | 4.35 | 11.6% | 53663 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.5% | 538 |
| brainfade.melee.Dusk 0.44 | 2.3 | 13.3% | 59 |
| dummy.micro.Sparrow 2.5 | 3.9 | 11.9% | 23 |
| hadur117.nano.SanaroS3 0.3 | 3.9 | 11.6% | 46 |
| wcsv.melee.EngineerMelee 0.1 | 4.1 | 11.4% | 22 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 10.0% | 10 |
| mz.NanoGod 2.02 | 7.3 | 7.9% | 1 |
| jab.DiamondStealer 5 | 7.8 | 7.6% | 2 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.1 | 57.1 | 1 / 35 | 2728 |
| 2 | 5 | 57.5 | 61.9 | 0 / 35 | 2453 |
| 3 | 5 | 56.7 | 60.6 | 1 / 35 | 2505 |
| 4 | 4 | 57.4 | 62.5 | 2 / 35 | 2086 |
| 5 | 5 | 56.3 | 57.8 | 2 / 35 | 2644 |
| 6 | 5 | 57.3 | 63.2 | 1 / 35 | 2526 |
| 7 | 3 | 60.2 | 67.6 | 4 / 35 | 3071 |
| 8 | 6 | 55.6 | 56.5 | 2 / 35 | 2298 |
| 9 | 2 | 59.6 | 68.3 | 2 / 35 | 2790 |
| 10 | 5 | 56.2 | 57.5 | 2 / 35 | 2553 |
| 11 | 4 | 57.9 | 61.6 | 2 / 35 | 2856 |
| 12 | 3 | 59.1 | 63.5 | 5 / 35 | 2912 |
| 13 | 4 | 57.7 | 61.3 | 2 / 35 | 2612 |
| 14 | 3 | 61.3 | 71.1 | 5 / 35 | 3040 |
| 15 | 4 | 56.9 | 60.0 | 0 / 35 | 2595 |
| 16 | 4 | 56.9 | 57.5 | 3 / 35 | 2762 |
| 17 | 2 | 61.3 | 72.4 | 3 / 35 | 2900 |
| 18 | 4 | 57.5 | 61.3 | 3 / 35 | 2300 |
| 19 | 3 | 60.1 | 66.3 | 2 / 35 | 2995 |
| 20 | 2 | 60.2 | 67.6 | 4 / 35 | 3037 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 123 | 12% |
| brainfade.melee.Dusk 0.44 | 28 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 11 | 27% |
| dummy.micro.Sparrow 2.5 | 8 | 63% |
| Krabb.akim2.Akim2 1.1b | 5 | 40% |

Hadur died in 654 of 700 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 311 | 48% | 324 |
| brainfade.melee.Dusk 0.44 | 77 | 12% | 98 |
| dummy.micro.Sparrow 2.5 | 76 | 12% | 82 |
| wcsv.melee.EngineerMelee 0.1 | 71 | 11% | 75 |
| Krabb.akim2.Akim2 1.1b | 55 | 8% | 57 |
| mz.NanoGod 2.02 | 30 | 5% | 30 |
| jab.DiamondStealer 5 | 25 | 4% | 25 |
| cvt.Firsty 1.0 | 9 | 1% | 9 |

## Melee bench: F44

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 72.1 | 184 / 700 | 3.51 | 14.2% | 69096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.3 | 16.4% | 263 |
| tzu.TheArtOfWar 1.2 | 2.0 | 15.3% | 166 |
| hadur117.nano.SanaroS3 0.3 | 2.8 | 14.2% | 184 |
| wompi.Quokka 1.6 | 4.3 | 11.0% | 29 |
| jwirde.Gort 2.0 | 4.8 | 10.6% | 38 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.0 | 9.1% | 6 |
| disan.Chair 2.2.0 | 7.2 | 7.5% | 11 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.8% | 1 |
| sample.Crazy 1.0 | 9.4 | 4.6% | 3 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 67.0 | 6 / 35 | 2870 |
| 2 | 2 | 64.5 | 80.6 | 13 / 35 | 3635 |
| 3 | 3 | 58.5 | 66.0 | 4 / 35 | 3071 |
| 4 | 3 | 61.8 | 73.7 | 6 / 35 | 3626 |
| 5 | 2 | 64.4 | 77.5 | 13 / 35 | 3939 |
| 6 | 1 | 63.1 | 80.6 | 9 / 35 | 3351 |
| 7 | 3 | 63.8 | 77.8 | 11 / 35 | 3789 |
| 8 | 3 | 62.1 | 76.5 | 8 / 35 | 3291 |
| 9 | 3 | 62.5 | 74.3 | 14 / 35 | 3151 |
| 10 | 1 | 64.5 | 80.3 | 14 / 35 | 3757 |
| 11 | 3 | 60.2 | 68.6 | 8 / 35 | 3306 |
| 12 | 3 | 61.0 | 68.9 | 8 / 35 | 3702 |
| 13 | 3 | 59.9 | 68.6 | 5 / 35 | 3463 |
| 14 | 3 | 61.8 | 69.2 | 13 / 35 | 3670 |
| 15 | 3 | 60.7 | 70.8 | 8 / 35 | 3330 |
| 16 | 3 | 61.4 | 71.4 | 10 / 35 | 3412 |
| 17 | 3 | 62.0 | 70.5 | 9 / 35 | 3813 |
| 18 | 3 | 60.0 | 67.0 | 6 / 35 | 3445 |
| 19 | 3 | 60.4 | 66.0 | 11 / 35 | 3399 |
| 20 | 4 | 59.4 | 67.0 | 8 / 35 | 3076 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 148 | 64% |
| tzu.TheArtOfWar 1.2 | 91 | 29% |
| wompi.Quokka 1.6 | 30 | 70% |
| jwirde.Gort 2.0 | 27 | 81% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 13 | 77% |
| disan.Chair 2.2.0 | 10 | 70% |
| sample.Crazy 1.0 | 4 | 75% |

Hadur died in 519 of 700 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 176 | 34% | 271 |
| tzu.TheArtOfWar 1.2 | 167 | 32% | 198 |
| wompi.Quokka 1.6 | 55 | 11% | 70 |
| jwirde.Gort 2.0 | 39 | 8% | 66 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 33 | 6% | 37 |
| stf.PanzerGeneral 0.1 | 20 | 4% | 22 |
| disan.Chair 2.2.0 | 18 | 3% | 21 |
| amk.jointstrike.JointStrike 0.2 | 6 | 1% | 6 |
| sample.Crazy 1.0 | 4 | 1% | 8 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.nano.SanaroS3 0.3 against 9 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 71.3 | 157 / 700 | 3.59 | 14.5% | 74726 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS3 0.3 | 1.3 | 14.5% | 157 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.2% | 352 |
| jje.BagPuss 1.2 | 3.0 | 12.4% | 38 |
| sul.Lunar 1.1 | 4.2 | 11.3% | 74 |
| myl.nano.Graviton 1.10 | 4.6 | 11.0% | 28 |
| hvilela.HVilela 0.9 | 6.6 | 9.2% | 3 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.3% | 15 |
| fm.claire 1.7 | 7.3 | 8.4% | 5 |
| wit.Deep7 2.0 | 9.2 | 6.5% | 29 |
| abud.ThirdRobo 1.0 | 9.8 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.9 | 74.9 | 5 / 35 | 3269 |
| 2 | 1 | 62.5 | 75.2 | 9 / 35 | 3750 |
| 3 | 2 | 59.7 | 65.7 | 7 / 35 | 3742 |
| 4 | 3 | 57.5 | 61.6 | 4 / 35 | 3613 |
| 5 | 1 | 61.3 | 69.5 | 9 / 35 | 3807 |
| 6 | 1 | 60.2 | 67.6 | 11 / 35 | 3517 |
| 7 | 2 | 59.5 | 67.6 | 5 / 35 | 3484 |
| 8 | 1 | 65.4 | 81.0 | 14 / 35 | 4271 |
| 9 | 2 | 59.3 | 67.6 | 3 / 35 | 3518 |
| 10 | 1 | 63.0 | 73.0 | 12 / 35 | 3947 |
| 11 | 1 | 60.6 | 67.0 | 11 / 35 | 3745 |
| 12 | 2 | 59.1 | 67.6 | 4 / 35 | 3517 |
| 13 | 1 | 61.5 | 73.3 | 8 / 35 | 3817 |
| 14 | 1 | 60.1 | 69.5 | 7 / 35 | 3606 |
| 15 | 1 | 62.9 | 78.1 | 7 / 35 | 3770 |
| 16 | 1 | 62.3 | 72.7 | 8 / 35 | 4102 |
| 17 | 1 | 62.2 | 72.7 | 10 / 35 | 3844 |
| 18 | 1 | 62.0 | 71.7 | 7 / 35 | 3938 |
| 19 | 1 | 60.7 | 71.4 | 8 / 35 | 3622 |
| 20 | 1 | 62.9 | 77.1 | 8 / 35 | 3847 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 206 | 44% |
| sul.Lunar 1.1 | 39 | 21% |
| jje.BagPuss 1.2 | 34 | 62% |
| myl.nano.Graviton 1.10 | 22 | 77% |
| wit.Deep7 2.0 | 14 | 36% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 90% |
| hvilela.HVilela 0.9 | 3 | 100% |
| fm.claire 1.7 | 3 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 543 of 700 rounds, at a mean tick of 1270. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 130 | 24% | 0 |
| jje.BagPuss 1.2 | 107 | 20% | 191 |
| myl.nano.Graviton 1.10 | 82 | 15% | 147 |
| sul.Lunar 1.1 | 81 | 15% | 143 |
| hvilela.HVilela 0.9 | 47 | 9% | 66 |
| fm.claire 1.7 | 41 | 8% | 48 |
| pez.mini.ChironexFleckeri 0.5 | 26 | 5% | 47 |
| wit.Deep7 2.0 | 23 | 4% | 40 |
| abud.ThirdRobo 1.0 | 6 | 1% | 14 |

## Melee bench: F46

hadur117.nano.SanaroS3 0.3 against 8 opponents at once, 35 rounds per battle, 20 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 20 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 74.3 | 140 / 700 | 3.06 | 15.0% | 57335 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 21.7% | 425 |
| hadur117.nano.SanaroS3 0.3 | 2.0 | 15.0% | 140 |
| cx.Princess 1.0 | 3.6 | 13.0% | 79 |
| mz.MicroSheep 1.0 | 3.6 | 13.0% | 41 |
| sadoner.killer 0.2 | 5.0 | 10.5% | 7 |
| arthord.NanoSatanMelee Beta | 6.0 | 9.1% | 6 |
| jeremyreeder.collective.Prophet 5 | 7.1 | 7.1% | 1 |
| kurios.DOSexe .9a | 7.9 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 80.7 | 12 / 35 | 2850 |
| 2 | 2 | 61.3 | 74.6 | 6 / 35 | 2912 |
| 3 | 2 | 60.2 | 71.4 | 7 / 35 | 3028 |
| 4 | 2 | 59.8 | 74.3 | 5 / 35 | 2653 |
| 5 | 2 | 59.2 | 70.7 | 6 / 35 | 2886 |
| 6 | 2 | 60.6 | 73.6 | 9 / 35 | 2894 |
| 7 | 2 | 61.2 | 76.1 | 5 / 35 | 3014 |
| 8 | 2 | 58.7 | 70.0 | 6 / 35 | 2609 |
| 9 | 2 | 61.1 | 75.7 | 8 / 35 | 2983 |
| 10 | 2 | 61.5 | 76.8 | 9 / 35 | 2964 |
| 11 | 2 | 59.9 | 72.9 | 7 / 35 | 2855 |
| 12 | 2 | 60.2 | 73.9 | 6 / 35 | 2647 |
| 13 | 2 | 59.4 | 74.3 | 5 / 35 | 2643 |
| 14 | 2 | 59.1 | 68.9 | 8 / 35 | 2840 |
| 15 | 2 | 62.5 | 82.5 | 9 / 35 | 2739 |
| 16 | 2 | 61.6 | 72.9 | 8 / 35 | 3324 |
| 17 | 2 | 61.0 | 77.5 | 6 / 35 | 2810 |
| 18 | 2 | 60.3 | 72.9 | 5 / 35 | 2895 |
| 19 | 2 | 59.1 | 68.6 | 3 / 35 | 2997 |
| 20 | 2 | 61.8 | 76.8 | 10 / 35 | 2792 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 279 | 35% |
| cx.Princess 1.0 | 40 | 60% |
| mz.MicroSheep 1.0 | 31 | 29% |
| arthord.NanoSatanMelee Beta | 9 | 67% |
| sadoner.killer 0.2 | 6 | 50% |
| mbro.Detektor3 0.1.1 | 2 | 0% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 561 of 700 rounds, at a mean tick of 999. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 337 | 60% | 439 |
| mz.MicroSheep 1.0 | 76 | 14% | 88 |
| cx.Princess 1.0 | 52 | 9% | 67 |
| sadoner.killer 0.2 | 39 | 7% | 41 |
| arthord.NanoSatanMelee Beta | 28 | 5% | 34 |
| jeremyreeder.collective.Prophet 5 | 16 | 3% | 18 |
| kurios.DOSexe .9a | 7 | 1% | 7 |
| mbro.Detektor3 0.1.1 | 5 | 1% | 6 |
1 death(s) with no robot to name.

