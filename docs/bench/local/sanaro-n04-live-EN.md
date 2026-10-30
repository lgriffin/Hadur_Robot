# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 71.7 | 28 / 350 | 3.55 | 13.5% | 37988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.7% | 255 |
| hadur117.nano.SanaroEN 0.1 | 2.3 | 13.5% | 28 |
| sgp.JollyNinja 3.53 | 3.3 | 12.0% | 35 |
| mz.MicroGodMelee 1 | 4.4 | 11.1% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.8% | 10 |
| lorneswork.Predator 1.0 | 5.6 | 9.8% | 7 |
| adt.Ar2 1.0 | 6.9 | 8.2% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.6% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 9.9 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 74.0 | 3 / 35 | 4341 |
| 2 | 2 | 61.9 | 75.6 | 4 / 35 | 3616 |
| 3 | 3 | 59.4 | 67.9 | 0 / 35 | 3659 |
| 4 | 2 | 62.3 | 77.1 | 4 / 35 | 3794 |
| 5 | 2 | 63.1 | 78.4 | 4 / 35 | 4024 |
| 6 | 3 | 58.8 | 66.7 | 2 / 35 | 3770 |
| 7 | 2 | 60.8 | 70.5 | 3 / 35 | 3946 |
| 8 | 3 | 58.5 | 65.1 | 2 / 35 | 3664 |
| 9 | 2 | 60.6 | 74.0 | 3 / 35 | 3521 |
| 10 | 2 | 59.7 | 67.3 | 3 / 35 | 3653 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 130 | 6% |
| sgp.JollyNinja 3.53 | 16 | 31% |
| mz.MicroGodMelee 1 | 12 | 75% |
| lorneswork.Predator 1.0 | 5 | 40% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 67% |
| adt.Ar2 1.0 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 323 of 350 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 172 | 53% | 181 |
| sgp.JollyNinja 3.53 | 46 | 14% | 54 |
| mz.MicroGodMelee 1 | 33 | 10% | 39 |
| lorneswork.Predator 1.0 | 27 | 8% | 29 |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 7% | 25 |
| adt.Ar2 1.0 | 14 | 4% | 14 |
| skm.butterfly 1.0 | 4 | 1% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 3 |
| mym.EdgeStalker 1.0 | 1 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 63.2 | 52 / 350 | 4.31 | 13.2% | 40560 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.4 | 14.7% | 84 |
| pulsar.PulsarMax 0.8.9 | 1.9 | 14.8% | 107 |
| hadur117.nano.SanaroEN 0.1 | 2.7 | 13.2% | 52 |
| lrem.micro.SpikeSoldier 0.4 | 4.1 | 11.4% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 10.0% | 28 |
| sch.Simone 0.3d | 6.8 | 8.4% | 32 |
| fnc.bandit.Bandit 5.2.0 | 7.3 | 7.6% | 5 |
| Noran.BitchingElk 0.054 | 7.4 | 7.8% | 21 |
| stelo.PatternRobot 1.0 | 8.4 | 7.0% | 13 |
| fullsail.SweetTea 1.1 | 10.0 | 4.8% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 66.0 | 4 / 35 | 3984 |
| 2 | 3 | 56.8 | 57.1 | 4 / 35 | 4063 |
| 3 | 3 | 58.0 | 60.3 | 6 / 35 | 3947 |
| 4 | 3 | 55.8 | 54.9 | 5 / 35 | 3714 |
| 5 | 3 | 56.7 | 59.0 | 3 / 35 | 3938 |
| 6 | 1 | 62.7 | 73.7 | 6 / 35 | 4417 |
| 7 | 2 | 59.7 | 65.1 | 5 / 35 | 4265 |
| 8 | 3 | 59.1 | 62.9 | 7 / 35 | 3792 |
| 9 | 3 | 61.1 | 67.9 | 6 / 35 | 4187 |
| 10 | 3 | 60.3 | 65.4 | 6 / 35 | 4253 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 43% |
| pulsar.PulsarMax 0.8.9 | 35 | 34% |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 50% |
| sch.Simone 0.3d | 10 | 60% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 89% |
| stelo.PatternRobot 1.0 | 4 | 0% |
| fnc.bandit.Bandit 5.2.0 | 3 | 33% |
| fullsail.SweetTea 1.1 | 2 | 0% |
| Noran.BitchingElk 0.054 | 2 | 0% |

Hadur died in 298 of 350 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 81 | 27% | 93 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 76 | 26% | 94 |
| lrem.micro.SpikeSoldier 0.4 | 42 | 14% | 48 |
| fnc.bandit.Bandit 5.2.0 | 24 | 8% | 26 |
| com.cohesiva.robocode.ManOwaR 1.0 | 20 | 7% | 25 |
| stelo.PatternRobot 1.0 | 19 | 6% | 20 |
| sch.Simone 0.3d | 17 | 6% | 23 |
| fullsail.SweetTea 1.1 | 11 | 4% | 11 |
| Noran.BitchingElk 0.054 | 8 | 3% | 10 |

## Melee bench: F03

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 77.1 | 82 / 350 | 3.06 | 15.0% | 42352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroEN 0.1 | 1.8 | 15.0% | 82 |
| radnor.DoctorBob 1.42 | 1.9 | 15.4% | 98 |
| kawigi.nano.Lib 1.0 | 2.7 | 14.4% | 90 |
| vuen.Cake 2.51 | 3.6 | 13.3% | 60 |
| urdos.URDOS 1.3 | 5.1 | 10.1% | 15 |
| adt.Ar1 2.1 | 6.6 | 7.8% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 7.4% | 2 |
| oa.weak.FlyMk1 0.1 | 7.4 | 7.0% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.1% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 80.6 | 8 / 35 | 4155 |
| 2 | 3 | 60.9 | 71.7 | 4 / 35 | 4177 |
| 3 | 2 | 63.2 | 79.4 | 9 / 35 | 4073 |
| 4 | 1 | 63.6 | 78.4 | 9 / 35 | 4415 |
| 5 | 2 | 62.0 | 74.0 | 7 / 35 | 4382 |
| 6 | 1 | 63.9 | 81.0 | 9 / 35 | 4385 |
| 7 | 2 | 62.5 | 75.6 | 11 / 35 | 4084 |
| 8 | 2 | 62.6 | 77.5 | 9 / 35 | 3970 |
| 9 | 1 | 64.4 | 79.7 | 10 / 35 | 4691 |
| 10 | 3 | 61.7 | 73.3 | 6 / 35 | 4020 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 63 | 44% |
| radnor.DoctorBob 1.42 | 53 | 57% |
| kawigi.nano.Lib 1.0 | 43 | 16% |
| urdos.URDOS 1.3 | 13 | 62% |
| oa.weak.FlyMk1 0.1 | 6 | 83% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 75% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 270 of 350 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 79 | 29% | 107 |
| kawigi.nano.Lib 1.0 | 72 | 27% | 84 |
| vuen.Cake 2.51 | 55 | 20% | 79 |
| urdos.URDOS 1.3 | 36 | 13% | 44 |
| ghent.ArthurPanzergon 1.0.0 | 9 | 3% | 10 |
| adt.Ar1 2.1 | 7 | 3% | 8 |
| oa.weak.FlyMk1 0.1 | 5 | 2% | 10 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 4 | 1% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 1% | 3 |

## Melee bench: F04

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 68.1 | 5 / 350 | 3.87 | 13.5% | 44795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.1% | 321 |
| apc.LeeroyJenkins2 1.0 | 2.2 | 13.9% | 13 |
| hadur117.nano.SanaroEN 0.1 | 2.8 | 13.5% | 5 |
| TNT.TNT 0.99.1 | 4.0 | 10.6% | 6 |
| josago.Jorgito 0.16 | 5.0 | 9.1% | 3 |
| css.Delitioner 0.11 | 6.2 | 7.7% | 0 |
| tj.zombie1n 1.0.1 | 6.9 | 7.1% | 0 |
| rampancy.Durandal 2.1d | 8.1 | 5.5% | 1 |
| sp.Nanos.Ember 1.1 | 8.9 | 4.6% | 1 |
| spin.Bugstard 0.012b | 9.9 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.9 | 67.9 | 1 / 35 | 4062 |
| 2 | 3 | 60.2 | 67.0 | 0 / 35 | 4156 |
| 3 | 3 | 61.4 | 67.9 | 0 / 35 | 4233 |
| 4 | 3 | 62.6 | 69.5 | 0 / 35 | 4931 |
| 5 | 3 | 60.9 | 67.3 | 1 / 35 | 4309 |
| 6 | 3 | 63.1 | 73.3 | 0 / 35 | 4629 |
| 7 | 3 | 61.1 | 65.7 | 1 / 35 | 4439 |
| 8 | 2 | 61.8 | 67.3 | 0 / 35 | 4870 |
| 9 | 2 | 61.7 | 67.3 | 1 / 35 | 4723 |
| 10 | 3 | 61.4 | 67.6 | 1 / 35 | 4443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 118 | 2% |
| TNT.TNT 0.99.1 | 3 | 33% |
| apc.LeeroyJenkins2 1.0 | 3 | 33% |
| josago.Jorgito 0.16 | 2 | 50% |

Hadur died in 345 of 350 rounds, at a mean tick of 1089. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 193 | 56% | 195 |
| apc.LeeroyJenkins2 1.0 | 69 | 20% | 70 |
| josago.Jorgito 0.16 | 28 | 8% | 29 |
| TNT.TNT 0.99.1 | 20 | 6% | 21 |
| tj.zombie1n 1.0.1 | 13 | 4% | 13 |
| rampancy.Durandal 2.1d | 11 | 3% | 11 |
| css.Delitioner 0.11 | 8 | 2% | 8 |
| sp.Nanos.Ember 1.1 | 3 | 1% | 3 |

## Melee bench: F06

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 64.7 | 46 / 350 | 4.17 | 12.5% | 31884 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.2 | 16.1% | 106 |
| origin.SleepSiphon 1.7b | 2.2 | 14.4% | 110 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.2 | 12.6% | 55 |
| hadur117.nano.SanaroEN 0.1 | 3.8 | 12.5% | 46 |
| mld.Wisdom 1.0 | 4.6 | 11.3% | 16 |
| gg.Wolverine 2.0 | 6.3 | 8.6% | 7 |
| spinnercat.Omen 1.0 | 7.1 | 8.0% | 4 |
| DBall.NUKE 0.1 | 8.0 | 7.2% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 8.6 | 6.3% | 7 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 69.8 | 5 / 35 | 3200 |
| 2 | 5 | 55.5 | 59.7 | 2 / 35 | 2920 |
| 3 | 3 | 57.4 | 63.8 | 4 / 35 | 3206 |
| 4 | 4 | 56.7 | 61.9 | 3 / 35 | 3006 |
| 5 | 5 | 56.8 | 61.3 | 5 / 35 | 2991 |
| 6 | 3 | 61.0 | 70.8 | 6 / 35 | 3632 |
| 7 | 4 | 57.6 | 61.6 | 4 / 35 | 3223 |
| 8 | 2 | 61.7 | 72.7 | 5 / 35 | 3757 |
| 9 | 5 | 56.8 | 61.9 | 5 / 35 | 2940 |
| 10 | 4 | 57.9 | 63.8 | 7 / 35 | 3009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 35 | 46% |
| origin.SleepSiphon 1.7b | 28 | 29% |
| pe.minimelee.SandboxMiniMelee 1.1 | 12 | 50% |
| gg.Wolverine 2.0 | 8 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 43% |
| mld.Wisdom 1.0 | 6 | 50% |
| DBall.NUKE 0.1 | 4 | 75% |
| spinnercat.Omen 1.0 | 1 | 0% |

Hadur died in 305 of 350 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 103 | 34% | 118 |
| origin.SleepSiphon 1.7b | 64 | 21% | 76 |
| pe.minimelee.SandboxMiniMelee 1.1 | 47 | 15% | 55 |
| mld.Wisdom 1.0 | 44 | 14% | 46 |
| spinnercat.Omen 1.0 | 19 | 6% | 19 |
| gg.Wolverine 2.0 | 11 | 4% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 3% | 13 |
| DBall.NUKE 0.1 | 3 | 1% | 5 |
| sample.Fire 1.0 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 80.3 | 85 / 350 | 2.77 | 16.3% | 48675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.6 | 17.9% | 112 |
| rtk.Tachikoma 1.0 | 1.7 | 17.7% | 94 |
| hadur117.nano.SanaroEN 0.1 | 2.7 | 16.3% | 85 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.8% | 26 |
| franzor.Lizt 1.3.1 | 4.8 | 10.9% | 33 |
| lrem.micro.MoggFanatic 0.2 | 6.1 | 8.5% | 0 |
| exauge.GateKeeper 1.1.121g | 6.9 | 7.4% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.1 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 9.9 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.5 | 81.3 | 8 / 35 | 4611 |
| 2 | 3 | 66.4 | 81.3 | 7 / 35 | 4755 |
| 3 | 3 | 65.5 | 77.5 | 4 / 35 | 4588 |
| 4 | 3 | 67.0 | 81.0 | 11 / 35 | 4960 |
| 5 | 3 | 66.8 | 81.6 | 7 / 35 | 4853 |
| 6 | 3 | 66.3 | 77.8 | 8 / 35 | 4771 |
| 7 | 3 | 67.3 | 80.3 | 9 / 35 | 5284 |
| 8 | 1 | 67.9 | 85.1 | 11 / 35 | 5130 |
| 9 | 2 | 67.1 | 80.6 | 11 / 35 | 5137 |
| 10 | 3 | 65.8 | 77.1 | 9 / 35 | 4586 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 102 | 57% |
| rsalesc.melee.Monk 0.3.6c | 50 | 14% |
| oog.melee.CapuletDroid 1.1 | 27 | 52% |
| franzor.Lizt 1.3.1 | 7 | 43% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 266 of 350 rounds, at a mean tick of 1218. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 121 | 45% | 181 |
| rsalesc.melee.Monk 0.3.6c | 91 | 34% | 101 |
| oog.melee.CapuletDroid 1.1 | 31 | 12% | 45 |
| exauge.GateKeeper 1.1.121g | 9 | 3% | 12 |
| franzor.Lizt 1.3.1 | 7 | 3% | 4 |
| lrem.micro.MoggFanatic 0.2 | 5 | 2% | 5 |
| skm.PateranBotlock2 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 66.3 | 58 / 350 | 4.04 | 12.7% | 30348 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| shrub.Vapour v159 | 1.8 | 14.1% | 88 |
| tm.Yuugao 1.0 | 2.0 | 13.7% | 97 |
| hadur117.nano.SanaroEN 0.1 | 2.5 | 12.7% | 58 |
| Krabb.sliNk.Garm 0.9u | 4.4 | 10.8% | 40 |
| m3thos.Eva00 1.1 | 5.2 | 9.6% | 12 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 10.2% | 38 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.2% | 11 |
| SHAM.WOW 1.4 | 8.4 | 7.2% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.9% | 2 |
| qualidafial.MajorDick 1.0.1 | 9.5 | 6.5% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.7 | 72.7 | 6 / 35 | 3295 |
| 2 | 3 | 56.3 | 65.7 | 1 / 35 | 2839 |
| 3 | 2 | 61.3 | 76.5 | 11 / 35 | 2978 |
| 4 | 1 | 59.3 | 70.2 | 10 / 35 | 3105 |
| 5 | 4 | 54.2 | 55.9 | 4 / 35 | 3228 |
| 6 | 1 | 58.0 | 66.0 | 12 / 35 | 3075 |
| 7 | 3 | 54.8 | 60.3 | 3 / 35 | 2874 |
| 8 | 4 | 54.4 | 60.3 | 3 / 35 | 2683 |
| 9 | 3 | 57.6 | 66.3 | 5 / 35 | 3068 |
| 10 | 3 | 58.7 | 68.6 | 3 / 35 | 3203 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 34 | 21% |
| tm.Yuugao 1.0 | 34 | 44% |
| com.spp.robocode.MostlyHarmless 010 | 20 | 35% |
| Krabb.sliNk.Garm 0.9u | 15 | 67% |
| m3thos.Eva00 1.1 | 8 | 63% |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 25% |
| SHAM.WOW 1.4 | 3 | 100% |

Hadur died in 293 of 350 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 68 | 23% | 81 |
| tm.Yuugao 1.0 | 62 | 21% | 81 |
| com.spp.robocode.MostlyHarmless 010 | 41 | 14% | 50 |
| Krabb.sliNk.Garm 0.9u | 36 | 12% | 40 |
| m3thos.Eva00 1.1 | 30 | 10% | 32 |
| zyx.nano.BacillusComma 1.0 | 19 | 6% | 22 |
| SHAM.WOW 1.4 | 13 | 4% | 17 |
| jwst.DAD.DarkAndDarker 1.1 | 13 | 4% | 16 |
| qualidafial.MajorDick 1.0.1 | 11 | 4% | 10 |

## Melee bench: F09

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.2 | 57.5 | 20 / 350 | 4.83 | 11.1% | 28934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 17.9% | 183 |
| kc.micro.Figment 1.0 | 1.9 | 15.4% | 72 |
| yagami.Tidus 0.11 | 3.7 | 11.5% | 5 |
| hadur117.nano.SanaroEN 0.1 | 4.0 | 11.1% | 20 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.5% | 28 |
| mc2.enemy.Original 0.9 | 5.3 | 9.9% | 37 |
| dft.Calliope 5.6 | 7.0 | 7.9% | 4 |
| step.nanoPri 1.0 | 8.6 | 5.8% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.2% | 0 |
| rdm.Dueler 0.4x | 9.4 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.3 | 58.1 | 0 / 35 | 2794 |
| 2 | 5 | 54.2 | 55.6 | 1 / 35 | 2918 |
| 3 | 5 | 52.0 | 49.5 | 2 / 35 | 2575 |
| 4 | 6 | 52.3 | 51.4 | 1 / 35 | 2731 |
| 5 | 4 | 56.1 | 60.0 | 3 / 35 | 2960 |
| 6 | 3 | 56.2 | 60.6 | 0 / 35 | 2930 |
| 7 | 3 | 57.5 | 62.9 | 4 / 35 | 3004 |
| 8 | 5 | 54.3 | 54.6 | 3 / 35 | 2899 |
| 9 | 3 | 58.0 | 63.2 | 4 / 35 | 3251 |
| 10 | 3 | 55.9 | 58.7 | 2 / 35 | 2872 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 49 | 10% |
| kc.micro.Figment 1.0 | 19 | 32% |
| mc2.enemy.Original 0.9 | 7 | 29% |
| pedersen.Grishnakh 1.0 | 5 | 40% |
| yagami.Tidus 0.11 | 2 | 100% |
| dft.Calliope 5.6 | 2 | 100% |
| rdm.Dueler 0.4x | 1 | 100% |

Hadur died in 330 of 350 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 110 | 33% | 115 |
| kc.micro.Figment 1.0 | 54 | 16% | 59 |
| yagami.Tidus 0.11 | 54 | 16% | 57 |
| mc2.enemy.Original 0.9 | 41 | 12% | 44 |
| pedersen.Grishnakh 1.0 | 35 | 11% | 37 |
| robar.nano.Assertive_Melee 0.2 | 13 | 4% | 13 |
| dft.Calliope 5.6 | 10 | 3% | 12 |
| step.nanoPri 1.0 | 9 | 3% | 9 |
| rdm.Dueler 0.4x | 4 | 1% | 4 |

## Melee bench: F10

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 77.4 | 101 / 350 | 3.03 | 15.3% | 42250 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroEN 0.1 | 1.7 | 15.3% | 101 |
| DTF.Kludgy 1.2b | 2.2 | 14.7% | 97 |
| ejb.Polaris 1.0.1 | 3.2 | 13.4% | 44 |
| ne.Chimera 1.2 | 3.3 | 13.3% | 39 |
| tvv.micro.Antares 1.1.1 | 5.1 | 11.0% | 37 |
| vStar.RAFzilla 2.15 | 5.5 | 10.6% | 19 |
| sam.Samspin 1.0 | 7.5 | 6.4% | 4 |
| kurios.DOSexe .9b | 8.3 | 5.8% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.4 | 5.5% | 3 |
| donjezza.Muncho 1.0 | 9.8 | 4.1% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 84.1 | 10 / 35 | 4144 |
| 2 | 3 | 61.3 | 73.0 | 6 / 35 | 3799 |
| 3 | 4 | 60.6 | 67.9 | 8 / 35 | 3775 |
| 4 | 1 | 64.6 | 79.4 | 15 / 35 | 4425 |
| 5 | 2 | 62.3 | 73.7 | 10 / 35 | 4162 |
| 6 | 1 | 66.1 | 83.5 | 11 / 35 | 4876 |
| 7 | 2 | 61.1 | 72.1 | 4 / 35 | 4111 |
| 8 | 1 | 63.4 | 78.4 | 11 / 35 | 4099 |
| 9 | 1 | 65.2 | 81.6 | 14 / 35 | 4324 |
| 10 | 1 | 64.6 | 80.6 | 12 / 35 | 4535 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 55 | 75% |
| DTF.Kludgy 1.2b | 45 | 42% |
| vStar.RAFzilla 2.15 | 25 | 68% |
| ne.Chimera 1.2 | 22 | 41% |
| tvv.micro.Antares 1.1.1 | 16 | 44% |
| donjezza.Muncho 1.0 | 5 | 40% |
| kurios.DOSexe .9b | 4 | 75% |
| sam.Samspin 1.0 | 3 | 67% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 50% |

Hadur died in 250 of 350 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 72 | 29% | 86 |
| ne.Chimera 1.2 | 65 | 26% | 72 |
| ejb.Polaris 1.0.1 | 34 | 14% | 83 |
| tvv.micro.Antares 1.1.1 | 29 | 12% | 33 |
| vStar.RAFzilla 2.15 | 19 | 8% | 35 |
| sam.Samspin 1.0 | 15 | 6% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 3% | 7 |
| donjezza.Muncho 1.0 | 6 | 2% | 8 |
| kurios.DOSexe .9b | 3 | 1% | 7 |

## Melee bench: F11

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.4 | 61.3 | 34 / 350 | 4.48 | 12.0% | 31773 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.7% | 160 |
| cx.mini.Nimrod 0.55 | 2.3 | 12.8% | 43 |
| hadur117.nano.SanaroEN 0.1 | 3.1 | 12.0% | 34 |
| djc.DynaBot 0.1.1 | 3.7 | 11.5% | 34 |
| rdt199.Warlord 0.73 | 5.6 | 9.5% | 26 |
| br2.MobyDickBot 1.6 | 6.0 | 9.2% | 27 |
| uji.YellohFellah 1.0 | 6.6 | 8.6% | 23 |
| KiraNL.Chupacabra 0.4 | 7.7 | 8.0% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.7% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.0 | 62.9 | 3 / 35 | 3231 |
| 2 | 2 | 58.5 | 66.7 | 6 / 35 | 3129 |
| 3 | 3 | 59.1 | 67.0 | 6 / 35 | 3405 |
| 4 | 5 | 51.2 | 50.5 | 3 / 35 | 2573 |
| 5 | 4 | 53.2 | 55.6 | 0 / 35 | 2916 |
| 6 | 2 | 57.4 | 62.9 | 4 / 35 | 3298 |
| 7 | 3 | 57.1 | 63.2 | 2 / 35 | 3217 |
| 8 | 3 | 57.2 | 62.9 | 3 / 35 | 3416 |
| 9 | 3 | 57.5 | 61.6 | 5 / 35 | 3414 |
| 10 | 3 | 55.9 | 60.0 | 2 / 35 | 3174 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 38 | 37% |
| cx.mini.Nimrod 0.55 | 11 | 64% |
| djc.DynaBot 0.1.1 | 11 | 55% |
| uji.YellohFellah 1.0 | 7 | 0% |
| rdt199.Warlord 0.73 | 6 | 67% |
| br2.MobyDickBot 1.6 | 3 | 33% |
| KiraNL.Chupacabra 0.4 | 3 | 67% |

Hadur died in 316 of 350 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 118 | 37% | 128 |
| cx.mini.Nimrod 0.55 | 52 | 16% | 57 |
| rdt199.Warlord 0.73 | 43 | 14% | 49 |
| djc.DynaBot 0.1.1 | 31 | 10% | 36 |
| jeremyreeder.Vincent 2011.12.09 | 19 | 6% | 20 |
| uji.YellohFellah 1.0 | 17 | 5% | 20 |
| KiraNL.Chupacabra 0.4 | 13 | 4% | 14 |
| stelo.MirrorNano 1.3 | 12 | 4% | 12 |
| br2.MobyDickBot 1.6 | 11 | 3% | 14 |

## Melee bench: F12

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 64.9 | 47 / 350 | 4.16 | 12.5% | 29876 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.8 | 14.2% | 102 |
| bts.wiki.RipCurl 0.9b | 2.0 | 14.5% | 85 |
| darkcanuck.Leon 1.01 | 2.8 | 13.6% | 69 |
| hadur117.nano.SanaroEN 0.1 | 3.6 | 12.5% | 47 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.9% | 28 |
| jrm.Test0 1.0 | 6.4 | 8.3% | 3 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.4% | 2 |
| jp.Perpy 16.0 | 7.5 | 7.4% | 3 |
| jaybot.bots.Oddball 4.0 | 9.1 | 5.9% | 11 |
| stuff.Vlad 0.1 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 51.2 | 47.9 | 3 / 35 | 2785 |
| 2 | 4 | 59.7 | 69.2 | 6 / 35 | 3028 |
| 3 | 1 | 62.8 | 79.7 | 7 / 35 | 3350 |
| 4 | 4 | 56.0 | 61.0 | 4 / 35 | 2922 |
| 5 | 4 | 57.0 | 64.4 | 3 / 35 | 2967 |
| 6 | 3 | 58.4 | 66.3 | 4 / 35 | 3180 |
| 7 | 4 | 57.0 | 63.8 | 7 / 35 | 2677 |
| 8 | 4 | 58.3 | 66.0 | 4 / 35 | 3117 |
| 9 | 2 | 59.7 | 72.1 | 6 / 35 | 2949 |
| 10 | 5 | 55.0 | 58.1 | 3 / 35 | 2901 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 38 | 24% |
| bts.wiki.RipCurl 0.9b | 34 | 56% |
| darkcanuck.Leon 1.01 | 33 | 21% |
| brainfade.melee.Genghis 0.36 | 16 | 50% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 3 | 0% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 303 of 350 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 67 | 22% | 85 |
| nat.PallasHawk 1.0 | 67 | 22% | 78 |
| darkcanuck.Leon 1.01 | 58 | 19% | 67 |
| brainfade.melee.Genghis 0.36 | 36 | 12% | 40 |
| jrm.Test0 1.0 | 20 | 7% | 20 |
| jp.Perpy 16.0 | 20 | 7% | 20 |
| cs.sheldor.Talon 1.1 | 18 | 6% | 23 |
| jaybot.bots.Oddball 4.0 | 13 | 4% | 12 |
| stuff.Vlad 0.1 | 4 | 1% | 5 |

## Melee bench: F13

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 70.4 | 27 / 350 | 3.66 | 12.9% | 32550 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.2 | 17.8% | 185 |
| ags.Glacier 0.2.11 | 1.8 | 16.4% | 76 |
| hadur117.nano.SanaroEN 0.1 | 3.6 | 12.9% | 27 |
| gh.micro.Gruweltje 0.7 | 4.2 | 12.3% | 27 |
| shinh.Entangled 0.3 | 4.2 | 12.2% | 30 |
| apc.Colossus2 0.17 | 6.3 | 8.0% | 1 |
| stelo.Wang 1.0 | 6.7 | 7.3% | 4 |
| ayk.WallHugger 1.0 | 8.2 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.1 | 67.3 | 2 / 35 | 2820 |
| 2 | 3 | 60.3 | 71.1 | 4 / 35 | 3155 |
| 3 | 3 | 61.4 | 73.7 | 5 / 35 | 3444 |
| 4 | 3 | 59.7 | 70.2 | 2 / 35 | 3405 |
| 5 | 5 | 57.8 | 65.4 | 0 / 35 | 3273 |
| 6 | 4 | 59.2 | 70.2 | 1 / 35 | 3122 |
| 7 | 4 | 59.3 | 66.7 | 4 / 35 | 3306 |
| 8 | 3 | 62.7 | 77.8 | 6 / 35 | 3618 |
| 9 | 4 | 59.5 | 69.5 | 1 / 35 | 3343 |
| 10 | 3 | 59.9 | 72.7 | 2 / 35 | 3064 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 65 | 28% |
| ags.Glacier 0.2.11 | 46 | 9% |
| shinh.Entangled 0.3 | 18 | 22% |
| gh.micro.Gruweltje 0.7 | 7 | 14% |

Hadur died in 323 of 350 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 100 | 31% | 116 |
| ags.Glacier 0.2.11 | 92 | 28% | 98 |
| gh.micro.Gruweltje 0.7 | 51 | 16% | 51 |
| shinh.Entangled 0.3 | 44 | 14% | 48 |
| stelo.Wang 1.0 | 20 | 6% | 20 |
| apc.Colossus2 0.17 | 7 | 2% | 7 |
| ayk.WallHugger 1.0 | 6 | 2% | 5 |
| maribo.FollowFire 1 | 3 | 1% | 4 |

## Melee bench: F14

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 75.3 | 85 / 350 | 3.22 | 14.5% | 36926 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.3% | 143 |
| hadur117.nano.SanaroEN 0.1 | 2.1 | 14.5% | 85 |
| catcat20.shape.Theta 0.018 | 2.9 | 12.4% | 53 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 10.3% | 15 |
| Lo_Ian.Gandalf_V4 4.0 | 5.4 | 9.9% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.4 | 10.3% | 3 |
| sanyi.mikrobi.Roberto 1.0 | 6.8 | 9.4% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.1 | 8.5% | 21 |
| pa.Improved 1.0 | 9.0 | 5.4% | 3 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 71.7 | 9 / 35 | 3403 |
| 2 | 3 | 62.1 | 75.6 | 11 / 35 | 3302 |
| 3 | 2 | 63.7 | 79.0 | 11 / 35 | 3667 |
| 4 | 2 | 62.7 | 76.8 | 7 / 35 | 3663 |
| 5 | 2 | 62.7 | 77.5 | 7 / 35 | 3711 |
| 6 | 2 | 61.2 | 72.1 | 9 / 35 | 3617 |
| 7 | 2 | 62.1 | 73.0 | 6 / 35 | 3901 |
| 8 | 2 | 63.1 | 76.2 | 8 / 35 | 3978 |
| 9 | 2 | 63.4 | 79.0 | 9 / 35 | 3953 |
| 10 | 2 | 61.5 | 72.1 | 8 / 35 | 3731 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 83 | 42% |
| catcat20.shape.Theta 0.018 | 36 | 67% |
| sheldor.micro.PointInLineRRAL 1.0 | 19 | 58% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 67% |
| Lo_Ian.Gandalf_V4 4.0 | 9 | 22% |
| sanyi.mikrobi.Roberto 1.0 | 5 | 40% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 75% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 265 of 350 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 125 | 47% | 161 |
| Lo_Ian.Gandalf_V4 4.0 | 31 | 12% | 33 |
| catcat20.shape.Theta 0.018 | 30 | 11% | 51 |
| dmh.robocode.robot.RedDwarf 0.4 | 28 | 11% | 32 |
| sheldor.micro.PointInLineRRAL 1.0 | 19 | 7% | 32 |
| sanyi.mikrobi.Roberto 1.0 | 14 | 5% | 20 |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 4% | 12 |
| pa.Improved 1.0 | 5 | 2% | 5 |
| sample.TrackFire 1.0 | 2 | 1% | 3 |

## Melee bench: F15

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 59.0 | 36 / 350 | 4.69 | 11.9% | 35165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.5 | 14.7% | 75 |
| emp.Yngwie 1.11 | 2.3 | 13.8% | 107 |
| mld.DustBunny 3.8 | 2.5 | 13.6% | 45 |
| hadur117.nano.SanaroEN 0.1 | 4.0 | 11.9% | 36 |
| cb.nano.Insomnia 1.0 | 5.0 | 11.1% | 25 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.4% | 52 |
| lambdaxy.TBot 0.1 | 7.4 | 7.4% | 0 |
| Grystrion.TrackerWO 1.0 | 7.6 | 7.3% | 2 |
| divineomega.TrialBot 0.003 | 9.2 | 5.7% | 9 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.2 | 53.3 | 3 / 35 | 3748 |
| 2 | 5 | 52.8 | 51.1 | 4 / 35 | 2982 |
| 3 | 4 | 57.2 | 62.5 | 3 / 35 | 3347 |
| 4 | 4 | 56.9 | 61.6 | 3 / 35 | 3520 |
| 5 | 4 | 55.7 | 59.7 | 0 / 35 | 3562 |
| 6 | 2 | 59.5 | 66.0 | 7 / 35 | 3855 |
| 7 | 5 | 55.5 | 57.1 | 6 / 35 | 3068 |
| 8 | 3 | 59.4 | 65.4 | 4 / 35 | 3892 |
| 9 | 5 | 54.0 | 54.0 | 1 / 35 | 3292 |
| 10 | 4 | 57.4 | 59.0 | 5 / 35 | 3899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 30 | 60% |
| kawigi.micro.Shiz 1.1 | 21 | 19% |
| cb.nano.Insomnia 1.0 | 11 | 55% |
| mld.DustBunny 3.8 | 9 | 33% |
| kawigi.robot.Girl 1.2 | 6 | 50% |
| divineomega.TrialBot 0.003 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 314 of 350 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 71 | 23% | 74 |
| mld.DustBunny 3.8 | 62 | 20% | 71 |
| emp.Yngwie 1.11 | 60 | 19% | 79 |
| cb.nano.Insomnia 1.0 | 56 | 18% | 55 |
| kawigi.robot.Girl 1.2 | 25 | 8% | 29 |
| Grystrion.TrackerWO 1.0 | 15 | 5% | 16 |
| lambdaxy.TBot 0.1 | 14 | 4% | 14 |
| divineomega.TrialBot 0.003 | 9 | 3% | 10 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 1% | 2 |

## Melee bench: F16

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 62.3 | 36 / 350 | 4.40 | 12.8% | 38894 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.7% | 151 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.0 | 15.7% | 40 |
| hadur117.nano.SanaroEN 0.1 | 3.1 | 12.8% | 36 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 11.0% | 77 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.7% | 21 |
| bvh.fnr.Fenrir 0.36l | 5.6 | 9.6% | 12 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 8.0% | 5 |
| divineomega.DivineBot 1.9.4.5 | 8.4 | 5.8% | 8 |
| repositorio.NanoStep 1.0 | 9.3 | 5.2% | 0 |
| asd.Cthulhu 1.3 | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 63.5 | 5 / 35 | 4107 |
| 2 | 3 | 57.1 | 60.0 | 3 / 35 | 3486 |
| 3 | 3 | 59.8 | 65.1 | 4 / 35 | 3777 |
| 4 | 3 | 58.1 | 62.2 | 2 / 35 | 3711 |
| 5 | 3 | 57.1 | 58.1 | 4 / 35 | 3815 |
| 6 | 3 | 59.8 | 62.2 | 5 / 35 | 4083 |
| 7 | 4 | 58.2 | 62.2 | 4 / 35 | 3505 |
| 8 | 3 | 57.3 | 58.7 | 1 / 35 | 3861 |
| 9 | 3 | 61.0 | 66.7 | 2 / 35 | 4366 |
| 10 | 3 | 60.1 | 63.8 | 6 / 35 | 4183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 46 | 7% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 25 | 72% |
| bvh.fnr.Fenrir 0.36l | 6 | 67% |
| techdude.forest.FlamingForest 1.1 | 6 | 33% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 75% |
| tvv.nano.Polaris 1.2 | 3 | 33% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 314 of 350 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 104 | 33% | 111 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 84 | 27% | 90 |
| bvh.fnr.Fenrir 0.36l | 43 | 14% | 47 |
| techdude.forest.FlamingForest 1.1 | 31 | 10% | 40 |
| tvv.nano.Polaris 1.2 | 21 | 7% | 23 |
| stelo.IntrinsicVolatility 1.4 | 13 | 4% | 15 |
| asd.Cthulhu 1.3 | 8 | 3% | 9 |
| divineomega.DivineBot 1.9.4.5 | 7 | 2% | 11 |
| repositorio.NanoStep 1.0 | 3 | 1% | 3 |

## Melee bench: F17

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 63.7 | 49 / 350 | 4.27 | 12.8% | 37412 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 1.9 | 14.2% | 94 |
| et.Predator 1.8 | 2.0 | 14.1% | 73 |
| hadur117.nano.SanaroEN 0.1 | 3.4 | 12.8% | 49 |
| cx.BlestPain 1.41 | 3.4 | 13.0% | 77 |
| nic.Nicator 2.4 | 5.1 | 11.4% | 28 |
| ahf.NanoAndrew .4 | 5.2 | 11.2% | 23 |
| maribo.melee.BMV 0.1 | 7.0 | 9.3% | 6 |
| tex.Longbot 0.4 | 8.5 | 5.6% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.1 | 58.1 | 3 / 35 | 3413 |
| 2 | 1 | 63.0 | 73.3 | 9 / 35 | 4263 |
| 3 | 5 | 57.4 | 62.2 | 1 / 35 | 3290 |
| 4 | 3 | 59.9 | 64.4 | 8 / 35 | 3739 |
| 5 | 5 | 55.8 | 56.8 | 1 / 35 | 3511 |
| 6 | 2 | 59.0 | 64.1 | 5 / 35 | 3950 |
| 7 | 2 | 62.0 | 71.1 | 7 / 35 | 4285 |
| 8 | 4 | 59.4 | 63.2 | 5 / 35 | 3774 |
| 9 | 3 | 59.0 | 62.9 | 6 / 35 | 3885 |
| 10 | 5 | 57.6 | 61.0 | 4 / 35 | 3302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 42 | 14% |
| oog.melee.Mercutio 1.0 | 25 | 44% |
| cx.BlestPain 1.41 | 25 | 80% |
| nic.Nicator 2.4 | 13 | 54% |
| ahf.NanoAndrew .4 | 11 | 36% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 301 of 350 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 75 | 25% | 81 |
| ahf.NanoAndrew .4 | 57 | 19% | 62 |
| nic.Nicator 2.4 | 46 | 15% | 52 |
| oog.melee.Mercutio 1.0 | 42 | 14% | 53 |
| cx.BlestPain 1.41 | 41 | 14% | 62 |
| maribo.melee.BMV 0.1 | 24 | 8% | 24 |
| tex.Longbot 0.4 | 8 | 3% | 8 |
| edu.otg.spr.TheTeacher 1.2 | 4 | 1% | 4 |
| goblin.Bender 2.4 | 4 | 1% | 4 |

## Melee bench: F18

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 65.9 | 62 / 350 | 4.07 | 13.0% | 34004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.7 | 13.8% | 90 |
| hadur117.nano.SanaroEN 0.1 | 2.3 | 13.0% | 62 |
| agd.Mooserwirt2 2.7 | 2.5 | 12.6% | 65 |
| ratosh.Nobo 0.21 | 4.4 | 11.0% | 19 |
| uji.DBH 1.1 | 4.5 | 11.4% | 41 |
| spinnercat.Robovirus 2.718 | 5.7 | 10.4% | 24 |
| sigterm.Sigterm 1.0 | 6.9 | 9.0% | 28 |
| kawigi.mini.Fhqwhgads 1.1 | 8.3 | 7.2% | 6 |
| stelo.WangRobot 1.0 | 9.0 | 6.0% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.4 | 67.9 | 8 / 35 | 3473 |
| 2 | 4 | 55.2 | 59.0 | 6 / 35 | 2956 |
| 3 | 2 | 56.9 | 61.9 | 5 / 35 | 3272 |
| 4 | 1 | 61.1 | 73.7 | 8 / 35 | 3644 |
| 5 | 3 | 55.4 | 60.0 | 5 / 35 | 3153 |
| 6 | 1 | 63.6 | 78.7 | 10 / 35 | 3957 |
| 7 | 4 | 54.7 | 57.1 | 4 / 35 | 3049 |
| 8 | 1 | 60.7 | 70.2 | 8 / 35 | 3684 |
| 9 | 1 | 59.7 | 70.5 | 5 / 35 | 3576 |
| 10 | 4 | 55.3 | 59.7 | 3 / 35 | 3240 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 39 | 46% |
| uji.DBH 1.1 | 23 | 39% |
| agd.Mooserwirt2 2.7 | 23 | 22% |
| sigterm.Sigterm 1.0 | 19 | 63% |
| spinnercat.Robovirus 2.718 | 15 | 67% |
| ratosh.Nobo 0.21 | 10 | 50% |
| stelo.WangRobot 1.0 | 4 | 25% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 67% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 0% |

Hadur died in 288 of 350 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 77 | 27% | 97 |
| agd.Mooserwirt2 2.7 | 40 | 14% | 50 |
| uji.DBH 1.1 | 35 | 12% | 39 |
| ratosh.Nobo 0.21 | 34 | 12% | 42 |
| sigterm.Sigterm 1.0 | 31 | 11% | 39 |
| spinnercat.Robovirus 2.718 | 30 | 10% | 34 |
| kawigi.mini.Fhqwhgads 1.1 | 14 | 5% | 17 |
| stelo.WangRobot 1.0 | 14 | 5% | 16 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 13 | 5% | 15 |

## Melee bench: F19

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 77.0 | 82 / 350 | 3.07 | 15.3% | 41632 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.6 | 16.5% | 110 |
| mld.Infinity 2.2 | 2.0 | 15.6% | 111 |
| hadur117.nano.SanaroEN 0.1 | 2.4 | 15.3% | 82 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.5% | 17 |
| erdnis.Rover 0.3 | 5.0 | 10.8% | 10 |
| patson.PatsonTestBot 1.0 | 6.1 | 8.5% | 8 |
| pac.ABC 2.1 | 7.3 | 7.6% | 12 |
| mbh.Mbh 0.1 | 7.8 | 7.1% | 0 |
| pbg.R2D2 1.0 | 8.8 | 6.1% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.1 | 75.2 | 2 / 35 | 4012 |
| 2 | 3 | 62.2 | 72.4 | 7 / 35 | 3961 |
| 3 | 3 | 63.5 | 75.9 | 7 / 35 | 3837 |
| 4 | 2 | 64.1 | 75.9 | 10 / 35 | 4182 |
| 5 | 3 | 62.6 | 72.4 | 7 / 35 | 3862 |
| 6 | 1 | 67.1 | 85.4 | 13 / 35 | 4333 |
| 7 | 2 | 65.8 | 80.3 | 10 / 35 | 4441 |
| 8 | 2 | 66.1 | 82.2 | 8 / 35 | 4508 |
| 9 | 2 | 64.4 | 76.8 | 10 / 35 | 4058 |
| 10 | 3 | 64.0 | 73.7 | 8 / 35 | 4438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 76 | 32% |
| mld.Infinity 2.2 | 75 | 44% |
| krillr.mini.JointStrike 2.0.0 | 15 | 67% |
| erdnis.Rover 0.3 | 9 | 78% |
| pbg.R2D2 1.0 | 4 | 100% |
| patson.PatsonTestBot 1.0 | 3 | 33% |
| mbh.Mbh 0.1 | 3 | 100% |
| pac.ABC 2.1 | 1 | 0% |

Hadur died in 269 of 350 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 109 | 41% | 162 |
| mld.Infinity 2.2 | 69 | 26% | 46 |
| krillr.mini.JointStrike 2.0.0 | 30 | 11% | 44 |
| erdnis.Rover 0.3 | 23 | 9% | 28 |
| patson.PatsonTestBot 1.0 | 18 | 7% | 26 |
| pbg.R2D2 1.0 | 8 | 3% | 15 |
| pac.ABC 2.1 | 7 | 3% | 14 |
| mbh.Mbh 0.1 | 5 | 2% | 12 |

## Melee bench: F20

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 66.0 | 57 / 350 | 4.06 | 13.3% | 37172 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 18.0% | 163 |
| hadur117.nano.SanaroEN 0.1 | 2.3 | 13.3% | 57 |
| nz.jdc.nano.GridFu 1.0 | 3.4 | 11.9% | 19 |
| fwb.Nine 1.0.1 | 3.8 | 11.4% | 41 |
| catcat20.Rabbit 0.001 | 4.9 | 10.4% | 41 |
| m3thos.mini.Eva01 0.5.5 | 6.4 | 8.8% | 11 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.9% | 7 |
| bayen.nut.Squirrel 1.615 | 7.7 | 7.9% | 9 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.2% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.3 | 61.3 | 4 / 35 | 3391 |
| 2 | 2 | 63.4 | 74.3 | 13 / 35 | 4034 |
| 3 | 2 | 58.3 | 63.8 | 5 / 35 | 3590 |
| 4 | 2 | 60.8 | 69.8 | 4 / 35 | 3766 |
| 5 | 2 | 60.5 | 69.5 | 5 / 35 | 3714 |
| 6 | 2 | 60.8 | 68.9 | 8 / 35 | 3948 |
| 7 | 2 | 58.2 | 63.8 | 4 / 35 | 3556 |
| 8 | 3 | 57.6 | 62.2 | 5 / 35 | 3373 |
| 9 | 3 | 58.3 | 60.6 | 6 / 35 | 3698 |
| 10 | 2 | 60.0 | 66.0 | 3 / 35 | 4102 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 55 | 35% |
| fwb.Nine 1.0.1 | 25 | 64% |
| bayen.nut.Squirrel 1.615 | 10 | 90% |
| catcat20.Rabbit 0.001 | 8 | 63% |
| nz.jdc.nano.GridFu 1.0 | 8 | 25% |
| m3thos.mini.Eva01 0.5.5 | 6 | 50% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |

Hadur died in 293 of 350 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 133 | 45% | 147 |
| nz.jdc.nano.GridFu 1.0 | 42 | 14% | 45 |
| fwb.Nine 1.0.1 | 36 | 12% | 38 |
| catcat20.Rabbit 0.001 | 27 | 9% | 35 |
| bayen.nut.Squirrel 1.615 | 17 | 6% | 25 |
| m3thos.mini.Eva01 0.5.5 | 12 | 4% | 20 |
| djdjdj.NanoSkunk10 1.0 | 10 | 3% | 18 |
| ntc.ControlledChaos 1.1.4 | 10 | 3% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 6 | 2% | 9 |

## Melee bench: F21

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 79.1 | 90 / 350 | 2.88 | 16.3% | 46994 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.3 | 17.5% | 165 |
| hadur117.nano.SanaroEN 0.1 | 2.1 | 16.3% | 90 |
| dummy.mini.Scimitar 1.01 | 2.6 | 15.4% | 47 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 17 |
| oa.weak.BotherBot 0.1 | 5.2 | 9.2% | 9 |
| eld.Hmm 1.0 | 5.8 | 8.3% | 21 |
| el.JumpShoot 0.2 | 7.4 | 6.4% | 2 |
| fire219.CatBot 1.0 | 7.9 | 5.8% | 0 |
| PSW.Relentless 0.1 | 8.9 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 81.6 | 11 / 35 | 4883 |
| 2 | 3 | 65.7 | 77.1 | 9 / 35 | 4918 |
| 3 | 2 | 66.1 | 81.9 | 12 / 35 | 4312 |
| 4 | 3 | 62.7 | 72.1 | 3 / 35 | 4487 |
| 5 | 2 | 66.0 | 82.5 | 6 / 35 | 4797 |
| 6 | 2 | 64.8 | 76.2 | 7 / 35 | 4710 |
| 7 | 3 | 65.2 | 79.4 | 9 / 35 | 4497 |
| 8 | 2 | 65.5 | 79.0 | 11 / 35 | 4617 |
| 9 | 1 | 66.7 | 82.9 | 14 / 35 | 4730 |
| 10 | 2 | 66.0 | 78.7 | 8 / 35 | 5043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 111 | 49% |
| dummy.mini.Scimitar 1.01 | 38 | 61% |
| cf.RiO.RiOx 4.2.1 | 14 | 64% |
| eld.Hmm 1.0 | 11 | 9% |
| oa.weak.BotherBot 0.1 | 5 | 60% |

Hadur died in 260 of 350 rounds, at a mean tick of 1042. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 100 | 38% | 136 |
| dummy.mini.Scimitar 1.01 | 77 | 30% | 118 |
| cf.RiO.RiOx 4.2.1 | 43 | 17% | 48 |
| eld.Hmm 1.0 | 16 | 6% | 18 |
| oa.weak.BotherBot 0.1 | 10 | 4% | 14 |
| fire219.CatBot 1.0 | 5 | 2% | 5 |
| arthord.MannyPacquiao Beta | 4 | 2% | 6 |
| el.JumpShoot 0.2 | 3 | 1% | 3 |
| PSW.Relentless 0.1 | 2 | 1% | 2 |

## Melee bench: F23

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 79.6 | 69 / 350 | 2.84 | 15.3% | 38029 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.1 | 18.3% | 152 |
| hadur117.nano.SanaroEN 0.1 | 2.4 | 15.3% | 69 |
| cre.Karolos 0.32 | 2.5 | 14.7% | 66 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.2% | 24 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.1 | 9.2% | 6 |
| stelo.RamTrackSurfer 1.2 | 6.1 | 9.2% | 15 |
| sample.Walls 1.0 | 6.2 | 9.0% | 17 |
| cw.megas.Blade 0.8 | 7.6 | 8.3% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 78.4 | 9 / 35 | 3841 |
| 2 | 2 | 65.3 | 82.2 | 8 / 35 | 3850 |
| 3 | 2 | 65.2 | 83.2 | 5 / 35 | 3961 |
| 4 | 2 | 66.1 | 83.5 | 10 / 35 | 4239 |
| 5 | 3 | 64.5 | 79.4 | 4 / 35 | 3940 |
| 6 | 3 | 61.2 | 71.4 | 3 / 35 | 3357 |
| 7 | 2 | 65.2 | 80.0 | 10 / 35 | 3849 |
| 8 | 2 | 65.9 | 82.2 | 9 / 35 | 4068 |
| 9 | 3 | 63.4 | 76.5 | 4 / 35 | 3563 |
| 10 | 3 | 64.4 | 79.0 | 7 / 35 | 3361 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 94 | 30% |
| cre.Karolos 0.32 | 50 | 24% |
| stelo.AreaTargetingBot 1.1 | 24 | 54% |
| sample.Walls 1.0 | 20 | 65% |
| stelo.RamTrackSurfer 1.2 | 9 | 22% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 50% |

Hadur died in 281 of 350 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 124 | 44% | 153 |
| cre.Karolos 0.32 | 78 | 28% | 94 |
| stelo.AreaTargetingBot 1.1 | 26 | 9% | 39 |
| sample.Walls 1.0 | 19 | 7% | 22 |
| stelo.RamTrackSurfer 1.2 | 19 | 7% | 22 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 11 | 4% | 14 |
| cw.megas.Blade 0.8 | 4 | 1% | 4 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.6 | 55.7 | 28 / 350 | 4.99 | 10.7% | 27828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.4 | 14.8% | 84 |
| davidalves.Phoenix 0.54 | 2.5 | 13.4% | 82 |
| florent.XSeries.X2 0.12 | 2.9 | 13.4% | 63 |
| pedersen.Ugluk 1.1.1 | 3.5 | 12.3% | 50 |
| hadur117.nano.SanaroEN 0.1 | 5.1 | 10.7% | 28 |
| oog.melee.Corsair 1.0 | 6.1 | 9.8% | 13 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 9.1% | 29 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.6% | 2 |
| evd.X1 0.01 | 9.4 | 4.8% | 0 |
| as.FrankTheTank 1.3 | 9.4 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.7 | 55.6 | 4 / 35 | 2749 |
| 2 | 6 | 53.3 | 54.9 | 4 / 35 | 2569 |
| 3 | 5 | 55.4 | 60.3 | 3 / 35 | 2837 |
| 4 | 5 | 55.0 | 58.4 | 2 / 35 | 2891 |
| 5 | 6 | 50.7 | 47.0 | 2 / 35 | 2683 |
| 6 | 6 | 50.1 | 50.5 | 0 / 35 | 2495 |
| 7 | 6 | 53.5 | 54.6 | 4 / 35 | 2740 |
| 8 | 5 | 54.5 | 55.9 | 3 / 35 | 3028 |
| 9 | 5 | 51.9 | 54.0 | 0 / 35 | 2689 |
| 10 | 2 | 58.4 | 66.0 | 6 / 35 | 3147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 22 | 50% |
| davidalves.Phoenix 0.54 | 13 | 31% |
| stelo.SoJNanoMelee 1.1 | 11 | 9% |
| florent.XSeries.X2 0.12 | 10 | 60% |
| pedersen.Ugluk 1.1.1 | 10 | 50% |
| oog.melee.Corsair 1.0 | 4 | 25% |

Hadur died in 322 of 350 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 61 | 19% | 72 |
| pedersen.Ugluk 1.1.1 | 61 | 19% | 63 |
| florent.XSeries.X2 0.12 | 60 | 19% | 67 |
| davidalves.Phoenix 0.54 | 57 | 18% | 60 |
| oog.melee.Corsair 1.0 | 30 | 9% | 32 |
| stelo.SoJNanoMelee 1.1 | 30 | 9% | 32 |
| evd.X1 0.01 | 11 | 3% | 10 |
| lunchie.Lunchbox 0.93 | 9 | 3% | 10 |
| as.FrankTheTank 1.3 | 3 | 1% | 4 |

## Melee bench: F25

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 63.7 | 47 / 350 | 4.26 | 12.3% | 28672 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.5 | 14.4% | 85 |
| voidious.micro.BlitzBat 1.05 | 1.9 | 14.1% | 72 |
| jdw.Hurricane 1.4 | 3.5 | 12.1% | 56 |
| hadur117.nano.SanaroEN 0.1 | 3.6 | 12.3% | 47 |
| gre.svman4.Morfeas 1.4.1 | 5.0 | 10.7% | 43 |
| ds.Oo 2.2 | 6.2 | 9.2% | 16 |
| gjr.Cephalosporin 0.1 | 6.8 | 8.5% | 22 |
| awesomeness.Elite 1.0 | 7.9 | 7.5% | 6 |
| adt.Ar2 1.1 | 8.6 | 6.7% | 5 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.7 | 63.5 | 2 / 35 | 3003 |
| 2 | 3 | 57.1 | 64.1 | 3 / 35 | 2922 |
| 3 | 5 | 55.4 | 58.1 | 6 / 35 | 2644 |
| 4 | 3 | 59.0 | 65.7 | 8 / 35 | 3105 |
| 5 | 4 | 56.8 | 63.5 | 5 / 35 | 2958 |
| 6 | 3 | 59.2 | 67.0 | 6 / 35 | 3152 |
| 7 | 3 | 58.3 | 66.0 | 5 / 35 | 3066 |
| 8 | 2 | 59.3 | 68.6 | 7 / 35 | 3002 |
| 9 | 5 | 54.0 | 58.7 | 3 / 35 | 2297 |
| 10 | 4 | 55.3 | 62.2 | 2 / 35 | 2523 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 30 | 10% |
| voidious.mini.BrokenSword 2.0.3 | 26 | 27% |
| jdw.Hurricane 1.4 | 24 | 71% |
| gre.svman4.Morfeas 1.4.1 | 13 | 69% |
| gjr.Cephalosporin 0.1 | 7 | 57% |
| awesomeness.Elite 1.0 | 6 | 67% |
| ds.Oo 2.2 | 5 | 0% |
| adt.Ar2 1.1 | 4 | 75% |

Hadur died in 305 of 350 rounds, at a mean tick of 593. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 85 | 28% | 92 |
| voidious.mini.BrokenSword 2.0.3 | 80 | 26% | 91 |
| jdw.Hurricane 1.4 | 45 | 15% | 58 |
| gre.svman4.Morfeas 1.4.1 | 35 | 11% | 40 |
| gjr.Cephalosporin 0.1 | 15 | 5% | 18 |
| ds.Oo 2.2 | 15 | 5% | 17 |
| adt.Ar2 1.1 | 12 | 4% | 14 |
| awesomeness.Elite 1.0 | 12 | 4% | 14 |
| amk.ChumbaMini 0.2 | 6 | 2% | 6 |

## Melee bench: F26

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 67.6 | 46 / 350 | 3.91 | 13.0% | 37293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 17.0% | 142 |
| hadur117.nano.SanaroEN 0.1 | 2.6 | 13.0% | 46 |
| shu.nitro.LENIN .T34 | 3.0 | 13.0% | 59 |
| lrem.Spectre 0.4.4 | 3.5 | 12.5% | 42 |
| js.PinBall 1.6 | 5.4 | 10.9% | 16 |
| gh.mini.GrubbmOne 1.0 | 5.5 | 10.9% | 21 |
| jaybot.adv.bots.JayBot 2.0 | 7.0 | 9.1% | 11 |
| fullsail.LaxativeTeaTwo 1.0 | 8.2 | 6.4% | 10 |
| sample.SpinBot 1.0 | 8.8 | 5.4% | 2 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.8 | 65.4 | 3 / 35 | 3396 |
| 2 | 2 | 61.3 | 72.4 | 4 / 35 | 3619 |
| 3 | 2 | 61.3 | 72.7 | 4 / 35 | 3823 |
| 4 | 3 | 58.3 | 62.9 | 5 / 35 | 3641 |
| 5 | 3 | 60.7 | 68.6 | 5 / 35 | 4049 |
| 6 | 2 | 60.7 | 70.8 | 5 / 35 | 3769 |
| 7 | 3 | 57.0 | 60.3 | 3 / 35 | 3535 |
| 8 | 2 | 60.6 | 67.3 | 4 / 35 | 4197 |
| 9 | 2 | 60.1 | 67.6 | 6 / 35 | 3678 |
| 10 | 3 | 60.2 | 68.3 | 7 / 35 | 3586 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 46 | 33% |
| shu.nitro.LENIN .T34 | 22 | 50% |
| lrem.Spectre 0.4.4 | 21 | 48% |
| js.PinBall 1.6 | 10 | 60% |
| gh.mini.GrubbmOne 1.0 | 9 | 11% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 67% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 50% |
| sample.SpinBot 1.0 | 1 | 0% |

Hadur died in 306 of 350 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 102 | 33% | 116 |
| lrem.Spectre 0.4.4 | 47 | 15% | 51 |
| shu.nitro.LENIN .T34 | 44 | 14% | 59 |
| gh.mini.GrubbmOne 1.0 | 39 | 13% | 40 |
| js.PinBall 1.6 | 34 | 11% | 41 |
| jaybot.adv.bots.JayBot 2.0 | 21 | 7% | 23 |
| fullsail.LaxativeTeaTwo 1.0 | 12 | 4% | 13 |
| sample.SpinBot 1.0 | 7 | 2% | 7 |

## Melee bench: F27

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.4 | 61.0 | 38 / 350 | 4.51 | 12.0% | 31629 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.0 | 16.3% | 161 |
| wee.Gem 1.8.4 | 2.9 | 12.5% | 67 |
| hadur117.nano.SanaroEN 0.1 | 3.6 | 12.0% | 38 |
| sheldor.melee.nano.TestMelee 0.1 | 3.9 | 11.6% | 38 |
| EH.Eagle 1.0.6 | 4.4 | 11.1% | 26 |
| techdude.kombat.FlamingKombat 1.5 | 6.1 | 9.2% | 13 |
| joe.ADinosaur 1.0 | 7.6 | 7.6% | 2 |
| throxbot.ThroxBot 0.1 | 7.7 | 8.0% | 5 |
| caimano.Furia_Ceca 0.22 | 8.6 | 6.3% | 2 |
| cs.Grudge 1.0 | 9.2 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 7 | 48.5 | 35.9 | 0 / 35 | 3668 |
| 2 | 2 | 59.4 | 72.1 | 3 / 35 | 2960 |
| 3 | 3 | 57.4 | 66.7 | 2 / 35 | 2873 |
| 4 | 2 | 59.8 | 67.9 | 8 / 35 | 3475 |
| 5 | 3 | 58.7 | 68.3 | 3 / 35 | 3122 |
| 6 | 3 | 58.9 | 70.5 | 5 / 35 | 2802 |
| 7 | 3 | 57.5 | 65.1 | 4 / 35 | 3183 |
| 8 | 2 | 58.6 | 67.3 | 8 / 35 | 3053 |
| 9 | 5 | 53.7 | 54.3 | 2 / 35 | 2728 |
| 10 | 6 | 51.8 | 41.6 | 3 / 35 | 3765 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 45 | 40% |
| wee.Gem 1.8.4 | 14 | 21% |
| EH.Eagle 1.0.6 | 11 | 55% |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 25% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 43% |
| throxbot.ThroxBot 0.1 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 312 of 350 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 120 | 38% | 136 |
| wee.Gem 1.8.4 | 38 | 12% | 42 |
| EH.Eagle 1.0.6 | 33 | 11% | 40 |
| sheldor.melee.nano.TestMelee 0.1 | 33 | 11% | 37 |
| cs.Grudge 1.0 | 26 | 8% | 27 |
| techdude.kombat.FlamingKombat 1.5 | 20 | 6% | 21 |
| joe.ADinosaur 1.0 | 16 | 5% | 19 |
| caimano.Furia_Ceca 0.22 | 14 | 4% | 15 |
| throxbot.ThroxBot 0.1 | 12 | 4% | 13 |

## Melee bench: F28

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 76.4 | 118 / 350 | 3.13 | 15.3% | 36208 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.2 | 16.0% | 107 |
| hadur117.nano.SanaroEN 0.1 | 1.9 | 15.3% | 118 |
| uji.Antique 1.0 | 3.0 | 13.1% | 64 |
| qohnil.blot.BlotBot 3.61 | 4.1 | 11.0% | 29 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.4% | 16 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.4% | 8 |
| ahr.ice.Ice 1.0.2 | 6.8 | 8.1% | 5 |
| stelo.PianistNano 1.2 | 8.6 | 6.1% | 1 |
| matt.advanced.Katana 1.0 | 8.9 | 6.1% | 2 |
| stelo.Lifestealer 1.0 | 9.4 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 76.8 | 12 / 35 | 3311 |
| 2 | 2 | 64.2 | 79.4 | 11 / 35 | 3911 |
| 3 | 2 | 62.5 | 74.9 | 10 / 35 | 3619 |
| 4 | 2 | 62.8 | 73.7 | 14 / 35 | 3680 |
| 5 | 1 | 64.3 | 78.4 | 16 / 35 | 3782 |
| 6 | 2 | 62.7 | 74.6 | 8 / 35 | 3877 |
| 7 | 1 | 65.0 | 82.2 | 16 / 35 | 3705 |
| 8 | 2 | 62.8 | 75.6 | 13 / 35 | 3339 |
| 9 | 3 | 60.1 | 69.5 | 6 / 35 | 3254 |
| 10 | 2 | 63.8 | 78.7 | 12 / 35 | 3730 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 92 | 71% |
| uji.Antique 1.0 | 43 | 56% |
| qohnil.blot.BlotBot 3.61 | 19 | 58% |
| pfvicm.Sobieski 7.2.3b | 8 | 63% |
| amk.ChumbaWumba 0.3 | 5 | 80% |
| matt.advanced.Katana 1.0 | 4 | 100% |
| ahr.ice.Ice 1.0.2 | 4 | 75% |
| stelo.PianistNano 1.2 | 3 | 67% |

Hadur died in 232 of 350 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 80 | 34% | 122 |
| uji.Antique 1.0 | 48 | 21% | 80 |
| pfvicm.Sobieski 7.2.3b | 29 | 13% | 35 |
| qohnil.blot.BlotBot 3.61 | 28 | 12% | 43 |
| amk.ChumbaWumba 0.3 | 25 | 11% | 34 |
| ahr.ice.Ice 1.0.2 | 10 | 4% | 15 |
| matt.advanced.Katana 1.0 | 4 | 2% | 10 |
| stelo.Lifestealer 1.0 | 4 | 2% | 7 |
| stelo.PianistNano 1.2 | 4 | 2% | 4 |

## Melee bench: F29

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 60.2 | 35 / 350 | 4.58 | 12.3% | 34397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.3 | 16.5% | 133 |
| deewiant.Anomaly 0.2 | 1.8 | 15.7% | 100 |
| myl.micro.Troodon 1.10 | 3.7 | 12.2% | 21 |
| hadur117.nano.SanaroEN 0.1 | 3.8 | 12.3% | 35 |
| jok.PheonixM 0.1.2 | 4.4 | 11.4% | 25 |
| DBall.Anarchy 0.1 | 6.4 | 8.5% | 27 |
| ph.melee.ArcherME 0.3 | 6.6 | 8.3% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 5.8% | 0 |
| ap.Frederick 1.1 | 8.9 | 5.2% | 7 |
| jangs.ns51 1.0 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.2 | 58.1 | 4 / 35 | 3289 |
| 2 | 5 | 58.6 | 63.8 | 3 / 35 | 3210 |
| 3 | 3 | 60.2 | 67.6 | 2 / 35 | 3602 |
| 4 | 4 | 58.6 | 61.0 | 6 / 35 | 3435 |
| 5 | 4 | 53.8 | 51.4 | 2 / 35 | 3091 |
| 6 | 3 | 58.9 | 61.3 | 4 / 35 | 3632 |
| 7 | 4 | 56.2 | 56.8 | 2 / 35 | 3343 |
| 8 | 5 | 55.6 | 54.6 | 2 / 35 | 3310 |
| 9 | 3 | 58.9 | 61.9 | 4 / 35 | 3628 |
| 10 | 3 | 60.8 | 65.4 | 6 / 35 | 3857 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 36 | 17% |
| zyx.mega.YersiniaPestis 3.1 | 35 | 57% |
| myl.micro.Troodon 1.10 | 8 | 63% |
| DBall.Anarchy 0.1 | 6 | 33% |
| jok.PheonixM 0.1.2 | 4 | 50% |
| ap.Frederick 1.1 | 2 | 0% |
| ph.melee.ArcherME 0.3 | 1 | 0% |

Hadur died in 317 of 350 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 104 | 33% | 110 |
| zyx.mega.YersiniaPestis 3.1 | 75 | 24% | 94 |
| myl.micro.Troodon 1.10 | 46 | 15% | 50 |
| jok.PheonixM 0.1.2 | 37 | 12% | 39 |
| ph.melee.ArcherME 0.3 | 21 | 7% | 22 |
| DBall.Anarchy 0.1 | 13 | 4% | 17 |
| fullsail.TimbotNoPrediction 1.0 | 10 | 3% | 10 |
| jangs.ns51 1.0 | 8 | 3% | 8 |
| ap.Frederick 1.1 | 3 | 1% | 0 |

## Melee bench: F30

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 52.4 | 52.2 | 20 / 350 | 5.30 | 10.1% | 27182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.1 | 14.5% | 103 |
| stelo.PastFuture 2.3.2 | 2.3 | 14.1% | 65 |
| oog.melee.Capulet 1.2 | 2.5 | 14.1% | 62 |
| darkcanuck.B26354 1.06 | 3.1 | 13.5% | 71 |
| hadur117.nano.SanaroEN 0.1 | 5.2 | 10.1% | 20 |
| intruder.PrairieWolf 2.61 | 6.2 | 8.7% | 9 |
| ntc.Opposite 1.5 | 7.1 | 8.0% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 7.9 | 7.4% | 13 |
| tripphippy.Alice 1.1 | 8.6 | 7.1% | 6 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.1 | 54.0 | 2 / 35 | 2628 |
| 2 | 7 | 46.3 | 43.2 | 0 / 35 | 2101 |
| 3 | 5 | 52.1 | 51.1 | 3 / 35 | 2714 |
| 4 | 5 | 52.1 | 51.7 | 2 / 35 | 2782 |
| 5 | 5 | 55.3 | 58.1 | 2 / 35 | 2968 |
| 6 | 5 | 53.3 | 53.0 | 3 / 35 | 2840 |
| 7 | 5 | 53.3 | 53.3 | 3 / 35 | 2730 |
| 8 | 5 | 52.9 | 53.3 | 2 / 35 | 2732 |
| 9 | 5 | 52.9 | 51.7 | 1 / 35 | 2959 |
| 10 | 5 | 52.3 | 52.7 | 2 / 35 | 2728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 17 | 41% |
| oog.melee.Capulet 1.2 | 11 | 18% |
| darkcanuck.B26354 1.06 | 8 | 50% |
| stelo.PastFuture 2.3.2 | 7 | 43% |
| tripphippy.Alice 1.1 | 3 | 67% |
| intruder.PrairieWolf 2.61 | 1 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 330 of 350 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 65 | 20% | 69 |
| oog.melee.Capulet 1.2 | 63 | 19% | 66 |
| catcat20.Matcha 0.006 | 59 | 18% | 66 |
| darkcanuck.B26354 1.06 | 44 | 13% | 48 |
| ntc.Opposite 1.5 | 31 | 9% | 32 |
| fowl3628800.LightningBolt 2.6.0 | 23 | 7% | 22 |
| tripphippy.Alice 1.1 | 22 | 7% | 22 |
| intruder.PrairieWolf 2.61 | 19 | 6% | 21 |
| GarmBox.Anger 1.0 | 4 | 1% | 4 |

## Melee bench: F31

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.2 | 53.6 | 18 / 350 | 5.18 | 10.4% | 27066 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.6% | 195 |
| gh.mini.Griezel 0.2 | 2.2 | 13.9% | 77 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 12.4% | 27 |
| d414.nano.Quantum 1.0.0 | 3.8 | 12.0% | 26 |
| hadur117.nano.SanaroEN 0.1 | 5.1 | 10.4% | 18 |
| gh.nano.Grofvuil 0.2 | 5.6 | 9.4% | 9 |
| timmit.nano.TimDog 0.33 | 7.4 | 7.1% | 4 |
| fm.mammillarias 1.3 | 7.7 | 6.7% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.1 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 51.4 | 49.8 | 0 / 35 | 2694 |
| 2 | 5 | 52.8 | 51.7 | 2 / 35 | 2791 |
| 3 | 6 | 51.7 | 49.8 | 2 / 35 | 2726 |
| 4 | 5 | 55.8 | 61.3 | 1 / 35 | 2807 |
| 5 | 4 | 57.5 | 64.1 | 2 / 35 | 2810 |
| 6 | 3 | 59.1 | 64.1 | 6 / 35 | 3186 |
| 7 | 5 | 52.6 | 51.1 | 2 / 35 | 2648 |
| 8 | 5 | 54.3 | 54.9 | 2 / 35 | 2692 |
| 9 | 6 | 49.5 | 47.0 | 1 / 35 | 2271 |
| 10 | 6 | 47.1 | 41.9 | 0 / 35 | 2441 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 28 | 39% |
| gh.mini.Griezel 0.2 | 19 | 26% |
| d414.nano.Quantum 1.0.0 | 6 | 0% |
| spinnercat.micro.Tyger 0.1 | 6 | 17% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 332 of 350 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 72 | 22% | 78 |
| abc.Shadow 3.84i | 70 | 21% | 78 |
| spinnercat.micro.Tyger 0.1 | 64 | 19% | 65 |
| d414.nano.Quantum 1.0.0 | 53 | 16% | 54 |
| gh.nano.Grofvuil 0.2 | 22 | 7% | 23 |
| fm.mammillarias 1.3 | 20 | 6% | 20 |
| timmit.nano.TimDog 0.33 | 18 | 5% | 18 |
| Gecko.ultimateGeckoBot 1.0 | 7 | 2% | 8 |
| tlp.ThreeLeggedPig 1 | 6 | 2% | 6 |

## Melee bench: F32

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 73.0 | 98 / 350 | 3.43 | 14.4% | 36314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.1 | 15.2% | 110 |
| hadur117.nano.SanaroEN 0.1 | 2.0 | 14.4% | 98 |
| apc.botM 3.0 | 2.9 | 12.9% | 61 |
| vjik.UnViolation 1.1 | 4.6 | 10.8% | 38 |
| lxx.ConceptA 0.8 | 4.6 | 10.9% | 11 |
| bayen.UbaMicro 1.4 | 5.8 | 9.4% | 6 |
| panzer.Panzer 0.2 | 7.3 | 7.7% | 5 |
| yk.JahMicro 1.0 | 8.5 | 6.6% | 8 |
| conscience.Electron 1.3g | 8.7 | 6.5% | 2 |
| donjezza.Jezza 1.0 | 9.5 | 5.6% | 11 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.1 | 70.5 | 9 / 35 | 3468 |
| 2 | 1 | 63.0 | 75.6 | 15 / 35 | 3839 |
| 3 | 3 | 59.1 | 69.8 | 4 / 35 | 3571 |
| 4 | 2 | 62.6 | 75.9 | 10 / 35 | 3771 |
| 5 | 2 | 61.7 | 71.4 | 13 / 35 | 3863 |
| 6 | 2 | 62.2 | 79.0 | 9 / 35 | 3539 |
| 7 | 2 | 59.8 | 68.6 | 9 / 35 | 3441 |
| 8 | 2 | 60.9 | 72.4 | 8 / 35 | 3699 |
| 9 | 2 | 61.2 | 74.3 | 9 / 35 | 3384 |
| 10 | 2 | 61.5 | 72.7 | 12 / 35 | 3739 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 66 | 45% |
| apc.botM 3.0 | 41 | 71% |
| vjik.UnViolation 1.1 | 23 | 52% |
| lxx.ConceptA 0.8 | 18 | 89% |
| yk.JahMicro 1.0 | 8 | 63% |
| donjezza.Jezza 1.0 | 6 | 17% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| panzer.Panzer 0.2 | 1 | 0% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 255 of 350 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 68 | 27% | 100 |
| lxx.ConceptA 0.8 | 49 | 19% | 56 |
| apc.botM 3.0 | 39 | 15% | 69 |
| vjik.UnViolation 1.1 | 32 | 13% | 47 |
| bayen.UbaMicro 1.4 | 23 | 9% | 25 |
| panzer.Panzer 0.2 | 19 | 7% | 21 |
| conscience.Electron 1.3g | 9 | 4% | 9 |
| yk.JahMicro 1.0 | 8 | 3% | 14 |
| donjezza.Jezza 1.0 | 8 | 3% | 9 |

## Melee bench: F33

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 64.9 | 50 / 350 | 4.16 | 13.1% | 36281 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 18.0% | 151 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.3% | 51 |
| hadur117.nano.SanaroEN 0.1 | 2.8 | 13.1% | 50 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.8% | 34 |
| labg.Cataclysm 2.05 | 4.6 | 11.0% | 44 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.4 | 8.2% | 10 |
| baal.nano.N 1.42 | 6.5 | 8.6% | 3 |
| zyx.micro.Ant 1.1 | 8.5 | 5.8% | 1 |
| sanja.First 0.1 | 9.2 | 4.8% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.3 | 5.4% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 67.9 | 4 / 35 | 4063 |
| 2 | 2 | 59.4 | 66.3 | 6 / 35 | 3712 |
| 3 | 4 | 57.6 | 58.7 | 5 / 35 | 3387 |
| 4 | 4 | 57.6 | 60.0 | 2 / 35 | 3565 |
| 5 | 2 | 60.8 | 69.5 | 7 / 35 | 3494 |
| 6 | 3 | 59.8 | 66.3 | 2 / 35 | 3685 |
| 7 | 3 | 57.9 | 60.6 | 5 / 35 | 3446 |
| 8 | 3 | 58.0 | 61.3 | 4 / 35 | 3660 |
| 9 | 3 | 59.1 | 64.8 | 3 / 35 | 3520 |
| 10 | 2 | 62.7 | 73.3 | 12 / 35 | 3749 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 48 | 29% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 52% |
| gre.svman4.Leonidas 1.3.2 | 20 | 65% |
| labg.Cataclysm 2.05 | 18 | 44% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 40% |
| baal.nano.N 1.42 | 1 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 0% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 301 of 350 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 118 | 39% | 131 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 54 | 18% | 67 |
| gre.svman4.Leonidas 1.3.2 | 37 | 12% | 45 |
| kinsen.melee.Angsaichmophobia 1.8c | 31 | 10% | 36 |
| labg.Cataclysm 2.05 | 28 | 9% | 35 |
| baal.nano.N 1.42 | 13 | 4% | 14 |
| zyx.micro.Ant 1.1 | 13 | 4% | 14 |
| sanja.First 0.1 | 5 | 2% | 6 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 1% | 2 |

## Melee bench: F34

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 68.1 | 41 / 350 | 3.87 | 13.4% | 38293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.4 | 17.7% | 148 |
| kid.Gladiator .7.2 | 1.6 | 17.1% | 104 |
| hadur117.nano.SanaroEN 0.1 | 3.2 | 13.4% | 41 |
| jcs.Seth 1.8 | 4.3 | 11.8% | 34 |
| tcf.Reach 3 | 4.7 | 11.1% | 12 |
| cli.Dancer 1.1 | 5.8 | 9.6% | 6 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 2 |
| amk.Punbot.Punbot 0.01 | 8.1 | 5.2% | 1 |
| sample.VelociRobot 1.0 | 8.9 | 4.0% | 2 |
| sample.RamFire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 62.9 | 0 / 35 | 3587 |
| 2 | 3 | 62.9 | 74.3 | 5 / 35 | 3995 |
| 3 | 4 | 59.8 | 64.8 | 5 / 35 | 3801 |
| 4 | 3 | 61.7 | 70.8 | 5 / 35 | 3909 |
| 5 | 3 | 59.3 | 62.2 | 4 / 35 | 3787 |
| 6 | 3 | 61.4 | 68.9 | 3 / 35 | 3964 |
| 7 | 3 | 64.2 | 76.2 | 7 / 35 | 4049 |
| 8 | 4 | 58.2 | 60.6 | 3 / 35 | 3688 |
| 9 | 3 | 61.0 | 69.2 | 4 / 35 | 3586 |
| 10 | 3 | 62.0 | 71.4 | 5 / 35 | 3927 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 46 | 46% |
| kid.Gladiator .7.2 | 34 | 26% |
| jcs.Seth 1.8 | 13 | 54% |
| tcf.Reach 3 | 8 | 38% |
| ratosh.Wesco 1.4 | 3 | 33% |
| cli.Dancer 1.1 | 1 | 0% |

Hadur died in 309 of 350 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 126 | 41% | 134 |
| stelo.Spread 0.9 | 95 | 31% | 116 |
| tcf.Reach 3 | 32 | 10% | 35 |
| jcs.Seth 1.8 | 25 | 8% | 31 |
| ratosh.Wesco 1.4 | 12 | 4% | 13 |
| cli.Dancer 1.1 | 11 | 4% | 12 |
| amk.Punbot.Punbot 0.01 | 6 | 2% | 6 |
| sample.RamFire 1.0 | 2 | 1% | 2 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.7 | 62.3 | 12 / 350 | 4.39 | 11.5% | 28060 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.6% | 279 |
| gh.mini.Gruwel 0.9 | 2.5 | 13.5% | 25 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.5 | 12.3% | 22 |
| rz.HawkOnFire 0.1 | 3.7 | 12.2% | 12 |
| hadur117.nano.SanaroEN 0.1 | 4.3 | 11.5% | 12 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 7.3% | 0 |
| wit.Chuliath 1.0 | 6.8 | 7.1% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 6.2% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.2 | 63.8 | 0 / 35 | 3009 |
| 2 | 4 | 55.5 | 61.0 | 1 / 35 | 2523 |
| 3 | 5 | 56.6 | 61.0 | 2 / 35 | 2822 |
| 4 | 4 | 58.9 | 68.3 | 3 / 35 | 2782 |
| 5 | 5 | 56.1 | 61.3 | 1 / 35 | 2748 |
| 6 | 4 | 57.8 | 63.5 | 2 / 35 | 2939 |
| 7 | 5 | 53.4 | 54.9 | 0 / 35 | 2556 |
| 8 | 5 | 55.2 | 59.0 | 0 / 35 | 2695 |
| 9 | 5 | 56.6 | 60.6 | 2 / 35 | 2897 |
| 10 | 3 | 59.7 | 70.2 | 1 / 35 | 3089 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 50 | 4% |
| rz.HawkOnFire 0.1 | 10 | 40% |
| gh.mini.Gruwel 0.9 | 8 | 50% |
| dmh.robocode.robot.BlackDeath 9.2 | 6 | 17% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 338 of 350 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 125 | 37% | 127 |
| rz.HawkOnFire 0.1 | 60 | 18% | 64 |
| gh.mini.Gruwel 0.9 | 55 | 16% | 58 |
| dmh.robocode.robot.BlackDeath 9.2 | 54 | 16% | 56 |
| wit.Chuliath 1.0 | 15 | 4% | 15 |
| myl.nano.KomoriNinja 1.1 | 13 | 4% | 13 |
| stelo.MyAgileRobot 0.2 | 6 | 2% | 6 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 1% | 6 |
| dans.Cinnamon 1.2 | 5 | 1% | 5 |

## Melee bench: F36

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 68.0 | 85 / 350 | 3.88 | 13.9% | 36280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroEN 0.1 | 1.7 | 13.9% | 85 |
| alpha.RainingFire 1.0 | 2.6 | 12.8% | 61 |
| bzdp.Pansy 2.1 | 3.1 | 12.6% | 54 |
| bvh.micro.Freya 0.3 | 4.0 | 11.5% | 36 |
| mz.Cork 0.1 | 4.5 | 11.2% | 36 |
| bvh.mini.Fenrir 0.39 | 6.1 | 9.8% | 15 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.8% | 26 |
| dl.BetterWalls 1.0 | 8.2 | 7.2% | 11 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 6.6% | 6 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.7% | 22 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.3 | 71.1 | 11 / 35 | 3613 |
| 2 | 4 | 56.1 | 57.1 | 6 / 35 | 3318 |
| 3 | 1 | 61.2 | 71.1 | 6 / 35 | 3774 |
| 4 | 2 | 57.2 | 62.2 | 5 / 35 | 3391 |
| 5 | 1 | 62.6 | 74.3 | 12 / 35 | 3852 |
| 6 | 1 | 59.8 | 67.3 | 7 / 35 | 3721 |
| 7 | 1 | 61.6 | 71.7 | 10 / 35 | 3645 |
| 8 | 1 | 62.5 | 75.6 | 10 / 35 | 3773 |
| 9 | 4 | 56.4 | 58.7 | 6 / 35 | 3545 |
| 10 | 1 | 61.6 | 71.1 | 12 / 35 | 3648 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 28 | 54% |
| mz.Cork 0.1 | 26 | 65% |
| bvh.micro.Freya 0.3 | 23 | 74% |
| alpha.RainingFire 1.0 | 22 | 64% |
| bvh.mini.Fenrir 0.39 | 16 | 75% |
| dl.BetterWalls 1.0 | 10 | 70% |
| m3thos.Eva02 0.7.1 | 9 | 22% |
| sample.MyFirstRobot 1.0 | 5 | 0% |
| squidM.TentalceMeleeNano 1.1 | 2 | 50% |

Hadur died in 265 of 350 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 51 | 19% | 71 |
| alpha.RainingFire 1.0 | 49 | 18% | 65 |
| m3thos.Eva02 0.7.1 | 40 | 15% | 43 |
| bvh.micro.Freya 0.3 | 32 | 12% | 44 |
| bvh.mini.Fenrir 0.39 | 31 | 12% | 37 |
| mz.Cork 0.1 | 28 | 11% | 43 |
| dl.BetterWalls 1.0 | 13 | 5% | 20 |
| squidM.TentalceMeleeNano 1.1 | 11 | 4% | 15 |
| sample.MyFirstRobot 1.0 | 10 | 4% | 12 |

## Melee bench: F37

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 80.5 | 145 / 350 | 2.75 | 16.1% | 44333 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroEN 0.1 | 1.0 | 16.1% | 145 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.1 | 11.1% | 33 |
| germ.TheMind .2 | 3.4 | 10.9% | 38 |
| EBBU.Sim2 1.02 | 4.4 | 10.4% | 28 |
| agrach.Dalek 1.0 | 4.4 | 10.0% | 42 |
| stelo.UntouchableNano 1.3 | 6.6 | 8.8% | 19 |
| lmk.ACPFinal 0.1 | 6.9 | 8.7% | 10 |
| mb.Beast 0.1 | 8.1 | 8.1% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 8.4 | 8.1% | 2 |
| skm.Ryubot 1.0 | 8.7 | 7.7% | 19 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 81.3 | 14 / 35 | 4657 |
| 2 | 1 | 61.8 | 77.8 | 9 / 35 | 4238 |
| 3 | 1 | 65.7 | 86.3 | 18 / 35 | 4742 |
| 4 | 1 | 64.5 | 82.5 | 16 / 35 | 4567 |
| 5 | 1 | 62.6 | 78.4 | 15 / 35 | 3922 |
| 6 | 1 | 62.8 | 79.0 | 14 / 35 | 4204 |
| 7 | 1 | 63.4 | 80.3 | 15 / 35 | 4414 |
| 8 | 1 | 64.2 | 80.0 | 15 / 35 | 4651 |
| 9 | 1 | 63.7 | 80.6 | 14 / 35 | 4523 |
| 10 | 1 | 63.2 | 79.0 | 15 / 35 | 4415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 42 | 64% |
| agrach.Dalek 1.0 | 39 | 69% |
| EBBU.Sim2 1.02 | 31 | 55% |
| com.syncleus.robocode.Dreadnaught 0.1 | 30 | 50% |
| mb.Beast 0.1 | 24 | 75% |
| stelo.UntouchableNano 1.3 | 20 | 75% |
| lmk.ACPFinal 0.1 | 19 | 95% |
| skm.Ryubot 1.0 | 13 | 54% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 210 of 350 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 43 | 20% | 71 |
| agrach.Dalek 1.0 | 31 | 15% | 61 |
| EBBU.Sim2 1.02 | 31 | 15% | 41 |
| com.syncleus.robocode.Dreadnaught 0.1 | 28 | 13% | 50 |
| lmk.ACPFinal 0.1 | 19 | 9% | 32 |
| mb.Beast 0.1 | 17 | 8% | 33 |
| stelo.UntouchableNano 1.3 | 14 | 7% | 24 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 7% | 17 |
| skm.Ryubot 1.0 | 13 | 6% | 19 |

## Melee bench: F38

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 61.9 | 35 / 350 | 4.43 | 11.9% | 30786 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.3% | 150 |
| bvh.mini.Freya 0.55 | 2.2 | 13.3% | 41 |
| cs.Wren 1.0 | 3.8 | 11.9% | 30 |
| hadur117.nano.SanaroEN 0.1 | 4.0 | 11.9% | 35 |
| bts.mega.Gnarly 1.4 | 4.6 | 11.4% | 49 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.5 | 11.0% | 23 |
| kdf.KoulDestroyer 1.0 | 6.9 | 9.3% | 12 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.4% | 10 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.4% | 1 |
| bzdp.BoxCar 2.0 | 9.6 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.5 | 66.3 | 3 / 35 | 2828 |
| 2 | 4 | 56.3 | 61.0 | 2 / 35 | 3113 |
| 3 | 5 | 56.2 | 58.1 | 7 / 35 | 2965 |
| 4 | 3 | 57.8 | 65.1 | 5 / 35 | 3225 |
| 5 | 5 | 55.0 | 59.7 | 2 / 35 | 2693 |
| 6 | 4 | 57.7 | 62.5 | 5 / 35 | 3124 |
| 7 | 4 | 58.6 | 66.7 | 4 / 35 | 3208 |
| 8 | 4 | 54.6 | 58.7 | 0 / 35 | 3049 |
| 9 | 3 | 57.5 | 62.5 | 4 / 35 | 3246 |
| 10 | 5 | 56.2 | 58.1 | 3 / 35 | 3335 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 37 | 41% |
| bvh.mini.Freya 0.55 | 17 | 53% |
| bts.mega.Gnarly 1.4 | 16 | 13% |
| cs.Wren 1.0 | 10 | 40% |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 0% |
| kdf.KoulDestroyer 1.0 | 4 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 25% |

Hadur died in 315 of 350 rounds, at a mean tick of 595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 83 | 26% | 101 |
| bvh.mini.Freya 0.55 | 51 | 16% | 56 |
| bts.mega.Gnarly 1.4 | 46 | 15% | 50 |
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 12% | 40 |
| kdf.KoulDestroyer 1.0 | 36 | 11% | 38 |
| cs.Wren 1.0 | 31 | 10% | 35 |
| bzdp.BoxCar 2.0 | 11 | 3% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 10 | 3% | 12 |
| matt.UnderDark3 2.4.34 | 8 | 3% | 8 |

## Melee bench: F39

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.4 | 63.2 | 33 / 350 | 4.31 | 12.1% | 32426 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.1 | 15.8% | 80 |
| az.Ololobot 0.2.4 | 2.3 | 13.3% | 117 |
| hadur117.nano.SanaroEN 0.1 | 3.2 | 12.1% | 33 |
| catcat20.Lambda 0.024 | 3.6 | 11.8% | 57 |
| stelo.SoRobotNanoMelee 1.2 | 5.4 | 9.6% | 34 |
| winamp32.micro.MicroMacro 1.0 | 6.1 | 9.0% | 16 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 8.6% | 5 |
| gimp.GimpBot 0.1 | 7.4 | 8.0% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.9 | 6.9% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.6 | 60.3 | 1 / 35 | 3326 |
| 2 | 3 | 58.0 | 67.0 | 6 / 35 | 3074 |
| 3 | 4 | 57.8 | 65.1 | 3 / 35 | 3378 |
| 4 | 3 | 54.4 | 60.3 | 0 / 35 | 3042 |
| 5 | 3 | 56.1 | 61.0 | 2 / 35 | 3456 |
| 6 | 3 | 57.4 | 64.4 | 5 / 35 | 3293 |
| 7 | 4 | 54.4 | 59.0 | 3 / 35 | 3122 |
| 8 | 2 | 57.1 | 63.5 | 6 / 35 | 3375 |
| 9 | 3 | 58.4 | 69.2 | 3 / 35 | 3516 |
| 10 | 3 | 54.9 | 62.2 | 4 / 35 | 2844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 35 | 14% |
| bvh.fry.Freya 0.82 | 22 | 27% |
| catcat20.Lambda 0.024 | 21 | 57% |
| stelo.SoRobotNanoMelee 1.2 | 9 | 22% |
| winamp32.micro.MicroMacro 1.0 | 7 | 71% |
| apollokidd.ApolloKidd 0.9 | 2 | 50% |
| gimp.GimpBot 0.1 | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 0% |

Hadur died in 317 of 350 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 100 | 32% | 104 |
| az.Ololobot 0.2.4 | 59 | 19% | 64 |
| catcat20.Lambda 0.024 | 39 | 12% | 52 |
| stelo.SoRobotNanoMelee 1.2 | 35 | 11% | 37 |
| apollokidd.ApolloKidd 0.9 | 33 | 10% | 34 |
| winamp32.micro.MicroMacro 1.0 | 20 | 6% | 24 |
| gimp.GimpBot 0.1 | 14 | 4% | 16 |
| dcs.Eater_of_Worlds 1.1.3-A | 9 | 3% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8 | 3% | 10 |

## Melee bench: F41

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 64.3 | 46 / 350 | 4.22 | 12.4% | 31165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.1 | 16.6% | 154 |
| ary.Swarm 1.1 | 2.1 | 14.1% | 49 |
| lessonz.robocode.Oz 0.5.0 | 3.1 | 13.2% | 52 |
| hadur117.nano.SanaroEN 0.1 | 4.0 | 12.4% | 46 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.8% | 29 |
| shrub.Silver v048 | 6.1 | 9.4% | 8 |
| zyx.nano.Ant 1.1 | 7.1 | 7.6% | 1 |
| jsal.Jsalbot 1.0 | 7.9 | 6.5% | 8 |
| stelo.Mirror 1.1 | 8.9 | 5.5% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.9 | 65.7 | 5 / 35 | 2962 |
| 2 | 4 | 58.2 | 62.2 | 4 / 35 | 3181 |
| 3 | 5 | 57.3 | 62.5 | 3 / 35 | 3021 |
| 4 | 4 | 56.7 | 60.3 | 2 / 35 | 3199 |
| 5 | 4 | 58.9 | 67.0 | 6 / 35 | 3058 |
| 6 | 5 | 54.7 | 56.5 | 3 / 35 | 2604 |
| 7 | 3 | 60.5 | 69.2 | 7 / 35 | 3112 |
| 8 | 4 | 59.5 | 65.4 | 7 / 35 | 3431 |
| 9 | 3 | 60.5 | 69.8 | 5 / 35 | 3334 |
| 10 | 4 | 58.5 | 63.8 | 4 / 35 | 3263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 39 | 38% |
| ary.Swarm 1.1 | 27 | 48% |
| lessonz.robocode.Oz 0.5.0 | 20 | 35% |
| simonton.nano.MeleeSeed 1.8 | 16 | 50% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 0% |
| shrub.Silver v048 | 1 | 100% |

Hadur died in 304 of 350 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ary.Swarm 1.1 | 84 | 28% | 96 |
| eem.EvBotNG v12.8 | 69 | 23% | 85 |
| simonton.nano.MeleeSeed 1.8 | 55 | 18% | 63 |
| lessonz.robocode.Oz 0.5.0 | 48 | 16% | 54 |
| shrub.Silver v048 | 23 | 8% | 24 |
| zyx.nano.Ant 1.1 | 11 | 4% | 11 |
| stelo.Mirror 1.1 | 10 | 3% | 10 |
| jsal.Jsalbot 1.0 | 3 | 1% | 4 |
| acogdev.alpha 0.2 | 1 | 0% | 1 |

## Melee bench: F42

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 69.4 | 44 / 350 | 3.76 | 13.3% | 35597 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.4% | 165 |
| maribo.mini.MiniQuester 0.1 | 2.4 | 14.8% | 63 |
| ara.Shera 0.88 | 2.8 | 14.3% | 71 |
| hadur117.nano.SanaroEN 0.1 | 3.8 | 13.3% | 44 |
| amz.NanoClone 1.41 | 5.1 | 8.8% | 2 |
| maribo.IotaCT 1.1 | 6.5 | 7.7% | 0 |
| dsw.StaticD 1.0 | 7.1 | 7.0% | 5 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.6% | 0 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.8% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.4 | 73.7 | 5 / 35 | 3806 |
| 2 | 4 | 60.5 | 70.5 | 4 / 35 | 3650 |
| 3 | 4 | 61.1 | 72.7 | 7 / 35 | 3519 |
| 4 | 4 | 57.3 | 63.5 | 3 / 35 | 3288 |
| 5 | 4 | 60.8 | 71.4 | 7 / 35 | 3601 |
| 6 | 3 | 61.5 | 72.7 | 8 / 35 | 3765 |
| 7 | 4 | 60.4 | 72.7 | 3 / 35 | 3241 |
| 8 | 4 | 57.7 | 62.9 | 1 / 35 | 3666 |
| 9 | 4 | 57.8 | 63.8 | 2 / 35 | 3395 |
| 10 | 4 | 60.7 | 69.8 | 4 / 35 | 3666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 61 | 34% |
| ara.Shera 0.88 | 33 | 39% |
| maribo.mini.MiniQuester 0.1 | 18 | 39% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 100% |
| dsw.StaticD 1.0 | 1 | 0% |

Hadur died in 306 of 350 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 106 | 35% | 124 |
| ara.Shera 0.88 | 72 | 24% | 87 |
| maribo.mini.MiniQuester 0.1 | 69 | 23% | 76 |
| amz.NanoClone 1.41 | 19 | 6% | 19 |
| maribo.IotaCT 1.1 | 12 | 4% | 13 |
| dsw.StaticD 1.0 | 12 | 4% | 12 |
| stelo.MirrorMicro 1.0 | 8 | 3% | 8 |
| mme.NikeEnhanced 2.0 | 5 | 2% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 1% | 6 |

## Melee bench: F43

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 60.2 | 12 / 350 | 4.58 | 11.5% | 31469 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.5% | 268 |
| brainfade.melee.Dusk 0.44 | 2.4 | 13.2% | 29 |
| dummy.micro.Sparrow 2.5 | 3.4 | 12.1% | 21 |
| hadur117.nano.SanaroEN 0.1 | 3.9 | 11.5% | 12 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.1% | 13 |
| Krabb.akim2.Akim2 1.1b | 5.6 | 10.4% | 4 |
| mz.NanoGod 2.02 | 7.2 | 8.1% | 1 |
| jab.DiamondStealer 5 | 7.8 | 7.1% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 58.3 | 60.6 | 0 / 35 | 3216 |
| 2 | 4 | 58.8 | 62.2 | 1 / 35 | 3382 |
| 3 | 2 | 59.7 | 64.4 | 2 / 35 | 3355 |
| 4 | 5 | 56.6 | 56.8 | 0 / 35 | 2894 |
| 5 | 3 | 59.2 | 62.5 | 2 / 35 | 3202 |
| 6 | 4 | 57.6 | 60.3 | 1 / 35 | 2950 |
| 7 | 3 | 57.9 | 59.0 | 3 / 35 | 3262 |
| 8 | 3 | 57.8 | 61.3 | 0 / 35 | 3138 |
| 9 | 4 | 59.8 | 63.8 | 2 / 35 | 3221 |
| 10 | 6 | 54.1 | 51.1 | 1 / 35 | 2849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 59 | 7% |
| brainfade.melee.Dusk 0.44 | 8 | 63% |
| dummy.micro.Sparrow 2.5 | 7 | 43% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 0% |
| mz.NanoGod 2.02 | 1 | 0% |

Hadur died in 338 of 350 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 136 | 40% | 139 |
| dummy.micro.Sparrow 2.5 | 51 | 15% | 52 |
| wcsv.melee.EngineerMelee 0.1 | 45 | 13% | 45 |
| brainfade.melee.Dusk 0.44 | 40 | 12% | 48 |
| Krabb.akim2.Akim2 1.1b | 27 | 8% | 27 |
| mz.NanoGod 2.02 | 21 | 6% | 21 |
| jab.DiamondStealer 5 | 17 | 5% | 17 |
| cvt.Firsty 1.0 | 1 | 0% | 1 |

## Melee bench: F44

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 65.6 | 42 / 350 | 4.10 | 13.3% | 38299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.1 | 17.2% | 158 |
| tzu.TheArtOfWar 1.2 | 2.0 | 15.2% | 89 |
| hadur117.nano.SanaroEN 0.1 | 2.9 | 13.3% | 42 |
| jwirde.Gort 2.0 | 4.6 | 10.8% | 31 |
| wompi.Quokka 1.6 | 4.9 | 10.5% | 12 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 9.3% | 7 |
| disan.Chair 2.2.0 | 7.3 | 7.7% | 7 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.9% | 5 |
| amk.jointstrike.JointStrike 0.2 | 9.4 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.6 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.1 | 64.1 | 3 / 35 | 3706 |
| 2 | 2 | 63.5 | 73.3 | 6 / 35 | 4563 |
| 3 | 3 | 61.5 | 68.6 | 8 / 35 | 4009 |
| 4 | 3 | 60.3 | 70.5 | 2 / 35 | 3443 |
| 5 | 3 | 56.0 | 57.5 | 0 / 35 | 3619 |
| 6 | 3 | 58.6 | 62.5 | 2 / 35 | 4092 |
| 7 | 3 | 62.0 | 69.5 | 8 / 35 | 3957 |
| 8 | 3 | 57.2 | 60.0 | 4 / 35 | 3480 |
| 9 | 3 | 58.8 | 62.2 | 5 / 35 | 3757 |
| 10 | 3 | 59.8 | 67.6 | 4 / 35 | 3673 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 61 | 30% |
| tzu.TheArtOfWar 1.2 | 34 | 32% |
| jwirde.Gort 2.0 | 13 | 38% |
| wompi.Quokka 1.6 | 4 | 50% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 67% |
| disan.Chair 2.2.0 | 3 | 67% |
| sample.Crazy 1.0 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 0% |

Hadur died in 309 of 350 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 103 | 33% | 120 |
| tzu.TheArtOfWar 1.2 | 78 | 25% | 88 |
| jwirde.Gort 2.0 | 34 | 11% | 39 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 26 | 8% | 30 |
| stf.PanzerGeneral 0.1 | 24 | 8% | 24 |
| wompi.Quokka 1.6 | 22 | 7% | 24 |
| disan.Chair 2.2.0 | 15 | 5% | 16 |
| sample.Crazy 1.0 | 4 | 1% | 6 |
| amk.jointstrike.JointStrike 0.2 | 3 | 1% | 3 |

## Melee bench: F45

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 64.2 | 41 / 350 | 4.22 | 13.2% | 37182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 1.5 | 13.6% | 202 |
| hadur117.nano.SanaroEN 0.1 | 2.0 | 13.2% | 41 |
| jje.BagPuss 1.2 | 3.1 | 12.3% | 16 |
| myl.nano.Graviton 1.10 | 4.5 | 11.1% | 13 |
| sul.Lunar 1.1 | 4.6 | 11.1% | 39 |
| hvilela.HVilela 0.9 | 6.2 | 9.4% | 4 |
| pez.mini.ChironexFleckeri 0.5 | 6.9 | 8.6% | 11 |
| fm.claire 1.7 | 7.6 | 8.4% | 1 |
| wit.Deep7 2.0 | 8.7 | 7.2% | 22 |
| abud.ThirdRobo 1.0 | 9.9 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.2 | 70.2 | 4 / 35 | 3704 |
| 2 | 2 | 56.2 | 58.1 | 4 / 35 | 3494 |
| 3 | 2 | 60.7 | 68.6 | 5 / 35 | 4103 |
| 4 | 2 | 55.2 | 54.9 | 4 / 35 | 3681 |
| 5 | 3 | 55.9 | 58.4 | 4 / 35 | 3251 |
| 6 | 2 | 57.1 | 61.3 | 3 / 35 | 3538 |
| 7 | 2 | 60.4 | 68.9 | 4 / 35 | 3810 |
| 8 | 1 | 61.1 | 68.6 | 7 / 35 | 4198 |
| 9 | 2 | 58.8 | 67.3 | 4 / 35 | 3443 |
| 10 | 2 | 59.1 | 66.0 | 2 / 35 | 3960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 60 | 28% |
| sul.Lunar 1.1 | 13 | 23% |
| myl.nano.Graviton 1.10 | 10 | 60% |
| jje.BagPuss 1.2 | 9 | 56% |
| wit.Deep7 2.0 | 9 | 44% |
| pez.mini.ChironexFleckeri 0.5 | 5 | 40% |
| hvilela.HVilela 0.9 | 4 | 100% |
| abud.ThirdRobo 1.0 | 1 | 0% |

Hadur died in 311 of 350 rounds, at a mean tick of 1020. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 56 | 18% | 82 |
| myl.nano.Graviton 1.10 | 55 | 18% | 71 |
| eem.IWillFireNoBullet v2.8 | 50 | 16% | 0 |
| sul.Lunar 1.1 | 40 | 13% | 63 |
| hvilela.HVilela 0.9 | 31 | 10% | 37 |
| fm.claire 1.7 | 29 | 9% | 33 |
| pez.mini.ChironexFleckeri 0.5 | 27 | 9% | 34 |
| wit.Deep7 2.0 | 14 | 5% | 17 |
| abud.ThirdRobo 1.0 | 9 | 3% | 13 |

## Melee bench: F46

hadur117.nano.SanaroEN 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 67.5 | 30 / 350 | 3.92 | 12.3% | 28607 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.6% | 131 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 17.1% | 150 |
| hadur117.nano.SanaroEN 0.1 | 3.2 | 12.3% | 30 |
| mz.MicroSheep 1.0 | 4.5 | 10.7% | 6 |
| cx.Princess 1.0 | 4.6 | 10.7% | 26 |
| sadoner.killer 0.2 | 5.7 | 9.2% | 2 |
| arthord.NanoSatanMelee Beta | 7.1 | 7.7% | 5 |
| jeremyreeder.collective.Prophet 5 | 7.9 | 6.2% | 1 |
| kurios.DOSexe .9a | 9.1 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.9 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.3 | 67.0 | 4 / 35 | 2919 |
| 2 | 3 | 59.3 | 69.2 | 4 / 35 | 2864 |
| 3 | 3 | 57.4 | 65.1 | 2 / 35 | 2881 |
| 4 | 3 | 58.9 | 68.9 | 4 / 35 | 2966 |
| 5 | 3 | 60.9 | 70.8 | 7 / 35 | 3217 |
| 6 | 3 | 59.1 | 70.8 | 4 / 35 | 2841 |
| 7 | 3 | 57.1 | 64.4 | 0 / 35 | 3021 |
| 8 | 3 | 59.9 | 70.8 | 3 / 35 | 3042 |
| 9 | 4 | 55.4 | 62.9 | 1 / 35 | 2434 |
| 10 | 4 | 56.7 | 65.4 | 1 / 35 | 2422 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 62 | 23% |
| rsalesc.melee.Medina 0.4.5 | 30 | 27% |
| cx.Princess 1.0 | 10 | 60% |
| mz.MicroSheep 1.0 | 2 | 0% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 0% |

Hadur died in 320 of 350 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 123 | 38% | 139 |
| rsalesc.melee.Medina 0.4.5 | 92 | 29% | 101 |
| mz.MicroSheep 1.0 | 30 | 9% | 31 |
| sadoner.killer 0.2 | 24 | 8% | 24 |
| cx.Princess 1.0 | 19 | 6% | 22 |
| arthord.NanoSatanMelee Beta | 15 | 5% | 16 |
| jeremyreeder.collective.Prophet 5 | 10 | 3% | 9 |
| kurios.DOSexe .9a | 5 | 2% | 6 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 2 |

