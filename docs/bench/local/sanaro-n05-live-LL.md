# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 75.6 | 50 / 350 | 3.20 | 14.1% | 37367 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 230 |
| hadur117.nano.SanaroLL 0.2 | 2.0 | 14.1% | 50 |
| sgp.JollyNinja 3.53 | 3.8 | 11.6% | 36 |
| mz.MicroGodMelee 1 | 4.0 | 11.4% | 13 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.6 | 11.2% | 11 |
| lorneswork.Predator 1.0 | 5.6 | 10.2% | 6 |
| adt.Ar2 1.0 | 7.0 | 7.6% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.6% | 1 |
| skm.butterfly 1.0 | 8.9 | 4.7% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 74.3 | 3 / 35 | 3822 |
| 2 | 2 | 63.1 | 80.0 | 5 / 35 | 3775 |
| 3 | 2 | 62.0 | 76.2 | 5 / 35 | 3511 |
| 4 | 2 | 61.1 | 73.0 | 4 / 35 | 3778 |
| 5 | 2 | 63.2 | 80.0 | 5 / 35 | 3744 |
| 6 | 2 | 63.6 | 81.3 | 5 / 35 | 3841 |
| 7 | 2 | 62.2 | 76.5 | 4 / 35 | 3856 |
| 8 | 2 | 58.3 | 65.7 | 3 / 35 | 3701 |
| 9 | 2 | 62.7 | 74.3 | 9 / 35 | 3824 |
| 10 | 2 | 61.8 | 74.6 | 7 / 35 | 3515 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 145 | 15% |
| sgp.JollyNinja 3.53 | 20 | 50% |
| mz.MicroGodMelee 1 | 17 | 71% |
| lorneswork.Predator 1.0 | 7 | 57% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 0% |
| skm.butterfly 1.0 | 1 | 0% |
| adt.Ar2 1.0 | 1 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 300 of 350 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 157 | 52% | 180 |
| sgp.JollyNinja 3.53 | 38 | 13% | 44 |
| lorneswork.Predator 1.0 | 34 | 11% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 10% | 29 |
| mz.MicroGodMelee 1 | 19 | 6% | 31 |
| adt.Ar2 1.0 | 16 | 5% | 17 |
| skm.butterfly 1.0 | 3 | 1% | 3 |
| mym.EdgeStalker 1.0 | 2 | 1% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 1 |

## Melee bench: F02

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 66.7 | 52 / 350 | 4.00 | 13.6% | 39851 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.4 | 15.2% | 89 |
| pulsar.PulsarMax 0.8.9 | 1.7 | 15.0% | 110 |
| hadur117.nano.SanaroLL 0.2 | 2.9 | 13.6% | 52 |
| lrem.micro.SpikeSoldier 0.4 | 4.4 | 10.9% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.0% | 25 |
| sch.Simone 0.3d | 6.9 | 8.2% | 33 |
| Noran.BitchingElk 0.054 | 7.2 | 7.8% | 19 |
| fnc.bandit.Bandit 5.2.0 | 7.6 | 7.9% | 6 |
| stelo.PatternRobot 1.0 | 8.2 | 6.7% | 9 |
| fullsail.SweetTea 1.1 | 9.9 | 4.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.3 | 64.1 | 4 / 35 | 3711 |
| 2 | 3 | 60.6 | 66.7 | 8 / 35 | 3925 |
| 3 | 3 | 59.5 | 67.3 | 4 / 35 | 3991 |
| 4 | 3 | 57.0 | 59.0 | 5 / 35 | 3784 |
| 5 | 3 | 60.9 | 69.2 | 7 / 35 | 3947 |
| 6 | 3 | 59.7 | 67.3 | 3 / 35 | 3966 |
| 7 | 3 | 60.1 | 67.9 | 3 / 35 | 4174 |
| 8 | 3 | 59.8 | 66.3 | 7 / 35 | 3802 |
| 9 | 3 | 60.2 | 66.7 | 4 / 35 | 4253 |
| 10 | 2 | 62.3 | 72.4 | 7 / 35 | 4298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 47 | 23% |
| pulsar.PulsarMax 0.8.9 | 38 | 32% |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 56% |
| sch.Simone 0.3d | 16 | 38% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 100% |
| stelo.PatternRobot 1.0 | 6 | 67% |
| Noran.BitchingElk 0.054 | 6 | 0% |
| fnc.bandit.Bandit 5.2.0 | 4 | 75% |

Hadur died in 299 of 350 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 90 | 30% | 106 |
| pulsar.PulsarMax 0.8.9 | 68 | 23% | 75 |
| lrem.micro.SpikeSoldier 0.4 | 33 | 11% | 39 |
| com.cohesiva.robocode.ManOwaR 1.0 | 32 | 11% | 42 |
| stelo.PatternRobot 1.0 | 25 | 8% | 29 |
| sch.Simone 0.3d | 23 | 8% | 29 |
| fnc.bandit.Bandit 5.2.0 | 14 | 5% | 17 |
| Noran.BitchingElk 0.054 | 10 | 3% | 9 |
| fullsail.SweetTea 1.1 | 3 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 79.6 | 74 / 350 | 2.83 | 15.1% | 40801 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 2.1 | 15.1% | 92 |
| hadur117.nano.SanaroLL 0.2 | 2.1 | 15.1% | 74 |
| kawigi.nano.Lib 1.0 | 2.2 | 14.9% | 102 |
| vuen.Cake 2.51 | 3.6 | 13.1% | 69 |
| urdos.URDOS 1.3 | 5.0 | 10.3% | 10 |
| adt.Ar1 2.1 | 6.6 | 7.7% | 1 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.4 | 6.9% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.4% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.2 | 72.4 | 3 / 35 | 4014 |
| 2 | 2 | 63.0 | 80.6 | 5 / 35 | 4272 |
| 3 | 1 | 63.9 | 82.2 | 9 / 35 | 4090 |
| 4 | 3 | 63.6 | 81.9 | 7 / 35 | 3956 |
| 5 | 3 | 60.9 | 74.3 | 8 / 35 | 3681 |
| 6 | 1 | 65.9 | 88.9 | 13 / 35 | 4446 |
| 7 | 2 | 62.5 | 77.8 | 8 / 35 | 4169 |
| 8 | 1 | 63.0 | 79.4 | 7 / 35 | 4073 |
| 9 | 4 | 60.9 | 73.3 | 6 / 35 | 3718 |
| 10 | 1 | 65.1 | 85.4 | 8 / 35 | 4382 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 62 | 47% |
| vuen.Cake 2.51 | 62 | 50% |
| kawigi.nano.Lib 1.0 | 52 | 2% |
| urdos.URDOS 1.3 | 10 | 80% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 50% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |
| adt.Ar1 2.1 | 1 | 0% |

Hadur died in 279 of 350 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 101 | 36% | 103 |
| radnor.DoctorBob 1.42 | 84 | 30% | 106 |
| vuen.Cake 2.51 | 38 | 14% | 69 |
| urdos.URDOS 1.3 | 28 | 10% | 37 |
| adt.Ar1 2.1 | 14 | 5% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 2% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 4 | 1% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 1% | 4 |
| oa.weak.FlyMk1 0.1 | 2 | 1% | 5 |

## Melee bench: F04

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 73.8 | 7 / 350 | 3.35 | 14.3% | 44270 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.8% | 318 |
| apc.LeeroyJenkins2 1.0 | 2.5 | 14.2% | 17 |
| hadur117.nano.SanaroLL 0.2 | 2.5 | 14.3% | 7 |
| TNT.TNT 0.99.1 | 4.1 | 10.5% | 5 |
| josago.Jorgito 0.16 | 4.9 | 9.1% | 2 |
| css.Delitioner 0.11 | 6.3 | 7.4% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 7.2% | 0 |
| rampancy.Durandal 2.1d | 8.1 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.6 | 3.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 68.6 | 2 / 35 | 4159 |
| 2 | 2 | 61.8 | 70.8 | 0 / 35 | 4176 |
| 3 | 2 | 64.7 | 78.4 | 0 / 35 | 4903 |
| 4 | 3 | 59.3 | 64.4 | 1 / 35 | 4026 |
| 5 | 3 | 62.6 | 74.6 | 0 / 35 | 4153 |
| 6 | 3 | 63.9 | 76.5 | 1 / 35 | 4491 |
| 7 | 2 | 64.8 | 76.5 | 2 / 35 | 4859 |
| 8 | 3 | 62.9 | 74.0 | 0 / 35 | 4289 |
| 9 | 2 | 64.1 | 76.2 | 0 / 35 | 4735 |
| 10 | 2 | 64.4 | 78.4 | 1 / 35 | 4479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 137 | 1% |
| apc.LeeroyJenkins2 1.0 | 11 | 45% |
| josago.Jorgito 0.16 | 2 | 0% |
| TNT.TNT 0.99.1 | 2 | 50% |

Hadur died in 343 of 350 rounds, at a mean tick of 1106. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 240 | 70% | 240 |
| apc.LeeroyJenkins2 1.0 | 46 | 13% | 52 |
| josago.Jorgito 0.16 | 28 | 8% | 28 |
| TNT.TNT 0.99.1 | 13 | 4% | 14 |
| css.Delitioner 0.11 | 8 | 2% | 8 |
| tj.zombie1n 1.0.1 | 5 | 1% | 5 |
| sp.Nanos.Ember 1.1 | 3 | 1% | 3 |

## Melee bench: F06

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 68.0 | 58 / 350 | 3.88 | 13.3% | 34744 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.6 | 15.6% | 89 |
| origin.SleepSiphon 1.7b | 1.8 | 14.7% | 109 |
| hadur117.nano.SanaroLL 0.2 | 3.4 | 13.3% | 58 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.5 | 12.7% | 50 |
| mld.Wisdom 1.0 | 4.8 | 10.7% | 13 |
| gg.Wolverine 2.0 | 6.0 | 9.0% | 16 |
| spinnercat.Omen 1.0 | 7.5 | 7.5% | 4 |
| DBall.NUKE 0.1 | 8.2 | 6.8% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.7% | 8 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 74.0 | 8 / 35 | 3414 |
| 2 | 4 | 58.0 | 64.1 | 4 / 35 | 3233 |
| 3 | 5 | 54.5 | 55.6 | 3 / 35 | 3094 |
| 4 | 3 | 63.1 | 76.8 | 9 / 35 | 3624 |
| 5 | 3 | 60.8 | 67.9 | 6 / 35 | 3991 |
| 6 | 2 | 61.4 | 74.0 | 8 / 35 | 3426 |
| 7 | 3 | 60.1 | 68.6 | 6 / 35 | 3719 |
| 8 | 3 | 59.5 | 67.0 | 5 / 35 | 3565 |
| 9 | 3 | 61.0 | 73.0 | 5 / 35 | 3305 |
| 10 | 5 | 56.7 | 58.7 | 4 / 35 | 3373 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 47 | 38% |
| origin.SleepSiphon 1.7b | 43 | 23% |
| pe.minimelee.SandboxMiniMelee 1.1 | 24 | 50% |
| gg.Wolverine 2.0 | 10 | 50% |
| mld.Wisdom 1.0 | 7 | 71% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 71% |
| DBall.NUKE 0.1 | 3 | 67% |
| spinnercat.Omen 1.0 | 2 | 50% |

Hadur died in 293 of 350 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 98 | 33% | 113 |
| origin.SleepSiphon 1.7b | 72 | 25% | 82 |
| pe.minimelee.SandboxMiniMelee 1.1 | 55 | 19% | 68 |
| mld.Wisdom 1.0 | 26 | 9% | 32 |
| gg.Wolverine 2.0 | 18 | 6% | 22 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 3% | 17 |
| spinnercat.Omen 1.0 | 8 | 3% | 8 |
| DBall.NUKE 0.1 | 5 | 2% | 7 |
| sample.Fire 1.0 | 1 | 0% | 1 |

## Melee bench: F07

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.6 | 74 / 350 | 2.74 | 16.3% | 49496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.6 | 17.5% | 101 |
| rsalesc.melee.Monk 0.3.6c | 1.7 | 17.8% | 106 |
| hadur117.nano.SanaroLL 0.2 | 2.7 | 16.3% | 74 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 12.2% | 34 |
| franzor.Lizt 1.3.1 | 4.8 | 11.4% | 38 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.0 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.8 | 78.1 | 4 / 35 | 4491 |
| 2 | 2 | 68.5 | 87.0 | 11 / 35 | 5047 |
| 3 | 2 | 66.5 | 79.7 | 4 / 35 | 5262 |
| 4 | 3 | 67.5 | 84.4 | 7 / 35 | 5086 |
| 5 | 3 | 67.5 | 81.3 | 9 / 35 | 5097 |
| 6 | 2 | 67.9 | 83.8 | 10 / 35 | 5039 |
| 7 | 3 | 66.1 | 79.0 | 6 / 35 | 4908 |
| 8 | 3 | 63.9 | 72.7 | 4 / 35 | 4520 |
| 9 | 3 | 66.6 | 79.7 | 8 / 35 | 5084 |
| 10 | 3 | 67.1 | 80.6 | 11 / 35 | 4962 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 104 | 49% |
| rsalesc.melee.Monk 0.3.6c | 59 | 14% |
| oog.melee.CapuletDroid 1.1 | 26 | 42% |
| franzor.Lizt 1.3.1 | 11 | 36% |

Hadur died in 276 of 350 rounds, at a mean tick of 1421. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 125 | 45% | 183 |
| rsalesc.melee.Monk 0.3.6c | 100 | 36% | 110 |
| oog.melee.CapuletDroid 1.1 | 31 | 11% | 42 |
| franzor.Lizt 1.3.1 | 10 | 4% | 4 |
| exauge.GateKeeper 1.1.121g | 7 | 3% | 8 |
| lrem.micro.MoggFanatic 0.2 | 3 | 1% | 3 |

## Melee bench: F08

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 72.0 | 88 / 350 | 3.52 | 14.2% | 34974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroLL 0.2 | 1.5 | 14.2% | 88 |
| tm.Yuugao 1.0 | 2.2 | 13.7% | 82 |
| shrub.Vapour v159 | 2.6 | 13.5% | 85 |
| Krabb.sliNk.Garm 0.9u | 4.1 | 11.2% | 28 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 10.0% | 32 |
| m3thos.Eva00 1.1 | 6.1 | 9.2% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.6% | 19 |
| qualidafial.MajorDick 1.0.1 | 8.8 | 6.6% | 5 |
| zyx.nano.BacillusComma 1.0 | 8.9 | 6.4% | 2 |
| SHAM.WOW 1.4 | 9.1 | 6.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 71.7 | 8 / 35 | 3278 |
| 2 | 1 | 63.1 | 77.8 | 14 / 35 | 3662 |
| 3 | 1 | 60.5 | 72.4 | 7 / 35 | 3492 |
| 4 | 3 | 59.8 | 69.5 | 9 / 35 | 3300 |
| 5 | 1 | 62.3 | 74.9 | 13 / 35 | 3735 |
| 6 | 1 | 61.3 | 72.7 | 10 / 35 | 3580 |
| 7 | 1 | 61.2 | 73.3 | 6 / 35 | 3812 |
| 8 | 2 | 58.5 | 67.3 | 4 / 35 | 3396 |
| 9 | 1 | 59.6 | 69.2 | 9 / 35 | 3422 |
| 10 | 1 | 59.9 | 70.8 | 8 / 35 | 3297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 58 | 52% |
| shrub.Vapour v159 | 38 | 32% |
| Krabb.sliNk.Garm 0.9u | 18 | 72% |
| com.spp.robocode.MostlyHarmless 010 | 18 | 44% |
| jwst.DAD.DarkAndDarker 1.1 | 15 | 73% |
| m3thos.Eva00 1.1 | 10 | 70% |
| SHAM.WOW 1.4 | 5 | 80% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 262 of 350 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 67 | 26% | 85 |
| tm.Yuugao 1.0 | 58 | 22% | 90 |
| Krabb.sliNk.Garm 0.9u | 32 | 12% | 41 |
| com.spp.robocode.MostlyHarmless 010 | 29 | 11% | 38 |
| m3thos.Eva00 1.1 | 27 | 10% | 33 |
| jwst.DAD.DarkAndDarker 1.1 | 24 | 9% | 32 |
| zyx.nano.BacillusComma 1.0 | 15 | 6% | 16 |
| SHAM.WOW 1.4 | 5 | 2% | 9 |
| qualidafial.MajorDick 1.0.1 | 5 | 2% | 5 |

## Melee bench: F09

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.6 | 61.6 | 32 / 350 | 4.46 | 11.8% | 28769 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 17.7% | 179 |
| kc.micro.Figment 1.0 | 1.9 | 15.7% | 80 |
| hadur117.nano.SanaroLL 0.2 | 3.6 | 11.8% | 32 |
| yagami.Tidus 0.11 | 4.5 | 10.9% | 5 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.6% | 28 |
| mc2.enemy.Original 0.9 | 5.3 | 9.8% | 25 |
| dft.Calliope 5.6 | 6.9 | 7.8% | 2 |
| step.nanoPri 1.0 | 8.3 | 6.0% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.4% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.2 | 57.1 | 4 / 35 | 2863 |
| 2 | 4 | 52.4 | 52.1 | 2 / 35 | 2579 |
| 3 | 3 | 58.9 | 68.6 | 5 / 35 | 2864 |
| 4 | 3 | 57.1 | 64.1 | 0 / 35 | 2885 |
| 5 | 3 | 60.1 | 69.8 | 3 / 35 | 3423 |
| 6 | 4 | 55.7 | 60.6 | 3 / 35 | 2627 |
| 7 | 3 | 58.1 | 63.2 | 7 / 35 | 2876 |
| 8 | 5 | 54.7 | 57.5 | 2 / 35 | 2632 |
| 9 | 4 | 55.9 | 59.4 | 3 / 35 | 3024 |
| 10 | 3 | 57.6 | 63.5 | 3 / 35 | 2996 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 54 | 30% |
| kc.micro.Figment 1.0 | 32 | 22% |
| pedersen.Grishnakh 1.0 | 7 | 29% |
| mc2.enemy.Original 0.9 | 7 | 57% |
| dft.Calliope 5.6 | 2 | 100% |
| yagami.Tidus 0.11 | 1 | 0% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 318 of 350 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 94 | 30% | 103 |
| positive.Portia 1.26e | 90 | 28% | 106 |
| yagami.Tidus 0.11 | 38 | 12% | 38 |
| mc2.enemy.Original 0.9 | 31 | 10% | 36 |
| pedersen.Grishnakh 1.0 | 26 | 8% | 27 |
| robar.nano.Assertive_Melee 0.2 | 14 | 4% | 14 |
| step.nanoPri 1.0 | 12 | 4% | 12 |
| dft.Calliope 5.6 | 10 | 3% | 11 |
| rdm.Dueler 0.4x | 3 | 1% | 3 |

## Melee bench: F10

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 80.8 | 99 / 350 | 2.73 | 15.7% | 42369 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| DTF.Kludgy 1.2b | 1.5 | 15.6% | 97 |
| hadur117.nano.SanaroLL 0.2 | 1.6 | 15.7% | 99 |
| ne.Chimera 1.2 | 3.1 | 13.2% | 46 |
| ejb.Polaris 1.0.1 | 3.8 | 12.8% | 43 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.9% | 36 |
| vStar.RAFzilla 2.15 | 5.8 | 10.1% | 17 |
| sam.Samspin 1.0 | 7.5 | 6.3% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.6% | 1 |
| kurios.DOSexe .9b | 8.7 | 5.2% | 6 |
| donjezza.Muncho 1.0 | 9.5 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 77.5 | 11 / 35 | 4159 |
| 2 | 2 | 63.0 | 80.3 | 6 / 35 | 3731 |
| 3 | 2 | 64.4 | 81.6 | 10 / 35 | 4235 |
| 4 | 1 | 65.8 | 86.3 | 13 / 35 | 4399 |
| 5 | 1 | 64.6 | 80.0 | 10 / 35 | 4484 |
| 6 | 2 | 64.8 | 81.0 | 11 / 35 | 4432 |
| 7 | 1 | 65.6 | 83.8 | 12 / 35 | 4420 |
| 8 | 2 | 64.8 | 81.9 | 11 / 35 | 4392 |
| 9 | 2 | 60.3 | 72.7 | 4 / 35 | 3558 |
| 10 | 1 | 64.9 | 82.9 | 11 / 35 | 4559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 71 | 46% |
| ejb.Polaris 1.0.1 | 48 | 67% |
| ne.Chimera 1.2 | 25 | 24% |
| tvv.micro.Antares 1.1.1 | 24 | 29% |
| vStar.RAFzilla 2.15 | 19 | 58% |
| sam.Samspin 1.0 | 5 | 100% |
| kurios.DOSexe .9b | 5 | 40% |
| donjezza.Muncho 1.0 | 4 | 50% |

Hadur died in 251 of 350 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 83 | 33% | 113 |
| ne.Chimera 1.2 | 74 | 29% | 83 |
| tvv.micro.Antares 1.1.1 | 30 | 12% | 33 |
| ejb.Polaris 1.0.1 | 25 | 10% | 63 |
| vStar.RAFzilla 2.15 | 18 | 7% | 27 |
| kurios.DOSexe .9b | 6 | 2% | 10 |
| sam.Samspin 1.0 | 6 | 2% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 2% | 6 |
| donjezza.Muncho 1.0 | 4 | 2% | 6 |

## Melee bench: F11

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 66.7 | 51 / 350 | 4.00 | 13.0% | 33408 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.2% | 145 |
| cx.mini.Nimrod 0.55 | 2.5 | 13.3% | 57 |
| hadur117.nano.SanaroLL 0.2 | 2.6 | 13.0% | 51 |
| djc.DynaBot 0.1.1 | 4.6 | 10.6% | 26 |
| br2.MobyDickBot 1.6 | 5.5 | 9.5% | 24 |
| rdt199.Warlord 0.73 | 5.7 | 9.6% | 23 |
| uji.YellohFellah 1.0 | 6.1 | 9.0% | 26 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.4% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.4 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.6 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.9 | 66.3 | 5 / 35 | 3540 |
| 2 | 3 | 58.9 | 67.6 | 5 / 35 | 3385 |
| 3 | 3 | 59.5 | 68.6 | 7 / 35 | 3223 |
| 4 | 3 | 59.5 | 67.3 | 5 / 35 | 3473 |
| 5 | 3 | 59.8 | 69.2 | 4 / 35 | 3606 |
| 6 | 2 | 57.3 | 62.2 | 4 / 35 | 3411 |
| 7 | 2 | 59.5 | 72.1 | 4 / 35 | 2997 |
| 8 | 2 | 57.5 | 64.4 | 4 / 35 | 3059 |
| 9 | 3 | 57.5 | 63.2 | 6 / 35 | 3047 |
| 10 | 2 | 59.7 | 66.0 | 7 / 35 | 3667 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 65 | 40% |
| cx.mini.Nimrod 0.55 | 20 | 35% |
| uji.YellohFellah 1.0 | 14 | 36% |
| rdt199.Warlord 0.73 | 9 | 56% |
| djc.DynaBot 0.1.1 | 9 | 56% |
| br2.MobyDickBot 1.6 | 8 | 38% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |

Hadur died in 299 of 350 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 114 | 38% | 136 |
| cx.mini.Nimrod 0.55 | 70 | 23% | 73 |
| rdt199.Warlord 0.73 | 31 | 10% | 39 |
| br2.MobyDickBot 1.6 | 24 | 8% | 29 |
| uji.YellohFellah 1.0 | 18 | 6% | 24 |
| djc.DynaBot 0.1.1 | 17 | 6% | 24 |
| KiraNL.Chupacabra 0.4 | 11 | 4% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 3% | 8 |
| stelo.MirrorNano 1.3 | 6 | 2% | 6 |

## Melee bench: F12

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 69.7 | 46 / 350 | 3.73 | 13.1% | 29143 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.7 | 14.3% | 110 |
| bts.wiki.RipCurl 0.9b | 2.5 | 14.2% | 74 |
| darkcanuck.Leon 1.01 | 2.7 | 13.4% | 81 |
| hadur117.nano.SanaroLL 0.2 | 3.1 | 13.1% | 46 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.8% | 20 |
| jrm.Test0 1.0 | 6.2 | 8.4% | 7 |
| jp.Perpy 16.0 | 7.4 | 7.5% | 5 |
| cs.sheldor.Talon 1.1 | 7.4 | 7.4% | 2 |
| stuff.Vlad 0.1 | 9.5 | 5.5% | 1 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.4% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.3 | 60.6 | 2 / 35 | 2820 |
| 2 | 3 | 58.1 | 65.7 | 7 / 35 | 2971 |
| 3 | 3 | 60.0 | 71.7 | 5 / 35 | 3157 |
| 4 | 4 | 57.7 | 67.6 | 2 / 35 | 2802 |
| 5 | 4 | 54.3 | 59.0 | 2 / 35 | 2444 |
| 6 | 4 | 60.6 | 72.4 | 6 / 35 | 3093 |
| 7 | 1 | 62.0 | 77.8 | 9 / 35 | 2886 |
| 8 | 3 | 61.7 | 77.5 | 6 / 35 | 2995 |
| 9 | 3 | 58.9 | 70.2 | 3 / 35 | 2944 |
| 10 | 2 | 60.5 | 74.6 | 4 / 35 | 3031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 51 | 10% |
| bts.wiki.RipCurl 0.9b | 43 | 44% |
| darkcanuck.Leon 1.01 | 42 | 12% |
| brainfade.melee.Genghis 0.36 | 13 | 69% |
| jaybot.bots.Oddball 4.0 | 5 | 80% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 0% |

Hadur died in 306 of 350 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 84 | 27% | 89 |
| bts.wiki.RipCurl 0.9b | 75 | 25% | 91 |
| darkcanuck.Leon 1.01 | 61 | 20% | 68 |
| brainfade.melee.Genghis 0.36 | 33 | 11% | 38 |
| cs.sheldor.Talon 1.1 | 17 | 6% | 22 |
| jrm.Test0 1.0 | 16 | 5% | 17 |
| jp.Perpy 16.0 | 9 | 3% | 12 |
| jaybot.bots.Oddball 4.0 | 6 | 2% | 9 |
| stuff.Vlad 0.1 | 5 | 2% | 4 |

## Melee bench: F13

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 72.0 | 44 / 350 | 3.52 | 13.2% | 32592 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.3% | 159 |
| ags.Glacier 0.2.11 | 1.6 | 16.8% | 88 |
| hadur117.nano.SanaroLL 0.2 | 3.3 | 13.2% | 44 |
| shinh.Entangled 0.3 | 3.9 | 12.5% | 35 |
| gh.micro.Gruweltje 0.7 | 4.8 | 12.0% | 21 |
| apc.Colossus2 0.17 | 6.1 | 8.1% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.8% | 4 |
| ayk.WallHugger 1.0 | 8.3 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.6 | 5.0% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 70.2 | 7 / 35 | 3217 |
| 2 | 3 | 61.9 | 74.6 | 4 / 35 | 3750 |
| 3 | 5 | 59.7 | 68.9 | 4 / 35 | 3333 |
| 4 | 3 | 61.2 | 75.9 | 3 / 35 | 3122 |
| 5 | 3 | 60.6 | 71.7 | 5 / 35 | 3233 |
| 6 | 3 | 60.0 | 71.1 | 3 / 35 | 3181 |
| 7 | 3 | 60.8 | 72.7 | 6 / 35 | 3253 |
| 8 | 3 | 59.7 | 72.4 | 5 / 35 | 2974 |
| 9 | 3 | 61.0 | 75.2 | 3 / 35 | 3324 |
| 10 | 4 | 58.8 | 67.0 | 4 / 35 | 3205 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 84 | 37% |
| ags.Glacier 0.2.11 | 44 | 16% |
| shinh.Entangled 0.3 | 22 | 14% |
| gh.micro.Gruweltje 0.7 | 10 | 30% |
| stelo.Wang 1.0 | 2 | 0% |

Hadur died in 307 of 350 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 91 | 30% | 122 |
| ags.Glacier 0.2.11 | 84 | 27% | 90 |
| shinh.Entangled 0.3 | 48 | 16% | 52 |
| gh.micro.Gruweltje 0.7 | 44 | 14% | 46 |
| stelo.Wang 1.0 | 16 | 5% | 16 |
| maribo.FollowFire 1 | 12 | 4% | 12 |
| apc.Colossus2 0.17 | 10 | 3% | 10 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 75.5 | 79 / 350 | 3.21 | 14.2% | 34077 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.4% | 143 |
| hadur117.nano.SanaroLL 0.2 | 2.2 | 14.2% | 79 |
| catcat20.shape.Theta 0.018 | 2.8 | 13.0% | 71 |
| Lo_Ian.Gandalf_V4 4.0 | 4.8 | 10.4% | 13 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.9% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 10.0% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 6.2 | 9.6% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 8.2% | 18 |
| pa.Improved 1.0 | 9.0 | 5.5% | 3 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 73.7 | 7 / 35 | 3463 |
| 2 | 2 | 63.2 | 78.4 | 8 / 35 | 3564 |
| 3 | 2 | 61.5 | 72.1 | 10 / 35 | 3348 |
| 4 | 3 | 61.0 | 74.0 | 3 / 35 | 3471 |
| 5 | 2 | 63.6 | 79.7 | 10 / 35 | 3609 |
| 6 | 2 | 63.2 | 80.6 | 10 / 35 | 3443 |
| 7 | 2 | 61.4 | 74.9 | 5 / 35 | 3286 |
| 8 | 2 | 62.9 | 80.3 | 9 / 35 | 3237 |
| 9 | 2 | 60.0 | 70.2 | 10 / 35 | 3203 |
| 10 | 3 | 60.4 | 70.8 | 7 / 35 | 3453 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 104 | 38% |
| catcat20.shape.Theta 0.018 | 39 | 31% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 36% |
| sanyi.mikrobi.Roberto 1.0 | 11 | 55% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 60% |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 50% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |

Hadur died in 271 of 350 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 123 | 45% | 153 |
| catcat20.shape.Theta 0.018 | 52 | 19% | 68 |
| sanyi.mikrobi.Roberto 1.0 | 23 | 8% | 37 |
| dmh.robocode.robot.RedDwarf 0.4 | 19 | 7% | 24 |
| Lo_Ian.Gandalf_V4 4.0 | 18 | 7% | 23 |
| co.edu.usb.rc.LidisTron 1.0 | 17 | 6% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 6% | 24 |
| pa.Improved 1.0 | 3 | 1% | 5 |
| sample.TrackFire 1.0 | 1 | 0% | 1 |

## Melee bench: F15

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 66.1 | 51 / 350 | 4.05 | 13.1% | 36435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.7 | 14.6% | 77 |
| mld.DustBunny 3.8 | 2.3 | 14.0% | 51 |
| emp.Yngwie 1.11 | 2.9 | 13.2% | 102 |
| hadur117.nano.SanaroLL 0.2 | 3.1 | 13.1% | 51 |
| cb.nano.Insomnia 1.0 | 5.2 | 11.1% | 21 |
| kawigi.robot.Girl 1.2 | 5.8 | 10.0% | 39 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.8% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 6.8% | 1 |
| divineomega.TrialBot 0.003 | 8.7 | 5.8% | 8 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.8 | 62.9 | 5 / 35 | 3958 |
| 2 | 3 | 58.5 | 67.0 | 3 / 35 | 3527 |
| 3 | 4 | 59.0 | 68.3 | 4 / 35 | 3307 |
| 4 | 1 | 61.5 | 69.8 | 9 / 35 | 4053 |
| 5 | 3 | 60.9 | 69.5 | 6 / 35 | 3950 |
| 6 | 2 | 60.8 | 71.1 | 7 / 35 | 3701 |
| 7 | 3 | 59.1 | 65.7 | 4 / 35 | 3774 |
| 8 | 4 | 57.0 | 61.9 | 7 / 35 | 3094 |
| 9 | 4 | 57.6 | 61.9 | 3 / 35 | 3639 |
| 10 | 3 | 57.6 | 62.9 | 3 / 35 | 3432 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 34 | 53% |
| kawigi.micro.Shiz 1.1 | 26 | 19% |
| cb.nano.Insomnia 1.0 | 22 | 55% |
| mld.DustBunny 3.8 | 20 | 5% |
| kawigi.robot.Girl 1.2 | 20 | 65% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 299 of 350 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 79 | 26% | 88 |
| kawigi.micro.Shiz 1.1 | 66 | 22% | 76 |
| emp.Yngwie 1.11 | 55 | 18% | 79 |
| cb.nano.Insomnia 1.0 | 34 | 11% | 28 |
| kawigi.robot.Girl 1.2 | 33 | 11% | 42 |
| Grystrion.TrackerWO 1.0 | 15 | 5% | 16 |
| lambdaxy.TBot 0.1 | 9 | 3% | 9 |
| divineomega.TrialBot 0.003 | 7 | 2% | 10 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 0% | 2 |

## Melee bench: F16

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 66.0 | 38 / 350 | 4.06 | 13.4% | 39802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.9% | 196 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.1 | 14.9% | 17 |
| hadur117.nano.SanaroLL 0.2 | 3.0 | 13.4% | 38 |
| techdude.forest.FlamingForest 1.1 | 4.4 | 11.2% | 69 |
| tvv.nano.Polaris 1.2 | 5.0 | 9.5% | 12 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 9.1% | 1 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 8.0% | 10 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.1% | 7 |
| asd.Cthulhu 1.3 | 9.0 | 4.8% | 1 |
| repositorio.NanoStep 1.0 | 9.2 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.3 | 65.4 | 4 / 35 | 4395 |
| 2 | 3 | 59.3 | 62.5 | 3 / 35 | 4004 |
| 3 | 3 | 59.5 | 64.4 | 3 / 35 | 3895 |
| 4 | 3 | 59.0 | 63.2 | 3 / 35 | 3614 |
| 5 | 2 | 62.7 | 73.3 | 4 / 35 | 4101 |
| 6 | 4 | 59.3 | 64.8 | 3 / 35 | 3807 |
| 7 | 3 | 59.7 | 64.4 | 4 / 35 | 3956 |
| 8 | 3 | 64.0 | 74.0 | 7 / 35 | 4558 |
| 9 | 3 | 61.5 | 70.5 | 4 / 35 | 3970 |
| 10 | 3 | 56.6 | 57.1 | 3 / 35 | 3502 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 81 | 6% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 79% |
| techdude.forest.FlamingForest 1.1 | 11 | 55% |
| bvh.fnr.Fenrir 0.36l | 6 | 100% |
| divineomega.DivineBot 1.9.4.5 | 5 | 80% |
| tvv.nano.Polaris 1.2 | 3 | 33% |
| asd.Cthulhu 1.3 | 1 | 0% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 312 of 350 rounds, at a mean tick of 1234. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 153 | 49% | 164 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 69 | 22% | 79 |
| bvh.fnr.Fenrir 0.36l | 33 | 11% | 39 |
| techdude.forest.FlamingForest 1.1 | 20 | 6% | 23 |
| stelo.IntrinsicVolatility 1.4 | 13 | 4% | 14 |
| tvv.nano.Polaris 1.2 | 11 | 4% | 11 |
| asd.Cthulhu 1.3 | 7 | 2% | 8 |
| divineomega.DivineBot 1.9.4.5 | 6 | 2% | 11 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |

## Melee bench: F17

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 65.7 | 72 / 350 | 4.08 | 13.1% | 36234 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 2.2 | 14.0% | 69 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.6% | 74 |
| cx.BlestPain 1.41 | 3.0 | 13.6% | 76 |
| hadur117.nano.SanaroLL 0.2 | 3.0 | 13.1% | 72 |
| nic.Nicator 2.4 | 4.3 | 12.3% | 31 |
| ahf.NanoAndrew .4 | 6.1 | 10.3% | 25 |
| maribo.melee.BMV 0.1 | 6.7 | 9.4% | 3 |
| tex.Longbot 0.4 | 8.5 | 5.3% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.5% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.4 | 59.0 | 8 / 35 | 2885 |
| 2 | 3 | 60.4 | 69.2 | 6 / 35 | 3859 |
| 3 | 3 | 59.5 | 65.7 | 8 / 35 | 3540 |
| 4 | 1 | 61.3 | 69.2 | 4 / 35 | 4137 |
| 5 | 3 | 57.3 | 61.9 | 6 / 35 | 3193 |
| 6 | 1 | 62.4 | 71.4 | 10 / 35 | 3872 |
| 7 | 4 | 60.2 | 66.7 | 8 / 35 | 3626 |
| 8 | 2 | 61.7 | 67.9 | 11 / 35 | 3787 |
| 9 | 5 | 58.2 | 60.6 | 8 / 35 | 3534 |
| 10 | 3 | 59.5 | 65.7 | 3 / 35 | 3801 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cx.BlestPain 1.41 | 38 | 79% |
| et.Predator 1.8 | 38 | 29% |
| oog.melee.Mercutio 1.0 | 29 | 72% |
| nic.Nicator 2.4 | 15 | 40% |
| ahf.NanoAndrew .4 | 5 | 60% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 279 of 350 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 76 | 27% | 87 |
| nic.Nicator 2.4 | 46 | 16% | 52 |
| cx.BlestPain 1.41 | 45 | 16% | 74 |
| ahf.NanoAndrew .4 | 36 | 13% | 40 |
| oog.melee.Mercutio 1.0 | 32 | 11% | 53 |
| maribo.melee.BMV 0.1 | 28 | 10% | 29 |
| tex.Longbot 0.4 | 7 | 3% | 7 |
| edu.otg.spr.TheTeacher 1.2 | 5 | 2% | 5 |
| goblin.Bender 2.4 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 68.2 | 74 / 350 | 3.86 | 13.5% | 33998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.6 | 13.9% | 78 |
| hadur117.nano.SanaroLL 0.2 | 2.2 | 13.5% | 74 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.9% | 73 |
| uji.DBH 1.1 | 4.2 | 11.5% | 35 |
| ratosh.Nobo 0.21 | 5.0 | 10.8% | 15 |
| spinnercat.Robovirus 2.718 | 5.7 | 10.3% | 16 |
| sigterm.Sigterm 1.0 | 6.6 | 9.1% | 32 |
| kawigi.mini.Fhqwhgads 1.1 | 8.2 | 7.1% | 13 |
| stelo.WangRobot 1.0 | 9.0 | 5.9% | 15 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.1 | 68.6 | 10 / 35 | 3558 |
| 2 | 1 | 60.8 | 72.4 | 7 / 35 | 3594 |
| 3 | 2 | 58.0 | 64.8 | 8 / 35 | 3191 |
| 4 | 1 | 60.1 | 70.5 | 8 / 35 | 3412 |
| 5 | 3 | 56.4 | 61.3 | 7 / 35 | 2993 |
| 6 | 2 | 61.5 | 72.7 | 8 / 35 | 3849 |
| 7 | 2 | 60.6 | 70.8 | 7 / 35 | 3689 |
| 8 | 3 | 60.0 | 70.5 | 6 / 35 | 3364 |
| 9 | 1 | 60.6 | 71.7 | 8 / 35 | 3496 |
| 10 | 5 | 55.3 | 59.0 | 5 / 35 | 2852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 45 | 64% |
| agd.Mooserwirt2 2.7 | 31 | 32% |
| uji.DBH 1.1 | 18 | 44% |
| spinnercat.Robovirus 2.718 | 17 | 76% |
| sigterm.Sigterm 1.0 | 13 | 46% |
| stelo.WangRobot 1.0 | 9 | 22% |
| ratosh.Nobo 0.21 | 7 | 57% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 25% |

Hadur died in 279 of 350 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 60 | 22% | 89 |
| agd.Mooserwirt2 2.7 | 46 | 16% | 59 |
| ratosh.Nobo 0.21 | 41 | 15% | 44 |
| uji.DBH 1.1 | 38 | 14% | 46 |
| spinnercat.Robovirus 2.718 | 29 | 10% | 38 |
| sigterm.Sigterm 1.0 | 20 | 7% | 25 |
| kawigi.mini.Fhqwhgads 1.1 | 18 | 6% | 20 |
| stelo.WangRobot 1.0 | 18 | 6% | 20 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 80.5 | 95 / 350 | 2.76 | 16.0% | 42617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.6 | 16.4% | 117 |
| hadur117.nano.SanaroLL 0.2 | 2.1 | 16.0% | 95 |
| mld.Infinity 2.2 | 2.3 | 15.7% | 106 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.4% | 13 |
| erdnis.Rover 0.3 | 4.9 | 10.2% | 3 |
| patson.PatsonTestBot 1.0 | 6.8 | 8.0% | 6 |
| mbh.Mbh 0.1 | 7.1 | 7.5% | 0 |
| pac.ABC 2.1 | 7.3 | 7.5% | 9 |
| pbg.R2D2 1.0 | 8.7 | 6.1% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.5 | 80.3 | 7 / 35 | 4158 |
| 2 | 2 | 64.5 | 77.1 | 12 / 35 | 3990 |
| 3 | 1 | 65.6 | 78.4 | 14 / 35 | 4471 |
| 4 | 2 | 66.2 | 82.2 | 10 / 35 | 4388 |
| 5 | 3 | 64.8 | 76.2 | 11 / 35 | 4218 |
| 6 | 2 | 66.6 | 86.3 | 8 / 35 | 4291 |
| 7 | 3 | 65.0 | 79.0 | 10 / 35 | 3960 |
| 8 | 2 | 64.6 | 80.3 | 4 / 35 | 4326 |
| 9 | 1 | 66.3 | 82.5 | 12 / 35 | 4531 |
| 10 | 2 | 65.2 | 82.2 | 7 / 35 | 4284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 90 | 16% |
| mld.Infinity 2.2 | 85 | 54% |
| krillr.mini.JointStrike 2.0.0 | 17 | 71% |
| pac.ABC 2.1 | 9 | 67% |
| patson.PatsonTestBot 1.0 | 8 | 63% |
| erdnis.Rover 0.3 | 7 | 86% |
| pbg.R2D2 1.0 | 4 | 75% |
| mbh.Mbh 0.1 | 3 | 100% |

Hadur died in 258 of 350 rounds, at a mean tick of 1029. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 121 | 47% | 172 |
| mld.Infinity 2.2 | 57 | 22% | 31 |
| krillr.mini.JointStrike 2.0.0 | 25 | 10% | 36 |
| erdnis.Rover 0.3 | 19 | 7% | 32 |
| pac.ABC 2.1 | 11 | 4% | 18 |
| patson.PatsonTestBot 1.0 | 10 | 4% | 20 |
| pbg.R2D2 1.0 | 8 | 3% | 17 |
| mbh.Mbh 0.1 | 7 | 3% | 16 |

## Melee bench: F20

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 67.3 | 57 / 350 | 3.94 | 13.2% | 34872 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 18.2% | 174 |
| hadur117.nano.SanaroLL 0.2 | 2.3 | 13.2% | 57 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.8% | 24 |
| fwb.Nine 1.0.1 | 4.0 | 11.4% | 30 |
| catcat20.Rabbit 0.001 | 4.7 | 10.1% | 31 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 9.0% | 9 |
| djdjdj.NanoSkunk10 1.0 | 7.1 | 8.4% | 11 |
| bayen.nut.Squirrel 1.615 | 7.7 | 7.8% | 10 |
| ntc.ControlledChaos 1.1.4 | 9.1 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.9 | 4.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.7 | 66.0 | 8 / 35 | 2911 |
| 2 | 3 | 57.7 | 63.5 | 3 / 35 | 3577 |
| 3 | 2 | 61.9 | 75.2 | 8 / 35 | 3567 |
| 4 | 2 | 57.4 | 63.8 | 7 / 35 | 3086 |
| 5 | 2 | 62.8 | 76.8 | 6 / 35 | 3676 |
| 6 | 2 | 59.5 | 65.7 | 8 / 35 | 3551 |
| 7 | 3 | 57.6 | 60.6 | 4 / 35 | 3808 |
| 8 | 2 | 58.8 | 64.4 | 8 / 35 | 3621 |
| 9 | 2 | 58.1 | 66.0 | 3 / 35 | 3147 |
| 10 | 2 | 60.5 | 71.1 | 2 / 35 | 3928 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 65 | 34% |
| catcat20.Rabbit 0.001 | 14 | 57% |
| m3thos.mini.Eva01 0.5.5 | 12 | 75% |
| fwb.Nine 1.0.1 | 11 | 73% |
| nz.jdc.nano.GridFu 1.0 | 7 | 0% |
| bayen.nut.Squirrel 1.615 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 5 | 60% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 50% |

Hadur died in 293 of 350 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 123 | 42% | 135 |
| fwb.Nine 1.0.1 | 47 | 16% | 56 |
| nz.jdc.nano.GridFu 1.0 | 38 | 13% | 41 |
| catcat20.Rabbit 0.001 | 28 | 10% | 38 |
| djdjdj.NanoSkunk10 1.0 | 18 | 6% | 22 |
| bayen.nut.Squirrel 1.615 | 14 | 5% | 20 |
| ntc.ControlledChaos 1.1.4 | 11 | 4% | 11 |
| m3thos.mini.Eva01 0.5.5 | 10 | 3% | 20 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 1% | 7 |

## Melee bench: F21

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 81.7 | 114 / 350 | 2.65 | 16.9% | 47906 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.3 | 17.2% | 145 |
| hadur117.nano.SanaroLL 0.2 | 1.7 | 16.9% | 114 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.7% | 30 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.1% | 25 |
| oa.weak.BotherBot 0.1 | 5.4 | 8.6% | 7 |
| eld.Hmm 1.0 | 5.7 | 8.4% | 27 |
| fire219.CatBot 1.0 | 7.5 | 6.3% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.1% | 3 |
| PSW.Relentless 0.1 | 8.7 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 82.2 | 8 / 35 | 4412 |
| 2 | 1 | 67.5 | 86.3 | 19 / 35 | 4591 |
| 3 | 2 | 65.3 | 79.7 | 11 / 35 | 4682 |
| 4 | 2 | 66.1 | 81.0 | 11 / 35 | 4681 |
| 5 | 2 | 64.9 | 77.8 | 9 / 35 | 4721 |
| 6 | 1 | 65.8 | 80.6 | 11 / 35 | 4715 |
| 7 | 2 | 65.8 | 79.4 | 8 / 35 | 5105 |
| 8 | 2 | 66.1 | 81.6 | 10 / 35 | 4902 |
| 9 | 1 | 69.2 | 86.3 | 16 / 35 | 5563 |
| 10 | 2 | 66.2 | 82.2 | 11 / 35 | 4534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 137 | 46% |
| dummy.mini.Scimitar 1.01 | 38 | 79% |
| cf.RiO.RiOx 4.2.1 | 23 | 39% |
| eld.Hmm 1.0 | 13 | 69% |
| oa.weak.BotherBot 0.1 | 4 | 50% |
| el.JumpShoot 0.2 | 2 | 50% |

Hadur died in 237 of 350 rounds, at a mean tick of 1199. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 106 | 45% | 148 |
| dummy.mini.Scimitar 1.01 | 46 | 19% | 92 |
| cf.RiO.RiOx 4.2.1 | 42 | 18% | 49 |
| eld.Hmm 1.0 | 15 | 6% | 26 |
| oa.weak.BotherBot 0.1 | 12 | 5% | 16 |
| el.JumpShoot 0.2 | 6 | 3% | 7 |
| fire219.CatBot 1.0 | 6 | 3% | 6 |
| arthord.MannyPacquiao Beta | 2 | 1% | 3 |
| PSW.Relentless 0.1 | 2 | 1% | 2 |

## Melee bench: F23

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 81.5 | 119 / 350 | 2.67 | 16.2% | 40387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.3% | 141 |
| hadur117.nano.SanaroLL 0.2 | 2.0 | 16.2% | 119 |
| cre.Karolos 0.32 | 3.1 | 14.5% | 55 |
| stelo.AreaTargetingBot 1.1 | 3.9 | 12.1% | 18 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.2% | 12 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.1 | 8.8% | 2 |
| sample.Walls 1.0 | 6.8 | 8.5% | 3 |
| cw.megas.Blade 0.8 | 7.6 | 7.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.1 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 78.1 | 12 / 35 | 4377 |
| 2 | 2 | 66.2 | 83.2 | 8 / 35 | 4195 |
| 3 | 2 | 67.1 | 86.7 | 13 / 35 | 4082 |
| 4 | 2 | 66.3 | 82.5 | 10 / 35 | 3783 |
| 5 | 2 | 65.1 | 79.0 | 12 / 35 | 4018 |
| 6 | 2 | 64.8 | 78.4 | 9 / 35 | 4006 |
| 7 | 2 | 66.3 | 81.9 | 12 / 35 | 4148 |
| 8 | 2 | 66.1 | 79.0 | 17 / 35 | 3787 |
| 9 | 2 | 66.3 | 80.6 | 13 / 35 | 4203 |
| 10 | 2 | 67.2 | 85.4 | 13 / 35 | 3788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 101 | 50% |
| cre.Karolos 0.32 | 50 | 42% |
| stelo.AreaTargetingBot 1.1 | 31 | 71% |
| sample.Walls 1.0 | 18 | 100% |
| stelo.RamTrackSurfer 1.2 | 11 | 45% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 231 of 350 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 113 | 49% | 175 |
| cre.Karolos 0.32 | 59 | 26% | 77 |
| stelo.AreaTargetingBot 1.1 | 28 | 12% | 45 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 13 | 6% | 16 |
| stelo.RamTrackSurfer 1.2 | 9 | 4% | 15 |
| sample.Walls 1.0 | 6 | 3% | 15 |
| cw.megas.Blade 0.8 | 3 | 1% | 6 |

## Melee bench: F24

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.4 | 60.1 | 38 / 350 | 4.59 | 11.4% | 27719 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.7 | 14.5% | 85 |
| florent.XSeries.X2 0.12 | 2.0 | 13.8% | 73 |
| pedersen.Ugluk 1.1.1 | 3.2 | 12.7% | 46 |
| davidalves.Phoenix 0.54 | 3.3 | 13.1% | 78 |
| hadur117.nano.SanaroLL 0.2 | 4.8 | 11.4% | 38 |
| oog.melee.Corsair 1.0 | 6.2 | 9.5% | 10 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.8% | 19 |
| lunchie.Lunchbox 0.93 | 8.1 | 6.3% | 2 |
| as.FrankTheTank 1.3 | 9.2 | 5.0% | 1 |
| evd.X1 0.01 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.4 | 66.0 | 5 / 35 | 2999 |
| 2 | 5 | 54.7 | 56.5 | 4 / 35 | 2786 |
| 3 | 5 | 54.9 | 59.7 | 4 / 35 | 2724 |
| 4 | 5 | 56.5 | 63.5 | 3 / 35 | 2646 |
| 5 | 5 | 53.2 | 55.6 | 3 / 35 | 2822 |
| 6 | 5 | 55.3 | 61.0 | 1 / 35 | 2740 |
| 7 | 4 | 57.2 | 64.8 | 9 / 35 | 2575 |
| 8 | 5 | 54.2 | 54.6 | 2 / 35 | 3239 |
| 9 | 5 | 53.8 | 59.4 | 1 / 35 | 2411 |
| 10 | 5 | 56.0 | 60.3 | 6 / 35 | 2777 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 25 | 32% |
| florent.XSeries.X2 0.12 | 23 | 61% |
| pedersen.Ugluk 1.1.1 | 15 | 53% |
| davidalves.Phoenix 0.54 | 15 | 20% |
| stelo.SoJNanoMelee 1.1 | 8 | 25% |
| oog.melee.Corsair 1.0 | 3 | 67% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 312 of 350 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pedersen.Ugluk 1.1.1 | 66 | 21% | 69 |
| rz.GlowBlowMelee 1.4 | 64 | 21% | 75 |
| florent.XSeries.X2 0.12 | 52 | 17% | 66 |
| davidalves.Phoenix 0.54 | 48 | 15% | 50 |
| stelo.SoJNanoMelee 1.1 | 34 | 11% | 34 |
| oog.melee.Corsair 1.0 | 23 | 7% | 28 |
| lunchie.Lunchbox 0.93 | 9 | 3% | 11 |
| evd.X1 0.01 | 9 | 3% | 9 |
| as.FrankTheTank 1.3 | 7 | 2% | 8 |

## Melee bench: F25

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 68.9 | 55 / 350 | 3.80 | 13.4% | 31532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.9 | 14.0% | 73 |
| voidious.micro.BlitzBat 1.05 | 1.9 | 14.3% | 83 |
| hadur117.nano.SanaroLL 0.2 | 2.5 | 13.4% | 55 |
| jdw.Hurricane 1.4 | 3.7 | 11.9% | 53 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 10.1% | 26 |
| ds.Oo 2.2 | 5.8 | 9.4% | 24 |
| gjr.Cephalosporin 0.1 | 6.8 | 8.6% | 22 |
| awesomeness.Elite 1.0 | 8.0 | 7.4% | 5 |
| adt.Ar2 1.1 | 8.9 | 6.5% | 9 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 67.3 | 5 / 35 | 3050 |
| 2 | 3 | 59.1 | 68.9 | 6 / 35 | 3033 |
| 3 | 1 | 62.6 | 76.8 | 8 / 35 | 3469 |
| 4 | 3 | 58.1 | 66.0 | 5 / 35 | 3038 |
| 5 | 3 | 58.5 | 63.8 | 5 / 35 | 3293 |
| 6 | 2 | 59.7 | 69.5 | 6 / 35 | 3251 |
| 7 | 2 | 58.8 | 68.6 | 4 / 35 | 3087 |
| 8 | 3 | 58.3 | 65.4 | 6 / 35 | 3002 |
| 9 | 3 | 59.7 | 70.2 | 4 / 35 | 3151 |
| 10 | 2 | 60.2 | 72.7 | 6 / 35 | 3158 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 48 | 17% |
| voidious.mini.BrokenSword 2.0.3 | 35 | 17% |
| jdw.Hurricane 1.4 | 23 | 70% |
| gre.svman4.Morfeas 1.4.1 | 16 | 63% |
| gjr.Cephalosporin 0.1 | 12 | 8% |
| ds.Oo 2.2 | 11 | 82% |
| awesomeness.Elite 1.0 | 4 | 75% |
| adt.Ar2 1.1 | 3 | 33% |

Hadur died in 296 of 350 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 88 | 30% | 96 |
| voidious.mini.BrokenSword 2.0.3 | 76 | 26% | 86 |
| jdw.Hurricane 1.4 | 38 | 13% | 53 |
| gre.svman4.Morfeas 1.4.1 | 23 | 8% | 33 |
| ds.Oo 2.2 | 22 | 7% | 31 |
| gjr.Cephalosporin 0.1 | 16 | 5% | 17 |
| awesomeness.Elite 1.0 | 13 | 4% | 14 |
| amk.ChumbaMini 0.2 | 10 | 3% | 10 |
| adt.Ar2 1.1 | 10 | 3% | 10 |

## Melee bench: F26

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 72.3 | 54 / 350 | 3.50 | 13.9% | 38750 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.2% | 124 |
| hadur117.nano.SanaroLL 0.2 | 2.6 | 13.9% | 54 |
| shu.nitro.LENIN .T34 | 3.0 | 13.1% | 72 |
| lrem.Spectre 0.4.4 | 3.5 | 12.4% | 53 |
| gh.mini.GrubbmOne 1.0 | 5.4 | 10.9% | 17 |
| js.PinBall 1.6 | 5.9 | 10.7% | 15 |
| jaybot.adv.bots.JayBot 2.0 | 6.6 | 9.4% | 10 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.5% | 3 |
| sample.SpinBot 1.0 | 8.9 | 5.3% | 3 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 73.3 | 3 / 35 | 3962 |
| 2 | 2 | 62.9 | 78.1 | 8 / 35 | 3822 |
| 3 | 3 | 60.9 | 71.7 | 6 / 35 | 3590 |
| 4 | 3 | 59.8 | 69.5 | 2 / 35 | 3583 |
| 5 | 2 | 64.1 | 77.1 | 8 / 35 | 4487 |
| 6 | 2 | 62.7 | 75.9 | 5 / 35 | 4089 |
| 7 | 2 | 61.9 | 71.4 | 7 / 35 | 4210 |
| 8 | 5 | 56.0 | 61.6 | 2 / 35 | 2907 |
| 9 | 2 | 61.9 | 71.7 | 6 / 35 | 4155 |
| 10 | 2 | 61.8 | 72.1 | 7 / 35 | 3945 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 61 | 16% |
| shu.nitro.LENIN .T34 | 38 | 42% |
| lrem.Spectre 0.4.4 | 33 | 36% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 83% |
| js.PinBall 1.6 | 6 | 50% |
| gh.mini.GrubbmOne 1.0 | 5 | 40% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 2 | 50% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 298 of 350 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 105 | 35% | 116 |
| shu.nitro.LENIN .T34 | 48 | 16% | 69 |
| lrem.Spectre 0.4.4 | 46 | 15% | 52 |
| gh.mini.GrubbmOne 1.0 | 35 | 12% | 37 |
| js.PinBall 1.6 | 25 | 8% | 29 |
| jaybot.adv.bots.JayBot 2.0 | 24 | 8% | 26 |
| sample.SpinBot 1.0 | 11 | 4% | 13 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 1% | 8 |

## Melee bench: F27

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 70.5 | 79 / 350 | 3.65 | 13.4% | 30238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.8 | 15.1% | 115 |
| hadur117.nano.SanaroLL 0.2 | 2.7 | 13.4% | 79 |
| wee.Gem 1.8.4 | 3.0 | 12.6% | 73 |
| sheldor.melee.nano.TestMelee 0.1 | 3.4 | 12.1% | 40 |
| EH.Eagle 1.0.6 | 4.1 | 11.4% | 26 |
| techdude.kombat.FlamingKombat 1.5 | 6.6 | 8.9% | 14 |
| throxbot.ThroxBot 0.1 | 7.3 | 8.2% | 3 |
| joe.ADinosaur 1.0 | 7.6 | 7.7% | 1 |
| caimano.Furia_Ceca 0.22 | 8.9 | 6.2% | 2 |
| cs.Grudge 1.0 | 9.6 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 74.9 | 7 / 35 | 3117 |
| 2 | 1 | 60.1 | 70.8 | 12 / 35 | 3116 |
| 3 | 2 | 59.4 | 70.8 | 8 / 35 | 3000 |
| 4 | 5 | 55.2 | 48.9 | 5 / 35 | 3999 |
| 5 | 4 | 56.0 | 63.8 | 6 / 35 | 2395 |
| 6 | 3 | 60.3 | 73.0 | 8 / 35 | 2728 |
| 7 | 2 | 61.9 | 79.4 | 9 / 35 | 3007 |
| 8 | 2 | 62.3 | 78.4 | 12 / 35 | 2967 |
| 9 | 2 | 59.6 | 73.3 | 7 / 35 | 2766 |
| 10 | 3 | 59.8 | 71.7 | 5 / 35 | 3143 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 63 | 48% |
| wee.Gem 1.8.4 | 32 | 38% |
| EH.Eagle 1.0.6 | 30 | 63% |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 41% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 67% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |
| throxbot.ThroxBot 0.1 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| cs.Grudge 1.0 | 1 | 100% |

Hadur died in 273 of 350 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 89 | 33% | 121 |
| wee.Gem 1.8.4 | 49 | 18% | 62 |
| sheldor.melee.nano.TestMelee 0.1 | 42 | 15% | 50 |
| EH.Eagle 1.0.6 | 28 | 10% | 46 |
| throxbot.ThroxBot 0.1 | 17 | 6% | 19 |
| joe.ADinosaur 1.0 | 16 | 6% | 16 |
| techdude.kombat.FlamingKombat 1.5 | 13 | 5% | 17 |
| caimano.Furia_Ceca 0.22 | 11 | 4% | 11 |
| cs.Grudge 1.0 | 6 | 2% | 8 |
2 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 78.7 | 106 / 350 | 2.92 | 15.3% | 34716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.3 | 16.5% | 124 |
| hadur117.nano.SanaroLL 0.2 | 1.8 | 15.3% | 106 |
| uji.Antique 1.0 | 3.0 | 12.7% | 71 |
| qohnil.blot.BlotBot 3.61 | 4.4 | 11.0% | 23 |
| pfvicm.Sobieski 7.2.3b | 4.6 | 10.6% | 13 |
| amk.ChumbaWumba 0.3 | 6.4 | 8.0% | 5 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.9% | 8 |
| matt.advanced.Katana 1.0 | 8.6 | 6.3% | 1 |
| stelo.PianistNano 1.2 | 8.6 | 6.1% | 0 |
| stelo.Lifestealer 1.0 | 9.6 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 76.5 | 9 / 35 | 3484 |
| 2 | 1 | 64.6 | 84.4 | 14 / 35 | 3213 |
| 3 | 1 | 63.6 | 81.0 | 12 / 35 | 3382 |
| 4 | 2 | 64.0 | 81.6 | 9 / 35 | 3596 |
| 5 | 2 | 62.1 | 76.2 | 8 / 35 | 3574 |
| 6 | 3 | 60.9 | 73.0 | 8 / 35 | 3177 |
| 7 | 2 | 65.2 | 83.8 | 14 / 35 | 3784 |
| 8 | 2 | 60.8 | 71.1 | 9 / 35 | 3404 |
| 9 | 2 | 60.5 | 72.1 | 7 / 35 | 3351 |
| 10 | 1 | 66.3 | 87.3 | 16 / 35 | 3751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 119 | 42% |
| uji.Antique 1.0 | 44 | 57% |
| qohnil.blot.BlotBot 3.61 | 19 | 63% |
| pfvicm.Sobieski 7.2.3b | 11 | 73% |
| amk.ChumbaWumba 0.3 | 8 | 100% |
| ahr.ice.Ice 1.0.2 | 4 | 25% |
| matt.advanced.Katana 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 247 of 350 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 105 | 43% | 137 |
| uji.Antique 1.0 | 50 | 20% | 86 |
| pfvicm.Sobieski 7.2.3b | 30 | 12% | 41 |
| qohnil.blot.BlotBot 3.61 | 21 | 9% | 35 |
| amk.ChumbaWumba 0.3 | 19 | 8% | 21 |
| ahr.ice.Ice 1.0.2 | 8 | 3% | 12 |
| stelo.Lifestealer 1.0 | 8 | 3% | 8 |
| stelo.PianistNano 1.2 | 4 | 2% | 6 |
| matt.advanced.Katana 1.0 | 1 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 65.4 | 46 / 350 | 4.12 | 12.9% | 31874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.5 | 16.2% | 114 |
| zyx.mega.YersiniaPestis 3.1 | 1.5 | 15.7% | 110 |
| hadur117.nano.SanaroLL 0.2 | 3.3 | 12.9% | 46 |
| myl.micro.Troodon 1.10 | 3.9 | 12.5% | 22 |
| jok.PheonixM 0.1.2 | 4.9 | 11.1% | 23 |
| DBall.Anarchy 0.1 | 6.1 | 9.0% | 30 |
| ph.melee.ArcherME 0.3 | 6.8 | 8.0% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 5.7% | 1 |
| ap.Frederick 1.1 | 9.4 | 4.6% | 4 |
| jangs.ns51 1.0 | 9.5 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 69.2 | 2 / 35 | 3195 |
| 2 | 4 | 57.4 | 60.6 | 6 / 35 | 3029 |
| 3 | 3 | 61.7 | 70.8 | 4 / 35 | 3568 |
| 4 | 3 | 61.0 | 71.1 | 7 / 35 | 3076 |
| 5 | 3 | 58.7 | 63.5 | 5 / 35 | 3242 |
| 6 | 3 | 58.4 | 61.9 | 3 / 35 | 3319 |
| 7 | 3 | 60.7 | 66.7 | 7 / 35 | 3551 |
| 8 | 3 | 58.4 | 63.5 | 4 / 35 | 3038 |
| 9 | 3 | 59.3 | 67.3 | 5 / 35 | 2977 |
| 10 | 5 | 55.7 | 59.0 | 3 / 35 | 2879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 43 | 5% |
| zyx.mega.YersiniaPestis 3.1 | 33 | 48% |
| myl.micro.Troodon 1.10 | 20 | 75% |
| DBall.Anarchy 0.1 | 15 | 27% |
| jok.PheonixM 0.1.2 | 10 | 70% |
| ap.Frederick 1.1 | 2 | 50% |
| ph.melee.ArcherME 0.3 | 1 | 0% |

Hadur died in 306 of 350 rounds, at a mean tick of 1030. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 119 | 39% | 123 |
| zyx.mega.YersiniaPestis 3.1 | 66 | 22% | 79 |
| myl.micro.Troodon 1.10 | 41 | 13% | 57 |
| jok.PheonixM 0.1.2 | 31 | 10% | 38 |
| DBall.Anarchy 0.1 | 24 | 8% | 29 |
| ph.melee.ArcherME 0.3 | 14 | 5% | 14 |
| fullsail.TimbotNoPrediction 1.0 | 5 | 2% | 5 |
| jangs.ns51 1.0 | 4 | 1% | 4 |
| ap.Frederick 1.1 | 1 | 0% | 0 |
1 death(s) with no robot to name.

## Melee bench: F30

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.4 | 56.3 | 24 / 350 | 4.93 | 10.8% | 29026 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.9 | 15.0% | 111 |
| oog.melee.Capulet 1.2 | 2.4 | 13.8% | 69 |
| darkcanuck.B26354 1.06 | 2.7 | 13.6% | 75 |
| stelo.PastFuture 2.3.2 | 3.0 | 13.1% | 42 |
| hadur117.nano.SanaroLL 0.2 | 5.0 | 10.8% | 24 |
| intruder.PrairieWolf 2.61 | 6.3 | 9.0% | 13 |
| fowl3628800.LightningBolt 2.6.0 | 7.5 | 7.8% | 12 |
| ntc.Opposite 1.5 | 7.9 | 7.5% | 0 |
| tripphippy.Alice 1.1 | 8.3 | 6.9% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.1 | 59.7 | 3 / 35 | 2895 |
| 2 | 5 | 53.9 | 57.5 | 0 / 35 | 2704 |
| 3 | 5 | 54.8 | 56.2 | 2 / 35 | 2993 |
| 4 | 5 | 51.1 | 50.8 | 1 / 35 | 2721 |
| 5 | 5 | 52.4 | 53.0 | 1 / 35 | 2617 |
| 6 | 5 | 54.6 | 54.9 | 3 / 35 | 3133 |
| 7 | 5 | 55.0 | 58.4 | 3 / 35 | 2865 |
| 8 | 5 | 53.1 | 53.0 | 1 / 35 | 3020 |
| 9 | 5 | 57.1 | 60.3 | 6 / 35 | 3203 |
| 10 | 5 | 56.0 | 59.7 | 4 / 35 | 2875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 17 | 6% |
| catcat20.Matcha 0.006 | 16 | 25% |
| darkcanuck.B26354 1.06 | 15 | 33% |
| stelo.PastFuture 2.3.2 | 13 | 77% |
| intruder.PrairieWolf 2.61 | 4 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 33% |
| tripphippy.Alice 1.1 | 2 | 50% |

Hadur died in 326 of 350 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 68 | 21% | 70 |
| darkcanuck.B26354 1.06 | 64 | 20% | 69 |
| stelo.PastFuture 2.3.2 | 55 | 17% | 64 |
| catcat20.Matcha 0.006 | 55 | 17% | 61 |
| fowl3628800.LightningBolt 2.6.0 | 23 | 7% | 22 |
| intruder.PrairieWolf 2.61 | 21 | 6% | 23 |
| tripphippy.Alice 1.1 | 21 | 6% | 22 |
| ntc.Opposite 1.5 | 19 | 6% | 19 |

## Melee bench: F31

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.9 | 58.6 | 19 / 350 | 4.73 | 11.0% | 26273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.3% | 183 |
| gh.mini.Griezel 0.2 | 2.2 | 14.1% | 86 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 12.7% | 27 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.5% | 25 |
| hadur117.nano.SanaroLL 0.2 | 4.7 | 11.0% | 19 |
| gh.nano.Grofvuil 0.2 | 5.9 | 9.5% | 6 |
| timmit.nano.TimDog 0.33 | 7.3 | 7.1% | 3 |
| fm.mammillarias 1.3 | 7.8 | 6.4% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.0% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.4 | 57.5 | 1 / 35 | 2481 |
| 2 | 5 | 53.3 | 55.6 | 3 / 35 | 2430 |
| 3 | 5 | 53.8 | 57.1 | 1 / 35 | 2555 |
| 4 | 4 | 58.4 | 65.4 | 1 / 35 | 3153 |
| 5 | 5 | 54.9 | 61.6 | 3 / 35 | 2257 |
| 6 | 4 | 55.5 | 58.1 | 2 / 35 | 2896 |
| 7 | 5 | 55.5 | 58.4 | 3 / 35 | 2732 |
| 8 | 6 | 54.0 | 57.5 | 2 / 35 | 2361 |
| 9 | 4 | 54.6 | 56.5 | 2 / 35 | 2771 |
| 10 | 4 | 54.5 | 58.4 | 1 / 35 | 2637 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 37 | 16% |
| abc.Shadow 3.84i | 35 | 31% |
| d414.nano.Quantum 1.0.0 | 10 | 10% |
| spinnercat.micro.Tyger 0.1 | 7 | 0% |
| gh.nano.Grofvuil 0.2 | 2 | 50% |

Hadur died in 331 of 350 rounds, at a mean tick of 781. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 86 | 26% | 92 |
| abc.Shadow 3.84i | 73 | 22% | 84 |
| spinnercat.micro.Tyger 0.1 | 64 | 19% | 65 |
| d414.nano.Quantum 1.0.0 | 43 | 13% | 44 |
| gh.nano.Grofvuil 0.2 | 25 | 8% | 25 |
| fm.mammillarias 1.3 | 17 | 5% | 17 |
| timmit.nano.TimDog 0.33 | 15 | 5% | 15 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 3 | 1% | 3 |

## Melee bench: F32

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 79.4 | 123 / 350 | 2.86 | 15.6% | 37151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.5 | 15.7% | 110 |
| hadur117.nano.SanaroLL 0.2 | 1.5 | 15.6% | 123 |
| apc.botM 3.0 | 3.3 | 12.1% | 44 |
| lxx.ConceptA 0.8 | 4.3 | 10.8% | 8 |
| vjik.UnViolation 1.1 | 4.6 | 10.7% | 29 |
| bayen.UbaMicro 1.4 | 6.3 | 8.6% | 8 |
| panzer.Panzer 0.2 | 7.2 | 7.5% | 2 |
| yk.JahMicro 1.0 | 7.8 | 7.0% | 16 |
| conscience.Electron 1.3g | 9.1 | 6.1% | 1 |
| donjezza.Jezza 1.0 | 9.4 | 5.9% | 11 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 74.6 | 10 / 35 | 3194 |
| 2 | 1 | 64.6 | 81.0 | 14 / 35 | 4031 |
| 3 | 2 | 65.1 | 82.9 | 13 / 35 | 4029 |
| 4 | 2 | 61.4 | 74.3 | 11 / 35 | 3466 |
| 5 | 1 | 63.9 | 79.4 | 13 / 35 | 4062 |
| 6 | 2 | 62.8 | 79.4 | 9 / 35 | 3717 |
| 7 | 1 | 64.8 | 81.9 | 14 / 35 | 3959 |
| 8 | 2 | 61.5 | 75.9 | 10 / 35 | 3500 |
| 9 | 1 | 63.4 | 82.2 | 13 / 35 | 3394 |
| 10 | 1 | 64.6 | 82.2 | 16 / 35 | 3799 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 96 | 46% |
| apc.botM 3.0 | 40 | 50% |
| lxx.ConceptA 0.8 | 22 | 91% |
| vjik.UnViolation 1.1 | 20 | 70% |
| yk.JahMicro 1.0 | 11 | 55% |
| bayen.UbaMicro 1.4 | 10 | 80% |
| donjezza.Jezza 1.0 | 10 | 30% |
| panzer.Panzer 0.2 | 7 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 227 of 350 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 97 | 43% | 144 |
| lxx.ConceptA 0.8 | 34 | 15% | 48 |
| apc.botM 3.0 | 32 | 14% | 52 |
| bayen.UbaMicro 1.4 | 16 | 7% | 27 |
| vjik.UnViolation 1.1 | 15 | 7% | 34 |
| yk.JahMicro 1.0 | 10 | 4% | 14 |
| donjezza.Jezza 1.0 | 9 | 4% | 12 |
| panzer.Panzer 0.2 | 8 | 4% | 11 |
| conscience.Electron 1.3g | 6 | 3% | 7 |

## Melee bench: F33

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 69.6 | 47 / 350 | 3.74 | 13.9% | 37825 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.5% | 137 |
| hadur117.nano.SanaroLL 0.2 | 2.4 | 13.9% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.9 | 13.4% | 68 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.6% | 31 |
| labg.Cataclysm 2.05 | 4.6 | 11.2% | 51 |
| baal.nano.N 1.42 | 6.3 | 8.5% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.6 | 8.4% | 9 |
| zyx.micro.Ant 1.1 | 8.2 | 5.9% | 2 |
| sanja.First 0.1 | 9.2 | 5.0% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.6 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 71.1 | 7 / 35 | 3608 |
| 2 | 4 | 58.2 | 63.2 | 1 / 35 | 3485 |
| 3 | 2 | 63.0 | 72.4 | 7 / 35 | 3994 |
| 4 | 2 | 58.5 | 66.0 | 2 / 35 | 3441 |
| 5 | 2 | 63.7 | 74.0 | 9 / 35 | 4241 |
| 6 | 2 | 61.4 | 70.8 | 4 / 35 | 4008 |
| 7 | 3 | 59.9 | 65.7 | 4 / 35 | 3766 |
| 8 | 2 | 60.9 | 68.9 | 5 / 35 | 4045 |
| 9 | 2 | 61.5 | 73.0 | 3 / 35 | 3664 |
| 10 | 3 | 60.8 | 70.5 | 5 / 35 | 3573 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 61 | 38% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 6% |
| gre.svman4.Leonidas 1.3.2 | 17 | 65% |
| labg.Cataclysm 2.05 | 16 | 31% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 20% |
| baal.nano.N 1.42 | 4 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 50% |

Hadur died in 305 of 350 rounds, at a mean tick of 1000. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 118 | 39% | 143 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 67 | 22% | 70 |
| gre.svman4.Leonidas 1.3.2 | 36 | 12% | 48 |
| labg.Cataclysm 2.05 | 29 | 10% | 33 |
| kinsen.melee.Angsaichmophobia 1.8c | 22 | 7% | 21 |
| baal.nano.N 1.42 | 14 | 5% | 16 |
| zyx.micro.Ant 1.1 | 14 | 5% | 14 |
| sanja.First 0.1 | 3 | 1% | 3 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 1% | 2 |

## Melee bench: F34

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 73.2 | 56 / 350 | 3.41 | 14.3% | 38982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.4 | 17.2% | 138 |
| kid.Gladiator .7.2 | 1.6 | 17.2% | 99 |
| hadur117.nano.SanaroLL 0.2 | 3.0 | 14.3% | 56 |
| jcs.Seth 1.8 | 4.2 | 11.6% | 31 |
| tcf.Reach 3 | 4.9 | 10.6% | 20 |
| cli.Dancer 1.1 | 5.9 | 9.8% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.6% | 1 |
| sample.RamFire 1.0 | 9.7 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.5 | 75.2 | 8 / 35 | 3901 |
| 2 | 3 | 62.2 | 72.4 | 5 / 35 | 3960 |
| 3 | 3 | 63.1 | 74.3 | 4 / 35 | 3939 |
| 4 | 3 | 62.6 | 72.7 | 5 / 35 | 4013 |
| 5 | 3 | 61.5 | 69.8 | 9 / 35 | 3573 |
| 6 | 3 | 63.4 | 74.0 | 7 / 35 | 4166 |
| 7 | 3 | 64.0 | 74.0 | 6 / 35 | 4603 |
| 8 | 3 | 64.0 | 74.9 | 7 / 35 | 4276 |
| 9 | 3 | 61.0 | 71.4 | 3 / 35 | 3455 |
| 10 | 3 | 61.0 | 73.0 | 2 / 35 | 3096 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 50 | 28% |
| stelo.Spread 0.9 | 50 | 60% |
| jcs.Seth 1.8 | 19 | 37% |
| tcf.Reach 3 | 8 | 25% |
| cli.Dancer 1.1 | 2 | 0% |
| amk.Punbot.Punbot 0.01 | 2 | 100% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 294 of 350 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 128 | 44% | 133 |
| stelo.Spread 0.9 | 82 | 28% | 118 |
| jcs.Seth 1.8 | 26 | 9% | 35 |
| tcf.Reach 3 | 22 | 7% | 24 |
| cli.Dancer 1.1 | 20 | 7% | 21 |
| ratosh.Wesco 1.4 | 15 | 5% | 17 |
| sample.RamFire 1.0 | 1 | 0% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 65.9 | 16 / 350 | 4.07 | 12.1% | 28239 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.6% | 274 |
| gh.mini.Gruwel 0.9 | 2.1 | 13.5% | 35 |
| hadur117.nano.SanaroLL 0.2 | 3.7 | 12.1% | 16 |
| rz.HawkOnFire 0.1 | 3.8 | 12.2% | 9 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.4 | 11.7% | 13 |
| wit.Chuliath 1.0 | 6.6 | 7.3% | 1 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.9% | 3 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 6.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.3 | 64.8 | 1 / 35 | 2888 |
| 2 | 5 | 57.5 | 64.1 | 1 / 35 | 2824 |
| 3 | 3 | 59.1 | 70.2 | 3 / 35 | 2695 |
| 4 | 4 | 57.9 | 66.3 | 3 / 35 | 2760 |
| 5 | 3 | 58.6 | 69.2 | 1 / 35 | 2538 |
| 6 | 3 | 58.5 | 68.3 | 0 / 35 | 3035 |
| 7 | 3 | 59.2 | 69.2 | 2 / 35 | 2812 |
| 8 | 5 | 57.3 | 63.2 | 2 / 35 | 2890 |
| 9 | 5 | 54.8 | 56.5 | 2 / 35 | 2796 |
| 10 | 3 | 58.5 | 67.0 | 1 / 35 | 3001 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 66 | 3% |
| gh.mini.Gruwel 0.9 | 20 | 35% |
| rz.HawkOnFire 0.1 | 8 | 38% |
| dmh.robocode.robot.BlackDeath 9.2 | 3 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 334 of 350 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 130 | 39% | 130 |
| gh.mini.Gruwel 0.9 | 62 | 19% | 72 |
| rz.HawkOnFire 0.1 | 58 | 17% | 60 |
| dmh.robocode.robot.BlackDeath 9.2 | 46 | 14% | 50 |
| myl.nano.KomoriNinja 1.1 | 12 | 4% | 12 |
| wit.Chuliath 1.0 | 9 | 3% | 10 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8 | 2% | 8 |
| dans.Cinnamon 1.2 | 5 | 1% | 5 |
| stelo.MyAgileRobot 0.2 | 4 | 1% | 3 |

## Melee bench: F36

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 72.4 | 92 / 350 | 3.49 | 14.7% | 37453 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroLL 0.2 | 1.2 | 14.7% | 92 |
| bzdp.Pansy 2.1 | 2.8 | 12.5% | 58 |
| alpha.RainingFire 1.0 | 3.0 | 12.5% | 54 |
| mz.Cork 0.1 | 3.9 | 11.7% | 37 |
| bvh.micro.Freya 0.3 | 4.7 | 10.9% | 39 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.8% | 25 |
| bvh.mini.Fenrir 0.39 | 6.4 | 9.4% | 14 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 7.0% | 9 |
| dl.BetterWalls 1.0 | 8.5 | 6.8% | 7 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.6% | 19 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 75.9 | 10 / 35 | 3873 |
| 2 | 1 | 61.9 | 74.3 | 9 / 35 | 3789 |
| 3 | 1 | 65.3 | 80.3 | 14 / 35 | 4339 |
| 4 | 1 | 63.6 | 77.1 | 14 / 35 | 3670 |
| 5 | 1 | 60.3 | 69.5 | 9 / 35 | 3537 |
| 6 | 2 | 59.2 | 67.9 | 4 / 35 | 3605 |
| 7 | 1 | 60.4 | 68.6 | 9 / 35 | 3548 |
| 8 | 2 | 58.7 | 64.4 | 7 / 35 | 3719 |
| 9 | 1 | 61.4 | 73.0 | 9 / 35 | 3584 |
| 10 | 1 | 61.9 | 72.7 | 7 / 35 | 3789 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 40% |
| bvh.micro.Freya 0.3 | 28 | 75% |
| alpha.RainingFire 1.0 | 23 | 48% |
| mz.Cork 0.1 | 21 | 52% |
| m3thos.Eva02 0.7.1 | 18 | 61% |
| bvh.mini.Fenrir 0.39 | 14 | 86% |
| sample.MyFirstRobot 1.0 | 8 | 13% |
| squidM.TentalceMeleeNano 1.1 | 3 | 67% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 258 of 350 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 56 | 22% | 79 |
| alpha.RainingFire 1.0 | 49 | 19% | 62 |
| bvh.mini.Fenrir 0.39 | 33 | 13% | 38 |
| mz.Cork 0.1 | 31 | 12% | 46 |
| bvh.micro.Freya 0.3 | 25 | 10% | 40 |
| m3thos.Eva02 0.7.1 | 23 | 9% | 38 |
| squidM.TentalceMeleeNano 1.1 | 18 | 7% | 19 |
| dl.BetterWalls 1.0 | 14 | 5% | 18 |
| sample.MyFirstRobot 1.0 | 9 | 3% | 10 |

## Melee bench: F37

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 75.0 | 114 / 350 | 3.25 | 15.0% | 43165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroLL 0.2 | 1.0 | 15.0% | 114 |
| germ.TheMind .2 | 3.2 | 11.4% | 46 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.8% | 30 |
| EBBU.Sim2 1.02 | 4.0 | 10.6% | 31 |
| agrach.Dalek 1.0 | 5.4 | 9.7% | 35 |
| stelo.UntouchableNano 1.3 | 6.0 | 9.4% | 25 |
| mb.Beast 0.1 | 6.9 | 8.9% | 31 |
| lmk.ACPFinal 0.1 | 7.2 | 8.7% | 21 |
| skm.Ryubot 1.0 | 8.2 | 8.4% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 9.6 | 7.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.0 | 70.5 | 8 / 35 | 4525 |
| 2 | 1 | 66.1 | 87.3 | 17 / 35 | 4771 |
| 3 | 1 | 65.1 | 86.7 | 16 / 35 | 4508 |
| 4 | 1 | 62.6 | 77.1 | 11 / 35 | 4487 |
| 5 | 1 | 60.2 | 72.7 | 8 / 35 | 4011 |
| 6 | 1 | 57.6 | 66.3 | 7 / 35 | 3917 |
| 7 | 1 | 60.0 | 70.2 | 12 / 35 | 4080 |
| 8 | 1 | 61.4 | 73.0 | 12 / 35 | 4524 |
| 9 | 1 | 59.2 | 67.9 | 10 / 35 | 4149 |
| 10 | 1 | 62.3 | 78.4 | 13 / 35 | 4193 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 44 | 43% |
| mb.Beast 0.1 | 25 | 68% |
| EBBU.Sim2 1.02 | 24 | 50% |
| agrach.Dalek 1.0 | 24 | 75% |
| skm.Ryubot 1.0 | 23 | 43% |
| com.syncleus.robocode.Dreadnaught 0.1 | 20 | 60% |
| stelo.UntouchableNano 1.3 | 20 | 80% |
| lmk.ACPFinal 0.1 | 13 | 69% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 237 of 350 rounds, at a mean tick of 560. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 53 | 22% | 76 |
| EBBU.Sim2 1.02 | 44 | 19% | 53 |
| mb.Beast 0.1 | 27 | 11% | 41 |
| com.syncleus.robocode.Dreadnaught 0.1 | 27 | 11% | 39 |
| agrach.Dalek 1.0 | 22 | 9% | 50 |
| skm.Ryubot 1.0 | 18 | 8% | 25 |
| stelo.UntouchableNano 1.3 | 17 | 7% | 27 |
| lmk.ACPFinal 0.1 | 16 | 7% | 25 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 5% | 14 |

## Melee bench: F38

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 63.8 | 23 / 350 | 4.25 | 11.9% | 30173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.2 | 16.8% | 166 |
| bvh.mini.Freya 0.55 | 2.7 | 12.9% | 38 |
| bts.mega.Gnarly 1.4 | 3.7 | 12.0% | 61 |
| hadur117.nano.SanaroLL 0.2 | 3.7 | 11.9% | 23 |
| cs.Wren 1.0 | 4.9 | 11.0% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 10.9% | 23 |
| kdf.KoulDestroyer 1.0 | 6.8 | 9.7% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.3% | 10 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.6% | 1 |
| bzdp.BoxCar 2.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.4 | 64.4 | 2 / 35 | 2994 |
| 2 | 5 | 56.0 | 61.3 | 4 / 35 | 2748 |
| 3 | 3 | 56.8 | 63.8 | 2 / 35 | 3118 |
| 4 | 2 | 60.7 | 74.0 | 4 / 35 | 3453 |
| 5 | 4 | 55.1 | 60.0 | 2 / 35 | 2771 |
| 6 | 2 | 58.5 | 67.9 | 4 / 35 | 3226 |
| 7 | 5 | 55.2 | 59.4 | 1 / 35 | 3035 |
| 8 | 5 | 52.6 | 53.7 | 1 / 35 | 2721 |
| 9 | 3 | 59.4 | 71.7 | 1 / 35 | 3071 |
| 10 | 4 | 57.1 | 62.2 | 2 / 35 | 3036 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 55 | 13% |
| bts.mega.Gnarly 1.4 | 25 | 12% |
| bvh.mini.Freya 0.55 | 14 | 36% |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 0% |
| cs.Wren 1.0 | 9 | 56% |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 25% |
| kdf.KoulDestroyer 1.0 | 3 | 67% |

Hadur died in 328 of 350 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 88 | 27% | 96 |
| bts.mega.Gnarly 1.4 | 51 | 16% | 55 |
| davidalves.net.DuelistNanoMelee 1.01 | 47 | 14% | 47 |
| bvh.mini.Freya 0.55 | 46 | 14% | 49 |
| cs.Wren 1.0 | 35 | 11% | 39 |
| kdf.KoulDestroyer 1.0 | 35 | 11% | 37 |
| kawigi.spare.SpareParts 0.7.6nosnd | 12 | 4% | 12 |
| bzdp.BoxCar 2.0 | 8 | 2% | 9 |
| matt.UnderDark3 2.4.34 | 6 | 2% | 6 |

## Melee bench: F39

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 64.8 | 42 / 350 | 4.17 | 12.4% | 33364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.2 | 15.9% | 85 |
| az.Ololobot 0.2.4 | 2.0 | 13.8% | 123 |
| hadur117.nano.SanaroLL 0.2 | 3.2 | 12.4% | 42 |
| catcat20.Lambda 0.024 | 3.6 | 11.8% | 50 |
| stelo.SoRobotNanoMelee 1.2 | 5.7 | 9.3% | 28 |
| apollokidd.ApolloKidd 0.9 | 6.6 | 8.5% | 4 |
| winamp32.micro.MicroMacro 1.0 | 6.8 | 8.4% | 6 |
| gimp.GimpBot 0.1 | 7.0 | 8.2% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.6% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 71.4 | 3 / 35 | 3690 |
| 2 | 3 | 55.5 | 60.6 | 3 / 35 | 3107 |
| 3 | 3 | 57.3 | 65.4 | 1 / 35 | 3382 |
| 4 | 3 | 55.9 | 61.3 | 4 / 35 | 3282 |
| 5 | 4 | 54.7 | 61.0 | 2 / 35 | 2938 |
| 6 | 2 | 59.0 | 69.5 | 8 / 35 | 3458 |
| 7 | 4 | 57.4 | 65.4 | 5 / 35 | 3334 |
| 8 | 4 | 56.9 | 63.2 | 6 / 35 | 3256 |
| 9 | 3 | 58.3 | 66.0 | 6 / 35 | 3343 |
| 10 | 3 | 57.7 | 64.4 | 4 / 35 | 3574 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 46 | 9% |
| bvh.fry.Freya 0.82 | 32 | 28% |
| catcat20.Lambda 0.024 | 24 | 58% |
| stelo.SoRobotNanoMelee 1.2 | 12 | 58% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| gimp.GimpBot 0.1 | 2 | 50% |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 309 of 350 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 107 | 35% | 113 |
| az.Ololobot 0.2.4 | 67 | 22% | 73 |
| apollokidd.ApolloKidd 0.9 | 36 | 12% | 37 |
| catcat20.Lambda 0.024 | 32 | 10% | 46 |
| stelo.SoRobotNanoMelee 1.2 | 27 | 9% | 30 |
| gimp.GimpBot 0.1 | 13 | 4% | 17 |
| dcs.Eater_of_Worlds 1.1.3-A | 12 | 4% | 13 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8 | 3% | 10 |
| winamp32.micro.MicroMacro 1.0 | 7 | 2% | 11 |

## Melee bench: F41

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 68.2 | 55 / 350 | 3.87 | 13.1% | 31655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.7% | 163 |
| ary.Swarm 1.1 | 2.6 | 13.9% | 32 |
| lessonz.robocode.Oz 0.5.0 | 3.2 | 13.2% | 55 |
| hadur117.nano.SanaroLL 0.2 | 3.4 | 13.1% | 55 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.9% | 39 |
| shrub.Silver v048 | 6.1 | 9.4% | 5 |
| zyx.nano.Ant 1.1 | 6.9 | 7.7% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.8% | 1 |
| stelo.Mirror 1.1 | 8.7 | 5.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 68.9 | 7 / 35 | 3006 |
| 2 | 4 | 60.0 | 66.7 | 7 / 35 | 2990 |
| 3 | 3 | 62.1 | 72.1 | 9 / 35 | 3515 |
| 4 | 4 | 57.9 | 64.4 | 1 / 35 | 3290 |
| 5 | 4 | 59.1 | 66.7 | 5 / 35 | 3135 |
| 6 | 2 | 62.1 | 73.3 | 9 / 35 | 3433 |
| 7 | 3 | 59.3 | 67.3 | 2 / 35 | 3610 |
| 8 | 3 | 58.9 | 66.7 | 4 / 35 | 2989 |
| 9 | 4 | 58.2 | 64.8 | 5 / 35 | 2926 |
| 10 | 4 | 60.0 | 70.8 | 6 / 35 | 2761 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 64 | 27% |
| lessonz.robocode.Oz 0.5.0 | 28 | 39% |
| simonton.nano.MeleeSeed 1.8 | 22 | 45% |
| ary.Swarm 1.1 | 20 | 65% |
| shrub.Silver v048 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 50% |

Hadur died in 295 of 350 rounds, at a mean tick of 914. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 90 | 31% | 107 |
| ary.Swarm 1.1 | 76 | 26% | 88 |
| lessonz.robocode.Oz 0.5.0 | 55 | 19% | 63 |
| simonton.nano.MeleeSeed 1.8 | 48 | 16% | 60 |
| zyx.nano.Ant 1.1 | 11 | 4% | 11 |
| shrub.Silver v048 | 8 | 3% | 11 |
| jsal.Jsalbot 1.0 | 4 | 1% | 5 |
| stelo.Mirror 1.1 | 3 | 1% | 5 |

## Melee bench: F42

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 72.5 | 66 / 350 | 3.47 | 14.0% | 36397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.3% | 169 |
| maribo.mini.MiniQuester 0.1 | 2.7 | 14.6% | 47 |
| ara.Shera 0.88 | 3.0 | 14.0% | 56 |
| hadur117.nano.SanaroLL 0.2 | 3.3 | 14.0% | 66 |
| amz.NanoClone 1.41 | 5.0 | 9.3% | 3 |
| dsw.StaticD 1.0 | 6.5 | 7.5% | 6 |
| maribo.IotaCT 1.1 | 6.5 | 7.6% | 2 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.4% | 0 |
| stelo.MirrorMicro 1.0 | 8.7 | 5.6% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.6 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 71.7 | 9 / 35 | 3895 |
| 2 | 3 | 61.3 | 73.0 | 6 / 35 | 3532 |
| 3 | 3 | 62.5 | 74.3 | 6 / 35 | 4095 |
| 4 | 2 | 63.1 | 79.0 | 6 / 35 | 3695 |
| 5 | 4 | 59.1 | 65.4 | 5 / 35 | 3435 |
| 6 | 4 | 59.8 | 67.6 | 5 / 35 | 3530 |
| 7 | 3 | 62.1 | 75.6 | 8 / 35 | 3603 |
| 8 | 4 | 60.1 | 67.6 | 7 / 35 | 3687 |
| 9 | 4 | 61.9 | 75.9 | 7 / 35 | 3480 |
| 10 | 3 | 61.4 | 74.9 | 7 / 35 | 3445 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 81 | 32% |
| maribo.mini.MiniQuester 0.1 | 33 | 67% |
| ara.Shera 0.88 | 23 | 48% |
| amz.NanoClone 1.41 | 5 | 80% |
| dsw.StaticD 1.0 | 4 | 75% |
| stelo.MirrorMicro 1.0 | 1 | 0% |

Hadur died in 287 of 350 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 109 | 38% | 136 |
| ara.Shera 0.88 | 72 | 25% | 82 |
| maribo.mini.MiniQuester 0.1 | 62 | 22% | 83 |
| amz.NanoClone 1.41 | 15 | 5% | 15 |
| maribo.IotaCT 1.1 | 9 | 3% | 9 |
| mme.NikeEnhanced 2.0 | 8 | 3% | 8 |
| dsw.StaticD 1.0 | 6 | 2% | 11 |
| stelo.MirrorMicro 1.0 | 5 | 2% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 0% | 1 |

## Melee bench: F43

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 62.7 | 24 / 350 | 4.35 | 11.9% | 30657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.8% | 279 |
| brainfade.melee.Dusk 0.44 | 2.6 | 12.9% | 21 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.6% | 16 |
| hadur117.nano.SanaroLL 0.2 | 3.5 | 11.9% | 24 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.7% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 9.9% | 5 |
| jab.DiamondStealer 5 | 7.5 | 7.7% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.8% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 67.9 | 4 / 35 | 3166 |
| 2 | 5 | 56.5 | 56.5 | 1 / 35 | 2761 |
| 3 | 2 | 60.9 | 67.0 | 4 / 35 | 3169 |
| 4 | 4 | 57.6 | 59.7 | 2 / 35 | 2537 |
| 5 | 4 | 57.2 | 59.0 | 2 / 35 | 2771 |
| 6 | 4 | 57.8 | 60.0 | 0 / 35 | 3211 |
| 7 | 4 | 57.5 | 59.4 | 1 / 35 | 2987 |
| 8 | 3 | 60.6 | 65.4 | 4 / 35 | 3513 |
| 9 | 3 | 60.9 | 66.3 | 4 / 35 | 3343 |
| 10 | 4 | 60.0 | 66.0 | 2 / 35 | 3199 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 66 | 14% |
| brainfade.melee.Dusk 0.44 | 10 | 80% |
| dummy.micro.Sparrow 2.5 | 6 | 83% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 50% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 326 of 350 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 162 | 50% | 171 |
| dummy.micro.Sparrow 2.5 | 41 | 13% | 46 |
| brainfade.melee.Dusk 0.44 | 32 | 10% | 40 |
| wcsv.melee.EngineerMelee 0.1 | 31 | 10% | 32 |
| Krabb.akim2.Akim2 1.1b | 23 | 7% | 23 |
| mz.NanoGod 2.02 | 22 | 7% | 23 |
| jab.DiamondStealer 5 | 15 | 5% | 15 |

## Melee bench: F44

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 68.9 | 64 / 350 | 3.80 | 13.7% | 37174 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.2 | 17.3% | 165 |
| tzu.TheArtOfWar 1.2 | 2.3 | 15.0% | 80 |
| hadur117.nano.SanaroLL 0.2 | 2.5 | 13.7% | 64 |
| wompi.Quokka 1.6 | 4.3 | 10.7% | 9 |
| jwirde.Gort 2.0 | 4.8 | 10.3% | 27 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.9 | 9.2% | 2 |
| disan.Chair 2.2.0 | 7.1 | 7.8% | 2 |
| stf.PanzerGeneral 0.1 | 7.9 | 6.9% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.4% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.2 | 68.3 | 4 / 35 | 3901 |
| 2 | 3 | 60.4 | 66.7 | 5 / 35 | 3688 |
| 3 | 3 | 58.1 | 66.0 | 3 / 35 | 3187 |
| 4 | 2 | 61.3 | 72.4 | 5 / 35 | 3531 |
| 5 | 3 | 61.3 | 69.8 | 6 / 35 | 3868 |
| 6 | 3 | 61.8 | 70.8 | 10 / 35 | 3684 |
| 7 | 3 | 57.1 | 60.0 | 3 / 35 | 3634 |
| 8 | 3 | 58.7 | 62.2 | 5 / 35 | 3900 |
| 9 | 1 | 64.4 | 80.0 | 11 / 35 | 3842 |
| 10 | 2 | 63.1 | 73.0 | 12 / 35 | 3939 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 70 | 41% |
| tzu.TheArtOfWar 1.2 | 41 | 34% |
| jwirde.Gort 2.0 | 13 | 62% |
| wompi.Quokka 1.6 | 6 | 83% |
| disan.Chair 2.2.0 | 5 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 50% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 286 of 350 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 92 | 32% | 124 |
| tzu.TheArtOfWar 1.2 | 87 | 30% | 104 |
| jwirde.Gort 2.0 | 32 | 11% | 39 |
| wompi.Quokka 1.6 | 24 | 8% | 25 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 17 | 6% | 18 |
| stf.PanzerGeneral 0.1 | 17 | 6% | 18 |
| disan.Chair 2.2.0 | 11 | 4% | 12 |
| amk.jointstrike.JointStrike 0.2 | 5 | 2% | 5 |
| sample.Crazy 1.0 | 1 | 0% | 4 |

## Melee bench: F45

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 74.0 | 65 / 350 | 3.34 | 15.2% | 41729 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroLL 0.2 | 1.0 | 15.2% | 65 |
| eem.IWillFireNoBullet v2.8 | 2.4 | 13.1% | 176 |
| jje.BagPuss 1.2 | 3.0 | 12.4% | 25 |
| sul.Lunar 1.1 | 4.1 | 11.2% | 39 |
| myl.nano.Graviton 1.10 | 5.2 | 10.2% | 15 |
| pez.mini.ChironexFleckeri 0.5 | 6.3 | 8.8% | 7 |
| hvilela.HVilela 0.9 | 6.3 | 8.9% | 1 |
| fm.claire 1.7 | 7.8 | 7.9% | 0 |
| wit.Deep7 2.0 | 9.0 | 6.9% | 20 |
| abud.ThirdRobo 1.0 | 9.9 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.1 | 68.3 | 8 / 35 | 4001 |
| 2 | 1 | 60.6 | 71.1 | 3 / 35 | 4007 |
| 3 | 1 | 61.8 | 71.1 | 9 / 35 | 4061 |
| 4 | 1 | 62.9 | 74.6 | 5 / 35 | 4362 |
| 5 | 1 | 59.1 | 64.1 | 9 / 35 | 3733 |
| 6 | 1 | 62.5 | 75.9 | 7 / 35 | 3965 |
| 7 | 1 | 62.6 | 76.8 | 6 / 35 | 3909 |
| 8 | 1 | 65.3 | 81.3 | 7 / 35 | 4590 |
| 9 | 1 | 63.7 | 77.5 | 4 / 35 | 4670 |
| 10 | 1 | 64.2 | 79.4 | 7 / 35 | 4431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 110 | 36% |
| jje.BagPuss 1.2 | 19 | 47% |
| sul.Lunar 1.1 | 19 | 0% |
| myl.nano.Graviton 1.10 | 13 | 46% |
| wit.Deep7 2.0 | 4 | 75% |
| hvilela.HVilela 0.9 | 4 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 3 | 100% |
| abud.ThirdRobo 1.0 | 1 | 0% |

Hadur died in 286 of 350 rounds, at a mean tick of 1484. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 79 | 28% | 0 |
| jje.BagPuss 1.2 | 57 | 20% | 95 |
| sul.Lunar 1.1 | 47 | 16% | 82 |
| myl.nano.Graviton 1.10 | 28 | 10% | 51 |
| hvilela.HVilela 0.9 | 24 | 8% | 32 |
| wit.Deep7 2.0 | 20 | 7% | 33 |
| pez.mini.ChironexFleckeri 0.5 | 16 | 6% | 30 |
| fm.claire 1.7 | 14 | 5% | 20 |
| abud.ThirdRobo 1.0 | 1 | 0% | 6 |

## Melee bench: F46

hadur117.nano.SanaroLL 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 70.1 | 32 / 350 | 3.69 | 12.7% | 28952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 18.2% | 145 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 17.1% | 143 |
| hadur117.nano.SanaroLL 0.2 | 3.0 | 12.7% | 32 |
| mz.MicroSheep 1.0 | 4.4 | 10.5% | 9 |
| cx.Princess 1.0 | 4.8 | 10.3% | 18 |
| sadoner.killer 0.2 | 6.0 | 9.1% | 2 |
| arthord.NanoSatanMelee Beta | 6.9 | 7.7% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.1% | 0 |
| kurios.DOSexe .9a | 8.9 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.8 | 68.9 | 2 / 35 | 3233 |
| 2 | 3 | 58.1 | 66.7 | 1 / 35 | 2775 |
| 3 | 3 | 57.9 | 65.4 | 4 / 35 | 2895 |
| 4 | 3 | 60.6 | 74.6 | 5 / 35 | 2802 |
| 5 | 3 | 58.8 | 70.8 | 1 / 35 | 2783 |
| 6 | 3 | 61.2 | 75.2 | 4 / 35 | 2992 |
| 7 | 3 | 59.7 | 69.2 | 6 / 35 | 3006 |
| 8 | 3 | 59.0 | 69.2 | 4 / 35 | 2891 |
| 9 | 3 | 57.9 | 68.9 | 1 / 35 | 2602 |
| 10 | 3 | 60.0 | 71.7 | 4 / 35 | 2973 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 67 | 28% |
| rsalesc.melee.Medina 0.4.5 | 32 | 25% |
| cx.Princess 1.0 | 8 | 63% |
| mz.MicroSheep 1.0 | 5 | 0% |

Hadur died in 318 of 350 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 140 | 44% | 159 |
| rsalesc.melee.Medina 0.4.5 | 88 | 28% | 96 |
| mz.MicroSheep 1.0 | 26 | 8% | 27 |
| cx.Princess 1.0 | 22 | 7% | 26 |
| sadoner.killer 0.2 | 21 | 7% | 21 |
| arthord.NanoSatanMelee Beta | 10 | 3% | 10 |
| jeremyreeder.collective.Prophet 5 | 7 | 2% | 7 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 2 |

