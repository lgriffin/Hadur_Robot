# Bench suite: gun-smoke-suite.txt

## Melee bench: F01

hadur117.Hadur 3.19gr against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3764912. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 24 over 1 battles (24.0 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.0 | 12 / 35 | 2.26 | 18.0% | 5623 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 18.8% | 21 |
| hadur117.Hadur 3.19gr | 2.0 | 18.0% | 12 |
| sgp.JollyNinja 3.53 | 3.0 | 11.3% | 0 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 11.1% | 2 |
| lorneswork.Predator 1.0 | 5.0 | 11.1% | 0 |
| mz.MicroGodMelee 1 | 6.0 | 9.4% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.9% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.2% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.2 | 86.0 | 12 / 35 | 5623 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 18 | 17% |
| lorneswork.Predator 1.0 | 3 | 100% |
| mz.MicroGodMelee 1 | 2 | 100% |
| sgp.JollyNinja 3.53 | 2 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 2 | 100% |

Hadur died in 23 of 35 rounds, at a mean tick of 1040. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 15 | 65% | 20 |
| sgp.JollyNinja 3.53 | 5 | 22% | 7 |
| lorneswork.Predator 1.0 | 2 | 9% | 2 |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 4% | 3 |
| mz.MicroGodMelee 1 | 0 | 0% | 3 |

Posture (Hadur's M records, 35 rounds): 23579 melee ticks, 12808 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 47 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 7819 sent, 6962 reached their opponent, 1407 virtual hits (20.2% of those reached).

## Melee bench: F02

hadur117.Hadur 3.19gr against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3634820. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 27 over 1 battles (27.0 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.1 | 20 / 35 | 2.34 | 18.7% | 5072 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gr | 1.0 | 18.7% | 20 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 15.2% | 7 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 11.6% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.0 | 11.1% | 2 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.1% | 0 |
| Noran.BitchingElk 0.054 | 6.0 | 8.4% | 2 |
| sch.Simone 0.3d | 7.0 | 8.1% | 1 |
| fnc.bandit.Bandit 5.2.0 | 8.0 | 8.0% | 0 |
| stelo.PatternRobot 1.0 | 9.0 | 5.6% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 85.1 | 20 / 35 | 5072 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 16 | 75% |
| com.cohesiva.robocode.ManOwaR 1.0 | 3 | 100% |
| Noran.BitchingElk 0.054 | 3 | 33% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2 | 100% |
| sch.Simone 0.3d | 1 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 15 of 35 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 5 | 33% | 15 |
| com.cohesiva.robocode.ManOwaR 1.0 | 2 | 13% | 6 |
| Noran.BitchingElk 0.054 | 2 | 13% | 4 |
| lrem.micro.SpikeSoldier 0.4 | 2 | 13% | 2 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 1 | 7% | 3 |
| sch.Simone 0.3d | 1 | 7% | 2 |
| fnc.bandit.Bandit 5.2.0 | 1 | 7% | 2 |
| stelo.PatternRobot 1.0 | 1 | 7% | 1 |

Posture (Hadur's M records, 35 rounds): 27384 melee ticks, 8320 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 31 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 10069 sent, 9229 reached their opponent, 1524 virtual hits (16.5% of those reached).

## Melee bench: F03

hadur117.Hadur 3.19gr against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3766713. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 19 over 1 battles (19.0 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.1 | 26 / 35 | 1.80 | 20.3% | 6246 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gr | 1.0 | 20.3% | 26 |
| radnor.DoctorBob 1.42 | 2.0 | 14.2% | 3 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.0% | 2 |
| vuen.Cake 2.51 | 4.0 | 12.3% | 3 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 1 |
| adt.Ar1 2.1 | 6.0 | 9.0% | 0 |
| oa.weak.FlyMk1 0.1 | 7.0 | 5.9% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.0 | 5.8% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.1 | 26 / 35 | 6246 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 12 | 92% |
| vuen.Cake 2.51 | 11 | 91% |
| kawigi.nano.Lib 1.0 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 9 of 35 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 4 | 44% | 14 |
| vuen.Cake 2.51 | 1 | 11% | 10 |
| kawigi.nano.Lib 1.0 | 1 | 11% | 5 |
| adt.Ar1 2.1 | 1 | 11% | 1 |
| urdos.URDOS 1.3 | 1 | 11% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 11% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 35 rounds): 22009 melee ticks, 5995 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 24 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 6629 sent, 5821 reached their opponent, 1449 virtual hits (24.9% of those reached).

## Melee bench: F04

hadur117.Hadur 3.19gr against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3737690. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 17 over 1 battles (17.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.1 | 7 / 35 | 2.43 | 17.3% | 5296 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 21.5% | 23 |
| hadur117.Hadur 3.19gr | 2.0 | 17.3% | 7 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 14.1% | 2 |
| TNT.TNT 0.99.1 | 4.0 | 11.4% | 2 |
| josago.Jorgito 0.16 | 5.0 | 9.4% | 1 |
| css.Delitioner 0.11 | 6.0 | 7.9% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 7.2% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.1% | 0 |
| spin.Bugstard 0.012b | 9.0 | 3.1% | 0 |
| sp.Nanos.Ember 1.1 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.9 | 84.1 | 7 / 35 | 5296 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 20 | 30% |
| TNT.TNT 0.99.1 | 2 | 0% |
| apc.LeeroyJenkins2 1.0 | 2 | 50% |

Hadur died in 28 of 35 rounds, at a mean tick of 1270. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 17 | 61% | 23 |
| apc.LeeroyJenkins2 1.0 | 5 | 18% | 6 |
| TNT.TNT 0.99.1 | 4 | 14% | 4 |
| josago.Jorgito 0.16 | 2 | 7% | 2 |

Posture (Hadur's M records, 35 rounds): 32533 melee ticks, 12416 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 55 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 1.

Targeting waves (35 rounds): 10186 sent, 9347 reached their opponent, 1348 virtual hits (14.4% of those reached).

## Melee bench: F05

hadur117.Hadur 3.19gr against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3750591. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 1 battles (6.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 76.8 | 6 / 35 | 3.09 | 14.9% | 3854 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.3% | 17 |
| justin.DemonicRage 3.4 | 2.0 | 17.1% | 10 |
| hadur117.Hadur 3.19gr | 3.0 | 14.9% | 6 |
| wompi.Numbat 2.1 | 4.0 | 12.9% | 1 |
| axeBots.HataMoto 3.09 | 5.0 | 9.8% | 1 |
| ms.Ares 0.19 | 6.0 | 8.7% | 0 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.5% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 4.9% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.2% | 0 |
| GarmBox.Oranges 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.1 | 76.8 | 6 / 35 | 3854 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 6 | 17% |
| wompi.Numbat 2.1 | 4 | 100% |
| justin.DemonicRage 3.4 | 3 | 0% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 29 of 35 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 13 | 45% | 13 |
| cb.fire.Firestarter 2.0f | 9 | 31% | 10 |
| ms.Ares 0.19 | 5 | 17% | 5 |
| axeBots.HataMoto 3.09 | 1 | 3% | 3 |
| supersample.SuperBoxBot 1.0 | 1 | 3% | 2 |
| wompi.Numbat 2.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 35 rounds): 26591 melee ticks, 5387 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 42 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 8252 sent, 7391 reached their opponent, 1188 virtual hits (16.1% of those reached).

## Melee bench: F06

hadur117.Hadur 3.19gr against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=4015502. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 7 over 1 battles (7.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.7 | 25 / 35 | 1.66 | 20.6% | 5506 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gr | 1.0 | 20.6% | 25 |
| jekl.StoneGhost 0.7 | 2.0 | 14.3% | 2 |
| origin.SleepSiphon 1.7b | 3.0 | 12.8% | 8 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.7% | 0 |
| mld.Wisdom 1.0 | 5.0 | 11.1% | 0 |
| gg.Wolverine 2.0 | 6.0 | 8.1% | 0 |
| DBall.NUKE 0.1 | 7.0 | 6.9% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 6.2% | 0 |
| spinnercat.Omen 1.0 | 9.0 | 4.9% | 0 |
| sample.Fire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.7 | 25 / 35 | 5506 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 10 | 80% |
| origin.SleepSiphon 1.7b | 8 | 63% |
| pe.minimelee.SandboxMiniMelee 1.1 | 7 | 100% |
| gg.Wolverine 2.0 | 2 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 100% |
| mld.Wisdom 1.0 | 1 | 100% |

Hadur died in 10 of 35 rounds, at a mean tick of 1041. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 6 | 60% | 12 |
| jekl.StoneGhost 0.7 | 3 | 30% | 11 |
| DBall.NUKE 0.1 | 1 | 10% | 1 |
| pe.minimelee.SandboxMiniMelee 1.1 | 0 | 0% | 5 |
| mld.Wisdom 1.0 | 0 | 0% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 0 | 0% | 3 |

Posture (Hadur's M records, 35 rounds): 24936 melee ticks, 10184 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 23 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 23 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 7947 sent, 7117 reached their opponent, 1460 virtual hits (20.5% of those reached).

## Melee bench: F07

hadur117.Hadur 3.19gr against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3616521. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 12 over 1 battles (12.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 93.0 | 22 / 35 | 1.63 | 20.7% | 6297 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gr | 1.0 | 20.7% | 22 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 16.7% | 5 |
| rtk.Tachikoma 1.0 | 3.0 | 15.0% | 4 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.8% | 2 |
| franzor.Lizt 1.3.1 | 5.0 | 10.3% | 2 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.7% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 8.0% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.2% | 0 |
| sample.Target 1.0 | 9.0 | 1.8% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 93.0 | 22 / 35 | 6297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 12 | 83% |
| oog.melee.CapuletDroid 1.1 | 7 | 86% |
| rsalesc.melee.Monk 0.3.6c | 7 | 43% |
| franzor.Lizt 1.3.1 | 4 | 75% |

Hadur died in 13 of 35 rounds, at a mean tick of 1369. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 6 | 46% | 14 |
| rtk.Tachikoma 1.0 | 4 | 31% | 14 |
| oog.melee.CapuletDroid 1.1 | 2 | 15% | 7 |
| franzor.Lizt 1.3.1 | 1 | 8% | 0 |

Posture (Hadur's M records, 35 rounds): 32074 melee ticks, 14949 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 54 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 1.

Targeting waves (35 rounds): 9701 sent, 8871 reached their opponent, 1780 virtual hits (20.1% of those reached).

## Melee bench: F08

hadur117.Hadur 3.19gr against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3567334. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 36 over 1 battles (36.0 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.2 | 19 / 35 | 1.89 | 19.5% | 5252 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gr | 1.0 | 19.5% | 19 |
| tm.Yuugao 1.0 | 2.0 | 13.9% | 5 |
| shrub.Vapour v159 | 3.0 | 13.3% | 6 |
| com.spp.robocode.MostlyHarmless 010 | 4.0 | 10.0% | 1 |
| Krabb.sliNk.Garm 0.9u | 5.0 | 9.9% | 3 |
| m3thos.Eva00 1.1 | 6.0 | 8.9% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.5% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 7.2% | 0 |
| SHAM.WOW 1.4 | 9.0 | 5.2% | 0 |
| zyx.nano.BacillusComma 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 90.2 | 19 / 35 | 5252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 7 | 57% |
| Krabb.sliNk.Garm 0.9u | 6 | 67% |
| com.spp.robocode.MostlyHarmless 010 | 4 | 100% |
| shrub.Vapour v159 | 4 | 50% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| m3thos.Eva00 1.1 | 1 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 16 of 35 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 6 | 38% | 9 |
| Krabb.sliNk.Garm 0.9u | 4 | 25% | 6 |
| tm.Yuugao 1.0 | 3 | 19% | 10 |
| com.spp.robocode.MostlyHarmless 010 | 2 | 13% | 5 |
| m3thos.Eva00 1.1 | 1 | 6% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 0 | 0% | 2 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 1 |
| SHAM.WOW 1.4 | 0 | 0% | 1 |

Posture (Hadur's M records, 35 rounds): 27633 melee ticks, 5301 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 34 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 8876 sent, 8024 reached their opponent, 1544 virtual hits (19.2% of those reached).

