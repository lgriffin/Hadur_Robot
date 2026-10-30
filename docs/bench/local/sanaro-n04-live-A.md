# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 75.1 | 34 / 350 | 3.24 | 14.3% | 39857 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.7% | 256 |
| hadur117.nano.SanaroA 0.1 | 2.0 | 14.3% | 34 |
| mz.MicroGodMelee 1 | 3.7 | 11.8% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.1% | 12 |
| sgp.JollyNinja 3.53 | 4.6 | 10.9% | 25 |
| lorneswork.Predator 1.0 | 5.4 | 10.0% | 6 |
| adt.Ar2 1.0 | 7.0 | 7.7% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.1 | 5.7% | 1 |
| skm.butterfly 1.0 | 9.1 | 4.8% | 1 |
| mym.EdgeStalker 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 68.9 | 3 / 35 | 4291 |
| 2 | 2 | 61.2 | 75.6 | 1 / 35 | 3491 |
| 3 | 2 | 62.1 | 75.9 | 6 / 35 | 3554 |
| 4 | 2 | 62.2 | 76.2 | 1 / 35 | 3917 |
| 5 | 2 | 62.7 | 71.4 | 4 / 35 | 4494 |
| 6 | 2 | 63.2 | 77.1 | 3 / 35 | 4256 |
| 7 | 2 | 64.4 | 81.9 | 2 / 35 | 4312 |
| 8 | 2 | 60.7 | 70.8 | 5 / 35 | 3560 |
| 9 | 2 | 62.2 | 75.6 | 5 / 35 | 3898 |
| 10 | 2 | 63.2 | 77.5 | 4 / 35 | 4084 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 142 | 4% |
| sgp.JollyNinja 3.53 | 21 | 57% |
| mz.MicroGodMelee 1 | 17 | 41% |
| lorneswork.Predator 1.0 | 6 | 50% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 50% |
| adt.Ar2 1.0 | 4 | 100% |

Hadur died in 317 of 350 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 170 | 54% | 177 |
| sgp.JollyNinja 3.53 | 34 | 11% | 43 |
| mz.MicroGodMelee 1 | 33 | 10% | 41 |
| simonton.nano.WeekendObsession_Melee 1.0 | 30 | 9% | 33 |
| lorneswork.Predator 1.0 | 25 | 8% | 27 |
| adt.Ar2 1.0 | 15 | 5% | 19 |
| kawigi.sbf.FloodSonnet 0.9 | 6 | 2% | 6 |
| skm.butterfly 1.0 | 2 | 1% | 2 |
| mym.EdgeStalker 1.0 | 1 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 66.4 | 49 / 350 | 4.02 | 13.7% | 41145 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.3 | 15.3% | 112 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.1 | 14.2% | 79 |
| hadur117.nano.SanaroA 0.1 | 2.6 | 13.7% | 49 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.2% | 8 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.3 | 10.0% | 29 |
| sch.Simone 0.3d | 6.8 | 8.3% | 26 |
| Noran.BitchingElk 0.054 | 7.0 | 8.1% | 32 |
| fnc.bandit.Bandit 5.2.0 | 7.4 | 7.9% | 3 |
| stelo.PatternRobot 1.0 | 8.6 | 6.9% | 8 |
| fullsail.SweetTea 1.1 | 9.9 | 4.5% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 74.3 | 6 / 35 | 4119 |
| 2 | 1 | 59.3 | 65.7 | 7 / 35 | 3893 |
| 3 | 3 | 61.4 | 70.5 | 4 / 35 | 4312 |
| 4 | 3 | 60.6 | 67.9 | 5 / 35 | 4090 |
| 5 | 3 | 58.8 | 60.6 | 5 / 35 | 4278 |
| 6 | 3 | 57.0 | 59.4 | 2 / 35 | 3949 |
| 7 | 3 | 61.5 | 68.6 | 7 / 35 | 4247 |
| 8 | 2 | 60.2 | 67.6 | 5 / 35 | 4103 |
| 9 | 3 | 58.9 | 64.4 | 5 / 35 | 3693 |
| 10 | 3 | 60.0 | 65.4 | 3 / 35 | 4461 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 48 | 33% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 41 | 29% |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 53% |
| sch.Simone 0.3d | 13 | 23% |
| Noran.BitchingElk 0.054 | 11 | 0% |
| stelo.PatternRobot 1.0 | 6 | 67% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 67% |
| fnc.bandit.Bandit 5.2.0 | 4 | 50% |
| fullsail.SweetTea 1.1 | 3 | 0% |

Hadur died in 301 of 350 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 73 | 24% | 84 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 72 | 24% | 88 |
| lrem.micro.SpikeSoldier 0.4 | 41 | 14% | 45 |
| com.cohesiva.robocode.ManOwaR 1.0 | 24 | 8% | 34 |
| sch.Simone 0.3d | 24 | 8% | 25 |
| stelo.PatternRobot 1.0 | 20 | 7% | 24 |
| fnc.bandit.Bandit 5.2.0 | 18 | 6% | 20 |
| Noran.BitchingElk 0.054 | 18 | 6% | 17 |
| fullsail.SweetTea 1.1 | 11 | 4% | 13 |

## Melee bench: F03

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 76.0 | 51 / 350 | 3.16 | 14.5% | 41171 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.4 | 15.7% | 117 |
| kawigi.nano.Lib 1.0 | 2.4 | 14.6% | 91 |
| hadur117.nano.SanaroA 0.1 | 2.6 | 14.5% | 51 |
| vuen.Cake 2.51 | 3.6 | 13.2% | 71 |
| urdos.URDOS 1.3 | 5.0 | 10.5% | 12 |
| adt.Ar1 2.1 | 6.1 | 7.6% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.8% | 3 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.7% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 5.7% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.2 | 72.7 | 5 / 35 | 4215 |
| 2 | 2 | 64.4 | 81.0 | 9 / 35 | 4430 |
| 3 | 1 | 63.8 | 82.5 | 7 / 35 | 4232 |
| 4 | 2 | 63.3 | 81.6 | 4 / 35 | 4184 |
| 5 | 2 | 63.8 | 80.3 | 6 / 35 | 4432 |
| 6 | 3 | 59.4 | 67.9 | 3 / 35 | 4258 |
| 7 | 3 | 58.7 | 68.9 | 2 / 35 | 3519 |
| 8 | 3 | 61.3 | 74.0 | 6 / 35 | 3769 |
| 9 | 3 | 62.3 | 77.8 | 4 / 35 | 4042 |
| 10 | 3 | 61.0 | 73.0 | 5 / 35 | 4090 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 63 | 32% |
| vuen.Cake 2.51 | 50 | 40% |
| kawigi.nano.Lib 1.0 | 45 | 2% |
| urdos.URDOS 1.3 | 14 | 64% |
| oa.weak.FlyMk1 0.1 | 2 | 0% |
| adt.Ar1 2.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 0% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 0% |

Hadur died in 302 of 350 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 94 | 31% | 97 |
| radnor.DoctorBob 1.42 | 82 | 27% | 94 |
| vuen.Cake 2.51 | 54 | 18% | 74 |
| urdos.URDOS 1.3 | 43 | 14% | 49 |
| ghent.ArthurPanzergon 1.0.0 | 10 | 3% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 3% | 9 |
| oa.weak.FlyMk1 0.1 | 4 | 1% | 6 |
| adt.Ar1 2.1 | 3 | 1% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 1% | 4 |

## Melee bench: F04

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 69.8 | 6 / 350 | 3.72 | 13.6% | 43326 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.0% | 327 |
| apc.LeeroyJenkins2 1.0 | 2.5 | 13.6% | 10 |
| hadur117.nano.SanaroA 0.1 | 2.5 | 13.6% | 6 |
| TNT.TNT 0.99.1 | 4.0 | 11.1% | 3 |
| josago.Jorgito 0.16 | 5.1 | 9.2% | 1 |
| css.Delitioner 0.11 | 6.3 | 7.6% | 2 |
| tj.zombie1n 1.0.1 | 6.6 | 7.5% | 0 |
| rampancy.Durandal 2.1d | 8.3 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 8.8 | 4.3% | 1 |
| spin.Bugstard 0.012b | 9.9 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.8 | 69.5 | 0 / 35 | 4371 |
| 2 | 2 | 63.6 | 73.7 | 1 / 35 | 4639 |
| 3 | 3 | 60.7 | 66.0 | 0 / 35 | 4162 |
| 4 | 2 | 64.2 | 76.2 | 0 / 35 | 4857 |
| 5 | 2 | 61.8 | 70.2 | 1 / 35 | 4010 |
| 6 | 3 | 62.5 | 72.4 | 1 / 35 | 4160 |
| 7 | 2 | 61.9 | 69.8 | 0 / 35 | 4380 |
| 8 | 3 | 59.7 | 65.1 | 1 / 35 | 4009 |
| 9 | 2 | 61.5 | 67.9 | 2 / 35 | 4560 |
| 10 | 3 | 60.9 | 67.3 | 0 / 35 | 4178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 117 | 3% |
| apc.LeeroyJenkins2 1.0 | 3 | 33% |
| josago.Jorgito 0.16 | 2 | 50% |
| TNT.TNT 0.99.1 | 2 | 50% |
| sp.Nanos.Ember 1.1 | 1 | 0% |

Hadur died in 344 of 350 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 208 | 60% | 212 |
| apc.LeeroyJenkins2 1.0 | 52 | 15% | 53 |
| josago.Jorgito 0.16 | 36 | 10% | 37 |
| TNT.TNT 0.99.1 | 17 | 5% | 18 |
| css.Delitioner 0.11 | 13 | 4% | 13 |
| rampancy.Durandal 2.1d | 9 | 3% | 8 |
| tj.zombie1n 1.0.1 | 7 | 2% | 7 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 66.7 | 48 / 350 | 4.00 | 13.1% | 35055 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.1 | 15.4% | 98 |
| origin.SleepSiphon 1.7b | 2.0 | 14.7% | 121 |
| hadur117.nano.SanaroA 0.1 | 3.4 | 13.1% | 48 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.5% | 52 |
| mld.Wisdom 1.0 | 4.7 | 11.1% | 8 |
| gg.Wolverine 2.0 | 6.6 | 8.6% | 10 |
| spinnercat.Omen 1.0 | 6.8 | 8.0% | 4 |
| DBall.NUKE 0.1 | 8.2 | 6.7% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 8.4 | 6.6% | 7 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.9 | 66.7 | 5 / 35 | 3264 |
| 2 | 3 | 61.8 | 69.5 | 7 / 35 | 4064 |
| 3 | 4 | 56.0 | 60.3 | 2 / 35 | 3175 |
| 4 | 5 | 56.0 | 58.7 | 3 / 35 | 3331 |
| 5 | 3 | 58.9 | 65.4 | 5 / 35 | 3521 |
| 6 | 4 | 60.5 | 70.8 | 4 / 35 | 3523 |
| 7 | 4 | 57.2 | 61.3 | 6 / 35 | 3184 |
| 8 | 2 | 62.5 | 76.2 | 8 / 35 | 3817 |
| 9 | 3 | 57.6 | 62.2 | 2 / 35 | 3481 |
| 10 | 3 | 62.3 | 75.6 | 6 / 35 | 3695 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 44 | 43% |
| origin.SleepSiphon 1.7b | 35 | 11% |
| pe.minimelee.SandboxMiniMelee 1.1 | 25 | 52% |
| mld.Wisdom 1.0 | 7 | 71% |
| gg.Wolverine 2.0 | 6 | 50% |
| spinnercat.Omen 1.0 | 3 | 67% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 302 of 350 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 95 | 31% | 103 |
| origin.SleepSiphon 1.7b | 87 | 29% | 96 |
| pe.minimelee.SandboxMiniMelee 1.1 | 50 | 17% | 65 |
| mld.Wisdom 1.0 | 32 | 11% | 37 |
| gg.Wolverine 2.0 | 14 | 5% | 19 |
| spinnercat.Omen 1.0 | 11 | 4% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 2% | 9 |
| DBall.NUKE 0.1 | 6 | 2% | 8 |

## Melee bench: F07

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 79.6 | 47 / 350 | 2.84 | 16.0% | 49409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.4 | 17.8% | 114 |
| rsalesc.melee.Monk 0.3.6c | 1.9 | 17.3% | 95 |
| hadur117.nano.SanaroA 0.1 | 2.7 | 16.0% | 47 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 12.1% | 40 |
| franzor.Lizt 1.3.1 | 4.7 | 11.6% | 55 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 1 |
| sample.Target 1.0 | 9.1 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 9.9 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.0 | 76.2 | 3 / 35 | 4871 |
| 2 | 3 | 66.9 | 81.9 | 5 / 35 | 4938 |
| 3 | 3 | 65.1 | 76.8 | 1 / 35 | 5023 |
| 4 | 2 | 67.2 | 83.5 | 6 / 35 | 5055 |
| 5 | 3 | 65.5 | 76.8 | 7 / 35 | 4539 |
| 6 | 2 | 66.7 | 80.3 | 6 / 35 | 4840 |
| 7 | 3 | 64.5 | 75.2 | 5 / 35 | 4473 |
| 8 | 3 | 67.4 | 81.6 | 5 / 35 | 5433 |
| 9 | 2 | 68.3 | 85.1 | 7 / 35 | 5387 |
| 10 | 3 | 65.7 | 78.4 | 2 / 35 | 4850 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 99 | 40% |
| rsalesc.melee.Monk 0.3.6c | 33 | 3% |
| oog.melee.CapuletDroid 1.1 | 28 | 18% |
| franzor.Lizt 1.3.1 | 12 | 8% |
| skm.PateranBotlock2 1.0 | 1 | 0% |

Hadur died in 303 of 350 rounds, at a mean tick of 1162. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 143 | 47% | 196 |
| rsalesc.melee.Monk 0.3.6c | 80 | 26% | 85 |
| oog.melee.CapuletDroid 1.1 | 49 | 16% | 50 |
| franzor.Lizt 1.3.1 | 19 | 6% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6 | 2% | 7 |
| exauge.GateKeeper 1.1.121g | 5 | 2% | 6 |
| skm.PateranBotlock2 1.0 | 1 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 69.8 | 61 / 350 | 3.72 | 13.6% | 34358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| shrub.Vapour v159 | 1.9 | 14.3% | 99 |
| hadur117.nano.SanaroA 0.1 | 1.9 | 13.6% | 61 |
| tm.Yuugao 1.0 | 2.2 | 13.8% | 103 |
| Krabb.sliNk.Garm 0.9u | 4.9 | 10.3% | 16 |
| com.spp.robocode.MostlyHarmless 010 | 5.1 | 10.0% | 38 |
| m3thos.Eva00 1.1 | 5.7 | 9.4% | 10 |
| jwst.DAD.DarkAndDarker 1.1 | 6.6 | 8.4% | 16 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 7.0% | 1 |
| SHAM.WOW 1.4 | 8.8 | 6.7% | 4 |
| qualidafial.MajorDick 1.0.1 | 9.1 | 6.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.6 | 68.6 | 5 / 35 | 3672 |
| 2 | 1 | 60.1 | 75.2 | 7 / 35 | 3115 |
| 3 | 3 | 55.5 | 61.0 | 3 / 35 | 3089 |
| 4 | 2 | 56.6 | 62.5 | 4 / 35 | 3326 |
| 5 | 1 | 63.0 | 80.0 | 8 / 35 | 3752 |
| 6 | 1 | 61.4 | 74.3 | 9 / 35 | 3524 |
| 7 | 3 | 56.4 | 60.6 | 6 / 35 | 3397 |
| 8 | 1 | 61.2 | 77.1 | 4 / 35 | 3404 |
| 9 | 3 | 59.9 | 70.5 | 6 / 35 | 3365 |
| 10 | 2 | 60.0 | 68.3 | 9 / 35 | 3714 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 51 | 20% |
| shrub.Vapour v159 | 28 | 25% |
| com.spp.robocode.MostlyHarmless 010 | 23 | 43% |
| Krabb.sliNk.Garm 0.9u | 23 | 78% |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 71% |
| m3thos.Eva00 1.1 | 6 | 33% |
| zyx.nano.BacillusComma 1.0 | 5 | 80% |
| SHAM.WOW 1.4 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 50% |

Hadur died in 290 of 350 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 79 | 27% | 88 |
| tm.Yuugao 1.0 | 70 | 24% | 83 |
| com.spp.robocode.MostlyHarmless 010 | 33 | 11% | 40 |
| Krabb.sliNk.Garm 0.9u | 27 | 9% | 39 |
| m3thos.Eva00 1.1 | 27 | 9% | 33 |
| jwst.DAD.DarkAndDarker 1.1 | 22 | 8% | 26 |
| zyx.nano.BacillusComma 1.0 | 20 | 7% | 24 |
| qualidafial.MajorDick 1.0.1 | 9 | 3% | 9 |
| SHAM.WOW 1.4 | 3 | 1% | 7 |

## Melee bench: F09

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 63.8 | 32 / 350 | 4.25 | 12.5% | 32653 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 17.8% | 199 |
| kc.micro.Figment 1.0 | 1.9 | 15.0% | 61 |
| hadur117.nano.SanaroA 0.1 | 3.3 | 12.5% | 32 |
| yagami.Tidus 0.11 | 4.1 | 11.5% | 4 |
| pedersen.Grishnakh 1.0 | 4.9 | 10.6% | 33 |
| mc2.enemy.Original 0.9 | 5.8 | 9.4% | 16 |
| dft.Calliope 5.6 | 6.9 | 8.0% | 5 |
| step.nanoPri 1.0 | 8.1 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 5.0% | 0 |
| rdm.Dueler 0.4x | 9.6 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.3 | 70.2 | 3 / 35 | 3116 |
| 2 | 4 | 56.7 | 58.7 | 6 / 35 | 3204 |
| 3 | 3 | 58.6 | 64.8 | 4 / 35 | 3300 |
| 4 | 3 | 59.8 | 67.0 | 3 / 35 | 3469 |
| 5 | 4 | 56.9 | 59.4 | 3 / 35 | 3286 |
| 6 | 4 | 55.6 | 59.0 | 1 / 35 | 3108 |
| 7 | 3 | 58.4 | 64.1 | 2 / 35 | 3439 |
| 8 | 3 | 61.0 | 69.5 | 5 / 35 | 3449 |
| 9 | 3 | 57.2 | 62.9 | 2 / 35 | 2934 |
| 10 | 3 | 58.3 | 62.9 | 3 / 35 | 3348 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 50 | 6% |
| kc.micro.Figment 1.0 | 27 | 56% |
| yagami.Tidus 0.11 | 9 | 100% |
| pedersen.Grishnakh 1.0 | 7 | 0% |
| mc2.enemy.Original 0.9 | 6 | 33% |
| dft.Calliope 5.6 | 5 | 60% |

Hadur died in 318 of 350 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 100 | 31% | 101 |
| kc.micro.Figment 1.0 | 70 | 22% | 86 |
| yagami.Tidus 0.11 | 49 | 15% | 58 |
| pedersen.Grishnakh 1.0 | 29 | 9% | 30 |
| mc2.enemy.Original 0.9 | 28 | 9% | 30 |
| dft.Calliope 5.6 | 14 | 4% | 16 |
| robar.nano.Assertive_Melee 0.2 | 13 | 4% | 13 |
| step.nanoPri 1.0 | 8 | 3% | 8 |
| rdm.Dueler 0.4x | 7 | 2% | 7 |

## Melee bench: F10

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 77.9 | 81 / 350 | 2.99 | 15.3% | 42496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| DTF.Kludgy 1.2b | 1.5 | 15.5% | 97 |
| hadur117.nano.SanaroA 0.1 | 1.8 | 15.3% | 81 |
| ne.Chimera 1.2 | 3.0 | 13.4% | 49 |
| ejb.Polaris 1.0.1 | 3.7 | 12.8% | 48 |
| vStar.RAFzilla 2.15 | 5.3 | 10.5% | 22 |
| tvv.micro.Antares 1.1.1 | 5.7 | 10.4% | 40 |
| sam.Samspin 1.0 | 7.6 | 6.4% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.9% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.6% | 5 |
| donjezza.Muncho 1.0 | 9.9 | 4.2% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 78.1 | 7 / 35 | 4619 |
| 2 | 2 | 65.3 | 83.2 | 12 / 35 | 4536 |
| 3 | 2 | 64.4 | 81.3 | 5 / 35 | 4509 |
| 4 | 1 | 61.6 | 73.7 | 8 / 35 | 4036 |
| 5 | 2 | 64.0 | 81.6 | 10 / 35 | 3695 |
| 6 | 2 | 64.1 | 78.7 | 10 / 35 | 4279 |
| 7 | 2 | 64.5 | 81.6 | 8 / 35 | 4487 |
| 8 | 2 | 61.7 | 71.7 | 9 / 35 | 4069 |
| 9 | 2 | 62.0 | 73.3 | 5 / 35 | 4289 |
| 10 | 2 | 62.2 | 75.6 | 7 / 35 | 3977 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 67 | 24% |
| ejb.Polaris 1.0.1 | 59 | 64% |
| ne.Chimera 1.2 | 23 | 35% |
| tvv.micro.Antares 1.1.1 | 23 | 13% |
| vStar.RAFzilla 2.15 | 14 | 71% |
| kurios.DOSexe .9b | 3 | 100% |
| donjezza.Muncho 1.0 | 3 | 0% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sam.Samspin 1.0 | 2 | 50% |

Hadur died in 269 of 350 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 95 | 35% | 110 |
| ne.Chimera 1.2 | 65 | 24% | 74 |
| ejb.Polaris 1.0.1 | 38 | 14% | 75 |
| tvv.micro.Antares 1.1.1 | 28 | 10% | 29 |
| sam.Samspin 1.0 | 15 | 6% | 16 |
| vStar.RAFzilla 2.15 | 12 | 4% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 3% | 9 |
| donjezza.Muncho 1.0 | 5 | 2% | 8 |
| kurios.DOSexe .9b | 3 | 1% | 8 |

## Melee bench: F11

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.4 | 61.2 | 15 / 350 | 4.49 | 11.9% | 32753 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.3% | 162 |
| cx.mini.Nimrod 0.55 | 2.0 | 13.3% | 59 |
| hadur117.nano.SanaroA 0.1 | 3.1 | 11.9% | 15 |
| djc.DynaBot 0.1.1 | 4.0 | 11.3% | 34 |
| br2.MobyDickBot 1.6 | 5.6 | 9.8% | 30 |
| rdt199.Warlord 0.73 | 5.8 | 9.6% | 30 |
| uji.YellohFellah 1.0 | 6.6 | 8.8% | 23 |
| KiraNL.Chupacabra 0.4 | 7.9 | 7.5% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.7% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.5 | 59.4 | 0 / 35 | 3431 |
| 2 | 3 | 56.7 | 61.9 | 2 / 35 | 3289 |
| 3 | 3 | 56.9 | 63.8 | 2 / 35 | 3053 |
| 4 | 3 | 55.3 | 58.7 | 0 / 35 | 3240 |
| 5 | 3 | 57.0 | 63.5 | 2 / 35 | 3058 |
| 6 | 3 | 57.6 | 60.6 | 3 / 35 | 3761 |
| 7 | 3 | 55.3 | 60.6 | 2 / 35 | 2964 |
| 8 | 3 | 57.8 | 64.4 | 2 / 35 | 3383 |
| 9 | 4 | 56.9 | 62.9 | 0 / 35 | 3417 |
| 10 | 3 | 54.6 | 56.2 | 2 / 35 | 3157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 40 | 3% |
| cx.mini.Nimrod 0.55 | 12 | 8% |
| uji.YellohFellah 1.0 | 11 | 36% |
| br2.MobyDickBot 1.6 | 10 | 20% |
| rdt199.Warlord 0.73 | 8 | 38% |
| djc.DynaBot 0.1.1 | 7 | 57% |

Hadur died in 336 of 350 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 125 | 37% | 128 |
| cx.mini.Nimrod 0.55 | 69 | 21% | 69 |
| rdt199.Warlord 0.73 | 37 | 11% | 42 |
| br2.MobyDickBot 1.6 | 25 | 7% | 25 |
| djc.DynaBot 0.1.1 | 24 | 7% | 26 |
| uji.YellohFellah 1.0 | 20 | 6% | 25 |
| KiraNL.Chupacabra 0.4 | 16 | 5% | 16 |
| stelo.MirrorNano 1.3 | 11 | 3% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 66.6 | 53 / 350 | 4.00 | 12.8% | 30015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.7 | 14.3% | 105 |
| bts.wiki.RipCurl 0.9b | 2.2 | 13.9% | 67 |
| darkcanuck.Leon 1.01 | 2.8 | 13.3% | 70 |
| hadur117.nano.SanaroA 0.1 | 3.3 | 12.8% | 53 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.4% | 27 |
| jrm.Test0 1.0 | 6.5 | 8.6% | 4 |
| jp.Perpy 16.0 | 7.0 | 7.8% | 7 |
| cs.sheldor.Talon 1.1 | 7.8 | 7.3% | 1 |
| jaybot.bots.Oddball 4.0 | 9.0 | 6.0% | 15 |
| stuff.Vlad 0.1 | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.9 | 64.8 | 7 / 35 | 3330 |
| 2 | 2 | 60.6 | 70.2 | 10 / 35 | 3384 |
| 3 | 2 | 59.6 | 71.1 | 5 / 35 | 3213 |
| 4 | 4 | 56.8 | 65.1 | 3 / 35 | 2717 |
| 5 | 3 | 59.3 | 67.9 | 5 / 35 | 3322 |
| 6 | 3 | 57.2 | 64.8 | 5 / 35 | 2908 |
| 7 | 4 | 58.8 | 67.0 | 7 / 35 | 3109 |
| 8 | 4 | 56.2 | 64.4 | 5 / 35 | 2495 |
| 9 | 4 | 57.6 | 66.3 | 3 / 35 | 2772 |
| 10 | 4 | 56.8 | 64.8 | 3 / 35 | 2765 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 52 | 12% |
| bts.wiki.RipCurl 0.9b | 33 | 58% |
| darkcanuck.Leon 1.01 | 31 | 29% |
| brainfade.melee.Genghis 0.36 | 18 | 61% |
| jrm.Test0 1.0 | 6 | 67% |
| jp.Perpy 16.0 | 5 | 80% |
| jaybot.bots.Oddball 4.0 | 3 | 0% |
| stuff.Vlad 0.1 | 1 | 0% |

Hadur died in 297 of 350 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 80 | 27% | 89 |
| bts.wiki.RipCurl 0.9b | 61 | 21% | 77 |
| darkcanuck.Leon 1.01 | 48 | 16% | 62 |
| brainfade.melee.Genghis 0.36 | 31 | 10% | 38 |
| jrm.Test0 1.0 | 30 | 10% | 31 |
| jp.Perpy 16.0 | 14 | 5% | 16 |
| jaybot.bots.Oddball 4.0 | 14 | 5% | 14 |
| cs.sheldor.Talon 1.1 | 13 | 4% | 16 |
| stuff.Vlad 0.1 | 6 | 2% | 6 |

## Melee bench: F13

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 71.0 | 25 / 350 | 3.61 | 13.1% | 34168 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.3% | 168 |
| ags.Glacier 0.2.11 | 1.6 | 16.9% | 85 |
| hadur117.nano.SanaroA 0.1 | 3.4 | 13.1% | 25 |
| shinh.Entangled 0.3 | 3.7 | 12.7% | 52 |
| gh.micro.Gruweltje 0.7 | 4.9 | 11.6% | 18 |
| apc.Colossus2 0.17 | 6.0 | 8.1% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.9% | 2 |
| ayk.WallHugger 1.0 | 8.1 | 5.4% | 0 |
| maribo.FollowFire 1 | 9.1 | 4.4% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 72.1 | 3 / 35 | 3078 |
| 2 | 3 | 62.1 | 74.6 | 4 / 35 | 3801 |
| 3 | 4 | 58.3 | 65.4 | 2 / 35 | 3260 |
| 4 | 4 | 61.3 | 72.7 | 5 / 35 | 3546 |
| 5 | 3 | 59.2 | 67.0 | 2 / 35 | 3428 |
| 6 | 4 | 59.7 | 68.3 | 1 / 35 | 3682 |
| 7 | 3 | 60.3 | 70.2 | 6 / 35 | 3267 |
| 8 | 4 | 59.0 | 71.7 | 0 / 35 | 2992 |
| 9 | 3 | 60.2 | 72.1 | 2 / 35 | 3359 |
| 10 | 3 | 61.6 | 75.6 | 0 / 35 | 3755 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 60 | 13% |
| ags.Glacier 0.2.11 | 52 | 21% |
| shinh.Entangled 0.3 | 17 | 24% |
| gh.micro.Gruweltje 0.7 | 6 | 33% |

Hadur died in 325 of 350 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 116 | 36% | 129 |
| mn.Combat 3.25.0 | 106 | 33% | 112 |
| shinh.Entangled 0.3 | 40 | 12% | 44 |
| gh.micro.Gruweltje 0.7 | 34 | 10% | 35 |
| stelo.Wang 1.0 | 13 | 4% | 14 |
| apc.Colossus2 0.17 | 8 | 2% | 8 |
| maribo.FollowFire 1 | 4 | 1% | 4 |
| ayk.WallHugger 1.0 | 3 | 1% | 3 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 74.0 | 46 / 350 | 3.34 | 14.0% | 36602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 18.0% | 177 |
| hadur117.nano.SanaroA 0.1 | 2.1 | 14.0% | 46 |
| catcat20.shape.Theta 0.018 | 2.9 | 12.7% | 67 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 10.2% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 10.0% | 16 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 9.7% | 13 |
| Lo_Ian.Gandalf_V4 4.0 | 6.0 | 9.8% | 17 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.9 | 8.1% | 12 |
| pa.Improved 1.0 | 9.0 | 5.5% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 77.8 | 5 / 35 | 3599 |
| 2 | 2 | 62.6 | 76.2 | 5 / 35 | 3821 |
| 3 | 2 | 60.7 | 71.7 | 3 / 35 | 3702 |
| 4 | 2 | 60.7 | 70.2 | 7 / 35 | 3798 |
| 5 | 2 | 60.7 | 73.0 | 5 / 35 | 3546 |
| 6 | 3 | 62.6 | 76.8 | 2 / 35 | 3660 |
| 7 | 2 | 60.4 | 71.7 | 5 / 35 | 3515 |
| 8 | 2 | 63.9 | 80.3 | 7 / 35 | 4048 |
| 9 | 2 | 61.5 | 74.6 | 4 / 35 | 3364 |
| 10 | 2 | 59.2 | 67.6 | 3 / 35 | 3549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 91 | 13% |
| catcat20.shape.Theta 0.018 | 40 | 28% |
| sanyi.mikrobi.Roberto 1.0 | 13 | 62% |
| co.edu.usb.rc.LidisTron 1.0 | 12 | 33% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 83% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 25% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 306 of 350 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 142 | 46% | 151 |
| catcat20.shape.Theta 0.018 | 54 | 18% | 61 |
| co.edu.usb.rc.LidisTron 1.0 | 25 | 8% | 19 |
| Lo_Ian.Gandalf_V4 4.0 | 22 | 7% | 25 |
| sanyi.mikrobi.Roberto 1.0 | 19 | 6% | 29 |
| dmh.robocode.robot.RedDwarf 0.4 | 19 | 6% | 26 |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 6% | 25 |
| pa.Improved 1.0 | 6 | 2% | 11 |
| sample.TrackFire 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 64.5 | 22 / 350 | 4.19 | 12.9% | 38420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.4 | 14.9% | 84 |
| emp.Yngwie 1.11 | 2.1 | 14.0% | 116 |
| hadur117.nano.SanaroA 0.1 | 3.2 | 12.9% | 22 |
| mld.DustBunny 3.8 | 3.4 | 12.9% | 31 |
| cb.nano.Insomnia 1.0 | 4.9 | 11.4% | 32 |
| kawigi.robot.Girl 1.2 | 6.0 | 10.4% | 60 |
| lambdaxy.TBot 0.1 | 7.6 | 6.7% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.8% | 1 |
| divineomega.TrialBot 0.003 | 8.7 | 5.7% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.2 | 66.0 | 3 / 35 | 3752 |
| 2 | 3 | 60.2 | 67.9 | 3 / 35 | 3949 |
| 3 | 4 | 58.0 | 61.3 | 1 / 35 | 4070 |
| 4 | 3 | 61.1 | 67.6 | 2 / 35 | 4569 |
| 5 | 3 | 59.3 | 68.6 | 2 / 35 | 3749 |
| 6 | 4 | 55.6 | 59.0 | 1 / 35 | 3351 |
| 7 | 1 | 61.2 | 68.9 | 6 / 35 | 4296 |
| 8 | 5 | 56.0 | 60.3 | 2 / 35 | 3422 |
| 9 | 3 | 56.4 | 62.2 | 2 / 35 | 3157 |
| 10 | 4 | 59.2 | 63.5 | 0 / 35 | 4105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 27 | 37% |
| kawigi.micro.Shiz 1.1 | 27 | 15% |
| kawigi.robot.Girl 1.2 | 14 | 29% |
| cb.nano.Insomnia 1.0 | 14 | 7% |
| mld.DustBunny 3.8 | 10 | 10% |
| divineomega.TrialBot 0.003 | 3 | 67% |

Hadur died in 329 of 350 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 80 | 24% | 92 |
| kawigi.micro.Shiz 1.1 | 71 | 22% | 71 |
| mld.DustBunny 3.8 | 58 | 18% | 68 |
| cb.nano.Insomnia 1.0 | 42 | 13% | 32 |
| kawigi.robot.Girl 1.2 | 34 | 10% | 37 |
| Grystrion.TrackerWO 1.0 | 17 | 5% | 19 |
| divineomega.TrialBot 0.003 | 16 | 5% | 19 |
| lambdaxy.TBot 0.1 | 10 | 3% | 11 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 0% | 1 |

## Melee bench: F16

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 67.4 | 34 / 350 | 3.93 | 13.7% | 41468 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.4% | 187 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.2 | 14.8% | 17 |
| hadur117.nano.SanaroA 0.1 | 2.8 | 13.7% | 34 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.6% | 58 |
| tvv.nano.Polaris 1.2 | 5.1 | 9.6% | 36 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 9.1% | 3 |
| stelo.IntrinsicVolatility 1.4 | 7.1 | 7.7% | 4 |
| repositorio.NanoStep 1.0 | 8.8 | 5.5% | 4 |
| divineomega.DivineBot 1.9.4.5 | 8.9 | 5.3% | 7 |
| asd.Cthulhu 1.3 | 9.1 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 72.1 | 4 / 35 | 4350 |
| 2 | 3 | 59.2 | 63.2 | 4 / 35 | 3858 |
| 3 | 2 | 62.6 | 71.1 | 7 / 35 | 4448 |
| 4 | 3 | 59.4 | 65.7 | 3 / 35 | 3709 |
| 5 | 3 | 59.2 | 62.2 | 3 / 35 | 4282 |
| 6 | 3 | 62.2 | 70.8 | 3 / 35 | 4403 |
| 7 | 3 | 61.5 | 68.6 | 2 / 35 | 4471 |
| 8 | 3 | 60.1 | 66.0 | 3 / 35 | 3966 |
| 9 | 3 | 58.4 | 62.2 | 2 / 35 | 3520 |
| 10 | 3 | 62.7 | 72.1 | 3 / 35 | 4461 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 78 | 9% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 88% |
| tvv.nano.Polaris 1.2 | 10 | 0% |
| techdude.forest.FlamingForest 1.1 | 7 | 14% |
| stelo.IntrinsicVolatility 1.4 | 6 | 100% |
| divineomega.DivineBot 1.9.4.5 | 3 | 67% |
| bvh.fnr.Fenrir 0.36l | 3 | 100% |

Hadur died in 316 of 350 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 138 | 44% | 147 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 61 | 19% | 72 |
| tvv.nano.Polaris 1.2 | 29 | 9% | 30 |
| bvh.fnr.Fenrir 0.36l | 29 | 9% | 30 |
| techdude.forest.FlamingForest 1.1 | 26 | 8% | 29 |
| stelo.IntrinsicVolatility 1.4 | 15 | 5% | 22 |
| divineomega.DivineBot 1.9.4.5 | 8 | 3% | 10 |
| asd.Cthulhu 1.3 | 6 | 2% | 6 |
| repositorio.NanoStep 1.0 | 4 | 1% | 4 |

## Melee bench: F17

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 64.9 | 29 / 350 | 4.16 | 12.8% | 36790 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 2.0 | 13.8% | 81 |
| oog.melee.Mercutio 1.0 | 2.4 | 13.8% | 88 |
| cx.BlestPain 1.41 | 2.7 | 13.4% | 87 |
| hadur117.nano.SanaroA 0.1 | 3.5 | 12.8% | 29 |
| nic.Nicator 2.4 | 5.0 | 11.7% | 26 |
| ahf.NanoAndrew .4 | 5.4 | 11.1% | 34 |
| maribo.melee.BMV 0.1 | 7.0 | 8.9% | 4 |
| tex.Longbot 0.4 | 8.4 | 5.8% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.6 | 5.8% | 2 |
| goblin.Bender 2.4 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.1 | 61.6 | 2 / 35 | 3449 |
| 2 | 3 | 58.9 | 65.7 | 2 / 35 | 3723 |
| 3 | 4 | 59.1 | 66.7 | 2 / 35 | 3650 |
| 4 | 5 | 57.2 | 60.6 | 1 / 35 | 3572 |
| 5 | 4 | 58.9 | 64.4 | 2 / 35 | 3767 |
| 6 | 4 | 59.0 | 65.4 | 3 / 35 | 3745 |
| 7 | 1 | 61.7 | 70.2 | 7 / 35 | 3994 |
| 8 | 4 | 58.7 | 66.0 | 5 / 35 | 3526 |
| 9 | 3 | 57.7 | 62.5 | 2 / 35 | 3589 |
| 10 | 3 | 59.6 | 66.0 | 3 / 35 | 3775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 33 | 12% |
| oog.melee.Mercutio 1.0 | 31 | 26% |
| cx.BlestPain 1.41 | 21 | 14% |
| nic.Nicator 2.4 | 13 | 62% |
| ahf.NanoAndrew .4 | 11 | 27% |
| maribo.melee.BMV 0.1 | 2 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 322 of 350 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 67 | 21% | 73 |
| cx.BlestPain 1.41 | 67 | 21% | 70 |
| ahf.NanoAndrew .4 | 56 | 17% | 56 |
| oog.melee.Mercutio 1.0 | 54 | 17% | 63 |
| nic.Nicator 2.4 | 42 | 13% | 50 |
| maribo.melee.BMV 0.1 | 19 | 6% | 21 |
| tex.Longbot 0.4 | 8 | 2% | 8 |
| edu.otg.spr.TheTeacher 1.2 | 7 | 2% | 8 |
| goblin.Bender 2.4 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 65.9 | 52 / 350 | 4.07 | 13.1% | 34886 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.3 | 14.8% | 86 |
| agd.Mooserwirt2 2.7 | 2.4 | 13.3% | 88 |
| hadur117.nano.SanaroA 0.1 | 2.8 | 13.1% | 52 |
| uji.DBH 1.1 | 4.1 | 11.2% | 38 |
| ratosh.Nobo 0.21 | 5.1 | 10.5% | 13 |
| spinnercat.Robovirus 2.718 | 5.5 | 10.8% | 34 |
| sigterm.Sigterm 1.0 | 6.9 | 8.7% | 26 |
| kawigi.mini.Fhqwhgads 1.1 | 8.2 | 6.8% | 5 |
| stelo.WangRobot 1.0 | 8.9 | 5.9% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.0 | 63.8 | 5 / 35 | 3422 |
| 2 | 3 | 59.3 | 67.3 | 7 / 35 | 3390 |
| 3 | 4 | 55.0 | 57.8 | 3 / 35 | 3076 |
| 4 | 1 | 61.4 | 73.0 | 8 / 35 | 3773 |
| 5 | 2 | 59.4 | 68.9 | 6 / 35 | 3410 |
| 6 | 2 | 60.1 | 67.6 | 6 / 35 | 3927 |
| 7 | 3 | 58.0 | 65.1 | 4 / 35 | 3260 |
| 8 | 3 | 59.6 | 67.6 | 6 / 35 | 3484 |
| 9 | 3 | 58.8 | 63.8 | 4 / 35 | 3790 |
| 10 | 4 | 57.9 | 64.4 | 3 / 35 | 3354 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 34 | 56% |
| agd.Mooserwirt2 2.7 | 30 | 23% |
| spinnercat.Robovirus 2.718 | 25 | 32% |
| uji.DBH 1.1 | 15 | 47% |
| sigterm.Sigterm 1.0 | 11 | 27% |
| stelo.WangRobot 1.0 | 6 | 33% |
| ratosh.Nobo 0.21 | 6 | 50% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 75% |

Hadur died in 299 of 350 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 89 | 30% | 111 |
| agd.Mooserwirt2 2.7 | 54 | 18% | 67 |
| spinnercat.Robovirus 2.718 | 37 | 12% | 38 |
| uji.DBH 1.1 | 36 | 12% | 39 |
| ratosh.Nobo 0.21 | 33 | 11% | 37 |
| sigterm.Sigterm 1.0 | 28 | 9% | 31 |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 3% | 13 |
| stelo.WangRobot 1.0 | 6 | 2% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 6 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 79.1 | 76 / 350 | 2.88 | 15.8% | 43314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroA 0.1 | 2.0 | 15.8% | 76 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 16.1% | 112 |
| mld.Infinity 2.2 | 2.0 | 15.5% | 126 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.4% | 11 |
| erdnis.Rover 0.3 | 4.9 | 10.5% | 6 |
| patson.PatsonTestBot 1.0 | 6.0 | 9.1% | 9 |
| pac.ABC 2.1 | 7.5 | 7.2% | 10 |
| mbh.Mbh 0.1 | 7.8 | 7.1% | 0 |
| pbg.R2D2 1.0 | 8.6 | 6.2% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 82.5 | 7 / 35 | 4352 |
| 2 | 1 | 66.4 | 83.5 | 12 / 35 | 4341 |
| 3 | 3 | 63.4 | 74.3 | 6 / 35 | 4115 |
| 4 | 2 | 64.8 | 78.7 | 10 / 35 | 4086 |
| 5 | 3 | 64.3 | 75.9 | 8 / 35 | 4492 |
| 6 | 3 | 64.0 | 75.6 | 6 / 35 | 4155 |
| 7 | 3 | 64.3 | 78.4 | 4 / 35 | 3956 |
| 8 | 2 | 65.0 | 77.8 | 6 / 35 | 4685 |
| 9 | 1 | 65.8 | 82.2 | 8 / 35 | 4426 |
| 10 | 1 | 66.7 | 82.5 | 9 / 35 | 4706 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 87 | 23% |
| mld.Infinity 2.2 | 73 | 32% |
| krillr.mini.JointStrike 2.0.0 | 16 | 81% |
| patson.PatsonTestBot 1.0 | 10 | 70% |
| erdnis.Rover 0.3 | 9 | 100% |
| pac.ABC 2.1 | 5 | 20% |
| mbh.Mbh 0.1 | 2 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 274 of 350 rounds, at a mean tick of 1131. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 135 | 49% | 167 |
| mld.Infinity 2.2 | 84 | 31% | 43 |
| krillr.mini.JointStrike 2.0.0 | 17 | 6% | 43 |
| patson.PatsonTestBot 1.0 | 17 | 6% | 36 |
| erdnis.Rover 0.3 | 8 | 3% | 23 |
| pac.ABC 2.1 | 7 | 3% | 12 |
| pbg.R2D2 1.0 | 4 | 1% | 13 |
| mbh.Mbh 0.1 | 2 | 1% | 11 |

## Melee bench: F20

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 68.5 | 43 / 350 | 3.84 | 13.5% | 36633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.7% | 154 |
| hadur117.nano.SanaroA 0.1 | 2.3 | 13.5% | 43 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 12.2% | 29 |
| fwb.Nine 1.0.1 | 3.5 | 11.8% | 45 |
| catcat20.Rabbit 0.001 | 5.3 | 10.2% | 34 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 9.0% | 14 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 8.9% | 13 |
| bayen.nut.Squirrel 1.615 | 7.6 | 7.6% | 17 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.6 | 68.6 | 3 / 35 | 3546 |
| 2 | 2 | 60.2 | 70.5 | 6 / 35 | 3482 |
| 3 | 3 | 59.8 | 68.6 | 4 / 35 | 3424 |
| 4 | 3 | 61.4 | 71.7 | 3 / 35 | 3825 |
| 5 | 2 | 57.3 | 62.2 | 3 / 35 | 3318 |
| 6 | 2 | 60.9 | 69.2 | 6 / 35 | 4089 |
| 7 | 2 | 62.5 | 74.3 | 4 / 35 | 4145 |
| 8 | 2 | 59.0 | 66.3 | 4 / 35 | 3634 |
| 9 | 3 | 57.8 | 63.2 | 4 / 35 | 3429 |
| 10 | 2 | 61.0 | 70.2 | 6 / 35 | 3741 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 57 | 44% |
| catcat20.Rabbit 0.001 | 16 | 31% |
| nz.jdc.nano.GridFu 1.0 | 11 | 27% |
| fwb.Nine 1.0.1 | 10 | 10% |
| m3thos.mini.Eva01 0.5.5 | 8 | 50% |
| djdjdj.NanoSkunk10 1.0 | 4 | 25% |
| bayen.nut.Squirrel 1.615 | 4 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 307 of 350 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 126 | 41% | 141 |
| fwb.Nine 1.0.1 | 64 | 21% | 65 |
| nz.jdc.nano.GridFu 1.0 | 33 | 11% | 40 |
| catcat20.Rabbit 0.001 | 27 | 9% | 31 |
| m3thos.mini.Eva01 0.5.5 | 17 | 6% | 22 |
| bayen.nut.Squirrel 1.615 | 17 | 6% | 20 |
| djdjdj.NanoSkunk10 1.0 | 13 | 4% | 19 |
| ntc.ControlledChaos 1.1.4 | 8 | 3% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 1% | 3 |

## Melee bench: F21

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 79.3 | 95 / 350 | 2.86 | 16.6% | 49410 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.3 | 16.8% | 167 |
| hadur117.nano.SanaroA 0.1 | 1.7 | 16.6% | 95 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.6% | 33 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.1% | 32 |
| oa.weak.BotherBot 0.1 | 5.4 | 8.6% | 6 |
| eld.Hmm 1.0 | 5.7 | 8.5% | 21 |
| fire219.CatBot 1.0 | 7.3 | 6.5% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.2% | 1 |
| PSW.Relentless 0.1 | 8.6 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 75.2 | 9 / 35 | 4775 |
| 2 | 2 | 66.9 | 80.6 | 11 / 35 | 5282 |
| 3 | 2 | 64.8 | 76.2 | 10 / 35 | 4881 |
| 4 | 2 | 65.6 | 78.7 | 8 / 35 | 4804 |
| 5 | 2 | 65.6 | 80.0 | 8 / 35 | 4837 |
| 6 | 1 | 67.8 | 84.4 | 12 / 35 | 5386 |
| 7 | 1 | 66.7 | 82.5 | 10 / 35 | 5072 |
| 8 | 2 | 63.5 | 73.7 | 9 / 35 | 4356 |
| 9 | 1 | 66.4 | 80.3 | 9 / 35 | 5323 |
| 10 | 2 | 65.3 | 81.3 | 9 / 35 | 4694 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 106 | 45% |
| dummy.mini.Scimitar 1.01 | 31 | 61% |
| cf.RiO.RiOx 4.2.1 | 28 | 54% |
| eld.Hmm 1.0 | 14 | 36% |
| oa.weak.BotherBot 0.1 | 8 | 75% |
| el.JumpShoot 0.2 | 2 | 50% |
| PSW.Relentless 0.1 | 1 | 100% |

Hadur died in 259 of 350 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 104 | 40% | 137 |
| dummy.mini.Scimitar 1.01 | 67 | 26% | 95 |
| cf.RiO.RiOx 4.2.1 | 41 | 16% | 55 |
| eld.Hmm 1.0 | 17 | 7% | 24 |
| oa.weak.BotherBot 0.1 | 9 | 3% | 17 |
| fire219.CatBot 1.0 | 5 | 2% | 5 |
| PSW.Relentless 0.1 | 5 | 2% | 5 |
| el.JumpShoot 0.2 | 4 | 2% | 6 |
| arthord.MannyPacquiao Beta | 4 | 2% | 5 |
3 death(s) with no robot to name.

## Melee bench: F23

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 80.0 | 88 / 350 | 2.80 | 16.0% | 42680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.5% | 169 |
| hadur117.nano.SanaroA 0.1 | 2.2 | 16.0% | 88 |
| cre.Karolos 0.32 | 2.8 | 14.2% | 46 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.6% | 37 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 9.1% | 0 |
| stelo.RamTrackSurfer 1.2 | 6.1 | 9.2% | 6 |
| sample.Walls 1.0 | 6.6 | 8.8% | 3 |
| cw.megas.Blade 0.8 | 7.3 | 8.2% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.9% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.9 | 81.6 | 11 / 35 | 4487 |
| 2 | 2 | 66.0 | 83.8 | 9 / 35 | 4082 |
| 3 | 2 | 65.5 | 78.4 | 8 / 35 | 4106 |
| 4 | 2 | 63.5 | 74.3 | 5 / 35 | 3994 |
| 5 | 2 | 64.8 | 80.6 | 7 / 35 | 3886 |
| 6 | 3 | 64.8 | 78.1 | 7 / 35 | 4213 |
| 7 | 2 | 67.2 | 83.2 | 11 / 35 | 4031 |
| 8 | 2 | 66.6 | 80.3 | 10 / 35 | 4809 |
| 9 | 2 | 67.6 | 84.1 | 14 / 35 | 4707 |
| 10 | 3 | 64.9 | 75.2 | 6 / 35 | 4365 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 98 | 30% |
| cre.Karolos 0.32 | 37 | 57% |
| stelo.AreaTargetingBot 1.1 | 27 | 26% |
| sample.Walls 1.0 | 15 | 93% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 100% |
| stelo.RamTrackSurfer 1.2 | 8 | 75% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 262 of 350 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 136 | 52% | 169 |
| cre.Karolos 0.32 | 57 | 22% | 75 |
| stelo.AreaTargetingBot 1.1 | 40 | 15% | 49 |
| stelo.RamTrackSurfer 1.2 | 12 | 5% | 19 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 3% | 20 |
| cw.megas.Blade 0.8 | 7 | 3% | 8 |
| sample.Walls 1.0 | 3 | 1% | 8 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.4 | 57.4 | 15 / 350 | 4.83 | 11.0% | 29320 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.3 | 15.0% | 106 |
| florent.XSeries.X2 0.12 | 2.7 | 13.6% | 67 |
| davidalves.Phoenix 0.54 | 3.2 | 13.1% | 77 |
| pedersen.Ugluk 1.1.1 | 3.4 | 12.5% | 46 |
| hadur117.nano.SanaroA 0.1 | 4.5 | 11.0% | 15 |
| oog.melee.Corsair 1.0 | 6.0 | 9.7% | 12 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.0% | 24 |
| lunchie.Lunchbox 0.93 | 7.9 | 7.0% | 4 |
| as.FrankTheTank 1.3 | 9.5 | 5.3% | 0 |
| evd.X1 0.01 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.4 | 60.3 | 2 / 35 | 2832 |
| 2 | 5 | 51.0 | 49.2 | 0 / 35 | 2786 |
| 3 | 5 | 52.5 | 54.0 | 1 / 35 | 2880 |
| 4 | 5 | 55.2 | 58.7 | 0 / 35 | 3053 |
| 5 | 6 | 51.3 | 50.8 | 1 / 35 | 2734 |
| 6 | 5 | 53.3 | 56.2 | 0 / 35 | 2786 |
| 7 | 3 | 57.4 | 61.9 | 4 / 35 | 3359 |
| 8 | 5 | 53.1 | 54.6 | 1 / 35 | 2715 |
| 9 | 4 | 56.4 | 63.2 | 3 / 35 | 2783 |
| 10 | 3 | 58.2 | 65.1 | 3 / 35 | 3392 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 22 | 18% |
| davidalves.Phoenix 0.54 | 16 | 13% |
| pedersen.Ugluk 1.1.1 | 12 | 33% |
| florent.XSeries.X2 0.12 | 10 | 20% |
| stelo.SoJNanoMelee 1.1 | 5 | 20% |
| oog.melee.Corsair 1.0 | 3 | 67% |
| lunchie.Lunchbox 0.93 | 3 | 0% |

Hadur died in 335 of 350 rounds, at a mean tick of 597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 66 | 20% | 68 |
| pedersen.Ugluk 1.1.1 | 65 | 19% | 67 |
| florent.XSeries.X2 0.12 | 64 | 19% | 65 |
| rz.GlowBlowMelee 1.4 | 62 | 19% | 67 |
| lunchie.Lunchbox 0.93 | 25 | 7% | 25 |
| oog.melee.Corsair 1.0 | 23 | 7% | 27 |
| stelo.SoJNanoMelee 1.1 | 19 | 6% | 20 |
| as.FrankTheTank 1.3 | 6 | 2% | 6 |
| evd.X1 0.01 | 5 | 1% | 5 |

## Melee bench: F25

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.7 | 63.8 | 41 / 350 | 4.25 | 12.6% | 31788 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.6 | 14.3% | 77 |
| voidious.micro.BlitzBat 1.05 | 1.8 | 14.1% | 75 |
| hadur117.nano.SanaroA 0.1 | 3.0 | 12.6% | 41 |
| jdw.Hurricane 1.4 | 3.8 | 12.0% | 52 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 10.6% | 39 |
| ds.Oo 2.2 | 6.2 | 9.1% | 23 |
| gjr.Cephalosporin 0.1 | 6.5 | 8.8% | 34 |
| awesomeness.Elite 1.0 | 8.3 | 7.2% | 6 |
| adt.Ar2 1.1 | 8.6 | 6.9% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.1 | 62.2 | 4 / 35 | 3181 |
| 2 | 3 | 56.5 | 61.3 | 4 / 35 | 2944 |
| 3 | 2 | 59.0 | 68.9 | 3 / 35 | 3106 |
| 4 | 2 | 59.4 | 68.6 | 5 / 35 | 3249 |
| 5 | 3 | 57.9 | 62.5 | 6 / 35 | 3098 |
| 6 | 4 | 54.9 | 57.1 | 3 / 35 | 2935 |
| 7 | 3 | 57.5 | 62.2 | 4 / 35 | 3473 |
| 8 | 4 | 56.1 | 61.3 | 2 / 35 | 3023 |
| 9 | 2 | 59.0 | 65.7 | 6 / 35 | 3513 |
| 10 | 3 | 59.8 | 68.6 | 4 / 35 | 3266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 37 | 16% |
| voidious.mini.BrokenSword 2.0.3 | 34 | 26% |
| jdw.Hurricane 1.4 | 22 | 59% |
| gjr.Cephalosporin 0.1 | 16 | 13% |
| gre.svman4.Morfeas 1.4.1 | 10 | 10% |
| ds.Oo 2.2 | 9 | 22% |
| awesomeness.Elite 1.0 | 6 | 83% |
| adt.Ar2 1.1 | 3 | 67% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 309 of 350 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 87 | 28% | 92 |
| voidious.mini.BrokenSword 2.0.3 | 60 | 19% | 69 |
| jdw.Hurricane 1.4 | 48 | 16% | 62 |
| gre.svman4.Morfeas 1.4.1 | 29 | 9% | 32 |
| gjr.Cephalosporin 0.1 | 29 | 9% | 29 |
| ds.Oo 2.2 | 20 | 6% | 24 |
| adt.Ar2 1.1 | 18 | 6% | 20 |
| awesomeness.Elite 1.0 | 13 | 4% | 17 |
| amk.ChumbaMini 0.2 | 5 | 2% | 5 |

## Melee bench: F26

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 67.1 | 28 / 350 | 3.96 | 12.9% | 37828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.1% | 129 |
| shu.nitro.LENIN .T34 | 2.4 | 13.5% | 97 |
| hadur117.nano.SanaroA 0.1 | 3.6 | 12.9% | 28 |
| lrem.Spectre 0.4.4 | 3.6 | 12.8% | 50 |
| gh.mini.GrubbmOne 1.0 | 4.9 | 11.3% | 17 |
| js.PinBall 1.6 | 5.5 | 10.7% | 15 |
| jaybot.adv.bots.JayBot 2.0 | 7.0 | 8.8% | 10 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.8% | 7 |
| sample.SpinBot 1.0 | 8.9 | 5.4% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 69.5 | 6 / 35 | 3814 |
| 2 | 4 | 58.1 | 64.8 | 2 / 35 | 3411 |
| 3 | 4 | 61.2 | 69.5 | 4 / 35 | 3884 |
| 4 | 3 | 60.1 | 66.3 | 3 / 35 | 4071 |
| 5 | 3 | 59.9 | 68.3 | 2 / 35 | 3873 |
| 6 | 3 | 61.3 | 72.1 | 2 / 35 | 3941 |
| 7 | 4 | 57.3 | 63.2 | 1 / 35 | 3817 |
| 8 | 4 | 59.8 | 68.9 | 2 / 35 | 3602 |
| 9 | 4 | 58.7 | 63.5 | 3 / 35 | 3854 |
| 10 | 4 | 58.9 | 65.1 | 3 / 35 | 3561 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 43 | 16% |
| shu.nitro.LENIN .T34 | 38 | 13% |
| lrem.Spectre 0.4.4 | 28 | 39% |
| js.PinBall 1.6 | 6 | 50% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 33% |
| gh.mini.GrubbmOne 1.0 | 3 | 0% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 323 of 350 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 99 | 31% | 107 |
| shu.nitro.LENIN .T34 | 66 | 20% | 72 |
| lrem.Spectre 0.4.4 | 47 | 15% | 56 |
| gh.mini.GrubbmOne 1.0 | 40 | 12% | 40 |
| js.PinBall 1.6 | 32 | 10% | 35 |
| jaybot.adv.bots.JayBot 2.0 | 22 | 7% | 23 |
| fullsail.LaxativeTeaTwo 1.0 | 9 | 3% | 10 |
| sample.SpinBot 1.0 | 7 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 65.5 | 61 / 350 | 4.11 | 13.0% | 34387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.0 | 16.1% | 156 |
| hadur117.nano.SanaroA 0.1 | 2.6 | 13.0% | 61 |
| sheldor.melee.nano.TestMelee 0.1 | 3.7 | 11.9% | 32 |
| wee.Gem 1.8.4 | 4.0 | 11.6% | 52 |
| EH.Eagle 1.0.6 | 4.0 | 11.5% | 23 |
| techdude.kombat.FlamingKombat 1.5 | 6.5 | 9.0% | 19 |
| joe.ADinosaur 1.0 | 7.2 | 8.1% | 3 |
| throxbot.ThroxBot 0.1 | 7.8 | 7.6% | 1 |
| caimano.Furia_Ceca 0.22 | 8.6 | 6.4% | 6 |
| cs.Grudge 1.0 | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.7 | 66.3 | 6 / 35 | 3428 |
| 2 | 2 | 61.0 | 73.0 | 10 / 35 | 3428 |
| 3 | 2 | 61.4 | 74.0 | 7 / 35 | 3487 |
| 4 | 6 | 51.4 | 39.0 | 2 / 35 | 4176 |
| 5 | 2 | 60.0 | 70.8 | 6 / 35 | 3269 |
| 6 | 2 | 60.5 | 72.1 | 10 / 35 | 3060 |
| 7 | 2 | 59.0 | 70.2 | 7 / 35 | 2737 |
| 8 | 2 | 59.2 | 68.3 | 5 / 35 | 3358 |
| 9 | 2 | 59.5 | 70.8 | 6 / 35 | 3058 |
| 10 | 4 | 56.3 | 50.5 | 2 / 35 | 4386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 67 | 49% |
| wee.Gem 1.8.4 | 21 | 33% |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 60% |
| EH.Eagle 1.0.6 | 14 | 57% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 0% |
| throxbot.ThroxBot 0.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |

Hadur died in 290 of 350 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 104 | 36% | 131 |
| sheldor.melee.nano.TestMelee 0.1 | 46 | 16% | 59 |
| wee.Gem 1.8.4 | 34 | 12% | 39 |
| EH.Eagle 1.0.6 | 28 | 10% | 41 |
| joe.ADinosaur 1.0 | 24 | 8% | 25 |
| caimano.Furia_Ceca 0.22 | 18 | 6% | 19 |
| techdude.kombat.FlamingKombat 1.5 | 16 | 6% | 13 |
| throxbot.ThroxBot 0.1 | 13 | 4% | 16 |
| cs.Grudge 1.0 | 6 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 77.7 | 91 / 350 | 3.01 | 15.2% | 35353 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.1 | 16.5% | 134 |
| hadur117.nano.SanaroA 0.1 | 2.1 | 15.2% | 91 |
| uji.Antique 1.0 | 2.9 | 13.0% | 66 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.6% | 11 |
| qohnil.blot.BlotBot 3.61 | 4.6 | 10.8% | 26 |
| amk.ChumbaWumba 0.3 | 6.4 | 8.6% | 8 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.3% | 9 |
| matt.advanced.Katana 1.0 | 8.1 | 6.6% | 5 |
| stelo.PianistNano 1.2 | 9.2 | 5.4% | 0 |
| stelo.Lifestealer 1.0 | 9.6 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 83.2 | 12 / 35 | 3674 |
| 2 | 3 | 63.5 | 76.2 | 9 / 35 | 3799 |
| 3 | 2 | 63.8 | 80.6 | 7 / 35 | 3826 |
| 4 | 2 | 63.0 | 80.0 | 6 / 35 | 3418 |
| 5 | 2 | 61.9 | 75.6 | 3 / 35 | 3541 |
| 6 | 1 | 63.4 | 78.4 | 13 / 35 | 3546 |
| 7 | 2 | 63.6 | 77.5 | 12 / 35 | 3757 |
| 8 | 3 | 60.8 | 72.1 | 12 / 35 | 2975 |
| 9 | 2 | 60.9 | 72.4 | 6 / 35 | 3434 |
| 10 | 2 | 63.7 | 81.0 | 11 / 35 | 3383 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 102 | 37% |
| uji.Antique 1.0 | 45 | 58% |
| qohnil.blot.BlotBot 3.61 | 18 | 56% |
| amk.ChumbaWumba 0.3 | 12 | 67% |
| ahr.ice.Ice 1.0.2 | 7 | 57% |
| pfvicm.Sobieski 7.2.3b | 6 | 33% |
| matt.advanced.Katana 1.0 | 5 | 60% |

Hadur died in 259 of 350 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 121 | 47% | 140 |
| uji.Antique 1.0 | 40 | 15% | 78 |
| amk.ChumbaWumba 0.3 | 29 | 11% | 35 |
| pfvicm.Sobieski 7.2.3b | 27 | 10% | 29 |
| qohnil.blot.BlotBot 3.61 | 16 | 6% | 24 |
| ahr.ice.Ice 1.0.2 | 14 | 5% | 21 |
| stelo.Lifestealer 1.0 | 7 | 3% | 7 |
| matt.advanced.Katana 1.0 | 5 | 2% | 11 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |

## Melee bench: F29

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 63.9 | 24 / 350 | 4.25 | 12.9% | 35405 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.5 | 16.1% | 138 |
| deewiant.Anomaly 0.2 | 1.6 | 15.8% | 109 |
| hadur117.nano.SanaroA 0.1 | 3.4 | 12.9% | 24 |
| myl.micro.Troodon 1.10 | 3.7 | 12.6% | 34 |
| jok.PheonixM 0.1.2 | 4.8 | 11.3% | 15 |
| ph.melee.ArcherME 0.3 | 6.3 | 8.4% | 1 |
| DBall.Anarchy 0.1 | 6.8 | 7.5% | 21 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 6.2% | 0 |
| jangs.ns51 1.0 | 9.4 | 4.7% | 2 |
| ap.Frederick 1.1 | 9.4 | 4.5% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.5 | 64.8 | 1 / 35 | 3575 |
| 2 | 4 | 57.8 | 60.3 | 2 / 35 | 3270 |
| 3 | 3 | 60.2 | 66.7 | 4 / 35 | 3682 |
| 4 | 3 | 59.4 | 63.8 | 3 / 35 | 3527 |
| 5 | 3 | 59.1 | 62.5 | 4 / 35 | 3580 |
| 6 | 4 | 58.0 | 60.3 | 0 / 35 | 3802 |
| 7 | 2 | 60.0 | 68.3 | 2 / 35 | 3563 |
| 8 | 3 | 60.0 | 67.3 | 3 / 35 | 3516 |
| 9 | 4 | 59.9 | 66.0 | 4 / 35 | 3463 |
| 10 | 4 | 57.1 | 59.4 | 1 / 35 | 3427 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 44 | 14% |
| zyx.mega.YersiniaPestis 3.1 | 32 | 16% |
| myl.micro.Troodon 1.10 | 13 | 38% |
| jok.PheonixM 0.1.2 | 6 | 83% |
| DBall.Anarchy 0.1 | 4 | 50% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 327 of 350 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 127 | 39% | 133 |
| zyx.mega.YersiniaPestis 3.1 | 78 | 24% | 84 |
| myl.micro.Troodon 1.10 | 46 | 14% | 49 |
| jok.PheonixM 0.1.2 | 41 | 13% | 45 |
| ph.melee.ArcherME 0.3 | 14 | 4% | 16 |
| DBall.Anarchy 0.1 | 11 | 3% | 13 |
| jangs.ns51 1.0 | 5 | 2% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 5 | 2% | 5 |

## Melee bench: F30

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 52.8 | 53.4 | 15 / 350 | 5.19 | 10.2% | 27255 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 2.1 | 14.2% | 71 |
| catcat20.Matcha 0.006 | 2.2 | 14.2% | 93 |
| darkcanuck.B26354 1.06 | 2.7 | 13.6% | 82 |
| stelo.PastFuture 2.3.2 | 3.0 | 13.5% | 51 |
| hadur117.nano.SanaroA 0.1 | 5.0 | 10.2% | 15 |
| intruder.PrairieWolf 2.61 | 6.3 | 9.1% | 21 |
| ntc.Opposite 1.5 | 7.6 | 8.1% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.6% | 7 |
| tripphippy.Alice 1.1 | 8.3 | 7.2% | 6 |
| GarmBox.Anger 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.4 | 55.6 | 3 / 35 | 2838 |
| 2 | 5 | 49.2 | 46.3 | 0 / 35 | 2442 |
| 3 | 5 | 51.6 | 49.2 | 2 / 35 | 2638 |
| 4 | 5 | 55.9 | 61.3 | 1 / 35 | 2871 |
| 5 | 5 | 54.3 | 53.0 | 2 / 35 | 3131 |
| 6 | 5 | 48.8 | 47.0 | 1 / 35 | 2300 |
| 7 | 5 | 53.5 | 54.9 | 1 / 35 | 2806 |
| 8 | 5 | 55.7 | 61.0 | 2 / 35 | 2834 |
| 9 | 5 | 51.1 | 49.2 | 3 / 35 | 2652 |
| 10 | 5 | 53.6 | 56.8 | 0 / 35 | 2743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 19 | 26% |
| oog.melee.Capulet 1.2 | 15 | 27% |
| darkcanuck.B26354 1.06 | 12 | 8% |
| stelo.PastFuture 2.3.2 | 7 | 43% |
| intruder.PrairieWolf 2.61 | 5 | 0% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 67% |
| ntc.Opposite 1.5 | 1 | 0% |

Hadur died in 335 of 350 rounds, at a mean tick of 612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 72 | 21% | 77 |
| stelo.PastFuture 2.3.2 | 63 | 19% | 65 |
| darkcanuck.B26354 1.06 | 53 | 16% | 55 |
| catcat20.Matcha 0.006 | 51 | 15% | 55 |
| intruder.PrairieWolf 2.61 | 27 | 8% | 29 |
| ntc.Opposite 1.5 | 27 | 8% | 27 |
| tripphippy.Alice 1.1 | 22 | 7% | 22 |
| fowl3628800.LightningBolt 2.6.0 | 17 | 5% | 17 |
| GarmBox.Anger 1.0 | 3 | 1% | 3 |

## Melee bench: F31

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.8 | 57.9 | 13 / 350 | 4.79 | 11.0% | 27864 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.9% | 174 |
| gh.mini.Griezel 0.2 | 2.3 | 13.8% | 87 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 12.7% | 29 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.8% | 28 |
| hadur117.nano.SanaroA 0.1 | 4.6 | 11.0% | 13 |
| gh.nano.Grofvuil 0.2 | 5.9 | 9.8% | 13 |
| timmit.nano.TimDog 0.33 | 7.7 | 6.6% | 7 |
| fm.mammillarias 1.3 | 7.7 | 6.4% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.4 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.9 | 57.1 | 1 / 35 | 2839 |
| 2 | 5 | 53.8 | 57.1 | 0 / 35 | 2567 |
| 3 | 5 | 51.4 | 52.1 | 0 / 35 | 2585 |
| 4 | 5 | 56.3 | 61.9 | 1 / 35 | 2834 |
| 5 | 4 | 55.9 | 61.6 | 1 / 35 | 2735 |
| 6 | 4 | 55.3 | 60.0 | 3 / 35 | 2623 |
| 7 | 6 | 49.9 | 47.3 | 1 / 35 | 2525 |
| 8 | 3 | 58.5 | 63.8 | 4 / 35 | 3319 |
| 9 | 4 | 57.3 | 61.9 | 1 / 35 | 3165 |
| 10 | 5 | 54.2 | 55.9 | 1 / 35 | 2672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 32 | 28% |
| gh.mini.Griezel 0.2 | 21 | 5% |
| d414.nano.Quantum 1.0.0 | 9 | 0% |
| spinnercat.micro.Tyger 0.1 | 6 | 33% |
| gh.nano.Grofvuil 0.2 | 3 | 33% |
| timmit.nano.TimDog 0.33 | 1 | 0% |
| fm.mammillarias 1.3 | 1 | 0% |

Hadur died in 337 of 350 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 90 | 27% | 92 |
| spinnercat.micro.Tyger 0.1 | 74 | 22% | 76 |
| abc.Shadow 3.84i | 60 | 18% | 68 |
| d414.nano.Quantum 1.0.0 | 60 | 18% | 60 |
| gh.nano.Grofvuil 0.2 | 26 | 8% | 28 |
| fm.mammillarias 1.3 | 11 | 3% | 10 |
| timmit.nano.TimDog 0.33 | 8 | 2% | 8 |
| Gecko.ultimateGeckoBot 1.0 | 7 | 2% | 7 |
| tlp.ThreeLeggedPig 1 | 1 | 0% | 1 |

## Melee bench: F32

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 75.7 | 111 / 350 | 3.18 | 14.9% | 35788 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.3 | 15.2% | 117 |
| hadur117.nano.SanaroA 0.1 | 1.9 | 14.9% | 111 |
| apc.botM 3.0 | 3.0 | 12.5% | 44 |
| lxx.ConceptA 0.8 | 4.6 | 10.7% | 8 |
| vjik.UnViolation 1.1 | 4.7 | 10.7% | 25 |
| bayen.UbaMicro 1.4 | 5.5 | 9.8% | 14 |
| panzer.Panzer 0.2 | 7.6 | 7.4% | 1 |
| yk.JahMicro 1.0 | 8.1 | 7.2% | 17 |
| conscience.Electron 1.3g | 8.5 | 6.6% | 2 |
| donjezza.Jezza 1.0 | 9.8 | 5.2% | 11 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 77.1 | 11 / 35 | 3434 |
| 2 | 2 | 60.5 | 71.4 | 12 / 35 | 3261 |
| 3 | 3 | 59.5 | 71.1 | 8 / 35 | 3259 |
| 4 | 1 | 64.5 | 80.0 | 13 / 35 | 4129 |
| 5 | 1 | 63.2 | 79.0 | 12 / 35 | 3628 |
| 6 | 3 | 59.9 | 70.2 | 8 / 35 | 3340 |
| 7 | 2 | 61.9 | 74.6 | 12 / 35 | 3587 |
| 8 | 1 | 63.8 | 80.0 | 13 / 35 | 3836 |
| 9 | 2 | 62.0 | 77.1 | 10 / 35 | 3374 |
| 10 | 2 | 63.0 | 76.8 | 12 / 35 | 3940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 92 | 50% |
| apc.botM 3.0 | 33 | 61% |
| vjik.UnViolation 1.1 | 24 | 58% |
| lxx.ConceptA 0.8 | 18 | 83% |
| bayen.UbaMicro 1.4 | 13 | 62% |
| donjezza.Jezza 1.0 | 8 | 38% |
| yk.JahMicro 1.0 | 7 | 0% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 240 of 350 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 89 | 37% | 132 |
| lxx.ConceptA 0.8 | 43 | 18% | 49 |
| apc.botM 3.0 | 34 | 14% | 61 |
| bayen.UbaMicro 1.4 | 20 | 8% | 22 |
| vjik.UnViolation 1.1 | 15 | 6% | 39 |
| yk.JahMicro 1.0 | 14 | 6% | 10 |
| panzer.Panzer 0.2 | 13 | 5% | 16 |
| donjezza.Jezza 1.0 | 8 | 3% | 12 |
| conscience.Electron 1.3g | 4 | 2% | 7 |

## Melee bench: F33

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 67.6 | 53 / 350 | 3.92 | 13.7% | 38499 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.8% | 144 |
| hadur117.nano.SanaroA 0.1 | 2.5 | 13.7% | 53 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.7% | 60 |
| labg.Cataclysm 2.05 | 4.1 | 11.4% | 54 |
| gre.svman4.Leonidas 1.3.2 | 4.7 | 10.9% | 22 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.4 | 8.7% | 10 |
| baal.nano.N 1.42 | 6.6 | 8.7% | 4 |
| zyx.micro.Ant 1.1 | 8.3 | 5.5% | 1 |
| sanja.First 0.1 | 9.2 | 4.9% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.8 | 62.2 | 3 / 35 | 3730 |
| 2 | 2 | 60.9 | 66.0 | 9 / 35 | 3985 |
| 3 | 2 | 64.1 | 76.8 | 7 / 35 | 4045 |
| 4 | 5 | 54.0 | 53.0 | 1 / 35 | 3173 |
| 5 | 2 | 65.0 | 78.4 | 11 / 35 | 4223 |
| 6 | 2 | 62.5 | 71.4 | 4 / 35 | 4172 |
| 7 | 2 | 62.8 | 70.8 | 9 / 35 | 4171 |
| 8 | 3 | 57.8 | 63.2 | 1 / 35 | 3455 |
| 9 | 2 | 61.7 | 71.4 | 5 / 35 | 3904 |
| 10 | 2 | 58.2 | 62.5 | 3 / 35 | 3641 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 59 | 39% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 43% |
| labg.Cataclysm 2.05 | 16 | 25% |
| gre.svman4.Leonidas 1.3.2 | 10 | 80% |
| baal.nano.N 1.42 | 3 | 33% |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 33% |

Hadur died in 298 of 350 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 122 | 41% | 146 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 55 | 18% | 67 |
| labg.Cataclysm 2.05 | 36 | 12% | 40 |
| gre.svman4.Leonidas 1.3.2 | 35 | 12% | 44 |
| kinsen.melee.Angsaichmophobia 1.8c | 19 | 6% | 19 |
| baal.nano.N 1.42 | 18 | 6% | 19 |
| zyx.micro.Ant 1.1 | 9 | 3% | 10 |
| sanja.First 0.1 | 3 | 1% | 4 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 0% | 1 |

## Melee bench: F34

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 68.1 | 23 / 350 | 3.87 | 13.1% | 36489 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.5 | 18.3% | 136 |
| stelo.Spread 0.9 | 1.5 | 17.7% | 155 |
| hadur117.nano.SanaroA 0.1 | 3.0 | 13.1% | 23 |
| tcf.Reach 3 | 4.5 | 11.3% | 9 |
| jcs.Seth 1.8 | 4.7 | 11.2% | 23 |
| cli.Dancer 1.1 | 5.8 | 9.8% | 5 |
| ratosh.Wesco 1.4 | 7.0 | 7.0% | 0 |
| amk.Punbot.Punbot 0.01 | 8.2 | 5.0% | 1 |
| sample.VelociRobot 1.0 | 9.0 | 3.7% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.0 | 71.1 | 4 / 35 | 3791 |
| 2 | 3 | 61.1 | 69.2 | 3 / 35 | 3545 |
| 3 | 3 | 63.0 | 75.9 | 2 / 35 | 3580 |
| 4 | 3 | 60.1 | 67.0 | 1 / 35 | 3789 |
| 5 | 3 | 58.9 | 65.4 | 1 / 35 | 3065 |
| 6 | 3 | 60.7 | 67.3 | 3 / 35 | 3984 |
| 7 | 3 | 61.1 | 67.3 | 3 / 35 | 3937 |
| 8 | 3 | 59.9 | 67.0 | 2 / 35 | 3353 |
| 9 | 3 | 60.3 | 67.6 | 1 / 35 | 3727 |
| 10 | 3 | 59.9 | 63.2 | 3 / 35 | 3718 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 34 | 12% |
| stelo.Spread 0.9 | 33 | 39% |
| tcf.Reach 3 | 9 | 33% |
| jcs.Seth 1.8 | 5 | 20% |
| ratosh.Wesco 1.4 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 329 of 350 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 147 | 45% | 148 |
| stelo.Spread 0.9 | 100 | 30% | 112 |
| tcf.Reach 3 | 28 | 9% | 32 |
| jcs.Seth 1.8 | 26 | 8% | 27 |
| cli.Dancer 1.1 | 14 | 4% | 15 |
| ratosh.Wesco 1.4 | 9 | 3% | 10 |
| sample.VelociRobot 1.0 | 1 | 0% | 3 |
| amk.Punbot.Punbot 0.01 | 1 | 0% | 2 |
| sample.RamFire 1.0 | 1 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 67.9 | 10 / 350 | 3.89 | 12.3% | 27691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 275 |
| gh.mini.Gruwel 0.9 | 3.1 | 13.1% | 33 |
| rz.HawkOnFire 0.1 | 3.5 | 12.5% | 10 |
| hadur117.nano.SanaroA 0.1 | 3.7 | 12.3% | 10 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.7 | 12.6% | 21 |
| myl.nano.KomoriNinja 1.1 | 6.6 | 7.0% | 0 |
| wit.Chuliath 1.0 | 6.7 | 7.0% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 5.7% | 1 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.4 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.4 | 64.8 | 0 / 35 | 2760 |
| 2 | 4 | 58.7 | 68.6 | 1 / 35 | 2713 |
| 3 | 4 | 58.0 | 64.8 | 1 / 35 | 2918 |
| 4 | 5 | 58.1 | 66.3 | 1 / 35 | 2725 |
| 5 | 5 | 57.0 | 65.4 | 0 / 35 | 2542 |
| 6 | 3 | 59.2 | 68.6 | 2 / 35 | 3010 |
| 7 | 3 | 59.4 | 71.1 | 3 / 35 | 2716 |
| 8 | 2 | 59.3 | 71.4 | 1 / 35 | 2730 |
| 9 | 3 | 60.4 | 72.4 | 0 / 35 | 2943 |
| 10 | 4 | 57.2 | 65.7 | 1 / 35 | 2634 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 72 | 1% |
| gh.mini.Gruwel 0.9 | 15 | 7% |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 56% |
| rz.HawkOnFire 0.1 | 4 | 75% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 0% |

Hadur died in 340 of 350 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 141 | 41% | 142 |
| dmh.robocode.robot.BlackDeath 9.2 | 55 | 16% | 60 |
| rz.HawkOnFire 0.1 | 54 | 16% | 58 |
| gh.mini.Gruwel 0.9 | 49 | 14% | 50 |
| myl.nano.KomoriNinja 1.1 | 12 | 4% | 12 |
| wit.Chuliath 1.0 | 10 | 3% | 10 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 9 | 3% | 9 |
| dans.Cinnamon 1.2 | 7 | 2% | 6 |
| stelo.MyAgileRobot 0.2 | 3 | 1% | 3 |

## Melee bench: F36

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 72.0 | 104 / 350 | 3.52 | 14.9% | 39095 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroA 0.1 | 1.0 | 14.9% | 104 |
| alpha.RainingFire 1.0 | 2.3 | 13.1% | 65 |
| bzdp.Pansy 2.1 | 3.0 | 12.6% | 50 |
| mz.Cork 0.1 | 4.3 | 11.4% | 48 |
| bvh.micro.Freya 0.3 | 5.0 | 10.9% | 30 |
| m3thos.Eva02 0.7.1 | 5.8 | 9.8% | 22 |
| bvh.mini.Fenrir 0.39 | 6.6 | 9.5% | 7 |
| dl.BetterWalls 1.0 | 8.5 | 6.9% | 7 |
| squidM.TentalceMeleeNano 1.1 | 8.6 | 6.7% | 8 |
| sample.MyFirstRobot 1.0 | 9.9 | 4.2% | 9 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 78.1 | 10 / 35 | 4322 |
| 2 | 1 | 60.9 | 68.9 | 11 / 35 | 3577 |
| 3 | 1 | 64.4 | 74.9 | 17 / 35 | 4178 |
| 4 | 1 | 60.3 | 67.0 | 8 / 35 | 3939 |
| 5 | 1 | 62.2 | 72.7 | 12 / 35 | 3850 |
| 6 | 1 | 63.7 | 76.5 | 10 / 35 | 4106 |
| 7 | 1 | 60.6 | 67.9 | 10 / 35 | 3672 |
| 8 | 1 | 62.8 | 74.0 | 9 / 35 | 3905 |
| 9 | 1 | 60.9 | 68.9 | 11 / 35 | 3785 |
| 10 | 1 | 61.0 | 71.1 | 6 / 35 | 3761 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 39 | 46% |
| alpha.RainingFire 1.0 | 38 | 26% |
| mz.Cork 0.1 | 33 | 76% |
| bvh.micro.Freya 0.3 | 23 | 83% |
| m3thos.Eva02 0.7.1 | 18 | 67% |
| bvh.mini.Fenrir 0.39 | 14 | 86% |
| dl.BetterWalls 1.0 | 7 | 71% |
| sample.MyFirstRobot 1.0 | 6 | 33% |
| squidM.TentalceMeleeNano 1.1 | 5 | 20% |

Hadur died in 246 of 350 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 64 | 26% | 75 |
| bzdp.Pansy 2.1 | 52 | 21% | 73 |
| mz.Cork 0.1 | 33 | 13% | 54 |
| bvh.micro.Freya 0.3 | 27 | 11% | 41 |
| bvh.mini.Fenrir 0.39 | 25 | 10% | 31 |
| m3thos.Eva02 0.7.1 | 17 | 7% | 31 |
| squidM.TentalceMeleeNano 1.1 | 17 | 7% | 18 |
| dl.BetterWalls 1.0 | 6 | 2% | 18 |
| sample.MyFirstRobot 1.0 | 5 | 2% | 8 |

## Melee bench: F37

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 78.3 | 124 / 350 | 2.95 | 15.6% | 44184 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroA 0.1 | 1.0 | 15.6% | 124 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.6 | 11.4% | 36 |
| EBBU.Sim2 1.02 | 3.5 | 10.8% | 44 |
| germ.TheMind .2 | 3.8 | 11.0% | 38 |
| agrach.Dalek 1.0 | 5.5 | 9.8% | 38 |
| stelo.UntouchableNano 1.3 | 6.3 | 9.1% | 25 |
| lmk.ACPFinal 0.1 | 6.9 | 9.0% | 19 |
| mb.Beast 0.1 | 7.3 | 8.6% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 8.5 | 7.7% | 2 |
| skm.Ryubot 1.0 | 9.6 | 6.9% | 11 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 77.8 | 13 / 35 | 4664 |
| 2 | 1 | 64.4 | 82.9 | 16 / 35 | 4520 |
| 3 | 1 | 62.7 | 79.0 | 13 / 35 | 4238 |
| 4 | 1 | 62.8 | 77.8 | 11 / 35 | 4730 |
| 5 | 1 | 64.5 | 81.9 | 14 / 35 | 4965 |
| 6 | 1 | 59.9 | 70.2 | 10 / 35 | 4174 |
| 7 | 1 | 62.7 | 76.5 | 10 / 35 | 4708 |
| 8 | 1 | 62.5 | 78.7 | 12 / 35 | 4266 |
| 9 | 1 | 62.3 | 80.3 | 14 / 35 | 3780 |
| 10 | 1 | 61.9 | 78.4 | 11 / 35 | 4139 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 36 | 67% |
| EBBU.Sim2 1.02 | 33 | 45% |
| germ.TheMind .2 | 32 | 66% |
| mb.Beast 0.1 | 25 | 84% |
| com.syncleus.robocode.Dreadnaught 0.1 | 22 | 41% |
| stelo.UntouchableNano 1.3 | 21 | 71% |
| lmk.ACPFinal 0.1 | 18 | 67% |
| skm.Ryubot 1.0 | 11 | 45% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 231 of 350 rounds, at a mean tick of 546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 42 | 18% | 63 |
| com.syncleus.robocode.Dreadnaught 0.1 | 41 | 18% | 54 |
| EBBU.Sim2 1.02 | 36 | 16% | 44 |
| agrach.Dalek 1.0 | 26 | 11% | 60 |
| lmk.ACPFinal 0.1 | 26 | 11% | 33 |
| stelo.UntouchableNano 1.3 | 23 | 10% | 34 |
| mb.Beast 0.1 | 16 | 7% | 35 |
| skm.Ryubot 1.0 | 12 | 5% | 15 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 4% | 10 |

## Melee bench: F38

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.4 | 61.4 | 26 / 350 | 4.47 | 11.6% | 30311 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.8% | 167 |
| bvh.mini.Freya 0.55 | 2.3 | 12.9% | 29 |
| cs.Wren 1.0 | 3.9 | 11.8% | 30 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.5% | 43 |
| hadur117.nano.SanaroA 0.1 | 4.7 | 11.6% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.8 | 11.6% | 35 |
| kdf.KoulDestroyer 1.0 | 7.0 | 9.5% | 16 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.0% | 2 |
| bzdp.BoxCar 2.0 | 9.5 | 4.0% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.6 | 63.2 | 4 / 35 | 2968 |
| 2 | 6 | 53.0 | 51.7 | 0 / 35 | 3237 |
| 3 | 6 | 55.2 | 60.3 | 1 / 35 | 2779 |
| 4 | 3 | 59.2 | 69.5 | 3 / 35 | 3060 |
| 5 | 6 | 55.9 | 59.4 | 3 / 35 | 3029 |
| 6 | 5 | 56.0 | 61.6 | 3 / 35 | 2750 |
| 7 | 6 | 56.8 | 60.6 | 4 / 35 | 3137 |
| 8 | 5 | 56.1 | 61.9 | 2 / 35 | 2824 |
| 9 | 4 | 57.0 | 61.9 | 2 / 35 | 3189 |
| 10 | 3 | 57.8 | 63.8 | 4 / 35 | 3338 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 39 | 18% |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 0% |
| bts.mega.Gnarly 1.4 | 17 | 29% |
| cs.Wren 1.0 | 10 | 60% |
| bvh.mini.Freya 0.55 | 8 | 50% |
| kdf.KoulDestroyer 1.0 | 4 | 75% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 50% |

Hadur died in 324 of 350 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 82 | 25% | 92 |
| davidalves.net.DuelistNanoMelee 1.01 | 55 | 17% | 56 |
| bvh.mini.Freya 0.55 | 52 | 16% | 55 |
| bts.mega.Gnarly 1.4 | 50 | 15% | 53 |
| cs.Wren 1.0 | 39 | 12% | 42 |
| kdf.KoulDestroyer 1.0 | 27 | 8% | 29 |
| bzdp.BoxCar 2.0 | 7 | 2% | 8 |
| matt.UnderDark3 2.4.34 | 7 | 2% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 2% | 8 |

## Melee bench: F39

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 63.2 | 40 / 350 | 4.31 | 12.2% | 33647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.1 | 15.6% | 78 |
| az.Ololobot 0.2.4 | 2.3 | 13.6% | 118 |
| hadur117.nano.SanaroA 0.1 | 3.2 | 12.2% | 40 |
| catcat20.Lambda 0.024 | 3.7 | 11.8% | 51 |
| stelo.SoRobotNanoMelee 1.2 | 5.7 | 9.7% | 39 |
| winamp32.micro.MicroMacro 1.0 | 6.5 | 8.9% | 13 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 8.3% | 6 |
| gimp.GimpBot 0.1 | 7.0 | 8.2% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.8 | 6.6% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.2 | 60.0 | 7 / 35 | 3284 |
| 2 | 2 | 58.8 | 69.2 | 5 / 35 | 3532 |
| 3 | 3 | 56.9 | 63.8 | 2 / 35 | 3460 |
| 4 | 4 | 54.1 | 58.1 | 1 / 35 | 3202 |
| 5 | 3 | 57.8 | 64.8 | 3 / 35 | 3553 |
| 6 | 5 | 54.3 | 56.5 | 0 / 35 | 3294 |
| 7 | 4 | 57.1 | 64.1 | 4 / 35 | 3339 |
| 8 | 2 | 58.5 | 66.0 | 6 / 35 | 3627 |
| 9 | 4 | 54.9 | 57.5 | 4 / 35 | 3170 |
| 10 | 2 | 59.6 | 71.7 | 8 / 35 | 3186 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 30 | 0% |
| catcat20.Lambda 0.024 | 25 | 48% |
| bvh.fry.Freya 0.82 | 25 | 56% |
| stelo.SoRobotNanoMelee 1.2 | 13 | 38% |
| gimp.GimpBot 0.1 | 5 | 80% |
| winamp32.micro.MicroMacro 1.0 | 4 | 25% |
| whitesquare.robots.SkynetAdvanced 1.1 | 3 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 0% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 310 of 350 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 104 | 34% | 118 |
| az.Ololobot 0.2.4 | 60 | 19% | 61 |
| catcat20.Lambda 0.024 | 40 | 13% | 44 |
| stelo.SoRobotNanoMelee 1.2 | 34 | 11% | 37 |
| apollokidd.ApolloKidd 0.9 | 27 | 9% | 30 |
| gimp.GimpBot 0.1 | 16 | 5% | 24 |
| winamp32.micro.MicroMacro 1.0 | 15 | 5% | 20 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9 | 3% | 9 |
| dcs.Eater_of_Worlds 1.1.3-A | 5 | 2% | 5 |

## Melee bench: F41

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 69.3 | 58 / 350 | 3.77 | 13.6% | 34826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.2 | 17.2% | 171 |
| hadur117.nano.SanaroA 0.1 | 2.9 | 13.6% | 58 |
| ary.Swarm 1.1 | 3.2 | 13.2% | 29 |
| lessonz.robocode.Oz 0.5.0 | 3.2 | 13.3% | 38 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.9% | 40 |
| shrub.Silver v048 | 6.2 | 9.1% | 7 |
| zyx.nano.Ant 1.1 | 6.8 | 7.3% | 2 |
| jsal.Jsalbot 1.0 | 8.3 | 6.3% | 6 |
| stelo.Mirror 1.1 | 8.7 | 5.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 71.7 | 6 / 35 | 3497 |
| 2 | 4 | 59.0 | 64.8 | 7 / 35 | 3084 |
| 3 | 2 | 62.2 | 73.7 | 6 / 35 | 3792 |
| 4 | 4 | 60.5 | 67.3 | 8 / 35 | 3542 |
| 5 | 5 | 58.0 | 61.9 | 2 / 35 | 3273 |
| 6 | 3 | 61.2 | 69.5 | 5 / 35 | 3558 |
| 7 | 2 | 61.8 | 71.4 | 7 / 35 | 3626 |
| 8 | 3 | 59.4 | 67.0 | 4 / 35 | 3222 |
| 9 | 2 | 61.7 | 72.1 | 4 / 35 | 3526 |
| 10 | 2 | 62.4 | 73.3 | 9 / 35 | 3706 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 76 | 18% |
| ary.Swarm 1.1 | 22 | 82% |
| lessonz.robocode.Oz 0.5.0 | 21 | 76% |
| simonton.nano.MeleeSeed 1.8 | 18 | 39% |
| shrub.Silver v048 | 3 | 33% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 292 of 350 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 107 | 37% | 117 |
| ary.Swarm 1.1 | 58 | 20% | 79 |
| lessonz.robocode.Oz 0.5.0 | 44 | 15% | 54 |
| simonton.nano.MeleeSeed 1.8 | 41 | 14% | 50 |
| shrub.Silver v048 | 17 | 6% | 19 |
| zyx.nano.Ant 1.1 | 10 | 3% | 11 |
| jsal.Jsalbot 1.0 | 7 | 2% | 9 |
| stelo.Mirror 1.1 | 4 | 1% | 6 |
| acogdev.alpha 0.2 | 4 | 1% | 5 |

## Melee bench: F42

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 68.2 | 35 / 350 | 3.86 | 13.2% | 37130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 18.0% | 199 |
| maribo.mini.MiniQuester 0.1 | 2.6 | 14.1% | 46 |
| ara.Shera 0.88 | 2.9 | 13.8% | 58 |
| hadur117.nano.SanaroA 0.1 | 3.5 | 13.2% | 35 |
| amz.NanoClone 1.41 | 5.2 | 9.2% | 5 |
| maribo.IotaCT 1.1 | 6.0 | 7.9% | 3 |
| dsw.StaticD 1.0 | 7.4 | 7.0% | 3 |
| stelo.MirrorMicro 1.0 | 8.1 | 5.9% | 0 |
| mme.NikeEnhanced 2.0 | 8.9 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.4 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.9 | 72.1 | 5 / 35 | 4039 |
| 2 | 4 | 60.2 | 72.1 | 3 / 35 | 3295 |
| 3 | 2 | 60.0 | 67.0 | 6 / 35 | 4010 |
| 4 | 4 | 57.7 | 63.5 | 2 / 35 | 3372 |
| 5 | 4 | 57.7 | 64.4 | 4 / 35 | 3291 |
| 6 | 3 | 61.2 | 72.1 | 2 / 35 | 4115 |
| 7 | 4 | 59.9 | 66.3 | 4 / 35 | 3849 |
| 8 | 4 | 60.3 | 69.5 | 3 / 35 | 3864 |
| 9 | 3 | 59.8 | 68.9 | 3 / 35 | 3667 |
| 10 | 4 | 58.7 | 66.3 | 3 / 35 | 3628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 62 | 13% |
| ara.Shera 0.88 | 29 | 41% |
| maribo.mini.MiniQuester 0.1 | 20 | 50% |
| amz.NanoClone 1.41 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 50% |
| maribo.IotaCT 1.1 | 2 | 100% |

Hadur died in 315 of 350 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 117 | 37% | 126 |
| ara.Shera 0.88 | 82 | 26% | 92 |
| maribo.mini.MiniQuester 0.1 | 64 | 20% | 72 |
| amz.NanoClone 1.41 | 22 | 7% | 23 |
| maribo.IotaCT 1.1 | 11 | 3% | 14 |
| dsw.StaticD 1.0 | 6 | 2% | 9 |
| stelo.MirrorMicro 1.0 | 6 | 2% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 5 | 2% | 5 |
| mme.NikeEnhanced 2.0 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 60.7 | 12 / 350 | 4.53 | 11.6% | 30415 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.7% | 280 |
| brainfade.melee.Dusk 0.44 | 2.0 | 13.4% | 40 |
| dummy.micro.Sparrow 2.5 | 3.4 | 12.1% | 10 |
| hadur117.nano.SanaroA 0.1 | 4.2 | 11.6% | 12 |
| wcsv.melee.EngineerMelee 0.1 | 4.6 | 11.2% | 7 |
| Krabb.akim2.Akim2 1.1b | 5.9 | 9.9% | 2 |
| mz.NanoGod 2.02 | 6.9 | 7.9% | 0 |
| jab.DiamondStealer 5 | 8.0 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 58.5 | 61.3 | 3 / 35 | 2890 |
| 2 | 3 | 59.7 | 62.5 | 1 / 35 | 3367 |
| 3 | 4 | 58.3 | 62.5 | 1 / 35 | 2905 |
| 4 | 3 | 59.4 | 63.8 | 0 / 35 | 3353 |
| 5 | 5 | 56.3 | 55.2 | 1 / 35 | 3004 |
| 6 | 5 | 56.5 | 58.1 | 2 / 35 | 2582 |
| 7 | 4 | 57.6 | 58.4 | 1 / 35 | 3011 |
| 8 | 3 | 60.0 | 65.1 | 1 / 35 | 3334 |
| 9 | 5 | 58.3 | 61.9 | 0 / 35 | 3152 |
| 10 | 5 | 57.3 | 58.4 | 2 / 35 | 2817 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 56 | 2% |
| brainfade.melee.Dusk 0.44 | 10 | 50% |
| dummy.micro.Sparrow 2.5 | 5 | 80% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 50% |
| Krabb.akim2.Akim2 1.1b | 2 | 0% |

Hadur died in 338 of 350 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 159 | 47% | 161 |
| wcsv.melee.EngineerMelee 0.1 | 47 | 14% | 48 |
| brainfade.melee.Dusk 0.44 | 42 | 12% | 46 |
| dummy.micro.Sparrow 2.5 | 42 | 12% | 46 |
| mz.NanoGod 2.02 | 19 | 6% | 19 |
| Krabb.akim2.Akim2 1.1b | 18 | 5% | 18 |
| jab.DiamondStealer 5 | 10 | 3% | 11 |
| cvt.Firsty 1.0 | 1 | 0% | 1 |

## Melee bench: F44

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 69.5 | 63 / 350 | 3.75 | 14.2% | 40238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.2 | 16.9% | 156 |
| tzu.TheArtOfWar 1.2 | 2.1 | 15.8% | 90 |
| hadur117.nano.SanaroA 0.1 | 2.7 | 14.2% | 63 |
| jwirde.Gort 2.0 | 4.4 | 10.7% | 21 |
| wompi.Quokka 1.6 | 4.8 | 10.5% | 11 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.8 | 8.8% | 3 |
| disan.Chair 2.2.0 | 7.1 | 7.2% | 5 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.3% | 1 |
| sample.Crazy 1.0 | 8.9 | 5.4% | 2 |
| amk.jointstrike.JointStrike 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.9 | 67.6 | 2 / 35 | 4468 |
| 2 | 3 | 60.2 | 67.0 | 6 / 35 | 3548 |
| 3 | 2 | 63.7 | 77.5 | 10 / 35 | 3851 |
| 4 | 2 | 64.6 | 79.7 | 6 / 35 | 4423 |
| 5 | 3 | 59.5 | 61.6 | 6 / 35 | 3986 |
| 6 | 3 | 62.1 | 69.8 | 6 / 35 | 4197 |
| 7 | 3 | 60.4 | 64.8 | 5 / 35 | 4026 |
| 8 | 2 | 62.2 | 72.1 | 9 / 35 | 3817 |
| 9 | 3 | 61.0 | 67.3 | 6 / 35 | 3896 |
| 10 | 3 | 61.0 | 67.6 | 7 / 35 | 4026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 71 | 42% |
| tzu.TheArtOfWar 1.2 | 45 | 36% |
| jwirde.Gort 2.0 | 12 | 42% |
| wompi.Quokka 1.6 | 8 | 63% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 50% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| disan.Chair 2.2.0 | 2 | 100% |

Hadur died in 290 of 350 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 107 | 37% | 135 |
| tzu.TheArtOfWar 1.2 | 99 | 34% | 112 |
| jwirde.Gort 2.0 | 25 | 9% | 35 |
| wompi.Quokka 1.6 | 23 | 8% | 24 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 15 | 5% | 16 |
| stf.PanzerGeneral 0.1 | 6 | 2% | 9 |
| disan.Chair 2.2.0 | 5 | 2% | 7 |
| sample.Crazy 1.0 | 5 | 2% | 6 |
| amk.jointstrike.JointStrike 0.2 | 5 | 2% | 6 |

## Melee bench: F45

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 66.8 | 26 / 350 | 3.99 | 13.8% | 40965 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 1.7 | 13.6% | 212 |
| hadur117.nano.SanaroA 0.1 | 2.0 | 13.8% | 26 |
| jje.BagPuss 1.2 | 2.3 | 12.9% | 35 |
| sul.Lunar 1.1 | 4.2 | 11.0% | 35 |
| myl.nano.Graviton 1.10 | 5.1 | 10.1% | 7 |
| hvilela.HVilela 0.9 | 5.8 | 9.5% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.4 | 8.4% | 1 |
| fm.claire 1.7 | 7.6 | 8.3% | 2 |
| wit.Deep7 2.0 | 9.2 | 6.7% | 28 |
| abud.ThirdRobo 1.0 | 9.7 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 74.0 | 4 / 35 | 4272 |
| 2 | 2 | 59.7 | 66.0 | 1 / 35 | 4167 |
| 3 | 3 | 57.9 | 61.6 | 1 / 35 | 4063 |
| 4 | 3 | 57.1 | 59.7 | 2 / 35 | 3935 |
| 5 | 2 | 59.7 | 65.7 | 3 / 35 | 4231 |
| 6 | 2 | 60.2 | 69.5 | 3 / 35 | 3998 |
| 7 | 2 | 61.6 | 70.8 | 3 / 35 | 4524 |
| 8 | 2 | 59.9 | 67.9 | 2 / 35 | 3943 |
| 9 | 2 | 57.2 | 62.2 | 2 / 35 | 3628 |
| 10 | 1 | 61.2 | 70.5 | 5 / 35 | 4204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 56 | 7% |
| jje.BagPuss 1.2 | 15 | 40% |
| sul.Lunar 1.1 | 12 | 0% |
| wit.Deep7 2.0 | 11 | 9% |
| myl.nano.Graviton 1.10 | 7 | 100% |
| hvilela.HVilela 0.9 | 4 | 75% |
| pez.mini.ChironexFleckeri 0.5 | 4 | 75% |
| fm.claire 1.7 | 1 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 325 of 350 rounds, at a mean tick of 1089. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jje.BagPuss 1.2 | 69 | 21% | 90 |
| eem.IWillFireNoBullet v2.8 | 68 | 21% | 0 |
| sul.Lunar 1.1 | 57 | 18% | 70 |
| myl.nano.Graviton 1.10 | 39 | 12% | 64 |
| fm.claire 1.7 | 30 | 9% | 33 |
| hvilela.HVilela 0.9 | 21 | 6% | 32 |
| wit.Deep7 2.0 | 21 | 6% | 22 |
| pez.mini.ChironexFleckeri 0.5 | 15 | 5% | 25 |
| abud.ThirdRobo 1.0 | 5 | 2% | 11 |

## Melee bench: F46

hadur117.nano.SanaroA 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 67.7 | 19 / 350 | 3.91 | 12.5% | 31197 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.4 | 17.9% | 142 |
| rsalesc.melee.Medina 0.4.5 | 1.6 | 17.2% | 149 |
| hadur117.nano.SanaroA 0.1 | 3.0 | 12.5% | 19 |
| mz.MicroSheep 1.0 | 4.3 | 10.7% | 8 |
| cx.Princess 1.0 | 5.0 | 10.1% | 23 |
| sadoner.killer 0.2 | 5.8 | 9.1% | 8 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.7% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.3% | 0 |
| kurios.DOSexe .9a | 8.9 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 74.3 | 1 / 35 | 3441 |
| 2 | 3 | 59.6 | 68.9 | 3 / 35 | 3333 |
| 3 | 3 | 57.3 | 64.8 | 1 / 35 | 2948 |
| 4 | 3 | 58.0 | 65.1 | 2 / 35 | 3040 |
| 5 | 3 | 58.1 | 66.3 | 4 / 35 | 2860 |
| 6 | 3 | 57.1 | 61.6 | 0 / 35 | 3177 |
| 7 | 3 | 59.4 | 67.9 | 2 / 35 | 3422 |
| 8 | 3 | 58.8 | 69.8 | 3 / 35 | 2940 |
| 9 | 3 | 57.8 | 67.0 | 2 / 35 | 2704 |
| 10 | 3 | 59.9 | 71.4 | 1 / 35 | 3332 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 54 | 13% |
| rsalesc.melee.Medina 0.4.5 | 31 | 19% |
| mz.MicroSheep 1.0 | 9 | 44% |
| cx.Princess 1.0 | 6 | 17% |
| sadoner.killer 0.2 | 3 | 0% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 331 of 350 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 144 | 44% | 154 |
| rsalesc.melee.Medina 0.4.5 | 96 | 29% | 99 |
| cx.Princess 1.0 | 30 | 9% | 31 |
| mz.MicroSheep 1.0 | 26 | 8% | 27 |
| arthord.NanoSatanMelee Beta | 13 | 4% | 14 |
| sadoner.killer 0.2 | 12 | 4% | 12 |
| jeremyreeder.collective.Prophet 5 | 8 | 2% | 7 |
| kurios.DOSexe .9a | 2 | 1% | 5 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |

