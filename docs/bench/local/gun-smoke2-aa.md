# Bench suite: gun-smoke-suite.txt

## Melee bench: F01

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3828946. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 45 over 2 battles (22.5 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.1 | 14 / 70 | 2.34 | 17.2% | 10639 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.9% | 48 |
| hadur117.Hadur 3.19aa | 2.0 | 17.2% | 14 |
| sgp.JollyNinja 3.53 | 3.5 | 11.5% | 5 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 11.1% | 0 |
| mz.MicroGodMelee 1 | 5.0 | 10.1% | 3 |
| lorneswork.Predator 1.0 | 5.5 | 10.4% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.1% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.2% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 83.2 | 7 / 35 | 5314 |
| 2 | 2 | 67.7 | 87.0 | 7 / 35 | 5325 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 41 | 10% |
| sgp.JollyNinja 3.53 | 5 | 60% |
| mz.MicroGodMelee 1 | 4 | 50% |
| lorneswork.Predator 1.0 | 3 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 2 | 100% |

Hadur died in 56 of 70 rounds, at a mean tick of 1123. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 43 | 77% | 47 |
| sgp.JollyNinja 3.53 | 6 | 11% | 8 |
| mz.MicroGodMelee 1 | 3 | 5% | 5 |
| lorneswork.Predator 1.0 | 2 | 4% | 6 |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 2% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 48852 melee ticks, 28854 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 32 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 5.

Targeting waves (70 rounds): 15351 sent, 13697 reached their opponent, 2816 virtual hits (20.6% of those reached).

## Melee bench: F02

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3716120. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 46 over 2 battles (23.0 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 82.4 | 30 / 70 | 2.59 | 17.8% | 9764 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 17.8% | 30 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.0 | 13.8% | 13 |
| pulsar.PulsarMax 0.8.9 | 3.0 | 12.9% | 10 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.0 | 11.1% | 6 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.5% | 2 |
| sch.Simone 0.3d | 7.0 | 8.0% | 4 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.1% | 0 |
| Noran.BitchingElk 0.054 | 7.0 | 8.2% | 6 |
| fullsail.SweetTea 1.1 | 9.5 | 4.1% | 0 |
| stelo.PatternRobot 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.3 | 18 / 35 | 5081 |
| 2 | 1 | 65.2 | 77.5 | 12 / 35 | 4683 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 13 | 54% |
| pulsar.PulsarMax 0.8.9 | 12 | 42% |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 57% |
| sch.Simone 0.3d | 6 | 100% |
| Noran.BitchingElk 0.054 | 5 | 60% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 2 | 100% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 41 of 70 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 12 | 29% | 17 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 9 | 22% | 16 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 17% | 12 |
| Noran.BitchingElk 0.054 | 5 | 12% | 9 |
| stelo.PatternRobot 1.0 | 3 | 7% | 3 |
| sch.Simone 0.3d | 2 | 5% | 7 |
| lrem.micro.SpikeSoldier 0.4 | 2 | 5% | 3 |
| fnc.bandit.Bandit 5.2.0 | 1 | 2% | 2 |
| fullsail.SweetTea 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 57019 melee ticks, 16163 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 44 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 41 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 19963 sent, 18302 reached their opponent, 3189 virtual hits (17.4% of those reached).

## Melee bench: F03

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3603008. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 38 over 2 battles (19.0 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.8 | 50 / 70 | 1.91 | 20.3% | 13175 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 20.3% | 50 |
| radnor.DoctorBob 1.42 | 2.5 | 14.2% | 8 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.1% | 6 |
| vuen.Cake 2.51 | 4.0 | 12.5% | 6 |
| urdos.URDOS 1.3 | 5.5 | 9.2% | 0 |
| adt.Ar1 2.1 | 6.0 | 7.7% | 0 |
| oa.weak.FlyMk1 0.1 | 6.5 | 6.4% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 9.0 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 90.2 | 28 / 35 | 6509 |
| 2 | 1 | 70.4 | 89.5 | 22 / 35 | 6666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 25 | 88% |
| radnor.DoctorBob 1.42 | 14 | 100% |
| kawigi.nano.Lib 1.0 | 13 | 85% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 20 of 70 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 6 | 30% | 19 |
| vuen.Cake 2.51 | 4 | 20% | 23 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 20% | 6 |
| kawigi.nano.Lib 1.0 | 3 | 15% | 15 |
| urdos.URDOS 1.3 | 3 | 15% | 3 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 44388 melee ticks, 11917 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 305 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 120 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 13273 sent, 11658 reached their opponent, 2998 virtual hits (25.7% of those reached).

## Melee bench: F04

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3864302. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 37 over 2 battles (18.5 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 84.9 | 11 / 70 | 2.36 | 17.5% | 11180 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 21.8% | 53 |
| hadur117.Hadur 3.19aa | 2.0 | 17.5% | 11 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.7% | 3 |
| TNT.TNT 0.99.1 | 4.5 | 10.0% | 3 |
| josago.Jorgito 0.16 | 5.0 | 9.1% | 0 |
| css.Delitioner 0.11 | 5.5 | 8.6% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 7.3% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.4% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 82.5 | 4 / 35 | 5505 |
| 2 | 2 | 68.9 | 87.3 | 7 / 35 | 5675 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 46 | 11% |
| apc.LeeroyJenkins2 1.0 | 5 | 80% |
| TNT.TNT 0.99.1 | 2 | 50% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 59 of 70 rounds, at a mean tick of 1331. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 45 | 76% | 51 |
| apc.LeeroyJenkins2 1.0 | 7 | 12% | 10 |
| TNT.TNT 0.99.1 | 4 | 7% | 5 |
| josago.Jorgito 0.16 | 3 | 5% | 4 |

Posture (Hadur's M records, 69 rounds): 65522 melee ticks, 25401 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 113 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 113 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 20246 sent, 18623 reached their opponent, 2635 virtual hits (14.1% of those reached).

## Melee bench: F05

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3713283. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 33 over 2 battles (16.5 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 80.2 | 12 / 70 | 2.79 | 15.5% | 7872 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.DemonicRage 3.4 | 1.5 | 16.9% | 21 |
| cb.fire.Firestarter 2.0f | 2.0 | 17.0% | 28 |
| hadur117.Hadur 3.19aa | 2.5 | 15.5% | 12 |
| wompi.Numbat 2.1 | 4.0 | 12.1% | 4 |
| axeBots.HataMoto 3.09 | 5.0 | 10.0% | 4 |
| ms.Ares 0.19 | 6.0 | 9.4% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 5.5% | 0 |
| supersample.SuperBoxBot 1.0 | 7.5 | 5.7% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.0% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.1 | 78.1 | 3 / 35 | 3567 |
| 2 | 2 | 65.8 | 82.2 | 9 / 35 | 4305 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 12 | 33% |
| cb.fire.Firestarter 2.0f | 12 | 17% |
| wompi.Numbat 2.1 | 7 | 57% |
| axeBots.HataMoto 3.09 | 2 | 100% |

Hadur died in 58 of 70 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 24 | 41% | 29 |
| cb.fire.Firestarter 2.0f | 21 | 36% | 23 |
| wompi.Numbat 2.1 | 5 | 9% | 8 |
| axeBots.HataMoto 3.09 | 4 | 7% | 6 |
| ms.Ares 0.19 | 3 | 5% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 53929 melee ticks, 12824 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 48 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 1.

Targeting waves (70 rounds): 16424 sent, 14679 reached their opponent, 2371 virtual hits (16.2% of those reached).

## Melee bench: F06

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3889425. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 31 over 2 battles (15.5 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 90.0 | 41 / 70 | 1.90 | 19.3% | 10257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 19.3% | 41 |
| jekl.StoneGhost 0.7 | 2.0 | 14.7% | 11 |
| origin.SleepSiphon 1.7b | 3.0 | 12.7% | 11 |
| mld.Wisdom 1.0 | 4.5 | 11.6% | 1 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.5 | 11.0% | 2 |
| gg.Wolverine 2.0 | 6.0 | 9.2% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.4% | 2 |
| spinnercat.Omen 1.0 | 8.0 | 6.5% | 0 |
| DBall.NUKE 0.1 | 9.0 | 5.3% | 0 |
| sample.Fire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.6 | 21 / 35 | 5177 |
| 2 | 1 | 69.7 | 91.4 | 20 / 35 | 5080 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 24 | 75% |
| origin.SleepSiphon 1.7b | 15 | 73% |
| gg.Wolverine 2.0 | 7 | 100% |
| mld.Wisdom 1.0 | 4 | 100% |
| pe.minimelee.SandboxMiniMelee 1.1 | 2 | 50% |

Hadur died in 30 of 70 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 12 | 40% | 25 |
| origin.SleepSiphon 1.7b | 11 | 37% | 24 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4 | 13% | 8 |
| gg.Wolverine 2.0 | 3 | 10% | 5 |
| mld.Wisdom 1.0 | 0 | 0% | 5 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 49344 melee ticks, 13203 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 65 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 15665 sent, 14018 reached their opponent, 3042 virtual hits (21.7% of those reached).

## Melee bench: F07

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3770210. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 36 over 2 battles (18.0 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 93.8 | 45 / 70 | 1.56 | 21.5% | 13673 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 21.5% | 45 |
| rsalesc.melee.Monk 0.3.6c | 2.5 | 16.0% | 9 |
| rtk.Tachikoma 1.0 | 2.5 | 15.8% | 10 |
| franzor.Lizt 1.3.1 | 4.5 | 11.1% | 3 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.8% | 3 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.6% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.3% | 0 |
| sample.Target 1.0 | 9.0 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 92.4 | 20 / 35 | 6658 |
| 2 | 1 | 73.9 | 95.2 | 25 / 35 | 7015 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 25 | 76% |
| rsalesc.melee.Monk 0.3.6c | 16 | 44% |
| franzor.Lizt 1.3.1 | 14 | 93% |
| oog.melee.CapuletDroid 1.1 | 8 | 75% |

Hadur died in 25 of 70 rounds, at a mean tick of 1400. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 10 | 40% | 31 |
| rsalesc.melee.Monk 0.3.6c | 10 | 40% | 22 |
| oog.melee.CapuletDroid 1.1 | 4 | 16% | 16 |
| franzor.Lizt 1.3.1 | 1 | 4% | 0 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 63733 melee ticks, 29358 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 32 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 19265 sent, 17593 reached their opponent, 3606 virtual hits (20.5% of those reached).

## Melee bench: F08

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3742813. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 62 over 2 battles (31.0 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.9 | 44 / 70 | 2.00 | 19.5% | 10299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 19.5% | 44 |
| tm.Yuugao 1.0 | 2.5 | 12.8% | 7 |
| shrub.Vapour v159 | 2.5 | 12.1% | 8 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 11.4% | 5 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 10.7% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.1% | 1 |
| m3thos.Eva00 1.1 | 6.5 | 8.6% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.5% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.1% | 0 |
| SHAM.WOW 1.4 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.0 | 23 / 35 | 5057 |
| 2 | 1 | 69.6 | 90.8 | 21 / 35 | 5242 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 17 | 88% |
| com.spp.robocode.MostlyHarmless 010 | 14 | 93% |
| shrub.Vapour v159 | 10 | 40% |
| Krabb.sliNk.Garm 0.9u | 7 | 71% |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 100% |
| m3thos.Eva00 1.1 | 2 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 27 of 70 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 9 | 33% | 18 |
| tm.Yuugao 1.0 | 7 | 26% | 24 |
| Krabb.sliNk.Garm 0.9u | 6 | 22% | 10 |
| com.spp.robocode.MostlyHarmless 010 | 3 | 11% | 12 |
| jwst.DAD.DarkAndDarker 1.1 | 2 | 7% | 4 |
| m3thos.Eva00 1.1 | 0 | 0% | 1 |
| SHAM.WOW 1.4 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 50536 melee ticks, 14739 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 58 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 1.

Targeting waves (70 rounds): 16431 sent, 14806 reached their opponent, 2779 virtual hits (18.8% of those reached).

