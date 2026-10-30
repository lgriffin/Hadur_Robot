# Bench suite: gun-smoke-suite.txt

## Melee bench: F01

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4071590. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 22 over 2 battles (11.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 87.5 | 17 / 70 | 2.13 | 17.5% | 10208 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.5% | 51 |
| hadur117.Hadur 3.19gx | 2.0 | 17.5% | 17 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.5 | 10.8% | 1 |
| lorneswork.Predator 1.0 | 4.5 | 9.9% | 0 |
| sgp.JollyNinja 3.53 | 5.0 | 10.7% | 1 |
| mz.MicroGodMelee 1 | 5.5 | 9.6% | 0 |
| adt.Ar2 1.0 | 6.5 | 8.0% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.5% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.1 | 87.6 | 9 / 35 | 5321 |
| 2 | 2 | 67.2 | 87.3 | 8 / 35 | 4887 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 46 | 7% |
| mz.MicroGodMelee 1 | 5 | 100% |
| lorneswork.Predator 1.0 | 5 | 100% |
| sgp.JollyNinja 3.53 | 2 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 53 of 70 rounds, at a mean tick of 1165. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 47 | 89% | 50 |
| lorneswork.Predator 1.0 | 2 | 4% | 6 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2 | 4% | 3 |
| sgp.JollyNinja 3.53 | 1 | 2% | 4 |
| skm.butterfly 1.0 | 1 | 2% | 1 |
| mz.MicroGodMelee 1 | 0 | 0% | 4 |
| adt.Ar2 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 70 rounds): 49752 melee ticks, 28725 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 41 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 1.

Targeting waves (70 rounds): 15880 sent, 14216 reached their opponent, 2941 virtual hits (20.7% of those reached).

## Melee bench: F02

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3806140. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 62 over 2 battles (31.0 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.2 | 33 / 70 | 2.33 | 18.3% | 9786 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gx | 1.0 | 18.3% | 33 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.0 | 13.3% | 13 |
| com.cohesiva.robocode.ManOwaR 1.0 | 3.5 | 10.9% | 5 |
| pulsar.PulsarMax 0.8.9 | 3.5 | 11.7% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.3% | 1 |
| Noran.BitchingElk 0.054 | 6.5 | 9.1% | 7 |
| sch.Simone 0.3d | 6.5 | 8.6% | 2 |
| fnc.bandit.Bandit 5.2.0 | 8.0 | 7.2% | 0 |
| stelo.PatternRobot 1.0 | 9.0 | 6.0% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.7 | 17 / 35 | 5122 |
| 2 | 1 | 66.9 | 84.8 | 16 / 35 | 4664 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 14 | 64% |
| pulsar.PulsarMax 0.8.9 | 12 | 50% |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 60% |
| sch.Simone 0.3d | 7 | 86% |
| Noran.BitchingElk 0.054 | 6 | 33% |
| lrem.micro.SpikeSoldier 0.4 | 3 | 100% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 37 of 70 rounds, at a mean tick of 1050. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 9 | 24% | 17 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 9 | 24% | 15 |
| com.cohesiva.robocode.ManOwaR 1.0 | 6 | 16% | 14 |
| Noran.BitchingElk 0.054 | 6 | 16% | 6 |
| fnc.bandit.Bandit 5.2.0 | 3 | 8% | 4 |
| sch.Simone 0.3d | 1 | 3% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 1 | 3% | 4 |
| stelo.PatternRobot 1.0 | 1 | 3% | 1 |
| fullsail.SweetTea 1.1 | 1 | 3% | 1 |

Posture (Hadur's M records, 70 rounds): 60038 melee ticks, 16845 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 25 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 20629 sent, 19038 reached their opponent, 3346 virtual hits (17.6% of those reached).

## Melee bench: F03

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3871345. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 44 over 2 battles (22.0 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.5 | 51 / 70 | 1.94 | 20.4% | 13320 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gx | 1.0 | 20.4% | 51 |
| radnor.DoctorBob 1.42 | 2.0 | 14.6% | 6 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.7% | 3 |
| vuen.Cake 2.51 | 3.5 | 12.8% | 10 |
| urdos.URDOS 1.3 | 5.0 | 8.8% | 0 |
| adt.Ar1 2.1 | 6.5 | 7.1% | 0 |
| oa.weak.FlyMk1 0.1 | 6.5 | 6.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.0 | 6.3% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 5.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 89.5 | 25 / 35 | 6580 |
| 2 | 1 | 70.8 | 89.5 | 26 / 35 | 6740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 20 | 80% |
| radnor.DoctorBob 1.42 | 20 | 100% |
| kawigi.nano.Lib 1.0 | 10 | 80% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |

Hadur died in 19 of 70 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 4 | 21% | 23 |
| vuen.Cake 2.51 | 4 | 21% | 17 |
| kawigi.nano.Lib 1.0 | 4 | 21% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 21% | 3 |
| urdos.URDOS 1.3 | 2 | 11% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 5% | 2 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 5 |
| adt.Ar1 2.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 42797 melee ticks, 14747 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 25 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 13041 sent, 11540 reached their opponent, 3038 virtual hits (26.3% of those reached).

## Melee bench: F04

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3910656. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 38 over 2 battles (19.0 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.8 | 6 / 70 | 2.19 | 17.5% | 11023 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.3% | 54 |
| hadur117.Hadur 3.19gx | 2.0 | 17.5% | 6 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.9% | 9 |
| josago.Jorgito 0.16 | 4.5 | 10.1% | 0 |
| TNT.TNT 0.99.1 | 4.5 | 10.4% | 1 |
| css.Delitioner 0.11 | 6.0 | 7.6% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.2% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.0% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.3% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.2 | 86.0 | 3 / 35 | 5589 |
| 2 | 2 | 68.2 | 87.6 | 3 / 35 | 5434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 46 | 7% |
| apc.LeeroyJenkins2 1.0 | 4 | 0% |
| TNT.TNT 0.99.1 | 4 | 75% |

Hadur died in 64 of 70 rounds, at a mean tick of 1329. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 51 | 80% | 54 |
| apc.LeeroyJenkins2 1.0 | 10 | 16% | 10 |
| TNT.TNT 0.99.1 | 2 | 3% | 5 |
| josago.Jorgito 0.16 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 67769 melee ticks, 26367 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 38 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 1.

Targeting waves (70 rounds): 20206 sent, 18589 reached their opponent, 2778 virtual hits (14.9% of those reached).

## Melee bench: F05

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3904472. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 29 over 2 battles (14.5 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 77.3 | 10 / 70 | 3.04 | 14.6% | 7262 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.5 | 17.8% | 31 |
| justin.DemonicRage 3.4 | 1.5 | 17.1% | 20 |
| hadur117.Hadur 3.19gx | 3.0 | 14.6% | 10 |
| wompi.Numbat 2.1 | 4.0 | 12.9% | 6 |
| axeBots.HataMoto 3.09 | 5.5 | 9.0% | 3 |
| ms.Ares 0.19 | 5.5 | 9.0% | 0 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 8.5 | 4.4% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.5 | 5.2% | 0 |
| GarmBox.Oranges 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.5 | 75.6 | 5 / 35 | 3531 |
| 2 | 3 | 63.9 | 79.0 | 5 / 35 | 3731 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 10 | 10% |
| justin.DemonicRage 3.4 | 10 | 50% |
| wompi.Numbat 2.1 | 6 | 33% |
| ms.Ares 0.19 | 1 | 100% |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 100% |
| axeBots.HataMoto 3.09 | 1 | 0% |

Hadur died in 60 of 70 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 25 | 42% | 30 |
| cb.fire.Firestarter 2.0f | 20 | 33% | 20 |
| wompi.Numbat 2.1 | 9 | 15% | 11 |
| axeBots.HataMoto 3.09 | 5 | 8% | 5 |
| supersample.SuperBoxBot 1.0 | 1 | 2% | 1 |
| ms.Ares 0.19 | 0 | 0% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 54490 melee ticks, 9672 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 49 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 16603 sent, 14939 reached their opponent, 2531 virtual hits (16.9% of those reached).

## Melee bench: F06

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4654338. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 34 over 2 battles (17.0 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.7 | 38 / 70 | 2.20 | 18.5% | 9734 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gx | 1.0 | 18.5% | 38 |
| jekl.StoneGhost 0.7 | 2.0 | 15.3% | 11 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.5 | 12.3% | 9 |
| origin.SleepSiphon 1.7b | 3.5 | 12.7% | 11 |
| mld.Wisdom 1.0 | 5.0 | 10.0% | 0 |
| gg.Wolverine 2.0 | 6.0 | 8.7% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.8% | 1 |
| spinnercat.Omen 1.0 | 7.5 | 6.4% | 0 |
| DBall.NUKE 0.1 | 9.0 | 5.8% | 0 |
| sample.Fire 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.4 | 18 / 35 | 5042 |
| 2 | 1 | 68.3 | 87.9 | 20 / 35 | 4692 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 19 | 74% |
| origin.SleepSiphon 1.7b | 15 | 67% |
| pe.minimelee.SandboxMiniMelee 1.1 | 8 | 75% |
| gg.Wolverine 2.0 | 3 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 67% |
| mld.Wisdom 1.0 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 32 of 70 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.minimelee.SandboxMiniMelee 1.1 | 11 | 34% | 16 |
| origin.SleepSiphon 1.7b | 9 | 28% | 18 |
| jekl.StoneGhost 0.7 | 8 | 25% | 22 |
| mld.Wisdom 1.0 | 2 | 6% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 3% | 4 |
| gg.Wolverine 2.0 | 1 | 3% | 3 |
| DBall.NUKE 0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 51404 melee ticks, 14298 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 35 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 15901 sent, 14217 reached their opponent, 3192 virtual hits (22.5% of those reached).

## Melee bench: F07

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3824288. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 36 over 2 battles (18.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.2 | 35 / 70 | 1.70 | 20.2% | 12621 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gx | 1.0 | 20.2% | 35 |
| rtk.Tachikoma 1.0 | 2.5 | 16.7% | 13 |
| rsalesc.melee.Monk 0.3.6c | 2.5 | 16.7% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.1% | 2 |
| franzor.Lizt 1.3.1 | 5.0 | 10.6% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.9% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.0 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 93.7 | 19 / 35 | 6144 |
| 2 | 1 | 71.5 | 90.8 | 16 / 35 | 6477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 27 | 63% |
| rsalesc.melee.Monk 0.3.6c | 18 | 33% |
| oog.melee.CapuletDroid 1.1 | 8 | 88% |
| franzor.Lizt 1.3.1 | 8 | 63% |

Hadur died in 35 of 70 rounds, at a mean tick of 1373. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 15 | 43% | 34 |
| rsalesc.melee.Monk 0.3.6c | 14 | 40% | 22 |
| franzor.Lizt 1.3.1 | 4 | 11% | 0 |
| oog.melee.CapuletDroid 1.1 | 2 | 6% | 13 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 62748 melee ticks, 30000 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 33 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 18786 sent, 17158 reached their opponent, 3549 virtual hits (20.7% of those reached).

## Melee bench: F08

hadur117.Hadur 3.19gx against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3920524. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 42 over 2 battles (21.0 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 89.0 | 42 / 70 | 1.99 | 18.9% | 9560 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gx | 1.0 | 18.9% | 42 |
| tm.Yuugao 1.0 | 3.0 | 12.3% | 9 |
| shrub.Vapour v159 | 3.0 | 12.0% | 5 |
| Krabb.sliNk.Garm 0.9u | 3.0 | 12.2% | 6 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 10.4% | 4 |
| m3thos.Eva00 1.1 | 6.5 | 8.8% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.2% | 5 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.3% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 5.9% | 0 |
| SHAM.WOW 1.4 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.5 | 22 / 35 | 4900 |
| 2 | 1 | 68.0 | 88.6 | 20 / 35 | 4660 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| Krabb.sliNk.Garm 0.9u | 15 | 93% |
| tm.Yuugao 1.0 | 13 | 77% |
| shrub.Vapour v159 | 9 | 67% |
| com.spp.robocode.MostlyHarmless 010 | 8 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 60% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 28 of 70 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.spp.robocode.MostlyHarmless 010 | 8 | 29% | 15 |
| tm.Yuugao 1.0 | 6 | 21% | 19 |
| Krabb.sliNk.Garm 0.9u | 5 | 18% | 17 |
| shrub.Vapour v159 | 4 | 14% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 14% | 6 |
| m3thos.Eva00 1.1 | 1 | 4% | 4 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 49897 melee ticks, 15014 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 46 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 1.

Targeting waves (70 rounds): 16173 sent, 14536 reached their opponent, 2836 virtual hits (19.5% of those reached).

