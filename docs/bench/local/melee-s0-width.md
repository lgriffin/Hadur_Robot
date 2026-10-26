# Bench suite: melee-census-317-width.txt

## Melee bench: F01

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 294 over 2 battles (147.0 per battle, most in one battle 198). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 85.1 | 20 / 70 | 2.34 | 16.9% | 9547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.7% | 43 |
| hadur2.Hadur 3.17.1bb | 2.0 | 16.9% | 20 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.5 | 11.9% | 0 |
| sgp.JollyNinja 3.53 | 3.5 | 12.0% | 6 |
| mz.MicroGodMelee 1 | 5.0 | 10.7% | 1 |
| lorneswork.Predator 1.0 | 6.0 | 8.7% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.4% | 0 |
| skm.butterfly 1.0 | 8.0 | 5.4% | 0 |
| adt.Ar2 1.0 | 8.0 | 6.0% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 81.3 | 7 / 35 | 4646 |
| 2 | 2 | 67.8 | 88.9 | 13 / 35 | 4901 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 35 | 11% |
| sgp.JollyNinja 3.53 | 6 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 100% |
| mz.MicroGodMelee 1 | 4 | 75% |
| skm.butterfly 1.0 | 1 | 100% |
| lorneswork.Predator 1.0 | 1 | 100% |

Hadur died in 53 of 70 rounds, at a mean tick of 1198. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 37 | 70% | 44 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 8% | 8 |
| sgp.JollyNinja 3.53 | 3 | 6% | 7 |
| mz.MicroGodMelee 1 | 3 | 6% | 4 |
| skm.butterfly 1.0 | 2 | 4% | 2 |
| lorneswork.Predator 1.0 | 1 | 2% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 69 rounds): 51007 melee ticks, 27461 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 49 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 16254 sent, 14749 reached their opponent, 3259 virtual hits (22.1% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 280 over 2 battles (140.0 per battle, most in one battle 198). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 83.0 | 26 / 70 | 2.53 | 17.2% | 8600 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 17.2% | 26 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 15.0% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 3.5 | 12.0% | 1 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.5 | 13.1% | 12 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 10.0% | 2 |
| Noran.BitchingElk 0.054 | 7.0 | 8.3% | 2 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.5% | 1 |
| sch.Simone 0.3d | 7.0 | 7.7% | 4 |
| stelo.PatternRobot 1.0 | 9.0 | 4.8% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 88.6 | 18 / 35 | 4776 |
| 2 | 1 | 63.5 | 77.5 | 8 / 35 | 3824 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 20 | 40% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 13 | 46% |
| sch.Simone 0.3d | 4 | 100% |
| Noran.BitchingElk 0.054 | 3 | 33% |
| com.cohesiva.robocode.ManOwaR 1.0 | 3 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 2 | 50% |
| fnc.bandit.Bandit 5.2.0 | 2 | 50% |
| fullsail.SweetTea 1.1 | 1 | 100% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 47 of 70 rounds, at a mean tick of 995. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 19 | 40% | 26 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 11 | 23% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 6 | 13% | 9 |
| com.cohesiva.robocode.ManOwaR 1.0 | 2 | 4% | 6 |
| sch.Simone 0.3d | 2 | 4% | 5 |
| Noran.BitchingElk 0.054 | 2 | 4% | 3 |
| fnc.bandit.Bandit 5.2.0 | 1 | 2% | 2 |
| stelo.PatternRobot 1.0 | 1 | 2% | 1 |
| fullsail.SweetTea 1.1 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 70 rounds): 59528 melee ticks, 12459 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 41 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 20787 sent, 19242 reached their opponent, 3520 virtual hits (18.3% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 164 over 2 battles (82.0 per battle, most in one battle 83). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 95.1 | 59 / 70 | 1.44 | 20.9% | 12134 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 20.9% | 59 |
| vuen.Cake 2.51 | 2.5 | 13.4% | 4 |
| radnor.DoctorBob 1.42 | 2.5 | 13.4% | 3 |
| kawigi.nano.Lib 1.0 | 4.0 | 11.7% | 3 |
| urdos.URDOS 1.3 | 5.0 | 9.8% | 1 |
| adt.Ar1 2.1 | 6.0 | 7.2% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.9% | 0 |
| oa.weak.FlyMk1 0.1 | 8.0 | 5.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 6.0% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 98.1 | 32 / 35 | 6369 |
| 2 | 1 | 70.0 | 92.1 | 27 / 35 | 5765 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 28 | 96% |
| radnor.DoctorBob 1.42 | 21 | 100% |
| kawigi.nano.Lib 1.0 | 10 | 90% |
| urdos.URDOS 1.3 | 2 | 100% |

Hadur died in 13 of 70 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| urdos.URDOS 1.3 | 3 | 23% | 8 |
| vuen.Cake 2.51 | 2 | 15% | 26 |
| kawigi.nano.Lib 1.0 | 2 | 15% | 10 |
| radnor.DoctorBob 1.42 | 1 | 8% | 20 |
| oa.weak.FlyMk1 0.1 | 1 | 8% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 8% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 8% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 70 rounds): 46534 melee ticks, 14164 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 34 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 14330 sent, 12801 reached their opponent, 3490 virtual hits (27.3% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 184 over 2 battles (92.0 per battle, most in one battle 94). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 83.8 | 7 / 70 | 2.46 | 16.3% | 9363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.3% | 52 |
| hadur2.Hadur 3.17.1bb | 2.0 | 16.3% | 7 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.6% | 6 |
| TNT.TNT 0.99.1 | 4.0 | 11.7% | 4 |
| josago.Jorgito 0.16 | 5.0 | 9.1% | 0 |
| css.Delitioner 0.11 | 6.0 | 7.7% | 1 |
| tj.zombie1n 1.0.1 | 7.0 | 6.4% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 3.8% | 0 |
| spin.Bugstard 0.012b | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 84.1 | 3 / 35 | 4724 |
| 2 | 2 | 66.3 | 83.5 | 4 / 35 | 4639 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 35 | 3% |
| TNT.TNT 0.99.1 | 5 | 60% |
| apc.LeeroyJenkins2 1.0 | 3 | 33% |
| tj.zombie1n 1.0.1 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 65 of 70 rounds, at a mean tick of 1305. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 43 | 66% | 45 |
| apc.LeeroyJenkins2 1.0 | 10 | 15% | 10 |
| TNT.TNT 0.99.1 | 5 | 8% | 8 |
| josago.Jorgito 0.16 | 4 | 6% | 5 |
| css.Delitioner 0.11 | 1 | 2% | 1 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 69 rounds): 70075 melee ticks, 20564 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 80 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 21824 sent, 20330 reached their opponent, 3181 virtual hits (15.6% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 99 over 2 battles (49.5 per battle, most in one battle 94). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 75.9 | 6 / 70 | 3.17 | 14.2% | 6941 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.5 | 17.7% | 34 |
| justin.DemonicRage 3.4 | 1.5 | 17.4% | 20 |
| hadur2.Hadur 3.17.1bb | 3.0 | 14.2% | 6 |
| wompi.Numbat 2.1 | 4.0 | 12.6% | 5 |
| ms.Ares 0.19 | 5.0 | 10.0% | 2 |
| axeBots.HataMoto 3.09 | 6.0 | 9.2% | 3 |
| supersample.SuperBoxBot 1.0 | 7.0 | 5.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.1% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.0% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.0 | 82.2 | 6 / 35 | 3702 |
| 2 | 3 | 59.6 | 69.5 | 0 / 35 | 3239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 14 | 21% |
| cb.fire.Firestarter 2.0f | 13 | 0% |
| wompi.Numbat 2.1 | 3 | 67% |
| axeBots.HataMoto 3.09 | 3 | 33% |

Hadur died in 65 of 70 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 22 | 34% | 24 |
| cb.fire.Firestarter 2.0f | 20 | 31% | 20 |
| wompi.Numbat 2.1 | 9 | 14% | 10 |
| axeBots.HataMoto 3.09 | 5 | 8% | 7 |
| ms.Ares 0.19 | 4 | 6% | 4 |
| supersample.SuperBoxBot 1.0 | 2 | 3% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 2% | 1 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 69 rounds): 53348 melee ticks, 8490 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 71 ticks (69 rounds over 8); rounds whose longest gap at any count was over 8: 69; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 16682 sent, 15198 reached their opponent, 2720 virtual hits (17.9% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1bb against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 271 over 2 battles (135.5 per battle, most in one battle 187). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 78.7 | 35 / 70 | 2.91 | 16.6% | 8733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1bb | 1.0 | 16.6% | 35 |
| origin.SleepSiphon 1.7b | 2.5 | 14.7% | 19 |
| jekl.StoneGhost 0.7 | 2.5 | 14.9% | 5 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.2% | 9 |
| mld.Wisdom 1.0 | 5.0 | 9.3% | 0 |
| gg.Wolverine 2.0 | 6.0 | 8.4% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.9% | 1 |
| DBall.NUKE 0.1 | 8.0 | 6.6% | 1 |
| spinnercat.Omen 1.0 | 8.5 | 6.7% | 0 |
| sample.Fire 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 75.6 | 18 / 35 | 4210 |
| 2 | 1 | 66.4 | 81.9 | 17 / 35 | 4523 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 14 | 93% |
| origin.SleepSiphon 1.7b | 12 | 75% |
| pe.minimelee.SandboxMiniMelee 1.1 | 10 | 70% |
| gg.Wolverine 2.0 | 2 | 100% |
| mld.Wisdom 1.0 | 2 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 50% |
| spinnercat.Omen 1.0 | 1 | 100% |
| DBall.NUKE 0.1 | 1 | 0% |

Hadur died in 39 of 70 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 9 | 23% | 24 |
| jekl.StoneGhost 0.7 | 8 | 21% | 18 |
| pe.minimelee.SandboxMiniMelee 1.1 | 7 | 18% | 11 |
| mld.Wisdom 1.0 | 3 | 8% | 7 |
| gg.Wolverine 2.0 | 3 | 8% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 5% | 3 |
| DBall.NUKE 0.1 | 2 | 5% | 2 |
| spinnercat.Omen 1.0 | 1 | 3% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 69 rounds): 44114 melee ticks, 12975 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (69 rounds): longest scan gap while four or more were alive 41 ticks (68 rounds over 8); rounds whose longest gap at any count was over 8: 68; robots dropped as dead without a death event: 0.

Targeting waves (69 rounds): 14509 sent, 13080 reached their opponent, 3225 virtual hits (24.7% of those reached).

