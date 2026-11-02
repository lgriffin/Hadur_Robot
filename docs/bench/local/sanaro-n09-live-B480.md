# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 76.8 | 55 / 350 | 3.09 | 13.7% | 30908 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.9% | 234 |
| hadur117.nano.SanaroB480 0.3 | 2.0 | 13.7% | 55 |
| sgp.JollyNinja 3.53 | 3.6 | 11.9% | 32 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.4 | 11.2% | 10 |
| mz.MicroGodMelee 1 | 4.4 | 11.1% | 10 |
| lorneswork.Predator 1.0 | 5.6 | 9.8% | 7 |
| adt.Ar2 1.0 | 7.1 | 7.7% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.6% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.9% | 1 |
| mym.EdgeStalker 1.0 | 9.9 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.2 | 71.1 | 8 / 35 | 2767 |
| 2 | 2 | 61.1 | 74.6 | 5 / 35 | 3300 |
| 3 | 2 | 61.9 | 76.5 | 5 / 35 | 3309 |
| 4 | 2 | 60.6 | 74.9 | 6 / 35 | 2988 |
| 5 | 2 | 62.2 | 81.0 | 4 / 35 | 3141 |
| 6 | 2 | 62.0 | 78.1 | 6 / 35 | 3190 |
| 7 | 2 | 61.1 | 76.2 | 3 / 35 | 3248 |
| 8 | 2 | 61.0 | 76.8 | 4 / 35 | 3042 |
| 9 | 2 | 60.4 | 75.2 | 4 / 35 | 3013 |
| 10 | 2 | 63.1 | 83.8 | 10 / 35 | 2910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 168 | 15% |
| sgp.JollyNinja 3.53 | 23 | 30% |
| mz.MicroGodMelee 1 | 15 | 87% |
| lorneswork.Predator 1.0 | 7 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 60% |
| adt.Ar2 1.0 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% |

Hadur died in 296 of 350 rounds, at a mean tick of 1090. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 165 | 56% | 189 |
| sgp.JollyNinja 3.53 | 43 | 15% | 49 |
| simonton.nano.WeekendObsession_Melee 1.0 | 27 | 9% | 28 |
| mz.MicroGodMelee 1 | 22 | 7% | 36 |
| lorneswork.Predator 1.0 | 20 | 7% | 25 |
| adt.Ar2 1.0 | 14 | 5% | 16 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 1% | 5 |
| skm.butterfly 1.0 | 2 | 1% | 2 |

## Melee bench: F02

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 69.1 | 74 / 350 | 3.78 | 13.5% | 33089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1.7 | 15.0% | 80 |
| pulsar.PulsarMax 0.8.9 | 1.7 | 15.2% | 105 |
| hadur117.nano.SanaroB480 0.3 | 2.7 | 13.5% | 74 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.8% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.0% | 21 |
| sch.Simone 0.3d | 6.4 | 8.6% | 24 |
| Noran.BitchingElk 0.054 | 7.5 | 7.7% | 25 |
| fnc.bandit.Bandit 5.2.0 | 7.6 | 7.8% | 2 |
| stelo.PatternRobot 1.0 | 8.6 | 6.7% | 13 |
| fullsail.SweetTea 1.1 | 9.9 | 4.9% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 70.5 | 7 / 35 | 3116 |
| 2 | 2 | 60.0 | 72.4 | 9 / 35 | 3148 |
| 3 | 3 | 58.8 | 66.7 | 6 / 35 | 3436 |
| 4 | 4 | 56.0 | 60.6 | 4 / 35 | 3058 |
| 5 | 3 | 59.0 | 64.1 | 8 / 35 | 3670 |
| 6 | 3 | 60.2 | 72.1 | 3 / 35 | 3490 |
| 7 | 3 | 59.1 | 67.3 | 8 / 35 | 3076 |
| 8 | 1 | 63.2 | 76.8 | 13 / 35 | 3560 |
| 9 | 2 | 61.6 | 74.0 | 11 / 35 | 3274 |
| 10 | 3 | 58.0 | 66.3 | 5 / 35 | 3261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 60 | 52% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 48 | 21% |
| com.cohesiva.robocode.ManOwaR 1.0 | 19 | 89% |
| sch.Simone 0.3d | 12 | 33% |
| stelo.PatternRobot 1.0 | 7 | 43% |
| Noran.BitchingElk 0.054 | 7 | 43% |
| lrem.micro.SpikeSoldier 0.4 | 3 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 67% |
| fullsail.SweetTea 1.1 | 2 | 50% |

Hadur died in 278 of 350 rounds, at a mean tick of 937. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 89 | 32% | 112 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 66 | 24% | 79 |
| lrem.micro.SpikeSoldier 0.4 | 30 | 11% | 35 |
| stelo.PatternRobot 1.0 | 20 | 7% | 24 |
| sch.Simone 0.3d | 20 | 7% | 24 |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 6% | 35 |
| fnc.bandit.Bandit 5.2.0 | 17 | 6% | 19 |
| Noran.BitchingElk 0.054 | 9 | 3% | 13 |
| fullsail.SweetTea 1.1 | 8 | 3% | 9 |
2 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 81.0 | 106 / 350 | 2.71 | 15.1% | 36654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.6 | 15.4% | 96 |
| hadur117.nano.SanaroB480 0.3 | 2.0 | 15.1% | 106 |
| kawigi.nano.Lib 1.0 | 2.8 | 14.3% | 68 |
| vuen.Cake 2.51 | 3.6 | 13.4% | 65 |
| urdos.URDOS 1.3 | 5.0 | 10.3% | 11 |
| adt.Ar1 2.1 | 6.3 | 7.7% | 3 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.8% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.9 | 6.6% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.6 | 5.8% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 75.6 | 8 / 35 | 3657 |
| 2 | 2 | 62.3 | 79.7 | 8 / 35 | 3649 |
| 3 | 4 | 61.5 | 78.1 | 9 / 35 | 3456 |
| 4 | 2 | 63.4 | 83.2 | 9 / 35 | 3556 |
| 5 | 1 | 64.2 | 84.4 | 13 / 35 | 3579 |
| 6 | 2 | 63.1 | 80.3 | 11 / 35 | 3679 |
| 7 | 1 | 63.0 | 81.9 | 11 / 35 | 3566 |
| 8 | 2 | 63.7 | 82.2 | 13 / 35 | 3681 |
| 9 | 2 | 62.0 | 76.5 | 9 / 35 | 3794 |
| 10 | 1 | 66.1 | 88.3 | 15 / 35 | 4037 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 72 | 56% |
| radnor.DoctorBob 1.42 | 70 | 53% |
| kawigi.nano.Lib 1.0 | 35 | 20% |
| urdos.URDOS 1.3 | 21 | 67% |
| adt.Ar1 2.1 | 4 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 50% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 249 of 350 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 84 | 34% | 114 |
| kawigi.nano.Lib 1.0 | 73 | 29% | 82 |
| vuen.Cake 2.51 | 42 | 17% | 82 |
| urdos.URDOS 1.3 | 30 | 12% | 44 |
| adt.Ar1 2.1 | 7 | 3% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 5 | 2% | 6 |
| oa.weak.FlyMk1 0.1 | 4 | 2% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 0% | 4 |

## Melee bench: F04

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 76.1 | 9 / 350 | 3.15 | 13.7% | 36128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.9% | 320 |
| hadur117.nano.SanaroB480 0.3 | 2.4 | 13.7% | 9 |
| apc.LeeroyJenkins2 1.0 | 2.6 | 13.9% | 13 |
| TNT.TNT 0.99.1 | 4.0 | 10.5% | 3 |
| josago.Jorgito 0.16 | 5.0 | 9.4% | 3 |
| css.Delitioner 0.11 | 6.3 | 7.4% | 1 |
| tj.zombie1n 1.0.1 | 6.7 | 6.9% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.4 | 4.1% | 0 |
| spin.Bugstard 0.012b | 9.6 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 80.6 | 1 / 35 | 3939 |
| 2 | 2 | 61.2 | 74.3 | 1 / 35 | 3282 |
| 3 | 2 | 62.1 | 74.9 | 1 / 35 | 3647 |
| 4 | 3 | 61.0 | 74.0 | 0 / 35 | 3235 |
| 5 | 3 | 63.4 | 77.1 | 1 / 35 | 3983 |
| 6 | 2 | 62.8 | 77.8 | 3 / 35 | 3778 |
| 7 | 2 | 62.8 | 79.0 | 1 / 35 | 3586 |
| 8 | 3 | 61.7 | 74.0 | 0 / 35 | 3567 |
| 9 | 3 | 61.0 | 73.0 | 0 / 35 | 3526 |
| 10 | 2 | 62.1 | 76.2 | 1 / 35 | 3585 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 206 | 3% |
| josago.Jorgito 0.16 | 2 | 0% |
| apc.LeeroyJenkins2 1.0 | 2 | 50% |
| tj.zombie1n 1.0.1 | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 0% |

Hadur died in 341 of 350 rounds, at a mean tick of 1549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 242 | 71% | 249 |
| apc.LeeroyJenkins2 1.0 | 43 | 13% | 46 |
| josago.Jorgito 0.16 | 32 | 9% | 32 |
| TNT.TNT 0.99.1 | 9 | 3% | 9 |
| tj.zombie1n 1.0.1 | 6 | 2% | 6 |
| css.Delitioner 0.11 | 5 | 1% | 5 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |
| spin.Bugstard 0.012b | 1 | 0% | 0 |

## Melee bench: F06

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 73.9 | 119 / 350 | 3.35 | 14.1% | 29922 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.6 | 15.3% | 74 |
| hadur117.nano.SanaroB480 0.3 | 2.3 | 14.1% | 119 |
| origin.SleepSiphon 1.7b | 2.6 | 14.2% | 85 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 12.4% | 46 |
| mld.Wisdom 1.0 | 4.9 | 10.8% | 7 |
| gg.Wolverine 2.0 | 6.3 | 8.6% | 8 |
| spinnercat.Omen 1.0 | 7.1 | 7.8% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 6.7% | 6 |
| DBall.NUKE 0.1 | 8.5 | 6.9% | 1 |
| sample.Fire 1.0 | 10.0 | 3.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 78.4 | 11 / 35 | 2758 |
| 2 | 3 | 59.9 | 72.1 | 7 / 35 | 2853 |
| 3 | 3 | 62.7 | 74.3 | 18 / 35 | 3072 |
| 4 | 1 | 63.8 | 80.6 | 14 / 35 | 3293 |
| 5 | 2 | 59.4 | 67.6 | 10 / 35 | 3041 |
| 6 | 2 | 62.3 | 77.1 | 10 / 35 | 3139 |
| 7 | 4 | 58.4 | 67.3 | 10 / 35 | 2769 |
| 8 | 3 | 60.7 | 71.7 | 11 / 35 | 2976 |
| 9 | 2 | 63.3 | 78.1 | 16 / 35 | 3176 |
| 10 | 2 | 60.3 | 71.4 | 12 / 35 | 2845 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 63 | 68% |
| origin.SleepSiphon 1.7b | 43 | 53% |
| pe.minimelee.SandboxMiniMelee 1.1 | 31 | 77% |
| gg.Wolverine 2.0 | 11 | 73% |
| DBall.NUKE 0.1 | 8 | 100% |
| mld.Wisdom 1.0 | 6 | 100% |
| spinnercat.Omen 1.0 | 5 | 60% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 100% |
| sample.Fire 1.0 | 1 | 0% |

Hadur died in 232 of 350 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 64 | 28% | 98 |
| origin.SleepSiphon 1.7b | 53 | 23% | 82 |
| pe.minimelee.SandboxMiniMelee 1.1 | 48 | 21% | 77 |
| mld.Wisdom 1.0 | 33 | 14% | 40 |
| spinnercat.Omen 1.0 | 11 | 5% | 14 |
| gg.Wolverine 2.0 | 10 | 4% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 3% | 12 |
| DBall.NUKE 0.1 | 5 | 2% | 12 |
| sample.Fire 1.0 | 1 | 0% | 1 |

## Melee bench: F07

hadur117.nano.SanaroB480 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.9 | 154 / 350 | 2.05 | 18.7% | 38645 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.0 | 21.9% | 100 |
| hadur117.nano.SanaroB480 0.3 | 2.0 | 18.7% | 154 |
| franzor.Lizt 1.3.1 | 3.1 | 14.3% | 69 |
| oog.melee.CapuletDroid 1.1 | 3.9 | 13.5% | 24 |
| lrem.micro.MoggFanatic 0.2 | 5.1 | 10.0% | 1 |
| exauge.GateKeeper 1.1.121g | 5.9 | 8.5% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.7% | 2 |
| sample.Target 1.0 | 8.3 | 3.2% | 0 |
| drd.Dreadknoght 0.9 | 8.7 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 87.9 | 15 / 35 | 3824 |
| 2 | 2 | 66.8 | 83.9 | 12 / 35 | 4105 |
| 3 | 2 | 67.0 | 87.9 | 15 / 35 | 3636 |
| 4 | 2 | 67.1 | 86.8 | 13 / 35 | 3859 |
| 5 | 2 | 68.6 | 87.9 | 16 / 35 | 4301 |
| 6 | 2 | 68.2 | 88.2 | 17 / 35 | 4050 |
| 7 | 2 | 67.5 | 88.2 | 20 / 35 | 3382 |
| 8 | 2 | 67.3 | 86.8 | 18 / 35 | 3931 |
| 9 | 2 | 67.1 | 86.8 | 15 / 35 | 3867 |
| 10 | 2 | 66.4 | 85.0 | 13 / 35 | 3690 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 139 | 55% |
| franzor.Lizt 1.3.1 | 65 | 58% |
| oog.melee.CapuletDroid 1.1 | 48 | 77% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 0% |
| drd.Dreadknoght 0.9 | 1 | 0% |

Hadur died in 196 of 350 rounds, at a mean tick of 1688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 128 | 65% | 252 |
| franzor.Lizt 1.3.1 | 29 | 15% | 0 |
| oog.melee.CapuletDroid 1.1 | 27 | 14% | 74 |
| exauge.GateKeeper 1.1.121g | 6 | 3% | 11 |
| skm.PateranBotlock2 1.0 | 4 | 2% | 6 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.nano.SanaroB480 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 77.8 | 148 / 350 | 2.78 | 16.6% | 29985 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB480 0.3 | 1.7 | 16.6% | 148 |
| tm.Yuugao 1.0 | 2.1 | 16.1% | 77 |
| shrub.Vapour v159 | 2.2 | 15.6% | 80 |
| com.spp.robocode.MostlyHarmless 010 | 4.3 | 11.0% | 20 |
| m3thos.Eva00 1.1 | 5.1 | 10.4% | 10 |
| jwst.DAD.DarkAndDarker 1.1 | 5.9 | 9.0% | 13 |
| qualidafial.MajorDick 1.0.1 | 7.5 | 7.5% | 2 |
| SHAM.WOW 1.4 | 8.0 | 7.1% | 2 |
| zyx.nano.BacillusComma 1.0 | 8.2 | 6.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 78.6 | 16 / 35 | 3248 |
| 2 | 2 | 60.7 | 73.9 | 14 / 35 | 2725 |
| 3 | 1 | 63.3 | 82.5 | 18 / 35 | 2743 |
| 4 | 1 | 62.8 | 77.9 | 14 / 35 | 3317 |
| 5 | 1 | 63.7 | 81.8 | 19 / 35 | 2951 |
| 6 | 3 | 61.0 | 75.0 | 13 / 35 | 2758 |
| 7 | 1 | 62.4 | 77.5 | 13 / 35 | 3160 |
| 8 | 1 | 63.4 | 78.9 | 18 / 35 | 3066 |
| 9 | 3 | 61.8 | 76.4 | 10 / 35 | 3131 |
| 10 | 3 | 61.4 | 75.0 | 13 / 35 | 2886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 96 | 71% |
| shrub.Vapour v159 | 54 | 52% |
| com.spp.robocode.MostlyHarmless 010 | 20 | 85% |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 94% |
| m3thos.Eva00 1.1 | 11 | 73% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| SHAM.WOW 1.4 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 202 of 350 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 77 | 38% | 101 |
| tm.Yuugao 1.0 | 54 | 27% | 126 |
| com.spp.robocode.MostlyHarmless 010 | 18 | 9% | 37 |
| m3thos.Eva00 1.1 | 15 | 7% | 22 |
| zyx.nano.BacillusComma 1.0 | 14 | 7% | 16 |
| qualidafial.MajorDick 1.0.1 | 10 | 5% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 4% | 27 |
| SHAM.WOW 1.4 | 5 | 2% | 9 |

## Melee bench: F09

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 65.4 | 63 / 350 | 4.12 | 12.1% | 24101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.1% | 184 |
| kc.micro.Figment 1.0 | 2.0 | 15.0% | 59 |
| hadur117.nano.SanaroB480 0.3 | 3.5 | 12.1% | 63 |
| yagami.Tidus 0.11 | 4.2 | 11.2% | 1 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.5% | 18 |
| mc2.enemy.Original 0.9 | 5.6 | 9.5% | 19 |
| dft.Calliope 5.6 | 6.9 | 7.8% | 5 |
| step.nanoPri 1.0 | 8.5 | 5.7% | 1 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.4% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.9 | 66.0 | 8 / 35 | 2479 |
| 2 | 3 | 57.3 | 65.4 | 8 / 35 | 2280 |
| 3 | 4 | 57.6 | 66.3 | 7 / 35 | 2277 |
| 4 | 3 | 61.0 | 74.9 | 8 / 35 | 2835 |
| 5 | 3 | 57.6 | 67.9 | 7 / 35 | 2162 |
| 6 | 3 | 55.6 | 60.6 | 4 / 35 | 2404 |
| 7 | 4 | 56.8 | 64.4 | 3 / 35 | 2558 |
| 8 | 6 | 51.8 | 52.4 | 3 / 35 | 2163 |
| 9 | 3 | 58.2 | 67.0 | 6 / 35 | 2577 |
| 10 | 3 | 58.7 | 68.6 | 9 / 35 | 2366 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 72 | 33% |
| kc.micro.Figment 1.0 | 36 | 50% |
| mc2.enemy.Original 0.9 | 11 | 73% |
| yagami.Tidus 0.11 | 8 | 100% |
| pedersen.Grishnakh 1.0 | 6 | 50% |
| dft.Calliope 5.6 | 2 | 50% |
| rdm.Dueler 0.4x | 1 | 100% |

Hadur died in 287 of 350 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 92 | 32% | 116 |
| kc.micro.Figment 1.0 | 75 | 26% | 93 |
| yagami.Tidus 0.11 | 44 | 15% | 53 |
| pedersen.Grishnakh 1.0 | 23 | 8% | 24 |
| mc2.enemy.Original 0.9 | 21 | 7% | 30 |
| step.nanoPri 1.0 | 12 | 4% | 12 |
| robar.nano.Assertive_Melee 0.2 | 10 | 3% | 10 |
| dft.Calliope 5.6 | 8 | 3% | 10 |
| rdm.Dueler 0.4x | 2 | 1% | 1 |

## Melee bench: F10

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 83.2 | 142 / 350 | 2.51 | 15.6% | 34230 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB480 0.3 | 1.4 | 15.6% | 142 |
| DTF.Kludgy 1.2b | 1.7 | 15.7% | 100 |
| ne.Chimera 1.2 | 3.1 | 13.2% | 32 |
| ejb.Polaris 1.0.1 | 4.0 | 12.1% | 19 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.9% | 40 |
| vStar.RAFzilla 2.15 | 5.6 | 10.6% | 13 |
| sam.Samspin 1.0 | 7.7 | 6.0% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.8 | 6.2% | 1 |
| kurios.DOSexe .9b | 8.8 | 5.4% | 3 |
| donjezza.Muncho 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 82.2 | 12 / 35 | 3052 |
| 2 | 2 | 62.4 | 77.5 | 11 / 35 | 3514 |
| 3 | 1 | 64.8 | 87.0 | 13 / 35 | 3563 |
| 4 | 2 | 61.5 | 77.8 | 7 / 35 | 3459 |
| 5 | 1 | 63.0 | 81.3 | 14 / 35 | 3262 |
| 6 | 1 | 64.1 | 84.1 | 14 / 35 | 3209 |
| 7 | 1 | 65.1 | 86.0 | 19 / 35 | 3481 |
| 8 | 2 | 64.3 | 82.9 | 13 / 35 | 3598 |
| 9 | 1 | 65.4 | 86.3 | 17 / 35 | 3643 |
| 10 | 1 | 66.2 | 87.3 | 22 / 35 | 3449 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 74 | 45% |
| ejb.Polaris 1.0.1 | 48 | 100% |
| tvv.micro.Antares 1.1.1 | 44 | 36% |
| ne.Chimera 1.2 | 40 | 45% |
| vStar.RAFzilla 2.15 | 18 | 72% |
| kurios.DOSexe .9b | 6 | 67% |
| donjezza.Muncho 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sam.Samspin 1.0 | 3 | 100% |

Hadur died in 208 of 350 rounds, at a mean tick of 987. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 78 | 38% | 110 |
| ne.Chimera 1.2 | 60 | 29% | 83 |
| tvv.micro.Antares 1.1.1 | 34 | 16% | 40 |
| ejb.Polaris 1.0.1 | 12 | 6% | 65 |
| vStar.RAFzilla 2.15 | 8 | 4% | 22 |
| sam.Samspin 1.0 | 5 | 2% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 2% | 6 |
| kurios.DOSexe .9b | 4 | 2% | 11 |
| donjezza.Muncho 1.0 | 2 | 1% | 5 |

## Melee bench: F11

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 65.7 | 80 / 350 | 4.09 | 12.3% | 25620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.6% | 148 |
| cx.mini.Nimrod 0.55 | 2.6 | 13.1% | 43 |
| hadur117.nano.SanaroB480 0.3 | 2.9 | 12.3% | 80 |
| djc.DynaBot 0.1.1 | 4.0 | 11.1% | 22 |
| rdt199.Warlord 0.73 | 5.0 | 10.2% | 27 |
| br2.MobyDickBot 1.6 | 5.8 | 9.5% | 18 |
| uji.YellohFellah 1.0 | 6.8 | 8.5% | 14 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.1% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.6 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.9 | 60.6 | 9 / 35 | 2509 |
| 2 | 3 | 57.7 | 67.0 | 7 / 35 | 2582 |
| 3 | 3 | 58.4 | 67.3 | 9 / 35 | 2731 |
| 4 | 2 | 60.3 | 70.5 | 10 / 35 | 2948 |
| 5 | 2 | 58.8 | 70.2 | 9 / 35 | 2542 |
| 6 | 3 | 55.7 | 63.5 | 5 / 35 | 2260 |
| 7 | 2 | 59.8 | 71.4 | 11 / 35 | 2567 |
| 8 | 5 | 52.1 | 53.3 | 4 / 35 | 2310 |
| 9 | 2 | 59.9 | 72.7 | 11 / 35 | 2691 |
| 10 | 4 | 54.8 | 60.0 | 5 / 35 | 2480 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 69 | 51% |
| cx.mini.Nimrod 0.55 | 23 | 65% |
| djc.DynaBot 0.1.1 | 15 | 73% |
| rdt199.Warlord 0.73 | 14 | 79% |
| uji.YellohFellah 1.0 | 9 | 44% |
| br2.MobyDickBot 1.6 | 6 | 67% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |

Hadur died in 270 of 350 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 103 | 38% | 134 |
| cx.mini.Nimrod 0.55 | 62 | 23% | 75 |
| rdt199.Warlord 0.73 | 30 | 11% | 45 |
| KiraNL.Chupacabra 0.4 | 19 | 7% | 21 |
| djc.DynaBot 0.1.1 | 16 | 6% | 26 |
| uji.YellohFellah 1.0 | 15 | 6% | 21 |
| br2.MobyDickBot 1.6 | 10 | 4% | 13 |
| stelo.MirrorNano 1.3 | 9 | 3% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 2% | 6 |

## Melee bench: F12

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 73.6 | 95 / 350 | 3.38 | 13.6% | 23582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.9 | 14.5% | 98 |
| bts.wiki.RipCurl 0.9b | 2.0 | 13.9% | 62 |
| hadur117.nano.SanaroB480 0.3 | 2.7 | 13.6% | 95 |
| darkcanuck.Leon 1.01 | 3.4 | 13.0% | 64 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.6% | 19 |
| jrm.Test0 1.0 | 6.3 | 8.4% | 3 |
| jp.Perpy 16.0 | 7.3 | 7.3% | 0 |
| cs.sheldor.Talon 1.1 | 7.4 | 7.4% | 1 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.9% | 7 |
| stuff.Vlad 0.1 | 9.8 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 71.4 | 9 / 35 | 2487 |
| 2 | 2 | 62.7 | 81.3 | 13 / 35 | 2459 |
| 3 | 4 | 58.6 | 72.7 | 7 / 35 | 2134 |
| 4 | 2 | 58.9 | 72.1 | 8 / 35 | 2363 |
| 5 | 3 | 59.9 | 74.0 | 11 / 35 | 2160 |
| 6 | 3 | 58.4 | 71.7 | 8 / 35 | 2325 |
| 7 | 3 | 59.4 | 71.4 | 8 / 35 | 2461 |
| 8 | 1 | 61.0 | 77.5 | 11 / 35 | 2346 |
| 9 | 4 | 58.6 | 69.8 | 7 / 35 | 2447 |
| 10 | 2 | 60.4 | 73.7 | 13 / 35 | 2400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 57 | 18% |
| bts.wiki.RipCurl 0.9b | 54 | 72% |
| darkcanuck.Leon 1.01 | 50 | 44% |
| brainfade.melee.Genghis 0.36 | 19 | 74% |
| jrm.Test0 1.0 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 50% |
| stuff.Vlad 0.1 | 1 | 0% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 255 of 350 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 89 | 35% | 104 |
| bts.wiki.RipCurl 0.9b | 56 | 22% | 89 |
| darkcanuck.Leon 1.01 | 41 | 16% | 70 |
| brainfade.melee.Genghis 0.36 | 27 | 11% | 33 |
| jrm.Test0 1.0 | 18 | 7% | 22 |
| jp.Perpy 16.0 | 10 | 4% | 12 |
| cs.sheldor.Talon 1.1 | 9 | 4% | 16 |
| jaybot.bots.Oddball 4.0 | 4 | 2% | 4 |
| stuff.Vlad 0.1 | 1 | 0% | 0 |

## Melee bench: F13

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 74.3 | 73 / 350 | 3.32 | 13.2% | 27067 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 17.5% | 149 |
| ags.Glacier 0.2.11 | 1.7 | 16.8% | 83 |
| hadur117.nano.SanaroB480 0.3 | 3.2 | 13.2% | 73 |
| shinh.Entangled 0.3 | 4.3 | 12.1% | 25 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.9% | 18 |
| apc.Colossus2 0.17 | 6.2 | 8.2% | 0 |
| stelo.Wang 1.0 | 6.9 | 7.1% | 2 |
| ayk.WallHugger 1.0 | 8.2 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.2 | 67.0 | 6 / 35 | 2596 |
| 2 | 3 | 61.3 | 77.5 | 7 / 35 | 2493 |
| 3 | 3 | 61.4 | 77.1 | 8 / 35 | 2617 |
| 4 | 3 | 60.0 | 73.0 | 6 / 35 | 2831 |
| 5 | 3 | 60.8 | 74.6 | 10 / 35 | 2694 |
| 6 | 3 | 60.3 | 74.6 | 5 / 35 | 2647 |
| 7 | 3 | 59.6 | 73.3 | 7 / 35 | 2637 |
| 8 | 4 | 57.9 | 67.3 | 5 / 35 | 2425 |
| 9 | 3 | 62.1 | 78.4 | 9 / 35 | 2908 |
| 10 | 3 | 63.4 | 79.7 | 10 / 35 | 3219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 92 | 55% |
| ags.Glacier 0.2.11 | 57 | 16% |
| shinh.Entangled 0.3 | 16 | 50% |
| gh.micro.Gruweltje 0.7 | 5 | 60% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 277 of 350 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 101 | 36% | 111 |
| mn.Combat 3.25.0 | 74 | 27% | 118 |
| gh.micro.Gruweltje 0.7 | 37 | 13% | 43 |
| shinh.Entangled 0.3 | 27 | 10% | 36 |
| stelo.Wang 1.0 | 20 | 7% | 23 |
| apc.Colossus2 0.17 | 8 | 3% | 9 |
| maribo.FollowFire 1 | 5 | 2% | 5 |
| ayk.WallHugger 1.0 | 4 | 1% | 4 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroB480 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 81.3 | 141 / 350 | 2.49 | 16.1% | 25998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 19.6% | 135 |
| hadur117.nano.SanaroB480 0.3 | 2.0 | 16.1% | 141 |
| dmh.robocode.robot.RedDwarf 0.4 | 3.8 | 12.3% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 4.0 | 11.9% | 15 |
| sanyi.mikrobi.Roberto 1.0 | 5.2 | 11.2% | 13 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 10.8% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 9.7% | 24 |
| pa.Improved 1.0 | 8.0 | 6.1% | 3 |
| sample.TrackFire 1.0 | 9.0 | 2.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 83.2 | 13 / 35 | 2661 |
| 2 | 2 | 62.1 | 80.7 | 15 / 35 | 2390 |
| 3 | 2 | 62.8 | 77.5 | 12 / 35 | 3281 |
| 4 | 2 | 62.4 | 78.9 | 14 / 35 | 2643 |
| 5 | 2 | 62.2 | 78.9 | 14 / 35 | 2729 |
| 6 | 2 | 61.9 | 81.8 | 14 / 35 | 2292 |
| 7 | 2 | 62.0 | 80.7 | 14 / 35 | 2325 |
| 8 | 2 | 63.8 | 87.5 | 16 / 35 | 2524 |
| 9 | 2 | 63.2 | 81.8 | 14 / 35 | 2775 |
| 10 | 2 | 62.9 | 82.1 | 15 / 35 | 2378 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 149 | 57% |
| sheldor.micro.PointInLineRRAL 1.0 | 22 | 64% |
| sanyi.mikrobi.Roberto 1.0 | 17 | 71% |
| Lo_Ian.Gandalf_V4 4.0 | 16 | 56% |
| dmh.robocode.robot.RedDwarf 0.4 | 15 | 73% |
| co.edu.usb.rc.LidisTron 1.0 | 12 | 58% |
| pa.Improved 1.0 | 2 | 100% |
| sample.TrackFire 1.0 | 2 | 50% |

Hadur died in 210 of 350 rounds, at a mean tick of 1002. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 104 | 50% | 182 |
| Lo_Ian.Gandalf_V4 4.0 | 27 | 13% | 34 |
| dmh.robocode.robot.RedDwarf 0.4 | 23 | 11% | 35 |
| sheldor.micro.PointInLineRRAL 1.0 | 22 | 10% | 38 |
| sanyi.mikrobi.Roberto 1.0 | 17 | 8% | 33 |
| co.edu.usb.rc.LidisTron 1.0 | 13 | 6% | 13 |
| sample.TrackFire 1.0 | 3 | 1% | 5 |
| pa.Improved 1.0 | 1 | 0% | 8 |

## Melee bench: F15

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 67.7 | 66 / 350 | 3.91 | 12.9% | 30949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.4 | 14.7% | 77 |
| emp.Yngwie 1.11 | 2.8 | 13.6% | 97 |
| mld.DustBunny 3.8 | 2.8 | 13.6% | 40 |
| hadur117.nano.SanaroB480 0.3 | 3.2 | 12.9% | 66 |
| cb.nano.Insomnia 1.0 | 5.0 | 11.7% | 22 |
| kawigi.robot.Girl 1.2 | 5.8 | 10.4% | 44 |
| lambdaxy.TBot 0.1 | 7.5 | 6.9% | 0 |
| Grystrion.TrackerWO 1.0 | 7.6 | 6.8% | 0 |
| divineomega.TrialBot 0.003 | 9.1 | 5.2% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.9 | 65.7 | 6 / 35 | 2826 |
| 2 | 2 | 59.9 | 69.8 | 8 / 35 | 3183 |
| 3 | 2 | 60.5 | 71.7 | 7 / 35 | 3163 |
| 4 | 5 | 58.7 | 66.3 | 7 / 35 | 3164 |
| 5 | 4 | 57.0 | 63.8 | 4 / 35 | 2981 |
| 6 | 2 | 60.6 | 71.4 | 9 / 35 | 3279 |
| 7 | 4 | 58.8 | 67.0 | 6 / 35 | 3134 |
| 8 | 3 | 59.4 | 68.6 | 8 / 35 | 3165 |
| 9 | 4 | 56.0 | 63.2 | 2 / 35 | 2725 |
| 10 | 2 | 59.9 | 69.5 | 9 / 35 | 3329 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 43 | 63% |
| cb.nano.Insomnia 1.0 | 26 | 77% |
| kawigi.micro.Shiz 1.1 | 24 | 17% |
| mld.DustBunny 3.8 | 20 | 5% |
| kawigi.robot.Girl 1.2 | 16 | 69% |
| divineomega.TrialBot 0.003 | 3 | 100% |

Hadur died in 284 of 350 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 68 | 24% | 75 |
| emp.Yngwie 1.11 | 57 | 20% | 90 |
| kawigi.micro.Shiz 1.1 | 56 | 20% | 66 |
| cb.nano.Insomnia 1.0 | 46 | 16% | 45 |
| kawigi.robot.Girl 1.2 | 31 | 11% | 44 |
| Grystrion.TrackerWO 1.0 | 11 | 4% | 11 |
| divineomega.TrialBot 0.003 | 9 | 3% | 13 |
| lambdaxy.TBot 0.1 | 5 | 2% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 0% | 1 |

## Melee bench: F16

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 71.7 | 69 / 350 | 3.55 | 13.7% | 31676 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.2% | 148 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.2 | 14.5% | 15 |
| hadur117.nano.SanaroB480 0.3 | 2.9 | 13.7% | 69 |
| techdude.forest.FlamingForest 1.1 | 4.1 | 11.5% | 70 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.4% | 26 |
| bvh.fnr.Fenrir 0.36l | 5.8 | 9.1% | 6 |
| stelo.IntrinsicVolatility 1.4 | 6.5 | 8.2% | 8 |
| divineomega.DivineBot 1.9.4.5 | 8.4 | 5.5% | 7 |
| repositorio.NanoStep 1.0 | 9.2 | 4.9% | 1 |
| asd.Cthulhu 1.3 | 9.4 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 70.2 | 4 / 35 | 3334 |
| 2 | 3 | 61.2 | 71.7 | 9 / 35 | 3396 |
| 3 | 3 | 60.3 | 70.5 | 7 / 35 | 3070 |
| 4 | 3 | 58.8 | 65.7 | 8 / 35 | 3148 |
| 5 | 2 | 61.8 | 76.8 | 7 / 35 | 3045 |
| 6 | 3 | 60.2 | 71.4 | 8 / 35 | 3033 |
| 7 | 3 | 58.2 | 67.9 | 1 / 35 | 2998 |
| 8 | 2 | 64.4 | 81.3 | 12 / 35 | 3417 |
| 9 | 3 | 59.4 | 69.5 | 5 / 35 | 2999 |
| 10 | 4 | 61.4 | 71.7 | 8 / 35 | 3236 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 105 | 27% |
| techdude.forest.FlamingForest 1.1 | 28 | 36% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 100% |
| tvv.nano.Polaris 1.2 | 12 | 25% |
| bvh.fnr.Fenrir 0.36l | 9 | 78% |
| stelo.IntrinsicVolatility 1.4 | 4 | 75% |
| divineomega.DivineBot 1.9.4.5 | 3 | 67% |

Hadur died in 281 of 350 rounds, at a mean tick of 1598. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 137 | 49% | 172 |
| bvh.fnr.Fenrir 0.36l | 33 | 12% | 37 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 31 | 11% | 41 |
| techdude.forest.FlamingForest 1.1 | 31 | 11% | 41 |
| tvv.nano.Polaris 1.2 | 24 | 9% | 26 |
| stelo.IntrinsicVolatility 1.4 | 14 | 5% | 19 |
| asd.Cthulhu 1.3 | 6 | 2% | 6 |
| divineomega.DivineBot 1.9.4.5 | 5 | 2% | 7 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |

## Melee bench: F17

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 71.0 | 99 / 350 | 3.61 | 13.6% | 30532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.6 | 14.5% | 67 |
| hadur117.nano.SanaroB480 0.3 | 2.6 | 13.6% | 99 |
| oog.melee.Mercutio 1.0 | 3.0 | 13.5% | 70 |
| cx.BlestPain 1.41 | 3.5 | 12.6% | 50 |
| nic.Nicator 2.4 | 4.8 | 11.8% | 32 |
| ahf.NanoAndrew .4 | 5.6 | 10.8% | 26 |
| maribo.melee.BMV 0.1 | 6.9 | 8.8% | 4 |
| tex.Longbot 0.4 | 8.3 | 5.9% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.6% | 2 |
| goblin.Bender 2.4 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 73.0 | 7 / 35 | 3255 |
| 2 | 2 | 62.3 | 75.9 | 14 / 35 | 3065 |
| 3 | 3 | 60.3 | 71.4 | 10 / 35 | 2955 |
| 4 | 1 | 65.3 | 83.8 | 19 / 35 | 3399 |
| 5 | 3 | 58.6 | 67.6 | 7 / 35 | 2809 |
| 6 | 3 | 59.3 | 69.2 | 8 / 35 | 2867 |
| 7 | 2 | 60.3 | 70.8 | 10 / 35 | 3122 |
| 8 | 3 | 59.5 | 69.8 | 8 / 35 | 2723 |
| 9 | 5 | 56.3 | 59.0 | 7 / 35 | 3071 |
| 10 | 2 | 60.0 | 69.5 | 9 / 35 | 3266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 50 | 36% |
| oog.melee.Mercutio 1.0 | 46 | 67% |
| cx.BlestPain 1.41 | 30 | 87% |
| nic.Nicator 2.4 | 19 | 58% |
| ahf.NanoAndrew .4 | 13 | 69% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 252 of 350 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 75 | 30% | 92 |
| oog.melee.Mercutio 1.0 | 47 | 19% | 76 |
| ahf.NanoAndrew .4 | 38 | 15% | 51 |
| cx.BlestPain 1.41 | 31 | 12% | 58 |
| nic.Nicator 2.4 | 30 | 12% | 39 |
| maribo.melee.BMV 0.1 | 15 | 6% | 16 |
| edu.otg.spr.TheTeacher 1.2 | 7 | 3% | 8 |
| tex.Longbot 0.4 | 6 | 2% | 6 |
| goblin.Bender 2.4 | 3 | 1% | 4 |

## Melee bench: F18

hadur117.nano.SanaroB480 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 75.6 | 133 / 350 | 2.95 | 15.7% | 25887 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB480 0.3 | 1.3 | 15.7% | 133 |
| agd.Mooserwirt2 2.7 | 2.0 | 15.0% | 69 |
| uji.DBH 1.1 | 3.5 | 13.0% | 40 |
| spinnercat.Robovirus 2.718 | 3.9 | 12.6% | 29 |
| ratosh.Nobo 0.21 | 4.3 | 12.0% | 15 |
| sigterm.Sigterm 1.0 | 6.1 | 10.3% | 32 |
| kawigi.mini.Fhqwhgads 1.1 | 7.2 | 8.8% | 11 |
| stelo.WangRobot 1.0 | 8.1 | 6.7% | 20 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.6 | 6.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.7 | 73.2 | 10 / 35 | 2592 |
| 2 | 2 | 58.6 | 66.4 | 11 / 35 | 2885 |
| 3 | 1 | 62.5 | 80.7 | 17 / 35 | 2503 |
| 4 | 1 | 61.8 | 77.9 | 17 / 35 | 2555 |
| 5 | 1 | 60.6 | 75.0 | 13 / 35 | 2703 |
| 6 | 2 | 60.2 | 75.4 | 14 / 35 | 2361 |
| 7 | 1 | 63.4 | 83.9 | 17 / 35 | 2548 |
| 8 | 1 | 59.2 | 72.1 | 9 / 35 | 2667 |
| 9 | 1 | 60.9 | 76.4 | 14 / 35 | 2520 |
| 10 | 2 | 60.1 | 75.0 | 11 / 35 | 2553 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agd.Mooserwirt2 2.7 | 59 | 66% |
| sigterm.Sigterm 1.0 | 33 | 82% |
| spinnercat.Robovirus 2.718 | 32 | 78% |
| uji.DBH 1.1 | 31 | 45% |
| ratosh.Nobo 0.21 | 15 | 73% |
| kawigi.mini.Fhqwhgads 1.1 | 13 | 85% |
| stelo.WangRobot 1.0 | 13 | 46% |

Hadur died in 217 of 350 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 60 | 28% | 107 |
| uji.DBH 1.1 | 37 | 17% | 49 |
| ratosh.Nobo 0.21 | 31 | 14% | 48 |
| spinnercat.Robovirus 2.718 | 29 | 13% | 42 |
| sigterm.Sigterm 1.0 | 21 | 10% | 45 |
| stelo.WangRobot 1.0 | 21 | 10% | 25 |
| kawigi.mini.Fhqwhgads 1.1 | 13 | 6% | 27 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 5 | 2% | 6 |

## Melee bench: F19

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 85.4 | 150 / 350 | 2.31 | 16.3% | 33665 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB480 0.3 | 1.9 | 16.3% | 150 |
| davidalves.net.DuelistMiniMelee 1.2 | 1.9 | 16.2% | 77 |
| mld.Infinity 2.2 | 2.2 | 16.0% | 101 |
| krillr.mini.JointStrike 2.0.0 | 4.4 | 11.2% | 5 |
| erdnis.Rover 0.3 | 4.6 | 10.7% | 6 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.5% | 2 |
| pac.ABC 2.1 | 7.4 | 7.3% | 9 |
| mbh.Mbh 0.1 | 7.5 | 7.3% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.7% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 87.3 | 19 / 35 | 3697 |
| 2 | 1 | 65.5 | 84.8 | 14 / 35 | 3312 |
| 3 | 3 | 64.6 | 81.9 | 11 / 35 | 3380 |
| 4 | 2 | 65.8 | 85.7 | 13 / 35 | 3329 |
| 5 | 2 | 65.5 | 82.2 | 14 / 35 | 3704 |
| 6 | 2 | 66.7 | 88.3 | 15 / 35 | 3246 |
| 7 | 2 | 65.1 | 83.8 | 11 / 35 | 3439 |
| 8 | 1 | 67.6 | 91.1 | 23 / 35 | 3166 |
| 9 | 3 | 65.0 | 83.2 | 12 / 35 | 3122 |
| 10 | 2 | 66.2 | 85.7 | 18 / 35 | 3270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 124 | 62% |
| davidalves.net.DuelistMiniMelee 1.2 | 84 | 54% |
| krillr.mini.JointStrike 2.0.0 | 16 | 94% |
| erdnis.Rover 0.3 | 10 | 70% |
| pac.ABC 2.1 | 7 | 43% |
| patson.PatsonTestBot 1.0 | 3 | 67% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 200 of 350 rounds, at a mean tick of 1197. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 88 | 44% | 191 |
| mld.Infinity 2.2 | 58 | 29% | 35 |
| erdnis.Rover 0.3 | 17 | 9% | 35 |
| krillr.mini.JointStrike 2.0.0 | 14 | 7% | 28 |
| patson.PatsonTestBot 1.0 | 14 | 7% | 24 |
| pac.ABC 2.1 | 6 | 3% | 18 |
| pbg.R2D2 1.0 | 3 | 2% | 7 |
| mbh.Mbh 0.1 | 0 | 0% | 7 |

## Melee bench: F20

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 76.2 | 113 / 350 | 3.14 | 14.4% | 29894 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.5% | 125 |
| hadur117.nano.SanaroB480 0.3 | 2.1 | 14.4% | 113 |
| fwb.Nine 1.0.1 | 3.5 | 12.0% | 42 |
| catcat20.Rabbit 0.001 | 4.2 | 11.0% | 34 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 11.1% | 14 |
| djdjdj.NanoSkunk10 1.0 | 6.4 | 8.8% | 6 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 8.3% | 6 |
| bayen.nut.Squirrel 1.615 | 7.9 | 7.4% | 7 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 77.1 | 10 / 35 | 2669 |
| 2 | 2 | 62.5 | 80.3 | 14 / 35 | 2731 |
| 3 | 2 | 61.7 | 76.8 | 9 / 35 | 3047 |
| 4 | 2 | 63.0 | 77.5 | 13 / 35 | 3243 |
| 5 | 3 | 57.5 | 67.9 | 6 / 35 | 2438 |
| 6 | 2 | 62.6 | 78.1 | 11 / 35 | 3293 |
| 7 | 2 | 60.7 | 73.0 | 10 / 35 | 2853 |
| 8 | 2 | 63.5 | 81.6 | 16 / 35 | 2912 |
| 9 | 2 | 64.1 | 80.3 | 15 / 35 | 3451 |
| 10 | 2 | 60.1 | 69.5 | 9 / 35 | 3257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 89 | 51% |
| fwb.Nine 1.0.1 | 39 | 69% |
| catcat20.Rabbit 0.001 | 26 | 58% |
| nz.jdc.nano.GridFu 1.0 | 13 | 54% |
| bayen.nut.Squirrel 1.615 | 10 | 80% |
| djdjdj.NanoSkunk10 1.0 | 8 | 75% |
| m3thos.mini.Eva01 0.5.5 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 33% |

Hadur died in 237 of 350 rounds, at a mean tick of 1007. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 97 | 41% | 131 |
| fwb.Nine 1.0.1 | 41 | 17% | 42 |
| nz.jdc.nano.GridFu 1.0 | 36 | 15% | 55 |
| catcat20.Rabbit 0.001 | 23 | 10% | 43 |
| djdjdj.NanoSkunk10 1.0 | 14 | 6% | 28 |
| bayen.nut.Squirrel 1.615 | 14 | 6% | 24 |
| m3thos.mini.Eva01 0.5.5 | 7 | 3% | 14 |
| ntc.ControlledChaos 1.1.4 | 3 | 1% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 1% | 3 |

## Melee bench: F21

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 87.0 | 176 / 350 | 2.17 | 17.3% | 39542 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB480 0.3 | 1.2 | 17.3% | 176 |
| eem.EvBot v4.6.16 | 1.8 | 17.1% | 124 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.4% | 19 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 15 |
| eld.Hmm 1.0 | 5.2 | 8.9% | 17 |
| oa.weak.BotherBot 0.1 | 5.8 | 8.3% | 0 |
| fire219.CatBot 1.0 | 7.7 | 6.2% | 0 |
| el.JumpShoot 0.2 | 7.9 | 6.4% | 2 |
| PSW.Relentless 0.1 | 8.4 | 5.8% | 1 |
| arthord.MannyPacquiao Beta | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 87.9 | 19 / 35 | 4168 |
| 2 | 1 | 67.5 | 88.9 | 18 / 35 | 4067 |
| 3 | 1 | 68.9 | 93.0 | 21 / 35 | 3921 |
| 4 | 2 | 63.4 | 76.2 | 16 / 35 | 3751 |
| 5 | 1 | 67.4 | 90.8 | 16 / 35 | 3959 |
| 6 | 1 | 66.9 | 87.3 | 16 / 35 | 4070 |
| 7 | 1 | 66.4 | 85.7 | 18 / 35 | 3718 |
| 8 | 2 | 65.3 | 85.1 | 16 / 35 | 3427 |
| 9 | 1 | 67.6 | 89.5 | 20 / 35 | 4029 |
| 10 | 1 | 67.3 | 85.7 | 16 / 35 | 4432 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 167 | 58% |
| dummy.mini.Scimitar 1.01 | 50 | 88% |
| cf.RiO.RiOx 4.2.1 | 22 | 64% |
| eld.Hmm 1.0 | 20 | 80% |
| oa.weak.BotherBot 0.1 | 4 | 100% |

Hadur died in 175 of 350 rounds, at a mean tick of 1526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 88 | 50% | 169 |
| dummy.mini.Scimitar 1.01 | 34 | 19% | 90 |
| cf.RiO.RiOx 4.2.1 | 25 | 14% | 34 |
| eld.Hmm 1.0 | 11 | 6% | 34 |
| PSW.Relentless 0.1 | 5 | 3% | 6 |
| el.JumpShoot 0.2 | 4 | 2% | 6 |
| arthord.MannyPacquiao Beta | 3 | 2% | 3 |
| oa.weak.BotherBot 0.1 | 2 | 1% | 6 |
| fire219.CatBot 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 84.3 | 146 / 350 | 2.41 | 16.3% | 35373 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.0 | 18.4% | 123 |
| hadur117.nano.SanaroB480 0.3 | 2.4 | 16.3% | 146 |
| cre.Karolos 0.32 | 2.6 | 15.1% | 53 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.9% | 16 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 9.0% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.9 | 9.0% | 2 |
| sample.Walls 1.0 | 6.9 | 8.3% | 2 |
| cw.megas.Blade 0.8 | 7.4 | 8.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.4 | 81.3 | 12 / 35 | 3389 |
| 2 | 3 | 65.2 | 80.0 | 13 / 35 | 3579 |
| 3 | 3 | 65.1 | 81.9 | 10 / 35 | 3496 |
| 4 | 2 | 67.1 | 89.2 | 17 / 35 | 3489 |
| 5 | 2 | 66.1 | 85.4 | 16 / 35 | 3004 |
| 6 | 2 | 65.6 | 85.1 | 14 / 35 | 3156 |
| 7 | 2 | 68.5 | 88.6 | 19 / 35 | 4085 |
| 8 | 3 | 65.7 | 80.3 | 14 / 35 | 3713 |
| 9 | 2 | 68.1 | 88.3 | 17 / 35 | 4056 |
| 10 | 2 | 65.0 | 83.2 | 14 / 35 | 3406 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 128 | 55% |
| cre.Karolos 0.32 | 57 | 65% |
| sample.Walls 1.0 | 18 | 100% |
| stelo.AreaTargetingBot 1.1 | 14 | 43% |
| stelo.RamTrackSurfer 1.2 | 10 | 90% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 205 of 350 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 112 | 55% | 191 |
| cre.Karolos 0.32 | 47 | 23% | 82 |
| stelo.AreaTargetingBot 1.1 | 20 | 10% | 25 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 11 | 5% | 17 |
| stelo.RamTrackSurfer 1.2 | 9 | 4% | 19 |
| cw.megas.Blade 0.8 | 3 | 1% | 6 |
| sample.Walls 1.0 | 2 | 1% | 9 |
| rrh.Iwillfindyou 2.0 | 1 | 0% | 1 |

## Melee bench: F24

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.6 | 60.7 | 57 / 350 | 4.53 | 11.1% | 22404 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.1 | 15.1% | 94 |
| davidalves.Phoenix 0.54 | 2.5 | 13.8% | 82 |
| florent.XSeries.X2 0.12 | 2.5 | 13.7% | 66 |
| hadur117.nano.SanaroB480 0.3 | 4.4 | 11.1% | 57 |
| pedersen.Ugluk 1.1.1 | 4.5 | 11.5% | 26 |
| stelo.SoJNanoMelee 1.1 | 6.4 | 9.1% | 18 |
| oog.melee.Corsair 1.0 | 6.6 | 8.9% | 7 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.7% | 0 |
| as.FrankTheTank 1.3 | 9.3 | 5.4% | 0 |
| evd.X1 0.01 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.8 | 62.5 | 4 / 35 | 2316 |
| 2 | 3 | 60.0 | 73.7 | 12 / 35 | 2354 |
| 3 | 4 | 54.6 | 59.4 | 7 / 35 | 2415 |
| 4 | 5 | 50.6 | 52.7 | 3 / 35 | 1953 |
| 5 | 5 | 55.9 | 64.4 | 6 / 35 | 2163 |
| 6 | 5 | 53.2 | 57.8 | 4 / 35 | 2251 |
| 7 | 4 | 56.8 | 66.0 | 8 / 35 | 2319 |
| 8 | 4 | 53.4 | 59.4 | 4 / 35 | 2225 |
| 9 | 5 | 51.8 | 54.3 | 4 / 35 | 2096 |
| 10 | 5 | 53.6 | 57.1 | 5 / 35 | 2312 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 28 | 54% |
| rz.GlowBlowMelee 1.4 | 28 | 46% |
| florent.XSeries.X2 0.12 | 21 | 38% |
| pedersen.Ugluk 1.1.1 | 13 | 77% |
| stelo.SoJNanoMelee 1.1 | 11 | 36% |
| oog.melee.Corsair 1.0 | 7 | 57% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 293 of 350 rounds, at a mean tick of 647. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 63 | 22% | 72 |
| rz.GlowBlowMelee 1.4 | 60 | 20% | 70 |
| florent.XSeries.X2 0.12 | 58 | 20% | 71 |
| pedersen.Ugluk 1.1.1 | 43 | 15% | 46 |
| stelo.SoJNanoMelee 1.1 | 31 | 11% | 37 |
| oog.melee.Corsair 1.0 | 16 | 5% | 24 |
| evd.X1 0.01 | 10 | 3% | 11 |
| lunchie.Lunchbox 0.93 | 8 | 3% | 12 |
| as.FrankTheTank 1.3 | 4 | 1% | 7 |

## Melee bench: F25

hadur117.nano.SanaroB480 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 73.2 | 103 / 350 | 3.14 | 15.0% | 22561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.7 | 15.8% | 68 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 15.9% | 77 |
| hadur117.nano.SanaroB480 0.3 | 2.3 | 15.0% | 103 |
| jdw.Hurricane 1.4 | 4.1 | 13.4% | 53 |
| ds.Oo 2.2 | 5.3 | 10.0% | 19 |
| gjr.Cephalosporin 0.1 | 5.9 | 9.3% | 22 |
| awesomeness.Elite 1.0 | 7.3 | 7.6% | 5 |
| adt.Ar2 1.1 | 7.5 | 7.9% | 4 |
| amk.ChumbaMini 0.2 | 8.9 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 70.4 | 10 / 35 | 2556 |
| 2 | 3 | 60.7 | 75.0 | 9 / 35 | 2319 |
| 3 | 1 | 62.1 | 78.2 | 15 / 35 | 2227 |
| 4 | 3 | 57.1 | 66.8 | 10 / 35 | 2023 |
| 5 | 3 | 60.3 | 72.1 | 13 / 35 | 2311 |
| 6 | 3 | 56.6 | 65.0 | 6 / 35 | 2214 |
| 7 | 2 | 61.7 | 77.5 | 11 / 35 | 2475 |
| 8 | 2 | 59.2 | 73.9 | 8 / 35 | 2201 |
| 9 | 2 | 60.7 | 76.1 | 11 / 35 | 2144 |
| 10 | 1 | 60.4 | 77.1 | 10 / 35 | 2091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 57 | 37% |
| voidious.mini.BrokenSword 2.0.3 | 56 | 48% |
| jdw.Hurricane 1.4 | 48 | 67% |
| gjr.Cephalosporin 0.1 | 15 | 67% |
| awesomeness.Elite 1.0 | 6 | 83% |
| ds.Oo 2.2 | 5 | 40% |
| adt.Ar2 1.1 | 5 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 247 of 350 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 82 | 33% | 105 |
| voidious.mini.BrokenSword 2.0.3 | 53 | 21% | 86 |
| jdw.Hurricane 1.4 | 38 | 15% | 57 |
| gjr.Cephalosporin 0.1 | 27 | 11% | 40 |
| ds.Oo 2.2 | 19 | 8% | 23 |
| adt.Ar2 1.1 | 17 | 7% | 22 |
| amk.ChumbaMini 0.2 | 6 | 2% | 8 |
| awesomeness.Elite 1.0 | 5 | 2% | 9 |

## Melee bench: F26

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 73.1 | 88 / 350 | 3.42 | 13.5% | 31065 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 15.9% | 106 |
| hadur117.nano.SanaroB480 0.3 | 2.4 | 13.5% | 88 |
| shu.nitro.LENIN .T34 | 3.4 | 12.9% | 64 |
| lrem.Spectre 0.4.4 | 3.7 | 12.4% | 41 |
| js.PinBall 1.6 | 5.2 | 11.4% | 22 |
| gh.mini.GrubbmOne 1.0 | 5.3 | 11.0% | 18 |
| jaybot.adv.bots.JayBot 2.0 | 7.0 | 8.9% | 7 |
| fullsail.LaxativeTeaTwo 1.0 | 8.2 | 6.9% | 5 |
| sample.SpinBot 1.0 | 8.8 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.9 | 73.7 | 7 / 35 | 3304 |
| 2 | 2 | 60.4 | 71.7 | 10 / 35 | 3173 |
| 3 | 2 | 60.0 | 70.8 | 8 / 35 | 3109 |
| 4 | 2 | 61.1 | 75.2 | 7 / 35 | 3252 |
| 5 | 2 | 62.6 | 77.1 | 12 / 35 | 3321 |
| 6 | 2 | 61.0 | 74.0 | 11 / 35 | 2813 |
| 7 | 2 | 62.3 | 78.7 | 10 / 35 | 3122 |
| 8 | 3 | 59.7 | 71.7 | 9 / 35 | 2941 |
| 9 | 3 | 60.3 | 70.2 | 8 / 35 | 3116 |
| 10 | 4 | 58.8 | 67.9 | 6 / 35 | 2914 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 60 | 57% |
| lrem.Spectre 0.4.4 | 34 | 59% |
| shu.nitro.LENIN .T34 | 34 | 41% |
| gh.mini.GrubbmOne 1.0 | 15 | 33% |
| js.PinBall 1.6 | 7 | 71% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 50% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 75% |
| sample.SpinBot 1.0 | 2 | 100% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 263 of 350 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 81 | 31% | 114 |
| shu.nitro.LENIN .T34 | 49 | 19% | 69 |
| lrem.Spectre 0.4.4 | 39 | 15% | 50 |
| gh.mini.GrubbmOne 1.0 | 34 | 13% | 41 |
| js.PinBall 1.6 | 28 | 11% | 34 |
| jaybot.adv.bots.JayBot 2.0 | 17 | 6% | 22 |
| fullsail.LaxativeTeaTwo 1.0 | 11 | 4% | 16 |
| sample.SpinBot 1.0 | 3 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 72.6 | 130 / 350 | 3.47 | 14.0% | 27974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.2 | 15.1% | 102 |
| hadur117.nano.SanaroB480 0.3 | 2.3 | 14.0% | 130 |
| wee.Gem 1.8.4 | 4.0 | 11.9% | 51 |
| EH.Eagle 1.0.6 | 4.2 | 11.3% | 19 |
| sheldor.melee.nano.TestMelee 0.1 | 4.4 | 11.5% | 30 |
| joe.ADinosaur 1.0 | 6.1 | 9.1% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 6.6 | 8.9% | 7 |
| throxbot.ThroxBot 0.1 | 7.8 | 7.3% | 1 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.4% | 4 |
| cs.Grudge 1.0 | 9.6 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 83.2 | 17 / 35 | 2867 |
| 2 | 1 | 62.6 | 79.0 | 17 / 35 | 2622 |
| 3 | 5 | 48.8 | 36.5 | 3 / 35 | 3531 |
| 4 | 2 | 61.2 | 74.6 | 15 / 35 | 2591 |
| 5 | 2 | 60.9 | 77.8 | 13 / 35 | 2288 |
| 6 | 2 | 61.7 | 78.4 | 15 / 35 | 2534 |
| 7 | 2 | 61.8 | 79.4 | 14 / 35 | 2445 |
| 8 | 2 | 62.9 | 77.8 | 17 / 35 | 2916 |
| 9 | 2 | 62.2 | 81.6 | 14 / 35 | 2176 |
| 10 | 4 | 57.9 | 57.8 | 5 / 35 | 4004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 88 | 70% |
| wee.Gem 1.8.4 | 36 | 58% |
| sheldor.melee.nano.TestMelee 0.1 | 25 | 68% |
| EH.Eagle 1.0.6 | 19 | 95% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 78% |
| joe.ADinosaur 1.0 | 4 | 25% |
| throxbot.ThroxBot 0.1 | 4 | 100% |

Hadur died in 221 of 350 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 69 | 31% | 130 |
| sheldor.melee.nano.TestMelee 0.1 | 35 | 16% | 56 |
| wee.Gem 1.8.4 | 31 | 14% | 51 |
| joe.ADinosaur 1.0 | 23 | 10% | 26 |
| EH.Eagle 1.0.6 | 18 | 8% | 37 |
| cs.Grudge 1.0 | 15 | 7% | 16 |
| throxbot.ThroxBot 0.1 | 12 | 5% | 12 |
| caimano.Furia_Ceca 0.22 | 10 | 5% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 8 | 4% | 12 |

## Melee bench: F28

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 82.8 | 149 / 350 | 2.55 | 15.8% | 29592 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB480 0.3 | 1.5 | 15.8% | 149 |
| kid.test.NightFox .2 | 1.5 | 16.2% | 96 |
| uji.Antique 1.0 | 3.4 | 12.2% | 53 |
| qohnil.blot.BlotBot 3.61 | 3.9 | 11.4% | 31 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.4% | 8 |
| ahr.ice.Ice 1.0.2 | 6.6 | 8.3% | 7 |
| amk.ChumbaWumba 0.3 | 6.6 | 8.4% | 5 |
| matt.advanced.Katana 1.0 | 8.1 | 6.4% | 2 |
| stelo.PianistNano 1.2 | 9.2 | 5.5% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 84.1 | 15 / 35 | 3008 |
| 2 | 1 | 65.8 | 86.7 | 21 / 35 | 2901 |
| 3 | 2 | 60.6 | 75.2 | 9 / 35 | 2756 |
| 4 | 1 | 64.6 | 85.7 | 15 / 35 | 3029 |
| 5 | 2 | 63.6 | 82.9 | 11 / 35 | 2894 |
| 6 | 2 | 63.5 | 83.5 | 13 / 35 | 2791 |
| 7 | 2 | 64.7 | 85.1 | 16 / 35 | 3029 |
| 8 | 1 | 64.4 | 83.5 | 17 / 35 | 2956 |
| 9 | 2 | 61.9 | 75.6 | 14 / 35 | 3114 |
| 10 | 1 | 65.3 | 85.4 | 18 / 35 | 3114 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 144 | 66% |
| uji.Antique 1.0 | 46 | 65% |
| qohnil.blot.BlotBot 3.61 | 27 | 30% |
| ahr.ice.Ice 1.0.2 | 8 | 63% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |
| amk.ChumbaWumba 0.3 | 5 | 80% |
| matt.advanced.Katana 1.0 | 2 | 50% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 203 of 350 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 81 | 40% | 149 |
| qohnil.blot.BlotBot 3.61 | 30 | 15% | 38 |
| uji.Antique 1.0 | 27 | 13% | 69 |
| pfvicm.Sobieski 7.2.3b | 25 | 12% | 33 |
| ahr.ice.Ice 1.0.2 | 17 | 8% | 23 |
| amk.ChumbaWumba 0.3 | 15 | 7% | 20 |
| matt.advanced.Katana 1.0 | 3 | 1% | 9 |
| stelo.PianistNano 1.2 | 3 | 1% | 4 |
| stelo.Lifestealer 1.0 | 1 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 73.6 | 78 / 350 | 3.38 | 14.0% | 29184 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.0 | 17.0% | 127 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 14.7% | 75 |
| hadur117.nano.SanaroB480 0.3 | 2.8 | 14.0% | 78 |
| myl.micro.Troodon 1.10 | 4.1 | 11.9% | 18 |
| jok.PheonixM 0.1.2 | 4.8 | 11.6% | 19 |
| DBall.Anarchy 0.1 | 6.5 | 8.5% | 28 |
| ph.melee.ArcherME 0.3 | 6.5 | 8.2% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 8.4 | 5.4% | 0 |
| jangs.ns51 1.0 | 9.2 | 4.3% | 0 |
| ap.Frederick 1.1 | 9.4 | 4.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 72.1 | 9 / 35 | 3242 |
| 2 | 2 | 62.2 | 77.5 | 9 / 35 | 2757 |
| 3 | 3 | 61.2 | 73.3 | 7 / 35 | 2633 |
| 4 | 3 | 60.1 | 69.8 | 6 / 35 | 2912 |
| 5 | 2 | 61.7 | 74.6 | 7 / 35 | 2879 |
| 6 | 3 | 59.7 | 67.9 | 8 / 35 | 2836 |
| 7 | 3 | 60.7 | 69.5 | 9 / 35 | 2977 |
| 8 | 3 | 62.9 | 76.8 | 7 / 35 | 3155 |
| 9 | 3 | 62.4 | 78.1 | 7 / 35 | 2822 |
| 10 | 3 | 62.6 | 76.2 | 9 / 35 | 2971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 75 | 5% |
| zyx.mega.YersiniaPestis 3.1 | 45 | 78% |
| DBall.Anarchy 0.1 | 24 | 50% |
| myl.micro.Troodon 1.10 | 21 | 81% |
| jok.PheonixM 0.1.2 | 9 | 56% |
| ph.melee.ArcherME 0.3 | 3 | 100% |
| ap.Frederick 1.1 | 2 | 50% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 273 of 350 rounds, at a mean tick of 1401. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 124 | 45% | 132 |
| zyx.mega.YersiniaPestis 3.1 | 41 | 15% | 72 |
| myl.micro.Troodon 1.10 | 34 | 12% | 49 |
| jok.PheonixM 0.1.2 | 33 | 12% | 41 |
| DBall.Anarchy 0.1 | 17 | 6% | 29 |
| ph.melee.ArcherME 0.3 | 12 | 4% | 15 |
| fullsail.TimbotNoPrediction 1.0 | 7 | 3% | 7 |
| jangs.ns51 1.0 | 4 | 1% | 4 |
| ap.Frederick 1.1 | 1 | 0% | 0 |

## Melee bench: F30

hadur117.nano.SanaroB480 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.2 | 61.3 | 51 / 350 | 4.10 | 12.3% | 23120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 1.6 | 16.8% | 118 |
| oog.melee.Capulet 1.2 | 2.1 | 15.9% | 76 |
| stelo.PastFuture 2.3.2 | 2.3 | 15.7% | 65 |
| hadur117.nano.SanaroB480 0.3 | 4.1 | 12.3% | 51 |
| intruder.PrairieWolf 2.61 | 5.9 | 10.2% | 23 |
| tripphippy.Alice 1.1 | 6.4 | 9.1% | 6 |
| ntc.Opposite 1.5 | 6.7 | 8.8% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 6.9 | 8.5% | 10 |
| GarmBox.Anger 1.0 | 9.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.8 | 62.1 | 6 / 35 | 2284 |
| 2 | 4 | 55.0 | 60.0 | 5 / 35 | 2308 |
| 3 | 4 | 54.9 | 57.9 | 6 / 35 | 2307 |
| 4 | 4 | 55.4 | 64.6 | 4 / 35 | 2033 |
| 5 | 5 | 51.6 | 53.2 | 2 / 35 | 2181 |
| 6 | 4 | 58.1 | 67.1 | 7 / 35 | 2583 |
| 7 | 4 | 52.6 | 57.5 | 2 / 35 | 2153 |
| 8 | 4 | 58.0 | 68.2 | 9 / 35 | 2383 |
| 9 | 4 | 56.4 | 63.6 | 7 / 35 | 2419 |
| 10 | 4 | 54.3 | 58.6 | 3 / 35 | 2469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 52 | 31% |
| oog.melee.Capulet 1.2 | 26 | 31% |
| stelo.PastFuture 2.3.2 | 22 | 59% |
| intruder.PrairieWolf 2.61 | 9 | 44% |
| fowl3628800.LightningBolt 2.6.0 | 9 | 78% |
| tripphippy.Alice 1.1 | 3 | 67% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 299 of 350 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 88 | 29% | 99 |
| stelo.PastFuture 2.3.2 | 62 | 21% | 75 |
| oog.melee.Capulet 1.2 | 57 | 19% | 70 |
| intruder.PrairieWolf 2.61 | 25 | 8% | 29 |
| ntc.Opposite 1.5 | 24 | 8% | 25 |
| fowl3628800.LightningBolt 2.6.0 | 22 | 7% | 27 |
| tripphippy.Alice 1.1 | 19 | 6% | 22 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |

## Melee bench: F31

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.0 | 61.8 | 43 / 350 | 4.44 | 11.1% | 21080 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.0% | 168 |
| gh.mini.Griezel 0.2 | 2.3 | 13.7% | 78 |
| spinnercat.micro.Tyger 0.1 | 3.1 | 12.3% | 27 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.6% | 21 |
| hadur117.nano.SanaroB480 0.3 | 4.7 | 11.1% | 43 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.1% | 9 |
| timmit.nano.TimDog 0.33 | 7.4 | 7.4% | 4 |
| fm.mammillarias 1.3 | 7.5 | 7.0% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 9.1 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.9 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.1 | 65.1 | 4 / 35 | 2026 |
| 2 | 5 | 56.3 | 62.9 | 6 / 35 | 2309 |
| 3 | 4 | 57.4 | 68.3 | 5 / 35 | 2167 |
| 4 | 4 | 56.6 | 64.8 | 7 / 35 | 2207 |
| 5 | 5 | 53.5 | 58.1 | 4 / 35 | 2140 |
| 6 | 4 | 54.8 | 61.9 | 3 / 35 | 2109 |
| 7 | 5 | 52.7 | 56.8 | 4 / 35 | 1958 |
| 8 | 6 | 51.8 | 56.2 | 1 / 35 | 1917 |
| 9 | 5 | 56.5 | 64.4 | 7 / 35 | 1991 |
| 10 | 5 | 54.1 | 59.7 | 2 / 35 | 2256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 59 | 42% |
| gh.mini.Griezel 0.2 | 37 | 30% |
| d414.nano.Quantum 1.0.0 | 9 | 44% |
| spinnercat.micro.Tyger 0.1 | 7 | 0% |
| timmit.nano.TimDog 0.33 | 2 | 100% |

Hadur died in 307 of 350 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 77 | 25% | 89 |
| abc.Shadow 3.84i | 76 | 25% | 100 |
| spinnercat.micro.Tyger 0.1 | 53 | 17% | 55 |
| d414.nano.Quantum 1.0.0 | 39 | 13% | 42 |
| gh.nano.Grofvuil 0.2 | 23 | 7% | 23 |
| fm.mammillarias 1.3 | 21 | 7% | 21 |
| timmit.nano.TimDog 0.33 | 10 | 3% | 12 |
| Gecko.ultimateGeckoBot 1.0 | 6 | 2% | 6 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 78.9 | 152 / 350 | 2.90 | 15.0% | 30251 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB480 0.3 | 1.5 | 15.0% | 152 |
| kawigi.sbf.FloodHT 0.9.2 | 1.5 | 15.4% | 106 |
| apc.botM 3.0 | 3.3 | 12.5% | 36 |
| vjik.UnViolation 1.1 | 3.9 | 11.6% | 27 |
| lxx.ConceptA 0.8 | 4.9 | 10.8% | 6 |
| bayen.UbaMicro 1.4 | 6.0 | 9.3% | 8 |
| panzer.Panzer 0.2 | 7.2 | 7.4% | 0 |
| conscience.Electron 1.3g | 8.3 | 6.5% | 3 |
| yk.JahMicro 1.0 | 8.5 | 6.4% | 5 |
| donjezza.Jezza 1.0 | 9.9 | 5.2% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 81.6 | 15 / 35 | 2634 |
| 2 | 1 | 64.6 | 84.4 | 20 / 35 | 3116 |
| 3 | 2 | 60.0 | 71.7 | 12 / 35 | 2914 |
| 4 | 2 | 65.0 | 85.7 | 19 / 35 | 3058 |
| 5 | 1 | 61.2 | 76.5 | 15 / 35 | 2806 |
| 6 | 1 | 63.5 | 82.9 | 15 / 35 | 3179 |
| 7 | 2 | 60.0 | 72.7 | 8 / 35 | 3063 |
| 8 | 1 | 63.5 | 81.0 | 17 / 35 | 3103 |
| 9 | 2 | 62.5 | 77.8 | 15 / 35 | 3089 |
| 10 | 2 | 62.0 | 74.9 | 16 / 35 | 3289 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 92 | 61% |
| apc.botM 3.0 | 40 | 80% |
| vjik.UnViolation 1.1 | 27 | 78% |
| lxx.ConceptA 0.8 | 24 | 100% |
| bayen.UbaMicro 1.4 | 9 | 78% |
| donjezza.Jezza 1.0 | 7 | 57% |
| yk.JahMicro 1.0 | 5 | 80% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 199 of 350 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 65 | 33% | 129 |
| apc.botM 3.0 | 36 | 18% | 69 |
| lxx.ConceptA 0.8 | 36 | 18% | 51 |
| vjik.UnViolation 1.1 | 22 | 11% | 49 |
| bayen.UbaMicro 1.4 | 19 | 10% | 23 |
| conscience.Electron 1.3g | 9 | 5% | 9 |
| yk.JahMicro 1.0 | 6 | 3% | 7 |
| donjezza.Jezza 1.0 | 3 | 2% | 8 |
| panzer.Panzer 0.2 | 3 | 2% | 5 |

## Melee bench: F33

hadur117.nano.SanaroB480 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 77.2 | 113 / 350 | 2.82 | 16.4% | 29957 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.3 | 18.5% | 101 |
| hadur117.nano.SanaroB480 0.3 | 2.3 | 16.4% | 113 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 15.9% | 86 |
| labg.Cataclysm 2.05 | 3.9 | 13.3% | 36 |
| baal.nano.N 1.42 | 5.3 | 9.9% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.8 | 9.7% | 13 |
| zyx.micro.Ant 1.1 | 6.9 | 6.8% | 1 |
| sanja.First 0.1 | 8.1 | 5.2% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 8.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 78.9 | 10 / 35 | 3244 |
| 2 | 2 | 64.4 | 81.8 | 14 / 35 | 3146 |
| 3 | 2 | 64.6 | 81.1 | 14 / 35 | 3022 |
| 4 | 2 | 61.1 | 72.1 | 9 / 35 | 2684 |
| 5 | 3 | 61.8 | 74.6 | 10 / 35 | 2957 |
| 6 | 2 | 63.9 | 78.6 | 15 / 35 | 3092 |
| 7 | 2 | 64.4 | 80.7 | 11 / 35 | 3109 |
| 8 | 2 | 60.7 | 70.7 | 12 / 35 | 2714 |
| 9 | 3 | 62.5 | 75.0 | 10 / 35 | 3197 |
| 10 | 3 | 63.0 | 78.6 | 8 / 35 | 2792 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 87 | 64% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 77 | 23% |
| labg.Cataclysm 2.05 | 31 | 61% |
| kinsen.melee.Angsaichmophobia 1.8c | 15 | 80% |
| baal.nano.N 1.42 | 4 | 100% |
| sanja.First 0.1 | 3 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 239 of 350 rounds, at a mean tick of 1601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 88 | 37% | 108 |
| maribo.Quester 0.3 | 84 | 35% | 143 |
| labg.Cataclysm 2.05 | 25 | 10% | 43 |
| kinsen.melee.Angsaichmophobia 1.8c | 18 | 8% | 23 |
| baal.nano.N 1.42 | 13 | 5% | 16 |
| zyx.micro.Ant 1.1 | 10 | 4% | 12 |
| sanja.First 0.1 | 1 | 0% | 4 |

## Melee bench: F34

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 75.9 | 94 / 350 | 3.17 | 14.1% | 29552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.4 | 17.4% | 102 |
| stelo.Spread 0.9 | 1.6 | 17.2% | 112 |
| hadur117.nano.SanaroB480 0.3 | 3.0 | 14.1% | 94 |
| jcs.Seth 1.8 | 4.4 | 11.5% | 25 |
| tcf.Reach 3 | 4.7 | 11.3% | 15 |
| cli.Dancer 1.1 | 5.9 | 9.5% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.2% | 0 |
| sample.VelociRobot 1.0 | 9.1 | 3.6% | 0 |
| sample.RamFire 1.0 | 9.9 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 68.9 | 7 / 35 | 2633 |
| 2 | 3 | 62.4 | 77.1 | 9 / 35 | 2960 |
| 3 | 3 | 61.4 | 72.7 | 10 / 35 | 2817 |
| 4 | 3 | 61.9 | 74.6 | 6 / 35 | 3067 |
| 5 | 3 | 62.4 | 75.2 | 9 / 35 | 3047 |
| 6 | 3 | 64.8 | 82.9 | 9 / 35 | 3390 |
| 7 | 3 | 62.6 | 73.7 | 11 / 35 | 3247 |
| 8 | 3 | 63.1 | 79.7 | 12 / 35 | 2667 |
| 9 | 3 | 61.0 | 72.1 | 8 / 35 | 2817 |
| 10 | 3 | 64.5 | 82.5 | 13 / 35 | 2907 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 80 | 58% |
| kid.Gladiator .7.2 | 65 | 37% |
| jcs.Seth 1.8 | 25 | 60% |
| tcf.Reach 3 | 15 | 53% |
| cli.Dancer 1.1 | 1 | 0% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 257 of 350 rounds, at a mean tick of 1091. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 95 | 37% | 106 |
| stelo.Spread 0.9 | 86 | 33% | 139 |
| jcs.Seth 1.8 | 26 | 10% | 43 |
| tcf.Reach 3 | 21 | 8% | 32 |
| ratosh.Wesco 1.4 | 15 | 6% | 16 |
| cli.Dancer 1.1 | 10 | 4% | 11 |
| amk.Punbot.Punbot 0.01 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 69.3 | 28 / 350 | 3.76 | 12.1% | 22614 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.5% | 268 |
| gh.mini.Gruwel 0.9 | 2.9 | 12.9% | 29 |
| rz.HawkOnFire 0.1 | 3.6 | 12.4% | 10 |
| hadur117.nano.SanaroB480 0.3 | 3.7 | 12.1% | 28 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.3% | 16 |
| wit.Chuliath 1.0 | 6.3 | 7.5% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 6.9% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 6.0% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.0 | 76.2 | 4 / 35 | 2295 |
| 2 | 5 | 56.2 | 65.4 | 1 / 35 | 2065 |
| 3 | 4 | 56.7 | 66.7 | 2 / 35 | 2166 |
| 4 | 3 | 59.7 | 72.7 | 4 / 35 | 2455 |
| 5 | 5 | 55.3 | 62.9 | 1 / 35 | 2134 |
| 6 | 3 | 59.3 | 72.7 | 5 / 35 | 2295 |
| 7 | 4 | 57.4 | 65.1 | 2 / 35 | 2493 |
| 8 | 2 | 60.9 | 76.8 | 6 / 35 | 2387 |
| 9 | 4 | 58.2 | 69.8 | 3 / 35 | 2246 |
| 10 | 5 | 55.6 | 64.8 | 0 / 35 | 2078 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 93 | 1% |
| gh.mini.Gruwel 0.9 | 20 | 65% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 70% |
| rz.HawkOnFire 0.1 | 6 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 322 of 350 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 155 | 48% | 158 |
| gh.mini.Gruwel 0.9 | 50 | 16% | 63 |
| rz.HawkOnFire 0.1 | 42 | 13% | 46 |
| dmh.robocode.robot.BlackDeath 9.2 | 41 | 13% | 48 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 11 | 3% | 11 |
| myl.nano.KomoriNinja 1.1 | 11 | 3% | 11 |
| wit.Chuliath 1.0 | 6 | 2% | 8 |
| stelo.MyAgileRobot 0.2 | 4 | 1% | 3 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 77.1 | 147 / 350 | 3.06 | 15.2% | 31186 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB480 0.3 | 1.1 | 15.2% | 147 |
| alpha.RainingFire 1.0 | 2.8 | 13.1% | 55 |
| bzdp.Pansy 2.1 | 3.3 | 12.3% | 45 |
| mz.Cork 0.1 | 3.9 | 11.5% | 32 |
| bvh.micro.Freya 0.3 | 4.6 | 11.3% | 28 |
| m3thos.Eva02 0.7.1 | 6.1 | 10.0% | 18 |
| bvh.mini.Fenrir 0.39 | 6.2 | 9.6% | 8 |
| dl.BetterWalls 1.0 | 8.5 | 6.4% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 6.4% | 4 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.2% | 12 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.3 | 72.1 | 10 / 35 | 3477 |
| 2 | 1 | 59.6 | 68.9 | 11 / 35 | 3158 |
| 3 | 1 | 65.8 | 86.3 | 20 / 35 | 3243 |
| 4 | 1 | 63.8 | 81.9 | 12 / 35 | 3284 |
| 5 | 1 | 61.5 | 74.9 | 16 / 35 | 2760 |
| 6 | 1 | 62.9 | 76.2 | 18 / 35 | 3157 |
| 7 | 2 | 61.3 | 73.7 | 13 / 35 | 2885 |
| 8 | 1 | 65.7 | 85.1 | 16 / 35 | 3302 |
| 9 | 1 | 60.1 | 71.1 | 11 / 35 | 3039 |
| 10 | 1 | 64.2 | 81.3 | 20 / 35 | 2881 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 50 | 60% |
| alpha.RainingFire 1.0 | 40 | 55% |
| bvh.micro.Freya 0.3 | 33 | 88% |
| mz.Cork 0.1 | 30 | 93% |
| bvh.mini.Fenrir 0.39 | 21 | 90% |
| m3thos.Eva02 0.7.1 | 19 | 63% |
| sample.MyFirstRobot 1.0 | 5 | 20% |
| dl.BetterWalls 1.0 | 5 | 80% |
| squidM.TentalceMeleeNano 1.1 | 3 | 33% |

Hadur died in 204 of 350 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 49 | 24% | 86 |
| alpha.RainingFire 1.0 | 48 | 24% | 67 |
| bvh.micro.Freya 0.3 | 24 | 12% | 42 |
| mz.Cork 0.1 | 23 | 11% | 55 |
| m3thos.Eva02 0.7.1 | 20 | 10% | 38 |
| bvh.mini.Fenrir 0.39 | 20 | 10% | 26 |
| dl.BetterWalls 1.0 | 8 | 4% | 17 |
| squidM.TentalceMeleeNano 1.1 | 6 | 3% | 10 |
| sample.MyFirstRobot 1.0 | 5 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 81.5 | 140 / 350 | 2.67 | 15.8% | 40492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB480 0.3 | 1.0 | 15.8% | 140 |
| germ.TheMind .2 | 2.8 | 11.7% | 53 |
| EBBU.Sim2 1.02 | 3.7 | 10.6% | 30 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.1 | 10.5% | 25 |
| agrach.Dalek 1.0 | 5.3 | 9.8% | 30 |
| stelo.UntouchableNano 1.3 | 6.4 | 8.9% | 19 |
| mb.Beast 0.1 | 7.1 | 8.6% | 23 |
| lmk.ACPFinal 0.1 | 7.6 | 8.4% | 6 |
| skm.Ryubot 1.0 | 8.1 | 7.9% | 23 |
| mn.nano.perceptual.Impact 1.3.0 | 8.9 | 7.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 79.7 | 15 / 35 | 3990 |
| 2 | 1 | 62.8 | 81.6 | 11 / 35 | 4193 |
| 3 | 1 | 65.0 | 87.0 | 16 / 35 | 4339 |
| 4 | 1 | 62.6 | 84.4 | 11 / 35 | 3845 |
| 5 | 1 | 61.3 | 75.9 | 12 / 35 | 3871 |
| 6 | 1 | 63.7 | 83.2 | 17 / 35 | 4090 |
| 7 | 1 | 60.1 | 75.2 | 14 / 35 | 3361 |
| 8 | 1 | 63.7 | 82.5 | 15 / 35 | 4169 |
| 9 | 1 | 65.0 | 86.3 | 15 / 35 | 4602 |
| 10 | 1 | 62.1 | 78.7 | 14 / 35 | 4032 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 50 | 60% |
| EBBU.Sim2 1.02 | 41 | 46% |
| agrach.Dalek 1.0 | 28 | 75% |
| mb.Beast 0.1 | 27 | 63% |
| stelo.UntouchableNano 1.3 | 27 | 63% |
| com.syncleus.robocode.Dreadnaught 0.1 | 26 | 58% |
| skm.Ryubot 1.0 | 22 | 55% |
| lmk.ACPFinal 0.1 | 10 | 80% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 211 of 350 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| EBBU.Sim2 1.02 | 38 | 18% | 49 |
| com.syncleus.robocode.Dreadnaught 0.1 | 34 | 16% | 52 |
| germ.TheMind .2 | 32 | 15% | 58 |
| lmk.ACPFinal 0.1 | 22 | 10% | 28 |
| agrach.Dalek 1.0 | 21 | 10% | 48 |
| mb.Beast 0.1 | 21 | 10% | 44 |
| stelo.UntouchableNano 1.3 | 17 | 8% | 29 |
| skm.Ryubot 1.0 | 15 | 7% | 28 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 5% | 13 |

## Melee bench: F38

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 68.9 | 68 / 350 | 3.80 | 12.6% | 26382 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.0% | 147 |
| bvh.mini.Freya 0.55 | 2.3 | 13.2% | 34 |
| hadur117.nano.SanaroB480 0.3 | 3.1 | 12.6% | 68 |
| cs.Wren 1.0 | 4.3 | 11.7% | 30 |
| bts.mega.Gnarly 1.4 | 5.2 | 10.8% | 34 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.3 | 10.6% | 26 |
| kdf.KoulDestroyer 1.0 | 6.8 | 9.1% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.5% | 6 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.6% | 1 |
| bzdp.BoxCar 2.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.1 | 67.3 | 6 / 35 | 2622 |
| 2 | 4 | 55.0 | 61.0 | 3 / 35 | 2572 |
| 3 | 2 | 57.5 | 67.6 | 5 / 35 | 2628 |
| 4 | 2 | 57.7 | 67.9 | 7 / 35 | 2382 |
| 5 | 3 | 58.9 | 70.8 | 7 / 35 | 2668 |
| 6 | 2 | 62.0 | 78.1 | 10 / 35 | 2787 |
| 7 | 3 | 60.0 | 71.4 | 9 / 35 | 3006 |
| 8 | 4 | 58.1 | 67.0 | 6 / 35 | 2714 |
| 9 | 3 | 60.4 | 73.3 | 10 / 35 | 2719 |
| 10 | 5 | 56.1 | 64.4 | 5 / 35 | 2284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 69 | 59% |
| cs.Wren 1.0 | 19 | 42% |
| bts.mega.Gnarly 1.4 | 17 | 18% |
| bvh.mini.Freya 0.55 | 12 | 67% |
| kdf.KoulDestroyer 1.0 | 9 | 78% |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 0% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 0% |

Hadur died in 283 of 350 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 70 | 25% | 112 |
| cs.Wren 1.0 | 47 | 17% | 53 |
| bvh.mini.Freya 0.55 | 46 | 16% | 49 |
| bts.mega.Gnarly 1.4 | 39 | 14% | 45 |
| davidalves.net.DuelistNanoMelee 1.01 | 38 | 13% | 44 |
| kdf.KoulDestroyer 1.0 | 30 | 11% | 34 |
| kawigi.spare.SpareParts 0.7.6nosnd | 9 | 3% | 9 |
| bzdp.BoxCar 2.0 | 2 | 1% | 2 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |

## Melee bench: F39

hadur117.nano.SanaroB480 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 72.6 | 60 / 350 | 3.19 | 14.2% | 26748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.3 | 18.0% | 86 |
| az.Ololobot 0.2.4 | 1.9 | 16.2% | 150 |
| hadur117.nano.SanaroB480 0.3 | 2.8 | 14.2% | 60 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 11.1% | 40 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.7% | 7 |
| apollokidd.ApolloKidd 0.9 | 6.0 | 9.3% | 4 |
| gimp.GimpBot 0.1 | 6.4 | 8.8% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.1 | 7.0% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.8 | 76.8 | 7 / 35 | 2652 |
| 2 | 3 | 58.0 | 68.6 | 8 / 35 | 2694 |
| 3 | 2 | 59.1 | 71.8 | 7 / 35 | 3030 |
| 4 | 3 | 59.0 | 74.6 | 3 / 35 | 2762 |
| 5 | 3 | 59.3 | 76.1 | 7 / 35 | 2458 |
| 6 | 3 | 58.2 | 72.5 | 6 / 35 | 2540 |
| 7 | 3 | 55.2 | 65.0 | 4 / 35 | 2292 |
| 8 | 3 | 57.9 | 71.8 | 4 / 35 | 2652 |
| 9 | 3 | 59.7 | 76.1 | 7 / 35 | 2804 |
| 10 | 3 | 58.8 | 73.2 | 7 / 35 | 2864 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 83 | 10% |
| bvh.fry.Freya 0.82 | 57 | 42% |
| stelo.SoRobotNanoMelee 1.2 | 21 | 57% |
| winamp32.micro.MicroMacro 1.0 | 11 | 55% |
| gimp.GimpBot 0.1 | 7 | 86% |
| apollokidd.ApolloKidd 0.9 | 5 | 60% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 292 of 350 rounds, at a mean tick of 1425. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 102 | 35% | 124 |
| az.Ololobot 0.2.4 | 91 | 31% | 96 |
| stelo.SoRobotNanoMelee 1.2 | 43 | 15% | 47 |
| apollokidd.ApolloKidd 0.9 | 30 | 10% | 35 |
| gimp.GimpBot 0.1 | 12 | 4% | 21 |
| winamp32.micro.MicroMacro 1.0 | 7 | 2% | 17 |
| whitesquare.robots.SkynetAdvanced 1.1 | 4 | 1% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 1% | 3 |

## Melee bench: F41

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 78.3 | 131 / 350 | 2.96 | 14.7% | 27056 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.7% | 139 |
| hadur117.nano.SanaroB480 0.3 | 2.5 | 14.7% | 131 |
| ary.Swarm 1.1 | 3.0 | 13.5% | 22 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.8% | 33 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.3% | 19 |
| shrub.Silver v048 | 6.2 | 8.4% | 3 |
| zyx.nano.Ant 1.1 | 6.9 | 7.7% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 6.2% | 2 |
| stelo.Mirror 1.1 | 8.7 | 5.8% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 71.1 | 11 / 35 | 2581 |
| 2 | 3 | 62.5 | 74.9 | 17 / 35 | 2852 |
| 3 | 3 | 61.8 | 76.8 | 8 / 35 | 2936 |
| 4 | 2 | 64.5 | 82.5 | 19 / 35 | 2607 |
| 5 | 4 | 60.4 | 72.4 | 7 / 35 | 2595 |
| 6 | 2 | 63.1 | 79.4 | 12 / 35 | 2652 |
| 7 | 2 | 63.8 | 81.3 | 16 / 35 | 2776 |
| 8 | 2 | 62.9 | 79.0 | 13 / 35 | 2965 |
| 9 | 2 | 63.5 | 83.2 | 14 / 35 | 2313 |
| 10 | 2 | 63.5 | 81.9 | 14 / 35 | 2779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 104 | 51% |
| lessonz.robocode.Oz 0.5.0 | 43 | 67% |
| ary.Swarm 1.1 | 28 | 86% |
| simonton.nano.MeleeSeed 1.8 | 18 | 78% |
| jsal.Jsalbot 1.0 | 5 | 60% |
| stelo.Mirror 1.1 | 4 | 100% |
| shrub.Silver v048 | 4 | 50% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 219 of 350 rounds, at a mean tick of 1191. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 81 | 37% | 135 |
| ary.Swarm 1.1 | 44 | 20% | 76 |
| simonton.nano.MeleeSeed 1.8 | 36 | 16% | 52 |
| lessonz.robocode.Oz 0.5.0 | 34 | 16% | 48 |
| shrub.Silver v048 | 11 | 5% | 17 |
| zyx.nano.Ant 1.1 | 8 | 4% | 9 |
| jsal.Jsalbot 1.0 | 3 | 1% | 7 |
| stelo.Mirror 1.1 | 1 | 0% | 4 |
| acogdev.alpha 0.2 | 1 | 0% | 1 |

## Melee bench: F42

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 76.4 | 98 / 350 | 3.12 | 14.3% | 31473 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.8% | 159 |
| maribo.mini.MiniQuester 0.1 | 2.8 | 14.3% | 38 |
| hadur117.nano.SanaroB480 0.3 | 3.1 | 14.3% | 98 |
| ara.Shera 0.88 | 3.1 | 14.0% | 48 |
| amz.NanoClone 1.41 | 5.0 | 9.2% | 2 |
| maribo.IotaCT 1.1 | 6.4 | 7.7% | 0 |
| dsw.StaticD 1.0 | 6.9 | 7.0% | 6 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.5% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.4 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 80.6 | 14 / 35 | 3382 |
| 2 | 2 | 63.5 | 81.3 | 10 / 35 | 3325 |
| 3 | 4 | 59.0 | 67.3 | 11 / 35 | 2763 |
| 4 | 3 | 63.0 | 78.4 | 10 / 35 | 3270 |
| 5 | 4 | 60.4 | 72.1 | 8 / 35 | 3003 |
| 6 | 4 | 61.1 | 76.8 | 6 / 35 | 2822 |
| 7 | 2 | 62.2 | 75.6 | 13 / 35 | 3408 |
| 8 | 2 | 63.6 | 83.5 | 11 / 35 | 2961 |
| 9 | 4 | 61.3 | 73.0 | 7 / 35 | 3530 |
| 10 | 4 | 61.1 | 75.6 | 8 / 35 | 3009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 103 | 46% |
| ara.Shera 0.88 | 32 | 66% |
| maribo.mini.MiniQuester 0.1 | 28 | 79% |
| dsw.StaticD 1.0 | 6 | 83% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| amz.NanoClone 1.41 | 1 | 0% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 253 of 350 rounds, at a mean tick of 1032. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 105 | 42% | 150 |
| ara.Shera 0.88 | 59 | 23% | 82 |
| maribo.mini.MiniQuester 0.1 | 46 | 18% | 67 |
| amz.NanoClone 1.41 | 18 | 7% | 18 |
| maribo.IotaCT 1.1 | 11 | 4% | 12 |
| dsw.StaticD 1.0 | 5 | 2% | 12 |
| mme.NikeEnhanced 2.0 | 4 | 2% | 4 |
| stelo.MirrorMicro 1.0 | 2 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 63.3 | 39 / 350 | 4.30 | 11.4% | 23225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.3% | 253 |
| brainfade.melee.Dusk 0.44 | 2.1 | 13.7% | 34 |
| dummy.micro.Sparrow 2.5 | 3.4 | 12.1% | 12 |
| hadur117.nano.SanaroB480 0.3 | 4.0 | 11.4% | 39 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.9% | 6 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 10.2% | 3 |
| mz.NanoGod 2.02 | 7.3 | 7.8% | 3 |
| jab.DiamondStealer 5 | 7.7 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.6% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.7 | 61.9 | 1 / 35 | 2533 |
| 2 | 3 | 58.2 | 65.1 | 3 / 35 | 2461 |
| 3 | 4 | 56.3 | 59.7 | 4 / 35 | 2079 |
| 4 | 4 | 56.9 | 60.0 | 4 / 35 | 2135 |
| 5 | 3 | 60.5 | 71.7 | 6 / 35 | 2275 |
| 6 | 4 | 57.0 | 60.6 | 3 / 35 | 2496 |
| 7 | 3 | 59.2 | 67.3 | 4 / 35 | 2618 |
| 8 | 5 | 56.5 | 60.3 | 4 / 35 | 2202 |
| 9 | 5 | 58.1 | 64.8 | 5 / 35 | 2292 |
| 10 | 4 | 57.2 | 61.9 | 5 / 35 | 2134 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 66 | 20% |
| brainfade.melee.Dusk 0.44 | 25 | 76% |
| dummy.micro.Sparrow 2.5 | 10 | 50% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 67% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 312 of 350 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 125 | 40% | 138 |
| brainfade.melee.Dusk 0.44 | 52 | 17% | 69 |
| dummy.micro.Sparrow 2.5 | 49 | 16% | 55 |
| wcsv.melee.EngineerMelee 0.1 | 31 | 10% | 34 |
| Krabb.akim2.Akim2 1.1b | 21 | 7% | 21 |
| mz.NanoGod 2.02 | 18 | 6% | 18 |
| jab.DiamondStealer 5 | 14 | 4% | 14 |
| cvt.Firsty 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 70.9 | 81 / 350 | 3.62 | 13.6% | 31472 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.2 | 16.8% | 138 |
| tzu.TheArtOfWar 1.2 | 1.8 | 15.6% | 84 |
| hadur117.nano.SanaroB480 0.3 | 3.0 | 13.6% | 81 |
| wompi.Quokka 1.6 | 4.2 | 10.8% | 12 |
| jwirde.Gort 2.0 | 4.8 | 10.7% | 27 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.0 | 9.1% | 4 |
| disan.Chair 2.2.0 | 7.4 | 7.2% | 3 |
| stf.PanzerGeneral 0.1 | 7.6 | 6.9% | 1 |
| sample.Crazy 1.0 | 9.4 | 4.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.6 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 70.2 | 6 / 35 | 3367 |
| 2 | 3 | 61.1 | 72.4 | 9 / 35 | 3157 |
| 3 | 3 | 54.7 | 57.5 | 4 / 35 | 2841 |
| 4 | 3 | 59.5 | 70.2 | 8 / 35 | 2830 |
| 5 | 3 | 61.7 | 72.4 | 8 / 35 | 3498 |
| 6 | 3 | 61.9 | 75.9 | 12 / 35 | 2848 |
| 7 | 3 | 59.8 | 68.6 | 8 / 35 | 3195 |
| 8 | 3 | 61.1 | 74.6 | 8 / 35 | 3085 |
| 9 | 3 | 61.2 | 71.7 | 9 / 35 | 3368 |
| 10 | 3 | 61.8 | 75.2 | 9 / 35 | 3283 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 77 | 55% |
| tzu.TheArtOfWar 1.2 | 52 | 33% |
| wompi.Quokka 1.6 | 14 | 86% |
| jwirde.Gort 2.0 | 10 | 40% |
| disan.Chair 2.2.0 | 2 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 269 of 350 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 93 | 35% | 111 |
| stelo.Liblix 0.3.1 | 89 | 33% | 134 |
| wompi.Quokka 1.6 | 24 | 9% | 32 |
| jwirde.Gort 2.0 | 21 | 8% | 27 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 16 | 6% | 18 |
| disan.Chair 2.2.0 | 11 | 4% | 12 |
| stf.PanzerGeneral 0.1 | 9 | 3% | 9 |
| amk.jointstrike.JointStrike 0.2 | 4 | 1% | 4 |
| sample.Crazy 1.0 | 2 | 1% | 2 |

## Melee bench: F45

hadur117.nano.SanaroB480 0.3 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 76.0 | 84 / 350 | 3.16 | 15.0% | 34805 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroB480 0.3 | 1.2 | 15.0% | 84 |
| jje.BagPuss 1.2 | 2.6 | 13.0% | 33 |
| eem.IWillFireNoBullet v2.8 | 3.0 | 12.7% | 163 |
| sul.Lunar 1.1 | 4.1 | 11.2% | 37 |
| myl.nano.Graviton 1.10 | 4.1 | 11.0% | 12 |
| hvilela.HVilela 0.9 | 6.4 | 8.7% | 3 |
| fm.claire 1.7 | 7.2 | 8.4% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.6 | 8.3% | 3 |
| wit.Deep7 2.0 | 8.9 | 6.7% | 12 |
| abud.ThirdRobo 1.0 | 9.9 | 5.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 82.2 | 12 / 35 | 3578 |
| 2 | 1 | 62.2 | 77.8 | 7 / 35 | 3411 |
| 3 | 1 | 61.9 | 75.2 | 11 / 35 | 3183 |
| 4 | 2 | 61.1 | 74.6 | 6 / 35 | 3370 |
| 5 | 1 | 59.4 | 70.5 | 7 / 35 | 3184 |
| 6 | 1 | 63.3 | 77.5 | 9 / 35 | 3920 |
| 7 | 2 | 60.4 | 69.8 | 7 / 35 | 3385 |
| 8 | 1 | 64.2 | 82.2 | 11 / 35 | 3534 |
| 9 | 1 | 61.1 | 72.4 | 7 / 35 | 3578 |
| 10 | 1 | 63.1 | 78.1 | 7 / 35 | 3662 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 124 | 40% |
| jje.BagPuss 1.2 | 24 | 29% |
| sul.Lunar 1.1 | 23 | 22% |
| wit.Deep7 2.0 | 15 | 60% |
| myl.nano.Graviton 1.10 | 14 | 50% |
| pez.mini.ChironexFleckeri 0.5 | 5 | 80% |
| hvilela.HVilela 0.9 | 4 | 75% |

Hadur died in 266 of 350 rounds, at a mean tick of 1527. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 81 | 30% | 0 |
| jje.BagPuss 1.2 | 49 | 18% | 103 |
| sul.Lunar 1.1 | 39 | 15% | 81 |
| myl.nano.Graviton 1.10 | 35 | 13% | 61 |
| hvilela.HVilela 0.9 | 21 | 8% | 26 |
| pez.mini.ChironexFleckeri 0.5 | 14 | 5% | 28 |
| fm.claire 1.7 | 14 | 5% | 16 |
| wit.Deep7 2.0 | 10 | 4% | 23 |
| abud.ThirdRobo 1.0 | 3 | 1% | 8 |

## Melee bench: F46

hadur117.nano.SanaroB480 0.3 against 8 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 80.4 | 107 / 350 | 2.57 | 16.0% | 26840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 21.7% | 202 |
| hadur117.nano.SanaroB480 0.3 | 2.0 | 16.0% | 107 |
| mz.MicroSheep 1.0 | 3.5 | 12.5% | 11 |
| cx.Princess 1.0 | 3.9 | 11.8% | 26 |
| sadoner.killer 0.2 | 4.9 | 10.3% | 1 |
| arthord.NanoSatanMelee Beta | 6.1 | 9.1% | 2 |
| jeremyreeder.collective.Prophet 5 | 6.6 | 7.8% | 0 |
| kurios.DOSexe .9a | 8.4 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 8.6 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 88.2 | 16 / 35 | 2731 |
| 2 | 2 | 61.4 | 78.6 | 11 / 35 | 2636 |
| 3 | 2 | 63.1 | 80.7 | 8 / 35 | 2981 |
| 4 | 2 | 59.7 | 77.9 | 4 / 35 | 2502 |
| 5 | 2 | 64.2 | 83.2 | 15 / 35 | 2642 |
| 6 | 2 | 62.9 | 82.9 | 12 / 35 | 2693 |
| 7 | 2 | 61.7 | 79.3 | 10 / 35 | 2596 |
| 8 | 2 | 62.3 | 82.1 | 10 / 35 | 2586 |
| 9 | 2 | 61.3 | 76.1 | 12 / 35 | 2609 |
| 10 | 2 | 60.5 | 75.4 | 9 / 35 | 2864 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 170 | 42% |
| cx.Princess 1.0 | 27 | 67% |
| mz.MicroSheep 1.0 | 12 | 67% |
| arthord.NanoSatanMelee Beta | 6 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 0% |
| sadoner.killer 0.2 | 1 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |
| kurios.DOSexe .9a | 1 | 100% |

Hadur died in 244 of 350 rounds, at a mean tick of 1105. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 154 | 63% | 232 |
| mz.MicroSheep 1.0 | 29 | 12% | 38 |
| cx.Princess 1.0 | 20 | 8% | 33 |
| sadoner.killer 0.2 | 17 | 7% | 17 |
| arthord.NanoSatanMelee Beta | 11 | 5% | 15 |
| jeremyreeder.collective.Prophet 5 | 9 | 4% | 10 |
| mbro.Detektor3 0.1.1 | 2 | 1% | 3 |
| kurios.DOSexe .9a | 1 | 0% | 2 |
1 death(s) with no robot to name.

