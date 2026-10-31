# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 72.4 | 26 / 350 | 3.49 | 13.6% | 38116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.8% | 255 |
| hadur117.nano.SanaroLQ 0.2 | 2.2 | 13.6% | 26 |
| sgp.JollyNinja 3.53 | 3.5 | 11.9% | 37 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.1 | 11.5% | 6 |
| mz.MicroGodMelee 1 | 4.4 | 11.0% | 13 |
| lorneswork.Predator 1.0 | 5.9 | 9.9% | 11 |
| adt.Ar2 1.0 | 6.9 | 7.9% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.5% | 0 |
| skm.butterfly 1.0 | 8.9 | 4.8% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 79.4 | 3 / 35 | 4127 |
| 2 | 2 | 60.7 | 72.1 | 2 / 35 | 3573 |
| 3 | 2 | 63.9 | 81.0 | 1 / 35 | 4091 |
| 4 | 4 | 56.3 | 57.8 | 2 / 35 | 3756 |
| 5 | 2 | 60.0 | 70.2 | 2 / 35 | 3736 |
| 6 | 2 | 61.9 | 76.8 | 4 / 35 | 3724 |
| 7 | 2 | 60.8 | 71.7 | 3 / 35 | 3809 |
| 8 | 2 | 62.3 | 74.9 | 3 / 35 | 3991 |
| 9 | 2 | 59.5 | 68.6 | 2 / 35 | 3574 |
| 10 | 2 | 60.7 | 71.4 | 4 / 35 | 3735 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 156 | 6% |
| sgp.JollyNinja 3.53 | 14 | 50% |
| mz.MicroGodMelee 1 | 8 | 50% |
| lorneswork.Predator 1.0 | 6 | 33% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 67% |
| skm.butterfly 1.0 | 2 | 0% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 325 of 350 rounds, at a mean tick of 1153. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 184 | 57% | 189 |
| sgp.JollyNinja 3.53 | 37 | 11% | 45 |
| lorneswork.Predator 1.0 | 28 | 9% | 31 |
| simonton.nano.WeekendObsession_Melee 1.0 | 28 | 9% | 30 |
| mz.MicroGodMelee 1 | 26 | 8% | 32 |
| adt.Ar2 1.0 | 12 | 4% | 13 |
| kawigi.sbf.FloodSonnet 0.9 | 6 | 2% | 6 |
| skm.butterfly 1.0 | 3 | 1% | 3 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 68.7 | 69 / 350 | 3.81 | 14.4% | 43478 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.8 | 14.7% | 101 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.0 | 15.0% | 87 |
| hadur117.nano.SanaroLQ 0.2 | 2.2 | 14.4% | 69 |
| lrem.micro.SpikeSoldier 0.4 | 4.1 | 10.8% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.6% | 21 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.1% | 7 |
| Noran.BitchingElk 0.054 | 7.2 | 7.9% | 31 |
| sch.Simone 0.3d | 7.7 | 7.7% | 19 |
| stelo.PatternRobot 1.0 | 8.0 | 7.2% | 10 |
| fullsail.SweetTea 1.1 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.6 | 67.0 | 8 / 35 | 4164 |
| 2 | 3 | 59.8 | 62.9 | 7 / 35 | 4512 |
| 3 | 2 | 62.9 | 74.0 | 7 / 35 | 4392 |
| 4 | 3 | 61.1 | 66.7 | 6 / 35 | 4430 |
| 5 | 2 | 61.8 | 71.7 | 8 / 35 | 4043 |
| 6 | 2 | 61.9 | 71.1 | 6 / 35 | 4365 |
| 7 | 2 | 60.9 | 65.7 | 6 / 35 | 4635 |
| 8 | 1 | 61.7 | 70.8 | 8 / 35 | 4278 |
| 9 | 3 | 59.3 | 66.0 | 4 / 35 | 4035 |
| 10 | 1 | 62.9 | 71.4 | 9 / 35 | 4624 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 60 | 25% |
| pulsar.PulsarMax 0.8.9 | 56 | 63% |
| sch.Simone 0.3d | 14 | 57% |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 50% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 83% |
| stelo.PatternRobot 1.0 | 5 | 40% |
| Noran.BitchingElk 0.054 | 4 | 0% |
| fullsail.SweetTea 1.1 | 1 | 0% |

Hadur died in 282 of 350 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 84 | 30% | 104 |
| pulsar.PulsarMax 0.8.9 | 61 | 22% | 81 |
| lrem.micro.SpikeSoldier 0.4 | 33 | 12% | 36 |
| com.cohesiva.robocode.ManOwaR 1.0 | 30 | 11% | 35 |
| stelo.PatternRobot 1.0 | 21 | 7% | 24 |
| sch.Simone 0.3d | 18 | 6% | 30 |
| fnc.bandit.Bandit 5.2.0 | 14 | 5% | 16 |
| Noran.BitchingElk 0.054 | 12 | 4% | 13 |
| fullsail.SweetTea 1.1 | 8 | 3% | 10 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 78.2 | 57 / 350 | 2.97 | 15.0% | 43849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.9 | 15.3% | 104 |
| hadur117.nano.SanaroLQ 0.2 | 2.0 | 15.0% | 57 |
| kawigi.nano.Lib 1.0 | 2.5 | 14.5% | 88 |
| vuen.Cake 2.51 | 3.6 | 13.0% | 80 |
| urdos.URDOS 1.3 | 5.0 | 10.8% | 11 |
| adt.Ar1 2.1 | 6.2 | 7.7% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 7.6 | 6.7% | 2 |
| oa.weak.FlyMk1 0.1 | 7.9 | 6.6% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 5.6% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 75.6 | 1 / 35 | 4322 |
| 2 | 1 | 62.7 | 76.8 | 5 / 35 | 4698 |
| 3 | 2 | 63.3 | 80.0 | 9 / 35 | 3963 |
| 4 | 2 | 62.6 | 77.5 | 5 / 35 | 4513 |
| 5 | 2 | 62.8 | 77.1 | 7 / 35 | 4304 |
| 6 | 2 | 63.7 | 83.2 | 8 / 35 | 4185 |
| 7 | 1 | 63.6 | 79.0 | 9 / 35 | 4333 |
| 8 | 4 | 62.2 | 74.6 | 2 / 35 | 4513 |
| 9 | 1 | 63.1 | 78.1 | 6 / 35 | 4612 |
| 10 | 2 | 63.1 | 79.7 | 5 / 35 | 4406 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 65 | 38% |
| vuen.Cake 2.51 | 56 | 27% |
| kawigi.nano.Lib 1.0 | 45 | 2% |
| urdos.URDOS 1.3 | 15 | 67% |
| oa.weak.FlyMk1 0.1 | 5 | 60% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 50% |
| adt.Ar1 2.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 295 of 350 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 98 | 33% | 105 |
| radnor.DoctorBob 1.42 | 79 | 27% | 93 |
| vuen.Cake 2.51 | 57 | 19% | 73 |
| urdos.URDOS 1.3 | 36 | 12% | 46 |
| ghent.ArthurPanzergon 1.0.0 | 9 | 3% | 9 |
| adt.Ar1 2.1 | 8 | 3% | 11 |
| oa.weak.FlyMk1 0.1 | 4 | 1% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 72.9 | 9 / 350 | 3.44 | 14.2% | 44398 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.9% | 311 |
| apc.LeeroyJenkins2 1.0 | 2.5 | 14.1% | 26 |
| hadur117.nano.SanaroLQ 0.2 | 2.5 | 14.2% | 9 |
| TNT.TNT 0.99.1 | 4.0 | 10.3% | 1 |
| josago.Jorgito 0.16 | 5.2 | 9.0% | 2 |
| css.Delitioner 0.11 | 6.1 | 7.8% | 1 |
| tj.zombie1n 1.0.1 | 6.7 | 6.9% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.5% | 1 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.4% | 0 |
| spin.Bugstard 0.012b | 9.6 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 73.3 | 1 / 35 | 4330 |
| 2 | 2 | 61.7 | 70.2 | 1 / 35 | 4332 |
| 3 | 3 | 62.5 | 73.0 | 1 / 35 | 4085 |
| 4 | 2 | 64.1 | 75.9 | 2 / 35 | 4744 |
| 5 | 3 | 62.8 | 73.3 | 1 / 35 | 4400 |
| 6 | 3 | 60.4 | 66.7 | 0 / 35 | 4266 |
| 7 | 3 | 62.9 | 70.5 | 2 / 35 | 4582 |
| 8 | 2 | 63.2 | 74.0 | 1 / 35 | 4650 |
| 9 | 2 | 65.6 | 81.0 | 0 / 35 | 4910 |
| 10 | 2 | 61.5 | 71.1 | 0 / 35 | 4099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 145 | 3% |
| apc.LeeroyJenkins2 1.0 | 6 | 17% |
| josago.Jorgito 0.16 | 3 | 67% |
| rampancy.Durandal 2.1d | 1 | 0% |
| TNT.TNT 0.99.1 | 1 | 100% |

Hadur died in 341 of 350 rounds, at a mean tick of 1157. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 230 | 67% | 234 |
| apc.LeeroyJenkins2 1.0 | 52 | 15% | 54 |
| josago.Jorgito 0.16 | 26 | 8% | 28 |
| TNT.TNT 0.99.1 | 11 | 3% | 12 |
| css.Delitioner 0.11 | 11 | 3% | 11 |
| tj.zombie1n 1.0.1 | 8 | 2% | 8 |
| rampancy.Durandal 2.1d | 3 | 1% | 3 |

## Melee bench: F06

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 69.6 | 70 / 350 | 3.73 | 13.5% | 34002 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.2 | 15.6% | 90 |
| origin.SleepSiphon 1.7b | 2.1 | 14.5% | 100 |
| hadur117.nano.SanaroLQ 0.2 | 3.1 | 13.5% | 70 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.9 | 12.4% | 45 |
| mld.Wisdom 1.0 | 4.7 | 11.4% | 21 |
| gg.Wolverine 2.0 | 6.3 | 8.8% | 7 |
| spinnercat.Omen 1.0 | 7.0 | 7.9% | 5 |
| DBall.NUKE 0.1 | 8.2 | 6.6% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.3% | 10 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 72.1 | 6 / 35 | 3485 |
| 2 | 5 | 56.8 | 62.2 | 4 / 35 | 3001 |
| 3 | 3 | 58.6 | 66.7 | 7 / 35 | 3192 |
| 4 | 2 | 61.4 | 70.5 | 6 / 35 | 3673 |
| 5 | 4 | 58.2 | 63.2 | 8 / 35 | 3232 |
| 6 | 3 | 61.3 | 72.1 | 7 / 35 | 3510 |
| 7 | 4 | 59.0 | 66.0 | 6 / 35 | 3371 |
| 8 | 2 | 61.6 | 73.0 | 12 / 35 | 3098 |
| 9 | 3 | 61.2 | 73.3 | 7 / 35 | 3489 |
| 10 | 2 | 63.4 | 77.1 | 7 / 35 | 3951 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 50 | 38% |
| jekl.StoneGhost 0.7 | 44 | 48% |
| pe.minimelee.SandboxMiniMelee 1.1 | 21 | 62% |
| gg.Wolverine 2.0 | 7 | 100% |
| mld.Wisdom 1.0 | 7 | 14% |
| DBall.NUKE 0.1 | 5 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 75% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 282 of 350 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 84 | 30% | 97 |
| origin.SleepSiphon 1.7b | 64 | 23% | 88 |
| mld.Wisdom 1.0 | 50 | 18% | 51 |
| pe.minimelee.SandboxMiniMelee 1.1 | 49 | 17% | 61 |
| gg.Wolverine 2.0 | 11 | 4% | 18 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 3% | 12 |
| spinnercat.Omen 1.0 | 8 | 3% | 9 |
| DBall.NUKE 0.1 | 6 | 2% | 12 |
| sample.Fire 1.0 | 1 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.5 | 114 / 350 | 2.48 | 17.3% | 51761 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.7 | 17.5% | 88 |
| hadur117.nano.SanaroLQ 0.2 | 2.1 | 17.3% | 114 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.4% | 95 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 12.0% | 27 |
| franzor.Lizt 1.3.1 | 5.0 | 10.9% | 28 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.3% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.0% | 0 |
| sample.Target 1.0 | 9.3 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 67.3 | 79.4 | 12 / 35 | 5044 |
| 2 | 1 | 68.5 | 87.0 | 11 / 35 | 4931 |
| 3 | 3 | 67.7 | 81.0 | 11 / 35 | 5230 |
| 4 | 3 | 66.1 | 78.7 | 8 / 35 | 4599 |
| 5 | 2 | 68.6 | 85.4 | 14 / 35 | 4980 |
| 6 | 2 | 68.5 | 86.7 | 11 / 35 | 5207 |
| 7 | 2 | 68.1 | 83.2 | 12 / 35 | 5264 |
| 8 | 1 | 69.0 | 87.0 | 12 / 35 | 5560 |
| 9 | 1 | 70.3 | 87.3 | 16 / 35 | 6019 |
| 10 | 3 | 66.5 | 79.7 | 7 / 35 | 4927 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 115 | 69% |
| rsalesc.melee.Monk 0.3.6c | 54 | 6% |
| oog.melee.CapuletDroid 1.1 | 30 | 57% |
| franzor.Lizt 1.3.1 | 18 | 72% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 237 of 350 rounds, at a mean tick of 1374. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 101 | 43% | 184 |
| rsalesc.melee.Monk 0.3.6c | 95 | 40% | 109 |
| oog.melee.CapuletDroid 1.1 | 31 | 13% | 50 |
| franzor.Lizt 1.3.1 | 7 | 3% | 2 |
| exauge.GateKeeper 1.1.121g | 1 | 0% | 2 |
| skm.PateranBotlock2 1.0 | 1 | 0% | 2 |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 70.5 | 80 / 350 | 3.66 | 13.9% | 35409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tm.Yuugao 1.0 | 1.8 | 14.1% | 103 |
| hadur117.nano.SanaroLQ 0.2 | 1.9 | 13.9% | 80 |
| shrub.Vapour v159 | 2.9 | 13.1% | 81 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.8% | 29 |
| com.spp.robocode.MostlyHarmless 010 | 4.9 | 9.6% | 21 |
| m3thos.Eva00 1.1 | 5.7 | 9.3% | 16 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.4% | 13 |
| SHAM.WOW 1.4 | 8.5 | 7.3% | 5 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.9% | 1 |
| qualidafial.MajorDick 1.0.1 | 9.3 | 6.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 56.7 | 64.8 | 4 / 35 | 3061 |
| 2 | 2 | 61.2 | 74.9 | 6 / 35 | 3745 |
| 3 | 2 | 59.6 | 67.9 | 9 / 35 | 3570 |
| 4 | 1 | 63.3 | 80.0 | 9 / 35 | 3800 |
| 5 | 2 | 60.3 | 71.4 | 9 / 35 | 3670 |
| 6 | 2 | 60.0 | 70.5 | 9 / 35 | 3307 |
| 7 | 1 | 61.1 | 74.3 | 11 / 35 | 3448 |
| 8 | 3 | 57.6 | 65.4 | 6 / 35 | 3202 |
| 9 | 2 | 59.6 | 68.3 | 7 / 35 | 3590 |
| 10 | 2 | 60.1 | 67.3 | 10 / 35 | 4016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 47 | 38% |
| shrub.Vapour v159 | 41 | 37% |
| Krabb.sliNk.Garm 0.9u | 20 | 90% |
| m3thos.Eva00 1.1 | 14 | 50% |
| com.spp.robocode.MostlyHarmless 010 | 13 | 38% |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 75% |
| qualidafial.MajorDick 1.0.1 | 5 | 80% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |

Hadur died in 274 of 350 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 73 | 27% | 89 |
| tm.Yuugao 1.0 | 66 | 24% | 88 |
| Krabb.sliNk.Garm 0.9u | 38 | 14% | 43 |
| com.spp.robocode.MostlyHarmless 010 | 27 | 10% | 36 |
| m3thos.Eva00 1.1 | 21 | 8% | 33 |
| jwst.DAD.DarkAndDarker 1.1 | 21 | 8% | 25 |
| zyx.nano.BacillusComma 1.0 | 13 | 5% | 15 |
| qualidafial.MajorDick 1.0.1 | 10 | 4% | 12 |
| SHAM.WOW 1.4 | 4 | 1% | 8 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 61.8 | 29 / 350 | 4.44 | 12.0% | 30819 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.1% | 193 |
| kc.micro.Figment 1.0 | 2.0 | 15.5% | 74 |
| hadur117.nano.SanaroLQ 0.2 | 3.2 | 12.0% | 29 |
| yagami.Tidus 0.11 | 4.4 | 11.0% | 9 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.2% | 22 |
| mc2.enemy.Original 0.9 | 5.7 | 9.5% | 17 |
| dft.Calliope 5.6 | 6.9 | 7.8% | 6 |
| step.nanoPri 1.0 | 8.2 | 6.1% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.4 | 62.9 | 3 / 35 | 2907 |
| 2 | 3 | 56.9 | 64.1 | 2 / 35 | 2844 |
| 3 | 3 | 55.7 | 55.9 | 5 / 35 | 3276 |
| 4 | 3 | 58.7 | 65.7 | 1 / 35 | 3266 |
| 5 | 4 | 56.5 | 58.1 | 6 / 35 | 2875 |
| 6 | 3 | 56.6 | 62.2 | 1 / 35 | 3051 |
| 7 | 3 | 59.4 | 67.0 | 4 / 35 | 3409 |
| 8 | 3 | 57.4 | 61.9 | 0 / 35 | 3174 |
| 9 | 3 | 56.2 | 59.0 | 3 / 35 | 2884 |
| 10 | 3 | 57.3 | 61.3 | 4 / 35 | 3133 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 55 | 15% |
| kc.micro.Figment 1.0 | 30 | 30% |
| yagami.Tidus 0.11 | 9 | 56% |
| mc2.enemy.Original 0.9 | 6 | 17% |
| pedersen.Grishnakh 1.0 | 6 | 67% |
| dft.Calliope 5.6 | 1 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 321 of 350 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 117 | 36% | 126 |
| kc.micro.Figment 1.0 | 57 | 18% | 66 |
| yagami.Tidus 0.11 | 45 | 14% | 50 |
| mc2.enemy.Original 0.9 | 41 | 13% | 42 |
| pedersen.Grishnakh 1.0 | 19 | 6% | 23 |
| step.nanoPri 1.0 | 16 | 5% | 16 |
| dft.Calliope 5.6 | 14 | 4% | 14 |
| robar.nano.Assertive_Melee 0.2 | 7 | 2% | 8 |
| rdm.Dueler 0.4x | 5 | 2% | 5 |

## Melee bench: F10

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 78.6 | 96 / 350 | 2.93 | 15.3% | 41737 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| DTF.Kludgy 1.2b | 1.6 | 15.3% | 103 |
| hadur117.nano.SanaroLQ 0.2 | 1.6 | 15.3% | 96 |
| ne.Chimera 1.2 | 3.6 | 13.0% | 34 |
| ejb.Polaris 1.0.1 | 3.7 | 13.0% | 54 |
| vStar.RAFzilla 2.15 | 5.2 | 10.7% | 18 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.9% | 34 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.4 | 6.2% | 2 |
| sam.Samspin 1.0 | 8.1 | 6.0% | 2 |
| kurios.DOSexe .9b | 8.8 | 5.3% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.3% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 75.2 | 10 / 35 | 4216 |
| 2 | 1 | 65.6 | 83.2 | 11 / 35 | 4576 |
| 3 | 2 | 62.5 | 75.2 | 9 / 35 | 4160 |
| 4 | 2 | 64.6 | 81.3 | 8 / 35 | 4248 |
| 5 | 1 | 64.2 | 81.3 | 12 / 35 | 4057 |
| 6 | 3 | 62.6 | 75.6 | 7 / 35 | 4204 |
| 7 | 2 | 61.6 | 71.7 | 12 / 35 | 3772 |
| 8 | 1 | 64.5 | 83.5 | 8 / 35 | 4401 |
| 9 | 1 | 63.2 | 80.0 | 9 / 35 | 3956 |
| 10 | 1 | 64.0 | 78.7 | 10 / 35 | 4147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 59 | 36% |
| ejb.Polaris 1.0.1 | 54 | 63% |
| tvv.micro.Antares 1.1.1 | 30 | 47% |
| ne.Chimera 1.2 | 24 | 50% |
| vStar.RAFzilla 2.15 | 14 | 71% |
| donjezza.Muncho 1.0 | 4 | 25% |
| sam.Samspin 1.0 | 4 | 75% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 33% |

Hadur died in 254 of 350 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 86 | 34% | 110 |
| ne.Chimera 1.2 | 56 | 22% | 71 |
| ejb.Polaris 1.0.1 | 46 | 18% | 79 |
| tvv.micro.Antares 1.1.1 | 27 | 11% | 34 |
| vStar.RAFzilla 2.15 | 12 | 5% | 23 |
| donjezza.Muncho 1.0 | 10 | 4% | 11 |
| sam.Samspin 1.0 | 8 | 3% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 3% | 8 |
| kurios.DOSexe .9b | 2 | 1% | 3 |

## Melee bench: F11

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 67.0 | 56 / 350 | 3.97 | 13.1% | 32992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.1% | 140 |
| hadur117.nano.SanaroLQ 0.2 | 2.3 | 13.1% | 56 |
| cx.mini.Nimrod 0.55 | 2.7 | 12.7% | 49 |
| djc.DynaBot 0.1.1 | 4.1 | 11.0% | 29 |
| rdt199.Warlord 0.73 | 5.6 | 9.8% | 28 |
| uji.YellohFellah 1.0 | 6.0 | 9.1% | 26 |
| br2.MobyDickBot 1.6 | 6.3 | 9.0% | 24 |
| KiraNL.Chupacabra 0.4 | 8.1 | 7.2% | 1 |
| stelo.MirrorNano 1.3 | 9.4 | 5.4% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 67.9 | 7 / 35 | 3363 |
| 2 | 2 | 58.7 | 67.3 | 5 / 35 | 3389 |
| 3 | 3 | 56.4 | 62.9 | 3 / 35 | 2876 |
| 4 | 2 | 56.9 | 63.5 | 3 / 35 | 3248 |
| 5 | 2 | 61.6 | 74.6 | 9 / 35 | 3379 |
| 6 | 3 | 56.5 | 61.9 | 4 / 35 | 2858 |
| 7 | 2 | 58.6 | 66.7 | 4 / 35 | 3406 |
| 8 | 2 | 56.2 | 61.9 | 4 / 35 | 3107 |
| 9 | 2 | 62.3 | 73.3 | 10 / 35 | 3893 |
| 10 | 2 | 60.5 | 70.2 | 7 / 35 | 3473 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 58 | 52% |
| cx.mini.Nimrod 0.55 | 13 | 38% |
| djc.DynaBot 0.1.1 | 13 | 62% |
| uji.YellohFellah 1.0 | 11 | 0% |
| rdt199.Warlord 0.73 | 11 | 64% |
| br2.MobyDickBot 1.6 | 9 | 22% |
| KiraNL.Chupacabra 0.4 | 4 | 75% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 294 of 350 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 102 | 35% | 128 |
| cx.mini.Nimrod 0.55 | 58 | 20% | 65 |
| rdt199.Warlord 0.73 | 33 | 11% | 41 |
| djc.DynaBot 0.1.1 | 26 | 9% | 32 |
| uji.YellohFellah 1.0 | 21 | 7% | 23 |
| br2.MobyDickBot 1.6 | 20 | 7% | 24 |
| KiraNL.Chupacabra 0.4 | 17 | 6% | 20 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 3% | 10 |
| stelo.MirrorNano 1.3 | 7 | 2% | 7 |

## Melee bench: F12

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 69.7 | 61 / 350 | 3.72 | 13.4% | 30882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.8 | 14.9% | 103 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.2% | 85 |
| darkcanuck.Leon 1.01 | 2.9 | 13.7% | 71 |
| hadur117.nano.SanaroLQ 0.2 | 3.1 | 13.4% | 61 |
| brainfade.melee.Genghis 0.36 | 5.2 | 9.7% | 18 |
| jrm.Test0 1.0 | 6.3 | 8.0% | 1 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.4% | 0 |
| jp.Perpy 16.0 | 7.6 | 7.2% | 2 |
| jaybot.bots.Oddball 4.0 | 9.1 | 6.2% | 10 |
| stuff.Vlad 0.1 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 69.5 | 4 / 35 | 3156 |
| 2 | 2 | 61.6 | 76.2 | 6 / 35 | 3306 |
| 3 | 3 | 62.2 | 75.6 | 9 / 35 | 3196 |
| 4 | 2 | 61.0 | 72.7 | 8 / 35 | 3408 |
| 5 | 4 | 59.0 | 69.8 | 7 / 35 | 2807 |
| 6 | 4 | 56.7 | 60.3 | 3 / 35 | 3217 |
| 7 | 4 | 59.9 | 69.8 | 7 / 35 | 3021 |
| 8 | 3 | 58.6 | 68.9 | 3 / 35 | 3029 |
| 9 | 2 | 60.6 | 73.3 | 9 / 35 | 2802 |
| 10 | 4 | 56.2 | 61.3 | 5 / 35 | 2940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 55 | 56% |
| nat.PallasHawk 1.0 | 53 | 15% |
| darkcanuck.Leon 1.01 | 46 | 24% |
| brainfade.melee.Genghis 0.36 | 10 | 80% |
| jaybot.bots.Oddball 4.0 | 6 | 17% |
| jp.Perpy 16.0 | 3 | 67% |

Hadur died in 291 of 350 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 84 | 29% | 97 |
| bts.wiki.RipCurl 0.9b | 65 | 22% | 89 |
| darkcanuck.Leon 1.01 | 60 | 21% | 75 |
| brainfade.melee.Genghis 0.36 | 22 | 8% | 24 |
| jrm.Test0 1.0 | 17 | 6% | 17 |
| cs.sheldor.Talon 1.1 | 14 | 5% | 14 |
| jaybot.bots.Oddball 4.0 | 13 | 4% | 14 |
| jp.Perpy 16.0 | 12 | 4% | 14 |
| stuff.Vlad 0.1 | 4 | 1% | 4 |

## Melee bench: F13

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 71.8 | 32 / 350 | 3.53 | 13.1% | 32723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.2 | 17.6% | 178 |
| ags.Glacier 0.2.11 | 1.8 | 16.6% | 87 |
| hadur117.nano.SanaroLQ 0.2 | 3.0 | 13.1% | 32 |
| gh.micro.Gruweltje 0.7 | 4.4 | 12.0% | 19 |
| shinh.Entangled 0.3 | 4.6 | 11.9% | 31 |
| apc.Colossus2 0.17 | 6.1 | 8.5% | 1 |
| stelo.Wang 1.0 | 7.0 | 7.0% | 1 |
| ayk.WallHugger 1.0 | 8.1 | 5.3% | 1 |
| maribo.FollowFire 1 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 71.1 | 3 / 35 | 3543 |
| 2 | 3 | 61.7 | 77.5 | 3 / 35 | 3466 |
| 3 | 3 | 61.8 | 77.1 | 4 / 35 | 3165 |
| 4 | 3 | 60.3 | 72.1 | 4 / 35 | 3265 |
| 5 | 3 | 58.3 | 66.7 | 4 / 35 | 3131 |
| 6 | 3 | 59.1 | 69.5 | 2 / 35 | 3100 |
| 7 | 3 | 60.3 | 71.7 | 5 / 35 | 3219 |
| 8 | 3 | 59.5 | 69.8 | 1 / 35 | 3272 |
| 9 | 3 | 60.2 | 70.5 | 4 / 35 | 3409 |
| 10 | 3 | 59.7 | 72.4 | 2 / 35 | 3153 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 80 | 25% |
| ags.Glacier 0.2.11 | 47 | 13% |
| shinh.Entangled 0.3 | 21 | 24% |
| gh.micro.Gruweltje 0.7 | 6 | 17% |
| stelo.Wang 1.0 | 1 | 0% |
| apc.Colossus2 0.17 | 1 | 0% |

Hadur died in 318 of 350 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 102 | 32% | 108 |
| mn.Combat 3.25.0 | 99 | 31% | 118 |
| shinh.Entangled 0.3 | 41 | 13% | 46 |
| gh.micro.Gruweltje 0.7 | 41 | 13% | 42 |
| stelo.Wang 1.0 | 12 | 4% | 12 |
| apc.Colossus2 0.17 | 9 | 3% | 10 |
| ayk.WallHugger 1.0 | 6 | 2% | 6 |
| maribo.FollowFire 1 | 6 | 2% | 6 |
| sample.Tracker 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 77.1 | 96 / 350 | 3.06 | 14.8% | 36448 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.5% | 135 |
| hadur117.nano.SanaroLQ 0.2 | 2.0 | 14.8% | 96 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.4% | 61 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 10.6% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 5.5 | 10.0% | 16 |
| co.edu.usb.rc.LidisTron 1.0 | 5.6 | 10.1% | 11 |
| sanyi.mikrobi.Roberto 1.0 | 6.3 | 9.2% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.6 | 8.1% | 15 |
| pa.Improved 1.0 | 9.0 | 5.3% | 2 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 71.4 | 9 / 35 | 3605 |
| 2 | 2 | 63.3 | 77.5 | 13 / 35 | 3551 |
| 3 | 2 | 64.5 | 80.3 | 12 / 35 | 4033 |
| 4 | 2 | 63.1 | 77.1 | 10 / 35 | 3643 |
| 5 | 2 | 63.8 | 80.3 | 9 / 35 | 3783 |
| 6 | 2 | 61.9 | 75.2 | 10 / 35 | 3615 |
| 7 | 2 | 61.2 | 74.6 | 6 / 35 | 3276 |
| 8 | 2 | 65.1 | 80.6 | 14 / 35 | 4004 |
| 9 | 2 | 62.6 | 79.0 | 5 / 35 | 3500 |
| 10 | 2 | 61.8 | 75.2 | 8 / 35 | 3438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 99 | 46% |
| catcat20.shape.Theta 0.018 | 46 | 61% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 82% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 36% |
| Lo_Ian.Gandalf_V4 4.0 | 9 | 11% |
| sanyi.mikrobi.Roberto 1.0 | 7 | 29% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |

Hadur died in 256 of 350 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 123 | 48% | 172 |
| catcat20.shape.Theta 0.018 | 37 | 14% | 61 |
| Lo_Ian.Gandalf_V4 4.0 | 25 | 10% | 26 |
| sanyi.mikrobi.Roberto 1.0 | 21 | 8% | 27 |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 7% | 22 |
| dmh.robocode.robot.RedDwarf 0.4 | 17 | 7% | 21 |
| co.edu.usb.rc.LidisTron 1.0 | 12 | 5% | 11 |
| pa.Improved 1.0 | 2 | 1% | 8 |
| sample.TrackFire 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 64.6 | 38 / 350 | 4.19 | 12.9% | 38084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.2 | 15.3% | 94 |
| emp.Yngwie 1.11 | 2.7 | 13.3% | 99 |
| hadur117.nano.SanaroLQ 0.2 | 3.1 | 12.9% | 38 |
| mld.DustBunny 3.8 | 3.2 | 12.9% | 33 |
| cb.nano.Insomnia 1.0 | 5.2 | 11.2% | 23 |
| kawigi.robot.Girl 1.2 | 5.6 | 10.5% | 54 |
| lambdaxy.TBot 0.1 | 7.5 | 7.1% | 1 |
| Grystrion.TrackerWO 1.0 | 7.6 | 7.0% | 2 |
| divineomega.TrialBot 0.003 | 9.1 | 5.4% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.7 | 60.0 | 2 / 35 | 3869 |
| 2 | 3 | 57.9 | 62.9 | 4 / 35 | 3648 |
| 3 | 2 | 59.8 | 68.9 | 2 / 35 | 4012 |
| 4 | 3 | 60.2 | 67.3 | 6 / 35 | 3945 |
| 5 | 4 | 59.0 | 65.1 | 5 / 35 | 3797 |
| 6 | 4 | 59.9 | 68.9 | 3 / 35 | 3634 |
| 7 | 2 | 58.6 | 65.1 | 3 / 35 | 3896 |
| 8 | 2 | 57.9 | 62.5 | 4 / 35 | 3699 |
| 9 | 4 | 58.4 | 62.5 | 5 / 35 | 3757 |
| 10 | 3 | 58.2 | 62.5 | 4 / 35 | 3827 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 43 | 35% |
| kawigi.micro.Shiz 1.1 | 37 | 14% |
| cb.nano.Insomnia 1.0 | 18 | 61% |
| mld.DustBunny 3.8 | 14 | 14% |
| kawigi.robot.Girl 1.2 | 13 | 23% |
| divineomega.TrialBot 0.003 | 3 | 67% |
| Grystrion.TrackerWO 1.0 | 1 | 0% |

Hadur died in 312 of 350 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 81 | 26% | 91 |
| emp.Yngwie 1.11 | 60 | 19% | 80 |
| mld.DustBunny 3.8 | 59 | 19% | 62 |
| cb.nano.Insomnia 1.0 | 41 | 13% | 38 |
| kawigi.robot.Girl 1.2 | 35 | 11% | 37 |
| lambdaxy.TBot 0.1 | 14 | 4% | 14 |
| Grystrion.TrackerWO 1.0 | 12 | 4% | 14 |
| divineomega.TrialBot 0.003 | 9 | 3% | 13 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 0% | 1 |

## Melee bench: F16

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 66.2 | 39 / 350 | 4.04 | 13.5% | 41043 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.0% | 183 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.0 | 15.4% | 27 |
| hadur117.nano.SanaroLQ 0.2 | 3.1 | 13.5% | 39 |
| techdude.forest.FlamingForest 1.1 | 4.6 | 10.5% | 61 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.7% | 7 |
| tvv.nano.Polaris 1.2 | 5.4 | 9.5% | 16 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.9% | 6 |
| divineomega.DivineBot 1.9.4.5 | 8.2 | 5.6% | 10 |
| repositorio.NanoStep 1.0 | 8.9 | 5.3% | 1 |
| asd.Cthulhu 1.3 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 73.0 | 5 / 35 | 4312 |
| 2 | 3 | 60.7 | 66.0 | 5 / 35 | 4333 |
| 3 | 3 | 59.9 | 66.3 | 3 / 35 | 3831 |
| 4 | 3 | 61.8 | 68.9 | 6 / 35 | 4266 |
| 5 | 3 | 60.8 | 66.0 | 4 / 35 | 4273 |
| 6 | 3 | 60.3 | 67.6 | 4 / 35 | 3827 |
| 7 | 3 | 57.3 | 59.0 | 2 / 35 | 3704 |
| 8 | 4 | 58.3 | 60.3 | 3 / 35 | 3995 |
| 9 | 3 | 62.1 | 69.2 | 5 / 35 | 4492 |
| 10 | 3 | 59.5 | 65.7 | 2 / 35 | 4010 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 77 | 6% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 68% |
| techdude.forest.FlamingForest 1.1 | 13 | 23% |
| tvv.nano.Polaris 1.2 | 7 | 86% |
| divineomega.DivineBot 1.9.4.5 | 6 | 67% |
| bvh.fnr.Fenrir 0.36l | 5 | 60% |
| stelo.IntrinsicVolatility 1.4 | 5 | 60% |

Hadur died in 311 of 350 rounds, at a mean tick of 1170. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 143 | 46% | 152 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 65 | 21% | 73 |
| bvh.fnr.Fenrir 0.36l | 30 | 10% | 33 |
| techdude.forest.FlamingForest 1.1 | 26 | 8% | 30 |
| stelo.IntrinsicVolatility 1.4 | 14 | 5% | 20 |
| divineomega.DivineBot 1.9.4.5 | 12 | 4% | 19 |
| repositorio.NanoStep 1.0 | 8 | 3% | 8 |
| tvv.nano.Polaris 1.2 | 7 | 2% | 8 |
| asd.Cthulhu 1.3 | 6 | 2% | 7 |

## Melee bench: F17

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 70.2 | 78 / 350 | 3.69 | 14.2% | 40015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroLQ 0.2 | 2.1 | 14.2% | 78 |
| cx.BlestPain 1.41 | 2.5 | 13.6% | 70 |
| et.Predator 1.8 | 2.6 | 13.7% | 65 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.5% | 77 |
| nic.Nicator 2.4 | 5.4 | 11.2% | 33 |
| ahf.NanoAndrew .4 | 5.6 | 11.0% | 26 |
| maribo.melee.BMV 0.1 | 7.0 | 9.3% | 2 |
| tex.Longbot 0.4 | 8.3 | 5.5% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.2% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.9 | 69.5 | 7 / 35 | 4024 |
| 2 | 4 | 58.4 | 62.2 | 5 / 35 | 3653 |
| 3 | 1 | 63.7 | 76.2 | 10 / 35 | 3949 |
| 4 | 1 | 63.9 | 75.2 | 11 / 35 | 4403 |
| 5 | 3 | 59.8 | 65.1 | 6 / 35 | 3979 |
| 6 | 1 | 64.5 | 77.8 | 8 / 35 | 4382 |
| 7 | 1 | 63.2 | 74.0 | 10 / 35 | 4092 |
| 8 | 2 | 62.3 | 69.5 | 11 / 35 | 4032 |
| 9 | 3 | 61.2 | 70.2 | 7 / 35 | 3805 |
| 10 | 4 | 57.9 | 61.9 | 3 / 35 | 3696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cx.BlestPain 1.41 | 45 | 71% |
| et.Predator 1.8 | 40 | 23% |
| oog.melee.Mercutio 1.0 | 37 | 51% |
| nic.Nicator 2.4 | 21 | 52% |
| ahf.NanoAndrew .4 | 12 | 25% |
| maribo.melee.BMV 0.1 | 5 | 80% |

Hadur died in 272 of 350 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 70 | 26% | 81 |
| oog.melee.Mercutio 1.0 | 44 | 16% | 62 |
| ahf.NanoAndrew .4 | 44 | 16% | 47 |
| nic.Nicator 2.4 | 43 | 16% | 52 |
| cx.BlestPain 1.41 | 39 | 14% | 72 |
| maribo.melee.BMV 0.1 | 21 | 8% | 24 |
| tex.Longbot 0.4 | 9 | 3% | 9 |
| goblin.Bender 2.4 | 1 | 0% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 0% | 0 |

## Melee bench: F18

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 69.2 | 85 / 350 | 3.77 | 13.9% | 35781 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.5 | 13.8% | 85 |
| hadur117.nano.SanaroLQ 0.2 | 1.8 | 13.9% | 85 |
| agd.Mooserwirt2 2.7 | 3.4 | 12.2% | 65 |
| uji.DBH 1.1 | 4.3 | 11.5% | 32 |
| spinnercat.Robovirus 2.718 | 4.9 | 10.4% | 19 |
| ratosh.Nobo 0.21 | 5.5 | 10.4% | 13 |
| sigterm.Sigterm 1.0 | 6.7 | 9.1% | 29 |
| kawigi.mini.Fhqwhgads 1.1 | 8.1 | 7.3% | 5 |
| stelo.WangRobot 1.0 | 9.2 | 6.1% | 13 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.6 | 5.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.8 | 72.1 | 8 / 35 | 3304 |
| 2 | 1 | 60.7 | 70.5 | 11 / 35 | 3517 |
| 3 | 2 | 59.9 | 69.8 | 8 / 35 | 3453 |
| 4 | 2 | 60.8 | 68.9 | 9 / 35 | 3834 |
| 5 | 2 | 59.0 | 66.3 | 8 / 35 | 3507 |
| 6 | 1 | 63.1 | 75.9 | 13 / 35 | 3909 |
| 7 | 3 | 59.4 | 67.3 | 6 / 35 | 3672 |
| 8 | 3 | 55.9 | 59.4 | 4 / 35 | 3458 |
| 9 | 1 | 60.9 | 72.4 | 10 / 35 | 3540 |
| 10 | 2 | 60.6 | 69.8 | 8 / 35 | 3587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 50 | 48% |
| agd.Mooserwirt2 2.7 | 26 | 31% |
| spinnercat.Robovirus 2.718 | 21 | 76% |
| uji.DBH 1.1 | 20 | 55% |
| sigterm.Sigterm 1.0 | 19 | 79% |
| ratosh.Nobo 0.21 | 16 | 56% |
| stelo.WangRobot 1.0 | 4 | 25% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 50% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 0% |

Hadur died in 267 of 350 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 73 | 27% | 102 |
| agd.Mooserwirt2 2.7 | 48 | 18% | 58 |
| uji.DBH 1.1 | 37 | 14% | 44 |
| ratosh.Nobo 0.21 | 36 | 13% | 44 |
| spinnercat.Robovirus 2.718 | 18 | 7% | 29 |
| sigterm.Sigterm 1.0 | 17 | 6% | 27 |
| stelo.WangRobot 1.0 | 15 | 6% | 18 |
| kawigi.mini.Fhqwhgads 1.1 | 14 | 5% | 18 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9 | 3% | 9 |

## Melee bench: F19

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 81.6 | 98 / 350 | 2.66 | 16.2% | 42454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.6 | 16.6% | 106 |
| hadur117.nano.SanaroLQ 0.2 | 1.9 | 16.2% | 98 |
| mld.Infinity 2.2 | 2.5 | 15.6% | 105 |
| krillr.mini.JointStrike 2.0.0 | 4.1 | 11.8% | 15 |
| erdnis.Rover 0.3 | 5.1 | 10.1% | 10 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.3% | 5 |
| mbh.Mbh 0.1 | 7.2 | 7.3% | 1 |
| pac.ABC 2.1 | 7.6 | 7.0% | 9 |
| pbg.R2D2 1.0 | 8.8 | 5.9% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 75.2 | 12 / 35 | 4152 |
| 2 | 3 | 65.5 | 81.3 | 10 / 35 | 3995 |
| 3 | 1 | 66.6 | 83.8 | 9 / 35 | 4435 |
| 4 | 2 | 64.4 | 79.7 | 8 / 35 | 3883 |
| 5 | 2 | 65.8 | 84.8 | 9 / 35 | 4089 |
| 6 | 1 | 66.6 | 84.8 | 9 / 35 | 4374 |
| 7 | 2 | 67.6 | 86.0 | 11 / 35 | 4891 |
| 8 | 3 | 64.9 | 80.0 | 12 / 35 | 3955 |
| 9 | 2 | 64.9 | 82.5 | 8 / 35 | 3966 |
| 10 | 1 | 65.5 | 77.5 | 10 / 35 | 4714 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 90 | 56% |
| davidalves.net.DuelistMiniMelee 1.2 | 84 | 24% |
| krillr.mini.JointStrike 2.0.0 | 20 | 75% |
| pac.ABC 2.1 | 9 | 56% |
| patson.PatsonTestBot 1.0 | 4 | 75% |
| erdnis.Rover 0.3 | 4 | 50% |
| pbg.R2D2 1.0 | 3 | 67% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 252 of 350 rounds, at a mean tick of 1070. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 124 | 49% | 183 |
| mld.Infinity 2.2 | 53 | 21% | 26 |
| krillr.mini.JointStrike 2.0.0 | 31 | 12% | 47 |
| erdnis.Rover 0.3 | 19 | 8% | 31 |
| patson.PatsonTestBot 1.0 | 10 | 4% | 21 |
| pac.ABC 2.1 | 7 | 3% | 13 |
| pbg.R2D2 1.0 | 6 | 2% | 13 |
| mbh.Mbh 0.1 | 2 | 1% | 10 |

## Melee bench: F20

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 72.7 | 75 / 350 | 3.46 | 14.3% | 37340 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.1 | 17.5% | 150 |
| hadur117.nano.SanaroLQ 0.2 | 2.0 | 14.3% | 75 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.9% | 20 |
| fwb.Nine 1.0.1 | 3.8 | 11.4% | 46 |
| catcat20.Rabbit 0.001 | 4.9 | 10.4% | 33 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 8.7% | 7 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 8.6% | 11 |
| bayen.nut.Squirrel 1.615 | 7.6 | 7.8% | 6 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 81.3 | 9 / 35 | 3798 |
| 2 | 1 | 64.4 | 80.6 | 11 / 35 | 4134 |
| 3 | 2 | 59.2 | 67.9 | 4 / 35 | 3455 |
| 4 | 2 | 59.3 | 66.3 | 8 / 35 | 3327 |
| 5 | 2 | 62.0 | 71.4 | 10 / 35 | 3904 |
| 6 | 2 | 60.7 | 71.4 | 3 / 35 | 3840 |
| 7 | 2 | 63.8 | 79.7 | 8 / 35 | 3966 |
| 8 | 2 | 60.9 | 71.1 | 8 / 35 | 3720 |
| 9 | 3 | 57.5 | 63.5 | 4 / 35 | 3399 |
| 10 | 2 | 62.5 | 73.3 | 10 / 35 | 3797 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 79 | 37% |
| fwb.Nine 1.0.1 | 27 | 52% |
| catcat20.Rabbit 0.001 | 22 | 55% |
| nz.jdc.nano.GridFu 1.0 | 12 | 42% |
| bayen.nut.Squirrel 1.615 | 7 | 86% |
| djdjdj.NanoSkunk10 1.0 | 6 | 67% |
| m3thos.mini.Eva01 0.5.5 | 6 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 275 of 350 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 108 | 39% | 125 |
| nz.jdc.nano.GridFu 1.0 | 43 | 16% | 57 |
| fwb.Nine 1.0.1 | 43 | 16% | 46 |
| catcat20.Rabbit 0.001 | 35 | 13% | 48 |
| m3thos.mini.Eva01 0.5.5 | 16 | 6% | 22 |
| djdjdj.NanoSkunk10 1.0 | 15 | 5% | 24 |
| bayen.nut.Squirrel 1.615 | 11 | 4% | 17 |
| ntc.ControlledChaos 1.1.4 | 3 | 1% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% | 6 |

## Melee bench: F21

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.4 | 135 / 350 | 2.40 | 17.6% | 49810 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroLQ 0.2 | 1.4 | 17.6% | 135 |
| eem.EvBot v4.6.16 | 1.6 | 17.1% | 145 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.2% | 24 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 22 |
| eld.Hmm 1.0 | 5.3 | 8.6% | 21 |
| oa.weak.BotherBot 0.1 | 5.7 | 8.6% | 3 |
| fire219.CatBot 1.0 | 7.6 | 6.3% | 0 |
| el.JumpShoot 0.2 | 7.7 | 6.4% | 3 |
| PSW.Relentless 0.1 | 8.9 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.3 | 12 / 35 | 5194 |
| 2 | 2 | 65.9 | 81.9 | 14 / 35 | 4487 |
| 3 | 2 | 65.2 | 79.0 | 11 / 35 | 4600 |
| 4 | 2 | 67.4 | 80.6 | 15 / 35 | 5219 |
| 5 | 1 | 69.2 | 90.2 | 18 / 35 | 5232 |
| 6 | 1 | 67.3 | 81.9 | 14 / 35 | 5338 |
| 7 | 2 | 66.4 | 83.8 | 12 / 35 | 4765 |
| 8 | 1 | 67.0 | 86.0 | 11 / 35 | 4991 |
| 9 | 1 | 67.9 | 87.3 | 14 / 35 | 5019 |
| 10 | 1 | 67.5 | 86.0 | 14 / 35 | 4965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 142 | 50% |
| dummy.mini.Scimitar 1.01 | 49 | 80% |
| cf.RiO.RiOx 4.2.1 | 17 | 53% |
| eld.Hmm 1.0 | 16 | 69% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 2 | 0% |

Hadur died in 217 of 350 rounds, at a mean tick of 1242. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 106 | 49% | 153 |
| dummy.mini.Scimitar 1.01 | 42 | 19% | 89 |
| cf.RiO.RiOx 4.2.1 | 37 | 17% | 56 |
| eld.Hmm 1.0 | 10 | 5% | 25 |
| el.JumpShoot 0.2 | 8 | 4% | 8 |
| oa.weak.BotherBot 0.1 | 5 | 2% | 11 |
| PSW.Relentless 0.1 | 3 | 1% | 3 |
| fire219.CatBot 1.0 | 3 | 1% | 3 |
| arthord.MannyPacquiao Beta | 1 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F23

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 81.8 | 102 / 350 | 2.63 | 16.2% | 41595 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.1 | 18.5% | 147 |
| hadur117.nano.SanaroLQ 0.2 | 2.0 | 16.2% | 102 |
| cre.Karolos 0.32 | 2.9 | 14.5% | 53 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.1% | 20 |
| stelo.RamTrackSurfer 1.2 | 5.6 | 9.4% | 15 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.6 | 9.0% | 3 |
| sample.Walls 1.0 | 6.6 | 8.7% | 8 |
| cw.megas.Blade 0.8 | 7.2 | 8.3% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.9% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 83.2 | 9 / 35 | 4772 |
| 2 | 2 | 67.1 | 85.4 | 10 / 35 | 4385 |
| 3 | 2 | 66.1 | 80.3 | 12 / 35 | 4111 |
| 4 | 2 | 65.4 | 79.4 | 8 / 35 | 3938 |
| 5 | 3 | 66.1 | 78.1 | 13 / 35 | 4026 |
| 6 | 2 | 65.8 | 81.0 | 9 / 35 | 4173 |
| 7 | 1 | 67.4 | 87.9 | 11 / 35 | 4402 |
| 8 | 2 | 66.4 | 83.2 | 8 / 35 | 4133 |
| 9 | 2 | 65.1 | 78.7 | 10 / 35 | 3690 |
| 10 | 2 | 65.9 | 81.3 | 12 / 35 | 3965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 114 | 38% |
| cre.Karolos 0.32 | 40 | 45% |
| stelo.AreaTargetingBot 1.1 | 27 | 52% |
| sample.Walls 1.0 | 18 | 83% |
| stelo.RamTrackSurfer 1.2 | 11 | 55% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 60% |
| cw.megas.Blade 0.8 | 2 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 0% |

Hadur died in 249 of 350 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 111 | 45% | 166 |
| cre.Karolos 0.32 | 59 | 24% | 77 |
| stelo.AreaTargetingBot 1.1 | 36 | 14% | 46 |
| stelo.RamTrackSurfer 1.2 | 15 | 6% | 26 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 12 | 5% | 16 |
| sample.Walls 1.0 | 10 | 4% | 10 |
| cw.megas.Blade 0.8 | 6 | 2% | 9 |

## Melee bench: F24

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.6 | 58.0 | 42 / 350 | 4.78 | 11.2% | 28190 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.8 | 14.1% | 77 |
| davidalves.Phoenix 0.54 | 2.2 | 13.6% | 80 |
| florent.XSeries.X2 0.12 | 2.6 | 13.5% | 62 |
| pedersen.Ugluk 1.1.1 | 3.9 | 12.2% | 56 |
| hadur117.nano.SanaroLQ 0.2 | 4.8 | 11.2% | 42 |
| oog.melee.Corsair 1.0 | 6.3 | 9.8% | 9 |
| stelo.SoJNanoMelee 1.1 | 6.4 | 9.2% | 20 |
| lunchie.Lunchbox 0.93 | 8.1 | 6.7% | 3 |
| as.FrankTheTank 1.3 | 9.2 | 5.1% | 1 |
| evd.X1 0.01 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 51.8 | 51.1 | 4 / 35 | 2685 |
| 2 | 6 | 52.5 | 54.3 | 2 / 35 | 2809 |
| 3 | 3 | 58.2 | 66.0 | 5 / 35 | 3138 |
| 4 | 3 | 57.0 | 62.9 | 5 / 35 | 3099 |
| 5 | 5 | 56.0 | 61.6 | 4 / 35 | 2791 |
| 6 | 5 | 53.4 | 56.8 | 5 / 35 | 2313 |
| 7 | 4 | 57.8 | 62.2 | 7 / 35 | 3243 |
| 8 | 6 | 52.2 | 53.3 | 3 / 35 | 2611 |
| 9 | 5 | 55.6 | 58.1 | 6 / 35 | 2914 |
| 10 | 6 | 51.9 | 53.3 | 1 / 35 | 2587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 25 | 40% |
| davidalves.Phoenix 0.54 | 20 | 45% |
| florent.XSeries.X2 0.12 | 15 | 80% |
| pedersen.Ugluk 1.1.1 | 13 | 69% |
| stelo.SoJNanoMelee 1.1 | 5 | 0% |
| lunchie.Lunchbox 0.93 | 1 | 0% |
| as.FrankTheTank 1.3 | 1 | 100% |
| oog.melee.Corsair 1.0 | 1 | 100% |

Hadur died in 308 of 350 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 76 | 25% | 88 |
| davidalves.Phoenix 0.54 | 58 | 19% | 68 |
| pedersen.Ugluk 1.1.1 | 51 | 17% | 56 |
| florent.XSeries.X2 0.12 | 46 | 15% | 56 |
| oog.melee.Corsair 1.0 | 27 | 9% | 30 |
| stelo.SoJNanoMelee 1.1 | 22 | 7% | 23 |
| lunchie.Lunchbox 0.93 | 14 | 5% | 14 |
| evd.X1 0.01 | 8 | 3% | 8 |
| as.FrankTheTank 1.3 | 6 | 2% | 7 |

## Melee bench: F25

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 66.3 | 60 / 350 | 4.03 | 12.9% | 29661 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.7 | 14.3% | 67 |
| voidious.micro.BlitzBat 1.05 | 2.1 | 14.1% | 76 |
| hadur117.nano.SanaroLQ 0.2 | 2.5 | 12.9% | 60 |
| jdw.Hurricane 1.4 | 4.4 | 11.6% | 48 |
| gre.svman4.Morfeas 1.4.1 | 4.6 | 11.0% | 44 |
| ds.Oo 2.2 | 6.0 | 9.3% | 24 |
| gjr.Cephalosporin 0.1 | 7.1 | 8.4% | 20 |
| adt.Ar2 1.1 | 8.2 | 7.1% | 4 |
| awesomeness.Elite 1.0 | 8.4 | 7.1% | 9 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 57.0 | 63.5 | 6 / 35 | 2813 |
| 2 | 3 | 60.0 | 67.9 | 7 / 35 | 3322 |
| 3 | 3 | 57.5 | 65.4 | 6 / 35 | 2696 |
| 4 | 2 | 57.9 | 62.5 | 9 / 35 | 3121 |
| 5 | 3 | 59.8 | 70.8 | 4 / 35 | 3007 |
| 6 | 1 | 62.3 | 76.8 | 9 / 35 | 3087 |
| 7 | 2 | 58.8 | 67.9 | 6 / 35 | 2970 |
| 8 | 4 | 56.4 | 59.0 | 5 / 35 | 2826 |
| 9 | 3 | 55.4 | 62.2 | 2 / 35 | 2683 |
| 10 | 2 | 58.8 | 66.7 | 6 / 35 | 3136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 38 | 32% |
| voidious.mini.BrokenSword 2.0.3 | 34 | 41% |
| gre.svman4.Morfeas 1.4.1 | 24 | 46% |
| jdw.Hurricane 1.4 | 23 | 83% |
| gjr.Cephalosporin 0.1 | 7 | 14% |
| ds.Oo 2.2 | 6 | 33% |
| awesomeness.Elite 1.0 | 2 | 50% |

Hadur died in 291 of 350 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 85 | 29% | 99 |
| voidious.mini.BrokenSword 2.0.3 | 58 | 20% | 74 |
| jdw.Hurricane 1.4 | 37 | 13% | 50 |
| gre.svman4.Morfeas 1.4.1 | 35 | 12% | 44 |
| ds.Oo 2.2 | 25 | 9% | 29 |
| gjr.Cephalosporin 0.1 | 18 | 6% | 21 |
| adt.Ar2 1.1 | 15 | 5% | 15 |
| awesomeness.Elite 1.0 | 13 | 4% | 14 |
| amk.ChumbaMini 0.2 | 4 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 71.0 | 48 / 350 | 3.61 | 13.7% | 39730 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 15.9% | 122 |
| hadur117.nano.SanaroLQ 0.2 | 2.3 | 13.7% | 48 |
| lrem.Spectre 0.4.4 | 3.8 | 12.8% | 61 |
| shu.nitro.LENIN .T34 | 3.8 | 12.5% | 58 |
| js.PinBall 1.6 | 4.6 | 11.7% | 20 |
| gh.mini.GrubbmOne 1.0 | 5.7 | 10.9% | 24 |
| jaybot.adv.bots.JayBot 2.0 | 6.9 | 9.0% | 9 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.8% | 7 |
| sample.SpinBot 1.0 | 8.9 | 5.0% | 2 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 75.6 | 6 / 35 | 4281 |
| 2 | 2 | 60.9 | 70.8 | 3 / 35 | 3933 |
| 3 | 2 | 61.7 | 70.8 | 5 / 35 | 4235 |
| 4 | 2 | 62.0 | 74.6 | 5 / 35 | 3978 |
| 5 | 3 | 59.8 | 66.7 | 5 / 35 | 3789 |
| 6 | 2 | 61.9 | 72.4 | 6 / 35 | 4264 |
| 7 | 2 | 61.5 | 72.7 | 3 / 35 | 3987 |
| 8 | 2 | 61.7 | 73.0 | 8 / 35 | 3715 |
| 9 | 3 | 59.2 | 68.3 | 3 / 35 | 3596 |
| 10 | 3 | 59.3 | 65.7 | 4 / 35 | 3952 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 50 | 26% |
| lrem.Spectre 0.4.4 | 45 | 33% |
| shu.nitro.LENIN .T34 | 23 | 22% |
| js.PinBall 1.6 | 14 | 50% |
| gh.mini.GrubbmOne 1.0 | 13 | 23% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 60% |
| jaybot.adv.bots.JayBot 2.0 | 4 | 50% |

Hadur died in 303 of 350 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 82 | 27% | 92 |
| lrem.Spectre 0.4.4 | 51 | 17% | 61 |
| gh.mini.GrubbmOne 1.0 | 50 | 17% | 53 |
| js.PinBall 1.6 | 42 | 14% | 52 |
| shu.nitro.LENIN .T34 | 41 | 14% | 47 |
| jaybot.adv.bots.JayBot 2.0 | 23 | 8% | 27 |
| fullsail.LaxativeTeaTwo 1.0 | 10 | 3% | 14 |
| sample.SpinBot 1.0 | 4 | 1% | 4 |

## Melee bench: F27

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 69.5 | 70 / 350 | 3.74 | 13.6% | 34383 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 2.1 | 14.4% | 129 |
| hadur117.nano.SanaroLQ 0.2 | 2.4 | 13.6% | 70 |
| wee.Gem 1.8.4 | 2.8 | 12.6% | 72 |
| sheldor.melee.nano.TestMelee 0.1 | 3.3 | 12.3% | 36 |
| EH.Eagle 1.0.6 | 5.0 | 10.8% | 26 |
| techdude.kombat.FlamingKombat 1.5 | 6.6 | 8.8% | 10 |
| joe.ADinosaur 1.0 | 7.1 | 8.3% | 5 |
| throxbot.ThroxBot 0.1 | 7.7 | 7.9% | 1 |
| caimano.Furia_Ceca 0.22 | 8.4 | 7.0% | 4 |
| cs.Grudge 1.0 | 9.6 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 69.5 | 5 / 35 | 3170 |
| 2 | 1 | 60.4 | 75.9 | 6 / 35 | 3298 |
| 3 | 5 | 55.8 | 50.2 | 2 / 35 | 4211 |
| 4 | 1 | 60.9 | 74.9 | 9 / 35 | 3047 |
| 5 | 2 | 60.7 | 74.6 | 8 / 35 | 3037 |
| 6 | 5 | 54.3 | 46.0 | 2 / 35 | 4347 |
| 7 | 1 | 62.9 | 80.6 | 12 / 35 | 3093 |
| 8 | 3 | 60.8 | 74.3 | 10 / 35 | 3089 |
| 9 | 2 | 62.1 | 75.6 | 7 / 35 | 3533 |
| 10 | 1 | 61.4 | 73.7 | 9 / 35 | 3558 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 49 | 51% |
| wee.Gem 1.8.4 | 34 | 32% |
| EH.Eagle 1.0.6 | 21 | 67% |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 44% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 56% |
| throxbot.ThroxBot 0.1 | 5 | 80% |
| joe.ADinosaur 1.0 | 3 | 67% |
| caimano.Furia_Ceca 0.22 | 3 | 33% |

Hadur died in 286 of 350 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 84 | 29% | 109 |
| wee.Gem 1.8.4 | 53 | 19% | 65 |
| sheldor.melee.nano.TestMelee 0.1 | 45 | 16% | 54 |
| joe.ADinosaur 1.0 | 25 | 9% | 27 |
| EH.Eagle 1.0.6 | 21 | 7% | 35 |
| techdude.kombat.FlamingKombat 1.5 | 17 | 6% | 17 |
| caimano.Furia_Ceca 0.22 | 16 | 6% | 17 |
| throxbot.ThroxBot 0.1 | 15 | 5% | 20 |
| cs.Grudge 1.0 | 7 | 2% | 6 |
3 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 80.0 | 108 / 350 | 2.80 | 15.7% | 35911 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.4 | 16.2% | 114 |
| hadur117.nano.SanaroLQ 0.2 | 1.6 | 15.7% | 108 |
| uji.Antique 1.0 | 3.2 | 12.8% | 68 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.6% | 12 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.6% | 22 |
| amk.ChumbaWumba 0.3 | 6.4 | 8.2% | 5 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.9% | 13 |
| matt.advanced.Katana 1.0 | 8.0 | 6.7% | 6 |
| stelo.PianistNano 1.2 | 9.1 | 5.7% | 1 |
| stelo.Lifestealer 1.0 | 9.5 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 84.4 | 12 / 35 | 3758 |
| 2 | 2 | 62.1 | 77.8 | 8 / 35 | 3365 |
| 3 | 1 | 65.5 | 83.5 | 13 / 35 | 3878 |
| 4 | 2 | 61.3 | 74.0 | 9 / 35 | 3267 |
| 5 | 2 | 63.3 | 78.1 | 13 / 35 | 3373 |
| 6 | 2 | 63.6 | 78.4 | 11 / 35 | 3657 |
| 7 | 1 | 63.5 | 79.0 | 11 / 35 | 3830 |
| 8 | 2 | 64.3 | 80.0 | 11 / 35 | 3807 |
| 9 | 2 | 63.7 | 80.0 | 10 / 35 | 3533 |
| 10 | 1 | 64.6 | 84.8 | 10 / 35 | 3443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 119 | 48% |
| uji.Antique 1.0 | 45 | 56% |
| qohnil.blot.BlotBot 3.61 | 15 | 40% |
| pfvicm.Sobieski 7.2.3b | 13 | 69% |
| amk.ChumbaWumba 0.3 | 7 | 86% |
| ahr.ice.Ice 1.0.2 | 5 | 40% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 243 of 350 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 90 | 37% | 122 |
| uji.Antique 1.0 | 51 | 21% | 84 |
| pfvicm.Sobieski 7.2.3b | 30 | 12% | 39 |
| ahr.ice.Ice 1.0.2 | 22 | 9% | 25 |
| qohnil.blot.BlotBot 3.61 | 20 | 8% | 33 |
| amk.ChumbaWumba 0.3 | 16 | 7% | 21 |
| matt.advanced.Katana 1.0 | 6 | 2% | 11 |
| stelo.Lifestealer 1.0 | 5 | 2% | 6 |
| stelo.PianistNano 1.2 | 3 | 1% | 8 |

## Melee bench: F29

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 65.0 | 47 / 350 | 4.15 | 13.0% | 33895 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.1 | 16.7% | 118 |
| zyx.mega.YersiniaPestis 3.1 | 1.9 | 15.3% | 107 |
| hadur117.nano.SanaroLQ 0.2 | 3.4 | 13.0% | 47 |
| myl.micro.Troodon 1.10 | 3.7 | 12.7% | 26 |
| jok.PheonixM 0.1.2 | 4.9 | 11.5% | 25 |
| DBall.Anarchy 0.1 | 6.2 | 8.2% | 20 |
| ph.melee.ArcherME 0.3 | 6.9 | 8.0% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 7.9 | 6.1% | 0 |
| ap.Frederick 1.1 | 9.3 | 4.4% | 4 |
| jangs.ns51 1.0 | 9.7 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.9 | 68.3 | 6 / 35 | 3274 |
| 2 | 3 | 60.0 | 66.7 | 5 / 35 | 3130 |
| 3 | 3 | 59.3 | 63.2 | 6 / 35 | 3421 |
| 4 | 3 | 61.2 | 70.8 | 6 / 35 | 3402 |
| 5 | 3 | 57.7 | 59.7 | 4 / 35 | 3417 |
| 6 | 5 | 57.2 | 58.4 | 3 / 35 | 3177 |
| 7 | 3 | 61.2 | 70.2 | 4 / 35 | 3455 |
| 8 | 4 | 60.8 | 67.6 | 2 / 35 | 3844 |
| 9 | 4 | 56.7 | 56.8 | 6 / 35 | 3216 |
| 10 | 3 | 60.3 | 67.9 | 5 / 35 | 3559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 54 | 24% |
| zyx.mega.YersiniaPestis 3.1 | 29 | 48% |
| myl.micro.Troodon 1.10 | 21 | 57% |
| jok.PheonixM 0.1.2 | 10 | 30% |
| DBall.Anarchy 0.1 | 8 | 50% |
| ap.Frederick 1.1 | 2 | 50% |

Hadur died in 303 of 350 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 114 | 38% | 130 |
| zyx.mega.YersiniaPestis 3.1 | 65 | 21% | 78 |
| jok.PheonixM 0.1.2 | 45 | 15% | 49 |
| myl.micro.Troodon 1.10 | 40 | 13% | 49 |
| DBall.Anarchy 0.1 | 14 | 5% | 18 |
| ph.melee.ArcherME 0.3 | 11 | 4% | 12 |
| fullsail.TimbotNoPrediction 1.0 | 8 | 3% | 8 |
| jangs.ns51 1.0 | 5 | 2% | 5 |
| ap.Frederick 1.1 | 1 | 0% | 0 |

## Melee bench: F30

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.0 | 60.0 | 33 / 350 | 4.60 | 11.5% | 29938 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.0 | 14.3% | 86 |
| oog.melee.Capulet 1.2 | 2.2 | 14.0% | 65 |
| darkcanuck.B26354 1.06 | 2.6 | 13.5% | 87 |
| stelo.PastFuture 2.3.2 | 3.3 | 12.9% | 52 |
| hadur117.nano.SanaroLQ 0.2 | 4.9 | 11.5% | 33 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.8% | 12 |
| tripphippy.Alice 1.1 | 7.6 | 7.4% | 6 |
| ntc.Opposite 1.5 | 8.0 | 7.8% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.1 | 7.4% | 9 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.9 | 61.0 | 3 / 35 | 2912 |
| 2 | 5 | 54.0 | 55.9 | 3 / 35 | 2837 |
| 3 | 5 | 56.9 | 61.3 | 2 / 35 | 3151 |
| 4 | 5 | 56.5 | 62.5 | 4 / 35 | 2879 |
| 5 | 5 | 56.1 | 59.7 | 5 / 35 | 2942 |
| 6 | 5 | 56.2 | 61.9 | 2 / 35 | 2987 |
| 7 | 5 | 55.4 | 58.1 | 3 / 35 | 3072 |
| 8 | 5 | 55.7 | 59.7 | 3 / 35 | 2884 |
| 9 | 5 | 54.8 | 54.3 | 4 / 35 | 3152 |
| 10 | 4 | 58.0 | 65.7 | 4 / 35 | 3122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 32 | 31% |
| darkcanuck.B26354 1.06 | 28 | 21% |
| oog.melee.Capulet 1.2 | 16 | 31% |
| stelo.PastFuture 2.3.2 | 9 | 56% |
| tripphippy.Alice 1.1 | 6 | 83% |
| intruder.PrairieWolf 2.61 | 4 | 25% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 50% |

Hadur died in 317 of 350 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 67 | 21% | 70 |
| catcat20.Matcha 0.006 | 65 | 21% | 75 |
| oog.melee.Capulet 1.2 | 53 | 17% | 59 |
| darkcanuck.B26354 1.06 | 52 | 16% | 58 |
| intruder.PrairieWolf 2.61 | 24 | 8% | 24 |
| ntc.Opposite 1.5 | 22 | 7% | 22 |
| tripphippy.Alice 1.1 | 19 | 6% | 27 |
| fowl3628800.LightningBolt 2.6.0 | 12 | 4% | 12 |
| GarmBox.Anger 1.0 | 3 | 1% | 3 |

## Melee bench: F31

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.3 | 56.5 | 11 / 350 | 4.91 | 10.8% | 28556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.4% | 192 |
| gh.mini.Griezel 0.2 | 2.0 | 14.2% | 79 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 11.9% | 22 |
| d414.nano.Quantum 1.0.0 | 4.1 | 11.5% | 28 |
| hadur117.nano.SanaroLQ 0.2 | 4.7 | 10.8% | 11 |
| gh.nano.Grofvuil 0.2 | 5.7 | 9.5% | 12 |
| fm.mammillarias 1.3 | 7.5 | 6.8% | 1 |
| timmit.nano.TimDog 0.33 | 7.6 | 7.1% | 5 |
| tlp.ThreeLeggedPig 1 | 9.4 | 4.8% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.5 | 51.7 | 2 / 35 | 2984 |
| 2 | 6 | 54.3 | 55.2 | 1 / 35 | 2956 |
| 3 | 5 | 54.6 | 57.5 | 3 / 35 | 2694 |
| 4 | 4 | 54.8 | 58.7 | 0 / 35 | 2838 |
| 5 | 4 | 54.5 | 56.2 | 1 / 35 | 2878 |
| 6 | 5 | 50.8 | 49.8 | 1 / 35 | 2447 |
| 7 | 4 | 56.3 | 60.6 | 2 / 35 | 2900 |
| 8 | 5 | 56.6 | 61.3 | 0 / 35 | 3000 |
| 9 | 4 | 55.4 | 59.4 | 0 / 35 | 2977 |
| 10 | 5 | 53.3 | 54.6 | 1 / 35 | 2882 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 33 | 21% |
| gh.mini.Griezel 0.2 | 29 | 7% |
| d414.nano.Quantum 1.0.0 | 7 | 14% |
| spinnercat.micro.Tyger 0.1 | 4 | 0% |
| timmit.nano.TimDog 0.33 | 2 | 50% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |

Hadur died in 339 of 350 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 92 | 27% | 94 |
| abc.Shadow 3.84i | 80 | 24% | 86 |
| spinnercat.micro.Tyger 0.1 | 55 | 16% | 55 |
| d414.nano.Quantum 1.0.0 | 50 | 15% | 51 |
| gh.nano.Grofvuil 0.2 | 25 | 7% | 25 |
| fm.mammillarias 1.3 | 18 | 5% | 18 |
| timmit.nano.TimDog 0.33 | 10 | 3% | 12 |
| Gecko.ultimateGeckoBot 1.0 | 7 | 2% | 7 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 78.3 | 111 / 350 | 2.96 | 15.3% | 37625 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroLQ 0.2 | 1.4 | 15.3% | 111 |
| kawigi.sbf.FloodHT 0.9.2 | 1.6 | 15.4% | 114 |
| apc.botM 3.0 | 3.2 | 12.0% | 42 |
| vjik.UnViolation 1.1 | 4.5 | 10.6% | 34 |
| lxx.ConceptA 0.8 | 4.7 | 10.7% | 9 |
| bayen.UbaMicro 1.4 | 5.7 | 9.4% | 10 |
| panzer.Panzer 0.2 | 7.5 | 7.7% | 4 |
| yk.JahMicro 1.0 | 8.0 | 6.8% | 11 |
| donjezza.Jezza 1.0 | 9.1 | 6.0% | 15 |
| conscience.Electron 1.3g | 9.3 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 73.0 | 11 / 35 | 3371 |
| 2 | 1 | 63.8 | 81.6 | 9 / 35 | 4188 |
| 3 | 1 | 62.8 | 81.0 | 7 / 35 | 3660 |
| 4 | 2 | 61.8 | 75.6 | 8 / 35 | 3847 |
| 5 | 1 | 63.4 | 78.7 | 16 / 35 | 3596 |
| 6 | 2 | 60.9 | 73.0 | 7 / 35 | 3521 |
| 7 | 1 | 64.2 | 82.9 | 11 / 35 | 3879 |
| 8 | 2 | 62.9 | 77.1 | 14 / 35 | 3564 |
| 9 | 1 | 63.0 | 78.4 | 12 / 35 | 3839 |
| 10 | 1 | 64.7 | 81.3 | 16 / 35 | 4160 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 88 | 38% |
| apc.botM 3.0 | 38 | 71% |
| lxx.ConceptA 0.8 | 26 | 81% |
| vjik.UnViolation 1.1 | 23 | 43% |
| donjezza.Jezza 1.0 | 11 | 36% |
| bayen.UbaMicro 1.4 | 9 | 56% |
| yk.JahMicro 1.0 | 8 | 75% |
| panzer.Panzer 0.2 | 4 | 75% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 242 of 350 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 91 | 38% | 129 |
| lxx.ConceptA 0.8 | 47 | 19% | 55 |
| vjik.UnViolation 1.1 | 24 | 10% | 37 |
| apc.botM 3.0 | 23 | 10% | 50 |
| bayen.UbaMicro 1.4 | 20 | 8% | 31 |
| panzer.Panzer 0.2 | 14 | 6% | 15 |
| donjezza.Jezza 1.0 | 9 | 4% | 15 |
| conscience.Electron 1.3g | 7 | 3% | 9 |
| yk.JahMicro 1.0 | 7 | 3% | 9 |

## Melee bench: F33

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 70.1 | 66 / 350 | 3.69 | 14.1% | 37052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.7% | 126 |
| hadur117.nano.SanaroLQ 0.2 | 2.4 | 14.1% | 66 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.5% | 51 |
| gre.svman4.Leonidas 1.3.2 | 4.4 | 11.2% | 43 |
| labg.Cataclysm 2.05 | 4.5 | 11.4% | 48 |
| baal.nano.N 1.42 | 6.4 | 8.5% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.3% | 11 |
| zyx.micro.Ant 1.1 | 8.2 | 5.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.4 | 4.7% | 4 |
| sanja.First 0.1 | 9.4 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 72.4 | 4 / 35 | 3634 |
| 2 | 2 | 61.3 | 68.6 | 4 / 35 | 4157 |
| 3 | 2 | 63.5 | 74.0 | 10 / 35 | 3966 |
| 4 | 2 | 59.6 | 67.0 | 4 / 35 | 3340 |
| 5 | 3 | 59.9 | 66.0 | 5 / 35 | 3515 |
| 6 | 3 | 61.6 | 69.8 | 9 / 35 | 3558 |
| 7 | 2 | 64.2 | 77.8 | 8 / 35 | 4140 |
| 8 | 3 | 59.7 | 65.4 | 6 / 35 | 3508 |
| 9 | 2 | 61.9 | 72.1 | 8 / 35 | 3585 |
| 10 | 3 | 60.5 | 67.6 | 8 / 35 | 3649 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 63 | 32% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 50% |
| gre.svman4.Leonidas 1.3.2 | 21 | 57% |
| labg.Cataclysm 2.05 | 17 | 29% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 56% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 0% |
| baal.nano.N 1.42 | 3 | 100% |
| sanja.First 0.1 | 2 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 285 of 350 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 111 | 39% | 135 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 52 | 18% | 70 |
| gre.svman4.Leonidas 1.3.2 | 37 | 13% | 43 |
| kinsen.melee.Angsaichmophobia 1.8c | 32 | 11% | 35 |
| labg.Cataclysm 2.05 | 28 | 10% | 32 |
| baal.nano.N 1.42 | 11 | 4% | 17 |
| zyx.micro.Ant 1.1 | 8 | 3% | 10 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 5 | 2% | 2 |
| sanja.First 0.1 | 1 | 0% | 4 |

## Melee bench: F34

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 72.8 | 64 / 350 | 3.45 | 14.5% | 40894 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.3 | 17.5% | 127 |
| kid.Gladiator .7.2 | 1.7 | 17.4% | 118 |
| hadur117.nano.SanaroLQ 0.2 | 3.0 | 14.5% | 64 |
| tcf.Reach 3 | 4.5 | 11.4% | 12 |
| jcs.Seth 1.8 | 4.6 | 11.1% | 23 |
| cli.Dancer 1.1 | 5.9 | 9.4% | 4 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 2 |
| amk.Punbot.Punbot 0.01 | 8.1 | 5.0% | 1 |
| sample.VelociRobot 1.0 | 8.9 | 4.0% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 77.5 | 10 / 35 | 4242 |
| 2 | 3 | 62.6 | 73.0 | 6 / 35 | 3962 |
| 3 | 3 | 63.9 | 75.2 | 7 / 35 | 4187 |
| 4 | 3 | 62.3 | 70.5 | 9 / 35 | 3781 |
| 5 | 3 | 62.6 | 72.1 | 7 / 35 | 3861 |
| 6 | 3 | 64.5 | 76.8 | 7 / 35 | 4376 |
| 7 | 3 | 61.7 | 66.0 | 4 / 35 | 4165 |
| 8 | 3 | 62.5 | 70.8 | 3 / 35 | 4088 |
| 9 | 3 | 64.9 | 77.8 | 8 / 35 | 4280 |
| 10 | 3 | 61.3 | 68.3 | 3 / 35 | 3952 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 78 | 60% |
| kid.Gladiator .7.2 | 47 | 6% |
| jcs.Seth 1.8 | 17 | 53% |
| tcf.Reach 3 | 7 | 14% |
| cli.Dancer 1.1 | 5 | 60% |
| ratosh.Wesco 1.4 | 1 | 0% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 286 of 350 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 111 | 39% | 114 |
| stelo.Spread 0.9 | 95 | 33% | 136 |
| jcs.Seth 1.8 | 27 | 9% | 40 |
| tcf.Reach 3 | 26 | 9% | 29 |
| ratosh.Wesco 1.4 | 15 | 5% | 15 |
| cli.Dancer 1.1 | 11 | 4% | 14 |
| amk.Punbot.Punbot 0.01 | 1 | 0% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 68.3 | 9 / 350 | 3.85 | 12.4% | 28213 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.7% | 286 |
| gh.mini.Gruwel 0.9 | 2.6 | 13.3% | 28 |
| rz.HawkOnFire 0.1 | 3.7 | 12.3% | 4 |
| hadur117.nano.SanaroLQ 0.2 | 3.7 | 12.4% | 9 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 12.2% | 22 |
| myl.nano.KomoriNinja 1.1 | 6.6 | 7.0% | 1 |
| wit.Chuliath 1.0 | 6.8 | 6.7% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.3 | 5.7% | 0 |
| dans.Cinnamon 1.2 | 9.1 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.3 | 59.4 | 0 / 35 | 2632 |
| 2 | 4 | 58.6 | 68.9 | 1 / 35 | 2718 |
| 3 | 3 | 60.5 | 72.7 | 2 / 35 | 3145 |
| 4 | 4 | 57.5 | 65.7 | 0 / 35 | 2774 |
| 5 | 5 | 57.8 | 65.4 | 1 / 35 | 2689 |
| 6 | 2 | 58.6 | 69.5 | 2 / 35 | 2551 |
| 7 | 3 | 57.8 | 68.3 | 0 / 35 | 2729 |
| 8 | 4 | 60.3 | 71.4 | 1 / 35 | 3198 |
| 9 | 3 | 59.7 | 71.1 | 1 / 35 | 2996 |
| 10 | 4 | 59.5 | 70.5 | 1 / 35 | 2781 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 86 | 2% |
| gh.mini.Gruwel 0.9 | 19 | 21% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 13% |
| rz.HawkOnFire 0.1 | 3 | 67% |

Hadur died in 341 of 350 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 152 | 45% | 151 |
| gh.mini.Gruwel 0.9 | 59 | 17% | 64 |
| dmh.robocode.robot.BlackDeath 9.2 | 55 | 16% | 56 |
| rz.HawkOnFire 0.1 | 46 | 13% | 48 |
| myl.nano.KomoriNinja 1.1 | 10 | 3% | 10 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8 | 2% | 8 |
| wit.Chuliath 1.0 | 7 | 2% | 9 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 70.3 | 97 / 350 | 3.68 | 14.4% | 37519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroLQ 0.2 | 1.2 | 14.4% | 97 |
| bzdp.Pansy 2.1 | 2.1 | 13.2% | 61 |
| alpha.RainingFire 1.0 | 3.1 | 12.4% | 52 |
| mz.Cork 0.1 | 4.5 | 11.2% | 38 |
| bvh.micro.Freya 0.3 | 4.6 | 11.1% | 36 |
| m3thos.Eva02 0.7.1 | 6.1 | 9.6% | 29 |
| bvh.mini.Fenrir 0.39 | 6.4 | 9.7% | 12 |
| dl.BetterWalls 1.0 | 8.4 | 7.1% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.6 | 6.7% | 3 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.7% | 18 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.9 | 67.9 | 8 / 35 | 3674 |
| 2 | 2 | 61.6 | 69.2 | 9 / 35 | 3958 |
| 3 | 1 | 60.1 | 68.6 | 10 / 35 | 3617 |
| 4 | 1 | 60.5 | 68.3 | 8 / 35 | 3957 |
| 5 | 1 | 61.9 | 74.3 | 11 / 35 | 3562 |
| 6 | 1 | 62.3 | 74.0 | 10 / 35 | 3741 |
| 7 | 2 | 58.8 | 65.1 | 8 / 35 | 3678 |
| 8 | 1 | 60.6 | 70.5 | 11 / 35 | 3554 |
| 9 | 1 | 61.8 | 71.1 | 10 / 35 | 3978 |
| 10 | 1 | 62.4 | 73.7 | 12 / 35 | 3800 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 46 | 52% |
| bvh.micro.Freya 0.3 | 34 | 68% |
| alpha.RainingFire 1.0 | 22 | 59% |
| mz.Cork 0.1 | 22 | 68% |
| bvh.mini.Fenrir 0.39 | 14 | 71% |
| m3thos.Eva02 0.7.1 | 12 | 33% |
| dl.BetterWalls 1.0 | 6 | 67% |
| sample.MyFirstRobot 1.0 | 4 | 25% |
| squidM.TentalceMeleeNano 1.1 | 4 | 75% |

Hadur died in 253 of 350 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 54 | 21% | 78 |
| alpha.RainingFire 1.0 | 47 | 19% | 59 |
| bvh.mini.Fenrir 0.39 | 37 | 15% | 41 |
| bvh.micro.Freya 0.3 | 36 | 14% | 54 |
| m3thos.Eva02 0.7.1 | 24 | 9% | 33 |
| mz.Cork 0.1 | 23 | 9% | 39 |
| dl.BetterWalls 1.0 | 13 | 5% | 20 |
| squidM.TentalceMeleeNano 1.1 | 12 | 5% | 16 |
| sample.MyFirstRobot 1.0 | 7 | 3% | 10 |

## Melee bench: F37

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 80.4 | 136 / 350 | 2.76 | 16.1% | 45796 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroLQ 0.2 | 1.0 | 16.1% | 136 |
| germ.TheMind .2 | 2.5 | 11.4% | 47 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.8% | 33 |
| EBBU.Sim2 1.02 | 4.8 | 10.1% | 20 |
| agrach.Dalek 1.0 | 6.0 | 9.4% | 31 |
| lmk.ACPFinal 0.1 | 6.2 | 9.0% | 15 |
| stelo.UntouchableNano 1.3 | 6.2 | 9.1% | 26 |
| mb.Beast 0.1 | 7.3 | 8.6% | 25 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 8.0% | 1 |
| skm.Ryubot 1.0 | 9.2 | 7.6% | 16 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 79.0 | 11 / 35 | 4525 |
| 2 | 1 | 63.7 | 81.6 | 14 / 35 | 4492 |
| 3 | 1 | 65.7 | 88.3 | 19 / 35 | 4438 |
| 4 | 1 | 61.9 | 75.6 | 10 / 35 | 4650 |
| 5 | 1 | 63.4 | 81.0 | 13 / 35 | 4515 |
| 6 | 1 | 63.6 | 79.4 | 13 / 35 | 4734 |
| 7 | 1 | 61.4 | 73.7 | 13 / 35 | 4206 |
| 8 | 1 | 66.8 | 89.8 | 17 / 35 | 5163 |
| 9 | 1 | 61.8 | 74.6 | 12 / 35 | 4669 |
| 10 | 1 | 63.4 | 81.3 | 14 / 35 | 4404 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 42 | 48% |
| com.syncleus.robocode.Dreadnaught 0.1 | 28 | 57% |
| agrach.Dalek 1.0 | 28 | 57% |
| mb.Beast 0.1 | 26 | 69% |
| EBBU.Sim2 1.02 | 25 | 60% |
| lmk.ACPFinal 0.1 | 25 | 80% |
| stelo.UntouchableNano 1.3 | 21 | 81% |
| skm.Ryubot 1.0 | 18 | 61% |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 75% |

Hadur died in 217 of 350 rounds, at a mean tick of 596. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 46 | 21% | 63 |
| com.syncleus.robocode.Dreadnaught 0.1 | 37 | 17% | 60 |
| agrach.Dalek 1.0 | 26 | 12% | 50 |
| mb.Beast 0.1 | 26 | 12% | 45 |
| EBBU.Sim2 1.02 | 23 | 11% | 38 |
| stelo.UntouchableNano 1.3 | 17 | 8% | 30 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 7% | 18 |
| skm.Ryubot 1.0 | 14 | 6% | 21 |
| lmk.ACPFinal 0.1 | 13 | 6% | 23 |

## Melee bench: F38

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 66.5 | 47 / 350 | 4.01 | 12.8% | 33035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.4% | 158 |
| bvh.mini.Freya 0.55 | 2.8 | 12.9% | 33 |
| hadur117.nano.SanaroLQ 0.2 | 3.3 | 12.8% | 47 |
| cs.Wren 1.0 | 4.7 | 11.3% | 20 |
| bts.mega.Gnarly 1.4 | 4.7 | 11.6% | 51 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.8 | 11.5% | 25 |
| kdf.KoulDestroyer 1.0 | 6.8 | 9.5% | 14 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.7% | 1 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.2% | 1 |
| bzdp.BoxCar 2.0 | 9.4 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 56.5 | 61.3 | 3 / 35 | 3079 |
| 2 | 3 | 58.3 | 66.0 | 7 / 35 | 2721 |
| 3 | 6 | 55.3 | 56.5 | 3 / 35 | 3321 |
| 4 | 2 | 58.7 | 67.6 | 4 / 35 | 3097 |
| 5 | 3 | 60.6 | 69.2 | 6 / 35 | 3777 |
| 6 | 4 | 57.5 | 65.1 | 4 / 35 | 2823 |
| 7 | 2 | 61.3 | 73.0 | 6 / 35 | 3693 |
| 8 | 2 | 59.3 | 68.9 | 6 / 35 | 3241 |
| 9 | 3 | 58.5 | 63.8 | 3 / 35 | 3549 |
| 10 | 2 | 61.6 | 73.7 | 5 / 35 | 3734 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 62 | 39% |
| bts.mega.Gnarly 1.4 | 24 | 29% |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 7% |
| cs.Wren 1.0 | 10 | 60% |
| bvh.mini.Freya 0.55 | 9 | 44% |
| kdf.KoulDestroyer 1.0 | 6 | 83% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 0% |

Hadur died in 303 of 350 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 84 | 28% | 107 |
| bts.mega.Gnarly 1.4 | 51 | 17% | 60 |
| bvh.mini.Freya 0.55 | 45 | 15% | 48 |
| cs.Wren 1.0 | 40 | 13% | 47 |
| davidalves.net.DuelistNanoMelee 1.01 | 34 | 11% | 37 |
| kdf.KoulDestroyer 1.0 | 32 | 11% | 34 |
| kawigi.spare.SpareParts 0.7.6nosnd | 9 | 3% | 9 |
| bzdp.BoxCar 2.0 | 4 | 1% | 4 |
| matt.UnderDark3 2.4.34 | 4 | 1% | 4 |

## Melee bench: F39

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.0 | 63.5 | 38 / 350 | 4.29 | 12.3% | 33830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.0 | 15.8% | 88 |
| az.Ololobot 0.2.4 | 2.1 | 14.1% | 119 |
| hadur117.nano.SanaroLQ 0.2 | 3.3 | 12.3% | 38 |
| catcat20.Lambda 0.024 | 3.8 | 11.5% | 51 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.7% | 24 |
| winamp32.micro.MicroMacro 1.0 | 6.6 | 8.7% | 14 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 8.4% | 9 |
| gimp.GimpBot 0.1 | 7.3 | 8.3% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.1 | 6.1% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 69.2 | 5 / 35 | 3798 |
| 2 | 3 | 57.2 | 67.3 | 2 / 35 | 3210 |
| 3 | 3 | 59.0 | 67.3 | 7 / 35 | 3394 |
| 4 | 3 | 56.8 | 59.7 | 4 / 35 | 3858 |
| 5 | 3 | 56.8 | 64.1 | 4 / 35 | 3246 |
| 6 | 4 | 55.8 | 62.9 | 1 / 35 | 3345 |
| 7 | 2 | 57.9 | 67.3 | 2 / 35 | 3504 |
| 8 | 4 | 57.0 | 63.5 | 4 / 35 | 3233 |
| 9 | 3 | 56.7 | 59.7 | 6 / 35 | 3407 |
| 10 | 5 | 52.6 | 53.7 | 3 / 35 | 2835 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 36 | 28% |
| az.Ololobot 0.2.4 | 35 | 26% |
| catcat20.Lambda 0.024 | 18 | 44% |
| stelo.SoRobotNanoMelee 1.2 | 16 | 44% |
| apollokidd.ApolloKidd 0.9 | 3 | 0% |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 33% |
| gimp.GimpBot 0.1 | 2 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 50% |

Hadur died in 313 of 350 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 118 | 38% | 124 |
| az.Ololobot 0.2.4 | 49 | 16% | 55 |
| stelo.SoRobotNanoMelee 1.2 | 39 | 12% | 41 |
| catcat20.Lambda 0.024 | 36 | 12% | 43 |
| apollokidd.ApolloKidd 0.9 | 29 | 9% | 30 |
| winamp32.micro.MicroMacro 1.0 | 12 | 4% | 16 |
| gimp.GimpBot 0.1 | 11 | 4% | 18 |
| whitesquare.robots.SkynetAdvanced 1.1 | 10 | 3% | 11 |
| dcs.Eater_of_Worlds 1.1.3-A | 9 | 3% | 11 |

## Melee bench: F41

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 67.2 | 53 / 350 | 3.95 | 12.9% | 32041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.4% | 185 |
| ary.Swarm 1.1 | 2.5 | 13.7% | 31 |
| hadur117.nano.SanaroLQ 0.2 | 3.4 | 12.9% | 53 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.9% | 44 |
| simonton.nano.MeleeSeed 1.8 | 4.6 | 11.7% | 30 |
| shrub.Silver v048 | 6.2 | 9.0% | 1 |
| zyx.nano.Ant 1.1 | 6.8 | 7.8% | 2 |
| jsal.Jsalbot 1.0 | 8.4 | 5.8% | 4 |
| stelo.Mirror 1.1 | 8.6 | 5.7% | 3 |
| acogdev.alpha 0.2 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.9 | 58.1 | 3 / 35 | 2875 |
| 2 | 2 | 62.5 | 75.9 | 8 / 35 | 3528 |
| 3 | 2 | 59.5 | 69.5 | 5 / 35 | 2904 |
| 4 | 3 | 59.7 | 69.5 | 5 / 35 | 3139 |
| 5 | 5 | 58.4 | 62.9 | 4 / 35 | 3317 |
| 6 | 4 | 59.2 | 67.6 | 5 / 35 | 3099 |
| 7 | 4 | 58.7 | 65.7 | 5 / 35 | 3073 |
| 8 | 3 | 59.3 | 65.4 | 6 / 35 | 3286 |
| 9 | 3 | 59.9 | 67.9 | 5 / 35 | 3471 |
| 10 | 3 | 60.5 | 69.5 | 7 / 35 | 3349 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 62 | 27% |
| lessonz.robocode.Oz 0.5.0 | 22 | 50% |
| simonton.nano.MeleeSeed 1.8 | 17 | 71% |
| ary.Swarm 1.1 | 15 | 67% |
| shrub.Silver v048 | 3 | 67% |
| stelo.Mirror 1.1 | 2 | 50% |
| zyx.nano.Ant 1.1 | 1 | 0% |

Hadur died in 299 of 350 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 93 | 31% | 113 |
| ary.Swarm 1.1 | 64 | 21% | 73 |
| lessonz.robocode.Oz 0.5.0 | 52 | 17% | 58 |
| simonton.nano.MeleeSeed 1.8 | 43 | 14% | 57 |
| shrub.Silver v048 | 19 | 6% | 22 |
| zyx.nano.Ant 1.1 | 12 | 4% | 12 |
| stelo.Mirror 1.1 | 6 | 2% | 7 |
| acogdev.alpha 0.2 | 4 | 1% | 4 |
| jsal.Jsalbot 1.0 | 4 | 1% | 4 |
2 death(s) with no robot to name.

## Melee bench: F42

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 72.4 | 60 / 350 | 3.49 | 14.1% | 38036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.8% | 179 |
| maribo.mini.MiniQuester 0.1 | 2.8 | 13.9% | 37 |
| hadur117.nano.SanaroLQ 0.2 | 2.9 | 14.1% | 60 |
| ara.Shera 0.88 | 3.3 | 13.7% | 60 |
| amz.NanoClone 1.41 | 5.0 | 9.6% | 3 |
| maribo.IotaCT 1.1 | 6.2 | 7.9% | 1 |
| dsw.StaticD 1.0 | 6.9 | 7.1% | 9 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.3% | 1 |
| stelo.MirrorMicro 1.0 | 9.0 | 5.5% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.1 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.1 | 70.8 | 5 / 35 | 3870 |
| 2 | 2 | 62.8 | 77.5 | 8 / 35 | 3836 |
| 3 | 3 | 61.2 | 72.1 | 5 / 35 | 3827 |
| 4 | 2 | 62.5 | 74.3 | 8 / 35 | 3960 |
| 5 | 3 | 61.1 | 71.1 | 5 / 35 | 3785 |
| 6 | 4 | 59.1 | 67.0 | 1 / 35 | 3589 |
| 7 | 3 | 61.8 | 72.1 | 6 / 35 | 4018 |
| 8 | 3 | 59.1 | 67.3 | 3 / 35 | 3535 |
| 9 | 2 | 64.4 | 79.0 | 10 / 35 | 4104 |
| 10 | 3 | 61.8 | 72.7 | 9 / 35 | 3512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 76 | 28% |
| ara.Shera 0.88 | 32 | 41% |
| maribo.mini.MiniQuester 0.1 | 27 | 74% |
| dsw.StaticD 1.0 | 5 | 40% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 290 of 350 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 109 | 38% | 128 |
| ara.Shera 0.88 | 84 | 29% | 97 |
| maribo.mini.MiniQuester 0.1 | 50 | 17% | 72 |
| maribo.IotaCT 1.1 | 16 | 6% | 16 |
| amz.NanoClone 1.41 | 14 | 5% | 15 |
| dsw.StaticD 1.0 | 9 | 3% | 12 |
| mme.NikeEnhanced 2.0 | 5 | 2% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 2 |
| stelo.MirrorMicro 1.0 | 1 | 0% | 3 |

## Melee bench: F43

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 62.4 | 13 / 350 | 4.38 | 12.0% | 32907 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.0% | 280 |
| brainfade.melee.Dusk 0.44 | 2.4 | 13.0% | 33 |
| hadur117.nano.SanaroLQ 0.2 | 3.4 | 12.0% | 13 |
| wcsv.melee.EngineerMelee 0.1 | 4.1 | 11.6% | 7 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.7% | 12 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 10.0% | 2 |
| mz.NanoGod 2.02 | 7.4 | 7.5% | 4 |
| jab.DiamondStealer 5 | 7.6 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.6 | 67.3 | 1 / 35 | 3423 |
| 2 | 3 | 57.7 | 59.4 | 1 / 35 | 3076 |
| 3 | 5 | 59.1 | 61.0 | 1 / 35 | 3383 |
| 4 | 4 | 58.3 | 60.6 | 0 / 35 | 3385 |
| 5 | 3 | 59.3 | 61.3 | 3 / 35 | 3197 |
| 6 | 3 | 59.1 | 62.9 | 2 / 35 | 3300 |
| 7 | 2 | 60.5 | 66.3 | 1 / 35 | 3495 |
| 8 | 4 | 59.0 | 63.5 | 2 / 35 | 3053 |
| 9 | 3 | 59.3 | 62.5 | 0 / 35 | 3371 |
| 10 | 4 | 58.0 | 59.4 | 2 / 35 | 3224 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 84 | 11% |
| brainfade.melee.Dusk 0.44 | 9 | 11% |
| dummy.micro.Sparrow 2.5 | 4 | 50% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 33% |

Hadur died in 337 of 350 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 174 | 52% | 182 |
| wcsv.melee.EngineerMelee 0.1 | 42 | 12% | 43 |
| dummy.micro.Sparrow 2.5 | 37 | 11% | 39 |
| brainfade.melee.Dusk 0.44 | 34 | 10% | 35 |
| Krabb.akim2.Akim2 1.1b | 19 | 6% | 19 |
| mz.NanoGod 2.02 | 19 | 6% | 19 |
| jab.DiamondStealer 5 | 8 | 2% | 8 |
| cvt.Firsty 1.0 | 4 | 1% | 5 |

## Melee bench: F44

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 71.1 | 63 / 350 | 3.60 | 14.2% | 38219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.2 | 16.6% | 138 |
| tzu.TheArtOfWar 1.2 | 2.2 | 15.3% | 93 |
| hadur117.nano.SanaroLQ 0.2 | 2.6 | 14.2% | 63 |
| jwirde.Gort 2.0 | 4.5 | 10.8% | 27 |
| wompi.Quokka 1.6 | 4.6 | 11.0% | 14 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.0 | 8.9% | 2 |
| disan.Chair 2.2.0 | 7.1 | 7.3% | 7 |
| stf.PanzerGeneral 0.1 | 7.9 | 6.6% | 1 |
| sample.Crazy 1.0 | 9.2 | 5.1% | 5 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 69.8 | 5 / 35 | 3729 |
| 2 | 3 | 59.9 | 67.0 | 4 / 35 | 3664 |
| 3 | 1 | 64.0 | 76.2 | 10 / 35 | 4208 |
| 4 | 2 | 61.6 | 70.5 | 6 / 35 | 4121 |
| 5 | 3 | 63.3 | 75.9 | 8 / 35 | 3895 |
| 6 | 2 | 60.0 | 67.0 | 6 / 35 | 3687 |
| 7 | 3 | 63.2 | 76.5 | 6 / 35 | 4057 |
| 8 | 3 | 58.9 | 66.3 | 4 / 35 | 3293 |
| 9 | 3 | 62.4 | 72.4 | 8 / 35 | 3819 |
| 10 | 3 | 60.4 | 69.2 | 6 / 35 | 3746 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 64 | 41% |
| tzu.TheArtOfWar 1.2 | 52 | 27% |
| wompi.Quokka 1.6 | 16 | 63% |
| jwirde.Gort 2.0 | 14 | 29% |
| disan.Chair 2.2.0 | 7 | 86% |
| sample.Crazy 1.0 | 3 | 33% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 0% |

Hadur died in 288 of 350 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 95 | 33% | 109 |
| stelo.Liblix 0.3.1 | 89 | 31% | 120 |
| jwirde.Gort 2.0 | 35 | 12% | 41 |
| wompi.Quokka 1.6 | 23 | 8% | 27 |
| disan.Chair 2.2.0 | 16 | 6% | 20 |
| stf.PanzerGeneral 0.1 | 12 | 4% | 12 |
| amk.jointstrike.JointStrike 0.2 | 7 | 2% | 8 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 2% | 7 |
| sample.Crazy 1.0 | 5 | 2% | 6 |

## Melee bench: F45

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 70.3 | 79 / 350 | 3.67 | 14.7% | 40977 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroLQ 0.2 | 1.1 | 14.7% | 78 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 13.0% | 167 |
| jje.BagPuss 1.2 | 3.5 | 11.8% | 23 |
| myl.nano.Graviton 1.10 | 4.1 | 11.1% | 19 |
| sul.Lunar 1.1 | 4.2 | 11.1% | 24 |
| hvilela.HVilela 0.9 | 6.0 | 9.5% | 4 |
| fm.claire 1.7 | 7.3 | 8.5% | 4 |
| pez.mini.ChironexFleckeri 0.5 | 7.8 | 8.1% | 7 |
| wit.Deep7 2.0 | 8.8 | 6.7% | 22 |
| abud.ThirdRobo 1.0 | 10.0 | 5.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.0 | 64.1 | 3 / 35 | 3726 |
| 2 | 1 | 60.5 | 66.7 | 8 / 35 | 4248 |
| 3 | 1 | 62.5 | 70.2 | 10 / 35 | 4685 |
| 4 | 1 | 60.6 | 70.2 | 8 / 35 | 3568 |
| 5 | 1 | 60.8 | 68.9 | 8 / 35 | 3883 |
| 6 | 1 | 61.6 | 69.8 | 8 / 35 | 4229 |
| 7 | 1 | 62.5 | 72.4 | 7 / 35 | 4276 |
| 8 | 1 | 62.8 | 75.2 | 8 / 35 | 4071 |
| 9 | 1 | 61.7 | 71.1 | 10 / 35 | 3904 |
| 10 | 1 | 63.7 | 74.9 | 9 / 35 | 4387 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 86 | 49% |
| sul.Lunar 1.1 | 23 | 70% |
| jje.BagPuss 1.2 | 16 | 19% |
| wit.Deep7 2.0 | 9 | 44% |
| myl.nano.Graviton 1.10 | 8 | 50% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 88% |
| hvilela.HVilela 0.9 | 2 | 50% |
| abud.ThirdRobo 1.0 | 2 | 100% |
| fm.claire 1.7 | 1 | 0% |

Hadur died in 273 of 350 rounds, at a mean tick of 1190. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 53 | 19% | 87 |
| eem.IWillFireNoBullet v2.8 | 51 | 19% | 0 |
| myl.nano.Graviton 1.10 | 44 | 16% | 60 |
| sul.Lunar 1.1 | 43 | 16% | 83 |
| hvilela.HVilela 0.9 | 27 | 10% | 29 |
| fm.claire 1.7 | 21 | 8% | 27 |
| wit.Deep7 2.0 | 16 | 6% | 27 |
| pez.mini.ChironexFleckeri 0.5 | 9 | 3% | 25 |
| abud.ThirdRobo 1.0 | 7 | 3% | 12 |
2 death(s) with no robot to name.

## Melee bench: F46

hadur117.nano.SanaroLQ 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 71.4 | 32 / 350 | 3.57 | 13.1% | 30874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 18.0% | 149 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 17.0% | 142 |
| hadur117.nano.SanaroLQ 0.2 | 3.1 | 13.1% | 32 |
| cx.Princess 1.0 | 4.4 | 10.4% | 18 |
| mz.MicroSheep 1.0 | 4.5 | 10.3% | 6 |
| sadoner.killer 0.2 | 6.1 | 8.8% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.7% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.9 | 6.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.7 | 63.5 | 2 / 35 | 2830 |
| 2 | 3 | 61.8 | 76.5 | 4 / 35 | 3319 |
| 3 | 4 | 57.6 | 67.3 | 2 / 35 | 2736 |
| 4 | 3 | 62.3 | 76.5 | 6 / 35 | 3464 |
| 5 | 3 | 58.9 | 68.6 | 2 / 35 | 3118 |
| 6 | 3 | 61.1 | 73.3 | 3 / 35 | 3502 |
| 7 | 3 | 60.4 | 72.7 | 2 / 35 | 3060 |
| 8 | 3 | 59.0 | 69.8 | 3 / 35 | 2897 |
| 9 | 3 | 61.0 | 74.6 | 5 / 35 | 3093 |
| 10 | 3 | 59.3 | 71.1 | 3 / 35 | 2855 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 73 | 22% |
| rsalesc.melee.Medina 0.4.5 | 43 | 19% |
| cx.Princess 1.0 | 9 | 56% |
| mz.MicroSheep 1.0 | 4 | 25% |
| arthord.NanoSatanMelee Beta | 2 | 100% |

Hadur died in 318 of 350 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 128 | 40% | 148 |
| rsalesc.melee.Medina 0.4.5 | 97 | 31% | 101 |
| cx.Princess 1.0 | 28 | 9% | 31 |
| mz.MicroSheep 1.0 | 21 | 7% | 22 |
| sadoner.killer 0.2 | 19 | 6% | 20 |
| arthord.NanoSatanMelee Beta | 16 | 5% | 17 |
| kurios.DOSexe .9a | 5 | 2% | 5 |
| jeremyreeder.collective.Prophet 5 | 4 | 1% | 5 |

