# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 77.6 | 39 / 350 | 3.01 | 14.3% | 37770 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 243 |
| hadur117.nano.SanaroDAO 0.3 | 2.0 | 14.3% | 39 |
| mz.MicroGodMelee 1 | 4.0 | 11.5% | 13 |
| sgp.JollyNinja 3.53 | 4.0 | 11.6% | 32 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.1 | 11.7% | 15 |
| lorneswork.Predator 1.0 | 5.9 | 10.0% | 7 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.6% | 0 |
| skm.butterfly 1.0 | 8.7 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 77.8 | 5 / 35 | 3953 |
| 2 | 2 | 62.6 | 77.1 | 3 / 35 | 3776 |
| 3 | 2 | 60.9 | 74.0 | 3 / 35 | 3449 |
| 4 | 2 | 63.1 | 77.5 | 8 / 35 | 3830 |
| 5 | 2 | 60.5 | 73.3 | 3 / 35 | 3576 |
| 6 | 2 | 63.3 | 80.0 | 1 / 35 | 3855 |
| 7 | 2 | 63.1 | 77.8 | 6 / 35 | 3974 |
| 8 | 2 | 63.3 | 80.0 | 3 / 35 | 3992 |
| 9 | 2 | 63.3 | 80.3 | 7 / 35 | 3494 |
| 10 | 2 | 62.1 | 78.4 | 0 / 35 | 3871 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 150 | 7% |
| sgp.JollyNinja 3.53 | 22 | 55% |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 47% |
| mz.MicroGodMelee 1 | 14 | 43% |
| lorneswork.Predator 1.0 | 5 | 20% |
| adt.Ar2 1.0 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 311 of 350 rounds, at a mean tick of 1037. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 172 | 55% | 187 |
| sgp.JollyNinja 3.53 | 41 | 13% | 53 |
| simonton.nano.WeekendObsession_Melee 1.0 | 36 | 12% | 38 |
| mz.MicroGodMelee 1 | 28 | 9% | 32 |
| lorneswork.Predator 1.0 | 21 | 7% | 23 |
| adt.Ar2 1.0 | 7 | 2% | 8 |
| kawigi.sbf.FloodSonnet 0.9 | 5 | 2% | 6 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |
| skm.butterfly 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 66.8 | 43 / 350 | 3.99 | 13.2% | 36366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.3 | 15.3% | 99 |
| pulsar.PulsarMax 0.8.9 | 1.8 | 14.8% | 113 |
| hadur117.nano.SanaroDAO 0.3 | 2.9 | 13.2% | 43 |
| lrem.micro.SpikeSoldier 0.4 | 4.1 | 11.3% | 8 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.1 | 10.3% | 24 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 8.1% | 6 |
| Noran.BitchingElk 0.054 | 7.3 | 7.7% | 21 |
| sch.Simone 0.3d | 7.5 | 8.0% | 26 |
| stelo.PatternRobot 1.0 | 8.3 | 6.8% | 8 |
| fullsail.SweetTea 1.1 | 10.0 | 4.6% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 66.7 | 5 / 35 | 3750 |
| 2 | 3 | 57.3 | 63.8 | 2 / 35 | 3250 |
| 3 | 3 | 59.1 | 67.3 | 5 / 35 | 3296 |
| 4 | 3 | 59.2 | 66.0 | 4 / 35 | 3672 |
| 5 | 3 | 59.2 | 65.7 | 7 / 35 | 3667 |
| 6 | 2 | 59.7 | 69.2 | 4 / 35 | 3820 |
| 7 | 3 | 60.9 | 72.1 | 2 / 35 | 3759 |
| 8 | 3 | 58.2 | 66.7 | 3 / 35 | 3615 |
| 9 | 3 | 61.2 | 70.5 | 8 / 35 | 3823 |
| 10 | 3 | 56.7 | 60.3 | 3 / 35 | 3714 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 55 | 22% |
| pulsar.PulsarMax 0.8.9 | 40 | 10% |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 58% |
| sch.Simone 0.3d | 10 | 10% |
| stelo.PatternRobot 1.0 | 8 | 50% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 88% |
| Noran.BitchingElk 0.054 | 7 | 43% |
| fnc.bandit.Bandit 5.2.0 | 6 | 83% |
| fullsail.SweetTea 1.1 | 2 | 0% |

Hadur died in 308 of 350 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 77 | 25% | 79 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 75 | 24% | 87 |
| lrem.micro.SpikeSoldier 0.4 | 33 | 11% | 37 |
| com.cohesiva.robocode.ManOwaR 1.0 | 30 | 10% | 42 |
| stelo.PatternRobot 1.0 | 30 | 10% | 34 |
| sch.Simone 0.3d | 22 | 7% | 24 |
| fnc.bandit.Bandit 5.2.0 | 20 | 6% | 25 |
| Noran.BitchingElk 0.054 | 12 | 4% | 14 |
| fullsail.SweetTea 1.1 | 8 | 3% | 8 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 76.7 | 52 / 350 | 3.10 | 14.3% | 38244 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.8 | 15.1% | 107 |
| kawigi.nano.Lib 1.0 | 2.2 | 14.7% | 86 |
| hadur117.nano.SanaroDAO 0.3 | 2.8 | 14.3% | 52 |
| vuen.Cake 2.51 | 3.2 | 13.8% | 92 |
| urdos.URDOS 1.3 | 5.0 | 9.9% | 7 |
| adt.Ar1 2.1 | 6.7 | 7.6% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 7.4% | 3 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.7% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.9% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.8 | 78.7 | 6 / 35 | 4151 |
| 2 | 3 | 62.1 | 74.9 | 4 / 35 | 4364 |
| 3 | 2 | 62.5 | 79.7 | 6 / 35 | 3868 |
| 4 | 2 | 62.0 | 79.0 | 7 / 35 | 3620 |
| 5 | 2 | 61.9 | 78.4 | 6 / 35 | 3675 |
| 6 | 4 | 61.9 | 77.1 | 7 / 35 | 3766 |
| 7 | 4 | 60.1 | 73.3 | 3 / 35 | 3593 |
| 8 | 3 | 59.8 | 73.3 | 3 / 35 | 3521 |
| 9 | 2 | 60.9 | 74.6 | 6 / 35 | 4008 |
| 10 | 3 | 61.6 | 77.8 | 4 / 35 | 3678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 65 | 34% |
| radnor.DoctorBob 1.42 | 55 | 24% |
| kawigi.nano.Lib 1.0 | 48 | 6% |
| urdos.URDOS 1.3 | 11 | 64% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 50% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 299 of 350 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 96 | 32% | 101 |
| radnor.DoctorBob 1.42 | 87 | 29% | 96 |
| vuen.Cake 2.51 | 55 | 18% | 79 |
| urdos.URDOS 1.3 | 35 | 12% | 42 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 3% | 8 |
| adt.Ar1 2.1 | 8 | 3% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 4 | 1% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 1% | 5 |
| oa.weak.FlyMk1 0.1 | 2 | 1% | 4 |

## Melee bench: F04

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 70.5 | 3 / 350 | 3.65 | 13.4% | 40654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.9% | 320 |
| apc.LeeroyJenkins2 1.0 | 2.5 | 13.7% | 17 |
| hadur117.nano.SanaroDAO 0.3 | 2.5 | 13.4% | 3 |
| TNT.TNT 0.99.1 | 4.1 | 11.0% | 4 |
| josago.Jorgito 0.16 | 5.4 | 8.9% | 3 |
| css.Delitioner 0.11 | 6.0 | 7.9% | 1 |
| tj.zombie1n 1.0.1 | 6.7 | 7.3% | 1 |
| rampancy.Durandal 2.1d | 8.0 | 5.6% | 0 |
| sp.Nanos.Ember 1.1 | 8.9 | 4.8% | 0 |
| spin.Bugstard 0.012b | 9.9 | 3.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 70.5 | 0 / 35 | 3855 |
| 2 | 3 | 61.1 | 68.6 | 1 / 35 | 4071 |
| 3 | 2 | 63.0 | 73.0 | 1 / 35 | 4420 |
| 4 | 3 | 60.1 | 68.3 | 1 / 35 | 3687 |
| 5 | 2 | 62.5 | 75.2 | 0 / 35 | 4173 |
| 6 | 2 | 61.6 | 69.5 | 0 / 35 | 4494 |
| 7 | 3 | 60.7 | 67.3 | 0 / 35 | 4032 |
| 8 | 2 | 62.0 | 73.0 | 0 / 35 | 4104 |
| 9 | 2 | 62.6 | 75.2 | 0 / 35 | 4127 |
| 10 | 3 | 58.4 | 64.8 | 0 / 35 | 3691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 154 | 1% |
| TNT.TNT 0.99.1 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 0% |
| spin.Bugstard 0.012b | 1 | 100% |
| apc.LeeroyJenkins2 1.0 | 1 | 0% |

Hadur died in 347 of 350 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 224 | 65% | 227 |
| apc.LeeroyJenkins2 1.0 | 53 | 15% | 53 |
| josago.Jorgito 0.16 | 29 | 8% | 28 |
| TNT.TNT 0.99.1 | 17 | 5% | 17 |
| tj.zombie1n 1.0.1 | 14 | 4% | 15 |
| css.Delitioner 0.11 | 6 | 2% | 6 |
| rampancy.Durandal 2.1d | 4 | 1% | 4 |

## Melee bench: F06

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 72.2 | 76 / 350 | 3.50 | 13.9% | 32871 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.3 | 15.4% | 74 |
| origin.SleepSiphon 1.7b | 1.8 | 14.5% | 120 |
| hadur117.nano.SanaroDAO 0.3 | 3.0 | 13.9% | 76 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 12.4% | 47 |
| mld.Wisdom 1.0 | 4.7 | 11.0% | 6 |
| gg.Wolverine 2.0 | 6.6 | 8.5% | 9 |
| spinnercat.Omen 1.0 | 6.7 | 8.0% | 5 |
| DBall.NUKE 0.1 | 8.1 | 6.9% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 8.6 | 6.4% | 8 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 69.8 | 11 / 35 | 3254 |
| 2 | 3 | 60.3 | 73.3 | 2 / 35 | 3171 |
| 3 | 3 | 59.9 | 68.9 | 6 / 35 | 3427 |
| 4 | 3 | 61.6 | 73.3 | 8 / 35 | 3180 |
| 5 | 3 | 58.2 | 61.9 | 7 / 35 | 3414 |
| 6 | 3 | 61.5 | 75.2 | 6 / 35 | 3361 |
| 7 | 4 | 60.4 | 70.5 | 8 / 35 | 3244 |
| 8 | 3 | 62.5 | 78.7 | 8 / 35 | 3272 |
| 9 | 2 | 63.2 | 79.7 | 11 / 35 | 3361 |
| 10 | 3 | 60.2 | 70.5 | 9 / 35 | 3187 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 51 | 10% |
| jekl.StoneGhost 0.7 | 50 | 68% |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 62% |
| gg.Wolverine 2.0 | 10 | 30% |
| mld.Wisdom 1.0 | 9 | 100% |
| spinnercat.Omen 1.0 | 8 | 63% |
| DBall.NUKE 0.1 | 6 | 0% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 80% |

Hadur died in 275 of 350 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 92 | 33% | 104 |
| jekl.StoneGhost 0.7 | 74 | 27% | 92 |
| pe.minimelee.SandboxMiniMelee 1.1 | 35 | 13% | 55 |
| mld.Wisdom 1.0 | 30 | 11% | 36 |
| DBall.NUKE 0.1 | 12 | 4% | 14 |
| gg.Wolverine 2.0 | 12 | 4% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 9 | 3% | 17 |
| spinnercat.Omen 1.0 | 8 | 3% | 14 |
| sample.Fire 1.0 | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 81.6 | 46 / 350 | 2.65 | 15.8% | 44442 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.5 | 18.0% | 99 |
| rtk.Tachikoma 1.0 | 1.6 | 18.1% | 126 |
| hadur117.nano.SanaroDAO 0.3 | 2.9 | 15.8% | 46 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.8% | 29 |
| franzor.Lizt 1.3.1 | 4.5 | 11.5% | 49 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.3% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 1 |
| sample.Target 1.0 | 9.1 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.9 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.8 | 81.6 | 2 / 35 | 4416 |
| 2 | 3 | 66.1 | 80.3 | 5 / 35 | 4676 |
| 3 | 3 | 66.2 | 83.2 | 7 / 35 | 4386 |
| 4 | 3 | 64.8 | 77.5 | 3 / 35 | 4311 |
| 5 | 3 | 66.2 | 83.8 | 3 / 35 | 4273 |
| 6 | 3 | 66.3 | 83.5 | 6 / 35 | 4410 |
| 7 | 3 | 66.2 | 82.2 | 6 / 35 | 4442 |
| 8 | 3 | 65.9 | 82.2 | 2 / 35 | 4545 |
| 9 | 2 | 67.0 | 83.2 | 7 / 35 | 4553 |
| 10 | 3 | 65.4 | 78.7 | 5 / 35 | 4430 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 107 | 26% |
| rsalesc.melee.Monk 0.3.6c | 52 | 2% |
| franzor.Lizt 1.3.1 | 28 | 25% |
| oog.melee.CapuletDroid 1.1 | 27 | 33% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 305 of 350 rounds, at a mean tick of 1348. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 150 | 49% | 199 |
| rsalesc.melee.Monk 0.3.6c | 89 | 29% | 96 |
| oog.melee.CapuletDroid 1.1 | 31 | 10% | 40 |
| franzor.Lizt 1.3.1 | 26 | 9% | 4 |
| exauge.GateKeeper 1.1.121g | 6 | 2% | 8 |
| skm.PateranBotlock2 1.0 | 2 | 1% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 71.3 | 83 / 350 | 3.58 | 13.9% | 33143 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| shrub.Vapour v159 | 2.0 | 13.7% | 68 |
| tm.Yuugao 1.0 | 2.1 | 14.1% | 105 |
| hadur117.nano.SanaroDAO 0.3 | 2.2 | 13.9% | 83 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 11.1% | 36 |
| com.spp.robocode.MostlyHarmless 010 | 4.9 | 10.1% | 27 |
| m3thos.Eva00 1.1 | 5.9 | 9.1% | 13 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.5% | 14 |
| SHAM.WOW 1.4 | 8.6 | 6.8% | 5 |
| qualidafial.MajorDick 1.0.1 | 8.8 | 6.5% | 4 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 6.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 79.4 | 11 / 35 | 3602 |
| 2 | 1 | 62.6 | 78.7 | 14 / 35 | 3396 |
| 3 | 2 | 59.9 | 69.8 | 8 / 35 | 3592 |
| 4 | 2 | 61.6 | 76.5 | 8 / 35 | 3411 |
| 5 | 2 | 62.4 | 76.2 | 12 / 35 | 3482 |
| 6 | 3 | 56.2 | 63.2 | 4 / 35 | 3003 |
| 7 | 2 | 59.8 | 69.2 | 8 / 35 | 3244 |
| 8 | 2 | 59.5 | 71.4 | 7 / 35 | 3070 |
| 9 | 3 | 58.9 | 70.2 | 4 / 35 | 3250 |
| 10 | 4 | 55.4 | 58.7 | 7 / 35 | 3093 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 62 | 24% |
| shrub.Vapour v159 | 38 | 58% |
| com.spp.robocode.MostlyHarmless 010 | 25 | 64% |
| jwst.DAD.DarkAndDarker 1.1 | 17 | 71% |
| Krabb.sliNk.Garm 0.9u | 16 | 69% |
| m3thos.Eva00 1.1 | 6 | 50% |
| qualidafial.MajorDick 1.0.1 | 3 | 67% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 267 of 350 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 85 | 32% | 103 |
| shrub.Vapour v159 | 64 | 24% | 86 |
| Krabb.sliNk.Garm 0.9u | 32 | 12% | 40 |
| com.spp.robocode.MostlyHarmless 010 | 29 | 11% | 45 |
| jwst.DAD.DarkAndDarker 1.1 | 17 | 6% | 28 |
| m3thos.Eva00 1.1 | 13 | 5% | 18 |
| zyx.nano.BacillusComma 1.0 | 12 | 4% | 13 |
| qualidafial.MajorDick 1.0.1 | 11 | 4% | 11 |
| SHAM.WOW 1.4 | 4 | 1% | 6 |

## Melee bench: F09

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 61.9 | 34 / 350 | 4.43 | 11.8% | 28599 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.0% | 198 |
| kc.micro.Figment 1.0 | 2.0 | 15.0% | 62 |
| hadur117.nano.SanaroDAO 0.3 | 3.5 | 11.8% | 34 |
| yagami.Tidus 0.11 | 3.9 | 11.3% | 8 |
| pedersen.Grishnakh 1.0 | 5.1 | 10.3% | 19 |
| mc2.enemy.Original 0.9 | 5.6 | 9.9% | 26 |
| dft.Calliope 5.6 | 6.9 | 8.1% | 2 |
| step.nanoPri 1.0 | 8.4 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.3% | 1 |
| rdm.Dueler 0.4x | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.1 | 64.1 | 4 / 35 | 3054 |
| 2 | 5 | 54.3 | 56.8 | 1 / 35 | 2610 |
| 3 | 4 | 55.0 | 57.8 | 4 / 35 | 2644 |
| 4 | 3 | 59.4 | 67.9 | 4 / 35 | 2955 |
| 5 | 3 | 58.1 | 63.5 | 5 / 35 | 3154 |
| 6 | 3 | 56.6 | 62.5 | 4 / 35 | 2814 |
| 7 | 5 | 55.2 | 58.4 | 2 / 35 | 2790 |
| 8 | 3 | 57.2 | 62.5 | 3 / 35 | 2941 |
| 9 | 3 | 57.9 | 65.7 | 4 / 35 | 2692 |
| 10 | 3 | 55.9 | 60.0 | 3 / 35 | 2945 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 56 | 4% |
| kc.micro.Figment 1.0 | 30 | 73% |
| mc2.enemy.Original 0.9 | 8 | 25% |
| yagami.Tidus 0.11 | 7 | 86% |
| pedersen.Grishnakh 1.0 | 4 | 25% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 316 of 350 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 97 | 31% | 99 |
| kc.micro.Figment 1.0 | 66 | 21% | 87 |
| yagami.Tidus 0.11 | 51 | 16% | 59 |
| mc2.enemy.Original 0.9 | 49 | 16% | 50 |
| pedersen.Grishnakh 1.0 | 23 | 7% | 24 |
| robar.nano.Assertive_Melee 0.2 | 13 | 4% | 13 |
| dft.Calliope 5.6 | 9 | 3% | 10 |
| step.nanoPri 1.0 | 5 | 2% | 5 |
| rdm.Dueler 0.4x | 3 | 1% | 3 |

## Melee bench: F10

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 78.9 | 95 / 350 | 2.90 | 15.2% | 39998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroDAO 0.3 | 1.5 | 15.2% | 95 |
| DTF.Kludgy 1.2b | 2.1 | 14.7% | 87 |
| ejb.Polaris 1.0.1 | 3.2 | 13.5% | 52 |
| ne.Chimera 1.2 | 3.3 | 13.6% | 37 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.9% | 40 |
| vStar.RAFzilla 2.15 | 5.6 | 10.5% | 20 |
| sam.Samspin 1.0 | 7.3 | 6.1% | 5 |
| kurios.DOSexe .9b | 8.2 | 5.9% | 7 |
| donjezza.Muncho 1.0 | 9.1 | 4.7% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.4 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 78.1 | 9 / 35 | 3894 |
| 2 | 1 | 63.0 | 77.1 | 9 / 35 | 4136 |
| 3 | 1 | 64.0 | 77.1 | 14 / 35 | 4152 |
| 4 | 1 | 64.6 | 82.9 | 10 / 35 | 3954 |
| 5 | 1 | 65.2 | 83.5 | 13 / 35 | 4317 |
| 6 | 1 | 64.0 | 81.3 | 12 / 35 | 3958 |
| 7 | 4 | 61.0 | 73.3 | 6 / 35 | 3817 |
| 8 | 2 | 62.3 | 77.8 | 7 / 35 | 3845 |
| 9 | 1 | 63.4 | 80.0 | 7 / 35 | 3787 |
| 10 | 2 | 63.3 | 78.1 | 8 / 35 | 4138 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 59 | 42% |
| ejb.Polaris 1.0.1 | 50 | 56% |
| tvv.micro.Antares 1.1.1 | 34 | 18% |
| ne.Chimera 1.2 | 30 | 63% |
| vStar.RAFzilla 2.15 | 17 | 47% |
| donjezza.Muncho 1.0 | 7 | 57% |
| kurios.DOSexe .9b | 6 | 50% |
| sam.Samspin 1.0 | 2 | 50% |

Hadur died in 255 of 350 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 77 | 30% | 96 |
| ne.Chimera 1.2 | 60 | 24% | 84 |
| ejb.Polaris 1.0.1 | 38 | 15% | 70 |
| tvv.micro.Antares 1.1.1 | 38 | 15% | 36 |
| vStar.RAFzilla 2.15 | 13 | 5% | 23 |
| sam.Samspin 1.0 | 12 | 5% | 13 |
| kurios.DOSexe .9b | 11 | 4% | 18 |
| donjezza.Muncho 1.0 | 6 | 2% | 8 |

## Melee bench: F11

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 64.6 | 29 / 350 | 4.18 | 12.2% | 29776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.4% | 160 |
| cx.mini.Nimrod 0.55 | 2.5 | 12.4% | 36 |
| hadur117.nano.SanaroDAO 0.3 | 3.0 | 12.2% | 29 |
| djc.DynaBot 0.1.1 | 4.0 | 10.9% | 33 |
| rdt199.Warlord 0.73 | 5.7 | 9.9% | 28 |
| br2.MobyDickBot 1.6 | 5.8 | 9.5% | 24 |
| uji.YellohFellah 1.0 | 6.2 | 9.1% | 39 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.7% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.4 | 5.8% | 0 |
| stelo.MirrorNano 1.3 | 9.6 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.1 | 64.8 | 5 / 35 | 3193 |
| 2 | 2 | 58.5 | 67.3 | 3 / 35 | 3137 |
| 3 | 3 | 57.1 | 64.8 | 2 / 35 | 3056 |
| 4 | 2 | 58.1 | 68.6 | 4 / 35 | 3056 |
| 5 | 3 | 56.3 | 63.5 | 5 / 35 | 2855 |
| 6 | 5 | 53.2 | 55.9 | 0 / 35 | 2798 |
| 7 | 4 | 56.3 | 62.5 | 4 / 35 | 2878 |
| 8 | 3 | 55.2 | 60.3 | 3 / 35 | 2963 |
| 9 | 3 | 57.1 | 67.9 | 1 / 35 | 2743 |
| 10 | 2 | 58.8 | 70.8 | 2 / 35 | 3097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 66 | 6% |
| uji.YellohFellah 1.0 | 22 | 18% |
| djc.DynaBot 0.1.1 | 15 | 40% |
| rdt199.Warlord 0.73 | 13 | 62% |
| cx.mini.Nimrod 0.55 | 11 | 27% |
| br2.MobyDickBot 1.6 | 7 | 57% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |

Hadur died in 321 of 350 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 124 | 39% | 126 |
| cx.mini.Nimrod 0.55 | 55 | 17% | 59 |
| rdt199.Warlord 0.73 | 48 | 15% | 56 |
| uji.YellohFellah 1.0 | 32 | 10% | 36 |
| djc.DynaBot 0.1.1 | 27 | 8% | 33 |
| KiraNL.Chupacabra 0.4 | 14 | 4% | 14 |
| br2.MobyDickBot 1.6 | 13 | 4% | 17 |
| stelo.MirrorNano 1.3 | 5 | 2% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 1% | 3 |

## Melee bench: F12

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 70.5 | 65 / 350 | 3.65 | 13.2% | 27700 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.8 | 14.3% | 68 |
| nat.PallasHawk 1.0 | 2.4 | 14.1% | 99 |
| darkcanuck.Leon 1.01 | 2.8 | 13.1% | 67 |
| hadur117.nano.SanaroDAO 0.3 | 3.0 | 13.2% | 65 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.5% | 35 |
| jrm.Test0 1.0 | 6.2 | 8.5% | 4 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.7% | 2 |
| jp.Perpy 16.0 | 7.6 | 7.5% | 2 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.8% | 8 |
| stuff.Vlad 0.1 | 9.8 | 5.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.2 | 65.4 | 5 / 35 | 2591 |
| 2 | 4 | 56.8 | 65.7 | 5 / 35 | 2627 |
| 3 | 2 | 59.8 | 72.1 | 9 / 35 | 2860 |
| 4 | 1 | 62.6 | 81.9 | 7 / 35 | 3150 |
| 5 | 3 | 58.7 | 70.8 | 7 / 35 | 2561 |
| 6 | 4 | 58.5 | 68.3 | 6 / 35 | 2700 |
| 7 | 3 | 58.6 | 68.6 | 6 / 35 | 2829 |
| 8 | 4 | 58.8 | 70.2 | 6 / 35 | 2630 |
| 9 | 3 | 58.8 | 71.1 | 4 / 35 | 2679 |
| 10 | 2 | 60.6 | 71.1 | 10 / 35 | 3073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 61 | 52% |
| nat.PallasHawk 1.0 | 42 | 21% |
| darkcanuck.Leon 1.01 | 39 | 36% |
| jaybot.bots.Oddball 4.0 | 9 | 11% |
| brainfade.melee.Genghis 0.36 | 7 | 14% |
| jrm.Test0 1.0 | 5 | 80% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 288 of 350 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 81 | 28% | 92 |
| bts.wiki.RipCurl 0.9b | 57 | 20% | 83 |
| darkcanuck.Leon 1.01 | 51 | 18% | 73 |
| brainfade.melee.Genghis 0.36 | 36 | 13% | 36 |
| jrm.Test0 1.0 | 23 | 8% | 27 |
| jaybot.bots.Oddball 4.0 | 14 | 5% | 11 |
| cs.sheldor.Talon 1.1 | 13 | 5% | 15 |
| jp.Perpy 16.0 | 7 | 2% | 8 |
| stuff.Vlad 0.1 | 4 | 1% | 5 |
2 death(s) with no robot to name.

## Melee bench: F13

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 67.9 | 24 / 350 | 3.89 | 12.3% | 30388 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 17.5% | 168 |
| ags.Glacier 0.2.11 | 1.7 | 17.3% | 93 |
| shinh.Entangled 0.3 | 3.9 | 12.4% | 35 |
| hadur117.nano.SanaroDAO 0.3 | 4.0 | 12.3% | 24 |
| gh.micro.Gruweltje 0.7 | 4.1 | 12.1% | 29 |
| apc.Colossus2 0.17 | 6.0 | 8.4% | 0 |
| stelo.Wang 1.0 | 7.1 | 6.8% | 3 |
| ayk.WallHugger 1.0 | 8.1 | 5.4% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.4 | 65.1 | 4 / 35 | 3101 |
| 2 | 3 | 59.9 | 70.8 | 2 / 35 | 3401 |
| 3 | 3 | 59.7 | 71.1 | 3 / 35 | 2917 |
| 4 | 5 | 59.0 | 69.2 | 2 / 35 | 3127 |
| 5 | 4 | 57.5 | 67.0 | 2 / 35 | 2654 |
| 6 | 4 | 59.4 | 71.1 | 5 / 35 | 2684 |
| 7 | 5 | 58.1 | 67.6 | 2 / 35 | 2941 |
| 8 | 4 | 59.4 | 68.3 | 3 / 35 | 3281 |
| 9 | 5 | 55.5 | 58.1 | 0 / 35 | 3088 |
| 10 | 4 | 59.9 | 71.1 | 1 / 35 | 3194 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 53 | 9% |
| ags.Glacier 0.2.11 | 46 | 24% |
| shinh.Entangled 0.3 | 13 | 46% |
| gh.micro.Gruweltje 0.7 | 9 | 11% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 326 of 350 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 101 | 31% | 110 |
| mn.Combat 3.25.0 | 99 | 30% | 102 |
| shinh.Entangled 0.3 | 41 | 13% | 49 |
| gh.micro.Gruweltje 0.7 | 39 | 12% | 43 |
| stelo.Wang 1.0 | 19 | 6% | 19 |
| apc.Colossus2 0.17 | 15 | 5% | 15 |
| maribo.FollowFire 1 | 8 | 2% | 8 |
| ayk.WallHugger 1.0 | 3 | 1% | 3 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 74.6 | 73 / 350 | 3.29 | 14.0% | 32909 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.6% | 138 |
| hadur117.nano.SanaroDAO 0.3 | 2.2 | 14.0% | 73 |
| catcat20.shape.Theta 0.018 | 2.8 | 12.9% | 78 |
| co.edu.usb.rc.LidisTron 1.0 | 5.2 | 10.1% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 10.1% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 5.4 | 9.8% | 10 |
| sanyi.mikrobi.Roberto 1.0 | 6.2 | 9.7% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.9 | 8.4% | 16 |
| pa.Improved 1.0 | 9.0 | 5.4% | 4 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 74.3 | 7 / 35 | 2939 |
| 2 | 2 | 63.5 | 80.6 | 9 / 35 | 3434 |
| 3 | 2 | 61.6 | 75.2 | 8 / 35 | 3039 |
| 4 | 2 | 61.2 | 74.6 | 9 / 35 | 3202 |
| 5 | 3 | 59.0 | 69.5 | 4 / 35 | 3278 |
| 6 | 2 | 62.4 | 76.5 | 6 / 35 | 3623 |
| 7 | 2 | 61.9 | 78.7 | 5 / 35 | 3345 |
| 8 | 2 | 59.9 | 69.5 | 6 / 35 | 3210 |
| 9 | 2 | 61.2 | 70.5 | 11 / 35 | 3474 |
| 10 | 2 | 62.2 | 76.5 | 8 / 35 | 3365 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 96 | 48% |
| catcat20.shape.Theta 0.018 | 41 | 27% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 9% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| sanyi.mikrobi.Roberto 1.0 | 7 | 57% |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 40% |
| pa.Improved 1.0 | 4 | 50% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 50% |

Hadur died in 279 of 350 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 111 | 40% | 157 |
| catcat20.shape.Theta 0.018 | 52 | 19% | 61 |
| dmh.robocode.robot.RedDwarf 0.4 | 25 | 9% | 29 |
| Lo_Ian.Gandalf_V4 4.0 | 23 | 8% | 27 |
| co.edu.usb.rc.LidisTron 1.0 | 23 | 8% | 16 |
| sanyi.mikrobi.Roberto 1.0 | 20 | 7% | 26 |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 6% | 23 |
| pa.Improved 1.0 | 6 | 2% | 9 |
| sample.TrackFire 1.0 | 1 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F15

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 65.8 | 17 / 350 | 4.08 | 12.8% | 36070 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.3 | 15.0% | 83 |
| emp.Yngwie 1.11 | 2.0 | 14.2% | 131 |
| mld.DustBunny 3.8 | 3.5 | 12.8% | 31 |
| hadur117.nano.SanaroDAO 0.3 | 3.8 | 12.8% | 17 |
| kawigi.robot.Girl 1.2 | 5.2 | 10.8% | 56 |
| cb.nano.Insomnia 1.0 | 5.2 | 11.3% | 25 |
| lambdaxy.TBot 0.1 | 7.5 | 7.0% | 0 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.8% | 2 |
| divineomega.TrialBot 0.003 | 9.2 | 5.2% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.4 | 63.2 | 2 / 35 | 3217 |
| 2 | 4 | 58.0 | 65.7 | 1 / 35 | 3471 |
| 3 | 3 | 59.6 | 69.5 | 0 / 35 | 3679 |
| 4 | 2 | 61.3 | 68.6 | 5 / 35 | 4299 |
| 5 | 6 | 55.8 | 59.0 | 1 / 35 | 3375 |
| 6 | 5 | 56.4 | 60.3 | 1 / 35 | 3412 |
| 7 | 3 | 59.8 | 70.2 | 2 / 35 | 3588 |
| 8 | 3 | 60.7 | 71.1 | 3 / 35 | 3881 |
| 9 | 5 | 56.5 | 60.6 | 0 / 35 | 3500 |
| 10 | 3 | 59.9 | 69.5 | 2 / 35 | 3648 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 46 | 9% |
| kawigi.micro.Shiz 1.1 | 25 | 12% |
| cb.nano.Insomnia 1.0 | 16 | 13% |
| mld.DustBunny 3.8 | 13 | 31% |
| kawigi.robot.Girl 1.2 | 13 | 31% |
| divineomega.TrialBot 0.003 | 1 | 0% |

Hadur died in 333 of 350 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 73 | 22% | 79 |
| kawigi.micro.Shiz 1.1 | 71 | 21% | 76 |
| mld.DustBunny 3.8 | 63 | 19% | 71 |
| cb.nano.Insomnia 1.0 | 55 | 17% | 40 |
| kawigi.robot.Girl 1.2 | 37 | 11% | 44 |
| lambdaxy.TBot 0.1 | 11 | 3% | 11 |
| divineomega.TrialBot 0.003 | 10 | 3% | 15 |
| Grystrion.TrackerWO 1.0 | 7 | 2% | 8 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 6 | 2% | 6 |

## Melee bench: F16

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 71.3 | 25 / 350 | 3.59 | 13.9% | 38453 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.2% | 180 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.3 | 14.6% | 22 |
| hadur117.nano.SanaroDAO 0.3 | 2.8 | 13.9% | 25 |
| techdude.forest.FlamingForest 1.1 | 3.9 | 11.5% | 81 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.6% | 21 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 9.2% | 3 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.2% | 6 |
| repositorio.NanoStep 1.0 | 8.9 | 5.3% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.4% | 11 |
| asd.Cthulhu 1.3 | 9.1 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 70.5 | 2 / 35 | 3511 |
| 2 | 3 | 60.5 | 67.9 | 4 / 35 | 3703 |
| 3 | 3 | 58.7 | 63.5 | 1 / 35 | 3691 |
| 4 | 2 | 63.0 | 77.5 | 2 / 35 | 3847 |
| 5 | 3 | 62.1 | 73.7 | 2 / 35 | 4117 |
| 6 | 3 | 59.7 | 67.9 | 3 / 35 | 3534 |
| 7 | 3 | 62.0 | 73.3 | 5 / 35 | 3972 |
| 8 | 2 | 61.5 | 73.3 | 2 / 35 | 3873 |
| 9 | 3 | 61.8 | 73.3 | 2 / 35 | 3963 |
| 10 | 3 | 61.6 | 71.7 | 2 / 35 | 4242 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 96 | 2% |
| techdude.forest.FlamingForest 1.1 | 29 | 14% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 69% |
| tvv.nano.Polaris 1.2 | 10 | 20% |
| bvh.fnr.Fenrir 0.36l | 7 | 71% |
| divineomega.DivineBot 1.9.4.5 | 2 | 50% |
| stelo.IntrinsicVolatility 1.4 | 1 | 0% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 326 of 350 rounds, at a mean tick of 1120. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 159 | 49% | 163 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 43 | 13% | 54 |
| techdude.forest.FlamingForest 1.1 | 43 | 13% | 48 |
| bvh.fnr.Fenrir 0.36l | 32 | 10% | 33 |
| tvv.nano.Polaris 1.2 | 23 | 7% | 24 |
| stelo.IntrinsicVolatility 1.4 | 11 | 3% | 11 |
| divineomega.DivineBot 1.9.4.5 | 10 | 3% | 11 |
| asd.Cthulhu 1.3 | 4 | 1% | 5 |
| repositorio.NanoStep 1.0 | 1 | 0% | 1 |

## Melee bench: F17

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 63.2 | 35 / 350 | 4.31 | 12.2% | 33245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.4 | 14.7% | 83 |
| oog.melee.Mercutio 1.0 | 2.6 | 14.0% | 86 |
| cx.BlestPain 1.41 | 2.6 | 13.7% | 98 |
| hadur117.nano.SanaroDAO 0.3 | 4.5 | 12.2% | 35 |
| nic.Nicator 2.4 | 4.9 | 11.6% | 22 |
| ahf.NanoAndrew .4 | 5.0 | 11.3% | 23 |
| maribo.melee.BMV 0.1 | 7.0 | 8.3% | 4 |
| tex.Longbot 0.4 | 8.2 | 5.9% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.8 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.1 | 65.1 | 3 / 35 | 3312 |
| 2 | 6 | 55.4 | 58.4 | 3 / 35 | 2902 |
| 3 | 3 | 57.8 | 63.2 | 4 / 35 | 3312 |
| 4 | 5 | 57.9 | 64.4 | 2 / 35 | 3304 |
| 5 | 6 | 56.1 | 60.0 | 2 / 35 | 2938 |
| 6 | 4 | 59.8 | 66.7 | 5 / 35 | 3769 |
| 7 | 2 | 61.4 | 71.7 | 7 / 35 | 3609 |
| 8 | 6 | 56.2 | 57.5 | 2 / 35 | 3435 |
| 9 | 3 | 59.0 | 64.1 | 5 / 35 | 3520 |
| 10 | 6 | 56.1 | 61.0 | 2 / 35 | 3144 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 42 | 26% |
| oog.melee.Mercutio 1.0 | 25 | 28% |
| cx.BlestPain 1.41 | 17 | 12% |
| ahf.NanoAndrew .4 | 10 | 60% |
| nic.Nicator 2.4 | 9 | 78% |
| maribo.melee.BMV 0.1 | 2 | 50% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 315 of 350 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 89 | 28% | 99 |
| cx.BlestPain 1.41 | 59 | 19% | 62 |
| ahf.NanoAndrew .4 | 52 | 17% | 59 |
| oog.melee.Mercutio 1.0 | 48 | 15% | 55 |
| nic.Nicator 2.4 | 28 | 9% | 33 |
| maribo.melee.BMV 0.1 | 23 | 7% | 25 |
| tex.Longbot 0.4 | 12 | 4% | 12 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 1% | 4 |
| goblin.Bender 2.4 | 1 | 0% | 1 |

## Melee bench: F18

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 68.3 | 69 / 350 | 3.86 | 13.2% | 32032 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.5 | 14.2% | 79 |
| hadur117.nano.SanaroDAO 0.3 | 2.3 | 13.2% | 69 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.7% | 75 |
| uji.DBH 1.1 | 4.6 | 11.3% | 34 |
| ratosh.Nobo 0.21 | 4.7 | 10.9% | 11 |
| spinnercat.Robovirus 2.718 | 5.1 | 10.2% | 34 |
| sigterm.Sigterm 1.0 | 7.3 | 8.5% | 25 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.5% | 8 |
| stelo.WangRobot 1.0 | 9.3 | 5.9% | 14 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.6 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.1 | 64.8 | 3 / 35 | 3121 |
| 2 | 2 | 59.7 | 68.6 | 8 / 35 | 3390 |
| 3 | 2 | 58.2 | 68.3 | 6 / 35 | 2906 |
| 4 | 3 | 58.7 | 65.1 | 10 / 35 | 3174 |
| 5 | 2 | 59.3 | 68.6 | 6 / 35 | 3553 |
| 6 | 2 | 59.6 | 71.4 | 6 / 35 | 3350 |
| 7 | 4 | 55.0 | 61.6 | 5 / 35 | 2698 |
| 8 | 1 | 61.3 | 75.9 | 9 / 35 | 3150 |
| 9 | 2 | 59.5 | 68.3 | 8 / 35 | 3408 |
| 10 | 2 | 59.7 | 70.2 | 8 / 35 | 3282 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 59 | 56% |
| agd.Mooserwirt2 2.7 | 28 | 21% |
| spinnercat.Robovirus 2.718 | 21 | 24% |
| uji.DBH 1.1 | 19 | 32% |
| sigterm.Sigterm 1.0 | 11 | 36% |
| ratosh.Nobo 0.21 | 6 | 83% |
| stelo.WangRobot 1.0 | 4 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 283 of 350 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 78 | 28% | 116 |
| agd.Mooserwirt2 2.7 | 52 | 18% | 60 |
| spinnercat.Robovirus 2.718 | 36 | 13% | 31 |
| uji.DBH 1.1 | 34 | 12% | 39 |
| ratosh.Nobo 0.21 | 27 | 10% | 33 |
| sigterm.Sigterm 1.0 | 22 | 8% | 26 |
| stelo.WangRobot 1.0 | 14 | 5% | 18 |
| kawigi.mini.Fhqwhgads 1.1 | 10 | 4% | 16 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 10 | 4% | 11 |

## Melee bench: F19

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 80.3 | 71 / 350 | 2.77 | 15.4% | 38440 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.6 | 16.5% | 109 |
| mld.Infinity 2.2 | 2.2 | 16.0% | 127 |
| hadur117.nano.SanaroDAO 0.3 | 2.3 | 15.4% | 71 |
| krillr.mini.JointStrike 2.0.0 | 3.9 | 12.0% | 17 |
| erdnis.Rover 0.3 | 5.0 | 10.4% | 7 |
| patson.PatsonTestBot 1.0 | 6.1 | 8.8% | 9 |
| mbh.Mbh 0.1 | 7.1 | 7.3% | 0 |
| pac.ABC 2.1 | 7.8 | 6.8% | 9 |
| pbg.R2D2 1.0 | 9.0 | 5.9% | 1 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 81.6 | 6 / 35 | 3836 |
| 2 | 3 | 64.5 | 79.0 | 5 / 35 | 3903 |
| 3 | 2 | 65.4 | 84.8 | 6 / 35 | 3914 |
| 4 | 3 | 63.9 | 81.0 | 7 / 35 | 3485 |
| 5 | 2 | 65.1 | 80.0 | 10 / 35 | 4119 |
| 6 | 3 | 63.5 | 77.1 | 6 / 35 | 3497 |
| 7 | 2 | 63.5 | 78.1 | 4 / 35 | 3826 |
| 8 | 3 | 64.6 | 79.4 | 7 / 35 | 3948 |
| 9 | 1 | 66.0 | 83.5 | 11 / 35 | 4068 |
| 10 | 2 | 64.1 | 78.4 | 9 / 35 | 3844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 95 | 28% |
| davidalves.net.DuelistMiniMelee 1.2 | 88 | 28% |
| krillr.mini.JointStrike 2.0.0 | 16 | 56% |
| erdnis.Rover 0.3 | 6 | 50% |
| patson.PatsonTestBot 1.0 | 4 | 75% |
| pac.ABC 2.1 | 3 | 67% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 279 of 350 rounds, at a mean tick of 1242. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 110 | 39% | 173 |
| mld.Infinity 2.2 | 96 | 34% | 38 |
| krillr.mini.JointStrike 2.0.0 | 27 | 10% | 45 |
| patson.PatsonTestBot 1.0 | 18 | 6% | 25 |
| erdnis.Rover 0.3 | 15 | 5% | 23 |
| mbh.Mbh 0.1 | 8 | 3% | 21 |
| pac.ABC 2.1 | 3 | 1% | 15 |
| pbg.R2D2 1.0 | 2 | 1% | 6 |

## Melee bench: F20

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 71.7 | 58 / 350 | 3.54 | 13.8% | 34876 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.2% | 130 |
| hadur117.nano.SanaroDAO 0.3 | 2.2 | 13.8% | 58 |
| fwb.Nine 1.0.1 | 3.8 | 11.5% | 44 |
| catcat20.Rabbit 0.001 | 4.1 | 11.1% | 61 |
| nz.jdc.nano.GridFu 1.0 | 4.1 | 11.6% | 19 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 8.4% | 13 |
| djdjdj.NanoSkunk10 1.0 | 6.6 | 8.8% | 9 |
| bayen.nut.Squirrel 1.615 | 7.7 | 7.6% | 10 |
| ntc.ControlledChaos 1.1.4 | 9.4 | 5.2% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.6 | 4.8% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.3 | 69.2 | 4 / 35 | 3387 |
| 2 | 3 | 60.0 | 68.6 | 6 / 35 | 3620 |
| 3 | 2 | 61.8 | 74.3 | 6 / 35 | 3782 |
| 4 | 2 | 61.5 | 76.2 | 6 / 35 | 3445 |
| 5 | 3 | 59.1 | 70.2 | 5 / 35 | 3158 |
| 6 | 2 | 58.5 | 67.3 | 5 / 35 | 3399 |
| 7 | 2 | 62.6 | 77.1 | 9 / 35 | 3653 |
| 8 | 2 | 61.4 | 73.3 | 8 / 35 | 3484 |
| 9 | 2 | 60.8 | 72.4 | 4 / 35 | 3691 |
| 10 | 2 | 59.2 | 68.9 | 5 / 35 | 3257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 66 | 45% |
| catcat20.Rabbit 0.001 | 26 | 19% |
| bayen.nut.Squirrel 1.615 | 13 | 92% |
| fwb.Nine 1.0.1 | 12 | 33% |
| nz.jdc.nano.GridFu 1.0 | 11 | 36% |
| djdjdj.NanoSkunk10 1.0 | 3 | 67% |
| m3thos.mini.Eva01 0.5.5 | 3 | 33% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 0% |

Hadur died in 292 of 350 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 115 | 39% | 136 |
| fwb.Nine 1.0.1 | 56 | 19% | 62 |
| catcat20.Rabbit 0.001 | 37 | 13% | 46 |
| nz.jdc.nano.GridFu 1.0 | 32 | 11% | 37 |
| bayen.nut.Squirrel 1.615 | 14 | 5% | 19 |
| djdjdj.NanoSkunk10 1.0 | 14 | 5% | 18 |
| sample.MyFirstJuniorRobot 1.0 | 12 | 4% | 14 |
| m3thos.mini.Eva01 0.5.5 | 8 | 3% | 11 |
| ntc.ControlledChaos 1.1.4 | 4 | 1% | 5 |

## Melee bench: F21

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 80.6 | 86 / 350 | 2.75 | 16.1% | 43613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.3 | 17.9% | 185 |
| hadur117.nano.SanaroDAO 0.3 | 1.8 | 16.1% | 86 |
| dummy.mini.Scimitar 1.01 | 2.9 | 14.9% | 27 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.5% | 15 |
| oa.weak.BotherBot 0.1 | 5.4 | 8.7% | 5 |
| eld.Hmm 1.0 | 5.6 | 8.8% | 32 |
| el.JumpShoot 0.2 | 7.6 | 6.3% | 3 |
| fire219.CatBot 1.0 | 8.0 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.4 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 83.5 | 12 / 35 | 4477 |
| 2 | 2 | 66.6 | 83.8 | 9 / 35 | 4658 |
| 3 | 2 | 66.5 | 82.2 | 10 / 35 | 4794 |
| 4 | 2 | 63.5 | 76.8 | 5 / 35 | 3921 |
| 5 | 1 | 66.3 | 82.5 | 11 / 35 | 4648 |
| 6 | 2 | 63.8 | 79.4 | 8 / 35 | 3981 |
| 7 | 2 | 64.0 | 76.5 | 5 / 35 | 4500 |
| 8 | 1 | 68.0 | 88.6 | 15 / 35 | 4649 |
| 9 | 2 | 64.7 | 81.9 | 8 / 35 | 3991 |
| 10 | 3 | 61.3 | 70.5 | 3 / 35 | 3994 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 141 | 33% |
| dummy.mini.Scimitar 1.01 | 38 | 68% |
| eld.Hmm 1.0 | 17 | 12% |
| cf.RiO.RiOx 4.2.1 | 13 | 69% |
| oa.weak.BotherBot 0.1 | 4 | 75% |
| el.JumpShoot 0.2 | 1 | 0% |

Hadur died in 267 of 350 rounds, at a mean tick of 1252. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 130 | 49% | 150 |
| dummy.mini.Scimitar 1.01 | 61 | 23% | 101 |
| cf.RiO.RiOx 4.2.1 | 30 | 11% | 38 |
| eld.Hmm 1.0 | 22 | 8% | 29 |
| PSW.Relentless 0.1 | 8 | 3% | 8 |
| oa.weak.BotherBot 0.1 | 6 | 2% | 12 |
| el.JumpShoot 0.2 | 6 | 2% | 7 |
| arthord.MannyPacquiao Beta | 2 | 1% | 5 |
2 death(s) with no robot to name.

## Melee bench: F23

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 83.5 | 96 / 350 | 2.49 | 16.4% | 40160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.1 | 18.5% | 156 |
| hadur117.nano.SanaroDAO 0.3 | 2.1 | 16.4% | 96 |
| cre.Karolos 0.32 | 2.9 | 15.1% | 60 |
| stelo.AreaTargetingBot 1.1 | 3.9 | 11.4% | 23 |
| stelo.RamTrackSurfer 1.2 | 5.4 | 9.2% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.1 | 8.7% | 2 |
| sample.Walls 1.0 | 7.2 | 8.3% | 1 |
| cw.megas.Blade 0.8 | 7.3 | 8.3% | 3 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 81.3 | 10 / 35 | 4210 |
| 2 | 3 | 66.7 | 82.9 | 10 / 35 | 4112 |
| 3 | 2 | 66.2 | 81.9 | 7 / 35 | 4242 |
| 4 | 1 | 68.2 | 87.9 | 14 / 35 | 4130 |
| 5 | 3 | 66.2 | 81.3 | 9 / 35 | 4148 |
| 6 | 2 | 65.6 | 82.9 | 11 / 35 | 3713 |
| 7 | 2 | 66.6 | 84.8 | 9 / 35 | 3751 |
| 8 | 2 | 66.9 | 84.4 | 10 / 35 | 4297 |
| 9 | 2 | 66.1 | 83.5 | 7 / 35 | 3953 |
| 10 | 2 | 65.8 | 83.8 | 9 / 35 | 3604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 119 | 34% |
| cre.Karolos 0.32 | 59 | 47% |
| stelo.AreaTargetingBot 1.1 | 20 | 20% |
| sample.Walls 1.0 | 16 | 100% |
| stelo.RamTrackSurfer 1.2 | 5 | 40% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 80% |
| cw.megas.Blade 0.8 | 2 | 0% |

Hadur died in 254 of 350 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 137 | 54% | 178 |
| cre.Karolos 0.32 | 61 | 24% | 93 |
| stelo.AreaTargetingBot 1.1 | 35 | 14% | 33 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 2% | 13 |
| stelo.RamTrackSurfer 1.2 | 6 | 2% | 12 |
| cw.megas.Blade 0.8 | 5 | 2% | 6 |
| sample.Walls 1.0 | 4 | 2% | 12 |

## Melee bench: F24

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.0 | 61.4 | 24 / 350 | 4.48 | 11.2% | 24766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.5 | 15.0% | 95 |
| florent.XSeries.X2 0.12 | 2.4 | 13.8% | 77 |
| davidalves.Phoenix 0.54 | 2.6 | 13.5% | 81 |
| pedersen.Ugluk 1.1.1 | 3.7 | 12.3% | 51 |
| hadur117.nano.SanaroDAO 0.3 | 5.0 | 11.2% | 24 |
| stelo.SoJNanoMelee 1.1 | 6.3 | 8.9% | 21 |
| oog.melee.Corsair 1.0 | 6.5 | 9.0% | 0 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.8% | 0 |
| as.FrankTheTank 1.3 | 9.5 | 4.9% | 1 |
| evd.X1 0.01 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.2 | 55.6 | 0 / 35 | 2220 |
| 2 | 5 | 54.6 | 58.7 | 2 / 35 | 2846 |
| 3 | 5 | 55.4 | 62.5 | 2 / 35 | 2487 |
| 4 | 5 | 55.5 | 61.9 | 2 / 35 | 2647 |
| 5 | 4 | 57.0 | 67.9 | 4 / 35 | 2297 |
| 6 | 5 | 56.4 | 64.1 | 3 / 35 | 2672 |
| 7 | 5 | 57.0 | 65.7 | 3 / 35 | 2412 |
| 8 | 5 | 54.6 | 60.0 | 4 / 35 | 2411 |
| 9 | 6 | 51.7 | 55.6 | 1 / 35 | 2213 |
| 10 | 5 | 55.3 | 61.6 | 3 / 35 | 2561 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 33 | 21% |
| florent.XSeries.X2 0.12 | 22 | 23% |
| davidalves.Phoenix 0.54 | 22 | 9% |
| pedersen.Ugluk 1.1.1 | 15 | 27% |
| stelo.SoJNanoMelee 1.1 | 6 | 50% |
| oog.melee.Corsair 1.0 | 2 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 327 of 350 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 74 | 23% | 75 |
| rz.GlowBlowMelee 1.4 | 65 | 20% | 75 |
| pedersen.Ugluk 1.1.1 | 65 | 20% | 65 |
| florent.XSeries.X2 0.12 | 58 | 18% | 62 |
| stelo.SoJNanoMelee 1.1 | 26 | 8% | 28 |
| oog.melee.Corsair 1.0 | 19 | 6% | 23 |
| lunchie.Lunchbox 0.93 | 10 | 3% | 11 |
| evd.X1 0.01 | 7 | 2% | 7 |
| as.FrankTheTank 1.3 | 3 | 1% | 4 |

## Melee bench: F25

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 68.0 | 60 / 350 | 3.88 | 13.1% | 29089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.6 | 14.4% | 84 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.6% | 65 |
| hadur117.nano.SanaroDAO 0.3 | 2.8 | 13.1% | 60 |
| jdw.Hurricane 1.4 | 3.2 | 12.5% | 61 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 10.7% | 32 |
| ds.Oo 2.2 | 6.2 | 8.7% | 16 |
| gjr.Cephalosporin 0.1 | 6.4 | 9.1% | 26 |
| awesomeness.Elite 1.0 | 8.1 | 7.2% | 3 |
| adt.Ar2 1.1 | 8.9 | 6.6% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 69.8 | 5 / 35 | 3082 |
| 2 | 3 | 60.0 | 70.8 | 6 / 35 | 3194 |
| 3 | 4 | 56.1 | 61.9 | 2 / 35 | 2787 |
| 4 | 1 | 59.4 | 68.9 | 8 / 35 | 3012 |
| 5 | 2 | 60.2 | 70.8 | 8 / 35 | 3104 |
| 6 | 2 | 59.6 | 72.4 | 7 / 35 | 2581 |
| 7 | 4 | 55.7 | 60.6 | 5 / 35 | 2588 |
| 8 | 3 | 59.5 | 67.9 | 10 / 35 | 2783 |
| 9 | 3 | 57.9 | 62.9 | 7 / 35 | 3038 |
| 10 | 3 | 59.9 | 73.7 | 2 / 35 | 2920 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 48 | 31% |
| voidious.micro.BlitzBat 1.05 | 37 | 30% |
| jdw.Hurricane 1.4 | 26 | 69% |
| gjr.Cephalosporin 0.1 | 20 | 40% |
| gre.svman4.Morfeas 1.4.1 | 8 | 38% |
| adt.Ar2 1.1 | 5 | 60% |
| ds.Oo 2.2 | 4 | 0% |
| awesomeness.Elite 1.0 | 2 | 100% |

Hadur died in 290 of 350 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 66 | 23% | 81 |
| voidious.micro.BlitzBat 1.05 | 62 | 21% | 79 |
| jdw.Hurricane 1.4 | 58 | 20% | 62 |
| gjr.Cephalosporin 0.1 | 28 | 10% | 38 |
| gre.svman4.Morfeas 1.4.1 | 23 | 8% | 30 |
| ds.Oo 2.2 | 20 | 7% | 22 |
| adt.Ar2 1.1 | 14 | 5% | 17 |
| awesomeness.Elite 1.0 | 13 | 4% | 15 |
| amk.ChumbaMini 0.2 | 6 | 2% | 6 |

## Melee bench: F26

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 69.7 | 37 / 350 | 3.72 | 12.8% | 32424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.4% | 135 |
| hadur117.nano.SanaroDAO 0.3 | 3.1 | 12.8% | 37 |
| lrem.Spectre 0.4.4 | 3.3 | 12.6% | 53 |
| shu.nitro.LENIN .T34 | 3.6 | 12.7% | 66 |
| js.PinBall 1.6 | 4.7 | 11.6% | 22 |
| gh.mini.GrubbmOne 1.0 | 5.3 | 11.2% | 20 |
| jaybot.adv.bots.JayBot 2.0 | 7.1 | 9.0% | 9 |
| fullsail.LaxativeTeaTwo 1.0 | 8.3 | 6.6% | 9 |
| sample.SpinBot 1.0 | 8.6 | 5.6% | 3 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.6 | 69.5 | 2 / 35 | 3387 |
| 2 | 5 | 59.0 | 69.8 | 2 / 35 | 2988 |
| 3 | 2 | 60.8 | 73.7 | 5 / 35 | 3302 |
| 4 | 2 | 60.4 | 70.8 | 3 / 35 | 3402 |
| 5 | 5 | 57.3 | 64.1 | 3 / 35 | 3061 |
| 6 | 2 | 60.8 | 73.7 | 8 / 35 | 3343 |
| 7 | 3 | 59.0 | 69.8 | 2 / 35 | 3441 |
| 8 | 3 | 59.5 | 69.2 | 5 / 35 | 3272 |
| 9 | 4 | 57.3 | 64.8 | 3 / 35 | 2859 |
| 10 | 3 | 60.6 | 72.1 | 4 / 35 | 3369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 38 | 11% |
| lrem.Spectre 0.4.4 | 33 | 45% |
| shu.nitro.LENIN .T34 | 29 | 28% |
| gh.mini.GrubbmOne 1.0 | 16 | 19% |
| js.PinBall 1.6 | 11 | 64% |
| fullsail.LaxativeTeaTwo 1.0 | 7 | 0% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 0% |

Hadur died in 315 of 350 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 95 | 30% | 98 |
| lrem.Spectre 0.4.4 | 52 | 17% | 64 |
| shu.nitro.LENIN .T34 | 43 | 14% | 54 |
| gh.mini.GrubbmOne 1.0 | 43 | 14% | 47 |
| js.PinBall 1.6 | 32 | 10% | 39 |
| jaybot.adv.bots.JayBot 2.0 | 25 | 8% | 25 |
| fullsail.LaxativeTeaTwo 1.0 | 14 | 4% | 14 |
| sample.SpinBot 1.0 | 9 | 3% | 9 |
2 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 68.0 | 65 / 350 | 3.88 | 13.1% | 31836 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.5 | 15.1% | 125 |
| hadur117.nano.SanaroDAO 0.3 | 2.8 | 13.1% | 65 |
| wee.Gem 1.8.4 | 3.0 | 12.9% | 72 |
| sheldor.melee.nano.TestMelee 0.1 | 3.0 | 12.4% | 53 |
| EH.Eagle 1.0.6 | 4.7 | 10.9% | 15 |
| techdude.kombat.FlamingKombat 1.5 | 6.7 | 8.7% | 10 |
| joe.ADinosaur 1.0 | 6.8 | 8.7% | 6 |
| throxbot.ThroxBot 0.1 | 8.0 | 7.6% | 3 |
| caimano.Furia_Ceca 0.22 | 8.9 | 6.1% | 3 |
| cs.Grudge 1.0 | 9.6 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.0 | 75.6 | 11 / 35 | 3054 |
| 2 | 3 | 60.3 | 74.9 | 7 / 35 | 2880 |
| 3 | 5 | 53.9 | 45.1 | 2 / 35 | 4217 |
| 4 | 2 | 61.2 | 76.2 | 7 / 35 | 3182 |
| 5 | 1 | 61.0 | 74.0 | 9 / 35 | 3037 |
| 6 | 2 | 62.7 | 79.7 | 8 / 35 | 3075 |
| 7 | 5 | 51.8 | 42.2 | 4 / 35 | 3732 |
| 8 | 2 | 60.9 | 75.9 | 7 / 35 | 3161 |
| 9 | 3 | 58.4 | 67.0 | 8 / 35 | 2916 |
| 10 | 4 | 57.4 | 69.5 | 2 / 35 | 2582 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 67 | 31% |
| wee.Gem 1.8.4 | 32 | 31% |
| sheldor.melee.nano.TestMelee 0.1 | 28 | 50% |
| EH.Eagle 1.0.6 | 16 | 69% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 60% |
| throxbot.ThroxBot 0.1 | 3 | 67% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 286 of 350 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 102 | 36% | 120 |
| sheldor.melee.nano.TestMelee 0.1 | 48 | 17% | 65 |
| wee.Gem 1.8.4 | 48 | 17% | 58 |
| joe.ADinosaur 1.0 | 21 | 7% | 23 |
| EH.Eagle 1.0.6 | 16 | 6% | 29 |
| techdude.kombat.FlamingKombat 1.5 | 15 | 5% | 14 |
| cs.Grudge 1.0 | 14 | 5% | 14 |
| throxbot.ThroxBot 0.1 | 11 | 4% | 16 |
| caimano.Furia_Ceca 0.22 | 11 | 4% | 11 |

## Melee bench: F28

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 79.5 | 75 / 350 | 2.84 | 15.2% | 33563 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.1 | 16.6% | 142 |
| hadur117.nano.SanaroDAO 0.3 | 2.0 | 15.2% | 75 |
| uji.Antique 1.0 | 2.9 | 13.5% | 74 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.9% | 29 |
| pfvicm.Sobieski 7.2.3b | 4.9 | 10.4% | 14 |
| amk.ChumbaWumba 0.3 | 6.1 | 8.4% | 8 |
| ahr.ice.Ice 1.0.2 | 7.0 | 7.5% | 1 |
| matt.advanced.Katana 1.0 | 7.8 | 6.7% | 7 |
| stelo.PianistNano 1.2 | 9.2 | 6.0% | 0 |
| stelo.Lifestealer 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.4 | 77.8 | 5 / 35 | 3312 |
| 2 | 2 | 64.0 | 82.2 | 7 / 35 | 3604 |
| 3 | 2 | 60.0 | 73.0 | 6 / 35 | 2914 |
| 4 | 2 | 63.5 | 79.4 | 11 / 35 | 3456 |
| 5 | 2 | 63.6 | 81.3 | 7 / 35 | 3291 |
| 6 | 2 | 61.7 | 77.1 | 2 / 35 | 3476 |
| 7 | 1 | 65.9 | 87.3 | 14 / 35 | 3443 |
| 8 | 2 | 61.3 | 74.9 | 8 / 35 | 3228 |
| 9 | 2 | 62.7 | 80.0 | 5 / 35 | 3480 |
| 10 | 2 | 64.0 | 82.2 | 10 / 35 | 3359 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 112 | 18% |
| uji.Antique 1.0 | 56 | 50% |
| qohnil.blot.BlotBot 3.61 | 27 | 30% |
| amk.ChumbaWumba 0.3 | 11 | 55% |
| pfvicm.Sobieski 7.2.3b | 9 | 44% |
| matt.advanced.Katana 1.0 | 6 | 67% |
| stelo.Lifestealer 1.0 | 2 | 100% |
| ahr.ice.Ice 1.0.2 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 275 of 350 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 129 | 47% | 137 |
| uji.Antique 1.0 | 51 | 19% | 88 |
| pfvicm.Sobieski 7.2.3b | 36 | 13% | 43 |
| qohnil.blot.BlotBot 3.61 | 26 | 9% | 31 |
| amk.ChumbaWumba 0.3 | 17 | 6% | 19 |
| stelo.Lifestealer 1.0 | 5 | 2% | 7 |
| ahr.ice.Ice 1.0.2 | 4 | 1% | 10 |
| matt.advanced.Katana 1.0 | 4 | 1% | 9 |
| stelo.PianistNano 1.2 | 3 | 1% | 4 |

## Melee bench: F29

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 66.1 | 41 / 350 | 4.05 | 12.9% | 31737 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.5 | 15.3% | 99 |
| zyx.mega.YersiniaPestis 3.1 | 1.6 | 15.9% | 124 |
| hadur117.nano.SanaroDAO 0.3 | 3.4 | 12.9% | 41 |
| myl.micro.Troodon 1.10 | 3.7 | 12.7% | 28 |
| jok.PheonixM 0.1.2 | 4.8 | 11.4% | 19 |
| ph.melee.ArcherME 0.3 | 6.5 | 8.4% | 1 |
| DBall.Anarchy 0.1 | 6.5 | 8.8% | 32 |
| fullsail.TimbotNoPrediction 1.0 | 8.3 | 5.7% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.6% | 6 |
| jangs.ns51 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.9 | 61.6 | 3 / 35 | 3034 |
| 2 | 3 | 57.4 | 62.2 | 5 / 35 | 2948 |
| 3 | 3 | 60.5 | 69.5 | 4 / 35 | 3447 |
| 4 | 2 | 62.3 | 73.7 | 7 / 35 | 3427 |
| 5 | 3 | 62.0 | 74.3 | 4 / 35 | 3678 |
| 6 | 4 | 60.1 | 67.0 | 8 / 35 | 3149 |
| 7 | 3 | 58.1 | 63.8 | 3 / 35 | 3143 |
| 8 | 5 | 52.9 | 52.1 | 1 / 35 | 2686 |
| 9 | 4 | 59.1 | 66.7 | 3 / 35 | 2918 |
| 10 | 3 | 60.2 | 70.2 | 3 / 35 | 3307 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 42 | 21% |
| deewiant.Anomaly 0.2 | 38 | 5% |
| myl.micro.Troodon 1.10 | 23 | 78% |
| DBall.Anarchy 0.1 | 17 | 24% |
| jok.PheonixM 0.1.2 | 7 | 57% |
| ph.melee.ArcherME 0.3 | 3 | 67% |
| ap.Frederick 1.1 | 2 | 50% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 309 of 350 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 106 | 34% | 108 |
| zyx.mega.YersiniaPestis 3.1 | 81 | 26% | 90 |
| myl.micro.Troodon 1.10 | 47 | 15% | 64 |
| jok.PheonixM 0.1.2 | 36 | 12% | 41 |
| DBall.Anarchy 0.1 | 17 | 6% | 23 |
| ph.melee.ArcherME 0.3 | 11 | 4% | 15 |
| fullsail.TimbotNoPrediction 1.0 | 7 | 2% | 7 |
| jangs.ns51 1.0 | 2 | 1% | 2 |
| ap.Frederick 1.1 | 2 | 1% | 0 |

## Melee bench: F30

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.0 | 56.8 | 16 / 350 | 4.89 | 10.7% | 27401 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.9 | 14.2% | 76 |
| catcat20.Matcha 0.006 | 2.3 | 14.0% | 92 |
| stelo.PastFuture 2.3.2 | 2.8 | 13.6% | 55 |
| darkcanuck.B26354 1.06 | 3.0 | 13.4% | 81 |
| hadur117.nano.SanaroDAO 0.3 | 5.0 | 10.7% | 16 |
| intruder.PrairieWolf 2.61 | 6.4 | 8.8% | 17 |
| ntc.Opposite 1.5 | 7.5 | 8.0% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 7.9 | 7.6% | 5 |
| tripphippy.Alice 1.1 | 8.2 | 7.3% | 7 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.4 | 57.5 | 1 / 35 | 2611 |
| 2 | 5 | 53.7 | 57.1 | 3 / 35 | 2680 |
| 3 | 5 | 52.8 | 54.6 | 2 / 35 | 2426 |
| 4 | 5 | 53.3 | 54.6 | 3 / 35 | 2649 |
| 5 | 5 | 54.7 | 59.0 | 0 / 35 | 2853 |
| 6 | 5 | 56.5 | 63.5 | 1 / 35 | 2754 |
| 7 | 5 | 54.2 | 57.5 | 0 / 35 | 2758 |
| 8 | 5 | 53.7 | 53.0 | 3 / 35 | 3131 |
| 9 | 5 | 53.5 | 53.7 | 1 / 35 | 2944 |
| 10 | 5 | 54.3 | 57.1 | 2 / 35 | 2595 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 22 | 9% |
| darkcanuck.B26354 1.06 | 18 | 22% |
| oog.melee.Capulet 1.2 | 16 | 19% |
| stelo.PastFuture 2.3.2 | 12 | 33% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 33% |
| tripphippy.Alice 1.1 | 2 | 0% |
| intruder.PrairieWolf 2.61 | 1 | 0% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 335 of 350 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 68 | 20% | 72 |
| darkcanuck.B26354 1.06 | 64 | 19% | 67 |
| oog.melee.Capulet 1.2 | 62 | 19% | 66 |
| catcat20.Matcha 0.006 | 49 | 15% | 51 |
| intruder.PrairieWolf 2.61 | 33 | 10% | 33 |
| ntc.Opposite 1.5 | 23 | 7% | 23 |
| tripphippy.Alice 1.1 | 17 | 5% | 20 |
| fowl3628800.LightningBolt 2.6.0 | 16 | 5% | 15 |
| GarmBox.Anger 1.0 | 3 | 1% | 3 |

## Melee bench: F31

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.7 | 57.4 | 17 / 350 | 4.83 | 10.6% | 24079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.5% | 189 |
| gh.mini.Griezel 0.2 | 2.4 | 13.8% | 84 |
| d414.nano.Quantum 1.0.0 | 3.4 | 11.9% | 26 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 11.9% | 19 |
| hadur117.nano.SanaroDAO 0.3 | 4.9 | 10.6% | 17 |
| gh.nano.Grofvuil 0.2 | 5.6 | 9.5% | 8 |
| fm.mammillarias 1.3 | 7.7 | 6.6% | 1 |
| timmit.nano.TimDog 0.33 | 7.8 | 6.7% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.4% | 2 |
| tlp.ThreeLeggedPig 1 | 9.5 | 5.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 53.2 | 56.2 | 1 / 35 | 2333 |
| 2 | 5 | 53.4 | 55.2 | 3 / 35 | 2199 |
| 3 | 6 | 52.2 | 53.7 | 1 / 35 | 2493 |
| 4 | 6 | 51.6 | 52.1 | 3 / 35 | 2299 |
| 5 | 5 | 53.3 | 55.6 | 2 / 35 | 2442 |
| 6 | 5 | 53.0 | 55.9 | 1 / 35 | 2338 |
| 7 | 5 | 54.8 | 60.0 | 2 / 35 | 2458 |
| 8 | 3 | 57.1 | 67.6 | 2 / 35 | 2501 |
| 9 | 5 | 52.6 | 55.9 | 1 / 35 | 2270 |
| 10 | 5 | 56.0 | 62.2 | 1 / 35 | 2746 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 42 | 24% |
| gh.mini.Griezel 0.2 | 30 | 10% |
| d414.nano.Quantum 1.0.0 | 9 | 22% |
| spinnercat.micro.Tyger 0.1 | 4 | 25% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |
| fm.mammillarias 1.3 | 1 | 0% |

Hadur died in 333 of 350 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 73 | 22% | 79 |
| abc.Shadow 3.84i | 72 | 22% | 77 |
| spinnercat.micro.Tyger 0.1 | 65 | 20% | 66 |
| d414.nano.Quantum 1.0.0 | 54 | 16% | 58 |
| gh.nano.Grofvuil 0.2 | 24 | 7% | 25 |
| fm.mammillarias 1.3 | 19 | 6% | 19 |
| timmit.nano.TimDog 0.33 | 15 | 5% | 16 |
| Gecko.ultimateGeckoBot 1.0 | 8 | 2% | 8 |
| tlp.ThreeLeggedPig 1 | 3 | 1% | 2 |

## Melee bench: F32

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 75.6 | 113 / 350 | 3.19 | 14.5% | 32626 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.3 | 15.9% | 123 |
| hadur117.nano.SanaroDAO 0.3 | 1.8 | 14.5% | 113 |
| apc.botM 3.0 | 3.1 | 12.2% | 41 |
| lxx.ConceptA 0.8 | 4.3 | 11.0% | 11 |
| vjik.UnViolation 1.1 | 5.0 | 10.3% | 20 |
| bayen.UbaMicro 1.4 | 5.6 | 9.4% | 14 |
| panzer.Panzer 0.2 | 7.4 | 7.8% | 4 |
| yk.JahMicro 1.0 | 8.2 | 6.9% | 12 |
| conscience.Electron 1.3g | 8.7 | 6.5% | 1 |
| donjezza.Jezza 1.0 | 9.6 | 5.4% | 11 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 81.0 | 10 / 35 | 3341 |
| 2 | 2 | 59.7 | 70.8 | 10 / 35 | 3180 |
| 3 | 2 | 61.3 | 75.6 | 12 / 35 | 3196 |
| 4 | 1 | 62.9 | 81.9 | 12 / 35 | 3056 |
| 5 | 1 | 61.6 | 74.0 | 13 / 35 | 3610 |
| 6 | 2 | 62.1 | 75.9 | 12 / 35 | 3391 |
| 7 | 3 | 56.9 | 63.2 | 9 / 35 | 2923 |
| 8 | 1 | 63.9 | 82.2 | 14 / 35 | 3555 |
| 9 | 2 | 62.0 | 76.8 | 8 / 35 | 3421 |
| 10 | 2 | 61.0 | 74.9 | 13 / 35 | 2953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 85 | 44% |
| apc.botM 3.0 | 36 | 72% |
| lxx.ConceptA 0.8 | 23 | 74% |
| vjik.UnViolation 1.1 | 23 | 65% |
| donjezza.Jezza 1.0 | 9 | 44% |
| bayen.UbaMicro 1.4 | 8 | 63% |
| panzer.Panzer 0.2 | 5 | 100% |
| yk.JahMicro 1.0 | 4 | 25% |
| conscience.Electron 1.3g | 3 | 67% |

Hadur died in 240 of 350 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 86 | 36% | 121 |
| lxx.ConceptA 0.8 | 47 | 20% | 57 |
| apc.botM 3.0 | 27 | 11% | 56 |
| vjik.UnViolation 1.1 | 21 | 9% | 43 |
| bayen.UbaMicro 1.4 | 20 | 8% | 25 |
| conscience.Electron 1.3g | 12 | 5% | 14 |
| panzer.Panzer 0.2 | 12 | 5% | 14 |
| donjezza.Jezza 1.0 | 9 | 4% | 12 |
| yk.JahMicro 1.0 | 6 | 3% | 7 |

## Melee bench: F33

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 70.1 | 70 / 350 | 3.69 | 13.9% | 35649 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.5% | 133 |
| hadur117.nano.SanaroDAO 0.3 | 2.2 | 13.9% | 70 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.4% | 51 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.3% | 39 |
| labg.Cataclysm 2.05 | 4.8 | 10.8% | 41 |
| baal.nano.N 1.42 | 6.2 | 9.0% | 4 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.5% | 9 |
| zyx.micro.Ant 1.1 | 8.4 | 5.8% | 1 |
| sanja.First 0.1 | 9.2 | 5.2% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.4 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 76.2 | 10 / 35 | 3583 |
| 2 | 3 | 59.5 | 67.0 | 4 / 35 | 3480 |
| 3 | 2 | 60.7 | 69.8 | 6 / 35 | 3514 |
| 4 | 2 | 58.4 | 63.2 | 6 / 35 | 3462 |
| 5 | 2 | 63.2 | 77.1 | 7 / 35 | 3747 |
| 6 | 2 | 59.4 | 65.4 | 9 / 35 | 3302 |
| 7 | 2 | 62.5 | 72.4 | 10 / 35 | 3643 |
| 8 | 3 | 61.1 | 68.3 | 6 / 35 | 4039 |
| 9 | 2 | 60.9 | 70.8 | 4 / 35 | 3453 |
| 10 | 2 | 60.9 | 70.8 | 8 / 35 | 3426 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 64 | 48% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 42% |
| gre.svman4.Leonidas 1.3.2 | 19 | 58% |
| labg.Cataclysm 2.05 | 11 | 18% |
| baal.nano.N 1.42 | 7 | 86% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 33% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 282 of 350 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 105 | 37% | 138 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 57 | 20% | 75 |
| gre.svman4.Leonidas 1.3.2 | 38 | 13% | 42 |
| labg.Cataclysm 2.05 | 26 | 9% | 30 |
| baal.nano.N 1.42 | 18 | 6% | 24 |
| kinsen.melee.Angsaichmophobia 1.8c | 18 | 6% | 20 |
| zyx.micro.Ant 1.1 | 12 | 4% | 15 |
| sanja.First 0.1 | 5 | 2% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F34

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 69.7 | 19 / 350 | 3.73 | 13.1% | 35550 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 17.4% | 148 |
| kid.Gladiator .7.2 | 1.5 | 17.3% | 118 |
| hadur117.nano.SanaroDAO 0.3 | 3.3 | 13.1% | 19 |
| tcf.Reach 3 | 4.2 | 11.8% | 16 |
| jcs.Seth 1.8 | 4.5 | 11.8% | 39 |
| cli.Dancer 1.1 | 6.0 | 9.8% | 5 |
| ratosh.Wesco 1.4 | 7.0 | 7.6% | 5 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.4% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.0 | 70.2 | 2 / 35 | 3442 |
| 2 | 3 | 60.9 | 69.2 | 0 / 35 | 3660 |
| 3 | 3 | 61.7 | 71.1 | 4 / 35 | 3806 |
| 4 | 4 | 58.3 | 63.8 | 2 / 35 | 3303 |
| 5 | 3 | 59.7 | 67.6 | 0 / 35 | 3646 |
| 6 | 3 | 62.2 | 73.0 | 6 / 35 | 3590 |
| 7 | 3 | 60.6 | 67.9 | 2 / 35 | 3520 |
| 8 | 4 | 60.0 | 70.2 | 0 / 35 | 3135 |
| 9 | 3 | 60.7 | 71.7 | 2 / 35 | 3466 |
| 10 | 3 | 62.1 | 71.7 | 1 / 35 | 3982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 54 | 17% |
| kid.Gladiator .7.2 | 45 | 11% |
| jcs.Seth 1.8 | 20 | 15% |
| tcf.Reach 3 | 4 | 25% |
| cli.Dancer 1.1 | 2 | 0% |
| ratosh.Wesco 1.4 | 1 | 0% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 331 of 350 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 126 | 38% | 133 |
| kid.Gladiator .7.2 | 112 | 34% | 116 |
| jcs.Seth 1.8 | 48 | 15% | 52 |
| tcf.Reach 3 | 18 | 5% | 19 |
| ratosh.Wesco 1.4 | 12 | 4% | 13 |
| cli.Dancer 1.1 | 11 | 3% | 12 |
| amk.Punbot.Punbot 0.01 | 3 | 1% | 4 |
| sample.VelociRobot 1.0 | 1 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 67.7 | 8 / 350 | 3.91 | 12.1% | 26060 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 267 |
| gh.mini.Gruwel 0.9 | 2.4 | 13.5% | 44 |
| rz.HawkOnFire 0.1 | 3.5 | 12.4% | 14 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 12.0% | 14 |
| hadur117.nano.SanaroDAO 0.3 | 4.1 | 12.1% | 8 |
| wit.Chuliath 1.0 | 6.5 | 7.1% | 1 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 6.9% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 6.1% | 0 |
| dans.Cinnamon 1.2 | 9.4 | 4.5% | 0 |
| stelo.MyAgileRobot 0.2 | 9.4 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.8 | 61.9 | 0 / 35 | 2513 |
| 2 | 4 | 57.7 | 67.6 | 0 / 35 | 2626 |
| 3 | 4 | 59.8 | 72.1 | 1 / 35 | 2672 |
| 4 | 4 | 56.4 | 65.7 | 0 / 35 | 2429 |
| 5 | 4 | 57.8 | 68.3 | 0 / 35 | 2533 |
| 6 | 4 | 59.5 | 71.4 | 2 / 35 | 2724 |
| 7 | 4 | 57.8 | 68.6 | 1 / 35 | 2401 |
| 8 | 4 | 58.8 | 70.2 | 1 / 35 | 2580 |
| 9 | 4 | 56.6 | 61.6 | 2 / 35 | 2698 |
| 10 | 4 | 58.9 | 69.8 | 1 / 35 | 2884 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 71 | 0% |
| gh.mini.Gruwel 0.9 | 21 | 0% |
| rz.HawkOnFire 0.1 | 14 | 43% |
| dmh.robocode.robot.BlackDeath 9.2 | 2 | 50% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 342 of 350 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 139 | 41% | 137 |
| rz.HawkOnFire 0.1 | 68 | 20% | 72 |
| gh.mini.Gruwel 0.9 | 67 | 20% | 68 |
| dmh.robocode.robot.BlackDeath 9.2 | 47 | 14% | 51 |
| myl.nano.KomoriNinja 1.1 | 6 | 2% | 7 |
| wit.Chuliath 1.0 | 5 | 1% | 5 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 1% | 4 |
| dans.Cinnamon 1.2 | 3 | 1% | 3 |
| stelo.MyAgileRobot 0.2 | 3 | 1% | 3 |

## Melee bench: F36

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 72.1 | 88 / 350 | 3.51 | 14.4% | 36140 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroDAO 0.3 | 1.2 | 14.4% | 88 |
| alpha.RainingFire 1.0 | 2.5 | 12.7% | 67 |
| bzdp.Pansy 2.1 | 3.2 | 12.2% | 52 |
| mz.Cork 0.1 | 3.7 | 11.7% | 44 |
| bvh.micro.Freya 0.3 | 5.2 | 10.8% | 40 |
| bvh.mini.Fenrir 0.39 | 5.8 | 10.1% | 16 |
| m3thos.Eva02 0.7.1 | 6.4 | 10.1% | 23 |
| dl.BetterWalls 1.0 | 8.5 | 6.7% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 6.7% | 5 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.6% | 15 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.4 | 67.0 | 6 / 35 | 3449 |
| 2 | 1 | 61.2 | 73.7 | 8 / 35 | 3387 |
| 3 | 1 | 60.5 | 70.8 | 11 / 35 | 3409 |
| 4 | 1 | 63.7 | 77.1 | 13 / 35 | 3992 |
| 5 | 1 | 60.6 | 71.7 | 5 / 35 | 3595 |
| 6 | 1 | 61.4 | 70.8 | 6 / 35 | 4042 |
| 7 | 1 | 59.5 | 68.3 | 8 / 35 | 3395 |
| 8 | 2 | 61.7 | 74.9 | 7 / 35 | 3567 |
| 9 | 1 | 62.3 | 74.6 | 13 / 35 | 3733 |
| 10 | 1 | 61.4 | 72.1 | 11 / 35 | 3571 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 46 | 48% |
| mz.Cork 0.1 | 35 | 54% |
| alpha.RainingFire 1.0 | 32 | 13% |
| bvh.micro.Freya 0.3 | 24 | 50% |
| m3thos.Eva02 0.7.1 | 24 | 58% |
| bvh.mini.Fenrir 0.39 | 13 | 62% |
| sample.MyFirstRobot 1.0 | 7 | 43% |
| squidM.TentalceMeleeNano 1.1 | 4 | 75% |
| dl.BetterWalls 1.0 | 3 | 100% |

Hadur died in 265 of 350 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 52 | 20% | 81 |
| alpha.RainingFire 1.0 | 51 | 19% | 51 |
| bvh.micro.Freya 0.3 | 37 | 14% | 45 |
| mz.Cork 0.1 | 35 | 13% | 53 |
| bvh.mini.Fenrir 0.39 | 31 | 12% | 31 |
| m3thos.Eva02 0.7.1 | 28 | 11% | 44 |
| sample.MyFirstRobot 1.0 | 11 | 4% | 15 |
| squidM.TentalceMeleeNano 1.1 | 10 | 4% | 15 |
| dl.BetterWalls 1.0 | 8 | 3% | 14 |
2 death(s) with no robot to name.

## Melee bench: F37

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 76.4 | 114 / 350 | 3.12 | 15.1% | 42373 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroDAO 0.3 | 1.0 | 15.1% | 114 |
| germ.TheMind .2 | 2.9 | 11.4% | 56 |
| EBBU.Sim2 1.02 | 3.3 | 10.7% | 25 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.6 | 11.1% | 42 |
| stelo.UntouchableNano 1.3 | 5.5 | 9.6% | 31 |
| agrach.Dalek 1.0 | 5.9 | 9.5% | 25 |
| lmk.ACPFinal 0.1 | 7.2 | 8.8% | 18 |
| mb.Beast 0.1 | 7.5 | 8.5% | 22 |
| skm.Ryubot 1.0 | 8.8 | 7.7% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 7.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 82.2 | 10 / 35 | 4023 |
| 2 | 1 | 60.2 | 72.7 | 10 / 35 | 4029 |
| 3 | 1 | 63.1 | 80.0 | 12 / 35 | 4479 |
| 4 | 1 | 61.4 | 76.8 | 13 / 35 | 3782 |
| 5 | 1 | 63.6 | 82.9 | 14 / 35 | 4247 |
| 6 | 1 | 60.5 | 70.2 | 11 / 35 | 4542 |
| 7 | 1 | 63.1 | 79.4 | 14 / 35 | 4261 |
| 8 | 1 | 61.6 | 75.9 | 9 / 35 | 4216 |
| 9 | 1 | 62.7 | 78.7 | 13 / 35 | 4305 |
| 10 | 1 | 58.7 | 65.7 | 8 / 35 | 4489 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 33 | 52% |
| EBBU.Sim2 1.02 | 30 | 57% |
| stelo.UntouchableNano 1.3 | 29 | 72% |
| com.syncleus.robocode.Dreadnaught 0.1 | 24 | 33% |
| agrach.Dalek 1.0 | 21 | 76% |
| lmk.ACPFinal 0.1 | 16 | 69% |
| mb.Beast 0.1 | 15 | 87% |
| skm.Ryubot 1.0 | 13 | 77% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 33% |

Hadur died in 239 of 350 rounds, at a mean tick of 533. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 58 | 24% | 69 |
| germ.TheMind .2 | 38 | 16% | 55 |
| EBBU.Sim2 1.02 | 29 | 12% | 42 |
| mn.nano.perceptual.Impact 1.3.0 | 26 | 11% | 27 |
| lmk.ACPFinal 0.1 | 22 | 9% | 28 |
| agrach.Dalek 1.0 | 21 | 9% | 45 |
| stelo.UntouchableNano 1.3 | 19 | 8% | 37 |
| mb.Beast 0.1 | 15 | 6% | 28 |
| skm.Ryubot 1.0 | 10 | 4% | 16 |
1 death(s) with no robot to name.

## Melee bench: F38

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 65.1 | 33 / 350 | 4.14 | 12.0% | 28490 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.8% | 152 |
| bvh.mini.Freya 0.55 | 2.3 | 13.5% | 51 |
| hadur117.nano.SanaroDAO 0.3 | 3.9 | 12.0% | 33 |
| cs.Wren 1.0 | 4.3 | 11.5% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.8 | 11.0% | 24 |
| bts.mega.Gnarly 1.4 | 5.0 | 11.1% | 51 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.3% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.3% | 4 |
| matt.UnderDark3 2.4.34 | 9.4 | 4.2% | 1 |
| bzdp.BoxCar 2.0 | 9.6 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.9 | 67.0 | 4 / 35 | 2870 |
| 2 | 3 | 59.5 | 70.5 | 6 / 35 | 3041 |
| 3 | 5 | 55.9 | 61.0 | 2 / 35 | 2992 |
| 4 | 4 | 57.1 | 65.4 | 3 / 35 | 2912 |
| 5 | 4 | 54.4 | 58.7 | 0 / 35 | 2664 |
| 6 | 3 | 58.8 | 71.4 | 3 / 35 | 2870 |
| 7 | 2 | 59.1 | 70.8 | 3 / 35 | 3031 |
| 8 | 3 | 58.6 | 67.3 | 5 / 35 | 2918 |
| 9 | 5 | 56.4 | 62.5 | 4 / 35 | 2449 |
| 10 | 6 | 54.6 | 56.5 | 3 / 35 | 2743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 51 | 35% |
| bvh.mini.Freya 0.55 | 18 | 0% |
| cs.Wren 1.0 | 17 | 29% |
| bts.mega.Gnarly 1.4 | 15 | 27% |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 11% |
| kdf.KoulDestroyer 1.0 | 6 | 67% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 318 of 350 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 75 | 24% | 94 |
| bvh.mini.Freya 0.55 | 71 | 22% | 68 |
| cs.Wren 1.0 | 50 | 16% | 54 |
| bts.mega.Gnarly 1.4 | 46 | 14% | 54 |
| davidalves.net.DuelistNanoMelee 1.01 | 38 | 12% | 40 |
| kdf.KoulDestroyer 1.0 | 23 | 7% | 25 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 2% | 6 |
| matt.UnderDark3 2.4.34 | 5 | 2% | 5 |
| bzdp.BoxCar 2.0 | 4 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F39

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 63.8 | 42 / 350 | 4.26 | 12.0% | 30556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.0 | 15.4% | 76 |
| az.Ololobot 0.2.4 | 2.4 | 13.3% | 114 |
| hadur117.nano.SanaroDAO 0.3 | 3.3 | 12.0% | 42 |
| catcat20.Lambda 0.024 | 3.8 | 11.3% | 44 |
| stelo.SoRobotNanoMelee 1.2 | 4.9 | 10.5% | 46 |
| apollokidd.ApolloKidd 0.9 | 6.4 | 9.0% | 7 |
| winamp32.micro.MicroMacro 1.0 | 7.1 | 8.6% | 16 |
| gimp.GimpBot 0.1 | 7.2 | 8.4% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.4% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.2 | 67.0 | 4 / 35 | 2880 |
| 2 | 3 | 58.5 | 66.7 | 5 / 35 | 3499 |
| 3 | 5 | 53.5 | 58.4 | 4 / 35 | 2666 |
| 4 | 4 | 54.5 | 58.4 | 2 / 35 | 3258 |
| 5 | 5 | 53.9 | 57.8 | 4 / 35 | 2913 |
| 6 | 2 | 57.8 | 68.6 | 5 / 35 | 3160 |
| 7 | 3 | 56.8 | 63.8 | 5 / 35 | 3039 |
| 8 | 3 | 55.9 | 63.2 | 5 / 35 | 3129 |
| 9 | 2 | 59.2 | 73.0 | 2 / 35 | 3070 |
| 10 | 3 | 55.7 | 61.0 | 6 / 35 | 2942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 33 | 3% |
| bvh.fry.Freya 0.82 | 33 | 42% |
| catcat20.Lambda 0.024 | 26 | 46% |
| stelo.SoRobotNanoMelee 1.2 | 24 | 25% |
| winamp32.micro.MicroMacro 1.0 | 9 | 56% |
| gimp.GimpBot 0.1 | 4 | 50% |
| apollokidd.ApolloKidd 0.9 | 2 | 50% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 0% |

Hadur died in 308 of 350 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 83 | 27% | 95 |
| az.Ololobot 0.2.4 | 58 | 19% | 58 |
| stelo.SoRobotNanoMelee 1.2 | 50 | 16% | 53 |
| catcat20.Lambda 0.024 | 37 | 12% | 47 |
| apollokidd.ApolloKidd 0.9 | 29 | 9% | 31 |
| winamp32.micro.MicroMacro 1.0 | 20 | 6% | 25 |
| gimp.GimpBot 0.1 | 12 | 4% | 18 |
| dcs.Eater_of_Worlds 1.1.3-A | 10 | 3% | 14 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9 | 3% | 9 |

## Melee bench: F41

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 70.4 | 57 / 350 | 3.66 | 13.3% | 30331 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.1% | 173 |
| hadur117.nano.SanaroDAO 0.3 | 2.9 | 13.3% | 57 |
| ary.Swarm 1.1 | 3.1 | 13.2% | 31 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 13.0% | 35 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.6% | 38 |
| shrub.Silver v048 | 6.2 | 9.0% | 7 |
| zyx.nano.Ant 1.1 | 6.9 | 8.1% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 6.2% | 5 |
| stelo.Mirror 1.1 | 8.6 | 5.6% | 4 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.9 | 66.0 | 2 / 35 | 2782 |
| 2 | 2 | 62.3 | 76.8 | 7 / 35 | 3101 |
| 3 | 4 | 60.2 | 69.2 | 6 / 35 | 2995 |
| 4 | 2 | 59.5 | 67.6 | 8 / 35 | 3056 |
| 5 | 3 | 62.2 | 75.2 | 7 / 35 | 3296 |
| 6 | 2 | 61.1 | 73.3 | 6 / 35 | 3166 |
| 7 | 2 | 59.9 | 72.1 | 4 / 35 | 2940 |
| 8 | 3 | 59.0 | 68.3 | 5 / 35 | 2971 |
| 9 | 2 | 61.8 | 73.0 | 9 / 35 | 3175 |
| 10 | 5 | 57.1 | 62.5 | 3 / 35 | 2849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 75 | 7% |
| lessonz.robocode.Oz 0.5.0 | 31 | 87% |
| simonton.nano.MeleeSeed 1.8 | 20 | 40% |
| ary.Swarm 1.1 | 16 | 69% |
| jsal.Jsalbot 1.0 | 6 | 50% |
| stelo.Mirror 1.1 | 3 | 33% |
| shrub.Silver v048 | 2 | 50% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 293 of 350 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 107 | 37% | 112 |
| ary.Swarm 1.1 | 63 | 22% | 78 |
| lessonz.robocode.Oz 0.5.0 | 42 | 14% | 61 |
| simonton.nano.MeleeSeed 1.8 | 40 | 14% | 48 |
| shrub.Silver v048 | 15 | 5% | 18 |
| zyx.nano.Ant 1.1 | 14 | 5% | 15 |
| stelo.Mirror 1.1 | 6 | 2% | 7 |
| jsal.Jsalbot 1.0 | 4 | 1% | 8 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |

## Melee bench: F42

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 68.6 | 36 / 350 | 3.83 | 13.1% | 35339 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.4% | 181 |
| ara.Shera 0.88 | 2.6 | 14.2% | 69 |
| maribo.mini.MiniQuester 0.1 | 2.8 | 14.7% | 54 |
| hadur117.nano.SanaroDAO 0.3 | 3.6 | 13.1% | 36 |
| amz.NanoClone 1.41 | 5.0 | 9.8% | 5 |
| dsw.StaticD 1.0 | 6.5 | 7.4% | 4 |
| maribo.IotaCT 1.1 | 6.5 | 7.5% | 2 |
| stelo.MirrorMicro 1.0 | 8.4 | 5.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.2 | 5.0% | 0 |
| mme.NikeEnhanced 2.0 | 9.4 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 68.9 | 6 / 35 | 3467 |
| 2 | 4 | 59.5 | 66.7 | 5 / 35 | 3506 |
| 3 | 3 | 59.5 | 67.0 | 4 / 35 | 3680 |
| 4 | 4 | 57.6 | 64.1 | 1 / 35 | 3261 |
| 5 | 4 | 56.5 | 64.1 | 2 / 35 | 2814 |
| 6 | 4 | 60.3 | 69.8 | 5 / 35 | 3596 |
| 7 | 3 | 60.5 | 69.2 | 4 / 35 | 3794 |
| 8 | 3 | 61.1 | 71.4 | 4 / 35 | 3915 |
| 9 | 4 | 60.6 | 71.1 | 3 / 35 | 3816 |
| 10 | 4 | 60.5 | 73.3 | 2 / 35 | 3490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 75 | 16% |
| maribo.mini.MiniQuester 0.1 | 29 | 41% |
| ara.Shera 0.88 | 25 | 40% |
| dsw.StaticD 1.0 | 2 | 100% |
| amz.NanoClone 1.41 | 2 | 0% |
| maribo.IotaCT 1.1 | 1 | 0% |

Hadur died in 314 of 350 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 121 | 39% | 133 |
| ara.Shera 0.88 | 72 | 23% | 82 |
| maribo.mini.MiniQuester 0.1 | 70 | 22% | 83 |
| amz.NanoClone 1.41 | 22 | 7% | 22 |
| maribo.IotaCT 1.1 | 11 | 4% | 11 |
| dsw.StaticD 1.0 | 7 | 2% | 8 |
| mme.NikeEnhanced 2.0 | 6 | 2% | 6 |
| stelo.MirrorMicro 1.0 | 3 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 61.1 | 3 / 350 | 4.50 | 11.1% | 26330 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.9% | 285 |
| brainfade.melee.Dusk 0.44 | 2.4 | 13.2% | 33 |
| dummy.micro.Sparrow 2.5 | 2.7 | 12.7% | 18 |
| hadur117.nano.SanaroDAO 0.3 | 4.4 | 11.1% | 3 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.0% | 6 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 10.1% | 5 |
| jab.DiamondStealer 5 | 7.4 | 7.5% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.6% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 56.0 | 58.4 | 1 / 35 | 2365 |
| 2 | 3 | 59.3 | 66.7 | 0 / 35 | 2808 |
| 3 | 5 | 58.8 | 65.1 | 0 / 35 | 2643 |
| 4 | 4 | 57.7 | 61.0 | 0 / 35 | 2818 |
| 5 | 5 | 55.4 | 58.4 | 0 / 35 | 2165 |
| 6 | 4 | 57.7 | 62.2 | 0 / 35 | 2790 |
| 7 | 4 | 57.1 | 59.7 | 1 / 35 | 3001 |
| 8 | 4 | 55.7 | 57.1 | 0 / 35 | 2638 |
| 9 | 4 | 57.5 | 61.6 | 1 / 35 | 2604 |
| 10 | 5 | 56.7 | 61.3 | 0 / 35 | 2498 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 58 | 0% |
| brainfade.melee.Dusk 0.44 | 9 | 0% |
| dummy.micro.Sparrow 2.5 | 3 | 33% |
| Krabb.akim2.Akim2 1.1b | 3 | 0% |
| jab.DiamondStealer 5 | 1 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 347 of 350 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 148 | 43% | 148 |
| dummy.micro.Sparrow 2.5 | 54 | 16% | 55 |
| brainfade.melee.Dusk 0.44 | 44 | 13% | 44 |
| wcsv.melee.EngineerMelee 0.1 | 36 | 10% | 36 |
| Krabb.akim2.Akim2 1.1b | 31 | 9% | 31 |
| mz.NanoGod 2.02 | 24 | 7% | 24 |
| jab.DiamondStealer 5 | 8 | 2% | 9 |
| cvt.Firsty 1.0 | 2 | 1% | 3 |

## Melee bench: F44

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 66.7 | 41 / 350 | 4.00 | 13.0% | 34656 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.1 | 17.9% | 187 |
| tzu.TheArtOfWar 1.2 | 2.0 | 15.4% | 81 |
| hadur117.nano.SanaroDAO 0.3 | 3.1 | 13.0% | 41 |
| jwirde.Gort 2.0 | 4.6 | 10.6% | 18 |
| wompi.Quokka 1.6 | 4.7 | 10.5% | 13 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 9.5% | 4 |
| disan.Chair 2.2.0 | 7.5 | 6.9% | 3 |
| stf.PanzerGeneral 0.1 | 7.6 | 7.1% | 2 |
| sample.Crazy 1.0 | 9.1 | 4.9% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 66.0 | 4 / 35 | 3656 |
| 2 | 4 | 55.6 | 57.8 | 2 / 35 | 3098 |
| 3 | 3 | 61.8 | 72.4 | 4 / 35 | 3748 |
| 4 | 2 | 64.1 | 77.8 | 8 / 35 | 4086 |
| 5 | 4 | 54.7 | 55.2 | 2 / 35 | 3113 |
| 6 | 3 | 61.8 | 73.0 | 6 / 35 | 3569 |
| 7 | 3 | 56.7 | 61.6 | 3 / 35 | 2839 |
| 8 | 3 | 59.5 | 67.3 | 2 / 35 | 3456 |
| 9 | 3 | 59.7 | 67.0 | 4 / 35 | 3663 |
| 10 | 3 | 59.8 | 68.6 | 6 / 35 | 3428 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 68 | 13% |
| tzu.TheArtOfWar 1.2 | 28 | 61% |
| jwirde.Gort 2.0 | 11 | 55% |
| wompi.Quokka 1.6 | 8 | 63% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 33% |
| disan.Chair 2.2.0 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 50% |

Hadur died in 309 of 350 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 129 | 42% | 143 |
| tzu.TheArtOfWar 1.2 | 71 | 23% | 87 |
| wompi.Quokka 1.6 | 32 | 10% | 33 |
| jwirde.Gort 2.0 | 28 | 9% | 32 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 27 | 9% | 29 |
| stf.PanzerGeneral 0.1 | 9 | 3% | 9 |
| disan.Chair 2.2.0 | 5 | 2% | 7 |
| amk.jointstrike.JointStrike 0.2 | 5 | 2% | 6 |
| sample.Crazy 1.0 | 3 | 1% | 4 |

## Melee bench: F45

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 70.1 | 31 / 350 | 3.69 | 14.0% | 37536 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 1.8 | 13.5% | 203 |
| hadur117.nano.SanaroDAO 0.3 | 1.9 | 14.0% | 31 |
| jje.BagPuss 1.2 | 3.2 | 12.4% | 25 |
| sul.Lunar 1.1 | 4.2 | 11.3% | 46 |
| myl.nano.Graviton 1.10 | 4.2 | 11.2% | 14 |
| hvilela.HVilela 0.9 | 6.2 | 9.5% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.1 | 8.7% | 5 |
| fm.claire 1.7 | 7.5 | 8.1% | 1 |
| wit.Deep7 2.0 | 9.1 | 6.4% | 22 |
| abud.ThirdRobo 1.0 | 9.8 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 74.3 | 4 / 35 | 3891 |
| 2 | 1 | 61.4 | 72.4 | 3 / 35 | 3985 |
| 3 | 2 | 59.4 | 67.3 | 3 / 35 | 3500 |
| 4 | 1 | 63.1 | 78.4 | 4 / 35 | 3997 |
| 5 | 3 | 57.1 | 62.9 | 2 / 35 | 3355 |
| 6 | 2 | 60.4 | 67.9 | 5 / 35 | 4094 |
| 7 | 5 | 56.0 | 60.3 | 4 / 35 | 3222 |
| 8 | 1 | 62.1 | 75.9 | 2 / 35 | 4235 |
| 9 | 1 | 61.7 | 74.6 | 1 / 35 | 3929 |
| 10 | 2 | 58.4 | 66.7 | 3 / 35 | 3328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 84 | 6% |
| jje.BagPuss 1.2 | 19 | 63% |
| sul.Lunar 1.1 | 19 | 0% |
| myl.nano.Graviton 1.10 | 10 | 70% |
| wit.Deep7 2.0 | 9 | 33% |
| pez.mini.ChironexFleckeri 0.5 | 5 | 40% |
| hvilela.HVilela 0.9 | 2 | 100% |
| fm.claire 1.7 | 1 | 0% |

Hadur died in 319 of 350 rounds, at a mean tick of 1288. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 87 | 27% | 0 |
| jje.BagPuss 1.2 | 56 | 18% | 94 |
| sul.Lunar 1.1 | 48 | 15% | 70 |
| myl.nano.Graviton 1.10 | 47 | 15% | 63 |
| fm.claire 1.7 | 24 | 8% | 30 |
| hvilela.HVilela 0.9 | 19 | 6% | 30 |
| wit.Deep7 2.0 | 19 | 6% | 27 |
| pez.mini.ChironexFleckeri 0.5 | 15 | 5% | 25 |
| abud.ThirdRobo 1.0 | 4 | 1% | 6 |

## Melee bench: F46

hadur117.nano.SanaroDAO 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 70.2 | 16 / 350 | 3.68 | 12.6% | 29026 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.1 | 18.0% | 160 |
| rsalesc.melee.Medina 0.4.5 | 1.9 | 16.7% | 135 |
| hadur117.nano.SanaroDAO 0.3 | 3.0 | 12.6% | 16 |
| mz.MicroSheep 1.0 | 4.2 | 11.0% | 17 |
| cx.Princess 1.0 | 5.1 | 10.2% | 19 |
| sadoner.killer 0.2 | 5.7 | 9.5% | 1 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.2% | 3 |
| jeremyreeder.collective.Prophet 5 | 7.9 | 6.2% | 0 |
| kurios.DOSexe .9a | 9.1 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 72.1 | 3 / 35 | 2832 |
| 2 | 3 | 58.8 | 70.2 | 1 / 35 | 2920 |
| 3 | 3 | 57.9 | 67.9 | 2 / 35 | 2630 |
| 4 | 3 | 60.0 | 72.7 | 1 / 35 | 3151 |
| 5 | 3 | 60.9 | 74.9 | 1 / 35 | 3266 |
| 6 | 3 | 58.2 | 68.3 | 1 / 35 | 2871 |
| 7 | 3 | 58.4 | 67.6 | 2 / 35 | 2990 |
| 8 | 3 | 58.9 | 72.1 | 2 / 35 | 2549 |
| 9 | 3 | 58.7 | 67.9 | 2 / 35 | 3097 |
| 10 | 3 | 57.8 | 68.6 | 1 / 35 | 2720 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 69 | 7% |
| rsalesc.melee.Medina 0.4.5 | 42 | 17% |
| mz.MicroSheep 1.0 | 10 | 0% |
| cx.Princess 1.0 | 7 | 29% |
| sadoner.killer 0.2 | 2 | 50% |
| arthord.NanoSatanMelee Beta | 1 | 0% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 334 of 350 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 149 | 45% | 157 |
| rsalesc.melee.Medina 0.4.5 | 83 | 25% | 90 |
| mz.MicroSheep 1.0 | 36 | 11% | 35 |
| cx.Princess 1.0 | 26 | 8% | 26 |
| sadoner.killer 0.2 | 19 | 6% | 20 |
| jeremyreeder.collective.Prophet 5 | 11 | 3% | 11 |
| arthord.NanoSatanMelee Beta | 8 | 2% | 8 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |

