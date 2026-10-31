# Bench suite: suite.txt

## Melee bench: F01

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 76.3 | 56 / 350 | 3.13 | 14.1% | 35803 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.6% | 226 |
| hadur117.nano.SanaroHS 0.2 | 2.0 | 14.1% | 56 |
| sgp.JollyNinja 3.53 | 3.2 | 12.2% | 30 |
| mz.MicroGodMelee 1 | 4.5 | 11.1% | 18 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.8 | 11.1% | 13 |
| lorneswork.Predator 1.0 | 5.5 | 10.0% | 8 |
| adt.Ar2 1.0 | 7.1 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 7.9 | 5.8% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 72.4 | 4 / 35 | 3859 |
| 2 | 2 | 62.7 | 79.7 | 4 / 35 | 3570 |
| 3 | 2 | 61.1 | 73.7 | 5 / 35 | 3542 |
| 4 | 2 | 60.7 | 72.4 | 7 / 35 | 3385 |
| 5 | 2 | 60.7 | 70.5 | 6 / 35 | 3526 |
| 6 | 2 | 61.3 | 74.0 | 3 / 35 | 3357 |
| 7 | 2 | 63.5 | 79.4 | 10 / 35 | 3801 |
| 8 | 2 | 63.4 | 81.3 | 3 / 35 | 3761 |
| 9 | 2 | 63.8 | 82.2 | 8 / 35 | 3551 |
| 10 | 2 | 62.6 | 77.5 | 6 / 35 | 3451 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 147 | 14% |
| mz.MicroGodMelee 1 | 19 | 68% |
| sgp.JollyNinja 3.53 | 18 | 56% |
| lorneswork.Predator 1.0 | 10 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 50% |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 100% |

Hadur died in 294 of 350 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 169 | 57% | 192 |
| sgp.JollyNinja 3.53 | 42 | 14% | 50 |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 9% | 29 |
| lorneswork.Predator 1.0 | 22 | 7% | 29 |
| mz.MicroGodMelee 1 | 21 | 7% | 31 |
| adt.Ar2 1.0 | 10 | 3% | 13 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 1% | 4 |
| skm.butterfly 1.0 | 2 | 1% | 2 |

## Melee bench: F02

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 70.3 | 73 / 350 | 3.67 | 14.1% | 38305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.7 | 15.1% | 103 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.1 | 14.6% | 81 |
| hadur117.nano.SanaroHS 0.2 | 2.2 | 14.1% | 73 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.3% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.3% | 23 |
| sch.Simone 0.3d | 6.8 | 8.3% | 20 |
| Noran.BitchingElk 0.054 | 7.0 | 7.9% | 28 |
| fnc.bandit.Bandit 5.2.0 | 7.6 | 7.5% | 5 |
| stelo.PatternRobot 1.0 | 8.6 | 6.4% | 10 |
| fullsail.SweetTea 1.1 | 10.0 | 4.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 66.0 | 2 / 35 | 3354 |
| 2 | 3 | 59.8 | 65.7 | 7 / 35 | 3719 |
| 3 | 2 | 60.3 | 67.9 | 9 / 35 | 3820 |
| 4 | 1 | 63.7 | 78.4 | 8 / 35 | 4217 |
| 5 | 1 | 63.5 | 77.1 | 13 / 35 | 3962 |
| 6 | 3 | 59.3 | 66.7 | 5 / 35 | 3690 |
| 7 | 1 | 64.1 | 78.4 | 12 / 35 | 4238 |
| 8 | 3 | 57.1 | 58.7 | 6 / 35 | 3703 |
| 9 | 3 | 62.0 | 72.7 | 6 / 35 | 3874 |
| 10 | 2 | 60.9 | 71.1 | 5 / 35 | 3728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 58 | 43% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 47 | 34% |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 60% |
| sch.Simone 0.3d | 12 | 17% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 83% |
| Noran.BitchingElk 0.054 | 11 | 55% |
| stelo.PatternRobot 1.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 2 | 0% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |

Hadur died in 278 of 350 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 76 | 27% | 96 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 67 | 24% | 90 |
| lrem.micro.SpikeSoldier 0.4 | 40 | 14% | 45 |
| com.cohesiva.robocode.ManOwaR 1.0 | 23 | 8% | 34 |
| sch.Simone 0.3d | 23 | 8% | 27 |
| stelo.PatternRobot 1.0 | 22 | 8% | 26 |
| fnc.bandit.Bandit 5.2.0 | 11 | 4% | 14 |
| Noran.BitchingElk 0.054 | 10 | 4% | 13 |
| fullsail.SweetTea 1.1 | 5 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 79.4 | 93 / 350 | 2.86 | 14.9% | 38134 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 2.0 | 14.9% | 82 |
| hadur117.nano.SanaroHS 0.2 | 2.0 | 14.9% | 93 |
| radnor.DoctorBob 1.42 | 2.4 | 14.8% | 87 |
| vuen.Cake 2.51 | 3.7 | 13.1% | 68 |
| urdos.URDOS 1.3 | 4.9 | 10.8% | 14 |
| adt.Ar1 2.1 | 6.2 | 7.7% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.4 | 7.0% | 3 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.8% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 5.8% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.3 | 79.4 | 6 / 35 | 3799 |
| 2 | 4 | 60.3 | 74.3 | 7 / 35 | 3253 |
| 3 | 3 | 61.6 | 75.2 | 7 / 35 | 4110 |
| 4 | 2 | 63.0 | 81.3 | 10 / 35 | 3580 |
| 5 | 1 | 63.2 | 78.4 | 9 / 35 | 4167 |
| 6 | 2 | 64.2 | 83.2 | 10 / 35 | 4126 |
| 7 | 2 | 61.6 | 76.2 | 7 / 35 | 3563 |
| 8 | 1 | 63.9 | 81.0 | 15 / 35 | 3916 |
| 9 | 1 | 63.9 | 84.1 | 12 / 35 | 3717 |
| 10 | 1 | 63.1 | 80.6 | 10 / 35 | 3903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 71 | 48% |
| vuen.Cake 2.51 | 59 | 53% |
| kawigi.nano.Lib 1.0 | 49 | 14% |
| urdos.URDOS 1.3 | 21 | 67% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 67% |
| adt.Ar1 2.1 | 2 | 100% |

Hadur died in 260 of 350 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 83 | 32% | 95 |
| radnor.DoctorBob 1.42 | 66 | 25% | 88 |
| urdos.URDOS 1.3 | 43 | 17% | 57 |
| vuen.Cake 2.51 | 37 | 14% | 71 |
| adt.Ar1 2.1 | 13 | 5% | 16 |
| ghent.ArthurPanzergon 1.0.0 | 7 | 3% | 7 |
| oa.weak.FlyMk1 0.1 | 4 | 2% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 2% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 72.9 | 13 / 350 | 3.44 | 13.8% | 41230 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.2% | 318 |
| hadur117.nano.SanaroHS 0.2 | 2.4 | 13.8% | 13 |
| apc.LeeroyJenkins2 1.0 | 2.6 | 13.8% | 12 |
| TNT.TNT 0.99.1 | 4.0 | 11.0% | 6 |
| josago.Jorgito 0.16 | 5.1 | 9.2% | 1 |
| css.Delitioner 0.11 | 6.1 | 7.8% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.9% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.1 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 68.9 | 1 / 35 | 3841 |
| 2 | 2 | 63.3 | 74.9 | 0 / 35 | 4336 |
| 3 | 2 | 65.1 | 81.9 | 4 / 35 | 4248 |
| 4 | 2 | 63.4 | 75.6 | 3 / 35 | 4103 |
| 5 | 2 | 63.1 | 74.3 | 2 / 35 | 4380 |
| 6 | 2 | 62.6 | 74.9 | 2 / 35 | 4131 |
| 7 | 2 | 63.4 | 75.6 | 0 / 35 | 4374 |
| 8 | 3 | 60.0 | 65.4 | 0 / 35 | 4082 |
| 9 | 3 | 62.4 | 74.3 | 1 / 35 | 4049 |
| 10 | 3 | 58.6 | 62.9 | 0 / 35 | 3686 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 152 | 2% |
| apc.LeeroyJenkins2 1.0 | 7 | 86% |
| josago.Jorgito 0.16 | 3 | 100% |
| TNT.TNT 0.99.1 | 2 | 50% |

Hadur died in 337 of 350 rounds, at a mean tick of 1110. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 222 | 66% | 225 |
| apc.LeeroyJenkins2 1.0 | 49 | 15% | 55 |
| josago.Jorgito 0.16 | 30 | 9% | 32 |
| TNT.TNT 0.99.1 | 12 | 4% | 13 |
| tj.zombie1n 1.0.1 | 11 | 3% | 11 |
| css.Delitioner 0.11 | 10 | 3% | 10 |
| rampancy.Durandal 2.1d | 3 | 1% | 3 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |

## Melee bench: F06

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 72.9 | 106 / 350 | 3.44 | 14.1% | 32772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.2 | 15.6% | 83 |
| hadur117.nano.SanaroHS 0.2 | 2.6 | 14.1% | 106 |
| origin.SleepSiphon 1.7b | 2.7 | 14.2% | 84 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.6 | 12.4% | 42 |
| mld.Wisdom 1.0 | 5.0 | 10.6% | 10 |
| gg.Wolverine 2.0 | 6.1 | 8.9% | 8 |
| spinnercat.Omen 1.0 | 7.0 | 8.0% | 8 |
| DBall.NUKE 0.1 | 8.0 | 7.1% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 8.8 | 6.1% | 5 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.3 | 67.9 | 8 / 35 | 3502 |
| 2 | 3 | 60.9 | 72.7 | 9 / 35 | 3308 |
| 3 | 2 | 63.4 | 78.1 | 12 / 35 | 3486 |
| 4 | 2 | 62.0 | 73.7 | 15 / 35 | 3186 |
| 5 | 1 | 63.4 | 81.6 | 13 / 35 | 3147 |
| 6 | 3 | 60.7 | 70.5 | 12 / 35 | 3212 |
| 7 | 3 | 61.3 | 71.4 | 12 / 35 | 3150 |
| 8 | 4 | 60.0 | 69.8 | 7 / 35 | 3216 |
| 9 | 2 | 61.2 | 73.0 | 10 / 35 | 3241 |
| 10 | 3 | 60.3 | 69.8 | 8 / 35 | 3324 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 58 | 66% |
| origin.SleepSiphon 1.7b | 48 | 60% |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 69% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 83% |
| DBall.NUKE 0.1 | 5 | 100% |
| mld.Wisdom 1.0 | 4 | 100% |
| gg.Wolverine 2.0 | 4 | 75% |
| spinnercat.Omen 1.0 | 3 | 67% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 246 of 350 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 75 | 30% | 97 |
| origin.SleepSiphon 1.7b | 67 | 27% | 104 |
| pe.minimelee.SandboxMiniMelee 1.1 | 43 | 17% | 62 |
| mld.Wisdom 1.0 | 31 | 13% | 38 |
| spinnercat.Omen 1.0 | 12 | 5% | 13 |
| gg.Wolverine 2.0 | 8 | 3% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 3% | 15 |
| DBall.NUKE 0.1 | 2 | 1% | 8 |
| sample.Fire 1.0 | 1 | 0% | 2 |

## Melee bench: F07

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.9 | 116 / 350 | 2.36 | 16.9% | 45847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 1.8 | 17.5% | 90 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.3% | 77 |
| hadur117.nano.SanaroHS 0.2 | 2.2 | 16.9% | 116 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 12.0% | 27 |
| franzor.Lizt 1.3.1 | 4.8 | 11.2% | 41 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.7% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.9% | 1 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.5 | 80.6 | 12 / 35 | 4584 |
| 2 | 3 | 68.5 | 87.9 | 12 / 35 | 4559 |
| 3 | 1 | 67.4 | 85.1 | 9 / 35 | 4802 |
| 4 | 1 | 69.1 | 89.8 | 15 / 35 | 4589 |
| 5 | 3 | 66.1 | 80.6 | 9 / 35 | 4504 |
| 6 | 2 | 68.3 | 87.0 | 14 / 35 | 4537 |
| 7 | 3 | 64.9 | 76.5 | 9 / 35 | 3977 |
| 8 | 3 | 67.4 | 86.3 | 10 / 35 | 4585 |
| 9 | 2 | 67.9 | 87.0 | 12 / 35 | 4825 |
| 10 | 1 | 68.7 | 88.3 | 14 / 35 | 4885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 116 | 59% |
| rsalesc.melee.Monk 0.3.6c | 57 | 28% |
| oog.melee.CapuletDroid 1.1 | 37 | 65% |
| franzor.Lizt 1.3.1 | 25 | 28% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 234 of 350 rounds, at a mean tick of 1509. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 100 | 43% | 184 |
| rsalesc.melee.Monk 0.3.6c | 78 | 33% | 98 |
| oog.melee.CapuletDroid 1.1 | 27 | 12% | 54 |
| franzor.Lizt 1.3.1 | 25 | 11% | 4 |
| lrem.micro.MoggFanatic 0.2 | 2 | 1% | 4 |
| skm.PateranBotlock2 1.0 | 1 | 0% | 2 |
| drd.Dreadknoght 0.9 | 1 | 0% | 1 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 2 |

## Melee bench: F08

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 10 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 73.2 | 110 / 350 | 3.41 | 14.2% | 31260 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| tm.Yuugao 1.0 | 1.7 | 14.2% | 91 |
| hadur117.nano.SanaroHS 0.2 | 2.0 | 14.2% | 110 |
| shrub.Vapour v159 | 2.3 | 13.4% | 69 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 10.5% | 23 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 10.2% | 28 |
| m3thos.Eva00 1.1 | 6.0 | 9.1% | 10 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.5% | 16 |
| qualidafial.MajorDick 1.0.1 | 8.5 | 7.1% | 2 |
| SHAM.WOW 1.4 | 9.0 | 6.8% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 70.8 | 7 / 35 | 3170 |
| 2 | 2 | 61.8 | 76.2 | 11 / 35 | 3245 |
| 3 | 1 | 62.8 | 81.6 | 13 / 35 | 3030 |
| 4 | 1 | 62.6 | 80.3 | 14 / 35 | 3023 |
| 5 | 2 | 60.2 | 71.7 | 9 / 35 | 3169 |
| 6 | 2 | 59.6 | 68.9 | 8 / 35 | 3398 |
| 7 | 2 | 59.1 | 67.9 | 12 / 35 | 3029 |
| 8 | 3 | 59.8 | 71.1 | 10 / 35 | 2985 |
| 9 | 3 | 58.7 | 67.6 | 11 / 35 | 2833 |
| 10 | 1 | 62.2 | 76.2 | 15 / 35 | 3378 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 56 | 68% |
| shrub.Vapour v159 | 35 | 46% |
| Krabb.sliNk.Garm 0.9u | 22 | 86% |
| jwst.DAD.DarkAndDarker 1.1 | 19 | 84% |
| com.spp.robocode.MostlyHarmless 010 | 17 | 59% |
| m3thos.Eva00 1.1 | 8 | 63% |
| qualidafial.MajorDick 1.0.1 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 241 of 350 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 69 | 29% | 84 |
| tm.Yuugao 1.0 | 66 | 27% | 108 |
| Krabb.sliNk.Garm 0.9u | 26 | 11% | 40 |
| com.spp.robocode.MostlyHarmless 010 | 24 | 10% | 35 |
| m3thos.Eva00 1.1 | 15 | 6% | 20 |
| zyx.nano.BacillusComma 1.0 | 14 | 6% | 15 |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 5% | 29 |
| SHAM.WOW 1.4 | 8 | 3% | 9 |
| qualidafial.MajorDick 1.0.1 | 7 | 3% | 9 |

## Melee bench: F09

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.5 | 61.8 | 43 / 350 | 4.44 | 11.7% | 26965 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.1 | 17.7% | 177 |
| kc.micro.Figment 1.0 | 1.9 | 15.2% | 73 |
| hadur117.nano.SanaroHS 0.2 | 3.8 | 11.7% | 43 |
| yagami.Tidus 0.11 | 3.9 | 11.2% | 2 |
| pedersen.Grishnakh 1.0 | 4.5 | 11.0% | 29 |
| mc2.enemy.Original 0.9 | 5.8 | 9.5% | 22 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 4 |
| step.nanoPri 1.0 | 8.4 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 5.3% | 0 |
| rdm.Dueler 0.4x | 9.4 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.1 | 59.0 | 4 / 35 | 2476 |
| 2 | 4 | 55.3 | 58.7 | 2 / 35 | 2671 |
| 3 | 3 | 58.2 | 65.1 | 3 / 35 | 3190 |
| 4 | 4 | 55.5 | 58.7 | 5 / 35 | 2529 |
| 5 | 4 | 56.3 | 60.0 | 4 / 35 | 2760 |
| 6 | 4 | 56.7 | 62.9 | 3 / 35 | 2673 |
| 7 | 5 | 54.6 | 56.8 | 5 / 35 | 2585 |
| 8 | 3 | 56.4 | 61.9 | 5 / 35 | 2706 |
| 9 | 3 | 59.3 | 69.5 | 7 / 35 | 2864 |
| 10 | 3 | 57.2 | 65.1 | 5 / 35 | 2511 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 54 | 15% |
| kc.micro.Figment 1.0 | 27 | 41% |
| mc2.enemy.Original 0.9 | 15 | 87% |
| pedersen.Grishnakh 1.0 | 8 | 38% |
| yagami.Tidus 0.11 | 6 | 100% |
| dft.Calliope 5.6 | 3 | 33% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 307 of 350 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 93 | 30% | 102 |
| kc.micro.Figment 1.0 | 82 | 27% | 94 |
| yagami.Tidus 0.11 | 36 | 12% | 43 |
| pedersen.Grishnakh 1.0 | 35 | 11% | 36 |
| mc2.enemy.Original 0.9 | 21 | 7% | 34 |
| dft.Calliope 5.6 | 13 | 4% | 14 |
| robar.nano.Assertive_Melee 0.2 | 11 | 4% | 11 |
| step.nanoPri 1.0 | 10 | 3% | 10 |
| rdm.Dueler 0.4x | 6 | 2% | 6 |

## Melee bench: F10

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 78.2 | 111 / 350 | 2.96 | 15.2% | 39364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| DTF.Kludgy 1.2b | 1.6 | 15.4% | 91 |
| hadur117.nano.SanaroHS 0.2 | 1.8 | 15.2% | 111 |
| ne.Chimera 1.2 | 3.4 | 13.2% | 40 |
| ejb.Polaris 1.0.1 | 3.4 | 13.1% | 46 |
| tvv.micro.Antares 1.1.1 | 5.1 | 10.9% | 36 |
| vStar.RAFzilla 2.15 | 5.7 | 10.2% | 18 |
| sam.Samspin 1.0 | 7.5 | 6.7% | 3 |
| kurios.DOSexe .9b | 8.4 | 5.5% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 9.6 | 4.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 82.5 | 14 / 35 | 3741 |
| 2 | 2 | 61.2 | 72.7 | 7 / 35 | 3962 |
| 3 | 2 | 63.3 | 80.3 | 11 / 35 | 3737 |
| 4 | 2 | 62.5 | 76.8 | 9 / 35 | 3856 |
| 5 | 1 | 64.7 | 80.3 | 13 / 35 | 4290 |
| 6 | 1 | 64.2 | 78.7 | 16 / 35 | 4163 |
| 7 | 1 | 62.3 | 77.1 | 10 / 35 | 3844 |
| 8 | 4 | 61.9 | 74.3 | 8 / 35 | 3627 |
| 9 | 2 | 63.3 | 79.4 | 10 / 35 | 3744 |
| 10 | 1 | 64.7 | 79.7 | 13 / 35 | 4400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 60 | 43% |
| ejb.Polaris 1.0.1 | 49 | 84% |
| ne.Chimera 1.2 | 37 | 57% |
| tvv.micro.Antares 1.1.1 | 21 | 29% |
| vStar.RAFzilla 2.15 | 17 | 71% |
| donjezza.Muncho 1.0 | 4 | 50% |
| sam.Samspin 1.0 | 4 | 50% |
| kurios.DOSexe .9b | 2 | 50% |

Hadur died in 239 of 350 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 81 | 34% | 104 |
| ne.Chimera 1.2 | 62 | 26% | 81 |
| tvv.micro.Antares 1.1.1 | 30 | 13% | 32 |
| ejb.Polaris 1.0.1 | 28 | 12% | 70 |
| vStar.RAFzilla 2.15 | 16 | 7% | 29 |
| sam.Samspin 1.0 | 11 | 5% | 14 |
| kurios.DOSexe .9b | 6 | 3% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 1% | 3 |
| donjezza.Muncho 1.0 | 2 | 1% | 5 |

## Melee bench: F11

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 67.5 | 68 / 350 | 3.93 | 13.0% | 30802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.1% | 135 |
| cx.mini.Nimrod 0.55 | 2.5 | 13.4% | 51 |
| hadur117.nano.SanaroHS 0.2 | 2.6 | 13.0% | 68 |
| djc.DynaBot 0.1.1 | 3.9 | 11.1% | 29 |
| rdt199.Warlord 0.73 | 5.9 | 9.2% | 22 |
| br2.MobyDickBot 1.6 | 6.3 | 8.9% | 18 |
| uji.YellohFellah 1.0 | 6.3 | 8.7% | 27 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.8% | 1 |
| stelo.MirrorNano 1.3 | 9.4 | 5.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.6 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 66.3 | 7 / 35 | 3153 |
| 2 | 2 | 59.4 | 69.2 | 7 / 35 | 3218 |
| 3 | 2 | 59.2 | 70.2 | 5 / 35 | 3050 |
| 4 | 3 | 58.7 | 68.3 | 7 / 35 | 2983 |
| 5 | 3 | 56.9 | 62.5 | 7 / 35 | 3122 |
| 6 | 3 | 58.8 | 67.9 | 8 / 35 | 2870 |
| 7 | 2 | 59.2 | 68.9 | 6 / 35 | 3189 |
| 8 | 3 | 58.7 | 66.7 | 7 / 35 | 3075 |
| 9 | 2 | 59.2 | 69.2 | 6 / 35 | 3008 |
| 10 | 3 | 58.7 | 65.4 | 8 / 35 | 3134 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 69 | 41% |
| cx.mini.Nimrod 0.55 | 27 | 59% |
| djc.DynaBot 0.1.1 | 15 | 73% |
| uji.YellohFellah 1.0 | 11 | 27% |
| rdt199.Warlord 0.73 | 9 | 56% |
| br2.MobyDickBot 1.6 | 8 | 38% |

Hadur died in 282 of 350 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 104 | 37% | 123 |
| cx.mini.Nimrod 0.55 | 61 | 22% | 76 |
| rdt199.Warlord 0.73 | 29 | 10% | 34 |
| djc.DynaBot 0.1.1 | 24 | 9% | 36 |
| uji.YellohFellah 1.0 | 20 | 7% | 27 |
| br2.MobyDickBot 1.6 | 17 | 6% | 26 |
| KiraNL.Chupacabra 0.4 | 10 | 4% | 10 |
| stelo.MirrorNano 1.3 | 9 | 3% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 3% | 8 |

## Melee bench: F12

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 67.0 | 76 / 350 | 3.97 | 12.8% | 26637 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| nat.PallasHawk 1.0 | 1.8 | 14.5% | 94 |
| bts.wiki.RipCurl 0.9b | 2.1 | 14.4% | 76 |
| darkcanuck.Leon 1.01 | 2.6 | 13.6% | 68 |
| hadur117.nano.SanaroHS 0.2 | 3.5 | 12.8% | 76 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.7% | 22 |
| jrm.Test0 1.0 | 6.4 | 8.3% | 0 |
| jp.Perpy 16.0 | 7.2 | 7.3% | 1 |
| cs.sheldor.Talon 1.1 | 8.0 | 7.1% | 1 |
| jaybot.bots.Oddball 4.0 | 8.8 | 6.2% | 12 |
| stuff.Vlad 0.1 | 9.6 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.6 | 66.7 | 7 / 35 | 2874 |
| 2 | 4 | 56.6 | 64.8 | 5 / 35 | 2381 |
| 3 | 2 | 61.1 | 75.2 | 11 / 35 | 2709 |
| 4 | 4 | 58.8 | 67.6 | 8 / 35 | 2681 |
| 5 | 4 | 56.5 | 62.5 | 4 / 35 | 2778 |
| 6 | 2 | 59.8 | 70.2 | 12 / 35 | 2747 |
| 7 | 3 | 58.1 | 68.9 | 6 / 35 | 2517 |
| 8 | 4 | 57.7 | 64.8 | 8 / 35 | 2638 |
| 9 | 4 | 57.7 | 64.4 | 9 / 35 | 2630 |
| 10 | 4 | 57.5 | 65.1 | 6 / 35 | 2682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 51 | 37% |
| bts.wiki.RipCurl 0.9b | 43 | 67% |
| darkcanuck.Leon 1.01 | 39 | 44% |
| jaybot.bots.Oddball 4.0 | 8 | 13% |
| brainfade.melee.Genghis 0.36 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jrm.Test0 1.0 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 274 of 350 rounds, at a mean tick of 745. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 76 | 28% | 100 |
| bts.wiki.RipCurl 0.9b | 54 | 20% | 76 |
| darkcanuck.Leon 1.01 | 50 | 18% | 70 |
| brainfade.melee.Genghis 0.36 | 23 | 8% | 26 |
| jrm.Test0 1.0 | 21 | 8% | 23 |
| cs.sheldor.Talon 1.1 | 18 | 7% | 21 |
| jaybot.bots.Oddball 4.0 | 16 | 6% | 17 |
| jp.Perpy 16.0 | 10 | 4% | 11 |
| stuff.Vlad 0.1 | 6 | 2% | 6 |

## Melee bench: F13

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 72.5 | 57 / 350 | 3.47 | 13.1% | 29733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.2 | 17.5% | 154 |
| ags.Glacier 0.2.11 | 1.8 | 16.7% | 83 |
| hadur117.nano.SanaroHS 0.2 | 3.1 | 13.1% | 57 |
| gh.micro.Gruweltje 0.7 | 4.2 | 12.2% | 26 |
| shinh.Entangled 0.3 | 4.7 | 12.0% | 28 |
| apc.Colossus2 0.17 | 6.1 | 8.2% | 0 |
| stelo.Wang 1.0 | 7.0 | 7.3% | 3 |
| ayk.WallHugger 1.0 | 8.1 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.5% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 72.1 | 8 / 35 | 2679 |
| 2 | 4 | 59.1 | 69.5 | 5 / 35 | 2836 |
| 3 | 3 | 60.3 | 74.3 | 6 / 35 | 2817 |
| 4 | 3 | 62.1 | 78.1 | 5 / 35 | 3163 |
| 5 | 3 | 59.8 | 68.9 | 6 / 35 | 3137 |
| 6 | 3 | 60.4 | 70.5 | 5 / 35 | 3368 |
| 7 | 3 | 59.0 | 70.2 | 5 / 35 | 2648 |
| 8 | 3 | 61.4 | 76.5 | 4 / 35 | 2969 |
| 9 | 3 | 60.3 | 71.4 | 6 / 35 | 3136 |
| 10 | 3 | 60.9 | 73.7 | 7 / 35 | 2980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 82 | 39% |
| ags.Glacier 0.2.11 | 44 | 18% |
| shinh.Entangled 0.3 | 17 | 47% |
| gh.micro.Gruweltje 0.7 | 12 | 42% |
| stelo.Wang 1.0 | 2 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 294 of 350 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 96 | 33% | 106 |
| mn.Combat 3.25.0 | 84 | 29% | 112 |
| gh.micro.Gruweltje 0.7 | 39 | 13% | 48 |
| shinh.Entangled 0.3 | 31 | 11% | 38 |
| stelo.Wang 1.0 | 25 | 9% | 27 |
| maribo.FollowFire 1 | 8 | 3% | 8 |
| apc.Colossus2 0.17 | 5 | 2% | 5 |
| ayk.WallHugger 1.0 | 5 | 2% | 5 |
| sample.Tracker 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 76.3 | 103 / 350 | 3.13 | 14.5% | 33136 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.8% | 132 |
| hadur117.nano.SanaroHS 0.2 | 2.0 | 14.5% | 103 |
| catcat20.shape.Theta 0.018 | 3.2 | 12.1% | 60 |
| Lo_Ian.Gandalf_V4 4.0 | 5.0 | 10.1% | 14 |
| co.edu.usb.rc.LidisTron 1.0 | 5.4 | 10.0% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 10.1% | 4 |
| sanyi.mikrobi.Roberto 1.0 | 6.0 | 9.7% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.9 | 7.7% | 11 |
| pa.Improved 1.0 | 9.0 | 5.7% | 3 |
| sample.TrackFire 1.0 | 10.0 | 2.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 74.3 | 9 / 35 | 3088 |
| 2 | 2 | 61.7 | 76.8 | 8 / 35 | 3308 |
| 3 | 2 | 62.9 | 80.0 | 14 / 35 | 2986 |
| 4 | 2 | 62.4 | 74.0 | 9 / 35 | 3754 |
| 5 | 2 | 63.0 | 76.2 | 14 / 35 | 3318 |
| 6 | 2 | 62.6 | 77.1 | 9 / 35 | 3608 |
| 7 | 2 | 62.8 | 76.2 | 11 / 35 | 3458 |
| 8 | 2 | 62.4 | 75.9 | 10 / 35 | 3484 |
| 9 | 2 | 59.5 | 71.1 | 9 / 35 | 3098 |
| 10 | 2 | 63.2 | 81.6 | 10 / 35 | 3034 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 104 | 56% |
| catcat20.shape.Theta 0.018 | 35 | 49% |
| co.edu.usb.rc.LidisTron 1.0 | 15 | 60% |
| sanyi.mikrobi.Roberto 1.0 | 14 | 43% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 64% |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 60% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 247 of 350 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 110 | 45% | 161 |
| catcat20.shape.Theta 0.018 | 42 | 17% | 56 |
| Lo_Ian.Gandalf_V4 4.0 | 20 | 8% | 24 |
| sanyi.mikrobi.Roberto 1.0 | 19 | 8% | 30 |
| dmh.robocode.robot.RedDwarf 0.4 | 18 | 7% | 25 |
| co.edu.usb.rc.LidisTron 1.0 | 16 | 6% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 6% | 24 |
| pa.Improved 1.0 | 4 | 2% | 7 |
| sample.TrackFire 1.0 | 3 | 1% | 3 |

## Melee bench: F15

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 66.7 | 61 / 350 | 4.00 | 13.2% | 35613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.5 | 14.8% | 73 |
| emp.Yngwie 1.11 | 2.0 | 14.5% | 127 |
| hadur117.nano.SanaroHS 0.2 | 3.3 | 13.2% | 61 |
| mld.DustBunny 3.8 | 3.7 | 12.2% | 28 |
| cb.nano.Insomnia 1.0 | 4.9 | 11.3% | 22 |
| kawigi.robot.Girl 1.2 | 5.6 | 10.1% | 33 |
| Grystrion.TrackerWO 1.0 | 7.1 | 7.3% | 2 |
| lambdaxy.TBot 0.1 | 8.2 | 6.4% | 2 |
| divineomega.TrialBot 0.003 | 8.7 | 6.0% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 71.1 | 8 / 35 | 3554 |
| 2 | 3 | 59.4 | 67.3 | 6 / 35 | 3639 |
| 3 | 2 | 61.7 | 75.6 | 5 / 35 | 3701 |
| 4 | 3 | 59.5 | 67.0 | 6 / 35 | 3696 |
| 5 | 2 | 63.4 | 75.2 | 7 / 35 | 4202 |
| 6 | 4 | 55.3 | 56.2 | 5 / 35 | 3261 |
| 7 | 5 | 55.6 | 58.1 | 6 / 35 | 3042 |
| 8 | 4 | 60.1 | 68.9 | 5 / 35 | 3619 |
| 9 | 3 | 61.2 | 70.2 | 8 / 35 | 3696 |
| 10 | 5 | 55.6 | 57.5 | 5 / 35 | 3203 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 45 | 47% |
| kawigi.micro.Shiz 1.1 | 34 | 44% |
| cb.nano.Insomnia 1.0 | 25 | 44% |
| kawigi.robot.Girl 1.2 | 13 | 62% |
| mld.DustBunny 3.8 | 10 | 20% |
| divineomega.TrialBot 0.003 | 4 | 100% |

Hadur died in 289 of 350 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 77 | 27% | 102 |
| kawigi.micro.Shiz 1.1 | 59 | 20% | 78 |
| cb.nano.Insomnia 1.0 | 57 | 20% | 47 |
| mld.DustBunny 3.8 | 43 | 15% | 51 |
| kawigi.robot.Girl 1.2 | 20 | 7% | 26 |
| lambdaxy.TBot 0.1 | 12 | 4% | 12 |
| divineomega.TrialBot 0.003 | 10 | 3% | 23 |
| Grystrion.TrackerWO 1.0 | 10 | 3% | 10 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 0% | 1 |

## Melee bench: F16

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 69.7 | 63 / 350 | 3.72 | 13.8% | 36655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.7% | 166 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.2 | 14.5% | 17 |
| hadur117.nano.SanaroHS 0.2 | 2.8 | 13.8% | 63 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.4% | 65 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.5% | 21 |
| bvh.fnr.Fenrir 0.36l | 5.6 | 9.5% | 7 |
| stelo.IntrinsicVolatility 1.4 | 6.9 | 7.5% | 4 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.2% | 5 |
| repositorio.NanoStep 1.0 | 9.1 | 4.9% | 1 |
| asd.Cthulhu 1.3 | 9.2 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 65.1 | 7 / 35 | 3754 |
| 2 | 3 | 61.6 | 71.1 | 7 / 35 | 3675 |
| 3 | 3 | 62.0 | 70.8 | 8 / 35 | 3908 |
| 4 | 3 | 62.3 | 71.4 | 8 / 35 | 3928 |
| 5 | 3 | 57.7 | 63.5 | 2 / 35 | 3220 |
| 6 | 3 | 61.3 | 69.2 | 7 / 35 | 3726 |
| 7 | 2 | 60.9 | 71.1 | 3 / 35 | 3702 |
| 8 | 3 | 60.1 | 68.6 | 7 / 35 | 3464 |
| 9 | 3 | 60.8 | 70.5 | 8 / 35 | 3237 |
| 10 | 2 | 63.2 | 76.2 | 6 / 35 | 4041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 85 | 29% |
| techdude.forest.FlamingForest 1.1 | 25 | 36% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 95% |
| bvh.fnr.Fenrir 0.36l | 8 | 88% |
| tvv.nano.Polaris 1.2 | 7 | 29% |
| divineomega.DivineBot 1.9.4.5 | 2 | 50% |
| stelo.IntrinsicVolatility 1.4 | 2 | 50% |

Hadur died in 289 of 350 rounds, at a mean tick of 1239. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 123 | 43% | 151 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 50 | 17% | 62 |
| techdude.forest.FlamingForest 1.1 | 34 | 12% | 45 |
| bvh.fnr.Fenrir 0.36l | 32 | 11% | 36 |
| tvv.nano.Polaris 1.2 | 21 | 7% | 22 |
| stelo.IntrinsicVolatility 1.4 | 10 | 3% | 13 |
| divineomega.DivineBot 1.9.4.5 | 9 | 3% | 11 |
| asd.Cthulhu 1.3 | 8 | 3% | 8 |
| repositorio.NanoStep 1.0 | 2 | 1% | 2 |

## Melee bench: F17

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 70.4 | 70 / 350 | 3.66 | 13.8% | 36256 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 2.1 | 14.4% | 83 |
| hadur117.nano.SanaroHS 0.2 | 2.2 | 13.8% | 70 |
| oog.melee.Mercutio 1.0 | 2.4 | 13.8% | 65 |
| cx.BlestPain 1.41 | 3.7 | 12.8% | 69 |
| nic.Nicator 2.4 | 5.2 | 11.5% | 29 |
| ahf.NanoAndrew .4 | 5.6 | 10.9% | 30 |
| maribo.melee.BMV 0.1 | 6.8 | 8.8% | 3 |
| tex.Longbot 0.4 | 8.3 | 5.6% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.4% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 68.9 | 8 / 35 | 3097 |
| 2 | 1 | 62.8 | 76.2 | 8 / 35 | 3991 |
| 3 | 3 | 60.6 | 67.9 | 6 / 35 | 3830 |
| 4 | 3 | 60.9 | 69.2 | 8 / 35 | 3674 |
| 5 | 3 | 60.0 | 67.6 | 6 / 35 | 3678 |
| 6 | 1 | 60.7 | 71.1 | 4 / 35 | 3751 |
| 7 | 1 | 62.1 | 71.7 | 8 / 35 | 3957 |
| 8 | 1 | 61.1 | 71.4 | 10 / 35 | 3439 |
| 9 | 3 | 59.7 | 67.3 | 7 / 35 | 3202 |
| 10 | 3 | 61.3 | 72.7 | 5 / 35 | 3637 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 53 | 28% |
| oog.melee.Mercutio 1.0 | 28 | 64% |
| cx.BlestPain 1.41 | 26 | 85% |
| nic.Nicator 2.4 | 23 | 35% |
| ahf.NanoAndrew .4 | 16 | 44% |
| maribo.melee.BMV 0.1 | 1 | 0% |

Hadur died in 281 of 350 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 78 | 28% | 96 |
| ahf.NanoAndrew .4 | 49 | 17% | 56 |
| nic.Nicator 2.4 | 43 | 15% | 50 |
| oog.melee.Mercutio 1.0 | 41 | 15% | 56 |
| cx.BlestPain 1.41 | 39 | 14% | 61 |
| maribo.melee.BMV 0.1 | 20 | 7% | 21 |
| tex.Longbot 0.4 | 9 | 3% | 9 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 71.0 | 117 / 350 | 3.61 | 14.1% | 32138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHS 0.2 | 1.3 | 14.1% | 117 |
| morbid.MorbidPriest 1.0 | 2.5 | 13.0% | 54 |
| agd.Mooserwirt2 2.7 | 2.9 | 12.5% | 60 |
| uji.DBH 1.1 | 3.3 | 12.0% | 38 |
| spinnercat.Robovirus 2.718 | 5.5 | 10.5% | 13 |
| ratosh.Nobo 0.21 | 5.5 | 10.7% | 20 |
| sigterm.Sigterm 1.0 | 7.1 | 8.4% | 26 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.2% | 5 |
| stelo.WangRobot 1.0 | 9.3 | 5.9% | 16 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.6 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.8 | 69.2 | 10 / 35 | 3229 |
| 2 | 1 | 58.2 | 65.4 | 12 / 35 | 3043 |
| 3 | 1 | 61.9 | 74.3 | 16 / 35 | 3146 |
| 4 | 1 | 64.5 | 80.0 | 17 / 35 | 3458 |
| 5 | 1 | 60.0 | 69.5 | 11 / 35 | 3319 |
| 6 | 1 | 59.4 | 70.2 | 8 / 35 | 3072 |
| 7 | 1 | 63.6 | 81.6 | 14 / 35 | 3488 |
| 8 | 2 | 59.2 | 70.8 | 8 / 35 | 2934 |
| 9 | 1 | 58.6 | 64.1 | 10 / 35 | 3483 |
| 10 | 2 | 57.7 | 64.4 | 11 / 35 | 2966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 47 | 66% |
| agd.Mooserwirt2 2.7 | 25 | 76% |
| uji.DBH 1.1 | 25 | 68% |
| sigterm.Sigterm 1.0 | 19 | 68% |
| spinnercat.Robovirus 2.718 | 19 | 89% |
| ratosh.Nobo 0.21 | 16 | 50% |
| stelo.WangRobot 1.0 | 14 | 50% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 233 of 350 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 60 | 26% | 95 |
| ratosh.Nobo 0.21 | 35 | 15% | 46 |
| uji.DBH 1.1 | 31 | 13% | 37 |
| agd.Mooserwirt2 2.7 | 30 | 13% | 51 |
| spinnercat.Robovirus 2.718 | 28 | 12% | 43 |
| sigterm.Sigterm 1.0 | 16 | 7% | 28 |
| stelo.WangRobot 1.0 | 14 | 6% | 22 |
| kawigi.mini.Fhqwhgads 1.1 | 12 | 5% | 18 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 7 | 3% | 10 |

## Melee bench: F19

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 83.6 | 133 / 350 | 2.48 | 16.5% | 39044 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHS 0.2 | 1.8 | 16.5% | 133 |
| mld.Infinity 2.2 | 2.0 | 16.0% | 111 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 15.9% | 77 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.0% | 10 |
| erdnis.Rover 0.3 | 4.7 | 10.4% | 5 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.7% | 5 |
| mbh.Mbh 0.1 | 7.2 | 7.6% | 1 |
| pac.ABC 2.1 | 7.6 | 7.2% | 8 |
| pbg.R2D2 1.0 | 8.9 | 5.8% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.7 | 82.5 | 13 / 35 | 3690 |
| 2 | 2 | 65.8 | 82.2 | 11 / 35 | 4050 |
| 3 | 1 | 66.5 | 85.4 | 16 / 35 | 3812 |
| 4 | 1 | 67.0 | 86.7 | 15 / 35 | 3728 |
| 5 | 2 | 66.3 | 82.5 | 15 / 35 | 3799 |
| 6 | 1 | 67.1 | 86.3 | 16 / 35 | 4103 |
| 7 | 1 | 67.2 | 85.7 | 14 / 35 | 4259 |
| 8 | 3 | 64.4 | 77.1 | 11 / 35 | 3752 |
| 9 | 3 | 64.8 | 81.0 | 8 / 35 | 3846 |
| 10 | 1 | 66.7 | 86.0 | 14 / 35 | 4005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 117 | 48% |
| davidalves.net.DuelistMiniMelee 1.2 | 89 | 54% |
| krillr.mini.JointStrike 2.0.0 | 14 | 79% |
| erdnis.Rover 0.3 | 10 | 90% |
| patson.PatsonTestBot 1.0 | 8 | 63% |
| pac.ABC 2.1 | 5 | 40% |
| pbg.R2D2 1.0 | 1 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 218 of 350 rounds, at a mean tick of 1175. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 86 | 39% | 185 |
| mld.Infinity 2.2 | 77 | 35% | 34 |
| krillr.mini.JointStrike 2.0.0 | 19 | 9% | 37 |
| patson.PatsonTestBot 1.0 | 15 | 7% | 27 |
| erdnis.Rover 0.3 | 11 | 5% | 29 |
| pac.ABC 2.1 | 6 | 3% | 15 |
| mbh.Mbh 0.1 | 2 | 1% | 12 |
| pbg.R2D2 1.0 | 2 | 1% | 9 |

## Melee bench: F20

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 69.8 | 77 / 350 | 3.71 | 13.5% | 32573 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 1.0 | 17.1% | 136 |
| hadur117.nano.SanaroHS 0.2 | 2.0 | 13.5% | 77 |
| fwb.Nine 1.0.1 | 3.6 | 11.8% | 46 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 11.1% | 18 |
| catcat20.Rabbit 0.001 | 4.3 | 10.7% | 46 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 8.7% | 8 |
| m3thos.mini.Eva01 0.5.5 | 7.0 | 8.7% | 3 |
| bayen.nut.Squirrel 1.615 | 7.1 | 8.8% | 13 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.4% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.1 | 67.9 | 11 / 35 | 3380 |
| 2 | 2 | 60.0 | 69.8 | 9 / 35 | 3358 |
| 3 | 2 | 61.2 | 71.1 | 8 / 35 | 3784 |
| 4 | 2 | 60.1 | 70.5 | 8 / 35 | 3196 |
| 5 | 2 | 60.1 | 72.4 | 5 / 35 | 3165 |
| 6 | 2 | 59.6 | 69.8 | 8 / 35 | 2992 |
| 7 | 2 | 61.3 | 73.7 | 10 / 35 | 3209 |
| 8 | 2 | 59.3 | 70.8 | 6 / 35 | 3069 |
| 9 | 2 | 57.4 | 64.1 | 5 / 35 | 3084 |
| 10 | 2 | 59.3 | 68.3 | 7 / 35 | 3336 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 70 | 51% |
| catcat20.Rabbit 0.001 | 31 | 35% |
| fwb.Nine 1.0.1 | 17 | 82% |
| nz.jdc.nano.GridFu 1.0 | 7 | 57% |
| bayen.nut.Squirrel 1.615 | 7 | 100% |
| djdjdj.NanoSkunk10 1.0 | 5 | 40% |
| m3thos.mini.Eva01 0.5.5 | 4 | 75% |

Hadur died in 273 of 350 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 98 | 36% | 123 |
| fwb.Nine 1.0.1 | 47 | 17% | 57 |
| nz.jdc.nano.GridFu 1.0 | 41 | 15% | 49 |
| catcat20.Rabbit 0.001 | 31 | 11% | 44 |
| bayen.nut.Squirrel 1.615 | 27 | 10% | 34 |
| djdjdj.NanoSkunk10 1.0 | 14 | 5% | 18 |
| m3thos.mini.Eva01 0.5.5 | 9 | 3% | 15 |
| ntc.ControlledChaos 1.1.4 | 5 | 2% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% | 1 |

## Melee bench: F21

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 84.1 | 146 / 350 | 2.43 | 17.1% | 43493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHS 0.2 | 1.4 | 17.1% | 146 |
| eem.EvBot v4.6.16 | 1.6 | 17.0% | 136 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.2% | 26 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 17 |
| oa.weak.BotherBot 0.1 | 5.4 | 8.7% | 3 |
| eld.Hmm 1.0 | 5.6 | 8.9% | 22 |
| el.JumpShoot 0.2 | 7.6 | 6.2% | 2 |
| fire219.CatBot 1.0 | 8.0 | 6.2% | 0 |
| PSW.Relentless 0.1 | 8.9 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.7 | 17 / 35 | 4681 |
| 2 | 1 | 67.1 | 86.3 | 19 / 35 | 4109 |
| 3 | 2 | 64.3 | 76.2 | 12 / 35 | 4275 |
| 4 | 1 | 66.3 | 84.1 | 15 / 35 | 4303 |
| 5 | 1 | 66.8 | 86.7 | 15 / 35 | 4234 |
| 6 | 1 | 67.8 | 90.5 | 19 / 35 | 4027 |
| 7 | 2 | 66.0 | 84.1 | 13 / 35 | 4273 |
| 8 | 2 | 66.0 | 86.3 | 12 / 35 | 4126 |
| 9 | 2 | 66.1 | 81.0 | 10 / 35 | 4839 |
| 10 | 1 | 65.8 | 79.4 | 14 / 35 | 4626 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 160 | 56% |
| dummy.mini.Scimitar 1.01 | 44 | 82% |
| cf.RiO.RiOx 4.2.1 | 17 | 65% |
| eld.Hmm 1.0 | 12 | 33% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 3 | 33% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 205 of 350 rounds, at a mean tick of 1329. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 102 | 50% | 170 |
| dummy.mini.Scimitar 1.01 | 39 | 19% | 86 |
| cf.RiO.RiOx 4.2.1 | 28 | 14% | 37 |
| eld.Hmm 1.0 | 15 | 7% | 25 |
| fire219.CatBot 1.0 | 6 | 3% | 6 |
| el.JumpShoot 0.2 | 5 | 2% | 6 |
| PSW.Relentless 0.1 | 5 | 2% | 5 |
| oa.weak.BotherBot 0.1 | 4 | 2% | 11 |
| arthord.MannyPacquiao Beta | 1 | 0% | 3 |

## Melee bench: F23

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 85.0 | 136 / 350 | 2.35 | 16.8% | 39346 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.3 | 18.4% | 128 |
| hadur117.nano.SanaroHS 0.2 | 2.0 | 16.8% | 136 |
| cre.Karolos 0.32 | 2.7 | 14.3% | 46 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.3% | 24 |
| stelo.RamTrackSurfer 1.2 | 5.9 | 9.2% | 10 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.9% | 4 |
| cw.megas.Blade 0.8 | 6.9 | 8.3% | 0 |
| sample.Walls 1.0 | 6.9 | 8.3% | 2 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 84.1 | 14 / 35 | 4210 |
| 2 | 2 | 67.8 | 87.0 | 15 / 35 | 4315 |
| 3 | 3 | 64.9 | 78.4 | 10 / 35 | 3615 |
| 4 | 2 | 68.3 | 90.2 | 18 / 35 | 3588 |
| 5 | 2 | 67.2 | 85.4 | 12 / 35 | 4106 |
| 6 | 2 | 67.1 | 84.8 | 13 / 35 | 4171 |
| 7 | 2 | 67.4 | 87.0 | 15 / 35 | 3919 |
| 8 | 2 | 65.9 | 82.2 | 11 / 35 | 3687 |
| 9 | 2 | 66.9 | 85.1 | 15 / 35 | 3672 |
| 10 | 2 | 67.3 | 85.7 | 13 / 35 | 4063 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 126 | 52% |
| cre.Karolos 0.32 | 56 | 63% |
| stelo.AreaTargetingBot 1.1 | 29 | 48% |
| sample.Walls 1.0 | 11 | 100% |
| stelo.RamTrackSurfer 1.2 | 10 | 60% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 60% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 214 of 350 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 115 | 54% | 191 |
| cre.Karolos 0.32 | 45 | 21% | 79 |
| stelo.AreaTargetingBot 1.1 | 28 | 13% | 36 |
| stelo.RamTrackSurfer 1.2 | 10 | 5% | 17 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 9 | 4% | 12 |
| sample.Walls 1.0 | 4 | 2% | 8 |
| cw.megas.Blade 0.8 | 3 | 1% | 6 |

## Melee bench: F24

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.1 | 58.0 | 48 / 350 | 4.78 | 10.9% | 24804 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.3 | 15.1% | 85 |
| florent.XSeries.X2 0.12 | 2.1 | 13.7% | 66 |
| pedersen.Ugluk 1.1.1 | 3.5 | 13.1% | 54 |
| davidalves.Phoenix 0.54 | 3.5 | 12.6% | 58 |
| hadur117.nano.SanaroHS 0.2 | 4.8 | 10.9% | 48 |
| oog.melee.Corsair 1.0 | 6.2 | 9.5% | 9 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.6% | 27 |
| lunchie.Lunchbox 0.93 | 7.9 | 6.8% | 1 |
| evd.X1 0.01 | 9.4 | 4.9% | 1 |
| as.FrankTheTank 1.3 | 9.6 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.5 | 59.0 | 5 / 35 | 2591 |
| 2 | 7 | 49.9 | 48.9 | 2 / 35 | 2388 |
| 3 | 4 | 55.4 | 60.6 | 6 / 35 | 2387 |
| 4 | 3 | 57.0 | 63.2 | 9 / 35 | 2781 |
| 5 | 5 | 54.1 | 58.1 | 2 / 35 | 2673 |
| 6 | 4 | 56.7 | 64.4 | 7 / 35 | 2428 |
| 7 | 5 | 53.2 | 54.3 | 3 / 35 | 2489 |
| 8 | 5 | 52.0 | 52.7 | 4 / 35 | 2287 |
| 9 | 5 | 57.4 | 65.4 | 7 / 35 | 2695 |
| 10 | 5 | 51.3 | 53.3 | 3 / 35 | 2085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 23 | 70% |
| davidalves.Phoenix 0.54 | 17 | 41% |
| pedersen.Ugluk 1.1.1 | 17 | 76% |
| rz.GlowBlowMelee 1.4 | 16 | 44% |
| stelo.SoJNanoMelee 1.1 | 5 | 20% |
| oog.melee.Corsair 1.0 | 4 | 100% |

Hadur died in 302 of 350 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 68 | 23% | 82 |
| pedersen.Ugluk 1.1.1 | 65 | 22% | 76 |
| rz.GlowBlowMelee 1.4 | 57 | 19% | 65 |
| davidalves.Phoenix 0.54 | 54 | 18% | 61 |
| stelo.SoJNanoMelee 1.1 | 20 | 7% | 21 |
| oog.melee.Corsair 1.0 | 15 | 5% | 21 |
| lunchie.Lunchbox 0.93 | 12 | 4% | 12 |
| as.FrankTheTank 1.3 | 7 | 2% | 8 |
| evd.X1 0.01 | 4 | 1% | 4 |

## Melee bench: F25

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 69.0 | 74 / 350 | 3.79 | 13.4% | 29138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 1.3 | 15.3% | 98 |
| voidious.micro.BlitzBat 1.05 | 2.1 | 14.0% | 77 |
| hadur117.nano.SanaroHS 0.2 | 2.8 | 13.4% | 74 |
| jdw.Hurricane 1.4 | 3.8 | 12.3% | 46 |
| gre.svman4.Morfeas 1.4.1 | 5.1 | 10.5% | 25 |
| gjr.Cephalosporin 0.1 | 6.6 | 8.4% | 17 |
| ds.Oo 2.2 | 7.0 | 8.1% | 12 |
| awesomeness.Elite 1.0 | 7.7 | 7.3% | 2 |
| adt.Ar2 1.1 | 8.6 | 6.6% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 71.7 | 8 / 35 | 2767 |
| 2 | 3 | 58.9 | 66.0 | 8 / 35 | 3024 |
| 3 | 3 | 58.7 | 67.9 | 7 / 35 | 2623 |
| 4 | 2 | 60.6 | 69.8 | 10 / 35 | 3108 |
| 5 | 2 | 61.0 | 72.7 | 7 / 35 | 3232 |
| 6 | 3 | 57.6 | 65.4 | 5 / 35 | 2681 |
| 7 | 4 | 56.9 | 64.4 | 1 / 35 | 2724 |
| 8 | 3 | 60.7 | 68.9 | 10 / 35 | 3272 |
| 9 | 3 | 60.7 | 73.0 | 9 / 35 | 2798 |
| 10 | 3 | 59.9 | 70.2 | 9 / 35 | 2909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 63 | 27% |
| voidious.micro.BlitzBat 1.05 | 43 | 26% |
| jdw.Hurricane 1.4 | 31 | 77% |
| gre.svman4.Morfeas 1.4.1 | 11 | 91% |
| ds.Oo 2.2 | 8 | 38% |
| gjr.Cephalosporin 0.1 | 6 | 67% |
| adt.Ar2 1.1 | 3 | 67% |
| awesomeness.Elite 1.0 | 2 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 276 of 350 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 81 | 29% | 100 |
| voidious.micro.BlitzBat 1.05 | 68 | 25% | 82 |
| jdw.Hurricane 1.4 | 39 | 14% | 57 |
| ds.Oo 2.2 | 22 | 8% | 27 |
| gjr.Cephalosporin 0.1 | 18 | 7% | 24 |
| adt.Ar2 1.1 | 14 | 5% | 15 |
| gre.svman4.Morfeas 1.4.1 | 12 | 4% | 21 |
| awesomeness.Elite 1.0 | 12 | 4% | 13 |
| amk.ChumbaMini 0.2 | 10 | 4% | 11 |

## Melee bench: F26

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 69.0 | 68 / 350 | 3.79 | 13.1% | 34301 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 16.4% | 119 |
| hadur117.nano.SanaroHS 0.2 | 2.9 | 13.1% | 68 |
| shu.nitro.LENIN .T34 | 3.0 | 13.1% | 67 |
| lrem.Spectre 0.4.4 | 3.4 | 12.5% | 45 |
| js.PinBall 1.6 | 5.0 | 11.4% | 18 |
| gh.mini.GrubbmOne 1.0 | 5.9 | 10.5% | 16 |
| jaybot.adv.bots.JayBot 2.0 | 6.8 | 9.1% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 8.1 | 6.8% | 8 |
| sample.SpinBot 1.0 | 8.9 | 5.4% | 3 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 67.6 | 8 / 35 | 3332 |
| 2 | 2 | 60.9 | 71.4 | 8 / 35 | 3505 |
| 3 | 4 | 57.5 | 65.1 | 5 / 35 | 2820 |
| 4 | 3 | 58.3 | 65.1 | 5 / 35 | 3321 |
| 5 | 3 | 58.7 | 65.1 | 6 / 35 | 3361 |
| 6 | 5 | 58.5 | 64.1 | 7 / 35 | 3303 |
| 7 | 3 | 60.0 | 69.2 | 6 / 35 | 3258 |
| 8 | 2 | 61.9 | 74.9 | 7 / 35 | 3821 |
| 9 | 2 | 61.5 | 73.3 | 9 / 35 | 3651 |
| 10 | 2 | 62.6 | 74.3 | 7 / 35 | 3929 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 63 | 33% |
| shu.nitro.LENIN .T34 | 30 | 37% |
| lrem.Spectre 0.4.4 | 28 | 64% |
| js.PinBall 1.6 | 11 | 73% |
| gh.mini.GrubbmOne 1.0 | 6 | 67% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 67% |
| sample.SpinBot 1.0 | 3 | 67% |
| jaybot.adv.bots.JayBot 2.0 | 2 | 100% |

Hadur died in 283 of 350 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 94 | 33% | 112 |
| shu.nitro.LENIN .T34 | 47 | 17% | 59 |
| lrem.Spectre 0.4.4 | 46 | 16% | 61 |
| gh.mini.GrubbmOne 1.0 | 35 | 12% | 41 |
| js.PinBall 1.6 | 22 | 8% | 32 |
| jaybot.adv.bots.JayBot 2.0 | 22 | 8% | 22 |
| fullsail.LaxativeTeaTwo 1.0 | 9 | 3% | 12 |
| sample.SpinBot 1.0 | 8 | 3% | 11 |

## Melee bench: F27

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 73.8 | 108 / 350 | 3.36 | 14.1% | 29614 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHS 0.2 | 1.8 | 14.1% | 108 |
| mk.Alpha 0.2.1 | 2.6 | 13.9% | 93 |
| sheldor.melee.nano.TestMelee 0.1 | 3.1 | 12.8% | 42 |
| wee.Gem 1.8.4 | 3.3 | 12.5% | 66 |
| EH.Eagle 1.0.6 | 4.4 | 11.0% | 19 |
| joe.ADinosaur 1.0 | 6.8 | 8.6% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 6.9 | 8.6% | 11 |
| throxbot.ThroxBot 0.1 | 7.6 | 7.9% | 7 |
| caimano.Furia_Ceca 0.22 | 8.6 | 6.4% | 0 |
| cs.Grudge 1.0 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 75.9 | 13 / 35 | 3121 |
| 2 | 1 | 61.5 | 75.2 | 13 / 35 | 2959 |
| 3 | 2 | 62.0 | 77.8 | 13 / 35 | 2678 |
| 4 | 1 | 61.0 | 75.2 | 12 / 35 | 2805 |
| 5 | 2 | 60.5 | 73.3 | 7 / 35 | 3086 |
| 6 | 2 | 59.7 | 70.5 | 8 / 35 | 2871 |
| 7 | 3 | 59.8 | 70.2 | 10 / 35 | 3001 |
| 8 | 1 | 62.5 | 77.1 | 12 / 35 | 3234 |
| 9 | 2 | 60.8 | 74.3 | 10 / 35 | 3072 |
| 10 | 3 | 58.7 | 68.3 | 10 / 35 | 2787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 59 | 68% |
| wee.Gem 1.8.4 | 45 | 64% |
| sheldor.melee.nano.TestMelee 0.1 | 34 | 47% |
| EH.Eagle 1.0.6 | 17 | 71% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 86% |
| joe.ADinosaur 1.0 | 3 | 33% |
| throxbot.ThroxBot 0.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 242 of 350 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 58 | 24% | 97 |
| sheldor.melee.nano.TestMelee 0.1 | 57 | 24% | 75 |
| wee.Gem 1.8.4 | 39 | 16% | 69 |
| EH.Eagle 1.0.6 | 24 | 10% | 38 |
| joe.ADinosaur 1.0 | 23 | 10% | 24 |
| throxbot.ThroxBot 0.1 | 16 | 7% | 18 |
| techdude.kombat.FlamingKombat 1.5 | 12 | 5% | 15 |
| caimano.Furia_Ceca 0.22 | 10 | 4% | 11 |
| cs.Grudge 1.0 | 3 | 1% | 3 |

## Melee bench: F28

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 80.3 | 134 / 350 | 2.77 | 15.7% | 33306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.test.NightFox .2 | 1.3 | 16.1% | 104 |
| hadur117.nano.SanaroHS 0.2 | 1.7 | 15.7% | 134 |
| uji.Antique 1.0 | 3.1 | 12.3% | 47 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 11.2% | 33 |
| pfvicm.Sobieski 7.2.3b | 4.6 | 10.8% | 16 |
| amk.ChumbaWumba 0.3 | 6.4 | 8.0% | 8 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.9% | 6 |
| matt.advanced.Katana 1.0 | 8.4 | 6.6% | 4 |
| stelo.PianistNano 1.2 | 9.1 | 5.7% | 1 |
| stelo.Lifestealer 1.0 | 9.3 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 79.4 | 15 / 35 | 3237 |
| 2 | 2 | 63.2 | 79.7 | 11 / 35 | 3360 |
| 3 | 2 | 60.9 | 72.4 | 10 / 35 | 3235 |
| 4 | 2 | 61.6 | 76.2 | 10 / 35 | 3042 |
| 5 | 2 | 62.8 | 76.2 | 15 / 35 | 3361 |
| 6 | 1 | 63.8 | 79.7 | 15 / 35 | 3313 |
| 7 | 2 | 63.2 | 79.7 | 10 / 35 | 3287 |
| 8 | 2 | 63.8 | 83.2 | 11 / 35 | 3108 |
| 9 | 1 | 66.6 | 87.0 | 17 / 35 | 3586 |
| 10 | 1 | 67.4 | 90.2 | 20 / 35 | 3777 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 137 | 58% |
| uji.Antique 1.0 | 31 | 58% |
| qohnil.blot.BlotBot 3.61 | 24 | 58% |
| pfvicm.Sobieski 7.2.3b | 13 | 46% |
| amk.ChumbaWumba 0.3 | 9 | 89% |
| ahr.ice.Ice 1.0.2 | 8 | 63% |
| matt.advanced.Katana 1.0 | 2 | 50% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 217 of 350 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 90 | 41% | 154 |
| pfvicm.Sobieski 7.2.3b | 34 | 16% | 39 |
| uji.Antique 1.0 | 32 | 15% | 56 |
| qohnil.blot.BlotBot 3.61 | 23 | 11% | 39 |
| amk.ChumbaWumba 0.3 | 15 | 7% | 22 |
| ahr.ice.Ice 1.0.2 | 11 | 5% | 17 |
| stelo.Lifestealer 1.0 | 6 | 3% | 8 |
| stelo.PianistNano 1.2 | 4 | 2% | 6 |
| matt.advanced.Katana 1.0 | 1 | 0% | 8 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 68.8 | 67 / 350 | 3.81 | 13.6% | 32292 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 1.2 | 16.0% | 113 |
| zyx.mega.YersiniaPestis 3.1 | 2.0 | 15.2% | 93 |
| hadur117.nano.SanaroHS 0.2 | 3.0 | 13.6% | 67 |
| myl.micro.Troodon 1.10 | 3.9 | 12.8% | 20 |
| jok.PheonixM 0.1.2 | 5.1 | 11.4% | 25 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.6% | 1 |
| DBall.Anarchy 0.1 | 6.7 | 8.0% | 24 |
| fullsail.TimbotNoPrediction 1.0 | 7.9 | 6.0% | 0 |
| ap.Frederick 1.1 | 9.4 | 4.2% | 4 |
| jangs.ns51 1.0 | 9.6 | 4.1% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 66.3 | 5 / 35 | 3395 |
| 2 | 3 | 61.3 | 69.2 | 5 / 35 | 3532 |
| 3 | 2 | 62.0 | 73.3 | 9 / 35 | 3150 |
| 4 | 3 | 60.5 | 67.0 | 4 / 35 | 3339 |
| 5 | 3 | 59.0 | 65.1 | 3 / 35 | 3346 |
| 6 | 3 | 61.8 | 74.0 | 6 / 35 | 3205 |
| 7 | 2 | 64.1 | 76.2 | 10 / 35 | 3484 |
| 8 | 4 | 61.0 | 70.2 | 10 / 35 | 3131 |
| 9 | 4 | 59.7 | 65.4 | 9 / 35 | 3006 |
| 10 | 3 | 57.1 | 61.3 | 6 / 35 | 2704 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 59 | 17% |
| zyx.mega.YersiniaPestis 3.1 | 44 | 57% |
| myl.micro.Troodon 1.10 | 21 | 90% |
| jok.PheonixM 0.1.2 | 11 | 82% |
| DBall.Anarchy 0.1 | 8 | 13% |
| jangs.ns51 1.0 | 3 | 67% |
| ph.melee.ArcherME 0.3 | 2 | 50% |

Hadur died in 284 of 350 rounds, at a mean tick of 1000. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 125 | 44% | 137 |
| zyx.mega.YersiniaPestis 3.1 | 67 | 24% | 93 |
| jok.PheonixM 0.1.2 | 27 | 10% | 35 |
| myl.micro.Troodon 1.10 | 25 | 9% | 39 |
| DBall.Anarchy 0.1 | 13 | 5% | 16 |
| ph.melee.ArcherME 0.3 | 12 | 4% | 15 |
| fullsail.TimbotNoPrediction 1.0 | 10 | 4% | 10 |
| jangs.ns51 1.0 | 4 | 1% | 5 |
| ap.Frederick 1.1 | 1 | 0% | 0 |

## Melee bench: F30

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.3 | 55.9 | 19 / 350 | 4.97 | 10.4% | 26159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.5 | 14.9% | 108 |
| oog.melee.Capulet 1.2 | 2.4 | 13.9% | 68 |
| darkcanuck.B26354 1.06 | 3.0 | 13.4% | 82 |
| stelo.PastFuture 2.3.2 | 3.1 | 13.0% | 38 |
| hadur117.nano.SanaroHS 0.2 | 5.1 | 10.4% | 19 |
| intruder.PrairieWolf 2.61 | 6.3 | 9.1% | 17 |
| tripphippy.Alice 1.1 | 7.7 | 7.6% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.7% | 11 |
| ntc.Opposite 1.5 | 8.1 | 7.6% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.6 | 60.0 | 7 / 35 | 2844 |
| 2 | 5 | 55.7 | 63.5 | 2 / 35 | 2491 |
| 3 | 5 | 52.5 | 53.7 | 2 / 35 | 2691 |
| 4 | 5 | 52.7 | 54.3 | 1 / 35 | 2521 |
| 5 | 5 | 51.7 | 52.1 | 0 / 35 | 2729 |
| 6 | 5 | 49.9 | 49.2 | 1 / 35 | 2428 |
| 7 | 5 | 52.8 | 53.7 | 1 / 35 | 2508 |
| 8 | 6 | 49.0 | 47.6 | 1 / 35 | 2315 |
| 9 | 5 | 56.0 | 60.6 | 2 / 35 | 2895 |
| 10 | 5 | 56.3 | 64.8 | 2 / 35 | 2737 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 18 | 11% |
| darkcanuck.B26354 1.06 | 18 | 17% |
| oog.melee.Capulet 1.2 | 16 | 25% |
| stelo.PastFuture 2.3.2 | 10 | 60% |
| intruder.PrairieWolf 2.61 | 3 | 67% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |
| tripphippy.Alice 1.1 | 1 | 0% |

Hadur died in 331 of 350 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 64 | 19% | 68 |
| catcat20.Matcha 0.006 | 61 | 18% | 65 |
| darkcanuck.B26354 1.06 | 60 | 18% | 63 |
| oog.melee.Capulet 1.2 | 54 | 16% | 58 |
| intruder.PrairieWolf 2.61 | 26 | 8% | 28 |
| fowl3628800.LightningBolt 2.6.0 | 26 | 8% | 27 |
| tripphippy.Alice 1.1 | 20 | 6% | 21 |
| ntc.Opposite 1.5 | 19 | 6% | 19 |
| GarmBox.Anger 1.0 | 1 | 0% | 1 |

## Melee bench: F31

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.3 | 60.2 | 45 / 350 | 4.59 | 11.3% | 24677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.4% | 172 |
| gh.mini.Griezel 0.2 | 2.3 | 13.5% | 66 |
| spinnercat.micro.Tyger 0.1 | 3.6 | 11.7% | 27 |
| d414.nano.Quantum 1.0.0 | 4.2 | 11.5% | 22 |
| hadur117.nano.SanaroHS 0.2 | 4.4 | 11.3% | 45 |
| gh.nano.Grofvuil 0.2 | 5.5 | 10.0% | 12 |
| timmit.nano.TimDog 0.33 | 7.6 | 6.7% | 6 |
| fm.mammillarias 1.3 | 7.7 | 6.7% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.1 | 5.2% | 1 |
| tlp.ThreeLeggedPig 1 | 9.6 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 52.3 | 55.2 | 3 / 35 | 2077 |
| 2 | 5 | 56.0 | 60.0 | 2 / 35 | 2716 |
| 3 | 6 | 50.6 | 51.1 | 2 / 35 | 2196 |
| 4 | 3 | 59.6 | 69.2 | 9 / 35 | 2666 |
| 5 | 5 | 56.4 | 60.6 | 5 / 35 | 2576 |
| 6 | 5 | 52.9 | 56.2 | 4 / 35 | 2165 |
| 7 | 5 | 52.2 | 54.0 | 3 / 35 | 2206 |
| 8 | 4 | 56.3 | 61.3 | 6 / 35 | 2657 |
| 9 | 2 | 59.5 | 70.2 | 5 / 35 | 2797 |
| 10 | 3 | 57.1 | 63.8 | 6 / 35 | 2621 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.mini.Griezel 0.2 | 44 | 59% |
| abc.Shadow 3.84i | 41 | 32% |
| spinnercat.micro.Tyger 0.1 | 9 | 0% |
| d414.nano.Quantum 1.0.0 | 9 | 33% |
| gh.nano.Grofvuil 0.2 | 4 | 50% |
| timmit.nano.TimDog 0.33 | 1 | 0% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 305 of 350 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 76 | 25% | 100 |
| abc.Shadow 3.84i | 71 | 23% | 87 |
| spinnercat.micro.Tyger 0.1 | 51 | 17% | 53 |
| d414.nano.Quantum 1.0.0 | 40 | 13% | 44 |
| gh.nano.Grofvuil 0.2 | 21 | 7% | 22 |
| timmit.nano.TimDog 0.33 | 17 | 6% | 16 |
| fm.mammillarias 1.3 | 15 | 5% | 14 |
| Gecko.ultimateGeckoBot 1.0 | 10 | 3% | 10 |
| tlp.ThreeLeggedPig 1 | 4 | 1% | 4 |

## Melee bench: F32

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 77.2 | 127 / 350 | 3.05 | 14.9% | 33223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.5 | 14.8% | 97 |
| hadur117.nano.SanaroHS 0.2 | 1.7 | 14.9% | 127 |
| apc.botM 3.0 | 3.2 | 12.4% | 46 |
| vjik.UnViolation 1.1 | 4.0 | 11.1% | 34 |
| lxx.ConceptA 0.8 | 4.7 | 11.0% | 13 |
| bayen.UbaMicro 1.4 | 6.1 | 9.2% | 11 |
| panzer.Panzer 0.2 | 7.3 | 7.5% | 1 |
| yk.JahMicro 1.0 | 8.1 | 7.0% | 10 |
| conscience.Electron 1.3g | 8.6 | 6.6% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.5% | 11 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 79.0 | 17 / 35 | 3302 |
| 2 | 2 | 63.1 | 79.4 | 13 / 35 | 3315 |
| 3 | 1 | 63.6 | 82.5 | 16 / 35 | 3317 |
| 4 | 1 | 63.8 | 81.6 | 16 / 35 | 3469 |
| 5 | 1 | 60.6 | 72.7 | 13 / 35 | 3267 |
| 6 | 2 | 61.5 | 77.8 | 10 / 35 | 3156 |
| 7 | 1 | 61.7 | 76.2 | 13 / 35 | 3250 |
| 8 | 2 | 60.2 | 73.3 | 9 / 35 | 3197 |
| 9 | 1 | 64.0 | 82.5 | 12 / 35 | 3782 |
| 10 | 4 | 58.9 | 67.0 | 8 / 35 | 3168 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 92 | 57% |
| apc.botM 3.0 | 41 | 71% |
| vjik.UnViolation 1.1 | 24 | 58% |
| lxx.ConceptA 0.8 | 17 | 82% |
| donjezza.Jezza 1.0 | 10 | 40% |
| bayen.UbaMicro 1.4 | 8 | 75% |
| yk.JahMicro 1.0 | 6 | 67% |
| panzer.Panzer 0.2 | 4 | 100% |

Hadur died in 223 of 350 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 71 | 32% | 124 |
| lxx.ConceptA 0.8 | 49 | 22% | 54 |
| apc.botM 3.0 | 29 | 13% | 61 |
| vjik.UnViolation 1.1 | 22 | 10% | 41 |
| bayen.UbaMicro 1.4 | 18 | 8% | 23 |
| panzer.Panzer 0.2 | 12 | 5% | 14 |
| yk.JahMicro 1.0 | 10 | 4% | 14 |
| donjezza.Jezza 1.0 | 6 | 3% | 11 |
| conscience.Electron 1.3g | 6 | 3% | 8 |

## Melee bench: F33

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 69.0 | 71 / 350 | 3.79 | 13.8% | 36024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.9% | 128 |
| hadur117.nano.SanaroHS 0.2 | 2.3 | 13.8% | 71 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.0% | 66 |
| labg.Cataclysm 2.05 | 4.5 | 11.3% | 39 |
| gre.svman4.Leonidas 1.3.2 | 4.6 | 11.4% | 25 |
| baal.nano.N 1.42 | 6.2 | 9.0% | 6 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.4 | 8.4% | 15 |
| zyx.micro.Ant 1.1 | 8.1 | 6.0% | 1 |
| sanja.First 0.1 | 9.1 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 73.3 | 6 / 35 | 3757 |
| 2 | 2 | 62.8 | 74.9 | 9 / 35 | 3656 |
| 3 | 2 | 61.9 | 70.2 | 6 / 35 | 4026 |
| 4 | 2 | 62.3 | 73.0 | 5 / 35 | 3892 |
| 5 | 3 | 58.6 | 64.1 | 7 / 35 | 3218 |
| 6 | 3 | 60.1 | 65.4 | 8 / 35 | 3642 |
| 7 | 2 | 62.7 | 74.3 | 8 / 35 | 3883 |
| 8 | 2 | 57.8 | 61.0 | 7 / 35 | 3119 |
| 9 | 3 | 57.5 | 60.3 | 8 / 35 | 3138 |
| 10 | 2 | 62.4 | 73.0 | 7 / 35 | 3693 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 67 | 48% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 8% |
| gre.svman4.Leonidas 1.3.2 | 22 | 77% |
| labg.Cataclysm 2.05 | 18 | 56% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 88% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| baal.nano.N 1.42 | 1 | 0% |

Hadur died in 281 of 350 rounds, at a mean tick of 1096. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 94 | 33% | 126 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 74 | 26% | 83 |
| gre.svman4.Leonidas 1.3.2 | 42 | 15% | 54 |
| labg.Cataclysm 2.05 | 35 | 12% | 45 |
| kinsen.melee.Angsaichmophobia 1.8c | 18 | 6% | 21 |
| baal.nano.N 1.42 | 9 | 3% | 10 |
| zyx.micro.Ant 1.1 | 5 | 2% | 7 |
| sanja.First 0.1 | 3 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F34

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 73.4 | 63 / 350 | 3.40 | 14.1% | 36859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.5 | 17.2% | 111 |
| stelo.Spread 0.9 | 1.6 | 17.1% | 131 |
| hadur117.nano.SanaroHS 0.2 | 3.0 | 14.1% | 63 |
| jcs.Seth 1.8 | 4.2 | 11.8% | 29 |
| tcf.Reach 3 | 4.9 | 11.2% | 10 |
| cli.Dancer 1.1 | 5.8 | 9.7% | 5 |
| ratosh.Wesco 1.4 | 7.0 | 7.5% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.6% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.3 | 73.3 | 7 / 35 | 3402 |
| 2 | 4 | 61.9 | 71.7 | 5 / 35 | 3681 |
| 3 | 2 | 63.7 | 76.8 | 8 / 35 | 3827 |
| 4 | 3 | 64.7 | 78.7 | 9 / 35 | 3985 |
| 5 | 3 | 61.6 | 70.8 | 5 / 35 | 3724 |
| 6 | 3 | 60.8 | 68.6 | 4 / 35 | 3662 |
| 7 | 3 | 62.0 | 73.0 | 4 / 35 | 3593 |
| 8 | 3 | 63.9 | 77.8 | 7 / 35 | 3827 |
| 9 | 3 | 64.1 | 76.8 | 9 / 35 | 3730 |
| 10 | 3 | 60.0 | 66.0 | 5 / 35 | 3428 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 66 | 55% |
| kid.Gladiator .7.2 | 54 | 24% |
| jcs.Seth 1.8 | 16 | 44% |
| tcf.Reach 3 | 7 | 43% |
| cli.Dancer 1.1 | 4 | 75% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 287 of 350 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 125 | 44% | 131 |
| stelo.Spread 0.9 | 92 | 32% | 130 |
| jcs.Seth 1.8 | 27 | 9% | 35 |
| tcf.Reach 3 | 20 | 7% | 24 |
| cli.Dancer 1.1 | 9 | 3% | 15 |
| ratosh.Wesco 1.4 | 8 | 3% | 8 |
| amk.Punbot.Punbot 0.01 | 4 | 1% | 4 |
| sample.VelociRobot 1.0 | 2 | 1% | 2 |

## Melee bench: F35

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 68.9 | 21 / 350 | 3.80 | 12.3% | 25535 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 269 |
| gh.mini.Gruwel 0.9 | 2.5 | 13.4% | 24 |
| hadur117.nano.SanaroHS 0.2 | 3.4 | 12.3% | 21 |
| rz.HawkOnFire 0.1 | 3.5 | 12.3% | 18 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.6 | 11.2% | 15 |
| myl.nano.KomoriNinja 1.1 | 6.6 | 7.2% | 3 |
| wit.Chuliath 1.0 | 6.8 | 7.1% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 6.3% | 0 |
| dans.Cinnamon 1.2 | 9.1 | 5.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.6 | 67.6 | 1 / 35 | 2283 |
| 2 | 4 | 59.4 | 72.4 | 2 / 35 | 2686 |
| 3 | 3 | 55.2 | 61.9 | 0 / 35 | 2345 |
| 4 | 3 | 59.3 | 71.1 | 2 / 35 | 2697 |
| 5 | 5 | 58.1 | 68.6 | 2 / 35 | 2349 |
| 6 | 2 | 59.4 | 73.7 | 5 / 35 | 2403 |
| 7 | 4 | 56.8 | 65.7 | 2 / 35 | 2500 |
| 8 | 4 | 58.3 | 66.7 | 2 / 35 | 2796 |
| 9 | 2 | 59.2 | 71.4 | 1 / 35 | 2941 |
| 10 | 3 | 59.0 | 69.8 | 4 / 35 | 2535 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 79 | 1% |
| gh.mini.Gruwel 0.9 | 21 | 52% |
| rz.HawkOnFire 0.1 | 11 | 45% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 43% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 330 of 350 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 140 | 42% | 140 |
| rz.HawkOnFire 0.1 | 62 | 19% | 68 |
| gh.mini.Gruwel 0.9 | 56 | 17% | 65 |
| dmh.robocode.robot.BlackDeath 9.2 | 35 | 11% | 40 |
| myl.nano.KomoriNinja 1.1 | 13 | 4% | 13 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 13 | 4% | 13 |
| dans.Cinnamon 1.2 | 6 | 2% | 6 |
| wit.Chuliath 1.0 | 4 | 1% | 4 |
| stelo.MyAgileRobot 0.2 | 1 | 0% | 1 |

## Melee bench: F36

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 74.7 | 130 / 350 | 3.27 | 15.2% | 36882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHS 0.2 | 1.1 | 15.2% | 130 |
| bzdp.Pansy 2.1 | 2.5 | 12.8% | 57 |
| alpha.RainingFire 1.0 | 3.2 | 12.5% | 52 |
| bvh.micro.Freya 0.3 | 4.1 | 11.4% | 30 |
| mz.Cork 0.1 | 4.7 | 11.1% | 25 |
| m3thos.Eva02 0.7.1 | 6.1 | 9.7% | 22 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.6% | 11 |
| dl.BetterWalls 1.0 | 8.4 | 6.7% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.6 | 6.5% | 6 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.5% | 15 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 76.8 | 15 / 35 | 3820 |
| 2 | 1 | 61.0 | 69.8 | 12 / 35 | 3564 |
| 3 | 1 | 61.1 | 72.7 | 10 / 35 | 3163 |
| 4 | 1 | 60.5 | 69.5 | 11 / 35 | 3562 |
| 5 | 2 | 61.3 | 71.4 | 9 / 35 | 3597 |
| 6 | 1 | 63.0 | 74.3 | 14 / 35 | 3917 |
| 7 | 1 | 65.6 | 83.5 | 18 / 35 | 3853 |
| 8 | 1 | 65.4 | 83.8 | 15 / 35 | 3825 |
| 9 | 1 | 64.0 | 75.2 | 15 / 35 | 4151 |
| 10 | 1 | 61.3 | 70.2 | 11 / 35 | 3430 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 60 | 60% |
| bvh.micro.Freya 0.3 | 44 | 75% |
| mz.Cork 0.1 | 25 | 64% |
| m3thos.Eva02 0.7.1 | 20 | 75% |
| alpha.RainingFire 1.0 | 16 | 50% |
| bvh.mini.Fenrir 0.39 | 12 | 83% |
| sample.MyFirstRobot 1.0 | 9 | 33% |
| dl.BetterWalls 1.0 | 8 | 88% |
| squidM.TentalceMeleeNano 1.1 | 3 | 67% |

Hadur died in 220 of 350 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 48 | 22% | 93 |
| alpha.RainingFire 1.0 | 42 | 19% | 54 |
| bvh.micro.Freya 0.3 | 35 | 16% | 53 |
| mz.Cork 0.1 | 28 | 13% | 48 |
| bvh.mini.Fenrir 0.39 | 26 | 12% | 32 |
| m3thos.Eva02 0.7.1 | 17 | 8% | 29 |
| dl.BetterWalls 1.0 | 10 | 5% | 19 |
| sample.MyFirstRobot 1.0 | 7 | 3% | 14 |
| squidM.TentalceMeleeNano 1.1 | 7 | 3% | 8 |

## Melee bench: F37

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 79.9 | 136 / 350 | 2.81 | 15.8% | 42507 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHS 0.2 | 1.0 | 15.8% | 136 |
| germ.TheMind .2 | 2.6 | 11.7% | 54 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.6 | 11.0% | 32 |
| EBBU.Sim2 1.02 | 3.7 | 10.7% | 32 |
| agrach.Dalek 1.0 | 5.4 | 9.6% | 28 |
| stelo.UntouchableNano 1.3 | 6.4 | 9.0% | 20 |
| mb.Beast 0.1 | 7.3 | 8.5% | 21 |
| lmk.ACPFinal 0.1 | 7.5 | 8.5% | 10 |
| mn.nano.perceptual.Impact 1.3.0 | 8.4 | 7.8% | 1 |
| skm.Ryubot 1.0 | 9.1 | 7.5% | 17 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 81.0 | 14 / 35 | 4622 |
| 2 | 1 | 62.4 | 79.0 | 11 / 35 | 4392 |
| 3 | 1 | 62.8 | 80.0 | 15 / 35 | 3835 |
| 4 | 1 | 65.6 | 86.3 | 18 / 35 | 4287 |
| 5 | 1 | 61.5 | 78.1 | 10 / 35 | 3954 |
| 6 | 1 | 63.9 | 82.9 | 17 / 35 | 4033 |
| 7 | 1 | 62.5 | 77.8 | 12 / 35 | 4425 |
| 8 | 1 | 63.3 | 79.0 | 14 / 35 | 4657 |
| 9 | 1 | 62.5 | 79.4 | 13 / 35 | 4211 |
| 10 | 1 | 61.5 | 75.2 | 12 / 35 | 4091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 47 | 45% |
| EBBU.Sim2 1.02 | 32 | 50% |
| agrach.Dalek 1.0 | 30 | 83% |
| com.syncleus.robocode.Dreadnaught 0.1 | 30 | 60% |
| stelo.UntouchableNano 1.3 | 26 | 65% |
| mb.Beast 0.1 | 20 | 80% |
| skm.Ryubot 1.0 | 16 | 56% |
| lmk.ACPFinal 0.1 | 15 | 93% |

Hadur died in 217 of 350 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 51 | 24% | 73 |
| com.syncleus.robocode.Dreadnaught 0.1 | 35 | 16% | 56 |
| EBBU.Sim2 1.02 | 35 | 16% | 49 |
| lmk.ACPFinal 0.1 | 22 | 10% | 29 |
| agrach.Dalek 1.0 | 21 | 10% | 52 |
| stelo.UntouchableNano 1.3 | 19 | 9% | 32 |
| mb.Beast 0.1 | 15 | 7% | 31 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 5% | 14 |
| skm.Ryubot 1.0 | 8 | 4% | 13 |

## Melee bench: F38

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 66.2 | 54 / 350 | 4.04 | 12.3% | 28079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.2% | 134 |
| bvh.mini.Freya 0.55 | 3.1 | 12.9% | 39 |
| hadur117.nano.SanaroHS 0.2 | 3.6 | 12.3% | 54 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.7% | 52 |
| cs.Wren 1.0 | 4.4 | 11.8% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 11.5% | 34 |
| kdf.KoulDestroyer 1.0 | 7.0 | 9.0% | 11 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.2% | 3 |
| bzdp.BoxCar 2.0 | 9.3 | 4.2% | 0 |
| matt.UnderDark3 2.4.34 | 9.7 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 53.2 | 56.8 | 2 / 35 | 2695 |
| 2 | 2 | 60.1 | 72.4 | 6 / 35 | 2901 |
| 3 | 2 | 60.1 | 72.7 | 8 / 35 | 2906 |
| 4 | 4 | 57.8 | 67.9 | 7 / 35 | 2457 |
| 5 | 4 | 57.6 | 63.8 | 7 / 35 | 2963 |
| 6 | 3 | 58.4 | 68.3 | 4 / 35 | 2855 |
| 7 | 4 | 56.8 | 64.1 | 3 / 35 | 2818 |
| 8 | 5 | 57.1 | 63.8 | 5 / 35 | 2718 |
| 9 | 2 | 57.9 | 65.1 | 7 / 35 | 2932 |
| 10 | 4 | 58.6 | 67.3 | 5 / 35 | 2834 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 51 | 47% |
| bvh.mini.Freya 0.55 | 20 | 60% |
| cs.Wren 1.0 | 19 | 42% |
| bts.mega.Gnarly 1.4 | 17 | 29% |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 21% |
| kdf.KoulDestroyer 1.0 | 1 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 297 of 350 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 65 | 22% | 88 |
| cs.Wren 1.0 | 50 | 17% | 57 |
| davidalves.net.DuelistNanoMelee 1.01 | 46 | 15% | 54 |
| bvh.mini.Freya 0.55 | 45 | 15% | 54 |
| bts.mega.Gnarly 1.4 | 45 | 15% | 50 |
| kdf.KoulDestroyer 1.0 | 26 | 9% | 26 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8 | 3% | 9 |
| bzdp.BoxCar 2.0 | 7 | 2% | 7 |
| matt.UnderDark3 2.4.34 | 5 | 2% | 5 |

## Melee bench: F39

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 66.8 | 58 / 350 | 3.99 | 12.5% | 29406 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.1 | 15.7% | 65 |
| az.Ololobot 0.2.4 | 2.0 | 13.7% | 124 |
| hadur117.nano.SanaroHS 0.2 | 3.1 | 12.5% | 58 |
| catcat20.Lambda 0.024 | 4.2 | 11.3% | 44 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.3% | 39 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 8.6% | 4 |
| winamp32.micro.MicroMacro 1.0 | 6.9 | 8.6% | 12 |
| gimp.GimpBot 0.1 | 7.4 | 8.2% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.9 | 6.5% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.0 | 61.6 | 2 / 35 | 2884 |
| 2 | 3 | 56.8 | 64.1 | 7 / 35 | 2873 |
| 3 | 3 | 58.2 | 69.5 | 4 / 35 | 3003 |
| 4 | 2 | 57.8 | 66.7 | 7 / 35 | 2991 |
| 5 | 3 | 60.1 | 74.6 | 8 / 35 | 2834 |
| 6 | 3 | 56.9 | 65.1 | 5 / 35 | 3047 |
| 7 | 3 | 58.2 | 67.9 | 8 / 35 | 3004 |
| 8 | 3 | 57.5 | 67.6 | 6 / 35 | 2887 |
| 9 | 3 | 58.4 | 69.5 | 7 / 35 | 2906 |
| 10 | 4 | 55.6 | 61.3 | 4 / 35 | 2977 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 44 | 18% |
| bvh.fry.Freya 0.82 | 31 | 58% |
| catcat20.Lambda 0.024 | 28 | 43% |
| stelo.SoRobotNanoMelee 1.2 | 19 | 53% |
| winamp32.micro.MicroMacro 1.0 | 11 | 73% |
| gimp.GimpBot 0.1 | 2 | 50% |
| apollokidd.ApolloKidd 0.9 | 2 | 50% |

Hadur died in 293 of 350 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 94 | 32% | 113 |
| az.Ololobot 0.2.4 | 60 | 20% | 67 |
| stelo.SoRobotNanoMelee 1.2 | 44 | 15% | 50 |
| apollokidd.ApolloKidd 0.9 | 37 | 13% | 39 |
| catcat20.Lambda 0.024 | 33 | 11% | 43 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9 | 3% | 10 |
| winamp32.micro.MicroMacro 1.0 | 8 | 3% | 18 |
| gimp.GimpBot 0.1 | 8 | 3% | 10 |

## Melee bench: F41

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 71.9 | 95 / 350 | 3.53 | 13.8% | 29827 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 16.8% | 151 |
| hadur117.nano.SanaroHS 0.2 | 3.0 | 13.8% | 95 |
| ary.Swarm 1.1 | 3.1 | 13.2% | 27 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.8% | 33 |
| simonton.nano.MeleeSeed 1.8 | 4.4 | 11.8% | 29 |
| shrub.Silver v048 | 6.0 | 9.5% | 10 |
| zyx.nano.Ant 1.1 | 7.0 | 7.8% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 6.2% | 3 |
| stelo.Mirror 1.1 | 8.8 | 5.6% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 78.1 | 13 / 35 | 2963 |
| 2 | 2 | 63.5 | 79.4 | 9 / 35 | 3055 |
| 3 | 2 | 61.7 | 73.7 | 12 / 35 | 3022 |
| 4 | 4 | 59.7 | 67.0 | 11 / 35 | 2903 |
| 5 | 5 | 56.6 | 58.7 | 7 / 35 | 2875 |
| 6 | 2 | 60.5 | 71.7 | 9 / 35 | 2931 |
| 7 | 2 | 63.1 | 79.4 | 10 / 35 | 2824 |
| 8 | 5 | 58.6 | 64.8 | 7 / 35 | 2982 |
| 9 | 2 | 63.3 | 79.7 | 10 / 35 | 3112 |
| 10 | 4 | 59.8 | 67.0 | 7 / 35 | 3160 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 88 | 40% |
| ary.Swarm 1.1 | 26 | 81% |
| simonton.nano.MeleeSeed 1.8 | 23 | 87% |
| lessonz.robocode.Oz 0.5.0 | 19 | 63% |
| shrub.Silver v048 | 5 | 20% |
| stelo.Mirror 1.1 | 3 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 0% |

Hadur died in 255 of 350 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 96 | 38% | 133 |
| ary.Swarm 1.1 | 55 | 22% | 77 |
| lessonz.robocode.Oz 0.5.0 | 28 | 11% | 39 |
| simonton.nano.MeleeSeed 1.8 | 27 | 11% | 48 |
| zyx.nano.Ant 1.1 | 19 | 7% | 19 |
| shrub.Silver v048 | 13 | 5% | 15 |
| jsal.Jsalbot 1.0 | 9 | 4% | 10 |
| stelo.Mirror 1.1 | 6 | 2% | 7 |
| acogdev.alpha 0.2 | 2 | 1% | 2 |

## Melee bench: F42

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 73.4 | 86 / 350 | 3.40 | 14.3% | 36346 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 16.9% | 148 |
| maribo.mini.MiniQuester 0.1 | 2.8 | 14.5% | 45 |
| ara.Shera 0.88 | 3.1 | 14.0% | 56 |
| hadur117.nano.SanaroHS 0.2 | 3.1 | 14.3% | 86 |
| amz.NanoClone 1.41 | 5.0 | 9.4% | 6 |
| dsw.StaticD 1.0 | 6.6 | 7.3% | 7 |
| maribo.IotaCT 1.1 | 6.7 | 7.4% | 1 |
| stelo.MirrorMicro 1.0 | 7.9 | 6.0% | 1 |
| mme.NikeEnhanced 2.0 | 9.1 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.5 | 67.9 | 10 / 35 | 3018 |
| 2 | 4 | 60.3 | 67.9 | 6 / 35 | 3670 |
| 3 | 4 | 61.1 | 70.8 | 7 / 35 | 3672 |
| 4 | 4 | 61.0 | 70.5 | 8 / 35 | 3647 |
| 5 | 2 | 61.7 | 71.4 | 9 / 35 | 3892 |
| 6 | 4 | 61.4 | 71.4 | 5 / 35 | 3907 |
| 7 | 2 | 64.2 | 79.7 | 11 / 35 | 3803 |
| 8 | 2 | 64.6 | 81.3 | 11 / 35 | 3934 |
| 9 | 2 | 62.0 | 78.1 | 9 / 35 | 3201 |
| 10 | 3 | 62.3 | 74.6 | 10 / 35 | 3602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 69 | 46% |
| ara.Shera 0.88 | 37 | 65% |
| maribo.mini.MiniQuester 0.1 | 29 | 86% |
| amz.NanoClone 1.41 | 4 | 100% |
| dsw.StaticD 1.0 | 3 | 33% |
| maribo.IotaCT 1.1 | 1 | 0% |

Hadur died in 264 of 350 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 91 | 34% | 121 |
| ara.Shera 0.88 | 77 | 29% | 100 |
| maribo.mini.MiniQuester 0.1 | 50 | 19% | 76 |
| amz.NanoClone 1.41 | 23 | 9% | 27 |
| maribo.IotaCT 1.1 | 8 | 3% | 8 |
| dsw.StaticD 1.0 | 5 | 2% | 7 |
| mme.NikeEnhanced 2.0 | 5 | 2% | 6 |
| stelo.MirrorMicro 1.0 | 5 | 2% | 5 |

## Melee bench: F43

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 63.8 | 33 / 350 | 4.25 | 12.0% | 28828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.6% | 264 |
| brainfade.melee.Dusk 0.44 | 2.5 | 12.8% | 32 |
| hadur117.nano.SanaroHS 0.2 | 3.8 | 12.0% | 33 |
| dummy.micro.Sparrow 2.5 | 3.9 | 11.8% | 12 |
| wcsv.melee.EngineerMelee 0.1 | 4.0 | 11.3% | 6 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 10.2% | 3 |
| jab.DiamondStealer 5 | 7.4 | 7.9% | 0 |
| mz.NanoGod 2.02 | 7.6 | 7.7% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.5 | 59.7 | 2 / 35 | 2780 |
| 2 | 4 | 59.1 | 61.6 | 6 / 35 | 3163 |
| 3 | 3 | 59.5 | 66.7 | 4 / 35 | 2717 |
| 4 | 4 | 59.0 | 65.4 | 3 / 35 | 2788 |
| 5 | 2 | 61.1 | 69.8 | 3 / 35 | 3172 |
| 6 | 4 | 59.1 | 62.2 | 3 / 35 | 3148 |
| 7 | 5 | 56.8 | 60.6 | 0 / 35 | 2549 |
| 8 | 3 | 60.7 | 67.6 | 6 / 35 | 2912 |
| 9 | 4 | 58.4 | 61.6 | 3 / 35 | 2952 |
| 10 | 4 | 58.5 | 63.2 | 3 / 35 | 2647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 77 | 14% |
| brainfade.melee.Dusk 0.44 | 19 | 79% |
| dummy.micro.Sparrow 2.5 | 7 | 57% |
| Krabb.akim2.Akim2 1.1b | 2 | 50% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 50% |
| mz.NanoGod 2.02 | 2 | 50% |

Hadur died in 317 of 350 rounds, at a mean tick of 781. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 156 | 49% | 164 |
| dummy.micro.Sparrow 2.5 | 43 | 14% | 47 |
| brainfade.melee.Dusk 0.44 | 39 | 12% | 57 |
| wcsv.melee.EngineerMelee 0.1 | 25 | 8% | 25 |
| Krabb.akim2.Akim2 1.1b | 23 | 7% | 24 |
| mz.NanoGod 2.02 | 15 | 5% | 17 |
| jab.DiamondStealer 5 | 12 | 4% | 12 |
| cvt.Firsty 1.0 | 4 | 1% | 4 |

## Melee bench: F44

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 73.0 | 83 / 350 | 3.43 | 14.4% | 35411 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.1 | 16.9% | 147 |
| tzu.TheArtOfWar 1.2 | 2.3 | 15.2% | 81 |
| hadur117.nano.SanaroHS 0.2 | 2.6 | 14.4% | 83 |
| jwirde.Gort 2.0 | 4.5 | 10.6% | 20 |
| wompi.Quokka 1.6 | 4.6 | 10.6% | 9 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.9 | 9.1% | 6 |
| disan.Chair 2.2.0 | 7.3 | 7.3% | 3 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.8% | 3 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.7% | 1 |
| sample.Crazy 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 80.0 | 9 / 35 | 3478 |
| 2 | 3 | 61.9 | 73.3 | 5 / 35 | 3441 |
| 3 | 2 | 62.6 | 74.9 | 9 / 35 | 3765 |
| 4 | 3 | 61.3 | 72.1 | 3 / 35 | 3626 |
| 5 | 3 | 60.8 | 68.3 | 11 / 35 | 3373 |
| 6 | 2 | 63.8 | 77.8 | 13 / 35 | 3596 |
| 7 | 3 | 60.7 | 69.5 | 11 / 35 | 3209 |
| 8 | 3 | 58.1 | 62.9 | 4 / 35 | 3417 |
| 9 | 2 | 63.7 | 78.1 | 11 / 35 | 3832 |
| 10 | 3 | 61.6 | 73.3 | 7 / 35 | 3674 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 83 | 48% |
| tzu.TheArtOfWar 1.2 | 59 | 34% |
| jwirde.Gort 2.0 | 13 | 46% |
| wompi.Quokka 1.6 | 13 | 85% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 75% |
| disan.Chair 2.2.0 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 270 of 350 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 94 | 35% | 138 |
| tzu.TheArtOfWar 1.2 | 85 | 31% | 103 |
| wompi.Quokka 1.6 | 27 | 10% | 32 |
| jwirde.Gort 2.0 | 21 | 8% | 27 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 20 | 7% | 24 |
| stf.PanzerGeneral 0.1 | 7 | 3% | 9 |
| disan.Chair 2.2.0 | 6 | 2% | 8 |
| sample.Crazy 1.0 | 5 | 2% | 6 |
| amk.jointstrike.JointStrike 0.2 | 3 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F45

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 70.2 | 57 / 350 | 3.69 | 14.2% | 38363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroHS 0.2 | 1.2 | 14.2% | 57 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 13.3% | 189 |
| sul.Lunar 1.1 | 3.4 | 11.9% | 45 |
| jje.BagPuss 1.2 | 3.9 | 11.5% | 16 |
| myl.nano.Graviton 1.10 | 4.5 | 10.7% | 13 |
| hvilela.HVilela 0.9 | 6.5 | 9.2% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.8% | 11 |
| fm.claire 1.7 | 7.6 | 8.5% | 2 |
| wit.Deep7 2.0 | 9.0 | 6.5% | 16 |
| abud.ThirdRobo 1.0 | 9.9 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.9 | 71.4 | 5 / 35 | 3711 |
| 2 | 2 | 58.5 | 64.4 | 5 / 35 | 3598 |
| 3 | 1 | 63.8 | 79.0 | 8 / 35 | 4054 |
| 4 | 1 | 60.6 | 69.8 | 5 / 35 | 3831 |
| 5 | 1 | 61.8 | 74.6 | 4 / 35 | 3914 |
| 6 | 1 | 62.1 | 73.3 | 9 / 35 | 3915 |
| 7 | 2 | 58.7 | 64.4 | 4 / 35 | 3956 |
| 8 | 1 | 61.6 | 72.4 | 7 / 35 | 3994 |
| 9 | 1 | 59.9 | 68.3 | 5 / 35 | 3765 |
| 10 | 1 | 58.0 | 63.8 | 5 / 35 | 3625 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 97 | 34% |
| sul.Lunar 1.1 | 24 | 13% |
| jje.BagPuss 1.2 | 18 | 50% |
| wit.Deep7 2.0 | 12 | 17% |
| myl.nano.Graviton 1.10 | 7 | 29% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 83% |
| hvilela.HVilela 0.9 | 3 | 100% |

Hadur died in 294 of 350 rounds, at a mean tick of 1353. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 72 | 24% | 0 |
| sul.Lunar 1.1 | 53 | 18% | 89 |
| jje.BagPuss 1.2 | 43 | 15% | 80 |
| myl.nano.Graviton 1.10 | 41 | 14% | 57 |
| hvilela.HVilela 0.9 | 27 | 9% | 32 |
| fm.claire 1.7 | 22 | 7% | 30 |
| wit.Deep7 2.0 | 20 | 7% | 30 |
| pez.mini.ChironexFleckeri 0.5 | 11 | 4% | 23 |
| abud.ThirdRobo 1.0 | 5 | 2% | 7 |

## Melee bench: F46

hadur117.nano.SanaroHS 0.2 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 68.9 | 43 / 350 | 3.80 | 12.5% | 27934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 18.0% | 137 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 17.1% | 139 |
| hadur117.nano.SanaroHS 0.2 | 3.0 | 12.5% | 43 |
| mz.MicroSheep 1.0 | 4.3 | 10.6% | 7 |
| cx.Princess 1.0 | 4.9 | 10.3% | 18 |
| sadoner.killer 0.2 | 5.9 | 9.3% | 3 |
| arthord.NanoSatanMelee Beta | 7.1 | 7.4% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.3% | 2 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.4 | 73.7 | 7 / 35 | 3119 |
| 2 | 3 | 59.7 | 71.1 | 5 / 35 | 2866 |
| 3 | 3 | 59.7 | 73.7 | 5 / 35 | 2638 |
| 4 | 3 | 55.8 | 62.5 | 4 / 35 | 2344 |
| 5 | 3 | 57.9 | 67.3 | 2 / 35 | 2992 |
| 6 | 3 | 58.9 | 68.3 | 1 / 35 | 2881 |
| 7 | 3 | 59.8 | 72.7 | 3 / 35 | 2819 |
| 8 | 3 | 58.3 | 66.0 | 7 / 35 | 2853 |
| 9 | 3 | 57.8 | 66.7 | 5 / 35 | 2695 |
| 10 | 3 | 58.0 | 67.0 | 4 / 35 | 2727 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 65 | 35% |
| rsalesc.melee.Medina 0.4.5 | 43 | 23% |
| cx.Princess 1.0 | 8 | 63% |
| mz.MicroSheep 1.0 | 2 | 50% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| kurios.DOSexe .9a | 1 | 100% |
| sadoner.killer 0.2 | 1 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 0% |

Hadur died in 307 of 350 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 126 | 41% | 151 |
| rsalesc.melee.Medina 0.4.5 | 84 | 27% | 92 |
| mz.MicroSheep 1.0 | 33 | 11% | 35 |
| cx.Princess 1.0 | 21 | 7% | 25 |
| sadoner.killer 0.2 | 20 | 7% | 22 |
| arthord.NanoSatanMelee Beta | 11 | 4% | 11 |
| jeremyreeder.collective.Prophet 5 | 8 | 3% | 9 |
| kurios.DOSexe .9a | 4 | 1% | 5 |

