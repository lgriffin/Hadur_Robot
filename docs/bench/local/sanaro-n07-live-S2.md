# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 74.6 | 47 / 350 | 3.29 | 13.8% | 36251 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.6% | 246 |
| hadur117.nano.SanaroS2 0.2 | 2.1 | 13.8% | 47 |
| sgp.JollyNinja 3.53 | 3.6 | 11.6% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.9 | 11.3% | 9 |
| mz.MicroGodMelee 1 | 4.9 | 10.8% | 10 |
| lorneswork.Predator 1.0 | 5.5 | 10.2% | 14 |
| adt.Ar2 1.0 | 7.2 | 7.9% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 7.8 | 6.2% | 1 |
| skm.butterfly 1.0 | 9.1 | 4.3% | 0 |
| mym.EdgeStalker 1.0 | 9.9 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 69.8 | 3 / 35 | 3772 |
| 2 | 3 | 59.9 | 70.5 | 4 / 35 | 3216 |
| 3 | 2 | 59.6 | 70.8 | 5 / 35 | 3540 |
| 4 | 2 | 61.1 | 74.0 | 5 / 35 | 3507 |
| 5 | 2 | 62.7 | 78.1 | 5 / 35 | 3876 |
| 6 | 2 | 62.2 | 78.1 | 5 / 35 | 3411 |
| 7 | 2 | 62.1 | 78.1 | 6 / 35 | 3386 |
| 8 | 2 | 64.3 | 81.6 | 9 / 35 | 3880 |
| 9 | 2 | 60.1 | 70.5 | 2 / 35 | 3770 |
| 10 | 2 | 62.1 | 74.6 | 3 / 35 | 3893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 143 | 15% |
| sgp.JollyNinja 3.53 | 24 | 54% |
| lorneswork.Predator 1.0 | 9 | 33% |
| mz.MicroGodMelee 1 | 8 | 50% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 83% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 304 of 350 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 162 | 53% | 185 |
| lorneswork.Predator 1.0 | 36 | 12% | 40 |
| sgp.JollyNinja 3.53 | 33 | 11% | 43 |
| simonton.nano.WeekendObsession_Melee 1.0 | 32 | 11% | 35 |
| mz.MicroGodMelee 1 | 24 | 8% | 30 |
| adt.Ar2 1.0 | 12 | 4% | 12 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 1% | 3 |
| skm.butterfly 1.0 | 2 | 1% | 2 |

## Melee bench: F02

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 65.7 | 59 / 350 | 4.08 | 13.3% | 38160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.6 | 15.0% | 96 |
| pulsar.PulsarMax 0.8.9 | 1.9 | 14.8% | 99 |
| hadur117.nano.SanaroS2 0.2 | 2.6 | 13.3% | 59 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.7% | 6 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 9.9% | 18 |
| sch.Simone 0.3d | 6.9 | 8.5% | 24 |
| Noran.BitchingElk 0.054 | 7.1 | 8.1% | 31 |
| fnc.bandit.Bandit 5.2.0 | 7.5 | 7.9% | 5 |
| stelo.PatternRobot 1.0 | 8.4 | 7.1% | 12 |
| fullsail.SweetTea 1.1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.7 | 68.6 | 4 / 35 | 3750 |
| 2 | 3 | 61.9 | 69.8 | 8 / 35 | 4289 |
| 3 | 1 | 62.4 | 75.6 | 5 / 35 | 4184 |
| 4 | 3 | 59.0 | 66.0 | 5 / 35 | 3660 |
| 5 | 3 | 58.4 | 63.8 | 7 / 35 | 3490 |
| 6 | 3 | 58.5 | 62.2 | 6 / 35 | 3904 |
| 7 | 3 | 55.5 | 57.5 | 6 / 35 | 3336 |
| 8 | 2 | 58.2 | 66.0 | 6 / 35 | 3446 |
| 9 | 3 | 58.1 | 63.5 | 4 / 35 | 3828 |
| 10 | 3 | 60.4 | 64.4 | 8 / 35 | 4273 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 48 | 25% |
| pulsar.PulsarMax 0.8.9 | 42 | 43% |
| sch.Simone 0.3d | 13 | 31% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 92% |
| stelo.PatternRobot 1.0 | 9 | 22% |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 100% |
| Noran.BitchingElk 0.054 | 5 | 20% |
| fnc.bandit.Bandit 5.2.0 | 4 | 25% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 291 of 350 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 68 | 23% | 83 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 67 | 23% | 83 |
| lrem.micro.SpikeSoldier 0.4 | 38 | 13% | 42 |
| sch.Simone 0.3d | 32 | 11% | 41 |
| stelo.PatternRobot 1.0 | 30 | 10% | 31 |
| com.cohesiva.robocode.ManOwaR 1.0 | 24 | 8% | 32 |
| fnc.bandit.Bandit 5.2.0 | 16 | 5% | 18 |
| Noran.BitchingElk 0.054 | 10 | 3% | 11 |
| fullsail.SweetTea 1.1 | 6 | 2% | 9 |

## Melee bench: F03

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 77.5 | 78 / 350 | 3.03 | 15.0% | 42412 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS2 0.2 | 2.0 | 15.0% | 78 |
| radnor.DoctorBob 1.42 | 2.1 | 15.0% | 95 |
| kawigi.nano.Lib 1.0 | 2.1 | 15.0% | 95 |
| vuen.Cake 2.51 | 3.8 | 13.2% | 62 |
| urdos.URDOS 1.3 | 5.0 | 10.3% | 13 |
| adt.Ar1 2.1 | 6.8 | 7.5% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.1 | 7.2% | 1 |
| oa.weak.FlyMk1 0.1 | 7.6 | 6.4% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.5% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 74.0 | 3 / 35 | 4450 |
| 2 | 2 | 63.6 | 79.0 | 8 / 35 | 4425 |
| 3 | 3 | 62.3 | 76.8 | 8 / 35 | 3881 |
| 4 | 2 | 61.9 | 75.9 | 7 / 35 | 4036 |
| 5 | 3 | 61.3 | 74.3 | 4 / 35 | 4044 |
| 6 | 2 | 62.4 | 77.1 | 5 / 35 | 4282 |
| 7 | 1 | 63.3 | 78.4 | 10 / 35 | 4108 |
| 8 | 3 | 63.0 | 79.7 | 8 / 35 | 3797 |
| 9 | 1 | 65.0 | 81.3 | 14 / 35 | 4470 |
| 10 | 1 | 64.3 | 78.1 | 11 / 35 | 4919 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 63 | 40% |
| vuen.Cake 2.51 | 58 | 57% |
| kawigi.nano.Lib 1.0 | 40 | 15% |
| urdos.URDOS 1.3 | 12 | 75% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 50% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| adt.Ar1 2.1 | 1 | 0% |

Hadur died in 272 of 350 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 86 | 32% | 94 |
| radnor.DoctorBob 1.42 | 74 | 27% | 94 |
| urdos.URDOS 1.3 | 45 | 17% | 54 |
| vuen.Cake 2.51 | 41 | 15% | 73 |
| ghent.ArthurPanzergon 1.0.0 | 8 | 3% | 10 |
| adt.Ar1 2.1 | 8 | 3% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 2% | 5 |
| oa.weak.FlyMk1 0.1 | 3 | 1% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 0% | 2 |

## Melee bench: F04

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 72.1 | 8 / 350 | 3.51 | 13.9% | 42509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.1% | 314 |
| apc.LeeroyJenkins2 1.0 | 2.4 | 14.0% | 21 |
| hadur117.nano.SanaroS2 0.2 | 2.6 | 13.9% | 8 |
| TNT.TNT 0.99.1 | 4.1 | 10.9% | 5 |
| josago.Jorgito 0.16 | 5.0 | 9.5% | 1 |
| css.Delitioner 0.11 | 6.5 | 7.2% | 1 |
| tj.zombie1n 1.0.1 | 6.6 | 7.0% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 81.0 | 2 / 35 | 4718 |
| 2 | 3 | 58.8 | 65.4 | 0 / 35 | 3585 |
| 3 | 3 | 60.7 | 67.3 | 0 / 35 | 3904 |
| 4 | 3 | 62.2 | 68.9 | 2 / 35 | 4546 |
| 5 | 2 | 64.0 | 76.2 | 2 / 35 | 4624 |
| 6 | 3 | 61.9 | 71.1 | 0 / 35 | 4294 |
| 7 | 3 | 61.5 | 69.5 | 1 / 35 | 3947 |
| 8 | 2 | 61.5 | 70.8 | 0 / 35 | 4089 |
| 9 | 2 | 63.7 | 76.2 | 1 / 35 | 4563 |
| 10 | 3 | 63.1 | 74.9 | 0 / 35 | 4239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 137 | 3% |
| apc.LeeroyJenkins2 1.0 | 7 | 14% |
| TNT.TNT 0.99.1 | 3 | 67% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 342 of 350 rounds, at a mean tick of 1092. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 230 | 67% | 234 |
| apc.LeeroyJenkins2 1.0 | 53 | 15% | 54 |
| josago.Jorgito 0.16 | 33 | 10% | 33 |
| TNT.TNT 0.99.1 | 16 | 5% | 18 |
| tj.zombie1n 1.0.1 | 3 | 1% | 4 |
| css.Delitioner 0.11 | 3 | 1% | 3 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 72.3 | 83 / 350 | 3.49 | 14.0% | 33915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.5 | 15.6% | 86 |
| origin.SleepSiphon 1.7b | 2.2 | 14.1% | 100 |
| hadur117.nano.SanaroS2 0.2 | 2.7 | 14.0% | 83 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.9 | 12.4% | 43 |
| mld.Wisdom 1.0 | 4.7 | 11.1% | 7 |
| gg.Wolverine 2.0 | 6.4 | 8.2% | 11 |
| spinnercat.Omen 1.0 | 7.2 | 7.7% | 6 |
| DBall.NUKE 0.1 | 8.0 | 7.1% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 8.4 | 6.8% | 10 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 76.5 | 10 / 35 | 3836 |
| 2 | 2 | 61.0 | 72.7 | 10 / 35 | 3167 |
| 3 | 3 | 61.7 | 72.7 | 10 / 35 | 3093 |
| 4 | 2 | 59.9 | 70.2 | 9 / 35 | 3213 |
| 5 | 3 | 61.5 | 74.0 | 8 / 35 | 3648 |
| 6 | 3 | 61.9 | 74.3 | 11 / 35 | 3398 |
| 7 | 3 | 60.6 | 70.2 | 6 / 35 | 3557 |
| 8 | 4 | 58.5 | 67.9 | 4 / 35 | 3087 |
| 9 | 2 | 62.3 | 77.5 | 8 / 35 | 3401 |
| 10 | 3 | 59.7 | 67.6 | 7 / 35 | 3515 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 57 | 58% |
| origin.SleepSiphon 1.7b | 47 | 38% |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 59% |
| DBall.NUKE 0.1 | 5 | 80% |
| mld.Wisdom 1.0 | 5 | 80% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 75% |
| gg.Wolverine 2.0 | 4 | 100% |
| spinnercat.Omen 1.0 | 2 | 50% |

Hadur died in 267 of 350 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 83 | 31% | 109 |
| origin.SleepSiphon 1.7b | 74 | 28% | 94 |
| pe.minimelee.SandboxMiniMelee 1.1 | 48 | 18% | 67 |
| mld.Wisdom 1.0 | 30 | 11% | 35 |
| gg.Wolverine 2.0 | 12 | 4% | 15 |
| spinnercat.Omen 1.0 | 10 | 4% | 11 |
| DBall.NUKE 0.1 | 7 | 3% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 1% | 6 |
| sample.Fire 1.0 | 0 | 0% | 1 |

## Melee bench: F07

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 82.5 | 86 / 350 | 2.57 | 16.4% | 46676 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.5 | 18.2% | 102 |
| rtk.Tachikoma 1.0 | 1.6 | 17.5% | 102 |
| hadur117.nano.SanaroS2 0.2 | 2.9 | 16.4% | 86 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.4% | 18 |
| franzor.Lizt 1.3.1 | 4.5 | 11.3% | 43 |
| lrem.micro.MoggFanatic 0.2 | 6.4 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.6 | 7.7% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.1 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.9 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.9 | 80.3 | 9 / 35 | 4299 |
| 2 | 3 | 67.5 | 82.5 | 10 / 35 | 4748 |
| 3 | 3 | 64.9 | 79.4 | 5 / 35 | 4163 |
| 4 | 3 | 67.3 | 86.0 | 9 / 35 | 4399 |
| 5 | 3 | 67.5 | 85.1 | 10 / 35 | 4787 |
| 6 | 2 | 67.5 | 82.5 | 7 / 35 | 5344 |
| 7 | 3 | 67.0 | 82.5 | 9 / 35 | 4742 |
| 8 | 3 | 66.9 | 79.7 | 10 / 35 | 4985 |
| 9 | 3 | 67.0 | 84.4 | 8 / 35 | 4485 |
| 10 | 3 | 67.2 | 82.9 | 9 / 35 | 4724 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 101 | 51% |
| rsalesc.melee.Monk 0.3.6c | 52 | 15% |
| oog.melee.CapuletDroid 1.1 | 25 | 52% |
| franzor.Lizt 1.3.1 | 22 | 45% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 264 of 350 rounds, at a mean tick of 1460. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 118 | 45% | 179 |
| rsalesc.melee.Monk 0.3.6c | 94 | 36% | 108 |
| oog.melee.CapuletDroid 1.1 | 28 | 11% | 40 |
| franzor.Lizt 1.3.1 | 14 | 5% | 1 |
| exauge.GateKeeper 1.1.121g | 6 | 2% | 13 |
| lrem.micro.MoggFanatic 0.2 | 4 | 2% | 5 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 72.4 | 98 / 350 | 3.49 | 14.1% | 32828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS2 0.2 | 1.6 | 14.1% | 98 |
| tm.Yuugao 1.0 | 2.2 | 13.4% | 76 |
| shrub.Vapour v159 | 2.4 | 13.7% | 78 |
| Krabb.sliNk.Garm 0.9u | 4.6 | 10.4% | 27 |
| com.spp.robocode.MostlyHarmless 010 | 5.1 | 10.1% | 32 |
| m3thos.Eva00 1.1 | 5.7 | 9.4% | 10 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.9% | 22 |
| SHAM.WOW 1.4 | 8.8 | 6.9% | 5 |
| qualidafial.MajorDick 1.0.1 | 8.8 | 6.8% | 3 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 6.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.9 | 65.7 | 6 / 35 | 3171 |
| 2 | 1 | 62.3 | 75.9 | 9 / 35 | 3876 |
| 3 | 1 | 60.9 | 71.7 | 11 / 35 | 3484 |
| 4 | 1 | 61.2 | 75.6 | 12 / 35 | 3184 |
| 5 | 2 | 60.9 | 75.2 | 10 / 35 | 3233 |
| 6 | 1 | 60.8 | 74.3 | 12 / 35 | 3235 |
| 7 | 1 | 60.3 | 73.0 | 10 / 35 | 3250 |
| 8 | 1 | 61.9 | 77.5 | 9 / 35 | 3293 |
| 9 | 3 | 56.5 | 63.5 | 5 / 35 | 3099 |
| 10 | 2 | 60.4 | 71.4 | 14 / 35 | 3003 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 49 | 55% |
| shrub.Vapour v159 | 35 | 43% |
| Krabb.sliNk.Garm 0.9u | 25 | 84% |
| com.spp.robocode.MostlyHarmless 010 | 18 | 61% |
| jwst.DAD.DarkAndDarker 1.1 | 13 | 62% |
| SHAM.WOW 1.4 | 8 | 100% |
| m3thos.Eva00 1.1 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 50% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 256 of 350 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 72 | 28% | 102 |
| shrub.Vapour v159 | 68 | 27% | 84 |
| com.spp.robocode.MostlyHarmless 010 | 30 | 12% | 41 |
| Krabb.sliNk.Garm 0.9u | 23 | 9% | 34 |
| jwst.DAD.DarkAndDarker 1.1 | 22 | 9% | 34 |
| zyx.nano.BacillusComma 1.0 | 14 | 5% | 17 |
| m3thos.Eva00 1.1 | 13 | 5% | 19 |
| qualidafial.MajorDick 1.0.1 | 7 | 3% | 7 |
| SHAM.WOW 1.4 | 6 | 2% | 12 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 62.2 | 42 / 350 | 4.40 | 11.9% | 28498 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 17.5% | 180 |
| kc.micro.Figment 1.0 | 1.9 | 15.4% | 73 |
| hadur117.nano.SanaroS2 0.2 | 3.5 | 11.9% | 42 |
| yagami.Tidus 0.11 | 4.1 | 11.2% | 5 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.5% | 28 |
| mc2.enemy.Original 0.9 | 5.6 | 9.6% | 15 |
| dft.Calliope 5.6 | 7.1 | 8.0% | 5 |
| step.nanoPri 1.0 | 8.2 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.4% | 1 |
| rdm.Dueler 0.4x | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 52.9 | 53.0 | 1 / 35 | 2668 |
| 2 | 4 | 54.7 | 57.8 | 4 / 35 | 2398 |
| 3 | 5 | 53.5 | 54.3 | 1 / 35 | 2712 |
| 4 | 3 | 59.4 | 70.5 | 6 / 35 | 2853 |
| 5 | 3 | 57.1 | 61.3 | 6 / 35 | 2781 |
| 6 | 3 | 60.4 | 71.7 | 7 / 35 | 2930 |
| 7 | 3 | 56.8 | 61.6 | 3 / 35 | 3076 |
| 8 | 4 | 55.1 | 58.1 | 1 / 35 | 2949 |
| 9 | 3 | 59.1 | 66.0 | 8 / 35 | 2954 |
| 10 | 3 | 59.6 | 67.9 | 5 / 35 | 3177 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 55 | 16% |
| kc.micro.Figment 1.0 | 38 | 45% |
| mc2.enemy.Original 0.9 | 10 | 60% |
| yagami.Tidus 0.11 | 7 | 86% |
| pedersen.Grishnakh 1.0 | 6 | 50% |
| robar.nano.Assertive_Melee 0.2 | 1 | 0% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 308 of 350 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 108 | 35% | 118 |
| kc.micro.Figment 1.0 | 80 | 26% | 100 |
| yagami.Tidus 0.11 | 38 | 12% | 45 |
| pedersen.Grishnakh 1.0 | 28 | 9% | 28 |
| mc2.enemy.Original 0.9 | 19 | 6% | 24 |
| robar.nano.Assertive_Melee 0.2 | 11 | 4% | 11 |
| dft.Calliope 5.6 | 11 | 4% | 11 |
| step.nanoPri 1.0 | 8 | 3% | 8 |
| rdm.Dueler 0.4x | 5 | 2% | 5 |

## Melee bench: F10

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 78.2 | 91 / 350 | 2.96 | 15.0% | 39691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| DTF.Kludgy 1.2b | 1.6 | 15.4% | 98 |
| hadur117.nano.SanaroS2 0.2 | 1.7 | 15.0% | 91 |
| ne.Chimera 1.2 | 3.5 | 12.9% | 42 |
| ejb.Polaris 1.0.1 | 3.7 | 13.2% | 42 |
| tvv.micro.Antares 1.1.1 | 5.0 | 11.2% | 51 |
| vStar.RAFzilla 2.15 | 5.5 | 10.7% | 15 |
| sam.Samspin 1.0 | 7.7 | 6.1% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.6% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.6% | 5 |
| donjezza.Muncho 1.0 | 9.8 | 4.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 72.4 | 5 / 35 | 3606 |
| 2 | 2 | 63.1 | 77.8 | 10 / 35 | 3991 |
| 3 | 1 | 64.0 | 80.3 | 11 / 35 | 4150 |
| 4 | 3 | 60.9 | 73.0 | 7 / 35 | 3892 |
| 5 | 1 | 63.9 | 79.4 | 11 / 35 | 4177 |
| 6 | 1 | 64.7 | 81.9 | 15 / 35 | 3999 |
| 7 | 1 | 64.2 | 82.5 | 8 / 35 | 4064 |
| 8 | 2 | 62.6 | 76.8 | 7 / 35 | 3883 |
| 9 | 2 | 63.0 | 78.4 | 8 / 35 | 3951 |
| 10 | 1 | 62.8 | 79.7 | 9 / 35 | 3978 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 57 | 30% |
| ejb.Polaris 1.0.1 | 57 | 68% |
| tvv.micro.Antares 1.1.1 | 28 | 11% |
| vStar.RAFzilla 2.15 | 21 | 62% |
| ne.Chimera 1.2 | 19 | 47% |
| donjezza.Muncho 1.0 | 6 | 67% |
| kurios.DOSexe .9b | 5 | 80% |
| sam.Samspin 1.0 | 4 | 50% |

Hadur died in 261 of 350 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 81 | 31% | 94 |
| ne.Chimera 1.2 | 59 | 23% | 70 |
| tvv.micro.Antares 1.1.1 | 46 | 18% | 50 |
| ejb.Polaris 1.0.1 | 39 | 15% | 78 |
| vStar.RAFzilla 2.15 | 15 | 6% | 25 |
| sam.Samspin 1.0 | 9 | 3% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 2% | 5 |
| kurios.DOSexe .9b | 3 | 1% | 9 |
| donjezza.Muncho 1.0 | 3 | 1% | 8 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 67.5 | 68 / 350 | 3.93 | 13.1% | 31806 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.1 | 17.1% | 146 |
| hadur117.nano.SanaroS2 0.2 | 2.4 | 13.1% | 68 |
| cx.mini.Nimrod 0.55 | 2.5 | 12.9% | 48 |
| djc.DynaBot 0.1.1 | 4.1 | 10.8% | 26 |
| rdt199.Warlord 0.73 | 5.7 | 9.6% | 22 |
| br2.MobyDickBot 1.6 | 6.3 | 9.0% | 17 |
| uji.YellohFellah 1.0 | 6.7 | 8.7% | 23 |
| KiraNL.Chupacabra 0.4 | 7.2 | 8.0% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.4 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 9.6 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.5 | 61.0 | 4 / 35 | 3071 |
| 2 | 2 | 62.3 | 78.7 | 6 / 35 | 3562 |
| 3 | 3 | 57.1 | 63.2 | 6 / 35 | 3071 |
| 4 | 2 | 60.1 | 68.9 | 6 / 35 | 3507 |
| 5 | 2 | 59.8 | 72.1 | 8 / 35 | 2856 |
| 6 | 2 | 60.8 | 71.1 | 10 / 35 | 3419 |
| 7 | 3 | 54.8 | 58.4 | 3 / 35 | 2900 |
| 8 | 2 | 59.6 | 67.6 | 7 / 35 | 3327 |
| 9 | 2 | 60.9 | 72.1 | 12 / 35 | 3136 |
| 10 | 3 | 56.5 | 61.6 | 6 / 35 | 2957 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 64 | 38% |
| cx.mini.Nimrod 0.55 | 21 | 57% |
| rdt199.Warlord 0.73 | 15 | 93% |
| uji.YellohFellah 1.0 | 14 | 29% |
| djc.DynaBot 0.1.1 | 11 | 73% |
| br2.MobyDickBot 1.6 | 7 | 71% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 282 of 350 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 100 | 35% | 120 |
| cx.mini.Nimrod 0.55 | 48 | 17% | 58 |
| rdt199.Warlord 0.73 | 31 | 11% | 44 |
| djc.DynaBot 0.1.1 | 31 | 11% | 41 |
| uji.YellohFellah 1.0 | 19 | 7% | 26 |
| stelo.MirrorNano 1.3 | 18 | 6% | 18 |
| KiraNL.Chupacabra 0.4 | 15 | 5% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 12 | 4% | 12 |
| br2.MobyDickBot 1.6 | 8 | 3% | 14 |

## Melee bench: F12

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 67.4 | 64 / 350 | 3.93 | 12.8% | 26917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.7 | 15.0% | 88 |
| nat.PallasHawk 1.0 | 2.1 | 14.4% | 94 |
| darkcanuck.Leon 1.01 | 3.0 | 13.3% | 63 |
| hadur117.nano.SanaroS2 0.2 | 3.2 | 12.8% | 64 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.6% | 25 |
| jrm.Test0 1.0 | 6.3 | 8.2% | 3 |
| cs.sheldor.Talon 1.1 | 7.1 | 7.5% | 3 |
| jp.Perpy 16.0 | 7.8 | 7.3% | 5 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.6% | 9 |
| stuff.Vlad 0.1 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.3 | 68.9 | 4 / 35 | 2718 |
| 2 | 4 | 55.6 | 59.7 | 6 / 35 | 2476 |
| 3 | 4 | 58.9 | 69.2 | 4 / 35 | 2696 |
| 4 | 4 | 59.6 | 71.1 | 6 / 35 | 2699 |
| 5 | 2 | 60.9 | 74.0 | 10 / 35 | 2836 |
| 6 | 3 | 56.8 | 60.3 | 8 / 35 | 2996 |
| 7 | 2 | 59.8 | 72.1 | 8 / 35 | 2657 |
| 8 | 4 | 57.3 | 65.7 | 6 / 35 | 2477 |
| 9 | 1 | 60.4 | 72.7 | 7 / 35 | 3041 |
| 10 | 4 | 54.9 | 60.3 | 5 / 35 | 2321 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 47 | 19% |
| darkcanuck.Leon 1.01 | 46 | 41% |
| bts.wiki.RipCurl 0.9b | 43 | 58% |
| brainfade.melee.Genghis 0.36 | 9 | 56% |
| jp.Perpy 16.0 | 3 | 67% |
| cs.sheldor.Talon 1.1 | 3 | 67% |
| jrm.Test0 1.0 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 0% |

Hadur died in 287 of 350 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 78 | 27% | 93 |
| bts.wiki.RipCurl 0.9b | 59 | 21% | 76 |
| darkcanuck.Leon 1.01 | 50 | 17% | 71 |
| brainfade.melee.Genghis 0.36 | 28 | 10% | 32 |
| jrm.Test0 1.0 | 25 | 9% | 28 |
| jp.Perpy 16.0 | 19 | 7% | 20 |
| cs.sheldor.Talon 1.1 | 15 | 5% | 17 |
| jaybot.bots.Oddball 4.0 | 9 | 3% | 9 |
| stuff.Vlad 0.1 | 4 | 1% | 4 |

## Melee bench: F13

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 71.2 | 52 / 350 | 3.59 | 12.9% | 30202 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.4 | 17.5% | 163 |
| ags.Glacier 0.2.11 | 1.6 | 16.8% | 84 |
| hadur117.nano.SanaroS2 0.2 | 3.6 | 12.9% | 52 |
| shinh.Entangled 0.3 | 4.2 | 12.2% | 33 |
| gh.micro.Gruweltje 0.7 | 4.2 | 12.2% | 16 |
| apc.Colossus2 0.17 | 6.1 | 8.4% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.8% | 2 |
| ayk.WallHugger 1.0 | 8.1 | 5.2% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.9 | 76.5 | 8 / 35 | 3259 |
| 2 | 4 | 57.5 | 62.5 | 3 / 35 | 2927 |
| 3 | 3 | 62.5 | 75.6 | 8 / 35 | 3496 |
| 4 | 4 | 58.3 | 65.1 | 5 / 35 | 3185 |
| 5 | 4 | 59.7 | 74.3 | 5 / 35 | 2637 |
| 6 | 3 | 60.3 | 73.3 | 5 / 35 | 2871 |
| 7 | 3 | 60.9 | 73.3 | 5 / 35 | 3243 |
| 8 | 4 | 58.7 | 69.2 | 4 / 35 | 2784 |
| 9 | 4 | 60.3 | 73.7 | 6 / 35 | 2762 |
| 10 | 4 | 58.8 | 68.9 | 3 / 35 | 3038 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 67 | 42% |
| ags.Glacier 0.2.11 | 50 | 16% |
| shinh.Entangled 0.3 | 18 | 39% |
| gh.micro.Gruweltje 0.7 | 4 | 100% |
| apc.Colossus2 0.17 | 2 | 100% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 298 of 350 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 95 | 32% | 124 |
| ags.Glacier 0.2.11 | 84 | 28% | 92 |
| shinh.Entangled 0.3 | 52 | 17% | 59 |
| gh.micro.Gruweltje 0.7 | 36 | 12% | 41 |
| stelo.Wang 1.0 | 13 | 4% | 15 |
| maribo.FollowFire 1 | 6 | 2% | 6 |
| ayk.WallHugger 1.0 | 6 | 2% | 5 |
| apc.Colossus2 0.17 | 5 | 2% | 7 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 75.0 | 89 / 350 | 3.25 | 14.3% | 33813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.5% | 131 |
| hadur117.nano.SanaroS2 0.2 | 2.3 | 14.3% | 89 |
| catcat20.shape.Theta 0.018 | 3.1 | 13.3% | 87 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 10.1% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 5.2 | 10.0% | 5 |
| co.edu.usb.rc.LidisTron 1.0 | 5.6 | 9.9% | 7 |
| sanyi.mikrobi.Roberto 1.0 | 6.0 | 9.5% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.9% | 14 |
| pa.Improved 1.0 | 9.0 | 5.6% | 2 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 73.7 | 9 / 35 | 3227 |
| 2 | 3 | 59.2 | 67.9 | 5 / 35 | 3239 |
| 3 | 2 | 62.5 | 77.5 | 12 / 35 | 3104 |
| 4 | 2 | 62.5 | 78.4 | 9 / 35 | 3312 |
| 5 | 3 | 59.8 | 67.9 | 8 / 35 | 3516 |
| 6 | 2 | 63.0 | 77.1 | 10 / 35 | 3592 |
| 7 | 2 | 62.2 | 75.6 | 10 / 35 | 3375 |
| 8 | 2 | 63.1 | 79.7 | 11 / 35 | 3277 |
| 9 | 2 | 64.8 | 80.3 | 10 / 35 | 4041 |
| 10 | 3 | 60.5 | 72.4 | 5 / 35 | 3130 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 87 | 48% |
| catcat20.shape.Theta 0.018 | 44 | 41% |
| sanyi.mikrobi.Roberto 1.0 | 14 | 64% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 63% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 86% |
| co.edu.usb.rc.LidisTron 1.0 | 7 | 43% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 83% |
| pa.Improved 1.0 | 2 | 50% |

Hadur died in 261 of 350 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 118 | 45% | 160 |
| catcat20.shape.Theta 0.018 | 55 | 21% | 71 |
| dmh.robocode.robot.RedDwarf 0.4 | 26 | 10% | 32 |
| sanyi.mikrobi.Roberto 1.0 | 19 | 7% | 32 |
| Lo_Ian.Gandalf_V4 4.0 | 16 | 6% | 20 |
| co.edu.usb.rc.LidisTron 1.0 | 15 | 6% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 4% | 17 |
| pa.Improved 1.0 | 2 | 1% | 3 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 64.3 | 50 / 350 | 4.21 | 12.7% | 34812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.5 | 14.6% | 79 |
| emp.Yngwie 1.11 | 2.6 | 13.8% | 100 |
| mld.DustBunny 3.8 | 3.1 | 13.6% | 41 |
| hadur117.nano.SanaroS2 0.2 | 3.5 | 12.7% | 50 |
| cb.nano.Insomnia 1.0 | 5.0 | 11.2% | 26 |
| kawigi.robot.Girl 1.2 | 5.3 | 10.7% | 47 |
| Grystrion.TrackerWO 1.0 | 7.2 | 6.9% | 2 |
| lambdaxy.TBot 0.1 | 8.1 | 6.6% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.4% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.8 | 63.2 | 4 / 35 | 3495 |
| 2 | 5 | 57.2 | 63.2 | 5 / 35 | 3091 |
| 3 | 2 | 58.3 | 65.7 | 6 / 35 | 3338 |
| 4 | 3 | 59.6 | 65.4 | 6 / 35 | 3853 |
| 5 | 3 | 59.9 | 66.0 | 6 / 35 | 3786 |
| 6 | 1 | 60.9 | 70.2 | 8 / 35 | 3797 |
| 7 | 4 | 56.4 | 60.0 | 5 / 35 | 3134 |
| 8 | 5 | 56.7 | 61.6 | 3 / 35 | 3267 |
| 9 | 5 | 55.4 | 57.5 | 1 / 35 | 3176 |
| 10 | 3 | 61.2 | 70.2 | 6 / 35 | 3875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 41 | 51% |
| kawigi.micro.Shiz 1.1 | 28 | 29% |
| cb.nano.Insomnia 1.0 | 14 | 43% |
| kawigi.robot.Girl 1.2 | 12 | 83% |
| mld.DustBunny 3.8 | 10 | 20% |
| divineomega.TrialBot 0.003 | 2 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 300 of 350 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 67 | 22% | 91 |
| kawigi.micro.Shiz 1.1 | 66 | 22% | 74 |
| mld.DustBunny 3.8 | 63 | 21% | 71 |
| cb.nano.Insomnia 1.0 | 44 | 15% | 37 |
| kawigi.robot.Girl 1.2 | 23 | 8% | 33 |
| Grystrion.TrackerWO 1.0 | 14 | 5% | 15 |
| lambdaxy.TBot 0.1 | 14 | 5% | 14 |
| divineomega.TrialBot 0.003 | 9 | 3% | 15 |

## Melee bench: F16

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 63.1 | 33 / 350 | 4.32 | 12.7% | 37107 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.8% | 155 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.0 | 14.8% | 21 |
| hadur117.nano.SanaroS2 0.2 | 3.2 | 12.7% | 33 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 11.5% | 90 |
| tvv.nano.Polaris 1.2 | 5.3 | 10.0% | 28 |
| bvh.fnr.Fenrir 0.36l | 5.8 | 9.7% | 4 |
| stelo.IntrinsicVolatility 1.4 | 6.6 | 8.1% | 10 |
| divineomega.DivineBot 1.9.4.5 | 8.4 | 5.6% | 7 |
| asd.Cthulhu 1.3 | 9.2 | 4.9% | 0 |
| repositorio.NanoStep 1.0 | 9.4 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.6 | 60.6 | 2 / 35 | 3513 |
| 2 | 3 | 59.5 | 65.1 | 6 / 35 | 3841 |
| 3 | 3 | 58.7 | 64.4 | 3 / 35 | 3740 |
| 4 | 3 | 58.0 | 63.2 | 2 / 35 | 3534 |
| 5 | 4 | 56.3 | 58.1 | 2 / 35 | 3459 |
| 6 | 3 | 59.5 | 65.4 | 1 / 35 | 3954 |
| 7 | 3 | 57.9 | 61.6 | 3 / 35 | 3818 |
| 8 | 3 | 61.2 | 69.8 | 5 / 35 | 3848 |
| 9 | 3 | 61.7 | 68.6 | 7 / 35 | 4108 |
| 10 | 4 | 55.2 | 54.6 | 2 / 35 | 3292 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 73 | 22% |
| techdude.forest.FlamingForest 1.1 | 16 | 31% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 9 | 67% |
| divineomega.DivineBot 1.9.4.5 | 6 | 50% |
| tvv.nano.Polaris 1.2 | 6 | 0% |
| bvh.fnr.Fenrir 0.36l | 4 | 75% |
| stelo.IntrinsicVolatility 1.4 | 2 | 0% |
| repositorio.NanoStep 1.0 | 1 | 0% |

Hadur died in 317 of 350 rounds, at a mean tick of 1081. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 143 | 45% | 159 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 53 | 17% | 55 |
| techdude.forest.FlamingForest 1.1 | 35 | 11% | 41 |
| bvh.fnr.Fenrir 0.36l | 34 | 11% | 37 |
| stelo.IntrinsicVolatility 1.4 | 17 | 5% | 17 |
| tvv.nano.Polaris 1.2 | 16 | 5% | 16 |
| divineomega.DivineBot 1.9.4.5 | 9 | 3% | 14 |
| asd.Cthulhu 1.3 | 6 | 2% | 6 |
| repositorio.NanoStep 1.0 | 4 | 1% | 5 |

## Melee bench: F17

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 68.9 | 68 / 350 | 3.80 | 13.5% | 35387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.7 | 14.4% | 72 |
| hadur117.nano.SanaroS2 0.2 | 2.6 | 13.5% | 68 |
| oog.melee.Mercutio 1.0 | 2.9 | 13.5% | 78 |
| cx.BlestPain 1.41 | 3.1 | 13.3% | 71 |
| nic.Nicator 2.4 | 5.1 | 11.6% | 26 |
| ahf.NanoAndrew .4 | 5.9 | 10.7% | 27 |
| maribo.melee.BMV 0.1 | 6.7 | 9.1% | 7 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.6% | 1 |
| tex.Longbot 0.4 | 8.7 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.0 | 68.6 | 5 / 35 | 3703 |
| 2 | 4 | 59.0 | 65.1 | 2 / 35 | 3634 |
| 3 | 3 | 59.0 | 65.1 | 9 / 35 | 3034 |
| 4 | 3 | 61.1 | 69.8 | 6 / 35 | 3819 |
| 5 | 4 | 59.9 | 67.9 | 9 / 35 | 3163 |
| 6 | 1 | 62.1 | 73.3 | 10 / 35 | 3553 |
| 7 | 2 | 62.3 | 74.3 | 8 / 35 | 3674 |
| 8 | 2 | 60.1 | 69.2 | 8 / 35 | 3433 |
| 9 | 4 | 59.1 | 65.4 | 5 / 35 | 3298 |
| 10 | 1 | 61.3 | 70.2 | 6 / 35 | 4076 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 47 | 34% |
| oog.melee.Mercutio 1.0 | 36 | 44% |
| cx.BlestPain 1.41 | 22 | 82% |
| nic.Nicator 2.4 | 16 | 56% |
| ahf.NanoAndrew .4 | 15 | 47% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 282 of 350 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 71 | 25% | 85 |
| cx.BlestPain 1.41 | 52 | 18% | 71 |
| oog.melee.Mercutio 1.0 | 48 | 17% | 64 |
| ahf.NanoAndrew .4 | 44 | 16% | 51 |
| nic.Nicator 2.4 | 39 | 14% | 49 |
| maribo.melee.BMV 0.1 | 16 | 6% | 17 |
| tex.Longbot 0.4 | 6 | 2% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 4 | 1% | 5 |
| goblin.Bender 2.4 | 2 | 1% | 2 |

## Melee bench: F18

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 66.3 | 72 / 350 | 4.03 | 13.0% | 32241 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 1.3 | 14.2% | 85 |
| agd.Mooserwirt2 2.7 | 2.4 | 13.3% | 76 |
| hadur117.nano.SanaroS2 0.2 | 2.7 | 13.0% | 72 |
| uji.DBH 1.1 | 4.1 | 11.5% | 38 |
| ratosh.Nobo 0.21 | 4.9 | 10.8% | 14 |
| spinnercat.Robovirus 2.718 | 6.2 | 9.5% | 15 |
| sigterm.Sigterm 1.0 | 6.8 | 8.8% | 25 |
| kawigi.mini.Fhqwhgads 1.1 | 7.9 | 7.5% | 8 |
| stelo.WangRobot 1.0 | 8.8 | 6.2% | 17 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.9 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.1 | 65.4 | 8 / 35 | 3604 |
| 2 | 3 | 57.7 | 65.1 | 6 / 35 | 3028 |
| 3 | 2 | 58.8 | 67.3 | 8 / 35 | 3283 |
| 4 | 4 | 55.6 | 61.0 | 7 / 35 | 2890 |
| 5 | 3 | 56.5 | 61.6 | 7 / 35 | 3120 |
| 6 | 4 | 57.5 | 63.5 | 7 / 35 | 3233 |
| 7 | 2 | 58.2 | 66.0 | 7 / 35 | 3086 |
| 8 | 3 | 58.0 | 65.4 | 7 / 35 | 3242 |
| 9 | 1 | 62.4 | 77.5 | 7 / 35 | 3542 |
| 10 | 2 | 59.8 | 70.2 | 8 / 35 | 3213 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 37 | 51% |
| agd.Mooserwirt2 2.7 | 27 | 59% |
| uji.DBH 1.1 | 22 | 59% |
| spinnercat.Robovirus 2.718 | 10 | 80% |
| ratosh.Nobo 0.21 | 8 | 75% |
| sigterm.Sigterm 1.0 | 8 | 88% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 40% |
| stelo.WangRobot 1.0 | 4 | 0% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 278 of 350 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 63 | 23% | 84 |
| agd.Mooserwirt2 2.7 | 54 | 19% | 72 |
| uji.DBH 1.1 | 40 | 14% | 47 |
| ratosh.Nobo 0.21 | 32 | 12% | 39 |
| spinnercat.Robovirus 2.718 | 25 | 9% | 32 |
| sigterm.Sigterm 1.0 | 23 | 8% | 29 |
| kawigi.mini.Fhqwhgads 1.1 | 21 | 8% | 24 |
| stelo.WangRobot 1.0 | 13 | 5% | 15 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 7 | 3% | 8 |

## Melee bench: F19

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 79.5 | 105 / 350 | 2.85 | 15.6% | 38389 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 1.8 | 16.3% | 90 |
| mld.Infinity 2.2 | 1.9 | 15.9% | 119 |
| hadur117.nano.SanaroS2 0.2 | 2.3 | 15.6% | 105 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.1% | 5 |
| erdnis.Rover 0.3 | 4.7 | 11.1% | 10 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.9% | 10 |
| mbh.Mbh 0.1 | 7.3 | 7.4% | 1 |
| pac.ABC 2.1 | 7.8 | 6.9% | 9 |
| pbg.R2D2 1.0 | 8.9 | 5.9% | 1 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.7 | 82.2 | 11 / 35 | 3460 |
| 2 | 3 | 65.0 | 79.4 | 9 / 35 | 3915 |
| 3 | 3 | 64.0 | 75.9 | 10 / 35 | 3721 |
| 4 | 3 | 62.7 | 70.2 | 11 / 35 | 3821 |
| 5 | 2 | 64.1 | 76.8 | 11 / 35 | 3779 |
| 6 | 2 | 65.3 | 81.0 | 13 / 35 | 3751 |
| 7 | 1 | 65.7 | 83.8 | 8 / 35 | 4021 |
| 8 | 1 | 65.8 | 82.5 | 12 / 35 | 4221 |
| 9 | 3 | 65.5 | 82.5 | 9 / 35 | 3827 |
| 10 | 2 | 64.9 | 80.3 | 11 / 35 | 3873 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 87 | 51% |
| davidalves.net.DuelistMiniMelee 1.2 | 86 | 40% |
| krillr.mini.JointStrike 2.0.0 | 11 | 73% |
| erdnis.Rover 0.3 | 7 | 86% |
| pac.ABC 2.1 | 7 | 57% |
| patson.PatsonTestBot 1.0 | 7 | 29% |
| mbh.Mbh 0.1 | 5 | 80% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 246 of 350 rounds, at a mean tick of 1009. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 102 | 41% | 170 |
| mld.Infinity 2.2 | 66 | 27% | 40 |
| krillr.mini.JointStrike 2.0.0 | 20 | 8% | 37 |
| erdnis.Rover 0.3 | 20 | 8% | 29 |
| patson.PatsonTestBot 1.0 | 19 | 8% | 29 |
| pac.ABC 2.1 | 7 | 3% | 13 |
| mbh.Mbh 0.1 | 6 | 2% | 16 |
| pbg.R2D2 1.0 | 6 | 2% | 12 |

## Melee bench: F20

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 71.9 | 76 / 350 | 3.53 | 13.9% | 34284 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.7% | 145 |
| hadur117.nano.SanaroS2 0.2 | 2.0 | 13.9% | 76 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.1% | 26 |
| fwb.Nine 1.0.1 | 4.0 | 11.3% | 43 |
| catcat20.Rabbit 0.001 | 5.2 | 10.0% | 29 |
| djdjdj.NanoSkunk10 1.0 | 5.9 | 9.0% | 7 |
| m3thos.mini.Eva01 0.5.5 | 7.1 | 8.3% | 5 |
| bayen.nut.Squirrel 1.615 | 7.6 | 7.7% | 18 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.2 | 67.9 | 8 / 35 | 3243 |
| 2 | 2 | 62.1 | 73.0 | 10 / 35 | 3668 |
| 3 | 2 | 60.2 | 69.5 | 7 / 35 | 3597 |
| 4 | 2 | 59.7 | 67.3 | 10 / 35 | 3353 |
| 5 | 2 | 60.6 | 72.4 | 4 / 35 | 3537 |
| 6 | 2 | 61.2 | 72.7 | 8 / 35 | 3205 |
| 7 | 2 | 63.3 | 78.1 | 11 / 35 | 3763 |
| 8 | 2 | 58.7 | 70.2 | 3 / 35 | 3075 |
| 9 | 2 | 61.9 | 74.0 | 8 / 35 | 3545 |
| 10 | 2 | 60.8 | 74.0 | 7 / 35 | 3298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 80 | 45% |
| catcat20.Rabbit 0.001 | 20 | 70% |
| fwb.Nine 1.0.1 | 15 | 47% |
| nz.jdc.nano.GridFu 1.0 | 10 | 40% |
| djdjdj.NanoSkunk10 1.0 | 6 | 67% |
| bayen.nut.Squirrel 1.615 | 6 | 83% |
| m3thos.mini.Eva01 0.5.5 | 3 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 67% |

Hadur died in 274 of 350 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 129 | 47% | 152 |
| fwb.Nine 1.0.1 | 37 | 14% | 38 |
| nz.jdc.nano.GridFu 1.0 | 36 | 13% | 45 |
| catcat20.Rabbit 0.001 | 23 | 8% | 44 |
| bayen.nut.Squirrel 1.615 | 13 | 5% | 21 |
| ntc.ControlledChaos 1.1.4 | 12 | 4% | 14 |
| djdjdj.NanoSkunk10 1.0 | 11 | 4% | 18 |
| m3thos.mini.Eva01 0.5.5 | 10 | 4% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 1% | 5 |

## Melee bench: F21

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 80.7 | 121 / 350 | 2.74 | 16.5% | 44020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBot v4.6.16 | 1.1 | 18.0% | 173 |
| hadur117.nano.SanaroS2 0.2 | 1.9 | 16.5% | 121 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.3% | 22 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 18 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.4% | 0 |
| eld.Hmm 1.0 | 5.5 | 8.5% | 17 |
| fire219.CatBot 1.0 | 7.5 | 6.5% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.3% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.9 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 83.5 | 14 / 35 | 4925 |
| 2 | 2 | 65.6 | 81.3 | 10 / 35 | 4457 |
| 3 | 2 | 64.2 | 73.3 | 8 / 35 | 4837 |
| 4 | 2 | 65.2 | 79.4 | 12 / 35 | 4381 |
| 5 | 1 | 67.2 | 85.4 | 18 / 35 | 4551 |
| 6 | 2 | 65.1 | 80.3 | 12 / 35 | 4382 |
| 7 | 2 | 64.4 | 79.4 | 9 / 35 | 4032 |
| 8 | 2 | 64.6 | 78.1 | 12 / 35 | 3953 |
| 9 | 2 | 66.5 | 85.7 | 15 / 35 | 4169 |
| 10 | 2 | 66.0 | 80.6 | 11 / 35 | 4333 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 147 | 48% |
| dummy.mini.Scimitar 1.01 | 30 | 100% |
| cf.RiO.RiOx 4.2.1 | 18 | 56% |
| eld.Hmm 1.0 | 9 | 78% |
| oa.weak.BotherBot 0.1 | 2 | 100% |
| PSW.Relentless 0.1 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 229 of 350 rounds, at a mean tick of 1134. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 123 | 54% | 179 |
| dummy.mini.Scimitar 1.01 | 36 | 16% | 76 |
| cf.RiO.RiOx 4.2.1 | 36 | 16% | 44 |
| oa.weak.BotherBot 0.1 | 8 | 3% | 10 |
| fire219.CatBot 1.0 | 8 | 3% | 7 |
| eld.Hmm 1.0 | 7 | 3% | 20 |
| el.JumpShoot 0.2 | 6 | 3% | 7 |
| PSW.Relentless 0.1 | 3 | 1% | 5 |
| arthord.MannyPacquiao Beta | 2 | 1% | 2 |

## Melee bench: F23

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 81.9 | 95 / 350 | 2.63 | 16.1% | 40102 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.6% | 158 |
| hadur117.nano.SanaroS2 0.2 | 2.0 | 16.1% | 95 |
| cre.Karolos 0.32 | 3.0 | 14.1% | 50 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 12.2% | 34 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 9.1% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.1 | 8.8% | 2 |
| sample.Walls 1.0 | 7.0 | 8.4% | 2 |
| cw.megas.Blade 0.8 | 7.1 | 8.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 79.4 | 6 / 35 | 3704 |
| 2 | 2 | 65.2 | 80.0 | 8 / 35 | 3817 |
| 3 | 2 | 67.3 | 86.0 | 10 / 35 | 4256 |
| 4 | 2 | 66.4 | 83.8 | 11 / 35 | 3806 |
| 5 | 2 | 65.7 | 79.0 | 12 / 35 | 4173 |
| 6 | 2 | 66.2 | 80.3 | 9 / 35 | 4173 |
| 7 | 2 | 63.4 | 73.0 | 7 / 35 | 3802 |
| 8 | 2 | 66.1 | 84.1 | 11 / 35 | 3850 |
| 9 | 2 | 67.7 | 88.3 | 11 / 35 | 4463 |
| 10 | 2 | 66.7 | 84.8 | 10 / 35 | 4058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 116 | 34% |
| stelo.AreaTargetingBot 1.1 | 38 | 50% |
| cre.Karolos 0.32 | 35 | 43% |
| stelo.RamTrackSurfer 1.2 | 11 | 45% |
| sample.Walls 1.0 | 10 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 75% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 255 of 350 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 121 | 47% | 167 |
| cre.Karolos 0.32 | 55 | 22% | 71 |
| stelo.AreaTargetingBot 1.1 | 51 | 20% | 61 |
| stelo.RamTrackSurfer 1.2 | 15 | 6% | 26 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 2% | 11 |
| cw.megas.Blade 0.8 | 4 | 2% | 5 |
| sample.Walls 1.0 | 3 | 1% | 5 |

## Melee bench: F24

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.9 | 59.5 | 48 / 350 | 4.65 | 11.3% | 26043 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.1 | 15.3% | 101 |
| florent.XSeries.X2 0.12 | 2.5 | 13.3% | 60 |
| davidalves.Phoenix 0.54 | 3.1 | 13.1% | 79 |
| pedersen.Ugluk 1.1.1 | 3.8 | 12.3% | 35 |
| hadur117.nano.SanaroS2 0.2 | 4.7 | 11.3% | 48 |
| oog.melee.Corsair 1.0 | 5.9 | 9.4% | 10 |
| stelo.SoJNanoMelee 1.1 | 6.9 | 8.8% | 16 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.2% | 1 |
| as.FrankTheTank 1.3 | 9.0 | 5.6% | 1 |
| evd.X1 0.01 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.9 | 59.7 | 5 / 35 | 2570 |
| 2 | 5 | 55.1 | 60.3 | 4 / 35 | 2495 |
| 3 | 5 | 55.6 | 61.0 | 3 / 35 | 2836 |
| 4 | 5 | 54.5 | 58.1 | 4 / 35 | 2619 |
| 5 | 3 | 58.5 | 67.6 | 8 / 35 | 2708 |
| 6 | 4 | 57.1 | 64.8 | 9 / 35 | 2473 |
| 7 | 5 | 56.1 | 62.2 | 4 / 35 | 2755 |
| 8 | 5 | 53.9 | 56.5 | 4 / 35 | 2717 |
| 9 | 5 | 53.4 | 53.7 | 5 / 35 | 2766 |
| 10 | 6 | 50.1 | 50.8 | 2 / 35 | 2104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 30 | 53% |
| davidalves.Phoenix 0.54 | 25 | 40% |
| florent.XSeries.X2 0.12 | 14 | 43% |
| pedersen.Ugluk 1.1.1 | 8 | 88% |
| stelo.SoJNanoMelee 1.1 | 6 | 83% |
| oog.melee.Corsair 1.0 | 3 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 0% |

Hadur died in 303 of 350 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 61 | 20% | 75 |
| davidalves.Phoenix 0.54 | 57 | 19% | 65 |
| florent.XSeries.X2 0.12 | 50 | 17% | 58 |
| pedersen.Ugluk 1.1.1 | 44 | 15% | 50 |
| oog.melee.Corsair 1.0 | 28 | 9% | 34 |
| stelo.SoJNanoMelee 1.1 | 24 | 8% | 26 |
| evd.X1 0.01 | 17 | 6% | 17 |
| lunchie.Lunchbox 0.93 | 13 | 4% | 15 |
| as.FrankTheTank 1.3 | 9 | 3% | 10 |

## Melee bench: F25

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 69.5 | 78 / 350 | 3.75 | 13.5% | 29892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.6 | 14.4% | 78 |
| hadur117.nano.SanaroS2 0.2 | 2.1 | 13.5% | 78 |
| voidious.micro.BlitzBat 1.05 | 2.9 | 13.2% | 59 |
| jdw.Hurricane 1.4 | 3.8 | 12.0% | 49 |
| gre.svman4.Morfeas 1.4.1 | 4.8 | 10.9% | 36 |
| ds.Oo 2.2 | 6.2 | 9.4% | 22 |
| gjr.Cephalosporin 0.1 | 6.8 | 8.4% | 21 |
| awesomeness.Elite 1.0 | 8.2 | 7.5% | 6 |
| adt.Ar2 1.1 | 8.6 | 6.5% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 72.7 | 10 / 35 | 3462 |
| 2 | 2 | 59.0 | 67.6 | 7 / 35 | 3066 |
| 3 | 2 | 60.7 | 73.3 | 6 / 35 | 3043 |
| 4 | 4 | 57.5 | 64.1 | 9 / 35 | 2582 |
| 5 | 2 | 61.6 | 74.0 | 8 / 35 | 3208 |
| 6 | 2 | 58.9 | 68.3 | 9 / 35 | 2795 |
| 7 | 2 | 62.2 | 76.2 | 9 / 35 | 3087 |
| 8 | 1 | 58.3 | 66.3 | 9 / 35 | 2868 |
| 9 | 2 | 57.6 | 67.3 | 5 / 35 | 2684 |
| 10 | 3 | 58.0 | 64.8 | 6 / 35 | 3097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 49 | 41% |
| jdw.Hurricane 1.4 | 36 | 69% |
| voidious.micro.BlitzBat 1.05 | 34 | 32% |
| gjr.Cephalosporin 0.1 | 15 | 67% |
| gre.svman4.Morfeas 1.4.1 | 11 | 45% |
| awesomeness.Elite 1.0 | 7 | 57% |
| ds.Oo 2.2 | 7 | 29% |
| adt.Ar2 1.1 | 1 | 100% |

Hadur died in 272 of 350 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 63 | 23% | 84 |
| voidious.micro.BlitzBat 1.05 | 59 | 22% | 75 |
| jdw.Hurricane 1.4 | 52 | 19% | 71 |
| gre.svman4.Morfeas 1.4.1 | 27 | 10% | 29 |
| ds.Oo 2.2 | 26 | 10% | 31 |
| gjr.Cephalosporin 0.1 | 20 | 7% | 30 |
| awesomeness.Elite 1.0 | 14 | 5% | 17 |
| adt.Ar2 1.1 | 8 | 3% | 9 |
| amk.ChumbaMini 0.2 | 3 | 1% | 3 |

## Melee bench: F26

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 70.6 | 59 / 350 | 3.64 | 13.4% | 35876 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.3% | 116 |
| hadur117.nano.SanaroS2 0.2 | 2.6 | 13.4% | 59 |
| shu.nitro.LENIN .T34 | 3.2 | 13.0% | 80 |
| lrem.Spectre 0.4.4 | 3.3 | 12.9% | 54 |
| gh.mini.GrubbmOne 1.0 | 5.4 | 10.9% | 23 |
| js.PinBall 1.6 | 5.7 | 10.8% | 13 |
| jaybot.adv.bots.JayBot 2.0 | 6.9 | 9.1% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 7.9 | 6.9% | 6 |
| sample.SpinBot 1.0 | 9.0 | 5.1% | 3 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 70.5 | 8 / 35 | 3341 |
| 2 | 2 | 61.9 | 72.1 | 9 / 35 | 3835 |
| 3 | 2 | 60.9 | 71.7 | 6 / 35 | 3669 |
| 4 | 4 | 58.3 | 65.7 | 4 / 35 | 3249 |
| 5 | 2 | 60.9 | 72.1 | 3 / 35 | 3559 |
| 6 | 2 | 61.7 | 72.1 | 9 / 35 | 3989 |
| 7 | 2 | 61.5 | 72.7 | 5 / 35 | 3790 |
| 8 | 2 | 61.1 | 71.7 | 4 / 35 | 3913 |
| 9 | 3 | 60.2 | 68.3 | 8 / 35 | 3453 |
| 10 | 4 | 59.2 | 69.5 | 3 / 35 | 3078 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 42 | 31% |
| lrem.Spectre 0.4.4 | 41 | 51% |
| shu.nitro.LENIN .T34 | 31 | 32% |
| gh.mini.GrubbmOne 1.0 | 10 | 50% |
| js.PinBall 1.6 | 6 | 50% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 67% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 100% |
| sample.SpinBot 1.0 | 3 | 33% |

Hadur died in 293 of 350 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 91 | 31% | 108 |
| lrem.Spectre 0.4.4 | 49 | 17% | 61 |
| shu.nitro.LENIN .T34 | 48 | 16% | 62 |
| js.PinBall 1.6 | 34 | 12% | 39 |
| gh.mini.GrubbmOne 1.0 | 32 | 11% | 37 |
| jaybot.adv.bots.JayBot 2.0 | 20 | 7% | 22 |
| fullsail.LaxativeTeaTwo 1.0 | 11 | 4% | 13 |
| sample.SpinBot 1.0 | 7 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 71.0 | 93 / 350 | 3.61 | 13.5% | 28965 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.1 | 15.8% | 126 |
| hadur117.nano.SanaroS2 0.2 | 2.4 | 13.5% | 93 |
| wee.Gem 1.8.4 | 3.6 | 12.1% | 59 |
| sheldor.melee.nano.TestMelee 0.1 | 3.8 | 11.7% | 34 |
| EH.Eagle 1.0.6 | 4.9 | 10.5% | 16 |
| joe.ADinosaur 1.0 | 6.3 | 9.1% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 7.1 | 8.2% | 9 |
| throxbot.ThroxBot 0.1 | 7.8 | 7.6% | 6 |
| caimano.Furia_Ceca 0.22 | 8.4 | 6.6% | 2 |
| cs.Grudge 1.0 | 9.6 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.5 | 68.9 | 6 / 35 | 2870 |
| 2 | 5 | 55.8 | 47.6 | 7 / 35 | 4308 |
| 3 | 4 | 57.4 | 67.9 | 5 / 35 | 2444 |
| 4 | 2 | 58.9 | 69.8 | 9 / 35 | 2719 |
| 5 | 1 | 60.8 | 77.1 | 11 / 35 | 2707 |
| 6 | 2 | 60.1 | 72.4 | 11 / 35 | 2713 |
| 7 | 2 | 61.0 | 76.2 | 14 / 35 | 2525 |
| 8 | 2 | 62.2 | 78.1 | 10 / 35 | 3086 |
| 9 | 2 | 61.7 | 78.1 | 10 / 35 | 2764 |
| 10 | 2 | 60.2 | 73.3 | 10 / 35 | 2829 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 86 | 62% |
| wee.Gem 1.8.4 | 31 | 45% |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 59% |
| EH.Eagle 1.0.6 | 11 | 91% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 50% |
| throxbot.ThroxBot 0.1 | 5 | 20% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 257 of 350 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 86 | 33% | 134 |
| sheldor.melee.nano.TestMelee 0.1 | 44 | 17% | 56 |
| wee.Gem 1.8.4 | 41 | 16% | 58 |
| joe.ADinosaur 1.0 | 29 | 11% | 31 |
| EH.Eagle 1.0.6 | 17 | 7% | 25 |
| throxbot.ThroxBot 0.1 | 13 | 5% | 14 |
| techdude.kombat.FlamingKombat 1.5 | 11 | 4% | 16 |
| caimano.Furia_Ceca 0.22 | 10 | 4% | 10 |
| cs.Grudge 1.0 | 6 | 2% | 6 |

## Melee bench: F28

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 78.3 | 96 / 350 | 2.96 | 15.0% | 33147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.2 | 16.2% | 114 |
| hadur117.nano.SanaroS2 0.2 | 1.8 | 15.0% | 96 |
| uji.Antique 1.0 | 3.1 | 12.8% | 62 |
| qohnil.blot.BlotBot 3.61 | 3.9 | 11.9% | 44 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.1% | 11 |
| ahr.ice.Ice 1.0.2 | 6.6 | 8.1% | 15 |
| amk.ChumbaWumba 0.3 | 6.8 | 8.0% | 6 |
| matt.advanced.Katana 1.0 | 8.3 | 6.6% | 3 |
| stelo.PianistNano 1.2 | 8.6 | 6.0% | 0 |
| stelo.Lifestealer 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 75.6 | 8 / 35 | 3227 |
| 2 | 1 | 64.5 | 85.7 | 11 / 35 | 3407 |
| 3 | 2 | 61.4 | 75.6 | 8 / 35 | 3212 |
| 4 | 2 | 62.6 | 76.5 | 9 / 35 | 3529 |
| 5 | 2 | 61.9 | 75.9 | 10 / 35 | 3164 |
| 6 | 1 | 63.3 | 81.0 | 7 / 35 | 3496 |
| 7 | 2 | 61.5 | 75.2 | 10 / 35 | 3068 |
| 8 | 2 | 62.7 | 77.8 | 7 / 35 | 3672 |
| 9 | 2 | 63.5 | 81.3 | 14 / 35 | 2960 |
| 10 | 2 | 62.9 | 78.1 | 12 / 35 | 3412 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 108 | 44% |
| uji.Antique 1.0 | 36 | 64% |
| qohnil.blot.BlotBot 3.61 | 29 | 31% |
| pfvicm.Sobieski 7.2.3b | 9 | 56% |
| ahr.ice.Ice 1.0.2 | 9 | 22% |
| amk.ChumbaWumba 0.3 | 9 | 89% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 256 of 350 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 108 | 42% | 147 |
| uji.Antique 1.0 | 40 | 16% | 69 |
| pfvicm.Sobieski 7.2.3b | 31 | 12% | 35 |
| qohnil.blot.BlotBot 3.61 | 29 | 11% | 39 |
| amk.ChumbaWumba 0.3 | 18 | 7% | 22 |
| ahr.ice.Ice 1.0.2 | 17 | 7% | 21 |
| stelo.PianistNano 1.2 | 7 | 3% | 7 |
| stelo.Lifestealer 1.0 | 3 | 1% | 4 |
| matt.advanced.Katana 1.0 | 2 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 65.5 | 59 / 350 | 4.11 | 13.1% | 33175 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.4 | 16.4% | 125 |
| zyx.mega.YersiniaPestis 3.1 | 1.6 | 15.9% | 103 |
| myl.micro.Troodon 1.10 | 3.5 | 12.6% | 19 |
| hadur117.nano.SanaroS2 0.2 | 3.7 | 13.1% | 59 |
| jok.PheonixM 0.1.2 | 4.8 | 11.2% | 19 |
| ph.melee.ArcherME 0.3 | 6.3 | 8.4% | 2 |
| DBall.Anarchy 0.1 | 6.7 | 7.6% | 19 |
| fullsail.TimbotNoPrediction 1.0 | 8.1 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.4 | 4.4% | 3 |
| jangs.ns51 1.0 | 9.5 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.5 | 57.8 | 6 / 35 | 3060 |
| 2 | 4 | 60.7 | 68.6 | 7 / 35 | 3348 |
| 3 | 3 | 61.0 | 69.2 | 8 / 35 | 3153 |
| 4 | 3 | 60.3 | 66.3 | 5 / 35 | 3256 |
| 5 | 4 | 56.7 | 60.3 | 5 / 35 | 2917 |
| 6 | 3 | 62.3 | 71.1 | 8 / 35 | 3765 |
| 7 | 4 | 59.9 | 65.4 | 3 / 35 | 3439 |
| 8 | 3 | 60.7 | 67.0 | 8 / 35 | 3660 |
| 9 | 4 | 60.0 | 66.0 | 4 / 35 | 3415 |
| 10 | 4 | 58.5 | 62.9 | 5 / 35 | 3162 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 50 | 10% |
| zyx.mega.YersiniaPestis 3.1 | 42 | 60% |
| myl.micro.Troodon 1.10 | 22 | 77% |
| jok.PheonixM 0.1.2 | 11 | 82% |
| DBall.Anarchy 0.1 | 7 | 43% |
| jangs.ns51 1.0 | 2 | 0% |
| ph.melee.ArcherME 0.3 | 1 | 0% |

Hadur died in 294 of 350 rounds, at a mean tick of 982. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 115 | 39% | 123 |
| zyx.mega.YersiniaPestis 3.1 | 60 | 20% | 82 |
| myl.micro.Troodon 1.10 | 52 | 18% | 70 |
| jok.PheonixM 0.1.2 | 28 | 10% | 34 |
| ph.melee.ArcherME 0.3 | 16 | 5% | 17 |
| DBall.Anarchy 0.1 | 11 | 4% | 14 |
| jangs.ns51 1.0 | 7 | 2% | 7 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F30

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.0 | 53.7 | 18 / 350 | 5.17 | 10.3% | 27960 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.6 | 14.5% | 96 |
| oog.melee.Capulet 1.2 | 2.3 | 13.8% | 70 |
| stelo.PastFuture 2.3.2 | 2.7 | 13.8% | 50 |
| darkcanuck.B26354 1.06 | 3.4 | 13.1% | 84 |
| hadur117.nano.SanaroS2 0.2 | 5.1 | 10.3% | 18 |
| intruder.PrairieWolf 2.61 | 6.1 | 9.1% | 18 |
| ntc.Opposite 1.5 | 7.4 | 8.2% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.6% | 7 |
| tripphippy.Alice 1.1 | 8.6 | 7.0% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 51.7 | 52.7 | 1 / 35 | 2588 |
| 2 | 5 | 52.0 | 51.4 | 0 / 35 | 2717 |
| 3 | 5 | 52.7 | 51.4 | 1 / 35 | 2997 |
| 4 | 5 | 56.8 | 66.0 | 2 / 35 | 2837 |
| 5 | 5 | 50.2 | 48.9 | 0 / 35 | 2425 |
| 6 | 5 | 53.7 | 53.3 | 2 / 35 | 2890 |
| 7 | 5 | 50.7 | 48.6 | 3 / 35 | 2765 |
| 8 | 5 | 53.4 | 54.3 | 3 / 35 | 2763 |
| 9 | 6 | 52.6 | 49.8 | 2 / 35 | 3027 |
| 10 | 5 | 56.1 | 60.6 | 4 / 35 | 2951 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 19 | 11% |
| oog.melee.Capulet 1.2 | 14 | 36% |
| darkcanuck.B26354 1.06 | 12 | 33% |
| stelo.PastFuture 2.3.2 | 10 | 40% |
| intruder.PrairieWolf 2.61 | 7 | 43% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 0% |

Hadur died in 332 of 350 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 66 | 20% | 71 |
| catcat20.Matcha 0.006 | 62 | 19% | 65 |
| stelo.PastFuture 2.3.2 | 60 | 18% | 64 |
| darkcanuck.B26354 1.06 | 51 | 15% | 56 |
| ntc.Opposite 1.5 | 31 | 9% | 31 |
| fowl3628800.LightningBolt 2.6.0 | 27 | 8% | 25 |
| tripphippy.Alice 1.1 | 17 | 5% | 17 |
| intruder.PrairieWolf 2.61 | 15 | 5% | 18 |
| GarmBox.Anger 1.0 | 3 | 1% | 3 |

## Melee bench: F31

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.2 | 57.6 | 26 / 350 | 4.81 | 10.8% | 24999 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.8% | 198 |
| gh.mini.Griezel 0.2 | 2.2 | 13.7% | 70 |
| d414.nano.Quantum 1.0.0 | 3.6 | 11.7% | 22 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 11.8% | 25 |
| hadur117.nano.SanaroS2 0.2 | 4.8 | 10.8% | 26 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.5% | 7 |
| timmit.nano.TimDog 0.33 | 7.1 | 6.9% | 3 |
| fm.mammillarias 1.3 | 8.1 | 6.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.1 | 5.6% | 0 |
| tlp.ThreeLeggedPig 1 | 9.6 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 52.2 | 53.7 | 3 / 35 | 2231 |
| 2 | 5 | 54.0 | 57.5 | 2 / 35 | 2540 |
| 3 | 3 | 58.1 | 64.8 | 5 / 35 | 2802 |
| 4 | 4 | 55.8 | 61.0 | 1 / 35 | 2632 |
| 5 | 4 | 57.8 | 64.4 | 5 / 35 | 2635 |
| 6 | 5 | 53.9 | 56.5 | 4 / 35 | 2355 |
| 7 | 7 | 47.3 | 44.1 | 1 / 35 | 2119 |
| 8 | 5 | 54.8 | 57.8 | 2 / 35 | 2745 |
| 9 | 5 | 53.2 | 55.2 | 2 / 35 | 2427 |
| 10 | 4 | 55.2 | 61.3 | 1 / 35 | 2513 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 47 | 26% |
| gh.mini.Griezel 0.2 | 28 | 29% |
| spinnercat.micro.Tyger 0.1 | 7 | 14% |
| d414.nano.Quantum 1.0.0 | 4 | 0% |
| Gecko.ultimateGeckoBot 1.0 | 2 | 100% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 324 of 350 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 97 | 30% | 110 |
| gh.mini.Griezel 0.2 | 70 | 22% | 78 |
| spinnercat.micro.Tyger 0.1 | 57 | 18% | 58 |
| d414.nano.Quantum 1.0.0 | 36 | 11% | 36 |
| gh.nano.Grofvuil 0.2 | 22 | 7% | 23 |
| fm.mammillarias 1.3 | 19 | 6% | 19 |
| timmit.nano.TimDog 0.33 | 12 | 4% | 13 |
| tlp.ThreeLeggedPig 1 | 6 | 2% | 6 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 2% | 7 |

## Melee bench: F32

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 77.3 | 130 / 350 | 3.05 | 15.1% | 34639 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.5 | 15.3% | 101 |
| hadur117.nano.SanaroS2 0.2 | 1.6 | 15.1% | 130 |
| apc.botM 3.0 | 3.7 | 12.1% | 41 |
| vjik.UnViolation 1.1 | 4.1 | 11.1% | 37 |
| lxx.ConceptA 0.8 | 4.2 | 11.3% | 14 |
| bayen.UbaMicro 1.4 | 6.0 | 9.3% | 9 |
| panzer.Panzer 0.2 | 7.6 | 6.9% | 2 |
| yk.JahMicro 1.0 | 8.2 | 6.7% | 7 |
| conscience.Electron 1.3g | 8.5 | 6.5% | 1 |
| donjezza.Jezza 1.0 | 9.6 | 5.6% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 81.0 | 17 / 35 | 3505 |
| 2 | 2 | 60.6 | 69.2 | 13 / 35 | 3544 |
| 3 | 1 | 65.2 | 84.4 | 18 / 35 | 3658 |
| 4 | 1 | 63.8 | 82.2 | 13 / 35 | 3365 |
| 5 | 2 | 60.7 | 73.3 | 10 / 35 | 3203 |
| 6 | 3 | 59.6 | 69.5 | 9 / 35 | 3254 |
| 7 | 1 | 62.8 | 79.4 | 11 / 35 | 3643 |
| 8 | 2 | 63.4 | 78.7 | 14 / 35 | 3550 |
| 9 | 2 | 61.6 | 74.9 | 11 / 35 | 3379 |
| 10 | 1 | 63.2 | 80.0 | 14 / 35 | 3538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 111 | 57% |
| apc.botM 3.0 | 30 | 63% |
| vjik.UnViolation 1.1 | 21 | 62% |
| lxx.ConceptA 0.8 | 15 | 67% |
| donjezza.Jezza 1.0 | 14 | 57% |
| yk.JahMicro 1.0 | 7 | 71% |
| panzer.Panzer 0.2 | 5 | 100% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 221 of 350 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 69 | 31% | 133 |
| lxx.ConceptA 0.8 | 44 | 20% | 48 |
| apc.botM 3.0 | 30 | 14% | 52 |
| vjik.UnViolation 1.1 | 23 | 10% | 42 |
| bayen.UbaMicro 1.4 | 22 | 10% | 28 |
| panzer.Panzer 0.2 | 11 | 5% | 14 |
| yk.JahMicro 1.0 | 9 | 4% | 10 |
| donjezza.Jezza 1.0 | 7 | 3% | 14 |
| conscience.Electron 1.3g | 6 | 3% | 8 |

## Melee bench: F33

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 65.7 | 46 / 350 | 4.09 | 13.1% | 35226 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.4% | 120 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.1% | 87 |
| hadur117.nano.SanaroS2 0.2 | 3.0 | 13.1% | 46 |
| labg.Cataclysm 2.05 | 4.1 | 11.7% | 53 |
| gre.svman4.Leonidas 1.3.2 | 4.6 | 11.0% | 26 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.4 | 8.7% | 12 |
| baal.nano.N 1.42 | 6.6 | 9.0% | 2 |
| zyx.micro.Ant 1.1 | 8.5 | 5.5% | 0 |
| sanja.First 0.1 | 9.0 | 5.0% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.3 | 64.1 | 4 / 35 | 3206 |
| 2 | 4 | 59.3 | 64.8 | 4 / 35 | 3392 |
| 3 | 3 | 60.0 | 64.8 | 5 / 35 | 3971 |
| 4 | 2 | 61.2 | 70.5 | 4 / 35 | 3841 |
| 5 | 3 | 58.8 | 65.4 | 2 / 35 | 3325 |
| 6 | 3 | 61.3 | 72.4 | 6 / 35 | 3612 |
| 7 | 3 | 58.6 | 61.9 | 5 / 35 | 3553 |
| 8 | 2 | 59.8 | 67.0 | 6 / 35 | 3479 |
| 9 | 3 | 59.0 | 65.1 | 5 / 35 | 3555 |
| 10 | 4 | 57.9 | 61.3 | 5 / 35 | 3292 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 55 | 42% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 9% |
| gre.svman4.Leonidas 1.3.2 | 13 | 54% |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 55% |
| labg.Cataclysm 2.05 | 8 | 50% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 305 of 350 rounds, at a mean tick of 1051. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 106 | 35% | 130 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 77 | 25% | 83 |
| labg.Cataclysm 2.05 | 37 | 12% | 41 |
| gre.svman4.Leonidas 1.3.2 | 36 | 12% | 44 |
| kinsen.melee.Angsaichmophobia 1.8c | 18 | 6% | 19 |
| zyx.micro.Ant 1.1 | 14 | 5% | 15 |
| baal.nano.N 1.42 | 13 | 4% | 13 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 1% | 3 |
| sanja.First 0.1 | 1 | 0% | 2 |

## Melee bench: F34

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 70.6 | 55 / 350 | 3.64 | 13.6% | 36169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 17.7% | 141 |
| kid.Gladiator .7.2 | 1.5 | 17.6% | 112 |
| hadur117.nano.SanaroS2 0.2 | 3.0 | 13.6% | 55 |
| jcs.Seth 1.8 | 4.4 | 11.4% | 25 |
| tcf.Reach 3 | 4.8 | 11.0% | 9 |
| cli.Dancer 1.1 | 5.8 | 9.4% | 5 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 3 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.2% | 1 |
| sample.VelociRobot 1.0 | 9.0 | 3.7% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 65.1 | 5 / 35 | 3195 |
| 2 | 3 | 60.9 | 68.9 | 3 / 35 | 3475 |
| 3 | 3 | 61.4 | 69.2 | 5 / 35 | 3802 |
| 4 | 3 | 62.8 | 75.2 | 5 / 35 | 3768 |
| 5 | 3 | 62.0 | 69.5 | 5 / 35 | 3830 |
| 6 | 3 | 62.0 | 71.4 | 6 / 35 | 3719 |
| 7 | 3 | 62.7 | 74.3 | 8 / 35 | 3415 |
| 8 | 3 | 61.4 | 70.2 | 5 / 35 | 3704 |
| 9 | 3 | 62.7 | 74.9 | 6 / 35 | 3634 |
| 10 | 3 | 61.0 | 67.6 | 7 / 35 | 3627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 54 | 52% |
| kid.Gladiator .7.2 | 46 | 33% |
| jcs.Seth 1.8 | 11 | 64% |
| tcf.Reach 3 | 6 | 50% |
| cli.Dancer 1.1 | 3 | 33% |
| ratosh.Wesco 1.4 | 2 | 50% |

Hadur died in 296 of 350 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 118 | 40% | 127 |
| stelo.Spread 0.9 | 96 | 32% | 128 |
| jcs.Seth 1.8 | 28 | 9% | 37 |
| tcf.Reach 3 | 25 | 8% | 28 |
| ratosh.Wesco 1.4 | 13 | 4% | 14 |
| cli.Dancer 1.1 | 12 | 4% | 13 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| sample.RamFire 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 69.3 | 20 / 350 | 3.76 | 12.5% | 26397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.3% | 258 |
| gh.mini.Gruwel 0.9 | 2.7 | 13.6% | 46 |
| hadur117.nano.SanaroS2 0.2 | 3.4 | 12.5% | 20 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.9 | 11.9% | 17 |
| rz.HawkOnFire 0.1 | 4.0 | 12.0% | 7 |
| myl.nano.KomoriNinja 1.1 | 6.3 | 7.0% | 1 |
| wit.Chuliath 1.0 | 6.8 | 6.7% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.3 | 5.8% | 1 |
| dans.Cinnamon 1.2 | 8.7 | 5.4% | 0 |
| stelo.MyAgileRobot 0.2 | 9.9 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.8 | 68.6 | 2 / 35 | 2534 |
| 2 | 2 | 60.2 | 71.4 | 3 / 35 | 2857 |
| 3 | 4 | 56.0 | 63.2 | 1 / 35 | 2466 |
| 4 | 4 | 57.7 | 68.3 | 1 / 35 | 2431 |
| 5 | 4 | 58.9 | 69.5 | 1 / 35 | 2697 |
| 6 | 5 | 55.9 | 61.6 | 2 / 35 | 2535 |
| 7 | 3 | 62.0 | 79.4 | 3 / 35 | 2787 |
| 8 | 3 | 59.5 | 71.4 | 3 / 35 | 2682 |
| 9 | 2 | 60.3 | 74.3 | 3 / 35 | 2645 |
| 10 | 4 | 57.3 | 65.7 | 1 / 35 | 2763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 79 | 1% |
| gh.mini.Gruwel 0.9 | 32 | 28% |
| rz.HawkOnFire 0.1 | 10 | 80% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 50% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |

Hadur died in 331 of 350 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 157 | 47% | 158 |
| gh.mini.Gruwel 0.9 | 58 | 18% | 68 |
| rz.HawkOnFire 0.1 | 47 | 14% | 53 |
| dmh.robocode.robot.BlackDeath 9.2 | 37 | 11% | 40 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 11 | 3% | 11 |
| dans.Cinnamon 1.2 | 8 | 2% | 8 |
| myl.nano.KomoriNinja 1.1 | 6 | 2% | 6 |
| wit.Chuliath 1.0 | 5 | 2% | 5 |
| stelo.MyAgileRobot 0.2 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 73.5 | 110 / 350 | 3.38 | 14.9% | 36523 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS2 0.2 | 1.2 | 14.9% | 110 |
| alpha.RainingFire 1.0 | 2.2 | 13.4% | 73 |
| bzdp.Pansy 2.1 | 2.7 | 12.7% | 56 |
| mz.Cork 0.1 | 4.5 | 11.4% | 28 |
| bvh.micro.Freya 0.3 | 5.1 | 10.7% | 32 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.8% | 18 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.6% | 13 |
| dl.BetterWalls 1.0 | 8.2 | 7.1% | 6 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 6.3% | 3 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.2% | 12 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.5 | 70.8 | 9 / 35 | 3986 |
| 2 | 1 | 63.0 | 76.5 | 12 / 35 | 3723 |
| 3 | 3 | 57.7 | 63.5 | 8 / 35 | 3056 |
| 4 | 1 | 62.2 | 72.7 | 12 / 35 | 3805 |
| 5 | 1 | 61.6 | 72.4 | 12 / 35 | 3334 |
| 6 | 1 | 61.3 | 70.8 | 9 / 35 | 3683 |
| 7 | 1 | 63.5 | 77.8 | 14 / 35 | 3494 |
| 8 | 1 | 60.6 | 69.8 | 10 / 35 | 3621 |
| 9 | 1 | 65.3 | 82.2 | 13 / 35 | 4040 |
| 10 | 1 | 63.8 | 78.7 | 11 / 35 | 3781 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 49 | 51% |
| alpha.RainingFire 1.0 | 34 | 38% |
| mz.Cork 0.1 | 31 | 71% |
| bvh.micro.Freya 0.3 | 26 | 77% |
| bvh.mini.Fenrir 0.39 | 18 | 78% |
| m3thos.Eva02 0.7.1 | 10 | 80% |
| dl.BetterWalls 1.0 | 7 | 86% |
| sample.MyFirstRobot 1.0 | 5 | 0% |
| squidM.TentalceMeleeNano 1.1 | 3 | 67% |

Hadur died in 241 of 350 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 60 | 25% | 76 |
| bzdp.Pansy 2.1 | 50 | 21% | 78 |
| mz.Cork 0.1 | 31 | 13% | 55 |
| bvh.micro.Freya 0.3 | 25 | 10% | 39 |
| m3thos.Eva02 0.7.1 | 25 | 10% | 34 |
| bvh.mini.Fenrir 0.39 | 24 | 10% | 29 |
| squidM.TentalceMeleeNano 1.1 | 11 | 5% | 13 |
| dl.BetterWalls 1.0 | 9 | 4% | 20 |
| sample.MyFirstRobot 1.0 | 6 | 2% | 6 |

## Melee bench: F37

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 78.2 | 125 / 350 | 2.96 | 15.6% | 44608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS2 0.2 | 1.0 | 15.6% | 125 |
| germ.TheMind .2 | 3.0 | 11.4% | 44 |
| EBBU.Sim2 1.02 | 3.4 | 10.7% | 35 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.9% | 31 |
| agrach.Dalek 1.0 | 5.4 | 9.8% | 36 |
| stelo.UntouchableNano 1.3 | 6.3 | 9.2% | 25 |
| mb.Beast 0.1 | 7.2 | 8.6% | 25 |
| lmk.ACPFinal 0.1 | 7.5 | 8.5% | 13 |
| skm.Ryubot 1.0 | 8.7 | 7.6% | 17 |
| mn.nano.perceptual.Impact 1.3.0 | 9.0 | 7.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 83.8 | 17 / 35 | 4552 |
| 2 | 1 | 64.7 | 84.1 | 16 / 35 | 4717 |
| 3 | 1 | 62.8 | 80.0 | 11 / 35 | 4154 |
| 4 | 1 | 60.7 | 74.0 | 8 / 35 | 4252 |
| 5 | 1 | 65.5 | 82.9 | 17 / 35 | 4974 |
| 6 | 1 | 62.3 | 78.4 | 10 / 35 | 4329 |
| 7 | 1 | 60.8 | 73.3 | 9 / 35 | 4317 |
| 8 | 1 | 62.8 | 77.8 | 16 / 35 | 4286 |
| 9 | 1 | 60.6 | 71.4 | 9 / 35 | 4514 |
| 10 | 1 | 62.1 | 76.2 | 12 / 35 | 4513 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 40 | 68% |
| EBBU.Sim2 1.02 | 37 | 41% |
| stelo.UntouchableNano 1.3 | 27 | 78% |
| agrach.Dalek 1.0 | 23 | 70% |
| skm.Ryubot 1.0 | 19 | 53% |
| com.syncleus.robocode.Dreadnaught 0.1 | 18 | 39% |
| mb.Beast 0.1 | 18 | 83% |
| lmk.ACPFinal 0.1 | 16 | 88% |

Hadur died in 226 of 350 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| EBBU.Sim2 1.02 | 45 | 20% | 60 |
| germ.TheMind .2 | 40 | 18% | 60 |
| com.syncleus.robocode.Dreadnaught 0.1 | 39 | 17% | 51 |
| agrach.Dalek 1.0 | 23 | 10% | 50 |
| stelo.UntouchableNano 1.3 | 21 | 9% | 31 |
| lmk.ACPFinal 0.1 | 18 | 8% | 30 |
| skm.Ryubot 1.0 | 14 | 6% | 22 |
| mb.Beast 0.1 | 13 | 6% | 33 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 6% | 12 |

## Melee bench: F38

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.6 | 63.2 | 40 / 350 | 4.31 | 11.8% | 28455 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.3% | 135 |
| bvh.mini.Freya 0.55 | 2.7 | 13.0% | 35 |
| cs.Wren 1.0 | 3.9 | 11.8% | 33 |
| hadur117.nano.SanaroS2 0.2 | 4.0 | 11.8% | 40 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.7% | 53 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.3 | 10.8% | 32 |
| kdf.KoulDestroyer 1.0 | 7.0 | 9.3% | 16 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.5% | 7 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.4% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.1 | 67.0 | 3 / 35 | 2729 |
| 2 | 4 | 56.8 | 61.3 | 4 / 35 | 3102 |
| 3 | 4 | 56.1 | 61.3 | 6 / 35 | 2859 |
| 4 | 5 | 55.6 | 61.9 | 3 / 35 | 2614 |
| 5 | 3 | 57.1 | 64.8 | 5 / 35 | 2839 |
| 6 | 6 | 56.4 | 63.5 | 5 / 35 | 2728 |
| 7 | 3 | 57.4 | 65.1 | 3 / 35 | 2911 |
| 8 | 4 | 56.2 | 62.2 | 3 / 35 | 2726 |
| 9 | 3 | 58.5 | 67.0 | 3 / 35 | 3214 |
| 10 | 4 | 55.2 | 58.1 | 5 / 35 | 2733 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 53 | 47% |
| bts.mega.Gnarly 1.4 | 15 | 20% |
| bvh.mini.Freya 0.55 | 12 | 67% |
| cs.Wren 1.0 | 11 | 27% |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 0% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 50% |
| kdf.KoulDestroyer 1.0 | 1 | 0% |

Hadur died in 311 of 350 rounds, at a mean tick of 637. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 81 | 26% | 106 |
| cs.Wren 1.0 | 48 | 15% | 48 |
| bvh.mini.Freya 0.55 | 46 | 15% | 50 |
| bts.mega.Gnarly 1.4 | 42 | 14% | 46 |
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 12% | 41 |
| kdf.KoulDestroyer 1.0 | 37 | 12% | 37 |
| bzdp.BoxCar 2.0 | 9 | 3% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7 | 2% | 9 |
| matt.UnderDark3 2.4.34 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F39

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.1 | 63.0 | 40 / 350 | 4.33 | 11.9% | 30117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.0 | 16.5% | 97 |
| az.Ololobot 0.2.4 | 2.3 | 13.0% | 94 |
| catcat20.Lambda 0.024 | 3.4 | 12.2% | 59 |
| hadur117.nano.SanaroS2 0.2 | 3.5 | 11.9% | 40 |
| stelo.SoRobotNanoMelee 1.2 | 5.7 | 9.4% | 35 |
| winamp32.micro.MicroMacro 1.0 | 6.5 | 8.8% | 10 |
| apollokidd.ApolloKidd 0.9 | 6.6 | 8.6% | 8 |
| gimp.GimpBot 0.1 | 7.3 | 8.2% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.7 | 6.6% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.1 | 61.0 | 2 / 35 | 3043 |
| 2 | 3 | 55.4 | 62.9 | 1 / 35 | 2962 |
| 3 | 3 | 57.1 | 65.7 | 8 / 35 | 2815 |
| 4 | 3 | 56.3 | 62.2 | 4 / 35 | 3302 |
| 5 | 4 | 55.8 | 63.2 | 3 / 35 | 2846 |
| 6 | 2 | 57.9 | 66.7 | 6 / 35 | 3166 |
| 7 | 5 | 55.2 | 59.7 | 5 / 35 | 2862 |
| 8 | 4 | 54.4 | 59.4 | 2 / 35 | 3078 |
| 9 | 3 | 55.8 | 61.9 | 4 / 35 | 3002 |
| 10 | 4 | 57.6 | 67.6 | 5 / 35 | 3041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 32 | 41% |
| az.Ololobot 0.2.4 | 30 | 27% |
| catcat20.Lambda 0.024 | 21 | 52% |
| stelo.SoRobotNanoMelee 1.2 | 9 | 44% |
| winamp32.micro.MicroMacro 1.0 | 5 | 40% |
| apollokidd.ApolloKidd 0.9 | 4 | 25% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 0% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| gimp.GimpBot 0.1 | 1 | 0% |

Hadur died in 312 of 350 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 126 | 40% | 137 |
| catcat20.Lambda 0.024 | 47 | 15% | 56 |
| az.Ololobot 0.2.4 | 38 | 12% | 44 |
| apollokidd.ApolloKidd 0.9 | 24 | 8% | 25 |
| stelo.SoRobotNanoMelee 1.2 | 23 | 7% | 24 |
| winamp32.micro.MicroMacro 1.0 | 21 | 7% | 25 |
| gimp.GimpBot 0.1 | 14 | 4% | 18 |
| whitesquare.robots.SkynetAdvanced 1.1 | 11 | 4% | 11 |
| dcs.Eater_of_Worlds 1.1.3-A | 8 | 3% | 10 |

## Melee bench: F41

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 70.1 | 82 / 350 | 3.69 | 13.4% | 30750 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.7% | 151 |
| ary.Swarm 1.1 | 2.8 | 13.6% | 24 |
| lessonz.robocode.Oz 0.5.0 | 3.2 | 13.3% | 48 |
| hadur117.nano.SanaroS2 0.2 | 3.2 | 13.4% | 82 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.8% | 32 |
| shrub.Silver v048 | 6.3 | 9.0% | 8 |
| zyx.nano.Ant 1.1 | 6.7 | 7.8% | 4 |
| jsal.Jsalbot 1.0 | 8.3 | 5.9% | 4 |
| stelo.Mirror 1.1 | 8.7 | 5.6% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.0 | 73.3 | 12 / 35 | 2920 |
| 2 | 4 | 59.1 | 66.7 | 8 / 35 | 2724 |
| 3 | 2 | 61.0 | 71.7 | 11 / 35 | 3144 |
| 4 | 4 | 59.8 | 67.9 | 10 / 35 | 2922 |
| 5 | 5 | 58.7 | 67.6 | 4 / 35 | 3008 |
| 6 | 4 | 58.0 | 64.4 | 5 / 35 | 2984 |
| 7 | 3 | 60.3 | 70.8 | 7 / 35 | 3098 |
| 8 | 2 | 61.5 | 72.7 | 6 / 35 | 3420 |
| 9 | 3 | 60.9 | 70.2 | 8 / 35 | 3204 |
| 10 | 2 | 62.8 | 75.9 | 11 / 35 | 3326 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 76 | 42% |
| ary.Swarm 1.1 | 28 | 75% |
| lessonz.robocode.Oz 0.5.0 | 27 | 48% |
| simonton.nano.MeleeSeed 1.8 | 16 | 88% |
| stelo.Mirror 1.1 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 0% |
| shrub.Silver v048 | 1 | 0% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 269 of 350 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 94 | 35% | 126 |
| lessonz.robocode.Oz 0.5.0 | 49 | 18% | 59 |
| ary.Swarm 1.1 | 48 | 18% | 73 |
| simonton.nano.MeleeSeed 1.8 | 29 | 11% | 40 |
| shrub.Silver v048 | 18 | 7% | 19 |
| zyx.nano.Ant 1.1 | 17 | 6% | 18 |
| stelo.Mirror 1.1 | 7 | 3% | 8 |
| jsal.Jsalbot 1.0 | 4 | 1% | 5 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 70.3 | 58 / 350 | 3.67 | 13.6% | 35968 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.1 | 17.4% | 165 |
| maribo.mini.MiniQuester 0.1 | 2.8 | 14.2% | 44 |
| ara.Shera 0.88 | 2.8 | 14.2% | 69 |
| hadur117.nano.SanaroS2 0.2 | 3.3 | 13.6% | 58 |
| amz.NanoClone 1.41 | 5.1 | 9.7% | 8 |
| maribo.IotaCT 1.1 | 6.2 | 7.6% | 0 |
| dsw.StaticD 1.0 | 6.7 | 7.3% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 8.9 | 5.3% | 0 |
| stelo.MirrorMicro 1.0 | 9.0 | 5.5% | 0 |
| mme.NikeEnhanced 2.0 | 9.1 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 71.7 | 5 / 35 | 3755 |
| 2 | 4 | 60.5 | 70.2 | 6 / 35 | 3676 |
| 3 | 3 | 61.6 | 72.4 | 7 / 35 | 3926 |
| 4 | 4 | 60.0 | 68.6 | 8 / 35 | 3290 |
| 5 | 2 | 61.4 | 75.2 | 6 / 35 | 3401 |
| 6 | 4 | 59.5 | 65.4 | 6 / 35 | 3700 |
| 7 | 4 | 61.5 | 74.3 | 5 / 35 | 3570 |
| 8 | 4 | 61.0 | 71.4 | 4 / 35 | 3670 |
| 9 | 2 | 59.7 | 70.5 | 5 / 35 | 3466 |
| 10 | 4 | 58.4 | 63.2 | 6 / 35 | 3514 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 68 | 31% |
| ara.Shera 0.88 | 33 | 39% |
| maribo.mini.MiniQuester 0.1 | 24 | 67% |
| amz.NanoClone 1.41 | 4 | 75% |
| maribo.IotaCT 1.1 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| dsw.StaticD 1.0 | 1 | 100% |

Hadur died in 293 of 350 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 92 | 31% | 113 |
| ara.Shera 0.88 | 79 | 27% | 92 |
| maribo.mini.MiniQuester 0.1 | 73 | 25% | 91 |
| amz.NanoClone 1.41 | 23 | 8% | 24 |
| maribo.IotaCT 1.1 | 8 | 3% | 11 |
| dsw.StaticD 1.0 | 8 | 3% | 9 |
| stelo.MirrorMicro 1.0 | 3 | 1% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 60.0 | 16 / 350 | 4.60 | 11.2% | 27372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.8% | 272 |
| brainfade.melee.Dusk 0.44 | 2.3 | 13.1% | 32 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.1% | 11 |
| hadur117.nano.SanaroS2 0.2 | 4.1 | 11.2% | 16 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.9% | 10 |
| Krabb.akim2.Akim2 1.1b | 5.4 | 10.5% | 6 |
| mz.NanoGod 2.02 | 7.2 | 8.0% | 2 |
| jab.DiamondStealer 5 | 7.8 | 7.4% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.9 | 56.5 | 0 / 35 | 2698 |
| 2 | 3 | 58.8 | 65.1 | 1 / 35 | 2935 |
| 3 | 4 | 55.9 | 58.4 | 2 / 35 | 2507 |
| 4 | 6 | 55.0 | 54.0 | 1 / 35 | 2658 |
| 5 | 4 | 56.7 | 59.4 | 2 / 35 | 2578 |
| 6 | 3 | 58.9 | 64.8 | 1 / 35 | 2597 |
| 7 | 5 | 58.4 | 61.6 | 3 / 35 | 2911 |
| 8 | 6 | 53.5 | 51.4 | 1 / 35 | 2552 |
| 9 | 3 | 58.1 | 60.6 | 2 / 35 | 2839 |
| 10 | 3 | 61.1 | 68.6 | 3 / 35 | 3097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 50 | 14% |
| brainfade.melee.Dusk 0.44 | 11 | 45% |
| dummy.micro.Sparrow 2.5 | 5 | 40% |
| Krabb.akim2.Akim2 1.1b | 3 | 33% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 50% |
| jab.DiamondStealer 5 | 1 | 0% |

Hadur died in 334 of 350 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 140 | 42% | 146 |
| brainfade.melee.Dusk 0.44 | 50 | 15% | 55 |
| dummy.micro.Sparrow 2.5 | 43 | 13% | 46 |
| wcsv.melee.EngineerMelee 0.1 | 39 | 12% | 40 |
| Krabb.akim2.Akim2 1.1b | 22 | 7% | 23 |
| mz.NanoGod 2.02 | 21 | 6% | 21 |
| jab.DiamondStealer 5 | 15 | 4% | 15 |
| cvt.Firsty 1.0 | 4 | 1% | 4 |

## Melee bench: F44

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 71.7 | 78 / 350 | 3.55 | 14.2% | 35875 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.2 | 16.9% | 139 |
| tzu.TheArtOfWar 1.2 | 2.1 | 15.2% | 79 |
| hadur117.nano.SanaroS2 0.2 | 2.7 | 14.2% | 78 |
| jwirde.Gort 2.0 | 4.4 | 10.6% | 35 |
| wompi.Quokka 1.6 | 5.0 | 10.3% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.6 | 9.4% | 8 |
| disan.Chair 2.2.0 | 7.5 | 7.0% | 4 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.7% | 1 |
| sample.Crazy 1.0 | 8.9 | 5.3% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.9 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 80.0 | 10 / 35 | 3997 |
| 2 | 3 | 58.2 | 64.4 | 6 / 35 | 3081 |
| 3 | 2 | 62.8 | 76.2 | 8 / 35 | 3772 |
| 4 | 2 | 60.6 | 69.2 | 10 / 35 | 3502 |
| 5 | 3 | 60.9 | 71.1 | 6 / 35 | 3581 |
| 6 | 3 | 60.2 | 68.3 | 8 / 35 | 3311 |
| 7 | 3 | 62.7 | 74.6 | 8 / 35 | 3764 |
| 8 | 3 | 62.5 | 72.1 | 9 / 35 | 3845 |
| 9 | 3 | 60.7 | 69.5 | 8 / 35 | 3145 |
| 10 | 3 | 61.0 | 71.1 | 5 / 35 | 3877 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 70 | 56% |
| tzu.TheArtOfWar 1.2 | 55 | 24% |
| jwirde.Gort 2.0 | 14 | 43% |
| wompi.Quokka 1.6 | 11 | 73% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 71% |
| sample.Crazy 1.0 | 3 | 67% |
| disan.Chair 2.2.0 | 2 | 50% |
| stf.PanzerGeneral 0.1 | 2 | 100% |

Hadur died in 273 of 350 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 85 | 31% | 103 |
| stelo.Liblix 0.3.1 | 73 | 27% | 117 |
| jwirde.Gort 2.0 | 28 | 10% | 34 |
| wompi.Quokka 1.6 | 27 | 10% | 30 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 26 | 10% | 28 |
| stf.PanzerGeneral 0.1 | 13 | 5% | 14 |
| disan.Chair 2.2.0 | 11 | 4% | 12 |
| amk.jointstrike.JointStrike 0.2 | 5 | 2% | 5 |
| sample.Crazy 1.0 | 4 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 70.2 | 64 / 350 | 3.69 | 14.4% | 38306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS2 0.2 | 1.7 | 14.4% | 64 |
| eem.IWillFireNoBullet v2.8 | 2.7 | 12.1% | 176 |
| jje.BagPuss 1.2 | 2.8 | 12.4% | 22 |
| sul.Lunar 1.1 | 3.9 | 11.7% | 52 |
| myl.nano.Graviton 1.10 | 4.4 | 11.0% | 12 |
| hvilela.HVilela 0.9 | 6.1 | 9.5% | 3 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.5% | 7 |
| fm.claire 1.7 | 7.4 | 8.4% | 1 |
| wit.Deep7 2.0 | 9.1 | 6.4% | 12 |
| abud.ThirdRobo 1.0 | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.6 | 68.6 | 8 / 35 | 3998 |
| 2 | 2 | 58.7 | 65.7 | 3 / 35 | 3555 |
| 3 | 1 | 67.3 | 83.2 | 15 / 35 | 3782 |
| 4 | 1 | 62.2 | 71.7 | 6 / 35 | 4310 |
| 5 | 2 | 60.8 | 69.8 | 3 / 35 | 3946 |
| 6 | 1 | 64.5 | 79.0 | 11 / 35 | 4339 |
| 7 | 1 | 60.1 | 68.6 | 6 / 35 | 3596 |
| 8 | 3 | 58.5 | 64.8 | 4 / 35 | 3514 |
| 9 | 3 | 57.3 | 61.6 | 5 / 35 | 3408 |
| 10 | 2 | 60.2 | 68.6 | 3 / 35 | 3858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 73 | 27% |
| sul.Lunar 1.1 | 37 | 24% |
| jje.BagPuss 1.2 | 15 | 47% |
| myl.nano.Graviton 1.10 | 14 | 86% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 90% |
| wit.Deep7 2.0 | 7 | 14% |
| abud.ThirdRobo 1.0 | 3 | 67% |
| hvilela.HVilela 0.9 | 2 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 286 of 350 rounds, at a mean tick of 1302. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 63 | 22% | 0 |
| sul.Lunar 1.1 | 56 | 20% | 85 |
| jje.BagPuss 1.2 | 52 | 18% | 89 |
| myl.nano.Graviton 1.10 | 38 | 13% | 61 |
| pez.mini.ChironexFleckeri 0.5 | 20 | 7% | 33 |
| fm.claire 1.7 | 20 | 7% | 27 |
| hvilela.HVilela 0.9 | 19 | 7% | 26 |
| wit.Deep7 2.0 | 11 | 4% | 16 |
| abud.ThirdRobo 1.0 | 7 | 2% | 11 |

## Melee bench: F46

hadur117.nano.SanaroS2 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 70.5 | 36 / 350 | 3.65 | 12.7% | 27728 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.1 | 18.1% | 137 |
| rsalesc.melee.Medina 0.4.5 | 1.9 | 17.0% | 144 |
| hadur117.nano.SanaroS2 0.2 | 3.0 | 12.7% | 36 |
| mz.MicroSheep 1.0 | 4.6 | 10.5% | 11 |
| cx.Princess 1.0 | 4.6 | 10.3% | 18 |
| sadoner.killer 0.2 | 5.9 | 9.3% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.6% | 4 |
| jeremyreeder.collective.Prophet 5 | 7.9 | 6.5% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.2 | 65.1 | 3 / 35 | 2722 |
| 2 | 3 | 60.9 | 76.5 | 5 / 35 | 2781 |
| 3 | 3 | 58.9 | 68.3 | 4 / 35 | 2950 |
| 4 | 3 | 57.3 | 64.8 | 5 / 35 | 2544 |
| 5 | 3 | 60.7 | 73.0 | 7 / 35 | 3011 |
| 6 | 3 | 60.2 | 75.2 | 4 / 35 | 2661 |
| 7 | 3 | 59.2 | 70.5 | 5 / 35 | 2689 |
| 8 | 3 | 60.2 | 75.6 | 1 / 35 | 2722 |
| 9 | 3 | 58.8 | 68.3 | 1 / 35 | 2751 |
| 10 | 3 | 58.2 | 68.3 | 1 / 35 | 2897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 69 | 32% |
| rsalesc.melee.Medina 0.4.5 | 33 | 9% |
| cx.Princess 1.0 | 11 | 73% |
| arthord.NanoSatanMelee Beta | 4 | 75% |
| mz.MicroSheep 1.0 | 3 | 0% |

Hadur died in 315 of 350 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 140 | 44% | 165 |
| rsalesc.melee.Medina 0.4.5 | 81 | 26% | 84 |
| cx.Princess 1.0 | 24 | 8% | 28 |
| mz.MicroSheep 1.0 | 22 | 7% | 24 |
| sadoner.killer 0.2 | 22 | 7% | 22 |
| arthord.NanoSatanMelee Beta | 15 | 5% | 18 |
| jeremyreeder.collective.Prophet 5 | 7 | 2% | 7 |
| kurios.DOSexe .9a | 2 | 1% | 1 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 1 |
1 death(s) with no robot to name.

