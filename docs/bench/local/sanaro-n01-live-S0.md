# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 74.6 | 30 / 210 | 3.29 | 13.9% | 21998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.0% | 136 |
| hadur117.nano.SanaroS0 0.1 | 2.0 | 13.9% | 30 |
| mz.MicroGodMelee 1 | 3.8 | 11.8% | 15 |
| sgp.JollyNinja 3.53 | 3.8 | 12.1% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 11.4% | 5 |
| lorneswork.Predator 1.0 | 5.8 | 9.9% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.5% | 1 |
| skm.butterfly 1.0 | 9.0 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 74.3 | 5 / 35 | 3765 |
| 2 | 2 | 61.9 | 73.7 | 8 / 35 | 3472 |
| 3 | 2 | 60.8 | 72.7 | 3 / 35 | 3772 |
| 4 | 2 | 61.5 | 75.9 | 2 / 35 | 3589 |
| 5 | 2 | 61.5 | 74.9 | 5 / 35 | 3558 |
| 6 | 2 | 62.7 | 76.2 | 7 / 35 | 3842 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 69 | 6% |
| sgp.JollyNinja 3.53 | 13 | 54% |
| mz.MicroGodMelee 1 | 13 | 69% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 83% |
| lorneswork.Predator 1.0 | 4 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 50% |

Hadur died in 180 of 210 rounds, at a mean tick of 1176. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 90 | 50% | 98 |
| sgp.JollyNinja 3.53 | 37 | 21% | 45 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 9% | 20 |
| mz.MicroGodMelee 1 | 15 | 8% | 21 |
| lorneswork.Predator 1.0 | 11 | 6% | 14 |
| adt.Ar2 1.0 | 6 | 3% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 2% | 4 |
| skm.butterfly 1.0 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 63.3 | 33 / 210 | 4.30 | 13.4% | 25371 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.5 | 14.7% | 54 |
| pulsar.PulsarMax 0.8.9 | 1.8 | 14.2% | 53 |
| hadur117.nano.SanaroS0 0.1 | 2.7 | 13.4% | 33 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.6% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 10.2% | 20 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 8.3% | 5 |
| sch.Simone 0.3d | 6.8 | 8.7% | 19 |
| Noran.BitchingElk 0.054 | 7.7 | 7.9% | 14 |
| stelo.PatternRobot 1.0 | 8.7 | 6.6% | 9 |
| fullsail.SweetTea 1.1 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.1 | 62.5 | 3 / 35 | 4438 |
| 2 | 3 | 58.9 | 62.2 | 5 / 35 | 4216 |
| 3 | 3 | 60.3 | 62.5 | 9 / 35 | 4376 |
| 4 | 2 | 61.2 | 68.9 | 6 / 35 | 4366 |
| 5 | 3 | 58.9 | 63.2 | 6 / 35 | 3930 |
| 6 | 3 | 57.5 | 60.6 | 4 / 35 | 4045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 26 | 46% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 26 | 19% |
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 44% |
| sch.Simone 0.3d | 7 | 29% |
| Noran.BitchingElk 0.054 | 6 | 50% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 100% |
| stelo.PatternRobot 1.0 | 3 | 33% |
| fnc.bandit.Bandit 5.2.0 | 3 | 33% |
| fullsail.SweetTea 1.1 | 2 | 50% |

Hadur died in 177 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 48 | 27% | 53 |
| pulsar.PulsarMax 0.8.9 | 40 | 23% | 47 |
| lrem.micro.SpikeSoldier 0.4 | 20 | 11% | 26 |
| sch.Simone 0.3d | 16 | 9% | 19 |
| com.cohesiva.robocode.ManOwaR 1.0 | 14 | 8% | 19 |
| fnc.bandit.Bandit 5.2.0 | 14 | 8% | 17 |
| stelo.PatternRobot 1.0 | 12 | 7% | 12 |
| Noran.BitchingElk 0.054 | 10 | 6% | 12 |
| fullsail.SweetTea 1.1 | 3 | 2% | 5 |

## Melee bench: F03

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 76.9 | 37 / 210 | 3.08 | 14.6% | 24770 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.3 | 14.9% | 64 |
| hadur117.nano.SanaroS0 0.1 | 2.0 | 14.6% | 37 |
| kawigi.nano.Lib 1.0 | 3.2 | 13.8% | 43 |
| vuen.Cake 2.51 | 3.5 | 13.7% | 55 |
| urdos.URDOS 1.3 | 5.0 | 10.1% | 6 |
| ghent.ArthurPanzergon 1.0.0 | 6.5 | 8.1% | 3 |
| adt.Ar1 2.1 | 6.5 | 8.0% | 1 |
| oa.weak.FlyMk1 0.1 | 8.0 | 6.7% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.3 | 69.5 | 8 / 35 | 4063 |
| 2 | 1 | 63.6 | 80.6 | 7 / 35 | 4449 |
| 3 | 2 | 61.9 | 78.1 | 5 / 35 | 4090 |
| 4 | 1 | 62.4 | 79.0 | 7 / 35 | 3951 |
| 5 | 3 | 61.7 | 74.6 | 5 / 35 | 4201 |
| 6 | 2 | 62.4 | 79.7 | 5 / 35 | 4016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 41 | 37% |
| vuen.Cake 2.51 | 38 | 34% |
| kawigi.nano.Lib 1.0 | 25 | 12% |
| urdos.URDOS 1.3 | 6 | 33% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 173 of 210 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 50 | 29% | 63 |
| kawigi.nano.Lib 1.0 | 48 | 28% | 51 |
| vuen.Cake 2.51 | 33 | 19% | 49 |
| urdos.URDOS 1.3 | 23 | 13% | 25 |
| ghent.ArthurPanzergon 1.0.0 | 8 | 5% | 9 |
| adt.Ar1 2.1 | 6 | 3% | 6 |
| oa.weak.FlyMk1 0.1 | 4 | 2% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 1% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 70.7 | 6 / 210 | 3.63 | 13.9% | 26879 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.3% | 195 |
| hadur117.nano.SanaroS0 0.1 | 2.5 | 13.9% | 6 |
| apc.LeeroyJenkins2 1.0 | 2.5 | 13.8% | 5 |
| TNT.TNT 0.99.1 | 4.2 | 10.5% | 2 |
| josago.Jorgito 0.16 | 4.8 | 9.3% | 0 |
| css.Delitioner 0.11 | 6.3 | 7.7% | 2 |
| tj.zombie1n 1.0.1 | 6.7 | 7.1% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.1% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.4% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 74.6 | 2 / 35 | 5020 |
| 2 | 2 | 62.4 | 71.4 | 1 / 35 | 4308 |
| 3 | 3 | 62.4 | 71.1 | 1 / 35 | 4409 |
| 4 | 2 | 63.3 | 72.7 | 0 / 35 | 4756 |
| 5 | 3 | 61.6 | 67.6 | 2 / 35 | 4360 |
| 6 | 3 | 60.2 | 67.0 | 0 / 35 | 4026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 85 | 7% |
| apc.LeeroyJenkins2 1.0 | 1 | 0% |

Hadur died in 204 of 210 rounds, at a mean tick of 1163. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 134 | 66% | 139 |
| apc.LeeroyJenkins2 1.0 | 27 | 13% | 28 |
| josago.Jorgito 0.16 | 17 | 8% | 17 |
| TNT.TNT 0.99.1 | 11 | 5% | 11 |
| tj.zombie1n 1.0.1 | 8 | 4% | 8 |
| css.Delitioner 0.11 | 7 | 3% | 7 |

## Melee bench: F06

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 64.8 | 30 / 210 | 4.17 | 12.5% | 19162 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 1.5 | 15.0% | 72 |
| jekl.StoneGhost 0.7 | 1.5 | 15.1% | 54 |
| hadur117.nano.SanaroS0 0.1 | 3.5 | 12.5% | 30 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 11.9% | 25 |
| mld.Wisdom 1.0 | 4.8 | 11.0% | 12 |
| gg.Wolverine 2.0 | 6.5 | 8.5% | 9 |
| spinnercat.Omen 1.0 | 7.3 | 8.1% | 2 |
| DBall.NUKE 0.1 | 7.5 | 7.8% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 8.7 | 6.8% | 2 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.7 | 68.3 | 6 / 35 | 3443 |
| 2 | 3 | 59.3 | 70.2 | 5 / 35 | 3160 |
| 3 | 3 | 58.5 | 64.8 | 6 / 35 | 3258 |
| 4 | 4 | 56.5 | 61.9 | 4 / 35 | 3082 |
| 5 | 3 | 57.5 | 64.8 | 4 / 35 | 3178 |
| 6 | 4 | 55.2 | 58.7 | 5 / 35 | 3041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 23 | 48% |
| jekl.StoneGhost 0.7 | 19 | 42% |
| pe.minimelee.SandboxMiniMelee 1.1 | 9 | 56% |
| mld.Wisdom 1.0 | 5 | 0% |
| gg.Wolverine 2.0 | 5 | 60% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 67% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 65 | 36% | 69 |
| mld.Wisdom 1.0 | 34 | 19% | 35 |
| origin.SleepSiphon 1.7b | 31 | 17% | 42 |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 14% | 32 |
| spinnercat.Omen 1.0 | 9 | 5% | 9 |
| gg.Wolverine 2.0 | 7 | 4% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 3% | 7 |
| DBall.NUKE 0.1 | 3 | 2% | 6 |
| sample.Fire 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.4 | 60 / 210 | 2.59 | 16.9% | 30118 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.7 | 17.9% | 53 |
| rtk.Tachikoma 1.0 | 2.2 | 17.5% | 62 |
| hadur117.nano.SanaroS0 0.1 | 2.2 | 16.9% | 60 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.8% | 15 |
| franzor.Lizt 1.3.1 | 5.0 | 11.0% | 20 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.8% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.6 | 77.8 | 5 / 35 | 4688 |
| 2 | 2 | 69.5 | 87.6 | 13 / 35 | 5242 |
| 3 | 1 | 68.7 | 85.1 | 12 / 35 | 5364 |
| 4 | 3 | 64.8 | 74.6 | 3 / 35 | 4897 |
| 5 | 2 | 68.7 | 85.4 | 14 / 35 | 5036 |
| 6 | 2 | 68.1 | 83.8 | 13 / 35 | 4891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 57 | 56% |
| rsalesc.melee.Monk 0.3.6c | 37 | 22% |
| oog.melee.CapuletDroid 1.1 | 23 | 78% |
| franzor.Lizt 1.3.1 | 4 | 25% |
| exauge.GateKeeper 1.1.121g | 2 | 50% |

Hadur died in 150 of 210 rounds, at a mean tick of 1227. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 71 | 47% | 108 |
| rsalesc.melee.Monk 0.3.6c | 54 | 36% | 65 |
| oog.melee.CapuletDroid 1.1 | 14 | 9% | 29 |
| franzor.Lizt 1.3.1 | 7 | 5% | 2 |
| exauge.GateKeeper 1.1.121g | 2 | 1% | 4 |
| lrem.micro.MoggFanatic 0.2 | 2 | 1% | 2 |

## Melee bench: F08

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 66.9 | 41 / 210 | 3.98 | 13.2% | 20262 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| shrub.Vapour v159 | 1.2 | 14.7% | 60 |
| tm.Yuugao 1.0 | 2.3 | 13.3% | 59 |
| hadur117.nano.SanaroS0 0.1 | 2.5 | 13.2% | 41 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 10.5% | 15 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.7% | 18 |
| jwst.DAD.DarkAndDarker 1.1 | 6.0 | 9.0% | 9 |
| m3thos.Eva00 1.1 | 6.8 | 8.5% | 6 |
| SHAM.WOW 1.4 | 8.7 | 7.3% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.7% | 2 |
| qualidafial.MajorDick 1.0.1 | 9.2 | 7.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.6 | 74.6 | 7 / 35 | 3339 |
| 2 | 2 | 60.6 | 72.7 | 9 / 35 | 3295 |
| 3 | 3 | 57.4 | 64.1 | 3 / 35 | 3485 |
| 4 | 2 | 57.9 | 64.1 | 10 / 35 | 3470 |
| 5 | 3 | 57.7 | 64.8 | 6 / 35 | 3359 |
| 6 | 3 | 56.8 | 61.3 | 6 / 35 | 3314 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 27 | 37% |
| tm.Yuugao 1.0 | 22 | 36% |
| Krabb.sliNk.Garm 0.9u | 13 | 85% |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 56% |
| com.spp.robocode.MostlyHarmless 010 | 8 | 25% |
| SHAM.WOW 1.4 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 50% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 45 | 26% | 59 |
| tm.Yuugao 1.0 | 38 | 22% | 49 |
| com.spp.robocode.MostlyHarmless 010 | 27 | 16% | 34 |
| Krabb.sliNk.Garm 0.9u | 16 | 9% | 19 |
| zyx.nano.BacillusComma 1.0 | 16 | 9% | 16 |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 5% | 14 |
| m3thos.Eva00 1.1 | 9 | 5% | 9 |
| qualidafial.MajorDick 1.0.1 | 5 | 3% | 5 |
| SHAM.WOW 1.4 | 5 | 3% | 5 |

## Melee bench: F09

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.2 | 59.5 | 15 / 210 | 4.64 | 11.5% | 17750 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.3% | 123 |
| kc.micro.Figment 1.0 | 2.0 | 15.7% | 46 |
| hadur117.nano.SanaroS0 0.1 | 3.7 | 11.5% | 15 |
| yagami.Tidus 0.11 | 3.8 | 11.1% | 2 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.3% | 10 |
| mc2.enemy.Original 0.9 | 5.8 | 9.4% | 10 |
| dft.Calliope 5.6 | 6.8 | 8.1% | 4 |
| step.nanoPri 1.0 | 8.5 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.2% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.1 | 55.9 | 3 / 35 | 2964 |
| 2 | 4 | 56.6 | 61.0 | 3 / 35 | 2740 |
| 3 | 3 | 56.5 | 60.3 | 1 / 35 | 3156 |
| 4 | 4 | 54.4 | 55.6 | 2 / 35 | 2922 |
| 5 | 3 | 59.3 | 66.7 | 4 / 35 | 3107 |
| 6 | 4 | 55.5 | 57.8 | 2 / 35 | 2861 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 31 | 26% |
| kc.micro.Figment 1.0 | 17 | 24% |
| dft.Calliope 5.6 | 3 | 33% |
| mc2.enemy.Original 0.9 | 2 | 0% |
| pedersen.Grishnakh 1.0 | 2 | 50% |
| yagami.Tidus 0.11 | 1 | 100% |

Hadur died in 195 of 210 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 60 | 31% | 69 |
| kc.micro.Figment 1.0 | 44 | 23% | 47 |
| mc2.enemy.Original 0.9 | 22 | 11% | 22 |
| yagami.Tidus 0.11 | 21 | 11% | 23 |
| pedersen.Grishnakh 1.0 | 21 | 11% | 21 |
| dft.Calliope 5.6 | 8 | 4% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7 | 4% | 7 |
| rdm.Dueler 0.4x | 6 | 3% | 6 |
| step.nanoPri 1.0 | 6 | 3% | 6 |

## Melee bench: F10

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 79.8 | 66 / 210 | 2.81 | 15.7% | 25551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS0 0.1 | 1.0 | 15.7% | 66 |
| DTF.Kludgy 1.2b | 2.5 | 14.2% | 47 |
| ne.Chimera 1.2 | 2.7 | 13.9% | 33 |
| ejb.Polaris 1.0.1 | 4.2 | 12.4% | 23 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.8% | 21 |
| vStar.RAFzilla 2.15 | 5.5 | 10.9% | 11 |
| sam.Samspin 1.0 | 7.7 | 6.3% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.8% | 0 |
| kurios.DOSexe .9b | 8.8 | 5.4% | 4 |
| donjezza.Muncho 1.0 | 9.3 | 4.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.3 | 75.6 | 8 / 35 | 4168 |
| 2 | 1 | 63.5 | 77.8 | 9 / 35 | 4224 |
| 3 | 1 | 64.3 | 78.4 | 13 / 35 | 4323 |
| 4 | 1 | 64.0 | 80.3 | 9 / 35 | 4326 |
| 5 | 1 | 65.4 | 84.1 | 15 / 35 | 4335 |
| 6 | 1 | 64.9 | 82.9 | 12 / 35 | 4175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 35 | 74% |
| DTF.Kludgy 1.2b | 20 | 45% |
| ne.Chimera 1.2 | 18 | 44% |
| tvv.micro.Antares 1.1.1 | 16 | 31% |
| vStar.RAFzilla 2.15 | 15 | 87% |
| kurios.DOSexe .9b | 3 | 100% |
| sam.Samspin 1.0 | 2 | 50% |
| donjezza.Muncho 1.0 | 2 | 50% |

Hadur died in 145 of 210 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ne.Chimera 1.2 | 48 | 33% | 60 |
| DTF.Kludgy 1.2b | 43 | 30% | 50 |
| tvv.micro.Antares 1.1.1 | 22 | 15% | 21 |
| ejb.Polaris 1.0.1 | 18 | 12% | 45 |
| vStar.RAFzilla 2.15 | 7 | 5% | 18 |
| sam.Samspin 1.0 | 3 | 2% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 1% | 2 |
| kurios.DOSexe .9b | 1 | 1% | 6 |
| donjezza.Muncho 1.0 | 1 | 1% | 3 |

## Melee bench: F11

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.7 | 61.3 | 26 / 210 | 4.48 | 12.0% | 18584 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.9% | 98 |
| cx.mini.Nimrod 0.55 | 2.3 | 12.7% | 31 |
| hadur117.nano.SanaroS0 0.1 | 3.2 | 12.0% | 26 |
| djc.DynaBot 0.1.1 | 3.8 | 11.5% | 16 |
| br2.MobyDickBot 1.6 | 5.3 | 10.1% | 17 |
| uji.YellohFellah 1.0 | 6.3 | 8.9% | 13 |
| rdt199.Warlord 0.73 | 6.5 | 9.0% | 9 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.7% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.8 | 58.1 | 5 / 35 | 3081 |
| 2 | 3 | 57.5 | 63.2 | 5 / 35 | 3106 |
| 3 | 4 | 56.2 | 60.0 | 3 / 35 | 3180 |
| 4 | 3 | 56.7 | 62.2 | 4 / 35 | 2840 |
| 5 | 2 | 57.5 | 65.7 | 4 / 35 | 2984 |
| 6 | 4 | 56.4 | 58.7 | 5 / 35 | 3393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 31 | 39% |
| cx.mini.Nimrod 0.55 | 13 | 46% |
| djc.DynaBot 0.1.1 | 8 | 63% |
| br2.MobyDickBot 1.6 | 6 | 17% |
| uji.YellohFellah 1.0 | 3 | 33% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 71 | 39% | 81 |
| cx.mini.Nimrod 0.55 | 36 | 20% | 41 |
| djc.DynaBot 0.1.1 | 20 | 11% | 25 |
| rdt199.Warlord 0.73 | 17 | 9% | 18 |
| br2.MobyDickBot 1.6 | 11 | 6% | 13 |
| KiraNL.Chupacabra 0.4 | 10 | 5% | 11 |
| uji.YellohFellah 1.0 | 8 | 4% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 3% | 5 |
| stelo.MirrorNano 1.3 | 5 | 3% | 6 |

## Melee bench: F12

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 66.9 | 35 / 210 | 3.98 | 12.9% | 17815 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.3 | 15.0% | 63 |
| nat.PallasHawk 1.0 | 2.7 | 13.6% | 58 |
| hadur117.nano.SanaroS0 0.1 | 3.0 | 12.9% | 35 |
| darkcanuck.Leon 1.01 | 3.0 | 13.2% | 34 |
| brainfade.melee.Genghis 0.36 | 5.2 | 9.9% | 10 |
| jrm.Test0 1.0 | 6.2 | 8.6% | 3 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.8% | 2 |
| jp.Perpy 16.0 | 7.8 | 7.0% | 1 |
| jaybot.bots.Oddball 4.0 | 9.3 | 6.1% | 5 |
| stuff.Vlad 0.1 | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 75.9 | 12 / 35 | 3293 |
| 2 | 4 | 55.3 | 61.0 | 2 / 35 | 2627 |
| 3 | 2 | 61.1 | 72.1 | 9 / 35 | 3203 |
| 4 | 4 | 56.4 | 61.9 | 4 / 35 | 2982 |
| 5 | 4 | 56.1 | 62.5 | 4 / 35 | 2827 |
| 6 | 3 | 58.1 | 68.3 | 4 / 35 | 2883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 26 | 54% |
| nat.PallasHawk 1.0 | 24 | 25% |
| darkcanuck.Leon 1.01 | 18 | 50% |
| jaybot.bots.Oddball 4.0 | 4 | 0% |
| brainfade.melee.Genghis 0.36 | 4 | 75% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jp.Perpy 16.0 | 2 | 50% |

Hadur died in 175 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 48 | 27% | 54 |
| bts.wiki.RipCurl 0.9b | 46 | 26% | 61 |
| darkcanuck.Leon 1.01 | 24 | 14% | 35 |
| brainfade.melee.Genghis 0.36 | 16 | 9% | 16 |
| jrm.Test0 1.0 | 11 | 6% | 11 |
| jp.Perpy 16.0 | 9 | 5% | 10 |
| cs.sheldor.Talon 1.1 | 8 | 5% | 9 |
| jaybot.bots.Oddball 4.0 | 7 | 4% | 7 |
| stuff.Vlad 0.1 | 6 | 3% | 7 |

## Melee bench: F13

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 70.0 | 19 / 210 | 3.70 | 12.7% | 18982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.3 | 16.9% | 60 |
| mn.Combat 3.25.0 | 1.7 | 16.6% | 88 |
| shinh.Entangled 0.3 | 3.7 | 12.7% | 24 |
| hadur117.nano.SanaroS0 0.1 | 4.0 | 12.7% | 19 |
| gh.micro.Gruweltje 0.7 | 4.3 | 12.4% | 17 |
| apc.Colossus2 0.17 | 6.2 | 7.9% | 0 |
| stelo.Wang 1.0 | 7.0 | 7.1% | 2 |
| ayk.WallHugger 1.0 | 8.0 | 5.7% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 58.7 | 68.3 | 0 / 35 | 3073 |
| 2 | 5 | 58.4 | 66.7 | 4 / 35 | 3057 |
| 3 | 3 | 58.4 | 68.9 | 4 / 35 | 2955 |
| 4 | 4 | 60.6 | 72.1 | 4 / 35 | 3348 |
| 5 | 3 | 60.5 | 73.3 | 3 / 35 | 3191 |
| 6 | 4 | 59.9 | 70.8 | 4 / 35 | 3358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 35 | 29% |
| ags.Glacier 0.2.11 | 30 | 13% |
| shinh.Entangled 0.3 | 14 | 21% |
| gh.micro.Gruweltje 0.7 | 5 | 40% |
| stelo.Wang 1.0 | 1 | 0% |

Hadur died in 191 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 56 | 29% | 65 |
| ags.Glacier 0.2.11 | 56 | 29% | 60 |
| gh.micro.Gruweltje 0.7 | 27 | 14% | 31 |
| shinh.Entangled 0.3 | 27 | 14% | 28 |
| stelo.Wang 1.0 | 13 | 7% | 13 |
| apc.Colossus2 0.17 | 5 | 3% | 5 |
| maribo.FollowFire 1 | 4 | 2% | 4 |
| ayk.WallHugger 1.0 | 2 | 1% | 3 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 74.8 | 50 / 210 | 3.27 | 14.2% | 20523 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.9% | 97 |
| hadur117.nano.SanaroS0 0.1 | 2.0 | 14.2% | 50 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.2% | 31 |
| Lo_Ian.Gandalf_V4 4.0 | 4.5 | 10.8% | 10 |
| co.edu.usb.rc.LidisTron 1.0 | 5.0 | 10.3% | 3 |
| sanyi.mikrobi.Roberto 1.0 | 6.0 | 9.3% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 9.4% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 8.2% | 11 |
| pa.Improved 1.0 | 9.0 | 5.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.6 | 67.0 | 5 / 35 | 3207 |
| 2 | 2 | 62.1 | 77.1 | 8 / 35 | 3379 |
| 3 | 2 | 61.1 | 71.7 | 9 / 35 | 3493 |
| 4 | 2 | 61.3 | 74.0 | 7 / 35 | 3147 |
| 5 | 2 | 63.0 | 79.7 | 10 / 35 | 3290 |
| 6 | 2 | 64.1 | 79.0 | 11 / 35 | 4007 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 62 | 31% |
| catcat20.shape.Theta 0.018 | 27 | 48% |
| sanyi.mikrobi.Roberto 1.0 | 8 | 50% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 63% |
| co.edu.usb.rc.LidisTron 1.0 | 7 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 0% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 70 | 44% | 90 |
| catcat20.shape.Theta 0.018 | 32 | 20% | 43 |
| Lo_Ian.Gandalf_V4 4.0 | 16 | 10% | 19 |
| sanyi.mikrobi.Roberto 1.0 | 14 | 9% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 7% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 6% | 15 |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 3% | 5 |
| pa.Improved 1.0 | 1 | 1% | 2 |
| sample.TrackFire 1.0 | 1 | 1% | 1 |

## Melee bench: F15

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 65.4 | 32 / 210 | 4.11 | 13.1% | 22187 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.3 | 15.2% | 53 |
| emp.Yngwie 1.11 | 1.8 | 13.8% | 64 |
| mld.DustBunny 3.8 | 3.3 | 12.7% | 20 |
| hadur117.nano.SanaroS0 0.1 | 3.7 | 13.1% | 32 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.5% | 13 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.1% | 23 |
| Grystrion.TrackerWO 1.0 | 7.5 | 7.3% | 1 |
| lambdaxy.TBot 0.1 | 7.7 | 7.0% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.3 | 5.1% | 2 |
| divineomega.TrialBot 0.003 | 9.5 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 70.2 | 4 / 35 | 3882 |
| 2 | 3 | 60.3 | 68.6 | 6 / 35 | 3892 |
| 3 | 4 | 58.4 | 62.5 | 5 / 35 | 3994 |
| 4 | 3 | 58.6 | 66.0 | 5 / 35 | 3335 |
| 5 | 4 | 58.6 | 63.8 | 5 / 35 | 3626 |
| 6 | 5 | 58.0 | 61.6 | 7 / 35 | 3458 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 26 | 38% |
| kawigi.micro.Shiz 1.1 | 16 | 31% |
| cb.nano.Insomnia 1.0 | 9 | 78% |
| kawigi.robot.Girl 1.2 | 9 | 67% |
| mld.DustBunny 3.8 | 5 | 40% |
| divineomega.TrialBot 0.003 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 54 | 30% | 66 |
| kawigi.micro.Shiz 1.1 | 34 | 19% | 40 |
| cb.nano.Insomnia 1.0 | 27 | 15% | 25 |
| mld.DustBunny 3.8 | 26 | 15% | 34 |
| kawigi.robot.Girl 1.2 | 16 | 9% | 21 |
| Grystrion.TrackerWO 1.0 | 9 | 5% | 10 |
| lambdaxy.TBot 0.1 | 8 | 4% | 8 |
| divineomega.TrialBot 0.003 | 3 | 2% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 66.0 | 15 / 210 | 4.06 | 13.4% | 24535 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.8% | 104 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.2 | 14.6% | 24 |
| hadur117.nano.SanaroS0 0.1 | 2.8 | 13.4% | 15 |
| techdude.forest.FlamingForest 1.1 | 4.7 | 10.6% | 33 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.8% | 14 |
| bvh.fnr.Fenrir 0.36l | 6.0 | 9.5% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.3 | 8.8% | 10 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.4% | 6 |
| repositorio.NanoStep 1.0 | 8.8 | 5.3% | 2 |
| asd.Cthulhu 1.3 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 66.3 | 2 / 35 | 4413 |
| 2 | 3 | 59.6 | 65.7 | 5 / 35 | 3997 |
| 3 | 3 | 58.9 | 62.9 | 0 / 35 | 3928 |
| 4 | 2 | 61.0 | 68.9 | 3 / 35 | 4405 |
| 5 | 3 | 62.0 | 70.8 | 4 / 35 | 4122 |
| 6 | 3 | 57.4 | 61.6 | 1 / 35 | 3670 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 42 | 5% |
| techdude.forest.FlamingForest 1.1 | 9 | 33% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 7 | 57% |
| tvv.nano.Polaris 1.2 | 5 | 40% |
| stelo.IntrinsicVolatility 1.4 | 5 | 20% |
| bvh.fnr.Fenrir 0.36l | 3 | 67% |
| repositorio.NanoStep 1.0 | 1 | 0% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 195 of 210 rounds, at a mean tick of 1186. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 75 | 38% | 76 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 40 | 21% | 46 |
| bvh.fnr.Fenrir 0.36l | 17 | 9% | 18 |
| stelo.IntrinsicVolatility 1.4 | 16 | 8% | 17 |
| techdude.forest.FlamingForest 1.1 | 15 | 8% | 17 |
| tvv.nano.Polaris 1.2 | 13 | 7% | 15 |
| divineomega.DivineBot 1.9.4.5 | 9 | 5% | 10 |
| repositorio.NanoStep 1.0 | 6 | 3% | 6 |
| asd.Cthulhu 1.3 | 4 | 2% | 5 |

## Melee bench: F17

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 65.2 | 39 / 210 | 4.13 | 13.3% | 23644 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 2.0 | 13.9% | 41 |
| oog.melee.Mercutio 1.0 | 2.3 | 13.6% | 48 |
| hadur117.nano.SanaroS0 0.1 | 2.8 | 13.3% | 39 |
| cx.BlestPain 1.41 | 2.8 | 13.4% | 45 |
| nic.Nicator 2.4 | 5.2 | 11.1% | 16 |
| ahf.NanoAndrew .4 | 5.8 | 11.0% | 18 |
| maribo.melee.BMV 0.1 | 7.0 | 9.2% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.8% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.4% | 1 |
| goblin.Bender 2.4 | 10.0 | 3.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 72.4 | 8 / 35 | 4318 |
| 2 | 4 | 59.7 | 65.1 | 6 / 35 | 3794 |
| 3 | 4 | 57.7 | 61.3 | 4 / 35 | 3780 |
| 4 | 4 | 57.7 | 58.7 | 7 / 35 | 3722 |
| 5 | 2 | 60.0 | 65.7 | 8 / 35 | 3955 |
| 6 | 2 | 60.8 | 67.9 | 6 / 35 | 4075 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cx.BlestPain 1.41 | 26 | 92% |
| et.Predator 1.8 | 19 | 5% |
| oog.melee.Mercutio 1.0 | 17 | 53% |
| ahf.NanoAndrew .4 | 7 | 43% |
| nic.Nicator 2.4 | 4 | 25% |
| maribo.melee.BMV 0.1 | 1 | 100% |
| goblin.Bender 2.4 | 1 | 0% |

Hadur died in 171 of 210 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 45 | 26% | 49 |
| nic.Nicator 2.4 | 28 | 16% | 29 |
| oog.melee.Mercutio 1.0 | 27 | 16% | 36 |
| cx.BlestPain 1.41 | 22 | 13% | 44 |
| ahf.NanoAndrew .4 | 22 | 13% | 24 |
| maribo.melee.BMV 0.1 | 12 | 7% | 13 |
| goblin.Bender 2.4 | 6 | 4% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 5 | 3% | 5 |
| tex.Longbot 0.4 | 4 | 2% | 4 |

## Melee bench: F18

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 68.7 | 48 / 210 | 3.81 | 13.7% | 21155 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.2 | 14.4% | 57 |
| hadur117.nano.SanaroS0 0.1 | 2.2 | 13.7% | 48 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.4% | 38 |
| uji.DBH 1.1 | 4.0 | 11.4% | 19 |
| spinnercat.Robovirus 2.718 | 5.5 | 10.2% | 10 |
| ratosh.Nobo 0.21 | 5.7 | 10.2% | 7 |
| sigterm.Sigterm 1.0 | 6.7 | 8.5% | 11 |
| kawigi.mini.Fhqwhgads 1.1 | 8.5 | 6.9% | 7 |
| stelo.WangRobot 1.0 | 8.8 | 6.6% | 13 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.3 | 65.4 | 9 / 35 | 3680 |
| 2 | 2 | 60.3 | 70.5 | 7 / 35 | 3631 |
| 3 | 1 | 64.0 | 80.6 | 12 / 35 | 3856 |
| 4 | 3 | 59.2 | 66.7 | 8 / 35 | 3522 |
| 5 | 3 | 55.9 | 60.6 | 6 / 35 | 3132 |
| 6 | 2 | 58.9 | 68.6 | 6 / 35 | 3334 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 34 | 53% |
| uji.DBH 1.1 | 12 | 58% |
| sigterm.Sigterm 1.0 | 12 | 67% |
| spinnercat.Robovirus 2.718 | 9 | 89% |
| agd.Mooserwirt2 2.7 | 9 | 44% |
| stelo.WangRobot 1.0 | 7 | 14% |
| ratosh.Nobo 0.21 | 4 | 50% |

Hadur died in 162 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 56 | 35% | 76 |
| agd.Mooserwirt2 2.7 | 22 | 14% | 28 |
| ratosh.Nobo 0.21 | 17 | 10% | 19 |
| spinnercat.Robovirus 2.718 | 14 | 9% | 20 |
| uji.DBH 1.1 | 13 | 8% | 16 |
| sigterm.Sigterm 1.0 | 12 | 7% | 20 |
| stelo.WangRobot 1.0 | 12 | 7% | 13 |
| kawigi.mini.Fhqwhgads 1.1 | 10 | 6% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 6 | 4% | 6 |

## Melee bench: F19

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 80.3 | 58 / 210 | 2.77 | 15.9% | 24897 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mld.Infinity 2.2 | 1.5 | 16.8% | 73 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 15.7% | 54 |
| hadur117.nano.SanaroS0 0.1 | 2.3 | 15.9% | 58 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.1% | 10 |
| erdnis.Rover 0.3 | 5.2 | 10.1% | 1 |
| patson.PatsonTestBot 1.0 | 5.7 | 9.0% | 7 |
| pac.ABC 2.1 | 6.8 | 7.6% | 6 |
| mbh.Mbh 0.1 | 8.2 | 7.0% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.7% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 84.1 | 13 / 35 | 4011 |
| 2 | 2 | 65.5 | 80.0 | 11 / 35 | 4256 |
| 3 | 2 | 65.7 | 80.6 | 9 / 35 | 4561 |
| 4 | 3 | 64.8 | 78.4 | 10 / 35 | 3854 |
| 5 | 3 | 64.9 | 79.4 | 7 / 35 | 4111 |
| 6 | 2 | 64.8 | 79.4 | 8 / 35 | 4104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 73 | 53% |
| davidalves.net.DuelistMiniMelee 1.2 | 39 | 15% |
| krillr.mini.JointStrike 2.0.0 | 11 | 64% |
| patson.PatsonTestBot 1.0 | 5 | 40% |
| erdnis.Rover 0.3 | 3 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 1092. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 64 | 42% | 105 |
| mld.Infinity 2.2 | 44 | 29% | 18 |
| krillr.mini.JointStrike 2.0.0 | 20 | 13% | 35 |
| erdnis.Rover 0.3 | 9 | 6% | 12 |
| patson.PatsonTestBot 1.0 | 8 | 5% | 21 |
| pbg.R2D2 1.0 | 3 | 2% | 8 |
| pac.ABC 2.1 | 2 | 1% | 7 |
| mbh.Mbh 0.1 | 2 | 1% | 2 |

## Melee bench: F20

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 72.8 | 43 / 210 | 3.45 | 14.3% | 22100 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 18.4% | 107 |
| hadur117.nano.SanaroS0 0.1 | 2.2 | 14.3% | 43 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 12.1% | 13 |
| fwb.Nine 1.0.1 | 4.0 | 11.1% | 19 |
| catcat20.Rabbit 0.001 | 4.7 | 10.4% | 16 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.6% | 6 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 8.1% | 2 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.3% | 4 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 73.3 | 6 / 35 | 3646 |
| 2 | 2 | 62.4 | 74.3 | 8 / 35 | 3801 |
| 3 | 2 | 63.7 | 76.2 | 11 / 35 | 4188 |
| 4 | 2 | 62.9 | 76.5 | 9 / 35 | 3644 |
| 5 | 2 | 60.7 | 70.5 | 6 / 35 | 3484 |
| 6 | 3 | 57.9 | 65.7 | 3 / 35 | 3337 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 46 | 30% |
| fwb.Nine 1.0.1 | 21 | 62% |
| catcat20.Rabbit 0.001 | 10 | 100% |
| bayen.nut.Squirrel 1.615 | 4 | 100% |
| nz.jdc.nano.GridFu 1.0 | 3 | 0% |
| m3thos.mini.Eva01 0.5.5 | 2 | 0% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 76 | 45% | 85 |
| fwb.Nine 1.0.1 | 25 | 15% | 31 |
| nz.jdc.nano.GridFu 1.0 | 21 | 13% | 25 |
| catcat20.Rabbit 0.001 | 12 | 7% | 25 |
| bayen.nut.Squirrel 1.615 | 10 | 6% | 13 |
| m3thos.mini.Eva01 0.5.5 | 10 | 6% | 11 |
| ntc.ControlledChaos 1.1.4 | 7 | 4% | 8 |
| djdjdj.NanoSkunk10 1.0 | 5 | 3% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 1% | 4 |

## Melee bench: F21

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 78.9 | 69 / 210 | 2.90 | 16.4% | 28538 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.0 | 17.1% | 88 |
| hadur117.nano.SanaroS0 0.1 | 2.0 | 16.4% | 69 |
| dummy.mini.Scimitar 1.01 | 3.0 | 15.0% | 18 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 18 |
| eld.Hmm 1.0 | 5.5 | 8.6% | 17 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.6% | 1 |
| el.JumpShoot 0.2 | 7.7 | 6.5% | 1 |
| fire219.CatBot 1.0 | 7.7 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 78.4 | 11 / 35 | 5295 |
| 2 | 2 | 64.1 | 78.1 | 13 / 35 | 4105 |
| 3 | 2 | 66.3 | 81.3 | 13 / 35 | 4712 |
| 4 | 2 | 65.7 | 81.6 | 10 / 35 | 4673 |
| 5 | 2 | 65.7 | 77.5 | 12 / 35 | 4874 |
| 6 | 2 | 64.9 | 76.5 | 10 / 35 | 4879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 72 | 56% |
| dummy.mini.Scimitar 1.01 | 25 | 80% |
| cf.RiO.RiOx 4.2.1 | 8 | 50% |
| eld.Hmm 1.0 | 7 | 71% |

Hadur died in 141 of 210 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 55 | 39% | 86 |
| dummy.mini.Scimitar 1.01 | 33 | 23% | 52 |
| cf.RiO.RiOx 4.2.1 | 27 | 19% | 33 |
| eld.Hmm 1.0 | 8 | 6% | 18 |
| oa.weak.BotherBot 0.1 | 8 | 6% | 10 |
| el.JumpShoot 0.2 | 5 | 4% | 5 |
| fire219.CatBot 1.0 | 3 | 2% | 3 |
| PSW.Relentless 0.1 | 2 | 1% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F23

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 77.9 | 37 / 210 | 2.99 | 15.2% | 23664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.2 | 18.1% | 88 |
| cre.Karolos 0.32 | 2.2 | 15.5% | 55 |
| hadur117.nano.SanaroS0 0.1 | 2.7 | 15.2% | 37 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.8% | 9 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 9.2% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 9.2% | 3 |
| sample.Walls 1.0 | 6.5 | 8.9% | 9 |
| cw.megas.Blade 0.8 | 7.5 | 8.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.5 | 77.5 | 4 / 35 | 4049 |
| 2 | 3 | 63.2 | 73.7 | 8 / 35 | 3917 |
| 3 | 3 | 64.3 | 78.1 | 6 / 35 | 4008 |
| 4 | 2 | 65.8 | 81.9 | 7 / 35 | 3832 |
| 5 | 2 | 64.0 | 75.9 | 6 / 35 | 4003 |
| 6 | 3 | 64.8 | 80.3 | 6 / 35 | 3855 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 58 | 28% |
| cre.Karolos 0.32 | 36 | 22% |
| stelo.AreaTargetingBot 1.1 | 9 | 44% |
| sample.Walls 1.0 | 9 | 56% |
| stelo.RamTrackSurfer 1.2 | 6 | 33% |
| cw.megas.Blade 0.8 | 2 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 0% |

Hadur died in 173 of 210 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 77 | 45% | 93 |
| cre.Karolos 0.32 | 47 | 27% | 55 |
| stelo.AreaTargetingBot 1.1 | 14 | 8% | 16 |
| stelo.RamTrackSurfer 1.2 | 13 | 8% | 20 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 10 | 6% | 11 |
| sample.Walls 1.0 | 8 | 5% | 10 |
| cw.megas.Blade 0.8 | 3 | 2% | 4 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F24

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.5 | 57.9 | 24 / 210 | 4.79 | 11.1% | 17028 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.8 | 14.7% | 53 |
| pedersen.Ugluk 1.1.1 | 2.7 | 13.2% | 28 |
| davidalves.Phoenix 0.54 | 2.7 | 13.1% | 46 |
| florent.XSeries.X2 0.12 | 3.0 | 13.0% | 36 |
| hadur117.nano.SanaroS0 0.1 | 5.2 | 11.1% | 24 |
| oog.melee.Corsair 1.0 | 6.2 | 9.4% | 6 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 9.0% | 16 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.4% | 2 |
| evd.X1 0.01 | 9.3 | 4.9% | 0 |
| as.FrankTheTank 1.3 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.9 | 66.0 | 5 / 35 | 3106 |
| 2 | 5 | 57.2 | 61.6 | 8 / 35 | 3028 |
| 3 | 5 | 52.0 | 53.3 | 2 / 35 | 2737 |
| 4 | 7 | 50.5 | 49.8 | 5 / 35 | 2423 |
| 5 | 5 | 55.7 | 60.0 | 3 / 35 | 2841 |
| 6 | 5 | 53.8 | 56.8 | 1 / 35 | 2893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 20 | 25% |
| florent.XSeries.X2 0.12 | 12 | 58% |
| pedersen.Ugluk 1.1.1 | 10 | 50% |
| davidalves.Phoenix 0.54 | 8 | 50% |
| stelo.SoJNanoMelee 1.1 | 5 | 40% |
| oog.melee.Corsair 1.0 | 1 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 54 | 29% | 60 |
| pedersen.Ugluk 1.1.1 | 39 | 21% | 40 |
| florent.XSeries.X2 0.12 | 29 | 16% | 36 |
| davidalves.Phoenix 0.54 | 25 | 13% | 27 |
| stelo.SoJNanoMelee 1.1 | 13 | 7% | 17 |
| oog.melee.Corsair 1.0 | 11 | 6% | 14 |
| lunchie.Lunchbox 0.93 | 9 | 5% | 9 |
| as.FrankTheTank 1.3 | 4 | 2% | 5 |
| evd.X1 0.01 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 64.7 | 26 / 210 | 4.18 | 12.6% | 18355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.3 | 14.5% | 52 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.7% | 37 |
| hadur117.nano.SanaroS0 0.1 | 3.0 | 12.6% | 26 |
| jdw.Hurricane 1.4 | 4.0 | 11.9% | 35 |
| gre.svman4.Morfeas 1.4.1 | 4.7 | 11.2% | 23 |
| gjr.Cephalosporin 0.1 | 6.7 | 9.0% | 15 |
| ds.Oo 2.2 | 6.7 | 9.2% | 15 |
| awesomeness.Elite 1.0 | 8.2 | 7.2% | 4 |
| adt.Ar2 1.1 | 8.5 | 6.7% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.3 | 63.8 | 3 / 35 | 3177 |
| 2 | 3 | 54.6 | 56.8 | 1 / 35 | 3049 |
| 3 | 3 | 58.1 | 66.0 | 4 / 35 | 2848 |
| 4 | 5 | 57.2 | 63.5 | 2 / 35 | 2932 |
| 5 | 2 | 60.0 | 70.2 | 9 / 35 | 3078 |
| 6 | 2 | 59.6 | 67.6 | 7 / 35 | 3271 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 20 | 15% |
| voidious.micro.BlitzBat 1.05 | 16 | 19% |
| gre.svman4.Morfeas 1.4.1 | 11 | 73% |
| jdw.Hurricane 1.4 | 7 | 71% |
| gjr.Cephalosporin 0.1 | 7 | 14% |
| ds.Oo 2.2 | 3 | 67% |
| awesomeness.Elite 1.0 | 3 | 100% |
| adt.Ar2 1.1 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 50 | 27% | 54 |
| voidious.micro.BlitzBat 1.05 | 42 | 23% | 46 |
| gjr.Cephalosporin 0.1 | 24 | 13% | 28 |
| jdw.Hurricane 1.4 | 16 | 9% | 21 |
| ds.Oo 2.2 | 16 | 9% | 18 |
| gre.svman4.Morfeas 1.4.1 | 15 | 8% | 20 |
| adt.Ar2 1.1 | 9 | 5% | 9 |
| awesomeness.Elite 1.0 | 7 | 4% | 9 |
| amk.ChumbaMini 0.2 | 5 | 3% | 5 |

## Melee bench: F26

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 68.1 | 32 / 210 | 3.87 | 13.2% | 22742 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.1% | 73 |
| hadur117.nano.SanaroS0 0.1 | 2.7 | 13.2% | 32 |
| shu.nitro.LENIN .T34 | 3.0 | 13.0% | 43 |
| lrem.Spectre 0.4.4 | 3.7 | 12.7% | 31 |
| gh.mini.GrubbmOne 1.0 | 5.3 | 10.9% | 9 |
| js.PinBall 1.6 | 5.7 | 10.8% | 14 |
| jaybot.adv.bots.JayBot 2.0 | 6.7 | 9.5% | 6 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 1 |
| sample.SpinBot 1.0 | 9.0 | 5.1% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.8 | 63.5 | 4 / 35 | 3808 |
| 2 | 2 | 60.8 | 69.2 | 6 / 35 | 3845 |
| 3 | 5 | 57.4 | 63.5 | 4 / 35 | 3446 |
| 4 | 2 | 60.6 | 70.8 | 5 / 35 | 3702 |
| 5 | 2 | 61.1 | 68.3 | 9 / 35 | 3955 |
| 6 | 2 | 61.6 | 73.7 | 4 / 35 | 3986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 29 | 28% |
| shu.nitro.LENIN .T34 | 22 | 41% |
| lrem.Spectre 0.4.4 | 16 | 69% |
| jaybot.adv.bots.JayBot 2.0 | 4 | 50% |
| gh.mini.GrubbmOne 1.0 | 4 | 0% |
| js.PinBall 1.6 | 2 | 50% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 0% |

Hadur died in 178 of 210 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 50 | 28% | 61 |
| gh.mini.GrubbmOne 1.0 | 34 | 19% | 34 |
| shu.nitro.LENIN .T34 | 31 | 17% | 40 |
| lrem.Spectre 0.4.4 | 24 | 13% | 30 |
| js.PinBall 1.6 | 18 | 10% | 21 |
| jaybot.adv.bots.JayBot 2.0 | 13 | 7% | 15 |
| sample.SpinBot 1.0 | 6 | 3% | 6 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 1% | 3 |

## Melee bench: F27

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 67.1 | 33 / 210 | 3.96 | 12.8% | 18031 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.0 | 16.1% | 89 |
| sheldor.melee.nano.TestMelee 0.1 | 3.2 | 12.1% | 27 |
| hadur117.nano.SanaroS0 0.1 | 3.3 | 12.8% | 33 |
| wee.Gem 1.8.4 | 3.8 | 11.5% | 33 |
| EH.Eagle 1.0.6 | 4.2 | 11.2% | 12 |
| joe.ADinosaur 1.0 | 6.3 | 9.2% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 7.0 | 8.6% | 9 |
| throxbot.ThroxBot 0.1 | 7.5 | 8.1% | 2 |
| caimano.Furia_Ceca 0.22 | 9.2 | 5.6% | 2 |
| cs.Grudge 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 79.0 | 8 / 35 | 3193 |
| 2 | 4 | 56.5 | 65.7 | 5 / 35 | 2656 |
| 3 | 2 | 61.0 | 77.5 | 7 / 35 | 2767 |
| 4 | 4 | 57.1 | 65.1 | 6 / 35 | 2524 |
| 5 | 5 | 54.2 | 47.9 | 3 / 35 | 3963 |
| 6 | 3 | 57.8 | 67.3 | 4 / 35 | 2928 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 42 | 40% |
| wee.Gem 1.8.4 | 14 | 29% |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 33% |
| EH.Eagle 1.0.6 | 7 | 43% |
| techdude.kombat.FlamingKombat 1.5 | 3 | 100% |
| throxbot.ThroxBot 0.1 | 2 | 50% |
| joe.ADinosaur 1.0 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |

Hadur died in 177 of 210 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 60 | 34% | 76 |
| sheldor.melee.nano.TestMelee 0.1 | 28 | 16% | 31 |
| wee.Gem 1.8.4 | 22 | 12% | 28 |
| joe.ADinosaur 1.0 | 17 | 10% | 17 |
| EH.Eagle 1.0.6 | 14 | 8% | 20 |
| techdude.kombat.FlamingKombat 1.5 | 11 | 6% | 13 |
| throxbot.ThroxBot 0.1 | 10 | 6% | 11 |
| caimano.Furia_Ceca 0.22 | 8 | 5% | 8 |
| cs.Grudge 1.0 | 7 | 4% | 6 |

## Melee bench: F28

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 81.5 | 74 / 210 | 2.67 | 16.1% | 21423 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.3 | 15.9% | 63 |
| hadur117.nano.SanaroS0 0.1 | 1.7 | 16.1% | 74 |
| uji.Antique 1.0 | 3.2 | 12.9% | 37 |
| pfvicm.Sobieski 7.2.3b | 4.2 | 10.8% | 8 |
| qohnil.blot.BlotBot 3.61 | 4.7 | 10.9% | 19 |
| ahr.ice.Ice 1.0.2 | 6.5 | 7.9% | 5 |
| amk.ChumbaWumba 0.3 | 6.8 | 7.7% | 2 |
| matt.advanced.Katana 1.0 | 8.3 | 6.1% | 1 |
| stelo.PianistNano 1.2 | 8.8 | 6.1% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 81.6 | 12 / 35 | 3823 |
| 2 | 1 | 65.1 | 83.5 | 16 / 35 | 3577 |
| 3 | 2 | 62.6 | 79.0 | 7 / 35 | 3434 |
| 4 | 1 | 65.8 | 85.1 | 18 / 35 | 3516 |
| 5 | 2 | 63.1 | 77.1 | 10 / 35 | 3630 |
| 6 | 2 | 64.2 | 82.5 | 11 / 35 | 3443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 72 | 51% |
| uji.Antique 1.0 | 38 | 63% |
| qohnil.blot.BlotBot 3.61 | 8 | 38% |
| pfvicm.Sobieski 7.2.3b | 6 | 67% |
| amk.ChumbaWumba 0.3 | 4 | 75% |
| stelo.PianistNano 1.2 | 2 | 100% |
| ahr.ice.Ice 1.0.2 | 2 | 0% |
| matt.advanced.Katana 1.0 | 2 | 50% |

Hadur died in 137 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 58 | 42% | 79 |
| uji.Antique 1.0 | 24 | 18% | 50 |
| pfvicm.Sobieski 7.2.3b | 18 | 13% | 21 |
| qohnil.blot.BlotBot 3.61 | 17 | 12% | 25 |
| amk.ChumbaWumba 0.3 | 8 | 6% | 12 |
| ahr.ice.Ice 1.0.2 | 7 | 5% | 8 |
| stelo.PianistNano 1.2 | 2 | 1% | 7 |
| matt.advanced.Katana 1.0 | 2 | 1% | 6 |
| stelo.Lifestealer 1.0 | 1 | 1% | 2 |

## Melee bench: F29

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 59.6 | 22 / 210 | 4.63 | 11.9% | 18919 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.5 | 16.6% | 74 |
| zyx.mega.YersiniaPestis 3.1 | 1.8 | 15.5% | 63 |
| myl.micro.Troodon 1.10 | 3.0 | 13.5% | 23 |
| hadur117.nano.SanaroS0 0.1 | 3.8 | 11.9% | 22 |
| jok.PheonixM 0.1.2 | 4.8 | 11.1% | 9 |
| ph.melee.ArcherME 0.3 | 6.5 | 8.1% | 0 |
| DBall.Anarchy 0.1 | 6.5 | 8.3% | 15 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.3 | 4.7% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.3 | 59.0 | 2 / 35 | 3253 |
| 2 | 4 | 54.8 | 56.2 | 1 / 35 | 2898 |
| 3 | 4 | 56.2 | 58.1 | 4 / 35 | 3051 |
| 4 | 3 | 60.2 | 67.3 | 4 / 35 | 3339 |
| 5 | 5 | 55.3 | 54.9 | 5 / 35 | 2940 |
| 6 | 3 | 58.9 | 62.2 | 6 / 35 | 3438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 29 | 24% |
| zyx.mega.YersiniaPestis 3.1 | 16 | 44% |
| myl.micro.Troodon 1.10 | 11 | 18% |
| DBall.Anarchy 0.1 | 6 | 83% |
| ap.Frederick 1.1 | 1 | 0% |
| jangs.ns51 1.0 | 1 | 0% |
| jok.PheonixM 0.1.2 | 1 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 62 | 33% | 69 |
| zyx.mega.YersiniaPestis 3.1 | 44 | 23% | 51 |
| myl.micro.Troodon 1.10 | 35 | 19% | 36 |
| jok.PheonixM 0.1.2 | 23 | 12% | 25 |
| fullsail.TimbotNoPrediction 1.0 | 11 | 6% | 11 |
| DBall.Anarchy 0.1 | 5 | 3% | 10 |
| ph.melee.ArcherME 0.3 | 5 | 3% | 5 |
| jangs.ns51 1.0 | 3 | 2% | 3 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F30

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.0 | 57.7 | 19 / 210 | 4.80 | 11.1% | 17584 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 2.2 | 14.3% | 53 |
| oog.melee.Capulet 1.2 | 2.2 | 13.9% | 46 |
| catcat20.Matcha 0.006 | 2.7 | 13.7% | 47 |
| stelo.PastFuture 2.3.2 | 3.0 | 13.3% | 25 |
| hadur117.nano.SanaroS0 0.1 | 5.2 | 11.1% | 19 |
| intruder.PrairieWolf 2.61 | 5.8 | 9.1% | 10 |
| ntc.Opposite 1.5 | 7.5 | 7.9% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 7.2% | 5 |
| tripphippy.Alice 1.1 | 8.3 | 6.9% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.6 | 56.5 | 4 / 35 | 2835 |
| 2 | 6 | 50.4 | 46.3 | 1 / 35 | 2861 |
| 3 | 5 | 58.9 | 66.7 | 5 / 35 | 3271 |
| 4 | 5 | 53.7 | 54.3 | 2 / 35 | 2860 |
| 5 | 5 | 55.0 | 60.0 | 2 / 35 | 2754 |
| 6 | 5 | 57.3 | 62.5 | 5 / 35 | 3003 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 17 | 29% |
| catcat20.Matcha 0.006 | 13 | 46% |
| stelo.PastFuture 2.3.2 | 8 | 38% |
| oog.melee.Capulet 1.2 | 6 | 0% |
| intruder.PrairieWolf 2.61 | 4 | 50% |
| tripphippy.Alice 1.1 | 3 | 67% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 50% |

Hadur died in 191 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 45 | 24% | 50 |
| oog.melee.Capulet 1.2 | 37 | 19% | 41 |
| stelo.PastFuture 2.3.2 | 35 | 18% | 39 |
| catcat20.Matcha 0.006 | 30 | 16% | 35 |
| intruder.PrairieWolf 2.61 | 16 | 8% | 16 |
| ntc.Opposite 1.5 | 14 | 7% | 14 |
| tripphippy.Alice 1.1 | 7 | 4% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 3% | 5 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |

## Melee bench: F31

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.3 | 59.2 | 11 / 210 | 4.67 | 11.2% | 16691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.9% | 116 |
| gh.mini.Griezel 0.2 | 2.0 | 14.1% | 51 |
| spinnercat.micro.Tyger 0.1 | 3.8 | 11.5% | 15 |
| hadur117.nano.SanaroS0 0.1 | 4.0 | 11.2% | 11 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.0% | 10 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.3% | 1 |
| timmit.nano.TimDog 0.33 | 7.5 | 7.1% | 1 |
| fm.mammillarias 1.3 | 7.7 | 7.0% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.5% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.1 | 59.7 | 1 / 35 | 2851 |
| 2 | 3 | 57.1 | 65.4 | 1 / 35 | 2784 |
| 3 | 5 | 53.0 | 52.1 | 3 / 35 | 2624 |
| 4 | 3 | 58.6 | 64.8 | 3 / 35 | 3309 |
| 5 | 6 | 51.0 | 50.8 | 0 / 35 | 2552 |
| 6 | 4 | 56.7 | 62.5 | 3 / 35 | 2571 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 31 | 29% |
| gh.mini.Griezel 0.2 | 18 | 6% |
| d414.nano.Quantum 1.0.0 | 6 | 17% |
| spinnercat.micro.Tyger 0.1 | 2 | 0% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |

Hadur died in 199 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 57 | 29% | 64 |
| gh.mini.Griezel 0.2 | 47 | 24% | 48 |
| spinnercat.micro.Tyger 0.1 | 39 | 20% | 39 |
| d414.nano.Quantum 1.0.0 | 22 | 11% | 24 |
| gh.nano.Grofvuil 0.2 | 15 | 8% | 15 |
| fm.mammillarias 1.3 | 12 | 6% | 13 |
| timmit.nano.TimDog 0.33 | 4 | 2% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |

## Melee bench: F32

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 75.2 | 57 / 210 | 3.23 | 14.6% | 21606 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.3 | 15.7% | 79 |
| hadur117.nano.SanaroS0 0.1 | 1.7 | 14.6% | 57 |
| lxx.ConceptA 0.8 | 4.0 | 11.6% | 4 |
| apc.botM 3.0 | 4.0 | 12.2% | 27 |
| vjik.UnViolation 1.1 | 4.2 | 11.3% | 25 |
| bayen.UbaMicro 1.4 | 6.0 | 9.3% | 8 |
| panzer.Panzer 0.2 | 7.0 | 7.6% | 2 |
| yk.JahMicro 1.0 | 8.2 | 6.7% | 6 |
| conscience.Electron 1.3g | 9.0 | 5.9% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 81.0 | 10 / 35 | 3563 |
| 2 | 2 | 60.4 | 71.1 | 8 / 35 | 3376 |
| 3 | 2 | 59.8 | 70.8 | 6 / 35 | 3491 |
| 4 | 1 | 63.7 | 78.1 | 12 / 35 | 4221 |
| 5 | 2 | 61.0 | 72.1 | 10 / 35 | 3449 |
| 6 | 1 | 62.5 | 78.1 | 11 / 35 | 3506 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 46 | 28% |
| apc.botM 3.0 | 24 | 67% |
| lxx.ConceptA 0.8 | 14 | 79% |
| vjik.UnViolation 1.1 | 13 | 54% |
| bayen.UbaMicro 1.4 | 6 | 67% |
| panzer.Panzer 0.2 | 4 | 75% |
| donjezza.Jezza 1.0 | 2 | 100% |
| yk.JahMicro 1.0 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 66 | 43% | 78 |
| lxx.ConceptA 0.8 | 31 | 20% | 36 |
| apc.botM 3.0 | 19 | 12% | 38 |
| vjik.UnViolation 1.1 | 14 | 9% | 23 |
| bayen.UbaMicro 1.4 | 12 | 8% | 15 |
| panzer.Panzer 0.2 | 5 | 3% | 7 |
| yk.JahMicro 1.0 | 3 | 2% | 4 |
| conscience.Electron 1.3g | 2 | 1% | 2 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |

## Melee bench: F33

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 68.6 | 31 / 210 | 3.83 | 13.6% | 21205 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 18.6% | 97 |
| hadur117.nano.SanaroS0 0.1 | 2.3 | 13.6% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.6% | 25 |
| gre.svman4.Leonidas 1.3.2 | 3.5 | 11.8% | 25 |
| labg.Cataclysm 2.05 | 4.8 | 10.9% | 19 |
| baal.nano.N 1.42 | 6.2 | 9.0% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.6% | 8 |
| zyx.micro.Ant 1.1 | 8.7 | 5.4% | 1 |
| sanja.First 0.1 | 8.8 | 5.0% | 3 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 67.6 | 6 / 35 | 3642 |
| 2 | 2 | 60.8 | 68.6 | 6 / 35 | 3627 |
| 3 | 3 | 60.7 | 70.5 | 5 / 35 | 3436 |
| 4 | 2 | 61.5 | 68.9 | 6 / 35 | 3914 |
| 5 | 2 | 62.2 | 73.3 | 7 / 35 | 3559 |
| 6 | 3 | 56.9 | 62.5 | 1 / 35 | 3027 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 30 | 20% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 43% |
| gre.svman4.Leonidas 1.3.2 | 17 | 59% |
| labg.Cataclysm 2.05 | 11 | 36% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 1 | 100% |
| sanja.First 0.1 | 1 | 0% |

Hadur died in 179 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 75 | 42% | 82 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 16% | 36 |
| gre.svman4.Leonidas 1.3.2 | 26 | 15% | 34 |
| labg.Cataclysm 2.05 | 16 | 9% | 19 |
| kinsen.melee.Angsaichmophobia 1.8c | 16 | 9% | 16 |
| baal.nano.N 1.42 | 9 | 5% | 12 |
| zyx.micro.Ant 1.1 | 6 | 3% | 7 |
| sanja.First 0.1 | 3 | 2% | 4 |

## Melee bench: F34

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 71.6 | 37 / 210 | 3.55 | 14.3% | 24262 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 17.1% | 75 |
| kid.Gladiator .7.2 | 1.7 | 17.0% | 62 |
| hadur117.nano.SanaroS0 0.1 | 2.8 | 14.3% | 37 |
| jcs.Seth 1.8 | 4.2 | 11.7% | 22 |
| tcf.Reach 3 | 4.8 | 11.0% | 12 |
| cli.Dancer 1.1 | 6.0 | 9.6% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 8.0% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.6% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.6 | 64.8 | 3 / 35 | 4106 |
| 2 | 2 | 65.4 | 81.0 | 8 / 35 | 4435 |
| 3 | 3 | 66.1 | 80.6 | 10 / 35 | 4294 |
| 4 | 3 | 61.0 | 66.7 | 6 / 35 | 3686 |
| 5 | 3 | 62.8 | 72.7 | 6 / 35 | 3920 |
| 6 | 3 | 60.0 | 64.1 | 4 / 35 | 3821 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 37 | 62% |
| kid.Gladiator .7.2 | 30 | 13% |
| jcs.Seth 1.8 | 12 | 50% |
| tcf.Reach 3 | 3 | 33% |
| cli.Dancer 1.1 | 2 | 50% |
| ratosh.Wesco 1.4 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 173 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 64 | 37% | 64 |
| stelo.Spread 0.9 | 52 | 30% | 77 |
| jcs.Seth 1.8 | 19 | 11% | 26 |
| tcf.Reach 3 | 17 | 10% | 18 |
| ratosh.Wesco 1.4 | 12 | 7% | 13 |
| cli.Dancer 1.1 | 6 | 3% | 8 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| sample.VelociRobot 1.0 | 1 | 1% | 2 |

## Melee bench: F35

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 69.3 | 10 / 210 | 3.77 | 12.7% | 17418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 21.0% | 171 |
| gh.mini.Gruwel 0.9 | 2.5 | 13.3% | 16 |
| hadur117.nano.SanaroS0 0.1 | 3.0 | 12.7% | 10 |
| rz.HawkOnFire 0.1 | 4.0 | 11.8% | 3 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.8% | 8 |
| myl.nano.KomoriNinja 1.1 | 6.2 | 7.1% | 1 |
| wit.Chuliath 1.0 | 7.2 | 6.6% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 6.0% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 5.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.4 | 66.3 | 1 / 35 | 3111 |
| 2 | 4 | 58.7 | 66.3 | 2 / 35 | 3013 |
| 3 | 3 | 59.6 | 69.5 | 3 / 35 | 2917 |
| 4 | 3 | 58.6 | 68.9 | 2 / 35 | 2719 |
| 5 | 2 | 60.1 | 73.3 | 0 / 35 | 2971 |
| 6 | 3 | 59.6 | 71.1 | 2 / 35 | 2687 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 55 | 5% |
| gh.mini.Gruwel 0.9 | 8 | 38% |
| rz.HawkOnFire 0.1 | 4 | 50% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 50% |

Hadur died in 200 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 101 | 51% | 104 |
| gh.mini.Gruwel 0.9 | 28 | 14% | 31 |
| dmh.robocode.robot.BlackDeath 9.2 | 26 | 13% | 29 |
| rz.HawkOnFire 0.1 | 24 | 12% | 25 |
| myl.nano.KomoriNinja 1.1 | 9 | 5% | 9 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 3% | 6 |
| wit.Chuliath 1.0 | 3 | 2% | 3 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 69.9 | 62 / 210 | 3.71 | 14.3% | 21923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS0 0.1 | 1.3 | 14.3% | 62 |
| alpha.RainingFire 1.0 | 2.7 | 12.6% | 34 |
| bzdp.Pansy 2.1 | 2.8 | 12.4% | 33 |
| bvh.micro.Freya 0.3 | 4.0 | 11.8% | 22 |
| mz.Cork 0.1 | 4.3 | 11.7% | 26 |
| m3thos.Eva02 0.7.1 | 6.2 | 10.1% | 18 |
| bvh.mini.Fenrir 0.39 | 6.7 | 9.6% | 5 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 6.6% | 4 |
| dl.BetterWalls 1.0 | 8.5 | 7.1% | 5 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 58.0 | 62.9 | 8 / 35 | 3310 |
| 2 | 1 | 64.9 | 80.6 | 15 / 35 | 4024 |
| 3 | 1 | 61.8 | 70.8 | 14 / 35 | 3766 |
| 4 | 1 | 62.0 | 72.4 | 10 / 35 | 3897 |
| 5 | 2 | 58.7 | 64.8 | 8 / 35 | 3308 |
| 6 | 2 | 60.0 | 67.9 | 7 / 35 | 3618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 25 | 52% |
| mz.Cork 0.1 | 21 | 81% |
| alpha.RainingFire 1.0 | 17 | 59% |
| bvh.micro.Freya 0.3 | 12 | 75% |
| bvh.mini.Fenrir 0.39 | 8 | 100% |
| m3thos.Eva02 0.7.1 | 7 | 57% |
| squidM.TentalceMeleeNano 1.1 | 2 | 50% |

Hadur died in 148 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 29 | 20% | 41 |
| bzdp.Pansy 2.1 | 27 | 18% | 42 |
| bvh.micro.Freya 0.3 | 25 | 17% | 30 |
| m3thos.Eva02 0.7.1 | 21 | 14% | 25 |
| mz.Cork 0.1 | 17 | 11% | 32 |
| bvh.mini.Fenrir 0.39 | 15 | 10% | 15 |
| squidM.TentalceMeleeNano 1.1 | 7 | 5% | 11 |
| dl.BetterWalls 1.0 | 5 | 3% | 9 |
| sample.MyFirstRobot 1.0 | 2 | 1% | 4 |

## Melee bench: F37

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 73.1 | 53 / 210 | 3.42 | 14.5% | 25878 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS0 0.1 | 1.2 | 14.5% | 53 |
| germ.TheMind .2 | 3.0 | 11.4% | 34 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 11.1% | 22 |
| EBBU.Sim2 1.02 | 4.0 | 10.4% | 13 |
| agrach.Dalek 1.0 | 4.7 | 10.2% | 34 |
| mb.Beast 0.1 | 6.8 | 9.0% | 15 |
| lmk.ACPFinal 0.1 | 7.5 | 8.8% | 15 |
| stelo.UntouchableNano 1.3 | 7.5 | 8.6% | 15 |
| skm.Ryubot 1.0 | 8.2 | 8.2% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 8.7 | 7.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.5 | 73.0 | 8 / 35 | 4206 |
| 2 | 1 | 61.8 | 74.6 | 12 / 35 | 4551 |
| 3 | 1 | 61.6 | 79.4 | 9 / 35 | 4228 |
| 4 | 1 | 61.8 | 73.7 | 9 / 35 | 4903 |
| 5 | 2 | 57.9 | 68.3 | 8 / 35 | 3634 |
| 6 | 1 | 59.7 | 69.5 | 7 / 35 | 4356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 18 | 28% |
| agrach.Dalek 1.0 | 15 | 33% |
| mb.Beast 0.1 | 15 | 60% |
| EBBU.Sim2 1.02 | 14 | 57% |
| stelo.UntouchableNano 1.3 | 13 | 54% |
| com.syncleus.robocode.Dreadnaught 0.1 | 13 | 69% |
| skm.Ryubot 1.0 | 10 | 50% |
| lmk.ACPFinal 0.1 | 8 | 63% |

Hadur died in 158 of 210 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 31 | 20% | 36 |
| agrach.Dalek 1.0 | 27 | 17% | 34 |
| EBBU.Sim2 1.02 | 22 | 14% | 26 |
| com.syncleus.robocode.Dreadnaught 0.1 | 21 | 13% | 33 |
| mb.Beast 0.1 | 14 | 9% | 26 |
| lmk.ACPFinal 0.1 | 14 | 9% | 20 |
| stelo.UntouchableNano 1.3 | 12 | 8% | 14 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 6% | 9 |
| skm.Ryubot 1.0 | 8 | 5% | 11 |

## Melee bench: F38

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 61.6 | 16 / 210 | 4.46 | 11.6% | 18315 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.8% | 97 |
| bvh.mini.Freya 0.55 | 2.5 | 13.6% | 28 |
| bts.mega.Gnarly 1.4 | 3.2 | 12.4% | 35 |
| hadur117.nano.SanaroS0 0.1 | 4.2 | 11.6% | 16 |
| cs.Wren 1.0 | 4.8 | 11.2% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.7 | 10.4% | 9 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.4% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 6.1% | 5 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.2% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 68.3 | 4 / 35 | 3322 |
| 2 | 5 | 54.5 | 56.2 | 2 / 35 | 2906 |
| 3 | 4 | 55.7 | 59.7 | 3 / 35 | 2948 |
| 4 | 6 | 52.7 | 55.9 | 1 / 35 | 2718 |
| 5 | 5 | 57.0 | 61.6 | 3 / 35 | 3312 |
| 6 | 2 | 58.9 | 67.9 | 3 / 35 | 3109 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 28 | 32% |
| bts.mega.Gnarly 1.4 | 14 | 21% |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 13% |
| bvh.mini.Freya 0.55 | 6 | 17% |
| cs.Wren 1.0 | 2 | 0% |
| kdf.KoulDestroyer 1.0 | 2 | 50% |
| matt.UnderDark3 2.4.34 | 1 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 0% |

Hadur died in 194 of 210 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 56 | 29% | 65 |
| bvh.mini.Freya 0.55 | 38 | 20% | 40 |
| bts.mega.Gnarly 1.4 | 31 | 16% | 34 |
| davidalves.net.DuelistNanoMelee 1.01 | 28 | 14% | 29 |
| kdf.KoulDestroyer 1.0 | 17 | 9% | 18 |
| cs.Wren 1.0 | 17 | 9% | 17 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 2 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 3 |
| bzdp.BoxCar 2.0 | 2 | 1% | 2 |

## Melee bench: F39

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.4 | 62.6 | 21 / 210 | 4.37 | 12.0% | 19833 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.0 | 15.8% | 58 |
| az.Ololobot 0.2.4 | 2.0 | 14.1% | 72 |
| hadur117.nano.SanaroS0 0.1 | 3.2 | 12.0% | 21 |
| catcat20.Lambda 0.024 | 4.0 | 11.2% | 25 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.8% | 23 |
| apollokidd.ApolloKidd 0.9 | 6.3 | 8.9% | 4 |
| winamp32.micro.MicroMacro 1.0 | 7.0 | 8.5% | 3 |
| gimp.GimpBot 0.1 | 7.2 | 8.3% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.3% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.5 | 61.3 | 5 / 35 | 3484 |
| 2 | 3 | 56.0 | 63.5 | 2 / 35 | 3198 |
| 3 | 3 | 56.6 | 61.9 | 5 / 35 | 3211 |
| 4 | 3 | 57.7 | 64.8 | 3 / 35 | 3517 |
| 5 | 3 | 55.6 | 61.3 | 4 / 35 | 3066 |
| 6 | 4 | 56.0 | 62.9 | 2 / 35 | 3357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 25 | 16% |
| bvh.fry.Freya 0.82 | 21 | 29% |
| catcat20.Lambda 0.024 | 12 | 58% |
| stelo.SoRobotNanoMelee 1.2 | 4 | 0% |
| gimp.GimpBot 0.1 | 3 | 67% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |
| winamp32.micro.MicroMacro 1.0 | 1 | 0% |

Hadur died in 189 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 65 | 34% | 72 |
| az.Ololobot 0.2.4 | 40 | 21% | 41 |
| stelo.SoRobotNanoMelee 1.2 | 25 | 13% | 25 |
| catcat20.Lambda 0.024 | 22 | 12% | 31 |
| apollokidd.ApolloKidd 0.9 | 13 | 7% | 14 |
| winamp32.micro.MicroMacro 1.0 | 10 | 5% | 10 |
| gimp.GimpBot 0.1 | 7 | 4% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 5 | 3% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 3 |

## Melee bench: F41

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 66.5 | 37 / 210 | 4.01 | 12.8% | 18234 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.4% | 100 |
| ary.Swarm 1.1 | 3.0 | 13.5% | 18 |
| lessonz.robocode.Oz 0.5.0 | 3.0 | 13.2% | 27 |
| hadur117.nano.SanaroS0 0.1 | 3.8 | 12.8% | 37 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 12.0% | 22 |
| shrub.Silver v048 | 6.3 | 8.9% | 1 |
| zyx.nano.Ant 1.1 | 6.8 | 7.5% | 0 |
| stelo.Mirror 1.1 | 8.3 | 6.0% | 3 |
| jsal.Jsalbot 1.0 | 8.5 | 6.4% | 3 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.4 | 58.4 | 3 / 35 | 3056 |
| 2 | 5 | 59.1 | 65.7 | 6 / 35 | 3130 |
| 3 | 4 | 60.2 | 68.6 | 9 / 35 | 3051 |
| 4 | 4 | 58.5 | 65.7 | 5 / 35 | 2860 |
| 5 | 2 | 61.5 | 71.7 | 7 / 35 | 3064 |
| 6 | 3 | 59.7 | 68.9 | 7 / 35 | 3073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 48 | 25% |
| lessonz.robocode.Oz 0.5.0 | 13 | 46% |
| ary.Swarm 1.1 | 13 | 85% |
| simonton.nano.MeleeSeed 1.8 | 8 | 88% |
| shrub.Silver v048 | 2 | 50% |

Hadur died in 174 of 210 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 69 | 40% | 82 |
| ary.Swarm 1.1 | 38 | 22% | 51 |
| lessonz.robocode.Oz 0.5.0 | 28 | 16% | 31 |
| simonton.nano.MeleeSeed 1.8 | 20 | 11% | 24 |
| shrub.Silver v048 | 7 | 4% | 7 |
| stelo.Mirror 1.1 | 5 | 3% | 6 |
| acogdev.alpha 0.2 | 3 | 2% | 3 |
| zyx.nano.Ant 1.1 | 2 | 1% | 2 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 67.6 | 29 / 210 | 3.91 | 13.2% | 22221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.9% | 113 |
| maribo.mini.MiniQuester 0.1 | 2.5 | 14.4% | 24 |
| ara.Shera 0.88 | 2.8 | 14.2% | 37 |
| hadur117.nano.SanaroS0 0.1 | 3.7 | 13.2% | 29 |
| amz.NanoClone 1.41 | 5.0 | 8.8% | 1 |
| maribo.IotaCT 1.1 | 6.5 | 7.6% | 4 |
| dsw.StaticD 1.0 | 6.8 | 7.1% | 2 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.8% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.2 | 63.8 | 2 / 35 | 3639 |
| 2 | 4 | 58.9 | 65.4 | 4 / 35 | 3661 |
| 3 | 4 | 60.6 | 69.5 | 8 / 35 | 3784 |
| 4 | 3 | 61.8 | 72.4 | 7 / 35 | 3767 |
| 5 | 4 | 59.4 | 65.7 | 5 / 35 | 3672 |
| 6 | 3 | 60.0 | 68.9 | 3 / 35 | 3698 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 36 | 22% |
| ara.Shera 0.88 | 21 | 57% |
| maribo.mini.MiniQuester 0.1 | 9 | 67% |
| dsw.StaticD 1.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 63 | 35% | 72 |
| ara.Shera 0.88 | 43 | 24% | 55 |
| maribo.mini.MiniQuester 0.1 | 34 | 19% | 40 |
| amz.NanoClone 1.41 | 16 | 9% | 16 |
| maribo.IotaCT 1.1 | 9 | 5% | 9 |
| dsw.StaticD 1.0 | 6 | 3% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 5 | 3% | 5 |
| stelo.MirrorMicro 1.0 | 3 | 2% | 4 |
| mme.NikeEnhanced 2.0 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 63.9 | 10 / 210 | 4.25 | 12.2% | 19596 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.7% | 171 |
| brainfade.melee.Dusk 0.44 | 2.8 | 12.5% | 17 |
| hadur117.nano.SanaroS0 0.1 | 3.2 | 12.2% | 10 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.3% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 5.2 | 10.5% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 10.1% | 3 |
| mz.NanoGod 2.02 | 7.2 | 8.2% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 66.3 | 1 / 35 | 3595 |
| 2 | 3 | 59.7 | 64.1 | 4 / 35 | 3318 |
| 3 | 2 | 60.3 | 66.7 | 0 / 35 | 3408 |
| 4 | 6 | 55.0 | 53.3 | 1 / 35 | 2812 |
| 5 | 2 | 60.3 | 65.4 | 3 / 35 | 3467 |
| 6 | 3 | 59.8 | 67.6 | 1 / 35 | 2996 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 42 | 7% |
| dummy.micro.Sparrow 2.5 | 7 | 43% |
| brainfade.melee.Dusk 0.44 | 5 | 60% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 50% |
| Krabb.akim2.Akim2 1.1b | 2 | 0% |

Hadur died in 201 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 105 | 52% | 107 |
| brainfade.melee.Dusk 0.44 | 22 | 11% | 26 |
| dummy.micro.Sparrow 2.5 | 22 | 11% | 25 |
| wcsv.melee.EngineerMelee 0.1 | 19 | 9% | 20 |
| mz.NanoGod 2.02 | 11 | 5% | 11 |
| Krabb.akim2.Akim2 1.1b | 11 | 5% | 11 |
| jab.DiamondStealer 5 | 10 | 5% | 10 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 65.4 | 30 / 210 | 4.11 | 13.2% | 22087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.3 | 17.5% | 105 |
| tzu.TheArtOfWar 1.2 | 1.8 | 15.5% | 49 |
| hadur117.nano.SanaroS0 0.1 | 3.0 | 13.2% | 30 |
| wompi.Quokka 1.6 | 4.0 | 11.0% | 9 |
| jwirde.Gort 2.0 | 5.0 | 10.2% | 11 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.8 | 9.4% | 3 |
| disan.Chair 2.2.0 | 7.2 | 7.5% | 2 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.2% | 1 |
| sample.Crazy 1.0 | 9.3 | 4.9% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 64.4 | 5 / 35 | 3562 |
| 2 | 3 | 58.3 | 63.8 | 2 / 35 | 3631 |
| 3 | 2 | 63.5 | 75.9 | 8 / 35 | 4284 |
| 4 | 3 | 57.5 | 58.4 | 4 / 35 | 3616 |
| 5 | 4 | 56.1 | 58.1 | 4 / 35 | 3198 |
| 6 | 3 | 62.3 | 71.7 | 7 / 35 | 3796 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 45 | 31% |
| tzu.TheArtOfWar 1.2 | 21 | 29% |
| jwirde.Gort 2.0 | 11 | 55% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 67% |
| wompi.Quokka 1.6 | 3 | 33% |
| stf.PanzerGeneral 0.1 | 1 | 0% |
| disan.Chair 2.2.0 | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 69 | 38% | 85 |
| tzu.TheArtOfWar 1.2 | 57 | 32% | 65 |
| wompi.Quokka 1.6 | 16 | 9% | 15 |
| jwirde.Gort 2.0 | 15 | 8% | 21 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 5% | 9 |
| stf.PanzerGeneral 0.1 | 6 | 3% | 6 |
| amk.jointstrike.JointStrike 0.2 | 5 | 3% | 6 |
| disan.Chair 2.2.0 | 3 | 2% | 3 |

## Melee bench: F45

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 67.7 | 38 / 210 | 3.90 | 14.2% | 24414 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS0 0.1 | 1.0 | 14.2% | 38 |
| eem.IWillFireNoBullet v2.8 | 2.8 | 12.4% | 98 |
| jje.BagPuss 1.2 | 2.8 | 12.7% | 24 |
| sul.Lunar 1.1 | 3.8 | 11.3% | 24 |
| myl.nano.Graviton 1.10 | 5.5 | 10.5% | 5 |
| hvilela.HVilela 0.9 | 5.5 | 10.0% | 3 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.5% | 5 |
| fm.claire 1.7 | 7.7 | 7.9% | 0 |
| wit.Deep7 2.0 | 8.7 | 7.2% | 13 |
| abud.ThirdRobo 1.0 | 10.0 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.5 | 72.1 | 7 / 35 | 3911 |
| 2 | 1 | 59.0 | 61.9 | 8 / 35 | 3987 |
| 3 | 1 | 63.3 | 76.5 | 7 / 35 | 4300 |
| 4 | 1 | 59.2 | 65.4 | 5 / 35 | 3736 |
| 5 | 1 | 61.5 | 70.2 | 4 / 35 | 4388 |
| 6 | 1 | 58.1 | 60.3 | 7 / 35 | 4092 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 42 | 45% |
| jje.BagPuss 1.2 | 11 | 18% |
| sul.Lunar 1.1 | 9 | 67% |
| myl.nano.Graviton 1.10 | 8 | 75% |
| hvilela.HVilela 0.9 | 4 | 50% |
| pez.mini.ChironexFleckeri 0.5 | 4 | 75% |
| abud.ThirdRobo 1.0 | 1 | 0% |
| wit.Deep7 2.0 | 1 | 0% |

Hadur died in 173 of 210 rounds, at a mean tick of 1078. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 41 | 24% | 54 |
| eem.IWillFireNoBullet v2.8 | 27 | 16% | 0 |
| myl.nano.Graviton 1.10 | 26 | 15% | 43 |
| hvilela.HVilela 0.9 | 25 | 14% | 28 |
| sul.Lunar 1.1 | 21 | 12% | 37 |
| fm.claire 1.7 | 10 | 6% | 14 |
| pez.mini.ChironexFleckeri 0.5 | 9 | 5% | 13 |
| wit.Deep7 2.0 | 7 | 4% | 11 |
| abud.ThirdRobo 1.0 | 6 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F46

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 68.5 | 13 / 210 | 3.84 | 12.4% | 17580 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.3 | 18.0% | 106 |
| kc.mini.Mirage 0.2 | 1.7 | 17.6% | 72 |
| hadur117.nano.SanaroS0 0.1 | 3.0 | 12.4% | 13 |
| cx.Princess 1.0 | 4.3 | 10.9% | 13 |
| mz.MicroSheep 1.0 | 4.7 | 10.6% | 5 |
| sadoner.killer 0.2 | 6.0 | 9.0% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.5% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.1% | 0 |
| kurios.DOSexe .9a | 9.2 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.2 | 64.4 | 0 / 35 | 2941 |
| 2 | 3 | 60.3 | 72.4 | 2 / 35 | 3194 |
| 3 | 3 | 61.4 | 74.3 | 5 / 35 | 3255 |
| 4 | 3 | 57.1 | 65.7 | 2 / 35 | 2523 |
| 5 | 3 | 58.3 | 66.0 | 2 / 35 | 2975 |
| 6 | 3 | 58.4 | 67.9 | 2 / 35 | 2692 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 31 | 10% |
| rsalesc.melee.Medina 0.4.5 | 25 | 20% |
| cx.Princess 1.0 | 6 | 17% |
| mz.MicroSheep 1.0 | 2 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 100% |

Hadur died in 197 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 79 | 40% | 85 |
| rsalesc.melee.Medina 0.4.5 | 57 | 29% | 60 |
| mz.MicroSheep 1.0 | 18 | 9% | 20 |
| cx.Princess 1.0 | 15 | 8% | 16 |
| sadoner.killer 0.2 | 14 | 7% | 14 |
| arthord.NanoSatanMelee Beta | 10 | 5% | 10 |
| jeremyreeder.collective.Prophet 5 | 3 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |

