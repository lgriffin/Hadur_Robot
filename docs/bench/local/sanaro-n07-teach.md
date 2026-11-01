# Bench suite: suite.txt

## Melee bench: F01

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 49 over 3 battles (16.3 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.5 | 31 / 105 | 2.12 | 18.1% | 16895 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.5% | 67 |
| hadur117.Hadur 3.20 | 2.0 | 18.1% | 31 |
| sgp.JollyNinja 3.53 | 3.0 | 11.6% | 6 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 10.8% | 1 |
| mz.MicroGodMelee 1 | 5.3 | 9.7% | 0 |
| lorneswork.Predator 1.0 | 5.7 | 9.8% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| skm.butterfly 1.0 | 8.3 | 4.9% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.7 | 5.3% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.9 | 86.0 | 8 / 35 | 5583 |
| 2 | 2 | 67.4 | 85.4 | 11 / 35 | 5391 |
| 3 | 2 | 69.6 | 91.1 | 12 / 35 | 5921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 62 | 11% |
| sgp.JollyNinja 3.53 | 9 | 67% |
| mz.MicroGodMelee 1 | 8 | 100% |
| lorneswork.Predator 1.0 | 5 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |

Hadur died in 74 of 105 rounds, at a mean tick of 1211. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 60 | 81% | 72 |
| sgp.JollyNinja 3.53 | 7 | 9% | 11 |
| mz.MicroGodMelee 1 | 2 | 3% | 9 |
| lorneswork.Predator 1.0 | 2 | 3% | 7 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2 | 3% | 4 |
| adt.Ar2 1.0 | 1 | 1% | 2 |

Posture (Hadur's M records, 100 rounds): 70445 melee ticks, 44192 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (100 rounds): longest scan gap while four or more were alive 55 ticks (100 rounds over 8); rounds whose longest gap at any count was over 8: 100; robots dropped as dead without a death event: 0.

Targeting waves (100 rounds): 22237 sent, 19872 reached their opponent, 4077 virtual hits (20.5% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 78 over 3 battles (26.0 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.7 | 63 / 105 | 1.92 | 19.6% | 15429 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 19.6% | 63 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.1% | 19 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.2% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.6% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.1% | 6 |
| sch.Simone 0.3d | 6.7 | 7.7% | 2 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 8.0% | 0 |
| Noran.BitchingElk 0.054 | 7.7 | 7.5% | 4 |
| stelo.PatternRobot 1.0 | 9.0 | 5.3% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.3 | 25 / 35 | 5340 |
| 2 | 1 | 68.2 | 86.3 | 17 / 35 | 4770 |
| 3 | 1 | 69.4 | 88.6 | 21 / 35 | 5319 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 28 | 82% |
| pulsar.PulsarMax 0.8.9 | 22 | 59% |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 58% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 88% |
| sch.Simone 0.3d | 7 | 86% |
| Noran.BitchingElk 0.054 | 6 | 50% |
| stelo.PatternRobot 1.0 | 3 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 44 of 105 rounds, at a mean tick of 1046. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 14 | 32% | 31 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 9 | 20% | 32 |
| com.cohesiva.robocode.ManOwaR 1.0 | 6 | 14% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 6 | 14% | 10 |
| Noran.BitchingElk 0.054 | 4 | 9% | 5 |
| sch.Simone 0.3d | 2 | 5% | 7 |
| stelo.PatternRobot 1.0 | 2 | 5% | 4 |
| fnc.bandit.Bandit 5.2.0 | 1 | 2% | 3 |
| fullsail.SweetTea 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 101 rounds): 83057 melee ticks, 25750 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (101 rounds): longest scan gap while four or more were alive 46 ticks (101 rounds over 8); rounds whose longest gap at any count was over 8: 101; robots dropped as dead without a death event: 0.

Targeting waves (101 rounds): 29540 sent, 27163 reached their opponent, 4566 virtual hits (16.8% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 61 over 3 battles (20.3 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.7 | 89 / 105 | 1.48 | 21.5% | 19850 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 21.5% | 89 |
| radnor.DoctorBob 1.42 | 2.7 | 12.6% | 3 |
| kawigi.nano.Lib 1.0 | 3.0 | 12.5% | 6 |
| vuen.Cake 2.51 | 3.3 | 12.7% | 7 |
| urdos.URDOS 1.3 | 5.0 | 9.6% | 0 |
| adt.Ar1 2.1 | 6.3 | 7.7% | 0 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.3% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.0 | 6.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.0 | 5.9% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 98.7 | 31 / 35 | 6910 |
| 2 | 1 | 72.0 | 94.3 | 29 / 35 | 6704 |
| 3 | 1 | 70.5 | 91.1 | 29 / 35 | 6236 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 42 | 88% |
| kawigi.nano.Lib 1.0 | 25 | 92% |
| radnor.DoctorBob 1.42 | 23 | 100% |
| urdos.URDOS 1.3 | 4 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |

Hadur died in 16 of 105 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 4 | 25% | 33 |
| kawigi.nano.Lib 1.0 | 4 | 25% | 26 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 19% | 4 |
| radnor.DoctorBob 1.42 | 2 | 13% | 26 |
| adt.Ar1 2.1 | 2 | 13% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 6% | 2 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 5 |
| urdos.URDOS 1.3 | 0 | 0% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 99 rounds): 62422 melee ticks, 21171 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (99 rounds): longest scan gap while four or more were alive 33 ticks (99 rounds over 8); rounds whose longest gap at any count was over 8: 99; robots dropped as dead without a death event: 0.

Targeting waves (99 rounds): 19112 sent, 16758 reached their opponent, 4378 virtual hits (26.1% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 154 over 3 battles (51.3 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.3 | 15 / 105 | 2.14 | 18.4% | 18443 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.8% | 86 |
| hadur117.Hadur 3.20 | 2.0 | 18.4% | 15 |
| apc.LeeroyJenkins2 1.0 | 3.3 | 13.1% | 1 |
| TNT.TNT 0.99.1 | 4.0 | 10.9% | 3 |
| josago.Jorgito 0.16 | 4.7 | 9.7% | 0 |
| css.Delitioner 0.11 | 6.0 | 6.6% | 0 |
| tj.zombie1n 1.0.1 | 7.3 | 6.0% | 0 |
| rampancy.Durandal 2.1d | 7.7 | 5.1% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.9% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.7 | 86.3 | 6 / 35 | 6361 |
| 2 | 2 | 69.8 | 88.6 | 7 / 35 | 6105 |
| 3 | 2 | 69.1 | 87.0 | 2 / 35 | 5977 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 76 | 12% |
| josago.Jorgito 0.16 | 3 | 100% |
| TNT.TNT 0.99.1 | 2 | 0% |
| apc.LeeroyJenkins2 1.0 | 2 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 91 of 105 rounds, at a mean tick of 1405. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 74 | 81% | 84 |
| apc.LeeroyJenkins2 1.0 | 10 | 11% | 12 |
| TNT.TNT 0.99.1 | 5 | 5% | 5 |
| josago.Jorgito 0.16 | 1 | 1% | 3 |
| css.Delitioner 0.11 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 101 rounds): 97938 melee ticks, 44547 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (101 rounds): longest scan gap while four or more were alive 49 ticks (101 rounds over 8); rounds whose longest gap at any count was over 8: 101; robots dropped as dead without a death event: 0.

Targeting waves (101 rounds): 29568 sent, 27159 reached their opponent, 4098 virtual hits (15.1% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 167 over 3 battles (55.7 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.7 | 79 / 105 | 1.57 | 21.2% | 17817 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 21.2% | 79 |
| jekl.StoneGhost 0.7 | 2.3 | 14.3% | 4 |
| origin.SleepSiphon 1.7b | 2.7 | 13.4% | 14 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 11.0% | 4 |
| mld.Wisdom 1.0 | 5.0 | 10.3% | 1 |
| gg.Wolverine 2.0 | 5.7 | 9.1% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 6.5% | 2 |
| DBall.NUKE 0.1 | 8.0 | 6.2% | 0 |
| spinnercat.Omen 1.0 | 8.3 | 5.5% | 0 |
| sample.Fire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 97.1 | 30 / 35 | 6155 |
| 2 | 1 | 71.5 | 92.1 | 25 / 35 | 5994 |
| 3 | 1 | 71.1 | 91.7 | 24 / 35 | 5668 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 33 | 97% |
| origin.SleepSiphon 1.7b | 24 | 88% |
| pe.minimelee.SandboxMiniMelee 1.1 | 16 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 60% |
| gg.Wolverine 2.0 | 5 | 80% |
| mld.Wisdom 1.0 | 4 | 100% |

Hadur died in 28 of 105 rounds, at a mean tick of 1019. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 9 | 32% | 33 |
| origin.SleepSiphon 1.7b | 9 | 32% | 33 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3 | 11% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 11% | 9 |
| mld.Wisdom 1.0 | 1 | 4% | 11 |
| gg.Wolverine 2.0 | 1 | 4% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 102 rounds): 76284 melee ticks, 24991 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (102 rounds): longest scan gap while four or more were alive 33 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 0.

Targeting waves (102 rounds): 23407 sent, 21070 reached their opponent, 4503 virtual hits (21.4% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 264 over 3 battles (88.0 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 93.0 | 58 / 105 | 1.63 | 21.1% | 20463 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 21.1% | 58 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 17.2% | 29 |
| rtk.Tachikoma 1.0 | 2.7 | 16.2% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.5% | 6 |
| franzor.Lizt 1.3.1 | 4.7 | 10.2% | 2 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.3 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 93.7 | 22 / 35 | 6755 |
| 2 | 1 | 72.1 | 90.8 | 16 / 35 | 6642 |
| 3 | 1 | 73.4 | 94.6 | 20 / 35 | 7066 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 48 | 85% |
| rsalesc.melee.Monk 0.3.6c | 28 | 21% |
| oog.melee.CapuletDroid 1.1 | 10 | 50% |
| franzor.Lizt 1.3.1 | 7 | 71% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 49 of 105 rounds, at a mean tick of 1448. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 26 | 53% | 41 |
| rtk.Tachikoma 1.0 | 11 | 22% | 43 |
| oog.melee.CapuletDroid 1.1 | 7 | 14% | 17 |
| franzor.Lizt 1.3.1 | 2 | 4% | 1 |
| lrem.micro.MoggFanatic 0.2 | 1 | 2% | 1 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 101 rounds): 88608 melee ticks, 45915 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (101 rounds): longest scan gap while four or more were alive 33 ticks (101 rounds over 8); rounds whose longest gap at any count was over 8: 101; robots dropped as dead without a death event: 0.

Targeting waves (101 rounds): 26890 sent, 24613 reached their opponent, 4917 virtual hits (20.0% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 445 over 3 battles (148.3 per battle, most in one battle 156). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 90.3 | 62 / 105 | 1.88 | 19.5% | 15081 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 19.5% | 62 |
| tm.Yuugao 1.0 | 2.3 | 12.8% | 11 |
| shrub.Vapour v159 | 3.3 | 12.4% | 15 |
| com.spp.robocode.MostlyHarmless 010 | 4.0 | 10.2% | 3 |
| Krabb.sliNk.Garm 0.9u | 4.3 | 10.3% | 10 |
| jwst.DAD.DarkAndDarker 1.1 | 6.0 | 9.1% | 3 |
| m3thos.Eva00 1.1 | 7.3 | 8.0% | 0 |
| qualidafial.MajorDick 1.0.1 | 7.7 | 7.1% | 0 |
| SHAM.WOW 1.4 | 9.3 | 5.6% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 89.8 | 19 / 35 | 5002 |
| 2 | 1 | 69.3 | 90.8 | 22 / 35 | 5048 |
| 3 | 1 | 69.3 | 90.2 | 21 / 35 | 5031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 24 | 67% |
| tm.Yuugao 1.0 | 21 | 71% |
| Krabb.sliNk.Garm 0.9u | 17 | 76% |
| com.spp.robocode.MostlyHarmless 010 | 12 | 92% |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 75% |
| m3thos.Eva00 1.1 | 3 | 100% |
| SHAM.WOW 1.4 | 2 | 50% |

Hadur died in 46 of 105 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 14 | 30% | 26 |
| Krabb.sliNk.Garm 0.9u | 10 | 22% | 17 |
| tm.Yuugao 1.0 | 8 | 17% | 24 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 11% | 13 |
| com.spp.robocode.MostlyHarmless 010 | 3 | 7% | 17 |
| SHAM.WOW 1.4 | 1 | 2% | 3 |
| qualidafial.MajorDick 1.0.1 | 1 | 2% | 1 |
| zyx.nano.BacillusComma 1.0 | 1 | 2% | 1 |
| m3thos.Eva00 1.1 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 102 rounds): 76036 melee ticks, 20404 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (102 rounds): longest scan gap while four or more were alive 57 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 0.

Targeting waves (102 rounds): 24960 sent, 22453 reached their opponent, 4082 virtual hits (18.2% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 261 over 3 battles (87.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 78.0 | 25 / 105 | 2.98 | 15.5% | 10970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.1% | 52 |
| hadur117.Hadur 3.20 | 2.0 | 15.5% | 25 |
| kc.micro.Figment 1.0 | 3.0 | 14.3% | 16 |
| pedersen.Grishnakh 1.0 | 4.3 | 10.8% | 6 |
| yagami.Tidus 0.11 | 4.7 | 10.5% | 0 |
| mc2.enemy.Original 0.9 | 6.0 | 9.0% | 5 |
| dft.Calliope 5.6 | 7.0 | 7.3% | 0 |
| step.nanoPri 1.0 | 8.0 | 5.5% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.4% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 74.6 | 4 / 35 | 3569 |
| 2 | 2 | 65.0 | 80.3 | 12 / 35 | 3723 |
| 3 | 2 | 64.7 | 79.0 | 9 / 35 | 3678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 24 | 29% |
| kc.micro.Figment 1.0 | 17 | 82% |
| dft.Calliope 5.6 | 2 | 100% |
| mc2.enemy.Original 0.9 | 2 | 100% |
| pedersen.Grishnakh 1.0 | 2 | 0% |
| rdm.Dueler 0.4x | 1 | 0% |

Hadur died in 82 of 105 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 32 | 39% | 40 |
| kc.micro.Figment 1.0 | 20 | 24% | 32 |
| yagami.Tidus 0.11 | 9 | 11% | 10 |
| mc2.enemy.Original 0.9 | 8 | 10% | 10 |
| pedersen.Grishnakh 1.0 | 6 | 7% | 6 |
| rdm.Dueler 0.4x | 3 | 4% | 2 |
| dft.Calliope 5.6 | 1 | 1% | 4 |
| step.nanoPri 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 103 rounds): 74562 melee ticks, 17653 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (103 rounds): longest scan gap while four or more were alive 41 ticks (103 rounds over 8); rounds whose longest gap at any count was over 8: 103; robots dropped as dead without a death event: 1.

Targeting waves (103 rounds): 24706 sent, 22344 reached their opponent, 3127 virtual hits (14.0% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 381 over 3 battles (127.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 96.5 | 87 / 105 | 1.31 | 21.4% | 17963 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 21.4% | 87 |
| DTF.Kludgy 1.2b | 2.3 | 13.8% | 7 |
| ejb.Polaris 1.0.1 | 3.0 | 12.6% | 6 |
| ne.Chimera 1.2 | 3.7 | 12.6% | 2 |
| vStar.RAFzilla 2.15 | 5.3 | 10.0% | 2 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.8% | 0 |
| kurios.DOSexe .9b | 7.3 | 5.8% | 0 |
| sam.Samspin 1.0 | 8.3 | 5.2% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.0 | 27 / 35 | 5869 |
| 2 | 1 | 72.7 | 97.8 | 30 / 35 | 6063 |
| 3 | 1 | 72.3 | 97.8 | 30 / 35 | 6031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 33 | 85% |
| ejb.Polaris 1.0.1 | 31 | 84% |
| ne.Chimera 1.2 | 18 | 100% |
| vStar.RAFzilla 2.15 | 9 | 78% |
| kurios.DOSexe .9b | 4 | 100% |
| tvv.micro.Antares 1.1.1 | 4 | 100% |

Hadur died in 21 of 105 rounds, at a mean tick of 1145. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 8 | 38% | 37 |
| ejb.Polaris 1.0.1 | 5 | 24% | 28 |
| ne.Chimera 1.2 | 2 | 10% | 21 |
| vStar.RAFzilla 2.15 | 2 | 10% | 7 |
| donjezza.Muncho 1.0 | 1 | 5% | 1 |
| kurios.DOSexe .9b | 0 | 0% | 5 |
| tvv.micro.Antares 1.1.1 | 0 | 0% | 4 |
| sam.Samspin 1.0 | 0 | 0% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 103 rounds): 73493 melee ticks, 35352 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (103 rounds): longest scan gap while four or more were alive 49 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 0.

Targeting waves (103 rounds): 23532 sent, 21173 reached their opponent, 3956 virtual hits (18.7% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 159 over 3 battles (53.0 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 80.6 | 39 / 105 | 2.74 | 16.5% | 12010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 17.0% | 42 |
| hadur117.Hadur 3.20 | 1.7 | 16.5% | 39 |
| cx.mini.Nimrod 0.55 | 3.0 | 13.2% | 12 |
| djc.DynaBot 0.1.1 | 4.0 | 10.2% | 3 |
| rdt199.Warlord 0.73 | 5.3 | 9.2% | 4 |
| br2.MobyDickBot 1.6 | 5.7 | 8.8% | 3 |
| uji.YellohFellah 1.0 | 7.0 | 8.3% | 5 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.2% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.1% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 77.1 | 12 / 35 | 3992 |
| 2 | 2 | 65.7 | 81.6 | 14 / 35 | 4057 |
| 3 | 1 | 65.6 | 83.2 | 13 / 35 | 3961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 29 | 55% |
| cx.mini.Nimrod 0.55 | 13 | 62% |
| uji.YellohFellah 1.0 | 6 | 83% |
| djc.DynaBot 0.1.1 | 6 | 100% |
| rdt199.Warlord 0.73 | 3 | 67% |
| br2.MobyDickBot 1.6 | 2 | 100% |

Hadur died in 67 of 105 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 28 | 42% | 46 |
| cx.mini.Nimrod 0.55 | 13 | 19% | 19 |
| rdt199.Warlord 0.73 | 9 | 13% | 11 |
| uji.YellohFellah 1.0 | 7 | 10% | 10 |
| djc.DynaBot 0.1.1 | 4 | 6% | 11 |
| br2.MobyDickBot 1.6 | 3 | 4% | 5 |
| stelo.MirrorNano 1.3 | 1 | 1% | 2 |
| KiraNL.Chupacabra 0.4 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 102 rounds): 79611 melee ticks, 15890 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (102 rounds): longest scan gap while four or more were alive 41 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 0.

Targeting waves (102 rounds): 25857 sent, 23378 reached their opponent, 3086 virtual hits (13.2% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 175 over 3 battles (58.3 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.6 | 65 / 105 | 2.11 | 18.7% | 12581 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 18.7% | 65 |
| nat.PallasHawk 1.0 | 2.3 | 13.1% | 14 |
| bts.wiki.RipCurl 0.9b | 3.3 | 12.9% | 8 |
| darkcanuck.Leon 1.01 | 3.3 | 12.3% | 9 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.6% | 7 |
| cs.sheldor.Talon 1.1 | 6.3 | 7.8% | 0 |
| jrm.Test0 1.0 | 7.0 | 7.7% | 0 |
| jp.Perpy 16.0 | 7.7 | 6.2% | 0 |
| stuff.Vlad 0.1 | 9.0 | 5.6% | 1 |
| jaybot.bots.Oddball 4.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.6 | 23 / 35 | 4033 |
| 2 | 1 | 66.7 | 82.5 | 18 / 35 | 4285 |
| 3 | 1 | 69.7 | 92.7 | 24 / 35 | 4263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 25 | 76% |
| darkcanuck.Leon 1.01 | 25 | 84% |
| bts.wiki.RipCurl 0.9b | 12 | 92% |
| brainfade.melee.Genghis 0.36 | 7 | 71% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 0% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 42 of 105 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 11 | 26% | 21 |
| nat.PallasHawk 1.0 | 9 | 21% | 28 |
| darkcanuck.Leon 1.01 | 7 | 17% | 30 |
| brainfade.melee.Genghis 0.36 | 7 | 17% | 10 |
| cs.sheldor.Talon 1.1 | 2 | 5% | 6 |
| jrm.Test0 1.0 | 2 | 5% | 3 |
| stuff.Vlad 0.1 | 2 | 5% | 2 |
| jp.Perpy 16.0 | 1 | 2% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 102 rounds): 66929 melee ticks, 17931 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (102 rounds): longest scan gap while four or more were alive 26 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 0.

Targeting waves (102 rounds): 22554 sent, 19999 reached their opponent, 3232 virtual hits (16.2% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 150 over 3 battles (50.0 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 82.9 | 28 / 105 | 2.54 | 16.2% | 12860 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 17.2% | 43 |
| ags.Glacier 0.2.11 | 2.0 | 16.6% | 24 |
| hadur117.Hadur 3.20 | 2.7 | 16.2% | 28 |
| shinh.Entangled 0.3 | 4.3 | 11.7% | 7 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.5% | 3 |
| apc.Colossus2 0.17 | 6.0 | 7.7% | 0 |
| stelo.Wang 1.0 | 7.7 | 6.1% | 0 |
| maribo.FollowFire 1 | 8.0 | 4.8% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.8 | 82.9 | 10 / 35 | 4236 |
| 2 | 2 | 65.5 | 83.5 | 9 / 35 | 4017 |
| 3 | 3 | 66.2 | 82.2 | 9 / 35 | 4607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 35 | 23% |
| ags.Glacier 0.2.11 | 27 | 56% |
| shinh.Entangled 0.3 | 6 | 50% |
| gh.micro.Gruweltje 0.7 | 3 | 67% |

Hadur died in 78 of 105 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 31 | 40% | 42 |
| mn.Combat 3.25.0 | 26 | 33% | 36 |
| shinh.Entangled 0.3 | 8 | 10% | 14 |
| gh.micro.Gruweltje 0.7 | 7 | 9% | 8 |
| maribo.FollowFire 1 | 4 | 5% | 4 |
| stelo.Wang 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 103 rounds): 79478 melee ticks, 24046 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (103 rounds): longest scan gap while four or more were alive 59 ticks (103 rounds over 8); rounds whose longest gap at any count was over 8: 103; robots dropped as dead without a death event: 0.

Targeting waves (103 rounds): 22335 sent, 19795 reached their opponent, 2992 virtual hits (15.1% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 50 over 3 battles (16.7 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 95.2 | 85 / 105 | 1.43 | 21.3% | 17839 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 21.3% | 85 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.4% | 9 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.2% | 10 |
| Lo_Ian.Gandalf_V4 4.0 | 4.0 | 10.3% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.3% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 6.0 | 8.9% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.3 | 7.7% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.5% | 0 |
| pa.Improved 1.0 | 9.0 | 5.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 95.6 | 30 / 35 | 5995 |
| 2 | 1 | 71.0 | 92.4 | 25 / 35 | 5659 |
| 3 | 1 | 73.0 | 97.8 | 30 / 35 | 6185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 48 | 90% |
| catcat20.shape.Theta 0.018 | 36 | 81% |
| sanyi.mikrobi.Roberto 1.0 | 7 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 20 of 105 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 9 | 45% | 29 |
| simonton.micro.Sprout 1.1.3 | 8 | 40% | 52 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 10% | 9 |
| sample.TrackFire 1.0 | 1 | 5% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 0 | 0% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 101 rounds): 70489 melee ticks, 30247 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (101 rounds): longest scan gap while four or more were alive 32 ticks (101 rounds over 8); rounds whose longest gap at any count was over 8: 101; robots dropped as dead without a death event: 2.

Targeting waves (101 rounds): 22094 sent, 19736 reached their opponent, 4717 virtual hits (23.9% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 72 over 3 battles (24.0 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 84.7 | 54 / 105 | 2.38 | 18.4% | 15431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 18.4% | 54 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.6% | 11 |
| emp.Yngwie 1.11 | 3.3 | 12.5% | 22 |
| mld.DustBunny 3.8 | 3.7 | 12.3% | 5 |
| cb.nano.Insomnia 1.0 | 5.0 | 11.2% | 4 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.4% | 8 |
| lambdaxy.TBot 0.1 | 7.0 | 6.6% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.0% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 86.0 | 22 / 35 | 5361 |
| 2 | 1 | 67.1 | 82.9 | 14 / 35 | 5066 |
| 3 | 1 | 68.1 | 85.1 | 18 / 35 | 5004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 18 | 94% |
| emp.Yngwie 1.11 | 16 | 44% |
| mld.DustBunny 3.8 | 11 | 100% |
| cb.nano.Insomnia 1.0 | 10 | 80% |
| kawigi.robot.Girl 1.2 | 9 | 67% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 51 of 105 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 24 | 47% | 40 |
| cb.nano.Insomnia 1.0 | 9 | 18% | 9 |
| kawigi.micro.Shiz 1.1 | 6 | 12% | 22 |
| kawigi.robot.Girl 1.2 | 4 | 8% | 5 |
| lambdaxy.TBot 0.1 | 3 | 6% | 3 |
| mld.DustBunny 3.8 | 2 | 4% | 19 |
| divineomega.TrialBot 0.003 | 2 | 4% | 6 |
| Grystrion.TrackerWO 1.0 | 1 | 2% | 1 |

Posture (Hadur's M records, 104 rounds): 82911 melee ticks, 21703 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (104 rounds): longest scan gap while four or more were alive 58 ticks (104 rounds over 8); rounds whose longest gap at any count was over 8: 104; robots dropped as dead without a death event: 0.

Targeting waves (104 rounds): 26823 sent, 24411 reached their opponent, 4156 virtual hits (17.0% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 44 over 3 battles (14.7 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.5 | 73 / 105 | 1.68 | 21.1% | 18326 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 21.1% | 73 |
| gh.Griezel 0.5.2 | 2.0 | 15.8% | 12 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.6% | 4 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.6% | 14 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.3% | 1 |
| tvv.nano.Polaris 1.2 | 5.7 | 8.6% | 1 |
| stelo.IntrinsicVolatility 1.4 | 7.3 | 6.2% | 0 |
| repositorio.NanoStep 1.0 | 8.0 | 5.3% | 0 |
| asd.Cthulhu 1.3 | 9.3 | 4.5% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 95.2 | 26 / 35 | 6353 |
| 2 | 1 | 73.2 | 96.2 | 28 / 35 | 6366 |
| 3 | 1 | 69.5 | 86.0 | 19 / 35 | 5607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 48 | 83% |
| techdude.forest.FlamingForest 1.1 | 18 | 61% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 94% |
| bvh.fnr.Fenrir 0.36l | 4 | 100% |
| tvv.nano.Polaris 1.2 | 1 | 100% |

Hadur died in 32 of 105 rounds, at a mean tick of 1209. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| techdude.forest.FlamingForest 1.1 | 13 | 41% | 27 |
| gh.Griezel 0.5.2 | 10 | 31% | 50 |
| bvh.fnr.Fenrir 0.36l | 4 | 13% | 7 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3 | 9% | 15 |
| stelo.IntrinsicVolatility 1.4 | 1 | 3% | 1 |
| divineomega.DivineBot 1.9.4.5 | 1 | 3% | 1 |
| repositorio.NanoStep 1.0 | 0 | 0% | 3 |
| tvv.nano.Polaris 1.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 101 rounds): 87399 melee ticks, 34219 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (101 rounds): longest scan gap while four or more were alive 26 ticks (101 rounds over 8); rounds whose longest gap at any count was over 8: 101; robots dropped as dead without a death event: 0.

Targeting waves (101 rounds): 28100 sent, 25756 reached their opponent, 4399 virtual hits (17.1% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 267 over 3 battles (89.0 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.4 | 50 / 105 | 2.31 | 19.0% | 17365 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 19.0% | 50 |
| et.Predator 1.8 | 2.3 | 14.1% | 20 |
| oog.melee.Mercutio 1.0 | 3.3 | 13.2% | 17 |
| cx.BlestPain 1.41 | 3.3 | 12.5% | 17 |
| ahf.NanoAndrew .4 | 5.3 | 10.0% | 1 |
| maribo.melee.BMV 0.1 | 6.0 | 9.1% | 0 |
| nic.Nicator 2.4 | 6.7 | 9.0% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.5% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.3% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 89.8 | 22 / 35 | 6104 |
| 2 | 1 | 67.2 | 79.7 | 9 / 35 | 5777 |
| 3 | 1 | 69.5 | 86.7 | 19 / 35 | 5484 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 35 | 71% |
| cx.BlestPain 1.41 | 18 | 33% |
| oog.melee.Mercutio 1.0 | 18 | 56% |
| ahf.NanoAndrew .4 | 5 | 100% |
| maribo.melee.BMV 0.1 | 2 | 100% |
| nic.Nicator 2.4 | 2 | 50% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 58 of 105 rounds, at a mean tick of 1153. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 19 | 33% | 25 |
| oog.melee.Mercutio 1.0 | 13 | 22% | 25 |
| et.Predator 1.8 | 11 | 19% | 31 |
| ahf.NanoAndrew .4 | 7 | 12% | 12 |
| nic.Nicator 2.4 | 2 | 3% | 4 |
| tex.Longbot 0.4 | 2 | 3% | 2 |
| maribo.melee.BMV 0.1 | 1 | 2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 103 rounds): 85108 melee ticks, 32539 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (103 rounds): longest scan gap while four or more were alive 65 ticks (103 rounds over 8); rounds whose longest gap at any count was over 8: 103; robots dropped as dead without a death event: 0.

Targeting waves (103 rounds): 26956 sent, 24573 reached their opponent, 5155 virtual hits (21.0% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 102 over 3 battles (34.0 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 91.7 | 72 / 105 | 1.74 | 20.2% | 15664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 20.2% | 72 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.6% | 16 |
| uji.DBH 1.1 | 3.3 | 11.3% | 4 |
| agd.Mooserwirt2 2.7 | 3.7 | 11.0% | 4 |
| sigterm.Sigterm 1.0 | 5.7 | 8.9% | 3 |
| ratosh.Nobo 0.21 | 6.3 | 9.0% | 1 |
| spinnercat.Robovirus 2.718 | 6.7 | 8.5% | 1 |
| kawigi.mini.Fhqwhgads 1.1 | 7.3 | 7.3% | 2 |
| stelo.WangRobot 1.0 | 9.3 | 5.5% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 93.7 | 24 / 35 | 5548 |
| 2 | 1 | 68.9 | 87.9 | 22 / 35 | 4916 |
| 3 | 1 | 70.6 | 93.7 | 26 / 35 | 5200 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 27 | 67% |
| agd.Mooserwirt2 2.7 | 19 | 89% |
| uji.DBH 1.1 | 18 | 89% |
| sigterm.Sigterm 1.0 | 9 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 71% |
| spinnercat.Robovirus 2.718 | 4 | 75% |
| ratosh.Nobo 0.21 | 3 | 67% |
| stelo.WangRobot 1.0 | 2 | 100% |

Hadur died in 33 of 105 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 13 | 39% | 36 |
| agd.Mooserwirt2 2.7 | 5 | 15% | 20 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 15% | 10 |
| uji.DBH 1.1 | 4 | 12% | 15 |
| spinnercat.Robovirus 2.718 | 3 | 9% | 7 |
| ratosh.Nobo 0.21 | 2 | 6% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 3% | 2 |
| sigterm.Sigterm 1.0 | 0 | 0% | 8 |
| stelo.WangRobot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 102 rounds): 68062 melee ticks, 22292 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (102 rounds): longest scan gap while four or more were alive 58 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 0.

Targeting waves (102 rounds): 22746 sent, 20259 reached their opponent, 4332 virtual hits (21.4% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 372 over 3 battles (124.0 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.9 | 98.1 | 99 / 105 | 1.17 | 22.7% | 19271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 22.7% | 99 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.2% | 0 |
| mld.Infinity 2.2 | 3.0 | 13.0% | 2 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.6% | 2 |
| erdnis.Rover 0.3 | 5.0 | 10.5% | 1 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.1% | 0 |
| mbh.Mbh 0.1 | 7.3 | 7.2% | 0 |
| pac.ABC 2.1 | 7.7 | 6.8% | 1 |
| pbg.R2D2 1.0 | 9.0 | 5.2% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.1 | 98.4 | 33 / 35 | 6605 |
| 2 | 1 | 73.3 | 96.5 | 32 / 35 | 6132 |
| 3 | 1 | 74.2 | 99.4 | 34 / 35 | 6534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 52 | 100% |
| krillr.mini.JointStrike 2.0.0 | 17 | 88% |
| mld.Infinity 2.2 | 17 | 100% |
| erdnis.Rover 0.3 | 7 | 100% |
| patson.PatsonTestBot 1.0 | 5 | 100% |
| pac.ABC 2.1 | 2 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 9 of 105 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 3 | 33% | 16 |
| davidalves.net.DuelistMiniMelee 1.2 | 1 | 11% | 40 |
| erdnis.Rover 0.3 | 1 | 11% | 12 |
| patson.PatsonTestBot 1.0 | 1 | 11% | 11 |
| mld.Infinity 2.2 | 0 | 0% | 12 |
| pac.ABC 2.1 | 0 | 0% | 3 |
| mbh.Mbh 0.1 | 0 | 0% | 3 |
| pbg.R2D2 1.0 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 101 rounds): 64112 melee ticks, 22631 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (101 rounds): longest scan gap while four or more were alive 33 ticks (101 rounds over 8); rounds whose longest gap at any count was over 8: 101; robots dropped as dead without a death event: 1.

Targeting waves (101 rounds): 21498 sent, 19157 reached their opponent, 4489 virtual hits (23.4% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 263 over 3 battles (87.7 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 92.4 | 71 / 105 | 1.69 | 21.1% | 18806 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 21.1% | 71 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.2% | 19 |
| fwb.Nine 1.0.1 | 3.7 | 11.3% | 3 |
| catcat20.Rabbit 0.001 | 4.0 | 10.9% | 9 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.7% | 3 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 7.8% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 6.0% | 0 |
| bayen.nut.Squirrel 1.615 | 8.0 | 6.3% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.7 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.5 | 23 / 35 | 5970 |
| 2 | 1 | 72.2 | 93.7 | 22 / 35 | 6791 |
| 3 | 1 | 72.0 | 93.0 | 26 / 35 | 6045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 48 | 75% |
| fwb.Nine 1.0.1 | 20 | 100% |
| catcat20.Rabbit 0.001 | 14 | 64% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| nz.jdc.nano.GridFu 1.0 | 3 | 100% |

Hadur died in 36 of 105 rounds, at a mean tick of 1066. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 22 | 61% | 55 |
| catcat20.Rabbit 0.001 | 10 | 28% | 25 |
| fwb.Nine 1.0.1 | 1 | 3% | 9 |
| nz.jdc.nano.GridFu 1.0 | 1 | 3% | 7 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 8 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 102 rounds): 85310 melee ticks, 28835 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (102 rounds): longest scan gap while four or more were alive 34 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 0.

Targeting waves (102 rounds): 26223 sent, 23866 reached their opponent, 5074 virtual hits (21.3% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 3 battles (48.3 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.4 | 70 / 105 | 1.59 | 21.0% | 18260 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 21.0% | 70 |
| eem.EvBot v4.6.16 | 2.0 | 16.6% | 30 |
| dummy.mini.Scimitar 1.01 | 3.3 | 13.4% | 1 |
| cf.RiO.RiOx 4.2.1 | 3.7 | 11.9% | 1 |
| eld.Hmm 1.0 | 5.0 | 8.3% | 3 |
| oa.weak.BotherBot 0.1 | 6.3 | 7.3% | 0 |
| fire219.CatBot 1.0 | 7.0 | 6.5% | 0 |
| PSW.Relentless 0.1 | 7.7 | 6.4% | 0 |
| el.JumpShoot 0.2 | 9.0 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 93.7 | 25 / 35 | 6049 |
| 2 | 1 | 72.7 | 96.2 | 24 / 35 | 6373 |
| 3 | 1 | 70.6 | 90.5 | 21 / 35 | 5838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 69 | 65% |
| dummy.mini.Scimitar 1.01 | 13 | 100% |
| cf.RiO.RiOx 4.2.1 | 8 | 100% |
| eld.Hmm 1.0 | 7 | 57% |

Hadur died in 36 of 105 rounds, at a mean tick of 1343. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 24 | 67% | 57 |
| eld.Hmm 1.0 | 4 | 11% | 11 |
| PSW.Relentless 0.1 | 3 | 8% | 3 |
| dummy.mini.Scimitar 1.01 | 2 | 6% | 24 |
| cf.RiO.RiOx 4.2.1 | 2 | 6% | 9 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 101 rounds): 88414 melee ticks, 44986 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (101 rounds): longest scan gap while four or more were alive 56 ticks (101 rounds over 8); rounds whose longest gap at any count was over 8: 101; robots dropped as dead without a death event: 0.

Targeting waves (101 rounds): 25260 sent, 22961 reached their opponent, 3792 virtual hits (16.5% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 226 over 3 battles (75.3 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 96.0 | 90 / 105 | 1.36 | 22.3% | 19176 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 22.3% | 90 |
| pe.SandboxLump 1.52 | 2.0 | 16.2% | 12 |
| cre.Karolos 0.32 | 3.0 | 13.2% | 1 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.6% | 0 |
| cw.megas.Blade 0.8 | 5.3 | 8.7% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.1% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7.3 | 7.9% | 0 |
| sample.Walls 1.0 | 7.7 | 7.5% | 1 |
| rrh.Iwillfindyou 2.0 | 9.3 | 2.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 95.6 | 31 / 35 | 6532 |
| 2 | 1 | 73.0 | 94.6 | 27 / 35 | 6048 |
| 3 | 1 | 73.8 | 97.8 | 32 / 35 | 6596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 56 | 93% |
| cre.Karolos 0.32 | 24 | 96% |
| stelo.AreaTargetingBot 1.1 | 9 | 100% |
| stelo.RamTrackSurfer 1.2 | 3 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 17 of 105 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cre.Karolos 0.32 | 8 | 47% | 25 |
| pe.SandboxLump 1.52 | 5 | 29% | 47 |
| stelo.AreaTargetingBot 1.1 | 1 | 6% | 8 |
| cw.megas.Blade 0.8 | 1 | 6% | 4 |
| stelo.RamTrackSurfer 1.2 | 0 | 0% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 4 |
| sample.Walls 1.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 102 rounds): 60456 melee ticks, 25505 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (102 rounds): longest scan gap while four or more were alive 63 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 0.

Targeting waves (102 rounds): 19327 sent, 17004 reached their opponent, 5262 virtual hits (30.9% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 355 over 3 battles (118.3 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.3 | 42 / 105 | 2.41 | 17.4% | 13123 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 17.4% | 42 |
| rz.GlowBlowMelee 1.4 | 2.0 | 15.0% | 25 |
| davidalves.Phoenix 0.54 | 3.3 | 12.8% | 15 |
| florent.XSeries.X2 0.12 | 4.0 | 12.7% | 11 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.7% | 9 |
| oog.melee.Corsair 1.0 | 6.0 | 9.3% | 4 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 6.4% | 0 |
| lunchie.Lunchbox 0.93 | 8.0 | 5.4% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 4.9% | 0 |
| evd.X1 0.01 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.3 | 18 / 35 | 4363 |
| 2 | 1 | 67.1 | 86.0 | 14 / 35 | 4415 |
| 3 | 1 | 65.3 | 79.7 | 10 / 35 | 4345 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 32 | 50% |
| florent.XSeries.X2 0.12 | 13 | 54% |
| davidalves.Phoenix 0.54 | 12 | 58% |
| pedersen.Ugluk 1.1.1 | 7 | 86% |
| oog.melee.Corsair 1.0 | 4 | 50% |
| stelo.SoJNanoMelee 1.1 | 3 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 67 of 105 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 22 | 33% | 40 |
| davidalves.Phoenix 0.54 | 13 | 19% | 17 |
| florent.XSeries.X2 0.12 | 11 | 16% | 22 |
| oog.melee.Corsair 1.0 | 9 | 13% | 13 |
| pedersen.Ugluk 1.1.1 | 5 | 7% | 7 |
| stelo.SoJNanoMelee 1.1 | 1 | 1% | 3 |
| evd.X1 0.01 | 1 | 1% | 1 |
| as.FrankTheTank 1.3 | 1 | 1% | 1 |
| lunchie.Lunchbox 0.93 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 104 rounds): 72347 melee ticks, 23409 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (104 rounds): longest scan gap while four or more were alive 42 ticks (104 rounds over 8); rounds whose longest gap at any count was over 8: 104; robots dropped as dead without a death event: 0.

Targeting waves (104 rounds): 23563 sent, 20948 reached their opponent, 3778 virtual hits (18.0% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 378 over 3 battles (126.0 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.7 | 76 / 105 | 1.92 | 19.4% | 12727 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 19.4% | 76 |
| voidious.mini.BrokenSword 2.0.3 | 2.0 | 13.6% | 6 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 12.7% | 6 |
| jdw.Hurricane 1.4 | 3.7 | 12.3% | 9 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 10.5% | 5 |
| ds.Oo 2.2 | 6.7 | 8.1% | 2 |
| awesomeness.Elite 1.0 | 6.7 | 7.0% | 0 |
| adt.Ar2 1.1 | 8.0 | 6.3% | 0 |
| gjr.Cephalosporin 0.1 | 8.3 | 6.0% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.0 | 23 / 35 | 4041 |
| 2 | 1 | 69.1 | 88.3 | 25 / 35 | 4259 |
| 3 | 1 | 70.8 | 94.0 | 28 / 35 | 4427 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 28 | 86% |
| jdw.Hurricane 1.4 | 19 | 95% |
| voidious.micro.BlitzBat 1.05 | 18 | 100% |
| gre.svman4.Morfeas 1.4.1 | 7 | 71% |
| awesomeness.Elite 1.0 | 4 | 100% |
| ds.Oo 2.2 | 4 | 75% |
| amk.ChumbaMini 0.2 | 2 | 100% |
| adt.Ar2 1.1 | 1 | 100% |

Hadur died in 32 of 105 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 6 | 19% | 22 |
| jdw.Hurricane 1.4 | 6 | 19% | 21 |
| gre.svman4.Morfeas 1.4.1 | 5 | 16% | 15 |
| ds.Oo 2.2 | 5 | 16% | 11 |
| voidious.micro.BlitzBat 1.05 | 4 | 13% | 20 |
| awesomeness.Elite 1.0 | 2 | 6% | 5 |
| amk.ChumbaMini 0.2 | 1 | 3% | 2 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 6 |
| adt.Ar2 1.1 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 102 rounds): 63403 melee ticks, 16264 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 22 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (102 rounds): longest scan gap while four or more were alive 22 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 1.

Targeting waves (102 rounds): 22488 sent, 20089 reached their opponent, 3440 virtual hits (17.1% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 344 over 3 battles (114.7 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 92.9 | 73 / 105 | 1.64 | 21.4% | 20360 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 21.4% | 73 |
| ak.Fermat 2.0 | 2.0 | 14.7% | 15 |
| lrem.Spectre 0.4.4 | 3.7 | 11.9% | 4 |
| shu.nitro.LENIN .T34 | 4.0 | 11.9% | 9 |
| js.PinBall 1.6 | 4.3 | 11.2% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.2% | 0 |
| gh.mini.GrubbmOne 1.0 | 7.3 | 7.3% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 7.7 | 6.8% | 0 |
| sample.SpinBot 1.0 | 9.0 | 4.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 94.6 | 28 / 35 | 6795 |
| 2 | 1 | 72.2 | 92.1 | 25 / 35 | 6868 |
| 3 | 1 | 71.9 | 92.1 | 20 / 35 | 6697 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 32 | 66% |
| shu.nitro.LENIN .T34 | 22 | 82% |
| lrem.Spectre 0.4.4 | 21 | 95% |
| js.PinBall 1.6 | 11 | 91% |
| jaybot.adv.bots.JayBot 2.0 | 4 | 100% |

Hadur died in 35 of 105 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 16 | 46% | 34 |
| shu.nitro.LENIN .T34 | 8 | 23% | 30 |
| lrem.Spectre 0.4.4 | 3 | 9% | 22 |
| js.PinBall 1.6 | 3 | 9% | 12 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 3% | 2 |
| gh.mini.GrubbmOne 1.0 | 1 | 3% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 103 rounds): 78337 melee ticks, 25384 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 18 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (103 rounds): longest scan gap while four or more were alive 18 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 0.

Targeting waves (103 rounds): 25486 sent, 23095 reached their opponent, 5703 virtual hits (24.7% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 291 over 3 battles (97.0 per battle, most in one battle 106). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 82.5 | 67 / 105 | 2.57 | 19.1% | 16455 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.3 | 19.1% | 67 |
| mk.Alpha 0.2.1 | 1.7 | 15.4% | 24 |
| EH.Eagle 1.0.6 | 3.0 | 11.9% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 4.3 | 9.8% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 9.0% | 0 |
| throxbot.ThroxBot 0.1 | 6.7 | 7.9% | 1 |
| wee.Gem 1.8.4 | 7.0 | 8.2% | 2 |
| caimano.Furia_Ceca 0.22 | 7.3 | 7.3% | 0 |
| joe.ADinosaur 1.0 | 8.0 | 7.2% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 95.2 | 25 / 35 | 5267 |
| 2 | 2 | 61.3 | 57.5 | 12 / 35 | 4997 |
| 3 | 1 | 72.6 | 94.9 | 30 / 35 | 6191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 50 | 86% |
| EH.Eagle 1.0.6 | 13 | 100% |
| wee.Gem 1.8.4 | 3 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 3 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 41 of 105 rounds, at a mean tick of 612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| EH.Eagle 1.0.6 | 12 | 29% | 23 |
| mk.Alpha 0.2.1 | 9 | 22% | 39 |
| cs.Grudge 1.0 | 9 | 22% | 10 |
| sheldor.melee.nano.TestMelee 0.1 | 2 | 5% | 8 |
| throxbot.ThroxBot 0.1 | 2 | 5% | 3 |
| wee.Gem 1.8.4 | 1 | 2% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 6 |
| joe.ADinosaur 1.0 | 1 | 2% | 5 |
| caimano.Furia_Ceca 0.22 | 1 | 2% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 104 rounds): 65138 melee ticks, 17936 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (104 rounds): longest scan gap while four or more were alive 59 ticks (104 rounds over 8); rounds whose longest gap at any count was over 8: 104; robots dropped as dead without a death event: 0.

Targeting waves (104 rounds): 21073 sent, 18738 reached their opponent, 4745 virtual hits (25.3% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 313 over 3 battles (104.3 per battle, most in one battle 113). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 87.6 | 68 / 105 | 2.11 | 18.5% | 12600 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 18.5% | 68 |
| kid.test.NightFox .2 | 2.0 | 14.3% | 10 |
| uji.Antique 1.0 | 3.0 | 11.7% | 12 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.7% | 6 |
| qohnil.blot.BlotBot 3.61 | 4.7 | 10.6% | 6 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.3% | 0 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.3% | 1 |
| matt.advanced.Katana 1.0 | 8.3 | 6.5% | 2 |
| stelo.Lifestealer 1.0 | 8.7 | 5.9% | 0 |
| stelo.PianistNano 1.2 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.3 | 19 / 35 | 4441 |
| 2 | 1 | 68.8 | 88.9 | 26 / 35 | 4379 |
| 3 | 1 | 67.4 | 87.6 | 23 / 35 | 3780 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 30 | 90% |
| uji.Antique 1.0 | 22 | 86% |
| pfvicm.Sobieski 7.2.3b | 7 | 57% |
| qohnil.blot.BlotBot 3.61 | 7 | 86% |
| amk.ChumbaWumba 0.3 | 7 | 100% |
| ahr.ice.Ice 1.0.2 | 5 | 80% |
| matt.advanced.Katana 1.0 | 2 | 50% |

Hadur died in 40 of 105 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 10 | 25% | 33 |
| uji.Antique 1.0 | 7 | 18% | 21 |
| pfvicm.Sobieski 7.2.3b | 7 | 18% | 11 |
| amk.ChumbaWumba 0.3 | 4 | 10% | 8 |
| qohnil.blot.BlotBot 3.61 | 3 | 8% | 14 |
| ahr.ice.Ice 1.0.2 | 3 | 8% | 8 |
| matt.advanced.Katana 1.0 | 2 | 5% | 4 |
| stelo.PianistNano 1.2 | 1 | 3% | 3 |
| stelo.Lifestealer 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 102 rounds): 63756 melee ticks, 18161 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (102 rounds): longest scan gap while four or more were alive 74 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 0.

Targeting waves (102 rounds): 21552 sent, 19178 reached their opponent, 2766 virtual hits (14.4% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 7 other Robocode JVMs running (hadur.bench.MeleeRunner x7), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 326 over 3 battles (108.7 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.1 | 60 / 105 | 1.90 | 19.8% | 14872 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 19.8% | 60 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.0% | 20 |
| deewiant.Anomaly 0.2 | 2.7 | 14.4% | 19 |
| myl.micro.Troodon 1.10 | 4.0 | 11.3% | 3 |
| jok.PheonixM 0.1.2 | 5.0 | 10.6% | 0 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.1% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.6% | 0 |
| DBall.Anarchy 0.1 | 7.7 | 6.2% | 3 |
| ap.Frederick 1.1 | 9.3 | 4.2% | 0 |
| jangs.ns51 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.4 | 20 / 35 | 4967 |
| 2 | 1 | 69.8 | 87.9 | 18 / 35 | 5107 |
| 3 | 1 | 70.2 | 89.8 | 22 / 35 | 4798 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 34 | 59% |
| zyx.mega.YersiniaPestis 3.1 | 30 | 57% |
| jok.PheonixM 0.1.2 | 9 | 100% |
| myl.micro.Troodon 1.10 | 9 | 89% |
| ap.Frederick 1.1 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 48 of 105 rounds, at a mean tick of 1138. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 19 | 40% | 42 |
| zyx.mega.YersiniaPestis 3.1 | 18 | 38% | 33 |
| myl.micro.Troodon 1.10 | 4 | 8% | 11 |
| DBall.Anarchy 0.1 | 2 | 4% | 3 |
| jok.PheonixM 0.1.2 | 1 | 2% | 13 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 2% | 2 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 103 rounds): 84360 melee ticks, 32630 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (103 rounds): longest scan gap while four or more were alive 26 ticks (103 rounds over 8); rounds whose longest gap at any count was over 8: 103; robots dropped as dead without a death event: 0.

Targeting waves (103 rounds): 27393 sent, 24965 reached their opponent, 3847 virtual hits (15.4% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 365 over 3 battles (121.7 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 78.9 | 28 / 105 | 2.90 | 16.1% | 12680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.3 | 16.1% | 28 |
| catcat20.Matcha 0.006 | 1.7 | 14.6% | 29 |
| darkcanuck.B26354 1.06 | 3.3 | 13.1% | 20 |
| stelo.PastFuture 2.3.2 | 4.0 | 12.8% | 11 |
| oog.melee.Capulet 1.2 | 4.7 | 11.7% | 11 |
| intruder.PrairieWolf 2.61 | 6.7 | 8.7% | 3 |
| fowl3628800.LightningBolt 2.6.0 | 7.3 | 7.2% | 2 |
| tripphippy.Alice 1.1 | 7.3 | 7.0% | 1 |
| ntc.Opposite 1.5 | 8.7 | 6.4% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.9 | 12 / 35 | 4475 |
| 2 | 2 | 60.6 | 69.2 | 6 / 35 | 3688 |
| 3 | 1 | 65.9 | 79.7 | 10 / 35 | 4517 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 21 | 48% |
| darkcanuck.B26354 1.06 | 14 | 36% |
| oog.melee.Capulet 1.2 | 8 | 38% |
| stelo.PastFuture 2.3.2 | 8 | 50% |
| tripphippy.Alice 1.1 | 4 | 75% |
| intruder.PrairieWolf 2.61 | 3 | 33% |
| ntc.Opposite 1.5 | 1 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |

Hadur died in 80 of 105 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 19 | 24% | 29 |
| darkcanuck.B26354 1.06 | 15 | 19% | 21 |
| oog.melee.Capulet 1.2 | 14 | 18% | 18 |
| stelo.PastFuture 2.3.2 | 14 | 18% | 18 |
| ntc.Opposite 1.5 | 4 | 5% | 5 |
| tripphippy.Alice 1.1 | 4 | 5% | 5 |
| intruder.PrairieWolf 2.61 | 4 | 5% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 3 | 4% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 102 rounds): 77775 melee ticks, 17181 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (102 rounds): longest scan gap while four or more were alive 49 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 1.

Targeting waves (102 rounds): 25231 sent, 22774 reached their opponent, 3807 virtual hits (16.7% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 332 over 3 battles (110.7 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 81.3 | 40 / 105 | 2.69 | 16.5% | 11479 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 16.6% | 30 |
| hadur117.Hadur 3.20 | 1.7 | 16.5% | 40 |
| gh.mini.Griezel 0.2 | 3.0 | 13.0% | 22 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.5% | 7 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 11.0% | 3 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.2% | 3 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.2% | 0 |
| fm.mammillarias 1.3 | 8.3 | 5.7% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.4% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 83.5 | 13 / 35 | 3908 |
| 2 | 1 | 66.3 | 84.8 | 14 / 35 | 4016 |
| 3 | 2 | 63.5 | 75.6 | 13 / 35 | 3555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 27 | 67% |
| gh.mini.Griezel 0.2 | 21 | 43% |
| d414.nano.Quantum 1.0.0 | 12 | 67% |
| spinnercat.micro.Tyger 0.1 | 4 | 75% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |

Hadur died in 68 of 105 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 20 | 29% | 30 |
| abc.Shadow 3.84i | 18 | 26% | 33 |
| d414.nano.Quantum 1.0.0 | 12 | 18% | 20 |
| spinnercat.micro.Tyger 0.1 | 6 | 9% | 10 |
| fm.mammillarias 1.3 | 5 | 7% | 5 |
| timmit.nano.TimDog 0.33 | 2 | 3% | 2 |
| gh.nano.Grofvuil 0.2 | 1 | 1% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 103 rounds): 77199 melee ticks, 20222 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (103 rounds): longest scan gap while four or more were alive 40 ticks (103 rounds over 8); rounds whose longest gap at any count was over 8: 103; robots dropped as dead without a death event: 0.

Targeting waves (103 rounds): 24671 sent, 22279 reached their opponent, 3615 virtual hits (16.2% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 324 over 3 battles (108.0 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 89.4 | 67 / 105 | 1.95 | 19.0% | 14433 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 19.0% | 67 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.5% | 28 |
| apc.botM 3.0 | 3.7 | 10.8% | 1 |
| vjik.UnViolation 1.1 | 4.3 | 9.5% | 3 |
| lxx.ConceptA 0.8 | 4.7 | 9.9% | 3 |
| bayen.UbaMicro 1.4 | 5.3 | 8.9% | 0 |
| panzer.Panzer 0.2 | 7.0 | 7.7% | 0 |
| conscience.Electron 1.3g | 8.3 | 6.9% | 0 |
| yk.JahMicro 1.0 | 9.0 | 6.4% | 1 |
| donjezza.Jezza 1.0 | 9.7 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 83.8 | 19 / 35 | 4669 |
| 2 | 1 | 69.4 | 93.7 | 23 / 35 | 4959 |
| 3 | 1 | 69.1 | 90.8 | 25 / 35 | 4805 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 47 | 70% |
| apc.botM 3.0 | 11 | 91% |
| yk.JahMicro 1.0 | 6 | 100% |
| lxx.ConceptA 0.8 | 6 | 67% |
| vjik.UnViolation 1.1 | 5 | 100% |
| donjezza.Jezza 1.0 | 4 | 75% |
| bayen.UbaMicro 1.4 | 3 | 100% |
| panzer.Panzer 0.2 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 41 of 105 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 18 | 44% | 45 |
| apc.botM 3.0 | 7 | 17% | 21 |
| lxx.ConceptA 0.8 | 5 | 12% | 6 |
| vjik.UnViolation 1.1 | 4 | 10% | 13 |
| bayen.UbaMicro 1.4 | 1 | 2% | 6 |
| donjezza.Jezza 1.0 | 1 | 2% | 4 |
| conscience.Electron 1.3g | 1 | 2% | 3 |
| panzer.Panzer 0.2 | 1 | 2% | 1 |
| yk.JahMicro 1.0 | 0 | 0% | 6 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 102 rounds): 61971 melee ticks, 29864 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (102 rounds): longest scan gap while four or more were alive 57 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 0.

Targeting waves (102 rounds): 21011 sent, 18593 reached their opponent, 3460 virtual hits (18.6% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 380 over 3 battles (126.7 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 89.6 | 56 / 105 | 1.93 | 19.6% | 15397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 19.6% | 56 |
| maribo.Quester 0.3 | 2.3 | 15.9% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.5% | 15 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.4% | 7 |
| labg.Cataclysm 2.05 | 4.7 | 10.3% | 6 |
| baal.nano.N 1.42 | 6.7 | 8.0% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 7.6% | 0 |
| zyx.micro.Ant 1.1 | 8.0 | 5.4% | 0 |
| sanja.First 0.1 | 8.7 | 4.8% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 92.1 | 20 / 35 | 5235 |
| 2 | 1 | 69.4 | 87.0 | 18 / 35 | 4944 |
| 3 | 1 | 70.2 | 89.8 | 18 / 35 | 5218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 30 | 73% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 62% |
| gre.svman4.Leonidas 1.3.2 | 13 | 77% |
| labg.Cataclysm 2.05 | 9 | 44% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 100% |

Hadur died in 52 of 105 rounds, at a mean tick of 1125. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 16 | 31% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 27% | 30 |
| gre.svman4.Leonidas 1.3.2 | 13 | 25% | 19 |
| labg.Cataclysm 2.05 | 5 | 10% | 11 |
| kinsen.melee.Angsaichmophobia 1.8c | 1 | 2% | 4 |
| baal.nano.N 1.42 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 102 rounds): 90026 melee ticks, 29377 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (102 rounds): longest scan gap while four or more were alive 41 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 0.

Targeting waves (102 rounds): 28274 sent, 25896 reached their opponent, 3841 virtual hits (14.8% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 40 over 3 battles (13.3 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.3 | 45 / 105 | 2.23 | 18.5% | 16063 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 18.5% | 45 |
| kid.Gladiator .7.2 | 2.3 | 16.7% | 27 |
| stelo.Spread 0.9 | 2.7 | 15.8% | 23 |
| jcs.Seth 1.8 | 4.0 | 12.1% | 8 |
| tcf.Reach 3 | 5.3 | 9.5% | 1 |
| cli.Dancer 1.1 | 5.7 | 9.1% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.8% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.4% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 83.2 | 13 / 35 | 5349 |
| 2 | 1 | 69.0 | 86.7 | 15 / 35 | 5063 |
| 3 | 1 | 70.2 | 89.2 | 17 / 35 | 5651 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 32 | 66% |
| stelo.Spread 0.9 | 29 | 55% |
| jcs.Seth 1.8 | 11 | 64% |
| tcf.Reach 3 | 1 | 100% |

Hadur died in 60 of 105 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 25 | 42% | 40 |
| stelo.Spread 0.9 | 22 | 37% | 39 |
| jcs.Seth 1.8 | 4 | 7% | 12 |
| tcf.Reach 3 | 3 | 5% | 6 |
| ratosh.Wesco 1.4 | 3 | 5% | 4 |
| cli.Dancer 1.1 | 2 | 3% | 2 |
| sample.RamFire 1.0 | 1 | 2% | 1 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |

Posture (Hadur's M records, 102 rounds): 82129 melee ticks, 30560 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (102 rounds): longest scan gap while four or more were alive 32 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 0.

Targeting waves (102 rounds): 25635 sent, 23259 reached their opponent, 3812 virtual hits (16.4% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 281 over 3 battles (93.7 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 84.0 | 29 / 105 | 2.44 | 16.6% | 11748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 18.9% | 61 |
| hadur117.Hadur 3.20 | 2.0 | 16.6% | 29 |
| gh.mini.Gruwel 0.9 | 3.7 | 12.8% | 7 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 11.8% | 6 |
| rz.HawkOnFire 0.1 | 4.3 | 11.4% | 2 |
| wit.Chuliath 1.0 | 6.7 | 6.4% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 6.2% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.3 | 6.2% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 87.3 | 8 / 35 | 3567 |
| 2 | 2 | 66.8 | 83.5 | 13 / 35 | 4318 |
| 3 | 2 | 65.0 | 81.3 | 8 / 35 | 3863 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 36 | 19% |
| gh.mini.Gruwel 0.9 | 13 | 69% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 73% |
| rz.HawkOnFire 0.1 | 5 | 100% |

Hadur died in 78 of 105 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 47 | 60% | 54 |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 13% | 20 |
| gh.mini.Gruwel 0.9 | 8 | 10% | 16 |
| rz.HawkOnFire 0.1 | 7 | 9% | 10 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 4% | 3 |
| wit.Chuliath 1.0 | 1 | 1% | 1 |
| myl.nano.KomoriNinja 1.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 103 rounds): 75951 melee ticks, 22066 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (103 rounds): longest scan gap while four or more were alive 33 ticks (103 rounds over 8); rounds whose longest gap at any count was over 8: 103; robots dropped as dead without a death event: 0.

Targeting waves (103 rounds): 23071 sent, 20587 reached their opponent, 3234 virtual hits (15.7% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 148 over 3 battles (49.3 per battle, most in one battle 108). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 96.6 | 87 / 105 | 1.30 | 21.8% | 16847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 21.8% | 87 |
| alpha.RainingFire 1.0 | 2.3 | 12.6% | 3 |
| bzdp.Pansy 2.1 | 2.7 | 12.3% | 6 |
| mz.Cork 0.1 | 5.0 | 10.3% | 2 |
| m3thos.Eva02 0.7.1 | 5.3 | 9.7% | 3 |
| bvh.micro.Freya 0.3 | 5.3 | 10.3% | 4 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.5% | 0 |
| dl.BetterWalls 1.0 | 8.0 | 5.4% | 0 |
| squidM.TentalceMeleeNano 1.1 | 9.0 | 4.8% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 98.4 | 31 / 35 | 5537 |
| 2 | 1 | 72.5 | 96.8 | 29 / 35 | 5833 |
| 3 | 1 | 71.6 | 94.6 | 27 / 35 | 5477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| alpha.RainingFire 1.0 | 25 | 92% |
| bzdp.Pansy 2.1 | 22 | 91% |
| bvh.micro.Freya 0.3 | 16 | 88% |
| mz.Cork 0.1 | 13 | 85% |
| bvh.mini.Fenrir 0.39 | 10 | 100% |
| m3thos.Eva02 0.7.1 | 8 | 75% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 21 of 105 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 5 | 24% | 28 |
| m3thos.Eva02 0.7.1 | 4 | 19% | 14 |
| bvh.micro.Freya 0.3 | 3 | 14% | 14 |
| bvh.mini.Fenrir 0.39 | 3 | 14% | 9 |
| alpha.RainingFire 1.0 | 2 | 10% | 22 |
| mz.Cork 0.1 | 2 | 10% | 14 |
| sample.MyFirstRobot 1.0 | 1 | 5% | 1 |
| dl.BetterWalls 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 102 rounds): 73878 melee ticks, 23049 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (102 rounds): longest scan gap while four or more were alive 64 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 0.

Targeting waves (102 rounds): 25271 sent, 22938 reached their opponent, 4646 virtual hits (20.3% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 80 over 3 battles (26.7 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 93.1 | 87 / 105 | 1.62 | 20.3% | 17274 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 20.3% | 87 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.3 | 10.4% | 0 |
| EBBU.Sim2 1.02 | 3.7 | 10.0% | 3 |
| stelo.UntouchableNano 1.3 | 4.3 | 9.3% | 7 |
| germ.TheMind .2 | 4.3 | 9.4% | 2 |
| agrach.Dalek 1.0 | 6.3 | 8.9% | 0 |
| lmk.ACPFinal 0.1 | 7.3 | 8.5% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 7.7 | 8.2% | 0 |
| mb.Beast 0.1 | 8.3 | 7.7% | 1 |
| skm.Ryubot 1.0 | 9.7 | 7.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 94.6 | 30 / 35 | 5713 |
| 2 | 1 | 69.8 | 92.1 | 28 / 35 | 6145 |
| 3 | 1 | 69.5 | 92.7 | 29 / 35 | 5416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 16 | 100% |
| stelo.UntouchableNano 1.3 | 15 | 80% |
| agrach.Dalek 1.0 | 14 | 100% |
| EBBU.Sim2 1.02 | 12 | 92% |
| germ.TheMind .2 | 11 | 100% |
| lmk.ACPFinal 0.1 | 10 | 90% |
| skm.Ryubot 1.0 | 9 | 89% |
| mb.Beast 0.1 | 6 | 100% |

Hadur died in 18 of 105 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 4 | 22% | 5 |
| stelo.UntouchableNano 1.3 | 3 | 17% | 12 |
| EBBU.Sim2 1.02 | 3 | 17% | 9 |
| agrach.Dalek 1.0 | 2 | 11% | 24 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2 | 11% | 21 |
| mb.Beast 0.1 | 2 | 11% | 9 |
| lmk.ACPFinal 0.1 | 1 | 6% | 10 |
| skm.Ryubot 1.0 | 1 | 6% | 2 |
| germ.TheMind .2 | 0 | 0% | 9 |

Posture (Hadur's M records, 103 rounds): 49088 melee ticks, 13899 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (103 rounds): longest scan gap while four or more were alive 35 ticks (103 rounds over 8); rounds whose longest gap at any count was over 8: 103; robots dropped as dead without a death event: 2.

Targeting waves (103 rounds): 16627 sent, 14338 reached their opponent, 4155 virtual hits (29.0% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 370 over 3 battles (123.3 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 90.1 | 57 / 105 | 1.90 | 18.8% | 14243 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 18.8% | 57 |
| justin.Mallais 14.0 | 2.3 | 15.9% | 27 |
| bvh.mini.Freya 0.55 | 2.7 | 12.8% | 5 |
| bts.mega.Gnarly 1.4 | 4.7 | 10.7% | 9 |
| cs.Wren 1.0 | 5.0 | 10.1% | 1 |
| kdf.KoulDestroyer 1.0 | 5.3 | 9.8% | 4 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.3 | 7.9% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.3% | 2 |
| matt.UnderDark3 2.4.34 | 8.7 | 4.2% | 0 |
| bzdp.BoxCar 2.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.7 | 20 / 35 | 5009 |
| 2 | 1 | 68.2 | 88.3 | 18 / 35 | 4633 |
| 3 | 1 | 68.8 | 90.2 | 19 / 35 | 4601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 43 | 67% |
| bts.mega.Gnarly 1.4 | 16 | 63% |
| bvh.mini.Freya 0.55 | 8 | 88% |
| cs.Wren 1.0 | 7 | 86% |
| kdf.KoulDestroyer 1.0 | 5 | 40% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 67% |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 100% |

Hadur died in 52 of 105 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 19 | 37% | 44 |
| bts.mega.Gnarly 1.4 | 10 | 19% | 18 |
| bvh.mini.Freya 0.55 | 7 | 13% | 15 |
| kdf.KoulDestroyer 1.0 | 6 | 12% | 10 |
| cs.Wren 1.0 | 3 | 6% | 8 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 4% | 4 |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 2% | 3 |
| matt.UnderDark3 2.4.34 | 1 | 2% | 2 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 102 rounds): 68409 melee ticks, 23965 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (102 rounds): longest scan gap while four or more were alive 30 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 1.

Targeting waves (102 rounds): 22870 sent, 20254 reached their opponent, 4265 virtual hits (21.1% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 375 over 3 battles (125.0 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 89.6 | 59 / 105 | 1.93 | 19.3% | 16139 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 19.3% | 59 |
| bvh.fry.Freya 0.82 | 2.3 | 14.2% | 7 |
| az.Ololobot 0.2.4 | 2.7 | 13.3% | 23 |
| catcat20.Lambda 0.024 | 4.0 | 11.1% | 12 |
| apollokidd.ApolloKidd 0.9 | 6.0 | 7.9% | 0 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.5% | 1 |
| gimp.GimpBot 0.1 | 6.3 | 8.2% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.7 | 6.9% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.8% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 90.2 | 20 / 35 | 5615 |
| 2 | 1 | 69.3 | 90.5 | 23 / 35 | 5220 |
| 3 | 1 | 68.5 | 88.3 | 16 / 35 | 5304 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 33 | 67% |
| catcat20.Lambda 0.024 | 22 | 50% |
| bvh.fry.Freya 0.82 | 22 | 82% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| gimp.GimpBot 0.1 | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |

Hadur died in 49 of 105 rounds, at a mean tick of 1134. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 17 | 35% | 41 |
| catcat20.Lambda 0.024 | 15 | 31% | 23 |
| bvh.fry.Freya 0.82 | 11 | 22% | 28 |
| gimp.GimpBot 0.1 | 1 | 2% | 4 |
| stelo.SoRobotNanoMelee 1.2 | 1 | 2% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 2% | 1 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 3 |
| apollokidd.ApolloKidd 0.9 | 0 | 0% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 102 rounds): 83281 melee ticks, 32192 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (102 rounds): longest scan gap while four or more were alive 48 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 0.

Targeting waves (102 rounds): 26282 sent, 23820 reached their opponent, 4120 virtual hits (17.3% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 249 over 3 battles (83.0 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.1 | 51 / 105 | 2.07 | 18.6% | 14271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 18.6% | 51 |
| eem.EvBotNG v12.8 | 2.0 | 16.6% | 35 |
| ary.Swarm 1.1 | 3.3 | 13.3% | 7 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.3% | 7 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.8% | 6 |
| shrub.Silver v048 | 6.0 | 8.6% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.2% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 5.5% | 0 |
| stelo.Mirror 1.1 | 9.0 | 4.7% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.3 | 17 / 35 | 4922 |
| 2 | 1 | 68.8 | 88.3 | 17 / 35 | 4543 |
| 3 | 1 | 69.2 | 88.9 | 17 / 35 | 4806 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 50 | 52% |
| ary.Swarm 1.1 | 11 | 91% |
| lessonz.robocode.Oz 0.5.0 | 8 | 88% |
| simonton.nano.MeleeSeed 1.8 | 6 | 83% |
| shrub.Silver v048 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 57 of 105 rounds, at a mean tick of 1039. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 31 | 54% | 57 |
| lessonz.robocode.Oz 0.5.0 | 8 | 14% | 14 |
| simonton.nano.MeleeSeed 1.8 | 7 | 12% | 13 |
| ary.Swarm 1.1 | 6 | 11% | 19 |
| shrub.Silver v048 | 1 | 2% | 1 |
| zyx.nano.Ant 1.1 | 1 | 2% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 101 rounds): 77482 melee ticks, 30848 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (101 rounds): longest scan gap while four or more were alive 72 ticks (101 rounds over 8); rounds whose longest gap at any count was over 8: 101; robots dropped as dead without a death event: 0.

Targeting waves (101 rounds): 25101 sent, 22584 reached their opponent, 3460 virtual hits (15.3% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 327 over 3 battles (109.0 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.7 | 71 / 105 | 1.74 | 20.6% | 17896 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 20.6% | 71 |
| wompi.Wallaby 5.1 | 2.0 | 15.6% | 20 |
| ara.Shera 0.88 | 3.3 | 13.5% | 10 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.2% | 3 |
| amz.NanoClone 1.41 | 5.0 | 8.2% | 0 |
| dsw.StaticD 1.0 | 6.0 | 7.1% | 1 |
| stelo.MirrorMicro 1.0 | 7.3 | 6.2% | 0 |
| maribo.IotaCT 1.1 | 7.7 | 6.1% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 89.2 | 22 / 35 | 5517 |
| 2 | 1 | 71.4 | 92.1 | 24 / 35 | 6152 |
| 3 | 1 | 71.8 | 94.0 | 25 / 35 | 6227 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 47 | 85% |
| maribo.mini.MiniQuester 0.1 | 21 | 86% |
| ara.Shera 0.88 | 16 | 69% |
| dsw.StaticD 1.0 | 2 | 100% |

Hadur died in 37 of 105 rounds, at a mean tick of 986. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 13 | 35% | 50 |
| ara.Shera 0.88 | 10 | 27% | 22 |
| maribo.mini.MiniQuester 0.1 | 8 | 22% | 26 |
| amz.NanoClone 1.41 | 2 | 5% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 3% | 1 |
| dsw.StaticD 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 102 rounds): 82462 melee ticks, 28450 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (102 rounds): longest scan gap while four or more were alive 25 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 1.

Targeting waves (102 rounds): 26027 sent, 23676 reached their opponent, 4615 virtual hits (19.5% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 352 over 3 battles (117.3 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 81.0 | 19 / 105 | 2.71 | 16.1% | 12458 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.1% | 68 |
| hadur117.Hadur 3.20 | 2.0 | 16.1% | 19 |
| brainfade.melee.Dusk 0.44 | 3.0 | 13.2% | 13 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.8% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 10.8% | 0 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.5% | 0 |
| mz.NanoGod 2.02 | 7.0 | 7.9% | 1 |
| jab.DiamondStealer 5 | 8.0 | 7.0% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.5% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.4 | 80.6 | 5 / 35 | 4343 |
| 2 | 2 | 65.6 | 79.0 | 9 / 35 | 3812 |
| 3 | 2 | 67.0 | 83.2 | 5 / 35 | 4303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 37 | 16% |
| brainfade.melee.Dusk 0.44 | 18 | 44% |
| dummy.micro.Sparrow 2.5 | 7 | 43% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 100% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 89 of 105 rounds, at a mean tick of 1019. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 47 | 53% | 54 |
| brainfade.melee.Dusk 0.44 | 14 | 16% | 21 |
| dummy.micro.Sparrow 2.5 | 14 | 16% | 16 |
| wcsv.melee.EngineerMelee 0.1 | 6 | 7% | 8 |
| mz.NanoGod 2.02 | 4 | 4% | 4 |
| Krabb.akim2.Akim2 1.1b | 1 | 1% | 1 |
| jab.DiamondStealer 5 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 102 rounds): 77286 melee ticks, 27337 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (102 rounds): longest scan gap while four or more were alive 32 ticks (102 rounds over 8); rounds whose longest gap at any count was over 8: 102; robots dropped as dead without a death event: 0.

Targeting waves (102 rounds): 24466 sent, 21950 reached their opponent, 3521 virtual hits (16.0% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 145 over 3 battles (48.3 per battle, most in one battle 109). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.7 | 73 / 105 | 1.57 | 21.3% | 18257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 21.3% | 73 |
| stelo.Liblix 0.3.1 | 2.0 | 15.6% | 24 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.2% | 6 |
| jwirde.Gort 2.0 | 4.3 | 9.8% | 1 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.7 | 9.4% | 0 |
| stf.PanzerGeneral 0.1 | 6.7 | 7.3% | 0 |
| disan.Chair 2.2.0 | 7.0 | 6.7% | 1 |
| wompi.Quokka 1.6 | 7.3 | 6.9% | 0 |
| sample.Crazy 1.0 | 9.3 | 4.5% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 97.1 | 30 / 35 | 6550 |
| 2 | 1 | 72.2 | 95.2 | 23 / 35 | 6142 |
| 3 | 1 | 70.1 | 88.6 | 20 / 35 | 5565 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 48 | 65% |
| tzu.TheArtOfWar 1.2 | 32 | 94% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 100% |
| jwirde.Gort 2.0 | 5 | 100% |
| disan.Chair 2.2.0 | 2 | 50% |

Hadur died in 35 of 105 rounds, at a mean tick of 986. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 21 | 60% | 48 |
| tzu.TheArtOfWar 1.2 | 6 | 17% | 30 |
| jwirde.Gort 2.0 | 3 | 9% | 13 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 6% | 7 |
| disan.Chair 2.2.0 | 1 | 3% | 4 |
| stf.PanzerGeneral 0.1 | 1 | 3% | 1 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 103 rounds): 76745 melee ticks, 25822 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (103 rounds): longest scan gap while four or more were alive 49 ticks (103 rounds over 8); rounds whose longest gap at any count was over 8: 103; robots dropped as dead without a death event: 0.

Targeting waves (103 rounds): 26358 sent, 24005 reached their opponent, 5064 virtual hits (21.1% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 379 over 3 battles (126.3 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 87.9 | 58 / 105 | 2.09 | 19.8% | 16496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 19.8% | 58 |
| jje.BagPuss 1.2 | 2.7 | 12.0% | 3 |
| myl.nano.Graviton 1.10 | 3.0 | 11.3% | 2 |
| eem.IWillFireNoBullet v2.8 | 3.3 | 11.4% | 33 |
| sul.Lunar 1.1 | 5.0 | 10.3% | 5 |
| hvilela.HVilela 0.9 | 6.7 | 8.6% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 6.7 | 9.1% | 1 |
| fm.claire 1.7 | 7.7 | 8.1% | 1 |
| wit.Deep7 2.0 | 9.3 | 5.5% | 2 |
| abud.ThirdRobo 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 88.9 | 21 / 35 | 5948 |
| 2 | 1 | 67.6 | 83.2 | 16 / 35 | 4927 |
| 3 | 1 | 70.7 | 91.7 | 21 / 35 | 5621 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 40 | 58% |
| jje.BagPuss 1.2 | 11 | 91% |
| sul.Lunar 1.1 | 10 | 70% |
| myl.nano.Graviton 1.10 | 8 | 88% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 100% |
| fm.claire 1.7 | 2 | 50% |
| wit.Deep7 2.0 | 2 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 50 of 105 rounds, at a mean tick of 1475. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 21 | 42% | 0 |
| jje.BagPuss 1.2 | 6 | 12% | 25 |
| sul.Lunar 1.1 | 6 | 12% | 22 |
| myl.nano.Graviton 1.10 | 6 | 12% | 21 |
| fm.claire 1.7 | 3 | 6% | 8 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 4% | 15 |
| wit.Deep7 2.0 | 2 | 4% | 9 |
| hvilela.HVilela 0.9 | 1 | 2% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 104 rounds): 93173 melee ticks, 44180 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (104 rounds): longest scan gap while four or more were alive 49 ticks (104 rounds over 8); rounds whose longest gap at any count was over 8: 104; robots dropped as dead without a death event: 0.

Targeting waves (104 rounds): 29951 sent, 27520 reached their opponent, 4251 virtual hits (15.4% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 140 over 3 battles (46.7 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 3 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.8 | 34 / 105 | 2.37 | 16.9% | 13147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.0% | 35 |
| hadur117.Hadur 3.20 | 2.0 | 16.9% | 34 |
| rsalesc.melee.Medina 0.4.5 | 2.7 | 16.2% | 29 |
| mz.MicroSheep 1.0 | 4.7 | 10.2% | 0 |
| cx.Princess 1.0 | 5.0 | 10.3% | 6 |
| sadoner.killer 0.2 | 5.3 | 9.5% | 2 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.1% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.3% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 83.5 | 12 / 35 | 4467 |
| 2 | 1 | 67.6 | 87.3 | 13 / 35 | 4462 |
| 3 | 3 | 65.9 | 83.5 | 9 / 35 | 4218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 36 | 56% |
| rsalesc.melee.Medina 0.4.5 | 17 | 29% |
| cx.Princess 1.0 | 7 | 57% |
| mz.MicroSheep 1.0 | 4 | 100% |
| sadoner.killer 0.2 | 2 | 50% |

Hadur died in 73 of 105 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 31 | 42% | 50 |
| rsalesc.melee.Medina 0.4.5 | 24 | 33% | 33 |
| sadoner.killer 0.2 | 6 | 8% | 7 |
| cx.Princess 1.0 | 4 | 5% | 4 |
| jeremyreeder.collective.Prophet 5 | 2 | 3% | 3 |
| arthord.NanoSatanMelee Beta | 2 | 3% | 2 |
| mz.MicroSheep 1.0 | 1 | 1% | 4 |
| kurios.DOSexe .9a | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 105 rounds): 81750 melee ticks, 20494 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (105 rounds): longest scan gap while four or more were alive 47 ticks (105 rounds over 8); rounds whose longest gap at any count was over 8: 105; robots dropped as dead without a death event: 0.

Targeting waves (105 rounds): 23441 sent, 20912 reached their opponent, 3158 virtual hits (15.1% of those reached).

