# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 73.7 | 63 / 350 | 3.37 | 13.7% | 34768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.0% | 218 |
| hadur117.nano.SanaroHS 0.2 | 2.4 | 13.7% | 63 |
| sgp.JollyNinja 3.53 | 3.5 | 12.2% | 38 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 11.6% | 8 |
| mz.MicroGodMelee 1 | 4.5 | 11.2% | 14 |
| lorneswork.Predator 1.0 | 5.6 | 10.1% | 9 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.8% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 77.8 | 13 / 35 | 3838 |
| 2 | 2 | 62.7 | 79.0 | 5 / 35 | 3592 |
| 3 | 2 | 63.9 | 81.6 | 8 / 35 | 3720 |
| 4 | 2 | 60.7 | 73.3 | 5 / 35 | 3376 |
| 5 | 2 | 61.1 | 73.3 | 8 / 35 | 3441 |
| 6 | 4 | 58.6 | 62.2 | 4 / 35 | 3769 |
| 7 | 2 | 59.2 | 71.1 | 4 / 35 | 2949 |
| 8 | 2 | 60.3 | 74.3 | 5 / 35 | 3100 |
| 9 | 4 | 58.3 | 66.0 | 4 / 35 | 3252 |
| 10 | 2 | 63.0 | 77.8 | 7 / 35 | 3731 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 126 | 19% |
| sgp.JollyNinja 3.53 | 34 | 59% |
| mz.MicroGodMelee 1 | 11 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 75% |
| lorneswork.Predator 1.0 | 5 | 40% |
| adt.Ar2 1.0 | 2 | 100% |

Hadur died in 287 of 350 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 135 | 47% | 161 |
| sgp.JollyNinja 3.53 | 40 | 14% | 58 |
| simonton.nano.WeekendObsession_Melee 1.0 | 40 | 14% | 44 |
| lorneswork.Predator 1.0 | 29 | 10% | 33 |
| mz.MicroGodMelee 1 | 25 | 9% | 34 |
| adt.Ar2 1.0 | 8 | 3% | 10 |
| skm.butterfly 1.0 | 6 | 2% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 1% | 3 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 66.9 | 80 / 350 | 3.98 | 13.5% | 35904 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.5 | 15.1% | 95 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.9 | 14.5% | 82 |
| hadur117.nano.SanaroHS 0.2 | 2.8 | 13.5% | 80 |
| lrem.micro.SpikeSoldier 0.4 | 4.1 | 11.3% | 8 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.9 | 9.9% | 19 |
| sch.Simone 0.3d | 6.1 | 8.9% | 31 |
| fnc.bandit.Bandit 5.2.0 | 7.5 | 7.7% | 1 |
| Noran.BitchingElk 0.054 | 7.5 | 7.8% | 28 |
| stelo.PatternRobot 1.0 | 8.7 | 6.5% | 8 |
| fullsail.SweetTea 1.1 | 10.0 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.0 | 62.2 | 7 / 35 | 3569 |
| 2 | 3 | 58.2 | 64.4 | 9 / 35 | 3142 |
| 3 | 3 | 61.3 | 70.8 | 11 / 35 | 3592 |
| 4 | 2 | 60.1 | 69.2 | 7 / 35 | 3690 |
| 5 | 2 | 61.1 | 71.4 | 6 / 35 | 3803 |
| 6 | 1 | 64.7 | 78.7 | 13 / 35 | 4325 |
| 7 | 3 | 59.6 | 65.4 | 9 / 35 | 3592 |
| 8 | 3 | 59.8 | 66.7 | 9 / 35 | 3566 |
| 9 | 5 | 53.6 | 53.0 | 5 / 35 | 3145 |
| 10 | 3 | 58.8 | 66.7 | 4 / 35 | 3480 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 53 | 57% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 49 | 41% |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 80% |
| sch.Simone 0.3d | 13 | 31% |
| Noran.BitchingElk 0.054 | 8 | 63% |
| lrem.micro.SpikeSoldier 0.4 | 5 | 80% |
| stelo.PatternRobot 1.0 | 5 | 40% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |

Hadur died in 272 of 350 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 64 | 24% | 92 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 64 | 24% | 83 |
| lrem.micro.SpikeSoldier 0.4 | 38 | 14% | 40 |
| stelo.PatternRobot 1.0 | 27 | 10% | 31 |
| sch.Simone 0.3d | 22 | 8% | 30 |
| com.cohesiva.robocode.ManOwaR 1.0 | 21 | 8% | 34 |
| fnc.bandit.Bandit 5.2.0 | 18 | 7% | 20 |
| fullsail.SweetTea 1.1 | 9 | 3% | 9 |
| Noran.BitchingElk 0.054 | 8 | 3% | 11 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 79.7 | 101 / 350 | 2.83 | 15.1% | 39361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHS 0.2 | 1.9 | 15.1% | 101 |
| kawigi.nano.Lib 1.0 | 2.1 | 14.9% | 84 |
| radnor.DoctorBob 1.42 | 2.2 | 15.1% | 86 |
| vuen.Cake 2.51 | 3.9 | 12.9% | 63 |
| urdos.URDOS 1.3 | 5.0 | 10.7% | 10 |
| adt.Ar1 2.1 | 6.7 | 7.3% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 6.9 | 7.3% | 5 |
| oa.weak.FlyMk1 0.1 | 7.6 | 6.3% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 5.7% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 82.9 | 10 / 35 | 4137 |
| 2 | 3 | 62.1 | 75.2 | 8 / 35 | 3954 |
| 3 | 3 | 60.3 | 71.7 | 7 / 35 | 3596 |
| 4 | 2 | 63.3 | 78.7 | 8 / 35 | 4277 |
| 5 | 1 | 63.9 | 83.5 | 14 / 35 | 3887 |
| 6 | 1 | 63.7 | 82.9 | 10 / 35 | 3786 |
| 7 | 2 | 63.5 | 81.3 | 8 / 35 | 3957 |
| 8 | 2 | 63.5 | 79.0 | 13 / 35 | 4108 |
| 9 | 1 | 65.0 | 85.4 | 14 / 35 | 3976 |
| 10 | 3 | 61.6 | 76.2 | 9 / 35 | 3683 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 69 | 64% |
| vuen.Cake 2.51 | 58 | 59% |
| kawigi.nano.Lib 1.0 | 52 | 13% |
| urdos.URDOS 1.3 | 10 | 80% |
| oa.weak.FlyMk1 0.1 | 5 | 80% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 25% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 251 of 350 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 88 | 35% | 103 |
| radnor.DoctorBob 1.42 | 62 | 25% | 94 |
| vuen.Cake 2.51 | 36 | 14% | 69 |
| urdos.URDOS 1.3 | 33 | 13% | 43 |
| ghent.ArthurPanzergon 1.0.0 | 10 | 4% | 11 |
| adt.Ar1 2.1 | 8 | 3% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 3% | 7 |
| oa.weak.FlyMk1 0.1 | 5 | 2% | 10 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 1% | 4 |

## Melee bench: F04

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 75.4 | 13 / 350 | 3.21 | 14.3% | 41981 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.4% | 321 |
| hadur117.nano.SanaroHS 0.2 | 2.3 | 14.3% | 13 |
| apc.LeeroyJenkins2 1.0 | 2.7 | 13.4% | 8 |
| TNT.TNT 0.99.1 | 4.0 | 10.6% | 1 |
| josago.Jorgito 0.16 | 5.2 | 8.7% | 1 |
| css.Delitioner 0.11 | 6.2 | 7.6% | 3 |
| tj.zombie1n 1.0.1 | 6.9 | 7.3% | 1 |
| rampancy.Durandal 2.1d | 7.8 | 5.6% | 0 |
| spin.Bugstard 0.012b | 9.3 | 4.0% | 1 |
| sp.Nanos.Ember 1.1 | 9.6 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 74.9 | 3 / 35 | 4206 |
| 2 | 3 | 62.9 | 74.6 | 2 / 35 | 4278 |
| 3 | 2 | 63.8 | 75.9 | 2 / 35 | 4557 |
| 4 | 2 | 64.4 | 77.5 | 1 / 35 | 4673 |
| 5 | 3 | 62.1 | 72.1 | 0 / 35 | 4154 |
| 6 | 3 | 60.7 | 70.5 | 0 / 35 | 3846 |
| 7 | 2 | 62.6 | 74.9 | 1 / 35 | 4085 |
| 8 | 2 | 64.5 | 81.3 | 2 / 35 | 4173 |
| 9 | 2 | 63.1 | 74.3 | 1 / 35 | 4328 |
| 10 | 2 | 62.9 | 78.4 | 1 / 35 | 3681 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 176 | 4% |
| apc.LeeroyJenkins2 1.0 | 4 | 75% |
| josago.Jorgito 0.16 | 2 | 50% |
| spin.Bugstard 0.012b | 2 | 50% |
| css.Delitioner 0.11 | 1 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 0% |

Hadur died in 337 of 350 rounds, at a mean tick of 1236. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 229 | 68% | 237 |
| apc.LeeroyJenkins2 1.0 | 41 | 12% | 45 |
| josago.Jorgito 0.16 | 26 | 8% | 27 |
| css.Delitioner 0.11 | 15 | 4% | 16 |
| TNT.TNT 0.99.1 | 13 | 4% | 14 |
| tj.zombie1n 1.0.1 | 5 | 1% | 5 |
| rampancy.Durandal 2.1d | 4 | 1% | 4 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |
| spin.Bugstard 0.012b | 2 | 1% | 0 |

## Melee bench: F06

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 72.1 | 101 / 350 | 3.51 | 14.2% | 34181 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.4 | 15.3% | 88 |
| hadur117.nano.SanaroHS 0.2 | 2.4 | 14.2% | 101 |
| origin.SleepSiphon 1.7b | 2.7 | 14.3% | 100 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.6 | 12.7% | 42 |
| mld.Wisdom 1.0 | 4.9 | 10.8% | 9 |
| gg.Wolverine 2.0 | 6.4 | 8.6% | 6 |
| spinnercat.Omen 1.0 | 7.1 | 7.6% | 3 |
| DBall.NUKE 0.1 | 7.8 | 7.1% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 8.7 | 6.1% | 1 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 79.7 | 11 / 35 | 3835 |
| 2 | 3 | 62.1 | 74.3 | 11 / 35 | 3344 |
| 3 | 3 | 58.7 | 66.0 | 7 / 35 | 3184 |
| 4 | 4 | 60.2 | 68.9 | 9 / 35 | 3203 |
| 5 | 2 | 62.8 | 73.3 | 15 / 35 | 3412 |
| 6 | 3 | 61.9 | 72.1 | 11 / 35 | 3221 |
| 7 | 2 | 60.7 | 69.2 | 8 / 35 | 3612 |
| 8 | 2 | 63.2 | 76.8 | 11 / 35 | 3634 |
| 9 | 2 | 60.2 | 69.2 | 9 / 35 | 3368 |
| 10 | 2 | 61.3 | 71.4 | 9 / 35 | 3368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 57 | 54% |
| jekl.StoneGhost 0.7 | 46 | 50% |
| pe.minimelee.SandboxMiniMelee 1.1 | 36 | 75% |
| mld.Wisdom 1.0 | 10 | 90% |
| gg.Wolverine 2.0 | 9 | 67% |
| DBall.NUKE 0.1 | 2 | 50% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 0% |

Hadur died in 252 of 350 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 89 | 35% | 106 |
| origin.SleepSiphon 1.7b | 66 | 26% | 100 |
| pe.minimelee.SandboxMiniMelee 1.1 | 36 | 14% | 66 |
| mld.Wisdom 1.0 | 24 | 10% | 30 |
| gg.Wolverine 2.0 | 11 | 4% | 15 |
| spinnercat.Omen 1.0 | 11 | 4% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 3% | 11 |
| DBall.NUKE 0.1 | 7 | 3% | 10 |

## Melee bench: F07

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 82.4 | 91 / 350 | 2.59 | 16.2% | 44442 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.6 | 17.4% | 90 |
| rsalesc.melee.Monk 0.3.6c | 1.7 | 17.7% | 98 |
| hadur117.nano.SanaroHS 0.2 | 2.7 | 16.2% | 91 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.7% | 24 |
| franzor.Lizt 1.3.1 | 4.7 | 11.4% | 49 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.6 | 8.0% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.9% | 0 |
| sample.Target 1.0 | 9.4 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.6 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 81.0 | 9 / 35 | 4786 |
| 2 | 3 | 65.5 | 78.1 | 7 / 35 | 4468 |
| 3 | 3 | 67.0 | 86.7 | 11 / 35 | 4160 |
| 4 | 3 | 67.6 | 85.1 | 11 / 35 | 4618 |
| 5 | 3 | 66.3 | 81.0 | 11 / 35 | 4362 |
| 6 | 2 | 67.3 | 85.4 | 8 / 35 | 4790 |
| 7 | 3 | 66.7 | 83.8 | 7 / 35 | 4512 |
| 8 | 2 | 67.1 | 85.7 | 11 / 35 | 4347 |
| 9 | 3 | 66.6 | 83.2 | 9 / 35 | 4489 |
| 10 | 3 | 63.8 | 74.0 | 7 / 35 | 3910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 93 | 55% |
| rsalesc.melee.Monk 0.3.6c | 67 | 18% |
| oog.melee.CapuletDroid 1.1 | 31 | 65% |
| franzor.Lizt 1.3.1 | 21 | 38% |

Hadur died in 260 of 350 rounds, at a mean tick of 1500. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 104 | 40% | 171 |
| rsalesc.melee.Monk 0.3.6c | 97 | 37% | 113 |
| oog.melee.CapuletDroid 1.1 | 29 | 11% | 50 |
| franzor.Lizt 1.3.1 | 18 | 7% | 2 |
| exauge.GateKeeper 1.1.121g | 9 | 3% | 11 |
| lrem.micro.MoggFanatic 0.2 | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 71.6 | 116 / 350 | 3.56 | 14.1% | 32903 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHS 0.2 | 1.8 | 14.1% | 116 |
| tm.Yuugao 1.0 | 1.8 | 14.2% | 85 |
| shrub.Vapour v159 | 2.4 | 13.5% | 77 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.9% | 25 |
| com.spp.robocode.MostlyHarmless 010 | 5.1 | 9.7% | 22 |
| m3thos.Eva00 1.1 | 6.3 | 8.8% | 6 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.4% | 16 |
| qualidafial.MajorDick 1.0.1 | 8.7 | 7.0% | 4 |
| SHAM.WOW 1.4 | 8.7 | 6.6% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 6.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.6 | 72.7 | 13 / 35 | 3733 |
| 2 | 3 | 57.9 | 66.0 | 9 / 35 | 3044 |
| 3 | 2 | 61.2 | 73.3 | 14 / 35 | 3166 |
| 4 | 2 | 56.8 | 63.8 | 9 / 35 | 2933 |
| 5 | 1 | 60.0 | 71.4 | 9 / 35 | 3173 |
| 6 | 3 | 59.0 | 67.3 | 10 / 35 | 3392 |
| 7 | 2 | 60.2 | 72.1 | 8 / 35 | 3328 |
| 8 | 1 | 63.6 | 81.0 | 15 / 35 | 3454 |
| 9 | 1 | 62.3 | 75.9 | 17 / 35 | 3266 |
| 10 | 2 | 61.1 | 72.4 | 12 / 35 | 3414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 61 | 74% |
| shrub.Vapour v159 | 42 | 36% |
| Krabb.sliNk.Garm 0.9u | 20 | 95% |
| com.spp.robocode.MostlyHarmless 010 | 17 | 76% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 83% |
| m3thos.Eva00 1.1 | 11 | 73% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 234 of 350 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 67 | 29% | 78 |
| tm.Yuugao 1.0 | 53 | 23% | 101 |
| Krabb.sliNk.Garm 0.9u | 32 | 14% | 46 |
| com.spp.robocode.MostlyHarmless 010 | 21 | 9% | 34 |
| zyx.nano.BacillusComma 1.0 | 18 | 8% | 23 |
| m3thos.Eva00 1.1 | 17 | 7% | 25 |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 6% | 28 |
| SHAM.WOW 1.4 | 6 | 3% | 9 |
| qualidafial.MajorDick 1.0.1 | 6 | 3% | 6 |

## Melee bench: F09

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 65.6 | 54 / 350 | 4.10 | 12.4% | 27079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.9% | 180 |
| kc.micro.Figment 1.0 | 2.1 | 14.6% | 59 |
| hadur117.nano.SanaroHS 0.2 | 2.9 | 12.4% | 54 |
| yagami.Tidus 0.11 | 4.3 | 11.1% | 3 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.5% | 23 |
| mc2.enemy.Original 0.9 | 5.7 | 9.7% | 21 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 10 |
| step.nanoPri 1.0 | 8.5 | 6.0% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.3% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.7 | 63.5 | 5 / 35 | 2566 |
| 2 | 2 | 60.3 | 71.1 | 8 / 35 | 2885 |
| 3 | 3 | 58.7 | 68.6 | 3 / 35 | 2900 |
| 4 | 3 | 59.3 | 68.6 | 8 / 35 | 2817 |
| 5 | 3 | 57.3 | 61.9 | 8 / 35 | 2821 |
| 6 | 3 | 57.9 | 67.9 | 5 / 35 | 2463 |
| 7 | 3 | 55.0 | 58.7 | 2 / 35 | 2648 |
| 8 | 3 | 58.8 | 66.3 | 4 / 35 | 2954 |
| 9 | 3 | 58.9 | 67.6 | 6 / 35 | 2721 |
| 10 | 3 | 55.5 | 61.6 | 5 / 35 | 2304 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 68 | 29% |
| kc.micro.Figment 1.0 | 32 | 38% |
| pedersen.Grishnakh 1.0 | 11 | 64% |
| mc2.enemy.Original 0.9 | 10 | 80% |
| yagami.Tidus 0.11 | 5 | 100% |
| dft.Calliope 5.6 | 3 | 67% |

Hadur died in 297 of 350 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 101 | 34% | 122 |
| kc.micro.Figment 1.0 | 69 | 23% | 84 |
| yagami.Tidus 0.11 | 33 | 11% | 42 |
| pedersen.Grishnakh 1.0 | 31 | 10% | 32 |
| mc2.enemy.Original 0.9 | 22 | 7% | 28 |
| robar.nano.Assertive_Melee 0.2 | 16 | 5% | 16 |
| dft.Calliope 5.6 | 14 | 5% | 15 |
| step.nanoPri 1.0 | 8 | 3% | 8 |
| rdm.Dueler 0.4x | 3 | 1% | 3 |

## Melee bench: F10

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 82.5 | 135 / 350 | 2.57 | 16.0% | 38971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHS 0.2 | 1.0 | 16.0% | 135 |
| DTF.Kludgy 1.2b | 2.0 | 14.7% | 79 |
| ne.Chimera 1.2 | 3.4 | 13.1% | 34 |
| ejb.Polaris 1.0.1 | 3.9 | 12.5% | 38 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.7% | 38 |
| vStar.RAFzilla 2.15 | 5.4 | 10.5% | 16 |
| sam.Samspin 1.0 | 7.4 | 6.6% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.7% | 1 |
| kurios.DOSexe .9b | 8.3 | 5.7% | 5 |
| donjezza.Muncho 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 76.5 | 11 / 35 | 3864 |
| 2 | 1 | 66.4 | 88.3 | 16 / 35 | 4146 |
| 3 | 1 | 64.1 | 84.1 | 13 / 35 | 3657 |
| 4 | 1 | 64.7 | 81.9 | 18 / 35 | 3968 |
| 5 | 1 | 63.3 | 79.4 | 9 / 35 | 3833 |
| 6 | 1 | 65.7 | 86.3 | 15 / 35 | 3913 |
| 7 | 1 | 62.4 | 78.7 | 9 / 35 | 3672 |
| 8 | 1 | 65.1 | 83.5 | 13 / 35 | 4234 |
| 9 | 1 | 64.9 | 82.9 | 17 / 35 | 3825 |
| 10 | 1 | 64.6 | 83.8 | 14 / 35 | 3859 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 63 | 41% |
| ejb.Polaris 1.0.1 | 59 | 86% |
| ne.Chimera 1.2 | 41 | 61% |
| tvv.micro.Antares 1.1.1 | 31 | 23% |
| vStar.RAFzilla 2.15 | 21 | 67% |
| sam.Samspin 1.0 | 5 | 80% |
| kurios.DOSexe .9b | 4 | 75% |
| donjezza.Muncho 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 215 of 350 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 77 | 36% | 99 |
| ne.Chimera 1.2 | 54 | 25% | 81 |
| tvv.micro.Antares 1.1.1 | 32 | 15% | 33 |
| ejb.Polaris 1.0.1 | 21 | 10% | 78 |
| vStar.RAFzilla 2.15 | 13 | 6% | 26 |
| kurios.DOSexe .9b | 8 | 4% | 13 |
| sam.Samspin 1.0 | 7 | 3% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 1% | 2 |
| donjezza.Muncho 1.0 | 1 | 0% | 6 |

## Melee bench: F11

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 69.0 | 82 / 350 | 3.79 | 13.4% | 30818 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.3% | 139 |
| hadur117.nano.SanaroHS 0.2 | 2.5 | 13.4% | 82 |
| cx.mini.Nimrod 0.55 | 2.6 | 13.1% | 44 |
| djc.DynaBot 0.1.1 | 4.2 | 10.6% | 26 |
| rdt199.Warlord 0.73 | 5.5 | 9.6% | 22 |
| br2.MobyDickBot 1.6 | 6.1 | 9.2% | 14 |
| uji.YellohFellah 1.0 | 6.9 | 8.7% | 21 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.9% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.1 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.0 | 68.3 | 6 / 35 | 3126 |
| 2 | 3 | 58.7 | 66.7 | 7 / 35 | 2967 |
| 3 | 2 | 60.9 | 71.7 | 9 / 35 | 3286 |
| 4 | 3 | 58.1 | 65.7 | 6 / 35 | 2789 |
| 5 | 3 | 59.8 | 67.0 | 12 / 35 | 3044 |
| 6 | 2 | 62.2 | 77.1 | 13 / 35 | 2937 |
| 7 | 3 | 57.0 | 63.5 | 6 / 35 | 2849 |
| 8 | 2 | 59.3 | 67.9 | 6 / 35 | 3444 |
| 9 | 3 | 59.7 | 69.2 | 6 / 35 | 3439 |
| 10 | 2 | 60.8 | 73.0 | 11 / 35 | 2937 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 67 | 45% |
| cx.mini.Nimrod 0.55 | 22 | 73% |
| djc.DynaBot 0.1.1 | 15 | 87% |
| rdt199.Warlord 0.73 | 14 | 86% |
| uji.YellohFellah 1.0 | 10 | 40% |
| br2.MobyDickBot 1.6 | 9 | 67% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 268 of 350 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 101 | 38% | 129 |
| cx.mini.Nimrod 0.55 | 57 | 21% | 70 |
| rdt199.Warlord 0.73 | 30 | 11% | 45 |
| uji.YellohFellah 1.0 | 20 | 7% | 26 |
| KiraNL.Chupacabra 0.4 | 18 | 7% | 20 |
| djc.DynaBot 0.1.1 | 17 | 6% | 28 |
| br2.MobyDickBot 1.6 | 13 | 5% | 21 |
| stelo.MirrorNano 1.3 | 6 | 2% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 2% | 5 |

## Melee bench: F12

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 69.0 | 70 / 350 | 3.79 | 13.2% | 28360 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.9 | 14.4% | 96 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.3% | 78 |
| hadur117.nano.SanaroHS 0.2 | 2.9 | 13.2% | 70 |
| darkcanuck.Leon 1.01 | 3.0 | 13.2% | 68 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.4% | 25 |
| jrm.Test0 1.0 | 6.4 | 8.4% | 3 |
| jp.Perpy 16.0 | 7.4 | 7.5% | 2 |
| cs.sheldor.Talon 1.1 | 7.6 | 7.3% | 0 |
| jaybot.bots.Oddball 4.0 | 8.7 | 6.2% | 9 |
| stuff.Vlad 0.1 | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.9 | 74.0 | 9 / 35 | 2982 |
| 2 | 1 | 62.2 | 77.1 | 10 / 35 | 3027 |
| 3 | 3 | 60.0 | 70.8 | 6 / 35 | 2963 |
| 4 | 4 | 57.2 | 64.1 | 5 / 35 | 2708 |
| 5 | 4 | 57.3 | 65.4 | 6 / 35 | 2693 |
| 6 | 1 | 61.3 | 76.5 | 10 / 35 | 2838 |
| 7 | 4 | 54.8 | 61.3 | 3 / 35 | 2472 |
| 8 | 4 | 57.7 | 65.7 | 6 / 35 | 2732 |
| 9 | 4 | 57.0 | 62.2 | 6 / 35 | 2824 |
| 10 | 2 | 61.2 | 73.3 | 9 / 35 | 3121 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 55 | 27% |
| bts.wiki.RipCurl 0.9b | 54 | 61% |
| darkcanuck.Leon 1.01 | 41 | 20% |
| brainfade.melee.Genghis 0.36 | 8 | 75% |
| jaybot.bots.Oddball 4.0 | 6 | 33% |
| jp.Perpy 16.0 | 3 | 100% |
| jrm.Test0 1.0 | 2 | 50% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 281 of 350 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 72 | 26% | 92 |
| darkcanuck.Leon 1.01 | 63 | 22% | 72 |
| bts.wiki.RipCurl 0.9b | 58 | 21% | 88 |
| brainfade.melee.Genghis 0.36 | 28 | 10% | 31 |
| jrm.Test0 1.0 | 22 | 8% | 24 |
| jaybot.bots.Oddball 4.0 | 14 | 5% | 15 |
| jp.Perpy 16.0 | 11 | 4% | 13 |
| cs.sheldor.Talon 1.1 | 9 | 3% | 9 |
| stuff.Vlad 0.1 | 4 | 1% | 5 |

## Melee bench: F13

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 71.2 | 41 / 350 | 3.59 | 12.9% | 31204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.4 | 17.3% | 101 |
| mn.Combat 3.25.0 | 1.6 | 17.1% | 141 |
| hadur117.nano.SanaroHS 0.2 | 3.8 | 12.9% | 41 |
| shinh.Entangled 0.3 | 4.0 | 12.8% | 40 |
| gh.micro.Gruweltje 0.7 | 4.2 | 12.3% | 27 |
| apc.Colossus2 0.17 | 6.1 | 7.9% | 0 |
| stelo.Wang 1.0 | 6.9 | 6.7% | 0 |
| ayk.WallHugger 1.0 | 8.1 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.9 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 59.2 | 67.6 | 2 / 35 | 3291 |
| 2 | 4 | 59.7 | 68.6 | 4 / 35 | 3208 |
| 3 | 3 | 59.4 | 70.8 | 5 / 35 | 2893 |
| 4 | 3 | 61.8 | 76.8 | 4 / 35 | 3132 |
| 5 | 5 | 58.5 | 66.3 | 4 / 35 | 2957 |
| 6 | 3 | 60.2 | 72.4 | 2 / 35 | 3192 |
| 7 | 3 | 61.2 | 76.5 | 6 / 35 | 2796 |
| 8 | 5 | 58.8 | 68.9 | 4 / 35 | 3136 |
| 9 | 4 | 60.5 | 70.2 | 3 / 35 | 3434 |
| 10 | 3 | 61.3 | 74.0 | 7 / 35 | 3165 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 60 | 38% |
| ags.Glacier 0.2.11 | 52 | 13% |
| shinh.Entangled 0.3 | 22 | 36% |
| gh.micro.Gruweltje 0.7 | 5 | 60% |

Hadur died in 309 of 350 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 111 | 36% | 119 |
| mn.Combat 3.25.0 | 75 | 24% | 97 |
| shinh.Entangled 0.3 | 46 | 15% | 55 |
| gh.micro.Gruweltje 0.7 | 41 | 13% | 44 |
| apc.Colossus2 0.17 | 14 | 5% | 14 |
| stelo.Wang 1.0 | 12 | 4% | 12 |
| ayk.WallHugger 1.0 | 5 | 2% | 5 |
| maribo.FollowFire 1 | 5 | 2% | 4 |

## Melee bench: F14

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 77.7 | 111 / 350 | 3.00 | 14.8% | 34451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.1 | 16.9% | 124 |
| hadur117.nano.SanaroHS 0.2 | 2.0 | 14.8% | 111 |
| catcat20.shape.Theta 0.018 | 2.9 | 12.5% | 67 |
| Lo_Ian.Gandalf_V4 4.0 | 5.2 | 10.3% | 11 |
| sanyi.mikrobi.Roberto 1.0 | 5.7 | 10.0% | 12 |
| co.edu.usb.rc.LidisTron 1.0 | 5.8 | 9.6% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.9 | 10.0% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.4 | 8.2% | 13 |
| pa.Improved 1.0 | 9.0 | 5.5% | 2 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 81.3 | 13 / 35 | 3557 |
| 2 | 2 | 62.3 | 75.9 | 11 / 35 | 3409 |
| 3 | 2 | 61.9 | 75.2 | 8 / 35 | 3567 |
| 4 | 3 | 62.0 | 78.1 | 10 / 35 | 3153 |
| 5 | 1 | 62.4 | 76.2 | 11 / 35 | 3684 |
| 6 | 2 | 64.5 | 80.0 | 15 / 35 | 3546 |
| 7 | 2 | 61.2 | 74.9 | 7 / 35 | 3135 |
| 8 | 2 | 63.9 | 82.9 | 14 / 35 | 3107 |
| 9 | 2 | 62.0 | 74.9 | 7 / 35 | 3777 |
| 10 | 2 | 64.0 | 78.1 | 15 / 35 | 3516 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 99 | 49% |
| catcat20.shape.Theta 0.018 | 48 | 44% |
| sanyi.mikrobi.Roberto 1.0 | 14 | 64% |
| Lo_Ian.Gandalf_V4 4.0 | 13 | 92% |
| co.edu.usb.rc.LidisTron 1.0 | 12 | 67% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 63% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 83% |
| pa.Improved 1.0 | 2 | 50% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 239 of 350 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 95 | 40% | 143 |
| catcat20.shape.Theta 0.018 | 61 | 26% | 77 |
| sanyi.mikrobi.Roberto 1.0 | 20 | 8% | 33 |
| co.edu.usb.rc.LidisTron 1.0 | 18 | 8% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 17 | 7% | 23 |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 6% | 28 |
| Lo_Ian.Gandalf_V4 4.0 | 12 | 5% | 20 |
| pa.Improved 1.0 | 2 | 1% | 4 |
| sample.TrackFire 1.0 | 0 | 0% | 2 |

## Melee bench: F15

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 64.4 | 62 / 350 | 4.21 | 12.7% | 33997 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.2 | 15.0% | 70 |
| emp.Yngwie 1.11 | 2.3 | 14.2% | 108 |
| hadur117.nano.SanaroHS 0.2 | 3.3 | 12.7% | 62 |
| mld.DustBunny 3.8 | 3.5 | 13.1% | 36 |
| cb.nano.Insomnia 1.0 | 5.1 | 11.0% | 28 |
| kawigi.robot.Girl 1.2 | 5.6 | 10.3% | 40 |
| Grystrion.TrackerWO 1.0 | 7.6 | 6.9% | 0 |
| lambdaxy.TBot 0.1 | 7.6 | 6.8% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.9% | 7 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.3 | 63.2 | 3 / 35 | 3351 |
| 2 | 4 | 55.7 | 57.5 | 3 / 35 | 3277 |
| 3 | 2 | 62.4 | 74.6 | 8 / 35 | 3932 |
| 4 | 3 | 59.1 | 65.1 | 6 / 35 | 3577 |
| 5 | 2 | 61.2 | 72.1 | 10 / 35 | 3590 |
| 6 | 4 | 54.8 | 55.2 | 5 / 35 | 3049 |
| 7 | 3 | 58.5 | 64.8 | 6 / 35 | 3513 |
| 8 | 4 | 56.7 | 59.0 | 6 / 35 | 3374 |
| 9 | 2 | 60.5 | 71.4 | 7 / 35 | 3212 |
| 10 | 5 | 56.9 | 61.0 | 8 / 35 | 3122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 33 | 70% |
| kawigi.micro.Shiz 1.1 | 23 | 48% |
| cb.nano.Insomnia 1.0 | 20 | 65% |
| mld.DustBunny 3.8 | 17 | 24% |
| kawigi.robot.Girl 1.2 | 14 | 71% |
| divineomega.TrialBot 0.003 | 2 | 0% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 289 of 350 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 68 | 24% | 79 |
| kawigi.micro.Shiz 1.1 | 60 | 21% | 77 |
| emp.Yngwie 1.11 | 57 | 20% | 84 |
| cb.nano.Insomnia 1.0 | 49 | 17% | 43 |
| kawigi.robot.Girl 1.2 | 25 | 9% | 34 |
| divineomega.TrialBot 0.003 | 11 | 4% | 12 |
| Grystrion.TrackerWO 1.0 | 9 | 3% | 11 |
| lambdaxy.TBot 0.1 | 8 | 3% | 9 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 69.3 | 63 / 350 | 3.76 | 13.8% | 37444 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.7% | 151 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.3 | 14.5% | 17 |
| hadur117.nano.SanaroHS 0.2 | 2.7 | 13.8% | 63 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.2% | 71 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.6% | 29 |
| bvh.fnr.Fenrir 0.36l | 5.6 | 9.4% | 11 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 8.1% | 2 |
| asd.Cthulhu 1.3 | 8.7 | 5.3% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.4% | 6 |
| repositorio.NanoStep 1.0 | 9.5 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 69.8 | 7 / 35 | 3671 |
| 2 | 3 | 59.8 | 65.4 | 9 / 35 | 3543 |
| 3 | 3 | 58.5 | 63.8 | 5 / 35 | 3612 |
| 4 | 2 | 63.7 | 77.1 | 10 / 35 | 4031 |
| 5 | 2 | 60.6 | 69.2 | 7 / 35 | 3566 |
| 6 | 3 | 60.1 | 67.0 | 4 / 35 | 3812 |
| 7 | 3 | 58.5 | 65.4 | 3 / 35 | 3540 |
| 8 | 3 | 62.0 | 72.4 | 5 / 35 | 4043 |
| 9 | 3 | 58.3 | 63.2 | 5 / 35 | 3409 |
| 10 | 2 | 64.5 | 80.0 | 8 / 35 | 4217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 82 | 30% |
| techdude.forest.FlamingForest 1.1 | 25 | 36% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 88% |
| tvv.nano.Polaris 1.2 | 11 | 27% |
| bvh.fnr.Fenrir 0.36l | 7 | 86% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |

Hadur died in 287 of 350 rounds, at a mean tick of 1193. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 127 | 44% | 157 |
| techdude.forest.FlamingForest 1.1 | 36 | 13% | 44 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 35 | 12% | 48 |
| bvh.fnr.Fenrir 0.36l | 34 | 12% | 35 |
| tvv.nano.Polaris 1.2 | 22 | 8% | 25 |
| stelo.IntrinsicVolatility 1.4 | 14 | 5% | 17 |
| divineomega.DivineBot 1.9.4.5 | 10 | 3% | 14 |
| asd.Cthulhu 1.3 | 6 | 2% | 8 |
| repositorio.NanoStep 1.0 | 3 | 1% | 2 |

## Melee bench: F17

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 67.8 | 73 / 350 | 3.90 | 13.3% | 34275 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 2.1 | 14.0% | 82 |
| et.Predator 1.8 | 2.3 | 13.8% | 69 |
| hadur117.nano.SanaroHS 0.2 | 2.8 | 13.3% | 73 |
| cx.BlestPain 1.41 | 3.1 | 12.9% | 62 |
| nic.Nicator 2.4 | 5.1 | 11.5% | 26 |
| ahf.NanoAndrew .4 | 5.7 | 11.1% | 33 |
| maribo.melee.BMV 0.1 | 6.9 | 9.2% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.6% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.6% | 0 |
| goblin.Bender 2.4 | 10.0 | 3.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 74.3 | 8 / 35 | 3698 |
| 2 | 2 | 58.1 | 64.1 | 7 / 35 | 3292 |
| 3 | 4 | 57.7 | 63.2 | 6 / 35 | 3339 |
| 4 | 5 | 58.1 | 61.9 | 6 / 35 | 3462 |
| 5 | 3 | 58.5 | 65.4 | 6 / 35 | 3177 |
| 6 | 2 | 60.6 | 68.9 | 8 / 35 | 3534 |
| 7 | 3 | 59.7 | 67.3 | 7 / 35 | 3546 |
| 8 | 3 | 59.3 | 66.3 | 9 / 35 | 3288 |
| 9 | 2 | 63.5 | 77.1 | 9 / 35 | 3852 |
| 10 | 3 | 60.0 | 69.5 | 7 / 35 | 3087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 44 | 27% |
| oog.melee.Mercutio 1.0 | 43 | 51% |
| cx.BlestPain 1.41 | 29 | 86% |
| nic.Nicator 2.4 | 15 | 60% |
| ahf.NanoAndrew .4 | 11 | 36% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 277 of 350 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 68 | 25% | 81 |
| oog.melee.Mercutio 1.0 | 49 | 18% | 70 |
| ahf.NanoAndrew .4 | 47 | 17% | 52 |
| cx.BlestPain 1.41 | 41 | 15% | 66 |
| nic.Nicator 2.4 | 36 | 13% | 45 |
| maribo.melee.BMV 0.1 | 16 | 6% | 16 |
| tex.Longbot 0.4 | 15 | 5% | 15 |
| edu.otg.spr.TheTeacher 1.2 | 4 | 1% | 4 |
| goblin.Bender 2.4 | 1 | 0% | 1 |

## Melee bench: F18

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 71.9 | 110 / 350 | 3.53 | 14.1% | 31956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.4 | 14.4% | 78 |
| hadur117.nano.SanaroHS 0.2 | 1.8 | 14.1% | 110 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.3% | 63 |
| uji.DBH 1.1 | 4.4 | 11.2% | 32 |
| ratosh.Nobo 0.21 | 5.1 | 10.5% | 11 |
| spinnercat.Robovirus 2.718 | 5.3 | 10.4% | 19 |
| sigterm.Sigterm 1.0 | 7.1 | 8.7% | 17 |
| kawigi.mini.Fhqwhgads 1.1 | 7.9 | 7.1% | 7 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.6% | 1 |
| stelo.WangRobot 1.0 | 9.5 | 5.6% | 12 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.0 | 66.3 | 8 / 35 | 3166 |
| 2 | 1 | 62.1 | 78.7 | 13 / 35 | 3143 |
| 3 | 1 | 65.7 | 87.3 | 18 / 35 | 3655 |
| 4 | 1 | 63.4 | 79.4 | 15 / 35 | 3222 |
| 5 | 2 | 60.0 | 69.2 | 10 / 35 | 3251 |
| 6 | 2 | 57.0 | 64.1 | 6 / 35 | 3055 |
| 7 | 2 | 61.8 | 76.2 | 12 / 35 | 3041 |
| 8 | 2 | 58.1 | 65.7 | 9 / 35 | 3229 |
| 9 | 2 | 62.1 | 73.7 | 13 / 35 | 3367 |
| 10 | 3 | 54.9 | 58.4 | 6 / 35 | 2827 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 59 | 58% |
| agd.Mooserwirt2 2.7 | 38 | 63% |
| uji.DBH 1.1 | 28 | 61% |
| spinnercat.Robovirus 2.718 | 16 | 100% |
| sigterm.Sigterm 1.0 | 11 | 82% |
| ratosh.Nobo 0.21 | 9 | 78% |
| stelo.WangRobot 1.0 | 5 | 0% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 67% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 242 of 350 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 77 | 32% | 113 |
| agd.Mooserwirt2 2.7 | 39 | 16% | 66 |
| ratosh.Nobo 0.21 | 35 | 14% | 44 |
| uji.DBH 1.1 | 34 | 14% | 40 |
| spinnercat.Robovirus 2.718 | 22 | 9% | 38 |
| stelo.WangRobot 1.0 | 13 | 5% | 15 |
| sigterm.Sigterm 1.0 | 12 | 5% | 20 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 6 | 2% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 2% | 6 |

## Melee bench: F19

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 80.7 | 123 / 350 | 2.74 | 15.8% | 36795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mld.Infinity 2.2 | 1.7 | 16.3% | 112 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.1 | 15.8% | 79 |
| hadur117.nano.SanaroHS 0.2 | 2.2 | 15.8% | 123 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.2% | 15 |
| erdnis.Rover 0.3 | 4.8 | 10.6% | 7 |
| patson.PatsonTestBot 1.0 | 6.4 | 8.5% | 2 |
| mbh.Mbh 0.1 | 7.3 | 7.4% | 0 |
| pac.ABC 2.1 | 7.8 | 7.0% | 11 |
| pbg.R2D2 1.0 | 8.5 | 6.2% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 84.1 | 16 / 35 | 3679 |
| 2 | 3 | 63.0 | 74.9 | 7 / 35 | 3705 |
| 3 | 3 | 62.4 | 73.7 | 11 / 35 | 3134 |
| 4 | 2 | 64.5 | 80.3 | 12 / 35 | 3524 |
| 5 | 3 | 63.6 | 78.4 | 11 / 35 | 3241 |
| 6 | 2 | 65.5 | 82.9 | 9 / 35 | 3860 |
| 7 | 3 | 64.3 | 79.4 | 11 / 35 | 3516 |
| 8 | 3 | 64.4 | 78.4 | 11 / 35 | 3720 |
| 9 | 1 | 67.4 | 87.0 | 16 / 35 | 4108 |
| 10 | 1 | 68.2 | 87.6 | 19 / 35 | 4308 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 104 | 50% |
| davidalves.net.DuelistMiniMelee 1.2 | 79 | 53% |
| krillr.mini.JointStrike 2.0.0 | 16 | 69% |
| erdnis.Rover 0.3 | 10 | 90% |
| pac.ABC 2.1 | 8 | 38% |
| patson.PatsonTestBot 1.0 | 7 | 71% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 229 of 350 rounds, at a mean tick of 1071. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 85 | 37% | 175 |
| mld.Infinity 2.2 | 82 | 36% | 44 |
| krillr.mini.JointStrike 2.0.0 | 19 | 8% | 33 |
| patson.PatsonTestBot 1.0 | 14 | 6% | 23 |
| erdnis.Rover 0.3 | 13 | 6% | 26 |
| pac.ABC 2.1 | 8 | 3% | 14 |
| pbg.R2D2 1.0 | 4 | 2% | 18 |
| mbh.Mbh 0.1 | 4 | 2% | 13 |

## Melee bench: F20

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 70.1 | 77 / 350 | 3.69 | 13.6% | 32718 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.0% | 127 |
| hadur117.nano.SanaroHS 0.2 | 2.3 | 13.6% | 77 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 12.2% | 21 |
| fwb.Nine 1.0.1 | 3.9 | 11.8% | 50 |
| catcat20.Rabbit 0.001 | 5.0 | 10.4% | 32 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 9.0% | 14 |
| bayen.nut.Squirrel 1.615 | 6.8 | 8.2% | 17 |
| m3thos.mini.Eva01 0.5.5 | 7.0 | 8.4% | 9 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.5% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 71.7 | 9 / 35 | 3410 |
| 2 | 3 | 57.6 | 63.8 | 7 / 35 | 3069 |
| 3 | 3 | 57.8 | 63.8 | 6 / 35 | 3343 |
| 4 | 2 | 61.2 | 72.4 | 8 / 35 | 3595 |
| 5 | 2 | 59.7 | 69.8 | 7 / 35 | 3154 |
| 6 | 2 | 59.7 | 67.9 | 12 / 35 | 2979 |
| 7 | 2 | 60.0 | 70.5 | 8 / 35 | 3180 |
| 8 | 2 | 62.2 | 77.1 | 9 / 35 | 3372 |
| 9 | 2 | 60.0 | 73.7 | 5 / 35 | 3089 |
| 10 | 2 | 60.9 | 70.5 | 6 / 35 | 3527 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 71 | 45% |
| fwb.Nine 1.0.1 | 17 | 82% |
| nz.jdc.nano.GridFu 1.0 | 16 | 63% |
| catcat20.Rabbit 0.001 | 16 | 44% |
| bayen.nut.Squirrel 1.615 | 10 | 90% |
| djdjdj.NanoSkunk10 1.0 | 5 | 60% |
| m3thos.mini.Eva01 0.5.5 | 2 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% |

Hadur died in 273 of 350 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 116 | 42% | 139 |
| fwb.Nine 1.0.1 | 50 | 18% | 59 |
| nz.jdc.nano.GridFu 1.0 | 36 | 13% | 51 |
| catcat20.Rabbit 0.001 | 23 | 8% | 36 |
| djdjdj.NanoSkunk10 1.0 | 17 | 6% | 20 |
| bayen.nut.Squirrel 1.615 | 14 | 5% | 21 |
| ntc.ControlledChaos 1.1.4 | 9 | 3% | 9 |
| m3thos.mini.Eva01 0.5.5 | 5 | 2% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 1% | 4 |

## Melee bench: F21

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 85.5 | 157 / 350 | 2.30 | 17.5% | 44556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHS 0.2 | 1.4 | 17.5% | 157 |
| eem.EvBot v4.6.16 | 1.6 | 17.2% | 135 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.4% | 19 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 24 |
| eld.Hmm 1.0 | 5.4 | 8.7% | 18 |
| oa.weak.BotherBot 0.1 | 5.6 | 8.5% | 3 |
| fire219.CatBot 1.0 | 7.6 | 6.2% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.1% | 1 |
| PSW.Relentless 0.1 | 8.8 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 83.2 | 14 / 35 | 4455 |
| 2 | 1 | 67.8 | 88.3 | 17 / 35 | 4671 |
| 3 | 1 | 66.8 | 86.0 | 16 / 35 | 4045 |
| 4 | 1 | 67.1 | 85.7 | 14 / 35 | 4490 |
| 5 | 2 | 66.2 | 84.1 | 12 / 35 | 4140 |
| 6 | 2 | 66.2 | 82.2 | 14 / 35 | 4313 |
| 7 | 1 | 68.4 | 86.7 | 19 / 35 | 4975 |
| 8 | 1 | 69.4 | 90.5 | 20 / 35 | 4804 |
| 9 | 2 | 67.2 | 85.4 | 17 / 35 | 4326 |
| 10 | 2 | 66.1 | 83.2 | 14 / 35 | 4337 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 153 | 58% |
| dummy.mini.Scimitar 1.01 | 40 | 85% |
| cf.RiO.RiOx 4.2.1 | 21 | 67% |
| eld.Hmm 1.0 | 20 | 70% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 193 of 350 rounds, at a mean tick of 1316. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 93 | 48% | 163 |
| dummy.mini.Scimitar 1.01 | 45 | 23% | 95 |
| cf.RiO.RiOx 4.2.1 | 35 | 18% | 41 |
| eld.Hmm 1.0 | 10 | 5% | 29 |
| el.JumpShoot 0.2 | 3 | 2% | 6 |
| PSW.Relentless 0.1 | 3 | 2% | 3 |
| oa.weak.BotherBot 0.1 | 2 | 1% | 10 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |

## Melee bench: F23

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 82.5 | 127 / 350 | 2.58 | 16.3% | 38844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.6% | 143 |
| hadur117.nano.SanaroHS 0.2 | 2.0 | 16.3% | 127 |
| cre.Karolos 0.32 | 3.0 | 14.6% | 50 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.5% | 17 |
| stelo.RamTrackSurfer 1.2 | 5.6 | 9.3% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 9.0% | 2 |
| cw.megas.Blade 0.8 | 7.2 | 8.2% | 0 |
| sample.Walls 1.0 | 7.4 | 8.1% | 2 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 85.1 | 18 / 35 | 4051 |
| 2 | 2 | 67.1 | 83.8 | 16 / 35 | 3921 |
| 3 | 2 | 66.0 | 82.2 | 9 / 35 | 3979 |
| 4 | 2 | 65.0 | 80.0 | 9 / 35 | 3728 |
| 5 | 2 | 67.5 | 84.8 | 15 / 35 | 4250 |
| 6 | 2 | 66.2 | 81.9 | 15 / 35 | 3590 |
| 7 | 2 | 66.8 | 83.5 | 10 / 35 | 4102 |
| 8 | 2 | 64.9 | 80.0 | 9 / 35 | 3676 |
| 9 | 2 | 66.8 | 83.8 | 15 / 35 | 3900 |
| 10 | 2 | 65.1 | 79.7 | 11 / 35 | 3647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 109 | 56% |
| cre.Karolos 0.32 | 47 | 57% |
| stelo.AreaTargetingBot 1.1 | 25 | 64% |
| sample.Walls 1.0 | 11 | 100% |
| stelo.RamTrackSurfer 1.2 | 9 | 78% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 50% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 223 of 350 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 110 | 49% | 169 |
| cre.Karolos 0.32 | 58 | 26% | 85 |
| stelo.AreaTargetingBot 1.1 | 28 | 13% | 47 |
| stelo.RamTrackSurfer 1.2 | 10 | 4% | 21 |
| sample.Walls 1.0 | 6 | 3% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 3% | 10 |
| cw.megas.Blade 0.8 | 5 | 2% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.1 | 58.2 | 44 / 350 | 4.76 | 10.9% | 25208 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.6 | 14.6% | 82 |
| davidalves.Phoenix 0.54 | 2.4 | 13.5% | 75 |
| florent.XSeries.X2 0.12 | 2.6 | 13.4% | 69 |
| pedersen.Ugluk 1.1.1 | 3.7 | 12.2% | 42 |
| hadur117.nano.SanaroHS 0.2 | 4.8 | 10.9% | 44 |
| oog.melee.Corsair 1.0 | 6.0 | 10.0% | 11 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.7% | 20 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.5% | 5 |
| as.FrankTheTank 1.3 | 9.4 | 5.1% | 2 |
| evd.X1 0.01 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 51.9 | 53.7 | 3 / 35 | 2398 |
| 2 | 5 | 52.6 | 56.5 | 2 / 35 | 2322 |
| 3 | 5 | 55.2 | 60.0 | 9 / 35 | 2400 |
| 4 | 3 | 59.2 | 71.1 | 8 / 35 | 2630 |
| 5 | 5 | 53.0 | 55.9 | 4 / 35 | 2372 |
| 6 | 4 | 56.3 | 63.5 | 7 / 35 | 2474 |
| 7 | 5 | 53.5 | 55.2 | 3 / 35 | 2656 |
| 8 | 6 | 50.2 | 48.9 | 1 / 35 | 2549 |
| 9 | 5 | 55.6 | 61.0 | 4 / 35 | 2782 |
| 10 | 5 | 53.4 | 56.5 | 3 / 35 | 2625 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 32 | 53% |
| pedersen.Ugluk 1.1.1 | 19 | 74% |
| florent.XSeries.X2 0.12 | 18 | 56% |
| davidalves.Phoenix 0.54 | 11 | 18% |
| stelo.SoJNanoMelee 1.1 | 8 | 0% |
| lunchie.Lunchbox 0.93 | 4 | 0% |
| oog.melee.Corsair 1.0 | 1 | 100% |

Hadur died in 306 of 350 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 76 | 25% | 92 |
| florent.XSeries.X2 0.12 | 60 | 20% | 70 |
| pedersen.Ugluk 1.1.1 | 59 | 19% | 68 |
| davidalves.Phoenix 0.54 | 51 | 17% | 53 |
| stelo.SoJNanoMelee 1.1 | 21 | 7% | 22 |
| oog.melee.Corsair 1.0 | 18 | 6% | 20 |
| lunchie.Lunchbox 0.93 | 11 | 4% | 12 |
| as.FrankTheTank 1.3 | 6 | 2% | 9 |
| evd.X1 0.01 | 4 | 1% | 4 |

## Melee bench: F25

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 67.5 | 79 / 350 | 3.92 | 13.3% | 29438 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.6 | 14.2% | 76 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.8% | 65 |
| hadur117.nano.SanaroHS 0.2 | 2.8 | 13.3% | 79 |
| jdw.Hurricane 1.4 | 3.9 | 12.2% | 47 |
| gre.svman4.Morfeas 1.4.1 | 5.1 | 10.5% | 28 |
| ds.Oo 2.2 | 5.7 | 9.8% | 24 |
| gjr.Cephalosporin 0.1 | 6.9 | 8.6% | 22 |
| awesomeness.Elite 1.0 | 8.5 | 6.9% | 6 |
| adt.Ar2 1.1 | 8.5 | 6.6% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.8 | 67.0 | 7 / 35 | 3075 |
| 2 | 1 | 62.5 | 76.2 | 10 / 35 | 3460 |
| 3 | 2 | 59.3 | 68.6 | 8 / 35 | 2783 |
| 4 | 3 | 60.9 | 71.7 | 10 / 35 | 2907 |
| 5 | 4 | 56.3 | 59.7 | 6 / 35 | 2808 |
| 6 | 4 | 56.7 | 64.4 | 6 / 35 | 2546 |
| 7 | 4 | 56.7 | 61.9 | 5 / 35 | 2740 |
| 8 | 3 | 59.9 | 67.3 | 9 / 35 | 3042 |
| 9 | 2 | 60.9 | 70.8 | 8 / 35 | 3145 |
| 10 | 3 | 59.2 | 67.6 | 10 / 35 | 2932 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 48 | 35% |
| voidious.mini.BrokenSword 2.0.3 | 46 | 41% |
| jdw.Hurricane 1.4 | 23 | 87% |
| gre.svman4.Morfeas 1.4.1 | 16 | 50% |
| ds.Oo 2.2 | 14 | 43% |
| gjr.Cephalosporin 0.1 | 10 | 70% |
| amk.ChumbaMini 0.2 | 2 | 100% |
| adt.Ar2 1.1 | 1 | 0% |

Hadur died in 271 of 350 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 81 | 30% | 98 |
| voidious.mini.BrokenSword 2.0.3 | 58 | 21% | 82 |
| jdw.Hurricane 1.4 | 32 | 12% | 45 |
| ds.Oo 2.2 | 30 | 11% | 36 |
| adt.Ar2 1.1 | 23 | 8% | 24 |
| gjr.Cephalosporin 0.1 | 22 | 8% | 31 |
| gre.svman4.Morfeas 1.4.1 | 19 | 7% | 25 |
| awesomeness.Elite 1.0 | 4 | 1% | 6 |
| amk.ChumbaMini 0.2 | 2 | 1% | 3 |

## Melee bench: F26

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 73.1 | 66 / 350 | 3.42 | 13.9% | 36431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 17.1% | 138 |
| hadur117.nano.SanaroHS 0.2 | 2.1 | 13.9% | 66 |
| lrem.Spectre 0.4.4 | 3.4 | 12.4% | 42 |
| shu.nitro.LENIN .T34 | 3.8 | 12.4% | 60 |
| js.PinBall 1.6 | 5.3 | 10.9% | 15 |
| gh.mini.GrubbmOne 1.0 | 5.4 | 10.9% | 17 |
| jaybot.adv.bots.JayBot 2.0 | 7.1 | 9.1% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 4 |
| sample.SpinBot 1.0 | 8.9 | 5.1% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 78.7 | 8 / 35 | 3580 |
| 2 | 3 | 60.7 | 70.5 | 2 / 35 | 3845 |
| 3 | 2 | 60.5 | 70.5 | 6 / 35 | 3492 |
| 4 | 2 | 63.6 | 79.4 | 9 / 35 | 3754 |
| 5 | 2 | 62.0 | 72.7 | 9 / 35 | 3836 |
| 6 | 2 | 61.0 | 71.4 | 7 / 35 | 3401 |
| 7 | 2 | 61.5 | 72.1 | 8 / 35 | 3683 |
| 8 | 2 | 60.6 | 70.2 | 4 / 35 | 3444 |
| 9 | 2 | 60.5 | 71.4 | 6 / 35 | 3552 |
| 10 | 2 | 62.2 | 74.6 | 7 / 35 | 3844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 75 | 25% |
| lrem.Spectre 0.4.4 | 34 | 62% |
| shu.nitro.LENIN .T34 | 33 | 33% |
| gh.mini.GrubbmOne 1.0 | 15 | 60% |
| js.PinBall 1.6 | 8 | 38% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 1 | 100% |

Hadur died in 285 of 350 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 108 | 38% | 132 |
| shu.nitro.LENIN .T34 | 46 | 16% | 60 |
| gh.mini.GrubbmOne 1.0 | 37 | 13% | 46 |
| lrem.Spectre 0.4.4 | 36 | 13% | 43 |
| js.PinBall 1.6 | 31 | 11% | 36 |
| jaybot.adv.bots.JayBot 2.0 | 12 | 4% | 13 |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 3% | 12 |
| sample.SpinBot 1.0 | 6 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 71.5 | 95 / 350 | 3.56 | 13.6% | 28505 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.3 | 15.6% | 123 |
| hadur117.nano.SanaroHS 0.2 | 2.3 | 13.6% | 95 |
| wee.Gem 1.8.4 | 3.3 | 12.4% | 64 |
| sheldor.melee.nano.TestMelee 0.1 | 3.9 | 11.7% | 35 |
| EH.Eagle 1.0.6 | 5.5 | 9.9% | 14 |
| joe.ADinosaur 1.0 | 6.3 | 9.0% | 7 |
| techdude.kombat.FlamingKombat 1.5 | 6.7 | 8.8% | 8 |
| throxbot.ThroxBot 0.1 | 7.7 | 7.7% | 4 |
| caimano.Furia_Ceca 0.22 | 8.6 | 6.4% | 0 |
| cs.Grudge 1.0 | 9.4 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.4 | 70.2 | 10 / 35 | 2280 |
| 2 | 5 | 52.1 | 43.5 | 4 / 35 | 3571 |
| 3 | 2 | 61.5 | 76.8 | 14 / 35 | 2596 |
| 4 | 2 | 60.4 | 74.3 | 7 / 35 | 2872 |
| 5 | 3 | 59.0 | 73.3 | 6 / 35 | 2418 |
| 6 | 2 | 60.2 | 73.3 | 10 / 35 | 2892 |
| 7 | 2 | 59.9 | 71.7 | 8 / 35 | 2967 |
| 8 | 2 | 60.2 | 71.7 | 10 / 35 | 2889 |
| 9 | 1 | 61.2 | 75.9 | 12 / 35 | 2837 |
| 10 | 1 | 64.4 | 84.4 | 14 / 35 | 3183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 80 | 59% |
| wee.Gem 1.8.4 | 32 | 56% |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 63% |
| joe.ADinosaur 1.0 | 9 | 56% |
| EH.Eagle 1.0.6 | 9 | 78% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 80% |
| throxbot.ThroxBot 0.1 | 4 | 100% |

Hadur died in 255 of 350 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 98 | 38% | 146 |
| wee.Gem 1.8.4 | 36 | 14% | 55 |
| sheldor.melee.nano.TestMelee 0.1 | 32 | 13% | 46 |
| joe.ADinosaur 1.0 | 29 | 11% | 31 |
| EH.Eagle 1.0.6 | 20 | 8% | 26 |
| techdude.kombat.FlamingKombat 1.5 | 15 | 6% | 19 |
| throxbot.ThroxBot 0.1 | 12 | 5% | 14 |
| caimano.Furia_Ceca 0.22 | 8 | 3% | 8 |
| cs.Grudge 1.0 | 5 | 2% | 5 |

## Melee bench: F28

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 77.5 | 113 / 350 | 3.03 | 15.0% | 32462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.3 | 16.0% | 106 |
| hadur117.nano.SanaroHS 0.2 | 1.7 | 15.0% | 113 |
| uji.Antique 1.0 | 3.6 | 12.2% | 50 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.6% | 42 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.3% | 13 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.4% | 9 |
| ahr.ice.Ice 1.0.2 | 6.4 | 8.2% | 11 |
| stelo.PianistNano 1.2 | 8.5 | 6.5% | 0 |
| matt.advanced.Katana 1.0 | 8.7 | 6.4% | 5 |
| stelo.Lifestealer 1.0 | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 84.1 | 15 / 35 | 3454 |
| 2 | 2 | 61.3 | 74.3 | 8 / 35 | 3262 |
| 3 | 2 | 61.0 | 72.7 | 11 / 35 | 3108 |
| 4 | 1 | 62.4 | 78.1 | 11 / 35 | 3121 |
| 5 | 2 | 60.9 | 72.7 | 9 / 35 | 3145 |
| 6 | 2 | 61.2 | 72.7 | 11 / 35 | 3256 |
| 7 | 1 | 64.0 | 80.3 | 13 / 35 | 3523 |
| 8 | 1 | 63.9 | 81.0 | 14 / 35 | 3499 |
| 9 | 2 | 63.2 | 81.3 | 11 / 35 | 3045 |
| 10 | 2 | 62.0 | 77.8 | 10 / 35 | 3049 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 106 | 51% |
| uji.Antique 1.0 | 43 | 72% |
| qohnil.blot.BlotBot 3.61 | 25 | 40% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| amk.ChumbaWumba 0.3 | 5 | 60% |
| matt.advanced.Katana 1.0 | 4 | 75% |
| ahr.ice.Ice 1.0.2 | 3 | 33% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 237 of 350 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 84 | 35% | 125 |
| pfvicm.Sobieski 7.2.3b | 36 | 15% | 43 |
| uji.Antique 1.0 | 34 | 14% | 71 |
| qohnil.blot.BlotBot 3.61 | 32 | 14% | 49 |
| amk.ChumbaWumba 0.3 | 21 | 9% | 25 |
| ahr.ice.Ice 1.0.2 | 12 | 5% | 14 |
| matt.advanced.Katana 1.0 | 6 | 3% | 8 |
| stelo.PianistNano 1.2 | 6 | 3% | 7 |
| stelo.Lifestealer 1.0 | 6 | 3% | 7 |

## Melee bench: F29

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 67.6 | 60 / 350 | 3.92 | 13.3% | 31811 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.4 | 16.6% | 119 |
| zyx.mega.YersiniaPestis 3.1 | 1.8 | 15.6% | 104 |
| hadur117.nano.SanaroHS 0.2 | 3.1 | 13.3% | 60 |
| myl.micro.Troodon 1.10 | 4.1 | 12.3% | 22 |
| jok.PheonixM 0.1.2 | 4.8 | 11.6% | 26 |
| ph.melee.ArcherME 0.3 | 6.1 | 8.4% | 1 |
| DBall.Anarchy 0.1 | 6.7 | 7.8% | 13 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 6.1% | 0 |
| ap.Frederick 1.1 | 9.1 | 4.7% | 7 |
| jangs.ns51 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 68.6 | 8 / 35 | 3345 |
| 2 | 3 | 58.8 | 62.5 | 5 / 35 | 3130 |
| 3 | 3 | 60.7 | 68.6 | 6 / 35 | 3153 |
| 4 | 3 | 60.2 | 68.9 | 7 / 35 | 2885 |
| 5 | 3 | 60.3 | 68.6 | 4 / 35 | 3343 |
| 6 | 4 | 59.6 | 66.7 | 4 / 35 | 3067 |
| 7 | 3 | 58.0 | 61.6 | 3 / 35 | 3387 |
| 8 | 5 | 58.7 | 63.5 | 5 / 35 | 3055 |
| 9 | 1 | 64.4 | 78.7 | 13 / 35 | 3467 |
| 10 | 3 | 59.7 | 67.9 | 5 / 35 | 2979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 55 | 7% |
| zyx.mega.YersiniaPestis 3.1 | 39 | 67% |
| myl.micro.Troodon 1.10 | 20 | 90% |
| DBall.Anarchy 0.1 | 13 | 62% |
| jok.PheonixM 0.1.2 | 8 | 38% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 291 of 350 rounds, at a mean tick of 1030. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 120 | 41% | 126 |
| zyx.mega.YersiniaPestis 3.1 | 67 | 23% | 91 |
| myl.micro.Troodon 1.10 | 39 | 13% | 55 |
| jok.PheonixM 0.1.2 | 34 | 12% | 40 |
| DBall.Anarchy 0.1 | 13 | 4% | 21 |
| ph.melee.ArcherME 0.3 | 7 | 2% | 7 |
| fullsail.TimbotNoPrediction 1.0 | 6 | 2% | 6 |
| jangs.ns51 1.0 | 4 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F30

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.1 | 58.5 | 26 / 350 | 4.73 | 11.1% | 28178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.9 | 14.6% | 93 |
| oog.melee.Capulet 1.2 | 2.5 | 13.9% | 78 |
| darkcanuck.B26354 1.06 | 2.7 | 13.7% | 82 |
| stelo.PastFuture 2.3.2 | 3.0 | 13.4% | 47 |
| hadur117.nano.SanaroHS 0.2 | 4.9 | 11.1% | 26 |
| intruder.PrairieWolf 2.61 | 6.4 | 8.8% | 10 |
| tripphippy.Alice 1.1 | 7.5 | 7.5% | 8 |
| ntc.Opposite 1.5 | 7.5 | 7.6% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.6 | 7.0% | 6 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.4 | 62.5 | 3 / 35 | 3037 |
| 2 | 5 | 52.1 | 53.0 | 3 / 35 | 2425 |
| 3 | 5 | 56.9 | 61.0 | 4 / 35 | 3158 |
| 4 | 5 | 53.6 | 57.1 | 2 / 35 | 2548 |
| 5 | 4 | 56.2 | 61.0 | 2 / 35 | 3033 |
| 6 | 5 | 55.1 | 57.8 | 2 / 35 | 3010 |
| 7 | 5 | 53.6 | 54.6 | 2 / 35 | 2707 |
| 8 | 5 | 56.8 | 62.9 | 3 / 35 | 2766 |
| 9 | 5 | 52.5 | 54.9 | 0 / 35 | 2512 |
| 10 | 5 | 56.5 | 60.3 | 5 / 35 | 2982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 27 | 22% |
| darkcanuck.B26354 1.06 | 19 | 32% |
| oog.melee.Capulet 1.2 | 12 | 17% |
| stelo.PastFuture 2.3.2 | 11 | 64% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 50% |
| intruder.PrairieWolf 2.61 | 4 | 50% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 324 of 350 rounds, at a mean tick of 739. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 67 | 21% | 76 |
| darkcanuck.B26354 1.06 | 66 | 20% | 70 |
| stelo.PastFuture 2.3.2 | 55 | 17% | 61 |
| oog.melee.Capulet 1.2 | 53 | 16% | 59 |
| ntc.Opposite 1.5 | 26 | 8% | 26 |
| tripphippy.Alice 1.1 | 24 | 7% | 24 |
| intruder.PrairieWolf 2.61 | 21 | 6% | 23 |
| fowl3628800.LightningBolt 2.6.0 | 11 | 3% | 10 |
| GarmBox.Anger 1.0 | 1 | 0% | 1 |

## Melee bench: F31

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.7 | 59.3 | 27 / 350 | 4.67 | 11.0% | 24138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.3% | 169 |
| gh.mini.Griezel 0.2 | 2.0 | 14.0% | 90 |
| spinnercat.micro.Tyger 0.1 | 3.6 | 12.0% | 28 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.9% | 27 |
| hadur117.nano.SanaroHS 0.2 | 4.7 | 11.0% | 27 |
| gh.nano.Grofvuil 0.2 | 5.7 | 9.5% | 5 |
| timmit.nano.TimDog 0.33 | 7.2 | 7.0% | 1 |
| fm.mammillarias 1.3 | 8.0 | 6.2% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.4% | 1 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 51.6 | 52.4 | 1 / 35 | 2386 |
| 2 | 5 | 52.1 | 55.9 | 4 / 35 | 2065 |
| 3 | 3 | 58.2 | 65.4 | 3 / 35 | 2793 |
| 4 | 5 | 55.1 | 62.2 | 4 / 35 | 2162 |
| 5 | 5 | 54.5 | 59.0 | 2 / 35 | 2180 |
| 6 | 4 | 55.9 | 61.3 | 4 / 35 | 2377 |
| 7 | 4 | 55.9 | 61.3 | 1 / 35 | 2763 |
| 8 | 5 | 55.4 | 60.3 | 4 / 35 | 2384 |
| 9 | 5 | 54.2 | 57.8 | 2 / 35 | 2352 |
| 10 | 5 | 54.5 | 57.1 | 2 / 35 | 2676 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 45 | 29% |
| abc.Shadow 3.84i | 31 | 26% |
| d414.nano.Quantum 1.0.0 | 7 | 14% |
| spinnercat.micro.Tyger 0.1 | 7 | 29% |
| gh.nano.Grofvuil 0.2 | 3 | 67% |
| fm.mammillarias 1.3 | 1 | 0% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 323 of 350 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 94 | 29% | 106 |
| abc.Shadow 3.84i | 70 | 22% | 80 |
| d414.nano.Quantum 1.0.0 | 49 | 15% | 50 |
| spinnercat.micro.Tyger 0.1 | 44 | 14% | 47 |
| gh.nano.Grofvuil 0.2 | 24 | 7% | 25 |
| fm.mammillarias 1.3 | 16 | 5% | 16 |
| timmit.nano.TimDog 0.33 | 15 | 5% | 15 |
| Gecko.ultimateGeckoBot 1.0 | 9 | 3% | 9 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 79.0 | 147 / 350 | 2.89 | 15.3% | 32876 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHS 0.2 | 1.4 | 15.3% | 147 |
| kawigi.sbf.FloodHT 0.9.2 | 1.7 | 15.2% | 90 |
| apc.botM 3.0 | 3.0 | 12.7% | 53 |
| vjik.UnViolation 1.1 | 4.3 | 11.0% | 19 |
| lxx.ConceptA 0.8 | 4.8 | 10.3% | 10 |
| bayen.UbaMicro 1.4 | 5.8 | 9.3% | 9 |
| panzer.Panzer 0.2 | 7.2 | 7.6% | 2 |
| yk.JahMicro 1.0 | 8.1 | 7.0% | 9 |
| conscience.Electron 1.3g | 8.9 | 6.5% | 2 |
| donjezza.Jezza 1.0 | 9.8 | 5.2% | 10 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 81.6 | 14 / 35 | 2968 |
| 2 | 1 | 63.6 | 82.9 | 13 / 35 | 3464 |
| 3 | 2 | 63.4 | 80.3 | 15 / 35 | 3416 |
| 4 | 2 | 63.0 | 80.6 | 15 / 35 | 3123 |
| 5 | 1 | 63.5 | 79.4 | 16 / 35 | 3453 |
| 6 | 1 | 64.1 | 83.2 | 17 / 35 | 3239 |
| 7 | 2 | 60.0 | 69.5 | 12 / 35 | 3174 |
| 8 | 2 | 60.7 | 72.7 | 13 / 35 | 3226 |
| 9 | 1 | 63.7 | 81.9 | 15 / 35 | 3229 |
| 10 | 1 | 63.6 | 78.1 | 17 / 35 | 3584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 91 | 68% |
| apc.botM 3.0 | 44 | 66% |
| vjik.UnViolation 1.1 | 30 | 80% |
| lxx.ConceptA 0.8 | 16 | 88% |
| yk.JahMicro 1.0 | 7 | 71% |
| panzer.Panzer 0.2 | 6 | 100% |
| donjezza.Jezza 1.0 | 6 | 33% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| conscience.Electron 1.3g | 2 | 50% |

Hadur died in 203 of 350 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 67 | 33% | 133 |
| apc.botM 3.0 | 38 | 19% | 67 |
| lxx.ConceptA 0.8 | 31 | 15% | 36 |
| bayen.UbaMicro 1.4 | 20 | 10% | 25 |
| vjik.UnViolation 1.1 | 13 | 6% | 45 |
| panzer.Panzer 0.2 | 10 | 5% | 12 |
| conscience.Electron 1.3g | 9 | 4% | 12 |
| yk.JahMicro 1.0 | 8 | 4% | 11 |
| donjezza.Jezza 1.0 | 7 | 3% | 9 |

## Melee bench: F33

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 73.8 | 90 / 350 | 3.35 | 14.6% | 34524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.3 | 17.0% | 106 |
| hadur117.nano.SanaroHS 0.2 | 2.2 | 14.6% | 90 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 13.7% | 73 |
| labg.Cataclysm 2.05 | 4.2 | 11.5% | 38 |
| gre.svman4.Leonidas 1.3.2 | 5.0 | 10.5% | 23 |
| baal.nano.N 1.42 | 6.2 | 9.1% | 4 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.7% | 14 |
| zyx.micro.Ant 1.1 | 8.3 | 5.7% | 0 |
| sanja.First 0.1 | 9.1 | 5.0% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.6 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 76.2 | 11 / 35 | 3493 |
| 2 | 2 | 63.0 | 76.2 | 8 / 35 | 3558 |
| 3 | 3 | 61.6 | 72.7 | 7 / 35 | 3491 |
| 4 | 2 | 59.9 | 68.3 | 7 / 35 | 3152 |
| 5 | 2 | 62.8 | 74.9 | 10 / 35 | 3557 |
| 6 | 2 | 60.2 | 69.5 | 8 / 35 | 3317 |
| 7 | 3 | 60.6 | 69.8 | 8 / 35 | 3087 |
| 8 | 2 | 63.7 | 78.4 | 11 / 35 | 3744 |
| 9 | 1 | 64.6 | 78.7 | 12 / 35 | 3859 |
| 10 | 3 | 61.9 | 73.7 | 8 / 35 | 3266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 76 | 59% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 52 | 17% |
| gre.svman4.Leonidas 1.3.2 | 22 | 77% |
| labg.Cataclysm 2.05 | 18 | 56% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 57% |
| sanja.First 0.1 | 2 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| baal.nano.N 1.42 | 2 | 50% |

Hadur died in 261 of 350 rounds, at a mean tick of 1164. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 95 | 36% | 139 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 73 | 28% | 87 |
| gre.svman4.Leonidas 1.3.2 | 25 | 10% | 40 |
| labg.Cataclysm 2.05 | 20 | 8% | 30 |
| kinsen.melee.Angsaichmophobia 1.8c | 19 | 7% | 19 |
| baal.nano.N 1.42 | 16 | 6% | 19 |
| zyx.micro.Ant 1.1 | 9 | 3% | 11 |
| sanja.First 0.1 | 2 | 1% | 3 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 1% | 2 |

## Melee bench: F34

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 70.8 | 59 / 350 | 3.63 | 13.4% | 33587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.4 | 17.3% | 115 |
| stelo.Spread 0.9 | 1.6 | 17.1% | 120 |
| hadur117.nano.SanaroHS 0.2 | 3.1 | 13.4% | 59 |
| jcs.Seth 1.8 | 4.3 | 11.9% | 32 |
| tcf.Reach 3 | 4.6 | 11.3% | 18 |
| cli.Dancer 1.1 | 6.0 | 9.6% | 5 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 2 |
| amk.Punbot.Punbot 0.01 | 8.2 | 5.2% | 0 |
| sample.VelociRobot 1.0 | 8.8 | 3.9% | 0 |
| sample.RamFire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.5 | 79.0 | 7 / 35 | 3266 |
| 2 | 4 | 57.9 | 65.1 | 2 / 35 | 2805 |
| 3 | 3 | 61.1 | 70.5 | 7 / 35 | 3342 |
| 4 | 3 | 58.9 | 64.8 | 5 / 35 | 3126 |
| 5 | 3 | 62.1 | 75.2 | 3 / 35 | 3509 |
| 6 | 3 | 59.5 | 67.0 | 4 / 35 | 3217 |
| 7 | 3 | 61.2 | 69.2 | 7 / 35 | 3570 |
| 8 | 3 | 60.9 | 69.5 | 8 / 35 | 3356 |
| 9 | 3 | 64.4 | 77.5 | 12 / 35 | 3750 |
| 10 | 3 | 61.4 | 70.2 | 4 / 35 | 3646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 55 | 53% |
| kid.Gladiator .7.2 | 48 | 21% |
| jcs.Seth 1.8 | 14 | 71% |
| tcf.Reach 3 | 12 | 58% |
| ratosh.Wesco 1.4 | 4 | 75% |
| cli.Dancer 1.1 | 2 | 0% |

Hadur died in 291 of 350 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 120 | 41% | 125 |
| stelo.Spread 0.9 | 75 | 26% | 104 |
| jcs.Seth 1.8 | 35 | 12% | 49 |
| tcf.Reach 3 | 28 | 10% | 36 |
| cli.Dancer 1.1 | 15 | 5% | 15 |
| ratosh.Wesco 1.4 | 12 | 4% | 15 |
| amk.Punbot.Punbot 0.01 | 3 | 1% | 3 |
| sample.RamFire 1.0 | 2 | 1% | 2 |
| sample.VelociRobot 1.0 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 68.5 | 24 / 350 | 3.83 | 12.3% | 26035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.8% | 280 |
| gh.mini.Gruwel 0.9 | 2.2 | 13.5% | 29 |
| hadur117.nano.SanaroHS 0.2 | 3.6 | 12.3% | 24 |
| rz.HawkOnFire 0.1 | 3.8 | 12.2% | 7 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.4 | 11.5% | 8 |
| wit.Chuliath 1.0 | 6.4 | 7.0% | 1 |
| myl.nano.KomoriNinja 1.1 | 6.6 | 7.1% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 5.9% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.6 | 68.9 | 3 / 35 | 2544 |
| 2 | 4 | 57.1 | 65.7 | 1 / 35 | 2607 |
| 3 | 5 | 56.2 | 64.4 | 1 / 35 | 2248 |
| 4 | 3 | 60.8 | 74.9 | 5 / 35 | 2632 |
| 5 | 4 | 57.0 | 65.4 | 3 / 35 | 2417 |
| 6 | 3 | 59.5 | 70.5 | 3 / 35 | 2812 |
| 7 | 4 | 57.2 | 64.4 | 0 / 35 | 2589 |
| 8 | 3 | 58.5 | 69.5 | 1 / 35 | 2641 |
| 9 | 4 | 58.2 | 67.6 | 2 / 35 | 2646 |
| 10 | 2 | 60.9 | 74.0 | 5 / 35 | 2899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 80 | 1% |
| gh.mini.Gruwel 0.9 | 20 | 45% |
| rz.HawkOnFire 0.1 | 10 | 70% |
| dmh.robocode.robot.BlackDeath 9.2 | 6 | 83% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |
| wit.Chuliath 1.0 | 1 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 326 of 350 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 141 | 43% | 144 |
| gh.mini.Gruwel 0.9 | 66 | 20% | 75 |
| rz.HawkOnFire 0.1 | 50 | 15% | 55 |
| dmh.robocode.robot.BlackDeath 9.2 | 31 | 10% | 35 |
| myl.nano.KomoriNinja 1.1 | 14 | 4% | 14 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 11 | 3% | 11 |
| wit.Chuliath 1.0 | 6 | 2% | 8 |
| dans.Cinnamon 1.2 | 5 | 2% | 5 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 3 |

## Melee bench: F36

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 72.7 | 120 / 350 | 3.46 | 14.7% | 34621 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHS 0.2 | 1.4 | 14.7% | 120 |
| bzdp.Pansy 2.1 | 2.3 | 12.6% | 58 |
| alpha.RainingFire 1.0 | 3.0 | 12.4% | 53 |
| mz.Cork 0.1 | 3.6 | 11.8% | 40 |
| bvh.micro.Freya 0.3 | 5.3 | 10.9% | 29 |
| bvh.mini.Fenrir 0.39 | 6.1 | 9.6% | 14 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.8% | 17 |
| squidM.TentalceMeleeNano 1.1 | 8.4 | 7.0% | 6 |
| dl.BetterWalls 1.0 | 8.6 | 7.0% | 4 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.4% | 11 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 75.9 | 17 / 35 | 3668 |
| 2 | 1 | 63.4 | 80.0 | 12 / 35 | 3470 |
| 3 | 3 | 58.4 | 64.4 | 9 / 35 | 3374 |
| 4 | 1 | 61.2 | 70.8 | 13 / 35 | 3426 |
| 5 | 1 | 62.9 | 77.5 | 9 / 35 | 3826 |
| 6 | 1 | 61.0 | 72.7 | 10 / 35 | 3304 |
| 7 | 1 | 64.1 | 79.4 | 17 / 35 | 3428 |
| 8 | 2 | 59.0 | 67.0 | 8 / 35 | 3393 |
| 9 | 1 | 61.9 | 72.7 | 13 / 35 | 3438 |
| 10 | 2 | 59.6 | 66.7 | 12 / 35 | 3294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 41% |
| mz.Cork 0.1 | 34 | 79% |
| bvh.micro.Freya 0.3 | 33 | 94% |
| alpha.RainingFire 1.0 | 32 | 44% |
| m3thos.Eva02 0.7.1 | 13 | 85% |
| bvh.mini.Fenrir 0.39 | 12 | 92% |
| sample.MyFirstRobot 1.0 | 5 | 20% |
| squidM.TentalceMeleeNano 1.1 | 5 | 60% |
| dl.BetterWalls 1.0 | 4 | 100% |

Hadur died in 230 of 350 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 55 | 24% | 70 |
| bzdp.Pansy 2.1 | 51 | 22% | 74 |
| mz.Cork 0.1 | 35 | 15% | 66 |
| bvh.micro.Freya 0.3 | 25 | 11% | 45 |
| bvh.mini.Fenrir 0.39 | 25 | 11% | 30 |
| m3thos.Eva02 0.7.1 | 16 | 7% | 30 |
| sample.MyFirstRobot 1.0 | 9 | 4% | 13 |
| squidM.TentalceMeleeNano 1.1 | 9 | 4% | 13 |
| dl.BetterWalls 1.0 | 5 | 2% | 9 |

## Melee bench: F37

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 81.4 | 156 / 350 | 2.68 | 16.2% | 43448 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHS 0.2 | 1.0 | 16.2% | 156 |
| germ.TheMind .2 | 2.5 | 11.5% | 53 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 11.0% | 25 |
| EBBU.Sim2 1.02 | 3.9 | 10.7% | 31 |
| stelo.UntouchableNano 1.3 | 6.1 | 9.2% | 24 |
| mb.Beast 0.1 | 6.8 | 8.6% | 19 |
| agrach.Dalek 1.0 | 6.8 | 9.1% | 24 |
| lmk.ACPFinal 0.1 | 7.2 | 8.6% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 8.1 | 8.0% | 0 |
| skm.Ryubot 1.0 | 9.3 | 7.1% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 74.6 | 10 / 35 | 4613 |
| 2 | 1 | 66.1 | 89.8 | 21 / 35 | 4402 |
| 3 | 1 | 61.4 | 77.5 | 13 / 35 | 3789 |
| 4 | 1 | 64.2 | 81.9 | 15 / 35 | 4474 |
| 5 | 1 | 64.9 | 85.7 | 20 / 35 | 4267 |
| 6 | 1 | 64.6 | 83.2 | 19 / 35 | 4353 |
| 7 | 1 | 63.8 | 79.0 | 13 / 35 | 4934 |
| 8 | 1 | 61.7 | 77.8 | 11 / 35 | 4103 |
| 9 | 1 | 64.2 | 83.8 | 17 / 35 | 4248 |
| 10 | 1 | 63.8 | 80.3 | 17 / 35 | 4265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 57 | 61% |
| EBBU.Sim2 1.02 | 37 | 51% |
| stelo.UntouchableNano 1.3 | 28 | 82% |
| mb.Beast 0.1 | 28 | 71% |
| com.syncleus.robocode.Dreadnaught 0.1 | 25 | 72% |
| agrach.Dalek 1.0 | 21 | 76% |
| skm.Ryubot 1.0 | 14 | 86% |
| lmk.ACPFinal 0.1 | 12 | 83% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 196 of 350 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 44 | 22% | 72 |
| EBBU.Sim2 1.02 | 42 | 21% | 58 |
| com.syncleus.robocode.Dreadnaught 0.1 | 25 | 13% | 52 |
| mb.Beast 0.1 | 23 | 12% | 39 |
| lmk.ACPFinal 0.1 | 21 | 11% | 32 |
| stelo.UntouchableNano 1.3 | 16 | 8% | 32 |
| agrach.Dalek 1.0 | 11 | 6% | 34 |
| mn.nano.perceptual.Impact 1.3.0 | 8 | 4% | 12 |
| skm.Ryubot 1.0 | 6 | 3% | 17 |

## Melee bench: F38

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 64.1 | 46 / 350 | 4.23 | 12.0% | 28417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.1 | 16.6% | 152 |
| bvh.mini.Freya 0.55 | 2.2 | 13.9% | 52 |
| hadur117.nano.SanaroHS 0.2 | 3.7 | 12.0% | 46 |
| bts.mega.Gnarly 1.4 | 4.6 | 11.2% | 41 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 11.4% | 23 |
| cs.Wren 1.0 | 4.9 | 11.2% | 24 |
| kdf.KoulDestroyer 1.0 | 6.8 | 9.3% | 8 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.9% | 4 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.8% | 2 |
| bzdp.BoxCar 2.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.0 | 58.1 | 4 / 35 | 2851 |
| 2 | 1 | 61.1 | 75.9 | 8 / 35 | 2972 |
| 3 | 6 | 56.3 | 63.5 | 3 / 35 | 2670 |
| 4 | 4 | 55.6 | 60.3 | 4 / 35 | 2693 |
| 5 | 4 | 57.2 | 64.1 | 3 / 35 | 2859 |
| 6 | 3 | 59.3 | 66.3 | 7 / 35 | 3283 |
| 7 | 3 | 57.7 | 65.7 | 5 / 35 | 2847 |
| 8 | 4 | 56.3 | 64.4 | 4 / 35 | 2459 |
| 9 | 4 | 54.5 | 57.5 | 4 / 35 | 2784 |
| 10 | 4 | 58.0 | 64.8 | 4 / 35 | 2999 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 50 | 50% |
| bvh.mini.Freya 0.55 | 21 | 48% |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 10% |
| bts.mega.Gnarly 1.4 | 9 | 44% |
| cs.Wren 1.0 | 6 | 0% |
| kdf.KoulDestroyer 1.0 | 5 | 80% |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 50% |

Hadur died in 305 of 350 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 82 | 27% | 108 |
| bvh.mini.Freya 0.55 | 50 | 16% | 56 |
| cs.Wren 1.0 | 43 | 14% | 44 |
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 13% | 42 |
| bts.mega.Gnarly 1.4 | 38 | 12% | 43 |
| kdf.KoulDestroyer 1.0 | 30 | 10% | 35 |
| kawigi.spare.SpareParts 0.7.6nosnd | 10 | 3% | 11 |
| matt.UnderDark3 2.4.34 | 8 | 3% | 8 |
| bzdp.BoxCar 2.0 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F39

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 66.5 | 54 / 350 | 4.01 | 12.6% | 31024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.1 | 15.6% | 77 |
| az.Ololobot 0.2.4 | 2.2 | 13.5% | 108 |
| hadur117.nano.SanaroHS 0.2 | 3.3 | 12.6% | 54 |
| catcat20.Lambda 0.024 | 3.6 | 11.7% | 53 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 10.5% | 38 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.5% | 6 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 8.4% | 8 |
| gimp.GimpBot 0.1 | 7.5 | 7.9% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 6.2% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.6 | 61.9 | 6 / 35 | 2693 |
| 2 | 3 | 60.4 | 73.3 | 5 / 35 | 3375 |
| 3 | 5 | 54.4 | 59.0 | 2 / 35 | 2967 |
| 4 | 2 | 59.0 | 68.9 | 10 / 35 | 3168 |
| 5 | 4 | 54.8 | 60.3 | 3 / 35 | 2991 |
| 6 | 3 | 58.6 | 68.3 | 4 / 35 | 3217 |
| 7 | 5 | 55.4 | 61.0 | 5 / 35 | 3039 |
| 8 | 2 | 58.8 | 68.3 | 7 / 35 | 3301 |
| 9 | 3 | 57.5 | 67.6 | 4 / 35 | 3207 |
| 10 | 2 | 60.7 | 76.8 | 8 / 35 | 3066 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 39 | 44% |
| az.Ololobot 0.2.4 | 39 | 13% |
| catcat20.Lambda 0.024 | 33 | 70% |
| stelo.SoRobotNanoMelee 1.2 | 19 | 37% |
| gimp.GimpBot 0.1 | 3 | 33% |
| winamp32.micro.MicroMacro 1.0 | 1 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 0% |

Hadur died in 297 of 350 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 107 | 36% | 119 |
| az.Ololobot 0.2.4 | 50 | 17% | 58 |
| stelo.SoRobotNanoMelee 1.2 | 45 | 15% | 47 |
| catcat20.Lambda 0.024 | 33 | 11% | 50 |
| apollokidd.ApolloKidd 0.9 | 25 | 8% | 26 |
| winamp32.micro.MicroMacro 1.0 | 13 | 4% | 17 |
| gimp.GimpBot 0.1 | 11 | 4% | 15 |
| dcs.Eater_of_Worlds 1.1.3-A | 10 | 3% | 11 |
| whitesquare.robots.SkynetAdvanced 1.1 | 3 | 1% | 5 |

## Melee bench: F41

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 69.6 | 86 / 350 | 3.73 | 13.4% | 30331 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.9% | 142 |
| ary.Swarm 1.1 | 2.9 | 13.6% | 26 |
| lessonz.robocode.Oz 0.5.0 | 3.2 | 13.1% | 46 |
| hadur117.nano.SanaroHS 0.2 | 3.6 | 13.4% | 86 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 12.2% | 41 |
| shrub.Silver v048 | 6.2 | 8.8% | 2 |
| zyx.nano.Ant 1.1 | 6.8 | 7.6% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 6.2% | 6 |
| stelo.Mirror 1.1 | 8.7 | 5.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.8 | 68.3 | 8 / 35 | 2944 |
| 2 | 3 | 61.4 | 73.3 | 10 / 35 | 2887 |
| 3 | 3 | 58.9 | 64.8 | 5 / 35 | 3326 |
| 4 | 5 | 58.2 | 64.1 | 4 / 35 | 2992 |
| 5 | 3 | 62.5 | 73.3 | 11 / 35 | 3353 |
| 6 | 3 | 62.0 | 74.3 | 10 / 35 | 3013 |
| 7 | 2 | 62.9 | 76.5 | 13 / 35 | 3075 |
| 8 | 4 | 58.8 | 66.3 | 10 / 35 | 2768 |
| 9 | 5 | 60.1 | 68.3 | 7 / 35 | 3023 |
| 10 | 4 | 59.0 | 67.0 | 8 / 35 | 2950 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 81 | 49% |
| lessonz.robocode.Oz 0.5.0 | 26 | 58% |
| ary.Swarm 1.1 | 23 | 78% |
| simonton.nano.MeleeSeed 1.8 | 19 | 63% |
| jsal.Jsalbot 1.0 | 2 | 50% |

Hadur died in 264 of 350 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 81 | 31% | 125 |
| lessonz.robocode.Oz 0.5.0 | 51 | 19% | 60 |
| simonton.nano.MeleeSeed 1.8 | 50 | 19% | 61 |
| ary.Swarm 1.1 | 49 | 19% | 66 |
| shrub.Silver v048 | 10 | 4% | 10 |
| zyx.nano.Ant 1.1 | 8 | 3% | 9 |
| jsal.Jsalbot 1.0 | 6 | 2% | 8 |
| stelo.Mirror 1.1 | 5 | 2% | 7 |
| acogdev.alpha 0.2 | 4 | 2% | 4 |

## Melee bench: F42

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 73.8 | 73 / 350 | 3.36 | 14.0% | 34270 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.6% | 165 |
| hadur117.nano.SanaroHS 0.2 | 2.8 | 14.0% | 73 |
| maribo.mini.MiniQuester 0.1 | 2.9 | 14.1% | 40 |
| ara.Shera 0.88 | 3.3 | 13.6% | 55 |
| amz.NanoClone 1.41 | 5.0 | 9.6% | 7 |
| maribo.IotaCT 1.1 | 6.3 | 7.6% | 2 |
| dsw.StaticD 1.0 | 6.9 | 7.1% | 7 |
| stelo.MirrorMicro 1.0 | 8.8 | 5.7% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.2 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.7 | 74.0 | 8 / 35 | 3556 |
| 2 | 2 | 63.6 | 78.1 | 7 / 35 | 3758 |
| 3 | 2 | 62.5 | 77.1 | 8 / 35 | 3674 |
| 4 | 2 | 62.2 | 78.1 | 8 / 35 | 3186 |
| 5 | 4 | 57.8 | 65.1 | 3 / 35 | 3255 |
| 6 | 3 | 61.8 | 73.3 | 11 / 35 | 3512 |
| 7 | 2 | 63.3 | 77.1 | 11 / 35 | 3715 |
| 8 | 3 | 58.9 | 68.9 | 6 / 35 | 3022 |
| 9 | 2 | 62.0 | 77.5 | 6 / 35 | 3350 |
| 10 | 4 | 58.9 | 68.6 | 5 / 35 | 3242 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 82 | 44% |
| ara.Shera 0.88 | 31 | 55% |
| maribo.mini.MiniQuester 0.1 | 25 | 64% |
| dsw.StaticD 1.0 | 3 | 33% |
| maribo.IotaCT 1.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 0% |

Hadur died in 277 of 350 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 98 | 35% | 133 |
| ara.Shera 0.88 | 69 | 25% | 86 |
| maribo.mini.MiniQuester 0.1 | 66 | 24% | 83 |
| amz.NanoClone 1.41 | 23 | 8% | 23 |
| maribo.IotaCT 1.1 | 10 | 4% | 12 |
| dsw.StaticD 1.0 | 5 | 2% | 6 |
| mme.NikeEnhanced 2.0 | 3 | 1% | 3 |
| stelo.MirrorMicro 1.0 | 2 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 0% | 2 |

## Melee bench: F43

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 61.3 | 28 / 350 | 4.48 | 11.4% | 26766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.7% | 266 |
| brainfade.melee.Dusk 0.44 | 2.4 | 13.1% | 31 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.9% | 16 |
| hadur117.nano.SanaroHS 0.2 | 4.0 | 11.4% | 28 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.2% | 6 |
| Krabb.akim2.Akim2 1.1b | 5.6 | 9.9% | 1 |
| mz.NanoGod 2.02 | 7.1 | 8.4% | 1 |
| jab.DiamondStealer 5 | 7.9 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 71.1 | 5 / 35 | 2959 |
| 2 | 4 | 56.3 | 60.0 | 3 / 35 | 2435 |
| 3 | 6 | 52.6 | 49.2 | 2 / 35 | 2259 |
| 4 | 3 | 59.6 | 66.0 | 4 / 35 | 2749 |
| 5 | 6 | 52.3 | 49.8 | 0 / 35 | 2411 |
| 6 | 4 | 58.4 | 62.5 | 2 / 35 | 2729 |
| 7 | 4 | 58.3 | 63.8 | 3 / 35 | 2661 |
| 8 | 3 | 58.8 | 64.8 | 3 / 35 | 2720 |
| 9 | 5 | 56.7 | 58.7 | 1 / 35 | 2623 |
| 10 | 2 | 60.6 | 67.0 | 5 / 35 | 3220 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 64 | 22% |
| brainfade.melee.Dusk 0.44 | 11 | 73% |
| dummy.micro.Sparrow 2.5 | 5 | 40% |
| mz.NanoGod 2.02 | 2 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 50% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 322 of 350 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 145 | 45% | 160 |
| wcsv.melee.EngineerMelee 0.1 | 40 | 12% | 40 |
| brainfade.melee.Dusk 0.44 | 39 | 12% | 45 |
| dummy.micro.Sparrow 2.5 | 37 | 11% | 40 |
| mz.NanoGod 2.02 | 25 | 8% | 26 |
| jab.DiamondStealer 5 | 18 | 6% | 21 |
| Krabb.akim2.Akim2 1.1b | 16 | 5% | 16 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 73.2 | 91 / 350 | 3.41 | 14.5% | 35747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.2 | 16.9% | 132 |
| tzu.TheArtOfWar 1.2 | 2.1 | 15.2% | 86 |
| hadur117.nano.SanaroHS 0.2 | 2.7 | 14.5% | 91 |
| wompi.Quokka 1.6 | 4.5 | 10.7% | 13 |
| jwirde.Gort 2.0 | 4.6 | 10.5% | 23 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.9 | 9.4% | 2 |
| disan.Chair 2.2.0 | 7.1 | 7.6% | 1 |
| stf.PanzerGeneral 0.1 | 7.9 | 6.4% | 3 |
| sample.Crazy 1.0 | 9.2 | 4.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.9 | 73.7 | 10 / 35 | 3701 |
| 2 | 3 | 59.7 | 67.6 | 5 / 35 | 3375 |
| 3 | 2 | 63.5 | 73.7 | 12 / 35 | 3887 |
| 4 | 3 | 62.0 | 74.6 | 9 / 35 | 3315 |
| 5 | 3 | 62.9 | 74.9 | 13 / 35 | 3551 |
| 6 | 3 | 63.0 | 75.9 | 7 / 35 | 3791 |
| 7 | 1 | 63.9 | 79.7 | 12 / 35 | 3624 |
| 8 | 3 | 60.2 | 69.2 | 6 / 35 | 3564 |
| 9 | 3 | 61.0 | 69.2 | 8 / 35 | 3521 |
| 10 | 3 | 62.5 | 74.0 | 9 / 35 | 3418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 79 | 63% |
| tzu.TheArtOfWar 1.2 | 42 | 26% |
| wompi.Quokka 1.6 | 16 | 81% |
| jwirde.Gort 2.0 | 15 | 47% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 100% |
| disan.Chair 2.2.0 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 0% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 259 of 350 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 92 | 36% | 106 |
| stelo.Liblix 0.3.1 | 84 | 32% | 139 |
| jwirde.Gort 2.0 | 23 | 9% | 34 |
| wompi.Quokka 1.6 | 20 | 8% | 25 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 15 | 6% | 18 |
| disan.Chair 2.2.0 | 10 | 4% | 11 |
| stf.PanzerGeneral 0.1 | 9 | 3% | 10 |
| amk.jointstrike.JointStrike 0.2 | 4 | 2% | 5 |
| sample.Crazy 1.0 | 2 | 1% | 2 |

## Melee bench: F45

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 73.8 | 76 / 350 | 3.36 | 14.9% | 37746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHS 0.2 | 1.3 | 14.9% | 76 |
| eem.IWillFireNoBullet v2.8 | 2.7 | 12.0% | 162 |
| jje.BagPuss 1.2 | 2.9 | 12.5% | 32 |
| sul.Lunar 1.1 | 4.3 | 11.0% | 39 |
| myl.nano.Graviton 1.10 | 4.7 | 10.5% | 17 |
| pez.mini.ChironexFleckeri 0.5 | 6.4 | 8.9% | 10 |
| hvilela.HVilela 0.9 | 6.6 | 8.9% | 1 |
| fm.claire 1.7 | 7.7 | 8.4% | 0 |
| wit.Deep7 2.0 | 8.6 | 7.1% | 15 |
| abud.ThirdRobo 1.0 | 9.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 76.8 | 11 / 35 | 3582 |
| 2 | 1 | 63.6 | 78.4 | 4 / 35 | 4287 |
| 3 | 1 | 65.9 | 81.6 | 12 / 35 | 3369 |
| 4 | 3 | 56.5 | 61.3 | 3 / 35 | 3219 |
| 5 | 2 | 61.3 | 72.7 | 6 / 35 | 3805 |
| 6 | 1 | 57.9 | 62.5 | 6 / 35 | 3759 |
| 7 | 1 | 63.1 | 78.7 | 8 / 35 | 3623 |
| 8 | 1 | 61.0 | 71.4 | 8 / 35 | 3720 |
| 9 | 1 | 64.9 | 81.9 | 9 / 35 | 4245 |
| 10 | 1 | 62.5 | 72.4 | 9 / 35 | 4137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 105 | 42% |
| sul.Lunar 1.1 | 22 | 14% |
| jje.BagPuss 1.2 | 18 | 22% |
| wit.Deep7 2.0 | 12 | 58% |
| myl.nano.Graviton 1.10 | 10 | 40% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 67% |
| hvilela.HVilela 0.9 | 5 | 80% |
| fm.claire 1.7 | 3 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 275 of 350 rounds, at a mean tick of 1385. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 68 | 25% | 0 |
| jje.BagPuss 1.2 | 57 | 21% | 108 |
| sul.Lunar 1.1 | 45 | 16% | 74 |
| myl.nano.Graviton 1.10 | 35 | 13% | 51 |
| hvilela.HVilela 0.9 | 22 | 8% | 29 |
| pez.mini.ChironexFleckeri 0.5 | 15 | 5% | 31 |
| fm.claire 1.7 | 14 | 5% | 22 |
| wit.Deep7 2.0 | 13 | 5% | 27 |
| abud.ThirdRobo 1.0 | 5 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F46

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 72.9 | 52 / 350 | 3.44 | 13.2% | 28786 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.7% | 123 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 17.3% | 141 |
| hadur117.nano.SanaroHS 0.2 | 3.0 | 13.2% | 52 |
| mz.MicroSheep 1.0 | 4.5 | 10.6% | 8 |
| cx.Princess 1.0 | 4.8 | 10.4% | 25 |
| sadoner.killer 0.2 | 5.7 | 9.2% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.4% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.9% | 0 |
| kurios.DOSexe .9a | 8.9 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.9 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 74.3 | 7 / 35 | 3393 |
| 2 | 3 | 59.6 | 68.6 | 3 / 35 | 3252 |
| 3 | 3 | 58.4 | 70.2 | 4 / 35 | 2409 |
| 4 | 3 | 58.4 | 68.9 | 3 / 35 | 2704 |
| 5 | 3 | 61.5 | 79.0 | 6 / 35 | 2584 |
| 6 | 3 | 62.2 | 77.5 | 7 / 35 | 3186 |
| 7 | 3 | 60.2 | 70.5 | 4 / 35 | 3023 |
| 8 | 3 | 60.8 | 74.6 | 4 / 35 | 2970 |
| 9 | 3 | 60.0 | 72.7 | 7 / 35 | 2652 |
| 10 | 3 | 60.3 | 72.4 | 7 / 35 | 2613 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 74 | 45% |
| rsalesc.melee.Medina 0.4.5 | 46 | 20% |
| cx.Princess 1.0 | 11 | 45% |
| mz.MicroSheep 1.0 | 7 | 29% |
| sadoner.killer 0.2 | 2 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 300 of 350 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 114 | 38% | 150 |
| rsalesc.melee.Medina 0.4.5 | 97 | 32% | 105 |
| mz.MicroSheep 1.0 | 29 | 10% | 31 |
| sadoner.killer 0.2 | 20 | 7% | 21 |
| cx.Princess 1.0 | 18 | 6% | 21 |
| arthord.NanoSatanMelee Beta | 12 | 4% | 13 |
| jeremyreeder.collective.Prophet 5 | 6 | 2% | 6 |
| kurios.DOSexe .9a | 2 | 1% | 3 |
2 death(s) with no robot to name.

