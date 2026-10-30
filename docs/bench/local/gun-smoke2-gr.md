# Bench suite: gun-smoke-suite.txt

## Melee bench: F01

hadur117.Hadur 3.19gr against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3816920. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 28 over 2 battles (14.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.2 | 14 / 70 | 2.24 | 17.7% | 11021 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 51 |
| hadur117.Hadur 3.19gr | 2.0 | 17.7% | 14 |
| sgp.JollyNinja 3.53 | 3.0 | 11.6% | 4 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 10.9% | 0 |
| adt.Ar2 1.0 | 5.5 | 9.2% | 0 |
| lorneswork.Predator 1.0 | 6.0 | 9.8% | 1 |
| mz.MicroGodMelee 1 | 6.5 | 8.6% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 5.6% | 0 |
| skm.butterfly 1.0 | 8.5 | 5.1% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.1 | 85.7 | 7 / 35 | 5669 |
| 2 | 2 | 67.8 | 86.7 | 7 / 35 | 5352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 42 | 7% |
| sgp.JollyNinja 3.53 | 7 | 71% |
| adt.Ar2 1.0 | 2 | 100% |
| mz.MicroGodMelee 1 | 2 | 100% |
| lorneswork.Predator 1.0 | 1 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 100% |

Hadur died in 56 of 70 rounds, at a mean tick of 1180. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 42 | 75% | 46 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 9% | 6 |
| sgp.JollyNinja 3.53 | 4 | 7% | 7 |
| lorneswork.Predator 1.0 | 3 | 5% | 5 |
| adt.Ar2 1.0 | 2 | 4% | 3 |
| mz.MicroGodMelee 1 | 0 | 0% | 2 |
| skm.butterfly 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 69 rounds): 44884 melee ticks, 33814 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 89 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 89 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 14765 sent, 13099 reached their opponent, 2508 virtual hits (19.1% of those reached).

## Melee bench: F02

hadur117.Hadur 3.19gr against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3887018. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 43 over 2 battles (21.5 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.5 | 39 / 70 | 2.13 | 19.0% | 10139 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gr | 1.0 | 19.0% | 39 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 14.8% | 18 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 14.3% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.5 | 10.4% | 1 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 11.2% | 1 |
| sch.Simone 0.3d | 6.5 | 8.3% | 2 |
| Noran.BitchingElk 0.054 | 6.5 | 8.3% | 3 |
| fnc.bandit.Bandit 5.2.0 | 8.0 | 6.3% | 0 |
| stelo.PatternRobot 1.0 | 9.5 | 4.2% | 1 |
| fullsail.SweetTea 1.1 | 9.5 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.6 | 20 / 35 | 5014 |
| 2 | 1 | 69.1 | 86.3 | 19 / 35 | 5125 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 20 | 60% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 13 | 85% |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 88% |
| Noran.BitchingElk 0.054 | 5 | 80% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 75% |
| sch.Simone 0.3d | 3 | 67% |

Hadur died in 31 of 70 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 16 | 52% | 23 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 5 | 16% | 17 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4 | 13% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 3 | 10% | 5 |
| Noran.BitchingElk 0.054 | 2 | 6% | 6 |
| sch.Simone 0.3d | 1 | 3% | 7 |

Posture (Hadur's M records, 70 rounds): 59027 melee ticks, 14307 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 56 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 21130 sent, 19424 reached their opponent, 3195 virtual hits (16.4% of those reached).

## Melee bench: F03

hadur117.Hadur 3.19gr against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3688235. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 51 over 2 battles (25.5 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 90.6 | 54 / 70 | 1.84 | 20.4% | 12645 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gr | 1.0 | 20.4% | 54 |
| radnor.DoctorBob 1.42 | 2.0 | 14.2% | 7 |
| vuen.Cake 2.51 | 3.0 | 13.0% | 7 |
| kawigi.nano.Lib 1.0 | 4.0 | 12.1% | 2 |
| adt.Ar1 2.1 | 5.5 | 7.9% | 0 |
| urdos.URDOS 1.3 | 5.5 | 8.6% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 7.0% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 5.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 9.0 | 5.8% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 90.8 | 28 / 35 | 6269 |
| 2 | 1 | 70.7 | 90.5 | 26 / 35 | 6376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 26 | 88% |
| radnor.DoctorBob 1.42 | 23 | 96% |
| kawigi.nano.Lib 1.0 | 8 | 88% |
| adt.Ar1 2.1 | 1 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |

Hadur died in 16 of 70 rounds, at a mean tick of 637. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 4 | 25% | 25 |
| vuen.Cake 2.51 | 4 | 25% | 20 |
| adt.Ar1 2.1 | 2 | 13% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 13% | 2 |
| kawigi.nano.Lib 1.0 | 1 | 6% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 6% | 3 |
| urdos.URDOS 1.3 | 1 | 6% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 6% | 1 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 70 rounds): 42178 melee ticks, 13704 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 45 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 13187 sent, 11553 reached their opponent, 2929 virtual hits (25.4% of those reached).

## Melee bench: F04

hadur117.Hadur 3.19gr against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3820207. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 42 over 2 battles (21.0 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.0 | 8 / 70 | 2.53 | 17.0% | 10917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.8% | 56 |
| hadur117.Hadur 3.19gr | 2.0 | 17.0% | 8 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.8% | 4 |
| TNT.TNT 0.99.1 | 4.0 | 10.8% | 1 |
| josago.Jorgito 0.16 | 5.0 | 9.3% | 0 |
| tj.zombie1n 1.0.1 | 6.5 | 6.5% | 0 |
| css.Delitioner 0.11 | 6.5 | 6.9% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.9% | 1 |
| spin.Bugstard 0.012b | 9.0 | 4.5% | 0 |
| sp.Nanos.Ember 1.1 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 83.2 | 4 / 35 | 5324 |
| 2 | 2 | 67.7 | 82.9 | 4 / 35 | 5593 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 39 | 8% |
| apc.LeeroyJenkins2 1.0 | 4 | 75% |
| rampancy.Durandal 2.1d | 1 | 0% |
| TNT.TNT 0.99.1 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 62 of 70 rounds, at a mean tick of 1233. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 46 | 74% | 49 |
| apc.LeeroyJenkins2 1.0 | 7 | 11% | 10 |
| josago.Jorgito 0.16 | 6 | 10% | 7 |
| rampancy.Durandal 2.1d | 2 | 3% | 3 |
| TNT.TNT 0.99.1 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 64316 melee ticks, 22817 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 79 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 20508 sent, 18782 reached their opponent, 2809 virtual hits (15.0% of those reached).

## Melee bench: F05

hadur117.Hadur 3.19gr against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3567988. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 25 over 2 battles (12.5 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 73.0 | 9 / 70 | 3.43 | 14.3% | 7844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.7% | 35 |
| justin.DemonicRage 3.4 | 2.0 | 17.8% | 23 |
| hadur117.Hadur 3.19gr | 3.0 | 14.3% | 9 |
| wompi.Numbat 2.1 | 4.0 | 12.7% | 2 |
| ms.Ares 0.19 | 5.0 | 9.5% | 0 |
| axeBots.HataMoto 3.09 | 6.0 | 9.1% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.0 | 5.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 8.5 | 4.3% | 0 |
| supersample.SuperBoxBot 1.0 | 9.0 | 4.4% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.8 | 74.9 | 7 / 35 | 3943 |
| 2 | 3 | 62.1 | 71.1 | 2 / 35 | 3901 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 11 | 45% |
| cb.fire.Firestarter 2.0f | 8 | 0% |
| wompi.Numbat 2.1 | 4 | 100% |
| axeBots.HataMoto 3.09 | 1 | 0% |

Hadur died in 61 of 70 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 22 | 36% | 28 |
| cb.fire.Firestarter 2.0f | 20 | 33% | 20 |
| wompi.Numbat 2.1 | 11 | 18% | 14 |
| axeBots.HataMoto 3.09 | 5 | 8% | 5 |
| supersample.SuperBoxBot 1.0 | 1 | 2% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 2% | 1 |
| ms.Ares 0.19 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 49297 melee ticks, 7497 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 56 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 16053 sent, 14287 reached their opponent, 2404 virtual hits (16.8% of those reached).

## Melee bench: F06

hadur117.Hadur 3.19gr against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3745429. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 47 over 2 battles (23.5 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 90.8 | 47 / 70 | 1.83 | 20.1% | 11003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gr | 1.0 | 20.1% | 47 |
| jekl.StoneGhost 0.7 | 2.0 | 15.6% | 9 |
| origin.SleepSiphon 1.7b | 3.5 | 12.6% | 8 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.5 | 12.2% | 4 |
| mld.Wisdom 1.0 | 5.0 | 10.6% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 7.3% | 1 |
| gg.Wolverine 2.0 | 6.5 | 7.6% | 0 |
| DBall.NUKE 0.1 | 8.5 | 5.7% | 1 |
| spinnercat.Omen 1.0 | 8.5 | 5.2% | 0 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.7 | 24 / 35 | 5567 |
| 2 | 1 | 70.3 | 89.8 | 23 / 35 | 5436 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 21 | 86% |
| pe.minimelee.SandboxMiniMelee 1.1 | 14 | 100% |
| origin.SleepSiphon 1.7b | 12 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |
| mld.Wisdom 1.0 | 1 | 100% |
| gg.Wolverine 2.0 | 1 | 100% |

Hadur died in 23 of 70 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 11 | 48% | 26 |
| mld.Wisdom 1.0 | 4 | 17% | 6 |
| origin.SleepSiphon 1.7b | 3 | 13% | 19 |
| pe.minimelee.SandboxMiniMelee 1.1 | 2 | 9% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 9% | 4 |
| gg.Wolverine 2.0 | 1 | 4% | 3 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 69 rounds): 50554 melee ticks, 13364 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 31 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 16055 sent, 14412 reached their opponent, 3114 virtual hits (21.6% of those reached).

## Melee bench: F07

hadur117.Hadur 3.19gr against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3883398. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 38 over 2 battles (19.0 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 92.1 | 44 / 70 | 1.71 | 21.1% | 13696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gr | 1.0 | 21.1% | 44 |
| rsalesc.melee.Monk 0.3.6c | 2.5 | 16.6% | 10 |
| rtk.Tachikoma 1.0 | 2.5 | 16.1% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.3% | 3 |
| franzor.Lizt 1.3.1 | 5.0 | 10.5% | 2 |
| exauge.GateKeeper 1.1.121g | 6.0 | 8.4% | 0 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.0 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 91.1 | 22 / 35 | 6713 |
| 2 | 1 | 73.1 | 93.0 | 22 / 35 | 6983 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 31 | 81% |
| franzor.Lizt 1.3.1 | 10 | 80% |
| rsalesc.melee.Monk 0.3.6c | 9 | 44% |
| oog.melee.CapuletDroid 1.1 | 7 | 71% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 26 of 70 rounds, at a mean tick of 1268. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 10 | 38% | 33 |
| rsalesc.melee.Monk 0.3.6c | 8 | 31% | 20 |
| oog.melee.CapuletDroid 1.1 | 4 | 15% | 12 |
| franzor.Lizt 1.3.1 | 2 | 8% | 0 |
| exauge.GateKeeper 1.1.121g | 1 | 4% | 4 |
| lrem.micro.MoggFanatic 0.2 | 1 | 4% | 1 |

Posture (Hadur's M records, 70 rounds): 62817 melee ticks, 26863 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 32 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 1.

Targeting waves (70 rounds): 19265 sent, 17554 reached their opponent, 3436 virtual hits (19.6% of those reached).

## Melee bench: F08

hadur117.Hadur 3.19gr against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3975747. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 47 over 2 battles (23.5 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.8 | 40 / 70 | 2.19 | 18.6% | 9840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gr | 1.0 | 18.6% | 40 |
| tm.Yuugao 1.0 | 2.0 | 14.0% | 13 |
| shrub.Vapour v159 | 3.0 | 12.4% | 6 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 11.7% | 8 |
| com.spp.robocode.MostlyHarmless 010 | 5.5 | 9.1% | 3 |
| m3thos.Eva00 1.1 | 6.0 | 9.3% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.8% | 2 |
| zyx.nano.BacillusComma 1.0 | 8.5 | 6.0% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.5 | 6.0% | 0 |
| SHAM.WOW 1.4 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 82.9 | 16 / 35 | 4776 |
| 2 | 1 | 69.5 | 90.8 | 24 / 35 | 5064 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 18 | 78% |
| shrub.Vapour v159 | 11 | 73% |
| Krabb.sliNk.Garm 0.9u | 8 | 63% |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 83% |
| com.spp.robocode.MostlyHarmless 010 | 6 | 83% |
| m3thos.Eva00 1.1 | 2 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 32 of 70 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| Krabb.sliNk.Garm 0.9u | 9 | 28% | 15 |
| shrub.Vapour v159 | 8 | 25% | 16 |
| tm.Yuugao 1.0 | 6 | 19% | 18 |
| com.spp.robocode.MostlyHarmless 010 | 6 | 19% | 9 |
| jwst.DAD.DarkAndDarker 1.1 | 1 | 3% | 6 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 4 |
| m3thos.Eva00 1.1 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 70 rounds): 49392 melee ticks, 14780 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 33 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 16714 sent, 14998 reached their opponent, 2706 virtual hits (18.0% of those reached).

