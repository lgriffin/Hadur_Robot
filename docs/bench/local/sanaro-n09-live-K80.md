# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 77.3 | 72 / 350 | 3.04 | 14.2% | 34000 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.0% | 216 |
| hadur117.nano.SanaroK80 0.3 | 2.0 | 14.2% | 72 |
| sgp.JollyNinja 3.53 | 3.4 | 12.0% | 40 |
| mz.MicroGodMelee 1 | 4.3 | 11.2% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 11.4% | 9 |
| lorneswork.Predator 1.0 | 5.8 | 10.1% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.8% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 78.7 | 6 / 35 | 3569 |
| 2 | 2 | 64.6 | 83.2 | 12 / 35 | 3614 |
| 3 | 2 | 62.1 | 78.4 | 10 / 35 | 3219 |
| 4 | 2 | 62.2 | 78.1 | 3 / 35 | 3650 |
| 5 | 2 | 62.8 | 79.4 | 10 / 35 | 2948 |
| 6 | 2 | 61.8 | 78.7 | 8 / 35 | 3019 |
| 7 | 2 | 60.9 | 74.9 | 5 / 35 | 3288 |
| 8 | 2 | 62.8 | 78.4 | 5 / 35 | 3737 |
| 9 | 2 | 60.0 | 70.2 | 5 / 35 | 3518 |
| 10 | 2 | 61.5 | 73.3 | 8 / 35 | 3438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 152 | 21% |
| sgp.JollyNinja 3.53 | 27 | 44% |
| mz.MicroGodMelee 1 | 20 | 90% |
| lorneswork.Predator 1.0 | 5 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 100% |
| adt.Ar2 1.0 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 278 of 350 rounds, at a mean tick of 1011. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 151 | 54% | 183 |
| sgp.JollyNinja 3.53 | 47 | 17% | 55 |
| simonton.nano.WeekendObsession_Melee 1.0 | 32 | 12% | 35 |
| lorneswork.Predator 1.0 | 25 | 9% | 28 |
| mz.MicroGodMelee 1 | 13 | 5% | 33 |
| adt.Ar2 1.0 | 6 | 2% | 8 |
| kawigi.sbf.FloodSonnet 0.9 | 4 | 1% | 5 |
| skm.butterfly 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 72.9 | 84 / 350 | 3.44 | 14.2% | 34598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.3 | 15.2% | 94 |
| hadur117.nano.SanaroK80 0.3 | 2.1 | 14.2% | 84 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.6 | 14.0% | 73 |
| lrem.micro.SpikeSoldier 0.4 | 4.4 | 11.1% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.5% | 28 |
| sch.Simone 0.3d | 6.8 | 8.2% | 26 |
| fnc.bandit.Bandit 5.2.0 | 7.4 | 7.5% | 6 |
| Noran.BitchingElk 0.054 | 7.8 | 7.4% | 15 |
| stelo.PatternRobot 1.0 | 8.0 | 7.2% | 16 |
| fullsail.SweetTea 1.1 | 9.9 | 4.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 77.1 | 10 / 35 | 3828 |
| 2 | 3 | 59.9 | 68.6 | 7 / 35 | 3665 |
| 3 | 2 | 62.0 | 75.9 | 8 / 35 | 3625 |
| 4 | 3 | 56.8 | 62.2 | 4 / 35 | 3367 |
| 5 | 2 | 59.6 | 71.4 | 5 / 35 | 3149 |
| 6 | 3 | 61.1 | 71.7 | 11 / 35 | 3404 |
| 7 | 2 | 64.5 | 82.2 | 11 / 35 | 3716 |
| 8 | 1 | 62.6 | 78.4 | 8 / 35 | 3520 |
| 9 | 1 | 62.6 | 76.8 | 14 / 35 | 3357 |
| 10 | 3 | 57.1 | 64.4 | 6 / 35 | 2967 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 66 | 55% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 27% |
| com.cohesiva.robocode.ManOwaR 1.0 | 21 | 71% |
| Noran.BitchingElk 0.054 | 13 | 54% |
| sch.Simone 0.3d | 12 | 33% |
| stelo.PatternRobot 1.0 | 5 | 0% |
| lrem.micro.SpikeSoldier 0.4 | 5 | 100% |
| fnc.bandit.Bandit 5.2.0 | 5 | 60% |
| fullsail.SweetTea 1.1 | 3 | 33% |

Hadur died in 266 of 350 rounds, at a mean tick of 957. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 72 | 27% | 99 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 66 | 25% | 81 |
| lrem.micro.SpikeSoldier 0.4 | 32 | 12% | 35 |
| stelo.PatternRobot 1.0 | 26 | 10% | 31 |
| com.cohesiva.robocode.ManOwaR 1.0 | 24 | 9% | 39 |
| sch.Simone 0.3d | 19 | 7% | 22 |
| fnc.bandit.Bandit 5.2.0 | 11 | 4% | 15 |
| Noran.BitchingElk 0.054 | 10 | 4% | 19 |
| fullsail.SweetTea 1.1 | 6 | 2% | 9 |

## Melee bench: F03

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 78.9 | 86 / 350 | 2.90 | 14.6% | 35541 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.7 | 15.1% | 91 |
| kawigi.nano.Lib 1.0 | 2.1 | 15.0% | 94 |
| hadur117.nano.SanaroK80 0.3 | 2.5 | 14.6% | 86 |
| vuen.Cake 2.51 | 3.7 | 13.2% | 67 |
| urdos.URDOS 1.3 | 5.1 | 10.1% | 6 |
| adt.Ar1 2.1 | 6.3 | 7.9% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.4 | 7.0% | 1 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.7% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.8% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.9 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 81.3 | 9 / 35 | 3662 |
| 2 | 3 | 62.0 | 78.1 | 10 / 35 | 3470 |
| 3 | 3 | 60.1 | 76.8 | 5 / 35 | 3232 |
| 4 | 4 | 60.8 | 74.0 | 7 / 35 | 3463 |
| 5 | 2 | 62.0 | 78.7 | 10 / 35 | 3597 |
| 6 | 1 | 63.7 | 83.5 | 10 / 35 | 3754 |
| 7 | 2 | 63.1 | 81.6 | 10 / 35 | 3630 |
| 8 | 2 | 62.0 | 76.2 | 13 / 35 | 3544 |
| 9 | 3 | 63.0 | 82.9 | 5 / 35 | 3746 |
| 10 | 3 | 61.0 | 75.6 | 7 / 35 | 3443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 69 | 46% |
| vuen.Cake 2.51 | 60 | 50% |
| kawigi.nano.Lib 1.0 | 59 | 14% |
| urdos.URDOS 1.3 | 10 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 67% |
| adt.Ar1 2.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |

Hadur died in 264 of 350 rounds, at a mean tick of 999. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 95 | 36% | 100 |
| radnor.DoctorBob 1.42 | 74 | 28% | 105 |
| vuen.Cake 2.51 | 43 | 16% | 79 |
| urdos.URDOS 1.3 | 30 | 11% | 39 |
| ghent.ArthurPanzergon 1.0.0 | 7 | 3% | 8 |
| adt.Ar1 2.1 | 5 | 2% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 2% | 5 |
| oa.weak.FlyMk1 0.1 | 3 | 1% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 1% | 4 |

## Melee bench: F04

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 74.0 | 10 / 350 | 3.34 | 13.7% | 38820 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.6% | 322 |
| hadur117.nano.SanaroK80 0.3 | 2.4 | 13.7% | 10 |
| apc.LeeroyJenkins2 1.0 | 2.6 | 13.6% | 9 |
| TNT.TNT 0.99.1 | 4.3 | 10.3% | 5 |
| josago.Jorgito 0.16 | 4.7 | 9.5% | 3 |
| css.Delitioner 0.11 | 6.6 | 7.4% | 0 |
| tj.zombie1n 1.0.1 | 6.6 | 7.0% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.8% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.2% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 76.2 | 2 / 35 | 4297 |
| 2 | 2 | 61.8 | 73.0 | 2 / 35 | 3806 |
| 3 | 3 | 62.9 | 78.1 | 0 / 35 | 3806 |
| 4 | 2 | 62.4 | 75.6 | 0 / 35 | 3954 |
| 5 | 2 | 61.7 | 73.7 | 0 / 35 | 3614 |
| 6 | 3 | 63.3 | 76.8 | 1 / 35 | 4054 |
| 7 | 2 | 61.6 | 74.3 | 1 / 35 | 3860 |
| 8 | 2 | 63.7 | 76.5 | 1 / 35 | 4291 |
| 9 | 3 | 60.2 | 68.9 | 2 / 35 | 3397 |
| 10 | 3 | 59.4 | 66.7 | 1 / 35 | 3741 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 180 | 2% |
| apc.LeeroyJenkins2 1.0 | 5 | 60% |
| josago.Jorgito 0.16 | 2 | 100% |
| TNT.TNT 0.99.1 | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 0% |

Hadur died in 340 of 350 rounds, at a mean tick of 1288. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 238 | 70% | 242 |
| apc.LeeroyJenkins2 1.0 | 33 | 10% | 37 |
| josago.Jorgito 0.16 | 33 | 10% | 35 |
| TNT.TNT 0.99.1 | 14 | 4% | 15 |
| css.Delitioner 0.11 | 9 | 3% | 9 |
| tj.zombie1n 1.0.1 | 7 | 2% | 7 |
| rampancy.Durandal 2.1d | 4 | 1% | 4 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |
| spin.Bugstard 0.012b | 1 | 0% | 0 |

## Melee bench: F06

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 73.1 | 109 / 350 | 3.42 | 14.1% | 31018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.5 | 15.1% | 75 |
| hadur117.nano.SanaroK80 0.3 | 2.1 | 14.1% | 109 |
| origin.SleepSiphon 1.7b | 3.0 | 13.4% | 82 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.7% | 44 |
| mld.Wisdom 1.0 | 4.6 | 11.2% | 12 |
| gg.Wolverine 2.0 | 6.1 | 9.0% | 12 |
| spinnercat.Omen 1.0 | 7.7 | 7.5% | 3 |
| DBall.NUKE 0.1 | 7.9 | 7.3% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 8.3 | 6.7% | 8 |
| sample.Fire 1.0 | 10.0 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.4 | 69.8 | 10 / 35 | 2755 |
| 2 | 1 | 63.8 | 79.0 | 16 / 35 | 3396 |
| 3 | 3 | 61.2 | 74.3 | 9 / 35 | 3085 |
| 4 | 2 | 60.4 | 72.4 | 6 / 35 | 3350 |
| 5 | 2 | 60.9 | 69.8 | 11 / 35 | 3435 |
| 6 | 3 | 58.6 | 66.3 | 9 / 35 | 2684 |
| 7 | 1 | 63.3 | 77.8 | 14 / 35 | 3333 |
| 8 | 2 | 61.2 | 73.3 | 12 / 35 | 3149 |
| 9 | 2 | 62.9 | 78.7 | 11 / 35 | 3285 |
| 10 | 3 | 58.8 | 69.8 | 11 / 35 | 2546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 51 | 61% |
| jekl.StoneGhost 0.7 | 42 | 67% |
| pe.minimelee.SandboxMiniMelee 1.1 | 35 | 54% |
| gg.Wolverine 2.0 | 13 | 62% |
| mld.Wisdom 1.0 | 11 | 100% |
| DBall.NUKE 0.1 | 7 | 71% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 67% |
| spinnercat.Omen 1.0 | 2 | 100% |
| sample.Fire 1.0 | 1 | 0% |

Hadur died in 244 of 350 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 62 | 25% | 84 |
| origin.SleepSiphon 1.7b | 52 | 21% | 84 |
| pe.minimelee.SandboxMiniMelee 1.1 | 52 | 21% | 73 |
| mld.Wisdom 1.0 | 37 | 15% | 50 |
| gg.Wolverine 2.0 | 14 | 6% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 4% | 14 |
| spinnercat.Omen 1.0 | 9 | 4% | 12 |
| DBall.NUKE 0.1 | 7 | 3% | 13 |
| sample.Fire 1.0 | 1 | 0% | 1 |

## Melee bench: F07

hadur117.nano.SanaroK80 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 83.0 | 114 / 350 | 2.36 | 18.2% | 42500 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.1 | 21.6% | 112 |
| hadur117.nano.SanaroK80 0.3 | 1.9 | 18.2% | 114 |
| franzor.Lizt 1.3.1 | 3.4 | 14.2% | 84 |
| oog.melee.CapuletDroid 1.1 | 3.6 | 13.9% | 35 |
| lrem.micro.MoggFanatic 0.2 | 5.2 | 10.4% | 1 |
| exauge.GateKeeper 1.1.121g | 5.8 | 8.6% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.7% | 2 |
| sample.Target 1.0 | 8.5 | 3.1% | 0 |
| drd.Dreadknoght 0.9 | 8.5 | 3.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.6 | 82.1 | 13 / 35 | 4652 |
| 2 | 2 | 66.7 | 85.4 | 13 / 35 | 3897 |
| 3 | 2 | 66.1 | 81.8 | 11 / 35 | 3924 |
| 4 | 2 | 68.6 | 86.8 | 15 / 35 | 4602 |
| 5 | 2 | 65.8 | 79.3 | 10 / 35 | 4336 |
| 6 | 2 | 66.4 | 82.9 | 7 / 35 | 4272 |
| 7 | 2 | 65.7 | 80.0 | 12 / 35 | 3987 |
| 8 | 2 | 66.6 | 82.9 | 11 / 35 | 3988 |
| 9 | 2 | 65.4 | 81.8 | 8 / 35 | 4032 |
| 10 | 1 | 68.3 | 86.8 | 14 / 35 | 4810 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 121 | 58% |
| franzor.Lizt 1.3.1 | 50 | 26% |
| oog.melee.CapuletDroid 1.1 | 43 | 72% |
| drd.Dreadknoght 0.9 | 2 | 0% |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% |

Hadur died in 236 of 350 rounds, at a mean tick of 1582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 137 | 58% | 250 |
| franzor.Lizt 1.3.1 | 42 | 18% | 1 |
| oog.melee.CapuletDroid 1.1 | 40 | 17% | 71 |
| exauge.GateKeeper 1.1.121g | 6 | 3% | 11 |
| skm.PateranBotlock2 1.0 | 5 | 2% | 6 |
| drd.Dreadknoght 0.9 | 3 | 1% | 5 |
| lrem.micro.MoggFanatic 0.2 | 3 | 1% | 4 |

## Melee bench: F08

hadur117.nano.SanaroK80 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 10 battles (0.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 77.9 | 118 / 350 | 2.77 | 16.4% | 30790 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tm.Yuugao 1.0 | 1.7 | 16.5% | 88 |
| hadur117.nano.SanaroK80 0.3 | 1.8 | 16.4% | 118 |
| shrub.Vapour v159 | 2.5 | 15.5% | 84 |
| m3thos.Eva00 1.1 | 4.7 | 10.1% | 11 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 10.6% | 25 |
| jwst.DAD.DarkAndDarker 1.1 | 5.7 | 9.6% | 20 |
| SHAM.WOW 1.4 | 7.2 | 7.8% | 2 |
| zyx.nano.BacillusComma 1.0 | 8.2 | 6.9% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.4 | 6.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 82.1 | 15 / 35 | 3042 |
| 2 | 3 | 60.3 | 72.9 | 8 / 35 | 3091 |
| 3 | 3 | 62.0 | 78.2 | 11 / 35 | 3071 |
| 4 | 1 | 63.3 | 81.1 | 13 / 35 | 3159 |
| 5 | 1 | 60.9 | 75.7 | 11 / 35 | 2962 |
| 6 | 3 | 60.9 | 73.6 | 10 / 35 | 2984 |
| 7 | 2 | 61.6 | 75.7 | 11 / 35 | 3174 |
| 8 | 1 | 63.1 | 82.9 | 14 / 35 | 2955 |
| 9 | 2 | 61.0 | 75.0 | 11 / 35 | 2825 |
| 10 | 1 | 64.1 | 81.8 | 14 / 35 | 3527 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 92 | 59% |
| shrub.Vapour v159 | 51 | 49% |
| com.spp.robocode.MostlyHarmless 010 | 19 | 53% |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 75% |
| m3thos.Eva00 1.1 | 13 | 77% |
| qualidafial.MajorDick 1.0.1 | 5 | 80% |
| SHAM.WOW 1.4 | 3 | 67% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 234 of 350 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 70 | 30% | 123 |
| shrub.Vapour v159 | 68 | 29% | 91 |
| com.spp.robocode.MostlyHarmless 010 | 28 | 12% | 39 |
| m3thos.Eva00 1.1 | 23 | 10% | 33 |
| jwst.DAD.DarkAndDarker 1.1 | 21 | 9% | 33 |
| zyx.nano.BacillusComma 1.0 | 11 | 5% | 14 |
| SHAM.WOW 1.4 | 9 | 4% | 13 |
| qualidafial.MajorDick 1.0.1 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 63.1 | 42 / 350 | 4.32 | 11.8% | 26306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.4% | 202 |
| kc.micro.Figment 1.0 | 2.0 | 14.6% | 55 |
| yagami.Tidus 0.11 | 3.9 | 11.4% | 2 |
| hadur117.nano.SanaroK80 0.3 | 3.9 | 11.8% | 42 |
| pedersen.Grishnakh 1.0 | 4.4 | 11.2% | 33 |
| mc2.enemy.Original 0.9 | 5.9 | 9.3% | 15 |
| dft.Calliope 5.6 | 6.9 | 7.7% | 1 |
| step.nanoPri 1.0 | 8.3 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.2% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.6 | 66.3 | 5 / 35 | 2754 |
| 2 | 3 | 58.2 | 67.3 | 8 / 35 | 2306 |
| 3 | 3 | 56.5 | 60.3 | 4 / 35 | 2874 |
| 4 | 3 | 59.8 | 72.4 | 4 / 35 | 2689 |
| 5 | 5 | 53.8 | 56.5 | 1 / 35 | 2519 |
| 6 | 5 | 55.7 | 59.0 | 5 / 35 | 2628 |
| 7 | 3 | 56.9 | 63.5 | 4 / 35 | 2567 |
| 8 | 5 | 55.7 | 58.4 | 2 / 35 | 2807 |
| 9 | 3 | 58.4 | 68.3 | 4 / 35 | 2709 |
| 10 | 5 | 55.0 | 59.4 | 5 / 35 | 2453 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 70 | 26% |
| kc.micro.Figment 1.0 | 25 | 52% |
| pedersen.Grishnakh 1.0 | 7 | 43% |
| yagami.Tidus 0.11 | 5 | 80% |
| dft.Calliope 5.6 | 3 | 100% |
| mc2.enemy.Original 0.9 | 1 | 100% |

Hadur died in 308 of 350 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 107 | 35% | 125 |
| kc.micro.Figment 1.0 | 49 | 16% | 62 |
| yagami.Tidus 0.11 | 49 | 16% | 55 |
| pedersen.Grishnakh 1.0 | 32 | 10% | 33 |
| mc2.enemy.Original 0.9 | 30 | 10% | 31 |
| robar.nano.Assertive_Melee 0.2 | 14 | 5% | 15 |
| dft.Calliope 5.6 | 12 | 4% | 14 |
| step.nanoPri 1.0 | 11 | 4% | 11 |
| rdm.Dueler 0.4x | 4 | 1% | 4 |

## Melee bench: F10

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 84.5 | 140 / 350 | 2.39 | 16.2% | 38079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroK80 0.3 | 1.2 | 16.2% | 140 |
| DTF.Kludgy 1.2b | 1.8 | 15.7% | 92 |
| ejb.Polaris 1.0.1 | 3.7 | 12.9% | 33 |
| ne.Chimera 1.2 | 3.7 | 13.0% | 29 |
| tvv.micro.Antares 1.1.1 | 4.9 | 10.9% | 38 |
| vStar.RAFzilla 2.15 | 5.7 | 10.0% | 13 |
| sam.Samspin 1.0 | 7.4 | 6.4% | 3 |
| kurios.DOSexe .9b | 8.5 | 5.3% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.3% | 0 |
| donjezza.Muncho 1.0 | 9.6 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 86.3 | 16 / 35 | 3798 |
| 2 | 2 | 61.7 | 75.6 | 7 / 35 | 3569 |
| 3 | 1 | 65.0 | 84.8 | 12 / 35 | 3910 |
| 4 | 1 | 65.0 | 86.3 | 10 / 35 | 3992 |
| 5 | 1 | 64.5 | 82.2 | 17 / 35 | 3586 |
| 6 | 1 | 65.9 | 87.3 | 17 / 35 | 3744 |
| 7 | 1 | 66.5 | 89.2 | 15 / 35 | 4029 |
| 8 | 1 | 65.5 | 85.4 | 16 / 35 | 3951 |
| 9 | 2 | 64.8 | 84.4 | 14 / 35 | 3535 |
| 10 | 1 | 65.1 | 83.5 | 16 / 35 | 3965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 88 | 50% |
| ejb.Polaris 1.0.1 | 59 | 86% |
| tvv.micro.Antares 1.1.1 | 34 | 24% |
| ne.Chimera 1.2 | 27 | 52% |
| vStar.RAFzilla 2.15 | 19 | 74% |
| sam.Samspin 1.0 | 4 | 50% |
| kurios.DOSexe .9b | 4 | 75% |
| donjezza.Muncho 1.0 | 4 | 100% |

Hadur died in 210 of 350 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 90 | 43% | 130 |
| ne.Chimera 1.2 | 45 | 21% | 59 |
| tvv.micro.Antares 1.1.1 | 30 | 14% | 36 |
| ejb.Polaris 1.0.1 | 22 | 10% | 76 |
| vStar.RAFzilla 2.15 | 10 | 5% | 21 |
| sam.Samspin 1.0 | 7 | 3% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 1% | 3 |
| kurios.DOSexe .9b | 2 | 1% | 8 |
| donjezza.Muncho 1.0 | 1 | 0% | 6 |

## Melee bench: F11

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 66.1 | 78 / 350 | 4.05 | 12.7% | 28774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.4% | 144 |
| cx.mini.Nimrod 0.55 | 2.3 | 13.2% | 49 |
| hadur117.nano.SanaroK80 0.3 | 3.0 | 12.7% | 78 |
| djc.DynaBot 0.1.1 | 3.9 | 11.3% | 22 |
| rdt199.Warlord 0.73 | 5.3 | 9.7% | 24 |
| br2.MobyDickBot 1.6 | 5.9 | 9.6% | 14 |
| uji.YellohFellah 1.0 | 6.6 | 9.0% | 23 |
| KiraNL.Chupacabra 0.4 | 8.1 | 6.8% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.1 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.5 | 61.9 | 7 / 35 | 2922 |
| 2 | 4 | 53.6 | 56.8 | 4 / 35 | 2656 |
| 3 | 3 | 59.3 | 67.6 | 8 / 35 | 3150 |
| 4 | 4 | 55.5 | 62.2 | 5 / 35 | 2531 |
| 5 | 2 | 60.0 | 72.1 | 11 / 35 | 2791 |
| 6 | 3 | 58.7 | 67.3 | 7 / 35 | 3082 |
| 7 | 4 | 56.9 | 62.2 | 7 / 35 | 2722 |
| 8 | 2 | 60.1 | 70.5 | 9 / 35 | 3036 |
| 9 | 3 | 58.1 | 65.1 | 6 / 35 | 3038 |
| 10 | 2 | 61.9 | 74.9 | 14 / 35 | 2846 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 60 | 48% |
| cx.mini.Nimrod 0.55 | 19 | 74% |
| djc.DynaBot 0.1.1 | 16 | 81% |
| rdt199.Warlord 0.73 | 14 | 100% |
| uji.YellohFellah 1.0 | 12 | 42% |
| br2.MobyDickBot 1.6 | 5 | 60% |

Hadur died in 273 of 350 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 106 | 39% | 132 |
| cx.mini.Nimrod 0.55 | 59 | 22% | 70 |
| rdt199.Warlord 0.73 | 31 | 11% | 48 |
| djc.DynaBot 0.1.1 | 21 | 8% | 32 |
| uji.YellohFellah 1.0 | 19 | 7% | 24 |
| br2.MobyDickBot 1.6 | 14 | 5% | 20 |
| KiraNL.Chupacabra 0.4 | 10 | 4% | 11 |
| stelo.MirrorNano 1.3 | 6 | 2% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 72.5 | 72 / 350 | 3.47 | 13.5% | 26542 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.9 | 14.3% | 86 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.2% | 83 |
| darkcanuck.Leon 1.01 | 2.8 | 13.6% | 68 |
| hadur117.nano.SanaroK80 0.3 | 3.1 | 13.5% | 72 |
| brainfade.melee.Genghis 0.36 | 5.0 | 11.3% | 29 |
| jrm.Test0 1.0 | 6.9 | 7.6% | 1 |
| cs.sheldor.Talon 1.1 | 6.9 | 7.2% | 0 |
| jp.Perpy 16.0 | 7.5 | 6.9% | 1 |
| jaybot.bots.Oddball 4.0 | 8.7 | 6.1% | 10 |
| stuff.Vlad 0.1 | 10.0 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.1 | 73.3 | 7 / 35 | 2769 |
| 2 | 4 | 59.7 | 71.7 | 8 / 35 | 2539 |
| 3 | 3 | 59.4 | 72.1 | 5 / 35 | 2700 |
| 4 | 4 | 60.2 | 72.7 | 5 / 35 | 3050 |
| 5 | 1 | 61.8 | 80.0 | 11 / 35 | 2367 |
| 6 | 4 | 58.8 | 68.6 | 7 / 35 | 2825 |
| 7 | 3 | 58.8 | 73.0 | 3 / 35 | 2413 |
| 8 | 2 | 60.6 | 73.0 | 9 / 35 | 2890 |
| 9 | 3 | 58.9 | 73.0 | 7 / 35 | 2354 |
| 10 | 3 | 59.0 | 67.9 | 10 / 35 | 2635 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 59 | 25% |
| darkcanuck.Leon 1.01 | 56 | 41% |
| bts.wiki.RipCurl 0.9b | 43 | 53% |
| brainfade.melee.Genghis 0.36 | 10 | 70% |
| jp.Perpy 16.0 | 2 | 100% |
| jrm.Test0 1.0 | 2 | 50% |
| jaybot.bots.Oddball 4.0 | 2 | 0% |
| stuff.Vlad 0.1 | 1 | 0% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 278 of 350 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 69 | 25% | 89 |
| darkcanuck.Leon 1.01 | 60 | 22% | 84 |
| bts.wiki.RipCurl 0.9b | 59 | 21% | 79 |
| brainfade.melee.Genghis 0.36 | 38 | 14% | 42 |
| cs.sheldor.Talon 1.1 | 15 | 5% | 17 |
| jaybot.bots.Oddball 4.0 | 14 | 5% | 14 |
| stuff.Vlad 0.1 | 10 | 4% | 11 |
| jrm.Test0 1.0 | 9 | 3% | 10 |
| jp.Perpy 16.0 | 4 | 1% | 4 |

## Melee bench: F13

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 73.0 | 60 / 350 | 3.43 | 13.0% | 28620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 17.7% | 162 |
| ags.Glacier 0.2.11 | 1.7 | 17.0% | 83 |
| hadur117.nano.SanaroK80 0.3 | 3.4 | 13.0% | 60 |
| shinh.Entangled 0.3 | 4.1 | 12.2% | 29 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.9% | 16 |
| apc.Colossus2 0.17 | 6.2 | 8.3% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.1% | 0 |
| ayk.WallHugger 1.0 | 8.2 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.9 | 4.4% | 0 |
| sample.Tracker 1.0 | 9.9 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.1 | 72.1 | 4 / 35 | 2601 |
| 2 | 3 | 59.6 | 68.9 | 5 / 35 | 3081 |
| 3 | 5 | 58.0 | 68.3 | 2 / 35 | 2632 |
| 4 | 3 | 60.6 | 75.6 | 7 / 35 | 2735 |
| 5 | 3 | 62.7 | 81.3 | 9 / 35 | 3159 |
| 6 | 3 | 61.7 | 75.9 | 9 / 35 | 2855 |
| 7 | 3 | 59.0 | 67.6 | 6 / 35 | 2818 |
| 8 | 3 | 60.7 | 73.3 | 6 / 35 | 2848 |
| 9 | 4 | 60.0 | 71.4 | 5 / 35 | 2695 |
| 10 | 3 | 61.4 | 75.9 | 7 / 35 | 3196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 79 | 39% |
| ags.Glacier 0.2.11 | 49 | 22% |
| shinh.Entangled 0.3 | 19 | 42% |
| gh.micro.Gruweltje 0.7 | 11 | 64% |
| apc.Colossus2 0.17 | 1 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 290 of 350 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 95 | 33% | 106 |
| mn.Combat 3.25.0 | 91 | 31% | 124 |
| shinh.Entangled 0.3 | 43 | 15% | 50 |
| gh.micro.Gruweltje 0.7 | 32 | 11% | 39 |
| stelo.Wang 1.0 | 12 | 4% | 13 |
| apc.Colossus2 0.17 | 11 | 4% | 12 |
| maribo.FollowFire 1 | 4 | 1% | 4 |
| ayk.WallHugger 1.0 | 1 | 0% | 1 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroK80 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 78.7 | 122 / 350 | 2.70 | 16.0% | 29036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 20.2% | 153 |
| hadur117.nano.SanaroK80 0.3 | 2.0 | 16.0% | 122 |
| dmh.robocode.robot.RedDwarf 0.4 | 3.7 | 12.2% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 4.8 | 11.1% | 13 |
| sanyi.mikrobi.Roberto 1.0 | 4.9 | 11.4% | 25 |
| Lo_Ian.Gandalf_V4 4.0 | 5.1 | 11.0% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 9.8% | 22 |
| pa.Improved 1.0 | 8.0 | 6.3% | 1 |
| sample.TrackFire 1.0 | 9.0 | 2.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 78.2 | 12 / 35 | 2739 |
| 2 | 2 | 61.3 | 76.1 | 12 / 35 | 2852 |
| 3 | 2 | 64.5 | 85.7 | 14 / 35 | 3145 |
| 4 | 2 | 62.3 | 80.0 | 13 / 35 | 2691 |
| 5 | 2 | 62.1 | 77.5 | 12 / 35 | 2800 |
| 6 | 2 | 64.4 | 85.0 | 13 / 35 | 3086 |
| 7 | 2 | 65.3 | 87.9 | 13 / 35 | 3246 |
| 8 | 2 | 59.6 | 70.7 | 8 / 35 | 2700 |
| 9 | 2 | 62.0 | 75.7 | 15 / 35 | 2889 |
| 10 | 2 | 60.6 | 70.7 | 10 / 35 | 2888 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 140 | 54% |
| sheldor.micro.PointInLineRRAL 1.0 | 27 | 78% |
| sanyi.mikrobi.Roberto 1.0 | 21 | 38% |
| co.edu.usb.rc.LidisTron 1.0 | 13 | 69% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 78% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 0% |
| pa.Improved 1.0 | 2 | 50% |
| sample.TrackFire 1.0 | 1 | 0% |

Hadur died in 228 of 350 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 117 | 51% | 190 |
| dmh.robocode.robot.RedDwarf 0.4 | 34 | 15% | 39 |
| sanyi.mikrobi.Roberto 1.0 | 29 | 13% | 46 |
| Lo_Ian.Gandalf_V4 4.0 | 17 | 7% | 19 |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 6% | 38 |
| co.edu.usb.rc.LidisTron 1.0 | 13 | 6% | 10 |
| pa.Improved 1.0 | 3 | 1% | 6 |
| sample.TrackFire 1.0 | 1 | 0% | 2 |

## Melee bench: F15

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 67.6 | 74 / 350 | 3.91 | 13.1% | 32513 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.5 | 14.7% | 67 |
| emp.Yngwie 1.11 | 2.6 | 13.8% | 103 |
| mld.DustBunny 3.8 | 2.9 | 13.2% | 31 |
| hadur117.nano.SanaroK80 0.3 | 3.1 | 13.1% | 74 |
| cb.nano.Insomnia 1.0 | 5.4 | 11.2% | 24 |
| kawigi.robot.Girl 1.2 | 5.5 | 10.9% | 48 |
| lambdaxy.TBot 0.1 | 7.2 | 7.2% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.8% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 5.0% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.9 | 66.0 | 6 / 35 | 3023 |
| 2 | 3 | 58.8 | 65.7 | 7 / 35 | 3387 |
| 3 | 3 | 60.0 | 68.9 | 7 / 35 | 3392 |
| 4 | 4 | 58.2 | 64.8 | 9 / 35 | 2978 |
| 5 | 2 | 61.1 | 72.7 | 7 / 35 | 3465 |
| 6 | 2 | 60.5 | 69.5 | 9 / 35 | 3512 |
| 7 | 4 | 58.3 | 64.1 | 7 / 35 | 3226 |
| 8 | 3 | 58.3 | 64.8 | 9 / 35 | 2912 |
| 9 | 3 | 60.5 | 72.4 | 7 / 35 | 3278 |
| 10 | 3 | 59.7 | 67.3 | 6 / 35 | 3340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 55 | 62% |
| kawigi.micro.Shiz 1.1 | 26 | 35% |
| cb.nano.Insomnia 1.0 | 22 | 50% |
| kawigi.robot.Girl 1.2 | 19 | 63% |
| mld.DustBunny 3.8 | 12 | 42% |
| divineomega.TrialBot 0.003 | 3 | 67% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 277 of 350 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 61 | 22% | 102 |
| mld.DustBunny 3.8 | 58 | 21% | 72 |
| kawigi.micro.Shiz 1.1 | 46 | 17% | 55 |
| cb.nano.Insomnia 1.0 | 43 | 16% | 34 |
| kawigi.robot.Girl 1.2 | 35 | 13% | 48 |
| Grystrion.TrackerWO 1.0 | 17 | 6% | 18 |
| lambdaxy.TBot 0.1 | 8 | 3% | 8 |
| divineomega.TrialBot 0.003 | 7 | 3% | 11 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 1% | 2 |

## Melee bench: F16

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 71.1 | 59 / 350 | 3.60 | 13.8% | 34822 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 17.9% | 154 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.3 | 14.7% | 22 |
| hadur117.nano.SanaroK80 0.3 | 2.7 | 13.8% | 59 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 11.4% | 75 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.7% | 24 |
| bvh.fnr.Fenrir 0.36l | 5.8 | 9.4% | 2 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.7% | 6 |
| divineomega.DivineBot 1.9.4.5 | 8.5 | 5.4% | 5 |
| repositorio.NanoStep 1.0 | 8.9 | 5.3% | 0 |
| asd.Cthulhu 1.3 | 9.5 | 4.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 77.5 | 6 / 35 | 4014 |
| 2 | 3 | 60.3 | 70.8 | 6 / 35 | 3319 |
| 3 | 2 | 60.7 | 72.4 | 3 / 35 | 3387 |
| 4 | 3 | 59.2 | 69.2 | 3 / 35 | 3070 |
| 5 | 2 | 63.1 | 75.6 | 9 / 35 | 3965 |
| 6 | 3 | 61.3 | 72.7 | 8 / 35 | 3417 |
| 7 | 3 | 60.3 | 69.5 | 5 / 35 | 3479 |
| 8 | 3 | 60.3 | 68.9 | 7 / 35 | 3445 |
| 9 | 3 | 60.0 | 68.3 | 5 / 35 | 3188 |
| 10 | 3 | 59.7 | 66.0 | 7 / 35 | 3538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 91 | 29% |
| techdude.forest.FlamingForest 1.1 | 30 | 27% |
| tvv.nano.Polaris 1.2 | 16 | 19% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 12 | 75% |
| divineomega.DivineBot 1.9.4.5 | 7 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 75% |
| bvh.fnr.Fenrir 0.36l | 3 | 100% |
| asd.Cthulhu 1.3 | 2 | 0% |

Hadur died in 291 of 350 rounds, at a mean tick of 1376. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 133 | 46% | 160 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 40 | 14% | 48 |
| techdude.forest.FlamingForest 1.1 | 35 | 12% | 44 |
| bvh.fnr.Fenrir 0.36l | 28 | 10% | 30 |
| tvv.nano.Polaris 1.2 | 24 | 8% | 24 |
| asd.Cthulhu 1.3 | 11 | 4% | 12 |
| stelo.IntrinsicVolatility 1.4 | 10 | 3% | 13 |
| divineomega.DivineBot 1.9.4.5 | 7 | 2% | 15 |
| repositorio.NanoStep 1.0 | 3 | 1% | 4 |

## Melee bench: F17

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 67.1 | 79 / 350 | 3.96 | 13.0% | 31938 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.6 | 14.2% | 66 |
| oog.melee.Mercutio 1.0 | 2.1 | 14.1% | 86 |
| hadur117.nano.SanaroK80 0.3 | 3.4 | 13.0% | 79 |
| cx.BlestPain 1.41 | 3.6 | 12.9% | 56 |
| nic.Nicator 2.4 | 4.9 | 11.7% | 30 |
| ahf.NanoAndrew .4 | 5.5 | 11.2% | 29 |
| maribo.melee.BMV 0.1 | 6.9 | 9.1% | 3 |
| tex.Longbot 0.4 | 8.3 | 5.8% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.4% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.6 | 69.2 | 10 / 35 | 3516 |
| 2 | 5 | 58.7 | 66.0 | 4 / 35 | 3099 |
| 3 | 1 | 63.3 | 76.2 | 12 / 35 | 3640 |
| 4 | 3 | 60.6 | 67.9 | 9 / 35 | 3617 |
| 5 | 5 | 55.7 | 60.0 | 6 / 35 | 2585 |
| 6 | 3 | 60.3 | 69.2 | 8 / 35 | 3329 |
| 7 | 4 | 57.8 | 63.8 | 7 / 35 | 2963 |
| 8 | 3 | 58.2 | 65.7 | 5 / 35 | 3101 |
| 9 | 5 | 58.4 | 64.1 | 9 / 35 | 3031 |
| 10 | 3 | 59.9 | 69.2 | 9 / 35 | 3057 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 45 | 33% |
| oog.melee.Mercutio 1.0 | 31 | 58% |
| cx.BlestPain 1.41 | 30 | 87% |
| nic.Nicator 2.4 | 16 | 63% |
| ahf.NanoAndrew .4 | 12 | 75% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 0% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 271 of 350 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 62 | 23% | 79 |
| oog.melee.Mercutio 1.0 | 51 | 19% | 69 |
| nic.Nicator 2.4 | 45 | 17% | 55 |
| cx.BlestPain 1.41 | 43 | 16% | 68 |
| ahf.NanoAndrew .4 | 35 | 13% | 43 |
| maribo.melee.BMV 0.1 | 17 | 6% | 18 |
| tex.Longbot 0.4 | 12 | 4% | 12 |
| edu.otg.spr.TheTeacher 1.2 | 5 | 2% | 5 |
| goblin.Bender 2.4 | 1 | 0% | 1 |

## Melee bench: F18

hadur117.nano.SanaroK80 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 78.3 | 127 / 350 | 2.74 | 16.3% | 28314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroK80 0.3 | 1.2 | 16.3% | 127 |
| agd.Mooserwirt2 2.7 | 2.2 | 15.2% | 87 |
| uji.DBH 1.1 | 3.7 | 12.6% | 37 |
| spinnercat.Robovirus 2.718 | 3.8 | 12.4% | 26 |
| ratosh.Nobo 0.21 | 4.3 | 12.2% | 12 |
| sigterm.Sigterm 1.0 | 6.1 | 9.8% | 31 |
| kawigi.mini.Fhqwhgads 1.1 | 6.8 | 8.8% | 15 |
| stelo.WangRobot 1.0 | 8.4 | 6.6% | 14 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.5 | 6.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.8 | 76.4 | 15 / 35 | 2496 |
| 2 | 1 | 62.3 | 81.1 | 9 / 35 | 2871 |
| 3 | 2 | 62.5 | 77.5 | 15 / 35 | 2864 |
| 4 | 1 | 63.6 | 83.2 | 16 / 35 | 2935 |
| 5 | 1 | 62.4 | 77.5 | 12 / 35 | 3161 |
| 6 | 1 | 60.5 | 74.6 | 11 / 35 | 3082 |
| 7 | 1 | 60.6 | 74.6 | 11 / 35 | 3046 |
| 8 | 1 | 62.0 | 81.4 | 13 / 35 | 2608 |
| 9 | 1 | 62.0 | 78.9 | 13 / 35 | 2877 |
| 10 | 2 | 60.6 | 77.1 | 12 / 35 | 2374 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 72 | 64% |
| uji.DBH 1.1 | 44 | 57% |
| spinnercat.Robovirus 2.718 | 34 | 91% |
| sigterm.Sigterm 1.0 | 22 | 45% |
| kawigi.mini.Fhqwhgads 1.1 | 14 | 57% |
| stelo.WangRobot 1.0 | 10 | 20% |
| ratosh.Nobo 0.21 | 10 | 50% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 0% |

Hadur died in 224 of 350 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 58 | 26% | 109 |
| uji.DBH 1.1 | 38 | 17% | 51 |
| ratosh.Nobo 0.21 | 34 | 15% | 46 |
| sigterm.Sigterm 1.0 | 27 | 12% | 38 |
| spinnercat.Robovirus 2.718 | 24 | 11% | 44 |
| kawigi.mini.Fhqwhgads 1.1 | 16 | 7% | 26 |
| stelo.WangRobot 1.0 | 16 | 7% | 21 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 11 | 5% | 15 |

## Melee bench: F19

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 82.5 | 123 / 350 | 2.57 | 15.8% | 34842 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mld.Infinity 2.2 | 1.8 | 16.3% | 120 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 16.0% | 79 |
| hadur117.nano.SanaroK80 0.3 | 2.2 | 15.8% | 123 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.3% | 5 |
| erdnis.Rover 0.3 | 5.0 | 10.4% | 8 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.4% | 5 |
| pac.ABC 2.1 | 7.0 | 7.6% | 10 |
| mbh.Mbh 0.1 | 7.6 | 7.2% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.8% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 83.5 | 11 / 35 | 3644 |
| 2 | 3 | 64.4 | 81.0 | 10 / 35 | 3311 |
| 3 | 2 | 65.9 | 84.8 | 14 / 35 | 3631 |
| 4 | 2 | 65.0 | 81.0 | 16 / 35 | 3423 |
| 5 | 3 | 64.2 | 77.5 | 10 / 35 | 3621 |
| 6 | 2 | 64.6 | 81.6 | 10 / 35 | 3424 |
| 7 | 1 | 66.2 | 86.7 | 16 / 35 | 3372 |
| 8 | 3 | 64.3 | 81.6 | 10 / 35 | 3412 |
| 9 | 3 | 63.9 | 81.9 | 7 / 35 | 3194 |
| 10 | 1 | 66.9 | 86.0 | 19 / 35 | 3810 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 105 | 47% |
| davidalves.net.DuelistMiniMelee 1.2 | 81 | 52% |
| krillr.mini.JointStrike 2.0.0 | 14 | 93% |
| pac.ABC 2.1 | 9 | 56% |
| patson.PatsonTestBot 1.0 | 7 | 57% |
| erdnis.Rover 0.3 | 7 | 71% |
| pbg.R2D2 1.0 | 5 | 100% |

Hadur died in 227 of 350 rounds, at a mean tick of 1233. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 94 | 41% | 176 |
| mld.Infinity 2.2 | 76 | 33% | 39 |
| krillr.mini.JointStrike 2.0.0 | 17 | 7% | 47 |
| erdnis.Rover 0.3 | 12 | 5% | 20 |
| patson.PatsonTestBot 1.0 | 10 | 4% | 20 |
| pac.ABC 2.1 | 9 | 4% | 19 |
| mbh.Mbh 0.1 | 7 | 3% | 13 |
| pbg.R2D2 1.0 | 2 | 1% | 12 |

## Melee bench: F20

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 76.0 | 106 / 350 | 3.16 | 14.6% | 32591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.4% | 131 |
| hadur117.nano.SanaroK80 0.3 | 2.0 | 14.6% | 106 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.8% | 23 |
| fwb.Nine 1.0.1 | 3.9 | 11.5% | 37 |
| catcat20.Rabbit 0.001 | 4.7 | 10.4% | 32 |
| m3thos.mini.Eva01 0.5.5 | 6.4 | 8.8% | 5 |
| djdjdj.NanoSkunk10 1.0 | 7.2 | 8.2% | 8 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.8% | 9 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 79.7 | 15 / 35 | 3411 |
| 2 | 2 | 61.1 | 74.6 | 9 / 35 | 3178 |
| 3 | 2 | 61.1 | 74.6 | 8 / 35 | 3199 |
| 4 | 2 | 63.2 | 79.0 | 10 / 35 | 3451 |
| 5 | 2 | 60.9 | 70.2 | 9 / 35 | 3353 |
| 6 | 2 | 62.7 | 79.0 | 11 / 35 | 3256 |
| 7 | 2 | 61.3 | 72.7 | 9 / 35 | 3263 |
| 8 | 2 | 63.5 | 78.4 | 15 / 35 | 3448 |
| 9 | 2 | 62.8 | 79.0 | 12 / 35 | 3116 |
| 10 | 2 | 59.8 | 72.4 | 8 / 35 | 2916 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 84 | 44% |
| catcat20.Rabbit 0.001 | 28 | 75% |
| fwb.Nine 1.0.1 | 28 | 64% |
| nz.jdc.nano.GridFu 1.0 | 18 | 67% |
| djdjdj.NanoSkunk10 1.0 | 11 | 73% |
| bayen.nut.Squirrel 1.615 | 6 | 100% |
| m3thos.mini.Eva01 0.5.5 | 5 | 80% |

Hadur died in 245 of 350 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 110 | 45% | 142 |
| fwb.Nine 1.0.1 | 41 | 17% | 42 |
| nz.jdc.nano.GridFu 1.0 | 24 | 10% | 39 |
| catcat20.Rabbit 0.001 | 22 | 9% | 50 |
| bayen.nut.Squirrel 1.615 | 20 | 8% | 28 |
| m3thos.mini.Eva01 0.5.5 | 12 | 5% | 17 |
| djdjdj.NanoSkunk10 1.0 | 10 | 4% | 21 |
| ntc.ControlledChaos 1.1.4 | 3 | 1% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.8 | 138 / 350 | 2.28 | 17.3% | 44197 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroK80 0.3 | 1.5 | 17.3% | 138 |
| eem.EvBot v4.6.16 | 1.5 | 17.4% | 152 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.6% | 30 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.5% | 8 |
| eld.Hmm 1.0 | 5.2 | 8.8% | 22 |
| oa.weak.BotherBot 0.1 | 5.8 | 8.5% | 2 |
| fire219.CatBot 1.0 | 7.6 | 6.3% | 0 |
| el.JumpShoot 0.2 | 7.9 | 6.0% | 2 |
| PSW.Relentless 0.1 | 8.7 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 88.6 | 17 / 35 | 4530 |
| 2 | 2 | 66.0 | 81.9 | 12 / 35 | 4503 |
| 3 | 1 | 67.9 | 88.6 | 15 / 35 | 4685 |
| 4 | 1 | 67.6 | 87.0 | 15 / 35 | 4459 |
| 5 | 1 | 68.1 | 89.5 | 18 / 35 | 4239 |
| 6 | 1 | 67.3 | 88.3 | 12 / 35 | 4508 |
| 7 | 2 | 66.6 | 85.7 | 14 / 35 | 4255 |
| 8 | 2 | 65.8 | 80.3 | 10 / 35 | 4558 |
| 9 | 2 | 66.6 | 84.1 | 13 / 35 | 4373 |
| 10 | 2 | 65.7 | 83.8 | 12 / 35 | 4087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 175 | 45% |
| dummy.mini.Scimitar 1.01 | 38 | 71% |
| eld.Hmm 1.0 | 23 | 61% |
| cf.RiO.RiOx 4.2.1 | 14 | 71% |
| oa.weak.BotherBot 0.1 | 7 | 100% |
| el.JumpShoot 0.2 | 2 | 50% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 212 of 350 rounds, at a mean tick of 1537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 122 | 58% | 180 |
| dummy.mini.Scimitar 1.01 | 34 | 16% | 74 |
| cf.RiO.RiOx 4.2.1 | 24 | 11% | 33 |
| eld.Hmm 1.0 | 15 | 7% | 35 |
| arthord.MannyPacquiao Beta | 5 | 2% | 5 |
| fire219.CatBot 1.0 | 4 | 2% | 4 |
| el.JumpShoot 0.2 | 3 | 1% | 5 |
| PSW.Relentless 0.1 | 3 | 1% | 3 |
| oa.weak.BotherBot 0.1 | 2 | 1% | 11 |

## Melee bench: F23

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 82.5 | 131 / 350 | 2.57 | 16.2% | 37412 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.1 | 18.1% | 126 |
| hadur117.nano.SanaroK80 0.3 | 2.1 | 16.2% | 131 |
| cre.Karolos 0.32 | 2.9 | 14.7% | 57 |
| stelo.AreaTargetingBot 1.1 | 3.9 | 11.5% | 22 |
| stelo.RamTrackSurfer 1.2 | 5.9 | 9.0% | 10 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 9.0% | 4 |
| cw.megas.Blade 0.8 | 6.8 | 8.5% | 0 |
| sample.Walls 1.0 | 7.3 | 8.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.1 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 9.9 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.4 | 86.7 | 13 / 35 | 3983 |
| 2 | 1 | 67.9 | 89.8 | 18 / 35 | 4010 |
| 3 | 2 | 66.2 | 83.2 | 13 / 35 | 3541 |
| 4 | 3 | 63.7 | 74.3 | 5 / 35 | 3754 |
| 5 | 2 | 65.5 | 81.6 | 11 / 35 | 3471 |
| 6 | 2 | 66.8 | 84.8 | 12 / 35 | 4133 |
| 7 | 2 | 65.7 | 83.5 | 14 / 35 | 3340 |
| 8 | 3 | 64.2 | 78.4 | 12 / 35 | 3756 |
| 9 | 2 | 65.5 | 79.4 | 15 / 35 | 3717 |
| 10 | 2 | 66.6 | 83.8 | 18 / 35 | 3707 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 114 | 61% |
| cre.Karolos 0.32 | 49 | 45% |
| stelo.AreaTargetingBot 1.1 | 26 | 62% |
| stelo.RamTrackSurfer 1.2 | 9 | 56% |
| sample.Walls 1.0 | 9 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 89% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 221 of 350 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 110 | 50% | 180 |
| cre.Karolos 0.32 | 56 | 25% | 83 |
| stelo.AreaTargetingBot 1.1 | 30 | 14% | 42 |
| stelo.RamTrackSurfer 1.2 | 10 | 5% | 17 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 3% | 14 |
| sample.Walls 1.0 | 6 | 3% | 10 |
| cw.megas.Blade 0.8 | 2 | 1% | 4 |

## Melee bench: F24

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.8 | 61.2 | 45 / 350 | 4.49 | 11.2% | 23179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.8 | 14.7% | 87 |
| florent.XSeries.X2 0.12 | 1.8 | 14.0% | 82 |
| davidalves.Phoenix 0.54 | 2.6 | 13.6% | 75 |
| pedersen.Ugluk 1.1.1 | 4.1 | 12.2% | 34 |
| hadur117.nano.SanaroK80 0.3 | 4.7 | 11.2% | 45 |
| oog.melee.Corsair 1.0 | 6.2 | 9.2% | 8 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.8% | 17 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.6% | 2 |
| as.FrankTheTank 1.3 | 9.0 | 5.2% | 1 |
| evd.X1 0.01 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.8 | 61.9 | 4 / 35 | 2417 |
| 2 | 5 | 50.9 | 52.7 | 3 / 35 | 2243 |
| 3 | 5 | 52.8 | 58.4 | 0 / 35 | 2226 |
| 4 | 4 | 54.2 | 59.0 | 6 / 35 | 2031 |
| 5 | 5 | 55.7 | 64.4 | 5 / 35 | 2373 |
| 6 | 5 | 56.6 | 63.8 | 5 / 35 | 2482 |
| 7 | 5 | 55.6 | 62.5 | 4 / 35 | 2431 |
| 8 | 5 | 54.7 | 57.5 | 10 / 35 | 2149 |
| 9 | 4 | 56.4 | 66.7 | 3 / 35 | 2444 |
| 10 | 4 | 56.5 | 65.1 | 5 / 35 | 2383 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 28 | 61% |
| davidalves.Phoenix 0.54 | 26 | 31% |
| florent.XSeries.X2 0.12 | 19 | 47% |
| pedersen.Ugluk 1.1.1 | 14 | 57% |
| stelo.SoJNanoMelee 1.1 | 7 | 14% |
| oog.melee.Corsair 1.0 | 2 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 0% |

Hadur died in 306 of 350 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 62 | 20% | 79 |
| florent.XSeries.X2 0.12 | 61 | 20% | 67 |
| davidalves.Phoenix 0.54 | 60 | 20% | 64 |
| pedersen.Ugluk 1.1.1 | 49 | 16% | 56 |
| stelo.SoJNanoMelee 1.1 | 23 | 8% | 25 |
| oog.melee.Corsair 1.0 | 17 | 6% | 22 |
| evd.X1 0.01 | 15 | 5% | 16 |
| lunchie.Lunchbox 0.93 | 13 | 4% | 14 |
| as.FrankTheTank 1.3 | 5 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.nano.SanaroK80 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 72.8 | 84 / 350 | 3.17 | 15.0% | 24030 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.8 | 15.9% | 90 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 15.4% | 69 |
| hadur117.nano.SanaroK80 0.3 | 2.4 | 15.0% | 84 |
| jdw.Hurricane 1.4 | 3.5 | 13.5% | 52 |
| ds.Oo 2.2 | 5.4 | 10.6% | 27 |
| gjr.Cephalosporin 0.1 | 5.7 | 9.9% | 21 |
| adt.Ar2 1.1 | 7.2 | 7.7% | 4 |
| awesomeness.Elite 1.0 | 7.7 | 7.4% | 4 |
| amk.ChumbaMini 0.2 | 9.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.4 | 72.5 | 7 / 35 | 2410 |
| 2 | 4 | 58.8 | 69.3 | 9 / 35 | 2151 |
| 3 | 3 | 57.7 | 67.5 | 4 / 35 | 2386 |
| 4 | 2 | 59.5 | 72.1 | 9 / 35 | 2519 |
| 5 | 2 | 60.4 | 74.3 | 10 / 35 | 2373 |
| 6 | 2 | 60.8 | 76.1 | 10 / 35 | 2338 |
| 7 | 2 | 61.7 | 77.9 | 10 / 35 | 2465 |
| 8 | 2 | 61.7 | 77.1 | 8 / 35 | 2608 |
| 9 | 1 | 61.9 | 77.9 | 12 / 35 | 2423 |
| 10 | 4 | 55.8 | 63.6 | 5 / 35 | 2357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 61 | 23% |
| voidious.micro.BlitzBat 1.05 | 49 | 29% |
| jdw.Hurricane 1.4 | 32 | 78% |
| ds.Oo 2.2 | 18 | 50% |
| gjr.Cephalosporin 0.1 | 17 | 71% |
| adt.Ar2 1.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |

Hadur died in 267 of 350 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 94 | 35% | 113 |
| voidious.micro.BlitzBat 1.05 | 74 | 28% | 93 |
| jdw.Hurricane 1.4 | 33 | 12% | 50 |
| ds.Oo 2.2 | 22 | 8% | 31 |
| adt.Ar2 1.1 | 18 | 7% | 22 |
| gjr.Cephalosporin 0.1 | 12 | 4% | 22 |
| awesomeness.Elite 1.0 | 9 | 3% | 15 |
| amk.ChumbaMini 0.2 | 4 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 71.7 | 66 / 350 | 3.55 | 13.2% | 31786 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.7% | 128 |
| hadur117.nano.SanaroK80 0.3 | 2.8 | 13.2% | 66 |
| shu.nitro.LENIN .T34 | 2.8 | 13.4% | 81 |
| lrem.Spectre 0.4.4 | 4.2 | 11.8% | 32 |
| js.PinBall 1.6 | 5.2 | 11.0% | 18 |
| gh.mini.GrubbmOne 1.0 | 5.6 | 10.9% | 11 |
| jaybot.adv.bots.JayBot 2.0 | 6.4 | 9.7% | 12 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.3% | 4 |
| sample.SpinBot 1.0 | 8.9 | 5.2% | 2 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 75.9 | 7 / 35 | 3311 |
| 2 | 3 | 58.6 | 67.3 | 4 / 35 | 2909 |
| 3 | 2 | 60.9 | 73.3 | 8 / 35 | 3329 |
| 4 | 3 | 59.5 | 69.8 | 6 / 35 | 3260 |
| 5 | 5 | 58.2 | 67.0 | 4 / 35 | 3051 |
| 6 | 2 | 61.5 | 74.3 | 9 / 35 | 3333 |
| 7 | 2 | 62.2 | 75.9 | 9 / 35 | 3320 |
| 8 | 3 | 60.0 | 71.1 | 6 / 35 | 3302 |
| 9 | 3 | 59.7 | 71.7 | 6 / 35 | 3124 |
| 10 | 3 | 59.8 | 70.5 | 7 / 35 | 2847 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 62 | 27% |
| shu.nitro.LENIN .T34 | 46 | 41% |
| lrem.Spectre 0.4.4 | 21 | 57% |
| js.PinBall 1.6 | 10 | 90% |
| gh.mini.GrubbmOne 1.0 | 7 | 71% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 287 of 350 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 93 | 32% | 109 |
| shu.nitro.LENIN .T34 | 51 | 18% | 70 |
| gh.mini.GrubbmOne 1.0 | 40 | 14% | 45 |
| js.PinBall 1.6 | 38 | 13% | 47 |
| lrem.Spectre 0.4.4 | 33 | 11% | 45 |
| jaybot.adv.bots.JayBot 2.0 | 16 | 6% | 17 |
| sample.SpinBot 1.0 | 8 | 3% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 2% | 9 |
2 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 68.9 | 116 / 350 | 3.80 | 13.5% | 29041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.3 | 15.5% | 109 |
| hadur117.nano.SanaroK80 0.3 | 2.1 | 13.5% | 116 |
| wee.Gem 1.8.4 | 3.5 | 12.1% | 60 |
| sheldor.melee.nano.TestMelee 0.1 | 4.3 | 11.5% | 33 |
| EH.Eagle 1.0.6 | 4.5 | 11.0% | 11 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 9.3% | 9 |
| joe.ADinosaur 1.0 | 6.4 | 8.8% | 5 |
| throxbot.ThroxBot 0.1 | 7.9 | 7.7% | 7 |
| caimano.Furia_Ceca 0.22 | 8.9 | 6.5% | 3 |
| cs.Grudge 1.0 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 78.4 | 12 / 35 | 2937 |
| 2 | 1 | 60.6 | 73.7 | 13 / 35 | 2746 |
| 3 | 5 | 50.7 | 37.8 | 5 / 35 | 3770 |
| 4 | 3 | 56.8 | 63.2 | 13 / 35 | 2187 |
| 5 | 2 | 59.2 | 71.7 | 10 / 35 | 2676 |
| 6 | 2 | 61.9 | 77.8 | 14 / 35 | 2701 |
| 7 | 1 | 63.4 | 81.0 | 18 / 35 | 2844 |
| 8 | 2 | 58.0 | 69.5 | 8 / 35 | 2356 |
| 9 | 1 | 63.4 | 81.3 | 15 / 35 | 3012 |
| 10 | 2 | 57.3 | 54.9 | 8 / 35 | 3812 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 79 | 76% |
| wee.Gem 1.8.4 | 42 | 55% |
| sheldor.melee.nano.TestMelee 0.1 | 21 | 52% |
| EH.Eagle 1.0.6 | 13 | 92% |
| techdude.kombat.FlamingKombat 1.5 | 11 | 73% |
| joe.ADinosaur 1.0 | 3 | 33% |
| throxbot.ThroxBot 0.1 | 1 | 0% |

Hadur died in 235 of 350 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 60 | 26% | 117 |
| wee.Gem 1.8.4 | 44 | 19% | 66 |
| sheldor.melee.nano.TestMelee 0.1 | 37 | 16% | 52 |
| joe.ADinosaur 1.0 | 27 | 11% | 28 |
| EH.Eagle 1.0.6 | 18 | 8% | 33 |
| techdude.kombat.FlamingKombat 1.5 | 15 | 6% | 17 |
| cs.Grudge 1.0 | 14 | 6% | 14 |
| throxbot.ThroxBot 0.1 | 11 | 5% | 13 |
| caimano.Furia_Ceca 0.22 | 9 | 4% | 9 |

## Melee bench: F28

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 80.6 | 131 / 350 | 2.75 | 15.6% | 32125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.1 | 16.8% | 119 |
| hadur117.nano.SanaroK80 0.3 | 1.9 | 15.6% | 131 |
| uji.Antique 1.0 | 3.1 | 12.4% | 54 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.4% | 24 |
| pfvicm.Sobieski 7.2.3b | 4.9 | 10.0% | 7 |
| amk.ChumbaWumba 0.3 | 6.5 | 7.9% | 5 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.7% | 6 |
| matt.advanced.Katana 1.0 | 8.6 | 6.3% | 4 |
| stelo.PianistNano 1.2 | 9.0 | 6.0% | 1 |
| stelo.Lifestealer 1.0 | 9.2 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 85.1 | 17 / 35 | 3377 |
| 2 | 2 | 63.7 | 81.3 | 16 / 35 | 2977 |
| 3 | 2 | 63.0 | 79.0 | 14 / 35 | 2981 |
| 4 | 2 | 63.5 | 79.7 | 16 / 35 | 3154 |
| 5 | 2 | 63.0 | 80.3 | 8 / 35 | 3389 |
| 6 | 2 | 62.6 | 77.5 | 14 / 35 | 3159 |
| 7 | 2 | 64.0 | 82.5 | 13 / 35 | 3037 |
| 8 | 2 | 64.7 | 83.2 | 11 / 35 | 3427 |
| 9 | 2 | 62.8 | 78.7 | 11 / 35 | 3177 |
| 10 | 2 | 63.0 | 78.4 | 11 / 35 | 3447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 133 | 53% |
| uji.Antique 1.0 | 45 | 78% |
| qohnil.blot.BlotBot 3.61 | 24 | 63% |
| pfvicm.Sobieski 7.2.3b | 6 | 67% |
| ahr.ice.Ice 1.0.2 | 5 | 80% |
| amk.ChumbaWumba 0.3 | 4 | 50% |
| matt.advanced.Katana 1.0 | 2 | 0% |

Hadur died in 220 of 350 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 104 | 47% | 148 |
| uji.Antique 1.0 | 33 | 15% | 79 |
| pfvicm.Sobieski 7.2.3b | 28 | 13% | 33 |
| amk.ChumbaWumba 0.3 | 19 | 9% | 22 |
| qohnil.blot.BlotBot 3.61 | 18 | 8% | 36 |
| ahr.ice.Ice 1.0.2 | 8 | 4% | 15 |
| stelo.PianistNano 1.2 | 4 | 2% | 4 |
| matt.advanced.Katana 1.0 | 3 | 1% | 8 |
| stelo.Lifestealer 1.0 | 2 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 70.1 | 71 / 350 | 3.69 | 13.5% | 29688 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.7 | 15.8% | 118 |
| zyx.mega.YersiniaPestis 3.1 | 1.7 | 15.3% | 81 |
| hadur117.nano.SanaroK80 0.3 | 3.1 | 13.5% | 71 |
| myl.micro.Troodon 1.10 | 3.7 | 12.9% | 29 |
| jok.PheonixM 0.1.2 | 4.8 | 11.0% | 12 |
| DBall.Anarchy 0.1 | 6.4 | 8.4% | 32 |
| ph.melee.ArcherME 0.3 | 6.6 | 8.2% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 6.1% | 0 |
| ap.Frederick 1.1 | 9.3 | 4.6% | 4 |
| jangs.ns51 1.0 | 9.7 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 78.7 | 9 / 35 | 3200 |
| 2 | 3 | 61.5 | 71.1 | 9 / 35 | 3177 |
| 3 | 4 | 60.2 | 67.9 | 6 / 35 | 3081 |
| 4 | 3 | 59.7 | 70.2 | 5 / 35 | 2899 |
| 5 | 4 | 59.2 | 66.0 | 6 / 35 | 2938 |
| 6 | 1 | 62.7 | 75.9 | 11 / 35 | 3149 |
| 7 | 3 | 60.6 | 69.8 | 7 / 35 | 3020 |
| 8 | 3 | 61.7 | 74.9 | 8 / 35 | 2941 |
| 9 | 4 | 59.2 | 67.9 | 8 / 35 | 2630 |
| 10 | 4 | 54.7 | 58.1 | 2 / 35 | 2653 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 60 | 12% |
| zyx.mega.YersiniaPestis 3.1 | 39 | 59% |
| myl.micro.Troodon 1.10 | 31 | 77% |
| DBall.Anarchy 0.1 | 17 | 47% |
| jok.PheonixM 0.1.2 | 9 | 89% |
| ph.melee.ArcherME 0.3 | 2 | 50% |

Hadur died in 279 of 350 rounds, at a mean tick of 1156. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 120 | 43% | 131 |
| zyx.mega.YersiniaPestis 3.1 | 52 | 19% | 73 |
| myl.micro.Troodon 1.10 | 43 | 15% | 65 |
| jok.PheonixM 0.1.2 | 25 | 9% | 33 |
| DBall.Anarchy 0.1 | 16 | 6% | 24 |
| ph.melee.ArcherME 0.3 | 11 | 4% | 12 |
| fullsail.TimbotNoPrediction 1.0 | 9 | 3% | 9 |
| jangs.ns51 1.0 | 3 | 1% | 3 |

## Melee bench: F30

hadur117.nano.SanaroK80 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.1 | 60.5 | 40 / 350 | 4.16 | 12.4% | 25291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 1.7 | 16.3% | 122 |
| oog.melee.Capulet 1.2 | 2.0 | 16.1% | 87 |
| stelo.PastFuture 2.3.2 | 2.3 | 15.4% | 53 |
| hadur117.nano.SanaroK80 0.3 | 4.2 | 12.4% | 40 |
| intruder.PrairieWolf 2.61 | 5.1 | 10.7% | 24 |
| ntc.Opposite 1.5 | 6.4 | 8.8% | 2 |
| tripphippy.Alice 1.1 | 6.9 | 8.9% | 11 |
| fowl3628800.LightningBolt 2.6.0 | 7.4 | 8.3% | 11 |
| GarmBox.Anger 1.0 | 9.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.7 | 62.9 | 5 / 35 | 2263 |
| 2 | 4 | 52.8 | 59.6 | 2 / 35 | 1947 |
| 3 | 4 | 58.0 | 67.9 | 3 / 35 | 2953 |
| 4 | 4 | 56.7 | 63.2 | 8 / 35 | 2642 |
| 5 | 5 | 54.7 | 59.3 | 4 / 35 | 2622 |
| 6 | 4 | 53.4 | 56.8 | 4 / 35 | 2311 |
| 7 | 5 | 53.6 | 53.9 | 4 / 35 | 2834 |
| 8 | 4 | 55.4 | 62.1 | 4 / 35 | 2400 |
| 9 | 4 | 54.4 | 57.9 | 2 / 35 | 2513 |
| 10 | 4 | 56.6 | 61.4 | 4 / 35 | 2806 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 38 | 29% |
| oog.melee.Capulet 1.2 | 36 | 19% |
| stelo.PastFuture 2.3.2 | 23 | 57% |
| intruder.PrairieWolf 2.61 | 10 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 75% |
| tripphippy.Alice 1.1 | 3 | 33% |
| ntc.Opposite 1.5 | 1 | 0% |

Hadur died in 310 of 350 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 80 | 26% | 90 |
| oog.melee.Capulet 1.2 | 66 | 21% | 77 |
| stelo.PastFuture 2.3.2 | 60 | 19% | 72 |
| ntc.Opposite 1.5 | 30 | 10% | 30 |
| fowl3628800.LightningBolt 2.6.0 | 25 | 8% | 27 |
| tripphippy.Alice 1.1 | 23 | 7% | 24 |
| intruder.PrairieWolf 2.61 | 22 | 7% | 26 |
| GarmBox.Anger 1.0 | 4 | 1% | 4 |

## Melee bench: F31

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.4 | 62.3 | 38 / 350 | 4.39 | 11.3% | 23132 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.0% | 160 |
| gh.mini.Griezel 0.2 | 2.1 | 13.9% | 91 |
| d414.nano.Quantum 1.0.0 | 3.7 | 11.7% | 23 |
| spinnercat.micro.Tyger 0.1 | 3.9 | 11.8% | 27 |
| hadur117.nano.SanaroK80 0.3 | 4.5 | 11.3% | 38 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.4% | 9 |
| fm.mammillarias 1.3 | 7.5 | 6.7% | 0 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.8% | 2 |
| tlp.ThreeLeggedPig 1 | 9.5 | 5.1% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.6 | 69.5 | 6 / 35 | 2549 |
| 2 | 5 | 53.7 | 57.5 | 4 / 35 | 2147 |
| 3 | 3 | 56.3 | 64.8 | 5 / 35 | 2317 |
| 4 | 3 | 60.9 | 75.6 | 7 / 35 | 2559 |
| 5 | 5 | 54.9 | 59.4 | 2 / 35 | 2560 |
| 6 | 5 | 54.8 | 61.6 | 2 / 35 | 2286 |
| 7 | 6 | 51.6 | 53.7 | 2 / 35 | 2051 |
| 8 | 5 | 53.9 | 57.8 | 5 / 35 | 2164 |
| 9 | 6 | 51.1 | 53.0 | 1 / 35 | 2212 |
| 10 | 4 | 58.0 | 70.2 | 4 / 35 | 2287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 46 | 33% |
| abc.Shadow 3.84i | 46 | 43% |
| spinnercat.micro.Tyger 0.1 | 9 | 11% |
| d414.nano.Quantum 1.0.0 | 5 | 0% |
| gh.nano.Grofvuil 0.2 | 4 | 50% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |

Hadur died in 312 of 350 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 91 | 29% | 107 |
| abc.Shadow 3.84i | 64 | 21% | 83 |
| d414.nano.Quantum 1.0.0 | 51 | 16% | 52 |
| spinnercat.micro.Tyger 0.1 | 48 | 15% | 50 |
| gh.nano.Grofvuil 0.2 | 21 | 7% | 24 |
| fm.mammillarias 1.3 | 16 | 5% | 16 |
| timmit.nano.TimDog 0.33 | 13 | 4% | 11 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 3 | 1% | 2 |

## Melee bench: F32

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 74.7 | 138 / 350 | 3.27 | 14.4% | 30761 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.7 | 14.9% | 98 |
| hadur117.nano.SanaroK80 0.3 | 1.8 | 14.4% | 138 |
| apc.botM 3.0 | 2.5 | 13.1% | 51 |
| vjik.UnViolation 1.1 | 4.4 | 11.3% | 33 |
| lxx.ConceptA 0.8 | 5.1 | 10.6% | 7 |
| bayen.UbaMicro 1.4 | 5.6 | 9.5% | 10 |
| panzer.Panzer 0.2 | 7.3 | 7.7% | 0 |
| yk.JahMicro 1.0 | 8.1 | 7.0% | 8 |
| conscience.Electron 1.3g | 8.8 | 6.1% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.4% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 74.3 | 16 / 35 | 2948 |
| 2 | 2 | 60.6 | 73.3 | 12 / 35 | 2905 |
| 3 | 1 | 64.0 | 82.2 | 19 / 35 | 3286 |
| 4 | 2 | 61.6 | 75.9 | 13 / 35 | 3021 |
| 5 | 2 | 59.3 | 70.8 | 10 / 35 | 3087 |
| 6 | 2 | 61.6 | 74.6 | 13 / 35 | 3119 |
| 7 | 2 | 59.6 | 72.1 | 13 / 35 | 2816 |
| 8 | 1 | 62.6 | 78.4 | 15 / 35 | 3281 |
| 9 | 2 | 60.3 | 71.1 | 12 / 35 | 3052 |
| 10 | 2 | 61.9 | 74.6 | 15 / 35 | 3246 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 71 | 61% |
| apc.botM 3.0 | 45 | 78% |
| vjik.UnViolation 1.1 | 18 | 83% |
| bayen.UbaMicro 1.4 | 16 | 75% |
| lxx.ConceptA 0.8 | 16 | 100% |
| yk.JahMicro 1.0 | 9 | 89% |
| donjezza.Jezza 1.0 | 7 | 71% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 212 of 350 rounds, at a mean tick of 617. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 64 | 30% | 116 |
| lxx.ConceptA 0.8 | 48 | 23% | 55 |
| apc.botM 3.0 | 29 | 14% | 62 |
| bayen.UbaMicro 1.4 | 28 | 13% | 38 |
| vjik.UnViolation 1.1 | 15 | 7% | 34 |
| panzer.Panzer 0.2 | 12 | 6% | 15 |
| conscience.Electron 1.3g | 8 | 4% | 10 |
| yk.JahMicro 1.0 | 5 | 2% | 11 |
| donjezza.Jezza 1.0 | 3 | 1% | 9 |

## Melee bench: F33

hadur117.nano.SanaroK80 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 74.6 | 91 / 350 | 3.03 | 15.9% | 31283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 19.0% | 116 |
| hadur117.nano.SanaroK80 0.3 | 2.4 | 15.9% | 91 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 15.3% | 80 |
| labg.Cataclysm 2.05 | 4.0 | 13.3% | 48 |
| baal.nano.N 1.42 | 5.3 | 9.9% | 4 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.8 | 9.5% | 12 |
| zyx.micro.Ant 1.1 | 7.0 | 6.7% | 1 |
| sanja.First 0.1 | 8.0 | 5.8% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 8.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 82.1 | 14 / 35 | 3515 |
| 2 | 3 | 62.7 | 76.4 | 10 / 35 | 3026 |
| 3 | 3 | 60.2 | 67.1 | 10 / 35 | 3095 |
| 4 | 3 | 59.9 | 68.6 | 7 / 35 | 2863 |
| 5 | 2 | 62.9 | 77.9 | 11 / 35 | 3103 |
| 6 | 2 | 63.1 | 80.0 | 9 / 35 | 3087 |
| 7 | 2 | 63.6 | 79.3 | 10 / 35 | 3289 |
| 8 | 2 | 61.1 | 71.8 | 7 / 35 | 3089 |
| 9 | 2 | 63.0 | 76.8 | 9 / 35 | 3105 |
| 10 | 3 | 59.3 | 66.4 | 4 / 35 | 3111 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 86 | 55% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 60 | 17% |
| labg.Cataclysm 2.05 | 29 | 41% |
| kinsen.melee.Angsaichmophobia 1.8c | 14 | 79% |
| baal.nano.N 1.42 | 7 | 71% |
| sanja.First 0.1 | 5 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 262 of 350 rounds, at a mean tick of 1392. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 98 | 37% | 143 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 77 | 29% | 93 |
| labg.Cataclysm 2.05 | 35 | 13% | 49 |
| kinsen.melee.Angsaichmophobia 1.8c | 25 | 10% | 31 |
| baal.nano.N 1.42 | 14 | 5% | 20 |
| zyx.micro.Ant 1.1 | 10 | 4% | 10 |
| sanja.First 0.1 | 2 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F34

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 74.5 | 61 / 350 | 3.30 | 13.8% | 31615 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.4 | 17.4% | 136 |
| kid.Gladiator .7.2 | 1.6 | 17.1% | 101 |
| hadur117.nano.SanaroK80 0.3 | 3.1 | 13.8% | 61 |
| jcs.Seth 1.8 | 4.3 | 11.6% | 35 |
| tcf.Reach 3 | 4.9 | 11.1% | 13 |
| cli.Dancer 1.1 | 5.7 | 9.9% | 6 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.7% | 0 |
| sample.RamFire 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 73.0 | 5 / 35 | 2837 |
| 2 | 3 | 61.3 | 73.7 | 6 / 35 | 3157 |
| 3 | 3 | 60.9 | 71.7 | 5 / 35 | 3230 |
| 4 | 3 | 62.7 | 78.1 | 7 / 35 | 3268 |
| 5 | 3 | 63.8 | 78.4 | 9 / 35 | 3577 |
| 6 | 3 | 62.0 | 74.9 | 6 / 35 | 3092 |
| 7 | 3 | 62.6 | 78.1 | 7 / 35 | 2958 |
| 8 | 3 | 63.3 | 78.1 | 7 / 35 | 3259 |
| 9 | 3 | 61.9 | 73.3 | 8 / 35 | 3261 |
| 10 | 4 | 57.8 | 65.4 | 1 / 35 | 2976 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 60 | 50% |
| kid.Gladiator .7.2 | 49 | 27% |
| jcs.Seth 1.8 | 20 | 60% |
| tcf.Reach 3 | 9 | 33% |
| cli.Dancer 1.1 | 3 | 33% |
| ratosh.Wesco 1.4 | 2 | 50% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 292 of 350 rounds, at a mean tick of 1023. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 116 | 40% | 123 |
| stelo.Spread 0.9 | 91 | 31% | 120 |
| jcs.Seth 1.8 | 29 | 10% | 41 |
| tcf.Reach 3 | 26 | 9% | 32 |
| cli.Dancer 1.1 | 14 | 5% | 18 |
| ratosh.Wesco 1.4 | 10 | 3% | 11 |
| sample.VelociRobot 1.0 | 2 | 1% | 3 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 68.3 | 19 / 350 | 3.85 | 12.1% | 24677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.6% | 276 |
| gh.mini.Gruwel 0.9 | 2.5 | 13.2% | 36 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.3 | 12.5% | 13 |
| rz.HawkOnFire 0.1 | 3.9 | 12.2% | 4 |
| hadur117.nano.SanaroK80 0.3 | 4.3 | 12.1% | 19 |
| wit.Chuliath 1.0 | 6.9 | 6.8% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.9 | 6.8% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.4% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.5 | 67.3 | 2 / 35 | 2404 |
| 2 | 3 | 59.9 | 72.1 | 6 / 35 | 2557 |
| 3 | 3 | 59.6 | 72.4 | 2 / 35 | 2647 |
| 4 | 4 | 58.1 | 68.9 | 0 / 35 | 2615 |
| 5 | 5 | 58.4 | 68.9 | 2 / 35 | 2423 |
| 6 | 5 | 56.0 | 64.1 | 0 / 35 | 2369 |
| 7 | 4 | 57.9 | 70.5 | 0 / 35 | 2284 |
| 8 | 5 | 56.7 | 64.1 | 2 / 35 | 2478 |
| 9 | 5 | 57.5 | 66.0 | 3 / 35 | 2381 |
| 10 | 5 | 58.2 | 68.9 | 2 / 35 | 2519 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 85 | 0% |
| gh.mini.Gruwel 0.9 | 28 | 39% |
| dmh.robocode.robot.BlackDeath 9.2 | 6 | 33% |
| rz.HawkOnFire 0.1 | 5 | 80% |
| wit.Chuliath 1.0 | 2 | 100% |

Hadur died in 331 of 350 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 153 | 46% | 152 |
| gh.mini.Gruwel 0.9 | 54 | 16% | 66 |
| rz.HawkOnFire 0.1 | 48 | 15% | 52 |
| dmh.robocode.robot.BlackDeath 9.2 | 48 | 15% | 50 |
| myl.nano.KomoriNinja 1.1 | 12 | 4% | 12 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 2% | 6 |
| dans.Cinnamon 1.2 | 5 | 2% | 5 |
| stelo.MyAgileRobot 0.2 | 3 | 1% | 3 |
| wit.Chuliath 1.0 | 2 | 1% | 4 |

## Melee bench: F36

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 77.8 | 132 / 350 | 2.99 | 15.4% | 34254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroK80 0.3 | 1.1 | 15.4% | 132 |
| alpha.RainingFire 1.0 | 2.3 | 13.3% | 62 |
| bzdp.Pansy 2.1 | 3.3 | 12.5% | 46 |
| mz.Cork 0.1 | 3.6 | 11.9% | 42 |
| bvh.micro.Freya 0.3 | 5.0 | 10.9% | 23 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.5% | 17 |
| bvh.mini.Fenrir 0.39 | 6.7 | 8.9% | 9 |
| dl.BetterWalls 1.0 | 8.1 | 7.0% | 4 |
| squidM.TentalceMeleeNano 1.1 | 9.0 | 6.3% | 3 |
| sample.MyFirstRobot 1.0 | 9.9 | 4.2% | 12 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.2 | 73.3 | 10 / 35 | 3267 |
| 2 | 1 | 63.2 | 77.1 | 15 / 35 | 3505 |
| 3 | 1 | 63.4 | 79.7 | 15 / 35 | 3104 |
| 4 | 1 | 61.3 | 73.7 | 10 / 35 | 3320 |
| 5 | 1 | 64.5 | 80.0 | 14 / 35 | 3775 |
| 6 | 1 | 64.2 | 80.0 | 17 / 35 | 3316 |
| 7 | 2 | 62.0 | 74.6 | 13 / 35 | 3180 |
| 8 | 1 | 65.5 | 84.4 | 18 / 35 | 3555 |
| 9 | 1 | 62.2 | 75.9 | 9 / 35 | 3519 |
| 10 | 1 | 63.2 | 79.7 | 11 / 35 | 3713 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| alpha.RainingFire 1.0 | 52 | 52% |
| bzdp.Pansy 2.1 | 49 | 57% |
| mz.Cork 0.1 | 42 | 67% |
| bvh.micro.Freya 0.3 | 37 | 76% |
| m3thos.Eva02 0.7.1 | 14 | 64% |
| bvh.mini.Fenrir 0.39 | 8 | 75% |
| sample.MyFirstRobot 1.0 | 7 | 0% |
| dl.BetterWalls 1.0 | 4 | 75% |
| squidM.TentalceMeleeNano 1.1 | 4 | 50% |

Hadur died in 218 of 350 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 52 | 24% | 75 |
| bzdp.Pansy 2.1 | 45 | 21% | 75 |
| mz.Cork 0.1 | 34 | 16% | 65 |
| bvh.mini.Fenrir 0.39 | 21 | 10% | 23 |
| m3thos.Eva02 0.7.1 | 19 | 9% | 30 |
| bvh.micro.Freya 0.3 | 17 | 8% | 37 |
| dl.BetterWalls 1.0 | 11 | 5% | 19 |
| squidM.TentalceMeleeNano 1.1 | 10 | 5% | 13 |
| sample.MyFirstRobot 1.0 | 9 | 4% | 12 |

## Melee bench: F37

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 80.1 | 149 / 350 | 2.79 | 15.9% | 42603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroK80 0.3 | 1.0 | 15.9% | 149 |
| EBBU.Sim2 1.02 | 3.0 | 11.2% | 37 |
| germ.TheMind .2 | 3.0 | 11.4% | 38 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 11.2% | 27 |
| agrach.Dalek 1.0 | 5.7 | 9.3% | 31 |
| mb.Beast 0.1 | 6.6 | 8.8% | 23 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.7% | 16 |
| lmk.ACPFinal 0.1 | 7.5 | 8.5% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 8.4 | 7.8% | 0 |
| skm.Ryubot 1.0 | 9.5 | 7.3% | 15 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 76.5 | 17 / 35 | 4466 |
| 2 | 1 | 61.7 | 77.1 | 11 / 35 | 4174 |
| 3 | 1 | 62.7 | 78.7 | 14 / 35 | 4182 |
| 4 | 1 | 63.5 | 81.0 | 16 / 35 | 4197 |
| 5 | 1 | 64.5 | 83.8 | 18 / 35 | 4196 |
| 6 | 1 | 64.6 | 83.8 | 15 / 35 | 4537 |
| 7 | 1 | 62.2 | 77.5 | 14 / 35 | 4200 |
| 8 | 1 | 61.8 | 77.8 | 13 / 35 | 3964 |
| 9 | 1 | 65.2 | 84.8 | 19 / 35 | 4628 |
| 10 | 1 | 62.6 | 80.0 | 12 / 35 | 4059 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 43 | 70% |
| EBBU.Sim2 1.02 | 35 | 49% |
| com.syncleus.robocode.Dreadnaught 0.1 | 29 | 83% |
| mb.Beast 0.1 | 27 | 81% |
| agrach.Dalek 1.0 | 24 | 58% |
| stelo.UntouchableNano 1.3 | 21 | 71% |
| lmk.ACPFinal 0.1 | 20 | 80% |
| skm.Ryubot 1.0 | 19 | 53% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 205 of 350 rounds, at a mean tick of 595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| EBBU.Sim2 1.02 | 40 | 20% | 53 |
| germ.TheMind .2 | 35 | 17% | 72 |
| com.syncleus.robocode.Dreadnaught 0.1 | 31 | 15% | 56 |
| agrach.Dalek 1.0 | 24 | 12% | 47 |
| mn.nano.perceptual.Impact 1.3.0 | 20 | 10% | 21 |
| lmk.ACPFinal 0.1 | 19 | 9% | 33 |
| stelo.UntouchableNano 1.3 | 14 | 7% | 26 |
| mb.Beast 0.1 | 12 | 6% | 28 |
| skm.Ryubot 1.0 | 10 | 5% | 12 |

## Melee bench: F38

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 67.4 | 53 / 350 | 3.93 | 12.4% | 26963 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.9% | 151 |
| bvh.mini.Freya 0.55 | 2.5 | 13.2% | 31 |
| hadur117.nano.SanaroK80 0.3 | 3.6 | 12.4% | 53 |
| cs.Wren 1.0 | 4.2 | 11.7% | 28 |
| bts.mega.Gnarly 1.4 | 4.4 | 11.7% | 41 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.6 | 10.9% | 34 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.6% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.1 | 5.3% | 1 |
| bzdp.BoxCar 2.0 | 9.3 | 4.1% | 0 |
| matt.UnderDark3 2.4.34 | 9.6 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.2 | 64.1 | 6 / 35 | 2669 |
| 2 | 3 | 58.0 | 67.6 | 3 / 35 | 2720 |
| 3 | 3 | 59.0 | 69.2 | 8 / 35 | 2759 |
| 4 | 3 | 57.5 | 66.7 | 5 / 35 | 2675 |
| 5 | 5 | 55.7 | 61.0 | 4 / 35 | 2641 |
| 6 | 3 | 59.7 | 69.8 | 8 / 35 | 2808 |
| 7 | 3 | 58.7 | 67.3 | 7 / 35 | 2709 |
| 8 | 3 | 59.4 | 69.8 | 7 / 35 | 2736 |
| 9 | 2 | 60.5 | 75.9 | 4 / 35 | 2834 |
| 10 | 6 | 55.3 | 62.5 | 1 / 35 | 2412 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 52 | 52% |
| cs.Wren 1.0 | 14 | 36% |
| bts.mega.Gnarly 1.4 | 14 | 14% |
| bvh.mini.Freya 0.55 | 14 | 71% |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 0% |
| kdf.KoulDestroyer 1.0 | 8 | 75% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 298 of 350 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 84 | 28% | 115 |
| bvh.mini.Freya 0.55 | 52 | 17% | 58 |
| bts.mega.Gnarly 1.4 | 46 | 15% | 50 |
| cs.Wren 1.0 | 43 | 14% | 47 |
| davidalves.net.DuelistNanoMelee 1.01 | 38 | 13% | 41 |
| kdf.KoulDestroyer 1.0 | 26 | 9% | 28 |
| bzdp.BoxCar 2.0 | 4 | 1% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 1% | 5 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |

## Melee bench: F39

hadur117.nano.SanaroK80 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 68.4 | 46 / 350 | 3.53 | 13.7% | 28206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.0 | 18.4% | 106 |
| az.Ololobot 0.2.4 | 2.0 | 15.9% | 141 |
| hadur117.nano.SanaroK80 0.3 | 3.1 | 13.7% | 46 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 11.5% | 37 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.5% | 10 |
| apollokidd.ApolloKidd 0.9 | 5.7 | 9.4% | 4 |
| gimp.GimpBot 0.1 | 6.3 | 8.5% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.2 | 7.0% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.8 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 71.8 | 5 / 35 | 2821 |
| 2 | 3 | 56.3 | 64.6 | 3 / 35 | 3060 |
| 3 | 4 | 55.3 | 63.9 | 4 / 35 | 2522 |
| 4 | 3 | 57.9 | 68.2 | 6 / 35 | 3116 |
| 5 | 3 | 57.0 | 66.8 | 5 / 35 | 2789 |
| 6 | 3 | 59.1 | 73.6 | 5 / 35 | 2714 |
| 7 | 3 | 56.9 | 65.7 | 2 / 35 | 3133 |
| 8 | 3 | 58.1 | 69.6 | 6 / 35 | 2850 |
| 9 | 3 | 58.3 | 72.1 | 5 / 35 | 2591 |
| 10 | 3 | 57.0 | 67.9 | 5 / 35 | 2610 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 67 | 6% |
| bvh.fry.Freya 0.82 | 54 | 37% |
| stelo.SoRobotNanoMelee 1.2 | 24 | 42% |
| winamp32.micro.MicroMacro 1.0 | 6 | 67% |
| gimp.GimpBot 0.1 | 5 | 100% |
| apollokidd.ApolloKidd 0.9 | 4 | 75% |

Hadur died in 304 of 350 rounds, at a mean tick of 1251. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 116 | 38% | 133 |
| az.Ololobot 0.2.4 | 78 | 26% | 84 |
| stelo.SoRobotNanoMelee 1.2 | 46 | 15% | 55 |
| apollokidd.ApolloKidd 0.9 | 29 | 10% | 32 |
| winamp32.micro.MicroMacro 1.0 | 17 | 6% | 21 |
| dcs.Eater_of_Worlds 1.1.3-A | 7 | 2% | 7 |
| gimp.GimpBot 0.1 | 6 | 2% | 13 |
| whitesquare.robots.SkynetAdvanced 1.1 | 5 | 2% | 5 |

## Melee bench: F41

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 72.3 | 104 / 350 | 3.50 | 13.8% | 29147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.0% | 143 |
| hadur117.nano.SanaroK80 0.3 | 2.7 | 13.8% | 104 |
| ary.Swarm 1.1 | 3.3 | 12.9% | 25 |
| lessonz.robocode.Oz 0.5.0 | 3.6 | 12.9% | 38 |
| simonton.nano.MeleeSeed 1.8 | 4.4 | 12.0% | 27 |
| shrub.Silver v048 | 6.1 | 9.1% | 6 |
| zyx.nano.Ant 1.1 | 6.9 | 7.8% | 3 |
| jsal.Jsalbot 1.0 | 8.5 | 5.9% | 3 |
| stelo.Mirror 1.1 | 8.5 | 6.0% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 73.7 | 12 / 35 | 2996 |
| 2 | 2 | 61.7 | 72.4 | 13 / 35 | 2995 |
| 3 | 2 | 61.8 | 73.3 | 10 / 35 | 2935 |
| 4 | 4 | 60.0 | 67.3 | 10 / 35 | 3112 |
| 5 | 2 | 61.8 | 75.9 | 11 / 35 | 2831 |
| 6 | 4 | 59.5 | 69.8 | 8 / 35 | 2582 |
| 7 | 2 | 62.8 | 74.9 | 12 / 35 | 3245 |
| 8 | 3 | 60.7 | 72.4 | 13 / 35 | 2607 |
| 9 | 2 | 61.4 | 73.0 | 8 / 35 | 3112 |
| 10 | 4 | 59.6 | 69.8 | 7 / 35 | 2732 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 96 | 54% |
| simonton.nano.MeleeSeed 1.8 | 24 | 67% |
| lessonz.robocode.Oz 0.5.0 | 23 | 65% |
| ary.Swarm 1.1 | 16 | 81% |
| stelo.Mirror 1.1 | 5 | 100% |
| shrub.Silver v048 | 4 | 50% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| zyx.nano.Ant 1.1 | 2 | 0% |

Hadur died in 248 of 350 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 87 | 35% | 137 |
| ary.Swarm 1.1 | 47 | 19% | 63 |
| lessonz.robocode.Oz 0.5.0 | 42 | 17% | 54 |
| simonton.nano.MeleeSeed 1.8 | 32 | 13% | 45 |
| shrub.Silver v048 | 15 | 6% | 18 |
| zyx.nano.Ant 1.1 | 15 | 6% | 15 |
| stelo.Mirror 1.1 | 4 | 2% | 9 |
| jsal.Jsalbot 1.0 | 3 | 1% | 5 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 74.8 | 93 / 350 | 3.27 | 14.2% | 33673 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 18.1% | 173 |
| hadur117.nano.SanaroK80 0.3 | 2.8 | 14.2% | 93 |
| maribo.mini.MiniQuester 0.1 | 3.1 | 13.5% | 26 |
| ara.Shera 0.88 | 3.1 | 13.7% | 49 |
| amz.NanoClone 1.41 | 5.1 | 9.4% | 4 |
| maribo.IotaCT 1.1 | 6.1 | 7.9% | 1 |
| dsw.StaticD 1.0 | 6.8 | 7.0% | 4 |
| stelo.MirrorMicro 1.0 | 8.4 | 5.8% | 0 |
| mme.NikeEnhanced 2.0 | 9.2 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.4 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.5 | 69.8 | 8 / 35 | 2906 |
| 2 | 2 | 62.5 | 76.5 | 12 / 35 | 3187 |
| 3 | 2 | 63.6 | 78.4 | 11 / 35 | 3896 |
| 4 | 4 | 59.6 | 68.9 | 7 / 35 | 3101 |
| 5 | 2 | 64.1 | 81.0 | 16 / 35 | 3467 |
| 6 | 3 | 60.6 | 70.5 | 7 / 35 | 3586 |
| 7 | 2 | 62.8 | 80.0 | 5 / 35 | 3643 |
| 8 | 2 | 62.3 | 75.6 | 11 / 35 | 3240 |
| 9 | 4 | 60.8 | 71.4 | 8 / 35 | 3263 |
| 10 | 3 | 61.8 | 75.6 | 8 / 35 | 3384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 102 | 48% |
| ara.Shera 0.88 | 35 | 60% |
| maribo.mini.MiniQuester 0.1 | 21 | 67% |
| dsw.StaticD 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 4 | 75% |
| maribo.IotaCT 1.1 | 2 | 100% |

Hadur died in 257 of 350 rounds, at a mean tick of 961. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 103 | 40% | 151 |
| ara.Shera 0.88 | 58 | 23% | 77 |
| maribo.mini.MiniQuester 0.1 | 58 | 23% | 73 |
| amz.NanoClone 1.41 | 19 | 7% | 22 |
| maribo.IotaCT 1.1 | 10 | 4% | 13 |
| mme.NikeEnhanced 2.0 | 5 | 2% | 5 |
| dsw.StaticD 1.0 | 3 | 1% | 8 |
| stelo.MirrorMicro 1.0 | 1 | 0% | 1 |

## Melee bench: F43

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 63.8 | 24 / 350 | 4.25 | 11.6% | 25692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.0% | 277 |
| dummy.micro.Sparrow 2.5 | 2.6 | 12.3% | 12 |
| brainfade.melee.Dusk 0.44 | 3.1 | 12.5% | 23 |
| hadur117.nano.SanaroK80 0.3 | 4.4 | 11.6% | 24 |
| wcsv.melee.EngineerMelee 0.1 | 4.6 | 11.2% | 9 |
| Krabb.akim2.Akim2 1.1b | 5.3 | 10.4% | 4 |
| jab.DiamondStealer 5 | 7.4 | 7.7% | 1 |
| mz.NanoGod 2.02 | 7.6 | 7.3% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 56.4 | 60.6 | 1 / 35 | 2175 |
| 2 | 6 | 55.0 | 55.9 | 1 / 35 | 2381 |
| 3 | 5 | 57.8 | 63.2 | 0 / 35 | 2512 |
| 4 | 4 | 57.3 | 60.6 | 4 / 35 | 2477 |
| 5 | 4 | 59.3 | 66.3 | 1 / 35 | 2785 |
| 6 | 4 | 58.7 | 64.4 | 2 / 35 | 2777 |
| 7 | 4 | 57.4 | 62.9 | 2 / 35 | 2462 |
| 8 | 4 | 58.0 | 63.2 | 4 / 35 | 2701 |
| 9 | 3 | 62.4 | 74.6 | 6 / 35 | 2851 |
| 10 | 4 | 59.3 | 66.7 | 3 / 35 | 2571 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 77 | 17% |
| brainfade.melee.Dusk 0.44 | 7 | 86% |
| dummy.micro.Sparrow 2.5 | 7 | 57% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 25% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |
| jab.DiamondStealer 5 | 1 | 0% |

Hadur died in 326 of 350 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 160 | 49% | 171 |
| brainfade.melee.Dusk 0.44 | 40 | 12% | 46 |
| dummy.micro.Sparrow 2.5 | 39 | 12% | 44 |
| wcsv.melee.EngineerMelee 0.1 | 38 | 12% | 39 |
| Krabb.akim2.Akim2 1.1b | 24 | 7% | 24 |
| jab.DiamondStealer 5 | 11 | 3% | 11 |
| mz.NanoGod 2.02 | 10 | 3% | 10 |
| cvt.Firsty 1.0 | 4 | 1% | 4 |

## Melee bench: F44

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 73.7 | 78 / 350 | 3.37 | 14.2% | 33474 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.1 | 16.8% | 140 |
| tzu.TheArtOfWar 1.2 | 2.2 | 15.1% | 84 |
| hadur117.nano.SanaroK80 0.3 | 2.7 | 14.2% | 78 |
| jwirde.Gort 2.0 | 4.6 | 10.7% | 25 |
| wompi.Quokka 1.6 | 4.7 | 10.6% | 17 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.7 | 9.3% | 4 |
| disan.Chair 2.2.0 | 7.3 | 7.1% | 1 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.9% | 2 |
| sample.Crazy 1.0 | 9.3 | 4.9% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.1 | 75.6 | 10 / 35 | 3638 |
| 2 | 3 | 60.8 | 70.8 | 7 / 35 | 3275 |
| 3 | 3 | 59.9 | 69.2 | 7 / 35 | 3186 |
| 4 | 3 | 60.7 | 73.7 | 4 / 35 | 3347 |
| 5 | 3 | 61.8 | 74.6 | 6 / 35 | 3402 |
| 6 | 2 | 63.8 | 81.0 | 10 / 35 | 3277 |
| 7 | 2 | 62.5 | 75.9 | 11 / 35 | 3282 |
| 8 | 2 | 63.7 | 81.0 | 9 / 35 | 3623 |
| 9 | 3 | 58.1 | 63.5 | 6 / 35 | 3343 |
| 10 | 3 | 60.2 | 71.7 | 8 / 35 | 3101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 87 | 53% |
| tzu.TheArtOfWar 1.2 | 42 | 19% |
| jwirde.Gort 2.0 | 13 | 46% |
| wompi.Quokka 1.6 | 11 | 73% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 71% |
| disan.Chair 2.2.0 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 0% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 272 of 350 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 89 | 33% | 138 |
| tzu.TheArtOfWar 1.2 | 88 | 32% | 97 |
| jwirde.Gort 2.0 | 30 | 11% | 37 |
| wompi.Quokka 1.6 | 26 | 10% | 30 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 22 | 8% | 25 |
| disan.Chair 2.2.0 | 7 | 3% | 8 |
| stf.PanzerGeneral 0.1 | 5 | 2% | 7 |
| amk.jointstrike.JointStrike 0.2 | 3 | 1% | 3 |
| sample.Crazy 1.0 | 2 | 1% | 5 |

## Melee bench: F45

hadur117.nano.SanaroK80 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 74.2 | 89 / 350 | 3.32 | 14.9% | 35895 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroK80 0.3 | 1.0 | 14.9% | 89 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 13.1% | 179 |
| jje.BagPuss 1.2 | 2.6 | 13.1% | 23 |
| sul.Lunar 1.1 | 4.6 | 10.6% | 28 |
| myl.nano.Graviton 1.10 | 4.9 | 10.6% | 9 |
| hvilela.HVilela 0.9 | 5.7 | 9.5% | 3 |
| fm.claire 1.7 | 7.2 | 8.5% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.7 | 8.1% | 4 |
| wit.Deep7 2.0 | 8.9 | 6.6% | 15 |
| abud.ThirdRobo 1.0 | 9.9 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.1 | 70.5 | 8 / 35 | 3832 |
| 2 | 1 | 61.1 | 74.3 | 4 / 35 | 3570 |
| 3 | 1 | 60.9 | 71.1 | 8 / 35 | 3518 |
| 4 | 1 | 62.7 | 76.5 | 10 / 35 | 3547 |
| 5 | 1 | 63.4 | 79.4 | 11 / 35 | 3657 |
| 6 | 1 | 62.2 | 75.2 | 11 / 35 | 3471 |
| 7 | 1 | 62.1 | 74.9 | 9 / 35 | 3660 |
| 8 | 1 | 62.6 | 76.2 | 11 / 35 | 3674 |
| 9 | 1 | 61.6 | 74.0 | 10 / 35 | 3281 |
| 10 | 1 | 60.8 | 69.8 | 7 / 35 | 3685 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 109 | 43% |
| jje.BagPuss 1.2 | 17 | 53% |
| sul.Lunar 1.1 | 17 | 41% |
| wit.Deep7 2.0 | 11 | 55% |
| myl.nano.Graviton 1.10 | 10 | 70% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 88% |
| hvilela.HVilela 0.9 | 4 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 263 of 350 rounds, at a mean tick of 1323. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 70 | 27% | 0 |
| jje.BagPuss 1.2 | 60 | 23% | 112 |
| myl.nano.Graviton 1.10 | 34 | 13% | 62 |
| sul.Lunar 1.1 | 33 | 13% | 75 |
| hvilela.HVilela 0.9 | 19 | 7% | 28 |
| fm.claire 1.7 | 18 | 7% | 22 |
| pez.mini.ChironexFleckeri 0.5 | 13 | 5% | 23 |
| wit.Deep7 2.0 | 10 | 4% | 16 |
| abud.ThirdRobo 1.0 | 6 | 2% | 11 |

## Melee bench: F46

hadur117.nano.SanaroK80 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 78.0 | 94 / 350 | 2.76 | 15.8% | 29509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 21.4% | 201 |
| hadur117.nano.SanaroK80 0.3 | 2.1 | 15.8% | 94 |
| cx.Princess 1.0 | 3.1 | 13.6% | 35 |
| mz.MicroSheep 1.0 | 3.8 | 13.0% | 14 |
| sadoner.killer 0.2 | 5.1 | 10.2% | 3 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.4% | 3 |
| jeremyreeder.collective.Prophet 5 | 6.9 | 7.1% | 0 |
| kurios.DOSexe .9a | 8.1 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 8.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 79.6 | 7 / 35 | 2779 |
| 2 | 2 | 61.2 | 76.4 | 8 / 35 | 2851 |
| 3 | 2 | 62.1 | 77.9 | 8 / 35 | 2979 |
| 4 | 2 | 61.4 | 78.9 | 5 / 35 | 2808 |
| 5 | 2 | 64.0 | 81.8 | 13 / 35 | 3291 |
| 6 | 2 | 62.8 | 78.6 | 11 / 35 | 2940 |
| 7 | 2 | 63.1 | 78.2 | 12 / 35 | 3280 |
| 8 | 2 | 60.7 | 75.0 | 10 / 35 | 2657 |
| 9 | 2 | 63.4 | 81.4 | 12 / 35 | 3019 |
| 10 | 3 | 60.6 | 72.5 | 8 / 35 | 2905 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 155 | 38% |
| cx.Princess 1.0 | 29 | 76% |
| mz.MicroSheep 1.0 | 11 | 64% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| sadoner.killer 0.2 | 2 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 256 of 350 rounds, at a mean tick of 1051. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 156 | 61% | 222 |
| mz.MicroSheep 1.0 | 31 | 12% | 35 |
| cx.Princess 1.0 | 29 | 11% | 47 |
| arthord.NanoSatanMelee Beta | 16 | 6% | 16 |
| sadoner.killer 0.2 | 15 | 6% | 17 |
| jeremyreeder.collective.Prophet 5 | 6 | 2% | 7 |
| kurios.DOSexe .9a | 3 | 1% | 5 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |

